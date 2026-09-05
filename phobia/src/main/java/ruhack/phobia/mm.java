/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ruhack.phobia.px
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.mm$Entry;
import ruhack.phobia.mm$Item;
import ruhack.phobia.px;

public final class mm {
    private static int[] hcfy = new int[324];
    public static final boolean a;
    private static int[] hcfz;
    private static final Map<String, mm$Entry> ENTRIES;
    private static long[] hcgf;
    private static long[] hcgg;
    public static final boolean c;
    public static final int b;
    public static final long ob = -6767502251956225315L;

    private static /* synthetic */ void helw() {
        mm.hcgf[0] = -7535478516929121213L;
        mm.hcgf[1] = -7691048836281541761L;
        mm.hcgf[2] = -3156116064094427794L;
        mm.hcgf[3] = 6790539017391835409L;
        mm.hcgf[4] = -4832206394976296338L;
        mm.hcgf[5] = 7563349001584163929L;
        mm.hcgf[6] = 3957533623113796696L;
        mm.hcgf[7] = -2370171140481808256L;
        mm.hcgf[8] = 2494825942631569818L;
        mm.hcgf[9] = 3454203636696587847L;
        mm.hcgf[10] = 4232385699213941955L;
        mm.hcgf[11] = 8329028766966665897L;
        mm.hcgf[12] = -2544816985086581968L;
        mm.hcgf[13] = -1784025232244533837L;
        mm.hcgf[14] = -8067716219693909041L;
        mm.hcgf[15] = -7658862149459476287L;
        mm.hcgf[16] = 7456070776611344128L;
        mm.hcgf[17] = 876692866541958366L;
        mm.hcgf[18] = 8180161212474926614L;
        mm.hcgf[19] = -5944533510911978639L;
        mm.hcgf[20] = -2512316570778280714L;
        mm.hcgf[21] = 4943525702462681520L;
        mm.hcgf[22] = 2736019682507038189L;
        mm.hcgf[23] = -6808562020552845669L;
        mm.hcgf[24] = 3871798435059654313L;
        mm.hcgf[25] = 88397107426945244L;
        mm.hcgf[26] = 1163497599540142558L;
        mm.hcgf[27] = -9104229644632036L;
        mm.hcgf[28] = -7972874709158980625L;
        mm.hcgf[29] = 847497587712628917L;
        mm.hcgf[30] = -5260957891007147572L;
        mm.hcgf[31] = 5645430500775138225L;
        mm.hcgf[32] = 1456574743869341389L;
        mm.hcgf[33] = 8804861648408738972L;
        mm.hcgf[34] = -3462829663263084298L;
        mm.hcgf[35] = -4030370434110828690L;
        mm.hcgf[36] = 5797569323260229209L;
        mm.hcgf[37] = 6993816758061497524L;
        mm.hcgf[38] = 5192920234173637218L;
        mm.hcgf[39] = 5242638451588979214L;
        mm.hcgf[40] = 6301854394051653521L;
        mm.hcgf[41] = -3368550130540840866L;
        mm.hcgf[42] = 5901551160166420505L;
        mm.hcgf[43] = 1980810230160916559L;
        mm.hcgf[44] = -8961790727830307494L;
        mm.hcgf[45] = 7990478056218747270L;
        mm.hcgf[46] = 2394144474288484123L;
        mm.hcgf[47] = -3094531008146650875L;
        mm.hcgf[48] = -1232823245919978175L;
        mm.hcgf[49] = 8848924741779229332L;
        mm.hcgf[50] = 789723138109821401L;
        mm.hcgf[51] = 5300157092837949411L;
        mm.hcgf[52] = -7886772041751319553L;
        mm.hcgf[53] = 5890738778454132501L;
        mm.hcgf[54] = -8927052401376861765L;
        mm.hcgf[55] = 2371435502666854930L;
        mm.hcgf[56] = -7651619172731633498L;
        mm.hcgf[57] = -840880578757410921L;
        mm.hcgf[58] = 3375853822413976772L;
        mm.hcgf[59] = 5536955086584737541L;
        mm.hcgf[60] = -8511902154873110128L;
        mm.hcgf[61] = -6604298590961075057L;
        mm.hcgf[62] = 883625528121958586L;
        mm.hcgf[63] = 6704691952935721386L;
        mm.hcgf[64] = -9159665138322676431L;
        mm.hcgf[65] = -8781021073768425298L;
        mm.hcgf[66] = 643840699233319522L;
        mm.hcgf[67] = 8991502240842939568L;
        mm.hcgf[68] = 1020668790508770787L;
        mm.hcgf[69] = -6712798841855492466L;
        mm.hcgf[70] = -2276045963261938942L;
        mm.hcgf[71] = -8100164689611867126L;
        mm.hcgf[72] = 5580367307149643864L;
        mm.hcgf[73] = 84029573892548452L;
        mm.hcgf[74] = 4595134754002817380L;
        mm.hcgf[75] = 2587651250821046661L;
        mm.hcgf[76] = 1400345047412776448L;
        mm.hcgf[77] = -6348081836255389742L;
        mm.hcgf[78] = -7179755837469967419L;
        mm.hcgf[79] = 554837641191317416L;
        mm.hcgf[80] = -7584689147083990012L;
        mm.hcgf[81] = -1121489281716893235L;
        mm.hcgf[82] = 1774516195253840019L;
        mm.hcgf[83] = -9105062833701157188L;
        mm.hcgf[84] = -2187945948150351759L;
        mm.hcgf[85] = -6857156782038346919L;
        mm.hcgf[86] = -4274122500538580226L;
        mm.hcgf[87] = -8938932098362269677L;
        mm.hcgf[88] = -1458022381785088199L;
        mm.hcgf[89] = -9158306122435571967L;
        mm.hcgf[90] = 8126977324066332423L;
        mm.hcgf[91] = -5900560861956819234L;
        mm.hcgf[92] = 1181586880120812865L;
        mm.hcgf[93] = 7291562664218844000L;
        mm.hcgf[94] = -25444408052814320L;
        mm.hcgf[95] = -4036416903215607273L;
        mm.hcgf[96] = -3951014076062375368L;
        mm.hcgf[97] = -7478655074540292444L;
        mm.hcgf[98] = -8028248655678222265L;
        mm.hcgf[99] = -7076875910638289947L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String section(ds var0) {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hchr", hcge(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1082246435: {
                    break block26;
                }
                case 107586051: {
                    v1 = mm.hcga("hchs", hcge(int ), (int)17);
                    continue block26;
                }
                case 128255818: {
                    v1 = mm.hcga("hcht", hcge(int ), (int)18);
                    continue block26;
                }
                case 1339292439: {
                    v1 = mm.hcga("hchu", hcge(int ), (int)19);
                    continue block26;
                }
            }
            break;
        }
        var4_1 = mm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hchv", hcge(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mm.hcga("hchw", hcfx(int ), (int)23)) break;
            v2 /* !! */  = (long)mm.hcga("hchx", hcfx(int ), (int)24);
        }
        var3_2 /* !! */  = mm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hchy", hcge(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mm.hcga("hchz", hcfx(int ), (int)25)) break;
            v3 /* !! */  = (long)mm.hcga("hcia", hcfx(int ), (int)26);
        }
        var2_3 = mm.a;
        if (var4_1) {
            throw null;
lbl32:
            // 5 sources

            return null;
        }
        if (var2_3) ** GOTO lbl32
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcib", hcge(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == mm.hcga("hcic", hcfx(int ), (int)27)) break;
                    v4 /* !! */  = (long)mm.hcga("hcid", hcfx(int ), (int)28);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcie", hcge(int ), (int)23)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mm.hcga("hcif", hcfx(int ), (int)29)) break;
                    v5 /* !! */  = (long)mm.hcga("hcig", hcfx(int ), (int)30);
                }
                v6 = var0.getName();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hcih", hcge(int ), (int)24)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mm.hcga("hcii", hcfx(int ), (int)31)) break;
                    v7 /* !! */  = (long)mm.hcga("hcij", hcfx(int ), (int)32);
                }
                var1_4 = mm.ENTRIES.get(v6);
                if (var2_3 || var2_3) ** GOTO lbl32
                if (var1_4 != null) ** GOTO lbl78
                if (var2_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = mm.ob - mm.hcga("hcik", hcge(int ), (int)25)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mm.hcga("hcil", hcfx(int ), (int)33)) break;
                    v8 /* !! */  = (long)mm.hcga("hcim", hcfx(int ), (int)34);
                }
                v9 = var0.getCategory();
                v10 /* !! */  = mm.ob;
                if (true) ** GOTO lbl69
                block34: while (true) {
                    v10 /* !! */  = (long)(mm.hcga("hcio", hcge(int ), (int)27) - mm.hcga("hcin", hcge(int ), (int)26));
lbl69:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1082246435: {
                            break block34;
                        }
                        case 409606996: {
                            continue block34;
                        }
                    }
                    break;
                }
                v11 = v9.getReadableName();
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl90
lbl78:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v12 /* !! */  = mm.ob;
                if (true) ** GOTO lbl84
                block35: while (true) {
                    v12 /* !! */  = (long)(mm.hcga("hciq", hcge(int ), (int)29) - mm.hcga("hcip", hcge(int ), (int)28));
lbl84:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1082246435: {
                            break block35;
                        }
                        case -170626073: {
                            continue block35;
                        }
                    }
                    break;
                }
                v11 = var1_4.section;
lbl90:
                // 2 sources

                return v11;
            }
            case 0: {
                var3_2 /* !! */  = (int)mm.hcga("hcir", hcfx(int ), (int)35);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl96:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)mm.hcga("hcis", hcfx(int ), (int)36);
                if (!var4_1) break;
                throw null;
            }
            case 2: {
                var3_2 /* !! */  = (int)mm.hcga("hcit", hcfx(int ), (int)37);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 3: {
                var3_2 /* !! */  = (int)mm.hcga("hciu", hcfx(int ), (int)38);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 4: {
                var3_2 /* !! */  = (int)mm.hcga("hciv", hcfx(int ), (int)39);
                if (var4_1) {
                    throw null;
                }
            }
lbl114:
            // 5 sources

            case 5: {
                var3_2 /* !! */  = (int)mm.hcga("hciw", hcfx(int ), (int)40);
                if (var4_1) {
                    throw null;
                }
            }
lbl118:
            // 4 sources

            case 6: {
                var3_2 /* !! */  = (int)mm.hcga("hcix", hcfx(int ), (int)41);
                if (!var4_1) ** GOTO lbl96
                throw null;
            }
lbl122:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)mm.hcga("hciy", hcfx(int ), (int)42);
                if (!var4_1) ** GOTO lbl114
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)mm.hcga("hciz", hcfx(int ), (int)43);
                    if (!var4_1) break block6;
                    throw null;
                }
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)mm.hcga("hcja", hcfx(int ), (int)44);
        ** while (!var4_1)
lbl134:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ int lambda$comparator$0(px var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcxd", hcge(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcxe", hcfx(int ), (int)244)) break;
            v0 /* !! */  = (long)mm.hcga("hcxf", hcfx(int ), (int)245);
        }
        var3_1 = mm.c;
        v1 /* !! */  = mm.ob;
        if (true) ** GOTO lbl11
        block14: while (true) {
            v1 /* !! */  = (long)(v2 - mm.hcga("hcxg", hcge(int ), (int)198));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2043466757: {
                    v2 = mm.hcga("hcxh", hcge(int ), (int)199);
                    continue block14;
                }
                case -1082246435: {
                    break block14;
                }
                case 654865941: {
                    v2 = mm.hcga("hcxi", hcge(int ), (int)200);
                    continue block14;
                }
            }
            break;
        }
        var2_2 = mm.b;
        v3 /* !! */  = mm.ob;
        if (true) ** GOTO lbl25
        block15: while (true) {
            v3 /* !! */  = (long)(mm.hcga("hcxk", hcge(int ), (int)202) - mm.hcga("hcxj", hcge(int ), (int)201));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1082246435: {
                    break block15;
                }
                case 1653405999: {
                    continue block15;
                }
            }
            break;
        }
        var1_3 = mm.a;
        if (var3_1) {
            throw null;
lbl33:
            // 1 sources

            return (int)mm.hcga("hcxl", hcfx(int ), (int)246);
        }
        ** while (var1_3 || var1_3)
lbl36:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcxm", hcge(int ), (int)203)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mm.hcga("hcxn", hcfx(int ), (int)247)) break;
            v4 /* !! */  = (long)mm.hcga("hcxo", hcfx(int ), (int)248);
        }
        v5 = mm.entry(var0);
        v6 /* !! */  = mm.ob;
        if (true) ** GOTO lbl46
        block18: while (true) {
            v6 /* !! */  = (long)(mm.hcga("hcxq", hcge(int ), (int)205) - mm.hcga("hcxp", hcge(int ), (int)204));
lbl46:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1082246435: {
                    break block18;
                }
                case 929814297: {
                    continue block18;
                }
            }
            break;
        }
        return v5.sectionOrder;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ int lambda$comparator$1(px var0) {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hcwi", hcge(int ), (int)187));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1082246435: {
                    break block17;
                }
                case -225951401: {
                    v1 = mm.hcga("hcwj", hcge(int ), (int)188);
                    continue block17;
                }
                case 728859408: {
                    v1 = mm.hcga("hcwk", hcge(int ), (int)189);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = mm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcwl", hcge(int ), (int)190)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mm.hcga("hcwm", hcfx(int ), (int)233)) break;
            v2 /* !! */  = (long)mm.hcga("hcwn", hcfx(int ), (int)234);
        }
        var2_2 /* !! */  = mm.b;
        v3 /* !! */  = mm.ob;
        if (true) ** GOTO lbl25
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - mm.hcga("hcwo", hcge(int ), (int)191));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1082246435: {
                    break block19;
                }
                case 975744956: {
                    v4 = mm.hcga("hcwp", hcge(int ), (int)192);
                    continue block19;
                }
                case 1542882794: {
                    v4 = mm.hcga("hcwq", hcge(int ), (int)193);
                    continue block19;
                }
                case 1912704586: {
                    v4 = mm.hcga("hcwr", hcge(int ), (int)194);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = mm.a;
        if (var3_1) {
            throw null;
            return (int)mm.hcga("hcws", hcfx(int ), (int)235);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcwt", hcge(int ), (int)195)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mm.hcga("hcwu", hcfx(int ), (int)236)) break;
                    v5 /* !! */  = (long)mm.hcga("hcwv", hcfx(int ), (int)237);
                }
                v6 = mm.entry(var0);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcww", hcge(int ), (int)196)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mm.hcga("hcwx", hcfx(int ), (int)238)) break;
                    v7 /* !! */  = (long)mm.hcga("hcwy", hcfx(int ), (int)239);
                }
                return v6.itemOrder;
            }
            case 0: {
                var2_2 /* !! */  = (int)mm.hcga("hcwz", hcfx(int ), (int)240);
                if (var3_1) {
                    throw null;
                }
            }
lbl62:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)mm.hcga("hcxa", hcfx(int ), (int)241);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mm.hcga("hcxb", hcfx(int ), (int)242);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mm.hcga("hcxc", hcfx(int ), (int)243);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static mm$Item item(String var0, String var1_1) {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hcpv", hcge(int ), (int)116));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1992782124: {
                    v1 = mm.hcga("hcpw", hcge(int ), (int)117);
                    continue block31;
                }
                case -1082246435: {
                    break block31;
                }
                case -233555190: {
                    v1 = mm.hcga("hcpx", hcge(int ), (int)118);
                    continue block31;
                }
            }
            break;
        }
        var4_2 = mm.c;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - mm.hcga("hcpy", hcge(int ), (int)119));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1082246435: {
                    break block32;
                }
                case 796438882: {
                    v3 = mm.hcga("hcpz", hcge(int ), (int)120);
                    continue block32;
                }
                case 1779815674: {
                    v3 = mm.hcga("hcqa", hcge(int ), (int)121);
                    continue block32;
                }
            }
            break;
        }
        var3_3 /* !! */  = mm.b;
        v4 /* !! */  = mm.ob;
        if (true) ** GOTO lbl33
        block33: while (true) {
            v4 /* !! */  = (long)(v5 - mm.hcga("hcqb", hcge(int ), (int)122));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1082246435: {
                    break block33;
                }
                case -1078194420: {
                    v5 = mm.hcga("hcqc", hcge(int ), (int)123);
                    continue block33;
                }
                case 1162388419: {
                    v5 = mm.hcga("hcqd", hcge(int ), (int)124);
                    continue block33;
                }
                case 1449721307: {
                    v5 = mm.hcga("hcqe", hcge(int ), (int)125);
                    continue block33;
                }
            }
            break;
        }
        var2_4 = mm.a;
        if (var4_2) {
            throw null;
lbl48:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl51:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = mm.ob;
                if (true) ** GOTO lbl58
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - mm.hcga("hcqf", hcge(int ), (int)126));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1082246435: {
                            break block35;
                        }
                        case -641549892: {
                            v7 = mm.hcga("hcqg", hcge(int ), (int)127);
                            continue block35;
                        }
                        case 1179587712: {
                            v7 = mm.hcga("hcqh", hcge(int ), (int)128);
                            continue block35;
                        }
                    }
                    break;
                }
                v8 /* !! */  = mm.ob;
                if (true) ** GOTO lbl71
                block36: while (true) {
                    v8 /* !! */  = (long)(mm.hcga("hcqj", hcge(int ), (int)130) - mm.hcga("hcqi", hcge(int ), (int)129));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1974250044: {
                            continue block36;
                        }
                        case -1082246435: {
                            break block36;
                        }
                    }
                    break;
                }
                return new mm$Item(var0, var1_1);
            }
lbl77:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mm.hcga("hcqk", hcfx(int ), (int)135);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)mm.hcga("hcql", hcfx(int ), (int)136);
                } while (!var4_2);
                throw null;
            }
lbl87:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mm.hcga("hcqm", hcfx(int ), (int)137);
                    if (!var4_2) ** GOTO lbl77
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)mm.hcga("hcqn", hcfx(int ), (int)138);
        ** while (!var4_2)
