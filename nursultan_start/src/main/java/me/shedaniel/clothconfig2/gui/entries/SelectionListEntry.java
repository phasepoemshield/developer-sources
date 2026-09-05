/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry$Translatable;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08844;

public class SelectionListEntry<T>
extends TooltipListEntry<T> {
    private final ImmutableList<T> values;
    private final AtomicInteger index;
    private final int original;
    private final class05362 buttonWidget;
    private final class05362 resetButton;
    private final Supplier<T> defaultValue;
    private final List<class06478> widgets;
    private final Function<T, class00392> nameProvider;

    @Deprecated
    public SelectionListEntry(class00392 class003922, T[] TArray, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<T, class00392> function, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, supplier2, bl);
        this.values = TArray != null ? ImmutableList.copyOf((Object[])TArray) : ImmutableList.of(t);
        this.defaultValue = supplier;
        this.index = new AtomicInteger(this.values.indexOf(t));
        this.index.compareAndSet(-1, 0);
        this.original = this.values.indexOf(t);
        this.buttonWidget = class05362.method_46430((class00392)class00392.i(), class053622 -> {
            this.index.incrementAndGet();
            this.index.compareAndSet(this.values.size(), 0);
        }).N(0, 0, 150, 20).N();
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> this.index.set(this.getDefaultIndex())).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.saveCallback = consumer;
        this.widgets = Lists.newArrayList((Object[])new class06478[]{this.buttonWidget, this.resetButton});
        this.nameProvider = function == null ? object -> class00392.L((String)(object instanceof SelectionListEntry$Translatable ? ((SelectionListEntry$Translatable)object).getKey() : object.toString())) : function;
    }

    @Deprecated
    public SelectionListEntry(class00392 class003922, T[] TArray, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<T, class00392> function, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, TArray, t, class003923, supplier, consumer, function, supplier2, false);
    }

    @Deprecated
    public SelectionListEntry(class00392 class003922, T[] TArray, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer, Function<T, class00392> function) {
        this(class003922, TArray, t, class003923, supplier, consumer, function, null);
    }

    @Deprecated
    public SelectionListEntry(class00392 class003922, T[] TArray, T t, class00392 class003923, Supplier<T> supplier, Consumer<T> consumer) {
        this(class003922, TArray, t, class003923, supplier, consumer, null);
    }

    public T getValue() {
        return (T)this.values.get(this.index.get());
    }

    public Optional<T> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue.get());
    }

    public List<? extends class04654> method_25396() {
        return this.widgets;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && this.getDefaultIndex() != this.index.get();
        this.resetButton.method_46419(n2);
        this.buttonWidget.field_22763 = this.isEditable();
        this.buttonWidget.method_46419(n2);
        this.buttonWidget.method_25355(this.nameProvider.apply(this.getValue()));
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3);
            this.buttonWidget.method_46421(n3 + this.resetButton.method_25368() + 2);
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.buttonWidget.method_46421(n3 + n4 - 150);
        }
        this.buttonWidget.method_25358(150 - this.resetButton.method_25368() - 2);
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.buttonWidget.method_25394(class010542, n6, n7, f);
    }

    public boolean isEdited() {
        return super.isEdited() || !Objects.equals(this.index.get(), this.original);
    }

    public List<? extends class03434> narratables() {
        return this.widgets;
    }

    private int getDefaultIndex() {
        return Math.max(0, this.values.indexOf(this.defaultValue.get()));
    }
}

