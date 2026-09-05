/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04654
 *  minecraft.class06595
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 */
package dev.isxander.yacl3.gui.utils;

import minecraft.class04654;
import minecraft.class06595;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;

public final class WidgetUtils {
    private WidgetUtils() {
    }

    public static boolean keyPressed(class04654 class046542, int n, int n2, int n3) {
        return class046542.method_25404(new class06601(n, n2, n3));
    }

    public static boolean mouseClicked(class04654 class046542, double d, double d2, int n) {
        return class046542.method_25402(new class06613(d, d2, new class06595(n, 0)), false);
    }

    public static boolean mouseDragged(class04654 class046542, double d, double d2, int n, double d3, double d4) {
        return class046542.method_25403(new class06613(d, d2, new class06595(n, 0)), d3, d4);
    }

    public static boolean charTyped(class04654 class046542, char c, int n) {
        return class046542.method_25400(new class06626((int)c, n));
    }
}

