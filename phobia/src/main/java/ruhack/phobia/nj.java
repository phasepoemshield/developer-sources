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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import ruhack.phobia.d;
import ruhack.phobia.ds;

public final class nj {
    public static final boolean a;
    private static int[] hgpc;
    private static long[] hgox;
    public static final boolean c;
    protected static final long oi = 7421092302239055880L;
    private static long[] hgoy;
    private static final ConcurrentMap<Class<? extends ds>, ds> instanceModules;
    private static int[] hgpd;
    public static final int b;

    private static /* synthetic */ void hgsa() {
        nj.hgpd[0] = -66443727;
        nj.hgpd[1] = 1423602924;
        nj.hgpd[2] = 1294334412;
        nj.hgpd[3] = 1010852608;
        nj.hgpd[4] = 655254475;
        nj.hgpd[5] = -1497982242;
        nj.hgpd[6] = -1094348709;
        nj.hgpd[7] = -1694677357;
        nj.hgpd[8] = 1248213375;
        nj.hgpd[9] = 1730172329;
        nj.hgpd[10] = 1292652382;
        nj.hgpd[11] = -1172142300;
        nj.hgpd[12] = 1765133084;
        nj.hgpd[13] = -1251973133;
        nj.hgpd[14] = -1398024198;
        nj.hgpd[15] = -618010720;
        nj.hgpd[16] = -1303229116;
        nj.hgpd[17] = 1126070369;
        nj.hgpd[18] = -337233270;
        nj.hgpd[19] = -356902902;
        nj.hgpd[20] = -582799371;
        nj.hgpd[21] = -26002000;
        nj.hgpd[22] = 1427475580;
        nj.hgpd[23] = -446792623;
        nj.hgpd[24] = -1967694491;
        nj.hgpd[25] = 1822129390;
        nj.hgpd[26] = 311650812;
        nj.hgpd[27] = -895715198;
        nj.hgpd[28] = -465157835;
        nj.hgpd[29] = 482123655;
        nj.hgpd[30] = -14113138;
        nj.hgpd[31] = -751404609;
        nj.hgpd[32] = 1963690776;
        nj.hgpd[33] = -738060415;
        nj.hgpd[34] = -84004827;
        nj.hgpd[35] = 614930939;
        nj.hgpd[36] = 844986839;
    }

    private static /* synthetic */ long hgow(int n2) {
        return hgox[n2] ^ hgoy[n2];
    }

    private static /* synthetic */ void hgsb() {
        nj.hgox[0] = -2857086127479223401L;
        nj.hgox[1] = -1181674209542957123L;
        nj.hgox[2] = -1298827555666856415L;
        nj.hgox[3] = 8326224115981654359L;
        nj.hgox[4] = -7763693315652606145L;
        nj.hgox[5] = -5602701334718174927L;
        nj.hgox[6] = -4077738781333115721L;
        nj.hgox[7] = 796905394884534040L;
        nj.hgox[8] = 5637895561310719355L;
        nj.hgox[9] = -4667418279512521905L;
        nj.hgox[10] = -7676863257663754842L;
        nj.hgox[11] = 438611592221312664L;
        nj.hgox[12] = 1026618660931582817L;
        nj.hgox[13] = -7125571953341287297L;
        nj.hgox[14] = -6678862515162511649L;
        nj.hgox[15] = -5340591429946262136L;
        nj.hgox[16] = -601405632768761028L;
        nj.hgox[17] = -4852186377051857839L;
        nj.hgox[18] = -4075049251031929237L;
        nj.hgox[19] = 3257369409799820124L;
        nj.hgox[20] = 4655661286298543906L;
        nj.hgox[21] = 2864583897384431983L;
        nj.hgox[22] = 1174298720121611115L;
        nj.hgox[23] = 4390239440742115609L;
        nj.hgox[24] = 9097252010884868914L;
        nj.hgox[25] = -4992587874117822763L;
        nj.hgox[26] = 610981080226049114L;
        nj.hgox[27] = -999265959838562231L;
        nj.hgox[28] = -3632551114092774583L;
        nj.hgox[29] = -3155845401500328414L;
        nj.hgox[30] = 7076413383262771100L;
        nj.hgox[31] = 2459914071350631247L;
        nj.hgox[32] = -9179734812798022012L;
        nj.hgox[33] = 1162137767000209712L;
        nj.hgox[34] = 5045174053748031168L;
        nj.hgox[35] = 3339527993988511319L;
        nj.hgox[36] = -5591244364310392491L;
    }

