/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.ObjectParameterStrategy;
import com.kenai.jffi.ObjectParameterType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.jffi.ParameterStrategy;

public final class PointerParameterStrategy
extends ParameterStrategy {
    public static final PointerParameterStrategy HEAP;
    public static final PointerParameterStrategy DIRECT;

    PointerParameterStrategy(ObjectParameterStrategy.StrategyType type) {
        super(type, ObjectParameterType.create(ObjectParameterType.ARRAY, ObjectParameterType.BYTE));
    }

    static {
        DIRECT = new PointerParameterStrategy(ObjectParameterStrategy.StrategyType.DIRECT);
        HEAP = new PointerParameterStrategy(ObjectParameterStrategy.StrategyType.HEAP);
    }

    public Object object(Object o) {
        return ((Pointer)o).array();
    }

    public long address(Object o) {
        return this.address((Pointer)o);
    }

    public int offset(Object o) {
        return ((Pointer)o).arrayOffset();
    }

    public int length(Object o) {
        return ((Pointer)o).arrayLength();
    }

    public long address(Pointer pointer) {
        return pointer != null ? pointer.address() : 0L;
    }
}

