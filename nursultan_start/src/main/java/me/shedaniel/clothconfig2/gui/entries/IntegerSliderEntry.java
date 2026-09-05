/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.IntegerSliderEntry$Slider;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08844;

public class IntegerSliderEntry
extends TooltipListEntry<Integer> {
    protected IntegerSliderEntry$Slider sliderWidget;
    protected class05362 resetButton;
    protected AtomicInteger value;
    protected final long orginial;
    int minimum;
    int maximum;
    private final Supplier<Integer> defaultValue;
    Function<Integer, class00392> textGetter = n -> class00392.y((String)String.format("Value: %d", n));
    private final List<class06478> widgets;

    @Deprecated
    public IntegerSliderEntry(class00392 class003922, int n2, int n3, int n4, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, supplier2, bl);
        this.orginial = n4;
        this.defaultValue = supplier;
        this.value = new AtomicInteger(n4);
        this.saveCallback = consumer;
        this.maximum = n3;
        this.minimum = n2;
        this.sliderWidget = new IntegerSliderEntry$Slider(this, 0, 0, 152, 20, ((double)this.value.get() - (double)n2) / (double)Math.abs(n3 - n2));
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> this.setValue((Integer)supplier.get())).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.sliderWidget.method_25355(this.textGetter.apply(this.value.get()));
        this.widgets = Lists.newArrayList((Object[])new class06478[]{this.sliderWidget, this.resetButton});
    }

    @Deprecated
    public IntegerSliderEntry(class00392 class003922, int n, int n2, int n3, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, n, n2, n3, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public IntegerSliderEntry(class00392 class003922, int n, int n2, int n3, class00392 class003923, Supplier<Integer> supplier, Consumer<Integer> consumer) {
        this(class003922, n, n2, n3, class003923, supplier, consumer, null);
    }

    public Integer getValue() {
        return this.value.get();
    }

    @Deprecated
    public void setValue(int n) {
        this.sliderWidget.method_25347((double)(class04995.N((int)n, (int)this.minimum, (int)this.maximum) - this.minimum) / (double)Math.abs(this.maximum - this.minimum));
        this.value.set(Math.min(Math.max(n, this.minimum), this.maximum));
        this.sliderWidget.method_25346();
    }

    public Optional<Integer> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue.get());
    }

    public List<? extends class04654> method_25396() {
        return this.widgets;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && this.defaultValue.get().intValue() != this.value.get();
        this.resetButton.method_46419(n2);
        this.sliderWidget.field_22763 = this.isEditable();
        this.sliderWidget.method_46419(n2);
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3);
            this.sliderWidget.method_46421(n3 + this.resetButton.method_25368() + 1);
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.sliderWidget.method_46421(n3 + n4 - 150);
        }
        this.sliderWidget.method_25358(150 - this.resetButton.method_25368() - 2);
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.sliderWidget.method_25394(class010542, n6, n7, f);
    }

    public IntegerSliderEntry setMinimum(int n) {
        this.minimum = n;
        return this;
    }

    public IntegerSliderEntry setMaximum(int n) {
        this.maximum = n;
        return this;
    }

    public boolean isEdited() {
        return super.isEdited() || (long)this.getValue().intValue() != this.orginial;
    }

    public List<? extends class03434> narratables() {
        return this.widgets;
    }

    public IntegerSliderEntry setTextGetter(Function<Integer, class00392> function) {
        this.textGetter = function;
        this.sliderWidget.method_25355(function.apply(this.value.get()));
        return this;
    }

    public Function<Integer, class00392> getTextGetter() {
        return this.textGetter;
    }
}

