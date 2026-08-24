/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.byref.AbstractNumberReference;

public final class ByteByReference
extends AbstractNumberReference<Byte> {
    @Override
    public void toNative(Runtime runtime, Pointer buffer, long offset) {
        buffer.putByte(offset, (Byte)this.value);
    }

    public ByteByReference(byte value) {
        super(value);
    }

    public ByteByReference() {
        super((byte)0);
    }

    @Override
    public void fromNative(Runtime runtime, Pointer buffer, long offset) {
        this.value = buffer.getByte(offset);
    }

    public ByteByReference(Byte value) {
        super(ByteByReference.checkNull(value));
    }

    @Override
    public final int nativeSize(Runtime runtime) {
        return 1;
    }
}

