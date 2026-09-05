/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.lwjgl.system.MemoryUtil
 */
package ruhack.phobia;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;

public class kk {
    private static final float ANTIALIAS_PADDING = 1.5f;
    private static long[] iapg;
    public static final boolean c;
    private static final int UNIFORM_SIZE = 256;
    public static final int b;
    private static int[] iapl;
    public static final long pg = 2153300172347522035L;
    private static long[] iaph;
    private static GpuBuffer uniformBuffer;
    private static ByteBuffer uniformData;
    private static RenderPipeline pipeline;
    public static final boolean a;
    private static int[] iapm;

    private static /* synthetic */ void ibev() {
        kk.iapl[100] = -1167424433;
        kk.iapl[101] = -1527516132;
        kk.iapl[102] = -38040237;
        kk.iapl[103] = 1097676641;
        kk.iapl[104] = -795455107;
        kk.iapl[105] = -15249389;
        kk.iapl[106] = 1602750409;
        kk.iapl[107] = 1936991550;
        kk.iapl[108] = 24447661;
        kk.iapl[109] = -1409593187;
        kk.iapl[110] = 1252894400;
        kk.iapl[111] = -111450599;
        kk.iapl[112] = -803654873;
        kk.iapl[113] = -1921399999;
        kk.iapl[114] = -513846281;
        kk.iapl[115] = -522171960;
        kk.iapl[116] = 1034599135;
        kk.iapl[117] = -1594924062;
        kk.iapl[118] = 1672173242;
        kk.iapl[119] = -912947319;
        kk.iapl[120] = -616323713;
        kk.iapl[121] = -347107242;
        kk.iapl[122] = 1836695246;
        kk.iapl[123] = 765192675;
        kk.iapl[124] = 778299321;
        kk.iapl[125] = 1243872951;
        kk.iapl[126] = -1065028225;
        kk.iapl[127] = -1449390722;
        kk.iapl[128] = -302992780;
        kk.iapl[129] = 1542693780;
        kk.iapl[130] = 76532325;
        kk.iapl[131] = -782700037;
        kk.iapl[132] = -1941792838;
        kk.iapl[133] = -476962199;
        kk.iapl[134] = -1337420545;
        kk.iapl[135] = -617388925;
        kk.iapl[136] = -2096543250;
        kk.iapl[137] = -727027811;
        kk.iapl[138] = 42350590;
        kk.iapl[139] = -588544194;
        kk.iapl[140] = -821896040;
        kk.iapl[141] = -136475350;
        kk.iapl[142] = -1802494078;
        kk.iapl[143] = 1425929225;
        kk.iapl[144] = 384812021;
        kk.iapl[145] = 653819078;
        kk.iapl[146] = -1080062485;
        kk.iapl[147] = -707900470;
        kk.iapl[148] = -1442053970;
        kk.iapl[149] = 72536763;
        kk.iapl[150] = 1406781001;
        kk.iapl[151] = 581510879;
        kk.iapl[152] = 434713448;
        kk.iapl[153] = -442922516;
        kk.iapl[154] = 182972089;
        kk.iapl[155] = 1992536883;
        kk.iapl[156] = -385056638;
        kk.iapl[157] = 2019557569;
        kk.iapl[158] = -582304221;
        kk.iapl[159] = 335513791;
        kk.iapl[160] = 107907093;
        kk.iapl[161] = -1744094072;
        kk.iapl[162] = 1825914765;
        kk.iapl[163] = 1855809175;
        kk.iapl[164] = 1965741122;
        kk.iapl[165] = 1867111796;
        kk.iapl[166] = 563826898;
        kk.iapl[167] = 745665677;
        kk.iapl[168] = 579830209;
        kk.iapl[169] = -2054331623;
        kk.iapl[170] = 1180016127;
        kk.iapl[171] = -707020555;
        kk.iapl[172] = 311757648;
        kk.iapl[173] = -652236104;
        kk.iapl[174] = 1594243649;
        kk.iapl[175] = 619303027;
        kk.iapl[176] = 1859220045;
        kk.iapl[177] = -625360156;
        kk.iapl[178] = 1841702468;
        kk.iapl[179] = -1206440959;
        kk.iapl[180] = -713476427;
        kk.iapl[181] = -1506835982;
        kk.iapl[182] = -1084926471;
        kk.iapl[183] = -101296338;
        kk.iapl[184] = 1748226079;
        kk.iapl[185] = 1863678703;
        kk.iapl[186] = -527692818;
        kk.iapl[187] = -93977021;
        kk.iapl[188] = 1689297642;
        kk.iapl[189] = -293782815;
        kk.iapl[190] = 1348837149;
        kk.iapl[191] = -257492622;
        kk.iapl[192] = -1908106895;
        kk.iapl[193] = -96603732;
        kk.iapl[194] = 2102000962;
        kk.iapl[195] = 472904536;
        kk.iapl[196] = -542645442;
        kk.iapl[197] = -50469601;
        kk.iapl[198] = 1354530475;
        kk.iapl[199] = -1264269796;
    }

    private static /* synthetic */ void ibfb() {
        kk.iapg[100] = 9192691999907216242L;
        kk.iapg[101] = -7495747379052056301L;
        kk.iapg[102] = -5475623795533999384L;
        kk.iapg[103] = -7976173079566543985L;
        kk.iapg[104] = -3449594161642065500L;
        kk.iapg[105] = 7197035278718176843L;
        kk.iapg[106] = -2120237367472881212L;
        kk.iapg[107] = 2693550616208303013L;
        kk.iapg[108] = -1020263345371534194L;
        kk.iapg[109] = -4407122698494859631L;
        kk.iapg[110] = 5052492879932381904L;
        kk.iapg[111] = -5999981932894950482L;
        kk.iapg[112] = 5881071349483059837L;
        kk.iapg[113] = 2195295057710686875L;
        kk.iapg[114] = 6532897792152338864L;
        kk.iapg[115] = -32407982960421243L;
        kk.iapg[116] = -4271884059626815672L;
        kk.iapg[117] = -2162077905229272962L;
        kk.iapg[118] = 4177487055646008688L;
        kk.iapg[119] = -4119475978452368028L;
        kk.iapg[120] = 3875836531585692646L;
        kk.iapg[121] = 5607746201611261840L;
        kk.iapg[122] = 9161096712998229601L;
        kk.iapg[123] = -8984608720085457291L;
        kk.iapg[124] = 6566684203821340213L;
        kk.iapg[125] = 4640437722748836034L;
        kk.iapg[126] = -5341565751171290937L;
        kk.iapg[127] = 7992860273105328110L;
    }

    private static /* synthetic */ int iapk(int n2) {
        return iapl[n2] ^ iapm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        v0 /* !! */  = kk.pg;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(v1 - kk.iapi("ibbo", iapf(int ), (int)90));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1608437606: {
                    v1 = kk.iapi("ibbp", iapf(int ), (int)91);
                    continue block59;
                }
                case 462404595: {
                    break block59;
                }
                case 627439881: {
                    v1 = kk.iapi("ibbq", iapf(int ), (int)92);
                    continue block59;
                }
                case 1099577400: {
                    v1 = kk.iapi("ibbr", iapf(int ), (int)93);
                    continue block59;
                }
            }
            break;
        }
        var2 = kk.c;
        v2 /* !! */  = kk.pg;
        if (true) ** GOTO lbl22
        block60: while (true) {
            v2 /* !! */  = (long)(v3 - kk.iapi("ibbs", iapf(int ), (int)94));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2130118796: {
                    v3 = kk.iapi("ibbt", iapf(int ), (int)95);
                    continue block60;
                }
                case -711053180: {
                    v3 = kk.iapi("ibbu", iapf(int ), (int)96);
                    continue block60;
                }
                case 462404595: {
                    break block60;
                }
            }
            break;
        }
        var1_1 /* !! */  = kk.b;
        v4 /* !! */  = kk.pg;
        if (true) ** GOTO lbl36
        block61: while (true) {
            v4 /* !! */  = (long)(v5 - kk.iapi("ibbv", iapf(int ), (int)97));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1961132854: {
                    v5 = kk.iapi("ibbw", iapf(int ), (int)98);
                    continue block61;
                }
                case -878295703: {
                    v5 = kk.iapi("ibbx", iapf(int ), (int)99);
                    continue block61;
                }
                case 462404595: {
                    break block61;
                }
            }
            break;
        }
        var0_2 = kk.a;
        if (!var2) ** GOTO lbl52
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl52:
                // 1 sources

                if (var0_2 || var0_2) continue block62;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = kk.pg - kk.iapi("ibby", iapf(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == kk.iapi("ibbz", iapk(int ), (int)218)) break;
                    v6 /* !! */  = (long)kk.iapi("ibca", iapk(int ), (int)219);
                }
                if (kk.uniformBuffer == null) ** GOTO lbl87
                if (var0_2 || var0_2) continue block62;
                v7 /* !! */  = kk.pg;
                if (true) ** GOTO lbl64
                block64: while (true) {
                    v7 /* !! */  = (long)(v8 - kk.iapi("ibcb", iapf(int ), (int)101));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1905168285: {
                            v8 = kk.iapi("ibcc", iapf(int ), (int)102);
                            continue block64;
                        }
                        case 198038138: {
                            v8 = kk.iapi("ibcd", iapf(int ), (int)103);
                            continue block64;
                        }
                        case 462404595: {
                            break block64;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = kk.pg - kk.iapi("ibce", iapf(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == kk.iapi("ibcf", iapk(int ), (int)220)) break;
                    v9 /* !! */  = (long)kk.iapi("ibcg", iapk(int ), (int)221);
                }
                kk.uniformBuffer.close();
                if (var0_2 || var0_2) continue block62;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = kk.pg - kk.iapi("ibch", iapf(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kk.iapi("ibci", iapk(int ), (int)222)) break;
                    v10 /* !! */  = (long)kk.iapi("ibcj", iapk(int ), (int)223);
                }
                kk.uniformBuffer = null;
                if (var0_2) continue block62;
lbl87:
                // 2 sources

                if (var0_2 || var0_2) continue block62;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = kk.pg - kk.iapi("ibck", iapf(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == kk.iapi("ibcl", iapk(int ), (int)224)) break;
                    v11 /* !! */  = (long)kk.iapi("ibcm", iapk(int ), (int)225);
                }
                if (kk.uniformData == null) ** GOTO lbl140
                if (var0_2 || var0_2) continue block62;
                v12 /* !! */  = kk.pg;
                if (true) ** GOTO lbl99
                block68: while (true) {
                    v12 /* !! */  = (long)(v13 - kk.iapi("ibcn", iapf(int ), (int)107));
lbl99:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2079178756: {
                            v13 = kk.iapi("ibco", iapf(int ), (int)108);
                            continue block68;
                        }
                        case -811212733: {
                            v13 = kk.iapi("ibcp", iapf(int ), (int)109);
                            continue block68;
                        }
                        case 462404595: {
                            break block68;
                        }
                        case 1856946038: {
                            v13 = kk.iapi("ibcq", iapf(int ), (int)110);
                            continue block68;
                        }
                    }
                    break;
                }
                v14 /* !! */  = kk.pg;
                if (true) ** GOTO lbl115
                block69: while (true) {
                    v14 /* !! */  = (long)(v15 - kk.iapi("ibcr", iapf(int ), (int)111));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1165045818: {
                            v15 = kk.iapi("ibcs", iapf(int ), (int)112);
                            continue block69;
                        }
                        case -987423776: {
                            v15 = kk.iapi("ibct", iapf(int ), (int)113);
                            continue block69;
                        }
                        case 462404595: {
                            break block69;
                        }
                        case 538583086: {
                            v15 = kk.iapi("ibcu", iapf(int ), (int)114);
                            continue block69;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)kk.uniformData);
                if (var0_2 || var0_2) continue block62;
                v16 /* !! */  = kk.pg;
                if (true) ** GOTO lbl133
                block70: while (true) {
                    v16 /* !! */  = (long)(kk.iapi("ibcw", iapf(int ), (int)116) - kk.iapi("ibcv", iapf(int ), (int)115));
lbl133:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 462404595: {
                            break block70;
                        }
                        case 1141345374: {
                            continue block70;
                        }
                    }
                    break;
                }
                kk.uniformData = null;
                if (var0_2) continue block62;
