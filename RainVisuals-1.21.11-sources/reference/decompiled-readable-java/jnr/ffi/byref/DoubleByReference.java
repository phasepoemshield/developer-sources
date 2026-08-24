/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractNumberReference;

public final class DoubleByReference
extends AbstractNumberReference<Double> {
    private static final Double DEFAULT = 0.0;

    @Override
    public final int nativeSize(Runtime runtime) {
        return 8;
    }

    public DoubleByReference(Double value) {
        super(DoubleByReference.checkNull(value));
    }

    @Override
    public void toNative(Runtime runtime, Pointer buffer, long offset) {
        buffer.putDouble(offset, (Double)this.value);
    }

    public DoubleByReference(double value) {
        super(value);
    }

    public DoubleByReference() {
        super(DEFAULT);
    }

    @Override
    public void fromNative(Runtime runtime, Pointer buffer, long offset) {
        this.value = buffer.getDouble(offset);
    }
}

