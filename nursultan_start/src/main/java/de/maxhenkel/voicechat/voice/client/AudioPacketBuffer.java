/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class AudioPacketBuffer {
    private final int packetThreshold;
    @Nullable
    private List<SoundPacket<?>> packetBuffer;
    private long lastSequenceNumber = -1L;
    private boolean isFlushingBuffer;

    public int getSize() {
        if (this.packetBuffer == null) {
            return 0;
        }
        return this.packetBuffer.size();
    }

    public AudioPacketBuffer(int n) {
        this.packetThreshold = n;
        if (n > 0) {
            this.packetBuffer = new ArrayList();
        }
    }

    public void clear() {
        if (this.packetBuffer != null) {
            this.packetBuffer.clear();
        }
        this.lastSequenceNumber = -1L;
        this.isFlushingBuffer = false;
    }

    @Nullable
    public SoundPacket<?> poll(BlockingQueue<SoundPacket<?>> blockingQueue) throws InterruptedException {
        if (this.packetThreshold <= 0) {
            return blockingQueue.poll(10L, TimeUnit.MILLISECONDS);
        }
        SoundPacket<?> soundPacket = this.getNext();
        if (soundPacket != null) {
            return soundPacket;
        }
        soundPacket = blockingQueue.poll(5L, TimeUnit.MILLISECONDS);
        if (soundPacket == null) {
            return null;
        }
        if (soundPacket.getSequenceNumber() == this.lastSequenceNumber + 1L || this.lastSequenceNumber < 0L) {
            this.lastSequenceNumber = soundPacket.getSequenceNumber();
            return soundPacket;
        }
        this.addSorted(soundPacket);
        return null;
    }

    @Nullable
    private SoundPacket<?> getNext() {
        if (this.isFlushingBuffer) {
            if (this.packetBuffer.isEmpty()) {
                this.isFlushingBuffer = false;
                return null;
            }
            return this.getFirstPacket();
        }
        if (this.packetBuffer.size() > this.packetThreshold) {
            return this.getFirstPacket();
        }
        if (!this.packetBuffer.isEmpty()) {
            SoundPacket<?> soundPacket = this.packetBuffer.get(0);
            if (soundPacket.getSequenceNumber() == this.lastSequenceNumber + 1L || this.lastSequenceNumber < 0L) {
                return this.getFirstPacket();
            }
            return null;
        }
        return null;
    }

    private SoundPacket<?> getFirstPacket() {
        SoundPacket<?> soundPacket = this.packetBuffer.remove(0);
        this.lastSequenceNumber = soundPacket.getSequenceNumber();
        return soundPacket;
    }

    private void addSorted(SoundPacket<?> soundPacket) {
        if (soundPacket.getData().length <= 0) {
            this.isFlushingBuffer = true;
        }
        this.packetBuffer.add(soundPacket);
        this.packetBuffer.sort(Comparator.comparingLong(SoundPacket::getSequenceNumber));
    }
}

