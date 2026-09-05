/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

public class ImplicitTuple {
    private final boolean plain;
    private final boolean nonPlain;

    public ImplicitTuple(boolean bl, boolean bl2) {
        this.plain = bl;
        this.nonPlain = bl2;
    }

    public String toString() {
        return "implicit=[" + this.plain + ", " + this.nonPlain + "]";
    }

    public boolean canOmitTagInPlainScalar() {
        return this.plain;
    }

    public boolean canOmitTagInNonPlainScalar() {
        return this.nonPlain;
    }

    public boolean bothFalse() {
        return !this.plain && !this.nonPlain;
    }
}

