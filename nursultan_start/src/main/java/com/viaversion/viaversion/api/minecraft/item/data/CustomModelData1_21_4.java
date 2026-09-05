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

public record CustomModelData1_21_4(float[] floats, boolean[] booleans, String[] strings, int[] colors) implements Copyable
{
    public static final Type<CustomModelData1_21_4> TYPE = new Type<CustomModelData1_21_4>(CustomModelData1_21_4.class){

        public void write(Ops ops, CustomModelData1_21_4 value) {
            ops.writeMap(map -> map.writeOptional("floats", (Type)new ArrayType((Type)Types.FLOAT), (Object)ArrayUtil.boxedArray((float[])value.floats), (Object)new Float[0]).writeOptional("flags", (Type)new ArrayType((Type)Types.BOOLEAN), (Object)ArrayUtil.boxedArray((boolean[])value.booleans), (Object)new Boolean[0]).writeOptional("strings", Types.STRING_ARRAY, (Object)value.strings(), (Object)new String[0]).writeOptional("colors", (Type)new ArrayType((Type)Types.INT), (Object)ArrayUtil.boxedArray((int[])value.colors), (Object)new Integer[0]));
        }

        public void write(ByteBuf buffer, CustomModelData1_21_4 value) {
            Types.FLOAT_ARRAY_PRIMITIVE.write(buffer, (Object)value.floats());
            Types.BOOLEAN_ARRAY_PRIMITIVE.write(buffer, (Object)value.booleans());
            Types.STRING_ARRAY.write(buffer, (Object)value.strings());
            Types.INT_ARRAY_PRIMITIVE.write(buffer, (Object)value.colors());
        }

        public CustomModelData1_21_4 read(ByteBuf buffer) {
            float[] floats = (float[])Types.FLOAT_ARRAY_PRIMITIVE.read(buffer);
            boolean[] booleans = (boolean[])Types.BOOLEAN_ARRAY_PRIMITIVE.read(buffer);
            String[] strings = (String[])Types.STRING_ARRAY.read(buffer);
            int[] colors = (int[])Types.INT_ARRAY_PRIMITIVE.read(buffer);
            return new CustomModelData1_21_4(floats, booleans, strings, colors);
        }
    };

    public CustomModelData1_21_4 copy() {
        return new CustomModelData1_21_4((float[])Copyable.copy((Object)this.floats), (boolean[])Copyable.copy((Object)this.booleans), (String[])Copyable.copy((Object)this.strings), (int[])Copyable.copy((Object)this.colors));
    }
}

