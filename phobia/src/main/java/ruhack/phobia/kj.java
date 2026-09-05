/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import ruhack.phobia.kk;
import ruhack.phobia.kl;
import ruhack.phobia.km;
import ruhack.phobia.ko;
import ruhack.phobia.kp;
import ruhack.phobia.kr;
import ruhack.phobia.kt;
import ruhack.phobia.kv;
import ruhack.phobia.kw;
import ruhack.phobia.kx;
import ruhack.phobia.ky;
import ruhack.phobia.la;
import ruhack.phobia.lf;
import ruhack.phobia.lg;
import ruhack.phobia.lh;
import ruhack.phobia.li;
import ruhack.phobia.lj;
import ruhack.phobia.lk;
import ruhack.phobia.ll;
import ruhack.phobia.lm;

public class kj {
    private static final List<Runnable> INITIALIZERS;
    public static final boolean a;
    private static int[] ibfs;
    private static long[] ibff;
    private static boolean initialized;
    public static final int b;
    private static int[] ibfr;
    private static long[] ibfg;
    public static final long ph = -2405641292439061456L;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        block122: {
            v0 /* !! */  = kj.ph;
            if (true) ** GOTO lbl5
            block85: while (true) {
                v0 /* !! */  = (long)(v1 - kj.ibfh("ibfi", ibfe(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 202229766: {
                        v1 = kj.ibfh("ibfj", ibfe(int ), (int)1);
                        continue block85;
                    }
                    case 783023146: {
                        v1 = kj.ibfh("ibfk", ibfe(int ), (int)2);
                        continue block85;
                    }
                    case 1168878339: {
                        v1 = kj.ibfh("ibfl", ibfe(int ), (int)3);
                        continue block85;
                    }
                    case 2066250800: {
                        break block85;
                    }
                }
                break;
            }
            var2 = kj.c;
            v2 /* !! */  = kj.ph;
            if (true) ** GOTO lbl22
            block86: while (true) {
                v2 /* !! */  = (long)(v3 - kj.ibfh("ibfm", ibfe(int ), (int)4));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -227096565: {
                        v3 = kj.ibfh("ibfn", ibfe(int ), (int)5);
                        continue block86;
                    }
                    case 1540845427: {
                        v3 = kj.ibfh("ibfo", ibfe(int ), (int)6);
                        continue block86;
                    }
                    case 2066250800: {
                        break block86;
                    }
                }
                break;
            }
            var1_1 /* !! */  = kj.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = kj.ph - kj.ibfh("ibfp", ibfe(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == kj.ibfh("ibft", ibfq(int ), (int)0)) break;
                v4 /* !! */  = (long)kj.ibfh("ibfu", ibfq(int ), (int)1);
            }
            var0_2 = kj.a;
            if (var2) {
                throw null;
lbl40:
                // 11 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            v5 /* !! */  = kj.ph;
            if (true) ** GOTO lbl47
            block89: while (true) {
                v5 /* !! */  = (long)(kj.ibfh("ibfw", ibfe(int ), (int)9) - kj.ibfh("ibfv", ibfe(int ), (int)8));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1724153968: {
                        continue block89;
                    }
                    case 2066250800: {
                        break block89;
                    }
                }
                break;
            }
            if (!kj.initialized) break block122;
            if (var0_2 || var0_2) ** GOTO lbl40
            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl40
        v6 /* !! */  = kj.ph;
        if (true) ** GOTO lbl61
        block90: while (true) {
            v6 /* !! */  = (long)(kj.ibfh("ibfy", ibfe(int ), (int)11) - kj.ibfh("ibfx", ibfe(int ), (int)10));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -89789575: {
                    continue block90;
                }
                case 2066250800: {
                    break block90;
                }
            }
            break;
        }
        lm.shutdown();
        if (var0_2 || var0_2) ** GOTO lbl40
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = kj.ph;
                if (true) ** GOTO lbl75
                block91: while (true) {
                    v7 /* !! */  = (long)(kj.ibfh("ibga", ibfe(int ), (int)13) - kj.ibfh("ibfz", ibfe(int ), (int)12));
lbl75:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -277322457: {
                            continue block91;
                        }
                        case 2066250800: {
                            break block91;
                        }
                    }
                    break;
                }
                kw.shutdown();
                if (var0_2 || var0_2) ** GOTO lbl40
                v8 /* !! */  = kj.ph;
                if (true) ** GOTO lbl86
                block92: while (true) {
                    v8 /* !! */  = (long)(v9 - kj.ibfh("ibgb", ibfe(int ), (int)14));
lbl86:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -66023998: {
                            v9 = kj.ibfh("ibgc", ibfe(int ), (int)15);
                            continue block92;
                        }
                        case 599929653: {
                            v9 = kj.ibfh("ibgd", ibfe(int ), (int)16);
                            continue block92;
                        }
                        case 1002576872: {
                            v9 = kj.ibfh("ibge", ibfe(int ), (int)17);
                            continue block92;
                        }
                        case 2066250800: {
                            break block92;
                        }
                    }
                    break;
                }
                kr.shutdown();
                if (var0_2 || var0_2) ** GOTO lbl40
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = kj.ph - kj.ibfh("ibgf", ibfe(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kj.ibfh("ibgg", ibfq(int ), (int)2)) break;
                    v10 /* !! */  = (long)kj.ibfh("ibgh", ibfq(int ), (int)3);
                }
                kk.shutdown();
                if (var0_2 || var0_2) ** GOTO lbl40
                v11 /* !! */  = kj.ph;
                if (true) ** GOTO lbl111
                block94: while (true) {
                    v11 /* !! */  = (long)(kj.ibfh("ibgj", ibfe(int ), (int)20) - kj.ibfh("ibgi", ibfe(int ), (int)19));
lbl111:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1769821450: {
                            continue block94;
                        }
                        case 2066250800: {
                            break block94;
                        }
                    }
                    break;
                }
                kx.shutdown();
                if (var0_2 || var0_2) ** GOTO lbl40
                v12 /* !! */  = kj.ph;
                if (true) ** GOTO lbl122
                block95: while (true) {
                    v12 /* !! */  = (long)(v13 - kj.ibfh("ibgk", ibfe(int ), (int)21));
lbl122:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1220921269: {
                            v13 = kj.ibfh("ibgl", ibfe(int ), (int)22);
                            continue block95;
                        }
                        case -123321382: {
                            v13 = kj.ibfh("ibgm", ibfe(int ), (int)23);
                            continue block95;
                        }
                        case 948806592: {
                            v13 = kj.ibfh("ibgn", ibfe(int ), (int)24);
                            continue block95;
                        }
                        case 2066250800: {
                            break block95;
                        }
                    }
                    break;
                }
                lh.shutdown();
                if (var0_2 || var0_2) ** GOTO lbl40
                v14 /* !! */  = kj.ph;
                if (true) ** GOTO lbl140
                block96: while (true) {
                    v14 /* !! */  = (long)(v15 - kj.ibfh("ibgo", ibfe(int ), (int)25));
lbl140:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -480295058: {
                            v15 = kj.ibfh("ibgp", ibfe(int ), (int)26);
                            continue block96;
                        }
                        case -388526362: {
                            v15 = kj.ibfh("ibgq", ibfe(int ), (int)27);
                            continue block96;
                        }
                        case 405629124: {
                            v15 = kj.ibfh("ibgr", ibfe(int ), (int)28);
                            continue block96;
                        }
                        case 2066250800: {
                            break block96;
                        }
                    }
                    break;
                }
                v16 /* !! */  = kj.ph;
                if (true) ** GOTO lbl156
                block97: while (true) {
                    v16 /* !! */  = (long)(kj.ibfh("ibgt", ibfe(int ), (int)30) - kj.ibfh("ibgs", ibfe(int ), (int)29));
lbl156:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 554338637: {
                            continue block97;
                        }
                        case 2066250800: {
                            break block97;
                        }
                    }
                    break;
                }
                v17 = (Consumer<Runnable>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, run(), (Ljava/lang/Runnable;)V)();
                v18 /* !! */  = kj.ph;
                if (true) ** GOTO lbl166
                block98: while (true) {
                    v18 /* !! */  = (long)(v19 - kj.ibfh("ibgu", ibfe(int ), (int)31));
lbl166:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 23941066: {
                            v19 = kj.ibfh("ibgv", ibfe(int ), (int)32);
                            continue block98;
                        }
                        case 245646278: {
                            v19 = kj.ibfh("ibgw", ibfe(int ), (int)33);
                            continue block98;
                        }
                        case 2066250800: {
                            break block98;
                        }
                    }
                    break;
                }
                kj.INITIALIZERS.forEach(v17);
                if (var0_2 || var0_2) ** GOTO lbl40
                v20 = kj.ibfh("ibgx", ibfq(int ), (int)4);
                v21 /* !! */  = kj.ph;
                if (true) ** GOTO lbl182
                block99: while (true) {
                    v21 /* !! */  = (long)(kj.ibfh("ibgz", ibfe(int ), (int)35) - kj.ibfh("ibgy", ibfe(int ), (int)34));
lbl182:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -621081253: {
                            continue block99;
                        }
                        case 2066250800: {
                            break block99;
                        }
                    }
                    break;
                }
                kj.initialized = v20;
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl190:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)kj.ibfh("ibha", ibfq(int ), (int)5);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl195:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhb", ibfq(int ), (int)6);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl200:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhc", ibfq(int ), (int)7);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl205:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhd", ibfq(int ), (int)8);
                if (!var2) ** GOTO lbl195
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhe", ibfq(int ), (int)9);
                if (!var2) ** GOTO lbl190
                throw null;
            }