lbl140:
                // 2 sources

                if (var0_2 || var0_2) continue block62;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = kk.pg - kk.iapi("ibcx", iapf(int ), (int)117)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == kk.iapi("ibcy", iapk(int ), (int)226)) break;
                    v17 /* !! */  = (long)kk.iapi("ibcz", iapk(int ), (int)227);
                }
                kk.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                continue block62;
                return;
                case 0: {
                    var1_1 /* !! */  = (int)kk.iapi("ibda", iapk(int ), (int)228);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl155:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdb", iapk(int ), (int)229);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl160:
                // 2 sources

                case 2: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdc", iapk(int ), (int)230);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
lbl165:
                // 2 sources

                case 3: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdd", iapk(int ), (int)231);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl170:
                // 2 sources

                case 4: {
                    var1_1 /* !! */  = (int)kk.iapi("ibde", iapk(int ), (int)232);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
                case 5: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdf", iapk(int ), (int)233);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl180:
                // 2 sources

                case 6: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdg", iapk(int ), (int)234);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
lbl185:
                // 3 sources

                case 7: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdh", iapk(int ), (int)235);
                    if (!var2) ** GOTO lbl155
                    throw null;
                }
                case 8: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdi", iapk(int ), (int)236);
                    if (!var2) ** GOTO lbl170
                    throw null;
                }
                case 9: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdj", iapk(int ), (int)237);
                    if (!var2) ** GOTO lbl160
                    throw null;
                }
lbl197:
                // 2 sources

                case 10: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdk", iapk(int ), (int)238);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl226
                }
lbl202:
                // 2 sources

                case 11: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdl", iapk(int ), (int)239);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
                case 12: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdm", iapk(int ), (int)240);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl235
                }
                case 13: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdn", iapk(int ), (int)241);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl217:
                // 2 sources

                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)kk.iapi("ibdo", iapk(int ), (int)242);
                        if (!var2) ** GOTO lbl197
                        throw null;
                    }
                }
lbl222:
                // 2 sources

                case 15: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdp", iapk(int ), (int)243);
                    if (!var2) ** GOTO lbl185
                    throw null;
                }
lbl226:
                // 2 sources

                case 16: {
                    var1_1 /* !! */  = (int)kk.iapi("ibdq", iapk(int ), (int)244);
                    if (!var2) ** GOTO lbl180
                    throw null;
                }
lbl230:
                // 4 sources

                case 17: {
                    do {
                        var1_1 /* !! */  = (int)kk.iapi("ibdr", iapk(int ), (int)245);
                    } while (!var2);
                    throw null;
                }
lbl235:
                // 4 sources

                case 18: {
                    var1_1 /* !! */  = (int)kk.iapi("ibds", iapk(int ), (int)246);
                    if (!var2) ** GOTO lbl165
                    throw null;
                }
                case 19: 
            }
        }
        var1_1 /* !! */  = (int)kk.iapi("ibdt", iapk(int ), (int)247);
        ** while (!var2)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float iawd(int n2) {
        return Float.intBitsToFloat(iapl[n2] ^ iapm[n2]);
    }

    private static /* synthetic */ void ibeu() {
        kk.iapl[0] = 924412403;
        kk.iapl[1] = 1786425003;
        kk.iapl[2] = -2117332665;
        kk.iapl[3] = 732012724;
        kk.iapl[4] = 643873046;
        kk.iapl[5] = 1537129174;
        kk.iapl[6] = 9697051;
        kk.iapl[7] = 347393025;
        kk.iapl[8] = 688293681;
        kk.iapl[9] = 1771922255;
        kk.iapl[10] = -1241501170;
        kk.iapl[11] = -1713882257;
        kk.iapl[12] = 262410823;
        kk.iapl[13] = -1169889629;
        kk.iapl[14] = 1623751998;
        kk.iapl[15] = -683665145;
        kk.iapl[16] = 2002200576;
        kk.iapl[17] = 525722819;
        kk.iapl[18] = 2090059615;
        kk.iapl[19] = -1413943395;
        kk.iapl[20] = 903168080;
        kk.iapl[21] = -456689799;
        kk.iapl[22] = 912089205;
        kk.iapl[23] = -1346596186;
        kk.iapl[24] = 1006855850;
        kk.iapl[25] = -1354986191;
        kk.iapl[26] = 1288567048;
        kk.iapl[27] = -1221820262;
        kk.iapl[28] = 713303936;
        kk.iapl[29] = -1276540056;
        kk.iapl[30] = 279741625;
        kk.iapl[31] = 1524333381;
        kk.iapl[32] = -567372779;
        kk.iapl[33] = 467260454;
        kk.iapl[34] = -1040847876;
        kk.iapl[35] = -969856822;
        kk.iapl[36] = -1181576438;
        kk.iapl[37] = 1091167809;
        kk.iapl[38] = 1990931899;
        kk.iapl[39] = -36101545;
        kk.iapl[40] = -1052733703;
        kk.iapl[41] = -419454968;
        kk.iapl[42] = -945940474;
        kk.iapl[43] = -659529714;
        kk.iapl[44] = -1063145402;
        kk.iapl[45] = 1876462145;
        kk.iapl[46] = -32246272;
        kk.iapl[47] = 1364756980;
        kk.iapl[48] = -1764183558;
        kk.iapl[49] = 1963394999;
        kk.iapl[50] = 287730930;
        kk.iapl[51] = 841839805;
        kk.iapl[52] = 317595790;
        kk.iapl[53] = -1738290819;
        kk.iapl[54] = -1897430075;
        kk.iapl[55] = -2023614162;
        kk.iapl[56] = 1148715456;
        kk.iapl[57] = -1537956512;
        kk.iapl[58] = -1518449939;
        kk.iapl[59] = -1709781200;
        kk.iapl[60] = -389853395;
        kk.iapl[61] = -1389895793;
        kk.iapl[62] = 692812787;
        kk.iapl[63] = 1453668451;
        kk.iapl[64] = 1645775891;
        kk.iapl[65] = -1830183558;
        kk.iapl[66] = 246904754;
        kk.iapl[67] = 1555163254;
        kk.iapl[68] = -124450664;
        kk.iapl[69] = -120118438;
        kk.iapl[70] = 1132313891;
        kk.iapl[71] = 1893627701;
        kk.iapl[72] = -2088590995;
        kk.iapl[73] = -1111183989;
        kk.iapl[74] = 95819125;
        kk.iapl[75] = 783265804;
        kk.iapl[76] = 1053480717;
        kk.iapl[77] = -574772415;
        kk.iapl[78] = 674373901;
        kk.iapl[79] = -1322925199;
        kk.iapl[80] = 1394226126;
        kk.iapl[81] = -1142098559;
        kk.iapl[82] = -554446788;
        kk.iapl[83] = 960991318;
        kk.iapl[84] = -2009483941;
        kk.iapl[85] = 1550794664;
        kk.iapl[86] = -409152341;
        kk.iapl[87] = 652238135;
        kk.iapl[88] = -1078184699;
        kk.iapl[89] = -1925648549;
        kk.iapl[90] = 813498849;
        kk.iapl[91] = -1621915712;
        kk.iapl[92] = 1633877190;
        kk.iapl[93] = -585384569;
        kk.iapl[94] = -1193632536;
        kk.iapl[95] = 909482354;
        kk.iapl[96] = 76949901;
        kk.iapl[97] = -2764853;
        kk.iapl[98] = 1219911334;
        kk.iapl[99] = -263220618;
    }

    public kk() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int ... var8_8) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kk.pg - kk.iapi("iauq", iapf(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kk.iapi("iaur", iapk(int ), (int)67)) break;
            v0 /* !! */  = (long)kk.iapi("iaus", iapk(int ), (int)68);
        }
        var11_9 = kk.c;
        v1 /* !! */  = kk.pg;
        if (true) ** GOTO lbl11
        block13: while (true) {
            v1 /* !! */  = (long)(kk.iapi("iauu", iapf(int ), (int)69) - kk.iapi("iaut", iapf(int ), (int)68));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 462404595: {
                    break block13;
                }
                case 1766694626: {
                    continue block13;
                }
            }
            break;
        }
        var10_10 /* !! */  = kk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kk.pg - kk.iapi("iauv", iapf(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kk.iapi("iauw", iapk(int ), (int)69)) break;
            v2 /* !! */  = (long)kk.iapi("iaux", iapk(int ), (int)70);
        }
        var9_11 = kk.a;
        if (var11_9) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var9_11 || var9_11) ** GOTO lbl25
        v3 = kk.iapi("iauy", iapk(int ), (int)71);
        v4 = kk.iapi("iauz", iapk(int ), (int)72);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = kk.pg - kk.iapi("iava", iapf(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == kk.iapi("iavb", iapk(int ), (int)73)) break;
            v5 /* !! */  = (long)kk.iapi("iavc", iapk(int ), (int)74);
        }
        kk.drawInternal(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, (int)v3, (boolean)v4);
        if (var10_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_11 || var9_11) ** continue;
                return;
            }
            case 0: {
                var10_10 /* !! */  = (int)kk.iapi("iavd", iapk(int ), (int)75);
                if (var11_9) {
                    throw null;
                }
                ** GOTO lbl59
            }
