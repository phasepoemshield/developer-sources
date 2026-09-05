/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.minecraft.item.data.BannerPattern
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.minecraft.item.data.BannerPattern;
import com.viaversion.viaversion.api.minecraft.item.data.EnumTypes;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import io.netty.buffer.ByteBuf;

public record BannerPatternLayer(Holder<BannerPattern> pattern, int dyeColor) {
    public static final Type<BannerPatternLayer> TYPE = new Type<BannerPatternLayer>(BannerPatternLayer.class){

        public void write(Ops ops, BannerPatternLayer value) {
            ops.writeMap(map -> map.write("pattern", (Type)BannerPattern.TYPE, value.pattern).write("color", (Type)EnumTypes.DYE_COLOR, (Object)value.dyeColor));
        }

        public void write(ByteBuf buffer, BannerPatternLayer value) {
            BannerPattern.TYPE.write(buffer, value.pattern);
            Types.VAR_INT.writePrimitive(buffer, value.dyeColor);
        }

        public BannerPatternLayer read(ByteBuf buffer) {
            Holder pattern = BannerPattern.TYPE.read(buffer);
            int color = Types.VAR_INT.readPrimitive(buffer);
            return new BannerPatternLayer((Holder<BannerPattern>)pattern, color);
        }
    };
    public static final Type<BannerPatternLayer[]> ARRAY_TYPE = new ArrayType(TYPE);
}

