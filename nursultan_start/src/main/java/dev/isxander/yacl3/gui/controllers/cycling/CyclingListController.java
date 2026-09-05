/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers.cycling;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.cycling.ICyclingController;
import java.util.function.Function;
import minecraft.class00392;

public class CyclingListController<T>
implements ICyclingController<T> {
    private final Option<T> option;
    private final ValueFormatter<T> valueFormatter;
    private final ImmutableList<T> values;

    public CyclingListController(Option<T> option, Iterable<? extends T> iterable) {
        this(option, iterable, object -> class00392.y((String)object.toString()));
    }

    public CyclingListController(Option<T> option, Iterable<? extends T> iterable, Function<T, class00392> function) {
        this.option = option;
        this.valueFormatter = function::apply;
        this.values = ImmutableList.copyOf(iterable);
    }

    public Option<T> option() {
        return this.option;
    }

    public class00392 formatValue() {
        return this.valueFormatter.format(this.option().pendingValue());
    }

    public static <T> CyclingListController<T> createInternal(Option<T> option, Iterable<? extends T> iterable, ValueFormatter<T> valueFormatter) {
        return new CyclingListController<Object>(option, iterable, arg_0 -> valueFormatter.format(arg_0));
    }

    @Override
    public int getCycleLength() {
        return this.values.size();
    }

    @Override
    public void setPendingValue(int n) {
        this.option().requestSet(this.values.get(n));
    }

    @Override
    public int getPendingValue() {
        return this.values.indexOf(this.option().pendingValue());
    }
}

