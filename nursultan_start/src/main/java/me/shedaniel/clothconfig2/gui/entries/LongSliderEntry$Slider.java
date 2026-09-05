/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05801
 *  minecraft.class06601
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.LongSliderEntry;
import minecraft.class00392;
import minecraft.class05801;
import minecraft.class06601;
import minecraft.class06613;

class LongSliderEntry$Slider
extends class05801 {
    final /* synthetic */ LongSliderEntry this$0;

    protected LongSliderEntry$Slider(LongSliderEntry longSliderEntry, int n, int n2, int n3, int n4, double d) {
        this.this$0 = longSliderEntry;
        super(n, n2, n3, n4, (class00392)class00392.i(), d);
    }

    public double getValue() {
        return this.field_22753;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.this$0.isEditable()) {
            return false;
        }
        return super.method_25404(class066012);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (!this.this$0.isEditable()) {
            return false;
        }
        return super.method_25403(class066132, d, d2);
    }

    public void method_25344() {
        this.this$0.value.set((long)((double)this.this$0.minimum + (double)Math.abs(this.this$0.maximum - this.this$0.minimum) * this.field_22753));
    }

    public void method_25346() {
        this.method_25355(this.this$0.textGetter.apply(this.this$0.value.get()));
    }

    public void method_25347(double d) {
        super.method_25347(d);
    }
}

