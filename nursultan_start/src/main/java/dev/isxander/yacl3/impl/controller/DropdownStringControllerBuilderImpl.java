/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.DropdownStringControllerBuilder
 *  dev.isxander.yacl3.gui.controllers.dropdown.DropdownStringController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.DropdownStringControllerBuilder;
import dev.isxander.yacl3.gui.controllers.dropdown.DropdownStringController;
import dev.isxander.yacl3.impl.controller.StringControllerBuilderImpl;
import java.util.Arrays;
import java.util.List;

public class DropdownStringControllerBuilderImpl
extends StringControllerBuilderImpl
implements DropdownStringControllerBuilder {
    private List<String> values;
    private boolean allowEmptyValue = false;
    private boolean allowAnyValue = false;

    public DropdownStringControllerBuilderImpl(Option<String> option) {
        super(option);
    }

    public DropdownStringControllerBuilderImpl values(String ... stringArray) {
        this.values = Arrays.asList(stringArray);
        return this;
    }

    public DropdownStringControllerBuilder values(List<String> list) {
        this.values = list;
        return this;
    }

    @Override
    public Controller<String> build() {
        return new DropdownStringController(this.option, this.values, this.allowEmptyValue, this.allowAnyValue);
    }

    public DropdownStringControllerBuilderImpl allowAnyValue(boolean bl) {
        this.allowAnyValue = bl;
        return this;
    }

    public DropdownStringControllerBuilderImpl allowEmptyValue(boolean bl) {
        this.allowEmptyValue = bl;
        return this;
    }
}

