#!/usr/bin/env python3
"""Recover obfuscated Rain class names from Kotlin @Metadata method descriptors.

The input jar is already mapped from Minecraft intermediary names to Yarn names.
Kotlin's d2 metadata still contains many original kotakbaz/rain descriptors even
though the JVM descriptors refer to flattened oxxxde classes.  This script pairs
the two descriptor forms by method name and records only conflict-free mappings.
"""

from __future__ import annotations

import argparse
import collections
import csv
import io
import struct
import zipfile
from dataclasses import dataclass
from pathlib import Path


class Reader:
    def __init__(self, data: bytes):
        self.data = data
        self.pos = 0

    def u1(self) -> int:
        value = self.data[self.pos]
        self.pos += 1
        return value

    def u2(self) -> int:
        value = struct.unpack_from(">H", self.data, self.pos)[0]
        self.pos += 2
        return value

    def u4(self) -> int:
        value = struct.unpack_from(">I", self.data, self.pos)[0]
        self.pos += 4
        return value

    def take(self, size: int) -> bytes:
        value = self.data[self.pos : self.pos + size]
        self.pos += size
        return value


@dataclass
class ClassInfo:
    name: str
    methods: list[tuple[str, str]]
    metadata_d2: list[str]


def parse_class(data: bytes) -> ClassInfo:
    r = Reader(data)
    if r.u4() != 0xCAFEBABE:
        raise ValueError("not a class file")
    r.u2()
    r.u2()
    cp: list[object | None] = [None] * r.u2()
    index = 1
    while index < len(cp):
        tag = r.u1()
        if tag == 1:
            raw = r.take(r.u2())
            cp[index] = raw.decode("utf-8", "replace")
        elif tag in (3, 4):
            r.take(4)
        elif tag in (5, 6):
            r.take(8)
            index += 1
        elif tag in (7, 8, 16, 19, 20):
            cp[index] = (tag, r.u2())
        elif tag in (9, 10, 11, 12, 17, 18):
            r.take(4)
        elif tag == 15:
            r.take(3)
        else:
            raise ValueError(f"unknown constant-pool tag {tag}")
        index += 1

    def utf8(cp_index: int) -> str:
        value = cp[cp_index]
        return value if isinstance(value, str) else ""

    def class_name(cp_index: int) -> str:
        value = cp[cp_index]
        if isinstance(value, tuple) and value[0] == 7:
            return utf8(value[1])
        return ""

    def skip_attributes(reader: Reader, count: int) -> None:
        for _ in range(count):
            reader.u2()
            reader.take(reader.u4())

    r.u2()
    this_class = r.u2()
    r.u2()
    for _ in range(r.u2()):
        r.u2()

    fields_count = r.u2()
    for _ in range(fields_count):
        r.u2()
        r.u2()
        r.u2()
        skip_attributes(r, r.u2())

    methods: list[tuple[str, str]] = []
    for _ in range(r.u2()):
        r.u2()
        name = utf8(r.u2())
        descriptor = utf8(r.u2())
        methods.append((name, descriptor))
        skip_attributes(r, r.u2())

    metadata_d2: list[str] = []

    def element_value(reader: Reader):
        tag = chr(reader.u1())
        if tag in "BCDFIJSZs":
            value_index = reader.u2()
            return utf8(value_index) if tag == "s" else None
        if tag == "e":
            reader.u2()
            reader.u2()
            return None
        if tag == "c":
            reader.u2()
            return None
        if tag == "@":
            return annotation(reader)
        if tag == "[":
            return [element_value(reader) for _ in range(reader.u2())]
        raise ValueError(f"unknown annotation value tag {tag!r}")

    def annotation(reader: Reader):
        annotation_type = utf8(reader.u2())
        values = {}
        for _ in range(reader.u2()):
            key = utf8(reader.u2())
            values[key] = element_value(reader)
        return annotation_type, values

    for _ in range(r.u2()):
        attribute_name = utf8(r.u2())
        payload = Reader(r.take(r.u4()))
        if attribute_name not in ("RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations"):
            continue
        for _ in range(payload.u2()):
            annotation_type, values = annotation(payload)
            if annotation_type == "Lkotlin/Metadata;":
                raw_d2 = values.get("d2", [])
                metadata_d2 = [value for value in raw_d2 if isinstance(value, str)]

    return ClassInfo(class_name(this_class), methods, metadata_d2)


def descriptor_types(descriptor: str) -> list[str]:
    """Return object/array object types in descriptor order."""
    types: list[str] = []
    index = 0
    while index < len(descriptor):
        if descriptor[index] == "L":
            end = descriptor.find(";", index)
            if end < 0:
                break
            types.append(descriptor[index + 1 : end])
            index = end + 1
        else:
            index += 1
    return types


