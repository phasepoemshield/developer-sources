/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05216
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05216;
import minecraft.class07299;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$BlockEntityTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$ChunkTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$EntityTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$Type;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$WorldTarget;
import org.jspecify.annotations.Nullable;

public sealed interface AttachmentTargetInfo<T>
permits AttachmentTargetInfo$BlockEntityTarget, AttachmentTargetInfo$EntityTarget, AttachmentTargetInfo$ChunkTarget, AttachmentTargetInfo$WorldTarget {
    public static final int MAX_SIZE_IN_BYTES = 9;
    public static final class02362<ByteBuf, AttachmentTargetInfo<?>> PACKET_CODEC = class02389.L.y(AttachmentTargetInfo::getId, AttachmentTargetInfo$Type::packetCodecFromId);

    public @Nullable AttachmentTarget getTarget(class07299 var1);

    default public byte getId() {
        return this.getType().id;
    }

    public AttachmentTargetInfo$Type<T> getType();

    public void appendDebugInformation(class05216 var1);
}

