/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import jnr.ffi.provider.jffi.ParameterStrategy;

public final class NullObjectParameterStrategy
extends ParameterStrategy {
    public static final ParameterStrategy NULL = new NullObjectParameterStrategy();

    public NullObjectParameterStrategy() {
        super(DIRECT);
    }

    public int offset(Object parameter) {
        throw new NullPointerException("null reference");
    }

    public Object object(Object parameter) {
        throw new NullPointerException("null reference");
    }

    public int length(Object parameter) {
        throw new NullPointerException("null reference");
    }

    public long address(Object parameter) {
        return 0L;
    }
}

