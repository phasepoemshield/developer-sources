/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05936
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05936;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class LabelComponent
extends AbstractWidget {
    private final class00392 text;
    private final int color;

    public LabelComponent(Dim2i dim2i, class00392 class003922, int n) {
        super(dim2i);
        this.text = class003922;
        this.color = n;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3 = this.getStringWidth((class05936)this.text);
        int n4 = this.getCenterX() - n3 / 2;
        int n5 = this.getY();
        this.drawString(class010542, this.text, n4, n5, this.color);
    }
}

