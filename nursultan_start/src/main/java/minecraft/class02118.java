/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class02118 {
    private static final class01894 R = class01894.y((String)"tooltip/background");
    private static final class01894 M = class01894.y((String)"tooltip/frame");
    public static final int N = 12;
    private static final int B = 3;
    public static final int y = 3;
    public static final int L = 3;
    public static final int u = 3;
    public static final int i = 3;
    private static final int Z = 9;

    private static class01894 y(@Nullable class01894 class018942) {
        if (class018942 == null) {
            return M;
        }
        return class018942.N(string -> "tooltip/" + string + "_frame");
    }

    private static class01894 N(@Nullable class01894 class018942) {
        if (class018942 == null) {
            return R;
        }
        return class018942.N(string -> "tooltip/" + string + "_background");
    }

    public static void N(class01054 class010542, int n, int n2, int n3, int n4, @Nullable class01894 class018942) {
        int n5 = n - 3 - 9;
        int n6 = n2 - 3 - 9;
        int n7 = n3 + 3 + 3 + 18;
        int n8 = n4 + 3 + 3 + 18;
        class010542.N(class08394.Na, class02118.N(class018942), n5, n6, n7, n8);
        class010542.N(class08394.Na, class02118.y(class018942), n5, n6, n7, n8);
    }
}

