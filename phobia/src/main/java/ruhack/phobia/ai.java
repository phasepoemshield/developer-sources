/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ai {
    private static long[] cgmt;
    private static final String WHITE = "\u001b[97m";
    public static final int b;
    private static long[] cgms;
    private static int[] cgmy;
    private static final String RED_BG = "\u001b[41m";
    private static final String RESET = "\u001b[0m";
    private static final String BOLD = "\u001b[1m";
    private static int[] cgmx;
    private static final String GREEN_BG = "\u001b[42m";
    public static final boolean a;
    public static final boolean c;
    protected static final long ft = 6032501783190109164L;
    private static final String BLACK = "\u001b[30m";

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void info(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ai.ft - ai.cgmu("cgot", cgmr(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ai.cgmu("cgou", cgmw(int ), (int)34)) break;
            v0 /* !! */  = (long)ai.cgmu("cgov", cgmw(int ), (int)35);
        }
        var3_1 = ai.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ai.ft - ai.cgmu("cgow", cgmr(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ai.cgmu("cgox", cgmw(int ), (int)36)) break;
            v1 /* !! */  = (long)ai.cgmu("cgoy", cgmw(int ), (int)37);
        }
        var2_2 /* !! */  = ai.b;
        v2 /* !! */  = ai.ft;
        if (true) ** GOTO lbl19
        block31: while (true) {
            v2 /* !! */  = (long)(v3 - ai.cgmu("cgoz", cgmr(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 99941356: {
                    break block31;
                }
                case 961726073: {
                    v3 = ai.cgmu("cgpa", cgmr(int ), (int)16);
                    continue block31;
                }
                case 1343441241: {
                    v3 = ai.cgmu("cgpb", cgmr(int ), (int)17);
                    continue block31;
                }
                case 2146742343: {
                    v3 = ai.cgmu("cgpc", cgmr(int ), (int)18);
                    continue block31;
                }
            }
            break;
        }
        var1_3 = ai.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = ai.ft;
                if (true) ** GOTO lbl44
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - ai.cgmu("cgpd", cgmr(int ), (int)19));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1874240359: {
                            v5 = ai.cgmu("cgpe", cgmr(int ), (int)20);
                            continue block33;
                        }
                        case -1093665603: {
                            v5 = ai.cgmu("cgpf", cgmr(int ), (int)21);
                            continue block33;
                        }
                        case 99941356: {
                            break block33;
                        }
                        case 922993060: {
                            v5 = ai.cgmu("cgpg", cgmr(int ), (int)22);
                            continue block33;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ai.ft;
                if (true) ** GOTO lbl60
                block34: while (true) {
                    v6 /* !! */  = (long)(ai.cgmu("cgpi", cgmr(int ), (int)24) - ai.cgmu("cgph", cgmr(int ), (int)23));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 99941356: {
                            break block34;
                        }
                        case 1213503820: {
                            continue block34;
                        }
                    }
                    break;
                }
                v7 = "\u001b[44m\u001b[97m\u001b[1m " + var0 + " \u001b[0m";
                v8 /* !! */  = ai.ft;
                if (true) ** GOTO lbl70
                block35: while (true) {
                    v8 /* !! */  = (long)(v9 - ai.cgmu("cgpj", cgmr(int ), (int)25));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 99941356: {
                            break block35;
                        }
                        case 688573578: {
                            v9 = ai.cgmu("cgpk", cgmr(int ), (int)26);
                            continue block35;
                        }
                        case 891575421: {
                            v9 = ai.cgmu("cgpl", cgmr(int ), (int)27);
                            continue block35;
                        }
                    }
                    break;
                }
                System.out.println(v7);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgpm", cgmw(int ), (int)38);
                } while (!var3_1);
                throw null;
            }
