/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_8646
 *  net.minecraft.class_9015
 */
package ruhack.phobia;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.regex.Pattern;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_8646;
import net.minecraft.class_9015;
import ruhack.phobia.c;
import ruhack.phobia.mq;
import ruhack.phobia.np$Snapshot;

public final class np
implements c {
    private static long[] lvbw;
    private static final Int2ObjectOpenHashMap<np$Snapshot> SNAPSHOTS;
    private static int[] lvbq;
    private static final Pattern HP_TOKEN;
    public static final boolean a;
    public static final int b;
    private static int[] lvbp;
    public static final boolean c;
    private static final Pattern HP_SUFFIX;
    protected static final long un = 1722883125469171232L;
    private static long[] lvbx;

    private static /* synthetic */ void lwbj() {
        np.lvbq[100] = 884668887;
        np.lvbq[101] = -1719697789;
        np.lvbq[102] = -1914909645;
        np.lvbq[103] = -1488185958;
        np.lvbq[104] = 1443900518;
        np.lvbq[105] = -1148452059;
        np.lvbq[106] = 22027711;
        np.lvbq[107] = 1217466012;
        np.lvbq[108] = -1007045794;
        np.lvbq[109] = 2070533982;
        np.lvbq[110] = 260519572;
        np.lvbq[111] = -1237325785;
        np.lvbq[112] = -1526885764;
        np.lvbq[113] = 377910043;
        np.lvbq[114] = 1682927681;
        np.lvbq[115] = 1308220512;
        np.lvbq[116] = 602574112;
        np.lvbq[117] = 95791157;
        np.lvbq[118] = 314056946;
        np.lvbq[119] = 633073572;
        np.lvbq[120] = 399785281;
        np.lvbq[121] = -290498748;
        np.lvbq[122] = -1058627536;
        np.lvbq[123] = 1522054567;
        np.lvbq[124] = 857365444;
        np.lvbq[125] = -1164659867;
        np.lvbq[126] = 1785084242;
        np.lvbq[127] = -1138309920;
        np.lvbq[128] = 1361820177;
        np.lvbq[129] = 1251966525;
        np.lvbq[130] = -1973399246;
        np.lvbq[131] = 284720164;
        np.lvbq[132] = -1400454940;
        np.lvbq[133] = 530054801;
        np.lvbq[134] = -62748576;
        np.lvbq[135] = -1403907909;
        np.lvbq[136] = 612263956;
        np.lvbq[137] = -640451974;
        np.lvbq[138] = -519161695;
        np.lvbq[139] = -1763832084;
        np.lvbq[140] = -1508961287;
        np.lvbq[141] = -1117289904;
        np.lvbq[142] = -1020335582;
        np.lvbq[143] = -807614743;
        np.lvbq[144] = -133619615;
        np.lvbq[145] = 1378246342;
        np.lvbq[146] = 860362570;
        np.lvbq[147] = -1430115959;
        np.lvbq[148] = 1776253502;
        np.lvbq[149] = 2040313782;
        np.lvbq[150] = -1083458109;
        np.lvbq[151] = 1287427426;
        np.lvbq[152] = 159463630;
        np.lvbq[153] = -1906091683;
        np.lvbq[154] = -1929643895;
        np.lvbq[155] = -1147347399;
        np.lvbq[156] = -1172519173;
        np.lvbq[157] = 1318679085;
        np.lvbq[158] = -336203726;
        np.lvbq[159] = 1600830583;
        np.lvbq[160] = -1954025612;
        np.lvbq[161] = 72333179;
        np.lvbq[162] = -671865562;
        np.lvbq[163] = -1277205314;
        np.lvbq[164] = 82936382;
        np.lvbq[165] = -1055278083;
        np.lvbq[166] = -1309224477;
        np.lvbq[167] = -603984369;
        np.lvbq[168] = -623500770;
        np.lvbq[169] = 689959506;
        np.lvbq[170] = 2141514394;
        np.lvbq[171] = 1462265940;
        np.lvbq[172] = -1066740128;
        np.lvbq[173] = 2058607099;
        np.lvbq[174] = 193771000;
        np.lvbq[175] = -1823535875;
        np.lvbq[176] = -1688994078;
        np.lvbq[177] = 1110941283;
        np.lvbq[178] = 466750952;
        np.lvbq[179] = 1757291344;
        np.lvbq[180] = 1379712886;
        np.lvbq[181] = 903423553;
        np.lvbq[182] = -753895824;
        np.lvbq[183] = 1268167943;
        np.lvbq[184] = 992595201;
        np.lvbq[185] = -1901875298;
        np.lvbq[186] = 1587992410;
        np.lvbq[187] = 1169437998;
        np.lvbq[188] = 941345179;
        np.lvbq[189] = -1563679458;
        np.lvbq[190] = 1312219343;
        np.lvbq[191] = -1833282140;
        np.lvbq[192] = 202839957;
        np.lvbq[193] = -1643215429;
        np.lvbq[194] = -888493093;
        np.lvbq[195] = -645183251;
        np.lvbq[196] = -1838224069;
        np.lvbq[197] = -2063632825;
        np.lvbq[198] = -1606958361;
        np.lvbq[199] = 1292253425;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Float fromScoreboard(class_1657 var0) {
        var16_1 = np.c;
        var15_2 /* !! */  = np.b;
        var14_3 = np.a;
        if (var16_1) {
            throw null;
lbl6:
            // 42 sources

            return null;
        }
        if (var14_3 || var14_3) ** GOTO lbl6
        var1_4 = np.mc.field_1687.method_8428();
        if (var14_3 || var14_3) ** GOTO lbl6
        var2_5 = new class_8646[]{class_8646.field_45158, class_8646.field_45156};
        if (var14_3 || var14_3) ** GOTO lbl6
        var3_6 = Math.max(1.0f, var0.method_6063());
        if (var14_3 || var14_3) ** GOTO lbl6
        var4_7 /* !! */  = np.lvbr("lvps", lvef(int ), (int)210);
        if (var14_3 || var14_3) ** GOTO lbl6
        var5_8 = var2_5;
        if (var14_3) ** GOTO lbl6
        var6_9 = var5_8.length;
        if (var14_3) ** GOTO lbl6
        var7_10 = np.lvbr("lvpt", lvbo(int ), (int)211);
        if (var14_3) ** GOTO lbl6
        block79: while (true) {
            block158: {
                block157: {
                    block156: {
                        block155: {
                            block154: {
                                block153: {
                                    if (var14_3 || var14_3) ** GOTO lbl6
                                    if (var7_10 >= var6_9) ** GOTO lbl101
                                    if (var14_3) ** GOTO lbl6
                                    var8_11 = var5_8[var7_10];
                                    if (var14_3 || var14_3) ** GOTO lbl6
                                    var9_12 = var1_4.method_1189(var8_11);
                                    if (var14_3 || var14_3) ** GOTO lbl6
                                    if (var9_12 != null) break block153;
                                    if (var14_3 || var14_3) ** GOTO lbl6
                                    if (var16_1) {
                                        throw null;
                                    }
                                    ** GOTO lbl96
                                }
                                if (var14_3 || var14_3) ** GOTO lbl6
                                var10_13 = var1_4.method_55430((class_9015)var0, var9_12);
                                if (var14_3 || var14_3) ** GOTO lbl6
                                if (var10_13 != null) break block154;
                                if (var14_3 || var14_3) ** GOTO lbl6
                                if (var16_1) {
                                    throw null;
                                }
                                ** GOTO lbl96
                            }
                            if (var14_3 || var14_3) ** GOTO lbl6
                            var11_14 = var10_13.method_55397();
                            if (var14_3 || var14_3) ** GOTO lbl6
                            if (var11_14 < 0) ** GOTO lbl96
                            if (var14_3) ** GOTO lbl6
                            if (var11_14 <= np.lvbr("lvpu", lvbo(int ), (int)212)) break block155;
                            if (var14_3 || var14_3) ** GOTO lbl6
                            if (var16_1) {
                                throw null;
                            }
                            ** GOTO lbl96
                        }
                        if (var14_3 || var14_3) ** GOTO lbl6
                        if (var11_14 != 0) break block156;
                        if (var14_3) ** GOTO lbl6
                        if (var0.method_5805()) break block156;
                        if (var14_3 || var14_3) ** GOTO lbl6
                        return Float.valueOf(0.0f);
                    }
                    if (var14_3 || var14_3) ** GOTO lbl6
                    if (!((float)var11_14 > var3_6 * np.lvbr("lvpv", lvef(int ), (int)213))) break block157;
                    if (var14_3 || var14_3) ** GOTO lbl6
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl96
                }
                if (var14_3 || var14_3) ** GOTO lbl6
                var12_15 = var11_14;
                if (var14_3 || var14_3) ** GOTO lbl6
                var13_16 = var9_12.method_1116().method_1225();
                if (var14_3 || var14_3) ** GOTO lbl6
                if (!"health".equals(var13_16)) break block158;
                if (var14_3) ** GOTO lbl6
                if (!(var12_15 > var3_6 + np.lvbr("lvpw", lvef(int ), (int)214))) break block158;
                if (var14_3 || var14_3) ** GOTO lbl6
                var12_15 = Math.min(var12_15, var3_6 * 2.0f);
                if (var14_3) ** GOTO lbl6
            }
            if (var14_3 || var14_3) ** GOTO lbl6
            if (Float.isNaN((float)var4_7 /* !! */ )) ** GOTO lbl-1000
            if (var14_3) ** GOTO lbl6
            if (var12_15 > 0.0f) ** GOTO lbl-1000
            if (var14_3) ** GOTO lbl6
            if (!(var4_7 /* !! */  <= 0.0f)) ** GOTO lbl96
            if (var14_3) ** GOTO lbl6
            if (var15_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var15_2 /* !! */ ) {
                default: lbl-1000:
                // 4 sources

                {
                    if (var14_3 || var14_3) ** GOTO lbl6
                    var4_7 /* !! */  = (CallSite)var12_15;
                    if (var14_3) ** GOTO lbl6
lbl96:
                    // 7 sources

                    if (var14_3 || var14_3) ** GOTO lbl6
                    ++var7_10;
                    if (var14_3) ** GOTO lbl6
                    if (!var16_1) continue block79;
                    throw null;
                }
lbl101:
                // 1 sources

                if (var14_3 || var14_3) ** GOTO lbl6
                if (!Float.isNaN((float)var4_7 /* !! */ )) ** GOTO lbl108
                if (var14_3) ** GOTO lbl6
                v0 = null;
                if (var16_1) {
                    throw null;
                }
                ** GOTO lbl111
lbl108:
                // 1 sources

                if (!var14_3 && !var14_3) ** break;
                ** continue;
                v0 = Float.valueOf((float)var4_7 /* !! */ );
lbl111:
                // 2 sources

                return v0;
lbl112:
                // 2 sources

                case 0: {
                    var15_2 /* !! */  = (int)np.lvbr("lvpx", lvbo(int ), (int)215);
                    if (var16_1) {
                        throw null;
                    }
                }
                case 1: {
                    var15_2 /* !! */  = (int)np.lvbr("lvpy", lvbo(int ), (int)216);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl121:
                // 2 sources

                case 2: {
                    var15_2 /* !! */  = (int)np.lvbr("lvpz", lvbo(int ), (int)217);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
lbl126:
                // 2 sources

                case 3: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqa", lvbo(int ), (int)218);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl261
                }
lbl131:
                // 2 sources

                case 4: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqb", lvbo(int ), (int)219);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
lbl136:
                // 2 sources

                case 5: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqc", lvbo(int ), (int)220);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl141:
                // 2 sources

                case 6: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqd", lvbo(int ), (int)221);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl422
                }
                case 7: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqe", lvbo(int ), (int)222);
                    if (!var16_1) break block79;
                    throw null;
                }
lbl150:
                // 4 sources

                case 8: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqf", lvbo(int ), (int)223);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
lbl155:
                // 2 sources

                case 9: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqg", lvbo(int ), (int)224);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl160:
                // 4 sources

                case 10: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqh", lvbo(int ), (int)225);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl317
                }
                case 11: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqi", lvbo(int ), (int)226);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl422
                }
                case 12: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqj", lvbo(int ), (int)227);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl367
                }
lbl175:
                // 3 sources

                case 13: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqk", lvbo(int ), (int)228);
                    if (!var16_1) ** GOTO lbl160
                    throw null;
                }
lbl179:
                // 2 sources

                case 14: {
                    var15_2 /* !! */  = (int)np.lvbr("lvql", lvbo(int ), (int)229);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl184:
                // 3 sources

                case 15: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqm", lvbo(int ), (int)230);
                    if (!var16_1) ** GOTO lbl175
                    throw null;
                }
lbl188:
                // 2 sources

                case 16: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqn", lvbo(int ), (int)231);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl300
                }
lbl193:
                // 2 sources

                case 17: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqo", lvbo(int ), (int)232);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl283
                }
lbl198:
                // 2 sources

                case 18: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqp", lvbo(int ), (int)233);
                    if (!var16_1) break block79;
                    throw null;
                }
lbl202:
                // 2 sources

                case 19: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var15_2 /* !! */  = (int)np.lvbr("lvqq", lvbo(int ), (int)234);
                        if (!var16_1) ** GOTO lbl131
                        throw null;
                    }
                }
lbl207:
                // 2 sources

                case 20: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqr", lvbo(int ), (int)235);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl354
                }
                case 21: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqs", lvbo(int ), (int)236);
                    if (!var16_1) ** GOTO lbl150
                    throw null;
                }
lbl216:
                // 2 sources

                case 22: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqt", lvbo(int ), (int)237);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl300
                }
                case 23: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqu", lvbo(int ), (int)238);
                    if (!var16_1) ** GOTO lbl160
                    throw null;
                }
lbl225:
                // 2 sources

                case 24: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqv", lvbo(int ), (int)239);
                    if (!var16_1) ** GOTO lbl216
                    throw null;
                }
lbl229:
                // 3 sources

                case 25: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqw", lvbo(int ), (int)240);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl422
                }
                case 26: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqx", lvbo(int ), (int)241);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl426
                }
lbl239:
                // 3 sources

                case 27: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqy", lvbo(int ), (int)242);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
                case 28: {
                    var15_2 /* !! */  = (int)np.lvbr("lvqz", lvbo(int ), (int)243);
                    if (!var16_1) ** GOTO lbl202
                    throw null;
                }
                case 29: {
                    var15_2 /* !! */  = (int)np.lvbr("lvra", lvbo(int ), (int)244);
                    if (var16_1) {
                        throw null;
                    }
                }
lbl252:
                // 5 sources

                case 30: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrb", lvbo(int ), (int)245);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
                case 31: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrc", lvbo(int ), (int)246);
                    if (!var16_1) ** GOTO lbl136
                    throw null;
                }
lbl261:
                // 3 sources

                case 32: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrd", lvbo(int ), (int)247);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl430
                }
                case 33: {
                    var15_2 /* !! */  = (int)np.lvbr("lvre", lvbo(int ), (int)248);
                    if (!var16_1) ** GOTO lbl141
                    throw null;
                }
lbl270:
                // 3 sources

                case 34: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrf", lvbo(int ), (int)249);
                    if (!var16_1) ** GOTO lbl184
                    throw null;
                }
lbl274:
                // 3 sources

                case 35: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrg", lvbo(int ), (int)250);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl296
                }
lbl279:
                // 4 sources

                case 36: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrh", lvbo(int ), (int)251);
                    if (!var16_1) ** GOTO lbl188
                    throw null;
                }
lbl283:
                // 2 sources

                case 37: {
                    var15_2 /* !! */  = (int)np.lvbr("lvri", lvbo(int ), (int)252);
                    if (!var16_1) ** GOTO lbl198
                    throw null;
                }
                case 38: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrj", lvbo(int ), (int)253);
                    if (!var16_1) ** GOTO lbl252
                    throw null;
                }
lbl291:
                // 2 sources

                case 39: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrk", lvbo(int ), (int)254);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl329
                }
lbl296:
                // 2 sources

                case 40: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrl", lvbo(int ), (int)255);
                    if (!var16_1) ** GOTO lbl175
                    throw null;
                }
lbl300:
                // 4 sources

                case 41: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrm", lvbo(int ), (int)256);
                    if (!var16_1) ** GOTO lbl270
                    throw null;
                }
                case 42: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrn", lvbo(int ), (int)257);
                    if (!var16_1) ** GOTO lbl261
                    throw null;
                }
                case 43: {
                    var15_2 /* !! */  = (int)np.lvbr("lvro", lvbo(int ), (int)258);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl346
                }
lbl313:
                // 2 sources

                case 44: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrp", lvbo(int ), (int)259);
                    if (!var16_1) ** GOTO lbl179
                    throw null;
                }
lbl317:
                // 3 sources

                case 45: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrq", lvbo(int ), (int)260);
                    if (!var16_1) ** GOTO lbl300
                    throw null;
                }
                case 46: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrr", lvbo(int ), (int)261);
                    if (!var16_1) ** GOTO lbl274
                    throw null;
                }
lbl325:
                // 2 sources

                case 47: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrs", lvbo(int ), (int)262);
                    if (!var16_1) ** GOTO lbl313
                    throw null;
                }
lbl329:
                // 2 sources

                case 48: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrt", lvbo(int ), (int)263);
                    if (!var16_1) ** GOTO lbl317
                    throw null;
                }
lbl333:
                // 2 sources

                case 49: {
                    var15_2 /* !! */  = (int)np.lvbr("lvru", lvbo(int ), (int)264);
                    if (!var16_1) ** GOTO lbl270
                    throw null;
                }
lbl337:
                // 2 sources

                case 50: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrv", lvbo(int ), (int)265);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl397
                }
lbl342:
                // 2 sources

                case 51: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrw", lvbo(int ), (int)266);
                    if (!var16_1) ** GOTO lbl207
                    throw null;
                }
lbl346:
                // 2 sources

                case 52: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrx", lvbo(int ), (int)267);
                    if (!var16_1) ** GOTO lbl112
                    throw null;
                }
lbl350:
                // 2 sources

                case 53: {
                    var15_2 /* !! */  = (int)np.lvbr("lvry", lvbo(int ), (int)268);
                    if (!var16_1) ** GOTO lbl291
                    throw null;
                }
lbl354:
                // 2 sources

                case 54: {
                    var15_2 /* !! */  = (int)np.lvbr("lvrz", lvbo(int ), (int)269);
                    if (!var16_1) ** GOTO lbl325
                    throw null;
                }
                case 55: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsa", lvbo(int ), (int)270);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl397
                }
                case 56: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsb", lvbo(int ), (int)271);
                    if (!var16_1) ** GOTO lbl126
                    throw null;
                }
