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
import io.netty.buffer.ByteBuf;

public record SwingAnimation(int type, int duration) {
    private static final int DEFAULT_TYPE = EnumTypes.SWING_ANIMATION.idFromName("whack");
    public static final Type<SwingAnimation> TYPE = new Type<SwingAnimation>(SwingAnimation.class){

        @Override
        public void write(Ops ops, SwingAnimation value) {
            ops.writeMap(map -> map.writeOptional("type", (Type)((Object)EnumTypes.SWING_ANIMATION), (Object)value.type, (Object)DEFAULT_TYPE).writeOptional("duration", (Type)Types.INT, (Object)value.duration, (Object)6));
        }

        @Override
        public void write(ByteBuf buffer, SwingAnimation value) {
            Types.VAR_INT.writePrimitive(buffer, value.type);
            Types.VAR_INT.writePrimitive(buffer, value.duration);
        }

        @Override
        public SwingAnimation read(ByteBuf buffer) {
            int type = Types.VAR_INT.readPrimitive(buffer);
            int duration = Types.VAR_INT.readPrimitive(buffer);
            return new SwingAnimation(type, duration);
        }
    };
}

