/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.FFTState;
import de.maxhenkel.voicechat.concentus.Inlines;

class KissFFT {
    static final int MAXFACTORS = 8;

    KissFFT() {
    }

    static void opus_fft(FFTState fFTState, int[] nArray, int[] nArray2) {
        int n = fFTState.scale_shift - 1;
        short s = fFTState.scale;
        Inlines.OpusAssert(nArray != nArray2, "In-place FFT not supported");
        for (int i = 0; i < fFTState.nfft; ++i) {
            nArray2[2 * fFTState.bitrev[i]] = Inlines.SHR32(Inlines.MULT16_32_Q16(s, nArray[2 * i]), n);
            nArray2[2 * fFTState.bitrev[i] + 1] = Inlines.SHR32(Inlines.MULT16_32_Q16(s, nArray[2 * i + 1]), n);
        }
        KissFFT.opus_fft_impl(fFTState, nArray2, 0);
    }

    static void kf_bfly4(int[] nArray, int n, int n2, FFTState fFTState, int n3, int n4, int n5) {
        if (n3 == 1) {
            for (int i = 0; i < n4; ++i) {
                int n6 = nArray[n + 0] - nArray[n + 4];
                int n7 = nArray[n + 1] - nArray[n + 5];
                int n8 = n + 0;
                nArray[n8] = nArray[n8] + nArray[n + 4];
                int n9 = n + 1;
                nArray[n9] = nArray[n9] + nArray[n + 5];
                int n10 = nArray[n + 2] + nArray[n + 6];
                int n11 = nArray[n + 3] + nArray[n + 7];
                nArray[n + 4] = nArray[n + 0] - n10;
                nArray[n + 5] = nArray[n + 1] - n11;
                int n12 = n + 0;
                nArray[n12] = nArray[n12] + n10;
                int n13 = n + 1;
                nArray[n13] = nArray[n13] + n11;
                n10 = nArray[n + 2] - nArray[n + 6];
                n11 = nArray[n + 3] - nArray[n + 7];
                nArray[n + 2] = n6 + n11;
                nArray[n + 3] = n7 - n10;
                nArray[n + 6] = n6 - n11;
                nArray[n + 7] = n7 + n10;
                n += 8;
            }
        } else {
            int n14 = n;
            for (int i = 0; i < n4; ++i) {
                n = n14 + 2 * i * n5;
                int n15 = n + 2 * n3;
                int n16 = n + 4 * n3;
                int n17 = n + 6 * n3;
                int n18 = 0;
                int n19 = 0;
                int n20 = 0;
                for (int j = 0; j < n3; ++j) {
                    int n21 = KissFFT.S_MUL(nArray[n15], fFTState.twiddles[n18]) - KissFFT.S_MUL(nArray[n15 + 1], fFTState.twiddles[n18 + 1]);
                    int n22 = KissFFT.S_MUL(nArray[n15], fFTState.twiddles[n18 + 1]) + KissFFT.S_MUL(nArray[n15 + 1], fFTState.twiddles[n18]);
                    int n23 = KissFFT.S_MUL(nArray[n16], fFTState.twiddles[n19]) - KissFFT.S_MUL(nArray[n16 + 1], fFTState.twiddles[n19 + 1]);
                    int n24 = KissFFT.S_MUL(nArray[n16], fFTState.twiddles[n19 + 1]) + KissFFT.S_MUL(nArray[n16 + 1], fFTState.twiddles[n19]);
                    int n25 = KissFFT.S_MUL(nArray[n17], fFTState.twiddles[n20]) - KissFFT.S_MUL(nArray[n17 + 1], fFTState.twiddles[n20 + 1]);
                    int n26 = KissFFT.S_MUL(nArray[n17], fFTState.twiddles[n20 + 1]) + KissFFT.S_MUL(nArray[n17 + 1], fFTState.twiddles[n20]);
                    int n27 = nArray[n] - n23;
                    int n28 = nArray[n + 1] - n24;
                    int n29 = n;
                    nArray[n29] = nArray[n29] + n23;
                    int n30 = n + 1;
                    nArray[n30] = nArray[n30] + n24;
                    int n31 = n21 + n25;
                    int n32 = n22 + n26;
                    int n33 = n21 - n25;
                    int n34 = n22 - n26;
                    nArray[n16] = nArray[n] - n31;
                    nArray[n16 + 1] = nArray[n + 1] - n32;
                    n18 += n2 * 2;
                    n19 += n2 * 4;
                    n20 += n2 * 6;
                    int n35 = n;
                    nArray[n35] = nArray[n35] + n31;
                    int n36 = n + 1;
                    nArray[n36] = nArray[n36] + n32;
                    nArray[n15] = n27 + n34;
                    nArray[n15 + 1] = n28 - n33;
                    nArray[n17] = n27 - n34;
                    nArray[n17 + 1] = n28 + n33;
                    n += 2;
                    n15 += 2;
                    n16 += 2;
                    n17 += 2;
                }
            }
        }
    }