lbl367:
                // 2 sources

                case 57: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsc", lvbo(int ), (int)272);
                    if (!var16_1) ** GOTO lbl150
                    throw null;
                }
                case 58: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsd", lvbo(int ), (int)273);
                    if (!var16_1) ** GOTO lbl150
                    throw null;
                }
                case 59: {
                    var15_2 /* !! */  = (int)np.lvbr("lvse", lvbo(int ), (int)274);
                    if (!var16_1) ** GOTO lbl337
                    throw null;
                }
                case 60: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsf", lvbo(int ), (int)275);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl409
                }
                case 61: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsg", lvbo(int ), (int)276);
                    if (!var16_1) ** GOTO lbl121
                    throw null;
                }
                case 62: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsh", lvbo(int ), (int)277);
                    if (!var16_1) ** GOTO lbl225
                    throw null;
                }
                case 63: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsi", lvbo(int ), (int)278);
                    if (var16_1) {
                        throw null;
                    }
                    ** GOTO lbl413
                }
lbl397:
                // 3 sources

                case 64: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsj", lvbo(int ), (int)279);
                    if (!var16_1) ** GOTO lbl350
                    throw null;
                }
                case 65: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsk", lvbo(int ), (int)280);
                    if (!var16_1) ** GOTO lbl279
                    throw null;
                }
                case 66: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsl", lvbo(int ), (int)281);
                    if (var16_1) {
                        throw null;
                    }
                }
lbl409:
                // 4 sources

                case 67: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsm", lvbo(int ), (int)282);
                    if (!var16_1) ** GOTO lbl252
                    throw null;
                }
lbl413:
                // 2 sources

                case 68: {
                    do {
                        var15_2 /* !! */  = (int)np.lvbr("lvsn", lvbo(int ), (int)283);
                    } while (!var16_1);
                    throw null;
                }
                case 69: {
                    var15_2 /* !! */  = (int)np.lvbr("lvso", lvbo(int ), (int)284);
                    if (!var16_1) ** GOTO lbl155
                    throw null;
                }
lbl422:
                // 4 sources

                case 70: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsp", lvbo(int ), (int)285);
                    if (!var16_1) ** GOTO lbl342
                    throw null;
                }
lbl426:
                // 3 sources

                case 71: {
                    var15_2 /* !! */  = (int)np.lvbr("lvsq", lvbo(int ), (int)286);
                    if (!var16_1) ** GOTO lbl279
                    throw null;
                }
lbl430:
                // 2 sources

                case 72: {
                    do {
                        var15_2 /* !! */  = (int)np.lvbr("lvsr", lvbo(int ), (int)287);
                    } while (!var16_1);
                    throw null;
                }
                case 73: {
                    var15_2 /* !! */  = (int)np.lvbr("lvss", lvbo(int ), (int)288);
                    if (!var16_1) ** GOTO lbl193
                    throw null;
                }
                case 74: {
                    var15_2 /* !! */  = (int)np.lvbr("lvst", lvbo(int ), (int)289);
                    if (!var16_1) ** GOTO lbl426
                    throw null;
                }
                case 75: 
            }
            break;
        }
        var15_2 /* !! */  = (int)np.lvbr("lvsu", lvbo(int ), (int)290);
        ** while (!var16_1)
lbl446:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwbs() {
        np.lvbx[200] = 4532364918192464022L;
        np.lvbx[201] = -6495920630175633713L;
        np.lvbx[202] = 4892421619491845350L;
        np.lvbx[203] = -8154279786667266069L;
        np.lvbx[204] = 6470271262190789915L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static np$Snapshot resolve(class_1657 var0, float var1_1) {
        block116: {
            v0 /* !! */  = np.un;
            if (true) ** GOTO lbl5
            block75: while (true) {
                v0 /* !! */  = (long)(v1 - np.lvbr("lvmm", lvbv(int ), (int)112));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 186306080: {
                        break block75;
                    }
                    case 221716720: {
                        v1 = np.lvbr("lvmn", lvbv(int ), (int)113);
                        continue block75;
                    }
                    case 385857125: {
                        v1 = np.lvbr("lvmo", lvbv(int ), (int)114);
                        continue block75;
                    }
                    case 964416238: {
                        v1 = np.lvbr("lvmp", lvbv(int ), (int)115);
                        continue block75;
                    }
                }
                break;
            }
            var7_2 = np.c;
            v2 /* !! */  = np.un;
            if (true) ** GOTO lbl22
            block76: while (true) {
                v2 /* !! */  = (long)(np.lvbr("lvmr", lvbv(int ), (int)117) - np.lvbr("lvmq", lvbv(int ), (int)116));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2054073091: {
                        continue block76;
                    }
                    case 186306080: {
                        break block76;
                    }
                }
                break;
            }
            var6_3 /* !! */  = np.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvms", lvbv(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == np.lvbr("lvmt", lvbo(int ), (int)164)) break;
                v3 /* !! */  = (long)np.lvbr("lvmu", lvbo(int ), (int)165);
            }
            var5_4 = np.a;
            if (var7_2) {
                throw null;
lbl36:
                // 10 sources

                return null;
            }
            if (var5_4 || var5_4) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvmv", lvbv(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == np.lvbr("lvmw", lvbo(int ), (int)166)) break;
                v4 /* !! */  = (long)np.lvbr("lvmx", lvbo(int ), (int)167);
            }
            var2_5 = np.fromScoreboard(var0);
            if (var5_4 || var5_4) ** GOTO lbl36
            if (var2_5 == null) break block116;
            if (var5_4 || var5_4) ** GOTO lbl36
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvmy", lvbv(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == np.lvbr("lvmz", lvbo(int ), (int)168)) break;
                v5 /* !! */  = (long)np.lvbr("lvna", lvbo(int ), (int)169);
            }
            v6 /* !! */  = np.un;
            if (true) ** GOTO lbl57
            block81: while (true) {
                v6 /* !! */  = (long)(v7 - np.lvbr("lvnb", lvbv(int ), (int)121));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2028262000: {
                        v7 = np.lvbr("lvnc", lvbv(int ), (int)122);
                        continue block81;
                    }
                    case -586965415: {
                        v7 = np.lvbr("lvnd", lvbv(int ), (int)123);
                        continue block81;
                    }
                    case 186306080: {
                        break block81;
                    }
                    case 686350004: {
                        v7 = np.lvbr("lvne", lvbv(int ), (int)124);
                        continue block81;
                    }
                }
                break;
            }
            v8 = var2_5.floatValue();
            v9 = np.lvbr("lvnf", lvbo(int ), (int)170);
            v10 /* !! */  = np.un;
            if (true) ** GOTO lbl75
            block82: while (true) {
                v10 /* !! */  = (long)(v11 - np.lvbr("lvng", lvbv(int ), (int)125));
lbl75:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1045008644: {
                        v11 = np.lvbr("lvnh", lvbv(int ), (int)126);
                        continue block82;
                    }
                    case 186306080: {
                        break block82;
                    }
                    case 300598068: {
                        v11 = np.lvbr("lvni", lvbv(int ), (int)127);
                        continue block82;
                    }
                }
                break;
            }
            return new np$Snapshot(v8, (boolean)v9);
        }
        if (var5_4 || var5_4) ** GOTO lbl36
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvnj", lvbv(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == np.lvbr("lvnk", lvbo(int ), (int)171)) break;
            v12 /* !! */  = (long)np.lvbr("lvnl", lvbo(int ), (int)172);
        }
        var3_6 = np.fromName((class_1309)var0);
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4 || var5_4) ** GOTO lbl36
                if (var3_6 == null) ** GOTO lbl129
                if (var5_4 || var5_4) ** GOTO lbl36
                v13 /* !! */  = np.un;
                if (true) ** GOTO lbl103
                block84: while (true) {
                    v13 /* !! */  = (long)(v14 - np.lvbr("lvnm", lvbv(int ), (int)129));
lbl103:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 186306080: {
                            break block84;
                        }
                        case 1048086610: {
                            v14 = np.lvbr("lvnn", lvbv(int ), (int)130);
                            continue block84;
                        }
                        case 1293594082: {
                            v14 = np.lvbr("lvno", lvbv(int ), (int)131);
                            continue block84;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lvnp", lvbv(int ), (int)132)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == np.lvbr("lvnq", lvbo(int ), (int)173)) break;
                    v15 /* !! */  = (long)np.lvbr("lvnr", lvbo(int ), (int)174);
                }
                v16 = var3_6.floatValue();
                v17 = np.lvbr("lvns", lvbo(int ), (int)175);
                v18 /* !! */  = np.un;
                if (true) ** GOTO lbl123
                block86: while (true) {
                    v18 /* !! */  = (long)(np.lvbr("lvnu", lvbv(int ), (int)134) - np.lvbr("lvnt", lvbv(int ), (int)133));
lbl123:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 186306080: {
                            break block86;
                        }
                        case 408152817: {
                            continue block86;
                        }
                    }
                    break;
                }
                return new np$Snapshot(v16, (boolean)v17);
lbl129:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl36
                v19 /* !! */  = np.un;
                if (true) ** GOTO lbl134
                block87: while (true) {
                    v19 /* !! */  = (long)(v20 - np.lvbr("lvnv", lvbv(int ), (int)135));
lbl134:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 186306080: {
                            break block87;
                        }
                        case 489857335: {
                            v20 = np.lvbr("lvnw", lvbv(int ), (int)136);
                            continue block87;
                        }
                        case 689162662: {
                            v20 = np.lvbr("lvnx", lvbv(int ), (int)137);
                            continue block87;
                        }
                        case 1446424519: {
                            v20 = np.lvbr("lvny", lvbv(int ), (int)138);
                            continue block87;
                        }
                    }
                    break;
                }
                if (!np.looksFake(var0, var1_1)) ** GOTO lbl181
                if (var5_4 || var5_4) ** GOTO lbl36
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = np.un - np.lvbr("lvnz", lvbv(int ), (int)139)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == np.lvbr("lvoa", lvbo(int ), (int)176)) break;
                    v21 /* !! */  = (long)np.lvbr("lvob", lvbo(int ), (int)177);
                }
                v22 = var0.method_6063();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = np.un - np.lvbr("lvoc", lvbv(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == np.lvbr("lvod", lvbo(int ), (int)178)) break;
                    v23 /* !! */  = (long)np.lvbr("lvoe", lvbo(int ), (int)179);
                }
                var4_7 = Math.max(1.0f, v22);
                if (var5_4 || var5_4) ** GOTO lbl36
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = np.un - np.lvbr("lvof", lvbv(int ), (int)141)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == np.lvbr("lvog", lvbo(int ), (int)180)) break;
                    v24 /* !! */  = (long)np.lvbr("lvoh", lvbo(int ), (int)181);
                }
                v25 = np.lvbr("lvoi", lvbo(int ), (int)182);
                v26 /* !! */  = np.un;
                if (true) ** GOTO lbl171
                block91: while (true) {
                    v26 /* !! */  = (long)(v27 - np.lvbr("lvoj", lvbv(int ), (int)142));
lbl171:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1182593133: {
                            v27 = np.lvbr("lvok", lvbv(int ), (int)143);
                            continue block91;
                        }
                        case 186306080: {
                            break block91;
                        }
                        case 2076488302: {
                            v27 = np.lvbr("lvol", lvbv(int ), (int)144);
                            continue block91;
                        }
                    }
                    break;
                }
                return new np$Snapshot(var4_7, (boolean)v25);
lbl181:
                // 1 sources

                if (var5_4 || var5_4) ** continue;
                v28 /* !! */  = np.un;
                if (true) ** GOTO lbl186
                block92: while (true) {
                    v28 /* !! */  = (long)(np.lvbr("lvon", lvbv(int ), (int)146) - np.lvbr("lvom", lvbv(int ), (int)145));
lbl186:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 186306080: {
                            break block92;
                        }
                        case 2134949125: {
                            continue block92;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_8 = np.un - np.lvbr("lvoo", lvbv(int ), (int)147)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == np.lvbr("lvop", lvbo(int ), (int)183)) break;
                    v29 /* !! */  = (long)np.lvbr("lvoq", lvbo(int ), (int)184);
                }
                v30 = Math.max(0.0f, var1_1);
                v31 = np.lvbr("lvor", lvbo(int ), (int)185);
                v32 /* !! */  = np.un;
                if (true) ** GOTO lbl202
                block94: while (true) {
                    v32 /* !! */  = (long)(np.lvbr("lvot", lvbv(int ), (int)149) - np.lvbr("lvos", lvbv(int ), (int)148));
lbl202:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1927873008: {
                            continue block94;
                        }
                        case 186306080: {
                            break block94;
                        }
                    }
                    break;
                }
                return new np$Snapshot(v30, (boolean)v31);
            }
            case 0: {
                var6_3 /* !! */  = (int)np.lvbr("lvou", lvbo(int ), (int)186);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl213:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)np.lvbr("lvov", lvbo(int ), (int)187);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 2: {
                var6_3 /* !! */  = (int)np.lvbr("lvow", lvbo(int ), (int)188);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 3: {
                var6_3 /* !! */  = (int)np.lvbr("lvox", lvbo(int ), (int)189);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl228:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)np.lvbr("lvoy", lvbo(int ), (int)190);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl233:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)np.lvbr("lvoz", lvbo(int ), (int)191);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 6: {
                var6_3 /* !! */  = (int)np.lvbr("lvpa", lvbo(int ), (int)192);
                if (!var7_2) ** GOTO lbl228
                throw null;
            }
lbl242:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)np.lvbr("lvpb", lvbo(int ), (int)193);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl247:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)np.lvbr("lvpc", lvbo(int ), (int)194);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl252:
            // 4 sources

            case 9: {
                var6_3 /* !! */  = (int)np.lvbr("lvpd", lvbo(int ), (int)195);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl257:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)np.lvbr("lvpe", lvbo(int ), (int)196);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl304
                    break;
                }
            }
lbl263:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)np.lvbr("lvpf", lvbo(int ), (int)197);
                if (!var7_2) break;
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)np.lvbr("lvpg", lvbo(int ), (int)198);
                if (!var7_2) ** GOTO lbl252
                throw null;
            }
            case 13: {
                var6_3 /* !! */  = (int)np.lvbr("lvph", lvbo(int ), (int)199);
                if (!var7_2) ** GOTO lbl242
                throw null;
            }
lbl275:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)np.lvbr("lvpi", lvbo(int ), (int)200);
                if (var7_2) {
                    throw null;
                }
            }
lbl279:
            // 4 sources

            case 15: {
                var6_3 /* !! */  = (int)np.lvbr("lvpj", lvbo(int ), (int)201);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 16: {
                var6_3 /* !! */  = (int)np.lvbr("lvpk", lvbo(int ), (int)202);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
lbl288:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)np.lvbr("lvpl", lvbo(int ), (int)203);
                if (!var7_2) ** GOTO lbl233
                throw null;
            }
lbl292:
            // 4 sources

            case 18: {
                var6_3 /* !! */  = (int)np.lvbr("lvpm", lvbo(int ), (int)204);
                if (!var7_2) ** GOTO lbl288
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)np.lvbr("lvpn", lvbo(int ), (int)205);
                if (!var7_2) ** GOTO lbl292
                throw null;
            }
lbl300:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)np.lvbr("lvpo", lvbo(int ), (int)206);
                if (!var7_2) ** GOTO lbl292
                throw null;
            }
lbl304:
            // 2 sources

            case 21: {
                var6_3 /* !! */  = (int)np.lvbr("lvpp", lvbo(int ), (int)207);
                if (!var7_2) break;
                throw null;
            }
lbl308:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)np.lvbr("lvpq", lvbo(int ), (int)208);
                if (!var7_2) ** GOTO lbl252
                throw null;
            }
            case 23: 
        }
        var6_3 /* !! */  = (int)np.lvbr("lvpr", lvbo(int ), (int)209);
        ** while (!var7_2)
