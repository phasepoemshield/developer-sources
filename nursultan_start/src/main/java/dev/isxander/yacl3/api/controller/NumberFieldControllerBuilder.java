/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.controller.ValueFormattableController;

public interface NumberFieldControllerBuilder<T extends Number, B extends NumberFieldControllerBuilder<T, B>>
extends ValueFormattableController<T, B> {
    public B min(T var1);

    public B max(T var1);

    public B range(T var1, T var2);
}

