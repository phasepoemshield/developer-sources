/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05936
 *  minecraft.class06541
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownController;
import dev.isxander.yacl3.gui.controllers.dropdown.DropdownWidget;
import dev.isxander.yacl3.gui.controllers.string.StringControllerElement;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import dev.isxander.yacl3.gui.utils.KeyUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05936;
import minecraft.class06541;

public abstract class AbstractDropdownControllerElement<T, U>
extends StringControllerElement {
    private final AbstractDropdownController<T> dropdownController;
    protected DropdownWidget<T> dropdownWidget;
    protected boolean dropdownVisible = false;
    protected List<U> matchingValues = null;

    public abstract String getString(U var1);

    public AbstractDropdownControllerElement(AbstractDropdownController<T> abstractDropdownController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(abstractDropdownController, yACLScreen, dimension, false);
        this.dropdownController = abstractDropdownController;
        this.dropdownController.option.addListener((option, object) -> {
            this.matchingValues = this.computeMatchingValues();
        });
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.matchingValues == null) {
            this.matchingValues = this.computeMatchingValues();
        }
        super.method_25394(class010542, n, n2, f);
    }

    @Override
    public void method_25365(boolean bl) {
        if (bl) {
            this.doSelectAll();
            super.method_25365(true);
        } else {
            this.unfocus();
        }
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        if (this.dropdownWidget != null) {
            this.dropdownWidget.setDimension((Dimension<Integer>)this.dropdownWidget.getDimension().withY((Number)((Integer)this.getDimension().y())));
            if ((Integer)this.getDimension().y() < this.screen.tabArea.y() || (Integer)this.getDimension().yLimit() > this.screen.tabArea.L()) {
                this.removeDropdownWidget();
            }
        }
    }

    public abstract List<U> computeMatchingValues();

    public void createDropdownWidget() {
        this.dropdownVisible = true;
        this.dropdownWidget = new DropdownWidget<T>(this.dropdownController, this.screen, this.getDimension(), this);
        this.screen.addPopupControllerWidget(this.dropdownWidget);
    }

    protected void renderDropdownEntry(class01054 class010542, Dimension<Integer> dimension, U u) {
        String string = this.getString(u);
        Object object = string.isBlank() ? class00392.L((String)"yacl.control.text.blank").N(class06541.field_1080) : this.shortenString(string);
        class010542.N(this.textRenderer, object, (Integer)dimension.xLimit() - this.textRenderer.N((class05936)object) - this.getDropdownEntryPadding(), this.getTextY(dimension), -1, true);
    }

    void renderDropdownEntry(class01054 class010542, Dimension<Integer> dimension, int n) {
        this.renderDropdownEntry(class010542, dimension, this.matchingValues.get(n));
    }

    public void removeDropdownWidget() {
        this.ensureValidValue();
        this.screen.clearPopupControllerWidget();
        this.dropdownVisible = false;
        this.dropdownWidget = null;
    }

    protected int getDropdownEntryPadding() {
        return 0;
    }

    protected int getDecorationPadding() {
        return super.getXPadding();
    }

    @Override
    public void unfocus() {
        if (this.dropdownVisible) {
            this.removeDropdownWidget();
        }
        super.unfocus();
    }

    protected int getTextY(Dimension<Integer> dimension) {
        float f = (float)((Integer)dimension.y()).intValue() + (float)((Integer)dimension.height()).intValue() / 2.0f;
        Objects.requireNonNull(this.textRenderer);
        return (int)(f - 9.0f / 2.0f);
    }

    @Override
    public boolean onCharTyped(char c, String string, int n) {
        if (!this.inputFieldFocused) {
            return false;
        }
        if (!this.dropdownVisible) {
            this.createDropdownWidget();
        }
        return super.onCharTyped(c, string, n);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (super.onMouseClicked(d, d2, n)) {
            if (!this.dropdownVisible) {
                this.createDropdownWidget();
                this.doSelectAll();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean onKeyPressed(int n, int n2, int n3) {
        block12: {
            block13: {
                block11: {
                    if (!this.inputFieldFocused) {
                        return false;
                    }
                    if (!this.dropdownVisible) break block11;
                    switch (n) {
                        case 264: {
                            this.dropdownWidget.selectNextEntry();
                            return true;
                        }
                        case 265: {
                            this.dropdownWidget.selectPreviousEntry();
                            return true;
                        }
                        case 258: {
                            if (KeyUtils.hasShiftDown(n3)) {
                                this.dropdownWidget.selectPreviousEntry();
                            } else {
                                this.dropdownWidget.selectNextEntry();
                            }
                            return true;
                        }
                    }
                    break block12;
                }
                if (n == 257) break block13;
                if (n != 335) break block12;
            }
            this.createDropdownWidget();
            return true;
        }
        return super.onKeyPressed(n, n2, n3);
    }

    public class00392 shortenString(String string) {
        return class00392.y((String)GuiUtils.shortenString(string, this.textRenderer, (Integer)this.getDimension().width() - 20, "..."));
    }

    @Override
    public int getValueColor() {
        if (this.inputFieldFocused && !this.dropdownController.isValueValid(this.inputField)) {
            return -1023872;
        }
        return super.getValueColor();
    }

    @Override
    public boolean modifyInput(Consumer<StringBuilder> consumer) {
        boolean bl = super.modifyInput(consumer);
        if (bl) {
            this.matchingValues = this.computeMatchingValues();
        }
        return bl;
    }

    public boolean matchingValue(String string) {
        return string.toLowerCase().contains(this.inputField.toLowerCase());
    }

    public boolean isDropdownVisible() {
        return this.dropdownVisible;
    }

    public DropdownWidget<T> dropdownWidget() {
        return this.dropdownWidget;
    }

    public void ensureValidValue() {
        if (!this.dropdownController.isValueValid(this.inputField)) {
            if (this.dropdownWidget == null) {
                this.inputField = this.dropdownController.getValidValue(this.inputField);
            } else {
                this.inputField = this.dropdownController.getValidValue(this.inputField, this.dropdownWidget.selectedIndex());
                this.dropdownWidget.resetSelectedIndex();
            }
            this.caretPos = this.getDefaultCaretPos();
            this.matchingValues = this.computeMatchingValues();
        }
    }
}

