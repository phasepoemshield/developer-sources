/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.BooleanControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.BooleanController
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.BooleanController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;
import org.apache.commons.lang3.Validate;

public class BooleanControllerBuilderImpl
extends AbstractControllerBuilderImpl<Boolean>
implements BooleanControllerBuilder {
    private boolean coloured = false;
    private ValueFormatter<Boolean> formatter = BooleanController.ON_OFF_FORMATTER::apply;

    public BooleanControllerBuilderImpl(Option<Boolean> option) {
        super(option);
    }

    public Controller<Boolean> build() {
        return BooleanController.createInternal((Option)this.option, this.formatter, (boolean)this.coloured);
    }

    public BooleanControllerBuilder coloured(boolean bl) {
        this.coloured = bl;
        return this;
    }

    public BooleanControllerBuilder formatValue(ValueFormatter<Boolean> valueFormatter) {
        Validate.notNull(valueFormatter, (String)"formatter cannot be null", (Object[])new Object[0]);
        this.formatter = valueFormatter;
        return this;
    }

    public BooleanControllerBuilder yesNoFormatter() {
        this.formatter = BooleanController.YES_NO_FORMATTER::apply;
        return this;
    }

    public BooleanControllerBuilder onOffFormatter() {
        this.formatter = BooleanController.ON_OFF_FORMATTER::apply;
        return this;
    }

    public BooleanControllerBuilder trueFalseFormatter() {
        this.formatter = BooleanController.TRUE_FALSE_FORMATTER::apply;
        return this;
    }
}

