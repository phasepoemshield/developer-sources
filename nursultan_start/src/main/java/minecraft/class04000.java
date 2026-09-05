/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class04782
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07734
 *  minecraft.class07750
 */
package minecraft;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class04782;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07734;
import minecraft.class07750;

public interface class04000 {
    @Deprecated
    public static final class04000 N = (class047822, class072092, class005002, class072093, class005003) -> {
        if (class005002.N(class00869.yw) || class005002.N(class00869.ij) || class005002.N(class00869.RJ) || class005002.i() instanceof class07750 || class005002.i() instanceof class07734 || class005002.i() instanceof class07131 || class005002.N(class00869.mC) || class005002.N(class00869.iT) || class005002.N(class00869.Ln) || class005002.N(class00869.io) || class005002.N(class00869.MO) || class005002.N(class00869.zN) || class005002.N(class00869.Eg) || class005002.N(class00869.bX) || class005002.N(class00869.ND)) {
            return false;
        }
        return !(!class005003.P() && !class005003.T() || !class005002.B() && !class005002.N(class00869.ba));
    };
    public static final class04000 y = (class047822, class072092, class005002, class072093, class005003) -> class005003.M((class07290)class047822, class072093).method_1110() && class00891.N((class00494)class005002.M((class07290)class047822, class072092), (class07211)class07211.field_11036);
    public static final class04000 L = (class047822, class072092, class005002, class072093, class005003) -> class005003.M((class07290)class047822, class072093).method_1110() && !class005002.N(class01210.H) && class00891.N((class00494)class005002.M((class07290)class047822, class072092), (class07211)class07211.field_11036);

    public boolean canSpawnOn(class04782 var1, class07209 var2, class00500 var3, class07209 var4, class00500 var5);
}

