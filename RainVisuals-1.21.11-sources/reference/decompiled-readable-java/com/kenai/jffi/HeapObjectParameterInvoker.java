/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.Function;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.ObjectParameterInfo;
import com.kenai.jffi.ObjectParameterInvoker;
import com.kenai.jffi.Type;

final class HeapObjectParameterInvoker
extends ObjectParameterInvoker {
    private final Foreign foreign;

    @Override
    public long invokeN4O2rN(Function function, long n1, long n2, long n3, long n4, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return this.invokeO2(function, HeapObjectParameterInvoker.encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
    }

    HeapObjectParameterInvoker(Foreign foreign) {
        this.foreign = foreign;
    }

    private long invokeO1(Function function, byte[] paramBuffer, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return function.getReturnType().size() == 8 ? Foreign.invokeArrayO1Int64(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len) : (long)Foreign.invokeArrayO1Int32(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len);
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] encodeN4(Function function, long n1, long n2, long n3, long n4) {
        void var10_6;
        HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
        byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
        int poff = 0;
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
        HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
        return var10_6;
    }

    @Override
    public long invokeN3O2rN(Function function, long n1, long n2, long n3, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return this.invokeO2(function, HeapObjectParameterInvoker.encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
    }

    @Override
    public long invokeN5O1rN(Function function, long n1, long n2, long n3, long n4, long n5, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return this.invokeO1(function, HeapObjectParameterInvoker.encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags);
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] encodeN6(Function function, long n1, long n2, long n3, long n4, long n5, long n6) {
        void var14_8;
        HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
        byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
        int poff = 0;
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(4), n5);
        HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(5), n6);
        return var14_8;
    }

    @Override
    public long invokeN2O1rN(Function function, long n1, long n2, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
        byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
        int poff = 0;
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
        HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
        return this.invokeO1(function, paramBuffer, o1, o1off, o1len, o1flags);
    }

    @Override
    public long invokeN4O1rN(Function function, long n1, long n2, long n3, long n4, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return this.invokeO1(function, HeapObjectParameterInvoker.encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags);
    }

    @Override
    public long invokeN5O2rN(Function function, long n1, long n2, long n3, long n4, long n5, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return this.invokeO2(function, HeapObjectParameterInvoker.encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
    }

    @Override
    public long invokeN3O1rN(Function function, long n1, long n2, long n3, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return this.invokeO1(function, HeapObjectParameterInvoker.encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags);
    }

    /*
     * WARNING - void declaration
     */
    private long invokeO3(Function function, byte[] paramBuffer, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags, Object o3, int o3off, int o3len, ObjectParameterInfo o3flags) {
        void var16_16;
        void var15_15;
        void var2_2;
        void var1_1;
        int[] nArray = new int[9];
        nArray[0] = o1flags.asObjectInfo();
        nArray[1] = o1off;
        nArray[2] = o1len;
        nArray[3] = o2flags.asObjectInfo();
        nArray[4] = o2off;
        nArray[5] = o2len;
        nArray[6] = o3flags.asObjectInfo();
        nArray[7] = o3off;
        nArray[8] = o3len;
        int[] objInfo = nArray;
        Object[] objectArray = new Object[3];
        objectArray[0] = o1;
        objectArray[1] = o2;
        objectArray[2] = o3;
        Object[] objects = objectArray;
        return function.getReturnType().size() == 8 ? Foreign.invokeArrayWithObjectsInt64(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, 3, objInfo, objects) : (long)Foreign.invokeArrayWithObjectsInt32(function.getContextAddress(), var1_1.getFunctionAddress(), (byte[])var2_2, 3, (int[])var15_15, (Object[])var16_16);
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] encodeN3(Function function, long n1, long n2, long n3) {
        void var8_5;
        HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
        byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
        int poff = 0;
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
        HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
        return var8_5;
    }

    @Override
    public long invokeN6O2rN(Function function, long n1, long n2, long n3, long n4, long n5, long n6, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return this.invokeO2(function, HeapObjectParameterInvoker.encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
    }

    private static int encode(HeapInvocationBuffer.Encoder encoder, byte[] paramBuffer, int off, Type type, long n) {
        if (type.size() <= 4) {
            return encoder.putInt(paramBuffer, off, (int)n);
        }
        return encoder.putLong(paramBuffer, off, n);
    }

    @Override
    public long invokeN6O3rN(Function function, long n1, long n2, long n3, long n4, long n5, long n6, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags, Object o3, int o3off, int o3len, ObjectParameterInfo o3flags) {
        return this.invokeO3(function, HeapObjectParameterInvoker.encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
    }

    @Override
    public long invokeN2O2rN(Function function, long n1, long n2, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return this.invokeO2(function, new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(function.getCallContext())], o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
    }

    @Override
    public final boolean isNative() {
        return false;
    }

    private long invokeO2(Function function, byte[] paramBuffer, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags) {
        return function.getReturnType().size() == 8 ? Foreign.invokeArrayO2Int64(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len, o2, o2flags.asObjectInfo(), o2off, o2len) : (long)Foreign.invokeArrayO2Int32(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len, o2, o2flags.asObjectInfo(), o2off, o2len);
    }

    @Override
    public long invokeN3O3rN(Function function, long n1, long n2, long n3, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags, Object o3, int o3off, int o3len, ObjectParameterInfo o3flags) {
        return this.invokeO3(function, HeapObjectParameterInvoker.encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
    }

    /*
     * WARNING - void declaration
     */
    private static byte[] encodeN5(Function function, long n1, long n2, long n3, long n4, long n5) {
        void var12_7;
        HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
        byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
        int poff = 0;
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
        poff = HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
        HeapObjectParameterInvoker.encode(encoder, paramBuffer, poff, function.getParameterType(4), n5);
        return var12_7;
    }

    @Override
    public long invokeN6O1rN(Function function, long n1, long n2, long n3, long n4, long n5, long n6, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return this.invokeO1(function, HeapObjectParameterInvoker.encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags);
    }

    @Override
    public long invokeN4O3rN(Function function, long n1, long n2, long n3, long n4, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags, Object o3, int o3off, int o3len, ObjectParameterInfo o3flags) {
        return this.invokeO3(function, HeapObjectParameterInvoker.encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
    }

    @Override
    public long invokeN5O3rN(Function function, long n1, long n2, long n3, long n4, long n5, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags, Object o2, int o2off, int o2len, ObjectParameterInfo o2flags, Object o3, int o3off, int o3len, ObjectParameterInfo o3flags) {
        return this.invokeO3(function, HeapObjectParameterInvoker.encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
    }

    @Override
    public long invokeN1O1rN(Function function, long n1, Object o1, int o1off, int o1len, ObjectParameterInfo o1flags) {
        return this.invokeO1(function, new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(function.getCallContext())], o1, o1off, o1len, o1flags);
    }
}

