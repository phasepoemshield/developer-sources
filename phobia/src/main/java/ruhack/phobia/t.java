/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.f;
import ruhack.phobia.fl;

public final class t
extends f {
    private static int[] agcr;
    private static int[] agcq;
    private static long[] agcy;
    public static final int b;
    private static final long bw = 8836758903651646365L;
    private static long[] agcx;
    public static final boolean a;
    public static final boolean c;

    private static /* synthetic */ int agcp(int n2) {
        return agcq[n2] ^ agcr[n2];
    }

    public static /* synthetic */ CallSite agcs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = t.bw - t.agcs("agcz", agcw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == t.agcs("agda", agcp(int ), (int)3)) break;
            v0 /* !! */  = (long)t.agcs("agdb", agcp(int ), (int)4);
        }
        var6_3 = t.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = t.bw - t.agcs("agdc", agcw(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == t.agcs("agdd", agcp(int ), (int)5)) break;
            v1 /* !! */  = (long)t.agcs("agde", agcp(int ), (int)6);
        }
        var5_4 /* !! */  = t.b;
        v2 /* !! */  = t.bw;
        if (true) ** GOTO lbl19
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - t.agcs("agdf", agcw(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1210505176: {
                    v3 = t.agcs("agdg", agcw(int ), (int)3);
                    continue block37;
                }
                case -49084234: {
                    v3 = t.agcs("agdh", agcw(int ), (int)4);
                    continue block37;
                }
                case 1342091248: {
                    v3 = t.agcs("agdi", agcw(int ), (int)5);
                    continue block37;
                }
                case 1508719517: {
                    break block37;
                }
            }
            break;
        }
        var4_5 = t.a;
        if (var6_3) {
            throw null;
lbl34:
            // 7 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl34
        if (var2_2.length != t.agcs("agdj", agcp(int ), (int)7)) ** GOTO lbl82
        if (var4_5) ** GOTO lbl34
        v4 = var2_2[0];
        v5 /* !! */  = t.bw;
        if (true) ** GOTO lbl44
        block39: while (true) {
            v5 /* !! */  = (long)(v6 - t.agcs("agdk", agcw(int ), (int)6));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 113124995: {
                    v6 = t.agcs("agdl", agcw(int ), (int)7);
                    continue block39;
                }
                case 1508719517: {
                    break block39;
                }
                case 1720992644: {
                    v6 = t.agcs("agdm", agcw(int ), (int)8);
                    continue block39;
                }
            }
            break;
        }
        if (!v4.equalsIgnoreCase("confirm")) ** GOTO lbl82
        if (var4_5 || var4_5) ** GOTO lbl34
        v7 /* !! */  = t.bw;
        if (true) ** GOTO lbl59
        block40: while (true) {
            v7 /* !! */  = (long)(t.agcs("agdo", agcw(int ), (int)10) - t.agcs("agdn", agcw(int ), (int)9));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 107540194: {
                    continue block40;
                }
                case 1508719517: {
                    break block40;
                }
            }
            break;
        }
        var3_6 = fl.getInstance();
        if (var4_5 || var4_5) ** GOTO lbl34
        if (var3_6 == null) ** GOTO lbl82
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5 || var4_5) ** GOTO lbl34
                v8 /* !! */  = t.bw;
                if (true) ** GOTO lbl75
                block41: while (true) {
                    v8 /* !! */  = (long)(t.agcs("agdq", agcw(int ), (int)12) - t.agcs("agdp", agcw(int ), (int)11));
lbl75:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1131631256: {
                            continue block41;
                        }
                        case 1508719517: {
                            break block41;
                        }
                    }
                    break;
                }
                var3_6.confirmUnload();
                if (var4_5) ** GOTO lbl34
lbl82:
                // 4 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)t.agcs("agdr", agcp(int ), (int)8);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 1: {
                var5_4 /* !! */  = (int)t.agcs("agds", agcp(int ), (int)9);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl95:
            // 4 sources

            case 2: {
                var5_4 /* !! */  = (int)t.agcs("agdt", agcp(int ), (int)10);
                if (!var6_3) break;
                throw null;
            }
