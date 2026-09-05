/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaaprilfools.api.minecraft.item;

import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public record RoomerinoComponentino(String id) {
    public static final Type<RoomerinoComponentino> TYPE = new Type<RoomerinoComponentino>(RoomerinoComponentino.class){

        public void write(ByteBuf buffer, RoomerinoComponentino value) {
            Types.STRING.write(buffer, (Object)value.id());
        }

        public RoomerinoComponentino read(ByteBuf buffer) {
            String id = (String)Types.STRING.read(buffer);
            return new RoomerinoComponentino(id);
        }
    };
}

