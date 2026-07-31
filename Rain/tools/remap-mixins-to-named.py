#!/usr/bin/env python3
"""Remap leftover intermediary names in mixin class Utf8 constants using yarn tiny.

Loom remap converts many method names, but mixin @Inject/@At annotation strings often
still contain class_XXXX / method_XXXX. With defaultRequire=0 those injects fail silently.
"""
from __future__ import annotations

import argparse
import re
import struct
import zipfile
from pathlib import Path


METHOD_RE = re.compile(r"method_\d+")
FIELD_RE = re.compile(r"field_\d+")
METHOD_DESC_RE = re.compile(r"(method_\d+)(\([^)]*\))")


def load_tiny(tiny: Path):
    class_map: dict[str, str] = {}
    method_by_id_desc: dict[tuple[str, str], str] = {}
    method_by_id: dict[str, set[str]] = {}
    field_by_id: dict[str, set[str]] = {}
    current_inter_class = None

    for line in tiny.read_text(errors="replace").splitlines():
        if not line or line.startswith("tiny") or line.startswith("\t\t"):
            continue
        if line.startswith("c\t"):
            parts = line.split("\t")
            if len(parts) >= 4 and parts[3].startswith("net/minecraft/class_"):
                class_map[parts[3]] = parts[1]
            current_inter_class = parts[3] if len(parts) > 3 else None
            continue
        if line.startswith("\tm\t") and current_inter_class:
            parts = line.split("\t")
            if len(parts) >= 6 and parts[5].startswith("method_"):
                desc, named, inter = parts[2], parts[3], parts[5]
                method_by_id_desc[(inter, desc)] = named
                method_by_id.setdefault(inter, set()).add(named)
            continue
        if line.startswith("\tf\t") and current_inter_class:
            parts = line.split("\t")
            if len(parts) >= 6 and parts[5].startswith("field_"):
                named, inter = parts[3], parts[5]
                field_by_id.setdefault(inter, set()).add(named)

    class_items = sorted(class_map.items(), key=lambda kv: len(kv[0]), reverse=True)
    for (mid, desc), named in list(method_by_id_desc.items()):
        nd = desc
        for inter, n in class_items:
            nd = nd.replace(inter, n)
        method_by_id_desc[(mid, nd)] = named

    method_unique = {k: next(iter(v)) for k, v in method_by_id.items() if len(v) == 1}
    field_unique = {k: next(iter(v)) for k, v in field_by_id.items() if len(v) == 1}
    return class_items, method_by_id_desc, method_unique, field_unique


def make_remap(class_items, method_by_id_desc, method_unique, field_unique):
    def remap_string(s: str) -> str:
        for inter, named in class_items:
            if inter in s:
                s = s.replace(inter, named)

        def repl_md(m: re.Match[str]) -> str:
            mid, desc = m.group(1), m.group(2)
            key = (mid, desc)
            if key in method_by_id_desc:
                return method_by_id_desc[key] + desc
            return m.group(0)

        s = METHOD_DESC_RE.sub(repl_md, s)
        s = METHOD_RE.sub(lambda m: method_unique.get(m.group(0), m.group(0)), s)
        s = FIELD_RE.sub(lambda m: field_unique.get(m.group(0), m.group(0)), s)
        return s

    return remap_string


def rewrite_class(data: bytes, remap_string) -> tuple[bytes, int]:
    if data[:4] != b"\xca\xfe\xba\xbe":
        return data, 0
    cp_count = struct.unpack_from(">H", data, 8)[0]
    out = bytearray(data[:10])
    i = 10
    idx = 1
    changes = 0
    while idx < cp_count:
        tag = data[i]
        if tag == 1:
            ln = struct.unpack_from(">H", data, i + 1)[0]
            raw = data[i + 3 : i + 3 + ln]
            i += 3 + ln
            try:
                s = raw.decode("utf-8")
            except Exception:
                out.append(1)
                out += struct.pack(">H", ln)
                out += raw
                idx += 1
                continue
            ns = remap_string(s)
            if ns != s:
                changes += 1
                nb = ns.encode("utf-8")
                out.append(1)
                out += struct.pack(">H", len(nb))
                out += nb
            else:
                out.append(1)
                out += struct.pack(">H", ln)
                out += raw
            idx += 1
        elif tag in (7, 8, 16, 19, 20):
            out += data[i : i + 3]
            i += 3
            idx += 1
        elif tag in (3, 4):
            out += data[i : i + 5]
            i += 5
            idx += 1
        elif tag in (5, 6):
            out += data[i : i + 9]
            i += 9
            idx += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            out += data[i : i + 5]
            i += 5
            idx += 1
        elif tag == 15:
            out += data[i : i + 4]
            i += 4
            idx += 1
        else:
            raise RuntimeError(f"bad tag {tag}")
    out += data[i:]
    return bytes(out), changes


def process_jar(jar: Path, tiny: Path, mixin_prefix: str = "kotakbaz/rain/mixin/") -> None:
    class_items, method_by_id_desc, method_unique, field_unique = load_tiny(tiny)
    remap_string = make_remap(class_items, method_by_id_desc, method_unique, field_unique)

    tmp = jar.with_suffix(".tmp.jar")
    total_changes = 0
    files_changed = 0
    with zipfile.ZipFile(jar, "r") as zin, zipfile.ZipFile(tmp, "w", compression=zipfile.ZIP_DEFLATED) as zout:
        for info in zin.infolist():
            data = zin.read(info.filename)
            if info.filename.startswith(mixin_prefix) and info.filename.endswith(".class"):
                data2, ch = rewrite_class(data, remap_string)
                if ch:
                    files_changed += 1
                    total_changes += ch
                    data = data2
            zout.writestr(info, data)
    tmp.replace(jar)
    print(f"updated {files_changed} mixin classes, {total_changes} utf8 changes")


def main() -> None:
    ap = argparse.ArgumentParser()
    ap.add_argument("--jar", type=Path, default=Path("libs/rain-visuals-classes.jar"))
    ap.add_argument(
        "--tiny",
        type=Path,
        default=Path(".gradle/loom-cache/source_mappings/38d0bcf411e73c8788b470bef106486f6af558d9.tiny"),
    )
    args = ap.parse_args()
    process_jar(args.jar, args.tiny)


if __name__ == "__main__":
    main()
