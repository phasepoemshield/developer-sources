/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import ruhack.phobia.gk$Palette;

final class mo$ThemeHitbox
extends Record {
    private static long[] eome;
    private final float y;
    private static int[] eolv;
    public static final boolean c;
    private final float x;
    private static long[] eomd;
    private final gk$Palette palette;
    public static final int b;
    public static final boolean a;
    private static int[] eolu;
    private final float width;
    static final long ld = -5670024693295312406L;
    private final float height;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eomv", eomc(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ThemeHitbox.eolw("eomw", eolt(int ), (int)17)) break;
            v0 /* !! */  = (long)mo$ThemeHitbox.eolw("eomx", eolt(int ), (int)18);
        }
        var3_1 = mo$ThemeHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eomy", eomc(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ThemeHitbox.eolw("eomz", eolt(int ), (int)19)) break;
            v1 /* !! */  = (long)mo$ThemeHitbox.eolw("eona", eolt(int ), (int)20);
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        v2 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - mo$ThemeHitbox.eolw("eonb", eomc(int ), (int)6));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1410978556: {
                    v3 = mo$ThemeHitbox.eolw("eonc", eomc(int ), (int)7);
                    continue block13;
                }
                case 544248298: {
                    break block13;
                }
                case 1681374412: {
                    v3 = mo$ThemeHitbox.eolw("eond", eomc(int ), (int)8);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (int)mo$ThemeHitbox.eolw("eone", eolt(int ), (int)21);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eonf", eomc(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$ThemeHitbox.eolw("eong", eolt(int ), (int)22)) break;
                    v4 /* !! */  = (long)mo$ThemeHitbox.eolw("eonh", eolt(int ), (int)23);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$ThemeHitbox.class, "palette;x;y;width;height", "palette", "x", "y", "width", "height"}, this);
            }
lbl45:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoni", eolt(int ), (int)24);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eonj", eolt(int ), (int)25);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eonk", eolt(int ), (int)26);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eonl", eolt(int ), (int)27);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int eolt(int n2) {
        return eolu[n2] ^ eolv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float x() {
        v0 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - mo$ThemeHitbox.eolw("eoot", eomc(int ), (int)24));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -480418353: {
                    v1 = mo$ThemeHitbox.eolw("eoou", eomc(int ), (int)25);
                    continue block18;
                }
                case 544248298: {
                    break block18;
                }
                case 911481147: {
                    v1 = mo$ThemeHitbox.eolw("eoov", eomc(int ), (int)26);
                    continue block18;
                }
                case 2026263598: {
                    v1 = mo$ThemeHitbox.eolw("eoow", eomc(int ), (int)27);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = mo$ThemeHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoox", eomc(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ThemeHitbox.eolw("eooy", eolt(int ), (int)47)) break;
            v2 /* !! */  = (long)mo$ThemeHitbox.eolw("eooz", eolt(int ), (int)48);
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        v3 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - mo$ThemeHitbox.eolw("eopa", eomc(int ), (int)29));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1322533438: {
                    v4 = mo$ThemeHitbox.eolw("eopb", eomc(int ), (int)30);
                    continue block20;
                }
                case -371344415: {
                    v4 = mo$ThemeHitbox.eolw("eopc", eomc(int ), (int)31);
                    continue block20;
                }
                case 176925293: {
                    v4 = mo$ThemeHitbox.eolw("eopd", eomc(int ), (int)32);
                    continue block20;
                }
                case 544248298: {
                    break block20;
                }
            }
            break;
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var3_1) {
            throw null;
            return (float)mo$ThemeHitbox.eolw("eopf", eope(int ), (int)49);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eopg", eomc(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$ThemeHitbox.eolw("eoph", eolt(int ), (int)50)) break;
                    v5 /* !! */  = (long)mo$ThemeHitbox.eolw("eopi", eolt(int ), (int)51);
                }
                return this.x;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eopj", eolt(int ), (int)52);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
