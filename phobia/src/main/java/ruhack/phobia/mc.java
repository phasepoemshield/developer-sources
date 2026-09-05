/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  org.joml.Matrix4f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;
import ruhack.phobia.hh;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.lh;
import ruhack.phobia.mb;
import ruhack.phobia.nd;
import ruhack.phobia.nx;

public final class mc
extends class_437 {
    private static long[] kbno;
    private int pendingSwapSlot;
    private static long[] kbnn;
    private static final float SECTOR_DEGREES = 106.0f;
    private final class_437 parent;
    private long openedAt;
    private boolean closing;
    protected static final long sa = -2469902430488661952L;
    private static final float BASE_THICKNESS = 31.0f;
    private static final int RING_SIZE = 3;
    private long closingAt;
    private final hh autoSwap;
    public static final boolean c;
    public static final int b;
    private static final float BASE_SIZE = 142.0f;
    private final nx movement;
    private int hoveredSlot;
    private static final long OPEN_DURATION_NS = 180000000L;
    private static int[] kbmz;
    public static final boolean a;
    private float visualScale;
    private static int[] kbmy;
    private static final long CLOSE_DURATION_NS = 130000000L;
    private static final float[] SECTOR_CENTER_ANGLES;

    private static /* synthetic */ float kbqh(int n2) {
        return Float.intBitsToFloat(kbmy[n2] ^ kbmz[n2]);
    }

    private static /* synthetic */ void kcny() {
        mc.kbmz[300] = 612300117;
        mc.kbmz[301] = 223530754;
        mc.kbmz[302] = 2133424704;
        mc.kbmz[303] = 1989270474;
        mc.kbmz[304] = 614980638;
        mc.kbmz[305] = -751719549;
        mc.kbmz[306] = -1371756425;
        mc.kbmz[307] = 725030078;
        mc.kbmz[308] = -2063667492;
        mc.kbmz[309] = -1661883835;
        mc.kbmz[310] = 362998981;
        mc.kbmz[311] = 1683749233;
        mc.kbmz[312] = -2041890579;
        mc.kbmz[313] = -807379276;
        mc.kbmz[314] = -911140112;
        mc.kbmz[315] = -358764152;
        mc.kbmz[316] = -2136425159;
        mc.kbmz[317] = -1897590487;
        mc.kbmz[318] = 381217413;
        mc.kbmz[319] = 315489718;
        mc.kbmz[320] = -116728445;
        mc.kbmz[321] = 625751478;
        mc.kbmz[322] = 990814293;
        mc.kbmz[323] = -678783463;
        mc.kbmz[324] = 1101882114;
        mc.kbmz[325] = 621611810;
        mc.kbmz[326] = -415540449;
        mc.kbmz[327] = 1837206243;
        mc.kbmz[328] = 1496644656;
        mc.kbmz[329] = 1880860210;
        mc.kbmz[330] = 1186658190;
        mc.kbmz[331] = 1409846077;
        mc.kbmz[332] = -151436319;
        mc.kbmz[333] = -726012630;
        mc.kbmz[334] = -1507868827;
        mc.kbmz[335] = -1113115033;
        mc.kbmz[336] = 1476371862;
        mc.kbmz[337] = 316557202;
        mc.kbmz[338] = 40196088;
        mc.kbmz[339] = -2087527645;
        mc.kbmz[340] = 1087353618;
        mc.kbmz[341] = -1527839171;
        mc.kbmz[342] = 1004512221;
        mc.kbmz[343] = -1642313389;
        mc.kbmz[344] = 1774108462;
        mc.kbmz[345] = 1551746951;
        mc.kbmz[346] = -1798730780;
        mc.kbmz[347] = 687249889;
        mc.kbmz[348] = -421932567;
        mc.kbmz[349] = 748575709;
        mc.kbmz[350] = 188932931;
        mc.kbmz[351] = 1195905246;
        mc.kbmz[352] = 527583683;
        mc.kbmz[353] = 2066280065;
        mc.kbmz[354] = -271852779;
        mc.kbmz[355] = 652508653;
        mc.kbmz[356] = 885177930;
        mc.kbmz[357] = 820999822;
        mc.kbmz[358] = 2000664837;
        mc.kbmz[359] = -299712798;
        mc.kbmz[360] = -1066993676;
        mc.kbmz[361] = -353717190;
        mc.kbmz[362] = -1992833722;
        mc.kbmz[363] = 1924483237;
        mc.kbmz[364] = 599462191;
        mc.kbmz[365] = 333659739;
        mc.kbmz[366] = 2094703558;
        mc.kbmz[367] = 1007147612;
        mc.kbmz[368] = 367203510;
        mc.kbmz[369] = 56583212;
        mc.kbmz[370] = 363564194;
        mc.kbmz[371] = -148717879;
        mc.kbmz[372] = 679324966;
        mc.kbmz[373] = 1004988240;
        mc.kbmz[374] = -751822885;
        mc.kbmz[375] = 926302191;
        mc.kbmz[376] = -535184944;
        mc.kbmz[377] = -2076585450;
        mc.kbmz[378] = 1887080522;
        mc.kbmz[379] = 452407547;
        mc.kbmz[380] = 380624080;
        mc.kbmz[381] = 1562897917;
        mc.kbmz[382] = 1595015633;
        mc.kbmz[383] = 1310700130;
        mc.kbmz[384] = 1490966110;
        mc.kbmz[385] = -2071290245;
        mc.kbmz[386] = -1433372973;
        mc.kbmz[387] = 1576375366;
        mc.kbmz[388] = -1134816983;
        mc.kbmz[389] = -1645687715;
        mc.kbmz[390] = -1538123715;
        mc.kbmz[391] = -1161634391;
        mc.kbmz[392] = 1010260951;
        mc.kbmz[393] = 1557254995;
        mc.kbmz[394] = -1329825858;
        mc.kbmz[395] = -176077334;
        mc.kbmz[396] = 684540469;
        mc.kbmz[397] = 1065174930;
        mc.kbmz[398] = 371461047;
        mc.kbmz[399] = -1177213704;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startClosing() {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kbyk", kbnm(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2047646898: {
                    v1 = mc.kbna("kbyl", kbnm(int ), (int)50);
                    continue block44;
                }
                case -1910430026: {
                    v1 = mc.kbna("kbym", kbnm(int ), (int)51);
                    continue block44;
                }
                case -1305277426: {
                    v1 = mc.kbna("kbyn", kbnm(int ), (int)52);
                    continue block44;
                }
                case 1490645056: {
                    break block44;
                }
            }
            break;
        }
        var3_1 = mc.c;
        v2 /* !! */  = mc.sa;
        if (true) ** GOTO lbl22
        block45: while (true) {
            v2 /* !! */  = (long)(mc.kbna("kbyp", kbnm(int ), (int)54) - mc.kbna("kbyo", kbnm(int ), (int)53));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1798988989: {
                    continue block45;
                }
                case 1490645056: {
                    break block45;
                }
            }
            break;
        }
        var2_2 /* !! */  = mc.b;
        v3 /* !! */  = mc.sa;
        if (true) ** GOTO lbl32
        block46: while (true) {
            v3 /* !! */  = (long)(v4 - mc.kbna("kbyq", kbnm(int ), (int)55));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 309092787: {
                    v4 = mc.kbna("kbyr", kbnm(int ), (int)56);
                    continue block46;
                }
                case 1288992065: {
                    v4 = mc.kbna("kbys", kbnm(int ), (int)57);
                    continue block46;
                }
                case 1490645056: {
                    break block46;
                }
            }
            break;
        }
        var1_3 = mc.a;
        if (var3_1) {
            throw null;
lbl44:
            // 6 sources

            return;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbyt", kbnm(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mc.kbna("kbyu", kbmx(int ), (int)242)) break;
                    v5 /* !! */  = (long)mc.kbna("kbyv", kbmx(int ), (int)243);
                }
                if (!this.closing) ** GOTO lbl60
                if (var1_3) ** GOTO lbl44
                return;
lbl60:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl44
                v6 = mc.kbna("kbyw", kbmx(int ), (int)244);
                v7 /* !! */  = mc.sa;
                if (true) ** GOTO lbl66
                block49: while (true) {
                    v7 /* !! */  = (long)(mc.kbna("kbyy", kbnm(int ), (int)60) - mc.kbna("kbyx", kbnm(int ), (int)59));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 241596370: {
                            continue block49;
                        }
                        case 1490645056: {
                            break block49;
                        }
                    }
                    break;
                }
                this.closing = v6;
                if (var1_3 || var1_3) ** GOTO lbl44
                v8 /* !! */  = mc.sa;
                if (true) ** GOTO lbl77
                block50: while (true) {
                    v8 /* !! */  = (long)(v9 - mc.kbna("kbyz", kbnm(int ), (int)61));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1088334418: {
                            v9 = mc.kbna("kbza", kbnm(int ), (int)62);
                            continue block50;
                        }
                        case -902381191: {
                            v9 = mc.kbna("kbzb", kbnm(int ), (int)63);
                            continue block50;
                        }
                        case -583415488: {
                            v9 = mc.kbna("kbzc", kbnm(int ), (int)64);
                            continue block50;
                        }
                        case 1490645056: {
                            break block50;
                        }
                    }
                    break;
                }
                v10 = System.nanoTime();
                v11 /* !! */  = mc.sa;
                if (true) ** GOTO lbl94
                block51: while (true) {
                    v11 /* !! */  = (long)(v12 - mc.kbna("kbzd", kbnm(int ), (int)65));
lbl94:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1765524047: {
                            v12 = mc.kbna("kbze", kbnm(int ), (int)66);
                            continue block51;
                        }
                        case -1444669474: {
                            v12 = mc.kbna("kbzf", kbnm(int ), (int)67);
                            continue block51;
                        }
                        case 1490645056: {
                            break block51;
                        }
                    }
                    break;
                }
                this.closingAt = v10;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)mc.kbna("kbzg", kbmx(int ), (int)245);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mc.kbna("kbzh", kbmx(int ), (int)246);
                } while (!var3_1);
                throw null;
            }
lbl117:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mc.kbna("kbzi", kbmx(int ), (int)247);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl122:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mc.kbna("kbzj", kbmx(int ), (int)248);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)mc.kbna("kbzk", kbmx(int ), (int)249);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl131:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)mc.kbna("kbzl", kbmx(int ), (int)250);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)mc.kbna("kbzm", kbmx(int ), (int)251);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)mc.kbna("kbzn", kbmx(int ), (int)252);
                if (!var3_1) break;
                throw null;
            }
lbl143:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mc.kbna("kbzo", kbmx(int ), (int)253);
                    if (!var3_1) ** GOTO lbl117
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)mc.kbna("kbzp", kbmx(int ), (int)254);
                if (!var3_1) break;
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)mc.kbna("kbzq", kbmx(int ), (int)255);
                if (!var3_1) break;
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)mc.kbna("kbzr", kbmx(int ), (int)256);
        ** while (!var3_1)
lbl159:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mc(hh var1_1, class_437 var2_2) {
        var4_3 /* !! */  = mc.b;
        super((class_2561)class_2561.method_43470((String)"AutoSwap"));
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.movement = new nx();
                this.hoveredSlot = (int)mc.kbna("kbnb", kbmx(int ), (int)0);
                this.pendingSwapSlot = (int)mc.kbna("kbnc", kbmx(int ), (int)1);
                this.visualScale = 1.0f;
                this.autoSwap = var1_1;
                this.parent = var2_2;
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)mc.kbna("kbnd", kbmx(int ), (int)2);
                ** GOTO lbl33
            }
            case 1: {
                var4_3 /* !! */  = (int)mc.kbna("kbne", kbmx(int ), (int)3);
                ** GOTO lbl33
            }
            case 2: {
                var4_3 /* !! */  = (int)mc.kbna("kbnf", kbmx(int ), (int)4);
                ** GOTO lbl36
            }
            case 3: {
                while (true) {
                    var4_3 /* !! */  = (int)mc.kbna("kbng", kbmx(int ), (int)5);
                }
            }
lbl26:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)mc.kbna("kbnh", kbmx(int ), (int)6);
                ** GOTO lbl13
            }
lbl29:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mc.kbna("kbni", kbmx(int ), (int)7);
                    ** GOTO lbl26
                    break;
                }
            }
lbl33:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)mc.kbna("kbnj", kbmx(int ), (int)8);
                ** GOTO lbl29
            }
lbl36:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)mc.kbna("kbnk", kbmx(int ), (int)9);
                ** GOTO lbl26
            }
            case 8: 
        }
        var4_3 /* !! */  = (int)mc.kbna("kbnl", kbmx(int ), (int)10);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void centeredText(class_332 var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kcft", kbnm(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1241138380: {
                    v1 = mc.kbna("kcfu", kbnm(int ), (int)95);
                    continue block25;
                }
                case -896112150: {
                    v1 = mc.kbna("kcfv", kbnm(int ), (int)96);
                    continue block25;
                }
                case 1490645056: {
                    break block25;
                }
            }
            break;
        }
        var9_7 = mc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kcfw", kbnm(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mc.kbna("kcfx", kbmx(int ), (int)388)) break;
            v2 /* !! */  = (long)mc.kbna("kcfy", kbmx(int ), (int)389);
        }
        var8_8 /* !! */  = mc.b;
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mc.sa;
                if (true) ** GOTO lbl29
                block27: while (true) {
                    v3 /* !! */  = (long)(v4 - mc.kbna("kcfz", kbnm(int ), (int)98));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1163533508: {
                            v4 = mc.kbna("kcga", kbnm(int ), (int)99);
                            continue block27;
                        }
                        case -922183903: {
                            v4 = mc.kbna("kcgb", kbnm(int ), (int)100);
                            continue block27;
                        }
                        case -55945398: {
                            v4 = mc.kbna("kcgc", kbnm(int ), (int)101);
                            continue block27;
                        }
                        case 1490645056: {
                            break block27;
                        }
                    }
                    break;
                }
                var7_9 = mc.a;
                if (var9_7) {
                    throw null;
lbl44:
                    // 2 sources

                    return;
                }
                if (var7_9 || var7_9) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kcgd", kbnm(int ), (int)102)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mc.kbna("kcge", kbmx(int ), (int)390)) break;
                    v5 /* !! */  = (long)mc.kbna("kcgf", kbmx(int ), (int)391);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kcgg", kbnm(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == mc.kbna("kcgh", kbmx(int ), (int)392)) break;
                    v6 /* !! */  = (long)mc.kbna("kcgi", kbmx(int ), (int)393);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = mc.sa - mc.kbna("kcgj", kbnm(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == mc.kbna("kcgk", kbmx(int ), (int)394)) break;
                    v7 /* !! */  = (long)mc.kbna("kcgl", kbmx(int ), (int)395);
                }
                v8 = var3_3 - kq.width(kv.BOLD, var2_2, var5_5) / 2.0f;
                v9 = mc.kbna("kcgm", kbmx(int ), (int)396);
                v10 /* !! */  = mc.sa;
                if (true) ** GOTO lbl71
                block32: while (true) {
                    v10 /* !! */  = (long)(v11 - mc.kbna("kcgn", kbnm(int ), (int)105));
lbl71:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1400227505: {
                            v11 = mc.kbna("kcgo", kbnm(int ), (int)106);
                            continue block32;
                        }
                        case -697334978: {
                            v11 = mc.kbna("kcgp", kbnm(int ), (int)107);
                            continue block32;
                        }
                        case -562676075: {
                            v11 = mc.kbna("kcgq", kbnm(int ), (int)108);
                            continue block32;
                        }
                        case 1490645056: {
                            break block32;
                        }
                    }
                    break;
                }
                kq.text(var1_1, kv.BOLD, var2_2, v8, var4_4, var5_5, var6_6, (boolean)v9);
                if (var7_9 || var7_9) ** continue;
                return;
            }
lbl86:
            // 2 sources

            case 0: {
                var8_8 /* !! */  = (int)mc.kbna("kcgr", kbmx(int ), (int)397);
                if (!var9_7) break;
                throw null;
            }
            case 1: {
                var8_8 /* !! */  = (int)mc.kbna("kcgs", kbmx(int ), (int)398);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_8 /* !! */  = (int)mc.kbna("kcgt", kbmx(int ), (int)399);
                    if (!var9_7) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl100:
            // 2 sources

            case 3: {
                var8_8 /* !! */  = (int)mc.kbna("kcgu", kbmx(int ), (int)400);
                if (!var9_7) break;
                throw null;
            }
            case 4: {
                var8_8 /* !! */  = (int)mc.kbna("kcgv", kbmx(int ), (int)401);
                if (!var9_7) ** GOTO lbl86
                throw null;
            }
            case 5: 
        }
        var8_8 /* !! */  = (int)mc.kbna("kcgw", kbmx(int ), (int)402);
        ** while (!var9_7)
lbl111:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnt() {
        mc.kbmy[400] = 1251862234;
        mc.kbmy[401] = -440897940;
        mc.kbmy[402] = 1648517525;
        mc.kbmy[403] = 998446308;
        mc.kbmy[404] = -2123805680;
        mc.kbmy[405] = -1986056203;
        mc.kbmy[406] = 857933177;
        mc.kbmy[407] = -1877137434;
        mc.kbmy[408] = 154322729;
        mc.kbmy[409] = 579439243;
        mc.kbmy[410] = -699294254;
        mc.kbmy[411] = -267350641;
        mc.kbmy[412] = -1932177920;
        mc.kbmy[413] = -442769012;
        mc.kbmy[414] = 593092848;
        mc.kbmy[415] = -1996121182;
        mc.kbmy[416] = 1830794469;
        mc.kbmy[417] = -2035197803;
        mc.kbmy[418] = 1251243593;
        mc.kbmy[419] = -590698210;
        mc.kbmy[420] = -1845002246;
        mc.kbmy[421] = -730437957;
        mc.kbmy[422] = 495165067;
        mc.kbmy[423] = 1098857460;
        mc.kbmy[424] = -2019109087;
        mc.kbmy[425] = 1709647975;
        mc.kbmy[426] = 313101938;
        mc.kbmy[427] = 1251466407;
        mc.kbmy[428] = -1584360554;
        mc.kbmy[429] = -1752262112;
        mc.kbmy[430] = -408626007;
        mc.kbmy[431] = 422926837;
        mc.kbmy[432] = 1280349643;
        mc.kbmy[433] = 158625934;
        mc.kbmy[434] = 1438404608;
        mc.kbmy[435] = 179191808;
        mc.kbmy[436] = 1077795885;
        mc.kbmy[437] = 1303175318;
        mc.kbmy[438] = 443194294;
        mc.kbmy[439] = 80840931;
        mc.kbmy[440] = -1615655717;
        mc.kbmy[441] = -1676478343;
        mc.kbmy[442] = -982523382;
        mc.kbmy[443] = 1649789166;
        mc.kbmy[444] = 1255761575;
        mc.kbmy[445] = -1927516108;
        mc.kbmy[446] = -455596713;
        mc.kbmy[447] = -251811602;
        mc.kbmy[448] = 121250475;
        mc.kbmy[449] = 1008664858;
        mc.kbmy[450] = -2092661569;
        mc.kbmy[451] = -643571653;
        mc.kbmy[452] = 1040582123;
        mc.kbmy[453] = -1185565291;
        mc.kbmy[454] = -88212466;
        mc.kbmy[455] = -2097875838;
        mc.kbmy[456] = 406982198;
        mc.kbmy[457] = 907047498;
        mc.kbmy[458] = -810343446;
        mc.kbmy[459] = -1237734858;
        mc.kbmy[460] = 2146193496;
        mc.kbmy[461] = 1358084931;
        mc.kbmy[462] = -2126589558;
        mc.kbmy[463] = -276719699;
        mc.kbmy[464] = -352081739;
        mc.kbmy[465] = -308500382;
        mc.kbmy[466] = -1548610226;
        mc.kbmy[467] = 630835368;
        mc.kbmy[468] = -1856741578;
        mc.kbmy[469] = 875721924;
        mc.kbmy[470] = 1372844509;
        mc.kbmy[471] = -1219622757;
        mc.kbmy[472] = 1836186562;
        mc.kbmy[473] = -666191604;
        mc.kbmy[474] = -991387074;
        mc.kbmy[475] = 275174334;
        mc.kbmy[476] = -1365073921;
        mc.kbmy[477] = 174640259;
        mc.kbmy[478] = -459705527;
        mc.kbmy[479] = -47295851;
        mc.kbmy[480] = -1309716545;
        mc.kbmy[481] = 566500513;
        mc.kbmy[482] = -222273599;
        mc.kbmy[483] = -1340980589;
        mc.kbmy[484] = -1530103048;
        mc.kbmy[485] = 695173170;
        mc.kbmy[486] = -760680009;
        mc.kbmy[487] = 183687348;
        mc.kbmy[488] = 637230976;
        mc.kbmy[489] = -1135801164;
        mc.kbmy[490] = 1542231912;
        mc.kbmy[491] = 197602964;
        mc.kbmy[492] = 837560355;
        mc.kbmy[493] = -1543994190;
        mc.kbmy[494] = 1665454991;
        mc.kbmy[495] = 2145297172;
        mc.kbmy[496] = 1784442077;
        mc.kbmy[497] = 2027744250;
        mc.kbmy[498] = 1914579968;
        mc.kbmy[499] = -1437016218;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        block183: {
            block182: {
                var19_5 = mc.c;
                var18_6 /* !! */  = mc.b;
                var17_7 = mc.a;
                if (var19_5) {
                    throw null;
lbl6:
                    // 47 sources

                    return;
                }
                if (var17_7 || var17_7) ** GOTO lbl6
                this.movement.restoreFromCurrent();
                if (var17_7 || var17_7) ** GOTO lbl6
                this.autoSwap.validateRingItems();
                if (var17_7 || var17_7) ** GOTO lbl6
                var5_8 = System.nanoTime();
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!this.closing) break block182;
                if (var17_7 || var17_7) ** GOTO lbl6
                var7_9 = this.clamp01((float)(var5_8 - this.closingAt) / mc.kbna("kbqi", kbqh(int ), (int)47));
                if (var17_7 || var17_7) ** GOTO lbl6
                var8_10 = 1.0f - this.easeInCubic(var7_9);
                if (var17_7 || var17_7) ** GOTO lbl6
                this.visualScale = 1.0f - this.easeInCubic(var7_9) * mc.kbna("kbqj", kbqh(int ), (int)48);
                if (var17_7 || var17_7) ** GOTO lbl6
                if (!(var7_9 >= 1.0f)) break block183;
                if (var17_7 || var17_7) ** GOTO lbl6
                this.finishClosing();
                if (var17_7 || var17_7) ** GOTO lbl6
                return;
            }
            if (var17_7 || var17_7) ** GOTO lbl6
            var7_9 = this.clamp01((float)(var5_8 - this.openedAt) / mc.kbna("kbqk", kbqh(int ), (int)49));
            if (var17_7 || var17_7) ** GOTO lbl6
            var8_10 = this.easeOutCubic(var7_9);
            if (var17_7 || var17_7) ** GOTO lbl6
            this.visualScale = (float)(mc.kbna("kbql", kbqh(int ), (int)50) + this.easeOutBack(var7_9) * mc.kbna("kbqm", kbqh(int ), (int)51));
            if (var17_7) ** GOTO lbl6
        }
        if (var17_7 || var17_7) ** GOTO lbl6
        var9_11 = (float)ki.getFixedScaledWidth() / 2.0f;
        if (var17_7 || var17_7) ** GOTO lbl6
        var10_12 = (float)ki.getFixedScaledHeight() / 2.0f;
        if (var17_7 || var17_7) ** GOTO lbl6
        if (var18_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var11_13 = mc.kbna("kbqn", kbqh(int ), (int)52) * this.visualScale;
                if (var17_7 || var17_7) ** GOTO lbl6
                var12_14 = mc.kbna("kbqo", kbqh(int ), (int)53) * this.visualScale;
                if (var17_7 || var17_7) ** GOTO lbl6
                if (this.closing) {
                    v0 /* !! */  = mc.kbna("kbqp", kbmx(int ), (int)54);
                    if (var19_5) {
                        throw null;
                    }
                } else {
                    v0 /* !! */  = (CallSite)this.findSector(ki.convertX(var2_2), ki.convertY(var3_3), var9_11, var10_12, (float)var11_13, (float)var12_14);
                }
                this.hoveredSlot = (int)v0 /* !! */ ;
                if (var17_7 || var17_7) ** GOTO lbl6
                var13_15 = nd.getClientColor();
                if (var17_7 || var17_7) ** GOTO lbl6
                var14_16 = new int[3];
                if (var17_7 || var17_7) ** GOTO lbl6
                var15_17 = mc.kbna("kbqq", kbmx(int ), (int)55);
                if (var17_7) ** GOTO lbl6
                do {
                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (var15_17 >= mc.kbna("kbqr", kbmx(int ), (int)56)) ** GOTO lbl98
                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (this.autoSwap.hasRingItem((int)var15_17)) ** GOTO lbl74
                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(nd.rgba((int)mc.kbna("kbqs", kbmx(int ), (int)57), (int)mc.kbna("kbqt", kbmx(int ), (int)58), (int)mc.kbna("kbqu", kbmx(int ), (int)59), (int)mc.kbna("kbqv", kbmx(int ), (int)60)), var8_10 * mc.kbna("kbqw", kbqh(int ), (int)61));
                    if (var17_7) ** GOTO lbl6
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl93
lbl74:
                    // 1 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (var15_17 != this.hoveredSlot) ** GOTO lbl82
                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(var13_15, var8_10 * mc.kbna("kbqx", kbqh(int ), (int)62));
                    if (var17_7) ** GOTO lbl6
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl93
lbl82:
                    // 1 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (!this.autoSwap.isRingItemEquipped((int)var15_17)) ** GOTO lbl90
                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(var13_15, var8_10 * mc.kbna("kbqy", kbqh(int ), (int)63));
                    if (var17_7) ** GOTO lbl6
                    if (var19_5) {
                        throw null;
                    }
                    ** GOTO lbl93
lbl90:
                    // 1 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    var14_16[var15_17] = nd.multAlpha(nd.rgba((int)mc.kbna("kbqz", kbmx(int ), (int)64), (int)mc.kbna("kbra", kbmx(int ), (int)65), (int)mc.kbna("kbrb", kbmx(int ), (int)66), (int)mc.kbna("kbrc", kbmx(int ), (int)67)), var8_10);
                    if (var17_7) ** GOTO lbl6
lbl93:
                    // 4 sources

                    if (var17_7 || var17_7) ** GOTO lbl6
                    ++var15_17;
                    if (var17_7) ** GOTO lbl6
                } while (!var19_5);
                throw null;
lbl98:
                // 1 sources

                if (var17_7 || var17_7) ** GOTO lbl6
                var15_18 = ki.createProjection();
                if (var17_7 || var17_7) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$render$0(org.joml.Matrix4f float float float float int[] ), ()V)((Matrix4f)var15_18, (float)var9_11, (float)var11_13, (float)var10_12, (float)var12_14, (int[])var14_16));
                if (var17_7 || var17_7) ** GOTO lbl6
                this.drawCenterText(var1_1, var9_11, var10_12, var8_10);
                if (var17_7 || var17_7) ** GOTO lbl6
                var16_19 = mc.kbna("kbrd", kbmx(int ), (int)68);
                if (var17_7) ** GOTO lbl6
                do {
                    if (var17_7 || var17_7) ** GOTO lbl6
                    if (var16_19 >= mc.kbna("kbre", kbmx(int ), (int)69)) ** GOTO lbl117
                    if (var17_7 || var17_7) ** GOTO lbl6
                    this.drawSlot(var1_1, (int)var16_19, var9_11, var10_12, (float)var11_13, (float)var12_14, var8_10);
                    if (var17_7 || var17_7) ** GOTO lbl6
                    ++var16_19;
                    if (var17_7) ** GOTO lbl6
                } while (!var19_5);
                throw null;
