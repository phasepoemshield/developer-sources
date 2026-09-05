/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02072
 *  minecraft.class02078
 *  minecraft.class02102
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class02072;
import minecraft.class02078;
import minecraft.class02102;
import minecraft.class04995;

public abstract class class02056 {
    public final class02102 N;
    public final class02078 y;

    protected class02056(class02102 class021022, class02072 class020722) {
        this.N = class021022;
        this.y = class020722.B();
    }

    public void y(int n, int n2) {
        float f = this.y.y;
        float f2 = n2 - this.N.method_25364() - this.y.u;
        int n3 = Math.round(class04995.B((float)this.y.R, (float)f, (float)f2));
        this.N.method_46419(n3 + n);
    }

    public int y() {
        return this.N.method_25368() + this.y.N + this.y.L;
    }

    public void N(int n, int n2) {
        float f = this.y.N;
        float f2 = n2 - this.N.method_25368() - this.y.L;
        int n3 = (int)class04995.B((float)this.y.i, (float)f, (float)f2);
        this.N.method_46421(n3 + n);
    }

    public int N() {
        return this.N.method_25364() + this.y.y + this.y.u;
    }
}

