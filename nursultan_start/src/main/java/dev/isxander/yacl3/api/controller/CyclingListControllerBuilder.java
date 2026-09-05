/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.CyclingListControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormattableController;
import dev.isxander.yacl3.impl.controller.CyclingListControllerBuilderImpl;

public interface CyclingListControllerBuilder<T>
extends ValueFormattableController<T, CyclingListControllerBuilder<T>> {
    public static <T> CyclingListControllerBuilder<T> create(Option<T> option) {
        return new CyclingListControllerBuilderImpl(option);
    }

    public CyclingListControllerBuilder<T> values(Iterable<? extends T> var1);

    public CyclingListControllerBuilder<T> values(T ... var1);
}

