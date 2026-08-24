#!/usr/bin/env python3
"""Append recovered Rain class names to the official Yarn Tiny v2 mapping."""

from __future__ import annotations

import argparse
import zipfile
from pathlib import Path


def read_map(path: Path):
    result = []
    for line in path.read_text(encoding="utf-8").splitlines():
        if not line or line.startswith("#"):
            continue
        source, target, *_ = line.split("\t")
        result.append((source, target, path.name))
    return result


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--yarn", type=Path, required=True)
    parser.add_argument("--jar", type=Path, required=True)
    parser.add_argument("--map", type=Path, action="append", required=True)
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--combined", type=Path, required=True)
    args = parser.parse_args()

    with zipfile.ZipFile(args.jar) as jar:
        existing = {name[:-6] for name in jar.namelist() if name.endswith(".class")}

    candidates = []
    for path in args.map:
        candidates.extend(read_map(path))

    source_targets = {}
    target_sources = {}
    accepted = []
    rejected = []
    for source, target, origin in candidates:
        reason = ""
        if source not in existing:
            reason = "source_missing"
        elif target in existing and target != source:
            reason = "target_already_exists"
        elif source in source_targets and source_targets[source] != target:
            reason = "source_conflict"
        elif target in target_sources and target_sources[target] != source:
            reason = "target_conflict"
        if reason:
            rejected.append((source, target, origin, reason))
            continue
        source_targets[source] = target
        target_sources[target] = source
        accepted.append((source, target, origin))

    yarn_text = args.yarn.read_text(encoding="utf-8")
    if not yarn_text.startswith("tiny\t2\t0\tintermediary\tnamed"):
        raise SystemExit("unexpected Yarn mapping header")
    with args.output.open("w", encoding="utf-8") as out:
        out.write(yarn_text)
        if not yarn_text.endswith("\n"):
            out.write("\n")
        for source, target, _origin in sorted(accepted):
            out.write(f"c\t{source}\t{target}\n")

    with args.combined.open("w", encoding="utf-8") as out:
        out.write("# physical_name\trecovered_original_name\torigin\tstatus\n")
        for source, target, origin in sorted(accepted):
            out.write(f"{source}\t{target}\t{origin}\taccepted\n")
        for source, target, origin, reason in sorted(rejected):
            out.write(f"{source}\t{target}\t{origin}\trejected:{reason}\n")
    print(f"accepted={len(accepted)} rejected={len(rejected)}")


if __name__ == "__main__":
    main()
