/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.io.TagRegistry
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.tag.ByteArrayTag
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.DoubleTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.LongArrayTag
 *  com.viaversion.nbt.tag.LongTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.ShortTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.io.FastByteBufInputStream
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.misc;

import com.viaversion.nbt.io.TagRegistry;
import com.viaversion.nbt.limiter.TagLimiter;
import com.viaversion.nbt.tag.ByteArrayTag;
import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.DoubleTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.LongArrayTag;
import com.viaversion.nbt.tag.LongTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.ShortTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.misc.NamedCompoundTagType;
import com.viaversion.viaversion.io.FastByteBufInputStream;
import io.netty.buffer.ByteBuf;
import java.io.DataInput;
import java.io.IOException;
import java.util.Map;

public class TagType
extends Type<Tag> {
    private final int maxBytes;

    public TagType() {
        this(true);
    }

    public TagType(boolean bl) {
        super(Tag.class);
        this.maxBytes = bl ? 0x200000 : Integer.MAX_VALUE;
    }

    public void write(Ops ops, Tag tag) {
        if (tag == null) {
            throw new IllegalArgumentException("Cannot write null tag");
        }
        if (tag instanceof StringTag) {
            StringTag stringTag = (StringTag)tag;
            ops.writeString((CharSequence)stringTag.getValue());
        } else if (tag instanceof NumberTag) {
            if (tag instanceof IntTag) {
                IntTag intTag = (IntTag)tag;
                ops.writeInt(intTag.asInt());
            } else if (tag instanceof ByteTag) {
                ByteTag byteTag = (ByteTag)tag;
                ops.writeByte(byteTag.asByte());
            } else if (tag instanceof FloatTag) {
                FloatTag floatTag = (FloatTag)tag;
                ops.writeFloat(floatTag.asFloat());
            } else if (tag instanceof DoubleTag) {
                DoubleTag doubleTag = (DoubleTag)tag;
                ops.writeDouble(doubleTag.asDouble());
            } else if (tag instanceof ShortTag) {
                ShortTag shortTag = (ShortTag)tag;
                ops.writeShort(shortTag.asShort());
            } else if (tag instanceof LongTag) {
                LongTag longTag = (LongTag)tag;
                ops.writeLong(longTag.asLong());
            }
        } else if (tag instanceof CompoundTag) {
            CompoundTag compoundTag = (CompoundTag)tag;
            ops.writeMap(mapSerializer -> {
                for (Map.Entry entry : compoundTag.entrySet()) {
                    mapSerializer.write((String)entry.getKey(), (Type)this, (Object)((Tag)entry.getValue()));
                }
            });
        } else if (tag instanceof ListTag) {
            ListTag listTag = (ListTag)tag;
            ops.writeList(listSerializer -> {
                for (Tag tag : listTag) {
                    listSerializer.write((Type)this, (Object)tag);
                }
            });
        } else if (tag instanceof IntArrayTag) {
            IntArrayTag intArrayTag = (IntArrayTag)tag;
            ops.writeInts(intArrayTag.getValue());
        } else if (tag instanceof ByteArrayTag) {
            ByteArrayTag byteArrayTag = (ByteArrayTag)tag;
            ops.writeBytes(byteArrayTag.getValue());
        } else if (tag instanceof LongArrayTag) {
            LongArrayTag longArrayTag = (LongArrayTag)tag;
            ops.writeLongs(longArrayTag.getValue());
        } else {
            throw new IllegalArgumentException("Unknown tag type: " + String.valueOf(tag));
        }
    }

    public void write(ByteBuf byteBuf, Tag tag) {
        try {
            NamedCompoundTagType.write(byteBuf, tag, null);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public Tag read(ByteBuf byteBuf) {
        byte by = byteBuf.readByte();
        if (by == 0) {
            return null;
        }
        int n = 512;
        int n2 = this.maxBytes;
        TagLimiter tagLimiter = this.redirect$dpi001$viafabricplus$removeNBTSizeLimit(n2, n);
        try {
            return TagRegistry.read((int)by, (DataInput)new FastByteBufInputStream(byteBuf), (TagLimiter)tagLimiter, (int)0);
        }
        catch (IOException iOException) {
            if (Via.getManager().isDebug()) {
                throw new RuntimeException(iOException);
            }
            throw new RuntimeException("Error reading tag :" + iOException.getMessage());
        }
    }

    private TagLimiter redirect$dpi001$viafabricplus$removeNBTSizeLimit(int n, int n2) {
        return TagLimiter.noop();
    }
}

