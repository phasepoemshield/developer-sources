/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;

public class MessageBufferU
extends MessageBuffer {
    private final ByteBuffer wrap;

    MessageBufferU(byte[] byArray, int n, int n2) {
        super(byArray, n, n2);
        this.wrap = ByteBuffer.wrap(byArray, n, n2).slice();
    }

    MessageBufferU(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.wrap = byteBuffer.slice();
    }

    private MessageBufferU(Object object, long l, int n, ByteBuffer byteBuffer) {
        super(object, l, n);
        this.wrap = byteBuffer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public MessageBufferU slice(int n, int n2) {
        if (n == 0 && n2 == this.size()) {
            return this;
        }
        Preconditions.checkArgument(n + n2 <= this.size());
        try {
            this.wrap.position(n);
            this.wrap.limit(n + n2);
            MessageBufferU messageBufferU = new MessageBufferU(this.base, this.address + (long)n, n2, this.wrap.slice());
            return messageBufferU;
        }
        finally {
            this.resetBufferPosition();
        }
    }

    private void resetBufferPosition() {
        this.wrap.position(0);
        this.wrap.limit(this.size);
    }

    @Override
    public byte getByte(int n) {
        return this.wrap.get(n);
    }

    @Override
    public boolean getBoolean(int n) {
        return this.wrap.get(n) != 0;
    }

    @Override
    public short getShort(int n) {
        return this.wrap.getShort(n);
    }

    @Override
    public int getInt(int n) {
        return this.wrap.getInt(n);
    }

    @Override
    public float getFloat(int n) {
        return this.wrap.getFloat(n);
    }

    @Override
    public long getLong(int n) {
        return this.wrap.getLong(n);
    }

    @Override
    public double getDouble(int n) {
        return this.wrap.getDouble(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void getBytes(int n, int n2, ByteBuffer byteBuffer) {
        try {
            this.wrap.position(n);
            this.wrap.limit(n + n2);
            byteBuffer.put(this.wrap);
        }
        finally {
            this.resetBufferPosition();
        }
    }

    @Override
    public void putByte(int n, byte by) {
        this.wrap.put(n, by);
    }

    @Override
    public void putBoolean(int n, boolean bl) {
        this.wrap.put(n, bl ? (byte)1 : 0);
    }

    @Override
    public void putShort(int n, short s) {
        this.wrap.putShort(n, s);
    }

    @Override
    public void putInt(int n, int n2) {
        this.wrap.putInt(n, n2);
    }

    @Override
    public void putFloat(int n, float f) {
        this.wrap.putFloat(n, f);
    }

    @Override
    public void putLong(int n, long l) {
        this.wrap.putLong(n, l);
    }

    @Override
    public void putDouble(int n, double d) {
        this.wrap.putDouble(n, d);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ByteBuffer sliceAsByteBuffer(int n, int n2) {
        try {
            this.wrap.position(n);
            this.wrap.limit(n + n2);
            ByteBuffer byteBuffer = this.wrap.slice();
            return byteBuffer;
        }
        finally {
            this.resetBufferPosition();
        }
    }

    @Override
    public ByteBuffer sliceAsByteBuffer() {
        return this.sliceAsByteBuffer(0, this.size);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void getBytes(int n, byte[] byArray, int n2, int n3) {
        try {
            this.wrap.position(n);
            this.wrap.get(byArray, n2, n3);
        }
        finally {
            this.resetBufferPosition();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void putByteBuffer(int n, ByteBuffer byteBuffer, int n2) {
        assert (n2 <= byteBuffer.remaining());
        if (byteBuffer.hasArray()) {
            this.putBytes(n, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), n2);
            byteBuffer.position(byteBuffer.position() + n2);
        } else {
            int n3 = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + n2);
                this.wrap.position(n);
                this.wrap.put(byteBuffer);
            }
            finally {
                byteBuffer.limit(n3);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void putBytes(int n, byte[] byArray, int n2, int n3) {
        try {
            this.wrap.position(n);
            this.wrap.put(byArray, n2, n3);
        }
        finally {
            this.resetBufferPosition();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void copyTo(int n, MessageBuffer messageBuffer, int n2, int n3) {
        try {
            this.wrap.position(n);
            messageBuffer.putByteBuffer(n2, this.wrap, n3);
        }
        finally {
            this.resetBufferPosition();
        }
    }

    @Override
    public void putMessageBuffer(int n, MessageBuffer messageBuffer, int n2, int n3) {
        this.putByteBuffer(n, messageBuffer.sliceAsByteBuffer(n2, n3), n3);
    }

    @Override
    public byte[] toByteArray() {
        byte[] byArray = new byte[this.size()];
        this.getBytes(0, byArray, 0, byArray.length);
        return byArray;
    }

    @Override
    public boolean hasArray() {
        return !this.wrap.isDirect();
    }

    @Override
    public byte[] array() {
        return this.hasArray() ? this.wrap.array() : null;
    }
}

