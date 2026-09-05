/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class06078
 *  minecraft.class08458
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class06078;
import minecraft.class08458;

public class class02143
extends class06078<class08458> {
    private static final String N = "main";
    private final class01686 y;

    public class02143(class01686 class016862) {
        super(class016862);
        this.y = class016862.y(N);
    }

    public void method_2819(class08458 class084582) {
        super.method_2819((Object)class084582);
        this.y.R = class084582.y * ((float)Math.PI / 180);
        this.y.i = class084582.N * ((float)Math.PI / 180);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class047922.N().N(N, class04822.L().N(0, 0).N(-4.0f, -4.0f, -1.0f, 8.0f, 8.0f, 2.0f).N(0, 10).N(-1.0f, -4.0f, -4.0f, 2.0f, 8.0f, 8.0f).N(20, 0).N(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

