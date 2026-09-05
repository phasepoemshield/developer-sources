/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class01054
 *  minecraft.class04995
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers.slider;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerWidget;
import dev.isxander.yacl3.gui.controllers.slider.ISliderController;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.gui.utils.KeyUtils;
import minecraft.class01054;
import minecraft.class04995;
import minecraft.class06608;

public class SliderControllerElement
extends ControllerWidget<ISliderController<?>> {
    private final double min;
    private final double max;
    private final double interval;
    private float interpolation;
    private Dimension<Integer> sliderBounds;
    private boolean mouseDown = false;

    public SliderControllerElement(ISliderController<?> iSliderController, YACLScreen yACLScreen, Dimension<Integer> dimension, double d, double d2, double d3) {
        super(iSliderController, yACLScreen, dimension);
        this.min = d;
        this.max = d2;
        this.interval = d3;
        this.setDimension(dimension);
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.calculateInterpolation();
    }

    @Override
    public boolean method_25405(double d, double d2) {
        return super.method_25405(d, d2) || this.mouseDown;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (!this.isAvailable() || !this.method_25405(d, d2) || !KeyUtils.hasShiftDown() && !KeyUtils.hasControlDown()) {
            return false;
        }
        this.incrementValue(d4);
        return true;
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        int n = (Integer)dimension.width() / 3;
        if (this.optionNameString.isEmpty()) {
            n = (Integer)dimension.width() / 2;
        }
        this.sliderBounds = Dimension.ofInt((int)((Integer)dimension.xLimit() - this.getXPadding() - this.getThumbWidth() / 2 - n), (int)((Integer)dimension.centerY() - 5), (int)n, (int)10);
    }

    @Override
    public int getHoveredControlWidth() {
        return (Integer)this.sliderBounds.width() + this.getUnhoveredControlWidth() + 6 + this.getThumbWidth() / 2;
    }

    protected void calculateInterpolation() {
        this.interpolation = class04995.N((float)((float)((((ISliderController)this.control).pendingValue() - ((ISliderController)this.control).min()) * 1.0 / ((ISliderController)this.control).range())), (float)0.0f, (float)1.0f);
    }

    private boolean isHoveredSliderBounds(double d, double d2) {
        return this.sliderBounds.isPointInside((Number)((int)d), (Number)((int)d2));
    }

    protected int getThumbX() {
        return (int)((float)((Integer)this.sliderBounds.x()).intValue() + (float)((Integer)this.sliderBounds.width()).intValue() * this.interpolation);
    }

    @Override
    public boolean onMouseDragged(double d, double d2, int n, double d3, double d4) {
        if (!this.isAvailable() || n != 0 || !this.mouseDown) {
            return false;
        }
        this.setValueFromMouse(d);
        return true;
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (!this.isAvailable() || n != 0 || !this.isHoveredSliderBounds(d, d2)) {
            return false;
        }
        this.mouseDown = true;
        this.setValueFromMouse(d);
        return true;
    }

    @Override
    public boolean onMouseReleased(double d, double d2, int n) {
        if (this.isAvailable() && this.mouseDown) {
            this.playDownSound();
        }
        this.mouseDown = false;
        return super.onMouseReleased(d, d2, n);
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        if (!this.focused) {
            return false;
        }
        switch (n) {
            case 263: {
                this.incrementValue(-1.0);
                break;
            }
            case 262: {
                this.incrementValue(1.0);
                break;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    @Override
    public void drawHoveredControl(class01054 class010542, int n, int n2, float f) {
        class010542.N(((Integer)this.sliderBounds.x()).intValue(), (Integer)this.sliderBounds.centerY() - 1, ((Integer)this.sliderBounds.xLimit()).intValue(), ((Integer)this.sliderBounds.centerY()).intValue(), -1);
        class010542.N((Integer)this.sliderBounds.x() + 1, ((Integer)this.sliderBounds.centerY()).intValue(), (Integer)this.sliderBounds.xLimit() + 1, (Integer)this.sliderBounds.centerY() + 1, -12566464);
        class010542.N(this.getThumbX() - this.getThumbWidth() / 2 + 1, (Integer)this.sliderBounds.y() + 1, this.getThumbX() + this.getThumbWidth() / 2 + 1, (Integer)this.sliderBounds.yLimit() + 1, -12566464);
        class010542.N(this.getThumbX() - this.getThumbWidth() / 2, ((Integer)this.sliderBounds.y()).intValue(), this.getThumbX() + this.getThumbWidth() / 2, ((Integer)this.sliderBounds.yLimit()).intValue(), -1);
        if (this.isHoveredSliderBounds(n, n2)) {
            class010542.N(this.isAvailable() ? class06608.R : class06608.B);
        }
    }

    @Override
    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        GuiUtils.pushPose(class010542);
        if (this.isHovered()) {
            GuiUtils.translate2D(class010542, -((float)((Integer)this.sliderBounds.width() + 6) + (float)this.getThumbWidth() / 2.0f), 0.0f);
        }
        super.drawValueText(class010542, n, n2, f);
        GuiUtils.popPose(class010542);
    }

    protected double roundToInterval(double d) {
        return class04995.N((double)(this.min + this.interval * (double)Math.round(d / this.interval)), (double)this.min, (double)this.max);
    }

    public void incrementValue(double d) {
        ((ISliderController)this.control).setPendingValue(class04995.N((double)(((ISliderController)this.control).pendingValue() + this.interval * d), (double)this.min, (double)this.max));
        this.calculateInterpolation();
    }

    protected void setValueFromMouse(double d) {
        double d2 = (d - (double)((Integer)this.sliderBounds.x()).intValue()) / (double)((Integer)this.sliderBounds.width()).intValue() * ((ISliderController)this.control).range();
        ((ISliderController)this.control).setPendingValue(this.roundToInterval(d2));
        this.calculateInterpolation();
    }

    protected int getThumbWidth() {
        return 4;
    }
}

