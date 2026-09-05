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
import ruhack.phobia.oq;

public class lg {
    public static final boolean c;
    private static GpuBuffer uniformBuffer;
    private static long[] iilm;
    private static int[] iilu;
    private static long[] iiln;
    private static RenderPipeline pipeline;
    static final long ps = -7694920047504035818L;
    public static final boolean a;
    private static int[] iilt;
    private static final int UNIFORM_SIZE = 256;
    private static ByteBuffer uniformData;
    public static final int b;

    public static /* synthetic */ CallSite iilo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int colorAt(int[] var0, int var1_1) {
        block40: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = lg.ps - lg.iilo("ijvz", iill(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == lg.iilo("ijwa", iilr(int ), (int)191)) break;
                v0 /* !! */  = (long)lg.iilo("ijwb", iilr(int ), (int)192);
            }
            var4_2 = lg.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = lg.ps - lg.iilo("ijwc", iill(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == lg.iilo("ijwd", iilr(int ), (int)193)) break;
                v1 /* !! */  = (long)lg.iilo("ijwe", iilr(int ), (int)194);
            }
            var3_3 /* !! */  = lg.b;
            v2 /* !! */  = lg.ps;
            if (true) ** GOTO lbl19
            block26: while (true) {
                v2 /* !! */  = (long)(v3 - lg.iilo("ijwf", iill(int ), (int)70));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -735343166: {
                        v3 = lg.iilo("ijwg", iill(int ), (int)71);
                        continue block26;
                    }
                    case 1024783937: {
                        v3 = lg.iilo("ijwh", iill(int ), (int)72);
                        continue block26;
                    }
                    case 2038263830: {
                        break block26;
                    }
                }
                break;
            }
            var2_4 = lg.a;
            if (var4_2) {
                throw null;
lbl31:
                // 6 sources

                return (int)lg.iilo("ijwi", iilr(int ), (int)195);
            }
            if (var2_4 || var2_4) ** GOTO lbl31
            if (var0 == null) break block40;
            if (var2_4) ** GOTO lbl31
            if (var0.length != 0) ** GOTO lbl45
            if (var2_4) ** GOTO lbl31
        }
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl31
                return (int)lg.iilo("ijwj", iilr(int ), (int)196);
            }
lbl45:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v4 = var0.length - lg.iilo("ijwk", iilr(int ), (int)197);
            v5 /* !! */  = lg.ps;
            if (true) ** GOTO lbl52
            block28: while (true) {
                v5 /* !! */  = (long)(v6 - lg.iilo("ijwl", iill(int ), (int)73));
lbl52:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 774842671: {
                        v6 = lg.iilo("ijwm", iill(int ), (int)74);
                        continue block28;
                    }
                    case 1039374521: {
                        v6 = lg.iilo("ijwn", iill(int ), (int)75);
                        continue block28;
                    }
                    case 1787194655: {
                        v6 = lg.iilo("ijwo", iill(int ), (int)76);
                        continue block28;
                    }
                    case 2038263830: {
                        break block28;
                    }
                }
                break;
            }
            return var0[Math.min(var1_1, v4)];
lbl65:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lg.iilo("ijwp", iilr(int ), (int)198);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)lg.iilo("ijwq", iilr(int ), (int)199);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 2: {
                var3_3 /* !! */  = (int)lg.iilo("ijwr", iilr(int ), (int)200);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)lg.iilo("ijws", iilr(int ), (int)201);
                } while (!var4_2);
                throw null;
            }
lbl83:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)lg.iilo("ijwt", iilr(int ), (int)202);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)lg.iilo("ijwu", iilr(int ), (int)203);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lg.iilo("ijwv", iilr(int ), (int)204);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
lbl96:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)lg.iilo("ijww", iilr(int ), (int)205);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
lbl100:
            // 2 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)lg.iilo("ijwx", iilr(int ), (int)206);
                } while (!var4_2);
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)lg.iilo("ijwy", iilr(int ), (int)207);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)lg.iilo("ijwz", iilr(int ), (int)208);
        ** while (!var4_2)
