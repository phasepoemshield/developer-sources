/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.EntityLink
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.model.EntityLink;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class EntityLinkType
extends Type<EntityLink> {
    public EntityLinkType() {
        super(EntityLink.class);
    }

    public void write(ByteBuf buffer, EntityLink value) {
        BedrockTypes.VAR_LONG.write(buffer, value.fromEntityUniqueId());
        BedrockTypes.VAR_LONG.write(buffer, value.toEntityUniqueId());
        buffer.writeByte((int)value.type());
        buffer.writeBoolean(value.immediate());
        buffer.writeBoolean(value.riderInitiated());
        buffer.writeFloatLE(value.vehicleAngularVelocity());
    }

    public EntityLink read(ByteBuf buffer) {
        return new EntityLink(BedrockTypes.VAR_LONG.read(buffer).longValue(), BedrockTypes.VAR_LONG.read(buffer).longValue(), buffer.readByte(), buffer.readBoolean(), buffer.readBoolean(), buffer.readFloatLE());
    }
}

