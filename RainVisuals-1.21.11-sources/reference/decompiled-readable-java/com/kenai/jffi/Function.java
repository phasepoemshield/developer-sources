/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.CallingConvention;
import com.kenai.jffi.Type;

public final class Function {
    private final CallContext callContext;
    final long functionAddress;
    final long contextAddress;

    public final int getRawParameterSize() {
        return this.callContext.getRawParameterSize();
    }

    final long getContextAddress() {
        return this.contextAddress;
    }

    @Deprecated
    public final void dispose() {
    }

    public final Type getParameterType(int index) {
        return this.callContext.getParameterType(index);
    }

    public final long getFunctionAddress() {
        return this.functionAddress;
    }

    public Function(long address, CallContext callContext) {
        this.functionAddress = address;
        this.callContext = callContext;
        this.contextAddress = callContext.getAddress();
    }

    public final Type getReturnType() {
        return this.callContext.getReturnType();
    }

    public Function(long address, Type returnType, Type[] paramTypes, CallingConvention convention, boolean saveErrno) {
        this.functionAddress = address;
        this.callContext = CallContext.getCallContext(returnType, paramTypes, convention, saveErrno);
        this.contextAddress = this.callContext.getAddress();
    }

    public final int getParameterCount() {
        return this.callContext.getParameterCount();
    }

    public Function(long address, Type returnType, Type ... paramTypes) {
        this(address, returnType, paramTypes, CallingConvention.DEFAULT, true);
    }

    public Function(long address, Type returnType, int fixedParamCount, Type[] paramTypes, CallingConvention convention, boolean saveErrno) {
        this.functionAddress = address;
        this.callContext = CallContext.getCallContext(returnType, fixedParamCount, paramTypes, convention, saveErrno);
        this.contextAddress = this.callContext.getAddress();
    }

    public final CallContext getCallContext() {
        return this.callContext;
    }

    public Function(long address, Type returnType, Type[] paramTypes, CallingConvention convention) {
        this(address, returnType, paramTypes, convention, true);
    }
}

