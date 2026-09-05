/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.FilterMode
 */
package minecraft;

import com.mojang.blaze3d.textures.FilterMode;

class class08151 {
    static final /* synthetic */ int[] N;

    static {
        N = new int[FilterMode.values().length];
        try {
            class08151.N[FilterMode.NEAREST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            class08151.N[FilterMode.LINEAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

