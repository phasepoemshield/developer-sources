/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03559
 *  minecraft.class03696
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07952
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class03559;
import minecraft.class03696;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07137;
import minecraft.class07150;
import minecraft.class07173;
import minecraft.class07175;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07952;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07147
extends class07150 {
    private @Nullable class07175 N;

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 8.0).N(class05298.l, 0.25).N(class05298.u, 1.0);
    }

    public void method_5773() {
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.method_36454());
        super.method_5773();
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        if ((class070722.u() != null || class070722.N(class03696.l)) && this.N != null) {
            this.N.M();
        }
        return super.method_64397(class047822, class070722, f);
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.kB, 0.15f, 1.0f);
    }

    public void method_5636(float f) {
        this.method_36456(f);
        super.method_5636(f);
    }

    public class07147(class07078<? extends class07147> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        return class04909.ki;
    }

    @Override
    public float N(class07209 class072092, class05487 class054872) {
        if (class07137.U(class054872.method_8320(class072092.method_10074()))) {
            return 10.0f;
        }
        return super.N(class072092, class054872);
    }

    public static boolean N(class07078<class07147> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (!class07147.L(class070782, class072842, class061132, class072092, class060692)) {
            return false;
        }
        if (class06113.N((class06113)class061132)) {
            return true;
        }
        return class072842.N((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, 5.0, true) == null;
    }

    protected void l_() {
        this.N = new class07175(this);
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class03559((class07079)this, this.method_73183()));
        this.e.N(3, (class07473)this.N);
        this.e.N(4, (class07473)new class07999((class07475)this, 1.0, false));
        this.e.N(5, (class07473)new class07173(this));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true));
    }

    @Override
    public class04891 method_6002() {
        return class04909.kR;
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        return class04909.kM;
    }
}

