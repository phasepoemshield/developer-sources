/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.HolderSet
 *  com.viaversion.viaversion.api.minecraft.RegistryKey
 *  com.viaversion.viaversion.api.type.types.misc.HolderSetType
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.type.TransformingType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.misc.HolderSetType;

public record ProvidesBannerPatterns(HolderSet patterns) {
    public static final Type<ProvidesBannerPatterns> TYPE = TransformingType.of(new HolderSetType(RegistryKey.of((String)"banner_pattern")), ProvidesBannerPatterns.class, ProvidesBannerPatterns::new, ProvidesBannerPatterns::patterns);
}

