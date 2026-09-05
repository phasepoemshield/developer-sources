/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class01054;
import minecraft.class02233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Deprecated
@Environment(value=EnvType.CLIENT)
public interface HudRenderCallback {
    public static final Event<HudRenderCallback> EVENT = EventFactory.createArrayBacked(HudRenderCallback.class, hudRenderCallbackArray -> (class010542, class022332) -> {
        for (HudRenderCallback hudRenderCallback : hudRenderCallbackArray) {
            hudRenderCallback.onHudRender(class010542, class022332);
        }
    });

    public void onHudRender(class01054 var1, class02233 var2);
}

