/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05936
 */
package net.irisshaders.iris.gui.element;

import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05936;
import net.irisshaders.iris.gui.element.IrisElementRow$TextButtonElement;

public class ShaderPackSelectionList$TopButtonRowEntry$EnableShadersButtonElement
extends IrisElementRow$TextButtonElement {
    private int centerX;

    public ShaderPackSelectionList$TopButtonRowEntry$EnableShadersButtonElement(class00392 class003922, Function<IrisElementRow$TextButtonElement, Boolean> function) {
        super(class003922, function);
    }

    @Override
    public void renderLabel(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f, boolean bl) {
        int n7 = this.centerX - (int)((double)this.font.N((class05936)this.text) * 0.5);
        int n8 = n2 + (int)((double)(n4 - 8) * 0.5);
        class010542.y(this.font, this.text, n7, n8, -1);
    }
}

