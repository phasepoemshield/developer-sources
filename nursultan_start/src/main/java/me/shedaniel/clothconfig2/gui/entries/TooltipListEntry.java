/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.Tooltip
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class05216
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.math.Point;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class05216;

public abstract class TooltipListEntry<T>
extends AbstractConfigListEntry<T> {
    private Supplier<Optional<class00392[]>> tooltipSupplier;

    @Deprecated
    public TooltipListEntry(class00392 class003922, Supplier<Optional<class00392[]>> supplier) {
        this(class003922, supplier, false);
    }

    @Deprecated
    public TooltipListEntry(class00392 class003922, Supplier<Optional<class00392[]>> supplier, boolean bl) {
        super(class003922, bl);
        this.tooltipSupplier = supplier;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        if (this.isMouseInside(n6, n7, n3, n2, n4, n5)) {
            this.getTooltip(n6, n7).map(class00392Array -> Tooltip.of((Point)new Point(n6, n7), (class01028[])this.wrapLinesToScreen((class00392[])class00392Array))).ifPresent(arg_0 -> ((TooltipListEntry)this).addTooltip(arg_0));
        }
    }

    public Optional<class00392[]> getTooltip(int n, int n2) {
        return this.getTooltip();
    }

    public Optional<class00392[]> getTooltip() {
        Stream stream = Stream.ofNullable(this.tooltipSupplier).map(Supplier::get).flatMap(Optional::stream).flatMap(Arrays::stream);
        class05216 class052162 = this.isEnabled() ? null : class00392.L((String)"text.cloth-config.disabled_tooltip");
        class00392[] class00392Array = (class00392[])Stream.concat(stream, Stream.ofNullable(class052162)).toArray(class00392[]::new);
        return class00392Array.length < 1 ? Optional.empty() : Optional.of(class00392Array);
    }

    public void setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = supplier;
    }

    public Supplier<Optional<class00392[]>> getTooltipSupplier() {
        return this.tooltipSupplier;
    }
}

