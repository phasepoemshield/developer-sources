/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 *  javax.annotation.Nullable
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL11
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC11
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.ALCapabilities
 *  org.lwjgl.openal.ALUtil
 *  org.lwjgl.openal.EXTThreadLocalContext
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL11;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.openal.EXTThreadLocalContext;

public class SoundManager {
    @Nullable
    private final String deviceName;
    private long device;
    private long context;
    private final ALCCapabilities alcCaps;
    private final ALCapabilities alCaps;
    private final float maxGain;
    private static final Pattern DEVICE_NAME = Pattern.compile("^(?:OpenAL.+?on )?(.*)$");

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static SoundManager create(@Nullable String string) throws SpeakerException {
        SoundManager soundManager;
        long l = ALC11.alcGetCurrentContext();
        long l2 = l != 0L ? ALC11.alcGetContextsDevice((long)l) : 0L;
        try {
            float f;
            long l3 = SoundManager.openSpeaker(string);
            long l4 = ALC11.alcCreateContext((long)l3, (IntBuffer)null);
            if (l4 == 0L) {
                int n = ALC11.alcGetError((long)l3);
                ALC11.alcCloseDevice((long)l3);
                SoundManager.checkAlcError(l3);
                throw new SpeakerException(String.format("Failed to create OpenAL context: %s", SoundManager.getAlcError(n)));
            }
            if (!ALC11.alcMakeContextCurrent((long)l4)) {
                int n = ALC11.alcGetError((long)l3);
                ALC11.alcDestroyContext((long)l4);
                SoundManager.checkAlcError(l3);
                ALC11.alcCloseDevice((long)l3);
                SoundManager.checkAlcError(l3);
                throw new SpeakerException(String.format("Failed to make OpenAL context current: %s", SoundManager.getAlcError(n)));
            }
            ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)l3);
            ALCapabilities aLCapabilities = AL.createCapabilities((ALCCapabilities)aLCCapabilities);
            if (aLCapabilities.AL_SOFT_gain_clamp_ex) {
                f = AL11.alGetFloat((int)8206);
                SoundManager.checkAlcError(l3);
            } else {
                f = 1.0f;
                Voicechat.LOGGER.warn("OpenAL extension 'AL_SOFT_gain_clamp_ex' not supported - Voice chat volume can't exceed 100%", new Object[0]);
            }
            ClientPluginManager.instance().onCreateALContext(l4, l3);
            soundManager = new SoundManager(string, l3, l4, aLCCapabilities, aLCapabilities, f);
        }
        catch (SpeakerException speakerException) {
            try {
                throw speakerException;
                catch (Throwable throwable) {
                    throw new SpeakerException("Failed to initialize OpenAL context", throwable);
                }
            }
            catch (Throwable throwable) {
                try {
                    if (l == 0L) throw throwable;
                    if (ALC11.alcMakeContextCurrent((long)l)) {
                        if (l2 == 0L) throw throwable;
                        ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)l2);
                        AL.createCapabilities((ALCCapabilities)aLCCapabilities);
                        throw throwable;
                    }
                    if (l2 != 0L) {
                        int n = ALC11.alcGetError((long)l2);
                        Voicechat.LOGGER.error("Failed to restore previous OpenAL context ({}): {}", new Object[]{l, SoundManager.getAlcError(n)});
                        throw throwable;
                    }
                    Voicechat.LOGGER.error("Failed to restore previous OpenAL context ({}): Device not found", new Object[]{l});
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    Voicechat.LOGGER.warn("Failed to restore previous OpenAL context", new Object[]{throwable2});
                }
                throw throwable;
            }
        }
        try {
            if (l == 0L) return soundManager;
            if (ALC11.alcMakeContextCurrent((long)l)) {
                if (l2 == 0L) return soundManager;
                ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)l2);
                AL.createCapabilities((ALCCapabilities)aLCCapabilities);
                return soundManager;
            }
            if (l2 != 0L) {
                int n = ALC11.alcGetError((long)l2);
                Voicechat.LOGGER.error("Failed to restore previous OpenAL context ({}): {}", new Object[]{l, SoundManager.getAlcError(n)});
                return soundManager;
            }
            Voicechat.LOGGER.error("Failed to restore previous OpenAL context ({}): Device not found", new Object[]{l});
            return soundManager;
        }
        catch (Throwable throwable) {
            Voicechat.LOGGER.warn("Failed to restore previous OpenAL context", new Object[]{throwable});
        }
        return soundManager;
    }

    public static SoundManager create() throws SpeakerException {
        return SoundManager.create((String)VoicechatClient.CLIENT_CONFIG.speaker.get());
    }

    public SoundManager(@Nullable String string, long l, long l2, ALCCapabilities aLCCapabilities, ALCapabilities aLCapabilities, float f) {
        this.deviceName = string;
        this.device = l;
        this.context = l2;
        this.alcCaps = aLCCapabilities;
        this.alCaps = aLCapabilities;
        this.maxGain = f;
    }

    public void close() {
        if (!this.isClosed()) {
            ClientPluginManager.instance().onDestroyALContext(this.context, this.device);
        }
        if (this.context != 0L) {
            ALC11.alcDestroyContext((long)this.context);
            SoundManager.checkAlcError(this.device);
        }
        if (this.device != 0L && !ALC11.alcCloseDevice((long)this.device)) {
            SoundManager.checkAlcError(this.device);
        }
        this.context = 0L;
        this.device = 0L;
    }

    public float getMaxGain() {
        return this.maxGain;
    }

    public boolean isClosed() {
        return this.context == 0L || this.device == 0L;
    }

    public static String cleanDeviceName(String string) {
        Matcher matcher = DEVICE_NAME.matcher(string);
        if (!matcher.matches()) {
            return string;
        }
        return matcher.group(1);
    }

    public static List<String> getAllSpeakers() {
        List list = null;
        if (SoundManager.canEnumerateAll()) {
            list = ALUtil.getStringList((long)0L, (int)4115);
        } else {
            Voicechat.LOGGER.warn("Extension ALC_ENUMERATE_ALL_EXT is not present", new Object[0]);
        }
        boolean bl = SoundManager.canEnumerate();
        if (list == null && !bl) {
            Voicechat.LOGGER.warn("Extension ALC_ENUMERATION_EXT is not present", new Object[0]);
        }
        if (list == null && bl) {
            list = ALUtil.getStringList((long)0L, (int)4101);
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    public static boolean checkAlcError(long l) {
        int n = ALC11.alcGetError((long)l);
        if (n == 0) {
            return false;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        Voicechat.LOGGER.error("Voicechat sound manager ALC error: {}.{}[{}] {}", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), SoundManager.getAlcError(n)});
        return true;
    }

    private static long tryOpenSpeaker(@Nullable String string) throws SpeakerException {
        long l = ALC11.alcOpenDevice((CharSequence)string);
        if (l == 0L) {
            throw new SpeakerException(String.format("Failed to open audio device: Audio device '%s' not found", string));
        }
        int n = ALC11.alcGetError((long)l);
        if (n != 0) {
            if (!ALC11.alcCloseDevice((long)l)) {
                Voicechat.LOGGER.warn("Failed to close audio device", new Object[0]);
            }
            throw new SpeakerException(String.format("Failed to open audio device: %s", SoundManager.getAlcError(n)));
        }
        return l;
    }

    private static long openSpeaker(@Nullable String string) throws SpeakerException {
        try {
            return SoundManager.tryOpenSpeaker(string);
        }
        catch (SpeakerException speakerException) {
            if (string == null) {
                throw speakerException;
            }
            Voicechat.LOGGER.warn("Failed to open audio device '{}', falling back to default", new Object[]{string});
            return SoundManager.tryOpenSpeaker(null);
        }
    }

    public void closeContext() {
        EXTThreadLocalContext.alcSetThreadContext((long)0L);
        SoundManager.checkAlcError(this.device);
    }

    public boolean openContext() {
        if (this.context == 0L) {
            return false;
        }
        boolean bl = EXTThreadLocalContext.alcSetThreadContext((long)this.context);
        SoundManager.checkAlcError(this.device);
        return bl;
    }

    public static String getAlcError(int n) {
        switch (n) {
            case 40961: {
                return "Invalid device";
            }
            case 40962: {
                return "Invalid context";
            }
            case 40963: {
                return "Invalid enum";
            }
            case 40964: {
                return "Invalid value";
            }
            case 40965: {
                return "Out of memory";
            }
        }
        return "Unknown error";
    }

    public void runInContext(Executor executor, Runnable runnable) {
        long l = System.currentTimeMillis();
        executor.execute(() -> {
            long l2 = System.currentTimeMillis() - l;
            if (l2 > 20L || l2 >= 5L && Voicechat.debugMode()) {
                Voicechat.LOGGER.warn("Sound executor delay: {} ms!", new Object[]{l2});
            }
            if (this.openContext()) {
                runnable.run();
                this.closeContext();
            }
        });
    }

    public static boolean checkAlError() {
        int n = AL11.alGetError();
        if (n == 0) {
            return false;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        Voicechat.LOGGER.error("Voicechat sound manager AL error: {}.{}[{}] {}", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), SoundManager.getAlError(n)});
        return true;
    }

    public static boolean canEnumerateAll() {
        return ALC11.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATE_ALL_EXT");
    }

    public static boolean canEnumerate() {
        return ALC11.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATION_EXT");
    }

    public static String getAlError(int n) {
        switch (n) {
            case 40961: {
                return "Invalid name";
            }
            case 40962: {
                return "Invalid enum ";
            }
            case 40963: {
                return "Invalid value";
            }
            case 40964: {
                return "Invalid operation";
            }
            case 40965: {
                return "Out of memory";
            }
        }
        return String.format("Error %#X", n);
    }
}

