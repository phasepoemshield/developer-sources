/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.BooleanControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormattableController;
import dev.isxander.yacl3.impl.controller.BooleanControllerBuilderImpl;

public interface BooleanControllerBuilder
extends ValueFormattableController<Boolean, BooleanControllerBuilder> {
    public static BooleanControllerBuilder create(Option<Boolean> option) {
        return new BooleanControllerBuilderImpl(option);
    }

    public BooleanControllerBuilder coloured(boolean var1);

    public BooleanControllerBuilder yesNoFormatter();

    public BooleanControllerBuilder onOffFormatter();

    public BooleanControllerBuilder trueFalseFormatter();
}

