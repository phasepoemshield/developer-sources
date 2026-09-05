/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
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
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import ruhack.phobia.om;

public class lv {
    private static final Matrix4f identityMatrix;
    private static final float[][] DIAMOND_CORNERS;
    private static boolean ignoreDepth;
    private static final int MAX_VERTICES = 8192;
    private static int[] ibzi;
    private static final int[][] BOX_EDGES;
    public static final boolean c;
    public static final boolean a;
    private static Matrix4f viewMatrix;
    private static int[] ibzh;
    private static final float[][] BOX_CORNERS;
    private static GpuBuffer uniformBuffer;
    private static long[] ibyz;
    private static long[] ibza;
    public static final int b;
    private static RenderPipeline pipeline;
    private static final class_310 mc;
    private static GpuBuffer vertexBuffer;
    private static final int VERTEX_SIZE = 16;
    private static Matrix4f projectionMatrix;
    private static final Matrix4f combinedMatrix;
    private static final int UNIFORM_SIZE = 256;
    private static final float[] vertices;
    private static final int[][] DIAMOND_EDGES;
    public static final long pk = -3191653673429847353L;
    private static int vertexCount;

    private static /* synthetic */ void idtt() {
        lv.ibzi[400] = 1461624748;
        lv.ibzi[401] = 709991290;
        lv.ibzi[402] = 887438466;
        lv.ibzi[403] = -1434952474;
        lv.ibzi[404] = -898693667;
        lv.ibzi[405] = -1968574710;
        lv.ibzi[406] = -394471927;
        lv.ibzi[407] = 2097661920;
        lv.ibzi[408] = 698142902;
        lv.ibzi[409] = -1690632851;
        lv.ibzi[410] = -337792043;
        lv.ibzi[411] = 591866716;
        lv.ibzi[412] = 1825539664;
        lv.ibzi[413] = 2136923581;
        lv.ibzi[414] = -1815451548;
        lv.ibzi[415] = -1645572868;
        lv.ibzi[416] = -1775656279;
        lv.ibzi[417] = 1415165823;
        lv.ibzi[418] = -1341707242;
        lv.ibzi[419] = 123912099;
        lv.ibzi[420] = 707628147;
        lv.ibzi[421] = -1279493919;
        lv.ibzi[422] = -1110274013;
        lv.ibzi[423] = 318295390;
        lv.ibzi[424] = 1169982248;
        lv.ibzi[425] = -314167997;
        lv.ibzi[426] = 977398990;
        lv.ibzi[427] = -652502143;
        lv.ibzi[428] = -439494046;
        lv.ibzi[429] = -1197099016;
        lv.ibzi[430] = -2076573990;
        lv.ibzi[431] = 715205904;
        lv.ibzi[432] = -401729944;
        lv.ibzi[433] = 492173133;
        lv.ibzi[434] = 474966077;
        lv.ibzi[435] = 888088417;
        lv.ibzi[436] = -696599029;
        lv.ibzi[437] = 1776980937;
        lv.ibzi[438] = -43907053;
        lv.ibzi[439] = 2048163071;
        lv.ibzi[440] = -603392589;
        lv.ibzi[441] = 1556348854;
        lv.ibzi[442] = -1367253547;
        lv.ibzi[443] = 739795664;
        lv.ibzi[444] = -894289996;
        lv.ibzi[445] = -360355104;
        lv.ibzi[446] = 1826057162;
        lv.ibzi[447] = 1751184249;
        lv.ibzi[448] = -182207002;
        lv.ibzi[449] = 856665756;
        lv.ibzi[450] = -163918660;
        lv.ibzi[451] = -782883584;
        lv.ibzi[452] = -1392349069;
        lv.ibzi[453] = 1349547531;
        lv.ibzi[454] = -1713377041;
        lv.ibzi[455] = -1349782349;
        lv.ibzi[456] = 1937665522;
        lv.ibzi[457] = 1550132895;
        lv.ibzi[458] = -5458354;
        lv.ibzi[459] = 1393093960;
        lv.ibzi[460] = -1576107851;
        lv.ibzi[461] = -1257943842;
        lv.ibzi[462] = -1087320089;
        lv.ibzi[463] = 2129423173;
        lv.ibzi[464] = 1708987742;
        lv.ibzi[465] = -1742696090;
        lv.ibzi[466] = 1215869081;
        lv.ibzi[467] = -2146810975;
        lv.ibzi[468] = 250971832;
        lv.ibzi[469] = 1259895344;
        lv.ibzi[470] = -1575490292;
        lv.ibzi[471] = 1346875563;
        lv.ibzi[472] = -1244015933;
        lv.ibzi[473] = 1656650776;
        lv.ibzi[474] = 606292192;
        lv.ibzi[475] = 517974315;
        lv.ibzi[476] = 873860368;
        lv.ibzi[477] = 1346576540;
        lv.ibzi[478] = 513925928;
        lv.ibzi[479] = 1869809094;
        lv.ibzi[480] = 266871375;
        lv.ibzi[481] = 365642724;
        lv.ibzi[482] = 1988113945;
        lv.ibzi[483] = 288037030;
        lv.ibzi[484] = -578363906;
        lv.ibzi[485] = -1434739879;
        lv.ibzi[486] = -1149084817;
        lv.ibzi[487] = -679799046;
        lv.ibzi[488] = -1671530292;
        lv.ibzi[489] = 1385768251;
        lv.ibzi[490] = 1718340392;
        lv.ibzi[491] = 739788652;
        lv.ibzi[492] = -110755634;
        lv.ibzi[493] = 942979614;
        lv.ibzi[494] = -1009023149;
        lv.ibzi[495] = 2088816286;
        lv.ibzi[496] = -964869896;
        lv.ibzi[497] = -787927589;
        lv.ibzi[498] = 1231861847;
        lv.ibzi[499] = 779142559;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void line(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7) {
        v0 /* !! */  = lv.pk;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - lv.ibzb("icjn", ibyy(int ), (int)149));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1455702172: {
                    v1 = lv.ibzb("icjo", ibyy(int ), (int)150);
                    continue block33;
                }
                case -1383811398: {
                    v1 = lv.ibzb("icjp", ibyy(int ), (int)151);
                    continue block33;
                }
                case -450579769: {
                    break block33;
                }
                case 512087975: {
                    v1 = lv.ibzb("icjq", ibyy(int ), (int)152);
                    continue block33;
                }
            }
            break;
        }
        var13_8 = lv.c;
        while (true) {
            block62: {
                if ((v2 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("icjr", ibyy(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != lv.ibzb("icjs", ibzg(int ), (int)119)) break block62;
                var12_9 /* !! */  = lv.b;
                v3 /* !! */  = lv.pk;
                if (true) ** GOTO lbl30
            }
            v2 /* !! */  = (long)lv.ibzb("icjt", ibzg(int ), (int)120);
        }
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - lv.ibzb("icju", ibyy(int ), (int)154));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1036366448: {
                    v4 = lv.ibzb("icjv", ibyy(int ), (int)155);
                    continue block35;
                }
                case -450579769: {
                    break block35;
                }
                case 2054100735: {
                    v4 = lv.ibzb("icjw", ibyy(int ), (int)156);
                    continue block35;
                }
            }
            break;
        }
        var11_10 = lv.a;
        if (var13_8) {
            throw null;
        }
        if (var11_10 || var11_10) return;
        var8_11 = (float)(var6_6 >> lv.ibzb("icjx", ibzg(int ), (int)121) & lv.ibzb("icjy", ibzg(int ), (int)122)) / lv.ibzb("icka", icjz(int ), (int)123);
        if (var11_10 || var11_10) return;
        var9_12 = (float)(var6_6 >> lv.ibzb("ickb", ibzg(int ), (int)124) & lv.ibzb("ickc", ibzg(int ), (int)125)) / lv.ibzb("ickd", icjz(int ), (int)126);
        if (var11_10 || var11_10) return;
        var10_13 = (float)(var6_6 & lv.ibzb("icke", ibzg(int ), (int)127)) / lv.ibzb("ickf", icjz(int ), (int)128);
        if (var11_10 || var11_10) return;
        v5 /* !! */  = lv.pk;
        if (true) ** GOTO lbl53
        block36: while (true) {
            v5 /* !! */  = (long)(v6 - lv.ibzb("ickg", ibyy(int ), (int)157));
lbl53:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1946808720: {
                    v6 = lv.ibzb("ickh", ibyy(int ), (int)158);
                    continue block36;
                }
                case -450579769: {
                    break block36;
                }
                case -49634717: {
                    v6 = lv.ibzb("icki", ibyy(int ), (int)159);
                    continue block36;
                }
                case 1545292055: {
                    v6 = lv.ibzb("ickj", ibyy(int ), (int)160);
                    continue block36;
                }
            }
            break;
        }
        lv.addVertex(var0, var1_1, var2_2, var8_11, var9_12, var10_13, var7_7);
        if (var11_10 || var11_10) return;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("ickk", ibyy(int ), (int)161)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == lv.ibzb("ickl", ibzg(int ), (int)129)) {
                lv.addVertex(var3_3, var4_4, var5_5, var8_11, var9_12, var10_13, var7_7);
                if (var11_10) return;
                break;
            }
            v7 /* !! */  = (long)lv.ibzb("ickm", ibzg(int ), (int)130);
        }
        if (var11_10) {
            return;
        }
        if (var12_9 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block38: while (true) {
            block63: {
                switch (cfr_temp_0 == -2147483648 ? var12_9 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 1: {
                        ** GOTO lbl130
                    }
                    case 4: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickr", ibzg(int ), (int)135);
                        cfr_temp_0 = 11;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 5: {
                        var12_9 /* !! */  = (int)lv.ibzb("icks", ibzg(int ), (int)136);
                        cfr_temp_0 = 3;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 7: {
                        var12_9 /* !! */  = (int)lv.ibzb("icku", ibzg(int ), (int)138);
                        if (var13_8) {
                            throw null;
                        }
                    }
                    case 8: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickv", ibzg(int ), (int)139);
                        cfr_temp_0 = 0;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 9: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickw", ibzg(int ), (int)140);
                        cfr_temp_0 = 0;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 10: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickx", ibzg(int ), (int)141);
                        cfr_temp_0 = 2;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 12: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickz", ibzg(int ), (int)143);
                        cfr_temp_0 = 11;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 13: {
                        var12_9 /* !! */  = (int)lv.ibzb("icla", ibzg(int ), (int)144);
                        if (var13_8) {
                            throw null;
                        }
lbl130:
                        // 3 sources

                        var12_9 /* !! */  = (int)lv.ibzb("icko", ibzg(int ), (int)132);
                        if (var13_8) {
                            throw null;
                        }
                    }
                    case 3: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickq", ibzg(int ), (int)134);
                        cfr_temp_0 = 6;
                        if (var13_8) {
                            throw null;
                        }
                        break block63;
                    }
                    case 0: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickn", ibzg(int ), (int)131);
                        if (var13_8) {
                            throw null;
                        }
                    }
                    case 11: {
                        var12_9 /* !! */  = (int)lv.ibzb("icky", ibzg(int ), (int)142);
                        if (var13_8) {
                            throw null;
                        }
                    }
                    case 6: {
                        var12_9 /* !! */  = (int)lv.ibzb("ickt", ibzg(int ), (int)137);
                        if (var13_8) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl156
            }
            do {
                if (true) continue block38;
lbl156:
                // 2 sources

                var12_9 /* !! */  = (int)lv.ibzb("ickp", ibzg(int ), (int)133);
                cfr_temp_0 = 0;
            } while (!var13_8);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putMatrix(ByteBuffer var0, Matrix4f var1_1) {
        v0 /* !! */  = lv.pk;
        if (true) ** GOTO lbl5
        block87: while (true) {
            v0 /* !! */  = (long)(lv.ibzb("idli", ibyy(int ), (int)203) - lv.ibzb("idlh", ibyy(int ), (int)202));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1140034206: {
                    continue block87;
                }
                case -450579769: {
                    break block87;
                }
            }
            break;
        }
        var4_2 = lv.c;
        v1 /* !! */  = lv.pk;
        if (true) ** GOTO lbl15
        block88: while (true) {
            v1 /* !! */  = (long)(lv.ibzb("idlk", ibyy(int ), (int)205) - lv.ibzb("idlj", ibyy(int ), (int)204));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -874685929: {
                    continue block88;
                }
                case -450579769: {
                    break block88;
                }
            }
            break;
        }
        var3_3 /* !! */  = lv.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("idll", ibyy(int ), (int)206)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == lv.ibzb("idlm", ibzg(int ), (int)642)) break;
                    v2 /* !! */  = (long)lv.ibzb("idln", ibzg(int ), (int)643);
                }
                var2_4 = lv.a;
                if (var4_2) {
                    throw null;
lbl32:
                    // 5 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl32
                v3 /* !! */  = lv.pk;
                if (true) ** GOTO lbl39
                block91: while (true) {
                    v3 /* !! */  = (long)(v4 - lv.ibzb("idlo", ibyy(int ), (int)207));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1873706164: {
                            v4 = lv.ibzb("idlp", ibyy(int ), (int)208);
                            continue block91;
                        }
                        case -1125325939: {
                            v4 = lv.ibzb("idlq", ibyy(int ), (int)209);
                            continue block91;
                        }
                        case -450579769: {
                            break block91;
                        }
                        case 1954830780: {
                            v4 = lv.ibzb("idlr", ibyy(int ), (int)210);
                            continue block91;
                        }
                    }
                    break;
                }
                v5 = var1_1.m00();
                v6 /* !! */  = lv.pk;
                if (true) ** GOTO lbl56
                block92: while (true) {
                    v6 /* !! */  = (long)(v7 - lv.ibzb("idls", ibyy(int ), (int)211));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1246108327: {
                            v7 = lv.ibzb("idlt", ibyy(int ), (int)212);
                            continue block92;
                        }
                        case -450579769: {
                            break block92;
                        }
                        case 1017684299: {
                            v7 = lv.ibzb("idlu", ibyy(int ), (int)213);
                            continue block92;
                        }
                        case 1805097264: {
                            v7 = lv.ibzb("idlv", ibyy(int ), (int)214);
                            continue block92;
                        }
                    }
                    break;
                }
                v8 = var0.putFloat(v5);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idlw", ibyy(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == lv.ibzb("idlx", ibzg(int ), (int)644)) break;
                    v9 /* !! */  = (long)lv.ibzb("idly", ibzg(int ), (int)645);
                }
                v10 = var1_1.m01();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("idlz", ibyy(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == lv.ibzb("idma", ibzg(int ), (int)646)) break;
                    v11 /* !! */  = (long)lv.ibzb("idmb", ibzg(int ), (int)647);
                }
                v12 = v8.putFloat(v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = lv.pk - lv.ibzb("idmc", ibyy(int ), (int)217)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == lv.ibzb("idmd", ibzg(int ), (int)648)) break;
                    v13 /* !! */  = (long)lv.ibzb("idme", ibzg(int ), (int)649);
                }
                v14 = var1_1.m02();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = lv.pk - lv.ibzb("idmf", ibyy(int ), (int)218)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == lv.ibzb("idmg", ibzg(int ), (int)650)) break;
                    v15 /* !! */  = (long)lv.ibzb("idmh", ibzg(int ), (int)651);
                }
                v16 = v12.putFloat(v14);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = lv.pk - lv.ibzb("idmi", ibyy(int ), (int)219)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == lv.ibzb("idmj", ibzg(int ), (int)652)) break;
                    v17 /* !! */  = (long)lv.ibzb("idmk", ibzg(int ), (int)653);
                }
                v18 = var1_1.m03();
                v19 /* !! */  = lv.pk;
                if (true) ** GOTO lbl103
                block98: while (true) {
                    v19 /* !! */  = (long)(lv.ibzb("idmm", ibyy(int ), (int)221) - lv.ibzb("idml", ibyy(int ), (int)220));
lbl103:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -450579769: {
                            break block98;
                        }
                        case 988215741: {
                            continue block98;
                        }
                    }
                    break;
                }
                v16.putFloat(v18);
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = lv.pk - lv.ibzb("idmn", ibyy(int ), (int)222)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == lv.ibzb("idmo", ibzg(int ), (int)654)) break;
                    v20 /* !! */  = (long)lv.ibzb("idmp", ibzg(int ), (int)655);
                }
                v21 = var1_1.m10();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = lv.pk - lv.ibzb("idmq", ibyy(int ), (int)223)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == lv.ibzb("idmr", ibzg(int ), (int)656)) break;
                    v22 /* !! */  = (long)lv.ibzb("idms", ibzg(int ), (int)657);
                }
                v23 = var0.putFloat(v21);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = lv.pk - lv.ibzb("idmt", ibyy(int ), (int)224)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == lv.ibzb("idmu", ibzg(int ), (int)658)) break;
                    v24 /* !! */  = (long)lv.ibzb("idmv", ibzg(int ), (int)659);
                }
                v25 = var1_1.m11();
                v26 /* !! */  = lv.pk;
                if (true) ** GOTO lbl133
                block102: while (true) {
                    v26 /* !! */  = (long)(v27 - lv.ibzb("idmw", ibyy(int ), (int)225));
lbl133:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -450579769: {
                            break block102;
                        }
                        case -107160288: {
                            v27 = lv.ibzb("idmx", ibyy(int ), (int)226);
                            continue block102;
                        }
                        case 918273995: {
                            v27 = lv.ibzb("idmy", ibyy(int ), (int)227);
                            continue block102;
                        }
                    }
                    break;
                }
                v28 = v23.putFloat(v25);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = lv.pk - lv.ibzb("idmz", ibyy(int ), (int)228)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == lv.ibzb("idna", ibzg(int ), (int)660)) break;
                    v29 /* !! */  = (long)lv.ibzb("idnb", ibzg(int ), (int)661);
                }
                v30 = var1_1.m12();
                v31 /* !! */  = lv.pk;
                if (true) ** GOTO lbl153
                block104: while (true) {
                    v31 /* !! */  = (long)(lv.ibzb("idnd", ibyy(int ), (int)230) - lv.ibzb("idnc", ibyy(int ), (int)229));
lbl153:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2120440483: {
                            continue block104;
                        }
                        case -450579769: {
                            break block104;
                        }
                    }
                    break;
                }
                v32 = v28.putFloat(v30);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_10 = lv.pk - lv.ibzb("idne", ibyy(int ), (int)231)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == lv.ibzb("idnf", ibzg(int ), (int)662)) break;
                    v33 /* !! */  = (long)lv.ibzb("idng", ibzg(int ), (int)663);
                }
                v34 = var1_1.m13();
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_11 = lv.pk - lv.ibzb("idnh", ibyy(int ), (int)232)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == lv.ibzb("idni", ibzg(int ), (int)664)) break;
                    v35 /* !! */  = (long)lv.ibzb("idnj", ibzg(int ), (int)665);
                }
                v32.putFloat(v34);
                if (var2_4 || var2_4) ** GOTO lbl32
                v36 /* !! */  = lv.pk;
                if (true) ** GOTO lbl176
                block107: while (true) {
                    v36 /* !! */  = (long)(v37 - lv.ibzb("idnk", ibyy(int ), (int)233));
lbl176:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1837917193: {
                            v37 = lv.ibzb("idnl", ibyy(int ), (int)234);
                            continue block107;
                        }
                        case -450579769: {
                            break block107;
                        }
                        case 1409444401: {
                            v37 = lv.ibzb("idnm", ibyy(int ), (int)235);
                            continue block107;
                        }
                    }
                    break;
                }
                v38 = var1_1.m20();
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_12 = lv.pk - lv.ibzb("idnn", ibyy(int ), (int)236)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == lv.ibzb("idno", ibzg(int ), (int)666)) break;
                    v39 /* !! */  = (long)lv.ibzb("idnp", ibzg(int ), (int)667);
                }
                v40 = var0.putFloat(v38);
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_13 = lv.pk - lv.ibzb("idnq", ibyy(int ), (int)237)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == lv.ibzb("idnr", ibzg(int ), (int)668)) break;
                    v41 /* !! */  = (long)lv.ibzb("idns", ibzg(int ), (int)669);
                }
                v42 = var1_1.m21();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_14 = lv.pk - lv.ibzb("idnt", ibyy(int ), (int)238)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == lv.ibzb("idnu", ibzg(int ), (int)670)) break;
                    v43 /* !! */  = (long)lv.ibzb("idnv", ibzg(int ), (int)671);
                }
                v44 = v40.putFloat(v42);
                v45 /* !! */  = lv.pk;
                if (true) ** GOTO lbl208
                block111: while (true) {
                    v45 /* !! */  = (long)(lv.ibzb("idnx", ibyy(int ), (int)240) - lv.ibzb("idnw", ibyy(int ), (int)239));
lbl208:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -450579769: {
                            break block111;
                        }
                        case 1199261916: {
                            continue block111;
                        }
                    }
                    break;
                }
                v46 = var1_1.m22();
                v47 /* !! */  = lv.pk;
                if (true) ** GOTO lbl218
                block112: while (true) {
                    v47 /* !! */  = (long)(v48 - lv.ibzb("idny", ibyy(int ), (int)241));
lbl218:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -1249450686: {
                            v48 = lv.ibzb("idnz", ibyy(int ), (int)242);
                            continue block112;
                        }
                        case -853245531: {
                            v48 = lv.ibzb("idoa", ibyy(int ), (int)243);
                            continue block112;
                        }
                        case -450579769: {
                            break block112;
                        }
                        case 2079196442: {
                            v48 = lv.ibzb("idob", ibyy(int ), (int)244);
                            continue block112;
                        }
                    }
                    break;
                }
                v49 = v44.putFloat(v46);
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_15 = lv.pk - lv.ibzb("idoc", ibyy(int ), (int)245)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == lv.ibzb("idod", ibzg(int ), (int)672)) break;
                    v50 /* !! */  = (long)lv.ibzb("idoe", ibzg(int ), (int)673);
                }
                v51 = var1_1.m23();
                v52 /* !! */  = lv.pk;
                if (true) ** GOTO lbl241
                block114: while (true) {
                    v52 /* !! */  = (long)(v53 - lv.ibzb("idof", ibyy(int ), (int)246));
lbl241:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -450579769: {
                            break block114;
                        }
                        case -34206167: {
                            v53 = lv.ibzb("idog", ibyy(int ), (int)247);
                            continue block114;
                        }
                        case 297198934: {
                            v53 = lv.ibzb("idoh", ibyy(int ), (int)248);
                            continue block114;
                        }
                    }
                    break;
                }
                v49.putFloat(v51);
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_16 = lv.pk - lv.ibzb("idoi", ibyy(int ), (int)249)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == lv.ibzb("idoj", ibzg(int ), (int)674)) break;
                    v54 /* !! */  = (long)lv.ibzb("idok", ibzg(int ), (int)675);
                }
                v55 = var1_1.m30();
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_17 = lv.pk - lv.ibzb("idol", ibyy(int ), (int)250)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == lv.ibzb("idom", ibzg(int ), (int)676)) break;
                    v56 /* !! */  = (long)lv.ibzb("idon", ibzg(int ), (int)677);
                }
                v57 = var0.putFloat(v55);
                v58 /* !! */  = lv.pk;
                if (true) ** GOTO lbl269
                block117: while (true) {
                    v58 /* !! */  = (long)(v59 - lv.ibzb("idoo", ibyy(int ), (int)251));
lbl269:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1087582080: {
                            v59 = lv.ibzb("idop", ibyy(int ), (int)252);
                            continue block117;
                        }
                        case -450579769: {
                            break block117;
                        }
                        case 1380332765: {
                            v59 = lv.ibzb("idoq", ibyy(int ), (int)253);
                            continue block117;
                        }
                        case 1408809539: {
                            v59 = lv.ibzb("idor", ibyy(int ), (int)254);
                            continue block117;
                        }
                    }
                    break;
                }
                v60 = var1_1.m31();
                while (true) {
                    if ((v61 /* !! */  = (cfr_temp_18 = lv.pk - lv.ibzb("idos", ibyy(int ), (int)255)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v61 /* !! */  == lv.ibzb("idot", ibzg(int ), (int)678)) break;
                    v61 /* !! */  = (long)lv.ibzb("idou", ibzg(int ), (int)679);
                }
                v62 = v57.putFloat(v60);
                v63 /* !! */  = lv.pk;
                if (true) ** GOTO lbl292
                block119: while (true) {
                    v63 /* !! */  = (long)(lv.ibzb("idow", ibyy(int ), (int)257) - lv.ibzb("idov", ibyy(int ), (int)256));
lbl292:
                    // 2 sources

                    switch ((int)v63 /* !! */ ) {
                        case -450579769: {
                            break block119;
                        }
                        case -300296722: {
                            continue block119;
                        }
                    }
                    break;
                }
                v64 = var1_1.m32();
                v65 /* !! */  = lv.pk;
                if (true) ** GOTO lbl302
                block120: while (true) {
                    v65 /* !! */  = (long)(v66 - lv.ibzb("idox", ibyy(int ), (int)258));
lbl302:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -450579769: {
                            break block120;
                        }
                        case 1618409601: {
                            v66 = lv.ibzb("idoy", ibyy(int ), (int)259);
                            continue block120;
                        }
                        case 1786707904: {
                            v66 = lv.ibzb("idoz", ibyy(int ), (int)260);
                            continue block120;
                        }
                        case 1900875529: {
                            v66 = lv.ibzb("idpa", ibyy(int ), (int)261);
                            continue block120;
                        }
                    }
                    break;
                }
                v67 = v62.putFloat(v64);
                v68 /* !! */  = lv.pk;
                if (true) ** GOTO lbl319
                block121: while (true) {
                    v68 /* !! */  = (long)(lv.ibzb("idpc", ibyy(int ), (int)263) - lv.ibzb("idpb", ibyy(int ), (int)262));
lbl319:
                    // 2 sources

                    switch ((int)v68 /* !! */ ) {
                        case -1324965542: {
                            continue block121;
                        }
                        case -450579769: {
                            break block121;
                        }
                    }
                    break;
                }
                v69 = var1_1.m33();
                while (true) {
                    if ((v70 /* !! */  = (cfr_temp_19 = lv.pk - lv.ibzb("idpd", ibyy(int ), (int)264)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v70 /* !! */  == lv.ibzb("idpe", ibzg(int ), (int)680)) break;
                    v70 /* !! */  = (long)lv.ibzb("idpf", ibzg(int ), (int)681);
                }
                v67.putFloat(v69);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl333:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lv.ibzb("idpg", ibzg(int ), (int)682);
                if (!var4_2) break;
                throw null;
            }
lbl337:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)lv.ibzb("idph", ibzg(int ), (int)683);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl342:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)lv.ibzb("idpi", ibzg(int ), (int)684);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 3: {
                var3_3 /* !! */  = (int)lv.ibzb("idpj", ibzg(int ), (int)685);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 4: {
                var3_3 /* !! */  = (int)lv.ibzb("idpk", ibzg(int ), (int)686);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl357:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)lv.ibzb("idpl", ibzg(int ), (int)687);
                if (!var4_2) ** GOTO lbl342
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lv.ibzb("idpm", ibzg(int ), (int)688);
                if (!var4_2) ** GOTO lbl357
                throw null;
            }
lbl365:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)lv.ibzb("idpn", ibzg(int ), (int)689);
                if (!var4_2) ** GOTO lbl342
                throw null;
            }
lbl369:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)lv.ibzb("idpo", ibzg(int ), (int)690);
                if (!var4_2) ** GOTO lbl365
                throw null;
            }
lbl373:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lv.ibzb("idpp", ibzg(int ), (int)691);
                    if (!var4_2) ** GOTO lbl337
                    throw null;
                }
            }
            case 10: {
                var3_3 /* !! */  = (int)lv.ibzb("idpq", ibzg(int ), (int)692);
                if (!var4_2) ** GOTO lbl333
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)lv.ibzb("idpr", ibzg(int ), (int)693);
        ** while (!var4_2)
lbl385:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idub() {
        lv.ibza[0] = -8358690046949318943L;
        lv.ibza[1] = 4695676739753783996L;
        lv.ibza[2] = -1308391638521698951L;
        lv.ibza[3] = -812919808357307456L;
        lv.ibza[4] = 8448203627244112877L;
        lv.ibza[5] = -3371125534441615159L;
        lv.ibza[6] = 7250225966391469738L;
        lv.ibza[7] = 6325457539131547479L;
        lv.ibza[8] = -3454367624349028625L;
        lv.ibza[9] = -7925248706338860279L;
        lv.ibza[10] = 922167313412917276L;
        lv.ibza[11] = 141928289529460311L;
        lv.ibza[12] = 7189694643181859105L;
        lv.ibza[13] = 9057893794968987311L;
        lv.ibza[14] = 3890982931875075446L;
        lv.ibza[15] = -741241862135686907L;
        lv.ibza[16] = 7806938138097652389L;
        lv.ibza[17] = 5355711200495494597L;
        lv.ibza[18] = 868834606141269183L;
        lv.ibza[19] = 7021205945274362092L;
        lv.ibza[20] = 7417403841223687220L;
        lv.ibza[21] = 4161743227045855090L;
        lv.ibza[22] = 6738124713423970521L;
        lv.ibza[23] = -567787437374044139L;
        lv.ibza[24] = 7229756961345779049L;
        lv.ibza[25] = -2131617979786516461L;
        lv.ibza[26] = -2855870541773802889L;
        lv.ibza[27] = 3455855697094733338L;
        lv.ibza[28] = -6681798417313040662L;
        lv.ibza[29] = 8318695799566630261L;
        lv.ibza[30] = 2736697194914130939L;
        lv.ibza[31] = 8464148658032820349L;
        lv.ibza[32] = 9151693048021593659L;
        lv.ibza[33] = 3082562239932441405L;
        lv.ibza[34] = 8782600110938145498L;
        lv.ibza[35] = 5102282103137424473L;
        lv.ibza[36] = 4046160087142161701L;
        lv.ibza[37] = -2348773515145465813L;
        lv.ibza[38] = 5772717425110628910L;
        lv.ibza[39] = -3433254182329661067L;
        lv.ibza[40] = 9067438829692471455L;
        lv.ibza[41] = 3426505234806982241L;
        lv.ibza[42] = -8080842267633026692L;
        lv.ibza[43] = 47185804536295200L;
        lv.ibza[44] = -1964036040479733310L;
        lv.ibza[45] = -8297133323578037831L;
        lv.ibza[46] = -8797565368827625328L;
        lv.ibza[47] = -6942351689637862183L;
        lv.ibza[48] = 4367486565776395143L;
        lv.ibza[49] = 8915748356154601716L;
        lv.ibza[50] = -7757349713681644334L;
        lv.ibza[51] = 4184928271769922020L;
        lv.ibza[52] = -1306547817013540368L;
        lv.ibza[53] = 2310579179116830020L;
        lv.ibza[54] = 8014917317626408652L;
        lv.ibza[55] = 2309128070682276562L;
        lv.ibza[56] = -5416280805138683100L;
        lv.ibza[57] = 8320696157205660431L;
        lv.ibza[58] = 2145459519210597346L;
        lv.ibza[59] = 3397499286019389410L;
        lv.ibza[60] = -1938671835358620996L;
        lv.ibza[61] = 8060660918623358113L;
        lv.ibza[62] = -6383432136703512310L;
        lv.ibza[63] = 6792795600881613390L;
        lv.ibza[64] = -1246574736013073260L;
        lv.ibza[65] = 515696924258887598L;
        lv.ibza[66] = -8265201928170882963L;
        lv.ibza[67] = 7098364168446109254L;
        lv.ibza[68] = 5125522149052910504L;
        lv.ibza[69] = -7524169836600085942L;
        lv.ibza[70] = 5878242630848482714L;
        lv.ibza[71] = 4046560796730296448L;
        lv.ibza[72] = -6158277484923127305L;
        lv.ibza[73] = 1119726593549618569L;
        lv.ibza[74] = -329759811862893747L;
        lv.ibza[75] = -1918319813482252924L;
        lv.ibza[76] = 7906425954125522894L;
        lv.ibza[77] = -2987409054056727379L;
        lv.ibza[78] = 7577074139966812219L;
        lv.ibza[79] = -9114702203967601239L;
        lv.ibza[80] = 1221256930246146680L;
        lv.ibza[81] = -8449954142115201259L;
        lv.ibza[82] = -6558997254283905170L;
        lv.ibza[83] = 2299157619127928104L;
        lv.ibza[84] = -8140622531677983640L;
        lv.ibza[85] = -5624814249621500662L;
        lv.ibza[86] = 2388609112327932729L;
        lv.ibza[87] = 6698504868971785123L;
        lv.ibza[88] = -2373351244483214926L;
        lv.ibza[89] = 2061808388359128108L;
        lv.ibza[90] = 5734066528923209153L;
        lv.ibza[91] = -4626422456432681871L;
        lv.ibza[92] = 6294070503756342225L;
        lv.ibza[93] = -7340993578289974048L;
        lv.ibza[94] = 6227572858477248564L;
        lv.ibza[95] = 3940604527957228047L;
        lv.ibza[96] = 5034311951401505872L;
        lv.ibza[97] = -5361560828787808156L;
        lv.ibza[98] = -8276537085783991390L;
        lv.ibza[99] = -2000795432922574154L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("idps", ibyy(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lv.ibzb("idpt", ibzg(int ), (int)694)) break;
            v0 /* !! */  = (long)lv.ibzb("idpu", ibzg(int ), (int)695);
        }
        var2 = lv.c;
        v1 /* !! */  = lv.pk;
        if (true) ** GOTO lbl11
        block47: while (true) {
            v1 /* !! */  = (long)(lv.ibzb("idpw", ibyy(int ), (int)267) - lv.ibzb("idpv", ibyy(int ), (int)266));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -450579769: {
                    break block47;
                }
                case -9532395: {
                    continue block47;
                }
            }
            break;
        }
        var1_1 /* !! */  = lv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idpx", ibyy(int ), (int)268)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lv.ibzb("idpy", ibzg(int ), (int)696)) break;
            v2 /* !! */  = (long)lv.ibzb("idpz", ibzg(int ), (int)697);
        }
        var0_2 = lv.a;
        if (var2) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl25
        v3 /* !! */  = lv.pk;
        if (true) ** GOTO lbl32
        block50: while (true) {
            v3 /* !! */  = (long)(v4 - lv.ibzb("idqa", ibyy(int ), (int)269));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -450579769: {
                    break block50;
                }
                case -191054756: {
                    v4 = lv.ibzb("idqb", ibyy(int ), (int)270);
                    continue block50;
                }
                case 1867847721: {
                    v4 = lv.ibzb("idqc", ibyy(int ), (int)271);
                    continue block50;
                }
                case 1981582217: {
                    v4 = lv.ibzb("idqd", ibyy(int ), (int)272);
                    continue block50;
                }
            }
            break;
        }
        if (lv.uniformBuffer == null) ** GOTO lbl69
        if (var0_2 || var0_2) ** GOTO lbl25
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("idqe", ibyy(int ), (int)273)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == lv.ibzb("idqf", ibzg(int ), (int)698)) break;
            v5 /* !! */  = (long)lv.ibzb("idqg", ibzg(int ), (int)699);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = lv.pk - lv.ibzb("idqh", ibyy(int ), (int)274)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == lv.ibzb("idqi", ibzg(int ), (int)700)) break;
            v6 /* !! */  = (long)lv.ibzb("idqj", ibzg(int ), (int)701);
        }
        lv.uniformBuffer.close();
        if (var0_2) ** GOTO lbl25
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl25
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = lv.pk - lv.ibzb("idqk", ibyy(int ), (int)275)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lv.ibzb("idql", ibzg(int ), (int)702)) break;
                    v7 /* !! */  = (long)lv.ibzb("idqm", ibzg(int ), (int)703);
                }
                lv.uniformBuffer = null;
                if (var0_2) ** GOTO lbl25