lbl213:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhf", ibfq(int ), (int)10);
                if (!var2) break;
                throw null;
            }
lbl217:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhg", ibfq(int ), (int)11);
                if (!var2) ** GOTO lbl190
                throw null;
            }
lbl221:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhh", ibfq(int ), (int)12);
                if (!var2) ** GOTO lbl217
                throw null;
            }
lbl225:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhi", ibfq(int ), (int)13);
                if (var2) {
                    throw null;
                }
            }
lbl229:
            // 4 sources

            case 9: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhj", ibfq(int ), (int)14);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl234:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kj.ibfh("ibhk", ibfq(int ), (int)15);
                    if (!var2) ** GOTO lbl205
                    throw null;
                }
            }
lbl239:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhl", ibfq(int ), (int)16);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 12: {
                do {
                    var1_1 /* !! */  = (int)kj.ibfh("ibhm", ibfq(int ), (int)17);
                } while (!var2);
                throw null;
            }
            case 13: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhn", ibfq(int ), (int)18);
                if (!var2) ** GOTO lbl221
                throw null;
            }
lbl253:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)kj.ibfh("ibho", ibfq(int ), (int)19);
                if (!var2) ** GOTO lbl217
                throw null;
            }
lbl257:
            // 3 sources

            case 15: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhp", ibfq(int ), (int)20);
                if (!var2) ** GOTO lbl200
                throw null;
            }
