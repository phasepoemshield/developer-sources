/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionTopCellElement$1;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class06202;

public class DropdownBoxEntry$DefaultSelectionTopCellElement<R>
extends DropdownBoxEntry$SelectionTopCellElement<R> {
    protected class04927 textFieldWidget;
    protected Function<String, R> toObjectFunction;
    protected Function<R, class00392> toTextFunction;
    protected final R original;
    protected R value;

    public DropdownBoxEntry$DefaultSelectionTopCellElement(R r, Function<String, R> function, Function<R, class00392> function2) {
        this.original = Objects.requireNonNull(r);
        this.value = Objects.requireNonNull(r);
        this.toObjectFunction = Objects.requireNonNull(function);
        this.toTextFunction = Objects.requireNonNull(function2);
        this.textFieldWidget = new DropdownBoxEntry$DefaultSelectionTopCellElement$1(this, (class01590)class06202.Nq().i_3, 0, 0, 148, 18, (class00392)class00392.i());
        this.textFieldWidget.method_1858(false);
        this.textFieldWidget.method_1880(999999);
        this.textFieldWidget.method_1852(function2.apply(r).getString());
    }

    @Override
    public R getValue() {
        if (this.hasError()) {
            return this.value;
        }
        return this.toObjectFunction.apply(this.textFieldWidget.method_1882());
    }

    @Override
    public void setValue(R r) {
        this.textFieldWidget.method_1852(this.toTextFunction.apply(r).getString());
        this.textFieldWidget.method_1883(0, false);
    }

    public List<? extends class04654> method_25396() {
        return Collections.singletonList(this.textFieldWidget);
    }

    @Override
    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        this.textFieldWidget.method_46421(n3 + 4);
        this.textFieldWidget.method_46419(n4 + 6);
        this.textFieldWidget.method_25358(n5 - 8);
        this.textFieldWidget.method_1888(this.getParent().isEditable());
        this.textFieldWidget.method_1868(this.getPreferredTextColor());
        this.textFieldWidget.method_25394(class010542, n, n2, f);
    }

    @Override
    public Optional<class00392> getError() {
        if (this.toObjectFunction.apply(this.textFieldWidget.method_1882()) != null) {
            return Optional.empty();
        }
        return Optional.of(class00392.y((String)"Invalid Value!"));
    }

    @Override
    public boolean isEdited() {
        return super.isEdited() || !this.getValue().equals(this.original);
    }

    @Override
    public class00392 getSearchTerm() {
        return class00392.y((String)this.textFieldWidget.method_1882());
    }
}

