/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class ey$ActionPhase
extends Enum<ey$ActionPhase> {
    private static long[] efjm;
    protected static final long kn = -7148132185499419762L;
    private static long[] efjn;
    public static final int b;
    private static final /* synthetic */ ey$ActionPhase[] $VALUES;
    public static final /* enum */ ey$ActionPhase WAIT_USE_HALF;
    private static int[] efjs;
    public static final boolean a;
    private static int[] efjr;
    public static final /* enum */ ey$ActionPhase WAIT_USE_STOP;
    public static final boolean c;
    public static final /* enum */ ey$ActionPhase WAIT_RESTORE_STOP;
    public static final /* enum */ ey$ActionPhase WAIT_RESTORE;
    public static final /* enum */ ey$ActionPhase IDLE;

    private static /* synthetic */ long efjl(int n2) {
        return efjm[n2] ^ efjn[n2];
    }

    private static /* synthetic */ void efmv() {
        ey$ActionPhase.efjm[0] = -8720431695750373253L;
        ey$ActionPhase.efjm[1] = -5816025399818041494L;
        ey$ActionPhase.efjm[2] = -6836815927090689054L;
        ey$ActionPhase.efjm[3] = 5310747715011060978L;
        ey$ActionPhase.efjm[4] = -5631809695333078845L;
        ey$ActionPhase.efjm[5] = 2352010891481457155L;
        ey$ActionPhase.efjm[6] = 9117639610733784529L;
        ey$ActionPhase.efjm[7] = -8745287568311389660L;
        ey$ActionPhase.efjm[8] = 5204680407412967577L;
        ey$ActionPhase.efjm[9] = -322442083516252492L;
        ey$ActionPhase.efjm[10] = -1242614821933287221L;
        ey$ActionPhase.efjm[11] = 7422872052272728529L;
        ey$ActionPhase.efjm[12] = -666423088776426812L;
        ey$ActionPhase.efjm[13] = 6068712213255311077L;
        ey$ActionPhase.efjm[14] = 8623014344525197274L;
        ey$ActionPhase.efjm[15] = 706842896620873729L;
        ey$ActionPhase.efjm[16] = -2159492446788033621L;
        ey$ActionPhase.efjm[17] = -3641674586399715562L;
        ey$ActionPhase.efjm[18] = 5808191441097978690L;
        ey$ActionPhase.efjm[19] = 8602949436528465067L;
        ey$ActionPhase.efjm[20] = 2932967612056425213L;
        ey$ActionPhase.efjm[21] = -285864138370239160L;
        ey$ActionPhase.efjm[22] = -2541688664504488019L;
        ey$ActionPhase.efjm[23] = -430998199444935873L;
        ey$ActionPhase.efjm[24] = -2218196181789327691L;
        ey$ActionPhase.efjm[25] = 4019164748358462979L;
        ey$ActionPhase.efjm[26] = -2491303752805895328L;
        ey$ActionPhase.efjm[27] = -3580030933981768815L;
        ey$ActionPhase.efjm[28] = -3101899861565217538L;
        ey$ActionPhase.efjm[29] = -7499615141956341477L;
        ey$ActionPhase.efjm[30] = -2988460835098991960L;
        ey$ActionPhase.efjm[31] = -3640858850811508580L;
        ey$ActionPhase.efjm[32] = -6556527062507681363L;
        ey$ActionPhase.efjm[33] = -7320702473947873902L;
        ey$ActionPhase.efjm[34] = -9164068860113811152L;
        ey$ActionPhase.efjm[35] = 1260027340724419119L;
        ey$ActionPhase.efjm[36] = -2370412963044565083L;
    }

    private ey$ActionPhase() {
        int n3 = b;
        boolean bl2 = a;
    }

    private static /* synthetic */ int efjq(int n2) {
        return efjr[n2] ^ efjs[n2];
    }

    static {
        efjr = new int[38];
        efjs = new int[38];
        ey$ActionPhase.efmt();
        ey$ActionPhase.efmu();
        efjm = new long[37];
        efjn = new long[37];
        ey$ActionPhase.efmv();
        ey$ActionPhase.efmw();
        IDLE = new ey$ActionPhase();
        WAIT_USE_HALF = new ey$ActionPhase();
        WAIT_USE_STOP = new ey$ActionPhase();
        WAIT_RESTORE = new ey$ActionPhase();
        WAIT_RESTORE_STOP = new ey$ActionPhase();
        $VALUES = ey$ActionPhase.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ey$ActionPhase[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey$ActionPhase.kn - ey$ActionPhase.efjo("eflh", efjl(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey$ActionPhase.efjo("efli", efjq(int ), (int)21)) break;
            v0 /* !! */  = (long)ey$ActionPhase.efjo("eflj", efjq(int ), (int)22);
        }
        var2 = ey$ActionPhase.c;
        v1 /* !! */  = ey$ActionPhase.kn;
        if (true) ** GOTO lbl12
        block38: while (true) {
            v1 /* !! */  = (long)(v2 - ey$ActionPhase.efjo("eflk", efjl(int ), (int)17));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -246769728: {
                    v2 = ey$ActionPhase.efjo("efll", efjl(int ), (int)18);
                    continue block38;
                }
                case 1016473542: {
                    v2 = ey$ActionPhase.efjo("eflm", efjl(int ), (int)19);
                    continue block38;
                }
                case 1405434766: {
                    break block38;
                }
                case 1408941617: {
                    v2 = ey$ActionPhase.efjo("efln", efjl(int ), (int)20);
                    continue block38;
                }
            }
            break;
        }
        var1_1 /* !! */  = ey$ActionPhase.b;
        v3 /* !! */  = ey$ActionPhase.kn;
        if (true) ** GOTO lbl29
        block39: while (true) {
            v3 /* !! */  = (long)(v4 - ey$ActionPhase.efjo("eflo", efjl(int ), (int)21));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1122372326: {
                    v4 = ey$ActionPhase.efjo("eflp", efjl(int ), (int)22);
                    continue block39;
                }
                case -47672930: {
                    v4 = ey$ActionPhase.efjo("eflq", efjl(int ), (int)23);
                    continue block39;
                }
                case 474440927: {
                    v4 = ey$ActionPhase.efjo("eflr", efjl(int ), (int)24);
                    continue block39;
                }
                case 1405434766: {
                    break block39;
                }
            }
            break;
        }
        var0_2 = ey$ActionPhase.a;
        if (var2) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl47:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 = new ey$ActionPhase[5];
                v6 = ey$ActionPhase.efjo("efls", efjq(int ), (int)23);
                while (true) {
                    if ((v7 = (cfr_temp_1 = ey$ActionPhase.kn - ey$ActionPhase.efjo("eflt", efjl(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == ey$ActionPhase.efjo("eflu", efjq(int ), (int)24)) break;
                    v7 = -583582699;
                }
                v5[v6] = ey$ActionPhase.IDLE;
                v8 = ey$ActionPhase.efjo("eflv", efjq(int ), (int)25);
                v9 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl64
                block42: while (true) {
                    v9 /* !! */  = (long)(v10 - ey$ActionPhase.efjo("eflw", efjl(int ), (int)26));
lbl64:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1417190035: {
                            v10 = ey$ActionPhase.efjo("eflx", efjl(int ), (int)27);
                            continue block42;
                        }
                        case -1169602198: {
                            v10 = ey$ActionPhase.efjo("efly", efjl(int ), (int)28);
                            continue block42;
                        }
                        case 1405434766: {
                            break block42;
                        }
                    }
                    break;
                }
                v5[v8] = ey$ActionPhase.WAIT_USE_HALF;
                v11 = ey$ActionPhase.efjo("eflz", efjq(int ), (int)26);
                v12 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl79
                block43: while (true) {
                    v12 /* !! */  = (long)(v13 - ey$ActionPhase.efjo("efma", efjl(int ), (int)29));
lbl79:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 204958166: {
                            v13 = ey$ActionPhase.efjo("efmb", efjl(int ), (int)30);
                            continue block43;
                        }
                        case 1114566117: {
                            v13 = ey$ActionPhase.efjo("efmc", efjl(int ), (int)31);
                            continue block43;
                        }
                        case 1405434766: {
                            break block43;
                        }
                        case 1608062999: {
                            v13 = ey$ActionPhase.efjo("efmd", efjl(int ), (int)32);
                            continue block43;
                        }
                    }
                    break;
                }
                v5[v11] = ey$ActionPhase.WAIT_USE_STOP;
                v14 = ey$ActionPhase.efjo("efme", efjq(int ), (int)27);
                v15 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl97
                block44: while (true) {
                    v15 /* !! */  = (long)(ey$ActionPhase.efjo("efmg", efjl(int ), (int)34) - ey$ActionPhase.efjo("efmf", efjl(int ), (int)33));
lbl97:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1405434766: {
                            break block44;
                        }
                        case 1538665051: {
                            continue block44;
                        }
                    }
                    break;
                }
                v5[v14] = ey$ActionPhase.WAIT_RESTORE;
                v16 = ey$ActionPhase.efjo("efmh", efjq(int ), (int)28);
                v17 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl108
                block45: while (true) {
                    v17 /* !! */  = (long)(ey$ActionPhase.efjo("efmj", efjl(int ), (int)36) - ey$ActionPhase.efjo("efmi", efjl(int ), (int)35));
lbl108:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1410888057: {
                            continue block45;
                        }
                        case 1405434766: {
                            break block45;
                        }
                    }
                    break;
                }
                v5[v16] = ey$ActionPhase.WAIT_RESTORE_STOP;
                return v5;
            }
