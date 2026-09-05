/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL33;

public class class12027
implements AutoCloseable {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;
    public static Object y_6;
    public static Object y_7;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;

    private class12027() {
    }

    static {
        class12027.R();
        L_0 = new class12027();
        N_4 = new int[4];
    }

    @Override
    public void close() {
        if (!((Boolean)N_5).booleanValue()) {
            return;
        }
        if (((Boolean)y_2).booleanValue()) {
            GlStateManager._enableBlend();
        } else {
            GlStateManager._disableBlend();
        }
        GlStateManager._blendFuncSeparate((int)((Integer)y_7), (int)((Integer)N_0), (int)((Integer)N_1), (int)((Integer)N_2));
        if (((Boolean)y_3).booleanValue()) {
            GlStateManager._enableDepthTest();
        } else {
            GlStateManager._disableDepthTest();
        }
        GlStateManager._depthFunc((int)((Integer)N_3));
        GlStateManager._depthMask((boolean)((Boolean)y_4));
        if (((Boolean)y_5).booleanValue()) {
            GlStateManager._enableCull();
        } else {
            GlStateManager._disableCull();
        }
        if ((Integer)L_1 == 0 || GL33.glIsProgram((int)((Integer)L_1))) {
            GL33.glUseProgram((int)((Integer)L_1));
        }
        GL33.glBindVertexArray((int)((Integer)L_2));
        GlStateManager._activeTexture((int)((Integer)y_1));
        GlStateManager._bindTexture((int)((Integer)y_0));
        GL33.glScissor((int)((int[])N_4)[0], (int)((int[])N_4)[1], (int)((int[])N_4)[2], (int)((int[])N_4)[3]);
        if (((Boolean)y_6).booleanValue()) {
            GL33.glEnable((int)3089);
        } else {
            GL33.glDisable((int)3089);
        }
    }

    public static class12027 y() {
        N_5 = true;
        L_1 = GL33.glGetInteger((int)35725);
        L_2 = GL33.glGetInteger((int)34229);
        y_1 = GL33.glGetInteger((int)34016);
        y_0 = GL33.glGetInteger((int)32873);
        y_2 = GlStateManager.BLEND.field_5045.field_5051;
        y_3 = GlStateManager.DEPTH.field_5074.field_5051;
        y_5 = GlStateManager.CULL.field_5072.field_5051;
        y_4 = GlStateManager.DEPTH.field_5076;
        N_3 = GlStateManager.DEPTH.field_5075;
        y_7 = GlStateManager.BLEND.field_5049;
        N_0 = GlStateManager.BLEND.field_5048;
        N_1 = GlStateManager.BLEND.field_5047;
        N_2 = GlStateManager.BLEND.field_5046;
        y_6 = GL33.glIsEnabled((int)3089);
        GL33.glGetIntegerv((int)3088, (int[])((int[])N_4));
        if (((Boolean)y_6).booleanValue()) {
            GL33.glDisable((int)3089);
        }
        return (class12027)L_0;
    }

    public static void N() {
        ((class12027)L_0).close();
    }

    private static void R() {
        L_0 = null;
        L_1 = 233;
        L_2 = 34;
        y_0 = 715;
        y_1 = 33984;
        y_2 = true;
        y_3 = false;
        y_4 = true;
        y_5 = true;
        y_6 = false;
        y_7 = 770;
        N_0 = 771;
        N_1 = 1;
        N_2 = 771;
        N_3 = 515;
        N_4 = null;
        N_5 = true;
    }
}

