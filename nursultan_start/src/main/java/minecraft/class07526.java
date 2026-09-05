/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07473;
import minecraft.class07525;

class class07526
extends class07473 {
    private final class07525 N;

    public class07526(class07525 class075252) {
        this.N = class075252;
    }

    @Override
    public void i() {
        class06069 class060692 = this.N.method_59922();
        class07299 class072992 = this.N.method_73183();
        int n = class04995.N((double)(this.N.method_23317() - 1.0 + class060692.U() * 2.0));
        int n2 = class04995.N((double)(this.N.method_23318() + class060692.U() * 2.0));
        int n3 = class04995.N((double)(this.N.method_23321() - 1.0 + class060692.U() * 2.0));
        class07209 class072092 = new class07209(n, n2, n3);
        class00500 class005002 = class072992.method_8320(class072092);
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class072992.method_8320(class072093);
        class00500 class005004 = this.N.n();
        if (class005004 == null) {
            return;
        }
        if (this.N(class072992, class072092, class005004 = class00891.a_((class00500)class005004, (class07284)this.N.method_73183(), (class07209)class072092), class005002, class005003, class072093)) {
            class072992.method_8652(class072092, class005004, 3);
            class072992.N((class03556)class01194.Z, class072092, class01164.N((class07049)this.N, (class00500)class005004));
            this.N.N((class00500)null);
        }
    }

    @Override
    public boolean N() {
        if (this.N.n() == null) {
            return false;
        }
        if (!((Boolean)class07526.N((class07049)this.N).method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        return this.N.method_59922().y(class07526.y(2000)) == 0;
    }

    private boolean N(class07299 class072992, class07209 class072092, class00500 class005002, class00500 class005003, class00500 class005004, class07209 class072093) {
        return class005003.P() && !class005004.P() && !class005004.N(class00869.q) && class005004.W((class07290)class072992, class072093) && class005002.N((class05487)class072992, class072092) && class072992.N_70((class07049)this.N, class00734.N((class06889)class06889.N((class00753)class072092))).isEmpty();
    }
}