    static void kf_bfly2(int[] nArray, int n, int n2, int n3) {
        short s = 23170;
        Inlines.OpusAssert(n2 == 4);
        for (int i = 0; i < n3; ++i) {
            int n4 = n + 8;
            int n5 = nArray[n4 + 0];
            int n6 = nArray[n4 + 1];
            nArray[n4 + 0] = nArray[n + 0] - n5;
            nArray[n4 + 1] = nArray[n + 1] - n6;
            int n7 = n + 0;
            nArray[n7] = nArray[n7] + n5;
            int n8 = n + 1;
            nArray[n8] = nArray[n8] + n6;
            n5 = KissFFT.S_MUL(nArray[n4 + 2] + nArray[n4 + 3], s);
            n6 = KissFFT.S_MUL(nArray[n4 + 3] - nArray[n4 + 2], s);
            nArray[n4 + 2] = nArray[n + 2] - n5;
            nArray[n4 + 3] = nArray[n + 3] - n6;
            int n9 = n + 2;
            nArray[n9] = nArray[n9] + n5;
            int n10 = n + 3;
            nArray[n10] = nArray[n10] + n6;
            n5 = nArray[n4 + 5];
            n6 = 0 - nArray[n4 + 4];
            nArray[n4 + 4] = nArray[n + 4] - n5;
            nArray[n4 + 5] = nArray[n + 5] - n6;
            int n11 = n + 4;
            nArray[n11] = nArray[n11] + n5;
            int n12 = n + 5;
            nArray[n12] = nArray[n12] + n6;
            n5 = KissFFT.S_MUL(nArray[n4 + 7] - nArray[n4 + 6], s);
            n6 = KissFFT.S_MUL(0 - nArray[n4 + 7] - nArray[n4 + 6], s);
            nArray[n4 + 6] = nArray[n + 6] - n5;
            nArray[n4 + 7] = nArray[n + 7] - n6;
            int n13 = n + 6;
            nArray[n13] = nArray[n13] + n5;
            int n14 = n + 7;
            nArray[n14] = nArray[n14] + n6;
            n += 16;
        }
    }

    static int HALF_OF(int n) {
        return n >> 1;
    }

