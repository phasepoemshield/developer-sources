/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03249
 *  minecraft.class03287
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement
 */
package net.irisshaders.iris.gui.element.widget;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03249;
import minecraft.class03287;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.element.widget.StringElementWidget;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement;

public class SliderElementWidget
extends StringElementWidget {
    private static final int PREVIEW_SLIDER_WIDTH = 4;
    private static final int ACTIVE_SLIDER_WIDTH = 6;
    private boolean mouseDown = false;

    public SliderElementWidget(OptionMenuStringOptionElement optionMenuStringOptionElement) {
        super(optionMenuStringOptionElement);
    }

    @Override
    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            if (class06202.Nq().L()) {
                if (this.applyOriginalValue()) {
                    this.navigation.refresh();
                }
                GuiUtil.playButtonClickSound();
                return true;
            }
            this.mouseDown = !this.mouseDown;
            this.usedKeyboard = true;
            GuiUtil.playButtonClickSound();
            return true;
        }
        if (this.mouseDown && this.usedKeyboard) {
            if (class066012.R()) {
                this.valueIndex = Math.max(0, this.valueIndex - 1);
                this.updateLabels();
                return true;
            }
            if (class066012.M()) {
                this.valueIndex = Math.min(this.valueCount - 1, this.valueIndex + 1);
                this.updateLabels();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean method_25406(class06613 class066132) {
        if (class066132.v() == 0) {
            this.onReleased();
            return true;
        }
        return super.method_25406(class066132);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            if (class06202.Nq().L()) {
                if (this.applyOriginalValue()) {
                    this.navigation.refresh();
                }
                GuiUtil.playButtonClickSound();
                return true;
            }
            this.mouseDown = true;
            GuiUtil.playButtonClickSound();
            return true;
        }
        return false;
    }

    @Override
    public void render(class01054 class010542, int n, int n2, float f, boolean bl) {
        this.updateRenderParams(35);
        if (!bl && !this.method_25370()) {
            if (this.usedKeyboard) {
                this.usedKeyboard = false;
                this.mouseDown = false;
            }
            this.renderOptionWithValue(class010542, false, (float)this.valueIndex / (float)(this.valueCount - 1), 4);
        } else {
            this.renderSlider(class010542);
        }
        if (this.usedKeyboard) {
            if (class06202.Nq().L()) {
                this.renderTooltip(class010542, SET_TO_DEFAULT, this.bounds.y(class03249.field_41829), this.bounds.R().y(), bl);
            } else if (!this.screen.isDisplayingComment()) {
                this.renderTooltip(class010542, (class00392)this.unmodifiedLabel, this.bounds.y(class03249.field_41829), this.bounds.R().y(), bl);
            }
        } else if (class06202.Nq().L()) {
            this.renderTooltip(class010542, SET_TO_DEFAULT, n, n2, bl);
        } else if (!this.screen.isDisplayingComment()) {
            this.renderTooltip(class010542, (class00392)this.unmodifiedLabel, n, n2, bl);
        }
        if (this.usedKeyboard && !this.method_25370()) {
            this.usedKeyboard = false;
            this.onReleased();
        }
        if (this.mouseDown && !this.usedKeyboard) {
            if (!bl) {
                this.onReleased();
            }
            this.whileDragging(n);
        }
    }

    private void whileDragging(int n) {
        float f = class04995.N((float)((float)(n - (this.bounds.R().N() + 4)) / (float)(this.bounds.M() - 8)), (float)0.0f, (float)1.0f);
        int n2 = Math.min(this.valueCount - 1, (int)(f * (float)this.valueCount));
        if (this.valueIndex != n2) {
            this.valueIndex = n2;
            this.updateLabels();
        }
    }

    private void renderSlider(class01054 class010542) {
        GuiUtil.bindIrisWidgetsTexture();
        GuiUtil.drawButton(class010542, this.bounds.R().N(), this.bounds.R().y(), this.bounds.M(), this.bounds.B(), this.method_25370(), false);
        GuiUtil.drawButton(class010542, this.bounds.R().N() + 2, this.bounds.R().y() + 2, this.bounds.M() - 4, this.bounds.B() - 4, false, true);
        int n = this.bounds.M() - 8 - 6;
        int n2 = this.bounds.R().N() + 4 + (int)((float)this.valueIndex / (float)(this.valueCount - 1) * (float)n);
        GuiUtil.drawButton(class010542, n2, this.bounds.R().y() + 4, 6, this.bounds.B() - 8, this.mouseDown, false);
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        class010542.y(class015902, this.valueLabel, this.bounds.y(class03287.field_41822) - (int)((double)class015902.N((class05936)this.valueLabel) * 0.5), this.bounds.R().y() + 7, -1);
    }

    private void onReleased() {
        this.mouseDown = false;
        this.queue();
        this.navigation.refresh();
        GuiUtil.playButtonClickSound();
    }
}

