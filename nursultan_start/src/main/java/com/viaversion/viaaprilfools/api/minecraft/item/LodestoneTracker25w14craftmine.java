/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record LodestoneTracker25w14craftmine(GlobalBlockPosition position, boolean tracked, boolean exits) {
    public static final Type<LodestoneTracker25w14craftmine> TYPE = new Type<LodestoneTracker25w14craftmine>(LodestoneTracker25w14craftmine.class){

        public void write(ByteBuf buffer, LodestoneTracker25w14craftmine value) {
            Types.OPTIONAL_GLOBAL_POSITION.write(buffer, (Object)value.position);
            buffer.writeBoolean(value.tracked);
            buffer.writeBoolean(value.exits);
        }

        public LodestoneTracker25w14craftmine read(ByteBuf buffer) {
            GlobalBlockPosition position = (GlobalBlockPosition)Types.OPTIONAL_GLOBAL_POSITION.read(buffer);
            boolean tracked = buffer.readBoolean();
            boolean exits = buffer.readBoolean();
            return new LodestoneTracker25w14craftmine(position, tracked, exits);
        }
    };
}

