/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.IntegerSliderController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.IntegerSliderController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class IntegerSliderControllerBuilderImpl
extends AbstractControllerBuilderImpl<Integer>
implements IntegerSliderControllerBuilder {
    private int min;
    private int max;
    private int step;
    private ValueFormatter<Integer> formatter = IntegerSliderController.DEFAULT_FORMATTER::apply;

    public IntegerSliderControllerBuilderImpl(Option<Integer> option) {
        super(option);
    }

    public IntegerSliderControllerBuilder step(Integer n) {
        this.step = n;
        return this;
    }

    public IntegerSliderControllerBuilder range(Integer n, Integer n2) {
        this.min = n;
        this.max = n2;
        return this;
    }

    public Controller<Integer> build() {
        return IntegerSliderController.createInternal((Option)this.option, (int)this.min, (int)this.max, (int)this.step, this.formatter);
    }

    public IntegerSliderControllerBuilder formatValue(ValueFormatter<Integer> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

