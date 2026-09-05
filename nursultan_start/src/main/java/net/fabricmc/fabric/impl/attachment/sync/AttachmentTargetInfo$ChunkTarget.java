/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class00549
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class08050
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import minecraft.class00392;
import minecraft.class00549;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08050;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$Type;

public record AttachmentTargetInfo$ChunkTarget(class07321 pos) implements AttachmentTargetInfo<class08050>
{
    static final class02362<ByteBuf, AttachmentTargetInfo$ChunkTarget> PACKET_CODEC = class02389.U.N_10(class07321::new, class07321::y).N_10(AttachmentTargetInfo$ChunkTarget::new, AttachmentTargetInfo$ChunkTarget::pos);

    @Override
    public AttachmentTarget getTarget(class07299 class072992) {
        return class072992.method_8402(this.pos.B, this.pos.Z, class00549.m, false);
    }

    @Override
    public AttachmentTargetInfo$Type<class08050> getType() {
        return AttachmentTargetInfo$Type.CHUNK;
    }

    @Override
    public void appendDebugInformation(class05216 class052162) {
        class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.target-type", (Object[])new Object[]{class00392.L((String)"fabric-data-attachment-api-v1.unknown-target.target-type.chunk").N(class06541.field_1054)})).y(class05220.n);
        class052162.y((class00392)class00392.N((String)"fabric-data-attachment-api-v1.unknown-target.chunk-position", (Object[])new Object[]{class00392.y((String)(this.pos.B + ", " + this.pos.Z)).N(class06541.field_1054)})).y(class05220.n);
    }
}

