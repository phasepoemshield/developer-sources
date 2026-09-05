/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02071
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 */
package page.langeweile.ok_zoomer.config.screen.components;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02071;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList$Entry;

class OkZoomerSelectionList$CategoryEntry
extends OkZoomerSelectionList$Entry {
    private final int paddingTop;
    private final class02071 widget;

    OkZoomerSelectionList$CategoryEntry(class00392 class003922, class05096 class050962, int n) {
        super(class050962);
        this.widget = new class02071(class003922, class050962.method_64506());
        this.paddingTop = n;
    }

    public List<? extends class04654> method_25396() {
        return List.of(this.widget);
    }

    public List<? extends class03434> method_37025() {
        return List.of(this.widget);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.widget.y(this.screen.field_22789 / 2 - 155, this.method_73382() + this.paddingTop);
        this.widget.method_25394(class010542, n, n2, f);
    }
}

