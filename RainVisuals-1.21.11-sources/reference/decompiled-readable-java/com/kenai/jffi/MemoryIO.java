/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.Platform;
import com.kenai.jffi.UnsafeMemoryIO;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class MemoryIO {
    final Foreign foreign = Foreign.getInstance();
    static final long ADDRESS_MASK = Platform.getPlatform().addressMask();

    public abstract void getShortArray(long var1, short[] var3, int var4, int var5);

    private static MemoryIO newUnsafeImpl64() {
        return new UnsafeMemoryIO.UnsafeMemoryIO64();
    }

    private static MemoryIO newNativeImpl64() {
        return new NativeImpl64();
    }

    private static MemoryIO newNativeImpl() {
        return Platform.getPlatform().addressSize() == 32 ? MemoryIO.newNativeImpl32() : MemoryIO.newNativeImpl64();
    }

    public abstract byte[] getZeroTerminatedByteArray(long var1);

    public abstract void putShortArray(long var1, short[] var3, int var4, int var5);

    public final ByteBuffer newDirectByteBuffer(long address, int capacity) {
        return this.foreign.newDirectByteBuffer(address, capacity);
    }

    public abstract void putByteArray(long var1, byte[] var3, int var4, int var5);

    public abstract void putFloat(long var1, float var3);

    public abstract void memcpy(long var1, long var3, long var5);

    public final void memset(long address, int value, long size) {
        this.setMemory(address, size, (byte)value);
    }

    public abstract void putLong(long var1, long var3);

    public abstract void getCharArray(long var1, char[] var3, int var4, int var5);

    public abstract void putCharArray(long var1, char[] var3, int var4, int var5);

    @Deprecated
    public final byte[] getZeroTerminatedByteArray(long address, long maxlen) {
        return this.getZeroTerminatedByteArray(address, (int)maxlen);
    }

    public abstract void putInt(long var1, int var3);

    public static MemoryIO getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static MemoryIO getCheckedInstance() {
        return CheckedMemorySingletonHolder.INSTANCE;
    }

    public abstract short getShort(long var1);

    public abstract float getFloat(long var1);

    public abstract void putDoubleArray(long var1, double[] var3, int var4, int var5);

    private static MemoryIO newUnsafeImpl() {
        return Platform.getPlatform().addressSize() == 32 ? MemoryIO.newUnsafeImpl32() : MemoryIO.newUnsafeImpl64();
    }

    static /* synthetic */ MemoryIO access$000() {
        return MemoryIO.newMemoryIO();
    }

    public abstract void getFloatArray(long var1, float[] var3, int var4, int var5);

    static boolean isUnsafeAvailable() {
        try {
            Class[] primitiveTypes;
            Class<?> sunClass = Class.forName("sun.misc.Unsafe");
            Class[] classArray = new Class[6];
            classArray[0] = Byte.TYPE;
            classArray[1] = Short.TYPE;
            classArray[2] = Integer.TYPE;
            classArray[3] = Long.TYPE;
            classArray[4] = Float.TYPE;
            classArray[5] = Double.TYPE;
            Class[] classArray2 = primitiveTypes = classArray;
            int n = classArray2.length;
            for (int i = 0; i < n; ++i) {
                Class clazz = classArray2[i];
                MemoryIO.verifyAccessor(sunClass, clazz);
            }
            Class[] classArray3 = new Class[1];
            classArray3[0] = Long.TYPE;
            sunClass.getDeclaredMethod("getAddress", classArray3);
            Class[] classArray4 = new Class[2];
            classArray4[0] = Long.TYPE;
            classArray4[1] = Long.TYPE;
            sunClass.getDeclaredMethod("putAddress", classArray4);
            Class[] classArray5 = new Class[1];
            classArray5[0] = Long.TYPE;
            sunClass.getDeclaredMethod("allocateMemory", classArray5);
            Class[] classArray6 = new Class[1];
            classArray6[0] = Long.TYPE;
            sunClass.getDeclaredMethod("freeMemory", classArray6);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public abstract long getStringLength(long var1);

    public abstract long memchr(long var1, int var3, long var4);

    public abstract void getDoubleArray(long var1, double[] var3, int var4, int var5);

    private static MemoryIO newMemoryIO() {
        try {
            if (Boolean.getBoolean("jffi.memory.checked")) {
                return MemoryIO.newNativeCheckedImpl();
            }
            return !Boolean.getBoolean("jffi.unsafe.disabled") && MemoryIO.isUnsafeAvailable() ? MemoryIO.newUnsafeImpl() : MemoryIO.newNativeImpl();
        }
        catch (Throwable t) {
            return MemoryIO.newNativeImpl();
        }
    }

    public final long indexOf(long address, byte value, int maxlen) {
        long location = this.memchr(address, value, maxlen);
        return location != 0L ? location - address : -1L;
    }

    public abstract int getInt(long var1);

    abstract void _copyMemory(long var1, long var3, long var5);

    MemoryIO() {
    }

    public final void copyMemory(long src, long dst, long size) {
        if (dst + size <= src || src + size <= dst) {
            this._copyMemory(src, dst, size);
        } else {
            this.memmove(dst, src, size);
        }
    }

    public abstract void memmove(long var1, long var3, long var5);

    public abstract long getLong(long var1);

    public abstract void putAddress(long var1, long var3);

    public abstract void putIntArray(long var1, int[] var3, int var4, int var5);

    public abstract void putShort(long var1, short var3);

    public abstract void putByte(long var1, byte var3);

    public abstract double getDouble(long var1);

    public final long getDirectBufferAddress(Buffer buffer) {
        return this.foreign.getDirectBufferAddress(buffer);
    }

    public final long indexOf(long address, byte value) {
        long location = this.memchr(address, value, Integer.MAX_VALUE);
        return location != 0L ? location - address : -1L;
    }

    public abstract byte getByte(long var1);

    public abstract long getAddress(long var1);

    private static MemoryIO newNativeImpl32() {
        return new NativeImpl32();
    }

    private static MemoryIO newUnsafeImpl32() {
        return new UnsafeMemoryIO.UnsafeMemoryIO32();
    }

    public final void freeMemory(long address) {
        Foreign.freeMemory(address);
    }

    public abstract void putFloatArray(long var1, float[] var3, int var4, int var5);

    public abstract byte[] getZeroTerminatedByteArray(long var1, int var3);

    public abstract void putDouble(long var1, double var3);

    public abstract void putLongArray(long var1, long[] var3, int var4, int var5);

    public final long allocateMemory(long size, boolean clear) {
        return Foreign.allocateMemory(size, clear) & ADDRESS_MASK;
    }

    public abstract void getLongArray(long var1, long[] var3, int var4, int var5);

    static /* synthetic */ MemoryIO access$100() {
        return MemoryIO.newNativeCheckedImpl();
    }

    public abstract void putZeroTerminatedByteArray(long var1, byte[] var3, int var4, int var5);

    public abstract void getIntArray(long var1, int[] var3, int var4, int var5);

    /*
     * WARNING - void declaration
     */
    private static void verifyAccessor(Class unsafeClass, Class primitive) throws NoSuchMethodException {
        void var1_1;
        String primitiveName = primitive.getSimpleName();
        String typeName = primitiveName.substring(0, 1).toUpperCase() + primitiveName.substring(1);
        Class[] classArray = new Class[1];
        classArray[0] = Long.TYPE;
        Method get = unsafeClass.getDeclaredMethod("get" + typeName, classArray);
        if (!get.getReturnType().equals(primitive)) {
            throw new NoSuchMethodException("Incorrect return type for " + get.getName());
        }
        Class[] classArray2 = new Class[2];
        classArray2[0] = Long.TYPE;
        classArray2[1] = var1_1;
        unsafeClass.getDeclaredMethod("put" + typeName, classArray2);
    }

    public abstract void getByteArray(long var1, byte[] var3, int var4, int var5);

    private static MemoryIO newNativeCheckedImpl() {
        return Foreign.isMemoryProtectionEnabled() ? new CheckedNativeImpl() : MemoryIO.newNativeImpl();
    }

    public abstract void setMemory(long var1, long var3, byte var5);

    private static final class NativeImpl32
    extends NativeImpl {
        @Override
        public final void putAddress(long address, long value) {
            Foreign.putInt(address, (int)value);
        }

        private NativeImpl32() {
        }

        @Override
        public final long getAddress(long address) {
            return (long)Foreign.getInt(address) & ADDRESS_MASK;
        }
    }

    private static final class CheckedNativeImpl
    extends MemoryIO {
        @Override
        public final void putByteArray(long address, byte[] data, int offset, int length) {
            Foreign.putByteArrayChecked(address, data, offset, length);
        }

        @Override
        public final long getStringLength(long address) {
            return Foreign.strlenChecked(address);
        }

        @Override
        public final void putByte(long address, byte value) {
            Foreign.putByteChecked(address, value);
        }

        @Override
        public final void putShortArray(long address, short[] data, int offset, int length) {
            Foreign.putShortArrayChecked(address, data, offset, length);
        }

        @Override
        public final int getInt(long address) {
            return Foreign.getIntChecked(address);
        }

        @Override
        public final void putFloatArray(long address, float[] data, int offset, int length) {
            Foreign.putFloatArrayChecked(address, data, offset, length);
        }

        @Override
        public final void getByteArray(long address, byte[] data, int offset, int length) {
            Foreign.getByteArrayChecked(address, data, offset, length);
        }

        @Override
        public final void putLongArray(long address, long[] data, int offset, int length) {
            Foreign.putLongArrayChecked(address, data, offset, length);
        }

        @Override
        public final void setMemory(long address, long size, byte value) {
            Foreign.setMemoryChecked(address, size, value);
        }

        @Override
        public final void putCharArray(long address, char[] data, int offset, int length) {
            Foreign.putCharArrayChecked(address, data, offset, length);
        }

        @Override
        public final byte getByte(long address) {
            return Foreign.getByteChecked(address);
        }

        @Override
        public final void memcpy(long dst, long src, long size) {
            Foreign.memcpyChecked(dst, src, size);
        }

        @Override
        public final void putLong(long address, long value) {
            Foreign.putLongChecked(address, value);
        }

        @Override
        public final void memmove(long dst, long src, long size) {
            Foreign.memmoveChecked(dst, src, size);
        }

        @Override
        public final float getFloat(long address) {
            return Foreign.getFloatChecked(address);
        }

        @Override
        public final void _copyMemory(long src, long dst, long size) {
            Foreign.copyMemoryChecked(src, dst, size);
        }

        @Override
        public final void putAddress(long address, long value) {
            Foreign.putAddressChecked(address, value);
        }

        @Override
        public final short getShort(long address) {
            return Foreign.getShortChecked(address);
        }

        @Override
        public final void getShortArray(long address, short[] data, int offset, int length) {
            Foreign.getShortArrayChecked(address, data, offset, length);
        }

        @Override
        public final double getDouble(long address) {
            return Foreign.getDoubleChecked(address);
        }

        @Override
        public final void putDoubleArray(long address, double[] data, int offset, int length) {
            Foreign.putDoubleArrayChecked(address, data, offset, length);
        }

        private CheckedNativeImpl() {
        }

        @Override
        public final void putZeroTerminatedByteArray(long address, byte[] data, int offset, int length) {
            Foreign.putZeroTerminatedByteArrayChecked(address, data, offset, length);
        }

        @Override
        public final long getLong(long address) {
            return Foreign.getLongChecked(address);
        }

        @Override
        public final void getDoubleArray(long address, double[] data, int offset, int length) {
            Foreign.getDoubleArrayChecked(address, data, offset, length);
        }

        @Override
        public final void getIntArray(long address, int[] data, int offset, int length) {
            Foreign.getIntArrayChecked(address, data, offset, length);
        }

        @Override
        public final void putInt(long address, int value) {
            Foreign.putIntChecked(address, value);
        }

        @Override
        public final long memchr(long address, int value, long size) {
            return Foreign.memchrChecked(address, value, size);
        }

        @Override
        public final void getFloatArray(long address, float[] data, int offset, int length) {
            Foreign.getFloatArrayChecked(address, data, offset, length);
        }

        @Override
        public final void putIntArray(long address, int[] data, int offset, int length) {
            Foreign.putIntArrayChecked(address, data, offset, length);
        }

        @Override
        public final void getCharArray(long address, char[] data, int offset, int length) {
            Foreign.getCharArrayChecked(address, data, offset, length);
        }

        @Override
        public final byte[] getZeroTerminatedByteArray(long address) {
            return Foreign.getZeroTerminatedByteArrayChecked(address);
        }

        @Override
        public final void getLongArray(long address, long[] data, int offset, int length) {
            Foreign.getLongArrayChecked(address, data, offset, length);
        }

        @Override
        public final byte[] getZeroTerminatedByteArray(long address, int maxlen) {
            return Foreign.getZeroTerminatedByteArrayChecked(address, maxlen);
        }

        @Override
        public final void putShort(long address, short value) {
            Foreign.putShortChecked(address, value);
        }

        @Override
        public final long getAddress(long address) {
            return Foreign.getAddressChecked(address) & ADDRESS_MASK;
        }

        @Override
        public final void putDouble(long address, double value) {
            Foreign.putDoubleChecked(address, value);
        }

        @Override
        public final void putFloat(long address, float value) {
            Foreign.putFloatChecked(address, value);
        }
    }

    private static final class CheckedMemorySingletonHolder {
        private static final MemoryIO INSTANCE = MemoryIO.access$100();

        private CheckedMemorySingletonHolder() {
        }
    }

    private static final class NativeImpl64
    extends NativeImpl {
        @Override
        public final long getAddress(long address) {
            return Foreign.getLong(address);
        }

        private NativeImpl64() {
        }

        @Override
        public final void putAddress(long address, long value) {
            Foreign.putLong(address, value);
        }
    }

    private static final class SingletonHolder {
        private static final MemoryIO INSTANCE = MemoryIO.access$000();

        private SingletonHolder() {
        }
    }

    private static abstract class NativeImpl
    extends MemoryIO {
        @Override
        public final byte[] getZeroTerminatedByteArray(long address, int maxlen) {
            return Foreign.getZeroTerminatedByteArray(address, maxlen);
        }

        @Override
        public final long memchr(long address, int value, long size) {
            return Foreign.memchr(address, value, size);
        }

        @Override
        public final void putInt(long address, int value) {
            Foreign.putInt(address, value);
        }

        @Override
        public final void getByteArray(long address, byte[] data, int offset, int length) {
            Foreign.getByteArray(address, data, offset, length);
        }

        @Override
        public final void putLong(long address, long value) {
            Foreign.putLong(address, value);
        }

        @Override
        public final void putDouble(long address, double value) {
            Foreign.putDouble(address, value);
        }

        @Override
        public final void putLongArray(long address, long[] data, int offset, int length) {
            Foreign.putLongArray(address, data, offset, length);
        }

        @Override
        public final void putZeroTerminatedByteArray(long address, byte[] data, int offset, int length) {
            Foreign.putZeroTerminatedByteArray(address, data, offset, length);
        }

        @Override
        public final long getStringLength(long address) {
            return Foreign.strlen(address);
        }

        @Override
        public final void getDoubleArray(long address, double[] data, int offset, int length) {
            Foreign.getDoubleArray(address, data, offset, length);
        }

        @Override
        public final long getLong(long address) {
            return Foreign.getLong(address);
        }

        @Override
        public final void putShort(long address, short value) {
            Foreign.putShort(address, value);
        }

        @Override
        public final void memmove(long dst, long src, long size) {
            Foreign.memmove(dst, src, size);
        }

        @Override
        public final void putCharArray(long address, char[] data, int offset, int length) {
            Foreign.putCharArray(address, data, offset, length);
        }

        @Override
        public final void getCharArray(long address, char[] data, int offset, int length) {
            Foreign.getCharArray(address, data, offset, length);
        }

        private NativeImpl() {
        }

        @Override
        public final void putShortArray(long address, short[] data, int offset, int length) {
            Foreign.putShortArray(address, data, offset, length);
        }

        @Override
        public final void putByteArray(long address, byte[] data, int offset, int length) {
            Foreign.putByteArray(address, data, offset, length);
        }

        @Override
        public final void getIntArray(long address, int[] data, int offset, int length) {
            Foreign.getIntArray(address, data, offset, length);
        }

        @Override
        public final void putFloatArray(long address, float[] data, int offset, int length) {
            Foreign.putFloatArray(address, data, offset, length);
        }

        @Override
        public final byte[] getZeroTerminatedByteArray(long address) {
            return Foreign.getZeroTerminatedByteArray(address);
        }

        @Override
        public final int getInt(long address) {
            return Foreign.getInt(address);
        }

        @Override
        public final float getFloat(long address) {
            return Foreign.getFloat(address);
        }

        @Override
        public final void putIntArray(long address, int[] data, int offset, int length) {
            Foreign.putIntArray(address, data, offset, length);
        }

        @Override
        public final byte getByte(long address) {
            return Foreign.getByte(address);
        }

        @Override
        public final void putDoubleArray(long address, double[] data, int offset, int length) {
            Foreign.putDoubleArray(address, data, offset, length);
        }

        @Override
        public final double getDouble(long address) {
            return Foreign.getDouble(address);
        }

        @Override
        public final void getShortArray(long address, short[] data, int offset, int length) {
            Foreign.getShortArray(address, data, offset, length);
        }

        @Override
        public final void getLongArray(long address, long[] data, int offset, int length) {
            Foreign.getLongArray(address, data, offset, length);
        }

        @Override
        public final void memcpy(long dst, long src, long size) {
            Foreign.memcpy(dst, src, size);
        }

        @Override
        public final void setMemory(long address, long size, byte value) {
            Foreign.setMemory(address, size, value);
        }

        @Override
        public final void _copyMemory(long src, long dst, long size) {
            Foreign.copyMemory(src, dst, size);
        }

        @Override
        public final void putFloat(long address, float value) {
            Foreign.putFloat(address, value);
        }

        @Override
        public final void getFloatArray(long address, float[] data, int offset, int length) {
            Foreign.getFloatArray(address, data, offset, length);
        }

        @Override
        public final void putByte(long address, byte value) {
            Foreign.putByte(address, value);
        }

        @Override
        public final short getShort(long address) {
            return Foreign.getShort(address);
        }
    }
}