lbl112:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ijsa(int n2) {
        return Float.intBitsToFloat(iilt[n2] ^ iilu[n2]);
    }

    private static /* synthetic */ void ikac() {
        lg.iilt[0] = -1578441513;
        lg.iilt[1] = 987793194;
        lg.iilt[2] = -1111599282;
        lg.iilt[3] = -1446078676;
        lg.iilt[4] = 1206456964;
        lg.iilt[5] = -1582022579;
        lg.iilt[6] = 838855260;
        lg.iilt[7] = -1651455763;
        lg.iilt[8] = -440699731;
        lg.iilt[9] = 1975688473;
        lg.iilt[10] = 1239160272;
        lg.iilt[11] = 2022099243;
        lg.iilt[12] = 971568025;
        lg.iilt[13] = 948981145;
        lg.iilt[14] = 1255887029;
        lg.iilt[15] = 310024336;
        lg.iilt[16] = -183338570;
        lg.iilt[17] = -1769517856;
        lg.iilt[18] = 2092529986;
        lg.iilt[19] = -2092240932;
        lg.iilt[20] = -972001076;
        lg.iilt[21] = -135766806;
        lg.iilt[22] = 1627409598;
        lg.iilt[23] = -29024126;
        lg.iilt[24] = 1659365752;
        lg.iilt[25] = 1046712139;
        lg.iilt[26] = -202657336;
        lg.iilt[27] = -1606570288;
        lg.iilt[28] = 568108135;
        lg.iilt[29] = 1464468601;
        lg.iilt[30] = 1530190369;
        lg.iilt[31] = 987612378;
        lg.iilt[32] = -1024218060;
        lg.iilt[33] = -1650545121;
        lg.iilt[34] = 1717519560;
        lg.iilt[35] = 1867303513;
        lg.iilt[36] = -995167554;
        lg.iilt[37] = -578848328;
        lg.iilt[38] = 714098178;
        lg.iilt[39] = -235044438;
        lg.iilt[40] = 2109069772;
        lg.iilt[41] = 103058752;
        lg.iilt[42] = 1948380422;
        lg.iilt[43] = 1791876848;
        lg.iilt[44] = 284614808;
        lg.iilt[45] = -960084567;
        lg.iilt[46] = 1759832823;
        lg.iilt[47] = 817642150;
        lg.iilt[48] = -552984074;
        lg.iilt[49] = 2115187525;
        lg.iilt[50] = 1368929258;
        lg.iilt[51] = 395218730;
        lg.iilt[52] = -404589489;
        lg.iilt[53] = -1704592134;
        lg.iilt[54] = -1193405599;
        lg.iilt[55] = -1792941321;
        lg.iilt[56] = 243618220;
        lg.iilt[57] = 419738800;
        lg.iilt[58] = 994701442;
        lg.iilt[59] = -751419555;
        lg.iilt[60] = -880365706;
        lg.iilt[61] = -315363675;
        lg.iilt[62] = -199562803;
        lg.iilt[63] = 1847275915;
        lg.iilt[64] = 1456705454;
        lg.iilt[65] = -8728110;
        lg.iilt[66] = -1706541677;
        lg.iilt[67] = -194892412;
        lg.iilt[68] = 1735939164;
        lg.iilt[69] = -1827690542;
        lg.iilt[70] = -1118942091;
        lg.iilt[71] = -367810481;
        lg.iilt[72] = 582014416;
        lg.iilt[73] = 739228858;
        lg.iilt[74] = 1841714533;
        lg.iilt[75] = 1573716460;
        lg.iilt[76] = -975472699;
        lg.iilt[77] = 3899442;
        lg.iilt[78] = 721296814;
        lg.iilt[79] = 1690997607;
        lg.iilt[80] = 41779882;
        lg.iilt[81] = -463894886;
        lg.iilt[82] = -1318004821;
        lg.iilt[83] = 1929824587;
        lg.iilt[84] = -328206722;
        lg.iilt[85] = -1334934810;
        lg.iilt[86] = -1556952613;
        lg.iilt[87] = 1203313160;
        lg.iilt[88] = -1309678877;
        lg.iilt[89] = -486981827;
        lg.iilt[90] = -2061780532;
        lg.iilt[91] = 1464225399;
        lg.iilt[92] = -314300266;
        lg.iilt[93] = 1965445466;
        lg.iilt[94] = -2082927907;
        lg.iilt[95] = -1271354071;
        lg.iilt[96] = 2017698591;
        lg.iilt[97] = -127275565;
        lg.iilt[98] = -1234978921;
        lg.iilt[99] = -1555168754;
    }

    private static /* synthetic */ void ikaj() {
        lg.iilm[100] = 6834318238847968978L;
        lg.iilm[101] = 1670841650952813825L;
        lg.iilm[102] = -3407538699308846668L;
        lg.iilm[103] = 2566620204438630986L;
        lg.iilm[104] = -1731584993068299505L;
        lg.iilm[105] = 2533782570753999216L;
        lg.iilm[106] = -2812975032851411365L;
        lg.iilm[107] = 6415917173402810378L;
        lg.iilm[108] = -4790053467678458824L;
        lg.iilm[109] = 2107775538648160769L;
        lg.iilm[110] = 3189509686310043995L;
        lg.iilm[111] = 6821585325785819154L;
        lg.iilm[112] = -8907209710922551604L;
        lg.iilm[113] = 835773162826523483L;
        lg.iilm[114] = 3773666400761950449L;
        lg.iilm[115] = 4591184911074239957L;
        lg.iilm[116] = 4174507077852370383L;
    }

    private static /* synthetic */ void ikae() {
        lg.iilt[200] = -1376721019;
        lg.iilt[201] = 371210593;
        lg.iilt[202] = 1775679733;
        lg.iilt[203] = 1755499696;
        lg.iilt[204] = -1388449732;
        lg.iilt[205] = -1992171143;
        lg.iilt[206] = 1339790944;
        lg.iilt[207] = -347234825;
        lg.iilt[208] = -1744837184;
        lg.iilt[209] = 255166611;
        lg.iilt[210] = 1712174667;
        lg.iilt[211] = -2125536751;
        lg.iilt[212] = 1038752995;
        lg.iilt[213] = 230209232;
        lg.iilt[214] = -2047632820;
        lg.iilt[215] = 2089967668;
        lg.iilt[216] = 1360129636;
        lg.iilt[217] = 146900385;
        lg.iilt[218] = -1268331255;
        lg.iilt[219] = 2043151954;
        lg.iilt[220] = 1906592609;
        lg.iilt[221] = -1129139557;
        lg.iilt[222] = 916618758;
        lg.iilt[223] = -83365272;
        lg.iilt[224] = 48401805;
        lg.iilt[225] = -1587988030;
        lg.iilt[226] = 890938294;
        lg.iilt[227] = -86258491;
        lg.iilt[228] = -2040318971;
        lg.iilt[229] = -763640815;
        lg.iilt[230] = 1349111512;
        lg.iilt[231] = -1925282156;
        lg.iilt[232] = 2037964996;
        lg.iilt[233] = -55292165;
        lg.iilt[234] = -1803179491;
        lg.iilt[235] = 888065102;
        lg.iilt[236] = -1958086255;
        lg.iilt[237] = -1057861167;
        lg.iilt[238] = -1052865759;
        lg.iilt[239] = 2139845211;
        lg.iilt[240] = 1119103798;
        lg.iilt[241] = -677001401;
        lg.iilt[242] = -864946699;
        lg.iilt[243] = 1469723456;
        lg.iilt[244] = 1216217884;
        lg.iilt[245] = 793654503;
        lg.iilt[246] = 1185560047;
        lg.iilt[247] = 174664425;
        lg.iilt[248] = -645685838;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lg.ps - lg.iilo("ijxa", iill(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lg.iilo("ijxb", iilr(int ), (int)209)) break;
            v0 /* !! */  = (long)lg.iilo("ijxc", iilr(int ), (int)210);
        }
        var2 = lg.c;
        v1 /* !! */  = lg.ps;
        if (true) ** GOTO lbl11
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - lg.iilo("ijxd", iill(int ), (int)78));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1335185680: {
                    v2 = lg.iilo("ijxe", iill(int ), (int)79);
                    continue block58;
                }
                case 2028175785: {
                    v2 = lg.iilo("ijxf", iill(int ), (int)80);
                    continue block58;
                }
                case 2038263830: {
                    break block58;
                }
            }
            break;
        }
        var1_1 /* !! */  = lg.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = lg.ps;
                if (true) ** GOTO lbl28
                block59: while (true) {
                    v3 /* !! */  = (long)(v4 - lg.iilo("ijxg", iill(int ), (int)81));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 676719903: {
                            v4 = lg.iilo("ijxh", iill(int ), (int)82);
                            continue block59;
                        }
                        case 1009820156: {
                            v4 = lg.iilo("ijxi", iill(int ), (int)83);
                            continue block59;
                        }
                        case 1271526239: {
                            v4 = lg.iilo("ijxj", iill(int ), (int)84);
                            continue block59;
                        }
                        case 2038263830: {
                            break block59;
                        }
                    }
                    break;
                }
                var0_2 = lg.a;
                if (var2) {
                    throw null;
lbl43:
                    // 10 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = lg.ps - lg.iilo("ijxk", iill(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == lg.iilo("ijxl", iilr(int ), (int)211)) break;
                    v5 /* !! */  = (long)lg.iilo("ijxm", iilr(int ), (int)212);
                }
                if (lg.uniformBuffer == null) ** GOTO lbl84
                if (var0_2 || var0_2) ** GOTO lbl43
                v6 /* !! */  = lg.ps;
                if (true) ** GOTO lbl57
                block62: while (true) {
                    v6 /* !! */  = (long)(lg.iilo("ijxo", iill(int ), (int)87) - lg.iilo("ijxn", iill(int ), (int)86));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1936399274: {
                            continue block62;
                        }
                        case 2038263830: {
                            break block62;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = lg.ps - lg.iilo("ijxp", iill(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lg.iilo("ijxq", iilr(int ), (int)213)) break;
                    v7 /* !! */  = (long)lg.iilo("ijxr", iilr(int ), (int)214);
                }
                lg.uniformBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl43
                v8 /* !! */  = lg.ps;
                if (true) ** GOTO lbl73
                block64: while (true) {
                    v8 /* !! */  = (long)(v9 - lg.iilo("ijxs", iill(int ), (int)89));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -994395205: {
                            v9 = lg.iilo("ijxt", iill(int ), (int)90);
                            continue block64;
                        }
                        case 1287478672: {
                            v9 = lg.iilo("ijxu", iill(int ), (int)91);
                            continue block64;
                        }
                        case 2038263830: {
                            break block64;
                        }
                    }
                    break;
                }
                lg.uniformBuffer = null;
                if (var0_2) ** GOTO lbl43
lbl84:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl43
                v10 /* !! */  = lg.ps;
                if (true) ** GOTO lbl89
                block65: while (true) {
                    v10 /* !! */  = (long)(lg.iilo("ijxw", iill(int ), (int)93) - lg.iilo("ijxv", iill(int ), (int)92));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 337155564: {
                            continue block65;
                        }
                        case 2038263830: {
                            break block65;
                        }
                    }
                    break;
                }
                if (lg.uniformData == null) ** GOTO lbl134
                if (var0_2 || var0_2) ** GOTO lbl43
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = lg.ps - lg.iilo("ijxx", iill(int ), (int)94)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == lg.iilo("ijxy", iilr(int ), (int)215)) break;
                    v11 /* !! */  = (long)lg.iilo("ijxz", iilr(int ), (int)216);
                }
                v12 /* !! */  = lg.ps;
                if (true) ** GOTO lbl105
                block67: while (true) {
                    v12 /* !! */  = (long)(v13 - lg.iilo("ijya", iill(int ), (int)95));
lbl105:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1556992959: {
                            v13 = lg.iilo("ijyb", iill(int ), (int)96);
                            continue block67;
                        }
                        case 447294561: {
                            v13 = lg.iilo("ijyc", iill(int ), (int)97);
                            continue block67;
                        }
                        case 2038263830: {
                            break block67;
                        }
                    }
                    break;
                }
                MemoryUtil.memFree((Buffer)lg.uniformData);
                if (var0_2 || var0_2) ** GOTO lbl43
                v14 /* !! */  = lg.ps;
                if (true) ** GOTO lbl120
                block68: while (true) {
                    v14 /* !! */  = (long)(v15 - lg.iilo("ijyd", iill(int ), (int)98));
lbl120:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -200105243: {
                            v15 = lg.iilo("ijye", iill(int ), (int)99);
                            continue block68;
                        }
                        case 155563534: {
                            v15 = lg.iilo("ijyf", iill(int ), (int)100);
                            continue block68;
                        }
                        case 1780120425: {
                            v15 = lg.iilo("ijyg", iill(int ), (int)101);
                            continue block68;
                        }
                        case 2038263830: {
                            break block68;
                        }
                    }
                    break;
                }
                lg.uniformData = null;
                if (var0_2) ** GOTO lbl43
lbl134:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl43
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = lg.ps - lg.iilo("ijyh", iill(int ), (int)102)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == lg.iilo("ijyi", iilr(int ), (int)217)) break;
                    v16 /* !! */  = (long)lg.iilo("ijyj", iilr(int ), (int)218);
                }
                lg.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl144:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lg.iilo("ijyk", iilr(int ), (int)219);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl149:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lg.iilo("ijyl", iilr(int ), (int)220);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl159
                    break;
                }
            }
lbl155:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)lg.iilo("ijym", iilr(int ), (int)221);
                if (!var2) break;
                throw null;
            }
lbl159:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)lg.iilo("ijyn", iilr(int ), (int)222);
                if (!var2) ** GOTO lbl149
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)lg.iilo("ijyo", iilr(int ), (int)223);
                if (!var2) ** GOTO lbl149
                throw null;
            }
lbl167:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)lg.iilo("ijyp", iilr(int ), (int)224);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl172:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)lg.iilo("ijyq", iilr(int ), (int)225);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl177:
            // 3 sources

            case 7: {
                var1_1 /* !! */  = (int)lg.iilo("ijyr", iilr(int ), (int)226);
                if (!var2) break;
                throw null;
            }
lbl181:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)lg.iilo("ijys", iilr(int ), (int)227);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 9: {
                var1_1 /* !! */  = (int)lg.iilo("ijyt", iilr(int ), (int)228);
                if (!var2) ** GOTO lbl144
                throw null;
            }
lbl190:
            // 3 sources

            case 10: {
                var1_1 /* !! */  = (int)lg.iilo("ijyu", iilr(int ), (int)229);
                if (!var2) ** GOTO lbl155
                throw null;
            }
lbl194:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)lg.iilo("ijyv", iilr(int ), (int)230);
                if (!var2) ** GOTO lbl181
                throw null;
            }
lbl198:
            // 3 sources

            case 12: {
                var1_1 /* !! */  = (int)lg.iilo("ijyw", iilr(int ), (int)231);
                if (!var2) ** GOTO lbl177
                throw null;
            }
            case 13: {
                var1_1 /* !! */  = (int)lg.iilo("ijyx", iilr(int ), (int)232);
                if (!var2) ** GOTO lbl177
                throw null;
            }
lbl206:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)lg.iilo("ijyy", iilr(int ), (int)233);
                if (!var2) ** GOTO lbl167
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lg.iilo("ijyz", iilr(int ), (int)234);
                if (!var2) ** GOTO lbl198
                throw null;
            }
            case 16: {
                var1_1 /* !! */  = (int)lg.iilo("ijza", iilr(int ), (int)235);
                if (!var2) ** GOTO lbl172
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)lg.iilo("ijzb", iilr(int ), (int)236);
                if (!var2) ** GOTO lbl194
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)lg.iilo("ijzc", iilr(int ), (int)237);
                if (!var2) ** GOTO lbl206
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)lg.iilo("ijzd", iilr(int ), (int)238);
        ** while (!var2)
