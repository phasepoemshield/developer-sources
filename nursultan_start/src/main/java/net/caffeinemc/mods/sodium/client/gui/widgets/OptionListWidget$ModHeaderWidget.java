/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class06541
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class06541;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$HeaderWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class OptionListWidget$ModHeaderWidget
extends OptionListWidget$HeaderWidget {
    final class01894 icon;
    final boolean iconMonochrome;

    public OptionListWidget$ModHeaderWidget(AbstractOptionList abstractOptionList, Dim2i dim2i, ModOptions modOptions, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, String.valueOf(class06541.field_1067) + modOptions.name(), colorTheme.themeLighter, -1342177280, () -> OptionListWidget.resetAllOptions(modOptions));
        this.icon = modOptions.icon();
        this.iconMonochrome = modOptions.iconMonochrome();
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.hovered = this.method_25405(n, n2);
        this.drawRect(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), this.backgroundColor);
        int n3 = 6;
        int n4 = this.getCenterY() + -4;
        if (this.icon != null) {
            n3 = VideoSettingsScreen.renderIconWithSpacing(class010542, this.icon, this.textColor, this.iconMonochrome, this.getX(), this.getY(), this.getHeight(), 4);
            n4 = this.getCenterY() + -3;
        }
        this.drawString(class010542, this.truncateLabelToFit(this.title, n3), this.getX() + n3, n4, this.textColor);
        if (this.resetButton != null) {
            this.resetButton.method_25394(class010542, n, n2, f);
        }
    }
}

