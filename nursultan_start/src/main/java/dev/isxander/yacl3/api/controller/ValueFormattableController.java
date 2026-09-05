/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import java.util.function.Function;
import minecraft.class00392;

public interface ValueFormattableController<T, B extends ValueFormattableController<T, B>>
extends ControllerBuilder<T> {
    public B formatValue(ValueFormatter<T> var1);

    @Deprecated
    default public B valueFormatter(Function<T, class00392> function) {
        return this.formatValue(function::apply);
    }
}