lbl315:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lvbr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float lvef(int n2) {
        return Float.intBitsToFloat(lvbp[n2] ^ lvbq[n2]);
    }

    private static /* synthetic */ void lwbo() {
        np.lvbw[100] = 3708044912384843148L;
        np.lvbw[101] = -1691362673985612841L;
        np.lvbw[102] = -3868070602693730752L;
        np.lvbw[103] = -152462380165964965L;
        np.lvbw[104] = -743973474366175537L;
        np.lvbw[105] = 128859095602760713L;
        np.lvbw[106] = 8919026116658441001L;
        np.lvbw[107] = -7796376424241164726L;
        np.lvbw[108] = -1294898473040036696L;
        np.lvbw[109] = 3508145198771759235L;
        np.lvbw[110] = -820498614911496L;
        np.lvbw[111] = -8476119567841991922L;
        np.lvbw[112] = -8195457974114801781L;
        np.lvbw[113] = -7997627453131699244L;
        np.lvbw[114] = 2782040261692041022L;
        np.lvbw[115] = -9156684452730224031L;
        np.lvbw[116] = -5028720601574820324L;
        np.lvbw[117] = 761200383895196892L;
        np.lvbw[118] = 6399476026844781319L;
        np.lvbw[119] = 7114923170114391066L;
        np.lvbw[120] = 2584788550799114829L;
        np.lvbw[121] = 1469012777577075656L;
        np.lvbw[122] = -5026470301218375947L;
        np.lvbw[123] = 5781450529210209909L;
        np.lvbw[124] = -4219642456622734577L;
        np.lvbw[125] = 362589954017827861L;
        np.lvbw[126] = -187625450257068799L;
        np.lvbw[127] = -7621797483172478818L;
        np.lvbw[128] = -2638124299367363563L;
        np.lvbw[129] = -3061215422719414890L;
        np.lvbw[130] = 1533155723537423355L;
        np.lvbw[131] = -8248551158169155363L;
        np.lvbw[132] = 3428890271133509979L;
        np.lvbw[133] = 7503776761937681905L;
        np.lvbw[134] = 8293932031407704016L;
        np.lvbw[135] = -4939154139520486062L;
        np.lvbw[136] = 2259782847572047864L;
        np.lvbw[137] = 5124719489312064517L;
        np.lvbw[138] = 2607814609642581740L;
        np.lvbw[139] = -7981173044749704988L;
        np.lvbw[140] = 4484732455357625028L;
        np.lvbw[141] = -6768955405668923105L;
        np.lvbw[142] = -6624416582740996466L;
        np.lvbw[143] = 6444882608353041161L;
        np.lvbw[144] = -6562654835309883699L;
        np.lvbw[145] = 751853149607181808L;
        np.lvbw[146] = -5004110058687036756L;
        np.lvbw[147] = -5576706981219021412L;
        np.lvbw[148] = 5569944881531289044L;
        np.lvbw[149] = -2722310901124270631L;
        np.lvbw[150] = -8519787363860178047L;
        np.lvbw[151] = -6819389804371516019L;
        np.lvbw[152] = -2098666297861533438L;
        np.lvbw[153] = 4899904360797924817L;
        np.lvbw[154] = 3574692080362283565L;
        np.lvbw[155] = -584373297307451196L;
        np.lvbw[156] = 6973159770619408446L;
        np.lvbw[157] = -5508994478257096632L;
        np.lvbw[158] = 7538098193652704643L;
        np.lvbw[159] = -2977384032947857979L;
        np.lvbw[160] = -756847132312592670L;
        np.lvbw[161] = -4306817246659997828L;
        np.lvbw[162] = 685460876635753291L;
        np.lvbw[163] = -8180041175412938176L;
        np.lvbw[164] = 4678522709765437169L;
        np.lvbw[165] = 3276492134674635533L;
        np.lvbw[166] = 5122537394655565230L;
        np.lvbw[167] = 4890055762589400736L;
        np.lvbw[168] = -5558451220685656403L;
        np.lvbw[169] = 7334958745703683740L;
        np.lvbw[170] = -219985983902480518L;
        np.lvbw[171] = 3005173827622008835L;
        np.lvbw[172] = 4580724882770049537L;
        np.lvbw[173] = -1765579830777900718L;
        np.lvbw[174] = 7758792717313895451L;
        np.lvbw[175] = 7316814778508670262L;
        np.lvbw[176] = 6417741873956274499L;
        np.lvbw[177] = -1559216267833223688L;
        np.lvbw[178] = 9115598079002672167L;
        np.lvbw[179] = 6600578377382331867L;
        np.lvbw[180] = -3168582032569391499L;
        np.lvbw[181] = 5676748711029534034L;
        np.lvbw[182] = 2017277163261110224L;
        np.lvbw[183] = -8011984200917542032L;
        np.lvbw[184] = 7520397628379135890L;
        np.lvbw[185] = -2057258693339333437L;
        np.lvbw[186] = 3260988296541688441L;
        np.lvbw[187] = 1271828790111598678L;
        np.lvbw[188] = 6491343765338721928L;
        np.lvbw[189] = 157192921491084874L;
        np.lvbw[190] = 3752452253783105222L;
        np.lvbw[191] = 6338909608961494956L;
        np.lvbw[192] = 5281791964420423836L;
        np.lvbw[193] = 7848704799404201077L;
        np.lvbw[194] = 8404937759600495775L;
        np.lvbw[195] = -1248458157350516337L;
        np.lvbw[196] = -5380419750565347136L;
        np.lvbw[197] = 9114294256323164782L;
        np.lvbw[198] = 3179902486089803841L;
        np.lvbw[199] = 642703111816129972L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Float fromName(class_1309 var0) {
        block102: {
            block101: {
                v0 /* !! */  = np.un;
                if (true) ** GOTO lbl5
                block58: while (true) {
                    v0 /* !! */  = (long)(v1 - np.lvbr("lvsv", lvbv(int ), (int)150));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -462865677: {
                            v1 = np.lvbr("lvsw", lvbv(int ), (int)151);
                            continue block58;
                        }
                        case -426783940: {
                            v1 = np.lvbr("lvsx", lvbv(int ), (int)152);
                            continue block58;
                        }
                        case 186306080: {
                            break block58;
                        }
                    }
                    break;
                }
                var6_1 = np.c;
                v2 /* !! */  = np.un;
                if (true) ** GOTO lbl19
                block59: while (true) {
                    v2 /* !! */  = (long)(v3 - np.lvbr("lvsy", lvbv(int ), (int)153));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -107055059: {
                            v3 = np.lvbr("lvsz", lvbv(int ), (int)154);
                            continue block59;
                        }
                        case 186306080: {
                            break block59;
                        }
                        case 1793980347: {
                            v3 = np.lvbr("lvta", lvbv(int ), (int)155);
                            continue block59;
                        }
                    }
                    break;
                }
                var5_2 /* !! */  = np.b;
                v4 /* !! */  = np.un;
                if (true) ** GOTO lbl33
                block60: while (true) {
                    v4 /* !! */  = (long)(v5 - np.lvbr("lvtb", lvbv(int ), (int)156));
lbl33:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 112519762: {
                            v5 = np.lvbr("lvtc", lvbv(int ), (int)157);
                            continue block60;
                        }
                        case 186306080: {
                            break block60;
                        }
                        case 247775342: {
                            v5 = np.lvbr("lvtd", lvbv(int ), (int)158);
                            continue block60;
                        }
                    }
                    break;
                }
                var4_3 = np.a;
                if (var6_1) {
                    throw null;
lbl45:
                    // 15 sources

                    return null;
                }
                if (var4_3 || var4_3) ** GOTO lbl45
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvte", lvbv(int ), (int)159)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == np.lvbr("lvtf", lvbo(int ), (int)291)) break;
                    v6 /* !! */  = (long)np.lvbr("lvtg", lvbo(int ), (int)292);
                }
                v7 = var0.method_5476();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvth", lvbv(int ), (int)160)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == np.lvbr("lvti", lvbo(int ), (int)293)) break;
                    v8 /* !! */  = (long)np.lvbr("lvtj", lvbo(int ), (int)294);
                }
                v9 = v7.getString();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvtk", lvbv(int ), (int)161)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == np.lvbr("lvtl", lvbo(int ), (int)295)) break;
                    v10 /* !! */  = (long)np.lvbr("lvtm", lvbo(int ), (int)296);
                }
                var1_4 = np.parse(v9);
                if (var4_3 || var4_3) ** GOTO lbl45
                if (var1_4 == null) break block101;
                if (var4_3 || var4_3) ** GOTO lbl45
                return var1_4;
            }
            if (var4_3 || var4_3) ** GOTO lbl45
            if (!(var0 instanceof class_1657)) break block102;
            if (var4_3) ** GOTO lbl45
            var2_5 = (class_1657)var0;
            if (var4_3 || var4_3) ** GOTO lbl45
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvtn", lvbv(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == np.lvbr("lvto", lvbo(int ), (int)297)) break;
                v11 /* !! */  = (long)np.lvbr("lvtp", lvbo(int ), (int)298);
            }
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lvtq", lvbv(int ), (int)163)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == np.lvbr("lvtr", lvbo(int ), (int)299)) break;
                v12 /* !! */  = (long)np.lvbr("lvts", lvbo(int ), (int)300);
            }
            if (np.mc.method_1562() != null) ** GOTO lbl95
            if (var4_3) ** GOTO lbl45
        }
        if (var4_3) ** GOTO lbl45
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl45
                return null;
            }
lbl95:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl45
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_5 = np.un - np.lvbr("lvtt", lvbv(int ), (int)164)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == np.lvbr("lvtu", lvbo(int ), (int)301)) break;
                v13 /* !! */  = (long)np.lvbr("lvtv", lvbo(int ), (int)302);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = np.un - np.lvbr("lvtw", lvbv(int ), (int)165)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == np.lvbr("lvtx", lvbo(int ), (int)303)) break;
                v14 /* !! */  = (long)np.lvbr("lvty", lvbo(int ), (int)304);
            }
            v15 = np.mc.method_1562();
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_7 = np.un - np.lvbr("lvtz", lvbv(int ), (int)166)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == np.lvbr("lvua", lvbo(int ), (int)305)) break;
                v16 /* !! */  = (long)np.lvbr("lvub", lvbo(int ), (int)306);
            }
            v17 = var2_5.method_5667();
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_8 = np.un - np.lvbr("lvuc", lvbv(int ), (int)167)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == np.lvbr("lvud", lvbo(int ), (int)307)) break;
                v18 /* !! */  = (long)np.lvbr("lvue", lvbo(int ), (int)308);
            }
            var3_6 = v15.method_2871(v17);
            if (var4_3 || var4_3) ** GOTO lbl45
            if (var3_6 == null) ** GOTO lbl133
            if (var4_3) ** GOTO lbl45
            v19 /* !! */  = np.un;
            if (true) ** GOTO lbl126
            block71: while (true) {
                v19 /* !! */  = (long)(np.lvbr("lvug", lvbv(int ), (int)169) - np.lvbr("lvuf", lvbv(int ), (int)168));
lbl126:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case 186306080: {
                        break block71;
                    }
                    case 1392753078: {
                        continue block71;
                    }
                }
                break;
            }
            if (var3_6.method_2971() != null) ** GOTO lbl135
            if (var4_3) ** GOTO lbl45
lbl133:
            // 2 sources

            if (var4_3 || var4_3) ** GOTO lbl45
            return null;
lbl135:
            // 1 sources

            if (!var4_3 && !var4_3) ** break;
            ** continue;
            v20 /* !! */  = np.un;
            if (true) ** GOTO lbl141
            block72: while (true) {
                v20 /* !! */  = (long)(v21 - np.lvbr("lvuh", lvbv(int ), (int)170));
lbl141:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1751620144: {
                        v21 = np.lvbr("lvui", lvbv(int ), (int)171);
                        continue block72;
                    }
                    case 186306080: {
                        break block72;
                    }
                    case 1105952206: {
                        v21 = np.lvbr("lvuj", lvbv(int ), (int)172);
                        continue block72;
                    }
                }
                break;
            }
            v22 = var3_6.method_2971();
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_9 = np.un - np.lvbr("lvuk", lvbv(int ), (int)173)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == np.lvbr("lvul", lvbo(int ), (int)309)) break;
                v23 /* !! */  = (long)np.lvbr("lvum", lvbo(int ), (int)310);
            }
            v24 = v22.getString();
            v25 /* !! */  = np.un;
            if (true) ** GOTO lbl161
            block74: while (true) {
                v25 /* !! */  = (long)(np.lvbr("lvuo", lvbv(int ), (int)175) - np.lvbr("lvun", lvbv(int ), (int)174));
lbl161:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -1296749598: {
                        continue block74;
                    }
                    case 186306080: {
                        break block74;
                    }
                }
                break;
            }
            return np.parse(v24);
lbl167:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)np.lvbr("lvup", lvbo(int ), (int)311);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl172:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)np.lvbr("lvuq", lvbo(int ), (int)312);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl177:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)np.lvbr("lvur", lvbo(int ), (int)313);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl182:
            // 3 sources

            case 3: {
                var5_2 /* !! */  = (int)np.lvbr("lvus", lvbo(int ), (int)314);
                if (!var6_1) ** GOTO lbl167
                throw null;
            }
lbl186:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)np.lvbr("lvut", lvbo(int ), (int)315);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl191:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)np.lvbr("lvuu", lvbo(int ), (int)316);
                if (!var6_1) ** GOTO lbl172
                throw null;
            }
            case 6: {
                var5_2 /* !! */  = (int)np.lvbr("lvuv", lvbo(int ), (int)317);
                if (!var6_1) ** GOTO lbl191
                throw null;
            }
lbl199:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)np.lvbr("lvuw", lvbo(int ), (int)318);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl204:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)np.lvbr("lvux", lvbo(int ), (int)319);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 9: {
                var5_2 /* !! */  = (int)np.lvbr("lvuy", lvbo(int ), (int)320);
                if (!var6_1) ** GOTO lbl186
                throw null;
            }
            case 10: {
                var5_2 /* !! */  = (int)np.lvbr("lvuz", lvbo(int ), (int)321);
                if (!var6_1) ** GOTO lbl199
                throw null;
            }
lbl217:
            // 4 sources

            case 11: {
                var5_2 /* !! */  = (int)np.lvbr("lvva", lvbo(int ), (int)322);
                if (!var6_1) ** GOTO lbl199
                throw null;
            }
lbl221:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)np.lvbr("lvvb", lvbo(int ), (int)323);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl226:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)np.lvbr("lvvc", lvbo(int ), (int)324);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl231:
            // 2 sources

            case 14: {
                var5_2 /* !! */  = (int)np.lvbr("lvvd", lvbo(int ), (int)325);
                if (!var6_1) ** GOTO lbl182
                throw null;
            }
lbl235:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)np.lvbr("lvve", lvbo(int ), (int)326);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 16: {
                var5_2 /* !! */  = (int)np.lvbr("lvvf", lvbo(int ), (int)327);
                if (!var6_1) ** GOTO lbl221
                throw null;
            }
lbl244:
            // 2 sources

            case 17: {
                do {
                    var5_2 /* !! */  = (int)np.lvbr("lvvg", lvbo(int ), (int)328);
                } while (!var6_1);
                throw null;
            }
            case 18: {
                var5_2 /* !! */  = (int)np.lvbr("lvvh", lvbo(int ), (int)329);
                if (!var6_1) ** GOTO lbl217
                throw null;
            }
lbl253:
            // 3 sources

            case 19: {
                var5_2 /* !! */  = (int)np.lvbr("lvvi", lvbo(int ), (int)330);
                if (var6_1) {
                    throw null;
                }
            }
lbl257:
            // 4 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)np.lvbr("lvvj", lvbo(int ), (int)331);
                    if (!var6_1) ** GOTO lbl182
                    throw null;
                }
            }
            case 21: {
                do {
                    var5_2 /* !! */  = (int)np.lvbr("lvvk", lvbo(int ), (int)332);
                } while (!var6_1);
                throw null;
            }
lbl267:
            // 2 sources

            case 22: {
                var5_2 /* !! */  = (int)np.lvbr("lvvl", lvbo(int ), (int)333);
                if (!var6_1) ** GOTO lbl235
                throw null;
            }
            case 23: {
                var5_2 /* !! */  = (int)np.lvbr("lvvm", lvbo(int ), (int)334);
                if (!var6_1) ** GOTO lbl267
                throw null;
            }
lbl275:
            // 3 sources

            case 24: {
                var5_2 /* !! */  = (int)np.lvbr("lvvn", lvbo(int ), (int)335);
                if (!var6_1) ** GOTO lbl217
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)np.lvbr("lvvo", lvbo(int ), (int)336);
                if (!var6_1) ** GOTO lbl204
                throw null;
            }
            case 26: {
                var5_2 /* !! */  = (int)np.lvbr("lvvp", lvbo(int ), (int)337);
                if (!var6_1) ** GOTO lbl177
                throw null;
            }
            case 27: 
        }
        var5_2 /* !! */  = (int)np.lvbr("lvvq", lvbo(int ), (int)338);
        ** while (!var6_1)
lbl290:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwbh() {
        np.lvbp[400] = 1803354019;
        np.lvbp[401] = 1741558469;
        np.lvbp[402] = -541301330;
        np.lvbp[403] = -1764401748;
        np.lvbp[404] = 413075238;
        np.lvbp[405] = -283096646;
        np.lvbp[406] = 787553622;
        np.lvbp[407] = 875079053;
        np.lvbp[408] = 919281939;
        np.lvbp[409] = -477613255;
        np.lvbp[410] = -404243211;
        np.lvbp[411] = -1252705929;
        np.lvbp[412] = 868863082;
        np.lvbp[413] = 415124882;
        np.lvbp[414] = 43341395;
        np.lvbp[415] = -1657596096;
        np.lvbp[416] = -576978826;
        np.lvbp[417] = 1689522235;
        np.lvbp[418] = 1555265270;
        np.lvbp[419] = -384448011;
        np.lvbp[420] = 466746803;
        np.lvbp[421] = 1319527451;
        np.lvbp[422] = -1713557980;
        np.lvbp[423] = -1193240176;
        np.lvbp[424] = -1895604122;
        np.lvbp[425] = 1454925139;
        np.lvbp[426] = 1445660122;
        np.lvbp[427] = -1978248543;
        np.lvbp[428] = -158771047;
        np.lvbp[429] = -403073251;
        np.lvbp[430] = -2126766101;
        np.lvbp[431] = 1953164889;
        np.lvbp[432] = -984853513;
        np.lvbp[433] = -1176432032;
        np.lvbp[434] = -1542387825;
        np.lvbp[435] = -2056778129;
        np.lvbp[436] = 152817439;
        np.lvbp[437] = -2080429362;
        np.lvbp[438] = 1087518709;
        np.lvbp[439] = -1495969901;
        np.lvbp[440] = -1791336876;
        np.lvbp[441] = -1623451443;
        np.lvbp[442] = -615682439;
        np.lvbp[443] = 180989509;
        np.lvbp[444] = 726011916;
        np.lvbp[445] = -39731252;
        np.lvbp[446] = -1253490513;
        np.lvbp[447] = -1198112166;
        np.lvbp[448] = -1235531568;
        np.lvbp[449] = 633062607;
        np.lvbp[450] = -1485434674;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private np() {
        int n2 = b;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                break;
            }
            case 1: {
                while (true) {
                    CallSite callSite = np.lvbr("lvbt", lvbo(int ), (int)1);
                }
            }
            case 2: {
                CallSite callSite = np.lvbr("lvbu", lvbo(int ), (int)2);
            }
        }
        while (true) {
            CallSite callSite = np.lvbr("lvbs", lvbo(int ), (int)0);
        }
    }

    /*
     * Exception decompiling
     */
    private static Float parseNumber(String var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 17[SWITCH]
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
    public static float scoreboardTotal(class_1309 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvkp", lvbv(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == np.lvbr("lvkq", lvbo(int ), (int)133)) break;
            v0 /* !! */  = (long)np.lvbr("lvkr", lvbo(int ), (int)134);
        }
        var5_1 = np.c;
        v1 /* !! */  = np.un;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v1 /* !! */  = (long)(v2 - np.lvbr("lvks", lvbv(int ), (int)95));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -982515543: {
                    v2 = np.lvbr("lvkt", lvbv(int ), (int)96);
                    continue block36;
                }
                case -896576918: {
                    v2 = np.lvbr("lvku", lvbv(int ), (int)97);
                    continue block36;
                }
                case 186306080: {
                    break block36;
                }
                case 681703175: {
                    v2 = np.lvbr("lvkv", lvbv(int ), (int)98);
                    continue block36;
                }
            }
            break;
        }
        var4_2 /* !! */  = np.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvkw", lvbv(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == np.lvbr("lvkx", lvbo(int ), (int)135)) break;
            v3 /* !! */  = (long)np.lvbr("lvky", lvbo(int ), (int)136);
        }
        var3_3 = np.a;
        if (var5_1) {
            throw null;
lbl32:
            // 8 sources

            return (float)np.lvbr("lvkz", lvef(int ), (int)137);
        }
        if (var3_3 || var3_3) ** GOTO lbl32
        if (!(var0 instanceof class_1657)) ** GOTO lbl87
        if (var3_3) ** GOTO lbl32
        var1_4 = (class_1657)var0;
        if (var3_3 || var3_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvla", lvbv(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == np.lvbr("lvlb", lvbo(int ), (int)138)) break;
            v4 /* !! */  = (long)np.lvbr("lvlc", lvbo(int ), (int)139);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvld", lvbv(int ), (int)101)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == np.lvbr("lvle", lvbo(int ), (int)140)) break;
            v5 /* !! */  = (long)np.lvbr("lvlf", lvbo(int ), (int)141);
        }
        if (np.mc.field_1687 == null) ** GOTO lbl87
        if (var3_3 || var3_3) ** GOTO lbl32
        v6 /* !! */  = np.un;
        if (true) ** GOTO lbl55
        block41: while (true) {
            v6 /* !! */  = (long)(v7 - np.lvbr("lvlg", lvbv(int ), (int)102));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1694320702: {
                    v7 = np.lvbr("lvlh", lvbv(int ), (int)103);
                    continue block41;
                }
                case -1491790985: {
                    v7 = np.lvbr("lvli", lvbv(int ), (int)104);
                    continue block41;
                }
                case 186306080: {
                    break block41;
                }
                case 328307154: {
                    v7 = np.lvbr("lvlj", lvbv(int ), (int)105);
                    continue block41;
                }
            }
            break;
        }
        var2_5 = np.fromScoreboard(var1_4);
        if (var3_3 || var3_3) ** GOTO lbl32
        if (var2_5 == null) ** GOTO lbl87
        if (var3_3) ** GOTO lbl32
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lvlk", lvbv(int ), (int)106)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == np.lvbr("lvll", lvbo(int ), (int)142)) break;
                    v8 /* !! */  = (long)np.lvbr("lvlm", lvbo(int ), (int)143);
                }
                v9 = var2_5.floatValue();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = np.un - np.lvbr("lvln", lvbv(int ), (int)107)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == np.lvbr("lvlo", lvbo(int ), (int)144)) break;
                    v10 /* !! */  = (long)np.lvbr("lvlp", lvbo(int ), (int)145);
                }
                return Math.max(0.0f, v9);
            }
