/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;

public class DropdownMenuBuilder<T>
extends FieldBuilder<T, DropdownBoxEntry<T>, DropdownMenuBuilder<T>> {
    protected DropdownBoxEntry.SelectionTopCellElement<T> topCellElement;
    protected DropdownBoxEntry.SelectionCellCreator<T> cellCreator;
    protected Function<T, Optional<class00392[]>> tooltipSupplier = object -> Optional.empty();
    protected Consumer<T> saveConsumer = null;
    protected Iterable<T> selections = Collections.emptyList();
    protected boolean suggestionMode = true;

    public DropdownMenuBuilder(class00392 class003922, class00392 class003923, DropdownBoxEntry.SelectionTopCellElement<T> selectionTopCellElement, DropdownBoxEntry.SelectionCellCreator<T> selectionCellCreator) {
        super(class003922, class003923);
        this.topCellElement = Objects.requireNonNull(selectionTopCellElement);
        this.cellCreator = Objects.requireNonNull(selectionCellCreator);
    }

    @Override
    public DropdownBoxEntry<T> build() {
        DropdownBoxEntry dropdownBoxEntry = new DropdownBoxEntry(this.getFieldNameKey(), this.getResetButtonKey(), null, this.isRequireRestart(), this.defaultValue, this.saveConsumer, this.selections, this.topCellElement, this.cellCreator);
        dropdownBoxEntry.setTooltipSupplier(() -> this.tooltipSupplier.apply(dropdownBoxEntry.getValue()));
        if (this.errorSupplier != null) {
            dropdownBoxEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(dropdownBoxEntry.getValue()));
        }
        dropdownBoxEntry.setSuggestionMode(this.suggestionMode);
        return this.finishBuilding(dropdownBoxEntry);
    }

    public DropdownMenuBuilder<T> setDefaultValue(T t) {
        this.defaultValue = () -> Objects.requireNonNull(t);
        return this;
    }

    public DropdownMenuBuilder<T> setDefaultValue(Supplier<T> supplier) {
        this.defaultValue = supplier;
        return this;
    }

    public DropdownMenuBuilder<T> setSaveConsumer(Consumer<T> consumer) {
        this.saveConsumer = consumer;
        return this;
    }

    public DropdownMenuBuilder<T> setTooltip(class00392 ... class00392Array) {
        this.tooltipSupplier = object -> Optional.ofNullable(class00392Array);
        return this;
    }

    public DropdownMenuBuilder<T> setTooltip(Optional<class00392[]> optional) {
        this.tooltipSupplier = object -> optional;
        return this;
    }

    public DropdownMenuBuilder<T> setSelections(Iterable<T> iterable) {
        this.selections = iterable;
        return this;
    }

    public DropdownMenuBuilder<T> setTooltipSupplier(Function<T, Optional<class00392[]>> function) {
        this.tooltipSupplier = function;
        return this;
    }

    public DropdownMenuBuilder<T> setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = object -> (Optional)supplier.get();
        return this;
    }

    public DropdownMenuBuilder<T> setErrorSupplier(Function<T, Optional<class00392>> function) {
        this.errorSupplier = function;
        return this;
    }

    public DropdownMenuBuilder<T> setSuggestionMode(boolean bl) {
        this.suggestionMode = bl;
        return this;
    }

    public boolean isSuggestionMode() {
        return this.suggestionMode;
    }

    public DropdownMenuBuilder<T> requireRestart() {
        this.requireRestart(true);
        return this;
    }
}

