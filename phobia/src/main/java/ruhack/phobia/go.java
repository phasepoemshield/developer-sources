/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_5498
 *  net.minecraft.class_761
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import net.minecraft.class_243;
import net.minecraft.class_5498;
import net.minecraft.class_761;
import ruhack.phobia.aw;
import ruhack.phobia.bn;
import ruhack.phobia.bq;
import ruhack.phobia.ca;
import ruhack.phobia.cj;
import ruhack.phobia.cq;
import ruhack.phobia.cr;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nm;
import ruhack.phobia.nq;

public class go
extends ds {
    private static int[] dbit;
    public static final boolean c;
    private final kb toggleOnLogSetting;
    public class_243 prevPos;
    private static long[] dbie;
    private static long[] dbid;
    private final kg speedSetting;
    public class_243 pos;
    public static final int b;
    private static final long hc = -2339088394634950093L;
    public static final boolean a;
    private final kb reloadChunksSetting;
    private final kb freezeSetting;
    private static int[] dbis;

    private static /* synthetic */ void dbwb() {
        go.dbit[0] = -571628328;
        go.dbit[1] = 118028532;
        go.dbit[2] = 1492465483;
        go.dbit[3] = 947880497;
        go.dbit[4] = 164316652;
        go.dbit[5] = 1480031664;
        go.dbit[6] = 1463278109;
        go.dbit[7] = 962110323;
        go.dbit[8] = -2072224522;
        go.dbit[9] = -363631739;
        go.dbit[10] = -723583336;
        go.dbit[11] = -1455886747;
        go.dbit[12] = -525503039;
        go.dbit[13] = 1600529772;
        go.dbit[14] = -662351261;
        go.dbit[15] = -243187117;
        go.dbit[16] = -524038323;
        go.dbit[17] = -1167471295;
        go.dbit[18] = -1459666399;
        go.dbit[19] = -880728138;
        go.dbit[20] = -1074466959;
        go.dbit[21] = -1862440245;
        go.dbit[22] = -1022953549;
        go.dbit[23] = 1904420900;
        go.dbit[24] = 1902446677;
        go.dbit[25] = 631812699;
        go.dbit[26] = 119637531;
        go.dbit[27] = -847026871;
        go.dbit[28] = 1221671401;
        go.dbit[29] = -1054640271;
        go.dbit[30] = -1934466626;
        go.dbit[31] = 117398600;
        go.dbit[32] = -1206209064;
        go.dbit[33] = 1622823158;
        go.dbit[34] = -1051756226;
        go.dbit[35] = 1274905490;
        go.dbit[36] = 304484336;
        go.dbit[37] = 1347798507;
        go.dbit[38] = 1918428889;
        go.dbit[39] = -987114735;
        go.dbit[40] = -1986255165;
        go.dbit[41] = 1272207329;
        go.dbit[42] = -59693850;
        go.dbit[43] = 2137385072;
        go.dbit[44] = -1543230262;
        go.dbit[45] = -1820038429;
        go.dbit[46] = 57432895;
        go.dbit[47] = 888334584;
        go.dbit[48] = 1779728448;
        go.dbit[49] = 1779075012;
        go.dbit[50] = -1694393480;
        go.dbit[51] = -1611050054;
        go.dbit[52] = 1730153690;
        go.dbit[53] = 1968968408;
        go.dbit[54] = -291593560;
        go.dbit[55] = -2127448938;
        go.dbit[56] = 878293106;
        go.dbit[57] = 1892572107;
        go.dbit[58] = -293386434;
        go.dbit[59] = 651502080;
        go.dbit[60] = -1894065165;
        go.dbit[61] = -1434852090;
        go.dbit[62] = -1052424789;
        go.dbit[63] = -1228615109;
        go.dbit[64] = -637402201;
        go.dbit[65] = 634820693;
        go.dbit[66] = -1075545281;
        go.dbit[67] = -596121139;
        go.dbit[68] = -144323837;
        go.dbit[69] = -477485862;
        go.dbit[70] = -545267035;
        go.dbit[71] = 682102249;
        go.dbit[72] = 1139093085;
        go.dbit[73] = -1281960019;
        go.dbit[74] = 1308129;
        go.dbit[75] = 948915268;
        go.dbit[76] = -1704336853;
        go.dbit[77] = -405349119;
        go.dbit[78] = -324287836;
        go.dbit[79] = 2021735127;
        go.dbit[80] = 43315567;
        go.dbit[81] = -645402747;
        go.dbit[82] = 530477026;
        go.dbit[83] = 1955581923;
        go.dbit[84] = -1129164942;
        go.dbit[85] = 1054349836;
        go.dbit[86] = 1621559457;
        go.dbit[87] = 1549219381;
        go.dbit[88] = 652693679;
        go.dbit[89] = -1723175057;
        go.dbit[90] = -2127716332;
        go.dbit[91] = 2130452907;
        go.dbit[92] = 1780170514;
        go.dbit[93] = -2116756303;
        go.dbit[94] = -2131352856;
        go.dbit[95] = -887330826;
        go.dbit[96] = -380076702;
        go.dbit[97] = -1576634012;
        go.dbit[98] = -472225316;
        go.dbit[99] = -198581856;
    }

    /*
     * Handled duff style switch with additional control
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @aw
    public void onMove(cq cq2) {
        CallSite callSite;
        boolean bl2;
        Object object = hc;
        boolean bl3 = true;
        block26: while (true) {
            CallSite callSite2;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite2 - go.dbif("dbox", dbic(int ), (int)62);
            }
            switch ((int)object) {
                case -2088007117: {
                    break block26;
                }
                case -43017789: {
                    callSite2 = go.dbif("dboy", dbic(int ), (int)63);
                    continue block26;
                }
                case 1069587605: {
                    callSite2 = go.dbif("dboz", dbic(int ), (int)64);
                    continue block26;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = hc - go.dbif("dbpa", dbic(int ), (int)65)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == go.dbif("dbpb", dbir(int ), (int)107)) break;
            object2 = go.dbif("dbpc", dbir(int ), (int)108);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = hc - go.dbif("dbpd", dbic(int ), (int)66)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == go.dbif("dbpe", dbir(int ), (int)109)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = go.dbif("dbpf", dbir(int ), (int)110);
        }
        if (bl2 || bl2) return;
        Object object4 = hc;
        block29: while (true) {
            switch ((int)object4) {
                case -2088007117: {
                    break block29;
                }
                case -2078531423: {
                    object4 = go.dbif("dbph", dbic(int ), (int)68) - go.dbif("dbpg", dbic(int ), (int)67);
                    continue block29;
                }
            }
            break;
        }
        Object object5 = hc;
        boolean bl5 = true;
        block30: while (true) {
            CallSite callSite3;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite3 - go.dbif("dbpi", dbic(int ), (int)69);
            }
            switch ((int)object5) {
                case -2088007117: {
                    break block30;
                }
                case -2022169735: {
                    callSite3 = go.dbif("dbpj", dbic(int ), (int)70);
                    continue block30;
                }
                case -2006940675: {
                    callSite3 = go.dbif("dbpk", dbic(int ), (int)71);
                    continue block30;
                }
                case -1378923914: {
                    callSite3 = go.dbif("dbpl", dbic(int ), (int)72);
                    continue block30;
                }
            }
            break;
        }
        if (this.freezeSetting.isValue()) {
            if (bl2 || bl2) return;
            while (true) {
                long l4;
                Object object6;
                if ((object6 = (l4 = hc - go.dbif("dbpm", dbic(int ), (int)73)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object6 == go.dbif("dbpn", dbir(int ), (int)111)) break;
                object6 = go.dbif("dbpo", dbir(int ), (int)112);
            }
            while (true) {
                long l5;
                Object object7;
                if ((object7 = (l5 = hc - go.dbif("dbpp", dbic(int ), (int)74)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object7 == go.dbif("dbpq", dbir(int ), (int)113)) {
                    cq2.setMovement(class_243.field_1353);
                    if (bl2) return;
                    break;
                }
                object7 = go.dbif("dbpr", dbir(int ), (int)114);
            }
        }
        if (bl2 || bl2) {
            return;
        }
        boolean bl6 = true;
        block33: do {
            int n3;
            if (bl6 && !(bl6 = false)) {
                if (n2 == 0) return;
                n3 = Integer.MIN_VALUE;
            }
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 1: {
                    break;
                }
                case 4: {
                    CallSite callSite4 = go.dbif("dbpw", dbir(int ), (int)119);
                    n3 = 0;
                    if (!bl4) continue block33;
                    throw null;
                }
                case 5: {
                    CallSite callSite5 = go.dbif("dbpx", dbir(int ), (int)120);
                    if (bl4) {
                        throw null;
                    }
                }
                case 6: {
                    CallSite callSite6 = go.dbif("dbpy", dbir(int ), (int)121);
                    if (bl4) {
                        throw null;
                    }
                }
                case 2: {
                    CallSite callSite7 = go.dbif("dbpu", dbir(int ), (int)117);
                    if (bl4) {
                        throw null;
                    }
                }
                case 7: {
                    CallSite callSite8 = go.dbif("dbpz", dbir(int ), (int)122);
                    if (bl4) {
                        throw null;
                    }
                }
                case 0: {
                    CallSite callSite9 = go.dbif("dbps", dbir(int ), (int)115);
                    if (bl4) {
                        throw null;
                    }
                }
                case 3: {
                    CallSite callSite10 = go.dbif("dbpv", dbir(int ), (int)118);
                    if (bl4) {
                        throw null;
                    }
                    callSite = go.dbif("dbqa", dbir(int ), (int)123);
                    if (!bl4) break block33;
                    throw null;
                }
                case 8: {
                    callSite = go.dbif("dbqa", dbir(int ), (int)123);
                    if (!bl4) break block33;
                    throw null;
                }
            }
            break;
        } while (true);
        do {
            callSite = go.dbif("dbpt", dbir(int ), (int)116);
            if (bl4) {
                throw null;
            }
            callSite = go.dbif("dbqa", dbir(int ), (int)123);
        } while (!bl4);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = go.hc;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(go.dbif("dbjp", dbic(int ), (int)12) - go.dbif("dbjo", dbic(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2088007117: {
                    break block53;
                }
                case -354454089: {
                    continue block53;
                }
            }
            break;
        }
        var3_1 = go.c;
        v1 /* !! */  = go.hc;
        if (true) ** GOTO lbl15
        block54: while (true) {
            v1 /* !! */  = (long)(v2 - go.dbif("dbjq", dbic(int ), (int)13));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2088007117: {
                    break block54;
                }
                case 1408759031: {
                    v2 = go.dbif("dbjr", dbic(int ), (int)14);
                    continue block54;
                }
                case 1674320984: {
                    v2 = go.dbif("dbjs", dbic(int ), (int)15);
                    continue block54;
                }
            }
            break;
        }
        var2_2 /* !! */  = go.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dbjt", dbic(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == go.dbif("dbju", dbir(int ), (int)19)) break;
            v3 /* !! */  = (long)go.dbif("dbjv", dbir(int ), (int)20);
        }
        var1_3 = go.a;
        if (var3_1) {
            throw null;
lbl33:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = go.hc - go.dbif("dbjw", dbic(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == go.dbif("dbjx", dbir(int ), (int)21)) break;
            v4 /* !! */  = (long)go.dbif("dbjy", dbir(int ), (int)22);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = go.hc - go.dbif("dbjz", dbic(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == go.dbif("dbka", dbir(int ), (int)23)) break;
            v5 /* !! */  = (long)go.dbif("dbkb", dbir(int ), (int)24);
        }
        v6 = go.mc.method_1561();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = go.hc - go.dbif("dbkc", dbic(int ), (int)19)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == go.dbif("dbkd", dbir(int ), (int)25)) break;
            v7 /* !! */  = (long)go.dbif("dbke", dbir(int ), (int)26);
        }
        v8 = v6.field_4686;
        v9 /* !! */  = go.hc;
        if (true) ** GOTO lbl57
        block60: while (true) {
            v9 /* !! */  = (long)(v10 - go.dbif("dbkf", dbic(int ), (int)20));
lbl57:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2088007117: {
                    break block60;
                }
                case -1714638902: {
                    v10 = go.dbif("dbkg", dbic(int ), (int)21);
                    continue block60;
                }
                case -696154721: {
                    v10 = go.dbif("dbkh", dbic(int ), (int)22);
                    continue block60;
                }
            }
            break;
        }
        v11 = v8.method_71156();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = go.hc - go.dbif("dbki", dbic(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == go.dbif("dbkj", dbir(int ), (int)27)) break;
            v12 /* !! */  = (long)go.dbif("dbkk", dbir(int ), (int)28);
        }
        this.pos = v11;
        v13 /* !! */  = go.hc;
        if (true) ** GOTO lbl77
        block62: while (true) {
            v13 /* !! */  = (long)(v14 - go.dbif("dbkl", dbic(int ), (int)24));
lbl77:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2088007117: {
                    break block62;
                }
                case -1997258781: {
                    v14 = go.dbif("dbkm", dbic(int ), (int)25);
                    continue block62;
                }
                case 771669476: {
                    v14 = go.dbif("dbkn", dbic(int ), (int)26);
                    continue block62;
                }
                case 1447802752: {
                    v14 = go.dbif("dbko", dbic(int ), (int)27);
                    continue block62;
                }
            }
            break;
        }
        this.prevPos = v11;
        if (var1_3 || var1_3) ** GOTO lbl33
        v15 /* !! */  = go.hc;
        if (true) ** GOTO lbl95
        block63: while (true) {
            v15 /* !! */  = (long)(v16 - go.dbif("dbkp", dbic(int ), (int)28));
lbl95:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -2088007117: {
                    break block63;
                }
                case -218057738: {
                    v16 = go.dbif("dbkq", dbic(int ), (int)29);
                    continue block63;
                }
                case 1854676065: {
                    v16 = go.dbif("dbkr", dbic(int ), (int)30);
                    continue block63;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = go.hc - go.dbif("dbks", dbic(int ), (int)31)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == go.dbif("dbkt", dbir(int ), (int)29)) break;
            v17 /* !! */  = (long)go.dbif("dbku", dbir(int ), (int)30);
        }
        if (!this.reloadChunksSetting.isValue()) ** GOTO lbl140
        if (var1_3 || var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block25 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v18 /* !! */  = go.hc;
                if (true) ** GOTO lbl118
                block65: while (true) {
                    v18 /* !! */  = (long)(go.dbif("dbkw", dbic(int ), (int)33) - go.dbif("dbkv", dbic(int ), (int)32));
lbl118:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2088007117: {
                            break block65;
                        }
                        case -1127006300: {
                            continue block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = go.hc - go.dbif("dbkx", dbic(int ), (int)34)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == go.dbif("dbky", dbir(int ), (int)31)) break;
                    v19 /* !! */  = (long)go.dbif("dbkz", dbir(int ), (int)32);
                }
                v20 = go.mc.field_1769;
                v21 /* !! */  = go.hc;
                if (true) ** GOTO lbl133
                block67: while (true) {
                    v21 /* !! */  = (long)(go.dbif("dblb", dbic(int ), (int)36) - go.dbif("dbla", dbic(int ), (int)35));
lbl133:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2088007117: {
                            break block67;
                        }
                        case 1224558417: {
                            continue block67;
                        }
                    }
                    break;
                }
                v20.method_3279();
                if (var1_3) ** GOTO lbl33