lbl117:
                // 1 sources

                if (!var17_7 && !var17_7) ** break;
                ** continue;
                return;
            }
lbl120:
            // 2 sources

            case 0: {
                var18_6 /* !! */  = (int)mc.kbna("kbrf", kbmx(int ), (int)70);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl125:
            // 4 sources

            case 1: {
                var18_6 /* !! */  = (int)mc.kbna("kbrg", kbmx(int ), (int)71);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
            case 2: {
                var18_6 /* !! */  = (int)mc.kbna("kbrh", kbmx(int ), (int)72);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl500
            }
lbl135:
            // 3 sources

            case 3: {
                var18_6 /* !! */  = (int)mc.kbna("kbri", kbmx(int ), (int)73);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl438
            }
lbl140:
            // 3 sources

            case 4: {
                var18_6 /* !! */  = (int)mc.kbna("kbrj", kbmx(int ), (int)74);
                if (!var19_5) ** GOTO lbl125
                throw null;
            }
            case 5: {
                var18_6 /* !! */  = (int)mc.kbna("kbrk", kbmx(int ), (int)75);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl149:
            // 2 sources

            case 6: {
                var18_6 /* !! */  = (int)mc.kbna("kbrl", kbmx(int ), (int)76);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl403
            }
lbl154:
            // 2 sources

            case 7: {
                var18_6 /* !! */  = (int)mc.kbna("kbrm", kbmx(int ), (int)77);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl159:
            // 2 sources

            case 8: {
                var18_6 /* !! */  = (int)mc.kbna("kbrn", kbmx(int ), (int)78);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl164:
            // 2 sources

            case 9: {
                var18_6 /* !! */  = (int)mc.kbna("kbro", kbmx(int ), (int)79);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 10: {
                var18_6 /* !! */  = (int)mc.kbna("kbrp", kbmx(int ), (int)80);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl174:
            // 2 sources

            case 11: {
                var18_6 /* !! */  = (int)mc.kbna("kbrq", kbmx(int ), (int)81);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl387
            }
            case 12: {
                var18_6 /* !! */  = (int)mc.kbna("kbrr", kbmx(int ), (int)82);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl184:
            // 2 sources

            case 13: {
                var18_6 /* !! */  = (int)mc.kbna("kbrs", kbmx(int ), (int)83);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 14: {
                var18_6 /* !! */  = (int)mc.kbna("kbrt", kbmx(int ), (int)84);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl194:
            // 2 sources

            case 15: {
                var18_6 /* !! */  = (int)mc.kbna("kbru", kbmx(int ), (int)85);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl199:
            // 2 sources

            case 16: {
                var18_6 /* !! */  = (int)mc.kbna("kbrv", kbmx(int ), (int)86);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl204:
            // 2 sources

            case 17: {
                var18_6 /* !! */  = (int)mc.kbna("kbrw", kbmx(int ), (int)87);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 18: {
                var18_6 /* !! */  = (int)mc.kbna("kbrx", kbmx(int ), (int)88);
                if (!var19_5) ** GOTO lbl159
                throw null;
            }
lbl213:
            // 3 sources

            case 19: {
                var18_6 /* !! */  = (int)mc.kbna("kbry", kbmx(int ), (int)89);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 20: {
                var18_6 /* !! */  = (int)mc.kbna("kbrz", kbmx(int ), (int)90);
                if (!var19_5) ** GOTO lbl213
                throw null;
            }
lbl222:
            // 2 sources

            case 21: {
                var18_6 /* !! */  = (int)mc.kbna("kbsa", kbmx(int ), (int)91);
                if (!var19_5) ** GOTO lbl140
                throw null;
            }
            case 22: {
                var18_6 /* !! */  = (int)mc.kbna("kbsb", kbmx(int ), (int)92);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 23: {
                var18_6 /* !! */  = (int)mc.kbna("kbsc", kbmx(int ), (int)93);
                if (!var19_5) ** GOTO lbl135
                throw null;
            }
lbl235:
            // 2 sources

            case 24: {
                var18_6 /* !! */  = (int)mc.kbna("kbsd", kbmx(int ), (int)94);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl240:
            // 3 sources

            case 25: {
                var18_6 /* !! */  = (int)mc.kbna("kbse", kbmx(int ), (int)95);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl245:
            // 3 sources

            case 26: {
                var18_6 /* !! */  = (int)mc.kbna("kbsf", kbmx(int ), (int)96);
                if (!var19_5) ** GOTO lbl235
                throw null;
            }
lbl249:
            // 3 sources

            case 27: {
                var18_6 /* !! */  = (int)mc.kbna("kbsg", kbmx(int ), (int)97);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl513
            }
            case 28: {
                var18_6 /* !! */  = (int)mc.kbna("kbsh", kbmx(int ), (int)98);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl259:
            // 2 sources

            case 29: {
                var18_6 /* !! */  = (int)mc.kbna("kbsi", kbmx(int ), (int)99);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl500
            }
            case 30: {
                var18_6 /* !! */  = (int)mc.kbna("kbsj", kbmx(int ), (int)100);
                if (!var19_5) break;
                throw null;
            }
            case 31: {
                var18_6 /* !! */  = (int)mc.kbna("kbsk", kbmx(int ), (int)101);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 32: {
                var18_6 /* !! */  = (int)mc.kbna("kbsl", kbmx(int ), (int)102);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 33: {
                var18_6 /* !! */  = (int)mc.kbna("kbsm", kbmx(int ), (int)103);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl500
            }
            case 34: {
                var18_6 /* !! */  = (int)mc.kbna("kbsn", kbmx(int ), (int)104);
                if (var19_5) {
                    throw null;
                }
            }
            case 35: {
                var18_6 /* !! */  = (int)mc.kbna("kbso", kbmx(int ), (int)105);
                if (!var19_5) ** GOTO lbl245
                throw null;
            }
lbl291:
            // 2 sources

            case 36: {
                var18_6 /* !! */  = (int)mc.kbna("kbsp", kbmx(int ), (int)106);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl296:
            // 3 sources

            case 37: {
                var18_6 /* !! */  = (int)mc.kbna("kbsq", kbmx(int ), (int)107);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl301:
            // 3 sources

            case 38: {
                var18_6 /* !! */  = (int)mc.kbna("kbsr", kbmx(int ), (int)108);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl306:
            // 4 sources

            case 39: {
                var18_6 /* !! */  = (int)mc.kbna("kbss", kbmx(int ), (int)109);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 40: {
                var18_6 /* !! */  = (int)mc.kbna("kbst", kbmx(int ), (int)110);
                if (!var19_5) ** GOTO lbl306
                throw null;
            }
lbl315:
            // 2 sources

            case 41: {
                var18_6 /* !! */  = (int)mc.kbna("kbsu", kbmx(int ), (int)111);
                if (!var19_5) ** GOTO lbl149
                throw null;
            }
            case 42: {
                var18_6 /* !! */  = (int)mc.kbna("kbsv", kbmx(int ), (int)112);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl383
            }
            case 43: {
                var18_6 /* !! */  = (int)mc.kbna("kbsw", kbmx(int ), (int)113);
                if (!var19_5) ** GOTO lbl184
                throw null;
            }
lbl328:
            // 3 sources

            case 44: {
                var18_6 /* !! */  = (int)mc.kbna("kbsx", kbmx(int ), (int)114);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl333:
            // 3 sources

            case 45: {
                var18_6 /* !! */  = (int)mc.kbna("kbsy", kbmx(int ), (int)115);
                if (!var19_5) ** GOTO lbl213
                throw null;
            }
            case 46: {
                var18_6 /* !! */  = (int)mc.kbna("kbsz", kbmx(int ), (int)116);
                if (!var19_5) ** GOTO lbl199
                throw null;
            }
            case 47: {
                var18_6 /* !! */  = (int)mc.kbna("kbta", kbmx(int ), (int)117);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 48: {
                var18_6 /* !! */  = (int)mc.kbna("kbtb", kbmx(int ), (int)118);
                if (!var19_5) ** GOTO lbl194
                throw null;
            }
            case 49: {
                var18_6 /* !! */  = (int)mc.kbna("kbtc", kbmx(int ), (int)119);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl355:
            // 2 sources

            case 50: {
                var18_6 /* !! */  = (int)mc.kbna("kbtd", kbmx(int ), (int)120);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 51: {
                var18_6 /* !! */  = (int)mc.kbna("kbte", kbmx(int ), (int)121);
                if (!var19_5) ** GOTO lbl154
                throw null;
            }
lbl364:
            // 4 sources

            case 52: {
                do {
                    var18_6 /* !! */  = (int)mc.kbna("kbtf", kbmx(int ), (int)122);
                } while (!var19_5);
                throw null;
            }
lbl369:
            // 3 sources

            case 53: {
                var18_6 /* !! */  = (int)mc.kbna("kbtg", kbmx(int ), (int)123);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl460
            }
lbl374:
            // 4 sources

            case 54: {
                var18_6 /* !! */  = (int)mc.kbna("kbth", kbmx(int ), (int)124);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl480
            }
            case 55: {
                var18_6 /* !! */  = (int)mc.kbna("kbti", kbmx(int ), (int)125);
                if (!var19_5) ** GOTO lbl120
                throw null;
            }
lbl383:
            // 3 sources

            case 56: {
                var18_6 /* !! */  = (int)mc.kbna("kbtj", kbmx(int ), (int)126);
                if (!var19_5) ** GOTO lbl174
                throw null;
            }
lbl387:
            // 3 sources

            case 57: {
                var18_6 /* !! */  = (int)mc.kbna("kbtk", kbmx(int ), (int)127);
                if (!var19_5) ** GOTO lbl364
                throw null;
            }
lbl391:
            // 2 sources

            case 58: {
                var18_6 /* !! */  = (int)mc.kbna("kbtl", kbmx(int ), (int)128);
                if (!var19_5) ** GOTO lbl301
                throw null;
            }
lbl395:
            // 2 sources

            case 59: {
                var18_6 /* !! */  = (int)mc.kbna("kbtm", kbmx(int ), (int)129);
                if (!var19_5) ** GOTO lbl333
                throw null;
            }
lbl399:
            // 3 sources

            case 60: {
                var18_6 /* !! */  = (int)mc.kbna("kbtn", kbmx(int ), (int)130);
                if (!var19_5) ** GOTO lbl259
                throw null;
            }
lbl403:
            // 2 sources

            case 61: {
                var18_6 /* !! */  = (int)mc.kbna("kbto", kbmx(int ), (int)131);
                if (!var19_5) ** GOTO lbl240
                throw null;
            }
            case 62: {
                var18_6 /* !! */  = (int)mc.kbna("kbtp", kbmx(int ), (int)132);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl513
            }
lbl412:
            // 2 sources

            case 63: {
                var18_6 /* !! */  = (int)mc.kbna("kbtq", kbmx(int ), (int)133);
                if (!var19_5) ** GOTO lbl135
                throw null;
            }
lbl416:
            // 4 sources

            case 64: {
                var18_6 /* !! */  = (int)mc.kbna("kbtr", kbmx(int ), (int)134);
                if (!var19_5) ** GOTO lbl391
                throw null;
            }
lbl420:
            // 4 sources

            case 65: {
                var18_6 /* !! */  = (int)mc.kbna("kbts", kbmx(int ), (int)135);
                if (!var19_5) ** GOTO lbl416
                throw null;
            }
            case 66: {
                var18_6 /* !! */  = (int)mc.kbna("kbtt", kbmx(int ), (int)136);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl429:
            // 2 sources

            case 67: {
                var18_6 /* !! */  = (int)mc.kbna("kbtu", kbmx(int ), (int)137);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl434:
            // 2 sources

            case 68: {
                var18_6 /* !! */  = (int)mc.kbna("kbtv", kbmx(int ), (int)138);
                if (!var19_5) ** GOTO lbl125
                throw null;
            }
lbl438:
            // 2 sources

            case 69: {
                var18_6 /* !! */  = (int)mc.kbna("kbtw", kbmx(int ), (int)139);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl508
            }
lbl443:
            // 2 sources

            case 70: {
                var18_6 /* !! */  = (int)mc.kbna("kbtx", kbmx(int ), (int)140);
                if (!var19_5) ** GOTO lbl296
                throw null;
            }
lbl447:
            // 3 sources

            case 71: {
                var18_6 /* !! */  = (int)mc.kbna("kbty", kbmx(int ), (int)141);
                if (var19_5) {
                    throw null;
                }
                ** GOTO lbl472
            }
            case 72: {
                var18_6 /* !! */  = (int)mc.kbna("kbtz", kbmx(int ), (int)142);
                if (var19_5) {
                    throw null;
                }
            }
lbl456:
            // 4 sources

            case 73: {
                var18_6 /* !! */  = (int)mc.kbna("kbua", kbmx(int ), (int)143);
                if (!var19_5) ** GOTO lbl140
                throw null;
            }
lbl460:
            // 3 sources

            case 74: {
                var18_6 /* !! */  = (int)mc.kbna("kbub", kbmx(int ), (int)144);
                if (!var19_5) ** GOTO lbl333
                throw null;
            }
            case 75: {
                var18_6 /* !! */  = (int)mc.kbna("kbuc", kbmx(int ), (int)145);
                if (!var19_5) ** GOTO lbl364
                throw null;
            }
            case 76: {
                var18_6 /* !! */  = (int)mc.kbna("kbud", kbmx(int ), (int)146);
                if (!var19_5) ** GOTO lbl383
                throw null;
            }
lbl472:
            // 2 sources

            case 77: {
                var18_6 /* !! */  = (int)mc.kbna("kbue", kbmx(int ), (int)147);
                if (!var19_5) ** GOTO lbl387
                throw null;
            }
lbl476:
            // 2 sources

            case 78: {
                var18_6 /* !! */  = (int)mc.kbna("kbuf", kbmx(int ), (int)148);
                if (!var19_5) ** GOTO lbl456
                throw null;
            }
lbl480:
            // 2 sources

            case 79: {
                var18_6 /* !! */  = (int)mc.kbna("kbug", kbmx(int ), (int)149);
                if (!var19_5) ** GOTO lbl125
                throw null;
            }
            case 80: {
                var18_6 /* !! */  = (int)mc.kbna("kbuh", kbmx(int ), (int)150);
                if (!var19_5) ** GOTO lbl301
                throw null;
            }
            case 81: {
                var18_6 /* !! */  = (int)mc.kbna("kbui", kbmx(int ), (int)151);
                if (!var19_5) ** GOTO lbl164
                throw null;
            }
            case 82: {
                var18_6 /* !! */  = (int)mc.kbna("kbuj", kbmx(int ), (int)152);
                if (!var19_5) ** GOTO lbl249
                throw null;
            }
            case 83: {
                var18_6 /* !! */  = (int)mc.kbna("kbuk", kbmx(int ), (int)153);
                if (!var19_5) ** GOTO lbl328
                throw null;
            }
lbl500:
            // 4 sources

            case 84: {
                var18_6 /* !! */  = (int)mc.kbna("kbul", kbmx(int ), (int)154);
                if (!var19_5) ** GOTO lbl291
                throw null;
            }
            case 85: {
                var18_6 /* !! */  = (int)mc.kbna("kbum", kbmx(int ), (int)155);
                if (!var19_5) ** GOTO lbl355
                throw null;
            }
lbl508:
            // 3 sources

            case 86: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_6 /* !! */  = (int)mc.kbna("kbun", kbmx(int ), (int)156);
                    if (!var19_5) ** GOTO lbl245
                    throw null;
                }
            }
lbl513:
            // 3 sources

            case 87: {
                var18_6 /* !! */  = (int)mc.kbna("kbuo", kbmx(int ), (int)157);
                if (!var19_5) ** GOTO lbl420
                throw null;
            }
            case 88: {
                var18_6 /* !! */  = (int)mc.kbna("kbup", kbmx(int ), (int)158);
                if (!var19_5) ** GOTO lbl476
                throw null;
            }
            case 89: 
        }
        var18_6 /* !! */  = (int)mc.kbna("kbuq", kbmx(int ), (int)159);
        ** while (!var19_5)
lbl524:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnp() {
        mc.kbmy[0] = 1938464205;
        mc.kbmy[1] = 494127517;
        mc.kbmy[2] = -585553417;
        mc.kbmy[3] = -1350827469;
        mc.kbmy[4] = -2048168894;
        mc.kbmy[5] = 463664959;
        mc.kbmy[6] = 1332860457;
        mc.kbmy[7] = -240624976;
        mc.kbmy[8] = 1939404414;
        mc.kbmy[9] = -747123795;
        mc.kbmy[10] = 9958;
        mc.kbmy[11] = 155789334;
        mc.kbmy[12] = -1375302858;
        mc.kbmy[13] = -2123192373;
        mc.kbmy[14] = 359074988;
        mc.kbmy[15] = -1088204764;
        mc.kbmy[16] = 1091236444;
        mc.kbmy[17] = -1154413927;
        mc.kbmy[18] = 687861154;
        mc.kbmy[19] = -1277752584;
        mc.kbmy[20] = -792182824;
        mc.kbmy[21] = -1942908613;
        mc.kbmy[22] = -865569194;
        mc.kbmy[23] = -1062635330;
        mc.kbmy[24] = 1061782666;
        mc.kbmy[25] = -2050019152;
        mc.kbmy[26] = -2049755904;
        mc.kbmy[27] = -224866849;
        mc.kbmy[28] = 1228557782;
        mc.kbmy[29] = -470791981;
        mc.kbmy[30] = -261310099;
        mc.kbmy[31] = 1159562704;
        mc.kbmy[32] = 475213349;
        mc.kbmy[33] = 1258937519;
        mc.kbmy[34] = -216632117;
        mc.kbmy[35] = -542138163;
        mc.kbmy[36] = 211894165;
        mc.kbmy[37] = 812714791;
        mc.kbmy[38] = -1175721615;
        mc.kbmy[39] = 1526212168;
        mc.kbmy[40] = 986135070;
        mc.kbmy[41] = 531794559;
        mc.kbmy[42] = 424158706;
        mc.kbmy[43] = -16367536;
        mc.kbmy[44] = 26976220;
        mc.kbmy[45] = -1822054263;
        mc.kbmy[46] = 979123405;
        mc.kbmy[47] = 16591725;
        mc.kbmy[48] = 906791158;
        mc.kbmy[49] = -1807254291;
        mc.kbmy[50] = 201362970;
        mc.kbmy[51] = 366255777;
        mc.kbmy[52] = -1542887437;
        mc.kbmy[53] = 339699609;
        mc.kbmy[54] = -1953030674;
        mc.kbmy[55] = -1512127398;
        mc.kbmy[56] = -1631910193;
        mc.kbmy[57] = 1847364045;
        mc.kbmy[58] = -193455770;
        mc.kbmy[59] = 232807216;
        mc.kbmy[60] = -858357896;
        mc.kbmy[61] = -129411964;
        mc.kbmy[62] = -2001150297;
        mc.kbmy[63] = -528046917;
        mc.kbmy[64] = 870829777;
        mc.kbmy[65] = -456920165;
        mc.kbmy[66] = 1553999585;
        mc.kbmy[67] = -184584951;
        mc.kbmy[68] = 238123650;
        mc.kbmy[69] = 1101849139;
        mc.kbmy[70] = -1173542293;
        mc.kbmy[71] = -1068048213;
        mc.kbmy[72] = -908935899;
        mc.kbmy[73] = 1018833464;
        mc.kbmy[74] = 1304261263;
        mc.kbmy[75] = -711910602;
        mc.kbmy[76] = 441820286;
        mc.kbmy[77] = -604602271;
        mc.kbmy[78] = 601847657;
        mc.kbmy[79] = -1906992684;
        mc.kbmy[80] = -1047989406;
        mc.kbmy[81] = 115933674;
        mc.kbmy[82] = -622854533;
        mc.kbmy[83] = 1039857589;
        mc.kbmy[84] = 1234493119;
        mc.kbmy[85] = 483606543;
        mc.kbmy[86] = 1556351235;
        mc.kbmy[87] = -1091091480;
        mc.kbmy[88] = -1315506563;
        mc.kbmy[89] = 2015695450;
        mc.kbmy[90] = 1371066264;
        mc.kbmy[91] = -49789844;
        mc.kbmy[92] = -436023372;
        mc.kbmy[93] = 559295968;
        mc.kbmy[94] = 1306754528;
        mc.kbmy[95] = 32335357;
        mc.kbmy[96] = -1144371903;
        mc.kbmy[97] = -1747858579;
        mc.kbmy[98] = 1726065669;
        mc.kbmy[99] = 1543711437;
    }

    private static /* synthetic */ void kcns() {
        mc.kbmy[300] = 612300113;
        mc.kbmy[301] = 223530771;
        mc.kbmy[302] = 2133424719;
        mc.kbmy[303] = 1989270471;
        mc.kbmy[304] = 614980629;
        mc.kbmy[305] = -751719551;
        mc.kbmy[306] = -1371756419;
        mc.kbmy[307] = 725030059;
        mc.kbmy[308] = -2063667509;
        mc.kbmy[309] = -1661883828;
        mc.kbmy[310] = 362998996;
        mc.kbmy[311] = 1683749245;
        mc.kbmy[312] = -2041890581;
        mc.kbmy[313] = -807379265;
        mc.kbmy[314] = -911140102;
        mc.kbmy[315] = -358764153;
        mc.kbmy[316] = -2136425155;
        mc.kbmy[317] = -1897590492;
        mc.kbmy[318] = 381217415;
        mc.kbmy[319] = 315489720;
        mc.kbmy[320] = -116728447;
        mc.kbmy[321] = 625751484;
        mc.kbmy[322] = 990814274;
        mc.kbmy[323] = -678783472;
        mc.kbmy[324] = 1101882137;
        mc.kbmy[325] = 418957741;
        mc.kbmy[326] = -1482135508;
        mc.kbmy[327] = 747735779;
        mc.kbmy[328] = 1496644815;
        mc.kbmy[329] = 1880860365;
        mc.kbmy[330] = 1186658161;
        mc.kbmy[331] = 1409846210;
        mc.kbmy[332] = -151436463;
        mc.kbmy[333] = -726012532;
        mc.kbmy[334] = -1507868709;
        mc.kbmy[335] = -1113114984;
        mc.kbmy[336] = 376415638;
        mc.kbmy[337] = 788369560;
        mc.kbmy[338] = 1139103736;
        mc.kbmy[339] = -1038951645;
        mc.kbmy[340] = 1087353618;
        mc.kbmy[341] = -1527839171;
        mc.kbmy[342] = 1004512246;
        mc.kbmy[343] = -1642313381;
        mc.kbmy[344] = 1774108424;
        mc.kbmy[345] = 1551746979;
        mc.kbmy[346] = -1798730774;
        mc.kbmy[347] = 687249863;
        mc.kbmy[348] = -421932605;
        mc.kbmy[349] = 748575697;
        mc.kbmy[350] = 188932951;
        mc.kbmy[351] = 1195905268;
        mc.kbmy[352] = 527583693;
        mc.kbmy[353] = 2066280064;
        mc.kbmy[354] = -271852798;
        mc.kbmy[355] = 652508661;
        mc.kbmy[356] = 885177926;
        mc.kbmy[357] = 820999845;
        mc.kbmy[358] = 2000664853;
        mc.kbmy[359] = -299712777;
        mc.kbmy[360] = -1066993683;
        mc.kbmy[361] = -353717225;
        mc.kbmy[362] = -1992833699;
        mc.kbmy[363] = 1924483263;
        mc.kbmy[364] = 599462153;
        mc.kbmy[365] = 333659716;
        mc.kbmy[366] = 2094703555;
        mc.kbmy[367] = 1007147590;
        mc.kbmy[368] = 367203493;
        mc.kbmy[369] = 56583218;
        mc.kbmy[370] = 363564166;
        mc.kbmy[371] = -148717842;
        mc.kbmy[372] = 679324962;
        mc.kbmy[373] = 1004988232;
        mc.kbmy[374] = -751822904;
        mc.kbmy[375] = 926302183;
        mc.kbmy[376] = -535184947;
        mc.kbmy[377] = -2076585423;
        mc.kbmy[378] = 1887080557;
        mc.kbmy[379] = 452407545;
        mc.kbmy[380] = 380624122;
        mc.kbmy[381] = 1562897888;
        mc.kbmy[382] = 1595015620;
        mc.kbmy[383] = 1310700135;
        mc.kbmy[384] = 1490966102;
        mc.kbmy[385] = -2071290270;
        mc.kbmy[386] = -1433372986;
        mc.kbmy[387] = 1576375390;
        mc.kbmy[388] = -1134816984;
        mc.kbmy[389] = 1306746386;
        mc.kbmy[390] = 1538123714;
        mc.kbmy[391] = -1614947586;
        mc.kbmy[392] = -1010260952;
        mc.kbmy[393] = 1154085766;
        mc.kbmy[394] = 1329825857;
        mc.kbmy[395] = -1017068332;
        mc.kbmy[396] = 684540468;
        mc.kbmy[397] = 1065174935;
        mc.kbmy[398] = 371461044;
        mc.kbmy[399] = -1177213703;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void method_25426() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbnp", kbnm(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mc.kbna("kbnq", kbmx(int ), (int)11)) break;
            v0 /* !! */  = (long)mc.kbna("kbnr", kbmx(int ), (int)12);
        }
        var3_1 = mc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kbns", kbnm(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mc.kbna("kbnt", kbmx(int ), (int)13)) break;
            v1 /* !! */  = (long)mc.kbna("kbnu", kbmx(int ), (int)14);
        }
        var2_2 /* !! */  = mc.b;
        v2 /* !! */  = mc.sa;
        if (true) ** GOTO lbl17
        block50: while (true) {
            v2 /* !! */  = (long)(v3 - mc.kbna("kbnv", kbnm(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2078165163: {
                    v3 = mc.kbna("kbnw", kbnm(int ), (int)3);
                    continue block50;
                }
                case -1396570354: {
                    v3 = mc.kbna("kbnx", kbnm(int ), (int)4);
                    continue block50;
                }
                case 1342243668: {
                    v3 = mc.kbna("kbny", kbnm(int ), (int)5);
                    continue block50;
                }
                case 1490645056: {
                    break block50;
                }
            }
            break;
        }
        var1_3 = mc.a;
        if (var3_1) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kbnz", kbnm(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mc.kbna("kboa", kbmx(int ), (int)15)) break;
            v4 /* !! */  = (long)mc.kbna("kbob", kbmx(int ), (int)16);
        }
        v5 = System.nanoTime();
        v6 /* !! */  = mc.sa;
        if (true) ** GOTO lbl45
        block53: while (true) {
            v6 /* !! */  = (long)(v7 - mc.kbna("kboc", kbnm(int ), (int)7));
lbl45:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2108291412: {
                    v7 = mc.kbna("kbod", kbnm(int ), (int)8);
                    continue block53;
                }
                case 3286556: {
                    v7 = mc.kbna("kboe", kbnm(int ), (int)9);
                    continue block53;
                }
                case 1490645056: {
                    break block53;
                }
            }
            break;
        }
        this.openedAt = v5;
        if (var1_3 || var1_3) ** GOTO lbl32
        v8 = mc.kbna("kbof", kbnm(int ), (int)10);
        v9 /* !! */  = mc.sa;
        if (true) ** GOTO lbl61
        block54: while (true) {
            v9 /* !! */  = (long)(mc.kbna("kboh", kbnm(int ), (int)12) - mc.kbna("kbog", kbnm(int ), (int)11));
lbl61:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1028852948: {
                    continue block54;
                }
                case 1490645056: {
                    break block54;
                }
            }
            break;
        }
        this.closingAt = (long)v8;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl32
                v10 = mc.kbna("kboi", kbmx(int ), (int)17);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = mc.sa - mc.kbna("kboj", kbnm(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == mc.kbna("kbok", kbmx(int ), (int)18)) break;
                    v11 /* !! */  = (long)mc.kbna("kbol", kbmx(int ), (int)19);
                }
                this.closing = v10;
                if (var1_3 || var1_3) ** GOTO lbl32
                v12 = mc.kbna("kbom", kbmx(int ), (int)20);
                v13 /* !! */  = mc.sa;
                if (true) ** GOTO lbl84
                block56: while (true) {
                    v13 /* !! */  = (long)(v14 - mc.kbna("kbon", kbnm(int ), (int)14));
lbl84:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1827978570: {
                            v14 = mc.kbna("kboo", kbnm(int ), (int)15);
                            continue block56;
                        }
                        case -1466066412: {
                            v14 = mc.kbna("kbop", kbnm(int ), (int)16);
                            continue block56;
                        }
                        case -1350278382: {
                            v14 = mc.kbna("kboq", kbnm(int ), (int)17);
                            continue block56;
                        }
                        case 1490645056: {
                            break block56;
                        }
                    }
                    break;
                }
                this.pendingSwapSlot = (int)v12;
                if (var1_3 || var1_3) ** GOTO lbl32
                v15 /* !! */  = mc.sa;
                if (true) ** GOTO lbl102
                block57: while (true) {
                    v15 /* !! */  = (long)(v16 - mc.kbna("kbor", kbnm(int ), (int)18));
lbl102:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -980052796: {
                            v16 = mc.kbna("kbos", kbnm(int ), (int)19);
                            continue block57;
                        }
                        case 1490645056: {
                            break block57;
                        }
                        case 1520574289: {
                            v16 = mc.kbna("kbot", kbnm(int ), (int)20);
                            continue block57;
                        }
                    }
                    break;
                }
                v17 /* !! */  = mc.sa;
                if (true) ** GOTO lbl115
                block58: while (true) {
                    v17 /* !! */  = (long)(v18 - mc.kbna("kbou", kbnm(int ), (int)21));
lbl115:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -659658600: {
                            v18 = mc.kbna("kbov", kbnm(int ), (int)22);
                            continue block58;
                        }
                        case -323171063: {
                            v18 = mc.kbna("kbow", kbnm(int ), (int)23);
                            continue block58;
                        }
                        case 899175849: {
                            v18 = mc.kbna("kbox", kbnm(int ), (int)24);
                            continue block58;
                        }
                        case 1490645056: {
                            break block58;
                        }
                    }
                    break;
                }
                this.movement.restoreFromCurrent();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl130:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mc.kbna("kboy", kbmx(int ), (int)21);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mc.kbna("kboz", kbmx(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mc.kbna("kbpa", kbmx(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 3: {
                var2_2 /* !! */  = (int)mc.kbna("kbpb", kbmx(int ), (int)24);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl149:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)mc.kbna("kbpc", kbmx(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl154:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)mc.kbna("kbpd", kbmx(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl159:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)mc.kbna("kbpe", kbmx(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl164:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)mc.kbna("kbpf", kbmx(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 8: {
                var2_2 /* !! */  = (int)mc.kbna("kbpg", kbmx(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl174:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)mc.kbna("kbph", kbmx(int ), (int)30);
                if (!var3_1) ** GOTO lbl154
                throw null;
            }
lbl178:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)mc.kbna("kbpi", kbmx(int ), (int)31);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl182:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)mc.kbna("kbpj", kbmx(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
            }
            case 12: {
                var2_2 /* !! */  = (int)mc.kbna("kbpk", kbmx(int ), (int)33);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)mc.kbna("kbpl", kbmx(int ), (int)34);
        ** while (!var3_1)
lbl193:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findSector(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block72: {
            block71: {
                var16_7 = mc.c;
                var15_8 /* !! */  = mc.b;
                var14_9 = mc.a;
                if (var16_7) {
                    throw null;
lbl6:
                    // 19 sources

                    return (int)mc.kbna("kcgx", kbmx(int ), (int)403);
                }
                if (var14_9 || var14_9) ** GOTO lbl6
                var7_10 = var1_1 - var3_3;
                if (var14_9 || var14_9) ** GOTO lbl6
                var8_11 = var2_2 - var4_4;
                if (var14_9 || var14_9) ** GOTO lbl6
                var9_12 = (float)Math.sqrt(var7_10 * var7_10 + var8_11 * var8_11);
                if (var14_9 || var14_9) ** GOTO lbl6
                var10_13 = var5_5 / 2.0f + mc.kbna("kcgy", kbqh(int ), (int)404);
                if (var14_9 || var14_9) ** GOTO lbl6
                var11_14 = var5_5 / 2.0f - var6_6 - mc.kbna("kcgz", kbqh(int ), (int)405);
                if (var14_9 || var14_9) ** GOTO lbl6
                if (var9_12 < var11_14) break block71;
                if (var14_9) ** GOTO lbl6
                if (!(var9_12 > var10_13)) break block72;
                if (var14_9) ** GOTO lbl6
            }
            if (var14_9 || var14_9) ** GOTO lbl6
            return (int)mc.kbna("kcha", kbmx(int ), (int)406);
        }
        if (var14_9) ** GOTO lbl6
        if (var15_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var14_9) ** GOTO lbl6
                var12_15 = (float)Math.toDegrees(Math.atan2(var8_11, var7_10));
                if (var14_9 || var14_9) ** GOTO lbl6
                var13_16 = mc.kbna("kchb", kbmx(int ), (int)407);
                if (var14_9) ** GOTO lbl6
                do {
                    if (var14_9 || var14_9) ** GOTO lbl6
                    if (var13_16 >= mc.SECTOR_CENTER_ANGLES.length) ** GOTO lbl48
                    if (var14_9 || var14_9) ** GOTO lbl6
                    if (!(Math.abs(this.wrappedDegrees(var12_15 - mc.SECTOR_CENTER_ANGLES[var13_16])) <= mc.kbna("kchc", kbqh(int ), (int)408))) ** GOTO lbl43
                    if (var14_9 || var14_9) ** GOTO lbl6
                    return (int)var13_16;
lbl43:
                    // 1 sources

                    if (var14_9 || var14_9) ** GOTO lbl6
                    ++var13_16;
                    if (var14_9) ** GOTO lbl6
                } while (!var16_7);
                throw null;
lbl48:
                // 1 sources

                if (!var14_9 && !var14_9) ** break;
                ** continue;
                return (int)mc.kbna("kchd", kbmx(int ), (int)409);
            }
lbl51:
            // 4 sources

            case 0: {
                var15_8 /* !! */  = (int)mc.kbna("kche", kbmx(int ), (int)410);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl56:
            // 2 sources

            case 1: {
                var15_8 /* !! */  = (int)mc.kbna("kchf", kbmx(int ), (int)411);
                if (!var16_7) break;
                throw null;
            }
            case 2: {
                var15_8 /* !! */  = (int)mc.kbna("kchg", kbmx(int ), (int)412);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl65:
            // 2 sources

            case 3: {
                var15_8 /* !! */  = (int)mc.kbna("kchh", kbmx(int ), (int)413);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl70:
            // 3 sources

            case 4: {
                var15_8 /* !! */  = (int)mc.kbna("kchi", kbmx(int ), (int)414);
                if (var16_7) {
                    throw null;
                }
            }
lbl74:
            // 5 sources

            case 5: {
                do {
                    var15_8 /* !! */  = (int)mc.kbna("kchj", kbmx(int ), (int)415);
                } while (!var16_7);
                throw null;
            }
            case 6: {
                var15_8 /* !! */  = (int)mc.kbna("kchk", kbmx(int ), (int)416);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 7: {
                var15_8 /* !! */  = (int)mc.kbna("kchl", kbmx(int ), (int)417);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 8: {
                var15_8 /* !! */  = (int)mc.kbna("kchm", kbmx(int ), (int)418);
                if (!var16_7) ** GOTO lbl70
                throw null;
            }
lbl93:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_8 /* !! */  = (int)mc.kbna("kchn", kbmx(int ), (int)419);
                    if (!var16_7) ** GOTO lbl51
                    throw null;
                }
            }
lbl98:
            // 2 sources

            case 10: {
                var15_8 /* !! */  = (int)mc.kbna("kcho", kbmx(int ), (int)420);
                if (!var16_7) ** GOTO lbl65
                throw null;
            }
            case 11: {
                var15_8 /* !! */  = (int)mc.kbna("kchp", kbmx(int ), (int)421);
                if (!var16_7) ** GOTO lbl51
                throw null;
            }
lbl106:
            // 2 sources

            case 12: {
                do {
                    var15_8 /* !! */  = (int)mc.kbna("kchq", kbmx(int ), (int)422);
                } while (!var16_7);
                throw null;
            }
            case 13: {
                var15_8 /* !! */  = (int)mc.kbna("kchr", kbmx(int ), (int)423);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl116:
            // 3 sources

            case 14: {
                var15_8 /* !! */  = (int)mc.kbna("kchs", kbmx(int ), (int)424);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl121:
            // 3 sources

            case 15: {
                do {
                    var15_8 /* !! */  = (int)mc.kbna("kcht", kbmx(int ), (int)425);
                } while (!var16_7);
                throw null;
            }
            case 16: {
                var15_8 /* !! */  = (int)mc.kbna("kchu", kbmx(int ), (int)426);
                if (!var16_7) ** GOTO lbl74
                throw null;
            }
            case 17: {
                var15_8 /* !! */  = (int)mc.kbna("kchv", kbmx(int ), (int)427);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 18: {
                var15_8 /* !! */  = (int)mc.kbna("kchw", kbmx(int ), (int)428);
                if (!var16_7) break;
                throw null;
            }
            case 19: {
                var15_8 /* !! */  = (int)mc.kbna("kchx", kbmx(int ), (int)429);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl144:
            // 2 sources

            case 20: {
                var15_8 /* !! */  = (int)mc.kbna("kchy", kbmx(int ), (int)430);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl149:
            // 2 sources

            case 21: {
                var15_8 /* !! */  = (int)mc.kbna("kchz", kbmx(int ), (int)431);
                if (!var16_7) ** GOTO lbl51
                throw null;
            }
            case 22: {
                var15_8 /* !! */  = (int)mc.kbna("kcia", kbmx(int ), (int)432);
                if (!var16_7) ** GOTO lbl116
                throw null;
            }
            case 23: {
                var15_8 /* !! */  = (int)mc.kbna("kcib", kbmx(int ), (int)433);
                if (!var16_7) ** GOTO lbl149
                throw null;
            }
lbl161:
            // 2 sources

            case 24: {
                do {
                    var15_8 /* !! */  = (int)mc.kbna("kcic", kbmx(int ), (int)434);
                } while (!var16_7);
                throw null;
            }
            case 25: {
                var15_8 /* !! */  = (int)mc.kbna("kcid", kbmx(int ), (int)435);
                if (var16_7) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 26: {
                var15_8 /* !! */  = (int)mc.kbna("kcie", kbmx(int ), (int)436);
                if (var16_7) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 27: {
                var15_8 /* !! */  = (int)mc.kbna("kcif", kbmx(int ), (int)437);
                if (!var16_7) ** GOTO lbl56
                throw null;
            }
lbl179:
            // 2 sources

            case 28: {
                var15_8 /* !! */  = (int)mc.kbna("kcig", kbmx(int ), (int)438);
                if (!var16_7) ** GOTO lbl161
                throw null;
            }
lbl183:
            // 4 sources

            case 29: {
                var15_8 /* !! */  = (int)mc.kbna("kcih", kbmx(int ), (int)439);
                if (!var16_7) ** GOTO lbl121
                throw null;
            }
lbl187:
            // 2 sources

            case 30: {
                var15_8 /* !! */  = (int)mc.kbna("kcii", kbmx(int ), (int)440);
                if (!var16_7) ** GOTO lbl70
                throw null;
            }
            case 31: {
                var15_8 /* !! */  = (int)mc.kbna("kcij", kbmx(int ), (int)441);
                if (!var16_7) ** GOTO lbl98
                throw null;
            }
lbl195:
            // 3 sources

            case 32: {
                var15_8 /* !! */  = (int)mc.kbna("kcik", kbmx(int ), (int)442);
                if (!var16_7) ** GOTO lbl121
                throw null;
            }
            case 33: {
                var15_8 /* !! */  = (int)mc.kbna("kcil", kbmx(int ), (int)443);
                if (!var16_7) ** GOTO lbl144
                throw null;
            }
            case 34: {
                var15_8 /* !! */  = (int)mc.kbna("kcim", kbmx(int ), (int)444);
                if (!var16_7) ** GOTO lbl106
                throw null;
            }
            case 35: 
        }
        var15_8 /* !! */  = (int)mc.kbna("kcin", kbmx(int ), (int)445);
        ** while (!var16_7)
lbl210:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawCenterText(class_332 var1_1, float var2_2, float var3_3, float var4_4) {
        block63: {
            block62: {
                block61: {
                    block60: {
                        block59: {
                            block58: {
                                var9_5 = mc.c;
                                var8_6 /* !! */  = mc.b;
                                var7_7 = mc.a;
                                if (var9_5) {
                                    throw null;
lbl6:
                                    // 14 sources

                                    return;
                                }
                                if (var7_7 || var7_7) ** GOTO lbl6
                                if (!kq.hasFonts()) break block58;
                                if (var7_7) ** GOTO lbl6
                                if (kv.BOLD != null) break block59;
                                if (var7_7) ** GOTO lbl6
                            }
                            if (var7_7 || var7_7) ** GOTO lbl6
                            return;
                        }
                        if (var7_7 || var7_7) ** GOTO lbl6
                        this.centeredText(var1_1, "AutoSwap", var2_2, var3_3 - mc.kbna("kcbu", kbqh(int ), (int)285) * this.visualScale, (float)(mc.kbna("kcbv", kbqh(int ), (int)286) * this.visualScale), nd.multAlpha(nd.rgba((int)mc.kbna("kcbw", kbmx(int ), (int)287), (int)mc.kbna("kcbx", kbmx(int ), (int)288), (int)mc.kbna("kcby", kbmx(int ), (int)289), (int)mc.kbna("kcbz", kbmx(int ), (int)290)), var4_4));
                        if (var7_7 || var7_7) ** GOTO lbl6
                        if (this.hoveredSlot >= 0) break block60;
                        if (var7_7) ** GOTO lbl6
                        v0 = "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442";
                        if (var9_5) {
                            throw null;
                        }
                        break block61;
                    }
                    if (var7_7 || var7_7) ** GOTO lbl6
                    v0 = var5_8 = this.autoSwap.getRingItemName(this.hoveredSlot);
                }
                if (var7_7 || var7_7) ** GOTO lbl6
                if (this.hoveredSlot < 0) break block62;
                if (var7_7) ** GOTO lbl6
                if (!this.autoSwap.hasRingItem(this.hoveredSlot)) break block62;
                if (var7_7 || var7_7) ** GOTO lbl6
                v1 = nd.getClientColor();
                if (var9_5) {
                    throw null;
                }
                break block63;
            }
            if (var7_7 || var7_7) ** GOTO lbl6
            v1 = var6_9 = nd.rgba((int)mc.kbna("kcca", kbmx(int ), (int)291), (int)mc.kbna("kccb", kbmx(int ), (int)292), (int)mc.kbna("kccc", kbmx(int ), (int)293), (int)mc.kbna("kccd", kbmx(int ), (int)294));
        }
        if (var7_7 || var7_7) ** GOTO lbl6
        this.centeredText(var1_1, var5_8, var2_2, var3_3 + mc.kbna("kcce", kbqh(int ), (int)295) * this.visualScale, (float)(mc.kbna("kccf", kbqh(int ), (int)296) * this.visualScale), nd.multAlpha(var6_9, var4_4));
        if (var8_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var7_7 && !var7_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_6 /* !! */  = (int)mc.kbna("kccg", kbmx(int ), (int)297);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl56:
            // 2 sources

            case 1: {
                var8_6 /* !! */  = (int)mc.kbna("kcch", kbmx(int ), (int)298);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl61:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_6 /* !! */  = (int)mc.kbna("kcci", kbmx(int ), (int)299);
                    if (var9_5) {
                        throw null;
                    }
                    ** GOTO lbl125
                    break;
                }
            }
lbl67:
            // 3 sources

            case 3: {
                var8_6 /* !! */  = (int)mc.kbna("kccj", kbmx(int ), (int)300);
                if (var9_5) {
                    throw null;
                }
            }
lbl71:
            // 6 sources

            case 4: {
                var8_6 /* !! */  = (int)mc.kbna("kcck", kbmx(int ), (int)301);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl76:
            // 2 sources

            case 5: {
                var8_6 /* !! */  = (int)mc.kbna("kccl", kbmx(int ), (int)302);
                if (!var9_5) ** GOTO lbl71
                throw null;
            }
            case 6: {
                var8_6 /* !! */  = (int)mc.kbna("kccm", kbmx(int ), (int)303);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl85:
            // 2 sources

            case 7: {
                var8_6 /* !! */  = (int)mc.kbna("kccn", kbmx(int ), (int)304);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 8: {
                var8_6 /* !! */  = (int)mc.kbna("kcco", kbmx(int ), (int)305);
                if (!var9_5) ** GOTO lbl71
                throw null;
            }
            case 9: {
                var8_6 /* !! */  = (int)mc.kbna("kccp", kbmx(int ), (int)306);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl99:
            // 2 sources

            case 10: {
                var8_6 /* !! */  = (int)mc.kbna("kccq", kbmx(int ), (int)307);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl104:
            // 3 sources

            case 11: {
                var8_6 /* !! */  = (int)mc.kbna("kccr", kbmx(int ), (int)308);
                if (!var9_5) ** GOTO lbl85
                throw null;
            }
lbl108:
            // 2 sources

            case 12: {
                var8_6 /* !! */  = (int)mc.kbna("kccs", kbmx(int ), (int)309);
                if (!var9_5) ** GOTO lbl67
                throw null;
            }
lbl112:
            // 2 sources

            case 13: {
                var8_6 /* !! */  = (int)mc.kbna("kcct", kbmx(int ), (int)310);
                if (!var9_5) ** GOTO lbl56
                throw null;
            }
lbl116:
            // 2 sources

            case 14: {
                var8_6 /* !! */  = (int)mc.kbna("kccu", kbmx(int ), (int)311);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl121:
            // 2 sources

            case 15: {
                var8_6 /* !! */  = (int)mc.kbna("kccv", kbmx(int ), (int)312);
                if (!var9_5) ** GOTO lbl104
                throw null;
            }
lbl125:
            // 2 sources

            case 16: {
                var8_6 /* !! */  = (int)mc.kbna("kccw", kbmx(int ), (int)313);
                if (!var9_5) ** GOTO lbl71
                throw null;
            }
lbl129:
            // 2 sources

            case 17: {
                var8_6 /* !! */  = (int)mc.kbna("kccx", kbmx(int ), (int)314);
                if (!var9_5) ** GOTO lbl116
                throw null;
            }
            case 18: {
                var8_6 /* !! */  = (int)mc.kbna("kccy", kbmx(int ), (int)315);
                if (!var9_5) ** GOTO lbl76
                throw null;
            }
lbl137:
            // 2 sources

            case 19: {
                var8_6 /* !! */  = (int)mc.kbna("kccz", kbmx(int ), (int)316);
                if (!var9_5) ** GOTO lbl99
                throw null;
            }
            case 20: {
                var8_6 /* !! */  = (int)mc.kbna("kcda", kbmx(int ), (int)317);
                if (var9_5) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl146:
            // 2 sources

            case 21: {
                var8_6 /* !! */  = (int)mc.kbna("kcdb", kbmx(int ), (int)318);
                if (!var9_5) ** GOTO lbl137
                throw null;
            }
lbl150:
            // 2 sources

            case 22: {
                var8_6 /* !! */  = (int)mc.kbna("kcdc", kbmx(int ), (int)319);
                if (!var9_5) ** GOTO lbl67
                throw null;
            }
            case 23: {
                var8_6 /* !! */  = (int)mc.kbna("kcdd", kbmx(int ), (int)320);
                if (!var9_5) break;
                throw null;
            }
lbl158:
            // 3 sources

            case 24: {
                do {
                    var8_6 /* !! */  = (int)mc.kbna("kcde", kbmx(int ), (int)321);
                } while (!var9_5);
                throw null;
            }
            case 25: {
                var8_6 /* !! */  = (int)mc.kbna("kcdf", kbmx(int ), (int)322);
                if (!var9_5) ** GOTO lbl61
                throw null;
            }
            case 26: {
                do {
                    var8_6 /* !! */  = (int)mc.kbna("kcdg", kbmx(int ), (int)323);
                } while (!var9_5);
                throw null;
            }
            case 27: 
        }
        var8_6 /* !! */  = (int)mc.kbna("kcdh", kbmx(int ), (int)324);
        ** while (!var9_5)
lbl175:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnv() {
        mc.kbmz[0] = -1938464206;
        mc.kbmz[1] = -494127518;
        mc.kbmz[2] = -585553419;
        mc.kbmz[3] = -1350827468;
        mc.kbmz[4] = -2048168896;
        mc.kbmz[5] = 463664954;
        mc.kbmz[6] = 1332860459;
        mc.kbmz[7] = -240624975;
        mc.kbmz[8] = 1939404408;
        mc.kbmz[9] = -747123799;
        mc.kbmz[10] = 9952;
        mc.kbmz[11] = 155789335;
        mc.kbmz[12] = -1216447290;
        mc.kbmz[13] = 2123192372;
        mc.kbmz[14] = 2046020565;
        mc.kbmz[15] = -1088204763;
        mc.kbmz[16] = 1930118989;
        mc.kbmz[17] = -1154413927;
        mc.kbmz[18] = 687861155;
        mc.kbmz[19] = 292401461;
        mc.kbmz[20] = 792182823;
        mc.kbmz[21] = -1942908618;
        mc.kbmz[22] = -865569194;
        mc.kbmz[23] = -1062635334;
        mc.kbmz[24] = 1061782667;
        mc.kbmz[25] = -2050019148;
        mc.kbmz[26] = -2049755903;
        mc.kbmz[27] = -224866855;
        mc.kbmz[28] = 1228557777;
        mc.kbmz[29] = -470791974;
        mc.kbmz[30] = -261310101;
        mc.kbmz[31] = 1159562714;
        mc.kbmz[32] = 475213348;
        mc.kbmz[33] = 1258937519;
        mc.kbmz[34] = -216632126;
        mc.kbmz[35] = -542138164;
        mc.kbmz[36] = -1421639214;
        mc.kbmz[37] = -812714792;
        mc.kbmz[38] = 1855159334;
        mc.kbmz[39] = -1526212169;
        mc.kbmz[40] = 1560345573;
        mc.kbmz[41] = 531794558;
        mc.kbmz[42] = 424158711;
        mc.kbmz[43] = -16367536;
        mc.kbmz[44] = 26976221;
        mc.kbmz[45] = -1822054262;
        mc.kbmz[46] = 979123401;
        mc.kbmz[47] = 1275781117;
        mc.kbmz[48] = 137322492;
        mc.kbmz[49] = -647178819;
        mc.kbmz[50] = 860972447;
        mc.kbmz[51] = 736939853;
        mc.kbmz[52] = -418945037;
        mc.kbmz[53] = 1439131545;
        mc.kbmz[54] = 1953030673;
        mc.kbmz[55] = -1512127398;
        mc.kbmz[56] = -1631910196;
        mc.kbmz[57] = 1847364056;
        mc.kbmz[58] = -193455755;
        mc.kbmz[59] = 232807211;
        mc.kbmz[60] = -858357881;
        mc.kbmz[61] = -948894360;
        mc.kbmz[62] = -1211372140;
        mc.kbmz[63] = -544022950;
        mc.kbmz[64] = 870829797;
        mc.kbmz[65] = -456920137;
        mc.kbmz[66] = 1553999520;
        mc.kbmz[67] = -184584714;
        mc.kbmz[68] = 238123650;
        mc.kbmz[69] = 1101849136;
        mc.kbmz[70] = -1173542299;
        mc.kbmz[71] = -1068048214;
        mc.kbmz[72] = -908935895;
        mc.kbmz[73] = 1018833412;
        mc.kbmz[74] = 1304261311;
        mc.kbmz[75] = -711910626;
        mc.kbmz[76] = 441820259;
        mc.kbmz[77] = -604602323;
        mc.kbmz[78] = 601847627;
        mc.kbmz[79] = -1906992739;
        mc.kbmz[80] = -1047989423;
        mc.kbmz[81] = 115933615;
        mc.kbmz[82] = -622854559;
        mc.kbmz[83] = 1039857655;
        mc.kbmz[84] = 1234493115;
        mc.kbmz[85] = 483606560;
        mc.kbmz[86] = 1556351297;
        mc.kbmz[87] = -1091091544;
        mc.kbmz[88] = -1315506584;
        mc.kbmz[89] = 2015695467;
        mc.kbmz[90] = 1371066251;
        mc.kbmz[91] = -49789895;
        mc.kbmz[92] = -436023377;
        mc.kbmz[93] = 559295952;
        mc.kbmz[94] = 1306754548;
        mc.kbmz[95] = 32335334;
        mc.kbmz[96] = -1144371890;
        mc.kbmz[97] = -1747858642;
        mc.kbmz[98] = 1726065719;
        mc.kbmz[99] = 1543711360;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float easeOutCubic(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kckl", kbnm(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mc.kbna("kckm", kbmx(int ), (int)479)) break;
            v0 /* !! */  = (long)mc.kbna("kckn", kbmx(int ), (int)480);
        }
        var5_2 = mc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kcko", kbnm(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mc.kbna("kckp", kbmx(int ), (int)481)) break;
            v1 /* !! */  = (long)mc.kbna("kckq", kbmx(int ), (int)482);
        }
        var4_3 /* !! */  = mc.b;
        v2 /* !! */  = mc.sa;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - mc.kbna("kckr", kbnm(int ), (int)127));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1502732164: {
                    v3 = mc.kbna("kcks", kbnm(int ), (int)128);
                    continue block16;
                }
                case -1142963413: {
                    v3 = mc.kbna("kckt", kbnm(int ), (int)129);
                    continue block16;
                }
                case 651815178: {
                    v3 = mc.kbna("kcku", kbnm(int ), (int)130);
                    continue block16;
                }
                case 1490645056: {
                    break block16;
                }
            }
            break;
        }
        var3_4 = mc.a;
        if (var5_2) {
            throw null;
lbl34:
            // 2 sources

            return (float)mc.kbna("kckv", kbqh(int ), (int)483);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kckw", kbnm(int ), (int)131)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mc.kbna("kckx", kbmx(int ), (int)484)) break;
                    v4 /* !! */  = (long)mc.kbna("kcky", kbmx(int ), (int)485);
                }
                var2_5 = 1.0f - this.clamp01(var1_1);
                if (var3_4 || var3_4) ** continue;
                return 1.0f - var2_5 * var2_5 * var2_5;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mc.kbna("kckz", kbmx(int ), (int)486);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl60
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)mc.kbna("kcla", kbmx(int ), (int)487);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl60:
            // 2 sources

            case 2: {
                do {
                    var4_3 /* !! */  = (int)mc.kbna("kclb", kbmx(int ), (int)488);
                } while (!var5_2);
                throw null;
            }
lbl65:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)mc.kbna("kclc", kbmx(int ), (int)489);
                if (var5_2) {
                    throw null;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)mc.kbna("kcld", kbmx(int ), (int)490);
                if (!var5_2) break;
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)mc.kbna("kcle", kbmx(int ), (int)491);
        ** while (!var5_2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int kbmx(int n2) {
        return kbmy[n2] ^ kbmz[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float easeOutBack(float var1_1) {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kclz", kbnm(int ), (int)143));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 518290852: {
                    v1 = mc.kbna("kcma", kbnm(int ), (int)144);
                    continue block28;
                }
                case 1252305302: {
                    v1 = mc.kbna("kcmb", kbnm(int ), (int)145);
                    continue block28;
                }
                case 1490645056: {
                    break block28;
                }
            }
            break;
        }
        var8_2 = mc.c;
        v2 /* !! */  = mc.sa;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - mc.kbna("kcmc", kbnm(int ), (int)146));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -559133636: {
                    v3 = mc.kbna("kcmd", kbnm(int ), (int)147);
                    continue block29;
                }
                case 1490645056: {
                    break block29;
                }
                case 2074987758: {
                    v3 = mc.kbna("kcme", kbnm(int ), (int)148);
                    continue block29;
                }
            }
            break;
        }
        var7_3 /* !! */  = mc.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kcmf", kbnm(int ), (int)149)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mc.kbna("kcmg", kbmx(int ), (int)501)) {
                var6_4 = mc.a;
                if (var8_2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)mc.kbna("kcmh", kbmx(int ), (int)502);
        }
        if (var6_4 || var6_4) return (float)mc.kbna("kcmi", kbqh(int ), (int)503);
        v5 /* !! */  = mc.sa;
        block31: while (true) {
            switch ((int)v5 /* !! */ ) {
                case 1138328780: {
                    v5 /* !! */  = (long)(mc.kbna("kcmk", kbnm(int ), (int)151) - mc.kbna("kcmj", kbnm(int ), (int)150));
                    continue block31;
                }
                case 1490645056: {
                    break block31;
                }
            }
            break;
        }
        var2_5 = this.clamp01(var1_1);
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block32: do {
            switch (cfr_temp_0 == -2147483648 ? var7_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var6_4 || var6_4) return (float)mc.kbna("kcmi", kbqh(int ), (int)503);
                    var3_6 = mc.kbna("kcml", kbqh(int ), (int)504);
                    if (var6_4 || var6_4) return (float)mc.kbna("kcmi", kbqh(int ), (int)503);
                    var4_7 = var3_6 + 1.0f;
                    if (var6_4 || var6_4) return (float)mc.kbna("kcmi", kbqh(int ), (int)503);
                    var5_8 = var2_5 - 1.0f;
                    if (!var6_4 && !var6_4) return 1.0f + var4_7 * var5_8 * var5_8 * var5_8 + var3_6 * var5_8 * var5_8;
                    return (float)mc.kbna("kcmi", kbqh(int ), (int)503);
                }
                case 0: {
                    ** GOTO lbl98
                }
                case 2: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmo", kbmx(int ), (int)507);
                    cfr_temp_0 = 1;
                    if (!var8_2) continue block32;
                    throw null;
                }
                case 3: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmp", kbmx(int ), (int)508);
                    cfr_temp_0 = 1;
                    if (!var8_2) continue block32;
                    throw null;
                }
                case 4: {
                    do {
                        var7_3 /* !! */  = (int)mc.kbna("kcmq", kbmx(int ), (int)509);
                    } while (!var8_2);
                    throw null;
                }
                case 5: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmr", kbmx(int ), (int)510);
                    cfr_temp_0 = 9;
                    if (!var8_2) continue block32;
                    throw null;
                }
                case 7: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmt", kbmx(int ), (int)512);
                    cfr_temp_0 = 9;
                    if (!var8_2) continue block32;
                    throw null;
                }
                case 8: {
                    do {
                        var7_3 /* !! */  = (int)mc.kbna("kcmu", kbmx(int ), (int)513);
                    } while (!var8_2);
                    throw null;
                }
                case 11: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmx", kbmx(int ), (int)516);
                    if (var8_2) {
                        throw null;
                    }
lbl98:
                    // 3 sources

                    var7_3 /* !! */  = (int)mc.kbna("kcmm", kbmx(int ), (int)505);
                    if (var8_2) {
                        throw null;
                    }
                }
                case 1: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmn", kbmx(int ), (int)506);
                    if (var8_2) {
                        throw null;
                    }
                }
                case 10: {
                    var7_3 /* !! */  = (int)mc.kbna("kcmw", kbmx(int ), (int)515);
                    if (var8_2) {
                        throw null;
                    }
                }
                case 6: {
                    var7_3 /* !! */  = (int)mc.kbna("kcms", kbmx(int ), (int)511);
                    if (var8_2) {
                        throw null;
                    }
                }
                case 9: 
            }
            break;
        } while (true);
        do {
            var7_3 /* !! */  = (int)mc.kbna("kcmv", kbmx(int ), (int)514);
        } while (!var8_2);
        throw null;
    }

    static {
        kbmy = new int[529];
        kbmz = new int[529];
        mc.kcnp();
        mc.kcnq();
        mc.kcnr();
        mc.kcns();
        mc.kcnt();
        mc.kcnu();
        mc.kcnv();
        mc.kcnw();
        mc.kcnx();
        mc.kcny();
        mc.kcnz();
        mc.kcoa();
        kbnn = new long[157];
        kbno = new long[157];
        mc.kcob();
        mc.kcoc();
        mc.kcod();
        mc.kcoe();
        SECTOR_CENTER_ANGLES = new float[]{90.0f, -30.0f, -150.0f};
    }

    private static /* synthetic */ void kcnw() {
        mc.kbmz[100] = 304701561;
        mc.kbmz[101] = -1616847740;
        mc.kbmz[102] = 2131148360;
        mc.kbmz[103] = 0xAA4494;
        mc.kbmz[104] = 404700982;
        mc.kbmz[105] = -1572628811;
        mc.kbmz[106] = -328096561;
        mc.kbmz[107] = -27082547;
        mc.kbmz[108] = 1767803879;
        mc.kbmz[109] = -1594666102;
        mc.kbmz[110] = -1546014508;
        mc.kbmz[111] = -31071850;
        mc.kbmz[112] = -1877648856;
        mc.kbmz[113] = 1922174973;
        mc.kbmz[114] = 564686518;
        mc.kbmz[115] = 789549315;
        mc.kbmz[116] = 1318419675;
        mc.kbmz[117] = 270338740;
        mc.kbmz[118] = -1964917663;
        mc.kbmz[119] = 1561496817;
        mc.kbmz[120] = 316909952;
        mc.kbmz[121] = -875804981;
        mc.kbmz[122] = -105214273;
        mc.kbmz[123] = -1585401493;
        mc.kbmz[124] = -540738359;
        mc.kbmz[125] = 1096873686;
        mc.kbmz[126] = 1657936494;
        mc.kbmz[127] = -186448561;
        mc.kbmz[128] = 1615311981;
        mc.kbmz[129] = -1514073051;
        mc.kbmz[130] = -1358408780;
        mc.kbmz[131] = 1932750128;
        mc.kbmz[132] = 1832727100;
        mc.kbmz[133] = 1763616329;
        mc.kbmz[134] = 1982331311;
        mc.kbmz[135] = 138684542;
        mc.kbmz[136] = 82353267;
        mc.kbmz[137] = 902659799;
        mc.kbmz[138] = -1756782384;
        mc.kbmz[139] = -2009105180;
        mc.kbmz[140] = 629583697;
        mc.kbmz[141] = -1898812053;
        mc.kbmz[142] = -801607542;
        mc.kbmz[143] = -1578355727;
        mc.kbmz[144] = -2004315159;
        mc.kbmz[145] = 1214459888;
        mc.kbmz[146] = 1954056261;
        mc.kbmz[147] = 873058041;
        mc.kbmz[148] = 1604636729;
        mc.kbmz[149] = -364993763;
        mc.kbmz[150] = -1172684904;
        mc.kbmz[151] = 383882557;
        mc.kbmz[152] = -1149328260;
        mc.kbmz[153] = -1539770558;
        mc.kbmz[154] = 1837413816;
        mc.kbmz[155] = 2102911049;
        mc.kbmz[156] = -1898616388;
        mc.kbmz[157] = -1060115132;
        mc.kbmz[158] = -1592433622;
        mc.kbmz[159] = 1872448157;
        mc.kbmz[160] = -2043492950;
        mc.kbmz[161] = -1671995419;
        mc.kbmz[162] = 1897507008;
        mc.kbmz[163] = 860202127;
        mc.kbmz[164] = 1948764081;
        mc.kbmz[165] = -913400504;
        mc.kbmz[166] = -1014859070;
        mc.kbmz[167] = -2086874257;
        mc.kbmz[168] = 2056667976;
        mc.kbmz[169] = -1435282252;
        mc.kbmz[170] = 67223402;
        mc.kbmz[171] = 1994391276;
        mc.kbmz[172] = -1820001401;
        mc.kbmz[173] = -701555561;
        mc.kbmz[174] = -196873835;
        mc.kbmz[175] = -1519406923;
        mc.kbmz[176] = -1395493891;
        mc.kbmz[177] = -414657330;
        mc.kbmz[178] = 1676677304;
        mc.kbmz[179] = 1399179875;
        mc.kbmz[180] = 1258519232;
        mc.kbmz[181] = 1272099;
        mc.kbmz[182] = -532477168;
        mc.kbmz[183] = -686000747;
        mc.kbmz[184] = 94879684;
        mc.kbmz[185] = 2062006294;
        mc.kbmz[186] = 1991972637;
        mc.kbmz[187] = 2104586844;
        mc.kbmz[188] = 748686704;
        mc.kbmz[189] = -531652128;
        mc.kbmz[190] = -2070237104;
        mc.kbmz[191] = -1585092647;
        mc.kbmz[192] = 1446442606;
        mc.kbmz[193] = -1423670348;
        mc.kbmz[194] = 894577410;
        mc.kbmz[195] = 1468865317;
        mc.kbmz[196] = 1672875202;
        mc.kbmz[197] = 1778623303;
        mc.kbmz[198] = -279309400;
        mc.kbmz[199] = -750473104;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25393() {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kbpm", kbnm(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1972680412: {
                    v1 = mc.kbna("kbpn", kbnm(int ), (int)26);
                    continue block18;
                }
                case -1859201570: {
                    v1 = mc.kbna("kbpo", kbnm(int ), (int)27);
                    continue block18;
                }
                case 1490645056: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = mc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbpp", kbnm(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mc.kbna("kbpq", kbmx(int ), (int)35)) break;
            v2 /* !! */  = (long)mc.kbna("kbpr", kbmx(int ), (int)36);
        }
        var2_2 /* !! */  = mc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kbps", kbnm(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mc.kbna("kbpt", kbmx(int ), (int)37)) break;
            v3 /* !! */  = (long)mc.kbna("kbpu", kbmx(int ), (int)38);
        }
        var1_3 = mc.a;
        if (!var3_1) ** GOTO lbl33
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl33:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                v4 /* !! */  = mc.sa;
                if (true) ** GOTO lbl38
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - mc.kbna("kbpv", kbnm(int ), (int)30));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1260213712: {
                            v5 = mc.kbna("kbpw", kbnm(int ), (int)31);
                            continue block22;
                        }
                        case -796639660: {
                            v5 = mc.kbna("kbpx", kbnm(int ), (int)32);
                            continue block22;
                        }
                        case 1490645056: {
                            break block22;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kbpy", kbnm(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mc.kbna("kbpz", kbmx(int ), (int)39)) break;
                    v6 /* !! */  = (long)mc.kbna("kbqa", kbmx(int ), (int)40);
                }
                this.movement.restoreFromCurrent();
                if (var1_3 || var1_3) continue block21;
                return;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)mc.kbna("kbqb", kbmx(int ), (int)41);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl66
                        break;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)mc.kbna("kbqc", kbmx(int ), (int)42);
                    } while (!var3_1);
                    throw null;
                }
lbl66:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)mc.kbna("kbqd", kbmx(int ), (int)43);
                    if (!var3_1) break block21;
                    throw null;
                }
                case 3: {
                    do {
                        var2_2 /* !! */  = (int)mc.kbna("kbqe", kbmx(int ), (int)44);
                    } while (!var3_1);
                    throw null;
                }
                case 4: {
                    do {
                        var2_2 /* !! */  = (int)mc.kbna("kbqf", kbmx(int ), (int)45);
                    } while (!var3_1);
                    throw null;
                }
                case 5: 
            }
        }
        var2_2 /* !! */  = (int)mc.kbna("kbqg", kbmx(int ), (int)46);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$render$0(Matrix4f var0, float var1_1, float var2_2, float var3_3, float var4_4, int[] var5_5) {
        block24: {
            block26: {
                block25: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kcmy", kbnm(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == mc.kbna("kcmz", kbmx(int ), (int)517)) break;
                        v0 /* !! */  = (long)mc.kbna("kcna", kbmx(int ), (int)518);
                    }
                    var8_6 = mc.c;
                    v1 /* !! */  = mc.sa;
                    block12: while (true) {
                        switch ((int)v1 /* !! */ ) {
                            case -2093759730: {
                                v1 /* !! */  = (long)(mc.kbna("kcnc", kbnm(int ), (int)154) - mc.kbna("kcnb", kbnm(int ), (int)153));
                                continue block12;
                            }
                            case 1490645056: {
                                break block12;
                            }
                        }
                        break;
                    }
                    var7_7 /* !! */  = mc.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kcnd", kbnm(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == mc.kbna("kcne", kbmx(int ), (int)519)) {
                            var6_8 = mc.a;
                            if (var8_6) {
                                throw null;
                            }
                            break;
                        }
                        v2 /* !! */  = (long)mc.kbna("kcnf", kbmx(int ), (int)520);
                    }
                    if (var6_8 || var6_8) break block25;
                    v3 = var1_1 - var2_2 / 2.0f;
                    v4 = var3_3 - var2_2 / 2.0f;
                    v5 = mc.kbna("kcng", kbqh(int ), (int)521);
                    ** GOTO lbl52
                }
                block14: while (true) {
                    if (var7_7 /* !! */  == 0) return;
                    cfr_temp_0 = -2147483648;
lbl34:
                    // 2 sources

                    block15: while (true) {
                        switch (cfr_temp_0 == -2147483648 ? var7_7 /* !! */  : cfr_temp_0) {
                            default: {
                                return;
                            }
                            case 0: {
                                ** break;
                            }
                            case 2: {
                                var7_7 /* !! */  = (int)mc.kbna("kcnm", kbmx(int ), (int)526);
                                if (var8_6) {
                                    throw null;
                                }
                                break block24;
                            }
                            case 3: {
                                do {
                                    var7_7 /* !! */  = (int)mc.kbna("kcnn", kbmx(int ), (int)527);
                                } while (!var8_6);
                                throw null;
                            }
                            case 4: {
                                break block24;
                            }
lbl52:
                            // 1 sources

                            while (true) {
                                if ((v6 /* !! */  = (cfr_temp_3 = mc.sa - mc.kbna("kcnh", kbnm(int ), (int)156)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                if (v6 /* !! */  == mc.kbna("kcni", kbmx(int ), (int)522)) {
                                    lh.draw(var0, v3, v4, var2_2, var4_4, (float)v5, 0.0f, var5_5);
                                    if (var6_8) continue block14;
                                    return;
                                }
                                v6 /* !! */  = (long)mc.kbna("kcnj", kbmx(int ), (int)523);
                            }
lbl60:
                            // 2 sources

                            while (true) {
                                var7_7 /* !! */  = (int)mc.kbna("kcnk", kbmx(int ), (int)524);
                                cfr_temp_0 = 1;
                                if (!var8_6) continue block15;
                                throw null;
                            }
                            case 1: 
                        }
                        break;
                    }
                    break;
                }
                break block26;
                ** while (true)
            }
            var7_7 /* !! */  = (int)mc.kbna("kcnl", kbmx(int ), (int)525);
            if (var8_6) {
                throw null;
            }
        }
        var7_7 /* !! */  = (int)mc.kbna("kcno", kbmx(int ), (int)528);
        ** while (!var8_6)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcoa() {
        mc.kbmz[500] = 1712430608;
        mc.kbmz[501] = -1859648659;
        mc.kbmz[502] = 982722679;
        mc.kbmz[503] = 867473948;
        mc.kbmz[504] = -553907236;
        mc.kbmz[505] = -575286550;
        mc.kbmz[506] = 197727733;
        mc.kbmz[507] = -1902133740;
        mc.kbmz[508] = -1457675739;
        mc.kbmz[509] = 1767593504;
        mc.kbmz[510] = 1218495087;
        mc.kbmz[511] = 1672341704;
        mc.kbmz[512] = -239032924;
        mc.kbmz[513] = -844137101;
        mc.kbmz[514] = 328583900;
        mc.kbmz[515] = -405761368;
        mc.kbmz[516] = -1730015878;
        mc.kbmz[517] = -1494309650;
        mc.kbmz[518] = 761282706;
        mc.kbmz[519] = -371969680;
        mc.kbmz[520] = 862763102;
        mc.kbmz[521] = -1474978575;
        mc.kbmz[522] = -554354166;
        mc.kbmz[523] = 5301157;
        mc.kbmz[524] = -2142669967;
        mc.kbmz[525] = 295171257;
        mc.kbmz[526] = -20361775;
        mc.kbmz[527] = 1187547028;
        mc.kbmz[528] = 1496534136;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawSlot(class_332 var1_1, int var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        block95: {
            block94: {
                var20_8 = mc.c;
                var19_9 /* !! */  = mc.b;
                var18_10 = mc.a;
                if (var20_8) {
                    throw null;
lbl6:
                    // 24 sources

                    return;
                }
                if (var18_10 || var18_10) ** GOTO lbl6
                if (!(var7_7 < mc.kbna("kcdi", kbqh(int ), (int)325))) break block94;
                if (var18_10) ** GOTO lbl6
                return;
            }
            if (var18_10 || var18_10) ** GOTO lbl6
            var8_11 = Math.toRadians(mc.SECTOR_CENTER_ANGLES[var2_2]);
            if (var18_10 || var18_10) ** GOTO lbl6
            var10_12 = var5_5 / 2.0f - var6_6 / 2.0f;
            if (var18_10 || var18_10) ** GOTO lbl6
            var11_13 = var3_3 + (float)Math.cos(var8_11) * var10_12;
            if (var18_10 || var18_10) ** GOTO lbl6
            var12_14 = var4_4 + (float)Math.sin(var8_11) * var10_12;
            if (var18_10 || var18_10) ** GOTO lbl6
            var13_15 = this.autoSwap.getRingItemStack(var2_2);
            if (var18_10 || var18_10) ** GOTO lbl6
            if (!var13_15.method_7960()) ** GOTO lbl47
            if (var18_10 || var18_10) ** GOTO lbl6
            if (!kq.hasFonts()) break block95;
            if (var18_10) ** GOTO lbl6
            if (kv.BOLD == null) break block95;
            if (var18_10 || var18_10) ** GOTO lbl6
            v0 = var12_14 - mc.kbna("kcdj", kbqh(int ), (int)326) * this.visualScale;
            v1 = mc.kbna("kcdk", kbqh(int ), (int)327) * this.visualScale;
            if (var2_2 == this.hoveredSlot) {
                v2 = nd.rgba((int)mc.kbna("kcdl", kbmx(int ), (int)328), (int)mc.kbna("kcdm", kbmx(int ), (int)329), (int)mc.kbna("kcdn", kbmx(int ), (int)330), (int)mc.kbna("kcdo", kbmx(int ), (int)331));
                if (var20_8) {
                    throw null;
                }
            } else {
                v2 = nd.rgba((int)mc.kbna("kcdp", kbmx(int ), (int)332), (int)mc.kbna("kcdq", kbmx(int ), (int)333), (int)mc.kbna("kcdr", kbmx(int ), (int)334), (int)mc.kbna("kcds", kbmx(int ), (int)335));
            }
            this.centeredText(var1_1, "+", var11_13, v0, (float)v1, nd.multAlpha(v2, var7_7));
            if (var18_10) ** GOTO lbl6
        }
        if (var18_10) ** GOTO lbl6
        if (var19_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var19_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var18_10) ** GOTO lbl6
                return;
            }
lbl47:
            // 1 sources

            if (var18_10 || var18_10) ** GOTO lbl6
            var14_16 = mc.kbna("kcdt", kbqh(int ), (int)336) * this.visualScale;
            if (var18_10 || var18_10) ** GOTO lbl6
            var15_17 = Math.max((float)mc.kbna("kcdu", kbqh(int ), (int)337), ki.getScaleFactor());
            if (var18_10 || var18_10) ** GOTO lbl6
            var16_18 = var14_16 / var15_17;
            if (var18_10 || var18_10) ** GOTO lbl6
            var17_19 = var1_1.method_51448();
            if (var18_10 || var18_10) ** GOTO lbl6
            var17_19.pushMatrix();
            if (var18_10 || var18_10) ** GOTO lbl6
            var17_19.translate(var11_13 / var15_17 - var16_18 / 2.0f, var12_14 / var15_17 - var16_18 / 2.0f);
            if (var18_10 || var18_10) ** GOTO lbl6
            var17_19.scale((float)(var16_18 / mc.kbna("kcdv", kbqh(int ), (int)338)), (float)(var16_18 / mc.kbna("kcdw", kbqh(int ), (int)339)));
            if (var18_10 || var18_10) ** GOTO lbl6
            var1_1.method_51427(var13_15, (int)mc.kbna("kcdx", kbmx(int ), (int)340), (int)mc.kbna("kcdy", kbmx(int ), (int)341));
            if (var18_10 || var18_10) ** GOTO lbl6
            var17_19.popMatrix();
            if (!var18_10 && !var18_10) ** break;
            ** continue;
            return;
lbl72:
            // 3 sources

            case 0: {
                var19_9 /* !! */  = (int)mc.kbna("kcdz", kbmx(int ), (int)342);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 1: {
                var19_9 /* !! */  = (int)mc.kbna("kcea", kbmx(int ), (int)343);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl82:
            // 2 sources

            case 2: {
                var19_9 /* !! */  = (int)mc.kbna("kceb", kbmx(int ), (int)344);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 3: {
                var19_9 /* !! */  = (int)mc.kbna("kcec", kbmx(int ), (int)345);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 4: {
                var19_9 /* !! */  = (int)mc.kbna("kced", kbmx(int ), (int)346);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl97:
            // 2 sources

            case 5: {
                var19_9 /* !! */  = (int)mc.kbna("kcee", kbmx(int ), (int)347);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl102:
            // 2 sources

            case 6: {
                var19_9 /* !! */  = (int)mc.kbna("kcef", kbmx(int ), (int)348);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl107:
            // 2 sources

            case 7: {
                var19_9 /* !! */  = (int)mc.kbna("kceg", kbmx(int ), (int)349);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl112:
            // 2 sources

            case 8: {
                var19_9 /* !! */  = (int)mc.kbna("kceh", kbmx(int ), (int)350);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl117:
            // 2 sources

            case 9: {
                var19_9 /* !! */  = (int)mc.kbna("kcei", kbmx(int ), (int)351);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl122:
            // 2 sources

            case 10: {
                var19_9 /* !! */  = (int)mc.kbna("kcej", kbmx(int ), (int)352);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 11: {
                var19_9 /* !! */  = (int)mc.kbna("kcek", kbmx(int ), (int)353);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 12: {
                var19_9 /* !! */  = (int)mc.kbna("kcel", kbmx(int ), (int)354);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 13: {
                var19_9 /* !! */  = (int)mc.kbna("kcem", kbmx(int ), (int)355);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl142:
            // 2 sources

            case 14: {
                var19_9 /* !! */  = (int)mc.kbna("kcen", kbmx(int ), (int)356);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 15: {
                var19_9 /* !! */  = (int)mc.kbna("kceo", kbmx(int ), (int)357);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl152:
            // 4 sources

            case 16: {
                var19_9 /* !! */  = (int)mc.kbna("kcep", kbmx(int ), (int)358);
                if (!var20_8) break;
                throw null;
            }
            case 17: {
                var19_9 /* !! */  = (int)mc.kbna("kceq", kbmx(int ), (int)359);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 18: {
                var19_9 /* !! */  = (int)mc.kbna("kcer", kbmx(int ), (int)360);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl166:
            // 3 sources

            case 19: {
                var19_9 /* !! */  = (int)mc.kbna("kces", kbmx(int ), (int)361);
                if (!var20_8) ** GOTO lbl97
                throw null;
            }
lbl170:
            // 4 sources

            case 20: {
                var19_9 /* !! */  = (int)mc.kbna("kcet", kbmx(int ), (int)362);
                if (!var20_8) ** GOTO lbl102
                throw null;
            }
lbl174:
            // 2 sources

            case 21: {
                var19_9 /* !! */  = (int)mc.kbna("kceu", kbmx(int ), (int)363);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl179:
            // 2 sources

            case 22: {
                var19_9 /* !! */  = (int)mc.kbna("kcev", kbmx(int ), (int)364);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl184:
            // 3 sources

            case 23: {
                var19_9 /* !! */  = (int)mc.kbna("kcew", kbmx(int ), (int)365);
                if (!var20_8) ** GOTO lbl72
                throw null;
            }
            case 24: {
                var19_9 /* !! */  = (int)mc.kbna("kcex", kbmx(int ), (int)366);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl193:
            // 2 sources

            case 25: {
                var19_9 /* !! */  = (int)mc.kbna("kcey", kbmx(int ), (int)367);
                if (!var20_8) ** GOTO lbl166
                throw null;
            }
lbl197:
            // 2 sources

            case 26: {
                var19_9 /* !! */  = (int)mc.kbna("kcez", kbmx(int ), (int)368);
                if (!var20_8) ** GOTO lbl152
                throw null;
            }
lbl201:
            // 2 sources

            case 27: {
                var19_9 /* !! */  = (int)mc.kbna("kcfa", kbmx(int ), (int)369);
                if (!var20_8) ** GOTO lbl117
                throw null;
            }
lbl205:
            // 2 sources

            case 28: {
                var19_9 /* !! */  = (int)mc.kbna("kcfb", kbmx(int ), (int)370);
                if (var20_8) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl210:
            // 2 sources

            case 29: {
                var19_9 /* !! */  = (int)mc.kbna("kcfc", kbmx(int ), (int)371);
                if (!var20_8) ** GOTO lbl107
                throw null;
            }
lbl214:
            // 4 sources

            case 30: {
                var19_9 /* !! */  = (int)mc.kbna("kcfd", kbmx(int ), (int)372);
                if (!var20_8) ** GOTO lbl174
                throw null;
            }
lbl218:
            // 2 sources

            case 31: {
                var19_9 /* !! */  = (int)mc.kbna("kcfe", kbmx(int ), (int)373);
                if (!var20_8) ** GOTO lbl184
                throw null;
            }
lbl222:
            // 4 sources

            case 32: {
                var19_9 /* !! */  = (int)mc.kbna("kcff", kbmx(int ), (int)374);
                if (!var20_8) break;
                throw null;
            }
lbl226:
            // 3 sources

            case 33: {
                var19_9 /* !! */  = (int)mc.kbna("kcfg", kbmx(int ), (int)375);
                if (!var20_8) ** GOTO lbl214
                throw null;
            }
            case 34: {
                var19_9 /* !! */  = (int)mc.kbna("kcfh", kbmx(int ), (int)376);
                if (!var20_8) ** GOTO lbl222
                throw null;
            }
lbl234:
            // 2 sources

            case 35: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var19_9 /* !! */  = (int)mc.kbna("kcfi", kbmx(int ), (int)377);
                    if (!var20_8) ** GOTO lbl222
                    throw null;
                }
            }
lbl239:
            // 2 sources

            case 36: {
                var19_9 /* !! */  = (int)mc.kbna("kcfj", kbmx(int ), (int)378);
                if (!var20_8) ** GOTO lbl72
                throw null;
            }
            case 37: {
                var19_9 /* !! */  = (int)mc.kbna("kcfk", kbmx(int ), (int)379);
                if (!var20_8) ** GOTO lbl82
                throw null;
            }
lbl247:
            // 2 sources

            case 38: {
                var19_9 /* !! */  = (int)mc.kbna("kcfl", kbmx(int ), (int)380);
                if (!var20_8) ** GOTO lbl218
                throw null;
            }
lbl251:
            // 2 sources

            case 39: {
                var19_9 /* !! */  = (int)mc.kbna("kcfm", kbmx(int ), (int)381);
                if (!var20_8) ** GOTO lbl152
                throw null;
            }
            case 40: {
                var19_9 /* !! */  = (int)mc.kbna("kcfn", kbmx(int ), (int)382);
                if (!var20_8) ** GOTO lbl112
                throw null;
            }
lbl259:
            // 2 sources

            case 41: {
                var19_9 /* !! */  = (int)mc.kbna("kcfo", kbmx(int ), (int)383);
                if (!var20_8) ** GOTO lbl226
                throw null;
            }
            case 42: {
                var19_9 /* !! */  = (int)mc.kbna("kcfp", kbmx(int ), (int)384);
                if (!var20_8) ** GOTO lbl201
                throw null;
            }
lbl267:
            // 3 sources

            case 43: {
                var19_9 /* !! */  = (int)mc.kbna("kcfq", kbmx(int ), (int)385);
                if (!var20_8) ** GOTO lbl205
                throw null;
            }
            case 44: {
                var19_9 /* !! */  = (int)mc.kbna("kcfr", kbmx(int ), (int)386);
                if (!var20_8) ** GOTO lbl122
                throw null;
            }
            case 45: 
        }
        var19_9 /* !! */  = (int)mc.kbna("kcfs", kbmx(int ), (int)387);
        ** while (!var20_8)
lbl278:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float clamp01(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kcjr", kbnm(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mc.kbna("kcjs", kbmx(int ), (int)468)) break;
            v0 /* !! */  = (long)mc.kbna("kcjt", kbmx(int ), (int)469);
        }
        var4_2 = mc.c;
        v1 /* !! */  = mc.sa;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(mc.kbna("kcjv", kbnm(int ), (int)118) - mc.kbna("kcju", kbnm(int ), (int)117));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 800945630: {
                    continue block17;
                }
                case 1490645056: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = mc.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mc.sa;
                if (true) ** GOTO lbl24
                block18: while (true) {
                    v2 /* !! */  = (long)(v3 - mc.kbna("kcjw", kbnm(int ), (int)119));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1145907665: {
                            v3 = mc.kbna("kcjx", kbnm(int ), (int)120);
                            continue block18;
                        }
                        case -802638725: {
                            v3 = mc.kbna("kcjy", kbnm(int ), (int)121);
                            continue block18;
                        }
                        case 1213435456: {
                            v3 = mc.kbna("kcjz", kbnm(int ), (int)122);
                            continue block18;
                        }
                        case 1490645056: {
                            break block18;
                        }
                    }
                    break;
                }
                var2_4 = mc.a;
                if (var4_2) {
                    throw null;
                    return (float)mc.kbna("kcka", kbqh(int ), (int)470);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kckb", kbnm(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == mc.kbna("kckc", kbmx(int ), (int)471)) break;
                    v4 /* !! */  = (long)mc.kbna("kckd", kbmx(int ), (int)472);
                }
                v5 = Math.min(1.0f, var1_1);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kcke", kbnm(int ), (int)124)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mc.kbna("kckf", kbmx(int ), (int)473)) break;
                    v6 /* !! */  = (long)mc.kbna("kckg", kbmx(int ), (int)474);
                }
                return Math.max(0.0f, v5);
            }
            case 0: {
                var3_3 /* !! */  = (int)mc.kbna("kckh", kbmx(int ), (int)475);
                if (var4_2) {
                    throw null;
                }
            }
lbl58:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)mc.kbna("kcki", kbmx(int ), (int)476);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)mc.kbna("kckj", kbmx(int ), (int)477);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mc.kbna("kckk", kbmx(int ), (int)478);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float easeInCubic(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kclf", kbnm(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mc.kbna("kclg", kbmx(int ), (int)492)) break;
            v0 /* !! */  = (long)mc.kbna("kclh", kbmx(int ), (int)493);
        }
        var5_2 = mc.c;
        v1 /* !! */  = mc.sa;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - mc.kbna("kcli", kbnm(int ), (int)133));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -301114780: {
                    v2 = mc.kbna("kclj", kbnm(int ), (int)134);
                    continue block25;
                }
                case 295871697: {
                    v2 = mc.kbna("kclk", kbnm(int ), (int)135);
                    continue block25;
                }
                case 1490645056: {
                    break block25;
                }
                case 2124848184: {
                    v2 = mc.kbna("kcll", kbnm(int ), (int)136);
                    continue block25;
                }
            }
            break;
        }
        var4_3 /* !! */  = mc.b;
        v3 /* !! */  = mc.sa;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - mc.kbna("kclm", kbnm(int ), (int)137));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 137627023: {
                    v4 = mc.kbna("kcln", kbnm(int ), (int)138);
                    continue block26;
                }
                case 1238016779: {
                    v4 = mc.kbna("kclo", kbnm(int ), (int)139);
                    continue block26;
                }
                case 1490645056: {
                    break block26;
                }
            }
            break;
        }
        var3_4 = mc.a;
        if (var5_2) {
            throw null;
lbl41:
            // 3 sources

            return (float)mc.kbna("kclp", kbqh(int ), (int)494);
        }
        if (var3_4 || var3_4) ** GOTO lbl41
        v5 /* !! */  = mc.sa;
        if (true) ** GOTO lbl48
        block28: while (true) {
            v5 /* !! */  = (long)(v6 - mc.kbna("kclq", kbnm(int ), (int)140));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2127384971: {
                    v6 = mc.kbna("kclr", kbnm(int ), (int)141);
                    continue block28;
                }
                case 1490645056: {
                    break block28;
                }
                case 1548199201: {
                    v6 = mc.kbna("kcls", kbnm(int ), (int)142);
                    continue block28;
                }
            }
            break;
        }
        var2_5 = this.clamp01(var1_1);
        if (var3_4) ** GOTO lbl41
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                return var2_5 * var2_5 * var2_5;
            }
lbl65:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)mc.kbna("kclt", kbmx(int ), (int)495);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                var4_3 /* !! */  = (int)mc.kbna("kclu", kbmx(int ), (int)496);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl75:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)mc.kbna("kclv", kbmx(int ), (int)497);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl80:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)mc.kbna("kclw", kbmx(int ), (int)498);
                if (!var5_2) ** GOTO lbl65
                throw null;
            }
lbl84:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_3 /* !! */  = (int)mc.kbna("kclx", kbmx(int ), (int)499);
                    if (!var5_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)mc.kbna("kcly", kbmx(int ), (int)500);
        ** while (!var5_2)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcoe() {
        mc.kbno[100] = 2315302230567402295L;
        mc.kbno[101] = -3324740646044972987L;
        mc.kbno[102] = 510665869172279629L;
        mc.kbno[103] = -8215293823079851167L;
        mc.kbno[104] = -634732299922995383L;
        mc.kbno[105] = -5597755901212573898L;
        mc.kbno[106] = 4394053275732904935L;
        mc.kbno[107] = -7989810565161140824L;
        mc.kbno[108] = 8571172742246571442L;
        mc.kbno[109] = -1155153641534367042L;
        mc.kbno[110] = -7674892527597513886L;
        mc.kbno[111] = 4738471163821576267L;
        mc.kbno[112] = 9161138061773777339L;
        mc.kbno[113] = -5331008587073551982L;
        mc.kbno[114] = -3268847010982812181L;
        mc.kbno[115] = 2453175893959246041L;
        mc.kbno[116] = -1283296610111092787L;
        mc.kbno[117] = -435298757150283459L;
        mc.kbno[118] = -3220197675337338091L;
        mc.kbno[119] = 8711319276945790243L;
        mc.kbno[120] = -3141676751557280206L;
        mc.kbno[121] = -5249273150700637136L;
        mc.kbno[122] = -2937932851452632994L;
        mc.kbno[123] = 8725912404018712656L;
        mc.kbno[124] = 6129520701372093376L;
        mc.kbno[125] = 8283421933427068730L;
        mc.kbno[126] = 9027852361537703246L;
        mc.kbno[127] = 7396247986578197087L;
        mc.kbno[128] = -4637710376106998500L;
        mc.kbno[129] = -2541653468015844131L;
        mc.kbno[130] = 3824111035173312973L;
        mc.kbno[131] = -5507059354924435448L;
        mc.kbno[132] = 747734367199217053L;
        mc.kbno[133] = -6117203834098687373L;
        mc.kbno[134] = 4191852825155869371L;
        mc.kbno[135] = 6096809939126234330L;
        mc.kbno[136] = -9206484910898923270L;
        mc.kbno[137] = 3884129175695655465L;
        mc.kbno[138] = 9178752076293897041L;
        mc.kbno[139] = -4468611494851973452L;
        mc.kbno[140] = -7098874809931109421L;
        mc.kbno[141] = -6049960133537990122L;
        mc.kbno[142] = -2248613146676166878L;
        mc.kbno[143] = 8163166985596187941L;
        mc.kbno[144] = -2586605290407497018L;
        mc.kbno[145] = -7411336608570785967L;
        mc.kbno[146] = -909284644947841141L;
        mc.kbno[147] = 2544126552975590104L;
        mc.kbno[148] = -3448623760351937592L;
        mc.kbno[149] = -3134663862999892454L;
        mc.kbno[150] = 7446136128688375708L;
        mc.kbno[151] = 3667599274605146998L;
        mc.kbno[152] = -254639470705353117L;
        mc.kbno[153] = -4978069573140651465L;
        mc.kbno[154] = 6775004970445226230L;
        mc.kbno[155] = 7173612427244666636L;
        mc.kbno[156] = 5069946816268509540L;
    }

    private static /* synthetic */ void kcod() {
        mc.kbno[0] = 4630175804192792761L;
        mc.kbno[1] = -8247399504563398872L;
        mc.kbno[2] = 3112212636344454396L;
        mc.kbno[3] = -1621644144878173126L;
        mc.kbno[4] = 7635930478449037462L;
        mc.kbno[5] = -5372318803154168177L;
        mc.kbno[6] = 6349385017103584468L;
        mc.kbno[7] = 3284300119788522405L;
        mc.kbno[8] = -4041404395122801282L;
        mc.kbno[9] = -6952741331364344352L;
        mc.kbno[10] = -3266405499483375434L;
        mc.kbno[11] = 7295840125459762257L;
        mc.kbno[12] = 3529663260617685571L;
        mc.kbno[13] = -3286512731216032305L;
        mc.kbno[14] = 1187777489339821110L;
        mc.kbno[15] = 7433573446469278266L;
        mc.kbno[16] = 799595419318892596L;
        mc.kbno[17] = 1075077187389168840L;
        mc.kbno[18] = 5322605579390102240L;
        mc.kbno[19] = -3113672265356606358L;
        mc.kbno[20] = -7220098147942493699L;
        mc.kbno[21] = 4424807930281578090L;
        mc.kbno[22] = -6244391144443219839L;
        mc.kbno[23] = -816538308387976554L;
        mc.kbno[24] = -9115945180261968248L;
        mc.kbno[25] = 874156677945280200L;
        mc.kbno[26] = 4206580296346017434L;
        mc.kbno[27] = -7453693399212018007L;
        mc.kbno[28] = 4737010552853408325L;
        mc.kbno[29] = -338301332725088920L;
        mc.kbno[30] = 3986112983157472202L;
        mc.kbno[31] = -7265924165156525239L;
        mc.kbno[32] = 6363248769895677039L;
        mc.kbno[33] = -652215438701112354L;
        mc.kbno[34] = 8118028632740999947L;
        mc.kbno[35] = 1922841482817765241L;
        mc.kbno[36] = 6296315222060506640L;
        mc.kbno[37] = 1103041654128266889L;
        mc.kbno[38] = -463084216427714885L;
        mc.kbno[39] = 1417025182048964525L;
        mc.kbno[40] = 6811343562684731686L;
        mc.kbno[41] = -6185307751705094520L;
        mc.kbno[42] = 714767058026795002L;
        mc.kbno[43] = -3763294264617780672L;
        mc.kbno[44] = 201299106874664507L;
        mc.kbno[45] = 3348841716695852051L;
        mc.kbno[46] = -7716995658094676118L;
        mc.kbno[47] = -3709038027901214528L;
        mc.kbno[48] = 6824410742648232822L;
        mc.kbno[49] = -5937529685713986110L;
        mc.kbno[50] = -171057688359698786L;
        mc.kbno[51] = -6895006298435795277L;
        mc.kbno[52] = 7997790975642189107L;
        mc.kbno[53] = 1872146658972574617L;
        mc.kbno[54] = -249210451326687455L;
        mc.kbno[55] = -8755962889747228512L;
        mc.kbno[56] = 2502174878875213679L;
        mc.kbno[57] = 3081473621959856211L;
        mc.kbno[58] = 5822601969240260476L;
        mc.kbno[59] = -4994564414937572688L;
        mc.kbno[60] = -2475379957669339926L;
        mc.kbno[61] = -5382042278256934265L;
        mc.kbno[62] = -8526613899197497793L;
        mc.kbno[63] = 1925350994262553507L;
        mc.kbno[64] = -8641872084236479363L;
        mc.kbno[65] = -1352147373058036094L;
        mc.kbno[66] = -1409959844730598772L;
        mc.kbno[67] = 939642674543580161L;
        mc.kbno[68] = 3730107421439618216L;
        mc.kbno[69] = 111930015889897048L;
        mc.kbno[70] = -5941802879090968488L;
        mc.kbno[71] = -1724556290065819312L;
        mc.kbno[72] = -4486476027189955990L;
        mc.kbno[73] = -909390868765345738L;
        mc.kbno[74] = 8954703891862685029L;
        mc.kbno[75] = -6777983329880589601L;
        mc.kbno[76] = -1754241112268984056L;
        mc.kbno[77] = -6323848035163287542L;
        mc.kbno[78] = 6452779034113843338L;
        mc.kbno[79] = -7642458494458877734L;
        mc.kbno[80] = -4911622998283675475L;
        mc.kbno[81] = 2664359143191760867L;
        mc.kbno[82] = 2147032086938772886L;
        mc.kbno[83] = -8780673028245575032L;
        mc.kbno[84] = 3350217042399908281L;
        mc.kbno[85] = 2966165658201114914L;
        mc.kbno[86] = -9035715357730943232L;
        mc.kbno[87] = -4415529987823192343L;
        mc.kbno[88] = 6960205306028073560L;
        mc.kbno[89] = -5423538490583647094L;
        mc.kbno[90] = -3489912399001579553L;
        mc.kbno[91] = -3224792538920838361L;
        mc.kbno[92] = 3846606932750530432L;
        mc.kbno[93] = 338746101948429218L;
        mc.kbno[94] = 844074611489055737L;
        mc.kbno[95] = 5396184148633844510L;
        mc.kbno[96] = 9066455574014298914L;
        mc.kbno[97] = -5647750582124139884L;
        mc.kbno[98] = -4712452368564512079L;
        mc.kbno[99] = -7419623318972473449L;
    }

    public static /* synthetic */ CallSite kbna(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kcoc() {
        mc.kbnn[100] = 1107473920516612557L;
        mc.kbnn[101] = -6236733357196863321L;
        mc.kbnn[102] = 7439695570363322346L;
        mc.kbnn[103] = 7542520723175542033L;
        mc.kbnn[104] = -2178466050288195774L;
        mc.kbnn[105] = -8443021221405192124L;
        mc.kbnn[106] = 4860798504828699895L;
        mc.kbnn[107] = 5398544631558852685L;
        mc.kbnn[108] = 3713075796420956920L;
        mc.kbnn[109] = -420809402549283576L;
        mc.kbnn[110] = -3591642428062052721L;
        mc.kbnn[111] = -399008779196769241L;
        mc.kbnn[112] = 4979766006559905043L;
        mc.kbnn[113] = -3150087671035013994L;
        mc.kbnn[114] = -1110283637376520162L;
        mc.kbnn[115] = -5003562562525684782L;
        mc.kbnn[116] = -5604493803050821720L;
        mc.kbnn[117] = 2736178982091629845L;
        mc.kbnn[118] = -6235806730439341309L;
        mc.kbnn[119] = -8142180320500363963L;
        mc.kbnn[120] = -4189648612873242350L;
        mc.kbnn[121] = -3279812179586994173L;
        mc.kbnn[122] = -385847210546672028L;
        mc.kbnn[123] = 8507917448693796536L;
        mc.kbnn[124] = 1330765140690243782L;
        mc.kbnn[125] = 2257050406129279029L;
        mc.kbnn[126] = 2457677398655610147L;
        mc.kbnn[127] = 5824514666464821700L;
        mc.kbnn[128] = 7335550939096480181L;
        mc.kbnn[129] = 154935561880119894L;
        mc.kbnn[130] = -3742466103236201552L;
        mc.kbnn[131] = -5496753755368377147L;
        mc.kbnn[132] = -1677539656863055935L;
        mc.kbnn[133] = 293720758122901523L;
        mc.kbnn[134] = 1845781372939638466L;
        mc.kbnn[135] = 8541839584883040701L;
        mc.kbnn[136] = 2285179892893888832L;
        mc.kbnn[137] = 1604293411577676544L;
        mc.kbnn[138] = 1766918597868484012L;
        mc.kbnn[139] = 9068957095394311506L;
        mc.kbnn[140] = 6167760332223247032L;
        mc.kbnn[141] = 950951091641136894L;
        mc.kbnn[142] = 6729497031978376110L;
        mc.kbnn[143] = 2402454473824263255L;
        mc.kbnn[144] = -2534305969299577390L;
        mc.kbnn[145] = 7788869133868240382L;
        mc.kbnn[146] = 3645199387205515819L;
        mc.kbnn[147] = 2685930728802378800L;
        mc.kbnn[148] = -4530357075514754420L;
        mc.kbnn[149] = -5781947328900862038L;
        mc.kbnn[150] = 7064596600981874110L;
        mc.kbnn[151] = -2969781244681109794L;
        mc.kbnn[152] = 3196317395714363324L;
        mc.kbnn[153] = -3130783659914294470L;
        mc.kbnn[154] = -5783437329012815405L;
        mc.kbnn[155] = -2913685244738262433L;
        mc.kbnn[156] = -8736584961122237995L;
    }

    private static /* synthetic */ void kcob() {
        mc.kbnn[0] = -2065264164309318498L;
        mc.kbnn[1] = -6994691999062000446L;
        mc.kbnn[2] = -9010526396969632862L;
        mc.kbnn[3] = -5820594648384975984L;
        mc.kbnn[4] = -4517340515335674270L;
        mc.kbnn[5] = 6204813433261193446L;
        mc.kbnn[6] = -1604527377817231735L;
        mc.kbnn[7] = -1943792534480097362L;
        mc.kbnn[8] = 3169343402295068513L;
        mc.kbnn[9] = 304544203326505793L;
        mc.kbnn[10] = -3266405499483375434L;
        mc.kbnn[11] = 2906680317276232463L;
        mc.kbnn[12] = 6381856518847468923L;
        mc.kbnn[13] = 6992634049135733346L;
        mc.kbnn[14] = 314221258854946211L;
        mc.kbnn[15] = 6354970909585415604L;
        mc.kbnn[16] = 4642533066178473535L;
        mc.kbnn[17] = 4421799565157071422L;
        mc.kbnn[18] = 7472015451990383759L;
        mc.kbnn[19] = -3082772626487229744L;
        mc.kbnn[20] = 2459132452532582326L;
        mc.kbnn[21] = -3587414778632643297L;
        mc.kbnn[22] = 2224462347096886221L;
        mc.kbnn[23] = 3340694313071357891L;
        mc.kbnn[24] = -2527719721670505461L;
        mc.kbnn[25] = -1589391513048022380L;
        mc.kbnn[26] = 3843194901148548964L;
        mc.kbnn[27] = -1951748911086832836L;
        mc.kbnn[28] = -721484833866920760L;
        mc.kbnn[29] = 772109625040609585L;
        mc.kbnn[30] = 7307664083439822199L;
        mc.kbnn[31] = -191527678234498299L;
        mc.kbnn[32] = 4974538712036996263L;
        mc.kbnn[33] = 379091521168274146L;
        mc.kbnn[34] = 9036249633255325885L;
        mc.kbnn[35] = -1892342032077065713L;
        mc.kbnn[36] = 6763392427948209270L;
        mc.kbnn[37] = 1154812972344102882L;
        mc.kbnn[38] = 8181118061995924419L;
        mc.kbnn[39] = 1273413611819721221L;
        mc.kbnn[40] = 7554534900021628530L;
        mc.kbnn[41] = -5062443399000650417L;
        mc.kbnn[42] = 2053817748142027286L;
        mc.kbnn[43] = 2974411984969164856L;
        mc.kbnn[44] = -4130553429173120361L;
        mc.kbnn[45] = -5462646379750203392L;
        mc.kbnn[46] = -2696269865384326709L;
        mc.kbnn[47] = -2427303627679756746L;
        mc.kbnn[48] = 3051644907420068788L;
        mc.kbnn[49] = 4451162637526318603L;
        mc.kbnn[50] = 26290623933746287L;
        mc.kbnn[51] = -6036797809152883109L;
        mc.kbnn[52] = 7376236017951910345L;
        mc.kbnn[53] = 9180850087230420183L;
        mc.kbnn[54] = -2506385159712434506L;
        mc.kbnn[55] = 1635011121900277801L;
        mc.kbnn[56] = 6023091799715407417L;
        mc.kbnn[57] = 6838200279962837507L;
        mc.kbnn[58] = -394869880675766462L;
        mc.kbnn[59] = -9160957396612373569L;
        mc.kbnn[60] = -7459499138486626485L;
        mc.kbnn[61] = -6592766145879282960L;
        mc.kbnn[62] = -8194858346949410606L;
        mc.kbnn[63] = -1831569772642762447L;
        mc.kbnn[64] = -4169396489210818964L;
        mc.kbnn[65] = -5581325552411175811L;
        mc.kbnn[66] = -1776947951925949153L;
        mc.kbnn[67] = 1467313654744676911L;
        mc.kbnn[68] = 6829138995306034136L;
        mc.kbnn[69] = -8867409213514580398L;
        mc.kbnn[70] = 2340093572549892415L;
        mc.kbnn[71] = 5806086798387735540L;
        mc.kbnn[72] = 5223161614817835518L;
        mc.kbnn[73] = -3212620428416334699L;
        mc.kbnn[74] = 1614092116269142014L;
        mc.kbnn[75] = -1206521520709072967L;
        mc.kbnn[76] = -470738763575725036L;
        mc.kbnn[77] = 5942714647357330785L;
        mc.kbnn[78] = -5404411976415058306L;
        mc.kbnn[79] = -7472744185071496457L;
        mc.kbnn[80] = -5294502965678105362L;
        mc.kbnn[81] = -136910252516383537L;
        mc.kbnn[82] = 5710531226973755617L;
        mc.kbnn[83] = 373893568447361109L;
        mc.kbnn[84] = 7441002827492300404L;
        mc.kbnn[85] = -1167240544911771503L;
        mc.kbnn[86] = -1192983116007295722L;
        mc.kbnn[87] = -4697876790951041321L;
        mc.kbnn[88] = -7323640898358964394L;
        mc.kbnn[89] = -5374281105428110825L;
        mc.kbnn[90] = 5555546557761442753L;
        mc.kbnn[91] = -8060307945993119740L;
        mc.kbnn[92] = -8750088797599739545L;
        mc.kbnn[93] = 7590430930142500957L;
        mc.kbnn[94] = 6795596038969932915L;
        mc.kbnn[95] = 5861686404388034520L;
        mc.kbnn[96] = 7836951150183905184L;
        mc.kbnn[97] = 1210393038190676492L;
        mc.kbnn[98] = 5328260416529040579L;
        mc.kbnn[99] = 3565885298188345727L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25419() {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kbxq", kbnm(int ), (int)39));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1069346988: {
                    v1 = mc.kbna("kbxr", kbnm(int ), (int)40);
                    continue block20;
                }
                case -889331953: {
                    v1 = mc.kbna("kbxs", kbnm(int ), (int)41);
                    continue block20;
                }
                case 406365899: {
                    v1 = mc.kbna("kbxt", kbnm(int ), (int)42);
                    continue block20;
                }
                case 1490645056: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = mc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbxu", kbnm(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mc.kbna("kbxv", kbmx(int ), (int)232)) break;
            v2 /* !! */  = (long)mc.kbna("kbxw", kbmx(int ), (int)233);
        }
        var2_2 /* !! */  = mc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kbxx", kbnm(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mc.kbna("kbxy", kbmx(int ), (int)234)) break;
            v3 /* !! */  = (long)mc.kbna("kbxz", kbmx(int ), (int)235);
        }
        var1_3 = mc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl37:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 /* !! */  = mc.sa;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - mc.kbna("kbya", kbnm(int ), (int)45));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1885340141: {
                            v5 = mc.kbna("kbyb", kbnm(int ), (int)46);
                            continue block24;
                        }
                        case -1615937181: {
                            v5 = mc.kbna("kbyc", kbnm(int ), (int)47);
                            continue block24;
                        }
                        case 1490645056: {
                            break block24;
                        }
                        case 1874826998: {
                            v5 = mc.kbna("kbyd", kbnm(int ), (int)48);
                            continue block24;
                        }
                    }
                    break;
                }
                this.startClosing();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl59:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mc.kbna("kbye", kbmx(int ), (int)236);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: {
                var2_2 /* !! */  = (int)mc.kbna("kbyf", kbmx(int ), (int)237);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mc.kbna("kbyg", kbmx(int ), (int)238);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
lbl72:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)mc.kbna("kbyh", kbmx(int ), (int)239);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)mc.kbna("kbyi", kbmx(int ), (int)240);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)mc.kbna("kbyj", kbmx(int ), (int)241);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishClosing() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbzs", kbnm(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mc.kbna("kbzt", kbmx(int ), (int)257)) break;
            v0 /* !! */  = (long)mc.kbna("kbzu", kbmx(int ), (int)258);
        }
        var4_1 = mc.c;
        v1 /* !! */  = mc.sa;
        if (true) ** GOTO lbl12
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - mc.kbna("kbzv", kbnm(int ), (int)69));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1425909569: {
                    v2 = mc.kbna("kbzw", kbnm(int ), (int)70);
                    continue block58;
                }
                case 1490645056: {
                    break block58;
                }
                case 1710032420: {
                    v2 = mc.kbna("kbzx", kbnm(int ), (int)71);
                    continue block58;
                }
            }
            break;
        }
        var3_2 /* !! */  = mc.b;
        v3 /* !! */  = mc.sa;
        if (true) ** GOTO lbl26
        block59: while (true) {
            v3 /* !! */  = (long)(mc.kbna("kbzz", kbnm(int ), (int)73) - mc.kbna("kbzy", kbnm(int ), (int)72));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -737277483: {
                    continue block59;
                }
                case 1490645056: {
                    break block59;
                }
            }
            break;
        }
        var2_3 = mc.a;
        if (var4_1) {
            throw null;
lbl34:
            // 9 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kcaa", kbnm(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mc.kbna("kcab", kbmx(int ), (int)259)) break;
            v4 /* !! */  = (long)mc.kbna("kcac", kbmx(int ), (int)260);
        }
        if (this.field_22787 != null) ** GOTO lbl49
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl34
                return;
            }
lbl49:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl34
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = mc.sa - mc.kbna("kcad", kbnm(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == mc.kbna("kcae", kbmx(int ), (int)261)) break;
                v5 /* !! */  = (long)mc.kbna("kcaf", kbmx(int ), (int)262);
            }
            var1_4 = this.pendingSwapSlot;
            if (var2_3 || var2_3) ** GOTO lbl34
            v6 = mc.kbna("kcag", kbmx(int ), (int)263);
            v7 /* !! */  = mc.sa;
            if (true) ** GOTO lbl63
            block63: while (true) {
                v7 /* !! */  = (long)(v8 - mc.kbna("kcah", kbnm(int ), (int)76));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 305259995: {
                        v8 = mc.kbna("kcai", kbnm(int ), (int)77);
                        continue block63;
                    }
                    case 1490645056: {
                        break block63;
                    }
                    case 1556541484: {
                        v8 = mc.kbna("kcaj", kbnm(int ), (int)78);
                        continue block63;
                    }
                    case 2074686492: {
                        v8 = mc.kbna("kcak", kbnm(int ), (int)79);
                        continue block63;
                    }
                }
                break;
            }
            this.pendingSwapSlot = (int)v6;
            if (var2_3 || var2_3) ** GOTO lbl34
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = mc.sa - mc.kbna("kcal", kbnm(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == mc.kbna("kcam", kbmx(int ), (int)264)) break;
                v9 /* !! */  = (long)mc.kbna("kcan", kbmx(int ), (int)265);
            }
            v10 /* !! */  = mc.sa;
            if (true) ** GOTO lbl87
            block65: while (true) {
                v10 /* !! */  = (long)(v11 - mc.kbna("kcao", kbnm(int ), (int)81));
lbl87:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 170551635: {
                        v11 = mc.kbna("kcap", kbnm(int ), (int)82);
                        continue block65;
                    }
                    case 299549579: {
                        v11 = mc.kbna("kcaq", kbnm(int ), (int)83);
                        continue block65;
                    }
                    case 1490645056: {
                        break block65;
                    }
                    case 1993805958: {
                        v11 = mc.kbna("kcar", kbnm(int ), (int)84);
                        continue block65;
                    }
                }
                break;
            }
            v12 /* !! */  = mc.sa;
            if (true) ** GOTO lbl103
            block66: while (true) {
                v12 /* !! */  = (long)(mc.kbna("kcat", kbnm(int ), (int)86) - mc.kbna("kcas", kbnm(int ), (int)85));
lbl103:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 1251568476: {
                        continue block66;
                    }
                    case 1490645056: {
                        break block66;
                    }
                }
                break;
            }
            this.field_22787.method_1507(this.parent);
            if (var2_3 || var2_3) ** GOTO lbl34
            if (var1_4 < 0) ** GOTO lbl144
            if (var2_3 || var2_3) ** GOTO lbl34
            v13 /* !! */  = mc.sa;
            if (true) ** GOTO lbl116
            block67: while (true) {
                v13 /* !! */  = (long)(v14 - mc.kbna("kcau", kbnm(int ), (int)87));
lbl116:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1022084451: {
                        v14 = mc.kbna("kcav", kbnm(int ), (int)88);
                        continue block67;
                    }
                    case 421565730: {
                        v14 = mc.kbna("kcaw", kbnm(int ), (int)89);
                        continue block67;
                    }
                    case 1490645056: {
                        break block67;
                    }
                }
                break;
            }
            v15 /* !! */  = mc.sa;
            if (true) ** GOTO lbl129
            block68: while (true) {
                v15 /* !! */  = (long)(v16 - mc.kbna("kcax", kbnm(int ), (int)90));
lbl129:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2015717519: {
                        v16 = mc.kbna("kcay", kbnm(int ), (int)91);
                        continue block68;
                    }
                    case -1826172954: {
                        v16 = mc.kbna("kcaz", kbnm(int ), (int)92);
                        continue block68;
                    }
                    case -1634844548: {
                        v16 = mc.kbna("kcba", kbnm(int ), (int)93);
                        continue block68;
                    }
                    case 1490645056: {
                        break block68;
                    }
                }
                break;
            }
            this.autoSwap.swapRingItem(var1_4);
            if (var2_3) ** GOTO lbl34
lbl144:
            // 2 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return;
lbl147:
            // 4 sources

            case 0: {
                var3_2 /* !! */  = (int)mc.kbna("kcbb", kbmx(int ), (int)266);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 1: {
                var3_2 /* !! */  = (int)mc.kbna("kcbc", kbmx(int ), (int)267);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl157:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)mc.kbna("kcbd", kbmx(int ), (int)268);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var3_2 /* !! */  = (int)mc.kbna("kcbe", kbmx(int ), (int)269);
                if (!var4_1) ** GOTO lbl157
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)mc.kbna("kcbf", kbmx(int ), (int)270);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 5: {
                var3_2 /* !! */  = (int)mc.kbna("kcbg", kbmx(int ), (int)271);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 6: {
                do {
                    var3_2 /* !! */  = (int)mc.kbna("kcbh", kbmx(int ), (int)272);
                } while (!var4_1);
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)mc.kbna("kcbi", kbmx(int ), (int)273);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl186:
            // 4 sources

            case 8: {
                do {
                    var3_2 /* !! */  = (int)mc.kbna("kcbj", kbmx(int ), (int)274);
                } while (!var4_1);
                throw null;
            }
lbl191:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)mc.kbna("kcbk", kbmx(int ), (int)275);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)mc.kbna("kcbl", kbmx(int ), (int)276);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 11: {
                var3_2 /* !! */  = (int)mc.kbna("kcbm", kbmx(int ), (int)277);
                if (!var4_1) ** GOTO lbl191
                throw null;
            }
            case 12: {
                var3_2 /* !! */  = (int)mc.kbna("kcbn", kbmx(int ), (int)278);
                if (var4_1) {
                    throw null;
                }
            }
            case 13: {
                var3_2 /* !! */  = (int)mc.kbna("kcbo", kbmx(int ), (int)279);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)mc.kbna("kcbp", kbmx(int ), (int)280);
                if (!var4_1) ** GOTO lbl186
                throw null;
            }
lbl216:
            // 5 sources

            case 15: {
                var3_2 /* !! */  = (int)mc.kbna("kcbq", kbmx(int ), (int)281);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)mc.kbna("kcbr", kbmx(int ), (int)282);
                if (!var4_1) ** GOTO lbl191
                throw null;
            }
lbl224:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)mc.kbna("kcbs", kbmx(int ), (int)283);
                if (!var4_1) ** GOTO lbl186
                throw null;
            }
            case 18: 
        }
        var3_2 /* !! */  = (int)mc.kbna("kcbt", kbmx(int ), (int)284);
        ** while (!var4_1)
