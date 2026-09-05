/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class04651
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07284
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class01231;
import minecraft.class03530;
import minecraft.class04651;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07162;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;

public class class07140
extends class07162 {
    public static class05300 M() {
        return class07150.Y().N(class05298.l, (double)0.2f);
    }

    public boolean method_5809() {
        return false;
    }

    public float method_5718() {
        return 1.0f;
    }

    public class07140(class07078<? extends class07140> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    @Override
    protected class07126 B() {
        return class07107.J;
    }

    @Override
    protected int Z() {
        return super.Z() * 4;
    }

    @Override
    protected class04891 n() {
        return class04909.Tq;
    }

    @Override
    protected float m() {
        return super.m() + 2.0f;
    }

    @Override
    protected class04891 v() {
        if (this.G()) {
            return class04909.TV;
        }
        return class04909.TK;
    }

    @Override
    protected void E() {
        this.u *= 0.9f;
    }

    @Override
    public void N(int n, boolean bl) {
        super.N(n, bl);
        this.method_5996(class05298.y).N((double)(n * 3));
    }

    public static boolean N(class07078<class07140> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.y() != class07086.field_5801;
    }

    @Override
    protected boolean W() {
        return this.method_6034();
    }

    @Override
    public class04891 method_6002() {
        if (this.G()) {
            return class04909.Tj;
        }
        return class04909.TI;
    }

    @Override
    public void method_6043() {
        class06889 class068892 = this.method_18798();
        float f = (float)this.t() * 0.1f;
        this.method_18800(class068892.M, this.method_6106() + f, class068892.Z);
        this.field_64356 = true;
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        if (this.G()) {
            return class04909.To;
        }
        return class04909.TJ;
    }

    public void method_6010(class03530<class04651> class035302) {
        if (class035302 == class01231.y) {
            class06889 class068892 = this.method_18798();
            this.method_18800(class068892.M, 0.22f + (float)this.t() * 0.05f, class068892.Z);
            this.field_64356 = true;
        } else {
            super.method_6010(class035302);
        }
    }
}

