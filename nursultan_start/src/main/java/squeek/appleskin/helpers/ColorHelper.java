/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package squeek.appleskin.helpers;

import minecraft.class04995;

public class ColorHelper {
    public static int argbFromRGBA(float f, float f2, float f3, float f4) {
        return class04995.N((double)((double)f4 * 255.0)) << 24 | class04995.N((double)((double)f * 255.0)) << 16 | class04995.N((double)((double)f2 * 255.0)) << 8 | class04995.N((double)((double)f3 * 255.0));
    }
}

