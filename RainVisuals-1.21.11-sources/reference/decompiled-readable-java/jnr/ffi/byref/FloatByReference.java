/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractNumberReference;

public final class FloatByReference
extends AbstractNumberReference<Float> {
    private static final Float DEFAULT = Float.valueOf(0.0f);

    public FloatByReference() {
        super(DEFAULT);
    }

    @Override
    public void toNative(Runtime runtime, Pointer buffer, long offset) {
        buffer.putFloat(offset, ((Float)this.value).floatValue());
    }

    public FloatByReference(float value) {
        super(Float.valueOf(value));
    }

    public FloatByReference(Float value) {
        super(FloatByReference.checkNull(value));
    }

    @Override
    public final int nativeSize(Runtime runtime) {
        return 4;
    }

    @Override
    public void fromNative(Runtime runtime, Pointer buffer, long offset) {
        this.value = Float.valueOf(buffer.getFloat(offset));
    }
}

