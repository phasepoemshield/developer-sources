/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07299;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$Type;

public final class AttachmentTargetInfo$WorldTarget
implements AttachmentTargetInfo<class07299> {
    public static final AttachmentTargetInfo$WorldTarget INSTANCE = new AttachmentTargetInfo$WorldTarget();
    static final class02362<ByteBuf, AttachmentTargetInfo$WorldTarget> PACKET_CODEC = class02362.N((Object)INSTANCE);

    @Override
    public AttachmentTarget getTarget(class07299 class072992) {
        return class072992;
    }

    private AttachmentTargetInfo$WorldTarget() {
    }

    @Override
    public AttachmentTargetInfo$Type<class07299> getType() {
        return AttachmentTargetInfo$Type.WORLD;
    }

    @Override
    public void appendDebugInformation(class05216 class052162) {
        class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.target-type", (Object[])new Object[]{class00392.L((String)"fabric-data-attachment-api-v1.unknown-target.target-type.world").N(class06541.field_1054)})).y(class05220.n);
    }
}

