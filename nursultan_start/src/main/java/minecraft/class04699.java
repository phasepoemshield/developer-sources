/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04723
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class05801
 */
package minecraft;

import minecraft.class00392;
import minecraft.class04723;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05801;

class class04699
extends class05801 {
    private final double y;
    private final double L;
    final /* synthetic */ class04723 N;

    public class04699(class04723 class047232, int n, int n2, int n3, int n4, float f, float f2) {
        this.N = class047232;
        super(n, n2, n3, 20, class05220.N, 0.0);
        this.y = f;
        this.L = f2;
        this.field_22753 = (class04995.N((float)n4, (float)f, (float)f2) - f) / (f2 - f);
        this.method_25346();
    }

    public void method_25344() {
        if (!this.N.R.field_22763) {
            return;
        }
        this.N.i = (int)class04995.u((double)class04995.N((double)this.field_22753, (double)0.0, (double)1.0), (double)this.y, (double)this.L);
    }

    protected void method_25346() {
        this.method_25355((class00392)class05220.N((class00392)class04723.L, (class00392)(this.N.i == 0 ? class05220.L : class00392.y((String)String.valueOf(this.N.i)))));
    }
}

