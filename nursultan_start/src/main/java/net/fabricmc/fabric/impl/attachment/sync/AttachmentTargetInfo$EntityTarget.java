/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class07299;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$Type;

public record AttachmentTargetInfo$EntityTarget(int networkId) implements AttachmentTargetInfo<class07049>
{
    static final class02362<ByteBuf, AttachmentTargetInfo$EntityTarget> PACKET_CODEC = class02362.N((class02362)class02389.B, AttachmentTargetInfo$EntityTarget::networkId, AttachmentTargetInfo$EntityTarget::new);

    @Override
    public AttachmentTarget getTarget(class07299 class072992) {
        return class072992.method_8469(this.networkId);
    }

    @Override
    public AttachmentTargetInfo$Type<class07049> getType() {
        return AttachmentTargetInfo$Type.ENTITY;
    }

    @Override
    public void appendDebugInformation(class05216 class052162) {
        class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.target-type", (Object[])new Object[]{class00392.L((String)"fabric-data-attachment-api-v1.unknown-target.target-type.entity").N(class06541.field_1054)})).y(class05220.n);
        class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.entity-network-id", (Object[])new Object[]{class00392.y((String)String.valueOf(this.networkId)).N(class06541.field_1054)})).y(class05220.n);
    }
}