lbl69:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl25
                v8 /* !! */  = lv.pk;
                if (true) ** GOTO lbl74
                block54: while (true) {
                    v8 /* !! */  = (long)(v9 - lv.ibzb("idqn", ibyy(int ), (int)276));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2117032412: {
                            v9 = lv.ibzb("idqo", ibyy(int ), (int)277);
                            continue block54;
                        }
                        case -702939875: {
                            v9 = lv.ibzb("idqp", ibyy(int ), (int)278);
                            continue block54;
                        }
                        case -450579769: {
                            break block54;
                        }
                        case 108429814: {
                            v9 = lv.ibzb("idqq", ibyy(int ), (int)279);
                            continue block54;
                        }
                    }
                    break;
                }
                if (lv.vertexBuffer == null) ** GOTO lbl122
                if (var0_2 || var0_2) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = lv.pk - lv.ibzb("idqr", ibyy(int ), (int)280)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == lv.ibzb("idqs", ibzg(int ), (int)704)) break;
                    v10 /* !! */  = (long)lv.ibzb("idqt", ibzg(int ), (int)705);
                }
                v11 /* !! */  = lv.pk;
                if (true) ** GOTO lbl97
                block56: while (true) {
                    v11 /* !! */  = (long)(lv.ibzb("idqv", ibyy(int ), (int)282) - lv.ibzb("idqu", ibyy(int ), (int)281));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1569510066: {
                            continue block56;
                        }
                        case -450579769: {
                            break block56;
                        }
                    }
                    break;
                }
                lv.vertexBuffer.close();
                if (var0_2 || var0_2) ** GOTO lbl25
                v12 /* !! */  = lv.pk;
                if (true) ** GOTO lbl108
                block57: while (true) {
                    v12 /* !! */  = (long)(v13 - lv.ibzb("idqw", ibyy(int ), (int)283));
lbl108:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2039483941: {
                            v13 = lv.ibzb("idqx", ibyy(int ), (int)284);
                            continue block57;
                        }
                        case -1805071048: {
                            v13 = lv.ibzb("idqy", ibyy(int ), (int)285);
                            continue block57;
                        }
                        case -561296148: {
                            v13 = lv.ibzb("idqz", ibyy(int ), (int)286);
                            continue block57;
                        }
                        case -450579769: {
                            break block57;
                        }
                    }
                    break;
                }
                lv.vertexBuffer = null;
                if (var0_2) ** GOTO lbl25
lbl122:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl125:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lv.ibzb("idra", ibzg(int ), (int)706);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 1: {
                var1_1 /* !! */  = (int)lv.ibzb("idrb", ibzg(int ), (int)707);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 2: {
                var1_1 /* !! */  = (int)lv.ibzb("idrc", ibzg(int ), (int)708);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var1_1 /* !! */  = (int)lv.ibzb("idrd", ibzg(int ), (int)709);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl145:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)lv.ibzb("idre", ibzg(int ), (int)710);
                if (!var2) break;
                throw null;
            }
lbl149:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)lv.ibzb("idrf", ibzg(int ), (int)711);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl154:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)lv.ibzb("idrg", ibzg(int ), (int)712);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 7: {
                var1_1 /* !! */  = (int)lv.ibzb("idrh", ibzg(int ), (int)713);
                if (!var2) ** GOTO lbl149
                throw null;
            }
lbl163:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)lv.ibzb("idri", ibzg(int ), (int)714);
                if (!var2) ** GOTO lbl154
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)lv.ibzb("idrj", ibzg(int ), (int)715);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl172:
            // 3 sources

            case 10: {
                var1_1 /* !! */  = (int)lv.ibzb("idrk", ibzg(int ), (int)716);
                if (!var2) ** GOTO lbl154
                throw null;
            }
lbl176:
            // 3 sources

            case 11: {
                var1_1 /* !! */  = (int)lv.ibzb("idrl", ibzg(int ), (int)717);
                if (!var2) ** GOTO lbl125
                throw null;
            }
lbl180:
            // 4 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lv.ibzb("idrm", ibzg(int ), (int)718);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 13: {
                var1_1 /* !! */  = (int)lv.ibzb("idrn", ibzg(int ), (int)719);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 14: {
                var1_1 /* !! */  = (int)lv.ibzb("idro", ibzg(int ), (int)720);
                if (!var2) ** GOTO lbl180
                throw null;
            }
            case 15: {
                var1_1 /* !! */  = (int)lv.ibzb("idrp", ibzg(int ), (int)721);
                if (!var2) ** GOTO lbl176
                throw null;
            }
lbl198:
            // 3 sources

            case 16: {
                var1_1 /* !! */  = (int)lv.ibzb("idrq", ibzg(int ), (int)722);
                if (!var2) ** GOTO lbl180
                throw null;
            }
            case 17: 
        }
        var1_1 /* !! */  = (int)lv.ibzb("idrr", ibzg(int ), (int)723);
        ** while (!var2)
