/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05801
 *  minecraft.class06601
 *  minecraft.class06613
 */
package de.maxhenkel.voicechat.gui.widgets;

import minecraft.class00392;
import minecraft.class05801;
import minecraft.class06601;
import minecraft.class06613;

public abstract class DebouncedSlider
extends class05801 {
    private boolean dragged;
    private double lastValue;

    public DebouncedSlider(int n, int n2, int n3, int n4, class00392 class003922, double d) {
        super(n, n2, n3, n4, class003922, d);
        this.lastValue = d;
    }

    private void applyDebouncedInternal() {
        if (this.field_22753 == this.lastValue) {
            return;
        }
        this.lastValue = this.field_22753;
        this.applyDebounced();
    }

    public boolean method_25404(class06601 class066012) {
        boolean bl = super.method_25404(class066012);
        if (class066012.R() || class066012.M()) {
            this.applyDebouncedInternal();
        }
        return bl;
    }

    public abstract void applyDebounced();

    public void method_25344() {
    }

    public void method_25348(class06613 class066132, boolean bl) {
        super.method_25348(class066132, bl);
        this.applyDebouncedInternal();
    }

    public void method_25357(class06613 class066132) {
        super.method_25357(class066132);
        if (this.dragged) {
            this.applyDebouncedInternal();
            this.dragged = false;
        }
    }

    public void method_25349(class06613 class066132, double d, double d2) {
        super.method_25349(class066132, d, d2);
        this.dragged = true;
        if (this.field_22753 >= 1.0 || this.field_22753 <= 0.0) {
            this.applyDebouncedInternal();
            this.dragged = false;
        }
    }
}

