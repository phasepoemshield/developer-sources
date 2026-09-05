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

public record DyedColor(int rgb, boolean showInTooltip) {
    public static final Type<DyedColor> TYPE1_20_5 = new Type<DyedColor>(DyedColor.class){

        public void write(ByteBuf buffer, DyedColor value) {
            buffer.writeInt(value.rgb);
            buffer.writeBoolean(value.showInTooltip);
        }

        public DyedColor read(ByteBuf buffer) {
            int rgb = buffer.readInt();
            boolean showInTooltip = buffer.readBoolean();
            return new DyedColor(rgb, showInTooltip);
        }
    };
    public static final Type<DyedColor> TYPE1_21_5 = new Type<DyedColor>(DyedColor.class){

        public void write(Ops ops, DyedColor dyedColor) {
            ops.write((Type)Types.INT, (Object)dyedColor.rgb);
        }

        public void write(ByteBuf buffer, DyedColor value) {
            buffer.writeInt(value.rgb);
        }

        public DyedColor read(ByteBuf buffer) {
            int rgb = buffer.readInt();
            return new DyedColor(rgb);
        }
    };

    public DyedColor(int rgb) {
        this(rgb, true);
    }
}

