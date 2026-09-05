/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.nj;

public class gr
extends ds {
    public static final boolean a;
    private static long[] czir;
    private static long[] czis;
    public static final int b;
    public static final boolean c;
    private static int[] czii;
    static final long gw = 202386780786916545L;
    private static int[] czih;
    private final kb noSword;

    static {
        czih = new int[51];
        czii = new int[51];
        gr.czmh();
        gr.czmi();
        czir = new long[47];
        czis = new long[47];
        gr.czmj();
        gr.czmk();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldIgnoreEntityTrace() {
        block105: {
            block104: {
                block103: {
                    v0 /* !! */  = gr.gw;
                    if (true) ** GOTO lbl5
                    block66: while (true) {
                        v0 /* !! */  = (long)(v1 - gr.czij("czjl", cziq(int ), (int)14));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case 594530244: {
                                v1 = gr.czij("czjm", cziq(int ), (int)15);
                                continue block66;
                            }
                            case 1616788813: {
                                v1 = gr.czij("czjn", cziq(int ), (int)16);
                                continue block66;
                            }
                            case 1879702721: {
                                break block66;
                            }
                        }
                        break;
                    }
                    var5_1 = gr.c;
                    v2 /* !! */  = gr.gw;
                    if (true) ** GOTO lbl19
                    block67: while (true) {
                        v2 /* !! */  = (long)(gr.czij("czjp", cziq(int ), (int)18) - gr.czij("czjo", cziq(int ), (int)17));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -526790497: {
                                continue block67;
                            }
                            case 1879702721: {
                                break block67;
                            }
                        }
                        break;
                    }
                    var4_2 /* !! */  = gr.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_0 = gr.gw - gr.czij("czjq", cziq(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == gr.czij("czjr", czig(int ), (int)10)) break;
                        v3 /* !! */  = (long)gr.czij("czjs", czig(int ), (int)11);
                    }
                    var3_3 = gr.a;
                    if (var5_1) {
                        throw null;
lbl33:
                        // 11 sources

                        return (boolean)gr.czij("czjt", czig(int ), (int)12);
                    }
                    if (var3_3 || var3_3) ** GOTO lbl33
                    v4 /* !! */  = gr.gw;
                    if (true) ** GOTO lbl40
                    block70: while (true) {
                        v4 /* !! */  = (long)(v5 - gr.czij("czju", cziq(int ), (int)20));
lbl40:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -2144126941: {
                                v5 = gr.czij("czjv", cziq(int ), (int)21);
                                continue block70;
                            }
                            case -99859905: {
                                v5 = gr.czij("czjw", cziq(int ), (int)22);
                                continue block70;
                            }
                            case 1879702721: {
                                break block70;
                            }
                        }
                        break;
                    }
                    if (!this.isState()) break block103;
                    if (var3_3) ** GOTO lbl33
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_1 = gr.gw - gr.czij("czjx", cziq(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == gr.czij("czjy", czig(int ), (int)13)) break;
                        v6 /* !! */  = (long)gr.czij("czjz", czig(int ), (int)14);
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_2 = gr.gw - gr.czij("czka", cziq(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == gr.czij("czkb", czig(int ), (int)15)) break;
                        v7 /* !! */  = (long)gr.czij("czkc", czig(int ), (int)16);
                    }
                    if (gr.mc.field_1724 != null) break block104;
                    if (var3_3) ** GOTO lbl33
                }
                if (var3_3 || var3_3) ** GOTO lbl33
                return (boolean)gr.czij("czkd", czig(int ), (int)17);
            }
            if (var3_3 || var3_3) ** GOTO lbl33
            v8 /* !! */  = gr.gw;
            if (true) ** GOTO lbl72
            block73: while (true) {
                v8 /* !! */  = (long)(v9 - gr.czij("czke", cziq(int ), (int)25));
lbl72:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -848133231: {
                        v9 = gr.czij("czkf", cziq(int ), (int)26);
                        continue block73;
                    }
                    case -817456788: {
                        v9 = gr.czij("czkg", cziq(int ), (int)27);
                        continue block73;
                    }
                    case 974742856: {
                        v9 = gr.czij("czkh", cziq(int ), (int)28);
                        continue block73;
                    }
                    case 1879702721: {
                        break block73;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = gr.gw - gr.czij("czki", cziq(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gr.czij("czkj", czig(int ), (int)18)) break;
                v10 /* !! */  = (long)gr.czij("czkk", czig(int ), (int)19);
            }
            if (this.noSword.isValue()) break block105;
            if (var3_3) ** GOTO lbl33
            return (boolean)gr.czij("czkl", czig(int ), (int)20);
        }
        if (var3_3 || var3_3) ** GOTO lbl33
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = gr.gw - gr.czij("czkm", cziq(int ), (int)30)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gr.czij("czkn", czig(int ), (int)21)) break;
            v11 /* !! */  = (long)gr.czij("czko", czig(int ), (int)22);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = gr.gw - gr.czij("czkp", cziq(int ), (int)31)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gr.czij("czkq", czig(int ), (int)23)) break;
            v12 /* !! */  = (long)gr.czij("czkr", czig(int ), (int)24);
        }
        v13 = gr.mc.field_1724;
        v14 /* !! */  = gr.gw;
        if (true) ** GOTO lbl109
        block77: while (true) {
            v14 /* !! */  = (long)(v15 - gr.czij("czks", cziq(int ), (int)32));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -216536339: {
                    v15 = gr.czij("czkt", cziq(int ), (int)33);
                    continue block77;
                }
                case 608253142: {
                    v15 = gr.czij("czku", cziq(int ), (int)34);
                    continue block77;
                }
                case 1879702721: {
                    break block77;
                }
            }
            break;
        }
        var1_4 = v13.method_6047();
        if (var3_3 || var3_3) ** GOTO lbl33
        v16 /* !! */  = gr.gw;
        if (true) ** GOTO lbl124
        block78: while (true) {
            v16 /* !! */  = (long)(v17 - gr.czij("czkv", cziq(int ), (int)35));
lbl124:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -760994045: {
                    v17 = gr.czij("czkw", cziq(int ), (int)36);
                    continue block78;
                }
                case -104680662: {
                    v17 = gr.czij("czkx", cziq(int ), (int)37);
                    continue block78;
                }
                case 667231362: {
                    v17 = gr.czij("czky", cziq(int ), (int)38);
                    continue block78;
                }
                case 1879702721: {
                    break block78;
                }
            }
            break;
        }
        v18 = var1_4.method_7909();
        v19 /* !! */  = gr.gw;
        if (true) ** GOTO lbl141
        block79: while (true) {
            v19 /* !! */  = (long)(v20 - gr.czij("czkz", cziq(int ), (int)39));
lbl141:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -1403863837: {
                    v20 = gr.czij("czla", cziq(int ), (int)40);
                    continue block79;
                }
                case -63452480: {
                    v20 = gr.czij("czlb", cziq(int ), (int)41);
                    continue block79;
                }
                case 1879702721: {
                    break block79;
                }
            }
            break;
        }
        v21 = v18.method_7876();
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = gr.gw - gr.czij("czlc", cziq(int ), (int)42)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == gr.czij("czld", czig(int ), (int)25)) break;
            v22 /* !! */  = (long)gr.czij("czle", czig(int ), (int)26);
        }
        var2_5 = v21.toLowerCase();
        if (var3_3 || var3_3) ** GOTO lbl33
        v23 /* !! */  = gr.gw;
        if (true) ** GOTO lbl162
        block81: while (true) {
            v23 /* !! */  = (long)(v24 - gr.czij("czlf", cziq(int ), (int)43));
lbl162:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1494888366: {
                    v24 = gr.czij("czlg", cziq(int ), (int)44);
                    continue block81;
                }
                case -874608583: {
                    v24 = gr.czij("czlh", cziq(int ), (int)45);
                    continue block81;
                }
                case -36123703: {
                    v24 = gr.czij("czli", cziq(int ), (int)46);
                    continue block81;
                }
                case 1879702721: {
                    break block81;
                }
            }
            break;
        }
        if (var2_5.contains("sword")) ** GOTO lbl183
        if (var3_3) ** GOTO lbl33
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v25 = gr.czij("czlj", czig(int ), (int)27);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl183:
            // 1 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v25 = gr.czij("czlk", czig(int ), (int)28);
