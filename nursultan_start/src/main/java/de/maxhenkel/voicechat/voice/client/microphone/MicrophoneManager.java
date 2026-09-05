/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Platform
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 */
package de.maxhenkel.voicechat.voice.client.microphone;

import com.sun.jna.Platform;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.voice.client.MicrophoneException;
import de.maxhenkel.voicechat.voice.client.microphone.ALMicrophone;
import de.maxhenkel.voicechat.voice.client.microphone.JavaxMicrophone;
import de.maxhenkel.voicechat.voice.client.microphone.Microphone;
import java.util.List;

public class MicrophoneManager {
    private static boolean fallback;
    private static Boolean forceJavaImplementation;

    static {
        forceJavaImplementation = null;
    }

    public static boolean useJavaImplementation() {
        if (MicrophoneManager.shouldForceJavaImplementation()) {
            return true;
        }
        return fallback || (Boolean)VoicechatClient.CLIENT_CONFIG.javaMicrophoneImplementation.get() != false;
    }

    private static Microphone createJavaMicrophone() throws MicrophoneException {
        JavaxMicrophone javaxMicrophone = new JavaxMicrophone(48000, 960, (String)VoicechatClient.CLIENT_CONFIG.microphone.get());
        javaxMicrophone.open();
        return javaxMicrophone;
    }

    public static List<String> deviceNames() {
        if (MicrophoneManager.useJavaImplementation()) {
            return JavaxMicrophone.getAllMicrophones();
        }
        return ALMicrophone.getAllMicrophones();
    }

    private static Microphone createALMicrophone() throws MicrophoneException {
        ALMicrophone aLMicrophone = new ALMicrophone(48000, 960, (String)VoicechatClient.CLIENT_CONFIG.microphone.get());
        aLMicrophone.open();
        return aLMicrophone;
    }

    public static boolean canUseOpenAL() {
        return !Platform.isMac();
    }

    public static Microphone createMicrophone() throws MicrophoneException {
        Microphone microphone;
        if (MicrophoneManager.useJavaImplementation()) {
            microphone = MicrophoneManager.createJavaMicrophone();
        } else {
            try {
                microphone = MicrophoneManager.createALMicrophone();
            }
            catch (MicrophoneException microphoneException) {
                Voicechat.LOGGER.warn("Failed to use OpenAL microphone implementation", new Object[]{microphoneException});
                Voicechat.LOGGER.warn("Falling back to Java microphone implementation", new Object[0]);
                microphone = MicrophoneManager.createJavaMicrophone();
                fallback = true;
            }
        }
        return microphone;
    }

    private static boolean shouldForceJavaImplementation() {
        if (forceJavaImplementation == null && (forceJavaImplementation = Boolean.valueOf(!MicrophoneManager.canUseOpenAL())).booleanValue()) {
            Voicechat.LOGGER.info("OpenAL microphones are not properly supported on this platform, falling back to Java microphone implementation", new Object[0]);
        }
        return forceJavaImplementation;
    }
}

