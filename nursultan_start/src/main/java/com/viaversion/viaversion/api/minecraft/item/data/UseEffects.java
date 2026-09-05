/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record UseEffects(boolean canSprint, boolean interactVibrations, float speedMultiplier) {
    public static final Type<UseEffects> TYPE = new Type<UseEffects>(UseEffects.class){

        @Override
        public void write(Ops ops, UseEffects value) {
            ops.writeMap(map -> map.writeOptional("can_sprint", (Type)Types.BOOLEAN, (Object)value.canSprint, (Object)false).writeOptional("interact_vibrations", (Type)Types.BOOLEAN, (Object)value.interactVibrations, (Object)true).writeOptional("speed_multiplier", (Type)Types.FLOAT, (Object)Float.valueOf(value.speedMultiplier), (Object)Float.valueOf(0.2f)));
        }

        @Override
        public void write(ByteBuf buffer, UseEffects value) {
            Types.BOOLEAN.write(buffer, (Boolean)value.canSprint());
            Types.BOOLEAN.write(buffer, (Boolean)value.interactVibrations());
            Types.FLOAT.writePrimitive(buffer, value.speedMultiplier());
        }

        @Override
        public UseEffects read(ByteBuf buffer) {
            boolean canSprint = Types.BOOLEAN.read(buffer);
            boolean interactVibrations = Types.BOOLEAN.read(buffer);
            float speedMultiplier = Types.FLOAT.readPrimitive(buffer);
            return new UseEffects(canSprint, interactVibrations, speedMultiplier);
        }
    };
}