lbl99:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)t.agcs("agdu", agcp(int ), (int)11);
                if (var6_3) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)t.agcs("agdv", agcp(int ), (int)12);
                    if (!var6_3) ** GOTO lbl99
                    throw null;
                }
            }
lbl108:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)t.agcs("agdw", agcp(int ), (int)13);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl112:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)t.agcs("agdx", agcp(int ), (int)14);
                if (!var6_3) ** GOTO lbl108
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)t.agcs("agdy", agcp(int ), (int)15);
                if (!var6_3) ** GOTO lbl112
                throw null;
            }
            case 8: {
                var5_4 /* !! */  = (int)t.agcs("agdz", agcp(int ), (int)16);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 9: {
                var5_4 /* !! */  = (int)t.agcs("agea", agcp(int ), (int)17);
                if (!var6_3) ** GOTO lbl85
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)t.agcs("ageb", agcp(int ), (int)18);
                if (!var6_3) ** GOTO lbl108
                throw null;
            }
lbl133:
            // 2 sources

            case 11: {
                var5_4 /* !! */  = (int)t.agcs("agec", agcp(int ), (int)19);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
lbl137:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)t.agcs("aged", agcp(int ), (int)20);
                if (!var6_3) ** GOTO lbl95
                throw null;
            }
            case 13: 
        }
        var5_4 /* !! */  = (int)t.agcs("agee", agcp(int ), (int)21);
        ** while (!var6_3)