lbl229:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 42[SWITCH]
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

    private static /* synthetic */ void ikai() {
        lg.iilm[0] = -4553753736578352175L;
        lg.iilm[1] = 1765893855101935699L;
        lg.iilm[2] = -1421030873784974697L;
        lg.iilm[3] = -7112015355312460231L;
        lg.iilm[4] = 4493280422850482290L;
        lg.iilm[5] = 424803612795181615L;
        lg.iilm[6] = -7380246231204214655L;
        lg.iilm[7] = -292295878545063332L;
        lg.iilm[8] = -2565244531261371104L;
        lg.iilm[9] = -6843332490935856743L;
        lg.iilm[10] = 6077466970655731537L;
        lg.iilm[11] = -255708538928670884L;
        lg.iilm[12] = -1880400176785103579L;
        lg.iilm[13] = -4741105563873134329L;
        lg.iilm[14] = -4251835419836711010L;
        lg.iilm[15] = -3670577290595225237L;
        lg.iilm[16] = -4671606825226815337L;
        lg.iilm[17] = 3892525382439764774L;
        lg.iilm[18] = -1428960130916265L;
        lg.iilm[19] = -3167940306508278497L;
        lg.iilm[20] = -5951239118527543502L;
        lg.iilm[21] = 7279892016942632194L;
        lg.iilm[22] = -3747515527094528507L;
        lg.iilm[23] = 2606425606774228597L;
        lg.iilm[24] = 2412441842999827388L;
        lg.iilm[25] = -2180683932565714459L;
        lg.iilm[26] = 8802879643982225242L;
        lg.iilm[27] = -622105897970703249L;
        lg.iilm[28] = 730852840169990857L;
        lg.iilm[29] = -4898020720332015364L;
        lg.iilm[30] = -8131950138610379756L;
        lg.iilm[31] = 242379572600078249L;
        lg.iilm[32] = -639473741925071634L;
        lg.iilm[33] = -3756957797553118207L;
        lg.iilm[34] = -3553663366120368546L;
        lg.iilm[35] = 4870904144867144133L;
        lg.iilm[36] = 6806867471864477908L;
        lg.iilm[37] = -1270911323630043812L;
        lg.iilm[38] = 8603055285257434374L;
        lg.iilm[39] = -3061198727872081129L;
        lg.iilm[40] = 3548162561909883590L;
        lg.iilm[41] = 4993086026005513691L;
        lg.iilm[42] = -242200029314828677L;
        lg.iilm[43] = 6771356256011221440L;
        lg.iilm[44] = 6353859417713460830L;
        lg.iilm[45] = 8957184489547754010L;
        lg.iilm[46] = -3669342515703063023L;
        lg.iilm[47] = -4436133272916162839L;
        lg.iilm[48] = -4490303596399174460L;
        lg.iilm[49] = 9118846328624197016L;
        lg.iilm[50] = 2353347831185040431L;
        lg.iilm[51] = -62515481009484024L;
        lg.iilm[52] = 4808321893890109434L;
        lg.iilm[53] = 6733263072884094168L;
        lg.iilm[54] = -5689496592190487972L;
        lg.iilm[55] = 6138746366337560206L;
        lg.iilm[56] = -1465261801337640795L;
        lg.iilm[57] = 5210244382594167371L;
        lg.iilm[58] = -5553590570174043254L;
        lg.iilm[59] = 6261679605065439752L;
        lg.iilm[60] = -8856876590715372227L;
        lg.iilm[61] = -4120475616177532981L;
        lg.iilm[62] = 760819301897165052L;
        lg.iilm[63] = 1099298568976128695L;
        lg.iilm[64] = 1610989908394014623L;
        lg.iilm[65] = -7573653807837735661L;
        lg.iilm[66] = -2195781644704906942L;
        lg.iilm[67] = -7736897165623359738L;
        lg.iilm[68] = -876801428271598530L;
        lg.iilm[69] = 2684629191132868874L;
        lg.iilm[70] = -7754415603449329171L;
        lg.iilm[71] = 3792704700177745944L;
        lg.iilm[72] = -7725348391076960291L;
        lg.iilm[73] = -5958720418922566013L;
        lg.iilm[74] = 4853365224105319420L;
        lg.iilm[75] = -2536323369990345347L;
        lg.iilm[76] = 3307571039913146697L;
        lg.iilm[77] = 7931553907095011023L;
        lg.iilm[78] = 7244712910376218541L;
        lg.iilm[79] = -5170647627526849697L;
        lg.iilm[80] = -640179727877122843L;
        lg.iilm[81] = 4860438982047106800L;
        lg.iilm[82] = 8011667924851868665L;
        lg.iilm[83] = 4439021840146603822L;
        lg.iilm[84] = 2302371756148450677L;
        lg.iilm[85] = 2925076054820245141L;
        lg.iilm[86] = -5391157925639226153L;
        lg.iilm[87] = -164049300649472320L;
        lg.iilm[88] = 100614637435031069L;
        lg.iilm[89] = 8042950343452684392L;
        lg.iilm[90] = -8003619455694716199L;
        lg.iilm[91] = -4452428650857890720L;
        lg.iilm[92] = -3817129876016070489L;
        lg.iilm[93] = -7648473555909884065L;
        lg.iilm[94] = -1544354343818935156L;
        lg.iilm[95] = 4986890912193231574L;
        lg.iilm[96] = -6689805818524503969L;
        lg.iilm[97] = 8543564074159985095L;
        lg.iilm[98] = 4105809335052628507L;
        lg.iilm[99] = 2022467507604071516L;
    }

    private static /* synthetic */ void ikad() {
        lg.iilt[100] = -605595645;
        lg.iilt[101] = 49268931;
        lg.iilt[102] = -1182860012;
        lg.iilt[103] = -1096414341;
        lg.iilt[104] = -1242873542;
        lg.iilt[105] = -102562705;
        lg.iilt[106] = 1059560857;
        lg.iilt[107] = -961913047;
        lg.iilt[108] = -1310833862;
        lg.iilt[109] = -2141760560;
        lg.iilt[110] = -545793186;
        lg.iilt[111] = 1732649047;
        lg.iilt[112] = 2002647304;
        lg.iilt[113] = 172086149;
        lg.iilt[114] = 1886032915;
        lg.iilt[115] = -627765313;
        lg.iilt[116] = -1953532674;
        lg.iilt[117] = -146587469;
        lg.iilt[118] = 690888237;
        lg.iilt[119] = 76995334;
        lg.iilt[120] = 406463141;
        lg.iilt[121] = -1349286012;
        lg.iilt[122] = -491402810;
        lg.iilt[123] = 250391359;
        lg.iilt[124] = 2081645175;
        lg.iilt[125] = 604103289;
        lg.iilt[126] = -601477402;
        lg.iilt[127] = -1384884390;
        lg.iilt[128] = 1403884265;
        lg.iilt[129] = 822013904;
        lg.iilt[130] = -187258668;
        lg.iilt[131] = -1644837860;
        lg.iilt[132] = -395995559;
        lg.iilt[133] = 1779008432;
        lg.iilt[134] = -1000037266;
        lg.iilt[135] = 189550193;
        lg.iilt[136] = 1054216510;
        lg.iilt[137] = 53353158;
        lg.iilt[138] = -235167193;
        lg.iilt[139] = -1195424050;
        lg.iilt[140] = 2030562721;
        lg.iilt[141] = 617884292;
        lg.iilt[142] = 1623136003;
        lg.iilt[143] = 165274314;
        lg.iilt[144] = -838083279;
        lg.iilt[145] = -1575763744;
        lg.iilt[146] = 1450280467;
        lg.iilt[147] = 2135173306;
        lg.iilt[148] = -517937716;
        lg.iilt[149] = 780216289;
        lg.iilt[150] = 1833336884;
        lg.iilt[151] = 1327740078;
        lg.iilt[152] = -230146311;
        lg.iilt[153] = 620985912;
        lg.iilt[154] = -1870435936;
        lg.iilt[155] = -1599838652;
        lg.iilt[156] = -379128203;
        lg.iilt[157] = 1093041448;
        lg.iilt[158] = 1064118503;
        lg.iilt[159] = 1136019684;
        lg.iilt[160] = 270151887;
        lg.iilt[161] = 1453776040;
        lg.iilt[162] = 155132688;
        lg.iilt[163] = -1324396194;
        lg.iilt[164] = -445972845;
        lg.iilt[165] = -889451266;
        lg.iilt[166] = 2043293029;
        lg.iilt[167] = -1202405897;
        lg.iilt[168] = -1915023480;
        lg.iilt[169] = 26816716;
        lg.iilt[170] = 924864522;
        lg.iilt[171] = -1673973867;
        lg.iilt[172] = 974373760;
        lg.iilt[173] = -389374541;
        lg.iilt[174] = -1214477764;
        lg.iilt[175] = -476457944;
        lg.iilt[176] = 2064998969;
        lg.iilt[177] = -1313586973;
        lg.iilt[178] = -85725659;
        lg.iilt[179] = -596235597;
        lg.iilt[180] = -463701324;
        lg.iilt[181] = 2101915125;
        lg.iilt[182] = -227557048;
        lg.iilt[183] = -2025634738;
        lg.iilt[184] = -548426562;
        lg.iilt[185] = 1633141154;
        lg.iilt[186] = -1928952786;
        lg.iilt[187] = 1205111505;
        lg.iilt[188] = -5740856;
        lg.iilt[189] = -951118877;
        lg.iilt[190] = -1903950743;
        lg.iilt[191] = -1765122399;
        lg.iilt[192] = 500028872;
        lg.iilt[193] = -1812951577;
        lg.iilt[194] = -872616060;
        lg.iilt[195] = 1319650275;
        lg.iilt[196] = 1676537360;
        lg.iilt[197] = -1387904925;
        lg.iilt[198] = -1441651447;
        lg.iilt[199] = 65201884;
    }

    static {
        iilt = new int[249];
        iilu = new int[249];
        lg.ikac();
        lg.ikad();
        lg.ikae();
        lg.ikaf();
        lg.ikag();
        lg.ikah();
        iilm = new long[117];
        iiln = new long[117];
        lg.ikai();
        lg.ikaj();
        lg.ikak();
        lg.ikal();
    }

    private static /* synthetic */ int iilr(int n2) {
        return iilt[n2] ^ iilu[n2];
    }

    private static /* synthetic */ long iill(int n2) {
        return iilm[n2] ^ iiln[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, int var10_10) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lg.ps - lg.iilo("ijrb", iill(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lg.iilo("ijrc", iilr(int ), (int)71)) break;
            v0 /* !! */  = (long)lg.iilo("ijrd", iilr(int ), (int)72);
        }
        var13_11 = lg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lg.ps - lg.iilo("ijre", iill(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lg.iilo("ijrf", iilr(int ), (int)73)) break;
            v1 /* !! */  = (long)lg.iilo("ijrg", iilr(int ), (int)74);
        }
        var12_12 /* !! */  = lg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lg.ps - lg.iilo("ijrh", iill(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lg.iilo("ijri", iilr(int ), (int)75)) break;
            v2 /* !! */  = (long)lg.iilo("ijrj", iilr(int ), (int)76);
        }
        var11_13 = lg.a;
        if (var12_12 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var12_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_11) {
                    throw null;
lbl27:
                    // 2 sources

                    return;
                }
                if (var11_13 || var11_13) ** GOTO lbl27
                v3 = lg.iilo("ijrk", iilr(int ), (int)77);
                v4 /* !! */  = lg.ps;
                if (true) ** GOTO lbl35
                block18: while (true) {
                    v4 /* !! */  = (long)(v5 - lg.iilo("ijrl", iill(int ), (int)64));
lbl35:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -384052319: {
                            v5 = lg.iilo("ijrm", iill(int ), (int)65);
                            continue block18;
                        }
                        case 195811723: {
                            v5 = lg.iilo("ijrn", iill(int ), (int)66);
                            continue block18;
                        }
                        case 795787757: {
                            v5 = lg.iilo("ijro", iill(int ), (int)67);
                            continue block18;
                        }
                        case 2038263830: {
                            break block18;
                        }
                    }
                    break;
                }
                lg.drawInternal(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, null, var10_10, (boolean)v3);
                if (var11_13 || var11_13) ** continue;
                return;
            }
            case 0: {
                var12_12 /* !! */  = (int)lg.iilo("ijrp", iilr(int ), (int)78);
                if (!var13_11) break;
                throw null;
            }
