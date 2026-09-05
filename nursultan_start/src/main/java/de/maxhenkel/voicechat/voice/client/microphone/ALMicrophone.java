/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  javax.annotation.Nullable
 *  org.lwjgl.openal.AL11
 *  org.lwjgl.openal.ALC11
 *  org.lwjgl.openal.ALUtil
 */
package de.maxhenkel.voicechat.voice.client.microphone;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.util.Version;
import de.maxhenkel.voicechat.voice.client.MicrophoneException;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.microphone.Microphone;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.lwjgl.openal.AL11;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALUtil;

public class ALMicrophone
implements Microphone {
    private final int sampleRate;
    @Nullable
    private final String deviceName;
    private long device;
    private final int bufferSize;
    private boolean captureStereo;
    private boolean started;
    private static Boolean alStereoWorkaround = null;

    @Override
    public boolean isStarted() {
        return this.started;
    }

    public ALMicrophone(int n, int n2, @Nullable String string) {
        this.sampleRate = n;
        this.deviceName = string;
        this.bufferSize = n2;
    }

    @Override
    public boolean isOpen() {
        return this.device != 0L;
    }

    @Override
    public short[] read() {
        int n = this.available();
        if (this.bufferSize > n) {
            throw new IllegalStateException(String.format("Failed to read from microphone: Capacity %s, available %s", this.bufferSize, n));
        }
        float[] fArray = new float[this.captureStereo ? this.bufferSize * 2 : this.bufferSize];
        ALC11.alcCaptureSamples((long)this.device, (float[])fArray, (int)this.bufferSize);
        SoundManager.checkAlcError(this.device);
        if (this.captureStereo) {
            return AudioUtils.stereoFloatsToMonoShortsNormalized(fArray);
        }
        return AudioUtils.floatsToShortsNormalized(fArray);
    }

    @Override
    public void start() {
        if (!this.isOpen()) {
            return;
        }
        if (this.started) {
            return;
        }
        ALC11.alcCaptureStart((long)this.device);
        SoundManager.checkAlcError(this.device);
        this.started = true;
    }

    @Override
    public void stop() {
        if (!this.isOpen()) {
            return;
        }
        if (!this.started) {
            return;
        }
        ALC11.alcCaptureStop((long)this.device);
        SoundManager.checkAlcError(this.device);
        this.started = false;
        int n = this.available();
        float[] fArray = new float[this.captureStereo ? n * 2 : n];
        ALC11.alcCaptureSamples((long)this.device, (float[])fArray, (int)n);
        SoundManager.checkAlcError(this.device);
        Voicechat.LOGGER.debug("Clearing {} samples", new Object[]{n});
    }

    @Override
    public void close() {
        if (!this.isOpen()) {
            return;
        }
        this.stop();
        if (!ALC11.alcCaptureCloseDevice((long)this.device)) {
            SoundManager.checkAlcError(this.device);
        }
        this.device = 0L;
    }

    @Override
    public void open() throws MicrophoneException {
        if (this.isOpen()) {
            throw new MicrophoneException("Microphone already open");
        }
        if (!ALMicrophone.canCapture()) {
            throw new MicrophoneException("Extension 'ALC_EXT_CAPTURE' not supported");
        }
        this.captureStereo = ALMicrophone.useStereoWorkaround();
        this.device = this.openMic(this.deviceName);
    }

    @Override
    public int available() {
        int n = ALC11.alcGetInteger((long)this.device, (int)786);
        SoundManager.checkAlcError(this.device);
        return n;
    }

    private static boolean useStereoWorkaround() {
        if (alStereoWorkaround == null && (alStereoWorkaround = Boolean.valueOf(ALMicrophone.shouldUseStereoWorkaround())).booleanValue()) {
            Voicechat.LOGGER.info("Using stereo workaround for OpenAL microphones", new Object[0]);
        }
        return alStereoWorkaround;
    }

    private static boolean shouldUseStereoWorkaround() {
        String string = AL11.alGetString((int)45058);
        if (string == null) {
            Voicechat.LOGGER.warn("Failed to get OpenAL version - assuming stereo workaround is required", new Object[0]);
            return true;
        }
        Voicechat.LOGGER.debug("OpenAL version: {}", new Object[]{string});
        Version version = Version.fromOpenALVersion(string);
        if (version == null) {
            Voicechat.LOGGER.warn("Failed to parse OpenAL version - assuming stereo workaround is required", new Object[0]);
            return true;
        }
        return version.compareTo(new Version(1, 25, 0)) >= 0 && new Version(1, 25, 1).compareTo(version) <= 0;
    }

    public static List<String> getAllMicrophones() {
        if (!ALMicrophone.canCapture()) {
            Voicechat.LOGGER.warn("Extension ALC_EXT_CAPTURE is not present", new Object[0]);
            return Collections.emptyList();
        }
        if (!ALMicrophone.canEnumerate()) {
            Voicechat.LOGGER.warn("Extension ALC_ENUMERATION_EXT is not present", new Object[0]);
            return Collections.emptyList();
        }
        List list = ALUtil.getStringList((long)0L, (int)784);
        if (list == null) {
            Voicechat.LOGGER.warn("Failed to list available microphones", new Object[0]);
            return Collections.emptyList();
        }
        return list;
    }

    public static boolean canEnumerate() {
        return ALC11.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATION_EXT");
    }

    private long tryOpenMic(@Nullable String string) throws MicrophoneException {
        long l = ALC11.alcCaptureOpenDevice((CharSequence)string, (int)this.sampleRate, (int)(this.captureStereo ? 65553 : 65552), (int)this.bufferSize);
        if (l == 0L) {
            throw new MicrophoneException("Failed to open microphone");
        }
        SoundManager.checkAlcError(l);
        return l;
    }

    public static boolean canCapture() {
        return ALC11.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_EXT_CAPTURE");
    }

    private long openMic(@Nullable String string) throws MicrophoneException {
        try {
            return this.tryOpenMic(string);
        }
        catch (MicrophoneException microphoneException) {
            if (string == null) {
                throw microphoneException;
            }
            Voicechat.LOGGER.warn("Failed to open microphone '{}', falling back to default microphone", new Object[]{string});
            return this.tryOpenMic(null);
        }
    }
}

