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

public final class kn {
    static public final boolean a;
    static public final int b;
    static public final boolean c;
    static public final long os = 9083000845831026999L;
    static private int[] hpxr;
    static private RenderPipeline pipeline;
    static private final int UNIFORM_SIZE = 224;
    static private ByteBuffer uniformData;
    static private int[] hpxq;
    static private GpuBuffer uniformBuffer;
    static private long[] hpxb;
    static private long[] hpxc;

    private static void hrtt() {
        kn.hpxb[100] = -79924952304536195L;
        kn.hpxb[101] = -45472737282372829L;
        kn.hpxb[102] = 1252901580124208123L;
        kn.hpxb[103] = 8730907842838789621L;
        kn.hpxb[104] = -8912383419440505565L;
        kn.hpxb[105] = -5358114606665889643L;
        kn.hpxb[106] = 7859356778380311778L;
        kn.hpxb[107] = 3526664353222057353L;
        kn.hpxb[108] = -1117759709989548337L;
        kn.hpxb[109] = -7388953381098006900L;
        kn.hpxb[110] = -7957552017172683732L;
        kn.hpxb[111] = 4222685878105086439L;
        kn.hpxb[112] = 8800629323530710249L;
        kn.hpxb[113] = -6796141651775897584L;
        kn.hpxb[114] = -9019460020449449389L;
        kn.hpxb[115] = -3501534450863301249L;
        kn.hpxb[116] = 4720730125393046213L;
        kn.hpxb[117] = -979551610930420497L;
        kn.hpxb[118] = -7593837013107886842L;
        kn.hpxb[119] = 3687341546857141770L;
    }

    private static void hrtr() {
        kn.hpxr[200] = -1529353898;
        kn.hpxr[201] = -556018110;
        kn.hpxr[202] = -411472634;
        kn.hpxr[203] = -1781567621;
        kn.hpxr[204] = -1735594537;
        kn.hpxr[205] = 1526536750;
        kn.hpxr[206] = 529069810;
        kn.hpxr[207] = 1390362937;
        kn.hpxr[208] = 1691900159;
        kn.hpxr[209] = -867937349;
        kn.hpxr[210] = 2134589608;
        kn.hpxr[211] = 1275671030;
        kn.hpxr[212] = -1123321598;
        kn.hpxr[213] = -916996289;
        kn.hpxr[214] = 1850987598;
        kn.hpxr[215] = 864605579;
        kn.hpxr[216] = -2059496061;
        kn.hpxr[217] = 438835774;
        kn.hpxr[218] = -318259128;
        kn.hpxr[219] = 1436583039;
        kn.hpxr[220] = 1237042640;
        kn.hpxr[221] = -1479895729;
        kn.hpxr[222] = -1211558906;
        kn.hpxr[223] = -1445036351;
        kn.hpxr[224] = -448311649;
        kn.hpxr[225] = -879088444;
        kn.hpxr[226] = 1036297743;
        kn.hpxr[227] = 1717500252;
        kn.hpxr[228] = -1314920842;
        kn.hpxr[229] = -143220929;
        kn.hpxr[230] = -210074511;
        kn.hpxr[231] = -1750004824;
        kn.hpxr[232] = 1838393141;
        kn.hpxr[233] = -2108960284;
        kn.hpxr[234] = 1685598368;
        kn.hpxr[235] = 1627023032;
        kn.hpxr[236] = -778605625;
        kn.hpxr[237] = -1410516816;
        kn.hpxr[238] = 1793334433;
        kn.hpxr[239] = 687406035;
        kn.hpxr[240] = 1468957443;
        kn.hpxr[241] = -1825973562;
        kn.hpxr[242] = 634994447;
        kn.hpxr[243] = 1391588454;
    }

    private static void hrtn() {
        kn.hpxq[100] = 1379437065;
        kn.hpxq[101] = 631514531;
        kn.hpxq[102] = 356786225;
        kn.hpxq[103] = -1499557396;
        kn.hpxq[104] = -143260827;
        kn.hpxq[105] = -763662943;
        kn.hpxq[106] = -1553480629;
        kn.hpxq[107] = -977668423;
        kn.hpxq[108] = 2013169867;
        kn.hpxq[109] = -1979674789;
        kn.hpxq[110] = -2137391492;
        kn.hpxq[111] = 885439754;
        kn.hpxq[112] = 2124905164;
        kn.hpxq[113] = -1628157943;
        kn.hpxq[114] = -482427297;
        kn.hpxq[115] = -379730781;
        kn.hpxq[116] = 144263220;
        kn.hpxq[117] = -1510440524;
        kn.hpxq[118] = -265668071;
        kn.hpxq[119] = 623574510;
        kn.hpxq[120] = 1835830446;
        kn.hpxq[121] = 1172787685;
        kn.hpxq[122] = 390563056;
        kn.hpxq[123] = 118674038;
        kn.hpxq[124] = 46118887;
        kn.hpxq[125] = 2041730681;
        kn.hpxq[126] = -1038724569;
        kn.hpxq[127] = -118863141;
        kn.hpxq[128] = 1360766973;
        kn.hpxq[129] = -1108671696;
        kn.hpxq[130] = 148306385;
        kn.hpxq[131] = -689526668;
        kn.hpxq[132] = -327167848;
        kn.hpxq[133] = -855001830;
        kn.hpxq[134] = -349703535;
        kn.hpxq[135] = 0xF006660;
        kn.hpxq[136] = 1028971797;
        kn.hpxq[137] = 1217567839;
        kn.hpxq[138] = 2068336049;
        kn.hpxq[139] = 164681059;
        kn.hpxq[140] = 1494149342;
        kn.hpxq[141] = -2020288437;
        kn.hpxq[142] = 744946359;
        kn.hpxq[143] = 1664141238;
        kn.hpxq[144] = 1387706348;
        kn.hpxq[145] = -571387814;
        kn.hpxq[146] = -1398879151;
        kn.hpxq[147] = -229507081;
        kn.hpxq[148] = -1390177576;
        kn.hpxq[149] = 10232957;
        kn.hpxq[150] = 1320915156;
        kn.hpxq[151] = 1987335903;
        kn.hpxq[152] = 958768760;
        kn.hpxq[153] = -1159412305;
        kn.hpxq[154] = 1994700633;
        kn.hpxq[155] = 972213047;
        kn.hpxq[156] = 863702657;
        kn.hpxq[157] = -529271616;
        kn.hpxq[158] = 215902246;
        kn.hpxq[159] = -1327900369;
        kn.hpxq[160] = 572166902;
        kn.hpxq[161] = -810440516;
        kn.hpxq[162] = 77884630;
        kn.hpxq[163] = 1570953913;
        kn.hpxq[164] = 74829473;
        kn.hpxq[165] = -543683077;
        kn.hpxq[166] = -673992436;
        kn.hpxq[167] = 2143936942;
        kn.hpxq[168] = -812267096;
        kn.hpxq[169] = -687966361;
        kn.hpxq[170] = -1424025247;
        kn.hpxq[171] = -1465830737;
        kn.hpxq[172] = -411386662;
        kn.hpxq[173] = 893209378;
        kn.hpxq[174] = -1216279771;
        kn.hpxq[175] = -73247965;
        kn.hpxq[176] = 571650023;
        kn.hpxq[177] = 2056650603;
        kn.hpxq[178] = 326506629;
        kn.hpxq[179] = 661591823;
        kn.hpxq[180] = -2033200951;
        kn.hpxq[181] = -1995061254;
        kn.hpxq[182] = -632796886;
        kn.hpxq[183] = -413361749;
        kn.hpxq[184] = -215103925;
        kn.hpxq[185] = -1502076816;
        kn.hpxq[186] = 129033669;
        kn.hpxq[187] = -853475707;
        kn.hpxq[188] = -1218368300;
        kn.hpxq[189] = 823733707;
        kn.hpxq[190] = -22977543;
        kn.hpxq[191] = -145911291;
        kn.hpxq[192] = -1328986749;
        kn.hpxq[193] = 665306446;
        kn.hpxq[194] = -964726527;
        kn.hpxq[195] = -2043059467;
        kn.hpxq[196] = -215653550;
        kn.hpxq[197] = -275057619;
        kn.hpxq[198] = 1282331618;
        kn.hpxq[199] = 890457960;
    }

    private static float hroz(int n2) {
        return Float.intBitsToFloat(hpxq[n2] ^ hpxr[n2]);
    }

