/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00782
 *  minecraft.class00795
 *  minecraft.class01255
 *  minecraft.class01584
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03565
 *  minecraft.class03573
 *  minecraft.class04057
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class04382
 *  minecraft.class04412
 *  minecraft.class04865
 *  minecraft.class07376
 *  minecraft.class07663
 *  minecraft.class07833
 *  minecraft.class07850
 *  minecraft.class08088
 */
package minecraft;

import java.util.Map;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00782;
import minecraft.class00795;
import minecraft.class01255;
import minecraft.class01584;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03565;
import minecraft.class03573;
import minecraft.class04057;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class04382;
import minecraft.class04412;
import minecraft.class04865;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class05964;
import minecraft.class05997;
import minecraft.class07376;
import minecraft.class07663;
import minecraft.class07833;
import minecraft.class07850;
import minecraft.class08088;

class class05953 {
    private final class04116<class04382> N;
    private final class02055<class05943> y;
    private final class02055<class00780> L;
    private final class02055<class04336> u;
    private final class02055<class04412> i;
    private final class02055<class03573> R;
    private final class03556<class07376> M;
    private final class01255 B;
    private final class01255 Z;

    class05953(class04116<class04382> class041162) {
        this.N = class041162;
        class02055 class020552 = class041162.N(class04227.yu);
        this.y = class041162.N(class04227.yE);
        this.L = class041162.N(class04227.NA);
        this.u = class041162.N(class04227.ys);
        this.i = class041162.N(class04227.yb);
        this.R = class041162.N(class04227.yU);
        this.M = class020552.y(class04057.N);
        class03529 class035292 = class020552.y(class04057.y);
        class03529 var4 = this.y.y(class05943.R);
        class03529 var5 = this.R.y(class03565.N);
        this.B = new class01255((class03556)class035292, (class08088)new class04865((class00765)class05997.N((class03556<class03573>)var5), (class03556)var4));
        class03529 class035293 = class020552.y(class04057.L);
        class03529 var7 = this.y.y(class05943.M);
        this.Z = new class01255((class03556)class035293, (class08088)new class04865((class00765)class07663.N(this.L), (class03556)var7));
    }

    private void N(class05946<class04382> class059462, class01255 class012552) {
        this.N.N(class059462, (Object)this.N(class012552));
    }

    private void N(class00765 class007652) {
        class03529 var2 = this.y.y(class05943.L);
        this.N(class05964.N, this.N(class007652, (class03556<class05943>)var2));
        class03529 var3 = this.y.y(class05943.u);
        this.N(class05964.L, this.N(class007652, (class03556<class05943>)var3));
        class03529 var4 = this.y.y(class05943.i);
        this.N(class05964.u, this.N(class007652, (class03556<class05943>)var4));
    }

    public void N() {
        class03529 var1 = this.R.y(class03565.y);
        this.N(class05997.N((class03556<class03573>)var1));
        class03529 var2 = this.y.y(class05943.L);
        class03529 var3 = this.L.y(class00795.y);
        this.N(class05964.i, this.N((class00765)new class00782((class03556)var3), (class03556<class05943>)var2));
        this.N(class05964.y, this.N((class08088)new class07850(class01584.N(this.L, this.i, this.u))));
        this.N(class05964.R, this.N((class08088)new class07833(var3)));
    }

    private class04382 N(class01255 class012552) {
        return new class04382(Map.of(class01255.y, class012552, class01255.L, this.B, class01255.u, this.Z));
    }

    private class01255 N(class00765 class007652, class03556<class05943> class035562) {
        return this.N((class08088)new class04865(class007652, class035562));
    }

    private class01255 N(class08088 class080882) {
        return new class01255(this.M, class080882);
    }
}