lbl46:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var10_10 /* !! */  = (int)kk.iapi("iave", iapk(int ), (int)76);
                    if (!var11_9) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var10_10 /* !! */  = (int)kk.iapi("iavf", iapk(int ), (int)77);
                if (!var11_9) ** GOTO lbl46
                throw null;
            }
lbl55:
            // 2 sources

            case 3: {
                var10_10 /* !! */  = (int)kk.iapi("iavg", iapk(int ), (int)78);
                if (!var11_9) break;
                throw null;
            }
lbl59:
            // 2 sources

            case 4: {
                var10_10 /* !! */  = (int)kk.iapi("iavh", iapk(int ), (int)79);
                if (!var11_9) ** GOTO lbl55
                throw null;
            }
            case 5: 
        }
        var10_10 /* !! */  = (int)kk.iapi("iavi", iapk(int ), (int)80);
        ** while (!var11_9)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ibey() {
        kk.iapm[100] = -1167424417;
        kk.iapm[101] = -1527515933;
        kk.iapm[102] = -1094415021;
        kk.iapm[103] = 1097676649;
        kk.iapm[104] = -795455102;
        kk.iapm[105] = -1134014445;
        kk.iapm[106] = 1602750262;
        kk.iapm[107] = 806036798;
        kk.iapm[108] = 24447669;
        kk.iapm[109] = -1409593246;
        kk.iapm[110] = 164800192;
        kk.iapm[111] = -111450599;
        kk.iapm[112] = -803654879;
        kk.iapm[113] = -1921400043;
        kk.iapm[114] = -513846305;
        kk.iapm[115] = -522171921;
        kk.iapm[116] = 1034599118;
        kk.iapm[117] = -1594924036;
        kk.iapm[118] = 1672173203;
        kk.iapm[119] = -912947321;
        kk.iapm[120] = -616323752;
        kk.iapm[121] = -347107300;
        kk.iapm[122] = 1836695232;
        kk.iapm[123] = 765192650;
        kk.iapm[124] = 778299361;
        kk.iapm[125] = 1243872910;
        kk.iapm[126] = -1065028282;
        kk.iapm[127] = -1449390788;
        kk.iapm[128] = -302992823;
        kk.iapm[129] = 1542693798;
        kk.iapm[130] = 76532302;
        kk.iapm[131] = -782700086;
        kk.iapm[132] = -1941792868;
        kk.iapm[133] = -476962218;
        kk.iapm[134] = -1337420570;
        kk.iapm[135] = -617388859;
        kk.iapm[136] = -2096543284;
        kk.iapm[137] = -727027756;
        kk.iapm[138] = 42350544;
        kk.iapm[139] = -588544210;
        kk.iapm[140] = -821896033;
        kk.iapm[141] = -136475270;
        kk.iapm[142] = -1802494057;
        kk.iapm[143] = 1425929268;
        kk.iapm[144] = 384812010;
        kk.iapm[145] = 653819118;
        kk.iapm[146] = -1080062494;
        kk.iapm[147] = -707900422;
        kk.iapm[148] = -1442053889;
        kk.iapm[149] = 72536706;
        kk.iapm[150] = 1406780940;
        kk.iapm[151] = 581510812;
        kk.iapm[152] = 434713443;
        kk.iapm[153] = -442922531;
        kk.iapm[154] = 182972147;
        kk.iapm[155] = 1992536947;
        kk.iapm[156] = -385056572;
        kk.iapm[157] = 2019557594;
        kk.iapm[158] = -582304241;
        kk.iapm[159] = 335513752;
        kk.iapm[160] = 107907113;
        kk.iapm[161] = -1744094032;
        kk.iapm[162] = 1825914823;
        kk.iapm[163] = 1855809191;
        kk.iapm[164] = 1965741163;
        kk.iapm[165] = 1867111762;
        kk.iapm[166] = 563826943;
        kk.iapm[167] = 745665733;
        kk.iapm[168] = 579830243;
        kk.iapm[169] = -2054331625;
        kk.iapm[170] = 1180016117;
        kk.iapm[171] = -707020573;
        kk.iapm[172] = 311757668;
        kk.iapm[173] = -652236131;
        kk.iapm[174] = 1594243661;
        kk.iapm[175] = 619302979;
        kk.iapm[176] = 1859220075;
        kk.iapm[177] = -625360149;
        kk.iapm[178] = 1841702505;
        kk.iapm[179] = -1206440902;
        kk.iapm[180] = -713476459;
        kk.iapm[181] = -1506836011;
        kk.iapm[182] = -1084926466;
        kk.iapm[183] = -101296328;
        kk.iapm[184] = 1748226128;
        kk.iapm[185] = 1863678628;
        kk.iapm[186] = -527692829;
        kk.iapm[187] = -93977083;
        kk.iapm[188] = 1689297621;
        kk.iapm[189] = -293782795;
        kk.iapm[190] = 1348837164;
        kk.iapm[191] = -257492659;
        kk.iapm[192] = -1908106923;
        kk.iapm[193] = -96603679;
        kk.iapm[194] = 2102001015;
        kk.iapm[195] = 472904542;
        kk.iapm[196] = -542645390;
        kk.iapm[197] = -50469538;
        kk.iapm[198] = 1354530437;
        kk.iapm[199] = -1264269777;
    }

    static {
        iapl = new int[264];
        iapm = new int[264];
        kk.ibeu();
        kk.ibev();
        kk.ibew();
        kk.ibex();
        kk.ibey();
        kk.ibez();
        iapg = new long[128];
        iaph = new long[128];
        kk.ibfa();
        kk.ibfb();
        kk.ibfc();
        kk.ibfd();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$drawInternal$1() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kk.pg - kk.iapi("ibdu", iapf(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kk.iapi("ibdv", iapk(int ), (int)248)) break;
            v0 /* !! */  = (long)kk.iapi("ibdw", iapk(int ), (int)249);
        }
        var2 = kk.c;
        v1 /* !! */  = kk.pg;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - kk.iapi("ibdx", iapf(int ), (int)119));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1609903434: {
                    v2 = kk.iapi("ibdy", iapf(int ), (int)120);
                    continue block13;
                }
                case 462404595: {
                    break block13;
                }
                case 751885424: {
                    v2 = kk.iapi("ibdz", iapf(int ), (int)121);
                    continue block13;
                }
                case 1840355050: {
                    v2 = kk.iapi("ibea", iapf(int ), (int)122);
                    continue block13;
                }
            }
            break;
        }
        var1_1 /* !! */  = kk.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kk.pg - kk.iapi("ibeb", iapf(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kk.iapi("ibec", iapk(int ), (int)250)) break;
            v3 /* !! */  = (long)kk.iapi("ibed", iapk(int ), (int)251);
        }
        var0_2 = kk.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Arc2D";
            }