lbl140:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl33
                v22 /* !! */  = go.hc;
                if (true) ** GOTO lbl145
                block68: while (true) {
                    v22 /* !! */  = (long)(v23 - go.dbif("dblc", dbic(int ), (int)37));
lbl145:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -2088007117: {
                            break block68;
                        }
                        case -1966243836: {
                            v23 = go.dbif("dbld", dbic(int ), (int)38);
                            continue block68;
                        }
                        case -241484205: {
                            v23 = go.dbif("dble", dbic(int ), (int)39);
                            continue block68;
                        }
                    }
                    break;
                }
                super.activate();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl158:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)go.dbif("dblf", dbir(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
lbl162:
            // 5 sources

            case 1: {
                var2_2 /* !! */  = (int)go.dbif("dblg", dbir(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 2: {
                var2_2 /* !! */  = (int)go.dbif("dblh", dbir(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 3: {
                var2_2 /* !! */  = (int)go.dbif("dbli", dbir(int ), (int)36);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
lbl176:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)go.dbif("dblj", dbir(int ), (int)37);
                if (!var3_1) ** GOTO lbl158
                throw null;
            }
lbl180:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)go.dbif("dblk", dbir(int ), (int)38);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
lbl184:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)go.dbif("dbll", dbir(int ), (int)39);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)go.dbif("dblm", dbir(int ), (int)40);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)go.dbif("dbln", dbir(int ), (int)41);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)go.dbif("dblo", dbir(int ), (int)42);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)go.dbif("dblp", dbir(int ), (int)43);
                if (!var3_1) ** GOTO lbl158
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)go.dbif("dblq", dbir(int ), (int)44);
                    if (!var3_1) break block25;
                    throw null;
                }
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)go.dbif("dblr", dbir(int ), (int)45);
        ** while (!var3_1)
