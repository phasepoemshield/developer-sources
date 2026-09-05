/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import ruhack.phobia.in$SwapSettingsProvider;
import ruhack.phobia.it$SwapPhase;
import ruhack.phobia.nv;
import ruhack.phobia.nx;

public class in {
    private static long[] mhy;
    private int currentDelay;
    private static int[] mhr;
    public static final boolean c;
    protected static final long au = -1060815329601517101L;
    public static final boolean a;
    private int slot;
    private it$SwapPhase phase;
    private long phaseStartTime;
    private final nx movement;
    public static final int b;
    private static final class_310 mc;
    private static long[] mhw;
    private final in$SwapSettingsProvider settingsProvider;
    private static int[] mhp;

    private static /* synthetic */ void oio() {
        in.mhp[0] = 2005795262;
        in.mhp[1] = -528119073;
        in.mhp[2] = 1396604289;
        in.mhp[3] = 1568943081;
        in.mhp[4] = 899097717;
        in.mhp[5] = -989622275;
        in.mhp[6] = 1023971101;
        in.mhp[7] = 1876563678;
        in.mhp[8] = -1042432108;
        in.mhp[9] = -1099480697;
        in.mhp[10] = -167436502;
        in.mhp[11] = 2052363636;
        in.mhp[12] = -135450401;
        in.mhp[13] = -1661878705;
        in.mhp[14] = 291970618;
        in.mhp[15] = -418295478;
        in.mhp[16] = -244577378;
        in.mhp[17] = -521275376;
        in.mhp[18] = -1520695380;
        in.mhp[19] = -1982027087;
        in.mhp[20] = -2146858850;
        in.mhp[21] = -1131099735;
        in.mhp[22] = 468145543;
        in.mhp[23] = -458252325;
        in.mhp[24] = 1748902216;
        in.mhp[25] = 1761955211;
        in.mhp[26] = 1523593526;
        in.mhp[27] = 858861600;
        in.mhp[28] = 1373575078;
        in.mhp[29] = -1558337358;
        in.mhp[30] = -822705830;
        in.mhp[31] = -60593126;
        in.mhp[32] = -1199251454;
        in.mhp[33] = -783633007;
        in.mhp[34] = -90101692;
        in.mhp[35] = -555698904;
        in.mhp[36] = -2063137159;
        in.mhp[37] = 908866429;
        in.mhp[38] = 1749676803;
        in.mhp[39] = 28935665;
        in.mhp[40] = 2069740560;
        in.mhp[41] = -210586162;
        in.mhp[42] = 1566098473;
        in.mhp[43] = 924750338;
        in.mhp[44] = -1840496333;
        in.mhp[45] = -1099872115;
        in.mhp[46] = 1644946070;
        in.mhp[47] = 519833316;
        in.mhp[48] = 2000767329;
        in.mhp[49] = 613140977;
        in.mhp[50] = -1128398987;
        in.mhp[51] = 2041019188;
        in.mhp[52] = -1413845780;
        in.mhp[53] = 1367901258;
        in.mhp[54] = 1814078473;
        in.mhp[55] = -593010355;
        in.mhp[56] = -1634858201;
        in.mhp[57] = -182013749;
        in.mhp[58] = -1655785554;
        in.mhp[59] = -1129843546;
        in.mhp[60] = -1682266897;
        in.mhp[61] = -794627650;
        in.mhp[62] = 909206079;
        in.mhp[63] = -2131116495;
        in.mhp[64] = 283894921;
        in.mhp[65] = 2075425725;
        in.mhp[66] = -1083669774;
        in.mhp[67] = 2073876405;
        in.mhp[68] = -764016841;
        in.mhp[69] = 1856234710;
        in.mhp[70] = 2115825822;
        in.mhp[71] = -1267218877;
        in.mhp[72] = -705861130;
        in.mhp[73] = 1727362256;
        in.mhp[74] = 1346018816;
        in.mhp[75] = 758253093;
        in.mhp[76] = -1126088259;
        in.mhp[77] = -485181010;
        in.mhp[78] = -2069216651;
        in.mhp[79] = -34644655;
        in.mhp[80] = 1569045287;
        in.mhp[81] = -461552865;
        in.mhp[82] = -226759067;
        in.mhp[83] = -1576626518;
        in.mhp[84] = 2073906849;
        in.mhp[85] = -89845580;
        in.mhp[86] = -2054868498;
        in.mhp[87] = -2097338555;
        in.mhp[88] = 1298294105;
        in.mhp[89] = -1782207665;
        in.mhp[90] = -535285777;
        in.mhp[91] = 788046723;
        in.mhp[92] = -2054620237;
        in.mhp[93] = -1984375134;
        in.mhp[94] = -885863547;
        in.mhp[95] = 1879210553;
        in.mhp[96] = 111946640;
        in.mhp[97] = -1207174646;
        in.mhp[98] = -2052950784;
        in.mhp[99] = -1725660625;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public in$SwapSettingsProvider getSettingsProvider() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("ohh", mhv(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == in.mhs("ohi", mho(int ), (int)356)) break;
            v0 /* !! */  = (long)in.mhs("ohj", mho(int ), (int)357);
        }
        var3_1 = in.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = in.au - in.mhs("ohk", mhv(int ), (int)171)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == in.mhs("ohl", mho(int ), (int)358)) break;
            v1 /* !! */  = (long)in.mhs("ohm", mho(int ), (int)359);
        }
        var2_2 /* !! */  = in.b;
        v2 /* !! */  = in.au;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(in.mhs("oho", mhv(int ), (int)173) - in.mhs("ohn", mhv(int ), (int)172));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 47188435: {
                    break block12;
                }
                case 1345925338: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = in.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = in.au - in.mhs("ohp", mhv(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == in.mhs("ohq", mho(int ), (int)360)) break;
                    v3 /* !! */  = (long)in.mhs("ohr", mho(int ), (int)361);
                }
                return this.settingsProvider;
            }
lbl40:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)in.mhs("ohs", mho(int ), (int)362);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)in.mhs("oht", mho(int ), (int)363);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)in.mhs("ohu", mho(int ), (int)364);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)in.mhs("ohv", mho(int ), (int)365);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ojh() {
        in.mhp[300] = -327382827;
        in.mhp[301] = 1776452144;
        in.mhp[302] = 570274797;
        in.mhp[303] = -1065490190;
        in.mhp[304] = 531469554;
        in.mhp[305] = 99629883;
        in.mhp[306] = -208413227;
        in.mhp[307] = -499243509;
        in.mhp[308] = -1653348503;
        in.mhp[309] = 225869892;
        in.mhp[310] = -754962284;
        in.mhp[311] = -411889138;
        in.mhp[312] = -1607174500;
        in.mhp[313] = 647128154;
        in.mhp[314] = 892551081;
        in.mhp[315] = 868657459;
        in.mhp[316] = 197665138;
        in.mhp[317] = 1626941714;
        in.mhp[318] = -1738323689;
        in.mhp[319] = 402959017;
        in.mhp[320] = -743687723;
        in.mhp[321] = 664291373;
        in.mhp[322] = -519406704;
        in.mhp[323] = -757222839;
        in.mhp[324] = -585949979;
        in.mhp[325] = 887211754;
        in.mhp[326] = 95286574;
        in.mhp[327] = -1560925591;
        in.mhp[328] = -1033515458;
        in.mhp[329] = 8631208;
        in.mhp[330] = 734866144;
        in.mhp[331] = -1837949698;
        in.mhp[332] = -341630980;
        in.mhp[333] = -2118735452;
        in.mhp[334] = -595128330;
        in.mhp[335] = 1227485638;
        in.mhp[336] = 776603543;
        in.mhp[337] = -456500373;
        in.mhp[338] = -82760042;
        in.mhp[339] = 1900089930;
        in.mhp[340] = 928897836;
        in.mhp[341] = -258058607;
        in.mhp[342] = 1127493629;
        in.mhp[343] = 1675167123;
        in.mhp[344] = 876022338;
        in.mhp[345] = -1937405202;
        in.mhp[346] = -376090278;
        in.mhp[347] = -428651095;
        in.mhp[348] = 1135000947;
        in.mhp[349] = 1462897234;
        in.mhp[350] = -597113575;
        in.mhp[351] = 1832781830;
        in.mhp[352] = -2051048906;
        in.mhp[353] = 505224859;
        in.mhp[354] = -1810165865;
        in.mhp[355] = 1692993225;
        in.mhp[356] = 1586353719;
        in.mhp[357] = 443260835;
        in.mhp[358] = -320333125;
        in.mhp[359] = -417292192;
        in.mhp[360] = -1080874263;
        in.mhp[361] = -1882426656;
        in.mhp[362] = 1277329821;
        in.mhp[363] = -219018099;
        in.mhp[364] = -1020826029;
        in.mhp[365] = 1356030313;
        in.mhp[366] = -1164540300;
        in.mhp[367] = -2030615636;
        in.mhp[368] = -2015247052;
        in.mhp[369] = 2059865263;
        in.mhp[370] = -1470525843;
        in.mhp[371] = -1200185859;
        in.mhp[372] = 715761217;
        in.mhp[373] = -16694917;
        in.mhp[374] = 760152326;
        in.mhp[375] = -1735336841;
        in.mhp[376] = -47310929;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public it$SwapPhase getPhase() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("odw", mhv(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == in.mhs("ody", mho(int ), (int)328)) break;
            v0 /* !! */  = (long)in.mhs("oea", mho(int ), (int)329);
        }
        var3_1 = in.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = in.au - in.mhs("oec", mhv(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == in.mhs("oef", mho(int ), (int)330)) break;
            v1 /* !! */  = (long)in.mhs("oeh", mho(int ), (int)331);
        }
        var2_2 = in.b;
        v2 /* !! */  = in.au;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - in.mhs("oej", mhv(int ), (int)131));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1290498565: {
                    v3 = in.mhs("oel", mhv(int ), (int)132);
                    continue block13;
                }
                case 47188435: {
                    break block13;
                }
                case 329550598: {
                    v3 = in.mhs("oem", mhv(int ), (int)133);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = in.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = in.au;
        if (true) ** GOTO lbl38
        block15: while (true) {
            v4 /* !! */  = (long)(v5 - in.mhs("oeo", mhv(int ), (int)134));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1508893481: {
                    v5 = in.mhs("oep", mhv(int ), (int)135);
                    continue block15;
                }
                case -1383779995: {
                    v5 = in.mhs("oeq", mhv(int ), (int)136);
                    continue block15;
                }
                case -1243525591: {
                    v5 = in.mhs("oer", mhv(int ), (int)137);
                    continue block15;
                }
                case 47188435: {
                    break block15;
                }
            }
            break;
        }
        return this.phase;
    }

    private static /* synthetic */ int mho(int n2) {
        return mhp[n2] ^ mhr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void swapSilent(int var1_1) {
        v0 /* !! */  = in.au;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - in.mhs("mpl", mhv(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1350219470: {
                    v1 = in.mhs("mpo", mhv(int ), (int)23);
                    continue block23;
                }
                case 47188435: {
                    break block23;
                }
                case 315942389: {
                    v1 = in.mhs("mpr", mhv(int ), (int)24);
                    continue block23;
                }
            }
            break;
        }
        var5_2 = in.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = in.au - in.mhs("mpu", mhv(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == in.mhs("mpx", mho(int ), (int)47)) break;
            v2 /* !! */  = (long)in.mhs("mqa", mho(int ), (int)48);
        }
        var4_3 /* !! */  = in.b;
        v3 /* !! */  = in.au;
        if (true) ** GOTO lbl25
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - in.mhs("mqd", mhv(int ), (int)26));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1260770849: {
                    v4 = in.mhs("mqf", mhv(int ), (int)27);
                    continue block25;
                }
                case 47188435: {
                    break block25;
                }
                case 223141773: {
                    v4 = in.mhs("mqh", mhv(int ), (int)28);
                    continue block25;
                }
                case 2043379488: {
                    v4 = in.mhs("mqk", mhv(int ), (int)29);
                    continue block25;
                }
            }
            break;
        }
        var3_4 = in.a;
        if (var5_2) {
            throw null;
lbl40:
            // 5 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = in.au - in.mhs("mqq", mhv(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == in.mhs("mqs", mho(int ), (int)49)) break;
            v5 /* !! */  = (long)in.mhs("mqv", mho(int ), (int)50);
        }
        var2_5 = nv.wrapSlot(var1_1);
        if (var3_4 || var3_4) ** GOTO lbl40
        v6 = in.mhs("mqy", mho(int ), (int)51);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = in.au - in.mhs("mra", mhv(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == in.mhs("mrc", mho(int ), (int)52)) break;
            v7 /* !! */  = (long)in.mhs("mre", mho(int ), (int)53);
        }
        nv.swap(var2_5, (int)v6);
        if (var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = in.au - in.mhs("mrk", mhv(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == in.mhs("mrm", mho(int ), (int)54)) break;
                    v8 /* !! */  = (long)in.mhs("mrp", mho(int ), (int)55);
                }
                nv.closeScreen();
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)in.mhs("mrs", mho(int ), (int)56);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl76:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)in.mhs("mrv", mho(int ), (int)57);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 2: {
                var4_3 /* !! */  = (int)in.mhs("mry", mho(int ), (int)58);
                if (var5_2) {
                    throw null;
                }
            }
