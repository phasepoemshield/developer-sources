/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01295
 *  minecraft.class03428
 *  minecraft.class04654
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 */
package dev.isxander.yacl3.gui.controllers;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.TooltipButtonWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01295;
import minecraft.class03428;
import minecraft.class04654;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;

public class ListEntryWidget
extends AbstractWidget
implements class01295 {
    private final TooltipButtonWidget removeButton;
    private final TooltipButtonWidget moveUpButton;
    private final TooltipButtonWidget moveDownButton;
    private final AbstractWidget entryWidget;
    private final ListOption<?> listOption;
    private final ListOptionEntry<?> listOptionEntry;
    private final String optionNameString;
    private class04654 focused;
    private boolean dragging;

    public ListEntryWidget(YACLScreen yACLScreen, ListOptionEntry<?> listOptionEntry, AbstractWidget abstractWidget) {
        super((Dimension<Integer>)abstractWidget.getDimension().withHeight((Number)(Math.min((Integer)abstractWidget.getDimension().height(), 20) - (listOptionEntry.parentGroup().indexOf(listOptionEntry) == listOptionEntry.parentGroup().options().size() - 1 ? 0 : 2))));
        this.listOptionEntry = listOptionEntry;
        this.listOption = listOptionEntry.parentGroup();
        this.optionNameString = listOptionEntry.name().getString().toLowerCase();
        this.entryWidget = abstractWidget;
        Dimension<Integer> dimension = abstractWidget.getDimension();
        abstractWidget.setDimension((Dimension<Integer>)dimension.clone().move((Number)40, (Number)0).expand((Number)-60, (Number)0));
        this.removeButton = new TooltipButtonWidget(yACLScreen, (Integer)dimension.xLimit() - 20, (Integer)dimension.y(), 20, 20, (class00392)class00392.y((String)"\u274c"), (class00392)class00392.L((String)"yacl.list.remove"), class053622 -> {
            this.listOption.removeEntry(listOptionEntry);
            this.updateButtonStates();
        });
        this.moveUpButton = new TooltipButtonWidget(yACLScreen, (Integer)dimension.x(), (Integer)dimension.y(), 20, 20, (class00392)class00392.y((String)"\u2191"), (class00392)class00392.L((String)"yacl.list.move_up"), class053622 -> {
            int n = this.listOption.indexOf(listOptionEntry) - 1;
            if (n >= 0) {
                this.listOption.removeEntry(listOptionEntry);
                this.listOption.insertEntry(n, listOptionEntry);
                this.updateButtonStates();
            }
        });
        this.moveDownButton = new TooltipButtonWidget(yACLScreen, (Integer)dimension.x() + 20, (Integer)dimension.y(), 20, 20, (class00392)class00392.y((String)"\u2193"), (class00392)class00392.L((String)"yacl.list.move_down"), class053622 -> {
            int n = this.listOption.indexOf(listOptionEntry) + 1;
            if (n < this.listOption.options().size()) {
                this.listOption.removeEntry(listOptionEntry);
                this.listOption.insertEntry(n, listOptionEntry);
                this.updateButtonStates();
            }
        });
        this.updateButtonStates();
    }

    public List<? extends class04654> method_25396() {
        return ImmutableList.of((Object)((Object)this.moveUpButton), (Object)((Object)this.moveDownButton), (Object)this.entryWidget, (Object)((Object)this.removeButton));
    }

    @Override
    public boolean method_25404(class06601 class066012) {
        return super.method_25404(class066012);
    }

    public class04654 method_25399() {
        return this.focused;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.updateButtonStates();
        this.removeButton.method_46419((Integer)this.getDimension().y());
        this.moveUpButton.method_46419((Integer)this.getDimension().y());
        this.moveDownButton.method_46419((Integer)this.getDimension().y());
        this.entryWidget.setDimension((Dimension<Integer>)this.entryWidget.getDimension().withY((Number)((Integer)this.getDimension().y())));
        this.removeButton.method_25394(class010542, n, n2, f);
        this.moveUpButton.method_25394(class010542, n, n2, f);
        this.moveDownButton.method_25394(class010542, n, n2, f);
        this.entryWidget.method_25394(class010542, n, n2, f);
    }

    @Override
    public void method_37020(class03428 class034282) {
        this.entryWidget.method_37020(class034282);
    }

    @Override
    public boolean method_25403(class06613 class066132, double d, double d2) {
        return super.method_25403(class066132, d, d2);
    }

    @Override
    public boolean method_25400(class06626 class066262) {
        return super.method_25400(class066262);
    }

    public void method_25395(class04654 class046542) {
        this.focused = class046542;
    }

    public void method_25398(boolean bl) {
        this.dragging = bl;
    }

    @Override
    public boolean method_25406(class06613 class066132) {
        return super.method_25406(class066132);
    }

    public boolean method_25397() {
        return this.dragging;
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        return super.method_25402(class066132, bl);
    }

    @Override
    public boolean method_16803(class06601 class066012) {
        return super.method_16803(class066012);
    }

    @Override
    public void unfocus() {
        this.entryWidget.unfocus();
    }

    @Override
    public boolean matchesSearch(String string) {
        return this.optionNameString.contains(string.toLowerCase());
    }

    protected void updateButtonStates() {
        this.removeButton.field_22763 = this.listOption.available() && this.listOption.numberOfEntries() > this.listOption.minimumNumberOfEntries();
        this.moveUpButton.field_22763 = this.listOption.indexOf(this.listOptionEntry) > 0 && this.listOption.available();
        this.moveDownButton.field_22763 = this.listOption.indexOf(this.listOptionEntry) < this.listOption.options().size() - 1 && this.listOption.available();
    }
}