lbl95:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void sectionOnly(String var0, int var1_1, String ... var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcsg", hcge(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcsh", hcfx(int ), (int)169)) break;
            v0 /* !! */  = (long)mm.hcga("hcsi", hcfx(int ), (int)170);
        }
        var8_3 = mm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcsj", hcge(int ), (int)146)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mm.hcga("hcsk", hcfx(int ), (int)171)) break;
            v1 /* !! */  = (long)mm.hcga("hcsl", hcfx(int ), (int)172);
        }
        var7_4 /* !! */  = mm.b;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl17
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - mm.hcga("hcsm", hcge(int ), (int)147));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1082246435: {
                    break block40;
                }
                case 57337314: {
                    v3 = mm.hcga("hcsn", hcge(int ), (int)148);
                    continue block40;
                }
                case 483914348: {
                    v3 = mm.hcga("hcso", hcge(int ), (int)149);
                    continue block40;
                }
            }
            break;
        }
        var6_5 = mm.a;
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3) {
                    throw null;
lbl32:
                    // 9 sources

                    return;
                }
                if (var6_5 || var6_5) ** GOTO lbl32
                var3_6 = mm.hcga("hcsp", hcfx(int ), (int)173);
                if (var6_5) ** GOTO lbl32
                do {
                    if (var6_5 || var6_5) ** GOTO lbl32
                    if (var3_6 >= var2_2.length) ** GOTO lbl105
                    if (var6_5 || var6_5) ** GOTO lbl32
                    var4_7 = var2_2[var3_6];
                    if (var6_5 || var6_5) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcsq", hcge(int ), (int)150)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == mm.hcga("hcsr", hcfx(int ), (int)174)) break;
                        v4 /* !! */  = (long)mm.hcga("hcss", hcfx(int ), (int)175);
                    }
                    v5 /* !! */  = mm.ob;
                    if (true) ** GOTO lbl52
                    block44: while (true) {
                        v5 /* !! */  = (long)(mm.hcga("hcsu", hcge(int ), (int)152) - mm.hcga("hcst", hcge(int ), (int)151));
lbl52:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1082246435: {
                                break block44;
                            }
                            case 903726259: {
                                continue block44;
                            }
                        }
                        break;
                    }
                    var5_8 = mm.ENTRIES.get(var4_7);
                    if (var6_5 || var6_5) ** GOTO lbl32
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcsv", hcge(int ), (int)153)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == mm.hcga("hcsw", hcfx(int ), (int)176)) break;
                        v6 /* !! */  = (long)mm.hcga("hcsx", hcfx(int ), (int)177);
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hcsy", hcge(int ), (int)154)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == mm.hcga("hcsz", hcfx(int ), (int)178)) break;
                        v7 /* !! */  = (long)mm.hcga("hcta", hcfx(int ), (int)179);
                    }
                    if (var5_8 != null) ** GOTO lbl74
                    v8 = null;
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl84
lbl74:
                    // 1 sources

                    v9 /* !! */  = mm.ob;
                    if (true) ** GOTO lbl78
                    block47: while (true) {
                        v9 /* !! */  = (long)(mm.hcga("hctc", hcge(int ), (int)156) - mm.hcga("hctb", hcge(int ), (int)155));
lbl78:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1082246435: {
                                break block47;
                            }
                            case 65310280: {
                                continue block47;
                            }
                        }
                        break;
                    }
                    v8 = var5_8.description;
lbl84:
                    // 2 sources

                    v10 /* !! */  = mm.ob;
                    if (true) ** GOTO lbl88
                    block48: while (true) {
                        v10 /* !! */  = (long)(mm.hcga("hcte", hcge(int ), (int)158) - mm.hcga("hctd", hcge(int ), (int)157));
lbl88:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1082246435: {
                                break block48;
                            }
                            case 2146499728: {
                                continue block48;
                            }
                        }
                        break;
                    }
                    v11 = new mm$Entry(var0, var1_1, (int)var3_6, v8);
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_5 = mm.ob - mm.hcga("hctf", hcge(int ), (int)159)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == mm.hcga("hctg", hcfx(int ), (int)180)) break;
                        v12 /* !! */  = (long)mm.hcga("hcth", hcfx(int ), (int)181);
                    }
                    mm.ENTRIES.put(var4_7, v11);
                    if (var6_5 || var6_5) ** GOTO lbl32
                    ++var3_6;
                    if (var6_5) ** GOTO lbl32
                } while (!var8_3);
                throw null;
lbl105:
                // 1 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return;
            }
lbl108:
            // 3 sources

            case 0: {
                var7_4 /* !! */  = (int)mm.hcga("hcti", hcfx(int ), (int)182);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 1: {
                var7_4 /* !! */  = (int)mm.hcga("hctj", hcfx(int ), (int)183);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl118:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)mm.hcga("hctk", hcfx(int ), (int)184);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl170
                    break;
                }
            }
lbl124:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)mm.hcga("hctl", hcfx(int ), (int)185);
                if (var8_3) {
                    throw null;
                }
            }
            case 4: {
                var7_4 /* !! */  = (int)mm.hcga("hctm", hcfx(int ), (int)186);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl133:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)mm.hcga("hctn", hcfx(int ), (int)187);
                if (var8_3) {
                    throw null;
                }
            }
            case 6: {
                var7_4 /* !! */  = (int)mm.hcga("hcto", hcfx(int ), (int)188);
                if (!var8_3) ** GOTO lbl108
                throw null;
            }
lbl141:
            // 2 sources

            case 7: {
                var7_4 /* !! */  = (int)mm.hcga("hctp", hcfx(int ), (int)189);
                if (!var8_3) ** GOTO lbl124
                throw null;
            }
            case 8: {
                var7_4 /* !! */  = (int)mm.hcga("hctq", hcfx(int ), (int)190);
                if (!var8_3) ** GOTO lbl141
                throw null;
            }
lbl149:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)mm.hcga("hctr", hcfx(int ), (int)191);
                if (!var8_3) ** GOTO lbl118
                throw null;
            }
lbl153:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)mm.hcga("hcts", hcfx(int ), (int)192);
                if (!var8_3) ** GOTO lbl118
                throw null;
            }
lbl157:
            // 3 sources

            case 11: {
                var7_4 /* !! */  = (int)mm.hcga("hctt", hcfx(int ), (int)193);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl162:
            // 3 sources

            case 12: {
                var7_4 /* !! */  = (int)mm.hcga("hctu", hcfx(int ), (int)194);
                if (!var8_3) ** GOTO lbl133
                throw null;
            }
lbl166:
            // 2 sources

            case 13: {
                var7_4 /* !! */  = (int)mm.hcga("hctv", hcfx(int ), (int)195);
                if (!var8_3) ** GOTO lbl149
                throw null;
            }
lbl170:
            // 2 sources

            case 14: {
                var7_4 /* !! */  = (int)mm.hcga("hctw", hcfx(int ), (int)196);
                if (!var8_3) ** GOTO lbl108
                throw null;
            }
            case 15: {
                var7_4 /* !! */  = (int)mm.hcga("hctx", hcfx(int ), (int)197);
                if (!var8_3) ** GOTO lbl162
                throw null;
            }
lbl178:
            // 2 sources

            case 16: {
                var7_4 /* !! */  = (int)mm.hcga("hcty", hcfx(int ), (int)198);
                if (!var8_3) ** GOTO lbl153
                throw null;
            }
            case 17: {
                var7_4 /* !! */  = (int)mm.hcga("hctz", hcfx(int ), (int)199);
                if (!var8_3) ** GOTO lbl178
                throw null;
            }
            case 18: 
        }
        var7_4 /* !! */  = (int)mm.hcga("hcua", hcfx(int ), (int)200);
        ** while (!var8_3)
lbl189:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hcge(int n2) {
        return hcgf[n2] ^ hcgg[n2];
    }

    private static /* synthetic */ void helt() {
        mm.hcfz[100] = 1176030154;
        mm.hcfz[101] = -2000860255;
        mm.hcfz[102] = -975724068;
        mm.hcfz[103] = -239665451;
        mm.hcfz[104] = 1999017420;
        mm.hcfz[105] = -1209138513;
        mm.hcfz[106] = -1672603080;
        mm.hcfz[107] = 628744096;
        mm.hcfz[108] = -541282827;
        mm.hcfz[109] = -868399402;
        mm.hcfz[110] = 2013449511;
        mm.hcfz[111] = 1233001092;
        mm.hcfz[112] = 393689692;
        mm.hcfz[113] = -2093679243;
        mm.hcfz[114] = 172897313;
        mm.hcfz[115] = 1746111482;
        mm.hcfz[116] = 155083511;
        mm.hcfz[117] = 1669701559;
        mm.hcfz[118] = -1486074561;
        mm.hcfz[119] = 1880229835;
        mm.hcfz[120] = -1427542628;
        mm.hcfz[121] = -1416185222;
        mm.hcfz[122] = 975089094;
        mm.hcfz[123] = 1199604894;
        mm.hcfz[124] = -1049335196;
        mm.hcfz[125] = -1614211177;
        mm.hcfz[126] = 804067694;
        mm.hcfz[127] = 1438266124;
        mm.hcfz[128] = 1680287407;
        mm.hcfz[129] = 914618209;
        mm.hcfz[130] = 1337587800;
        mm.hcfz[131] = -1214595025;
        mm.hcfz[132] = 350143164;
        mm.hcfz[133] = -1545202655;
        mm.hcfz[134] = -2101590683;
        mm.hcfz[135] = -152283134;
        mm.hcfz[136] = -2076762165;
        mm.hcfz[137] = 1852832666;
        mm.hcfz[138] = -135455544;
        mm.hcfz[139] = 1209450355;
        mm.hcfz[140] = 2136750524;
        mm.hcfz[141] = -403741175;
        mm.hcfz[142] = 20422679;
        mm.hcfz[143] = -396621827;
        mm.hcfz[144] = -40063728;
        mm.hcfz[145] = -978038475;
        mm.hcfz[146] = -1335865628;
        mm.hcfz[147] = -1319718862;
        mm.hcfz[148] = 1428918098;
        mm.hcfz[149] = -1640657028;
        mm.hcfz[150] = 1067770532;
        mm.hcfz[151] = 1488230955;
        mm.hcfz[152] = -1482296299;
        mm.hcfz[153] = 1291003587;
        mm.hcfz[154] = 1045973899;
        mm.hcfz[155] = 1335156944;
        mm.hcfz[156] = -1438070447;
        mm.hcfz[157] = 1146434745;
        mm.hcfz[158] = -1318612397;
        mm.hcfz[159] = -1970990444;
        mm.hcfz[160] = 2131075326;
        mm.hcfz[161] = 1023592273;
        mm.hcfz[162] = 430586711;
        mm.hcfz[163] = 488219809;
        mm.hcfz[164] = -649537753;
        mm.hcfz[165] = -521601018;
        mm.hcfz[166] = -1104023370;
        mm.hcfz[167] = 555060160;
        mm.hcfz[168] = 1913251179;
        mm.hcfz[169] = 1985113154;
        mm.hcfz[170] = 920559380;
        mm.hcfz[171] = -501128156;
        mm.hcfz[172] = 754817639;
        mm.hcfz[173] = -1351760165;
        mm.hcfz[174] = -849599595;
        mm.hcfz[175] = 1851386046;
        mm.hcfz[176] = 2103777883;
        mm.hcfz[177] = 840312371;
        mm.hcfz[178] = -205770126;
        mm.hcfz[179] = -293074467;
        mm.hcfz[180] = -1598120315;
        mm.hcfz[181] = -1639064189;
        mm.hcfz[182] = 1833708907;
        mm.hcfz[183] = -1105984970;
        mm.hcfz[184] = -889036825;
        mm.hcfz[185] = -1253085848;
        mm.hcfz[186] = -2013666235;
        mm.hcfz[187] = 1900789946;
        mm.hcfz[188] = 121857926;
        mm.hcfz[189] = 1410138322;
        mm.hcfz[190] = 2036174387;
        mm.hcfz[191] = 307462874;
        mm.hcfz[192] = -893626620;
        mm.hcfz[193] = 41633712;
        mm.hcfz[194] = 1635203056;
        mm.hcfz[195] = -570147156;
        mm.hcfz[196] = -1677636272;
        mm.hcfz[197] = -1865580498;
        mm.hcfz[198] = -1281856451;
        mm.hcfz[199] = 1086697549;
    }

    public static /* synthetic */ CallSite hcga(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hemm() {
        mm.hcgg[100] = 2185810661434168646L;
        mm.hcgg[101] = -4283237560969487363L;
        mm.hcgg[102] = 3954961279066830222L;
        mm.hcgg[103] = 7865864396591581295L;
        mm.hcgg[104] = 529158513835745103L;
        mm.hcgg[105] = 5324377412662934175L;
        mm.hcgg[106] = 2609262856212000071L;
        mm.hcgg[107] = 2019765424503391619L;
        mm.hcgg[108] = -1347092766042578610L;
        mm.hcgg[109] = -7780006621615126813L;
        mm.hcgg[110] = -2338349071873655566L;
        mm.hcgg[111] = -2387190387143961068L;
        mm.hcgg[112] = -7500647040581492155L;
        mm.hcgg[113] = 5116314052273474836L;
        mm.hcgg[114] = -7362243754079032481L;
        mm.hcgg[115] = -7421237692134356732L;
        mm.hcgg[116] = -8755889578855107509L;
        mm.hcgg[117] = 5015580763690291438L;
        mm.hcgg[118] = -8776088095977531917L;
        mm.hcgg[119] = -8786989173305309508L;
        mm.hcgg[120] = -6410336792764859095L;
        mm.hcgg[121] = -7938814504111289058L;
        mm.hcgg[122] = -5038919209220344693L;
        mm.hcgg[123] = 2478346797125476349L;
        mm.hcgg[124] = 8559804929548066576L;
        mm.hcgg[125] = 4678955609037883694L;
        mm.hcgg[126] = -7276391350854067584L;
        mm.hcgg[127] = -896673083103655417L;
        mm.hcgg[128] = -1768354809129855705L;
        mm.hcgg[129] = -6872765117816354252L;
        mm.hcgg[130] = 7911184094853647045L;
        mm.hcgg[131] = -8010470847396559716L;
        mm.hcgg[132] = -997767051563840306L;
        mm.hcgg[133] = 2450083181403588610L;
        mm.hcgg[134] = 3371222844152853159L;
        mm.hcgg[135] = -5736317365735241793L;
        mm.hcgg[136] = -6810737306807759958L;
        mm.hcgg[137] = 3813135898643218823L;
        mm.hcgg[138] = 7628758683489054702L;
        mm.hcgg[139] = 2404065182975697376L;
        mm.hcgg[140] = 4543525087990087164L;
        mm.hcgg[141] = 3280633472279550375L;
        mm.hcgg[142] = -3381891369329902880L;
        mm.hcgg[143] = 2938010484452210115L;
        mm.hcgg[144] = -8769775109532442688L;
        mm.hcgg[145] = 2727967911242060614L;
        mm.hcgg[146] = 6570723729498597064L;
        mm.hcgg[147] = -1309353859920884387L;
        mm.hcgg[148] = -8508474607761794243L;
        mm.hcgg[149] = 8185001687759537720L;
        mm.hcgg[150] = -476516440627338754L;
        mm.hcgg[151] = 3795699802521881361L;
        mm.hcgg[152] = 8922101356392684578L;
        mm.hcgg[153] = 2391976408277617734L;
        mm.hcgg[154] = -6462605271485060120L;
        mm.hcgg[155] = -253413696537470097L;
        mm.hcgg[156] = 113604899433085362L;
        mm.hcgg[157] = 5558888654255281667L;
        mm.hcgg[158] = -4879240510046600175L;
        mm.hcgg[159] = 1292402606614143806L;
        mm.hcgg[160] = -821216045062321492L;
        mm.hcgg[161] = 7647897380109702674L;
        mm.hcgg[162] = -8745658368955959366L;
        mm.hcgg[163] = 1656873244194946184L;
        mm.hcgg[164] = 201119371181832739L;
        mm.hcgg[165] = 4558758798887002481L;
        mm.hcgg[166] = 5058364015872661874L;
        mm.hcgg[167] = 6874828561411395798L;
        mm.hcgg[168] = 3303983899480297943L;
        mm.hcgg[169] = 504582403663892373L;
        mm.hcgg[170] = 9100140132136532445L;
        mm.hcgg[171] = -9009959254622938043L;
        mm.hcgg[172] = -7367412243500478259L;
        mm.hcgg[173] = 7803687103425048520L;
        mm.hcgg[174] = -2556781432285039494L;
        mm.hcgg[175] = -7318765836604633838L;
        mm.hcgg[176] = 1396090369959501373L;
        mm.hcgg[177] = -7518242558469642680L;
        mm.hcgg[178] = 1174575494731269179L;
        mm.hcgg[179] = -8082991767257000515L;
        mm.hcgg[180] = -5885551740236853659L;
        mm.hcgg[181] = -2054202454859794087L;
        mm.hcgg[182] = -6545415128904748950L;
        mm.hcgg[183] = 2022628202492963070L;
        mm.hcgg[184] = -6819462585718862009L;
        mm.hcgg[185] = -4656865157527651527L;
        mm.hcgg[186] = 2183372114921570588L;
        mm.hcgg[187] = 4564451741075436284L;
        mm.hcgg[188] = -1155717946372338347L;
        mm.hcgg[189] = -5347125855201224604L;
        mm.hcgg[190] = 9166918586420835620L;
        mm.hcgg[191] = -1346661562736522887L;
        mm.hcgg[192] = -6255639584693635314L;
        mm.hcgg[193] = -4179870503645968865L;
        mm.hcgg[194] = -3569344027013503382L;
        mm.hcgg[195] = -4229179126671350403L;
        mm.hcgg[196] = -4371163800885632458L;
        mm.hcgg[197] = -6268333807061516278L;
        mm.hcgg[198] = 9020411222168746075L;
        mm.hcgg[199] = -7805835829173752111L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private mm() {
        var2_1 /* !! */  = mm.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    super();
                    return;
                }
                case 2: {
                    var2_1 /* !! */  = (int)mm.hcga("hcgd", hcfx(int ), (int)2);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)mm.hcga("hcgb", hcfx(int ), (int)0);
                }
                case 1: 
            }
            if (true) ** GOTO lbl18
            break;
        }
        while (true) {
            if (true) ** continue;
lbl18:
            // 2 sources

            var2_1 /* !! */  = (int)mm.hcga("hcgc", hcfx(int ), (int)1);
            cfr_temp_0 = 0;
        }
    }

    private static /* synthetic */ void helu() {
        mm.hcfz[200] = 2121737308;
        mm.hcfz[201] = 2026542141;
        mm.hcfz[202] = 449326302;
        mm.hcfz[203] = -369008102;
        mm.hcfz[204] = 145581191;
        mm.hcfz[205] = 1171495933;
        mm.hcfz[206] = -452460132;
        mm.hcfz[207] = 866970436;
        mm.hcfz[208] = 2022590968;
        mm.hcfz[209] = 1669276122;
        mm.hcfz[210] = 322483891;
        mm.hcfz[211] = -1056702467;
        mm.hcfz[212] = 1760303342;
        mm.hcfz[213] = 634707854;
        mm.hcfz[214] = -269165087;
        mm.hcfz[215] = -800635670;
        mm.hcfz[216] = -652398269;
        mm.hcfz[217] = 1574828272;
        mm.hcfz[218] = -1574664787;
        mm.hcfz[219] = 1105846143;
        mm.hcfz[220] = -1000628089;
        mm.hcfz[221] = 1444426398;
        mm.hcfz[222] = 1040876853;
        mm.hcfz[223] = 536916493;
        mm.hcfz[224] = -207513840;
        mm.hcfz[225] = 1997536240;
        mm.hcfz[226] = 339226284;
        mm.hcfz[227] = 1366621328;
        mm.hcfz[228] = 616254197;
        mm.hcfz[229] = -1582075204;
        mm.hcfz[230] = -1344015533;
        mm.hcfz[231] = -280879290;
        mm.hcfz[232] = 1477153801;
        mm.hcfz[233] = 265369694;
        mm.hcfz[234] = -788402499;
        mm.hcfz[235] = -1905918920;
        mm.hcfz[236] = -1648110748;
        mm.hcfz[237] = 2036952553;
        mm.hcfz[238] = 605161153;
        mm.hcfz[239] = -1158381852;
        mm.hcfz[240] = -1220555439;
        mm.hcfz[241] = 2112222280;
        mm.hcfz[242] = 665445231;
        mm.hcfz[243] = -1261280955;
        mm.hcfz[244] = 1274943926;
        mm.hcfz[245] = 752939651;
        mm.hcfz[246] = -797802612;
        mm.hcfz[247] = 520296726;
        mm.hcfz[248] = 177967173;
        mm.hcfz[249] = -1844657747;
        mm.hcfz[250] = -1371766229;
        mm.hcfz[251] = -585270892;
        mm.hcfz[252] = 422195272;
        mm.hcfz[253] = 541043005;
        mm.hcfz[254] = 7379308;
        mm.hcfz[255] = -2138662981;
        mm.hcfz[256] = -1097236038;
        mm.hcfz[257] = 1831312402;
        mm.hcfz[258] = -1632796540;
        mm.hcfz[259] = -1326617151;
        mm.hcfz[260] = -152506180;
        mm.hcfz[261] = -1717190266;
        mm.hcfz[262] = 983783506;
        mm.hcfz[263] = -258863052;
        mm.hcfz[264] = 1601057326;
        mm.hcfz[265] = 707369935;
        mm.hcfz[266] = -1884971049;
        mm.hcfz[267] = 2130478924;
        mm.hcfz[268] = -1733958891;
        mm.hcfz[269] = -1052627034;
        mm.hcfz[270] = -12161783;
        mm.hcfz[271] = -1215137493;
        mm.hcfz[272] = -241819762;
        mm.hcfz[273] = 1831305769;
        mm.hcfz[274] = -500441369;
        mm.hcfz[275] = -1016679324;
        mm.hcfz[276] = -1118890753;
        mm.hcfz[277] = 1925419265;
        mm.hcfz[278] = 50470093;
        mm.hcfz[279] = -1760010559;
        mm.hcfz[280] = 61211536;
        mm.hcfz[281] = 2140154055;
        mm.hcfz[282] = -2067958008;
        mm.hcfz[283] = -961557440;
        mm.hcfz[284] = -820354343;
        mm.hcfz[285] = -1592705629;
        mm.hcfz[286] = 478510253;
        mm.hcfz[287] = 1539523167;
        mm.hcfz[288] = 1553735132;
        mm.hcfz[289] = -1828083146;
        mm.hcfz[290] = 1943739046;
        mm.hcfz[291] = -569496679;
        mm.hcfz[292] = -1847256523;
        mm.hcfz[293] = 1325562041;
        mm.hcfz[294] = 1981356045;
        mm.hcfz[295] = 944340783;
        mm.hcfz[296] = 2072477328;
        mm.hcfz[297] = 379263590;
        mm.hcfz[298] = -1903197252;
        mm.hcfz[299] = 716988715;
    }

    private static /* synthetic */ void hely() {
        mm.hcgf[200] = 6483353520235893449L;
        mm.hcgf[201] = 8923111978370106306L;
        mm.hcgf[202] = -732107121340633666L;
        mm.hcgf[203] = 8710834247262948434L;
        mm.hcgf[204] = 168605398280748370L;
        mm.hcgf[205] = 4571397718706994239L;
    }

    private static /* synthetic */ void hemw() {
        mm.hcgg[200] = 8292476319245310623L;
        mm.hcgg[201] = 4518510026842928839L;
        mm.hcgg[202] = 3932029812556703496L;
        mm.hcgg[203] = 6398431176978330143L;
        mm.hcgg[204] = -2484188713404439441L;
        mm.hcgg[205] = 5304295194704371699L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ int lambda$moduleComparator$4(ds var0) {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hcub", hcge(int ), (int)160));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1143829114: {
                    v1 = mm.hcga("hcuc", hcge(int ), (int)161);
                    continue block26;
                }
                case -1082246435: {
                    break block26;
                }
                case 241062940: {
                    v1 = mm.hcga("hcud", hcge(int ), (int)162);
                    continue block26;
                }
            }
            break;
        }
        var3_1 = mm.c;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - mm.hcga("hcue", hcge(int ), (int)163));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1937193339: {
                    v3 = mm.hcga("hcuf", hcge(int ), (int)164);
                    continue block27;
                }
                case -1082246435: {
                    break block27;
                }
                case -448262885: {
                    v3 = mm.hcga("hcug", hcge(int ), (int)165);
                    continue block27;
                }
                case -307371086: {
                    v3 = mm.hcga("hcuh", hcge(int ), (int)166);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mm.ob;
                if (true) ** GOTO lbl39
                block28: while (true) {
                    v4 /* !! */  = (long)(mm.hcga("hcuj", hcge(int ), (int)168) - mm.hcga("hcui", hcge(int ), (int)167));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1082246435: {
                            break block28;
                        }
                        case -555997394: {
                            continue block28;
                        }
                    }
                    break;
                }
                var1_3 = mm.a;
                if (var3_1) {
                    throw null;
                    return (int)mm.hcga("hcuk", hcfx(int ), (int)201);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mm.ob;
                if (true) ** GOTO lbl54
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - mm.hcga("hcul", hcge(int ), (int)169));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1082246435: {
                            break block30;
                        }
                        case -44253252: {
                            v6 = mm.hcga("hcum", hcge(int ), (int)170);
                            continue block30;
                        }
                        case 1986547767: {
                            v6 = mm.hcga("hcun", hcge(int ), (int)171);
                            continue block30;
                        }
                    }
                    break;
                }
                v7 = mm.entry(var0);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcuo", hcge(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == mm.hcga("hcup", hcfx(int ), (int)202)) break;
                    v8 /* !! */  = (long)mm.hcga("hcuq", hcfx(int ), (int)203);
                }
                return v7.itemOrder;
            }