lbl85:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)in.mhs("msb", mho(int ), (int)59);
                if (!var5_2) ** GOTO lbl76
                throw null;
            }
lbl89:
            // 4 sources

            case 4: {
                do {
                    var4_3 /* !! */  = (int)in.mhs("mse", mho(int ), (int)60);
                } while (!var5_2);
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)in.mhs("msh", mho(int ), (int)61);
                    if (!var5_2) ** GOTO lbl89
                    throw null;
                }
            }
lbl99:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)in.mhs("msk", mho(int ), (int)62);
                if (!var5_2) ** GOTO lbl85
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)in.mhs("msn", mho(int ), (int)63);
                if (!var5_2) ** GOTO lbl89
                throw null;
            }
            case 8: {
                var4_3 /* !! */  = (int)in.mhs("msr", mho(int ), (int)64);
                if (!var5_2) break;
                throw null;
            }
            case 9: 
        }
        var4_3 /* !! */  = (int)in.mhs("msu", mho(int ), (int)65);
        ** while (!var5_2)
lbl114:
        // 1 sources

        throw null;
    }

    static {
        mhp = new int[377];
        mhr = new int[377];
        in.oio();
        in.oiw();
        in.oja();
        in.ojh();
        in.ojp();
        in.ojy();
        in.okh();
        in.okp();
        mhw = new long[182];
        mhy = new long[182];
        in.okz();
        in.olk();
        in.ols();
        in.omb();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setPhase(it$SwapPhase var1_1) {
        v0 /* !! */  = in.au;
        if (true) ** GOTO lbl5
        block13: while (true) {
            v0 /* !! */  = (long)(v1 - in.mhs("ohw", mhv(int ), (int)175));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1932718612: {
                    v1 = in.mhs("ohx", mhv(int ), (int)176);
                    continue block13;
                }
                case 47188435: {
                    break block13;
                }
                case 1410926137: {
                    v1 = in.mhs("ohy", mhv(int ), (int)177);
                    continue block13;
                }
                case 1505791106: {
                    v1 = in.mhs("ohz", mhv(int ), (int)178);
                    continue block13;
                }
            }
            break;
        }
        var4_2 = in.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = in.au - in.mhs("oia", mhv(int ), (int)179)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == in.mhs("oib", mho(int ), (int)366)) break;
            v2 /* !! */  = (long)in.mhs("oic", mho(int ), (int)367);
        }
        var3_3 /* !! */  = in.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = in.au - in.mhs("oid", mhv(int ), (int)180)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == in.mhs("oie", mho(int ), (int)368)) {
                var2_4 = in.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)in.mhs("oif", mho(int ), (int)369);
        }
        if (var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) return;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = in.au - in.mhs("oig", mhv(int ), (int)181)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == in.mhs("oih", mho(int ), (int)370)) {
                        this.phase = var1_1;
                        if (!var2_4) return;
                    }
                    ** GOTO lbl45
                    return;
lbl45:
                    // 1 sources

                    v4 /* !! */  = (long)in.mhs("oii", mho(int ), (int)371);
                }
            }
            case 0: {
                ** GOTO lbl61
            }
            case 2: {
                var3_3 /* !! */  = (int)in.mhs("oil", mho(int ), (int)374);
                if (!var4_2) ** break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)in.mhs("oim", mho(int ), (int)375);
                if (!var4_2) ** break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)in.mhs("oin", mho(int ), (int)376);
                if (var4_2) {
                    throw null;
                }
