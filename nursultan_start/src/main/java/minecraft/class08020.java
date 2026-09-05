/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class00869;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07475;
import minecraft.class07973;
import minecraft.class08004;

class class08020
extends class07973 {
    final /* synthetic */ class08004 M;

    class08020(class08004 class080042, class07475 class074752, double d, int n) {
        this.M = class080042;
        super(class00869.my, class074752, d, n);
    }

    @Override
    public double Z() {
        return 1.14;
    }

    @Override
    public void N(class07284 class072842, class07209 class072092) {
        class072842.method_8396(null, class072092, class04909.Jc, class04911.field_15251, 0.5f, 0.9f + class08004.N(this.M).z() * 0.2f);
    }

    @Override
    public void N(class07299 class072992, class07209 class072092) {
        class072992.method_8396(null, class072092, class04909.Ok, class04911.field_15245, 0.7f, 0.9f + class072992.field_9229.z() * 0.2f);
    }
}

