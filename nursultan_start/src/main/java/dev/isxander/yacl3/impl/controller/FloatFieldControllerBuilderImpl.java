/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.FloatFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.FloatSliderController
 *  dev.isxander.yacl3.gui.controllers.string.number.FloatFieldController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.FloatFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.FloatSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.FloatFieldController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class FloatFieldControllerBuilderImpl
extends AbstractControllerBuilderImpl<Float>
implements FloatFieldControllerBuilder {
    private float min = -3.4028235E38f;
    private float max = Float.MAX_VALUE;
    private ValueFormatter<Float> formatter = FloatSliderController.DEFAULT_FORMATTER::apply;

    public FloatFieldControllerBuilderImpl(Option<Float> option) {
        super(option);
    }

    public FloatFieldControllerBuilder min(Float f) {
        this.min = f.floatValue();
        return this;
    }

    public FloatFieldControllerBuilder max(Float f) {
        this.max = f.floatValue();
        return this;
    }

    public FloatFieldControllerBuilder range(Float f, Float f2) {
        this.min = f.floatValue();
        this.max = f2.floatValue();
        return this;
    }

    public Controller<Float> build() {
        return FloatFieldController.createInternal((Option)this.option, (float)this.min, (float)this.max, this.formatter);
    }

    public FloatFieldControllerBuilder formatValue(ValueFormatter<Float> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

