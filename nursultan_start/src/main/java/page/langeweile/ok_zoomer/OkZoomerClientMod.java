/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06428
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 */
package page.langeweile.ok_zoomer;

import minecraft.class06428;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.events.ApplyLoadOnceOptionsEvent;
import page.langeweile.ok_zoomer.events.ManageExtraKeysEvent;
import page.langeweile.ok_zoomer.events.ManageZoomEvent;
import page.langeweile.ok_zoomer.events.OpenScreenEvent;
import page.langeweile.ok_zoomer.events.RegisterCommands;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.FabricZoomUtils;

public class OkZoomerClientMod
implements ClientModInitializer {
    public void onInitializeClient() {
        OkZoomerConfigManager.init();
        KeyBindingHelper.registerKeyBinding((class06428)ZoomKeyBinds.ZOOM_KEY);
        if (ZoomKeyBinds.areExtraKeyBindsEnabled()) {
            KeyBindingHelper.registerKeyBinding((class06428)ZoomKeyBinds.DECREASE_ZOOM_KEY);
            KeyBindingHelper.registerKeyBinding((class06428)ZoomKeyBinds.INCREASE_ZOOM_KEY);
            KeyBindingHelper.registerKeyBinding((class06428)ZoomKeyBinds.RESET_ZOOM_KEY);
        }
        ClientTickEvents.START_CLIENT_TICK.register(ManageZoomEvent::startClientTick);
        ClientTickEvents.START_CLIENT_TICK.register(class062022 -> ManageExtraKeysEvent.startClientTick());
        ClientLifecycleEvents.CLIENT_STARTED.register(class062022 -> ApplyLoadOnceOptionsEvent.readyClient());
        ClientTickEvents.END_CLIENT_TICK.register(OpenScreenEvent::endClientTick);
        ClientCommandRegistrationCallback.EVENT.register(RegisterCommands::registerCommands);
        FabricZoomUtils.defineSafeSmartOcclusion();
        FabricZoomUtils.addInitialPredicates();
    }
}

