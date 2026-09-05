/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record ItemExchangeValue(float value) {
    public static final Type<ItemExchangeValue> TYPE = new Type<ItemExchangeValue>(ItemExchangeValue.class){

        public void write(ByteBuf byteBuf, ItemExchangeValue itemExchangeValue) {
            Types.FLOAT.writePrimitive(byteBuf, itemExchangeValue.value);
        }

        public ItemExchangeValue read(ByteBuf byteBuf) {
            float value = Types.FLOAT.readPrimitive(byteBuf);
            return new ItemExchangeValue(value);
        }
    };
}