lbl87:
            // 3 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = np.un - np.lvbr("lvlq", lvbv(int ), (int)108)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == np.lvbr("lvlr", lvbo(int ), (int)146)) break;
                v11 /* !! */  = (long)np.lvbr("lvls", lvbo(int ), (int)147);
            }
            v12 = var0.method_6032();
            v13 /* !! */  = np.un;
            if (true) ** GOTO lbl99
            block45: while (true) {
                v13 /* !! */  = (long)(v14 - np.lvbr("lvlt", lvbv(int ), (int)109));
lbl99:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -470657275: {
                        v14 = np.lvbr("lvlu", lvbv(int ), (int)110);
                        continue block45;
                    }
                    case 186306080: {
                        break block45;
                    }
                    case 1218722495: {
                        v14 = np.lvbr("lvlv", lvbv(int ), (int)111);
                        continue block45;
                    }
                }
                break;
            }
            return v12 + var0.method_6067();
            case 0: {
                var4_2 /* !! */  = (int)np.lvbr("lvlw", lvbo(int ), (int)148);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 1: {
                var4_2 /* !! */  = (int)np.lvbr("lvlx", lvbo(int ), (int)149);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl119:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)np.lvbr("lvly", lvbo(int ), (int)150);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl124:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)np.lvbr("lvlz", lvbo(int ), (int)151);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 4: {
                var4_2 /* !! */  = (int)np.lvbr("lvma", lvbo(int ), (int)152);
                if (!var5_1) ** GOTO lbl119
                throw null;
            }
            case 5: {
                var4_2 /* !! */  = (int)np.lvbr("lvmb", lvbo(int ), (int)153);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl138:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)np.lvbr("lvmc", lvbo(int ), (int)154);
                if (var5_1) {
                    throw null;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)np.lvbr("lvmd", lvbo(int ), (int)155);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl147:
            // 3 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_2 /* !! */  = (int)np.lvbr("lvme", lvbo(int ), (int)156);
                    if (!var5_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl152:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)np.lvbr("lvmf", lvbo(int ), (int)157);
                if (var5_1) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 10: {
                var4_2 /* !! */  = (int)np.lvbr("lvmg", lvbo(int ), (int)158);
                if (!var5_1) ** GOTO lbl119
                throw null;
            }
lbl160:
            // 2 sources

            case 11: {
                do {
                    var4_2 /* !! */  = (int)np.lvbr("lvmh", lvbo(int ), (int)159);
                } while (!var5_1);
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)np.lvbr("lvmi", lvbo(int ), (int)160);
                if (!var5_1) break;
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)np.lvbr("lvmj", lvbo(int ), (int)161);
                if (var5_1) {
                    throw null;
                }
            }
            case 14: {
                var4_2 /* !! */  = (int)np.lvbr("lvmk", lvbo(int ), (int)162);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
            case 15: 
        }
        var4_2 /* !! */  = (int)np.lvbr("lvml", lvbo(int ), (int)163);
        ** while (!var5_1)
lbl180:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwbk() {
        np.lvbq[200] = 558672159;
        np.lvbq[201] = 806335944;
        np.lvbq[202] = -671139464;
        np.lvbq[203] = 1767975858;
        np.lvbq[204] = 1044903556;
        np.lvbq[205] = -272543611;
        np.lvbq[206] = -774481247;
        np.lvbq[207] = -1920499023;
        np.lvbq[208] = -96017683;
        np.lvbq[209] = 988006416;
        np.lvbq[210] = -643347784;
        np.lvbq[211] = -1663660912;
        np.lvbq[212] = -1261356816;
        np.lvbq[213] = 1344026503;
        np.lvbq[214] = -1509060532;
        np.lvbq[215] = -86045448;
        np.lvbq[216] = 733885519;
        np.lvbq[217] = 1293219862;
        np.lvbq[218] = 656259157;
        np.lvbq[219] = 1809637052;
        np.lvbq[220] = 989913928;
        np.lvbq[221] = 157583807;
        np.lvbq[222] = -1132033619;
        np.lvbq[223] = -66841538;
        np.lvbq[224] = 935905579;
        np.lvbq[225] = 1844692061;
        np.lvbq[226] = -473072705;
        np.lvbq[227] = 131414545;
        np.lvbq[228] = -680421843;
        np.lvbq[229] = 2007471333;
        np.lvbq[230] = 1297048701;
        np.lvbq[231] = -1096769569;
        np.lvbq[232] = -1625945988;
        np.lvbq[233] = -2053977361;
        np.lvbq[234] = -741764713;
        np.lvbq[235] = 142265229;
        np.lvbq[236] = -918074733;
        np.lvbq[237] = -1271350667;
        np.lvbq[238] = 1304346857;
        np.lvbq[239] = 140671644;
        np.lvbq[240] = -710188338;
        np.lvbq[241] = -1867401767;
        np.lvbq[242] = -1924223948;
        np.lvbq[243] = -1803889198;
        np.lvbq[244] = -681932736;
        np.lvbq[245] = 1544463404;
        np.lvbq[246] = 156113936;
        np.lvbq[247] = -415057127;
        np.lvbq[248] = 1811706052;
        np.lvbq[249] = -378980436;
        np.lvbq[250] = -1260866015;
        np.lvbq[251] = -1747172954;
        np.lvbq[252] = -1138496430;
        np.lvbq[253] = 467830926;
        np.lvbq[254] = 141884041;
        np.lvbq[255] = 319151197;
        np.lvbq[256] = 1048076691;
        np.lvbq[257] = 1974081534;
        np.lvbq[258] = 1953899677;
        np.lvbq[259] = 2090385011;
        np.lvbq[260] = 1210187702;
        np.lvbq[261] = -1841070237;
        np.lvbq[262] = -1764826406;
        np.lvbq[263] = 410412629;
        np.lvbq[264] = -421086844;
        np.lvbq[265] = -589213721;
        np.lvbq[266] = 172169753;
        np.lvbq[267] = 1141469895;
        np.lvbq[268] = -1850516046;
        np.lvbq[269] = 739239478;
        np.lvbq[270] = 1494624258;
        np.lvbq[271] = 891037264;
        np.lvbq[272] = -64135051;
        np.lvbq[273] = -28100987;
        np.lvbq[274] = 490100926;
        np.lvbq[275] = 1376337109;
        np.lvbq[276] = -1365300645;
        np.lvbq[277] = -66661163;
        np.lvbq[278] = 717063152;
        np.lvbq[279] = 544339844;
        np.lvbq[280] = -430309287;
        np.lvbq[281] = -1040204424;
        np.lvbq[282] = -2102786843;
        np.lvbq[283] = -1259437325;
        np.lvbq[284] = 12966176;
        np.lvbq[285] = 845390292;
        np.lvbq[286] = -365788663;
        np.lvbq[287] = -572777592;
        np.lvbq[288] = 772322227;
        np.lvbq[289] = 102874470;
        np.lvbq[290] = 1112160156;
        np.lvbq[291] = -470218046;
        np.lvbq[292] = -1508117259;
        np.lvbq[293] = -1750144084;
        np.lvbq[294] = 1442968090;
        np.lvbq[295] = 1615897416;
        np.lvbq[296] = 252192374;
        np.lvbq[297] = -1714479857;
        np.lvbq[298] = 783109675;
        np.lvbq[299] = 1454395378;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean looksFake(class_1657 var0, float var1_1) {
        block50: {
            v0 /* !! */  = np.un;
            if (true) ** GOTO lbl5
            block24: while (true) {
                v0 /* !! */  = (long)(v1 - np.lvbr("lvzm", lvbv(int ), (int)197));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1965639386: {
                        v1 = np.lvbr("lvzn", lvbv(int ), (int)198);
                        continue block24;
                    }
                    case -1582737097: {
                        v1 = np.lvbr("lvzo", lvbv(int ), (int)199);
                        continue block24;
                    }
                    case 186306080: {
                        break block24;
                    }
                }
                break;
            }
            var5_2 = np.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvzp", lvbv(int ), (int)200)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == np.lvbr("lvzq", lvbo(int ), (int)416)) break;
                v2 /* !! */  = (long)np.lvbr("lvzr", lvbo(int ), (int)417);
            }
            var4_3 /* !! */  = np.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvzs", lvbv(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == np.lvbr("lvzt", lvbo(int ), (int)418)) break;
                v3 /* !! */  = (long)np.lvbr("lvzu", lvbo(int ), (int)419);
            }
            var3_4 = np.a;
            if (var5_2) {
                throw null;
lbl29:
                // 8 sources

                return (boolean)np.lvbr("lvzv", lvbo(int ), (int)420);
            }
            if (var3_4 || var3_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvzw", lvbv(int ), (int)202)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == np.lvbr("lvzx", lvbo(int ), (int)421)) break;
                v4 /* !! */  = (long)np.lvbr("lvzy", lvbo(int ), (int)422);
            }
            if (var0.method_5805()) break block50;
            if (var3_4 || var3_4) ** GOTO lbl29
            return (boolean)np.lvbr("lvzz", lvbo(int ), (int)423);
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lwaa", lvbv(int ), (int)203)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == np.lvbr("lwab", lvbo(int ), (int)424)) break;
                    v5 /* !! */  = (long)np.lvbr("lwac", lvbo(int ), (int)425);
                }
                v6 = var0.method_6063();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lwad", lvbv(int ), (int)204)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == np.lvbr("lwae", lvbo(int ), (int)426)) break;
                    v7 /* !! */  = (long)np.lvbr("lwaf", lvbo(int ), (int)427);
                }
                var2_5 = Math.max(1.0f, v6);
                if (var3_4 || var3_4) ** GOTO lbl29
                if (var1_1 >= np.lvbr("lwag", lvef(int ), (int)428)) ** GOTO lbl62
                if (var3_4) ** GOTO lbl29
                if (!(var1_1 > var2_5 * np.lvbr("lwah", lvef(int ), (int)429))) ** GOTO lbl67
                if (var3_4) ** GOTO lbl29
lbl62:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v8 = np.lvbr("lwai", lvbo(int ), (int)430);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl70
lbl67:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v8 = np.lvbr("lwaj", lvbo(int ), (int)431);
lbl70:
                // 2 sources

                return (boolean)v8;
            }
lbl71:
            // 2 sources

            case 0: {
                do {
                    var4_3 /* !! */  = (int)np.lvbr("lwak", lvbo(int ), (int)432);
                } while (!var5_2);
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)np.lvbr("lwal", lvbo(int ), (int)433);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl81:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)np.lvbr("lwam", lvbo(int ), (int)434);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl86:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)np.lvbr("lwan", lvbo(int ), (int)435);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl91:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)np.lvbr("lwao", lvbo(int ), (int)436);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl96:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)np.lvbr("lwap", lvbo(int ), (int)437);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 6: {
                var4_3 /* !! */  = (int)np.lvbr("lwaq", lvbo(int ), (int)438);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl106:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)np.lvbr("lwar", lvbo(int ), (int)439);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 8: {
                var4_3 /* !! */  = (int)np.lvbr("lwas", lvbo(int ), (int)440);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 9: {
                var4_3 /* !! */  = (int)np.lvbr("lwat", lvbo(int ), (int)441);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
lbl120:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)np.lvbr("lwau", lvbo(int ), (int)442);
                    if (!var5_2) ** GOTO lbl86
                    throw null;
                }
            }
lbl125:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)np.lvbr("lwav", lvbo(int ), (int)443);
                if (!var5_2) ** GOTO lbl71
                throw null;
            }
lbl129:
            // 2 sources

            case 12: {
                do {
                    var4_3 /* !! */  = (int)np.lvbr("lwaw", lvbo(int ), (int)444);
                } while (!var5_2);
                throw null;
            }
lbl134:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)np.lvbr("lwax", lvbo(int ), (int)445);
                if (!var5_2) ** GOTO lbl91
                throw null;
            }
            case 14: {
                var4_3 /* !! */  = (int)np.lvbr("lway", lvbo(int ), (int)446);
                if (!var5_2) ** GOTO lbl81
                throw null;
            }
lbl142:
            // 4 sources

            case 15: {
                var4_3 /* !! */  = (int)np.lvbr("lwaz", lvbo(int ), (int)447);
                if (!var5_2) ** GOTO lbl129
                throw null;
            }
            case 16: 
        }
        var4_3 /* !! */  = (int)np.lvbr("lwba", lvbo(int ), (int)448);
        ** while (!var5_2)