lbl205:
        // 1 sources

        throw null;
    }

    public lv() {
    }

    private static /* synthetic */ void idts() {
        lv.ibzi[300] = -1104232527;
        lv.ibzi[301] = -955962581;
        lv.ibzi[302] = -1580484731;
        lv.ibzi[303] = -496321427;
        lv.ibzi[304] = 2062717886;
        lv.ibzi[305] = -1506332194;
        lv.ibzi[306] = -2094809716;
        lv.ibzi[307] = -1700646969;
        lv.ibzi[308] = 1532028474;
        lv.ibzi[309] = 1916129773;
        lv.ibzi[310] = 317382900;
        lv.ibzi[311] = 1822143118;
        lv.ibzi[312] = -123877597;
        lv.ibzi[313] = 798383448;
        lv.ibzi[314] = 190001805;
        lv.ibzi[315] = -1412731873;
        lv.ibzi[316] = -659702297;
        lv.ibzi[317] = 388245283;
        lv.ibzi[318] = -975043721;
        lv.ibzi[319] = -1871832808;
        lv.ibzi[320] = -239744267;
        lv.ibzi[321] = -904124580;
        lv.ibzi[322] = -1176481068;
        lv.ibzi[323] = 1239906551;
        lv.ibzi[324] = -1640927599;
        lv.ibzi[325] = -122660005;
        lv.ibzi[326] = 561504959;
        lv.ibzi[327] = 1441231360;
        lv.ibzi[328] = -467547929;
        lv.ibzi[329] = 1495950923;
        lv.ibzi[330] = -1051187077;
        lv.ibzi[331] = 962793316;
        lv.ibzi[332] = 1821779811;
        lv.ibzi[333] = -579258903;
        lv.ibzi[334] = -725775377;
        lv.ibzi[335] = -1717781089;
        lv.ibzi[336] = -157314241;
        lv.ibzi[337] = 1064152971;
        lv.ibzi[338] = 1047046738;
        lv.ibzi[339] = -783718111;
        lv.ibzi[340] = -1462356643;
        lv.ibzi[341] = 1839638884;
        lv.ibzi[342] = -1380282334;
        lv.ibzi[343] = 513172272;
        lv.ibzi[344] = -1347378346;
        lv.ibzi[345] = -865291258;
        lv.ibzi[346] = -251257254;
        lv.ibzi[347] = 883831052;
        lv.ibzi[348] = -1302697518;
        lv.ibzi[349] = 314734631;
        lv.ibzi[350] = 846597859;
        lv.ibzi[351] = -2070369965;
        lv.ibzi[352] = 79194137;
        lv.ibzi[353] = 1157016743;
        lv.ibzi[354] = 250235978;
        lv.ibzi[355] = -936049753;
        lv.ibzi[356] = 555667690;
        lv.ibzi[357] = -1487869743;
        lv.ibzi[358] = -47804238;
        lv.ibzi[359] = -187515251;
        lv.ibzi[360] = -131734389;
        lv.ibzi[361] = -1119693087;
        lv.ibzi[362] = 852983820;
        lv.ibzi[363] = -1814528104;
        lv.ibzi[364] = 1984411681;
        lv.ibzi[365] = -2011460923;
        lv.ibzi[366] = 1804775814;
        lv.ibzi[367] = -717860410;
        lv.ibzi[368] = 1052941889;
        lv.ibzi[369] = 1137901863;
        lv.ibzi[370] = -1354146751;
        lv.ibzi[371] = 1666377257;
        lv.ibzi[372] = -555678522;
        lv.ibzi[373] = 627051179;
        lv.ibzi[374] = 1760336710;
        lv.ibzi[375] = -654722359;
        lv.ibzi[376] = -1920934940;
        lv.ibzi[377] = -328521867;
        lv.ibzi[378] = -159548231;
        lv.ibzi[379] = -1580577848;
        lv.ibzi[380] = 633461373;
        lv.ibzi[381] = 106239725;
        lv.ibzi[382] = -122531761;
        lv.ibzi[383] = 1392947911;
        lv.ibzi[384] = 1113797555;
        lv.ibzi[385] = 581967814;
        lv.ibzi[386] = 1560144125;
        lv.ibzi[387] = 530733192;
        lv.ibzi[388] = -691105347;
        lv.ibzi[389] = 1303860283;
        lv.ibzi[390] = -1336097295;
        lv.ibzi[391] = -984113964;
        lv.ibzi[392] = 341273086;
        lv.ibzi[393] = 1279219355;
        lv.ibzi[394] = 924276421;
        lv.ibzi[395] = 731224223;
        lv.ibzi[396] = -485294509;
        lv.ibzi[397] = 844128776;
        lv.ibzi[398] = 2095566578;
        lv.ibzi[399] = 1183145577;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void end() {
        block163: {
            block162: {
                var9 = lv.c;
                var8_1 /* !! */  = lv.b;
                var7_2 = lv.a;
                if (var9) {
                    throw null;
lbl6:
                    // 43 sources

                    return;
                }
                if (var7_2 || var7_2) ** GOTO lbl6
                if (lv.pipeline == null) break block162;
                if (var7_2) ** GOTO lbl6
                if (lv.uniformBuffer == null) break block162;
                if (var7_2) ** GOTO lbl6
                if (lv.vertexBuffer != null) break block163;
                if (var7_2) ** GOTO lbl6
            }
            if (var7_2 || var7_2) ** GOTO lbl6
            return;
        }
        if (var7_2 || var7_2) ** GOTO lbl6
        if (lv.vertexCount != 0) ** GOTO lbl26
        if (var8_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_2 || var7_2) ** GOTO lbl6
                return;
            }
lbl26:
            // 1 sources

            if (var7_2 || var7_2) ** GOTO lbl6
            var0_3 = om.acquire((int)lv.ibzb("idhw", ibzg(int ), (int)553), (int)lv.ibzb("idhx", ibzg(int ), (int)554));
            if (var7_2 || var7_2) ** GOTO lbl6
            lv.putMatrix(var0_3, lv.combinedMatrix);
            if (var7_2 || var7_2) ** GOTO lbl6
            lv.putMatrix(var0_3, lv.identityMatrix);
            if (var7_2 || var7_2) ** GOTO lbl6
            var0_3.flip();
            if (var7_2 || var7_2) ** GOTO lbl6
            var1_4 = om.acquire((int)lv.ibzb("idhy", ibzg(int ), (int)555), lv.vertexCount * lv.ibzb("idhz", ibzg(int ), (int)556));
            if (var7_2 || var7_2) ** GOTO lbl6
            var2_5 = lv.ibzb("idia", ibzg(int ), (int)557);
            if (var7_2) ** GOTO lbl6
            do {
                if (var7_2 || var7_2) ** GOTO lbl6
                if (var2_5 >= lv.vertexCount) ** GOTO lbl56
                if (var7_2 || var7_2) ** GOTO lbl6
                var3_7 = var2_5 * lv.ibzb("idib", ibzg(int ), (int)558);
                if (var7_2 || var7_2) ** GOTO lbl6
                var1_4.putFloat(lv.vertices[var3_7]).putFloat(lv.vertices[var3_7 + true]).putFloat(lv.vertices[var3_7 + 2]);
                if (var7_2 || var7_2) ** GOTO lbl6
                var1_4.put((byte)(lv.vertices[var3_7 + 3] * lv.ibzb("idic", icjz(int ), (int)559))).put((byte)(lv.vertices[var3_7 + 4] * lv.ibzb("idid", icjz(int ), (int)560))).put((byte)(lv.vertices[var3_7 + 5] * lv.ibzb("idie", icjz(int ), (int)561))).put((byte)(lv.vertices[var3_7 + 6] * lv.ibzb("idif", icjz(int ), (int)562)));
                if (var7_2 || var7_2) ** GOTO lbl6
                ++var2_5;
                if (var7_2) ** GOTO lbl6
            } while (!var9);
            throw null;
lbl56:
            // 1 sources

            if (var7_2 || var7_2) ** GOTO lbl6
            var1_4.flip();
            if (var7_2 || var7_2) ** GOTO lbl6
            var2_6 = RenderSystem.getDevice().createCommandEncoder();
            if (var7_2 || var7_2) ** GOTO lbl6
            var2_6.writeToBuffer(lv.uniformBuffer.slice(), var0_3);
            if (var7_2 || var7_2) ** GOTO lbl6
            var2_6.writeToBuffer(lv.vertexBuffer.slice(), var1_4);
            if (var7_2 || var7_2) ** GOTO lbl6
            var3_8 = lv.mc.method_1522();
            if (var7_2 || var7_2) ** GOTO lbl6
            v0 = (Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$end$2(), ()Ljava/lang/String;)();
            v1 = var3_8.method_71639();
            v2 = OptionalInt.empty();
            v3 = var3_8.method_71640();
            if (lv.ignoreDepth) {
                v4 = OptionalDouble.of(1.0);
                if (var9) {
                    throw null;
                }
            } else {
                v4 = OptionalDouble.empty();
            }
            var4_9 = var2_6.createRenderPass(v0, v1, v2, v3, v4);
            if (var7_2) ** GOTO lbl6
            try {
                if (var7_2) ** GOTO lbl6
                var4_9.setPipeline(lv.pipeline);
                if (var7_2 || var7_2) ** GOTO lbl6
                var4_9.setUniform("Uniforms", lv.uniformBuffer);
                if (var7_2 || var7_2) ** GOTO lbl6
                var4_9.setVertexBuffer((int)lv.ibzb("idig", ibzg(int ), (int)563), lv.vertexBuffer);
                if (var7_2 || var7_2) ** GOTO lbl6
                var4_9.draw((int)lv.ibzb("idih", ibzg(int ), (int)564), lv.vertexCount);
                if (var7_2 || var7_2) ** GOTO lbl6
                if (var4_9 == null) ** GOTO lbl114
                if (var7_2) ** GOTO lbl6
            }
            catch (Throwable var5_10) {
                if (var7_2) ** GOTO lbl6
                if (var4_9 == null) ** GOTO lbl107
                if (var7_2) ** GOTO lbl6
                try {
                    if (var7_2) ** GOTO lbl6
                    var4_9.close();
                    if (var7_2 || var7_2) ** GOTO lbl6
                    ** if (!var9) goto lbl-1000
                }
                catch (Throwable var6_11) {
                    if (var7_2) ** GOTO lbl6
                    var5_10.addSuppressed(var6_11);
                    if (var7_2) ** GOTO lbl6
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
lbl107:
                // 3 sources

                if (var7_2 || var7_2) ** GOTO lbl6
                throw var5_10;
            }
            var4_9.close();
            if (var7_2) ** GOTO lbl6
            if (var9) {
                throw null;
            }
lbl114:
            // 3 sources

            if (var7_2 || var7_2) ** GOTO lbl6
            lv.vertexCount = (int)lv.ibzb("idii", ibzg(int ), (int)565);
            if (!var7_2 && !var7_2) ** break;
            ** continue;
            return;
lbl119:
            // 2 sources

            case 0: {
                var8_1 /* !! */  = (int)lv.ibzb("idij", ibzg(int ), (int)566);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 1: {
                var8_1 /* !! */  = (int)lv.ibzb("idik", ibzg(int ), (int)567);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl129:
            // 2 sources

            case 2: {
                var8_1 /* !! */  = (int)lv.ibzb("idil", ibzg(int ), (int)568);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 3: {
                do {
                    var8_1 /* !! */  = (int)lv.ibzb("idim", ibzg(int ), (int)569);
                } while (!var9);
                throw null;
            }
lbl139:
            // 2 sources

            case 4: {
                var8_1 /* !! */  = (int)lv.ibzb("idin", ibzg(int ), (int)570);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl144:
            // 2 sources

            case 5: {
                var8_1 /* !! */  = (int)lv.ibzb("idio", ibzg(int ), (int)571);
                if (var9) {
                    throw null;
                }
            }
            case 6: {
                var8_1 /* !! */  = (int)lv.ibzb("idip", ibzg(int ), (int)572);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl153:
            // 3 sources

            case 7: {
                var8_1 /* !! */  = (int)lv.ibzb("idiq", ibzg(int ), (int)573);
                if (!var9) ** GOTO lbl129
                throw null;
            }
            case 8: {
                var8_1 /* !! */  = (int)lv.ibzb("idir", ibzg(int ), (int)574);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl413
            }
            case 9: {
                var8_1 /* !! */  = (int)lv.ibzb("idis", ibzg(int ), (int)575);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl167:
            // 2 sources

            case 10: {
                var8_1 /* !! */  = (int)lv.ibzb("idit", ibzg(int ), (int)576);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl172:
            // 2 sources

            case 11: {
                var8_1 /* !! */  = (int)lv.ibzb("idiu", ibzg(int ), (int)577);
                if (var9) {
                    throw null;
                }
            }
lbl176:
            // 5 sources

            case 12: {
                var8_1 /* !! */  = (int)lv.ibzb("idiv", ibzg(int ), (int)578);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl181:
            // 2 sources

            case 13: {
                var8_1 /* !! */  = (int)lv.ibzb("idiw", ibzg(int ), (int)579);
                if (!var9) ** GOTO lbl153
                throw null;
            }
lbl185:
            // 3 sources

            case 14: {
                var8_1 /* !! */  = (int)lv.ibzb("idix", ibzg(int ), (int)580);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 15: {
                var8_1 /* !! */  = (int)lv.ibzb("idiy", ibzg(int ), (int)581);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl195:
            // 3 sources

            case 16: {
                var8_1 /* !! */  = (int)lv.ibzb("idiz", ibzg(int ), (int)582);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl200:
            // 2 sources

            case 17: {
                var8_1 /* !! */  = (int)lv.ibzb("idja", ibzg(int ), (int)583);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl205:
            // 2 sources

            case 18: {
                var8_1 /* !! */  = (int)lv.ibzb("idjb", ibzg(int ), (int)584);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 19: {
                var8_1 /* !! */  = (int)lv.ibzb("idjc", ibzg(int ), (int)585);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl215:
            // 2 sources

            case 20: {
                var8_1 /* !! */  = (int)lv.ibzb("idjd", ibzg(int ), (int)586);
                if (!var9) ** GOTO lbl176
                throw null;
            }
lbl219:
            // 2 sources

            case 21: {
                var8_1 /* !! */  = (int)lv.ibzb("idje", ibzg(int ), (int)587);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl224:
            // 2 sources

            case 22: {
                var8_1 /* !! */  = (int)lv.ibzb("idjf", ibzg(int ), (int)588);
                if (!var9) ** GOTO lbl205
                throw null;
            }
            case 23: {
                var8_1 /* !! */  = (int)lv.ibzb("idjg", ibzg(int ), (int)589);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl233:
            // 2 sources

            case 24: {
                do {
                    var8_1 /* !! */  = (int)lv.ibzb("idjh", ibzg(int ), (int)590);
                } while (!var9);
                throw null;
            }
lbl238:
            // 3 sources

            case 25: {
                var8_1 /* !! */  = (int)lv.ibzb("idji", ibzg(int ), (int)591);
                if (!var9) ** GOTO lbl139
                throw null;
            }
            case 26: {
                var8_1 /* !! */  = (int)lv.ibzb("idjj", ibzg(int ), (int)592);
                if (!var9) ** GOTO lbl119
                throw null;
            }
lbl246:
            // 2 sources

            case 27: {
                var8_1 /* !! */  = (int)lv.ibzb("idjk", ibzg(int ), (int)593);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl404
            }
            case 28: {
                var8_1 /* !! */  = (int)lv.ibzb("idjl", ibzg(int ), (int)594);
                if (!var9) ** GOTO lbl219
                throw null;
            }
            case 29: {
                var8_1 /* !! */  = (int)lv.ibzb("idjm", ibzg(int ), (int)595);
                if (!var9) ** GOTO lbl185
                throw null;
            }
lbl259:
            // 3 sources

            case 30: {
                var8_1 /* !! */  = (int)lv.ibzb("idjn", ibzg(int ), (int)596);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 31: {
                var8_1 /* !! */  = (int)lv.ibzb("idjo", ibzg(int ), (int)597);
                if (var9) {
                    throw null;
                }
            }
lbl268:
            // 4 sources

            case 32: {
                var8_1 /* !! */  = (int)lv.ibzb("idjp", ibzg(int ), (int)598);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 33: {
                var8_1 /* !! */  = (int)lv.ibzb("idjq", ibzg(int ), (int)599);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl278:
            // 2 sources

            case 34: {
                var8_1 /* !! */  = (int)lv.ibzb("idjr", ibzg(int ), (int)600);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 35: {
                var8_1 /* !! */  = (int)lv.ibzb("idjs", ibzg(int ), (int)601);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 36: {
                var8_1 /* !! */  = (int)lv.ibzb("idjt", ibzg(int ), (int)602);
                if (!var9) ** GOTO lbl246
                throw null;
            }
            case 37: {
                var8_1 /* !! */  = (int)lv.ibzb("idju", ibzg(int ), (int)603);
                if (!var9) ** GOTO lbl144
                throw null;
            }
lbl296:
            // 2 sources

            case 38: {
                var8_1 /* !! */  = (int)lv.ibzb("idjv", ibzg(int ), (int)604);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 39: {
                var8_1 /* !! */  = (int)lv.ibzb("idjw", ibzg(int ), (int)605);
                if (!var9) ** GOTO lbl268
                throw null;
            }
lbl305:
            // 2 sources

            case 40: {
                var8_1 /* !! */  = (int)lv.ibzb("idjx", ibzg(int ), (int)606);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl438
            }
lbl310:
            // 2 sources

            case 41: {
                var8_1 /* !! */  = (int)lv.ibzb("idjy", ibzg(int ), (int)607);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl315:
            // 5 sources

            case 42: {
                var8_1 /* !! */  = (int)lv.ibzb("idjz", ibzg(int ), (int)608);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl320:
            // 3 sources

            case 43: {
                var8_1 /* !! */  = (int)lv.ibzb("idka", ibzg(int ), (int)609);
                if (!var9) ** GOTO lbl215
                throw null;
            }
            case 44: {
                var8_1 /* !! */  = (int)lv.ibzb("idkb", ibzg(int ), (int)610);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl329:
            // 3 sources

            case 45: {
                var8_1 /* !! */  = (int)lv.ibzb("idkc", ibzg(int ), (int)611);
                if (!var9) ** GOTO lbl176
                throw null;
            }
lbl333:
            // 3 sources

            case 46: {
                var8_1 /* !! */  = (int)lv.ibzb("idkd", ibzg(int ), (int)612);
                if (!var9) ** GOTO lbl153
                throw null;
            }
            case 47: {
                do {
                    var8_1 /* !! */  = (int)lv.ibzb("idke", ibzg(int ), (int)613);
                } while (!var9);
                throw null;
            }
            case 48: {
                var8_1 /* !! */  = (int)lv.ibzb("idkf", ibzg(int ), (int)614);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl347:
            // 2 sources

            case 49: {
                var8_1 /* !! */  = (int)lv.ibzb("idkg", ibzg(int ), (int)615);
                if (!var9) ** GOTO lbl238
                throw null;
            }
            case 50: {
                var8_1 /* !! */  = (int)lv.ibzb("idkh", ibzg(int ), (int)616);
                if (!var9) ** GOTO lbl278
                throw null;
            }
lbl355:
            // 4 sources

            case 51: {
                var8_1 /* !! */  = (int)lv.ibzb("idki", ibzg(int ), (int)617);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl360:
            // 2 sources

            case 52: {
                do {
                    var8_1 /* !! */  = (int)lv.ibzb("idkj", ibzg(int ), (int)618);
                } while (!var9);
                throw null;
            }
lbl365:
            // 2 sources

            case 53: {
                var8_1 /* !! */  = (int)lv.ibzb("idkk", ibzg(int ), (int)619);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl425
            }
lbl370:
            // 2 sources

            case 54: {
                var8_1 /* !! */  = (int)lv.ibzb("idkl", ibzg(int ), (int)620);
                if (!var9) ** GOTO lbl315
                throw null;
            }
lbl374:
            // 2 sources

            case 55: {
                var8_1 /* !! */  = (int)lv.ibzb("idkm", ibzg(int ), (int)621);
                if (!var9) ** GOTO lbl195
                throw null;
            }
lbl378:
            // 3 sources

            case 56: {
                var8_1 /* !! */  = (int)lv.ibzb("idkn", ibzg(int ), (int)622);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl383:
            // 2 sources

            case 57: {
                var8_1 /* !! */  = (int)lv.ibzb("idko", ibzg(int ), (int)623);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl434
            }
            case 58: {
                var8_1 /* !! */  = (int)lv.ibzb("idkp", ibzg(int ), (int)624);
                if (!var9) ** GOTO lbl233
                throw null;
            }
            case 59: {
                var8_1 /* !! */  = (int)lv.ibzb("idkq", ibzg(int ), (int)625);
                if (!var9) ** GOTO lbl181
                throw null;
            }
            case 60: {
                var8_1 /* !! */  = (int)lv.ibzb("idkr", ibzg(int ), (int)626);
                if (!var9) ** GOTO lbl378
                throw null;
            }
lbl400:
            // 3 sources

            case 61: {
                var8_1 /* !! */  = (int)lv.ibzb("idks", ibzg(int ), (int)627);
                if (!var9) ** GOTO lbl374
                throw null;
            }
lbl404:
            // 2 sources

            case 62: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_1 /* !! */  = (int)lv.ibzb("idkt", ibzg(int ), (int)628);
                    if (!var9) ** GOTO lbl355
                    throw null;
                }
            }
            case 63: {
                var8_1 /* !! */  = (int)lv.ibzb("idku", ibzg(int ), (int)629);
                if (!var9) ** GOTO lbl200
                throw null;
            }
lbl413:
            // 2 sources

            case 64: {
                var8_1 /* !! */  = (int)lv.ibzb("idkv", ibzg(int ), (int)630);
                if (!var9) ** GOTO lbl320
                throw null;
            }
lbl417:
            // 2 sources

            case 65: {
                var8_1 /* !! */  = (int)lv.ibzb("idkw", ibzg(int ), (int)631);
                if (!var9) ** GOTO lbl224
                throw null;
            }
lbl421:
            // 2 sources

            case 66: {
                var8_1 /* !! */  = (int)lv.ibzb("idkx", ibzg(int ), (int)632);
                if (!var9) ** GOTO lbl185
                throw null;
            }
lbl425:
            // 3 sources

            case 67: {
                var8_1 /* !! */  = (int)lv.ibzb("idky", ibzg(int ), (int)633);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl430:
            // 2 sources

            case 68: {
                var8_1 /* !! */  = (int)lv.ibzb("idkz", ibzg(int ), (int)634);
                if (!var9) ** GOTO lbl172
                throw null;
            }
lbl434:
            // 3 sources

            case 69: {
                var8_1 /* !! */  = (int)lv.ibzb("idla", ibzg(int ), (int)635);
                if (!var9) ** GOTO lbl315
                throw null;
            }
lbl438:
            // 2 sources

            case 70: {
                var8_1 /* !! */  = (int)lv.ibzb("idlb", ibzg(int ), (int)636);
                if (var9) {
                    throw null;
                }
            }
            case 71: {
                var8_1 /* !! */  = (int)lv.ibzb("idlc", ibzg(int ), (int)637);
                if (!var9) ** GOTO lbl329
                throw null;
            }
lbl446:
            // 2 sources

            case 72: {
                var8_1 /* !! */  = (int)lv.ibzb("idld", ibzg(int ), (int)638);
                if (!var9) ** GOTO lbl421
                throw null;
            }
lbl450:
            // 3 sources

            case 73: {
                var8_1 /* !! */  = (int)lv.ibzb("idle", ibzg(int ), (int)639);
                if (!var9) ** GOTO lbl383
                throw null;
            }
            case 74: {
                var8_1 /* !! */  = (int)lv.ibzb("idlf", ibzg(int ), (int)640);
                if (!var9) ** GOTO lbl167
                throw null;
            }
            case 75: 
        }
        var8_1 /* !! */  = (int)lv.ibzb("idlg", ibzg(int ), (int)641);
        ** while (!var9)
lbl461:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idty() {
        lv.ibyz[100] = -6697231628121670870L;
        lv.ibyz[101] = -9199847485969527352L;
        lv.ibyz[102] = 6392976218777688973L;
        lv.ibyz[103] = 1934605005227251276L;
        lv.ibyz[104] = 1636855137422853160L;
        lv.ibyz[105] = -5564370375500584382L;
        lv.ibyz[106] = -1112895596031498743L;
        lv.ibyz[107] = -8052052825932615319L;
        lv.ibyz[108] = -3427949256864308834L;
        lv.ibyz[109] = 243320324115226592L;
        lv.ibyz[110] = -8647690649157386787L;
        lv.ibyz[111] = 1834080923469690898L;
        lv.ibyz[112] = -6698908334938951905L;
        lv.ibyz[113] = -2368267007310027088L;
        lv.ibyz[114] = -5579976554246869196L;
        lv.ibyz[115] = 6665899169607220193L;
        lv.ibyz[116] = -5030016291044183142L;
        lv.ibyz[117] = 771947328734191572L;
        lv.ibyz[118] = 4144195551846575511L;
        lv.ibyz[119] = -6077804291536514679L;
        lv.ibyz[120] = 298285979615812952L;
        lv.ibyz[121] = -3977482787853012589L;
        lv.ibyz[122] = -7107458694636893775L;
        lv.ibyz[123] = -5413906099189462205L;
        lv.ibyz[124] = 6820334609133191749L;
        lv.ibyz[125] = 1565450727265787174L;
        lv.ibyz[126] = -3302871166611588239L;
        lv.ibyz[127] = -6226820023243228965L;
        lv.ibyz[128] = -2992730540275374450L;
        lv.ibyz[129] = 8562407489431652175L;
        lv.ibyz[130] = -58207410425404772L;
        lv.ibyz[131] = -2278705758283878533L;
        lv.ibyz[132] = -5278454003954570880L;
        lv.ibyz[133] = -9220332986615365735L;
        lv.ibyz[134] = -635881641404943564L;
        lv.ibyz[135] = -9155752055887725863L;
        lv.ibyz[136] = 6062784922432154390L;
        lv.ibyz[137] = -6314213529888934478L;
        lv.ibyz[138] = -934163944404971757L;
        lv.ibyz[139] = 8924273164573648354L;
        lv.ibyz[140] = -7308439772410845709L;
        lv.ibyz[141] = 8223185131469582564L;
        lv.ibyz[142] = 2559805366295853863L;
        lv.ibyz[143] = -2428988434121121169L;
        lv.ibyz[144] = 5202040195275204041L;
        lv.ibyz[145] = -279252908540292239L;
        lv.ibyz[146] = 8526327519811559545L;
        lv.ibyz[147] = -4302098460134179282L;
        lv.ibyz[148] = -2245937711188396827L;
        lv.ibyz[149] = -1976739919524219785L;
        lv.ibyz[150] = -3334229379106432496L;
        lv.ibyz[151] = 8098413047171465353L;
        lv.ibyz[152] = -577613832026977092L;
        lv.ibyz[153] = -7069633799742888750L;
        lv.ibyz[154] = 3568686287472502384L;
        lv.ibyz[155] = 6746679005798819424L;
        lv.ibyz[156] = -3780089681249085319L;
        lv.ibyz[157] = -4891294704540375665L;
        lv.ibyz[158] = 6275349784344975254L;
        lv.ibyz[159] = -8725232394864379832L;
        lv.ibyz[160] = -888971621695232098L;
        lv.ibyz[161] = 3085782806880520030L;
        lv.ibyz[162] = -9104804770055786819L;
        lv.ibyz[163] = 2585174042174249436L;
        lv.ibyz[164] = 6697949082743609290L;
        lv.ibyz[165] = -5874941064253736405L;
        lv.ibyz[166] = -8880224531575434126L;
        lv.ibyz[167] = -2713877545297570409L;
        lv.ibyz[168] = 4431129620899550221L;
        lv.ibyz[169] = 6617344885784480066L;
        lv.ibyz[170] = 1954859131073204514L;
        lv.ibyz[171] = 2859802383625088138L;
        lv.ibyz[172] = 465165885513423727L;
        lv.ibyz[173] = 918009837482507628L;
        lv.ibyz[174] = -2453681274446686823L;
        lv.ibyz[175] = 2610633817022436465L;
        lv.ibyz[176] = -2459227629793751393L;
        lv.ibyz[177] = 6972025256400120978L;
        lv.ibyz[178] = 4847897536680762351L;
        lv.ibyz[179] = -3652414586687547079L;
        lv.ibyz[180] = -3806954709146603095L;
        lv.ibyz[181] = -5650992606784673541L;
        lv.ibyz[182] = -8333379394387826477L;
        lv.ibyz[183] = -7617391984904874152L;
        lv.ibyz[184] = 7915848511901732821L;
        lv.ibyz[185] = 468386896767712456L;
        lv.ibyz[186] = -2086254500597187250L;
        lv.ibyz[187] = -5993469738122678494L;
        lv.ibyz[188] = -2551050152480219115L;
        lv.ibyz[189] = -9134635551142156487L;
        lv.ibyz[190] = 2565894426468439349L;
        lv.ibyz[191] = 5839318285788983054L;
        lv.ibyz[192] = -1973647704956525504L;
        lv.ibyz[193] = -4097149297124721664L;
        lv.ibyz[194] = 4990376620526587535L;
        lv.ibyz[195] = -569940590195074337L;
        lv.ibyz[196] = 1449295966055495354L;
        lv.ibyz[197] = 6694118364280013879L;
        lv.ibyz[198] = 1503631483276790932L;
        lv.ibyz[199] = 6644585306060658514L;
    }

    private static /* synthetic */ void idti() {
        lv.ibzh[100] = 742912048;
        lv.ibzh[101] = 1469110753;
        lv.ibzh[102] = -1726102799;
        lv.ibzh[103] = 30883164;
        lv.ibzh[104] = -1892138395;
        lv.ibzh[105] = 308903462;
        lv.ibzh[106] = -2045301437;
        lv.ibzh[107] = -594155872;
        lv.ibzh[108] = 1620704152;
        lv.ibzh[109] = -1561341273;
        lv.ibzh[110] = -1371441704;
        lv.ibzh[111] = -880214834;
        lv.ibzh[112] = -1540498798;
        lv.ibzh[113] = -1659411337;
        lv.ibzh[114] = -2146907246;
        lv.ibzh[115] = 1012827673;
        lv.ibzh[116] = 765750019;
        lv.ibzh[117] = 512132532;
        lv.ibzh[118] = 1085185379;
        lv.ibzh[119] = 1774180880;
        lv.ibzh[120] = 343459060;
        lv.ibzh[121] = 1171965313;
        lv.ibzh[122] = 1945304424;
        lv.ibzh[123] = 1119555245;
        lv.ibzh[124] = 537457810;
        lv.ibzh[125] = -1400288296;
        lv.ibzh[126] = -595518868;
        lv.ibzh[127] = -1368194166;
        lv.ibzh[128] = 2144017507;
        lv.ibzh[129] = -842434088;
        lv.ibzh[130] = -430753711;
        lv.ibzh[131] = -1980054226;
        lv.ibzh[132] = 1407269326;
        lv.ibzh[133] = 1504952272;
        lv.ibzh[134] = -1239612576;
        lv.ibzh[135] = -1623804599;
        lv.ibzh[136] = -1273659822;
        lv.ibzh[137] = -1826077409;
        lv.ibzh[138] = 1926502545;
        lv.ibzh[139] = -115554880;
        lv.ibzh[140] = -363796808;
        lv.ibzh[141] = -1718406315;
        lv.ibzh[142] = 2062369310;
        lv.ibzh[143] = 1441876265;
        lv.ibzh[144] = -1526948580;
        lv.ibzh[145] = 1191725368;
        lv.ibzh[146] = -216563117;
        lv.ibzh[147] = 481426712;
        lv.ibzh[148] = 1190106489;
        lv.ibzh[149] = 412430859;
        lv.ibzh[150] = 1922801807;
        lv.ibzh[151] = -2076679229;
        lv.ibzh[152] = -1289666875;
        lv.ibzh[153] = -338171699;
        lv.ibzh[154] = 1048809184;
        lv.ibzh[155] = 2011907229;
        lv.ibzh[156] = -991186562;
        lv.ibzh[157] = -782311233;
        lv.ibzh[158] = -1457801899;
        lv.ibzh[159] = -1144601970;
        lv.ibzh[160] = -177279363;
        lv.ibzh[161] = 1630803702;
        lv.ibzh[162] = 682610100;
        lv.ibzh[163] = 1236704077;
        lv.ibzh[164] = 1377043671;
        lv.ibzh[165] = -2055194973;
        lv.ibzh[166] = -1247394699;
        lv.ibzh[167] = 983335615;
        lv.ibzh[168] = 732573479;
        lv.ibzh[169] = -1438425550;
        lv.ibzh[170] = 1468029061;
        lv.ibzh[171] = -765806919;
        lv.ibzh[172] = -1100136617;
        lv.ibzh[173] = -185250923;
        lv.ibzh[174] = 522741872;
        lv.ibzh[175] = 1806774928;
        lv.ibzh[176] = -2035684678;
        lv.ibzh[177] = -608768320;
        lv.ibzh[178] = 282272494;
        lv.ibzh[179] = 1557209730;
        lv.ibzh[180] = -847131578;
        lv.ibzh[181] = -1243895673;
        lv.ibzh[182] = 1207340775;
        lv.ibzh[183] = 631275282;
        lv.ibzh[184] = -1693634578;
        lv.ibzh[185] = -1087325545;
        lv.ibzh[186] = -795533813;
        lv.ibzh[187] = 870445539;
        lv.ibzh[188] = -2006582893;
        lv.ibzh[189] = 1489873679;
        lv.ibzh[190] = 1783251134;
        lv.ibzh[191] = -703370811;
        lv.ibzh[192] = -1190641463;
        lv.ibzh[193] = -308240168;
        lv.ibzh[194] = 1047079533;
        lv.ibzh[195] = -971505768;
        lv.ibzh[196] = 1957326287;
        lv.ibzh[197] = -493487236;
        lv.ibzh[198] = 173391428;
        lv.ibzh[199] = 1570181751;
    }

    private static /* synthetic */ void idtm() {
        lv.ibzh[500] = 43802585;
        lv.ibzh[501] = -1690904729;
        lv.ibzh[502] = 246149931;
        lv.ibzh[503] = -745562577;
        lv.ibzh[504] = 1113123542;
        lv.ibzh[505] = -2140688823;
        lv.ibzh[506] = -1742750034;
        lv.ibzh[507] = 198904637;
        lv.ibzh[508] = 1102746743;
        lv.ibzh[509] = -1920292885;
        lv.ibzh[510] = -941431992;
        lv.ibzh[511] = -2129106117;
        lv.ibzh[512] = -1152446089;
        lv.ibzh[513] = 120218243;
        lv.ibzh[514] = 691665280;
        lv.ibzh[515] = 197278853;
        lv.ibzh[516] = 1641732977;
        lv.ibzh[517] = -495100217;
        lv.ibzh[518] = -1566634470;
        lv.ibzh[519] = -1567417887;
        lv.ibzh[520] = -385706792;
        lv.ibzh[521] = 732489651;
        lv.ibzh[522] = 948920489;
        lv.ibzh[523] = 946338364;
        lv.ibzh[524] = -1786963556;
        lv.ibzh[525] = 2097132598;
        lv.ibzh[526] = -1612389527;
        lv.ibzh[527] = 903555817;
        lv.ibzh[528] = -394180996;
        lv.ibzh[529] = 335546858;
        lv.ibzh[530] = -1809939609;
        lv.ibzh[531] = 52060039;
        lv.ibzh[532] = -1886793234;
        lv.ibzh[533] = -1729146327;
        lv.ibzh[534] = -2054637902;
        lv.ibzh[535] = -1938124716;
        lv.ibzh[536] = -1628068272;
        lv.ibzh[537] = 1136133943;
        lv.ibzh[538] = -670445197;
        lv.ibzh[539] = 1550697902;
        lv.ibzh[540] = 1999851767;
        lv.ibzh[541] = -1306146912;
        lv.ibzh[542] = -211114288;
        lv.ibzh[543] = -364692193;
        lv.ibzh[544] = 1052907837;
        lv.ibzh[545] = 1188651362;
        lv.ibzh[546] = -583952293;
        lv.ibzh[547] = -480104823;
        lv.ibzh[548] = -93939019;
        lv.ibzh[549] = 942086115;
        lv.ibzh[550] = -703512102;
        lv.ibzh[551] = 359123453;
        lv.ibzh[552] = 1272248808;
        lv.ibzh[553] = 1717291987;
        lv.ibzh[554] = -2001267134;
        lv.ibzh[555] = 824493722;
        lv.ibzh[556] = 301167537;
        lv.ibzh[557] = -229108183;
        lv.ibzh[558] = 1367370377;
        lv.ibzh[559] = 2092177946;
        lv.ibzh[560] = -1066971714;
        lv.ibzh[561] = 2128027688;
        lv.ibzh[562] = 1626203655;
        lv.ibzh[563] = 1822800460;
        lv.ibzh[564] = -479157684;
        lv.ibzh[565] = -1041074275;
        lv.ibzh[566] = 2087847279;
        lv.ibzh[567] = 525882632;
        lv.ibzh[568] = 797475696;
        lv.ibzh[569] = -1748409536;
        lv.ibzh[570] = 1052682483;
        lv.ibzh[571] = -158850482;
        lv.ibzh[572] = 1948831034;
        lv.ibzh[573] = -73499615;
        lv.ibzh[574] = -169919755;
        lv.ibzh[575] = -314755861;
        lv.ibzh[576] = -80726373;
        lv.ibzh[577] = -447705682;
        lv.ibzh[578] = -1119742764;
        lv.ibzh[579] = 1079897088;
        lv.ibzh[580] = -783123462;
        lv.ibzh[581] = 1204290331;
        lv.ibzh[582] = -1831658126;
        lv.ibzh[583] = 1805413918;
        lv.ibzh[584] = -66998920;
        lv.ibzh[585] = -1164548558;
        lv.ibzh[586] = 140038552;
        lv.ibzh[587] = -666351061;
        lv.ibzh[588] = -562888931;
        lv.ibzh[589] = -607015125;
        lv.ibzh[590] = 1375481732;
        lv.ibzh[591] = 183806285;
        lv.ibzh[592] = 972138514;
        lv.ibzh[593] = 1554804888;
        lv.ibzh[594] = -1937625629;
        lv.ibzh[595] = 1359328348;
        lv.ibzh[596] = 768059067;
        lv.ibzh[597] = 1675107421;
        lv.ibzh[598] = -1426799958;
        lv.ibzh[599] = 457050873;
    }

    private static /* synthetic */ void idtz() {
        lv.ibyz[200] = 1899124136627171376L;
        lv.ibyz[201] = 3562879291355510779L;
        lv.ibyz[202] = -4544820089522304633L;
        lv.ibyz[203] = 1464063553819922384L;
        lv.ibyz[204] = -2467612241829518804L;
        lv.ibyz[205] = 4259435449544354871L;
        lv.ibyz[206] = 6385598004439602649L;
        lv.ibyz[207] = -7118671572254667179L;
        lv.ibyz[208] = -9100534027650673249L;
        lv.ibyz[209] = -5088406730367508144L;
        lv.ibyz[210] = -5432380872814030066L;
        lv.ibyz[211] = 1044252827644624013L;
        lv.ibyz[212] = -4885703949122616028L;
        lv.ibyz[213] = 6506614985813296611L;
        lv.ibyz[214] = 854677145454262390L;
        lv.ibyz[215] = -3611843613000539317L;
        lv.ibyz[216] = 51085276520506281L;
        lv.ibyz[217] = -6877209246054609328L;
        lv.ibyz[218] = 8771660769580298339L;
        lv.ibyz[219] = -4836265968811663596L;
        lv.ibyz[220] = -4381404054882817004L;
        lv.ibyz[221] = -8073322173901736307L;
        lv.ibyz[222] = 3903081093096603585L;
        lv.ibyz[223] = -4750813135024871293L;
        lv.ibyz[224] = -3929441346368086423L;
        lv.ibyz[225] = 3400842941386318479L;
        lv.ibyz[226] = 8480283079293495363L;
        lv.ibyz[227] = -2704566541228030987L;
        lv.ibyz[228] = -2472123139835927102L;
        lv.ibyz[229] = 8759296489582637392L;
        lv.ibyz[230] = 7594726301007563331L;
        lv.ibyz[231] = -9011040255370812183L;
        lv.ibyz[232] = -7124382481554450038L;
        lv.ibyz[233] = -5690133265078413563L;
        lv.ibyz[234] = -487420504305827208L;
        lv.ibyz[235] = 2823115814687137545L;
        lv.ibyz[236] = -7451463440147004371L;
        lv.ibyz[237] = -8454798918677185110L;
        lv.ibyz[238] = -360068874701859852L;
        lv.ibyz[239] = 2782774531738630472L;
        lv.ibyz[240] = -3092093751203340105L;
        lv.ibyz[241] = 3610531377998125350L;
        lv.ibyz[242] = -958695406840121138L;
        lv.ibyz[243] = 3570687170358250310L;
        lv.ibyz[244] = -6064206424076092928L;
        lv.ibyz[245] = 5182349165040422148L;
        lv.ibyz[246] = 1132514813239208014L;
        lv.ibyz[247] = -3260403614046255489L;
        lv.ibyz[248] = -8299153888996492784L;
        lv.ibyz[249] = 6010331254477127260L;
        lv.ibyz[250] = -5702354671628055891L;
        lv.ibyz[251] = 1280568929930913060L;
        lv.ibyz[252] = 2828373406465996633L;
        lv.ibyz[253] = -7136371695492620886L;
        lv.ibyz[254] = 2046677885209978915L;
        lv.ibyz[255] = 3871184294774032977L;
        lv.ibyz[256] = 8494801527596418299L;
        lv.ibyz[257] = -2718633099087887960L;
        lv.ibyz[258] = -6070574967786589762L;
        lv.ibyz[259] = 4963283766602403344L;
        lv.ibyz[260] = -804259636014713995L;
        lv.ibyz[261] = 7121820217541631435L;
        lv.ibyz[262] = 3872848458920567609L;
        lv.ibyz[263] = -4587933728770269392L;
        lv.ibyz[264] = -783316533023333830L;
        lv.ibyz[265] = -6666488537122098774L;
        lv.ibyz[266] = 5492751082929977547L;
        lv.ibyz[267] = -5546046552583889445L;
        lv.ibyz[268] = -3263231314220147893L;
        lv.ibyz[269] = 6864647310416624677L;
        lv.ibyz[270] = 5948045218527167974L;
        lv.ibyz[271] = 2593454012276694791L;
        lv.ibyz[272] = 8437840361643795778L;
        lv.ibyz[273] = -1097020890297349173L;
        lv.ibyz[274] = -4475281206411022394L;
        lv.ibyz[275] = -4596409998878195258L;
        lv.ibyz[276] = 5989003049359652426L;
        lv.ibyz[277] = -3093699711224394003L;
        lv.ibyz[278] = -1127377905524311765L;
        lv.ibyz[279] = 1031303592414588672L;
        lv.ibyz[280] = -367891730788986721L;
        lv.ibyz[281] = 8459719413589585766L;
        lv.ibyz[282] = 2331441371820699575L;
        lv.ibyz[283] = -3178199997175553132L;
        lv.ibyz[284] = -920746156618767602L;
        lv.ibyz[285] = 9169878711636580175L;
        lv.ibyz[286] = 3556319298835861551L;
        lv.ibyz[287] = -2406131461175409163L;
        lv.ibyz[288] = 3537288661590020023L;
        lv.ibyz[289] = 1134896035522271039L;
        lv.ibyz[290] = 8064466546785096990L;
        lv.ibyz[291] = -6165359815088083677L;
        lv.ibyz[292] = -6378357001719788261L;
        lv.ibyz[293] = -824210607106739995L;
        lv.ibyz[294] = -8526277294389311411L;
        lv.ibyz[295] = -3352843804163975769L;
        lv.ibyz[296] = -5317145804345452796L;
        lv.ibyz[297] = -7901060887880745153L;
        lv.ibyz[298] = 3140242337823368602L;
        lv.ibyz[299] = 4346417474825039723L;
    }

    static {
        ibzh = new int[749];
        ibzi = new int[749];
        lv.idth();
        lv.idti();
        lv.idtj();
        lv.idtk();
        lv.idtl();
        lv.idtm();
        lv.idtn();
        lv.idto();
        lv.idtp();
        lv.idtq();
        lv.idtr();
        lv.idts();
        lv.idtt();
        lv.idtu();
        lv.idtv();
        lv.idtw();
        ibyz = new long[303];
        ibza = new long[303];
        lv.idtx();
        lv.idty();
        lv.idtz();
        lv.idua();
        lv.idub();
        lv.iduc();
        lv.idud();
        lv.idue();
        mc = class_310.method_1551();
        vertices = new float[57344];
        combinedMatrix = new Matrix4f();
        identityMatrix = new Matrix4f();
        BOX_CORNERS = new float[8][3];
        DIAMOND_CORNERS = new float[6][3];
        BOX_EDGES = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
        DIAMOND_EDGES = new int[][]{{0, 2}, {0, 3}, {0, 4}, {0, 5}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {2, 4}, {2, 5}, {3, 4}, {3, 5}};
        projectionMatrix = new Matrix4f();
        viewMatrix = new Matrix4f();
        ignoreDepth = lv.ibzb("idtg", ibzg(int ), (int)748);
    }

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$end$2() {
        boolean bl2;
        Object object = pk;
        block16: while (true) {
            switch ((int)object) {
                case -450579769: {
                    break block16;
                }
                case 1860544442: {
                    object = lv.ibzb("idrt", ibyy(int ), (int)288) - lv.ibzb("idrs", ibyy(int ), (int)287);
                    continue block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = pk;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - lv.ibzb("idru", ibyy(int ), (int)289);
            }
            switch ((int)object2) {
                case -2017381594: {
                    callSite = lv.ibzb("idrv", ibyy(int ), (int)290);
                    continue block17;
                }
                case -450579769: {
                    break block17;
                }
                case -266017987: {
                    callSite = lv.ibzb("idrw", ibyy(int ), (int)291);
                    continue block17;
                }
                case 89109272: {
                    callSite = lv.ibzb("idrx", ibyy(int ), (int)292);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = pk - lv.ibzb("idry", ibyy(int ), (int)293)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == lv.ibzb("idrz", ibzg(int ), (int)724)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = lv.ibzb("idsa", ibzg(int ), (int)725);
        }
        if (bl2 || bl2) {
            return null;
        }
        boolean bl5 = true;
        block19: do {
            int n3;
            if (bl5 && !(bl5 = false)) {
                if (n2 == 0) return "Line3D";
                n3 = Integer.MIN_VALUE;
            }
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return "Line3D";
                }
                case 0: {
                    CallSite callSite = lv.ibzb("idsb", ibzg(int ), (int)726);
                    n3 = 2;
                    if (!bl3) continue block19;
                    throw null;
                }
                case 1: {
                    CallSite callSite = lv.ibzb("idsc", ibzg(int ), (int)727);
                    if (bl3) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        CallSite callSite = lv.ibzb("idsd", ibzg(int ), (int)728);
                    } while (!bl3);
                    throw null;
                }
                case 3: 
            }
            break;
        } while (true);
        do {
            CallSite callSite = lv.ibzb("idse", ibzg(int ), (int)729);
        } while (!bl3);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$init$1() {
        CallSite callSite;
        boolean bl2;
        Object object = pk;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite2;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite2 - lv.ibzb("idsf", ibyy(int ), (int)294);
            }
            switch ((int)object) {
                case -1916604290: {
                    callSite2 = lv.ibzb("idsg", ibyy(int ), (int)295);
                    continue block12;
                }
                case -1824259426: {
                    callSite2 = lv.ibzb("idsh", ibyy(int ), (int)296);
                    continue block12;
                }
                case -450579769: {
                    break block12;
                }
                case 114596588: {
                    callSite2 = lv.ibzb("idsi", ibyy(int ), (int)297);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = pk - lv.ibzb("idsj", ibyy(int ), (int)298)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == lv.ibzb("idsk", ibzg(int ), (int)730)) break;
            object2 = lv.ibzb("idsl", ibzg(int ), (int)731);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = pk - lv.ibzb("idsm", ibyy(int ), (int)299)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == lv.ibzb("idsn", ibzg(int ), (int)732)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = lv.ibzb("idso", ibzg(int ), (int)733);
        }
        if (!bl2 && !bl2) {
            return "Line3D Vertices";
        }
        boolean bl5 = true;
        block15: do {
            int n3;
            if (bl5 && !(bl5 = false)) {
                if (n2 == 0) return null;
                n3 = Integer.MIN_VALUE;
            }
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return null;
                }
                case 0: {
                    CallSite callSite3 = lv.ibzb("idsp", ibzg(int ), (int)734);
                    n3 = 2;
                    if (!bl4) continue block15;
                    throw null;
                }
                case 1: {
                    CallSite callSite4 = lv.ibzb("idsq", ibzg(int ), (int)735);
                    if (bl4) {
                        throw null;
                    }
                }
                case 2: {
                    break;
                }
                case 3: {
                    callSite = lv.ibzb("idss", ibzg(int ), (int)737);
                    if (!bl4) break block15;
                    throw null;
                }
            }
            break;
        } while (true);
        do {
            callSite = lv.ibzb("idsr", ibzg(int ), (int)736);
            if (bl4) {
                throw null;
            }
            callSite = lv.ibzb("idss", ibzg(int ), (int)737);
        } while (!bl4);
        throw null;
    }

    public static /* synthetic */ CallSite ibzb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Exception decompiling
     */
    public static void init() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 58[SWITCH]
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

    private static /* synthetic */ void idud() {
        lv.ibza[200] = 2987859501684671310L;
        lv.ibza[201] = -822806796164612980L;
        lv.ibza[202] = 4989721207483605293L;
        lv.ibza[203] = -2078043318144914740L;
        lv.ibza[204] = 6877767556875915741L;
        lv.ibza[205] = 9174987738827860080L;
        lv.ibza[206] = -1839876972542678957L;
        lv.ibza[207] = 2212819767051907399L;
        lv.ibza[208] = 4949988949580759536L;
        lv.ibza[209] = 8210622110728299504L;
        lv.ibza[210] = -8156458128299323099L;
        lv.ibza[211] = -7834663993128476691L;
        lv.ibza[212] = -4702010269977241443L;
        lv.ibza[213] = -1010422968651127448L;
        lv.ibza[214] = 2423247389644391584L;
        lv.ibza[215] = -5698818111695328392L;
        lv.ibza[216] = -5706026551597041465L;
        lv.ibza[217] = -8735244895133244812L;
        lv.ibza[218] = 2312430330264573242L;
        lv.ibza[219] = 8724836424965655761L;
        lv.ibza[220] = 47656236993060244L;
        lv.ibza[221] = 6908047710700612592L;
        lv.ibza[222] = -3635816065729579933L;
        lv.ibza[223] = -6399137397394214710L;
        lv.ibza[224] = -8973372003514892958L;
        lv.ibza[225] = -7115083386214528393L;
        lv.ibza[226] = 3205676681560169267L;
        lv.ibza[227] = -4041962588085743893L;
        lv.ibza[228] = -5654646546534230223L;
        lv.ibza[229] = -4736983745316924174L;
        lv.ibza[230] = 6147663836906261372L;
        lv.ibza[231] = 3158143231478477777L;
        lv.ibza[232] = -7106033918530158762L;
        lv.ibza[233] = 1223832167151672761L;
        lv.ibza[234] = 2838600816747244136L;
        lv.ibza[235] = -8932665485602774364L;
        lv.ibza[236] = -6017852918833562703L;
        lv.ibza[237] = 5647704129788026949L;
        lv.ibza[238] = 549051013431409096L;
        lv.ibza[239] = 3184269345480689079L;
        lv.ibza[240] = -2999139821930899491L;
        lv.ibza[241] = -5706014483204908848L;
        lv.ibza[242] = 4247263562048486531L;
        lv.ibza[243] = 3515911231599963313L;
        lv.ibza[244] = -8321806620092769631L;
        lv.ibza[245] = 2761476839704273855L;
        lv.ibza[246] = 268883049244747593L;
        lv.ibza[247] = -5436876880531099388L;
        lv.ibza[248] = 7793215952007611372L;
        lv.ibza[249] = -1544294618138311525L;
        lv.ibza[250] = -40117714141598053L;
        lv.ibza[251] = -873655129414438730L;
        lv.ibza[252] = -836398622306880675L;
        lv.ibza[253] = 124168850325558978L;
        lv.ibza[254] = -7052456386642033580L;
        lv.ibza[255] = 2914217010768907455L;
        lv.ibza[256] = -2993517478486585064L;
        lv.ibza[257] = -450916386984424523L;
        lv.ibza[258] = 1692532302159529769L;
        lv.ibza[259] = 5200074834374598773L;
        lv.ibza[260] = 8874956638570049025L;
        lv.ibza[261] = 4653892157190477723L;
        lv.ibza[262] = 2376562017787232104L;
        lv.ibza[263] = 353524784642339929L;
        lv.ibza[264] = -3141915822224655581L;
        lv.ibza[265] = -4687618912592872957L;
        lv.ibza[266] = 4661395838327192436L;
        lv.ibza[267] = 1017354990206481141L;
        lv.ibza[268] = 3406729860592832996L;
        lv.ibza[269] = 1685245455461166956L;
        lv.ibza[270] = -8593893343787238737L;
        lv.ibza[271] = -9144339751106642109L;
        lv.ibza[272] = -8787993912017983979L;
        lv.ibza[273] = -5464936644020686017L;
        lv.ibza[274] = -4440852206763645542L;
        lv.ibza[275] = -7562441901160934663L;
        lv.ibza[276] = 2284771460238389418L;
        lv.ibza[277] = -6799261465569572136L;
        lv.ibza[278] = 3111128286577107757L;
        lv.ibza[279] = -6042494524385370159L;
        lv.ibza[280] = 499428789089868021L;
        lv.ibza[281] = 8029118660340616559L;
        lv.ibza[282] = 497784238469174595L;
        lv.ibza[283] = 3252320505420314691L;
        lv.ibza[284] = 7542189965090632669L;
        lv.ibza[285] = -2450767413433766695L;
        lv.ibza[286] = 7325023789766427212L;
        lv.ibza[287] = -7453875428739857739L;
        lv.ibza[288] = 3769080424560956985L;
        lv.ibza[289] = 7244158586978845212L;
        lv.ibza[290] = 8696908369801471851L;
        lv.ibza[291] = 6726621876316145842L;
        lv.ibza[292] = -1159270586898866932L;
        lv.ibza[293] = -2235765234822515872L;
        lv.ibza[294] = -3225619700377185379L;
        lv.ibza[295] = -1815172177129502643L;
        lv.ibza[296] = -7306657263969047771L;
        lv.ibza[297] = -6375086387972014075L;
        lv.ibza[298] = 7296018148689592507L;
        lv.ibza[299] = -2897117819636964473L;
    }

    private static /* synthetic */ void idua() {
        lv.ibyz[300] = 4073636939700995397L;
        lv.ibyz[301] = 6665661878226256139L;
        lv.ibyz[302] = 108482837145174021L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void addVertex(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block104: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idcc", ibyy(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == lv.ibzb("idcd", ibzg(int ), (int)496)) break;
                v0 /* !! */  = (long)lv.ibzb("idce", ibzg(int ), (int)497);
            }
            var10_7 = lv.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("idcg", ibyy(int ), (int)173)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == lv.ibzb("idch", ibzg(int ), (int)498)) break;
                v1 /* !! */  = (long)lv.ibzb("idci", ibzg(int ), (int)499);
            }
            var9_8 /* !! */  = lv.b;
            v2 /* !! */  = lv.pk;
            block54: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -586931619: {
                        v2 /* !! */  = (long)(lv.ibzb("idcm", ibyy(int ), (int)175) - lv.ibzb("idck", ibyy(int ), (int)174));
                        continue block54;
                    }
                    case -450579769: {
                        break block54;
                    }
                }
                break;
            }
            var8_9 = lv.a;
            if (var10_7) {
                throw null;
            }
            if (var8_9 || var8_9) return;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = lv.pk - lv.ibzb("idco", ibyy(int ), (int)176)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == lv.ibzb("idcq", ibzg(int ), (int)500)) {
                    if (lv.vertexCount >= lv.ibzb("idcs", ibzg(int ), (int)502)) {
                        break;
                    }
                    break block104;
                }
                v3 /* !! */  = (long)lv.ibzb("idcr", ibzg(int ), (int)501);
            }
            if (var8_9) return;
            return;
        }
        if (var8_9 || var8_9) return;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = lv.pk - lv.ibzb("idcu", ibyy(int ), (int)177)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == lv.ibzb("idcw", ibzg(int ), (int)503)) break;
            v4 /* !! */  = (long)lv.ibzb("idcy", ibzg(int ), (int)504);
        }
        v5 = lv.vertexCount;
        v6 = v5 + lv.ibzb("idcz", ibzg(int ), (int)505);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = lv.pk - lv.ibzb("idda", ibyy(int ), (int)178)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == lv.ibzb("iddc", ibzg(int ), (int)506)) {
                lv.vertexCount = v6;
                var7_10 = v5 * lv.ibzb("iddf", ibzg(int ), (int)508);
                if (var8_9) return;
                break;
            }
            v7 /* !! */  = (long)lv.ibzb("idde", ibzg(int ), (int)507);
        }
        if (var8_9) return;
        while (true) {
            block105: {
                if ((v8 /* !! */  = (cfr_temp_6 = lv.pk - lv.ibzb("iddg", ibyy(int ), (int)179)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  != lv.ibzb("iddi", ibzg(int ), (int)509)) break block105;
                lv.vertices[var7_10] = var0;
                if (var9_8 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v8 /* !! */  = (long)lv.ibzb("iddl", ibzg(int ), (int)510);
        }
        cfr_temp_0 = -2147483648;
        block59: while (true) {
            block106: {
                switch (cfr_temp_0 == -2147483648 ? var9_8 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var8_9 || var8_9) return;
                        v9 /* !! */  = lv.pk;
                        block60: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -450579769: {
                                    break block60;
                                }
                                case 413759294: {
                                    v9 /* !! */  = (long)(lv.ibzb("iddr", ibyy(int ), (int)181) - lv.ibzb("iddo", ibyy(int ), (int)180));
                                    continue block60;
                                }
                            }
                            break;
                        }
                        lv.vertices[var7_10 + 1] = var1_1;
                        if (var8_9 || var8_9) return;
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_7 = lv.pk - lv.ibzb("iddv", ibyy(int ), (int)182)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v10 /* !! */  == lv.ibzb("iddw", ibzg(int ), (int)511)) {
                                lv.vertices[var7_10 + 2] = var2_2;
                                if (var8_9) return;
                                break;
                            }
                            v10 /* !! */  = (long)lv.ibzb("iddy", ibzg(int ), (int)512);
                        }
                        if (var8_9) return;
                        v11 /* !! */  = lv.pk;
                        block62: while (true) {
                            switch ((int)v11 /* !! */ ) {
                                case -450579769: {
                                    break block62;
                                }
                                case 593670557: {
                                    v12 = lv.ibzb("idec", ibyy(int ), (int)184);
                                    ** GOTO lbl101
                                }
                                case 983199985: {
                                    v12 = lv.ibzb("ided", ibyy(int ), (int)185);
                                    ** GOTO lbl101
                                }
                                case 1132198595: {
                                    v12 = lv.ibzb("idef", ibyy(int ), (int)186);
lbl101:
                                    // 3 sources

                                    v11 /* !! */  = (long)(v12 - lv.ibzb("idea", ibyy(int ), (int)183));
                                    continue block62;
                                }
                            }
                            break;
                        }
                        lv.vertices[var7_10 + 3] = var3_3;
                        if (var8_9 || var8_9) return;
                        v13 /* !! */  = lv.pk;
                        block63: while (true) {
                            switch ((int)v13 /* !! */ ) {
                                case -611847911: {
                                    v14 = lv.ibzb("idej", ibyy(int ), (int)188);
                                    ** GOTO lbl118
                                }
                                case -450579769: {
                                    break block63;
                                }
                                case 313706926: {
                                    v14 = lv.ibzb("idel", ibyy(int ), (int)189);
                                    ** GOTO lbl118
                                }
                                case 1865618700: {
                                    v14 = lv.ibzb("idem", ibyy(int ), (int)190);
lbl118:
                                    // 3 sources

                                    v13 /* !! */  = (long)(v14 - lv.ibzb("ideh", ibyy(int ), (int)187));
                                    continue block63;
                                }
                            }
                            break;
                        }
                        lv.vertices[var7_10 + 4] = var4_4;
                        if (var8_9 || var8_9) return;
                        v15 /* !! */  = lv.pk;
                        block64: while (true) {
                            switch ((int)v15 /* !! */ ) {
                                case -1839663277: {
                                    v16 = lv.ibzb("ideu", ibyy(int ), (int)192);
                                    ** GOTO lbl135
                                }
                                case -450579769: {
                                    break block64;
                                }
                                case 1443289593: {
                                    v16 = lv.ibzb("idew", ibyy(int ), (int)193);
                                    ** GOTO lbl135
                                }
                                case 1622756818: {
                                    v16 = lv.ibzb("idey", ibyy(int ), (int)194);
lbl135:
                                    // 3 sources

                                    v15 /* !! */  = (long)(v16 - lv.ibzb("idep", ibyy(int ), (int)191));
                                    continue block64;
                                }
                            }
                            break;
                        }
                        lv.vertices[var7_10 + 5] = var5_5;
                        if (var8_9 || var8_9) return;
                        while (true) {
                            if ((v17 /* !! */  = (cfr_temp_8 = lv.pk - lv.ibzb("idfb", ibyy(int ), (int)195)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v17 /* !! */  == lv.ibzb("idfe", ibzg(int ), (int)513)) {
                                lv.vertices[var7_10 + 6] = var6_6;
                                if (var8_9) return;
                                break;
                            }
                            v17 /* !! */  = (long)lv.ibzb("idfg", ibzg(int ), (int)514);
                        }
                        if (!var8_9) return;
                        return;
                    }
                    case 1: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfo", ibzg(int ), (int)516);
                        cfr_temp_0 = 3;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 2: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfr", ibzg(int ), (int)517);
                        cfr_temp_0 = 21;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 3: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfu", ibzg(int ), (int)518);
                        cfr_temp_0 = 12;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 5: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfx", ibzg(int ), (int)520);
                        cfr_temp_0 = 13;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 9: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgd", ibzg(int ), (int)524);
                        cfr_temp_0 = 22;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 10: {
                        ** GOTO lbl241
                    }
                    case 17: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgr", ibzg(int ), (int)532);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 13: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgk", ibzg(int ), (int)528);
                        cfr_temp_0 = 16;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 18: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgt", ibzg(int ), (int)533);
                        cfr_temp_0 = 4;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 19: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgu", ibzg(int ), (int)534);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 6: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfy", ibzg(int ), (int)521);
                        cfr_temp_0 = 22;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 20: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgw", ibzg(int ), (int)535);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 16: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgp", ibzg(int ), (int)531);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 14: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgm", ibzg(int ), (int)529);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 7: {
                        var9_8 /* !! */  = (int)lv.ibzb("idga", ibzg(int ), (int)522);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 0: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfl", ibzg(int ), (int)515);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 8: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgc", ibzg(int ), (int)523);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 21: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgy", ibzg(int ), (int)536);
                        cfr_temp_0 = 22;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 23: {
                        var9_8 /* !! */  = (int)lv.ibzb("idhb", ibzg(int ), (int)538);
                        if (var10_7) {
                            throw null;
                        }
lbl241:
                        // 3 sources

                        var9_8 /* !! */  = (int)lv.ibzb("idgf", ibzg(int ), (int)525);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 11: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgh", ibzg(int ), (int)526);
                        cfr_temp_0 = 15;
                        if (var10_7) {
                            throw null;
                        }
                        break block106;
                    }
                    case 4: {
                        var9_8 /* !! */  = (int)lv.ibzb("idfv", ibzg(int ), (int)519);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 22: {
                        var9_8 /* !! */  = (int)lv.ibzb("idha", ibzg(int ), (int)537);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 12: {
                        var9_8 /* !! */  = (int)lv.ibzb("idgj", ibzg(int ), (int)527);
                        if (var10_7) {
                            throw null;
                        }
                    }
                    case 15: 
                }
                ** GOTO lbl267
            }
            do {
                if (true) continue block59;
lbl267:
                // 2 sources

                var9_8 /* !! */  = (int)lv.ibzb("idgo", ibzg(int ), (int)530);
                cfr_temp_0 = 4;
            } while (!var10_7);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void diamond(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5) {
        var25_6 = lv.c;
        var24_7 /* !! */  = lv.b;
        var23_8 = lv.a;
        if (var25_6) {
            throw null;
lbl6:
            // 28 sources

            return;
        }
        if (var23_8 || var23_8) ** GOTO lbl6
        var9_9 = lv.getCameraPos();
        if (var23_8 || var23_8) ** GOTO lbl6
        var10_10 = (float)(var0 - var9_9.field_1352);
        if (var23_8 || var23_8) ** GOTO lbl6
        var11_11 = (float)(var2_1 - var9_9.field_1351);
        if (var23_8) ** GOTO lbl6
        if (var24_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var24_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var23_8) ** GOTO lbl6
                var12_12 = (float)(var4_2 - var9_9.field_1350);
                if (var23_8 || var23_8) ** GOTO lbl6
                var13_13 = var6_3 / 2.0f;
                if (var23_8 || var23_8) ** GOTO lbl6
                var14_14 = (float)(var7_4 >> lv.ibzb("icrh", ibzg(int ), (int)307) & lv.ibzb("icri", ibzg(int ), (int)308)) / lv.ibzb("icrj", icjz(int ), (int)309);
                if (var23_8 || var23_8) ** GOTO lbl6
                var15_15 = (float)(var7_4 >> lv.ibzb("icrk", ibzg(int ), (int)310) & lv.ibzb("icrl", ibzg(int ), (int)311)) / lv.ibzb("icrm", icjz(int ), (int)312);
                if (var23_8 || var23_8) ** GOTO lbl6
                var16_16 = (float)(var7_4 & lv.ibzb("icrn", ibzg(int ), (int)313)) / lv.ibzb("icro", icjz(int ), (int)314);
                if (var23_8 || var23_8) ** GOTO lbl6
                v0 = new float[3];
                v0[0] = var10_10;
                v0[lv.ibzb("icrp", ibzg(int ), (int)315)] = var11_11 + var13_13;
                v0[2] = var12_12;
                var17_17 = v0;
                if (var23_8 || var23_8) ** GOTO lbl6
                v1 = new float[3];
                v1[0] = var10_10;
                v1[lv.ibzb("icrq", ibzg(int ), (int)316)] = var11_11 - var13_13;
                v1[2] = var12_12;
                var18_18 = v1;
                if (var23_8 || var23_8) ** GOTO lbl6
                v2 = new float[3];
                v2[0] = var10_10;
                v2[1] = var11_11;
                v2[lv.ibzb("icrr", ibzg(int ), (int)317)] = var12_12 + var13_13;
                var19_19 = v2;
                if (var23_8 || var23_8) ** GOTO lbl6
                v3 = new float[3];
                v3[0] = var10_10;
                v3[1] = var11_11;
                v3[lv.ibzb("icrs", ibzg(int ), (int)318)] = var12_12 - var13_13;
                var20_20 = v3;
                if (var23_8 || var23_8) ** GOTO lbl6
                v4 = new float[3];
                v4[lv.ibzb("icrt", ibzg(int ), (int)319)] = var10_10 - var13_13;
                v4[1] = var11_11;
                v4[2] = var12_12;
                var21_21 = v4;
                if (var23_8 || var23_8) ** GOTO lbl6
                v5 = new float[3];
                v5[lv.ibzb("icru", ibzg(int ), (int)320)] = var10_10 + var13_13;
                v5[1] = var11_11;
                v5[2] = var12_12;
                var22_22 = v5;
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var17_17[0], var17_17[1], var17_17[2], var19_19[0], var19_19[1], var19_19[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var17_17[0], var17_17[1], var17_17[2], var20_20[0], var20_20[1], var20_20[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var17_17[0], var17_17[1], var17_17[2], var21_21[0], var21_21[1], var21_21[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var17_17[0], var17_17[1], var17_17[2], var22_22[0], var22_22[1], var22_22[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var18_18[0], var18_18[1], var18_18[2], var19_19[0], var19_19[1], var19_19[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var18_18[0], var18_18[1], var18_18[2], var20_20[0], var20_20[1], var20_20[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var18_18[0], var18_18[1], var18_18[2], var21_21[0], var21_21[1], var21_21[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var18_18[0], var18_18[1], var18_18[2], var22_22[0], var22_22[1], var22_22[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var19_19[0], var19_19[1], var19_19[2], var21_21[0], var21_21[1], var21_21[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var19_19[0], var19_19[1], var19_19[2], var22_22[0], var22_22[1], var22_22[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var20_20[0], var20_20[1], var20_20[2], var21_21[0], var21_21[1], var21_21[2], var14_14, var15_15, var16_16, var8_5);
                if (var23_8 || var23_8) ** GOTO lbl6
                lv.addLine(var20_20[0], var20_20[1], var20_20[2], var22_22[0], var22_22[1], var22_22[2], var14_14, var15_15, var16_16, var8_5);
                if (!var23_8 && !var23_8) ** break;
                ** continue;
                return;
            }
lbl91:
            // 3 sources

            case 0: {
                var24_7 /* !! */  = (int)lv.ibzb("icrv", ibzg(int ), (int)321);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl96:
            // 3 sources

            case 1: {
                var24_7 /* !! */  = (int)lv.ibzb("icrw", ibzg(int ), (int)322);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 2: {
                var24_7 /* !! */  = (int)lv.ibzb("icrx", ibzg(int ), (int)323);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl106:
            // 2 sources

            case 3: {
                var24_7 /* !! */  = (int)lv.ibzb("icry", ibzg(int ), (int)324);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl111:
            // 2 sources

            case 4: {
                var24_7 /* !! */  = (int)lv.ibzb("icrz", ibzg(int ), (int)325);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var24_7 /* !! */  = (int)lv.ibzb("icsa", ibzg(int ), (int)326);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 6: {
                var24_7 /* !! */  = (int)lv.ibzb("icsb", ibzg(int ), (int)327);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl126:
            // 2 sources

            case 7: {
                var24_7 /* !! */  = (int)lv.ibzb("icsc", ibzg(int ), (int)328);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 8: {
                var24_7 /* !! */  = (int)lv.ibzb("icsd", ibzg(int ), (int)329);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 9: {
                do {
                    var24_7 /* !! */  = (int)lv.ibzb("icse", ibzg(int ), (int)330);
                } while (!var25_6);
                throw null;
            }
            case 10: {
                var24_7 /* !! */  = (int)lv.ibzb("icsf", ibzg(int ), (int)331);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl146:
            // 2 sources

            case 11: {
                var24_7 /* !! */  = (int)lv.ibzb("icsg", ibzg(int ), (int)332);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 12: {
                var24_7 /* !! */  = (int)lv.ibzb("icsh", ibzg(int ), (int)333);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl156:
            // 2 sources

            case 13: {
                var24_7 /* !! */  = (int)lv.ibzb("icsi", ibzg(int ), (int)334);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl161:
            // 4 sources

            case 14: {
                var24_7 /* !! */  = (int)lv.ibzb("icsj", ibzg(int ), (int)335);
                if (!var25_6) ** GOTO lbl106
                throw null;
            }
lbl165:
            // 3 sources

            case 15: {
                var24_7 /* !! */  = (int)lv.ibzb("icsk", ibzg(int ), (int)336);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl170:
            // 2 sources

            case 16: {
                var24_7 /* !! */  = (int)lv.ibzb("icsl", ibzg(int ), (int)337);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 17: {
                var24_7 /* !! */  = (int)lv.ibzb("icsm", ibzg(int ), (int)338);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl180:
            // 3 sources

            case 18: {
                var24_7 /* !! */  = (int)lv.ibzb("icsn", ibzg(int ), (int)339);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 19: {
                var24_7 /* !! */  = (int)lv.ibzb("icso", ibzg(int ), (int)340);
                if (!var25_6) ** GOTO lbl156
                throw null;
            }
            case 20: {
                var24_7 /* !! */  = (int)lv.ibzb("icsp", ibzg(int ), (int)341);
                if (!var25_6) ** GOTO lbl111
                throw null;
            }
lbl193:
            // 3 sources

            case 21: {
                var24_7 /* !! */  = (int)lv.ibzb("icsq", ibzg(int ), (int)342);
                if (!var25_6) ** GOTO lbl165
                throw null;
            }
lbl197:
            // 2 sources

            case 22: {
                var24_7 /* !! */  = (int)lv.ibzb("icsr", ibzg(int ), (int)343);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 23: {
                var24_7 /* !! */  = (int)lv.ibzb("icss", ibzg(int ), (int)344);
                if (!var25_6) ** GOTO lbl96
                throw null;
            }
            case 24: {
                var24_7 /* !! */  = (int)lv.ibzb("icst", ibzg(int ), (int)345);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl211:
            // 5 sources

            case 25: {
                var24_7 /* !! */  = (int)lv.ibzb("icsu", ibzg(int ), (int)346);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl216:
            // 3 sources

            case 26: {
                var24_7 /* !! */  = (int)lv.ibzb("icsv", ibzg(int ), (int)347);
                if (!var25_6) ** GOTO lbl211
                throw null;
            }
lbl220:
            // 2 sources

            case 27: {
                var24_7 /* !! */  = (int)lv.ibzb("icsw", ibzg(int ), (int)348);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 28: {
                var24_7 /* !! */  = (int)lv.ibzb("icsx", ibzg(int ), (int)349);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl230:
            // 2 sources

            case 29: {
                var24_7 /* !! */  = (int)lv.ibzb("icsy", ibzg(int ), (int)350);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl235:
            // 2 sources

            case 30: {
                var24_7 /* !! */  = (int)lv.ibzb("icsz", ibzg(int ), (int)351);
                if (!var25_6) ** GOTO lbl180
                throw null;
            }
lbl239:
            // 4 sources

            case 31: {
                var24_7 /* !! */  = (int)lv.ibzb("icta", ibzg(int ), (int)352);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl244:
            // 2 sources

            case 32: {
                var24_7 /* !! */  = (int)lv.ibzb("ictb", ibzg(int ), (int)353);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl249:
            // 3 sources

            case 33: {
                var24_7 /* !! */  = (int)lv.ibzb("ictc", ibzg(int ), (int)354);
                if (!var25_6) ** GOTO lbl96
                throw null;
            }
lbl253:
            // 2 sources

            case 34: {
                var24_7 /* !! */  = (int)lv.ibzb("ictd", ibzg(int ), (int)355);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl258:
            // 2 sources

            case 35: {
                var24_7 /* !! */  = (int)lv.ibzb("icte", ibzg(int ), (int)356);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 36: {
                var24_7 /* !! */  = (int)lv.ibzb("ictf", ibzg(int ), (int)357);
                if (var25_6) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 37: {
                var24_7 /* !! */  = (int)lv.ibzb("ictg", ibzg(int ), (int)358);
                if (!var25_6) ** GOTO lbl161
                throw null;
            }
lbl272:
            // 2 sources

            case 38: {
                var24_7 /* !! */  = (int)lv.ibzb("icth", ibzg(int ), (int)359);
                if (!var25_6) ** GOTO lbl193
                throw null;
            }
            case 39: {
                var24_7 /* !! */  = (int)lv.ibzb("icti", ibzg(int ), (int)360);
                if (!var25_6) ** GOTO lbl253
                throw null;
            }
lbl280:
            // 2 sources

            case 40: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var24_7 /* !! */  = (int)lv.ibzb("ictj", ibzg(int ), (int)361);
                    if (!var25_6) ** GOTO lbl249
                    throw null;
                }
            }
lbl285:
            // 3 sources

            case 41: {
                var24_7 /* !! */  = (int)lv.ibzb("ictk", ibzg(int ), (int)362);
                if (!var25_6) ** GOTO lbl91
                throw null;
            }
lbl289:
            // 2 sources

            case 42: {
                var24_7 /* !! */  = (int)lv.ibzb("ictl", ibzg(int ), (int)363);
                if (!var25_6) ** GOTO lbl126
                throw null;
            }
lbl293:
            // 2 sources

            case 43: {
                var24_7 /* !! */  = (int)lv.ibzb("ictm", ibzg(int ), (int)364);
                if (!var25_6) ** GOTO lbl244
                throw null;
            }
lbl297:
            // 2 sources

            case 44: {
                var24_7 /* !! */  = (int)lv.ibzb("ictn", ibzg(int ), (int)365);
                if (!var25_6) ** GOTO lbl146
                throw null;
            }
lbl301:
            // 2 sources

            case 45: {
                var24_7 /* !! */  = (int)lv.ibzb("icto", ibzg(int ), (int)366);
                if (!var25_6) ** GOTO lbl161
                throw null;
            }
            case 46: {
                var24_7 /* !! */  = (int)lv.ibzb("ictp", ibzg(int ), (int)367);
                if (!var25_6) ** GOTO lbl216
                throw null;
            }
            case 47: {
                var24_7 /* !! */  = (int)lv.ibzb("ictq", ibzg(int ), (int)368);
                if (!var25_6) ** GOTO lbl193
                throw null;
            }
lbl313:
            // 2 sources

            case 48: {
                var24_7 /* !! */  = (int)lv.ibzb("ictr", ibzg(int ), (int)369);
                if (!var25_6) ** GOTO lbl91
                throw null;
            }
lbl317:
            // 3 sources

            case 49: {
                var24_7 /* !! */  = (int)lv.ibzb("icts", ibzg(int ), (int)370);
                if (!var25_6) ** GOTO lbl170
                throw null;
            }
lbl321:
            // 3 sources

            case 50: {
                var24_7 /* !! */  = (int)lv.ibzb("ictt", ibzg(int ), (int)371);
                if (!var25_6) ** GOTO lbl272
                throw null;
            }
            case 51: {
                var24_7 /* !! */  = (int)lv.ibzb("ictu", ibzg(int ), (int)372);
                if (!var25_6) ** GOTO lbl235
                throw null;
            }
lbl329:
            // 4 sources

            case 52: {
                var24_7 /* !! */  = (int)lv.ibzb("ictv", ibzg(int ), (int)373);
                if (!var25_6) ** GOTO lbl249
                throw null;
            }
            case 53: {
                var24_7 /* !! */  = (int)lv.ibzb("ictw", ibzg(int ), (int)374);
                if (!var25_6) ** GOTO lbl285
                throw null;
            }
lbl337:
            // 2 sources

            case 54: {
                var24_7 /* !! */  = (int)lv.ibzb("ictx", ibzg(int ), (int)375);
                if (!var25_6) ** GOTO lbl239
                throw null;
            }
            case 55: 
        }
        var24_7 /* !! */  = (int)lv.ibzb("icty", ibzg(int ), (int)376);
        ** while (!var25_6)
lbl344:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idue() {
        lv.ibza[300] = 4890985277287751454L;
        lv.ibza[301] = -7122093058071372061L;
        lv.ibza[302] = 3284188514531596890L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 getCameraPos() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("icfo", ibyy(int ), (int)87)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lv.ibzb("icfp", ibzg(int ), (int)78)) break;
            v0 /* !! */  = (long)lv.ibzb("icfq", ibzg(int ), (int)79);
        }
        var3 = lv.c;
        v1 /* !! */  = lv.pk;
        if (true) ** GOTO lbl11
        block39: while (true) {
            v1 /* !! */  = (long)(v2 - lv.ibzb("icfr", ibyy(int ), (int)88));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -943049020: {
                    v2 = lv.ibzb("icfs", ibyy(int ), (int)89);
                    continue block39;
                }
                case -450579769: {
                    break block39;
                }
                case -28945973: {
                    v2 = lv.ibzb("icft", ibyy(int ), (int)90);
                    continue block39;
                }
                case 1084240955: {
                    v2 = lv.ibzb("icfu", ibyy(int ), (int)91);
                    continue block39;
                }
            }
            break;
        }
        var2_1 /* !! */  = lv.b;
        v3 /* !! */  = lv.pk;
        if (true) ** GOTO lbl28
        block40: while (true) {
            v3 /* !! */  = (long)(v4 - lv.ibzb("icfv", ibyy(int ), (int)92));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -450579769: {
                    break block40;
                }
                case 213025760: {
                    v4 = lv.ibzb("icfw", ibyy(int ), (int)93);
                    continue block40;
                }
                case 668675483: {
                    v4 = lv.ibzb("icfx", ibyy(int ), (int)94);
                    continue block40;
                }
                case 989311139: {
                    v4 = lv.ibzb("icfy", ibyy(int ), (int)95);
                    continue block40;
                }
            }
            break;
        }
        var1_2 = lv.a;
        if (var3) {
            throw null;
lbl43:
            // 2 sources

            return null;
        }
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2 || var1_2) ** GOTO lbl43
                v5 /* !! */  = lv.pk;
                if (true) ** GOTO lbl53
                block42: while (true) {
                    v5 /* !! */  = (long)(v6 - lv.ibzb("icfz", ibyy(int ), (int)96));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1768777871: {
                            v6 = lv.ibzb("icga", ibyy(int ), (int)97);
                            continue block42;
                        }
                        case -869612099: {
                            v6 = lv.ibzb("icgb", ibyy(int ), (int)98);
                            continue block42;
                        }
                        case -450579769: {
                            break block42;
                        }
                        case 289463914: {
                            v6 = lv.ibzb("icgc", ibyy(int ), (int)99);
                            continue block42;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("icgd", ibyy(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lv.ibzb("icge", ibzg(int ), (int)80)) break;
                    v7 /* !! */  = (long)lv.ibzb("icgf", ibzg(int ), (int)81);
                }
                v8 = lv.mc.field_1773;
                v9 /* !! */  = lv.pk;
                if (true) ** GOTO lbl75
                block44: while (true) {
                    v9 /* !! */  = (long)(v10 - lv.ibzb("icgg", ibyy(int ), (int)101));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1575480324: {
                            v10 = lv.ibzb("icgh", ibyy(int ), (int)102);
                            continue block44;
                        }
                        case -1301347592: {
                            v10 = lv.ibzb("icgi", ibyy(int ), (int)103);
                            continue block44;
                        }
                        case -450579769: {
                            break block44;
                        }
                        case 1122808751: {
                            v10 = lv.ibzb("icgj", ibyy(int ), (int)104);
                            continue block44;
                        }
                    }
                    break;
                }
                var0_3 = v8.method_19418();
                if (var1_2 || var1_2) ** continue;
                v11 /* !! */  = lv.pk;
                if (true) ** GOTO lbl93
                block45: while (true) {
                    v11 /* !! */  = (long)(v12 - lv.ibzb("icgk", ibyy(int ), (int)105));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2145275442: {
                            v12 = lv.ibzb("icgl", ibyy(int ), (int)106);
                            continue block45;
                        }
                        case -534236836: {
                            v12 = lv.ibzb("icgm", ibyy(int ), (int)107);
                            continue block45;
                        }
                        case -450579769: {
                            break block45;
                        }
                        case 415486149: {
                            v12 = lv.ibzb("icgn", ibyy(int ), (int)108);
                            continue block45;
                        }
                    }
                    break;
                }
                return var0_3.method_71156();
            }
            case 0: {
                do {
                    var2_1 /* !! */  = (int)lv.ibzb("icgo", ibzg(int ), (int)82);
                } while (!var3);
                throw null;
            }
            case 1: {
                do {
                    var2_1 /* !! */  = (int)lv.ibzb("icgp", ibzg(int ), (int)83);
                } while (!var3);
                throw null;
            }
lbl116:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)lv.ibzb("icgq", ibzg(int ), (int)84);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl121:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)lv.ibzb("icgr", ibzg(int ), (int)85);
                    if (!var3) ** GOTO lbl116
                    throw null;
                }
            }
lbl126:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)lv.ibzb("icgs", ibzg(int ), (int)86);
                if (!var3) ** GOTO lbl121
                throw null;
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)lv.ibzb("icgt", ibzg(int ), (int)87);
        ** while (!var3)
lbl133:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void box(double var0, double var2_1, double var4_2, float var6_3, int var7_4, float var8_5) {
        var19_6 = lv.c;
        var18_7 /* !! */  = lv.b;
        var17_8 = lv.a;
        if (var19_6) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var17_8 || var17_8) ** GOTO lbl6
        var9_9 = lv.getCameraPos();
        if (var17_8 || var17_8) ** GOTO lbl6
        var10_10 = (float)(var0 - var9_9.field_1352);
        if (var17_8 || var17_8) ** GOTO lbl6
        var11_11 = (float)(var2_1 - var9_9.field_1351);
        if (var17_8 || var17_8) ** GOTO lbl6
        var12_12 = (float)(var4_2 - var9_9.field_1350);
        if (var17_8 || var17_8) ** GOTO lbl6
        var13_13 = var6_3 / 2.0f;
        if (var17_8 || var17_8) ** GOTO lbl6
        var14_14 = (float)(var7_4 >> lv.ibzb("iclb", ibzg(int ), (int)145) & lv.ibzb("iclc", ibzg(int ), (int)146)) / lv.ibzb("icld", icjz(int ), (int)147);
        if (var17_8) ** GOTO lbl6
        if (var18_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_8) ** GOTO lbl6
                var15_15 = (float)(var7_4 >> lv.ibzb("icle", ibzg(int ), (int)148) & lv.ibzb("iclf", ibzg(int ), (int)149)) / lv.ibzb("iclg", icjz(int ), (int)150);
                if (var17_8 || var17_8) ** GOTO lbl6
                var16_16 = (float)(var7_4 & lv.ibzb("iclh", ibzg(int ), (int)151)) / lv.ibzb("icli", icjz(int ), (int)152);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 - var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 - var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 + var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 + var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (var17_8 || var17_8) ** GOTO lbl6
                lv.addLine(var10_10 - var13_13, var11_11 - var13_13, var12_12 + var13_13, var10_10 - var13_13, var11_11 + var13_13, var12_12 + var13_13, var14_14, var15_15, var16_16, var8_5);
                if (!var17_8 && !var17_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var18_7 /* !! */  = (int)lv.ibzb("iclj", ibzg(int ), (int)153);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl60:
            // 5 sources

            case 1: {
                var18_7 /* !! */  = (int)lv.ibzb("iclk", ibzg(int ), (int)154);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 2: {
                var18_7 /* !! */  = (int)lv.ibzb("icll", ibzg(int ), (int)155);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl70:
            // 2 sources

            case 3: {
                var18_7 /* !! */  = (int)lv.ibzb("iclm", ibzg(int ), (int)156);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl75:
            // 2 sources

            case 4: {
                var18_7 /* !! */  = (int)lv.ibzb("icln", ibzg(int ), (int)157);
                if (!var19_6) ** GOTO lbl70
                throw null;
            }
            case 5: {
                var18_7 /* !! */  = (int)lv.ibzb("iclo", ibzg(int ), (int)158);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl84:
            // 2 sources

            case 6: {
                var18_7 /* !! */  = (int)lv.ibzb("iclp", ibzg(int ), (int)159);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl89:
            // 2 sources

            case 7: {
                var18_7 /* !! */  = (int)lv.ibzb("iclq", ibzg(int ), (int)160);
                if (!var19_6) break;
                throw null;
            }
            case 8: {
                var18_7 /* !! */  = (int)lv.ibzb("iclr", ibzg(int ), (int)161);
                if (!var19_6) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 9: {
                var18_7 /* !! */  = (int)lv.ibzb("icls", ibzg(int ), (int)162);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl102:
            // 3 sources

            case 10: {
                var18_7 /* !! */  = (int)lv.ibzb("iclt", ibzg(int ), (int)163);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 11: {
                var18_7 /* !! */  = (int)lv.ibzb("iclu", ibzg(int ), (int)164);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 12: {
                var18_7 /* !! */  = (int)lv.ibzb("iclv", ibzg(int ), (int)165);
                if (!var19_6) ** GOTO lbl102
                throw null;
            }
lbl116:
            // 3 sources

            case 13: {
                var18_7 /* !! */  = (int)lv.ibzb("iclw", ibzg(int ), (int)166);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 14: {
                var18_7 /* !! */  = (int)lv.ibzb("iclx", ibzg(int ), (int)167);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 15: {
                var18_7 /* !! */  = (int)lv.ibzb("icly", ibzg(int ), (int)168);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl131:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_7 /* !! */  = (int)lv.ibzb("iclz", ibzg(int ), (int)169);
                    if (!var19_6) ** GOTO lbl60
                    throw null;
                }
            }
            case 17: {
                var18_7 /* !! */  = (int)lv.ibzb("icma", ibzg(int ), (int)170);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl141:
            // 2 sources

            case 18: {
                var18_7 /* !! */  = (int)lv.ibzb("icmb", ibzg(int ), (int)171);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl146:
            // 2 sources

            case 19: {
                var18_7 /* !! */  = (int)lv.ibzb("icmc", ibzg(int ), (int)172);
                if (!var19_6) ** GOTO lbl60
                throw null;
            }
lbl150:
            // 3 sources

            case 20: {
                var18_7 /* !! */  = (int)lv.ibzb("icmd", ibzg(int ), (int)173);
                if (!var19_6) ** GOTO lbl84
                throw null;
            }
lbl154:
            // 2 sources

            case 21: {
                var18_7 /* !! */  = (int)lv.ibzb("icme", ibzg(int ), (int)174);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl159:
            // 3 sources

            case 22: {
                var18_7 /* !! */  = (int)lv.ibzb("icmf", ibzg(int ), (int)175);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 23: {
                var18_7 /* !! */  = (int)lv.ibzb("icmg", ibzg(int ), (int)176);
                if (!var19_6) ** GOTO lbl131
                throw null;
            }
            case 24: {
                var18_7 /* !! */  = (int)lv.ibzb("icmh", ibzg(int ), (int)177);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 25: {
                var18_7 /* !! */  = (int)lv.ibzb("icmi", ibzg(int ), (int)178);
                if (!var19_6) ** GOTO lbl116
                throw null;
            }
            case 26: {
                var18_7 /* !! */  = (int)lv.ibzb("icmj", ibzg(int ), (int)179);
                if (!var19_6) ** GOTO lbl60
                throw null;
            }
lbl181:
            // 4 sources

            case 27: {
                var18_7 /* !! */  = (int)lv.ibzb("icmk", ibzg(int ), (int)180);
                if (!var19_6) ** GOTO lbl154
                throw null;
            }
lbl185:
            // 2 sources

            case 28: {
                var18_7 /* !! */  = (int)lv.ibzb("icml", ibzg(int ), (int)181);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl190:
            // 3 sources

            case 29: {
                var18_7 /* !! */  = (int)lv.ibzb("icmm", ibzg(int ), (int)182);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 30: {
                var18_7 /* !! */  = (int)lv.ibzb("icmn", ibzg(int ), (int)183);
                if (!var19_6) ** GOTO lbl185
                throw null;
            }
            case 31: {
                var18_7 /* !! */  = (int)lv.ibzb("icmo", ibzg(int ), (int)184);
                if (!var19_6) ** GOTO lbl102
                throw null;
            }
lbl203:
            // 2 sources

            case 32: {
                var18_7 /* !! */  = (int)lv.ibzb("icmp", ibzg(int ), (int)185);
                if (!var19_6) ** GOTO lbl190
                throw null;
            }
lbl207:
            // 3 sources

            case 33: {
                var18_7 /* !! */  = (int)lv.ibzb("icmq", ibzg(int ), (int)186);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl212:
            // 3 sources

            case 34: {
                var18_7 /* !! */  = (int)lv.ibzb("icmr", ibzg(int ), (int)187);
                if (!var19_6) ** GOTO lbl207
                throw null;
            }
            case 35: {
                var18_7 /* !! */  = (int)lv.ibzb("icms", ibzg(int ), (int)188);
                if (!var19_6) ** GOTO lbl60
                throw null;
            }
            case 36: {
                var18_7 /* !! */  = (int)lv.ibzb("icmt", ibzg(int ), (int)189);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 37: {
                var18_7 /* !! */  = (int)lv.ibzb("icmu", ibzg(int ), (int)190);
                if (!var19_6) ** GOTO lbl203
                throw null;
            }
            case 38: {
                var18_7 /* !! */  = (int)lv.ibzb("icmv", ibzg(int ), (int)191);
                if (!var19_6) ** GOTO lbl89
                throw null;
            }
lbl233:
            // 2 sources

            case 39: {
                var18_7 /* !! */  = (int)lv.ibzb("icmw", ibzg(int ), (int)192);
                if (var19_6) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl238:
            // 4 sources

            case 40: {
                var18_7 /* !! */  = (int)lv.ibzb("icmx", ibzg(int ), (int)193);
                if (!var19_6) ** GOTO lbl97
                throw null;
            }
lbl242:
            // 5 sources

            case 41: {
                var18_7 /* !! */  = (int)lv.ibzb("icmy", ibzg(int ), (int)194);
                if (!var19_6) ** GOTO lbl75
                throw null;
            }
lbl246:
            // 2 sources

            case 42: {
                var18_7 /* !! */  = (int)lv.ibzb("icmz", ibzg(int ), (int)195);
                if (!var19_6) ** GOTO lbl159
                throw null;
            }
            case 43: 
        }
        var18_7 /* !! */  = (int)lv.ibzb("icna", ibzg(int ), (int)196);
        ** while (!var19_6)
lbl253:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float icjz(int n2) {
        return Float.intBitsToFloat(ibzh[n2] ^ ibzi[n2]);
    }

    private static /* synthetic */ void idto() {
        lv.ibzh[700] = -1542347492;
        lv.ibzh[701] = 812315739;
        lv.ibzh[702] = -987964220;
        lv.ibzh[703] = 333195777;
        lv.ibzh[704] = 1232070863;
        lv.ibzh[705] = 2131061474;
        lv.ibzh[706] = 1865498137;
        lv.ibzh[707] = 983543319;
        lv.ibzh[708] = -1889088361;
        lv.ibzh[709] = 1328132947;
        lv.ibzh[710] = -1085920790;
        lv.ibzh[711] = -1008354685;
        lv.ibzh[712] = 543402482;
        lv.ibzh[713] = -1771636969;
        lv.ibzh[714] = -1460565137;
        lv.ibzh[715] = 886608986;
        lv.ibzh[716] = -1557293192;
        lv.ibzh[717] = 912918288;
        lv.ibzh[718] = 1310497455;
        lv.ibzh[719] = -1031058913;
        lv.ibzh[720] = 43398516;
        lv.ibzh[721] = -101250022;
        lv.ibzh[722] = 747320751;
        lv.ibzh[723] = 1460175731;
        lv.ibzh[724] = -700135997;
        lv.ibzh[725] = -159044115;
        lv.ibzh[726] = 356179136;
        lv.ibzh[727] = -527039765;
        lv.ibzh[728] = -1563280263;
        lv.ibzh[729] = 996756674;
        lv.ibzh[730] = -967020723;
        lv.ibzh[731] = -813097398;
        lv.ibzh[732] = -120062490;
        lv.ibzh[733] = -1578647955;
        lv.ibzh[734] = -1205866530;
        lv.ibzh[735] = 1581409090;
        lv.ibzh[736] = -729455540;
        lv.ibzh[737] = -1375645182;
        lv.ibzh[738] = 1776454259;
        lv.ibzh[739] = 1573312179;
        lv.ibzh[740] = -945450180;
        lv.ibzh[741] = -845798097;
        lv.ibzh[742] = -234452877;
        lv.ibzh[743] = -1171920023;
        lv.ibzh[744] = 1754032209;
        lv.ibzh[745] = 1548505836;
        lv.ibzh[746] = -1948009416;
        lv.ibzh[747] = 1033303001;
        lv.ibzh[748] = -2043859755;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$init$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("idst", ibyy(int ), (int)300)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lv.ibzb("idsu", ibzg(int ), (int)738)) break;
            v0 /* !! */  = (long)lv.ibzb("idsv", ibzg(int ), (int)739);
        }
        var2 = lv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idsw", ibyy(int ), (int)301)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lv.ibzb("idsx", ibzg(int ), (int)740)) break;
            v1 /* !! */  = (long)lv.ibzb("idsy", ibzg(int ), (int)741);
        }
        var1_1 /* !! */  = lv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("idsz", ibyy(int ), (int)302)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lv.ibzb("idta", ibzg(int ), (int)742)) break;
            v2 /* !! */  = (long)lv.ibzb("idtb", ibzg(int ), (int)743);
        }
        var0_2 = lv.a;
        if (var2) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl24
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                return "Line3D Uniforms";
            }
lbl32:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)lv.ibzb("idtc", ibzg(int ), (int)744);
                if (!var2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)lv.ibzb("idtd", ibzg(int ), (int)745);
                    if (!var2) ** GOTO lbl32
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)lv.ibzb("idte", ibzg(int ), (int)746);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)lv.ibzb("idtf", ibzg(int ), (int)747);
        ** while (!var2)
lbl48:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idtr() {
        lv.ibzi[200] = 1786245713;
        lv.ibzi[201] = 40545224;
        lv.ibzi[202] = 357227173;
        lv.ibzi[203] = -825442759;
        lv.ibzi[204] = -508105002;
        lv.ibzi[205] = 1210912981;
        lv.ibzi[206] = -1405064508;
        lv.ibzi[207] = 1213861698;
        lv.ibzi[208] = -476948171;
        lv.ibzi[209] = 828923042;
        lv.ibzi[210] = -1294530905;
        lv.ibzi[211] = -1716676230;
        lv.ibzi[212] = 1934063718;
        lv.ibzi[213] = -2043492967;
        lv.ibzi[214] = -195689819;
        lv.ibzi[215] = 1370314014;
        lv.ibzi[216] = -24196707;
        lv.ibzi[217] = -99153916;
        lv.ibzi[218] = 1327770896;
        lv.ibzi[219] = 6088166;
        lv.ibzi[220] = 1829085848;
        lv.ibzi[221] = 559283155;
        lv.ibzi[222] = 385002154;
        lv.ibzi[223] = 1478340713;
        lv.ibzi[224] = 1272915256;
        lv.ibzi[225] = -360365412;
        lv.ibzi[226] = 1364502103;
        lv.ibzi[227] = 1410359744;
        lv.ibzi[228] = 142104659;
        lv.ibzi[229] = 1499222498;
        lv.ibzi[230] = -453654508;
        lv.ibzi[231] = -2112565910;
        lv.ibzi[232] = -1714128440;
        lv.ibzi[233] = 1691442585;
        lv.ibzi[234] = -800282841;
        lv.ibzi[235] = -11582097;
        lv.ibzi[236] = 1271127507;
        lv.ibzi[237] = 482076393;
        lv.ibzi[238] = -792351848;
        lv.ibzi[239] = -1696018233;
        lv.ibzi[240] = 399044513;
        lv.ibzi[241] = 575337266;
        lv.ibzi[242] = 305533663;
        lv.ibzi[243] = 1311892475;
        lv.ibzi[244] = 1827940135;
        lv.ibzi[245] = -688312496;
        lv.ibzi[246] = -13759522;
        lv.ibzi[247] = 296058892;
        lv.ibzi[248] = -500627410;
        lv.ibzi[249] = -1081507041;
        lv.ibzi[250] = -927195631;
        lv.ibzi[251] = 1975835540;
        lv.ibzi[252] = -892633422;
        lv.ibzi[253] = -2009409215;
        lv.ibzi[254] = -693940221;
        lv.ibzi[255] = 463600171;
        lv.ibzi[256] = 1442196589;
        lv.ibzi[257] = -183886050;
        lv.ibzi[258] = -618086141;
        lv.ibzi[259] = -1519266292;
        lv.ibzi[260] = -380666963;
        lv.ibzi[261] = 818266411;
        lv.ibzi[262] = -2034980329;
        lv.ibzi[263] = 1373962231;
        lv.ibzi[264] = 60590958;
        lv.ibzi[265] = 1076242287;
        lv.ibzi[266] = -892470735;
        lv.ibzi[267] = -1483744936;
        lv.ibzi[268] = -1383184220;
        lv.ibzi[269] = 2136143427;
        lv.ibzi[270] = -1330183776;
        lv.ibzi[271] = 1050266792;
        lv.ibzi[272] = 2050377943;
        lv.ibzi[273] = -1468721319;
        lv.ibzi[274] = 560259273;
        lv.ibzi[275] = 1484597266;
        lv.ibzi[276] = 1230387701;
        lv.ibzi[277] = -579744002;
        lv.ibzi[278] = -1309495786;
        lv.ibzi[279] = -166232486;
        lv.ibzi[280] = 1838545763;
        lv.ibzi[281] = -34905693;
        lv.ibzi[282] = -464746707;
        lv.ibzi[283] = 98873850;
        lv.ibzi[284] = -455494572;
        lv.ibzi[285] = 1768426905;
        lv.ibzi[286] = 249430373;
        lv.ibzi[287] = 87887501;
        lv.ibzi[288] = -357401762;
        lv.ibzi[289] = 1682464027;
        lv.ibzi[290] = -1160598155;
        lv.ibzi[291] = -1710156688;
        lv.ibzi[292] = 427385674;
        lv.ibzi[293] = 692196497;
        lv.ibzi[294] = 640590446;
        lv.ibzi[295] = -1255941466;
        lv.ibzi[296] = 1733165355;
        lv.ibzi[297] = 1084571923;
        lv.ibzi[298] = 1357923306;
        lv.ibzi[299] = 1366239996;
    }

    private static /* synthetic */ void idtw() {
        lv.ibzi[700] = 1542347491;
        lv.ibzi[701] = 182462479;
        lv.ibzi[702] = 987964219;
        lv.ibzi[703] = -1724151447;
        lv.ibzi[704] = -1232070864;
        lv.ibzi[705] = 1101896568;
        lv.ibzi[706] = 1865498138;
        lv.ibzi[707] = 983543326;
        lv.ibzi[708] = -1889088362;
        lv.ibzi[709] = 1328132949;
        lv.ibzi[710] = -1085920774;
        lv.ibzi[711] = -1008354681;
        lv.ibzi[712] = 543402495;
        lv.ibzi[713] = -1771636962;
        lv.ibzi[714] = -1460565137;
        lv.ibzi[715] = 886608981;
        lv.ibzi[716] = -1557293198;
        lv.ibzi[717] = 912918293;
        lv.ibzi[718] = 1310497455;
        lv.ibzi[719] = -1031058917;
        lv.ibzi[720] = 43398524;
        lv.ibzi[721] = -101250032;
        lv.ibzi[722] = 747320749;
        lv.ibzi[723] = 1460175741;
        lv.ibzi[724] = 700135996;
        lv.ibzi[725] = 135062459;
        lv.ibzi[726] = 356179137;
        lv.ibzi[727] = -527039765;
        lv.ibzi[728] = -1563280264;
        lv.ibzi[729] = 996756672;
        lv.ibzi[730] = 967020722;
        lv.ibzi[731] = 1919751618;
        lv.ibzi[732] = 120062489;
        lv.ibzi[733] = 214043283;
        lv.ibzi[734] = -1205866530;
        lv.ibzi[735] = 1581409091;
        lv.ibzi[736] = -729455539;
        lv.ibzi[737] = -1375645181;
        lv.ibzi[738] = -1776454260;
        lv.ibzi[739] = 292378016;
        lv.ibzi[740] = -945450179;
        lv.ibzi[741] = -316871493;
        lv.ibzi[742] = 234452876;
        lv.ibzi[743] = 1266224235;
        lv.ibzi[744] = 1754032208;
        lv.ibzi[745] = 1548505838;
        lv.ibzi[746] = -1948009416;
        lv.ibzi[747] = 1033303000;
        lv.ibzi[748] = -2043859755;
    }

    private static /* synthetic */ void idtq() {
        lv.ibzi[100] = 742912049;
        lv.ibzi[101] = -985168619;
        lv.ibzi[102] = 1726102798;
        lv.ibzi[103] = 269306786;
        lv.ibzi[104] = -1892138394;
        lv.ibzi[105] = 308903471;
        lv.ibzi[106] = -2045301440;
        lv.ibzi[107] = -594155862;
        lv.ibzi[108] = 1620704153;
        lv.ibzi[109] = -1561341268;
        lv.ibzi[110] = -1371441707;
        lv.ibzi[111] = -880214833;
        lv.ibzi[112] = -1540498795;
        lv.ibzi[113] = -1659411340;
        lv.ibzi[114] = -2146907238;
        lv.ibzi[115] = 1012827668;
        lv.ibzi[116] = 765750019;
        lv.ibzi[117] = 512132537;
        lv.ibzi[118] = 1085185380;
        lv.ibzi[119] = -1774180881;
        lv.ibzi[120] = -1160691206;
        lv.ibzi[121] = 1171965329;
        lv.ibzi[122] = 1945304471;
        lv.ibzi[123] = 29626029;
        lv.ibzi[124] = 537457818;
        lv.ibzi[125] = -1400288473;
        lv.ibzi[126] = -1610737044;
        lv.ibzi[127] = -1368194187;
        lv.ibzi[128] = 1018436707;
        lv.ibzi[129] = 842434087;
        lv.ibzi[130] = -213990042;
        lv.ibzi[131] = -1980054232;
        lv.ibzi[132] = 1407269314;
        lv.ibzi[133] = 1504952285;
        lv.ibzi[134] = -1239612565;
        lv.ibzi[135] = -1623804606;
        lv.ibzi[136] = -1273659822;
        lv.ibzi[137] = -1826077420;
        lv.ibzi[138] = 1926502553;
        lv.ibzi[139] = -115554871;
        lv.ibzi[140] = -363796806;
        lv.ibzi[141] = -1718406305;
        lv.ibzi[142] = 2062369307;
        lv.ibzi[143] = 1441876271;
        lv.ibzi[144] = -1526948584;
        lv.ibzi[145] = 1191725352;
        lv.ibzi[146] = -216563028;
        lv.ibzi[147] = 1607400728;
        lv.ibzi[148] = 1190106481;
        lv.ibzi[149] = 412431092;
        lv.ibzi[150] = 837066895;
        lv.ibzi[151] = -2076679364;
        lv.ibzi[152] = -262259003;
        lv.ibzi[153] = -338171670;
        lv.ibzi[154] = 1048809154;
        lv.ibzi[155] = 2011907217;
        lv.ibzi[156] = -991186594;
        lv.ibzi[157] = -782311275;
        lv.ibzi[158] = -1457801870;
        lv.ibzi[159] = -1144601944;
        lv.ibzi[160] = -177279384;
        lv.ibzi[161] = 1630803688;
        lv.ibzi[162] = 682610097;
        lv.ibzi[163] = 1236704087;
        lv.ibzi[164] = 1377043654;
        lv.ibzi[165] = -2055195006;
        lv.ibzi[166] = -1247394715;
        lv.ibzi[167] = 983335575;
        lv.ibzi[168] = 732573474;
        lv.ibzi[169] = -1438425548;
        lv.ibzi[170] = 1468029060;
        lv.ibzi[171] = -765806928;
        lv.ibzi[172] = -1100136634;
        lv.ibzi[173] = -185250881;
        lv.ibzi[174] = 522741885;
        lv.ibzi[175] = 1806774931;
        lv.ibzi[176] = -2035684694;
        lv.ibzi[177] = -608768287;
        lv.ibzi[178] = 282272505;
        lv.ibzi[179] = 1557209734;
        lv.ibzi[180] = -847131571;
        lv.ibzi[181] = -1243895662;
        lv.ibzi[182] = 1207340739;
        lv.ibzi[183] = 631275270;
        lv.ibzi[184] = -1693634617;
        lv.ibzi[185] = -1087325557;
        lv.ibzi[186] = -795533821;
        lv.ibzi[187] = 870445544;
        lv.ibzi[188] = -2006582881;
        lv.ibzi[189] = 1489873671;
        lv.ibzi[190] = 1783251122;
        lv.ibzi[191] = -703370816;
        lv.ibzi[192] = -1190641447;
        lv.ibzi[193] = -308240180;
        lv.ibzi[194] = 1047079497;
        lv.ibzi[195] = -971505785;
        lv.ibzi[196] = 1957326291;
        lv.ibzi[197] = -493487252;
        lv.ibzi[198] = 173391547;
        lv.ibzi[199] = 518525559;
    }

    private static /* synthetic */ int ibzg(int n2) {
        return ibzh[n2] ^ ibzi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin() {
        v0 /* !! */  = lv.pk;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - lv.ibzb("icgu", ibyy(int ), (int)109));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -450579769: {
                    break block28;
                }
                case 27849289: {
                    v1 = lv.ibzb("icgv", ibyy(int ), (int)110);
                    continue block28;
                }
                case 328393616: {
                    v1 = lv.ibzb("icgw", ibyy(int ), (int)111);
                    continue block28;
                }
            }
            break;
        }
        var2 = lv.c;
        v2 /* !! */  = lv.pk;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - lv.ibzb("icgx", ibyy(int ), (int)112));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1262959900: {
                    v3 = lv.ibzb("icgy", ibyy(int ), (int)113);
                    continue block29;
                }
                case -917348705: {
                    v3 = lv.ibzb("icgz", ibyy(int ), (int)114);
                    continue block29;
                }
                case -694606918: {
                    v3 = lv.ibzb("icha", ibyy(int ), (int)115);
                    continue block29;
                }
                case -450579769: {
                    break block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = lv.b;
        v4 /* !! */  = lv.pk;
        if (true) ** GOTO lbl36
        block30: while (true) {
            v4 /* !! */  = (long)(lv.ibzb("ichc", ibyy(int ), (int)117) - lv.ibzb("ichb", ibyy(int ), (int)116));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -681753233: {
                    continue block30;
                }
                case -450579769: {
                    break block30;
                }
            }
            break;
        }
        var0_2 = lv.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl44
        v5 = lv.ibzb("ichd", ibzg(int ), (int)88);
        v6 /* !! */  = lv.pk;
        if (true) ** GOTO lbl52
        block32: while (true) {
            v6 /* !! */  = (long)(v7 - lv.ibzb("iche", ibyy(int ), (int)118));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -688284159: {
                    v7 = lv.ibzb("ichf", ibyy(int ), (int)119);
                    continue block32;
                }
                case -450579769: {
                    break block32;
                }
                case 699972563: {
                    v7 = lv.ibzb("ichg", ibyy(int ), (int)120);
                    continue block32;
                }
            }
            break;
        }
        lv.begin((boolean)v5);
        ** while (var0_2 || var0_2)
lbl63:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)lv.ibzb("ichh", ibzg(int ), (int)89);
                if (var2) {
                    throw null;
                }
            }
lbl71:
            // 5 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)lv.ibzb("ichi", ibzg(int ), (int)90);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)lv.ibzb("ichj", ibzg(int ), (int)91);
                if (var2) {
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)lv.ibzb("ichk", ibzg(int ), (int)92);
                if (!var2) ** GOTO lbl71
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)lv.ibzb("ichl", ibzg(int ), (int)93);
                if (!var2) ** GOTO lbl71
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)lv.ibzb("ichm", ibzg(int ), (int)94);
        ** while (!var2)
lbl91:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idtp() {
        lv.ibzi[0] = -619483568;
        lv.ibzi[1] = 1761566522;
        lv.ibzi[2] = 1250238604;
        lv.ibzi[3] = -141224988;
        lv.ibzi[4] = 1040010325;
        lv.ibzi[5] = 1081116495;
        lv.ibzi[6] = -1064322594;
        lv.ibzi[7] = -289358234;
        lv.ibzi[8] = 612452480;
        lv.ibzi[9] = -63041418;
        lv.ibzi[10] = -1189661747;
        lv.ibzi[11] = 1491765416;
        lv.ibzi[12] = -210954779;
        lv.ibzi[13] = -1850188852;
        lv.ibzi[14] = -10680242;
        lv.ibzi[15] = -685037659;
        lv.ibzi[16] = -1210354355;
        lv.ibzi[17] = -393179326;
        lv.ibzi[18] = 933884111;
        lv.ibzi[19] = -668657282;
        lv.ibzi[20] = 914194071;
        lv.ibzi[21] = 392460368;
        lv.ibzi[22] = -1760746217;
        lv.ibzi[23] = 1798999516;
        lv.ibzi[24] = 561279419;
        lv.ibzi[25] = -1942998919;
        lv.ibzi[26] = -116396423;
        lv.ibzi[27] = 1160513573;
        lv.ibzi[28] = -993917490;
        lv.ibzi[29] = -908551969;
        lv.ibzi[30] = -1790830700;
        lv.ibzi[31] = -659371636;
        lv.ibzi[32] = 335185749;
        lv.ibzi[33] = 713315165;
        lv.ibzi[34] = -309953870;
        lv.ibzi[35] = 130034678;
        lv.ibzi[36] = 690424743;
        lv.ibzi[37] = -800492989;
        lv.ibzi[38] = -2138769808;
        lv.ibzi[39] = -2026352639;
        lv.ibzi[40] = 1197116013;
        lv.ibzi[41] = 1372660877;
        lv.ibzi[42] = -1277397607;
        lv.ibzi[43] = -1457332;
        lv.ibzi[44] = -1069864124;
        lv.ibzi[45] = 245035052;
        lv.ibzi[46] = -1296184740;
        lv.ibzi[47] = -1341314429;
        lv.ibzi[48] = -2109510248;
        lv.ibzi[49] = 212897364;
        lv.ibzi[50] = 83554427;
        lv.ibzi[51] = -40853806;
        lv.ibzi[52] = 551591521;
        lv.ibzi[53] = 1503107544;
        lv.ibzi[54] = -43141580;
        lv.ibzi[55] = -1328914373;
        lv.ibzi[56] = -1008319367;
        lv.ibzi[57] = 1034544410;
        lv.ibzi[58] = 2010668759;
        lv.ibzi[59] = -677443943;
        lv.ibzi[60] = -1902814567;
        lv.ibzi[61] = 1340817121;
        lv.ibzi[62] = 82454440;
        lv.ibzi[63] = 1500879019;
        lv.ibzi[64] = 327069823;
        lv.ibzi[65] = -1326372879;
        lv.ibzi[66] = 219713372;
        lv.ibzi[67] = -1709434251;
        lv.ibzi[68] = 992186925;
        lv.ibzi[69] = 1249819330;
        lv.ibzi[70] = 104873279;
        lv.ibzi[71] = -1079039942;
        lv.ibzi[72] = -2071726551;
        lv.ibzi[73] = 1372503823;
        lv.ibzi[74] = 1820092962;
        lv.ibzi[75] = 200267615;
        lv.ibzi[76] = -527646426;
        lv.ibzi[77] = -367635279;
        lv.ibzi[78] = -294842075;
        lv.ibzi[79] = 1156344547;
        lv.ibzi[80] = -1267094030;
        lv.ibzi[81] = 2084794164;
        lv.ibzi[82] = -1611513055;
        lv.ibzi[83] = -2042467843;
        lv.ibzi[84] = -770911020;
        lv.ibzi[85] = -641343288;
        lv.ibzi[86] = 1473214214;
        lv.ibzi[87] = 804305491;
        lv.ibzi[88] = 190482272;
        lv.ibzi[89] = -1598678346;
        lv.ibzi[90] = 471025836;
        lv.ibzi[91] = 2032745867;
        lv.ibzi[92] = -1600051201;
        lv.ibzi[93] = -1944216588;
        lv.ibzi[94] = 234241684;
        lv.ibzi[95] = -1932319950;
        lv.ibzi[96] = -1810033905;
        lv.ibzi[97] = -1931275611;
        lv.ibzi[98] = -1301277637;
        lv.ibzi[99] = -765066178;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void addLine(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("idah", ibyy(int ), (int)162)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lv.ibzb("idaj", ibzg(int ), (int)484)) break;
            v0 /* !! */  = (long)lv.ibzb("idal", ibzg(int ), (int)485);
        }
        var12_10 = lv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idam", ibyy(int ), (int)163)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lv.ibzb("idan", ibzg(int ), (int)486)) break;
            v1 /* !! */  = (long)lv.ibzb("idap", ibzg(int ), (int)487);
        }
        var11_11 /* !! */  = lv.b;
        v2 /* !! */  = lv.pk;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(lv.ibzb("idat", ibyy(int ), (int)165) - lv.ibzb("idaq", ibyy(int ), (int)164));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -450579769: {
                    break block26;
                }
                case 1952806920: {
                    continue block26;
                }
            }
            break;
        }
        var10_12 = lv.a;
        if (var12_10) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var10_12 || var10_12) ** GOTO lbl27
        v3 /* !! */  = lv.pk;
        if (true) ** GOTO lbl34
        block28: while (true) {
            v3 /* !! */  = (long)(lv.ibzb("iday", ibyy(int ), (int)167) - lv.ibzb("idaw", ibyy(int ), (int)166));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -450579769: {
                    break block28;
                }
                case 1550318396: {
                    continue block28;
                }
            }
            break;
        }
        lv.addVertex(var0, var1_1, var2_2, var6_6, var7_7, var8_8, var9_9);
        if (var10_12 || var10_12) ** GOTO lbl27
        v4 /* !! */  = lv.pk;
        if (true) ** GOTO lbl45
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - lv.ibzb("idbb", ibyy(int ), (int)168));
lbl45:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1633690265: {
                    v5 = lv.ibzb("idbc", ibyy(int ), (int)169);
                    continue block29;
                }
                case -549334155: {
                    v5 = lv.ibzb("idbe", ibyy(int ), (int)170);
                    continue block29;
                }
                case -450579769: {
                    break block29;
                }
                case -176254411: {
                    v5 = lv.ibzb("idbg", ibyy(int ), (int)171);
                    continue block29;
                }
            }
            break;
        }
        lv.addVertex(var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9);
        ** while (var10_12 || var10_12)
lbl59:
        // 1 sources

        if (var11_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var11_11 /* !! */  = (int)lv.ibzb("idbi", ibzg(int ), (int)488);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl68:
            // 2 sources

            case 1: {
                var11_11 /* !! */  = (int)lv.ibzb("idbk", ibzg(int ), (int)489);
                if (!var12_10) break;
                throw null;
            }
            case 2: {
                var11_11 /* !! */  = (int)lv.ibzb("idbm", ibzg(int ), (int)490);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl77:
            // 2 sources

            case 3: {
                var11_11 /* !! */  = (int)lv.ibzb("idbo", ibzg(int ), (int)491);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 4: {
                var11_11 /* !! */  = (int)lv.ibzb("idbq", ibzg(int ), (int)492);
                if (var12_10) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl87:
            // 2 sources

            case 5: {
                var11_11 /* !! */  = (int)lv.ibzb("idbs", ibzg(int ), (int)493);
                if (var12_10) {
                    throw null;
                }
            }
lbl91:
            // 5 sources

            case 6: {
                var11_11 /* !! */  = (int)lv.ibzb("idbu", ibzg(int ), (int)494);
                if (!var12_10) ** GOTO lbl68
                throw null;
            }
            case 7: 
        }
        do {
            var11_11 /* !! */  = (int)lv.ibzb("idbw", ibzg(int ), (int)495);
        } while (!var12_10);
        throw null;
    }

    private static /* synthetic */ void idtj() {
        lv.ibzh[200] = 1786245721;
        lv.ibzh[201] = 40545079;
        lv.ibzh[202] = 1446369957;
        lv.ibzh[203] = -825442618;
        lv.ibzh[204] = -1563824426;
        lv.ibzh[205] = 1210912981;
        lv.ibzh[206] = -1405064508;
        lv.ibzh[207] = 1213861699;
        lv.ibzh[208] = -476948169;
        lv.ibzh[209] = 828923042;
        lv.ibzh[210] = -1294530940;
        lv.ibzh[211] = -1716676289;
        lv.ibzh[212] = 1934063742;
        lv.ibzh[213] = -2043492964;
        lv.ibzh[214] = -195689814;
        lv.ibzh[215] = 1370313998;
        lv.ibzh[216] = -24196715;
        lv.ibzh[217] = -99153892;
        lv.ibzh[218] = 1327770944;
        lv.ibzh[219] = 6088070;
        lv.ibzh[220] = 1829085846;
        lv.ibzh[221] = 559283097;
        lv.ibzh[222] = 385002144;
        lv.ibzh[223] = 1478340735;
        lv.ibzh[224] = 1272915214;
        lv.ibzh[225] = -360365384;
        lv.ibzh[226] = 1364502071;
        lv.ibzh[227] = 1410359791;
        lv.ibzh[228] = 142104660;
        lv.ibzh[229] = 1499222484;
        lv.ibzh[230] = -453654447;
        lv.ibzh[231] = -2112565913;
        lv.ibzh[232] = -1714128399;
        lv.ibzh[233] = 1691442586;
        lv.ibzh[234] = -800282777;
        lv.ibzh[235] = -11582081;
        lv.ibzh[236] = 1271127543;
        lv.ibzh[237] = 482076360;
        lv.ibzh[238] = -792351790;
        lv.ibzh[239] = -1696018200;
        lv.ibzh[240] = 399044519;
        lv.ibzh[241] = 575337336;
        lv.ibzh[242] = 305533669;
        lv.ibzh[243] = 1311892417;
        lv.ibzh[244] = 1827940116;
        lv.ibzh[245] = -688312462;
        lv.ibzh[246] = -13759554;
        lv.ibzh[247] = 296058935;
        lv.ibzh[248] = -500627437;
        lv.ibzh[249] = -1081507032;
        lv.ibzh[250] = -927195636;
        lv.ibzh[251] = 1975835534;
        lv.ibzh[252] = -892633417;
        lv.ibzh[253] = -2009409205;
        lv.ibzh[254] = -693940178;
        lv.ibzh[255] = 463600158;
        lv.ibzh[256] = 1442196607;
        lv.ibzh[257] = -183886010;
        lv.ibzh[258] = -618086116;
        lv.ibzh[259] = -1519266256;
        lv.ibzh[260] = -380666899;
        lv.ibzh[261] = 818266466;
        lv.ibzh[262] = -2034980347;
        lv.ibzh[263] = 1373962158;
        lv.ibzh[264] = 60590971;
        lv.ibzh[265] = 1076242222;
        lv.ibzh[266] = -892470773;
        lv.ibzh[267] = -1483744941;
        lv.ibzh[268] = -1383184148;
        lv.ibzh[269] = 2136143384;
        lv.ibzh[270] = -1330183700;
        lv.ibzh[271] = 1050266767;
        lv.ibzh[272] = 2050377861;
        lv.ibzh[273] = -1468721303;
        lv.ibzh[274] = 560259207;
        lv.ibzh[275] = 1484597271;
        lv.ibzh[276] = 1230387675;
        lv.ibzh[277] = -579744050;
        lv.ibzh[278] = -1309495804;
        lv.ibzh[279] = -166232484;
        lv.ibzh[280] = 1838545744;
        lv.ibzh[281] = -34905612;
        lv.ibzh[282] = -464746718;
        lv.ibzh[283] = 98873836;
        lv.ibzh[284] = -455494545;
        lv.ibzh[285] = 1768426906;
        lv.ibzh[286] = 249430324;
        lv.ibzh[287] = 87887561;
        lv.ibzh[288] = -357401758;
        lv.ibzh[289] = 1682464044;
        lv.ibzh[290] = -1160598198;
        lv.ibzh[291] = -1710156765;
        lv.ibzh[292] = 427385691;
        lv.ibzh[293] = 692196574;
        lv.ibzh[294] = 640590437;
        lv.ibzh[295] = -1255941396;
        lv.ibzh[296] = 1733165369;
        lv.ibzh[297] = 1084571975;
        lv.ibzh[298] = 1357923246;
        lv.ibzh[299] = 1366239962;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void rotatedBox(double var0, double var2_1, double var4_2, float var6_3, float var7_4, float var8_5, int var9_6, float var10_7) {
        var36_8 = lv.c;
        var35_9 /* !! */  = lv.b;
        var34_10 = lv.a;
        if (var36_8) {
            throw null;
lbl6:
            // 55 sources

            return;
        }
        if (var34_10 || var34_10) ** GOTO lbl6
        var11_11 = lv.getCameraPos();
        if (var34_10 || var34_10) ** GOTO lbl6
        var12_12 = (float)(var0 - var11_11.field_1352);
        if (var34_10 || var34_10) ** GOTO lbl6
        var13_13 = (float)(var2_1 - var11_11.field_1351);
        if (var34_10 || var34_10) ** GOTO lbl6
        var14_14 = (float)(var4_2 - var11_11.field_1350);
        if (var34_10 || var34_10) ** GOTO lbl6
        var15_15 = var6_3 / 2.0f;
        if (var34_10 || var34_10) ** GOTO lbl6
        var16_16 = (float)(var9_6 >> lv.ibzb("icnb", ibzg(int ), (int)197) & lv.ibzb("icnc", ibzg(int ), (int)198)) / lv.ibzb("icnd", icjz(int ), (int)199);
        if (var34_10 || var34_10) ** GOTO lbl6
        var17_17 = (float)(var9_6 >> lv.ibzb("icne", ibzg(int ), (int)200) & lv.ibzb("icnf", ibzg(int ), (int)201)) / lv.ibzb("icng", icjz(int ), (int)202);
        if (var34_10 || var34_10) ** GOTO lbl6
        var18_18 = (float)(var9_6 & lv.ibzb("icnh", ibzg(int ), (int)203)) / lv.ibzb("icni", icjz(int ), (int)204);
        if (var34_10 || var34_10) ** GOTO lbl6
        var19_19 = lv.BOX_CORNERS;
        if (var34_10 || var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[0], -var15_15, -var15_15, -var15_15);
        if (var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[1], var15_15, -var15_15, -var15_15);
        if (var34_10 || var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[2], var15_15, -var15_15, var15_15);
        if (var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[3], -var15_15, -var15_15, var15_15);
        if (var34_10 || var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[4], -var15_15, var15_15, -var15_15);
        if (var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[5], var15_15, var15_15, -var15_15);
        if (var34_10 || var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[6], var15_15, var15_15, var15_15);
        if (var34_10) ** GOTO lbl6
        lv.setCorner(var19_19[7], -var15_15, var15_15, var15_15);
        if (var34_10 || var34_10) ** GOTO lbl6
        var20_20 = (float)Math.cos(Math.toRadians(var7_4));
        if (var34_10 || var34_10) ** GOTO lbl6
        var21_21 = (float)Math.sin(Math.toRadians(var7_4));
        if (var34_10 || var34_10) ** GOTO lbl6
        var22_22 = (float)Math.cos(Math.toRadians(var8_5));
        if (var34_10 || var34_10) ** GOTO lbl6
        var23_23 = (float)Math.sin(Math.toRadians(var8_5));
        if (var34_10 || var34_10) ** GOTO lbl6
        var24_24 /* !! */  = var19_19;
        if (var34_10) ** GOTO lbl6
        var25_25 = var24_24 /* !! */ .length;
        if (var34_10) ** GOTO lbl6
        var26_26 = lv.ibzb("icnj", ibzg(int ), (int)205);
        if (var34_10) ** GOTO lbl6
        block100: while (true) {
            if (var34_10 || var34_10) ** GOTO lbl6
            if (var26_26 >= var25_25) ** GOTO lbl97
            if (var34_10) ** GOTO lbl6
            var27_27 = var24_24 /* !! */ [var26_26];
            if (var34_10 || var34_10) ** GOTO lbl6
            var28_28 = var27_27[0];
            if (var34_10) ** GOTO lbl6
            if (var35_9 /* !! */  == 0) ** GOTO lbl-1000
            switch (var35_9 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var34_10) ** GOTO lbl6
                    var29_31 = var27_27[1];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_34 = var27_27[2];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var31_35 = var28_28 * var20_20 - var30_34 * var21_21;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_36 = var28_28 * var21_21 + var30_34 * var20_20;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_28 = var31_35;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_34 = var32_36;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var33_37 = var29_31 * var22_22 - var30_34 * var23_23;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_36 = var29_31 * var23_23 + var30_34 * var22_22;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_31 = var33_37;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icnk", ibzg(int ), (int)206)] = var28_28 + var12_12;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icnl", ibzg(int ), (int)207)] = var29_31 + var13_13;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icnm", ibzg(int ), (int)208)] = var32_36 + var14_14;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var26_26;
                    if (var34_10) ** GOTO lbl6
                    if (!var36_8) continue block100;
                    throw null;
                }
lbl97:
                // 1 sources

                if (var34_10 || var34_10) ** GOTO lbl6
                var24_24 /* !! */  = lv.BOX_EDGES;
                if (var34_10) ** GOTO lbl6
                var25_25 = var24_24 /* !! */ .length;
                if (var34_10) ** GOTO lbl6
                var26_26 = lv.ibzb("icnn", ibzg(int ), (int)209);
                if (var34_10) ** GOTO lbl6
                do {
                    if (var34_10 || var34_10) ** GOTO lbl6
                    if (var26_26 >= var25_25) ** GOTO lbl120
                    if (var34_10) ** GOTO lbl6
                    var27_27 = var24_24 /* !! */ [var26_26];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_30 = var19_19[var27_27[0]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_33 = var19_19[var27_27[1]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    lv.addLine(var28_30[0], var28_30[1], var28_30[2], var29_33[0], var29_33[1], var29_33[2], var16_16, var17_17, var18_18, var10_7);
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var26_26;
                    if (var34_10) ** GOTO lbl6
                } while (!var36_8);
                throw null;
lbl120:
                // 1 sources

                if (!var34_10 && !var34_10) ** break;
                ** continue;
                return;
lbl123:
                // 5 sources

                case 0: {
                    var35_9 /* !! */  = (int)lv.ibzb("icno", ibzg(int ), (int)210);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl457
                }
                case 1: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnp", ibzg(int ), (int)211);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl311
                }
lbl133:
                // 2 sources

                case 2: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnq", ibzg(int ), (int)212);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl388
                }
lbl138:
                // 2 sources

                case 3: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnr", ibzg(int ), (int)213);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl344
                }
lbl143:
                // 2 sources

                case 4: {
                    var35_9 /* !! */  = (int)lv.ibzb("icns", ibzg(int ), (int)214);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
lbl148:
                // 2 sources

                case 5: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnt", ibzg(int ), (int)215);
                    if (!var36_8) ** GOTO lbl133
                    throw null;
                }
lbl152:
                // 2 sources

                case 6: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnu", ibzg(int ), (int)216);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
lbl157:
                // 5 sources

                case 7: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnv", ibzg(int ), (int)217);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl296
                }
lbl162:
                // 2 sources

                case 8: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnw", ibzg(int ), (int)218);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl384
                }
                case 9: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnx", ibzg(int ), (int)219);
                    if (var36_8) {
                        throw null;
                    }
                }
lbl171:
                // 4 sources

                case 10: {
                    var35_9 /* !! */  = (int)lv.ibzb("icny", ibzg(int ), (int)220);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl485
                }
lbl176:
                // 3 sources

                case 11: {
                    var35_9 /* !! */  = (int)lv.ibzb("icnz", ibzg(int ), (int)221);
                    if (!var36_8) ** GOTO lbl157
                    throw null;
                }
                case 12: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoa", ibzg(int ), (int)222);
                    if (!var36_8) ** GOTO lbl138
                    throw null;
                }
                case 13: {
                    var35_9 /* !! */  = (int)lv.ibzb("icob", ibzg(int ), (int)223);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl245
                }
lbl189:
                // 3 sources

                case 14: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoc", ibzg(int ), (int)224);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl376
                }
lbl194:
                // 2 sources

                case 15: {
                    var35_9 /* !! */  = (int)lv.ibzb("icod", ibzg(int ), (int)225);
                    if (!var36_8) ** GOTO lbl152
                    throw null;
                }
lbl198:
                // 2 sources

                case 16: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoe", ibzg(int ), (int)226);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl481
                }
                case 17: {
                    var35_9 /* !! */  = (int)lv.ibzb("icof", ibzg(int ), (int)227);
                    if (!var36_8) ** GOTO lbl123
                    throw null;
                }
                case 18: {
                    do {
                        var35_9 /* !! */  = (int)lv.ibzb("icog", ibzg(int ), (int)228);
                    } while (!var36_8);
                    throw null;
                }
lbl212:
                // 2 sources

                case 19: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoh", ibzg(int ), (int)229);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl269
                }
                case 20: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var35_9 /* !! */  = (int)lv.ibzb("icoi", ibzg(int ), (int)230);
                        if (!var36_8) ** GOTO lbl176
                        throw null;
                    }
                }
lbl222:
                // 2 sources

                case 21: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoj", ibzg(int ), (int)231);
                    if (!var36_8) ** GOTO lbl123
                    throw null;
                }
                case 22: {
                    var35_9 /* !! */  = (int)lv.ibzb("icok", ibzg(int ), (int)232);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
                case 23: {
                    var35_9 /* !! */  = (int)lv.ibzb("icol", ibzg(int ), (int)233);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl409
                }
lbl236:
                // 2 sources

                case 24: {
                    var35_9 /* !! */  = (int)lv.ibzb("icom", ibzg(int ), (int)234);
                    if (!var36_8) ** GOTO lbl194
                    throw null;
                }
lbl240:
                // 3 sources

                case 25: {
                    var35_9 /* !! */  = (int)lv.ibzb("icon", ibzg(int ), (int)235);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl372
                }
lbl245:
                // 2 sources

                case 26: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoo", ibzg(int ), (int)236);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
                case 27: {
                    var35_9 /* !! */  = (int)lv.ibzb("icop", ibzg(int ), (int)237);
                    if (!var36_8) ** GOTO lbl176
                    throw null;
                }
lbl254:
                // 2 sources

                case 28: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoq", ibzg(int ), (int)238);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl396
                }
                case 29: {
                    var35_9 /* !! */  = (int)lv.ibzb("icor", ibzg(int ), (int)239);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl413
                }
lbl264:
                // 3 sources

                case 30: {
                    var35_9 /* !! */  = (int)lv.ibzb("icos", ibzg(int ), (int)240);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl504
                }
lbl269:
                // 2 sources

                case 31: {
                    var35_9 /* !! */  = (int)lv.ibzb("icot", ibzg(int ), (int)241);
                    if (!var36_8) ** GOTO lbl264
                    throw null;
                }
lbl273:
                // 3 sources

                case 32: {
                    var35_9 /* !! */  = (int)lv.ibzb("icou", ibzg(int ), (int)242);
                    if (!var36_8) ** GOTO lbl171
                    throw null;
                }
lbl277:
                // 2 sources

                case 33: {
                    var35_9 /* !! */  = (int)lv.ibzb("icov", ibzg(int ), (int)243);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl485
                }
lbl282:
                // 2 sources

                case 34: {
                    var35_9 /* !! */  = (int)lv.ibzb("icow", ibzg(int ), (int)244);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
lbl287:
                // 2 sources

                case 35: {
                    var35_9 /* !! */  = (int)lv.ibzb("icox", ibzg(int ), (int)245);
                    if (!var36_8) ** GOTO lbl123
                    throw null;
                }
                case 36: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoy", ibzg(int ), (int)246);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
lbl296:
                // 2 sources

                case 37: {
                    var35_9 /* !! */  = (int)lv.ibzb("icoz", ibzg(int ), (int)247);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
lbl301:
                // 3 sources

                case 38: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpa", ibzg(int ), (int)248);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl521
                }
                case 39: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpb", ibzg(int ), (int)249);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl490
                }
lbl311:
                // 3 sources

                case 40: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpc", ibzg(int ), (int)250);
                    if (!var36_8) ** GOTO lbl162
                    throw null;
                }
                case 41: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpd", ibzg(int ), (int)251);
                    if (!var36_8) ** GOTO lbl236
                    throw null;
                }
lbl319:
                // 2 sources

                case 42: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpe", ibzg(int ), (int)252);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl465
                }
lbl324:
                // 2 sources

                case 43: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpf", ibzg(int ), (int)253);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl409
                }
                case 44: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpg", ibzg(int ), (int)254);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl481
                }
                case 45: {
                    var35_9 /* !! */  = (int)lv.ibzb("icph", ibzg(int ), (int)255);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl384
                }
lbl339:
                // 2 sources

                case 46: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpi", ibzg(int ), (int)256);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl545
                }
lbl344:
                // 3 sources

                case 47: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpj", ibzg(int ), (int)257);
                    if (!var36_8) ** GOTO lbl157
                    throw null;
                }
                case 48: {
                    do {
                        var35_9 /* !! */  = (int)lv.ibzb("icpk", ibzg(int ), (int)258);
                    } while (!var36_8);
                    throw null;
                }
                case 49: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpl", ibzg(int ), (int)259);
                    if (!var36_8) ** GOTO lbl189
                    throw null;
                }
                case 50: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpm", ibzg(int ), (int)260);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl513
                }
                case 51: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpn", ibzg(int ), (int)261);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
                case 52: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpo", ibzg(int ), (int)262);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl396
                }
lbl372:
                // 2 sources

                case 53: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpp", ibzg(int ), (int)263);
                    if (!var36_8) ** GOTO lbl189
                    throw null;
                }
lbl376:
                // 3 sources

                case 54: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpq", ibzg(int ), (int)264);
                    if (var36_8) {
                        throw null;
                    }
                }
lbl380:
                // 4 sources

                case 55: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpr", ibzg(int ), (int)265);
                    if (!var36_8) ** GOTO lbl282
                    throw null;
                }
lbl384:
                // 3 sources

                case 56: {
                    var35_9 /* !! */  = (int)lv.ibzb("icps", ibzg(int ), (int)266);
                    if (!var36_8) ** GOTO lbl254
                    throw null;
                }
lbl388:
                // 2 sources

                case 57: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpt", ibzg(int ), (int)267);
                    if (!var36_8) ** GOTO lbl157
                    throw null;
                }
                case 58: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpu", ibzg(int ), (int)268);
                    if (!var36_8) ** GOTO lbl264
                    throw null;
                }
lbl396:
                // 4 sources

                case 59: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpv", ibzg(int ), (int)269);
                    if (!var36_8) ** GOTO lbl287
                    throw null;
                }
lbl400:
                // 4 sources

                case 60: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpw", ibzg(int ), (int)270);
                    if (!var36_8) ** GOTO lbl311
                    throw null;
                }
                case 61: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpx", ibzg(int ), (int)271);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl495
                }
lbl409:
                // 3 sources

                case 62: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpy", ibzg(int ), (int)272);
                    if (!var36_8) ** GOTO lbl273
                    throw null;
                }
lbl413:
                // 2 sources

                case 63: {
                    var35_9 /* !! */  = (int)lv.ibzb("icpz", ibzg(int ), (int)273);
                    if (!var36_8) ** GOTO lbl324
                    throw null;
                }
                case 64: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqa", ibzg(int ), (int)274);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl432
                }
                case 65: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqb", ibzg(int ), (int)275);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl485
                }
lbl427:
                // 2 sources

                case 66: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqc", ibzg(int ), (int)276);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl508
                }
lbl432:
                // 2 sources

                case 67: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqd", ibzg(int ), (int)277);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl469
                }
lbl437:
                // 2 sources

                case 68: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqe", ibzg(int ), (int)278);
                    if (!var36_8) ** GOTO lbl344
                    throw null;
                }
lbl441:
                // 2 sources

                case 69: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqf", ibzg(int ), (int)279);
                    if (!var36_8) ** GOTO lbl198
                    throw null;
                }
