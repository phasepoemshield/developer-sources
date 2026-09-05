/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.lame4j.ShortArrayBuffer
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.lame4j.ShortArrayBuffer;
import de.maxhenkel.voicechat.voice.client.AudioRecorder;
import java.io.IOException;

class AudioRecorder$AudioChunk {
    final long timestamp;
    private final ShortArrayBuffer buffer;
    long endTimestamp;
    final /* synthetic */ AudioRecorder this$0;

    public AudioRecorder$AudioChunk(AudioRecorder audioRecorder, long l) {
        this.this$0 = audioRecorder;
        this.timestamp = l;
        this.endTimestamp = l;
        this.buffer = new ShortArrayBuffer();
    }

    public void add(short[] sArray, long l) throws IOException {
        this.buffer.writeShorts(sArray);
        this.endTimestamp = l + this.getDuration(sArray.length);
    }

    public short[] getData() {
        return this.buffer.toShortArray();
    }

    public long getDuration() {
        return this.endTimestamp - this.timestamp;
    }

    private long getDuration(int n) {
        long l = (long)n * 1000L / (long)this.this$0.stereoFormat.getChannels();
        return (long)((double)l / (double)this.this$0.stereoFormat.getSampleRate());
    }
}

