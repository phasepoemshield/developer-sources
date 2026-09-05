/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_7439
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_7439;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.df;
import ruhack.phobia.dk;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kb;
import ruhack.phobia.mq;

public class eq
extends ds {
    public static final boolean a;
    private final kb friendSetting;
    public static final int b;
    private final String[] teleportMessages;
    private static int[] afp;
    private static long[] aga;
    private static int[] afo;
    private boolean canAccept;
    public static final boolean c;
    private static long[] afz;
    private static final long h = -13450942520126870L;

    private static /* synthetic */ void apw() {
        eq.afp[0] = -1665292487;
        eq.afp[1] = -549422913;
        eq.afp[2] = 2092266963;
        eq.afp[3] = -393705661;
        eq.afp[4] = -1666643732;
        eq.afp[5] = -830059134;
        eq.afp[6] = -465989317;
        eq.afp[7] = 388683026;
        eq.afp[8] = 1038799190;
        eq.afp[9] = -37620471;
        eq.afp[10] = -1503943396;
        eq.afp[11] = -1951404576;
        eq.afp[12] = -2146758773;
        eq.afp[13] = -936265227;
        eq.afp[14] = -1983011753;
        eq.afp[15] = -1207628576;
        eq.afp[16] = 1593870281;
        eq.afp[17] = 367595966;
        eq.afp[18] = -1421330434;
        eq.afp[19] = 978107753;
        eq.afp[20] = 54298645;
        eq.afp[21] = 1931246684;
        eq.afp[22] = 1072060546;
        eq.afp[23] = -1849850471;
        eq.afp[24] = 201581981;
        eq.afp[25] = 42960522;
        eq.afp[26] = -645498431;
        eq.afp[27] = -1375753728;
        eq.afp[28] = -577021086;
        eq.afp[29] = -387244078;
        eq.afp[30] = -964253462;
        eq.afp[31] = -1779374905;
        eq.afp[32] = -865457750;
        eq.afp[33] = 549962341;
        eq.afp[34] = -263817623;
        eq.afp[35] = 2111744684;
        eq.afp[36] = -1221184679;
        eq.afp[37] = -646760001;
        eq.afp[38] = -1475846536;
        eq.afp[39] = -805709819;
        eq.afp[40] = -2054799194;
        eq.afp[41] = 614777168;
        eq.afp[42] = -413520647;
        eq.afp[43] = 1105832453;
        eq.afp[44] = 634992913;
        eq.afp[45] = 2139041103;
        eq.afp[46] = -908839938;
        eq.afp[47] = 550565329;
        eq.afp[48] = -1025083905;
        eq.afp[49] = 2129562782;
        eq.afp[50] = 943910354;
        eq.afp[51] = 697926173;
        eq.afp[52] = -1841722297;
        eq.afp[53] = 1595675515;
        eq.afp[54] = 2086685168;
        eq.afp[55] = -864602929;
        eq.afp[56] = 1987000497;
        eq.afp[57] = 1424463367;
        eq.afp[58] = -505405916;
        eq.afp[59] = -1642344944;
        eq.afp[60] = 511211273;
        eq.afp[61] = -594757958;
        eq.afp[62] = 776957835;
        eq.afp[63] = -1371728903;
        eq.afp[64] = 1883733909;
        eq.afp[65] = 746369764;
        eq.afp[66] = 211431175;
        eq.afp[67] = 660149637;
        eq.afp[68] = -1834898134;
        eq.afp[69] = -2040144486;
        eq.afp[70] = 2088202901;
        eq.afp[71] = 86027924;
        eq.afp[72] = 618553131;
        eq.afp[73] = 969141358;
        eq.afp[74] = -10080370;
        eq.afp[75] = -1948698842;
        eq.afp[76] = 1653258565;
        eq.afp[77] = 299741230;
        eq.afp[78] = 1227287257;
        eq.afp[79] = -2109829227;
        eq.afp[80] = -2099677394;
        eq.afp[81] = -13527301;
        eq.afp[82] = 219542493;
        eq.afp[83] = -2108648151;
        eq.afp[84] = -1478339813;
        eq.afp[85] = -197899707;
        eq.afp[86] = 501365239;
        eq.afp[87] = -1843508048;
        eq.afp[88] = -1081733708;
        eq.afp[89] = -78787800;
        eq.afp[90] = -610864450;
        eq.afp[91] = -1402379102;
        eq.afp[92] = -971437222;
        eq.afp[93] = 1696088913;
        eq.afp[94] = -546455666;
        eq.afp[95] = 198696062;
        eq.afp[96] = 650004634;
        eq.afp[97] = 1526865859;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$onPacket$0(String var0, dk var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eq.h - eq.afq("aoh", afy(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eq.afq("aoi", afn(int ), (int)85)) break;
            v0 /* !! */  = (long)eq.afq("aok", afn(int ), (int)86);
        }
        var4_2 = eq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eq.h - eq.afq("aom", afy(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eq.afq("aon", afn(int ), (int)87)) break;
            v1 /* !! */  = (long)eq.afq("aop", afn(int ), (int)88);
        }
        var3_3 /* !! */  = eq.b;
        v2 /* !! */  = eq.h;
        if (true) ** GOTO lbl17
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - eq.afq("aoq", afy(int ), (int)71));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1504683033: {
                    v3 = eq.afq("aos", afy(int ), (int)72);
                    continue block13;
                }
                case -92011746: {
                    v3 = eq.afq("aot", afy(int ), (int)73);
                    continue block13;
                }
                case 1697747562: {
                    break block13;
                }
            }
            break;
        }
        var2_4 = eq.a;
        if (!var4_2) ** GOTO lbl33
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)eq.afq("aov", afn(int ), (int)89);
                }