    private static long hpxa(int n2) {
        return hpxb[n2] ^ hpxc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putColor(ByteBuffer var0, int var1_1) {
        v0 /* !! */  = kn.os;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(kn.hpxd("hror", hpxa(int ), (int)69) - kn.hpxd("hroq", hpxa(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1045739831: {
                    break block31;
                }
                case 1512280815: {
                    continue block31;
                }
            }
            break;
        }
        var4_2 = kn.c;
        v1 /* !! */  = kn.os;
        if (true) ** GOTO lbl15
        block32: while (true) {
            v1 /* !! */  = (long)(kn.hpxd("hrot", hpxa(int ), (int)71) - kn.hpxd("hros", hpxa(int ), (int)70));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1575447566: {
                    continue block32;
                }
                case 1045739831: {
                    break block32;
                }
            }
            break;
        }
        var3_3 /* !! */  = kn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kn.os - kn.hpxd("hrou", hpxa(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kn.hpxd("hrov", hpxp(int ), (int)171)) break;
            v2 /* !! */  = (long)kn.hpxd("hrow", hpxp(int ), (int)172);
        }
        var2_4 = kn.a;
        if (var4_2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl29
                v3 = (float)(var1_1 >> kn.hpxd("hrox", hpxp(int ), (int)173) & kn.hpxd("hroy", hpxp(int ), (int)174)) / kn.hpxd("hrpa", hroz(int ), (int)175);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kn.os - kn.hpxd("hrpb", hpxa(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kn.hpxd("hrpc", hpxp(int ), (int)176)) break;
                    v4 /* !! */  = (long)kn.hpxd("hrpd", hpxp(int ), (int)177);
                }
                var0.putFloat(v3);
                if (var2_4 || var2_4) ** GOTO lbl29
                v5 = (float)(var1_1 >> kn.hpxd("hrpe", hpxp(int ), (int)178) & kn.hpxd("hrpf", hpxp(int ), (int)179)) / kn.hpxd("hrpg", hroz(int ), (int)180);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = kn.os - kn.hpxd("hrph", hpxa(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == kn.hpxd("hrpi", hpxp(int ), (int)181)) break;
                    v6 /* !! */  = (long)kn.hpxd("hrpj", hpxp(int ), (int)182);
                }
                var0.putFloat(v5);
                if (var2_4 || var2_4) ** GOTO lbl29
                v7 = (float)(var1_1 & kn.hpxd("hrpk", hpxp(int ), (int)183)) / kn.hpxd("hrpl", hroz(int ), (int)184);
                v8 /* !! */  = kn.os;
                if (true) ** GOTO lbl56
                block37: while (true) {
                    v8 /* !! */  = (long)(v9 - kn.hpxd("hrpm", hpxa(int ), (int)75));
lbl56:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2032357823: {
                            v9 = kn.hpxd("hrpn", hpxa(int ), (int)76);
                            continue block37;
                        }
                        case -544330511: {
                            v9 = kn.hpxd("hrpo", hpxa(int ), (int)77);
                            continue block37;
                        }
                        case 1045739831: {
                            break block37;
                        }
                    }
                    break;
                }
                var0.putFloat(v7);
                if (var2_4 || var2_4) ** GOTO lbl29
                v10 = (float)(var1_1 >>> kn.hpxd("hrpp", hpxp(int ), (int)185) & kn.hpxd("hrpq", hpxp(int ), (int)186)) / kn.hpxd("hrpr", hroz(int ), (int)187);
                v11 /* !! */  = kn.os;
                if (true) ** GOTO lbl73
                block38: while (true) {
                    v11 /* !! */  = (long)(kn.hpxd("hrpt", hpxa(int ), (int)79) - kn.hpxd("hrps", hpxa(int ), (int)78));
lbl73:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1045739831: {
                            break block38;
                        }
                        case 1864357847: {
                            continue block38;
                        }
                    }
                    break;
                }
                var0.putFloat(v10);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl82:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)kn.hpxd("hrpu", hpxp(int ), (int)188);
                if (var4_2) {
                    throw null;
                }
            }
lbl86:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)kn.hpxd("hrpv", hpxp(int ), (int)189);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl91:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kn.hpxd("hrpw", hpxp(int ), (int)190);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl96:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kn.hpxd("hrpx", hpxp(int ), (int)191);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
lbl100:
            // 2 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)kn.hpxd("hrpy", hpxp(int ), (int)192);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)kn.hpxd("hrpz", hpxp(int ), (int)193);
                } while (!var4_2);
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)kn.hpxd("hrqa", hpxp(int ), (int)194);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl114:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)kn.hpxd("hrqb", hpxp(int ), (int)195);
                if (!var4_2) ** GOTO lbl91
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)kn.hpxd("hrqc", hpxp(int ), (int)196);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)kn.hpxd("hrqd", hpxp(int ), (int)197);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kn.hpxd("hrqe", hpxp(int ), (int)198);
                    if (!var4_2) ** GOTO lbl100
                    throw null;
                }
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)kn.hpxd("hrqf", hpxp(int ), (int)199);
        ** while (!var4_2)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void draw(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12, float var13_13, int var14_14, int var15_15, float var16_16) {
        block188: {
            block187: {
                block186: {
                    block185: {
                        block184: {
                            var30_17 = kn.c;
                            var29_18 /* !! */  = kn.b;
                            var28_19 = kn.a;
                            if (var30_17) {
                                throw null;
lbl6:
                                // 54 sources

                                return;
                            }
                            if (var28_19 || var28_19) ** GOTO lbl6
                            if (kn.pipeline != null) break block184;
                            if (var28_19) ** GOTO lbl6
                            kn.init();
                            if (var28_19) ** GOTO lbl6
                        }
                        if (var28_19 || var28_19) ** GOTO lbl6
                        if (kn.pipeline == null) break block185;
                        if (var28_19) ** GOTO lbl6
                        if (kn.uniformBuffer == null) break block185;
                        if (var28_19) ** GOTO lbl6
                        if (kn.uniformData != null) break block186;
                        if (var28_19) ** GOTO lbl6
                    }
                    if (var28_19 || var28_19) ** GOTO lbl6
                    return;
                }
                if (var28_19 || var28_19) ** GOTO lbl6
                if (var3_3 <= 0.0f) break block187;
                if (var28_19) ** GOTO lbl6
                if (!(var4_4 <= 0.0f)) break block188;
                if (var28_19) ** GOTO lbl6
            }
            if (var28_19 || var28_19) ** GOTO lbl6
            return;
        }
        if (var28_19 || var28_19) ** GOTO lbl6
        var17_20 = Math.max(2.0f, var12_12 + var13_13 + Math.max(var10_10, var11_11) + 2.0f);
        if (var28_19 || var28_19) ** GOTO lbl6
        var18_21 = Math.min(var1_1, Math.min(var6_6, var8_8) - Math.max(var10_10, var11_11)) - var17_20;
        if (var28_19 || var28_19) ** GOTO lbl6
        var19_22 = Math.min(var2_2, Math.min(var7_7, var9_9) - Math.max(var10_10, var11_11)) - var17_20;
        if (var28_19 || var28_19) ** GOTO lbl6
        var20_23 = Math.max(var1_1 + var3_3, Math.max(var6_6, var8_8) + Math.max(var10_10, var11_11)) + var17_20;
        if (var28_19 || var28_19) ** GOTO lbl6
        var21_24 = Math.max(var2_2 + var4_4, Math.max(var7_7, var9_9) + Math.max(var10_10, var11_11)) + var17_20;
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25 = kn.uniformData;
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.clear();
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var0.m00()).putFloat(var0.m01()).putFloat(var0.m02()).putFloat(var0.m03());
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var0.m10()).putFloat(var0.m11()).putFloat(var0.m12()).putFloat(var0.m13());
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var0.m20()).putFloat(var0.m21()).putFloat(var0.m22()).putFloat(var0.m23());
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var0.m30()).putFloat(var0.m31()).putFloat(var0.m32()).putFloat(var0.m33());
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.position((int)kn.hpxd("hqbs", hpxp(int ), (int)58));
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var18_21).putFloat(var19_22).putFloat(var20_23 - var18_21).putFloat(var21_24 - var19_22);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var1_1).putFloat(var2_2).putFloat(var3_3).putFloat(var4_4);
        if (var28_19 || var28_19) ** GOTO lbl6
        kn.putRadii(var22_25, var5_5, var5_5, var5_5, var5_5);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var6_6).putFloat(var7_7).putFloat(var8_8).putFloat(var9_9);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var10_10).putFloat(var11_11).putFloat(0.0f).putFloat(0.0f);
        if (var28_19 || var28_19) ** GOTO lbl6
        kn.putColor(var22_25, var14_14);
        if (var28_19 || var28_19) ** GOTO lbl6
        kn.putColor(var22_25, var15_15);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var12_12).putFloat(var13_13).putFloat(0.0f).putFloat(0.0f);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.putFloat(var16_16).putFloat(0.0f).putFloat(0.0f).putFloat(0.0f);
        if (var28_19 || var28_19) ** GOTO lbl6
        var22_25.flip();
        if (var28_19 || var28_19) ** GOTO lbl6
        var23_26 = RenderSystem.getDevice().createCommandEncoder();
        if (var28_19 || var28_19) ** GOTO lbl6
        var23_26.writeToBuffer(kn.uniformBuffer.slice(), var22_25);
        if (var28_19 || var28_19) ** GOTO lbl6
        var24_27 = class_310.method_1551().method_1522();
        if (var28_19 || var28_19) ** GOTO lbl6
        var25_28 = var23_26.createRenderPass((Supplier<String>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$draw$1(), ()Ljava/lang/String;)(), var24_27.method_71639(), OptionalInt.empty());
        if (var29_18 /* !! */  == 0) ** GOTO lbl-1000
        switch (var29_18 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var28_19) ** GOTO lbl6
                try {
                    if (var28_19) ** GOTO lbl6
                    oq.applyToPass(var25_28);
                    if (var28_19 || var28_19) ** GOTO lbl6
                    var25_28.setPipeline(kn.pipeline);
                    if (var28_19 || var28_19) ** GOTO lbl6
                    var25_28.setUniform("Uniforms", kn.uniformBuffer);
                    if (var28_19 || var28_19) ** GOTO lbl6
                    var25_28.draw((int)kn.hpxd("hqbt", hpxp(int ), (int)59), (int)kn.hpxd("hqbu", hpxp(int ), (int)60));
                    if (var28_19 || var28_19) ** GOTO lbl6
                    if (var25_28 == null) ** GOTO lbl137
                    if (var28_19) ** GOTO lbl6
                }
                catch (Throwable var26_29) {
                    if (var28_19) ** GOTO lbl6
                    if (var25_28 == null) ** GOTO lbl130
                    if (var28_19) ** GOTO lbl6
                    try {
                        if (var28_19) ** GOTO lbl6
                        var25_28.close();
                        if (var28_19 || var28_19) ** GOTO lbl6
                        ** if (!var30_17) goto lbl-1000
                    }
                    catch (Throwable var27_30) {
                        if (var28_19) ** GOTO lbl6
                        var26_29.addSuppressed(var27_30);
                        if (var28_19) ** GOTO lbl6
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

                    if (var28_19 || var28_19) ** GOTO lbl6
                    throw var26_29;
                }
                var25_28.close();
                if (var28_19) ** GOTO lbl6
                if (var30_17) {
                    throw null;
                }
lbl137:
                // 3 sources

                if (!var28_19 && !var28_19) ** break;
                ** continue;
                return;
            }
