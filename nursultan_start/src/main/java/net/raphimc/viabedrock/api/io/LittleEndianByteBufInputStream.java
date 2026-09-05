/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 */
package net.raphimc.viabedrock.api.io;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LittleEndianByteBufInputStream
extends ByteBufInputStream {
    private final ByteBuf buffer;

    public LittleEndianByteBufInputStream(ByteBuf buffer) {
        super(buffer);
        this.buffer = buffer;
    }

    public int readInt() throws IOException {
        return this.buffer.readIntLE();
    }

    public String readUTF() throws IOException {
        return (String)this.buffer.readCharSequence(this.readUnsignedShort(), StandardCharsets.UTF_8);
    }

    public char readChar() {
        return Character.reverseBytes(this.buffer.readChar());
    }

    public float readFloat() {
        return this.buffer.readFloatLE();
    }

    public int readUnsignedShort() {
        return this.buffer.readUnsignedShortLE();
    }

    public short readShort() {
        return this.buffer.readShortLE();
    }

    public long readLong() throws IOException {
        return this.buffer.readLongLE();
    }

    public double readDouble() {
        return this.buffer.readDoubleLE();
    }
}

