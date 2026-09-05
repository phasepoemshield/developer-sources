/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultDropdownMenuElement;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionElement;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class08844;

public class DropdownBoxEntry<T>
extends TooltipListEntry<T> {
    protected class05362 resetButton;
    protected DropdownBoxEntry$SelectionElement<T> selectionElement;
    private final Supplier<T> defaultValue;
    private boolean suggestionMode = true;

    @Deprecated
    public DropdownBoxEntry(class00392 class003922, class00392 class003923, Supplier<Optional<class00392[]>> supplier, boolean bl, Supplier<T> supplier2, Consumer<T> consumer, Iterable<T> iterable, DropdownBoxEntry$SelectionTopCellElement<T> dropdownBoxEntry$SelectionTopCellElement, DropdownBoxEntry$SelectionCellCreator<T> dropdownBoxEntry$SelectionCellCreator) {
        super(class003922, supplier, bl);
        this.defaultValue = supplier2;
        this.saveCallback = consumer;
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> this.selectionElement.topRenderer.setValue(supplier2.get())).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.selectionElement = new DropdownBoxEntry$SelectionElement(this, new Rectangle(0, 0, 150, 20), new DropdownBoxEntry$DefaultDropdownMenuElement(iterable == null ? ImmutableList.of() : ImmutableList.copyOf(iterable)), dropdownBoxEntry$SelectionTopCellElement, dropdownBoxEntry$SelectionCellCreator);
    }

    public T getValue() {
        return this.selectionElement.getValue();
    }

    public Optional<T> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue.get());
    }

    public List<? extends class04654> method_25396() {
        return Lists.newArrayList((Object[])new class04654[]{this.selectionElement, this.resetButton});
    }

    public boolean method_25405(double d, double d2) {
        return super.method_25405(d, d2) || this.selectionElement.method_25405(d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        return this.selectionElement.method_25401(d, d2, d3, d4);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && (!this.defaultValue.get().equals(this.getValue()) || this.getConfigError().isPresent());
        this.resetButton.method_46419(n2);
        this.selectionElement.active = this.isEditable();
        this.selectionElement.bounds.y = n2;
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3);
            this.selectionElement.bounds.x = n3 + this.resetButton.method_25368() + 1;
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.selectionElement.bounds.x = n3 + n4 - 150 + 1;
        }
        this.selectionElement.bounds.width = 150 - this.resetButton.method_25368() - 4;
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.selectionElement.method_25394(class010542, n6, n7, f);
    }

    public Optional<class00392> getError() {
        return this.selectionElement.topRenderer.getError();
    }

    public void lateRender(class01054 class010542, int n, int n2, float f) {
        this.selectionElement.lateRender(class010542, n, n2, f);
    }

    public boolean isEdited() {
        return this.selectionElement.topRenderer.isEdited();
    }

    public void setSuggestionMode(boolean bl) {
        this.suggestionMode = bl;
    }

    public void updateSelected(boolean bl) {
        this.selectionElement.topRenderer.isSelected = bl;
        this.selectionElement.menu.isSelected = bl;
    }

    public List<? extends class03434> narratables() {
        return Collections.singletonList(this.resetButton);
    }

    public ImmutableList<T> getSelections() {
        return this.selectionElement.menu.getSelections();
    }

    public boolean isSuggestionMode() {
        return this.suggestionMode;
    }

    public int getMorePossibleHeight() {
        return this.selectionElement.getMorePossibleHeight();
    }

    @Deprecated
    public DropdownBoxEntry$SelectionElement<T> getSelectionElement() {
        return this.selectionElement;
    }
}

