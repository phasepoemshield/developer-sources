/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01042
 *  minecraft.class02530
 *  minecraft.class02680
 *  minecraft.class04782
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
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
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
import org.jspecify.annotations.Nullable;

public class class05657
implements class05663 {
    private final class02680 N;
    private final int y;
    private final class06584 L;
    private final int u;
    private final int i;
    private final float R;
    private final Optional<class05946<class02530>> M;

    public class05657(class02680 class026802, int n, class06584 class065842, int n2, int n3, float f, Optional<class05946<class02530>> optional) {
        this.N = class026802;
        this.y = n;
        this.L = class065842;
        this.u = n2;
        this.i = n3;
        this.R = f;
        this.M = optional;
    }

    class05657(class07310 class073102, int n, int n2, class07310 class073103, int n3, int n4, int n5, float f, class05946<class02530> class059462) {
        this(new class02680(class073102, n), n2, new class06584(class073103, n3), n4, n5, f, Optional.of(class059462));
    }

    private class05657(class07310 class073102, int n, int n2, class06584 class065842, int n3, int n4, int n5, float f) {
        this(new class02680(class073102, n), n2, class065842.L(n3), n4, n5, f, Optional.empty());
    }

    public class05657(class07310 class073102, int n, int n2, class06581 class065812, int n3, int n4, int n5, float f) {
        this(class073102, n, n2, new class06584((class07310)class065812), n3, n4, n5, f);
    }

    @Override
    public @Nullable class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class06584 class065842 = this.L.t();
        this.M.ifPresent(class059462 -> class07323.N((class06584)class065842, (class01042)class047822.method_30349(), (class05946)class059462, (class07052)class047822.method_8404(class070492.method_24515()), (class06069)class060692));
        return new class07324(new class02680((class07310)class06570.Ty, this.y), Optional.of(this.N), class065842, 0, this.u, this.i, this.R);
    }
}

