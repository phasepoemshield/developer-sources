/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class00869;
import minecraft.class04892;
import minecraft.class06069;

class class04904
extends class04892 {
    class04904() {
    }

    @Override
    public void N(class06069 class060692, int n, int n2, int n3, boolean bl) {
        float f;
        this.N = bl ? ((f = class060692.z()) < 0.2f ? class00869.Rs.W() : (f < 0.5f ? class00869.RP.W() : (f < 0.55f ? class00869.Rt.W() : class00869.Rm.W()))) : class00869.mr.W();
    }
}

