/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import ruhack.phobia.c;
import ruhack.phobia.hx;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class ou
implements c {
    private static final long sn = -2750867718904976718L;
    private static int[] kknv;
    private static int[] kknt;
    private final boolean moveCorrection;
    private final float resetThreshold;
    private final hx angleSmooth;
    private static long[] kknm;
    private final boolean freeCorrection;
    private static long[] kkno;
    private final class_243 vec3d;
    private final ov angle;
    public static final int b;
    public static final boolean c;
    private final int ticksUntilReset;
    public static final boolean a;
    private final class_1297 entity;

    private static /* synthetic */ void klao() {
        ou.kknt[0] = 632916672;
        ou.kknt[1] = 2043884751;
        ou.kknt[2] = 1376770281;
        ou.kknt[3] = 1415797480;
        ou.kknt[4] = 41524156;
        ou.kknt[5] = -1057642507;
        ou.kknt[6] = 1173032941;
        ou.kknt[7] = -1627861350;
        ou.kknt[8] = 1553650324;
        ou.kknt[9] = -2064742337;
        ou.kknt[10] = -1337417713;
        ou.kknt[11] = -1802250332;
        ou.kknt[12] = -1948882023;
        ou.kknt[13] = -1968483959;
        ou.kknt[14] = -1058128234;
        ou.kknt[15] = 965385233;
        ou.kknt[16] = -1866648332;
        ou.kknt[17] = 76518141;
        ou.kknt[18] = -1679632909;
        ou.kknt[19] = 817288977;
        ou.kknt[20] = 776752072;
        ou.kknt[21] = 0x949090;
        ou.kknt[22] = 492290483;
        ou.kknt[23] = 730854504;
        ou.kknt[24] = -197881251;
        ou.kknt[25] = -1672706066;
        ou.kknt[26] = 1522879094;
        ou.kknt[27] = -2105740607;
        ou.kknt[28] = 900107890;
        ou.kknt[29] = 2000571872;
        ou.kknt[30] = 1516749031;
        ou.kknt[31] = 575525843;
        ou.kknt[32] = 475495930;
        ou.kknt[33] = -39428310;
        ou.kknt[34] = 731625707;
        ou.kknt[35] = 597903350;
        ou.kknt[36] = 749753864;
        ou.kknt[37] = -356067782;
        ou.kknt[38] = -1959860420;
        ou.kknt[39] = -787791151;
        ou.kknt[40] = 832756719;
        ou.kknt[41] = 1146610393;
        ou.kknt[42] = -1015104473;
        ou.kknt[43] = 1762949515;
        ou.kknt[44] = -2021927844;
        ou.kknt[45] = -2088252950;
        ou.kknt[46] = -304609750;
        ou.kknt[47] = -588733421;
        ou.kknt[48] = 1255145596;
        ou.kknt[49] = 1787178422;
        ou.kknt[50] = -2097383506;
        ou.kknt[51] = 1316356719;
        ou.kknt[52] = 475987161;
        ou.kknt[53] = 1130075311;
        ou.kknt[54] = -42505855;
        ou.kknt[55] = 1661882834;
        ou.kknt[56] = 831583344;
        ou.kknt[57] = -1134373392;
        ou.kknt[58] = -773727841;
        ou.kknt[59] = -1716111446;
        ou.kknt[60] = -1758773339;
        ou.kknt[61] = 786675448;
        ou.kknt[62] = -63664743;
        ou.kknt[63] = -1763357217;
        ou.kknt[64] = 1460545622;
        ou.kknt[65] = -1657816832;
        ou.kknt[66] = -1401848519;
        ou.kknt[67] = -265879584;
        ou.kknt[68] = 1733957089;
        ou.kknt[69] = 1786713407;
        ou.kknt[70] = 398511162;
        ou.kknt[71] = -1074802966;
        ou.kknt[72] = 1719759033;
        ou.kknt[73] = -1979367778;
        ou.kknt[74] = -1906138350;
        ou.kknt[75] = -833008649;
        ou.kknt[76] = 1922618371;
        ou.kknt[77] = 144725976;
        ou.kknt[78] = 1492412717;
        ou.kknt[79] = 1807958382;
        ou.kknt[80] = 93058372;
        ou.kknt[81] = -1316218162;
        ou.kknt[82] = 1038083359;
        ou.kknt[83] = -929761100;
        ou.kknt[84] = -1192484464;
        ou.kknt[85] = 1583323332;
        ou.kknt[86] = -1532512497;
        ou.kknt[87] = 913260513;
        ou.kknt[88] = -1414795346;
        ou.kknt[89] = 1750518091;
        ou.kknt[90] = -1121795181;
        ou.kknt[91] = 1633759563;
        ou.kknt[92] = 875666692;
        ou.kknt[93] = -257173406;
        ou.kknt[94] = -370941137;
        ou.kknt[95] = -261251872;
        ou.kknt[96] = -2081065399;
        ou.kknt[97] = 1409730603;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFreeCorrection() {
        v0 /* !! */  = ou.sn;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ou.kknp("kkyq", kknl(int ), (int)80) - ou.kknp("kkyo", kknl(int ), (int)79));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -638214356: {
                    continue block21;
                }
                case 1721002674: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = ou.c;
        v1 /* !! */  = ou.sn;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ou.kknp("kkys", kknl(int ), (int)81));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 153543425: {
                    v2 = ou.kknp("kkyu", kknl(int ), (int)82);
                    continue block22;
                }
                case 1279588304: {
                    v2 = ou.kknp("kkyy", kknl(int ), (int)83);
                    continue block22;
                }
                case 1319329697: {
                    v2 = ou.kknp("kkza", kknl(int ), (int)84);
                    continue block22;
                }
                case 1721002674: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ou.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkzc", kknl(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ou.kknp("kkzd", kkns(int ), (int)84)) break;
            v3 /* !! */  = (long)ou.kknp("kkze", kkns(int ), (int)85);
        }
        var1_3 = ou.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)ou.kknp("kkzf", kkns(int ), (int)86);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ou.sn;
                if (true) ** GOTO lbl47
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ou.kknp("kkzh", kknl(int ), (int)86));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1721002674: {
                            break block25;
                        }
                        case 1803193727: {
                            v5 = ou.kknp("kkzk", kknl(int ), (int)87);
                            continue block25;
                        }
                        case 1831270701: {
                            v5 = ou.kknp("kkzl", kknl(int ), (int)88);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.freeCorrection;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ou.kknp("kkzn", kkns(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ou.kknp("kkzq", kkns(int ), (int)88);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ou.kknp("kkzs", kkns(int ), (int)89);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ou.kknp("kkzu", kkns(int ), (int)90);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getTicksUntilReset() {
        v0 /* !! */  = ou.sn;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ou.kknp("kkux", kknl(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -589282534: {
                    v1 = ou.kknp("kkuy", kknl(int ), (int)55);
                    continue block17;
                }
                case -504478305: {
                    v1 = ou.kknp("kkuz", kknl(int ), (int)56);
                    continue block17;
                }
                case 1721002674: {
                    break block17;
                }
                case 1860912370: {
                    v1 = ou.kknp("kkva", kknl(int ), (int)57);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ou.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkvc", kknl(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ou.kknp("kkvd", kkns(int ), (int)57)) break;
            v2 /* !! */  = (long)ou.kknp("kkvf", kkns(int ), (int)58);
        }
        var2_2 = ou.b;
        v3 /* !! */  = ou.sn;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - ou.kknp("kkvh", kknl(int ), (int)59));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1141009981: {
                    v4 = ou.kknp("kkvi", kknl(int ), (int)60);
                    continue block19;
                }
                case 1579992488: {
                    v4 = ou.kknp("kkvk", kknl(int ), (int)61);
                    continue block19;
                }
                case 1721002674: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = ou.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (int)ou.kknp("kkvm", kkns(int ), (int)59);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = ou.sn;
        if (true) ** GOTO lbl48
        block21: while (true) {
            v5 /* !! */  = (long)(v6 - ou.kknp("kkvo", kknl(int ), (int)62));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1058159686: {
                    v6 = ou.kknp("kkvp", kknl(int ), (int)63);
                    continue block21;
                }
                case -266676266: {
                    v6 = ou.kknp("kkvq", kknl(int ), (int)64);
                    continue block21;
                }
                case 1721002674: {
                    break block21;
                }
                case 1871436172: {
                    v6 = ou.kknp("kkvr", kknl(int ), (int)65);
                    continue block21;
                }
            }
            break;
        }
        return this.ticksUntilReset;
    }

    private static /* synthetic */ float kkww(int n2) {
        return Float.intBitsToFloat(kknt[n2] ^ kknv[n2]);
    }

    private static /* synthetic */ void klay() {
        ou.kknv[0] = -632916673;
        ou.kknv[1] = 1752686282;
        ou.kknv[2] = -1376770282;
        ou.kknv[3] = -2004801768;
        ou.kknv[4] = 41524157;
        ou.kknv[5] = 56253737;
        ou.kknv[6] = -1173032942;
        ou.kknv[7] = 1989895638;
        ou.kknv[8] = -1553650325;
        ou.kknv[9] = -656869747;
        ou.kknv[10] = 1337417712;
        ou.kknv[11] = 162959245;
        ou.kknv[12] = -1948882022;
        ou.kknv[13] = -1968483956;
        ou.kknv[14] = -1058128235;
        ou.kknv[15] = 965385232;
        ou.kknv[16] = -1866648330;
        ou.kknv[17] = 76518139;
        ou.kknv[18] = -1679632912;
        ou.kknv[19] = 817288981;
        ou.kknv[20] = 776752064;
        ou.kknv[21] = -9736337;
        ou.kknv[22] = -2101674184;
        ou.kknv[23] = -730854505;
        ou.kknv[24] = 44055555;
        ou.kknv[25] = -1672706066;
        ou.kknv[26] = 1522879093;
        ou.kknv[27] = -2105740608;
        ou.kknv[28] = 900107888;
        ou.kknv[29] = 2000571873;
        ou.kknv[30] = 1337997752;
        ou.kknv[31] = 575525842;
        ou.kknv[32] = -1392933060;
        ou.kknv[33] = -39428312;
        ou.kknv[34] = 731625704;
        ou.kknv[35] = 597903349;
        ou.kknv[36] = 749753865;
        ou.kknv[37] = 356067781;
        ou.kknv[38] = 1291787001;
        ou.kknv[39] = -787791152;
        ou.kknv[40] = 1583878091;
        ou.kknv[41] = -1146610394;
        ou.kknv[42] = -1898866595;
        ou.kknv[43] = 1762949513;
        ou.kknv[44] = -2021927842;
        ou.kknv[45] = -2088252951;
        ou.kknv[46] = -304609752;
        ou.kknv[47] = -588733422;
        ou.kknv[48] = 28861750;
        ou.kknv[49] = 1787178423;
        ou.kknv[50] = 447203867;
        ou.kknv[51] = -1316356720;
        ou.kknv[52] = 326961957;
        ou.kknv[53] = 1130075311;
        ou.kknv[54] = -42505854;
        ou.kknv[55] = 1661882834;
        ou.kknv[56] = 831583346;
        ou.kknv[57] = -1134373391;
        ou.kknv[58] = 391451697;
        ou.kknv[59] = 1341947275;
        ou.kknv[60] = -1758773338;
        ou.kknv[61] = 786675451;
        ou.kknv[62] = -63664744;
        ou.kknv[63] = -1763357218;
        ou.kknv[64] = -1460545623;
        ou.kknv[65] = 1930473751;
        ou.kknv[66] = 1401848518;
        ou.kknv[67] = -1163710574;
        ou.kknv[68] = 1476780077;
        ou.kknv[69] = 1786713406;
        ou.kknv[70] = -1716881922;
        ou.kknv[71] = -1074802968;
        ou.kknv[72] = 1719759032;
        ou.kknv[73] = -1979367780;
        ou.kknv[74] = -1906138352;
        ou.kknv[75] = -833008650;
        ou.kknv[76] = 279520374;
        ou.kknv[77] = -144725977;
        ou.kknv[78] = 1617364776;
        ou.kknv[79] = 1807958382;
        ou.kknv[80] = 93058375;
        ou.kknv[81] = -1316218162;
        ou.kknv[82] = 1038083358;
        ou.kknv[83] = -929761099;
        ou.kknv[84] = 1192484463;
        ou.kknv[85] = -1293344546;
        ou.kknv[86] = -1532512497;
        ou.kknv[87] = 913260515;
        ou.kknv[88] = -1414795345;
        ou.kknv[89] = 1750518089;
        ou.kknv[90] = -1121795182;
        ou.kknv[91] = 1633759567;
        ou.kknv[92] = 875666694;
        ou.kknv[93] = -257173405;
        ou.kknv[94] = -370941138;
        ou.kknv[95] = -261251867;
        ou.kknv[96] = -2081065396;
        ou.kknv[97] = 1409730601;
    }

    private static /* synthetic */ long kknl(int n2) {
        return kknm[n2] ^ kkno[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov nextRotation(ov var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kknr", kknl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ou.kknp("kknw", kkns(int ), (int)0)) break;
            v0 /* !! */  = (long)ou.kknp("kknx", kkns(int ), (int)1);
        }
        var5_3 = ou.c;
        v1 /* !! */  = ou.sn;
        if (true) ** GOTO lbl12
        block40: while (true) {
            v1 /* !! */  = (long)(v2 - ou.kknp("kknz", kknl(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 79065243: {
                    v2 = ou.kknp("kkoa", kknl(int ), (int)2);
                    continue block40;
                }
                case 226397065: {
                    v2 = ou.kknp("kkob", kknl(int ), (int)3);
                    continue block40;
                }
                case 1357094410: {
                    v2 = ou.kknp("kkod", kknl(int ), (int)4);
                    continue block40;
                }
                case 1721002674: {
                    break block40;
                }
            }
            break;
        }
        var4_4 /* !! */  = ou.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kkoe", kknl(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ou.kknp("kkof", kkns(int ), (int)2)) break;
            v3 /* !! */  = (long)ou.kknp("kkoh", kkns(int ), (int)3);
        }
        var3_5 = ou.a;
        if (var5_3) {
            throw null;
lbl34:
            // 4 sources

            return null;
        }
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl34
                if (!var2_2) ** GOTO lbl73
                if (var3_5 || var3_5) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ou.sn - ou.kknp("kkoj", kknl(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ou.kknp("kkok", kkns(int ), (int)4)) break;
                    v4 /* !! */  = (long)ou.kknp("kkom", kkns(int ), (int)5);
                }
                v5 /* !! */  = ou.sn;
                if (true) ** GOTO lbl53
                block44: while (true) {
                    v5 /* !! */  = (long)(v6 - ou.kknp("kkon", kknl(int ), (int)7));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1849399806: {
                            v6 = ou.kknp("kkop", kknl(int ), (int)8);
                            continue block44;
                        }
                        case 1456484344: {
                            v6 = ou.kknp("kkoq", kknl(int ), (int)9);
                            continue block44;
                        }
                        case 1555236882: {
                            v6 = ou.kknp("kkor", kknl(int ), (int)10);
                            continue block44;
                        }
                        case 1721002674: {
                            break block44;
                        }
                    }
                    break;
                }
                v7 = ow.cameraAngle();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ou.sn - ou.kknp("kkot", kknl(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == ou.kknp("kkou", kkns(int ), (int)6)) break;
                    v8 /* !! */  = (long)ou.kknp("kkow", kkns(int ), (int)7);
                }
                return this.angleSmooth.limitAngleChange(var1_1, v7);
lbl73:
                // 1 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v9 /* !! */  = ou.sn;
                if (true) ** GOTO lbl79
                block46: while (true) {
                    v9 /* !! */  = (long)(v10 - ou.kknp("kkox", kknl(int ), (int)12));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1391959977: {
                            v10 = ou.kknp("kkoz", kknl(int ), (int)13);
                            continue block46;
                        }
                        case -1361170199: {
                            v10 = ou.kknp("kkpa", kknl(int ), (int)14);
                            continue block46;
                        }
                        case 1721002674: {
                            break block46;
                        }
                    }
                    break;
                }
                v11 /* !! */  = ou.sn;
                if (true) ** GOTO lbl92
                block47: while (true) {
                    v11 /* !! */  = (long)(v12 - ou.kknp("kkpc", kknl(int ), (int)15));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -43919377: {
                            v12 = ou.kknp("kkpd", kknl(int ), (int)16);
                            continue block47;
                        }
                        case 728427884: {
                            v12 = ou.kknp("kkpf", kknl(int ), (int)17);
                            continue block47;
                        }
                        case 1721002674: {
                            break block47;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ou.sn - ou.kknp("kkpg", kknl(int ), (int)18)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == ou.kknp("kkpi", kkns(int ), (int)8)) break;
                    v13 /* !! */  = (long)ou.kknp("kkpj", kkns(int ), (int)9);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = ou.sn - ou.kknp("kkpk", kknl(int ), (int)19)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == ou.kknp("kkpl", kkns(int ), (int)10)) break;
                    v14 /* !! */  = (long)ou.kknp("kkpm", kkns(int ), (int)11);
                }
                v15 /* !! */  = ou.sn;
                if (true) ** GOTO lbl117
                block50: while (true) {
                    v15 /* !! */  = (long)(v16 - ou.kknp("kkpo", kknl(int ), (int)20));
lbl117:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -598332163: {
                            v16 = ou.kknp("kkpp", kknl(int ), (int)21);
                            continue block50;
                        }
                        case -556258463: {
                            v16 = ou.kknp("kkpq", kknl(int ), (int)22);
                            continue block50;
                        }
                        case 110497490: {
                            v16 = ou.kknp("kkps", kknl(int ), (int)23);
                            continue block50;
                        }
                        case 1721002674: {
                            break block50;
                        }
                    }
                    break;
                }
                return this.angleSmooth.limitAngleChange(var1_1, this.angle, this.vec3d, this.entity);
            }
            case 0: {
                var4_4 /* !! */  = (int)ou.kknp("kkpt", kkns(int ), (int)12);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl135:
            // 3 sources

            case 1: {
                var4_4 /* !! */  = (int)ou.kknp("kkpv", kkns(int ), (int)13);
                if (var5_3) {
                    throw null;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)ou.kknp("kkpx", kkns(int ), (int)14);
                if (!var5_3) ** GOTO lbl135
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)ou.kknp("kkpz", kkns(int ), (int)15);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 4: {
                var4_4 /* !! */  = (int)ou.kknp("kkqa", kkns(int ), (int)16);
                if (!var5_3) ** GOTO lbl135
                throw null;
            }
lbl152:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)ou.kknp("kkqc", kkns(int ), (int)17);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl157:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)ou.kknp("kkqf", kkns(int ), (int)18);
                if (!var5_3) break;
                throw null;
            }
