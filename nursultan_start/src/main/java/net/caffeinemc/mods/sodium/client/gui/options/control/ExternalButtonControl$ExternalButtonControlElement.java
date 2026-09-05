/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalButtonOption
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalButtonOption;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.options.control.ExternalButtonControl;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class ExternalButtonControl$ExternalButtonControlElement
extends ControlElement {
    private final class05096 screen;
    private final ExternalButtonOption option;
    private final Consumer<class05096> currentScreenConsumer;

    public ExternalButtonControl$ExternalButtonControlElement(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ExternalButtonOption externalButtonOption, Consumer<class05096> consumer, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, colorTheme);
        this.screen = class050962;
        this.option = externalButtonOption;
        this.currentScreenConsumer = consumer;
    }

    @Override
    public Option getOption() {
        return this.option;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.openScreen(this.screen);
            this.playClickSound();
            return true;
        }
        return false;
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00392 class003922 = ExternalButtonControl.formatExternalButtonText(this.option.isEnabled(), this.theme);
        this.drawString(class010542, class003922, this.getLimitX() - 6 - this.font.N((class05936)class003922), this.getCenterY() + -4, -1);
        if (this.isHovered()) {
            class010542.N(class06608.u);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.option.isEnabled() && class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.openScreen(this.screen);
            this.playClickSound();
            return true;
        }
        return false;
    }

    private void openScreen(class05096 class050962) {
        this.currentScreenConsumer.accept(class050962);
    }
}

