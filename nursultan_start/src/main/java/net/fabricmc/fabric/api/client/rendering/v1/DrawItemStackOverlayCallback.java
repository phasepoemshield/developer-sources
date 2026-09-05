/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06584
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06584;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface DrawItemStackOverlayCallback {
    public static final Event<DrawItemStackOverlayCallback> EVENT = EventFactory.createArrayBacked(DrawItemStackOverlayCallback.class, drawItemStackOverlayCallbackArray -> (class010542, class015902, class065842, n, n2) -> {
        for (DrawItemStackOverlayCallback drawItemStackOverlayCallback : drawItemStackOverlayCallbackArray) {
            drawItemStackOverlayCallback.onDrawItemStackOverlay(class010542, class015902, class065842, n, n2);
        }
    });

    public void onDrawItemStackOverlay(class01054 var1, class01590 var2, class06584 var3, int var4, int var5);
}

