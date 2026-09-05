/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class06584
 *  minecraft.class08294
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08332
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00743;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class08294;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08332;

public class class06686 {
    public static final String N = "Items";

    public static void N(class08329 class083292, class00743<class06584> class007432, boolean bl) {
        class08294 var3 = class083292.N(N, class08332.N);
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = (class06584)class007432.get(i);
            if (class065842.R()) continue;
            var3.N((Object)new class08332(i, class065842));
        }
        if (var3.N() && !bl) {
            class083292.L(N);
        }
    }

    public static void N(class08299 class082992, class00743<class06584> class007432) {
        for (class08332 class083322 : class082992.L(N, class08332.N)) {
            if (!class083322.N(class007432.size())) continue;
            class007432.set(class083322.N(), (Object)class083322.y());
        }
    }

    public static int N(class06695 class066952, Predicate<class06584> predicate, int n, boolean bl) {
        int n2 = 0;
        for (int i = 0; i < class066952.method_5439(); ++i) {
            class06584 class065842 = class066952.method_5438(i);
            int n3 = class06686.N(class065842, predicate, n - n2, bl);
            if (n3 > 0 && !bl && class065842.R()) {
                class066952.method_5447(i, class06584.E);
            }
            n2 += n3;
        }
        return n2;
    }

    public static int N(class06584 class065842, Predicate<class06584> predicate, int n, boolean bl) {
        if (class065842.R() || !predicate.test(class065842)) {
            return 0;
        }
        if (bl) {
            return class065842.c();
        }
        int n2 = n < 0 ? class065842.c() : Math.min(n, class065842.c());
        class065842.B(n2);
        return n2;
    }

    public static void N(class08329 class083292, class00743<class06584> class007432) {
        class06686.N(class083292, class007432, true);
    }

    public static class06584 N(List<class06584> list, int n) {
        if (n < 0 || n >= list.size()) {
            return class06584.E;
        }
        return list.set(n, class06584.E);
    }

    public static class06584 N(List<class06584> list, int n, int n2) {
        if (n < 0 || n >= list.size() || list.get(n).R() || n2 <= 0) {
            return class06584.E;
        }
        return list.get(n).N(n2);
    }
}

