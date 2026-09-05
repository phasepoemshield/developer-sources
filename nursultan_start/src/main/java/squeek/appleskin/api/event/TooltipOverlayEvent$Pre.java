/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05349
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.event.Event
 */
package squeek.appleskin.api.event;

import minecraft.class05349;
import minecraft.class06584;
import net.fabricmc.fabric.api.event.Event;
import squeek.appleskin.api.event.TooltipOverlayEvent;
import squeek.appleskin.api.handler.EventHandler;

public class TooltipOverlayEvent$Pre
extends TooltipOverlayEvent {
    public static Event<EventHandler<TooltipOverlayEvent$Pre>> EVENT = EventHandler.createArrayBacked();

    public TooltipOverlayEvent$Pre(class06584 class065842, class05349 class053492, class05349 class053493) {
        super(class065842, class053492, class053493);
    }
}

