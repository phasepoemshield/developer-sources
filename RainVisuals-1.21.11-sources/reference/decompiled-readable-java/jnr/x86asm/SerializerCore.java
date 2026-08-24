/*
 * Decompiled with CFR 0.152.
 */
package jnr.x86asm;

import jnr.x86asm.CONDITION;
import jnr.x86asm.HINT;
import jnr.x86asm.INST_CODE;
import jnr.x86asm.Immediate;
import jnr.x86asm.Label;
import jnr.x86asm.Operand;

public abstract class SerializerCore {
    static final INST_CODE[] _setcctable;
    static final Operand _none;
    static INST_CODE[] _jcctable;
    static INST_CODE[] _cmovcctable;

    void emitX86(INST_CODE code, Operand o1, Operand o2, Operand o3) {
        this._emitX86(code, o1, o2, o3);
    }

    static INST_CODE conditionToSetCC(CONDITION cc) {
        assert (cc.value() <= 15);
        return _setcctable[cc.value()];
    }

    void _emitJcc(INST_CODE code, Label label, HINT hint) {
        if (hint == HINT.HINT_NONE) {
            this.emitX86(code, label);
        } else {
            this.emitX86(code, label, Immediate.imm(hint.value()));
        }
    }

    static INST_CODE conditionToCMovCC(CONDITION cc) {
        assert (cc.value() <= 15);
        return _cmovcctable[cc.value()];
    }

    static INST_CODE conditionToJCC(CONDITION cc) {
        assert (cc.value() <= 15);
        return _jcctable[cc.value()];
    }

    abstract boolean is64();

    static {
        _none = new Operand(0, 0){};
        INST_CODE[] iNST_CODEArray = new INST_CODE[16];
        iNST_CODEArray[0] = INST_CODE.INST_JO;
        iNST_CODEArray[1] = INST_CODE.INST_JNO;
        iNST_CODEArray[2] = INST_CODE.INST_JB;
        iNST_CODEArray[3] = INST_CODE.INST_JAE;
        iNST_CODEArray[4] = INST_CODE.INST_JE;
        iNST_CODEArray[5] = INST_CODE.INST_JNE;
        iNST_CODEArray[6] = INST_CODE.INST_JBE;
        iNST_CODEArray[7] = INST_CODE.INST_JA;
        iNST_CODEArray[8] = INST_CODE.INST_JS;
        iNST_CODEArray[9] = INST_CODE.INST_JNS;
        iNST_CODEArray[10] = INST_CODE.INST_JPE;
        iNST_CODEArray[11] = INST_CODE.INST_JPO;
        iNST_CODEArray[12] = INST_CODE.INST_JL;
        iNST_CODEArray[13] = INST_CODE.INST_JGE;
        iNST_CODEArray[14] = INST_CODE.INST_JLE;
        iNST_CODEArray[15] = INST_CODE.INST_JG;
        _jcctable = iNST_CODEArray;
        INST_CODE[] iNST_CODEArray2 = new INST_CODE[16];
        iNST_CODEArray2[0] = INST_CODE.INST_CMOVO;
        iNST_CODEArray2[1] = INST_CODE.INST_CMOVNO;
        iNST_CODEArray2[2] = INST_CODE.INST_CMOVB;
        iNST_CODEArray2[3] = INST_CODE.INST_CMOVAE;
        iNST_CODEArray2[4] = INST_CODE.INST_CMOVE;
        iNST_CODEArray2[5] = INST_CODE.INST_CMOVNE;
        iNST_CODEArray2[6] = INST_CODE.INST_CMOVBE;
        iNST_CODEArray2[7] = INST_CODE.INST_CMOVA;
        iNST_CODEArray2[8] = INST_CODE.INST_CMOVS;
        iNST_CODEArray2[9] = INST_CODE.INST_CMOVNS;
        iNST_CODEArray2[10] = INST_CODE.INST_CMOVPE;
        iNST_CODEArray2[11] = INST_CODE.INST_CMOVPO;
        iNST_CODEArray2[12] = INST_CODE.INST_CMOVL;
        iNST_CODEArray2[13] = INST_CODE.INST_CMOVGE;
        iNST_CODEArray2[14] = INST_CODE.INST_CMOVLE;
        iNST_CODEArray2[15] = INST_CODE.INST_CMOVG;
        _cmovcctable = iNST_CODEArray2;
        INST_CODE[] iNST_CODEArray3 = new INST_CODE[16];
        iNST_CODEArray3[0] = INST_CODE.INST_SETO;
        iNST_CODEArray3[1] = INST_CODE.INST_SETNO;
        iNST_CODEArray3[2] = INST_CODE.INST_SETB;
        iNST_CODEArray3[3] = INST_CODE.INST_SETAE;
        iNST_CODEArray3[4] = INST_CODE.INST_SETE;
        iNST_CODEArray3[5] = INST_CODE.INST_SETNE;
        iNST_CODEArray3[6] = INST_CODE.INST_SETBE;
        iNST_CODEArray3[7] = INST_CODE.INST_SETA;
        iNST_CODEArray3[8] = INST_CODE.INST_SETS;
        iNST_CODEArray3[9] = INST_CODE.INST_SETNS;
        iNST_CODEArray3[10] = INST_CODE.INST_SETPE;
        iNST_CODEArray3[11] = INST_CODE.INST_SETPO;
        iNST_CODEArray3[12] = INST_CODE.INST_SETL;
        iNST_CODEArray3[13] = INST_CODE.INST_SETGE;
        iNST_CODEArray3[14] = INST_CODE.INST_SETLE;
        iNST_CODEArray3[15] = INST_CODE.INST_SETG;
        _setcctable = iNST_CODEArray3;
    }

    void emitX86(INST_CODE code) {
        this._emitX86(code, _none, _none, _none);
    }

    void emitX86(INST_CODE code, Operand o1, Operand o2) {
        this._emitX86(code, o1, o2, _none);
    }

    abstract void _emitX86(INST_CODE var1, Operand var2, Operand var3, Operand var4);

    void _emitJcc(INST_CODE code, Label label, int hint) {
        if (hint == 0) {
            this.emitX86(code, label);
        } else {
            this.emitX86(code, label, Immediate.imm(hint));
        }
    }

    void emitX86(INST_CODE code, Operand o1) {
        this._emitX86(code, o1, _none, _none);
    }
}

