/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record Enchantable(int value) {
    public static final Type<Enchantable> TYPE = new Type<Enchantable>(Enchantable.class){

        public void write(Ops ops, Enchantable enchantable) {
            ops.writeMap(map -> map.write("value", (Type)Types.INT, (Object)enchantable.value));
        }

        public void write(ByteBuf buffer, Enchantable value) {
            Types.VAR_INT.writePrimitive(buffer, value.value);
        }

        public Enchantable read(ByteBuf buffer) {
            return new Enchantable(Types.VAR_INT.readPrimitive(buffer));
        }
    };
}

