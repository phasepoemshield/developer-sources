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
import dev.isxander.yacl3.gui.controllers.slider.LongSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.NumberFieldController;
import java.util.function.Function;
import minecraft.class00392;

public class LongFieldController
extends NumberFieldController<Long> {
    private final long min;
    private final long max;

    @Override
    public String getString() {
        return NUMBER_FORMAT.format(this.option().pendingValue());
    }

    public LongFieldController(Option<Long> option) {
        this(option, -9223372036854775807L, Long.MAX_VALUE, LongSliderController.DEFAULT_FORMATTER);
    }

    public LongFieldController(Option<Long> option, Function<Long, class00392> function) {
        this(option, -9223372036854775807L, Long.MAX_VALUE, function);
    }

    public LongFieldController(Option<Long> option, long l, long l2) {
        this(option, l, l2, LongSliderController.DEFAULT_FORMATTER);
    }

    public LongFieldController(Option<Long> option, long l, long l2, Function<Long, class00392> function) {
        super(option, function);
        this.min = l;
        this.max = l2;
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
        return ((Long)this.option().pendingValue()).longValue();
    }

    public static LongFieldController createInternal(Option<Long> option, long l, long l2, ValueFormatter<Long> valueFormatter) {
        return new LongFieldController(option, l, l2, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)((long)d));
    }
}

