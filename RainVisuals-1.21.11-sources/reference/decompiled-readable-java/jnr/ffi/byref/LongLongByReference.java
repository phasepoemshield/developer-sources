/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractNumberReference;

public final class LongLongByReference
extends AbstractNumberReference<Long> {
    public LongLongByReference(long value) {
        super(value);
    }

    public LongLongByReference() {
        super(0L);
    }

    public LongLongByReference(Long value) {
        super(LongLongByReference.checkNull(value));
    }

    @Override
    public void fromNative(Runtime runtime, Pointer memory, long offset) {
        this.value = memory.getLongLong(offset);
    }

    @Override
    public void toNative(Runtime runtime, Pointer memory, long offset) {
        memory.putLongLong(offset, (Long)this.value);
    }

    @Override
    public final int nativeSize(Runtime runtime) {
        return 8;
    }
}

