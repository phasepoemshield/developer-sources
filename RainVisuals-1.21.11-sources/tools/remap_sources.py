#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import re
import shutil
from collections import defaultdict
from pathlib import Path

IDENT_RE = re.compile(r'\b(?:class_\d+|method_\d+|field_\d+)\b')
TEXT_EXTS = {'.java', '.json', '.cfg', '.properties', '.txt', '.mcmeta', '.lang', '.glsl', '.fsh', '.vsh'}


def parse_tiny(path: Path):
    class_full = {}
    class_simple_candidates = defaultdict(set)
    member_candidates = defaultdict(set)
    with path.open('r', encoding='utf-8') as f:
        header = f.readline().rstrip('\n').split('\t')
        if header[:3] != ['tiny', '2', '0']:
            raise ValueError(f'Unsupported Tiny header: {header}')
        try:
            inter_idx = header.index('intermediary') - 3
            named_idx = header.index('named') - 3
        except ValueError as e:
            raise ValueError('Tiny mappings must contain intermediary and named namespaces') from e

        current_inter = current_named = None
        for raw in f:
            line = raw.rstrip('\n')
            if not line or line.startswith('#'):
                continue
            cols = line.split('\t')
            if cols[0] == 'c':
                current_inter = cols[1 + inter_idx]
                current_named = cols[1 + named_idx]
                class_full[current_inter] = current_named
                # Register every intermediary nested component against corresponding named component.
                inter_parts = current_inter.rsplit('/', 1)[-1].split('$')
                named_parts = current_named.rsplit('/', 1)[-1].split('$')
                if len(inter_parts) == len(named_parts):
                    for a, b in zip(inter_parts, named_parts):
                        if re.fullmatch(r'class_\d+', a):
                            class_simple_candidates[a].add(b)
                else:
                    a = inter_parts[-1]
                    b = named_parts[-1]
                    if re.fullmatch(r'class_\d+', a):
                        class_simple_candidates[a].add(b)
            elif cols[0] == '' and len(cols) >= 5 and cols[1] in ('m', 'f'):
                inter_name = cols[3]
                named_name = cols[4]
                if re.fullmatch(r'(?:method|field)_\d+', inter_name) and named_name:
                    member_candidates[inter_name].add(named_name)

    simple = {k: next(iter(v)) for k, v in class_simple_candidates.items() if len(v) == 1}
    members = {k: next(iter(v)) for k, v in member_candidates.items() if len(v) == 1}
    conflicts = {
        'class_simple': {k: sorted(v) for k, v in class_simple_candidates.items() if len(v) > 1},
        'members': {k: sorted(v) for k, v in member_candidates.items() if len(v) > 1},
    }
    return class_full, simple, members, conflicts


def remap_text(text: str, class_full: dict[str, str], simple: dict[str, str], members: dict[str, str]):
    # Fully-qualified class names first. Handle slash, dotted and decompiler-style nested dotted names.
    for old, new in sorted(class_full.items(), key=lambda kv: len(kv[0]), reverse=True):
        text = text.replace(old, new)
        text = text.replace(old.replace('/', '.'), new.replace('/', '.'))
        text = text.replace(old.replace('/', '.').replace('$', '.'), new.replace('/', '.').replace('$', '.'))

    token_map = dict(simple)
    token_map.update(members)
    text = IDENT_RE.sub(lambda m: token_map.get(m.group(0), m.group(0)), text)
    return text


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('source', type=Path)
    ap.add_argument('tiny', type=Path)
    ap.add_argument('output', type=Path)
    args = ap.parse_args()

    source = args.source.resolve()
    output = args.output.resolve()
    if output.exists():
        shutil.rmtree(output)
    output.mkdir(parents=True)

    class_full, simple, members, conflicts = parse_tiny(args.tiny)
    stats = defaultdict(int)

    for p in source.rglob('*'):
        if p.is_dir():
            continue
        rel = p.relative_to(source)
        dest = output / rel
        dest.parent.mkdir(parents=True, exist_ok=True)
        if p.suffix.lower() in TEXT_EXTS:
            try:
                before = p.read_text(encoding='utf-8')
            except UnicodeDecodeError:
                shutil.copy2(p, dest)
                stats['binary_copied'] += 1
                continue
            after = remap_text(before, class_full, simple, members)
            dest.write_text(after, encoding='utf-8')
            stats['text_files'] += 1
            stats['changed_text_files'] += before != after
        else:
            shutil.copy2(p, dest)
            stats['binary_copied'] += 1

    remaining = defaultdict(set)
    for p in output.rglob('*.java'):
        text = p.read_text(encoding='utf-8', errors='ignore')
        for token in IDENT_RE.findall(text):
            remaining[token].add(str(p.relative_to(output)))

    report = {
        'mapping_counts': {
            'classes_full': len(class_full),
            'classes_simple': len(simple),
            'members': len(members),
        },
        'conflicts': conflicts,
        'stats': dict(stats),
        'remaining_tokens': {k: sorted(v)[:25] for k, v in sorted(remaining.items())},
        'remaining_token_count': len(remaining),
    }
    (output / 'REMAPPING_REPORT.json').write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding='utf-8')
    print(json.dumps(report['mapping_counts']))
    print(json.dumps(report['stats']))
    print('remaining tokens', len(remaining))

if __name__ == '__main__':
    main()
