/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05197
 *  minecraft.class05232
 *  minecraft.class05936
 */
package squeek.appleskin.client;

import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05197;
import minecraft.class05232;
import minecraft.class05936;
import squeek.appleskin.client.TooltipOverlayHandler$EmptyText;
import squeek.appleskin.client.TooltipOverlayHandler$FoodOverlay;

public class TooltipOverlayHandler$FoodOverlayTextComponent
extends TooltipOverlayHandler$EmptyText
implements class01028 {
    public TooltipOverlayHandler$FoodOverlay foodOverlay;

    TooltipOverlayHandler$FoodOverlayTextComponent(TooltipOverlayHandler$FoodOverlay tooltipOverlayHandler$FoodOverlay) {
        this.foodOverlay = tooltipOverlayHandler$FoodOverlay;
    }

    public boolean accept(class05197 class051972) {
        return class05232.N((class05936)this, (class00405)this.method_10866(), (class05197)class051972);
    }

    public class01028 method_30937() {
        return this;
    }
}

