/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10580
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10580;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class07689;

public class class10620 {
    public Object N_0;
    public Object N_1;

    public class10620(String string, class10580[] class10580Array) {
        this.u();
        this.N_0 = string;
        this.N_1 = class10580Array;
    }

    private void u() {
    }

    public class00392 N(class07689 class076892, boolean bl) {
        if (((class10580[])this.N_1).length == 0 || !bl) {
            return class00392.y((String)((String)this.N_0));
        }
        int n = ((class10580[])this.N_1)[0].y();
        class05216 class052162 = class00392.y((String)((String)this.N_0).substring(0, ((class10580[])this.N_1)[0].y()));
        for (class10580 class105802 : (class10580[])this.N_1) {
            class00392 class003922 = class105802.N(class076892);
            if (n < class105802.y()) {
                class052162.i(((String)this.N_0).substring(n, class105802.y()));
            }
            class052162.y(class003922);
            n = class105802.N();
        }
        if (n < ((String)this.N_0).length()) {
            class052162.i(((String)this.N_0).substring(n));
        }
        return class052162;
    }
}