lbl61:
                // 3 sources

                var3_3 /* !! */  = (int)in.mhs("oij", mho(int ), (int)372);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var3_3 /* !! */  = (int)in.mhs("oik", mho(int ), (int)373);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void oja() {
        in.mhp[200] = 397188046;
        in.mhp[201] = -1373628938;
        in.mhp[202] = -1279345061;
        in.mhp[203] = 548326632;
        in.mhp[204] = 897074081;
        in.mhp[205] = -869838530;
        in.mhp[206] = 1650521024;
        in.mhp[207] = -913491984;
        in.mhp[208] = -637909538;
        in.mhp[209] = -1606778926;
        in.mhp[210] = -808282573;
        in.mhp[211] = -850682483;
        in.mhp[212] = -1665941524;
        in.mhp[213] = -1681679827;
        in.mhp[214] = -1537285842;
        in.mhp[215] = 437569870;
        in.mhp[216] = -1674227526;
        in.mhp[217] = 2008174379;
        in.mhp[218] = 92174780;
        in.mhp[219] = 1694266043;
        in.mhp[220] = -1184728723;
        in.mhp[221] = 1083153001;
        in.mhp[222] = 2078769848;
        in.mhp[223] = 1768541283;
        in.mhp[224] = 1180460558;
        in.mhp[225] = 370913018;
        in.mhp[226] = -1424261750;
        in.mhp[227] = 731087968;
        in.mhp[228] = 603978271;
        in.mhp[229] = -1816244766;
        in.mhp[230] = 2082176606;
        in.mhp[231] = 694514228;
        in.mhp[232] = -1321383993;
        in.mhp[233] = 1526650622;
        in.mhp[234] = -1334874758;
        in.mhp[235] = -973642891;
        in.mhp[236] = 1531761850;
        in.mhp[237] = 112897397;
        in.mhp[238] = 1916102939;
        in.mhp[239] = -1841317846;
        in.mhp[240] = 1596543545;
        in.mhp[241] = 1780859067;
        in.mhp[242] = -1648721808;
        in.mhp[243] = -1994141892;
        in.mhp[244] = -1711625648;
        in.mhp[245] = 51007022;
        in.mhp[246] = -244430860;
        in.mhp[247] = 1085498655;
        in.mhp[248] = 2039056941;
        in.mhp[249] = -528863068;
        in.mhp[250] = -1911087285;
        in.mhp[251] = 1165714888;
        in.mhp[252] = -174012985;
        in.mhp[253] = 1869959337;
        in.mhp[254] = -1018882922;
        in.mhp[255] = -760225658;
        in.mhp[256] = 1504985460;
        in.mhp[257] = -80868710;
        in.mhp[258] = -681723904;
        in.mhp[259] = 1504974788;
        in.mhp[260] = -780451491;
        in.mhp[261] = -1613914696;
        in.mhp[262] = -1619304096;
        in.mhp[263] = 2021839525;
        in.mhp[264] = -1918483947;
        in.mhp[265] = -937982060;
        in.mhp[266] = -1046522176;
        in.mhp[267] = 1098208178;
        in.mhp[268] = 310319413;
        in.mhp[269] = -534316083;
        in.mhp[270] = -565752671;
        in.mhp[271] = 348186457;
        in.mhp[272] = -142006450;
        in.mhp[273] = 1470351782;
        in.mhp[274] = -467697046;
        in.mhp[275] = -1490236079;
        in.mhp[276] = -1831433997;
        in.mhp[277] = 132535480;
        in.mhp[278] = 647033098;
        in.mhp[279] = -145594368;
        in.mhp[280] = -976082231;
        in.mhp[281] = -1052520210;
        in.mhp[282] = -871778554;
        in.mhp[283] = -1969687382;
        in.mhp[284] = -1168430918;
        in.mhp[285] = -720646122;
        in.mhp[286] = -1747726088;
        in.mhp[287] = -614739887;
        in.mhp[288] = -1219695386;
        in.mhp[289] = -1350641804;
        in.mhp[290] = -1148965255;
        in.mhp[291] = -773861835;
        in.mhp[292] = -1592524499;
        in.mhp[293] = 1674755587;
        in.mhp[294] = 1167345563;
        in.mhp[295] = 931129644;
        in.mhp[296] = 43986256;
        in.mhp[297] = 1742454778;
        in.mhp[298] = 392653834;
        in.mhp[299] = -7931545;
    }

    private static /* synthetic */ void okh() {
        in.mhr[200] = 397188077;
        in.mhr[201] = -1373629014;
        in.mhr[202] = -1279345048;
        in.mhr[203] = 548326627;
        in.mhr[204] = 897074107;
        in.mhr[205] = -869838486;
        in.mhr[206] = 1650520990;
        in.mhr[207] = -913492074;
        in.mhr[208] = -637909606;
        in.mhr[209] = -1606778928;
        in.mhr[210] = -808282615;
        in.mhr[211] = -850682398;
        in.mhr[212] = -1665941515;
        in.mhr[213] = -1681679855;
        in.mhr[214] = -1537285828;
        in.mhr[215] = 437569877;
        in.mhr[216] = -1674227546;
        in.mhr[217] = 2008174369;
        in.mhr[218] = 92174811;
        in.mhr[219] = 1694266011;
        in.mhr[220] = -1184728752;
        in.mhr[221] = 1083152961;
        in.mhr[222] = 2078769828;
        in.mhr[223] = 1768541237;
        in.mhr[224] = 1180460555;
        in.mhr[225] = 370912987;
        in.mhr[226] = -1424261709;
        in.mhr[227] = 731087977;
        in.mhr[228] = 603978310;
        in.mhr[229] = -1816244847;
        in.mhr[230] = 2082176513;
        in.mhr[231] = 694514297;
        in.mhr[232] = -1321383959;
        in.mhr[233] = 1526650515;
        in.mhr[234] = -1334874835;
        in.mhr[235] = -973642985;
        in.mhr[236] = 1531761850;
        in.mhr[237] = 112897328;
        in.mhr[238] = 1916103038;
        in.mhr[239] = -1841317865;
        in.mhr[240] = 1596543489;
        in.mhr[241] = 1780859055;
        in.mhr[242] = -1648721880;
        in.mhr[243] = -1994141850;
        in.mhr[244] = -1711625619;
        in.mhr[245] = 51007071;
        in.mhr[246] = -244430898;
        in.mhr[247] = 1085498682;
        in.mhr[248] = 2039056952;
        in.mhr[249] = -528862995;
        in.mhr[250] = -1911087288;
        in.mhr[251] = 1165714827;
        in.mhr[252] = -174013046;
        in.mhr[253] = 1869959413;
        in.mhr[254] = -1018882907;
        in.mhr[255] = -760225599;
        in.mhr[256] = 1504985370;
        in.mhr[257] = -80868646;
        in.mhr[258] = -681723789;
        in.mhr[259] = 1504974766;
        in.mhr[260] = -780451557;
        in.mhr[261] = -1613914662;
        in.mhr[262] = -1619304131;
        in.mhr[263] = 2021839549;
        in.mhr[264] = -1918483883;
        in.mhr[265] = 937982059;
        in.mhr[266] = -1112096367;
        in.mhr[267] = -1098208179;
        in.mhr[268] = 44968123;
        in.mhr[269] = 534316082;
        in.mhr[270] = -803190018;
        in.mhr[271] = 348186460;
        in.mhr[272] = -142006452;
        in.mhr[273] = 1470351781;
        in.mhr[274] = -467697045;
        in.mhr[275] = -1490236073;
        in.mhr[276] = -1831433995;
        in.mhr[277] = 132535473;
        in.mhr[278] = 647033099;
        in.mhr[279] = -145594364;
        in.mhr[280] = -976082239;
        in.mhr[281] = -1052520209;
        in.mhr[282] = -950124325;
        in.mhr[283] = 1969687381;
        in.mhr[284] = 483232833;
        in.mhr[285] = 720646121;
        in.mhr[286] = 806800340;
        in.mhr[287] = 614739886;
        in.mhr[288] = -1219695385;
        in.mhr[289] = 565108158;
        in.mhr[290] = -1148965255;
        in.mhr[291] = -773861838;
        in.mhr[292] = -1592524505;
        in.mhr[293] = 1674755585;
        in.mhr[294] = 1167345564;
        in.mhr[295] = 931129645;
        in.mhr[296] = 43986263;
        in.mhr[297] = 1742454777;
        in.mhr[298] = 392653834;
        in.mhr[299] = -7931545;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("oey", mhv(int ), (int)138)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == in.mhs("oez", mho(int ), (int)336)) break;
            v0 /* !! */  = (long)in.mhs("ofa", mho(int ), (int)337);
        }
        var3_1 = in.c;
        v1 /* !! */  = in.au;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - in.mhs("ofb", mhv(int ), (int)139));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 47188435: {
                    break block17;
                }
                case 1136750926: {
                    v2 = in.mhs("ofc", mhv(int ), (int)140);
                    continue block17;
                }
                case 1554496030: {
                    v2 = in.mhs("ofd", mhv(int ), (int)141);
                    continue block17;
                }
                case 2103151703: {
                    v2 = in.mhs("off", mhv(int ), (int)142);
                    continue block17;
                }
            }
            break;
        }
        var2_2 = in.b;
        v3 /* !! */  = in.au;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - in.mhs("ofh", mhv(int ), (int)143));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1660812475: {
                    v4 = in.mhs("ofi", mhv(int ), (int)144);
                    continue block18;
                }
                case 47188435: {
                    break block18;
                }
                case 65015309: {
                    v4 = in.mhs("ofj", mhv(int ), (int)145);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = in.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (int)in.mhs("ofk", mho(int ), (int)338);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = in.au;
        if (true) ** GOTO lbl48
        block20: while (true) {
            v5 /* !! */  = (long)(v6 - in.mhs("ofm", mhv(int ), (int)146));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2021967308: {
                    v6 = in.mhs("ofn", mhv(int ), (int)147);
                    continue block20;
                }
                case 47188435: {
                    break block20;
                }
                case 1935869232: {
                    v6 = in.mhs("ofo", mhv(int ), (int)148);
                    continue block20;
                }
            }
            break;
        }
        return this.slot;
    }

    private static /* synthetic */ void olk() {
        in.mhw[100] = -3208116003209817854L;
        in.mhw[101] = -2599312522134745263L;
        in.mhw[102] = -3850582062036435319L;
        in.mhw[103] = 7119835183467482032L;
        in.mhw[104] = 7663260428792778050L;
        in.mhw[105] = -8823956486405891285L;
        in.mhw[106] = -4104053688869420715L;
        in.mhw[107] = 5913395273926213401L;
        in.mhw[108] = -8107546314789810102L;
        in.mhw[109] = -8475975134095722117L;
        in.mhw[110] = 978218066925836049L;
        in.mhw[111] = 7627690583716624544L;
        in.mhw[112] = -3267158207403117301L;
        in.mhw[113] = 1836740954605960764L;
        in.mhw[114] = -5508331197074819318L;
        in.mhw[115] = 2144935324375639017L;
        in.mhw[116] = -3837213170509648689L;
        in.mhw[117] = 1583188502412411387L;
        in.mhw[118] = -2019772976811987612L;
        in.mhw[119] = 2010791161954368607L;
        in.mhw[120] = 2255246000000979422L;
        in.mhw[121] = -1666438576744774039L;
        in.mhw[122] = -6815032051249732541L;
        in.mhw[123] = -5082235405893327619L;
        in.mhw[124] = 6751802326406803879L;
        in.mhw[125] = -8307018970074596558L;
        in.mhw[126] = -7688490572333312740L;
        in.mhw[127] = 6891479996341713160L;
        in.mhw[128] = 2027471357333666777L;
        in.mhw[129] = 1817658142499266364L;
        in.mhw[130] = -8627786765941873278L;
        in.mhw[131] = 944306619847374962L;
        in.mhw[132] = 1629231549689274686L;
        in.mhw[133] = -591773494690146678L;
        in.mhw[134] = -9005623994674540606L;
        in.mhw[135] = 6872313616666011833L;
        in.mhw[136] = 6073577622667698733L;
        in.mhw[137] = 2622705129804637212L;
        in.mhw[138] = -8378285679787738909L;
        in.mhw[139] = -6927037394565907992L;
        in.mhw[140] = -6787044663654045736L;
        in.mhw[141] = -2700173597342570211L;
        in.mhw[142] = -8667085996171196694L;
        in.mhw[143] = 442879290182689288L;
        in.mhw[144] = 2439814515893651886L;
        in.mhw[145] = 6742635644201654597L;
        in.mhw[146] = 6121118174307877575L;
        in.mhw[147] = 4492253923779980902L;
        in.mhw[148] = 1110644381002905405L;
        in.mhw[149] = -2317831902393654170L;
        in.mhw[150] = -1417190654195197774L;
        in.mhw[151] = 7114599984648637583L;
        in.mhw[152] = -6322718838337243859L;
        in.mhw[153] = 8248779378415917493L;
        in.mhw[154] = -8696702085159398299L;
        in.mhw[155] = -117011892356778311L;
        in.mhw[156] = 6248814679635178913L;
        in.mhw[157] = -3596268026564883562L;
        in.mhw[158] = -7393307462890202278L;
        in.mhw[159] = 2147603893402117366L;
        in.mhw[160] = 879641339659915492L;
        in.mhw[161] = -8573331703949505295L;
        in.mhw[162] = -3154132230079879410L;
        in.mhw[163] = -1247935322487935231L;
        in.mhw[164] = 3929356701221981595L;
        in.mhw[165] = -1810370014818504375L;
        in.mhw[166] = -5290493198268862174L;
        in.mhw[167] = -6086046928317014303L;
        in.mhw[168] = -8909952760215711551L;
        in.mhw[169] = -7110839339917354256L;
        in.mhw[170] = 1704430818338877328L;
        in.mhw[171] = 6704508442061579587L;
        in.mhw[172] = -266790100854281326L;
        in.mhw[173] = -7762370122472018984L;
        in.mhw[174] = -3248565715159805805L;
        in.mhw[175] = -8111650335932250877L;
        in.mhw[176] = 931432853510376385L;
        in.mhw[177] = 6347783369961354881L;
        in.mhw[178] = 1011870010502734229L;
        in.mhw[179] = -4499767778688281731L;
        in.mhw[180] = -4138001989699762568L;
        in.mhw[181] = -399859129281048317L;
    }

    private static /* synthetic */ void okp() {
        in.mhr[300] = -327382817;
        in.mhr[301] = 1776452146;
        in.mhr[302] = 570274785;
        in.mhr[303] = -1065490191;
        in.mhr[304] = 531469566;
        in.mhr[305] = -99629884;
        in.mhr[306] = 1120367341;
        in.mhr[307] = -499243510;
        in.mhr[308] = 2141956220;
        in.mhr[309] = 225869893;
        in.mhr[310] = -993885175;
        in.mhr[311] = -411889137;
        in.mhr[312] = -1607174499;
        in.mhr[313] = 647128146;
        in.mhr[314] = 892551082;
        in.mhr[315] = 868657463;
        in.mhr[316] = 197665138;
        in.mhr[317] = 1626941715;
        in.mhr[318] = -1738323696;
        in.mhr[319] = 402959016;
        in.mhr[320] = -743687724;
        in.mhr[321] = 1066964521;
        in.mhr[322] = -519406703;
        in.mhr[323] = -1250223620;
        in.mhr[324] = -585949979;
        in.mhr[325] = 887211752;
        in.mhr[326] = 95286574;
        in.mhr[327] = -1560925589;
        in.mhr[328] = 1033515457;
        in.mhr[329] = -1541204933;
        in.mhr[330] = -734866145;
        in.mhr[331] = -2111595854;
        in.mhr[332] = -341630978;
        in.mhr[333] = -2118735450;
        in.mhr[334] = -595128332;
        in.mhr[335] = 1227485636;
        in.mhr[336] = 776603542;
        in.mhr[337] = -670398420;
        in.mhr[338] = 2013502868;
        in.mhr[339] = 1900089930;
        in.mhr[340] = 928897838;
        in.mhr[341] = -258058608;
        in.mhr[342] = 1127493628;
        in.mhr[343] = -1675167124;
        in.mhr[344] = 1768399486;
        in.mhr[345] = -1937405202;
        in.mhr[346] = -376090277;
        in.mhr[347] = -428651095;
        in.mhr[348] = 1135000946;
        in.mhr[349] = -692325008;
        in.mhr[350] = 597113574;
        in.mhr[351] = 1163682839;
        in.mhr[352] = -2051048906;
        in.mhr[353] = 505224856;
        in.mhr[354] = -1810165865;
        in.mhr[355] = 1692993226;
        in.mhr[356] = -1586353720;
        in.mhr[357] = -954118299;
        in.mhr[358] = 320333124;
        in.mhr[359] = 1473582530;
        in.mhr[360] = -1080874264;
        in.mhr[361] = -1001954143;
        in.mhr[362] = 1277329822;
        in.mhr[363] = -219018098;
        in.mhr[364] = -1020826030;
        in.mhr[365] = 1356030313;
        in.mhr[366] = 1164540299;
        in.mhr[367] = -1024394243;
        in.mhr[368] = 2015247051;
        in.mhr[369] = -1339353864;
        in.mhr[370] = -1470525844;
        in.mhr[371] = 979278158;
        in.mhr[372] = 715761219;
        in.mhr[373] = -16694920;
        in.mhr[374] = 760152325;
        in.mhr[375] = -1735336841;
        in.mhr[376] = -47310930;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startSwap(int var1_1, boolean var2_2) {
        block45: {
            block44: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("mlz", mhv(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == in.mhs("mmb", mho(int ), (int)28)) break;
                    v0 /* !! */  = (long)in.mhs("mmd", mho(int ), (int)29);
                }
                var5_3 = in.c;
                v1 /* !! */  = in.au;
                if (true) ** GOTO lbl11
                block28: while (true) {
                    v1 /* !! */  = (long)(v2 - in.mhs("mmh", mhv(int ), (int)12));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1160080368: {
                            v2 = in.mhs("mmj", mhv(int ), (int)13);
                            continue block28;
                        }
                        case -1077439115: {
                            v2 = in.mhs("mml", mhv(int ), (int)14);
                            continue block28;
                        }
                        case -842107216: {
                            v2 = in.mhs("mmo", mhv(int ), (int)15);
                            continue block28;
                        }
                        case 47188435: {
                            break block28;
                        }
                    }
                    break;
                }
                var4_4 /* !! */  = in.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = in.au - in.mhs("mms", mhv(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == in.mhs("mmu", mho(int ), (int)30)) break;
                    v3 /* !! */  = (long)in.mhs("mmw", mho(int ), (int)31);
                }
                var3_5 = in.a;
                if (var5_3) {
                    throw null;
lbl32:
                    // 6 sources

                    return;
                }
                if (var3_5 || var3_5) ** GOTO lbl32
                if (!var2_2) break block44;
                if (var3_5 || var3_5) ** GOTO lbl32
                v4 /* !! */  = in.au;
                if (true) ** GOTO lbl41
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - in.mhs("mnb", mhv(int ), (int)17));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -847482967: {
                            v5 = in.mhs("mnd", mhv(int ), (int)18);
                            continue block31;
                        }
                        case -843713351: {
                            v5 = in.mhs("mng", mhv(int ), (int)19);
                            continue block31;
                        }
                        case 47188435: {
                            break block31;
                        }
                        case 1774433893: {
                            v5 = in.mhs("mnj", mhv(int ), (int)20);
                            continue block31;
                        }
                    }
                    break;
                }
                this.swapSilent(var1_1);
                if (var3_5) ** GOTO lbl32
                if (var5_3) {
                    throw null;
                }
                break block45;
            }
            if (var3_5 || var3_5) ** GOTO lbl32
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = in.au - in.mhs("mno", mhv(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == in.mhs("mns", mho(int ), (int)32)) break;
                v6 /* !! */  = (long)in.mhs("mnu", mho(int ), (int)33);
            }
            this.startLegit(var1_1);
            if (var3_5) ** GOTO lbl32
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)in.mhs("mny", mho(int ), (int)34);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)in.mhs("moa", mho(int ), (int)35);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl83:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)in.mhs("moc", mho(int ), (int)36);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 3: {
                var4_4 /* !! */  = (int)in.mhs("mog", mho(int ), (int)37);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl93:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)in.mhs("moj", mho(int ), (int)38);
                if (!var5_3) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)in.mhs("mom", mho(int ), (int)39);
                if (!var5_3) ** GOTO lbl83
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)in.mhs("mop", mho(int ), (int)40);
                if (!var5_3) ** GOTO lbl83
                throw null;
            }
