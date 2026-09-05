/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03556
 *  minecraft.class04654
 *  minecraft.class04909
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.render.ColorGradientRenderState;
import dev.isxander.yacl3.gui.utils.YACLRenderHelper;
import java.awt.Color;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03556;
import minecraft.class04654;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;

public abstract class AbstractWidget
implements class01294,
class03434,
class04654 {
    protected final class06202 client = class06202.Nq();
    protected final class01590 textRenderer;
    protected final int inactiveColor;
    private Dimension<Integer> dim;

    public AbstractWidget(Dimension<Integer> dimension) {
        this.textRenderer = (class01590)this.client.i_3;
        this.inactiveColor = -6250336;
        this.dim = dimension;
    }

    public boolean method_25404(class06601 class066012) {
        return this.onKeyPressed(class066012.v(), class066012.n(), class066012.y());
    }

    public void method_37020(class03428 class034282) {
    }

    public class03432 method_37018() {
        return class03432.field_33784;
    }

    public boolean method_25405(double d, double d2) {
        if (this.dim == null) {
            return false;
        }
        return this.dim.isPointInside((Number)((int)d), (Number)((int)d2));
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        return this.onMouseDragged(class066132.n(), class066132.t(), class066132.v(), d, d2);
    }

    public boolean method_25400(class06626 class066262) {
        return this.onCharTyped((char)class066262.L(), class066262.N(), class066262.u());
    }

    public boolean method_25406(class06613 class066132) {
        return this.onMouseReleased(class066132.n(), class066132.t(), class066132.v());
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.onMouseClicked(class066132.n(), class066132.t(), class066132.v());
    }

    public boolean method_16803(class06601 class066012) {
        return this.onKeyReleased(class066012.v(), class066012.n(), class066012.y());
    }

    public void setDimension(Dimension<Integer> dimension) {
        this.dim = dimension;
    }

    protected void drawRainbowGradient(class01054 class010542, int n, int n2, int n3, int n4) {
        int[] nArray = new int[7];
        nArray[0] = -65536;
        nArray[1] = -256;
        nArray[2] = -16711936;
        nArray[3] = -16711681;
        nArray[4] = -16776961;
        nArray[5] = -65281;
        nArray[6] = -65536;
        int[] nArray2 = nArray;
        int n5 = n3 - n;
        int n6 = nArray2.length - 1;
        for (int i = 0; i < n6; ++i) {
            ColorGradientRenderState.createHorizontal(class010542, n + n5 / n6 * i, n2, i == n6 - 1 ? n3 : n + n5 / n6 * (i + 1), n4, nArray2[i], nArray2[i + 1]).submit(class010542);
        }
    }

    public void unfocus() {
    }

    public boolean canReset() {
        return false;
    }

    public boolean matchesSearch(String string) {
        return true;
    }

    public boolean onMouseDragged(double d, double d2, int n, double d3, double d4) {
        return false;
    }

    protected int multiplyColor(int n, float f) {
        Color color = new Color(n, true);
        return new Color(Math.max((int)((float)color.getRed() * f), 0), Math.max((int)((float)color.getGreen() * f), 0), Math.max((int)((float)color.getBlue() * f), 0), color.getAlpha()).getRGB();
    }

    protected void drawOutline(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6) {
        class010542.N(n, n2, n3, n2 + n5, n6);
        class010542.N(n3, n2, n3 - n5, n4, n6);
        class010542.N(n, n4, n3, n4 - n5, n6);
        class010542.N(n, n2, n + n5, n4, n6);
    }

    public void playDownSound() {
        class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
    }

    public boolean onCharTyped(char c, String string, int n) {
        return false;
    }

    public boolean onMouseClicked(double d, double d2, int n) {
        return false;
    }

    public boolean onMouseReleased(double d, double d2, int n) {
        return false;
    }

    public boolean onKeyReleased(int n, int n2, int n3) {
        return false;
    }

    protected void drawButtonRect(class01054 class010542, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int n5;
        if (n > n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 > n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        n5 = n3 - n;
        int n6 = n4 - n2;
        YACLRenderHelper.renderButtonTexture(class010542, n, n2, n5, n6, bl2, bl);
    }

    public boolean onKeyPressed(int n, int n2, int n3) {
        return false;
    }

    public Dimension<Integer> getDimension() {
        return this.dim;
    }
}

