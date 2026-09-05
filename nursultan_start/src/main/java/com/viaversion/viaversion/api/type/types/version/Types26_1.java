/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.api.type.types.item.ItemTemplateType26_1
 *  com.viaversion.viaversion.api.type.types.item.ItemTemplateType26_1$OptionalItemTemplateType
 *  com.viaversion.viaversion.api.type.types.item.StructuredDataTypeBase
 */
package com.viaversion.viaversion.api.type.types.version;

import com.viaversion.viaversion.api.minecraft.data.version.VersionedStructuredDataKeys;
import com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.api.type.types.item.ItemTemplateType26_1;
import com.viaversion.viaversion.api.type.types.item.StructuredDataTypeBase;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypesHolder;
import java.util.function.Function;

public class Types26_1<K extends VersionedStructuredDataKeys, E extends AbstractEntityDataTypes>
extends Types1_20_5<K, E> {
    public final Type<Item> itemTemplate;
    public final Type<Item> optionalItemTemplate;
    public final Type<Item[]> itemTemplateArray;

    public Types26_1(Function<VersionedTypesHolder, K> keysSupplier, Function<VersionedTypesHolder, E> entityDataTypesSupplier) {
        super(null, entityDataTypesSupplier);
        this.itemTemplate = new ItemTemplateType26_1((StructuredDataTypeBase)this.structuredData);
        this.optionalItemTemplate = new ItemTemplateType26_1.OptionalItemTemplateType(this.itemTemplate);
        this.itemTemplateArray = new ArrayType(this.itemTemplate);
        this.initKeys(keysSupplier);
    }

    @Override
    public Type<Item> itemTemplate() {
        return this.itemTemplate;
    }

    @Override
    public Type<Item> optionalItemTemplate() {
        return this.optionalItemTemplate;
    }

    @Override
    public Type<Item[]> itemTemplateArray() {
        return this.itemTemplateArray;
    }
}

