/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class05216
 *  minecraft.class05482
 *  minecraft.class05936
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class05216;
import minecraft.class05482;
import minecraft.class05936;
import minecraft.class06541;

public abstract class ControllerWidget<T extends Controller<?>>
extends AbstractWidget {
    protected final T control;
    protected class05482 wrappedTooltip;
    protected final YACLScreen screen;
    protected boolean focused = false;
    protected boolean hovered = false;
    protected final class00392 modifiedOptionName;
    protected final String optionNameString;

    protected boolean isAvailable() {
        return this.control.option().available();
    }

    public ControllerWidget(T t, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(dimension);
        this.control = t;
        this.screen = yACLScreen;
        t.option().addListener((option, object) -> this.updateTooltip());
        this.updateTooltip();
        this.modifiedOptionName = t.option().name().L().N(class06541.field_1056);
        this.optionNameString = t.option().name().getString().toLowerCase();
    }

    protected class00392 getValueText() {
        return this.control.formatValue();
    }

    public class02106 method_48205(class02089 class020892) {
        return !this.method_25370() ? class02106.N((class04654)this) : null;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.hovered = this.method_25405(n, n2);
        class00392 class003922 = this.control.option().changed() ? this.modifiedOptionName : this.control.option().name();
        class05216 class052162 = class00392.y((String)GuiUtils.shortenString(class003922.getString(), this.textRenderer, (Integer)this.getDimension().width() - this.getControlWidth() - this.getXPadding() - 7, "...")).y(class003922.method_10866());
        this.drawButtonRect(class010542, (Integer)this.getDimension().x(), (Integer)this.getDimension().y(), (Integer)this.getDimension().xLimit(), (Integer)this.getDimension().yLimit(), this.hovered && this.isAvailable() || this.focused, this.isAvailable());
        class010542.N(this.textRenderer, (class00392)class052162, (Integer)this.getDimension().x() + this.getXPadding(), this.getTextY(), this.getValueColor(), true);
        this.drawValueText(class010542, n, n2, f);
        if (this.isHovered()) {
            this.drawHoveredControl(class010542, n, n2, f);
        }
    }

    @Override
    public void method_37020(class03428 class034282) {
        class034282.N(class03457.field_33788, this.control.option().name());
        class034282.N(class03457.field_33790, this.control.option().tooltip());
    }

    @Override
    public class03432 method_37018() {
        return this.focused ? class03432.field_33786 : (this.isHovered() ? class03432.field_33785 : class03432.field_33784);
    }

    public void method_25365(boolean bl) {
        this.focused = bl;
    }

    public boolean method_25370() {
        return this.focused;
    }

    protected int getUnhoveredControlWidth() {
        return this.textRenderer.N((class05936)this.getValueText());
    }

    protected abstract int getHoveredControlWidth();

    @Override
    public void unfocus() {
        this.focused = false;
    }

    @Override
    public boolean canReset() {
        return true;
    }

    protected int getTextY() {
        float f = (float)((Integer)this.getDimension().y()).intValue() + (float)((Integer)this.getDimension().height()).intValue() / 2.0f;
        Objects.requireNonNull(this.textRenderer);
        return (int)(f - 9.0f / 2.0f);
    }

    private void updateTooltip() {
        this.wrappedTooltip = class05482.N((class01590)this.textRenderer, (class00392)this.control.option().tooltip(), (int)(this.screen.field_22789 / 3 * 2 - 10));
    }

    @Override
    public boolean matchesSearch(String string) {
        return this.optionNameString.contains(string.toLowerCase());
    }

    protected int getYPadding() {
        return 2;
    }

    public int getControlWidth() {
        return this.isHovered() ? this.getHoveredControlWidth() : this.getUnhoveredControlWidth();
    }

    public int getXPadding() {
        return 5;
    }

    public int getValueColor() {
        return this.isAvailable() ? -1 : -6250336;
    }

    protected void drawHoveredControl(class01054 class010542, int n, int n2, float f) {
    }

    public void drawValueText(class01054 class010542, int n, int n2, float f) {
        class00392 class003922 = this.getValueText();
        class010542.N(this.textRenderer, class003922, (Integer)this.getDimension().xLimit() - this.textRenderer.N((class05936)class003922) - this.getXPadding(), this.getTextY(), this.getValueColor(), true);
    }

    public boolean isHovered() {
        return this.isAvailable() && (this.hovered || this.focused);
    }
}