lbl33:
                // 1 sources

                if (var2_4 || var2_4) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eq.h - eq.afq("aox", afy(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eq.afq("aoz", afn(int ), (int)90)) break;
                    v4 /* !! */  = (long)eq.afq("apb", afn(int ), (int)91);
                }
                v5 = var1_1.getName();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = eq.h - eq.afq("apd", afy(int ), (int)75)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == eq.afq("ape", afn(int ), (int)92)) break;
                    v6 /* !! */  = (long)eq.afq("apg", afn(int ), (int)93);
                }
                return var0.contains(v5);
                case 0: {
                    do {
                        var3_3 /* !! */  = (int)eq.afq("aph", afn(int ), (int)94);
                    } while (!var4_2);
                    throw null;
                }
                case 1: {
                    var3_3 /* !! */  = (int)eq.afq("apj", afn(int ), (int)95);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var3_3 /* !! */  = (int)eq.afq("apm", afn(int ), (int)96);
                    } while (!var4_2);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)eq.afq("apo", afn(int ), (int)97);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTeleportMessage(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eq.h - eq.afq("ama", afy(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eq.afq("amc", afn(int ), (int)70)) break;
            v0 /* !! */  = (long)eq.afq("amd", afn(int ), (int)71);
        }
        var4_2 = eq.c;
        v1 /* !! */  = eq.h;
        if (true) ** GOTO lbl11
        block32: while (true) {
            v1 /* !! */  = (long)(v2 - eq.afq("amf", afy(int ), (int)50));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -211044024: {
                    v2 = eq.afq("amh", afy(int ), (int)51);
                    continue block32;
                }
                case 659313378: {
                    v2 = eq.afq("ami", afy(int ), (int)52);
                    continue block32;
                }
                case 1583106803: {
                    v2 = eq.afq("amk", afy(int ), (int)53);
                    continue block32;
                }
                case 1697747562: {
                    break block32;
                }
            }
            break;
        }
        var3_3 /* !! */  = eq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = eq.h - eq.afq("aml", afy(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == eq.afq("amn", afn(int ), (int)72)) break;
            v3 /* !! */  = (long)eq.afq("amp", afn(int ), (int)73);
        }
        var2_4 = eq.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)eq.afq("amq", afn(int ), (int)74);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = eq.h - eq.afq("ams", afy(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == eq.afq("amu", afn(int ), (int)75)) break;
                    v4 /* !! */  = (long)eq.afq("amv", afn(int ), (int)76);
                }
                v5 /* !! */  = eq.h;
                if (true) ** GOTO lbl47
                block36: while (true) {
                    v5 /* !! */  = (long)(eq.afq("amy", afy(int ), (int)57) - eq.afq("amx", afy(int ), (int)56));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 541068686: {
                            continue block36;
                        }
                        case 1697747562: {
                            break block36;
                        }
                    }
                    break;
                }
                v6 = Arrays.stream(this.teleportMessages);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = eq.h - eq.afq("ana", afy(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == eq.afq("anc", afn(int ), (int)77)) break;
                    v7 /* !! */  = (long)eq.afq("and", afn(int ), (int)78);
                }
                v8 = (Function<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toLowerCase(), (Ljava/lang/String;)Ljava/lang/String;)();
                v9 /* !! */  = eq.h;
                if (true) ** GOTO lbl63
                block38: while (true) {
                    v9 /* !! */  = (long)(v10 - eq.afq("anf", afy(int ), (int)59));
lbl63:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1971382074: {
                            v10 = eq.afq("anh", afy(int ), (int)60);
                            continue block38;
                        }
                        case -1312038973: {
                            v10 = eq.afq("ani", afy(int ), (int)61);
                            continue block38;
                        }
                        case 1697747562: {
                            break block38;
                        }
                    }
                    break;
                }
                v11 = v6.map(v8);
                v12 = var1_1;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = eq.h - eq.afq("ank", afy(int ), (int)62)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == eq.afq("anl", afn(int ), (int)79)) break;
                    v13 /* !! */  = (long)eq.afq("ann", afn(int ), (int)80);
                }
                Objects.requireNonNull(v12);
                v14 /* !! */  = eq.h;
                if (true) ** GOTO lbl84
                block40: while (true) {
                    v14 /* !! */  = (long)(v15 - eq.afq("anp", afy(int ), (int)63));
lbl84:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -585013012: {
                            v15 = eq.afq("anq", afy(int ), (int)64);
                            continue block40;
                        }
                        case 1697747562: {
                            break block40;
                        }
                        case 2106583997: {
                            v15 = eq.afq("ans", afy(int ), (int)65);
                            continue block40;
                        }
                    }
                    break;
                }
                v16 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.CharSequence ), (Ljava/lang/String;)Z)((String)v12);
                v17 /* !! */  = eq.h;
                if (true) ** GOTO lbl98
                block41: while (true) {
                    v17 /* !! */  = (long)(v18 - eq.afq("anu", afy(int ), (int)66));
lbl98:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -767868326: {
                            v18 = eq.afq("anv", afy(int ), (int)67);
                            continue block41;
                        }
                        case 1697747562: {
                            break block41;
                        }
                        case 1940042843: {
                            v18 = eq.afq("anx", afy(int ), (int)68);
                            continue block41;
                        }
                    }
                    break;
                }
                return v11.anyMatch(v16);
            }
