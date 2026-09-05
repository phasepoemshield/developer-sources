/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02713
 *  minecraft.class03556
 *  minecraft.class06581
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import minecraft.class02477;
import minecraft.class02713;
import minecraft.class03556;
import minecraft.class06581;
import minecraft.class06762;
import minecraft.class06777;
import org.apache.commons.lang3.mutable.MutableObject;

class class06780
implements class06777 {
    final /* synthetic */ MutableObject N;
    final /* synthetic */ class02713 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06780(class06762 class067622, MutableObject mutableObject, class02713 class027132) {
        this.N = mutableObject;
        this.y = class027132;
    }

    @Override
    public <T> void N(class02477<T> class024772) {
        this.y.N(class024772);
    }

    @Override
    public <T> void N(class02477<T> class024772, T t) {
        this.y.N(class024772, t);
    }

    @Override
    public void N(class03556<class06581> class035562) {
        this.N.setValue(class035562);
    }
}

