/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import ruhack.phobia.nd;

public record gk$Palette(String name, int[] colors) {
    private static int[] efop;
    private static long[] efov;
    private static final long ko = -8543458625811066058L;
    private static long[] efow;
    public static final int b;
    public static final boolean c;
    private final String name;
    public static final boolean a;
    private final int[] colors;
    private static int[] efoo;

    private static /* synthetic */ void efwb() {
        gk$Palette.efoo[0] = -1869487417;
        gk$Palette.efoo[1] = -2107973482;
        gk$Palette.efoo[2] = -814008790;
        gk$Palette.efoo[3] = -1355923218;
        gk$Palette.efoo[4] = -2044989251;
        gk$Palette.efoo[5] = 1315807085;
        gk$Palette.efoo[6] = 1048189456;
        gk$Palette.efoo[7] = -243418777;
        gk$Palette.efoo[8] = 1716052037;
        gk$Palette.efoo[9] = 1451892313;
        gk$Palette.efoo[10] = -1908971282;
        gk$Palette.efoo[11] = 2034711510;
        gk$Palette.efoo[12] = 415651050;
        gk$Palette.efoo[13] = -1893898293;
        gk$Palette.efoo[14] = -1723545414;
        gk$Palette.efoo[15] = 264691718;
        gk$Palette.efoo[16] = 1043470429;
        gk$Palette.efoo[17] = -955846129;
        gk$Palette.efoo[18] = 1659783851;
        gk$Palette.efoo[19] = 927012263;
        gk$Palette.efoo[20] = -1181008278;
        gk$Palette.efoo[21] = -758468443;
        gk$Palette.efoo[22] = 582667734;
        gk$Palette.efoo[23] = -807925587;
        gk$Palette.efoo[24] = 1674465672;
        gk$Palette.efoo[25] = 236910425;
        gk$Palette.efoo[26] = 1151050422;
        gk$Palette.efoo[27] = 884486564;
        gk$Palette.efoo[28] = -788923766;
        gk$Palette.efoo[29] = 1221081821;
        gk$Palette.efoo[30] = 2061165702;
        gk$Palette.efoo[31] = -1332300498;
        gk$Palette.efoo[32] = 2110849565;
        gk$Palette.efoo[33] = 388845284;
        gk$Palette.efoo[34] = 702240020;
        gk$Palette.efoo[35] = -2020510757;
        gk$Palette.efoo[36] = -2091827637;
        gk$Palette.efoo[37] = 939999856;
        gk$Palette.efoo[38] = -178850597;
        gk$Palette.efoo[39] = 451568995;
        gk$Palette.efoo[40] = 1586179387;
        gk$Palette.efoo[41] = 2024430656;
        gk$Palette.efoo[42] = -1881370866;
        gk$Palette.efoo[43] = -1498328672;
        gk$Palette.efoo[44] = 1683712663;
        gk$Palette.efoo[45] = 33288947;
        gk$Palette.efoo[46] = 1685692287;
        gk$Palette.efoo[47] = -1612617717;
        gk$Palette.efoo[48] = -2105496553;
        gk$Palette.efoo[49] = -1991353356;
        gk$Palette.efoo[50] = -858278060;
        gk$Palette.efoo[51] = 160962084;
        gk$Palette.efoo[52] = -1991028563;
        gk$Palette.efoo[53] = -134905894;
        gk$Palette.efoo[54] = 65745827;
        gk$Palette.efoo[55] = 1781001344;
        gk$Palette.efoo[56] = -1061279908;
        gk$Palette.efoo[57] = 1010010435;
        gk$Palette.efoo[58] = 2141459596;
        gk$Palette.efoo[59] = -705947142;
        gk$Palette.efoo[60] = 1502884864;
        gk$Palette.efoo[61] = -1199936548;
        gk$Palette.efoo[62] = 475241997;
        gk$Palette.efoo[63] = -639034872;
        gk$Palette.efoo[64] = -1119821541;
        gk$Palette.efoo[65] = 1589039344;
        gk$Palette.efoo[66] = 1370217890;
        gk$Palette.efoo[67] = -1481971784;
        gk$Palette.efoo[68] = -382639636;
        gk$Palette.efoo[69] = -2089074116;
        gk$Palette.efoo[70] = 1452051694;
        gk$Palette.efoo[71] = -1512367395;
        gk$Palette.efoo[72] = 546418539;
        gk$Palette.efoo[73] = -211451995;
        gk$Palette.efoo[74] = -1415026735;
        gk$Palette.efoo[75] = 994135254;
        gk$Palette.efoo[76] = 2137563738;
        gk$Palette.efoo[77] = -1926368211;
        gk$Palette.efoo[78] = 1835299695;
        gk$Palette.efoo[79] = 1139376832;
        gk$Palette.efoo[80] = 432451928;
        gk$Palette.efoo[81] = 1805496187;
        gk$Palette.efoo[82] = -1958099743;
        gk$Palette.efoo[83] = -207712515;
        gk$Palette.efoo[84] = 1242940848;
        gk$Palette.efoo[85] = -1103913496;
        gk$Palette.efoo[86] = -603696820;
        gk$Palette.efoo[87] = 983268089;
        gk$Palette.efoo[88] = 2109749593;
        gk$Palette.efoo[89] = -1289359907;
        gk$Palette.efoo[90] = 504555032;
        gk$Palette.efoo[91] = -1085314493;
        gk$Palette.efoo[92] = -517176987;
        gk$Palette.efoo[93] = 1657287525;
        gk$Palette.efoo[94] = 553339961;
        gk$Palette.efoo[95] = -537703478;
        gk$Palette.efoo[96] = -1593763561;
        gk$Palette.efoo[97] = 293786233;
        gk$Palette.efoo[98] = -663595069;
        gk$Palette.efoo[99] = 1232369137;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int[] colors() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efvl", efou(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk$Palette.efoq("efvm", efon(int ), (int)100)) break;
            v0 /* !! */  = (long)gk$Palette.efoq("efvn", efon(int ), (int)101);
        }
        var3_1 = gk$Palette.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gk$Palette.ko - gk$Palette.efoq("efvo", efou(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gk$Palette.efoq("efvp", efon(int ), (int)102)) break;
            v1 /* !! */  = (long)gk$Palette.efoq("efvq", efon(int ), (int)103);
        }
        var2_2 = gk$Palette.b;
        v2 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - gk$Palette.efoq("efvr", efou(int ), (int)75));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1728894836: {
                    v3 = gk$Palette.efoq("efvs", efou(int ), (int)76);
                    continue block12;
                }
                case 524866358: {
                    break block12;
                }
                case 1007297187: {
                    v3 = gk$Palette.efoq("efvt", efou(int ), (int)77);
                    continue block12;
                }
                case 1197838035: {
                    v3 = gk$Palette.efoq("efvu", efou(int ), (int)78);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = gk$Palette.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl41
        block14: while (true) {
            v4 /* !! */  = (long)(gk$Palette.efoq("efvw", efou(int ), (int)80) - gk$Palette.efoq("efvv", efou(int ), (int)79));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1908213483: {
                    continue block14;
                }
                case 524866358: {
                    break block14;
                }
            }
            break;
        }
        return this.colors;
    }

    private static /* synthetic */ void efwc() {
        gk$Palette.efoo[100] = 430368735;
        gk$Palette.efoo[101] = -1319111716;
        gk$Palette.efoo[102] = -44722931;
        gk$Palette.efoo[103] = 1235477531;
        gk$Palette.efoo[104] = 215582349;
        gk$Palette.efoo[105] = -1950893719;
        gk$Palette.efoo[106] = -1759362134;
        gk$Palette.efoo[107] = 1780254508;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int color() {
        v0 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - gk$Palette.efoq("efox", efou(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2047271474: {
                    v1 = gk$Palette.efoq("efoy", efou(int ), (int)1);
                    continue block25;
                }
                case -115184433: {
                    v1 = gk$Palette.efoq("efoz", efou(int ), (int)2);
                    continue block25;
                }
                case 524866358: {
                    break block25;
                }
                case 1597001320: {
                    v1 = gk$Palette.efoq("efpa", efou(int ), (int)3);
                    continue block25;
                }
            }
            break;
        }
        var3_1 = gk$Palette.c;
        v2 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(gk$Palette.efoq("efpc", efou(int ), (int)5) - gk$Palette.efoq("efpb", efou(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 524866358: {
                    break block26;
                }
                case 781456897: {
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = gk$Palette.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efpd", efou(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gk$Palette.efoq("efpe", efon(int ), (int)3)) break;
            v3 /* !! */  = (long)gk$Palette.efoq("efpf", efon(int ), (int)4);
        }
        var1_3 = gk$Palette.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)gk$Palette.efoq("efpg", efon(int ), (int)5);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block28;
                v4 /* !! */  = gk$Palette.ko;
                if (true) ** GOTO lbl46
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - gk$Palette.efoq("efph", efou(int ), (int)7));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1047062451: {
                            v5 = gk$Palette.efoq("efpi", efou(int ), (int)8);
                            continue block29;
                        }
                        case 524866358: {
                            break block29;
                        }
                        case 1842375007: {
                            v5 = gk$Palette.efoq("efpj", efou(int ), (int)9);
                            continue block29;
                        }
                    }
                    break;
                }
                if (this.colors.length == 0) {
                    if (var1_3) continue block28;
                    v6 /* !! */  = gk$Palette.efoq("efpk", efon(int ), (int)6);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    if (!var1_3 && !var1_3) ** break;
                    continue block28;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_1 = gk$Palette.ko - gk$Palette.efoq("efpl", efou(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == gk$Palette.efoq("efpm", efon(int ), (int)7)) break;
                        v7 /* !! */  = (long)gk$Palette.efoq("efpn", efon(int ), (int)8);
                    }
                    v6 /* !! */  = (CallSite)this.colors[0];
                }
                return (int)v6 /* !! */ ;
                case 0: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efpo", efon(int ), (int)9);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl90
                }
