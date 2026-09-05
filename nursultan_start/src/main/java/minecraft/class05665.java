/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01042
 *  minecraft.class02625
 *  minecraft.class02680
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07324
 */
package minecraft;

import java.util.Optional;
import minecraft.class01042;
import minecraft.class02625;
import minecraft.class02680;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07324;

public class class05665
implements class05663 {
    private final class06584 N;
    private final int y;
    private final int L;
    private final int u;
    private final float i;

    public class05665(class06581 class065812, int n, int n2, int n3) {
        this(class065812, n, n2, n3, 0.05f);
    }

    public class05665(class06581 class065812, int n, int n2, int n3, float f) {
        this.N = new class06584((class07310)class065812);
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = f;
    }

    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        int n = 5 + class060692.y(15);
        class01042 class010422 = class047822.method_30349();
        Optional optional = class010422.L(class04227.yR).N(class02625.W);
        class06584 class065842 = class07323.N((class06069)class060692, (class06584)new class06584((class07310)this.N.B()), (int)n, (class01042)class010422, (Optional)optional);
        int n2 = Math.min(this.y + n, 64);
        class02680 class026802 = new class02680((class07310)class06570.Ty, n2);
        return new class07324(class026802, class065842, this.L, this.u, this.i);
    }
}

