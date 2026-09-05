/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.EnumDropdownControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormattableController;
import dev.isxander.yacl3.impl.controller.EnumDropdownControllerBuilderImpl;

public interface EnumDropdownControllerBuilder<E extends Enum<E>>
extends ValueFormattableController<E, EnumDropdownControllerBuilder<E>> {
    public static <E extends Enum<E>> EnumDropdownControllerBuilder<E> create(Option<E> option) {
        return new EnumDropdownControllerBuilderImpl(option);
    }
}