lbl105:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)in.mhs("mos", mho(int ), (int)41);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl110:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)in.mhs("mov", mho(int ), (int)42);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 9: {
                var4_4 /* !! */  = (int)in.mhs("moy", mho(int ), (int)43);
                if (!var5_3) ** GOTO lbl93
                throw null;
            }
lbl119:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)in.mhs("mpa", mho(int ), (int)44);
                    if (!var5_3) break block12;
                    throw null;
                }
            }
            case 11: {
                var4_4 /* !! */  = (int)in.mhs("mpd", mho(int ), (int)45);
                if (!var5_3) ** GOTO lbl97
                throw null;
            }
            case 12: 
        }
        var4_4 /* !! */  = (int)in.mhs("mph", mho(int ), (int)46);
        ** while (!var5_3)
lbl131:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isActive() {
        CallSite callSite;
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = au - in.mhs("miv", mhv(int ), (int)1)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == in.mhs("miy", mho(int ), (int)11)) break;
            object = in.mhs("mjb", mho(int ), (int)12);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = au - in.mhs("mjd", mhv(int ), (int)2)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == in.mhs("mjf", mho(int ), (int)13)) break;
            object = in.mhs("mji", mho(int ), (int)14);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = au - in.mhs("mjl", mhv(int ), (int)3)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == in.mhs("mjo", mho(int ), (int)15)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = in.mhs("mjq", mho(int ), (int)16);
        }
        if (bl2 || bl2) return (boolean)in.mhs("mjt", mho(int ), (int)17);
        Object object = au;
        boolean bl4 = true;
        block14: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite2 - in.mhs("mjw", mhv(int ), (int)4);
            }
            switch ((int)object) {
                case 47188435: {
                    break block14;
                }
                case 684504128: {
                    callSite2 = in.mhs("mjz", mhv(int ), (int)5);
                    continue block14;
                }
                case 1048801028: {
                    callSite2 = in.mhs("mkc", mhv(int ), (int)6);
                    continue block14;
                }
                case 1625389414: {
                    callSite2 = in.mhs("mkf", mhv(int ), (int)7);
                    continue block14;
                }
            }
            break;
        }
        Object object2 = au;
        boolean bl5 = true;
        block15: while (true) {
            CallSite callSite3;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite3 - in.mhs("mkh", mhv(int ), (int)8);
            }
            switch ((int)object2) {
                case -938662637: {
                    callSite3 = in.mhs("mkk", mhv(int ), (int)9);
                    continue block15;
                }
                case -629703276: {
                    callSite3 = in.mhs("mkn", mhv(int ), (int)10);
                    continue block15;
                }
                case 47188435: {
                    break block15;
                }
            }
            break;
        }
        if (this.phase != it$SwapPhase.IDLE) {
            if (bl2) return (boolean)in.mhs("mjt", mho(int ), (int)17);
            callSite = in.mhs("mkq", mho(int ), (int)18);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)in.mhs("mjt", mho(int ), (int)17);
        }
        callSite = in.mhs("mkv", mho(int ), (int)19);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getCurrentDelay() {
        v0 /* !! */  = in.au;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - in.mhs("ogp", mhv(int ), (int)160));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 47188435: {
                    break block21;
                }
                case 856473971: {
                    v1 = in.mhs("ogq", mhv(int ), (int)161);
                    continue block21;
                }
                case 1111073681: {
                    v1 = in.mhs("ogs", mhv(int ), (int)162);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = in.c;
        v2 /* !! */  = in.au;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(in.mhs("ogu", mhv(int ), (int)164) - in.mhs("ogt", mhv(int ), (int)163));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -52532587: {
                    continue block22;
                }
                case 47188435: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = in.b;
        v3 /* !! */  = in.au;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - in.mhs("ogv", mhv(int ), (int)165));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -634337856: {
                    v4 = in.mhs("ogw", mhv(int ), (int)166);
                    continue block23;
                }
                case 47188435: {
                    break block23;
                }
                case 322387442: {
                    v4 = in.mhs("ogx", mhv(int ), (int)167);
                    continue block23;
                }
                case 843745580: {
                    v4 = in.mhs("ogy", mhv(int ), (int)168);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = in.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (int)in.mhs("ogz", mho(int ), (int)349);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = in.au - in.mhs("oha", mhv(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == in.mhs("ohb", mho(int ), (int)350)) break;
                    v5 /* !! */  = (long)in.mhs("ohc", mho(int ), (int)351);
                }
                return this.currentDelay;
            }
            case 0: {
                var2_2 /* !! */  = (int)in.mhs("ohd", mho(int ), (int)352);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)in.mhs("ohe", mho(int ), (int)353);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)in.mhs("ohf", mho(int ), (int)354);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)in.mhs("ohg", mho(int ), (int)355);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite mhs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getPhaseStartTime() {
        v0 /* !! */  = in.au;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - in.mhs("ofu", mhv(int ), (int)149));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1084435415: {
                    v1 = in.mhs("ofv", mhv(int ), (int)150);
                    continue block21;
                }
                case -902780431: {
                    v1 = in.mhs("ofw", mhv(int ), (int)151);
                    continue block21;
                }
                case 47188435: {
                    break block21;
                }
                case 542244448: {
                    v1 = in.mhs("ofy", mhv(int ), (int)152);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = in.c;
        v2 /* !! */  = in.au;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(in.mhs("ogb", mhv(int ), (int)154) - in.mhs("ofz", mhv(int ), (int)153));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 47188435: {
                    break block22;
                }
                case 666353685: {
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = in.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = in.au - in.mhs("ogc", mhv(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == in.mhs("ogd", mho(int ), (int)343)) break;
            v3 /* !! */  = (long)in.mhs("oge", mho(int ), (int)344);
        }
        var1_3 = in.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (long)in.mhs("ogf", mhv(int ), (int)156);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = in.au;
                if (true) ** GOTO lbl47
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - in.mhs("ogh", mhv(int ), (int)157));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1443732060: {
                            v5 = in.mhs("ogi", mhv(int ), (int)158);
                            continue block25;
                        }
                        case 47188435: {
                            break block25;
                        }
                        case 761359743: {
                            v5 = in.mhs("ogj", mhv(int ), (int)159);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.phaseStartTime;
            }
            case 0: {
                var2_2 /* !! */  = (int)in.mhs("ogk", mho(int ), (int)345);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl62:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)in.mhs("ogl", mho(int ), (int)346);
                if (!var3_1) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)in.mhs("ogn", mho(int ), (int)347);
                    if (!var3_1) ** GOTO lbl62
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)in.mhs("ogo", mho(int ), (int)348);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void processLoop() {
        block23: {
            block24: {
                v0 /* !! */  = in.au;
                if (true) ** GOTO lbl5
                block10: while (true) {
                    v0 /* !! */  = (long)(in.mhs("myz", mhv(int ), (int)57) - in.mhs("myy", mhv(int ), (int)56));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 47188435: {
                            break block10;
                        }
                        case 119632458: {
                            continue block10;
                        }
                    }
                    break;
                }
                var5_1 = in.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = in.au - in.mhs("mza", mhv(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == in.mhs("mzc", mho(int ), (int)98)) break;
                    v1 /* !! */  = (long)in.mhs("mze", mho(int ), (int)99);
                }
                var4_2 = in.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = in.au - in.mhs("mzf", mhv(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == in.mhs("mzg", mho(int ), (int)100)) break;
                    v2 /* !! */  = (long)in.mhs("mzh", mho(int ), (int)101);
                }
                var3_3 = in.a;
                if (var5_1) {
                    throw null;
lbl27:
                    // 11 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = in.au - in.mhs("mzj", mhv(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == in.mhs("mzk", mho(int ), (int)102)) break;
                    v3 /* !! */  = (long)in.mhs("mzm", mho(int ), (int)103);
                }
                v4 /* !! */  = in.au;
                if (true) ** GOTO lbl40
                block15: while (true) {
                    v4 /* !! */  = (long)(v5 - in.mhs("mzn", mhv(int ), (int)61));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1227180032: {
                            v5 = in.mhs("mzp", mhv(int ), (int)62);
                            continue block15;
                        }
                        case -472760742: {
                            v5 = in.mhs("mzq", mhv(int ), (int)63);
                            continue block15;
                        }
                        case 47188435: {
                            break block15;
                        }
                        case 1212409414: {
                            v5 = in.mhs("mzr", mhv(int ), (int)64);
                            continue block15;
                        }
                    }
                    break;
                }
                if (this.phase != it$SwapPhase.IDLE) break block24;
                if (var3_3) ** GOTO lbl27
                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl27
            var1_4 /* !! */  = in.mhs("mzt", mho(int ), (int)104);
            if (var3_3 || var3_3) ** GOTO lbl27
            var2_5 = in.mhs("mzv", mho(int ), (int)105);
            if (var3_3) ** GOTO lbl27
            do {
                if (var3_3 || var3_3) ** GOTO lbl27
                if (var1_4 /* !! */  == false) break block23;
                if (var3_3) ** GOTO lbl27
                if (var2_5 >= in.mhs("mzy", mho(int ), (int)106)) break block23;
                if (var3_3 || var3_3) ** GOTO lbl27
                ++var2_5;
                if (var3_3 || var3_3) ** GOTO lbl27
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = in.au - in.mhs("naa", mhv(int ), (int)65)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == in.mhs("nac", mho(int ), (int)107)) break;
                    v6 /* !! */  = (long)in.mhs("nae", mho(int ), (int)108);
                }
                var1_4 /* !! */  = (CallSite)this.processTick();
                if (var3_3) ** GOTO lbl27
            } while (!var5_1);
            throw null;
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
    }

    private static /* synthetic */ void ojp() {
        in.mhr[0] = -2005795263;
        in.mhr[1] = -528119073;
        in.mhr[2] = 1396604294;
        in.mhr[3] = 1568943073;
        in.mhr[4] = 899097717;
        in.mhr[5] = -989622279;
        in.mhr[6] = 1023971097;
        in.mhr[7] = 1876563677;
        in.mhr[8] = -1042432112;
        in.mhr[9] = -1099480697;
        in.mhr[10] = -167436499;
        in.mhr[11] = -2052363637;
        in.mhr[12] = -927422351;
        in.mhr[13] = -1661878706;
        in.mhr[14] = -1304169032;
        in.mhr[15] = -418295477;
        in.mhr[16] = -7808549;
        in.mhr[17] = -521275376;
        in.mhr[18] = -1520695379;
        in.mhr[19] = -1982027087;
        in.mhr[20] = -2146858855;
        in.mhr[21] = -1131099735;
        in.mhr[22] = 468145541;
        in.mhr[23] = -458252322;
        in.mhr[24] = 1748902220;
        in.mhr[25] = 1761955215;
        in.mhr[26] = 1523593521;
        in.mhr[27] = 858861607;
        in.mhr[28] = 1373575079;
        in.mhr[29] = 968985358;
        in.mhr[30] = 822705829;
        in.mhr[31] = 132063879;
        in.mhr[32] = 1199251453;
        in.mhr[33] = -827919060;
        in.mhr[34] = -90101689;
        in.mhr[35] = -555698909;
        in.mhr[36] = -2063137157;
        in.mhr[37] = 908866422;
        in.mhr[38] = 1749676806;
        in.mhr[39] = 28935674;
        in.mhr[40] = 2069740568;
        in.mhr[41] = -210586168;
        in.mhr[42] = 1566098466;
        in.mhr[43] = 924750342;
        in.mhr[44] = -1840496334;
        in.mhr[45] = -1099872119;
        in.mhr[46] = 1644946076;
        in.mhr[47] = -519833317;
        in.mhr[48] = 614483420;
        in.mhr[49] = 613140976;
        in.mhr[50] = -989108267;
        in.mhr[51] = 2041019186;
        in.mhr[52] = 1413845779;
        in.mhr[53] = -1845052299;
        in.mhr[54] = -1814078474;
        in.mhr[55] = -333028868;
        in.mhr[56] = -1634858202;
        in.mhr[57] = -182013749;
        in.mhr[58] = -1655785562;
        in.mhr[59] = -1129843548;
        in.mhr[60] = -1682266906;
        in.mhr[61] = -794627655;
        in.mhr[62] = 909206075;
        in.mhr[63] = -2131116487;
        in.mhr[64] = 283894913;
        in.mhr[65] = 2075425720;
        in.mhr[66] = -1083669773;
        in.mhr[67] = 1798399816;
        in.mhr[68] = 764016840;
        in.mhr[69] = -1116678077;
        in.mhr[70] = 2115825823;
        in.mhr[71] = -225536388;
        in.mhr[72] = 705861129;
        in.mhr[73] = 266010710;
        in.mhr[74] = 1346018817;
        in.mhr[75] = 431019654;
        in.mhr[76] = 1126088258;
        in.mhr[77] = 1652671127;
        in.mhr[78] = -2069216651;
        in.mhr[79] = -34644656;
        in.mhr[80] = -1638611645;
        in.mhr[81] = -461552880;
        in.mhr[82] = -226759072;
        in.mhr[83] = -1576626513;
        in.mhr[84] = 2073906860;
        in.mhr[85] = -89845572;
        in.mhr[86] = -2054868509;
        in.mhr[87] = -2097338551;
        in.mhr[88] = 1298294100;
        in.mhr[89] = -1782207680;
        in.mhr[90] = -535285789;
        in.mhr[91] = 788046733;
        in.mhr[92] = -2054620231;
        in.mhr[93] = -1984375128;
        in.mhr[94] = -885863545;
        in.mhr[95] = 1879210557;
        in.mhr[96] = 111946647;
        in.mhr[97] = -1207174651;
        in.mhr[98] = 2052950783;
        in.mhr[99] = -1545275885;
    }

    private static /* synthetic */ void oiw() {
        in.mhp[100] = 34906049;
        in.mhp[101] = 611075846;
        in.mhp[102] = -1751214873;
        in.mhp[103] = 512699809;
        in.mhp[104] = 1197715211;
        in.mhp[105] = -931757858;
        in.mhp[106] = -311552948;
        in.mhp[107] = -1921837694;
        in.mhp[108] = 1814303387;
        in.mhp[109] = -2131868536;
        in.mhp[110] = 1023300302;
        in.mhp[111] = -971654992;
        in.mhp[112] = -78441226;
        in.mhp[113] = -1933037868;
        in.mhp[114] = -2130827184;
        in.mhp[115] = -2055461034;
        in.mhp[116] = 803580238;
        in.mhp[117] = -405000775;
        in.mhp[118] = 583533648;
        in.mhp[119] = -1121528379;
        in.mhp[120] = 1100172891;
        in.mhp[121] = -1329542366;
        in.mhp[122] = 1309696755;
        in.mhp[123] = 249917672;
        in.mhp[124] = 1173685239;
        in.mhp[125] = -648054705;
        in.mhp[126] = 1991183058;
        in.mhp[127] = 1913323428;
        in.mhp[128] = -601840994;
        in.mhp[129] = 1279069089;
        in.mhp[130] = 821631219;
        in.mhp[131] = -1835809148;
        in.mhp[132] = 2005410097;
        in.mhp[133] = 2037106682;
        in.mhp[134] = -2053506189;
        in.mhp[135] = -869206205;
        in.mhp[136] = 1598809893;
        in.mhp[137] = 112083160;
        in.mhp[138] = -1627250206;
        in.mhp[139] = 1963171646;
        in.mhp[140] = -587298008;
        in.mhp[141] = -1091325956;
        in.mhp[142] = -1297455853;
        in.mhp[143] = 443779341;
        in.mhp[144] = 1557832992;
        in.mhp[145] = 516657217;
        in.mhp[146] = 1054305127;
        in.mhp[147] = -1071250054;
        in.mhp[148] = -833513995;
        in.mhp[149] = -1225289238;
        in.mhp[150] = 2121829663;
        in.mhp[151] = -1729900629;
        in.mhp[152] = 1625581960;
        in.mhp[153] = 555760270;
        in.mhp[154] = 1953627597;
        in.mhp[155] = 41713863;
        in.mhp[156] = 614873211;
        in.mhp[157] = 237095614;
        in.mhp[158] = 1314536581;
        in.mhp[159] = 1806255862;
        in.mhp[160] = 567912177;
        in.mhp[161] = 2125214435;
        in.mhp[162] = -2001792643;
        in.mhp[163] = -858271418;
        in.mhp[164] = 236024515;
        in.mhp[165] = 122303678;
        in.mhp[166] = 604412642;
        in.mhp[167] = 1306635414;
        in.mhp[168] = -380230893;
        in.mhp[169] = -175045828;
        in.mhp[170] = 268775580;
        in.mhp[171] = -767330022;
        in.mhp[172] = -246330575;
        in.mhp[173] = -1233456877;
        in.mhp[174] = 1848187931;
        in.mhp[175] = 1722463834;
        in.mhp[176] = -1918829672;
        in.mhp[177] = 1124402728;
        in.mhp[178] = 1879666698;
        in.mhp[179] = -722987201;
        in.mhp[180] = 360468768;
        in.mhp[181] = -246379535;
        in.mhp[182] = -625640046;
        in.mhp[183] = 297766859;
        in.mhp[184] = -1375980754;
        in.mhp[185] = -2096698705;
        in.mhp[186] = -407457762;
        in.mhp[187] = 1508807108;
        in.mhp[188] = 2146024183;
        in.mhp[189] = -422615740;
        in.mhp[190] = -1676750729;
        in.mhp[191] = -330027049;
        in.mhp[192] = 1176883995;
        in.mhp[193] = -141849843;
        in.mhp[194] = 1252586023;
        in.mhp[195] = -1783754234;
        in.mhp[196] = -1059845783;
        in.mhp[197] = -1173851223;
        in.mhp[198] = -497838258;
        in.mhp[199] = 572029828;
    }

    private static /* synthetic */ void omb() {
        in.mhy[100] = 3699492064885479592L;
        in.mhy[101] = -2599312522134745263L;
        in.mhy[102] = 7060573864451671818L;
        in.mhy[103] = -2372993280306387120L;
        in.mhy[104] = -1979985866457101283L;
        in.mhy[105] = -615361182842560194L;
        in.mhy[106] = 4208392814472409972L;
        in.mhy[107] = 5620327328001833369L;
        in.mhy[108] = -8025770830462171905L;
        in.mhy[109] = -9013193357677195417L;
        in.mhy[110] = 6182701377542094339L;
        in.mhy[111] = 8740891972537839680L;
        in.mhy[112] = -5784648053781019924L;
        in.mhy[113] = -6664658708749910511L;
        in.mhy[114] = -8991482435235921229L;
        in.mhy[115] = -4868117373650324008L;
        in.mhy[116] = 5894171479789054054L;
        in.mhy[117] = -7655543574069769225L;
        in.mhy[118] = 2913974801714215782L;
        in.mhy[119] = -5283508854118131466L;
        in.mhy[120] = 6711444319123710926L;
        in.mhy[121] = 4471199814105740107L;
        in.mhy[122] = -8694532556205345844L;
        in.mhy[123] = -5214246009852866758L;
        in.mhy[124] = 686068053675272589L;
        in.mhy[125] = 6343137286660717046L;
        in.mhy[126] = 732936906869894937L;
        in.mhy[127] = -5580401733977553870L;
        in.mhy[128] = -3335765272459742508L;
        in.mhy[129] = 6161843880525811926L;
        in.mhy[130] = -754956512103382313L;
        in.mhy[131] = -3218702672415885659L;
        in.mhy[132] = 8349323511916549740L;
        in.mhy[133] = -7510109772820800911L;
        in.mhy[134] = 7999927155327348078L;
        in.mhy[135] = 1823921699154376986L;
        in.mhy[136] = 7290122319637362811L;
        in.mhy[137] = -3357752723945614949L;
        in.mhy[138] = 6526236613362485288L;
        in.mhy[139] = 8308800464041694579L;
        in.mhy[140] = -8372103603600203419L;
        in.mhy[141] = -8185268021770850426L;
        in.mhy[142] = -6109620244801977231L;
        in.mhy[143] = 894096201954837635L;
        in.mhy[144] = 9176645345106453109L;
        in.mhy[145] = 3950225674679266174L;
        in.mhy[146] = -7668770708951183479L;
        in.mhy[147] = -4509380210569677382L;
        in.mhy[148] = -6740785151302305361L;
        in.mhy[149] = 1072496649230391950L;
        in.mhy[150] = 1874590627750256698L;
        in.mhy[151] = -6458889766132098057L;
        in.mhy[152] = -1146104775634134871L;
        in.mhy[153] = -4852164374444870011L;
        in.mhy[154] = -6457391212357471966L;
        in.mhy[155] = -5085532707398354918L;
        in.mhy[156] = 3210136525447554399L;
        in.mhy[157] = -4140930238679797704L;
        in.mhy[158] = -1087924520620198392L;
        in.mhy[159] = 2424610676871776336L;
        in.mhy[160] = -1362979983564796174L;
        in.mhy[161] = -299373125384913065L;
        in.mhy[162] = -2429544473434882113L;
        in.mhy[163] = 6273194777385137515L;
        in.mhy[164] = 5517649351556039504L;
        in.mhy[165] = -2837450965630640208L;
        in.mhy[166] = -7307463554722337453L;
        in.mhy[167] = -866105623034994207L;
        in.mhy[168] = 6896023567601581916L;
        in.mhy[169] = -3534308823446484852L;
        in.mhy[170] = 59829076257031262L;
        in.mhy[171] = 6930252511755680972L;
        in.mhy[172] = 8732910234999593222L;
        in.mhy[173] = 6516612238829400175L;
        in.mhy[174] = 6626663371920761393L;
        in.mhy[175] = -3138820508508026933L;
        in.mhy[176] = -8355539806448928219L;
        in.mhy[177] = -3678857747903807339L;
        in.mhy[178] = -8387486251358219208L;
        in.mhy[179] = -6276681599405971599L;
        in.mhy[180] = -4636959609558986548L;
        in.mhy[181] = 4543483532328796752L;
    }

    /*
     * Exception decompiling
     */
    private boolean processTick() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 9[SWITCH]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startPhase(it$SwapPhase var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("nqs", mhv(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == in.mhs("nqu", mho(int ), (int)265)) break;
            v0 /* !! */  = (long)in.mhs("nqw", mho(int ), (int)266);
        }
        var5_3 = in.c;
        v1 /* !! */  = in.au;
        if (true) ** GOTO lbl11
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - in.mhs("nqy", mhv(int ), (int)67));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1241197090: {
                    v2 = in.mhs("nrb", mhv(int ), (int)68);
                    continue block34;
                }
                case -109049082: {
                    v2 = in.mhs("nrd", mhv(int ), (int)69);
                    continue block34;
                }
                case 47188435: {
                    break block34;
                }
            }
            break;
        }
        var4_4 /* !! */  = in.b;
        v3 /* !! */  = in.au;
        if (true) ** GOTO lbl25
        block35: while (true) {
            v3 /* !! */  = (long)(in.mhs("nri", mhv(int ), (int)71) - in.mhs("nrg", mhv(int ), (int)70));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1673874922: {
                    continue block35;
                }
                case 47188435: {
                    break block35;
                }
            }
            break;
        }
        var3_5 = in.a;
        if (var5_3) {
            throw null;
lbl33:
            // 5 sources

            return;
        }
        if (var3_5) ** GOTO lbl33
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = in.au - in.mhs("nrn", mhv(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == in.mhs("nrp", mho(int ), (int)267)) break;
                    v4 /* !! */  = (long)in.mhs("nrr", mho(int ), (int)268);
                }
                this.phase = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl33
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = in.au - in.mhs("nru", mhv(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == in.mhs("nrw", mho(int ), (int)269)) break;
                    v5 /* !! */  = (long)in.mhs("nry", mho(int ), (int)270);
                }
                v6 = System.currentTimeMillis();
                v7 /* !! */  = in.au;
                if (true) ** GOTO lbl57
                block39: while (true) {
                    v7 /* !! */  = (long)(v8 - in.mhs("nsa", mhv(int ), (int)74));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -921946042: {
                            v8 = in.mhs("nsb", mhv(int ), (int)75);
                            continue block39;
                        }
                        case -213859300: {
                            v8 = in.mhs("nsc", mhv(int ), (int)76);
                            continue block39;
                        }
                        case 47188435: {
                            break block39;
                        }
                        case 1601903439: {
                            v8 = in.mhs("nsd", mhv(int ), (int)77);
                            continue block39;
                        }
                    }
                    break;
                }
                this.phaseStartTime = v6;
                if (var3_5 || var3_5) ** GOTO lbl33
                v9 /* !! */  = in.au;
                if (true) ** GOTO lbl75
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - in.mhs("nse", mhv(int ), (int)78));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -361981493: {
                            v10 = in.mhs("nsf", mhv(int ), (int)79);
                            continue block40;
                        }
                        case -209261486: {
                            v10 = in.mhs("nsg", mhv(int ), (int)80);
                            continue block40;
                        }
                        case 47188435: {
                            break block40;
                        }
                        case 218909775: {
                            v10 = in.mhs("nsj", mhv(int ), (int)81);
                            continue block40;
                        }
                    }
                    break;
                }
                this.currentDelay = var2_2;
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl91:
            // 4 sources

            case 0: {
                var4_4 /* !! */  = (int)in.mhs("nsm", mho(int ), (int)271);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 1: {
                var4_4 /* !! */  = (int)in.mhs("nsp", mho(int ), (int)272);
                if (var5_3) {
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)in.mhs("nss", mho(int ), (int)273);
                if (!var5_3) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)in.mhs("nsv", mho(int ), (int)274);
                if (!var5_3) ** GOTO lbl91
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)in.mhs("nsy", mho(int ), (int)275);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl113:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)in.mhs("ntb", mho(int ), (int)276);
                    if (!var5_3) break block9;
                    throw null;
                }
            }
            case 6: {
                var4_4 /* !! */  = (int)in.mhs("nte", mho(int ), (int)277);
                if (!var5_3) ** GOTO lbl91
                throw null;
            }