lbl261:
            // 2 sources

            case 16: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhq", ibfq(int ), (int)21);
                if (!var2) ** GOTO lbl253
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhr", ibfq(int ), (int)22);
                if (!var2) ** GOTO lbl257
                throw null;
            }
            case 18: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhs", ibfq(int ), (int)23);
                if (!var2) ** GOTO lbl213
                throw null;
            }
            case 19: {
                var1_1 /* !! */  = (int)kj.ibfh("ibht", ibfq(int ), (int)24);
                if (!var2) ** GOTO lbl234
                throw null;
            }
lbl277:
            // 3 sources

            case 20: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhu", ibfq(int ), (int)25);
                if (!var2) ** GOTO lbl225
                throw null;
            }
            case 21: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhv", ibfq(int ), (int)26);
                if (!var2) ** GOTO lbl277
                throw null;
            }
lbl285:
            // 2 sources

            case 22: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhw", ibfq(int ), (int)27);
                if (!var2) ** GOTO lbl229
                throw null;
            }
            case 23: {
                var1_1 /* !! */  = (int)kj.ibfh("ibhx", ibfq(int ), (int)28);
                if (!var2) ** GOTO lbl190
                throw null;
            }
            case 24: 
        }
        var1_1 /* !! */  = (int)kj.ibfh("ibhy", ibfq(int ), (int)29);
        ** while (!var2)
