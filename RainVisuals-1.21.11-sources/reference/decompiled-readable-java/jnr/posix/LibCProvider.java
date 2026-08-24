/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.posix.Crypt;
import jnr.posix.LibC;

public interface LibCProvider {
    public Crypt getCrypt();

    public LibC getLibC();
}