lbl122:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)in.mhs("nth", mho(int ), (int)278);
                if (!var5_3) ** GOTO lbl91
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)in.mhs("ntk", mho(int ), (int)279);
                if (!var5_3) ** GOTO lbl113
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)in.mhs("ntn", mho(int ), (int)280);
        ** while (!var5_3)
lbl133:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long mhv(int n2) {
        return mhw[n2] ^ mhy[n2];
    }

    private static /* synthetic */ void ojy() {
        in.mhr[100] = -34906050;
        in.mhr[101] = -703890533;
        in.mhr[102] = -1751214874;
        in.mhr[103] = 905096878;
        in.mhr[104] = 1197715210;
        in.mhr[105] = -931757858;
        in.mhr[106] = -311552954;
        in.mhr[107] = 1921837693;
        in.mhr[108] = -575469437;
        in.mhr[109] = -2131868538;
        in.mhr[110] = 1023300318;
        in.mhr[111] = -971654988;
        in.mhr[112] = -78441219;
        in.mhr[113] = -1933037888;
        in.mhr[114] = -2130827180;
        in.mhr[115] = -2055461050;
        in.mhr[116] = 803580253;
        in.mhr[117] = -405000781;
        in.mhr[118] = 583533650;
        in.mhr[119] = -1121528380;
        in.mhr[120] = 1100172883;
        in.mhr[121] = -1329542362;
        in.mhr[122] = 1309696743;
        in.mhr[123] = 249917691;
        in.mhr[124] = 1173685246;
        in.mhr[125] = -648054708;
        in.mhr[126] = 1991183067;
        in.mhr[127] = 1913323438;
        in.mhr[128] = -601841008;
        in.mhr[129] = 1279069090;
        in.mhr[130] = 821631219;
        in.mhr[131] = -1835809148;
        in.mhr[132] = 2005410097;
        in.mhr[133] = 2037106683;
        in.mhr[134] = -2053506190;
        in.mhr[135] = -869206205;
        in.mhr[136] = 1598809892;
        in.mhr[137] = 112083160;
        in.mhr[138] = -1627250205;
        in.mhr[139] = 1963171646;
        in.mhr[140] = -587298008;
        in.mhr[141] = -1091325955;
        in.mhr[142] = -1297455851;
        in.mhr[143] = 443779340;
        in.mhr[144] = 1557832992;
        in.mhr[145] = 516657216;
        in.mhr[146] = 1054305127;
        in.mhr[147] = -1071250054;
        in.mhr[148] = -833513995;
        in.mhr[149] = -1225289309;
        in.mhr[150] = 2121829701;
        in.mhr[151] = -1729900606;
        in.mhr[152] = 1625582011;
        in.mhr[153] = 555760293;
        in.mhr[154] = 1953627634;
        in.mhr[155] = 41713916;
        in.mhr[156] = 614873106;
        in.mhr[157] = 237095637;
        in.mhr[158] = 1314536583;
        in.mhr[159] = 1806255828;
        in.mhr[160] = 567912142;
        in.mhr[161] = 2125214375;
        in.mhr[162] = -2001792709;
        in.mhr[163] = -858271364;
        in.mhr[164] = 236024538;
        in.mhr[165] = 122303626;
        in.mhr[166] = 604412643;
        in.mhr[167] = 1306635492;
        in.mhr[168] = -380230823;
        in.mhr[169] = -175045831;
        in.mhr[170] = 268775612;
        in.mhr[171] = -767330008;
        in.mhr[172] = -246330611;
        in.mhr[173] = -1233456815;
        in.mhr[174] = 1848188008;
        in.mhr[175] = 1722463818;
        in.mhr[176] = -1918829572;
        in.mhr[177] = 1124402723;
        in.mhr[178] = 1879666742;
        in.mhr[179] = -722987232;
        in.mhr[180] = 360468816;
        in.mhr[181] = -246379573;
        in.mhr[182] = -625640026;
        in.mhr[183] = 297766799;
        in.mhr[184] = -1375980674;
        in.mhr[185] = -2096698751;
        in.mhr[186] = -407457749;
        in.mhr[187] = 1508807161;
        in.mhr[188] = 2146024107;
        in.mhr[189] = -422615762;
        in.mhr[190] = -1676750798;
        in.mhr[191] = -330027020;
        in.mhr[192] = 1176884042;
        in.mhr[193] = -141849790;
        in.mhr[194] = 1252586083;
        in.mhr[195] = -1783754181;
        in.mhr[196] = -1059845879;
        in.mhr[197] = -1173851196;
        in.mhr[198] = -497838298;
        in.mhr[199] = 572029929;
    }

    private static /* synthetic */ void ols() {
        in.mhy[0] = -634751659604447335L;
        in.mhy[1] = -5881288384830236957L;
        in.mhy[2] = -2373057951401975633L;
        in.mhy[3] = 1693380798342301633L;
        in.mhy[4] = -5242752953224319634L;
        in.mhy[5] = -862437282077835612L;
        in.mhy[6] = -9076337637896260226L;
        in.mhy[7] = 704608076299715928L;
        in.mhy[8] = 8265439487182556118L;
        in.mhy[9] = -819064727053797165L;
        in.mhy[10] = -5080865375325065125L;
        in.mhy[11] = 7539743797662842045L;
        in.mhy[12] = 1036138589010060731L;
        in.mhy[13] = 1300218682894546397L;
        in.mhy[14] = 5331609739010728733L;
        in.mhy[15] = 3098641080355673853L;
        in.mhy[16] = -2182539746471966476L;
        in.mhy[17] = -4947882592788712057L;
        in.mhy[18] = 4278978639550544923L;
        in.mhy[19] = -909003766338487997L;
        in.mhy[20] = -5400906085169389072L;
        in.mhy[21] = 4119615196605401583L;
        in.mhy[22] = -3513615282192694129L;
        in.mhy[23] = -2445330517340568183L;
        in.mhy[24] = -8892737000927889467L;
        in.mhy[25] = 4907572495437338904L;
        in.mhy[26] = -5810436121457193005L;
        in.mhy[27] = -1682931903111245775L;
        in.mhy[28] = 8099201123544663077L;
        in.mhy[29] = 7549493679253443997L;
        in.mhy[30] = 3771823728720850460L;
        in.mhy[31] = -8345608343908031187L;
        in.mhy[32] = 7441503224159923156L;
        in.mhy[33] = 454502224986595151L;
        in.mhy[34] = 6146271307626802769L;
        in.mhy[35] = 3927163309001744263L;
        in.mhy[36] = 5920810104333759450L;
        in.mhy[37] = -2889348253376173922L;
        in.mhy[38] = 3351358764971678078L;
        in.mhy[39] = -3564549955669033780L;
        in.mhy[40] = -3224811717260163041L;
        in.mhy[41] = 7657557753963580697L;
        in.mhy[42] = 9081152338905816770L;
        in.mhy[43] = 6066581299378691724L;
        in.mhy[44] = 274920744511942154L;
        in.mhy[45] = -5834672206960828491L;
        in.mhy[46] = -2224424110751559869L;
        in.mhy[47] = -1713483092235522776L;
        in.mhy[48] = 8319013217804883465L;
        in.mhy[49] = 424767128378466773L;
        in.mhy[50] = 6426567240972808081L;
        in.mhy[51] = -753993810375092715L;
        in.mhy[52] = -608886703503765690L;
        in.mhy[53] = 5120344648033866969L;
        in.mhy[54] = 2566925971985557144L;
        in.mhy[55] = -1960895853934721734L;
        in.mhy[56] = -1987935746045509095L;
        in.mhy[57] = 3927916830776018490L;
        in.mhy[58] = -8172190862455787811L;
        in.mhy[59] = -5347080065220271762L;
        in.mhy[60] = -7174899681935030449L;
        in.mhy[61] = 8351505932791381337L;
        in.mhy[62] = -1305713458987904820L;
        in.mhy[63] = 8575570859245824427L;
        in.mhy[64] = 5979620900100995632L;
        in.mhy[65] = 2662124496041390996L;
        in.mhy[66] = -5609241735134796972L;
        in.mhy[67] = -8795682303489015598L;
        in.mhy[68] = -8961152846011460295L;
        in.mhy[69] = 3165573319168890332L;
        in.mhy[70] = -8171828435874038464L;
        in.mhy[71] = 8346663921692230950L;
        in.mhy[72] = 4002151297098960191L;
        in.mhy[73] = -675784664050019104L;
        in.mhy[74] = -8917717982635496833L;
        in.mhy[75] = -1864806182848631829L;
        in.mhy[76] = 6806258109689084941L;
        in.mhy[77] = -1910559209210718558L;
        in.mhy[78] = -2486247728819484104L;
        in.mhy[79] = 3974287504494594854L;
        in.mhy[80] = 7651824161327559112L;
        in.mhy[81] = 7949609139416547425L;
        in.mhy[82] = 8619381343123595901L;
        in.mhy[83] = -1390835061512999307L;
        in.mhy[84] = -7579763040824547996L;
        in.mhy[85] = -2378705329982460505L;
        in.mhy[86] = -5796566490271451143L;
        in.mhy[87] = 4748725855406408347L;
        in.mhy[88] = 2473826600601522922L;
        in.mhy[89] = -1644844007664275223L;
        in.mhy[90] = -3882679421608480013L;
        in.mhy[91] = 3328283746269578304L;
        in.mhy[92] = 1925073932207797534L;
        in.mhy[93] = -3904681268141653484L;
        in.mhy[94] = 588333852049073989L;
        in.mhy[95] = 15379115968812998L;
        in.mhy[96] = -20400977801093931L;
        in.mhy[97] = -7117918641182275838L;
        in.mhy[98] = -2662484546991217841L;
        in.mhy[99] = 848002897328357524L;
    }

    private static /* synthetic */ void okz() {
        in.mhw[0] = -634751659604447335L;
        in.mhw[1] = -2097749470315836192L;
        in.mhw[2] = 3532365178528439596L;
        in.mhw[3] = -70196434239029565L;
        in.mhw[4] = -3765968100881273008L;
        in.mhw[5] = -5667603267998381510L;
        in.mhw[6] = -3817068019393356063L;
        in.mhw[7] = -1998950915807938005L;
        in.mhw[8] = 7237229989662453063L;
        in.mhw[9] = -2263904765083251020L;
        in.mhw[10] = -5617932937611062745L;
        in.mhw[11] = -8661368166735949234L;
        in.mhw[12] = -6684986224925945184L;
        in.mhw[13] = 5974687120014425860L;
        in.mhw[14] = 7925470513713343252L;
        in.mhw[15] = -4455227146178888635L;
        in.mhw[16] = -5667386575706639853L;
        in.mhw[17] = 2406993055809487113L;
        in.mhw[18] = 8945408284098990560L;
        in.mhw[19] = -7905490574634010926L;
        in.mhw[20] = -8386451197638610569L;
        in.mhw[21] = 8848696237401538330L;
        in.mhw[22] = 1199540057980489245L;
        in.mhw[23] = 2746323017580860606L;
        in.mhw[24] = -2065663467816101702L;
        in.mhw[25] = 9154324052908991957L;
        in.mhw[26] = 3151377592762741459L;
        in.mhw[27] = 6221569398281441823L;
        in.mhw[28] = -4403386445151242780L;
        in.mhw[29] = 1111116094846446809L;
        in.mhw[30] = -4728249524850900617L;
        in.mhw[31] = -8384875148473968147L;
        in.mhw[32] = -7921812468188278352L;
        in.mhw[33] = -2826051706555185929L;
        in.mhw[34] = 6250100931834288401L;
        in.mhw[35] = -338028404798985147L;
        in.mhw[36] = 3053237309594321960L;
        in.mhw[37] = -5301511252710203705L;
        in.mhw[38] = -7891538744765011209L;
        in.mhw[39] = -945795512342312336L;
        in.mhw[40] = 6551221560349195106L;
        in.mhw[41] = 1142315232302065578L;
        in.mhw[42] = 1132632753401644L;
        in.mhw[43] = -702402368128602441L;
        in.mhw[44] = 8715818880905376300L;
        in.mhw[45] = 8465869911492661994L;
        in.mhw[46] = 3190488945720961270L;
        in.mhw[47] = 3533417019460157468L;
        in.mhw[48] = -4061303456786324743L;
        in.mhw[49] = 8781108132851243910L;
        in.mhw[50] = 6784819759156970475L;
        in.mhw[51] = 3718876179028896687L;
        in.mhw[52] = -6677568839553213890L;
        in.mhw[53] = 3334123096761913392L;
        in.mhw[54] = 3005054633019636772L;
        in.mhw[55] = 7928278397371711243L;
        in.mhw[56] = -1754692953300196939L;
        in.mhw[57] = 5829732687193363172L;
        in.mhw[58] = -9006029621837164563L;
        in.mhw[59] = -5646559118627177256L;
        in.mhw[60] = 5228224519376372439L;
        in.mhw[61] = -794062434916018797L;
        in.mhw[62] = -3636986762144607516L;
        in.mhw[63] = 6539715208339492437L;
        in.mhw[64] = 4435742376541913359L;
        in.mhw[65] = -2511551147207294256L;
        in.mhw[66] = -1500899898262211578L;
        in.mhw[67] = -3254454318986955502L;
        in.mhw[68] = 8453408405181877421L;
        in.mhw[69] = -1667999413997328530L;
        in.mhw[70] = 2074208186407650347L;
        in.mhw[71] = 8432497948248692057L;
        in.mhw[72] = 4752740024651005110L;
        in.mhw[73] = -7992954491294805958L;
        in.mhw[74] = -8951927109042713802L;
        in.mhw[75] = 6910434779873551167L;
        in.mhw[76] = 7214602548450906643L;
        in.mhw[77] = -6795378510031093567L;
        in.mhw[78] = 4944793790986208427L;
        in.mhw[79] = 8073880667153951973L;
        in.mhw[80] = 6167779935595906207L;
        in.mhw[81] = -1865505479516962581L;
        in.mhw[82] = -3675124155649173203L;
        in.mhw[83] = -5738999011371316185L;
        in.mhw[84] = 4278999380651032130L;
        in.mhw[85] = -2732326245931747005L;
        in.mhw[86] = -2607313285998324183L;
        in.mhw[87] = -2902431540932071624L;
        in.mhw[88] = 4434066580974842645L;
        in.mhw[89] = 5234711335418714257L;
        in.mhw[90] = -4789606511089521723L;
        in.mhw[91] = -4540811909071186542L;
        in.mhw[92] = -8579067369147910912L;
        in.mhw[93] = -7068634007991427927L;
        in.mhw[94] = -6928166894512713291L;
        in.mhw[95] = 1199278598152540096L;
        in.mhw[96] = -2430277946332148939L;
        in.mhw[97] = -4787868189474891723L;
        in.mhw[98] = 2449570569661392365L;
        in.mhw[99] = -7416026812409046607L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("ntu", mhv(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == in.mhs("ntw", mho(int ), (int)281)) break;
            v0 /* !! */  = (long)in.mhs("ntz", mho(int ), (int)282);
        }
        var3_1 = in.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = in.au - in.mhs("nub", mhv(int ), (int)83)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == in.mhs("nue", mho(int ), (int)283)) break;
            v1 /* !! */  = (long)in.mhs("nug", mho(int ), (int)284);
        }
        var2_2 /* !! */  = in.b;
        v2 /* !! */  = in.au;
        if (true) ** GOTO lbl17
        block49: while (true) {
            v2 /* !! */  = (long)(v3 - in.mhs("nui", mhv(int ), (int)84));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1194027175: {
                    v3 = in.mhs("null", mhv(int ), (int)85);
                    continue block49;
                }
                case -913018088: {
                    v3 = in.mhs("nvg", mhv(int ), (int)86);
                    continue block49;
                }
                case 47188435: {
                    break block49;
                }
                case 1925323897: {
                    v3 = in.mhs("nvj", mhv(int ), (int)87);
                    continue block49;
                }
            }
            break;
        }
        var1_3 = in.a;
        if (var3_1) {
            throw null;
lbl32:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = in.au;
        if (true) ** GOTO lbl39
        block51: while (true) {
            v4 /* !! */  = (long)(in.mhs("nvp", mhv(int ), (int)89) - in.mhs("nvm", mhv(int ), (int)88));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1933145581: {
                    continue block51;
                }
                case 47188435: {
                    break block51;
                }
            }
            break;
        }
        v5 /* !! */  = in.au;
        if (true) ** GOTO lbl48
        block52: while (true) {
            v5 /* !! */  = (long)(v6 - in.mhs("nvs", mhv(int ), (int)90));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -120515614: {
                    v6 = in.mhs("nvu", mhv(int ), (int)91);
                    continue block52;
                }
                case -76185297: {
                    v6 = in.mhs("nvw", mhv(int ), (int)92);
                    continue block52;
                }
                case 47188435: {
                    break block52;
                }
                case 440996655: {
                    v6 = in.mhs("nvz", mhv(int ), (int)93);
                    continue block52;
                }
            }
            break;
        }
        this.movement.reset();
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                v7 /* !! */  = in.au;
                if (true) ** GOTO lbl70
                block53: while (true) {
                    v7 /* !! */  = (long)(v8 - in.mhs("nwc", mhv(int ), (int)94));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2068139158: {
                            v8 = in.mhs("nwf", mhv(int ), (int)95);
                            continue block53;
                        }
                        case -114213187: {
                            v8 = in.mhs("nwi", mhv(int ), (int)96);
                            continue block53;
                        }
                        case 47188435: {
                            break block53;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = in.au - in.mhs("nwl", mhv(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == in.mhs("nwo", mho(int ), (int)285)) break;
                    v9 /* !! */  = (long)in.mhs("nwq", mho(int ), (int)286);
                }
                this.phase = it$SwapPhase.IDLE;
                if (var1_3 || var1_3) ** GOTO lbl32
                v10 = in.mhs("nwt", mho(int ), (int)287);
                v11 /* !! */  = in.au;
                if (true) ** GOTO lbl91
                block55: while (true) {
                    v11 /* !! */  = (long)(v12 - in.mhs("nwv", mhv(int ), (int)98));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1233740608: {
                            v12 = in.mhs("nwx", mhv(int ), (int)99);
                            continue block55;
                        }
                        case -228199098: {
                            v12 = in.mhs("nwz", mhv(int ), (int)100);
                            continue block55;
                        }
                        case 47188435: {
                            break block55;
                        }
                    }
                    break;
                }
                this.slot = (int)v10;
                if (var1_3 || var1_3) ** GOTO lbl32
                v13 = in.mhs("nxc", mhv(int ), (int)101);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = in.au - in.mhs("nxe", mhv(int ), (int)102)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == in.mhs("nxg", mho(int ), (int)288)) break;
                    v14 /* !! */  = (long)in.mhs("nxj", mho(int ), (int)289);
                }
                this.phaseStartTime = (long)v13;
                if (var1_3 || var1_3) ** GOTO lbl32
                v15 = in.mhs("nxm", mho(int ), (int)290);
                v16 /* !! */  = in.au;
                if (true) ** GOTO lbl115
                block57: while (true) {
                    v16 /* !! */  = (long)(v17 - in.mhs("nxo", mhv(int ), (int)103));
lbl115:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 47188435: {
                            break block57;
                        }
                        case 406302300: {
                            v17 = in.mhs("nxq", mhv(int ), (int)104);
                            continue block57;
                        }
                        case 1782165043: {
                            v17 = in.mhs("nxt", mhv(int ), (int)105);
                            continue block57;
                        }
                    }
                    break;
                }
                this.currentDelay = (int)v15;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)in.mhs("nxw", mho(int ), (int)291);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl133:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)in.mhs("nxz", mho(int ), (int)292);
                if (!var3_1) break;
                throw null;
            }
