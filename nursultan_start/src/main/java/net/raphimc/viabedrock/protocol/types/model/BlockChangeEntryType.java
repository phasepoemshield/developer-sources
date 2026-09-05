/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.BlockChangeEntry
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.BlockChangeEntry;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class BlockChangeEntryType
extends Type<BlockChangeEntry> {
    public BlockChangeEntryType() {
        super(BlockChangeEntry.class);
    }

    public void write(ByteBuf buffer, BlockChangeEntry value) {
        BedrockTypes.BLOCK_POSITION.write(buffer, (Object)value.position());
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, value.blockState());
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, value.flags());
        BedrockTypes.UNSIGNED_VAR_LONG.write(buffer, value.messageEntityUniqueId());
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, value.messageType());
    }

    public BlockChangeEntry read(ByteBuf buffer) {
        BlockPosition position = (BlockPosition)BedrockTypes.BLOCK_POSITION.read(buffer);
        int blockState = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        int flags = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        long messageEntityUniqueId = BedrockTypes.UNSIGNED_VAR_LONG.read(buffer);
        int messageType = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        return new BlockChangeEntry(position, blockState, flags, messageEntityUniqueId, messageType);
    }
}

