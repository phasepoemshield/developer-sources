/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.events.ClientVoiceChatEvents
 *  de.maxhenkel.voicechat.events.ClientWorldEvents
 *  de.maxhenkel.voicechat.events.InputEvents
 *  de.maxhenkel.voicechat.events.PublishServerEvents
 *  de.maxhenkel.voicechat.events.RenderEvents
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$KeyboardEvent
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$MouseEvent
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderHUDEvent
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderNameplateEvent
 *  de.maxhenkel.voicechat.resourcepacks.IPackRepository
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection
 *  minecraft.class00642
 *  minecraft.class01054
 *  minecraft.class01057
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class04671
 *  minecraft.class06202
 *  minecraft.class06428
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
 *  net.fabricmc.fabric.api.event.Event
 */
package de.maxhenkel.voicechat.intercompatibility;

import de.maxhenkel.voicechat.events.ClientVoiceChatEvents;
import de.maxhenkel.voicechat.events.ClientWorldEvents;
import de.maxhenkel.voicechat.events.InputEvents;
import de.maxhenkel.voicechat.events.PublishServerEvents;
import de.maxhenkel.voicechat.events.RenderEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.mixin.ConnectionAccessor;
import de.maxhenkel.voicechat.resourcepacks.IPackRepository;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import java.net.SocketAddress;
import java.util.function.Consumer;
import minecraft.class00642;
import minecraft.class01054;
import minecraft.class01057;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class04671;
import minecraft.class06202;
import minecraft.class06428;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.api.event.Event;

public class FabricClientCompatibilityManager
extends ClientCompatibilityManager {
    private static final class01894 VOICE_CHAT_ICON_LAYER = class01894.N((String)"voicechat", (String)"hud");
    private static final class01894 EARLY_JOIN = class01894.N((String)"voicechat", (String)"early_join");
    private static final class06202 mc = class06202.Nq();

    public class06428 registerKeyBinding(class06428 class064282) {
        return KeyBindingHelper.registerKeyBinding((class06428)class064282);
    }

    public FabricClientCompatibilityManager() {
        HudElementRegistry.attachElementBefore((class01894)VanillaHudElements.STATUS_EFFECTS, (class01894)VOICE_CHAT_ICON_LAYER, this::onRenderVoiceChatLayer);
        ClientPlayConnectionEvents.JOIN.addPhaseOrdering(EARLY_JOIN, Event.DEFAULT_PHASE);
    }

    public class04671 getBoundKeyOf(class06428 class064282) {
        return KeyBindingHelper.getBoundKeyOf((class06428)class064282);
    }

    public void onDisconnect(Runnable runnable) {
        ClientWorldEvents.DISCONNECT.register((Object)runnable);
    }

    public SocketAddress getSocketAddress(class00642 class006422) {
        return ((ConnectionAccessor)class006422).getChannel().remoteAddress();
    }

    public void onVoiceChatConnected(Consumer<ClientVoicechatConnection> consumer) {
        ClientVoiceChatEvents.VOICECHAT_CONNECTED.register(consumer);
    }

    private void onRenderVoiceChatLayer(class01054 class010542, class02233 class022332) {
        ((Consumer)RenderEvents.RENDER_HUD.invoker()).accept(class010542);
    }

    public void addResourcePackSource(class01057 class010572) {
        IPackRepository iPackRepository = (IPackRepository)mc.t();
        iPackRepository.voicechat$addSource(class010572);
    }

    public void onVoiceChatDisconnected(Runnable runnable) {
        ClientVoiceChatEvents.VOICECHAT_DISCONNECTED.register((Object)runnable);
    }

    public void emitDisconnectedEvent() {
        ((Runnable)ClientWorldEvents.DISCONNECT.invoker()).run();
    }

    public void emitVoiceChatDisconnectedEvent() {
        ((Runnable)ClientVoiceChatEvents.VOICECHAT_DISCONNECTED.invoker()).run();
    }

    public void emitVoiceChatConnectedEvent(ClientVoicechatConnection clientVoicechatConnection) {
        ((Consumer)ClientVoiceChatEvents.VOICECHAT_CONNECTED.invoker()).accept(clientVoicechatConnection);
    }

    public void onRenderHUD(ClientCompatibilityManager.RenderHUDEvent renderHUDEvent) {
        RenderEvents.RENDER_HUD.register(class010542 -> renderHUDEvent.render(class010542, mc.NK().y()));
    }

    public void onMouseEvent(ClientCompatibilityManager.MouseEvent mouseEvent) {
        InputEvents.MOUSE_KEY.register((Object)mouseEvent);
    }

    public void onPublishServer(Consumer<Integer> consumer) {
        PublishServerEvents.SERVER_PUBLISHED.register(consumer);
    }

    public void onJoinWorld(Runnable runnable) {
        ClientPlayConnectionEvents.JOIN.register(EARLY_JOIN, (class016832, packetSender, class062022) -> runnable.run());
    }

    public void onHandleKeyBinds(Runnable runnable) {
        InputEvents.HANDLE_KEYBINDS.register((Object)runnable);
    }

    public void onRenderNamePlate(ClientCompatibilityManager.RenderNameplateEvent renderNameplateEvent) {
        RenderEvents.RENDER_NAMEPLATE.register((Object)renderNameplateEvent);
    }

    public void onKeyboardEvent(ClientCompatibilityManager.KeyboardEvent keyboardEvent) {
        InputEvents.KEYBOARD_KEY.register((Object)keyboardEvent);
    }

    public void onClientTick(Runnable runnable) {
        ClientTickEvents.START_CLIENT_TICK.register(class062022 -> runnable.run());
    }
}

