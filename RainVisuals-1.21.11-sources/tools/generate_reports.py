#!/usr/bin/env python3
"""Generate reproducible coverage and integrity reports for recovered Rain sources."""

from __future__ import annotations

import csv
import hashlib
import json
import re
import zipfile
from collections import Counter
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
ORIGINAL = ROOT / "reference/original/rain.jar"
NAMED = ROOT / "reference/rain-yarn-named.jar"
READABLE = ROOT / "reference/rain-yarn-readable.jar"
REPORTS = ROOT / "reports"
OWNED_PREFIXES = (
    "oxxxde/", "kotakbaz/rain/", "rainpatch/", "sweetie/rain/",
    "melancholia/", "eu/donyka/discord/", "dev/redstones/mediaplayerinfo/",
    "net/minecraft/client/render/RainRenderLayers",
)


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def source_files(path: Path):
    return [p for p in path.rglob("*") if p.suffix in (".kt", ".java")]


def source_exists(class_name: str) -> bool:
    top_level = class_name.split("$", 1)[0]
    for source_root in (ROOT / "src/recovered-kotlin", ROOT / "src/recovered-java"):
        if any(
            candidate.exists()
            for candidate in (
                source_root / f"{class_name}.kt",
                source_root / f"{class_name}.java",
                source_root / f"{top_level}.kt",
                source_root / f"{top_level}.java",
            )
        ):
            return True
    return False


