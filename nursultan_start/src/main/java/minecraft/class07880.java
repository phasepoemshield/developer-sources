/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import minecraft.class04803;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class07877;

class class07880
implements class04803 {
    final /* synthetic */ class07877 N;

    class07880(class07877 class078772) {
        this.N = class078772;
    }

    public class06584 N() {
        return this.N.v() ? new class06584((class07310)class06570.Rv) : class06584.E;
    }

    public boolean N(class06584 class065842) {
        if (class065842.R()) {
            if (this.N.v()) {
                this.N.N(false);
                this.N.No();
            }
            return true;
        }
        if (class065842.N(class06570.Rv)) {
            if (!this.N.v()) {
                this.N.N(true);
                this.N.No();
            }
            return true;
        }
        return false;
    }
}