    static void kf_bfly3(int[] nArray, int n, int n2, FFTState fFTState, int n3, int n4, int n5) {
        int n6 = 2 * n3;
        int n7 = 4 * n3;
        int n8 = n;
        for (int i = 0; i < n4; ++i) {
            n = n8 + 2 * i * n5;
            int n9 = 0;
            int n10 = 0;
            int n11 = n3;
            do {
                int n12 = KissFFT.S_MUL(nArray[n + n6], fFTState.twiddles[n10]) - KissFFT.S_MUL(nArray[n + n6 + 1], fFTState.twiddles[n10 + 1]);
                int n13 = KissFFT.S_MUL(nArray[n + n6], fFTState.twiddles[n10 + 1]) + KissFFT.S_MUL(nArray[n + n6 + 1], fFTState.twiddles[n10]);
                int n14 = KissFFT.S_MUL(nArray[n + n7], fFTState.twiddles[n9]) - KissFFT.S_MUL(nArray[n + n7 + 1], fFTState.twiddles[n9 + 1]);
                int n15 = KissFFT.S_MUL(nArray[n + n7], fFTState.twiddles[n9 + 1]) + KissFFT.S_MUL(nArray[n + n7 + 1], fFTState.twiddles[n9]);
                int n16 = n12 + n14;
                int n17 = n13 + n15;
                int n18 = n12 - n14;
                int n19 = n13 - n15;
                n10 += n2 * 2;
                n9 += n2 * 4;
                nArray[n + n6] = nArray[n + 0] - KissFFT.HALF_OF(n16);
                nArray[n + n6 + 1] = nArray[n + 1] - KissFFT.HALF_OF(n17);
                n18 = KissFFT.S_MUL(n18, -28378);
                n19 = KissFFT.S_MUL(n19, -28378);
                int n20 = n + 0;
                nArray[n20] = nArray[n20] + n16;
                int n21 = n + 1;
                nArray[n21] = nArray[n21] + n17;
                nArray[n + n7] = nArray[n + n6] + n19;
                nArray[n + n7 + 1] = nArray[n + n6 + 1] - n18;
                int n22 = n + n6;
                nArray[n22] = nArray[n22] - n19;
                int n23 = n + n6 + 1;
                nArray[n23] = nArray[n23] + n18;
                n += 2;
            } while (--n11 != 0);
        }
    }

