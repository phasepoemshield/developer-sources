/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01114
 *  minecraft.class04891
 *  minecraft.class06695
 *  minecraft.class06710
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00379;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01114;
import minecraft.class04891;
import minecraft.class06695;
import minecraft.class06710;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08036;

class class00407
extends class01114 {
    final /* synthetic */ class00379 N;

    class00407(class00379 class003792) {
        this.N = class003792;
    }

    protected void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00860) {
            class00860 class008602 = (class00860)class008912;
            class00379.N((class07299)class072992, (class07209)class072092, (class00500)class005002, (class04891)class008602.v());
        }
    }

    protected void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00860) {
            class00860 class008602 = (class00860)class008912;
            class00379.N((class07299)class072992, (class07209)class072092, (class00500)class005002, (class04891)class008602.j());
        }
    }

    protected void N(class07299 class072992, class07209 class072092, class00500 class005002, int n, int n2) {
        this.N.N(class072992, class072092, class005002, n, n2);
    }

    public boolean N(class08036 class080362) {
        if ((class07482)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 instanceof class07490) {
            class06695 class066952 = ((class07490)((class07482)class080362.fields_07fa3311b0e9d3e9b883d09222919bf5a_3)).E();
            return class066952 == this.N || class066952 instanceof class06710 && ((class06710)class066952).method_5405((class06695)this.N);
        }
        return false;
    }
}

