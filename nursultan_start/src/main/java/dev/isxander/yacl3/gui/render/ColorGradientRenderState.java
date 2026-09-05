/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01391
 */
package dev.isxander.yacl3.gui.render;

import dev.isxander.yacl3.gui.render.BaseRenderState;
import dev.isxander.yacl3.gui.render.YACLGuiElementRenderState;
import minecraft.class01054;
import minecraft.class01391;

public record ColorGradientRenderState(BaseRenderState baseState, int x0, int y0, int x1, int y1, int x0y0Color, int x1y0Color, int x0y1Color, int x1y1Color) implements YACLGuiElementRenderState
{
    public static ColorGradientRenderState create(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return new ColorGradientRenderState(BaseRenderState.create(class010542, null, n, n2, n3, n4), n, n2, n3, n4, n5, n6, n7, n8);
    }

    public static ColorGradientRenderState createHorizontal(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6) {
        return ColorGradientRenderState.create(class010542, n, n2, n3, n4, n5, n6, n5, n6);
    }

    @Override
    public void buildVertices(class01391 class013912, float f) {
        this.add2DVertex(class013912, this.x0(), this.y0(), f).method_39415(this.x0y0Color());
        this.add2DVertex(class013912, this.x0(), this.y1(), f).method_39415(this.x0y1Color());
        this.add2DVertex(class013912, this.x1(), this.y1(), f).method_39415(this.x1y1Color());
        this.add2DVertex(class013912, this.x1(), this.y0(), f).method_39415(this.x1y0Color());
    }

    public static ColorGradientRenderState createVertical(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6) {
        return ColorGradientRenderState.create(class010542, n, n2, n3, n4, n5, n5, n6, n6);
    }
}

