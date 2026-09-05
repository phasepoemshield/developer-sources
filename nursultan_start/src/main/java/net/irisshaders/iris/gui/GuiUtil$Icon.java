/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class01054
 *  minecraft.class08394
 */
package net.irisshaders.iris.gui;

import com.mojang.blaze3d.opengl.GlStateManager;
import minecraft.class01054;
import minecraft.class08394;
import net.irisshaders.iris.gui.GuiUtil;

public class GuiUtil$Icon {
    public static final GuiUtil$Icon SEARCH = new GuiUtil$Icon(0, 0, 7, 8);
    public static final GuiUtil$Icon CLOSE = new GuiUtil$Icon(7, 0, 5, 6);
    public static final GuiUtil$Icon REFRESH = new GuiUtil$Icon(12, 0, 10, 10);
    public static final GuiUtil$Icon EXPORT = new GuiUtil$Icon(22, 0, 7, 8);
    public static final GuiUtil$Icon EXPORT_COLORED = new GuiUtil$Icon(29, 0, 7, 8);
    public static final GuiUtil$Icon IMPORT = new GuiUtil$Icon(22, 8, 7, 8);
    public static final GuiUtil$Icon IMPORT_COLORED = new GuiUtil$Icon(29, 8, 7, 8);
    private final int u;
    private final int v;
    private final int width;
    private final int height;

    public GuiUtil$Icon(int n, int n2, int n3, int n4) {
        this.u = n;
        this.v = n2;
        this.width = n3;
        this.height = n4;
    }

    public int getWidth() {
        return this.width;
    }

    public void draw(class01054 class010542, int n, int n2) {
        GlStateManager._enableBlend();
        class010542.N(class08394.Na, GuiUtil.IRIS_WIDGETS_TEX, n, n2, (float)this.u, (float)this.v, this.width, this.height, 256, 256);
    }

    public int getHeight() {
        return this.height;
    }
}