lbl186:
            // 2 sources

            return (boolean)v25;
lbl187:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)gr.czij("czll", czig(int ), (int)29);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl192:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)gr.czij("czlm", czig(int ), (int)30);
                if (var5_1) {
                    throw null;
                }
            }
lbl196:
            // 4 sources

            case 2: {
                var4_2 /* !! */  = (int)gr.czij("czln", czig(int ), (int)31);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl201:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)gr.czij("czlo", czig(int ), (int)32);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 4: {
                var4_2 /* !! */  = (int)gr.czij("czlp", czig(int ), (int)33);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 5: {
                var4_2 /* !! */  = (int)gr.czij("czlq", czig(int ), (int)34);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl216:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)gr.czij("czlr", czig(int ), (int)35);
                if (!var5_1) ** GOTO lbl192
                throw null;
            }
lbl220:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)gr.czij("czls", czig(int ), (int)36);
                if (!var5_1) ** GOTO lbl201
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)gr.czij("czlt", czig(int ), (int)37);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl229:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)gr.czij("czlu", czig(int ), (int)38);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 10: {
                var4_2 /* !! */  = (int)gr.czij("czlv", czig(int ), (int)39);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl239:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)gr.czij("czlw", czig(int ), (int)40);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 12: {
                var4_2 /* !! */  = (int)gr.czij("czlx", czig(int ), (int)41);
                if (!var5_1) ** GOTO lbl201
                throw null;
            }
