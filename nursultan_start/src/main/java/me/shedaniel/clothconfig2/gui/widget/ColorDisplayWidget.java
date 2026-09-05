/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03428
 *  minecraft.class04927
 *  minecraft.class06478
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.widget;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03428;
import minecraft.class04927;
import minecraft.class06478;
import minecraft.class06613;

public class ColorDisplayWidget
extends class06478 {
    protected class04927 textFieldWidget;
    protected int color;
    protected int size;

    public ColorDisplayWidget(class04927 class049272, int n, int n2, int n3, int n4) {
        super(n, n2, n3, n3, (class00392)class00392.i());
        this.textFieldWidget = class049272;
        this.color = n4;
        this.size = n3;
    }

    public void setColor(int n) {
        this.color = n;
    }

    public void method_25348(class06613 class066132, boolean bl) {
    }

    public void method_25357(class06613 class066132) {
    }

    public void method_47399(class03428 class034282) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.method_46426(), this.method_46427(), this.method_46426() + this.size, this.method_46427() + this.size, this.textFieldWidget.method_25370() ? -1 : -6250336, this.textFieldWidget.method_25370() ? -1 : -6250336);
        class010542.N(this.method_46426() + 1, this.method_46427() + 1, this.method_46426() + this.size - 1, this.method_46427() + this.size - 1, -1, -1);
        class010542.N(this.method_46426() + 1, this.method_46427() + 1, this.method_46426() + this.size - 1, this.method_46427() + this.size - 1, this.color, this.color);
    }
}

