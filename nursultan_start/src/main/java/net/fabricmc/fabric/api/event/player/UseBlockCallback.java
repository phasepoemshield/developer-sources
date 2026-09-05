/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06183
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class06183;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public interface UseBlockCallback {
    public static final Event<UseBlockCallback> EVENT = EventFactory.createArrayBacked(UseBlockCallback.class, useBlockCallbackArray -> (class080362, class072992, class070502, class061832) -> {
        for (UseBlockCallback useBlockCallback : useBlockCallbackArray) {
            class07082 class070822 = useBlockCallback.interact(class080362, class072992, class070502, class061832);
            if (class070822 == class07082.i) continue;
            return class070822;
        }
        return class07082.i;
    });

    public class07082 interact(class08036 var1, class07299 var2, class07050 var3, class06183 var4);
}