lbl149:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwbg() {
        np.lvbp[300] = -1433598750;
        np.lvbp[301] = 927737988;
        np.lvbp[302] = 1301841137;
        np.lvbp[303] = 1455782707;
        np.lvbp[304] = 921283029;
        np.lvbp[305] = -746174400;
        np.lvbp[306] = -349890557;
        np.lvbp[307] = 1592057509;
        np.lvbp[308] = -512780575;
        np.lvbp[309] = -1568545041;
        np.lvbp[310] = -1220412667;
        np.lvbp[311] = -1017057521;
        np.lvbp[312] = -1367906941;
        np.lvbp[313] = 364191534;
        np.lvbp[314] = 617381076;
        np.lvbp[315] = -242741386;
        np.lvbp[316] = -478228213;
        np.lvbp[317] = -1664863828;
        np.lvbp[318] = -914205635;
        np.lvbp[319] = -1234077527;
        np.lvbp[320] = 1505019759;
        np.lvbp[321] = -1749044289;
        np.lvbp[322] = -179453774;
        np.lvbp[323] = 840190935;
        np.lvbp[324] = 713996525;
        np.lvbp[325] = 1840457184;
        np.lvbp[326] = 1928588447;
        np.lvbp[327] = 382667653;
        np.lvbp[328] = 1901424166;
        np.lvbp[329] = 2092632882;
        np.lvbp[330] = -631800089;
        np.lvbp[331] = -1079327070;
        np.lvbp[332] = -368841368;
        np.lvbp[333] = 280572952;
        np.lvbp[334] = 911353063;
        np.lvbp[335] = 1555825946;
        np.lvbp[336] = 1247253443;
        np.lvbp[337] = 1842623913;
        np.lvbp[338] = -321818306;
        np.lvbp[339] = -980198740;
        np.lvbp[340] = 568817749;
        np.lvbp[341] = -337604205;
        np.lvbp[342] = -909293784;
        np.lvbp[343] = 1953088012;
        np.lvbp[344] = -1125749518;
        np.lvbp[345] = -1208069872;
        np.lvbp[346] = -1000520281;
        np.lvbp[347] = 1758670235;
        np.lvbp[348] = 1268002499;
        np.lvbp[349] = -1906435693;
        np.lvbp[350] = 1066787969;
        np.lvbp[351] = -394010858;
        np.lvbp[352] = -745038101;
        np.lvbp[353] = -1892876968;
        np.lvbp[354] = 774715786;
        np.lvbp[355] = -564429159;
        np.lvbp[356] = -1446703104;
        np.lvbp[357] = -845772214;
        np.lvbp[358] = -613246784;
        np.lvbp[359] = -1380775752;
        np.lvbp[360] = 795936295;
        np.lvbp[361] = 1945166139;
        np.lvbp[362] = -584875123;
        np.lvbp[363] = -803669669;
        np.lvbp[364] = -1348406396;
        np.lvbp[365] = 31379580;
        np.lvbp[366] = 995859480;
        np.lvbp[367] = 1081695283;
        np.lvbp[368] = -1284453006;
        np.lvbp[369] = -1647296805;
        np.lvbp[370] = -2054910381;
        np.lvbp[371] = 912629789;
        np.lvbp[372] = 1126008955;
        np.lvbp[373] = -649501576;
        np.lvbp[374] = -536467974;
        np.lvbp[375] = -787851390;
        np.lvbp[376] = -409873565;
        np.lvbp[377] = 1722128441;
        np.lvbp[378] = 365298343;
        np.lvbp[379] = 966739251;
        np.lvbp[380] = 273916680;
        np.lvbp[381] = -283986302;
        np.lvbp[382] = 361340850;
        np.lvbp[383] = -137469130;
        np.lvbp[384] = -1758617667;
        np.lvbp[385] = 696341529;
        np.lvbp[386] = -555700428;
        np.lvbp[387] = 1875301774;
        np.lvbp[388] = 1517732481;
        np.lvbp[389] = 2067240824;
        np.lvbp[390] = 735730306;
        np.lvbp[391] = 1904981407;
        np.lvbp[392] = -1077150973;
        np.lvbp[393] = -1052041953;
        np.lvbp[394] = 2121958973;
        np.lvbp[395] = 1935977256;
        np.lvbp[396] = 2058050995;
        np.lvbp[397] = 968727162;
        np.lvbp[398] = 718609273;
        np.lvbp[399] = 226427656;
    }

    private static /* synthetic */ void lwbp() {
        np.lvbw[200] = 3528318252450326983L;
        np.lvbw[201] = 8340663425140718059L;
        np.lvbw[202] = 2542492255072582881L;
        np.lvbw[203] = 3453477349457161148L;
        np.lvbw[204] = 2929267111699787469L;
    }

    private static /* synthetic */ void lwbi() {
        np.lvbq[0] = -1967705122;
        np.lvbq[1] = 1423354335;
        np.lvbq[2] = -1077867837;
        np.lvbq[3] = -1831858549;
        np.lvbq[4] = 1282420824;
        np.lvbq[5] = -118709043;
        np.lvbq[6] = 685826573;
        np.lvbq[7] = -802656566;
        np.lvbq[8] = 854144088;
        np.lvbq[9] = -1409430774;
        np.lvbq[10] = 1712089789;
        np.lvbq[11] = 1535850264;
        np.lvbq[12] = 969644246;
        np.lvbq[13] = -2039060588;
        np.lvbq[14] = 1433743105;
        np.lvbq[15] = -1109139270;
        np.lvbq[16] = 468305691;
        np.lvbq[17] = 1446403543;
        np.lvbq[18] = -335588352;
        np.lvbq[19] = -1182355797;
        np.lvbq[20] = -140426484;
        np.lvbq[21] = -1654003134;
        np.lvbq[22] = 1878442555;
        np.lvbq[23] = -1227557859;
        np.lvbq[24] = -448879273;
        np.lvbq[25] = 2090703690;
        np.lvbq[26] = 1614830791;
        np.lvbq[27] = 1057179477;
        np.lvbq[28] = 1802586054;
        np.lvbq[29] = 809192759;
        np.lvbq[30] = 113654775;
        np.lvbq[31] = 269112228;
        np.lvbq[32] = 1998881213;
        np.lvbq[33] = -1238542574;
        np.lvbq[34] = 494076058;
        np.lvbq[35] = -2035411500;
        np.lvbq[36] = -1778307587;
        np.lvbq[37] = -1328540360;
        np.lvbq[38] = 895128198;
        np.lvbq[39] = 101050052;
        np.lvbq[40] = -633559662;
        np.lvbq[41] = 489201965;
        np.lvbq[42] = 1601234160;
        np.lvbq[43] = 1062190319;
        np.lvbq[44] = -758643712;
        np.lvbq[45] = 1814301028;
        np.lvbq[46] = -1470480235;
        np.lvbq[47] = 848917368;
        np.lvbq[48] = -152830402;
        np.lvbq[49] = 1332795153;
        np.lvbq[50] = 743720683;
        np.lvbq[51] = -1290517849;
        np.lvbq[52] = -1200108447;
        np.lvbq[53] = -20000570;
        np.lvbq[54] = 1881057643;
        np.lvbq[55] = 529341118;
        np.lvbq[56] = 174973627;
        np.lvbq[57] = -834322623;
        np.lvbq[58] = 1132877510;
        np.lvbq[59] = -1718363827;
        np.lvbq[60] = 139977567;
        np.lvbq[61] = -1351363851;
        np.lvbq[62] = -1732144210;
        np.lvbq[63] = 1522416860;
        np.lvbq[64] = -1467024724;
        np.lvbq[65] = -1043405985;
        np.lvbq[66] = 1037113697;
        np.lvbq[67] = -35510103;
        np.lvbq[68] = 1526828014;
        np.lvbq[69] = 1780268107;
        np.lvbq[70] = 1986543446;
        np.lvbq[71] = -1903442995;
        np.lvbq[72] = -1067961067;
        np.lvbq[73] = 1355138926;
        np.lvbq[74] = -802941875;
        np.lvbq[75] = 182953654;
        np.lvbq[76] = -1725600225;
        np.lvbq[77] = 1392395555;
        np.lvbq[78] = 2135900536;
        np.lvbq[79] = 1100569009;
        np.lvbq[80] = -600303649;
        np.lvbq[81] = 2113515540;
        np.lvbq[82] = -1811168254;
        np.lvbq[83] = 584206549;
        np.lvbq[84] = 1789930515;
        np.lvbq[85] = -61100614;
        np.lvbq[86] = 1109777077;
        np.lvbq[87] = 1990787875;
        np.lvbq[88] = 1804904593;
        np.lvbq[89] = -1823698442;
        np.lvbq[90] = 650208023;
        np.lvbq[91] = -1451187788;
        np.lvbq[92] = 130874443;
        np.lvbq[93] = 1756166464;
        np.lvbq[94] = -383545817;
        np.lvbq[95] = 1371549385;
        np.lvbq[96] = 1005104412;
        np.lvbq[97] = -802060626;
        np.lvbq[98] = -1553767349;
        np.lvbq[99] = -309904977;
    }

    private static /* synthetic */ void lwbr() {
        np.lvbx[100] = -7377640941710110061L;
        np.lvbx[101] = 8936583389615295725L;
        np.lvbx[102] = -240326316022563776L;
        np.lvbx[103] = -904231375281323749L;
        np.lvbx[104] = -8085620895596231803L;
        np.lvbx[105] = 5064375839423682995L;
        np.lvbx[106] = 865708244326312474L;
        np.lvbx[107] = 4115863893926204393L;
        np.lvbx[108] = -4665232146874509367L;
        np.lvbx[109] = 6325352872046745635L;
        np.lvbx[110] = 3060423747991708912L;
        np.lvbx[111] = -2906634634284711464L;
        np.lvbx[112] = 1076597333127366702L;
        np.lvbx[113] = -3616140135114851751L;
        np.lvbx[114] = 4026069274414157183L;
        np.lvbx[115] = -5512881412676524127L;
        np.lvbx[116] = -4628334088577408001L;
        np.lvbx[117] = 5588741162199423137L;
        np.lvbx[118] = -4131239185722945314L;
        np.lvbx[119] = 103813675180509033L;
        np.lvbx[120] = 6353928898829861588L;
        np.lvbx[121] = 6274465184415004729L;
        np.lvbx[122] = -4137184047962333437L;
        np.lvbx[123] = 486957941127324896L;
        np.lvbx[124] = 6414050622245166853L;
        np.lvbx[125] = -702002163243901135L;
        np.lvbx[126] = 3280359973366740661L;
        np.lvbx[127] = -5201942042609127320L;
        np.lvbx[128] = -4813166175399706307L;
        np.lvbx[129] = 6274460124100336504L;
        np.lvbx[130] = -6791169257087636625L;
        np.lvbx[131] = 422955220693754824L;
        np.lvbx[132] = -8229141063584913978L;
        np.lvbx[133] = 8201250511813223444L;
        np.lvbx[134] = -2675194422660055544L;
        np.lvbx[135] = -5522468355656497360L;
        np.lvbx[136] = 1568564444440588585L;
        np.lvbx[137] = -218993634185335434L;
        np.lvbx[138] = -8393916809444286360L;
        np.lvbx[139] = 4984661279229821939L;
        np.lvbx[140] = 5395353330819503878L;
        np.lvbx[141] = 6063489732398010622L;
        np.lvbx[142] = 7062065334948685702L;
        np.lvbx[143] = -4366091774859626603L;
        np.lvbx[144] = -8783356078184474850L;
        np.lvbx[145] = -6034741997608427390L;
        np.lvbx[146] = -97738860242331672L;
        np.lvbx[147] = -2482202048399491806L;
        np.lvbx[148] = -4651339929455982438L;
        np.lvbx[149] = 3312200787613807340L;
        np.lvbx[150] = 4016810757398479677L;
        np.lvbx[151] = -4200320192853395034L;
        np.lvbx[152] = 1792752438709715999L;
        np.lvbx[153] = -2622411682909822680L;
        np.lvbx[154] = 1602323150317751881L;
        np.lvbx[155] = 1325454742102333587L;
        np.lvbx[156] = 8892187406274017482L;
        np.lvbx[157] = 8926496041613294461L;
        np.lvbx[158] = -4848668555376565591L;
        np.lvbx[159] = -5577166312940077678L;
        np.lvbx[160] = 7149351436744723656L;
        np.lvbx[161] = -7749822121059818794L;
        np.lvbx[162] = -4444783052052825626L;
        np.lvbx[163] = 6972136409115547784L;
        np.lvbx[164] = 766566773193189610L;
        np.lvbx[165] = -7440843447945097402L;
        np.lvbx[166] = -5691442010524486757L;
        np.lvbx[167] = 7879139163403432607L;
        np.lvbx[168] = 7087362679996443123L;
        np.lvbx[169] = 8104765018044093352L;
        np.lvbx[170] = 3980048342948008856L;
        np.lvbx[171] = -7900253675740023615L;
        np.lvbx[172] = -3565156920094661471L;
        np.lvbx[173] = 41763134655750631L;
        np.lvbx[174] = -4185167680708154960L;
        np.lvbx[175] = -2472305195135834232L;
        np.lvbx[176] = 5404419981134160374L;
        np.lvbx[177] = -6492903600612779058L;
        np.lvbx[178] = 2382889514430575582L;
        np.lvbx[179] = 1879073009410176042L;
        np.lvbx[180] = -487898711181853205L;
        np.lvbx[181] = -1790367172733383680L;
        np.lvbx[182] = 1917733946545522050L;
        np.lvbx[183] = -1191524545627350143L;
        np.lvbx[184] = 6023259633339809912L;
        np.lvbx[185] = 6249634796800667216L;
        np.lvbx[186] = 6699696992234058970L;
        np.lvbx[187] = 5873381709377402966L;
        np.lvbx[188] = 8256607614246221343L;
        np.lvbx[189] = 6152554696565887526L;
        np.lvbx[190] = -3740188533978201459L;
        np.lvbx[191] = -279193845840682034L;
        np.lvbx[192] = 2072197762433079119L;
        np.lvbx[193] = 6402579709757413228L;
        np.lvbx[194] = -7878318659356018912L;
        np.lvbx[195] = -5338302144155836155L;
        np.lvbx[196] = -3249319679771531197L;
        np.lvbx[197] = 6629483030014383031L;
        np.lvbx[198] = 3554429714720845477L;
        np.lvbx[199] = 7175256119602000362L;
    }

    private static /* synthetic */ void lwbl() {
        np.lvbq[300] = 347423798;
        np.lvbq[301] = -927737989;
        np.lvbq[302] = -133919040;
        np.lvbq[303] = 1455782706;
        np.lvbq[304] = -1397236556;
        np.lvbq[305] = -746174399;
        np.lvbq[306] = -457357167;
        np.lvbq[307] = -1592057510;
        np.lvbq[308] = 1648260224;
        np.lvbq[309] = -1568545042;
        np.lvbq[310] = 906896170;
        np.lvbq[311] = -1017057532;
        np.lvbq[312] = -1367906944;
        np.lvbq[313] = 364191542;
        np.lvbq[314] = 617381057;
        np.lvbq[315] = -242741392;
        np.lvbq[316] = -478228197;
        np.lvbq[317] = -1664863830;
        np.lvbq[318] = -914205634;
        np.lvbq[319] = -1234077510;
        np.lvbq[320] = 1505019771;
        np.lvbq[321] = -1749044295;
        np.lvbq[322] = -179453762;
        np.lvbq[323] = 840190934;
        np.lvbq[324] = 713996515;
        np.lvbq[325] = 1840457193;
        np.lvbq[326] = 1928588430;
        np.lvbq[327] = 382667648;
        np.lvbq[328] = 1901424179;
        np.lvbq[329] = 2092632888;
        np.lvbq[330] = -631800074;
        np.lvbq[331] = -1079327067;
        np.lvbq[332] = -368841346;
        np.lvbq[333] = 280572953;
        np.lvbq[334] = 911353078;
        np.lvbq[335] = 1555825922;
        np.lvbq[336] = 1247253465;
        np.lvbq[337] = 1842623932;
        np.lvbq[338] = -321818318;
        np.lvbq[339] = -980198901;
        np.lvbq[340] = 568817781;
        np.lvbq[341] = -337604206;
        np.lvbq[342] = -909293782;
        np.lvbq[343] = 1953088013;
        np.lvbq[344] = -1125749520;
        np.lvbq[345] = -189378288;
        np.lvbq[346] = -1000520275;
        np.lvbq[347] = 1758670230;
        np.lvbq[348] = 1268002535;
        np.lvbq[349] = -1906435662;
        np.lvbq[350] = 1066787983;
        np.lvbq[351] = -394010860;
        np.lvbq[352] = -745038129;
        np.lvbq[353] = -1892876990;
        np.lvbq[354] = 774715801;
        np.lvbq[355] = -564429125;
        np.lvbq[356] = -1446703099;
        np.lvbq[357] = -845772199;
        np.lvbq[358] = -613246783;
        np.lvbq[359] = -1380775764;
        np.lvbq[360] = 795936290;
        np.lvbq[361] = 1945166118;
        np.lvbq[362] = -584875110;
        np.lvbq[363] = -803669677;
        np.lvbq[364] = -1348406380;
        np.lvbq[365] = 31379566;
        np.lvbq[366] = 995859469;
        np.lvbq[367] = 1081695248;
        np.lvbq[368] = -1284453015;
        np.lvbq[369] = -1647296813;
        np.lvbq[370] = -2054910391;
        np.lvbq[371] = 912629784;
        np.lvbq[372] = 1126008942;
        np.lvbq[373] = -649501608;
        np.lvbq[374] = -536467977;
        np.lvbq[375] = -787851363;
        np.lvbq[376] = -409873544;
        np.lvbq[377] = 1722128420;
        np.lvbq[378] = 365298354;
        np.lvbq[379] = 966739245;
        np.lvbq[380] = 273916673;
        np.lvbq[381] = -283986299;
        np.lvbq[382] = 361340854;
        np.lvbq[383] = -137469129;
        np.lvbq[384] = -1522228522;
        np.lvbq[385] = -696341530;
        np.lvbq[386] = 1468573363;
        np.lvbq[387] = -1875301775;
        np.lvbq[388] = -1886920946;
        np.lvbq[389] = 2067240825;
        np.lvbq[390] = -183322089;
        np.lvbq[391] = 1904981406;
        np.lvbq[392] = -144927207;
        np.lvbq[393] = 1052041952;
        np.lvbq[394] = 356380569;
        np.lvbq[395] = 1935977262;
        np.lvbq[396] = 2058050998;
        np.lvbq[397] = 968727157;
        np.lvbq[398] = 718609266;
        np.lvbq[399] = 226427673;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Float parse(String var0) {
        block77: {
            block76: {
                block75: {
                    var8_1 = np.c;
                    var7_2 /* !! */  = np.b;
                    var6_3 = np.a;
                    if (var8_1) {
                        throw null;
lbl6:
                        // 19 sources

                        return null;
                    }
                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (var0 == null) break block75;
                    if (var6_3) ** GOTO lbl6
                    if (!var0.isBlank()) break block76;
                    if (var6_3) ** GOTO lbl6
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                return null;
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            var1_4 = var0.replace((char)np.lvbr("lvvr", lvbo(int ), (int)339), (char)np.lvbr("lvvs", lvbo(int ), (int)340)).trim();
            if (var6_3 || var6_3) ** GOTO lbl6
            var2_5 = np.HP_SUFFIX.matcher(var1_4);
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!var2_5.find()) break block77;
            if (var6_3 || var6_3) ** GOTO lbl6
            return np.parseNumber(var2_5.group((int)np.lvbr("lvvt", lvbo(int ), (int)341)), var2_5.group((int)np.lvbr("lvvu", lvbo(int ), (int)342)));
        }
        if (var6_3 || var6_3) ** GOTO lbl6
        var3_6 = np.HP_TOKEN.matcher(var1_4);
        if (var6_3 || var6_3) ** GOTO lbl6
        var4_7 = null;
        if (var6_3) ** GOTO lbl6
        block40: while (true) {
            if (var6_3 || var6_3) ** GOTO lbl6
            if (!var3_6.find()) ** GOTO lbl49
            if (var6_3 || var6_3) ** GOTO lbl6
            var5_8 = np.parseNumber(var3_6.group((int)np.lvbr("lvvv", lvbo(int ), (int)343)), var3_6.group((int)np.lvbr("lvvw", lvbo(int ), (int)344)));
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var5_8 == null) ** GOTO lbl46
            if (var6_3) ** GOTO lbl6
            if (!(var5_8.floatValue() <= np.lvbr("lvvx", lvef(int ), (int)345))) ** GOTO lbl46
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_7 = var5_8;
                    if (var6_3) ** GOTO lbl6
lbl46:
                    // 3 sources

                    if (var6_3 || var6_3) ** GOTO lbl6
                    if (!var8_1) continue block40;
                    throw null;
                }
lbl49:
                // 1 sources

                if (!var6_3 && !var6_3) ** break;
                ** continue;
                return var4_7;
lbl52:
                // 2 sources

                case 0: {
                    var7_2 /* !! */  = (int)np.lvbr("lvvy", lvbo(int ), (int)346);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl57:
                // 2 sources

                case 1: {
                    var7_2 /* !! */  = (int)np.lvbr("lvvz", lvbo(int ), (int)347);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl117
                }
                case 2: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwa", lvbo(int ), (int)348);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl72
                }
lbl67:
                // 4 sources

                case 3: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwb", lvbo(int ), (int)349);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl82
                }
lbl72:
                // 2 sources

                case 4: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwc", lvbo(int ), (int)350);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl102
                }
                case 5: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwd", lvbo(int ), (int)351);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
lbl82:
                // 2 sources

                case 6: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwe", lvbo(int ), (int)352);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 7: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwf", lvbo(int ), (int)353);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl127
                }
                case 8: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwg", lvbo(int ), (int)354);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
                case 9: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwh", lvbo(int ), (int)355);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
lbl102:
                // 3 sources

                case 10: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwi", lvbo(int ), (int)356);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl170
                }
lbl107:
                // 2 sources

                case 11: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwj", lvbo(int ), (int)357);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl175
                }
lbl112:
                // 2 sources

                case 12: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwk", lvbo(int ), (int)358);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
lbl117:
                // 2 sources

                case 13: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwl", lvbo(int ), (int)359);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
                case 14: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwm", lvbo(int ), (int)360);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
lbl127:
                // 2 sources

                case 15: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwn", lvbo(int ), (int)361);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl132:
                // 4 sources

                case 16: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwo", lvbo(int ), (int)362);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                }
lbl137:
                // 2 sources

                case 17: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwp", lvbo(int ), (int)363);
                    if (!var8_1) ** GOTO lbl112
                    throw null;
                }
lbl141:
                // 3 sources

                case 18: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwq", lvbo(int ), (int)364);
                    if (!var8_1) ** GOTO lbl102
                    throw null;
                }
lbl145:
                // 2 sources

                case 19: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwr", lvbo(int ), (int)365);
                    if (!var8_1) ** GOTO lbl67
                    throw null;
                }
lbl149:
                // 3 sources

                case 20: {
                    var7_2 /* !! */  = (int)np.lvbr("lvws", lvbo(int ), (int)366);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
                case 21: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwt", lvbo(int ), (int)367);
                    if (!var8_1) ** GOTO lbl67
                    throw null;
                }
                case 22: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwu", lvbo(int ), (int)368);
                    if (!var8_1) ** GOTO lbl52
                    throw null;
                }
                case 23: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwv", lvbo(int ), (int)369);
                    if (!var8_1) break block40;
                    throw null;
                }
                case 24: {
                    var7_2 /* !! */  = (int)np.lvbr("lvww", lvbo(int ), (int)370);
                    if (!var8_1) ** GOTO lbl67
                    throw null;
                }
lbl170:
                // 2 sources

                case 25: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwx", lvbo(int ), (int)371);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl208
                }
lbl175:
                // 2 sources

                case 26: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_2 /* !! */  = (int)np.lvbr("lvwy", lvbo(int ), (int)372);
                        if (!var8_1) ** GOTO lbl132
                        throw null;
                    }
                }
lbl180:
                // 2 sources

                case 27: {
                    var7_2 /* !! */  = (int)np.lvbr("lvwz", lvbo(int ), (int)373);
                    if (!var8_1) ** GOTO lbl137
                    throw null;
                }
lbl184:
                // 2 sources

                case 28: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxa", lvbo(int ), (int)374);
                    if (!var8_1) ** GOTO lbl57
                    throw null;
                }
lbl188:
                // 4 sources

                case 29: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxb", lvbo(int ), (int)375);
                    if (!var8_1) ** GOTO lbl149
                    throw null;
                }
                case 30: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxc", lvbo(int ), (int)376);
                    if (!var8_1) ** GOTO lbl132
                    throw null;
                }
                case 31: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxd", lvbo(int ), (int)377);
                    if (!var8_1) ** GOTO lbl180
                    throw null;
                }
                case 32: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxe", lvbo(int ), (int)378);
                    if (!var8_1) ** GOTO lbl141
                    throw null;
                }
