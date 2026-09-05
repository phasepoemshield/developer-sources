/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class08394;

public class class03933 {
    public static final int N = 8;
    public static final int y = 8;
    public static final int L = 8;
    public static final int u = 8;
    public static final int i = 40;
    public static final int R = 8;
    public static final int M = 8;
    public static final int B = 8;
    public static final int Z = 64;
    public static final int z = 64;

    private static void N(class01054 class010542, class01894 class018942, int n, int n2, int n3, boolean bl, int n4) {
        int n5 = 8 + (bl ? 8 : 0);
        int n6 = 8 * (bl ? -1 : 1);
        class010542.N(class08394.Na, class018942, n, n2, 40.0f, (float)n5, n3, n3, 8, n6, 64, 64, n4);
    }

    public static void N(class01054 class010542, class01894 class018942, int n, int n2, int n3, boolean bl, boolean bl2, int n4) {
        int n5 = 8 + (bl2 ? 8 : 0);
        int n6 = 8 * (bl2 ? -1 : 1);
        class010542.N(class08394.Na, class018942, n, n2, 8.0f, (float)n5, n3, n3, 8, n6, 64, 64, n4);
        if (bl) {
            class03933.N(class010542, class018942, n, n2, n3, bl2, n4);
        }
    }

    public static void N(class01054 class010542, class01631 class016312, int n, int n2, int n3, int n4) {
        class03933.N(class010542, class016312.N().y(), n, n2, n3, true, false, n4);
    }

    public static void N(class01054 class010542, class01631 class016312, int n, int n2, int n3) {
        class03933.N(class010542, class016312, n, n2, n3, -1);
    }
}

