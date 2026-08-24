/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import java.util.ArrayList;
import java.util.Arrays;

public final class FaultException
extends RuntimeException {
    private final int signal;

    private static StackTraceElement[] createStackTrace(long[] ip, long[] procname, long[] libname, StackTraceElement[] existingTrace) {
        ArrayList<StackTraceElement> trace = new ArrayList<StackTraceElement>();
        for (int i = 0; i < ip.length; ++i) {
            String procName = new String(Foreign.getZeroTerminatedByteArray(procname[i]));
            String libName = new String(Foreign.getZeroTerminatedByteArray(libname[i]));
            trace.add(new StackTraceElement("native", procName, libName, -1));
        }
        trace.addAll(Arrays.asList(existingTrace));
        return trace.toArray(new StackTraceElement[trace.size()]);
    }

    /*
     * WARNING - void declaration
     */
    FaultException(int signal, long[] ip, long[] procname, long[] libname) {
        void var1_1;
        Object[] objectArray = new Object[1];
        objectArray[0] = signal;
        super(String.format("Received signal %d", objectArray));
        this.setStackTrace(FaultException.createStackTrace(ip, procname, libname, this.fillInStackTrace().getStackTrace()));
        this.signal = var1_1;
    }

    public int getSignal() {
        return this.signal;
    }
}

