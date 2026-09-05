/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06608
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalPage
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06608;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalPage;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.ExternalButtonControl;
import net.caffeinemc.mods.sodium.client.gui.widgets.OptionListWidget$PageHeaderWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class OptionListWidget$ExternalPageWidget
extends OptionListWidget$PageHeaderWidget {
    private final class05096 screen;
    private final ExternalPage page;
    private final ColorTheme theme;

    public OptionListWidget$ExternalPageWidget(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ExternalPage externalPage, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, "\u25b6 ", externalPage.name().getString(), colorTheme, null);
        this.screen = class050962;
        this.theme = colorTheme;
        this.page = externalPage;
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00392 class003922 = ExternalButtonControl.formatExternalButtonText(true, this.theme);
        this.drawString(class010542, class003922, this.getLimitX() - 6 - this.font.N((class05936)class003922), this.getCenterY() + -4, -1);
        if (this.isHovered()) {
            class010542.N(class06608.u);
        }
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.page.currentScreenConsumer().accept(this.screen);
            this.playClickSound();
            return true;
        }
        return false;
    }
}

