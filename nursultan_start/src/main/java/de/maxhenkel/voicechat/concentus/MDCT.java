/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.FFTState
 *  de.maxhenkel.voicechat.concentus.Inlines
 *  de.maxhenkel.voicechat.concentus.KissFFT
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.FFTState;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.KissFFT;
import de.maxhenkel.voicechat.concentus.MDCTLookup;

class MDCT {
    MDCT() {
    }

    static void clt_mdct_forward(MDCTLookup mDCTLookup, int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3, int n4, int n5) {
        int n6;
        int n7;
        FFTState fFTState = mDCTLookup.kfft[n4];
        int n8 = 0;
        int n9 = fFTState.scale_shift - 1;
        short s = fFTState.scale;
        int n10 = mDCTLookup.n;
        short[] sArray = mDCTLookup.trig;
        for (n7 = 0; n7 < n4; ++n7) {
            n8 += (n10 >>= 1);
        }
        int n11 = n10 >> 1;
        int n12 = n10 >> 2;
        int[] nArray4 = new int[n11];
        int[] nArray5 = new int[n12 * 2];
        int n13 = n + (n3 >> 1);
        int n14 = n + n11 - 1 + (n3 >> 1);
        int n15 = 0;
        int n16 = n3 >> 1;
        int n17 = (n3 >> 1) - 1;
        for (n7 = 0; n7 < n3 + 3 >> 2; ++n7) {
            nArray4[n15++] = Inlines.MULT16_32_Q15((int)nArray3[n17], (int)nArray[n13 + n11]) + Inlines.MULT16_32_Q15((int)nArray3[n16], (int)nArray[n14]);
            nArray4[n15++] = Inlines.MULT16_32_Q15((int)nArray3[n16], (int)nArray[n13]) - Inlines.MULT16_32_Q15((int)nArray3[n17], (int)nArray[n14 - n11]);
            n13 += 2;
            n14 -= 2;
            n16 += 2;
            n17 -= 2;
        }
        n16 = 0;
        n17 = n3 - 1;
        while (n7 < n12 - (n3 + 3 >> 2)) {
            nArray4[n15++] = nArray[n14];
            nArray4[n15++] = nArray[n13];
            n13 += 2;
            n14 -= 2;
            ++n7;
        }
        while (n7 < n12) {
            nArray4[n15++] = Inlines.MULT16_32_Q15((int)nArray3[n17], (int)nArray[n14]) - Inlines.MULT16_32_Q15((int)nArray3[n16], (int)nArray[n13 - n11]);
            nArray4[n15++] = Inlines.MULT16_32_Q15((int)nArray3[n17], (int)nArray[n13]) + Inlines.MULT16_32_Q15((int)nArray3[n16], (int)nArray[n14 + n11]);
            n13 += 2;
            n14 -= 2;
            n16 += 2;
            n17 -= 2;
            ++n7;
        }
        n13 = 0;
        n14 = n8;
        for (n7 = 0; n7 < n12; ++n7) {
            n15 = sArray[n14 + n7];
            n16 = sArray[n14 + n12 + n7];
            n17 = nArray4[n13++];
            n6 = nArray4[n13++];
            int n18 = KissFFT.S_MUL((int)n17, (short)n15) - KissFFT.S_MUL((int)n6, (short)n16);
            int n19 = KissFFT.S_MUL((int)n6, (short)n15) + KissFFT.S_MUL((int)n17, (short)n16);
            nArray5[2 * fFTState.bitrev[n7]] = Inlines.PSHR32((int)Inlines.MULT16_32_Q16((int)s, (int)n18), (int)n9);
            nArray5[2 * fFTState.bitrev[n7] + 1] = Inlines.PSHR32((int)Inlines.MULT16_32_Q16((int)s, (int)n19), (int)n9);
        }
        KissFFT.opus_fft_impl((FFTState)fFTState, (int[])nArray5, (int)0);
        n13 = 0;
        n14 = n2;
        n15 = n2 + n5 * (n11 - 1);
        n16 = n8;
        for (n7 = 0; n7 < n12; ++n7) {
            n17 = KissFFT.S_MUL((int)nArray5[n13 + 1], (short)sArray[n16 + n12 + n7]) - KissFFT.S_MUL((int)nArray5[n13], (short)sArray[n16 + n7]);
            n6 = KissFFT.S_MUL((int)nArray5[n13], (short)sArray[n16 + n12 + n7]) + KissFFT.S_MUL((int)nArray5[n13 + 1], (short)sArray[n16 + n7]);
            nArray2[n14] = n17;
            nArray2[n15] = n6;
            n13 += 2;
            n14 += 2 * n5;
            n15 -= 2 * n5;
        }
    }