lbl445:
                // 2 sources

                case 70: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqg", ibzg(int ), (int)280);
                    if (!var36_8) ** GOTO lbl143
                    throw null;
                }
                case 71: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqh", ibzg(int ), (int)281);
                    if (!var36_8) ** GOTO lbl240
                    throw null;
                }
                case 72: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqi", ibzg(int ), (int)282);
                    if (!var36_8) ** GOTO lbl437
                    throw null;
                }
lbl457:
                // 3 sources

                case 73: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqj", ibzg(int ), (int)283);
                    if (!var36_8) ** GOTO lbl123
                    throw null;
                }
lbl461:
                // 2 sources

                case 74: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqk", ibzg(int ), (int)284);
                    if (!var36_8) ** GOTO lbl380
                    throw null;
                }
lbl465:
                // 2 sources

                case 75: {
                    var35_9 /* !! */  = (int)lv.ibzb("icql", ibzg(int ), (int)285);
                    if (!var36_8) ** GOTO lbl319
                    throw null;
                }
lbl469:
                // 2 sources

                case 76: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqm", ibzg(int ), (int)286);
                    if (!var36_8) ** GOTO lbl301
                    throw null;
                }
                case 77: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqn", ibzg(int ), (int)287);
                    if (!var36_8) ** GOTO lbl222
                    throw null;
                }
