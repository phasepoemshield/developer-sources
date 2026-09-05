/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.api.utils.MutableDimension
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.api.utils.MutableDimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ColorController;
import dev.isxander.yacl3.gui.controllers.ColorController$ColorControllerElement;
import dev.isxander.yacl3.gui.controllers.ControllerPopupWidget;
import dev.isxander.yacl3.gui.render.ColorGradientRenderState;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.gui.utils.WidgetUtils;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.awt.Color;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class06608;

public class ColorPickerWidget
extends ControllerPopupWidget<ColorController> {
    public static final class01894 COLOR_PICKER_SPRITE = YACLPlatform.rl((String)"controller/colorpicker");
    public static final class01894 TRANSPARENT_SPRITE = YACLPlatform.rl((String)"controller/transparent");
    private final ColorController controller;
    private final ColorController$ColorControllerElement entryWidget;
    protected MutableDimension<Integer> colorPickerDim;
    protected MutableDimension<Integer> previewColorDim;
    protected MutableDimension<Integer> saturationLightDim;
    protected MutableDimension<Integer> hueGradientDim;
    protected MutableDimension<Integer> alphaGradientDim;
    private boolean mouseDown;
    private boolean hueSliderDown;
    private boolean satLightGradientDown;
    private boolean alphaSliderDown;
    private int hueThumbX;
    private int satLightThumbX;
    private int alphaThumbX;
    private boolean charTyped;
    private final int outline;
    private final int previewPortion;
    private final int sliderHeight;
    private final int paddingX;
    private final int paddingY;
    private float[] HSL;
    private float hue;
    private float saturation;
    private float light;
    private int alpha;

    protected float light() {
        return this.HSL[2];
    }

    public ColorPickerWidget(ColorController colorController, YACLScreen yACLScreen, Dimension<Integer> dimension, ColorController$ColorControllerElement colorController$ColorControllerElement) {
        super(colorController, yACLScreen, dimension, colorController$ColorControllerElement);
        this.outline = 1;
        this.previewPortion = 7;
        this.sliderHeight = 7;
        this.paddingX = 1;
        this.paddingY = 3;
        this.controller = colorController;
        this.entryWidget = colorController$ColorControllerElement;
        this.setDimension(dimension);
        this.updateHSL();
        this.setThumbX();
    }

    @Override
    public void close() {
        this.entryWidget.removeColorPicker();
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.updateHSL();
        int n3 = 4;
        int n4 = 4;
        GuiUtils.pushPose(class010542);
        GuiUtils.translateZ(class010542, 10.0f);
        GuiUtils.blitSprite(class010542, COLOR_PICKER_SPRITE, (Integer)this.colorPickerDim.x() - 5, (Integer)this.colorPickerDim.y() - 5, (Integer)this.colorPickerDim.width() + 10, (Integer)this.colorPickerDim.height() + 10);
        class010542.N((Integer)this.previewColorDim.x() - 1, (Integer)this.previewColorDim.y() - 1, (Integer)this.previewColorDim.xLimit() + 1, (Integer)this.previewColorDim.yLimit() + 1, Color.black.getRGB());
        if (this.controller.allowAlpha()) {
            GuiUtils.blitSprite(class010542, TRANSPARENT_SPRITE, (Integer)this.previewColorDim.x(), (Integer)this.previewColorDim.y(), (Integer)this.previewColorDim.width(), (Integer)this.previewColorDim.height());
        }
        class010542.N(((Integer)this.previewColorDim.x()).intValue(), ((Integer)this.previewColorDim.y()).intValue(), ((Integer)this.previewColorDim.xLimit()).intValue(), ((Integer)this.previewColorDim.yLimit()).intValue(), ((Color)this.controller.option().pendingValue()).getRGB());
        class010542.N((Integer)this.saturationLightDim.x() - 1, (Integer)this.saturationLightDim.y() - 1, (Integer)this.saturationLightDim.xLimit() + 1, (Integer)this.saturationLightDim.yLimit() + 1, Color.black.getRGB());
        ColorGradientRenderState.createHorizontal(class010542, (Integer)this.saturationLightDim.x(), (Integer)this.saturationLightDim.y(), (Integer)this.saturationLightDim.xLimit(), (Integer)this.saturationLightDim.yLimit(), -1, GuiUtils.putAlpha((int)this.getRgbFromHueX(), 255)).submit(class010542);
        class010542.N(((Integer)this.saturationLightDim.x()).intValue(), ((Integer)this.saturationLightDim.y()).intValue(), ((Integer)this.saturationLightDim.xLimit()).intValue(), ((Integer)this.saturationLightDim.yLimit()).intValue(), 0, -16777216);
        class010542.N(this.satLightThumbX - n3 / 2 - 2, this.getSatLightThumbY() + n4 / 2 + 2, this.satLightThumbX + n3 / 2 + 1, this.getSatLightThumbY() - n4 / 2 - 1, -12566464);
        class010542.N(this.satLightThumbX - n3 / 2 - 1, this.getSatLightThumbY() + n4 / 2 + 1, this.satLightThumbX + n3 / 2, this.getSatLightThumbY() - n4 / 2, -1);
        class010542.N((Integer)this.hueGradientDim.x() - 1, (Integer)this.hueGradientDim.y() - 1, (Integer)this.hueGradientDim.xLimit() + 1, (Integer)this.hueGradientDim.yLimit() + 1, Color.black.getRGB());
        this.drawRainbowGradient(class010542, (Integer)this.hueGradientDim.x(), (Integer)this.hueGradientDim.y(), (Integer)this.hueGradientDim.xLimit(), (Integer)this.hueGradientDim.yLimit());
        class010542.N(this.hueThumbX - n3 / 2 - 1, (Integer)this.hueGradientDim.y() - 1 - 1, this.hueThumbX + n3 / 2 + 1, (Integer)this.hueGradientDim.yLimit() + 1 + 1, -12566464);
        class010542.N(this.hueThumbX - n3 / 2, (Integer)this.hueGradientDim.y() - 1, this.hueThumbX + n3 / 2, (Integer)this.hueGradientDim.yLimit() + 1, -1);
        if (this.controller.allowAlpha()) {
            class010542.N((Integer)this.alphaGradientDim.x() - 1, (Integer)this.alphaGradientDim.y() - 1, (Integer)this.alphaGradientDim.xLimit() + 1, (Integer)this.alphaGradientDim.yLimit() + 1, Color.black.getRGB());
            GuiUtils.blitSprite(class010542, TRANSPARENT_SPRITE, (Integer)this.alphaGradientDim.x(), (Integer)this.alphaGradientDim.y(), (Integer)this.alphaGradientDim.width(), 7);
            ColorGradientRenderState.createHorizontal(class010542, (Integer)this.alphaGradientDim.x(), (Integer)this.alphaGradientDim.y(), (Integer)this.alphaGradientDim.xLimit(), (Integer)this.alphaGradientDim.yLimit(), GuiUtils.putAlpha(this.getRgbWithoutAlpha(), 255), 0).submit(class010542);
            class010542.N(this.alphaThumbX - n3 / 2 - 1, (Integer)this.alphaGradientDim.y() - 1 - 1, this.alphaThumbX + n3 / 2 + 1, (Integer)this.alphaGradientDim.yLimit() + 1 + 1, -12566464);
            class010542.N(this.alphaThumbX - n3 / 2, (Integer)this.alphaGradientDim.y() - 1, this.alphaThumbX + n3 / 2, (Integer)this.alphaGradientDim.yLimit() + 1, -1);
        }
        GuiUtils.popPose(class010542);
        if (this.isHoveringHueSlider(n, n2)) {
            class010542.N(class06608.R);
        } else if (this.isHoveringAlphaSlider(n, n2)) {
            class010542.N(class06608.R);
        } else if (this.isHoveringSatLightGradient(n, n2)) {
            class010542.N(class06608.L);
        }
    }

    @Override
    public boolean method_25405(double d, double d2) {
        return d >= (double)((Integer)this.colorPickerDim.x() - 1 - 3) && d <= (double)((Integer)this.colorPickerDim.xLimit() + 1 + 3) && d2 >= (double)((Integer)this.colorPickerDim.y() - 1 - 3) && d2 <= (double)((Integer)this.colorPickerDim.yLimit() + 1 + 3);
    }

    protected float saturation() {
        return this.HSL[1];
    }

    protected int getAlpha() {
        return ((Color)this.controller.option().pendingValue()).getAlpha();
    }

    protected float hue() {
        return this.HSL[0];
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        int n = (Integer)dimension.height() * 2 + 7;
        int n2 = (Integer)dimension.centerX() - this.getXPadding() * 2;
        int n3 = (Integer)dimension.y() - n - 7;
        int n4 = 0;
        if (this.controller.allowAlpha()) {
            n4 = 11;
            n += n4;
            n3 -= n4;
        }
        if (n3 < this.screen.tabArea.y()) {
            n3 = (Integer)dimension.yLimit() + 7;
        }
        this.colorPickerDim = Dimension.ofInt((int)n2, (int)n3, (int)((Integer)dimension.xLimit() - n2), (int)n);
        this.previewColorDim = Dimension.ofInt((int)((Integer)this.colorPickerDim.x()), (int)((Integer)this.colorPickerDim.y()), (int)((Integer)this.colorPickerDim.x() + (Integer)this.colorPickerDim.xLimit() / 7 - 1 - (Integer)this.colorPickerDim.x()), (int)((Integer)this.colorPickerDim.yLimit() - 7 - 3 - (Integer)this.colorPickerDim.y() - n4));
        this.saturationLightDim = Dimension.ofInt((int)((Integer)this.colorPickerDim.x() + (Integer)this.colorPickerDim.xLimit() / 7 + 1 + 1), (int)((Integer)this.colorPickerDim.y()), (int)((Integer)this.colorPickerDim.xLimit() - ((Integer)this.colorPickerDim.x() + (Integer)this.colorPickerDim.xLimit() / 7 + 1 + 1)), (int)((Integer)this.colorPickerDim.yLimit() - 7 - 3 - (Integer)this.colorPickerDim.y() - n4));
        this.hueGradientDim = Dimension.ofInt((int)((Integer)this.colorPickerDim.x()), (int)((Integer)this.colorPickerDim.yLimit() - 7 - n4), (int)((Integer)this.colorPickerDim.width()), (int)7);
        if (this.controller.allowAlpha()) {
            this.alphaGradientDim = Dimension.ofInt((int)((Integer)this.hueGradientDim.x()), (int)((Integer)this.hueGradientDim.y() + n4), (int)((Integer)this.hueGradientDim.width()), (int)7);
        }
    }

    private boolean isHoveringHueSlider(double d, double d2) {
        return d2 >= (double)((Integer)this.hueGradientDim.y()).intValue() && d2 <= (double)((Integer)this.hueGradientDim.yLimit()).intValue() && d >= (double)((Integer)this.hueGradientDim.x()).intValue() && d <= (double)((Integer)this.hueGradientDim.xLimit()).intValue();
    }

    private boolean isHoveringSatLightGradient(double d, double d2) {
        return d2 >= (double)((Integer)this.saturationLightDim.y()).intValue() && d2 <= (double)((Integer)this.saturationLightDim.yLimit()).intValue() && d >= (double)((Integer)this.saturationLightDim.x()).intValue() && d <= (double)((Integer)this.saturationLightDim.xLimit()).intValue();
    }

    public boolean clickedSatLightGradient(double d, double d2) {
        if (this.hueSliderDown || this.alphaSliderDown) {
            return false;
        }
        if (this.isHoveringSatLightGradient(d, d2)) {
            this.satLightGradientDown = true;
        }
        if (this.satLightGradientDown) {
            this.satLightThumbX = (int)class04995.N((double)d, (double)((Integer)this.saturationLightDim.x()).intValue(), (double)((Integer)this.saturationLightDim.xLimit()).intValue());
        }
        return this.satLightGradientDown;
    }

    public void setColorFromMouseClick(double d, double d2) {
        if (this.clickedSatLightGradient(d, d2)) {
            this.setSatLightFromMouse(d, d2);
        } else if (this.clickedHueSlider(d, d2)) {
            this.setHueFromMouse(d);
        } else if (this.controller.allowAlpha() && this.clickedAlphaSlider(d, d2)) {
            this.setAlphaFromMouse(d);
        }
    }

    private boolean isHoveringAlphaSlider(double d, double d2) {
        if (this.alphaGradientDim == null) {
            return false;
        }
        return d2 >= (double)((Integer)this.alphaGradientDim.y()).intValue() && d2 <= (double)((Integer)this.alphaGradientDim.yLimit()).intValue() && d >= (double)((Integer)this.alphaGradientDim.x()).intValue() && d <= (double)((Integer)this.alphaGradientDim.xLimit()).intValue();
    }

    public void setColorControllerFromHSL() {
        float f = (float)(this.hueThumbX - (Integer)this.colorPickerDim.x()) / (float)((Integer)this.colorPickerDim.width()).intValue();
        Color color = Color.getHSBColor(f, this.saturation, this.light);
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), this.alpha);
        this.controller.option().requestSet((Object)color2);
    }

    public void setSatLightFromMouse(double d, double d2) {
        float f;
        if (d < (double)((Integer)this.saturationLightDim.x()).intValue()) {
            this.saturation = 0.0f;
        } else if (d > (double)((Integer)this.saturationLightDim.xLimit()).intValue()) {
            this.saturation = 1.0f;
        } else {
            f = (float)(d - (double)((Integer)this.saturationLightDim.x()).intValue()) / (float)((Integer)this.saturationLightDim.width()).intValue();
            this.saturation = class04995.N((float)f, (float)0.0f, (float)1.0f);
        }
        if (d2 < (double)((Integer)this.saturationLightDim.y()).intValue()) {
            this.light = 1.0f;
        } else if (d2 > (double)((Integer)this.saturationLightDim.yLimit()).intValue()) {
            this.light = 0.0f;
        } else {
            f = (float)(d2 - (double)((Integer)this.saturationLightDim.y()).intValue()) / (float)((Integer)this.saturationLightDim.height()).intValue();
            this.light = class04995.N((float)(1.0f - f), (float)0.0f, (float)1.0f);
        }
        this.setColorControllerFromHSL();
    }

    public void setThumbX() {
        this.hueThumbX = this.getHueThumbX();
        this.satLightThumbX = this.getSatLightThumbX();
        if (this.controller.allowAlpha()) {
            this.alphaThumbX = this.getAlphaThumbX();
        }
    }

    protected float[] getHSL() {
        Color color = (Color)this.controller.option().pendingValue();
        return Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
    }

    protected void updateHSL() {
        this.HSL = this.getHSL();
        this.hue = this.hue();
        this.saturation = this.saturation();
        this.light = this.light();
        this.alpha = this.getAlpha();
        if (this.charTyped) {
            this.setThumbX();
            this.charTyped = false;
        }
    }

    @Override
    public class00392 popupTitle() {
        return class00392.L((String)"yacl.control.color.color_picker_title");
    }

    @Override
    public boolean onMouseDragged(double d, double d2, int n, double d3, double d4) {
        if (this.mouseDown || this.method_25405(d, d2)) {
            this.setColorFromMouseClick(d, d2);
            return true;
        }
        return this.entryWidget.onMouseDragged(d, d2, n, d3, d4);
    }

    @Override
    public boolean onCharTyped(char c, String string, int n) {
        this.charTyped = true;
        return this.entryWidget.onCharTyped(c, string, n);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (this.method_25405(d, d2)) {
            this.mouseDown = true;
            this.hueSliderDown = false;
            this.satLightGradientDown = false;
            this.alphaSliderDown = false;
            this.setColorFromMouseClick(d, d2);
            return true;
        }
        if (this.entryWidget.method_25405(d, d2)) {
            return WidgetUtils.mouseClicked(this.entryWidget, d, d2, n);
        }
        this.close();
        return false;
    }

    @Override
    public boolean onMouseReleased(double d, double d2, int n) {
        this.mouseDown = false;
        return false;
    }

    @Override
    public void renderBackground(class01054 class010542, int n, int n2, float f) {
        this.entryWidget.hoveredOverColorPreview = this.entryWidget.isMouseOverColorPreview(n, n2);
    }

    public void setAlphaFromMouse(double d) {
        if (d < (double)((Integer)this.alphaGradientDim.x()).intValue()) {
            this.alpha = 255;
        } else if (d > (double)((Integer)this.alphaGradientDim.xLimit()).intValue()) {
            this.alpha = 0;
        } else {
            int n = (int)((d - (double)((Integer)this.alphaGradientDim.xLimit()).intValue()) / (double)((Integer)this.alphaGradientDim.width()).intValue() * -255.0);
            this.alpha = class04995.N((int)n, (int)0, (int)255);
        }
        this.setColorControllerFromHSL();
    }

    protected int getRgbWithoutAlpha() {
        Color color = (Color)this.controller.option().pendingValue();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
        return color2.getRGB();
    }

    protected int getHueThumbX() {
        int n = (Integer)this.hueGradientDim.x();
        int n2 = (Integer)this.hueGradientDim.xLimit();
        int n3 = (int)((float)n + (float)((Integer)this.hueGradientDim.width()).intValue() * this.hue);
        return class04995.N((int)n3, (int)n, (int)n2);
    }

    protected int getSatLightThumbX() {
        int n = (Integer)this.saturationLightDim.x();
        int n2 = (Integer)this.saturationLightDim.xLimit();
        int n3 = (int)((float)n + (float)((Integer)this.saturationLightDim.width()).intValue() * this.saturation);
        return class04995.N((int)n3, (int)n, (int)n2);
    }

    public boolean clickedHueSlider(double d, double d2) {
        if (this.satLightGradientDown || this.alphaSliderDown) {
            return false;
        }
        if (this.isHoveringHueSlider(d, d2)) {
            this.hueSliderDown = true;
        }
        if (this.hueSliderDown) {
            this.hueThumbX = (int)class04995.N((double)d, (double)((Integer)this.hueGradientDim.x()).intValue(), (double)((Integer)this.hueGradientDim.xLimit()).intValue());
        }
        return this.hueSliderDown;
    }

    protected float getRgbFromHueX() {
        float f = (float)(this.hueThumbX - (Integer)this.colorPickerDim.x()) / (float)((Integer)this.colorPickerDim.width()).intValue();
        return Color.HSBtoRGB(f, 1.0f, 1.0f);
    }

    protected int getAlphaThumbX() {
        int n = (Integer)this.alphaGradientDim.x();
        int n2 = (Integer)this.alphaGradientDim.xLimit();
        int n3 = n2 - (Integer)this.alphaGradientDim.width() * this.alpha / 255;
        return class04995.N((int)n3, (int)n, (int)n2);
    }

    public boolean clickedAlphaSlider(double d, double d2) {
        if (this.satLightGradientDown || this.hueSliderDown) {
            return false;
        }
        if (this.isHoveringAlphaSlider(d, d2)) {
            this.alphaSliderDown = true;
        }
        if (this.alphaSliderDown) {
            this.alphaThumbX = (int)class04995.N((double)d, (double)((Integer)this.alphaGradientDim.x()).intValue(), (double)((Integer)this.alphaGradientDim.xLimit()).intValue());
        }
        return this.alphaSliderDown;
    }

    protected int getSatLightThumbY() {
        int n = (Integer)this.saturationLightDim.y();
        int n2 = (Integer)this.saturationLightDim.yLimit();
        int n3 = (int)((float)n + (float)((Integer)this.saturationLightDim.height()).intValue() * (1.0f - this.light));
        return class04995.N((int)n3, (int)n, (int)n2);
    }

    public void setHueFromMouse(double d) {
        if (d < (double)((Integer)this.hueGradientDim.x()).intValue()) {
            this.hue = 0.0f;
        } else if (d > (double)((Integer)this.hueGradientDim.xLimit()).intValue()) {
            this.hue = 1.0f;
        } else {
            float f = (float)(d - (double)((Integer)this.hueGradientDim.x()).intValue()) / (float)((Integer)this.hueGradientDim.width()).intValue();
            this.hue = class04995.N((float)f, (float)0.0f, (float)1.0f);
        }
        this.setColorControllerFromHSL();
    }
}

