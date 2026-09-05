/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  minecraft.class01146
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03894
 *  minecraft.class03909
 *  minecraft.class03912
 */
package minecraft;

import Nursultan.class10285;
import minecraft.class01146;
import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;

class class01836
implements class01830,
class03894 {
    private final class03877 M;
    final double[] N;
    final int y;
    final /* synthetic */ class01837 L;

    class01836(class01837 class018372, class03877 class038772, boolean bl) {
        this.L = class018372;
        this.M = class038772;
        this.y = class018372.B + 1;
        this.N = new double[this.y * this.y];
        if (bl) {
            for (int i = 0; i <= class018372.B; ++i) {
                int n = class01146.L((int)(class018372.u + i));
                for (int j = 0; j <= class018372.B; ++j) {
                    int n2 = class01146.L((int)(class018372.i + j));
                    this.N[i + j * this.y] = class038772.N((class03875)new class10285(n, 0, n2));
                }
            }
        }
    }

    public class03909 i() {
        return class03909.field_36563;
    }

    @Override
    public class03877 u() {
        return this.M;
    }

    public double N(class03875 class038752) {
        int n = class01146.N((int)class038752.y());
        int n2 = class01146.N((int)class038752.u());
        int n3 = n - this.L.u;
        int n4 = n2 - this.L.i;
        if (n3 >= 0 && n4 >= 0 && n3 < this.y && n4 < this.y) {
            return this.N[n3 + n4 * this.y];
        }
        return this.M.N(class038752);
    }

    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, (class03877)this);
    }
}

