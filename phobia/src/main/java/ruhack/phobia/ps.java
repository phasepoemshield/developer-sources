/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.Instant;

public class ps {
    public static final int b;
    private static int[] ewdw;
    private static long[] ewdq;
    private static long[] ewdr;
    private long lastMS;
    private long startTime;
    public static final boolean a;
    private static int[] ewdv;
    protected static final long lk = 9185581418190085290L;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setLastMS(long var1_1) {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ps.ewds("ewhm", ewdp(int ), (int)42));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2084137203: {
                    v1 = ps.ewds("ewhn", ewdp(int ), (int)43);
                    continue block25;
                }
                case -1939122073: {
                    v1 = ps.ewds("ewho", ewdp(int ), (int)44);
                    continue block25;
                }
                case -291103574: {
                    break block25;
                }
                case 1014680157: {
                    v1 = ps.ewds("ewhp", ewdp(int ), (int)45);
                    continue block25;
                }
            }
            break;
        }
        var5_2 = ps.c;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - ps.ewds("ewhq", ewdp(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1245878811: {
                    v3 = ps.ewds("ewhr", ewdp(int ), (int)47);
                    continue block26;
                }
                case -291103574: {
                    break block26;
                }
                case 443305244: {
                    v3 = ps.ewds("ewhs", ewdp(int ), (int)48);
                    continue block26;
                }
            }
            break;
        }
        var4_3 /* !! */  = ps.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewht", ewdp(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ps.ewds("ewhu", ewdu(int ), (int)52)) break;
            v4 /* !! */  = (long)ps.ewds("ewhv", ewdu(int ), (int)53);
        }
        var3_4 = ps.a;
        if (var5_2) {
            throw null;
lbl40:
            // 3 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl40
        v5 /* !! */  = ps.lk;
        if (true) ** GOTO lbl47
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - ps.ewds("ewhw", ewdp(int ), (int)50));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1453077908: {
                    v6 = ps.ewds("ewhx", ewdp(int ), (int)51);
                    continue block29;
                }
                case -291103574: {
                    break block29;
                }
                case 947920063: {
                    v6 = ps.ewds("ewhy", ewdp(int ), (int)52);
                    continue block29;
                }
                case 1578030282: {
                    v6 = ps.ewds("ewhz", ewdp(int ), (int)53);
                    continue block29;
                }
            }
            break;
        }
        v7 = System.currentTimeMillis() + var1_1;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewia", ewdp(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ps.ewds("ewib", ewdu(int ), (int)54)) break;
            v8 /* !! */  = (long)ps.ewds("ewic", ewdu(int ), (int)55);
        }
        this.lastMS = v7;
        if (var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                return;
            }
lbl73:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ps.ewds("ewid", ewdu(int ), (int)56);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl78:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ps.ewds("ewie", ewdu(int ), (int)57);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl88
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)ps.ewds("ewif", ewdu(int ), (int)58);
                if (!var5_2) ** GOTO lbl73
                throw null;
            }
lbl88:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)ps.ewds("ewig", ewdu(int ), (int)59);
                if (!var5_2) break;
                throw null;
            }
lbl92:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ps.ewds("ewih", ewdu(int ), (int)60);
                if (!var5_2) ** GOTO lbl78
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)ps.ewds("ewii", ewdu(int ), (int)61);
        ** while (!var5_2)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ewpj() {
        ps.ewdv[100] = 841510785;
        ps.ewdv[101] = -1944752135;
        ps.ewdv[102] = 2043707229;
        ps.ewdv[103] = -33150573;
        ps.ewdv[104] = -1579494219;
        ps.ewdv[105] = 896162921;
        ps.ewdv[106] = 970629718;
        ps.ewdv[107] = -1443394868;
        ps.ewdv[108] = 921363183;
        ps.ewdv[109] = -1750931913;
        ps.ewdv[110] = -1955358098;
        ps.ewdv[111] = 416402600;
        ps.ewdv[112] = 557064131;
        ps.ewdv[113] = -2060488043;
        ps.ewdv[114] = -2006674380;
        ps.ewdv[115] = -571256715;
        ps.ewdv[116] = -1689661672;
        ps.ewdv[117] = 1380435760;
        ps.ewdv[118] = -1552853910;
        ps.ewdv[119] = -1307994793;
        ps.ewdv[120] = 645349671;
        ps.ewdv[121] = -17528276;
        ps.ewdv[122] = -840487451;
        ps.ewdv[123] = 30509676;
        ps.ewdv[124] = 127571616;
        ps.ewdv[125] = -1124848323;
        ps.ewdv[126] = 627059936;
        ps.ewdv[127] = 1574815295;
        ps.ewdv[128] = 1551272916;
        ps.ewdv[129] = -1964045503;
        ps.ewdv[130] = 1161268570;
        ps.ewdv[131] = -1789249408;
        ps.ewdv[132] = -492956242;
        ps.ewdv[133] = -1581206011;
        ps.ewdv[134] = -1555661151;
        ps.ewdv[135] = 2032663642;
        ps.ewdv[136] = 2045454827;
        ps.ewdv[137] = -2024415440;
        ps.ewdv[138] = -1034987983;
        ps.ewdv[139] = 990732084;
        ps.ewdv[140] = -2133609548;
        ps.ewdv[141] = 1468278724;
        ps.ewdv[142] = -493606943;
        ps.ewdv[143] = 219886596;
        ps.ewdv[144] = 1004086379;
        ps.ewdv[145] = -836964985;
        ps.ewdv[146] = 1166674913;
        ps.ewdv[147] = -918207615;
        ps.ewdv[148] = -1112336232;
        ps.ewdv[149] = 417398867;
        ps.ewdv[150] = 2083501401;
        ps.ewdv[151] = 806701312;
        ps.ewdv[152] = 611022752;
        ps.ewdv[153] = -1422645147;
        ps.ewdv[154] = 1868760897;
        ps.ewdv[155] = 1177504811;
        ps.ewdv[156] = -1046460759;
        ps.ewdv[157] = 1480314608;
        ps.ewdv[158] = 1478467667;
        ps.ewdv[159] = 1535677741;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isReached(long var1_1) {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - ps.ewds("ewgm", ewdp(int ), (int)29));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1183519590: {
                    v1 = ps.ewds("ewgn", ewdp(int ), (int)30);
                    continue block30;
                }
                case -291103574: {
                    break block30;
                }
                case 1019482951: {
                    v1 = ps.ewds("ewgo", ewdp(int ), (int)31);
                    continue block30;
                }
            }
            break;
        }
        var5_2 = ps.c;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl19
        block31: while (true) {
            v2 /* !! */  = (long)(ps.ewds("ewgq", ewdp(int ), (int)33) - ps.ewds("ewgp", ewdp(int ), (int)32));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -291103574: {
                    break block31;
                }
                case -245496829: {
                    continue block31;
                }
            }
            break;
        }
        var4_3 /* !! */  = ps.b;
        v3 /* !! */  = ps.lk;
        if (true) ** GOTO lbl29
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - ps.ewds("ewgr", ewdp(int ), (int)34));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1535710607: {
                    v4 = ps.ewds("ewgs", ewdp(int ), (int)35);
                    continue block32;
                }
                case -291103574: {
                    break block32;
                }
                case -256827354: {
                    v4 = ps.ewds("ewgt", ewdp(int ), (int)36);
                    continue block32;
                }
                case 387331423: {
                    v4 = ps.ewds("ewgu", ewdp(int ), (int)37);
                    continue block32;
                }
            }
            break;
        }
        var3_4 = ps.a;
        if (var5_2) {
            throw null;
lbl44:
            // 3 sources

            return (boolean)ps.ewds("ewgv", ewdu(int ), (int)39);
        }
        if (var3_4 || var3_4) ** GOTO lbl44
        v5 /* !! */  = ps.lk;
        if (true) ** GOTO lbl51
        block34: while (true) {
            v5 /* !! */  = (long)(v6 - ps.ewds("ewgw", ewdp(int ), (int)38));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1954263019: {
                    v6 = ps.ewds("ewgx", ewdp(int ), (int)39);
                    continue block34;
                }
                case -291103574: {
                    break block34;
                }
                case 1342842775: {
                    v6 = ps.ewds("ewgy", ewdp(int ), (int)40);
                    continue block34;
                }
            }
            break;
        }
        v7 = System.currentTimeMillis();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewgz", ewdp(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == ps.ewds("ewha", ewdu(int ), (int)40)) break;
            v8 /* !! */  = (long)ps.ewds("ewhb", ewdu(int ), (int)41);
        }
        if (v7 - this.lastMS <= var1_1) ** GOTO lbl76
        if (var3_4) ** GOTO lbl44
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 = ps.ewds("ewhc", ewdu(int ), (int)42);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl76:
            // 1 sources

            if (!var3_4 && !var3_4) ** break;
            ** continue;
            v9 = ps.ewds("ewhd", ewdu(int ), (int)43);
