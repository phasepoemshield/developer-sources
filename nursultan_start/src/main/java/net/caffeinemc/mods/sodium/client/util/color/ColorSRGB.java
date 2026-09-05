/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 */
package net.caffeinemc.mods.sodium.client.util.color;

import net.caffeinemc.mods.sodium.api.util.ColorABGR;

public class ColorSRGB {
    private static final int[] TO_SRGB8_TABLE = new int[]{7536653, 7995405, 0x80000D, 8847373, 0x8D000D, 9699341, 10092557, 10551309, 10944538, 11796506, 12648474, 13500442, 14286874, 15138842, 15990810, 0x101001A, 17694771, 19398707, 21037107, 22741043, 24444979, 26148915, 27787315, 29491251, 31195239, 34537575, 37945447, 41287783, 44695655, 48037991, 51445863, 54788199, 58196174, 64946382, 71696590, 78446798, 85197006, 91947205, 98369724, 104530101, 110559576, 121766210, 132317488, 142278944, 151716114, 160694534, 169279740, 177537266, 185532875, 200540590, 214630805, 227869056, 240517486, 252510558, 263979344, 274923843, 285672036, 305660478, 324469277, 342229505, 359006697, 374997459, 390332864, 405012911, 419300145, 446038782, 471139026, 494797485, 517210765, 538575472, 559022678, 578617920, 597623875, 633340926, 666829764, 698418066, 728367975, 756876097, 784204575, 810353408, 835782064, 883426645, 928122119, 970261701, 1010238603, 1048314968, 1084752938, 1119683585, 1153566616, 1217267486, 1276905142, 1333134941, 1386546704, 1437337036, 1485964687, 1532560729, 1577847331, 1662781824, 1742407926, 1817512063, 1888749592, 1956644797, 2021459820, 2083718947};
    private static final float[] FROM_SRGB8_TABLE;
    private static final int MIN_BITS = 0x39000000;
    private static final int MAX_BITS = 0x3F7FFFFF;
    private static final float MIN_BOUND;
    private static final float MAX_BOUND;