lbl212:
        // 1 sources

        throw null;
    }

    public go() {
        int n2 = b;
        boolean bl2 = a;
        super("FreeCam", "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u0430\u044f \u043a\u0430\u043c\u0435\u0440\u0430 \u0432 \u043c\u0438\u0440\u0435", du.PLAYER);
        this.speedSetting = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043a\u0430\u043c\u0435\u0440\u044b \u043e\u0442\u043b\u0430\u0434\u043a\u0438", 2.0f).range((float)go.dbif("dbjb", dbja(int ), (int)6), (float)go.dbif("dbjc", dbja(int ), (int)7));
        this.freezeSetting = new kb("\u0417\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", "\u0412\u044b \u0437\u0430\u043c\u043e\u0440\u0430\u0436\u0438\u0432\u0430\u0435\u0442\u0435\u0441\u044c \u043d\u0430 \u043c\u0435\u0441\u0442\u0435").setValue((boolean)go.dbif("dbjd", dbir(int ), (int)8));
        this.reloadChunksSetting = new kb("Reload Chunks", "\u041e\u0442\u043a\u043b\u044e\u0447\u0430\u0435\u0442 cave culling").setValue((boolean)go.dbif("dbje", dbir(int ), (int)9));
        this.toggleOnLogSetting = new kb("Toggle On Log", "\u0412\u044b\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u043f\u0440\u0438 \u0434\u0438\u0441\u043a\u043e\u043d\u043d\u0435\u043a\u0442\u0435").setValue((boolean)go.dbif("dbjf", dbir(int ), (int)10));
        this.settings(this.speedSetting, this.freezeSetting, this.reloadChunksSetting, this.toggleOnLogSetting);
    }

    private static /* synthetic */ long dbic(int n2) {
        return dbid[n2] ^ dbie[n2];
    }

    private static /* synthetic */ void dbwf() {
        go.dbie[0] = -7251525806439648708L;
        go.dbie[1] = -6275441398504711971L;
        go.dbie[2] = -3139644030915880897L;
        go.dbie[3] = -3167200466798088137L;
        go.dbie[4] = -3419147405444935739L;
        go.dbie[5] = -7087396945808297826L;
        go.dbie[6] = -5799186636375476109L;
        go.dbie[7] = -898960319297863577L;
        go.dbie[8] = -6016572744190796465L;
        go.dbie[9] = 3411736305328203699L;
        go.dbie[10] = -2498624492144795481L;
        go.dbie[11] = -1811138607994253781L;
        go.dbie[12] = -7965344360532990494L;
        go.dbie[13] = 1178225835594727435L;
        go.dbie[14] = 6800192813929545948L;
        go.dbie[15] = 2439326870430598291L;
        go.dbie[16] = -7839112386307585958L;
        go.dbie[17] = 3910179417003943411L;
        go.dbie[18] = -7755423970170050305L;
        go.dbie[19] = -7464491715730465977L;
        go.dbie[20] = 6354558094493904123L;
        go.dbie[21] = -2182915965012812127L;
        go.dbie[22] = -5055033105820193816L;
        go.dbie[23] = 5433034652748002480L;
        go.dbie[24] = 8654536631449681362L;
        go.dbie[25] = -5938036547350268258L;
        go.dbie[26] = -4196670143464413913L;
        go.dbie[27] = -3958750922338430884L;
        go.dbie[28] = -8331045098486200455L;
        go.dbie[29] = 5078723637048750179L;
        go.dbie[30] = 8759620399661177998L;
        go.dbie[31] = 6394451555190224470L;
        go.dbie[32] = -8093420444712241433L;
        go.dbie[33] = -5695993434919904828L;
        go.dbie[34] = 6002445783743377873L;
        go.dbie[35] = 4626072859402859275L;
        go.dbie[36] = 3736011201622178812L;
        go.dbie[37] = 4302712500321833786L;
        go.dbie[38] = 7298983853910703766L;
        go.dbie[39] = 428315678751279974L;
        go.dbie[40] = 4472980526098464323L;
        go.dbie[41] = -8166857220157600305L;
        go.dbie[42] = -2703912248703019558L;
        go.dbie[43] = -5137841306532664007L;
        go.dbie[44] = -9223063237483282746L;
        go.dbie[45] = -4831305003647332210L;
        go.dbie[46] = -4089903459923602788L;
        go.dbie[47] = -866707103471991428L;
        go.dbie[48] = -607064163130122863L;
        go.dbie[49] = -2267605568668884446L;
        go.dbie[50] = -2555215290719133074L;
        go.dbie[51] = -7470815229089233626L;
        go.dbie[52] = -7660997893091475454L;
        go.dbie[53] = 689031268996769008L;
        go.dbie[54] = 2896750920799427934L;
        go.dbie[55] = 7621344704034919897L;
        go.dbie[56] = -3990224934818238972L;
        go.dbie[57] = 9161155090709286336L;
        go.dbie[58] = -5825007480171502408L;
        go.dbie[59] = -6893431766233793084L;
        go.dbie[60] = -5585659023492458396L;
        go.dbie[61] = 5755544879714480354L;
        go.dbie[62] = 8728960469957119053L;
        go.dbie[63] = 6823108850669116706L;
        go.dbie[64] = -6308330040093305229L;
        go.dbie[65] = -7326069868703875669L;
        go.dbie[66] = -6548244875835364142L;
        go.dbie[67] = -1275858358176747551L;
        go.dbie[68] = 509674777689528001L;
        go.dbie[69] = 9121876639643823425L;
        go.dbie[70] = -1268991868616781096L;
        go.dbie[71] = -2920500001893066485L;
        go.dbie[72] = -6173057184069027413L;
        go.dbie[73] = 2208760232972064479L;
        go.dbie[74] = 3474277644187870452L;
        go.dbie[75] = 7451497556387595926L;
        go.dbie[76] = -6922994244118410554L;
        go.dbie[77] = 6670557332142086224L;
        go.dbie[78] = 5286512549195092835L;
        go.dbie[79] = -6472806131192012163L;
        go.dbie[80] = -3661290489616035508L;
        go.dbie[81] = -1075270425856337104L;
        go.dbie[82] = -9052239760607979705L;
        go.dbie[83] = 3047435830072878789L;
        go.dbie[84] = -3800341514128404775L;
        go.dbie[85] = -435099682763669135L;
        go.dbie[86] = 8734264146338705424L;
        go.dbie[87] = -3571375713704255838L;
        go.dbie[88] = -7567986566211115673L;
        go.dbie[89] = 8369449771329360949L;
        go.dbie[90] = 7107086170222952330L;
        go.dbie[91] = -5262833917718134662L;
        go.dbie[92] = -8637641406744736806L;
        go.dbie[93] = -6302717736355208113L;
        go.dbie[94] = -8605929476945705291L;
        go.dbie[95] = 5261967825276323506L;
        go.dbie[96] = -8568927684910407227L;
        go.dbie[97] = -8931684609490905280L;
        go.dbie[98] = -3151755018576877604L;
        go.dbie[99] = 5956980971847941363L;
    }

    private static /* synthetic */ void dbwg() {
        go.dbie[100] = -4638562273118902168L;
        go.dbie[101] = 4612291560298086084L;
        go.dbie[102] = -8923940909127514371L;
        go.dbie[103] = -3994393553572958303L;
        go.dbie[104] = -2645289666705200587L;
        go.dbie[105] = -6566951211992252342L;
        go.dbie[106] = 6236368489471593635L;
        go.dbie[107] = 852542475170103622L;
        go.dbie[108] = -6025713086541004754L;
        go.dbie[109] = -1032096636621953900L;
        go.dbie[110] = -4253663591288547497L;
        go.dbie[111] = -2513722983637370729L;
        go.dbie[112] = -3357134244316801651L;
        go.dbie[113] = -7236213762585973893L;
        go.dbie[114] = -2739722249749328213L;
        go.dbie[115] = 4974403397410970157L;
        go.dbie[116] = 600068629875016672L;
        go.dbie[117] = 3697422298048984617L;
        go.dbie[118] = -9058082175346262893L;
        go.dbie[119] = -1254945089434289993L;
        go.dbie[120] = -7445014157369338094L;
        go.dbie[121] = -6961777916406929483L;
        go.dbie[122] = -3556265686815316742L;
        go.dbie[123] = 7149533892096795290L;
        go.dbie[124] = 1893318879243758043L;
        go.dbie[125] = -1187853470370301001L;
        go.dbie[126] = -2946033591103119333L;
        go.dbie[127] = -2030253495869693506L;
        go.dbie[128] = 7452911483260577818L;
        go.dbie[129] = -7667804408043578168L;
        go.dbie[130] = 3072498013486494961L;
        go.dbie[131] = -8783404973537391610L;
        go.dbie[132] = -1226793937722396197L;
        go.dbie[133] = 8449815984868060690L;
        go.dbie[134] = 786892776977224975L;
        go.dbie[135] = -45511182936040988L;
        go.dbie[136] = -7231564497670277912L;
        go.dbie[137] = 252546571827164927L;
        go.dbie[138] = 1712109185050442625L;
        go.dbie[139] = 3278238214150367792L;
        go.dbie[140] = 5467538672520269828L;
        go.dbie[141] = 3698556845233018078L;
        go.dbie[142] = -1309989448740124249L;
        go.dbie[143] = -7666816543472684698L;
        go.dbie[144] = 6885182011541778153L;
        go.dbie[145] = -7076185367005652768L;
        go.dbie[146] = -8237580534161244327L;
        go.dbie[147] = 5353848373138651384L;
        go.dbie[148] = 1465174157637987179L;
        go.dbie[149] = -7672333393157786226L;
        go.dbie[150] = -7759191447370748240L;
        go.dbie[151] = 4673700724888206369L;
        go.dbie[152] = -5682189413678774884L;
        go.dbie[153] = -5008643328728913328L;
    }

    private static /* synthetic */ void dbvz() {
        go.dbis[0] = 571628327;
        go.dbis[1] = 1188905476;
        go.dbis[2] = 1492465480;
        go.dbis[3] = 947880498;
        go.dbis[4] = 164316655;
        go.dbis[5] = 1480031665;
        go.dbis[6] = 1748490781;
        go.dbis[7] = 2046337907;
        go.dbis[8] = -2072224522;
        go.dbis[9] = -363631740;
        go.dbis[10] = -723583335;
        go.dbis[11] = -1455886747;
        go.dbis[12] = -525503035;
        go.dbis[13] = 1600529770;
        go.dbis[14] = -662351261;
        go.dbis[15] = -243187116;
        go.dbis[16] = -524038326;
        go.dbis[17] = -1167471290;
        go.dbis[18] = -1459666396;
        go.dbis[19] = 880728137;
        go.dbis[20] = -758317623;
        go.dbis[21] = -1862440246;
        go.dbis[22] = 1283061090;
        go.dbis[23] = -1904420901;
        go.dbis[24] = 1880540710;
        go.dbis[25] = -631812700;
        go.dbis[26] = -1766232140;
        go.dbis[27] = 847026870;
        go.dbis[28] = 1357000517;
        go.dbis[29] = 1054640270;
        go.dbis[30] = -1355978265;
        go.dbis[31] = -117398601;
        go.dbis[32] = -552056049;
        go.dbis[33] = 1622823167;
        go.dbis[34] = -1051756228;
        go.dbis[35] = 1274905494;
        go.dbis[36] = 304484344;
        go.dbis[37] = 1347798509;
        go.dbis[38] = 1918428890;
        go.dbis[39] = -987114734;
        go.dbis[40] = -1986255159;
        go.dbis[41] = 1272207335;
        go.dbis[42] = -59693853;
        go.dbis[43] = 2137385073;
        go.dbis[44] = -1543230258;
        go.dbis[45] = -1820038427;
        go.dbis[46] = -57432896;
        go.dbis[47] = -1287300745;
        go.dbis[48] = -1779728449;
        go.dbis[49] = 47078167;
        go.dbis[50] = 1694393479;
        go.dbis[51] = -199242413;
        go.dbis[52] = 1730153691;
        go.dbis[53] = -995983286;
        go.dbis[54] = 291593559;
        go.dbis[55] = 436340854;
        go.dbis[56] = -878293107;
        go.dbis[57] = 385961427;
        go.dbis[58] = -293386436;
        go.dbis[59] = 651502087;
        go.dbis[60] = -1894065157;
        go.dbis[61] = -1434852089;
        go.dbis[62] = -1052424786;
        go.dbis[63] = -1228615112;
        go.dbis[64] = -637402193;
        go.dbis[65] = 634820695;
        go.dbis[66] = -1075545281;
        go.dbis[67] = -596121147;
        go.dbis[68] = -144323830;
        go.dbis[69] = -477485862;
        go.dbis[70] = -545267036;
        go.dbis[71] = 682102249;
        go.dbis[72] = 1139093085;
        go.dbis[73] = -1281960009;
        go.dbis[74] = 1308145;
        go.dbis[75] = 948915277;
        go.dbis[76] = -1704336851;
        go.dbis[77] = -405349097;
        go.dbis[78] = -324287823;
        go.dbis[79] = 2021735109;
        go.dbis[80] = 43315579;
        go.dbis[81] = -645402740;
        go.dbis[82] = 530477045;
        go.dbis[83] = 1955581947;
        go.dbis[84] = -1129164951;
        go.dbis[85] = 1054349825;
        go.dbis[86] = 1621559484;
        go.dbis[87] = 1549219362;
        go.dbis[88] = 652693671;
        go.dbis[89] = -1723175047;
        go.dbis[90] = -2127716333;
        go.dbis[91] = 2130452909;
        go.dbis[92] = 1780170510;
        go.dbis[93] = -2116756290;
        go.dbis[94] = -2131352839;
        go.dbis[95] = -887330839;
        go.dbis[96] = -380076695;
        go.dbis[97] = -1576633993;
        go.dbis[98] = -472225322;
        go.dbis[99] = -198581845;
    }

    private static /* synthetic */ void dbwa() {
        go.dbis[100] = -1218974225;
        go.dbis[101] = -996672944;
        go.dbis[102] = 1836736912;
        go.dbis[103] = 799266630;
        go.dbis[104] = 1926205606;
        go.dbis[105] = 2042505811;
        go.dbis[106] = 1529240487;
        go.dbis[107] = 423175740;
        go.dbis[108] = -2071602191;
        go.dbis[109] = -741053188;
        go.dbis[110] = 1334493984;
        go.dbis[111] = -759959385;
        go.dbis[112] = 1041164848;
        go.dbis[113] = -858468583;
        go.dbis[114] = -277088503;
        go.dbis[115] = -1635724848;
        go.dbis[116] = -1052236681;
        go.dbis[117] = -1536597965;
        go.dbis[118] = 945143808;
        go.dbis[119] = -2049605237;
        go.dbis[120] = -551906565;
        go.dbis[121] = 88684091;
        go.dbis[122] = 1018813206;
        go.dbis[123] = -1674554263;
        go.dbis[124] = 1800129867;
        go.dbis[125] = 1102460477;
        go.dbis[126] = 1517557461;
        go.dbis[127] = 728013959;
        go.dbis[128] = 1131282431;
        go.dbis[129] = -170663854;
        go.dbis[130] = 1540349458;
        go.dbis[131] = 1426003991;
        go.dbis[132] = 2091160916;
        go.dbis[133] = -1961460404;
        go.dbis[134] = -232228639;
        go.dbis[135] = -1869260268;
        go.dbis[136] = -1585732552;
        go.dbis[137] = 0x5E588E55;
        go.dbis[138] = 648524223;
        go.dbis[139] = -1513698286;
        go.dbis[140] = 360167458;
        go.dbis[141] = 236525467;
        go.dbis[142] = -679715121;
        go.dbis[143] = -636980640;
        go.dbis[144] = 1250543686;
        go.dbis[145] = -26324602;
        go.dbis[146] = 1615607749;
        go.dbis[147] = 466367040;
        go.dbis[148] = 17111877;
        go.dbis[149] = -1926141599;
        go.dbis[150] = -320032069;
        go.dbis[151] = -1638233622;
        go.dbis[152] = -844610275;
        go.dbis[153] = 2003863509;
        go.dbis[154] = 431706419;
        go.dbis[155] = 1265799952;
        go.dbis[156] = -1079510775;
        go.dbis[157] = 362569407;
        go.dbis[158] = 1662471164;
        go.dbis[159] = 1079670255;
        go.dbis[160] = -435772867;
        go.dbis[161] = 752808544;
        go.dbis[162] = 385929419;
        go.dbis[163] = -1789719397;
        go.dbis[164] = 740762322;
        go.dbis[165] = -1595503132;
        go.dbis[166] = 1789406802;
        go.dbis[167] = -1826095599;
        go.dbis[168] = -779244185;
        go.dbis[169] = 2064588174;
        go.dbis[170] = -1625538719;
        go.dbis[171] = -1758526060;
        go.dbis[172] = -2037842417;
        go.dbis[173] = 540796945;
        go.dbis[174] = 2135619546;
        go.dbis[175] = 451497811;
        go.dbis[176] = 728716649;
        go.dbis[177] = -216780011;
        go.dbis[178] = -502640025;
        go.dbis[179] = -247801821;
        go.dbis[180] = -1276598298;
        go.dbis[181] = 543519994;
        go.dbis[182] = -882107364;
        go.dbis[183] = 294098391;
        go.dbis[184] = -1695336928;
        go.dbis[185] = -1641551024;
        go.dbis[186] = 1405187575;
        go.dbis[187] = 1274536342;
        go.dbis[188] = -931495810;
        go.dbis[189] = -879809747;
        go.dbis[190] = 1613805536;
        go.dbis[191] = -167102289;
        go.dbis[192] = -96098173;
        go.dbis[193] = -819785492;
        go.dbis[194] = -1042344500;
        go.dbis[195] = 1796594012;
        go.dbis[196] = -1088793803;
        go.dbis[197] = -1667835822;
        go.dbis[198] = -697986874;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        v0 /* !! */  = go.hc;
        if (true) ** GOTO lbl5
        block51: while (true) {
            v0 /* !! */  = (long)(v1 - go.dbif("dbqb", dbic(int ), (int)75));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2088007117: {
                    break block51;
                }
                case 116195679: {
                    v1 = go.dbif("dbqc", dbic(int ), (int)76);
                    continue block51;
                }
                case 1038585298: {
                    v1 = go.dbif("dbqd", dbic(int ), (int)77);
                    continue block51;
                }
                case 1564443021: {
                    v1 = go.dbif("dbqe", dbic(int ), (int)78);
                    continue block51;
                }
            }
            break;
        }
        var6_2 = go.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dbqf", dbic(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == go.dbif("dbqg", dbir(int ), (int)124)) break;
            v2 /* !! */  = (long)go.dbif("dbqh", dbir(int ), (int)125);
        }
        var5_3 /* !! */  = go.b;
        v3 /* !! */  = go.hc;
        if (true) ** GOTO lbl28
        block53: while (true) {
            v3 /* !! */  = (long)(go.dbif("dbqj", dbic(int ), (int)81) - go.dbif("dbqi", dbic(int ), (int)80));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2088007117: {
                    break block53;
                }
                case -186817668: {
                    continue block53;
                }
            }
            break;
        }
        var4_4 = go.a;
        if (var6_2) {
            throw null;
lbl36:
            // 7 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl36
        v4 /* !! */  = go.hc;
        if (true) ** GOTO lbl43
        block55: while (true) {
            v4 /* !! */  = (long)(go.dbif("dbql", dbic(int ), (int)83) - go.dbif("dbqk", dbic(int ), (int)82));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2088007117: {
                    break block55;
                }
                case -569217636: {
                    continue block55;
                }
            }
            break;
        }
        v5 /* !! */  = go.hc;
        if (true) ** GOTO lbl52
        block56: while (true) {
            v5 /* !! */  = (long)(go.dbif("dbqn", dbic(int ), (int)85) - go.dbif("dbqm", dbic(int ), (int)84));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2088007117: {
                    break block56;
                }
                case 753702262: {
                    continue block56;
                }
            }
            break;
        }
        var2_5 = this.speedSetting.getValue();
        if (var4_4 || var4_4) ** GOTO lbl36
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = go.hc - go.dbif("dbqo", dbic(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == go.dbif("dbqp", dbir(int ), (int)126)) break;
            v6 /* !! */  = (long)go.dbif("dbqq", dbir(int ), (int)127);
        }
        v7 = var1_1.forward();
        v8 /* !! */  = go.hc;
        if (true) ** GOTO lbl69
        block58: while (true) {
            v8 /* !! */  = (long)(v9 - go.dbif("dbqr", dbic(int ), (int)87));
lbl69:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2088007117: {
                    break block58;
                }
                case -1961398571: {
                    v9 = go.dbif("dbqs", dbic(int ), (int)88);
                    continue block58;
                }
                case 1149668759: {
                    v9 = go.dbif("dbqt", dbic(int ), (int)89);
                    continue block58;
                }
            }
            break;
        }
        v10 = var1_1.sideways();
        v11 = var2_5;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = go.hc - go.dbif("dbqu", dbic(int ), (int)90)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == go.dbif("dbqv", dbir(int ), (int)128)) break;
            v12 /* !! */  = (long)go.dbif("dbqw", dbir(int ), (int)129);
        }
        var3_6 = nq.calculateDirection(v7, v10, v11);
        if (var4_4) ** GOTO lbl36
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl36
                v13 /* !! */  = go.hc;
                if (true) ** GOTO lbl95
                block60: while (true) {
                    v13 /* !! */  = (long)(v14 - go.dbif("dbqx", dbic(int ), (int)91));
lbl95:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2088007117: {
                            break block60;
                        }
                        case -926797343: {
                            v14 = go.dbif("dbqy", dbic(int ), (int)92);
                            continue block60;
                        }
                        case 933780322: {
                            v14 = go.dbif("dbqz", dbic(int ), (int)93);
                            continue block60;
                        }
                        case 1742174487: {
                            v14 = go.dbif("dbra", dbic(int ), (int)94);
                            continue block60;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = go.hc - go.dbif("dbrb", dbic(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == go.dbif("dbrc", dbir(int ), (int)130)) break;
                    v15 /* !! */  = (long)go.dbif("dbrd", dbir(int ), (int)131);
                }
                this.prevPos = this.pos;
                if (var4_4 || var4_4) ** GOTO lbl36
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = go.hc - go.dbif("dbre", dbic(int ), (int)96)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == go.dbif("dbrf", dbir(int ), (int)132)) break;
                    v16 /* !! */  = (long)go.dbif("dbrg", dbir(int ), (int)133);
                }
                v17 = var3_6[0];
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = go.hc - go.dbif("dbrh", dbic(int ), (int)97)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == go.dbif("dbri", dbir(int ), (int)134)) break;
                    v18 /* !! */  = (long)go.dbif("dbrj", dbir(int ), (int)135);
                }
                v19 = var1_1.getInput();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = go.hc - go.dbif("dbrk", dbic(int ), (int)98)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == go.dbif("dbrl", dbir(int ), (int)136)) break;
                    v20 /* !! */  = (long)go.dbif("dbrm", dbir(int ), (int)137);
                }
                if (v19.comp_3163()) {
                    v21 = var2_5;
                    if (var6_2) {
                        throw null;
                    }
                } else {
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_7 = go.hc - go.dbif("dbrn", dbic(int ), (int)99)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == go.dbif("dbro", dbir(int ), (int)138)) break;
                        v22 /* !! */  = (long)go.dbif("dbrp", dbir(int ), (int)139);
                    }
                    v23 = var1_1.getInput();
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = go.hc - go.dbif("dbrq", dbic(int ), (int)100)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == go.dbif("dbrr", dbir(int ), (int)140)) break;
                        v24 /* !! */  = (long)go.dbif("dbrs", dbir(int ), (int)141);
                    }
                    if (v23.comp_3164()) {
                        v21 = -var2_5;
                        if (var6_2) {
                            throw null;
                        }
                    } else {
                        v21 = 0.0;
                    }
                }
                v25 = var3_6[1];
                v26 /* !! */  = go.hc;
                if (true) ** GOTO lbl158
                block67: while (true) {
                    v26 /* !! */  = (long)(v27 - go.dbif("dbrt", dbic(int ), (int)101));
lbl158:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2088007117: {
                            break block67;
                        }
                        case -1759375301: {
                            v27 = go.dbif("dbru", dbic(int ), (int)102);
                            continue block67;
                        }
                        case -1596162760: {
                            v27 = go.dbif("dbrv", dbic(int ), (int)103);
                            continue block67;
                        }
                        case -878825996: {
                            v27 = go.dbif("dbrw", dbic(int ), (int)104);
                            continue block67;
                        }
                    }
                    break;
                }
                v28 = this.pos.method_1031(v17, v21, v25);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = go.hc - go.dbif("dbrx", dbic(int ), (int)105)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == go.dbif("dbry", dbir(int ), (int)142)) break;
                    v29 /* !! */  = (long)go.dbif("dbrz", dbir(int ), (int)143);
                }
                this.pos = v28;
                if (var4_4 || var4_4) ** GOTO lbl36
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_10 = go.hc - go.dbif("dbsa", dbic(int ), (int)106)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == go.dbif("dbsb", dbir(int ), (int)144)) break;
                    v30 /* !! */  = (long)go.dbif("dbsc", dbir(int ), (int)145);
                }
                var1_1.inputNone();
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl187:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)go.dbif("dbsd", dbir(int ), (int)146);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 1: {
                var5_3 /* !! */  = (int)go.dbif("dbse", dbir(int ), (int)147);
                if (!var6_2) ** GOTO lbl187
                throw null;
            }
            case 2: {
                var5_3 /* !! */  = (int)go.dbif("dbsf", dbir(int ), (int)148);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 3: {
                var5_3 /* !! */  = (int)go.dbif("dbsg", dbir(int ), (int)149);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl206:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)go.dbif("dbsh", dbir(int ), (int)150);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl211:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)go.dbif("dbsi", dbir(int ), (int)151);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl215:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)go.dbif("dbsj", dbir(int ), (int)152);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl220:
            // 2 sources

            case 7: {
                do {
                    var5_3 /* !! */  = (int)go.dbif("dbsk", dbir(int ), (int)153);
                } while (!var6_2);
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)go.dbif("dbsl", dbir(int ), (int)154);
                if (!var6_2) ** GOTO lbl187
                throw null;
            }
