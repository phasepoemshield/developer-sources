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
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class TagType
extends Type<Tag> {
    public TagType() {
        super(Tag.class);
    }

    public void write(ByteBuf buffer, Tag value) {
        if (value == null) {
            buffer.writeByte(0);
            return;
        }
        buffer.writeByte(value.getTagId());
        BedrockTypes.STRING.write(buffer, (Object)"");
        try {
            value.write((DataOutput)new NetworkByteBufOutputStream(buffer));
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public Tag read(ByteBuf buffer) {
        byte id = buffer.readByte();
        if (id == 0) {
            return null;
        }
        try {
            BedrockTypes.STRING.read(buffer);
            return TagRegistry.read((int)id, (DataInput)new NetworkByteBufInputStream(buffer), (TagLimiter)TagLimiter.noop(), (int)0);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