lbl79:
            // 2 sources

            return (boolean)v9;
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ps.ewds("ewhe", ewdu(int ), (int)44);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl105
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)ps.ewds("ewhf", ewdu(int ), (int)45);
                if (!var5_2) break;
                throw null;
            }
            case 2: {
                var4_3 /* !! */  = (int)ps.ewds("ewhg", ewdu(int ), (int)46);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl95:
            // 3 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewhh", ewdu(int ), (int)47);
                } while (!var5_2);
                throw null;
            }
lbl100:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ps.ewds("ewhi", ewdu(int ), (int)48);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl105:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)ps.ewds("ewhj", ewdu(int ), (int)49);
                if (!var5_2) ** GOTO lbl95
                throw null;
            }
lbl109:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)ps.ewds("ewhk", ewdu(int ), (int)50);
                if (!var5_2) ** GOTO lbl95
                throw null;
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)ps.ewds("ewhl", ewdu(int ), (int)51);
        ** while (!var5_2)
lbl116:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ewpp() {
        ps.ewdr[100] = -4161714180407730108L;
        ps.ewdr[101] = 4477930904379407269L;
        ps.ewdr[102] = -1512942695775480663L;
        ps.ewdr[103] = -5894925299536645061L;
        ps.ewdr[104] = -8971785045369530624L;
        ps.ewdr[105] = -4948190618661681502L;
        ps.ewdr[106] = -6832256247417005564L;
        ps.ewdr[107] = -8141188494666473977L;
        ps.ewdr[108] = 47987369196276723L;
        ps.ewdr[109] = 4021177154094347570L;
        ps.ewdr[110] = 78621809855323631L;
        ps.ewdr[111] = 7311337489810338373L;
        ps.ewdr[112] = -5324984162092322420L;
        ps.ewdr[113] = 7308780273707654471L;
        ps.ewdr[114] = 4631834833303088912L;
        ps.ewdr[115] = 4748552145024851076L;
        ps.ewdr[116] = -5975034171099901180L;
        ps.ewdr[117] = -7107603623668099413L;
        ps.ewdr[118] = 5967748451640458098L;
        ps.ewdr[119] = -5741147849594136375L;
        ps.ewdr[120] = -1395723751898389890L;
        ps.ewdr[121] = -2336830226619940800L;
        ps.ewdr[122] = -900795898649385297L;
        ps.ewdr[123] = -816719102174266410L;
        ps.ewdr[124] = 1565342791840198297L;
        ps.ewdr[125] = 7459043821382019975L;
        ps.ewdr[126] = -1905904486940743629L;
        ps.ewdr[127] = -9061483685742004673L;
        ps.ewdr[128] = 2334809072709257480L;
        ps.ewdr[129] = -8253272500801487574L;
        ps.ewdr[130] = -2068487490018378241L;
        ps.ewdr[131] = 7836605485558416937L;
        ps.ewdr[132] = 2499511562937043282L;
        ps.ewdr[133] = -4215040814424894074L;
        ps.ewdr[134] = -2062271192177281815L;
        ps.ewdr[135] = -5476434596600210950L;
        ps.ewdr[136] = 2691516805080729379L;
        ps.ewdr[137] = -8171389576223662759L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void resetCounter() {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ps.ewds("ewfr", ewdp(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -696694400: {
                    v1 = ps.ewds("ewfs", ewdp(int ), (int)19);
                    continue block23;
                }
                case -291103574: {
                    break block23;
                }
                case 1093393584: {
                    v1 = ps.ewds("ewft", ewdp(int ), (int)20);
                    continue block23;
                }
                case 1809907368: {
                    v1 = ps.ewds("ewfu", ewdp(int ), (int)21);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = ps.c;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - ps.ewds("ewfv", ewdp(int ), (int)22));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1160559674: {
                    v3 = ps.ewds("ewfw", ewdp(int ), (int)23);
                    continue block24;
                }
                case -1118487047: {
                    v3 = ps.ewds("ewfx", ewdp(int ), (int)24);
                    continue block24;
                }
                case -291103574: {
                    break block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ps.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewfy", ewdp(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ps.ewds("ewfz", ewdu(int ), (int)29)) break;
            v4 /* !! */  = (long)ps.ewds("ewga", ewdu(int ), (int)30);
        }
        var1_3 = ps.a;
        if (var3_1) {
            throw null;
lbl40:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewgb", ewdp(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ps.ewds("ewgc", ewdu(int ), (int)31)) break;
                    v5 /* !! */  = (long)ps.ewds("ewgd", ewdu(int ), (int)32);
                }
                v6 = System.currentTimeMillis();
                v7 /* !! */  = ps.lk;
                if (true) ** GOTO lbl57
                block28: while (true) {
                    v7 /* !! */  = (long)(ps.ewds("ewgf", ewdp(int ), (int)28) - ps.ewds("ewge", ewdp(int ), (int)27));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -291103574: {
                            break block28;
                        }
                        case 1655078212: {
                            continue block28;
                        }
                    }
                    break;
                }
                this.lastMS = v6;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ps.ewds("ewgg", ewdu(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl71:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ps.ewds("ewgh", ewdu(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ps.ewds("ewgi", ewdu(int ), (int)35);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ps.ewds("ewgj", ewdu(int ), (int)36);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
            }
lbl84:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)ps.ewds("ewgk", ewdu(int ), (int)37);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ps.ewds("ewgl", ewdu(int ), (int)38);
        ** while (!var3_1)
lbl92:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ewpi() {
        ps.ewdv[0] = 189997473;
        ps.ewdv[1] = 320685335;
        ps.ewdv[2] = 2049758034;
        ps.ewdv[3] = 490655028;
        ps.ewdv[4] = -747570626;
        ps.ewdv[5] = -1964424876;
        ps.ewdv[6] = 662410370;
        ps.ewdv[7] = 523401120;
        ps.ewdv[8] = -94709464;
        ps.ewdv[9] = -372888997;
        ps.ewdv[10] = 829865878;
        ps.ewdv[11] = 669268039;
        ps.ewdv[12] = 1762326142;
        ps.ewdv[13] = -804741169;
        ps.ewdv[14] = 1191980257;
        ps.ewdv[15] = 940089768;
        ps.ewdv[16] = -954547640;
        ps.ewdv[17] = 905290577;
        ps.ewdv[18] = 1020175480;
        ps.ewdv[19] = -1106026225;
        ps.ewdv[20] = 1773966930;
        ps.ewdv[21] = -1585616250;
        ps.ewdv[22] = 98616121;
        ps.ewdv[23] = -1797663476;
        ps.ewdv[24] = -2114377630;
        ps.ewdv[25] = -1894725516;
        ps.ewdv[26] = -1505003790;
        ps.ewdv[27] = -1781596628;
        ps.ewdv[28] = -1569040181;
        ps.ewdv[29] = 2030313228;
        ps.ewdv[30] = 1128956161;
        ps.ewdv[31] = 220772022;
        ps.ewdv[32] = -1086293201;
        ps.ewdv[33] = 210713492;
        ps.ewdv[34] = -912008898;
        ps.ewdv[35] = -794848805;
        ps.ewdv[36] = 380571250;
        ps.ewdv[37] = -631595612;
        ps.ewdv[38] = 1325270737;
        ps.ewdv[39] = -1869606001;
        ps.ewdv[40] = 788415295;
        ps.ewdv[41] = -2000103226;
        ps.ewdv[42] = 1781668038;
        ps.ewdv[43] = 1056293161;
        ps.ewdv[44] = -1954955783;
        ps.ewdv[45] = -2088813365;
        ps.ewdv[46] = -662695789;
        ps.ewdv[47] = -1591935063;
        ps.ewdv[48] = -288295618;
        ps.ewdv[49] = 1289869792;
        ps.ewdv[50] = 1754475258;
        ps.ewdv[51] = -436113986;
        ps.ewdv[52] = -524990074;
        ps.ewdv[53] = 124250813;
        ps.ewdv[54] = 1844197304;
        ps.ewdv[55] = -1569428359;
        ps.ewdv[56] = -808753007;
        ps.ewdv[57] = 820088660;
        ps.ewdv[58] = -572457282;
        ps.ewdv[59] = -220829176;
        ps.ewdv[60] = -730811507;
        ps.ewdv[61] = 1498880516;
        ps.ewdv[62] = -1016159016;
        ps.ewdv[63] = -1185264103;
        ps.ewdv[64] = -1062428411;
        ps.ewdv[65] = -2099064766;
        ps.ewdv[66] = -599328391;
        ps.ewdv[67] = 1067112112;
        ps.ewdv[68] = 1764236777;
        ps.ewdv[69] = -2004542990;
        ps.ewdv[70] = -1979585331;
        ps.ewdv[71] = 1250910604;
        ps.ewdv[72] = -2086999365;
        ps.ewdv[73] = 24562007;
        ps.ewdv[74] = 1418223870;
        ps.ewdv[75] = -373800966;
        ps.ewdv[76] = -135794996;
        ps.ewdv[77] = 1401791198;
        ps.ewdv[78] = 992600752;
        ps.ewdv[79] = 430952063;
        ps.ewdv[80] = -1356749793;
        ps.ewdv[81] = -2090927342;
        ps.ewdv[82] = 74520310;
        ps.ewdv[83] = 1627289840;
        ps.ewdv[84] = 916437074;
        ps.ewdv[85] = -1245390251;
        ps.ewdv[86] = 676587620;
        ps.ewdv[87] = -2042186885;
        ps.ewdv[88] = 2073171793;
        ps.ewdv[89] = -1043302443;
        ps.ewdv[90] = -116716338;
        ps.ewdv[91] = 2111476927;
        ps.ewdv[92] = 463522511;
        ps.ewdv[93] = -1435429772;
        ps.ewdv[94] = -832240011;
        ps.ewdv[95] = 1735108971;
        ps.ewdv[96] = 1438860995;
        ps.ewdv[97] = 1331876880;
        ps.ewdv[98] = 549539874;
        ps.ewdv[99] = 1467721781;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getTime() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewiz", ewdp(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ps.ewds("ewja", ewdu(int ), (int)72)) break;
            v0 /* !! */  = (long)ps.ewds("ewjb", ewdu(int ), (int)73);
        }
        var3_1 = ps.c;
        v1 /* !! */  = ps.lk;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - ps.ewds("ewjc", ewdp(int ), (int)62));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1716986098: {
                    v2 = ps.ewds("ewjd", ewdp(int ), (int)63);
                    continue block25;
                }
                case -1703425974: {
                    v2 = ps.ewds("ewje", ewdp(int ), (int)64);
                    continue block25;
                }
                case -291103574: {
                    break block25;
                }
                case 495101544: {
                    v2 = ps.ewds("ewjf", ewdp(int ), (int)65);
                    continue block25;
                }
            }
            break;
        }
        var2_2 = ps.b;
        v3 /* !! */  = ps.lk;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - ps.ewds("ewjg", ewdp(int ), (int)66));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1474714696: {
                    v4 = ps.ewds("ewjh", ewdp(int ), (int)67);
                    continue block26;
                }
                case -384488516: {
                    v4 = ps.ewds("ewji", ewdp(int ), (int)68);
                    continue block26;
                }
                case -291103574: {
                    break block26;
                }
                case 1633629463: {
                    v4 = ps.ewds("ewjj", ewdp(int ), (int)69);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = ps.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return (long)ps.ewds("ewjk", ewdp(int ), (int)70);
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        v5 /* !! */  = ps.lk;
        if (true) ** GOTO lbl51
        block28: while (true) {
            v5 /* !! */  = (long)(v6 - ps.ewds("ewjl", ewdp(int ), (int)71));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -475458117: {
                    v6 = ps.ewds("ewjm", ewdp(int ), (int)72);
                    continue block28;
                }
                case -291103574: {
                    break block28;
                }
                case 427684386: {
                    v6 = ps.ewds("ewjn", ewdp(int ), (int)73);
                    continue block28;
                }
                case 1074067825: {
                    v6 = ps.ewds("ewjo", ewdp(int ), (int)74);
                    continue block28;
                }
            }
            break;
        }
        v7 = System.currentTimeMillis();
        v8 /* !! */  = ps.lk;
        if (true) ** GOTO lbl68
        block29: while (true) {
            v8 /* !! */  = (long)(v9 - ps.ewds("ewjp", ewdp(int ), (int)75));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1260458166: {
                    v9 = ps.ewds("ewjq", ewdp(int ), (int)76);
                    continue block29;
                }
                case -291103574: {
                    break block29;
                }
                case 891526557: {
                    v9 = ps.ewds("ewjr", ewdp(int ), (int)77);
                    continue block29;
                }
                case 1719146985: {
                    v9 = ps.ewds("ewjs", ewdp(int ), (int)78);
                    continue block29;
                }
            }
            break;
        }
        return v7 - this.lastMS;
    }

    private static /* synthetic */ void ewpn() {
        ps.ewdq[100] = -306306911947079651L;
        ps.ewdq[101] = 788325037150438730L;
        ps.ewdq[102] = -3908443955424841584L;
        ps.ewdq[103] = 18079733155808940L;
        ps.ewdq[104] = 5316636406751905340L;
        ps.ewdq[105] = 211013446583031882L;
        ps.ewdq[106] = -1598956284696461537L;
        ps.ewdq[107] = -6410421154715260801L;
        ps.ewdq[108] = -1448506535776267764L;
        ps.ewdq[109] = -5133712370005330099L;
        ps.ewdq[110] = 6155383909341002128L;
        ps.ewdq[111] = 4968758281646329082L;
        ps.ewdq[112] = 5126606338679587151L;
        ps.ewdq[113] = -2989415237241820663L;
        ps.ewdq[114] = -5028463360134330515L;
        ps.ewdq[115] = 3831205093622001579L;
        ps.ewdq[116] = 3725253851284377795L;
        ps.ewdq[117] = 8767088687658072433L;
        ps.ewdq[118] = 7032534110812777617L;
        ps.ewdq[119] = -8277515962897829844L;
        ps.ewdq[120] = 7949784135571671460L;
        ps.ewdq[121] = 6786651115413118426L;
        ps.ewdq[122] = -4523586200467296298L;
        ps.ewdq[123] = -2064152551304255826L;
        ps.ewdq[124] = 5893182475408796023L;
        ps.ewdq[125] = -4594215555051883088L;
        ps.ewdq[126] = -7698649617322635634L;
        ps.ewdq[127] = -6529002540880601898L;
        ps.ewdq[128] = -3248878338920437700L;
        ps.ewdq[129] = 408994195774698537L;
        ps.ewdq[130] = -6392473559076663924L;
        ps.ewdq[131] = 6641467872704858967L;
        ps.ewdq[132] = 2546836643027846965L;
        ps.ewdq[133] = 8169999603679566333L;
        ps.ewdq[134] = -6836244723535449150L;
        ps.ewdq[135] = 553955652569137202L;
        ps.ewdq[136] = -4992089828601359836L;
        ps.ewdq[137] = 1697326015949129902L;
    }

    private static /* synthetic */ void ewpk() {
        ps.ewdw[0] = 189997472;
        ps.ewdw[1] = -1013666191;
        ps.ewdw[2] = 2049758035;
        ps.ewdw[3] = -869966847;
        ps.ewdw[4] = -747570625;
        ps.ewdw[5] = 102564454;
        ps.ewdw[6] = 662410371;
        ps.ewdw[7] = -374653723;
        ps.ewdw[8] = -94709459;
        ps.ewdw[9] = -372888998;
        ps.ewdw[10] = 829865874;
        ps.ewdw[11] = 669268037;
        ps.ewdw[12] = 1762326143;
        ps.ewdw[13] = -804741171;
        ps.ewdw[14] = 1191980256;
        ps.ewdw[15] = 940089770;
        ps.ewdw[16] = -954547640;
        ps.ewdw[17] = 905290581;
        ps.ewdw[18] = 1020175481;
        ps.ewdw[19] = -1106026226;
        ps.ewdw[20] = 1383594287;
        ps.ewdw[21] = -1585616249;
        ps.ewdw[22] = 779752025;
        ps.ewdw[23] = -1797663475;
        ps.ewdw[24] = 1402760755;
        ps.ewdw[25] = -1894725516;
        ps.ewdw[26] = -1505003792;
        ps.ewdw[27] = -1781596626;
        ps.ewdw[28] = -1569040184;
        ps.ewdw[29] = 2030313229;
        ps.ewdw[30] = 1409368973;
        ps.ewdw[31] = 220772023;
        ps.ewdw[32] = -1745002343;
        ps.ewdw[33] = 210713495;
        ps.ewdw[34] = -912008901;
        ps.ewdw[35] = -794848805;
        ps.ewdw[36] = 380571254;
        ps.ewdw[37] = -631595611;
        ps.ewdw[38] = 1325270740;
        ps.ewdw[39] = -1869606002;
        ps.ewdw[40] = 788415294;
        ps.ewdw[41] = 1723265346;
        ps.ewdw[42] = 1781668039;
        ps.ewdw[43] = 1056293161;
        ps.ewdw[44] = -1954955777;
        ps.ewdw[45] = -2088813363;
        ps.ewdw[46] = -662695785;
        ps.ewdw[47] = -1591935064;
        ps.ewdw[48] = -288295624;
        ps.ewdw[49] = 1289869796;
        ps.ewdw[50] = 1754475256;
        ps.ewdw[51] = -436113992;
        ps.ewdw[52] = -524990073;
        ps.ewdw[53] = -340159976;
        ps.ewdw[54] = 1844197305;
        ps.ewdw[55] = 2058529211;
        ps.ewdw[56] = -808753005;
        ps.ewdw[57] = 820088662;
        ps.ewdw[58] = -572457283;
        ps.ewdw[59] = -220829173;
        ps.ewdw[60] = -730811512;
        ps.ewdw[61] = 1498880517;
        ps.ewdw[62] = -1016159015;
        ps.ewdw[63] = -1498989022;
        ps.ewdw[64] = -1062428412;
        ps.ewdw[65] = -2132890102;
        ps.ewdw[66] = -599328388;
        ps.ewdw[67] = 1067112112;
        ps.ewdw[68] = 1764236781;
        ps.ewdw[69] = -2004542986;
        ps.ewdw[70] = -1979585331;
        ps.ewdw[71] = 1250910605;
        ps.ewdw[72] = -2086999366;
        ps.ewdw[73] = 1902069772;
        ps.ewdw[74] = 1418223871;
        ps.ewdw[75] = -373800966;
        ps.ewdw[76] = -135794994;
        ps.ewdw[77] = 1401791198;
        ps.ewdw[78] = 992600753;
        ps.ewdw[79] = 1053739611;
        ps.ewdw[80] = -1356749794;
        ps.ewdw[81] = 1332483597;
        ps.ewdw[82] = 74520311;
        ps.ewdw[83] = 1627289841;
        ps.ewdw[84] = 1199766159;
        ps.ewdw[85] = -1245390252;
        ps.ewdw[86] = 676587620;
        ps.ewdw[87] = -2042186881;
        ps.ewdw[88] = 2073171792;
        ps.ewdw[89] = -1043302448;
        ps.ewdw[90] = -116716344;
        ps.ewdw[91] = 2111476920;
        ps.ewdw[92] = 463522508;
        ps.ewdw[93] = -1435429776;
        ps.ewdw[94] = -832240013;
        ps.ewdw[95] = 1735108970;
        ps.ewdw[96] = 1438860994;
        ps.ewdw[97] = 1331876880;
        ps.ewdw[98] = 549539875;
        ps.ewdw[99] = 1467721780;
    }

    public static /* synthetic */ CallSite ewds(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ewpl() {
        ps.ewdw[100] = 841510788;
        ps.ewdw[101] = -1944752134;
        ps.ewdw[102] = 2043707229;
        ps.ewdw[103] = -33150571;
        ps.ewdw[104] = -1579494219;
        ps.ewdw[105] = 896162921;
        ps.ewdw[106] = 970629719;
        ps.ewdw[107] = 504647384;
        ps.ewdw[108] = 921363182;
        ps.ewdw[109] = -1750931914;
        ps.ewdw[110] = -880147950;
        ps.ewdw[111] = 416402601;
        ps.ewdw[112] = 182358505;
        ps.ewdw[113] = -2060488044;
        ps.ewdw[114] = -2006674380;
        ps.ewdw[115] = -571256716;
        ps.ewdw[116] = -1689661668;
        ps.ewdw[117] = 1380435767;
        ps.ewdw[118] = -1552853910;
        ps.ewdw[119] = -1307994798;
        ps.ewdw[120] = 645349668;
        ps.ewdw[121] = -17528274;
        ps.ewdw[122] = -840487450;
        ps.ewdw[123] = 30509677;
        ps.ewdw[124] = -1912615177;
        ps.ewdw[125] = -1124848324;
        ps.ewdw[126] = -267930916;
        ps.ewdw[127] = 1574815295;
        ps.ewdw[128] = 1551272917;
        ps.ewdw[129] = -1377215369;
        ps.ewdw[130] = 1161268571;
        ps.ewdw[131] = -810135186;
        ps.ewdw[132] = -492956241;
        ps.ewdw[133] = -1581206011;
        ps.ewdw[134] = -1555661152;
        ps.ewdw[135] = 2032663640;
        ps.ewdw[136] = 2045454825;
        ps.ewdw[137] = -2024415434;
        ps.ewdw[138] = -1034987984;
        ps.ewdw[139] = 990732084;
        ps.ewdw[140] = -2133609548;
        ps.ewdw[141] = 1468278724;
        ps.ewdw[142] = -493606944;
        ps.ewdw[143] = 132370390;
        ps.ewdw[144] = 1004086378;
        ps.ewdw[145] = -696119715;
        ps.ewdw[146] = 1166674912;
        ps.ewdw[147] = 1051713477;
        ps.ewdw[148] = -1112336229;
        ps.ewdw[149] = 417398865;
        ps.ewdw[150] = 2083501401;
        ps.ewdw[151] = 806701315;
        ps.ewdw[152] = 611022753;
        ps.ewdw[153] = 1716324257;
        ps.ewdw[154] = 1868760896;
        ps.ewdw[155] = -129275211;
        ps.ewdw[156] = -1046460760;
        ps.ewdw[157] = 1480314609;
        ps.ewdw[158] = 1478467666;
        ps.ewdw[159] = 1535677743;
    }

    private static /* synthetic */ void ewpo() {
        ps.ewdr[0] = -8142214651074417658L;
        ps.ewdr[1] = 4060307924054175786L;
        ps.ewdr[2] = 6607136601706184466L;
        ps.ewdr[3] = 5685970444352360703L;
        ps.ewdr[4] = -9121046969173842695L;
        ps.ewdr[5] = -5365682735101563866L;
        ps.ewdr[6] = 6133955507437730092L;
        ps.ewdr[7] = -1126774415289471505L;
        ps.ewdr[8] = -4771703794512234567L;
        ps.ewdr[9] = -5468221031593047189L;
        ps.ewdr[10] = -9083568692965385646L;
        ps.ewdr[11] = -7173345528045348599L;
        ps.ewdr[12] = -9132672111082837363L;
        ps.ewdr[13] = -5550600312943344897L;
        ps.ewdr[14] = 4239464239854456196L;
        ps.ewdr[15] = 4359160360489932469L;
        ps.ewdr[16] = -1634970271036641452L;
        ps.ewdr[17] = 1003331250097260948L;
        ps.ewdr[18] = -1394225413250017725L;
        ps.ewdr[19] = -2798831202195807597L;
        ps.ewdr[20] = -3079084441246155814L;
        ps.ewdr[21] = -8889754784330741898L;
        ps.ewdr[22] = -3055458066671304965L;
        ps.ewdr[23] = 3599687546199144752L;
        ps.ewdr[24] = 7317888843075701954L;
        ps.ewdr[25] = 4744688334368876167L;
        ps.ewdr[26] = -4734564400691962040L;
        ps.ewdr[27] = -5974661134776847221L;
        ps.ewdr[28] = -6444493860713470995L;
        ps.ewdr[29] = 4675061866901675635L;
        ps.ewdr[30] = 6771086724951517806L;
        ps.ewdr[31] = -6080920116026266094L;
        ps.ewdr[32] = -5398768356037009925L;
        ps.ewdr[33] = -1038025597564430245L;
        ps.ewdr[34] = -7595582622140665396L;
        ps.ewdr[35] = -6565387047118321587L;
        ps.ewdr[36] = 639201184803228249L;
        ps.ewdr[37] = -956944356481264058L;
        ps.ewdr[38] = -5417594774940374206L;
        ps.ewdr[39] = -8269005121530628167L;
        ps.ewdr[40] = 1790498126720406372L;
        ps.ewdr[41] = -6398061772328670815L;
        ps.ewdr[42] = -1594593883531928494L;
        ps.ewdr[43] = -5246957783455284659L;
        ps.ewdr[44] = 7257152952156821242L;
        ps.ewdr[45] = -3031977362478455031L;
        ps.ewdr[46] = -4461454330694751664L;
        ps.ewdr[47] = 412212646045396429L;
        ps.ewdr[48] = 8594392073680946699L;
        ps.ewdr[49] = -7065268315075703917L;
        ps.ewdr[50] = -5211599097924604806L;
        ps.ewdr[51] = 4506989863451325137L;
        ps.ewdr[52] = -1469806335561730782L;
        ps.ewdr[53] = 4475793592094497902L;
        ps.ewdr[54] = 7402882289140286777L;
        ps.ewdr[55] = -1381852954123085204L;
        ps.ewdr[56] = -7795429089275052517L;
        ps.ewdr[57] = -4154355244619188630L;
        ps.ewdr[58] = 1647773706103081530L;
        ps.ewdr[59] = 3214938326088373326L;
        ps.ewdr[60] = -2426302500984940352L;
        ps.ewdr[61] = -2186026076167009508L;
        ps.ewdr[62] = 4812026844698649354L;
        ps.ewdr[63] = -7011119963675893237L;
        ps.ewdr[64] = 7361474869624212712L;
        ps.ewdr[65] = 2169746859998376898L;
        ps.ewdr[66] = 1993414488574293452L;
        ps.ewdr[67] = 3060107419883556919L;
        ps.ewdr[68] = 3329200147977221708L;
        ps.ewdr[69] = -2856822302829400329L;
        ps.ewdr[70] = -7769298583773314732L;
        ps.ewdr[71] = -2656838511595837182L;
        ps.ewdr[72] = -1255798858757231558L;
        ps.ewdr[73] = 3517409470936387846L;
        ps.ewdr[74] = -1947315554075778033L;
        ps.ewdr[75] = -334074505323275568L;
        ps.ewdr[76] = -7304189813722356681L;
        ps.ewdr[77] = -4134010884297718273L;
        ps.ewdr[78] = -6139899381232434628L;
        ps.ewdr[79] = -2107729055686250205L;
        ps.ewdr[80] = 7755093985870572654L;
        ps.ewdr[81] = -6147567396620457652L;
        ps.ewdr[82] = 1591892957668319081L;
        ps.ewdr[83] = 4485365906441001084L;
        ps.ewdr[84] = -2775543393857823071L;
        ps.ewdr[85] = 282983316421990260L;
        ps.ewdr[86] = -8923378122925160617L;
        ps.ewdr[87] = 5270609547233892695L;
        ps.ewdr[88] = 8974804046251974135L;
        ps.ewdr[89] = -2850068273560921643L;
        ps.ewdr[90] = -8540615448064893666L;
        ps.ewdr[91] = -7557960768358471308L;
        ps.ewdr[92] = -5345093401011000177L;
        ps.ewdr[93] = 2796085517487116859L;
        ps.ewdr[94] = -6594542989655854821L;
        ps.ewdr[95] = 6538626031194827365L;
        ps.ewdr[96] = 7291993749058672748L;
        ps.ewdr[97] = -7748046899296137669L;
        ps.ewdr[98] = -8522921853905036668L;
        ps.ewdr[99] = 2165820992624864443L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasTimeElapsed() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewmz", ewdp(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ps.ewds("ewna", ewdu(int ), (int)123)) break;
            v0 /* !! */  = (long)ps.ewds("ewnb", ewdu(int ), (int)124);
        }
        var3_1 = ps.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewnc", ewdp(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ps.ewds("ewnd", ewdu(int ), (int)125)) break;
            v1 /* !! */  = (long)ps.ewds("ewne", ewdu(int ), (int)126);
        }
        var2_2 /* !! */  = ps.b;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - ps.ewds("ewnf", ewdp(int ), (int)116));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -727457067: {
                    v3 = ps.ewds("ewng", ewdp(int ), (int)117);
                    continue block17;
                }
                case -291103574: {
                    break block17;
                }
                case 1520818202: {
                    v3 = ps.ewds("ewnh", ewdp(int ), (int)118);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = ps.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)ps.ewds("ewni", ewdu(int ), (int)127);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewnj", ewdp(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ps.ewds("ewnk", ewdu(int ), (int)128)) break;
                    v4 /* !! */  = (long)ps.ewds("ewnl", ewdu(int ), (int)129);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = ps.lk - ps.ewds("ewnm", ewdp(int ), (int)120)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ps.ewds("ewnn", ewdu(int ), (int)130)) break;
                    v5 /* !! */  = (long)ps.ewds("ewno", ewdu(int ), (int)131);
                }
                if (this.lastMS < System.currentTimeMillis()) {
                    if (var1_3) continue block18;
                    v6 = ps.ewds("ewnp", ewdu(int ), (int)132);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    if (!var1_3 && !var1_3) ** break;
                    continue block18;
                    v6 = ps.ewds("ewnq", ewdu(int ), (int)133);
                }
                return (boolean)v6;
