/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContextCache;
import com.kenai.jffi.CallingConvention;
import com.kenai.jffi.Foreign;
import com.kenai.jffi.Type;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class CallContext {
    volatile int disposed;
    private final Foreign foreign;
    final Type[] parameterTypes;
    final int fixedParamCount;
    private final int parameterCount;
    final long[] parameterTypeHandles;
    final int flags;
    final AtomicIntegerFieldUpdater<CallContext> UPDATER = AtomicIntegerFieldUpdater.newUpdater(CallContext.class, "disposed");
    final long contextAddress;
    private final int rawParameterSize;
    final Type returnType;

    public static CallContext getCallContext(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno, boolean faultProtect) {
        return CallContextCache.getInstance().getCallContext(returnType, parameterTypes, convention, saveErrno, faultProtect);
    }

    public CallContext(Type returnType, Type ... parameterTypes) {
        this(returnType, parameterTypes, CallingConvention.DEFAULT, true);
    }

    public int hashCode() {
        int result = this.parameterCount;
        result = 31 * result + this.returnType.hashCode();
        result = 31 * result + Arrays.hashCode(this.parameterTypes);
        result = 31 * result + this.flags;
        return result;
    }

    final long getAddress() {
        return this.contextAddress;
    }

    public CallContext(Type returnType, Type[] parameterTypes, CallingConvention convention) {
        this(returnType, parameterTypes, convention, true);
    }

    public final int getParameterCount() {
        return this.parameterCount;
    }

    public boolean equals(Object o) {
        block10: {
            block9: {
                if (this == o) {
                    return true;
                }
                if (o == null) break block9;
                if (this.getClass() == o.getClass()) break block10;
            }
            return false;
        }
        CallContext that = (CallContext)o;
        if (this.flags != that.flags) {
            return false;
        }
        if (this.parameterCount != that.parameterCount) {
            return false;
        }
        if (this.rawParameterSize != that.rawParameterSize) {
            return false;
        }
        if (!Arrays.equals(this.parameterTypes, that.parameterTypes)) {
            return false;
        }
        if (!this.returnType.equals(that.returnType)) {
            return false;
        }
        return true;
    }

    public final Type getReturnType() {
        return this.returnType;
    }

    @Deprecated
    public final void dispose() {
    }

    public static CallContext getCallContext(Type returnType, int fixedParamCount, Type[] parameterTypes, CallingConvention convention, boolean saveErrno) {
        return CallContextCache.getInstance().getCallContext(returnType, fixedParamCount, parameterTypes, convention, saveErrno);
    }

    /*
     * WARNING - void declaration
     */
    CallContext(Type returnType, int fixedParamCount, Type[] parameterTypes, CallingConvention convention, boolean saveErrno, boolean faultProtect) {
        void var7_7;
        this.foreign = Foreign.getInstance();
        int flags = (!saveErrno ? 2 : 0) | (convention == CallingConvention.STDCALL ? 1 : 0) | (faultProtect ? 4 : 0);
        long h = this.foreign.newCallContext(returnType.handle(), Type.nativeHandles(parameterTypes), flags | fixedParamCount << 16);
        if (h == 0L) {
            throw new RuntimeException("Failed to create native function");
        }
        this.contextAddress = h;
        this.returnType = returnType;
        this.parameterTypes = (Type[])parameterTypes.clone();
        this.parameterCount = parameterTypes.length;
        this.fixedParamCount = fixedParamCount;
        this.rawParameterSize = this.foreign.getCallContextRawParameterSize(h);
        this.parameterTypeHandles = Type.nativeHandles(parameterTypes);
        this.flags = var7_7;
    }

    public CallContext(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno) {
        this(returnType, parameterTypes.length, parameterTypes, convention, saveErrno, false);
    }

    public final int getRawParameterSize() {
        return this.rawParameterSize;
    }

    protected void finalize() throws Throwable {
        try {
            int disposed = this.UPDATER.getAndSet(this, 1);
            if (disposed == 0) {
                if (this.contextAddress != 0L) {
                    this.foreign.freeCallContext(this.contextAddress);
                }
            }
        }
        catch (Throwable t) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "exception when freeing " + this.getClass() + ": %s", t.getLocalizedMessage());
        }
        finally {
            super.finalize();
        }
    }

    public static CallContext getCallContext(Type returnType, Type[] parameterTypes, CallingConvention convention, boolean saveErrno) {
        return CallContextCache.getInstance().getCallContext(returnType, parameterTypes, convention, saveErrno);
    }

    public final Type getParameterType(int index) {
        return this.parameterTypes[index];
    }
}

