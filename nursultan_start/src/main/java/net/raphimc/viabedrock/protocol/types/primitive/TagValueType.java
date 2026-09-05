/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.io.TagRegistry
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.io.NetworkByteBufInputStream
 *  net.raphimc.viabedrock.api.io.NetworkByteBufOutputStream
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Tag_Type
 */
package net.raphimc.viabedrock.protocol.types.primitive;

import com.viaversion.nbt.io.TagRegistry;
import com.viaversion.nbt.limiter.TagLimiter;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UncheckedIOException;
import net.raphimc.viabedrock.api.io.NetworkByteBufInputStream;
import net.raphimc.viabedrock.api.io.NetworkByteBufOutputStream;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Tag_Type;

public class TagValueType
extends Type<Tag> {
    private final Tag_Type tagType;

    public TagValueType(Tag_Type tagType) {
        super(Tag.class);
        this.tagType = tagType;
    }

    public void write(ByteBuf buffer, Tag value) {
        if (value == null) {
            throw new IllegalArgumentException("Tag value cannot be null");
        }
        if (value.getTagId() != this.tagType.getValue()) {
            throw new IllegalArgumentException("Tag value must be of type " + String.valueOf(this.tagType));
        }
        try {
            value.write((DataOutput)new NetworkByteBufOutputStream(buffer));
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public Tag read(ByteBuf buffer) {
        try {
            return TagRegistry.read((int)this.tagType.getValue(), (DataInput)new NetworkByteBufInputStream(buffer), (TagLimiter)TagLimiter.noop(), (int)0);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

