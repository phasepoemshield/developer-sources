/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.AbstractMemoryIO;
import jnr.ffi.provider.DelegatingMemoryIO;
import jnr.ffi.provider.jffi.MemoryUtil;

class DirectMemoryIO
extends AbstractMemoryIO {
    static final MemoryIO IO = MemoryIO.getInstance();

    @Override
    public final void get(long offset, long[] dst, int off, int len) {
        IO.getLongArray(this.address() + offset, dst, off, len);
    }

    @Override
    public boolean hasArray() {
        return false;
    }

    @Override
    public final void get(long offset, double[] dst, int off, int len) {
        IO.getDoubleArray(this.address() + offset, dst, off, len);
    }

    @Override
    public final void put(long offset, byte[] src, int off, int len) {
        IO.putByteArray(this.address() + offset, src, off, len);
    }

    @Override
    public final void putLongLong(long offset, long value) {
        IO.putLong(this.address() + offset, value);
    }

    @Override
    public final void putDouble(long offset, double value) {
        IO.putDouble(this.address() + offset, value);
    }

    @Override
    public void putString(long offset, String string, int maxLength, Charset cs) {
        ByteBuffer buf = cs.encode(string);
        int len = Math.min(maxLength, buf.remaining());
        IO.putZeroTerminatedByteArray(this.address() + offset, buf.array(), buf.arrayOffset() + buf.position(), len);
    }

    @Override
    public final float getFloat(long offset) {
        return IO.getFloat(this.address() + offset);
    }

    DirectMemoryIO(Runtime runtime, long address) {
        super(runtime, address, true);
    }

    @Override
    public final void putFloat(long offset, float value) {
        IO.putFloat(this.address() + offset, value);
    }

    @Override
    public int arrayLength() {
        throw new UnsupportedOperationException("no array");
    }

    @Override
    public final void get(long offset, short[] dst, int off, int len) {
        IO.getShortArray(this.address() + offset, dst, off, len);
    }

    @Override
    public final void put(long offset, float[] src, int off, int len) {
        IO.putFloatArray(this.address() + offset, src, off, len);
    }

    @Override
    public final void put(long offset, long[] src, int off, int len) {
        IO.putLongArray(this.address() + offset, src, off, len);
    }

    @Override
    public final void put(long offset, short[] src, int off, int len) {
        IO.putShortArray(this.address() + offset, src, off, len);
    }

    @Override
    public final void putInt(long offset, int value) {
        IO.putInt(this.address() + offset, value);
    }

    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException("no array");
    }

    @Override
    public final long getLongLong(long offset) {
        return IO.getLong(this.address() + offset);
    }

    public boolean equals(Object obj) {
        return obj instanceof Pointer && ((Pointer)obj).address() == this.address() && ((Pointer)obj).getRuntime().isCompatible(this.getRuntime());
    }

    @Override
    public final short getShort(long offset) {
        return IO.getShort(this.address() + offset);
    }

    @Override
    public final double getDouble(long offset) {
        return IO.getDouble(this.address() + offset);
    }

    @Override
    public long size() {
        return Long.MAX_VALUE;
    }

    @Override
    public final byte getByte(long offset) {
        return IO.getByte(this.address() + offset);
    }

    @Override
    public final void get(long offset, int[] dst, int off, int len) {
        IO.getIntArray(this.address() + offset, dst, off, len);
    }

    @Override
    public Object array() {
        throw new UnsupportedOperationException("no array");
    }

    @Override
    public final void put(long offset, int[] src, int off, int len) {
        IO.putIntArray(this.address() + offset, src, off, len);
    }

    @Override
    public String getString(long offset) {
        return Charset.defaultCharset().decode(ByteBuffer.wrap(IO.getZeroTerminatedByteArray(this.address() + offset))).toString();
    }

    @Override
    public void transferTo(long offset, Pointer other, long otherOffset, long count) {
        Pointer dst = other instanceof DelegatingMemoryIO ? ((DelegatingMemoryIO)((Object)other)).getDelegatedMemoryIO() : other;
        if (dst instanceof DirectMemoryIO) {
            other.checkBounds(otherOffset, count);
            DirectMemoryIO.memcpy(this, offset, (DirectMemoryIO)dst, otherOffset, count);
        } else {
            super.transferTo(offset, other, otherOffset, count);
        }
    }

    @Override
    public void transferFrom(long offset, Pointer other, long otherOffset, long count) {
        Pointer src = other instanceof DelegatingMemoryIO ? ((DelegatingMemoryIO)((Object)other)).getDelegatedMemoryIO() : other;
        if (src instanceof DirectMemoryIO) {
            other.checkBounds(otherOffset, count);
            DirectMemoryIO.memcpy((DirectMemoryIO)src, otherOffset, this, offset, count);
        } else {
            super.transferFrom(offset, other, otherOffset, count);
        }
    }

    @Override
    public Pointer getPointer(long offset) {
        return MemoryUtil.newPointer(this.getRuntime(), IO.getAddress(this.address() + offset));
    }

    @Override
    public final void get(long offset, float[] dst, int off, int len) {
        IO.getFloatArray(this.address() + offset, dst, off, len);
    }

    @Override
    public Pointer getPointer(long offset, long size) {
        return MemoryUtil.newPointer(this.getRuntime(), IO.getAddress(this.address() + offset), size);
    }

    @Override
    public final void setMemory(long offset, long size, byte value) {
        IO.setMemory(this.address() + offset, size, value);
    }

    public void putZeroTerminatedByteArray(long offset, byte[] src, int off, int len) {
        IO.putZeroTerminatedByteArray(this.address() + offset, src, off, len);
    }

    private static void memcpy(DirectMemoryIO src, long srcOffset, DirectMemoryIO dst, long dstOffset, long count) {
        IO.memcpy(dst.address() + dstOffset, src.address() + srcOffset, count);
    }

    @Override
    public final int getInt(long offset) {
        return IO.getInt(this.address() + offset);
    }

    @Override
    public String getString(long offset, int maxLength, Charset cs) {
        byte[] bytes = IO.getZeroTerminatedByteArray(this.address() + offset, maxLength);
        return cs.decode(ByteBuffer.wrap(bytes)).toString();
    }

    @Override
    public final void put(long offset, double[] src, int off, int len) {
        IO.putDoubleArray(this.address() + offset, src, off, len);
    }

    @Override
    public int indexOf(long offset, byte value, int maxlen) {
        return (int)IO.indexOf(this.address() + offset, value, maxlen);
    }

    public int hashCode() {
        return (int)(this.address() << 32 ^ this.address());
    }

    @Override
    public void putPointer(long offset, Pointer value) {
        IO.putAddress(this.address() + offset, value != null ? value.address() : 0L);
    }

    @Override
    public final void putByte(long offset, byte value) {
        IO.putByte(this.address() + offset, value);
    }

    DirectMemoryIO(Runtime runtime, int address) {
        super(runtime, (long)address & 0xFFFFFFFFL, true);
    }

    @Override
    public final void putShort(long offset, short value) {
        IO.putShort(this.address() + offset, value);
    }

    @Override
    public final void get(long offset, byte[] dst, int off, int len) {
        IO.getByteArray(this.address() + offset, dst, off, len);
    }
}

