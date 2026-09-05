/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.OpusBandwidth;

class OpusEncoder$1 {
    static final /* synthetic */ int[] $SwitchMap$org$concentus$OpusBandwidth;

    static {
        $SwitchMap$org$concentus$OpusBandwidth = new int[OpusBandwidth.values().length];
        try {
            OpusEncoder$1.$SwitchMap$org$concentus$OpusBandwidth[OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusEncoder$1.$SwitchMap$org$concentus$OpusBandwidth[OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusEncoder$1.$SwitchMap$org$concentus$OpusBandwidth[OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusEncoder$1.$SwitchMap$org$concentus$OpusBandwidth[OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OpusEncoder$1.$SwitchMap$org$concentus$OpusBandwidth[OpusBandwidth.OPUS_BANDWIDTH_FULLBAND.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