lbl144:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long agcw(int n2) {
        return agcx[n2] ^ agcy[n2];
    }

    static {
        agcq = new int[32];
        agcr = new int[32];
        t.agev();
        t.agew();
        agcx = new long[19];
        agcy = new long[19];
        t.agex();
        t.agey();
    }

    private static /* synthetic */ void agex() {
        t.agcx[0] = 1047629313951061759L;
        t.agcx[1] = -7471630145195394147L;
        t.agcx[2] = 6230722582186175284L;
        t.agcx[3] = -7525692189534374211L;
        t.agcx[4] = 4030582077437626595L;
        t.agcx[5] = 1513179659632521816L;
        t.agcx[6] = -5556938050080710308L;
        t.agcx[7] = -4344404892606990152L;
        t.agcx[8] = -7707682597283988740L;
        t.agcx[9] = -7854928591025182754L;
        t.agcx[10] = 2676731648551622327L;
        t.agcx[11] = 3983232184336746099L;
        t.agcx[12] = 4027976542201178870L;
        t.agcx[13] = 8912449984471722798L;
        t.agcx[14] = 89978939731209636L;
        t.agcx[15] = 7506210009113791186L;
        t.agcx[16] = -5749155712444174656L;
        t.agcx[17] = -4776052137747611579L;
        t.agcx[18] = -1138250335969540072L;
    }

    private static /* synthetic */ void agev() {
        t.agcq[0] = 1703382127;
        t.agcq[1] = 2142550350;
        t.agcq[2] = -1660175725;
        t.agcq[3] = -343115920;
        t.agcq[4] = -282753749;
        t.agcq[5] = -1129021063;
        t.agcq[6] = -1287590988;
        t.agcq[7] = -1113733787;
        t.agcq[8] = 836710023;
        t.agcq[9] = -1592436407;
        t.agcq[10] = -1267027424;
        t.agcq[11] = 2042772710;
        t.agcq[12] = -111457514;
        t.agcq[13] = -55251365;
        t.agcq[14] = 573469087;
        t.agcq[15] = 846988887;
        t.agcq[16] = -129615365;
        t.agcq[17] = -405248133;
        t.agcq[18] = -1472037891;
        t.agcq[19] = 880396310;
        t.agcq[20] = -236149105;
        t.agcq[21] = -2026546295;
        t.agcq[22] = -459111626;
        t.agcq[23] = 2111493801;
        t.agcq[24] = 1322006905;
        t.agcq[25] = -1505725624;
        t.agcq[26] = -871672488;
        t.agcq[27] = 1692183784;
        t.agcq[28] = -2132144190;
        t.agcq[29] = 64522124;
        t.agcq[30] = 378129343;
        t.agcq[31] = 360497738;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public t() {
        var2_1 /* !! */  = t.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("selfdestruct", "\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u0435 \u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e\u0439 \u0432\u044b\u0433\u0440\u0443\u0437\u043a\u0438", new String[]{"sdconfirm"});
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)t.agcs("agct", agcp(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)t.agcs("agcu", agcp(int ), (int)1);
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)t.agcs("agcv", agcp(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void agey() {
        t.agcy[0] = -9139980250594508282L;
        t.agcy[1] = -8628840938547748986L;
        t.agcy[2] = 6054756584816860610L;
        t.agcy[3] = -29987119319946053L;
        t.agcy[4] = -2408908535704611388L;
        t.agcy[5] = -7038768537870821036L;
        t.agcy[6] = -1689475625159133410L;
        t.agcy[7] = 2210955381734196969L;
        t.agcy[8] = -4505031174210099688L;
        t.agcy[9] = 4820482419204793662L;
        t.agcy[10] = 6150551853285136000L;
        t.agcy[11] = 2940616274489509999L;
        t.agcy[12] = -9191852389381718440L;
        t.agcy[13] = -8399644533840197453L;
        t.agcy[14] = 352353329886742672L;
        t.agcy[15] = -7893544920749807952L;
        t.agcy[16] = -6751413214500814630L;
        t.agcy[17] = 416830312873266599L;
        t.agcy[18] = 2535575670565869779L;
    }

    private static /* synthetic */ void agew() {
        t.agcr[0] = 1703382126;
        t.agcr[1] = 2142550351;
        t.agcr[2] = -1660175725;
        t.agcr[3] = -343115919;
        t.agcr[4] = 1988599679;
        t.agcr[5] = -1129021064;
        t.agcr[6] = -822434161;
        t.agcr[7] = -1113733788;
        t.agcr[8] = 836710020;
        t.agcr[9] = -1592436415;
        t.agcr[10] = -1267027416;
        t.agcr[11] = 2042772704;
        t.agcr[12] = -111457519;
        t.agcr[13] = -55251374;
        t.agcr[14] = 573469082;
        t.agcr[15] = 846988892;
        t.agcr[16] = -129615373;
        t.agcr[17] = -405248130;
        t.agcr[18] = -1472037893;
        t.agcr[19] = 880396314;
        t.agcr[20] = -236149107;
        t.agcr[21] = -2026546300;
        t.agcr[22] = -459111625;
        t.agcr[23] = -1060389911;
        t.agcr[24] = 1322006904;
        t.agcr[25] = 1779307291;
        t.agcr[26] = -871672487;
        t.agcr[27] = 1692183785;
        t.agcr[28] = -2132144189;
        t.agcr[29] = 64522125;
        t.agcr[30] = 378129341;
        t.agcr[31] = 360497736;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean hiddenFromHelp() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = t.bw - t.agcs("agef", agcw(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == t.agcs("ageg", agcp(int ), (int)22)) break;
            v0 /* !! */  = (long)t.agcs("ageh", agcp(int ), (int)23);
        }
        var3_1 = t.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = t.bw - t.agcs("agei", agcw(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == t.agcs("agej", agcp(int ), (int)24)) break;
            v1 /* !! */  = (long)t.agcs("agek", agcp(int ), (int)25);
        }
        var2_2 /* !! */  = t.b;
        v2 /* !! */  = t.bw;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - t.agcs("agel", agcw(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1986990489: {
                    v3 = t.agcs("agem", agcw(int ), (int)16);
                    continue block14;
                }
                case -1509947272: {
                    v3 = t.agcs("agen", agcw(int ), (int)17);
                    continue block14;
                }
                case 644259445: {
                    v3 = t.agcs("ageo", agcw(int ), (int)18);
                    continue block14;
                }
                case 1508719517: {
                    break block14;
                }
            }
            break;
        }
        var1_3 = t.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)t.agcs("agep", agcp(int ), (int)26);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (boolean)t.agcs("ageq", agcp(int ), (int)27);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)t.agcs("ager", agcp(int ), (int)28);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)t.agcs("ages", agcp(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)t.agcs("aget", agcp(int ), (int)30);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)t.agcs("ageu", agcp(int ), (int)31);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }
}

