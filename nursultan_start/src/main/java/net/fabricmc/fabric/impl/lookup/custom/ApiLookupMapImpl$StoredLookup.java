/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.lookup.custom;

final class ApiLookupMapImpl$StoredLookup<L> {
    final L lookup;
    final Class<?> apiClass;
    final Class<?> contextClass;

    ApiLookupMapImpl$StoredLookup(L l, Class<?> clazz, Class<?> clazz2) {
        this.lookup = l;
        this.apiClass = clazz;
        this.contextClass = clazz2;
    }
}

