/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.api.utils.MutableDimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.api.utils.MutableDimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ControllerPopupWidget;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownController;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownControllerElement;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;

public class DropdownWidget<T>
extends ControllerPopupWidget<AbstractDropdownController<T>> {
    public static final int MAX_SHOWN_NUMBER_OF_ITEMS = 7;
    public static final int DROPDOWN_PADDING = 2;
    private final AbstractDropdownControllerElement<T, ?> dropdownElement;
    protected Dimension<Integer> dropdownDim;
    protected int firstVisibleIndex = 0;
    protected int selectedIndex = 0;

    public DropdownWidget(AbstractDropdownController<T> abstractDropdownController, YACLScreen yACLScreen, Dimension<Integer> dimension, AbstractDropdownControllerElement<T, ?> abstractDropdownControllerElement) {
        super(abstractDropdownController, yACLScreen, dimension, abstractDropdownControllerElement);
        this.dropdownElement = abstractDropdownControllerElement;
        this.setDimension(dimension);
    }

    @Override
    public void close() {
        this.dropdownElement.removeDropdownWidget();
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.dropdownLength() == 0) {
            return;
        }
        GuiUtils.pushPose(class010542);
        GuiUtils.translateZ(class010542, 200.0f);
        GuiUtils.blitGuiTexColor(class010542, class05096.field_49511, (Integer)this.dropdownDim.x(), (Integer)this.dropdownDim.y(), 0.0f, 0.0f, (Integer)this.dropdownDim.width(), (Integer)this.dropdownDim.height(), 32, 32, -12632257);
        class010542.y(((Integer)this.dropdownDim.x()).intValue(), ((Integer)this.dropdownDim.y()).intValue(), ((Integer)this.dropdownDim.width()).intValue(), ((Integer)this.dropdownDim.height()).intValue(), -1);
        int n3 = (Integer)this.dropdownDim.y() + 2 + this.entryHeight() * this.selectedVisibleIndex();
        class010542.N(((Integer)this.dropdownDim.x()).intValue(), n3, ((Integer)this.dropdownDim.xLimit()).intValue(), n3 + this.entryHeight(), 0x7F000000);
        class010542.y(((Integer)this.dropdownDim.x()).intValue(), n3, ((Integer)this.dropdownDim.width()).intValue(), this.entryHeight(), -1);
        MutableDimension mutableDimension = Dimension.ofInt((int)((Integer)this.dropdownDim.x() - this.dropdownElement.getDecorationPadding()), (int)((Integer)this.dropdownDim.y() + 2), (int)((Integer)this.dropdownDim.width()), (int)this.entryHeight());
        for (int i = this.firstVisibleIndex; i < this.lastVisibleIndex(); ++i) {
            this.dropdownElement.renderDropdownEntry(class010542, (Dimension<Integer>)mutableDimension, i);
            mutableDimension.move((Number)0, (Number)this.entryHeight());
        }
        GuiUtils.popPose(class010542);
    }

    @Override
    public boolean method_25405(double d, double d2) {
        return this.dropdownDim.isPointInside((Number)((int)d), (Number)((int)d2));
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.method_25405(d, d2)) {
            if (d4 < 0.0) {
                this.scrollDown();
            } else {
                this.scrollUp();
            }
            return true;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public void method_16014(double d, double d2) {
        if (this.method_25405(d, d2)) {
            int n = (int)((d2 - (double)((Integer)this.dropdownDim.y()).intValue()) / (double)this.entryHeight());
            this.selectVisibleItem(n);
        }
    }

    @Override
    public void setDimension(Dimension<Integer> dimension) {
        super.setDimension(dimension);
        int n = (Integer)dimension.height() * this.numberOfVisibleItems();
        int n2 = (Integer)dimension.y() - n - 2;
        if (n2 < this.screen.tabArea.y()) {
            n2 = (Integer)dimension.yLimit() + 2;
        }
        this.dropdownDim = Dimension.ofInt((int)((Integer)dimension.x()), (int)n2, (int)((Integer)dimension.width()), (int)n);
    }

    public void selectPreviousEntry() {
        this.selectedIndex = this.selectedIndex == 0 ? this.dropdownLength() - 1 : --this.selectedIndex;
        if (this.selectedIndex - this.firstVisibleIndex <= 3) {
            this.centerOnSelectedItem();
        }
    }

    public int numberOfVisibleItems() {
        return Math.min(7, this.dropdownLength());
    }

    public int selectedVisibleIndex() {
        return this.selectedIndex - this.firstVisibleIndex;
    }

    private void centerOnSelectedItem() {
        int n = Math.max(0, this.selectedIndex - 3);
        int n2 = n + 7;
        if (n2 >= this.dropdownLength()) {
            n2 = this.dropdownLength();
            n = Math.max(0, n2 - 7);
        }
        this.firstVisibleIndex = n;
    }

    public void scrollDown() {
        if (this.firstVisibleIndex + 1 + 7 <= this.dropdownLength()) {
            ++this.firstVisibleIndex;
        }
        if (this.selectedIndex < this.firstVisibleIndex) {
            this.selectedIndex = this.firstVisibleIndex;
        }
    }

    public void scrollUp() {
        if (this.firstVisibleIndex > 0) {
            --this.firstVisibleIndex;
        }
        if (this.selectedIndex > this.firstVisibleIndex + 7 - 1) {
            this.selectedIndex = this.firstVisibleIndex + 7 - 1;
        }
    }

    @Override
    public class00392 popupTitle() {
        return class00392.L((String)"yacl.control.dropdown.dropdown_widget_title");
    }

    @Override
    public boolean onCharTyped(char c, String string, int n) {
        return this.dropdownElement.onCharTyped(c, string, n);
    }

    @Override
    public boolean onMouseClicked(double d, double d2, int n) {
        if (this.method_25405(d, d2)) {
            this.dropdownElement.unfocus();
            return true;
        }
        if (this.dropdownElement.method_25405(d, d2)) {
            return this.dropdownElement.onMouseClicked(d, d2, n);
        }
        this.close();
        return false;
    }

    public int selectedIndex() {
        return this.selectedIndex;
    }

    public void resetSelectedIndex() {
        this.selectedIndex = 0;
    }

    public void selectNextEntry() {
        this.selectedIndex = this.selectedIndex == this.dropdownLength() - 1 ? 0 : ++this.selectedIndex;
        if (this.selectedIndex - this.firstVisibleIndex >= 3) {
            this.centerOnSelectedItem();
        }
    }

    public int entryHeight() {
        return (Integer)this.dropdownElement.getDimension().height();
    }

    public void selectVisibleItem(int n) {
        this.selectedIndex = Math.min(this.firstVisibleIndex + n, this.dropdownLength() - 1);
    }

    public int lastVisibleIndex() {
        return Math.min(this.firstVisibleIndex + 7, this.dropdownLength());
    }

    public int dropdownLength() {
        return this.dropdownElement.matchingValues.size();
    }
}

