/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.block;

import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class BlockChangeRecordType
extends Type<BlockChangeRecord> {
    public BlockChangeRecordType() {
        super(BlockChangeRecord.class);
    }

    public void write(ByteBuf buffer, BlockChangeRecord object) {
        Types.SHORT.writePrimitive(buffer, (short)(object.getSectionX() << 12 | object.getSectionZ() << 8 | object.getY()));
        Types.VAR_INT.writePrimitive(buffer, object.getBlockId());
    }

    public BlockChangeRecord read(ByteBuf buffer) {
        short position = Types.SHORT.readPrimitive(buffer);
        int blockId = Types.VAR_INT.readPrimitive(buffer);
        return new BlockChangeRecord1_8(position >> 12 & 0xF, position & 0xFF, position >> 8 & 0xF, blockId);
    }
}

