/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner;

class ScannerImpl$Chomping {
    private final Boolean value;
    private final int increment;

    public ScannerImpl$Chomping(Boolean bl, int n) {
        this.value = bl;
        this.increment = n;
    }

    public boolean chompTailIsNotFalse() {
        return this.value == null || this.value != false;
    }

    public int getIncrement() {
        return this.increment;
    }

    public boolean chompTailIsTrue() {
        return this.value != null && this.value != false;
    }
}

