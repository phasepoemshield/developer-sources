/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04830
 *  minecraft.class06357
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class04830;
import minecraft.class06357;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface TooltipComponentCallback {
    public static final Event<TooltipComponentCallback> EVENT = EventFactory.createArrayBacked(TooltipComponentCallback.class, tooltipComponentCallbackArray -> class048302 -> {
        for (TooltipComponentCallback tooltipComponentCallback : tooltipComponentCallbackArray) {
            class06357 class063572 = tooltipComponentCallback.getComponent(class048302);
            if (class063572 == null) continue;
            return class063572;
        }
        return null;
    });

    public @Nullable class06357 getComponent(class04830 var1);
}

