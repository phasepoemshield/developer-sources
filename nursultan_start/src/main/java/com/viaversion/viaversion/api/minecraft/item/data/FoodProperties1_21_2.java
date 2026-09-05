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

public record FoodProperties1_21_2(int nutrition, float saturationModifier, boolean canAlwaysEat) {
    public static final Type<FoodProperties1_21_2> TYPE = new Type<FoodProperties1_21_2>(FoodProperties1_21_2.class){

        public void write(Ops ops, FoodProperties1_21_2 value) {
            ops.writeMap(map -> map.write("nutrition", (Type)Types.VAR_INT, (Object)value.nutrition).write("saturation", (Type)Types.FLOAT, (Object)Float.valueOf(value.saturationModifier)).writeOptional("can_always_eat", (Type)Types.BOOLEAN, (Object)value.canAlwaysEat, (Object)false));
        }

        public void write(ByteBuf buffer, FoodProperties1_21_2 value) {
            Types.VAR_INT.writePrimitive(buffer, value.nutrition);
            buffer.writeFloat(value.saturationModifier);
            buffer.writeBoolean(value.canAlwaysEat);
        }

        public FoodProperties1_21_2 read(ByteBuf buffer) {
            int nutrition = Types.VAR_INT.readPrimitive(buffer);
            float saturationModifier = buffer.readFloat();
            boolean canAlwaysEat = buffer.readBoolean();
            return new FoodProperties1_21_2(nutrition, saturationModifier, canAlwaysEat);
        }
    };
}