    static void clt_mdct_backward(MDCTLookup mDCTLookup, int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13 = 0;
        int n14 = mDCTLookup.n;
        for (n12 = 0; n12 < n4; ++n12) {
            n13 += (n14 >>= 1);
        }
        int n15 = n14 >> 1;
        int n16 = n14 >> 2;
        int n17 = n + n5 * (n15 - 1);
        int n18 = n2 + (n3 >> 1);
        short[] sArray = mDCTLookup.kfft[n4].bitrev;
        int n19 = 0;
        for (n12 = 0; n12 < n16; ++n12) {
            n11 = sArray[n19++];
            n10 = n18 + 2 * n11;
            nArray2[n10 + 1] = KissFFT.S_MUL((int)nArray[n17], (short)mDCTLookup.trig[n13 + n12]) + KissFFT.S_MUL((int)nArray[n], (short)mDCTLookup.trig[n13 + n16 + n12]);
            nArray2[n10] = KissFFT.S_MUL((int)nArray[n], (short)mDCTLookup.trig[n13 + n12]) - KissFFT.S_MUL((int)nArray[n17], (short)mDCTLookup.trig[n13 + n16 + n12]);
            n += 2 * n5;
            n17 -= 2 * n5;
        }
        KissFFT.opus_fft_impl((FFTState)mDCTLookup.kfft[n4], (int[])nArray2, (int)(n2 + (n3 >> 1)));
        int n20 = n2 + (n3 >> 1);
        int n21 = n2 + (n3 >> 1) + n15 - 2;
        n11 = n13;
        n10 = n11 + n16 - 1;
        int n22 = n11 + n15 - 1;
        for (n12 = 0; n12 < n16 + 1 >> 1; ++n12) {
            n9 = nArray2[n20 + 1];
            n8 = nArray2[n20];
            short s = mDCTLookup.trig[n11 + n12];
            short s2 = mDCTLookup.trig[n11 + n16 + n12];
            n7 = KissFFT.S_MUL((int)n9, (short)s) + KissFFT.S_MUL((int)n8, (short)s2);
            n6 = KissFFT.S_MUL((int)n9, (short)s2) - KissFFT.S_MUL((int)n8, (short)s);
            n9 = nArray2[n21 + 1];
            n8 = nArray2[n21];
            nArray2[n20] = n7;
            nArray2[n21 + 1] = n6;
            s = mDCTLookup.trig[n10 - n12];
            s2 = mDCTLookup.trig[n22 - n12];
            n7 = KissFFT.S_MUL((int)n9, (short)s) + KissFFT.S_MUL((int)n8, (short)s2);
            n6 = KissFFT.S_MUL((int)n9, (short)s2) - KissFFT.S_MUL((int)n8, (short)s);
            nArray2[n21] = n7;
            nArray2[n20 + 1] = n6;
            n20 += 2;
            n21 -= 2;
        }
        int n23 = n2 + n3 - 1;
        n21 = n2;
        n9 = 0;
        n8 = n3 - 1;
        for (n12 = 0; n12 < n3 / 2; ++n12) {
            n7 = nArray2[n23];
            n6 = nArray2[n21];
            nArray2[n21++] = Inlines.MULT16_32_Q15((int)nArray3[n8], (int)n6) - Inlines.MULT16_32_Q15((int)nArray3[n9], (int)n7);
            nArray2[n23--] = Inlines.MULT16_32_Q15((int)nArray3[n9], (int)n6) + Inlines.MULT16_32_Q15((int)nArray3[n8], (int)n7);
            ++n9;
            --n8;
        }
    }
}