lbl137:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)in.mhs("nyb", mho(int ), (int)293);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)in.mhs("nye", mho(int ), (int)294);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                    break;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)in.mhs("nyg", mho(int ), (int)295);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 5: {
                var2_2 /* !! */  = (int)in.mhs("nyj", mho(int ), (int)296);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl157:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)in.mhs("nyl", mho(int ), (int)297);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl161:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)in.mhs("nyo", mho(int ), (int)298);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl165:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)in.mhs("nyr", mho(int ), (int)299);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)in.mhs("nyt", mho(int ), (int)300);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
lbl173:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)in.mhs("nyw", mho(int ), (int)301);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl177:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)in.mhs("nyz", mho(int ), (int)302);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)in.mhs("nzc", mho(int ), (int)303);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)in.mhs("nze", mho(int ), (int)304);
        ** while (!var3_1)
lbl188:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public nx getMovement() {
        boolean bl2;
        Object object = au;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - in.mhs("obv", mhv(int ), (int)119);
            }
            switch ((int)object) {
                case -1555082590: {
                    callSite = in.mhs("obx", mhv(int ), (int)120);
                    continue block12;
                }
                case -819673708: {
                    callSite = in.mhs("oby", mhv(int ), (int)121);
                    continue block12;
                }
                case 47188435: {
                    break block12;
                }
                case 305226201: {
                    callSite = in.mhs("obz", mhv(int ), (int)122);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = au;
        boolean bl5 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - in.mhs("occ", mhv(int ), (int)123);
            }
            switch ((int)object2) {
                case -2110597447: {
                    callSite = in.mhs("ocf", mhv(int ), (int)124);
                    continue block13;
                }
                case 47188435: {
                    break block13;
                }
                case 450231794: {
                    callSite = in.mhs("oci", mhv(int ), (int)125);
                    continue block13;
                }
                case 1566110399: {
                    callSite = in.mhs("ock", mhv(int ), (int)126);
                    continue block13;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = au - in.mhs("ocm", mhv(int ), (int)127)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == in.mhs("ocp", mho(int ), (int)320)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = in.mhs("ocr", mho(int ), (int)321);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = au - in.mhs("ocw", mhv(int ), (int)128)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == in.mhs("ocy", mho(int ), (int)322)) {
                return this.movement;
            }
            object4 = in.mhs("odb", mho(int ), (int)323);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startLegit(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = in.au - in.mhs("msz", mhv(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == in.mhs("mtc", mho(int ), (int)66)) break;
            v0 /* !! */  = (long)in.mhs("mtf", mho(int ), (int)67);
        }
        var5_2 = in.c;
        v1 /* !! */  = in.au;
        if (true) ** GOTO lbl11
        block46: while (true) {
            v1 /* !! */  = (long)(v2 - in.mhs("mth", mhv(int ), (int)34));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -504030992: {
                    v2 = in.mhs("mtj", mhv(int ), (int)35);
                    continue block46;
                }
                case 47188435: {
                    break block46;
                }
                case 669603784: {
                    v2 = in.mhs("mtn", mhv(int ), (int)36);
                    continue block46;
                }
            }
            break;
        }
        var4_3 /* !! */  = in.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = in.au - in.mhs("mtq", mhv(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == in.mhs("mtr", mho(int ), (int)68)) break;
            v3 /* !! */  = (long)in.mhs("mtu", mho(int ), (int)69);
        }
        var3_4 = in.a;
        if (var5_2) {
            throw null;
lbl29:
            // 9 sources

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
                    if ((v4 /* !! */  = (cfr_temp_2 = in.au - in.mhs("mtx", mhv(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == in.mhs("mty", mho(int ), (int)70)) break;
                    v4 /* !! */  = (long)in.mhs("mub", mho(int ), (int)71);
                }
                this.slot = var1_1;
                if (var3_4 || var3_4) ** GOTO lbl29
                v5 /* !! */  = in.au;
                if (true) ** GOTO lbl47
                block50: while (true) {
                    v5 /* !! */  = (long)(v6 - in.mhs("mue", mhv(int ), (int)39));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1707840523: {
                            v6 = in.mhs("muh", mhv(int ), (int)40);
                            continue block50;
                        }
                        case 47188435: {
                            break block50;
                        }
                        case 318163401: {
                            v6 = in.mhs("mui", mhv(int ), (int)41);
                            continue block50;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = in.au - in.mhs("muk", mhv(int ), (int)42)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == in.mhs("mun", mho(int ), (int)72)) break;
                    v7 /* !! */  = (long)in.mhs("mup", mho(int ), (int)73);
                }
                var2_5 = this.settingsProvider.get();
                if (var3_4 || var3_4) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = in.au - in.mhs("mut", mhv(int ), (int)43)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == in.mhs("muw", mho(int ), (int)74)) break;
                    v8 /* !! */  = (long)in.mhs("muz", mho(int ), (int)75);
                }
                if (!var2_5.shouldStopMovement()) ** GOTO lbl113
                if (var3_4 || var3_4) ** GOTO lbl29
                v9 /* !! */  = in.au;
                if (true) ** GOTO lbl74
                block53: while (true) {
                    v9 /* !! */  = (long)(v10 - in.mhs("mvb", mhv(int ), (int)44));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1156846095: {
                            v10 = in.mhs("mvd", mhv(int ), (int)45);
                            continue block53;
                        }
                        case -640748662: {
                            v10 = in.mhs("mvg", mhv(int ), (int)46);
                            continue block53;
                        }
                        case 47188435: {
                            break block53;
                        }
                        case 2032390908: {
                            v10 = in.mhs("mvj", mhv(int ), (int)47);
                            continue block53;
                        }
                    }
                    break;
                }
                v11 /* !! */  = in.au;
                if (true) ** GOTO lbl90
                block54: while (true) {
                    v11 /* !! */  = (long)(v12 - in.mhs("mvn", mhv(int ), (int)48));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -760546205: {
                            v12 = in.mhs("mvq", mhv(int ), (int)49);
                            continue block54;
                        }
                        case 47188435: {
                            break block54;
                        }
                        case 1255330239: {
                            v12 = in.mhs("mvs", mhv(int ), (int)50);
                            continue block54;
                        }
                        case 1919108495: {
                            v12 = in.mhs("mvu", mhv(int ), (int)51);
                            continue block54;
                        }
                    }
                    break;
                }
                v13 = var2_5.randomPreStopDelay();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = in.au - in.mhs("mvx", mhv(int ), (int)52)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == in.mhs("mvz", mho(int ), (int)76)) break;
                    v14 /* !! */  = (long)in.mhs("mwb", mho(int ), (int)77);
                }
                this.startPhase(it$SwapPhase.PRE_STOP, v13);
                if (var3_4) ** GOTO lbl29
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl131
lbl113:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl29
                v15 /* !! */  = in.au;
                if (true) ** GOTO lbl118
                block56: while (true) {
                    v15 /* !! */  = (long)(in.mhs("mwl", mhv(int ), (int)54) - in.mhs("mwh", mhv(int ), (int)53));
lbl118:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 47188435: {
                            break block56;
                        }
                        case 452939947: {
                            continue block56;
                        }
                    }
                    break;
                }
                v16 = in.mhs("mwo", mho(int ), (int)78);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = in.au - in.mhs("mwr", mhv(int ), (int)55)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == in.mhs("mwt", mho(int ), (int)79)) break;
                    v17 /* !! */  = (long)in.mhs("mwx", mho(int ), (int)80);
                }
                this.startPhase(it$SwapPhase.DO_SWAP, (int)v16);
                if (var3_4) ** GOTO lbl29