    static {
        hgpc = new int[37];
        hgpd = new int[37];
        nj.hgrz();
        nj.hgsa();
        hgox = new long[37];
        hgoy = new long[37];
        nj.hgsb();
        nj.hgsc();
        instanceModules = new ConcurrentHashMap<Class<? extends ds>, ds>();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ds lambda$get$0(Class var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nj.oi - nj.hgoz("hgrc", hgow(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nj.hgoz("hgrd", hgpb(int ), (int)23)) break;
            v0 /* !! */  = (long)nj.hgoz("hgre", hgpb(int ), (int)24);
        }
        var3_1 = nj.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nj.oi - nj.hgoz("hgrf", hgow(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nj.hgoz("hgrg", hgpb(int ), (int)25)) break;
            v1 /* !! */  = (long)nj.hgoz("hgrh", hgpb(int ), (int)26);
        }
        var2_2 /* !! */  = nj.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nj.oi - nj.hgoz("hgri", hgow(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nj.hgoz("hgrj", hgpb(int ), (int)27)) break;
            v2 /* !! */  = (long)nj.hgoz("hgrk", hgpb(int ), (int)28);
        }
        var1_3 = nj.a;
        if (!var3_1) ** GOTO lbl25
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = nj.oi - nj.hgoz("hgrl", hgow(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nj.hgoz("hgrm", hgpb(int ), (int)29)) break;
                    v3 /* !! */  = (long)nj.hgoz("hgrn", hgpb(int ), (int)30);
                }
                v4 = d.getInstance();
                v5 /* !! */  = nj.oi;
                if (true) ** GOTO lbl36
                block19: while (true) {
                    v5 /* !! */  = (long)(nj.hgoz("hgrp", hgow(int ), (int)33) - nj.hgoz("hgro", hgow(int ), (int)32));
lbl36:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1149853924: {
                            continue block19;
                        }
                        case 1482178568: {
                            break block19;
                        }
                    }
                    break;
                }
                v6 = v4.getManager();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = nj.oi - nj.hgoz("hgrq", hgow(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nj.hgoz("hgrr", hgpb(int ), (int)31)) break;
                    v7 /* !! */  = (long)nj.hgoz("hgrs", hgpb(int ), (int)32);
                }
                v8 = v6.getModuleProvider();
                v9 /* !! */  = nj.oi;
                if (true) ** GOTO lbl52
                block21: while (true) {
                    v9 /* !! */  = (long)(nj.hgoz("hgru", hgow(int ), (int)36) - nj.hgoz("hgrt", hgow(int ), (int)35));
lbl52:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1679424552: {
                            continue block21;
                        }
                        case 1482178568: {
                            break block21;
                        }
                    }
                    break;
                }
                return v8.get(var0);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nj.hgoz("hgrv", hgpb(int ), (int)33);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl68
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)nj.hgoz("hgrw", hgpb(int ), (int)34);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl68:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)nj.hgoz("hgrx", hgpb(int ), (int)35);
                    if (!var3_1) break block17;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nj.hgoz("hgry", hgpb(int ), (int)36);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hgsc() {
        nj.hgoy[0] = -8395044690601271648L;
        nj.hgoy[1] = 8773552237765190949L;
        nj.hgoy[2] = 3063863559826849413L;
        nj.hgoy[3] = 7359404354024640L;
        nj.hgoy[4] = 4828459748282103563L;
        nj.hgoy[5] = 340113636883522580L;
        nj.hgoy[6] = -3176976573384915247L;
        nj.hgoy[7] = -4825318023367070126L;
        nj.hgoy[8] = 8135772123583776223L;
        nj.hgoy[9] = 7131808457558830388L;
        nj.hgoy[10] = 8192922244501566803L;
        nj.hgoy[11] = 4538114040430492166L;
        nj.hgoy[12] = 5597664923232953001L;
        nj.hgoy[13] = 3130924853775099558L;
        nj.hgoy[14] = 7114224301873651312L;
        nj.hgoy[15] = -295446332689765429L;
        nj.hgoy[16] = 3815140273430054864L;
        nj.hgoy[17] = -5704537741025303536L;
        nj.hgoy[18] = 6261663255449955126L;
        nj.hgoy[19] = 1942722435666002476L;
        nj.hgoy[20] = 1699439925224427295L;
        nj.hgoy[21] = 4462918544740882243L;
        nj.hgoy[22] = 2400834785687751732L;
        nj.hgoy[23] = 1527826796971668506L;
        nj.hgoy[24] = 7178300982553806497L;
        nj.hgoy[25] = -2404547414996516428L;
        nj.hgoy[26] = 6665264275095780445L;
        nj.hgoy[27] = 2288509236160509743L;
        nj.hgoy[28] = -3585297058073275496L;
        nj.hgoy[29] = -4715217933403807878L;
        nj.hgoy[30] = -8393559548730903628L;
        nj.hgoy[31] = 7184078931335226967L;
        nj.hgoy[32] = 560113157153578981L;
        nj.hgoy[33] = 7379411129989744040L;
        nj.hgoy[34] = 6920824343055551234L;
        nj.hgoy[35] = -6635881036195312790L;
        nj.hgoy[36] = -1503354515040258433L;
    }

    public static /* synthetic */ CallSite hgoz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hgrz() {
        nj.hgpc[0] = -66443728;
        nj.hgpc[1] = 2035443089;
        nj.hgpc[2] = 1294334413;
        nj.hgpc[3] = 1158270267;
        nj.hgpc[4] = 655254474;
        nj.hgpc[5] = 1931194321;
        nj.hgpc[6] = -1094348710;
        nj.hgpc[7] = -1694677357;
        nj.hgpc[8] = 1248213374;
        nj.hgpc[9] = 1730172330;
        nj.hgpc[10] = 1292652383;
        nj.hgpc[11] = -1812357635;
        nj.hgpc[12] = 1765133085;
        nj.hgpc[13] = 1217571302;
        nj.hgpc[14] = -1398024197;
        nj.hgpc[15] = 1794327636;
        nj.hgpc[16] = -1303229116;
        nj.hgpc[17] = 1126070368;
        nj.hgpc[18] = -337233272;
        nj.hgpc[19] = -356902903;
        nj.hgpc[20] = -582799371;
        nj.hgpc[21] = -26001999;
        nj.hgpc[22] = 1427475580;
        nj.hgpc[23] = -446792624;
        nj.hgpc[24] = -2016923356;
        nj.hgpc[25] = -1822129391;
        nj.hgpc[26] = 379443284;
        nj.hgpc[27] = -895715197;
        nj.hgpc[28] = 1620087916;
        nj.hgpc[29] = 482123654;
        nj.hgpc[30] = -602589530;
        nj.hgpc[31] = -751404610;
        nj.hgpc[32] = -1845862309;
        nj.hgpc[33] = -738060415;
        nj.hgpc[34] = -84004827;
        nj.hgpc[35] = 614930937;
        nj.hgpc[36] = 844986838;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static <T extends ds> T get(String var0) {
        block42: {
            v0 /* !! */  = nj.oi;
            if (true) ** GOTO lbl5
            block25: while (true) {
                v0 /* !! */  = (long)(v1 - nj.hgoz("hgqb", hgow(int ), (int)14));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1565936240: {
                        v1 = nj.hgoz("hgqc", hgow(int ), (int)15);
                        continue block25;
                    }
                    case 1482178568: {
                        break block25;
                    }
                    case 1941873955: {
                        v1 = nj.hgoz("hgqd", hgow(int ), (int)16);
                        continue block25;
                    }
                    case 2064013088: {
                        v1 = nj.hgoz("hgqe", hgow(int ), (int)17);
                        continue block25;
                    }
                }
                break;
            }
            var3_1 = nj.c;
            v2 /* !! */  = nj.oi;
            block26: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -1484545034: {
                        v2 /* !! */  = (long)(nj.hgoz("hgqg", hgow(int ), (int)19) - nj.hgoz("hgqf", hgow(int ), (int)18));
                        continue block26;
                    }
                    case 1482178568: {
                        break block26;
                    }
                }
                break;
            }
            var2_2 /* !! */  = nj.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = nj.oi - nj.hgoz("hgqh", hgow(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == nj.hgoz("hgqi", hgpb(int ), (int)10)) {
                    var1_3 = nj.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)nj.hgoz("hgqj", hgpb(int ), (int)11);
            }
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block28: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        v4 /* !! */  = nj.oi;
                        block29: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case 284603895: {
                                    v4 /* !! */  = (long)(nj.hgoz("hgql", hgow(int ), (int)22) - nj.hgoz("hgqk", hgow(int ), (int)21));
                                    continue block29;
                                }
                                case 1482178568: {
                                    break block29;
                                }
                            }
                            break;
                        }
                        v5 = d.getInstance();
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_2 = nj.oi - nj.hgoz("hgqm", hgow(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v6 /* !! */  != nj.hgoz("hgqn", hgpb(int ), (int)12)) ** GOTO lbl60
                            v7 = v5.getManager();
                            v8 /* !! */  = nj.oi;
                            if (true) ** GOTO lbl73
lbl60:
                            // 1 sources

                            v6 /* !! */  = (long)nj.hgoz("hgqo", hgpb(int ), (int)13);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)nj.hgoz("hgqv", hgpb(int ), (int)16);
                        if (var3_1) {
                            throw null;
                        }
                        break block42;
                    }
                    case 1: {
                        ** GOTO lbl90
                    }
                    case 3: {
                        break block42;
                    }
                    block31: while (true) {
                        v8 /* !! */  = (long)(v9 - nj.hgoz("hgqp", hgow(int ), (int)24));
lbl73:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -566349568: {
                                v9 = nj.hgoz("hgqq", hgow(int ), (int)25);
                                continue block31;
                            }
                            case 1194376789: {
                                v9 = nj.hgoz("hgqr", hgow(int ), (int)26);
                                continue block31;
                            }
                            case 1482178568: {
                                break block31;
                            }
                        }
                        break;
                    }
                    v10 = v7.getModuleProvider();
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_3 = nj.oi - nj.hgoz("hgqs", hgow(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == nj.hgoz("hgqt", hgpb(int ), (int)14)) {
                            return v10.get(var0);
                        }
                        v11 /* !! */  = (long)nj.hgoz("hgqu", hgpb(int ), (int)15);
                    }
