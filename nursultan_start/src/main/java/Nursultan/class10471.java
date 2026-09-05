/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06584
 */
package Nursultan;

import java.util.List;
import minecraft.class04803;
import minecraft.class06584;

public class class10471
implements class04803 {
    final /* synthetic */ List N;
    final /* synthetic */ int y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10471(List list, int n) {
        this.N = list;
        this.y = n;
    }

    public class06584 N() {
        return (class06584)this.N.get(this.y);
    }

    public boolean N(class06584 class065842) {
        this.N.set(this.y, class065842);
        return true;
    }
}