lbl140:
            // 2 sources

            case 0: {
                var29_18 /* !! */  = (int)kn.hpxd("hqbv", hpxp(int ), (int)61);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl488
            }
lbl145:
            // 2 sources

            case 1: {
                var29_18 /* !! */  = (int)kn.hpxd("hqbw", hpxp(int ), (int)62);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl150:
            // 4 sources

            case 2: {
                var29_18 /* !! */  = (int)kn.hpxd("hqbx", hpxp(int ), (int)63);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 3: {
                var29_18 /* !! */  = (int)kn.hpxd("hqby", hpxp(int ), (int)64);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl160:
            // 3 sources

            case 4: {
                var29_18 /* !! */  = (int)kn.hpxd("hqbz", hpxp(int ), (int)65);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 5: {
                var29_18 /* !! */  = (int)kn.hpxd("hqca", hpxp(int ), (int)66);
                if (!var30_17) ** GOTO lbl160
                throw null;
            }
            case 6: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcb", hpxp(int ), (int)67);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl174:
            // 3 sources

            case 7: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcc", hpxp(int ), (int)68);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl553
            }
            case 8: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcd", hpxp(int ), (int)69);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl184:
            // 5 sources

            case 9: {
                var29_18 /* !! */  = (int)kn.hpxd("hqce", hpxp(int ), (int)70);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 10: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcf", hpxp(int ), (int)71);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl194:
            // 2 sources

            case 11: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcg", hpxp(int ), (int)72);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl561
            }
            case 12: {
                var29_18 /* !! */  = (int)kn.hpxd("hqch", hpxp(int ), (int)73);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl204:
            // 3 sources

            case 13: {
                var29_18 /* !! */  = (int)kn.hpxd("hqci", hpxp(int ), (int)74);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl209:
            // 2 sources

            case 14: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcj", hpxp(int ), (int)75);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 15: {
                do {
                    var29_18 /* !! */  = (int)kn.hpxd("hqck", hpxp(int ), (int)76);
                } while (!var30_17);
                throw null;
            }
lbl219:
            // 3 sources

            case 16: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcl", hpxp(int ), (int)77);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 17: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcm", hpxp(int ), (int)78);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 18: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcn", hpxp(int ), (int)79);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl234:
            // 3 sources

            case 19: {
                var29_18 /* !! */  = (int)kn.hpxd("hqco", hpxp(int ), (int)80);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl475
            }
            case 20: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcp", hpxp(int ), (int)81);
                if (!var30_17) break;
                throw null;
            }
lbl243:
            // 3 sources

            case 21: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcq", hpxp(int ), (int)82);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl513
            }
lbl248:
            // 3 sources

            case 22: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcr", hpxp(int ), (int)83);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 23: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcs", hpxp(int ), (int)84);
                if (!var30_17) ** GOTO lbl184
                throw null;
            }
lbl257:
            // 2 sources

            case 24: {
                var29_18 /* !! */  = (int)kn.hpxd("hqct", hpxp(int ), (int)85);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl262:
            // 2 sources

            case 25: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcu", hpxp(int ), (int)86);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl267:
            // 2 sources

            case 26: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcv", hpxp(int ), (int)87);
                if (!var30_17) ** GOTO lbl150
                throw null;
            }
            case 27: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcw", hpxp(int ), (int)88);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl276:
            // 3 sources

            case 28: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcx", hpxp(int ), (int)89);
                if (!var30_17) ** GOTO lbl219
                throw null;
            }
lbl280:
            // 2 sources

            case 29: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcy", hpxp(int ), (int)90);
                if (!var30_17) ** GOTO lbl248
                throw null;
            }
lbl284:
            // 2 sources

            case 30: {
                var29_18 /* !! */  = (int)kn.hpxd("hqcz", hpxp(int ), (int)91);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl525
            }
lbl289:
            // 3 sources

            case 31: {
                var29_18 /* !! */  = (int)kn.hpxd("hqda", hpxp(int ), (int)92);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl529
            }
            case 32: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdb", hpxp(int ), (int)93);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl299:
            // 3 sources

            case 33: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdc", hpxp(int ), (int)94);
                if (!var30_17) ** GOTO lbl289
                throw null;
            }
lbl303:
            // 3 sources

            case 34: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdd", hpxp(int ), (int)95);
                if (!var30_17) ** GOTO lbl234
                throw null;
            }
lbl307:
            // 2 sources

            case 35: {
                var29_18 /* !! */  = (int)kn.hpxd("hqde", hpxp(int ), (int)96);
                if (!var30_17) ** GOTO lbl234
                throw null;
            }
            case 36: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdf", hpxp(int ), (int)97);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl316:
            // 2 sources

            case 37: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdg", hpxp(int ), (int)98);
                if (!var30_17) ** GOTO lbl150
                throw null;
            }
            case 38: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdh", hpxp(int ), (int)99);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl557
            }
            case 39: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdi", hpxp(int ), (int)100);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl445
            }
lbl330:
            // 3 sources

            case 40: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdj", hpxp(int ), (int)101);
                if (!var30_17) ** GOTO lbl280
                throw null;
            }
            case 41: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdk", hpxp(int ), (int)102);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl553
            }
lbl339:
            // 2 sources

            case 42: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdl", hpxp(int ), (int)103);
                if (!var30_17) ** GOTO lbl174
                throw null;
            }
            case 43: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdm", hpxp(int ), (int)104);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 44: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdn", hpxp(int ), (int)105);
                if (!var30_17) ** GOTO lbl145
                throw null;
            }
lbl352:
            // 2 sources

            case 45: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdo", hpxp(int ), (int)106);
                if (!var30_17) ** GOTO lbl303
                throw null;
            }
            case 46: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var29_18 /* !! */  = (int)kn.hpxd("hqdp", hpxp(int ), (int)107);
                    if (!var30_17) ** GOTO lbl330
                    throw null;
                }
            }
lbl361:
            // 2 sources

            case 47: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdq", hpxp(int ), (int)108);
                if (!var30_17) ** GOTO lbl316
                throw null;
            }
lbl365:
            // 2 sources

            case 48: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdr", hpxp(int ), (int)109);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl521
            }
            case 49: {
                var29_18 /* !! */  = (int)kn.hpxd("hqds", hpxp(int ), (int)110);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl549
            }
lbl375:
            // 5 sources

            case 50: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdt", hpxp(int ), (int)111);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl461
            }
lbl380:
            // 2 sources

            case 51: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdu", hpxp(int ), (int)112);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl385:
            // 2 sources

            case 52: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdv", hpxp(int ), (int)113);
                if (!var30_17) ** GOTO lbl204
                throw null;
            }
lbl389:
            // 2 sources

            case 53: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdw", hpxp(int ), (int)114);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl453
            }
lbl394:
            // 2 sources

            case 54: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdx", hpxp(int ), (int)115);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl529
            }
lbl399:
            // 2 sources

            case 55: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdy", hpxp(int ), (int)116);
                if (!var30_17) ** GOTO lbl262
                throw null;
            }
lbl403:
            // 2 sources

            case 56: {
                var29_18 /* !! */  = (int)kn.hpxd("hqdz", hpxp(int ), (int)117);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl461
            }
            case 57: {
                var29_18 /* !! */  = (int)kn.hpxd("hqea", hpxp(int ), (int)118);
                if (!var30_17) ** GOTO lbl375
                throw null;
            }
lbl412:
            // 2 sources

            case 58: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeb", hpxp(int ), (int)119);
                if (!var30_17) ** GOTO lbl204
                throw null;
            }
            case 59: {
                var29_18 /* !! */  = (int)kn.hpxd("hqec", hpxp(int ), (int)120);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl457
            }
            case 60: {
                var29_18 /* !! */  = (int)kn.hpxd("hqed", hpxp(int ), (int)121);
                if (!var30_17) ** GOTO lbl403
                throw null;
            }
            case 61: {
                var29_18 /* !! */  = (int)kn.hpxd("hqee", hpxp(int ), (int)122);
                if (!var30_17) ** GOTO lbl276
                throw null;
            }
lbl429:
            // 3 sources

            case 62: {
                var29_18 /* !! */  = (int)kn.hpxd("hqef", hpxp(int ), (int)123);
                if (!var30_17) ** GOTO lbl267
                throw null;
            }
lbl433:
            // 2 sources

            case 63: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeg", hpxp(int ), (int)124);
                if (!var30_17) ** GOTO lbl184
                throw null;
            }
lbl437:
            // 3 sources

            case 64: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeh", hpxp(int ), (int)125);
                if (!var30_17) ** GOTO lbl219
                throw null;
            }
            case 65: {
                var29_18 /* !! */  = (int)kn.hpxd("hqei", hpxp(int ), (int)126);
                if (!var30_17) ** GOTO lbl243
                throw null;
            }
lbl445:
            // 3 sources

            case 66: {
                var29_18 /* !! */  = (int)kn.hpxd("hqej", hpxp(int ), (int)127);
                if (!var30_17) ** GOTO lbl140
                throw null;
            }
lbl449:
            // 2 sources

            case 67: {
                var29_18 /* !! */  = (int)kn.hpxd("hqek", hpxp(int ), (int)128);
                if (!var30_17) ** GOTO lbl150
                throw null;
            }
lbl453:
            // 2 sources

            case 68: {
                var29_18 /* !! */  = (int)kn.hpxd("hqel", hpxp(int ), (int)129);
                if (!var30_17) ** GOTO lbl375
                throw null;
            }
