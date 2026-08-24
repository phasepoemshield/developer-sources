#!/usr/bin/env python3
"""Conservatively match Rain 1.21.11 classes against the older named Rain jar."""

from __future__ import annotations

import argparse
import collections
import csv
import math
import re
import struct
import zipfile
from dataclasses import dataclass
from pathlib import Path


class Reader:
    def __init__(self, data: bytes):
        self.data = data
        self.pos = 0

    def u1(self):
        value = self.data[self.pos]
        self.pos += 1
        return value

    def u2(self):
        value = struct.unpack_from(">H", self.data, self.pos)[0]
        self.pos += 2
        return value

    def u4(self):
        value = struct.unpack_from(">I", self.data, self.pos)[0]
        self.pos += 4
        return value

    def take(self, size):
        value = self.data[self.pos : self.pos + size]
        self.pos += size
        return value


@dataclass
class Fingerprint:
    name: str
    strings: set[str]
    methods: set[str]
    fields: set[str]
    method_count: int
    field_count: int


ARABIC = re.compile(r"[\u0600-\u06ff]")
GENERIC_METHODS = {
    "<init>", "<clinit>", "equals", "hashCode", "toString", "getClass", "clone",
    "compareTo", "iterator", "invoke", "run", "accept", "apply", "test", "get",
    "set", "add", "remove", "contains", "size", "clear", "close", "copy",
    "component1", "component2", "component3", "component4", "component5",
}
GENERIC_FIELDS = {"INSTANCE", "Companion", "$stable", "serialVersionUID"}


def informative_string(value: str) -> bool:
    if len(value) < 4 or len(value) > 240:
        return False
    if value.startswith(("(", "L", "[")) and (";" in value or "/" in value):
        return False
    if value.endswith((".class", ".java", ".kt")):
        return False
    if value in {"Code", "LineNumberTable", "LocalVariableTable", "SourceFile", "heavy"}:
        return False
    if ARABIC.search(value) and len(value) < 16:
        return False
    return any(ch.isalnum() for ch in value)


def parse_class(data: bytes, fallback_name: str) -> Fingerprint:
    r = Reader(data)
    if r.u4() != 0xCAFEBABE:
        raise ValueError("bad class")
    r.u2(); r.u2()
    cp: list[object | None] = [None] * r.u2()
    string_indices = []
    index = 1
    while index < len(cp):
        tag = r.u1()
        if tag == 1:
            cp[index] = r.take(r.u2()).decode("utf-8", "replace")
        elif tag in (3, 4):
            r.take(4)
        elif tag in (5, 6):
            r.take(8); index += 1
        elif tag in (7, 16, 19, 20):
            cp[index] = (tag, r.u2())
        elif tag == 8:
            target = r.u2()
            cp[index] = (tag, target)
            string_indices.append(target)
        elif tag in (9, 10, 11, 12, 17, 18):
            r.take(4)
        elif tag == 15:
            r.take(3)
        else:
            raise ValueError(f"constant pool tag {tag}")
        index += 1

    def utf8(i):
        return cp[i] if isinstance(cp[i], str) else ""

    def skip_attrs(count):
        for _ in range(count):
            r.u2(); r.take(r.u4())

    r.u2(); r.u2(); r.u2()
    for _ in range(r.u2()): r.u2()
    fields = []
    for _ in range(r.u2()):
        r.u2(); fields.append(utf8(r.u2())); r.u2(); skip_attrs(r.u2())
    methods = []
    for _ in range(r.u2()):
        r.u2(); methods.append(utf8(r.u2())); r.u2(); skip_attrs(r.u2())

    return Fingerprint(
        name=fallback_name,
        strings={utf8(i) for i in string_indices if informative_string(utf8(i))},
        methods={name for name in methods if name not in GENERIC_METHODS and not ARABIC.search(name) and "$lambda" not in name and not name.startswith("access$")},
        fields={name for name in fields if name not in GENERIC_FIELDS and not ARABIC.search(name)},
        method_count=len(methods),
        field_count=len(fields),
    )


