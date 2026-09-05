/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00503
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07063
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00503;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07063;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07549;

public class class07520
extends class07549 {
    public static final float N = class07078.p.z() / class07078.Nm.z();
    private static final int u = 1200;
    private static final int i = 50;
    private static final int R = 6000;
    private static final int M = 2;
    private static final int B = 1200;

    public static class05300 M() {
        return class07549.W().N(class05298.l, (double)0.3f).N(class05298.u, 8.0).N(class05298.n, 80.0);
    }

    public class07520(class07078<? extends class07520> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.NW();
        if (this.L != null) {
            this.L.L(400);
        }
    }

    @Override
    public int B() {
        return 60;
    }

    @Override
    protected class04891 s() {
        return this.method_5799() ? class04909.zG : class04909.zl;
    }

    @Override
    protected class04891 E() {
        return class04909.zY;
    }

    protected void N(class04782 class047822) {
        super.N(class047822);
        if ((this.field_6012 + this.method_5628()) % 1200 == 0) {
            class07055 class070552 = new class07055(class07047.u, 6000, 2);
            class07063.N((class04782)class047822, (class07049)this, (class06889)this.method_73189(), (double)50.0, (class07055)class070552, (int)1200).forEach(class047702 -> class047702.field_13987.method_14364((class00381)new class00503(class00503.E, this.method_5701() ? 0.0f : 1.0f)));
        }
        if (!this.Nj()) {
            this.N(this.method_24515(), 16);
        }
    }

    @Override
    public class04891 method_6002() {
        return this.method_5799() ? class04909.zw : class04909.zk;
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        return this.method_5799() ? class04909.zQ : class04909.zO;
    }
}

