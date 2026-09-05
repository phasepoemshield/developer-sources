/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import minecraft.class00392;

public abstract class AbstractListBuilder<T, A extends AbstractConfigListEntry, SELF extends AbstractListBuilder<T, A, SELF>>
extends AbstractFieldBuilder<List<T>, A, SELF> {
    protected Function<T, Optional<class00392>> cellErrorSupplier;
    private boolean expanded = false;
    private class00392 addTooltip = class00392.L((String)"text.cloth-config.list.add");
    private class00392 removeTooltip = class00392.L((String)"text.cloth-config.list.remove");
    private boolean insertButtonEnabled = true;
    private boolean deleteButtonEnabled = true;
    private boolean insertInFront = false;

    protected AbstractListBuilder(class00392 class003922, class00392 class003923) {
        super(class003922, class003923);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public SELF setExpanded(boolean bl) {
        this.expanded = bl;
        return (SELF)this;
    }

    public class00392 getAddTooltip() {
        return this.addTooltip;
    }

    public class00392 getRemoveTooltip() {
        return this.removeTooltip;
    }

    public SELF setInsertInFront(boolean bl) {
        this.insertInFront = bl;
        return (SELF)this;
    }

    public boolean isInsertInFront() {
        return this.insertInFront;
    }

    public SELF setInsertButtonEnabled(boolean bl) {
        this.insertButtonEnabled = bl;
        return (SELF)this;
    }

    public SELF setCellErrorSupplier(Function<T, Optional<class00392>> function) {
        this.cellErrorSupplier = function;
        return (SELF)this;
    }

    public boolean isDeleteButtonEnabled() {
        return this.deleteButtonEnabled;
    }

    public SELF setDeleteButtonEnabled(boolean bl) {
        this.deleteButtonEnabled = bl;
        return (SELF)this;
    }

    public boolean isInsertButtonEnabled() {
        return this.insertButtonEnabled;
    }

    public Function<T, Optional<class00392>> getCellErrorSupplier() {
        return this.cellErrorSupplier;
    }

    public SELF setRemoveButtonTooltip(class00392 class003922) {
        this.removeTooltip = class003922;
        return (SELF)this;
    }

    public SELF setAddButtonTooltip(class00392 class003922) {
        this.addTooltip = class003922;
        return (SELF)this;
    }
}