def load_jar(path: Path, prefix: str) -> dict[str, Fingerprint]:
    result = {}
    with zipfile.ZipFile(path) as jar:
        for entry in jar.infolist():
            if not entry.filename.startswith(prefix) or not entry.filename.endswith(".class"):
                continue
            if entry.filename.startswith("META-INF/versions/") or "/mixin/" in entry.filename:
                continue
            name = entry.filename[:-6]
            result[name] = parse_class(jar.read(entry), name)
    return result


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--old", type=Path, required=True)
    parser.add_argument("--new", type=Path, required=True)
    parser.add_argument("--known", type=Path, required=True)
    parser.add_argument("--mapping", type=Path, required=True)
    parser.add_argument("--candidates", type=Path, required=True)
    parser.add_argument("--summary", type=Path, required=True)
    args = parser.parse_args()

    old = load_jar(args.old, "kotakbaz/rain/")
    new = load_jar(args.new, "oxxxde/")
    known_actual = set()
    known_logical = set()
    for line in args.known.read_text(encoding="utf-8").splitlines():
        if not line or line.startswith("#"):
            continue
        actual, logical, *_ = line.split("\t")
        known_actual.add(actual)
        known_logical.add(logical)

    all_fingerprints = list(old.values()) + list(new.values())
    string_df = collections.Counter(s for fp in all_fingerprints for s in fp.strings)
    method_df = collections.Counter(s for fp in all_fingerprints for s in fp.methods)
    field_df = collections.Counter(s for fp in all_fingerprints for s in fp.fields)
    total = len(all_fingerprints)

    def weight(counter, token):
        return 1.0 + math.log2((total + 1) / (counter[token] + 1))

    rows = []
    accepted = []
    for actual_name, actual in sorted(new.items()):
        if actual_name in known_actual:
            continue
        scores = []
        for logical_name, logical in old.items():
            if logical_name in known_logical:
                continue
            shared_strings = actual.strings & logical.strings
            shared_methods = actual.methods & logical.methods
            shared_fields = actual.fields & logical.fields
            string_score = sum(weight(string_df, item) for item in shared_strings) * 7.0
            method_score = sum(weight(method_df, item) for item in shared_methods) * 1.8
            field_score = sum(weight(field_df, item) for item in shared_fields) * 1.4
            penalty = abs(actual.method_count - logical.method_count) * 0.45 + abs(actual.field_count - logical.field_count) * 0.35
            score = string_score + method_score + field_score - penalty
            scores.append((score, logical_name, shared_strings, shared_methods, shared_fields))
        scores.sort(reverse=True, key=lambda item: item[0])
        if not scores:
            continue
        best = scores[0]
        second_score = scores[1][0] if len(scores) > 1 else 0.0
        margin = best[0] - second_score
        status = "candidate"
        # Require direct string evidence, a strong score, and separation from the runner-up.
        if best[2] and best[0] >= 38.0 and margin >= 12.0:
            status = "accepted"
            accepted.append((actual_name, best[1], best[0], margin, len(best[2])))
            known_logical.add(best[1])
        rows.append((
            actual_name, best[1], f"{best[0]:.2f}", f"{margin:.2f}", status,
            " | ".join(sorted(best[2])[:12]),
            " | ".join(sorted(best[3])[:12]),
            " | ".join(sorted(best[4])[:12]),
        ))

    # Eliminate logical collisions created by greedy ordering, though they should be rare.
    logical_counts = collections.Counter(item[1] for item in accepted)
    accepted = [item for item in accepted if logical_counts[item[1]] == 1]

    with args.mapping.open("w", encoding="utf-8") as out:
        out.write("# physical_name\trecovered_original_name\tscore\tmargin\tshared_strings\n")
        for actual, logical, score, margin, shared_count in accepted:
            out.write(f"{actual}\t{logical}\t{score:.2f}\t{margin:.2f}\t{shared_count}\n")
    with args.candidates.open("w", encoding="utf-8", newline="") as out:
        writer = csv.writer(out)
        writer.writerow(["physical_name", "best_old_name", "score", "margin", "status", "shared_strings", "shared_methods", "shared_fields"])
        writer.writerows(rows)
    with args.summary.open("w", encoding="utf-8") as out:
        out.write("# Older Rain structural name recovery\n\n")
        out.write(f"- Old named non-mixin classes: {len(old)}\n")
        out.write(f"- New obfuscated core classes: {len(new)}\n")
        out.write(f"- Names already recovered from Kotlin metadata: {len(known_actual)}\n")
        out.write(f"- Additional conservative structural matches: {len(accepted)}\n\n")
        out.write("Matches require shared literal strings, a high weighted score, and a clear margin over the second candidate.\n")
    print(f"old={len(old)} new={len(new)} known={len(known_actual)} accepted={len(accepted)}")


if __name__ == "__main__":
    main()
