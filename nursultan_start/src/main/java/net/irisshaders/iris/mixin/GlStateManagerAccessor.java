/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1017
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1022
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1026
 *  com.mojang.blaze3d.opengl.GlStateManager$class_1039
 */
package net.irisshaders.iris.mixin;

import com.mojang.blaze3d.opengl.GlStateManager;

public interface GlStateManagerAccessor {
    public static /* synthetic */ GlStateManager.class_1022 getCOLOR_MASK() {
        return GlStateManager.getCOLOR_MASK$iris_$md$d1eeb7$1();
    }

    public static /* synthetic */ GlStateManager.class_1039[] getTEXTURES() {
        return GlStateManager.getTEXTURES$iris_$md$d1eeb7$4();
    }

    public static /* synthetic */ int getActiveTexture() {
        return GlStateManager.getActiveTexture$iris_$md$d1eeb7$3();
    }

    public static /* synthetic */ GlStateManager.class_1026 getDEPTH() {
        return GlStateManager.getDEPTH$iris_$md$d1eeb7$2();
    }

    public static /* synthetic */ GlStateManager.class_1017 getBLEND() {
        return GlStateManager.getBLEND$iris_$md$d1eeb7$0();
    }
}

