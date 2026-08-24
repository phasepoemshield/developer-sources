/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class CPU_A64
extends Enum<CPU_A64> {
    public static final CPU_A64 A64;
    public static final /* enum */ CPU_A64 Aarch64;
    private static final /* synthetic */ CPU_A64[] $VALUES;
    public static final /* enum */ CPU_A64 X86_64;
    public static final CPU_A64 I386;
    public static final /* enum */ CPU_A64 X86_32;
    public static final /* enum */ CPU_A64 Aarch32;

    public static CPU_A64[] values() {
        return (CPU_A64[])$VALUES.clone();
    }

    static {
        Aarch32 = new CPU_A64();
        Aarch64 = new CPU_A64();
        X86_32 = new CPU_A64();
        X86_64 = new CPU_A64();
        CPU_A64[] cPU_A64Array = new CPU_A64[4];
        cPU_A64Array[0] = Aarch32;
        cPU_A64Array[1] = Aarch64;
        cPU_A64Array[2] = X86_32;
        cPU_A64Array[3] = X86_64;
        $VALUES = cPU_A64Array;
        I386 = X86_32;
        A64 = Aarch64;
    }

    public static CPU_A64 valueOf(String name) {
        return Enum.valueOf(CPU_A64.class, name);
    }
}

