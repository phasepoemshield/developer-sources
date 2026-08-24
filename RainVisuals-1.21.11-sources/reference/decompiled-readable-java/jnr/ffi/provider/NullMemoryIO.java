/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import jnr.ffi.Runtime;
import jnr.ffi.provider.InAccessibleMemoryIO;

public final class NullMemoryIO
extends InAccessibleMemoryIO {
    private static final String msg = "attempted access to a NULL memory address";

    public NullMemoryIO(Runtime runtime) {
        super(runtime, 0L, true);
    }

    @Override
    public long size() {
        return Long.MAX_VALUE;
    }

    @Override
    protected final NullPointerException error() {
        return new NullPointerException(msg);
    }
}