lbl76:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)gk$Palette.efoq("efpp", efon(int ), (int)10);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl81:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efpq", efon(int ), (int)11);
                    if (!var3_1) break block28;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efpr", efon(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl98
                }
lbl90:
                // 3 sources

                case 4: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efps", efon(int ), (int)13);
                    if (!var3_1) ** GOTO lbl81
                    throw null;
                }
                case 5: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efpt", efon(int ), (int)14);
                    if (!var3_1) ** GOTO lbl90
                    throw null;
                }
lbl98:
                // 2 sources

                case 6: {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efpu", efon(int ), (int)15);
                    if (!var3_1) ** GOTO lbl76
                    throw null;
                }
                case 7: 
            }
        }
        var2_2 /* !! */  = (int)gk$Palette.efoq("efpv", efon(int ), (int)16);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ko - gk$Palette.efoq("eftl", efou(int ), (int)49)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == gk$Palette.efoq("eftm", efon(int ), (int)72)) break;
            object = gk$Palette.efoq("eftn", efon(int ), (int)73);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ko - gk$Palette.efoq("efto", efou(int ), (int)50)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == gk$Palette.efoq("eftp", efon(int ), (int)74)) break;
            object = gk$Palette.efoq("eftq", efon(int ), (int)75);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ko - gk$Palette.efoq("eftr", efou(int ), (int)51)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == gk$Palette.efoq("efts", efon(int ), (int)76)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = gk$Palette.efoq("eftt", efon(int ), (int)77);
        }
        if (bl2) return (int)gk$Palette.efoq("eftu", efon(int ), (int)78);
        if (bl2) return (int)gk$Palette.efoq("eftu", efon(int ), (int)78);
        Object object = ko;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - gk$Palette.efoq("eftv", efou(int ), (int)52);
            }
            switch ((int)object) {
                case 491482994: {
                    callSite = gk$Palette.efoq("eftw", efou(int ), (int)53);
                    continue block9;
                }
                case 524866358: {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gk$Palette.class, "name;colors", "name", "colors"}, this);
                }
                case 1316685691: {
                    callSite = gk$Palette.efoq("eftx", efou(int ), (int)54);
                    continue block9;
                }
                case 1674752668: {
                    callSite = gk$Palette.efoq("efty", efou(int ), (int)55);
                    continue block9;
                }
            }
            break;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gk$Palette.class, "name;colors", "name", "colors"}, this);
    }

    public static /* synthetic */ CallSite efoq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efsw", efou(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk$Palette.efoq("efsx", efon(int ), (int)62)) break;
            v0 /* !! */  = (long)gk$Palette.efoq("efsy", efon(int ), (int)63);
        }
        var3_1 = gk$Palette.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gk$Palette.ko - gk$Palette.efoq("efsz", efou(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gk$Palette.efoq("efta", efon(int ), (int)64)) break;
            v1 /* !! */  = (long)gk$Palette.efoq("eftb", efon(int ), (int)65);
        }
        var2_2 /* !! */  = gk$Palette.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gk$Palette.ko - gk$Palette.efoq("eftc", efou(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gk$Palette.efoq("eftd", efon(int ), (int)66)) break;
            v2 /* !! */  = (long)gk$Palette.efoq("efte", efon(int ), (int)67);
        }
        var1_3 = gk$Palette.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = gk$Palette.ko;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(gk$Palette.efoq("eftg", efou(int ), (int)48) - gk$Palette.efoq("eftf", efou(int ), (int)47));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1939173164: {
                            continue block14;
                        }
                        case 524866358: {
                            break block14;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{gk$Palette.class, "name;colors", "name", "colors"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efth", efon(int ), (int)68);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
lbl46:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efti", efon(int ), (int)69);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gk$Palette.efoq("eftj", efon(int ), (int)70);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gk$Palette.efoq("eftk", efon(int ), (int)71);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void efwe() {
        gk$Palette.efop[100] = -430368736;
        gk$Palette.efop[101] = -1742859781;
        gk$Palette.efop[102] = 44722930;
        gk$Palette.efop[103] = 182087011;
        gk$Palette.efop[104] = 215582349;
        gk$Palette.efop[105] = -1950893718;
        gk$Palette.efop[106] = -1759362134;
        gk$Palette.efop[107] = 1780254510;
    }

    static {
        efoo = new int[108];
        efop = new int[108];
        gk$Palette.efwb();
        gk$Palette.efwc();
        gk$Palette.efwd();
        gk$Palette.efwe();
        efov = new long[81];
        efow = new long[81];
        gk$Palette.efwf();
        gk$Palette.efwg();
    }

    private static /* synthetic */ void efwg() {
        gk$Palette.efow[0] = 7301795207395288115L;
        gk$Palette.efow[1] = 4635295652325551793L;
        gk$Palette.efow[2] = 6156606076651925505L;
        gk$Palette.efow[3] = -8390185406599640439L;
        gk$Palette.efow[4] = -7992344284646465053L;
        gk$Palette.efow[5] = 4431268637510427717L;
        gk$Palette.efow[6] = 3423222266966863672L;
        gk$Palette.efow[7] = -2419016225220622161L;
        gk$Palette.efow[8] = -4192399788448533517L;
        gk$Palette.efow[9] = 4142323670377434725L;
        gk$Palette.efow[10] = -9072361977990701745L;
        gk$Palette.efow[11] = 7314168485023225273L;
        gk$Palette.efow[12] = 7469324299718565208L;
        gk$Palette.efow[13] = -6532770154590128787L;
        gk$Palette.efow[14] = -4561403570985879157L;
        gk$Palette.efow[15] = 2029159656632128756L;
        gk$Palette.efow[16] = -6933326833684808798L;
        gk$Palette.efow[17] = 4223245371789648121L;
        gk$Palette.efow[18] = -9101414393345070750L;
        gk$Palette.efow[19] = -2321383280875163276L;
        gk$Palette.efow[20] = -8776746267059363594L;
        gk$Palette.efow[21] = 7046021676424123417L;
        gk$Palette.efow[22] = -8898006756753118285L;
        gk$Palette.efow[23] = 14542221901716682L;
        gk$Palette.efow[24] = -9217166372941255710L;
        gk$Palette.efow[25] = -2633926499142565469L;
        gk$Palette.efow[26] = -4704050442620450623L;
        gk$Palette.efow[27] = 3796087796770039076L;
        gk$Palette.efow[28] = -7319649501231328563L;
        gk$Palette.efow[29] = 6423255951197289456L;
        gk$Palette.efow[30] = -2592962117345282022L;
        gk$Palette.efow[31] = 8181330710643352503L;
        gk$Palette.efow[32] = -7788825148293035138L;
        gk$Palette.efow[33] = 4175941644317212207L;
        gk$Palette.efow[34] = -5319628883949639670L;
        gk$Palette.efow[35] = 7374792503259773756L;
        gk$Palette.efow[36] = -6516984063018359565L;
        gk$Palette.efow[37] = -8504723073034177440L;
        gk$Palette.efow[38] = -3463324258054323971L;
        gk$Palette.efow[39] = 7349150727112351685L;
        gk$Palette.efow[40] = -7654506741947145404L;
        gk$Palette.efow[41] = -2050380893799446362L;
        gk$Palette.efow[42] = -5921224153059941320L;
        gk$Palette.efow[43] = 2537680471774767598L;
        gk$Palette.efow[44] = -119670570623795497L;
        gk$Palette.efow[45] = -1831708711553654298L;
        gk$Palette.efow[46] = 5736773628772866495L;
        gk$Palette.efow[47] = -3661547135091851230L;
        gk$Palette.efow[48] = -3949967902869075384L;
        gk$Palette.efow[49] = 2218649017113436732L;
        gk$Palette.efow[50] = -2355640633919013339L;
        gk$Palette.efow[51] = 4611725966516760549L;
        gk$Palette.efow[52] = -1819143470461709962L;
        gk$Palette.efow[53] = 1008376802995685642L;
        gk$Palette.efow[54] = 5957621725451356087L;
        gk$Palette.efow[55] = -3639392461767097048L;
        gk$Palette.efow[56] = 1623677490956674483L;
        gk$Palette.efow[57] = 8243951012868374583L;
        gk$Palette.efow[58] = 2028610900319655557L;
        gk$Palette.efow[59] = -2337708325388064846L;
        gk$Palette.efow[60] = 6153988950542815431L;
        gk$Palette.efow[61] = -7424749545025372724L;
        gk$Palette.efow[62] = -6215139528028961149L;
        gk$Palette.efow[63] = 598221707231194100L;
        gk$Palette.efow[64] = 559014970022453677L;
        gk$Palette.efow[65] = 4932234817499807583L;
        gk$Palette.efow[66] = 8839561150363998544L;
        gk$Palette.efow[67] = -3721526614141799154L;
        gk$Palette.efow[68] = -4409063329442177455L;
        gk$Palette.efow[69] = 3037532411976681717L;
        gk$Palette.efow[70] = -2900435491555673241L;
        gk$Palette.efow[71] = -6113293377076313330L;
        gk$Palette.efow[72] = -769880128765549697L;
        gk$Palette.efow[73] = 4806761806204440275L;
        gk$Palette.efow[74] = -7537471896768152883L;
        gk$Palette.efow[75] = 2573982117393816573L;
        gk$Palette.efow[76] = 3262742534639051390L;
        gk$Palette.efow[77] = 6918169476559535087L;
        gk$Palette.efow[78] = 3449620865449011546L;
        gk$Palette.efow[79] = 8884348815407867519L;
        gk$Palette.efow[80] = 7110967591015198772L;
    }

    private static /* synthetic */ void efwd() {
        gk$Palette.efop[0] = -1869487418;
        gk$Palette.efop[1] = -2107973484;
        gk$Palette.efop[2] = -814008792;
        gk$Palette.efop[3] = 1355923217;
        gk$Palette.efop[4] = 196040862;
        gk$Palette.efop[5] = -1008683798;
        gk$Palette.efop[6] = -1048189457;
        gk$Palette.efop[7] = 243418776;
        gk$Palette.efop[8] = 1534882719;
        gk$Palette.efop[9] = 1451892314;
        gk$Palette.efop[10] = -1908971286;
        gk$Palette.efop[11] = 2034711509;
        gk$Palette.efop[12] = 415651048;
        gk$Palette.efop[13] = -1893898289;
        gk$Palette.efop[14] = -1723545415;
        gk$Palette.efop[15] = 264691718;
        gk$Palette.efop[16] = 1043470430;
        gk$Palette.efop[17] = 955846128;
        gk$Palette.efop[18] = 433484327;
        gk$Palette.efop[19] = -927012264;
        gk$Palette.efop[20] = 1734448010;
        gk$Palette.efop[21] = 1410421311;
        gk$Palette.efop[22] = 582667561;
        gk$Palette.efop[23] = -807925678;
        gk$Palette.efop[24] = 1674465655;
        gk$Palette.efop[25] = -236910426;
        gk$Palette.efop[26] = 1151050423;
        gk$Palette.efop[27] = -884486565;
        gk$Palette.efop[28] = -88059941;
        gk$Palette.efop[29] = 1221081820;
        gk$Palette.efop[30] = -956797091;
        gk$Palette.efop[31] = -1332300497;
        gk$Palette.efop[32] = -538949626;
        gk$Palette.efop[33] = -388845285;
        gk$Palette.efop[34] = -702240021;
        gk$Palette.efop[35] = -2020510758;
        gk$Palette.efop[36] = 2091827636;
        gk$Palette.efop[37] = 1568927757;
        gk$Palette.efop[38] = -178850598;
        gk$Palette.efop[39] = -451568996;
        gk$Palette.efop[40] = 651502313;
        gk$Palette.efop[41] = 2024430674;
        gk$Palette.efop[42] = -1881370850;
        gk$Palette.efop[43] = -1498328668;
        gk$Palette.efop[44] = 1683712644;
        gk$Palette.efop[45] = 33288954;
        gk$Palette.efop[46] = 1685692275;
        gk$Palette.efop[47] = -1612617717;
        gk$Palette.efop[48] = -2105496548;
        gk$Palette.efop[49] = -1991353347;
        gk$Palette.efop[50] = -858278073;
        gk$Palette.efop[51] = 160962087;
        gk$Palette.efop[52] = -1991028562;
        gk$Palette.efop[53] = -134905899;
        gk$Palette.efop[54] = 65745847;
        gk$Palette.efop[55] = 1781001344;
        gk$Palette.efop[56] = -1061279906;
        gk$Palette.efop[57] = 1010010449;
        gk$Palette.efop[58] = 2141459589;
        gk$Palette.efop[59] = -705947157;
        gk$Palette.efop[60] = 1502884871;
        gk$Palette.efop[61] = -1199936562;
        gk$Palette.efop[62] = -475241998;
        gk$Palette.efop[63] = 881006756;
        gk$Palette.efop[64] = 1119821540;
        gk$Palette.efop[65] = -1734469661;
        gk$Palette.efop[66] = -1370217891;
        gk$Palette.efop[67] = 833124415;
        gk$Palette.efop[68] = -382639634;
        gk$Palette.efop[69] = -2089074116;
        gk$Palette.efop[70] = 1452051693;
        gk$Palette.efop[71] = -1512367395;
        gk$Palette.efop[72] = -546418540;
        gk$Palette.efop[73] = -1466949406;
        gk$Palette.efop[74] = 1415026734;
        gk$Palette.efop[75] = 1999049264;
        gk$Palette.efop[76] = -2137563739;
        gk$Palette.efop[77] = 243651533;
        gk$Palette.efop[78] = 577144446;
        gk$Palette.efop[79] = 1139376832;
        gk$Palette.efop[80] = 432451930;
        gk$Palette.efop[81] = 1805496186;
        gk$Palette.efop[82] = -1958099744;
        gk$Palette.efop[83] = 207712514;
        gk$Palette.efop[84] = -1582427599;
        gk$Palette.efop[85] = 1103913495;
        gk$Palette.efop[86] = -951430023;
        gk$Palette.efop[87] = -983268090;
        gk$Palette.efop[88] = -2029232103;
        gk$Palette.efop[89] = -1289359908;
        gk$Palette.efop[90] = 504555032;
        gk$Palette.efop[91] = -1085314495;
        gk$Palette.efop[92] = -517176986;
        gk$Palette.efop[93] = 1657287524;
        gk$Palette.efop[94] = -553339962;
        gk$Palette.efop[95] = -1187319033;
        gk$Palette.efop[96] = -1593763563;
        gk$Palette.efop[97] = 293786232;
        gk$Palette.efop[98] = -663595071;
        gk$Palette.efop[99] = 1232369139;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efud", efou(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk$Palette.efoq("efue", efon(int ), (int)83)) break;
            v0 /* !! */  = (long)gk$Palette.efoq("efuf", efon(int ), (int)84);
        }
        var4_2 = gk$Palette.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gk$Palette.ko - gk$Palette.efoq("efug", efou(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gk$Palette.efoq("efuh", efon(int ), (int)85)) break;
            v1 /* !! */  = (long)gk$Palette.efoq("efui", efon(int ), (int)86);
        }
        var3_3 /* !! */  = gk$Palette.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gk$Palette.ko - gk$Palette.efoq("efuj", efou(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gk$Palette.efoq("efuk", efon(int ), (int)87)) break;
            v2 /* !! */  = (long)gk$Palette.efoq("eful", efon(int ), (int)88);
        }
        var2_4 = gk$Palette.a;
        if (!var4_2) ** GOTO lbl28
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)gk$Palette.efoq("efum", efon(int ), (int)89);
                }
