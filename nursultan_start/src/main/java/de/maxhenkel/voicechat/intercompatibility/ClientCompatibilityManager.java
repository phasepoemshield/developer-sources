/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatClientApi
 *  de.maxhenkel.voicechat.plugins.impl.VoicechatClientApiImpl
 *  de.maxhenkel.voicechat.service.Service
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection
 *  minecraft.class00642
 *  minecraft.class01057
 *  minecraft.class04671
 *  minecraft.class06428
 */
package de.maxhenkel.voicechat.intercompatibility;

import de.maxhenkel.voicechat.api.VoicechatClientApi;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$KeyboardEvent;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$MouseEvent;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderHUDEvent;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderNameplateEvent;
import de.maxhenkel.voicechat.plugins.impl.VoicechatClientApiImpl;
import de.maxhenkel.voicechat.service.Service;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import java.net.SocketAddress;
import java.util.function.Consumer;
import minecraft.class00642;
import minecraft.class01057;
import minecraft.class04671;
import minecraft.class06428;

public abstract class ClientCompatibilityManager {
    public static ClientCompatibilityManager INSTANCE = (ClientCompatibilityManager)Service.get(ClientCompatibilityManager.class);

    public abstract class06428 registerKeyBinding(class06428 var1);

    public abstract class04671 getBoundKeyOf(class06428 var1);

    public abstract void onDisconnect(Runnable var1);

    public abstract SocketAddress getSocketAddress(class00642 var1);

    public abstract void onVoiceChatConnected(Consumer<ClientVoicechatConnection> var1);

    public abstract void addResourcePackSource(class01057 var1);

    public abstract void onVoiceChatDisconnected(Runnable var1);

    public abstract void emitDisconnectedEvent();

    public abstract void emitVoiceChatDisconnectedEvent();

    public abstract void emitVoiceChatConnectedEvent(ClientVoicechatConnection var1);

    public abstract void onRenderHUD(ClientCompatibilityManager$RenderHUDEvent var1);

    public abstract void onMouseEvent(ClientCompatibilityManager$MouseEvent var1);

    public abstract void onPublishServer(Consumer<Integer> var1);

    public abstract void onJoinWorld(Runnable var1);

    public VoicechatClientApi getClientApi() {
        return VoicechatClientApiImpl.INSTANCE;
    }

    public abstract void onHandleKeyBinds(Runnable var1);

    public abstract void onRenderNamePlate(ClientCompatibilityManager$RenderNameplateEvent var1);

    public abstract void onKeyboardEvent(ClientCompatibilityManager$KeyboardEvent var1);

    public abstract void onClientTick(Runnable var1);
}