lbl87:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ai.cgmu("cgpn", cgmw(int ), (int)39);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ai.cgmu("cgpo", cgmw(int ), (int)40);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ai.cgmu("cgpp", cgmw(int ), (int)41);
                    if (!var3_1) ** GOTO lbl87
                    throw null;
                }
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgpq", cgmw(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ai.cgmu("cgpr", cgmw(int ), (int)43);
        ** while (!var3_1)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void success(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ai.ft - ai.cgmu("cgmv", cgmr(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ai.cgmu("cgmz", cgmw(int ), (int)0)) break;
            v0 /* !! */  = (long)ai.cgmu("cgna", cgmw(int ), (int)1);
        }
        var3_1 = ai.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ai.ft - ai.cgmu("cgnb", cgmr(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ai.cgmu("cgnc", cgmw(int ), (int)2)) break;
            v1 /* !! */  = (long)ai.cgmu("cgnd", cgmw(int ), (int)3);
        }
        var2_2 /* !! */  = ai.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ai.ft - ai.cgmu("cgne", cgmr(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ai.cgmu("cgnf", cgmw(int ), (int)4)) break;
            v2 /* !! */  = (long)ai.cgmu("cgng", cgmw(int ), (int)5);
        }
        var1_3 = ai.a;
        if (var3_1) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ai.ft;
                if (true) ** GOTO lbl31
                block16: while (true) {
                    v3 /* !! */  = (long)(ai.cgmu("cgni", cgmr(int ), (int)4) - ai.cgmu("cgnh", cgmr(int ), (int)3));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 99941356: {
                            break block16;
                        }
                        case 1324363781: {
                            continue block16;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ai.ft - ai.cgmu("cgnj", cgmr(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ai.cgmu("cgnk", cgmw(int ), (int)6)) break;
                    v4 /* !! */  = (long)ai.cgmu("cgnl", cgmw(int ), (int)7);
                }
                v5 = "\u001b[42m\u001b[30m\u001b[1m " + var0 + " \u001b[0m";
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = ai.ft - ai.cgmu("cgnm", cgmr(int ), (int)6)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ai.cgmu("cgnn", cgmw(int ), (int)8)) break;
                    v6 /* !! */  = (long)ai.cgmu("cgno", cgmw(int ), (int)9);
                }
                System.out.println(v5);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgnp", cgmw(int ), (int)10);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgnq", cgmw(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ai.cgmu("cgnr", cgmw(int ), (int)12);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ai.cgmu("cgns", cgmw(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ai.cgmu("cgnt", cgmw(int ), (int)14);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)ai.cgmu("cgnu", cgmw(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    public ai() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void error(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ai.ft - ai.cgmu("cgnv", cgmr(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ai.cgmu("cgnw", cgmw(int ), (int)16)) break;
            v0 /* !! */  = (long)ai.cgmu("cgnx", cgmw(int ), (int)17);
        }
        var3_1 = ai.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ai.ft - ai.cgmu("cgny", cgmr(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ai.cgmu("cgnz", cgmw(int ), (int)18)) break;
            v1 /* !! */  = (long)ai.cgmu("cgoa", cgmw(int ), (int)19);
        }
        var2_2 /* !! */  = ai.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = ai.ft - ai.cgmu("cgob", cgmr(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ai.cgmu("cgoc", cgmw(int ), (int)20)) break;
                    v2 /* !! */  = (long)ai.cgmu("cgod", cgmw(int ), (int)21);
                }
                var1_3 = ai.a;
                if (var3_1) {
                    throw null;
lbl24:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ai.ft - ai.cgmu("cgoe", cgmr(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ai.cgmu("cgof", cgmw(int ), (int)22)) break;
                    v3 /* !! */  = (long)ai.cgmu("cgog", cgmw(int ), (int)23);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = ai.ft - ai.cgmu("cgoh", cgmr(int ), (int)11)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ai.cgmu("cgoi", cgmw(int ), (int)24)) break;
                    v4 /* !! */  = (long)ai.cgmu("cgoj", cgmw(int ), (int)25);
                }
                v5 = "\u001b[41m\u001b[97m\u001b[1m " + var0 + " \u001b[0m";
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = ai.ft - ai.cgmu("cgok", cgmr(int ), (int)12)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ai.cgmu("cgol", cgmw(int ), (int)26)) break;
                    v6 /* !! */  = (long)ai.cgmu("cgom", cgmw(int ), (int)27);
                }
                System.out.println(v5);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl46:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgon", cgmw(int ), (int)28);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ai.cgmu("cgoo", cgmw(int ), (int)29);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ai.cgmu("cgop", cgmw(int ), (int)30);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
lbl60:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)ai.cgmu("cgoq", cgmw(int ), (int)31);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ai.cgmu("cgor", cgmw(int ), (int)32);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ai.cgmu("cgos", cgmw(int ), (int)33);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cgpu() {
        ai.cgms[0] = -5897070605321577616L;
        ai.cgms[1] = 3637098838102121501L;
        ai.cgms[2] = 6279732920671177489L;
        ai.cgms[3] = 3157504914331364388L;
        ai.cgms[4] = -4139604921773233359L;
        ai.cgms[5] = -3291516550846225806L;
        ai.cgms[6] = -2030385401682816761L;
        ai.cgms[7] = 5302478616385653773L;
        ai.cgms[8] = 9067493407975581307L;
        ai.cgms[9] = 7973598231730746708L;
        ai.cgms[10] = 7259908982782449139L;
        ai.cgms[11] = 4882809070943385353L;
        ai.cgms[12] = 4174382106114443394L;
        ai.cgms[13] = -8619987636783621930L;
        ai.cgms[14] = 964211672698437316L;
        ai.cgms[15] = 7189737938469164770L;
        ai.cgms[16] = 2739043414333892349L;
        ai.cgms[17] = 7276552617015285997L;
        ai.cgms[18] = 2558176386527572192L;
        ai.cgms[19] = 2899076872042604604L;
        ai.cgms[20] = -21305836224028775L;
        ai.cgms[21] = 233292338141368387L;
        ai.cgms[22] = 4452420957087060155L;
        ai.cgms[23] = -6007405548087352697L;
        ai.cgms[24] = -6591843220727181094L;
        ai.cgms[25] = -4013674820032252066L;
        ai.cgms[26] = 7590228906673970032L;
        ai.cgms[27] = 1108654044434946992L;
    }

    static {
        cgmx = new int[44];
        cgmy = new int[44];
        ai.cgps();
        ai.cgpt();
        cgms = new long[28];
        cgmt = new long[28];
        ai.cgpu();
        ai.cgpv();
    }

    private static /* synthetic */ void cgps() {
        ai.cgmx[0] = -2101746534;
        ai.cgmx[1] = 1271145014;
        ai.cgmx[2] = 454286489;
        ai.cgmx[3] = 550777245;
        ai.cgmx[4] = -1368747052;
        ai.cgmx[5] = 1507211006;
        ai.cgmx[6] = -351069760;
        ai.cgmx[7] = -1141608954;
        ai.cgmx[8] = -607117802;
        ai.cgmx[9] = 575893532;
        ai.cgmx[10] = -924980679;
        ai.cgmx[11] = -1264116830;
        ai.cgmx[12] = -146159831;
        ai.cgmx[13] = -1797526172;
        ai.cgmx[14] = -982493486;
        ai.cgmx[15] = 628080309;
        ai.cgmx[16] = 1620306993;
        ai.cgmx[17] = 2056308431;
        ai.cgmx[18] = -1031832454;
        ai.cgmx[19] = -2125171454;
        ai.cgmx[20] = -1157245531;
        ai.cgmx[21] = 625615845;
        ai.cgmx[22] = 749664714;
        ai.cgmx[23] = 1938772089;
        ai.cgmx[24] = -625470191;
        ai.cgmx[25] = 2074529760;
        ai.cgmx[26] = -1963524634;
        ai.cgmx[27] = 615306884;
        ai.cgmx[28] = 188543050;
        ai.cgmx[29] = 1162582078;
        ai.cgmx[30] = -749868900;
        ai.cgmx[31] = -1160582988;
        ai.cgmx[32] = -1888501738;
        ai.cgmx[33] = 930552681;
        ai.cgmx[34] = 143223540;
        ai.cgmx[35] = -1811126532;
        ai.cgmx[36] = 723800666;
        ai.cgmx[37] = 399280259;
        ai.cgmx[38] = 5812761;
        ai.cgmx[39] = -133992451;
        ai.cgmx[40] = 553581236;
        ai.cgmx[41] = -1764608604;
        ai.cgmx[42] = -349660923;
        ai.cgmx[43] = 598057968;
    }

    private static /* synthetic */ void cgpv() {
        ai.cgmt[0] = -7357284775257105862L;
        ai.cgmt[1] = 6065926425377474005L;
        ai.cgmt[2] = -9073445430270243231L;
        ai.cgmt[3] = -5338018654817467233L;
        ai.cgmt[4] = 1342813398151996262L;
        ai.cgmt[5] = 491315809672288881L;
        ai.cgmt[6] = -5780239624687850815L;
        ai.cgmt[7] = 1930644064573632575L;
        ai.cgmt[8] = -1843205144491473955L;
        ai.cgmt[9] = 2560652653516968208L;
        ai.cgmt[10] = -9112687197681985261L;
        ai.cgmt[11] = 4243808189845106569L;
        ai.cgmt[12] = -5072734660995936063L;
        ai.cgmt[13] = 8913185938109245850L;
        ai.cgmt[14] = 3676720565407686036L;
        ai.cgmt[15] = 795649256573848140L;
        ai.cgmt[16] = 2252221266578505762L;
        ai.cgmt[17] = 548778595009923531L;
        ai.cgmt[18] = -7351006235072596338L;
        ai.cgmt[19] = -2720480849435898413L;
        ai.cgmt[20] = 6532707899422049166L;
        ai.cgmt[21] = 2023014301403952523L;
        ai.cgmt[22] = -3533707840768118684L;
        ai.cgmt[23] = 8034705651705469281L;
        ai.cgmt[24] = 7521326545461183136L;
        ai.cgmt[25] = 6307828856329072939L;
        ai.cgmt[26] = 1118077730690140393L;
        ai.cgmt[27] = 8467470530297215119L;
    }

    public static /* synthetic */ CallSite cgmu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long cgmr(int n2) {
        return cgms[n2] ^ cgmt[n2];
    }

    private static /* synthetic */ int cgmw(int n2) {
        return cgmx[n2] ^ cgmy[n2];
    }

    private static /* synthetic */ void cgpt() {
        ai.cgmy[0] = -2101746533;
        ai.cgmy[1] = 1048235461;
        ai.cgmy[2] = -454286490;
        ai.cgmy[3] = 1776592591;
        ai.cgmy[4] = -1368747051;
        ai.cgmy[5] = -539336086;
        ai.cgmy[6] = -351069759;
        ai.cgmy[7] = -610239966;
        ai.cgmy[8] = -607117801;
        ai.cgmy[9] = -1396881142;
        ai.cgmy[10] = -924980678;
        ai.cgmy[11] = -1264116832;
        ai.cgmy[12] = -146159830;
        ai.cgmy[13] = -1797526176;
        ai.cgmy[14] = -982493482;
        ai.cgmy[15] = 628080305;
        ai.cgmy[16] = 1620306992;
        ai.cgmy[17] = 788550600;
        ai.cgmy[18] = -1031832453;
        ai.cgmy[19] = -333770291;
        ai.cgmy[20] = -1157245532;
        ai.cgmy[21] = -1422550554;
        ai.cgmy[22] = 749664715;
        ai.cgmy[23] = -740411179;
        ai.cgmy[24] = 625470190;
        ai.cgmy[25] = 1860786846;
        ai.cgmy[26] = -1963524633;
        ai.cgmy[27] = 730862700;
        ai.cgmy[28] = 188543054;
        ai.cgmy[29] = 1162582074;
        ai.cgmy[30] = -749868904;
        ai.cgmy[31] = -1160582988;
        ai.cgmy[32] = -1888501738;
        ai.cgmy[33] = 930552682;
        ai.cgmy[34] = 143223541;
        ai.cgmy[35] = -1161450309;
        ai.cgmy[36] = 723800667;
        ai.cgmy[37] = 2055195349;
        ai.cgmy[38] = 5812760;
        ai.cgmy[39] = -133992451;
        ai.cgmy[40] = 553581233;
        ai.cgmy[41] = -1764608603;
        ai.cgmy[42] = -349660924;
        ai.cgmy[43] = 598057973;
    }
}

