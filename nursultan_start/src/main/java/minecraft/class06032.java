/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04532
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class08476
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04532;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class08476;

public class class06032
extends class04532<class08476> {
    public static final class02415 N = new class02441(false, 4.0f, 4.0f, Set.of("head"));

    protected static class04792 L(class04834 class048342) {
        class04792 class047922 = class04532.N((int)6, (boolean)true, (boolean)false, (class04834)class048342);
        class047922.N().N("head", class04822.L().N(0, 0).N(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, class048342).N(16, 16).N(-2.0f, 0.0f, -9.0f, 4.0f, 3.0f, 1.0f, class048342), class04838.N((float)0.0f, (float)12.0f, (float)-6.0f));
        return class047922;
    }

    public class06032(class01686 class016862) {
        super(class016862);
    }

    public static class04806 y(class04834 class048342) {
        return class04806.N((class04792)class06032.L(class048342), (int)64, (int)64);
    }
}