lbl108:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)eq.afq("anz", afn(int ), (int)81);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)eq.afq("aob", afn(int ), (int)82);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)eq.afq("aoc", afn(int ), (int)83);
                if (!var4_2) ** GOTO lbl108
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)eq.afq("aoe", afn(int ), (int)84);
        ** while (!var4_2)
lbl125:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = eq.h - eq.afq("agb", afy(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == eq.afq("agc", afn(int ), (int)7)) break;
            v0 /* !! */  = (long)eq.afq("agd", afn(int ), (int)8);
        }
        var7_2 = eq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = eq.h - eq.afq("age", afy(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == eq.afq("agf", afn(int ), (int)9)) break;
            v1 /* !! */  = (long)eq.afq("agg", afn(int ), (int)10);
        }
        var6_3 /* !! */  = eq.b;
        v2 /* !! */  = eq.h;
        if (true) ** GOTO lbl17
        block68: while (true) {
            v2 /* !! */  = (long)(v3 - eq.afq("agh", afy(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 963207412: {
                    v3 = eq.afq("agi", afy(int ), (int)3);
                    continue block68;
                }
                case 1697747562: {
                    break block68;
                }
                case 2117645006: {
                    v3 = eq.afq("agj", afy(int ), (int)4);
                    continue block68;
                }
            }
            break;
        }
        var5_4 = eq.a;
        if (var7_2) {
            throw null;
lbl29:
            // 13 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = eq.h - eq.afq("agk", afy(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == eq.afq("agl", afn(int ), (int)11)) break;
            v4 /* !! */  = (long)eq.afq("agm", afn(int ), (int)12);
        }
        var3_5 /* !! */  = var1_1.getPacket();
        if (var5_4) ** GOTO lbl29
        if (!(var3_5 /* !! */  instanceof class_7439)) ** GOTO lbl173
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl29
                var2_6 = (class_7439)var3_5 /* !! */ ;
                if (var5_4 || var5_4) ** GOTO lbl29
                v5 /* !! */  = eq.h;
                if (true) ** GOTO lbl50
                block71: while (true) {
                    v5 /* !! */  = (long)(v6 - eq.afq("agn", afy(int ), (int)6));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 979915141: {
                            v6 = eq.afq("ago", afy(int ), (int)7);
                            continue block71;
                        }
                        case 1697747562: {
                            break block71;
                        }
                        case 1855126534: {
                            v6 = eq.afq("agp", afy(int ), (int)8);
                            continue block71;
                        }
                        case 1864232081: {
                            v6 = eq.afq("agq", afy(int ), (int)9);
                            continue block71;
                        }
                    }
                    break;
                }
                v7 = var2_6.comp_763();
                v8 /* !! */  = eq.h;
                if (true) ** GOTO lbl67
                block72: while (true) {
                    v8 /* !! */  = (long)(eq.afq("ags", afy(int ), (int)11) - eq.afq("agr", afy(int ), (int)10));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -507874475: {
                            continue block72;
                        }
                        case 1697747562: {
                            break block72;
                        }
                    }
                    break;
                }
                var3_5 /* !! */  = v7.getString();
                if (var5_4 || var5_4) ** GOTO lbl29
                v9 /* !! */  = eq.h;
                if (true) ** GOTO lbl78
                block73: while (true) {
                    v9 /* !! */  = (long)(v10 - eq.afq("agt", afy(int ), (int)12));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -391632242: {
                            v10 = eq.afq("agu", afy(int ), (int)13);
                            continue block73;
                        }
                        case 1697747562: {
                            break block73;
                        }
                        case 1754282111: {
                            v10 = eq.afq("agv", afy(int ), (int)14);
                            continue block73;
                        }
                    }
                    break;
                }
                v11 /* !! */  = eq.h;
                if (true) ** GOTO lbl91
                block74: while (true) {
                    v11 /* !! */  = (long)(v12 - eq.afq("agw", afy(int ), (int)15));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1600082601: {
                            v12 = eq.afq("agx", afy(int ), (int)16);
                            continue block74;
                        }
                        case 1129432879: {
                            v12 = eq.afq("agy", afy(int ), (int)17);
                            continue block74;
                        }
                        case 1697747562: {
                            break block74;
                        }
                    }
                    break;
                }
                if (!this.friendSetting.isValue()) ** GOTO lbl143
                if (var5_4) ** GOTO lbl29
                v13 /* !! */  = eq.h;
                if (true) ** GOTO lbl106
                block75: while (true) {
                    v13 /* !! */  = (long)(v14 - eq.afq("agz", afy(int ), (int)18));
lbl106:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1660522518: {
                            v14 = eq.afq("aha", afy(int ), (int)19);
                            continue block75;
                        }
                        case 1489294600: {
                            v14 = eq.afq("ahb", afy(int ), (int)20);
                            continue block75;
                        }
                        case 1697747562: {
                            break block75;
                        }
                    }
                    break;
                }
                v15 = dl.getFriends();
                v16 /* !! */  = eq.h;
                if (true) ** GOTO lbl120
                block76: while (true) {
                    v16 /* !! */  = (long)(v17 - eq.afq("ahc", afy(int ), (int)21));
lbl120:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1948757912: {
                            v17 = eq.afq("ahd", afy(int ), (int)22);
                            continue block76;
                        }
                        case -594967373: {
                            v17 = eq.afq("ahe", afy(int ), (int)23);
                            continue block76;
                        }
                        case 1697747562: {
                            break block76;
                        }
                    }
                    break;
                }
                v18 = v15.stream();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = eq.h - eq.afq("ahf", afy(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == eq.afq("ahg", afn(int ), (int)13)) break;
                    v19 /* !! */  = (long)eq.afq("ahh", afn(int ), (int)14);
                }
                v20 = (Predicate<dk>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onPacket$0(java.lang.String ruhack.phobia.dk ), (Lruhack/phobia/dk;)Z)(var3_5 /* !! */ );
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = eq.h - eq.afq("ahi", afy(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == eq.afq("ahj", afn(int ), (int)15)) break;
                    v21 /* !! */  = (long)eq.afq("ahk", afn(int ), (int)16);
                }
                if (!v18.anyMatch(v20)) ** GOTO lbl148
                if (var5_4) ** GOTO lbl29
