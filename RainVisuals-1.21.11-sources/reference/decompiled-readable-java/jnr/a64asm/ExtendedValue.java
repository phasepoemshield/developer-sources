/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public class ExtendedValue {
    int value;
    boolean lsl;

    ExtendedValue(boolean lsl, int value) {
        this.lsl = lsl;
        this.value = value;
    }
}