lbl161:
            // 2 sources

            case 7: {
                do {
                    var4_4 /* !! */  = (int)ou.kknp("kkqh", kkns(int ), (int)19);
                } while (!var5_3);
                throw null;
            }
            case 8: 
        }
        do {
            var4_4 /* !! */  = (int)ou.kknp("kkqj", kkns(int ), (int)20);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ int kkns(int n2) {
        return kknt[n2] ^ kknv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ou(ov var1_1, class_243 var2_2, class_1297 var3_3, hx var4_4, int var5_5, float var6_6, boolean var7_7, boolean var8_8) {
        var10_9 /* !! */  = ou.b;
        var9_10 = ou.a;
        super();
        this.angle = var1_1;
        this.vec3d = var2_2;
        this.entity = var3_3;
        if (var10_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.angleSmooth = var4_4;
                this.ticksUntilReset = var5_5;
                this.resetThreshold = var6_6;
                this.moveCorrection = var7_7;
                this.freeCorrection = var8_8;
                return;
            }
lbl16:
            // 2 sources

            case 0: {
                var10_9 /* !! */  = (int)ou.kknp("kkzx", kkns(int ), (int)91);
                ** GOTO lbl24
            }
            case 1: {
                var10_9 /* !! */  = (int)ou.kknp("kkzz", kkns(int ), (int)92);
            }
lbl21:
            // 3 sources

            case 2: {
                var10_9 /* !! */  = (int)ou.kknp("klaa", kkns(int ), (int)93);
                break;
            }
lbl24:
            // 2 sources

            case 3: {
                var10_9 /* !! */  = (int)ou.kknp("klab", kkns(int ), (int)94);
                ** GOTO lbl16
            }
            case 4: {
                var10_9 /* !! */  = (int)ou.kknp("klad", kkns(int ), (int)95);
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_9 /* !! */  = (int)ou.kknp("klaj", kkns(int ), (int)96);
                    ** GOTO lbl21
                    break;
                }
            }
            case 6: 
        }
        var10_9 /* !! */  = (int)ou.kknp("klal", kkns(int ), (int)97);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isMoveCorrection() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkxq", kknl(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ou.kknp("kkxs", kkns(int ), (int)75)) break;
            v0 /* !! */  = (long)ou.kknp("kkxt", kkns(int ), (int)76);
        }
        var3_1 = ou.c;
        v1 /* !! */  = ou.sn;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(ou.kknp("kkxw", kknl(int ), (int)74) - ou.kknp("kkxu", kknl(int ), (int)73));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 889001762: {
                    continue block16;
                }
                case 1721002674: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = ou.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kkxx", kknl(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ou.kknp("kkxz", kkns(int ), (int)77)) break;
            v2 /* !! */  = (long)ou.kknp("kkya", kkns(int ), (int)78);
        }
        var1_3 = ou.a;
        if (var3_1) {
            throw null;
            return (boolean)ou.kknp("kkyc", kkns(int ), (int)79);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ou.sn;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - ou.kknp("kkye", kknl(int ), (int)76));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 366794234: {
                            v4 = ou.kknp("kkyg", kknl(int ), (int)77);
                            continue block19;
                        }
                        case 1721002674: {
                            break block19;
                        }
                        case 1789668775: {
                            v4 = ou.kknp("kkyh", kknl(int ), (int)78);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.moveCorrection;
            }
            case 0: {
                var2_2 /* !! */  = (int)ou.kknp("kkyi", kkns(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ou.kknp("kkyj", kkns(int ), (int)81);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ou.kknp("kkyk", kkns(int ), (int)82);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ou.kknp("kkyl", kkns(int ), (int)83);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void klbn() {
        ou.kkno[0] = -8510718571603735459L;
        ou.kkno[1] = 7312929882562545409L;
        ou.kkno[2] = -1370683971659974085L;
        ou.kkno[3] = -1565343046703105733L;
        ou.kkno[4] = 6726906735588087682L;
        ou.kkno[5] = -8955316671506080412L;
        ou.kkno[6] = 9210214112209244976L;
        ou.kkno[7] = -65180439888562964L;
        ou.kkno[8] = 8412187984835891830L;
        ou.kkno[9] = -5377357637699044090L;
        ou.kkno[10] = 5005039314073898876L;
        ou.kkno[11] = 1695718608661626834L;
        ou.kkno[12] = 883034758522011019L;
        ou.kkno[13] = -788819187235996705L;
        ou.kkno[14] = 166588694801191063L;
        ou.kkno[15] = -3187769019015303525L;
        ou.kkno[16] = 5160437392080239630L;
        ou.kkno[17] = 8604752925362597334L;
        ou.kkno[18] = -3585664734235894148L;
        ou.kkno[19] = -490072370278150938L;
        ou.kkno[20] = 2822182397849819659L;
        ou.kkno[21] = 7513756482852695130L;
        ou.kkno[22] = 2792444417415532011L;
        ou.kkno[23] = -7149876121025914287L;
        ou.kkno[24] = 7228037228167196600L;
        ou.kkno[25] = 680738043638668836L;
        ou.kkno[26] = 2057057018765688627L;
        ou.kkno[27] = 4437997187788646286L;
        ou.kkno[28] = -4837062351056778683L;
        ou.kkno[29] = 5029044978294434854L;
        ou.kkno[30] = 7114539182775455572L;
        ou.kkno[31] = -4798133864639659637L;
        ou.kkno[32] = 8312890410667299529L;
        ou.kkno[33] = 8206385335816176650L;
        ou.kkno[34] = 7049324693726882517L;
        ou.kkno[35] = -6634734135118835959L;
        ou.kkno[36] = -2645063004852223972L;
        ou.kkno[37] = -9070834333508685772L;
        ou.kkno[38] = 3236221673982898252L;
        ou.kkno[39] = -7932225129140266966L;
        ou.kkno[40] = -8274974474716039803L;
        ou.kkno[41] = 996108395967727709L;
        ou.kkno[42] = 5736964047678473881L;
        ou.kkno[43] = -8741307265074387440L;
        ou.kkno[44] = -6152275846801257395L;
        ou.kkno[45] = 4078666003411843476L;
        ou.kkno[46] = 4863724900628818124L;
        ou.kkno[47] = 7609480113910920987L;
        ou.kkno[48] = 3193553069140959109L;
        ou.kkno[49] = 8720319885409107556L;
        ou.kkno[50] = 5860382392534408907L;
        ou.kkno[51] = 5508917875567981779L;
        ou.kkno[52] = -2062788580415088430L;
        ou.kkno[53] = 2129959649946995322L;
        ou.kkno[54] = 7905292503500991597L;
        ou.kkno[55] = -6686376419102261195L;
        ou.kkno[56] = 5286378229615507414L;
        ou.kkno[57] = 2907109963277791068L;
        ou.kkno[58] = 4257181518343333504L;
        ou.kkno[59] = -8214285260315469727L;
        ou.kkno[60] = 3721980892814877570L;
        ou.kkno[61] = -9147491827712734571L;
        ou.kkno[62] = 9004894369418163465L;
        ou.kkno[63] = 3769788405722186690L;
        ou.kkno[64] = 8821708513214522889L;
        ou.kkno[65] = 2082502134309983537L;
        ou.kkno[66] = -3607628073343325951L;
        ou.kkno[67] = -8354930547413854325L;
        ou.kkno[68] = -3306754147725515488L;
        ou.kkno[69] = -7364968701618230315L;
        ou.kkno[70] = 8659869125725581405L;
        ou.kkno[71] = 8104474746775523614L;
        ou.kkno[72] = 5711288685501868403L;
        ou.kkno[73] = 2107767285948282368L;
        ou.kkno[74] = -3578444759884500379L;
        ou.kkno[75] = 6565949414700282628L;
        ou.kkno[76] = 199285587413793941L;
        ou.kkno[77] = -4179866744862593548L;
        ou.kkno[78] = -5055092055913670284L;
        ou.kkno[79] = -1180926322743399530L;
        ou.kkno[80] = 7956862874937160901L;
        ou.kkno[81] = 1900373893862388059L;
        ou.kkno[82] = -6913274242943456241L;
        ou.kkno[83] = 1518564916141368264L;
        ou.kkno[84] = 2432964280839428292L;
        ou.kkno[85] = 1514943291476756613L;
        ou.kkno[86] = -880896984992005951L;
        ou.kkno[87] = -898993277163953006L;
        ou.kkno[88] = -2037221739532259104L;
    }

    private static /* synthetic */ void klbe() {
        ou.kknm[0] = 8569568451456969377L;
        ou.kknm[1] = 4107649485597435944L;
        ou.kknm[2] = 2451485977319850468L;
        ou.kknm[3] = 8282126584468276476L;
        ou.kknm[4] = 1181047978661765421L;
        ou.kknm[5] = -5630990700229684372L;
        ou.kknm[6] = -2715218894061866197L;
        ou.kknm[7] = 8878668464203332567L;
        ou.kknm[8] = -6566938722782310850L;
        ou.kknm[9] = 3427341885720541418L;
        ou.kknm[10] = 3210214278613031793L;
        ou.kknm[11] = -281253918668738779L;
        ou.kknm[12] = -4917421158273708668L;
        ou.kknm[13] = -8161264356415814751L;
        ou.kknm[14] = 5976618160172128984L;
        ou.kknm[15] = -2071899891791372854L;
        ou.kknm[16] = 2703844233969386435L;
        ou.kknm[17] = -2749680193266622514L;
        ou.kknm[18] = -5529533817152546098L;
        ou.kknm[19] = -5478346686878590069L;
        ou.kknm[20] = -379575067203747059L;
        ou.kknm[21] = 3263794649008877361L;
        ou.kknm[22] = -7314085061010641114L;
        ou.kknm[23] = 3379733037929176759L;
        ou.kknm[24] = -5246380076286856399L;
        ou.kknm[25] = -2742208125056243013L;
        ou.kknm[26] = -8910180552535176214L;
        ou.kknm[27] = 5943263930806464473L;
        ou.kknm[28] = -526714685427697184L;
        ou.kknm[29] = 2117785877150608142L;
        ou.kknm[30] = -6954337767465487109L;
        ou.kknm[31] = -8759328345630923512L;
        ou.kknm[32] = -1610170976085454179L;
        ou.kknm[33] = 8522910057611157341L;
        ou.kknm[34] = 8999326498910765595L;
        ou.kknm[35] = 6297421798915615889L;
        ou.kknm[36] = 6965489104176193680L;
        ou.kknm[37] = 2574383196459679143L;
        ou.kknm[38] = 3787225770439479005L;
        ou.kknm[39] = -5821027448749325911L;
        ou.kknm[40] = -1502398866901166381L;
        ou.kknm[41] = 8297583897908412925L;
        ou.kknm[42] = 7991163229984572302L;
        ou.kknm[43] = -640723341729160964L;
        ou.kknm[44] = 866789424495074768L;
        ou.kknm[45] = -2082006195490626447L;
        ou.kknm[46] = -7881973501663332766L;
        ou.kknm[47] = 9104824251531617423L;
        ou.kknm[48] = -5781753290970891106L;
        ou.kknm[49] = -2535047615322130821L;
        ou.kknm[50] = 6542168661051303769L;
        ou.kknm[51] = 3703203029394344612L;
        ou.kknm[52] = -8450015268946660146L;
        ou.kknm[53] = -3467797724162711994L;
        ou.kknm[54] = 5113400459274124104L;
        ou.kknm[55] = 6240031475837119767L;
        ou.kknm[56] = 3221941437035576305L;
        ou.kknm[57] = 8747855961229172206L;
        ou.kknm[58] = -223588015300146546L;
        ou.kknm[59] = 4272872182589169287L;
        ou.kknm[60] = 4597076278612374068L;
        ou.kknm[61] = 1184803856239276603L;
        ou.kknm[62] = 6196328381776139325L;
        ou.kknm[63] = 8232200152399241072L;
        ou.kknm[64] = -8951047232740916632L;
        ou.kknm[65] = 243033091678957733L;
        ou.kknm[66] = -2434694502676611886L;
        ou.kknm[67] = -3328205931710315535L;
        ou.kknm[68] = -2344195119612648229L;
        ou.kknm[69] = 2376926287075872267L;
        ou.kknm[70] = 3694211374787158451L;
        ou.kknm[71] = -3531088732968349956L;
        ou.kknm[72] = -2281994033514550932L;
        ou.kknm[73] = 3798064513065394897L;
        ou.kknm[74] = -7118462234605351197L;
        ou.kknm[75] = 273923272980127820L;
        ou.kknm[76] = 4196877228492539853L;
        ou.kknm[77] = 30524760397006568L;
        ou.kknm[78] = -645765121221798184L;
        ou.kknm[79] = -2186917556170457544L;
        ou.kknm[80] = 4618200084969042071L;
        ou.kknm[81] = -8746432643082873752L;
        ou.kknm[82] = 6433062127754051629L;
        ou.kknm[83] = 8070253889202295092L;
        ou.kknm[84] = -2726895507411671137L;
        ou.kknm[85] = 8683229422081864819L;
        ou.kknm[86] = -3599112922776826318L;
        ou.kknm[87] = -5874473885733760618L;
        ou.kknm[88] = -8502964741594109472L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_1297 getEntity() {
        boolean bl2;
        Object object = sn;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ou.kknp("kkss", kknl(int ), (int)42);
            }
            switch ((int)object) {
                case -1685008692: {
                    callSite = ou.kknp("kkst", kknl(int ), (int)43);
                    continue block5;
                }
                case 440493509: {
                    callSite = ou.kknp("kksv", kknl(int ), (int)44);
                    continue block5;
                }
                case 1721002674: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = sn - ou.kknp("kksx", kknl(int ), (int)45)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ou.kknp("kksy", kkns(int ), (int)37)) break;
            object2 = ou.kknp("kkta", kkns(int ), (int)38);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = sn - ou.kknp("kktc", kknl(int ), (int)46)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ou.kknp("kktd", kkns(int ), (int)39)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ou.kknp("kktf", kkns(int ), (int)40);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = sn - ou.kknp("kkth", kknl(int ), (int)47)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == ou.kknp("kktj", kkns(int ), (int)41)) {
                return this.entity;
            }
            object4 = ou.kknp("kktk", kkns(int ), (int)42);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getAngle() {
        v0 /* !! */  = ou.sn;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ou.kknp("kkql", kknl(int ), (int)24));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -893380585: {
                    v1 = ou.kknp("kkqn", kknl(int ), (int)25);
                    continue block17;
                }
                case 805575594: {
                    v1 = ou.kknp("kkqp", kknl(int ), (int)26);
                    continue block17;
                }
                case 1318610412: {
                    v1 = ou.kknp("kkqq", kknl(int ), (int)27);
                    continue block17;
                }
                case 1721002674: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = ou.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkqs", kknl(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ou.kknp("kkqt", kkns(int ), (int)21)) break;
            v2 /* !! */  = (long)ou.kknp("kkqu", kkns(int ), (int)22);
        }
        var2_2 /* !! */  = ou.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kkqv", kknl(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ou.kknp("kkqw", kkns(int ), (int)23)) break;
            v3 /* !! */  = (long)ou.kknp("kkqx", kkns(int ), (int)24);
        }
        var1_3 = ou.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ou.sn;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ou.kknp("kkqy", kknl(int ), (int)30));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1903184629: {
                            v5 = ou.kknp("kkqz", kknl(int ), (int)31);
                            continue block21;
                        }
                        case 1721002674: {
                            break block21;
                        }
                        case 1970016549: {
                            v5 = ou.kknp("kkrb", kknl(int ), (int)32);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.angle;
            }
            case 0: {
                var2_2 /* !! */  = (int)ou.kknp("kkrc", kkns(int ), (int)25);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ou.kknp("kkre", kkns(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ou.kknp("kkrg", kkns(int ), (int)27);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ou.kknp("kkri", kkns(int ), (int)28);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    static {
        kknt = new int[98];
        kknv = new int[98];
        ou.klao();
        ou.klay();
        kknm = new long[89];
        kkno = new long[89];
        ou.klbe();
        ou.klbn();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hx getAngleSmooth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kktt", kknl(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ou.kknp("kktu", kkns(int ), (int)47)) break;
            v0 /* !! */  = (long)ou.kknp("kktv", kkns(int ), (int)48);
        }
        var3_1 = ou.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kktw", kknl(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ou.kknp("kktx", kkns(int ), (int)49)) break;
            v1 /* !! */  = (long)ou.kknp("kkua", kkns(int ), (int)50);
        }
        var2_2 /* !! */  = ou.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ou.sn - ou.kknp("kkuc", kknl(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ou.kknp("kkue", kkns(int ), (int)51)) break;
            v2 /* !! */  = (long)ou.kknp("kkuh", kkns(int ), (int)52);
        }
        var1_3 = ou.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                v3 /* !! */  = ou.sn;
                if (true) ** GOTO lbl33
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - ou.kknp("kkuk", kknl(int ), (int)51));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 423585604: {
                            v4 = ou.kknp("kkul", kknl(int ), (int)52);
                            continue block15;
                        }
                        case 1435575151: {
                            v4 = ou.kknp("kkum", kknl(int ), (int)53);
                            continue block15;
                        }
                        case 1721002674: {
                            break block15;
                        }
                    }
                    break;
                }
                return this.angleSmooth;