lbl143:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v22 = eq.afq("ahl", afn(int ), (int)17);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl150
lbl148:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v22 = var4_7 = eq.afq("ahm", afn(int ), (int)18);
lbl150:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl29
                v23 /* !! */  = eq.h;
                if (true) ** GOTO lbl155
                block79: while (true) {
                    v23 /* !! */  = (long)(v24 - eq.afq("ahn", afy(int ), (int)26));
lbl155:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 1292232705: {
                            v24 = eq.afq("aho", afy(int ), (int)27);
                            continue block79;
                        }
                        case 1696952122: {
                            v24 = eq.afq("ahp", afy(int ), (int)28);
                            continue block79;
                        }
                        case 1697747562: {
                            break block79;
                        }
                    }
                    break;
                }
                if (!this.isTeleportMessage((String)var3_5 /* !! */ )) ** GOTO lbl173
                if (var5_4 || var5_4) ** GOTO lbl29
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_5 = eq.h - eq.afq("ahq", afy(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == eq.afq("ahr", afn(int ), (int)19)) break;
                    v25 /* !! */  = (long)eq.afq("ahs", afn(int ), (int)20);
                }
                this.canAccept = var4_7;
                if (var5_4) ** GOTO lbl29
lbl173:
                // 3 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)eq.afq("aht", afn(int ), (int)21);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 1: {
                var6_3 /* !! */  = (int)eq.afq("ahu", afn(int ), (int)22);
                if (!var7_2) break;
                throw null;
            }
lbl185:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)eq.afq("ahv", afn(int ), (int)23);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl190:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)eq.afq("ahw", afn(int ), (int)24);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl195:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)eq.afq("ahx", afn(int ), (int)25);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl200:
            // 4 sources

            case 5: {
                var6_3 /* !! */  = (int)eq.afq("ahy", afn(int ), (int)26);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 6: {
                var6_3 /* !! */  = (int)eq.afq("ahz", afn(int ), (int)27);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 7: {
                var6_3 /* !! */  = (int)eq.afq("aia", afn(int ), (int)28);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 8: {
                var6_3 /* !! */  = (int)eq.afq("aib", afn(int ), (int)29);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 9: {
                var6_3 /* !! */  = (int)eq.afq("aic", afn(int ), (int)30);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl225:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)eq.afq("aid", afn(int ), (int)31);
                if (!var7_2) ** GOTO lbl200
                throw null;
            }
lbl229:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)eq.afq("aif", afn(int ), (int)32);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl234:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)eq.afq("aig", afn(int ), (int)33);
                    if (!var7_2) ** GOTO lbl229
                    throw null;
                }
            }
lbl239:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)eq.afq("aih", afn(int ), (int)34);
                if (!var7_2) ** GOTO lbl185
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)eq.afq("aii", afn(int ), (int)35);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 15: {
                var6_3 /* !! */  = (int)eq.afq("aik", afn(int ), (int)36);
                if (!var7_2) ** GOTO lbl200
                throw null;
            }
