/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.api.utils.Dimension
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  minecraft.class00392
 *  minecraft.class04995
 */
package dev.isxander.yacl3.gui.controllers.string.number;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.slider.ISliderController;
import dev.isxander.yacl3.gui.controllers.string.IStringController;
import dev.isxander.yacl3.gui.controllers.string.StringControllerElement;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class04995;

public abstract class NumberFieldController<T extends Number>
implements ISliderController<T>,
IStringController<T> {
    protected static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
    private static final DecimalFormatSymbols DECIMAL_FORMAT_SYMBOLS = DecimalFormatSymbols.getInstance();
    private final Option<T> option;
    private final ValueFormatter<T> displayFormatter;

    public NumberFieldController(Option<T> option, Function<T, class00392> function) {
        this.option = option;
        this.displayFormatter = function::apply;
    }

    public Option<T> option() {
        return this.option;
    }

    @Override
    public double interval() {
        return -1.0;
    }

    @Override
    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new StringControllerElement(this, yACLScreen, dimension, false);
    }

    @Override
    public double pendingValue() {
        return ((Number)this.option().pendingValue()).doubleValue();
    }

    @Override
    public class00392 formatValue() {
        return this.displayFormatter.format((Object)((Number)this.option().pendingValue()));
    }

    @Override
    public boolean isInputValid(String string) {
        string = this.transformInput(string);
        ParsePosition parsePosition = new ParsePosition(0);
        NUMBER_FORMAT.parse(string, parsePosition);
        return parsePosition.getIndex() == string.length();
    }

    @Override
    public void setFromString(String string) {
        try {
            String string2 = this.transformInput(string);
            this.setPendingValue(class04995.N((double)NUMBER_FORMAT.parse(string2).doubleValue(), (double)this.min(), (double)this.max()));
        }
        catch (ParseException parseException) {
            YACLConstants.LOGGER.warn("Failed to parse number: {}", (Object)string);
        }
    }

    protected String transformInput(String string) {
        if (string.isEmpty()) {
            string = "0";
        }
        if (string.equals("-")) {
            string = "-0";
        }
        return string.replace("" + DECIMAL_FORMAT_SYMBOLS.getGroupingSeparator(), "");
    }
}

