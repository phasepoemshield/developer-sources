/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.config.structure.BooleanOption
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import minecraft.class01054;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.config.structure.BooleanOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.StatefulControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

class TickBoxControl$TickBoxControlElement
extends StatefulControlElement {
    private final BooleanOption option;

    public TickBoxControl$TickBoxControlElement(AbstractOptionList abstractOptionList, BooleanOption booleanOption, Dim2i dim2i, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, colorTheme);
        this.option = booleanOption;
    }

    public BooleanOption getOption() {
        return this.option;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.toggleControl();
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
        int n3 = this.getLimitX() - 6 - 10;
        int n4 = this.getCenterY() - 5;
        int n5 = n3 + 10;
        int n6 = n4 + 10;
        boolean bl = this.option.isEnabled();
        boolean bl2 = (Boolean)this.option.getValidatedValue();
        int n7 = bl ? (bl2 ? this.theme.theme : -1) : -5592406;
        if (bl2) {
            this.drawRect(class010542, n3 + 2, n4 + 2, n5 - 2, n6 - 2, n7);
        }
        if (bl) {
            this.drawBorder(class010542, n3, n4, n5, n6, n7);
        } else {
            int n8 = 3;
            class010542.N(n3, n4, n3 + n8, n4 + 1, n7);
            class010542.N(n3, n4, n3 + 1, n4 + n8, n7);
            class010542.N(n5 - n8, n4, n5, n4 + 1, n7);
            class010542.N(n5 - 1, n4, n5, n4 + n8, n7);
            class010542.N(n3, n6 - 1, n3 + n8, n6, n7);
            class010542.N(n3, n6 - n8, n3 + 1, n6, n7);
            class010542.N(n5 - n8, n6 - 1, n5, n6, n7);
            class010542.N(n5 - 1, n6 - n8, n5, n6, n7);
        }
        if (this.isHovered()) {
            class010542.N(class06608.u);
        }
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (super.method_25402(class066132, bl)) {
            return true;
        }
        if (this.isResetOverlayActive()) {
            return false;
        }
        if (this.option.isEnabled() && class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            this.toggleControl();
            return true;
        }
        return false;
    }

    private void toggleControl() {
        this.playClickSound();
        this.option.modifyValue((Object)((Boolean)this.option.getValidatedValue() == false ? 1 : 0));
    }
}

