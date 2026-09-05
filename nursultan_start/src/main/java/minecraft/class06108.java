/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00394;
import minecraft.class06119;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class08036;

class class06108
implements class06695 {
    final /* synthetic */ class06119 N;

    class06108(class06119 class061192) {
        this.N = class061192;
    }

    public boolean method_5443(class08036 class080362) {
        return class06695.N((class00394)this.N, (class08036)class080362) && this.N.L();
    }

    public void method_5448() {
    }

    public boolean method_5437(int n, class06584 class065842) {
        return false;
    }

    public int method_5444() {
        return 1;
    }

    public void method_5447(int n, class06584 class065842) {
    }

    public void method_5431() {
        this.N.method_5431();
    }

    public class06584 method_5434(int n, int n2) {
        if (n == 0) {
            class06584 class065842 = this.N.i.N(n2);
            if (this.N.i.R()) {
                this.N.u();
            }
            return class065842;
        }
        return class06584.E;
    }

    public class06584 method_5441(int n) {
        if (n == 0) {
            class06584 class065842 = this.N.i;
            this.N.i = class06584.E;
            this.N.u();
            return class065842;
        }
        return class06584.E;
    }

    public boolean method_5442() {
        return this.N.i.R();
    }

    public class06584 method_5438(int n) {
        return n == 0 ? this.N.i : class06584.E;
    }

    public int method_5439() {
        return 1;
    }
}