lbl115:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efmk", efjq(int ), (int)29);
                    if (!var2) break block12;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efml", efjq(int ), (int)30);
                if (!var2) ** GOTO lbl115
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efmm", efjq(int ), (int)31);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efmn", efjq(int ), (int)32);
        ** while (!var2)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efmu() {
        ey$ActionPhase.efjs[0] = 1203421851;
        ey$ActionPhase.efjs[1] = -1117766502;
        ey$ActionPhase.efjs[2] = 1259070705;
        ey$ActionPhase.efjs[3] = -1423141951;
        ey$ActionPhase.efjs[4] = -1360345840;
        ey$ActionPhase.efjs[5] = -68097361;
        ey$ActionPhase.efjs[6] = -2123373848;
        ey$ActionPhase.efjs[7] = 858867642;
        ey$ActionPhase.efjs[8] = 374195323;
        ey$ActionPhase.efjs[9] = 1747472556;
        ey$ActionPhase.efjs[10] = -1406833426;
        ey$ActionPhase.efjs[11] = -175000864;
        ey$ActionPhase.efjs[12] = 900044080;
        ey$ActionPhase.efjs[13] = -1769319993;
        ey$ActionPhase.efjs[14] = 1739860468;
        ey$ActionPhase.efjs[15] = -1705742169;
        ey$ActionPhase.efjs[16] = 2078469583;
        ey$ActionPhase.efjs[17] = -1245675382;
        ey$ActionPhase.efjs[18] = 0x55E88588;
        ey$ActionPhase.efjs[19] = -24748884;
        ey$ActionPhase.efjs[20] = 1944172364;
        ey$ActionPhase.efjs[21] = -2020477160;
        ey$ActionPhase.efjs[22] = 799028991;
        ey$ActionPhase.efjs[23] = 442575886;
        ey$ActionPhase.efjs[24] = -947598576;
        ey$ActionPhase.efjs[25] = -1978510779;
        ey$ActionPhase.efjs[26] = -1709350530;
        ey$ActionPhase.efjs[27] = 1834334344;
        ey$ActionPhase.efjs[28] = -359424058;
        ey$ActionPhase.efjs[29] = -60205069;
        ey$ActionPhase.efjs[30] = -1208546940;
        ey$ActionPhase.efjs[31] = 1575177058;
        ey$ActionPhase.efjs[32] = 946535537;
        ey$ActionPhase.efjs[33] = 701375316;
        ey$ActionPhase.efjs[34] = 807118169;
        ey$ActionPhase.efjs[35] = 1674143533;
        ey$ActionPhase.efjs[36] = -1984491446;
        ey$ActionPhase.efjs[37] = 310493368;
    }

    private static /* synthetic */ void efmt() {
        ey$ActionPhase.efjr[0] = -1203421852;
        ey$ActionPhase.efjr[1] = 1474833088;
        ey$ActionPhase.efjr[2] = -1259070706;
        ey$ActionPhase.efjr[3] = 1485259522;
        ey$ActionPhase.efjr[4] = -1360345839;
        ey$ActionPhase.efjr[5] = 297141664;
        ey$ActionPhase.efjr[6] = 2123373847;
        ey$ActionPhase.efjr[7] = -1248149596;
        ey$ActionPhase.efjr[8] = 374195322;
        ey$ActionPhase.efjr[9] = 1747472556;
        ey$ActionPhase.efjr[10] = -1406833427;
        ey$ActionPhase.efjr[11] = -175000864;
        ey$ActionPhase.efjr[12] = -900044081;
        ey$ActionPhase.efjr[13] = 1370538392;
        ey$ActionPhase.efjr[14] = 1739860470;
        ey$ActionPhase.efjr[15] = -1705742169;
        ey$ActionPhase.efjr[16] = 2078469580;
        ey$ActionPhase.efjr[17] = -1245675381;
        ey$ActionPhase.efjr[18] = 1441301897;
        ey$ActionPhase.efjr[19] = -24748883;
        ey$ActionPhase.efjr[20] = 1944172365;
        ey$ActionPhase.efjr[21] = 2020477159;
        ey$ActionPhase.efjr[22] = 144046391;
        ey$ActionPhase.efjr[23] = 442575886;
        ey$ActionPhase.efjr[24] = 947598575;
        ey$ActionPhase.efjr[25] = -1978510780;
        ey$ActionPhase.efjr[26] = -1709350532;
        ey$ActionPhase.efjr[27] = 1834334347;
        ey$ActionPhase.efjr[28] = -359424062;
        ey$ActionPhase.efjr[29] = -60205072;
        ey$ActionPhase.efjr[30] = -1208546937;
        ey$ActionPhase.efjr[31] = 1575177059;
        ey$ActionPhase.efjr[32] = 946535537;
        ey$ActionPhase.efjr[33] = 701375316;
        ey$ActionPhase.efjr[34] = 807118168;
        ey$ActionPhase.efjr[35] = 1674143535;
        ey$ActionPhase.efjr[36] = -1984491447;
        ey$ActionPhase.efjr[37] = 310493372;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ey$ActionPhase[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey$ActionPhase.kn - ey$ActionPhase.efjo("efjp", efjl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey$ActionPhase.efjo("efjt", efjq(int ), (int)0)) break;
            v0 /* !! */  = (long)ey$ActionPhase.efjo("efju", efjq(int ), (int)1);
        }
        var2 = ey$ActionPhase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ey$ActionPhase.kn - ey$ActionPhase.efjo("efjv", efjl(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ey$ActionPhase.efjo("efjw", efjq(int ), (int)2)) break;
            v1 /* !! */  = (long)ey$ActionPhase.efjo("efjx", efjq(int ), (int)3);
        }
        var1_1 /* !! */  = ey$ActionPhase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ey$ActionPhase.kn - ey$ActionPhase.efjo("efjz", efjl(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ey$ActionPhase.efjo("efka", efjq(int ), (int)4)) break;
            v2 /* !! */  = (long)ey$ActionPhase.efjo("efkb", efjq(int ), (int)5);
        }
        var0_2 = ey$ActionPhase.a;
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
                v3 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl35
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - ey$ActionPhase.efjo("efkc", efjl(int ), (int)3));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1001266097: {
                            v4 = ey$ActionPhase.efjo("efkd", efjl(int ), (int)4);
                            continue block15;
                        }
                        case 1405434766: {
                            break block15;
                        }
                        case 1425497893: {
                            v4 = ey$ActionPhase.efjo("efkf", efjl(int ), (int)5);
                            continue block15;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ey$ActionPhase.kn - ey$ActionPhase.efjo("efkg", efjl(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ey$ActionPhase.efjo("efkh", efjq(int ), (int)6)) break;
                    v5 /* !! */  = (long)ey$ActionPhase.efjo("efki", efjq(int ), (int)7);
                }
                return (ey$ActionPhase[])ey$ActionPhase.$VALUES.clone();
            }
