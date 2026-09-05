/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC10
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.slf4j.Logger;

public class class06283 {
    private static final Logger N = LogUtils.getLogger();

    private static String y(int n) {
        switch (n) {
            case 40961: {
                return "Invalid device.";
            }
            case 40962: {
                return "Invalid context.";
            }
            case 40964: {
                return "Invalid value.";
            }
            case 40963: {
                return "Illegal enum.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
        }
        return "An unrecognized error occurred.";
    }

    static boolean N(String string) {
        int n = AL10.alGetError();
        if (n != 0) {
            N.error("{}: {}", (Object)string, (Object)class06283.N(n));
            return true;
        }
        return false;
    }

    static int N(AudioFormat audioFormat) {
        AudioFormat.Encoding encoding = audioFormat.getEncoding();
        int n = audioFormat.getChannels();
        int n2 = audioFormat.getSampleSizeInBits();
        if (encoding.equals(AudioFormat.Encoding.PCM_UNSIGNED) || encoding.equals(AudioFormat.Encoding.PCM_SIGNED)) {
            if (n == 1) {
                if (n2 == 8) {
                    return 4352;
                }
                if (n2 == 16) {
                    return 4353;
                }
            } else if (n == 2) {
                if (n2 == 8) {
                    return 4354;
                }
                if (n2 == 16) {
                    return 4355;
                }
            }
        }
        throw new IllegalArgumentException("Invalid audio format: " + String.valueOf(audioFormat));
    }

    static boolean N(long l, String string) {
        int n = ALC10.alcGetError((long)l);
        if (n != 0) {
            N.error("{} ({}): {}", new Object[]{string, l, class06283.y(n)});
            return true;
        }
        return false;
    }

    private static String N(int n) {
        switch (n) {
            case 40961: {
                return "Invalid name parameter.";
            }
            case 40962: {
                return "Invalid enumerated parameter value.";
            }
            case 40963: {
                return "Invalid parameter parameter value.";
            }
            case 40964: {
                return "Invalid operation.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
        }
        return "An unrecognized error occurred.";
    }
}

