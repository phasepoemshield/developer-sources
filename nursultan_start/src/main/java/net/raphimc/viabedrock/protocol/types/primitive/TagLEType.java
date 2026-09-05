/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.io.TagRegistry
 *  com.viaversion.nbt.limiter.TagLimiter
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.io.LittleEndianByteBufInputStream
 *  net.raphimc.viabedrock.api.io.LittleEndianByteBufOutputStream
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
import net.raphimc.viabedrock.api.io.LittleEndianByteBufInputStream;
import net.raphimc.viabedrock.api.io.LittleEndianByteBufOutputStream;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class TagLEType
extends Type<Tag> {
    public TagLEType() {
        super(Tag.class);
    }

    public void write(ByteBuf buffer, Tag value) {
        if (value == null) {
            buffer.writeByte(0);
            return;
        }
        buffer.writeByte(value.getTagId());
        BedrockTypes.UTF8_STRING.write(buffer, (Object)"");
        try {
            value.write((DataOutput)new LittleEndianByteBufOutputStream(buffer));
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
            BedrockTypes.UTF8_STRING.read(buffer);
            return TagRegistry.read((int)id, (DataInput)new LittleEndianByteBufInputStream(buffer), (TagLimiter)TagLimiter.noop(), (int)0);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

