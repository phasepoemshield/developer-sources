/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public record Unbreakable(boolean showInTooltip) {
    public static final Type<Unbreakable> TYPE = new Type<Unbreakable>(Unbreakable.class){

        @Override
        public void write(ByteBuf buffer, Unbreakable value) {
            buffer.writeBoolean(value.showInTooltip());
        }

        @Override
        public Unbreakable read(ByteBuf buffer) {
            return new Unbreakable(buffer.readBoolean());
        }
    };
}

