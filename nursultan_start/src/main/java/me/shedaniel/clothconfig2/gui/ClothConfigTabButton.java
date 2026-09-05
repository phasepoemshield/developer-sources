/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.Tooltip
 *  me.shedaniel.math.Point
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class03428
 *  minecraft.class05936
 *  minecraft.class06308
 *  minecraft.class06478
 *  minecraft.class06595
 *  minecraft.class06611
 */
package me.shedaniel.clothconfig2.gui;

import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import me.shedaniel.math.Point;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class03428;
import minecraft.class05936;
import minecraft.class06308;
import minecraft.class06478;
import minecraft.class06595;
import minecraft.class06611;

public class ClothConfigTabButton
extends class06308 {
    private final int index;
    private final ClothConfigScreen screen;
    private final Supplier<Optional<class05936[]>> descriptionSupplier;

    public ClothConfigTabButton(ClothConfigScreen clothConfigScreen, int n, int n2, int n3, int n4, int n5, class00392 class003922, Supplier<Optional<class05936[]>> supplier) {
        super(n2, n3, n4, n5, class003922);
        this.index = n;
        this.screen = clothConfigScreen;
        this.descriptionSupplier = supplier;
    }

    public ClothConfigTabButton(ClothConfigScreen clothConfigScreen, int n, int n2, int n3, int n4, int n5, class00392 class003922) {
        this(clothConfigScreen, n, n2, n3, n4, n5, class003922, null);
    }

    public boolean method_25405(double d, double d2) {
        return this.field_22764 && d >= (double)this.method_46426() && d2 >= (double)this.method_46427() && d < (double)(this.method_46426() + this.field_22758) && d2 < (double)(this.method_46427() + this.field_22759) && d >= 20.0 && d < (double)(this.screen.field_22789 - 20);
    }

    public Optional<class05936[]> getDescription() {
        if (this.descriptionSupplier != null) {
            return this.descriptionSupplier.get();
        }
        return Optional.empty();
    }

    public void method_25306(class06611 class066112) {
        if (this.index != -1) {
            this.screen.selectedCategoryIndex = this.index;
        }
        this.screen.method_25423(this.screen.field_22789, this.screen.field_22790);
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        Optional<class05936[]> optional;
        this.field_22763 = this.index != this.screen.selectedCategoryIndex;
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
        if (this.method_25405(n, n2) && (optional = this.getDescription()).isPresent() && optional.get().length > 0) {
            this.screen.addTooltip(Tooltip.of((Point)new Point(n, n2), (class05936[])optional.get()));
        }
    }

    public boolean method_25351(class06595 class065952) {
        return this.field_22764 && this.field_22763 && super.method_25351(class065952);
    }

    public void method_47399(class03428 class034282) {
    }
}