lbl90:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)nj.hgoz("hgqw", hgpb(int ), (int)17);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block28;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)nj.hgoz("hgqx", hgpb(int ), (int)18);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)nj.hgoz("hgqy", hgpb(int ), (int)19);
        ** while (!var3_1)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static <T extends ds> T get(Class<T> var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nj.oi - nj.hgoz("hgpa", hgow(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nj.hgoz("hgpe", hgpb(int ), (int)0)) break;
            v0 /* !! */  = (long)nj.hgoz("hgpf", hgpb(int ), (int)1);
        }
        var3_1 = nj.c;
        v1 /* !! */  = nj.oi;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(nj.hgoz("hgph", hgow(int ), (int)2) - nj.hgoz("hgpg", hgow(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 45677234: {
                    continue block26;
                }
                case 1482178568: {
                    break block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = nj.b;
        v2 /* !! */  = nj.oi;
        if (true) ** GOTO lbl21
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - nj.hgoz("hgpi", hgow(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1999677670: {
                    v3 = nj.hgoz("hgpj", hgow(int ), (int)4);
                    continue block27;
                }
                case 541245307: {
                    v3 = nj.hgoz("hgpk", hgow(int ), (int)5);
                    continue block27;
                }
                case 835277535: {
                    v3 = nj.hgoz("hgpl", hgow(int ), (int)6);
                    continue block27;
                }
                case 1482178568: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = nj.a;
        if (var3_1) {
            throw null;
lbl36:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nj.oi - nj.hgoz("hgpm", hgow(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nj.hgoz("hgpn", hgpb(int ), (int)2)) break;
                    v4 /* !! */  = (long)nj.hgoz("hgpo", hgpb(int ), (int)3);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = nj.oi - nj.hgoz("hgpp", hgow(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nj.hgoz("hgpq", hgpb(int ), (int)4)) break;
                    v5 /* !! */  = (long)nj.hgoz("hgpr", hgpb(int ), (int)5);
                }
                v6 = (Function<Class, ds>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$get$0(java.lang.Class ), (Ljava/lang/Class;)Lruhack/phobia/ds;)();
                v7 /* !! */  = nj.oi;
                if (true) ** GOTO lbl58
                block31: while (true) {
                    v7 /* !! */  = (long)(v8 - nj.hgoz("hgps", hgow(int ), (int)9));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1291126917: {
                            v8 = nj.hgoz("hgpt", hgow(int ), (int)10);
                            continue block31;
                        }
                        case 780768607: {
                            v8 = nj.hgoz("hgpu", hgow(int ), (int)11);
                            continue block31;
                        }
                        case 1482178568: {
                            break block31;
                        }
                    }
                    break;
                }
                v9 = nj.instanceModules.computeIfAbsent(var0, v6);
                v10 /* !! */  = nj.oi;
                if (true) ** GOTO lbl72
                block32: while (true) {
                    v10 /* !! */  = (long)(nj.hgoz("hgpw", hgow(int ), (int)13) - nj.hgoz("hgpv", hgow(int ), (int)12));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 759744656: {
                            continue block32;
                        }
                        case 1482178568: {
                            break block32;
                        }
                    }
                    break;
                }
                return (T)((ds)var0.cast(v9));
            }
lbl78:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)nj.hgoz("hgpx", hgpb(int ), (int)6);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nj.hgoz("hgpy", hgpb(int ), (int)7);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nj.hgoz("hgpz", hgpb(int ), (int)8);
                    if (!var3_1) ** GOTO lbl78
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nj.hgoz("hgqa", hgpb(int ), (int)9);
        ** while (!var3_1)
lbl95:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nj() {
        var2_1 /* !! */  = nj.b;
        var1_2 = nj.a;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nj.hgoz("hgqz", hgpb(int ), (int)20);
                    break block0;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)nj.hgoz("hgra", hgpb(int ), (int)21);
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)nj.hgoz("hgrb", hgpb(int ), (int)22);
        ** while (true)
    }

    private static /* synthetic */ int hgpb(int n2) {
        return hgpc[n2] ^ hgpd[n2];
    }
}

