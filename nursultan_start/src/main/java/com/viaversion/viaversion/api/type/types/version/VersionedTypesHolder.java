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
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.api.type.types.item.StructuredDataType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 */
package com.viaversion.viaversion.api.type.types.version;

import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.api.type.types.item.StructuredDataType;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import java.util.List;

public interface VersionedTypesHolder {
    public Type<Item> item();

    public ParticleType particle();

    public Type<List<EntityData>> entityDataList();

    public Type<Item> itemTemplate();

    public Type<Item> optionalItemCost();

    public VersionedStructuredDataKeys structuredDataKeys();

    public Type<Item> lengthPrefixedItem();

    public StructuredDataType structuredData();

    public Type<Item[]> itemArray();

    public Type<Item> itemCost();

    public Type<StructuredData<?>[]> structuredDataArray();

    public Type<Item> optionalItemTemplate();

    public ArrayType<Particle> particles();

    public AbstractEntityDataTypes entityDataTypes();

    public Type<Item[]> itemTemplateArray();
}

