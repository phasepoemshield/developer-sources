/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02680
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07310
 *  minecraft.class07324
 */
package minecraft;

import minecraft.class02680;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07310;
import minecraft.class07324;

public class class05673
implements class05663 {
    private final class02680 N;
    private final int y;
    private final int L;
    private final int u;
    private final float i;

    public class05673(class02680 class026802, int n, int n2, int n3) {
        this.N = class026802;
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = 0.05f;
    }

    public class05673(class07310 class073102, int n, int n2, int n3, int n4) {
        this(new class02680((class07310)class073102.B(), n), n2, n3, n4);
    }

    public class05673(class07310 class073102, int n, int n2, int n3) {
        this(class073102, n, n2, n3, 1);
    }

    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        return new class07324(this.N, new class06584((class07310)class06570.Ty, this.u), this.y, this.L, this.i);
    }
}

