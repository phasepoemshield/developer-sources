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

public class IntegerSliderController
implements ISliderController<Integer> {
    public static final Function<Integer, class00392> DEFAULT_FORMATTER = n -> class00392.y((String)String.format("%,d", n).replaceAll("[\u00a0\u202f]", " "));
    private final Option<Integer> option;
    private final int min;
    private final int max;
    private final int interval;
    private final ValueFormatter<Integer> valueFormatter;

    public IntegerSliderController(Option<Integer> option, int n, int n2, int n3) {
        this(option, n, n2, n3, DEFAULT_FORMATTER);
    }

    public IntegerSliderController(Option<Integer> option, int n, int n2, int n3, Function<Integer, class00392> function) {
        Validate.isTrue((n2 > n ? 1 : 0) != 0, (String)"`max` cannot be smaller than `min`", (Object[])new Object[0]);
        Validate.isTrue((n3 > 0 ? 1 : 0) != 0, (String)"`interval` must be more than 0", (Object[])new Object[0]);
        Validate.notNull(function, (String)"`valueFormatter` must not be null", (Object[])new Object[0]);
        this.option = option;
        this.min = n;
        this.max = n2;
        this.interval = n3;
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

    public Option<Integer> option() {
        return this.option;
    }

    @Override
    public double interval() {
        return this.interval;
    }

    @Override
    public double pendingValue() {
        return ((Integer)this.option().pendingValue()).intValue();
    }

    public class00392 formatValue() {
        return this.valueFormatter.format((Object)((Integer)this.option().pendingValue()));
    }

    public static IntegerSliderController createInternal(Option<Integer> option, int n, int n2, int n3, ValueFormatter<Integer> valueFormatter) {
        return new IntegerSliderController(option, n, n2, n3, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)((int)d));
    }
}

