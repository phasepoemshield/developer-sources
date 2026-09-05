/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.data.StructuredData
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItemTemplate
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.item;

import com.viaversion.viaversion.api.minecraft.data.StructuredData;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItemTemplate;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.item.ItemType1_20_5;
import com.viaversion.viaversion.api.type.types.item.StructuredDataTypeBase;
import io.netty.buffer.ByteBuf;
import java.util.Map;

public class ItemTemplateType26_1
extends ItemType1_20_5 {
    public ItemTemplateType26_1(StructuredDataTypeBase dataType) {
        super(dataType);
    }

    @Override
    public void write(ByteBuf buffer, Item object) {
        Types.VAR_INT.writePrimitive(buffer, object.identifier());
        Types.VAR_INT.writePrimitive(buffer, object.amount());
        this.writeData(buffer, object);
    }

    @Override
    public Item read(ByteBuf buffer) {
        int id = Types.VAR_INT.readPrimitive(buffer);
        int amount = Types.VAR_INT.readPrimitive(buffer);
        Map<StructuredDataKey<?>, StructuredData<?>> data = this.readData(buffer);
        return new StructuredItemTemplate(id, amount, new StructuredDataContainer(data));
    }

    public static final class OptionalItemTemplateType
    extends OptionalType<Item> {
        public OptionalItemTemplateType(Type<Item> type) {
            super(type);
        }
    }
}