lbl477:
                // 3 sources

                case 78: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqo", ibzg(int ), (int)288);
                    if (!var36_8) ** GOTO lbl240
                    throw null;
                }
lbl481:
                // 3 sources

                case 79: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqp", ibzg(int ), (int)289);
                    if (!var36_8) ** GOTO lbl148
                    throw null;
                }
lbl485:
                // 4 sources

                case 80: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqq", ibzg(int ), (int)290);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl541
                }
lbl490:
                // 2 sources

                case 81: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqr", ibzg(int ), (int)291);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl533
                }
lbl495:
                // 2 sources

                case 82: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqs", ibzg(int ), (int)292);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl529
                }
lbl500:
                // 2 sources

                case 83: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqt", ibzg(int ), (int)293);
                    if (!var36_8) ** GOTO lbl445
                    throw null;
                }
lbl504:
                // 2 sources

                case 84: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqu", ibzg(int ), (int)294);
                    if (!var36_8) ** GOTO lbl461
                    throw null;
                }
lbl508:
                // 2 sources

                case 85: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqv", ibzg(int ), (int)295);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl545
                }
lbl513:
                // 2 sources

                case 86: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqw", ibzg(int ), (int)296);
                    if (!var36_8) ** GOTO lbl396
                    throw null;
                }
                case 87: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqx", ibzg(int ), (int)297);
                    if (!var36_8) ** GOTO lbl277
                    throw null;
                }