lbl229:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)go.dbif("dbsm", dbir(int ), (int)155);
                if (!var6_2) ** GOTO lbl187
                throw null;
            }
lbl233:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)go.dbif("dbsn", dbir(int ), (int)156);
                    if (!var6_2) ** GOTO lbl220
                    throw null;
                }
            }
            case 11: {
                var5_3 /* !! */  = (int)go.dbif("dbso", dbir(int ), (int)157);
                if (!var6_2) ** GOTO lbl211
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)go.dbif("dbsp", dbir(int ), (int)158);
                if (!var6_2) ** GOTO lbl233
                throw null;
            }
            case 13: 
        }
        var5_3 /* !! */  = (int)go.dbif("dbsq", dbir(int ), (int)159);
        ** while (!var6_2)
lbl249:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dbja(int n2) {
        return Float.intBitsToFloat(dbis[n2] ^ dbit[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onGameLeft(ca var1_1) {
        v0 /* !! */  = go.hc;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - go.dbif("dbuv", dbic(int ), (int)138));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2088007117: {
                    break block33;
                }
                case -1305347057: {
                    v1 = go.dbif("dbuw", dbic(int ), (int)139);
                    continue block33;
                }
                case 505608499: {
                    v1 = go.dbif("dbux", dbic(int ), (int)140);
                    continue block33;
                }
                case 1223001423: {
                    v1 = go.dbif("dbuy", dbic(int ), (int)141);
                    continue block33;
                }
            }
            break;
        }
        var4_2 = go.c;
        v2 /* !! */  = go.hc;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(go.dbif("dbva", dbic(int ), (int)143) - go.dbif("dbuz", dbic(int ), (int)142));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2088007117: {
                    break block34;
                }
                case -1586961373: {
                    continue block34;
                }
            }
            break;
        }
        var3_3 /* !! */  = go.b;
        v3 /* !! */  = go.hc;
        if (true) ** GOTO lbl32
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - go.dbif("dbvb", dbic(int ), (int)144));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2088007117: {
                    break block35;
                }
                case -1889128288: {
                    v4 = go.dbif("dbvc", dbic(int ), (int)145);
                    continue block35;
                }
                case -1522840981: {
                    v4 = go.dbif("dbvd", dbic(int ), (int)146);
                    continue block35;
                }
                case 2131629072: {
                    v4 = go.dbif("dbve", dbic(int ), (int)147);
                    continue block35;
                }
            }
            break;
        }
        var2_4 = go.a;
        if (!var4_2) ** GOTO lbl51
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl51:
                // 1 sources

                if (var2_4 || var2_4) continue block36;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dbvf", dbic(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == go.dbif("dbvg", dbir(int ), (int)185)) break;
                    v5 /* !! */  = (long)go.dbif("dbvh", dbir(int ), (int)186);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = go.hc - go.dbif("dbvi", dbic(int ), (int)149)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == go.dbif("dbvj", dbir(int ), (int)187)) break;
                    v6 /* !! */  = (long)go.dbif("dbvk", dbir(int ), (int)188);
                }
                if (!this.toggleOnLogSetting.isValue()) ** GOTO lbl85
                if (var2_4 || var2_4) continue block36;
                v7 = go.dbif("dbvl", dbir(int ), (int)189);
                v8 /* !! */  = go.hc;
                if (true) ** GOTO lbl71
                block39: while (true) {
                    v8 /* !! */  = (long)(v9 - go.dbif("dbvm", dbic(int ), (int)150));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2088007117: {
                            break block39;
                        }
                        case -1972027951: {
                            v9 = go.dbif("dbvn", dbic(int ), (int)151);
                            continue block39;
                        }
                        case -1036252814: {
                            v9 = go.dbif("dbvo", dbic(int ), (int)152);
                            continue block39;
                        }
                        case 1880503771: {
                            v9 = go.dbif("dbvp", dbic(int ), (int)153);
                            continue block39;
                        }
                    }
                    break;
                }
                this.setState((boolean)v7);
                if (var2_4) continue block36;
