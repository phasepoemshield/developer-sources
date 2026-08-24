/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

import jnr.a64asm.BaseReg;

public class Register
extends BaseReg {
    private static final Register[] gpb = new Register[32];
    private static final Register[] gpw = new Register[32];

    public static final Register gpw(int idx) {
        return Register.gpr(gpw, idx);
    }

    public static final Register gpr(int reg) {
        switch (reg & 0xF0) {
            case 0: {
                return gpb[reg & 0xF];
            }
            case 32: {
                return gpw[reg & 0xF];
            }
        }
        throw new IllegalArgumentException("invalid register 0x" + Integer.toHexString(reg));
    }

    Register(int code, int size) {
        super(code, size);
    }

    private static final Register gpr(Register[] cache, int idx) {
        if (idx >= 0 && idx < 32) {
            return cache[idx];
        }
        throw new IllegalArgumentException("invalid register index " + idx);
    }

    public static final Register gpb(int idx) {
        return Register.gpr(gpb, idx);
    }

    static {
        for (int i = 0; i < 32; ++i) {
            Register.gpb[i] = new Register(0 | i, 64);
            Register.gpw[i] = new Register(0x20 | i, 32);
        }
    }
}

