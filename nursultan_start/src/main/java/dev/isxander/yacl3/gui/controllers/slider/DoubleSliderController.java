/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.gui.controllers.slider;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.slider.ISliderController;
import java.util.function.Function;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public class DoubleSliderController
implements ISliderController<Double> {
    public static final Function<Double, class00392> DEFAULT_FORMATTER = d -> class00392.y((String)String.format("%,.2f", d).replaceAll("[\u00a0\u202f]", " "));
    private final Option<Double> option;
    private final double min;
    private final double max;
    private final double interval;
    private final ValueFormatter<Double> valueFormatter;

    public DoubleSliderController(Option<Double> option, double d, double d2, double d3) {
        this(option, d, d2, d3, DEFAULT_FORMATTER);
    }

    public DoubleSliderController(Option<Double> option, double d, double d2, double d3, Function<Double, class00392> function) {
        Validate.isTrue((d2 > d ? 1 : 0) != 0, (String)"`max` cannot be smaller than `min`", (Object[])new Object[0]);
        Validate.isTrue((d3 > 0.0 ? 1 : 0) != 0, (String)"`interval` must be more than 0", (Object[])new Object[0]);
        Validate.notNull(function, (String)"`valueFormatter` must not be null", (Object[])new Object[0]);
        this.option = option;
        this.min = d;
        this.max = d2;
        this.interval = d3;
        this.valueFormatter = function::apply;
    }

    @Override
    public double min() {
        return this.min;
    }

    @Override
    public double max() {
        return this.max;
    }

    public Option<Double> option() {
        return this.option;
    }

    @Override
    public double interval() {
        return this.interval;
    }

    @Override
    public double pendingValue() {
        return (Double)this.option().pendingValue();
    }

    public class00392 formatValue() {
        return this.valueFormatter.format((Object)((Double)this.option().pendingValue()));
    }

    public static DoubleSliderController createInternal(Option<Double> option, double d, double d2, double d3, ValueFormatter<Double> valueFormatter) {
        return new DoubleSliderController(option, d, d2, d3, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)d);
    }
}

