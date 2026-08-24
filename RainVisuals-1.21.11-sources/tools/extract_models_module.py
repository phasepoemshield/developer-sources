#!/usr/bin/env python3
"""Build the recovered Rain Models/Figura module reference slice."""

from __future__ import annotations

import hashlib
import shutil
import zipfile
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / "modules" / "models"
RUNTIME_JAR = ROOT / "libs" / "rain-visuals-yarn-runtime-dev.jar"

CLASSES = {
    "oxxxde/جر": "CategoryComponent: Models grid, cards, clicks and scroll",
    "oxxxde/ذي": "CategoryComponent.ModelCard state",
    "oxxxde/بز": "Models catalog adapter, search and animated cards",
    "oxxxde/ثد": "Avatar entry comparator",
    "oxxxde/دس": "Figura avatar installer and local discovery",
    "oxxxde/طن": "FiguraAvatarInstaller.AvatarEntry",
    "oxxxde/خُ": "Local avatar metadata record",
    "oxxxde/صخ": "Cosmetic selection record",
    "oxxxde/صل": "Remote Figura catalog, manifest and cache",
    "oxxxde/رق": "Rain Social API request/response HMAC signer",
    "oxxxde/ثئ": "Rain Social API origin and signing-key constants",
    "oxxxde/سد": "Remote avatar manifest record",
    "oxxxde/زإ": "Validated catalog snapshot record",
    "oxxxde/طق": "Figura apply/remove and live preview runtime",
    "oxxxde/بس": "Live preview state",
    "oxxxde/طع": "Preview preparation state enum",
    "oxxxde/خّ": "Checked render action",
    "oxxxde/شآ": "Rendered model-preview manager",
    "oxxxde/ذع": "Rendered preview surface",
    "oxxxde/سُ": "Pending preview request record",
    "oxxxde/رط": "Rendered preview disk cache",
    "oxxxde/ائ": "Off-screen Figura render target helper",
    "oxxxde/ء": "Off-screen render context record",
    "oxxxde/جّ": "Custom framebuffer used by model previews",
    "oxxxde/ظء": "Preview texture draw helper",
}

MIXINS = [
    "MixinFiguraActionWheel",
    "MixinFiguraAuthHandler",
    "MixinFiguraAvatarInput",
    "MixinFiguraCommandsFabric",
    "MixinFiguraConfigKeyBindImpl",
    "MixinFiguraConfigManager",
    "MixinFiguraGui",
    "MixinFiguraImmediateRendererPreview",
    "MixinFiguraKeybind",
    "MixinFiguraNetworkStuff",
    "MixinFiguraPopupMenu",
    "MixinFiguraRuntimeResources",
    "MixinGameRenderer",
    "MixinGuiRendererFiguraPreviewTarget",
    "MixinHeldItemRenderer",
    "MixinLivingEntityRendererFiguraPreview",
]

NAMED_SOURCES = [
    "kotakbaz/rain/client/figura/FiguraAvatarInstaller$AvatarEntry.java",
    "kotakbaz/rain/client/render/main/buffer/framebuffer/CustomFramebuffer.java",
    "kotakbaz/rain/ui/menu/CategoryComponent$ModelCard.kt",
]


def reset_directory(path: Path) -> None:
    if path.exists():
        shutil.rmtree(path)
    path.mkdir(parents=True)


def copy_sources() -> list[str]:
    source_output = OUTPUT / "src"
    reset_directory(source_output)
    copied: list[str] = []
    for flavor in ("recovered-kotlin", "recovered-java"):
        source_root = ROOT / "src" / flavor
        candidates: list[Path] = []
        for internal_name in CLASSES:
            candidates.extend((source_root / internal_name).parent.glob((source_root / internal_name).name + ".*"))
        for relative in NAMED_SOURCES:
            candidate = source_root / relative
            if candidate.is_file():
                candidates.append(candidate)
        for mixin in MIXINS:
            candidate = source_root / "kotakbaz" / "rain" / "mixin" / f"{mixin}.java"
            if candidate.is_file():
                candidates.append(candidate)
        for candidate in sorted(set(candidates)):
            relative = candidate.relative_to(ROOT / "src")
            destination = source_output / relative
            destination.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(candidate, destination)
            copied.append(destination.relative_to(OUTPUT).as_posix())

    bridge = ROOT / "tools" / "runtime-src" / "rainpatch" / "ModelsNetworkBridge.java"
    destination = source_output / "runtime-fix" / "rainpatch" / bridge.name
    destination.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(bridge, destination)
    copied.append(destination.relative_to(OUTPUT).as_posix())
    return sorted(copied)


def copy_runtime_slice() -> list[str]:
    reference = OUTPUT / "reference"
    reset_directory(reference)
    destination = reference / "models-runtime-bytecode.jar"
    prefixes = list(CLASSES) + [f"kotakbaz/rain/mixin/{name}" for name in MIXINS]
    selected: list[str] = []
    with zipfile.ZipFile(RUNTIME_JAR) as source, zipfile.ZipFile(destination, "w") as output:
        for info in source.infolist():
            name = info.filename
            class_match = name.endswith(".class") and any(
                name == prefix + ".class" or name.startswith(prefix + "$") for prefix in prefixes
            )
            supporting = name in {
                "rainpatch/ModelsNetworkBridge.class",
                "META-INF/jars/figura-1.0.3.jar",
                "rain.mixins.json",
                "fabric.mod.json",
            }
            if not (class_match or supporting):
                continue
            output.writestr(info, source.read(info))
            selected.append(name)
    return sorted(selected)


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(block)
    return digest.hexdigest()


def write_reports(sources: list[str], entries: list[str]) -> None:
    reports = OUTPUT / "reports"
    reset_directory(reports)
    class_map = ["runtime_class\trole"]
    class_map.extend(f"{name}\t{role}" for name, role in CLASSES.items())
    class_map.extend(f"kotakbaz/rain/mixin/{name}\tFigura/Models integration mixin" for name in MIXINS)
    (reports / "CLASS_MAP.tsv").write_text("\n".join(class_map) + "\n", encoding="utf-8")
    (reports / "SOURCE_FILES.txt").write_text("\n".join(sources) + "\n", encoding="utf-8")
    (reports / "BYTECODE_ENTRIES.txt").write_text("\n".join(entries) + "\n", encoding="utf-8")

    files = sorted(path for path in OUTPUT.rglob("*") if path.is_file() and path.name != "SHA256SUMS.txt")
    lines = [f"{sha256(path)}  {path.relative_to(OUTPUT).as_posix()}" for path in files]
    (reports / "SHA256SUMS.txt").write_text("\n".join(lines) + "\n", encoding="utf-8")


def main() -> None:
    if not RUNTIME_JAR.is_file():
        raise SystemExit(f"runtime JAR not found: {RUNTIME_JAR}")
    OUTPUT.mkdir(parents=True, exist_ok=True)
    sources = copy_sources()
    entries = copy_runtime_slice()
    write_reports(sources, entries)
    print(f"Models module: {len(sources)} source views, {len(entries)} bytecode/resources")


if __name__ == "__main__":
    main()
