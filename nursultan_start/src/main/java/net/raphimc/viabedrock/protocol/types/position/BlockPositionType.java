/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.viabedrock.protocol.types.position;

import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class BlockPositionType
extends Type<BlockPosition> {
    public BlockPositionType() {
        super("BlockPosition", BlockPosition.class);
    }

    public void write(ByteBuf buffer, BlockPosition value) {
        BedrockTypes.VAR_INT.writePrimitive(buffer, value.x());
        BedrockTypes.VAR_INT.writePrimitive(buffer, value.y());
        BedrockTypes.VAR_INT.writePrimitive(buffer, value.z());
    }

    public BlockPosition read(ByteBuf buffer) {
        int x = BedrockTypes.VAR_INT.readPrimitive(buffer);
        int y = BedrockTypes.VAR_INT.readPrimitive(buffer);
        int z = BedrockTypes.VAR_INT.readPrimitive(buffer);
        return new BlockPosition(x, y, z);
    }
}

