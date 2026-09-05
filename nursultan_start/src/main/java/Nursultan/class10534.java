/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02195
 *  minecraft.class02484
 *  minecraft.class02680
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class06069
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07310
 *  minecraft.class07324
 *  minecraft.class07769
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class02195;
import minecraft.class02484;
import minecraft.class02680;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07310;
import minecraft.class07324;
import minecraft.class07769;
import org.jspecify.annotations.Nullable;

public class class10534
implements class05663 {
    private final int N;
    private final class03530<class04748> y;
    private final String L;
    private final class03556<class02195> u;
    private final int i;
    private final int R;

    public class10534(int n, class03530<class04748> class035302, String string, class03556<class02195> class035562, int n2, int n3) {
        this.N = n;
        this.y = class035302;
        this.L = string;
        this.u = class035562;
        this.i = n2;
        this.R = n3;
    }

    public @Nullable class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class07209 class072092 = class047822.method_8487(this.y, class070492.method_24515(), 100, true);
        if (class072092 != null) {
            class06584 class065842 = class06548.N((class04782)class047822, (int)class072092.method_10263(), (int)class072092.method_10260(), (byte)2, (boolean)true, (boolean)true);
            class06548.N((class04782)class047822, (class06584)class065842);
            class07769.N((class06584)class065842, (class07209)class072092, (String)"+", this.u);
            class065842.N(class02484.U, (Object)class00392.L((String)this.L));
            return new class07324(new class02680((class07310)class06570.Ty, this.N), Optional.of(new class02680((class07310)class06570.jJ)), class065842, this.i, this.R, 0.2f);
        }
        return null;
    }
}

