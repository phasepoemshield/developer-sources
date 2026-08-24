/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import jnr.ffi.Address;
import jnr.ffi.Runtime;
import jnr.ffi.Type;

public abstract class Pointer {
    private final boolean isDirect;
    private final Runtime runtime;
    private final long address;

    public abstract double getDouble(long var1);

    public static Pointer wrap(Runtime runtime, long address) {
        return runtime.getMemoryManager().newPointer(address);
    }

    public abstract void putNativeLong(long var1, long var3);

    public abstract byte getByte(long var1);

    public abstract int indexOf(long var1, byte var3, int var4);

    public abstract int arrayLength();

    /*
     * WARNING - void declaration
     */
    public String toString() {
        void var1_1;
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        Object[] objectArray = new Object[1];
        objectArray[0] = this.address();
        sb.append(String.format("[address=%#x", objectArray));
        if (this.size() != Long.MAX_VALUE) {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = this.size();
            sb.append(String.format(" size=%d", objectArray2));
        }
        sb.append(']');
        return var1_1.toString();
    }

    public abstract long getLong(long var1);

    public static Pointer newIntPointer(Runtime runtime, long address) {
        return runtime.getMemoryManager().newOpaquePointer(address);
    }

    public abstract void get(long var1, long[] var3, int var4, int var5);

    public abstract void putLong(long var1, long var3);

    public abstract void put(long var1, int[] var3, int var4, int var5);

    public abstract Pointer getPointer(long var1);

    public String[] getNullTerminatedStringArray(long offset) {
        Pointer ptr = this.getPointer(offset);
        if (ptr == null) {
            return new String[0];
        }
        int pointerSize = this.getRuntime().addressSize();
        ArrayList<String> array = new ArrayList<String>();
        array.add(ptr.getString(0L));
        int off = pointerSize;
        while ((ptr = this.getPointer(offset + (long)off)) != null) {
            array.add(ptr.getString(0L));
            int n = off + pointerSize;
        }
        return array.toArray(new String[array.size()]);
    }

    public abstract void get(long var1, double[] var3, int var4, int var5);

    public abstract long getNativeLong(long var1);

    public abstract long size();

    public abstract void transferFrom(long var1, Pointer var3, long var4, long var6);

    public abstract void get(long var1, float[] var3, int var4, int var5);

    public abstract String getString(long var1, int var3, Charset var4);

    public abstract float getFloat(long var1);

    public abstract Object array();

    public abstract void get(long var1, short[] var3, int var4, int var5);

    public abstract void putInt(Type var1, long var2, long var4);

    public abstract Pointer slice(long var1);

    public final long address() {
        return this.address;
    }

    public abstract void put(long var1, double[] var3, int var4, int var5);

    public abstract Pointer slice(long var1, long var3);

    public abstract void putPointer(long var1, Pointer var3);

    public abstract void put(long var1, byte[] var3, int var4, int var5);

    public abstract void transferTo(long var1, Pointer var3, long var4, long var6);

    public abstract void putByte(long var1, byte var3);

    public abstract void putShort(long var1, short var3);

    public static Pointer wrap(Runtime runtime, long address, long size) {
        return runtime.getMemoryManager().newPointer(address, size);
    }

    public void put(long offset, Pointer[] src, int idx, int len) {
        int pointerSize = this.getRuntime().addressSize();
        for (int i = 0; i < len; ++i) {
            this.putPointer(offset + (long)(i * pointerSize), src[idx + i]);
        }
    }

    public abstract long getInt(Type var1, long var2);

    public final Runtime getRuntime() {
        return this.runtime;
    }

    public abstract Pointer getPointer(long var1, long var3);

    public abstract void putString(long var1, String var3, int var4, Charset var5);

    public abstract void putFloat(long var1, float var3);

    public abstract void checkBounds(long var1, long var3);

    protected Pointer(Runtime runtime, long address, boolean direct) {
        this.runtime = runtime;
        this.address = address;
        this.isDirect = direct;
    }

    public abstract long getAddress(long var1);

    public abstract String getString(long var1);

    public static Pointer wrap(Runtime runtime, ByteBuffer buffer) {
        return runtime.getMemoryManager().newPointer(buffer);
    }

    public abstract void get(long var1, byte[] var3, int var4, int var5);

    public abstract void putAddress(long var1, Address var3);

    public abstract int arrayOffset();

    public abstract void putAddress(long var1, long var3);

    public abstract void get(long var1, int[] var3, int var4, int var5);

    public final boolean isDirect() {
        return this.isDirect;
    }

    public abstract void put(long var1, long[] var3, int var4, int var5);

    public abstract int indexOf(long var1, byte var3);

    public abstract boolean hasArray();

    public abstract void put(long var1, float[] var3, int var4, int var5);

    public void get(long offset, Pointer[] dst, int idx, int len) {
        int pointerSize = this.getRuntime().addressSize();
        for (int i = 0; i < len; ++i) {
            dst[idx + i] = this.getPointer(offset + (long)(i * pointerSize));
        }
    }

    public abstract long getLongLong(long var1);

    public abstract void putDouble(long var1, double var3);

    public abstract void put(long var1, short[] var3, int var4, int var5);

    public abstract void setMemory(long var1, long var3, byte var5);

    public abstract void putLongLong(long var1, long var3);

    public Pointer[] getNullTerminatedPointerArray(long offset) {
        Pointer ptr = this.getPointer(offset);
        if (ptr == null) {
            return new Pointer[0];
        }
        int pointerSize = this.getRuntime().addressSize();
        ArrayList<Pointer> array = new ArrayList<Pointer>();
        array.add(ptr);
        int off = pointerSize;
        while ((ptr = this.getPointer(offset + (long)off)) != null) {
            array.add(ptr);
            off += pointerSize;
        }
        return array.toArray(new Pointer[array.size()]);
    }

    public abstract void putInt(long var1, int var3);

    public abstract short getShort(long var1);

    public abstract int getInt(long var1);
}

