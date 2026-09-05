/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.LongSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.LongSliderController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.LongSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.LongSliderController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class LongSliderControllerBuilderImpl
extends AbstractControllerBuilderImpl<Long>
implements LongSliderControllerBuilder {
    private long min;
    private long max;
    private long step;
    private ValueFormatter<Long> formatter = LongSliderController.DEFAULT_FORMATTER::apply;

    public LongSliderControllerBuilderImpl(Option<Long> option) {
        super(option);
    }

    public LongSliderControllerBuilder step(Long l) {
        this.step = l;
        return this;
    }

    public LongSliderControllerBuilder range(Long l, Long l2) {
        this.min = l;
        this.max = l2;
        return this;
    }

    public Controller<Long> build() {
        return LongSliderController.createInternal((Option)this.option, (long)this.min, (long)this.max, (long)this.step, this.formatter);
    }

    public LongSliderControllerBuilder formatValue(ValueFormatter<Long> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

