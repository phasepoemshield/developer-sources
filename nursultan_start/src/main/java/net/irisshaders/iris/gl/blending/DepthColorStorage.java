/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1022
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1026
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 */
package net.irisshaders.iris.gl.blending;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.blending.ColorMask;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;

public class DepthColorStorage {
    private static boolean originalDepthEnable;
    private static ColorMask originalColor;
    private static boolean depthColorLocked;

    public static void unlockDepthColor() {
        if (!depthColorLocked) {
            return;
        }
        depthColorLocked = false;
        GlStateManager._depthMask((boolean)originalDepthEnable);
        GlStateManager._colorMask((boolean)originalColor.isRedMasked(), (boolean)originalColor.isGreenMasked(), (boolean)originalColor.isBlueMasked(), (boolean)originalColor.isAlphaMasked());
    }

    public static void disableDepthColor() {
        if (!depthColorLocked) {
            GlStateManager.class_1022 class_10222 = GlStateManagerAccessor.getCOLOR_MASK();
            GlStateManager.class_1026 class_10262 = GlStateManagerAccessor.getDEPTH();
            originalDepthEnable = class_10262.field_5076;
            originalColor = new ColorMask(class_10222.field_5063, class_10222.field_5062, class_10222.field_5061, class_10222.field_5060);
        }
        depthColorLocked = false;
        GlStateManager._depthMask((boolean)false);
        GlStateManager._colorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        depthColorLocked = true;
    }

    public static void deferDepthEnable(boolean bl) {
        originalDepthEnable = bl;
    }

    public static boolean isDepthColorLocked() {
        return depthColorLocked;
    }

    public static void deferColorMask(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        originalColor = new ColorMask(bl, bl2, bl3, bl4);
    }
}

