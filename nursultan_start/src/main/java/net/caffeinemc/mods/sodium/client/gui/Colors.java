/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 */
package net.caffeinemc.mods.sodium.client.gui;

import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;

public class Colors {
    public static final int THEME = -7019309;
    public static final int THEME_LIGHTER = -3342866;
    public static final int THEME_DARKER = -8741218;
    public static final int FOREGROUND = -1;
    public static final int FOREGROUND_DISABLED = -5592406;
    public static final int BACKGROUND_LIGHT = 0x40000000;
    public static final int BACKGROUND_MEDIUM = 0x60000000;
    public static final int BACKGROUND_HOVER = -536870912;
    public static final int BACKGROUND_OVERLAY = -369098752;
    public static final int BACKGROUND_DEFAULT = -1879048192;
    public static final int BACKGROUND_DARKER = -1342177280;
    public static final int BACKGROUND_HIGHLIGHT = 0x8FFFFFF;
    public static final int BUTTON_BORDER = -2147418130;
    private static final float LIGHTEN_FACTOR = 0.3f;
    private static final float DARKEN_FACTOR = -0.23f;

    public static int adjust(int n, float f) {
        float[] fArray = ColorARGB.toHSV((int)n);
        float f2 = class04995.N((float)(fArray[1] * (1.0f - Math.abs(f))), (float)0.0f, (float)1.0f);
        float f3 = class04995.N((float)(fArray[2] * (1.0f + f)), (float)0.0f, (float)1.0f);
        return ColorARGB.transferAlpha((int)ColorARGB.fromHSV((float)fArray[0], (float)f2, (float)f3), (int)n);
    }

    public static int lighten(int n) {
        return Colors.adjust(n, 0.3f);
    }

    public static int darken(int n) {
        return Colors.adjust(n, -0.23f);
    }

    public static int constrainColorHSV(int n, float f, float f2) {
        float[] fArray = ColorARGB.toHSV((int)n);
        fArray[1] = Math.max(fArray[1], f);
        fArray[2] = Math.max(fArray[2], f2);
        return ColorARGB.fromHSV((float[])fArray);
    }
}

