/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02625
 *  minecraft.class02680
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07317
 *  minecraft.class07323
 *  minecraft.class07324
 */
package minecraft;

import java.util.Optional;
import minecraft.class02625;
import minecraft.class02680;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07317;
import minecraft.class07323;
import minecraft.class07324;

public class class05655
implements class05663 {
    private final int N;
    private final class03530<class07304> y;
    private final int L;
    private final int u;

    public class05655(int n, class03530<class07304> class035302) {
        this(n, 0, Integer.MAX_VALUE, class035302);
    }

    public class05655(int n, int n2, int n3, class03530<class07304> class035302) {
        this.L = n2;
        this.u = n3;
        this.N = n;
        this.y = class035302;
    }

    @Override
    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        int n;
        class06584 class065842;
        Optional optional = class047822.method_30349().L(class04227.yR).N(this.y, class060692);
        if (!optional.isEmpty()) {
            class03556 class035562 = (class03556)optional.get();
            class07304 class073042 = (class07304)class035562.N();
            int n2 = Math.max(class073042.u(), this.L);
            int n3 = Math.min(class073042.i(), this.u);
            int n4 = class04995.N((class06069)class060692, (int)n2, (int)n3);
            class065842 = class07323.N((class07317)new class07317(class035562, n4));
            n = 2 + class060692.y(5 + n4 * 10) + 3 * n4;
            if (class035562.N(class02625.z)) {
                n *= 2;
            }
            if (n > 64) {
                n = 64;
            }
        } else {
            n = 1;
            class065842 = new class06584((class07310)class06570.jY);
        }
        return new class07324(new class02680((class07310)class06570.Ty, n), Optional.of(new class02680((class07310)class06570.jY)), class065842, 12, this.N, 0.2f);
    }
}

