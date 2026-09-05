/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.position;

import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class SubChunkOffsetType
extends Type<BlockPosition> {
    public SubChunkOffsetType() {
        super("SubChunkOffset", BlockPosition.class);
    }

    public void write(ByteBuf buffer, BlockPosition value) {
        Types.BYTE.writePrimitive(buffer, (byte)value.x());
        Types.BYTE.writePrimitive(buffer, (byte)value.y());
        Types.BYTE.writePrimitive(buffer, (byte)value.z());
    }

    public BlockPosition read(ByteBuf buffer) {
        byte x = Types.BYTE.readPrimitive(buffer);
        byte y = Types.BYTE.readPrimitive(buffer);
        byte z = Types.BYTE.readPrimitive(buffer);
        return new BlockPosition((int)x, (int)y, (int)z);
    }
}

