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
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents$AllowCapeRender;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class LivingEntityFeatureRenderEvents {
    public static final Event<LivingEntityFeatureRenderEvents$AllowCapeRender> ALLOW_CAPE_RENDER = EventFactory.createArrayBacked(LivingEntityFeatureRenderEvents$AllowCapeRender.class, livingEntityFeatureRenderEvents$AllowCapeRenderArray -> class084682 -> {
        for (LivingEntityFeatureRenderEvents$AllowCapeRender livingEntityFeatureRenderEvents$AllowCapeRender : livingEntityFeatureRenderEvents$AllowCapeRenderArray) {
            if (livingEntityFeatureRenderEvents$AllowCapeRender.allowCapeRender(class084682)) continue;
            return false;
        }
        return true;
    });

    private LivingEntityFeatureRenderEvents() {
    }
}