lbl71:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mm.hcga("hcur", hcfx(int ), (int)204);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mm.hcga("hcus", hcfx(int ), (int)205);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mm.hcga("hcut", hcfx(int ), (int)206);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm.hcga("hcuu", hcfx(int ), (int)207);
        ** while (!var3_1)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Comparator<px> comparator() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hckz", hcge(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcla", hcfx(int ), (int)75)) break;
            v0 /* !! */  = (long)mm.hcga("hclb", hcfx(int ), (int)76);
        }
        var2 = mm.c;
        v1 /* !! */  = mm.ob;
        if (true) ** GOTO lbl11
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - mm.hcga("hclc", hcge(int ), (int)51));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1082246435: {
                    break block27;
                }
                case -467646054: {
                    v2 = mm.hcga("hcld", hcge(int ), (int)52);
                    continue block27;
                }
                case 463033927: {
                    v2 = mm.hcga("hcle", hcge(int ), (int)53);
                    continue block27;
                }
                case 847421369: {
                    v2 = mm.hcga("hclf", hcge(int ), (int)54);
                    continue block27;
                }
            }
            break;
        }
        var1_1 /* !! */  = mm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hclg", hcge(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mm.hcga("hclh", hcfx(int ), (int)77)) break;
            v3 /* !! */  = (long)mm.hcga("hcli", hcfx(int ), (int)78);
        }
        var0_2 = mm.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = mm.ob;
                if (true) ** GOTO lbl42
                block30: while (true) {
                    v4 /* !! */  = (long)(mm.hcga("hclk", hcge(int ), (int)57) - mm.hcga("hclj", hcge(int ), (int)56));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1082246435: {
                            break block30;
                        }
                        case -297063910: {
                            continue block30;
                        }
                    }
                    break;
                }
                v5 = (ToIntFunction<px>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, lambda$comparator$0(ruhack.phobia.px ), (Lruhack/phobia/px;)I)();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcll", hcge(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mm.hcga("hclm", hcfx(int ), (int)79)) break;
                    v6 /* !! */  = (long)mm.hcga("hcln", hcfx(int ), (int)80);
                }
                v7 = Comparator.comparingInt(v5);
                v8 /* !! */  = mm.ob;
                if (true) ** GOTO lbl58
                block32: while (true) {
                    v8 /* !! */  = (long)(mm.hcga("hclp", hcge(int ), (int)60) - mm.hcga("hclo", hcge(int ), (int)59));
lbl58:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1082246435: {
                            break block32;
                        }
                        case -347325610: {
                            continue block32;
                        }
                    }
                    break;
                }
                v9 = (ToIntFunction<px>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, lambda$comparator$1(ruhack.phobia.px ), (Lruhack/phobia/px;)I)();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hclq", hcge(int ), (int)61)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mm.hcga("hclr", hcfx(int ), (int)81)) break;
                    v10 /* !! */  = (long)mm.hcga("hcls", hcfx(int ), (int)82);
                }
                v11 = v7.thenComparingInt(v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hclt", hcge(int ), (int)62)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == mm.hcga("hclu", hcfx(int ), (int)83)) break;
                    v12 /* !! */  = (long)mm.hcga("hclv", hcfx(int ), (int)84);
                }
                v13 = (Function<px, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$comparator$2(ruhack.phobia.px ), (Lruhack/phobia/px;)Ljava/lang/String;)();
                v14 /* !! */  = mm.ob;
                if (true) ** GOTO lbl80
                block35: while (true) {
                    v14 /* !! */  = (long)(v15 - mm.hcga("hclw", hcge(int ), (int)63));
lbl80:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1082246435: {
                            break block35;
                        }
                        case -280497530: {
                            v15 = mm.hcga("hclx", hcge(int ), (int)64);
                            continue block35;
                        }
                        case -17998640: {
                            v15 = mm.hcga("hcly", hcge(int ), (int)65);
                            continue block35;
                        }
                        case 1366369225: {
                            v15 = mm.hcga("hclz", hcge(int ), (int)66);
                            continue block35;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = mm.ob - mm.hcga("hcma", hcge(int ), (int)67)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == mm.hcga("hcmb", hcfx(int ), (int)85)) break;
                    v16 /* !! */  = (long)mm.hcga("hcmc", hcfx(int ), (int)86);
                }
                return v11.thenComparing(v13, String.CASE_INSENSITIVE_ORDER);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mm.hcga("hcmd", hcfx(int ), (int)87);
                    if (!var2) break block6;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)mm.hcga("hcme", hcfx(int ), (int)88);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)mm.hcga("hcmf", hcfx(int ), (int)89);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mm.hcga("hcmg", hcfx(int ), (int)90);
        ** while (!var2)
lbl115:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static mm$Entry entry(px var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcnp", hcge(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mm.hcga("hcnq", hcfx(int ), (int)103)) break;
            v0 /* !! */  = (long)mm.hcga("hcnr", hcfx(int ), (int)104);
        }
        var3_1 = mm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcns", hcge(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mm.hcga("hcnt", hcfx(int ), (int)105)) break;
            v1 /* !! */  = (long)mm.hcga("hcnu", hcfx(int ), (int)106);
        }
        var2_2 /* !! */  = mm.b;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - mm.hcga("hcnv", hcge(int ), (int)92));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1639863344: {
                    v3 = mm.hcga("hcnw", hcge(int ), (int)93);
                    continue block18;
                }
                case -1374708051: {
                    v3 = mm.hcga("hcnx", hcge(int ), (int)94);
                    continue block18;
                }
                case -1082246435: {
                    break block18;
                }
                case 1797820622: {
                    v3 = mm.hcga("hcny", hcge(int ), (int)95);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = mm.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mm.ob;
                if (true) ** GOTO lbl45
                block20: while (true) {
                    v4 /* !! */  = (long)(mm.hcga("hcoa", hcge(int ), (int)97) - mm.hcga("hcnz", hcge(int ), (int)96));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1217906337: {
                            continue block20;
                        }
                        case -1082246435: {
                            break block20;
                        }
                    }
                    break;
                }
                v5 = var0.getModule();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcob", hcge(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == mm.hcga("hcoc", hcfx(int ), (int)107)) break;
                    v6 /* !! */  = (long)mm.hcga("hcod", hcfx(int ), (int)108);
                }
                return mm.entry(v5);
            }
            case 0: {
                var2_2 /* !! */  = (int)mm.hcga("hcoe", hcfx(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
lbl63:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mm.hcga("hcof", hcfx(int ), (int)110);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl68:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mm.hcga("hcog", hcfx(int ), (int)111);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mm.hcga("hcoh", hcfx(int ), (int)112);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void section(String var0, int var1_1, mm$Item ... var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcqo", hcge(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcqp", hcfx(int ), (int)139)) break;
            v0 /* !! */  = (long)mm.hcga("hcqq", hcfx(int ), (int)140);
        }
        var7_3 = mm.c;
        v1 /* !! */  = mm.ob;
        if (true) ** GOTO lbl11
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - mm.hcga("hcqr", hcge(int ), (int)132));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1383284973: {
                    v2 = mm.hcga("hcqs", hcge(int ), (int)133);
                    continue block34;
                }
                case -1082246435: {
                    break block34;
                }
                case 1546817307: {
                    v2 = mm.hcga("hcqt", hcge(int ), (int)134);
                    continue block34;
                }
                case 1973972588: {
                    v2 = mm.hcga("hcqu", hcge(int ), (int)135);
                    continue block34;
                }
            }
            break;
        }
        var6_4 /* !! */  = mm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcqv", hcge(int ), (int)136)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mm.hcga("hcqw", hcfx(int ), (int)141)) break;
            v3 /* !! */  = (long)mm.hcga("hcqx", hcfx(int ), (int)142);
        }
        var5_5 = mm.a;
        if (var7_3) {
            throw null;
lbl32:
            // 8 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl32
        var3_6 = mm.hcga("hcqy", hcfx(int ), (int)143);
        if (var5_5) ** GOTO lbl32
        block37: while (true) {
            if (var5_5 || var5_5) ** GOTO lbl32
            if (var3_6 >= var2_2.length) ** GOTO lbl93
            if (var5_5 || var5_5) ** GOTO lbl32
            if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var4_7 = var2_2[var3_6];
                    if (var5_5 || var5_5) ** GOTO lbl32
                    v4 /* !! */  = mm.ob;
                    if (true) ** GOTO lbl50
                    block38: while (true) {
                        v4 /* !! */  = (long)(mm.hcga("hcra", hcge(int ), (int)138) - mm.hcga("hcqz", hcge(int ), (int)137));
lbl50:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1082246435: {
                                break block38;
                            }
                            case -619161400: {
                                continue block38;
                            }
                        }
                        break;
                    }
                    v5 /* !! */  = mm.ob;
                    if (true) ** GOTO lbl59
                    block39: while (true) {
                        v5 /* !! */  = (long)(mm.hcga("hcrc", hcge(int ), (int)140) - mm.hcga("hcrb", hcge(int ), (int)139));
lbl59:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1082246435: {
                                break block39;
                            }
                            case 4230372: {
                                continue block39;
                            }
                        }
                        break;
                    }
                    v6 = var4_7.name;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcrd", hcge(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == mm.hcga("hcre", hcfx(int ), (int)144)) break;
                        v7 /* !! */  = (long)mm.hcga("hcrf", hcfx(int ), (int)145);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcrg", hcge(int ), (int)142)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == mm.hcga("hcrh", hcfx(int ), (int)146)) break;
                        v8 /* !! */  = (long)mm.hcga("hcri", hcfx(int ), (int)147);
                    }
                    v9 = var4_7.description;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hcrj", hcge(int ), (int)143)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == mm.hcga("hcrk", hcfx(int ), (int)148)) break;
                        v10 /* !! */  = (long)mm.hcga("hcrl", hcfx(int ), (int)149);
                    }
                    v11 = new mm$Entry(var0, var1_1, (int)var3_6, v9);
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_5 = mm.ob - mm.hcga("hcrm", hcge(int ), (int)144)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == mm.hcga("hcrn", hcfx(int ), (int)150)) break;
                        v12 /* !! */  = (long)mm.hcga("hcro", hcfx(int ), (int)151);
                    }
                    mm.ENTRIES.put(v6, v11);
                    if (var5_5 || var5_5) ** GOTO lbl32
                    ++var3_6;
                    if (var5_5) ** GOTO lbl32
                    if (!var7_3) continue block37;
                    throw null;
                }
lbl93:
                // 1 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
lbl96:
                // 2 sources

                case 0: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrp", hcfx(int ), (int)152);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl101:
                // 2 sources

                case 1: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrq", hcfx(int ), (int)153);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
                case 2: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrr", hcfx(int ), (int)154);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
                case 3: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrs", hcfx(int ), (int)155);
                    if (!var7_3) break block37;
                    throw null;
                }
                case 4: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrt", hcfx(int ), (int)156);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl120:
                // 3 sources

                case 5: {
                    var6_4 /* !! */  = (int)mm.hcga("hcru", hcfx(int ), (int)157);
                    if (!var7_3) ** GOTO lbl96
                    throw null;
                }
lbl124:
                // 2 sources

                case 6: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrv", hcfx(int ), (int)158);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl129:
                // 2 sources

                case 7: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrw", hcfx(int ), (int)159);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
                case 8: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrx", hcfx(int ), (int)160);
                    if (!var7_3) ** GOTO lbl101
                    throw null;
                }
