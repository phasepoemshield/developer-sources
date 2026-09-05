/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07438
 */
package Nursultan;

import java.util.function.Predicate;
import minecraft.class04803;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;

public class class10470
implements class04803 {
    final /* synthetic */ class07438 N;
    final /* synthetic */ class07085 y;
    final /* synthetic */ Predicate L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10470(class07438 class074382, class07085 class070852, Predicate predicate) {
        this.N = class074382;
        this.y = class070852;
        this.L = predicate;
    }

    public class06584 N() {
        return this.N.method_6118(this.y);
    }

    public boolean N(class06584 class065842) {
        if (!this.L.test(class065842)) {
            return false;
        }
        this.N.method_5673(this.y, class065842);
        return true;
    }
}

