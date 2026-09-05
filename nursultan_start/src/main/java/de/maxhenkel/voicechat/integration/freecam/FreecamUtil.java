/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.PositionalAudioUtils
 *  minecraft.class03386
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.integration.freecam;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.integration.freecam.FreecamMode;
import de.maxhenkel.voicechat.voice.client.PositionalAudioUtils;
import minecraft.class03386;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;

public class FreecamUtil {
    private static final class06202 mc = class06202.Nq();

    public static class06889 getReferencePoint() {
        if ((class04453)FreecamUtil.mc.T_4 == null) {
            return class06889.L;
        }
        return FreecamUtil.isFreecamEnabled() ? ((class04453)FreecamUtil.mc.T_4).method_33571() : ((class03386)FreecamUtil.mc.i_5).s().y();
    }

    public static double getDistanceTo(class06889 class068892) {
        return FreecamUtil.getReferencePoint().R(class068892);
    }

    public static float getDistanceVolume(float f, class06889 class068892) {
        return PositionalAudioUtils.getDistanceVolume((float)f, (class06889)FreecamUtil.getReferencePoint(), (class06889)class068892);
    }

    public static boolean isFreecamEnabled() {
        if ((class04453)FreecamUtil.mc.T_4 == null) {
            return false;
        }
        return ((FreecamMode)((Object)VoicechatClient.CLIENT_CONFIG.freecamMode.get())).equals((Object)FreecamMode.PLAYER) && !((class04453)FreecamUtil.mc.T_4).method_7325() && !((class04453)FreecamUtil.mc.T_4).equals((Object)mc.F());
    }
}

