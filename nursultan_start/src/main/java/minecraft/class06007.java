/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04643
 *  minecraft.class04657
 *  minecraft.class04681
 *  minecraft.class04687
 *  minecraft.class05011
 */
package minecraft;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import minecraft.class04643;
import minecraft.class04657;
import minecraft.class04681;
import minecraft.class04687;
import minecraft.class05011;

public class class06007 {
    private final LongSupplier N;
    private final IntSupplier y;
    private final BooleanSupplier L;
    private class04657 u = class04687.N;

    public void L() {
        this.u = new class05011(this.N, this.y, this.L);
    }

    public class06007(LongSupplier longSupplier, IntSupplier intSupplier, BooleanSupplier booleanSupplier) {
        this.N = longSupplier;
        this.y = intSupplier;
        this.L = booleanSupplier;
    }

    public class04681 i() {
        return this.u.u();
    }

    public class04643 u() {
        return this.u;
    }

    public void y() {
        this.u = class04687.N;
    }

    public boolean N() {
        return this.u != class04687.N;
    }
}

