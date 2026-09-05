/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  javax.annotation.Nullable
 *  minecraft.class03386
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07109
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.voice.client.speaker.AudioType;
import de.maxhenkel.voicechat.voice.common.Utils;
import javax.annotation.Nullable;
import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07109;

public class PositionalAudioUtils {
    private static final class06202 mc = class06202.Nq();

    private static float[] getStereoVolume(class06889 class068892, float f, class06889 class068893) {
        float f2;
        class06889 class068894 = class068893.u(class068892).u();
        class07109 class071092 = new class07109((float)class068894.M, (float)class068894.Z);
        float f3 = Utils.angle(class071092, new class07109(-1.0f, 0.0f));
        float f4 = Utils.normalizeAngle(f3 - f % 360.0f);
        float f5 = (float)(Math.abs(class068892.B - class068893.B) / 32.0);
        float f6 = f2 = f4 / 180.0f;
        if (f2 < -0.5f) {
            f6 = -(0.5f + (f2 + 0.5f));
        } else if (f2 > 0.5f) {
            f6 = 0.5f - (f2 - 0.5f);
        }
        float f7 = 0.3f;
        float f8 = f6 < 0.0f ? Math.abs((f6 *= 1.0f - f5) * 1.4f) + f7 : f7;
        float f9 = f6 >= 0.0f ? f6 * 1.4f + f7 : f7;
        float f10 = 1.0f - Math.max(f8, f9);
        return new float[]{f8 += f10, f9 += f10};
    }

    private static float[] getStereoVolume(class06889 class068892) {
        class05363 class053632 = ((class03386)PositionalAudioUtils.mc.i_5).s();
        return PositionalAudioUtils.getStereoVolume(class053632.y(), class053632.R(), class068892);
    }

    public static float getDistanceVolume(float f, class06889 class068892) {
        return PositionalAudioUtils.getDistanceVolume(f, ((class03386)PositionalAudioUtils.mc.i_5).s().y(), class068892);
    }

    public static float getDistanceVolume(float f, class06889 class068892, class06889 class068893) {
        float f2 = (float)class068893.R(class068892);
        f2 = Math.min(f2, f);
        return 1.0f - f2 / f;
    }

    private static short[] convertToStereo(short[] sArray, float f, float f2) {
        short[] sArray2 = new short[sArray.length * 2];
        for (int i = 0; i < sArray.length; ++i) {
            short s = (short)((float)sArray[i] * f);
            short s2 = (short)((float)sArray[i] * f2);
            sArray2[i * 2] = s;
            sArray2[i * 2 + 1] = s2;
        }
        return sArray2;
    }

    private static short[] convertToStereo(short[] sArray, float[] fArray) {
        return PositionalAudioUtils.convertToStereo(sArray, fArray[0], fArray[1]);
    }

    public static short[] convertToStereo(short[] sArray, float f) {
        return PositionalAudioUtils.convertToStereo(sArray, f, f);
    }

    public static short[] convertToStereo(short[] sArray, @Nullable class06889 class068892) {
        if (class068892 == null) {
            return PositionalAudioUtils.convertToStereo(sArray);
        }
        return PositionalAudioUtils.convertToStereo(sArray, PositionalAudioUtils.getStereoVolume(class068892));
    }

    public static short[] convertToStereo(short[] sArray, class06889 class068892, float f, @Nullable class06889 class068893) {
        if (class068893 == null) {
            return PositionalAudioUtils.convertToStereo(sArray);
        }
        return PositionalAudioUtils.convertToStereo(sArray, PositionalAudioUtils.getStereoVolume(class068892, f, class068893));
    }

    public static short[] convertToStereo(short[] sArray) {
        short[] sArray2 = new short[sArray.length * 2];
        for (int i = 0; i < sArray.length; ++i) {
            sArray2[i * 2] = sArray[i];
            sArray2[i * 2 + 1] = sArray[i];
        }
        return sArray2;
    }

    public static short[] convertToStereoForRecording(float f, class06889 class068892, short[] sArray, float f2) {
        return PositionalAudioUtils.convertToStereoForRecording(f, ((class03386)PositionalAudioUtils.mc.i_5).s().y(), ((class03386)PositionalAudioUtils.mc.i_5).s().R(), class068892, sArray, f2);
    }

    public static short[] convertToStereoForRecording(float f, class06889 class068892, float f2, class06889 class068893, short[] sArray, float f3) {
        float f4 = PositionalAudioUtils.getDistanceVolume(f, class068892, class068893) * f3;
        if (!((AudioType)((Object)VoicechatClient.CLIENT_CONFIG.audioType.get())).equals((Object)AudioType.OFF)) {
            float[] fArray = PositionalAudioUtils.getStereoVolume(class068892, f2, class068893);
            return PositionalAudioUtils.convertToStereo(sArray, f4 * fArray[0], f4 * fArray[1]);
        }
        return PositionalAudioUtils.convertToStereo(sArray, f4, f4);
    }

    public static short[] convertToStereoForRecording(float f, class06889 class068892, float f2, class06889 class068893, short[] sArray) {
        return PositionalAudioUtils.convertToStereoForRecording(f, class068892, f2, class068893, sArray, 1.0f);
    }

    public static short[] convertToStereoForRecording(float f, class06889 class068892, short[] sArray) {
        return PositionalAudioUtils.convertToStereoForRecording(f, ((class03386)PositionalAudioUtils.mc.i_5).s().y(), ((class03386)PositionalAudioUtils.mc.i_5).s().R(), class068892, sArray);
    }
}