lbl138:
                // 2 sources

                case 9: {
                    var6_4 /* !! */  = (int)mm.hcga("hcry", hcfx(int ), (int)161);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl143:
                // 3 sources

                case 10: {
                    var6_4 /* !! */  = (int)mm.hcga("hcrz", hcfx(int ), (int)162);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
                case 11: {
                    var6_4 /* !! */  = (int)mm.hcga("hcsa", hcfx(int ), (int)163);
                    if (!var7_3) ** GOTO lbl138
                    throw null;
                }
                case 12: {
                    do {
                        var6_4 /* !! */  = (int)mm.hcga("hcsb", hcfx(int ), (int)164);
                    } while (!var7_3);
                    throw null;
                }
lbl157:
                // 3 sources

                case 13: {
                    var6_4 /* !! */  = (int)mm.hcga("hcsc", hcfx(int ), (int)165);
                    if (!var7_3) ** GOTO lbl120
                    throw null;
                }
lbl161:
                // 2 sources

                case 14: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_4 /* !! */  = (int)mm.hcga("hcsd", hcfx(int ), (int)166);
                        if (!var7_3) ** GOTO lbl120
                        throw null;
                    }
                }
lbl166:
                // 3 sources

                case 15: {
                    var6_4 /* !! */  = (int)mm.hcga("hcse", hcfx(int ), (int)167);
                    if (!var7_3) ** GOTO lbl157
                    throw null;
                }
                case 16: 
            }
            break;
        }
        var6_4 /* !! */  = (int)mm.hcga("hcsf", hcfx(int ), (int)168);
        ** while (!var7_3)
