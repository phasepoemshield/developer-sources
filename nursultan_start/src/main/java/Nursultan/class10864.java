/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class08036
 */
package Nursultan;

import minecraft.class04803;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class08036;

public class class10864
implements class04803 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10864(class08036 class080362, int n) {
        this.y();
        this.N_1 = class080362;
        this.N_0 = n;
    }

    private void y() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0;
        }
    }

    public boolean N(class06584 class065842) {
        ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T().method_5447(((Integer)this.N_0).intValue(), class065842);
        ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y((class06695)((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_0);
        return true;
    }

    public class06584 N() {
        return ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T().method_5438(((Integer)this.N_0).intValue());
    }
}