lbl231:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float wrappedDegrees(float var1_1) {
        v0 /* !! */  = mc.sa;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - mc.kbna("kcio", kbnm(int ), (int)109));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2113605108: {
                    v1 = mc.kbna("kcip", kbnm(int ), (int)110);
                    continue block26;
                }
                case -750477169: {
                    v1 = mc.kbna("kciq", kbnm(int ), (int)111);
                    continue block26;
                }
                case 1490645056: {
                    break block26;
                }
            }
            break;
        }
        var5_2 = mc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kcir", kbnm(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mc.kbna("kcis", kbmx(int ), (int)446)) break;
            v2 /* !! */  = (long)mc.kbna("kcit", kbmx(int ), (int)447);
        }
        var4_3 /* !! */  = mc.b;
        v3 /* !! */  = mc.sa;
        if (true) ** GOTO lbl26
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - mc.kbna("kciu", kbnm(int ), (int)113));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1501338264: {
                    v4 = mc.kbna("kciv", kbnm(int ), (int)114);
                    continue block28;
                }
                case 356970601: {
                    v4 = mc.kbna("kciw", kbnm(int ), (int)115);
                    continue block28;
                }
                case 1490645056: {
                    break block28;
                }
            }
            break;
        }
        var3_4 = mc.a;
        if (var5_2) {
            throw null;
lbl38:
            // 8 sources

            return (float)mc.kbna("kcix", kbqh(int ), (int)448);
        }
        if (var3_4 || var3_4) ** GOTO lbl38
        var2_5 = var1_1 % mc.kbna("kciy", kbqh(int ), (int)449);
        if (var3_4 || var3_4) ** GOTO lbl38
        if (!(var2_5 > mc.kbna("kciz", kbqh(int ), (int)450))) ** GOTO lbl50
        if (var3_4) ** GOTO lbl38
        var2_5 -= mc.kbna("kcja", kbqh(int ), (int)451);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl38
