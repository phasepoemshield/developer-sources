/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05349
 *  minecraft.class06584
 */
package squeek.appleskin.api.event;

import minecraft.class05349;
import minecraft.class06584;

public class TooltipOverlayEvent {
    public final class05349 defaultFood;
    public final class05349 modifiedFood;
    public final class06584 itemStack;
    public boolean isCanceled = false;

    TooltipOverlayEvent(class06584 class065842, class05349 class053492, class05349 class053493) {
        this.itemStack = class065842;
        this.defaultFood = class053492;
        this.modifiedFood = class053493;
    }
}

