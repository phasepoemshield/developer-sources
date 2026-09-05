/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerEnumName
 *  net.raphimc.viabedrock.protocol.model.FullContainerName
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerEnumName;
import net.raphimc.viabedrock.protocol.model.FullContainerName;

public class FullContainerNameType
extends Type<FullContainerName> {
    public FullContainerNameType() {
        super(FullContainerName.class);
    }

    public void write(ByteBuf buffer, FullContainerName value) {
        buffer.writeByte(value.name().getValue());
        buffer.writeBoolean(value.dynamicId() != null);
        if (value.dynamicId() != null) {
            buffer.writeIntLE(value.dynamicId().intValue());
        }
    }

    public FullContainerName read(ByteBuf buffer) {
        return new FullContainerName(ContainerEnumName.getByValue((int)buffer.readByte()), buffer.readBoolean() ? Integer.valueOf(buffer.readIntLE()) : null);
    }
}

