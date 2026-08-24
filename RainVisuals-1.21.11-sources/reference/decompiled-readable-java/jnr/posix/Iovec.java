/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.nio.ByteBuffer;

public interface Iovec {
    public ByteBuffer get();

    public void set(ByteBuffer var1);
}