lbl28:
                // 1 sources

                if (var2_4 || var2_4) continue block15;
                v3 /* !! */  = gk$Palette.ko;
                if (true) ** GOTO lbl33
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - gk$Palette.efoq("efun", efou(int ), (int)59));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1592155309: {
                            v4 = gk$Palette.efoq("efuo", efou(int ), (int)60);
                            continue block16;
                        }
                        case -997926704: {
                            v4 = gk$Palette.efoq("efup", efou(int ), (int)61);
                            continue block16;
                        }
                        case 524866358: {
                            break block16;
                        }
                        case 727024667: {
                            v4 = gk$Palette.efoq("efuq", efou(int ), (int)62);
                            continue block16;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gk$Palette.class, "name;colors", "name", "colors"}, this, var1_1);
                case 0: {
                    var3_3 /* !! */  = (int)gk$Palette.efoq("efur", efon(int ), (int)90);
                    if (!var4_2) break block15;
                    throw null;
                }
                case 1: {
                    do {
                        var3_3 /* !! */  = (int)gk$Palette.efoq("efus", efon(int ), (int)91);
                    } while (!var4_2);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)gk$Palette.efoq("efut", efon(int ), (int)92);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)gk$Palette.efoq("efuu", efon(int ), (int)93);
        ** while (!var4_2)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gk$Palette(String var1_1, int ... var2_2) {
        var4_3 /* !! */  = gk$Palette.b;
        super();
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.name = var1_1;
                this.colors = var2_2;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)gk$Palette.efoq("efor", efon(int ), (int)0);
            }
            case 1: {
                var4_3 /* !! */  = (int)gk$Palette.efoq("efos", efon(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)gk$Palette.efoq("efot", efon(int ), (int)2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int colorAt(float var1_1, int var2_2) {
        v0 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl5
        block60: while (true) {
            v0 /* !! */  = (long)(v1 - gk$Palette.efoq("efpw", efou(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1797997397: {
                    v1 = gk$Palette.efoq("efpx", efou(int ), (int)12);
                    continue block60;
                }
                case -373367406: {
                    v1 = gk$Palette.efoq("efpy", efou(int ), (int)13);
                    continue block60;
                }
                case 524866358: {
                    break block60;
                }
            }
            break;
        }
        var9_3 = gk$Palette.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efpz", efou(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gk$Palette.efoq("efqa", efon(int ), (int)17)) break;
            v2 /* !! */  = (long)gk$Palette.efoq("efqb", efon(int ), (int)18);
        }
        var8_4 /* !! */  = gk$Palette.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gk$Palette.ko - gk$Palette.efoq("efqc", efou(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gk$Palette.efoq("efqd", efon(int ), (int)19)) break;
            v3 /* !! */  = (long)gk$Palette.efoq("efqe", efon(int ), (int)20);
        }
        var7_5 = gk$Palette.a;
        if (var9_3) {
            throw null;
lbl31:
            // 9 sources

            return (int)gk$Palette.efoq("efqf", efon(int ), (int)21);
        }
        if (var7_5 || var7_5) ** GOTO lbl31
        v4 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl38
        block64: while (true) {
            v4 /* !! */  = (long)(v5 - gk$Palette.efoq("efqg", efou(int ), (int)16));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1533776531: {
                    v5 = gk$Palette.efoq("efqh", efou(int ), (int)17);
                    continue block64;
                }
                case -1217635137: {
                    v5 = gk$Palette.efoq("efqi", efou(int ), (int)18);
                    continue block64;
                }
                case -56378242: {
                    v5 = gk$Palette.efoq("efqj", efou(int ), (int)19);
                    continue block64;
                }
                case 524866358: {
                    break block64;
                }
            }
            break;
        }
        if (this.colors.length != 0) ** GOTO lbl72
        if (var8_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_5 || var7_5) ** GOTO lbl31
                v6 = gk$Palette.efoq("efqk", efon(int ), (int)22);
                v7 = gk$Palette.efoq("efql", efon(int ), (int)23);
                v8 = gk$Palette.efoq("efqm", efon(int ), (int)24);
                v9 /* !! */  = gk$Palette.ko;
                if (true) ** GOTO lbl62
                block65: while (true) {
                    v9 /* !! */  = (long)(v10 - gk$Palette.efoq("efqn", efou(int ), (int)20));
lbl62:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 524866358: {
                            break block65;
                        }
                        case 1240785688: {
                            v10 = gk$Palette.efoq("efqo", efou(int ), (int)21);
                            continue block65;
                        }
                        case 2053090057: {
                            v10 = gk$Palette.efoq("efqp", efou(int ), (int)22);
                            continue block65;
                        }
                    }
                    break;
                }
                return nd.rgba((int)v6, (int)v7, (int)v8, var2_2);
            }
lbl72:
            // 1 sources

            if (var7_5 || var7_5) ** GOTO lbl31
            while (true) {
                if ((v11 = (cfr_temp_2 = gk$Palette.ko - gk$Palette.efoq("efqq", efou(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v11 == gk$Palette.efoq("efqr", efon(int ), (int)25)) break;
                v11 = -55769614;
            }
            if (this.colors.length != gk$Palette.efoq("efqs", efon(int ), (int)26)) ** GOTO lbl95
            if (var7_5 || var7_5) ** GOTO lbl31
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = gk$Palette.ko - gk$Palette.efoq("efqt", efou(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == gk$Palette.efoq("efqu", efon(int ), (int)27)) break;
                v12 /* !! */  = (long)gk$Palette.efoq("efqv", efon(int ), (int)28);
            }
            v13 = this.colors[0];
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = gk$Palette.ko - gk$Palette.efoq("efqw", efou(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v14 /* !! */  == gk$Palette.efoq("efqx", efon(int ), (int)29)) break;
                v14 /* !! */  = (long)gk$Palette.efoq("efqy", efon(int ), (int)30);
            }
            return nd.replAlpha(v13, var2_2);
lbl95:
            // 1 sources

            if (var7_5 || var7_5) ** GOTO lbl31
            v15 = var1_1;
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = gk$Palette.ko - gk$Palette.efoq("efqz", efou(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v16 /* !! */  == gk$Palette.efoq("efra", efon(int ), (int)31)) break;
                v16 /* !! */  = (long)gk$Palette.efoq("efrb", efon(int ), (int)32);
            }
            var3_6 = var1_1 - (float)Math.floor(v15);
            if (var7_5 || var7_5) ** GOTO lbl31
            while (true) {
                if ((v17 = (cfr_temp_6 = gk$Palette.ko - gk$Palette.efoq("efrc", efou(int ), (int)27)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v17 == gk$Palette.efoq("efrd", efon(int ), (int)33)) break;
                v17 = 195116433;
            }
            var4_7 = var3_6 * (float)this.colors.length;
            if (var7_5 || var7_5) ** GOTO lbl31
            while (true) {
                if ((v18 = (cfr_temp_7 = gk$Palette.ko - gk$Palette.efoq("efre", efou(int ), (int)28)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v18 == gk$Palette.efoq("efrf", efon(int ), (int)34)) break;
                v18 = -62064385;
            }
            v19 = this.colors.length - gk$Palette.efoq("efrg", efon(int ), (int)35);
            v20 = (int)var4_7;
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_8 = gk$Palette.ko - gk$Palette.efoq("efrh", efou(int ), (int)29)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v21 /* !! */  == gk$Palette.efoq("efri", efon(int ), (int)36)) break;
                v21 /* !! */  = (long)gk$Palette.efoq("efrj", efon(int ), (int)37);
            }
            var5_8 = Math.min(v19, v20);
            if (var7_5 || var7_5) ** GOTO lbl31
            v22 = var5_8 + gk$Palette.efoq("efrk", efon(int ), (int)38);
            v23 /* !! */  = gk$Palette.ko;
            if (true) ** GOTO lbl134
            block73: while (true) {
                v23 /* !! */  = (long)(v24 - gk$Palette.efoq("efrl", efou(int ), (int)30));
lbl134:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1781872419: {
                        v24 = gk$Palette.efoq("efrm", efou(int ), (int)31);
                        continue block73;
                    }
                    case -1162217305: {
                        v24 = gk$Palette.efoq("efrn", efou(int ), (int)32);
                        continue block73;
                    }
                    case 524866358: {
                        break block73;
                    }
                    case 643121053: {
                        v24 = gk$Palette.efoq("efro", efou(int ), (int)33);
                        continue block73;
                    }
                }
                break;
            }
            var6_9 = v22 % this.colors.length;
            if (var7_5 || var7_5) ** continue;
            v25 /* !! */  = gk$Palette.ko;
            if (true) ** GOTO lbl152
            block74: while (true) {
                v25 /* !! */  = (long)(v26 - gk$Palette.efoq("efrp", efou(int ), (int)34));
lbl152:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -1138617778: {
                        v26 = gk$Palette.efoq("efrq", efou(int ), (int)35);
                        continue block74;
                    }
                    case 354542334: {
                        v26 = gk$Palette.efoq("efrr", efou(int ), (int)36);
                        continue block74;
                    }
                    case 524866358: {
                        break block74;
                    }
                    case 1974525125: {
                        v26 = gk$Palette.efoq("efrs", efou(int ), (int)37);
                        continue block74;
                    }
                }
                break;
            }
            v27 = this.colors[var5_8];
            v28 /* !! */  = gk$Palette.ko;
            if (true) ** GOTO lbl169
            block75: while (true) {
                v28 /* !! */  = (long)(v29 - gk$Palette.efoq("efrt", efou(int ), (int)38));
lbl169:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case 524866358: {
                        break block75;
                    }
                    case 1501087691: {
                        v29 = gk$Palette.efoq("efru", efou(int ), (int)39);
                        continue block75;
                    }
                    case 1911202345: {
                        v29 = gk$Palette.efoq("efrv", efou(int ), (int)40);
                        continue block75;
                    }
                }
                break;
            }
            v30 = this.colors[var6_9];
            v31 = var4_7 - (float)var5_8;
            v32 /* !! */  = gk$Palette.ko;
            if (true) ** GOTO lbl184
            block76: while (true) {
                v32 /* !! */  = (long)(gk$Palette.efoq("efrx", efou(int ), (int)42) - gk$Palette.efoq("efrw", efou(int ), (int)41));
lbl184:
                // 2 sources

                switch ((int)v32 /* !! */ ) {
                    case -74594891: {
                        continue block76;
                    }
                    case 524866358: {
                        break block76;
                    }
                }
                break;
            }
            v33 = nd.interpolateColor(v27, v30, v31);
            while (true) {
                if ((v34 /* !! */  = (cfr_temp_9 = gk$Palette.ko - gk$Palette.efoq("efry", efou(int ), (int)43)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v34 /* !! */  == gk$Palette.efoq("efrz", efon(int ), (int)39)) break;
                v34 /* !! */  = (long)gk$Palette.efoq("efsa", efon(int ), (int)40);
            }
            return nd.replAlpha(v33, var2_2);
lbl197:
            // 2 sources

            case 0: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsb", efon(int ), (int)41);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl202:
            // 3 sources

            case 1: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsc", efon(int ), (int)42);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 2: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsd", efon(int ), (int)43);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 3: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efse", efon(int ), (int)44);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 4: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsf", efon(int ), (int)45);
                if (!var9_3) ** GOTO lbl202
                throw null;
            }
lbl221:
            // 3 sources

            case 5: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsg", efon(int ), (int)46);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl226:
            // 2 sources

            case 6: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsh", efon(int ), (int)47);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl231:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_4 /* !! */  = (int)gk$Palette.efoq("efsi", efon(int ), (int)48);
                    if (var9_3) {
                        throw null;
                    }
                    ** GOTO lbl254
                    break;
                }
            }
lbl237:
            // 5 sources

            case 8: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsj", efon(int ), (int)49);
                if (var9_3) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 9: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsk", efon(int ), (int)50);
                if (!var9_3) ** GOTO lbl237
                throw null;
            }
            case 10: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsl", efon(int ), (int)51);
                if (!var9_3) ** GOTO lbl237
                throw null;
            }
