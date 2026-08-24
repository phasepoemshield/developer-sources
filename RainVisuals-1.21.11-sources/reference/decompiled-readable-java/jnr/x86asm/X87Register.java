/*
 * Decompiled with CFR 0.152.
 */
package jnr.x86asm;

import jnr.x86asm.BaseReg;

public final class X87Register
extends BaseReg {
    static final X87Register[] cache = new X87Register[16];

    public static final X87Register st(int idx) {
        return X87Register.x87(idx);
    }

    static {
        for (int i = 0; i < cache.length; ++i) {
            X87Register.cache[i] = new X87Register(0x50 | i, 10);
        }
    }

    public static final X87Register x87(int idx) {
        if (idx >= 0 && idx < cache.length) {
            return cache[idx];
        }
        throw new IllegalArgumentException("invalid x87 register");
    }

    private X87Register(int code, int size) {
        super(code, size);
    }
}