lbl252:
            // 2 sources

            case 16: {
                var6_3 /* !! */  = (int)eq.afq("ail", afn(int ), (int)37);
                if (!var7_2) ** GOTO lbl195
                throw null;
            }
lbl256:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)eq.afq("aim", afn(int ), (int)38);
                if (!var7_2) ** GOTO lbl190
                throw null;
            }
lbl260:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)eq.afq("ain", afn(int ), (int)39);
                if (!var7_2) ** GOTO lbl200
                throw null;
            }
lbl264:
            // 3 sources

            case 19: {
                var6_3 /* !! */  = (int)eq.afq("aio", afn(int ), (int)40);
                if (!var7_2) ** GOTO lbl252
                throw null;
            }
lbl268:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)eq.afq("aip", afn(int ), (int)41);
                if (!var7_2) ** GOTO lbl225
                throw null;
            }
lbl272:
            // 5 sources

            case 21: {
                var6_3 /* !! */  = (int)eq.afq("aiq", afn(int ), (int)42);
                if (!var7_2) ** GOTO lbl268
                throw null;
            }
            case 22: {
                var6_3 /* !! */  = (int)eq.afq("ais", afn(int ), (int)43);
                if (!var7_2) ** GOTO lbl272
                throw null;
            }
            case 23: 
        }
        var6_3 /* !! */  = (int)eq.afq("ait", afn(int ), (int)44);
        ** while (!var7_2)