lbl51:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efkj", efjq(int ), (int)8);
                if (!var2) break;
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efkk", efjq(int ), (int)9);
                if (!var2) ** GOTO lbl51
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efkl", efjq(int ), (int)10);
                if (!var2) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)ey$ActionPhase.efjo("efkm", efjq(int ), (int)11);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void efmw() {
        ey$ActionPhase.efjn[0] = -6191416563059020681L;
        ey$ActionPhase.efjn[1] = 6316971207711882296L;
        ey$ActionPhase.efjn[2] = 3855014056426156491L;
        ey$ActionPhase.efjn[3] = -7136272129962686645L;
        ey$ActionPhase.efjn[4] = -8569458621747148634L;
        ey$ActionPhase.efjn[5] = 2530022120657604480L;
        ey$ActionPhase.efjn[6] = -5861820940023774693L;
        ey$ActionPhase.efjn[7] = -826194730941303216L;
        ey$ActionPhase.efjn[8] = -4392746234135846961L;
        ey$ActionPhase.efjn[9] = 1489652234845719751L;
        ey$ActionPhase.efjn[10] = 5790673903551478389L;
        ey$ActionPhase.efjn[11] = -1464672250199940468L;
        ey$ActionPhase.efjn[12] = 6325824503170838786L;
        ey$ActionPhase.efjn[13] = 2540698230661443625L;
        ey$ActionPhase.efjn[14] = -7307428564361395228L;
        ey$ActionPhase.efjn[15] = -4554520510592162190L;
        ey$ActionPhase.efjn[16] = -8198574722334680665L;
        ey$ActionPhase.efjn[17] = 4912143528907233195L;
        ey$ActionPhase.efjn[18] = 9168631813502727215L;
        ey$ActionPhase.efjn[19] = -5617117973416768108L;
        ey$ActionPhase.efjn[20] = 1136968835368542211L;
        ey$ActionPhase.efjn[21] = -693043874212928505L;
        ey$ActionPhase.efjn[22] = -2122555497721205469L;
        ey$ActionPhase.efjn[23] = 8081269252559091866L;
        ey$ActionPhase.efjn[24] = -5596949019380417121L;
        ey$ActionPhase.efjn[25] = 1204035935260664504L;
        ey$ActionPhase.efjn[26] = -6427377343263029643L;
        ey$ActionPhase.efjn[27] = -5579488263932904779L;
        ey$ActionPhase.efjn[28] = -5691781145053773050L;
        ey$ActionPhase.efjn[29] = 8694145898032670658L;
        ey$ActionPhase.efjn[30] = 7618060989277027366L;
        ey$ActionPhase.efjn[31] = -7428586274529801998L;
        ey$ActionPhase.efjn[32] = -3296350145021911267L;
        ey$ActionPhase.efjn[33] = -4893856477317873387L;
        ey$ActionPhase.efjn[34] = -3400813047772239912L;
        ey$ActionPhase.efjn[35] = 1636052911537557055L;
        ey$ActionPhase.efjn[36] = 3199942445458173544L;
    }

    public static /* synthetic */ CallSite efjo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ey$ActionPhase valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey$ActionPhase.kn - ey$ActionPhase.efjo("efko", efjl(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey$ActionPhase.efjo("efkp", efjq(int ), (int)12)) break;
            v0 /* !! */  = (long)ey$ActionPhase.efjo("efkq", efjq(int ), (int)13);
        }
        var3_1 = ey$ActionPhase.c;
        v1 /* !! */  = ey$ActionPhase.kn;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - ey$ActionPhase.efjo("efkr", efjl(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1842342017: {
                    v2 = ey$ActionPhase.efjo("efks", efjl(int ), (int)9);
                    continue block21;
                }
                case 1405434766: {
                    break block21;
                }
                case 1777256759: {
                    v2 = ey$ActionPhase.efjo("efkt", efjl(int ), (int)10);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ey$ActionPhase.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl29
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - ey$ActionPhase.efjo("efku", efjl(int ), (int)11));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 421429403: {
                            v4 = ey$ActionPhase.efjo("efkv", efjl(int ), (int)12);
                            continue block22;
                        }
                        case 471202240: {
                            v4 = ey$ActionPhase.efjo("efkw", efjl(int ), (int)13);
                            continue block22;
                        }
                        case 1405434766: {
                            break block22;
                        }
                    }
                    break;
                }
                var1_3 = ey$ActionPhase.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = ey$ActionPhase.kn;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(ey$ActionPhase.efjo("efky", efjl(int ), (int)15) - ey$ActionPhase.efjo("efkx", efjl(int ), (int)14));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 137999814: {
                            continue block24;
                        }
                        case 1405434766: {
                            break block24;
                        }
                    }
                    break;
                }
                return Enum.valueOf(ey$ActionPhase.class, var0);
            }
lbl54:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey$ActionPhase.efjo("efkz", efjq(int ), (int)14);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ey$ActionPhase.efjo("efla", efjq(int ), (int)15);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ey$ActionPhase.efjo("eflb", efjq(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ey$ActionPhase.efjo("efld", efjq(int ), (int)17);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }
}