lbl41:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)kk.iapi("ibee", iapk(int ), (int)252);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)kk.iapi("ibef", iapk(int ), (int)253);
                if (!var2) ** GOTO lbl41
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)kk.iapi("ibeg", iapk(int ), (int)254);
                if (!var2) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)kk.iapi("ibeh", iapk(int ), (int)255);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ long iapf(int n2) {
        return iapg[n2] ^ iaph[n2];
    }

    private static /* synthetic */ void ibez() {
        kk.iapm[200] = 292455664;
        kk.iapm[201] = 445864420;
        kk.iapm[202] = 1091730999;
        kk.iapm[203] = 53945212;
        kk.iapm[204] = 1999332091;
        kk.iapm[205] = -1007663417;
        kk.iapm[206] = -1773986371;
        kk.iapm[207] = -1602593225;
        kk.iapm[208] = -1991777958;
        kk.iapm[209] = 181362178;
        kk.iapm[210] = 1762946656;
        kk.iapm[211] = 1841740748;
        kk.iapm[212] = -1483173349;
        kk.iapm[213] = -1820383166;
        kk.iapm[214] = 119303293;
        kk.iapm[215] = 1710152888;
        kk.iapm[216] = -1282225634;
        kk.iapm[217] = -1270150365;
        kk.iapm[218] = 678190794;
        kk.iapm[219] = -216019256;
        kk.iapm[220] = 1846459;
        kk.iapm[221] = -1137956353;
        kk.iapm[222] = 1217158953;
        kk.iapm[223] = 1287995665;
        kk.iapm[224] = -1596689987;
        kk.iapm[225] = 1327279621;
        kk.iapm[226] = -230684161;
        kk.iapm[227] = -1516911694;
        kk.iapm[228] = 1361511613;
        kk.iapm[229] = -101931807;
        kk.iapm[230] = -311013934;
        kk.iapm[231] = 1002614011;
        kk.iapm[232] = -746788868;
        kk.iapm[233] = -962362946;
        kk.iapm[234] = -290058076;
        kk.iapm[235] = -186280819;
        kk.iapm[236] = -1081390089;
        kk.iapm[237] = -833967977;
        kk.iapm[238] = -1825556682;
        kk.iapm[239] = -370110724;
        kk.iapm[240] = 1420758030;
        kk.iapm[241] = -811352044;
        kk.iapm[242] = -4722431;
        kk.iapm[243] = -1957105350;
        kk.iapm[244] = 288941595;
        kk.iapm[245] = 1608620243;
        kk.iapm[246] = 1228481164;
        kk.iapm[247] = 1551502942;
        kk.iapm[248] = -1468358398;
        kk.iapm[249] = -1019245146;
        kk.iapm[250] = 975449351;
        kk.iapm[251] = -1576708990;
        kk.iapm[252] = -679550366;
        kk.iapm[253] = 1985588231;
        kk.iapm[254] = 405568141;
        kk.iapm[255] = -1610491772;
        kk.iapm[256] = -509878698;
        kk.iapm[257] = 1436165988;
        kk.iapm[258] = -449221265;
        kk.iapm[259] = -907870065;
        kk.iapm[260] = 12207842;
        kk.iapm[261] = 1170872618;
        kk.iapm[262] = 1673155394;
        kk.iapm[263] = 1418543072;
    }

    private static /* synthetic */ void ibew() {
        kk.iapl[200] = 292455656;
        kk.iapl[201] = 445864400;
        kk.iapl[202] = 1091730998;
        kk.iapl[203] = -964165450;
        kk.iapl[204] = -1039467731;
        kk.iapl[205] = 1007663416;
        kk.iapl[206] = -1773986372;
        kk.iapl[207] = -1602593218;
        kk.iapl[208] = -1991777957;
        kk.iapl[209] = 181362186;
        kk.iapl[210] = 1762946657;
        kk.iapl[211] = 1841740746;
        kk.iapl[212] = -1483173359;
        kk.iapl[213] = -1820383167;
        kk.iapl[214] = 119303295;
        kk.iapl[215] = 1710152891;
        kk.iapl[216] = -1282225634;
        kk.iapl[217] = -1270150362;
        kk.iapl[218] = -678190795;
        kk.iapl[219] = -1079564636;
        kk.iapl[220] = -1846460;
        kk.iapl[221] = -1739414979;
        kk.iapl[222] = 1217158952;
        kk.iapl[223] = 1076040811;
        kk.iapl[224] = -1596689988;
        kk.iapl[225] = 2077466808;
        kk.iapl[226] = -230684162;
        kk.iapl[227] = -614225528;
        kk.iapl[228] = 1361511599;
        kk.iapl[229] = -101931793;
        kk.iapl[230] = -311013932;
        kk.iapl[231] = 1002614007;
        kk.iapl[232] = -746788871;
        kk.iapl[233] = -962362961;
        kk.iapl[234] = -290058080;
        kk.iapl[235] = -186280828;
        kk.iapl[236] = -1081390088;
        kk.iapl[237] = -833967974;
        kk.iapl[238] = -1825556680;
        kk.iapl[239] = -370110736;
        kk.iapl[240] = 1420758020;
        kk.iapl[241] = -811352034;
        kk.iapl[242] = -4722425;
        kk.iapl[243] = -1957105354;
        kk.iapl[244] = 288941578;
        kk.iapl[245] = 1608620241;
        kk.iapl[246] = 1228481167;
        kk.iapl[247] = 1551502926;
        kk.iapl[248] = 1468358397;
        kk.iapl[249] = 1715829371;
        kk.iapl[250] = 975449350;
        kk.iapl[251] = -1567565782;
        kk.iapl[252] = -679550365;
        kk.iapl[253] = 1985588231;
        kk.iapl[254] = 405568141;
        kk.iapl[255] = -1610491769;
        kk.iapl[256] = -509878697;
        kk.iapl[257] = -215657640;
        kk.iapl[258] = 449221264;
        kk.iapl[259] = 515087069;
        kk.iapl[260] = 12207842;
        kk.iapl[261] = 1170872617;
        kk.iapl[262] = 1673155393;
        kk.iapl[263] = 1418543074;
    }

    private static /* synthetic */ void ibfd() {
        kk.iaph[100] = 2012246056845128058L;
        kk.iaph[101] = 7443893249932246116L;
        kk.iaph[102] = 3104841116708914746L;
        kk.iaph[103] = 4472804162258706793L;
        kk.iaph[104] = -7198896924767073387L;
        kk.iaph[105] = -6670106143784162298L;
        kk.iaph[106] = 2529917170539624425L;
        kk.iaph[107] = -8370230232604614806L;
        kk.iaph[108] = -9056429630424515590L;
        kk.iaph[109] = 6581202376888628590L;
        kk.iaph[110] = 9077162855523684689L;
        kk.iaph[111] = 7417017570075884723L;
        kk.iaph[112] = 823670459185478511L;
        kk.iaph[113] = -4678008097425120459L;
        kk.iaph[114] = -995088022155644224L;
        kk.iaph[115] = 5004145054418390995L;
        kk.iaph[116] = -2464737772323742978L;
        kk.iaph[117] = 570378405688469042L;
        kk.iaph[118] = 1920326631362243284L;
        kk.iaph[119] = 8511796552796570902L;
        kk.iaph[120] = 544956435651402943L;
        kk.iaph[121] = -2416541813602970750L;
        kk.iaph[122] = -2789827510537977277L;
        kk.iaph[123] = 5333970793168428808L;
        kk.iaph[124] = -2309519068417942798L;
        kk.iaph[125] = 6967082872304029006L;
        kk.iaph[126] = 5602503090780843823L;
        kk.iaph[127] = 4500556285487013954L;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 43[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawInternal(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int[] var8_8, int var9_9, boolean var10_10) {
        block181: {
            block180: {
                block179: {
                    var19_11 = kk.c;
                    var18_12 /* !! */  = kk.b;
                    var17_13 = kk.a;
                    if (var19_11) {
                        throw null;
lbl6:
                        // 51 sources

                        return;
                    }
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (kk.pipeline != null) break block179;
                    if (var17_13 || var17_13) ** GOTO lbl6
                    kk.init();
                    if (var17_13) ** GOTO lbl6
                }
                if (var17_13 || var17_13) ** GOTO lbl6
                if (kk.pipeline == null) break block180;
                if (var17_13) ** GOTO lbl6
                if (kk.uniformBuffer != null) break block181;
                if (var17_13) ** GOTO lbl6
            }
            if (var17_13 || var17_13) ** GOTO lbl6
            return;
        }
        if (var17_13 || var17_13) ** GOTO lbl6
        var11_14 = kk.uniformData;
        if (var17_13) ** GOTO lbl6
        if (var18_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_13) ** GOTO lbl6
                var11_14.clear();
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.position((int)kk.iapi("iawc", iapk(int ), (int)92));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var1_1 - kk.iapi("iawe", iawd(int ), (int)93)).putFloat(var2_2 - kk.iapi("iawf", iawd(int ), (int)94)).putFloat(var3_3 + kk.iapi("iawg", iawd(int ), (int)95)).putFloat(var3_3 + kk.iapi("iawh", iawd(int ), (int)96));
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var3_3).putFloat(var4_4).putFloat(var5_5).putFloat(var6_6);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.putFloat(var7_7).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.position((int)kk.iapi("iawi", iapk(int ), (int)97));
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_15 = kk.iapi("iawj", iapk(int ), (int)98);
                if (var17_13) ** GOTO lbl6
                do {
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (var12_15 >= kk.iapi("iawk", iapk(int ), (int)99)) ** GOTO lbl91
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (!var10_10) ** GOTO lbl72
                    if (var17_13) ** GOTO lbl6
                    v0 = var9_9;
                    if (var19_11) {
                        throw null;
                    }
                    ** GOTO lbl74
lbl72:
                    // 1 sources

                    if (var17_13 || var17_13) ** GOTO lbl6
                    v0 = var13_17 = kk.colorAt(var8_8, (int)var12_15);
lbl74:
                    // 2 sources

                    if (var17_13 || var17_13) ** GOTO lbl6
                    var11_14.putFloat((float)(var13_17 >> kk.iapi("iawl", iapk(int ), (int)100) & kk.iapi("iawm", iapk(int ), (int)101)) / kk.iapi("iawn", iawd(int ), (int)102));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var11_14.putFloat((float)(var13_17 >> kk.iapi("iawo", iapk(int ), (int)103) & kk.iapi("iawp", iapk(int ), (int)104)) / kk.iapi("iawq", iawd(int ), (int)105));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var11_14.putFloat((float)(var13_17 & kk.iapi("iawr", iapk(int ), (int)106)) / kk.iapi("iaws", iawd(int ), (int)107));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var11_14.putFloat((float)(var13_17 >> kk.iapi("iawt", iapk(int ), (int)108) & kk.iapi("iawu", iapk(int ), (int)109)) / kk.iapi("iawv", iawd(int ), (int)110));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    ++var12_15;
                    if (var17_13) ** GOTO lbl6
                } while (!var19_11);
                throw null;
lbl91:
                // 1 sources

                if (var17_13 || var17_13) ** GOTO lbl6
                var11_14.flip();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_16 = RenderSystem.getDevice().createCommandEncoder();
                if (var17_13 || var17_13) ** GOTO lbl6
                var12_16.writeToBuffer(kk.uniformBuffer.slice(), var11_14);
                if (var17_13 || var17_13) ** GOTO lbl6
                var13_18 = class_310.method_1551().method_1522();
                if (var17_13 || var17_13) ** GOTO lbl6
                var14_19 = var12_16.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$drawInternal$1(), ()Ljava/lang/String;)(), var13_18.method_71639(), OptionalInt.empty());
                if (var17_13) ** GOTO lbl6
                try {
                    if (var17_13) ** GOTO lbl6
                    var14_19.setPipeline(kk.pipeline);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_19.setUniform("Uniforms", kk.uniformBuffer);
                    if (var17_13 || var17_13) ** GOTO lbl6
                    var14_19.draw((int)kk.iapi("iaww", iapk(int ), (int)111), (int)kk.iapi("iawx", iapk(int ), (int)112));
                    if (var17_13 || var17_13) ** GOTO lbl6
                    if (var14_19 == null) ** GOTO lbl135
                    if (var17_13) ** GOTO lbl6
                }
                catch (Throwable var15_20) {
                    if (var17_13) ** GOTO lbl6
                    if (var14_19 == null) ** GOTO lbl128
                    if (var17_13) ** GOTO lbl6
                    try {
                        if (var17_13) ** GOTO lbl6
                        var14_19.close();
                        if (var17_13 || var17_13) ** GOTO lbl6
                        ** if (!var19_11) goto lbl-1000
                    }
                    catch (Throwable var16_21) {
                        if (var17_13) ** GOTO lbl6
                        var15_20.addSuppressed(var16_21);
                        if (var17_13) ** GOTO lbl6
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw null;
                    }
lbl-1000:
                    // 1 sources

                    {
                    }
lbl128:
                    // 3 sources

                    if (var17_13 || var17_13) ** GOTO lbl6
                    throw var15_20;
                }
                var14_19.close();
                if (var17_13) ** GOTO lbl6
                if (var19_11) {
                    throw null;
                }