lbl457:
            // 2 sources

            case 69: {
                var29_18 /* !! */  = (int)kn.hpxd("hqem", hpxp(int ), (int)130);
                if (!var30_17) ** GOTO lbl375
                throw null;
            }
lbl461:
            // 3 sources

            case 70: {
                var29_18 /* !! */  = (int)kn.hpxd("hqen", hpxp(int ), (int)131);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl483
            }
lbl466:
            // 3 sources

            case 71: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeo", hpxp(int ), (int)132);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl471:
            // 2 sources

            case 72: {
                var29_18 /* !! */  = (int)kn.hpxd("hqep", hpxp(int ), (int)133);
                if (!var30_17) ** GOTO lbl243
                throw null;
            }
lbl475:
            // 2 sources

            case 73: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeq", hpxp(int ), (int)134);
                if (!var30_17) ** GOTO lbl449
                throw null;
            }
lbl479:
            // 2 sources

            case 74: {
                var29_18 /* !! */  = (int)kn.hpxd("hqer", hpxp(int ), (int)135);
                if (!var30_17) ** GOTO lbl194
                throw null;
            }
lbl483:
            // 3 sources

            case 75: {
                var29_18 /* !! */  = (int)kn.hpxd("hqes", hpxp(int ), (int)136);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl561
            }
lbl488:
            // 2 sources

            case 76: {
                var29_18 /* !! */  = (int)kn.hpxd("hqet", hpxp(int ), (int)137);
                if (!var30_17) ** GOTO lbl284
                throw null;
            }
            case 77: {
                var29_18 /* !! */  = (int)kn.hpxd("hqeu", hpxp(int ), (int)138);
                if (var30_17) {
                    throw null;
                }
                ** GOTO lbl525
            }
            case 78: {
                var29_18 /* !! */  = (int)kn.hpxd("hqev", hpxp(int ), (int)139);
                if (!var30_17) ** GOTO lbl445
                throw null;
            }
            case 79: {
                var29_18 /* !! */  = (int)kn.hpxd("hqew", hpxp(int ), (int)140);
                if (!var30_17) ** GOTO lbl471
                throw null;
            }
            case 80: {
                var29_18 /* !! */  = (int)kn.hpxd("hqex", hpxp(int ), (int)141);
                if (!var30_17) ** GOTO lbl365
                throw null;
            }
            case 81: {
                var29_18 /* !! */  = (int)kn.hpxd("hqey", hpxp(int ), (int)142);
                if (!var30_17) ** GOTO lbl174
                throw null;
            }
lbl513:
            // 2 sources

            case 82: {
                var29_18 /* !! */  = (int)kn.hpxd("hqez", hpxp(int ), (int)143);
                if (!var30_17) ** GOTO lbl209
                throw null;
            }
lbl517:
            // 2 sources

            case 83: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfa", hpxp(int ), (int)144);
                if (!var30_17) ** GOTO lbl303
                throw null;
            }
lbl521:
            // 3 sources

            case 84: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfb", hpxp(int ), (int)145);
                if (!var30_17) ** GOTO lbl248
                throw null;
            }
lbl525:
            // 3 sources

            case 85: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfc", hpxp(int ), (int)146);
                if (!var30_17) ** GOTO lbl479
                throw null;
            }
lbl529:
            // 3 sources

            case 86: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfd", hpxp(int ), (int)147);
                if (!var30_17) ** GOTO lbl466
                throw null;
            }
            case 87: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfe", hpxp(int ), (int)148);
                if (!var30_17) break;
                throw null;
            }
lbl537:
            // 2 sources

            case 88: {
                var29_18 /* !! */  = (int)kn.hpxd("hqff", hpxp(int ), (int)149);
                if (!var30_17) ** GOTO lbl184
                throw null;
            }
            case 89: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfg", hpxp(int ), (int)150);
                if (!var30_17) ** GOTO lbl466
                throw null;
            }
            case 90: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfh", hpxp(int ), (int)151);
                if (!var30_17) ** GOTO lbl330
                throw null;
            }
lbl549:
            // 2 sources

            case 91: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfi", hpxp(int ), (int)152);
                if (!var30_17) ** GOTO lbl437
                throw null;
            }
lbl553:
            // 3 sources

            case 92: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfj", hpxp(int ), (int)153);
                if (!var30_17) ** GOTO lbl160
                throw null;
            }
lbl557:
            // 2 sources

            case 93: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfk", hpxp(int ), (int)154);
                if (!var30_17) ** GOTO lbl483
                throw null;
            }
lbl561:
            // 3 sources

            case 94: {
                var29_18 /* !! */  = (int)kn.hpxd("hqfl", hpxp(int ), (int)155);
                if (!var30_17) ** GOTO lbl380
                throw null;
            }
            case 95: 
        }
        var29_18 /* !! */  = (int)kn.hpxd("hqfm", hpxp(int ), (int)156);
        ** while (!var30_17)
