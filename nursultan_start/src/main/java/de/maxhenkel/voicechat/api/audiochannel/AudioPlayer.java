/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiochannel;

public interface AudioPlayer {
    public boolean isStopped();

    public boolean isStarted();

    public boolean isPlaying();

    public void stopPlaying();

    public void startPlaying();

    public void setOnStopped(Runnable var1);
}

