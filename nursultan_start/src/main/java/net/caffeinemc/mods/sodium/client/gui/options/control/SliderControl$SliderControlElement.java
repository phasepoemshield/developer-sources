/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.SliderControlElementExtended
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 *  net.caffeinemc.mods.sodium.client.config.structure.IntegerOption
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import me.flashyreese.mods.reeses_sodium_options.client.gui.SliderControlElementExtended;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;
import net.caffeinemc.mods.sodium.client.config.structure.IntegerOption;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.StatefulControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class SliderControl$SliderControlElement
extends StatefulControlElement
implements SliderControlElementExtended {
    private static final int THUMB_WIDTH = 2;
    private static final int TRACK_HEIGHT = 1;
    private final IntegerOption option;
    private double thumbPosition;
    private boolean sliderHeld;
    private int contentWidth;
    private boolean editMode;

    public SliderControl$SliderControlElement(AbstractOptionList abstractOptionList, IntegerOption integerOption, Dim2i dim2i, ColorTheme colorTheme) {
        super(abstractOptionList, dim2i, colorTheme);
        this.option = integerOption;
        this.thumbPosition = this.getThumbPositionForValue((Integer)integerOption.getValidatedValue());
        this.sliderHeld = false;
    }

    public void setValue(double d) {
        this.thumbPosition = d;
        this.option.modifyValue((Object)this.getValueForThumbPosition());
    }

    public IntegerOption getOption() {
        return this.option;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_25370()) {
            return false;
        }
        if (class066012.L()) {
            this.setEditMode(!this.isEditMode());
            return true;
        }
        if (this.isEditMode()) {
            if (class066012.R()) {
                this.option.modifyValue((Object)class04995.N((int)((Integer)this.option.getValidatedValue() - this.option.getSteppedValidator().step()), (int)this.option.getSteppedValidator().min(), (int)this.option.getSteppedValidator().max()));
                return true;
            }
            if (class066012.M()) {
                this.option.modifyValue((Object)class04995.N((int)((Integer)this.option.getValidatedValue() + this.option.getSteppedValidator().step()), (int)this.option.getSteppedValidator().min(), (int)this.option.getSteppedValidator().max()));
                return true;
            }
        }
        return false;
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.handler$cjj000$reeses-sodium-options$render(class010542, n, n2, f, null);
        int n3 = this.getSliderX();
        int n4 = this.getSliderY();
        int n5 = 90;
        int n6 = 10;
        Integer n7 = (Integer)this.option.getValidatedValue();
        boolean bl = this.option.isEnabled();
        class00392 class003922 = this.option.formatValue(n7.intValue());
        if (!bl) {
            class003922 = this.formatDisabledControlValue(class003922);
        }
        int n8 = this.font.N((class05936)class003922);
        super.method_25394(class010542, n, n2, f);
        if (!this.option.showControl() || this.isResetOverlayActive()) {
            return;
        }
        boolean bl2 = bl && (this.hovered || this.method_25370());
        this.contentWidth = bl2 ? n5 + n8 : n8;
        if (bl2) {
            this.thumbPosition = this.getThumbPositionForValue(n7);
            int n9 = (int)((double)n3 + this.thumbPosition * (double)n5 - 2.0);
            int n10 = (int)((double)((float)n4 + (float)n6 / 2.0f) - 0.5);
            this.drawRect(class010542, n3, n10, n3 + n5, n10 + 1, this.theme.themeLighter);
            this.drawRect(class010542, n9, n4, n9 + 4, n4 + n6, -1);
            int n11 = n4 + n6 / 2 + -4;
            this.handler$cjj000$reeses-sodium-options$rso$renderSlider(class010542, n, n2, f, null, n4, n6, bl2, n9);
            this.drawString(class010542, class003922, n3 - n8 - 6, n11, -1);
        } else {
            this.drawString(class010542, class003922, n3 + n5 - n8, n4 + n6 / 2 + -4, -1);
        }
        if (this.isMouseOverSlider(n, n2)) {
            class010542.N(this.sliderHeld ? class06608.R : class06608.u);
        }
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.option.isEnabled() && class066132.v() == 0) {
            if (this.sliderHeld) {
                this.setValueFromMouse(class066132.n());
            }
            return true;
        }
        return false;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.getOption().isEnabled() && this.isMouseOverSlider((int)d, (int)d2) && class06202.Nq().L()) {
            this.setValueFromMouseScroll(d4);
            return true;
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (this.option.isEnabled() && class066132.v() == 0 && this.sliderHeld) {
            this.sliderHeld = false;
            this.playClickSound();
            return true;
        }
        return false;
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        this.sliderHeld = false;
        if (super.method_25402(class066132, bl)) {
            return true;
        }
        if (this.isResetOverlayActive()) {
            return false;
        }
        if (this.option.isEnabled() && class066132.v() == 0 && this.method_25405(class066132.n(), class066132.t())) {
            if (this.isMouseOverSlider(class066132.n(), class066132.t())) {
                this.setValueFromMouse(class066132.n());
                this.sliderHeld = true;
            }
            return true;
        }
        return false;
    }

    @Override
    public int getContentWidth() {
        return this.contentWidth;
    }

    public boolean isMouseOverSlider(double d, double d2) {
        return d >= (double)this.getSliderX() && d < (double)(this.getSliderX() + 90) && d2 >= (double)this.getSliderY() && d2 < (double)(this.getSliderY() + 10);
    }

    private void setValueFromMouseScroll(double d) {
        int n = (Integer)this.option.getValidatedValue() + this.option.getSteppedValidator().step() * (int)d;
        if (n <= this.option.getSteppedValidator().max() && n >= this.option.getSteppedValidator().min()) {
            this.option.modifyValue((Object)n);
            this.thumbPosition = this.getThumbPositionForValue((Integer)this.option.getValidatedValue());
        }
    }

    private int getValueForThumbPosition() {
        SteppedValidator steppedValidator = this.option.getSteppedValidator();
        int n = steppedValidator.step();
        int n2 = steppedValidator.min();
        int n3 = steppedValidator.max();
        return n2 + n * (int)Math.round(this.thumbPosition * (double)(n3 - n2) / (double)n);
    }

    public double getThumbPositionForValue(int n) {
        SteppedValidator steppedValidator = this.option.getSteppedValidator();
        int n2 = steppedValidator.min();
        int n3 = steppedValidator.max();
        return class04995.N((double)((double)(n - n2) / (double)(n3 - n2)), (double)0.0, (double)1.0);
    }

    public int getSliderX() {
        return this.getLimitX() - 90 - 6;
    }

    public int getSliderY() {
        return this.getCenterY() - 5;
    }

    public void handler$cjj000$reeses-sodium-options$rso$renderSlider(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo, int n3, int n4, boolean bl, int n5) {
        if (bl && this.method_25370() && this.isEditMode()) {
            this.drawRect(class010542, n5 - 1, n3 - 1, n5 + 5, n3 + n4 + 1, -1);
        }
    }

    public void handler$cjj000$reeses-sodium-options$render(class01054 class010542, int n, int n2, float f, CallbackInfo callbackInfo) {
    }

    public boolean isEditMode() {
        return this.editMode;
    }

    public void setEditMode(boolean bl) {
        this.editMode = bl;
    }

    private void setValueFromMouse(double d) {
        this.setValue(class04995.N((double)((d - (double)this.getSliderX()) / 90.0), (double)0.0, (double)1.0));
    }
}