lbl204:
                // 2 sources

                case 33: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxf", lvbo(int ), (int)379);
                    if (!var8_1) ** GOTO lbl107
                    throw null;
                }
lbl208:
                // 4 sources

                case 34: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxg", lvbo(int ), (int)380);
                    if (!var8_1) ** GOTO lbl184
                    throw null;
                }
lbl212:
                // 3 sources

                case 35: {
                    var7_2 /* !! */  = (int)np.lvbr("lvxh", lvbo(int ), (int)381);
                    if (!var8_1) ** GOTO lbl204
                    throw null;
                }
                case 36: 
            }
            break;
        }
        var7_2 /* !! */  = (int)np.lvbr("lvxi", lvbo(int ), (int)382);
        ** while (!var8_1)
lbl219:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static float fixHealth(class_1657 var0, float var1_1) {
        v0 /* !! */  = np.un;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - np.lvbr("lvdw", lvbv(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -955317115: {
                    v1 = np.lvbr("lvdx", lvbv(int ), (int)24);
                    continue block34;
                }
                case 186306080: {
                    break block34;
                }
                case 275203724: {
                    v1 = np.lvbr("lvdy", lvbv(int ), (int)25);
                    continue block34;
                }
            }
            break;
        }
        var5_2 = np.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvdz", lvbv(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == np.lvbr("lvea", lvbo(int ), (int)30)) break;
            v2 /* !! */  = (long)np.lvbr("lveb", lvbo(int ), (int)31);
        }
        var4_3 /* !! */  = np.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvec", lvbv(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == np.lvbr("lved", lvbo(int ), (int)32)) {
                var3_4 = np.a;
                if (var5_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)np.lvbr("lvee", lvbo(int ), (int)33);
        }
        if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block37: while (true) {
            block60: {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                        v4 /* !! */  = np.un;
                        block38: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -2132650297: {
                                    v5 = np.lvbr("lvei", lvbv(int ), (int)29);
                                    ** GOTO lbl50
                                }
                                case -1238448472: {
                                    v5 = np.lvbr("lvej", lvbv(int ), (int)30);
                                    ** GOTO lbl50
                                }
                                case 186306080: {
                                    break block38;
                                }
                                case 437651846: {
                                    v5 = np.lvbr("lvek", lvbv(int ), (int)31);
lbl50:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - np.lvbr("lveh", lvbv(int ), (int)28));
                                    continue block38;
                                }
                            }
                            break;
                        }
                        if (!np.shouldFix()) {
                            if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                            if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                            return var1_1;
                        }
                        if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                        if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvel", lvbv(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != np.lvbr("lvem", lvbo(int ), (int)35)) ** GOTO lbl65
                            var2_5 = np.resolve(var0, var1_1);
                            if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                            if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                            ** GOTO lbl113
lbl65:
                            // 1 sources

                            v6 /* !! */  = (long)np.lvbr("lven", lvbo(int ), (int)36);
                        }
                    }
                    case 2: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfa", lvbo(int ), (int)43);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** GOTO lbl89
                    }
                    case 6: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfe", lvbo(int ), (int)47);
                        cfr_temp_0 = 8;
                        if (var5_2) {
                            throw null;
                        }
                        break block60;
                    }
                    case 10: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfi", lvbo(int ), (int)51);
                        cfr_temp_0 = 8;
                        if (var5_2) {
                            throw null;
                        }
                        break block60;
                    }
                    case 12: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfk", lvbo(int ), (int)53);
                        if (var5_2) {
                            throw null;
                        }
lbl89:
                        // 3 sources

                        var4_3 /* !! */  = (int)np.lvbr("lvey", lvbo(int ), (int)41);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfh", lvbo(int ), (int)50);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfc", lvbo(int ), (int)45);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfj", lvbo(int ), (int)52);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfb", lvbo(int ), (int)44);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var4_3 /* !! */  = (int)np.lvbr("lvez", lvbo(int ), (int)42);
                        if (var5_2) {
                            throw null;
                        }
                        ** GOTO lbl144
                    }
lbl113:
                    // 1 sources

                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lveo", lvbv(int ), (int)33)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == np.lvbr("lvep", lvbo(int ), (int)37)) break;
                        v7 /* !! */  = (long)np.lvbr("lveq", lvbo(int ), (int)38);
                    }
                    v8 /* !! */  = np.un;
                    block41: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -1913956718: {
                                v8 /* !! */  = (long)(np.lvbr("lves", lvbv(int ), (int)35) - np.lvbr("lver", lvbv(int ), (int)34));
                                continue block41;
                            }
                            case 186306080: {
                                break block41;
                            }
                        }
                        break;
                    }
                    v9 = var0.method_5628();
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = np.un - np.lvbr("lvet", lvbv(int ), (int)36)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == np.lvbr("lveu", lvbo(int ), (int)39)) break;
                        v10 /* !! */  = (long)np.lvbr("lvev", lvbo(int ), (int)40);
                    }
                    np.SNAPSHOTS.put(v9, (Object)var2_5);
                    if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                    if (var3_4 != false) return (float)np.lvbr("lveg", lvef(int ), (int)34);
                    v11 /* !! */  = np.un;
                    block43: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case 186306080: {
                                return var2_5.health;
                            }
                            case 1651126000: {
                                v11 /* !! */  = (long)(np.lvbr("lvex", lvbv(int ), (int)38) - np.lvbr("lvew", lvbv(int ), (int)37));
                                continue block43;
                            }
                        }
                        break;
                    }
                    return var2_5.health;
lbl144:
                    // 2 sources

                    case 5: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfd", lvbo(int ), (int)46);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var4_3 /* !! */  = (int)np.lvbr("lvfg", lvbo(int ), (int)49);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                ** GOTO lbl157
            }
            do {
                if (true) continue block37;
lbl157:
                // 2 sources

                var4_3 /* !! */  = (int)np.lvbr("lvff", lvbo(int ), (int)48);
                cfr_temp_0 = 5;
            } while (!var5_2);
            break;
        }
        throw null;
    }

    static {
        lvbp = new int[451];
        lvbq = new int[451];
        np.lwbd();
        np.lwbe();
        np.lwbf();
        np.lwbg();
        np.lwbh();
        np.lwbi();
        np.lwbj();
        np.lwbk();
        np.lwbl();
        np.lwbm();
        lvbw = new long[205];
        lvbx = new long[205];
        np.lwbn();
        np.lwbo();
        np.lwbp();
        np.lwbq();
        np.lwbr();
        np.lwbs();
        HP_TOKEN = Pattern.compile("(?:\\[|\\s|^)(\\d{1,3})(?:[.,](\\d))?\\s*(?:hp|\u0445\u043f|\u2764|\u2665|\u2764\ufe0f)?", (int)np.lvbr("lwbb", lvbo(int ), (int)449));
        HP_SUFFIX = Pattern.compile("(\\d{1,3})(?:[.,](\\d))\\s*(?:hp|\u0445\u043f)\\b", (int)np.lvbr("lwbc", lvbo(int ), (int)450));
        SNAPSHOTS = new Int2ObjectOpenHashMap();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float fixAbsorption(class_1657 var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvfl", lvbv(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == np.lvbr("lvfm", lvbo(int ), (int)54)) break;
            v0 /* !! */  = (long)np.lvbr("lvfn", lvbo(int ), (int)55);
        }
        var5_2 = np.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvfo", lvbv(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == np.lvbr("lvfp", lvbo(int ), (int)56)) break;
            v1 /* !! */  = (long)np.lvbr("lvfq", lvbo(int ), (int)57);
        }
        var4_3 /* !! */  = np.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvfr", lvbv(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == np.lvbr("lvfs", lvbo(int ), (int)58)) break;
            v2 /* !! */  = (long)np.lvbr("lvft", lvbo(int ), (int)59);
        }
        var3_4 = np.a;
        if (var5_2) {
            throw null;
lbl24:
            // 10 sources

            return (float)np.lvbr("lvfu", lvef(int ), (int)60);
        }
        if (var3_4 || var3_4) ** GOTO lbl24
        v3 /* !! */  = np.un;
        if (true) ** GOTO lbl31
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - np.lvbr("lvfv", lvbv(int ), (int)42));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1810775733: {
                    v4 = np.lvbr("lvfw", lvbv(int ), (int)43);
                    continue block47;
                }
                case 186306080: {
                    break block47;
                }
                case 1924911520: {
                    v4 = np.lvbr("lvfx", lvbv(int ), (int)44);
                    continue block47;
                }
            }
            break;
        }
        if (np.shouldFix()) ** GOTO lbl47
        if (var3_4) ** GOTO lbl24
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl24
                return var1_1;
            }
lbl47:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl24
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvfy", lvbv(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == np.lvbr("lvfz", lvbo(int ), (int)61)) break;
                v5 /* !! */  = (long)np.lvbr("lvga", lvbo(int ), (int)62);
            }
            v6 /* !! */  = np.un;
            if (true) ** GOTO lbl58
            block49: while (true) {
                v6 /* !! */  = (long)(v7 - np.lvbr("lvgb", lvbv(int ), (int)46));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 186306080: {
                        break block49;
                    }
                    case 884558192: {
                        v7 = np.lvbr("lvgc", lvbv(int ), (int)47);
                        continue block49;
                    }
                    case 1114559558: {
                        v7 = np.lvbr("lvgd", lvbv(int ), (int)48);
                        continue block49;
                    }
                }
                break;
            }
            v8 = var0.method_5628();
            v9 /* !! */  = np.un;
            if (true) ** GOTO lbl72
            block50: while (true) {
                v9 /* !! */  = (long)(v10 - np.lvbr("lvge", lvbv(int ), (int)49));
lbl72:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -903946209: {
                        v10 = np.lvbr("lvgf", lvbv(int ), (int)50);
                        continue block50;
                    }
                    case -760118072: {
                        v10 = np.lvbr("lvgg", lvbv(int ), (int)51);
                        continue block50;
                    }
                    case 186306080: {
                        break block50;
                    }
                    case 1256659235: {
                        v10 = np.lvbr("lvgh", lvbv(int ), (int)52);
                        continue block50;
                    }
                }
                break;
            }
            var2_5 = (np$Snapshot)np.SNAPSHOTS.get(v8);
            if (var3_4 || var3_4) ** GOTO lbl24
            if (var2_5 == null) ** GOTO lbl100
            if (var3_4) ** GOTO lbl24
            v11 /* !! */  = np.un;
            if (true) ** GOTO lbl92
            block51: while (true) {
                v11 /* !! */  = (long)(np.lvbr("lvgj", lvbv(int ), (int)54) - np.lvbr("lvgi", lvbv(int ), (int)53));
lbl92:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 186306080: {
                        break block51;
                    }
                    case 308181877: {
                        continue block51;
                    }
                }
                break;
            }
            if (!var2_5.scoreboard) ** GOTO lbl100
            if (var3_4 || var3_4) ** GOTO lbl24
            return 0.0f;
lbl100:
            // 2 sources

            if (var3_4 || var3_4) ** GOTO lbl24
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lvgk", lvbv(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == np.lvbr("lvgl", lvbo(int ), (int)63)) break;
                v12 /* !! */  = (long)np.lvbr("lvgm", lvbo(int ), (int)64);
            }
            if (!np.looksFake(var0, var1_1)) ** GOTO lbl110
            if (var3_4 || var3_4) ** GOTO lbl24
            return 0.0f;
lbl110:
            // 1 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return var1_1;
lbl113:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)np.lvbr("lvgn", lvbo(int ), (int)65);
                if (!var5_2) break;
                throw null;
            }
lbl117:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)np.lvbr("lvgo", lvbo(int ), (int)66);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl122:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)np.lvbr("lvgp", lvbo(int ), (int)67);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl127:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)np.lvbr("lvgq", lvbo(int ), (int)68);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl132:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)np.lvbr("lvgr", lvbo(int ), (int)69);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 5: {
                var4_3 /* !! */  = (int)np.lvbr("lvgs", lvbo(int ), (int)70);
                if (!var5_2) ** GOTO lbl117
                throw null;
            }
lbl141:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)np.lvbr("lvgt", lvbo(int ), (int)71);
                if (!var5_2) ** GOTO lbl132
                throw null;
            }
lbl145:
            // 3 sources

            case 7: {
                var4_3 /* !! */  = (int)np.lvbr("lvgu", lvbo(int ), (int)72);
                if (!var5_2) ** GOTO lbl113
                throw null;
            }
lbl149:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)np.lvbr("lvgv", lvbo(int ), (int)73);
                if (!var5_2) ** GOTO lbl127
                throw null;
            }
lbl153:
            // 2 sources

            case 9: {
                do {
                    var4_3 /* !! */  = (int)np.lvbr("lvgw", lvbo(int ), (int)74);
                } while (!var5_2);
                throw null;
            }
lbl158:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)np.lvbr("lvgx", lvbo(int ), (int)75);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
            case 11: {
                var4_3 /* !! */  = (int)np.lvbr("lvgy", lvbo(int ), (int)76);
                if (!var5_2) ** GOTO lbl122
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)np.lvbr("lvgz", lvbo(int ), (int)77);
                if (!var5_2) ** GOTO lbl122
                throw null;
            }
lbl170:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)np.lvbr("lvha", lvbo(int ), (int)78);
                    if (!var5_2) ** GOTO lbl145
                    throw null;
                }
            }
            case 14: {
                var4_3 /* !! */  = (int)np.lvbr("lvhb", lvbo(int ), (int)79);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 15: {
                var4_3 /* !! */  = (int)np.lvbr("lvhc", lvbo(int ), (int)80);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl184:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)np.lvbr("lvhd", lvbo(int ), (int)81);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)np.lvbr("lvhe", lvbo(int ), (int)82);
                if (!var5_2) ** GOTO lbl153
                throw null;
            }
lbl192:
            // 3 sources

            case 18: {
                do {
                    var4_3 /* !! */  = (int)np.lvbr("lvhf", lvbo(int ), (int)83);
                } while (!var5_2);
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)np.lvbr("lvhg", lvbo(int ), (int)84);
                if (!var5_2) ** GOTO lbl192
                throw null;
            }
            case 20: 
        }
        var4_3 /* !! */  = (int)np.lvbr("lvhh", lvbo(int ), (int)85);
        ** while (!var5_2)