lbl283:
        // 1 sources

        throw null;
    }

    static {
        afo = new int[98];
        afp = new int[98];
        eq.aps();
        eq.apw();
        afz = new long[76];
        aga = new long[76];
        eq.apx();
        eq.apz();
    }

    private static /* synthetic */ long afy(int n2) {
        return afz[n2] ^ aga[n2];
    }

    private static /* synthetic */ int afn(int n2) {
        return afo[n2] ^ afp[n2];
    }

    private static /* synthetic */ void apx() {
        eq.afz[0] = 3687849697810645973L;
        eq.afz[1] = 3565963810392737691L;
        eq.afz[2] = -5314505091574503611L;
        eq.afz[3] = 513074457645978915L;
        eq.afz[4] = -5681531004654672110L;
        eq.afz[5] = -7040350607892136914L;
        eq.afz[6] = 4995722919077472187L;
        eq.afz[7] = 7080307177490252335L;
        eq.afz[8] = -2918094157800713373L;
        eq.afz[9] = -5266241996506253896L;
        eq.afz[10] = -1610130011405918201L;
        eq.afz[11] = -9097303753106163226L;
        eq.afz[12] = 3768185670574377595L;
        eq.afz[13] = 6665052147981964539L;
        eq.afz[14] = 3259287463024801772L;
        eq.afz[15] = 1963609043015909656L;
        eq.afz[16] = -7351111908518954314L;
        eq.afz[17] = -8353404804081973769L;
        eq.afz[18] = -4288192721593342619L;
        eq.afz[19] = -2166860668604516585L;
        eq.afz[20] = 1782348922872855540L;
        eq.afz[21] = -1856000362705404436L;
        eq.afz[22] = 4967950979551226432L;
        eq.afz[23] = -1559589316856165288L;
        eq.afz[24] = 3494848359031771300L;
        eq.afz[25] = 3607110786126560941L;
        eq.afz[26] = -7190614135283016315L;
        eq.afz[27] = 2347324503164526385L;
        eq.afz[28] = 2570951244976142663L;
        eq.afz[29] = -7041629354107294116L;
        eq.afz[30] = 5945182436678716801L;
        eq.afz[31] = 3462617539073410954L;
        eq.afz[32] = 5609556049318596466L;
        eq.afz[33] = -9021880797760636544L;
        eq.afz[34] = -2948569992747621259L;
        eq.afz[35] = 6717617784608376148L;
        eq.afz[36] = 8057901256572300907L;
        eq.afz[37] = 1958565331256178898L;
        eq.afz[38] = -3280451584012420495L;
        eq.afz[39] = 7607061234820328551L;
        eq.afz[40] = 5978829300351109567L;
        eq.afz[41] = 6008395287326968437L;
        eq.afz[42] = -599891300876750864L;
        eq.afz[43] = 1851684029843989758L;
        eq.afz[44] = 767794564929297779L;
        eq.afz[45] = -1042680802573422024L;
        eq.afz[46] = -6679385642774579467L;
        eq.afz[47] = -4813422986002772005L;
        eq.afz[48] = -2778919780655576806L;
        eq.afz[49] = 9050324165819702936L;
        eq.afz[50] = 4154420999943018755L;
        eq.afz[51] = 4720090220210093732L;
        eq.afz[52] = 809964684674807661L;
        eq.afz[53] = 1982071135198150467L;
        eq.afz[54] = -4633247895179176383L;
        eq.afz[55] = 1621964471277325082L;
        eq.afz[56] = -277001166850263770L;
        eq.afz[57] = 3577093912652445256L;
        eq.afz[58] = 1671210351662912847L;
        eq.afz[59] = 6715628957067352231L;
        eq.afz[60] = 7059442414254567489L;
        eq.afz[61] = -2092918841764252865L;
        eq.afz[62] = -6167778810690344291L;
        eq.afz[63] = 3908104272597995815L;
        eq.afz[64] = 7952798370592541925L;
        eq.afz[65] = -177039532297314472L;
        eq.afz[66] = 2749024134914556689L;
        eq.afz[67] = -2206998783181107432L;
        eq.afz[68] = -5468419486620410298L;
        eq.afz[69] = 8831916928877119423L;
        eq.afz[70] = 2102723228795301796L;
        eq.afz[71] = 268743242418544869L;
        eq.afz[72] = -6175678434132019777L;
        eq.afz[73] = -2682982328878361675L;
        eq.afz[74] = -7976450709381631758L;
        eq.afz[75] = -6852413460704393284L;
    }

    public eq() {
        int n2 = b;
        super("AutoTpAccept", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0435\u0442 \u0437\u0430\u043f\u0440\u043e\u0441\u044b \u043d\u0430 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\u0446\u0438\u044e", du.MISC);
        this.teleportMessages = new String[]{"has requested teleport", "\u043f\u0440\u043e\u0441\u0438\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f", "\u0445\u043e\u0447\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f \u043a \u0432\u0430\u043c", "\u043f\u0440\u043e\u0441\u0438\u0442 \u043a \u0432\u0430\u043c \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f"};
        this.friendSetting = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u0434\u0440\u0443\u0437\u044c\u044f", "\u0411\u0443\u0434\u0435\u0442 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u044c \u0437\u0430\u043f\u0440\u043e\u0441\u044b \u0442\u043e\u043b\u044c\u043a\u043e \u043e\u0442 \u0434\u0440\u0443\u0437\u0435\u0439").setValue((boolean)eq.afq("afr", afn(int ), (int)0));
        this.settings(this.friendSetting);
    }

    private static /* synthetic */ void aps() {
        eq.afo[0] = -1665292488;
        eq.afo[1] = -549422916;
        eq.afo[2] = 2092266962;
        eq.afo[3] = -393705662;
        eq.afo[4] = -1666643730;
        eq.afo[5] = -830059136;
        eq.afo[6] = -465989318;
        eq.afo[7] = -388683027;
        eq.afo[8] = -129143839;
        eq.afo[9] = 37620470;
        eq.afo[10] = 59455944;
        eq.afo[11] = -1951404575;
        eq.afo[12] = -2047953706;
        eq.afo[13] = 936265226;
        eq.afo[14] = 312004435;
        eq.afo[15] = -1207628575;
        eq.afo[16] = 1955262844;
        eq.afo[17] = 367595967;
        eq.afo[18] = -1421330434;
        eq.afo[19] = 978107752;
        eq.afo[20] = 1709367092;
        eq.afo[21] = 1931246668;
        eq.afo[22] = 1072060558;
        eq.afo[23] = -1849850488;
        eq.afo[24] = 201581980;
        eq.afo[25] = 42960538;
        eq.afo[26] = -645498409;
        eq.afo[27] = -1375753722;
        eq.afo[28] = -577021068;
        eq.afo[29] = -387244066;
        eq.afo[30] = -964253468;
        eq.afo[31] = -1779374899;
        eq.afo[32] = -865457747;
        eq.afo[33] = 549962339;
        eq.afo[34] = -263817605;
        eq.afo[35] = 2111744699;
        eq.afo[36] = -1221184692;
        eq.afo[37] = -646760012;
        eq.afo[38] = -1475846541;
        eq.afo[39] = -805709805;
        eq.afo[40] = -2054799177;
        eq.afo[41] = 614777176;
        eq.afo[42] = -413520651;
        eq.afo[43] = 1105832463;
        eq.afo[44] = 634992927;
        eq.afo[45] = 2139041102;
        eq.afo[46] = -214924325;
        eq.afo[47] = -550565330;
        eq.afo[48] = -1235813052;
        eq.afo[49] = -2129562783;
        eq.afo[50] = 1780976040;
        eq.afo[51] = -697926174;
        eq.afo[52] = -2105165378;
        eq.afo[53] = -1595675516;
        eq.afo[54] = 24683821;
        eq.afo[55] = -864602929;
        eq.afo[56] = -1987000498;
        eq.afo[57] = 429018598;
        eq.afo[58] = -505405908;
        eq.afo[59] = -1642344936;
        eq.afo[60] = 511211265;
        eq.afo[61] = -594757958;
        eq.afo[62] = 776957839;
        eq.afo[63] = -1371728912;
        eq.afo[64] = 1883733917;
        eq.afo[65] = 746369760;
        eq.afo[66] = 211431169;
        eq.afo[67] = 660149633;
        eq.afo[68] = -1834898135;
        eq.afo[69] = -2040144494;
        eq.afo[70] = -2088202902;
        eq.afo[71] = -798114027;
        eq.afo[72] = -618553132;
        eq.afo[73] = 1499391687;
        eq.afo[74] = -10080369;
        eq.afo[75] = 1948698841;
        eq.afo[76] = 35043812;
        eq.afo[77] = -299741231;
        eq.afo[78] = 1612448940;
        eq.afo[79] = -2109829228;
        eq.afo[80] = -408315907;
        eq.afo[81] = -13527301;
        eq.afo[82] = 219542494;
        eq.afo[83] = -2108648149;
        eq.afo[84] = -1478339815;
        eq.afo[85] = 197899706;
        eq.afo[86] = 1038133380;
        eq.afo[87] = 1843508047;
        eq.afo[88] = 2116887782;
        eq.afo[89] = -78787800;
        eq.afo[90] = -610864449;
        eq.afo[91] = -1694230408;
        eq.afo[92] = -971437221;
        eq.afo[93] = -1035723326;
        eq.afo[94] = -546455668;
        eq.afo[95] = 198696063;
        eq.afo[96] = 650004632;
        eq.afo[97] = 1526865859;
    }

    public static /* synthetic */ CallSite afq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = eq.h;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - eq.afq("aiy", afy(int ), (int)30));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -862428924: {
                    v1 = eq.afq("aiz", afy(int ), (int)31);
                    continue block35;
                }
                case 834973992: {
                    v1 = eq.afq("ajb", afy(int ), (int)32);
                    continue block35;
                }
                case 1697747562: {
                    break block35;
                }
            }
            break;
        }
        var4_2 = eq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = eq.h - eq.afq("ajd", afy(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == eq.afq("ajf", afn(int ), (int)45)) break;
            v2 /* !! */  = (long)eq.afq("ajg", afn(int ), (int)46);
        }
        var3_3 /* !! */  = eq.b;
        v3 /* !! */  = eq.h;
        if (true) ** GOTO lbl25
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - eq.afq("aji", afy(int ), (int)34));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1836981747: {
                    v4 = eq.afq("ajk", afy(int ), (int)35);
                    continue block37;
                }
                case -1087992632: {
                    v4 = eq.afq("ajl", afy(int ), (int)36);
                    continue block37;
                }
                case -298741508: {
                    v4 = eq.afq("ajn", afy(int ), (int)37);
                    continue block37;
                }
                case 1697747562: {
                    break block37;
                }
            }
            break;
        }
        var2_4 = eq.a;
        if (var4_2) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = eq.h - eq.afq("ajp", afy(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == eq.afq("ajr", afn(int ), (int)47)) break;
            v5 /* !! */  = (long)eq.afq("aju", afn(int ), (int)48);
        }
        if (mq.isPvp()) ** GOTO lbl107
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = eq.h - eq.afq("ajw", afy(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == eq.afq("ajx", afn(int ), (int)49)) break;
                    v6 /* !! */  = (long)eq.afq("aka", afn(int ), (int)50);
                }
                if (!this.canAccept) ** GOTO lbl107
                if (var2_4 || var2_4) ** GOTO lbl40
                v7 /* !! */  = eq.h;
                if (true) ** GOTO lbl64
                block41: while (true) {
                    v7 /* !! */  = (long)(v8 - eq.afq("akc", afy(int ), (int)40));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1374830076: {
                            v8 = eq.afq("akd", afy(int ), (int)41);
                            continue block41;
                        }
                        case 245646224: {
                            v8 = eq.afq("akf", afy(int ), (int)42);
                            continue block41;
                        }
                        case 358926208: {
                            v8 = eq.afq("akh", afy(int ), (int)43);
                            continue block41;
                        }
                        case 1697747562: {
                            break block41;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = eq.h - eq.afq("akk", afy(int ), (int)44)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == eq.afq("akl", afn(int ), (int)51)) break;
                    v9 /* !! */  = (long)eq.afq("akn", afn(int ), (int)52);
                }
                v10 = eq.mc.field_1724;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = eq.h - eq.afq("akp", afy(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == eq.afq("akq", afn(int ), (int)53)) break;
                    v11 /* !! */  = (long)eq.afq("aks", afn(int ), (int)54);
                }
                v12 = v10.field_3944;
                v13 /* !! */  = eq.h;
                if (true) ** GOTO lbl92
                block44: while (true) {
                    v13 /* !! */  = (long)(eq.afq("akv", afy(int ), (int)47) - eq.afq("aku", afy(int ), (int)46));
lbl92:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1697747562: {
                            break block44;
                        }
                        case 1856836145: {
                            continue block44;
                        }
                    }
                    break;
                }
                v12.method_45730("tpaccept");
                if (var2_4 || var2_4) ** GOTO lbl40
                v14 = eq.afq("akx", afn(int ), (int)55);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = eq.h - eq.afq("ala", afy(int ), (int)48)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == eq.afq("alc", afn(int ), (int)56)) break;
                    v15 /* !! */  = (long)eq.afq("ald", afn(int ), (int)57);
                }
                this.canAccept = v14;
                if (var2_4) ** GOTO lbl40
