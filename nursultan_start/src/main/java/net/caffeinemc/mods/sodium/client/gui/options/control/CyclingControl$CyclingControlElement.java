/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.EnumOption
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.EnumOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.StatefulControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class CyclingControl$CyclingControlElement<T extends Enum<T>>
extends StatefulControlElement {
    private final EnumOption<T> option;
    private final T[] baseValues;

    public CyclingControl$CyclingControlElement(AbstractOptionList abstractOptionList, EnumOption<T> enumOption, Dim2i dim2i, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, colorTheme);
        this.option = enumOption;
        this.baseValues = (Enum[])enumOption.enumClass.getEnumConstants();
    }

    public EnumOption<T> getOption() {
        return this.option;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.cycleControl(class06202.Nq().L());
            return true;
        }
        return false;
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (!this.option.showControl() || this.isResetOverlayActive()) {
            return;
        }
        Enum enum_ = (Enum)this.option.getValidatedValue();
        class00392 class003922 = this.option.getElementName(enum_);
        int n3 = this.getStringWidth((class05936)class003922);
        this.drawString(class010542, class003922, this.getLimitX() - n3 - 6, this.getCenterY() + -4, -1);
        if (this.isHovered()) {
            class010542.N(class06608.u);
        }
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.getOption().isEnabled() && class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.cycleControl(class066132.v() == 1);
            return true;
        }
        return false;
    }

    private void cycleControl(boolean bl) {
        int n;
        this.playClickSound();
        Enum enum_ = (Enum)this.option.getValidatedValue();
        for (n = 0; n < this.baseValues.length && this.baseValues[n] != enum_; ++n) {
        }
        int n2 = n;
        while (!this.option.isValueAllowed(enum_ = this.baseValues[n2 = bl ? (n2 + this.baseValues.length - 1) % this.baseValues.length : (n2 + 1) % this.baseValues.length])) {
        }
        this.option.modifyValue((Object)enum_);
    }
}