lbl85:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                continue block36;
                return;
                case 0: {
                    var3_3 /* !! */  = (int)go.dbif("dbvq", dbir(int ), (int)190);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                }
lbl93:
                // 3 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)go.dbif("dbvr", dbir(int ), (int)191);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl108
                        break;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)go.dbif("dbvs", dbir(int ), (int)192);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl108
                }
                case 3: {
                    var3_3 /* !! */  = (int)go.dbif("dbvt", dbir(int ), (int)193);
                    if (!var4_2) break block36;
                    throw null;
                }
lbl108:
                // 3 sources

                case 4: {
                    var3_3 /* !! */  = (int)go.dbif("dbvu", dbir(int ), (int)194);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                }
                case 5: {
                    var3_3 /* !! */  = (int)go.dbif("dbvv", dbir(int ), (int)195);
                    if (!var4_2) ** GOTO lbl93
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)go.dbif("dbvw", dbir(int ), (int)196);
                    if (!var4_2) ** GOTO lbl93
                    throw null;
                }
lbl121:
                // 3 sources

                case 7: {
                    do {
                        var3_3 /* !! */  = (int)go.dbif("dbvx", dbir(int ), (int)197);
                    } while (!var4_2);
                    throw null;
                }
                case 8: 
            }
        }
        var3_3 /* !! */  = (int)go.dbif("dbvy", dbir(int ), (int)198);
        ** while (!var4_2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onCameraPosition(bn var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dbsr", dbic(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == go.dbif("dbss", dbir(int ), (int)160)) break;
            v0 /* !! */  = (long)go.dbif("dbst", dbir(int ), (int)161);
        }
        var4_2 = go.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = go.hc - go.dbif("dbsu", dbic(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == go.dbif("dbsv", dbir(int ), (int)162)) break;
            v1 /* !! */  = (long)go.dbif("dbsw", dbir(int ), (int)163);
        }
        var3_3 /* !! */  = go.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = go.hc - go.dbif("dbsx", dbic(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == go.dbif("dbsy", dbir(int ), (int)164)) break;
            v2 /* !! */  = (long)go.dbif("dbsz", dbir(int ), (int)165);
        }
        var2_4 = go.a;
        if (var4_2) {
            throw null;
lbl24:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = go.hc - go.dbif("dbta", dbic(int ), (int)110)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == go.dbif("dbtb", dbir(int ), (int)166)) break;
            v3 /* !! */  = (long)go.dbif("dbtc", dbir(int ), (int)167);
        }
        v4 /* !! */  = go.hc;
        if (true) ** GOTO lbl37
        block47: while (true) {
            v4 /* !! */  = (long)(go.dbif("dbte", dbic(int ), (int)112) - go.dbif("dbtd", dbic(int ), (int)111));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2088007117: {
                    break block47;
                }
                case -1009410769: {
                    continue block47;
                }
            }
            break;
        }
        v5 /* !! */  = go.hc;
        if (true) ** GOTO lbl46
        block48: while (true) {
            v5 /* !! */  = (long)(go.dbif("dbtg", dbic(int ), (int)114) - go.dbif("dbtf", dbic(int ), (int)113));
lbl46:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2088007117: {
                    break block48;
                }
                case -1115618710: {
                    continue block48;
                }
            }
            break;
        }
        v6 = nm.interpolate(this.prevPos, this.pos);
        v7 /* !! */  = go.hc;
        if (true) ** GOTO lbl56
        block49: while (true) {
            v7 /* !! */  = (long)(v8 - go.dbif("dbth", dbic(int ), (int)115));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2088007117: {
                    break block49;
                }
                case -1818073675: {
                    v8 = go.dbif("dbti", dbic(int ), (int)116);
                    continue block49;
                }
                case 331574577: {
                    v8 = go.dbif("dbtj", dbic(int ), (int)117);
                    continue block49;
                }
                case 1115131922: {
                    v8 = go.dbif("dbtk", dbic(int ), (int)118);
                    continue block49;
                }
            }
            break;
        }
        var1_1.setPos(v6);
        if (var2_4 || var2_4) ** GOTO lbl24
        v9 /* !! */  = go.hc;
        if (true) ** GOTO lbl74
        block50: while (true) {
            v9 /* !! */  = (long)(go.dbif("dbtm", dbic(int ), (int)120) - go.dbif("dbtl", dbic(int ), (int)119));
lbl74:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2088007117: {
                    break block50;
                }
                case 298108284: {
                    continue block50;
                }
            }
            break;
        }
        v10 /* !! */  = go.hc;
        if (true) ** GOTO lbl83
        block51: while (true) {
            v10 /* !! */  = (long)(v11 - go.dbif("dbtn", dbic(int ), (int)121));
lbl83:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2118191480: {
                    v11 = go.dbif("dbto", dbic(int ), (int)122);
                    continue block51;
                }
                case -2088007117: {
                    break block51;
                }
                case 2023706380: {
                    v11 = go.dbif("dbtp", dbic(int ), (int)123);
                    continue block51;
                }
            }
            break;
        }
        v12 = go.mc.field_1690;
        v13 /* !! */  = go.hc;
        if (true) ** GOTO lbl97
        block52: while (true) {
            v13 /* !! */  = (long)(go.dbif("dbtr", dbic(int ), (int)125) - go.dbif("dbtq", dbic(int ), (int)124));
lbl97:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2088007117: {
                    break block52;
                }
                case -786587312: {
                    continue block52;
                }
            }
            break;
        }
        v14 /* !! */  = go.hc;
        if (true) ** GOTO lbl106
        block53: while (true) {
            v14 /* !! */  = (long)(v15 - go.dbif("dbts", dbic(int ), (int)126));
lbl106:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -2088007117: {
                    break block53;
                }
                case -867223179: {
                    v15 = go.dbif("dbtt", dbic(int ), (int)127);
                    continue block53;
                }
                case 430837948: {
                    v15 = go.dbif("dbtu", dbic(int ), (int)128);
                    continue block53;
                }
            }
            break;
        }
        v12.method_31043(class_5498.field_26664);
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)go.dbif("dbtv", dbir(int ), (int)168);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)go.dbif("dbtw", dbir(int ), (int)169);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)go.dbif("dbtx", dbir(int ), (int)170);
                } while (!var4_2);
                throw null;
            }