lbl58:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)ps.ewds("ewnr", ewdu(int ), (int)134);
                    if (!var3_1) break block18;
                    throw null;
                }
lbl62:
                // 3 sources

                case 1: {
                    do {
                        var2_2 /* !! */  = (int)ps.ewds("ewns", ewdu(int ), (int)135);
                    } while (!var3_1);
                    throw null;
                }
lbl67:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)ps.ewds("ewnt", ewdu(int ), (int)136);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ps.ewds("ewnu", ewdu(int ), (int)137);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ps.ewds("ewnv", ewdu(int ), (int)138);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 5: {
                    var2_2 /* !! */  = (int)ps.ewds("ewnw", ewdu(int ), (int)139);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
                case 6: {
                    var2_2 /* !! */  = (int)ps.ewds("ewnx", ewdu(int ), (int)140);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
                case 7: 
            }
        }
        var2_2 /* !! */  = (int)ps.ewds("ewny", ewdu(int ), (int)141);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    static {
        ewdv = new int[160];
        ewdw = new int[160];
        ps.ewpi();
        ps.ewpj();
        ps.ewpk();
        ps.ewpl();
        ewdq = new long[138];
        ewdr = new long[138];
        ps.ewpm();
        ps.ewpn();
        ps.ewpo();
        ps.ewpp();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hasTimeElapsed(long var1_1) {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - ps.ewds("ewky", ewdp(int ), (int)89));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2074396839: {
                    v1 = ps.ewds("ewkz", ewdp(int ), (int)90);
                    continue block37;
                }
                case -1439890671: {
                    v1 = ps.ewds("ewla", ewdp(int ), (int)91);
                    continue block37;
                }
                case -291103574: {
                    break block37;
                }
                case 1114566242: {
                    v1 = ps.ewds("ewlb", ewdp(int ), (int)92);
                    continue block37;
                }
            }
            break;
        }
        var5_2 = ps.c;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl22
        block38: while (true) {
            v2 /* !! */  = (long)(ps.ewds("ewld", ewdp(int ), (int)94) - ps.ewds("ewlc", ewdp(int ), (int)93));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -291103574: {
                    break block38;
                }
                case 1161201347: {
                    continue block38;
                }
            }
            break;
        }
        var4_3 /* !! */  = ps.b;
        v3 /* !! */  = ps.lk;
        if (true) ** GOTO lbl32
        block39: while (true) {
            v3 /* !! */  = (long)(v4 - ps.ewds("ewle", ewdp(int ), (int)95));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -863020381: {
                    v4 = ps.ewds("ewlf", ewdp(int ), (int)96);
                    continue block39;
                }
                case -291103574: {
                    break block39;
                }
                case -286838417: {
                    v4 = ps.ewds("ewlg", ewdp(int ), (int)97);
                    continue block39;
                }
                case 2063976465: {
                    v4 = ps.ewds("ewlh", ewdp(int ), (int)98);
                    continue block39;
                }
            }
            break;
        }
        var3_4 = ps.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_2) {
                    throw null;
lbl50:
                    // 3 sources

                    return (boolean)ps.ewds("ewli", ewdu(int ), (int)95);
                }
                if (var3_4 || var3_4) ** GOTO lbl50
                v5 /* !! */  = ps.lk;
                if (true) ** GOTO lbl57
                block41: while (true) {
                    v5 /* !! */  = (long)(v6 - ps.ewds("ewlj", ewdp(int ), (int)99));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1725319394: {
                            v6 = ps.ewds("ewlk", ewdp(int ), (int)100);
                            continue block41;
                        }
                        case -291103574: {
                            break block41;
                        }
                        case -160623358: {
                            v6 = ps.ewds("ewll", ewdp(int ), (int)101);
                            continue block41;
                        }
                    }
                    break;
                }
                v7 = System.currentTimeMillis();
                v8 /* !! */  = ps.lk;
                if (true) ** GOTO lbl71
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - ps.ewds("ewlm", ewdp(int ), (int)102));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1318875197: {
                            v9 = ps.ewds("ewln", ewdp(int ), (int)103);
                            continue block42;
                        }
                        case -291103574: {
                            break block42;
                        }
                        case 123043323: {
                            v9 = ps.ewds("ewlo", ewdp(int ), (int)104);
                            continue block42;
                        }
                        case 1849236974: {
                            v9 = ps.ewds("ewlp", ewdp(int ), (int)105);
                            continue block42;
                        }
                    }
                    break;
                }
                if (v7 - this.lastMS <= var1_1) ** GOTO lbl89
                if (var3_4) ** GOTO lbl50
                v10 = ps.ewds("ewlq", ewdu(int ), (int)96);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl92
