/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.PitchAnalysisCore$silk_pe_stage3_vals
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.PitchAnalysisCore;

class Inlines {
    private static short[] sqrt_C;
    private static short log2_C0;

    Inlines() {
    }

    static {
        short[] sArray = new short[5];
        sArray[0] = 23175;
        sArray[1] = 11561;
        sArray[2] = -3011;
        sArray[3] = 1699;
        sArray[4] = -664;
        sqrt_C = sArray;
        log2_C0 = (short)-6793;
    }

    static int abs(int n) {
        if (n < 0) {
            return 0 - n;
        }
        return n;
    }

    static short MIN(short s, short s2) {
        return s < s2 ? s : s2;
    }

    static int MIN(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static short MAX(short s, short s2) {
        return s > s2 ? s : s2;
    }

    static int MAX(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static float MAX16(float f, float f2) {
        return f > f2 ? f : f2;
    }

    static int MAX16(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static short MAX16(short s, short s2) {
        return s > s2 ? s : s2;
    }

    static int MULT16_16(int n, int n2) {
        return n * n2;
    }

    static int MULT16_16(short s, short s2) {
        return s * s2;
    }

    static int SHR32(int n, int n2) {
        return n >> n2;
    }

    static int celt_ilog2(int n) {
        Inlines.OpusAssert(n > 0, "celt_ilog2() only defined for strictly positive numbers");
        return Inlines.EC_ILOG(n) - 1;
    }

    static int PSHR32(int n, int n2) {
        return Inlines.SHR32(n + (Inlines.EXTEND32(1) << n2 >> 1), n2);
    }

    static int MIN32(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static float MIN32(float f, float f2) {
        return f < f2 ? f : f2;
    }

    static int MIN16(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static short MIN16(short s, short s2) {
        return s < s2 ? s : s2;
    }

    static float MIN16(float f, float f2) {
        return f < f2 ? f : f2;
    }

    static int MAC16_16(int n, int n2, int n3) {
        return n + n2 * n3;
    }

    static int MAC16_16(int n, short s, short s2) {
        return n + s * s2;
    }

    static int MAC16_16(short s, short s2, short s3) {
        return s + s2 * s3;
    }

    static float ABS16(float f) {
        return f < 0.0f ? -f : f;
    }

    static short ABS16(short s) {
        return s < 0 ? -s : s;
    }

    static int ABS16(int n) {
        return n < 0 ? -n : n;
    }

    static int MAX32(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static float MAX32(float f, float f2) {
        return f > f2 ? f : f2;
    }

    static int IMAX(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static void OpusAssert(boolean bl, String string) {
        if (!bl) {
            throw new AssertionError((Object)string);
        }
    }

    static void OpusAssert(boolean bl) {
        if (!bl) {
            throw new AssertionError();
        }
    }

    static float silk_min(float f, float f2) {
        return f < f2 ? f : f2;
    }

    static int silk_min(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static int IMIN(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static long IMIN(long l, long l2) {
        return l < l2 ? l : l2;
    }

    static int silk_LSHIFT32(int n, int n2) {
        int n3 = n << n2;
        return n3;
    }

    static int silk_LSHIFT(int n, int n2) {
        int n3 = n << n2;
        return n3;
    }

    static long silk_RSHIFT64(long l, int n) {
        return l >> n;
    }

    static short celt_maxabs32(short[] sArray, int n, int n2) {
        short s = 0;
        short s2 = 0;
        for (int i = n; i < n + n2; ++i) {
            s = Inlines.MAX16(s, sArray[i]);
            s2 = Inlines.MIN16(s2, sArray[i]);
        }
        return Inlines.MAX(s, (short)(0 - s2));
    }

    static int celt_maxabs32(int[] nArray, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        for (int i = n; i < n + n2; ++i) {
            n3 = Inlines.MAX32(n3, nArray[i]);
            n4 = Inlines.MIN32(n4, nArray[i]);
        }
        return Inlines.MAX32(n3, 0 - n4);
    }

    static int silk_SMLAWB(int n, int n2, int n3) {
        int n4 = n + Inlines.silk_SMULWB(n2, n3);
        return n4;
    }

    static long silk_LSHIFT64(long l, int n) {
        long l2 = l << n;
        return l2;
    }

    static int MULT16_32_Q15(short s, int n) {
        return (s * (n >> 16) << 1) + (s * (n & 0xFFFF) >> 15);
    }

    static int MULT16_32_Q15(int n, int n2) {
        return (n * (n2 >> 16) << 1) + (n * (n2 & 0xFFFF) >> 15);
    }

    static int celt_rsqrt_norm(int n) {
        int n2 = n - 32768;
        int n3 = Inlines.ADD16(23557, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(-13490, Inlines.MULT16_16_Q15(n2, 6713))));
        int n4 = Inlines.MULT16_16_Q15(n3, n3);
        int n5 = Inlines.SHL16(Inlines.SUB16(Inlines.ADD16(Inlines.MULT16_16_Q15(n4, n2), n4), 16384), 1);
        return Inlines.ADD16(n3, Inlines.MULT16_16_Q15(n3, Inlines.MULT16_16_Q15(n5, Inlines.SUB16(Inlines.MULT16_16_Q15(n5, 12288), 16384))));
    }

    static int MULT16_16_Q15(int n, int n2) {
        return Inlines.SHR(Inlines.MULT16_16(n, n2), 15);
    }

    static short MULT16_16_Q15(short s, short s2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(s, s2), 15);
    }

    static short MULT16_16_Q14(short s, short s2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(s, s2), 14);
    }

    static int MULT16_16_Q14(int n, int n2) {
        return Inlines.SHR(Inlines.MULT16_16(n, n2), 14);
    }

    static int silk_RSHIFT_ROUND(int n, int n2) {
        int n3 = n2 == 1 ? (n >> 1) + (n & 1) : (n >> n2 - 1) + 1 >> 1;
        return n3;
    }

    static int silk_SMULWW(int n, int n2) {
        return Inlines.silk_MLA(Inlines.silk_SMULWB(n, n2), n, Inlines.silk_RSHIFT_ROUND(n2, 16));
    }

    static int silk_RSHIFT(int n, int n2) {
        return n >> n2;
    }

    static int silk_SMULWB(int n, int n2) {
        return (int)((long)n * (long)((short)n2) >> 16);
    }

    static int celt_exp2_frac(int n) {
        int n2 = Inlines.SHL16(n, 4);
        return Inlines.ADD16(16383, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(22804, Inlines.MULT16_16_Q15(n2, Inlines.ADD16(14819, Inlines.MULT16_16_Q15(10204, n2))))));
    }

    static int silk_min_int(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static int silk_DIV32_16(int n, int n2) {
        return n / n2;
    }

    static int silk_DIV32_varQ(int n, int n2, int n3) {
        Inlines.OpusAssert(n2 != 0);
        Inlines.OpusAssert(n3 >= 0);
        int n4 = Inlines.silk_CLZ32(Inlines.silk_abs(n)) - 1;
        int n5 = Inlines.silk_LSHIFT(n, n4);
        int n6 = Inlines.silk_CLZ32(Inlines.silk_abs(n2)) - 1;
        int n7 = Inlines.silk_LSHIFT(n2, n6);
        int n8 = Inlines.silk_DIV32_16(0x1FFFFFFF, Inlines.silk_RSHIFT(n7, 16));
        int n9 = Inlines.silk_SMULWB(n5, n8);
        n5 = Inlines.silk_SUB32_ovflw(n5, Inlines.silk_LSHIFT_ovflw(Inlines.silk_SMMUL(n7, n9), 3));
        n9 = Inlines.silk_SMLAWB(n9, n5, n8);
        int n10 = 29 + n4 - n6 - n3;
        if (n10 < 0) {
            return Inlines.silk_LSHIFT_SAT32(n9, -n10);
        }
        if (n10 < 32) {
            return Inlines.silk_RSHIFT(n9, n10);
        }
        return 0;
    }

    static int silk_SMULTT(int n, int n2) {
        return (n >> 16) * (n2 >> 16);
    }

    static int silk_SMLAWW(int n, int n2, int n3) {
        return Inlines.silk_MLA(Inlines.silk_SMLAWB(n, n2, n3), n2, Inlines.silk_RSHIFT_ROUND(n3, 16));
    }

    static int silk_SUB_LSHIFT32(int n, int n2, int n3) {
        int n4 = n - (n2 << n3);
        return n4;
    }

    static short silk_ADD_SAT16(short s, short s2) {
        short s3 = (short)Inlines.silk_SAT16(Inlines.silk_ADD32(s, s2));
        Inlines.OpusAssert(s3 == Inlines.silk_SAT16(s + s2));
        return s3;
    }

    static int silk_ADD_LSHIFT32(int n, int n2, int n3) {
        int n4 = n + (n2 << n3);
        return n4;
    }

    static int silk_SQRT_APPROX(int n) {
        if (n <= 0) {
            return 0;
        }
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        Inlines.silk_CLZ_FRAC(n, boxedValueInt, boxedValueInt2);
        int n2 = boxedValueInt.Val;
        int n3 = boxedValueInt2.Val;
        int n4 = (n2 & 1) != 0 ? 32768 : 46214;
        n4 >>= Inlines.silk_RSHIFT(n2, 1);
        n4 = Inlines.silk_SMLAWB(n4, n4, Inlines.silk_SMULBB(213, n3));
        return n4;
    }

    static int silk_RSHIFT32(int n, int n2) {
        return n >> n2;
    }

    static int MAC16_32_Q15(int n, int n2, int n3) {
        return Inlines.ADD32(n, Inlines.ADD32(Inlines.MULT16_16(n2, Inlines.SHR(n3, 15)), Inlines.SHR(Inlines.MULT16_16(n2, n3 & Short.MAX_VALUE), 15)));
    }

    static int MAC16_32_Q15(int n, short s, short s2) {
        return Inlines.ADD32(n, Inlines.ADD32(Inlines.MULT16_16((int)s, Inlines.SHR(s2, 15)), Inlines.SHR(Inlines.MULT16_16((int)s, s2 & Short.MAX_VALUE), 15)));
    }

    static int silk_ADD_LSHIFT(int n, int n2, int n3) {
        int n4 = n + (n2 << n3);
        return n4;
    }

    static long CapToUInt32(int n) {
        return n;
    }

    static long CapToUInt32(long l) {
        return 0xFFFFFFFFL & (long)((int)l);
    }

    static short MULT16_16_P15(short s, short s2) {
        return (short)Inlines.SHR(Inlines.ADD32(16384, Inlines.MULT16_16(s, s2)), 15);
    }

    static int MULT16_16_P15(int n, int n2) {
        return Inlines.SHR(Inlines.ADD32(16384, Inlines.MULT16_16(n, n2)), 15);
    }

    static int silk_inner_prod_self(short[] sArray, int n, int n2) {
        int n3 = 0;
        for (int i = n; i < n + n2; ++i) {
            n3 = Inlines.MAC16_16(n3, sArray[i], sArray[i]);
        }
        return n3;
    }

    static int silk_INVERSE32_varQ(int n, int n2) {
        Inlines.OpusAssert(n != 0);
        Inlines.OpusAssert(n2 > 0);
        int n3 = Inlines.silk_CLZ32(Inlines.silk_abs(n)) - 1;
        int n4 = Inlines.silk_LSHIFT(n, n3);
        int n5 = Inlines.silk_DIV32_16(0x1FFFFFFF, (short)Inlines.silk_RSHIFT(n4, 16));
        int n6 = Inlines.silk_LSHIFT(n5, 16);
        int n7 = Inlines.silk_LSHIFT(0x20000000 - Inlines.silk_SMULWB(n4, n5), 3);
        n6 = Inlines.silk_SMLAWW(n6, n7, n5);
        int n8 = 61 - n3 - n2;
        if (n8 <= 0) {
            return Inlines.silk_LSHIFT_SAT32(n6, -n8);
        }
        if (n8 < 32) {
            return Inlines.silk_RSHIFT(n6, n8);
        }
        return 0;
    }

    static void silk_scale_copy_vector16(short[] sArray, int n, short[] sArray2, int n2, int n3, int n4) {
        for (int i = 0; i < n4; ++i) {
            sArray[n + i] = (short)Inlines.silk_SMULWB(n3, sArray2[n2 + i]);
        }
    }

    static long silk_ADD_RSHIFT_uint(long l, long l2, int n) {
        long l3 = Inlines.CapToUInt32(l + (Inlines.CapToUInt32(l2) >> n));
        return l3;
    }

    static long silk_RSHIFT_ROUND64(long l, int n) {
        long l2 = n == 1 ? (l >> 1) + (l & 1L) : (l >> n - 1) + 1L >> 1;
        return l2;
    }

    static int SignedByteToUnsignedInt(byte by) {
        return by & 0xFF;
    }

    static int EC_ILOG(long l) {
        if (l == 0L) {
            return 1;
        }
        l |= l >> 1;
        l |= l >> 2;
        l |= l >> 4;
        l |= l >> 8;
        l |= l >> 16;
        long l2 = l - (l >> 1 & 0x55555555L);
        l2 = (l2 >> 2 & 0x33333333L) + (l2 & 0x33333333L);
        l2 = (l2 >> 4) + l2 & 0xF0F0F0FL;
        l2 += l2 >> 8;
        l2 += l2 >> 16;
        return (int)(l2 &= 0x3FL);
    }

    static short DIV32_16(int n, short s) {
        return (short)(n / s);
    }

    static int DIV32_16(int n, int n2) {
        return n / n2;
    }

    static int SUB32(int n, int n2) {
        return n - n2;
    }

    static int isqrt32(long l) {
        int n = 0;
        int n2 = Inlines.EC_ILOG(l) - 1 >> 1;
        int n3 = 1 << n2;
        do {
            long l2;
            if ((l2 = (long)((n << 1) + n3 << n2)) <= l) {
                n += n3;
                l -= l2;
            }
            n3 >>= 1;
        } while (--n2 >= 0);
        return n;
    }

    static int HALF32(int n) {
        return Inlines.SHR32(n, 1);
    }

    static int silk_SMMUL(int n, int n2) {
        return (int)Inlines.silk_RSHIFT64(Inlines.silk_SMULL(n, n2), 32);
    }

    static int silk_MLA(int n, int n2, int n3) {
        int n4 = Inlines.silk_ADD32(n, n2 * n3);
        Inlines.OpusAssert((long)n4 == (long)n + (long)n2 * (long)n3);
        return n4;
    }

    static int celt_sqrt(int n) {
        if (n == 0) {
            return 0;
        }
        if (n >= 0x40000000) {
            return Short.MAX_VALUE;
        }
        int n2 = (Inlines.celt_ilog2(n) >> 1) - 7;
        n = Inlines.VSHR32(n, 2 * n2);
        short s = (short)(n - 32768);
        int n3 = Inlines.ADD16(sqrt_C[0], Inlines.MULT16_16_Q15(s, Inlines.ADD16(sqrt_C[1], Inlines.MULT16_16_Q15(s, Inlines.ADD16(sqrt_C[2], Inlines.MULT16_16_Q15(s, Inlines.ADD16(sqrt_C[3], Inlines.MULT16_16_Q15(s, sqrt_C[4]))))))));
        n3 = Inlines.VSHR32(n3, 7 - n2);
        return n3;
    }

    static int celt_sudiv(int n, int n2) {
        Inlines.OpusAssert(n2 > 0);
        return n / n2;
    }

    static int SHL32(int n, int n2) {
        return (int)(0xFFFFFFFFFFFFFFFFL & (long)n << n2);
    }

    static int EXTEND32(int n) {
        return n;
    }

    static int EXTEND32(short s) {
        return s;
    }

    static int ADD32(int n, int n2) {
        return n + n2;
    }

    static short ADD16(short s, short s2) {
        return (short)(s + s2);
    }

    static int ADD16(int n, int n2) {
        return n + n2;
    }

    static float silk_LIMIT(float f, float f2, float f3) {
        return f2 > f3 ? (f > f2 ? f2 : (f < f3 ? f3 : f)) : (f > f3 ? f3 : (f < f2 ? f2 : f));
    }

    static int silk_LIMIT(int n, int n2, int n3) {
        return Inlines.silk_LIMIT_32(n, n2, n3);
    }

    static int SUB16(int n, int n2) {
        return n - n2;
    }

    static short SUB16(short s, short s2) {
        return (short)(s - s2);
    }

    static int SHR16(int n, int n2) {
        return n >> n2;
    }

    static short SHR16(short s, int n) {
        return (short)(s >> n);
    }

    static int silk_MUL(int n, int n2) {
        int n3 = n * n2;
        return n3;
    }

    static int VSHR32(int n, int n2) {
        return n2 > 0 ? Inlines.SHR32(n, n2) : Inlines.SHL32(n, -n2);
    }

    static short EXTRACT16(int n) {
        return (short)n;
    }

    static int silk_CLZ64(long l) {
        int n = (int)Inlines.silk_RSHIFT64(l, 32);
        if (n == 0) {
            return 32 + Inlines.silk_CLZ32((int)l);
        }
        return Inlines.silk_CLZ32(n);
    }

    static int FRAC_MUL16(int n, int n2) {
        return 16384 + (short)n * (short)n2 >> 15;
    }

    static int celt_udiv(int n, int n2) {
        Inlines.OpusAssert(n2 > 0);
        return n / n2;
    }

    static int celt_exp2(int n) {
        int n2 = Inlines.SHR16(n, 10);
        if (n2 > 14) {
            return 0x7F000000;
        }
        if (n2 < -15) {
            return 0;
        }
        short s = (short)Inlines.celt_exp2_frac((short)(n - Inlines.SHL16((short)n2, 10)));
        return Inlines.VSHR32(Inlines.EXTEND32((int)s), -n2 - 2);
    }

    static int celt_zlog2(int n) {
        return n <= 0 ? 0 : Inlines.celt_ilog2(n);
    }

    static short SHL16(short s, int n) {
        return (short)((s & 0xFFFF) << n);
    }

    static int SHL16(int n, int n2) {
        return (int)(0xFFFFFFFFFFFFFFFFL & (long)n << n2);
    }

    static long silk_SMULL(int n, int n2) {
        return (long)n * (long)n2;
    }

    static int celt_rcp(int n) {
        Inlines.OpusAssert(n > 0, "celt_rcp() only defined for positive values");
        int n2 = Inlines.celt_ilog2(n);
        int n3 = Inlines.VSHR32(n, n2 - 15) - 32768;
        int n4 = Inlines.ADD16(30840, Inlines.MULT16_16_Q15(-15420, n3));
        n4 = Inlines.SUB16(n4, Inlines.MULT16_16_Q15(n4, Inlines.ADD16(Inlines.MULT16_16_Q15(n4, n3), Inlines.ADD16(n4, Short.MIN_VALUE))));
        n4 = Inlines.SUB16(n4, Inlines.ADD16(1, Inlines.MULT16_16_Q15(n4, Inlines.ADD16(Inlines.MULT16_16_Q15(n4, n3), Inlines.ADD16(n4, Short.MIN_VALUE)))));
        return Inlines.VSHR32(Inlines.EXTEND32(n4), n2 - 16);
    }

    static int silk_CLZ32(int n) {
        return n == 0 ? 32 : 32 - Inlines.EC_ILOG(n);
    }

    static short SAT16(int n) {
        return (short)(n > Short.MAX_VALUE ? Short.MAX_VALUE : (short)(n < Short.MIN_VALUE ? Short.MIN_VALUE : (short)n));
    }

    static int silk_DIV32(int n, int n2) {
        return n / n2;
    }

    static int NEG16(int n) {
        return 0 - n;
    }

    static short NEG16(short s) {
        return (short)(0 - s);
    }

    static int DIV32(int n, int n2) {
        return n / n2;
    }

    static int silk_abs(int n) {
        return n > 0 ? n : -n;
    }

    static int silk_SAT16(int n) {
        return n > Short.MAX_VALUE ? Short.MAX_VALUE : (n < Short.MIN_VALUE ? Short.MIN_VALUE : n);
    }

    static short SIG2WORD16(int n) {
        n = Inlines.PSHR32(n, 12);
        n = Inlines.MAX32(n, Short.MIN_VALUE);
        n = Inlines.MIN32(n, Short.MAX_VALUE);
        return Inlines.EXTRACT16(n);
    }

    static int silk_ADD32(int n, int n2) {
        int n3 = n + n2;
        return n3;
    }

    static int ABS32(int n) {
        return n < 0 ? -n : n;
    }

    static int silk_RAND(int n) {
        return Inlines.silk_MLA_ovflw(907633515, n, 196314165);
    }

    static int HALF16(int n) {
        return Inlines.SHR32(n, 1);
    }

    static short HALF16(short s) {
        return Inlines.SHR16(s, 1);
    }

    static int celt_log2(int n) {
        if (n == 0) {
            return -32767;
        }
        int n2 = Inlines.celt_ilog2(n);
        int n3 = Inlines.VSHR32(n, n2 - 15) - 32768 - 16384;
        int n4 = Inlines.ADD16((int)log2_C0, Inlines.MULT16_16_Q15(n3, Inlines.ADD16(15746, Inlines.MULT16_16_Q15(n3, Inlines.ADD16(-5217, Inlines.MULT16_16_Q15(n3, Inlines.ADD16(2545, Inlines.MULT16_16_Q15(n3, -1401))))))));
        return Inlines.SHL16((short)(n2 - 13), 10) + Inlines.SHR16(n4, 4);
    }

    static int ROUND16(int n, int n2) {
        return Inlines.PSHR32(n, n2);
    }

    static short ROUND16(short s, short s2) {
        return Inlines.EXTRACT16(Inlines.PSHR32(s, s2));
    }

    static int frac_div32(int n, int n2) {
        int n3 = Inlines.celt_ilog2(n2) - 29;
        n = Inlines.VSHR32(n, n3);
        n2 = Inlines.VSHR32(n2, n3);
        int n4 = Inlines.ROUND16(Inlines.celt_rcp(Inlines.ROUND16(n2, 16)), 3);
        int n5 = Inlines.MULT16_32_Q15(n4, n);
        int n6 = Inlines.PSHR32(n, 2) - Inlines.MULT32_32_Q31(n5, n2);
        if ((n5 = Inlines.ADD32(n5, Inlines.SHL32(Inlines.MULT16_32_Q15(n4, n6), 2))) >= 0x20000000) {
            return Integer.MAX_VALUE;
        }
        if (n5 <= -536870912) {
            return -2147483647;
        }
        return Inlines.SHL32(n5, 2);
    }

    static void MatrixSet(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        nArray[n + n2 * n4 + n3] = n5;
    }

    static void MatrixSet(short[] sArray, int n, int n2, int n3, int n4, short s) {
        sArray[n + n2 * n4 + n3] = s;
    }

    static void MatrixSet(int[] nArray, int n, int n2, int n3, int n4) {
        nArray[n * n3 + n2] = n4;
    }

    static void MatrixSet(short[] sArray, int n, int n2, int n3, short s) {
        sArray[n * n3 + n2] = s;
    }

    static float silk_max(float f, float f2) {
        return f > f2 ? f : f2;
    }

    static int silk_max(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static int SATURATE(int n, int n2) {
        return n > n2 ? n2 : (n < -n2 ? -n2 : n);
    }

    static int silk_SUB32(int n, int n2) {
        int n3 = n - n2;
        Inlines.OpusAssert(n3 == Inlines.silk_SUB_SAT32(n, n2));
        return n3;
    }

    static short SATURATE16(int n) {
        return Inlines.EXTRACT16(n > Short.MAX_VALUE ? Short.MAX_VALUE : (n < Short.MIN_VALUE ? Short.MIN_VALUE : n));
    }

    static int celt_div(int n, int n2) {
        return Inlines.MULT32_32_Q31(n, Inlines.celt_rcp(n2));
    }

    private static int SHR(short s, int n) {
        return s >> n;
    }

    private static int SHR(int n, int n2) {
        return n >> n2;
    }

    static long silk_ADD64(long l, long l2) {
        long l3 = l + l2;
        Inlines.OpusAssert(l3 == Inlines.silk_ADD_SAT64(l, l2));
        return l3;
    }

    static short silk_ADD16(short s, short s2) {
        short s3 = (short)(s + s2);
        return s3;
    }

    static short silk_SUB16(short s, short s2) {
        short s3 = (short)(s - s2);
        Inlines.OpusAssert(s3 == Inlines.silk_SUB_SAT16(s, s2));
        return s3;
    }

    static long silk_SUB64(long l, long l2) {
        long l3 = l - l2;
        Inlines.OpusAssert(l3 == Inlines.silk_SUB_SAT64(l, l2));
        return l3;
    }

    static int PDIV32(int n, int n2) {
        return n / n2;
    }

    static int PSHR16(int n, int n2) {
        return Inlines.SHR32(n + (1 << n2 >> 1), n2);
    }

    static short PSHR16(short s, int n) {
        return Inlines.SHR16((short)(s + (1 << n >> 1)), n);
    }

    static int silk_SAT8(int n) {
        return n > 127 ? 127 : (n < -128 ? -128 : n);
    }

    private static int PSHR(int n, int n2) {
        return Inlines.SHR(n + (Inlines.EXTEND32(1) << n2 >> 1), n2);
    }

    static short QCONST16(float f, int n) {
        return (short)(0.5 + (double)(f * (float)(1 << n)));
    }

    static int SILK_CONST(float f, int n) {
        return (int)((double)(f * (float)(1L << n)) + 0.5);
    }

    static short MatrixGet(short[] sArray, int n, int n2, int n3) {
        return sArray[n * n3 + n2];
    }

    static int MatrixGet(int[] nArray, int n, int n2, int n3) {
        return nArray[n * n3 + n2];
    }

    static PitchAnalysisCore.silk_pe_stage3_vals MatrixGet(PitchAnalysisCore.silk_pe_stage3_vals[] silk_pe_stage3_valsArray, int n, int n2, int n3) {
        return silk_pe_stage3_valsArray[n * n3 + n2];
    }

    static int MatrixGet(int[] nArray, int n, int n2, int n3, int n4) {
        return nArray[n + n2 * n4 + n3];
    }

    static short MatrixGet(short[] sArray, int n, int n2, int n3, int n4) {
        return sArray[n + n2 * n4 + n3];
    }

    static long silk_sign(int n) {
        return n > 0 ? 1L : (long)(n < 0 ? -1 : 0);
    }

    static long EC_MINI(long l, long l2) {
        return l + (l2 - l & (long)(l2 < l ? -1 : 0));
    }

    static int QCONST32(float f, int n) {
        return (int)(0.5 + (double)(f * (float)(1 << n)));
    }

    static int silk_SAT32(long l) {
        return l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (l < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)l);
    }

    private static int SHL(int n, int n2) {
        return Inlines.SHL32(n, n2);
    }

    private static int SHL(short s, int n) {
        return Inlines.SHL32(s, n);
    }

    static int NEG32(int n) {
        return 0 - n;
    }

    static int silk_ROR32(int n, int n2) {
        int n3 = 0 - n2;
        if (n2 == 0) {
            return n;
        }
        if (n2 < 0) {
            return n << n3 | n >> 32 - n3;
        }
        return n << 32 - n2 | n >> n2;
    }

    static long silk_SMLAL(long l, int n, int n2) {
        return Inlines.silk_ADD64(l, (long)n * (long)n2);
    }

    static int celt_maxabs16(int[] nArray, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        for (int i = n; i < n2 + n; ++i) {
            n3 = Inlines.MAX32(n3, nArray[i]);
            n4 = Inlines.MIN32(n4, nArray[i]);
        }
        return Inlines.MAX32(Inlines.EXTEND32(n3), -Inlines.EXTEND32(n4));
    }

    static void silk_scale_vector32_Q26_lshift_18(int[] nArray, int n, int n2, int n3) {
        for (int i = n; i < n + n3; ++i) {
            nArray[i] = (int)Inlines.silk_RSHIFT64(Inlines.silk_SMULL(nArray[i], n2), 8);
        }
    }

    static int silk_inner_prod_aligned_scale(short[] sArray, short[] sArray2, int n, int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 = Inlines.silk_ADD_RSHIFT32(n3, Inlines.silk_SMULBB(sArray[i], sArray2[i]), n);
        }
        return n3;
    }

    static int silk_ADD32_ovflw(long l, long l2) {
        return (int)(l + l2);
    }

    static int silk_ADD32_ovflw(int n, int n2) {
        return (int)((long)n + (long)n2);
    }

    static int silk_inner_prod(short[] sArray, int n, short[] sArray2, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < n3; ++i) {
            n4 = Inlines.MAC16_16(n4, sArray[n + i], sArray2[n2 + i]);
        }
        return n4;
    }

    static int silk_SMLABB(int n, int n2, int n3) {
        return n + (short)n2 * (short)n3;
    }

    static int MULT32_32_Q31(int n, int n2) {
        return Inlines.ADD32(Inlines.ADD32(Inlines.SHL(Inlines.MULT16_16(Inlines.SHR(n, 16), Inlines.SHR(n2, 16)), 1), Inlines.SHR(Inlines.MULT16_16SU(Inlines.SHR(n, 16), n2 & 0xFFFF), 15)), Inlines.SHR(Inlines.MULT16_16SU(Inlines.SHR(n2, 16), n & 0xFFFF), 15));
    }

    static int silk_SMULBB(int n, int n2) {
        return (short)n * (short)n2;
    }

    static short FLOAT2INT16(float f) {
        if ((f *= 32768.0f) < -32768.0f) {
            f = -32768.0f;
        }
        if (f > 32767.0f) {
            f = 32767.0f;
        }
        return (short)f;
    }

    static int silk_LIMIT_int(int n, int n2, int n3) {
        return Inlines.silk_LIMIT_32(n, n2, n3);
    }

    static long silk_ADD_SAT64(long l, long l2) {
        long l3 = (l + l2 & Long.MIN_VALUE) == 0L ? ((l & l2 & Long.MIN_VALUE) != 0L ? Long.MIN_VALUE : l + l2) : (((l | l2) & Long.MIN_VALUE) == 0L ? Long.MAX_VALUE : l + l2);
        return l3;
    }

    static short silk_SUB_SAT16(short s, short s2) {
        short s3 = (short)Inlines.silk_SAT16(Inlines.silk_SUB32(s, s2));
        Inlines.OpusAssert(s3 == Inlines.silk_SAT16(s - s2));
        return s3;
    }

    static int silk_ADD_SAT32(int n, int n2) {
        int n3 = ((long)n + (long)n2 & Integer.MIN_VALUE) == 0L ? ((n & n2 & Integer.MIN_VALUE) != 0 ? Integer.MIN_VALUE : n + n2) : (((n | n2) & Integer.MIN_VALUE) == 0 ? Integer.MAX_VALUE : n + n2);
        Inlines.OpusAssert(n3 == Inlines.silk_SAT32((long)n + (long)n2));
        return n3;
    }

    static short silk_ADD_POS_SAT16(short s, short s2) {
        return (short)((s + s2 & 0x8000) != 0 ? Short.MAX_VALUE : s + s2);
    }

    static int silk_ADD_POS_SAT32(int n, int n2) {
        return (n + n2 & Integer.MIN_VALUE) != 0 ? Integer.MAX_VALUE : n + n2;
    }

    static long silk_ADD_POS_SAT64(long l, long l2) {
        return (l + l2 & Long.MIN_VALUE) != 0L ? Long.MAX_VALUE : l + l2;
    }

    static int silk_max_32(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static short silk_max_16(short s, short s2) {
        return s > s2 ? s : s2;
    }

    static int silk_SMLABT(int n, int n2, int n3) {
        return n + (short)n2 * (n3 >> 16);
    }

    static int silk_log2lin(int n) {
        if (n < 0) {
            return 0;
        }
        if (n >= 3967) {
            return Integer.MAX_VALUE;
        }
        int n2 = Inlines.silk_LSHIFT(1, Inlines.silk_RSHIFT(n, 7));
        int n3 = n & 0x7F;
        n2 = n < 2048 ? Inlines.silk_ADD_RSHIFT32(n2, Inlines.silk_MUL(n2, Inlines.silk_SMLAWB(n3, Inlines.silk_SMULBB(n3, 128 - n3), -174)), 7) : Inlines.silk_MLA(n2, Inlines.silk_RSHIFT(n2, 7), Inlines.silk_SMLAWB(n3, Inlines.silk_SMULBB(n3, 128 - n3), -174));
        return n2;
    }

    static int MULT16_32_Q16(int n, int n2) {
        return Inlines.ADD32(Inlines.MULT16_16(n, Inlines.SHR(n2, 16)), Inlines.SHR(Inlines.MULT16_16SU(n, n2 & 0xFFFF), 16));
    }

    static int MULT16_32_Q16(short s, int n) {
        return Inlines.ADD32(Inlines.MULT16_16((int)s, Inlines.SHR(n, 16)), Inlines.SHR(Inlines.MULT16_16SU(s, n & 0xFFFF), 16));
    }

    static int MULT16_32_P16(int n, int n2) {
        return Inlines.ADD32(Inlines.MULT16_16(n, Inlines.SHR(n2, 16)), Inlines.PSHR(Inlines.MULT16_16SU(n, n2 & 0xFFFF), 16));
    }

    static int MULT16_32_P16(short s, int n) {
        return Inlines.ADD32(Inlines.MULT16_16((int)s, Inlines.SHR(n, 16)), Inlines.PSHR(Inlines.MULT16_16SU(s, n & 0xFFFF), 16));
    }

    static int MAC16_32_Q16(int n, short s, short s2) {
        return Inlines.ADD32(n, Inlines.ADD32(Inlines.MULT16_16((int)s, Inlines.SHR(s2, 16)), Inlines.SHR(Inlines.MULT16_16SU(s, s2 & 0xFFFF), 16)));
    }

    static int MAC16_32_Q16(int n, int n2, int n3) {
        return Inlines.ADD32(n, Inlines.ADD32(Inlines.MULT16_16(n2, Inlines.SHR(n3, 16)), Inlines.SHR(Inlines.MULT16_16SU(n2, n3 & 0xFFFF), 16)));
    }

    static int silk_SUB_SAT32(int n, int n2) {
        int n3 = ((long)n - (long)n2 & Integer.MIN_VALUE) == 0L ? ((n & (n2 ^ Integer.MIN_VALUE) & Integer.MIN_VALUE) != 0 ? Integer.MIN_VALUE : n - n2) : (((n ^ Integer.MIN_VALUE) & n2 & Integer.MIN_VALUE) != 0 ? Integer.MAX_VALUE : n - n2);
        Inlines.OpusAssert(n3 == Inlines.silk_SAT32((long)n - (long)n2));
        return n3;
    }

    static int silk_SMULWT(int n, int n2) {
        return (n >> 16) * (n2 >> 16) + ((n & 0xFFFF) * (n2 >> 16) >> 16);
    }

    static int silk_min_32(int n, int n2) {
        return n < n2 ? n : n2;
    }

    static short MULT16_16_Q13(short s, short s2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(s, s2), 13);
    }

    static int MULT16_16_Q13(int n, int n2) {
        return Inlines.SHR(Inlines.MULT16_16(n, n2), 13);
    }

    static short MULT16_16_P13(short s, short s2) {
        return (short)Inlines.SHR(Inlines.ADD32(4096, Inlines.MULT16_16(s, s2)), 13);
    }

    static int MULT16_16_P13(int n, int n2) {
        return Inlines.SHR(Inlines.ADD32(4096, Inlines.MULT16_16(n, n2)), 13);
    }

    static int celt_atan2p(int n, int n2) {
        if (n < n2) {
            int n3 = Inlines.celt_div(Inlines.SHL32(Inlines.EXTEND32(n), 15), n2);
            if (n3 >= Short.MAX_VALUE) {
                n3 = Short.MAX_VALUE;
            }
            return Inlines.SHR32(Inlines.celt_atan01(Inlines.EXTRACT16(n3)), 1);
        }
        int n4 = Inlines.celt_div(Inlines.SHL32(Inlines.EXTEND32(n2), 15), n);
        if (n4 >= Short.MAX_VALUE) {
            n4 = Short.MAX_VALUE;
        }
        return 25736 - Inlines.SHR16(Inlines.celt_atan01(Inlines.EXTRACT16(n4)), 1);
    }

    static int celt_cos_norm(int n) {
        if ((n &= 0x1FFFF) > Inlines.SHL32(Inlines.EXTEND32(1), 16)) {
            n = Inlines.SUB32(Inlines.SHL32(Inlines.EXTEND32(1), 17), n);
        }
        if ((n & Short.MAX_VALUE) != 0) {
            if (n < Inlines.SHL32(Inlines.EXTEND32(1), 15)) {
                return Inlines._celt_cos_pi_2(Inlines.EXTRACT16(n));
            }
            return Inlines.NEG32(Inlines._celt_cos_pi_2(Inlines.EXTRACT16(65536 - n)));
        }
        if ((n & 0xFFFF) != 0) {
            return 0;
        }
        if ((n & 0x1FFFF) != 0) {
            return -32767;
        }
        return Short.MAX_VALUE;
    }

    static int _celt_cos_pi_2(int n) {
        int n2 = Inlines.MULT16_16_P15(n, n);
        return Inlines.ADD32(1, Inlines.MIN32(32766, Inlines.ADD32(Inlines.SUB16(Short.MAX_VALUE, n2), Inlines.MULT16_16_P15(n2, Inlines.ADD32(-7651, Inlines.MULT16_16_P15(n2, Inlines.ADD32(8277, Inlines.MULT16_16_P15(-626, n2))))))));
    }

    static long silk_SMLALBB(long l, short s, short s2) {
        return Inlines.silk_ADD64(l, s * s2);
    }

    static int silk_SUB32_ovflw(int n, int n2) {
        return (int)((long)n - (long)n2);
    }

    static int celt_atan01(int n) {
        return Inlines.MULT16_16_P15(n, Inlines.ADD32(Short.MAX_VALUE, Inlines.MULT16_16_P15(n, Inlines.ADD32(-21, Inlines.MULT16_16_P15(n, Inlines.ADD32(-11943, Inlines.MULT16_16_P15(4936, n)))))));
    }

    static int silk_MLA_ovflw(int n, int n2, int n3) {
        return Inlines.silk_ADD32_ovflw((long)n, (long)n2 * (long)n3);
    }

    static int silk_max_int(int n, int n2) {
        return n > n2 ? n : n2;
    }

    static int silk_SMLABB_ovflw(int n, int n2, int n3) {
        return Inlines.silk_ADD32_ovflw(n, (short)n2 * (short)n3);
    }

    static long silk_SUB_SAT64(long l, long l2) {
        long l3 = (l - l2 & Long.MIN_VALUE) == 0L ? ((l & (l2 ^ Long.MIN_VALUE) & Long.MIN_VALUE) != 0L ? Long.MIN_VALUE : l - l2) : (((l ^ Long.MIN_VALUE) & l2 & Long.MIN_VALUE) != 0L ? Long.MAX_VALUE : l - l2);
        return l3;
    }

    static int MULT16_16_Q11_32(short s, short s2) {
        return Inlines.SHR(Inlines.MULT16_16(s, s2), 11);
    }

    static int MULT16_16_Q11_32(int n, int n2) {
        return Inlines.SHR(Inlines.MULT16_16(n, n2), 11);
    }

    static byte silk_ADD_POS_SAT8(byte by, byte by2) {
        return (byte)((by + by2 & 0x80) != 0 ? 127 : by + by2);
    }

    static int silk_LSHIFT_SAT32(int n, int n2) {
        return Inlines.silk_LSHIFT32(Inlines.silk_LIMIT(n, Inlines.silk_RSHIFT32(Integer.MIN_VALUE, n2), Inlines.silk_RSHIFT32(Integer.MAX_VALUE, n2)), n2);
    }

    static int silk_LIMIT_32(int n, int n2, int n3) {
        return n2 > n3 ? (n > n2 ? n2 : (n < n3 ? n3 : n)) : (n > n3 ? n3 : (n < n2 ? n2 : n));
    }

    static int MUL32_FRAC_Q(int n, int n2, int n3) {
        return (int)Inlines.silk_RSHIFT_ROUND64(Inlines.silk_SMULL(n, n2), n3);
    }

    static void silk_interpolate(short[] sArray, short[] sArray2, short[] sArray3, int n, int n2) {
        Inlines.OpusAssert(n >= 0);
        Inlines.OpusAssert(n <= 4);
        for (int i = 0; i < n2; ++i) {
            sArray[i] = (short)Inlines.silk_ADD_RSHIFT(sArray2[i], Inlines.silk_SMULBB(sArray3[i] - sArray2[i], n), 2);
        }
    }

    static int silk_lin2log(int n) {
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        Inlines.silk_CLZ_FRAC(n, boxedValueInt, boxedValueInt2);
        return Inlines.silk_LSHIFT(31 - boxedValueInt.Val, 7) + Inlines.silk_SMLAWB(boxedValueInt2.Val, Inlines.silk_MUL(boxedValueInt2.Val, 128 - boxedValueInt2.Val), 179);
    }

    static int MULT16_16SU(int n, int n2) {
        return (short)n * (n2 & 0xFFFF);
    }

    static short MULT16_16_Q11(short s, short s2) {
        return (short)Inlines.SHR(Inlines.MULT16_16(s, s2), 11);
    }

    static int MULT16_16_Q11(int n, int n2) {
        return Inlines.SHR(Inlines.MULT16_16(n, n2), 11);
    }

    static int MULT16_16_P14(int n, int n2) {
        return Inlines.SHR(Inlines.ADD32(8192, Inlines.MULT16_16(n, n2)), 14);
    }

    static short MULT16_16_P14(short s, short s2) {
        return (short)Inlines.SHR(Inlines.ADD32(8192, Inlines.MULT16_16(s, s2)), 14);
    }

    static int silk_SMLATT(int n, int n2, int n3) {
        return Inlines.silk_ADD32(n, (n2 >> 16) * (n3 >> 16));
    }

    static int MULT16_16_16(int n, int n2) {
        return n * n2;
    }

    static short MULT16_16_16(short s, short s2) {
        return (short)(s * s2);
    }

    static long silk_max_64(long l, long l2) {
        return l > l2 ? l : l2;
    }

    static byte silk_RSHIFT8(byte by, int n) {
        return (byte)(by >> n);
    }

    static int silk_abs_int32(int n) {
        return (n ^ n >> 31) - (n >> 31);
    }

    static long silk_min_64(long l, long l2) {
        return l < l2 ? l : l2;
    }

    static void silk_CLZ_FRAC(int n, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2) {
        int n2;
        boxedValueInt.Val = n2 = Inlines.silk_CLZ32(n);
        boxedValueInt2.Val = Inlines.silk_ROR32(n, 24 - n2) & 0x7F;
    }

    static int silk_SMLAWT(int n, int n2, int n3) {
        int n4 = n + (n2 >> 16) * (n3 >> 16) + ((n2 & 0xFFFF) * (n3 >> 16) >> 16);
        return n4;
    }

    static short silk_min_16(short s, short s2) {
        return s < s2 ? s : s2;
    }

    static int silk_SUB_RSHIFT32(int n, int n2, int n3) {
        int n4 = n - (n2 >> n3);
        return n4;
    }

    static int silk_ADD_RSHIFT32(int n, int n2, int n3) {
        int n4 = n + (n2 >> n3);
        return n4;
    }

    static byte silk_LSHIFT8(byte by, int n) {
        byte by2 = (byte)(by << n);
        return by2;
    }

    static int MatrixGetPointer(int n, int n2, int n3) {
        return n * n3 + n2;
    }

    static long silk_abs_int64(long l) {
        return l > 0L ? l : -l;
    }

    static short silk_RSHIFT16(short s, int n) {
        return (short)(s >> n);
    }

    static short silk_LSHIFT16(short s, int n) {
        short s2 = (short)(s << n);
        return s2;
    }

    static int silk_LSHIFT_ovflw(int n, int n2) {
        return n << n2;
    }

    static int silk_SMULBT(int n, int n2) {
        return (short)n * (n2 >> 16);
    }

    static int silk_ADD_RSHIFT(int n, int n2, int n3) {
        int n4 = n + (n2 >> n3);
        return n4;
    }

    static short silk_LIMIT_16(short s, short s2, short s3) {
        return s2 > s3 ? (s > s2 ? s2 : (s < s3 ? s3 : s)) : (s > s3 ? s3 : (s < s2 ? s2 : s));
    }

    static long silk_RSHIFT_uint(long l, int n) {
        return Inlines.CapToUInt32(l) >> n;
    }

    static int silk_abs_int16(int n) {
        return (n ^ n >> 15) - (n >> 15);
    }

    static long silk_inner_prod16_aligned_64(short[] sArray, int n, short[] sArray2, int n2, int n3) {
        long l = 0L;
        for (int i = 0; i < n3; ++i) {
            l = Inlines.silk_SMLALBB(l, sArray[n + i], sArray2[n2 + i]);
        }
        return l;
    }
}

