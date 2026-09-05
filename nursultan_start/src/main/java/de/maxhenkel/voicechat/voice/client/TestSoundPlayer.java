/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerManager;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TestSoundPlayer {
    private static final AtomicBoolean running = new AtomicBoolean(false);
    private static short[][] testSound;

    public static void playTestSound(Runnable runnable) {
        if (!running.compareAndSet(false, true)) {
            return;
        }
        Thread thread = new Thread(() -> TestSoundPlayer.play(runnable));
        thread.setDaemon(true);
        thread.setName("TestSoundPlayer");
        thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
        thread.start();
    }

    private static short[][] loadTestSound() throws IOException, UnsupportedAudioFileException {
        InputStream inputStream = TestSoundPlayer.class.getResourceAsStream("/assets/voicechat/raw_sounds/test.wav");
        if (inputStream == null) {
            throw new IOException("Failed to load test sound");
        }
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));){
            short[][] sArray;
            try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
                int n;
                byte[] byArray = new byte[8192];
                while ((n = audioInputStream.read(byArray)) != -1) {
                    byteArrayOutputStream.write(byArray, 0, n);
                }
                sArray = TestSoundPlayer.splitIntoFrames(AudioUtils.bytesToShorts(byteArrayOutputStream.toByteArray()));
            }
            return sArray;
        }
    }

    public static short[][] splitIntoFrames(short[] sArray) {
        int n = (sArray.length + 960 - 1) / 960;
        short[][] sArray2 = new short[n][960];
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3 = Math.min(960, sArray.length - n2);
            if (n3 <= 0) continue;
            System.arraycopy(sArray, n2, sArray2[i], 0, n3);
            n2 += n3;
        }
        return sArray2;
    }

    public static synchronized boolean preload() {
        if (testSound != null) {
            return true;
        }
        try {
            testSound = TestSoundPlayer.loadTestSound();
            return true;
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to load test sound", new Object[]{exception});
            testSound = new short[0][0];
            return false;
        }
    }

    public boolean canPlay() {
        return testSound != null && testSound.length > 0;
    }

    private static void play(Runnable runnable) {
        try {
            SoundManager soundManager;
            if (!TestSoundPlayer.preload()) {
                Voicechat.LOGGER.error("Failed to play test sound", new Object[0]);
                return;
            }
            boolean bl = false;
            ClientVoicechat clientVoicechat = ClientManager.getClient();
            if (clientVoicechat != null) {
                soundManager = clientVoicechat.getSoundManager();
                if (soundManager == null) {
                    Voicechat.LOGGER.error("Failed to play test sound - Sound manager not loaded", new Object[0]);
                    return;
                }
            } else {
                soundManager = SoundManager.create();
                bl = true;
            }
            Speaker speaker = SpeakerManager.createSpeaker(soundManager, UUID.randomUUID());
            speaker.open();
            for (short[] sArray : testSound) {
                speaker.play(sArray, 1.0f, null);
                Utils.sleep(20);
            }
            Utils.sleep((Integer)VoicechatClient.CLIENT_CONFIG.outputBufferSize.get() * 20 + 250);
            speaker.close();
            if (bl) {
                soundManager.close();
            }
        }
        catch (Exception exception) {
            Voicechat.LOGGER.error("Failed to play test sound", new Object[]{exception});
        }
        running.set(false);
        runnable.run();
    }
}