lbl89:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v10 = ps.ewds("ewlr", ewdu(int ), (int)97);
lbl92:
                // 2 sources

                return (boolean)v10;
            }
lbl93:
            // 2 sources

            case 0: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewls", ewdu(int ), (int)98);
                } while (!var5_2);
                throw null;
            }
lbl98:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ps.ewds("ewlt", ewdu(int ), (int)99);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                    break;
                }
            }
            case 2: {
                var4_3 /* !! */  = (int)ps.ewds("ewlu", ewdu(int ), (int)100);
                if (var5_2) {
                    throw null;
                }
            }
            case 3: {
                var4_3 /* !! */  = (int)ps.ewds("ewlv", ewdu(int ), (int)101);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 4: {
                var4_3 /* !! */  = (int)ps.ewds("ewlw", ewdu(int ), (int)102);
                if (!var5_2) ** GOTO lbl98
                throw null;
            }
lbl117:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)ps.ewds("ewlx", ewdu(int ), (int)103);
                if (!var5_2) ** GOTO lbl93
                throw null;
            }
lbl121:
            // 2 sources

            case 6: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewly", ewdu(int ), (int)104);
                } while (!var5_2);
                throw null;
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)ps.ewds("ewlz", ewdu(int ), (int)105);
        ** while (!var5_2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getLastMS() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewnz", ewdp(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ps.ewds("ewoa", ewdu(int ), (int)142)) break;
            v0 /* !! */  = (long)ps.ewds("ewob", ewdu(int ), (int)143);
        }
        var3_1 = ps.c;
        v1 /* !! */  = ps.lk;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - ps.ewds("ewoc", ewdp(int ), (int)122));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2016233361: {
                    v2 = ps.ewds("ewod", ewdp(int ), (int)123);
                    continue block13;
                }
                case -291103574: {
                    break block13;
                }
                case 73078712: {
                    v2 = ps.ewds("ewoe", ewdp(int ), (int)124);
                    continue block13;
                }
                case 970374977: {
                    v2 = ps.ewds("ewof", ewdp(int ), (int)125);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = ps.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewog", ewdp(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ps.ewds("ewoh", ewdu(int ), (int)144)) break;
            v3 /* !! */  = (long)ps.ewds("ewoi", ewdu(int ), (int)145);
        }
        var1_3 = ps.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (long)ps.ewds("ewoj", ewdp(int ), (int)127);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block15;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewok", ewdp(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ps.ewds("ewol", ewdu(int ), (int)146)) break;
                    v4 /* !! */  = (long)ps.ewds("ewom", ewdu(int ), (int)147);
                }
                return this.lastMS;
                case 0: {
                    var2_2 /* !! */  = (int)ps.ewds("ewon", ewdu(int ), (int)148);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ps.ewds("ewoo", ewdu(int ), (int)149);
                        if (!var3_1) break block15;
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ps.ewds("ewop", ewdu(int ), (int)150);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ps.ewds("ewoq", ewdu(int ), (int)151);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ps create() {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ps.ewds("ewfb", ewdp(int ), (int)12) - ps.ewds("ewfa", ewdp(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1753052658: {
                    continue block14;
                }
                case -291103574: {
                    break block14;
                }
            }
            break;
        }
        var2 = ps.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewfc", ewdp(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ps.ewds("ewfd", ewdu(int ), (int)19)) break;
            v1 /* !! */  = (long)ps.ewds("ewfe", ewdu(int ), (int)20);
        }
        var1_1 /* !! */  = ps.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewff", ewdp(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ps.ewds("ewfg", ewdu(int ), (int)21)) break;
                    v2 /* !! */  = (long)ps.ewds("ewfh", ewdu(int ), (int)22);
                }
                var0_2 = ps.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewfi", ewdp(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ps.ewds("ewfj", ewdu(int ), (int)23)) break;
                    v3 /* !! */  = (long)ps.ewds("ewfk", ewdu(int ), (int)24);
                }
                v4 /* !! */  = ps.lk;
                if (true) ** GOTO lbl43
                block19: while (true) {
                    v4 /* !! */  = (long)(ps.ewds("ewfm", ewdp(int ), (int)17) - ps.ewds("ewfl", ewdp(int ), (int)16));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2132404231: {
                            continue block19;
                        }
                        case -291103574: {
                            break block19;
                        }
                    }
                    break;
                }
                return new ps();
            }
