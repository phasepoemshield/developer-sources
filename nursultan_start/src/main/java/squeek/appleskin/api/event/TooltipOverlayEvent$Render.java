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
import squeek.appleskin.api.event.TooltipOverlayEvent;
import squeek.appleskin.api.handler.EventHandler;

public class TooltipOverlayEvent$Render
extends TooltipOverlayEvent {
    public int x;
    public int y;
    public class01054 context;
    public static Event<EventHandler<TooltipOverlayEvent$Render>> EVENT = EventHandler.createArrayBacked();

    public TooltipOverlayEvent$Render(class06584 class065842, int n, int n2, class01054 class010542, class05349 class053492, class05349 class053493) {
        super(class065842, class053492, class053493);
        this.context = class010542;
        this.x = n;
        this.y = n2;
    }
}

