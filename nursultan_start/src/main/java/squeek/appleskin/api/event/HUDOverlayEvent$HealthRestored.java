/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class05349
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.event.Event
 */
package squeek.appleskin.api.event;

import minecraft.class01054;
import minecraft.class05349;
import minecraft.class06584;
import net.fabricmc.fabric.api.event.Event;
import squeek.appleskin.api.event.HUDOverlayEvent;
import squeek.appleskin.api.handler.EventHandler;

public class HUDOverlayEvent$HealthRestored
extends HUDOverlayEvent {
    public final class05349 foodComponent;
    public final class06584 itemStack;
    public final float modifiedHealth;
    public static Event<EventHandler<HUDOverlayEvent$HealthRestored>> EVENT = EventHandler.createArrayBacked();

    public HUDOverlayEvent$HealthRestored(float f, class06584 class065842, class05349 class053492, int n, int n2, class01054 class010542) {
        super(n, n2, class010542);
        this.modifiedHealth = f;
        this.itemStack = class065842;
        this.foodComponent = class053492;
    }
}