lbl250:
            // 2 sources

            case 11: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsm", efon(int ), (int)52);
                if (var9_3) {
                    throw null;
                }
            }
lbl254:
            // 5 sources

            case 12: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsn", efon(int ), (int)53);
                if (var9_3) {
                    throw null;
                }
            }
lbl258:
            // 6 sources

            case 13: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efso", efon(int ), (int)54);
                if (!var9_3) ** GOTO lbl197
                throw null;
            }
            case 14: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsp", efon(int ), (int)55);
                if (!var9_3) ** GOTO lbl202
                throw null;
            }
            case 15: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsq", efon(int ), (int)56);
                if (!var9_3) ** GOTO lbl258
                throw null;
            }
            case 16: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsr", efon(int ), (int)57);
                if (!var9_3) ** GOTO lbl221
                throw null;
            }
lbl274:
            // 2 sources

            case 17: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efss", efon(int ), (int)58);
                if (!var9_3) ** GOTO lbl237
                throw null;
            }
            case 18: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efst", efon(int ), (int)59);
                if (!var9_3) ** GOTO lbl237
                throw null;
            }
            case 19: {
                var8_4 /* !! */  = (int)gk$Palette.efoq("efsu", efon(int ), (int)60);
                if (!var9_3) ** GOTO lbl226
                throw null;
            }
            case 20: 
        }
        var8_4 /* !! */  = (int)gk$Palette.efoq("efsv", efon(int ), (int)61);
        ** while (!var9_3)
