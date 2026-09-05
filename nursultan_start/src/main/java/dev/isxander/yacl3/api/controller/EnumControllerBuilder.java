/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.EnumControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormattableController;
import dev.isxander.yacl3.impl.controller.EnumControllerBuilderImpl;

public interface EnumControllerBuilder<T extends Enum<T>>
extends ValueFormattableController<T, EnumControllerBuilder<T>> {
    public static <T extends Enum<T>> EnumControllerBuilder<T> create(Option<T> option) {
        return new EnumControllerBuilderImpl(option);
    }

    public EnumControllerBuilder<T> enumClass(Class<T> var1);
}

