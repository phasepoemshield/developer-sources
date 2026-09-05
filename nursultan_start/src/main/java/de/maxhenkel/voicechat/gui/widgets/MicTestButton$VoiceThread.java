/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.MicThread
 *  de.maxhenkel.voicechat.voice.client.MicrophoneException
 *  de.maxhenkel.voicechat.voice.client.SoundManager
 *  de.maxhenkel.voicechat.voice.client.speaker.Speaker
 *  de.maxhenkel.voicechat.voice.client.speaker.SpeakerException
 *  de.maxhenkel.voicechat.voice.client.speaker.SpeakerManager
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import de.maxhenkel.voicechat.voice.client.MicThread;
import de.maxhenkel.voicechat.voice.client.MicrophoneException;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerManager;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class MicTestButton$VoiceThread
extends Thread {
    private final Speaker speaker;
    private boolean running = true;
    private long lastRender;
    private MicThread micThread;
    private boolean usesOwnMicThread;
    @Nullable
    private SoundManager ownSoundManager;
    final /* synthetic */ MicTestButton this$0;

    public MicTestButton$VoiceThread(MicTestButton micTestButton, Consumer<MicrophoneException> consumer) throws SpeakerException {
        SoundManager soundManager;
        this.this$0 = micTestButton;
        this.setDaemon(true);
        this.setName("VoiceTestingThread");
        this.setUncaughtExceptionHandler(new VoicechatUncaughtExceptionHandler());
        MicThread micThread = this.micThread = micTestButton.client != null ? micTestButton.client.getMicThread() : null;
        if (this.micThread == null) {
            this.micThread = new MicThread(micTestButton.client, null, consumer);
            this.usesOwnMicThread = true;
        } else {
            this.micThread.getError(consumer);
        }
        if (micTestButton.client == null) {
            this.ownSoundManager = soundManager = SoundManager.create();
        } else {
            soundManager = micTestButton.client.getSoundManager();
        }
        if (soundManager == null) {
            throw new SpeakerException("No sound manager");
        }
        this.speaker = SpeakerManager.createSpeaker((SoundManager)soundManager, null);
        this.updateLastRender();
        this.setMicLocked(true);
    }

    @Override
    public void run() {
        while (this.running && System.currentTimeMillis() - this.lastRender <= 500L && !this.micThread.isClosed()) {
            short[] sArray = this.this$0.raw ? this.micThread.pollMic() : this.micThread.pollProcessedAudio(true);
            if (sArray == null) continue;
            if (this.this$0.micListener != null) {
                this.this$0.micListener.onMicValue(AudioUtils.getHighestAudioLevel((short[])sArray));
            }
            if (!this.this$0.raw && !this.micThread.shouldTransmitAudio()) continue;
            this.play(sArray);
        }
        this.speaker.close();
        this.setMicLocked(false);
        if (this.this$0.micListener != null) {
            this.this$0.micListener.onStop();
        }
        if (this.usesOwnMicThread) {
            this.micThread.close();
        }
        if (this.ownSoundManager != null) {
            this.ownSoundManager.close();
        }
        this.this$0.setMicActive(false);
        Voicechat.LOGGER.info("Mic test audio channel closed", new Object[0]);
    }

    public void close() {
        if (!this.running) {
            return;
        }
        Voicechat.LOGGER.info("Stopping mic test audio channel", new Object[0]);
        this.running = false;
        try {
            this.join();
        }
        catch (InterruptedException interruptedException) {
            Voicechat.LOGGER.warn("Failed to close microphone", new Object[]{interruptedException});
        }
    }

    public void updateLastRender() {
        this.lastRender = System.currentTimeMillis();
    }

    private void setMicLocked(boolean bl) {
        this.micThread.setMicrophoneLocked(bl);
    }

    private void play(short[] sArray) {
        this.speaker.play(sArray, ((Double)VoicechatClient.CLIENT_CONFIG.voiceChatVolume.get()).floatValue(), null);
    }
}

