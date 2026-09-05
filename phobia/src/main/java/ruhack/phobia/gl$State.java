/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class gl$State
extends Enum<gl$State> {
    public static final /* enum */ gl$State DISABLING_FLIGHT;
    private static int[] dklw;
    private static final /* synthetic */ gl$State[] $VALUES;
    public static final /* enum */ gl$State TAKING_OFF;
    public static final /* enum */ gl$State REPOSITION_TAKEOFF;
    public static final /* enum */ gl$State NEXT_ROUTE_DELAY;
    private static long[] dkls;
    public static final /* enum */ gl$State ROUTING;
    private static long[] dklr;
    public static final /* enum */ gl$State MINING;
    public static final boolean a;
    public static final long hs = 2481408430003448522L;
    public static final /* enum */ gl$State CONFIRMING_ARRIVAL;
    public static final /* enum */ gl$State ENSURING_FLIGHT;
    private static int[] dklx;
    public static final /* enum */ gl$State LOOTING;
    public static final boolean c;
    public static final /* enum */ gl$State REPOSITION_DISABLING_FLIGHT;
    public static final int b;
    public static final /* enum */ gl$State REPOSITION_ROUTING;
    public static final /* enum */ gl$State SEARCHING;

    private static /* synthetic */ void dkpz() {
        gl$State.dklw[0] = 938389622;
        gl$State.dklw[1] = -2050717540;
        gl$State.dklw[2] = 714671384;
        gl$State.dklw[3] = 1747331279;
        gl$State.dklw[4] = -1058557835;
        gl$State.dklw[5] = -1472265145;
        gl$State.dklw[6] = -1879141876;
        gl$State.dklw[7] = -560922994;
        gl$State.dklw[8] = -370096808;
        gl$State.dklw[9] = -584734045;
        gl$State.dklw[10] = 1907282816;
        gl$State.dklw[11] = 2094168123;
        gl$State.dklw[12] = -405003650;
        gl$State.dklw[13] = -1594387973;
        gl$State.dklw[14] = -668485822;
        gl$State.dklw[15] = 1877713003;
        gl$State.dklw[16] = 682380674;
        gl$State.dklw[17] = -99712578;
        gl$State.dklw[18] = -1412697310;
        gl$State.dklw[19] = 135377650;
        gl$State.dklw[20] = -1113112846;
        gl$State.dklw[21] = 470790636;
        gl$State.dklw[22] = 989108069;
        gl$State.dklw[23] = 767047473;
        gl$State.dklw[24] = 640898591;
        gl$State.dklw[25] = 1542546355;
        gl$State.dklw[26] = 1882371516;
        gl$State.dklw[27] = -1482535975;
        gl$State.dklw[28] = -1903207389;
        gl$State.dklw[29] = -1085735230;
        gl$State.dklw[30] = -2138106677;
        gl$State.dklw[31] = -22734211;
        gl$State.dklw[32] = 1048987421;
        gl$State.dklw[33] = 829828317;
        gl$State.dklw[34] = 1430273543;
        gl$State.dklw[35] = -1115657958;
        gl$State.dklw[36] = -1186341875;
        gl$State.dklw[37] = -1703402666;
        gl$State.dklw[38] = 915730637;
        gl$State.dklw[39] = -2003144065;
        gl$State.dklw[40] = -665091272;
        gl$State.dklw[41] = -1528503476;
        gl$State.dklw[42] = -1919606444;
        gl$State.dklw[43] = 178768259;
        gl$State.dklw[44] = -707970761;
        gl$State.dklw[45] = 619204771;
        gl$State.dklw[46] = 1658115228;
        gl$State.dklw[47] = -1211404429;
        gl$State.dklw[48] = 1879660182;
        gl$State.dklw[49] = 1579356005;
        gl$State.dklw[50] = -837253244;
        gl$State.dklw[51] = -2088059094;
        gl$State.dklw[52] = 2084504014;
        gl$State.dklw[53] = 699028135;
        gl$State.dklw[54] = -1697954900;
        gl$State.dklw[55] = -245243248;
        gl$State.dklw[56] = 951324467;
        gl$State.dklw[57] = -1910755291;
        gl$State.dklw[58] = 1555185204;
        gl$State.dklw[59] = 968380711;
        gl$State.dklw[60] = -2018851876;
        gl$State.dklw[61] = -675738869;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gl$State valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$State.hs - gl$State.dklt("dkmq", dklq(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$State.dklt("dkmr", dklv(int ), (int)12)) break;
            v0 /* !! */  = (long)gl$State.dklt("dkms", dklv(int ), (int)13);
        }
        var3_1 = gl$State.c;
        v1 /* !! */  = gl$State.hs;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(gl$State.dklt("dkmu", dklq(int ), (int)9) - gl$State.dklt("dkmt", dklq(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1727634022: {
                    continue block15;
                }
                case -318510390: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = gl$State.b;
        v2 /* !! */  = gl$State.hs;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(gl$State.dklt("dkmw", dklq(int ), (int)11) - gl$State.dklt("dkmv", dklq(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -318510390: {
                    break block16;
                }
                case 369727165: {
                    continue block16;
                }
            }
            break;
        }
        var1_3 = gl$State.a;
        if (!var3_1) ** GOTO lbl34
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl34:
                // 1 sources

                if (var1_3 || var1_3) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = gl$State.hs - gl$State.dklt("dkmx", dklq(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gl$State.dklt("dkmy", dklv(int ), (int)14)) break;
                    v3 /* !! */  = (long)gl$State.dklt("dkmz", dklv(int ), (int)15);
                }
                return Enum.valueOf(gl$State.class, var0);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)gl$State.dklt("dkna", dklv(int ), (int)16);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)gl$State.dklt("dknb", dklv(int ), (int)17);
                    if (!var3_1) break block17;
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)gl$State.dklt("dknc", dklv(int ), (int)18);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)gl$State.dklt("dknd", dklv(int ), (int)19);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite dklt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dkqb() {
        gl$State.dklr[0] = 8538594547391122379L;
        gl$State.dklr[1] = 8886945985548587959L;
        gl$State.dklr[2] = -8333680346182291415L;
        gl$State.dklr[3] = 3411517335346144619L;
        gl$State.dklr[4] = 3240579559564306106L;
        gl$State.dklr[5] = -8229341748959373937L;
        gl$State.dklr[6] = 1607389872849827920L;
        gl$State.dklr[7] = -6136076491368523936L;
        gl$State.dklr[8] = 7347560092390033600L;
        gl$State.dklr[9] = 245378691934946523L;
        gl$State.dklr[10] = -2875491724227914301L;
        gl$State.dklr[11] = -4850148308107308154L;
        gl$State.dklr[12] = 4259057573604627209L;
        gl$State.dklr[13] = 4521582600535573599L;
        gl$State.dklr[14] = 2277435451411908348L;
        gl$State.dklr[15] = 3596234554935871195L;
        gl$State.dklr[16] = 392130913122708973L;
        gl$State.dklr[17] = -3794263601459492488L;
        gl$State.dklr[18] = 8217918015298296015L;
        gl$State.dklr[19] = -5073282210683914935L;
        gl$State.dklr[20] = -3018267783081294989L;
        gl$State.dklr[21] = 6122973028444738562L;
        gl$State.dklr[22] = 7508678438945260371L;
        gl$State.dklr[23] = -2396413819625499063L;
        gl$State.dklr[24] = 6222290126589177147L;
        gl$State.dklr[25] = -256682847418867742L;
        gl$State.dklr[26] = 1488189158463572048L;
        gl$State.dklr[27] = -2631320531727404979L;
        gl$State.dklr[28] = -5477502713439155526L;
        gl$State.dklr[29] = -2003227233135339489L;
        gl$State.dklr[30] = 1117655884768049139L;
        gl$State.dklr[31] = 4306141022738809821L;
        gl$State.dklr[32] = 3463486698123510905L;
        gl$State.dklr[33] = -7858074106052700050L;
        gl$State.dklr[34] = 745162973272189703L;
        gl$State.dklr[35] = -7891582364566798518L;
        gl$State.dklr[36] = -6791951927664366698L;
        gl$State.dklr[37] = -660877469569436591L;
        gl$State.dklr[38] = -5526002527558802390L;
        gl$State.dklr[39] = -7986618414102326334L;
        gl$State.dklr[40] = 7022923688221844489L;
        gl$State.dklr[41] = 6199021018631848224L;
        gl$State.dklr[42] = 5944569654759890401L;
        gl$State.dklr[43] = -3148009317265001873L;
    }

    private static /* synthetic */ void dkqa() {
        gl$State.dklx[0] = -938389623;
        gl$State.dklx[1] = 1352410189;
        gl$State.dklx[2] = -714671385;
        gl$State.dklx[3] = 306339819;
        gl$State.dklx[4] = -1058557836;
        gl$State.dklx[5] = -1925310740;
        gl$State.dklx[6] = -1879141875;
        gl$State.dklx[7] = 1862576582;
        gl$State.dklx[8] = -370096806;
        gl$State.dklx[9] = -584734045;
        gl$State.dklx[10] = 1907282818;
        gl$State.dklx[11] = 2094168121;
        gl$State.dklx[12] = -405003649;
        gl$State.dklx[13] = 1529154379;
        gl$State.dklx[14] = 668485821;
        gl$State.dklx[15] = -1121293897;
        gl$State.dklx[16] = 682380674;
        gl$State.dklx[17] = -99712579;
        gl$State.dklx[18] = -1412697311;
        gl$State.dklx[19] = 135377651;
        gl$State.dklx[20] = -1113112845;
        gl$State.dklx[21] = 470790636;
        gl$State.dklx[22] = 989108069;
        gl$State.dklx[23] = 767047472;
        gl$State.dklx[24] = 1977136193;
        gl$State.dklx[25] = -1542546356;
        gl$State.dklx[26] = 741348424;
        gl$State.dklx[27] = -1482535975;
        gl$State.dklx[28] = -1903207390;
        gl$State.dklx[29] = -1085735229;
        gl$State.dklx[30] = -2138106678;
        gl$State.dklx[31] = -22734209;
        gl$State.dklx[32] = -1048987422;
        gl$State.dklx[33] = 829828318;
        gl$State.dklx[34] = 1430273539;
        gl$State.dklx[35] = -1115657953;
        gl$State.dklx[36] = -1186341877;
        gl$State.dklx[37] = 1703402665;
        gl$State.dklx[38] = 915730634;
        gl$State.dklx[39] = 2003144064;
        gl$State.dklx[40] = -665091280;
        gl$State.dklx[41] = 1528503475;
        gl$State.dklx[42] = -1919606435;
        gl$State.dklx[43] = -178768260;
        gl$State.dklx[44] = -707970755;
        gl$State.dklx[45] = 619204776;
        gl$State.dklx[46] = 1658115228;
        gl$State.dklx[47] = -1211404430;
        gl$State.dklx[48] = 1879660182;
        gl$State.dklx[49] = 1579356005;
        gl$State.dklx[50] = -837253244;
        gl$State.dklx[51] = -2088059093;
        gl$State.dklx[52] = 2084504012;
        gl$State.dklx[53] = 699028132;
        gl$State.dklx[54] = -1697954904;
        gl$State.dklx[55] = -245243243;
        gl$State.dklx[56] = 951324469;
        gl$State.dklx[57] = -1910755294;
        gl$State.dklx[58] = 1555185212;
        gl$State.dklx[59] = 968380718;
        gl$State.dklx[60] = -2018851882;
        gl$State.dklx[61] = -675738880;
    }

    static {
        dklw = new int[62];
        dklx = new int[62];
        gl$State.dkpz();
        gl$State.dkqa();
        dklr = new long[44];
        dkls = new long[44];
        gl$State.dkqb();
        gl$State.dkqc();
        ENSURING_FLIGHT = new gl$State();
        SEARCHING = new gl$State();
        ROUTING = new gl$State();
        CONFIRMING_ARRIVAL = new gl$State();
        DISABLING_FLIGHT = new gl$State();
        REPOSITION_TAKEOFF = new gl$State();
        REPOSITION_ROUTING = new gl$State();
        REPOSITION_DISABLING_FLIGHT = new gl$State();
        MINING = new gl$State();
        LOOTING = new gl$State();
        TAKING_OFF = new gl$State();
        NEXT_ROUTE_DELAY = new gl$State();
        $VALUES = gl$State.$values();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private gl$State() {
        block6: {
            int n3 = b;
            boolean bl2 = a;
            if (n3 == 0) return;
            switch (n3) {
                default: {
                    return;
                }
                case 0: {
                    break block6;
                }
                case 1: {
                    CallSite callSite = gl$State.dklt("dknf", dklv(int ), (int)21);
                    break;
                }
                case 2: 
            }
            CallSite callSite = gl$State.dklt("dkng", dklv(int ), (int)22);
        }
        while (true) {
            CallSite callSite = gl$State.dklt("dkne", dklv(int ), (int)20);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ gl$State[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$State.hs - gl$State.dklt("dknh", dklq(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$State.dklt("dkni", dklv(int ), (int)23)) break;
            v0 /* !! */  = (long)gl$State.dklt("dknj", dklv(int ), (int)24);
        }
        var2 = gl$State.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gl$State.hs - gl$State.dklt("dknk", dklq(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gl$State.dklt("dknl", dklv(int ), (int)25)) break;
            v1 /* !! */  = (long)gl$State.dklt("dknm", dklv(int ), (int)26);
        }
        var1_1 /* !! */  = gl$State.b;
        v2 /* !! */  = gl$State.hs;
        if (true) ** GOTO lbl19
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - gl$State.dklt("dknn", dklq(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2053425233: {
                    v3 = gl$State.dklt("dkno", dklq(int ), (int)16);
                    continue block42;
                }
                case -318510390: {
                    break block42;
                }
                case 910043127: {
                    v3 = gl$State.dklt("dknp", dklq(int ), (int)17);
                    continue block42;
                }
            }
            break;
        }
        var0_2 = gl$State.a;
        if (!var2) ** GOTO lbl35
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var0_2 || var0_2) continue block43;
                v4 = new gl$State[12];
                v5 = gl$State.dklt("dknq", dklv(int ), (int)27);
                while (true) {
                    if ((v6 = (cfr_temp_2 = gl$State.hs - gl$State.dklt("dknr", dklq(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == gl$State.dklt("dkns", dklv(int ), (int)28)) break;
                    v6 = -493388976;
                }
                v4[v5] = gl$State.ENSURING_FLIGHT;
                v7 = gl$State.dklt("dknt", dklv(int ), (int)29);
                while (true) {
                    if ((v8 = (cfr_temp_3 = gl$State.hs - gl$State.dklt("dknu", dklq(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 == gl$State.dklt("dknv", dklv(int ), (int)30)) break;
                    v8 = 702489534;
                }
                v4[v7] = gl$State.SEARCHING;
                v9 = gl$State.dklt("dknw", dklv(int ), (int)31);
                while (true) {
                    if ((v10 = (cfr_temp_4 = gl$State.hs - gl$State.dklt("dknx", dklq(int ), (int)20)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 == gl$State.dklt("dkny", dklv(int ), (int)32)) break;
                    v10 = 1318259663;
                }
                v4[v9] = gl$State.ROUTING;
                v11 = gl$State.dklt("dknz", dklv(int ), (int)33);
                v12 /* !! */  = gl$State.hs;
                if (true) ** GOTO lbl66
                block47: while (true) {
                    v12 /* !! */  = (long)(v13 - gl$State.dklt("dkoa", dklq(int ), (int)21));
lbl66:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -814013819: {
                            v13 = gl$State.dklt("dkob", dklq(int ), (int)22);
                            continue block47;
                        }
                        case -347080364: {
                            v13 = gl$State.dklt("dkoc", dklq(int ), (int)23);
                            continue block47;
                        }
                        case -318510390: {
                            break block47;
                        }
                        case 1844598038: {
                            v13 = gl$State.dklt("dkod", dklq(int ), (int)24);
                            continue block47;
                        }
                    }
                    break;
                }
                v4[v11] = gl$State.CONFIRMING_ARRIVAL;
                v14 = gl$State.dklt("dkoe", dklv(int ), (int)34);
                v15 /* !! */  = gl$State.hs;
                if (true) ** GOTO lbl84
                block48: while (true) {
                    v15 /* !! */  = (long)(v16 - gl$State.dklt("dkof", dklq(int ), (int)25));
lbl84:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1343861407: {
                            v16 = gl$State.dklt("dkog", dklq(int ), (int)26);
                            continue block48;
                        }
                        case -318510390: {
                            break block48;
                        }
                        case 774018547: {
                            v16 = gl$State.dklt("dkoh", dklq(int ), (int)27);
                            continue block48;
                        }
                    }
                    break;
                }
                v4[v14] = gl$State.DISABLING_FLIGHT;
                v17 = gl$State.dklt("dkoi", dklv(int ), (int)35);
                v18 /* !! */  = gl$State.hs;
                if (true) ** GOTO lbl99
                block49: while (true) {
                    v18 /* !! */  = (long)(v19 - gl$State.dklt("dkoj", dklq(int ), (int)28));
lbl99:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -318510390: {
                            break block49;
                        }
                        case 1156359338: {
                            v19 = gl$State.dklt("dkok", dklq(int ), (int)29);
                            continue block49;
                        }
                        case 1257982142: {
                            v19 = gl$State.dklt("dkol", dklq(int ), (int)30);
                            continue block49;
                        }
                        case 1331875912: {
                            v19 = gl$State.dklt("dkom", dklq(int ), (int)31);
                            continue block49;
                        }
                    }
                    break;
                }
                v4[v17] = gl$State.REPOSITION_TAKEOFF;
                v20 = gl$State.dklt("dkon", dklv(int ), (int)36);
                while (true) {
                    if ((v21 = (cfr_temp_5 = gl$State.hs - gl$State.dklt("dkoo", dklq(int ), (int)32)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 == gl$State.dklt("dkop", dklv(int ), (int)37)) break;
                    v21 = 1651232595;
                }
                v4[v20] = gl$State.REPOSITION_ROUTING;
                v22 = gl$State.dklt("dkoq", dklv(int ), (int)38);
                while (true) {
                    if ((v23 = (cfr_temp_6 = gl$State.hs - gl$State.dklt("dkor", dklq(int ), (int)33)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v23 == gl$State.dklt("dkos", dklv(int ), (int)39)) break;
                    v23 = -934133873;
                }
                v4[v22] = gl$State.REPOSITION_DISABLING_FLIGHT;
                v24 = gl$State.dklt("dkot", dklv(int ), (int)40);
                while (true) {
                    if ((v25 = (cfr_temp_7 = gl$State.hs - gl$State.dklt("dkou", dklq(int ), (int)34)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v25 == gl$State.dklt("dkov", dklv(int ), (int)41)) break;
                    v25 = -541408721;
                }
                v4[v24] = gl$State.MINING;
                v26 = gl$State.dklt("dkow", dklv(int ), (int)42);
                while (true) {
                    if ((v27 = (cfr_temp_8 = gl$State.hs - gl$State.dklt("dkox", dklq(int ), (int)35)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v27 == gl$State.dklt("dkoy", dklv(int ), (int)43)) break;
                    v27 = -1472414995;
                }
                v4[v26] = gl$State.LOOTING;
                v28 = gl$State.dklt("dkoz", dklv(int ), (int)44);
                v29 /* !! */  = gl$State.hs;
                if (true) ** GOTO lbl149
                block54: while (true) {
                    v29 /* !! */  = (long)(v30 - gl$State.dklt("dkpa", dklq(int ), (int)36));
lbl149:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1794386385: {
                            v30 = gl$State.dklt("dkpb", dklq(int ), (int)37);
                            continue block54;
                        }
                        case -318510390: {
                            break block54;
                        }
                        case 1431631293: {
                            v30 = gl$State.dklt("dkpc", dklq(int ), (int)38);
                            continue block54;
                        }
                        case 2139024255: {
                            v30 = gl$State.dklt("dkpd", dklq(int ), (int)39);
                            continue block54;
                        }
                    }
                    break;
                }
                v4[v28] = gl$State.TAKING_OFF;
                v31 = gl$State.dklt("dkpe", dklv(int ), (int)45);
                v32 /* !! */  = gl$State.hs;
                if (true) ** GOTO lbl167
                block55: while (true) {
                    v32 /* !! */  = (long)(v33 - gl$State.dklt("dkpf", dklq(int ), (int)40));
lbl167:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1741187465: {
                            v33 = gl$State.dklt("dkpg", dklq(int ), (int)41);
                            continue block55;
                        }
                        case -318510390: {
                            break block55;
                        }
                        case 1541712366: {
                            v33 = gl$State.dklt("dkph", dklq(int ), (int)42);
                            continue block55;
                        }
                        case 1677208484: {
                            v33 = gl$State.dklt("dkpi", dklq(int ), (int)43);
                            continue block55;
                        }
                    }
                    break;
                }
                v4[v31] = gl$State.NEXT_ROUTE_DELAY;
                return v4;
                case 0: {
                    var1_1 /* !! */  = (int)gl$State.dklt("dkpj", dklv(int ), (int)46);
                    if (!var2) break block43;
                    throw null;
                }
lbl185:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)gl$State.dklt("dkpk", dklv(int ), (int)47);
                        if (!var2) break block43;
                        throw null;
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)gl$State.dklt("dkpl", dklv(int ), (int)48);
                    if (!var2) ** GOTO lbl185
                    throw null;
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)gl$State.dklt("dkpm", dklv(int ), (int)49);
        ** while (!var2)
lbl197:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dkqc() {
        gl$State.dkls[0] = 4196137111848864326L;
        gl$State.dkls[1] = 193819887048825550L;
        gl$State.dkls[2] = 3158718421246623714L;
        gl$State.dkls[3] = -2718564613815085932L;
        gl$State.dkls[4] = -5280290392333809346L;
        gl$State.dkls[5] = 1657038316477421814L;
        gl$State.dkls[6] = 1752020091825106310L;
        gl$State.dkls[7] = 7930275429928938746L;
        gl$State.dkls[8] = 1457629766207251499L;
        gl$State.dkls[9] = -8691626964025317410L;
        gl$State.dkls[10] = 7489050749618775980L;
        gl$State.dkls[11] = -4454853831800879051L;
        gl$State.dkls[12] = 1701442216493594094L;
        gl$State.dkls[13] = -2156039069142194155L;
        gl$State.dkls[14] = 8245196418370398407L;
        gl$State.dkls[15] = 5761086091960689447L;
        gl$State.dkls[16] = 6840392163367757440L;
        gl$State.dkls[17] = -2425066695911155640L;
        gl$State.dkls[18] = -6909704673549828601L;
        gl$State.dkls[19] = 6658624864874851614L;
        gl$State.dkls[20] = -5566033178881808369L;
        gl$State.dkls[21] = -2020859927583572677L;
        gl$State.dkls[22] = -3726164290007063085L;
        gl$State.dkls[23] = 4117273642842886543L;
        gl$State.dkls[24] = 1699759449556201301L;
        gl$State.dkls[25] = 1266238310488809243L;
        gl$State.dkls[26] = 8711262989150659649L;
        gl$State.dkls[27] = 8401037918497230439L;
        gl$State.dkls[28] = 928892347823766925L;
        gl$State.dkls[29] = 3714238331306946043L;
        gl$State.dkls[30] = 2442420510849050119L;
        gl$State.dkls[31] = 4142955042877167640L;
        gl$State.dkls[32] = 1860109036968429921L;
        gl$State.dkls[33] = -183603938666448214L;
        gl$State.dkls[34] = 6287938625949410774L;
        gl$State.dkls[35] = -3359574035673093876L;
        gl$State.dkls[36] = -7856361008739645313L;
        gl$State.dkls[37] = -1383637108567850024L;
        gl$State.dkls[38] = -2014288688059647006L;
        gl$State.dkls[39] = 8085145040828813799L;
        gl$State.dkls[40] = 2413893234496472220L;
        gl$State.dkls[41] = -7808171201831748312L;
        gl$State.dkls[42] = -2003474878678251980L;
        gl$State.dkls[43] = 1414277578015717522L;
    }

    private static /* synthetic */ int dklv(int n2) {
        return dklw[n2] ^ dklx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gl$State[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$State.hs - gl$State.dklt("dklu", dklq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$State.dklt("dkly", dklv(int ), (int)0)) break;
            v0 /* !! */  = (long)gl$State.dklt("dklz", dklv(int ), (int)1);
        }
        var2 = gl$State.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gl$State.hs - gl$State.dklt("dkma", dklq(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gl$State.dklt("dkmb", dklv(int ), (int)2)) break;
            v1 /* !! */  = (long)gl$State.dklt("dkmc", dklv(int ), (int)3);
        }
        var1_1 /* !! */  = gl$State.b;
        v2 /* !! */  = gl$State.hs;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - gl$State.dklt("dkmd", dklq(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -318510390: {
                    break block13;
                }
                case 82504837: {
                    v3 = gl$State.dklt("dkme", dklq(int ), (int)3);
                    continue block13;
                }
                case 1863549100: {
                    v3 = gl$State.dklt("dkmf", dklq(int ), (int)4);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = gl$State.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gl$State.hs - gl$State.dklt("dkmg", dklq(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gl$State.dklt("dkmh", dklv(int ), (int)4)) break;
                    v4 /* !! */  = (long)gl$State.dklt("dkmi", dklv(int ), (int)5);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gl$State.hs - gl$State.dklt("dkmj", dklq(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gl$State.dklt("dkmk", dklv(int ), (int)6)) break;
                    v5 /* !! */  = (long)gl$State.dklt("dkml", dklv(int ), (int)7);
                }
                return (gl$State[])gl$State.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)gl$State.dklt("dkmm", dklv(int ), (int)8);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)gl$State.dklt("dkmn", dklv(int ), (int)9);
                } while (!var2);
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)gl$State.dklt("dkmo", dklv(int ), (int)10);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)gl$State.dklt("dkmp", dklv(int ), (int)11);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ long dklq(int n2) {
        return dklr[n2] ^ dkls[n2];
    }
}

