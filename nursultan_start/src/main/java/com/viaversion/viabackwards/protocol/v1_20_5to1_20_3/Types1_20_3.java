/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.api.type.types.item.StructuredDataType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3;

import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.api.type.types.item.StructuredDataType;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import java.util.List;

final class Types1_20_3
implements VersionedTypesHolder {
    Types1_20_3() {
    }

    public Type<Item> item() {
        return Types.ITEM1_20_2;
    }

    public ParticleType particle() {
        return com.viaversion.viaversion.api.type.types.version.Types1_20_3.PARTICLE;
    }

    public Type<List<EntityData>> entityDataList() {
        return com.viaversion.viaversion.api.type.types.version.Types1_20_3.ENTITY_DATA_LIST;
    }

    public Type<Item> itemTemplate() {
        return this.item();
    }

    public Type<Item> optionalItemCost() {
        return null;
    }

    public VersionedStructuredDataKeys structuredDataKeys() {
        return null;
    }

    public Type<Item> lengthPrefixedItem() {
        return null;
    }

    public StructuredDataType structuredData() {
        return null;
    }

    public Type<Item[]> itemArray() {
        return Types.ITEM1_20_2_ARRAY;
    }

    public Type<Item> itemCost() {
        return null;
    }

    public Type<StructuredData<?>[]> structuredDataArray() {
        return null;
    }

    public Type<Item> optionalItemTemplate() {
        return this.item();
    }

    public ArrayType<Particle> particles() {
        return null;
    }

    public AbstractEntityDataTypes entityDataTypes() {
        return com.viaversion.viaversion.api.type.types.version.Types1_20_3.ENTITY_DATA_TYPES;
    }

    public Type<Item[]> itemTemplateArray() {
        return this.itemArray();
    }
}

