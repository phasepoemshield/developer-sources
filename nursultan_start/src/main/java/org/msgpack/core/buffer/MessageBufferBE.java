/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;

public class MessageBufferBE
extends MessageBuffer {
    MessageBufferBE(byte[] byArray, int n, int n2) {
        super(byArray, n, n2);
    }

    MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private MessageBufferBE(Object object, long l, int n) {
        super(object, l, n);
    }

    @Override
    public MessageBufferBE slice(int n, int n2) {
        if (n == 0 && n2 == this.size()) {
            return this;
        }
        Preconditions.checkArgument(n + n2 <= this.size());
        return new MessageBufferBE(this.base, this.address + (long)n, n2);
    }

    @Override
    public short getShort(int n) {
        return unsafe.getShort(this.base, this.address + (long)n);
    }

    @Override
    public int getInt(int n) {
        return unsafe.getInt(this.base, this.address + (long)n);
    }

    @Override
    public long getLong(int n) {
        return unsafe.getLong(this.base, this.address + (long)n);
    }

    @Override
    public float getFloat(int n) {
        return unsafe.getFloat(this.base, this.address + (long)n);
    }

    @Override
    public double getDouble(int n) {
        return unsafe.getDouble(this.base, this.address + (long)n);
    }

    @Override
    public void putShort(int n, short s) {
        unsafe.putShort(this.base, this.address + (long)n, s);
    }

    @Override
    public void putInt(int n, int n2) {
        unsafe.putInt(this.base, this.address + (long)n, n2);
    }

    @Override
    public void putLong(int n, long l) {
        unsafe.putLong(this.base, this.address + (long)n, l);
    }

    @Override
    public void putDouble(int n, double d) {
        unsafe.putDouble(this.base, this.address + (long)n, d);
    }
}