lbl248:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)gr.czij("czly", czig(int ), (int)42);
                if (!var5_1) ** GOTO lbl220
                throw null;
            }
lbl252:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)gr.czij("czlz", czig(int ), (int)43);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl257:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gr.czij("czma", czig(int ), (int)44);
                if (!var5_1) ** GOTO lbl216
                throw null;
            }
lbl261:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)gr.czij("czmb", czig(int ), (int)45);
                if (!var5_1) ** GOTO lbl216
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)gr.czij("czmc", czig(int ), (int)46);
                if (!var5_1) ** GOTO lbl187
                throw null;
            }
lbl269:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)gr.czij("czmd", czig(int ), (int)47);
                if (!var5_1) ** GOTO lbl187
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gr.czij("czme", czig(int ), (int)48);
                    if (!var5_1) ** GOTO lbl196
                    throw null;
                }
            }
lbl278:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)gr.czij("czmf", czig(int ), (int)49);
                if (!var5_1) ** GOTO lbl229
                throw null;
            }
            case 21: 
        }
        var4_2 /* !! */  = (int)gr.czij("czmg", czig(int ), (int)50);
        ** while (!var5_1)
lbl285:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void czmj() {
        gr.czir[0] = -6684398144807768706L;
        gr.czir[1] = -4443054077727399220L;
        gr.czir[2] = 3995975998639050930L;
        gr.czir[3] = -8600914656925608092L;
        gr.czir[4] = 8048859399121149413L;
        gr.czir[5] = -8806766223678951211L;
        gr.czir[6] = 4187380893123745761L;
        gr.czir[7] = -6645624165189647328L;
        gr.czir[8] = 680182553933194596L;
        gr.czir[9] = -8845262897264434783L;
        gr.czir[10] = 4961950660289478499L;
        gr.czir[11] = -8570711769485186298L;
        gr.czir[12] = -5288431649474173660L;
        gr.czir[13] = -3916736111832352708L;
        gr.czir[14] = 5629651312636036635L;
        gr.czir[15] = -2373511395788476558L;
        gr.czir[16] = 5043709087285586682L;
        gr.czir[17] = -6380763051303650322L;
        gr.czir[18] = -1103766205793806187L;
        gr.czir[19] = -6406417662835084251L;
        gr.czir[20] = -2279523739375102665L;
        gr.czir[21] = -7328990521931748341L;
        gr.czir[22] = 5978726361763142828L;
        gr.czir[23] = 2896434704049490873L;
        gr.czir[24] = 4822137224089859177L;
        gr.czir[25] = 4008657950270625214L;
        gr.czir[26] = -1312360057899375203L;
        gr.czir[27] = 2217126523227362830L;
        gr.czir[28] = -5531788738530895870L;
        gr.czir[29] = 5644676665075410986L;
        gr.czir[30] = 8753638737402465400L;
        gr.czir[31] = 5891761584459903716L;
        gr.czir[32] = -6247740673843181645L;
        gr.czir[33] = -2693655533559308730L;
        gr.czir[34] = 5615070744864405449L;
        gr.czir[35] = 859610674300560221L;
        gr.czir[36] = -1062087220522803271L;
        gr.czir[37] = -4423791318404857792L;
        gr.czir[38] = -99006048630252411L;
        gr.czir[39] = -6680086928974749493L;
        gr.czir[40] = 954073448301589161L;
        gr.czir[41] = 9124449446769691295L;
        gr.czir[42] = 2701401918371436274L;
        gr.czir[43] = 3696066600190404349L;
        gr.czir[44] = 5870580204892317134L;
        gr.czir[45] = 7430310897794531980L;
        gr.czir[46] = 5190499944445524614L;
    }

    private static /* synthetic */ void czmi() {
        gr.czii[0] = -1689531667;
        gr.czii[1] = -768338660;
        gr.czii[2] = 723447852;
        gr.czii[3] = 1620456280;
        gr.czii[4] = -1972713611;
        gr.czii[5] = -1634749854;
        gr.czii[6] = 2029150124;
        gr.czii[7] = -859156263;
        gr.czii[8] = -1082323876;
        gr.czii[9] = -985630707;
        gr.czii[10] = 1004733356;
        gr.czii[11] = 702130448;
        gr.czii[12] = 1228659164;
        gr.czii[13] = 401153077;
        gr.czii[14] = -730153739;
        gr.czii[15] = 20890977;
        gr.czii[16] = 349284270;
        gr.czii[17] = -1177834670;
        gr.czii[18] = -2142507005;
        gr.czii[19] = 432145181;
        gr.czii[20] = 0x5888F58;
        gr.czii[21] = -1090060292;
        gr.czii[22] = -2067700302;
        gr.czii[23] = 666149209;
        gr.czii[24] = 2055609098;
        gr.czii[25] = -601220848;
        gr.czii[26] = -1272204348;
        gr.czii[27] = 579175339;
        gr.czii[28] = -1127449997;
        gr.czii[29] = 1816589636;
        gr.czii[30] = -1028243479;
        gr.czii[31] = 853160126;
        gr.czii[32] = -1217458535;
        gr.czii[33] = 80010777;
        gr.czii[34] = -594974673;
        gr.czii[35] = -357621486;
        gr.czii[36] = -63981734;
        gr.czii[37] = 815702730;
        gr.czii[38] = -816678592;
        gr.czii[39] = -1728426738;
        gr.czii[40] = -1456348830;
        gr.czii[41] = 632204723;
        gr.czii[42] = -2037047325;
        gr.czii[43] = 707293146;
        gr.czii[44] = 1022408775;
        gr.czii[45] = -740769246;
        gr.czii[46] = -39868646;
        gr.czii[47] = 829238286;
        gr.czii[48] = 2085125938;
        gr.czii[49] = 735580713;
        gr.czii[50] = -2074690721;
    }

    private static /* synthetic */ int czig(int n2) {
        return czih[n2] ^ czii[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gr getInstance() {
        v0 /* !! */  = gr.gw;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - gr.czij("czit", cziq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -24558089: {
                    v1 = gr.czij("cziu", cziq(int ), (int)1);
                    continue block28;
                }
                case 993111036: {
                    v1 = gr.czij("cziv", cziq(int ), (int)2);
                    continue block28;
                }
                case 1879702721: {
                    break block28;
                }
                case 2103356632: {
                    v1 = gr.czij("cziw", cziq(int ), (int)3);
                    continue block28;
                }
            }
            break;
        }
        var2 = gr.c;
        v2 /* !! */  = gr.gw;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(gr.czij("cziy", cziq(int ), (int)5) - gr.czij("czix", cziq(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -510077128: {
                    continue block29;
                }
                case 1879702721: {
                    break block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = gr.b;
        v3 /* !! */  = gr.gw;
        if (true) ** GOTO lbl32
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - gr.czij("cziz", cziq(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -627484968: {
                    v4 = gr.czij("czja", cziq(int ), (int)7);
                    continue block30;
                }
                case -317490142: {
                    v4 = gr.czij("czjb", cziq(int ), (int)8);
                    continue block30;
                }
                case 208142077: {
                    v4 = gr.czij("czjc", cziq(int ), (int)9);
                    continue block30;
                }
                case 1879702721: {
                    break block30;
                }
            }
            break;
        }
        var0_2 = gr.a;
        if (var2) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl47
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v5 /* !! */  = gr.gw;
                if (true) ** GOTO lbl58
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - gr.czij("czjd", cziq(int ), (int)10));
lbl58:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1663436334: {
                            v6 = gr.czij("czje", cziq(int ), (int)11);
                            continue block32;
                        }
                        case 165223460: {
                            v6 = gr.czij("czjf", cziq(int ), (int)12);
                            continue block32;
                        }
                        case 1879702721: {
                            break block32;
                        }
                        case 1917227321: {
                            v6 = gr.czij("czjg", cziq(int ), (int)13);
                            continue block32;
                        }
                    }
                    break;
                }
                return nj.get(gr.class);
            }
lbl71:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)gr.czij("czjh", czig(int ), (int)6);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)gr.czij("czji", czig(int ), (int)7);
                if (!var2) ** GOTO lbl71
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)gr.czij("czjj", czig(int ), (int)8);
                    if (!var2) break block16;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gr.czij("czjk", czig(int ), (int)9);
        ** while (!var2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long cziq(int n2) {
        return czir[n2] ^ czis[n2];
    }

    private static /* synthetic */ void czmk() {
        gr.czis[0] = 3230870380955734726L;
        gr.czis[1] = -1378349616413363532L;
        gr.czis[2] = -6742510016666548237L;
        gr.czis[3] = 7769258294507753221L;
        gr.czis[4] = -3387950566422536437L;
        gr.czis[5] = -2252750955481665235L;
        gr.czis[6] = 3181131487920716688L;
        gr.czis[7] = 4265078824950371104L;
        gr.czis[8] = -8803338222289720139L;
        gr.czis[9] = -3876438546163081886L;
        gr.czis[10] = 9001908383029080812L;
        gr.czis[11] = 892416369913084090L;
        gr.czis[12] = -1186684307045938499L;
        gr.czis[13] = 9181566109516449573L;
        gr.czis[14] = -584042132212984977L;
        gr.czis[15] = -4190721451007824966L;
        gr.czis[16] = 1997952574796260541L;
        gr.czis[17] = 7170887089758935560L;
        gr.czis[18] = 757941153962263273L;
        gr.czis[19] = -7052240280846143398L;
        gr.czis[20] = -2881781709593096325L;
        gr.czis[21] = 1655105430904981523L;
        gr.czis[22] = -3822592146400354025L;
        gr.czis[23] = -2881087829857161716L;
        gr.czis[24] = -7636654874685739514L;
        gr.czis[25] = 7788474657216063560L;
        gr.czis[26] = 7959648524015675188L;
        gr.czis[27] = -234795555797330307L;
        gr.czis[28] = -2137710119317993448L;
        gr.czis[29] = 8332325748627948486L;
        gr.czis[30] = 7169147931738283875L;
        gr.czis[31] = -7834485853690696049L;
        gr.czis[32] = 3746738232256051389L;
        gr.czis[33] = -3971754463883287611L;
        gr.czis[34] = 8960826799636229506L;
        gr.czis[35] = -8029247982683396332L;
        gr.czis[36] = -4919565252421317445L;
        gr.czis[37] = 941569710826272634L;
        gr.czis[38] = -524925290425959248L;
        gr.czis[39] = -5525808455451226229L;
        gr.czis[40] = -4230531907155779979L;
        gr.czis[41] = -8631741407503165707L;
        gr.czis[42] = 2053990409749283987L;
        gr.czis[43] = 7781452634717843432L;
        gr.czis[44] = 6837915842862033889L;
        gr.czis[45] = -5999952771107817781L;
        gr.czis[46] = -5737948437957305637L;
    }

    public static /* synthetic */ CallSite czij(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public gr() {
        var2_1 /* !! */  = gr.b;
        super("NoEntityTrace", "No Entity Trace", du.PLAYER);
        this.noSword = new kb("\u0412\u044b\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u0441 \u043c\u0435\u0447\u043e\u043c", "\u041d\u0435 \u0434\u0430\u0435\u0442 \u0431\u0438\u0442\u044c \u0441\u043a\u0432\u043e\u0437\u044c \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c \u0435\u0441\u043b\u0438 \u0432 \u0440\u0443\u043a\u0435 \u043c\u0435\u0447").setValue((boolean)gr.czij("czik", czig(int ), (int)0));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.noSword});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)gr.czij("czil", czig(int ), (int)1);
            }
            case 2: {
                ** GOTO lbl15
            }
            case 4: {
                var2_1 /* !! */  = (int)gr.czij("czip", czig(int ), (int)5);
lbl15:
                // 2 sources

                var2_1 /* !! */  = (int)gr.czij("czin", czig(int ), (int)3);
            }
            case 3: {
                var2_1 /* !! */  = (int)gr.czij("czio", czig(int ), (int)4);
            }
            case 1: 
        }
        while (true) {
            var2_1 /* !! */  = (int)gr.czij("czim", czig(int ), (int)2);
        }
    }

    private static /* synthetic */ void czmh() {
        gr.czih[0] = -1689531668;
        gr.czih[1] = -768338658;
        gr.czih[2] = 723447855;
        gr.czih[3] = 1620456281;
        gr.czih[4] = -1972713609;
        gr.czih[5] = -1634749850;
        gr.czih[6] = 2029150127;
        gr.czih[7] = -859156264;
        gr.czih[8] = -1082323874;
        gr.czih[9] = -985630707;
        gr.czih[10] = -1004733357;
        gr.czih[11] = -831467882;
        gr.czih[12] = 1228659165;
        gr.czih[13] = 401153076;
        gr.czih[14] = -529051937;
        gr.czih[15] = 20890976;
        gr.czih[16] = 1260095075;
        gr.czih[17] = -1177834670;
        gr.czih[18] = 2142507004;
        gr.czih[19] = -1063730386;
        gr.czih[20] = 92835673;
        gr.czih[21] = 1090060291;
        gr.czih[22] = -1839975511;
        gr.czih[23] = 666149208;
        gr.czih[24] = -1466822735;
        gr.czih[25] = 601220847;
        gr.czih[26] = 1211854868;
        gr.czih[27] = 579175338;
        gr.czih[28] = -1127449997;
        gr.czih[29] = 1816589654;
        gr.czih[30] = -1028243478;
        gr.czih[31] = 853160111;
        gr.czih[32] = -1217458537;
        gr.czih[33] = 80010777;
        gr.czih[34] = -594974675;
        gr.czih[35] = -357621475;
        gr.czih[36] = -63981749;
        gr.czih[37] = 815702747;
        gr.czih[38] = -816678578;
        gr.czih[39] = -1728426744;
        gr.czih[40] = -1456348815;
        gr.czih[41] = 632204724;
        gr.czih[42] = -2037047321;
        gr.czih[43] = 707293145;
        gr.czih[44] = 1022408781;
        gr.czih[45] = -740769229;
        gr.czih[46] = -39868657;
        gr.czih[47] = 829238302;
        gr.czih[48] = 2085125939;
        gr.czih[49] = 735580708;
        gr.czih[50] = -2074690730;
    }
}