lbl50:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl38
                if (!(var2_5 < mc.kbna("kcjb", kbqh(int ), (int)452))) ** GOTO lbl55
                if (var3_4) ** GOTO lbl38
                var2_5 += mc.kbna("kcjc", kbqh(int ), (int)453);
                if (var3_4) ** GOTO lbl38
lbl55:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return var2_5;
            }
            case 0: {
                var4_3 /* !! */  = (int)mc.kbna("kcjd", kbmx(int ), (int)454);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl63:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)mc.kbna("kcje", kbmx(int ), (int)455);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 2: {
                var4_3 /* !! */  = (int)mc.kbna("kcjf", kbmx(int ), (int)456);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 3: {
                var4_3 /* !! */  = (int)mc.kbna("kcjg", kbmx(int ), (int)457);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 4: {
                var4_3 /* !! */  = (int)mc.kbna("kcjh", kbmx(int ), (int)458);
                if (!var5_2) ** GOTO lbl63
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)mc.kbna("kcji", kbmx(int ), (int)459);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl87:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)mc.kbna("kcjj", kbmx(int ), (int)460);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl92:
            // 3 sources

            case 7: {
                var4_3 /* !! */  = (int)mc.kbna("kcjk", kbmx(int ), (int)461);
                if (!var5_2) ** GOTO lbl63
                throw null;
            }
lbl96:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)mc.kbna("kcjl", kbmx(int ), (int)462);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 9: {
                var4_3 /* !! */  = (int)mc.kbna("kcjm", kbmx(int ), (int)463);
                if (!var5_2) ** GOTO lbl92
                throw null;
            }
