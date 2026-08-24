/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractNumberReference;

public final class ShortByReference
extends AbstractNumberReference<Short> {
    public ShortByReference(short value) {
        super(value);
    }

    @Override
    public final int nativeSize(Runtime runtime) {
        return 2;
    }

    @Override
    public void toNative(Runtime runtime, Pointer buffer, long offset) {
        buffer.putShort(offset, (Short)this.value);
    }

    public ShortByReference() {
        super((short)0);
    }

    @Override
    public void fromNative(Runtime runtime, Pointer buffer, long offset) {
        this.value = buffer.getShort(offset);
    }

    public ShortByReference(Short value) {
        super(ShortByReference.checkNull(value));
    }
}

