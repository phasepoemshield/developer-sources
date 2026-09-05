/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.DoubleSliderController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.DoubleSliderController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class DoubleSliderControllerBuilderImpl
extends AbstractControllerBuilderImpl<Double>
implements DoubleSliderControllerBuilder {
    private double min;
    private double max;
    private double step;
    private ValueFormatter<Double> formatter = DoubleSliderController.DEFAULT_FORMATTER::apply;

    public DoubleSliderControllerBuilderImpl(Option<Double> option) {
        super(option);
    }

    public DoubleSliderControllerBuilder step(Double d) {
        this.step = d;
        return this;
    }

    public DoubleSliderControllerBuilder range(Double d, Double d2) {
        this.min = d;
        this.max = d2;
        return this;
    }

    public Controller<Double> build() {
        return DoubleSliderController.createInternal((Option)this.option, (double)this.min, (double)this.max, (double)this.step, this.formatter);
    }

    public DoubleSliderControllerBuilder formatValue(ValueFormatter<Double> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