lbl138:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)go.dbif("dbty", dbir(int ), (int)171);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)go.dbif("dbtz", dbir(int ), (int)172);
                if (!var4_2) ** GOTO lbl138
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)go.dbif("dbua", dbir(int ), (int)173);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)go.dbif("dbub", dbir(int ), (int)174);
                if (!var4_2) break;
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)go.dbif("dbuc", dbir(int ), (int)175);
        ** while (!var4_2)
lbl158:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onChunkOcclusion(bq var1_1) {
        v0 /* !! */  = go.hc;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(go.dbif("dbue", dbic(int ), (int)130) - go.dbif("dbud", dbic(int ), (int)129));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2088007117: {
                    break block22;
                }
                case 1744393559: {
                    continue block22;
                }
            }
            break;
        }
        var4_2 = go.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dbuf", dbic(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == go.dbif("dbug", dbir(int ), (int)176)) break;
            v1 /* !! */  = (long)go.dbif("dbuh", dbir(int ), (int)177);
        }
        var3_3 /* !! */  = go.b;
        v2 /* !! */  = go.hc;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - go.dbif("dbui", dbic(int ), (int)132));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2142958485: {
                    v3 = go.dbif("dbuj", dbic(int ), (int)133);
                    continue block24;
                }
                case -2088007117: {
                    break block24;
                }
                case 1572374261: {
                    v3 = go.dbif("dbuk", dbic(int ), (int)134);
                    continue block24;
                }
                case 1845424956: {
                    v3 = go.dbif("dbul", dbic(int ), (int)135);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = go.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                v4 = go.dbif("dbum", dbir(int ), (int)178);
                v5 /* !! */  = go.hc;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(go.dbif("dbuo", dbic(int ), (int)137) - go.dbif("dbun", dbic(int ), (int)136));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2088007117: {
                            break block26;
                        }
                        case -18943478: {
                            continue block26;
                        }
                    }
                    break;
                }
                var1_1.setCancelled((boolean)v4);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl58:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)go.dbif("dbup", dbir(int ), (int)179);
                if (!var4_2) break;
                throw null;
            }
lbl62:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)go.dbif("dbuq", dbir(int ), (int)180);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)go.dbif("dbur", dbir(int ), (int)181);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)go.dbif("dbus", dbir(int ), (int)182);
                    if (!var4_2) ** GOTO lbl62
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)go.dbif("dbut", dbir(int ), (int)183);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)go.dbif("dbuu", dbir(int ), (int)184);
        ** while (!var4_2)