lbl173:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void helx() {
        mm.hcgf[100] = -8670774658277865694L;
        mm.hcgf[101] = 7308622509264599119L;
        mm.hcgf[102] = -5691843351270439343L;
        mm.hcgf[103] = -6721646759844648670L;
        mm.hcgf[104] = -6597880924167236354L;
        mm.hcgf[105] = -394212856703896627L;
        mm.hcgf[106] = 308025282659245071L;
        mm.hcgf[107] = 373966647673701661L;
        mm.hcgf[108] = -6091609905336598703L;
        mm.hcgf[109] = -337358118268959631L;
        mm.hcgf[110] = -8118878127580967212L;
        mm.hcgf[111] = 5300125996406403511L;
        mm.hcgf[112] = 1623373361434382212L;
        mm.hcgf[113] = 8697008846291643669L;
        mm.hcgf[114] = -1702481122350223707L;
        mm.hcgf[115] = -13890944311215455L;
        mm.hcgf[116] = -898507543933284238L;
        mm.hcgf[117] = -1703120923035993732L;
        mm.hcgf[118] = -2621331531937112575L;
        mm.hcgf[119] = 4505533591335670272L;
        mm.hcgf[120] = 824927759038446298L;
        mm.hcgf[121] = 5152899204478325915L;
        mm.hcgf[122] = 214787612047933314L;
        mm.hcgf[123] = -4592203697937965734L;
        mm.hcgf[124] = 7561426091665330331L;
        mm.hcgf[125] = -4525329825478955946L;
        mm.hcgf[126] = -7759283437952104810L;
        mm.hcgf[127] = -2730508224602535334L;
        mm.hcgf[128] = -8150493092530819958L;
        mm.hcgf[129] = -2967580580319143557L;
        mm.hcgf[130] = 533350302105014073L;
        mm.hcgf[131] = 8344962550955967138L;
        mm.hcgf[132] = 4684926860816177065L;
        mm.hcgf[133] = 4458994442668277141L;
        mm.hcgf[134] = -6515610537351080701L;
        mm.hcgf[135] = -6052884926130773557L;
        mm.hcgf[136] = -2686710970190420575L;
        mm.hcgf[137] = 2522020707692084277L;
        mm.hcgf[138] = 5817487617195478325L;
        mm.hcgf[139] = 4064917398694546577L;
        mm.hcgf[140] = 3491584308693542367L;
        mm.hcgf[141] = 4214801754644958150L;
        mm.hcgf[142] = -365470437052190739L;
        mm.hcgf[143] = -3564443528445135877L;
        mm.hcgf[144] = 214726938030548499L;
        mm.hcgf[145] = 4095570853117073810L;
        mm.hcgf[146] = -4251663277763510967L;
        mm.hcgf[147] = -269322837791704565L;
        mm.hcgf[148] = 3057309184379260069L;
        mm.hcgf[149] = -3736098004684407391L;
        mm.hcgf[150] = 4551128387948134782L;
        mm.hcgf[151] = 185388140400044642L;
        mm.hcgf[152] = -9113960293335962213L;
        mm.hcgf[153] = -898067571639106368L;
        mm.hcgf[154] = 8971257956394678211L;
        mm.hcgf[155] = 8121071689802973625L;
        mm.hcgf[156] = -4772162127326183759L;
        mm.hcgf[157] = -5080224230883345787L;
        mm.hcgf[158] = 251843012074892596L;
        mm.hcgf[159] = -5370986550413710192L;
        mm.hcgf[160] = 5645841360235459266L;
        mm.hcgf[161] = -8675161819588702426L;
        mm.hcgf[162] = 5511841745569414655L;
        mm.hcgf[163] = 63083893038115964L;
        mm.hcgf[164] = -7189305522942769137L;
        mm.hcgf[165] = 2972745248906629267L;
        mm.hcgf[166] = -1515505494085644666L;
        mm.hcgf[167] = -1164435731880677184L;
        mm.hcgf[168] = -4725380438511006264L;
        mm.hcgf[169] = 9061390308422240991L;
        mm.hcgf[170] = -4044699146307361057L;
        mm.hcgf[171] = 8808089723965741902L;
        mm.hcgf[172] = 1950693440309621317L;
        mm.hcgf[173] = -9185467132536909748L;
        mm.hcgf[174] = -1946780396329110722L;
        mm.hcgf[175] = 562477525189017068L;
        mm.hcgf[176] = 5914800770086862037L;
        mm.hcgf[177] = 1070733362465107911L;
        mm.hcgf[178] = -6809947338957417636L;
        mm.hcgf[179] = -1756283417187859299L;
        mm.hcgf[180] = 722564581316344563L;
        mm.hcgf[181] = -6206396901886243093L;
        mm.hcgf[182] = 1643830126959854869L;
        mm.hcgf[183] = -3954774864965329004L;
        mm.hcgf[184] = -5278438531618592491L;
        mm.hcgf[185] = -3378399863366111068L;
        mm.hcgf[186] = -2432416820266302493L;
        mm.hcgf[187] = 3611585887219422547L;
        mm.hcgf[188] = 3779386897574923353L;
        mm.hcgf[189] = 7678845890202820378L;
        mm.hcgf[190] = -8760837905504154137L;
        mm.hcgf[191] = 8052859385026447272L;
        mm.hcgf[192] = 3123655815409309916L;
        mm.hcgf[193] = -7758575532095143222L;
        mm.hcgf[194] = 5953129919654842142L;
        mm.hcgf[195] = 7856069684235588142L;
        mm.hcgf[196] = -2562607599212035121L;
        mm.hcgf[197] = -6308320899211607882L;
        mm.hcgf[198] = -8304868277200158155L;
        mm.hcgf[199] = 8000022740234700958L;
    }

    private static /* synthetic */ void helv() {
        mm.hcfz[300] = -693158;
        mm.hcfz[301] = -392482538;
        mm.hcfz[302] = -1754274012;
        mm.hcfz[303] = -286769503;
        mm.hcfz[304] = 937304250;
        mm.hcfz[305] = -987443413;
        mm.hcfz[306] = -1496755618;
        mm.hcfz[307] = 1814293048;
        mm.hcfz[308] = -242765630;
        mm.hcfz[309] = -772779601;
        mm.hcfz[310] = -1825532545;
        mm.hcfz[311] = -2010284824;
        mm.hcfz[312] = 999019745;
        mm.hcfz[313] = 845756605;
        mm.hcfz[314] = 379730735;
        mm.hcfz[315] = 1626537732;
        mm.hcfz[316] = -1898874980;
        mm.hcfz[317] = -1021992417;
        mm.hcfz[318] = -655288196;
        mm.hcfz[319] = -2108809861;
        mm.hcfz[320] = 1728314237;
        mm.hcfz[321] = 1109936696;
        mm.hcfz[322] = 1827505643;
        mm.hcfz[323] = -479236262;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Comparator<ds> moduleComparator() {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hcmh", hcge(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1082246435: {
                    break block36;
                }
                case -355398814: {
                    v1 = mm.hcga("hcmi", hcge(int ), (int)69);
                    continue block36;
                }
                case 1631048276: {
                    v1 = mm.hcga("hcmj", hcge(int ), (int)70);
                    continue block36;
                }
            }
            break;
        }
        var2 = mm.c;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl19
        block37: while (true) {
            v2 /* !! */  = (long)(mm.hcga("hcml", hcge(int ), (int)72) - mm.hcga("hcmk", hcge(int ), (int)71));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1082246435: {
                    break block37;
                }
                case 1939647743: {
                    continue block37;
                }
            }
            break;
        }
        var1_1 /* !! */  = mm.b;
        v3 /* !! */  = mm.ob;
        if (true) ** GOTO lbl29
        block38: while (true) {
            v3 /* !! */  = (long)(mm.hcga("hcmn", hcge(int ), (int)74) - mm.hcga("hcmm", hcge(int ), (int)73));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1554609130: {
                    continue block38;
                }
                case -1082246435: {
                    break block38;
                }
            }
            break;
        }
        var0_2 = mm.a;
        if (!var2) ** GOTO lbl41
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var0_2 || var0_2) continue block39;
                v4 /* !! */  = mm.ob;
                if (true) ** GOTO lbl46
                block40: while (true) {
                    v4 /* !! */  = (long)(v5 - mm.hcga("hcmo", hcge(int ), (int)75));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1082246435: {
                            break block40;
                        }
                        case -501487090: {
                            v5 = mm.hcga("hcmp", hcge(int ), (int)76);
                            continue block40;
                        }
                        case 66144210: {
                            v5 = mm.hcga("hcmq", hcge(int ), (int)77);
                            continue block40;
                        }
                        case 615393813: {
                            v5 = mm.hcga("hcmr", hcge(int ), (int)78);
                            continue block40;
                        }
                    }
                    break;
                }
                v6 = (ToIntFunction<ds>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, lambda$moduleComparator$3(ruhack.phobia.ds ), (Lruhack/phobia/ds;)I)();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcms", hcge(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mm.hcga("hcmt", hcfx(int ), (int)91)) break;
                    v7 /* !! */  = (long)mm.hcga("hcmu", hcfx(int ), (int)92);
                }
                v8 = Comparator.comparingInt(v6);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcmv", hcge(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == mm.hcga("hcmw", hcfx(int ), (int)93)) break;
                    v9 /* !! */  = (long)mm.hcga("hcmx", hcfx(int ), (int)94);
                }
                v10 = (ToIntFunction<ds>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, lambda$moduleComparator$4(ruhack.phobia.ds ), (Lruhack/phobia/ds;)I)();
                v11 /* !! */  = mm.ob;
                if (true) ** GOTO lbl75
                block43: while (true) {
                    v11 /* !! */  = (long)(v12 - mm.hcga("hcmy", hcge(int ), (int)81));
lbl75:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1082246435: {
                            break block43;
                        }
                        case -185146349: {
                            v12 = mm.hcga("hcmz", hcge(int ), (int)82);
                            continue block43;
                        }
                        case 61052886: {
                            v12 = mm.hcga("hcna", hcge(int ), (int)83);
                            continue block43;
                        }
                        case 1417894371: {
                            v12 = mm.hcga("hcnb", hcge(int ), (int)84);
                            continue block43;
                        }
                    }
                    break;
                }
                v13 = v8.thenComparingInt(v10);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcnc", hcge(int ), (int)85)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == mm.hcga("hcnd", hcfx(int ), (int)95)) break;
                    v14 /* !! */  = (long)mm.hcga("hcne", hcfx(int ), (int)96);
                }
                v15 = (Function<ds, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getName(), (Lruhack/phobia/ds;)Ljava/lang/String;)();
                v16 /* !! */  = mm.ob;
                if (true) ** GOTO lbl98
                block45: while (true) {
                    v16 /* !! */  = (long)(v17 - mm.hcga("hcnf", hcge(int ), (int)86));
lbl98:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1623342649: {
                            v17 = mm.hcga("hcng", hcge(int ), (int)87);
                            continue block45;
                        }
                        case -1082246435: {
                            break block45;
                        }
                        case 1883431432: {
                            v17 = mm.hcga("hcnh", hcge(int ), (int)88);
                            continue block45;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcni", hcge(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == mm.hcga("hcnj", hcfx(int ), (int)97)) break;
                    v18 /* !! */  = (long)mm.hcga("hcnk", hcfx(int ), (int)98);
                }
                return v13.thenComparing(v15, String.CASE_INSENSITIVE_ORDER);
                case 0: {
                    var1_1 /* !! */  = (int)mm.hcga("hcnl", hcfx(int ), (int)99);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)mm.hcga("hcnm", hcfx(int ), (int)100);
                    if (!var2) break block39;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)mm.hcga("hcnn", hcfx(int ), (int)101);
                        if (!var2) break block39;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)mm.hcga("hcno", hcfx(int ), (int)102);
        ** while (!var2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isVisible(ds var0) {
        v0 /* !! */  = mm.ob;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - mm.hcga("hcgh", hcge(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2080725945: {
                    v1 = mm.hcga("hcgi", hcge(int ), (int)1);
                    continue block34;
                }
                case -1082246435: {
                    break block34;
                }
                case 1750194314: {
                    v1 = mm.hcga("hcgj", hcge(int ), (int)2);
                    continue block34;
                }
            }
            break;
        }
        var3_1 = mm.c;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl19
        block35: while (true) {
            v2 /* !! */  = (long)(mm.hcga("hcgl", hcge(int ), (int)4) - mm.hcga("hcgk", hcge(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2016144052: {
                    continue block35;
                }
                case -1082246435: {
                    break block35;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm.b;
        v3 /* !! */  = mm.ob;
        if (true) ** GOTO lbl29
        block36: while (true) {
            v3 /* !! */  = (long)(v4 - mm.hcga("hcgm", hcge(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1082246435: {
                    break block36;
                }
                case -826122798: {
                    v4 = mm.hcga("hcgn", hcge(int ), (int)6);
                    continue block36;
                }
                case 1491856974: {
                    v4 = mm.hcga("hcgo", hcge(int ), (int)7);
                    continue block36;
                }
                case 1635166892: {
                    v4 = mm.hcga("hcgp", hcge(int ), (int)8);
                    continue block36;
                }
            }
            break;
        }
        var1_3 = mm.a;
        if (var3_1) {
            throw null;
lbl44:
            // 5 sources

            return (boolean)mm.hcga("hcgq", hcfx(int ), (int)3);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcgr", hcge(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mm.hcga("hcgs", hcfx(int ), (int)4)) break;
                    v5 /* !! */  = (long)mm.hcga("hcgt", hcfx(int ), (int)5);
                }
                v6 = var0.getName();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcgu", hcge(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mm.hcga("hcgv", hcfx(int ), (int)6)) break;
                    v7 /* !! */  = (long)mm.hcga("hcgw", hcfx(int ), (int)7);
                }
                if ("AncientExploit".equals(v6)) ** GOTO lbl87
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcgx", hcge(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == mm.hcga("hcgy", hcfx(int ), (int)8)) break;
                    v8 /* !! */  = (long)mm.hcga("hcgz", hcfx(int ), (int)9);
                }
                v9 = var0.getName();
                v10 /* !! */  = mm.ob;
                if (true) ** GOTO lbl73
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - mm.hcga("hcha", hcge(int ), (int)12));
lbl73:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1082246435: {
                            break block41;
                        }
                        case -189528728: {
                            v11 = mm.hcga("hchb", hcge(int ), (int)13);
                            continue block41;
                        }
                        case 740632080: {
                            v11 = mm.hcga("hchc", hcge(int ), (int)14);
                            continue block41;
                        }
                        case 1344798916: {
                            v11 = mm.hcga("hchd", hcge(int ), (int)15);
                            continue block41;
                        }
                    }
                    break;
                }
                if ("AncientFarm".equals(v9)) ** GOTO lbl92
                if (var1_3) ** GOTO lbl44
lbl87:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl44
                v12 = mm.hcga("hche", hcfx(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
lbl92:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v12 = mm.hcga("hchf", hcfx(int ), (int)11);
lbl95:
                // 2 sources

                return (boolean)v12;
            }
            case 0: {
                var2_2 /* !! */  = (int)mm.hcga("hchg", hcfx(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl101:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mm.hcga("hchh", hcfx(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mm.hcga("hchi", hcfx(int ), (int)14);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
lbl111:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mm.hcga("hchj", hcfx(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 4: {
                var2_2 /* !! */  = (int)mm.hcga("hchk", hcfx(int ), (int)16);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)mm.hcga("hchl", hcfx(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl125:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)mm.hcga("hchm", hcfx(int ), (int)18);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl129:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)mm.hcga("hchn", hcfx(int ), (int)19);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)mm.hcga("hcho", hcfx(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
lbl138:
            // 2 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)mm.hcga("hchp", hcfx(int ), (int)21);
                } while (!var3_1);
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)mm.hcga("hchq", hcfx(int ), (int)22);
        ** while (!var3_1)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int lambda$moduleComparator$3(ds var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcuv", hcge(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcuw", hcfx(int ), (int)208)) break;
            v0 /* !! */  = (long)mm.hcga("hcux", hcfx(int ), (int)209);
        }
        var3_1 = mm.c;
        while (true) {
            block26: {
                if ((v1 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcuy", hcge(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != mm.hcga("hcuz", hcfx(int ), (int)210)) break block26;
                var2_2 /* !! */  = mm.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)mm.hcga("hcva", hcfx(int ), (int)211);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v2 /* !! */  = mm.ob;
                    block15: while (true) {
                        switch ((int)v2 /* !! */ ) {
                            case -2112074293: {
                                v3 = mm.hcga("hcvc", hcge(int ), (int)176);
                                ** GOTO lbl34
                            }
                            case -1082246435: {
                                break block15;
                            }
                            case -825753621: {
                                v3 = mm.hcga("hcvd", hcge(int ), (int)177);
                                ** GOTO lbl34
                            }
                            case 593945159: {
                                v3 = mm.hcga("hcve", hcge(int ), (int)178);
lbl34:
                                // 3 sources

                                v2 /* !! */  = (long)(v3 - mm.hcga("hcvb", hcge(int ), (int)175));
                                continue block15;
                            }
                        }
                        break;
                    }
                    var1_3 = mm.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (int)mm.hcga("hcvf", hcfx(int ), (int)212);
                    if (var1_3 != false) return (int)mm.hcga("hcvf", hcfx(int ), (int)212);
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcvg", hcge(int ), (int)179)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == mm.hcga("hcvh", hcfx(int ), (int)213)) {
                            v5 = mm.entry(var0);
                            ** break;
                        }
                        v4 /* !! */  = (long)mm.hcga("hcvi", hcfx(int ), (int)214);
                    }
                }
                case 3: {
                    var2_2 /* !! */  = (int)mm.hcga("hcvp", hcfx(int ), (int)220);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
lbl53:
                // 1 sources

                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hcvj", hcge(int ), (int)180)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mm.hcga("hcvk", hcfx(int ), (int)215)) {
                        return v5.sectionOrder;
                    }
                    v6 /* !! */  = (long)mm.hcga("hcvl", hcfx(int ), (int)216);
                }
                case 0: {
                    var2_2 /* !! */  = (int)mm.hcga("hcvm", hcfx(int ), (int)217);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mm.hcga("hcvn", hcfx(int ), (int)218);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl71
            break;
        }
        do {
            if (true) ** continue;
lbl71:
            // 2 sources

            var2_2 /* !! */  = (int)mm.hcga("hcvo", hcfx(int ), (int)219);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void helo() {
        mm.hcfy[0] = -1956162655;
        mm.hcfy[1] = 1118555424;
        mm.hcfy[2] = -1448660474;
        mm.hcfy[3] = -1892671872;
        mm.hcfy[4] = 101199566;
        mm.hcfy[5] = -2817519;
        mm.hcfy[6] = 2049038726;
        mm.hcfy[7] = 1210080237;
        mm.hcfy[8] = -1680774764;
        mm.hcfy[9] = 2041474317;
        mm.hcfy[10] = 2056425646;
        mm.hcfy[11] = 177018569;
        mm.hcfy[12] = -1177287072;
        mm.hcfy[13] = 2123950394;
        mm.hcfy[14] = 2144811546;
        mm.hcfy[15] = -327565315;
        mm.hcfy[16] = -807175580;
        mm.hcfy[17] = -404835294;
        mm.hcfy[18] = 1308488638;
        mm.hcfy[19] = 396581402;
        mm.hcfy[20] = 520054454;
        mm.hcfy[21] = 539194862;
        mm.hcfy[22] = -761005868;
        mm.hcfy[23] = -631894121;
        mm.hcfy[24] = -1815732083;
        mm.hcfy[25] = 1357848637;
        mm.hcfy[26] = 483857668;
        mm.hcfy[27] = 107385019;
        mm.hcfy[28] = -2029567813;
        mm.hcfy[29] = 211584742;
        mm.hcfy[30] = 553847343;
        mm.hcfy[31] = -1213345601;
        mm.hcfy[32] = 1226045260;
        mm.hcfy[33] = 887029861;
        mm.hcfy[34] = 2079524813;
        mm.hcfy[35] = 1581989035;
        mm.hcfy[36] = -1068982239;
        mm.hcfy[37] = 1959188079;
        mm.hcfy[38] = 679643546;
        mm.hcfy[39] = -1391378486;
        mm.hcfy[40] = 269079180;
        mm.hcfy[41] = 360761438;
        mm.hcfy[42] = 765520269;
        mm.hcfy[43] = -1833283667;
        mm.hcfy[44] = -1351858505;
        mm.hcfy[45] = 1890131855;
        mm.hcfy[46] = 267471094;
        mm.hcfy[47] = -689042020;
        mm.hcfy[48] = 1756802651;
        mm.hcfy[49] = 1696182426;
        mm.hcfy[50] = -1966253346;
        mm.hcfy[51] = -925681021;
        mm.hcfy[52] = -1795352372;
        mm.hcfy[53] = 190825116;
        mm.hcfy[54] = -1039370543;
        mm.hcfy[55] = -806426678;
        mm.hcfy[56] = 567767928;
        mm.hcfy[57] = 837170836;
        mm.hcfy[58] = -472689248;
        mm.hcfy[59] = 941299346;
        mm.hcfy[60] = 344382565;
        mm.hcfy[61] = 333548119;
        mm.hcfy[62] = 1366160799;
        mm.hcfy[63] = -1139086508;
        mm.hcfy[64] = -409514695;
        mm.hcfy[65] = -887596510;
        mm.hcfy[66] = 1847889560;
        mm.hcfy[67] = 1727510838;
        mm.hcfy[68] = 1364690000;
        mm.hcfy[69] = 319692981;
        mm.hcfy[70] = -939088111;
        mm.hcfy[71] = 284573476;
        mm.hcfy[72] = 1789162839;
        mm.hcfy[73] = -1133193493;
        mm.hcfy[74] = 692221005;
        mm.hcfy[75] = -1112525897;
        mm.hcfy[76] = 861131736;
        mm.hcfy[77] = 520175857;
        mm.hcfy[78] = 701124620;
        mm.hcfy[79] = 182540544;
        mm.hcfy[80] = 624227236;
        mm.hcfy[81] = -1739055615;
        mm.hcfy[82] = -1938228495;
        mm.hcfy[83] = -1988932989;
        mm.hcfy[84] = -1305017464;
        mm.hcfy[85] = 559230744;
        mm.hcfy[86] = -1385817775;
        mm.hcfy[87] = 2054341388;
        mm.hcfy[88] = -215511937;
        mm.hcfy[89] = -813514492;
        mm.hcfy[90] = 1006172674;
        mm.hcfy[91] = -1334730018;
        mm.hcfy[92] = -1578793675;
        mm.hcfy[93] = -782623022;
        mm.hcfy[94] = 1830774954;
        mm.hcfy[95] = 2040724132;
        mm.hcfy[96] = -1065708035;
        mm.hcfy[97] = -1772537426;
        mm.hcfy[98] = 1279369485;
        mm.hcfy[99] = -1599915997;
    }

    private static /* synthetic */ void help() {
        mm.hcfy[100] = 1176030152;
        mm.hcfy[101] = -2000860255;
        mm.hcfy[102] = -975724067;
        mm.hcfy[103] = 239665450;
        mm.hcfy[104] = -1675001463;
        mm.hcfy[105] = 1209138512;
        mm.hcfy[106] = -1589609854;
        mm.hcfy[107] = -628744097;
        mm.hcfy[108] = -1304764345;
        mm.hcfy[109] = -868399403;
        mm.hcfy[110] = 2013449510;
        mm.hcfy[111] = 1233001093;
        mm.hcfy[112] = 393689694;
        mm.hcfy[113] = 2093679242;
        mm.hcfy[114] = -487774464;
        mm.hcfy[115] = 1746111483;
        mm.hcfy[116] = -371204028;
        mm.hcfy[117] = 1669701558;
        mm.hcfy[118] = 788176970;
        mm.hcfy[119] = 1880229834;
        mm.hcfy[120] = -833858863;
        mm.hcfy[121] = 1416185221;
        mm.hcfy[122] = 1952033026;
        mm.hcfy[123] = 1199604986;
        mm.hcfy[124] = -1049335296;
        mm.hcfy[125] = 1614211176;
        mm.hcfy[126] = -41789574;
        mm.hcfy[127] = -1438266125;
        mm.hcfy[128] = -2021292133;
        mm.hcfy[129] = -914618210;
        mm.hcfy[130] = 1119650084;
        mm.hcfy[131] = -1214595026;
        mm.hcfy[132] = 350143166;
        mm.hcfy[133] = -1545202654;
        mm.hcfy[134] = -2101590684;
        mm.hcfy[135] = -152283136;
        mm.hcfy[136] = -2076762168;
        mm.hcfy[137] = 1852832664;
        mm.hcfy[138] = -135455541;
        mm.hcfy[139] = -1209450356;
        mm.hcfy[140] = 156444517;
        mm.hcfy[141] = 403741174;
        mm.hcfy[142] = -1594927026;
        mm.hcfy[143] = -396621827;
        mm.hcfy[144] = 40063727;
        mm.hcfy[145] = -138394720;
        mm.hcfy[146] = 1335865627;
        mm.hcfy[147] = 475069028;
        mm.hcfy[148] = -1428918099;
        mm.hcfy[149] = -1264848852;
        mm.hcfy[150] = 1067770533;
        mm.hcfy[151] = 1567289248;
        mm.hcfy[152] = -1482296295;
        mm.hcfy[153] = 1291003603;
        mm.hcfy[154] = 1045973894;
        mm.hcfy[155] = 1335156951;
        mm.hcfy[156] = -1438070436;
        mm.hcfy[157] = 1146434736;
        mm.hcfy[158] = -1318612398;
        mm.hcfy[159] = -1970990433;
        mm.hcfy[160] = 2131075310;
        mm.hcfy[161] = 1023592282;
        mm.hcfy[162] = 430586704;
        mm.hcfy[163] = 488219813;
        mm.hcfy[164] = -649537751;
        mm.hcfy[165] = -521601024;
        mm.hcfy[166] = -1104023362;
        mm.hcfy[167] = 555060174;
        mm.hcfy[168] = 1913251171;
        mm.hcfy[169] = -1985113155;
        mm.hcfy[170] = 1048741283;
        mm.hcfy[171] = -501128155;
        mm.hcfy[172] = 57455635;
        mm.hcfy[173] = -1351760165;
        mm.hcfy[174] = 849599594;
        mm.hcfy[175] = 1008919298;
        mm.hcfy[176] = -2103777884;
        mm.hcfy[177] = 808924002;
        mm.hcfy[178] = 205770125;
        mm.hcfy[179] = -2056866036;
        mm.hcfy[180] = 1598120314;
        mm.hcfy[181] = -1681628520;
        mm.hcfy[182] = 1833708902;
        mm.hcfy[183] = -1105984971;
        mm.hcfy[184] = -889036817;
        mm.hcfy[185] = -1253085853;
        mm.hcfy[186] = -2013666228;
        mm.hcfy[187] = 1900789944;
        mm.hcfy[188] = 121857927;
        mm.hcfy[189] = 1410138325;
        mm.hcfy[190] = 2036174391;
        mm.hcfy[191] = 307462870;
        mm.hcfy[192] = -893626609;
        mm.hcfy[193] = 41633713;
        mm.hcfy[194] = 1635203068;
        mm.hcfy[195] = -570147140;
        mm.hcfy[196] = -1677636260;
        mm.hcfy[197] = -1865580502;
        mm.hcfy[198] = -1281856456;
        mm.hcfy[199] = 1086697551;
    }

    private static /* synthetic */ void hels() {
        mm.hcfz[0] = -1956162655;
        mm.hcfz[1] = 1118555424;
        mm.hcfz[2] = -1448660474;
        mm.hcfz[3] = -1892671871;
        mm.hcfz[4] = -101199567;
        mm.hcfz[5] = 1051600587;
        mm.hcfz[6] = -2049038727;
        mm.hcfz[7] = 550759354;
        mm.hcfz[8] = 1680774763;
        mm.hcfz[9] = 403791100;
        mm.hcfz[10] = 2056425647;
        mm.hcfz[11] = 177018569;
        mm.hcfz[12] = -1177287068;
        mm.hcfz[13] = 2123950395;
        mm.hcfz[14] = 2144811550;
        mm.hcfz[15] = -327565319;
        mm.hcfz[16] = -807175580;
        mm.hcfz[17] = -404835288;
        mm.hcfz[18] = 1308488638;
        mm.hcfz[19] = 396581406;
        mm.hcfz[20] = 520054455;
        mm.hcfz[21] = 539194863;
        mm.hcfz[22] = -761005870;
        mm.hcfz[23] = 631894120;
        mm.hcfz[24] = 1858073423;
        mm.hcfz[25] = 1357848636;
        mm.hcfz[26] = -781069819;
        mm.hcfz[27] = 107385018;
        mm.hcfz[28] = -2106650901;
        mm.hcfz[29] = -211584743;
        mm.hcfz[30] = -1007846893;
        mm.hcfz[31] = -1213345602;
        mm.hcfz[32] = 49392393;
        mm.hcfz[33] = -887029862;
        mm.hcfz[34] = -2104888465;
        mm.hcfz[35] = 1581989027;
        mm.hcfz[36] = -1068982239;
        mm.hcfz[37] = 1959188075;
        mm.hcfz[38] = 679643548;
        mm.hcfz[39] = -1391378488;
        mm.hcfz[40] = 269079181;
        mm.hcfz[41] = 360761432;
        mm.hcfz[42] = 765520269;
        mm.hcfz[43] = -1833283668;
        mm.hcfz[44] = -1351858497;
        mm.hcfz[45] = -1890131856;
        mm.hcfz[46] = 1804612895;
        mm.hcfz[47] = 689042019;
        mm.hcfz[48] = -657334239;
        mm.hcfz[49] = -1696182427;
        mm.hcfz[50] = 964254088;
        mm.hcfz[51] = 925681020;
        mm.hcfz[52] = 1999707859;
        mm.hcfz[53] = -190825117;
        mm.hcfz[54] = -2001383105;
        mm.hcfz[55] = -806426680;
        mm.hcfz[56] = 567767928;
        mm.hcfz[57] = 837170835;
        mm.hcfz[58] = -472689244;
        mm.hcfz[59] = 941299349;
        mm.hcfz[60] = 344382567;
        mm.hcfz[61] = 333548121;
        mm.hcfz[62] = 1366160782;
        mm.hcfz[63] = -1139086499;
        mm.hcfz[64] = -409514691;
        mm.hcfz[65] = -887596494;
        mm.hcfz[66] = 1847889558;
        mm.hcfz[67] = 1727510840;
        mm.hcfz[68] = 1364690013;
        mm.hcfz[69] = 319692982;
        mm.hcfz[70] = -939088112;
        mm.hcfz[71] = 284573479;
        mm.hcfz[72] = 1789162822;
        mm.hcfz[73] = -1133193499;
        mm.hcfz[74] = 692221020;
        mm.hcfz[75] = 1112525896;
        mm.hcfz[76] = -547669449;
        mm.hcfz[77] = -520175858;
        mm.hcfz[78] = 1364275409;
        mm.hcfz[79] = -182540545;
        mm.hcfz[80] = 593734118;
        mm.hcfz[81] = 1739055614;
        mm.hcfz[82] = -742489698;
        mm.hcfz[83] = 1988932988;
        mm.hcfz[84] = 440942180;
        mm.hcfz[85] = -559230745;
        mm.hcfz[86] = 890781345;
        mm.hcfz[87] = 2054341388;
        mm.hcfz[88] = -215511940;
        mm.hcfz[89] = -813514491;
        mm.hcfz[90] = 1006172674;
        mm.hcfz[91] = 1334730017;
        mm.hcfz[92] = -401694596;
        mm.hcfz[93] = 782623021;
        mm.hcfz[94] = 1621223385;
        mm.hcfz[95] = 2040724133;
        mm.hcfz[96] = -1517685852;
        mm.hcfz[97] = 1772537425;
        mm.hcfz[98] = -210853314;
        mm.hcfz[99] = -1599915998;
    }

    private static /* synthetic */ void helr() {
        mm.hcfy[300] = -693153;
        mm.hcfy[301] = -392482544;
        mm.hcfy[302] = -1754274012;
        mm.hcfy[303] = -286769504;
        mm.hcfy[304] = 937304248;
        mm.hcfy[305] = -987443416;
        mm.hcfy[306] = -1496755622;
        mm.hcfy[307] = 1814293053;
        mm.hcfy[308] = -242765630;
        mm.hcfy[309] = -772779602;
        mm.hcfy[310] = -1825532547;
        mm.hcfy[311] = -2010284821;
        mm.hcfy[312] = 999019745;
        mm.hcfy[313] = 845756604;
        mm.hcfy[314] = 379730733;
        mm.hcfy[315] = 1626537735;
        mm.hcfy[316] = -1898874980;
        mm.hcfy[317] = -1021992418;
        mm.hcfy[318] = -655288194;
        mm.hcfy[319] = -2108809864;
        mm.hcfy[320] = 1728314233;
        mm.hcfy[321] = 1109936696;
        mm.hcfy[322] = 1827505642;
        mm.hcfy[323] = -479236262;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static mm$Entry entry(ds ds2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ob - mm.hcga("hcoi", hcge(int ), (int)99)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mm.hcga("hcoj", hcfx(int ), (int)113)) break;
            object = mm.hcga("hcok", hcfx(int ), (int)114);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ob - mm.hcga("hcol", hcge(int ), (int)100)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mm.hcga("hcom", hcfx(int ), (int)115)) break;
            object = mm.hcga("hcon", hcfx(int ), (int)116);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ob - mm.hcga("hcoo", hcge(int ), (int)101)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == mm.hcga("hcop", hcfx(int ), (int)117)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = mm.hcga("hcoq", hcfx(int ), (int)118);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ob - mm.hcga("hcor", hcge(int ), (int)102)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == mm.hcga("hcos", hcfx(int ), (int)119)) break;
            object = mm.hcga("hcot", hcfx(int ), (int)120);
        }
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = ob - mm.hcga("hcou", hcge(int ), (int)103)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == mm.hcga("hcov", hcfx(int ), (int)121)) break;
            object = mm.hcga("hcow", hcfx(int ), (int)122);
        }
        String string = ds2.getName();
        Object object = ob;
        block20: while (true) {
            switch ((int)object) {
                case -1082246435: {
                    break block20;
                }
                case 1542459449: {
                    object = mm.hcga("hcoy", hcge(int ), (int)105) - mm.hcga("hcox", hcge(int ), (int)104);
                    continue block20;
                }
            }
            break;
        }
        Object object2 = ob;
        boolean bl4 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - mm.hcga("hcoz", hcge(int ), (int)106);
            }
            switch ((int)object2) {
                case -1082246435: {
                    break block21;
                }
                case -1046875463: {
                    callSite = mm.hcga("hcpa", hcge(int ), (int)107);
                    continue block21;
                }
                case 354169342: {
                    callSite = mm.hcga("hcpb", hcge(int ), (int)108);
                    continue block21;
                }
                case 1972003433: {
                    callSite = mm.hcga("hcpc", hcge(int ), (int)109);
                    continue block21;
                }
            }
            break;
        }
        du du2 = ds2.getCategory();
        Object object3 = ob;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - mm.hcga("hcpd", hcge(int ), (int)110);
            }
            switch ((int)object3) {
                case -1082246435: {
                    break block22;
                }
                case 588081650: {
                    callSite = mm.hcga("hcpe", hcge(int ), (int)111);
                    continue block22;
                }
                case 1876604633: {
                    callSite = mm.hcga("hcpf", hcge(int ), (int)112);
                    continue block22;
                }
            }
            break;
        }
        String string2 = du2.getReadableName();
        CallSite callSite2 = mm.hcga("hcpg", hcfx(int ), (int)123);
        callSite2 = mm.hcga("hcph", hcfx(int ), (int)124);
        while (true) {
            long l7;
            Object object4;
            if ((object4 = (l7 = ob - mm.hcga("hcpi", hcge(int ), (int)113)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object4 == mm.hcga("hcpj", hcfx(int ), (int)125)) break;
            object4 = mm.hcga("hcpk", hcfx(int ), (int)126);
        }
        String string3 = mm.description(ds2);
        while (true) {
            long l8;
            Object object5;
            if ((object5 = (l8 = ob - mm.hcga("hcpl", hcge(int ), (int)114)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            if (object5 == mm.hcga("hcpm", hcfx(int ), (int)127)) break;
            object5 = mm.hcga("hcpn", hcfx(int ), (int)128);
        }
        mm$Entry mm$Entry = new mm$Entry(string2, (int)callSite, (int)callSite2, string3);
        while (true) {
            long l9;
            Object object6;
            if ((object6 = (l9 = ob - mm.hcga("hcpo", hcge(int ), (int)115)) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false) continue;
            if (object6 == mm.hcga("hcpp", hcfx(int ), (int)129)) {
                return ENTRIES.getOrDefault(string, mm$Entry);
            }
            object6 = mm.hcga("hcpq", hcfx(int ), (int)130);
        }
    }

    private static /* synthetic */ int hcfx(int n2) {
        return hcfy[n2] ^ hcfz[n2];
    }

    private static /* synthetic */ void hemb() {
        mm.hcgg[0] = -8562301417707145376L;
        mm.hcgg[1] = -8145032612305236892L;
        mm.hcgg[2] = -2406116345886104651L;
        mm.hcgg[3] = -7941754169590905940L;
        mm.hcgg[4] = -6471789039537178133L;
        mm.hcgg[5] = 3269099675639800505L;
        mm.hcgg[6] = -3126055589450477194L;
        mm.hcgg[7] = 6203671263444049062L;
        mm.hcgg[8] = 8850743315357722475L;
        mm.hcgg[9] = 498926898082078688L;
        mm.hcgg[10] = 6956657846351281230L;
        mm.hcgg[11] = -8713390849442203915L;
        mm.hcgg[12] = -2368485581783203718L;
        mm.hcgg[13] = 2956010764039221921L;
        mm.hcgg[14] = -2961357986500745555L;
        mm.hcgg[15] = -3673030363772670791L;
        mm.hcgg[16] = -2758150417914441042L;
        mm.hcgg[17] = 1724636844483312359L;
        mm.hcgg[18] = -2160827729178952574L;
        mm.hcgg[19] = 4460912231907899616L;
        mm.hcgg[20] = 7933887507515644040L;
        mm.hcgg[21] = -3651158999840796766L;
        mm.hcgg[22] = -5626059165310897927L;
        mm.hcgg[23] = 8822253835886660328L;
        mm.hcgg[24] = -5491011817930170565L;
        mm.hcgg[25] = -5679247780885436776L;
        mm.hcgg[26] = 7096338438497785661L;
        mm.hcgg[27] = 7915833698567415496L;
        mm.hcgg[28] = -488614398564637973L;
        mm.hcgg[29] = 7760172305856269203L;
        mm.hcgg[30] = 172417391925475787L;
        mm.hcgg[31] = 7945613059111398527L;
        mm.hcgg[32] = -7680795773126114574L;
        mm.hcgg[33] = 7920350460839682486L;
        mm.hcgg[34] = 927711874966575645L;
        mm.hcgg[35] = -1362408313830941691L;
        mm.hcgg[36] = -2565918146834289536L;
        mm.hcgg[37] = 3123678546110021978L;
        mm.hcgg[38] = -486466897134641870L;
        mm.hcgg[39] = -8276603807931750562L;
        mm.hcgg[40] = -8361634134768197575L;
        mm.hcgg[41] = 1077352606566110235L;
        mm.hcgg[42] = -222104989039845196L;
        mm.hcgg[43] = -581558063729350991L;
        mm.hcgg[44] = -8681399225362354358L;
        mm.hcgg[45] = -1909942108289462306L;
        mm.hcgg[46] = 7319591884957075129L;
        mm.hcgg[47] = -3471514702478663740L;
        mm.hcgg[48] = -3525775865937489361L;
        mm.hcgg[49] = 219555745447806325L;
        mm.hcgg[50] = 6824381290033134268L;
        mm.hcgg[51] = -6455718432123684792L;
        mm.hcgg[52] = -9103642551804114099L;
        mm.hcgg[53] = 1730271781018525411L;
        mm.hcgg[54] = 3495686211577839377L;
        mm.hcgg[55] = 8462783952932423917L;
        mm.hcgg[56] = -2739481477059698332L;
        mm.hcgg[57] = -7694775640976843772L;
        mm.hcgg[58] = -7535338051039327663L;
        mm.hcgg[59] = 2697178601562109573L;
        mm.hcgg[60] = -8339755232203537338L;
        mm.hcgg[61] = -2360597462408156539L;
        mm.hcgg[62] = -5293376759915947838L;
        mm.hcgg[63] = -4948416059998515955L;
        mm.hcgg[64] = 1284431074634004383L;
        mm.hcgg[65] = 643126439223941961L;
        mm.hcgg[66] = -8697679059423331652L;
        mm.hcgg[67] = 4305518785501037921L;
        mm.hcgg[68] = -8375668932282457745L;
        mm.hcgg[69] = -534181859570988300L;
        mm.hcgg[70] = -6821641102209734541L;
        mm.hcgg[71] = 7746746602248029119L;
        mm.hcgg[72] = -1545195167575751657L;
        mm.hcgg[73] = 161227136264696055L;
        mm.hcgg[74] = -6168050283730658441L;
        mm.hcgg[75] = 5807658268847189197L;
        mm.hcgg[76] = 3684895454113861550L;
        mm.hcgg[77] = 6413401927037342626L;
        mm.hcgg[78] = -7166806417401391992L;
        mm.hcgg[79] = 1971225865186848221L;
        mm.hcgg[80] = 2708297967756354301L;
        mm.hcgg[81] = 2961065583826700785L;
        mm.hcgg[82] = -8655887486266337474L;
        mm.hcgg[83] = 5580292008658021030L;
        mm.hcgg[84] = 8480831961337069902L;
        mm.hcgg[85] = 4136188269104743650L;
        mm.hcgg[86] = 3322714379358089296L;
        mm.hcgg[87] = 1202858667692795653L;
        mm.hcgg[88] = -3536073232061306405L;
        mm.hcgg[89] = -6288876872372846892L;
        mm.hcgg[90] = 493300580153427429L;
        mm.hcgg[91] = 5386868407430558113L;
        mm.hcgg[92] = -9002466537853262747L;
        mm.hcgg[93] = -1367366625989519897L;
        mm.hcgg[94] = -4926261848218592192L;
        mm.hcgg[95] = -8695213048465671401L;
        mm.hcgg[96] = -5830291492250427692L;
        mm.hcgg[97] = 665809505705771407L;
        mm.hcgg[98] = -6772686409855773806L;
        mm.hcgg[99] = -2279728875860429259L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$comparator$2(px var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcvq", hcge(int ), (int)181)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcvr", hcfx(int ), (int)221)) break;
            v0 /* !! */  = (long)mm.hcga("hcvs", hcfx(int ), (int)222);
        }
        var3_1 = mm.c;
        v1 /* !! */  = mm.ob;
        if (true) ** GOTO lbl11
        block11: while (true) {
            v1 /* !! */  = (long)(mm.hcga("hcvu", hcge(int ), (int)183) - mm.hcga("hcvt", hcge(int ), (int)182));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1082246435: {
                    break block11;
                }
                case 1143248881: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = mm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcvv", hcge(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mm.hcga("hcvw", hcfx(int ), (int)223)) break;
            v2 /* !! */  = (long)mm.hcga("hcvx", hcfx(int ), (int)224);
        }
        var1_3 = mm.a;
        if (var3_1) {
            throw null;
lbl25:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcvy", hcge(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == mm.hcga("hcvz", hcfx(int ), (int)225)) break;
                    v3 /* !! */  = (long)mm.hcga("hcwa", hcfx(int ), (int)226);
                }
                v4 = var0.getModule();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcwb", hcge(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mm.hcga("hcwc", hcfx(int ), (int)227)) break;
                    v5 /* !! */  = (long)mm.hcga("hcwd", hcfx(int ), (int)228);
                }
                return v4.getName();
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mm.hcga("hcwe", hcfx(int ), (int)229);
                if (!var3_1) break;
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mm.hcga("hcwf", hcfx(int ), (int)230);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mm.hcga("hcwg", hcfx(int ), (int)231);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)mm.hcga("hcwh", hcfx(int ), (int)232);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void helq() {
        mm.hcfy[200] = 2121737302;
        mm.hcfy[201] = 1219407361;
        mm.hcfy[202] = 449326303;
        mm.hcfy[203] = 366406158;
        mm.hcfy[204] = 145581188;
        mm.hcfy[205] = 1171495935;
        mm.hcfy[206] = -452460129;
        mm.hcfy[207] = 866970437;
        mm.hcfy[208] = -2022590969;
        mm.hcfy[209] = 1922341154;
        mm.hcfy[210] = -322483892;
        mm.hcfy[211] = 2074967683;
        mm.hcfy[212] = 1116072205;
        mm.hcfy[213] = -634707855;
        mm.hcfy[214] = -1312561163;
        mm.hcfy[215] = 800635669;
        mm.hcfy[216] = -88210796;
        mm.hcfy[217] = 1574828272;
        mm.hcfy[218] = -1574664788;
        mm.hcfy[219] = 1105846142;
        mm.hcfy[220] = -1000628091;
        mm.hcfy[221] = -1444426399;
        mm.hcfy[222] = 2139660251;
        mm.hcfy[223] = -536916494;
        mm.hcfy[224] = -2024445628;
        mm.hcfy[225] = -1997536241;
        mm.hcfy[226] = -1388637109;
        mm.hcfy[227] = -1366621329;
        mm.hcfy[228] = -1389918243;
        mm.hcfy[229] = -1582075203;
        mm.hcfy[230] = -1344015533;
        mm.hcfy[231] = -280879290;
        mm.hcfy[232] = 1477153800;
        mm.hcfy[233] = -265369695;
        mm.hcfy[234] = 145344269;
        mm.hcfy[235] = -1279323027;
        mm.hcfy[236] = 1648110747;
        mm.hcfy[237] = -1328539710;
        mm.hcfy[238] = -605161154;
        mm.hcfy[239] = -148207317;
        mm.hcfy[240] = -1220555440;
        mm.hcfy[241] = 2112222280;
        mm.hcfy[242] = 665445229;
        mm.hcfy[243] = -1261280956;
        mm.hcfy[244] = -1274943927;
        mm.hcfy[245] = -1935981905;
        mm.hcfy[246] = 200694325;
        mm.hcfy[247] = -520296727;
        mm.hcfy[248] = -856168682;
        mm.hcfy[249] = -1844657746;
        mm.hcfy[250] = -1371766231;
        mm.hcfy[251] = -585270890;
        mm.hcfy[252] = 422195275;
        mm.hcfy[253] = 541043005;
        mm.hcfy[254] = 7379309;
        mm.hcfy[255] = -2138662983;
        mm.hcfy[256] = -1097236039;
        mm.hcfy[257] = 1831312406;
        mm.hcfy[258] = -1632796543;
        mm.hcfy[259] = -1326617145;
        mm.hcfy[260] = -152506181;
        mm.hcfy[261] = -1717190266;
        mm.hcfy[262] = 983783507;
        mm.hcfy[263] = -258863050;
        mm.hcfy[264] = 1601057325;
        mm.hcfy[265] = 707369931;
        mm.hcfy[266] = -1884971054;
        mm.hcfy[267] = 2130478924;
        mm.hcfy[268] = -1733958892;
        mm.hcfy[269] = -1052627036;
        mm.hcfy[270] = -12161782;
        mm.hcfy[271] = -1215137489;
        mm.hcfy[272] = -241819765;
        mm.hcfy[273] = 1831305769;
        mm.hcfy[274] = -500441370;
        mm.hcfy[275] = -1016679322;
        mm.hcfy[276] = -1118890756;
        mm.hcfy[277] = 1925419269;
        mm.hcfy[278] = 50470088;
        mm.hcfy[279] = -1760010559;
        mm.hcfy[280] = 61211537;
        mm.hcfy[281] = 2140154053;
        mm.hcfy[282] = -2067958005;
        mm.hcfy[283] = -961557436;
        mm.hcfy[284] = -820354343;
        mm.hcfy[285] = -1592705630;
        mm.hcfy[286] = 478510255;
        mm.hcfy[287] = 1539523167;
        mm.hcfy[288] = 1553735133;
        mm.hcfy[289] = -1828083148;
        mm.hcfy[290] = 1943739045;
        mm.hcfy[291] = -569496679;
        mm.hcfy[292] = -1847256524;
        mm.hcfy[293] = 1325562041;
        mm.hcfy[294] = 1981356045;
        mm.hcfy[295] = 944340783;
        mm.hcfy[296] = 2072477329;
        mm.hcfy[297] = 379263588;
        mm.hcfy[298] = -1903197249;
        mm.hcfy[299] = 716988719;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String description(ds var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mm.ob - mm.hcga("hcjb", hcge(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mm.hcga("hcjc", hcfx(int ), (int)45)) break;
            v0 /* !! */  = (long)mm.hcga("hcjd", hcfx(int ), (int)46);
        }
        var5_1 = mm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mm.ob - mm.hcga("hcje", hcge(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mm.hcga("hcjf", hcfx(int ), (int)47)) break;
            v1 /* !! */  = (long)mm.hcga("hcjg", hcfx(int ), (int)48);
        }
        var4_2 /* !! */  = mm.b;
        v2 /* !! */  = mm.ob;
        if (true) ** GOTO lbl17
        block49: while (true) {
            v2 /* !! */  = (long)(v3 - mm.hcga("hcjh", hcge(int ), (int)32));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1960440340: {
                    v3 = mm.hcga("hcji", hcge(int ), (int)33);
                    continue block49;
                }
                case -1743550761: {
                    v3 = mm.hcga("hcjj", hcge(int ), (int)34);
                    continue block49;
                }
                case -1082246435: {
                    break block49;
                }
                case 1329137374: {
                    v3 = mm.hcga("hcjk", hcge(int ), (int)35);
                    continue block49;
                }
            }
            break;
        }
        var3_3 = mm.a;
        if (var5_1) {
            throw null;
lbl32:
            // 10 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl32
        v4 /* !! */  = mm.ob;
        if (true) ** GOTO lbl39
        block51: while (true) {
            v4 /* !! */  = (long)(v5 - mm.hcga("hcjl", hcge(int ), (int)36));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1082246435: {
                    break block51;
                }
                case -889109284: {
                    v5 = mm.hcga("hcjm", hcge(int ), (int)37);
                    continue block51;
                }
                case -213747070: {
                    v5 = mm.hcga("hcjn", hcge(int ), (int)38);
                    continue block51;
                }
                case 2059536948: {
                    v5 = mm.hcga("hcjo", hcge(int ), (int)39);
                    continue block51;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = mm.ob - mm.hcga("hcjp", hcge(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == mm.hcga("hcjq", hcfx(int ), (int)49)) break;
            v6 /* !! */  = (long)mm.hcga("hcjr", hcfx(int ), (int)50);
        }
        v7 = var0.getName();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = mm.ob - mm.hcga("hcjs", hcge(int ), (int)41)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == mm.hcga("hcjt", hcfx(int ), (int)51)) break;
            v8 /* !! */  = (long)mm.hcga("hcju", hcfx(int ), (int)52);
        }
        var1_4 = mm.ENTRIES.get(v7);
        if (var3_3 || var3_3) ** GOTO lbl32
        if (var1_4 == null) ** GOTO lbl86
        if (var3_3) ** GOTO lbl32
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = mm.ob;
                if (true) ** GOTO lbl73
                block54: while (true) {
                    v9 /* !! */  = (long)(mm.hcga("hcjw", hcge(int ), (int)43) - mm.hcga("hcjv", hcge(int ), (int)42));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1082246435: {
                            break block54;
                        }
                        case 1053488244: {
                            continue block54;
                        }
                    }
                    break;
                }
                if (var1_4.description == null) ** GOTO lbl86
                if (var3_3 || var3_3) ** GOTO lbl32
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = mm.ob - mm.hcga("hcjx", hcge(int ), (int)44)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mm.hcga("hcjy", hcfx(int ), (int)53)) break;
                    v10 /* !! */  = (long)mm.hcga("hcjz", hcfx(int ), (int)54);
                }
                return var1_4.description;
lbl86:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v11 /* !! */  = mm.ob;
                if (true) ** GOTO lbl91
                block56: while (true) {
                    v11 /* !! */  = (long)(v12 - mm.hcga("hcka", hcge(int ), (int)45));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1387793997: {
                            v12 = mm.hcga("hckb", hcge(int ), (int)46);
                            continue block56;
                        }
                        case -1082246435: {
                            break block56;
                        }
                        case 972193782: {
                            v12 = mm.hcga("hckc", hcge(int ), (int)47);
                            continue block56;
                        }
                    }
                    break;
                }
                var2_5 = var0.getDescription();
                if (var3_3 || var3_3) ** GOTO lbl32
                if (var2_5 == null) ** GOTO lbl115
                if (var3_3) ** GOTO lbl32
                v13 /* !! */  = mm.ob;
                if (true) ** GOTO lbl108
                block57: while (true) {
                    v13 /* !! */  = (long)(mm.hcga("hcke", hcge(int ), (int)49) - mm.hcga("hckd", hcge(int ), (int)48));
lbl108:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1082246435: {
                            break block57;
                        }
                        case 1099924671: {
                            continue block57;
                        }
                    }
                    break;
                }
                if (!var2_5.isBlank()) ** GOTO lbl120
                if (var3_3) ** GOTO lbl32
