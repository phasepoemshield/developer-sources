/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;
import de.maxhenkel.voicechat.concentus.SilkTables;

class LTPScaleControl {
    LTPScaleControl() {
    }

    static void silk_LTP_scale_ctrl(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, int n) {
        if (n == 0) {
            int n2 = silkChannelEncoder.PacketLoss_perc + silkChannelEncoder.nFramesPerPacket;
            silkChannelEncoder.indices.LTP_scaleIndex = (byte)Inlines.silk_LIMIT((int)Inlines.silk_SMULWB((int)Inlines.silk_SMULBB((int)n2, (int)silkEncoderControl.LTPredCodGain_Q7), (int)51), (int)0, (int)2);
        } else {
            silkChannelEncoder.indices.LTP_scaleIndex = 0;
        }
        silkEncoderControl.LTP_scale_Q14 = SilkTables.silk_LTPScales_table_Q14[silkChannelEncoder.indices.LTP_scaleIndex];
    }
}

