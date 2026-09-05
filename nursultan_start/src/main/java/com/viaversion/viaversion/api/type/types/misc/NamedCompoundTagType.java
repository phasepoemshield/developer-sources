/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.io.FastByteBufInputStream
 *  com.viaversion.viaversion.io.FastByteBufOutputStream
 *  io.netty.buffer.ByteBuf
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.nbt.limiter.TagLimiter;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.io.FastByteBufInputStream;
import com.viaversion.viaversion.io.FastByteBufOutputStream;
import io.netty.buffer.ByteBuf;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.Nullable;

public class NamedCompoundTagType
extends Type<CompoundTag> {
    public NamedCompoundTagType() {
        super(CompoundTag.class);
    }

    public static void write(ByteBuf byteBuf, Tag tag, @Nullable String string) throws IOException {
        if (tag == null) {
            byteBuf.writeByte(0);
            return;
        }
        FastByteBufOutputStream fastByteBufOutputStream = new FastByteBufOutputStream(byteBuf);
        fastByteBufOutputStream.writeByte(tag.getTagId());
        if (string != null) {
            fastByteBufOutputStream.writeUTF(string);
        }
        tag.write((DataOutput)fastByteBufOutputStream);
    }

    public void write(ByteBuf byteBuf, CompoundTag compoundTag) {
        try {
            NamedCompoundTagType.write(byteBuf, (Tag)compoundTag, "");
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public CompoundTag read(ByteBuf byteBuf) {
        try {
            return NamedCompoundTagType.read(byteBuf, 0x200000, true);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static CompoundTag read(ByteBuf byteBuf, int n, boolean bl) throws IOException {
        byte by = byteBuf.readByte();
        if (by == 0) {
            return null;
        }
        if (by != 10) {
            throw new IOException(String.format("Expected root tag to be a CompoundTag, was %s", by));
        }
        if (bl) {
            byteBuf.skipBytes(byteBuf.readUnsignedShort());
        }
        int n2 = 512;
        int n3 = n;
        TagLimiter tagLimiter = NamedCompoundTagType.redirect$dph000$viafabricplus$removeNBTSizeLimit(n3, n2);
        return CompoundTag.read((DataInput)new FastByteBufInputStream(byteBuf), (TagLimiter)tagLimiter, (int)0);
    }

    private static TagLimiter redirect$dph000$viafabricplus$removeNBTSizeLimit(int n, int n2) {
        return TagLimiter.noop();
    }
}

