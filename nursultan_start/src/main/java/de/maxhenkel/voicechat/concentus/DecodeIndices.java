/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.NLSFCodebook
 *  de.maxhenkel.voicechat.concentus.SilkChannelDecoder
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkTables;

class DecodeIndices {
    DecodeIndices() {
    }

    static void silk_decode_indices(SilkChannelDecoder silkChannelDecoder, EntropyCoder entropyCoder, int n, int n2, int n3) {
        int n4;
        short[] sArray = new short[silkChannelDecoder.LPC_order];
        short[] sArray2 = new short[silkChannelDecoder.LPC_order];
        int n5 = n2 != 0 || silkChannelDecoder.VAD_flags[n] != 0 ? entropyCoder.dec_icdf(SilkTables.silk_type_offset_VAD_iCDF, 8) + 2 : entropyCoder.dec_icdf(SilkTables.silk_type_offset_no_VAD_iCDF, 8);
        silkChannelDecoder.indices.signalType = (byte)Inlines.silk_RSHIFT(n5, 1);
        silkChannelDecoder.indices.quantOffsetType = (byte)(n5 & 1);
        if (n3 == 2) {
            silkChannelDecoder.indices.GainsIndices[0] = (byte)entropyCoder.dec_icdf(SilkTables.silk_delta_gain_iCDF, 8);
        } else {
            silkChannelDecoder.indices.GainsIndices[0] = (byte)Inlines.silk_LSHIFT(entropyCoder.dec_icdf(SilkTables.silk_gain_iCDF[silkChannelDecoder.indices.signalType], 8), 3);
            silkChannelDecoder.indices.GainsIndices[0] = (byte)(silkChannelDecoder.indices.GainsIndices[0] + (byte)entropyCoder.dec_icdf(SilkTables.silk_uniform8_iCDF, 8));
        }
        for (n4 = 1; n4 < silkChannelDecoder.nb_subfr; ++n4) {
            silkChannelDecoder.indices.GainsIndices[n4] = (byte)entropyCoder.dec_icdf(SilkTables.silk_delta_gain_iCDF, 8);
        }
        silkChannelDecoder.indices.NLSFIndices[0] = (byte)entropyCoder.dec_icdf(silkChannelDecoder.psNLSF_CB.CB1_iCDF, (silkChannelDecoder.indices.signalType >> 1) * silkChannelDecoder.psNLSF_CB.nVectors, 8);
        NLSF.silk_NLSF_unpack((short[])sArray, (short[])sArray2, (NLSFCodebook)silkChannelDecoder.psNLSF_CB, (int)silkChannelDecoder.indices.NLSFIndices[0]);
        Inlines.OpusAssert(silkChannelDecoder.psNLSF_CB.order == silkChannelDecoder.LPC_order);
        for (n4 = 0; n4 < silkChannelDecoder.psNLSF_CB.order; ++n4) {
            n5 = entropyCoder.dec_icdf(silkChannelDecoder.psNLSF_CB.ec_iCDF, sArray[n4], 8);
            if (n5 == 0) {
                n5 -= entropyCoder.dec_icdf(SilkTables.silk_NLSF_EXT_iCDF, 8);
            } else if (n5 == 8) {
                n5 += entropyCoder.dec_icdf(SilkTables.silk_NLSF_EXT_iCDF, 8);
            }
            silkChannelDecoder.indices.NLSFIndices[n4 + 1] = (byte)(n5 - 4);
        }
        silkChannelDecoder.indices.NLSFInterpCoef_Q2 = silkChannelDecoder.nb_subfr == 4 ? (byte)entropyCoder.dec_icdf(SilkTables.silk_NLSF_interpolation_factor_iCDF, 8) : (byte)4;
        if (silkChannelDecoder.indices.signalType == 2) {
            int n6;
            boolean bl = true;
            if (n3 == 2 && silkChannelDecoder.ec_prevSignalType == 2 && (n6 = (int)entropyCoder.dec_icdf(SilkTables.silk_pitch_delta_iCDF, 8)) > 0) {
                silkChannelDecoder.indices.lagIndex = (short)(silkChannelDecoder.ec_prevLagIndex + (n6 -= 9));
                bl = false;
            }
            if (bl) {
                silkChannelDecoder.indices.lagIndex = (short)(entropyCoder.dec_icdf(SilkTables.silk_pitch_lag_iCDF, 8) * Inlines.silk_RSHIFT(silkChannelDecoder.fs_kHz, 1));
                silkChannelDecoder.indices.lagIndex = (short)(silkChannelDecoder.indices.lagIndex + (short)entropyCoder.dec_icdf(silkChannelDecoder.pitch_lag_low_bits_iCDF, 8));
            }
            silkChannelDecoder.ec_prevLagIndex = silkChannelDecoder.indices.lagIndex;
            silkChannelDecoder.indices.contourIndex = (byte)entropyCoder.dec_icdf(silkChannelDecoder.pitch_contour_iCDF, 8);
            silkChannelDecoder.indices.PERIndex = (byte)entropyCoder.dec_icdf(SilkTables.silk_LTP_per_index_iCDF, 8);
            for (int i = 0; i < silkChannelDecoder.nb_subfr; ++i) {
                silkChannelDecoder.indices.LTPIndex[i] = (byte)entropyCoder.dec_icdf(SilkTables.silk_LTP_gain_iCDF_ptrs[silkChannelDecoder.indices.PERIndex], 8);
            }
            silkChannelDecoder.indices.LTP_scaleIndex = n3 == 0 ? (byte)entropyCoder.dec_icdf(SilkTables.silk_LTPscale_iCDF, 8) : (byte)0;
        }
        silkChannelDecoder.ec_prevSignalType = silkChannelDecoder.indices.signalType;
        silkChannelDecoder.indices.Seed = (byte)entropyCoder.dec_icdf(SilkTables.silk_uniform4_iCDF, 8);
    }
}

