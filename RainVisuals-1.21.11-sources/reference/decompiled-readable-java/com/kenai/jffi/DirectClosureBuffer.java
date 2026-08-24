/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Closure;
import com.kenai.jffi.MemoryIO;
import com.kenai.jffi.Platform;

final class DirectClosureBuffer
implements Closure.Buffer {
    private final long retval;
    private final CallContext callContext;
    private static final MemoryIO IO = MemoryIO.getInstance();
    private final long parameters;
    private static final NativeWordIO WordIO = NativeWordIO.getInstance();
    private static final long PARAM_SIZE = Platform.getPlatform().addressSize() / 8;

    @Override
    public final void setIntReturn(int value) {
        WordIO.put(this.retval, value);
    }

    @Override
    public final void setFloatReturn(float value) {
        IO.putFloat(this.retval, value);
    }

    @Override
    public final void setDoubleReturn(double value) {
        IO.putDouble(this.retval, value);
    }

    @Override
    public final long getStruct(int index) {
        return IO.getAddress(this.parameters + (long)index * PARAM_SIZE);
    }

    public DirectClosureBuffer(CallContext callContext, long retval, long parameters) {
        this.callContext = callContext;
        this.retval = retval;
        this.parameters = parameters;
    }

    @Override
    public final short getShort(int index) {
        return IO.getShort(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final byte getByte(int index) {
        return IO.getByte(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final float getFloat(int index) {
        return IO.getFloat(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final long getLong(int index) {
        return IO.getLong(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final double getDouble(int index) {
        return IO.getDouble(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final int getInt(int index) {
        return IO.getInt(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public final void setByteReturn(byte value) {
        WordIO.put(this.retval, value);
    }

    @Override
    public final void setLongReturn(long value) {
        IO.putLong(this.retval, value);
    }

    @Override
    public void setStructReturn(byte[] data, int offset) {
        IO.putByteArray(this.retval, data, offset, this.callContext.getReturnType().size());
    }

    @Override
    public final void setShortReturn(short value) {
        WordIO.put(this.retval, value);
    }

    @Override
    public final long getAddress(int index) {
        return IO.getAddress(IO.getAddress(this.parameters + (long)index * PARAM_SIZE));
    }

    @Override
    public void setStructReturn(long value) {
        IO.copyMemory(value, this.retval, this.callContext.getReturnType().size());
    }

    @Override
    public final void setAddressReturn(long address) {
        IO.putAddress(this.retval, address);
    }

    private static final class NativeWordIO64
    extends NativeWordIO {
        private static final MemoryIO IO = MemoryIO.getInstance();
        static final NativeWordIO INSTANCE = new NativeWordIO64();

        private NativeWordIO64() {
        }

        @Override
        int get(long address) {
            return (int)IO.getLong(address);
        }

        @Override
        void put(long address, int value) {
            IO.putLong(address, value);
        }
    }

    private static final class NativeWordIO32
    extends NativeWordIO {
        static final NativeWordIO INSTANCE;
        private static final MemoryIO IO;

        @Override
        int get(long address) {
            return IO.getInt(address);
        }

        static {
            IO = MemoryIO.getInstance();
            INSTANCE = new NativeWordIO32();
        }

        @Override
        void put(long address, int value) {
            IO.putInt(address, value);
        }

        private NativeWordIO32() {
        }
    }

    private static abstract class NativeWordIO {
        private NativeWordIO() {
        }

        abstract void put(long var1, int var3);

        abstract int get(long var1);

        public static final NativeWordIO getInstance() {
            return Platform.getPlatform().addressSize() == 32 ? NativeWordIO32.INSTANCE : NativeWordIO64.INSTANCE;
        }
    }
}

