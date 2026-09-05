/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03255
 *  minecraft.class04654
 */
package net.irisshaders.iris.gui.element;

import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03255;
import minecraft.class04654;
import net.irisshaders.iris.gui.GuiUtil;

public abstract class IrisElementRow$Element
implements class04654 {
    public boolean disabled = false;
    private boolean hovered = false;
    private boolean focused;
    private class03255 bounds = class03255.N();

    public class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public class03255 method_48202() {
        return this.bounds;
    }

    public void method_25365(boolean bl) {
        this.focused = bl;
    }

    public boolean method_25370() {
        return this.focused;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f, boolean bl) {
        this.bounds = new class03255(n, n2, n3, n4);
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, n, n2, n3, n4, this.isHovered() || this.method_25370(), this.disabled);
        this.hovered = bl;
        this.renderLabel(class010542, n, n2, n3, n4, n5, n6, f, bl);
    }

    public abstract void renderLabel(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, boolean var9);

    public boolean isHovered() {
        return this.hovered;
    }
}

