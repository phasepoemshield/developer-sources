/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;

class HPVariableCutoff {
    HPVariableCutoff() {
    }

    static void silk_HP_variable_cutoff(SilkChannelEncoder[] silkChannelEncoderArray) {
        SilkChannelEncoder silkChannelEncoder = silkChannelEncoderArray[0];
        if (silkChannelEncoder.prevSignalType == 2) {
            int n = Inlines.silk_DIV32_16(Inlines.silk_LSHIFT(Inlines.silk_MUL(silkChannelEncoder.fs_kHz, 1000), 16), silkChannelEncoder.prevLag);
            int n2 = Inlines.silk_lin2log(n) - 2048;
            int n3 = silkChannelEncoder.input_quality_bands_Q15[0];
            int n4 = (n2 = Inlines.silk_SMLAWB(n2, Inlines.silk_SMULWB(Inlines.silk_LSHIFT(-n3, 2), n3), n2 - (Inlines.silk_lin2log(0x3C0000) - 2048))) - Inlines.silk_RSHIFT(silkChannelEncoder.variable_HP_smth1_Q15, 8);
            if (n4 < 0) {
                n4 = Inlines.silk_MUL(n4, 3);
            }
            n4 = Inlines.silk_LIMIT_32(n4, -51, 51);
            silkChannelEncoder.variable_HP_smth1_Q15 = Inlines.silk_SMLAWB(silkChannelEncoder.variable_HP_smth1_Q15, Inlines.silk_SMULBB(silkChannelEncoder.speech_activity_Q8, n4), 6554);
            silkChannelEncoder.variable_HP_smth1_Q15 = Inlines.silk_LIMIT_32(silkChannelEncoder.variable_HP_smth1_Q15, Inlines.silk_LSHIFT(Inlines.silk_lin2log(60), 8), Inlines.silk_LSHIFT(Inlines.silk_lin2log(100), 8));
        }
    }
}

