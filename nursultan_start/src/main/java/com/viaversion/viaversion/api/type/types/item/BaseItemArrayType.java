/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 */
package com.viaversion.viaversion.api.type.types.item;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;

abstract class BaseItemArrayType
extends Type<Item[]> {
    protected BaseItemArrayType() {
        super(Item[].class);
    }

    protected BaseItemArrayType(String typeName) {
        super(typeName, Item[].class);
    }

    public Class<? extends Type> getBaseClass() {
        return BaseItemArrayType.class;
    }
}

