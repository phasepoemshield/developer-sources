/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.EnumDropdownControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.cycling.EnumController
 *  dev.isxander.yacl3.gui.controllers.dropdown.EnumDropdownController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.EnumDropdownControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.cycling.EnumController;
import dev.isxander.yacl3.gui.controllers.dropdown.EnumDropdownController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class EnumDropdownControllerBuilderImpl<E extends Enum<E>>
extends AbstractControllerBuilderImpl<E>
implements EnumDropdownControllerBuilder<E> {
    private ValueFormatter<E> formatter = EnumController.getDefaultFormatter()::apply;

    public EnumDropdownControllerBuilderImpl(Option<E> option) {
        super(option);
    }

    public Controller<E> build() {
        return new EnumDropdownController(this.option, this.formatter);
    }

    public EnumDropdownControllerBuilder<E> formatValue(ValueFormatter<E> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

