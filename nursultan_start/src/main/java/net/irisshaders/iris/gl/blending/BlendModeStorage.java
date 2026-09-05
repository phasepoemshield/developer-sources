/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1017
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor
 */
package net.irisshaders.iris.gl.blending;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendMode;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.mixin.statelisteners.BooleanStateAccessor;

public class BlendModeStorage {
    private static boolean originalBlendEnable;
    private static BlendMode originalBlend;
    private static boolean blendLocked;
    private static boolean blendUnknown;

    public static void deferBlendFunc(int n, int n2, int n3, int n4) {
        originalBlend = new BlendMode(n, n2, n3, n4);
    }

    public static boolean isBlendUnknown() {
        return blendUnknown;
    }

    public static boolean isBlendLocked() {
        return blendLocked;
    }

    public static void overrideBlend(BlendMode blendMode) {
        if (!blendLocked) {
            GlStateManager.class_1017 class_10172 = GlStateManagerAccessor.getBLEND();
            originalBlendEnable = ((BooleanStateAccessor)class_10172.field_5045).isEnabled();
            originalBlend = new BlendMode(class_10172.field_5049, class_10172.field_5048, class_10172.field_5047, class_10172.field_5046);
        }
        blendLocked = false;
        if (blendMode == null) {
            GlStateManager._disableBlend();
        } else {
            GlStateManager._enableBlend();
            GlStateManager._blendFuncSeparate((int)blendMode.srcRgb(), (int)blendMode.dstRgb(), (int)blendMode.srcAlpha(), (int)blendMode.dstAlpha());
            blendUnknown = false;
        }
        blendLocked = true;
    }

    public static void restoreBlend() {
        if (!blendLocked && !blendUnknown) {
            return;
        }
        blendLocked = false;
        if (originalBlendEnable) {
            GlStateManager._enableBlend();
        } else {
            GlStateManager._disableBlend();
        }
        GlStateManager._blendFuncSeparate((int)originalBlend.srcRgb(), (int)originalBlend.dstRgb(), (int)originalBlend.srcAlpha(), (int)originalBlend.dstAlpha());
        blendUnknown = false;
    }

    public static void deferBlendModeToggle(boolean bl) {
        originalBlendEnable = bl;
    }

    public static void overrideBufferBlend(int n, BlendMode blendMode) {
        if (!blendLocked) {
            GlStateManager.class_1017 class_10172 = GlStateManagerAccessor.getBLEND();
            originalBlendEnable = ((BooleanStateAccessor)class_10172.field_5045).isEnabled();
            originalBlend = new BlendMode(class_10172.field_5049, class_10172.field_5048, class_10172.field_5047, class_10172.field_5046);
        }
        if (blendMode == null) {
            IrisRenderSystem.disableBufferBlend(n);
        } else {
            IrisRenderSystem.enableBufferBlend(n);
            IrisRenderSystem.blendFuncSeparatei(n, blendMode.srcRgb(), blendMode.dstRgb(), blendMode.srcAlpha(), blendMode.dstAlpha());
        }
        blendUnknown = true;
        blendLocked = true;
    }
}