lbl43:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)ou.kknp("kkun", kkns(int ), (int)53);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)ou.kknp("kkup", kkns(int ), (int)54);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ou.kknp("kkur", kkns(int ), (int)55);
                        if (!var3_1) ** GOTO lbl43
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ou.kknp("kkut", kkns(int ), (int)56);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite kknp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getVec3d() {
        v0 /* !! */  = ou.sn;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ou.kknp("kkrn", kknl(int ), (int)33));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -357953513: {
                    v1 = ou.kknp("kkro", kknl(int ), (int)34);
                    continue block17;
                }
                case 1721002674: {
                    break block17;
                }
                case 2040777785: {
                    v1 = ou.kknp("kkrq", kknl(int ), (int)35);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ou.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkrs", kknl(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ou.kknp("kkru", kkns(int ), (int)29)) break;
            v2 /* !! */  = (long)ou.kknp("kkrv", kkns(int ), (int)30);
        }
        var2_2 /* !! */  = ou.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kkrx", kknl(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ou.kknp("kkrz", kkns(int ), (int)31)) break;
            v3 /* !! */  = (long)ou.kknp("kksa", kkns(int ), (int)32);
        }
        var1_3 = ou.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ou.sn;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ou.kknp("kksd", kknl(int ), (int)38));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 372547007: {
                            v5 = ou.kknp("kksf", kknl(int ), (int)39);
                            continue block21;
                        }
                        case 622022517: {
                            v5 = ou.kknp("kksg", kknl(int ), (int)40);
                            continue block21;
                        }
                        case 1462559300: {
                            v5 = ou.kknp("kksi", kknl(int ), (int)41);
                            continue block21;
                        }
                        case 1721002674: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.vec3d;
            }
            case 0: {
                var2_2 /* !! */  = (int)ou.kknp("kksk", kkns(int ), (int)33);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ou.kknp("kksl", kkns(int ), (int)34);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ou.kknp("kksm", kkns(int ), (int)35);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ou.kknp("kkso", kkns(int ), (int)36);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getResetThreshold() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ou.sn - ou.kknp("kkwh", kknl(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ou.kknp("kkwi", kkns(int ), (int)64)) break;
            v0 /* !! */  = (long)ou.kknp("kkwk", kkns(int ), (int)65);
        }
        var3_1 = ou.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ou.sn - ou.kknp("kkwl", kknl(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ou.kknp("kkwn", kkns(int ), (int)66)) break;
            v1 /* !! */  = (long)ou.kknp("kkwp", kkns(int ), (int)67);
        }
        var2_2 /* !! */  = ou.b;
        v2 /* !! */  = ou.sn;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - ou.kknp("kkwq", kknl(int ), (int)68));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2077745344: {
                    v3 = ou.kknp("kkws", kknl(int ), (int)69);
                    continue block13;
                }
                case 1366483855: {
                    v3 = ou.kknp("kkwu", kknl(int ), (int)70);
                    continue block13;
                }
                case 1721002674: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = ou.a;
        if (!var3_1) ** GOTO lbl35
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)ou.kknp("kkxa", kkww(int ), (int)68);
                }
lbl35:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ou.sn - ou.kknp("kkxd", kknl(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ou.kknp("kkxe", kkns(int ), (int)69)) break;
                    v4 /* !! */  = (long)ou.kknp("kkxg", kkns(int ), (int)70);
                }
                return this.resetThreshold;
lbl43:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ou.kknp("kkxh", kkns(int ), (int)71);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl48:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)ou.kknp("kkxj", kkns(int ), (int)72);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ou.kknp("kkxl", kkns(int ), (int)73);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ou.kknp("kkxn", kkns(int ), (int)74);
        ** while (!var3_1)
lbl59:
        // 1 sources

        throw null;
    }
}