lbl49:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)ps.ewds("ewfn", ewdu(int ), (int)25);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl58
            }
            case 1: {
                var1_1 /* !! */  = (int)ps.ewds("ewfo", ewdu(int ), (int)26);
                if (!var2) ** GOTO lbl49
                throw null;
            }
lbl58:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)ps.ewds("ewfp", ewdu(int ), (int)27);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)ps.ewds("ewfq", ewdu(int ), (int)28);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isRunning() {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(ps.ewds("ewjy", ewdp(int ), (int)80) - ps.ewds("ewjx", ewdp(int ), (int)79));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1338486275: {
                    continue block20;
                }
                case -291103574: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = ps.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewjz", ewdp(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ps.ewds("ewka", ewdu(int ), (int)78)) break;
            v1 /* !! */  = (long)ps.ewds("ewkb", ewdu(int ), (int)79);
        }
        var2_2 /* !! */  = ps.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewkc", ewdp(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ps.ewds("ewkd", ewdu(int ), (int)80)) break;
            v2 /* !! */  = (long)ps.ewds("ewke", ewdu(int ), (int)81);
        }
        var1_3 = ps.a;
        if (var3_1) {
            throw null;
lbl25:
            // 3 sources

            return (boolean)ps.ewds("ewkf", ewdu(int ), (int)82);
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewkg", ewdp(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ps.ewds("ewkh", ewdu(int ), (int)83)) break;
            v3 /* !! */  = (long)ps.ewds("ewki", ewdu(int ), (int)84);
        }
        v4 = System.currentTimeMillis();
        v5 /* !! */  = ps.lk;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v5 /* !! */  = (long)(v6 - ps.ewds("ewkj", ewdp(int ), (int)84));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1144286237: {
                    v6 = ps.ewds("ewkk", ewdp(int ), (int)85);
                    continue block25;
                }
                case -722944596: {
                    v6 = ps.ewds("ewkl", ewdp(int ), (int)86);
                    continue block25;
                }
                case -291103574: {
                    break block25;
                }
                case 1387225130: {
                    v6 = ps.ewds("ewkm", ewdp(int ), (int)87);
                    continue block25;
                }
            }
            break;
        }
        if (v4 - this.lastMS > ps.ewds("ewkn", ewdp(int ), (int)88)) ** GOTO lbl59
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v7 = ps.ewds("ewko", ewdu(int ), (int)85);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl59:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v7 = ps.ewds("ewkp", ewdu(int ), (int)86);
lbl62:
            // 2 sources

            return (boolean)v7;
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ps.ewds("ewkq", ewdu(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl68:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ps.ewds("ewkr", ewdu(int ), (int)88);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
            case 2: {
                var2_2 /* !! */  = (int)ps.ewds("ewks", ewdu(int ), (int)89);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ps.ewds("ewkt", ewdu(int ), (int)90);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl92
                    break;
                }
            }
lbl84:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ps.ewds("ewku", ewdu(int ), (int)91);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ps.ewds("ewkv", ewdu(int ), (int)92);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl92:
            // 3 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ps.ewds("ewkw", ewdu(int ), (int)93);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ps.ewds("ewkx", ewdu(int ), (int)94);
        ** while (!var3_1)
lbl100:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean finished(double var1_1) {
        v0 /* !! */  = ps.lk;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - ps.ewds("ewma", ewdp(int ), (int)106));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -291103574: {
                    break block19;
                }
                case 627343445: {
                    v1 = ps.ewds("ewmb", ewdp(int ), (int)107);
                    continue block19;
                }
                case 1649873812: {
                    v1 = ps.ewds("ewmc", ewdp(int ), (int)108);
                    continue block19;
                }
            }
            break;
        }
        var5_2 = ps.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewmd", ewdp(int ), (int)109)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ps.ewds("ewme", ewdu(int ), (int)106)) break;
            v2 /* !! */  = (long)ps.ewds("ewmf", ewdu(int ), (int)107);
        }
        var4_3 /* !! */  = ps.b;
        v3 /* !! */  = ps.lk;
        if (true) ** GOTO lbl26
        block21: while (true) {
            v3 /* !! */  = (long)(ps.ewds("ewmh", ewdp(int ), (int)111) - ps.ewds("ewmg", ewdp(int ), (int)110));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -291103574: {
                    break block21;
                }
                case 1657099525: {
                    continue block21;
                }
            }
            break;
        }
        var3_4 = ps.a;
        if (var5_2) {
            throw null;
lbl34:
            // 3 sources

            return (boolean)ps.ewds("ewmi", ewdu(int ), (int)108);
        }
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewmj", ewdp(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ps.ewds("ewmk", ewdu(int ), (int)109)) break;
                    v4 /* !! */  = (long)ps.ewds("ewml", ewdu(int ), (int)110);
                }
                v5 = (double)System.currentTimeMillis() - var1_1;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewmm", ewdp(int ), (int)113)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ps.ewds("ewmn", ewdu(int ), (int)111)) break;
                    v6 /* !! */  = (long)ps.ewds("ewmo", ewdu(int ), (int)112);
                }
                if (!(v5 >= (double)this.startTime)) ** GOTO lbl59
                if (var3_4) ** GOTO lbl34
                v7 = ps.ewds("ewmp", ewdu(int ), (int)113);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl62