lbl131:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)in.mhs("mxa", mho(int ), (int)81);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl139:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)in.mhs("mxc", mho(int ), (int)82);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl144:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)in.mhs("mxg", mho(int ), (int)83);
                if (!var5_2) break;
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)in.mhs("mxj", mho(int ), (int)84);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 4: {
                var4_3 /* !! */  = (int)in.mhs("mxm", mho(int ), (int)85);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 5: {
                var4_3 /* !! */  = (int)in.mhs("mxp", mho(int ), (int)86);
                if (!var5_2) ** GOTO lbl144
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)in.mhs("mxs", mho(int ), (int)87);
                if (!var5_2) ** GOTO lbl139
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)in.mhs("mxw", mho(int ), (int)88);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl171:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)in.mhs("mxz", mho(int ), (int)89);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 9: {
                var4_3 /* !! */  = (int)in.mhs("myd", mho(int ), (int)90);
                if (!var5_2) ** GOTO lbl144
                throw null;
            }
lbl180:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)in.mhs("myf", mho(int ), (int)91);
                if (!var5_2) ** GOTO lbl171
                throw null;
            }
lbl184:
            // 2 sources

            case 11: {
                do {
                    var4_3 /* !! */  = (int)in.mhs("myi", mho(int ), (int)92);
                } while (!var5_2);
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)in.mhs("myl", mho(int ), (int)93);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl193:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)in.mhs("myo", mho(int ), (int)94);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl197:
            // 5 sources

            case 14: {
                var4_3 /* !! */  = (int)in.mhs("myq", mho(int ), (int)95);
                if (var5_2) {
                    throw null;
                }
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)in.mhs("myt", mho(int ), (int)96);
                    if (!var5_2) ** GOTO lbl184
                    throw null;
                }
            }
            case 16: 
        }
        var4_3 /* !! */  = (int)in.mhs("myv", mho(int ), (int)97);
        ** while (!var5_2)
