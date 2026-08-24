/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractReference;

public final class PointerByReference
extends AbstractReference<Pointer> {
    @Override
    public final int nativeSize(Runtime runtime) {
        return runtime.addressSize();
    }

    public PointerByReference(Pointer value) {
        super(value);
    }

    @Override
    public final void fromNative(Runtime runtime, Pointer memory, long offset) {
        this.value = memory.getPointer(offset);
    }

    public PointerByReference() {
        super(null);
    }

    @Override
    public final void toNative(Runtime runtime, Pointer memory, long offset) {
        memory.putPointer(offset, (Pointer)this.value);
    }
}

