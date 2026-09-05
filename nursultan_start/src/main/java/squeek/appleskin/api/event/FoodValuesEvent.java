/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05349
 *  minecraft.class06584
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.Event
 */
package squeek.appleskin.api.event;

import minecraft.class05349;
import minecraft.class06584;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.Event;
import squeek.appleskin.api.handler.EventHandler;

public class FoodValuesEvent {
    public class05349 defaultFoodComponent;
    public class05349 modifiedFoodComponent;
    public final class06584 itemStack;
    public final class08036 player;
    public static Event<EventHandler<FoodValuesEvent>> EVENT = EventHandler.createArrayBacked();

    public FoodValuesEvent(class08036 class080362, class06584 class065842, class05349 class053492, class05349 class053493) {
        this.player = class080362;
        this.itemStack = class065842;
        this.defaultFoodComponent = class053492;
        this.modifiedFoodComponent = class053493;
    }
}

