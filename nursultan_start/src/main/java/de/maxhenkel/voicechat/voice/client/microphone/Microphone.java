/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.client.microphone;

import de.maxhenkel.voicechat.voice.client.MicrophoneException;

public interface Microphone {
    public boolean isStarted();

    public boolean isOpen();

    public short[] read();

    public void start();

    public void stop();

    public void close();

    public void open() throws MicrophoneException;

    public int available();
}

