/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.bytes.Byte2ObjectArrayMap
 *  it.unimi.dsi.fastutil.bytes.Byte2ObjectMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00394
 *  minecraft.class02362
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class08050
 */
package net.fabricmc.fabric.impl.attachment.sync;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectArrayMap;
import it.unimi.dsi.fastutil.bytes.Byte2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00394;
import minecraft.class02362;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class08050;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$BlockEntityTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$ChunkTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$EntityTarget;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$WorldTarget;

public final class AttachmentTargetInfo$Type<T>
extends Record {
    final byte id;
    private final class02362<ByteBuf, ? extends AttachmentTargetInfo<T>> packetCodec;
    static Byte2ObjectMap<AttachmentTargetInfo$Type<?>> TYPES = new Byte2ObjectArrayMap();
    static AttachmentTargetInfo$Type<class00394> BLOCK_ENTITY = new AttachmentTargetInfo$Type(0, AttachmentTargetInfo$BlockEntityTarget.PACKET_CODEC);
    static AttachmentTargetInfo$Type<class07049> ENTITY = new AttachmentTargetInfo$Type(1, AttachmentTargetInfo$EntityTarget.PACKET_CODEC);
    static AttachmentTargetInfo$Type<class08050> CHUNK = new AttachmentTargetInfo$Type(2, AttachmentTargetInfo$ChunkTarget.PACKET_CODEC);
    static AttachmentTargetInfo$Type<class07299> WORLD = new AttachmentTargetInfo$Type(3, AttachmentTargetInfo$WorldTarget.PACKET_CODEC);

    public AttachmentTargetInfo$Type(byte by, class02362<ByteBuf, ? extends AttachmentTargetInfo<T>> class023622) {
        TYPES.put(by, (Object)this);
        this.id = by;
        this.packetCodec = class023622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{AttachmentTargetInfo$Type.class, "id;packetCodec", "id", "packetCodec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{AttachmentTargetInfo$Type.class, "id;packetCodec", "id", "packetCodec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{AttachmentTargetInfo$Type.class, "id;packetCodec", "id", "packetCodec"}, this);
    }

    public byte id() {
        return this.id;
    }

    public class02362<ByteBuf, ? extends AttachmentTargetInfo<T>> packetCodec() {
        return this.packetCodec;
    }

    static class02362<ByteBuf, ? extends AttachmentTargetInfo<?>> packetCodecFromId(byte by) {
        return ((AttachmentTargetInfo$Type)((Object)AttachmentTargetInfo$Type.TYPES.get((byte)by))).packetCodec;
    }
}

