/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder$Application
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.OpusEncoder;

class JavaOpusEncoderImpl$1 {
    static final /* synthetic */ int[] $SwitchMap$de$maxhenkel$opus4j$OpusEncoder$Application;

    static {
        $SwitchMap$de$maxhenkel$opus4j$OpusEncoder$Application = new int[OpusEncoder.Application.values().length];
        try {
            JavaOpusEncoderImpl$1.$SwitchMap$de$maxhenkel$opus4j$OpusEncoder$Application[OpusEncoder.Application.VOIP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            JavaOpusEncoderImpl$1.$SwitchMap$de$maxhenkel$opus4j$OpusEncoder$Application[OpusEncoder.Application.AUDIO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            JavaOpusEncoderImpl$1.$SwitchMap$de$maxhenkel$opus4j$OpusEncoder$Application[OpusEncoder.Application.LOW_DELAY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

