/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.LongFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.gui.controllers.slider.LongSliderController
 *  dev.isxander.yacl3.gui.controllers.string.number.LongFieldController
 */
package dev.isxander.yacl3.impl.controller;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.LongFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.LongSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.LongFieldController;
import dev.isxander.yacl3.impl.controller.AbstractControllerBuilderImpl;

public class LongFieldControllerBuilderImpl
extends AbstractControllerBuilderImpl<Long>
implements LongFieldControllerBuilder {
    private long min = Long.MIN_VALUE;
    private long max = Long.MAX_VALUE;
    private ValueFormatter<Long> formatter = LongSliderController.DEFAULT_FORMATTER::apply;

    public LongFieldControllerBuilderImpl(Option<Long> option) {
        super(option);
    }

    public LongFieldControllerBuilder min(Long l) {
        this.min = l;
        return this;
    }

    public LongFieldControllerBuilder max(Long l) {
        this.max = l;
        return this;
    }

    public LongFieldControllerBuilder range(Long l, Long l2) {
        this.min = l;
        this.max = l2;
        return this;
    }

    public Controller<Long> build() {
        return LongFieldController.createInternal((Option)this.option, (long)this.min, (long)this.max, this.formatter);
    }

    public LongFieldControllerBuilder formatValue(ValueFormatter<Long> valueFormatter) {
        this.formatter = valueFormatter;
        return this;
    }
}

