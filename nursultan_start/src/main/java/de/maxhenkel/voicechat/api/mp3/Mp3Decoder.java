/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.mp3;

import java.io.IOException;
import javax.sound.sampled.AudioFormat;

public interface Mp3Decoder {
    public short[] decode() throws IOException;

    public int getBitrate() throws IOException;

    public AudioFormat getAudioFormat() throws IOException;
}