lbl83:
        // 1 sources

        throw null;
    }

    static {
        dbis = new int[199];
        dbit = new int[199];
        go.dbvz();
        go.dbwa();
        go.dbwb();
        go.dbwc();
        dbid = new long[154];
        dbie = new long[154];
        go.dbwd();
        go.dbwe();
        go.dbwf();
        go.dbwg();
    }

    private static /* synthetic */ void dbwc() {
        go.dbit[100] = -1218974214;
        go.dbit[101] = -996672948;
        go.dbit[102] = 1836736919;
        go.dbit[103] = 799266640;
        go.dbit[104] = 1926205631;
        go.dbit[105] = 2042505793;
        go.dbit[106] = 1529240501;
        go.dbit[107] = 423175741;
        go.dbit[108] = 920252385;
        go.dbit[109] = 741053187;
        go.dbit[110] = -765303009;
        go.dbit[111] = 759959384;
        go.dbit[112] = -1376281689;
        go.dbit[113] = 858468582;
        go.dbit[114] = -175821165;
        go.dbit[115] = -1635724847;
        go.dbit[116] = -1052236688;
        go.dbit[117] = -1536597957;
        go.dbit[118] = 945143815;
        go.dbit[119] = -2049605233;
        go.dbit[120] = -551906566;
        go.dbit[121] = 88684090;
        go.dbit[122] = 1018813214;
        go.dbit[123] = -1674554260;
        go.dbit[124] = -1800129868;
        go.dbit[125] = 1361829849;
        go.dbit[126] = 1517557460;
        go.dbit[127] = 137952489;
        go.dbit[128] = -1131282432;
        go.dbit[129] = 805825242;
        go.dbit[130] = 1540349459;
        go.dbit[131] = -320957337;
        go.dbit[132] = 2091160917;
        go.dbit[133] = -138327315;
        go.dbit[134] = 232228638;
        go.dbit[135] = -1699068666;
        go.dbit[136] = 1585732551;
        go.dbit[137] = 27918910;
        go.dbit[138] = -648524224;
        go.dbit[139] = -1372224729;
        go.dbit[140] = 360167459;
        go.dbit[141] = 1607263721;
        go.dbit[142] = -679715122;
        go.dbit[143] = -2126057473;
        go.dbit[144] = 1250543687;
        go.dbit[145] = 886446825;
        go.dbit[146] = 1615607756;
        go.dbit[147] = 466367046;
        go.dbit[148] = 17111885;
        go.dbit[149] = -1926141592;
        go.dbit[150] = -320032071;
        go.dbit[151] = -1638233617;
        go.dbit[152] = -844610283;
        go.dbit[153] = 2003863508;
        go.dbit[154] = 431706425;
        go.dbit[155] = 1265799961;
        go.dbit[156] = -1079510774;
        go.dbit[157] = 362569398;
        go.dbit[158] = 1662471163;
        go.dbit[159] = 1079670248;
        go.dbit[160] = -435772868;
        go.dbit[161] = -509935799;
        go.dbit[162] = -385929420;
        go.dbit[163] = 550763351;
        go.dbit[164] = 740762323;
        go.dbit[165] = -225357312;
        go.dbit[166] = -1789406803;
        go.dbit[167] = 1598212584;
        go.dbit[168] = -779244188;
        go.dbit[169] = 2064588168;
        go.dbit[170] = -1625538719;
        go.dbit[171] = -1758526057;
        go.dbit[172] = -2037842422;
        go.dbit[173] = 540796946;
        go.dbit[174] = 2135619544;
        go.dbit[175] = 451497809;
        go.dbit[176] = 728716648;
        go.dbit[177] = 1011810087;
        go.dbit[178] = -502640026;
        go.dbit[179] = -247801818;
        go.dbit[180] = -1276598297;
        go.dbit[181] = 543519992;
        go.dbit[182] = -882107364;
        go.dbit[183] = 294098391;
        go.dbit[184] = -1695336926;
        go.dbit[185] = 1641551023;
        go.dbit[186] = -480738848;
        go.dbit[187] = 1274536343;
        go.dbit[188] = 1527938952;
        go.dbit[189] = -879809747;
        go.dbit[190] = 1613805543;
        go.dbit[191] = -167102294;
        go.dbit[192] = -96098172;
        go.dbit[193] = -819785500;
        go.dbit[194] = -1042344497;
        go.dbit[195] = 1796594010;
        go.dbit[196] = -1088793805;
        go.dbit[197] = -1667835822;
        go.dbit[198] = -697986875;
    }

    public static /* synthetic */ CallSite dbif(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static go getInstance() {
        Object object = hc;
        boolean bl2 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - go.dbif("dbig", dbic(int ), (int)0);
            }
            switch ((int)object) {
                case -2088007117: {
                    break block16;
                }
                case -787786963: {
                    callSite = go.dbif("dbih", dbic(int ), (int)1);
                    continue block16;
                }
                case -756436802: {
                    callSite = go.dbif("dbii", dbic(int ), (int)2);
                    continue block16;
                }
                case 1384315458: {
                    callSite = go.dbif("dbij", dbic(int ), (int)3);
                    continue block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = hc;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - go.dbif("dbik", dbic(int ), (int)4);
            }
            switch ((int)object2) {
                case -2088007117: {
                    break block17;
                }
                case 156176482: {
                    callSite = go.dbif("dbil", dbic(int ), (int)5);
                    continue block17;
                }
                case 2030507022: {
                    callSite = go.dbif("dbim", dbic(int ), (int)6);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = hc;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - go.dbif("dbin", dbic(int ), (int)7);
            }
            switch ((int)object3) {
                case -2088007117: {
                    break block18;
                }
                case -95891088: {
                    callSite = go.dbif("dbio", dbic(int ), (int)8);
                    continue block18;
                }
                case 337611183: {
                    callSite = go.dbif("dbip", dbic(int ), (int)9);
                    continue block18;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return null;
        if (bl6) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = hc - go.dbif("dbiq", dbic(int ), (int)10)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == go.dbif("dbiu", dbir(int ), (int)0)) {
                return nj.get(go.class);
            }
            object4 = go.dbif("dbiv", dbir(int ), (int)1);
        }
    }

    private static /* synthetic */ int dbir(int n2) {
        return dbis[n2] ^ dbit[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = go.hc;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(go.dbif("dblt", dbic(int ), (int)41) - go.dbif("dbls", dbic(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2088007117: {
                    break block41;
                }
                case 1558975505: {
                    continue block41;
                }
            }
            break;
        }
        var3_1 = go.c;
        v1 /* !! */  = go.hc;
        if (true) ** GOTO lbl15
        block42: while (true) {
            v1 /* !! */  = (long)(go.dbif("dblv", dbic(int ), (int)43) - go.dbif("dblu", dbic(int ), (int)42));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2088007117: {
                    break block42;
                }
                case -932601554: {
                    continue block42;
                }
            }
            break;
        }
        var2_2 /* !! */  = go.b;
        v2 /* !! */  = go.hc;
        if (true) ** GOTO lbl25
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - go.dbif("dblw", dbic(int ), (int)44));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2088007117: {
                    break block43;
                }
                case -399470394: {
                    v3 = go.dbif("dblx", dbic(int ), (int)45);
                    continue block43;
                }
                case -234916942: {
                    v3 = go.dbif("dbly", dbic(int ), (int)46);
                    continue block43;
                }
            }
            break;
        }
        var1_3 = go.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block44;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = go.hc - go.dbif("dblz", dbic(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == go.dbif("dbma", dbir(int ), (int)46)) break;
                    v4 /* !! */  = (long)go.dbif("dbmb", dbir(int ), (int)47);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = go.hc - go.dbif("dbmc", dbic(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == go.dbif("dbmd", dbir(int ), (int)48)) break;
                    v5 /* !! */  = (long)go.dbif("dbme", dbir(int ), (int)49);
                }
                if (!this.reloadChunksSetting.isValue()) ** GOTO lbl112
                if (var1_3 || var1_3) continue block44;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = go.hc - go.dbif("dbmf", dbic(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == go.dbif("dbmg", dbir(int ), (int)50)) break;
                    v6 /* !! */  = (long)go.dbif("dbmh", dbir(int ), (int)51);
                }
                v7 /* !! */  = go.hc;
                if (true) ** GOTO lbl63
                block48: while (true) {
                    v7 /* !! */  = (long)(go.dbif("dbmj", dbic(int ), (int)51) - go.dbif("dbmi", dbic(int ), (int)50));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2088007117: {
                            break block48;
                        }
                        case 1744589953: {
                            continue block48;
                        }
                    }
                    break;
                }
                v8 /* !! */  = go.hc;
                if (true) ** GOTO lbl72
                block49: while (true) {
                    v8 /* !! */  = (long)(v9 - go.dbif("dbmk", dbic(int ), (int)52));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2088007117: {
                            break block49;
                        }
                        case 599322948: {
                            v9 = go.dbif("dbml", dbic(int ), (int)53);
                            continue block49;
                        }
                        case 2093916452: {
                            v9 = go.dbif("dbmm", dbic(int ), (int)54);
                            continue block49;
                        }
                    }
                    break;
                }
                v10 = go.mc.field_1769;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = go.hc - go.dbif("dbmn", dbic(int ), (int)55)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == go.dbif("dbmo", dbir(int ), (int)52)) break;
                    v11 /* !! */  = (long)go.dbif("dbmp", dbir(int ), (int)53);
                }
                Objects.requireNonNull(v10);
                v12 /* !! */  = go.hc;
                if (true) ** GOTO lbl92
                block51: while (true) {
                    v12 /* !! */  = (long)(v13 - go.dbif("dbmq", dbic(int ), (int)56));
lbl92:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2088007117: {
                            break block51;
                        }
                        case 439411421: {
                            v13 = go.dbif("dbmr", dbic(int ), (int)57);
                            continue block51;
                        }
                        case 587655153: {
                            v13 = go.dbif("dbms", dbic(int ), (int)58);
                            continue block51;
                        }
                        case 1213424803: {
                            v13 = go.dbif("dbmt", dbic(int ), (int)59);
                            continue block51;
                        }
                    }
                    break;
                }
                v14 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, method_3279(), ()V)((class_761)v10);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = go.hc - go.dbif("dbmu", dbic(int ), (int)60)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == go.dbif("dbmv", dbir(int ), (int)54)) break;
                    v15 /* !! */  = (long)go.dbif("dbmw", dbir(int ), (int)55);
                }
                go.mc.execute(v14);
                if (var1_3) continue block44;
lbl112:
                // 2 sources

                if (var1_3 || var1_3) continue block44;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = go.hc - go.dbif("dbmx", dbic(int ), (int)61)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == go.dbif("dbmy", dbir(int ), (int)56)) break;
                    v16 /* !! */  = (long)go.dbif("dbmz", dbir(int ), (int)57);
                }
                super.deactivate();
                if (!var1_3 && !var1_3) ** break;
                continue block44;
                return;
