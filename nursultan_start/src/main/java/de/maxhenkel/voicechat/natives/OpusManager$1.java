/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;

class OpusManager$1 {
    static final /* synthetic */ int[] $SwitchMap$de$maxhenkel$voicechat$api$opus$OpusEncoderMode;

    static {
        $SwitchMap$de$maxhenkel$voicechat$api$opus$OpusEncoderMode = new int[OpusEncoderMode.values().length];
        try {
            OpusManager$1.$SwitchMap$de$maxhenkel$voicechat$api$opus$OpusEncoderMode[OpusEncoderMode.VOIP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusManager$1.$SwitchMap$de$maxhenkel$voicechat$api$opus$OpusEncoderMode[OpusEncoderMode.AUDIO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusManager$1.$SwitchMap$de$maxhenkel$voicechat$api$opus$OpusEncoderMode[OpusEncoderMode.RESTRICTED_LOWDELAY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

