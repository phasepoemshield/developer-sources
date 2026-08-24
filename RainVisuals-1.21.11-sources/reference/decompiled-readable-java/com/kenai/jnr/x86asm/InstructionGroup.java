/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jnr.x86asm;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@Deprecated
public final class InstructionGroup
extends Enum<InstructionGroup> {
    public static final /* enum */ InstructionGroup I_IMUL;
    public static final /* enum */ InstructionGroup I_MOV_PTR;
    public static final /* enum */ InstructionGroup I_CRC32;
    public static final /* enum */ InstructionGroup I_RM_B;
    public static final /* enum */ InstructionGroup I_MMU_PEXTR;
    public static final /* enum */ InstructionGroup I_TEST;
    public static final /* enum */ InstructionGroup I_M;
    public static final /* enum */ InstructionGroup I_MMU_MOV;
    public static final /* enum */ InstructionGroup I_X87_STI;
    public static final /* enum */ InstructionGroup I_RM_R;
    public static final /* enum */ InstructionGroup I_RET;
    public static final /* enum */ InstructionGroup I_BSWAP;
    public static final /* enum */ InstructionGroup I_INC_DEC;
    public static final /* enum */ InstructionGroup I_POP;
    public static final /* enum */ InstructionGroup I_LEA;
    public static final /* enum */ InstructionGroup I_JMP;
    public static final /* enum */ InstructionGroup I_RM;
    public static final /* enum */ InstructionGroup I_MMU_RM_IMM8;
    public static final /* enum */ InstructionGroup I_MMU_RMI;
    public static final /* enum */ InstructionGroup I_X87_MEM;
    public static final /* enum */ InstructionGroup I_X87_FPU;
    public static final /* enum */ InstructionGroup I_CALL;
    public static final /* enum */ InstructionGroup I_ENTER;
    public static final /* enum */ InstructionGroup I_MMU_MOVQ;
    public static final /* enum */ InstructionGroup I_X87_FSTSW;
    public static final /* enum */ InstructionGroup I_J;
    public static final /* enum */ InstructionGroup I_MOVSX_MOVZX;
    public static final /* enum */ InstructionGroup I_MOVBE;
    public static final /* enum */ InstructionGroup I_XCHG;
    public static final /* enum */ InstructionGroup I_ROT;
    public static final /* enum */ InstructionGroup I_SHLD_SHRD;
    public static final /* enum */ InstructionGroup I_R_RM;
    public static final /* enum */ InstructionGroup I_EMIT;
    public static final /* enum */ InstructionGroup I_MOV;
    public static final /* enum */ InstructionGroup I_ALU;
    public static final /* enum */ InstructionGroup I_BT;
    public static final /* enum */ InstructionGroup I_MMU_PREFETCH;
    private static final /* synthetic */ InstructionGroup[] $VALUES;
    public static final /* enum */ InstructionGroup I_X87_MEM_STI;
    public static final /* enum */ InstructionGroup I_MMU_RM_3DNOW;
    public static final /* enum */ InstructionGroup I_PUSH;
    public static final /* enum */ InstructionGroup I_MMU_MOVD;
    public static final /* enum */ InstructionGroup I_MOVSXD;

    public static InstructionGroup valueOf(String name) {
        return Enum.valueOf(InstructionGroup.class, name);
    }

    public static InstructionGroup[] values() {
        return (InstructionGroup[])$VALUES.clone();
    }

    static {
        I_EMIT = new InstructionGroup();
        I_ALU = new InstructionGroup();
        I_BSWAP = new InstructionGroup();
        I_BT = new InstructionGroup();
        I_CALL = new InstructionGroup();
        I_CRC32 = new InstructionGroup();
        I_ENTER = new InstructionGroup();
        I_IMUL = new InstructionGroup();
        I_INC_DEC = new InstructionGroup();
        I_J = new InstructionGroup();
        I_JMP = new InstructionGroup();
        I_LEA = new InstructionGroup();
        I_M = new InstructionGroup();
        I_MOV = new InstructionGroup();
        I_MOV_PTR = new InstructionGroup();
        I_MOVSX_MOVZX = new InstructionGroup();
        I_MOVSXD = new InstructionGroup();
        I_PUSH = new InstructionGroup();
        I_POP = new InstructionGroup();
        I_R_RM = new InstructionGroup();
        I_RM_B = new InstructionGroup();
        I_RM = new InstructionGroup();
        I_RM_R = new InstructionGroup();
        I_RET = new InstructionGroup();
        I_ROT = new InstructionGroup();
        I_SHLD_SHRD = new InstructionGroup();
        I_TEST = new InstructionGroup();
        I_XCHG = new InstructionGroup();
        I_X87_FPU = new InstructionGroup();
        I_X87_STI = new InstructionGroup();
        I_X87_MEM_STI = new InstructionGroup();
        I_X87_MEM = new InstructionGroup();
        I_X87_FSTSW = new InstructionGroup();
        I_MOVBE = new InstructionGroup();
        I_MMU_MOV = new InstructionGroup();
        I_MMU_MOVD = new InstructionGroup();
        I_MMU_MOVQ = new InstructionGroup();
        I_MMU_PEXTR = new InstructionGroup();
        I_MMU_PREFETCH = new InstructionGroup();
        I_MMU_RMI = new InstructionGroup();
        I_MMU_RM_IMM8 = new InstructionGroup();
        I_MMU_RM_3DNOW = new InstructionGroup();
        InstructionGroup[] instructionGroupArray = new InstructionGroup[42];
        instructionGroupArray[0] = I_EMIT;
        instructionGroupArray[1] = I_ALU;
        instructionGroupArray[2] = I_BSWAP;
        instructionGroupArray[3] = I_BT;
        instructionGroupArray[4] = I_CALL;
        instructionGroupArray[5] = I_CRC32;
        instructionGroupArray[6] = I_ENTER;
        instructionGroupArray[7] = I_IMUL;
        instructionGroupArray[8] = I_INC_DEC;
        instructionGroupArray[9] = I_J;
        instructionGroupArray[10] = I_JMP;
        instructionGroupArray[11] = I_LEA;
        instructionGroupArray[12] = I_M;
        instructionGroupArray[13] = I_MOV;
        instructionGroupArray[14] = I_MOV_PTR;
        instructionGroupArray[15] = I_MOVSX_MOVZX;
        instructionGroupArray[16] = I_MOVSXD;
        instructionGroupArray[17] = I_PUSH;
        instructionGroupArray[18] = I_POP;
        instructionGroupArray[19] = I_R_RM;
        instructionGroupArray[20] = I_RM_B;
        instructionGroupArray[21] = I_RM;
        instructionGroupArray[22] = I_RM_R;
        instructionGroupArray[23] = I_RET;
        instructionGroupArray[24] = I_ROT;
        instructionGroupArray[25] = I_SHLD_SHRD;
        instructionGroupArray[26] = I_TEST;
        instructionGroupArray[27] = I_XCHG;
        instructionGroupArray[28] = I_X87_FPU;
        instructionGroupArray[29] = I_X87_STI;
        instructionGroupArray[30] = I_X87_MEM_STI;
        instructionGroupArray[31] = I_X87_MEM;
        instructionGroupArray[32] = I_X87_FSTSW;
        instructionGroupArray[33] = I_MOVBE;
        instructionGroupArray[34] = I_MMU_MOV;
        instructionGroupArray[35] = I_MMU_MOVD;
        instructionGroupArray[36] = I_MMU_MOVQ;
        instructionGroupArray[37] = I_MMU_PEXTR;
        instructionGroupArray[38] = I_MMU_PREFETCH;
        instructionGroupArray[39] = I_MMU_RMI;
        instructionGroupArray[40] = I_MMU_RM_IMM8;
        instructionGroupArray[41] = I_MMU_RM_3DNOW;
        $VALUES = instructionGroupArray;
    }
}