lbl122:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)go.dbif("dbna", dbir(int ), (int)58);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
                case 1: {
                    var2_2 /* !! */  = (int)go.dbif("dbnb", dbir(int ), (int)59);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl132:
                // 3 sources

                case 2: {
                    var2_2 /* !! */  = (int)go.dbif("dbnc", dbir(int ), (int)60);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
                case 3: {
                    var2_2 /* !! */  = (int)go.dbif("dbnd", dbir(int ), (int)61);
                    if (!var3_1) ** GOTO lbl132
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)go.dbif("dbne", dbir(int ), (int)62);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
                case 5: {
                    var2_2 /* !! */  = (int)go.dbif("dbnf", dbir(int ), (int)63);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl151:
                // 2 sources

                case 6: {
                    var2_2 /* !! */  = (int)go.dbif("dbng", dbir(int ), (int)64);
                    if (!var3_1) ** GOTO lbl122
                    throw null;
                }
                case 7: {
                    var2_2 /* !! */  = (int)go.dbif("dbnh", dbir(int ), (int)65);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl159:
                // 4 sources

                case 8: {
                    var2_2 /* !! */  = (int)go.dbif("dbni", dbir(int ), (int)66);
                    if (!var3_1) break block44;
                    throw null;
                }
lbl163:
                // 3 sources

                case 9: {
                    var2_2 /* !! */  = (int)go.dbif("dbnj", dbir(int ), (int)67);
                    if (!var3_1) break block44;
                    throw null;
                }
                case 10: 
            }
        }
        do {
            var2_2 /* !! */  = (int)go.dbif("dbnk", dbir(int ), (int)68);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dbwe() {
        go.dbid[100] = 2127411379979849556L;
        go.dbid[101] = -6827148047266923548L;
        go.dbid[102] = -5634423345022931838L;
        go.dbid[103] = -1591365438452723586L;
        go.dbid[104] = -1178567296879324726L;
        go.dbid[105] = 1705992952347435776L;
        go.dbid[106] = -1258869388348974792L;
        go.dbid[107] = -3507767721229318742L;
        go.dbid[108] = 6690302187678436093L;
        go.dbid[109] = 6083080796590078014L;
        go.dbid[110] = -2772842956244515592L;
        go.dbid[111] = 2884329953717225892L;
        go.dbid[112] = -4856049321836106117L;
        go.dbid[113] = -9011945254222928531L;
        go.dbid[114] = 6712632448672709312L;
        go.dbid[115] = 1842861039660240433L;
        go.dbid[116] = -6575441643019166268L;
        go.dbid[117] = 3024293584171421952L;
        go.dbid[118] = -1869994996858956303L;
        go.dbid[119] = 7566921202945919794L;
        go.dbid[120] = -3462234716799786374L;
        go.dbid[121] = -7638176929192923484L;
        go.dbid[122] = 5794568966823553146L;
        go.dbid[123] = 3848061516704511141L;
        go.dbid[124] = -959152992925400730L;
        go.dbid[125] = 416162245206700988L;
        go.dbid[126] = 6996220603461058046L;
        go.dbid[127] = -5675533975897317695L;
        go.dbid[128] = 7910666097277794607L;
        go.dbid[129] = -474914726189363939L;
        go.dbid[130] = -7204953739381304835L;
        go.dbid[131] = 4773242610625849542L;
        go.dbid[132] = 2717483040737376709L;
        go.dbid[133] = -6985220537180041410L;
        go.dbid[134] = -936258522410347289L;
        go.dbid[135] = -1310772763074984241L;
        go.dbid[136] = 6698301201671150123L;
        go.dbid[137] = -6239072104573019273L;
        go.dbid[138] = 3084158698705582853L;
        go.dbid[139] = -350857545286825855L;
        go.dbid[140] = 2016306084774187589L;
        go.dbid[141] = 8152130500481287774L;
        go.dbid[142] = -4804083549970830001L;
        go.dbid[143] = -866777280528172410L;
        go.dbid[144] = -3206641548993441042L;
        go.dbid[145] = 4876241055534931004L;
        go.dbid[146] = -8609361954964002216L;
        go.dbid[147] = 7480538588740562319L;
        go.dbid[148] = -929709457372498012L;
        go.dbid[149] = 5793994218976721425L;
        go.dbid[150] = -2691194000024120132L;
        go.dbid[151] = -1675100576220684182L;
        go.dbid[152] = -8984260184723230586L;
        go.dbid[153] = 6907635006440040917L;
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onPacket(cr var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[CASE]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void dbwd() {
        go.dbid[0] = 5181590434386966989L;
        go.dbid[1] = -6872558624564210084L;
        go.dbid[2] = 2916411851361684130L;
        go.dbid[3] = -3113882611601846514L;
        go.dbid[4] = 2180409125307606504L;
        go.dbid[5] = 2767934551632020002L;
        go.dbid[6] = 4162920429915894230L;
        go.dbid[7] = 4443093280012073466L;
        go.dbid[8] = -3246620750500454024L;
        go.dbid[9] = 4616467753711784505L;
        go.dbid[10] = -4580280751191583868L;
        go.dbid[11] = 6551241534078128533L;
        go.dbid[12] = 4989754852521517334L;
        go.dbid[13] = 5706945784744138684L;
        go.dbid[14] = 620246893728027112L;
        go.dbid[15] = 3791661167259962732L;
        go.dbid[16] = -3586995073865273523L;
        go.dbid[17] = -2196198267452966636L;
        go.dbid[18] = -2924442157291730525L;
        go.dbid[19] = -6639478785948541759L;
        go.dbid[20] = -9079487382077614994L;
        go.dbid[21] = 2020612367884809454L;
        go.dbid[22] = 931238596135227041L;
        go.dbid[23] = 363134223036870099L;
        go.dbid[24] = 5138341676389595098L;
        go.dbid[25] = -8568971719359086081L;
        go.dbid[26] = 4276372727917670323L;
        go.dbid[27] = -1240705585872695017L;
        go.dbid[28] = 1323701114338908416L;
        go.dbid[29] = -5024832339410745410L;
        go.dbid[30] = -820849254115586193L;
        go.dbid[31] = 2296056559188209693L;
        go.dbid[32] = 4040466754054964909L;
        go.dbid[33] = 216439575311411759L;
        go.dbid[34] = 8140905831025571281L;
        go.dbid[35] = 4100843483468642428L;
        go.dbid[36] = 5210386289141900098L;
        go.dbid[37] = -637195773739272190L;
        go.dbid[38] = 248981546461940570L;
        go.dbid[39] = 8997934516398892294L;
        go.dbid[40] = 8169204839148017215L;
        go.dbid[41] = -5919750073212757639L;
        go.dbid[42] = -8014906655416861705L;
        go.dbid[43] = -2343996159583988450L;
        go.dbid[44] = 3674965650179713481L;
        go.dbid[45] = 3130836479038684070L;
        go.dbid[46] = -8530866131139838673L;
        go.dbid[47] = -2316795494558755618L;
        go.dbid[48] = -1027469068206093871L;
        go.dbid[49] = -7807500025436205231L;
        go.dbid[50] = 1039136726512741272L;
        go.dbid[51] = -6163968975599681482L;
        go.dbid[52] = 4747634848352613889L;
        go.dbid[53] = 3675917725733338634L;
        go.dbid[54] = 8463685708452679786L;
        go.dbid[55] = -2198433757734145587L;
        go.dbid[56] = -1362989945608069677L;
        go.dbid[57] = -655685623088269019L;
        go.dbid[58] = 1889575041386385548L;
        go.dbid[59] = -5167898814279626349L;
        go.dbid[60] = -986031869905333043L;
        go.dbid[61] = -5835429793649208376L;
        go.dbid[62] = 2876117442279550696L;
        go.dbid[63] = 4036478563794649690L;
        go.dbid[64] = 8468221278665237122L;
        go.dbid[65] = 2344281285451687872L;
        go.dbid[66] = -6597503587652508576L;
        go.dbid[67] = -2102838330998978892L;
        go.dbid[68] = -8850800001340470725L;
        go.dbid[69] = -3636744634069208052L;
        go.dbid[70] = 1989846038272622033L;
        go.dbid[71] = -4084028788173925011L;
        go.dbid[72] = 624824245487808050L;
        go.dbid[73] = 1096960367668955685L;
        go.dbid[74] = 411117007158977936L;
        go.dbid[75] = 6065031100153677360L;
        go.dbid[76] = -6978360512896741865L;
        go.dbid[77] = -8730740854236087165L;
        go.dbid[78] = 1693499465580583615L;
        go.dbid[79] = -1218919597598582227L;
        go.dbid[80] = -3492621970635357259L;
        go.dbid[81] = -7283408421382993565L;
        go.dbid[82] = -8801152366762098327L;
        go.dbid[83] = 2611770645002010283L;
        go.dbid[84] = 8052694978257852170L;
        go.dbid[85] = 6693508519092410575L;
        go.dbid[86] = -3872766865220002442L;
        go.dbid[87] = -4748597895346714219L;
        go.dbid[88] = -5604491689963017931L;
        go.dbid[89] = 8957537164475318890L;
        go.dbid[90] = 7591855096574375905L;
        go.dbid[91] = -8281703757052709329L;
        go.dbid[92] = -1932937387832246815L;
        go.dbid[93] = 6949671357556515021L;
        go.dbid[94] = 791658037772830098L;
        go.dbid[95] = -4192201108438725882L;
        go.dbid[96] = 4883533987614602329L;
        go.dbid[97] = 6610894498070890930L;
        go.dbid[98] = 3039494573120522199L;
        go.dbid[99] = 1167384245418761127L;
    }
}

