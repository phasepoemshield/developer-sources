/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10540
 *  Nursultan.class10541
 *  Nursultan.class10542
 */
package minecraft;

import Nursultan.class10540;
import Nursultan.class10541;
import Nursultan.class10542;
import minecraft.class05845;

public abstract class class05865 {
    private int N;

    public boolean L() {
        int n = this.y();
        boolean bl = n != this.N;
        this.N = n;
        return bl;
    }

    public abstract int y();

    public static class05865 N() {
        return new class10540();
    }

    public abstract void N(int var1);

    public static class05865 N(int[] nArray, int n) {
        return new class10541(nArray, n);
    }

    public static class05865 N(class05845 class058452, int n) {
        return new class10542(class058452, n);
    }
}

