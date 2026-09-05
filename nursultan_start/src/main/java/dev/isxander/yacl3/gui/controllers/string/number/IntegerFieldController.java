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
import dev.isxander.yacl3.gui.controllers.slider.IntegerSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.NumberFieldController;
import java.util.function.Function;
import minecraft.class00392;

public class IntegerFieldController
extends NumberFieldController<Integer> {
    private final int min;
    private final int max;

    @Override
    public String getString() {
        return NUMBER_FORMAT.format(this.option().pendingValue());
    }

    public IntegerFieldController(Option<Integer> option) {
        this(option, -2147483647, Integer.MAX_VALUE, IntegerSliderController.DEFAULT_FORMATTER);
    }

    public IntegerFieldController(Option<Integer> option, Function<Integer, class00392> function) {
        this(option, -2147483647, Integer.MAX_VALUE, function);
    }

    public IntegerFieldController(Option<Integer> option, int n, int n2) {
        this(option, n, n2, IntegerSliderController.DEFAULT_FORMATTER);
    }

    public IntegerFieldController(Option<Integer> option, int n, int n2, Function<Integer, class00392> function) {
        super(option, function);
        this.min = n;
        this.max = n2;
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
        return ((Integer)this.option().pendingValue()).intValue();
    }

    public static IntegerFieldController createInternal(Option<Integer> option, int n, int n2, ValueFormatter<Integer> valueFormatter) {
        return new IntegerFieldController(option, n, n2, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)((int)d));
    }
}