lbl59:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v7 = ps.ewds("ewmq", ewdu(int ), (int)114);
lbl62:
                // 2 sources

                return (boolean)v7;
            }
lbl63:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ps.ewds("ewmr", ewdu(int ), (int)115);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl73
                    break;
                }
            }
lbl69:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ps.ewds("ewms", ewdu(int ), (int)116);
                if (!var5_2) ** GOTO lbl63
                throw null;
            }
lbl73:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)ps.ewds("ewmt", ewdu(int ), (int)117);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 3: {
                var4_3 /* !! */  = (int)ps.ewds("ewmu", ewdu(int ), (int)118);
                if (!var5_2) ** GOTO lbl69
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)ps.ewds("ewmv", ewdu(int ), (int)119);
                if (var5_2) {
                    throw null;
                }
            }
lbl86:
            // 4 sources

            case 5: {
                var4_3 /* !! */  = (int)ps.ewds("ewmw", ewdu(int ), (int)120);
                if (!var5_2) break;
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)ps.ewds("ewmx", ewdu(int ), (int)121);
                if (!var5_2) ** GOTO lbl63
                throw null;
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)ps.ewds("ewmy", ewdu(int ), (int)122);
        ** while (!var5_2)
lbl97:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewdt", ewdp(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ps.ewds("ewdx", ewdu(int ), (int)0)) break;
            v0 /* !! */  = (long)ps.ewds("ewdy", ewdu(int ), (int)1);
        }
        var3_1 = ps.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewdz", ewdp(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ps.ewds("ewea", ewdu(int ), (int)2)) break;
            v1 /* !! */  = (long)ps.ewds("eweb", ewdu(int ), (int)3);
        }
        var2_2 /* !! */  = ps.b;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl17
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ps.ewds("ewec", ewdp(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1003489892: {
                    v3 = ps.ewds("ewed", ewdp(int ), (int)3);
                    continue block21;
                }
                case -291103574: {
                    break block21;
                }
                case 175604603: {
                    v3 = ps.ewds("ewee", ewdp(int ), (int)4);
                    continue block21;
                }
                case 1501323040: {
                    v3 = ps.ewds("ewef", ewdp(int ), (int)5);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = ps.a;
        if (var3_1) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = ps.lk;
        if (true) ** GOTO lbl39
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - ps.ewds("eweg", ewdp(int ), (int)6));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -291103574: {
                    break block23;
                }
                case 802028134: {
                    v5 = ps.ewds("eweh", ewdp(int ), (int)7);
                    continue block23;
                }
                case 2118349528: {
                    v5 = ps.ewds("ewei", ewdp(int ), (int)8);
                    continue block23;
                }
            }
            break;
        }
        v6 = Instant.now();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ps.lk - ps.ewds("ewej", ewdp(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ps.ewds("ewek", ewdu(int ), (int)4)) break;
            v7 /* !! */  = (long)ps.ewds("ewel", ewdu(int ), (int)5);
        }
        v8 = v6.toEpochMilli();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = ps.lk - ps.ewds("ewem", ewdp(int ), (int)10)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ps.ewds("ewen", ewdu(int ), (int)6)) break;
            v9 /* !! */  = (long)ps.ewds("eweo", ewdu(int ), (int)7);
        }
        this.lastMS = v8;
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ps.ewds("ewep", ewdu(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ps.ewds("eweq", ewdu(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ps.ewds("ewer", ewdu(int ), (int)10);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl88
                    break;
                }
            }
lbl84:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ps.ewds("ewes", ewdu(int ), (int)11);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl88:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ps.ewds("ewet", ewdu(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ps.ewds("eweu", ewdu(int ), (int)13);
        ** while (!var3_1)
lbl95:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setTime(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewij", ewdp(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ps.ewds("ewik", ewdu(int ), (int)62)) break;
            v0 /* !! */  = (long)ps.ewds("ewil", ewdu(int ), (int)63);
        }
        var5_2 = ps.c;
        v1 /* !! */  = ps.lk;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(ps.ewds("ewin", ewdp(int ), (int)57) - ps.ewds("ewim", ewdp(int ), (int)56));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2085256153: {
                    continue block17;
                }
                case -291103574: {
                    break block17;
                }
            }
            break;
        }
        var4_3 /* !! */  = ps.b;
        v2 /* !! */  = ps.lk;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(ps.ewds("ewip", ewdp(int ), (int)59) - ps.ewds("ewio", ewdp(int ), (int)58));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -291103574: {
                    break block18;
                }
                case 1225635320: {
                    continue block18;
                }
            }
            break;
        }
        var3_4 = ps.a;
        if (var5_2) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var3_4) ** GOTO lbl29
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewiq", ewdp(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ps.ewds("ewir", ewdu(int ), (int)64)) break;
                    v3 /* !! */  = (long)ps.ewds("ewis", ewdu(int ), (int)65);
                }
                this.lastMS = var1_1;
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl45:
            // 2 sources

            case 0: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewit", ewdu(int ), (int)66);
                } while (!var5_2);
                throw null;
            }
            case 1: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewiu", ewdu(int ), (int)67);
                } while (!var5_2);
                throw null;
            }
