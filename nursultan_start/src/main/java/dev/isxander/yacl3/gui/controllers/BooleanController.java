/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 *  minecraft.class05220
 */
package dev.isxander.yacl3.gui.controllers;

import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.BooleanController$BooleanControllerElement;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class05220;

public class BooleanController
implements Controller<Boolean> {
    public static final Function<Boolean, class00392> ON_OFF_FORMATTER = bl -> bl != false ? class05220.y : class05220.L;
    public static final Function<Boolean, class00392> TRUE_FALSE_FORMATTER = bl -> bl != false ? class00392.L((String)"yacl.control.boolean.true") : class00392.L((String)"yacl.control.boolean.false");
    public static final Function<Boolean, class00392> YES_NO_FORMATTER = bl -> bl != false ? class05220.R : class05220.M;
    private final Option<Boolean> option;
    private final ValueFormatter<Boolean> valueFormatter;
    private final boolean coloured;

    public BooleanController(Option<Boolean> option) {
        this(option, ON_OFF_FORMATTER, false);
    }

    public BooleanController(Option<Boolean> option, Function<Boolean, class00392> function, boolean bl) {
        this.option = option;
        this.valueFormatter = function::apply;
        this.coloured = bl;
    }

    public BooleanController(Option<Boolean> option, boolean bl) {
        this(option, ON_OFF_FORMATTER, bl);
    }

    public Option<Boolean> option() {
        return this.option;
    }

    public boolean coloured() {
        return this.coloured;
    }

    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new BooleanController$BooleanControllerElement(this, yACLScreen, dimension);
    }

    public class00392 formatValue() {
        return this.valueFormatter.format((Object)((Boolean)this.option().pendingValue()));
    }

    public static BooleanController createInternal(Option<Boolean> option, ValueFormatter<Boolean> valueFormatter, boolean bl) {
        return new BooleanController(option, arg_0 -> valueFormatter.format(arg_0), bl);
    }
}