lbl296:
        // 1 sources

        throw null;
    }

    public kj() {
    }

    private static /* synthetic */ void ibiq() {
        kj.ibfs[0] = 3591496;
        kj.ibfs[1] = -346981993;
        kj.ibfs[2] = 1322411669;
        kj.ibfs[3] = -938346216;
        kj.ibfs[4] = -1494521346;
        kj.ibfs[5] = -1556967916;
        kj.ibfs[6] = 817105634;
        kj.ibfs[7] = 1156749366;
        kj.ibfs[8] = 292707029;
        kj.ibfs[9] = -235286515;
        kj.ibfs[10] = 802268798;
        kj.ibfs[11] = 844839776;
        kj.ibfs[12] = -1390654874;
        kj.ibfs[13] = 747118388;
        kj.ibfs[14] = -1530521964;
        kj.ibfs[15] = -1156202922;
        kj.ibfs[16] = -817657865;
        kj.ibfs[17] = 548778293;
        kj.ibfs[18] = 109750537;
        kj.ibfs[19] = -590580843;
        kj.ibfs[20] = 538013573;
        kj.ibfs[21] = -1511609361;
        kj.ibfs[22] = 998728545;
        kj.ibfs[23] = 1101597049;
        kj.ibfs[24] = 1872550770;
        kj.ibfs[25] = 583708962;
        kj.ibfs[26] = -2053818786;
        kj.ibfs[27] = -1965433069;
        kj.ibfs[28] = 1180023500;
        kj.ibfs[29] = 853340519;
        kj.ibfs[30] = 516150455;
        kj.ibfs[31] = 219103787;
        kj.ibfs[32] = 1488345887;
        kj.ibfs[33] = 1559214801;
        kj.ibfs[34] = 1354223945;
        kj.ibfs[35] = -1052840290;
        kj.ibfs[36] = -2087470288;
        kj.ibfs[37] = -1770788104;
        kj.ibfs[38] = -795326332;
        kj.ibfs[39] = -1085163020;
    }

    private static /* synthetic */ int ibfq(int n2) {
        return ibfr[n2] ^ ibfs[n2];
    }

    private static /* synthetic */ void ibis() {
        kj.ibfg[0] = -8717279063883564680L;
        kj.ibfg[1] = 842778946385653280L;
        kj.ibfg[2] = -5836320929341978614L;
        kj.ibfg[3] = -5336645117393697572L;
        kj.ibfg[4] = 3532007175439356804L;
        kj.ibfg[5] = 8799366060196340676L;
        kj.ibfg[6] = -3154681574153674965L;
        kj.ibfg[7] = 1059354349019860595L;
        kj.ibfg[8] = 9016554908566171177L;
        kj.ibfg[9] = 5054630060229645990L;
        kj.ibfg[10] = -3991195095497441568L;
        kj.ibfg[11] = 2590211015919817908L;
        kj.ibfg[12] = -5958107091646383711L;
        kj.ibfg[13] = 4525759946493059336L;
        kj.ibfg[14] = 8909970858895364115L;
        kj.ibfg[15] = 8727566487739461520L;
        kj.ibfg[16] = 7513399546243468628L;
        kj.ibfg[17] = -1203461938841060911L;
        kj.ibfg[18] = 4768305876239806475L;
        kj.ibfg[19] = 3981386898622779837L;
        kj.ibfg[20] = 2833286218523332597L;
        kj.ibfg[21] = 7123216899170676576L;
        kj.ibfg[22] = -3516724225101015319L;
        kj.ibfg[23] = 3743517241593046829L;
        kj.ibfg[24] = -8640435676882403234L;
        kj.ibfg[25] = 1103060187311538106L;
        kj.ibfg[26] = -8366873849823213609L;
        kj.ibfg[27] = -2881405534794249145L;
        kj.ibfg[28] = 2673400219961614439L;
        kj.ibfg[29] = -8349305147252800937L;
        kj.ibfg[30] = -8816403847713434009L;
        kj.ibfg[31] = -3010571842789649278L;
        kj.ibfg[32] = -7969379132534286238L;
        kj.ibfg[33] = 3269390727769679497L;
        kj.ibfg[34] = 3682004217246297113L;
        kj.ibfg[35] = 606418779418485168L;
        kj.ibfg[36] = 1980818493781004863L;
        kj.ibfg[37] = -2838033210676479392L;
        kj.ibfg[38] = 5046414508900702964L;
        kj.ibfg[39] = 7695704803038442543L;
        kj.ibfg[40] = -9061102532676352035L;
        kj.ibfg[41] = 2415811940492738340L;
    }

    private static /* synthetic */ void ibip() {
        kj.ibfr[0] = -3591497;
        kj.ibfr[1] = -1338525461;
        kj.ibfr[2] = -1322411670;
        kj.ibfr[3] = -964261490;
        kj.ibfr[4] = -1494521345;
        kj.ibfr[5] = -1556967908;
        kj.ibfr[6] = 817105648;
        kj.ibfr[7] = 1156749364;
        kj.ibfr[8] = 292707037;
        kj.ibfr[9] = -235286503;
        kj.ibfr[10] = 802268795;
        kj.ibfr[11] = 844839791;
        kj.ibfr[12] = -1390654877;
        kj.ibfr[13] = 747118375;
        kj.ibfr[14] = -1530521962;
        kj.ibfr[15] = -1156202939;
        kj.ibfr[16] = -817657859;
        kj.ibfr[17] = 548778292;
        kj.ibfr[18] = 109750529;
        kj.ibfr[19] = -590580848;
        kj.ibfr[20] = 538013591;
        kj.ibfr[21] = -1511609375;
        kj.ibfr[22] = 998728552;
        kj.ibfr[23] = 1101597054;
        kj.ibfr[24] = 1872550757;
        kj.ibfr[25] = 583708978;
        kj.ibfr[26] = -2053818797;
        kj.ibfr[27] = -1965433059;
        kj.ibfr[28] = 1180023508;
        kj.ibfr[29] = 853340527;
        kj.ibfr[30] = 516150454;
        kj.ibfr[31] = 1778827392;
        kj.ibfr[32] = 1488345886;
        kj.ibfr[33] = -1559214802;
        kj.ibfr[34] = 1254162317;
        kj.ibfr[35] = -1052840292;
        kj.ibfr[36] = -2087470286;
        kj.ibfr[37] = -1770788102;
        kj.ibfr[38] = -795326331;
        kj.ibfr[39] = -1085163020;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isInitialized() {
        v0 /* !! */  = kj.ph;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(kj.ibfh("ibia", ibfe(int ), (int)37) - kj.ibfh("ibhz", ibfe(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1397986526: {
                    continue block14;
                }
                case 2066250800: {
                    break block14;
                }
            }
            break;
        }
        var2 = kj.c;
        v1 /* !! */  = kj.ph;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(kj.ibfh("ibic", ibfe(int ), (int)39) - kj.ibfh("ibib", ibfe(int ), (int)38));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 941309697: {
                    continue block15;
                }
                case 2066250800: {
                    break block15;
                }
            }
            break;
        }
        var1_1 /* !! */  = kj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kj.ph - kj.ibfh("ibid", ibfe(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kj.ibfh("ibie", ibfq(int ), (int)30)) break;
            v2 /* !! */  = (long)kj.ibfh("ibif", ibfq(int ), (int)31);
        }
        var0_2 = kj.a;
        if (var2) {
            throw null;
lbl30:
            // 1 sources

            return (boolean)kj.ibfh("ibig", ibfq(int ), (int)32);
        }
        ** while (var0_2 || var0_2)
lbl33:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = kj.ph - kj.ibfh("ibih", ibfe(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == kj.ibfh("ibii", ibfq(int ), (int)33)) break;
                    v3 /* !! */  = (long)kj.ibfh("ibij", ibfq(int ), (int)34);
                }
                return kj.initialized;
            }
            case 0: {
                var1_1 /* !! */  = (int)kj.ibfh("ibik", ibfq(int ), (int)35);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl52
            }
            case 1: {
                var1_1 /* !! */  = (int)kj.ibfh("ibil", ibfq(int ), (int)36);
                if (!var2) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)kj.ibfh("ibim", ibfq(int ), (int)37);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kj.ibfh("ibin", ibfq(int ), (int)38);
        ** while (!var2)
