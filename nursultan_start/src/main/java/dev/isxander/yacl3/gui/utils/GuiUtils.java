/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05216
 *  minecraft.class07018
 *  minecraft.class08280
 *  minecraft.class08394
 */
package dev.isxander.yacl3.gui.utils;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05216;
import minecraft.class07018;
import minecraft.class08280;
import minecraft.class08394;

public class GuiUtils {
    public static class05216 translatableFallback(String string, class00392 class003922) {
        if (class07018.y().N(string)) {
            return class00392.L((String)string);
        }
        return class003922.L();
    }

    public static void pushPose(class01054 class010542) {
        class010542.i().pushMatrix();
    }

    public static void blitGuiTex(class01054 class010542, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, boolean bl) {
        class010542.N(GuiUtils.guiTextured(bl), class018942, n, n2, f, f2, n3, n4, n5, n6);
    }

    public static void blitGuiTex(class01054 class010542, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6) {
        GuiUtils.blitGuiTex(class010542, class018942, n, n2, f, f2, n3, n4, n5, n6, false);
    }

    public static void translateZ(class01054 class010542, float f) {
    }

    public static void rotate2D(class01054 class010542, float f) {
        class010542.i().rotate(f * ((float)Math.PI / 180));
    }

    public static void popPose(class01054 class010542) {
        class010542.i().popMatrix();
    }

    public static int putAlpha(int n, int n2) {
        return class02566.R((int)n2, (int)n);
    }

    public static void blitSprite(class01054 class010542, class01894 class018942, int n, int n2, int n3, int n4) {
        class010542.N(GuiUtils.guiTextured(false), class018942, n, n2, n3, n4);
    }

    public static void scale2D(class01054 class010542, float f, float f2) {
        class010542.i().scale(f, f2);
    }

    public static String shortenString(String object, class01590 class015902, int n, String string) {
        if (((String)object).isEmpty()) {
            return object;
        }
        boolean bl = true;
        while (class015902.y((String)object) > n) {
            object = ((String)object).substring(0, Math.max(((String)object).length() - 1 - (bl ? 1 : string.length() + 1), 0)).trim();
            if (((String)(object = (String)object + string)).equals(string)) break;
            bl = false;
        }
        return object;
    }

    public static int extractAlpha(int n) {
        return class02566.y((int)n);
    }

    public static void translate2D(class01054 class010542, float f, float f2) {
        class010542.i().translate(f, f2);
    }

    public static void setPixelARGB(class08280 class082802, int n, int n2, int n3) {
        class082802.y(n, n2, n3);
    }

    public static RenderPipeline guiTextured(boolean bl) {
        return class08394.Na;
    }

    public static void blitGuiTexColor(class01054 class010542, class01894 class018942, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7) {
        class010542.N(GuiUtils.guiTextured(false), class018942, n, n2, f, f2, n3, n4, n5, n6, n7);
    }
}