lbl105:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mc.kbna("kcjn", kbmx(int ), (int)464);
                    if (!var5_2) break block10;
                    throw null;
                }
            }
lbl110:
            // 4 sources

            case 11: {
                do {
                    var4_3 /* !! */  = (int)mc.kbna("kcjo", kbmx(int ), (int)465);
                } while (!var5_2);
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)mc.kbna("kcjp", kbmx(int ), (int)466);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
            case 13: 
        }
        var4_3 /* !! */  = (int)mc.kbna("kcjq", kbmx(int ), (int)467);
        ** while (!var5_2)
lbl122:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnr() {
        mc.kbmy[200] = -231803389;
        mc.kbmy[201] = 43994767;
        mc.kbmy[202] = 553110868;
        mc.kbmy[203] = -386704796;
        mc.kbmy[204] = 13693265;
        mc.kbmy[205] = -694438919;
        mc.kbmy[206] = -133618891;
        mc.kbmy[207] = -1645208577;
        mc.kbmy[208] = 2056823253;
        mc.kbmy[209] = 655537658;
        mc.kbmy[210] = -661995111;
        mc.kbmy[211] = -1988198442;
        mc.kbmy[212] = -5164472;
        mc.kbmy[213] = -1278590802;
        mc.kbmy[214] = 1482214088;
        mc.kbmy[215] = -1025217758;
        mc.kbmy[216] = -793040928;
        mc.kbmy[217] = 1507647923;
        mc.kbmy[218] = 317192584;
        mc.kbmy[219] = -1542951674;
        mc.kbmy[220] = -1130466561;
        mc.kbmy[221] = -1957910192;
        mc.kbmy[222] = 573401055;
        mc.kbmy[223] = 866900819;
        mc.kbmy[224] = 1727335177;
        mc.kbmy[225] = -981292999;
        mc.kbmy[226] = 863806973;
        mc.kbmy[227] = -1703704079;
        mc.kbmy[228] = -993810353;
        mc.kbmy[229] = -2025333350;
        mc.kbmy[230] = 1051760825;
        mc.kbmy[231] = 2137378413;
        mc.kbmy[232] = -649181374;
        mc.kbmy[233] = 1300697118;
        mc.kbmy[234] = 894488616;
        mc.kbmy[235] = 639000737;
        mc.kbmy[236] = -671601319;
        mc.kbmy[237] = -603267081;
        mc.kbmy[238] = -821116405;
        mc.kbmy[239] = -1548944980;
        mc.kbmy[240] = 642242633;
        mc.kbmy[241] = -99745336;
        mc.kbmy[242] = -1393992536;
        mc.kbmy[243] = -993909101;
        mc.kbmy[244] = -958877981;
        mc.kbmy[245] = -560152393;
        mc.kbmy[246] = -2077280752;
        mc.kbmy[247] = -841685667;
        mc.kbmy[248] = 800933353;
        mc.kbmy[249] = 644595136;
        mc.kbmy[250] = 1329871904;
        mc.kbmy[251] = -1760845637;
        mc.kbmy[252] = -235029291;
        mc.kbmy[253] = -1286506182;
        mc.kbmy[254] = 640240979;
        mc.kbmy[255] = 2001169462;
        mc.kbmy[256] = -260102348;
        mc.kbmy[257] = 452894288;
        mc.kbmy[258] = -965965224;
        mc.kbmy[259] = -1803494350;
        mc.kbmy[260] = 1319513727;
        mc.kbmy[261] = -38293402;
        mc.kbmy[262] = 531957847;
        mc.kbmy[263] = 1756788119;
        mc.kbmy[264] = 1584371445;
        mc.kbmy[265] = -153850865;
        mc.kbmy[266] = 1442575070;
        mc.kbmy[267] = 1853790168;
        mc.kbmy[268] = 365594020;
        mc.kbmy[269] = -1728946672;
        mc.kbmy[270] = 630074912;
        mc.kbmy[271] = 933501806;
        mc.kbmy[272] = 252248554;
        mc.kbmy[273] = 1189115320;
        mc.kbmy[274] = -1264280198;
        mc.kbmy[275] = -1050880998;
        mc.kbmy[276] = -679695470;
        mc.kbmy[277] = 1640193203;
        mc.kbmy[278] = -1226789011;
        mc.kbmy[279] = 142461007;
        mc.kbmy[280] = 1514343350;
        mc.kbmy[281] = 1980398680;
        mc.kbmy[282] = -919081009;
        mc.kbmy[283] = 1377924971;
        mc.kbmy[284] = 886256863;
        mc.kbmy[285] = 1538491931;
        mc.kbmy[286] = -1505978513;
        mc.kbmy[287] = 564393747;
        mc.kbmy[288] = -140840489;
        mc.kbmy[289] = 1281373993;
        mc.kbmy[290] = 515009302;
        mc.kbmy[291] = 130044882;
        mc.kbmy[292] = -1699680220;
        mc.kbmy[293] = 2071799923;
        mc.kbmy[294] = -364535052;
        mc.kbmy[295] = -440613605;
        mc.kbmy[296] = 1789176575;
        mc.kbmy[297] = -73800752;
        mc.kbmy[298] = 52475872;
        mc.kbmy[299] = 340377563;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25421() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mc.sa - mc.kbna("kbxb", kbnm(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mc.kbna("kbxc", kbmx(int ), (int)222)) break;
            v0 /* !! */  = (long)mc.kbna("kbxd", kbmx(int ), (int)223);
        }
        var3_1 = mc.c;
        v1 /* !! */  = mc.sa;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - mc.kbna("kbxe", kbnm(int ), (int)35));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -634053788: {
                    v2 = mc.kbna("kbxf", kbnm(int ), (int)36);
                    continue block12;
                }
                case -372143785: {
                    v2 = mc.kbna("kbxg", kbnm(int ), (int)37);
                    continue block12;
                }
                case 1490645056: {
                    break block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = mc.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mc.sa - mc.kbna("kbxh", kbnm(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mc.kbna("kbxi", kbmx(int ), (int)224)) break;
                    v3 /* !! */  = (long)mc.kbna("kbxj", kbmx(int ), (int)225);
                }
                var1_3 = mc.a;
                if (var3_1) {
                    throw null;
                    return (boolean)mc.kbna("kbxk", kbmx(int ), (int)226);
                }
                if (var1_3 || var1_3) ** continue;
                return (boolean)mc.kbna("kbxl", kbmx(int ), (int)227);
            }
            case 0: {
                var2_2 /* !! */  = (int)mc.kbna("kbxm", kbmx(int ), (int)228);
                if (!var3_1) break;
                throw null;
            }
