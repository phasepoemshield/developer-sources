/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07952
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class04626;
import minecraft.class07079;
import minecraft.class07952;
import minecraft.class08036;

class class04617
extends class07952<class08036> {
    class04617(class04626 class046262) {
        super((class07079)class046262, class08036.class, 10, true, false, (arg_0, arg_1) -> ((class04626)class046262).N(arg_0, arg_1));
    }

    private boolean U() {
        class04626 class046262 = (class04626)this.i;
        return class046262.P_() && !class046262.NJ();
    }

    public boolean y() {
        if (!this.U() || this.i.T() == null) {
            this.M = null;
            return false;
        }
        return super.y();
    }

    public boolean N() {
        return this.U() && super.N();
    }
}

