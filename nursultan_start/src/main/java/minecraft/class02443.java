/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06271
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06271;
import minecraft.class06851;

public class class02443
extends class06271<Float> {
    private static final String N = "bottom";
    private static final String y = "lid";
    private static final String L = "lock";
    private final class01686 u;
    private final class01686 i;

    public static class04806 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(N, class04822.L().N(0, 19).N(0.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), class04838.N);
        class048392.N(y, class04822.L().N(0, 0).N(0.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        class048392.N(L, class04822.L().N(0, 0).N(0.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public class02443(class01686 class016862) {
        super(class016862, class06851::u);
        this.u = class016862.y(y);
        this.i = class016862.y(L);
    }

    public static class04806 y() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(N, class04822.L().N(0, 19).N(1.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f), class04838.N);
        class048392.N(y, class04822.L().N(0, 0).N(1.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        class048392.N(L, class04822.L().N(0, 0).N(15.0f, -2.0f, 14.0f, 1.0f, 4.0f, 1.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(Float f) {
        super.method_2819((Object)f);
        this.i.i = this.u.i = -(f.floatValue() * 1.5707964f);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(N, class04822.L().N(0, 19).N(1.0f, 0.0f, 1.0f, 14.0f, 10.0f, 14.0f), class04838.N);
        class048392.N(y, class04822.L().N(0, 0).N(1.0f, 0.0f, 0.0f, 14.0f, 5.0f, 14.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        class048392.N(L, class04822.L().N(0, 0).N(7.0f, -2.0f, 14.0f, 2.0f, 4.0f, 1.0f), class04838.N((float)0.0f, (float)9.0f, (float)1.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

