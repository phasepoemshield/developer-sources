/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

import com.kenai.jnr.x86asm.BaseReg;

@Deprecated
public class Operand {
    private final int op;
    private final int size;

    public boolean isNone() {
        return this.op() == 0;
    }

    public boolean isImm() {
        return this.op() == 3;
    }

    public boolean isReg() {
        return this.op() == 1;
    }

    public final boolean isRegMem() {
        return this.isMem() || this.isReg();
    }

    public int op() {
        return this.op;
    }

    public boolean isLabel() {
        return this.op() == 4;
    }

    public final boolean isRegType(int type) {
        return this instanceof BaseReg && ((BaseReg)this).type() == type;
    }

    public Operand(int op, int size) {
        this.op = op;
        this.size = size;
    }

    public final boolean isRegCode(int code) {
        return this instanceof BaseReg && ((BaseReg)this).code() == code;
    }

    public final boolean isRegMem(int regType) {
        return this.isMem() || this.isRegType(regType);
    }

    public boolean isMem() {
        return this.op() == 2;
    }

    public final boolean isRegIndex(int index) {
        return this instanceof BaseReg && ((BaseReg)this).index() == index;
    }

    public int size() {
        return this.size;
    }
}