lbl115:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl32
                v14 = "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442.";
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl123
lbl120:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v14 = var2_5;
lbl123:
                // 2 sources

                return v14;
            }
            case 0: {
                do {
                    var4_2 /* !! */  = (int)mm.hcga("hckf", hcfx(int ), (int)55);
                } while (!var5_1);
                throw null;
            }
lbl129:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)mm.hcga("hckg", hcfx(int ), (int)56);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl144
                    break;
                }
            }
            case 2: {
                var4_2 /* !! */  = (int)mm.hcga("hckh", hcfx(int ), (int)57);
                if (!var5_1) break;
                throw null;
            }
            case 3: {
                var4_2 /* !! */  = (int)mm.hcga("hcki", hcfx(int ), (int)58);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl144:
            // 3 sources

            case 4: {
                var4_2 /* !! */  = (int)mm.hcga("hckj", hcfx(int ), (int)59);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl149:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)mm.hcga("hckk", hcfx(int ), (int)60);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: {
                var4_2 /* !! */  = (int)mm.hcga("hckl", hcfx(int ), (int)61);
                if (!var5_1) ** GOTO lbl129
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)mm.hcga("hckm", hcfx(int ), (int)62);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 8: {
                var4_2 /* !! */  = (int)mm.hcga("hckn", hcfx(int ), (int)63);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl168:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)mm.hcga("hcko", hcfx(int ), (int)64);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl173:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)mm.hcga("hckp", hcfx(int ), (int)65);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 11: {
                var4_2 /* !! */  = (int)mm.hcga("hckq", hcfx(int ), (int)66);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 12: {
                var4_2 /* !! */  = (int)mm.hcga("hckr", hcfx(int ), (int)67);
                if (!var5_1) break;
                throw null;
            }
lbl187:
            // 3 sources

            case 13: {
                do {
                    var4_2 /* !! */  = (int)mm.hcga("hcks", hcfx(int ), (int)68);
                } while (!var5_1);
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)mm.hcga("hckt", hcfx(int ), (int)69);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl197:
            // 4 sources

            case 15: {
                var4_2 /* !! */  = (int)mm.hcga("hcku", hcfx(int ), (int)70);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl201:
            // 3 sources

            case 16: {
                var4_2 /* !! */  = (int)mm.hcga("hckv", hcfx(int ), (int)71);
                if (!var5_1) ** GOTO lbl149
                throw null;
            }
lbl205:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)mm.hcga("hckw", hcfx(int ), (int)72);
                if (!var5_1) ** GOTO lbl168
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)mm.hcga("hckx", hcfx(int ), (int)73);
                if (!var5_1) ** GOTO lbl197
                throw null;
            }
            case 19: 
        }
        var4_2 /* !! */  = (int)mm.hcga("hcky", hcfx(int ), (int)74);
        ** while (!var5_1)
