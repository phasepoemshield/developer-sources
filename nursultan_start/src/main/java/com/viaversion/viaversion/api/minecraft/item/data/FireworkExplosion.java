/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.ArrayType
 *  com.viaversion.viaversion.util.ArrayUtil
 *  com.viaversion.viaversion.util.Copyable
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.util.ArrayUtil;
import com.viaversion.viaversion.util.Copyable;
import io.netty.buffer.ByteBuf;

public record FireworkExplosion(int shape, int[] colors, int[] fadeColors, boolean hasTrail, boolean hasTwinkle) implements Copyable
{
    public static final String[] SHAPES = new String[]{"small_ball", "large_ball", "star", "creeper", "burst"};
    public static final Type<FireworkExplosion> TYPE = new Type<FireworkExplosion>(FireworkExplosion.class){

        public void write(Ops ops, FireworkExplosion value) {
            ops.writeMap(map -> map.write("shape", Types.STRING, (Object)SHAPES[value.shape]).writeOptional("colors", (Type)new ArrayType((Type)Types.INT), (Object)ArrayUtil.boxedArray((int[])value.colors), (Object)new Integer[0]).writeOptional("fade_colors", (Type)new ArrayType((Type)Types.INT), (Object)ArrayUtil.boxedArray((int[])value.fadeColors), (Object)new Integer[0]).writeOptional("has_trail", (Type)Types.BOOLEAN, (Object)value.hasTrail, (Object)false).writeOptional("has_twinkle", (Type)Types.BOOLEAN, (Object)value.hasTwinkle, (Object)false));
        }

        public void write(ByteBuf buffer, FireworkExplosion value) {
            Types.VAR_INT.writePrimitive(buffer, value.shape);
            Types.INT_ARRAY_PRIMITIVE.write(buffer, (Object)value.colors);
            Types.INT_ARRAY_PRIMITIVE.write(buffer, (Object)value.fadeColors);
            buffer.writeBoolean(value.hasTrail);
            buffer.writeBoolean(value.hasTwinkle);
        }

        public FireworkExplosion read(ByteBuf buffer) {
            int shape = Types.VAR_INT.readPrimitive(buffer);
            int[] colors = (int[])Types.INT_ARRAY_PRIMITIVE.read(buffer);
            int[] fadeColors = (int[])Types.INT_ARRAY_PRIMITIVE.read(buffer);
            boolean hasTrail = buffer.readBoolean();
            boolean hasTwinkle = buffer.readBoolean();
            return new FireworkExplosion(shape, colors, fadeColors, hasTrail, hasTwinkle);
        }
    };
    public static final Type<FireworkExplosion[]> ARRAY_TYPE = new ArrayType(TYPE);

    public FireworkExplosion copy() {
        return new FireworkExplosion(this.shape, (int[])Copyable.copy((Object)this.colors), (int[])Copyable.copy((Object)this.fadeColors), this.hasTrail, this.hasTwinkle);
    }
}

