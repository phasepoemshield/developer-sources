/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01631
 *  minecraft.class03933
 *  minecraft.class06357
 *  minecraft.class07923
 */
package minecraft;

import java.util.List;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01631;
import minecraft.class02590;
import minecraft.class03933;
import minecraft.class06357;
import minecraft.class07923;

public class class02567
implements class06357 {
    private static final int N = 10;
    private static final int y = 2;
    private final List<class07923> L;

    public class02567(class02590 class025902) {
        this.L = class025902.N();
    }

    private static String N(class07923 class079232) {
        return class079232.N().name();
    }

    public void method_32666(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        for (int i = 0; i < this.L.size(); ++i) {
            class07923 class079232 = this.L.get(i);
            int n5 = n2 + 2 + i * 12;
            class03933.N((class01054)class010542, (class01631)class079232.y(), (int)(n + 2), (int)n5, (int)10);
            class010542.y(class015902, class02567.N(class079232), n + 10 + 4, n5 + 2, -1);
        }
    }

    public int method_32664(class01590 class015902) {
        int n = 0;
        for (class07923 class079232 : this.L) {
            int n2 = class015902.y(class02567.N(class079232));
            if (n2 <= n) continue;
            n = n2;
        }
        return n + 10 + 6;
    }

    public int method_32661(class01590 class015902) {
        return this.L.size() * 12 + 2;
    }
}

