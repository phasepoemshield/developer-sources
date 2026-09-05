/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.NLSFCodebook
 *  de.maxhenkel.voicechat.concentus.SideInfoIndices
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.SideInfoIndices;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkTables;

class EncodeIndices {
    EncodeIndices() {
    }

    static void silk_encode_indices(SilkChannelEncoder silkChannelEncoder, EntropyCoder entropyCoder, int n, int n2, int n3) {
        int n4;
        short[] sArray = new short[16];
        short[] sArray2 = new short[16];
        SideInfoIndices sideInfoIndices = n2 != 0 ? silkChannelEncoder.indices_LBRR[n] : silkChannelEncoder.indices;
        int n5 = 2 * sideInfoIndices.signalType + sideInfoIndices.quantOffsetType;
        Inlines.OpusAssert(n5 >= 0 && n5 < 6);
        Inlines.OpusAssert(n2 == 0 || n5 >= 2);
        if (n2 != 0 || n5 >= 2) {
            entropyCoder.enc_icdf(n5 - 2, SilkTables.silk_type_offset_VAD_iCDF, 8);
        } else {
            entropyCoder.enc_icdf(n5, SilkTables.silk_type_offset_no_VAD_iCDF, 8);
        }
        if (n3 == 2) {
            Inlines.OpusAssert(sideInfoIndices.GainsIndices[0] >= 0 && sideInfoIndices.GainsIndices[0] < 41);
            entropyCoder.enc_icdf(sideInfoIndices.GainsIndices[0], SilkTables.silk_delta_gain_iCDF, 8);
        } else {
            Inlines.OpusAssert(sideInfoIndices.GainsIndices[0] >= 0 && sideInfoIndices.GainsIndices[0] < 64);
            entropyCoder.enc_icdf(Inlines.silk_RSHIFT(sideInfoIndices.GainsIndices[0], 3), SilkTables.silk_gain_iCDF[sideInfoIndices.signalType], 8);
            entropyCoder.enc_icdf(sideInfoIndices.GainsIndices[0] & 7, SilkTables.silk_uniform8_iCDF, 8);
        }
        for (n4 = 1; n4 < silkChannelEncoder.nb_subfr; ++n4) {
            Inlines.OpusAssert(sideInfoIndices.GainsIndices[n4] >= 0 && sideInfoIndices.GainsIndices[n4] < 41);
            entropyCoder.enc_icdf(sideInfoIndices.GainsIndices[n4], SilkTables.silk_delta_gain_iCDF, 8);
        }
        entropyCoder.enc_icdf(sideInfoIndices.NLSFIndices[0], silkChannelEncoder.psNLSF_CB.CB1_iCDF, (sideInfoIndices.signalType >> 1) * silkChannelEncoder.psNLSF_CB.nVectors, 8);
        NLSF.silk_NLSF_unpack((short[])sArray, (short[])sArray2, (NLSFCodebook)silkChannelEncoder.psNLSF_CB, (int)sideInfoIndices.NLSFIndices[0]);
        Inlines.OpusAssert(silkChannelEncoder.psNLSF_CB.order == silkChannelEncoder.predictLPCOrder);
        for (n4 = 0; n4 < silkChannelEncoder.psNLSF_CB.order; ++n4) {
            if (sideInfoIndices.NLSFIndices[n4 + 1] >= 4) {
                entropyCoder.enc_icdf(8, silkChannelEncoder.psNLSF_CB.ec_iCDF, sArray[n4], 8);
                entropyCoder.enc_icdf(sideInfoIndices.NLSFIndices[n4 + 1] - 4, SilkTables.silk_NLSF_EXT_iCDF, 8);
                continue;
            }
            if (sideInfoIndices.NLSFIndices[n4 + 1] <= -4) {
                entropyCoder.enc_icdf(0, silkChannelEncoder.psNLSF_CB.ec_iCDF, sArray[n4], 8);
                entropyCoder.enc_icdf(-sideInfoIndices.NLSFIndices[n4 + 1] - 4, SilkTables.silk_NLSF_EXT_iCDF, 8);
                continue;
            }
            entropyCoder.enc_icdf(sideInfoIndices.NLSFIndices[n4 + 1] + 4, silkChannelEncoder.psNLSF_CB.ec_iCDF, sArray[n4], 8);
        }
        if (silkChannelEncoder.nb_subfr == 4) {
            Inlines.OpusAssert(sideInfoIndices.NLSFInterpCoef_Q2 >= 0 && sideInfoIndices.NLSFInterpCoef_Q2 < 5);
            entropyCoder.enc_icdf(sideInfoIndices.NLSFInterpCoef_Q2, SilkTables.silk_NLSF_interpolation_factor_iCDF, 8);
        }
        if (sideInfoIndices.signalType == 2) {
            boolean bl = true;
            if (n3 == 2 && silkChannelEncoder.ec_prevSignalType == 2) {
                int n6 = sideInfoIndices.lagIndex - silkChannelEncoder.ec_prevLagIndex;
                if (n6 < -8 || n6 > 11) {
                    n6 = 0;
                } else {
                    n6 += 9;
                    bl = false;
                }
                Inlines.OpusAssert(n6 >= 0 && n6 < 21);
                entropyCoder.enc_icdf(n6, SilkTables.silk_pitch_delta_iCDF, 8);
            }
            if (bl) {
                int n7 = Inlines.silk_DIV32_16(sideInfoIndices.lagIndex, Inlines.silk_RSHIFT(silkChannelEncoder.fs_kHz, 1));
                int n8 = sideInfoIndices.lagIndex - Inlines.silk_SMULBB(n7, Inlines.silk_RSHIFT(silkChannelEncoder.fs_kHz, 1));
                Inlines.OpusAssert(n8 < silkChannelEncoder.fs_kHz / 2);
                Inlines.OpusAssert(n7 < 32);
                entropyCoder.enc_icdf(n7, SilkTables.silk_pitch_lag_iCDF, 8);
                entropyCoder.enc_icdf(n8, silkChannelEncoder.pitch_lag_low_bits_iCDF, 8);
            }
            silkChannelEncoder.ec_prevLagIndex = sideInfoIndices.lagIndex;
            Inlines.OpusAssert(sideInfoIndices.contourIndex >= 0);
            Inlines.OpusAssert(sideInfoIndices.contourIndex < 34 && silkChannelEncoder.fs_kHz > 8 && silkChannelEncoder.nb_subfr == 4 || sideInfoIndices.contourIndex < 11 && silkChannelEncoder.fs_kHz == 8 && silkChannelEncoder.nb_subfr == 4 || sideInfoIndices.contourIndex < 12 && silkChannelEncoder.fs_kHz > 8 && silkChannelEncoder.nb_subfr == 2 || sideInfoIndices.contourIndex < 3 && silkChannelEncoder.fs_kHz == 8 && silkChannelEncoder.nb_subfr == 2);
            entropyCoder.enc_icdf(sideInfoIndices.contourIndex, silkChannelEncoder.pitch_contour_iCDF, 8);
            Inlines.OpusAssert(sideInfoIndices.PERIndex >= 0 && sideInfoIndices.PERIndex < 3);
            entropyCoder.enc_icdf(sideInfoIndices.PERIndex, SilkTables.silk_LTP_per_index_iCDF, 8);
            for (int i = 0; i < silkChannelEncoder.nb_subfr; ++i) {
                Inlines.OpusAssert(sideInfoIndices.LTPIndex[i] >= 0 && sideInfoIndices.LTPIndex[i] < 8 << sideInfoIndices.PERIndex);
                entropyCoder.enc_icdf(sideInfoIndices.LTPIndex[i], SilkTables.silk_LTP_gain_iCDF_ptrs[sideInfoIndices.PERIndex], 8);
            }
            if (n3 == 0) {
                Inlines.OpusAssert(sideInfoIndices.LTP_scaleIndex >= 0 && sideInfoIndices.LTP_scaleIndex < 3);
                entropyCoder.enc_icdf(sideInfoIndices.LTP_scaleIndex, SilkTables.silk_LTPscale_iCDF, 8);
            }
            Inlines.OpusAssert(n3 == 0 || sideInfoIndices.LTP_scaleIndex == 0);
        }
        silkChannelEncoder.ec_prevSignalType = sideInfoIndices.signalType;
        Inlines.OpusAssert(sideInfoIndices.Seed >= 0 && sideInfoIndices.Seed < 4);
        entropyCoder.enc_icdf(sideInfoIndices.Seed, SilkTables.silk_uniform4_iCDF, 8);
    }
}