lbl568:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lambda$draw$1() {
        Object object = os;
        block8: while (true) {
            switch ((int)object) {
                case -947918021: {
                    object = kn.hpxd("hrsq", hpxa(int ), 112) - kn.hpxd("hrsp", hpxa(int ), 111);
                    continue block8;
                }
                case 1045739831: {
                    break block8;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = os - kn.hpxd("hrsr", hpxa(int ), 113)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kn.hpxd("hrss", hpxp(int ), 230)) break;
            object2 = kn.hpxd("hrst", hpxp(int ), 231);
        }
        int n2 = b;
        Object object3 = os;
        block10: while (true) {
            switch ((int)object3) {
                case -1887226649: {
                    object3 = kn.hpxd("hrsv", hpxa(int ), 115) - kn.hpxd("hrsu", hpxa(int ), 114);
                    continue block10;
                }
                case 1045739831: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) {
            return null;
        }
        return "TooltipBubble2D";
    }

    private static void hrto() {
        kn.hpxq[200] = -1529353897;
        kn.hpxq[201] = 2053702991;
        kn.hpxq[202] = -411472633;
        kn.hpxq[203] = 1217040469;
        kn.hpxq[204] = -1735594538;
        kn.hpxq[205] = 1596033273;
        kn.hpxq[206] = 529069811;
        kn.hpxq[207] = -1414085376;
        kn.hpxq[208] = 1691900158;
        kn.hpxq[209] = -857326869;
        kn.hpxq[210] = 2134589624;
        kn.hpxq[211] = 1275671024;
        kn.hpxq[212] = -1123321584;
        kn.hpxq[213] = -916996304;
        kn.hpxq[214] = 1850987594;
        kn.hpxq[215] = 864605595;
        kn.hpxq[216] = -2059496060;
        kn.hpxq[217] = 438835768;
        kn.hpxq[218] = -318259130;
        kn.hpxq[219] = 1436583023;
        kn.hpxq[220] = 1237042647;
        kn.hpxq[221] = -1479895740;
        kn.hpxq[222] = -1211558904;
        kn.hpxq[223] = -1445036352;
        kn.hpxq[224] = -448311656;
        kn.hpxq[225] = -879088440;
        kn.hpxq[226] = 1036297735;
        kn.hpxq[227] = 1717500246;
        kn.hpxq[228] = -1314920858;
        kn.hpxq[229] = -143220944;
        kn.hpxq[230] = -210074512;
        kn.hpxq[231] = 2098034145;
        kn.hpxq[232] = 1838393141;
        kn.hpxq[233] = -2108960282;
        kn.hpxq[234] = 1685598371;
        kn.hpxq[235] = 1627023032;
        kn.hpxq[236] = -778605626;
        kn.hpxq[237] = -2048182875;
        kn.hpxq[238] = 1793334432;
        kn.hpxq[239] = -1554851731;
        kn.hpxq[240] = 1468957442;
        kn.hpxq[241] = -1825973562;
        kn.hpxq[242] = 634994447;
        kn.hpxq[243] = 1391588454;
    }

    private static void hrtq() {
        kn.hpxr[100] = 1379437076;
        kn.hpxr[101] = 631514542;
        kn.hpxr[102] = 356786286;
        kn.hpxr[103] = -1499557452;
        kn.hpxr[104] = -143260841;
        kn.hpxr[105] = -763662923;
        kn.hpxr[106] = -1553480624;
        kn.hpxr[107] = -977668439;
        kn.hpxr[108] = 2013169814;
        kn.hpxr[109] = -1979674766;
        kn.hpxr[110] = -2137391510;
        kn.hpxr[111] = 885439772;
        kn.hpxr[112] = 2124905160;
        kn.hpxr[113] = -1628157934;
        kn.hpxr[114] = -482427364;
        kn.hpxr[115] = -379730811;
        kn.hpxr[116] = 144263287;
        kn.hpxr[117] = -1510440566;
        kn.hpxr[118] = -265668028;
        kn.hpxr[119] = 623574470;
        kn.hpxr[120] = 1835830434;
        kn.hpxr[121] = 1172787620;
        kn.hpxr[122] = 390563006;
        kn.hpxr[123] = 118674011;
        kn.hpxr[124] = 46118884;
        kn.hpxr[125] = 2041730649;
        kn.hpxr[126] = -1038724567;
        kn.hpxr[127] = -118863153;
        kn.hpxr[128] = 1360766933;
        kn.hpxr[129] = -1108671642;
        kn.hpxr[130] = 148306416;
        kn.hpxr[131] = -689526671;
        kn.hpxr[132] = -327167825;
        kn.hpxr[133] = -855001831;
        kn.hpxr[134] = -349703544;
        kn.hpxr[135] = 251684423;
        kn.hpxr[136] = 1028971828;
        kn.hpxr[137] = 1217567851;
        kn.hpxr[138] = 2068336118;
        kn.hpxr[139] = 164681027;
        kn.hpxr[140] = 1494149327;
        kn.hpxr[141] = -2020288429;
        kn.hpxr[142] = 744946324;
        kn.hpxr[143] = 1664141236;
        kn.hpxr[144] = 1387706361;
        kn.hpxr[145] = -571387816;
        kn.hpxr[146] = -1398879213;
        kn.hpxr[147] = -229507073;
        kn.hpxr[148] = -1390177570;
        kn.hpxr[149] = 10232936;
        kn.hpxr[150] = 1320915139;
        kn.hpxr[151] = 1987335822;
        kn.hpxr[152] = 958768703;
        kn.hpxr[153] = -1159412248;
        kn.hpxr[154] = 1994700561;
        kn.hpxr[155] = 972212999;
        kn.hpxr[156] = 863702681;
        kn.hpxr[157] = -529271615;
        kn.hpxr[158] = -681053817;
        kn.hpxr[159] = -1327900370;
        kn.hpxr[160] = 1209550644;
        kn.hpxr[161] = -810440515;
        kn.hpxr[162] = -1798573438;
        kn.hpxr[163] = 1570953912;
        kn.hpxr[164] = -1047449962;
        kn.hpxr[165] = -543683080;
        kn.hpxr[166] = -673992433;
        kn.hpxr[167] = 2143936942;
        kn.hpxr[168] = -812267093;
        kn.hpxr[169] = -687966365;
        kn.hpxr[170] = -1424025246;
        kn.hpxr[171] = -1465830738;
        kn.hpxr[172] = -795152516;
        kn.hpxr[173] = 893209394;
        kn.hpxr[174] = -1216279590;
        kn.hpxr[175] = -1193454813;
        kn.hpxr[176] = 571650022;
        kn.hpxr[177] = 122076328;
        kn.hpxr[178] = 326506637;
        kn.hpxr[179] = 661592048;
        kn.hpxr[180] = -978267959;
        kn.hpxr[181] = -1995061253;
        kn.hpxr[182] = -714921708;
        kn.hpxr[183] = -413361836;
        kn.hpxr[184] = -1336752565;
        kn.hpxr[185] = -1502076824;
        kn.hpxr[186] = 129033530;
        kn.hpxr[187] = -1906311547;
        kn.hpxr[188] = -1218368297;
        kn.hpxr[189] = 823733711;
        kn.hpxr[190] = -22977537;
        kn.hpxr[191] = -145911296;
        kn.hpxr[192] = -1328986746;
        kn.hpxr[193] = 665306442;
        kn.hpxr[194] = -964726521;
        kn.hpxr[195] = -2043059470;
        kn.hpxr[196] = -215653550;
        kn.hpxr[197] = -275057625;
        kn.hpxr[198] = 1282331620;
        kn.hpxr[199] = 890457961;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        block92: {
            v0 /* !! */  = kn.os;
            if (true) ** GOTO lbl5
            block62: while (true) {
                v0 /* !! */  = (long)(v1 - kn.hpxd("hrqg", hpxa(int ), (int)80));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 239934273: {
                        v1 = kn.hpxd("hrqh", hpxa(int ), (int)81);
                        continue block62;
                    }
                    case 1045739831: {
                        break block62;
                    }
                    case 1518505631: {
                        v1 = kn.hpxd("hrqi", hpxa(int ), (int)82);
                        continue block62;
                    }
                    case 1813942758: {
                        v1 = kn.hpxd("hrqj", hpxa(int ), (int)83);
                        continue block62;
                    }
                }
                break;
            }
            var2 = kn.c;
            v2 /* !! */  = kn.os;
            if (true) ** GOTO lbl22
            block63: while (true) {
                v2 /* !! */  = (long)(v3 - kn.hpxd("hrqk", hpxa(int ), (int)84));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1113541873: {
                        v3 = kn.hpxd("hrql", hpxa(int ), (int)85);
                        continue block63;
                    }
                    case 1045739831: {
                        break block63;
                    }
                    case 1908317878: {
                        v3 = kn.hpxd("hrqm", hpxa(int ), (int)86);
                        continue block63;
                    }
                }
                break;
            }
            var1_1 /* !! */  = kn.b;
            v4 /* !! */  = kn.os;
            if (true) ** GOTO lbl36
            block64: while (true) {
                v4 /* !! */  = (long)(v5 - kn.hpxd("hrqn", hpxa(int ), (int)87));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 652859535: {
                        v5 = kn.hpxd("hrqo", hpxa(int ), (int)88);
                        continue block64;
                    }
                    case 1045739831: {
                        break block64;
                    }
                    case 1906599214: {
                        v5 = kn.hpxd("hrqp", hpxa(int ), (int)89);
                        continue block64;
                    }
                }
                break;
            }
            var0_2 = kn.a;
            if (var2) {
                throw null;
lbl48:
                // 11 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl48
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = kn.os - kn.hpxd("hrqq", hpxa(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == kn.hpxd("hrqr", hpxp(int ), (int)200)) break;
                v6 /* !! */  = (long)kn.hpxd("hrqs", hpxp(int ), (int)201);
            }
            if (kn.uniformBuffer == null) break block92;
            if (var0_2 || var0_2) ** GOTO lbl48
            v7 /* !! */  = kn.os;
            if (true) ** GOTO lbl62
            block67: while (true) {
                v7 /* !! */  = (long)(v8 - kn.hpxd("hrqt", hpxa(int ), (int)91));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1298276420: {
                        v8 = kn.hpxd("hrqu", hpxa(int ), (int)92);
                        continue block67;
                    }
                    case -639707773: {
                        v8 = kn.hpxd("hrqv", hpxa(int ), (int)93);
                        continue block67;
                    }
                    case -529144216: {
                        v8 = kn.hpxd("hrqw", hpxa(int ), (int)94);
                        continue block67;
                    }
                    case 1045739831: {
                        break block67;
                    }
                }
                break;
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = kn.os - kn.hpxd("hrqx", hpxa(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == kn.hpxd("hrqy", hpxp(int ), (int)202)) break;
                v9 /* !! */  = (long)kn.hpxd("hrqz", hpxp(int ), (int)203);
            }
            kn.uniformBuffer.close();
            if (var0_2 || var0_2) ** GOTO lbl48
            v10 /* !! */  = kn.os;
            if (true) ** GOTO lbl85
            block69: while (true) {
                v10 /* !! */  = (long)(v11 - kn.hpxd("hrra", hpxa(int ), (int)96));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 497323735: {
                        v11 = kn.hpxd("hrrb", hpxa(int ), (int)97);
                        continue block69;
                    }
                    case 511063474: {
                        v11 = kn.hpxd("hrrc", hpxa(int ), (int)98);
                        continue block69;
                    }
                    case 1045739831: {
                        break block69;
                    }
                    case 1870831160: {
                        v11 = kn.hpxd("hrrd", hpxa(int ), (int)99);
                        continue block69;
                    }
                }
                break;
            }
            kn.uniformBuffer = null;
            if (var0_2) ** GOTO lbl48
        }
        if (var0_2 || var0_2) ** GOTO lbl48
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = kn.os - kn.hpxd("hrre", hpxa(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == kn.hpxd("hrrf", hpxp(int ), (int)204)) break;
            v12 /* !! */  = (long)kn.hpxd("hrrg", hpxp(int ), (int)205);
        }
        if (kn.uniformData == null) ** GOTO lbl153
        if (var0_2 || var0_2) ** GOTO lbl48
        v13 /* !! */  = kn.os;
        if (true) ** GOTO lbl112
        block71: while (true) {
            v13 /* !! */  = (long)(v14 - kn.hpxd("hrrh", hpxa(int ), (int)101));
lbl112:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1743507519: {
                    v14 = kn.hpxd("hrri", hpxa(int ), (int)102);
                    continue block71;
                }
                case -1478834495: {
                    v14 = kn.hpxd("hrrj", hpxa(int ), (int)103);
                    continue block71;
                }
                case -1348321156: {
                    v14 = kn.hpxd("hrrk", hpxa(int ), (int)104);
                    continue block71;
                }
                case 1045739831: {
                    break block71;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = kn.os - kn.hpxd("hrrl", hpxa(int ), (int)105)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == kn.hpxd("hrrm", hpxp(int ), (int)206)) break;
            v15 /* !! */  = (long)kn.hpxd("hrrn", hpxp(int ), (int)207);
        }
        MemoryUtil.memFree((Buffer)kn.uniformData);
        if (var0_2) ** GOTO lbl48
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl48
                v16 /* !! */  = kn.os;
                if (true) ** GOTO lbl139
                block73: while (true) {
                    v16 /* !! */  = (long)(v17 - kn.hpxd("hrro", hpxa(int ), (int)106));
lbl139:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -353877239: {
                            v17 = kn.hpxd("hrrp", hpxa(int ), (int)107);
                            continue block73;
                        }
                        case 59017148: {
                            v17 = kn.hpxd("hrrq", hpxa(int ), (int)108);
                            continue block73;
                        }
                        case 999764341: {
                            v17 = kn.hpxd("hrrr", hpxa(int ), (int)109);
                            continue block73;
                        }
                        case 1045739831: {
                            break block73;
                        }
                    }
                    break;
                }
                kn.uniformData = null;
                if (var0_2) ** GOTO lbl48
lbl153:
                // 2 sources

                if (var0_2 || var0_2) ** GOTO lbl48
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = kn.os - kn.hpxd("hrrs", hpxa(int ), (int)110)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == kn.hpxd("hrrt", hpxp(int ), (int)208)) break;
                    v18 /* !! */  = (long)kn.hpxd("hrru", hpxp(int ), (int)209);
                }
                kn.pipeline = null;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl163:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)kn.hpxd("hrrv", hpxp(int ), (int)210);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl168:
            // 3 sources

            case 1: {
                var1_1 /* !! */  = (int)kn.hpxd("hrrw", hpxp(int ), (int)211);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl173:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)kn.hpxd("hrrx", hpxp(int ), (int)212);
                if (!var2) ** GOTO lbl163
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)kn.hpxd("hrry", hpxp(int ), (int)213);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl182:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kn.hpxd("hrrz", hpxp(int ), (int)214);
                if (!var2) ** GOTO lbl173
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsa", hpxp(int ), (int)215);
                if (!var2) ** GOTO lbl168
                throw null;
            }
