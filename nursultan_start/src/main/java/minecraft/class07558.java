/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07473;
import minecraft.class07525;

class class07558
extends class07473 {
    private final class07525 N;

    public class07558(class07525 class075252) {
        this.N = class075252;
    }

    @Override
    public void i() {
        class06069 class060692 = this.N.method_59922();
        class07299 class072992 = this.N.method_73183();
        int n = class04995.N((double)(this.N.method_23317() - 2.0 + class060692.U() * 4.0));
        int n2 = class04995.N((double)(this.N.method_23318() + class060692.U() * 3.0));
        int n3 = class04995.N((double)(this.N.method_23321() - 2.0 + class060692.U() * 4.0));
        class07209 class072092 = new class07209(n, n2, n3);
        class00500 class005002 = class072992.method_8320(class072092);
        class06889 class068892 = new class06889((double)this.N.method_31477() + 0.5, (double)n2 + 0.5, (double)this.N.method_31479() + 0.5);
        class06889 class068893 = new class06889((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5);
        boolean bl = class072992.N(new class05862(class068892, class068893, class05849.field_17559, class05835.field_1348, (class07049)this.N)).u().equals((Object)class072092);
        if (class005002.N(class01210.NY) && bl) {
            class072992.method_8650(class072092, false);
            class072992.N((class03556)class01194.R, class072092, class01164.N((class07049)this.N, (class00500)class005002));
            this.N.N(class005002.i().W());
        }
    }

    @Override
    public boolean N() {
        if (this.N.n() != null) {
            return false;
        }
        if (!((Boolean)class07558.N((class07049)this.N).method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        return this.N.method_59922().y(class07558.y(20)) == 0;
    }
}