lbl521:
                // 2 sources

                case 88: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqy", ibzg(int ), (int)298);
                    if (!var36_8) ** GOTO lbl500
                    throw null;
                }
                case 89: {
                    var35_9 /* !! */  = (int)lv.ibzb("icqz", ibzg(int ), (int)299);
                    if (!var36_8) ** GOTO lbl212
                    throw null;
                }
lbl529:
                // 2 sources

                case 90: {
                    var35_9 /* !! */  = (int)lv.ibzb("icra", ibzg(int ), (int)300);
                    if (!var36_8) ** GOTO lbl376
                    throw null;
                }
lbl533:
                // 2 sources

                case 91: {
                    var35_9 /* !! */  = (int)lv.ibzb("icrb", ibzg(int ), (int)301);
                    if (!var36_8) ** GOTO lbl441
                    throw null;
                }
                case 92: {
                    var35_9 /* !! */  = (int)lv.ibzb("icrc", ibzg(int ), (int)302);
                    if (!var36_8) ** GOTO lbl427
                    throw null;
                }
lbl541:
                // 2 sources

                case 93: {
                    var35_9 /* !! */  = (int)lv.ibzb("icrd", ibzg(int ), (int)303);
                    if (!var36_8) ** GOTO lbl273
                    throw null;
                }
lbl545:
                // 3 sources

                case 94: {
                    var35_9 /* !! */  = (int)lv.ibzb("icre", ibzg(int ), (int)304);
                    if (!var36_8) ** GOTO lbl457
                    throw null;
                }
lbl549:
                // 2 sources

                case 95: {
                    var35_9 /* !! */  = (int)lv.ibzb("icrf", ibzg(int ), (int)305);
                    if (!var36_8) ** GOTO lbl157
                    throw null;
                }
                case 96: 
            }
            break;
        }
        var35_9 /* !! */  = (int)lv.ibzb("icrg", ibzg(int ), (int)306);
        ** while (!var36_8)
lbl556:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idtx() {
        lv.ibyz[0] = -4072894680023729589L;
        lv.ibyz[1] = -5102546380927926213L;
        lv.ibyz[2] = -6183144835601434900L;
        lv.ibyz[3] = -2599242116862608183L;
        lv.ibyz[4] = -1734337846303215741L;
        lv.ibyz[5] = 776869791242385295L;
        lv.ibyz[6] = 8774015937661636013L;
        lv.ibyz[7] = 3596295435599555611L;
        lv.ibyz[8] = 6576623554723874918L;
        lv.ibyz[9] = -6254691691018419790L;
        lv.ibyz[10] = -1596546644279001525L;
        lv.ibyz[11] = 3435562586485954779L;
        lv.ibyz[12] = 9126470622089508522L;
        lv.ibyz[13] = 6173320503779688412L;
        lv.ibyz[14] = -2424232692487518488L;
        lv.ibyz[15] = -9212177001897408896L;
        lv.ibyz[16] = 6878901384520336537L;
        lv.ibyz[17] = -3714288325376966324L;
        lv.ibyz[18] = 3275214712540887662L;
        lv.ibyz[19] = -1261946636671185034L;
        lv.ibyz[20] = -3604384002962444324L;
        lv.ibyz[21] = -7637484360764031209L;
        lv.ibyz[22] = 8671165026790459744L;
        lv.ibyz[23] = 5978511036926608444L;
        lv.ibyz[24] = -3244829350656261957L;
        lv.ibyz[25] = -66440671390676175L;
        lv.ibyz[26] = -5079903203962563444L;
        lv.ibyz[27] = 4754721688522878254L;
        lv.ibyz[28] = 5465724415179988771L;
        lv.ibyz[29] = -3931381085122064361L;
        lv.ibyz[30] = -315960234432758103L;
        lv.ibyz[31] = -8353907988803351130L;
        lv.ibyz[32] = 5710054389901168855L;
        lv.ibyz[33] = -2522004170923089107L;
        lv.ibyz[34] = -2805700538340785169L;
        lv.ibyz[35] = 6800841312329176360L;
        lv.ibyz[36] = 6962911748696611087L;
        lv.ibyz[37] = 5125351936565397887L;
        lv.ibyz[38] = -3819878537363224683L;
        lv.ibyz[39] = 1025722901594309319L;
        lv.ibyz[40] = 6533153391952077088L;
        lv.ibyz[41] = 7091990932171638297L;
        lv.ibyz[42] = -3924915495687892748L;
        lv.ibyz[43] = -1618367898193717936L;
        lv.ibyz[44] = 8786408344963422816L;
        lv.ibyz[45] = -7669614420572537496L;
        lv.ibyz[46] = 7576091451205615352L;
        lv.ibyz[47] = -7036806608932972874L;
        lv.ibyz[48] = -5567871252055489268L;
        lv.ibyz[49] = -1963136745327031676L;
        lv.ibyz[50] = -6381237264728801096L;
        lv.ibyz[51] = 3881076456035615391L;
        lv.ibyz[52] = 8638566014173559298L;
        lv.ibyz[53] = 1100143500428468574L;
        lv.ibyz[54] = 6094310027682208063L;
        lv.ibyz[55] = 9046498887923279033L;
        lv.ibyz[56] = 4782795876494069831L;
        lv.ibyz[57] = 6666170072751940706L;
        lv.ibyz[58] = -4081693729378149944L;
        lv.ibyz[59] = 3397499286019389154L;
        lv.ibyz[60] = -4820263643835107755L;
        lv.ibyz[61] = -5838500174922561653L;
        lv.ibyz[62] = -1145145469502480777L;
        lv.ibyz[63] = 5458524370292203137L;
        lv.ibyz[64] = 4621615600723696426L;
        lv.ibyz[65] = 2567156789829474533L;
        lv.ibyz[66] = -5120598656600516131L;
        lv.ibyz[67] = -3133472688179636938L;
        lv.ibyz[68] = 5125522149052779432L;
        lv.ibyz[69] = -6040283447459988828L;
        lv.ibyz[70] = 2370749065758129929L;
        lv.ibyz[71] = -3070307062094316346L;
        lv.ibyz[72] = -3331731256056926688L;
        lv.ibyz[73] = 7418012354229470664L;
        lv.ibyz[74] = -154058453540465316L;
        lv.ibyz[75] = 7316345951590901199L;
        lv.ibyz[76] = 7379006396485512740L;
        lv.ibyz[77] = 3096363108473476138L;
        lv.ibyz[78] = 7400413224817334413L;
        lv.ibyz[79] = 8520392194849039135L;
        lv.ibyz[80] = -6164289745569007742L;
        lv.ibyz[81] = 6722727272191170267L;
        lv.ibyz[82] = 4113622881090368315L;
        lv.ibyz[83] = 1467417910837337612L;
        lv.ibyz[84] = -4811991872930096477L;
        lv.ibyz[85] = -2489946633182534695L;
        lv.ibyz[86] = 7817791636977501533L;
        lv.ibyz[87] = 7771023347633696700L;
        lv.ibyz[88] = -4576583191715973366L;
        lv.ibyz[89] = -5184227983266366990L;
        lv.ibyz[90] = 4013663555331695036L;
        lv.ibyz[91] = 6618106573311958725L;
        lv.ibyz[92] = -1174426320860063899L;
        lv.ibyz[93] = -255043863601221765L;
        lv.ibyz[94] = -1620960343648659653L;
        lv.ibyz[95] = -2076044411695905257L;
        lv.ibyz[96] = -4855648653495402693L;
        lv.ibyz[97] = -5499168429999571759L;
        lv.ibyz[98] = 3827861208075170386L;
        lv.ibyz[99] = -120386534451637483L;
    }

    private static /* synthetic */ long ibyy(int n2) {
        return ibyz[n2] ^ ibza[n2];
    }

    private static /* synthetic */ void idtl() {
        lv.ibzh[400] = 1461624748;
        lv.ibzh[401] = 709991284;
        lv.ibzh[402] = 887438553;
        lv.ibzh[403] = -1434952522;
        lv.ibzh[404] = -898693747;
        lv.ibzh[405] = -1968574701;
        lv.ibzh[406] = -394471846;
        lv.ibzh[407] = 2097661901;
        lv.ibzh[408] = 698142945;
        lv.ibzh[409] = -1690632916;
        lv.ibzh[410] = -337792119;
        lv.ibzh[411] = 591866722;
        lv.ibzh[412] = 1825539705;
        lv.ibzh[413] = 2136923569;
        lv.ibzh[414] = -1815451533;
        lv.ibzh[415] = -1645572948;
        lv.ibzh[416] = -1775656284;
        lv.ibzh[417] = 1415165819;
        lv.ibzh[418] = -1341707170;
        lv.ibzh[419] = 123912176;
        lv.ibzh[420] = 707628114;
        lv.ibzh[421] = -1279493910;
        lv.ibzh[422] = -1110274047;
        lv.ibzh[423] = 318295394;
        lv.ibzh[424] = 1169982307;
        lv.ibzh[425] = -314167970;
        lv.ibzh[426] = 977398924;
        lv.ibzh[427] = -652502120;
        lv.ibzh[428] = -439494102;
        lv.ibzh[429] = -1197099072;
        lv.ibzh[430] = -2076573995;
        lv.ibzh[431] = 715205910;
        lv.ibzh[432] = -401729992;
        lv.ibzh[433] = 492173076;
        lv.ibzh[434] = 474966069;
        lv.ibzh[435] = 888088432;
        lv.ibzh[436] = -696599012;
        lv.ibzh[437] = 1776980934;
        lv.ibzh[438] = -43907000;
        lv.ibzh[439] = 2048163057;
        lv.ibzh[440] = -603392586;
        lv.ibzh[441] = 1556348858;
        lv.ibzh[442] = -1367253544;
        lv.ibzh[443] = 739795696;
        lv.ibzh[444] = -894289925;
        lv.ibzh[445] = -360355144;
        lv.ibzh[446] = 1826057153;
        lv.ibzh[447] = 1751184200;
        lv.ibzh[448] = -182207016;
        lv.ibzh[449] = 856665771;
        lv.ibzh[450] = -163918702;
        lv.ibzh[451] = -782883532;
        lv.ibzh[452] = -1392349091;
        lv.ibzh[453] = 1349547533;
        lv.ibzh[454] = -1713377058;
        lv.ibzh[455] = -1349782284;
        lv.ibzh[456] = 1937665483;
        lv.ibzh[457] = 1550132946;
        lv.ibzh[458] = -5458356;
        lv.ibzh[459] = 1393093888;
        lv.ibzh[460] = -1576107899;
        lv.ibzh[461] = -1257943933;
        lv.ibzh[462] = -1087320149;
        lv.ibzh[463] = 2129423231;
        lv.ibzh[464] = 1708987717;
        lv.ibzh[465] = -1742696133;
        lv.ibzh[466] = 1215869150;
        lv.ibzh[467] = -2146810973;
        lv.ibzh[468] = 250971811;
        lv.ibzh[469] = 1259895325;
        lv.ibzh[470] = -1575490223;
        lv.ibzh[471] = 1346875527;
        lv.ibzh[472] = -1244015973;
        lv.ibzh[473] = 1656650844;
        lv.ibzh[474] = 606292129;
        lv.ibzh[475] = 517974308;
        lv.ibzh[476] = 873860363;
        lv.ibzh[477] = 1346576607;
        lv.ibzh[478] = 513925997;
        lv.ibzh[479] = 1869809090;
        lv.ibzh[480] = 266871417;
        lv.ibzh[481] = 365642727;
        lv.ibzh[482] = 1988113982;
        lv.ibzh[483] = 288037094;
        lv.ibzh[484] = 578363905;
        lv.ibzh[485] = -1829774209;
        lv.ibzh[486] = -1149084818;
        lv.ibzh[487] = 1208928807;
        lv.ibzh[488] = -1671530295;
        lv.ibzh[489] = 1385768252;
        lv.ibzh[490] = 1718340397;
        lv.ibzh[491] = 739788654;
        lv.ibzh[492] = -110755639;
        lv.ibzh[493] = 942979612;
        lv.ibzh[494] = -1009023145;
        lv.ibzh[495] = 2088816280;
        lv.ibzh[496] = 964869895;
        lv.ibzh[497] = -1692344001;
        lv.ibzh[498] = -1231861848;
        lv.ibzh[499] = 1346982894;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void setCorner(float[] var0, float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("idhc", ibyy(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lv.ibzb("idhd", ibzg(int ), (int)539)) break;
            v0 /* !! */  = (long)lv.ibzb("idhe", ibzg(int ), (int)540);
        }
        var6_4 = lv.c;
        v1 /* !! */  = lv.pk;
        if (true) ** GOTO lbl12
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - lv.ibzb("idhf", ibyy(int ), (int)197));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1626381651: {
                    v2 = lv.ibzb("idhg", ibyy(int ), (int)198);
                    continue block7;
                }
                case -450579769: {
                    break block7;
                }
                case 73238629: {
                    v2 = lv.ibzb("idhh", ibyy(int ), (int)199);
                    continue block7;
                }
                case 1116748619: {
                    v2 = lv.ibzb("idhi", ibyy(int ), (int)200);
                    continue block7;
                }
            }
            break;
        }
        var5_5 = lv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("idhj", ibyy(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == lv.ibzb("idhk", ibzg(int ), (int)541)) break;
            v3 /* !! */  = (long)lv.ibzb("idhl", ibzg(int ), (int)542);
        }
        var4_6 = lv.a;
        if (var6_4) {
            throw null;
lbl34:
            // 4 sources

            return;
        }
        if (var4_6 || var4_6) ** GOTO lbl34
        var0[0] = var1_1;
        if (var4_6 || var4_6) ** GOTO lbl34
        var0[1] = var2_2;
        if (var4_6 || var4_6) ** GOTO lbl34
        var0[2] = var3_3;
        ** while (var4_6 || var4_6)
