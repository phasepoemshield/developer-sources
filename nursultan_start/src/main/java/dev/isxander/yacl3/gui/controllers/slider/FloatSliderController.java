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

public class FloatSliderController
implements ISliderController<Float> {
    public static final Function<Float, class00392> DEFAULT_FORMATTER = f -> class00392.y((String)String.format("%,.1f", f).replaceAll("[\u00a0\u202f]", " "));
    private final Option<Float> option;
    private final float min;
    private final float max;
    private final float interval;
    private final ValueFormatter<Float> valueFormatter;

    public FloatSliderController(Option<Float> option, float f, float f2, float f3) {
        this(option, f, f2, f3, DEFAULT_FORMATTER);
    }

    public FloatSliderController(Option<Float> option, float f, float f2, float f3, Function<Float, class00392> function) {
        Validate.isTrue((f2 > f ? 1 : 0) != 0, (String)"`max` cannot be smaller than `min`", (Object[])new Object[0]);
        Validate.isTrue((f3 > 0.0f ? 1 : 0) != 0, (String)"`interval` must be more than 0", (Object[])new Object[0]);
        Validate.notNull(function, (String)"`valueFormatter` must not be null", (Object[])new Object[0]);
        this.option = option;
        this.min = f;
        this.max = f2;
        this.interval = f3;
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

    public Option<Float> option() {
        return this.option;
    }

    @Override
    public double interval() {
        return this.interval;
    }

    @Override
    public double pendingValue() {
        return ((Float)this.option().pendingValue()).floatValue();
    }

    public class00392 formatValue() {
        return this.valueFormatter.format((Object)((Float)this.option().pendingValue()));
    }

    public static FloatSliderController createInternal(Option<Float> option, float f, float f2, float f3, ValueFormatter<Float> valueFormatter) {
        return new FloatSliderController(option, f, f2, f3, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public void setPendingValue(double d) {
        this.option().requestSet((Object)Float.valueOf((float)d));
    }
}

