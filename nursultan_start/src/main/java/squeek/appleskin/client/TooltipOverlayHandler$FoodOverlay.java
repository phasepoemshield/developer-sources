/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04830
 *  minecraft.class05349
 *  minecraft.class06357
 *  minecraft.class06584
 *  minecraft.class08036
 *  minecraft.class08209
 */
package squeek.appleskin.client;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04830;
import minecraft.class05349;
import minecraft.class06357;
import minecraft.class06584;
import minecraft.class08036;
import minecraft.class08209;
import squeek.appleskin.client.TooltipOverlayHandler;

public class TooltipOverlayHandler$FoodOverlay
implements class04830,
class06357 {
    class05349 defaultFood;
    class05349 modifiedFood;
    class08209 consumableComponent;
    private int biggestHunger;
    private float biggestSaturationIncrement;
    int hungerBars;
    String hungerBarsText;
    int saturationBars;
    String saturationBarsText;
    class06584 itemStack;

    TooltipOverlayHandler$FoodOverlay(class06584 class065842, class05349 class053492, class05349 class053493, class08209 class082092, class08036 class080362) {
        this.itemStack = class065842;
        this.defaultFood = class053492;
        this.modifiedFood = class053493;
        this.consumableComponent = class082092;
        this.biggestHunger = Math.max(class053492.N(), class053493.N());
        this.biggestSaturationIncrement = Math.max(class053492.y(), class053493.y());
        this.hungerBars = (int)Math.ceil((float)Math.abs(this.biggestHunger) / 2.0f);
        if (this.hungerBars > 10) {
            this.hungerBarsText = "x" + (this.biggestHunger < 0 ? -1 : 1) * this.hungerBars;
            this.hungerBars = 1;
        }
        this.saturationBars = (int)Math.ceil(Math.abs(this.biggestSaturationIncrement) / 2.0f);
        if (this.saturationBars > 10 || this.saturationBars == 0) {
            this.saturationBarsText = "x" + (this.biggestSaturationIncrement < 0.0f ? -1 : 1) * this.saturationBars;
            this.saturationBars = 1;
        }
    }

    public void method_32666(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
        if (TooltipOverlayHandler.INSTANCE != null) {
            TooltipOverlayHandler.INSTANCE.onRenderTooltip(class010542, this, n, n2, class015902);
        }
    }

    public int method_32664(class01590 class015902) {
        int n = this.hungerBars * 9;
        if (this.hungerBarsText != null) {
            n += class015902.y(this.hungerBarsText);
        }
        int n2 = this.saturationBars * 7;
        if (this.saturationBarsText != null) {
            n2 += class015902.y(this.saturationBarsText);
        }
        return Math.max(n, n2);
    }

    public int method_32661(class01590 class015902) {
        return 20;
    }

    boolean shouldRenderHungerBars() {
        return this.hungerBars > 0;
    }
}

