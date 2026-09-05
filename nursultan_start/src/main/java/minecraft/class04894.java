/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class03298
 *  minecraft.class05163
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07830
 */
package minecraft;

import minecraft.class00753;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07830;

public abstract class class04894
extends class04890 {
    protected final int L;
    protected final int u;
    protected final int i;
    protected int R = -1;

    protected class04894(class04878 class048782, int n, int n2, int n3, int n4, int n5, int n6, class07211 class072112) {
        super(class048782, 0, class04890.N(n, n2, n3, class072112, n4, n5, n6));
        this.L = n4;
        this.u = n5;
        this.i = n6;
        this.N(class072112);
    }

    protected class04894(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
        this.L = class070012.y("Width", 0);
        this.u = class070012.y("Height", 0);
        this.i = class070012.y("Depth", 0);
        this.R = class070012.y("HPos", 0);
    }

    protected boolean N(class07284 class072842, class05163 class051632, int n) {
        if (this.R >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        class07218 class072182 = new class07218();
        for (int i = this.k.z(); i <= this.k.W(); ++i) {
            for (int j = this.k.B(); j <= this.k.U(); ++j) {
                class072182.N(j, 64, i);
                if (!class051632.y((class00753)class072182)) continue;
                n2 += class072842.N(class07830.field_13203, (class07209)class072182).method_10264();
                ++n3;
            }
        }
        if (n3 == 0) {
            return false;
        }
        this.R = n2 / n3;
        this.k.N(0, this.R - this.k.Z() + n, 0);
        return true;
    }

    protected boolean N(class07284 class072842, int n) {
        if (this.R >= 0) {
            return true;
        }
        int n2 = class072842.method_31600() + 1;
        boolean bl = false;
        class07218 class072182 = new class07218();
        for (int i = this.k.z(); i <= this.k.W(); ++i) {
            for (int j = this.k.B(); j <= this.k.U(); ++j) {
                class072182.N(j, 0, i);
                n2 = Math.min(n2, class072842.N(class07830.field_13203, (class07209)class072182).method_10264());
                bl = true;
            }
        }
        if (!bl) {
            return false;
        }
        this.R = n2;
        this.k.N(0, this.R - this.k.Z() + n, 0);
        return true;
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        class070012.N("Width", this.L);
        class070012.N("Height", this.u);
        class070012.N("Depth", this.i);
        class070012.N("HPos", this.R);
    }
}