lbl60:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite ibfh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        ibfr = new int[40];
        ibfs = new int[40];
        kj.ibip();
        kj.ibiq();
        ibff = new long[42];
        ibfg = new long[42];
        kj.ibir();
        kj.ibis();
        INITIALIZERS = new ArrayList<Runnable>();
        initialized = kj.ibfh("ibio", ibfq(int ), (int)39);
        INITIALIZERS.add(lg::init);
        INITIALIZERS.add(lf::init);
        INITIALIZERS.add(km::init);
        INITIALIZERS.add(kk::init);
        INITIALIZERS.add(kl::init);
        INITIALIZERS.add(lm::init);
        INITIALIZERS.add(kw::init);
        INITIALIZERS.add(ky::init);
        INITIALIZERS.add(lk::init);
        INITIALIZERS.add(lj::init);
        INITIALIZERS.add(kr::init);
        INITIALIZERS.add(kt::init);
        INITIALIZERS.add(kv::init);
        INITIALIZERS.add(kx::init);
        INITIALIZERS.add(ko::init);
        INITIALIZERS.add(kp::init);
        INITIALIZERS.add(la::init);
        INITIALIZERS.add(li::init);
        INITIALIZERS.add(lh::init);
        INITIALIZERS.add(ll::init);
    }

    private static /* synthetic */ long ibfe(int n2) {
        return ibff[n2] ^ ibfg[n2];
    }

    private static /* synthetic */ void ibir() {
        kj.ibff[0] = 2853242888224379106L;
        kj.ibff[1] = -9087219205368557323L;
        kj.ibff[2] = 5304973180942762880L;
        kj.ibff[3] = -4323704372298720080L;
        kj.ibff[4] = 4436882602069402496L;
        kj.ibff[5] = 1873957912974067066L;
        kj.ibff[6] = -2656990075872774302L;
        kj.ibff[7] = 9215584560775248537L;
        kj.ibff[8] = 2691262688794076621L;
        kj.ibff[9] = 2099788638858063459L;
        kj.ibff[10] = -2791808775710846417L;
        kj.ibff[11] = 6919580536065329717L;
        kj.ibff[12] = 4841179456487743500L;
        kj.ibff[13] = 3580840790429213376L;
        kj.ibff[14] = -3903901493188651433L;
        kj.ibff[15] = 853921103171504434L;
        kj.ibff[16] = -7763314311658535018L;
        kj.ibff[17] = -2442813481007253171L;
        kj.ibff[18] = -6528892225093777297L;
        kj.ibff[19] = 8863714572555104861L;
        kj.ibff[20] = -1820301251834458050L;
        kj.ibff[21] = -2569705672041548414L;
        kj.ibff[22] = 3360594602085689844L;
        kj.ibff[23] = 5357377062779619037L;
        kj.ibff[24] = -169463696065477004L;
        kj.ibff[25] = -156741865378747656L;
        kj.ibff[26] = 1187126266115175169L;
        kj.ibff[27] = -6634688235109855403L;
        kj.ibff[28] = -4153175534296160275L;
        kj.ibff[29] = -7080418355071616426L;
        kj.ibff[30] = 2858181772821281452L;
        kj.ibff[31] = 8338757089282509380L;
        kj.ibff[32] = 1298142618901284821L;
        kj.ibff[33] = -7320696901998214589L;
        kj.ibff[34] = -9005080617310624563L;
        kj.ibff[35] = 7831182234407813146L;
        kj.ibff[36] = -1659152811796912613L;
        kj.ibff[37] = 7664328366420815647L;
        kj.ibff[38] = -5374120038202875343L;
        kj.ibff[39] = 7992931218044292940L;
        kj.ibff[40] = 5608158594922234881L;
        kj.ibff[41] = -4522027437358389458L;
    }
}