    static {
        float[] fArray = new float[256];
        fArray[0] = 0.0f;
        fArray[1] = 3.03527E-4f;
        fArray[2] = 6.07054E-4f;
        fArray[3] = 9.1058103E-4f;
        fArray[4] = 0.001214108f;
        fArray[5] = 0.001517635f;
        fArray[6] = 0.0018211621f;
        fArray[7] = 0.002124689f;
        fArray[8] = 0.002428216f;
        fArray[9] = 0.002731743f;
        fArray[10] = 0.00303527f;
        fArray[11] = 0.0033465356f;
        fArray[12] = 0.003676507f;
        fArray[13] = 0.004024717f;
        fArray[14] = 0.004391442f;
        fArray[15] = 0.0047769533f;
        fArray[16] = 0.005181517f;
        fArray[17] = 0.0056053917f;
        fArray[18] = 0.0060488326f;
        fArray[19] = 0.006512091f;
        fArray[20] = 0.00699541f;
        fArray[21] = 0.0074990317f;
        fArray[22] = 0.008023192f;
        fArray[23] = 0.008568125f;
        fArray[24] = 0.009134057f;
        fArray[25] = 0.009721218f;
        fArray[26] = 0.010329823f;
        fArray[27] = 0.010960094f;
        fArray[28] = 0.011612245f;
        fArray[29] = 0.012286487f;
        fArray[30] = 0.012983031f;
        fArray[31] = 0.013702081f;
        fArray[32] = 0.014443844f;
        fArray[33] = 0.015208514f;
        fArray[34] = 0.015996292f;
        fArray[35] = 0.016807375f;
        fArray[36] = 0.017641952f;
        fArray[37] = 0.018500218f;
        fArray[38] = 0.019382361f;
        fArray[39] = 0.020288562f;
        fArray[40] = 0.02121901f;
        fArray[41] = 0.022173883f;
        fArray[42] = 0.023153365f;
        fArray[43] = 0.02415763f;
        fArray[44] = 0.025186857f;
        fArray[45] = 0.026241222f;
        fArray[46] = 0.027320892f;
        fArray[47] = 0.028426038f;
        fArray[48] = 0.029556843f;
        fArray[49] = 0.03071345f;
        fArray[50] = 0.03189604f;
        fArray[51] = 0.033104774f;
        fArray[52] = 0.03433981f;
        fArray[53] = 0.035601325f;
        fArray[54] = 0.036889452f;
        fArray[55] = 0.038204376f;
        fArray[56] = 0.039546248f;
        fArray[57] = 0.04091521f;
        fArray[58] = 0.042311423f;
        fArray[59] = 0.043735042f;
        fArray[60] = 0.045186214f;
        fArray[61] = 0.046665095f;
        fArray[62] = 0.048171833f;
        fArray[63] = 0.049706575f;
        fArray[64] = 0.051269468f;
        fArray[65] = 0.052860655f;
        fArray[66] = 0.05448028f;
        fArray[67] = 0.056128494f;
        fArray[68] = 0.057805434f;
        fArray[69] = 0.05951124f;
        fArray[70] = 0.06124607f;
        fArray[71] = 0.06301003f;
        fArray[72] = 0.06480328f;
        fArray[73] = 0.06662595f;
        fArray[74] = 0.06847818f;
        fArray[75] = 0.07036011f;
        fArray[76] = 0.07227186f;
        fArray[77] = 0.07421358f;
        fArray[78] = 0.07618539f;
        fArray[79] = 0.07818743f;
        fArray[80] = 0.08021983f;
        fArray[81] = 0.082282715f;
        fArray[82] = 0.084376216f;
        fArray[83] = 0.086500466f;
        fArray[84] = 0.088655606f;
        fArray[85] = 0.09084173f;
        fArray[86] = 0.09305898f;
        fArray[87] = 0.095307484f;
        fArray[88] = 0.09758736f;
        fArray[89] = 0.09989874f;
        fArray[90] = 0.10224175f;
        fArray[91] = 0.10461649f;
        fArray[92] = 0.10702311f;
        fArray[93] = 0.10946172f;
        fArray[94] = 0.111932434f;
        fArray[95] = 0.11443538f;
        fArray[96] = 0.116970696f;
        fArray[97] = 0.11953845f;
        fArray[98] = 0.12213881f;
        fArray[99] = 0.12477186f;
        fArray[100] = 0.12743773f;
        fArray[101] = 0.13013652f;
        fArray[102] = 0.13286836f;
        fArray[103] = 0.13563336f;
        fArray[104] = 0.13843165f;
        fArray[105] = 0.14126332f;
        fArray[106] = 0.1441285f;
        fArray[107] = 0.1470273f;
        fArray[108] = 0.14995982f;
        fArray[109] = 0.15292618f;
        fArray[110] = 0.1559265f;
        fArray[111] = 0.15896086f;
        fArray[112] = 0.16202943f;
        fArray[113] = 0.16513224f;
        fArray[114] = 0.16826946f;
        fArray[115] = 0.17144115f;
        fArray[116] = 0.17464745f;
        fArray[117] = 0.17788847f;
        fArray[118] = 0.1811643f;
        fArray[119] = 0.18447503f;
        fArray[120] = 0.1878208f;
        fArray[121] = 0.19120172f;
        fArray[122] = 0.19461787f;
        fArray[123] = 0.19806935f;
        fArray[124] = 0.2015563f;
        fArray[125] = 0.20507877f;
        fArray[126] = 0.2086369f;
        fArray[127] = 0.21223079f;
        fArray[128] = 0.21586053f;
        fArray[129] = 0.21952623f;
        fArray[130] = 0.22322798f;
        fArray[131] = 0.22696589f;
        fArray[132] = 0.23074007f;
        fArray[133] = 0.23455065f;
        fArray[134] = 0.23839766f;
        fArray[135] = 0.2422812f;
        fArray[136] = 0.2462014f;
        fArray[137] = 0.25015837f;
        fArray[138] = 0.25415218f;
        fArray[139] = 0.2581829f;
        fArray[140] = 0.26225072f;
        fArray[141] = 0.26635566f;
        fArray[142] = 0.27049786f;
        fArray[143] = 0.27467737f;
        fArray[144] = 0.27889434f;
        fArray[145] = 0.2831488f;
        fArray[146] = 0.2874409f;
        fArray[147] = 0.2917707f;
        fArray[148] = 0.29613832f;
        fArray[149] = 0.30054384f;
        fArray[150] = 0.30498737f;
        fArray[151] = 0.30946895f;
        fArray[152] = 0.31398875f;
        fArray[153] = 0.31854683f;
        fArray[154] = 0.32314324f;
        fArray[155] = 0.32777813f;
        fArray[156] = 0.33245158f;
        fArray[157] = 0.33716366f;
        fArray[158] = 0.34191445f;
        fArray[159] = 0.3467041f;
        fArray[160] = 0.3515327f;
        fArray[161] = 0.35640025f;
        fArray[162] = 0.36130688f;
        fArray[163] = 0.3662527f;
        fArray[164] = 0.37123778f;
        fArray[165] = 0.37626222f;
        fArray[166] = 0.3813261f;
        fArray[167] = 0.38642952f;
        fArray[168] = 0.39157256f;
        fArray[169] = 0.3967553f;
        fArray[170] = 0.40197787f;
        fArray[171] = 0.4072403f;
        fArray[172] = 0.4125427f;
        fArray[173] = 0.41788515f;
        fArray[174] = 0.42326775f;
        fArray[175] = 0.42869055f;
        fArray[176] = 0.4341537f;
        fArray[177] = 0.43965724f;
        fArray[178] = 0.44520125f;
        fArray[179] = 0.45078585f;
        fArray[180] = 0.45641106f;
        fArray[181] = 0.46207705f;
        fArray[182] = 0.46778384f;
        fArray[183] = 0.47353154f;
        fArray[184] = 0.47932023f;
        fArray[185] = 0.48514998f;
        fArray[186] = 0.4910209f;
        fArray[187] = 0.49693304f;
        fArray[188] = 0.5028866f;
        fArray[189] = 0.50888145f;
        fArray[190] = 0.5149178f;
        fArray[191] = 0.5209957f;
        fArray[192] = 0.52711535f;
        fArray[193] = 0.5332766f;
        fArray[194] = 0.5394797f;
        fArray[195] = 0.5457247f;
        fArray[196] = 0.5520116f;
        fArray[197] = 0.5583406f;
        fArray[198] = 0.5647117f;
        fArray[199] = 0.57112503f;
        fArray[200] = 0.57758063f;
        fArray[201] = 0.5840786f;
        fArray[202] = 0.590619f;
        fArray[203] = 0.597202f;
        fArray[204] = 0.60382754f;
        fArray[205] = 0.61049575f;
        fArray[206] = 0.61720675f;
        fArray[207] = 0.62396055f;
        fArray[208] = 0.63075733f;
        fArray[209] = 0.637597f;
        fArray[210] = 0.6444799f;
        fArray[211] = 0.6514058f;
        fArray[212] = 0.65837497f;
        fArray[213] = 0.66538745f;
        fArray[214] = 0.67244333f;
        fArray[215] = 0.6795426f;
        fArray[216] = 0.68668544f;
        fArray[217] = 0.69387203f;
        fArray[218] = 0.70110214f;
        fArray[219] = 0.70837605f;
        fArray[220] = 0.7156938f;
        fArray[221] = 0.72305536f;
        fArray[222] = 0.730461f;
        fArray[223] = 0.7379107f;
        fArray[224] = 0.7454045f;
        fArray[225] = 0.75294244f;
        fArray[226] = 0.76052475f;
        fArray[227] = 0.7681514f;
        fArray[228] = 0.77582246f;
        fArray[229] = 0.78353804f;
        fArray[230] = 0.79129815f;
        fArray[231] = 0.79910296f;
        fArray[232] = 0.8069525f;
        fArray[233] = 0.8148468f;
        fArray[234] = 0.822786f;
        fArray[235] = 0.8307701f;
        fArray[236] = 0.83879924f;
        fArray[237] = 0.84687346f;
        fArray[238] = 0.8549928f;
        fArray[239] = 0.8631574f;
        fArray[240] = 0.87136734f;
        fArray[241] = 0.8796226f;
        fArray[242] = 0.8879232f;
        fArray[243] = 0.89626956f;
        fArray[244] = 0.90466136f;
        fArray[245] = 0.913099f;
        fArray[246] = 0.92158204f;
        fArray[247] = 0.93011117f;
        fArray[248] = 0.9386859f;
        fArray[249] = 0.9473069f;
        fArray[250] = 0.9559735f;
        fArray[251] = 0.9646866f;
        fArray[252] = 0.9734455f;
        fArray[253] = 0.98225087f;
        fArray[254] = 0.9911022f;
        fArray[255] = 1.0f;
        FROM_SRGB8_TABLE = fArray;
        MIN_BOUND = Float.intBitsToFloat(0x39000000);
        MAX_BOUND = Float.intBitsToFloat(0x3F7FFFFF);
    }

    public static float srgbToLinear(int n) {
        return FROM_SRGB8_TABLE[n & 0xFF];
    }

    private static int linearToSrgb(float f) {
        int n = Float.floatToRawIntBits(ColorSRGB.clampLinearInput(f));
        int n2 = TO_SRGB8_TABLE[n - 0x39000000 >> 20];
        int n3 = n2 >>> 16 << 9;
        int n4 = n2 & 0xFFFF;
        int n5 = n >>> 12 & 0xFF;
        return n3 + n4 * n5 >>> 16;
    }

    public static int linearToSrgb(float f, float f2, float f3, int n) {
        return ColorABGR.pack((int)ColorSRGB.linearToSrgb(f), (int)ColorSRGB.linearToSrgb(f2), (int)ColorSRGB.linearToSrgb(f3), (int)n);
    }

    private static float clampLinearInput(float f) {
        if (!(f > MIN_BOUND)) {
            f = MIN_BOUND;
        }
        if (f > MAX_BOUND) {
            f = MAX_BOUND;
        }
        return f;
    }
}