lbl62:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eopk", eolt(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eopl", eolt(int ), (int)54);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eopm", eolt(int ), (int)55);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long eomc(int n2) {
        return eomd[n2] ^ eome[n2];
    }

    private static /* synthetic */ void eorq() {
        mo$ThemeHitbox.eome[0] = -3899495018468324081L;
        mo$ThemeHitbox.eome[1] = 7325171236895018651L;
        mo$ThemeHitbox.eome[2] = 6406477596596931747L;
        mo$ThemeHitbox.eome[3] = -1407142475211728784L;
        mo$ThemeHitbox.eome[4] = 8496439749026335049L;
        mo$ThemeHitbox.eome[5] = -3767552035300786332L;
        mo$ThemeHitbox.eome[6] = 1725418065067672168L;
        mo$ThemeHitbox.eome[7] = 2021298683706245754L;
        mo$ThemeHitbox.eome[8] = 4333880564474114357L;
        mo$ThemeHitbox.eome[9] = -2312535239319161345L;
        mo$ThemeHitbox.eome[10] = -7041521767449247865L;
        mo$ThemeHitbox.eome[11] = 1958343551586313362L;
        mo$ThemeHitbox.eome[12] = 3422528455345416896L;
        mo$ThemeHitbox.eome[13] = -6416847603058062094L;
        mo$ThemeHitbox.eome[14] = -6058487736084092549L;
        mo$ThemeHitbox.eome[15] = 5935975006121789669L;
        mo$ThemeHitbox.eome[16] = 4344476188102293685L;
        mo$ThemeHitbox.eome[17] = 2257404675491146239L;
        mo$ThemeHitbox.eome[18] = 8775474050119717953L;
        mo$ThemeHitbox.eome[19] = 8774702882541177006L;
        mo$ThemeHitbox.eome[20] = -5905326462119089650L;
        mo$ThemeHitbox.eome[21] = 4369360313935525951L;
        mo$ThemeHitbox.eome[22] = -7157009081292147647L;
        mo$ThemeHitbox.eome[23] = 318676899645835310L;
        mo$ThemeHitbox.eome[24] = -1632052828584450195L;
        mo$ThemeHitbox.eome[25] = -1788799233389771362L;
        mo$ThemeHitbox.eome[26] = -832021929992599520L;
        mo$ThemeHitbox.eome[27] = -94951070419300009L;
        mo$ThemeHitbox.eome[28] = 6998399791682951492L;
        mo$ThemeHitbox.eome[29] = -41651305220459580L;
        mo$ThemeHitbox.eome[30] = -16996609537048569L;
        mo$ThemeHitbox.eome[31] = 865462662795668742L;
        mo$ThemeHitbox.eome[32] = 8173985572127735686L;
        mo$ThemeHitbox.eome[33] = -7543179553085101081L;
        mo$ThemeHitbox.eome[34] = -8913397059399902995L;
        mo$ThemeHitbox.eome[35] = -4536692132046080121L;
        mo$ThemeHitbox.eome[36] = -6719947092012101983L;
        mo$ThemeHitbox.eome[37] = -5408252898636372111L;
        mo$ThemeHitbox.eome[38] = -2891183965673040303L;
        mo$ThemeHitbox.eome[39] = -6621756252632062941L;
        mo$ThemeHitbox.eome[40] = 4605209290840808573L;
        mo$ThemeHitbox.eome[41] = -8399801176581211289L;
        mo$ThemeHitbox.eome[42] = -1318696562933201413L;
        mo$ThemeHitbox.eome[43] = 2204071966953366137L;
        mo$ThemeHitbox.eome[44] = 4923370729985128089L;
        mo$ThemeHitbox.eome[45] = -288815856821068657L;
        mo$ThemeHitbox.eome[46] = 830505414823459674L;
        mo$ThemeHitbox.eome[47] = -2263334419966243452L;
        mo$ThemeHitbox.eome[48] = -7765079779493943765L;
        mo$ThemeHitbox.eome[49] = 1420731087083695013L;
        mo$ThemeHitbox.eome[50] = 7400268908095637111L;
        mo$ThemeHitbox.eome[51] = 5832555182228076634L;
        mo$ThemeHitbox.eome[52] = 1789382059892508581L;
        mo$ThemeHitbox.eome[53] = 4159037806671349593L;
        mo$ThemeHitbox.eome[54] = 4752792678933716320L;
        mo$ThemeHitbox.eome[55] = 4561519096965158073L;
        mo$ThemeHitbox.eome[56] = -6233983918251946049L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eonm", eomc(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ThemeHitbox.eolw("eonn", eolt(int ), (int)28)) break;
            v0 /* !! */  = (long)mo$ThemeHitbox.eolw("eono", eolt(int ), (int)29);
        }
        var4_2 = mo$ThemeHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eonp", eomc(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ThemeHitbox.eolw("eonq", eolt(int ), (int)30)) break;
            v1 /* !! */  = (long)mo$ThemeHitbox.eolw("eonr", eolt(int ), (int)31);
        }
        var3_3 = mo$ThemeHitbox.b;
        v2 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl19
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - mo$ThemeHitbox.eolw("eons", eomc(int ), (int)12));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 544248298: {
                    break block7;
                }
                case 1791258846: {
                    v3 = mo$ThemeHitbox.eolw("eont", eomc(int ), (int)13);
                    continue block7;
                }
                case 2035282695: {
                    v3 = mo$ThemeHitbox.eolw("eonu", eomc(int ), (int)14);
                    continue block7;
                }
            }
            break;
        }
        var2_4 = mo$ThemeHitbox.a;
        if (var4_2) {
            throw null;
lbl31:
            // 1 sources

            return (boolean)mo$ThemeHitbox.eolw("eonv", eolt(int ), (int)32);
        }
        ** while (var2_4 || var2_4)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eonw", eomc(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mo$ThemeHitbox.eolw("eonx", eolt(int ), (int)33)) break;
            v4 /* !! */  = (long)mo$ThemeHitbox.eolw("eony", eolt(int ), (int)34);
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$ThemeHitbox.class, "palette;x;y;width;height", "palette", "x", "y", "width", "height"}, this, var1_1);
    }

    private static /* synthetic */ void eorn() {
        mo$ThemeHitbox.eolu[0] = 791752188;
        mo$ThemeHitbox.eolu[1] = -1911392162;
        mo$ThemeHitbox.eolu[2] = -1861479377;
        mo$ThemeHitbox.eolu[3] = -655270230;
        mo$ThemeHitbox.eolu[4] = -525262642;
        mo$ThemeHitbox.eolu[5] = 304466934;
        mo$ThemeHitbox.eolu[6] = 73066902;
        mo$ThemeHitbox.eolu[7] = -814162829;
        mo$ThemeHitbox.eolu[8] = -1864091151;
        mo$ThemeHitbox.eolu[9] = 392272153;
        mo$ThemeHitbox.eolu[10] = -1503074575;
        mo$ThemeHitbox.eolu[11] = 935532813;
        mo$ThemeHitbox.eolu[12] = -653800585;
        mo$ThemeHitbox.eolu[13] = -1783821448;
        mo$ThemeHitbox.eolu[14] = 1370414494;
        mo$ThemeHitbox.eolu[15] = -913899327;
        mo$ThemeHitbox.eolu[16] = 26301371;
        mo$ThemeHitbox.eolu[17] = 908589070;
        mo$ThemeHitbox.eolu[18] = 1338448295;
        mo$ThemeHitbox.eolu[19] = 340321722;
        mo$ThemeHitbox.eolu[20] = -982492634;
        mo$ThemeHitbox.eolu[21] = -1854264353;
        mo$ThemeHitbox.eolu[22] = -2081701684;
        mo$ThemeHitbox.eolu[23] = 1027781975;
        mo$ThemeHitbox.eolu[24] = 1902134223;
        mo$ThemeHitbox.eolu[25] = -1670516416;
        mo$ThemeHitbox.eolu[26] = 543558329;
        mo$ThemeHitbox.eolu[27] = -1028957717;
        mo$ThemeHitbox.eolu[28] = 176065099;
        mo$ThemeHitbox.eolu[29] = 1517035422;
        mo$ThemeHitbox.eolu[30] = 66345854;
        mo$ThemeHitbox.eolu[31] = -1237554904;
        mo$ThemeHitbox.eolu[32] = -1919938439;
        mo$ThemeHitbox.eolu[33] = -1586249997;
        mo$ThemeHitbox.eolu[34] = -1037153085;
        mo$ThemeHitbox.eolu[35] = 1376139923;
        mo$ThemeHitbox.eolu[36] = -1635502467;
        mo$ThemeHitbox.eolu[37] = -1821822709;
        mo$ThemeHitbox.eolu[38] = 1059234422;
        mo$ThemeHitbox.eolu[39] = -1394878264;
        mo$ThemeHitbox.eolu[40] = -1002775049;
        mo$ThemeHitbox.eolu[41] = 703531475;
        mo$ThemeHitbox.eolu[42] = -1088884182;
        mo$ThemeHitbox.eolu[43] = -8230147;
        mo$ThemeHitbox.eolu[44] = 996908980;
        mo$ThemeHitbox.eolu[45] = 1425453852;
        mo$ThemeHitbox.eolu[46] = 1577800109;
        mo$ThemeHitbox.eolu[47] = -1295533921;
        mo$ThemeHitbox.eolu[48] = 545012559;
        mo$ThemeHitbox.eolu[49] = 1330315994;
        mo$ThemeHitbox.eolu[50] = -1104129897;
        mo$ThemeHitbox.eolu[51] = 1257956621;
        mo$ThemeHitbox.eolu[52] = -693249140;
        mo$ThemeHitbox.eolu[53] = -799877285;
        mo$ThemeHitbox.eolu[54] = 1937412201;
        mo$ThemeHitbox.eolu[55] = -1604739977;
        mo$ThemeHitbox.eolu[56] = 1474703014;
        mo$ThemeHitbox.eolu[57] = 68591024;
        mo$ThemeHitbox.eolu[58] = -883830171;
        mo$ThemeHitbox.eolu[59] = 699894925;
        mo$ThemeHitbox.eolu[60] = -433673701;
        mo$ThemeHitbox.eolu[61] = -1453088181;
        mo$ThemeHitbox.eolu[62] = -97951807;
        mo$ThemeHitbox.eolu[63] = -1860418665;
        mo$ThemeHitbox.eolu[64] = 40750671;
        mo$ThemeHitbox.eolu[65] = 531275852;
        mo$ThemeHitbox.eolu[66] = -661617282;
        mo$ThemeHitbox.eolu[67] = 1437745915;
        mo$ThemeHitbox.eolu[68] = -93853226;
        mo$ThemeHitbox.eolu[69] = -668698445;
        mo$ThemeHitbox.eolu[70] = 811868635;
        mo$ThemeHitbox.eolu[71] = 219198454;
        mo$ThemeHitbox.eolu[72] = 311488870;
        mo$ThemeHitbox.eolu[73] = -1631713760;
        mo$ThemeHitbox.eolu[74] = 708371945;
        mo$ThemeHitbox.eolu[75] = -1008550503;
        mo$ThemeHitbox.eolu[76] = 2002629892;
        mo$ThemeHitbox.eolu[77] = 638652646;
        mo$ThemeHitbox.eolu[78] = -2074973713;
        mo$ThemeHitbox.eolu[79] = 94007710;
        mo$ThemeHitbox.eolu[80] = 825260900;
        mo$ThemeHitbox.eolu[81] = 613033661;
        mo$ThemeHitbox.eolu[82] = 1085414264;
        mo$ThemeHitbox.eolu[83] = -689293726;
        mo$ThemeHitbox.eolu[84] = 1543901471;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoqv", eomc(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ThemeHitbox.eolw("eoqw", eolt(int ), (int)76)) break;
            v0 /* !! */  = (long)mo$ThemeHitbox.eolw("eoqx", eolt(int ), (int)77);
        }
        var3_1 = mo$ThemeHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoqy", eomc(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ThemeHitbox.eolw("eoqz", eolt(int ), (int)78)) break;
            v1 /* !! */  = (long)mo$ThemeHitbox.eolw("eora", eolt(int ), (int)79);
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        v2 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - mo$ThemeHitbox.eolw("eorb", eomc(int ), (int)50));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2021347299: {
                    v3 = mo$ThemeHitbox.eolw("eorc", eomc(int ), (int)51);
                    continue block19;
                }
                case -1859833822: {
                    v3 = mo$ThemeHitbox.eolw("eord", eomc(int ), (int)52);
                    continue block19;
                }
                case 58384207: {
                    v3 = mo$ThemeHitbox.eolw("eore", eomc(int ), (int)53);
                    continue block19;
                }
                case 544248298: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (float)mo$ThemeHitbox.eolw("eorf", eope(int ), (int)80);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mo$ThemeHitbox.ld;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$ThemeHitbox.eolw("eorg", eomc(int ), (int)54));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2013002572: {
                            v5 = mo$ThemeHitbox.eolw("eorh", eomc(int ), (int)55);
                            continue block21;
                        }
                        case 544248298: {
                            break block21;
                        }
                        case 1047578060: {
                            v5 = mo$ThemeHitbox.eolw("eori", eomc(int ), (int)56);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.height;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eorj", eolt(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eork", eolt(int ), (int)82);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