lbl190:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsb", hpxp(int ), (int)216);
                if (!var2) ** GOTO lbl168
                throw null;
            }
lbl194:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsc", hpxp(int ), (int)217);
                if (!var2) ** GOTO lbl190
                throw null;
            }
lbl198:
            // 3 sources

            case 8: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsd", hpxp(int ), (int)218);
                if (var2) {
                    throw null;
                }
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kn.hpxd("hrse", hpxp(int ), (int)219);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl235
                    break;
                }
            }
            case 10: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsf", hpxp(int ), (int)220);
                if (!var2) ** GOTO lbl198
                throw null;
            }
            case 11: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsg", hpxp(int ), (int)221);
                if (!var2) ** GOTO lbl198
                throw null;
            }
lbl216:
            // 2 sources

            case 12: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsh", hpxp(int ), (int)222);
                if (!var2) ** GOTO lbl182
                throw null;
            }
lbl220:
            // 3 sources

            case 13: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsi", hpxp(int ), (int)223);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 14: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsj", hpxp(int ), (int)224);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 15: {
                do {
                    var1_1 /* !! */  = (int)kn.hpxd("hrsk", hpxp(int ), (int)225);
                } while (!var2);
                throw null;
            }
lbl235:
            // 4 sources

            case 16: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsl", hpxp(int ), (int)226);
                if (!var2) ** GOTO lbl220
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsm", hpxp(int ), (int)227);
                if (!var2) ** GOTO lbl220
                throw null;
            }
lbl243:
            // 2 sources

            case 18: {
                var1_1 /* !! */  = (int)kn.hpxd("hrsn", hpxp(int ), (int)228);
                if (!var2) ** GOTO lbl173
                throw null;
            }
            case 19: 
        }
        var1_1 /* !! */  = (int)kn.hpxd("hrso", hpxp(int ), (int)229);
        ** while (!var2)
lbl250:
        // 1 sources

        throw null;
    }

    private static void hrtm() {
        kn.hpxq[0] = -1468361528;
        kn.hpxq[1] = 1268812513;
        kn.hpxq[2] = -1675070146;
        kn.hpxq[3] = 1814910259;
        kn.hpxq[4] = -1257538075;
        kn.hpxq[5] = -1166105827;
        kn.hpxq[6] = 2095132957;
        kn.hpxq[7] = 343928135;
        kn.hpxq[8] = -1543283854;
        kn.hpxq[9] = -560100443;
        kn.hpxq[10] = 1422507380;
        kn.hpxq[11] = 1908326559;
        kn.hpxq[12] = 1704170846;
        kn.hpxq[13] = 1726360574;
        kn.hpxq[14] = -394757727;
        kn.hpxq[15] = -1821470819;
        kn.hpxq[16] = 347906054;
        kn.hpxq[17] = -2123246437;
        kn.hpxq[18] = 980536988;
        kn.hpxq[19] = -827915095;
        kn.hpxq[20] = 314689639;
        kn.hpxq[21] = -2035652931;
        kn.hpxq[22] = 1714799403;
        kn.hpxq[23] = -376125143;
        kn.hpxq[24] = -614553672;
        kn.hpxq[25] = 909559410;
        kn.hpxq[26] = 384643561;
        kn.hpxq[27] = -2100480364;
        kn.hpxq[28] = -193683949;
        kn.hpxq[29] = 2082057768;
        kn.hpxq[30] = -1518595202;
        kn.hpxq[31] = 609065048;
        kn.hpxq[32] = 1218099124;
        kn.hpxq[33] = 1477122858;
        kn.hpxq[34] = 1407290851;
        kn.hpxq[35] = -1122748088;
        kn.hpxq[36] = 986845169;
        kn.hpxq[37] = -1971113630;
        kn.hpxq[38] = 1180043246;
        kn.hpxq[39] = 1886895152;
        kn.hpxq[40] = -1135016623;
        kn.hpxq[41] = 680411360;
        kn.hpxq[42] = 708230476;
        kn.hpxq[43] = -517363478;
        kn.hpxq[44] = 1608489276;
        kn.hpxq[45] = -179368759;
        kn.hpxq[46] = -2136243801;
        kn.hpxq[47] = -436688667;
        kn.hpxq[48] = -62647818;
        kn.hpxq[49] = -1062978313;
        kn.hpxq[50] = 1305108004;
        kn.hpxq[51] = -2002644618;
        kn.hpxq[52] = 496939616;
        kn.hpxq[53] = -947986786;
        kn.hpxq[54] = 816201199;
        kn.hpxq[55] = -1088050297;
        kn.hpxq[56] = -322368265;
        kn.hpxq[57] = -703869166;
        kn.hpxq[58] = -184906551;
        kn.hpxq[59] = -1884697811;
        kn.hpxq[60] = -304544367;
        kn.hpxq[61] = 1156621629;
        kn.hpxq[62] = 608541297;
        kn.hpxq[63] = 2131354191;
        kn.hpxq[64] = -983997234;
        kn.hpxq[65] = 1593723284;
        kn.hpxq[66] = -1254164508;
        kn.hpxq[67] = -392739133;
        kn.hpxq[68] = 552451536;
        kn.hpxq[69] = -1703209156;
        kn.hpxq[70] = 1267273485;
        kn.hpxq[71] = 36969862;
        kn.hpxq[72] = -1331918567;
        kn.hpxq[73] = -1058041547;
        kn.hpxq[74] = 565017246;
        kn.hpxq[75] = 1174120070;
        kn.hpxq[76] = -62612186;
        kn.hpxq[77] = 2071857718;
        kn.hpxq[78] = -899161169;
        kn.hpxq[79] = 2116702119;
        kn.hpxq[80] = 829513672;
        kn.hpxq[81] = -1585526093;
        kn.hpxq[82] = -600087041;
        kn.hpxq[83] = -1540664647;
        kn.hpxq[84] = 185819042;
        kn.hpxq[85] = -794850573;
        kn.hpxq[86] = -7683701;
        kn.hpxq[87] = -2570771;
        kn.hpxq[88] = -723964339;
        kn.hpxq[89] = 173955588;
        kn.hpxq[90] = -332669474;
        kn.hpxq[91] = -2091492917;
        kn.hpxq[92] = -1858164290;
        kn.hpxq[93] = 1873100823;
        kn.hpxq[94] = -1678550073;
        kn.hpxq[95] = -1044499210;
        kn.hpxq[96] = 572985577;
        kn.hpxq[97] = 1775055167;
        kn.hpxq[98] = 1279084507;
        kn.hpxq[99] = 1180345367;
    }

    private kn() {
    }

    private static void hrtu() {
        kn.hpxc[0] = -8723889001045268488L;
        kn.hpxc[1] = -5093796777085054610L;
        kn.hpxc[2] = -649286757396256029L;
        kn.hpxc[3] = -2954798684018407354L;
        kn.hpxc[4] = -6044758486893258898L;
        kn.hpxc[5] = 3110300610678801121L;
        kn.hpxc[6] = 2638748951217596398L;
        kn.hpxc[7] = -2259299306654757725L;
        kn.hpxc[8] = 5033854414855530857L;
        kn.hpxc[9] = 8709081817257866064L;
        kn.hpxc[10] = -4373842924019683512L;
        kn.hpxc[11] = -4976246275516740021L;
        kn.hpxc[12] = -8812908418384112964L;
        kn.hpxc[13] = -5631229800314247705L;
        kn.hpxc[14] = -8601638191979788485L;
        kn.hpxc[15] = -3608486800586795320L;
        kn.hpxc[16] = -5307276407839623096L;
        kn.hpxc[17] = 2302130838182525446L;
        kn.hpxc[18] = 3481414510903825696L;
        kn.hpxc[19] = -8373294958393392093L;
        kn.hpxc[20] = -8926239379401684763L;
        kn.hpxc[21] = 7663993224162783788L;
        kn.hpxc[22] = 6488025569116090153L;
        kn.hpxc[23] = 5885849273549299637L;
        kn.hpxc[24] = -5089766058759597953L;
        kn.hpxc[25] = -5447777668751375078L;
        kn.hpxc[26] = 7901979529114354031L;
        kn.hpxc[27] = 5919189612301727721L;
        kn.hpxc[28] = 4821470307109909421L;
        kn.hpxc[29] = 7853574584935598015L;
        kn.hpxc[30] = -759915772378953347L;
        kn.hpxc[31] = -6950188400628456773L;
        kn.hpxc[32] = -1660378591780068230L;
        kn.hpxc[33] = -6337703623107391658L;
        kn.hpxc[34] = -3956393015973666336L;
        kn.hpxc[35] = 5697453200092948866L;
        kn.hpxc[36] = -8007210914277509119L;
        kn.hpxc[37] = 5313152095353346106L;
        kn.hpxc[38] = 9186633306838362568L;
        kn.hpxc[39] = -1320748380524691456L;
        kn.hpxc[40] = -3165284649103981425L;
        kn.hpxc[41] = -194223716891352093L;
        kn.hpxc[42] = -8258217618299396130L;
        kn.hpxc[43] = 8171931950845502466L;
        kn.hpxc[44] = 4232129882416675258L;
        kn.hpxc[45] = -6519678517385472518L;
        kn.hpxc[46] = 6872534104783938880L;
        kn.hpxc[47] = 5800015161492003931L;
        kn.hpxc[48] = 7928294038399030273L;
        kn.hpxc[49] = 737857995266760513L;
        kn.hpxc[50] = 5303479641843888036L;
        kn.hpxc[51] = -6257178319683150137L;
        kn.hpxc[52] = 2774462666903503964L;
        kn.hpxc[53] = -5414744513918648222L;
        kn.hpxc[54] = -8268027898934765814L;
        kn.hpxc[55] = -110107290927876241L;
        kn.hpxc[56] = -2040481487245925915L;
        kn.hpxc[57] = 6124347987772458833L;
        kn.hpxc[58] = -4197102622586882626L;
        kn.hpxc[59] = 5894233842502093156L;
        kn.hpxc[60] = -3010286067646967618L;
        kn.hpxc[61] = -7622633497831714967L;
        kn.hpxc[62] = 2847878654378798788L;
        kn.hpxc[63] = 1375697334735062092L;
        kn.hpxc[64] = 1622344977284649231L;
        kn.hpxc[65] = -1255921209860687767L;
        kn.hpxc[66] = -6094405685517678366L;
        kn.hpxc[67] = -5053100370907046461L;
        kn.hpxc[68] = -7929554656121575986L;
        kn.hpxc[69] = 8880576617601781818L;
        kn.hpxc[70] = 8913283488399510104L;
        kn.hpxc[71] = 7720045039055427038L;
        kn.hpxc[72] = -6906995689404988302L;
        kn.hpxc[73] = -4617628255477018400L;
        kn.hpxc[74] = -219201137138042442L;
        kn.hpxc[75] = 1795985899267566464L;
        kn.hpxc[76] = 7905096485681278701L;
        kn.hpxc[77] = -5241538769761535766L;
        kn.hpxc[78] = -1455732927419231085L;
        kn.hpxc[79] = 7602641022483430584L;
        kn.hpxc[80] = -1442874951137519762L;
        kn.hpxc[81] = -6580703952815007335L;
        kn.hpxc[82] = 6524423190070730564L;
        kn.hpxc[83] = -1474478801478194588L;
        kn.hpxc[84] = -3373333466890216101L;
        kn.hpxc[85] = 3355926852531586796L;
        kn.hpxc[86] = 193621625573983915L;
        kn.hpxc[87] = -2550818132527461528L;
        kn.hpxc[88] = -411058091476804511L;
        kn.hpxc[89] = 3775467096903237435L;
        kn.hpxc[90] = -6642232884268978153L;
        kn.hpxc[91] = -1799564532014401722L;
        kn.hpxc[92] = 779227164386014061L;
        kn.hpxc[93] = 3906458663156212216L;
        kn.hpxc[94] = 3679705816524390545L;
        kn.hpxc[95] = 4027093341128272065L;
        kn.hpxc[96] = 1650342881799472623L;
        kn.hpxc[97] = 2374409910203496519L;
        kn.hpxc[98] = -5206536419078599168L;
        kn.hpxc[99] = 2950795868500535539L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void putRadii(ByteBuffer var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kn.os - kn.hpxd("hqfn", hpxa(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kn.hpxd("hqfo", hpxp(int ), (int)157)) break;
            v0 /* !! */  = (long)kn.hpxd("hqfp", hpxp(int ), (int)158);
        }
        var7_5 = kn.c;
        v1 /* !! */  = kn.os;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(kn.hpxd("hqfr", hpxa(int ), (int)59) - kn.hpxd("hqfq", hpxa(int ), (int)58));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2085801543: {
                    continue block22;
                }
                case 1045739831: {
                    break block22;
                }
            }
            break;
        }
        var6_6 /* !! */  = kn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kn.os - kn.hpxd("hqfs", hpxa(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kn.hpxd("hqft", hpxp(int ), (int)159)) break;
            v2 /* !! */  = (long)kn.hpxd("hqfu", hpxp(int ), (int)160);
        }
        var5_7 = kn.a;
        if (var7_5) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var5_7 || var5_7) ** GOTO lbl25
        v3 /* !! */  = kn.os;
        if (true) ** GOTO lbl32
        block25: while (true) {
            v3 /* !! */  = (long)(kn.hpxd("hqfw", hpxa(int ), (int)62) - kn.hpxd("hqfv", hpxa(int ), (int)61));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1894250544: {
                    continue block25;
                }
                case 1045739831: {
                    break block25;
                }
            }
            break;
        }
        v4 = var0.putFloat(var3_3);
        v5 /* !! */  = kn.os;
        if (true) ** GOTO lbl42
        block26: while (true) {
            v5 /* !! */  = (long)(v6 - kn.hpxd("hqfx", hpxa(int ), (int)63));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1281622635: {
                    v6 = kn.hpxd("hqfy", hpxa(int ), (int)64);
                    continue block26;
                }
                case -481111828: {
                    v6 = kn.hpxd("hqfz", hpxa(int ), (int)65);
                    continue block26;
                }
                case 1045739831: {
                    break block26;
                }
            }
            break;
        }
        v7 = v4.putFloat(var2_2);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = kn.os - kn.hpxd("hqga", hpxa(int ), (int)66)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == kn.hpxd("hqgb", hpxp(int ), (int)161)) break;
            v8 /* !! */  = (long)kn.hpxd("hqgc", hpxp(int ), (int)162);
        }
        v9 = v7.putFloat(var4_4);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = kn.os - kn.hpxd("hqgd", hpxa(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == kn.hpxd("hqge", hpxp(int ), (int)163)) break;
            v10 /* !! */  = (long)kn.hpxd("hqgf", hpxp(int ), (int)164);
        }
        v9.putFloat(var1_1);
        if (var5_7) ** GOTO lbl25
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_7) ** break;
                ** continue;
                return;
            }
