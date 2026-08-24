/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Pointer;

public interface Crypt {
    public Pointer crypt(byte[] var1, byte[] var2);

    public CharSequence crypt(CharSequence var1, CharSequence var2);
}

