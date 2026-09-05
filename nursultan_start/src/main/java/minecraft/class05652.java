/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02680
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06517
 *  minecraft.class06525
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07310
 *  minecraft.class07324
 *  minecraft.class07536
 */
package minecraft;

import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class02484;
import minecraft.class02680;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06517;
import minecraft.class06525;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07310;
import minecraft.class07324;
import minecraft.class07536;

public class class05652
implements class05663 {
    private final class06584 N;
    private final int y;
    private final int L;
    private final int u;
    private final int i;
    private final class06581 R;
    private final int M;
    private final float B;

    public class05652(class06581 class065812, int n, class06581 class065813, int n2, int n3, int n4, int n5) {
        this.N = new class06584((class07310)class065813);
        this.L = n3;
        this.u = n4;
        this.i = n5;
        this.R = class065812;
        this.M = n;
        this.y = n2;
        this.B = 0.05f;
    }

    @Override
    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class02680 class026802 = new class02680((class07310)class06570.Ty, this.L);
        class03556 class035562 = (class03556)class07536.N_77(class04206.Z.z().filter(class035292 -> !((class06525)class035292.N()).N().isEmpty() && class047822.method_59547().N((class03556)class035292)).collect(Collectors.toList()), (class06069)class060692);
        class06584 class065842 = new class06584((class07310)this.N.B(), this.y);
        class065842.N(class02484.h, (Object)new class06517(class035562));
        return new class07324(class026802, Optional.of(new class02680((class07310)this.R, this.M)), class065842, this.u, this.i, this.B);
    }
}