lbl43:
        // 1 sources

    }

    private static /* synthetic */ void idtu() {
        lv.ibzi[500] = 43802584;
        lv.ibzi[501] = -1478910573;
        lv.ibzi[502] = 246141739;
        lv.ibzi[503] = 745562576;
        lv.ibzi[504] = 1743272126;
        lv.ibzi[505] = -2140688824;
        lv.ibzi[506] = 1742750033;
        lv.ibzi[507] = -339647741;
        lv.ibzi[508] = 1102746736;
        lv.ibzi[509] = 1920292884;
        lv.ibzi[510] = -1378380908;
        lv.ibzi[511] = 2129106116;
        lv.ibzi[512] = 4119855;
        lv.ibzi[513] = -120218244;
        lv.ibzi[514] = -772811956;
        lv.ibzi[515] = 197278862;
        lv.ibzi[516] = 1641732978;
        lv.ibzi[517] = -495100219;
        lv.ibzi[518] = -1566634466;
        lv.ibzi[519] = -1567417884;
        lv.ibzi[520] = -385706805;
        lv.ibzi[521] = 732489652;
        lv.ibzi[522] = 948920493;
        lv.ibzi[523] = 946338355;
        lv.ibzi[524] = -1786963566;
        lv.ibzi[525] = 2097132593;
        lv.ibzi[526] = -1612389506;
        lv.ibzi[527] = 903555834;
        lv.ibzi[528] = -394181000;
        lv.ibzi[529] = 335546877;
        lv.ibzi[530] = -1809939613;
        lv.ibzi[531] = 52060047;
        lv.ibzi[532] = -1886793242;
        lv.ibzi[533] = -1729146308;
        lv.ibzi[534] = -2054637916;
        lv.ibzi[535] = -1938124734;
        lv.ibzi[536] = -1628068269;
        lv.ibzi[537] = 1136133938;
        lv.ibzi[538] = -670445189;
        lv.ibzi[539] = -1550697903;
        lv.ibzi[540] = 1375382981;
        lv.ibzi[541] = -1306146911;
        lv.ibzi[542] = -963080374;
        lv.ibzi[543] = -364692194;
        lv.ibzi[544] = 1052907839;
        lv.ibzi[545] = 1188651366;
        lv.ibzi[546] = -583952292;
        lv.ibzi[547] = -480104817;
        lv.ibzi[548] = -93939021;
        lv.ibzi[549] = 942086117;
        lv.ibzi[550] = -703512099;
        lv.ibzi[551] = 359123453;
        lv.ibzi[552] = 1272248815;
        lv.ibzi[553] = 1717291987;
        lv.ibzi[554] = -2001266878;
        lv.ibzi[555] = 824493723;
        lv.ibzi[556] = 301167521;
        lv.ibzi[557] = -229108183;
        lv.ibzi[558] = 1367370382;
        lv.ibzi[559] = 1070275098;
        lv.ibzi[560] = -2095559234;
        lv.ibzi[561] = 1034428456;
        lv.ibzi[562] = 596829703;
        lv.ibzi[563] = 1822800460;
        lv.ibzi[564] = -479157684;
        lv.ibzi[565] = -1041074275;
        lv.ibzi[566] = 2087847212;
        lv.ibzi[567] = 525882635;
        lv.ibzi[568] = 797475710;
        lv.ibzi[569] = -1748409498;
        lv.ibzi[570] = 1052682469;
        lv.ibzi[571] = -158850472;
        lv.ibzi[572] = 1948830977;
        lv.ibzi[573] = -73499596;
        lv.ibzi[574] = -169919748;
        lv.ibzi[575] = -314755898;
        lv.ibzi[576] = -80726380;
        lv.ibzi[577] = -447705711;
        lv.ibzi[578] = -1119742772;
        lv.ibzi[579] = 1079897112;
        lv.ibzi[580] = -783123490;
        lv.ibzi[581] = 1204290340;
        lv.ibzi[582] = -1831658185;
        lv.ibzi[583] = 1805413929;
        lv.ibzi[584] = -66998917;
        lv.ibzi[585] = -1164548556;
        lv.ibzi[586] = 140038620;
        lv.ibzi[587] = -666351092;
        lv.ibzi[588] = -562888873;
        lv.ibzi[589] = -607015062;
        lv.ibzi[590] = 1375481737;
        lv.ibzi[591] = 183806323;
        lv.ibzi[592] = 972138559;
        lv.ibzi[593] = 1554804954;
        lv.ibzi[594] = -1937625618;
        lv.ibzi[595] = 1359328340;
        lv.ibzi[596] = 768059060;
        lv.ibzi[597] = 1675107396;
        lv.ibzi[598] = -1426799980;
        lv.ibzi[599] = 457050825;
    }

    private static /* synthetic */ void idtn() {
        lv.ibzh[600] = -148013260;
        lv.ibzh[601] = 1036970452;
        lv.ibzh[602] = -454779109;
        lv.ibzh[603] = 1888450833;
        lv.ibzh[604] = -1624291650;
        lv.ibzh[605] = 2029461890;
        lv.ibzh[606] = 1263279731;
        lv.ibzh[607] = -1291826525;
        lv.ibzh[608] = -2071556012;
        lv.ibzh[609] = -764817027;
        lv.ibzh[610] = -1649470012;
        lv.ibzh[611] = 1906892207;
        lv.ibzh[612] = -682750136;
        lv.ibzh[613] = 1279469889;
        lv.ibzh[614] = -895845108;
        lv.ibzh[615] = 1021533869;
        lv.ibzh[616] = -714276743;
        lv.ibzh[617] = 2013465407;
        lv.ibzh[618] = 560078988;
        lv.ibzh[619] = -1895707221;
        lv.ibzh[620] = 1575334864;
        lv.ibzh[621] = 1122537854;
        lv.ibzh[622] = -30812925;
        lv.ibzh[623] = 1786556739;
        lv.ibzh[624] = 1477690976;
        lv.ibzh[625] = 1067157254;
        lv.ibzh[626] = 942333081;
        lv.ibzh[627] = -2133910374;
        lv.ibzh[628] = 1469833140;
        lv.ibzh[629] = -1675418643;
        lv.ibzh[630] = 1543336959;
        lv.ibzh[631] = -1587876940;
        lv.ibzh[632] = -812119252;
        lv.ibzh[633] = 1297711262;
        lv.ibzh[634] = 2075769338;
        lv.ibzh[635] = 268064529;
        lv.ibzh[636] = 1554578827;
        lv.ibzh[637] = -570451851;
        lv.ibzh[638] = 1279420450;
        lv.ibzh[639] = -711832473;
        lv.ibzh[640] = 256236004;
        lv.ibzh[641] = 663603668;
        lv.ibzh[642] = 285888413;
        lv.ibzh[643] = -1173094409;
        lv.ibzh[644] = 821405282;
        lv.ibzh[645] = 1826251610;
        lv.ibzh[646] = 1752499971;
        lv.ibzh[647] = 474533588;
        lv.ibzh[648] = -141441092;
        lv.ibzh[649] = -1754051788;
        lv.ibzh[650] = -354870524;
        lv.ibzh[651] = -1920160309;
        lv.ibzh[652] = 1948767362;
        lv.ibzh[653] = 263810716;
        lv.ibzh[654] = -348172910;
        lv.ibzh[655] = 1530295659;
        lv.ibzh[656] = -1076304384;
        lv.ibzh[657] = -1527228656;
        lv.ibzh[658] = 1343886679;
        lv.ibzh[659] = 546248124;
        lv.ibzh[660] = -1774507836;
        lv.ibzh[661] = 2054120704;
        lv.ibzh[662] = -17218265;
        lv.ibzh[663] = -111681912;
        lv.ibzh[664] = 1248273583;
        lv.ibzh[665] = -434438264;
        lv.ibzh[666] = 994444315;
        lv.ibzh[667] = -1719814918;
        lv.ibzh[668] = 4275422;
        lv.ibzh[669] = 122195062;
        lv.ibzh[670] = -219599010;
        lv.ibzh[671] = -254660937;
        lv.ibzh[672] = -472578002;
        lv.ibzh[673] = -302217394;
        lv.ibzh[674] = 315422494;
        lv.ibzh[675] = 1734538561;
        lv.ibzh[676] = -548209752;
        lv.ibzh[677] = 371246297;
        lv.ibzh[678] = -1437757110;
        lv.ibzh[679] = 696131355;
        lv.ibzh[680] = 1990369238;
        lv.ibzh[681] = 1097818423;
        lv.ibzh[682] = -830064436;
        lv.ibzh[683] = 1122099824;
        lv.ibzh[684] = -1477742410;
        lv.ibzh[685] = -1346255013;
        lv.ibzh[686] = -940382509;
        lv.ibzh[687] = 526313451;
        lv.ibzh[688] = 1371651843;
        lv.ibzh[689] = -1093009005;
        lv.ibzh[690] = 1440108312;
        lv.ibzh[691] = -1615849649;
        lv.ibzh[692] = -128447359;
        lv.ibzh[693] = -665257357;
        lv.ibzh[694] = -621547803;
        lv.ibzh[695] = 269991409;
        lv.ibzh[696] = 1189292485;
        lv.ibzh[697] = 560529845;
        lv.ibzh[698] = -368916697;
        lv.ibzh[699] = -774665772;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void begin(boolean var0) {
        v0 /* !! */  = lv.pk;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(lv.ibzb("icho", ibyy(int ), (int)122) - lv.ibzb("ichn", ibyy(int ), (int)121));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -491756834: {
                    continue block57;
                }
                case -450579769: {
                    break block57;
                }
            }
            break;
        }
        var3_1 = lv.c;
        v1 /* !! */  = lv.pk;
        if (true) ** GOTO lbl15
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - lv.ibzb("ichp", ibyy(int ), (int)123));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1688972622: {
                    v2 = lv.ibzb("ichq", ibyy(int ), (int)124);
                    continue block58;
                }
                case -450579769: {
                    break block58;
                }
                case 1426434535: {
                    v2 = lv.ibzb("ichr", ibyy(int ), (int)125);
                    continue block58;
                }
            }
            break;
        }
        var2_2 /* !! */  = lv.b;
        v3 /* !! */  = lv.pk;
        if (true) ** GOTO lbl29
        block59: while (true) {
            v3 /* !! */  = (long)(v4 - lv.ibzb("ichs", ibyy(int ), (int)126));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1908899376: {
                    v4 = lv.ibzb("icht", ibyy(int ), (int)127);
                    continue block59;
                }
                case -450579769: {
                    break block59;
                }
                case -261244088: {
                    v4 = lv.ibzb("ichu", ibyy(int ), (int)128);
                    continue block59;
                }
            }
            break;
        }
        var1_3 = lv.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl44:
                    // 7 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                v5 /* !! */  = lv.pk;
                if (true) ** GOTO lbl51
                block61: while (true) {
                    v5 /* !! */  = (long)(v6 - lv.ibzb("ichv", ibyy(int ), (int)129));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -953245232: {
                            v6 = lv.ibzb("ichw", ibyy(int ), (int)130);
                            continue block61;
                        }
                        case -872105454: {
                            v6 = lv.ibzb("ichx", ibyy(int ), (int)131);
                            continue block61;
                        }
                        case -617011881: {
                            v6 = lv.ibzb("ichy", ibyy(int ), (int)132);
                            continue block61;
                        }
                        case -450579769: {
                            break block61;
                        }
                    }
                    break;
                }
                if (lv.pipeline != null) ** GOTO lbl72
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("ichz", ibyy(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == lv.ibzb("icia", ibzg(int ), (int)95)) break;
                    v7 /* !! */  = (long)lv.ibzb("icib", ibzg(int ), (int)96);
                }
                lv.init();
                if (var1_3) ** GOTO lbl44
lbl72:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl44
                v8 = lv.ibzb("icic", ibzg(int ), (int)97);
                v9 /* !! */  = lv.pk;
                if (true) ** GOTO lbl78
                block63: while (true) {
                    v9 /* !! */  = (long)(lv.ibzb("icie", ibyy(int ), (int)135) - lv.ibzb("icid", ibyy(int ), (int)134));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1131492521: {
                            continue block63;
                        }
                        case -450579769: {
                            break block63;
                        }
                    }
                    break;
                }
                lv.vertexCount = (int)v8;
                if (var1_3 || var1_3) ** GOTO lbl44
                v10 /* !! */  = lv.pk;
                if (true) ** GOTO lbl89
                block64: while (true) {
                    v10 /* !! */  = (long)(v11 - lv.ibzb("icif", ibyy(int ), (int)136));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -450579769: {
                            break block64;
                        }
                        case -180850250: {
                            v11 = lv.ibzb("icig", ibyy(int ), (int)137);
                            continue block64;
                        }
                        case 2015113694: {
                            v11 = lv.ibzb("icih", ibyy(int ), (int)138);
                            continue block64;
                        }
                    }
                    break;
                }
                v12 /* !! */  = lv.pk;
                if (true) ** GOTO lbl102
                block65: while (true) {
                    v12 /* !! */  = (long)(v13 - lv.ibzb("icii", ibyy(int ), (int)139));
lbl102:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1183010187: {
                            v13 = lv.ibzb("icij", ibyy(int ), (int)140);
                            continue block65;
                        }
                        case -450579769: {
                            break block65;
                        }
                        case -258622000: {
                            v13 = lv.ibzb("icik", ibyy(int ), (int)141);
                            continue block65;
                        }
                        case 1739861200: {
                            v13 = lv.ibzb("icil", ibyy(int ), (int)142);
                            continue block65;
                        }
                    }
                    break;
                }
                v14 /* !! */  = lv.pk;
                if (true) ** GOTO lbl118
                block66: while (true) {
                    v14 /* !! */  = (long)(v15 - lv.ibzb("icim", ibyy(int ), (int)143));
lbl118:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -947519132: {
                            v15 = lv.ibzb("icin", ibyy(int ), (int)144);
                            continue block66;
                        }
                        case -450579769: {
                            break block66;
                        }
                        case 1381076789: {
                            v15 = lv.ibzb("icio", ibyy(int ), (int)145);
                            continue block66;
                        }
                    }
                    break;
                }
                v16 = lv.combinedMatrix.set((Matrix4fc)lv.projectionMatrix);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("icip", ibyy(int ), (int)146)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == lv.ibzb("iciq", ibzg(int ), (int)98)) break;
                    v17 /* !! */  = (long)lv.ibzb("icir", ibzg(int ), (int)99);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("icis", ibyy(int ), (int)147)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == lv.ibzb("icit", ibzg(int ), (int)100)) break;
                    v18 /* !! */  = (long)lv.ibzb("iciu", ibzg(int ), (int)101);
                }
                v16.mul((Matrix4fc)lv.viewMatrix);
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = lv.pk - lv.ibzb("iciv", ibyy(int ), (int)148)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == lv.ibzb("iciw", ibzg(int ), (int)102)) break;
                    v19 /* !! */  = (long)lv.ibzb("icix", ibzg(int ), (int)103);
                }
                lv.ignoreDepth = var0;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl149:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)lv.ibzb("iciy", ibzg(int ), (int)104);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl154:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)lv.ibzb("iciz", ibzg(int ), (int)105);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 2: {
                var2_2 /* !! */  = (int)lv.ibzb("icja", ibzg(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 3: {
                var2_2 /* !! */  = (int)lv.ibzb("icjb", ibzg(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 4: {
                var2_2 /* !! */  = (int)lv.ibzb("icjc", ibzg(int ), (int)108);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl174:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)lv.ibzb("icjd", ibzg(int ), (int)109);
                    if (!var3_1) ** GOTO lbl149
                    throw null;
                }
            }
lbl179:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)lv.ibzb("icje", ibzg(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 7: {
                var2_2 /* !! */  = (int)lv.ibzb("icjf", ibzg(int ), (int)111);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
lbl188:
            // 2 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)lv.ibzb("icjg", ibzg(int ), (int)112);
                } while (!var3_1);
                throw null;
            }
lbl193:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)lv.ibzb("icjh", ibzg(int ), (int)113);
                if (!var3_1) ** GOTO lbl154
                throw null;
            }
lbl197:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)lv.ibzb("icji", ibzg(int ), (int)114);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 11: {
                var2_2 /* !! */  = (int)lv.ibzb("icjj", ibzg(int ), (int)115);
                if (!var3_1) ** GOTO lbl179
                throw null;
            }
lbl206:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)lv.ibzb("icjk", ibzg(int ), (int)116);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)lv.ibzb("icjl", ibzg(int ), (int)117);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)lv.ibzb("icjm", ibzg(int ), (int)118);
        ** while (!var3_1)
lbl217:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void rotatedDiamond(double var0, double var2_1, double var4_2, float var6_3, float var7_4, float var8_5, int var9_6, float var10_7) {
        var36_8 = lv.c;
        var35_9 /* !! */  = lv.b;
        var34_10 = lv.a;
        if (var36_8) {
            throw null;
lbl6:
            // 52 sources

            return;
        }
        if (var34_10 || var34_10) ** GOTO lbl6
        var11_11 = lv.getCameraPos();
        if (var34_10 || var34_10) ** GOTO lbl6
        var12_12 = (float)(var0 - var11_11.field_1352);
        if (var34_10 || var34_10) ** GOTO lbl6
        var13_13 = (float)(var2_1 - var11_11.field_1351);
        if (var34_10 || var34_10) ** GOTO lbl6
        var14_14 = (float)(var4_2 - var11_11.field_1350);
        if (var34_10 || var34_10) ** GOTO lbl6
        var15_15 = var6_3 / 2.0f;
        if (var34_10 || var34_10) ** GOTO lbl6
        var16_16 = (float)(var9_6 >> lv.ibzb("ictz", ibzg(int ), (int)377) & lv.ibzb("icua", ibzg(int ), (int)378)) / lv.ibzb("icub", icjz(int ), (int)379);
        if (var34_10 || var34_10) ** GOTO lbl6
        var17_17 = (float)(var9_6 >> lv.ibzb("icuc", ibzg(int ), (int)380) & lv.ibzb("icud", ibzg(int ), (int)381)) / lv.ibzb("icue", icjz(int ), (int)382);
        if (var34_10 || var34_10) ** GOTO lbl6
        var18_18 = (float)(var9_6 & lv.ibzb("icuf", ibzg(int ), (int)383)) / lv.ibzb("icug", icjz(int ), (int)384);
        if (var34_10 || var34_10) ** GOTO lbl6
        if (var35_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var35_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var19_19 = lv.DIAMOND_CORNERS;
                if (var34_10 || var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[0], 0.0f, var15_15, 0.0f);
                if (var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[1], 0.0f, -var15_15, 0.0f);
                if (var34_10 || var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[2], 0.0f, 0.0f, var15_15);
                if (var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[3], 0.0f, 0.0f, -var15_15);
                if (var34_10 || var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[4], -var15_15, 0.0f, 0.0f);
                if (var34_10) ** GOTO lbl6
                lv.setCorner(var19_19[5], var15_15, 0.0f, 0.0f);
                if (var34_10 || var34_10) ** GOTO lbl6
                var20_20 = (float)Math.cos(Math.toRadians(var7_4));
                if (var34_10 || var34_10) ** GOTO lbl6
                var21_21 = (float)Math.sin(Math.toRadians(var7_4));
                if (var34_10 || var34_10) ** GOTO lbl6
                var22_22 = (float)Math.cos(Math.toRadians(var8_5));
                if (var34_10 || var34_10) ** GOTO lbl6
                var23_23 = (float)Math.sin(Math.toRadians(var8_5));
                if (var34_10 || var34_10) ** GOTO lbl6
                var24_24 /* !! */  = var19_19;
                if (var34_10) ** GOTO lbl6
                var25_25 = var24_24 /* !! */ .length;
                if (var34_10) ** GOTO lbl6
                var26_26 = lv.ibzb("icuh", ibzg(int ), (int)385);
                if (var34_10) ** GOTO lbl6
                do {
                    if (var34_10 || var34_10) ** GOTO lbl6
                    if (var26_26 >= var25_25) ** GOTO lbl92
                    if (var34_10) ** GOTO lbl6
                    var27_27 = var24_24 /* !! */ [var26_26];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_28 = var27_27[0];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_31 = var27_27[1];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_34 = var27_27[2];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var31_35 = var28_28 * var20_20 - var30_34 * var21_21;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_36 = var28_28 * var21_21 + var30_34 * var20_20;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_28 = var31_35;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var30_34 = var32_36;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var33_37 = var29_31 * var22_22 - var30_34 * var23_23;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var32_36 = var29_31 * var23_23 + var30_34 * var22_22;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_31 = var33_37;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icui", ibzg(int ), (int)386)] = var28_28 + var12_12;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icuj", ibzg(int ), (int)387)] = var29_31 + var13_13;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var27_27[lv.ibzb("icuk", ibzg(int ), (int)388)] = var32_36 + var14_14;
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var26_26;
                    if (var34_10) ** GOTO lbl6
                } while (!var36_8);
                throw null;
lbl92:
                // 1 sources

                if (var34_10 || var34_10) ** GOTO lbl6
                var24_24 /* !! */  = lv.DIAMOND_EDGES;
                if (var34_10) ** GOTO lbl6
                var25_25 = var24_24 /* !! */ .length;
                if (var34_10) ** GOTO lbl6
                var26_26 = lv.ibzb("icul", ibzg(int ), (int)389);
                if (var34_10) ** GOTO lbl6
                do {
                    if (var34_10 || var34_10) ** GOTO lbl6
                    if (var26_26 >= var25_25) ** GOTO lbl115
                    if (var34_10) ** GOTO lbl6
                    var27_27 = var24_24 /* !! */ [var26_26];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var28_30 = var19_19[var27_27[0]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    var29_33 = var19_19[var27_27[1]];
                    if (var34_10 || var34_10) ** GOTO lbl6
                    lv.addLine(var28_30[0], var28_30[1], var28_30[2], var29_33[0], var29_33[1], var29_33[2], var16_16, var17_17, var18_18, var10_7);
                    if (var34_10 || var34_10) ** GOTO lbl6
                    ++var26_26;
                    if (var34_10) ** GOTO lbl6
                } while (!var36_8);
                throw null;
lbl115:
                // 1 sources

                if (!var34_10 && !var34_10) ** break;
                ** continue;
                return;
            }
