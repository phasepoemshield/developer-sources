/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02897
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07280
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02897;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07280;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public abstract class class00475
implements class00381<class07280> {
    protected final int N;
    protected final short y;
    protected final short L;
    protected final short u;
    protected final byte i;
    protected final byte R;
    protected final boolean M;
    protected final boolean B;
    protected final boolean Z;

    public short L() {
        return this.u;
    }

    public float M() {
        return class04995.N((byte)this.R);
    }

    protected class00475(int n, short s, short s2, short s3, byte by, byte by2, boolean bl, boolean bl2, boolean bl3) {
        this.N = n;
        this.y = s;
        this.L = s2;
        this.u = s3;
        this.i = by;
        this.R = by2;
        this.M = bl;
        this.B = bl2;
        this.Z = bl3;
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public boolean B() {
        return this.B;
    }

    public boolean Z() {
        return this.Z;
    }

    public boolean z() {
        return this.M;
    }

    public float u() {
        return class04995.N((byte)this.i);
    }

    public short y() {
        return this.L;
    }

    public short N() {
        return this.y;
    }

    public @Nullable class07049 N(class07299 class072992) {
        return class072992.method_8469(this.N);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public abstract class02897<? extends class00475> method_65080();
}

