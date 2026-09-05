/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.EnumControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.cycling.EnumController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.EnumControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.cycling.EnumController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;
import java.util.function.Function;

public class EnumControllerBuilderImpl<T extends Enum<T>>
extends AbstractControllerBuilderImpl<T>
implements EnumControllerBuilder<T> {
    private Class<T> enumClass;
    private ValueFormatter<T> formatter = null;

    public EnumControllerBuilderImpl(Option<T> option) {
        super(option);
    }

    public EnumControllerBuilder<T> enumClass(Class<T> clazz) {
        this.enumClass = clazz;
        return this;
    }

    public Controller<T> build() {
        ValueFormatter valueFormatter = this.formatter;
        if (valueFormatter == null) {
            Function function = EnumController.getDefaultFormatter();
            valueFormatter = function::apply;
        }
        return EnumController.createInternal((Option)this.option, (ValueFormatter)valueFormatter, (Enum[])((Enum[])this.enumClass.getEnumConstants()));
    }

    public EnumControllerBuilder<T> formatValue(ValueFormatter<T> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