lbl42:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mc.kbna("kbxn", kbmx(int ), (int)229);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mc.kbna("kbxo", kbmx(int ), (int)230);
                    if (!var3_1) ** GOTO lbl42
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mc.kbna("kbxp", kbmx(int ), (int)231);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnz() {
        mc.kbmz[400] = 1251862235;
        mc.kbmz[401] = -440897939;
        mc.kbmz[402] = 1648517520;
        mc.kbmz[403] = -305964004;
        mc.kbmz[404] = -1054258160;
        mc.kbmz[405] = -908120075;
        mc.kbmz[406] = -857933178;
        mc.kbmz[407] = -1877137434;
        mc.kbmz[408] = 1265026857;
        mc.kbmz[409] = -579439244;
        mc.kbmz[410] = -699294243;
        mc.kbmz[411] = -267350648;
        mc.kbmz[412] = -1932177905;
        mc.kbmz[413] = -442768999;
        mc.kbmz[414] = 593092837;
        mc.kbmz[415] = -1996121178;
        mc.kbmz[416] = 1830794492;
        mc.kbmz[417] = -2035197796;
        mc.kbmz[418] = 1251243594;
        mc.kbmz[419] = -590698217;
        mc.kbmz[420] = -1845002268;
        mc.kbmz[421] = -730437979;
        mc.kbmz[422] = 495165098;
        mc.kbmz[423] = 1098857453;
        mc.kbmz[424] = -2019109070;
        mc.kbmz[425] = 1709647982;
        mc.kbmz[426] = 313101928;
        mc.kbmz[427] = 1251466418;
        mc.kbmz[428] = -1584360521;
        mc.kbmz[429] = -1752262106;
        mc.kbmz[430] = -408625985;
        mc.kbmz[431] = 422926837;
        mc.kbmz[432] = 1280349663;
        mc.kbmz[433] = 158625944;
        mc.kbmz[434] = 1438404633;
        mc.kbmz[435] = 179191812;
        mc.kbmz[436] = 1077795877;
        mc.kbmz[437] = 1303175308;
        mc.kbmz[438] = 443194273;
        mc.kbmz[439] = 80840954;
        mc.kbmz[440] = -1615655736;
        mc.kbmz[441] = -1676478355;
        mc.kbmz[442] = -982523369;
        mc.kbmz[443] = 1649789179;
        mc.kbmz[444] = 1255761598;
        mc.kbmz[445] = -1927516117;
        mc.kbmz[446] = 455596712;
        mc.kbmz[447] = -1095685115;
        mc.kbmz[448] = 995390507;
        mc.kbmz[449] = 2141913370;
        mc.kbmz[450] = -1066367809;
        mc.kbmz[451] = -1709711301;
        mc.kbmz[452] = -47053333;
        mc.kbmz[453] = -85871211;
        mc.kbmz[454] = -88212478;
        mc.kbmz[455] = -2097875836;
        mc.kbmz[456] = 406982202;
        mc.kbmz[457] = 907047497;
        mc.kbmz[458] = -810343443;
        mc.kbmz[459] = -1237734849;
        mc.kbmz[460] = 2146193491;
        mc.kbmz[461] = 1358084938;
        mc.kbmz[462] = -2126589568;
        mc.kbmz[463] = -276719712;
        mc.kbmz[464] = -352081737;
        mc.kbmz[465] = -308500382;
        mc.kbmz[466] = -1548610234;
        mc.kbmz[467] = 630835364;
        mc.kbmz[468] = 1856741577;
        mc.kbmz[469] = -1697568394;
        mc.kbmz[470] = 1865080173;
        mc.kbmz[471] = 1219622756;
        mc.kbmz[472] = 1640819513;
        mc.kbmz[473] = 666191603;
        mc.kbmz[474] = -1486346247;
        mc.kbmz[475] = 275174334;
        mc.kbmz[476] = -1365073923;
        mc.kbmz[477] = 174640256;
        mc.kbmz[478] = -459705525;
        mc.kbmz[479] = 47295850;
        mc.kbmz[480] = 236085513;
        mc.kbmz[481] = -566500514;
        mc.kbmz[482] = 1276000222;
        mc.kbmz[483] = -1892708096;
        mc.kbmz[484] = 1530103047;
        mc.kbmz[485] = -1597320489;
        mc.kbmz[486] = -760680009;
        mc.kbmz[487] = 183687349;
        mc.kbmz[488] = 637230980;
        mc.kbmz[489] = -1135801161;
        mc.kbmz[490] = 1542231913;
        mc.kbmz[491] = 197602961;
        mc.kbmz[492] = -837560356;
        mc.kbmz[493] = 690775890;
        mc.kbmz[494] = 1546095565;
        mc.kbmz[495] = 2145297174;
        mc.kbmz[496] = 1784442079;
        mc.kbmz[497] = 2027744254;
        mc.kbmz[498] = 1914579973;
        mc.kbmz[499] = -1437016217;
    }

    private static /* synthetic */ long kbnm(int n2) {
        return kbnn[n2] ^ kbno[n2];
    }

    private static /* synthetic */ void kcnq() {
        mc.kbmy[100] = 304701543;
        mc.kbmy[101] = -1616847666;
        mc.kbmy[102] = 2131148358;
        mc.kbmy[103] = 11158667;
        mc.kbmy[104] = 404700959;
        mc.kbmy[105] = -1572628763;
        mc.kbmy[106] = -328096573;
        mc.kbmy[107] = -27082518;
        mc.kbmy[108] = 1767803815;
        mc.kbmy[109] = -1594666077;
        mc.kbmy[110] = -1546014488;
        mc.kbmy[111] = -31071826;
        mc.kbmy[112] = -1877648888;
        mc.kbmy[113] = 1922174927;
        mc.kbmy[114] = 564686492;
        mc.kbmy[115] = 789549399;
        mc.kbmy[116] = 1318419680;
        mc.kbmy[117] = 270338744;
        mc.kbmy[118] = -1964917668;
        mc.kbmy[119] = 1561496787;
        mc.kbmy[120] = 316909975;
        mc.kbmy[121] = -875805041;
        mc.kbmy[122] = -105214300;
        mc.kbmy[123] = -1585401528;
        mc.kbmy[124] = -540738342;
        mc.kbmy[125] = 1096873678;
        mc.kbmy[126] = 1657936493;
        mc.kbmy[127] = -186448557;
        mc.kbmy[128] = 1615311936;
        mc.kbmy[129] = -1514073063;
        mc.kbmy[130] = -1358408736;
        mc.kbmy[131] = 1932750103;
        mc.kbmy[132] = 1832727101;
        mc.kbmy[133] = 1763616367;
        mc.kbmy[134] = 1982331277;
        mc.kbmy[135] = 138684525;
        mc.kbmy[136] = 82353210;
        mc.kbmy[137] = 902659713;
        mc.kbmy[138] = -1756782390;
        mc.kbmy[139] = -2009105179;
        mc.kbmy[140] = 629583687;
        mc.kbmy[141] = -1898812045;
        mc.kbmy[142] = -801607550;
        mc.kbmy[143] = -1578355782;
        mc.kbmy[144] = -2004315205;
        mc.kbmy[145] = 1214459815;
        mc.kbmy[146] = 1954056256;
        mc.kbmy[147] = 873058039;
        mc.kbmy[148] = 1604636784;
        mc.kbmy[149] = -364993763;
        mc.kbmy[150] = -1172684846;
        mc.kbmy[151] = 383882603;
        mc.kbmy[152] = -1149328292;
        mc.kbmy[153] = -1539770532;
        mc.kbmy[154] = 1837413790;
        mc.kbmy[155] = 2102910993;
        mc.kbmy[156] = -1898616423;
        mc.kbmy[157] = -1060115077;
        mc.kbmy[158] = -1592433627;
        mc.kbmy[159] = 1872448145;
        mc.kbmy[160] = -2043492949;
        mc.kbmy[161] = -1671995420;
        mc.kbmy[162] = 840411328;
        mc.kbmy[163] = 1925031055;
        mc.kbmy[164] = 1948764080;
        mc.kbmy[165] = -913400503;
        mc.kbmy[166] = -1014859069;
        mc.kbmy[167] = -2086874258;
        mc.kbmy[168] = 2056667977;
        mc.kbmy[169] = -1435282251;
        mc.kbmy[170] = 67223403;
        mc.kbmy[171] = 1994391292;
        mc.kbmy[172] = -1820001393;
        mc.kbmy[173] = -701555579;
        mc.kbmy[174] = -196873838;
        mc.kbmy[175] = -1519406932;
        mc.kbmy[176] = -1395493909;
        mc.kbmy[177] = -414657338;
        mc.kbmy[178] = 1676677266;
        mc.kbmy[179] = 1399179898;
        mc.kbmy[180] = 1258519257;
        mc.kbmy[181] = 1272111;
        mc.kbmy[182] = -532477154;
        mc.kbmy[183] = -686000754;
        mc.kbmy[184] = 94879704;
        mc.kbmy[185] = 2062006296;
        mc.kbmy[186] = 1991972618;
        mc.kbmy[187] = 2104586864;
        mc.kbmy[188] = 748686680;
        mc.kbmy[189] = -531652097;
        mc.kbmy[190] = -2070237119;
        mc.kbmy[191] = -1585092615;
        mc.kbmy[192] = 1446442593;
        mc.kbmy[193] = -1423670360;
        mc.kbmy[194] = 894577441;
        mc.kbmy[195] = 1468865334;
        mc.kbmy[196] = 1672875237;
        mc.kbmy[197] = 1778623316;
        mc.kbmy[198] = -279309403;
        mc.kbmy[199] = -750473117;
    }

    private static /* synthetic */ void kcnu() {
        mc.kbmy[500] = 1712430612;
        mc.kbmy[501] = 1859648658;
        mc.kbmy[502] = -671440080;
        mc.kbmy[503] = 215336373;
        mc.kbmy[504] = -517617988;
        mc.kbmy[505] = -575286549;
        mc.kbmy[506] = 197727734;
        mc.kbmy[507] = -1902133737;
        mc.kbmy[508] = -1457675742;
        mc.kbmy[509] = 1767593508;
        mc.kbmy[510] = 1218495081;
        mc.kbmy[511] = 1672341706;
        mc.kbmy[512] = -239032927;
        mc.kbmy[513] = -844137103;
        mc.kbmy[514] = 328583902;
        mc.kbmy[515] = -405761373;
        mc.kbmy[516] = -1730015886;
        mc.kbmy[517] = -1494309649;
        mc.kbmy[518] = -2031220201;
        mc.kbmy[519] = -371969679;
        mc.kbmy[520] = 267253536;
        mc.kbmy[521] = -356410127;
        mc.kbmy[522] = -554354165;
        mc.kbmy[523] = -182322379;
        mc.kbmy[524] = -2142669963;
        mc.kbmy[525] = 295171259;
        mc.kbmy[526] = -20361774;
        mc.kbmy[527] = 1187547031;
        mc.kbmy[528] = 1496534140;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean method_25402(class_11909 var1_1, boolean var2_2) {
        block106: {
            block104: {
                block105: {
                    block103: {
                        block102: {
                            block101: {
                                block100: {
                                    var8_3 = mc.c;
                                    var7_4 /* !! */  = mc.b;
                                    var6_5 = mc.a;
                                    if (var8_3) {
                                        throw null;
lbl6:
                                        // 24 sources

                                        return (boolean)mc.kbna("kbur", kbmx(int ), (int)160);
                                    }
                                    if (var6_5 || var6_5) ** GOTO lbl6
                                    if (!this.closing) break block100;
                                    if (var6_5 || var6_5) ** GOTO lbl6
                                    return (boolean)mc.kbna("kbus", kbmx(int ), (int)161);
                                }
                                if (var6_5 || var6_5) ** GOTO lbl6
                                var3_6 = (float)ki.getFixedScaledWidth() / 2.0f;
                                if (var6_5 || var6_5) ** GOTO lbl6
                                var4_7 = (float)ki.getFixedScaledHeight() / 2.0f;
                                if (var6_5 || var6_5) ** GOTO lbl6
                                var5_8 = this.findSector(ki.convertX((float)var1_1.comp_4798()), ki.convertY((float)var1_1.comp_4799()), var3_6, var4_7, (float)(mc.kbna("kbut", kbqh(int ), (int)162) * this.visualScale), (float)(mc.kbna("kbuu", kbqh(int ), (int)163) * this.visualScale));
                                if (var6_5 || var6_5) ** GOTO lbl6
                                if (var5_8 >= 0) break block101;
                                if (var6_5 || var6_5) ** GOTO lbl6
                                return (boolean)mc.kbna("kbuv", kbmx(int ), (int)164);
                            }
                            if (var6_5 || var6_5) ** GOTO lbl6
                            if (var1_1.method_74245() != mc.kbna("kbuw", kbmx(int ), (int)165)) break block102;
                            if (var6_5 || var6_5) ** GOTO lbl6
                            this.autoSwap.clearRingItem(var5_8);
                            if (var6_5 || var6_5) ** GOTO lbl6
                            return (boolean)mc.kbna("kbux", kbmx(int ), (int)166);
                        }
                        if (var6_5 || var6_5) ** GOTO lbl6
                        if (var1_1.method_74245() == 0) break block103;
                        if (var6_5 || var6_5) ** GOTO lbl6
                        return (boolean)mc.kbna("kbuy", kbmx(int ), (int)167);
                    }
                    if (var6_5 || var6_5) ** GOTO lbl6
                    if (!this.autoSwap.getRingItemStack(var5_8).method_7960()) break block104;
                    if (var6_5 || var6_5) ** GOTO lbl6
                    if (this.field_22787 == null) break block105;
                    if (var6_5) ** GOTO lbl6
                    if (this.field_22787.field_1724 == null) break block105;
                    if (var6_5 || var6_5) ** GOTO lbl6
                    this.field_22787.method_1507((class_437)new mb(this.field_22787.field_1724, this.autoSwap, this, var5_8));
                    if (var6_5) ** GOTO lbl6
                }
                if (var6_5 || var6_5) ** GOTO lbl6
                return (boolean)mc.kbna("kbuz", kbmx(int ), (int)168);
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            if (this.autoSwap.hasRingItem(var5_8)) break block106;
            if (var6_5 || var6_5) ** GOTO lbl6
            this.autoSwap.clearRingItem(var5_8);
            if (var6_5 || var6_5) ** GOTO lbl6
            return (boolean)mc.kbna("kbva", kbmx(int ), (int)169);
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        this.pendingSwapSlot = var5_8;
        if (var6_5 || var6_5) ** GOTO lbl6
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.startClosing();
                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return (boolean)mc.kbna("kbvb", kbmx(int ), (int)170);
            }
lbl66:
            // 3 sources

            case 0: {
                var7_4 /* !! */  = (int)mc.kbna("kbvc", kbmx(int ), (int)171);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl71:
            // 2 sources

            case 1: {
                var7_4 /* !! */  = (int)mc.kbna("kbvd", kbmx(int ), (int)172);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: {
                var7_4 /* !! */  = (int)mc.kbna("kbve", kbmx(int ), (int)173);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 3: {
                var7_4 /* !! */  = (int)mc.kbna("kbvf", kbmx(int ), (int)174);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl86:
            // 2 sources

            case 4: {
                var7_4 /* !! */  = (int)mc.kbna("kbvg", kbmx(int ), (int)175);
                if (!var8_3) ** GOTO lbl66
                throw null;
            }
lbl90:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)mc.kbna("kbvh", kbmx(int ), (int)176);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl95:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)mc.kbna("kbvi", kbmx(int ), (int)177);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl100:
            // 3 sources

            case 7: {
                var7_4 /* !! */  = (int)mc.kbna("kbvj", kbmx(int ), (int)178);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl105:
            // 5 sources

            case 8: {
                var7_4 /* !! */  = (int)mc.kbna("kbvk", kbmx(int ), (int)179);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 9: {
                var7_4 /* !! */  = (int)mc.kbna("kbvl", kbmx(int ), (int)180);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 10: {
                var7_4 /* !! */  = (int)mc.kbna("kbvm", kbmx(int ), (int)181);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl120:
            // 2 sources

            case 11: {
                var7_4 /* !! */  = (int)mc.kbna("kbvn", kbmx(int ), (int)182);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl125:
            // 2 sources

            case 12: {
                do {
                    var7_4 /* !! */  = (int)mc.kbna("kbvo", kbmx(int ), (int)183);
                } while (!var8_3);
                throw null;
            }
lbl130:
            // 3 sources

            case 13: {
                var7_4 /* !! */  = (int)mc.kbna("kbvp", kbmx(int ), (int)184);
                if (!var8_3) ** GOTO lbl120
                throw null;
            }
lbl134:
            // 2 sources

            case 14: {
                var7_4 /* !! */  = (int)mc.kbna("kbvq", kbmx(int ), (int)185);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl139:
            // 2 sources

            case 15: {
                var7_4 /* !! */  = (int)mc.kbna("kbvr", kbmx(int ), (int)186);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 16: {
                do {
                    var7_4 /* !! */  = (int)mc.kbna("kbvs", kbmx(int ), (int)187);
                } while (!var8_3);
                throw null;
            }
lbl149:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)mc.kbna("kbvt", kbmx(int ), (int)188);
                    if (!var8_3) ** GOTO lbl125
                    throw null;
                }
            }
lbl154:
            // 3 sources

            case 18: {
                var7_4 /* !! */  = (int)mc.kbna("kbvu", kbmx(int ), (int)189);
                if (!var8_3) ** GOTO lbl105
                throw null;
            }
lbl158:
            // 3 sources

            case 19: {
                var7_4 /* !! */  = (int)mc.kbna("kbvv", kbmx(int ), (int)190);
                if (!var8_3) ** GOTO lbl66
                throw null;
            }
lbl162:
            // 2 sources

            case 20: {
                var7_4 /* !! */  = (int)mc.kbna("kbvw", kbmx(int ), (int)191);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl167:
            // 2 sources

            case 21: {
                var7_4 /* !! */  = (int)mc.kbna("kbvx", kbmx(int ), (int)192);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 22: {
                var7_4 /* !! */  = (int)mc.kbna("kbvy", kbmx(int ), (int)193);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 23: {
                var7_4 /* !! */  = (int)mc.kbna("kbvz", kbmx(int ), (int)194);
                if (!var8_3) ** GOTO lbl167
                throw null;
            }
lbl181:
            // 2 sources

            case 24: {
                var7_4 /* !! */  = (int)mc.kbna("kbwa", kbmx(int ), (int)195);
                if (!var8_3) ** GOTO lbl86
                throw null;
            }
            case 25: {
                var7_4 /* !! */  = (int)mc.kbna("kbwb", kbmx(int ), (int)196);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl190:
            // 3 sources

            case 26: {
                var7_4 /* !! */  = (int)mc.kbna("kbwc", kbmx(int ), (int)197);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 27: {
                var7_4 /* !! */  = (int)mc.kbna("kbwd", kbmx(int ), (int)198);
                if (!var8_3) ** GOTO lbl71
                throw null;
            }
            case 28: {
                var7_4 /* !! */  = (int)mc.kbna("kbwe", kbmx(int ), (int)199);
                if (!var8_3) ** GOTO lbl130
                throw null;
            }
lbl203:
            // 3 sources

            case 29: {
                var7_4 /* !! */  = (int)mc.kbna("kbwf", kbmx(int ), (int)200);
                if (!var8_3) ** GOTO lbl154
                throw null;
            }
            case 30: {
                var7_4 /* !! */  = (int)mc.kbna("kbwg", kbmx(int ), (int)201);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 31: {
                var7_4 /* !! */  = (int)mc.kbna("kbwh", kbmx(int ), (int)202);
                if (!var8_3) break;
                throw null;
            }
            case 32: {
                var7_4 /* !! */  = (int)mc.kbna("kbwi", kbmx(int ), (int)203);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl221:
            // 2 sources

            case 33: {
                var7_4 /* !! */  = (int)mc.kbna("kbwj", kbmx(int ), (int)204);
                if (!var8_3) ** GOTO lbl181
                throw null;
            }
            case 34: {
                var7_4 /* !! */  = (int)mc.kbna("kbwk", kbmx(int ), (int)205);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl230:
            // 2 sources

            case 35: {
                var7_4 /* !! */  = (int)mc.kbna("kbwl", kbmx(int ), (int)206);
                if (!var8_3) ** GOTO lbl105
                throw null;
            }
lbl234:
            // 2 sources

            case 36: {
                var7_4 /* !! */  = (int)mc.kbna("kbwm", kbmx(int ), (int)207);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
            case 37: {
                var7_4 /* !! */  = (int)mc.kbna("kbwn", kbmx(int ), (int)208);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl244:
            // 3 sources

            case 38: {
                var7_4 /* !! */  = (int)mc.kbna("kbwo", kbmx(int ), (int)209);
                if (!var8_3) ** GOTO lbl234
                throw null;
            }
            case 39: {
                var7_4 /* !! */  = (int)mc.kbna("kbwp", kbmx(int ), (int)210);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 40: {
                var7_4 /* !! */  = (int)mc.kbna("kbwq", kbmx(int ), (int)211);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl258:
            // 3 sources

            case 41: {
                var7_4 /* !! */  = (int)mc.kbna("kbwr", kbmx(int ), (int)212);
                if (!var8_3) ** GOTO lbl95
                throw null;
            }
lbl262:
            // 2 sources

            case 42: {
                var7_4 /* !! */  = (int)mc.kbna("kbws", kbmx(int ), (int)213);
                if (!var8_3) ** GOTO lbl105
                throw null;
            }
lbl266:
            // 2 sources

            case 43: {
                var7_4 /* !! */  = (int)mc.kbna("kbwt", kbmx(int ), (int)214);
                if (!var8_3) ** GOTO lbl162
                throw null;
            }
lbl270:
            // 2 sources

            case 44: {
                var7_4 /* !! */  = (int)mc.kbna("kbwu", kbmx(int ), (int)215);
                if (!var8_3) ** GOTO lbl105
                throw null;
            }
lbl274:
            // 2 sources

            case 45: {
                var7_4 /* !! */  = (int)mc.kbna("kbwv", kbmx(int ), (int)216);
                if (!var8_3) ** GOTO lbl203
                throw null;
            }
lbl278:
            // 5 sources

            case 46: {
                var7_4 /* !! */  = (int)mc.kbna("kbww", kbmx(int ), (int)217);
                if (!var8_3) ** GOTO lbl158
                throw null;
            }
lbl282:
            // 2 sources

            case 47: {
                var7_4 /* !! */  = (int)mc.kbna("kbwx", kbmx(int ), (int)218);
                if (!var8_3) ** GOTO lbl154
                throw null;
            }
lbl286:
            // 2 sources

            case 48: {
                var7_4 /* !! */  = (int)mc.kbna("kbwy", kbmx(int ), (int)219);
                if (!var8_3) ** GOTO lbl278
                throw null;
            }
            case 49: {
                var7_4 /* !! */  = (int)mc.kbna("kbwz", kbmx(int ), (int)220);
                if (!var8_3) ** GOTO lbl190
                throw null;
            }
            case 50: 
        }
        var7_4 /* !! */  = (int)mc.kbna("kbxa", kbmx(int ), (int)221);
        ** while (!var8_3)
lbl297:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void kcnx() {
        mc.kbmz[200] = -231803362;
        mc.kbmz[201] = 43994770;
        mc.kbmz[202] = 553110853;
        mc.kbmz[203] = -386704788;
        mc.kbmz[204] = 13693299;
        mc.kbmz[205] = -694438954;
        mc.kbmz[206] = -133618913;
        mc.kbmz[207] = -1645208597;
        mc.kbmz[208] = 2056823243;
        mc.kbmz[209] = 655537632;
        mc.kbmz[210] = -661995083;
        mc.kbmz[211] = -1988198458;
        mc.kbmz[212] = -5164459;
        mc.kbmz[213] = -1278590834;
        mc.kbmz[214] = 1482214127;
        mc.kbmz[215] = -1025217791;
        mc.kbmz[216] = -793040959;
        mc.kbmz[217] = 1507647889;
        mc.kbmz[218] = 317192599;
        mc.kbmz[219] = -1542951636;
        mc.kbmz[220] = -1130466610;
        mc.kbmz[221] = -1957910156;
        mc.kbmz[222] = -573401056;
        mc.kbmz[223] = 1240766684;
        mc.kbmz[224] = 1727335176;
        mc.kbmz[225] = 1730217709;
        mc.kbmz[226] = 863806973;
        mc.kbmz[227] = -1703704079;
        mc.kbmz[228] = -993810353;
        mc.kbmz[229] = -2025333349;
        mc.kbmz[230] = 1051760827;
        mc.kbmz[231] = 2137378415;
        mc.kbmz[232] = 649181373;
        mc.kbmz[233] = 1816501446;
        mc.kbmz[234] = 894488617;
        mc.kbmz[235] = 4324515;
        mc.kbmz[236] = -671601315;
        mc.kbmz[237] = -603267082;
        mc.kbmz[238] = -821116405;
        mc.kbmz[239] = -1548944978;
        mc.kbmz[240] = 642242636;
        mc.kbmz[241] = -99745332;
        mc.kbmz[242] = -1393992535;
        mc.kbmz[243] = 490052892;
        mc.kbmz[244] = -958877982;
        mc.kbmz[245] = -560152394;
        mc.kbmz[246] = -2077280750;
        mc.kbmz[247] = -841685674;
        mc.kbmz[248] = 800933359;
        mc.kbmz[249] = 644595145;
        mc.kbmz[250] = 1329871913;
        mc.kbmz[251] = -1760845646;
        mc.kbmz[252] = -235029284;
        mc.kbmz[253] = -1286506189;
        mc.kbmz[254] = 640240978;
        mc.kbmz[255] = 2001169468;
        mc.kbmz[256] = -260102345;
        mc.kbmz[257] = -452894289;
        mc.kbmz[258] = 1086317975;
        mc.kbmz[259] = 1803494349;
        mc.kbmz[260] = 893052315;
        mc.kbmz[261] = 38293401;
        mc.kbmz[262] = 1690038128;
        mc.kbmz[263] = -1756788120;
        mc.kbmz[264] = -1584371446;
        mc.kbmz[265] = 1673816694;
        mc.kbmz[266] = 1442575058;
        mc.kbmz[267] = 1853790175;
        mc.kbmz[268] = 365594021;
        mc.kbmz[269] = -1728946661;
        mc.kbmz[270] = 630074927;
        mc.kbmz[271] = 933501820;
        mc.kbmz[272] = 252248550;
        mc.kbmz[273] = 1189115318;
        mc.kbmz[274] = -1264280202;
        mc.kbmz[275] = -1050881006;
        mc.kbmz[276] = -679695461;
        mc.kbmz[277] = 1640193185;
        mc.kbmz[278] = -1226789013;
        mc.kbmz[279] = 142460992;
        mc.kbmz[280] = 1514343335;
        mc.kbmz[281] = 1980398677;
        mc.kbmz[282] = -919081017;
        mc.kbmz[283] = 1377924971;
        mc.kbmz[284] = 886256856;
        mc.kbmz[285] = 447972891;
        mc.kbmz[286] = -415983761;
        mc.kbmz[287] = 564393953;
        mc.kbmz[288] = -140840648;
        mc.kbmz[289] = 1281374161;
        mc.kbmz[290] = 515009513;
        mc.kbmz[291] = 130044738;
        mc.kbmz[292] = -1699680093;
        mc.kbmz[293] = 2071800045;
        mc.kbmz[294] = -364535285;
        mc.kbmz[295] = -1510161125;
        mc.kbmz[296] = 711117977;
        mc.kbmz[297] = -73800766;
        mc.kbmz[298] = 52475893;
        mc.kbmz[299] = 340377555;
    }
}

