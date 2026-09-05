/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.DoubleSliderController
 *  dev.isxander.yacl3.gui.controllers.string.number.DoubleFieldController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.DoubleSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.DoubleFieldController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class DoubleFieldControllerBuilderImpl
extends AbstractControllerBuilderImpl<Double>
implements DoubleFieldControllerBuilder {
    private double min = -1.7976931348623157E308;
    private double max = Double.MAX_VALUE;
    private ValueFormatter<Double> formatter = DoubleSliderController.DEFAULT_FORMATTER::apply;

    public DoubleFieldControllerBuilderImpl(Option<Double> option) {
        super(option);
    }

    public DoubleFieldControllerBuilder min(Double d) {
        this.min = d;
        return this;
    }

    public DoubleFieldControllerBuilder max(Double d) {
        this.max = d;
        return this;
    }

    public DoubleFieldControllerBuilder range(Double d, Double d2) {
        this.min = d;
        this.max = d2;
        return this;
    }

    public Controller<Double> build() {
        return DoubleFieldController.createInternal((Option)this.option, (double)this.min, (double)this.max, this.formatter);
    }

    public DoubleFieldControllerBuilder formatValue(ValueFormatter<Double> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

