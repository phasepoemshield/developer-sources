/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.BlockProperties
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.BlockProperties;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class BlockPropertiesType
extends Type<BlockProperties> {
    public BlockPropertiesType() {
        super(BlockProperties.class);
    }

    public void write(ByteBuf buffer, BlockProperties value) {
        BedrockTypes.STRING.write(buffer, (Object)value.name());
        BedrockTypes.NETWORK_TAG.write(buffer, (Object)value.properties());
    }

    public BlockProperties read(ByteBuf buffer) {
        return new BlockProperties(Key.namespaced((String)((String)BedrockTypes.STRING.read(buffer))), (CompoundTag)BedrockTypes.NETWORK_TAG.read(buffer));
    }
}

