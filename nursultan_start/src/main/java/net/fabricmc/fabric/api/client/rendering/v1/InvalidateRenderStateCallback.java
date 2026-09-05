/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public interface InvalidateRenderStateCallback {
    public static final Event<InvalidateRenderStateCallback> EVENT = EventFactory.createArrayBacked(InvalidateRenderStateCallback.class, invalidateRenderStateCallbackArray -> () -> {
        for (InvalidateRenderStateCallback invalidateRenderStateCallback : invalidateRenderStateCallbackArray) {
            invalidateRenderStateCallback.onInvalidate();
        }
    });

    public void onInvalidate();
}

