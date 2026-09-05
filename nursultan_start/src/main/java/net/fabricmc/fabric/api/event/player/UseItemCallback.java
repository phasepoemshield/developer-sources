/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public interface UseItemCallback {
    public static final Event<UseItemCallback> EVENT = EventFactory.createArrayBacked(UseItemCallback.class, useItemCallbackArray -> (class080362, class072992, class070502) -> {
        for (UseItemCallback useItemCallback : useItemCallbackArray) {
            class07082 class070822 = useItemCallback.interact(class080362, class072992, class070502);
            if (class070822 == class07082.i) continue;
            return class070822;
        }
        return class07082.i;
    });

    public class07082 interact(class08036 var1, class07299 var2, class07050 var3);
}

