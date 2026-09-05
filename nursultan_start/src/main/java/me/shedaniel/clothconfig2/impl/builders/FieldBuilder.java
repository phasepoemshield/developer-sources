/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.Requirement
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.Requirement;
import minecraft.class00392;

public abstract class FieldBuilder<T, A extends AbstractConfigListEntry, SELF extends FieldBuilder<T, A, SELF>> {
    private final class00392 fieldNameKey;
    private final class00392 resetButtonKey;
    protected boolean requireRestart = false;
    protected Supplier<T> defaultValue = null;
    protected Function<T, Optional<class00392>> errorSupplier;
    protected Requirement enableRequirement = null;
    protected Requirement displayRequirement = null;

    protected FieldBuilder(class00392 class003922, class00392 class003923) {
        this.resetButtonKey = Objects.requireNonNull(class003922);
        this.fieldNameKey = Objects.requireNonNull(class003923);
    }

    public final Supplier<T> getDefaultValue() {
        return this.defaultValue;
    }

    public abstract A build();

    @Deprecated
    public final AbstractConfigListEntry buildEntry() {
        return this.build();
    }

    public final class00392 getResetButtonKey() {
        return this.resetButtonKey;
    }

    public final SELF setRequirement(Requirement requirement) {
        FieldBuilder fieldBuilder = this;
        this.enableRequirement = requirement;
        return (SELF)fieldBuilder;
    }

    public void requireRestart(boolean bl) {
        this.requireRestart = bl;
    }

    protected A finishBuilding(A a) {
        if (a == null) {
            return null;
        }
        if (this.enableRequirement != null) {
            a.setRequirement(this.enableRequirement);
        }
        if (this.displayRequirement != null) {
            a.setDisplayRequirement(this.displayRequirement);
        }
        return a;
    }

    public boolean isRequireRestart() {
        return this.requireRestart;
    }

    public final class00392 getFieldNameKey() {
        return this.fieldNameKey;
    }

    public final SELF setDisplayRequirement(Requirement requirement) {
        FieldBuilder fieldBuilder = this;
        this.displayRequirement = requirement;
        return (SELF)fieldBuilder;
    }
}

