/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class08392
 *  minecraft.class08394
 */
package net.irisshaders.iris.gui;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class08392;
import minecraft.class08394;

public final class GuiUtil {
    public static final class01894 IRIS_WIDGETS_TEX = class01894.N((String)"iris", (String)"textures/gui/widgets.png");
    private static final class00392 ELLIPSIS = class00392.y((String)"...");

    private static class06202 client() {
        return class06202.Nq();
    }

    private GuiUtil() {
    }

    public static void drawTextPanel(class01590 class015902, class01054 class010542, class00392 class003922, int n, int n2) {
        GuiUtil.drawPanel(class010542, n, n2, class015902.N((class05936)class003922) + 8, 16);
        class010542.y(class015902, class003922, n + 4, n2 + 4, -1);
    }

    public static class05216 translateOrDefault(class05216 class052162, String string, Object ... objectArray) {
        if (class08392.N((String)string)) {
            return class00392.N((String)string, (Object[])objectArray);
        }
        return class052162;
    }

    public static class05216 shortenText(class01590 class015902, class05216 class052162, int n) {
        if (class015902.N((class05936)class052162) > n) {
            return class00392.y((String)class015902.N(class052162.getString(), n - class015902.N((class05936)ELLIPSIS))).y(ELLIPSIS).y(class052162.method_10866());
        }
        return class052162;
    }

    public static void drawPanel(class01054 class010542, int n, int n2, int n3, int n4) {
        int n5 = -555819298;
        int n6 = -570425344;
        class010542.N(class08394.NH, n, n2, n + n3, n2 + 1, n5);
        class010542.N(class08394.NH, n, n2 + n4 - 1, n + n3, n2 + n4, n5);
        class010542.N(class08394.NH, n, n2 + 1, n + 1, n2 + n4 - 1, n5);
        class010542.N(class08394.NH, n + n3 - 1, n2 + 1, n + n3, n2 + n4 - 1, n5);
        class010542.N(class08394.NH, n + 1, n2 + 1, n + n3 - 1, n2 + n4 - 1, n6);
    }

    public static void playButtonClickSound() {
        GuiUtil.client().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
    }

    public static void bindIrisWidgetsTexture() {
    }

    public static void drawButton(class01054 class010542, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int n5 = n3 / 2;
        int n6 = n4 / 2;
        int n7 = bl2 ? 46 : (bl ? 86 : 66);
        GlStateManager._enableBlend();
        class010542.N(class08394.Na, IRIS_WIDGETS_TEX, n, n2, 0.0f, (float)n7, n5, n6, 256, 256);
        class010542.N(class08394.Na, IRIS_WIDGETS_TEX, n + n5, n2, (float)(200 - (n3 - n5)), (float)n7, n3 - n5, n6, 256, 256);
        class010542.N(class08394.Na, IRIS_WIDGETS_TEX, n, n2 + n6, 0.0f, (float)(n7 + (20 - (n4 - n6))), n5, n4 - n6, 256, 256);
        class010542.N(class08394.Na, IRIS_WIDGETS_TEX, n + n5, n2 + n6, (float)(200 - (n3 - n5)), (float)(n7 + (20 - (n4 - n6))), n3 - n5, n4 - n6, 256, 256);
    }
}

