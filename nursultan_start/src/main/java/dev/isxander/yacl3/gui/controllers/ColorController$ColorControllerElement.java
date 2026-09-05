/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.api.utils.MutableDimension
 *  dev.isxander.yacl3.platform.YACLConfig
 *  minecraft.class01054
 *  minecraft.class06608
 */
package dev.isxander.yacl3.gui.controllers;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.api.utils.MutableDimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ColorController;
import dev.isxander.yacl3.gui.controllers.ColorPickerWidget;
import dev.isxander.yacl3.gui.controllers.string.StringControllerElement;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.platform.YACLConfig;
import java.awt.Color;
import java.util.List;
import minecraft.class01054;
import minecraft.class06608;

public class ColorController$ColorControllerElement
extends StringControllerElement {
    private final ColorController colorController;
    private ColorPickerWidget colorPickerWidget;
    protected MutableDimension<Integer> colorPreviewDim;
    private final List<Character> allowedChars;
    public boolean hoveredOverColorPreview = false;
    private boolean colorPickerVisible = false;
    private int previewOutlineFadeTicks = 0;

    public ColorController$ColorControllerElement(ColorController colorController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(colorController, yACLScreen, dimension, true);
        this.colorController = colorController;
        this.allowedChars = ImmutableList.of((Object)Character.valueOf('0'), (Object)Character.valueOf('1'), (Object)Character.valueOf('2'), (Object)Character.valueOf('3'), (Object)Character.valueOf('4'), (Object)Character.valueOf('5'), (Object)Character.valueOf('6'), (Object)Character.valueOf('7'), (Object)Character.valueOf('8'), (Object)Character.valueOf('9'), (Object)Character.valueOf('a'), (Object)Character.valueOf('b'), (Object[])new Character[]{Character.valueOf('c'), Character.valueOf('d'), Character.valueOf('e'), Character.valueOf('f')});
    }

    @Override
    public void write(String string) {
        if (string.startsWith("0x")) {
            string = string.substring(2);
        }
        for (char c : string.toCharArray()) {
            if (this.allowedChars.contains(Character.valueOf(Character.toLowerCase(c)))) continue;
            return;
        }
        if (this.caretPos == 0) {
            return;
        }
        Object object = string.substring(0, Math.min(this.inputField.length() - this.caretPos, string.length()));
        if (this.modifyInput(arg_0 -> this.lambda$write$0((String)object, arg_0))) {
            this.caretPos += ((String)object).length();
            this.setSelectionLength();
            this.updateControl();
        }
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        int n = ((Integer)dimension.height() - this.getYPadding() * 2) / 2;
        this.colorPreviewDim = Dimension.ofInt((int)((Integer)dimension.xLimit() - this.getXPadding() - n), (int)((Integer)dimension.centerY() - n / 2), (int)n, (int)n);
        if (this.colorPickerWidget != null) {
            this.colorPickerWidget.setDimension((Dimension<Integer>)this.colorPickerWidget.getDimension().withY((Number)((Integer)this.getDimension().y())));
            if ((Integer)this.getDimension().y() < this.screen.tabArea.y() || (Integer)this.getDimension().yLimit() > this.screen.tabArea.L()) {
                this.removeColorPicker();
            }
        }
    }

    public void createOrRemoveColorPicker() {
        boolean bl = this.colorPickerVisible = !this.colorPickerVisible;
        if (this.colorPickerVisible) {
            this.colorPickerWidget = this.createColorPicker();
            this.screen.addPopupControllerWidget(this.colorPickerWidget);
        } else {
            this.removeColorPicker();
        }
    }

    public boolean isMouseOverColorPreview(double d, double d2) {
        return this.colorPreviewDim.isPointInside((Number)((int)d), (Number)((int)d2));
    }

    public Color getPreviewOutlineColor(boolean bl) {
        Color color = new Color(-16777216);
        Color color2 = this.getHighlightedOutlineColor();
        if (!this.hovered && !bl) {
            this.previewOutlineFadeTicks = 0;
            return color;
        }
        int n = 80;
        int n2 = n + 120;
        if (bl) {
            this.previewOutlineFadeTicks = 0;
            return color2;
        }
        if (((YACLConfig)YACLConfig.HANDLER.instance()).showColorPickerIndicator) {
            if (this.previewOutlineFadeTicks <= n) {
                return this.getFadedColor(color, color2, this.previewOutlineFadeTicks, n);
            }
            if (this.previewOutlineFadeTicks <= n2) {
                return this.getFadedColor(color2, color, this.previewOutlineFadeTicks - n, n2 - n);
            }
            if (this.previewOutlineFadeTicks >= n + n2 + 10) {
                this.previewOutlineFadeTicks = 0;
            }
        }
        return color;
    }

    private Color getHighlightedOutlineColor() {
        Color color = (Color)this.colorController.option().pendingValue();
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        Color color2 = new Color(-1);
        if (fArray[1] < 0.1f && fArray[2] > 0.9f) {
            color2 = new Color(-3750202);
        }
        return color2;
    }

    @Override
    public void unfocus() {
        if (this.colorPickerVisible) {
            this.removeColorPicker();
        }
        this.previewOutlineFadeTicks = 0;
        super.unfocus();
    }

    @Override
    public boolean doCopy() {
        return false;
    }

    @Override
    public boolean doCut() {
        return false;
    }

    @Override
    public void doDelete() {
        if (this.caretPos >= 1 && this.modifyInput(stringBuilder -> stringBuilder.setCharAt(this.caretPos, '0'))) {
            this.updateControl();
        }
    }

    private /* synthetic */ void lambda$write$0(String string, StringBuilder stringBuilder) {
        stringBuilder.replace(this.caretPos, this.caretPos + string.length(), string);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (this.isMouseOverColorPreview(d, d2)) {
            this.playDownSound();
            this.createOrRemoveColorPicker();
            if (((YACLConfig)YACLConfig.HANDLER.instance()).showColorPickerIndicator) {
                ((YACLConfig)YACLConfig.HANDLER.instance()).showColorPickerIndicator = false;
                YACLConfig.HANDLER.save();
            }
        }
        this.caretPos = Math.max(1, this.caretPos);
        this.setSelectionLength();
        return true;
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        int n4 = this.selectionLength;
        this.selectionLength = 0;
        if (super.onKeyPressed(n, n2, n3)) {
            this.caretPos = Math.max(1, this.caretPos);
            this.setSelectionLength();
            return true;
        }
        this.selectionLength = n4;
        return false;
    }

    @Override
    public boolean doSelectAll() {
        return false;
    }

    @Override
    public int getDefaultCaretPos() {
        return this.colorController.allowAlpha() ? 3 : 1;
    }

    protected void setSelectionLength() {
        this.selectionLength = this.caretPos < this.inputField.length() && this.caretPos > 0 ? 1 : 0;
    }

    public ColorPickerWidget colorPickerWidget() {
        return this.colorPickerWidget;
    }

    public void removeColorPicker() {
        this.screen.clearPopupControllerWidget();
        this.colorPickerVisible = false;
        this.colorPickerWidget = null;
        this.hoveredOverColorPreview = false;
    }

    public ColorPickerWidget createColorPicker() {
        return new ColorPickerWidget(this.colorController, this.screen, this.getDimension(), this);
    }

    @Override
    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        this.hovered = this.method_25405(n, n2);
        if (this.isHovered()) {
            this.colorPreviewDim.move((Number)(-((Integer)this.inputFieldBounds.width()).intValue() - 8), (Number)-2);
            this.colorPreviewDim.expand((Number)4, (Number)4);
            ++this.previewOutlineFadeTicks;
            super.drawValueText(class010542, n, n2, f);
        }
        int n3 = ((Color)this.colorController.option().pendingValue()).getRGB();
        if (GuiUtils.extractAlpha(n3) < 255) {
            GuiUtils.blitSprite(class010542, ColorPickerWidget.TRANSPARENT_SPRITE, (Integer)this.colorPreviewDim.x(), (Integer)this.colorPreviewDim.y(), (Integer)this.colorPreviewDim.width(), (Integer)this.colorPreviewDim.height());
        }
        class010542.N(((Integer)this.colorPreviewDim.x()).intValue(), ((Integer)this.colorPreviewDim.y()).intValue(), ((Integer)this.colorPreviewDim.xLimit()).intValue(), ((Integer)this.colorPreviewDim.yLimit()).intValue(), n3);
        boolean bl = this.isMouseOverColorPreview(n, n2);
        Color color = this.getPreviewOutlineColor(this.hoveredOverColorPreview || bl);
        this.drawOutline(class010542, (Integer)this.colorPreviewDim.x(), (Integer)this.colorPreviewDim.y(), (Integer)this.colorPreviewDim.xLimit(), (Integer)this.colorPreviewDim.yLimit(), 1, color.getRGB());
        if (bl) {
            class010542.N(this.isAvailable() ? class06608.u : class06608.B);
        }
    }

    private Color getFadedColor(Color color, Color color2, int n, int n2) {
        int n3 = color2.getRed() - color.getRed();
        int n4 = color2.getGreen() - color.getGreen();
        int n5 = color2.getBlue() - color.getBlue();
        return new Color(color.getRed() + n3 * n / n2, color.getGreen() + n4 * n / n2, color.getBlue() + n5 * n / n2);
    }

    @Override
    public void doBackspace() {
        if (this.caretPos > 1 && this.modifyInput(stringBuilder -> stringBuilder.setCharAt(this.caretPos - 1, '0'))) {
            --this.caretPos;
            this.updateControl();
        }
    }

    public boolean colorPickerVisible() {
        return this.colorPickerVisible;
    }
}

