/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.audiosender.AudioSender
 *  de.maxhenkel.voicechat.voice.common.MicPacket
 *  de.maxhenkel.voicechat.voice.server.Server
 */
package de.maxhenkel.voicechat.plugins.impl.audiosender;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.audiosender.AudioSender;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AudioSenderImpl
implements AudioSender {
    private static final Map<UUID, AudioSenderImpl> AUDIO_SENDERS = new HashMap<UUID, AudioSenderImpl>();
    private final UUID uuid;
    private boolean whispering;
    private long nextSequenceNumber;

    public AudioSender sequenceNumber(long l) {
        if (l < 0L) {
            throw new IllegalArgumentException("Sequence number must be positive");
        }
        this.nextSequenceNumber = l;
        return this;
    }

    public AudioSenderImpl(UUID uUID) {
        this.uuid = uUID;
    }

    public boolean reset() {
        return this.sendMicrophonePacket(new byte[0]);
    }

    public boolean isWhispering() {
        return this.whispering;
    }

    public boolean send(byte[] byArray) {
        return this.sendMicrophonePacket(byArray);
    }

    public boolean canSend() {
        return !Voicechat.SERVER.isCompatible(this.uuid) && AUDIO_SENDERS.get(this.uuid) == this;
    }

    public boolean sendMicrophonePacket(byte[] byArray) {
        if (byArray == null) {
            throw new IllegalStateException("opusEncodedData is not set");
        }
        if (!this.canSend()) {
            return false;
        }
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return true;
        }
        try {
            MicPacket micPacket = new MicPacket(byArray, byArray.length > 0 && this.whispering, this.nextSequenceNumber++);
            if (byArray.length <= 0) {
                this.nextSequenceNumber = 0L;
            }
            server.onMicPacket(this.uuid, micPacket);
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to send audio", exception);
        }
        return true;
    }

    public AudioSender whispering(boolean bl) {
        this.whispering = bl;
        return this;
    }

    public static boolean registerAudioSender(AudioSenderImpl audioSenderImpl) {
        if (Voicechat.SERVER.isCompatible(audioSenderImpl.uuid)) {
            return false;
        }
        if (AUDIO_SENDERS.containsKey(audioSenderImpl.uuid)) {
            return false;
        }
        AUDIO_SENDERS.put(audioSenderImpl.uuid, audioSenderImpl);
        return true;
    }

    public static boolean unregisterAudioSender(AudioSenderImpl audioSenderImpl) {
        return AUDIO_SENDERS.remove(audioSenderImpl.uuid) != null;
    }
}

