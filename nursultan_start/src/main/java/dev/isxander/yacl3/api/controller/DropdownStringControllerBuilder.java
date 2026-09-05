/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.controller.DropdownStringControllerBuilderImpl
 */
package dev.isxander.yacl3.api.controller;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.StringControllerBuilder;
import dev.isxander.yacl3.impl.controller.DropdownStringControllerBuilderImpl;
import java.util.List;

public interface DropdownStringControllerBuilder
extends StringControllerBuilder {
    public static DropdownStringControllerBuilder create(Option<String> option) {
        return new DropdownStringControllerBuilderImpl(option);
    }

    public DropdownStringControllerBuilder values(List<String> var1);

    public DropdownStringControllerBuilder values(String ... var1);

    public DropdownStringControllerBuilder allowAnyValue(boolean var1);

    public DropdownStringControllerBuilder allowEmptyValue(boolean var1);
}