lbl216:
        // 1 sources

        throw null;
    }

    static {
        hcfz = new int[324];
        mm.helo();
        mm.help();
        mm.helq();
        mm.helr();
        mm.hels();
        mm.helt();
        mm.helu();
        mm.helv();
        hcgf = new long[206];
        hcgg = new long[206];
        mm.helw();
        mm.helx();
        mm.hely();
        mm.hemb();
        mm.hemm();
        mm.hemw();
        ENTRIES = new HashMap<String, mm$Entry>();
        mm$Item[] mm$ItemArray = new mm$Item[8];
        mm$ItemArray[mm.hcga("hegy", hcfx(int ), (int)253)] = mm.item("KillAura", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0430\u0442\u0430\u043a\u0443\u0435\u0442 \u043f\u043e\u0434\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0446\u0435\u043b\u0438 \u0432 \u0437\u0430\u0434\u0430\u043d\u043d\u043e\u0439 \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u0438.");
        mm$ItemArray[mm.hcga("hegz", hcfx(int ), (int)254)] = mm.item("TriggerBot", "\u0410\u0442\u0430\u043a\u0443\u0435\u0442 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c, \u043d\u0430\u0445\u043e\u0434\u044f\u0449\u0443\u044e\u0441\u044f \u043f\u0440\u044f\u043c\u043e \u043f\u043e\u0434 \u043f\u0440\u0438\u0446\u0435\u043b\u043e\u043c.");
        mm$ItemArray[mm.hcga("hehb", hcfx(int ), (int)255)] = mm.item("LegitAura", "\u0410\u0442\u0430\u043a\u0443\u0435\u0442 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0443\u044e \u0446\u0435\u043b\u044c \u0441 \u043f\u043b\u0430\u0432\u043d\u044b\u043c\u0438, \u043f\u043e\u0445\u043e\u0436\u0438\u043c\u0438 \u043d\u0430 \u043e\u0431\u044b\u0447\u043d\u0443\u044e \u0438\u0433\u0440\u0443 \u043f\u043e\u0432\u043e\u0440\u043e\u0442\u0430\u043c\u0438.");
        mm$ItemArray[mm.hcga("hehd", hcfx(int ), (int)256)] = mm.item("ElytraTarget", "\u0423\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0446\u0435\u043b\u044c\u044e \u0430\u0443\u0440\u044b \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u0430, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043b\u0435\u0442\u0438\u0442 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445.");
        mm$ItemArray[mm.hcga("hehf", hcfx(int ), (int)257)] = mm.item("TargetPearl", "\u041f\u0440\u043e\u0433\u043d\u043e\u0437\u0438\u0440\u0443\u0435\u0442 \u043f\u0440\u0438\u0437\u0435\u043c\u043b\u0435\u043d\u0438\u0435 \u0447\u0443\u0436\u043e\u0433\u043e \u0436\u0435\u043c\u0447\u0443\u0433\u0430 \u0438 \u0431\u0440\u043e\u0441\u0430\u0435\u0442 \u0441\u0432\u043e\u0439 \u043a \u0442\u043e\u0439 \u0436\u0435 \u0442\u043e\u0447\u043a\u0435.");
        mm$ItemArray[mm.hcga("hehg", hcfx(int ), (int)258)] = mm.item("AimingBalls", "\u041d\u0430\u0432\u043e\u0434\u0438\u0442 \u043a\u0430\u043c\u0435\u0440\u0443 \u043d\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0442\u0438\u043f\u044b \u0446\u0435\u043d\u043d\u043e\u0433\u043e \u0434\u0440\u043e\u043f\u0430 \u043f\u043e\u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438.");
        mm$ItemArray[mm.hcga("hehh", hcfx(int ), (int)259)] = mm.item("AutoExplosion", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u0442\u0430\u0432\u0438\u0442 \u0438 \u0432\u0437\u0440\u044b\u0432\u0430\u0435\u0442 \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b \u043d\u0430 \u043e\u0431\u0441\u0438\u0434\u0438\u0430\u043d\u0435 \u0438\u043b\u0438 \u0431\u0435\u0434\u0440\u043e\u043a\u0435.");
        mm$ItemArray[mm.hcga("hehi", hcfx(int ), (int)260)] = mm.item("MaceTarget", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0437\u0438\u0440\u0443\u0435\u0442 \u043f\u043e\u043b\u0435\u0442, \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u0435 \u0438 \u0443\u0434\u0430\u0440 \u0431\u0443\u043b\u0430\u0432\u043e\u0439 \u043f\u043e \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u043e\u0439 \u0446\u0435\u043b\u0438.");
        mm.section("Attack", 0, mm$ItemArray);
        mm$Item[] mm$ItemArray2 = new mm$Item[6];
        mm$ItemArray2[mm.hcga("hehj", hcfx(int ), (int)261)] = mm.item("ShiftTap", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0440\u0430\u0442\u043a\u043e \u043d\u0430\u0436\u0438\u043c\u0430\u0435\u0442 \u043f\u0440\u0438\u0441\u0435\u0434\u0430\u043d\u0438\u0435 \u043f\u043e\u0441\u043b\u0435 \u0443\u0434\u0430\u0440\u0430.");
        mm$ItemArray2[mm.hcga("hehk", hcfx(int ), (int)262)] = mm.item("HitBox", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u043e\u0431\u043b\u0430\u0441\u0442\u044c \u043f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u044f \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0445 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439.");
        mm$ItemArray2[mm.hcga("hehm", hcfx(int ), (int)263)] = mm.item("AntiBot", "\u0418\u0441\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u043d\u044b\u0445 \u0431\u043e\u0442\u043e\u0432 \u0438 \u043b\u043e\u0436\u043d\u044b\u0435 \u0446\u0435\u043b\u0438 \u0438\u0437 \u0432\u044b\u0431\u043e\u0440\u0430 \u0430\u0443\u0440\u044b.");
        mm$ItemArray2[mm.hcga("hehn", hcfx(int ), (int)264)] = mm.item("Velocity", "\u0423\u043c\u0435\u043d\u044c\u0448\u0430\u0435\u0442 \u0438\u043b\u0438 \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u0443\u0431\u0438\u0440\u0430\u0435\u0442 \u043e\u0442\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u043d\u0438\u0435 \u043f\u0440\u0438 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0438 \u0443\u0440\u043e\u043d\u0430.");
        mm$ItemArray2[mm.hcga("hehp", hcfx(int ), (int)265)] = mm.item("NoServerDesync", "\u041d\u0435 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0443 \u043f\u0440\u0438\u043d\u0443\u0434\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0438\u0437\u043c\u0435\u043d\u044f\u0442\u044c \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043a\u0430\u043c\u0435\u0440\u044b.");
        mm$ItemArray2[mm.hcga("hehr", hcfx(int ), (int)266)] = mm.item("NoFriendDamage", "\u0411\u043b\u043e\u043a\u0438\u0440\u0443\u0435\u0442 \u0430\u0442\u0430\u043a\u0438 \u043f\u043e \u0438\u0433\u0440\u043e\u043a\u0430\u043c, \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043d\u044b\u043c \u0432 \u0441\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439.");
        mm.section("Assistance", 1, mm$ItemArray2);
        mm$Item[] mm$ItemArray3 = new mm$Item[6];
        mm$ItemArray3[mm.hcga("hehs", hcfx(int ), (int)267)] = mm.item("AutoPotion", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u0440\u043e\u0441\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0437\u0435\u043b\u044c\u044f \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u0430 \u043f\u0440\u0438 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e\u0441\u0442\u0438.");
        mm$ItemArray3[mm.hcga("heht", hcfx(int ), (int)268)] = mm.item("AutoGApple", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043d\u0430\u0447\u0438\u043d\u0430\u0435\u0442 \u0435\u0441\u0442\u044c \u0437\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e \u043f\u0440\u0438 \u0437\u0430\u0434\u0430\u043d\u043d\u044b\u0445 \u0443\u0441\u043b\u043e\u0432\u0438\u044f\u0445.");
        mm$ItemArray3[mm.hcga("hehu", hcfx(int ), (int)269)] = mm.item("AutoTotem", "\u041f\u0435\u0440\u0435\u043c\u0435\u0449\u0430\u0435\u0442 \u0442\u043e\u0442\u0435\u043c \u0432 \u043b\u0435\u0432\u0443\u044e \u0440\u0443\u043a\u0443, \u043a\u043e\u0433\u0434\u0430 \u0438\u0433\u0440\u043e\u043a\u0443 \u0443\u0433\u0440\u043e\u0436\u0430\u0435\u0442 \u043e\u043f\u0430\u0441\u043d\u043e\u0441\u0442\u044c.");
        mm$ItemArray3[mm.hcga("hehv", hcfx(int ), (int)270)] = mm.item("AutoSwap", "\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0434\u0432\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0432 \u043b\u0435\u0432\u043e\u0439 \u0440\u0443\u043a\u0435 \u043f\u043e \u043a\u043b\u0430\u0432\u0438\u0448\u0435.");
        mm$ItemArray3[mm.hcga("hehw", hcfx(int ), (int)271)] = mm.item("AutoCart", "\u0423\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0438 \u043f\u043e\u0434\u0440\u044b\u0432\u0430\u0435\u0442 \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0443 \u0441 \u0434\u0438\u043d\u0430\u043c\u0438\u0442\u043e\u043c \u043d\u0430 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0438\u0445 \u0440\u0435\u043b\u044c\u0441\u0430\u0445.");
        mm$ItemArray3[mm.hcga("hehx", hcfx(int ), (int)272)] = mm.item("WebTrap", "\u0421\u0442\u0430\u0432\u0438\u0442 \u043f\u0430\u0443\u0442\u0438\u043d\u0443 \u0432 \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0446\u0435\u043b\u0438 \u043f\u043e \u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d\u043d\u043e\u0439 \u043a\u043b\u0430\u0432\u0438\u0448\u0435.");
        mm.section("Automation", 2, mm$ItemArray3);
        mm$Item[] mm$ItemArray4 = new mm$Item[6];
        mm$ItemArray4[mm.hcga("hehy", hcfx(int ), (int)273)] = mm.item("AutoSprint", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0431\u0435\u0433 \u0432 \u043e\u0431\u044b\u0447\u043d\u043e\u043c \u0438\u043b\u0438 \u043b\u0435\u0433\u0438\u0442\u043d\u043e\u043c \u0440\u0435\u0436\u0438\u043c\u0435.");
        mm$ItemArray4[mm.hcga("hehz", hcfx(int ), (int)274)] = mm.item("Speed", "\u041f\u043e\u0432\u044b\u0448\u0430\u0435\u0442 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0435\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u043c \u0440\u0435\u0436\u0438\u043c\u043e\u043c.");
        mm$ItemArray4[mm.hcga("heia", hcfx(int ), (int)275)] = mm.item("Strafe", "\u0423\u043b\u0443\u0447\u0448\u0430\u0435\u0442 \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c\u044e \u0438 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435\u043c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0432 \u0432\u043e\u0437\u0434\u0443\u0445\u0435.");
        mm$ItemArray4[mm.hcga("heib", hcfx(int ), (int)276)] = mm.item("TargetStrafe", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0434\u0432\u0438\u0436\u0435\u0442\u0441\u044f \u043f\u043e \u043e\u043a\u0440\u0443\u0436\u043d\u043e\u0441\u0442\u0438 \u0432\u043e\u043a\u0440\u0443\u0433 \u0446\u0435\u043b\u0438 KillAura.");
        mm$ItemArray4[mm.hcga("heic", hcfx(int ), (int)277)] = mm.item("WaterSpeed", "\u0423\u0441\u043a\u043e\u0440\u044f\u0435\u0442 \u0433\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u043e\u0435 \u043f\u0435\u0440\u0435\u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0432 \u0432\u043e\u0434\u0435.");
        mm$ItemArray4[mm.hcga("heid", hcfx(int ), (int)278)] = mm.item("NoSlowDown", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0435\u0434\u044b, \u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432.");
        mm.section("Speed", 10, mm$ItemArray4);
        mm$Item[] mm$ItemArray5 = new mm$Item[5];
        mm$ItemArray5[mm.hcga("heie", hcfx(int ), (int)279)] = mm.item("Fly", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0430\u0442\u044c\u0441\u044f \u043f\u043e \u0432\u043e\u0437\u0434\u0443\u0445\u0443 \u0432 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u043e\u043c \u0440\u0435\u0436\u0438\u043c\u0435 \u043f\u043e\u043b\u0435\u0442\u0430.");
        mm$ItemArray5[mm.hcga("heif", hcfx(int ), (int)280)] = mm.item("HighJump", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0432\u044b\u0441\u043e\u0442\u0443 \u043f\u0440\u044b\u0436\u043a\u0430 \u0438\u0433\u0440\u043e\u043a\u0430.");
        mm$ItemArray5[mm.hcga("heig", hcfx(int ), (int)281)] = mm.item("Jesus", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0442\u043e\u044f\u0442\u044c \u0438 \u0434\u0432\u0438\u0433\u0430\u0442\u044c\u0441\u044f \u043f\u043e \u043f\u043e\u0432\u0435\u0440\u0445\u043d\u043e\u0441\u0442\u0438 \u0432\u043e\u0434\u044b.");
        mm$ItemArray5[mm.hcga("heih", hcfx(int ), (int)282)] = mm.item("Spider", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043f\u043e\u0434\u043d\u0438\u043c\u0430\u0442\u044c\u0441\u044f \u0432\u0432\u0435\u0440\u0445 \u0432\u0434\u043e\u043b\u044c \u0432\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u044b\u0445 \u0441\u0442\u0435\u043d.");
        mm$ItemArray5[mm.hcga("heii", hcfx(int ), (int)283)] = mm.item("Scaffold", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u0442\u0430\u0432\u0438\u0442 \u0431\u043b\u043e\u043a\u0438 \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u043e\u043c \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f.");
        mm.section("Traversal", 11, mm$ItemArray5);
        mm$Item[] mm$ItemArray6 = new mm$Item[3];
        mm$ItemArray6[mm.hcga("heij", hcfx(int ), (int)284)] = mm.item("SuperFirework", "\u0423\u0441\u0438\u043b\u0438\u0432\u0430\u0435\u0442 \u0443\u0441\u043a\u043e\u0440\u0435\u043d\u0438\u0435 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430 \u043f\u043e \u043e\u0442\u0434\u0435\u043b\u044c\u043d\u044b\u043c \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f\u043c XZ \u0438 Y \u0434\u043b\u044f \u043a\u0430\u0436\u0434\u043e\u0433\u043e \u0443\u0433\u043b\u0430 \u043f\u043e\u043b\u0435\u0442\u0430.");
        mm$ItemArray6[mm.hcga("heik", hcfx(int ), (int)285)] = mm.item("NoWeb", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0438 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e \u0434\u0432\u0438\u0433\u0430\u0442\u044c\u0441\u044f \u0432\u043d\u0443\u0442\u0440\u0438 \u043f\u0430\u0443\u0442\u0438\u043d\u044b.");
        mm$ItemArray6[mm.hcga("heil", hcfx(int ), (int)286)] = mm.item("NoFallDamage", "\u041f\u0440\u0435\u0434\u043e\u0442\u0432\u0440\u0430\u0449\u0430\u0435\u0442 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0435 \u0443\u0440\u043e\u043d\u0430 \u043e\u0442 \u043f\u0430\u0434\u0435\u043d\u0438\u044f.");
        mm.section("Assistance", 12, mm$ItemArray6);
        mm$Item[] mm$ItemArray7 = new mm$Item[4];
        mm$ItemArray7[mm.hcga("heim", hcfx(int ), (int)287)] = mm.item("NoDelay", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0438 \u043f\u0440\u044b\u0436\u043a\u0430, \u043f\u0440\u0430\u0432\u043e\u0433\u043e \u043a\u043b\u0438\u043a\u0430 \u0438 \u043b\u043e\u043c\u0430\u043d\u0438\u044f \u0431\u043b\u043e\u043a\u043e\u0432.");
        mm$ItemArray7[mm.hcga("hein", hcfx(int ), (int)288)] = mm.item("AntiPush", "\u041e\u0442\u043a\u043b\u044e\u0447\u0430\u0435\u0442 \u0442\u043e\u043b\u0447\u043a\u0438 \u0438 \u0441\u0442\u043e\u043b\u043a\u043d\u043e\u0432\u0435\u043d\u0438\u044f \u043e\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0445 \u0431\u043b\u043e\u043a\u043e\u0432 \u0438 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439.");
        mm$ItemArray7[mm.hcga("heio", hcfx(int ), (int)289)] = mm.item("NoEntityTrace", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u043e\u0432\u0430\u0442\u044c \u0441 \u0431\u043b\u043e\u043a\u0430\u043c\u0438 \u0441\u043a\u0432\u043e\u0437\u044c \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0438; \u043e\u0442\u0434\u0435\u043b\u044c\u043d\u043e \u0443\u0447\u0438\u0442\u044b\u0432\u0430\u0435\u0442 \u043c\u0435\u0447.");
        mm$ItemArray7[mm.hcga("heip", hcfx(int ), (int)290)] = mm.item("NoInteract", "\u0411\u043b\u043e\u043a\u0438\u0440\u0443\u0435\u0442 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0435 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0441 \u0431\u043b\u043e\u043a\u0430\u043c\u0438.");
        mm.section("Interaction", 20, mm$ItemArray7);
        mm$Item[] mm$ItemArray8 = new mm$Item[2];
        mm$ItemArray8[mm.hcga("heiq", hcfx(int ), (int)291)] = mm.item("TapeMouse", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0443\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442 \u0438\u043b\u0438 \u043d\u0430\u0436\u0438\u043c\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u0443\u044e \u043a\u043b\u0430\u0432\u0438\u0448\u0443 \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f.");
        mm$ItemArray8[mm.hcga("heis", hcfx(int ), (int)292)] = mm.item("RegionExploit", "\u041f\u0435\u0440\u0435\u0434\u0430\u0435\u0442 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b \u043c\u0435\u0436\u0434\u0443 \u043a\u043b\u0438\u0435\u043d\u0442\u0430\u043c\u0438 \u0438 \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0437\u0438\u0440\u0443\u0435\u0442 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u0440\u0435\u0433\u0438\u043e\u043d\u0430 \u0432\u043e\u043a\u0440\u0443\u0433 \u0442\u043e\u0447\u043a\u0438.");
        mm.section("Automation", 21, mm$ItemArray8);
        mm$Item[] mm$ItemArray9 = new mm$Item[1];
        mm$ItemArray9[mm.hcga("heit", hcfx(int ), (int)293)] = mm.item("FreeCam", "\u041e\u0442\u0434\u0435\u043b\u044f\u0435\u0442 \u043a\u0430\u043c\u0435\u0440\u0443 \u043e\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u0438 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e \u043e\u0441\u043c\u0430\u0442\u0440\u0438\u0432\u0430\u0442\u044c \u043c\u0438\u0440.");
        mm.section("Camera", 22, mm$ItemArray9);
        mm$Item[] mm$ItemArray10 = new mm$Item[1];
        mm$ItemArray10[mm.hcga("heiv", hcfx(int ), (int)294)] = mm.item("Hud", "\u041d\u0430\u0441\u0442\u0440\u0430\u0438\u0432\u0430\u0435\u0442 \u0432\u0438\u0434, \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u0438 \u043c\u0430\u0441\u0448\u0442\u0430\u0431 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0438\u0433\u0440\u043e\u0432\u043e\u0433\u043e \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430.");
        mm.section("Interface", 30, mm$ItemArray10);
        mm$Item[] mm$ItemArray11 = new mm$Item[7];
        mm$ItemArray11[mm.hcga("heiw", hcfx(int ), (int)295)] = mm.item("Ambience", "\u041b\u043e\u043a\u0430\u043b\u044c\u043d\u043e \u0438\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u043c\u043e\u0435 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a \u0438 \u043e\u0441\u0432\u0435\u0449\u0435\u043d\u0438\u0435 \u043c\u0438\u0440\u0430.");
        mm$ItemArray11[mm.hcga("heix", hcfx(int ), (int)296)] = mm.item("ShaderSky", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u043e\u0431\u044b\u0447\u043d\u043e\u0435 \u043d\u0435\u0431\u043e \u043d\u0430 \u0430\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u0448\u0435\u0439\u0434\u0435\u0440: \u0441\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u0441\u0438\u044f\u043d\u0438\u0435, \u0447\u0451\u0440\u043d\u0443\u044e \u0434\u044b\u0440\u0443 \u0438\u043b\u0438 \u0433\u0430\u043b\u0430\u043a\u0442\u0438\u043a\u0443.");
        mm$ItemArray11[mm.hcga("heiy", hcfx(int ), (int)297)] = mm.item("Particles", "\u0421\u043e\u0437\u0434\u0430\u0451\u0442 glow-\u0447\u0430\u0441\u0442\u0438\u0446\u044b \u0432 \u0431\u0435\u0437\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0438, \u0437\u0430 \u043b\u0435\u0442\u044f\u0449\u0435\u0439 \u0436\u0435\u043c\u0447\u0443\u0436\u0438\u043d\u043e\u0439 \u0438 \u043f\u0440\u0438 \u043a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u043c \u0443\u0434\u0430\u0440\u0435.");
        mm$ItemArray11[mm.hcga("hejb", hcfx(int ), (int)298)] = mm.item("TargetESP", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0442\u0435\u043a\u0443\u0449\u0443\u044e \u0446\u0435\u043b\u044c KillAura \u043a\u043e\u043b\u044c\u0446\u043e\u043c, \u0440\u043e\u043c\u0431\u043e\u043c, \u0434\u0443\u0448\u0430\u043c\u0438 \u0438\u043b\u0438 \u044d\u0444\u0444\u0435\u043a\u0442\u043e\u043c Ghosts.");
        mm$ItemArray11[mm.hcga("heje", hcfx(int ), (int)299)] = mm.item("BlockOverlay", "\u041f\u043e\u0434\u0441\u0432\u0435\u0447\u0438\u0432\u0430\u0435\u0442 \u0431\u043b\u043e\u043a, \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043d\u0430\u0432\u0435\u0434\u0435\u043d \u043f\u0440\u0438\u0446\u0435\u043b.");
        mm$ItemArray11[mm.hcga("hejh", hcfx(int ), (int)300)] = mm.item("SeeInvisible", "\u0414\u0435\u043b\u0430\u0435\u0442 \u043d\u0435\u0432\u0438\u0434\u0438\u043c\u044b\u0445 \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u0438 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439 \u0432\u0438\u0434\u0438\u043c\u044b\u043c\u0438 \u0434\u043b\u044f \u043a\u043b\u0438\u0435\u043d\u0442\u0430.");
        mm$ItemArray11[mm.hcga("hejj", hcfx(int ), (int)301)] = mm.item("Removals", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u044d\u043a\u0440\u0430\u043d\u043d\u044b\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u044b, \u043e\u0432\u0435\u0440\u043b\u0435\u0438, BossBar \u0438 Scoreboard.");
        mm.section("World", 31, mm$ItemArray11);
        mm$Item[] mm$ItemArray12 = new mm$Item[6];
        mm$ItemArray12[mm.hcga("hejk", hcfx(int ), (int)302)] = mm.item("AspectRatio", "\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0441\u043e\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u0441\u0442\u043e\u0440\u043e\u043d \u0438\u0433\u0440\u043e\u0432\u043e\u0439 \u043f\u0435\u0440\u0441\u043f\u0435\u043a\u0442\u0438\u0432\u044b.");
        mm$ItemArray12[mm.hcga("hejm", hcfx(int ), (int)303)] = mm.item("ViewModel", "\u041c\u0435\u043d\u044f\u0435\u0442 \u043f\u043e\u0437\u0438\u0446\u0438\u044e, \u043f\u043e\u0432\u043e\u0440\u043e\u0442 \u0438 \u043c\u0430\u0441\u0448\u0442\u0430\u0431 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 \u0440\u0443\u043a\u0430\u0445.");
        mm$ItemArray12[mm.hcga("hejo", hcfx(int ), (int)304)] = mm.item("ShaderHands", "\u041d\u0430\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u0435\u0442 \u043d\u0430 \u0440\u0443\u043a\u0438 \u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u043e\u0442 \u043f\u0435\u0440\u0432\u043e\u0433\u043e \u043b\u0438\u0446\u0430 \u043d\u0430\u0441\u0442\u0440\u0430\u0438\u0432\u0430\u0435\u043c\u043e\u0435 \u0441\u0432\u0435\u0447\u0435\u043d\u0438\u0435 \u0438\u043b\u0438 \u0433\u0440\u0430\u0434\u0438\u0435\u043d\u0442.");
        mm$ItemArray12[mm.hcga("hejq", hcfx(int ), (int)305)] = mm.item("Custom Models", "\u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0435\u0442 \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0438\u0433\u0440\u043e\u043a\u0443 \u043e\u0434\u043d\u0443 \u0438\u0437 \u0432\u0441\u0442\u0440\u043e\u0435\u043d\u043d\u044b\u0445 \u0430\u043d\u0438\u043c\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0445 \u043c\u043e\u0434\u0435\u043b\u0435\u0439.");
        mm$ItemArray12[mm.hcga("hejs", hcfx(int ), (int)306)] = mm.item("Chams", "\u041f\u043e\u0434\u0441\u0432\u0435\u0447\u0438\u0432\u0430\u0435\u0442 \u043c\u043e\u0434\u0435\u043b\u0438 \u0438\u0433\u0440\u043e\u043a\u043e\u0432 \u0438\u043b\u0438 \u043c\u043e\u0431\u043e\u0432 \u0446\u0432\u0435\u0442\u043d\u044b\u043c \u0448\u0435\u0439\u0434\u0435\u0440\u043e\u043c, \u0432 \u0442\u043e\u043c \u0447\u0438\u0441\u043b\u0435 \u0441\u043a\u0432\u043e\u0437\u044c \u0441\u0442\u0435\u043d\u044b.");
        mm$ItemArray12[mm.hcga("heju", hcfx(int ), (int)307)] = mm.item("SwingAnimation", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044e \u0432\u0437\u043c\u0430\u0445\u0430 \u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u043e\u0442 \u043f\u0435\u0440\u0432\u043e\u0433\u043e \u043b\u0438\u0446\u0430.");
        mm.section("View", 32, mm$ItemArray12);
        mm$Item[] mm$ItemArray13 = new mm$Item[4];
        mm$ItemArray13[mm.hcga("hejx", hcfx(int ), (int)308)] = mm.item("Tags", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0438\u043c\u0435\u043d\u0430 \u0438 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0445 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0435\u0439 \u0438 \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432.");
        mm$ItemArray13[mm.hcga("hejy", hcfx(int ), (int)309)] = mm.item("Arrows", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043d\u0430 \u0438\u0433\u0440\u043e\u043a\u043e\u0432, \u0434\u0440\u0443\u0437\u0435\u0439 \u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b.");
        mm$ItemArray13[mm.hcga("hejz", hcfx(int ), (int)310)] = mm.item("Prediction", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0442\u0440\u0430\u0435\u043a\u0442\u043e\u0440\u0438\u044e \u0438 \u0432\u0440\u0435\u043c\u044f \u0434\u043e \u043f\u0430\u0434\u0435\u043d\u0438\u044f \u0436\u0435\u043c\u0447\u0443\u0433\u0430, \u0441\u0442\u0440\u0435\u043b \u0438 \u0442\u0440\u0435\u0437\u0443\u0431\u0446\u0435\u0432.");
        mm$ItemArray13[mm.hcga("hekb", hcfx(int ), (int)311)] = mm.item("ShulkerPreview", "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0435 \u0448\u0430\u043b\u043a\u0435\u0440\u0430 \u043f\u0440\u0438 \u0437\u0430\u0436\u0430\u0442\u043e\u043c Ctrl.");
        mm.section("Overlay", 33, mm$ItemArray13);
        mm$Item[] mm$ItemArray14 = new mm$Item[4];
        mm$ItemArray14[mm.hcga("hekd", hcfx(int ), (int)312)] = mm.item("ClickAction", "\u0411\u0440\u043e\u0441\u0430\u0435\u0442 \u044d\u043d\u0434\u0435\u0440-\u0436\u0435\u043c\u0447\u0443\u0433 \u0438\u043b\u0438 \u0437\u0430\u0440\u044f\u0434 \u0432\u0435\u0442\u0440\u0430 \u0438 \u0434\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u0438\u043b\u0438 \u0443\u0434\u0430\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439 \u043f\u043e \u043e\u0442\u0434\u0435\u043b\u044c\u043d\u044b\u043c \u043a\u043b\u0430\u0432\u0438\u0448\u0430\u043c.");
        mm$ItemArray14[mm.hcga("hekf", hcfx(int ), (int)313)] = mm.item("NoSlotChange", "\u0417\u0430\u0449\u0438\u0449\u0430\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u0441\u043b\u043e\u0442 \u0438 \u0432\u0430\u0436\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u043e\u0442 \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0439 \u0441\u043c\u0435\u043d\u044b \u0438\u043b\u0438 \u0432\u044b\u0431\u0440\u043e\u0441\u0430.");
        mm$ItemArray14[mm.hcga("hekh", hcfx(int ), (int)314)] = mm.item("ItemScroller", "\u0411\u044b\u0441\u0442\u0440\u043e \u043f\u0435\u0440\u0435\u043d\u043e\u0441\u0438\u0442, \u0432\u044b\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u0435\u0442 \u0438\u043b\u0438 \u0441\u043e\u0431\u0438\u0440\u0430\u0435\u0442 \u043e\u0434\u0438\u043d\u0430\u043a\u043e\u0432\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0432 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0435.");
        mm$ItemArray14[mm.hcga("hekl", hcfx(int ), (int)315)] = mm.item("ElytraHelper", "\u0411\u044b\u0441\u0442\u0440\u043e \u043c\u0435\u043d\u044f\u0435\u0442 \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u044b \u0438 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a \u043f\u043e \u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d\u043d\u044b\u043c \u043a\u043b\u0430\u0432\u0438\u0448\u0430\u043c.");
        mm.section("Inventory", 40, mm$ItemArray14);
        mm$Item[] mm$ItemArray15 = new mm$Item[5];
        mm$ItemArray15[mm.hcga("hekm", hcfx(int ), (int)316)] = mm.item("AutoRespawn", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u043e\u0437\u0440\u043e\u0436\u0434\u0430\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u043f\u043e\u0441\u043b\u0435 \u0441\u043c\u0435\u0440\u0442\u0438.");
        mm$ItemArray15[mm.hcga("hekn", hcfx(int ), (int)317)] = mm.item("AutoTpAccept", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0435\u0442 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0437\u0430\u043f\u0440\u043e\u0441\u044b \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\u0446\u0438\u044e.");
        mm$ItemArray15[mm.hcga("heko", hcfx(int ), (int)318)] = mm.item("AutoLeave", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u043e\u043a\u0438\u0434\u0430\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440 \u0438\u043b\u0438 \u0440\u0435\u0436\u0438\u043c \u043f\u0440\u0438 \u043f\u043e\u044f\u0432\u043b\u0435\u043d\u0438\u0438 \u043e\u043f\u0430\u0441\u043d\u043e\u0433\u043e \u0438\u0433\u0440\u043e\u043a\u0430 \u0440\u044f\u0434\u043e\u043c.");
        mm$ItemArray15[mm.hcga("hekq", hcfx(int ), (int)319)] = mm.item("AutoDuel", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u043c \u0438\u0433\u0440\u043e\u043a\u0430\u043c \u0437\u0430\u043f\u0440\u043e\u0441\u044b \u043d\u0430 \u0434\u0443\u044d\u043b\u044c.");
        mm$ItemArray15[mm.hcga("heks", hcfx(int ), (int)320)] = mm.item("BowSpammer", "\u0411\u044b\u0441\u0442\u0440\u043e \u043d\u0430\u0442\u044f\u0433\u0438\u0432\u0430\u0435\u0442 \u0438 \u043e\u0442\u043f\u0443\u0441\u043a\u0430\u0435\u0442 \u043b\u0443\u043a \u0441 \u0437\u0430\u0434\u0430\u043d\u043d\u043e\u0439 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u043e\u0439.");
        mm.section("Automation", 41, mm$ItemArray15);
        mm$Item[] mm$ItemArray16 = new mm$Item[2];
        mm$ItemArray16[mm.hcga("hekv", hcfx(int ), (int)321)] = mm.item("NameProtect", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0432\u0430\u0448 \u043d\u0438\u043a \u0438 \u043f\u0440\u0438 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e\u0441\u0442\u0438 \u043d\u0438\u043a\u0438 \u0434\u0440\u0443\u0437\u0435\u0439 \u0432 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u043c\u043e\u043c \u0442\u0435\u043a\u0441\u0442\u0435.");
        mm$ItemArray16[mm.hcga("hekz", hcfx(int ), (int)322)] = mm.item("ServerRPSpoof", "\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0430\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0443 \u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0443 \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e\u0433\u043e \u0440\u0435\u0441\u0443\u0440\u0441\u043f\u0430\u043a\u0430, \u043d\u0435 \u043f\u0440\u0438\u043c\u0435\u043d\u044f\u044f \u0435\u0433\u043e \u043b\u043e\u043a\u0430\u043b\u044c\u043d\u043e.");
        mm.section("Network", 42, mm$ItemArray16);
        mm.sectionOnly("Automation", 43, "AncientExploit");
        mm$Item[] mm$ItemArray17 = new mm$Item[1];
        mm$ItemArray17[mm.hcga("hela", hcfx(int ), (int)323)] = mm.item("Theme", "\u041c\u0435\u043d\u044f\u0435\u0442 \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439 \u0446\u0432\u0435\u0442 ClickGUI, HUD \u0438 \u043e\u0441\u0442\u0430\u043b\u044c\u043d\u044b\u0445 \u0430\u043a\u0446\u0435\u043d\u0442\u043d\u044b\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u043a\u043b\u0438\u0435\u043d\u0442\u0430.");
        mm.section("Appearance", 50, mm$ItemArray17);
        mm.sectionOnly("Server Helpers", 60, "FuntimeHelper", "HolyWorldHelper", "ReallyWorldHelper", "StaffExploit", "PVPSafe", "OpenWalls");
        mm.sectionOnly("Automation", 61, "AutoRespawn", "AutoTpAccept", "AutoLeave", "AutoDuel", "BowSpammer");
        mm.sectionOnly("Inventory", 62, "ClickAction", "ItemScroller", "NoSlotChange", "ElytraHelper");
        mm.sectionOnly("Player", 63, "NameProtect", "StreamerMode", "NoSpherePlace");
        mm.sectionOnly("Social", 64, "Communication", "PartyHelper");
        mm.sectionOnly("Client", 65, "ClickGui", "Optimization", "ToggleSounds", "Scoreboard Health", "ServerRPSpoof", "KTLeave");
    }
}

