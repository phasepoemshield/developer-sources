/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.block;

import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class VarLongBlockChangeRecordType
extends Type<BlockChangeRecord> {
    public VarLongBlockChangeRecordType() {
        super(BlockChangeRecord.class);
    }

    public void write(ByteBuf buffer, BlockChangeRecord object) {
        short position = (short)(object.getSectionX() << 8 | object.getSectionZ() << 4 | object.getSectionY());
        Types.VAR_LONG.writePrimitive(buffer, (long)object.getBlockId() << 12 | (long)position);
    }

    public BlockChangeRecord read(ByteBuf buffer) {
        long data = Types.VAR_LONG.readPrimitive(buffer);
        short position = (short)(data & 0xFFFL);
        return new BlockChangeRecord1_16_2(position >>> 8 & 0xF, position & 0xF, position >>> 4 & 0xF, (int)(data >>> 12));
    }
}

