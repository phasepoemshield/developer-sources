/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern$Pattern
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.TropicalFishPattern;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;

public record TropicalFishPattern(int packedId) {
    public static final Type<TropicalFishPattern> TYPE = new Type<TropicalFishPattern>(TropicalFishPattern.class){

        @Override
        public void write(Ops ops, TropicalFishPattern value) {
            Pattern pattern = Arrays.stream(Pattern.values()).filter(e -> e.packedId == value.packedId).findAny().orElse(Pattern.KOB);
            ops.write(Types.STRING, (Object)pattern.key);
        }

        @Override
        public void write(ByteBuf buffer, TropicalFishPattern value) {
            Types.VAR_INT.writePrimitive(buffer, value.packedId);
        }

        @Override
        public TropicalFishPattern read(ByteBuf buffer) {
            int packedId = Types.VAR_INT.readPrimitive(buffer);
            return new TropicalFishPattern(packedId);
        }
    };

    public int sizeId() {
        return this.packedId & 0xFF;
    }

    public int sizeSpecificId() {
        return this.packedId >> 8;
    }
}

