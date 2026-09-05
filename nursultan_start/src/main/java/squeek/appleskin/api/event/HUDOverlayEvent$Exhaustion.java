/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  net.fabricmc.fabric.api.event.Event
 */
package squeek.appleskin.api.event;

import minecraft.class01054;
import net.fabricmc.fabric.api.event.Event;
import squeek.appleskin.api.event.HUDOverlayEvent;
import squeek.appleskin.api.handler.EventHandler;

public class HUDOverlayEvent$Exhaustion
extends HUDOverlayEvent {
    public final float exhaustion;
    public static Event<EventHandler<HUDOverlayEvent$Exhaustion>> EVENT = EventHandler.createArrayBacked();

    public HUDOverlayEvent$Exhaustion(float f, int n, int n2, class01054 class010542) {
        super(n, n2, class010542);
        this.exhaustion = f;
    }
}