lbl107:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl110:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)eq.afq("alf", afn(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl115:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)eq.afq("alh", afn(int ), (int)59);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 2: {
                var3_3 /* !! */  = (int)eq.afq("ali", afn(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)eq.afq("alk", afn(int ), (int)61);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                    break;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)eq.afq("alm", afn(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)eq.afq("aln", afn(int ), (int)63);
                } while (!var4_2);
                throw null;
            }
lbl141:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)eq.afq("alp", afn(int ), (int)64);
                if (!var4_2) break;
                throw null;
            }
lbl145:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)eq.afq("alr", afn(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
            }
lbl149:
            // 4 sources

            case 8: {
                var3_3 /* !! */  = (int)eq.afq("alt", afn(int ), (int)66);
                if (!var4_2) ** GOTO lbl115
                throw null;
            }
lbl153:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)eq.afq("alu", afn(int ), (int)67);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
lbl157:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)eq.afq("alw", afn(int ), (int)68);
                if (!var4_2) ** GOTO lbl110
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)eq.afq("alx", afn(int ), (int)69);
        ** while (!var4_2)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void apz() {
        eq.aga[0] = 4112275775114008581L;
        eq.aga[1] = 5153698994014463747L;
        eq.aga[2] = -674735554313242768L;
        eq.aga[3] = 1985049494266995018L;
        eq.aga[4] = 5168894779677021084L;
        eq.aga[5] = 3375570167293104942L;
        eq.aga[6] = 7213185887765834945L;
        eq.aga[7] = -8116237515634842320L;
        eq.aga[8] = 7783057885836254714L;
        eq.aga[9] = -5698466312986730534L;
        eq.aga[10] = 5462302672118558560L;
        eq.aga[11] = -3201284309064693011L;
        eq.aga[12] = 7390705854119064033L;
        eq.aga[13] = -7853343511396411435L;
        eq.aga[14] = 3371785550881806306L;
        eq.aga[15] = 6230669517204877112L;
        eq.aga[16] = -3959270284448773225L;
        eq.aga[17] = 3055036931881836906L;
        eq.aga[18] = -7378007687927703917L;
        eq.aga[19] = -3572977516299212251L;
        eq.aga[20] = -3354291345448407390L;
        eq.aga[21] = -6328573159454884999L;
        eq.aga[22] = 704044510113741782L;
        eq.aga[23] = 5438317644354651137L;
        eq.aga[24] = 8181939657109597151L;
        eq.aga[25] = -148841073913960800L;
        eq.aga[26] = 2627328759394407500L;
        eq.aga[27] = -2725637633724497158L;
        eq.aga[28] = 7055642080264742320L;
        eq.aga[29] = 2163869686675214849L;
        eq.aga[30] = -2953823290499577211L;
        eq.aga[31] = 4737373654952872084L;
        eq.aga[32] = 1518388350716364484L;
        eq.aga[33] = 5298874620400313368L;
        eq.aga[34] = -3322347712753835734L;
        eq.aga[35] = 1755143205224294386L;
        eq.aga[36] = 7280089055006364910L;
        eq.aga[37] = -8791892789185055258L;
        eq.aga[38] = -157371088196948397L;
        eq.aga[39] = 7835209471762317192L;
        eq.aga[40] = -546744144363017554L;
        eq.aga[41] = -3165414191843414470L;
        eq.aga[42] = 2600710325252154830L;
        eq.aga[43] = 5011132745557097067L;
        eq.aga[44] = 4966938380835260940L;
        eq.aga[45] = -1509918482004827620L;
        eq.aga[46] = -5371157236773262347L;
        eq.aga[47] = 8029296408747180190L;
        eq.aga[48] = -158749941928655338L;
        eq.aga[49] = 5629057707057628542L;
        eq.aga[50] = 1391278306941361897L;
        eq.aga[51] = -5687385581463239700L;
        eq.aga[52] = 3890866851939583591L;
        eq.aga[53] = -7857638685569696731L;
        eq.aga[54] = -1946248669264634402L;
        eq.aga[55] = 7634918963153279796L;
        eq.aga[56] = 4744414846150793712L;
        eq.aga[57] = 953644514304974348L;
        eq.aga[58] = 1298190459174556330L;
        eq.aga[59] = -6549137417100890320L;
        eq.aga[60] = 7374859145866385867L;
        eq.aga[61] = 1372278832238257898L;
        eq.aga[62] = 7727061321377510743L;
        eq.aga[63] = 38132189421714119L;
        eq.aga[64] = -2814677630889128749L;
        eq.aga[65] = -8566371261755166747L;
        eq.aga[66] = -1470729347609955581L;
        eq.aga[67] = -2838296290234097677L;
        eq.aga[68] = 5822883170257689429L;
        eq.aga[69] = 221223393764841905L;
        eq.aga[70] = 1588371812196331342L;
        eq.aga[71] = 7207103765650285659L;
        eq.aga[72] = -4388171004498501806L;
        eq.aga[73] = 7275136595261310843L;
        eq.aga[74] = 6832248026524611259L;
        eq.aga[75] = 4245029212727460729L;
    }
}

