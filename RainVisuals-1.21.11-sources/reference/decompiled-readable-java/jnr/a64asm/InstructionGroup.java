/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class InstructionGroup
extends Enum<InstructionGroup> {
    public static final /* enum */ InstructionGroup addsub_carry = new InstructionGroup();
    public static final /* enum */ InstructionGroup extract;
    public static final /* enum */ InstructionGroup ldst_unpriv;
    public static final /* enum */ InstructionGroup dp_3src;
    public static final /* enum */ InstructionGroup dp_2src;
    public static final /* enum */ InstructionGroup ldstexcl_op4;
    public static final /* enum */ InstructionGroup movewide;
    public static final /* enum */ InstructionGroup ic_system;
    public static final /* enum */ InstructionGroup pcreladdr;
    public static final /* enum */ InstructionGroup addsub_shift;
    public static final /* enum */ InstructionGroup ldst_regoff;
    public static final /* enum */ InstructionGroup addsub_imm;
    public static final /* enum */ InstructionGroup addsub_ext;
    public static final /* enum */ InstructionGroup condcmp_imm;
    public static final /* enum */ InstructionGroup ldst_imm9_2reg;
    public static final /* enum */ InstructionGroup ldst_unscaled;
    public static final /* enum */ InstructionGroup condsel;
    public static final /* enum */ InstructionGroup ldstpair_indexed;
    public static final /* enum */ InstructionGroup ldst_pos;
    private static final /* synthetic */ InstructionGroup[] $VALUES;
    public static final /* enum */ InstructionGroup ldstnapair_offs;
    public static final /* enum */ InstructionGroup ldstexcl_op3;
    public static final /* enum */ InstructionGroup exception;
    public static final /* enum */ InstructionGroup log_imm;
    public static final /* enum */ InstructionGroup loadlit;
    public static final /* enum */ InstructionGroup condcmp_reg;
    public static final /* enum */ InstructionGroup ldst_imm9;
    public static final /* enum */ InstructionGroup branch_reg;
    public static final /* enum */ InstructionGroup dp_1src;
    public static final /* enum */ InstructionGroup condbranch;
    public static final /* enum */ InstructionGroup bitfield;
    public static final /* enum */ InstructionGroup ldstpair_off;
    public static final /* enum */ InstructionGroup branch_imm;
    public static final /* enum */ InstructionGroup ldst_pos_2reg;
    public static final /* enum */ InstructionGroup ldstexcl;
    public static final /* enum */ InstructionGroup compbranch;
    public static final /* enum */ InstructionGroup testbranch;
    public static final /* enum */ InstructionGroup log_shift;

    public static InstructionGroup[] values() {
        return (InstructionGroup[])$VALUES.clone();
    }

    static {
        addsub_ext = new InstructionGroup();
        addsub_imm = new InstructionGroup();
        addsub_shift = new InstructionGroup();
        bitfield = new InstructionGroup();
        branch_imm = new InstructionGroup();
        branch_reg = new InstructionGroup();
        compbranch = new InstructionGroup();
        condbranch = new InstructionGroup();
        condcmp_imm = new InstructionGroup();
        condcmp_reg = new InstructionGroup();
        condsel = new InstructionGroup();
        dp_1src = new InstructionGroup();
        dp_2src = new InstructionGroup();
        dp_3src = new InstructionGroup();
        exception = new InstructionGroup();
        extract = new InstructionGroup();
        ldst_imm9 = new InstructionGroup();
        ldst_pos = new InstructionGroup();
        ldst_imm9_2reg = new InstructionGroup();
        ldst_pos_2reg = new InstructionGroup();
        ldst_regoff = new InstructionGroup();
        ldst_unpriv = new InstructionGroup();
        ldst_unscaled = new InstructionGroup();
        ldstexcl = new InstructionGroup();
        ldstexcl_op3 = new InstructionGroup();
        ldstexcl_op4 = new InstructionGroup();
        ldstnapair_offs = new InstructionGroup();
        ldstpair_off = new InstructionGroup();
        ldstpair_indexed = new InstructionGroup();
        loadlit = new InstructionGroup();
        log_imm = new InstructionGroup();
        log_shift = new InstructionGroup();
        movewide = new InstructionGroup();
        pcreladdr = new InstructionGroup();
        ic_system = new InstructionGroup();
        testbranch = new InstructionGroup();
        InstructionGroup[] instructionGroupArray = new InstructionGroup[37];
        instructionGroupArray[0] = addsub_carry;
        instructionGroupArray[1] = addsub_ext;
        instructionGroupArray[2] = addsub_imm;
        instructionGroupArray[3] = addsub_shift;
        instructionGroupArray[4] = bitfield;
        instructionGroupArray[5] = branch_imm;
        instructionGroupArray[6] = branch_reg;
        instructionGroupArray[7] = compbranch;
        instructionGroupArray[8] = condbranch;
        instructionGroupArray[9] = condcmp_imm;
        instructionGroupArray[10] = condcmp_reg;
        instructionGroupArray[11] = condsel;
        instructionGroupArray[12] = dp_1src;
        instructionGroupArray[13] = dp_2src;
        instructionGroupArray[14] = dp_3src;
        instructionGroupArray[15] = exception;
        instructionGroupArray[16] = extract;
        instructionGroupArray[17] = ldst_imm9;
        instructionGroupArray[18] = ldst_pos;
        instructionGroupArray[19] = ldst_imm9_2reg;
        instructionGroupArray[20] = ldst_pos_2reg;
        instructionGroupArray[21] = ldst_regoff;
        instructionGroupArray[22] = ldst_unpriv;
        instructionGroupArray[23] = ldst_unscaled;
        instructionGroupArray[24] = ldstexcl;
        instructionGroupArray[25] = ldstexcl_op3;
        instructionGroupArray[26] = ldstexcl_op4;
        instructionGroupArray[27] = ldstnapair_offs;
        instructionGroupArray[28] = ldstpair_off;
        instructionGroupArray[29] = ldstpair_indexed;
        instructionGroupArray[30] = loadlit;
        instructionGroupArray[31] = log_imm;
        instructionGroupArray[32] = log_shift;
        instructionGroupArray[33] = movewide;
        instructionGroupArray[34] = pcreladdr;
        instructionGroupArray[35] = ic_system;
        instructionGroupArray[36] = testbranch;
        $VALUES = instructionGroupArray;
    }

    public static InstructionGroup valueOf(String name) {
        return Enum.valueOf(InstructionGroup.class, name);
    }
}