lbl289:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gk$Palette.ko - gk$Palette.efoq("efuv", efou(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gk$Palette.efoq("efuw", efon(int ), (int)94)) break;
            v0 /* !! */  = (long)gk$Palette.efoq("efux", efon(int ), (int)95);
        }
        var3_1 = gk$Palette.c;
        v1 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - gk$Palette.efoq("efuy", efou(int ), (int)64));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2040761342: {
                    v2 = gk$Palette.efoq("efuz", efou(int ), (int)65);
                    continue block22;
                }
                case -1617329603: {
                    v2 = gk$Palette.efoq("efva", efou(int ), (int)66);
                    continue block22;
                }
                case 524866358: {
                    break block22;
                }
                case 1890629915: {
                    v2 = gk$Palette.efoq("efvb", efou(int ), (int)67);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = gk$Palette.b;
        v3 /* !! */  = gk$Palette.ko;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - gk$Palette.efoq("efvc", efou(int ), (int)68));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 524866358: {
                    break block23;
                }
                case 978737709: {
                    v4 = gk$Palette.efoq("efvd", efou(int ), (int)69);
                    continue block23;
                }
                case 1217999188: {
                    v4 = gk$Palette.efoq("efve", efou(int ), (int)70);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = gk$Palette.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = gk$Palette.ko;
                if (true) ** GOTO lbl51
                block25: while (true) {
                    v5 /* !! */  = (long)(gk$Palette.efoq("efvg", efou(int ), (int)72) - gk$Palette.efoq("efvf", efou(int ), (int)71));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2096408624: {
                            continue block25;
                        }
                        case 524866358: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.name;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)gk$Palette.efoq("efvh", efon(int ), (int)96);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gk$Palette.efoq("efvi", efon(int ), (int)97);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gk$Palette.efoq("efvj", efon(int ), (int)98);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gk$Palette.efoq("efvk", efon(int ), (int)99);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void efwf() {
        gk$Palette.efov[0] = 4966797428491140536L;
        gk$Palette.efov[1] = 2667171151015201666L;
        gk$Palette.efov[2] = -9144820193999194459L;
        gk$Palette.efov[3] = 5825535564056514047L;
        gk$Palette.efov[4] = -2490970403876759503L;
        gk$Palette.efov[5] = 4578783176558976298L;
        gk$Palette.efov[6] = 1509511156163983407L;
        gk$Palette.efov[7] = 5439399403331938068L;
        gk$Palette.efov[8] = 8719881737879366323L;
        gk$Palette.efov[9] = -461383855169611872L;
        gk$Palette.efov[10] = 1030952521446554402L;
        gk$Palette.efov[11] = -177616797455349826L;
        gk$Palette.efov[12] = -1053592270837761054L;
        gk$Palette.efov[13] = 3583772507522332422L;
        gk$Palette.efov[14] = 6147418871509465660L;
        gk$Palette.efov[15] = -1752867369740052023L;
        gk$Palette.efov[16] = -2765151749742953273L;
        gk$Palette.efov[17] = 1005538824176324452L;
        gk$Palette.efov[18] = 8638000783799559943L;
        gk$Palette.efov[19] = 1884214705383694314L;
        gk$Palette.efov[20] = 5615496916770614646L;
        gk$Palette.efov[21] = -2751638123466598861L;
        gk$Palette.efov[22] = 6010140745205969228L;
        gk$Palette.efov[23] = 3002794707056453250L;
        gk$Palette.efov[24] = -642995442325818256L;
        gk$Palette.efov[25] = 6860451291569225983L;
        gk$Palette.efov[26] = 3955340540526552534L;
        gk$Palette.efov[27] = 4462977968560434740L;
        gk$Palette.efov[28] = 7188900080217315543L;
        gk$Palette.efov[29] = 779979369239299654L;
        gk$Palette.efov[30] = -875253196934903644L;
        gk$Palette.efov[31] = 6651584860386038803L;
        gk$Palette.efov[32] = -6665480507653073359L;
        gk$Palette.efov[33] = 1065936385927333430L;
        gk$Palette.efov[34] = 7098221032701429383L;
        gk$Palette.efov[35] = 2972096595959076063L;
        gk$Palette.efov[36] = 1057686176794441285L;
        gk$Palette.efov[37] = 7333139504492917079L;
        gk$Palette.efov[38] = -8883298554122816269L;
        gk$Palette.efov[39] = 4121754231271244969L;
        gk$Palette.efov[40] = 7609981759044657901L;
        gk$Palette.efov[41] = -5933098443067533443L;
        gk$Palette.efov[42] = 2622983899404248756L;
        gk$Palette.efov[43] = 2928554097773752101L;
        gk$Palette.efov[44] = -1934451748249589534L;
        gk$Palette.efov[45] = 980557455860865089L;
        gk$Palette.efov[46] = -8937444381557462170L;
        gk$Palette.efov[47] = -2275023592052543501L;
        gk$Palette.efov[48] = 5842255720444267443L;
        gk$Palette.efov[49] = 698246557898500189L;
        gk$Palette.efov[50] = 1309336671524330621L;
        gk$Palette.efov[51] = -2268206595565395705L;
        gk$Palette.efov[52] = -4049085379607959144L;
        gk$Palette.efov[53] = -3688266053766342382L;
        gk$Palette.efov[54] = 3613146258405773455L;
        gk$Palette.efov[55] = -2544078754053322825L;
        gk$Palette.efov[56] = 2882881786143776861L;
        gk$Palette.efov[57] = 2321525157776943824L;
        gk$Palette.efov[58] = 5622274903908480739L;
        gk$Palette.efov[59] = 2510769718320070257L;
        gk$Palette.efov[60] = -960344654993067992L;
        gk$Palette.efov[61] = 686779286618181357L;
        gk$Palette.efov[62] = -5746946812385009385L;
        gk$Palette.efov[63] = 3908738373984275254L;
        gk$Palette.efov[64] = 392089728877099432L;
        gk$Palette.efov[65] = 2420124010169779348L;
        gk$Palette.efov[66] = -7713183260016824144L;
        gk$Palette.efov[67] = 7234536728197083124L;
        gk$Palette.efov[68] = 5608580391172714253L;
        gk$Palette.efov[69] = 7445181362403495152L;
        gk$Palette.efov[70] = 5715253274741865901L;
        gk$Palette.efov[71] = 7461534529519900166L;
        gk$Palette.efov[72] = 6704851152057420379L;
        gk$Palette.efov[73] = -704509556914962742L;
        gk$Palette.efov[74] = -361090604315284427L;
        gk$Palette.efov[75] = 8278816838842124730L;
        gk$Palette.efov[76] = -2724627636413999671L;
        gk$Palette.efov[77] = -2233956407227727133L;
        gk$Palette.efov[78] = -2155524874560574402L;
        gk$Palette.efov[79] = 4695346321447652932L;
        gk$Palette.efov[80] = 5431799532539597043L;
    }

    private static /* synthetic */ int efon(int n2) {
        return efoo[n2] ^ efop[n2];
    }

    private static /* synthetic */ long efou(int n2) {
        return efov[n2] ^ efow[n2];
    }
}

