/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.FloatSliderController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.FloatSliderController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class FloatSliderControllerBuilderImpl
extends AbstractControllerBuilderImpl<Float>
implements FloatSliderControllerBuilder {
    private float min;
    private float max;
    private float step;
    private ValueFormatter<Float> formatter = FloatSliderController.DEFAULT_FORMATTER::apply;

    public FloatSliderControllerBuilderImpl(Option<Float> option) {
        super(option);
    }

    public FloatSliderControllerBuilder step(Float f) {
        this.step = f.floatValue();
        return this;
    }

    public FloatSliderControllerBuilder range(Float f, Float f2) {
        this.min = f.floatValue();
        this.max = f2.floatValue();
        return this;
    }

    public Controller<Float> build() {
        return FloatSliderController.createInternal((Option)this.option, (float)this.min, (float)this.max, (float)this.step, this.formatter);
    }

    public FloatSliderControllerBuilder formatValue(ValueFormatter<Float> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

