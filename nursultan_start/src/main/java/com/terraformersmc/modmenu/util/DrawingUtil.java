/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class07018
 */
package com.terraformersmc.modmenu.util;

import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.util.mod.Mod;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class07018;

public class DrawingUtil {
    private static final class06202 CLIENT = class06202.Nq();

    public static void drawWrappedString(class01054 class010542, String string, int n, int n2, int n3, int n4, int n5) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        List list = ((class01590)DrawingUtil.CLIENT.i_3).y().y((class05936)class00392.y((String)string), n3, class00405.N);
        for (int i = 0; i < list.size() && i < n4; ++i) {
            class05936 class059362 = (class05936)list.get(i);
            if (i == n4 - 1 && list.size() > n4) {
                class059362 = class05936.N((class05936[])new class05936[]{(class05936)list.get(i), class05936.R((String)"...")});
            }
            class01028 class010282 = class07018.y().N(class059362);
            int n6 = n;
            if (((class01590)DrawingUtil.CLIENT.i_3).N()) {
                n6 += n3 - ((class01590)DrawingUtil.CLIENT.i_3).N(class010282);
            }
            class01590 class015902 = (class01590)DrawingUtil.CLIENT.i_3;
            Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
            class010542.y(class015902, class010282, n6, n2 + i * 9, n5);
        }
    }

    public static void drawRandomVersionBackground(Mod mod, class01054 class010542, int n, int n2, int n3, int n4) {
        int n5 = mod.getName().hashCode() + mod.getVersion().hashCode();
        Random random = new Random(n5);
        int n6 = 0xFF000000 | class04995.M((float)random.nextFloat(1.0f), (float)random.nextFloat(0.7f, 0.8f), (float)0.9f);
        if (!ModMenuConfig.RANDOM_JAVA_COLORS.getValue()) {
            n6 = -2271658;
        }
        class010542.N(n, n2, n + n3, n2 + n4, n6);
    }

    public static void drawBadge(class01054 class010542, int n, int n2, int n3, class01028 class010282, int n4, int n5, int n6) {
        class010542.N(n + 1, n2 - 1, n + n3, n2, n4);
        Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
        class010542.N(n, n2, n + 1, n2 + 9, n4);
        Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
        Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
        class010542.N(n + 1, n2 + 1 + 9 - 1, n + n3, n2 + 9 + 1, n4);
        Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
        class010542.N(n + n3, n2, n + n3 + 1, n2 + 9, n4);
        Objects.requireNonNull((class01590)DrawingUtil.CLIENT.i_3);
        class010542.N(n + 1, n2, n + n3, n2 + 9, n5);
        class010542.N((class01590)DrawingUtil.CLIENT.i_3, class010282, (int)((float)(n + 1) + (float)(n3 - ((class01590)DrawingUtil.CLIENT.i_3).N(class010282)) / 2.0f), n2 + 1, n6, false);
    }
}

