/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.block;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;

public class BlockEntityType1_20_2
extends Type<BlockEntity> {
    public BlockEntityType1_20_2() {
        super(BlockEntity.class);
    }

    public void write(ByteBuf buffer, BlockEntity entity) {
        buffer.writeByte((int)entity.packedXZ());
        buffer.writeShort((int)entity.y());
        Types.VAR_INT.writePrimitive(buffer, entity.typeId());
        Types.TRUSTED_COMPOUND_TAG.write(buffer, (Object)entity.tag());
    }

    public BlockEntity read(ByteBuf buffer) {
        byte xz = buffer.readByte();
        short y = buffer.readShort();
        int typeId = Types.VAR_INT.readPrimitive(buffer);
        CompoundTag tag = (CompoundTag)Types.TRUSTED_COMPOUND_TAG.read(buffer);
        return new BlockEntityImpl(xz, y, typeId, tag);
    }
}