lbl55:
            // 2 sources

            case 2: {
                do {
                    var4_3 /* !! */  = (int)ps.ewds("ewiv", ewdu(int ), (int)68);
                } while (!var5_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ps.ewds("ewiw", ewdu(int ), (int)69);
                    if (!var5_2) ** GOTO lbl55
                    throw null;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)ps.ewds("ewix", ewdu(int ), (int)70);
                if (!var5_2) ** GOTO lbl45
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)ps.ewds("ewiy", ewdu(int ), (int)71);
        ** while (!var5_2)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getStartTime() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ps.lk - ps.ewds("ewor", ewdp(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ps.ewds("ewos", ewdu(int ), (int)152)) break;
            v0 /* !! */  = (long)ps.ewds("ewot", ewdu(int ), (int)153);
        }
        var3_1 = ps.c;
        v1 /* !! */  = ps.lk;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(ps.ewds("ewov", ewdp(int ), (int)131) - ps.ewds("ewou", ewdp(int ), (int)130));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -291103574: {
                    break block17;
                }
                case 869488425: {
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ps.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ps.lk - ps.ewds("ewow", ewdp(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ps.ewds("ewox", ewdu(int ), (int)154)) break;
            v2 /* !! */  = (long)ps.ewds("ewoy", ewdu(int ), (int)155);
        }
        var1_3 = ps.a;
        if (var3_1) {
            throw null;
            return (long)ps.ewds("ewoz", ewdp(int ), (int)133);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ps.lk;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - ps.ewds("ewpa", ewdp(int ), (int)134));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1327958283: {
                            v4 = ps.ewds("ewpb", ewdp(int ), (int)135);
                            continue block20;
                        }
                        case -291103574: {
                            break block20;
                        }
                        case 807222333: {
                            v4 = ps.ewds("ewpc", ewdp(int ), (int)136);
                            continue block20;
                        }
                        case 1895308462: {
                            v4 = ps.ewds("ewpd", ewdp(int ), (int)137);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.startTime;
            }
            case 0: {
                var2_2 /* !! */  = (int)ps.ewds("ewpe", ewdu(int ), (int)156);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ps.ewds("ewpf", ewdu(int ), (int)157);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ps.ewds("ewpg", ewdu(int ), (int)158);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ps.ewds("ewph", ewdu(int ), (int)159);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ewdu(int n2) {
        return ewdv[n2] ^ ewdw[n2];
    }

    private static /* synthetic */ long ewdp(int n2) {
        return ewdq[n2] ^ ewdr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ps() {
        var2_1 /* !! */  = ps.b;
        var1_2 = ps.a;
        super();
        this.lastMS = System.currentTimeMillis();
        this.resetCounter();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ps.ewds("ewev", ewdu(int ), (int)14);
            }
lbl12:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)ps.ewds("ewew", ewdu(int ), (int)15);
                break;
            }
lbl15:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ps.ewds("ewex", ewdu(int ), (int)16);
                ** GOTO lbl12
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ps.ewds("ewey", ewdu(int ), (int)17);
                    ** GOTO lbl15
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)ps.ewds("ewez", ewdu(int ), (int)18);
        ** while (true)
    }

    private static /* synthetic */ void ewpm() {
        ps.ewdq[0] = -5993086673966584447L;
        ps.ewdq[1] = -8310217952863988898L;
        ps.ewdq[2] = 7652105843946054838L;
        ps.ewdq[3] = -233661915871580151L;
        ps.ewdq[4] = -5510463535710363261L;
        ps.ewdq[5] = 4570439848771311930L;
        ps.ewdq[6] = -5239320839888213421L;
        ps.ewdq[7] = -5897904840560452966L;
        ps.ewdq[8] = -1226474429402193351L;
        ps.ewdq[9] = -4528576969047805590L;
        ps.ewdq[10] = 8180395905180854541L;
        ps.ewdq[11] = 3859010414055516836L;
        ps.ewdq[12] = -267580406734270900L;
        ps.ewdq[13] = 4581509257429052903L;
        ps.ewdq[14] = -9051210540091543142L;
        ps.ewdq[15] = -6640190517271736372L;
        ps.ewdq[16] = 3230770061702122386L;
        ps.ewdq[17] = -9068287977171216666L;
        ps.ewdq[18] = 4829764004508495183L;
        ps.ewdq[19] = 6329627057450688327L;
        ps.ewdq[20] = -4165641611573751610L;
        ps.ewdq[21] = 5252100927321024800L;
        ps.ewdq[22] = 3041950682269710717L;
        ps.ewdq[23] = -7124353965942742721L;
        ps.ewdq[24] = -1673648285763110494L;
        ps.ewdq[25] = -4918629945139747300L;
        ps.ewdq[26] = -6948799420336233142L;
        ps.ewdq[27] = -2853569078639572458L;
        ps.ewdq[28] = -326958059007074647L;
        ps.ewdq[29] = -5608984788237468507L;
        ps.ewdq[30] = 6037523423905627441L;
        ps.ewdq[31] = 3861981117079602394L;
        ps.ewdq[32] = -585245358988483047L;
        ps.ewdq[33] = -3670557069197105503L;
        ps.ewdq[34] = 914240427049619526L;
        ps.ewdq[35] = 4478975472236309796L;
        ps.ewdq[36] = 7722700393062910371L;
        ps.ewdq[37] = 5270451590818060686L;
        ps.ewdq[38] = 7394996124894049990L;
        ps.ewdq[39] = 1505256480311985479L;
        ps.ewdq[40] = 8477175482701929806L;
        ps.ewdq[41] = 4606085969048121533L;
        ps.ewdq[42] = -9159386516867431078L;
        ps.ewdq[43] = -8131901376577462893L;
        ps.ewdq[44] = -2272004922679202331L;
        ps.ewdq[45] = 1322723869735560657L;
        ps.ewdq[46] = -3704911304882392856L;
        ps.ewdq[47] = 8514352725237774578L;
        ps.ewdq[48] = -3460933484606091344L;
        ps.ewdq[49] = 661280579483316649L;
        ps.ewdq[50] = -9185549752275114791L;
        ps.ewdq[51] = -2851470372066846053L;
        ps.ewdq[52] = -6624652356499812081L;
        ps.ewdq[53] = 1882894537634619658L;
        ps.ewdq[54] = 7612059563873128741L;
        ps.ewdq[55] = -4809549012379499824L;
        ps.ewdq[56] = -3017239868435789962L;
        ps.ewdq[57] = -4904182377358636127L;
        ps.ewdq[58] = -3785170631896964411L;
        ps.ewdq[59] = -452798556803143735L;
        ps.ewdq[60] = 1105613187314026217L;
        ps.ewdq[61] = 6209654349954301341L;
        ps.ewdq[62] = 157661962555083844L;
        ps.ewdq[63] = -3861908529869057392L;
        ps.ewdq[64] = -1097952348413110197L;
        ps.ewdq[65] = 7380460331762565186L;
        ps.ewdq[66] = 852410023301244109L;
        ps.ewdq[67] = 2279110448036692446L;
        ps.ewdq[68] = 1421994073261889648L;
        ps.ewdq[69] = -938495472815576136L;
        ps.ewdq[70] = 1823816791860827828L;
        ps.ewdq[71] = -2236379688108312826L;
        ps.ewdq[72] = 8673866112698766043L;
        ps.ewdq[73] = 7227009010433017691L;
        ps.ewdq[74] = -4332028831541275050L;
        ps.ewdq[75] = 3379574622956603382L;
        ps.ewdq[76] = 6231584795803583561L;
        ps.ewdq[77] = 3161182395937929934L;
        ps.ewdq[78] = -5304885005769170018L;
        ps.ewdq[79] = 4529940133071689850L;
        ps.ewdq[80] = 4214665436887741671L;
        ps.ewdq[81] = 8235406220445836510L;
        ps.ewdq[82] = -1555251716085194076L;
        ps.ewdq[83] = -2737474079198119016L;
        ps.ewdq[84] = -3277450212580482148L;
        ps.ewdq[85] = 8203065846017264982L;
        ps.ewdq[86] = 7314078575166531646L;
        ps.ewdq[87] = -4729694206812179695L;
        ps.ewdq[88] = 8974804046251974135L;
        ps.ewdq[89] = 1119696258655140349L;
        ps.ewdq[90] = 7559031753014063232L;
        ps.ewdq[91] = -881976915096806170L;
        ps.ewdq[92] = -8859223315374919179L;
        ps.ewdq[93] = 8682524854570876087L;
        ps.ewdq[94] = -3728220362251645929L;
        ps.ewdq[95] = -8644584633627399327L;
        ps.ewdq[96] = -7490627758676742536L;
        ps.ewdq[97] = 5341384834059340900L;
        ps.ewdq[98] = -3856689657205560734L;
        ps.ewdq[99] = -8728323193065227188L;
    }
}

