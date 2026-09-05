/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.controller.ValueFormattableController;

public interface SliderControllerBuilder<T extends Number, B extends SliderControllerBuilder<T, B>>
extends ValueFormattableController<T, B> {
    public B step(T var1);

    public B range(T var1, T var2);
}