lbl65:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eorl", eolt(int ), (int)83);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eorm", eolt(int ), (int)84);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    static {
        eolu = new int[85];
        eolv = new int[85];
        mo$ThemeHitbox.eorn();
        mo$ThemeHitbox.eoro();
        eomd = new long[57];
        eome = new long[57];
        mo$ThemeHitbox.eorp();
        mo$ThemeHitbox.eorq();
    }

    private static /* synthetic */ void eorp() {
        mo$ThemeHitbox.eomd[0] = -5034898172624689278L;
        mo$ThemeHitbox.eomd[1] = -9162197263543219411L;
        mo$ThemeHitbox.eomd[2] = 4357785008837481269L;
        mo$ThemeHitbox.eomd[3] = -2063160848386857429L;
        mo$ThemeHitbox.eomd[4] = 6931060181893489527L;
        mo$ThemeHitbox.eomd[5] = 3673693805501752897L;
        mo$ThemeHitbox.eomd[6] = -9177478376871952980L;
        mo$ThemeHitbox.eomd[7] = -2700690618954818590L;
        mo$ThemeHitbox.eomd[8] = 4490894828787638187L;
        mo$ThemeHitbox.eomd[9] = 3459950556995995003L;
        mo$ThemeHitbox.eomd[10] = 5493424483845523419L;
        mo$ThemeHitbox.eomd[11] = -3298895489367846631L;
        mo$ThemeHitbox.eomd[12] = 7963385216596819821L;
        mo$ThemeHitbox.eomd[13] = 2582364557150004341L;
        mo$ThemeHitbox.eomd[14] = -1368614991149210229L;
        mo$ThemeHitbox.eomd[15] = -3729409710220820955L;
        mo$ThemeHitbox.eomd[16] = 4188080053861204399L;
        mo$ThemeHitbox.eomd[17] = 1053500862261746495L;
        mo$ThemeHitbox.eomd[18] = 3309483805895017426L;
        mo$ThemeHitbox.eomd[19] = 7525565294642360894L;
        mo$ThemeHitbox.eomd[20] = -8650530770972325254L;
        mo$ThemeHitbox.eomd[21] = -2190575461836907851L;
        mo$ThemeHitbox.eomd[22] = -4082437159565697439L;
        mo$ThemeHitbox.eomd[23] = 6817127724874237641L;
        mo$ThemeHitbox.eomd[24] = 3234022200843738861L;
        mo$ThemeHitbox.eomd[25] = -4592277130970230260L;
        mo$ThemeHitbox.eomd[26] = -765087711680116083L;
        mo$ThemeHitbox.eomd[27] = -7557686805760659055L;
        mo$ThemeHitbox.eomd[28] = -2324276457038094590L;
        mo$ThemeHitbox.eomd[29] = -2207855815326577281L;
        mo$ThemeHitbox.eomd[30] = -475972162412609080L;
        mo$ThemeHitbox.eomd[31] = -4684130538467996021L;
        mo$ThemeHitbox.eomd[32] = 2641694110120749538L;
        mo$ThemeHitbox.eomd[33] = 3326779272644337781L;
        mo$ThemeHitbox.eomd[34] = 5912338468552306774L;
        mo$ThemeHitbox.eomd[35] = -8614907872073787888L;
        mo$ThemeHitbox.eomd[36] = 4238284646462999585L;
        mo$ThemeHitbox.eomd[37] = 1860996125940103351L;
        mo$ThemeHitbox.eomd[38] = -6019188100963372249L;
        mo$ThemeHitbox.eomd[39] = 7808411979854811547L;
        mo$ThemeHitbox.eomd[40] = 4893265462485443895L;
        mo$ThemeHitbox.eomd[41] = -1446814401182749145L;
        mo$ThemeHitbox.eomd[42] = -9075957206317124660L;
        mo$ThemeHitbox.eomd[43] = 2402807701590019056L;
        mo$ThemeHitbox.eomd[44] = -1702953292846688064L;
        mo$ThemeHitbox.eomd[45] = 428732748339919135L;
        mo$ThemeHitbox.eomd[46] = -1747003936485161183L;
        mo$ThemeHitbox.eomd[47] = -5704576432244949083L;
        mo$ThemeHitbox.eomd[48] = 2656698872682466350L;
        mo$ThemeHitbox.eomd[49] = -8262800035902718442L;
        mo$ThemeHitbox.eomd[50] = 187697947795194234L;
        mo$ThemeHitbox.eomd[51] = 708685891558027808L;
        mo$ThemeHitbox.eomd[52] = 5991387796106583951L;
        mo$ThemeHitbox.eomd[53] = -7240902940030658496L;
        mo$ThemeHitbox.eomd[54] = 6732254760416573516L;
        mo$ThemeHitbox.eomd[55] = 5788198215638235092L;
        mo$ThemeHitbox.eomd[56] = 6729133784265796043L;
    }

    private static /* synthetic */ void eoro() {
        mo$ThemeHitbox.eolv[0] = 791752189;
        mo$ThemeHitbox.eolv[1] = -1911392166;
        mo$ThemeHitbox.eolv[2] = -1861479381;
        mo$ThemeHitbox.eolv[3] = -655270229;
        mo$ThemeHitbox.eolv[4] = -525262646;
        mo$ThemeHitbox.eolv[5] = -304466935;
        mo$ThemeHitbox.eolv[6] = -596450376;
        mo$ThemeHitbox.eolv[7] = 814162828;
        mo$ThemeHitbox.eolv[8] = 312497693;
        mo$ThemeHitbox.eolv[9] = -392272154;
        mo$ThemeHitbox.eolv[10] = 750506089;
        mo$ThemeHitbox.eolv[11] = -935532814;
        mo$ThemeHitbox.eolv[12] = -838683292;
        mo$ThemeHitbox.eolv[13] = -1783821446;
        mo$ThemeHitbox.eolv[14] = 1370414495;
        mo$ThemeHitbox.eolv[15] = -913899328;
        mo$ThemeHitbox.eolv[16] = 26301370;
        mo$ThemeHitbox.eolv[17] = -908589071;
        mo$ThemeHitbox.eolv[18] = -98247751;
        mo$ThemeHitbox.eolv[19] = -340321723;
        mo$ThemeHitbox.eolv[20] = 568356184;
        mo$ThemeHitbox.eolv[21] = 1115740215;
        mo$ThemeHitbox.eolv[22] = 2081701683;
        mo$ThemeHitbox.eolv[23] = -1784945745;
        mo$ThemeHitbox.eolv[24] = 1902134220;
        mo$ThemeHitbox.eolv[25] = -1670516416;
        mo$ThemeHitbox.eolv[26] = 543558330;
        mo$ThemeHitbox.eolv[27] = -1028957718;
        mo$ThemeHitbox.eolv[28] = -176065100;
        mo$ThemeHitbox.eolv[29] = 1819657401;
        mo$ThemeHitbox.eolv[30] = -66345855;
        mo$ThemeHitbox.eolv[31] = 1545074633;
        mo$ThemeHitbox.eolv[32] = -1919938440;
        mo$ThemeHitbox.eolv[33] = -1586249998;
        mo$ThemeHitbox.eolv[34] = -605601738;
        mo$ThemeHitbox.eolv[35] = 1376139923;
        mo$ThemeHitbox.eolv[36] = -1635502465;
        mo$ThemeHitbox.eolv[37] = -1821822709;
        mo$ThemeHitbox.eolv[38] = 1059234421;
        mo$ThemeHitbox.eolv[39] = 1394878263;
        mo$ThemeHitbox.eolv[40] = 13809973;
        mo$ThemeHitbox.eolv[41] = -703531476;
        mo$ThemeHitbox.eolv[42] = -1909329117;
        mo$ThemeHitbox.eolv[43] = -8230148;
        mo$ThemeHitbox.eolv[44] = 996908981;
        mo$ThemeHitbox.eolv[45] = 1425453852;
        mo$ThemeHitbox.eolv[46] = 1577800109;
        mo$ThemeHitbox.eolv[47] = 1295533920;
        mo$ThemeHitbox.eolv[48] = -1974468602;
        mo$ThemeHitbox.eolv[49] = 1910886490;
        mo$ThemeHitbox.eolv[50] = 1104129896;
        mo$ThemeHitbox.eolv[51] = 1319468587;
        mo$ThemeHitbox.eolv[52] = -693249138;
        mo$ThemeHitbox.eolv[53] = -799877285;
        mo$ThemeHitbox.eolv[54] = 1937412203;
        mo$ThemeHitbox.eolv[55] = -1604739979;
        mo$ThemeHitbox.eolv[56] = 1474703015;
        mo$ThemeHitbox.eolv[57] = -104875643;
        mo$ThemeHitbox.eolv[58] = -883830172;
        mo$ThemeHitbox.eolv[59] = -830379397;
        mo$ThemeHitbox.eolv[60] = -670820633;
        mo$ThemeHitbox.eolv[61] = 1453088180;
        mo$ThemeHitbox.eolv[62] = 120410781;
        mo$ThemeHitbox.eolv[63] = -1860418667;
        mo$ThemeHitbox.eolv[64] = 40750668;
        mo$ThemeHitbox.eolv[65] = 531275852;
        mo$ThemeHitbox.eolv[66] = -661617282;
        mo$ThemeHitbox.eolv[67] = -1437745916;
        mo$ThemeHitbox.eolv[68] = 2033873435;
        mo$ThemeHitbox.eolv[69] = -425842395;
        mo$ThemeHitbox.eolv[70] = -811868636;
        mo$ThemeHitbox.eolv[71] = -1465335594;
        mo$ThemeHitbox.eolv[72] = 311488871;
        mo$ThemeHitbox.eolv[73] = -1631713760;
        mo$ThemeHitbox.eolv[74] = 708371944;
        mo$ThemeHitbox.eolv[75] = -1008550503;
        mo$ThemeHitbox.eolv[76] = 2002629893;
        mo$ThemeHitbox.eolv[77] = -113056283;
        mo$ThemeHitbox.eolv[78] = -2074973714;
        mo$ThemeHitbox.eolv[79] = 1288927604;
        mo$ThemeHitbox.eolv[80] = 263019418;
        mo$ThemeHitbox.eolv[81] = 613033663;
        mo$ThemeHitbox.eolv[82] = 1085414267;
        mo$ThemeHitbox.eolv[83] = -689293727;
        mo$ThemeHitbox.eolv[84] = 1543901470;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$ThemeHitbox(gk$Palette var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var7_6 /* !! */  = mo$ThemeHitbox.b;
        super();
        this.palette = var1_1;
        this.x = var2_2;
        this.y = var3_3;
        this.width = var4_4;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.height = var5_5;
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var7_6 /* !! */  = (int)mo$ThemeHitbox.eolw("eolx", eolt(int ), (int)0);
            }
lbl14:
            // 3 sources

            case 1: {
                var7_6 /* !! */  = (int)mo$ThemeHitbox.eolw("eoly", eolt(int ), (int)1);
                break;
            }
            case 2: {
                var7_6 /* !! */  = (int)mo$ThemeHitbox.eolw("eolz", eolt(int ), (int)2);
                ** GOTO lbl14
            }
            case 3: {
                var7_6 /* !! */  = (int)mo$ThemeHitbox.eolw("eoma", eolt(int ), (int)3);
                ** GOTO lbl12
            }
            case 4: 
        }
        while (true) {
            var7_6 /* !! */  = (int)mo$ThemeHitbox.eolw("eomb", eolt(int ), (int)4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoqd", eomc(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ThemeHitbox.eolw("eoqe", eolt(int ), (int)67)) break;
            v0 /* !! */  = (long)mo$ThemeHitbox.eolw("eoqf", eolt(int ), (int)68);
        }
        var3_1 = mo$ThemeHitbox.c;
        v1 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - mo$ThemeHitbox.eolw("eoqg", eomc(int ), (int)40));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -491602695: {
                    v2 = mo$ThemeHitbox.eolw("eoqh", eomc(int ), (int)41);
                    continue block18;
                }
                case -190195086: {
                    v2 = mo$ThemeHitbox.eolw("eoqi", eomc(int ), (int)42);
                    continue block18;
                }
                case 544248298: {
                    break block18;
                }
                case 1222629618: {
                    v2 = mo$ThemeHitbox.eolw("eoqj", eomc(int ), (int)43);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        v3 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - mo$ThemeHitbox.eolw("eoqk", eomc(int ), (int)44));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2037316493: {
                    v4 = mo$ThemeHitbox.eolw("eoql", eomc(int ), (int)45);
                    continue block19;
                }
                case -617246608: {
                    v4 = mo$ThemeHitbox.eolw("eoqm", eomc(int ), (int)46);
                    continue block19;
                }
                case 544248298: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)mo$ThemeHitbox.eolw("eoqn", eope(int ), (int)69);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoqo", eomc(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$ThemeHitbox.eolw("eoqp", eolt(int ), (int)70)) break;
                    v5 /* !! */  = (long)mo$ThemeHitbox.eolw("eoqq", eolt(int ), (int)71);
                }
                return this.width;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqr", eolt(int ), (int)72);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqs", eolt(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqt", eolt(int ), (int)74);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqu", eolt(int ), (int)75);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float eope(int n2) {
        return Float.intBitsToFloat(eolu[n2] ^ eolv[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gk$Palette palette() {
        v0 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - mo$ThemeHitbox.eolw("eood", eomc(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 544248298: {
                    break block16;
                }
                case 673933100: {
                    v1 = mo$ThemeHitbox.eolw("eooe", eomc(int ), (int)17);
                    continue block16;
                }
                case 846317492: {
                    v1 = mo$ThemeHitbox.eolw("eoof", eomc(int ), (int)18);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = mo$ThemeHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoog", eomc(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ThemeHitbox.eolw("eooh", eolt(int ), (int)39)) break;
            v2 /* !! */  = (long)mo$ThemeHitbox.eolw("eooi", eolt(int ), (int)40);
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        v3 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - mo$ThemeHitbox.eolw("eooj", eomc(int ), (int)20));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -621746718: {
                    v4 = mo$ThemeHitbox.eolw("eook", eomc(int ), (int)21);
                    continue block18;
                }
                case -239602238: {
                    v4 = mo$ThemeHitbox.eolw("eool", eomc(int ), (int)22);
                    continue block18;
                }
                case 544248298: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eoom", eomc(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$ThemeHitbox.eolw("eoon", eolt(int ), (int)41)) break;
                    v5 /* !! */  = (long)mo$ThemeHitbox.eolw("eooo", eolt(int ), (int)42);
                }
                return this.palette;
            }
lbl51:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoop", eolt(int ), (int)43);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eooq", eolt(int ), (int)44);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoor", eolt(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoos", eolt(int ), (int)46);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ld - mo$ThemeHitbox.eolw("eomf", eomc(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$ThemeHitbox.eolw("eomg", eolt(int ), (int)5)) break;
            object = mo$ThemeHitbox.eolw("eomh", eolt(int ), (int)6);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ld - mo$ThemeHitbox.eolw("eomi", eomc(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$ThemeHitbox.eolw("eomj", eolt(int ), (int)7)) break;
            object = mo$ThemeHitbox.eolw("eomk", eolt(int ), (int)8);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ld - mo$ThemeHitbox.eolw("eoml", eomc(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$ThemeHitbox.eolw("eomm", eolt(int ), (int)9)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = mo$ThemeHitbox.eolw("eomn", eolt(int ), (int)10);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ld - mo$ThemeHitbox.eolw("eomo", eomc(int ), (int)3)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$ThemeHitbox.eolw("eomp", eolt(int ), (int)11)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$ThemeHitbox.class, "palette;x;y;width;height", "palette", "x", "y", "width", "height"}, this);
            }
            object = mo$ThemeHitbox.eolw("eomq", eolt(int ), (int)12);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        v0 /* !! */  = mo$ThemeHitbox.ld;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(mo$ThemeHitbox.eolw("eopo", eomc(int ), (int)35) - mo$ThemeHitbox.eolw("eopn", eomc(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 544248298: {
                    break block10;
                }
                case 1016253184: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = mo$ThemeHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eopp", eomc(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ThemeHitbox.eolw("eopq", eolt(int ), (int)56)) break;
            v1 /* !! */  = (long)mo$ThemeHitbox.eolw("eopr", eolt(int ), (int)57);
        }
        var2_2 /* !! */  = mo$ThemeHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eops", eomc(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ThemeHitbox.eolw("eopt", eolt(int ), (int)58)) break;
            v2 /* !! */  = (long)mo$ThemeHitbox.eolw("eopu", eolt(int ), (int)59);
        }
        var1_3 = mo$ThemeHitbox.a;
        if (var3_1) {
            throw null;
            return (float)mo$ThemeHitbox.eolw("eopv", eope(int ), (int)60);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mo$ThemeHitbox.ld - mo$ThemeHitbox.eolw("eopw", eomc(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$ThemeHitbox.eolw("eopx", eolt(int ), (int)61)) break;
                    v3 /* !! */  = (long)mo$ThemeHitbox.eolw("eopy", eolt(int ), (int)62);
                }
                return this.y;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eopz", eolt(int ), (int)63);
                if (!var3_1) break;
                throw null;
            }
lbl44:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqa", eolt(int ), (int)64);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqb", eolt(int ), (int)65);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mo$ThemeHitbox.eolw("eoqc", eolt(int ), (int)66);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite eolw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