    static void kf_bfly5(int[] nArray, int n, int n2, FFTState fFTState, int n3, int n4, int n5) {
        int n6 = n;
        short s = 10126;
        short s2 = -31164;
        short s3 = -26510;
        short s4 = -19261;
        for (int i = 0; i < n4; ++i) {
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = n = n6 + 2 * i * n5;
            int n12 = n + 2 * n3;
            int n13 = n + 4 * n3;
            int n14 = n + 6 * n3;
            int n15 = n + 8 * n3;
            for (int j = 0; j < n3; ++j) {
                int n16 = nArray[n11 + 0];
                int n17 = nArray[n11 + 1];
                int n18 = KissFFT.S_MUL(nArray[n12 + 0], fFTState.twiddles[n10]) - KissFFT.S_MUL(nArray[n12 + 1], fFTState.twiddles[n10 + 1]);
                int n19 = KissFFT.S_MUL(nArray[n12 + 0], fFTState.twiddles[n10 + 1]) + KissFFT.S_MUL(nArray[n12 + 1], fFTState.twiddles[n10]);
                int n20 = KissFFT.S_MUL(nArray[n13 + 0], fFTState.twiddles[n9]) - KissFFT.S_MUL(nArray[n13 + 1], fFTState.twiddles[n9 + 1]);
                int n21 = KissFFT.S_MUL(nArray[n13 + 0], fFTState.twiddles[n9 + 1]) + KissFFT.S_MUL(nArray[n13 + 1], fFTState.twiddles[n9]);
                int n22 = KissFFT.S_MUL(nArray[n14 + 0], fFTState.twiddles[n8]) - KissFFT.S_MUL(nArray[n14 + 1], fFTState.twiddles[n8 + 1]);
                int n23 = KissFFT.S_MUL(nArray[n14 + 0], fFTState.twiddles[n8 + 1]) + KissFFT.S_MUL(nArray[n14 + 1], fFTState.twiddles[n8]);
                int n24 = KissFFT.S_MUL(nArray[n15 + 0], fFTState.twiddles[n7]) - KissFFT.S_MUL(nArray[n15 + 1], fFTState.twiddles[n7 + 1]);
                int n25 = KissFFT.S_MUL(nArray[n15 + 0], fFTState.twiddles[n7 + 1]) + KissFFT.S_MUL(nArray[n15 + 1], fFTState.twiddles[n7]);
                n10 += 2 * n2;
                n9 += 4 * n2;
                n8 += 6 * n2;
                n7 += 8 * n2;
                int n26 = n18 + n24;
                int n27 = n19 + n25;
                int n28 = n18 - n24;
                int n29 = n19 - n25;
                int n30 = n20 + n22;
                int n31 = n21 + n23;
                int n32 = n20 - n22;
                int n33 = n21 - n23;
                int n34 = n11 + 0;
                nArray[n34] = nArray[n34] + (n26 + n30);
                int n35 = n11 + 1;
                nArray[n35] = nArray[n35] + (n27 + n31);
                int n36 = n16 + KissFFT.S_MUL(n26, s) + KissFFT.S_MUL(n30, s3);
                int n37 = n17 + KissFFT.S_MUL(n27, s) + KissFFT.S_MUL(n31, s3);
                int n38 = KissFFT.S_MUL(n29, s2) + KissFFT.S_MUL(n33, s4);
                int n39 = 0 - KissFFT.S_MUL(n28, s2) - KissFFT.S_MUL(n32, s4);
                nArray[n12 + 0] = n36 - n38;
                nArray[n12 + 1] = n37 - n39;
                nArray[n15 + 0] = n36 + n38;
                nArray[n15 + 1] = n37 + n39;
                int n40 = n16 + KissFFT.S_MUL(n26, s3) + KissFFT.S_MUL(n30, s);
                int n41 = n17 + KissFFT.S_MUL(n27, s3) + KissFFT.S_MUL(n31, s);
                int n42 = 0 - KissFFT.S_MUL(n29, s4) + KissFFT.S_MUL(n33, s2);
                int n43 = KissFFT.S_MUL(n28, s4) - KissFFT.S_MUL(n32, s2);
                nArray[n13 + 0] = n40 + n42;
                nArray[n13 + 1] = n41 + n43;
                nArray[n14 + 0] = n40 - n42;
                nArray[n14 + 1] = n41 - n43;
                n11 += 2;
                n12 += 2;
                n13 += 2;
                n14 += 2;
                n15 += 2;
            }
        }
    }

    static int S_MUL(int n, short s) {
        return Inlines.MULT16_32_Q15(s, n);
    }

    static int S_MUL(int n, int n2) {
        return Inlines.MULT16_32_Q15(n2, n);
    }

    static void opus_fft_impl(FFTState fFTState, int[] nArray, int n) {
        short s;
        int[] nArray2 = new int[8];
        int n2 = fFTState.shift > 0 ? fFTState.shift : 0;
        nArray2[0] = 1;
        int n3 = 0;
        do {
            short s2 = fFTState.factors[2 * n3];
            s = fFTState.factors[2 * n3 + 1];
            nArray2[n3 + 1] = nArray2[n3] * s2;
            ++n3;
        } while (s != 1);
        s = fFTState.factors[2 * n3 - 1];
        for (int i = n3 - 1; i >= 0; --i) {
            short s3 = i != 0 ? fFTState.factors[2 * i - 1] : (short)1;
            switch (fFTState.factors[2 * i]) {
                case 2: {
                    KissFFT.kf_bfly2(nArray, n, s, nArray2[i]);
                    break;
                }
                case 4: {
                    KissFFT.kf_bfly4(nArray, n, nArray2[i] << n2, fFTState, s, nArray2[i], s3);
                    break;
                }
                case 3: {
                    KissFFT.kf_bfly3(nArray, n, nArray2[i] << n2, fFTState, s, nArray2[i], s3);
                    break;
                }
                case 5: {
                    KissFFT.kf_bfly5(nArray, n, nArray2[i] << n2, fFTState, s, nArray2[i], s3);
                }
            }
            s = s3;
        }
    }
}

