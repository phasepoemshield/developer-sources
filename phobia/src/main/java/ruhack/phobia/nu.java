/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1799;

public final class nu
extends Record {
    public static final boolean c;
    private static long[] lokm;
    public static final boolean a;
    private final class_1799 stack;
    private static final nu NOT_FOUND;
    private final boolean found;
    private static int[] lokf;
    private final int slot;
    private static long[] lokn;
    private static int[] loke;
    protected static final long ug = 2781532183020593014L;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("looz", lokl(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lopa", lokd(int ), (int)67)) break;
            v0 /* !! */  = (long)nu.lokg("lopb", lokd(int ), (int)68);
        }
        var3_1 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(nu.lokg("lopd", lokl(int ), (int)54) - nu.lokg("lopc", lokl(int ), (int)53));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block11;
                }
                case -719500287: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = nu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("lope", lokl(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nu.lokg("lopf", lokd(int ), (int)69)) break;
            v2 /* !! */  = (long)nu.lokg("lopg", lokd(int ), (int)70);
        }
        var1_3 = nu.a;
        if (var3_1) {
            throw null;
            return (int)nu.lokg("loph", lokd(int ), (int)71);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nu.ug - nu.lokg("lopi", lokl(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nu.lokg("lopj", lokd(int ), (int)72)) break;
                    v3 /* !! */  = (long)nu.lokg("lopk", lokd(int ), (int)73);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nu.class, "slot;found;stack", "slot", "found", "stack"}, this);
            }
