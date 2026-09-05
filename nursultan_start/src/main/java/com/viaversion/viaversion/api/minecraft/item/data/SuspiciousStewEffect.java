/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.EnumTypes
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.EnumTypes;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import io.netty.buffer.ByteBuf;

public record SuspiciousStewEffect(int mobEffect, int duration) {
    public static final Type<SuspiciousStewEffect> TYPE = new Type<SuspiciousStewEffect>(SuspiciousStewEffect.class){

        @Override
        public void write(Ops ops, SuspiciousStewEffect value) {
            ops.writeMap(map -> map.write("id", (Type)EnumTypes.MOB_EFFECT, (Object)value.mobEffect).writeOptional("duration", (Type)Types.INT, (Object)value.duration, (Object)160));
        }

        @Override
        public void write(ByteBuf buffer, SuspiciousStewEffect value) {
            Types.VAR_INT.writePrimitive(buffer, value.mobEffect);
            Types.VAR_INT.writePrimitive(buffer, value.duration);
        }

        @Override
        public SuspiciousStewEffect read(ByteBuf buffer) {
            int effect = Types.VAR_INT.readPrimitive(buffer);
            int duration = Types.VAR_INT.readPrimitive(buffer);
            return new SuspiciousStewEffect(effect, duration);
        }
    };
    public static final Type<SuspiciousStewEffect[]> ARRAY_TYPE = new ArrayType<SuspiciousStewEffect>(TYPE);
}

