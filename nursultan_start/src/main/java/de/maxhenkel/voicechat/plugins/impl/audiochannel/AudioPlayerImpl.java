/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.audiochannel.AudioChannel
 *  de.maxhenkel.voicechat.api.audiochannel.AudioPlayer
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.audiochannel.AudioChannel;
import de.maxhenkel.voicechat.api.audiochannel.AudioPlayer;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import java.util.function.Supplier;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AudioPlayerImpl
extends Thread
implements AudioPlayer {
    private static final long FRAME_SIZE_NS = 20000000L;
    private final AudioChannel audioChannel;
    private final OpusEncoder encoder;
    private final Supplier<short[]> audioSupplier;
    private boolean started;
    @Nullable
    private Runnable onStopped;

    public boolean isStopped() {
        return this.started && !this.isAlive();
    }

    public boolean isStarted() {
        return this.started;
    }

    public AudioPlayerImpl(AudioChannel audioChannel, @Nonnull OpusEncoder opusEncoder, Supplier<short[]> supplier) {
        this.audioChannel = audioChannel;
        this.encoder = opusEncoder;
        this.audioSupplier = supplier;
        this.setDaemon(true);
        this.setName("AudioPlayer-%s".formatted(new Object[]{audioChannel.getId()}));
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
    }

    @Override
    public void run() {
        short[] sArray;
        int n = 0;
        long l = System.nanoTime();
        while ((sArray = this.audioSupplier.get()) != null) {
            if (sArray.length != 960) {
                Object[] objectArray = new Object[2];
                objectArray[0] = sArray.length;
                objectArray[1] = 960;
                Voicechat.LOGGER.error("Got invalid audio frame size {}!={}", objectArray);
                break;
            }
            this.audioChannel.send(this.encoder.encode(sArray));
            long l2 = l + (long)(++n) * 20000000L;
            long l3 = l2 - System.nanoTime();
            try {
                if (l3 <= 0L) continue;
                Thread.sleep(l3 / 1000000L, (int)(l3 % 1000000L));
            }
            catch (InterruptedException interruptedException) {
                break;
            }
        }
        this.encoder.close();
        this.audioChannel.flush();
        if (this.onStopped != null) {
            this.onStopped.run();
        }
    }

    public boolean isPlaying() {
        return this.isAlive();
    }

    public void stopPlaying() {
        this.interrupt();
    }

    public void startPlaying() {
        if (this.started) {
            return;
        }
        this.start();
        this.started = true;
    }

    public void setOnStopped(Runnable runnable) {
        this.onStopped = runnable;
    }
}

