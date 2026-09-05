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

public class LongSliderController
implements ISliderController<Long> {
    public static final Function<Long, class00392> DEFAULT_FORMATTER = l -> class00392.y((String)String.format("%,d", l).replaceAll("[\u00a0\u202f]", " "));
    private final Option<Long> option;
    private final long min;
    private final long max;
    private final long interval;
    private final ValueFormatter<Long> valueFormatter;

    public LongSliderController(Option<Long> option, long l, long l2, long l3) {
        this(option, l, l2, l3, DEFAULT_FORMATTER);
    }

    public LongSliderController(Option<Long> option, long l, long l2, long l3, Function<Long, class00392> function) {
        Validate.isTrue((l2 > l ? 1 : 0) != 0, (String)"`max` cannot be smaller than `min`", (Object[])new Object[0]);
        Validate.isTrue((l3 > 0L ? 1 : 0) != 0, (String)"`interval` must be more than 0", (Object[])new Object[0]);
        Validate.notNull(function, (String)"`valueFormatter` must not be null", (Object[])new Object[0]);
        this.option = option;
        this.min = l;
        this.max = l2;
        this.interval = l3;
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

    public Option<Long> option() {
        return this.option;
    }

    @Override
    public double interval() {
        return this.interval;
    }

    @Override
    public double pendingValue() {
        return ((Long)this.option().pendingValue()).longValue();
    }

    public class00392 formatValue() {
        return this.valueFormatter.format((Object)((Long)this.option().pendingValue()));
    }

    public static LongSliderController createInternal(Option<Long> option, long l, long l2, long l3, ValueFormatter<Long> valueFormatter) {
        return new LongSliderController(option, l, l2, l3, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)((long)d));
    }
}

