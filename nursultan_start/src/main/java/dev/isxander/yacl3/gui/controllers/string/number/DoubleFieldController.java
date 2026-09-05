/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers.string.number;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.DoubleSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.NumberFieldController;
import java.util.function.Function;
import minecraft.class00392;

public class DoubleFieldController
extends NumberFieldController<Double> {
    private final double min;
    private final double max;

    @Override
    public String getString() {
        return NUMBER_FORMAT.format(this.option().pendingValue());
    }

    public DoubleFieldController(Option<Double> option) {
        this(option, -1.7976931348623157E308, Double.MAX_VALUE, DoubleSliderController.DEFAULT_FORMATTER);
    }

    public DoubleFieldController(Option<Double> option, Function<Double, class00392> function) {
        this(option, -1.7976931348623157E308, Double.MAX_VALUE, function);
    }

    public DoubleFieldController(Option<Double> option, double d, double d2) {
        this(option, d, d2, DoubleSliderController.DEFAULT_FORMATTER);
    }

    public DoubleFieldController(Option<Double> option, double d, double d2, Function<Double, class00392> function) {
        super(option, function);
        this.min = d;
        this.max = d2;
    }

    @Override
    public double min() {
        return this.min;
    }

    @Override
    public double max() {
        return this.max;
    }

    @Override
    public double pendingValue() {
        return (Double)this.option().pendingValue();
    }

    public static DoubleFieldController createInternal(Option<Double> option, double d, double d2, ValueFormatter<Double> valueFormatter) {
        return new DoubleFieldController(option, d, d2, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)d);
    }
}

