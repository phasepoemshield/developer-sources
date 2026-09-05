/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.OptionalType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.math;

import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.OptionalType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;

public class GlobalBlockPositionType
extends Type<GlobalBlockPosition> {
    public GlobalBlockPositionType() {
        super(GlobalBlockPosition.class);
    }

    public void write(Ops ops, GlobalBlockPosition value) {
        ops.writeMap(map -> map.write("dimension", Types.IDENTIFIER, (Object)Key.of((String)value.dimension())).write("pos", Types.BLOCK_POSITION1_14, (Object)value));
    }

    public void write(ByteBuf buffer, GlobalBlockPosition object) {
        Types.STRING.write(buffer, (Object)object.dimension());
        Types.BLOCK_POSITION1_14.write(buffer, (Object)object);
    }

    public GlobalBlockPosition read(ByteBuf buffer) {
        String dimension = (String)Types.STRING.read(buffer);
        return ((BlockPosition)Types.BLOCK_POSITION1_14.read(buffer)).withDimension(dimension);
    }

    public static final class OptionalGlobalPositionType
    extends OptionalType<GlobalBlockPosition> {
        public OptionalGlobalPositionType() {
            super(Types.GLOBAL_POSITION);
        }
    }
}