lbl54:
            // 2 sources

            case 1: {
                var12_12 /* !! */  = (int)lg.iilo("ijrq", iilr(int ), (int)79);
                if (var13_11) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 2: {
                var12_12 /* !! */  = (int)lg.iilo("ijrr", iilr(int ), (int)80);
                if (var13_11) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_12 /* !! */  = (int)lg.iilo("ijrs", iilr(int ), (int)81);
                    if (!var13_11) break block0;
                    throw null;
                }
            }
lbl69:
            // 3 sources

            case 4: {
                var12_12 /* !! */  = (int)lg.iilo("ijrt", iilr(int ), (int)82);
                if (!var13_11) ** GOTO lbl54
                throw null;
            }
            case 5: 
        }
        var12_12 /* !! */  = (int)lg.iilo("ijru", iilr(int ), (int)83);
        ** while (!var13_11)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikaf() {
        lg.iilu[0] = 1578441512;
        lg.iilu[1] = 1462536913;
        lg.iilu[2] = 1111599281;
        lg.iilu[3] = -291144761;
        lg.iilu[4] = 1206456965;
        lg.iilu[5] = 2050757485;
        lg.iilu[6] = -838855261;
        lg.iilu[7] = -1317771314;
        lg.iilu[8] = 440699730;
        lg.iilu[9] = 1493624045;
        lg.iilu[10] = -1239160273;
        lg.iilu[11] = -2133913198;
        lg.iilu[12] = -971568026;
        lg.iilu[13] = -1976897544;
        lg.iilu[14] = -1255887030;
        lg.iilu[15] = 847195990;
        lg.iilu[16] = 183338569;
        lg.iilu[17] = 1875968763;
        lg.iilu[18] = -2092529987;
        lg.iilu[19] = -1371385174;
        lg.iilu[20] = 972001075;
        lg.iilu[21] = 531266464;
        lg.iilu[22] = -1627409599;
        lg.iilu[23] = -258825522;
        lg.iilu[24] = 1659365752;
        lg.iilu[25] = -1046712140;
        lg.iilu[26] = -1899826186;
        lg.iilu[27] = 1606570287;
        lg.iilu[28] = -309080934;
        lg.iilu[29] = -1464468602;
        lg.iilu[30] = -1365437891;
        lg.iilu[31] = -987612379;
        lg.iilu[32] = -973110616;
        lg.iilu[33] = -1650545001;
        lg.iilu[34] = 1717519561;
        lg.iilu[35] = -1260293782;
        lg.iilu[36] = -995167298;
        lg.iilu[37] = 578848327;
        lg.iilu[38] = -1663909460;
        lg.iilu[39] = -235044433;
        lg.iilu[40] = 2109069769;
        lg.iilu[41] = 103058762;
        lg.iilu[42] = 1948380431;
        lg.iilu[43] = 1791876851;
        lg.iilu[44] = 284614803;
        lg.iilu[45] = -960084569;
        lg.iilu[46] = 1759832807;
        lg.iilu[47] = 817642151;
        lg.iilu[48] = -552984071;
        lg.iilu[49] = 2115187534;
        lg.iilu[50] = 1368929275;
        lg.iilu[51] = 395218724;
        lg.iilu[52] = -404589496;
        lg.iilu[53] = -1704592138;
        lg.iilu[54] = -1193405590;
        lg.iilu[55] = -1792941316;
        lg.iilu[56] = 243618217;
        lg.iilu[57] = -419738801;
        lg.iilu[58] = 1565543916;
        lg.iilu[59] = -751419556;
        lg.iilu[60] = -1359371130;
        lg.iilu[61] = 315363674;
        lg.iilu[62] = 1627202268;
        lg.iilu[63] = 1847275915;
        lg.iilu[64] = 1456705454;
        lg.iilu[65] = -8728106;
        lg.iilu[66] = -1706541680;
        lg.iilu[67] = -194892415;
        lg.iilu[68] = 1735939164;
        lg.iilu[69] = -1827690537;
        lg.iilu[70] = -1118942090;
        lg.iilu[71] = 367810480;
        lg.iilu[72] = 1415990187;
        lg.iilu[73] = 739228859;
        lg.iilu[74] = 2102874545;
        lg.iilu[75] = -1573716461;
        lg.iilu[76] = -1192143408;
        lg.iilu[77] = 3899443;
        lg.iilu[78] = 721296811;
        lg.iilu[79] = 1690997606;
        lg.iilu[80] = 41779886;
        lg.iilu[81] = -463894887;
        lg.iilu[82] = -1318004822;
        lg.iilu[83] = 1929824591;
        lg.iilu[84] = -328206786;
        lg.iilu[85] = -1334934810;
        lg.iilu[86] = -1556952622;
        lg.iilu[87] = 1203313176;
        lg.iilu[88] = -1309679076;
        lg.iilu[89] = -1585037507;
        lg.iilu[90] = -2061780540;
        lg.iilu[91] = 1464225416;
        lg.iilu[92] = -1371854698;
        lg.iilu[93] = 1965445541;
        lg.iilu[94] = -1062860067;
        lg.iilu[95] = -1271354063;
        lg.iilu[96] = 2017698784;
        lg.iilu[97] = -1156125229;
        lg.iilu[98] = -1234978921;
        lg.iilu[99] = -1555168760;
    }

    public lg() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawInternal(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, int[] var10_10, int var11_11, boolean var12_12) {
        block184: {
            block183: {
                block182: {
                    var21_13 = lg.c;
                    var20_14 /* !! */  = lg.b;
                    var19_15 = lg.a;
                    if (var21_13) {
                        throw null;
lbl6:
                        // 52 sources

                        return;
                    }
                    if (var19_15 || var19_15) ** GOTO lbl6
                    if (lg.pipeline != null) break block182;
                    if (var19_15 || var19_15) ** GOTO lbl6
                    lg.init();
                    if (var19_15) ** GOTO lbl6
                }
                if (var19_15 || var19_15) ** GOTO lbl6
                if (lg.pipeline == null) break block183;
                if (var19_15) ** GOTO lbl6
                if (lg.uniformBuffer != null) break block184;
                if (var19_15) ** GOTO lbl6
            }
            if (var19_15 || var19_15) ** GOTO lbl6
            return;
        }
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16 = lg.uniformData;
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.clear();
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.position((int)lg.iilo("ijrv", iilr(int ), (int)84));
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
        if (var19_15 || var19_15) ** GOTO lbl6
        var13_16.putFloat(var7_7).putFloat(var6_6).putFloat(var8_8).putFloat(var5_5);
        if (var19_15) ** GOTO lbl6
        if (var20_14 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_14 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_15) ** GOTO lbl6
                var13_16.putFloat(var9_9);
                if (var19_15 || var19_15) ** GOTO lbl6
                var13_16.putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
                if (var19_15 || var19_15) ** GOTO lbl6
                var14_17 = lg.iilo("ijrw", iilr(int ), (int)85);
                if (var19_15) ** GOTO lbl6
                do {
                    if (var19_15 || var19_15) ** GOTO lbl6
                    if (var14_17 >= lg.iilo("ijrx", iilr(int ), (int)86)) ** GOTO lbl91
                    if (var19_15 || var19_15) ** GOTO lbl6
                    if (!var12_12) ** GOTO lbl72
                    if (var19_15) ** GOTO lbl6
                    v0 = var11_11;
                    if (var21_13) {
                        throw null;
                    }
                    ** GOTO lbl74
lbl72:
                    // 1 sources

                    if (var19_15 || var19_15) ** GOTO lbl6
                    v0 = var15_19 = lg.colorAt(var10_10, (int)var14_17);
lbl74:
                    // 2 sources

                    if (var19_15 || var19_15) ** GOTO lbl6
                    var13_16.putFloat((float)(var15_19 >> lg.iilo("ijry", iilr(int ), (int)87) & lg.iilo("ijrz", iilr(int ), (int)88)) / lg.iilo("ijsb", ijsa(int ), (int)89));
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var13_16.putFloat((float)(var15_19 >> lg.iilo("ijsc", iilr(int ), (int)90) & lg.iilo("ijsd", iilr(int ), (int)91)) / lg.iilo("ijse", ijsa(int ), (int)92));
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var13_16.putFloat((float)(var15_19 & lg.iilo("ijsf", iilr(int ), (int)93)) / lg.iilo("ijsg", ijsa(int ), (int)94));
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var13_16.putFloat((float)(var15_19 >> lg.iilo("ijsh", iilr(int ), (int)95) & lg.iilo("ijsi", iilr(int ), (int)96)) / lg.iilo("ijsj", ijsa(int ), (int)97));
                    if (var19_15 || var19_15) ** GOTO lbl6
                    ++var14_17;
                    if (var19_15) ** GOTO lbl6
                } while (!var21_13);
                throw null;
lbl91:
                // 1 sources

                if (var19_15 || var19_15) ** GOTO lbl6
                var13_16.flip();
                if (var19_15 || var19_15) ** GOTO lbl6
                var14_18 = RenderSystem.getDevice().createCommandEncoder();
                if (var19_15 || var19_15) ** GOTO lbl6
                var14_18.writeToBuffer(lg.uniformBuffer.slice(), var13_16);
                if (var19_15 || var19_15) ** GOTO lbl6
                var15_20 = class_310.method_1551().method_1522();
                if (var19_15 || var19_15) ** GOTO lbl6
                var16_21 = var14_18.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$drawInternal$1(), ()Ljava/lang/String;)(), var15_20.method_71639(), OptionalInt.empty());
                if (var19_15) ** GOTO lbl6
                try {
                    if (var19_15) ** GOTO lbl6
                    oq.applyToPass(var16_21);
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var16_21.setPipeline(lg.pipeline);
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var16_21.setUniform("Uniforms", lg.uniformBuffer);
                    if (var19_15 || var19_15) ** GOTO lbl6
                    var16_21.draw((int)lg.iilo("ijsk", iilr(int ), (int)98), (int)lg.iilo("ijsl", iilr(int ), (int)99));
                    if (var19_15 || var19_15) ** GOTO lbl6
                    if (var16_21 == null) ** GOTO lbl137
                    if (var19_15) ** GOTO lbl6
                }
                catch (Throwable var17_22) {
                    if (var19_15) ** GOTO lbl6
                    if (var16_21 == null) ** GOTO lbl130
                    if (var19_15) ** GOTO lbl6
                    try {
                        if (var19_15) ** GOTO lbl6
                        var16_21.close();
                        if (var19_15 || var19_15) ** GOTO lbl6
                        ** if (!var21_13) goto lbl-1000
                    }
                    catch (Throwable var18_23) {
                        if (var19_15) ** GOTO lbl6
                        var17_22.addSuppressed(var18_23);
                        if (var19_15) ** GOTO lbl6
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
lbl130:
                    // 3 sources

                    if (var19_15 || var19_15) ** GOTO lbl6
                    throw var17_22;
                }
                var16_21.close();
                if (var19_15) ** GOTO lbl6
                if (var21_13) {
                    throw null;
                }
lbl137:
                // 3 sources

                if (!var19_15 && !var19_15) ** break;
                ** continue;
                return;
            }
