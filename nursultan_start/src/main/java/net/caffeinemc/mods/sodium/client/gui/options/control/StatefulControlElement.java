/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.StatefulOption
 *  net.caffeinemc.mods.sodium.client.gui.widgets.ResetButton
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class01054;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.ResetButton;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public abstract class StatefulControlElement
extends ControlElement {
    protected final ResetButton resetButton = new ResetButton((AbstractWidget)this, () -> this.getOption().resetToDefault());

    public StatefulControlElement(AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, colorTheme);
    }

    public abstract StatefulOption<?> getOption();

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.hovered = this.method_25405(n, n2);
        super.method_25394(class010542, n, n2, f);
        this.resetButton.method_25394(class010542, n, n2, f);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return this.resetButton.method_25402(class066132, bl);
    }

    @Override
    protected String truncateLabelToFit(String string) {
        int n = this.isResetOverlayActive() ? this.resetButton.getWidth() : this.getContentWidth() + 20;
        return this.truncateTextToFit(string, this.getWidth() - n);
    }

    public boolean isResetOverlayActive() {
        return this.resetButton.method_37303();
    }
}

