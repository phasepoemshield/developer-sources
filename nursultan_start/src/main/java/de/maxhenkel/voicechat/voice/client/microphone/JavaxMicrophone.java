/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client.microphone;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.voice.client.MicrophoneException;
import de.maxhenkel.voicechat.voice.client.microphone.Microphone;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.TargetDataLine;

public class JavaxMicrophone
implements Microphone {
    private final int sampleRate;
    @Nullable
    private final String deviceName;
    private final int bufferSize;
    @Nullable
    private TargetDataLine mic;

    @Override
    public boolean isStarted() {
        if (this.mic == null) {
            return false;
        }
        return this.mic.isActive();
    }

    public JavaxMicrophone(int n, int n2, @Nullable String string) {
        this.sampleRate = n;
        this.deviceName = string;
        this.bufferSize = n2;
    }

    @Override
    public boolean isOpen() {
        if (this.mic == null) {
            return false;
        }
        return this.mic.isOpen();
    }

    @Override
    public short[] read() {
        if (this.mic == null) {
            throw new IllegalStateException("Microphone was not opened");
        }
        int n = this.available();
        if (this.bufferSize > n) {
            throw new IllegalStateException(String.format("Failed to read from microphone: Capacity %s, available %s", this.bufferSize, n));
        }
        byte[] byArray = new byte[this.bufferSize * 2];
        this.mic.read(byArray, 0, byArray.length);
        return AudioUtils.bytesToShorts(byArray);
    }

    @Override
    public void start() {
        if (!this.isOpen() || this.mic == null) {
            return;
        }
        this.mic.start();
    }

    @Override
    public void stop() {
        if (!this.isOpen() || this.mic == null) {
            return;
        }
        this.mic.stop();
        this.mic.flush();
    }

    @Override
    public void close() {
        if (this.mic == null) {
            return;
        }
        this.mic.stop();
        this.mic.flush();
        this.mic.close();
    }

    @Override
    public void open() throws MicrophoneException {
        if (this.isOpen()) {
            throw new MicrophoneException("Microphone already open");
        }
        AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, this.sampleRate, 16, 1, 2, this.sampleRate, false);
        this.mic = JavaxMicrophone.getMicrophoneByName(audioFormat, this.deviceName);
        if (this.mic == null) {
            if (this.deviceName != null) {
                Voicechat.LOGGER.warn("Failed to open microphone '{}', falling back to default microphone", new Object[]{this.deviceName});
            }
            this.mic = JavaxMicrophone.getDefaultMicrophone(audioFormat);
        }
        if (this.mic == null) {
            throw new MicrophoneException("Could not find any microphone with the specified audio format");
        }
        try {
            this.mic.open(audioFormat);
        }
        catch (LineUnavailableException lineUnavailableException) {
            throw new MicrophoneException(lineUnavailableException);
        }
        this.mic.start();
        this.mic.stop();
        this.mic.flush();
    }

    @Override
    public int available() {
        if (this.mic == null) {
            return 0;
        }
        return this.mic.available() / 2;
    }

    @Nullable
    private static TargetDataLine getMicrophoneByName(AudioFormat audioFormat, @Nullable String string) {
        return JavaxMicrophone.getDeviceByName(TargetDataLine.class, audioFormat, string);
    }

    private static TargetDataLine getDefaultMicrophone(AudioFormat audioFormat) throws MicrophoneException {
        return JavaxMicrophone.getDefaultDevice(TargetDataLine.class, audioFormat);
    }

    private static <T> T getDefaultDevice(Class<T> clazz, AudioFormat audioFormat) throws MicrophoneException {
        DataLine.Info info = new DataLine.Info(clazz, audioFormat);
        try {
            return clazz.cast(AudioSystem.getLine(info));
        }
        catch (Exception exception) {
            throw new MicrophoneException(exception);
        }
    }

    @Nullable
    private static <T> T getDeviceByName(Class<T> clazz, AudioFormat audioFormat, @Nullable String string) {
        Mixer.Info[] infoArray;
        for (Mixer.Info info : infoArray = AudioSystem.getMixerInfo()) {
            DataLine.Info info2;
            Mixer mixer = AudioSystem.getMixer(info);
            if (!mixer.isLineSupported(info2 = new DataLine.Info(clazz, audioFormat)) || !info.getName().equals(string)) continue;
            try {
                return clazz.cast(mixer.getLine(info2));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    private static List<String> getDeviceNames(Class<?> clazz, AudioFormat audioFormat) {
        Mixer.Info[] infoArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Mixer.Info info : infoArray = AudioSystem.getMixerInfo()) {
            DataLine.Info info2;
            Mixer mixer = AudioSystem.getMixer(info);
            if (!mixer.isLineSupported(info2 = new DataLine.Info(clazz, audioFormat))) continue;
            arrayList.add(info.getName());
        }
        return arrayList;
    }

    private static List<String> getAllMicrophones(AudioFormat audioFormat) {
        return JavaxMicrophone.getDeviceNames(TargetDataLine.class, audioFormat);
    }

    public static List<String> getAllMicrophones() {
        return JavaxMicrophone.getAllMicrophones(new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 48000.0f, 16, 1, 2, 48000.0f, false));
    }
}