lbl135:
                // 3 sources

                if (!var17_13 && !var17_13) ** break;
                ** continue;
                return;
            }
            case 0: {
                var18_12 /* !! */  = (int)kk.iapi("iawy", iapk(int ), (int)113);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl528
            }
            case 1: {
                var18_12 /* !! */  = (int)kk.iapi("iawz", iapk(int ), (int)114);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 2: {
                var18_12 /* !! */  = (int)kk.iapi("iaxa", iapk(int ), (int)115);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl153:
            // 2 sources

            case 3: {
                var18_12 /* !! */  = (int)kk.iapi("iaxb", iapk(int ), (int)116);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl158:
            // 2 sources

            case 4: {
                var18_12 /* !! */  = (int)kk.iapi("iaxc", iapk(int ), (int)117);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl163:
            // 6 sources

            case 5: {
                var18_12 /* !! */  = (int)kk.iapi("iaxe", iapk(int ), (int)118);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 6: {
                var18_12 /* !! */  = (int)kk.iapi("iaxf", iapk(int ), (int)119);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl465
            }
            case 7: {
                var18_12 /* !! */  = (int)kk.iapi("iaxg", iapk(int ), (int)120);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl439
            }
            case 8: {
                var18_12 /* !! */  = (int)kk.iapi("iaxh", iapk(int ), (int)121);
                if (!var19_11) ** GOTO lbl163
                throw null;
            }
lbl182:
            // 2 sources

            case 9: {
                var18_12 /* !! */  = (int)kk.iapi("iaxi", iapk(int ), (int)122);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl187:
            // 2 sources

            case 10: {
                var18_12 /* !! */  = (int)kk.iapi("iaxj", iapk(int ), (int)123);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl511
            }
            case 11: {
                var18_12 /* !! */  = (int)kk.iapi("iaxk", iapk(int ), (int)124);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl197:
            // 3 sources

            case 12: {
                var18_12 /* !! */  = (int)kk.iapi("iaxl", iapk(int ), (int)125);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl461
            }
lbl202:
            // 3 sources

            case 13: {
                var18_12 /* !! */  = (int)kk.iapi("iaxm", iapk(int ), (int)126);
                if (!var19_11) ** GOTO lbl182
                throw null;
            }
            case 14: {
                var18_12 /* !! */  = (int)kk.iapi("iaxn", iapk(int ), (int)127);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl494
            }
lbl211:
            // 4 sources

            case 15: {
                var18_12 /* !! */  = (int)kk.iapi("iaxo", iapk(int ), (int)128);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl216:
            // 3 sources

            case 16: {
                var18_12 /* !! */  = (int)kk.iapi("iaxp", iapk(int ), (int)129);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 17: {
                var18_12 /* !! */  = (int)kk.iapi("iaxq", iapk(int ), (int)130);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 18: {
                var18_12 /* !! */  = (int)kk.iapi("iaxr", iapk(int ), (int)131);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl422
            }
            case 19: {
                var18_12 /* !! */  = (int)kk.iapi("iaxs", iapk(int ), (int)132);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 20: {
                var18_12 /* !! */  = (int)kk.iapi("iaxt", iapk(int ), (int)133);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 21: {
                var18_12 /* !! */  = (int)kk.iapi("iaxv", iapk(int ), (int)134);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl246:
            // 2 sources

            case 22: {
                var18_12 /* !! */  = (int)kk.iapi("iaxw", iapk(int ), (int)135);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl358
            }
            case 23: {
                var18_12 /* !! */  = (int)kk.iapi("iaxx", iapk(int ), (int)136);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl358
            }
            case 24: {
                var18_12 /* !! */  = (int)kk.iapi("iaxy", iapk(int ), (int)137);
                if (var19_11) {
                    throw null;
                }
            }
lbl260:
            // 4 sources

            case 25: {
                var18_12 /* !! */  = (int)kk.iapi("iaxz", iapk(int ), (int)138);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl265:
            // 2 sources

            case 26: {
                var18_12 /* !! */  = (int)kk.iapi("iaya", iapk(int ), (int)139);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl457
            }
lbl270:
            // 2 sources

            case 27: {
                var18_12 /* !! */  = (int)kk.iapi("iayb", iapk(int ), (int)140);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl519
            }
            case 28: {
                var18_12 /* !! */  = (int)kk.iapi("iayc", iapk(int ), (int)141);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 29: {
                var18_12 /* !! */  = (int)kk.iapi("iayd", iapk(int ), (int)142);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 30: {
                var18_12 /* !! */  = (int)kk.iapi("iaye", iapk(int ), (int)143);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl290:
            // 3 sources

            case 31: {
                var18_12 /* !! */  = (int)kk.iapi("iayf", iapk(int ), (int)144);
                if (!var19_11) ** GOTO lbl197
                throw null;
            }
lbl294:
            // 2 sources

            case 32: {
                var18_12 /* !! */  = (int)kk.iapi("iayg", iapk(int ), (int)145);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 33: {
                var18_12 /* !! */  = (int)kk.iapi("iayh", iapk(int ), (int)146);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 34: {
                var18_12 /* !! */  = (int)kk.iapi("iayi", iapk(int ), (int)147);
                if (!var19_11) ** GOTO lbl211
                throw null;
            }
lbl308:
            // 2 sources

            case 35: {
                var18_12 /* !! */  = (int)kk.iapi("iayj", iapk(int ), (int)148);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl481
            }
            case 36: {
                var18_12 /* !! */  = (int)kk.iapi("iayk", iapk(int ), (int)149);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl532
            }
lbl318:
            // 2 sources

            case 37: {
                var18_12 /* !! */  = (int)kk.iapi("iayl", iapk(int ), (int)150);
                if (!var19_11) ** GOTO lbl246
                throw null;
            }
lbl322:
            // 2 sources

            case 38: {
                var18_12 /* !! */  = (int)kk.iapi("iaym", iapk(int ), (int)151);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl376
            }
            case 39: {
                var18_12 /* !! */  = (int)kk.iapi("iayn", iapk(int ), (int)152);
                if (!var19_11) ** GOTO lbl270
                throw null;
            }
lbl331:
            // 2 sources

            case 40: {
                var18_12 /* !! */  = (int)kk.iapi("iayo", iapk(int ), (int)153);
                if (!var19_11) ** GOTO lbl318
                throw null;
            }
lbl335:
            // 7 sources

            case 41: {
                var18_12 /* !! */  = (int)kk.iapi("iayp", iapk(int ), (int)154);
                if (!var19_11) break;
                throw null;
            }
lbl339:
            // 2 sources

            case 42: {
                var18_12 /* !! */  = (int)kk.iapi("iayq", iapk(int ), (int)155);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl344:
            // 2 sources

            case 43: {
                var18_12 /* !! */  = (int)kk.iapi("iayr", iapk(int ), (int)156);
                if (!var19_11) ** GOTO lbl158
                throw null;
            }
            case 44: {
                var18_12 /* !! */  = (int)kk.iapi("iayt", iapk(int ), (int)157);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl353:
            // 4 sources

            case 45: {
                var18_12 /* !! */  = (int)kk.iapi("iayv", iapk(int ), (int)158);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl477
            }
lbl358:
            // 4 sources

            case 46: {
                var18_12 /* !! */  = (int)kk.iapi("iayw", iapk(int ), (int)159);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl363:
            // 2 sources

            case 47: {
                var18_12 /* !! */  = (int)kk.iapi("iayx", iapk(int ), (int)160);
                if (!var19_11) ** GOTO lbl202
                throw null;
            }
lbl367:
            // 2 sources

            case 48: {
                var18_12 /* !! */  = (int)kk.iapi("iayy", iapk(int ), (int)161);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl536
            }
lbl372:
            // 2 sources

            case 49: {
                var18_12 /* !! */  = (int)kk.iapi("iayz", iapk(int ), (int)162);
                if (!var19_11) ** GOTO lbl353
                throw null;
            }
lbl376:
            // 3 sources

            case 50: {
                var18_12 /* !! */  = (int)kk.iapi("iaza", iapk(int ), (int)163);
                if (!var19_11) ** GOTO lbl290
                throw null;
            }
            case 51: {
                var18_12 /* !! */  = (int)kk.iapi("iazb", iapk(int ), (int)164);
                if (!var19_11) ** GOTO lbl294
                throw null;
            }
            case 52: {
                var18_12 /* !! */  = (int)kk.iapi("iazc", iapk(int ), (int)165);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl389:
            // 2 sources

            case 53: {
                var18_12 /* !! */  = (int)kk.iapi("iazd", iapk(int ), (int)166);
                if (!var19_11) ** GOTO lbl197
                throw null;
            }
            case 54: {
                var18_12 /* !! */  = (int)kk.iapi("iazf", iapk(int ), (int)167);
                if (!var19_11) ** GOTO lbl335
                throw null;
            }
lbl397:
            // 2 sources

            case 55: {
                var18_12 /* !! */  = (int)kk.iapi("iazg", iapk(int ), (int)168);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl511
            }
            case 56: {
                var18_12 /* !! */  = (int)kk.iapi("iazh", iapk(int ), (int)169);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl407:
            // 3 sources

            case 57: {
                var18_12 /* !! */  = (int)kk.iapi("iazi", iapk(int ), (int)170);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl473
            }
            case 58: {
                var18_12 /* !! */  = (int)kk.iapi("iazj", iapk(int ), (int)171);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl417:
            // 2 sources

            case 59: {
                var18_12 /* !! */  = (int)kk.iapi("iazk", iapk(int ), (int)172);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl523
            }
lbl422:
            // 2 sources

            case 60: {
                var18_12 /* !! */  = (int)kk.iapi("iazl", iapk(int ), (int)173);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl507
            }
            case 61: {
                var18_12 /* !! */  = (int)kk.iapi("iazm", iapk(int ), (int)174);
                if (!var19_11) ** GOTO lbl211
                throw null;
            }
lbl431:
            // 3 sources

            case 62: {
                var18_12 /* !! */  = (int)kk.iapi("iazn", iapk(int ), (int)175);
                if (!var19_11) ** GOTO lbl163
                throw null;
            }
            case 63: {
                var18_12 /* !! */  = (int)kk.iapi("iazo", iapk(int ), (int)176);
                if (!var19_11) ** GOTO lbl322
                throw null;
            }
lbl439:
            // 3 sources

            case 64: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_12 /* !! */  = (int)kk.iapi("iazp", iapk(int ), (int)177);
                    if (!var19_11) ** GOTO lbl397
                    throw null;
                }
            }
            case 65: {
                var18_12 /* !! */  = (int)kk.iapi("iazq", iapk(int ), (int)178);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl532
            }
lbl449:
            // 3 sources

            case 66: {
                var18_12 /* !! */  = (int)kk.iapi("iazr", iapk(int ), (int)179);
                if (!var19_11) ** GOTO lbl153
                throw null;
            }
lbl453:
            // 2 sources

            case 67: {
                var18_12 /* !! */  = (int)kk.iapi("iazs", iapk(int ), (int)180);
                if (!var19_11) ** GOTO lbl439
                throw null;
            }
lbl457:
            // 2 sources

            case 68: {
                var18_12 /* !! */  = (int)kk.iapi("iazt", iapk(int ), (int)181);
                if (!var19_11) ** GOTO lbl163
                throw null;
            }
lbl461:
            // 2 sources

            case 69: {
                var18_12 /* !! */  = (int)kk.iapi("iazu", iapk(int ), (int)182);
                if (!var19_11) ** GOTO lbl358
                throw null;
            }
lbl465:
            // 4 sources

            case 70: {
                var18_12 /* !! */  = (int)kk.iapi("iazv", iapk(int ), (int)183);
                if (!var19_11) ** GOTO lbl260
                throw null;
            }
            case 71: {
                var18_12 /* !! */  = (int)kk.iapi("iazw", iapk(int ), (int)184);
                if (!var19_11) ** GOTO lbl216
                throw null;
            }
lbl473:
            // 3 sources

            case 72: {
                var18_12 /* !! */  = (int)kk.iapi("iazx", iapk(int ), (int)185);
                if (!var19_11) ** GOTO lbl216
                throw null;
            }
lbl477:
            // 2 sources

            case 73: {
                var18_12 /* !! */  = (int)kk.iapi("iazy", iapk(int ), (int)186);
                if (!var19_11) ** GOTO lbl473
                throw null;
            }
lbl481:
            // 3 sources

            case 74: {
                var18_12 /* !! */  = (int)kk.iapi("iazz", iapk(int ), (int)187);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 75: {
                var18_12 /* !! */  = (int)kk.iapi("ibaa", iapk(int ), (int)188);
                if (!var19_11) ** GOTO lbl187
                throw null;
            }
lbl490:
            // 2 sources

            case 76: {
                var18_12 /* !! */  = (int)kk.iapi("ibab", iapk(int ), (int)189);
                if (!var19_11) ** GOTO lbl163
                throw null;
            }
lbl494:
            // 2 sources

            case 77: {
                var18_12 /* !! */  = (int)kk.iapi("ibac", iapk(int ), (int)190);
                if (!var19_11) ** GOTO lbl353
                throw null;
            }
            case 78: {
                var18_12 /* !! */  = (int)kk.iapi("ibad", iapk(int ), (int)191);
                if (!var19_11) ** GOTO lbl465
                throw null;
            }
lbl502:
            // 3 sources

            case 79: {
                var18_12 /* !! */  = (int)kk.iapi("ibae", iapk(int ), (int)192);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl523
            }
lbl507:
            // 2 sources

            case 80: {
                var18_12 /* !! */  = (int)kk.iapi("ibaf", iapk(int ), (int)193);
                if (!var19_11) ** GOTO lbl465
                throw null;
            }
lbl511:
            // 3 sources

            case 81: {
                var18_12 /* !! */  = (int)kk.iapi("ibag", iapk(int ), (int)194);
                if (!var19_11) ** GOTO lbl481
                throw null;
            }
            case 82: {
                var18_12 /* !! */  = (int)kk.iapi("ibah", iapk(int ), (int)195);
                if (!var19_11) ** GOTO lbl163
                throw null;
            }
lbl519:
            // 2 sources

            case 83: {
                var18_12 /* !! */  = (int)kk.iapi("ibai", iapk(int ), (int)196);
                if (!var19_11) ** GOTO lbl344
                throw null;
            }
lbl523:
            // 3 sources

            case 84: {
                var18_12 /* !! */  = (int)kk.iapi("ibaj", iapk(int ), (int)197);
                if (var19_11) {
                    throw null;
                }
                ** GOTO lbl536
            }
lbl528:
            // 2 sources

            case 85: {
                var18_12 /* !! */  = (int)kk.iapi("ibak", iapk(int ), (int)198);
                if (!var19_11) ** GOTO lbl453
                throw null;
            }
lbl532:
            // 3 sources

            case 86: {
                var18_12 /* !! */  = (int)kk.iapi("ibal", iapk(int ), (int)199);
                if (!var19_11) ** GOTO lbl265
                throw null;
            }
lbl536:
            // 3 sources

            case 87: {
                var18_12 /* !! */  = (int)kk.iapi("ibam", iapk(int ), (int)200);
                if (!var19_11) ** GOTO lbl335
                throw null;
            }
            case 88: 
        }
        var18_12 /* !! */  = (int)kk.iapi("iban", iapk(int ), (int)201);
        ** while (!var19_11)
lbl543:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, int var8_8) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kk.pg - kk.iapi("iavj", iapf(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kk.iapi("iavk", iapk(int ), (int)81)) break;
            v0 /* !! */  = (long)kk.iapi("iavl", iapk(int ), (int)82);
        }
        var11_9 = kk.c;
        v1 /* !! */  = kk.pg;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(kk.iapi("iavn", iapf(int ), (int)74) - kk.iapi("iavm", iapf(int ), (int)73));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1775803967: {
                    continue block19;
                }
                case 462404595: {
                    break block19;
                }
            }
            break;
        }
        var10_10 /* !! */  = kk.b;
        v2 /* !! */  = kk.pg;
        if (true) ** GOTO lbl21
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - kk.iapi("iavo", iapf(int ), (int)75));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1876263214: {
                    v3 = kk.iapi("iavp", iapf(int ), (int)76);
                    continue block20;
                }
                case 462404595: {
                    break block20;
                }
                case 1107379065: {
                    v3 = kk.iapi("iavq", iapf(int ), (int)77);
                    continue block20;
                }
                case 1472677279: {
                    v3 = kk.iapi("iavr", iapf(int ), (int)78);
                    continue block20;
                }
            }
            break;
        }
        var9_11 = kk.a;
        if (!var11_9) ** GOTO lbl40
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var10_10 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_10 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl40:
                // 1 sources

                if (var9_11 || var9_11) ** GOTO lbl-1000
                v4 = kk.iapi("iavs", iapk(int ), (int)83);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kk.pg - kk.iapi("iavt", iapf(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kk.iapi("iavu", iapk(int ), (int)84)) break;
                    v5 /* !! */  = (long)kk.iapi("iavv", iapk(int ), (int)85);
                }
                kk.drawInternal(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, null, var8_8, (boolean)v4);
                if (var9_11 || var9_11) continue block21;
                return;
lbl50:
                // 2 sources

                case 0: {
                    do {
                        var10_10 /* !! */  = (int)kk.iapi("iavw", iapk(int ), (int)86);
                    } while (!var11_9);
                    throw null;
                }
                case 1: {
                    var10_10 /* !! */  = (int)kk.iapi("iavx", iapk(int ), (int)87);
                    if (!var11_9) break block21;
                    throw null;
                }
                case 2: {
                    do {
                        var10_10 /* !! */  = (int)kk.iapi("iavy", iapk(int ), (int)88);
                    } while (!var11_9);
                    throw null;
                }
lbl64:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var10_10 /* !! */  = (int)kk.iapi("iavz", iapk(int ), (int)89);
                        if (!var11_9) ** GOTO lbl50
                        throw null;
                    }
                }
                case 4: {
                    var10_10 /* !! */  = (int)kk.iapi("iawa", iapk(int ), (int)90);
                    if (!var11_9) ** GOTO lbl64
                    throw null;
                }
                case 5: 
            }
        }
        var10_10 /* !! */  = (int)kk.iapi("iawb", iapk(int ), (int)91);
        ** while (!var11_9)
lbl76:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite iapi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$0() {
        boolean bl2;
        Object object = pg;
        block4: while (true) {
            switch ((int)object) {
                case -1823874747: {
                    object = kk.iapi("ibej", iapf(int ), (int)125) - kk.iapi("ibei", iapf(int ), (int)124);
                    continue block4;
                }
                case 462404595: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = pg - kk.iapi("ibek", iapf(int ), (int)126)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kk.iapi("ibel", iapk(int ), (int)256)) break;
            object2 = kk.iapi("ibem", iapk(int ), (int)257);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = pg - kk.iapi("iben", iapf(int ), (int)127)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kk.iapi("ibeo", iapk(int ), (int)258)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = kk.iapi("ibep", iapk(int ), (int)259);
        }
        if (!bl2 && !bl2) return "Arc2D Uniforms";
        return null;
    }

    private static /* synthetic */ void ibfa() {
        kk.iapg[0] = 4351407517106726505L;
        kk.iapg[1] = 4245334454472276482L;
        kk.iapg[2] = -8725630461681411223L;
        kk.iapg[3] = 4087764515818766591L;
        kk.iapg[4] = 3836959630928319161L;
        kk.iapg[5] = 4737323442729620828L;
        kk.iapg[6] = -4340385141681847136L;
        kk.iapg[7] = -5058126152614460225L;
        kk.iapg[8] = -7477432888279667061L;
        kk.iapg[9] = -8877233308610511271L;
        kk.iapg[10] = 8179651416944309855L;
        kk.iapg[11] = -8055265649433495941L;
        kk.iapg[12] = 6271387725739641919L;
        kk.iapg[13] = -7069131477689687129L;
        kk.iapg[14] = 5805840286381218417L;
        kk.iapg[15] = 6802447351519646188L;
        kk.iapg[16] = 8261677654545290978L;
        kk.iapg[17] = 4444862298702205846L;
        kk.iapg[18] = 9002943524625187086L;
        kk.iapg[19] = -8327131793883382240L;
        kk.iapg[20] = -7447986928756633478L;
        kk.iapg[21] = 2993354467693554169L;
        kk.iapg[22] = -1803512986352828322L;
        kk.iapg[23] = -1181804238180133107L;
        kk.iapg[24] = -2415253114624703848L;
        kk.iapg[25] = -5288512775112563500L;
        kk.iapg[26] = -672924372432150895L;
        kk.iapg[27] = 24972242354267106L;
        kk.iapg[28] = -4287595460371561536L;
        kk.iapg[29] = 7067804353529409772L;
        kk.iapg[30] = 2065536308621515938L;
        kk.iapg[31] = -6428490910785612853L;
        kk.iapg[32] = -3016489241511210051L;
        kk.iapg[33] = -9130499582337061481L;
        kk.iapg[34] = -5738910564335452736L;
        kk.iapg[35] = 8329844604889084688L;
        kk.iapg[36] = -4936145312426022075L;
        kk.iapg[37] = 4591374056806237805L;
        kk.iapg[38] = 1756929529392662779L;
        kk.iapg[39] = 5787051291919461185L;
        kk.iapg[40] = -4474502162246305247L;
        kk.iapg[41] = -7650813616841228204L;
        kk.iapg[42] = -8638739112261998706L;
        kk.iapg[43] = 9010255539185330621L;
        kk.iapg[44] = 6341391881839728854L;
        kk.iapg[45] = 2968863665057741884L;
        kk.iapg[46] = -3820932951741785336L;
        kk.iapg[47] = -2326424084107906427L;
        kk.iapg[48] = 8725150696360468705L;
        kk.iapg[49] = 8798574628593835411L;
        kk.iapg[50] = 345568445001910439L;
        kk.iapg[51] = 2335387004441231800L;
        kk.iapg[52] = 5749617300452126042L;
        kk.iapg[53] = -834412211896945788L;
        kk.iapg[54] = -7462776744748773547L;
        kk.iapg[55] = 6717542048908620793L;
        kk.iapg[56] = 8527250647872996115L;
        kk.iapg[57] = -3212634291039140266L;
        kk.iapg[58] = -5318030218641801214L;
        kk.iapg[59] = 6771315283610489315L;
        kk.iapg[60] = 5018155027321450389L;
        kk.iapg[61] = 8439232063674503190L;
        kk.iapg[62] = 721122534888021697L;
        kk.iapg[63] = -5490839044471339716L;
        kk.iapg[64] = 5291159745921931785L;
        kk.iapg[65] = -7039520014135102785L;
        kk.iapg[66] = 158098979556098283L;
        kk.iapg[67] = 3076209147662038258L;
        kk.iapg[68] = 11510803550836954L;
        kk.iapg[69] = -5550032830762659782L;
        kk.iapg[70] = 1904746851631097030L;
        kk.iapg[71] = -2807545254174269351L;
        kk.iapg[72] = -6136384169474081951L;
        kk.iapg[73] = 1546935795520030623L;
        kk.iapg[74] = 6843748580562020632L;
        kk.iapg[75] = -6520758403643993589L;
        kk.iapg[76] = -4819146852063227747L;
        kk.iapg[77] = 2456512243786081399L;
        kk.iapg[78] = 3189186130479065926L;
        kk.iapg[79] = 3126024011579737480L;
        kk.iapg[80] = 3346675217030882074L;
        kk.iapg[81] = 700750797655280554L;
        kk.iapg[82] = -5778862965208170837L;
        kk.iapg[83] = -7557867892372595152L;
        kk.iapg[84] = 7465355261529543914L;
        kk.iapg[85] = -5678127354583226101L;
        kk.iapg[86] = 6829592267315840150L;
        kk.iapg[87] = 1160225812625578127L;
        kk.iapg[88] = -7310679657166957553L;
        kk.iapg[89] = -7599635128001359700L;
        kk.iapg[90] = 6559156483509029790L;
        kk.iapg[91] = 4567108536153246077L;
        kk.iapg[92] = 5019836881605970185L;
        kk.iapg[93] = -7339771360668689689L;
        kk.iapg[94] = -4134183788064644806L;
        kk.iapg[95] = -6095105622107880672L;
        kk.iapg[96] = -8932356335904173642L;
        kk.iapg[97] = -7437217528662807456L;
        kk.iapg[98] = 3448006131185552417L;
        kk.iapg[99] = -319584484091417973L;
    }

    private static /* synthetic */ void ibfc() {
        kk.iaph[0] = -8718931547100248808L;
        kk.iaph[1] = 4683809652646711488L;
        kk.iaph[2] = -8085556275924831105L;
        kk.iaph[3] = 7517048098338885980L;
        kk.iaph[4] = 229690931879980543L;
        kk.iaph[5] = 1270032621851432332L;
        kk.iaph[6] = 8939686634665353075L;
        kk.iaph[7] = 7309197832594701519L;
        kk.iaph[8] = 5310282711488066329L;
        kk.iaph[9] = -3420593168522330763L;
        kk.iaph[10] = 526181398372388134L;
        kk.iaph[11] = -1804718153203752689L;
        kk.iaph[12] = 223632841993574740L;
        kk.iaph[13] = 7607004310045843776L;
        kk.iaph[14] = 3249088934779659408L;
        kk.iaph[15] = -4869103011528699032L;
        kk.iaph[16] = -9111421816972940819L;
        kk.iaph[17] = -5441479296242639075L;
        kk.iaph[18] = -192007051626439218L;
        kk.iaph[19] = -633648483252114455L;
        kk.iaph[20] = 179546674684851673L;
        kk.iaph[21] = -3362561287766756845L;
        kk.iaph[22] = -2681796764364434438L;
        kk.iaph[23] = 5221832574027616934L;
        kk.iaph[24] = -5291531585804600607L;
        kk.iaph[25] = -8220508668116131478L;
        kk.iaph[26] = -4893476342704134928L;
        kk.iaph[27] = -3845202805238358802L;
        kk.iaph[28] = -8328837655662560553L;
        kk.iaph[29] = -8695591345180531415L;
        kk.iaph[30] = -8223509254489571235L;
        kk.iaph[31] = -857025142190407713L;
        kk.iaph[32] = -9168281072497882784L;
        kk.iaph[33] = 3402188979964297033L;
        kk.iaph[34] = -3205311217972430054L;
        kk.iaph[35] = 4342946316501118708L;
        kk.iaph[36] = 3555025251837042085L;
        kk.iaph[37] = -6474861793068832024L;
        kk.iaph[38] = 292530957475070400L;
        kk.iaph[39] = 8082620676473586957L;
        kk.iaph[40] = 6822492506888460309L;
        kk.iaph[41] = 4307425787753769963L;
        kk.iaph[42] = 7360451705877343576L;
        kk.iaph[43] = 2869891424899980745L;
        kk.iaph[44] = 2767208815495435930L;
        kk.iaph[45] = -5021355589934095902L;
        kk.iaph[46] = -8597660235726057549L;
        kk.iaph[47] = 7177821067303078204L;
        kk.iaph[48] = -3553006333076488832L;
        kk.iaph[49] = 7542278482081843938L;
        kk.iaph[50] = -1388706632831554038L;
        kk.iaph[51] = 2335387004441231544L;
        kk.iaph[52] = -2339431687053459588L;
        kk.iaph[53] = 2078990089013108171L;
        kk.iaph[54] = -7063600846666436386L;
        kk.iaph[55] = 8833528371664686924L;
        kk.iaph[56] = -6406169413329439012L;
        kk.iaph[57] = -5127468375772156602L;
        kk.iaph[58] = 837527230606607116L;
        kk.iaph[59] = 8935489987827520321L;
        kk.iaph[60] = 2999863994170069632L;
        kk.iaph[61] = -3435301782495921797L;
        kk.iaph[62] = 6797372668255534249L;
        kk.iaph[63] = 8308445695860671465L;
        kk.iaph[64] = -4012529666729852779L;
        kk.iaph[65] = 6123691751241299336L;
        kk.iaph[66] = 1306868223316749700L;
        kk.iaph[67] = 3833969508547157248L;
        kk.iaph[68] = -5608028060749449456L;
        kk.iaph[69] = 3015169449199816214L;
        kk.iaph[70] = -1163894985241854522L;
        kk.iaph[71] = 2112908210170602822L;
        kk.iaph[72] = -7093576337082609049L;
        kk.iaph[73] = -2465446534177746595L;
        kk.iaph[74] = 5426997975042998751L;
        kk.iaph[75] = 6729353981057383614L;
        kk.iaph[76] = 2949246191793304574L;
        kk.iaph[77] = 7315445359978181088L;
        kk.iaph[78] = 3714829967897799656L;
        kk.iaph[79] = -8475734949021694510L;
        kk.iaph[80] = 9217704105082994083L;
        kk.iaph[81] = -6607435225215938477L;
        kk.iaph[82] = -6698989228075980273L;
        kk.iaph[83] = -6274914181871124973L;
        kk.iaph[84] = -6484402960226644231L;
        kk.iaph[85] = -241279783981401565L;
        kk.iaph[86] = 5981379846005171320L;
        kk.iaph[87] = 4417757898647098500L;
        kk.iaph[88] = 8848395839769544693L;
        kk.iaph[89] = 6236709512879314376L;
        kk.iaph[90] = -8299798802857937568L;
        kk.iaph[91] = -8540939032454382737L;
        kk.iaph[92] = -1456517946998662018L;
        kk.iaph[93] = 2758013380084813056L;
        kk.iaph[94] = -8427212445171715036L;
        kk.iaph[95] = -5659758714470666910L;
        kk.iaph[96] = -2484274368766271743L;
        kk.iaph[97] = -5557524248889613129L;
        kk.iaph[98] = 7979725430555674081L;
        kk.iaph[99] = -1046477578472472357L;
    }

    private static /* synthetic */ void ibex() {
        kk.iapm[0] = 924412402;
        kk.iapm[1] = 1486042867;
        kk.iapm[2] = 2117332664;
        kk.iapm[3] = -400267849;
        kk.iapm[4] = 643873047;
        kk.iapm[5] = 1896180619;
        kk.iapm[6] = 9697050;
        kk.iapm[7] = -1037119455;
        kk.iapm[8] = 688293680;
        kk.iapm[9] = -1046410401;
        kk.iapm[10] = 1241501169;
        kk.iapm[11] = 147031333;
        kk.iapm[12] = -262410824;
        kk.iapm[13] = -617063475;
        kk.iapm[14] = -1623751999;
        kk.iapm[15] = 884797978;
        kk.iapm[16] = -2002200577;
        kk.iapm[17] = 1626072444;
        kk.iapm[18] = 2090059614;
        kk.iapm[19] = 1079000081;
        kk.iapm[20] = -903168081;
        kk.iapm[21] = -681223059;
        kk.iapm[22] = -912089206;
        kk.iapm[23] = 1510719187;
        kk.iapm[24] = 1006855850;
        kk.iapm[25] = -1354986192;
        kk.iapm[26] = -2031016963;
        kk.iapm[27] = -1221820261;
        kk.iapm[28] = -152307840;
        kk.iapm[29] = -1276540055;
        kk.iapm[30] = -513178127;
        kk.iapm[31] = 1524333517;
        kk.iapm[32] = -567372780;
        kk.iapm[33] = -2031499900;
        kk.iapm[34] = -1040847875;
        kk.iapm[35] = -1377138268;
        kk.iapm[36] = -1181576694;
        kk.iapm[37] = 1091167808;
        kk.iapm[38] = 849617626;
        kk.iapm[39] = 36101544;
        kk.iapm[40] = 1734352031;
        kk.iapm[41] = -419454967;
        kk.iapm[42] = -90980249;
        kk.iapm[43] = -659529713;
        kk.iapm[44] = 1005008095;
        kk.iapm[45] = 1876462147;
        kk.iapm[46] = -32246264;
        kk.iapm[47] = 1364756965;
        kk.iapm[48] = -1764183568;
        kk.iapm[49] = 1963394980;
        kk.iapm[50] = 287730928;
        kk.iapm[51] = 841839785;
        kk.iapm[52] = 317595791;
        kk.iapm[53] = -1738290835;
        kk.iapm[54] = -1897430077;
        kk.iapm[55] = -2023614161;
        kk.iapm[56] = 1148715469;
        kk.iapm[57] = -1537956496;
        kk.iapm[58] = -1518449952;
        kk.iapm[59] = -1709781211;
        kk.iapm[60] = -389853401;
        kk.iapm[61] = -1389895808;
        kk.iapm[62] = 692812790;
        kk.iapm[63] = 1453668471;
        kk.iapm[64] = 1645775901;
        kk.iapm[65] = -1830183558;
        kk.iapm[66] = 246904761;
        kk.iapm[67] = -1555163255;
        kk.iapm[68] = 955640530;
        kk.iapm[69] = -120118437;
        kk.iapm[70] = -1470646790;
        kk.iapm[71] = 1893627701;
        kk.iapm[72] = -2088590995;
        kk.iapm[73] = -1111183990;
        kk.iapm[74] = -583789834;
        kk.iapm[75] = 783265807;
        kk.iapm[76] = 1053480713;
        kk.iapm[77] = -574772416;
        kk.iapm[78] = 674373901;
        kk.iapm[79] = -1322925200;
        kk.iapm[80] = 1394226124;
        kk.iapm[81] = 1142098558;
        kk.iapm[82] = 1868391946;
        kk.iapm[83] = 960991319;
        kk.iapm[84] = -2009483942;
        kk.iapm[85] = 1987111099;
        kk.iapm[86] = -409152341;
        kk.iapm[87] = 652238130;
        kk.iapm[88] = -1078184698;
        kk.iapm[89] = -1925648552;
        kk.iapm[90] = 813498852;
        kk.iapm[91] = -1621915712;
        kk.iapm[92] = 1633877126;
        kk.iapm[93] = -488915577;
        kk.iapm[94] = -2028299032;
        kk.iapm[95] = 1987418482;
        kk.iapm[96] = 1154886029;
        kk.iapm[97] = -2764869;
        kk.iapm[98] = 1219911334;
        kk.iapm[99] = -263220609;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int colorAt(int[] var0, int var1_1) {
        block45: {
            block46: {
                v0 /* !! */  = kk.pg;
                if (true) ** GOTO lbl5
                block28: while (true) {
                    v0 /* !! */  = (long)(v1 - kk.iapi("ibao", iapf(int ), (int)80));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2080126573: {
                            v1 = kk.iapi("ibap", iapf(int ), (int)81);
                            continue block28;
                        }
                        case 188720013: {
                            v1 = kk.iapi("ibaq", iapf(int ), (int)82);
                            continue block28;
                        }
                        case 462404595: {
                            break block28;
                        }
                        case 1968602355: {
                            v1 = kk.iapi("ibar", iapf(int ), (int)83);
                            continue block28;
                        }
                    }
                    break;
                }
                var4_2 = kk.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = kk.pg - kk.iapi("ibas", iapf(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == kk.iapi("ibat", iapk(int ), (int)202)) break;
                    v2 /* !! */  = (long)kk.iapi("ibau", iapk(int ), (int)203);
                }
                var3_3 /* !! */  = kk.b;
                v3 /* !! */  = kk.pg;
                block30: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -415075232: {
                            v3 /* !! */  = (long)(kk.iapi("ibaw", iapf(int ), (int)86) - kk.iapi("ibav", iapf(int ), (int)85));
                            continue block30;
                        }
                        case 462404595: {
                            break block30;
                        }
                    }
                    break;
                }
                var2_4 = kk.a;
                if (var4_2) {
                    throw null;
                }
                if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                if (var0 == null) break block46;
                if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                if (var0.length != 0) ** GOTO lbl50
                if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
            }
            if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                        return (int)kk.iapi("ibay", iapk(int ), (int)205);
                    }
lbl50:
                    // 1 sources

                    if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                    if (var2_4 != false) return (int)kk.iapi("ibax", iapk(int ), (int)204);
                    v4 = var0.length - kk.iapi("ibaz", iapk(int ), (int)206);
                    v5 /* !! */  = kk.pg;
                    if (true) ** GOTO lbl92
                    case 3: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbg", iapk(int ), (int)210);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbh", iapk(int ), (int)211);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbm", iapk(int ), (int)216);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbf", iapk(int ), (int)209);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbk", iapk(int ), (int)214);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        ** GOTO lbl85
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbn", iapk(int ), (int)217);
                        if (var4_2) {
                            throw null;
                        }
lbl85:
                        // 3 sources

                        var3_3 /* !! */  = (int)kk.iapi("ibbi", iapk(int ), (int)212);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    block32: while (true) {
                        v5 /* !! */  = (long)(v6 - kk.iapi("ibba", iapf(int ), (int)87));
lbl92:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -693210661: {
                                v6 = kk.iapi("ibbb", iapf(int ), (int)88);
                                continue block32;
                            }
                            case 278859709: {
                                v6 = kk.iapi("ibbc", iapf(int ), (int)89);
                                continue block32;
                            }
                            case 462404595: {
                                return var0[Math.min(var1_1, v4)];
                            }
                        }
                        break;
                    }
                    return var0[Math.min(var1_1, v4)];
                    case 0: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbd", iapk(int ), (int)207);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbl", iapk(int ), (int)215);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block45;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)kk.iapi("ibbe", iapk(int ), (int)208);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                break;
            }
            ** GOTO lbl121
        }
        do {
            if (true) ** continue;
lbl121:
            // 2 sources

            var3_3 /* !! */  = (int)kk.iapi("ibbj", iapk(int ), (int)213);
            cfr_temp_0 = 1;
        } while (!var4_2);
        throw null;
    }
}