lbl204:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lwbf() {
        np.lvbp[200] = 558672149;
        np.lvbp[201] = 806335962;
        np.lvbp[202] = -671139467;
        np.lvbp[203] = 1767975859;
        np.lvbp[204] = 1044903553;
        np.lvbp[205] = -272543611;
        np.lvbp[206] = -774481226;
        np.lvbp[207] = -1920499037;
        np.lvbp[208] = -96017693;
        np.lvbp[209] = 988006424;
        np.lvbp[210] = -1503180104;
        np.lvbp[211] = -1663660912;
        np.lvbp[212] = -1261357000;
        np.lvbp[213] = 274478983;
        np.lvbp[214] = -1727164340;
        np.lvbp[215] = -86045444;
        np.lvbp[216] = 733885552;
        np.lvbp[217] = 1293219864;
        np.lvbp[218] = 656259178;
        np.lvbp[219] = 1809637111;
        np.lvbp[220] = 989913966;
        np.lvbp[221] = 157583751;
        np.lvbp[222] = -1132033605;
        np.lvbp[223] = -66841579;
        np.lvbp[224] = 935905646;
        np.lvbp[225] = 1844692066;
        np.lvbp[226] = -473072711;
        np.lvbp[227] = 131414610;
        np.lvbp[228] = -680421788;
        np.lvbp[229] = 2007471359;
        np.lvbp[230] = 1297048643;
        np.lvbp[231] = -1096769636;
        np.lvbp[232] = -1625946011;
        np.lvbp[233] = -2053977351;
        np.lvbp[234] = -741764683;
        np.lvbp[235] = 142265246;
        np.lvbp[236] = -918074731;
        np.lvbp[237] = -1271350702;
        np.lvbp[238] = 1304346840;
        np.lvbp[239] = 140671657;
        np.lvbp[240] = -710188342;
        np.lvbp[241] = -1867401730;
        np.lvbp[242] = -1924223977;
        np.lvbp[243] = -1803889167;
        np.lvbp[244] = -681932727;
        np.lvbp[245] = 1544463368;
        np.lvbp[246] = 156113980;
        np.lvbp[247] = -415057112;
        np.lvbp[248] = 1811706102;
        np.lvbp[249] = -378980478;
        np.lvbp[250] = -1260865943;
        np.lvbp[251] = -1747172884;
        np.lvbp[252] = -1138496419;
        np.lvbp[253] = 467830957;
        np.lvbp[254] = 141884068;
        np.lvbp[255] = 319151169;
        np.lvbp[256] = 1048076685;
        np.lvbp[257] = 1974081507;
        np.lvbp[258] = 1953899660;
        np.lvbp[259] = 2090385003;
        np.lvbp[260] = 1210187774;
        np.lvbp[261] = -1841070264;
        np.lvbp[262] = -1764826416;
        np.lvbp[263] = 410412618;
        np.lvbp[264] = -421086802;
        np.lvbp[265] = -589213710;
        np.lvbp[266] = 172169768;
        np.lvbp[267] = 1141469923;
        np.lvbp[268] = -1850516080;
        np.lvbp[269] = 739239548;
        np.lvbp[270] = 1494624270;
        np.lvbp[271] = 891037200;
        np.lvbp[272] = -64135103;
        np.lvbp[273] = -28100945;
        np.lvbp[274] = 490100985;
        np.lvbp[275] = 1376337044;
        np.lvbp[276] = -1365300639;
        np.lvbp[277] = -66661152;
        np.lvbp[278] = 717063129;
        np.lvbp[279] = 544339894;
        np.lvbp[280] = -430309303;
        np.lvbp[281] = -1040204496;
        np.lvbp[282] = -2102786820;
        np.lvbp[283] = -1259437349;
        np.lvbp[284] = 12966165;
        np.lvbp[285] = 845390286;
        np.lvbp[286] = -365788672;
        np.lvbp[287] = -572777550;
        np.lvbp[288] = 772322228;
        np.lvbp[289] = 102874480;
        np.lvbp[290] = 1112160216;
        np.lvbp[291] = 470218045;
        np.lvbp[292] = 679246588;
        np.lvbp[293] = -1750144083;
        np.lvbp[294] = -1088886886;
        np.lvbp[295] = -1615897417;
        np.lvbp[296] = 1239728096;
        np.lvbp[297] = -1714479858;
        np.lvbp[298] = -158943718;
        np.lvbp[299] = 1454395379;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float total(class_1309 var0) {
        block71: {
            block74: {
                block73: {
                    block72: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_0 = np.un - np.lvbr("lvhi", lvbv(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == np.lvbr("lvhj", lvbo(int ), (int)86)) break;
                            v0 /* !! */  = (long)np.lvbr("lvhk", lvbo(int ), (int)87);
                        }
                        var7_1 = np.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_1 = np.un - np.lvbr("lvhl", lvbv(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v1 /* !! */  == np.lvbr("lvhm", lvbo(int ), (int)88)) break;
                            v1 /* !! */  = (long)np.lvbr("lvhn", lvbo(int ), (int)89);
                        }
                        var6_2 = np.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = np.un - np.lvbr("lvho", lvbv(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == np.lvbr("lvhp", lvbo(int ), (int)90)) break;
                            v2 /* !! */  = (long)np.lvbr("lvhq", lvbo(int ), (int)91);
                        }
                        var5_3 = np.a;
                        if (var7_1) {
                            throw null;
lbl21:
                            // 13 sources

                            return (float)np.lvbr("lvhr", lvef(int ), (int)92);
                        }
                        if (var5_3 || var5_3) ** GOTO lbl21
                        if (!(var0 instanceof class_1657)) break block71;
                        if (var5_3) ** GOTO lbl21
                        var1_4 = (class_1657)var0;
                        if (var5_3 || var5_3) ** GOTO lbl21
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = np.un - np.lvbr("lvhs", lvbv(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == np.lvbr("lvht", lvbo(int ), (int)93)) break;
                            v3 /* !! */  = (long)np.lvbr("lvhu", lvbo(int ), (int)94);
                        }
                        if (!np.shouldFix()) break block71;
                        if (var5_3 || var5_3) ** GOTO lbl21
                        v4 /* !! */  = np.un;
                        if (true) ** GOTO lbl39
                        block54: while (true) {
                            v4 /* !! */  = (long)(np.lvbr("lvhw", lvbv(int ), (int)61) - np.lvbr("lvhv", lvbv(int ), (int)60));
lbl39:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -1808539765: {
                                    continue block54;
                                }
                                case 186306080: {
                                    break block54;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = np.un;
                        if (true) ** GOTO lbl48
                        block55: while (true) {
                            v5 /* !! */  = (long)(v6 - np.lvbr("lvhx", lvbv(int ), (int)62));
lbl48:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case -500331946: {
                                    v6 = np.lvbr("lvhy", lvbv(int ), (int)63);
                                    continue block55;
                                }
                                case 186306080: {
                                    break block55;
                                }
                                case 1575235514: {
                                    v6 = np.lvbr("lvhz", lvbv(int ), (int)64);
                                    continue block55;
                                }
                                case 1685263649: {
                                    v6 = np.lvbr("lvia", lvbv(int ), (int)65);
                                    continue block55;
                                }
                            }
                            break;
                        }
                        v7 = var1_4.method_5628();
                        v8 /* !! */  = np.un;
                        if (true) ** GOTO lbl65
                        block56: while (true) {
                            v8 /* !! */  = (long)(np.lvbr("lvic", lvbv(int ), (int)67) - np.lvbr("lvib", lvbv(int ), (int)66));
lbl65:
                            // 2 sources

                            switch ((int)v8 /* !! */ ) {
                                case -537120363: {
                                    continue block56;
                                }
                                case 186306080: {
                                    break block56;
                                }
                            }
                            break;
                        }
                        var2_5 = (np$Snapshot)np.SNAPSHOTS.get(v7);
                        if (var5_3 || var5_3) ** GOTO lbl21
                        if (var2_5 == null) break block72;
                        if (var5_3 || var5_3) ** GOTO lbl21
                        v9 /* !! */  = np.un;
                        if (true) ** GOTO lbl78
                        block57: while (true) {
                            v9 /* !! */  = (long)(np.lvbr("lvie", lvbv(int ), (int)69) - np.lvbr("lvid", lvbv(int ), (int)68));
lbl78:
                            // 2 sources

                            switch ((int)v9 /* !! */ ) {
                                case -1245374606: {
                                    continue block57;
                                }
                                case 186306080: {
                                    break block57;
                                }
                            }
                            break;
                        }
                        return var2_5.health;
                    }
                    if (var5_3 || var5_3) ** GOTO lbl21
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = np.un - np.lvbr("lvif", lvbv(int ), (int)70)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == np.lvbr("lvig", lvbo(int ), (int)95)) break;
                        v10 /* !! */  = (long)np.lvbr("lvih", lvbo(int ), (int)96);
                    }
                    v11 = var0.method_6032();
                    v12 /* !! */  = np.un;
                    if (true) ** GOTO lbl96
                    block59: while (true) {
                        v12 /* !! */  = (long)(np.lvbr("lvij", lvbv(int ), (int)72) - np.lvbr("lvii", lvbv(int ), (int)71));
lbl96:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -910839238: {
                                continue block59;
                            }
                            case 186306080: {
                                break block59;
                            }
                        }
                        break;
                    }
                    var3_6 = v11 + var0.method_6067();
                    if (var5_3 || var5_3) ** GOTO lbl21
                    v13 /* !! */  = np.un;
                    if (true) ** GOTO lbl107
                    block60: while (true) {
                        v13 /* !! */  = (long)(v14 - np.lvbr("lvik", lvbv(int ), (int)73));
lbl107:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -2058427584: {
                                v14 = np.lvbr("lvil", lvbv(int ), (int)74);
                                continue block60;
                            }
                            case -1304677303: {
                                v14 = np.lvbr("lvim", lvbv(int ), (int)75);
                                continue block60;
                            }
                            case 186306080: {
                                break block60;
                            }
                            case 449791957: {
                                v14 = np.lvbr("lvin", lvbv(int ), (int)76);
                                continue block60;
                            }
                        }
                        break;
                    }
                    v15 = var0.method_6032();
                    v16 /* !! */  = np.un;
                    if (true) ** GOTO lbl124
                    block61: while (true) {
                        v16 /* !! */  = (long)(v17 - np.lvbr("lvio", lvbv(int ), (int)77));
lbl124:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -705447540: {
                                v17 = np.lvbr("lvip", lvbv(int ), (int)78);
                                continue block61;
                            }
                            case 36244826: {
                                v17 = np.lvbr("lviq", lvbv(int ), (int)79);
                                continue block61;
                            }
                            case 186306080: {
                                break block61;
                            }
                        }
                        break;
                    }
                    var4_7 = np.resolve(var1_4, v15);
                    if (var5_3 || var5_3) ** GOTO lbl21
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_5 = np.un - np.lvbr("lvir", lvbv(int ), (int)80)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == np.lvbr("lvis", lvbo(int ), (int)97)) break;
                        v18 /* !! */  = (long)np.lvbr("lvit", lvbo(int ), (int)98);
                    }
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_6 = np.un - np.lvbr("lviu", lvbv(int ), (int)81)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == np.lvbr("lviv", lvbo(int ), (int)99)) break;
                        v19 /* !! */  = (long)np.lvbr("lviw", lvbo(int ), (int)100);
                    }
                    v20 = var1_4.method_5628();
                    v21 /* !! */  = np.un;
                    if (true) ** GOTO lbl150
                    block64: while (true) {
                        v21 /* !! */  = (long)(v22 - np.lvbr("lvix", lvbv(int ), (int)82));
lbl150:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1316768241: {
                                v22 = np.lvbr("lviy", lvbv(int ), (int)83);
                                continue block64;
                            }
                            case -1281331733: {
                                v22 = np.lvbr("lviz", lvbv(int ), (int)84);
                                continue block64;
                            }
                            case 186306080: {
                                break block64;
                            }
                            case 360278620: {
                                v22 = np.lvbr("lvja", lvbv(int ), (int)85);
                                continue block64;
                            }
                        }
                        break;
                    }
                    np.SNAPSHOTS.put(v20, (Object)var4_7);
                    if (var5_3 || var5_3) ** GOTO lbl21
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_7 = np.un - np.lvbr("lvjb", lvbv(int ), (int)86)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == np.lvbr("lvjc", lvbo(int ), (int)101)) break;
                        v23 /* !! */  = (long)np.lvbr("lvjd", lvbo(int ), (int)102);
                    }
                    if (!var4_7.scoreboard) break block73;
                    if (var5_3) ** GOTO lbl21
                    v24 /* !! */  = np.un;
                    if (true) ** GOTO lbl176
                    block66: while (true) {
                        v24 /* !! */  = (long)(v25 - np.lvbr("lvje", lvbv(int ), (int)87));
lbl176:
                        // 2 sources

                        switch ((int)v24 /* !! */ ) {
                            case -1515772905: {
                                v25 = np.lvbr("lvjf", lvbv(int ), (int)88);
                                continue block66;
                            }
                            case -844664729: {
                                v25 = np.lvbr("lvjg", lvbv(int ), (int)89);
                                continue block66;
                            }
                            case 186306080: {
                                break block66;
                            }
                        }
                        break;
                    }
                    v26 = var4_7.health;
                    if (var7_1) {
                        throw null;
                    }
                    break block74;
                }
                if (var5_3 || var5_3) ** GOTO lbl21
                v26 = var3_6;
            }
            return v26;
        }
        if (!var5_3 && !var5_3) ** break;
        ** while (true)
        v27 /* !! */  = np.un;
        if (true) ** GOTO lbl201
        block67: while (true) {
            v27 /* !! */  = (long)(v28 - np.lvbr("lvjh", lvbv(int ), (int)90));
lbl201:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case 54586917: {
                    v28 = np.lvbr("lvji", lvbv(int ), (int)91);
                    continue block67;
                }
                case 186306080: {
                    break block67;
                }
                case 1550414123: {
                    v28 = np.lvbr("lvjj", lvbv(int ), (int)92);
                    continue block67;
                }
            }
            break;
        }
        v29 = var0.method_6032();
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_8 = np.un - np.lvbr("lvjk", lvbv(int ), (int)93)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == np.lvbr("lvjl", lvbo(int ), (int)103)) break;
            v30 /* !! */  = (long)np.lvbr("lvjm", lvbo(int ), (int)104);
        }
        return v29 + var0.method_6067();
    }

    private static /* synthetic */ void lwbn() {
        np.lvbw[0] = -3641841929698557219L;
        np.lvbw[1] = 3120273288377918080L;
        np.lvbw[2] = 6223028224398650979L;
        np.lvbw[3] = -7551790454498279291L;
        np.lvbw[4] = -6066681321916039296L;
        np.lvbw[5] = 5928955907744353517L;
        np.lvbw[6] = -5657777596766176201L;
        np.lvbw[7] = 6165469087368363653L;
        np.lvbw[8] = -8917722014881384188L;
        np.lvbw[9] = -7175145556498172433L;
        np.lvbw[10] = -4661060418351696820L;
        np.lvbw[11] = 7356099458072164657L;
        np.lvbw[12] = -6339520955103763270L;
        np.lvbw[13] = -1786501721916688904L;
        np.lvbw[14] = 1598659916120566392L;
        np.lvbw[15] = -5104721506560816493L;
        np.lvbw[16] = 3004849567961259886L;
        np.lvbw[17] = -9064325521835503021L;
        np.lvbw[18] = 3047584744577825795L;
        np.lvbw[19] = -2957633027287373874L;
        np.lvbw[20] = -5441094040215181088L;
        np.lvbw[21] = 9034710377630118753L;
        np.lvbw[22] = -3422451781918532013L;
        np.lvbw[23] = -515216077404852181L;
        np.lvbw[24] = -4316694503252251924L;
        np.lvbw[25] = -8422682288212682317L;
        np.lvbw[26] = -2377563277635248957L;
        np.lvbw[27] = -3539684202637496758L;
        np.lvbw[28] = -7437815873242205283L;
        np.lvbw[29] = -7689820985432290246L;
        np.lvbw[30] = 1420815539737199082L;
        np.lvbw[31] = 5837341490243537804L;
        np.lvbw[32] = 2147504738627333737L;
        np.lvbw[33] = 7719386067034659110L;
        np.lvbw[34] = -8342934297353930468L;
        np.lvbw[35] = 8351084518267124223L;
        np.lvbw[36] = -1043722770672262066L;
        np.lvbw[37] = -890720794380867736L;
        np.lvbw[38] = -5273227288478324340L;
        np.lvbw[39] = 3913816440179708687L;
        np.lvbw[40] = -7590160741385328392L;
        np.lvbw[41] = -1748562884323174278L;
        np.lvbw[42] = -2627284774468537837L;
        np.lvbw[43] = -2623622668443532328L;
        np.lvbw[44] = 1300989631656735896L;
        np.lvbw[45] = -1658123541269439103L;
        np.lvbw[46] = 4304850659640615328L;
        np.lvbw[47] = 2600137294987457799L;
        np.lvbw[48] = 2640130117761859968L;
        np.lvbw[49] = -2340201735338507750L;
        np.lvbw[50] = 7556033770747302773L;
        np.lvbw[51] = -5102420669272143407L;
        np.lvbw[52] = 6467993766820705586L;
        np.lvbw[53] = 4329436518024184742L;
        np.lvbw[54] = 4289261615860966584L;
        np.lvbw[55] = 1076319469102162021L;
        np.lvbw[56] = -8321923420040473930L;
        np.lvbw[57] = 634037838063814645L;
        np.lvbw[58] = 2053943367178817721L;
        np.lvbw[59] = 4527548370225660112L;
        np.lvbw[60] = 2902964143190522379L;
        np.lvbw[61] = 2712654689721603868L;
        np.lvbw[62] = 1866874405639277498L;
        np.lvbw[63] = 7297433580269314017L;
        np.lvbw[64] = 3728390471533488826L;
        np.lvbw[65] = -2126031375987290420L;
        np.lvbw[66] = 1814247561705766688L;
        np.lvbw[67] = 8393246087552794244L;
        np.lvbw[68] = 8179722829312844569L;
        np.lvbw[69] = -1499198110096847698L;
        np.lvbw[70] = -5211654696263959112L;
        np.lvbw[71] = -6641899476514959430L;
        np.lvbw[72] = 6818199682049922451L;
        np.lvbw[73] = -4737906100864464051L;
        np.lvbw[74] = -7128512828093940465L;
        np.lvbw[75] = 6588146439097561321L;
        np.lvbw[76] = 1477512432901109855L;
        np.lvbw[77] = 4256502182663398425L;
        np.lvbw[78] = -8672489676679616326L;
        np.lvbw[79] = -4417175423195554209L;
        np.lvbw[80] = 8745087261554875191L;
        np.lvbw[81] = -410338276874883152L;
        np.lvbw[82] = 4557660588001367799L;
        np.lvbw[83] = 4152098245330022189L;
        np.lvbw[84] = 2050706039011502407L;
        np.lvbw[85] = -8536182154096286321L;
        np.lvbw[86] = -4606134212043428539L;
        np.lvbw[87] = 964658030488731209L;
        np.lvbw[88] = -9146904615447575934L;
        np.lvbw[89] = -3751656933615246738L;
        np.lvbw[90] = 2193135601562949581L;
        np.lvbw[91] = 4675643200829172846L;
        np.lvbw[92] = 5426982836852868890L;
        np.lvbw[93] = 6946982495381142886L;
        np.lvbw[94] = 49050073618250163L;
        np.lvbw[95] = -217994089865084121L;
        np.lvbw[96] = 2766075051764064769L;
        np.lvbw[97] = -4001276541865231049L;
        np.lvbw[98] = -2784300610990538642L;
        np.lvbw[99] = -367198747103524407L;
    }

    private static /* synthetic */ void lwbm() {
        np.lvbq[400] = 1803354022;
        np.lvbq[401] = 1741558476;
        np.lvbq[402] = -541301316;
        np.lvbq[403] = -1764401748;
        np.lvbq[404] = 413075237;
        np.lvbq[405] = -283096645;
        np.lvbq[406] = 787553626;
        np.lvbq[407] = 875079046;
        np.lvbq[408] = 919281945;
        np.lvbq[409] = -477613253;
        np.lvbq[410] = -404243210;
        np.lvbq[411] = -1252705928;
        np.lvbq[412] = 868863096;
        np.lvbq[413] = 415124884;
        np.lvbq[414] = 43341402;
        np.lvbq[415] = -1657596093;
        np.lvbq[416] = -576978825;
        np.lvbq[417] = 1797890218;
        np.lvbq[418] = 1555265271;
        np.lvbq[419] = -1180104244;
        np.lvbq[420] = 466746803;
        np.lvbq[421] = -1319527452;
        np.lvbq[422] = -1742212563;
        np.lvbq[423] = -1193240176;
        np.lvbq[424] = -1895604121;
        np.lvbq[425] = -53068688;
        np.lvbq[426] = -1445660123;
        np.lvbq[427] = -1585481460;
        np.lvbq[428] = -1270785895;
        np.lvbq[429] = -1478912227;
        np.lvbq[430] = -2126766102;
        np.lvbq[431] = 1953164889;
        np.lvbq[432] = -984853512;
        np.lvbq[433] = -1176432026;
        np.lvbq[434] = -1542387831;
        np.lvbq[435] = -2056778138;
        np.lvbq[436] = 152817435;
        np.lvbq[437] = -2080429346;
        np.lvbq[438] = 1087518714;
        np.lvbq[439] = -1495969891;
        np.lvbq[440] = -1791336871;
        np.lvbq[441] = -1623451454;
        np.lvbq[442] = -615682447;
        np.lvbq[443] = 180989512;
        np.lvbq[444] = 726011908;
        np.lvbq[445] = -39731254;
        np.lvbq[446] = -1253490516;
        np.lvbq[447] = -1198112169;
        np.lvbq[448] = -1235531554;
        np.lvbq[449] = 633062541;
        np.lvbq[450] = -1485434740;
    }

    private static /* synthetic */ void lwbd() {
        np.lvbp[0] = -1967705122;
        np.lvbp[1] = 1423354335;
        np.lvbp[2] = -1077867838;
        np.lvbp[3] = -1831858550;
        np.lvbp[4] = 798188521;
        np.lvbp[5] = -118709044;
        np.lvbp[6] = 110467403;
        np.lvbp[7] = -802656566;
        np.lvbp[8] = 854144088;
        np.lvbp[9] = 1409430773;
        np.lvbp[10] = 1611897223;
        np.lvbp[11] = 1535850265;
        np.lvbp[12] = 969644246;
        np.lvbp[13] = -2039060589;
        np.lvbp[14] = 1433743118;
        np.lvbp[15] = -1109139271;
        np.lvbp[16] = 468305682;
        np.lvbp[17] = 1446403549;
        np.lvbp[18] = -335588336;
        np.lvbp[19] = -1182355800;
        np.lvbp[20] = -140426492;
        np.lvbp[21] = -1654003133;
        np.lvbp[22] = 1878442559;
        np.lvbp[23] = -1227557866;
        np.lvbp[24] = -448879270;
        np.lvbp[25] = 2090703687;
        np.lvbp[26] = 1614830789;
        np.lvbp[27] = 1057179476;
        np.lvbp[28] = 1802586050;
        np.lvbp[29] = 809192743;
        np.lvbp[30] = 113654774;
        np.lvbp[31] = -984755698;
        np.lvbp[32] = 1998881212;
        np.lvbp[33] = -743904423;
        np.lvbp[34] = 598455684;
        np.lvbp[35] = -2035411499;
        np.lvbp[36] = -76052017;
        np.lvbp[37] = 1328540359;
        np.lvbp[38] = -1753078741;
        np.lvbp[39] = -101050053;
        np.lvbp[40] = 1185159337;
        np.lvbp[41] = 489201959;
        np.lvbp[42] = 1601234161;
        np.lvbp[43] = 1062190309;
        np.lvbp[44] = -758643709;
        np.lvbp[45] = 1814301032;
        np.lvbp[46] = -1470480225;
        np.lvbp[47] = 848917372;
        np.lvbp[48] = -152830409;
        np.lvbp[49] = 1332795154;
        np.lvbp[50] = 743720675;
        np.lvbp[51] = -1290517850;
        np.lvbp[52] = -1200108438;
        np.lvbp[53] = -20000571;
        np.lvbp[54] = -1881057644;
        np.lvbp[55] = -1503376807;
        np.lvbp[56] = 174973626;
        np.lvbp[57] = 1294564259;
        np.lvbp[58] = 1132877511;
        np.lvbp[59] = 802801905;
        np.lvbp[60] = 926545361;
        np.lvbp[61] = -1351363852;
        np.lvbp[62] = 1235802568;
        np.lvbp[63] = -1522416861;
        np.lvbp[64] = 1495539641;
        np.lvbp[65] = -1043405993;
        np.lvbp[66] = 1037113707;
        np.lvbp[67] = -35510086;
        np.lvbp[68] = 1526828030;
        np.lvbp[69] = 1780268123;
        np.lvbp[70] = 1986543429;
        np.lvbp[71] = -1903442998;
        np.lvbp[72] = -1067961067;
        np.lvbp[73] = 1355138925;
        np.lvbp[74] = -802941879;
        np.lvbp[75] = 182953657;
        np.lvbp[76] = -1725600243;
        np.lvbp[77] = 1392395563;
        np.lvbp[78] = 2135900535;
        np.lvbp[79] = 1100568997;
        np.lvbp[80] = -600303668;
        np.lvbp[81] = 2113515540;
        np.lvbp[82] = -1811168253;
        np.lvbp[83] = 584206532;
        np.lvbp[84] = 1789930517;
        np.lvbp[85] = -61100621;
        np.lvbp[86] = -1109777078;
        np.lvbp[87] = 595375034;
        np.lvbp[88] = -1804904594;
        np.lvbp[89] = 1945162524;
        np.lvbp[90] = 650208022;
        np.lvbp[91] = -2108390750;
        np.lvbp[92] = 961332887;
        np.lvbp[93] = -1756166465;
        np.lvbp[94] = 180805394;
        np.lvbp[95] = 1371549384;
        np.lvbp[96] = -1391611570;
        np.lvbp[97] = 802060625;
        np.lvbp[98] = -273037264;
        np.lvbp[99] = -309904978;
    }

    private static /* synthetic */ double lvye(int n2) {
        return Double.longBitsToDouble(lvbw[n2] ^ lvbx[n2]);
    }

    private static /* synthetic */ void lwbq() {
        np.lvbx[0] = -7956557590796676581L;
        np.lvbx[1] = 6899107104439414722L;
        np.lvbx[2] = 2312910139904644985L;
        np.lvbx[3] = 8220360160089693189L;
        np.lvbx[4] = -6493909743082489433L;
        np.lvbx[5] = -588081043802431175L;
        np.lvbx[6] = -7442643971667192003L;
        np.lvbx[7] = -7642973384069978774L;
        np.lvbx[8] = 7380525751216420536L;
        np.lvbx[9] = -2315325154808246103L;
        np.lvbx[10] = -7383474640590552961L;
        np.lvbx[11] = -5365844695806120148L;
        np.lvbx[12] = 984992860808336515L;
        np.lvbx[13] = -3327432137198062913L;
        np.lvbx[14] = 3365068376803249122L;
        np.lvbx[15] = -4741248826553228170L;
        np.lvbx[16] = -1334794479887682639L;
        np.lvbx[17] = 343975423078295317L;
        np.lvbx[18] = 9027924742408957947L;
        np.lvbx[19] = -8757676426899420643L;
        np.lvbx[20] = -429763263364950575L;
        np.lvbx[21] = -7121751337361098438L;
        np.lvbx[22] = -6862146166539802645L;
        np.lvbx[23] = -4430005993569700173L;
        np.lvbx[24] = -8988920995227004737L;
        np.lvbx[25] = -1215454583984174609L;
        np.lvbx[26] = 623450977165924337L;
        np.lvbx[27] = 5351114508082941268L;
        np.lvbx[28] = 6529789895907223873L;
        np.lvbx[29] = -4909057602641919682L;
        np.lvbx[30] = 7436315769995198952L;
        np.lvbx[31] = -2267813517731002559L;
        np.lvbx[32] = -1244453554256671966L;
        np.lvbx[33] = 1287757958438183868L;
        np.lvbx[34] = -8335385084306171278L;
        np.lvbx[35] = -7610833260853499800L;
        np.lvbx[36] = -8699238575456783416L;
        np.lvbx[37] = 3095990970887010585L;
        np.lvbx[38] = -6278856508959819376L;
        np.lvbx[39] = 1997030294859793617L;
        np.lvbx[40] = 6304701672734696864L;
        np.lvbx[41] = 1416959223624366870L;
        np.lvbx[42] = -3868122790096622842L;
        np.lvbx[43] = 4602332963060350238L;
        np.lvbx[44] = -8466380753677161167L;
        np.lvbx[45] = 4094613175604189162L;
        np.lvbx[46] = -1062146546243552792L;
        np.lvbx[47] = 2700593575147540804L;
        np.lvbx[48] = -5211529328311349648L;
        np.lvbx[49] = 8018534938127921172L;
        np.lvbx[50] = 2252851872716700710L;
        np.lvbx[51] = 8221841027856836553L;
        np.lvbx[52] = -5700113001703946165L;
        np.lvbx[53] = -5233036708565507315L;
        np.lvbx[54] = 1988086593447517008L;
        np.lvbx[55] = 5988246344139483198L;
        np.lvbx[56] = -4814368623700635105L;
        np.lvbx[57] = 8139889239474049502L;
        np.lvbx[58] = -6764127396828393135L;
        np.lvbx[59] = 2661692856920112498L;
        np.lvbx[60] = 6637387363700157144L;
        np.lvbx[61] = -6931448151961543035L;
        np.lvbx[62] = -6794332035303290332L;
        np.lvbx[63] = -1259386093144094206L;
        np.lvbx[64] = -937105944684955999L;
        np.lvbx[65] = -5209370609795658286L;
        np.lvbx[66] = 1769929239229157927L;
        np.lvbx[67] = 7810969316888703476L;
        np.lvbx[68] = 3162659286798457964L;
        np.lvbx[69] = 4129014492977062567L;
        np.lvbx[70] = 886443553749199763L;
        np.lvbx[71] = 7481825552213350921L;
        np.lvbx[72] = -3678250018725014676L;
        np.lvbx[73] = -3290503322820330095L;
        np.lvbx[74] = 2133149542000602059L;
        np.lvbx[75] = 1884706461758667676L;
        np.lvbx[76] = 3253244717247545086L;
        np.lvbx[77] = -1439696359643689251L;
        np.lvbx[78] = -6113429810706212342L;
        np.lvbx[79] = -2747664197192379875L;
        np.lvbx[80] = 767161359738832685L;
        np.lvbx[81] = 5989115803574297105L;
        np.lvbx[82] = 9069952916546681663L;
        np.lvbx[83] = -1863574020827992257L;
        np.lvbx[84] = -5059950783369527599L;
        np.lvbx[85] = -6553871006087843607L;
        np.lvbx[86] = 915155237466935915L;
        np.lvbx[87] = 5929585892790902380L;
        np.lvbx[88] = 2236341266820857288L;
        np.lvbx[89] = 4621861261150844511L;
        np.lvbx[90] = 2082655967414849845L;
        np.lvbx[91] = -7527759310707927881L;
        np.lvbx[92] = 7607725794514625979L;
        np.lvbx[93] = 112277546117651899L;
        np.lvbx[94] = -6072400144211070172L;
        np.lvbx[95] = 6913800756004206884L;
        np.lvbx[96] = 4254927122898410857L;
        np.lvbx[97] = 6171414537343288142L;
        np.lvbx[98] = 548464772406495282L;
        np.lvbx[99] = -2862793845850983790L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean shouldFix() {
        CallSite callSite;
        boolean bl2;
        block65: {
            boolean bl3;
            block62: {
                block64: {
                    block63: {
                        Object object = un;
                        boolean bl4 = true;
                        block32: while (true) {
                            CallSite callSite2;
                            if (!bl4 || (bl4 = false) || !true) {
                                object = callSite2 - np.lvbr("lvby", lvbv(int ), (int)0);
                            }
                            switch ((int)object) {
                                case -1933352369: {
                                    callSite2 = np.lvbr("lvbz", lvbv(int ), (int)1);
                                    continue block32;
                                }
                                case -432477838: {
                                    callSite2 = np.lvbr("lvca", lvbv(int ), (int)2);
                                    continue block32;
                                }
                                case 151358345: {
                                    callSite2 = np.lvbr("lvcb", lvbv(int ), (int)3);
                                    continue block32;
                                }
                                case 186306080: {
                                    break block32;
                                }
                            }
                            break;
                        }
                        bl3 = c;
                        while (true) {
                            long l2;
                            Object object2;
                            if ((object2 = (l2 = un - np.lvbr("lvcc", lvbv(int ), (int)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                            if (object2 == np.lvbr("lvcd", lvbo(int ), (int)3)) break;
                            object2 = np.lvbr("lvce", lvbo(int ), (int)4);
                        }
                        int n2 = b;
                        while (true) {
                            long l3;
                            Object object3;
                            if ((object3 = (l3 = un - np.lvbr("lvcf", lvbv(int ), (int)5)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                            if (object3 == np.lvbr("lvcg", lvbo(int ), (int)5)) {
                                bl2 = a;
                                if (bl3) {
                                    throw null;
                                }
                                break;
                            }
                            object3 = np.lvbr("lvch", lvbo(int ), (int)6);
                        }
                        if (bl2 || bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                        Object object4 = un;
                        block35: while (true) {
                            switch ((int)object4) {
                                case 186306080: {
                                    break block35;
                                }
                                case 1949758172: {
                                    object4 = np.lvbr("lvck", lvbv(int ), (int)7) - np.lvbr("lvcj", lvbv(int ), (int)6);
                                    continue block35;
                                }
                            }
                            break;
                        }
                        Object object5 = un;
                        boolean bl5 = true;
                        block36: while (true) {
                            CallSite callSite3;
                            if (!bl5 || (bl5 = false) || !true) {
                                object5 = callSite3 - np.lvbr("lvcl", lvbv(int ), (int)8);
                            }
                            switch ((int)object5) {
                                case 186306080: {
                                    break block36;
                                }
                                case 229573425: {
                                    callSite3 = np.lvbr("lvcm", lvbv(int ), (int)9);
                                    continue block36;
                                }
                                case 464938152: {
                                    callSite3 = np.lvbr("lvcn", lvbv(int ), (int)10);
                                    continue block36;
                                }
                                case 2115032259: {
                                    callSite3 = np.lvbr("lvco", lvbv(int ), (int)11);
                                    continue block36;
                                }
                            }
                            break;
                        }
                        if (np.mc.field_1724 == null) break block63;
                        if (bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                        Object object6 = un;
                        boolean bl6 = true;
                        block37: while (true) {
                            CallSite callSite4;
                            if (!bl6 || (bl6 = false) || !true) {
                                object6 = callSite4 - np.lvbr("lvcp", lvbv(int ), (int)12);
                            }
                            switch ((int)object6) {
                                case -1448199329: {
                                    callSite4 = np.lvbr("lvcq", lvbv(int ), (int)13);
                                    continue block37;
                                }
                                case -906027113: {
                                    callSite4 = np.lvbr("lvcr", lvbv(int ), (int)14);
                                    continue block37;
                                }
                                case 186306080: {
                                    break block37;
                                }
                                case 630586072: {
                                    callSite4 = np.lvbr("lvcs", lvbv(int ), (int)15);
                                    continue block37;
                                }
                            }
                            break;
                        }
                        Object object7 = un;
                        boolean bl7 = true;
                        block38: while (true) {
                            CallSite callSite5;
                            if (!bl7 || (bl7 = false) || !true) {
                                object7 = callSite5 - np.lvbr("lvct", lvbv(int ), (int)16);
                            }
                            switch ((int)object7) {
                                case -849531221: {
                                    callSite5 = np.lvbr("lvcu", lvbv(int ), (int)17);
                                    continue block38;
                                }
                                case 186306080: {
                                    break block38;
                                }
                                case 1171550304: {
                                    callSite5 = np.lvbr("lvcv", lvbv(int ), (int)18);
                                    continue block38;
                                }
                            }
                            break;
                        }
                        if (np.mc.field_1687 != null) break block64;
                        if (bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                    }
                    if (bl2 || bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                    return (boolean)np.lvbr("lvcw", lvbo(int ), (int)8);
                }
                if (bl2 || bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                while (true) {
                    long l4;
                    Object object;
                    if ((object = (l4 = un - np.lvbr("lvcx", lvbv(int ), (int)19)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object == np.lvbr("lvcy", lvbo(int ), (int)9)) {
                        if (!mq.isFunTime()) {
                            break;
                        }
                        break block62;
                    }
                    object = np.lvbr("lvcz", lvbo(int ), (int)10);
                }
                if (bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
                Object object = un;
                boolean bl8 = true;
                block40: while (true) {
                    CallSite callSite6;
                    if (!bl8 || (bl8 = false) || !true) {
                        object = callSite6 - np.lvbr("lvda", lvbv(int ), (int)20);
                    }
                    switch ((int)object) {
                        case 186306080: {
                            break block40;
                        }
                        case 685219961: {
                            callSite6 = np.lvbr("lvdb", lvbv(int ), (int)21);
                            continue block40;
                        }
                        case 1078638004: {
                            callSite6 = np.lvbr("lvdc", lvbv(int ), (int)22);
                            continue block40;
                        }
                    }
                    break;
                }
                if (!mq.isCopyTime()) break block65;
                if (bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
            }
            if (bl2 || bl2) return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
            callSite = np.lvbr("lvdd", lvbo(int ), (int)11);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)np.lvbr("lvci", lvbo(int ), (int)7);
        }
        callSite = np.lvbr("lvde", lvbo(int ), (int)12);
        return (boolean)callSite;
    }

    private static /* synthetic */ int lvbo(int n2) {
        return lvbp[n2] ^ lvbq[n2];
    }

    private static /* synthetic */ long lvbv(int n2) {
        return lvbw[n2] ^ lvbx[n2];
    }

    private static /* synthetic */ void lwbe() {
        np.lvbp[100] = -1607961783;
        np.lvbp[101] = -1719697790;
        np.lvbp[102] = 394154646;
        np.lvbp[103] = 1488185957;
        np.lvbp[104] = 322246349;
        np.lvbp[105] = -1148452036;
        np.lvbp[106] = 22027688;
        np.lvbp[107] = 1217466005;
        np.lvbp[108] = -1007045818;
        np.lvbp[109] = 2070533970;
        np.lvbp[110] = 260519583;
        np.lvbp[111] = -1237325774;
        np.lvbp[112] = -1526885774;
        np.lvbp[113] = 377910042;
        np.lvbp[114] = 1682927697;
        np.lvbp[115] = 1308220530;
        np.lvbp[116] = 602574136;
        np.lvbp[117] = 95791160;
        np.lvbp[118] = 314056957;
        np.lvbp[119] = 633073589;
        np.lvbp[120] = 399785290;
        np.lvbp[121] = -290498731;
        np.lvbp[122] = -1058627521;
        np.lvbp[123] = 1522054583;
        np.lvbp[124] = 857365440;
        np.lvbp[125] = -1164659870;
        np.lvbp[126] = 1785084235;
        np.lvbp[127] = -1138309919;
        np.lvbp[128] = 1361820168;
        np.lvbp[129] = 1251966506;
        np.lvbp[130] = -1973399259;
        np.lvbp[131] = 284720170;
        np.lvbp[132] = -1400454923;
        np.lvbp[133] = 530054800;
        np.lvbp[134] = -1586760295;
        np.lvbp[135] = 1403907908;
        np.lvbp[136] = -1438017276;
        np.lvbp[137] = -422148731;
        np.lvbp[138] = -519161696;
        np.lvbp[139] = -295262784;
        np.lvbp[140] = -1508961288;
        np.lvbp[141] = -858802950;
        np.lvbp[142] = 1020335581;
        np.lvbp[143] = 1679510644;
        np.lvbp[144] = -133619616;
        np.lvbp[145] = 674006761;
        np.lvbp[146] = -860362571;
        np.lvbp[147] = 1743242409;
        np.lvbp[148] = 1776253494;
        np.lvbp[149] = 2040313783;
        np.lvbp[150] = -1083458108;
        np.lvbp[151] = 1287427433;
        np.lvbp[152] = 159463627;
        np.lvbp[153] = -1906091681;
        np.lvbp[154] = -1929643894;
        np.lvbp[155] = -1147347406;
        np.lvbp[156] = -1172519181;
        np.lvbp[157] = 1318679081;
        np.lvbp[158] = -336203713;
        np.lvbp[159] = 1600830581;
        np.lvbp[160] = -1954025601;
        np.lvbp[161] = 72333168;
        np.lvbp[162] = -671865565;
        np.lvbp[163] = -1277205326;
        np.lvbp[164] = 82936383;
        np.lvbp[165] = -1493887116;
        np.lvbp[166] = 1309224476;
        np.lvbp[167] = 282652816;
        np.lvbp[168] = 623500769;
        np.lvbp[169] = 967736949;
        np.lvbp[170] = 2141514395;
        np.lvbp[171] = -1462265941;
        np.lvbp[172] = -1015872383;
        np.lvbp[173] = 2058607098;
        np.lvbp[174] = 1983887290;
        np.lvbp[175] = -1823535875;
        np.lvbp[176] = -1688994077;
        np.lvbp[177] = 1702499017;
        np.lvbp[178] = -466750953;
        np.lvbp[179] = -1162337218;
        np.lvbp[180] = 1379712887;
        np.lvbp[181] = -692394991;
        np.lvbp[182] = -753895824;
        np.lvbp[183] = -1268167944;
        np.lvbp[184] = 93573101;
        np.lvbp[185] = -1901875298;
        np.lvbp[186] = 1587992405;
        np.lvbp[187] = 1169438011;
        np.lvbp[188] = 941345162;
        np.lvbp[189] = -1563679472;
        np.lvbp[190] = 1312219356;
        np.lvbp[191] = -1833282134;
        np.lvbp[192] = 202839941;
        np.lvbp[193] = -1643215428;
        np.lvbp[194] = -888493099;
        np.lvbp[195] = -645183233;
        np.lvbp[196] = -1838224088;
        np.lvbp[197] = -2063632811;
        np.lvbp[198] = -1606958356;
        np.lvbp[199] = 1292253435;
    }
}

