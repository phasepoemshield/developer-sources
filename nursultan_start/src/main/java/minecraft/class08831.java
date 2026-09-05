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

public class class08831
extends class06271<class06244> {
    public static final int N = 20;
    public static final int y = 40;
    public static final String L = "flag";
    private static final String u = "pole";
    private static final String i = "bar";

    public class08831(class01686 class016862) {
        super(class016862, class06851::u);
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        if (bl) {
            class048392.N(u, class04822.L().N(44, 0).N(-1.0f, -42.0f, -1.0f, 2.0f, 42.0f, 2.0f), class04838.N);
        }
        class048392.N(i, class04822.L().N(0, 42).N(-10.0f, bl ? -44.0f : -20.5f, bl ? -1.0f : 9.5f, 20.0f, 2.0f, 2.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