lbl140:
            // 5 sources

            case 0: {
                var20_14 /* !! */  = (int)lg.iilo("ijsm", iilr(int ), (int)100);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl145:
            // 2 sources

            case 1: {
                var20_14 /* !! */  = (int)lg.iilo("ijsn", iilr(int ), (int)101);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 2: {
                var20_14 /* !! */  = (int)lg.iilo("ijso", iilr(int ), (int)102);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl506
            }
            case 3: {
                var20_14 /* !! */  = (int)lg.iilo("ijsp", iilr(int ), (int)103);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl160:
            // 2 sources

            case 4: {
                var20_14 /* !! */  = (int)lg.iilo("ijsq", iilr(int ), (int)104);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl165:
            // 2 sources

            case 5: {
                var20_14 /* !! */  = (int)lg.iilo("ijsr", iilr(int ), (int)105);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl170:
            // 2 sources

            case 6: {
                var20_14 /* !! */  = (int)lg.iilo("ijss", iilr(int ), (int)106);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl412
            }
            case 7: {
                var20_14 /* !! */  = (int)lg.iilo("ijst", iilr(int ), (int)107);
                if (!var21_13) ** GOTO lbl140
                throw null;
            }
            case 8: {
                var20_14 /* !! */  = (int)lg.iilo("ijsu", iilr(int ), (int)108);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl184:
            // 2 sources

            case 9: {
                var20_14 /* !! */  = (int)lg.iilo("ijsv", iilr(int ), (int)109);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl518
            }
lbl189:
            // 2 sources

            case 10: {
                var20_14 /* !! */  = (int)lg.iilo("ijsw", iilr(int ), (int)110);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl426
            }
            case 11: {
                var20_14 /* !! */  = (int)lg.iilo("ijsx", iilr(int ), (int)111);
                if (!var21_13) ** GOTO lbl170
                throw null;
            }
lbl198:
            // 3 sources

            case 12: {
                var20_14 /* !! */  = (int)lg.iilo("ijsy", iilr(int ), (int)112);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl203:
            // 2 sources

            case 13: {
                var20_14 /* !! */  = (int)lg.iilo("ijsz", iilr(int ), (int)113);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl208:
            // 2 sources

            case 14: {
                var20_14 /* !! */  = (int)lg.iilo("ijta", iilr(int ), (int)114);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl213:
            // 2 sources

            case 15: {
                var20_14 /* !! */  = (int)lg.iilo("ijtb", iilr(int ), (int)115);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl218:
            // 3 sources

            case 16: {
                var20_14 /* !! */  = (int)lg.iilo("ijtc", iilr(int ), (int)116);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl514
            }
lbl223:
            // 2 sources

            case 17: {
                var20_14 /* !! */  = (int)lg.iilo("ijtd", iilr(int ), (int)117);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 18: {
                var20_14 /* !! */  = (int)lg.iilo("ijte", iilr(int ), (int)118);
                if (!var21_13) ** GOTO lbl223
                throw null;
            }
lbl232:
            // 2 sources

            case 19: {
                var20_14 /* !! */  = (int)lg.iilo("ijtf", iilr(int ), (int)119);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl237:
            // 2 sources

            case 20: {
                var20_14 /* !! */  = (int)lg.iilo("ijtg", iilr(int ), (int)120);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl514
            }
            case 21: {
                var20_14 /* !! */  = (int)lg.iilo("ijth", iilr(int ), (int)121);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl510
            }
lbl247:
            // 2 sources

            case 22: {
                var20_14 /* !! */  = (int)lg.iilo("ijti", iilr(int ), (int)122);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl448
            }
lbl252:
            // 2 sources

            case 23: {
                var20_14 /* !! */  = (int)lg.iilo("ijtj", iilr(int ), (int)123);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl257:
            // 4 sources

            case 24: {
                var20_14 /* !! */  = (int)lg.iilo("ijtk", iilr(int ), (int)124);
                if (var21_13) {
                    throw null;
                }
            }
lbl261:
            // 5 sources

            case 25: {
                var20_14 /* !! */  = (int)lg.iilo("ijtl", iilr(int ), (int)125);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 26: {
                var20_14 /* !! */  = (int)lg.iilo("ijtm", iilr(int ), (int)126);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl271:
            // 2 sources

            case 27: {
                var20_14 /* !! */  = (int)lg.iilo("ijtn", iilr(int ), (int)127);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl276:
            // 3 sources

            case 28: {
                var20_14 /* !! */  = (int)lg.iilo("ijto", iilr(int ), (int)128);
                if (!var21_13) ** GOTO lbl208
                throw null;
            }
lbl280:
            // 2 sources

            case 29: {
                var20_14 /* !! */  = (int)lg.iilo("ijtp", iilr(int ), (int)129);
                if (!var21_13) ** GOTO lbl232
                throw null;
            }
lbl284:
            // 5 sources

            case 30: {
                var20_14 /* !! */  = (int)lg.iilo("ijtq", iilr(int ), (int)130);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 31: {
                var20_14 /* !! */  = (int)lg.iilo("ijtr", iilr(int ), (int)131);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 32: {
                var20_14 /* !! */  = (int)lg.iilo("ijts", iilr(int ), (int)132);
                if (!var21_13) ** GOTO lbl257
                throw null;
            }
            case 33: {
                var20_14 /* !! */  = (int)lg.iilo("ijtt", iilr(int ), (int)133);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl510
            }
            case 34: {
                var20_14 /* !! */  = (int)lg.iilo("ijtu", iilr(int ), (int)134);
                if (var21_13) {
                    throw null;
                }
            }
lbl307:
            // 4 sources

            case 35: {
                var20_14 /* !! */  = (int)lg.iilo("ijtv", iilr(int ), (int)135);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl482
            }
lbl312:
            // 2 sources

            case 36: {
                var20_14 /* !! */  = (int)lg.iilo("ijtw", iilr(int ), (int)136);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl473
            }
lbl317:
            // 2 sources

            case 37: {
                var20_14 /* !! */  = (int)lg.iilo("ijtx", iilr(int ), (int)137);
                if (!var21_13) ** GOTO lbl276
                throw null;
            }
lbl321:
            // 3 sources

            case 38: {
                var20_14 /* !! */  = (int)lg.iilo("ijty", iilr(int ), (int)138);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl326:
            // 2 sources

            case 39: {
                var20_14 /* !! */  = (int)lg.iilo("ijtz", iilr(int ), (int)139);
                if (!var21_13) ** GOTO lbl198
                throw null;
            }
lbl330:
            // 5 sources

            case 40: {
                var20_14 /* !! */  = (int)lg.iilo("ijua", iilr(int ), (int)140);
                if (!var21_13) ** GOTO lbl307
                throw null;
            }
            case 41: {
                var20_14 /* !! */  = (int)lg.iilo("ijub", iilr(int ), (int)141);
                if (!var21_13) ** GOTO lbl140
                throw null;
            }
lbl338:
            // 4 sources

            case 42: {
                var20_14 /* !! */  = (int)lg.iilo("ijuc", iilr(int ), (int)142);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl343:
            // 2 sources

            case 43: {
                var20_14 /* !! */  = (int)lg.iilo("ijud", iilr(int ), (int)143);
                if (!var21_13) ** GOTO lbl165
                throw null;
            }
lbl347:
            // 3 sources

            case 44: {
                var20_14 /* !! */  = (int)lg.iilo("ijue", iilr(int ), (int)144);
                if (!var21_13) ** GOTO lbl261
                throw null;
            }
            case 45: {
                var20_14 /* !! */  = (int)lg.iilo("ijuf", iilr(int ), (int)145);
                if (!var21_13) ** GOTO lbl284
                throw null;
            }
lbl355:
            // 3 sources

            case 46: {
                var20_14 /* !! */  = (int)lg.iilo("ijug", iilr(int ), (int)146);
                if (!var21_13) ** GOTO lbl347
                throw null;
            }
            case 47: {
                var20_14 /* !! */  = (int)lg.iilo("ijuh", iilr(int ), (int)147);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl510
            }
            case 48: {
                var20_14 /* !! */  = (int)lg.iilo("ijui", iilr(int ), (int)148);
                if (var21_13) {
                    throw null;
                }
            }
            case 49: {
                var20_14 /* !! */  = (int)lg.iilo("ijuj", iilr(int ), (int)149);
                if (!var21_13) ** GOTO lbl189
                throw null;
            }
lbl372:
            // 2 sources

            case 50: {
                var20_14 /* !! */  = (int)lg.iilo("ijuk", iilr(int ), (int)150);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl473
            }
lbl377:
            // 2 sources

            case 51: {
                var20_14 /* !! */  = (int)lg.iilo("ijul", iilr(int ), (int)151);
                if (!var21_13) ** GOTO lbl247
                throw null;
            }
lbl381:
            // 3 sources

            case 52: {
                var20_14 /* !! */  = (int)lg.iilo("ijum", iilr(int ), (int)152);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl518
            }
            case 53: {
                var20_14 /* !! */  = (int)lg.iilo("ijun", iilr(int ), (int)153);
                if (!var21_13) ** GOTO lbl381
                throw null;
            }
            case 54: {
                var20_14 /* !! */  = (int)lg.iilo("ijuo", iilr(int ), (int)154);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl395:
            // 2 sources

            case 55: {
                var20_14 /* !! */  = (int)lg.iilo("ijup", iilr(int ), (int)155);
                if (!var21_13) ** GOTO lbl372
                throw null;
            }
lbl399:
            // 2 sources

            case 56: {
                var20_14 /* !! */  = (int)lg.iilo("ijuq", iilr(int ), (int)156);
                if (!var21_13) ** GOTO lbl140
                throw null;
            }
            case 57: {
                var20_14 /* !! */  = (int)lg.iilo("ijur", iilr(int ), (int)157);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 58: {
                var20_14 /* !! */  = (int)lg.iilo("ijus", iilr(int ), (int)158);
                if (!var21_13) break;
                throw null;
            }
lbl412:
            // 2 sources

            case 59: {
                var20_14 /* !! */  = (int)lg.iilo("ijut", iilr(int ), (int)159);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl490
            }
            case 60: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_14 /* !! */  = (int)lg.iilo("ijuu", iilr(int ), (int)160);
                    if (!var21_13) ** GOTO lbl284
                    throw null;
                }
            }
            case 61: {
                var20_14 /* !! */  = (int)lg.iilo("ijuv", iilr(int ), (int)161);
                if (!var21_13) ** GOTO lbl330
                throw null;
            }
lbl426:
            // 2 sources

            case 62: {
                var20_14 /* !! */  = (int)lg.iilo("ijuw", iilr(int ), (int)162);
                if (!var21_13) ** GOTO lbl381
                throw null;
            }
            case 63: {
                var20_14 /* !! */  = (int)lg.iilo("ijux", iilr(int ), (int)163);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl468
            }
            case 64: {
                var20_14 /* !! */  = (int)lg.iilo("ijuy", iilr(int ), (int)164);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl478
            }
            case 65: {
                var20_14 /* !! */  = (int)lg.iilo("ijuz", iilr(int ), (int)165);
                if (!var21_13) ** GOTO lbl145
                throw null;
            }
            case 66: {
                var20_14 /* !! */  = (int)lg.iilo("ijva", iilr(int ), (int)166);
                if (!var21_13) ** GOTO lbl261
                throw null;
            }
lbl448:
            // 2 sources

            case 67: {
                var20_14 /* !! */  = (int)lg.iilo("ijvb", iilr(int ), (int)167);
                if (!var21_13) ** GOTO lbl343
                throw null;
            }
lbl452:
            // 2 sources

            case 68: {
                var20_14 /* !! */  = (int)lg.iilo("ijvc", iilr(int ), (int)168);
                if (!var21_13) ** GOTO lbl271
                throw null;
            }
            case 69: {
                var20_14 /* !! */  = (int)lg.iilo("ijvd", iilr(int ), (int)169);
                if (!var21_13) ** GOTO lbl312
                throw null;
            }
lbl460:
            // 3 sources

            case 70: {
                var20_14 /* !! */  = (int)lg.iilo("ijve", iilr(int ), (int)170);
                if (var21_13) {
                    throw null;
                }
            }
            case 71: {
                var20_14 /* !! */  = (int)lg.iilo("ijvf", iilr(int ), (int)171);
                if (!var21_13) ** GOTO lbl218
                throw null;
            }
lbl468:
            // 2 sources

            case 72: {
                var20_14 /* !! */  = (int)lg.iilo("ijvg", iilr(int ), (int)172);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl506
            }
lbl473:
            // 3 sources

            case 73: {
                var20_14 /* !! */  = (int)lg.iilo("ijvh", iilr(int ), (int)173);
                if (var21_13) {
                    throw null;
                }
                ** GOTO lbl518
            }
lbl478:
            // 3 sources

            case 74: {
                var20_14 /* !! */  = (int)lg.iilo("ijvi", iilr(int ), (int)174);
                if (!var21_13) ** GOTO lbl347
                throw null;
            }
lbl482:
            // 2 sources

            case 75: {
                var20_14 /* !! */  = (int)lg.iilo("ijvj", iilr(int ), (int)175);
                if (!var21_13) ** GOTO lbl203
                throw null;
            }
            case 76: {
                var20_14 /* !! */  = (int)lg.iilo("ijvk", iilr(int ), (int)176);
                if (!var21_13) ** GOTO lbl184
                throw null;
            }
lbl490:
            // 2 sources

            case 77: {
                var20_14 /* !! */  = (int)lg.iilo("ijvl", iilr(int ), (int)177);
                if (!var21_13) ** GOTO lbl317
                throw null;
            }
            case 78: {
                var20_14 /* !! */  = (int)lg.iilo("ijvm", iilr(int ), (int)178);
                if (!var21_13) ** GOTO lbl330
                throw null;
            }
            case 79: {
                var20_14 /* !! */  = (int)lg.iilo("ijvn", iilr(int ), (int)179);
                if (!var21_13) ** GOTO lbl218
                throw null;
            }
lbl502:
            // 2 sources

            case 80: {
                var20_14 /* !! */  = (int)lg.iilo("ijvo", iilr(int ), (int)180);
                if (!var21_13) ** GOTO lbl377
                throw null;
            }
lbl506:
            // 4 sources

            case 81: {
                var20_14 /* !! */  = (int)lg.iilo("ijvp", iilr(int ), (int)181);
                if (!var21_13) ** GOTO lbl237
                throw null;
            }
lbl510:
            // 4 sources

            case 82: {
                var20_14 /* !! */  = (int)lg.iilo("ijvq", iilr(int ), (int)182);
                if (!var21_13) ** GOTO lbl140
                throw null;
            }
lbl514:
            // 3 sources

            case 83: {
                var20_14 /* !! */  = (int)lg.iilo("ijvr", iilr(int ), (int)183);
                if (!var21_13) ** GOTO lbl213
                throw null;
            }
lbl518:
            // 4 sources

            case 84: {
                var20_14 /* !! */  = (int)lg.iilo("ijvs", iilr(int ), (int)184);
                if (!var21_13) ** GOTO lbl160
                throw null;
            }
lbl522:
            // 2 sources

            case 85: {
                var20_14 /* !! */  = (int)lg.iilo("ijvt", iilr(int ), (int)185);
                if (!var21_13) ** GOTO lbl257
                throw null;
            }
            case 86: {
                var20_14 /* !! */  = (int)lg.iilo("ijvu", iilr(int ), (int)186);
                if (!var21_13) ** GOTO lbl506
                throw null;
            }
            case 87: {
                var20_14 /* !! */  = (int)lg.iilo("ijvv", iilr(int ), (int)187);
                if (!var21_13) ** GOTO lbl522
                throw null;
            }
            case 88: {
                var20_14 /* !! */  = (int)lg.iilo("ijvw", iilr(int ), (int)188);
                if (!var21_13) ** GOTO lbl452
                throw null;
            }
            case 89: {
                var20_14 /* !! */  = (int)lg.iilo("ijvx", iilr(int ), (int)189);
                if (!var21_13) ** GOTO lbl198
                throw null;
            }
            case 90: 
        }
        var20_14 /* !! */  = (int)lg.iilo("ijvy", iilr(int ), (int)190);
        ** while (!var21_13)
lbl545:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikak() {
        lg.iiln[0] = -8710669126721860872L;
        lg.iiln[1] = 7423388968126883120L;
        lg.iiln[2] = -7718491555063955085L;
        lg.iiln[3] = -5337971231642611814L;
        lg.iiln[4] = -3958312559700704088L;
        lg.iiln[5] = -8948112090935011736L;
        lg.iiln[6] = 4378008004694478915L;
        lg.iiln[7] = -5003003691232130619L;
        lg.iiln[8] = -9122716078130042622L;
        lg.iiln[9] = -3963641033525543419L;
        lg.iiln[10] = -1675825450099885601L;
        lg.iiln[11] = -8290075766353175779L;
        lg.iiln[12] = -4721842689201130842L;
        lg.iiln[13] = -582315766634287276L;
        lg.iiln[14] = 4639618706378586426L;
        lg.iiln[15] = 1201562922904673497L;
        lg.iiln[16] = 9057298900348336170L;
        lg.iiln[17] = -1035753728644824380L;
        lg.iiln[18] = 2185157934732774090L;
        lg.iiln[19] = 4172984691615128220L;
        lg.iiln[20] = -176958736681722834L;
        lg.iiln[21] = 8834474052113662509L;
        lg.iiln[22] = 6574310324156829120L;
        lg.iiln[23] = -8010177575026724784L;
        lg.iiln[24] = -5571224270404438959L;
        lg.iiln[25] = 6261714042739091379L;
        lg.iiln[26] = -4325672156490508636L;
        lg.iiln[27] = 619591847532598570L;
        lg.iiln[28] = 4606012226920617366L;
        lg.iiln[29] = -4477671715657937488L;
        lg.iiln[30] = -5217603953184987286L;
        lg.iiln[31] = -7989241394533065592L;
        lg.iiln[32] = 3805415382557037104L;
        lg.iiln[33] = 5725663300024760552L;
        lg.iiln[34] = -3268624360515611260L;
        lg.iiln[35] = -5818031756482076707L;
        lg.iiln[36] = 7227431168468302025L;
        lg.iiln[37] = -7674807537691211253L;
        lg.iiln[38] = -8382058268325555106L;
        lg.iiln[39] = -1187367080932619136L;
        lg.iiln[40] = -8857856967008674363L;
        lg.iiln[41] = -6379026823742535281L;
        lg.iiln[42] = 599493994273834126L;
        lg.iiln[43] = 3968303546865662982L;
        lg.iiln[44] = -2524150705121845146L;
        lg.iiln[45] = -3636744018021766200L;
        lg.iiln[46] = 3325249549555039922L;
        lg.iiln[47] = -4436133272916162583L;
        lg.iiln[48] = 5139763873822810243L;
        lg.iiln[49] = -2611434062191496574L;
        lg.iiln[50] = -1958768657240492545L;
        lg.iiln[51] = -5150463232836018832L;
        lg.iiln[52] = -6421748776556886679L;
        lg.iiln[53] = 7476520356127668656L;
        lg.iiln[54] = -4431672522366464565L;
        lg.iiln[55] = -2911511730285341034L;
        lg.iiln[56] = -3610757925782751295L;
        lg.iiln[57] = 3934352257465119426L;
        lg.iiln[58] = 6144404571950172483L;
        lg.iiln[59] = -2214195956151088835L;
        lg.iiln[60] = -9069586898643881382L;
        lg.iiln[61] = -3989915652790865112L;
        lg.iiln[62] = -9215758276962298312L;
        lg.iiln[63] = -2055508510722293754L;
        lg.iiln[64] = 6500233216547488103L;
        lg.iiln[65] = -2364235473723128071L;
        lg.iiln[66] = -873266453415479535L;
        lg.iiln[67] = -1404063983239986805L;
        lg.iiln[68] = -8493396568824785991L;
        lg.iiln[69] = 6183524086623077523L;
        lg.iiln[70] = 4099719605811385161L;
        lg.iiln[71] = -8039735129615678749L;
        lg.iiln[72] = -5081766628199741433L;
        lg.iiln[73] = -8295487786316809706L;
        lg.iiln[74] = -268120140755058640L;
        lg.iiln[75] = -8824126736898458741L;
        lg.iiln[76] = -8982615130101777715L;
        lg.iiln[77] = -2911326061897965932L;
        lg.iiln[78] = 3594739108490917798L;
        lg.iiln[79] = -5699106744499504260L;
        lg.iiln[80] = 5065548728830624469L;
        lg.iiln[81] = 3455595922581139152L;
        lg.iiln[82] = 5910350000782374742L;
        lg.iiln[83] = -6408895729312785474L;
        lg.iiln[84] = -1271940686960859819L;
        lg.iiln[85] = 3886868443039161467L;
        lg.iiln[86] = 815842648792647284L;
        lg.iiln[87] = 5116271177694672684L;
        lg.iiln[88] = -2531302181658017938L;
        lg.iiln[89] = 7770582303261507822L;
        lg.iiln[90] = -4553728433851414664L;
        lg.iiln[91] = -8981141045690683942L;
        lg.iiln[92] = -7318905888082174969L;
        lg.iiln[93] = -2284818343190274465L;
        lg.iiln[94] = -3170900931176628263L;
        lg.iiln[95] = -1936724410208205996L;
        lg.iiln[96] = 4434769246018951265L;
        lg.iiln[97] = 8523685613656486133L;
        lg.iiln[98] = -5491269928860020965L;
        lg.iiln[99] = -3774923530685616489L;
    }

    private static /* synthetic */ void ikah() {
        lg.iilu[200] = -1376721017;
        lg.iilu[201] = 371210599;
        lg.iilu[202] = 1775679740;
        lg.iilu[203] = 1755499705;
        lg.iilu[204] = -1388449733;
        lg.iilu[205] = -1992171144;
        lg.iilu[206] = 1339790944;
        lg.iilu[207] = -347234818;
        lg.iilu[208] = -1744837182;
        lg.iilu[209] = -255166612;
        lg.iilu[210] = 707860446;
        lg.iilu[211] = 2125536750;
        lg.iilu[212] = -128998087;
        lg.iilu[213] = -230209233;
        lg.iilu[214] = -1222879526;
        lg.iilu[215] = -2089967669;
        lg.iilu[216] = 523666965;
        lg.iilu[217] = -146900386;
        lg.iilu[218] = 1604040557;
        lg.iilu[219] = 2043151960;
        lg.iilu[220] = 1906592618;
        lg.iilu[221] = -1129139573;
        lg.iilu[222] = 916618758;
        lg.iilu[223] = -83365274;
        lg.iilu[224] = 48401823;
        lg.iilu[225] = -1587988027;
        lg.iilu[226] = 890938292;
        lg.iilu[227] = -86258483;
        lg.iilu[228] = -2040318955;
        lg.iilu[229] = -763640805;
        lg.iilu[230] = 1349111514;
        lg.iilu[231] = -1925282170;
        lg.iilu[232] = 2037964998;
        lg.iilu[233] = -55292165;
        lg.iilu[234] = -1803179505;
        lg.iilu[235] = 888065095;
        lg.iilu[236] = -1958086247;
        lg.iilu[237] = -1057861182;
        lg.iilu[238] = -1052865756;
        lg.iilu[239] = 2139845211;
        lg.iilu[240] = 1119103798;
        lg.iilu[241] = -677001404;
        lg.iilu[242] = -864946699;
        lg.iilu[243] = -1469723457;
        lg.iilu[244] = -1060207712;
        lg.iilu[245] = 793654502;
        lg.iilu[246] = 1185560044;
        lg.iilu[247] = 174664425;
        lg.iilu[248] = -645685837;
    }

    private static /* synthetic */ void ikag() {
        lg.iilu[100] = -605595628;
        lg.iilu[101] = 49268959;
        lg.iilu[102] = -1182859985;
        lg.iilu[103] = -1096414409;
        lg.iilu[104] = -1242873478;
        lg.iilu[105] = -102562758;
        lg.iilu[106] = 1059560840;
        lg.iilu[107] = -961913039;
        lg.iilu[108] = -1310833911;
        lg.iilu[109] = -2141760544;
        lg.iilu[110] = -545793201;
        lg.iilu[111] = 1732648967;
        lg.iilu[112] = 2002647342;
        lg.iilu[113] = 172086217;
        lg.iilu[114] = 1886032991;
        lg.iilu[115] = -627765254;
        lg.iilu[116] = -1953532725;
        lg.iilu[117] = -146587484;
        lg.iilu[118] = 690888293;
        lg.iilu[119] = 76995408;
        lg.iilu[120] = 406463105;
        lg.iilu[121] = -1349285945;
        lg.iilu[122] = -491402809;
        lg.iilu[123] = 250391402;
        lg.iilu[124] = 2081645106;
        lg.iilu[125] = 604103264;
        lg.iilu[126] = -601477439;
        lg.iilu[127] = -1384884458;
        lg.iilu[128] = 1403884225;
        lg.iilu[129] = 822013936;
        lg.iilu[130] = -187258671;
        lg.iilu[131] = -1644837854;
        lg.iilu[132] = -395995621;
        lg.iilu[133] = 1779008506;
        lg.iilu[134] = -1000037291;
        lg.iilu[135] = 189550129;
        lg.iilu[136] = 1054216571;
        lg.iilu[137] = 53353207;
        lg.iilu[138] = -235167119;
        lg.iilu[139] = -1195424047;
        lg.iilu[140] = 2030562793;
        lg.iilu[141] = 617884300;
        lg.iilu[142] = 1623136054;
        lg.iilu[143] = 165274315;
        lg.iilu[144] = -838083325;
        lg.iilu[145] = -1575763714;
        lg.iilu[146] = 1450280448;
        lg.iilu[147] = 2135173309;
        lg.iilu[148] = -517937665;
        lg.iilu[149] = 780216293;
        lg.iilu[150] = 1833336863;
        lg.iilu[151] = 1327740134;
        lg.iilu[152] = -230146321;
        lg.iilu[153] = 620985887;
        lg.iilu[154] = -1870435912;
        lg.iilu[155] = -1599838655;
        lg.iilu[156] = -379128249;
        lg.iilu[157] = 1093041415;
        lg.iilu[158] = 1064118509;
        lg.iilu[159] = 1136019668;
        lg.iilu[160] = 270151836;
        lg.iilu[161] = 1453776103;
        lg.iilu[162] = 155132731;
        lg.iilu[163] = -1324396215;
        lg.iilu[164] = -445972818;
        lg.iilu[165] = -889451350;
        lg.iilu[166] = 2043292964;
        lg.iilu[167] = -1202405955;
        lg.iilu[168] = -1915023448;
        lg.iilu[169] = 26816725;
        lg.iilu[170] = 924864525;
        lg.iilu[171] = -1673973801;
        lg.iilu[172] = 974373797;
        lg.iilu[173] = -389374536;
        lg.iilu[174] = -1214477720;
        lg.iilu[175] = -476457956;
        lg.iilu[176] = 2064999030;
        lg.iilu[177] = -1313586976;
        lg.iilu[178] = -85725675;
        lg.iilu[179] = -596235646;
        lg.iilu[180] = -463701342;
        lg.iilu[181] = 2101915087;
        lg.iilu[182] = -227557115;
        lg.iilu[183] = -2025634750;
        lg.iilu[184] = -548426579;
        lg.iilu[185] = 1633141230;
        lg.iilu[186] = -1928952800;
        lg.iilu[187] = 1205111538;
        lg.iilu[188] = -5740899;
        lg.iilu[189] = -951118910;
        lg.iilu[190] = -1903950743;
        lg.iilu[191] = 1765122398;
        lg.iilu[192] = -793847202;
        lg.iilu[193] = 1812951576;
        lg.iilu[194] = 752614308;
        lg.iilu[195] = -1514767988;
        lg.iilu[196] = -1676537361;
        lg.iilu[197] = -1387904926;
        lg.iilu[198] = -1441651453;
        lg.iilu[199] = 65201884;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, int ... var10_10) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lg.ps - lg.iilo("ijqg", iill(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lg.iilo("ijqh", iilr(int ), (int)57)) break;
            v0 /* !! */  = (long)lg.iilo("ijqi", iilr(int ), (int)58);
        }
        var13_11 = lg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lg.ps - lg.iilo("ijqj", iill(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lg.iilo("ijqk", iilr(int ), (int)59)) break;
            v1 /* !! */  = (long)lg.iilo("ijql", iilr(int ), (int)60);
        }
        var12_12 /* !! */  = lg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lg.ps - lg.iilo("ijqm", iill(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lg.iilo("ijqn", iilr(int ), (int)61)) break;
            v2 /* !! */  = (long)lg.iilo("ijqo", iilr(int ), (int)62);
        }
        var11_13 = lg.a;
        if (var13_11) {
            throw null;
lbl24:
            // 3 sources

            return;
        }
        if (var11_13 || var11_13) ** GOTO lbl24
        v3 = lg.iilo("ijqp", iilr(int ), (int)63);
        v4 = lg.iilo("ijqq", iilr(int ), (int)64);
        v5 /* !! */  = lg.ps;
        if (true) ** GOTO lbl33
        block18: while (true) {
            v5 /* !! */  = (long)(v6 - lg.iilo("ijqr", iill(int ), (int)57));
lbl33:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1312131828: {
                    v6 = lg.iilo("ijqs", iill(int ), (int)58);
                    continue block18;
                }
                case -686986330: {
                    v6 = lg.iilo("ijqt", iill(int ), (int)59);
                    continue block18;
                }
                case 1249583958: {
                    v6 = lg.iilo("ijqu", iill(int ), (int)60);
                    continue block18;
                }
                case 2038263830: {
                    break block18;
                }
            }
            break;
        }
        lg.drawInternal(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9, var10_10, (int)v3, (boolean)v4);
        if (var11_13) ** GOTO lbl24
        if (var12_12 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_12 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var11_13) ** break;
                ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var12_12 /* !! */  = (int)lg.iilo("ijqv", iilr(int ), (int)65);
                if (var13_11) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_12 /* !! */  = (int)lg.iilo("ijqw", iilr(int ), (int)66);
                    if (var13_11) {
                        throw null;
                    }
                    ** GOTO lbl68
                    break;
                }
            }
            case 2: {
                var12_12 /* !! */  = (int)lg.iilo("ijqx", iilr(int ), (int)67);
                if (var13_11) {
                    throw null;
                }
            }
lbl68:
            // 4 sources

            case 3: {
                var12_12 /* !! */  = (int)lg.iilo("ijqy", iilr(int ), (int)68);
                if (!var13_11) break;
                throw null;
            }
lbl72:
            // 2 sources

            case 4: {
                var12_12 /* !! */  = (int)lg.iilo("ijqz", iilr(int ), (int)69);
                if (!var13_11) ** GOTO lbl53
                throw null;
            }
            case 5: 
        }
        var12_12 /* !! */  = (int)lg.iilo("ijra", iilr(int ), (int)70);
        ** while (!var13_11)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lg.ps - lg.iilo("ijzq", iill(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lg.iilo("ijzr", iilr(int ), (int)243)) break;
            v0 /* !! */  = (long)lg.iilo("ijzs", iilr(int ), (int)244);
        }
        var2 = lg.c;
        v1 /* !! */  = lg.ps;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(lg.iilo("ijzu", iill(int ), (int)113) - lg.iilo("ijzt", iill(int ), (int)112));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 380983322: {
                    continue block16;
                }
                case 2038263830: {
                    break block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = lg.b;
        v2 /* !! */  = lg.ps;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - lg.iilo("ijzv", iill(int ), (int)114));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1390030907: {
                    v3 = lg.iilo("ijzw", iill(int ), (int)115);
                    continue block17;
                }
                case 1942252365: {
                    v3 = lg.iilo("ijzx", iill(int ), (int)116);
                    continue block17;
                }
                case 2038263830: {
                    break block17;
                }
            }
            break;
        }
        var0_2 = lg.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "Rectangle2D Uniforms";
            }
lbl42:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lg.iilo("ijzy", iilr(int ), (int)245);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lg.iilo("ijzz", iilr(int ), (int)246);
                    if (!var2) ** GOTO lbl42
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)lg.iilo("ikaa", iilr(int ), (int)247);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lg.iilo("ikab", iilr(int ), (int)248);
        ** while (!var2)
lbl59:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$drawInternal$1() {
        v0 /* !! */  = lg.ps;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - lg.iilo("ijze", iill(int ), (int)103));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1285449284: {
                    v1 = lg.iilo("ijzf", iill(int ), (int)104);
                    continue block20;
                }
                case 1298506121: {
                    v1 = lg.iilo("ijzg", iill(int ), (int)105);
                    continue block20;
                }
                case 2038263830: {
                    break block20;
                }
            }
            break;
        }
        var2 = lg.c;
        v2 /* !! */  = lg.ps;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - lg.iilo("ijzh", iill(int ), (int)106));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1414700768: {
                    v3 = lg.iilo("ijzi", iill(int ), (int)107);
                    continue block21;
                }
                case 1506848657: {
                    v3 = lg.iilo("ijzj", iill(int ), (int)108);
                    continue block21;
                }
                case 2038263830: {
                    break block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = lg.b;
        v4 /* !! */  = lg.ps;
        if (true) ** GOTO lbl33
        block22: while (true) {
            v4 /* !! */  = (long)(lg.iilo("ijzl", iill(int ), (int)110) - lg.iilo("ijzk", iill(int ), (int)109));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1118787790: {
                    continue block22;
                }
                case 2038263830: {
                    break block22;
                }
            }
            break;
        }
        var0_2 = lg.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                return "Rectangle2D";
            }
lbl48:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lg.iilo("ijzm", iilr(int ), (int)239);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)lg.iilo("ijzn", iilr(int ), (int)240);
                if (var2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lg.iilo("ijzo", iilr(int ), (int)241);
                    if (!var2) ** GOTO lbl48
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lg.iilo("ijzp", iilr(int ), (int)242);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikal() {
        lg.iiln[100] = -9063240583220414608L;
        lg.iiln[101] = 7520755442656521973L;
        lg.iiln[102] = -8322298095074907896L;
        lg.iiln[103] = 6770523474691969288L;
        lg.iiln[104] = -8337883014585448858L;
        lg.iiln[105] = 4077918135670682882L;
        lg.iiln[106] = -2869098175155998176L;
        lg.iiln[107] = 1797304121894635538L;
        lg.iiln[108] = -4013930552151466397L;
        lg.iiln[109] = 4968164604848359615L;
        lg.iiln[110] = 7945251941878547720L;
        lg.iiln[111] = 7780160987653679398L;
        lg.iiln[112] = 1325200173608872939L;
        lg.iiln[113] = -1046467742371925039L;
        lg.iiln[114] = -3543702472104856338L;
        lg.iiln[115] = 5857903447260412075L;
        lg.iiln[116] = -1745756403252615094L;
    }
}

