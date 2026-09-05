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
 *  minecraft.class06244
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
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06851;

public class class04534
extends class06271<class06244> {
    private static final String N = "plate";
    private static final String y = "handle";
    private static final int L = 10;
    private static final int u = 20;
    private final class01686 i;
    private final class01686 R;

    public class01686 L() {
        return this.R;
    }

    public class04534(class01686 class016862) {
        super(class016862, class06851::u);
        this.i = class016862.y(N);
        this.R = class016862.y(y);
    }

    public class01686 y() {
        return this.i;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(N, class04822.L().N(0, 0).N(-6.0f, -11.0f, -2.0f, 12.0f, 22.0f, 1.0f), class04838.N);
        class048392.N(y, class04822.L().N(26, 0).N(-1.0f, -3.0f, -1.0f, 2.0f, 6.0f, 6.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

