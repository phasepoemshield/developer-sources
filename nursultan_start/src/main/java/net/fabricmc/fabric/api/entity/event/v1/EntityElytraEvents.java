/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.entity.event.v1;

import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents$Allow;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents$Custom;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class EntityElytraEvents {
    public static final Event<EntityElytraEvents$Allow> ALLOW = EventFactory.createArrayBacked(EntityElytraEvents$Allow.class, entityElytraEvents$AllowArray -> class074382 -> {
        for (EntityElytraEvents$Allow entityElytraEvents$Allow : entityElytraEvents$AllowArray) {
            if (entityElytraEvents$Allow.allowElytraFlight(class074382)) continue;
            return false;
        }
        return true;
    });
    public static final Event<EntityElytraEvents$Custom> CUSTOM = EventFactory.createArrayBacked(EntityElytraEvents$Custom.class, entityElytraEvents$CustomArray -> (class074382, bl) -> {
        for (EntityElytraEvents$Custom entityElytraEvents$Custom : entityElytraEvents$CustomArray) {
            if (!entityElytraEvents$Custom.useCustomElytra(class074382, bl)) continue;
            return true;
        }
        return false;
    });

    private EntityElytraEvents() {
    }
}

