/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.ContainterContents$ContainerContentsType
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 */
package com.viaversion.viaversion.api.minecraft.data.version;

import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.ContainterContents;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;

public class StructuredDataKeys1_21_2
extends VersionedStructuredDataKeys {
    public final StructuredDataKey<Item[]> container;
    public final StructuredDataKey<Item[]> chargedProjectiles;
    public final StructuredDataKey<Item[]> bundleContents;
    public final StructuredDataKey<Item> useRemainder;

    public StructuredDataKeys1_21_2(VersionedTypesHolder types) {
        this.container = this.add("container", new ContainterContents.ContainerContentsType(types.optionalItemTemplate()));
        this.chargedProjectiles = this.add("charged_projectiles", types.itemTemplateArray());
        this.bundleContents = this.add("bundle_contents", types.itemTemplateArray());
        this.useRemainder = this.add("use_remainder", types.itemTemplate());
    }
}

