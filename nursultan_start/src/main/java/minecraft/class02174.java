/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class02199
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07162
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 */
package minecraft;

import java.util.function.ToIntFunction;
import minecraft.class01286;
import minecraft.class02199;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07162;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;

public class class02174
extends class07084 {
    private static final int u = 2;
    public static final int L = 2;
    private final ToIntFunction<class06069> i;

    public class02174(class01286 class012862, int n, ToIntFunction<class06069> toIntFunction) {
        super(class012862, n, (class07126)class07107.h);
        this.i = toIntFunction;
    }

    private void N(class07299 class072992, double d, double d2, double d3) {
        class07162 class071622 = (class07162)class07078.ys.N(class072992, class06113.field_16461);
        if (class071622 == null) {
            return;
        }
        class071622.N(2, true);
        class071622.method_5808(d, d2, d3, class072992.method_8409().z() * 360.0f, 0.0f);
        class072992.method_8649((class07049)class071622);
    }

    public void N(class04782 class047822, class07438 class074382, int n, class07062 class070622) {
        if (class070622 != class07062.field_26998) {
            return;
        }
        int n2 = this.i.applyAsInt(class074382.method_59922());
        int n3 = class02174.N((Integer)class047822.method_64395().N(class07305.k), class02199.N((class07438)class074382), n2);
        for (int i = 0; i < n3; ++i) {
            this.N(class074382.method_73183(), class074382.method_23317(), class074382.method_23318() + 0.5, class074382.method_23321());
        }
    }

    protected static int N(int n, class02199 class021992, int n2) {
        if (n < 1) {
            return n2;
        }
        return class04995.N((int)0, (int)(n - class021992.count(n)), (int)n2);
    }
}