def main():
    REPORTS.mkdir(exist_ok=True)
    with zipfile.ZipFile(ORIGINAL) as jar:
        original_entries = [name for name in jar.namelist() if not name.endswith("/")]
        original_classes = [name[:-6] for name in original_entries if name.endswith(".class")]
        original_resources = [name for name in original_entries if not name.endswith(".class")]
        mixin_config = json.loads(jar.read("rain.mixins.json"))
    with zipfile.ZipFile(READABLE) as jar:
        readable_classes = [name[:-6] for name in jar.namelist() if name.endswith(".class") and not name.startswith("META-INF/versions/")]

    custom_classes = [name for name in readable_classes if name.startswith(OWNED_PREFIXES)]
    covered = [name for name in custom_classes if source_exists(name)]
    uncovered = [name for name in custom_classes if not source_exists(name)]
    kotlin_sources = source_files(ROOT / "src/recovered-kotlin")
    java_sources = source_files(ROOT / "src/recovered-java")
    vf_errors = (ROOT / "reports/vineflower_readable_stderr.log").read_text(encoding="utf-8", errors="replace").splitlines()
    cfr_errors = (ROOT / "reports/cfr_stderr.log").read_text(encoding="utf-8", errors="replace").splitlines()
    decompiler_failure_markers = 0
    for path in kotlin_sources + java_sources:
        text = path.read_text(encoding="utf-8", errors="replace")
        decompiler_failure_markers += text.count("Couldn't be decompiled")

    mapping_rows = []
    for line in (REPORTS / "COMBINED_CLASS_MAP.tsv").read_text(encoding="utf-8").splitlines():
        if line and not line.startswith("#"):
            mapping_rows.append(line.split("\t"))
    kotlin_names = sum(row[2] == "kotlin-class-map.tsv" and row[3] == "accepted" for row in mapping_rows)
    structural_names = sum(row[2] == "structural-class-map.tsv" and row[3] == "accepted" for row in mapping_rows)

    mixins = list(mixin_config.get("mixins", [])) + list(mixin_config.get("client", [])) + list(mixin_config.get("server", []))
    mixin_package = mixin_config["package"].replace(".", "/")
    mixin_rows = []
    for mixin in mixins:
        class_name = f"{mixin_package}/{mixin.replace('.', '/') }"
        mixin_rows.append((mixin, class_name in readable_classes, source_exists(class_name)))

    package_counts = Counter()
    for class_name in readable_classes:
        top = class_name.split("/", 1)[0]
        package_counts[top] += 1
    with (REPORTS / "PACKAGE_COUNTS.csv").open("w", encoding="utf-8", newline="") as out:
        writer = csv.writer(out)
        writer.writerow(["top_level_package", "class_entries"])
        writer.writerows(package_counts.most_common())

    url_pattern = re.compile(r"https?://[^\s\"'<>\\)]+")
    endpoint_rows = set()
    for path in kotlin_sources + java_sources:
        text = path.read_text(encoding="utf-8", errors="replace")
        for url in url_pattern.findall(text):
            endpoint_rows.add((str(path.relative_to(ROOT)), url.rstrip(".,;")))
    with (REPORTS / "NETWORK_ENDPOINTS.csv").open("w", encoding="utf-8", newline="") as out:
        writer = csv.writer(out)
        writer.writerow(["source_file", "literal_url", "classification"])
        for path, url in sorted(endpoint_rows):
            writer.writerow([path, url, "static literal; not contacted during recovery"])

    (REPORTS / "CLASS_COVERAGE.md").write_text(
        "# Recovered class coverage\n\n"
        f"- Original class entries (including multi-release variants): {len(original_classes)}\n"
        f"- Primary readable class entries: {len(readable_classes)}\n"
        f"- Rain/custom and bundled integration class entries: {len(custom_classes)}\n"
        f"- Entries represented by a recovered top-level source file: {len(covered)}\n"
        f"- Entries without a recovered top-level source file: {len(uncovered)}\n"
        f"- Vineflower owned/integration source files: {len(kotlin_sources)}\n"
        f"- CFR owned/integration source files: {len(java_sources)}\n\n"
        "Inner classes are counted as class entries but normally share their enclosing source file.\n"
        + ("\n## Uncovered entries\n\n" + "\n".join(f"- `{name}`" for name in uncovered) + "\n" if uncovered else ""),
        encoding="utf-8",
    )

    mixin_lines = [
        "# Mixin recovery",
        "",
        f"Configured mixins: {len(mixin_rows)}",
        "",
        "| Mixin | Class present | Source present |",
        "|---|---:|---:|",
    ]
    mixin_lines.extend(f"| `{name}` | {'yes' if class_ok else 'no'} | {'yes' if source_ok else 'no'} |" for name, class_ok, source_ok in mixin_rows)
    (REPORTS / "MIXINS.md").write_text("\n".join(mixin_lines) + "\n", encoding="utf-8")

    build_log = (REPORTS / "gradle_build.log").read_text(encoding="utf-8", errors="replace")
    runtime_log_path = REPORTS / "run_client.log"
    runtime_log = runtime_log_path.read_text(encoding="utf-8", errors="replace") if runtime_log_path.exists() else ""
    minecraft_launched = (
        "Loaded textures in" in runtime_log
        and (" joined the game" in runtime_log or "Loaded custom sky shader" in runtime_log)
    )
    runtime_crashed = "Minecraft has crashed!" in runtime_log or "Game crashed!" in runtime_log
    quality = {
        "original": {
            "path": str(ORIGINAL),
            "sha256": sha256(ORIGINAL),
            "entries": len(original_entries),
            "class_entries": len(original_classes),
            "resource_entries": len(original_resources),
        },
        "readable_jar": {"sha256": sha256(READABLE), "primary_class_entries": len(readable_classes)},
        "name_recovery": {"kotlin_metadata": kotlin_names, "older_version_structural": structural_names, "accepted_total": kotlin_names + structural_names},
        "sources": {"vineflower_owned_and_integrations": len(kotlin_sources), "cfr_owned_and_integrations": len(java_sources)},
        "decompilers": {"vineflower_stderr_lines": len(vf_errors), "cfr_stderr_lines": len(cfr_errors), "failure_markers": decompiler_failure_markers},
        "mixins": {"configured": len(mixin_rows), "class_present": sum(row[1] for row in mixin_rows), "source_present": sum(row[2] for row in mixin_rows)},
        "build": {
            "successful": "BUILD SUCCESSFUL" in build_log,
            "minecraft_launched": minecraft_launched,
            "runtime_smoke_stable": minecraft_launched and not runtime_crashed,
            "warning": "Loom reported unresolved legacy/intermediary mixin mapping references; see gradle_build.log",
        },
    }
    (REPORTS / "quality_report.json").write_text(json.dumps(quality, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")

    (REPORTS / "DECOMPILATION_REPORT.md").write_text(
        "# Rain Visuals 1.21.11 decompilation report\n\n"
        f"- Original archive: {len(original_entries)} files, {len(original_classes)} class entries, {len(original_resources)} resources.\n"
        "- Minecraft symbols remapped with Yarn `1.21.11+build.6`.\n"
        f"- Custom names recovered: {kotlin_names} from Kotlin metadata + {structural_names} conservative matches against the older named Rain archive.\n"
        f"- Readable source views: {len(kotlin_sources)} Vineflower files and {len(java_sources)} CFR files for owned/integration packages.\n"
        f"- Configured mixins present as bytecode/source: {sum(row[1] for row in mixin_rows)}/{sum(row[2] for row in mixin_rows)} of {len(mixin_rows)}.\n"
        f"- Decompiler stderr: Vineflower {len(vf_errors)} lines; CFR {len(cfr_errors)} lines; explicit failure markers {decompiler_failure_markers}.\n"
        f"- Gradle/Loom static build: {'successful' if quality['build']['successful'] else 'failed'} on JDK 21. Runtime smoke: {'stable in-world launch' if quality['build']['runtime_smoke_stable'] else 'not completed or failed'}.\n\n"
        "The recovered source views are reference material and still contain synthetic/decompiler artifacts. The build uses the lossless readable bytecode and keeps text-source repair as an explicit later step.\n",
        encoding="utf-8",
    )

    hash_targets = [
        ORIGINAL, NAMED, READABLE, ROOT / "libs/rain-visuals-yarn-readable.jar",
        ROOT / "work/vineflower-1.12.0.jar", ROOT / "work/cfr-0.152.jar",
        ROOT / "libs/rain-visuals-yarn-runtime-dev.jar",
    ]
    built = sorted((ROOT / "build/libs").glob("*.jar"))
    with (REPORTS / "SHA256SUMS.txt").open("w", encoding="utf-8") as out:
        for path in hash_targets + built:
            out.write(f"{sha256(path)}  {path.relative_to(ROOT)}\n")

    print(json.dumps(quality, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    main()
