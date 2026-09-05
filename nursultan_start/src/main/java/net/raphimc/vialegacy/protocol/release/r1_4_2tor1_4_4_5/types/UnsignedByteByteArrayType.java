/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public class UnsignedByteByteArrayType
extends Type<byte[]> {
    public UnsignedByteByteArrayType() {
        super(byte[].class);
    }

    public void write(ByteBuf buffer, byte[] array) {
        buffer.writeByte(array.length & 0xFF);
        buffer.writeBytes(array);
    }

    public byte[] read(ByteBuf buffer) {
        byte[] array = new byte[buffer.readUnsignedByte()];
        buffer.readBytes(array);
        return array;
    }
}

