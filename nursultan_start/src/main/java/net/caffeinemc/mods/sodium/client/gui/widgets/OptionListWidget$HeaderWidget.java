/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ResetButton
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.ResetButton;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.Nullable;

abstract class OptionListWidget$HeaderWidget
extends AbstractWidget {
    final AbstractOptionList list;
    final String title;
    final int textColor;
    final int backgroundColor;
    final @Nullable ResetButton resetButton;

    public OptionListWidget$HeaderWidget(AbstractOptionList abstractOptionList, Dim2i dim2i, String string, int n, int n2, @Nullable Runnable runnable) {
        super(dim2i);
        this.list = abstractOptionList;
        this.title = string;
        this.textColor = n;
        this.backgroundColor = n2;
        this.resetButton = runnable == null ? null : new ResetButton((AbstractWidget)this, runnable);
    }

    @Override
    public int getY() {
        return super.getY() - this.list.getScrollAmount();
    }

    @Override
    public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.hovered = this.method_25405(n, n2);
        this.drawRect(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), this.backgroundColor);
        this.drawString(class010542, this.truncateLabelToFit(this.title, 12), this.getX() + 6, this.getCenterY() + -4, this.textColor);
        if (this.resetButton != null) {
            this.resetButton.method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.resetButton != null && this.resetButton.method_25402(class066132, bl);
    }

    protected int rightReservedWidth() {
        return this.resetButton != null ? this.resetButton.getWidth() : 0;
    }

    protected String truncateLabelToFit(String string, int n) {
        return this.truncateTextToFit(string, this.getWidth() - n - this.rightReservedWidth());
    }
}

