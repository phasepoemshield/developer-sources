/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.AudioChannel
 *  de.maxhenkel.voicechat.voice.client.speaker.ALSpeaker
 *  de.maxhenkel.voicechat.voice.client.speaker.Speaker
 */
package de.maxhenkel.voicechat.debug;

import de.maxhenkel.voicechat.voice.client.AudioChannel;
import de.maxhenkel.voicechat.voice.client.speaker.ALSpeaker;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import java.util.UUID;

class DebugOverlay$AudioChannelInfo {
    final UUID id;
    int audioBufferSize;
    int audioBufferCount;
    int bufferedPackets;
    int packetReorderingBuffer;
    long lostPackets;

    public DebugOverlay$AudioChannelInfo(UUID uUID) {
        this.id = uUID;
    }

    public DebugOverlay$AudioChannelInfo update(AudioChannel audioChannel) {
        this.audioBufferSize = 32;
        this.audioBufferCount = -1;
        this.bufferedPackets = audioChannel.getQueue().size();
        this.packetReorderingBuffer = audioChannel.getPacketBuffer().getSize();
        this.lostPackets = audioChannel.getLostPackets();
        Speaker speaker = audioChannel.getSpeaker();
        if (speaker instanceof ALSpeaker) {
            ((ALSpeaker)speaker).fetchQueuedBuffersAsync(n -> {
                this.audioBufferCount = n;
            });
        }
        return this;
    }
}