lbl209:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void forceRestore() {
        boolean bl2;
        block35: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = au - in.mhs("nzi", mhv(int ), (int)106)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == in.mhs("nzk", mho(int ), (int)305)) break;
                object = in.mhs("nzm", mho(int ), (int)306);
            }
            boolean bl3 = c;
            Object object = au;
            block19: while (true) {
                switch ((int)object) {
                    case 47188435: {
                        break block19;
                    }
                    case 2069046260: {
                        object = in.mhs("nzr", mhv(int ), (int)108) - in.mhs("nzp", mhv(int ), (int)107);
                        continue block19;
                    }
                }
                break;
            }
            int n2 = b;
            Object object2 = au;
            boolean bl4 = true;
            block20: while (true) {
                CallSite callSite;
                if (!bl4 || (bl4 = false) || !true) {
                    object2 = callSite - in.mhs("nzt", mhv(int ), (int)109);
                }
                switch ((int)object2) {
                    case 47188435: {
                        break block20;
                    }
                    case 628463542: {
                        callSite = in.mhs("nzv", mhv(int ), (int)110);
                        continue block20;
                    }
                    case 1509355525: {
                        callSite = in.mhs("nzx", mhv(int ), (int)111);
                        continue block20;
                    }
                }
                break;
            }
            bl2 = a;
            if (bl3) {
                throw null;
            }
            if (bl2 || bl2) return;
            Object object3 = au;
            boolean bl5 = true;
            block21: while (true) {
                CallSite callSite;
                if (!bl5 || (bl5 = false) || !true) {
                    object3 = callSite - in.mhs("oab", mhv(int ), (int)112);
                }
                switch ((int)object3) {
                    case -1572628251: {
                        callSite = in.mhs("oad", mhv(int ), (int)113);
                        continue block21;
                    }
                    case 47188435: {
                        break block21;
                    }
                    case 1990970299: {
                        callSite = in.mhs("oaf", mhv(int ), (int)114);
                        continue block21;
                    }
                }
                break;
            }
            while (true) {
                long l3;
                Object object4;
                if ((object4 = (l3 = au - in.mhs("oai", mhv(int ), (int)115)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object4 == in.mhs("oaj", mho(int ), (int)307)) {
                    if (this.movement.isBlocked()) {
                        break;
                    }
                    break block35;
                }
                object4 = in.mhs("oal", mho(int ), (int)308);
            }
            if (bl2 || bl2) return;
            Object object5 = au;
            block23: while (true) {
                switch ((int)object5) {
                    case -949970514: {
                        object5 = in.mhs("oar", mhv(int ), (int)117) - in.mhs("oao", mhv(int ), (int)116);
                        continue block23;
                    }
                    case 47188435: {
                        break block23;
                    }
                }
                break;
            }
            while (true) {
                long l4;
                Object object6;
                if ((object6 = (l4 = au - in.mhs("oat", mhv(int ), (int)118)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object6 == in.mhs("oaw", mho(int ), (int)309)) {
                    this.movement.restoreFromCurrent();
                    if (bl2) return;
                    break;
                }
                object6 = in.mhs("oay", mho(int ), (int)310);
            }
        }
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public in(in$SwapSettingsProvider var1_1) {
        var3_2 /* !! */  = in.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.movement = new nx();
                this.phase = it$SwapPhase.IDLE;
                this.slot = (int)in.mhs("mht", mho(int ), (int)0);
                this.phaseStartTime = (long)in.mhs("mia", mhv(int ), (int)0);
                this.currentDelay = (int)in.mhs("mib", mho(int ), (int)1);
                this.settingsProvider = var1_1;
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)in.mhs("mid", mho(int ), (int)2);
                break;
            }
            case 1: {
                var3_2 /* !! */  = (int)in.mhs("mie", mho(int ), (int)3);
                ** GOTO lbl24
            }
            case 2: {
                var3_2 /* !! */  = (int)in.mhs("mig", mho(int ), (int)4);
            }
            case 3: {
                var3_2 /* !! */  = (int)in.mhs("mih", mho(int ), (int)5);
                ** GOTO lbl13
            }
lbl24:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)in.mhs("mij", mho(int ), (int)6);
            }
lbl26:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)in.mhs("mil", mho(int ), (int)7);
                    ** GOTO lbl33
                    break;
                }
            }
            case 6: {
                var3_2 /* !! */  = (int)in.mhs("min", mho(int ), (int)8);
                ** GOTO lbl26
            }
lbl33:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)in.mhs("mio", mho(int ), (int)9);
            }
            case 8: 
        }
        var3_2 /* !! */  = (int)in.mhs("mir", mho(int ), (int)10);
        ** while (true)
    }
}

