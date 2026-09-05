/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01016
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04540
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04890
 *  minecraft.class06069
 *  minecraft.class06461
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class01016;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04540;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04890;
import minecraft.class06069;
import minecraft.class06461;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07321;

public class class06218
extends class04748 {
    public static Object N_0;
    public static Object N_1;

    public class06218(class04758 class047582) {
        super(class047582);
    }

    static {
        class06218.B();
        N_0 = class04540.y().N((Object)new class01016(class07078.T, 2, 3), 10).N((Object)new class01016(class07078.LN, 4, 4), 5).N((Object)new class01016(class07078.yA, 5, 5), 8).N((Object)new class01016(class07078.ym, 5, 5), 2).N((Object)new class01016(class07078.Ng, 4, 4), 3).N();
        N_1 = class04748.N(class06218::new);
    }

    private static void B() {
        N_0 = null;
        N_1 = null;
    }

    public Optional<class04780> N(class04764 class047642) {
        class07321 class073212 = class047642.B();
        class07209 class072092 = new class07209(class073212.i(), 64, class073212.R());
        return Optional.of(new class04780(class072092, class032912 -> class06218.N(class032912, class047642)));
    }

    public class04367<?> N() {
        return class04367.u;
    }

    private static void N(class03291 class032912, class04764 class047642) {
        class06461 class064612 = new class06461((class06069)class047642.R(), class047642.B().N(2), class047642.B().y(2));
        class032912.N((class04890)class064612);
        class064612.N((class04890)class064612, (class03860)class032912, (class06069)class047642.R());
        List var3 = class064612.u;
        while (!var3.isEmpty()) {
            int n = class047642.R().y(var3.size());
            ((class04890)var3.remove(n)).N((class04890)class064612, (class03860)class032912, (class06069)class047642.R());
        }
        class032912.N((class06069)class047642.R(), 48, 70);
    }
}