def descriptor_shape(descriptor: str) -> str:
    result = []
    index = 0
    while index < len(descriptor):
        ch = descriptor[index]
        if ch == "L":
            end = descriptor.find(";", index)
            if end < 0:
                return descriptor
            result.append("L;")
            index = end + 1
        else:
            result.append(ch)
            index += 1
    return "".join(result)


def recover(jar_path: Path):
    evidence: dict[tuple[str, str], set[str]] = collections.defaultdict(set)
    parsed = 0
    kotlin_classes = 0
    with zipfile.ZipFile(jar_path) as jar:
        for entry in jar.infolist():
            if not entry.filename.endswith(".class") or entry.filename.startswith("META-INF/versions/"):
                continue
            info = parse_class(jar.read(entry))
            parsed += 1
            if not info.metadata_d2:
                continue
            kotlin_classes += 1
            methods_by_name: dict[str, list[str]] = collections.defaultdict(list)
            for name, descriptor in info.methods:
                methods_by_name[name].append(descriptor)

            d2 = info.metadata_d2
            for index in range(len(d2) - 1):
                method_name = d2[index]
                logical_descriptor = d2[index + 1]
                if method_name not in methods_by_name or not logical_descriptor.startswith("("):
                    continue
                candidates = [
                    actual
                    for actual in methods_by_name[method_name]
                    if descriptor_shape(actual) == descriptor_shape(logical_descriptor)
                ]
                if len(candidates) != 1:
                    continue
                actual_descriptor = candidates[0]
                actual_types = descriptor_types(actual_descriptor)
                logical_types = descriptor_types(logical_descriptor)
                if len(actual_types) != len(logical_types):
                    continue
                source = f"{info.name}#{method_name}{actual_descriptor}"
                for actual_type, logical_type in zip(actual_types, logical_types):
                    if actual_type.startswith("oxxxde/") and logical_type.startswith("kotakbaz/rain/"):
                        evidence[(actual_type, logical_type)].add(source)

    by_actual: dict[str, dict[str, set[str]]] = collections.defaultdict(dict)
    by_logical: dict[str, dict[str, set[str]]] = collections.defaultdict(dict)
    for (actual, logical), sources in evidence.items():
        by_actual[actual][logical] = sources
        by_logical[logical][actual] = sources

    accepted = []
    rejected = []
    for (actual, logical), sources in sorted(evidence.items()):
        reason = "unique"
        if len(by_actual[actual]) != 1:
            reason = "actual_has_conflicting_targets"
        elif len(by_logical[logical]) != 1:
            reason = "logical_has_conflicting_sources"
        row = (actual, logical, len(sources), reason, " | ".join(sorted(sources)))
        (accepted if reason == "unique" else rejected).append(row)
    return parsed, kotlin_classes, accepted, rejected


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("jar", type=Path)
    parser.add_argument("--mapping", type=Path, required=True)
    parser.add_argument("--evidence", type=Path, required=True)
    parser.add_argument("--summary", type=Path, required=True)
    args = parser.parse_args()

    parsed, kotlin_classes, accepted, rejected = recover(args.jar)
    args.mapping.parent.mkdir(parents=True, exist_ok=True)
    with args.mapping.open("w", encoding="utf-8") as out:
        out.write("# physical_name\trecovered_original_name\tevidence_count\n")
        for actual, logical, count, _reason, _sources in accepted:
            out.write(f"{actual}\t{logical}\t{count}\n")

    with args.evidence.open("w", encoding="utf-8", newline="") as out:
        writer = csv.writer(out)
        writer.writerow(["physical_name", "candidate_name", "evidence_count", "status", "evidence"])
        for row in accepted + rejected:
            writer.writerow(row)

    with args.summary.open("w", encoding="utf-8") as out:
        out.write("# Kotlin metadata name recovery\n\n")
        out.write(f"- Parsed class files: {parsed}\n")
        out.write(f"- Classes with Kotlin metadata: {kotlin_classes}\n")
        out.write(f"- Accepted one-to-one class mappings: {len(accepted)}\n")
        out.write(f"- Rejected conflicting candidate pairs: {len(rejected)}\n\n")
        out.write("Only one-to-one mappings inferred from matching JVM and Kotlin metadata method descriptors are accepted.\n")

    print(f"parsed={parsed} kotlin={kotlin_classes} accepted={len(accepted)} rejected={len(rejected)}")


if __name__ == "__main__":
    main()
