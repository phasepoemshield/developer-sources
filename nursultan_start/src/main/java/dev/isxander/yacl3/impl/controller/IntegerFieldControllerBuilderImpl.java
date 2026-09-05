/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.IntegerFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.IntegerSliderController
 *  dev.isxander.yacl3.gui.controllers.string.number.IntegerFieldController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.IntegerFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.IntegerSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.IntegerFieldController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class IntegerFieldControllerBuilderImpl
extends AbstractControllerBuilderImpl<Integer>
implements IntegerFieldControllerBuilder {
    private int min = Integer.MIN_VALUE;
    private int max = Integer.MAX_VALUE;
    private ValueFormatter<Integer> formatter = IntegerSliderController.DEFAULT_FORMATTER::apply;

    public IntegerFieldControllerBuilderImpl(Option<Integer> option) {
        super(option);
    }

    public IntegerFieldControllerBuilder min(Integer n) {
        this.min = n;
        return this;
    }

    public IntegerFieldControllerBuilder max(Integer n) {
        this.max = n;
        return this;
    }

    public IntegerFieldControllerBuilder range(Integer n, Integer n2) {
        this.min = n;
        this.max = n2;
        return this;
    }

    public Controller<Integer> build() {
        return IntegerFieldController.createInternal((Option)this.option, (int)this.min, (int)this.max, this.formatter);
    }

    public IntegerFieldControllerBuilder formatValue(ValueFormatter<Integer> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

