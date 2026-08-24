/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.InAccessibleMemoryIO;

public final class IntPointer
extends InAccessibleMemoryIO {
    @Override
    public long size() {
        return 0L;
    }

    public IntPointer(Runtime runtime, int address) {
        super(runtime, (long)address & 0xFFFFFFFFL, true);
    }

    public IntPointer(Runtime runtime, long address) {
        super(runtime, address, true);
    }

    public int hashCode() {
        return (int)this.address();
    }

    public boolean equals(Object obj) {
        return obj instanceof Pointer && ((Pointer)obj).address() == this.address();
    }
}

