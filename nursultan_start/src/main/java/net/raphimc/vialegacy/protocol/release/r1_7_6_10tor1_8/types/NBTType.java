/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.io.NBTIO
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types;

import com.viaversion.nbt.io.NBTIO;
import com.viaversion.nbt.limiter.TagLimiter;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class NBTType
extends Type<CompoundTag> {
    public NBTType() {
        super(CompoundTag.class);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ByteBuf buffer, CompoundTag nbt) {
        if (nbt == null) {
            buffer.writeShort(-1);
            return;
        }
        ByteBuf data = buffer.alloc().buffer();
        try {
            try (GZIPOutputStream out = new GZIPOutputStream((OutputStream)new ByteBufOutputStream(data));){
                NBTIO.writeTag((DataOutput)new DataOutputStream(out), (Tag)nbt, (boolean)true);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            buffer.writeShort(data.readableBytes());
            buffer.writeBytes(data);
        }
        finally {
            data.release();
        }
    }

    public CompoundTag read(ByteBuf buffer) {
        CompoundTag compoundTag;
        short length = buffer.readShort();
        if (length < 0) {
            return null;
        }
        ByteBuf data = buffer.readSlice((int)length);
        GZIPInputStream in = new GZIPInputStream((InputStream)new ByteBufInputStream(data));
        try {
            compoundTag = (CompoundTag)NBTIO.readTag((DataInput)new DataInputStream(in), (TagLimiter)TagLimiter.create((int)0x200000, (int)512), (boolean)true, CompoundTag.class);
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((InputStream)in).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ((InputStream)in).close();
        return compoundTag;
    }
}

