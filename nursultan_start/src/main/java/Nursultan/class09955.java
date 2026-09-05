/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class05706
 *  minecraft.class06839
 *  minecraft.class07305
 */
package Nursultan;

import java.util.List;
import java.util.Locale;
import minecraft.class02796;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07305;

public class class09955
implements class05706 {
    final /* synthetic */ List N;
    final /* synthetic */ class07305 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09955(class02796 class027962, List list, class07305 class073052) {
        this.N = list;
        this.y = class073052;
    }

    public <T> void N(class06839<T> class068392) {
        this.N.add(String.format(Locale.ROOT, "%s=%s\n", class068392.y(), this.y.y(class068392)));
    }
}

