/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.CyclingListControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.cycling.CyclingListController
 */
package dev.isxander.yacl3.impl.controller;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.CyclingListControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.cycling.CyclingListController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public final class CyclingListControllerBuilderImpl<T>
extends AbstractControllerBuilderImpl<T>
implements CyclingListControllerBuilder<T> {
    private Iterable<? extends T> values;
    private ValueFormatter<T> formatter = null;

    public CyclingListControllerBuilderImpl(Option<T> option) {
        super(option);
    }

    @SafeVarargs
    public final CyclingListControllerBuilder<T> values(T ... TArray) {
        this.values = ImmutableList.copyOf((Object[])TArray);
        return this;
    }

    public CyclingListControllerBuilder<T> values(Iterable<? extends T> iterable) {
        this.values = iterable;
        return this;
    }

    public Controller<T> build() {
        return CyclingListController.createInternal((Option)this.option, this.values, this.formatter);
    }

    public CyclingListControllerBuilder<T> formatValue(ValueFormatter<T> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

