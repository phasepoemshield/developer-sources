/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class02530
 *  minecraft.class02680
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07324
 */
package minecraft;

import java.util.Optional;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class02530;
import minecraft.class02680;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07324;

public class class05675
implements class05663 {
    private final class06584 N;
    private final int y;
    private final int L;
    private final int u;
    private final float i;
    private final Optional<class05946<class02530>> R;

    public class05675(class06581 class065812, int n, int n2, int n3, int n4, float f) {
        this(new class06584((class07310)class065812), n, n2, n3, n4, f);
    }

    public class05675(class06581 class065812, int n, int n2, int n3, int n4, float f, class05946<class02530> class059462) {
        this(new class06584((class07310)class065812), n, n2, n3, n4, f, Optional.of(class059462));
    }

    public class05675(class06584 class065842, int n, int n2, int n3, int n4, float f) {
        this(class065842, n, n2, n3, n4, f, Optional.empty());
    }

    public class05675(class06584 class065842, int n, int n2, int n3, int n4, float f, Optional<class05946<class02530>> optional) {
        this.N = class065842;
        this.y = n;
        this.N.i(n2);
        this.L = n3;
        this.u = n4;
        this.i = f;
        this.R = optional;
    }

    public class05675(class00891 class008912, int n, int n2, int n3, int n4) {
        this(new class06584((class07310)class008912), n, n2, n3, n4);
    }

    public class05675(class06581 class065812, int n, int n2, int n3) {
        this(new class06584((class07310)class065812), n, n2, 12, n3);
    }

    public class05675(class06581 class065812, int n, int n2, int n3, int n4) {
        this(new class06584((class07310)class065812), n, n2, n3, n4);
    }

    public class05675(class06584 class065842, int n, int n2, int n3, int n4) {
        this(class065842, n, n2, n3, n4, 0.05f);
    }

    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class06584 class065842 = this.N.t();
        this.R.ifPresent(class059462 -> class07323.N((class06584)class065842, (class01042)class047822.method_30349(), (class05946)class059462, (class07052)class047822.method_8404(class070492.method_24515()), (class06069)class060692));
        return new class07324(new class02680((class07310)class06570.Ty, this.y), class065842, this.L, this.u, this.i);
    }
}

