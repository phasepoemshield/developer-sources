/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.ClientVoicechatSocket
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$EntitySound
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$LocationalSound
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$StaticSound
 *  de.maxhenkel.voicechat.api.events.ClientSoundEvent
 *  de.maxhenkel.voicechat.api.events.ClientVoicechatInitializationEvent
 *  de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent
 *  de.maxhenkel.voicechat.api.events.DestroyOpenALContextEvent
 *  de.maxhenkel.voicechat.api.events.MergeClientSoundEvent
 *  de.maxhenkel.voicechat.api.events.NameTagIconRenderEvent
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 *  javax.annotation.Nullable
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.ClientVoicechatSocket;
import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import de.maxhenkel.voicechat.api.events.ClientSoundEvent;
import de.maxhenkel.voicechat.api.events.ClientVoicechatInitializationEvent;
import de.maxhenkel.voicechat.api.events.CreateOpenALContextEvent;
import de.maxhenkel.voicechat.api.events.DestroyOpenALContextEvent;
import de.maxhenkel.voicechat.api.events.MergeClientSoundEvent;
import de.maxhenkel.voicechat.api.events.NameTagIconRenderEvent;
import de.maxhenkel.voicechat.api.events.OpenALSoundEvent;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.plugins.impl.ClientVoicechatSocketImpl;
import de.maxhenkel.voicechat.plugins.impl.PositionImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl$EntitySoundImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl$LocationalSoundImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl$StaticSoundImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientSoundEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.ClientVoicechatInitializationEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.CreateOpenALContextEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.DestroyOpenALContextEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.MergeClientSoundEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.NameTagIconRenderEventImpl;
import de.maxhenkel.voicechat.plugins.impl.events.OpenALSoundEventImpl;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class06889;

public class ClientPluginManager {
    private final PluginManager pluginManager;
    private final NameTagIconRenderEventImpl cachedRenderEvent = new NameTagIconRenderEventImpl();
    private static ClientPluginManager instance;

    public ClientPluginManager(PluginManager pluginManager) {
        this.pluginManager = pluginManager;
    }

    public static ClientPluginManager instance() {
        if (instance == null) {
            instance = new ClientPluginManager(PluginManager.instance());
        }
        return instance;
    }

    public boolean shouldRenderPlayerIcons(UUID uUID) {
        this.cachedRenderEvent.setEntityId(uUID);
        this.cachedRenderEvent.setCancelled(false);
        return !this.pluginManager.dispatchEvent(NameTagIconRenderEvent.class, this.cachedRenderEvent);
    }

    @Nullable
    public short[] onMergeClientSound(@Nullable short[] sArray) {
        MergeClientSoundEventImpl mergeClientSoundEventImpl = new MergeClientSoundEventImpl();
        this.pluginManager.dispatchEvent(MergeClientSoundEvent.class, mergeClientSoundEventImpl);
        List<short[]> list = mergeClientSoundEventImpl.getAudioToMerge();
        if (list == null) {
            return sArray;
        }
        if (sArray != null) {
            list.add(0, sArray);
        }
        return AudioUtils.combineAudio(list);
    }

    public void onCreateALContext(long l, long l2) {
        this.pluginManager.dispatchEvent(CreateOpenALContextEvent.class, new CreateOpenALContextEventImpl(l, l2));
    }

    @Nullable
    public short[] onClientSound(short[] sArray, boolean bl) {
        ClientSoundEventImpl clientSoundEventImpl = new ClientSoundEventImpl(sArray, bl);
        boolean bl2 = this.pluginManager.dispatchEvent(ClientSoundEvent.class, clientSoundEventImpl);
        if (bl2) {
            return null;
        }
        return clientSoundEventImpl.getRawAudio();
    }

    public void onDestroyALContext(long l, long l2) {
        this.pluginManager.dispatchEvent(DestroyOpenALContextEvent.class, new DestroyOpenALContextEventImpl(l, l2));
    }

    public void onALSound(int n, @Nullable UUID uUID, @Nullable class06889 class068892, @Nullable String string, Class<? extends OpenALSoundEvent> clazz) {
        this.pluginManager.dispatchEvent(clazz, new OpenALSoundEventImpl(uUID, class068892 == null ? null : new PositionImpl(class068892), string, n));
    }

    public short[] onReceiveStaticClientSound(UUID uUID, short[] sArray) {
        ClientReceiveSoundEventImpl$StaticSoundImpl clientReceiveSoundEventImpl$StaticSoundImpl = new ClientReceiveSoundEventImpl$StaticSoundImpl(uUID, sArray);
        this.pluginManager.dispatchEvent(ClientReceiveSoundEvent.StaticSound.class, clientReceiveSoundEventImpl$StaticSoundImpl);
        return clientReceiveSoundEventImpl$StaticSoundImpl.getRawAudio();
    }

    public short[] onReceiveEntityClientSound(UUID uUID, UUID uUID2, short[] sArray, boolean bl, float f) {
        ClientReceiveSoundEventImpl$EntitySoundImpl clientReceiveSoundEventImpl$EntitySoundImpl = new ClientReceiveSoundEventImpl$EntitySoundImpl(uUID, uUID2, sArray, bl, f);
        this.pluginManager.dispatchEvent(ClientReceiveSoundEvent.EntitySound.class, clientReceiveSoundEventImpl$EntitySoundImpl);
        return clientReceiveSoundEventImpl$EntitySoundImpl.getRawAudio();
    }

    public short[] onReceiveLocationalClientSound(UUID uUID, short[] sArray, class06889 class068892, float f) {
        ClientReceiveSoundEventImpl$LocationalSoundImpl clientReceiveSoundEventImpl$LocationalSoundImpl = new ClientReceiveSoundEventImpl$LocationalSoundImpl(uUID, sArray, new PositionImpl(class068892), f);
        this.pluginManager.dispatchEvent(ClientReceiveSoundEvent.LocationalSound.class, clientReceiveSoundEventImpl$LocationalSoundImpl);
        return clientReceiveSoundEventImpl$LocationalSoundImpl.getRawAudio();
    }

    public ClientVoicechatSocket getClientSocketImplementation() {
        ClientVoicechatInitializationEventImpl clientVoicechatInitializationEventImpl = new ClientVoicechatInitializationEventImpl();
        this.pluginManager.dispatchEvent(ClientVoicechatInitializationEvent.class, clientVoicechatInitializationEventImpl);
        ClientVoicechatSocket clientVoicechatSocket = clientVoicechatInitializationEventImpl.getSocketImplementation();
        if (clientVoicechatSocket == null) {
            clientVoicechatSocket = new ClientVoicechatSocketImpl();
            Voicechat.LOGGER.debug("Using default voicechat client socket implementation", new Object[0]);
        } else {
            Voicechat.LOGGER.info("Using custom voicechat client socket implementation: {}", clientVoicechatSocket.getClass().getName());
        }
        return clientVoicechatSocket;
    }
}