lbl40:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)nu.lokg("lopl", lokd(int ), (int)74);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nu.lokg("lopm", lokd(int ), (int)75);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nu.lokg("lopn", lokd(int ), (int)76);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nu.lokg("lopo", lokd(int ), (int)77);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int slot() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ug - nu.lokg("loqg", lokl(int ), (int)63)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nu.lokg("loqh", lokd(int ), (int)89)) break;
            object = nu.lokg("loqi", lokd(int ), (int)90);
        }
        boolean bl2 = c;
        Object object = ug;
        block14: while (true) {
            switch ((int)object) {
                case -2076024970: {
                    break block14;
                }
                case 168074517: {
                    object = nu.lokg("loqk", lokl(int ), (int)65) - nu.lokg("loqj", lokl(int ), (int)64);
                    continue block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object2 = ug;
        boolean bl3 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - nu.lokg("loql", lokl(int ), (int)66);
            }
            switch ((int)object2) {
                case -2076024970: {
                    break block15;
                }
                case -1122006962: {
                    callSite = nu.lokg("loqm", lokl(int ), (int)67);
                    continue block15;
                }
                case -471268810: {
                    callSite = nu.lokg("loqn", lokl(int ), (int)68);
                    continue block15;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return (int)nu.lokg("loqo", lokd(int ), (int)91);
        if (bl4) return (int)nu.lokg("loqo", lokd(int ), (int)91);
        Object object3 = ug;
        block16: while (true) {
            switch ((int)object3) {
                case -2076024970: {
                    return this.slot;
                }
                case -814531326: {
                    object3 = nu.lokg("loqq", lokl(int ), (int)70) - nu.lokg("loqp", lokl(int ), (int)69);
                    continue block16;
                }
            }
            break;
        }
        return this.slot;
    }

    private static /* synthetic */ void losd() {
        nu.lokf[100] = 423982114;
        nu.lokf[101] = -1300480604;
        nu.lokf[102] = -1585688338;
        nu.lokf[103] = -1726562247;
        nu.lokf[104] = 2046835561;
        nu.lokf[105] = 993508970;
        nu.lokf[106] = 1104573106;
        nu.lokf[107] = 1692501592;
        nu.lokf[108] = 171636448;
        nu.lokf[109] = 1156870210;
        nu.lokf[110] = -530219013;
        nu.lokf[111] = -1866268278;
        nu.lokf[112] = -538669126;
    }

    private static /* synthetic */ void losc() {
        nu.lokf[0] = -1971167862;
        nu.lokf[1] = -1062186370;
        nu.lokf[2] = 1180853602;
        nu.lokf[3] = -951226248;
        nu.lokf[4] = -841237923;
        nu.lokf[5] = 0x8B8333;
        nu.lokf[6] = 960764471;
        nu.lokf[7] = -1264062370;
        nu.lokf[8] = -1190620551;
        nu.lokf[9] = -860749740;
        nu.lokf[10] = -156516217;
        nu.lokf[11] = -376255273;
        nu.lokf[12] = -1700703268;
        nu.lokf[13] = 272872711;
        nu.lokf[14] = 1325937309;
        nu.lokf[15] = -1693509016;
        nu.lokf[16] = -58468007;
        nu.lokf[17] = 158153933;
        nu.lokf[18] = 1384797444;
        nu.lokf[19] = 1365623875;
        nu.lokf[20] = 588086823;
        nu.lokf[21] = -1323975442;
        nu.lokf[22] = 1160439034;
        nu.lokf[23] = 1279846335;
        nu.lokf[24] = 548513733;
        nu.lokf[25] = 1200208993;
        nu.lokf[26] = -1129920882;
        nu.lokf[27] = 837814379;
        nu.lokf[28] = 251220593;
        nu.lokf[29] = 14312341;
        nu.lokf[30] = 1830494246;
        nu.lokf[31] = 470239278;
        nu.lokf[32] = 1871748124;
        nu.lokf[33] = 1540703917;
        nu.lokf[34] = -1252965755;
        nu.lokf[35] = 1798756928;
        nu.lokf[36] = -738526917;
        nu.lokf[37] = 1696828153;
        nu.lokf[38] = 297204210;
        nu.lokf[39] = 1909557127;
        nu.lokf[40] = 1889401441;
        nu.lokf[41] = 166680390;
        nu.lokf[42] = 2143332710;
        nu.lokf[43] = -557364513;
        nu.lokf[44] = -1832861386;
        nu.lokf[45] = 851914721;
        nu.lokf[46] = 74480116;
        nu.lokf[47] = 278578440;
        nu.lokf[48] = 368313237;
        nu.lokf[49] = 194870383;
        nu.lokf[50] = 496607239;
        nu.lokf[51] = -362896303;
        nu.lokf[52] = -340720893;
        nu.lokf[53] = -1307547772;
        nu.lokf[54] = -1268586661;
        nu.lokf[55] = 277431170;
        nu.lokf[56] = 1803997220;
        nu.lokf[57] = 1962479059;
        nu.lokf[58] = 815693510;
        nu.lokf[59] = -303829301;
        nu.lokf[60] = -1373977954;
        nu.lokf[61] = -251612658;
        nu.lokf[62] = 1577699570;
        nu.lokf[63] = -1384569066;
        nu.lokf[64] = 395998790;
        nu.lokf[65] = -1679842591;
        nu.lokf[66] = -1674737601;
        nu.lokf[67] = 1293486016;
        nu.lokf[68] = -2084112433;
        nu.lokf[69] = 802746978;
        nu.lokf[70] = 346513958;
        nu.lokf[71] = -18353604;
        nu.lokf[72] = -1456517665;
        nu.lokf[73] = -2071265799;
        nu.lokf[74] = 1366774497;
        nu.lokf[75] = -1899303587;
        nu.lokf[76] = -1498082492;
        nu.lokf[77] = -954890095;
        nu.lokf[78] = 1846933095;
        nu.lokf[79] = -2684393;
        nu.lokf[80] = -1205835815;
        nu.lokf[81] = 1202411997;
        nu.lokf[82] = 1611355769;
        nu.lokf[83] = 523253086;
        nu.lokf[84] = 467350852;
        nu.lokf[85] = 2010277088;
        nu.lokf[86] = 26980957;
        nu.lokf[87] = -383680449;
        nu.lokf[88] = 1430603805;
        nu.lokf[89] = 1515993375;
        nu.lokf[90] = -1575931992;
        nu.lokf[91] = -1893432206;
        nu.lokf[92] = -62893485;
        nu.lokf[93] = 1664729414;
        nu.lokf[94] = 292822482;
        nu.lokf[95] = 912759155;
        nu.lokf[96] = -724661042;
        nu.lokf[97] = 198994560;
        nu.lokf[98] = -387642539;
        nu.lokf[99] = 1056683865;
    }

    private static /* synthetic */ long lokl(int n2) {
        return lokm[n2] ^ lokn[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu of(int var0, class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("lolg", lokl(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lolh", lokd(int ), (int)12)) break;
            v0 /* !! */  = (long)nu.lokg("loli", lokd(int ), (int)13);
        }
        var4_2 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - nu.lokg("lolj", lokl(int ), (int)11));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block18;
                }
                case -701647509: {
                    v2 = nu.lokg("lolk", lokl(int ), (int)12);
                    continue block18;
                }
                case 889996708: {
                    v2 = nu.lokg("loll", lokl(int ), (int)13);
                    continue block18;
                }
                case 1658103876: {
                    v2 = nu.lokg("lolm", lokl(int ), (int)14);
                    continue block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = nu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("loln", lokl(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nu.lokg("lolo", lokd(int ), (int)14)) break;
            v3 /* !! */  = (long)nu.lokg("lolp", lokd(int ), (int)15);
        }
        var2_4 = nu.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v4 /* !! */  = nu.ug;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - nu.lokg("lolq", lokl(int ), (int)16));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2076024970: {
                            break block21;
                        }
                        case -586054817: {
                            v5 = nu.lokg("lolr", lokl(int ), (int)17);
                            continue block21;
                        }
                        case 1956534266: {
                            v5 = nu.lokg("lols", lokl(int ), (int)18);
                            continue block21;
                        }
                    }
                    break;
                }
                v6 = nu.lokg("lolt", lokd(int ), (int)16);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = nu.ug - nu.lokg("lolu", lokl(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nu.lokg("lolv", lokd(int ), (int)17)) break;
                    v7 /* !! */  = (long)nu.lokg("lolw", lokd(int ), (int)18);
                }
                return new nu(var0, (boolean)v6, var1_1);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)nu.lokg("lolx", lokd(int ), (int)19);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nu.lokg("loly", lokd(int ), (int)20);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)nu.lokg("lolz", lokd(int ), (int)21);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nu.lokg("loma", lokd(int ), (int)22);
        ** while (!var4_2)
lbl79:
        // 1 sources

        throw null;
    }

    static {
        loke = new int[113];
        lokf = new int[113];
        nu.losa();
        nu.losb();
        nu.losc();
        nu.losd();
        lokm = new long[85];
        lokn = new long[85];
        nu.lose();
        nu.losf();
        NOT_FOUND = new nu(-1, false, class_1799.field_8037);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 stack() {
        v0 /* !! */  = nu.ug;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(nu.lokg("loro", lokl(int ), (int)79) - nu.lokg("lorn", lokl(int ), (int)78));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2076024970: {
                    break block18;
                }
                case 766207354: {
                    continue block18;
                }
            }
            break;
        }
        var3_1 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(nu.lokg("lorq", lokl(int ), (int)81) - nu.lokg("lorp", lokl(int ), (int)80));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block19;
                }
                case 1124375929: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = nu.b;
        v2 /* !! */  = nu.ug;
        if (true) ** GOTO lbl25
        block20: while (true) {
            v2 /* !! */  = (long)(nu.lokg("lors", lokl(int ), (int)83) - nu.lokg("lorr", lokl(int ), (int)82));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2076024970: {
                    break block20;
                }
                case 2132095593: {
                    continue block20;
                }
            }
            break;
        }
        var1_3 = nu.a;
        if (var3_1) {
            throw null;
lbl33:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("lort", lokl(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nu.lokg("loru", lokd(int ), (int)107)) break;
                    v3 /* !! */  = (long)nu.lokg("lorv", lokd(int ), (int)108);
                }
                return this.stack;
            }
            case 0: {
                var2_2 /* !! */  = (int)nu.lokg("lorw", lokd(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nu.lokg("lorx", lokd(int ), (int)110);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nu.lokg("lory", lokd(int ), (int)111);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nu.lokg("lorz", lokd(int ), (int)112);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lose() {
        nu.lokm[0] = -8292037481860283006L;
        nu.lokm[1] = -8823847658692467718L;
        nu.lokm[2] = 38250675531073489L;
        nu.lokm[3] = -4498535283922290062L;
        nu.lokm[4] = -3649091333396235194L;
        nu.lokm[5] = 8355769971402897224L;
        nu.lokm[6] = 4777663976838740672L;
        nu.lokm[7] = -6154329877344264815L;
        nu.lokm[8] = 2986812614298569552L;
        nu.lokm[9] = -6274569089733182264L;
        nu.lokm[10] = -7807398651212304706L;
        nu.lokm[11] = 6635481351381500502L;
        nu.lokm[12] = 1924607962673542941L;
        nu.lokm[13] = -2295264221885127127L;
        nu.lokm[14] = -3936356498345045247L;
        nu.lokm[15] = 4418735039215074908L;
        nu.lokm[16] = 7344296420780952162L;
        nu.lokm[17] = 4325831470172600451L;
        nu.lokm[18] = -3621552293527792639L;
        nu.lokm[19] = -3415958525572735859L;
        nu.lokm[20] = 6170286080995782574L;
        nu.lokm[21] = 7208025767128695823L;
        nu.lokm[22] = 1806895233134979213L;
        nu.lokm[23] = -1195257386147148849L;
        nu.lokm[24] = 2680052494172625501L;
        nu.lokm[25] = 219215415545165757L;
        nu.lokm[26] = -2786237380361241355L;
        nu.lokm[27] = 7421484712883931295L;
        nu.lokm[28] = -8429005282273698230L;
        nu.lokm[29] = 8790222904624563466L;
        nu.lokm[30] = -8145237815097978448L;
        nu.lokm[31] = 2257024855069364794L;
        nu.lokm[32] = 3448561744599313923L;
        nu.lokm[33] = -4693033305058560479L;
        nu.lokm[34] = -467134791685968050L;
        nu.lokm[35] = -6056344926668795094L;
        nu.lokm[36] = -5793436086209392259L;
        nu.lokm[37] = 777423573670466510L;
        nu.lokm[38] = 4344905354815852797L;
        nu.lokm[39] = -24107900973483489L;
        nu.lokm[40] = -1009127692917822926L;
        nu.lokm[41] = 2215813498565514061L;
        nu.lokm[42] = 6364931761308010390L;
        nu.lokm[43] = -2228756686294341516L;
        nu.lokm[44] = 7267344993221636139L;
        nu.lokm[45] = -9075333356982961691L;
        nu.lokm[46] = -2675486928700495896L;
        nu.lokm[47] = -7535430374286346228L;
        nu.lokm[48] = 6340774118036801369L;
        nu.lokm[49] = 3820314744567344097L;
        nu.lokm[50] = -841183751542749340L;
        nu.lokm[51] = 5381101645758839634L;
        nu.lokm[52] = 8844757514993215088L;
        nu.lokm[53] = -5215896196430095304L;
        nu.lokm[54] = -5825489701545732419L;
        nu.lokm[55] = 821846060732619592L;
        nu.lokm[56] = -40238742480568535L;
        nu.lokm[57] = 1251406839993013548L;
        nu.lokm[58] = 261295333968766709L;
        nu.lokm[59] = 6057367010260209661L;
        nu.lokm[60] = 8107953326828554981L;
        nu.lokm[61] = -5703567057301542049L;
        nu.lokm[62] = -4034362648672664478L;
        nu.lokm[63] = 6978094576722148176L;
        nu.lokm[64] = -1546633991719731483L;
        nu.lokm[65] = 2256452090390920094L;
        nu.lokm[66] = 2729138978617552929L;
        nu.lokm[67] = 8997022725109330210L;
        nu.lokm[68] = -3161582008863708386L;
        nu.lokm[69] = 5331097228619682097L;
        nu.lokm[70] = 5539353634425904400L;
        nu.lokm[71] = 6562647077968309627L;
        nu.lokm[72] = 5754035847277859368L;
        nu.lokm[73] = -9028593493359285365L;
        nu.lokm[74] = -2631808784969111531L;
        nu.lokm[75] = 7935895276180309886L;
        nu.lokm[76] = -6068334742277956284L;
        nu.lokm[77] = 8129307713085418329L;
        nu.lokm[78] = 5664433989577678254L;
        nu.lokm[79] = -4065828944928320071L;
        nu.lokm[80] = 4497007877940620559L;
        nu.lokm[81] = 1515462418272858709L;
        nu.lokm[82] = -4129041608655116938L;
        nu.lokm[83] = -5287524641305828704L;
        nu.lokm[84] = 275875572901559216L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = nu.ug;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - nu.lokg("looi", lokl(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2076024970: {
                    break block22;
                }
                case -980276091: {
                    v1 = nu.lokg("looj", lokl(int ), (int)42);
                    continue block22;
                }
                case -940447910: {
                    v1 = nu.lokg("look", lokl(int ), (int)43);
                    continue block22;
                }
                case 1120180568: {
                    v1 = nu.lokg("lool", lokl(int ), (int)44);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = nu.c;
        v2 /* !! */  = nu.ug;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(nu.lokg("loon", lokl(int ), (int)46) - nu.lokg("loom", lokl(int ), (int)45));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2076024970: {
                    break block23;
                }
                case -94082905: {
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = nu.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = nu.ug;
                if (true) ** GOTO lbl35
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - nu.lokg("looo", lokl(int ), (int)47));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2076024970: {
                            break block24;
                        }
                        case 65631552: {
                            v4 = nu.lokg("loop", lokl(int ), (int)48);
                            continue block24;
                        }
                        case 1243780859: {
                            v4 = nu.lokg("looq", lokl(int ), (int)49);
                            continue block24;
                        }
                        case 1802275571: {
                            v4 = nu.lokg("loor", lokl(int ), (int)50);
                            continue block24;
                        }
                    }
                    break;
                }
                var1_3 = nu.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("loos", lokl(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == nu.lokg("loot", lokd(int ), (int)61)) break;
                    v5 /* !! */  = (long)nu.lokg("loou", lokd(int ), (int)62);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{nu.class, "slot;found;stack", "slot", "found", "stack"}, this);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)nu.lokg("loov", lokd(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nu.lokg("loow", lokd(int ), (int)64);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)nu.lokg("loox", lokd(int ), (int)65);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nu.lokg("looy", lokd(int ), (int)66);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void losb() {
        nu.loke[100] = -423982115;
        nu.loke[101] = -427633541;
        nu.loke[102] = -1585688337;
        nu.loke[103] = -1726562245;
        nu.loke[104] = 2046835560;
        nu.loke[105] = 993508971;
        nu.loke[106] = 1104573106;
        nu.loke[107] = -1692501593;
        nu.loke[108] = 1385236903;
        nu.loke[109] = 1156870210;
        nu.loke[110] = -530219016;
        nu.loke[111] = -1866268280;
        nu.loke[112] = -538669128;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static nu notFound() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("loko", lokl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lokp", lokd(int ), (int)4)) break;
            v0 /* !! */  = (long)nu.lokg("lokq", lokd(int ), (int)5);
        }
        var2 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - nu.lokg("lokr", lokl(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block19;
                }
                case -1768682934: {
                    v2 = nu.lokg("loks", lokl(int ), (int)2);
                    continue block19;
                }
                case -533844952: {
                    v2 = nu.lokg("lokt", lokl(int ), (int)3);
                    continue block19;
                }
                case 481284815: {
                    v2 = nu.lokg("loku", lokl(int ), (int)4);
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = nu.b;
        v3 /* !! */  = nu.ug;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - nu.lokg("lokv", lokl(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2130331688: {
                    v4 = nu.lokg("lokw", lokl(int ), (int)6);
                    continue block20;
                }
                case -2076024970: {
                    break block20;
                }
                case -1527627751: {
                    v4 = nu.lokg("lokx", lokl(int ), (int)7);
                    continue block20;
                }
                case 139087632: {
                    v4 = nu.lokg("loky", lokl(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        var0_2 = nu.a;
        if (!var2) ** GOTO lbl48
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl48:
                // 1 sources

                if (var0_2 || var0_2) continue block21;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("lokz", lokl(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == nu.lokg("lola", lokd(int ), (int)6)) break;
                    v5 /* !! */  = (long)nu.lokg("lolb", lokd(int ), (int)7);
                }
                return nu.NOT_FOUND;
                case 0: {
                    var1_1 /* !! */  = (int)nu.lokg("lolc", lokd(int ), (int)8);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var1_1 /* !! */  = (int)nu.lokg("lold", lokd(int ), (int)9);
                    } while (!var2);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)nu.lokg("lole", lokd(int ), (int)10);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)nu.lokg("lolf", lokd(int ), (int)11);
        ** while (!var2)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isHotbar() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("lomb", lokl(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lomc", lokd(int ), (int)23)) break;
            v0 /* !! */  = (long)nu.lokg("lomd", lokd(int ), (int)24);
        }
        var3_1 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl12
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - nu.lokg("lome", lokl(int ), (int)21));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block30;
                }
                case -1021647056: {
                    v2 = nu.lokg("lomf", lokl(int ), (int)22);
                    continue block30;
                }
                case -643708725: {
                    v2 = nu.lokg("lomg", lokl(int ), (int)23);
                    continue block30;
                }
                case 1557255909: {
                    v2 = nu.lokg("lomh", lokl(int ), (int)24);
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = nu.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("lomi", lokl(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nu.lokg("lomj", lokd(int ), (int)25)) break;
            v3 /* !! */  = (long)nu.lokg("lomk", lokd(int ), (int)26);
        }
        var1_3 = nu.a;
        if (var3_1) {
            throw null;
lbl34:
            // 5 sources

            return (boolean)nu.lokg("loml", lokd(int ), (int)27);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
                v4 /* !! */  = nu.ug;
                if (true) ** GOTO lbl45
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - nu.lokg("lomm", lokl(int ), (int)26));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2076024970: {
                            break block33;
                        }
                        case -620655138: {
                            v5 = nu.lokg("lomn", lokl(int ), (int)27);
                            continue block33;
                        }
                        case -534816531: {
                            v5 = nu.lokg("lomo", lokl(int ), (int)28);
                            continue block33;
                        }
                        case -432761555: {
                            v5 = nu.lokg("lomp", lokl(int ), (int)29);
                            continue block33;
                        }
                    }
                    break;
                }
                if (this.slot < 0) ** GOTO lbl81
                if (var1_3) ** GOTO lbl34
                v6 /* !! */  = nu.ug;
                if (true) ** GOTO lbl63
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - nu.lokg("lomq", lokl(int ), (int)30));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2076024970: {
                            break block34;
                        }
                        case -1698695613: {
                            v7 = nu.lokg("lomr", lokl(int ), (int)31);
                            continue block34;
                        }
                        case -943067148: {
                            v7 = nu.lokg("loms", lokl(int ), (int)32);
                            continue block34;
                        }
                        case 21908335: {
                            v7 = nu.lokg("lomt", lokl(int ), (int)33);
                            continue block34;
                        }
                    }
                    break;
                }
                if (this.slot >= nu.lokg("lomu", lokd(int ), (int)28)) ** GOTO lbl81
                if (var1_3) ** GOTO lbl34
                v8 = nu.lokg("lomv", lokd(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
lbl81:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = nu.lokg("lomw", lokd(int ), (int)30);
lbl84:
                // 2 sources

                return (boolean)v8;
            }
            case 0: {
                var2_2 /* !! */  = (int)nu.lokg("lomx", lokd(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl90:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nu.lokg("lomy", lokd(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 2: {
                var2_2 /* !! */  = (int)nu.lokg("lomz", lokd(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 3: {
                var2_2 /* !! */  = (int)nu.lokg("lona", lokd(int ), (int)34);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
lbl104:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nu.lokg("lonb", lokd(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
            }
lbl108:
            // 5 sources

            case 5: {
                var2_2 /* !! */  = (int)nu.lokg("lonc", lokd(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nu.lokg("lond", lokd(int ), (int)37);
                    if (!var3_1) ** GOTO lbl104
                    throw null;
                }
            }
lbl118:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)nu.lokg("lone", lokd(int ), (int)38);
                if (!var3_1) break;
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)nu.lokg("lonf", lokd(int ), (int)39);
        ** while (!var3_1)
lbl125:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lokd(int n2) {
        return loke[n2] ^ lokf[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("lopp", lokl(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lopq", lokd(int ), (int)78)) break;
            v0 /* !! */  = (long)nu.lokg("lopr", lokd(int ), (int)79);
        }
        var4_2 = nu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("lops", lokl(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nu.lokg("lopt", lokd(int ), (int)80)) break;
            v1 /* !! */  = (long)nu.lokg("lopu", lokd(int ), (int)81);
        }
        var3_3 /* !! */  = nu.b;
        v2 /* !! */  = nu.ug;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - nu.lokg("lopv", lokl(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2076024970: {
                    break block13;
                }
                case 412359881: {
                    v3 = nu.lokg("lopw", lokl(int ), (int)60);
                    continue block13;
                }
                case 743887379: {
                    v3 = nu.lokg("lopx", lokl(int ), (int)61);
                    continue block13;
                }
            }
            break;
        }
        var2_4 = nu.a;
        if (var4_2) {
            throw null;
            return (boolean)nu.lokg("lopy", lokd(int ), (int)82);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = nu.ug - nu.lokg("lopz", lokl(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nu.lokg("loqa", lokd(int ), (int)83)) break;
                    v4 /* !! */  = (long)nu.lokg("loqb", lokd(int ), (int)84);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nu.class, "slot;found;stack", "slot", "found", "stack"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)nu.lokg("loqc", lokd(int ), (int)85);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)nu.lokg("loqd", lokd(int ), (int)86);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)nu.lokg("loqe", lokd(int ), (int)87);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nu.lokg("loqf", lokd(int ), (int)88);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public nu(int var1_1, boolean var2_2, class_1799 var3_3) {
        var5_4 /* !! */  = nu.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.slot = var1_1;
                this.found = var2_2;
                this.stack = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)nu.lokg("lokh", lokd(int ), (int)0);
                break;
            }
            case 1: {
                while (true) {
                    var5_4 /* !! */  = (int)nu.lokg("loki", lokd(int ), (int)1);
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)nu.lokg("lokj", lokd(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)nu.lokg("lokk", lokd(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean found() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("loqv", lokl(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("loqw", lokd(int ), (int)96)) break;
            v0 /* !! */  = (long)nu.lokg("loqx", lokd(int ), (int)97);
        }
        var3_1 = nu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("loqy", lokl(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nu.lokg("loqz", lokd(int ), (int)98)) break;
            v1 /* !! */  = (long)nu.lokg("lora", lokd(int ), (int)99);
        }
        var2_2 /* !! */  = nu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nu.ug - nu.lokg("lorb", lokl(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nu.lokg("lorc", lokd(int ), (int)100)) break;
            v2 /* !! */  = (long)nu.lokg("lord", lokd(int ), (int)101);
        }
        var1_3 = nu.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return (boolean)nu.lokg("lore", lokd(int ), (int)102);
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = nu.ug;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - nu.lokg("lorf", lokl(int ), (int)74));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2076024970: {
                            break block16;
                        }
                        case -1929967224: {
                            v4 = nu.lokg("lorg", lokl(int ), (int)75);
                            continue block16;
                        }
                        case -555863994: {
                            v4 = nu.lokg("lorh", lokl(int ), (int)76);
                            continue block16;
                        }
                        case 1419452619: {
                            v4 = nu.lokg("lori", lokl(int ), (int)77);
                            continue block16;
                        }
                    }
                    break;
                }
                return this.found;
            }
            case 0: {
                var2_2 /* !! */  = (int)nu.lokg("lorj", lokd(int ), (int)103);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nu.lokg("lork", lokd(int ), (int)104);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nu.lokg("lorl", lokd(int ), (int)105);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nu.lokg("lorm", lokd(int ), (int)106);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lokg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void losf() {
        nu.lokn[0] = -29434665359270970L;
        nu.lokn[1] = -1485779078572671279L;
        nu.lokn[2] = 3622924373312341376L;
        nu.lokn[3] = -1944112507718479294L;
        nu.lokn[4] = -1959015229836668076L;
        nu.lokn[5] = -6217437921053319067L;
        nu.lokn[6] = 2253788248737639010L;
        nu.lokn[7] = -5598278085501309271L;
        nu.lokn[8] = -8240869059197157203L;
        nu.lokn[9] = -5032317131793479605L;
        nu.lokn[10] = 959503334163013317L;
        nu.lokn[11] = -2046237565345878769L;
        nu.lokn[12] = 258807144832382719L;
        nu.lokn[13] = 4900699504384202184L;
        nu.lokn[14] = -2202516217630533435L;
        nu.lokn[15] = -3348844659312063588L;
        nu.lokn[16] = -869333232610186367L;
        nu.lokn[17] = 2339382553748997460L;
        nu.lokn[18] = 6773847428369780270L;
        nu.lokn[19] = 4819375961757765194L;
        nu.lokn[20] = 5695766432507153469L;
        nu.lokn[21] = -4450359668580277092L;
        nu.lokn[22] = -6758917355486832657L;
        nu.lokn[23] = -6930245560381498082L;
        nu.lokn[24] = 3919677720126367138L;
        nu.lokn[25] = -5507280410411212377L;
        nu.lokn[26] = 1443439606802630628L;
        nu.lokn[27] = 6280867875607430363L;
        nu.lokn[28] = -8809960088011359832L;
        nu.lokn[29] = 445204957539676330L;
        nu.lokn[30] = -2975821967548394048L;
        nu.lokn[31] = 5925352986263551223L;
        nu.lokn[32] = 7011666524251808072L;
        nu.lokn[33] = 5250181811251646295L;
        nu.lokn[34] = -5395341337169821128L;
        nu.lokn[35] = -4112018593513814601L;
        nu.lokn[36] = 1798494870855096670L;
        nu.lokn[37] = 2198685609886702526L;
        nu.lokn[38] = -4367576513829534554L;
        nu.lokn[39] = 7131311203203888789L;
        nu.lokn[40] = 5763190898394800782L;
        nu.lokn[41] = 9098208991902843496L;
        nu.lokn[42] = 1078446225326610834L;
        nu.lokn[43] = -3591542342133494416L;
        nu.lokn[44] = -4430817344346864532L;
        nu.lokn[45] = 4536055477689260450L;
        nu.lokn[46] = 3456897114509963660L;
        nu.lokn[47] = 5192305578710460578L;
        nu.lokn[48] = 6121434053610529576L;
        nu.lokn[49] = -7987843101100409486L;
        nu.lokn[50] = -6607747726006342033L;
        nu.lokn[51] = -1137614009302259143L;
        nu.lokn[52] = -7005529599875948461L;
        nu.lokn[53] = -925662203871198963L;
        nu.lokn[54] = -5414617252967765727L;
        nu.lokn[55] = -3795576847744200237L;
        nu.lokn[56] = 8034452237027230421L;
        nu.lokn[57] = 5401190141596545486L;
        nu.lokn[58] = -8971195304562000756L;
        nu.lokn[59] = 1486109553313732669L;
        nu.lokn[60] = -6224917739131053749L;
        nu.lokn[61] = -8847741940858698048L;
        nu.lokn[62] = 4752977601505299607L;
        nu.lokn[63] = 8435665640184028240L;
        nu.lokn[64] = -8279612870308163081L;
        nu.lokn[65] = -6450661816548097889L;
        nu.lokn[66] = 9047484399828129401L;
        nu.lokn[67] = 9033418911185520375L;
        nu.lokn[68] = 2968934284170680927L;
        nu.lokn[69] = 977869638037394625L;
        nu.lokn[70] = 5627746485608367808L;
        nu.lokn[71] = -1274097413111243462L;
        nu.lokn[72] = -935377623297654428L;
        nu.lokn[73] = -1268713444737820097L;
        nu.lokn[74] = -1746717392505683154L;
        nu.lokn[75] = 2308098295256284609L;
        nu.lokn[76] = 953657678611907889L;
        nu.lokn[77] = 3798338905965892390L;
        nu.lokn[78] = 3104106776248367001L;
        nu.lokn[79] = -6051987358136313765L;
        nu.lokn[80] = -8741448069075848108L;
        nu.lokn[81] = 7182644923773351518L;
        nu.lokn[82] = -5191541097775092358L;
        nu.lokn[83] = 405849369236466532L;
        nu.lokn[84] = 5197524417515109635L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int toScreenSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nu.ug - nu.lokg("long", lokl(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nu.lokg("lonh", lokd(int ), (int)40)) break;
            v0 /* !! */  = (long)nu.lokg("loni", lokd(int ), (int)41);
        }
        var3_1 = nu.c;
        v1 /* !! */  = nu.ug;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(nu.lokg("lonk", lokl(int ), (int)36) - nu.lokg("lonj", lokl(int ), (int)35));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2076024970: {
                    break block15;
                }
                case -482222544: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = nu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nu.ug - nu.lokg("lonl", lokl(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nu.lokg("lonm", lokd(int ), (int)42)) break;
            v2 /* !! */  = (long)nu.lokg("lonn", lokd(int ), (int)43);
        }
        var1_3 = nu.a;
        if (var3_1) {
            throw null;
lbl27:
            // 4 sources

            return (int)nu.lokg("lono", lokd(int ), (int)44);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nu.ug - nu.lokg("lonp", lokl(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nu.lokg("lonq", lokd(int ), (int)45)) break;
                    v3 /* !! */  = (long)nu.lokg("lonr", lokd(int ), (int)46);
                }
                if (this.slot >= nu.lokg("lons", lokd(int ), (int)47)) ** GOTO lbl52
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = nu.ug - nu.lokg("lont", lokl(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nu.lokg("lonu", lokd(int ), (int)48)) break;
                    v4 /* !! */  = (long)nu.lokg("lonv", lokd(int ), (int)49);
                }
                v5 = this.slot + nu.lokg("lonw", lokd(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
lbl52:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = nu.ug - nu.lokg("lonx", lokl(int ), (int)40)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nu.lokg("lony", lokd(int ), (int)51)) {
                        v5 = this.slot;
                        break;
                    }
                    v6 /* !! */  = (long)nu.lokg("lonz", lokd(int ), (int)52);
                }
lbl62:
                // 2 sources

                return v5;
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nu.lokg("looa", lokd(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl68:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nu.lokg("loob", lokd(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nu.lokg("looc", lokd(int ), (int)55);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl87
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)nu.lokg("lood", lokd(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 4: {
                var2_2 /* !! */  = (int)nu.lokg("looe", lokd(int ), (int)57);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl87:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)nu.lokg("loof", lokd(int ), (int)58);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl91:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)nu.lokg("loog", lokd(int ), (int)59);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)nu.lokg("looh", lokd(int ), (int)60);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void losa() {
        nu.loke[0] = -1971167864;
        nu.loke[1] = -1062186372;
        nu.loke[2] = 1180853603;
        nu.loke[3] = -951226248;
        nu.loke[4] = 841237922;
        nu.loke[5] = -1396251144;
        nu.loke[6] = 960764470;
        nu.loke[7] = -1351157428;
        nu.loke[8] = -1190620551;
        nu.loke[9] = -860749737;
        nu.loke[10] = -156516217;
        nu.loke[11] = -376255274;
        nu.loke[12] = -1700703267;
        nu.loke[13] = -1699425668;
        nu.loke[14] = 1325937308;
        nu.loke[15] = -1456567526;
        nu.loke[16] = -58468008;
        nu.loke[17] = 158153932;
        nu.loke[18] = -1554722004;
        nu.loke[19] = 1365623872;
        nu.loke[20] = 588086820;
        nu.loke[21] = -1323975441;
        nu.loke[22] = 1160439033;
        nu.loke[23] = 1279846334;
        nu.loke[24] = 2002246809;
        nu.loke[25] = 1200208992;
        nu.loke[26] = -1503574118;
        nu.loke[27] = 837814378;
        nu.loke[28] = 251220600;
        nu.loke[29] = 14312340;
        nu.loke[30] = 1830494246;
        nu.loke[31] = 470239276;
        nu.loke[32] = 1871748123;
        nu.loke[33] = 1540703918;
        nu.loke[34] = -1252965757;
        nu.loke[35] = 1798756930;
        nu.loke[36] = -738526914;
        nu.loke[37] = 1696828155;
        nu.loke[38] = 297204213;
        nu.loke[39] = 1909557123;
        nu.loke[40] = -1889401442;
        nu.loke[41] = -1806336560;
        nu.loke[42] = 2143332711;
        nu.loke[43] = 1896972968;
        nu.loke[44] = 843424136;
        nu.loke[45] = 851914720;
        nu.loke[46] = 1492682368;
        nu.loke[47] = 278578433;
        nu.loke[48] = 368313236;
        nu.loke[49] = 1285971139;
        nu.loke[50] = 496607267;
        nu.loke[51] = -362896304;
        nu.loke[52] = -1873699571;
        nu.loke[53] = -1307547776;
        nu.loke[54] = -1268586658;
        nu.loke[55] = 277431174;
        nu.loke[56] = 1803997223;
        nu.loke[57] = 1962479062;
        nu.loke[58] = 815693504;
        nu.loke[59] = -303829304;
        nu.loke[60] = -1373977955;
        nu.loke[61] = -251612657;
        nu.loke[62] = 944004759;
        nu.loke[63] = -1384569067;
        nu.loke[64] = 395998790;
        nu.loke[65] = -1679842589;
        nu.loke[66] = -1674737604;
        nu.loke[67] = 1293486017;
        nu.loke[68] = -146107182;
        nu.loke[69] = 802746979;
        nu.loke[70] = -1971058638;
        nu.loke[71] = -307867897;
        nu.loke[72] = -1456517666;
        nu.loke[73] = -704046390;
        nu.loke[74] = 1366774499;
        nu.loke[75] = -1899303586;
        nu.loke[76] = -1498082489;
        nu.loke[77] = -954890096;
        nu.loke[78] = -1846933096;
        nu.loke[79] = 1488367693;
        nu.loke[80] = -1205835816;
        nu.loke[81] = 1767489099;
        nu.loke[82] = 1611355768;
        nu.loke[83] = 523253087;
        nu.loke[84] = 370554108;
        nu.loke[85] = 2010277090;
        nu.loke[86] = 26980958;
        nu.loke[87] = -383680449;
        nu.loke[88] = 1430603806;
        nu.loke[89] = 1515993374;
        nu.loke[90] = -1087756492;
        nu.loke[91] = 1329132531;
        nu.loke[92] = -62893488;
        nu.loke[93] = 1664729414;
        nu.loke[94] = 292822480;
        nu.loke[95] = 912759154;
        nu.loke[96] = -724661041;
        nu.loke[97] = 374111590;
        nu.loke[98] = -387642540;
        nu.loke[99] = -2022152670;
    }
}

