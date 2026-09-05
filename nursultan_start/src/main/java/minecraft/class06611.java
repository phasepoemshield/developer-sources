/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class06604;

public interface class06611 {
    public static final int N = -1;

    default public boolean L() {
        return this.N() == 257 || this.N() == 32 || this.N() == 335;
    }

    default public boolean M() {
        return this.N() == 262;
    }

    default public boolean P() {
        return (this.y() & class06604.y) != 0;
    }

    default public boolean T() {
        return this.N() == 67 && this.P() && !this.W() && !this.E();
    }

    default public boolean B() {
        return this.N() == 265;
    }

    default public boolean Z() {
        return this.N() == 264;
    }

    default public boolean i() {
        return this.N() == 256;
    }

    default public boolean b() {
        return this.N() == 86 && this.P() && !this.W() && !this.E();
    }

    default public boolean s() {
        return this.N() == 65 && this.P() && !this.W() && !this.E();
    }

    default public boolean m() {
        return (this.y() & 2) != 0;
    }

    default public boolean j() {
        return this.N() == 88 && this.P() && !this.W() && !this.E();
    }

    default public int U() {
        int n = this.N() - 48;
        if (n >= 0 && n <= 9) {
            return n;
        }
        return -1;
    }

    default public boolean z() {
        return this.N() == 258;
    }

    default public boolean u() {
        return this.N() == 257 || this.N() == 335;
    }

    public int y();

    default public boolean E() {
        return (this.y() & 4) != 0;
    }

    public int N();

    default public boolean W() {
        return (this.y() & 1) != 0;
    }

    default public boolean R() {
        return this.N() == 263;
    }
}