lbl71:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)kn.hpxd("hqgg", hpxp(int ), (int)165);
                    if (var7_5) {
                        throw null;
                    }
                    ** GOTO lbl86
                    break;
                }
            }
            case 1: {
                var6_6 /* !! */  = (int)kn.hpxd("hqgh", hpxp(int ), (int)166);
                if (!var7_5) ** GOTO lbl71
                throw null;
            }
lbl81:
            // 2 sources

            case 2: {
                var6_6 /* !! */  = (int)kn.hpxd("hqgi", hpxp(int ), (int)167);
                if (var7_5) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl86:
            // 2 sources

            case 3: {
                var6_6 /* !! */  = (int)kn.hpxd("hron", hpxp(int ), (int)168);
                if (!var7_5) ** GOTO lbl81
                throw null;
            }
lbl90:
            // 2 sources

            case 4: {
                var6_6 /* !! */  = (int)kn.hpxd("hroo", hpxp(int ), (int)169);
                if (!var7_5) break;
                throw null;
            }
            case 5: 
        }
        var6_6 /* !! */  = (int)kn.hpxd("hrop", hpxp(int ), (int)170);
        ** while (!var7_5)
lbl97:
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 63[SWITCH]
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

    private static int hpxp(int n2) {
        return hpxq[n2] ^ hpxr[n2];
    }

    public static CallSite hpxd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        hpxq = new int[244];
        hpxr = new int[244];
        kn.hrtm();
        kn.hrtn();
        kn.hrto();
        kn.hrtp();
        kn.hrtq();
        kn.hrtr();
        hpxb = new long[120];
        hpxc = new long[120];
        kn.hrts();
        kn.hrtt();
        kn.hrtu();
        kn.hrtv();
    }

    private static void hrtv() {
        kn.hpxc[100] = 5540016201627409236L;
        kn.hpxc[101] = -8956691755358944989L;
        kn.hpxc[102] = 3326619898907909494L;
        kn.hpxc[103] = 5154768726994975152L;
        kn.hpxc[104] = -9217812318484563871L;
        kn.hpxc[105] = 2682795558299648958L;
        kn.hpxc[106] = -619643971883097277L;
        kn.hpxc[107] = -1124270720536039218L;
        kn.hpxc[108] = 4523513562563688795L;
        kn.hpxc[109] = 5932583709511318920L;
        kn.hpxc[110] = 8255749257486067583L;
        kn.hpxc[111] = 9055059896365549872L;
        kn.hpxc[112] = -7596345183858083445L;
        kn.hpxc[113] = -2625795580148644636L;
        kn.hpxc[114] = -5946703800041565670L;
        kn.hpxc[115] = -779809201319879897L;
        kn.hpxc[116] = -2399759555843694473L;
        kn.hpxc[117] = -6327219402551668991L;
        kn.hpxc[118] = 3852253395553754142L;
        kn.hpxc[119] = 5101548890275506033L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lambda$init$0() {
        boolean bl2;
        Object object = os;
        block4: while (true) {
            switch ((int)object) {
                case 1045739831: {
                    break block4;
                }
                case 1170904189: {
                    object = kn.hpxd("hrtb", hpxa(int ), 117) - kn.hpxd("hrta", hpxa(int ), 116);
                    continue block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = os - kn.hpxd("hrtc", hpxa(int ), 118)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kn.hpxd("hrtd", hpxp(int ), 236)) break;
            object2 = kn.hpxd("hrte", hpxp(int ), 237);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = os - kn.hpxd("hrtf", hpxa(int ), 119)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kn.hpxd("hrtg", hpxp(int ), 238)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = kn.hpxd("hrth", hpxp(int ), 239);
        }
        if (!bl2 && !bl2) return "TooltipBubble2D Uniforms";
        return null;
    }

    private static void hrtp() {
        kn.hpxr[0] = -1468361527;
        kn.hpxr[1] = 569590754;
        kn.hpxr[2] = -1675070145;
        kn.hpxr[3] = 1484308636;
        kn.hpxr[4] = -1257538076;
        kn.hpxr[5] = 409936990;
        kn.hpxr[6] = 2095132956;
        kn.hpxr[7] = -901422922;
        kn.hpxr[8] = -1543283853;
        kn.hpxr[9] = -410714810;
        kn.hpxr[10] = 1422507381;
        kn.hpxr[11] = 250612430;
        kn.hpxr[12] = 1704170847;
        kn.hpxr[13] = -758263715;
        kn.hpxr[14] = -394757728;
        kn.hpxr[15] = -1780493727;
        kn.hpxr[16] = 347906055;
        kn.hpxr[17] = -1844647299;
        kn.hpxr[18] = 980536989;
        kn.hpxr[19] = 1917948327;
        kn.hpxr[20] = 314689638;
        kn.hpxr[21] = -1741792727;
        kn.hpxr[22] = 1714799402;
        kn.hpxr[23] = -266370037;
        kn.hpxr[24] = -614553671;
        kn.hpxr[25] = -218294481;
        kn.hpxr[26] = 384643561;
        kn.hpxr[27] = -2100480363;
        kn.hpxr[28] = -1718229364;
        kn.hpxr[29] = 2082057769;
        kn.hpxr[30] = -412126096;
        kn.hpxr[31] = 609065049;
        kn.hpxr[32] = -133609822;
        kn.hpxr[33] = 1477122978;
        kn.hpxr[34] = 1407290850;
        kn.hpxr[35] = 1764078858;
        kn.hpxr[36] = 986845168;
        kn.hpxr[37] = -1529892139;
        kn.hpxr[38] = 1180043022;
        kn.hpxr[39] = 1886895153;
        kn.hpxr[40] = 1811933259;
        kn.hpxr[41] = 680411375;
        kn.hpxr[42] = 708230474;
        kn.hpxr[43] = -517363482;
        kn.hpxr[44] = 1608489271;
        kn.hpxr[45] = -179368763;
        kn.hpxr[46] = -2136243808;
        kn.hpxr[47] = -436688671;
        kn.hpxr[48] = -62647820;
        kn.hpxr[49] = -1062978309;
        kn.hpxr[50] = 1305108012;
        kn.hpxr[51] = -2002644609;
        kn.hpxr[52] = 496939618;
        kn.hpxr[53] = -947986800;
        kn.hpxr[54] = 816201191;
        kn.hpxr[55] = -1088050293;
        kn.hpxr[56] = -322368261;
        kn.hpxr[57] = -703869155;
        kn.hpxr[58] = -184906615;
        kn.hpxr[59] = -1884697811;
        kn.hpxr[60] = -304544361;
        kn.hpxr[61] = 1156621606;
        kn.hpxr[62] = 608541263;
        kn.hpxr[63] = 2131354206;
        kn.hpxr[64] = -983997238;
        kn.hpxr[65] = 1593723315;
        kn.hpxr[66] = -1254164481;
        kn.hpxr[67] = -392739177;
        kn.hpxr[68] = 552451466;
        kn.hpxr[69] = -1703209186;
        kn.hpxr[70] = 1267273513;
        kn.hpxr[71] = 36969931;
        kn.hpxr[72] = -1331918571;
        kn.hpxr[73] = -1058041553;
        kn.hpxr[74] = 565017262;
        kn.hpxr[75] = 1174120088;
        kn.hpxr[76] = -62612207;
        kn.hpxr[77] = 2071857765;
        kn.hpxr[78] = -899161210;
        kn.hpxr[79] = 2116702136;
        kn.hpxr[80] = 829513716;
        kn.hpxr[81] = -1585526122;
        kn.hpxr[82] = -600087107;
        kn.hpxr[83] = -1540664643;
        kn.hpxr[84] = 185819045;
        kn.hpxr[85] = -794850630;
        kn.hpxr[86] = -7683650;
        kn.hpxr[87] = -2570755;
        kn.hpxr[88] = -723964317;
        kn.hpxr[89] = 173955586;
        kn.hpxr[90] = -332669485;
        kn.hpxr[91] = -2091492918;
        kn.hpxr[92] = -1858164250;
        kn.hpxr[93] = 1873100847;
        kn.hpxr[94] = -1678550037;
        kn.hpxr[95] = -1044499226;
        kn.hpxr[96] = 572985539;
        kn.hpxr[97] = 1775055138;
        kn.hpxr[98] = 1279084446;
        kn.hpxr[99] = 1180345397;
    }

    private static void hrts() {
        kn.hpxb[0] = 2302514501929824404L;
        kn.hpxb[1] = -6176926070760126009L;
        kn.hpxb[2] = 6400210198226461306L;
        kn.hpxb[3] = 8323915804906519931L;
        kn.hpxb[4] = 7531304099011648860L;
        kn.hpxb[5] = -5528983991825447454L;
        kn.hpxb[6] = 5500921942379926373L;
        kn.hpxb[7] = -5021945477640368921L;
        kn.hpxb[8] = 8598499065011940787L;
        kn.hpxb[9] = 1943121841186453500L;
        kn.hpxb[10] = 5952046153032123536L;
        kn.hpxb[11] = -6237634577450909633L;
        kn.hpxb[12] = 3840688007035299713L;
        kn.hpxb[13] = 4956578911127412548L;
        kn.hpxb[14] = -3229511735455168307L;
        kn.hpxb[15] = 2689946364744681869L;
        kn.hpxb[16] = -1731796095250379622L;
        kn.hpxb[17] = 2942090949317749339L;
        kn.hpxb[18] = -8254154190310528143L;
        kn.hpxb[19] = -6041722379152528437L;
        kn.hpxb[20] = -2740358162714828573L;
        kn.hpxb[21] = 6690316163017614246L;
        kn.hpxb[22] = 3539399899239316078L;
        kn.hpxb[23] = -5143427327088698974L;
        kn.hpxb[24] = 3636203406994041336L;
        kn.hpxb[25] = 1170480371549056156L;
        kn.hpxb[26] = 5624791524650519202L;
        kn.hpxb[27] = 974315964254577402L;
        kn.hpxb[28] = 2189218768742996004L;
        kn.hpxb[29] = 8296866414237865736L;
        kn.hpxb[30] = 6765671714422915348L;
        kn.hpxb[31] = -876962262088029582L;
        kn.hpxb[32] = 1621695143516378647L;
        kn.hpxb[33] = 5403410830086243132L;
        kn.hpxb[34] = 7441301784959832727L;
        kn.hpxb[35] = 5907817209722619329L;
        kn.hpxb[36] = -391430616475547806L;
        kn.hpxb[37] = -583003308524828059L;
        kn.hpxb[38] = -1058348091201711559L;
        kn.hpxb[39] = -2475185337166307641L;
        kn.hpxb[40] = 3035865010183224797L;
        kn.hpxb[41] = 4943526653944963433L;
        kn.hpxb[42] = 7606457401917143983L;
        kn.hpxb[43] = -3364208398001316155L;
        kn.hpxb[44] = -3629128742282699930L;
        kn.hpxb[45] = -2881281502710768628L;
        kn.hpxb[46] = 2084680467191944938L;
        kn.hpxb[47] = 2146613386305764380L;
        kn.hpxb[48] = -2378041936835643311L;
        kn.hpxb[49] = -6729712713955177382L;
        kn.hpxb[50] = 5303479641843887940L;
        kn.hpxb[51] = 6273255557006082835L;
        kn.hpxb[52] = 875623756714580258L;
        kn.hpxb[53] = -7119771228021423860L;
        kn.hpxb[54] = -2878929244274975501L;
        kn.hpxb[55] = 4334205677240992033L;
        kn.hpxb[56] = 8759207828150120904L;
        kn.hpxb[57] = 4873186201519385299L;
        kn.hpxb[58] = -997616687494910724L;
        kn.hpxb[59] = -4217795344256248530L;
        kn.hpxb[60] = 7210804192212660905L;
        kn.hpxb[61] = -7560960762424675610L;
        kn.hpxb[62] = -3976990915942504343L;
        kn.hpxb[63] = -6413418098199411719L;
        kn.hpxb[64] = 7546460913681014133L;
        kn.hpxb[65] = 6557757409544964531L;
        kn.hpxb[66] = 7412330231535218332L;
        kn.hpxb[67] = -5914102652399409192L;
        kn.hpxb[68] = -3880467366198892516L;
        kn.hpxb[69] = -7125522588097782288L;
        kn.hpxb[70] = -4949984361057169857L;
        kn.hpxb[71] = 1682614064302274714L;
        kn.hpxb[72] = -4670541533915475982L;
        kn.hpxb[73] = -7993429057801945607L;
        kn.hpxb[74] = 1810264766922770307L;
        kn.hpxb[75] = -3269507041623402268L;
        kn.hpxb[76] = 3547411479248438532L;
        kn.hpxb[77] = 4104459747376500393L;
        kn.hpxb[78] = 7477283427072523037L;
        kn.hpxb[79] = -6534850921854038284L;
        kn.hpxb[80] = -3538722164067627357L;
        kn.hpxb[81] = -6987855669400084906L;
        kn.hpxb[82] = -2782172938490224285L;
        kn.hpxb[83] = 6899102278554840868L;
        kn.hpxb[84] = -102056938330237215L;
        kn.hpxb[85] = 4851300614182715794L;
        kn.hpxb[86] = -8527321281198730168L;
        kn.hpxb[87] = 6728308090415377697L;
        kn.hpxb[88] = -8115896642955114883L;
        kn.hpxb[89] = 4972389265719068752L;
        kn.hpxb[90] = 3488610264153575398L;
        kn.hpxb[91] = -7154460166576074630L;
        kn.hpxb[92] = 8799818674706600167L;
        kn.hpxb[93] = 399079175410257807L;
        kn.hpxb[94] = 2559682141131372793L;
        kn.hpxb[95] = 1352991570475975225L;
        kn.hpxb[96] = -2507813337442558029L;
        kn.hpxb[97] = -4845871236732532095L;
        kn.hpxb[98] = -3540671089334742971L;
        kn.hpxb[99] = -8426912898451668911L;
    }
}

