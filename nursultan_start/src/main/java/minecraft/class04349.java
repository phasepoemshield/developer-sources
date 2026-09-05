/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class01584
 *  minecraft.class01627
 *  minecraft.class02055
 *  minecraft.class03522
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04086
 *  minecraft.class04095
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class07310
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class01584;
import minecraft.class01627;
import minecraft.class02055;
import minecraft.class03522;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04086;
import minecraft.class04095;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04409;
import minecraft.class04412;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class07310;

class class04349 {
    private final class04116<class04086> N;

    class04349(class04116<class04086> class041162) {
        this.N = class041162;
    }

    private void N(class05946<class04086> class059462, class07310 class073102, class05946<class00780> class059463, Set<class05946<class04412>> set, boolean bl, boolean bl2, class01627 ... class01627Array) {
        class02055 class020552 = this.N.N(class04227.yb);
        class02055 class020553 = this.N.N(class04227.ys);
        class02055 class020554 = this.N.N(class04227.NA);
        class03522 class035222 = class03543.N(set.stream().map(arg_0 -> ((class02055)class020552).y(arg_0)).collect(Collectors.toList()));
        class01584 class015842 = new class01584(Optional.of(class035222), (class03556)class020554.y(class059463), class01584.y((class02055)class020553));
        if (bl) {
            class015842.N();
        }
        if (bl2) {
            class015842.y();
        }
        for (int i = class01627Array.length - 1; i >= 0; --i) {
            class015842.i().add(class01627Array[i]);
        }
        this.N.N(class059462, (Object)new class04086((class03556)class073102.B().i(), class015842));
    }

    public void N() {
        this.N((class05946<class04086>)class04095.N, (class07310)class00869.Z, (class05946<class00780>)class00795.y, (Set<class05946<class04412>>)ImmutableSet.of(class04409.N), false, false, new class01627(1, class00869.Z), new class01627(2, class00869.z), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.y, (class07310)class00869.y, (class05946<class00780>)class00795.n, (Set<class05946<class04412>>)ImmutableSet.of(class04409.z, class04409.b), true, false, new class01627(1, class00869.Z), new class01627(5, class00869.z), new class01627(230, class00869.y), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.L, (class07310)class06570.jE, (class05946<class00780>)class00795.C, (Set<class05946<class04412>>)ImmutableSet.of(class04409.W, class04409.E, class04409.M), false, false, new class01627(90, class00869.K), new class01627(5, class00869.X), new class01627(5, class00869.z), new class01627(5, class00869.y), new class01627(64, class00869.nZ), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.u, (class07310)class00869.yk, (class05946<class00780>)class00795.y, (Set<class05946<class04412>>)ImmutableSet.of(class04409.N, class04409.z, class04409.R, class04409.U, class04409.b), true, true, new class01627(1, class00869.Z), new class01627(3, class00869.z), new class01627(59, class00869.y), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.i, (class07310)class00869.is, (class05946<class00780>)class00795.u, (Set<class05946<class04412>>)ImmutableSet.of(class04409.N, class04409.L), false, false, new class01627(1, class00869.is), new class01627(1, class00869.Z), new class01627(3, class00869.z), new class01627(59, class00869.y), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.R, (class07310)class06570.Tr, (class05946<class00780>)class00795.y, (Set<class05946<class04412>>)ImmutableSet.of(class04409.N), false, false, new class01627(1, class00869.Z), new class01627(3, class00869.z), new class01627(2, class00869.W));
        this.N((class05946<class04086>)class04095.M, (class07310)class00869.e, (class05946<class00780>)class00795.R, (Set<class05946<class04412>>)ImmutableSet.of(class04409.N, class04409.y, class04409.z, class04409.b), true, false, new class01627(8, class00869.e), new class01627(52, class00869.yL), new class01627(3, class00869.y), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.B, (class07310)class06570.WY, (class05946<class00780>)class00795.R, (Set<class05946<class04412>>)ImmutableSet.of(), false, false, new class01627(116, class00869.yL), new class01627(3, class00869.y), new class01627(1, class00869.q));
        this.N((class05946<class04086>)class04095.Z, (class07310)class00869.ZX, (class05946<class00780>)class00795.N, (Set<class05946<class04412>>)ImmutableSet.of(), true, false, new class01627(1, class00869.N));
    }
}

