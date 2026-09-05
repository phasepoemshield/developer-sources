/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.IrisRenderSystem
 */
package net.irisshaders.iris.pbr.util;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.IrisRenderSystem;

public class TextureManipulationUtil {
    private static int colorFillFBO = -1;

    public static void fillWithColor(int n, int n2, int n3) {
        if (colorFillFBO == -1) {
            colorFillFBO = GlStateManager.glGenFramebuffers();
        }
        int n4 = GlStateManager._getInteger((int)36006);
        float[] fArray = new float[4];
        IrisRenderSystem.getFloatv((int)3106, (float[])fArray);
        int n5 = GlStateManager._getInteger((int)32873);
        int[] nArray = new int[4];
        IrisRenderSystem.getIntegerv((int)2978, (int[])nArray);
        GlStateManager._glBindFramebuffer((int)36160, (int)colorFillFBO);
        IrisRenderSystem.clearColor((float)((float)(n3 >> 24 & 0xFF) / 255.0f), (float)((float)(n3 >> 16 & 0xFF) / 255.0f), (float)((float)(n3 >> 8 & 0xFF) / 255.0f), (float)((float)(n3 & 0xFF) / 255.0f));
        GlStateManager._bindTexture((int)n);
        for (int i = 0; i <= n2; ++i) {
            int n6 = GlStateManager._getTexLevelParameter((int)3553, (int)i, (int)4096);
            int n7 = GlStateManager._getTexLevelParameter((int)3553, (int)i, (int)4097);
            GlStateManager._viewport((int)0, (int)0, (int)n6, (int)n7);
            GlStateManager._glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)n, (int)i);
            GlStateManager._clear((int)16384);
            GlStateManager._glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)0, (int)i);
        }
        GlStateManager._glBindFramebuffer((int)36160, (int)n4);
        IrisRenderSystem.clearColor((float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        GlStateManager._bindTexture((int)n5);
        GlStateManager._viewport((int)nArray[0], (int)nArray[1], (int)nArray[2], (int)nArray[3]);
    }
}

