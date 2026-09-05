/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.lookup.custom.ApiLookupMapImpl
 */
package net.fabricmc.fabric.api.lookup.v1.custom;

import java.util.Objects;
import minecraft.class01894;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap$LookupConstructor;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap$LookupFactory;
import net.fabricmc.fabric.impl.lookup.custom.ApiLookupMapImpl;

public interface ApiLookupMap<L>
extends Iterable<L> {
    @Deprecated(forRemoval=true)
    public static <L> ApiLookupMap<L> create(ApiLookupMap$LookupFactory<L> apiLookupMap$LookupFactory) {
        return ApiLookupMap.create((class01894 class018942, Class<?> clazz, Class<?> clazz2) -> apiLookupMap$LookupFactory.get(clazz, clazz2));
    }

    public static <L> ApiLookupMap<L> create(ApiLookupMap$LookupConstructor<L> apiLookupMap$LookupConstructor) {
        Objects.requireNonNull(apiLookupMap$LookupConstructor, "Lookup factory may not be null.");
        return new ApiLookupMapImpl(apiLookupMap$LookupConstructor);
    }

    public L getLookup(class01894 var1, Class<?> var2, Class<?> var3);
}

