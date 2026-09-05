/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap$LookupConstructor
 */
package net.fabricmc.fabric.impl.lookup.custom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import minecraft.class01894;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap;
import net.fabricmc.fabric.impl.lookup.custom.ApiLookupMapImpl$StoredLookup;

public final class ApiLookupMapImpl<L>
implements ApiLookupMap<L> {
    private final Map<class01894, ApiLookupMapImpl$StoredLookup<L>> lookups = new HashMap<class01894, ApiLookupMapImpl$StoredLookup<L>>();
    private final ApiLookupMap.LookupConstructor<L> lookupConstructor;

    public ApiLookupMapImpl(ApiLookupMap.LookupConstructor<L> lookupConstructor) {
        this.lookupConstructor = lookupConstructor;
    }

    public synchronized Iterator<L> iterator() {
        return this.lookups.values().stream().map(apiLookupMapImpl$StoredLookup -> apiLookupMapImpl$StoredLookup.lookup).collect(Collectors.toList()).iterator();
    }

    public synchronized L getLookup(class01894 class018943, Class<?> clazz, Class<?> clazz2) {
        Objects.requireNonNull(class018943, "Lookup Identifier may not be null.");
        Objects.requireNonNull(clazz, "API class may not be null.");
        Objects.requireNonNull(clazz2, "Context class may not be null.");
        ApiLookupMapImpl$StoredLookup apiLookupMapImpl$StoredLookup = this.lookups.computeIfAbsent(class018943, class018942 -> new ApiLookupMapImpl$StoredLookup<Object>(this.lookupConstructor.get(class018942, clazz, clazz2), clazz, clazz2));
        if (apiLookupMapImpl$StoredLookup.apiClass == clazz && apiLookupMapImpl$StoredLookup.contextClass == clazz2) {
            return apiLookupMapImpl$StoredLookup.lookup;
        }
        String string = String.format("Lookup with id %s is already registered with api class %s and context class %s. It can't be registered with api class %s and context class %s.", class018943, apiLookupMapImpl$StoredLookup.apiClass.getCanonicalName(), apiLookupMapImpl$StoredLookup.contextClass.getCanonicalName(), clazz.getCanonicalName(), clazz2.getCanonicalName());
        throw new IllegalArgumentException(string);
    }
}

