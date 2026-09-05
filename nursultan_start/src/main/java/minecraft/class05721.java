/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02625
 *  minecraft.class02710
 *  minecraft.class02903
 *  minecraft.class03556
 *  minecraft.class03762
 *  minecraft.class04227
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07323
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02625;
import minecraft.class02710;
import minecraft.class02903;
import minecraft.class03556;
import minecraft.class03762;
import minecraft.class04227;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07323;
import org.jspecify.annotations.Nullable;

public class class05721
extends class06520 {
    private static @Nullable Pair<class06584, class06584> L(class02903 class029032) {
        if (class029032.i() != 2) {
            return null;
        }
        class06584 class065842 = null;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065843 = class029032.N(i);
            if (class065843.R()) continue;
            if (class065842 == null) {
                class065842 = class065843;
                continue;
            }
            return class05721.N(class065842, class065843) ? Pair.of((Object)class065842, (Object)class065843) : null;
        }
        return null;
    }

    public class05721(class03762 class037622) {
        super(class037622);
    }

    private static boolean N(class06584 class065842, class06584 class065843) {
        return class065843.N(class065842.B()) && class065842.c() == 1 && class065843.c() == 1 && class065842.L(class02484.u) && class065843.L(class02484.u) && class065842.L(class02484.i) && class065843.L(class02484.i);
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        return class05721.L(class029032) != null;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        Pair<class06584, class06584> var3 = class05721.L(class029032);
        if (var3 == null) {
            return class06584.E;
        }
        class06584 class065842 = (class06584)var3.getFirst();
        class06584 class065843 = (class06584)var3.getSecond();
        int n = Math.max(class065842.s(), class065843.s());
        int n2 = class065842.s() - class065842.P();
        int n3 = class065843.s() - class065843.P();
        int n4 = n2 + n3 + n * 5 / 100;
        class06584 class065844 = new class06584((class07310)class065842.B());
        class065844.N(class02484.u, (Object)n);
        class065844.y(Math.max(n - n4, 0));
        class02710 class027102 = class07323.y((class06584)class065842);
        class02710 class027103 = class07323.y((class06584)class065843);
        class07323.N((class06584)class065844, (T class027152) -> class019292.y(class04227.yR).z().filter(class035292 -> class035292.N(class02625.P)).forEach(class035292 -> {
            int n = Math.max(class027102.N((class03556)class035292), class027103.N((class03556)class035292));
            if (n > 0) {
                class027152.y((class03556)class035292, n);
            }
        }));
        return class065844;
    }

    public class06514<class05721> method_8119() {
        return class06514.P;
    }
}

