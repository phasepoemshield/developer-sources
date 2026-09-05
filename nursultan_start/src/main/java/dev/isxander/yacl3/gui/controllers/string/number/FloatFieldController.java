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
import dev.isxander.yacl3.gui.controllers.slider.FloatSliderController;
import dev.isxander.yacl3.gui.controllers.string.number.NumberFieldController;
import java.util.function.Function;
import minecraft.class00392;

public class FloatFieldController
extends NumberFieldController<Float> {
    private final float min;
    private final float max;

    @Override
    public String getString() {
        return NUMBER_FORMAT.format(this.option().pendingValue());
    }

    public FloatFieldController(Option<Float> option) {
        this(option, -3.4028235E38f, Float.MAX_VALUE, FloatSliderController.DEFAULT_FORMATTER);
    }

    public FloatFieldController(Option<Float> option, Function<Float, class00392> function) {
        this(option, -3.4028235E38f, Float.MAX_VALUE, function);
    }

    public FloatFieldController(Option<Float> option, float f, float f2) {
        this(option, f, f2, FloatSliderController.DEFAULT_FORMATTER);
    }

    public FloatFieldController(Option<Float> option, float f, float f2, Function<Float, class00392> function) {
        super(option, function);
        this.min = f;
        this.max = f2;
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
        return ((Float)this.option().pendingValue()).floatValue();
    }

    public static FloatFieldController createInternal(Option<Float> option, float f, float f2, ValueFormatter<Float> valueFormatter) {
        return new FloatFieldController(option, f, f2, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)Float.valueOf((float)d));
    }
}