lbl118:
            // 2 sources

            case 0: {
                var35_9 /* !! */  = (int)lv.ibzb("icum", ibzg(int ), (int)390);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl123:
            // 2 sources

            case 1: {
                var35_9 /* !! */  = (int)lv.ibzb("icun", ibzg(int ), (int)391);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl128:
            // 2 sources

            case 2: {
                var35_9 /* !! */  = (int)lv.ibzb("icuo", ibzg(int ), (int)392);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl133:
            // 4 sources

            case 3: {
                var35_9 /* !! */  = (int)lv.ibzb("icup", ibzg(int ), (int)393);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl138:
            // 3 sources

            case 4: {
                var35_9 /* !! */  = (int)lv.ibzb("icuq", ibzg(int ), (int)394);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 5: {
                var35_9 /* !! */  = (int)lv.ibzb("icur", ibzg(int ), (int)395);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl148:
            // 4 sources

            case 6: {
                var35_9 /* !! */  = (int)lv.ibzb("icus", ibzg(int ), (int)396);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl153:
            // 2 sources

            case 7: {
                var35_9 /* !! */  = (int)lv.ibzb("icut", ibzg(int ), (int)397);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 8: {
                var35_9 /* !! */  = (int)lv.ibzb("icuu", ibzg(int ), (int)398);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl163:
            // 3 sources

            case 9: {
                var35_9 /* !! */  = (int)lv.ibzb("icuv", ibzg(int ), (int)399);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl168:
            // 5 sources

            case 10: {
                var35_9 /* !! */  = (int)lv.ibzb("icuw", ibzg(int ), (int)400);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl493
            }
lbl173:
            // 3 sources

            case 11: {
                var35_9 /* !! */  = (int)lv.ibzb("icux", ibzg(int ), (int)401);
                if (!var36_8) ** GOTO lbl128
                throw null;
            }
lbl177:
            // 2 sources

            case 12: {
                var35_9 /* !! */  = (int)lv.ibzb("icuy", ibzg(int ), (int)402);
                if (!var36_8) ** GOTO lbl148
                throw null;
            }
lbl181:
            // 2 sources

            case 13: {
                var35_9 /* !! */  = (int)lv.ibzb("icuz", ibzg(int ), (int)403);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl186:
            // 2 sources

            case 14: {
                var35_9 /* !! */  = (int)lv.ibzb("icva", ibzg(int ), (int)404);
                if (!var36_8) ** GOTO lbl177
                throw null;
            }
lbl190:
            // 3 sources

            case 15: {
                var35_9 /* !! */  = (int)lv.ibzb("icvb", ibzg(int ), (int)405);
                if (!var36_8) ** GOTO lbl168
                throw null;
            }
lbl194:
            // 2 sources

            case 16: {
                var35_9 /* !! */  = (int)lv.ibzb("icvc", ibzg(int ), (int)406);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl199:
            // 3 sources

            case 17: {
                var35_9 /* !! */  = (int)lv.ibzb("icvd", ibzg(int ), (int)407);
                if (!var36_8) ** GOTO lbl190
                throw null;
            }
            case 18: {
                var35_9 /* !! */  = (int)lv.ibzb("icve", ibzg(int ), (int)408);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl208:
            // 3 sources

            case 19: {
                var35_9 /* !! */  = (int)lv.ibzb("icvf", ibzg(int ), (int)409);
                if (!var36_8) ** GOTO lbl163
                throw null;
            }
lbl212:
            // 4 sources

            case 20: {
                var35_9 /* !! */  = (int)lv.ibzb("icvg", ibzg(int ), (int)410);
                if (!var36_8) ** GOTO lbl173
                throw null;
            }
            case 21: {
                var35_9 /* !! */  = (int)lv.ibzb("icvh", ibzg(int ), (int)411);
                if (!var36_8) ** GOTO lbl148
                throw null;
            }
lbl220:
            // 2 sources

            case 22: {
                var35_9 /* !! */  = (int)lv.ibzb("icvi", ibzg(int ), (int)412);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl225:
            // 2 sources

            case 23: {
                var35_9 /* !! */  = (int)lv.ibzb("icvj", ibzg(int ), (int)413);
                if (!var36_8) ** GOTO lbl123
                throw null;
            }
lbl229:
            // 3 sources

            case 24: {
                var35_9 /* !! */  = (int)lv.ibzb("icvk", ibzg(int ), (int)414);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl234:
            // 2 sources

            case 25: {
                var35_9 /* !! */  = (int)lv.ibzb("icvl", ibzg(int ), (int)415);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 26: {
                var35_9 /* !! */  = (int)lv.ibzb("icvm", ibzg(int ), (int)416);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 27: {
                var35_9 /* !! */  = (int)lv.ibzb("icvn", ibzg(int ), (int)417);
                if (!var36_8) ** GOTO lbl190
                throw null;
            }
lbl248:
            // 2 sources

            case 28: {
                var35_9 /* !! */  = (int)lv.ibzb("icvo", ibzg(int ), (int)418);
                if (!var36_8) ** GOTO lbl199
                throw null;
            }
lbl252:
            // 4 sources

            case 29: {
                var35_9 /* !! */  = (int)lv.ibzb("icvp", ibzg(int ), (int)419);
                if (!var36_8) ** GOTO lbl229
                throw null;
            }
            case 30: {
                var35_9 /* !! */  = (int)lv.ibzb("icvq", ibzg(int ), (int)420);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl261:
            // 3 sources

            case 31: {
                var35_9 /* !! */  = (int)lv.ibzb("icvr", ibzg(int ), (int)421);
                if (!var36_8) ** GOTO lbl208
                throw null;
            }
            case 32: {
                var35_9 /* !! */  = (int)lv.ibzb("icvs", ibzg(int ), (int)422);
                if (!var36_8) ** GOTO lbl133
                throw null;
            }
lbl269:
            // 2 sources

            case 33: {
                do {
                    var35_9 /* !! */  = (int)lv.ibzb("icvt", ibzg(int ), (int)423);
                } while (!var36_8);
                throw null;
            }
            case 34: {
                var35_9 /* !! */  = (int)lv.ibzb("icvu", ibzg(int ), (int)424);
                if (!var36_8) ** GOTO lbl194
                throw null;
            }
            case 35: {
                var35_9 /* !! */  = (int)lv.ibzb("icvv", ibzg(int ), (int)425);
                if (!var36_8) ** GOTO lbl199
                throw null;
            }
lbl282:
            // 2 sources

            case 36: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var35_9 /* !! */  = (int)lv.ibzb("icvw", ibzg(int ), (int)426);
                    if (var36_8) {
                        throw null;
                    }
                    ** GOTO lbl521
                    break;
                }
            }
lbl288:
            // 2 sources

            case 37: {
                var35_9 /* !! */  = (int)lv.ibzb("icvx", ibzg(int ), (int)427);
                if (!var36_8) ** GOTO lbl168
                throw null;
            }
            case 38: {
                var35_9 /* !! */  = (int)lv.ibzb("icvy", ibzg(int ), (int)428);
                if (!var36_8) ** GOTO lbl252
                throw null;
            }
lbl296:
            // 3 sources

            case 39: {
                var35_9 /* !! */  = (int)lv.ibzb("icvz", ibzg(int ), (int)429);
                if (!var36_8) ** GOTO lbl212
                throw null;
            }
lbl300:
            // 2 sources

            case 40: {
                var35_9 /* !! */  = (int)lv.ibzb("icwa", ibzg(int ), (int)430);
                if (!var36_8) ** GOTO lbl282
                throw null;
            }
lbl304:
            // 2 sources

            case 41: {
                var35_9 /* !! */  = (int)lv.ibzb("icwb", ibzg(int ), (int)431);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl509
            }
            case 42: {
                var35_9 /* !! */  = (int)lv.ibzb("icwc", ibzg(int ), (int)432);
                if (!var36_8) ** GOTO lbl212
                throw null;
            }
            case 43: {
                var35_9 /* !! */  = (int)lv.ibzb("icwd", ibzg(int ), (int)433);
                if (!var36_8) ** GOTO lbl118
                throw null;
            }
lbl317:
            // 2 sources

            case 44: {
                var35_9 /* !! */  = (int)lv.ibzb("icwe", ibzg(int ), (int)434);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl376
            }
            case 45: {
                var35_9 /* !! */  = (int)lv.ibzb("icwf", ibzg(int ), (int)435);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl481
            }
lbl327:
            // 3 sources

            case 46: {
                var35_9 /* !! */  = (int)lv.ibzb("icwg", ibzg(int ), (int)436);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl430
            }
lbl332:
            // 3 sources

            case 47: {
                var35_9 /* !! */  = (int)lv.ibzb("icwh", ibzg(int ), (int)437);
                if (!var36_8) ** GOTO lbl234
                throw null;
            }
lbl336:
            // 4 sources

            case 48: {
                var35_9 /* !! */  = (int)lv.ibzb("icwi", ibzg(int ), (int)438);
                if (!var36_8) ** GOTO lbl173
                throw null;
            }
            case 49: {
                var35_9 /* !! */  = (int)lv.ibzb("icwj", ibzg(int ), (int)439);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl476
            }
lbl345:
            // 2 sources

            case 50: {
                var35_9 /* !! */  = (int)lv.ibzb("icwk", ibzg(int ), (int)440);
                if (!var36_8) ** GOTO lbl153
                throw null;
            }
            case 51: {
                var35_9 /* !! */  = (int)lv.ibzb("icwl", ibzg(int ), (int)441);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl354:
            // 2 sources

            case 52: {
                var35_9 /* !! */  = (int)lv.ibzb("icwm", ibzg(int ), (int)442);
                if (!var36_8) ** GOTO lbl220
                throw null;
            }
            case 53: {
                var35_9 /* !! */  = (int)lv.ibzb("icwn", ibzg(int ), (int)443);
                if (!var36_8) ** GOTO lbl332
                throw null;
            }
lbl362:
            // 3 sources

            case 54: {
                var35_9 /* !! */  = (int)lv.ibzb("icwo", ibzg(int ), (int)444);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl367:
            // 2 sources

            case 55: {
                var35_9 /* !! */  = (int)lv.ibzb("icwp", ibzg(int ), (int)445);
                if (!var36_8) ** GOTO lbl248
                throw null;
            }
lbl371:
            // 3 sources

            case 56: {
                var35_9 /* !! */  = (int)lv.ibzb("icwq", ibzg(int ), (int)446);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl376:
            // 4 sources

            case 57: {
                var35_9 /* !! */  = (int)lv.ibzb("icwr", ibzg(int ), (int)447);
                if (!var36_8) ** GOTO lbl269
                throw null;
            }
            case 58: {
                var35_9 /* !! */  = (int)lv.ibzb("icws", ibzg(int ), (int)448);
                if (!var36_8) ** GOTO lbl225
                throw null;
            }
lbl384:
            // 2 sources

            case 59: {
                var35_9 /* !! */  = (int)lv.ibzb("icwt", ibzg(int ), (int)449);
                if (!var36_8) ** GOTO lbl336
                throw null;
            }
lbl388:
            // 2 sources

            case 60: {
                var35_9 /* !! */  = (int)lv.ibzb("icwu", ibzg(int ), (int)450);
                if (!var36_8) ** GOTO lbl371
                throw null;
            }
            case 61: {
                var35_9 /* !! */  = (int)lv.ibzb("icwv", ibzg(int ), (int)451);
                if (!var36_8) ** GOTO lbl181
                throw null;
            }
            case 62: {
                var35_9 /* !! */  = (int)lv.ibzb("icww", ibzg(int ), (int)452);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl464
            }
            case 63: {
                var35_9 /* !! */  = (int)lv.ibzb("icwx", ibzg(int ), (int)453);
                if (!var36_8) ** GOTO lbl229
                throw null;
            }
            case 64: {
                var35_9 /* !! */  = (int)lv.ibzb("icwy", ibzg(int ), (int)454);
                if (!var36_8) ** GOTO lbl296
                throw null;
            }
            case 65: {
                var35_9 /* !! */  = (int)lv.ibzb("icwz", ibzg(int ), (int)455);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl414:
            // 2 sources

            case 66: {
                var35_9 /* !! */  = (int)lv.ibzb("icxa", ibzg(int ), (int)456);
                if (!var36_8) ** GOTO lbl138
                throw null;
            }
            case 67: {
                var35_9 /* !! */  = (int)lv.ibzb("icxb", ibzg(int ), (int)457);
                if (!var36_8) ** GOTO lbl252
                throw null;
            }
            case 68: {
                var35_9 /* !! */  = (int)lv.ibzb("icxc", ibzg(int ), (int)458);
                if (!var36_8) ** GOTO lbl371
                throw null;
            }
            case 69: {
                var35_9 /* !! */  = (int)lv.ibzb("icxd", ibzg(int ), (int)459);
                if (!var36_8) ** GOTO lbl362
                throw null;
            }
lbl430:
            // 3 sources

            case 70: {
                var35_9 /* !! */  = (int)lv.ibzb("icxe", ibzg(int ), (int)460);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl439
            }
            case 71: {
                var35_9 /* !! */  = (int)lv.ibzb("icxf", ibzg(int ), (int)461);
                if (!var36_8) ** GOTO lbl384
                throw null;
            }
lbl439:
            // 2 sources

            case 72: {
                var35_9 /* !! */  = (int)lv.ibzb("icxg", ibzg(int ), (int)462);
                if (!var36_8) ** GOTO lbl296
                throw null;
            }
lbl443:
            // 4 sources

            case 73: {
                var35_9 /* !! */  = (int)lv.ibzb("icxh", ibzg(int ), (int)463);
                if (!var36_8) ** GOTO lbl138
                throw null;
            }
lbl447:
            // 3 sources

            case 74: {
                var35_9 /* !! */  = (int)lv.ibzb("icxj", ibzg(int ), (int)464);
                if (!var36_8) ** GOTO lbl376
                throw null;
            }
            case 75: {
                var35_9 /* !! */  = (int)lv.ibzb("icxn", ibzg(int ), (int)465);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl517
            }
            case 76: {
                var35_9 /* !! */  = (int)lv.ibzb("icxq", ibzg(int ), (int)466);
                if (!var36_8) ** GOTO lbl261
                throw null;
            }
lbl460:
            // 2 sources

            case 77: {
                var35_9 /* !! */  = (int)lv.ibzb("icxv", ibzg(int ), (int)467);
                if (!var36_8) ** GOTO lbl133
                throw null;
            }
lbl464:
            // 2 sources

            case 78: {
                var35_9 /* !! */  = (int)lv.ibzb("icya", ibzg(int ), (int)468);
                if (!var36_8) ** GOTO lbl133
                throw null;
            }
            case 79: {
                var35_9 /* !! */  = (int)lv.ibzb("icyd", ibzg(int ), (int)469);
                if (!var36_8) ** GOTO lbl288
                throw null;
            }
            case 80: {
                var35_9 /* !! */  = (int)lv.ibzb("icyh", ibzg(int ), (int)470);
                if (!var36_8) ** GOTO lbl327
                throw null;
            }
lbl476:
            // 2 sources

            case 81: {
                var35_9 /* !! */  = (int)lv.ibzb("icyk", ibzg(int ), (int)471);
                if (var36_8) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl481:
            // 2 sources

            case 82: {
                var35_9 /* !! */  = (int)lv.ibzb("icyn", ibzg(int ), (int)472);
                if (!var36_8) ** GOTO lbl414
                throw null;
            }
            case 83: {
                var35_9 /* !! */  = (int)lv.ibzb("icyq", ibzg(int ), (int)473);
                if (!var36_8) ** GOTO lbl304
                throw null;
            }
            case 84: {
                var35_9 /* !! */  = (int)lv.ibzb("icyu", ibzg(int ), (int)474);
                if (!var36_8) ** GOTO lbl367
                throw null;
            }
lbl493:
            // 2 sources

            case 85: {
                var35_9 /* !! */  = (int)lv.ibzb("icyy", ibzg(int ), (int)475);
                if (!var36_8) ** GOTO lbl362
                throw null;
            }
            case 86: {
                var35_9 /* !! */  = (int)lv.ibzb("iczc", ibzg(int ), (int)476);
                if (!var36_8) ** GOTO lbl332
                throw null;
            }
            case 87: {
                var35_9 /* !! */  = (int)lv.ibzb("iczf", ibzg(int ), (int)477);
                if (!var36_8) ** GOTO lbl447
                throw null;
            }
            case 88: {
                var35_9 /* !! */  = (int)lv.ibzb("iczj", ibzg(int ), (int)478);
                if (!var36_8) ** GOTO lbl345
                throw null;
            }
lbl509:
            // 2 sources

            case 89: {
                var35_9 /* !! */  = (int)lv.ibzb("iczn", ibzg(int ), (int)479);
                if (!var36_8) ** GOTO lbl212
                throw null;
            }
            case 90: {
                var35_9 /* !! */  = (int)lv.ibzb("iczr", ibzg(int ), (int)480);
                if (!var36_8) ** GOTO lbl354
                throw null;
            }
lbl517:
            // 4 sources

            case 91: {
                var35_9 /* !! */  = (int)lv.ibzb("iczv", ibzg(int ), (int)481);
                if (!var36_8) ** GOTO lbl208
                throw null;
            }
lbl521:
            // 4 sources

            case 92: {
                var35_9 /* !! */  = (int)lv.ibzb("iczy", ibzg(int ), (int)482);
                if (!var36_8) ** GOTO lbl163
                throw null;
            }
            case 93: 
        }
        var35_9 /* !! */  = (int)lv.ibzb("idac", ibzg(int ), (int)483);
        ** while (!var36_8)
lbl528:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void idth() {
        lv.ibzh[0] = 619483567;
        lv.ibzh[1] = -1481966816;
        lv.ibzh[2] = 1250238605;
        lv.ibzh[3] = -1731088088;
        lv.ibzh[4] = -1040010326;
        lv.ibzh[5] = -1932819158;
        lv.ibzh[6] = 1064322593;
        lv.ibzh[7] = 1142811996;
        lv.ibzh[8] = -612452481;
        lv.ibzh[9] = -535381715;
        lv.ibzh[10] = -1189661748;
        lv.ibzh[11] = -1346509727;
        lv.ibzh[12] = 210954778;
        lv.ibzh[13] = -1544316731;
        lv.ibzh[14] = 10680241;
        lv.ibzh[15] = 1368004789;
        lv.ibzh[16] = 1210354354;
        lv.ibzh[17] = 922435158;
        lv.ibzh[18] = 933884110;
        lv.ibzh[19] = 159244937;
        lv.ibzh[20] = 914194070;
        lv.ibzh[21] = 219151887;
        lv.ibzh[22] = 1760746216;
        lv.ibzh[23] = -868612020;
        lv.ibzh[24] = 561279419;
        lv.ibzh[25] = -1942998919;
        lv.ibzh[26] = 116396422;
        lv.ibzh[27] = -1004782083;
        lv.ibzh[28] = 993917489;
        lv.ibzh[29] = 1830008399;
        lv.ibzh[30] = 1790830699;
        lv.ibzh[31] = 604868304;
        lv.ibzh[32] = 335185885;
        lv.ibzh[33] = -713315166;
        lv.ibzh[34] = 2071797677;
        lv.ibzh[35] = 130034654;
        lv.ibzh[36] = -690424744;
        lv.ibzh[37] = -1347406819;
        lv.ibzh[38] = -2138769805;
        lv.ibzh[39] = -2026352636;
        lv.ibzh[40] = 1197116028;
        lv.ibzh[41] = 1372660865;
        lv.ibzh[42] = -1277397603;
        lv.ibzh[43] = -1457335;
        lv.ibzh[44] = -1069864124;
        lv.ibzh[45] = 245035070;
        lv.ibzh[46] = -1296184747;
        lv.ibzh[47] = -1341314432;
        lv.ibzh[48] = -2109510249;
        lv.ibzh[49] = 212897351;
        lv.ibzh[50] = 83554423;
        lv.ibzh[51] = -40853797;
        lv.ibzh[52] = 551591540;
        lv.ibzh[53] = 1503107549;
        lv.ibzh[54] = -43141595;
        lv.ibzh[55] = -1328914373;
        lv.ibzh[56] = -1008319381;
        lv.ibzh[57] = 1034544412;
        lv.ibzh[58] = 2010668763;
        lv.ibzh[59] = -677443938;
        lv.ibzh[60] = 1902814566;
        lv.ibzh[61] = -1931818858;
        lv.ibzh[62] = -82454441;
        lv.ibzh[63] = -1985021206;
        lv.ibzh[64] = -327069824;
        lv.ibzh[65] = 786715181;
        lv.ibzh[66] = -219713373;
        lv.ibzh[67] = -743316069;
        lv.ibzh[68] = -992186926;
        lv.ibzh[69] = 280329621;
        lv.ibzh[70] = 104873275;
        lv.ibzh[71] = -1079039939;
        lv.ibzh[72] = -2071726547;
        lv.ibzh[73] = 1372503821;
        lv.ibzh[74] = 1820092964;
        lv.ibzh[75] = 200267613;
        lv.ibzh[76] = -527646427;
        lv.ibzh[77] = -367635273;
        lv.ibzh[78] = 294842074;
        lv.ibzh[79] = 1052169920;
        lv.ibzh[80] = -1267094029;
        lv.ibzh[81] = 69210114;
        lv.ibzh[82] = -1611513051;
        lv.ibzh[83] = -2042467848;
        lv.ibzh[84] = -770911019;
        lv.ibzh[85] = -641343285;
        lv.ibzh[86] = 1473214214;
        lv.ibzh[87] = 804305488;
        lv.ibzh[88] = 190482272;
        lv.ibzh[89] = -1598678349;
        lv.ibzh[90] = 471025836;
        lv.ibzh[91] = 2032745864;
        lv.ibzh[92] = -1600051205;
        lv.ibzh[93] = -1944216592;
        lv.ibzh[94] = 234241681;
        lv.ibzh[95] = 1932319949;
        lv.ibzh[96] = -2035649640;
        lv.ibzh[97] = -1931275611;
        lv.ibzh[98] = -1301277638;
        lv.ibzh[99] = -262246901;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setMatrices(Matrix4f var0, Matrix4f var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lv.pk - lv.ibzb("icem", ibyy(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lv.ibzb("icen", ibzg(int ), (int)60)) break;
            v0 /* !! */  = (long)lv.ibzb("iceo", ibzg(int ), (int)61);
        }
        var4_2 = lv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lv.pk - lv.ibzb("icep", ibyy(int ), (int)78)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == lv.ibzb("iceq", ibzg(int ), (int)62)) break;
            v1 /* !! */  = (long)lv.ibzb("icer", ibzg(int ), (int)63);
        }
        var3_3 /* !! */  = lv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lv.pk - lv.ibzb("ices", ibyy(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == lv.ibzb("icet", ibzg(int ), (int)64)) break;
            v2 /* !! */  = (long)lv.ibzb("iceu", ibzg(int ), (int)65);
        }
        var2_4 = lv.a;
        if (var4_2) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v3 /* !! */  = lv.pk;
        if (true) ** GOTO lbl28
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - lv.ibzb("icev", ibyy(int ), (int)80));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1980061873: {
                    v4 = lv.ibzb("icew", ibyy(int ), (int)81);
                    continue block23;
                }
                case -450579769: {
                    break block23;
                }
                case 928315996: {
                    v4 = lv.ibzb("icex", ibyy(int ), (int)82);
                    continue block23;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = lv.pk - lv.ibzb("icey", ibyy(int ), (int)83)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == lv.ibzb("icez", ibzg(int ), (int)66)) break;
            v5 /* !! */  = (long)lv.ibzb("icfa", ibzg(int ), (int)67);
        }
        lv.projectionMatrix.set((Matrix4fc)var0);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = lv.pk - lv.ibzb("icfb", ibyy(int ), (int)84)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == lv.ibzb("icfc", ibzg(int ), (int)68)) break;
                    v6 /* !! */  = (long)lv.ibzb("icfd", ibzg(int ), (int)69);
                }
                v7 /* !! */  = lv.pk;
                if (true) ** GOTO lbl57
                block26: while (true) {
                    v7 /* !! */  = (long)(lv.ibzb("icff", ibyy(int ), (int)86) - lv.ibzb("icfe", ibyy(int ), (int)85));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1323954047: {
                            continue block26;
                        }
                        case -450579769: {
                            break block26;
                        }
                    }
                    break;
                }
                lv.viewMatrix.set((Matrix4fc)var1_1);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl67:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)lv.ibzb("icfg", ibzg(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)lv.ibzb("icfh", ibzg(int ), (int)71);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl87
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)lv.ibzb("icfi", ibzg(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl83:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)lv.ibzb("icfj", ibzg(int ), (int)73);
                if (!var4_2) break;
                throw null;
            }
lbl87:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)lv.ibzb("icfk", ibzg(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
            }
lbl91:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)lv.ibzb("icfl", ibzg(int ), (int)75);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)lv.ibzb("icfm", ibzg(int ), (int)76);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)lv.ibzb("icfn", ibzg(int ), (int)77);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iduc() {
        lv.ibza[100] = 3787619271274233094L;
        lv.ibza[101] = 416353488791419956L;
        lv.ibza[102] = 6909030026330099334L;
        lv.ibza[103] = -6106810496608026739L;
        lv.ibza[104] = 4673199701926633777L;
        lv.ibza[105] = 7584375639367691799L;
        lv.ibza[106] = -2441797581375705281L;
        lv.ibza[107] = 2530290805040179654L;
        lv.ibza[108] = -834541566168717794L;
        lv.ibza[109] = -1819278729485201884L;
        lv.ibza[110] = -103145040082722407L;
        lv.ibza[111] = -8890326175800550997L;
        lv.ibza[112] = -2750005477343709924L;
        lv.ibza[113] = -1569114330839123378L;
        lv.ibza[114] = 2065873918303132711L;
        lv.ibza[115] = 8588940591866465175L;
        lv.ibza[116] = -4382804340992931893L;
        lv.ibza[117] = -9077542631868623602L;
        lv.ibza[118] = -6904824301865227225L;
        lv.ibza[119] = -1302486023364644355L;
        lv.ibza[120] = 5433591089143605227L;
        lv.ibza[121] = -3684077136642873756L;
        lv.ibza[122] = -827833300598037907L;
        lv.ibza[123] = -7957158058681083859L;
        lv.ibza[124] = -8937153809703158189L;
        lv.ibza[125] = 2162370940951872374L;
        lv.ibza[126] = 6910585090251956444L;
        lv.ibza[127] = -5700535397662867308L;
        lv.ibza[128] = -5185999286692322452L;
        lv.ibza[129] = 7748800166775085709L;
        lv.ibza[130] = -5944110166398451257L;
        lv.ibza[131] = 2239330140088189642L;
        lv.ibza[132] = -1541970131877030169L;
        lv.ibza[133] = -2716641764474057718L;
        lv.ibza[134] = 1034878596452613276L;
        lv.ibza[135] = 4237815916057036724L;
        lv.ibza[136] = -8274265068907876991L;
        lv.ibza[137] = 5456921468298034261L;
        lv.ibza[138] = -4584437362815271522L;
        lv.ibza[139] = -9116809271496325704L;
        lv.ibza[140] = -4556051286739992473L;
        lv.ibza[141] = 7471671484836291918L;
        lv.ibza[142] = 2754820017148113449L;
        lv.ibza[143] = 326177667740525708L;
        lv.ibza[144] = -3346885387519622286L;
        lv.ibza[145] = 8277446323961260270L;
        lv.ibza[146] = -4750724643654650192L;
        lv.ibza[147] = 147381723196634135L;
        lv.ibza[148] = -9195714039197124664L;
        lv.ibza[149] = 207615972104211582L;
        lv.ibza[150] = 7262820797708476333L;
        lv.ibza[151] = 8713290729198123586L;
        lv.ibza[152] = 8552811724703661410L;
        lv.ibza[153] = -7250065106052474334L;
        lv.ibza[154] = -986371185179474241L;
        lv.ibza[155] = 3073045386206007498L;
        lv.ibza[156] = 7602963950256457974L;
        lv.ibza[157] = 2212476025618960046L;
        lv.ibza[158] = -7430827948650901211L;
        lv.ibza[159] = 8543406392747051885L;
        lv.ibza[160] = -739335579266572220L;
        lv.ibza[161] = 6294268217088618748L;
        lv.ibza[162] = -3645733003657957631L;
        lv.ibza[163] = -5619511283215527303L;
        lv.ibza[164] = 6261544670055539971L;
        lv.ibza[165] = -583140557659362674L;
        lv.ibza[166] = -1359168492391634290L;
        lv.ibza[167] = 1664531685302883247L;
        lv.ibza[168] = 2936783782921660295L;
        lv.ibza[169] = 299828688849935726L;
        lv.ibza[170] = -3544891669314452389L;
        lv.ibza[171] = 1371477061894330741L;
        lv.ibza[172] = -3439107504583881972L;
        lv.ibza[173] = 3101031819979801752L;
        lv.ibza[174] = 7969015943781222573L;
        lv.ibza[175] = 4340014355188867187L;
        lv.ibza[176] = 6061242112095717261L;
        lv.ibza[177] = -8749538501143723415L;
        lv.ibza[178] = 6280866415466115767L;
        lv.ibza[179] = -128176722234368438L;
        lv.ibza[180] = -8932574375932274111L;
        lv.ibza[181] = -838314456466917499L;
        lv.ibza[182] = 8615101034923929371L;
        lv.ibza[183] = -8850758266652186281L;
        lv.ibza[184] = -1874196571138332548L;
        lv.ibza[185] = 1286453330373618855L;
        lv.ibza[186] = -8660156914282861302L;
        lv.ibza[187] = 6375420679837593026L;
        lv.ibza[188] = 5521624413840043551L;
        lv.ibza[189] = -7085569204823706248L;
        lv.ibza[190] = -1100123347278124583L;
        lv.ibza[191] = 4830418431450513670L;
        lv.ibza[192] = 7917477943597671337L;
        lv.ibza[193] = 49076572860306347L;
        lv.ibza[194] = 4758449434716529154L;
        lv.ibza[195] = 2714128654210616699L;
        lv.ibza[196] = 452655474758847962L;
        lv.ibza[197] = 8620490834147115782L;
        lv.ibza[198] = 5737575425647155703L;
        lv.ibza[199] = -1156011341983565072L;
    }

    private static /* synthetic */ void idtk() {
        lv.ibzh[300] = -1104232476;
        lv.ibzh[301] = -955962570;
        lv.ibzh[302] = -1580484656;
        lv.ibzh[303] = -496321438;
        lv.ibzh[304] = 2062717945;
        lv.ibzh[305] = -1506332203;
        lv.ibzh[306] = -2094809719;
        lv.ibzh[307] = -1700646953;
        lv.ibzh[308] = 1532028613;
        lv.ibzh[309] = 826986989;
        lv.ibzh[310] = 317382908;
        lv.ibzh[311] = 1822143089;
        lv.ibzh[312] = -1142765789;
        lv.ibzh[313] = 798383527;
        lv.ibzh[314] = 1210856077;
        lv.ibzh[315] = -1412731874;
        lv.ibzh[316] = -659702298;
        lv.ibzh[317] = 388245281;
        lv.ibzh[318] = -975043723;
        lv.ibzh[319] = -1871832808;
        lv.ibzh[320] = -239744267;
        lv.ibzh[321] = -904124604;
        lv.ibzh[322] = -1176481051;
        lv.ibzh[323] = 1239906529;
        lv.ibzh[324] = -1640927598;
        lv.ibzh[325] = -122660018;
        lv.ibzh[326] = 561504925;
        lv.ibzh[327] = 1441231391;
        lv.ibzh[328] = -467547926;
        lv.ibzh[329] = 1495950959;
        lv.ibzh[330] = -1051187077;
        lv.ibzh[331] = 962793295;
        lv.ibzh[332] = 1821779824;
        lv.ibzh[333] = -579258905;
        lv.ibzh[334] = -725775377;
        lv.ibzh[335] = -1717781117;
        lv.ibzh[336] = -157314241;
        lv.ibzh[337] = 1064152972;
        lv.ibzh[338] = 1047046730;
        lv.ibzh[339] = -783718095;
        lv.ibzh[340] = -1462356625;
        lv.ibzh[341] = 1839638881;
        lv.ibzh[342] = -1380282326;
        lv.ibzh[343] = 513172263;
        lv.ibzh[344] = -1347378362;
        lv.ibzh[345] = -865291241;
        lv.ibzh[346] = -251257279;
        lv.ibzh[347] = 883831042;
        lv.ibzh[348] = -1302697522;
        lv.ibzh[349] = 314734599;
        lv.ibzh[350] = 846597879;
        lv.ibzh[351] = -2070369977;
        lv.ibzh[352] = 79194165;
        lv.ibzh[353] = 1157016761;
        lv.ibzh[354] = 250236030;
        lv.ibzh[355] = -936049789;
        lv.ibzh[356] = 555667680;
        lv.ibzh[357] = -1487869741;
        lv.ibzh[358] = -47804244;
        lv.ibzh[359] = -187515218;
        lv.ibzh[360] = -131734395;
        lv.ibzh[361] = -1119693111;
        lv.ibzh[362] = 852983823;
        lv.ibzh[363] = -1814528107;
        lv.ibzh[364] = 1984411666;
        lv.ibzh[365] = -2011460881;
        lv.ibzh[366] = 1804775838;
        lv.ibzh[367] = -717860393;
        lv.ibzh[368] = 1052941908;
        lv.ibzh[369] = 1137901838;
        lv.ibzh[370] = -1354146739;
        lv.ibzh[371] = 1666377216;
        lv.ibzh[372] = -555678508;
        lv.ibzh[373] = 627051174;
        lv.ibzh[374] = 1760336738;
        lv.ibzh[375] = -654722364;
        lv.ibzh[376] = -1920934934;
        lv.ibzh[377] = -328521883;
        lv.ibzh[378] = -159548346;
        lv.ibzh[379] = -491435064;
        lv.ibzh[380] = 633461365;
        lv.ibzh[381] = 106239506;
        lv.ibzh[382] = -1144172465;
        lv.ibzh[383] = 1392947768;
        lv.ibzh[384] = 18625459;
        lv.ibzh[385] = 581967814;
        lv.ibzh[386] = 1560144125;
        lv.ibzh[387] = 530733193;
        lv.ibzh[388] = -691105345;
        lv.ibzh[389] = 1303860283;
        lv.ibzh[390] = -1336097365;
        lv.ibzh[391] = -984113938;
        lv.ibzh[392] = 341273015;
        lv.ibzh[393] = 1279219418;
        lv.ibzh[394] = 924276382;
        lv.ibzh[395] = 731224204;
        lv.ibzh[396] = -485294527;
        lv.ibzh[397] = 844128776;
        lv.ibzh[398] = 2095566556;
        lv.ibzh[399] = 1183145532;
    }

    private static /* synthetic */ void idtv() {
        lv.ibzi[600] = -148013309;
        lv.ibzi[601] = 1036970390;
        lv.ibzi[602] = -454779124;
        lv.ibzi[603] = 1888450871;
        lv.ibzi[604] = -1624291694;
        lv.ibzi[605] = 2029461941;
        lv.ibzi[606] = 1263279723;
        lv.ibzi[607] = -1291826510;
        lv.ibzi[608] = -2071555973;
        lv.ibzi[609] = -764817028;
        lv.ibzi[610] = -1649469963;
        lv.ibzi[611] = 1906892192;
        lv.ibzi[612] = -682750114;
        lv.ibzi[613] = 1279469828;
        lv.ibzi[614] = -895845097;
        lv.ibzi[615] = 1021533852;
        lv.ibzi[616] = -714276750;
        lv.ibzi[617] = 2013465381;
        lv.ibzi[618] = 560079002;
        lv.ibzi[619] = -1895707236;
        lv.ibzi[620] = 1575334877;
        lv.ibzi[621] = 1122537789;
        lv.ibzi[622] = -30812906;
        lv.ibzi[623] = 1786556757;
        lv.ibzi[624] = 1477690950;
        lv.ibzi[625] = 1067157295;
        lv.ibzi[626] = 942333092;
        lv.ibzi[627] = -2133910307;
        lv.ibzi[628] = 1469833127;
        lv.ibzi[629] = -1675418706;
        lv.ibzi[630] = 1543336919;
        lv.ibzi[631] = -1587876974;
        lv.ibzi[632] = -812119193;
        lv.ibzi[633] = 1297711291;
        lv.ibzi[634] = 2075769323;
        lv.ibzi[635] = 268064570;
        lv.ibzi[636] = 1554578855;
        lv.ibzi[637] = -570451861;
        lv.ibzi[638] = 1279420479;
        lv.ibzi[639] = -711832469;
        lv.ibzi[640] = 256235995;
        lv.ibzi[641] = 663603694;
        lv.ibzi[642] = 285888412;
        lv.ibzi[643] = 264584682;
        lv.ibzi[644] = -821405283;
        lv.ibzi[645] = -740616274;
        lv.ibzi[646] = 1752499970;
        lv.ibzi[647] = 1381821891;
        lv.ibzi[648] = 141441091;
        lv.ibzi[649] = -562647076;
        lv.ibzi[650] = 354870523;
        lv.ibzi[651] = -710476871;
        lv.ibzi[652] = 1948767363;
        lv.ibzi[653] = 236880867;
        lv.ibzi[654] = 348172909;
        lv.ibzi[655] = 755442949;
        lv.ibzi[656] = 1076304383;
        lv.ibzi[657] = -47821157;
        lv.ibzi[658] = -1343886680;
        lv.ibzi[659] = 1668833158;
        lv.ibzi[660] = 1774507835;
        lv.ibzi[661] = 1363243865;
        lv.ibzi[662] = -17218266;
        lv.ibzi[663] = -2046950958;
        lv.ibzi[664] = -1248273584;
        lv.ibzi[665] = 1396808060;
        lv.ibzi[666] = -994444316;
        lv.ibzi[667] = -672773571;
        lv.ibzi[668] = 4275423;
        lv.ibzi[669] = -452943773;
        lv.ibzi[670] = 219599009;
        lv.ibzi[671] = -1448847305;
        lv.ibzi[672] = 472578001;
        lv.ibzi[673] = -765198718;
        lv.ibzi[674] = 315422495;
        lv.ibzi[675] = -426956744;
        lv.ibzi[676] = 548209751;
        lv.ibzi[677] = -1661179501;
        lv.ibzi[678] = 1437757109;
        lv.ibzi[679] = 621092410;
        lv.ibzi[680] = -1990369239;
        lv.ibzi[681] = 404719829;
        lv.ibzi[682] = -830064435;
        lv.ibzi[683] = 1122099830;
        lv.ibzi[684] = -1477742401;
        lv.ibzi[685] = -1346255022;
        lv.ibzi[686] = -940382503;
        lv.ibzi[687] = 526313449;
        lv.ibzi[688] = 1371651841;
        lv.ibzi[689] = -1093009007;
        lv.ibzi[690] = 1440108317;
        lv.ibzi[691] = -1615849649;
        lv.ibzi[692] = -128447355;
        lv.ibzi[693] = -665257355;
        lv.ibzi[694] = 621547802;
        lv.ibzi[695] = 2076044773;
        lv.ibzi[696] = -1189292486;
        lv.ibzi[697] = -567288761;
        lv.ibzi[698] = 368916696;
        lv.ibzi[699] = 744009887;
    }
}

