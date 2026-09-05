/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_1657
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_310
 *  net.minecraft.class_3486
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_742;
import ruhack.phobia.aw;
import ruhack.phobia.ca;
import ruhack.phobia.cy;
import ruhack.phobia.dh;
import ruhack.phobia.f;
import ruhack.phobia.gm;

public final class w
extends f {
    public static final int b;
    private static long[] vxh;
    private static final double DIRECT_CORRECTION_DISTANCE = 1.25;
    private boolean automatedRouteFailed;
    private int directNoProgressTicks;
    private static final double CLIMB_THRESHOLD = 2.0;
    private boolean directAutomatedRoute;
    public static final boolean a;
    private int directCorrections;
    public static final boolean c;
    private static final double STEP_MAX = 9.5;
    private double directExpectedDistance;
    private double directBestDistance;
    private class_243 destination;
    private static final double STEP_MIN = 7.0;
    private int stepCount;
    private static final class_310 mc;
    public static final long bh = -8502710586018846031L;
    private static final int DIRECT_NO_PROGRESS_LIMIT = 8;
    private static final int DIRECT_CORRECTION_LIMIT = 3;
    private static final double DIRECT_PROGRESS_EPSILON = 0.35;
    private boolean active;
    private int waitTicks;
    private int directMaxSteps;
    private static int[] vut;
    private static long[] vxg;
    private boolean avoidLavaDirectRoute;
    private static int[] vuu;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean routeTouchesLava(class_243 var1_1, class_243 var2_2) {
        var14_3 = w.c;
        var13_4 /* !! */  = w.b;
        var12_5 = w.a;
        if (var14_3) {
            throw null;
lbl6:
            // 21 sources

            return (boolean)w.vuv("ycj", vus(int ), (int)776);
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        var3_6 = var1_1.method_1022(var2_2);
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_7 = Math.max((int)w.vuv("yck", vus(int ), (int)777), (int)Math.ceil(var3_6 / w.vuv("ycl", vxf(int ), (int)413)));
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_8 = this.playerVolumeTouchesLava(var1_1);
        if (var12_5 || var12_5) ** GOTO lbl6
        if (var6_8) ** GOTO lbl24
        if (var12_5) ** GOTO lbl6
        if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v0 = w.vuv("ycm", vus(int ), (int)778);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl26
            }
lbl24:
            // 1 sources

            if (var12_5 || var12_5) ** GOTO lbl6
            v0 = var7_9 = w.vuv("ycn", vus(int ), (int)779);
lbl26:
            // 2 sources

            if (var12_5 || var12_5) ** GOTO lbl6
            var8_10 = w.vuv("yco", vus(int ), (int)780);
            if (var12_5) ** GOTO lbl6
            do {
                if (var12_5 || var12_5) ** GOTO lbl6
                if (var8_10 > var5_7) ** GOTO lbl57
                if (var12_5 || var12_5) ** GOTO lbl6
                var9_11 = (double)var8_10 / (double)var5_7;
                if (var12_5 || var12_5) ** GOTO lbl6
                var11_12 = this.playerVolumeTouchesLava(var1_1.method_35590(var2_2, var9_11));
                if (var12_5 || var12_5) ** GOTO lbl6
                if (!var6_8) ** GOTO lbl48
                if (var12_5) ** GOTO lbl6
                if (var7_9 != false) ** GOTO lbl48
                if (var12_5 || var12_5) ** GOTO lbl6
                if (var11_12) ** GOTO lbl52
                if (var12_5 || var12_5) ** GOTO lbl6
                var7_9 = w.vuv("ycp", vus(int ), (int)781);
                if (var12_5) ** GOTO lbl6
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl52
lbl48:
                // 2 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                if (!var11_12) ** GOTO lbl52
                if (var12_5 || var12_5) ** GOTO lbl6
                return (boolean)w.vuv("ycq", vus(int ), (int)782);
lbl52:
                // 3 sources

                if (var12_5 || var12_5) ** GOTO lbl6
                ++var8_10;
                if (var12_5) ** GOTO lbl6
            } while (!var14_3);
            throw null;
lbl57:
            // 1 sources

            if (!var12_5 && !var12_5) ** break;
            ** continue;
            return (boolean)w.vuv("ycr", vus(int ), (int)783);
            case 0: {
                var13_4 /* !! */  = (int)w.vuv("ycs", vus(int ), (int)784);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl65:
            // 2 sources

            case 1: {
                var13_4 /* !! */  = (int)w.vuv("yct", vus(int ), (int)785);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl70:
            // 3 sources

            case 2: {
                var13_4 /* !! */  = (int)w.vuv("ycu", vus(int ), (int)786);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 3: {
                var13_4 /* !! */  = (int)w.vuv("ycv", vus(int ), (int)787);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl80:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_4 /* !! */  = (int)w.vuv("ycw", vus(int ), (int)788);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl197
                    break;
                }
            }
lbl86:
            // 3 sources

            case 5: {
                var13_4 /* !! */  = (int)w.vuv("ycx", vus(int ), (int)789);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 6: {
                var13_4 /* !! */  = (int)w.vuv("ycy", vus(int ), (int)790);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl96:
            // 2 sources

            case 7: {
                var13_4 /* !! */  = (int)w.vuv("ycz", vus(int ), (int)791);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl101:
            // 2 sources

            case 8: {
                var13_4 /* !! */  = (int)w.vuv("yda", vus(int ), (int)792);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl106:
            // 2 sources

            case 9: {
                var13_4 /* !! */  = (int)w.vuv("ydb", vus(int ), (int)793);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 10: {
                var13_4 /* !! */  = (int)w.vuv("ydc", vus(int ), (int)794);
                if (!var14_3) ** GOTO lbl80
                throw null;
            }
            case 11: {
                var13_4 /* !! */  = (int)w.vuv("ydd", vus(int ), (int)795);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl120:
            // 2 sources

            case 12: {
                var13_4 /* !! */  = (int)w.vuv("yde", vus(int ), (int)796);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl125:
            // 2 sources

            case 13: {
                var13_4 /* !! */  = (int)w.vuv("ydf", vus(int ), (int)797);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl130:
            // 2 sources

            case 14: {
                var13_4 /* !! */  = (int)w.vuv("ydg", vus(int ), (int)798);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 15: {
                var13_4 /* !! */  = (int)w.vuv("ydh", vus(int ), (int)799);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 16: {
                var13_4 /* !! */  = (int)w.vuv("ydi", vus(int ), (int)800);
                if (!var14_3) ** GOTO lbl70
                throw null;
            }
lbl144:
            // 2 sources

            case 17: {
                var13_4 /* !! */  = (int)w.vuv("ydj", vus(int ), (int)801);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl149:
            // 3 sources

            case 18: {
                var13_4 /* !! */  = (int)w.vuv("ydk", vus(int ), (int)802);
                if (!var14_3) ** GOTO lbl144
                throw null;
            }
lbl153:
            // 2 sources

            case 19: {
                var13_4 /* !! */  = (int)w.vuv("ydl", vus(int ), (int)803);
                if (!var14_3) ** GOTO lbl96
                throw null;
            }
lbl157:
            // 4 sources

            case 20: {
                var13_4 /* !! */  = (int)w.vuv("ydm", vus(int ), (int)804);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl162:
            // 2 sources

            case 21: {
                var13_4 /* !! */  = (int)w.vuv("ydn", vus(int ), (int)805);
                if (var14_3) {
                    throw null;
                }
            }
            case 22: {
                var13_4 /* !! */  = (int)w.vuv("ydo", vus(int ), (int)806);
                if (!var14_3) ** GOTO lbl86
                throw null;
            }
            case 23: {
                var13_4 /* !! */  = (int)w.vuv("ydp", vus(int ), (int)807);
                if (!var14_3) ** GOTO lbl149
                throw null;
            }
lbl174:
            // 2 sources

            case 24: {
                var13_4 /* !! */  = (int)w.vuv("ydq", vus(int ), (int)808);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 25: {
                var13_4 /* !! */  = (int)w.vuv("ydr", vus(int ), (int)809);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl184:
            // 3 sources

            case 26: {
                var13_4 /* !! */  = (int)w.vuv("yds", vus(int ), (int)810);
                if (!var14_3) ** GOTO lbl162
                throw null;
            }
lbl188:
            // 4 sources

            case 27: {
                var13_4 /* !! */  = (int)w.vuv("ydt", vus(int ), (int)811);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl193:
            // 3 sources

            case 28: {
                var13_4 /* !! */  = (int)w.vuv("ydu", vus(int ), (int)812);
                if (!var14_3) ** GOTO lbl120
                throw null;
            }
lbl197:
            // 3 sources

            case 29: {
                var13_4 /* !! */  = (int)w.vuv("ydv", vus(int ), (int)813);
                if (!var14_3) ** GOTO lbl125
                throw null;
            }
            case 30: {
                var13_4 /* !! */  = (int)w.vuv("ydw", vus(int ), (int)814);
                if (!var14_3) ** GOTO lbl193
                throw null;
            }
            case 31: {
                var13_4 /* !! */  = (int)w.vuv("ydx", vus(int ), (int)815);
                if (var14_3) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl210:
            // 2 sources

            case 32: {
                var13_4 /* !! */  = (int)w.vuv("ydy", vus(int ), (int)816);
                if (!var14_3) ** GOTO lbl70
                throw null;
            }
lbl214:
            // 3 sources

            case 33: {
                var13_4 /* !! */  = (int)w.vuv("ydz", vus(int ), (int)817);
                if (!var14_3) ** GOTO lbl193
                throw null;
            }
            case 34: {
                var13_4 /* !! */  = (int)w.vuv("yea", vus(int ), (int)818);
                if (!var14_3) ** GOTO lbl210
                throw null;
            }
            case 35: {
                var13_4 /* !! */  = (int)w.vuv("yeb", vus(int ), (int)819);
                if (!var14_3) ** GOTO lbl65
                throw null;
            }
lbl226:
            // 5 sources

            case 36: {
                var13_4 /* !! */  = (int)w.vuv("yec", vus(int ), (int)820);
                if (var14_3) {
                    throw null;
                }
            }
            case 37: {
                var13_4 /* !! */  = (int)w.vuv("yed", vus(int ), (int)821);
                if (!var14_3) ** GOTO lbl157
                throw null;
            }
            case 38: {
                var13_4 /* !! */  = (int)w.vuv("yee", vus(int ), (int)822);
                if (!var14_3) ** GOTO lbl101
                throw null;
            }
lbl238:
            // 2 sources

            case 39: {
                var13_4 /* !! */  = (int)w.vuv("yef", vus(int ), (int)823);
                if (!var14_3) ** GOTO lbl214
                throw null;
            }
            case 40: 
        }
        var13_4 /* !! */  = (int)w.vuv("yeg", vus(int ), (int)824);
        ** while (!var14_3)
lbl245:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ytr() {
        w.vuu[600] = -2008491076;
        w.vuu[601] = 1108577927;
        w.vuu[602] = -808930187;
        w.vuu[603] = -1136283439;
        w.vuu[604] = 1990225522;
        w.vuu[605] = -1694079310;
        w.vuu[606] = 1921069416;
        w.vuu[607] = 180954551;
        w.vuu[608] = -1608067361;
        w.vuu[609] = -464653314;
        w.vuu[610] = 778363788;
        w.vuu[611] = 497916691;
        w.vuu[612] = -1791720237;
        w.vuu[613] = 1105882459;
        w.vuu[614] = -1171044709;
        w.vuu[615] = -1988499705;
        w.vuu[616] = -2013371229;
        w.vuu[617] = -737300606;
        w.vuu[618] = -362065252;
        w.vuu[619] = -1385441931;
        w.vuu[620] = -2026391991;
        w.vuu[621] = -2126521327;
        w.vuu[622] = 498724268;
        w.vuu[623] = -1309642703;
        w.vuu[624] = 1362383365;
        w.vuu[625] = 623181545;
        w.vuu[626] = -1702722231;
        w.vuu[627] = 1931445894;
        w.vuu[628] = 1497755427;
        w.vuu[629] = 1665858776;
        w.vuu[630] = -1850037652;
        w.vuu[631] = -765568534;
        w.vuu[632] = -300685355;
        w.vuu[633] = 141663802;
        w.vuu[634] = 1498854361;
        w.vuu[635] = -1505645861;
        w.vuu[636] = -1716371942;
        w.vuu[637] = 831304856;
        w.vuu[638] = -1068202480;
        w.vuu[639] = -885528215;
        w.vuu[640] = 2139046694;
        w.vuu[641] = -1729273851;
        w.vuu[642] = -1441339561;
        w.vuu[643] = -2009420363;
        w.vuu[644] = -2017272035;
        w.vuu[645] = 495780843;
        w.vuu[646] = 397275046;
        w.vuu[647] = 931514221;
        w.vuu[648] = 1784670037;
        w.vuu[649] = 476793564;
        w.vuu[650] = -1248702418;
        w.vuu[651] = -810293179;
        w.vuu[652] = 1124581509;
        w.vuu[653] = 984645297;
        w.vuu[654] = -388584144;
        w.vuu[655] = -569262646;
        w.vuu[656] = 1022379682;
        w.vuu[657] = -1493710614;
        w.vuu[658] = -1341959520;
        w.vuu[659] = -28563063;
        w.vuu[660] = -1879058597;
        w.vuu[661] = 2038894770;
        w.vuu[662] = -1445745447;
        w.vuu[663] = 1378376772;
        w.vuu[664] = 977059522;
        w.vuu[665] = 1487604598;
        w.vuu[666] = 697286737;
        w.vuu[667] = 1308332816;
        w.vuu[668] = -1126009573;
        w.vuu[669] = -977875526;
        w.vuu[670] = -633910076;
        w.vuu[671] = 1151976178;
        w.vuu[672] = 869363090;
        w.vuu[673] = 2100008539;
        w.vuu[674] = -53301252;
        w.vuu[675] = 2036726402;
        w.vuu[676] = -453542489;
        w.vuu[677] = -1703686832;
        w.vuu[678] = -2049503117;
        w.vuu[679] = 685236670;
        w.vuu[680] = -2054176134;
        w.vuu[681] = -826099311;
        w.vuu[682] = -858780101;
        w.vuu[683] = -1820794085;
        w.vuu[684] = -1926949304;
        w.vuu[685] = -1134222762;
        w.vuu[686] = -1837556190;
        w.vuu[687] = -1687006755;
        w.vuu[688] = 822598197;
        w.vuu[689] = -740405372;
        w.vuu[690] = 930018065;
        w.vuu[691] = 1392976295;
        w.vuu[692] = -1766844341;
        w.vuu[693] = -974119580;
        w.vuu[694] = -851207756;
        w.vuu[695] = 103351125;
        w.vuu[696] = 1267810754;
        w.vuu[697] = 610539413;
        w.vuu[698] = -1421464993;
        w.vuu[699] = -1283327223;
    }

    private static /* synthetic */ void ywc() {
        w.vxg[100] = -3119325302445400580L;
        w.vxg[101] = -5968634610593337450L;
        w.vxg[102] = -1167601231169093279L;
        w.vxg[103] = -8157341654726327013L;
        w.vxg[104] = 4293448699210160254L;
        w.vxg[105] = 6262365679223296202L;
        w.vxg[106] = 990685173258506066L;
        w.vxg[107] = 5414438058560235371L;
        w.vxg[108] = 543104461016432757L;
        w.vxg[109] = 1833252717946924690L;
        w.vxg[110] = -8299674633384751957L;
        w.vxg[111] = -2073394030907472442L;
        w.vxg[112] = 8378877792606787593L;
        w.vxg[113] = -5413246598926431827L;
        w.vxg[114] = -3040105813831370305L;
        w.vxg[115] = -516903087692190331L;
        w.vxg[116] = -3856708080685541302L;
        w.vxg[117] = 3260346209276042924L;
        w.vxg[118] = 1724947215758866478L;
        w.vxg[119] = -2800860422827772404L;
        w.vxg[120] = -2386095592464679414L;
        w.vxg[121] = 535398299128565429L;
        w.vxg[122] = 9031927708235184362L;
        w.vxg[123] = -475733536538225321L;
        w.vxg[124] = 1577493420748207622L;
        w.vxg[125] = -6528457735936216185L;
        w.vxg[126] = -2173318107137333736L;
        w.vxg[127] = 61641959602290606L;
        w.vxg[128] = 5969918509435986401L;
        w.vxg[129] = 7989860965478042845L;
        w.vxg[130] = 128095619279102686L;
        w.vxg[131] = -5242440567062103350L;
        w.vxg[132] = 2109993718007163636L;
        w.vxg[133] = 1320866294293315772L;
        w.vxg[134] = -8721845368627329686L;
        w.vxg[135] = -6956754991627917117L;
        w.vxg[136] = 4620386280992565243L;
        w.vxg[137] = -6008822637120123915L;
        w.vxg[138] = -8379524946437026738L;
        w.vxg[139] = 6924052115495351099L;
        w.vxg[140] = -1072990552044535648L;
        w.vxg[141] = 7324018175032977707L;
        w.vxg[142] = -2976295709343444015L;
        w.vxg[143] = -9130101675840214670L;
        w.vxg[144] = -5881255089125405670L;
        w.vxg[145] = -5249460672493739501L;
        w.vxg[146] = 3608118867171540920L;
        w.vxg[147] = -6015726235424534515L;
        w.vxg[148] = -2396610196377658979L;
        w.vxg[149] = 1253760996105103205L;
        w.vxg[150] = 1201334731612153786L;
        w.vxg[151] = 8482447555691279671L;
        w.vxg[152] = 3109439046159385991L;
        w.vxg[153] = 1147905840056303589L;
        w.vxg[154] = 9145960918879383970L;
        w.vxg[155] = 1745066048296768760L;
        w.vxg[156] = -1975697785024861024L;
        w.vxg[157] = -5918941012790954735L;
        w.vxg[158] = 5562370789244975356L;
        w.vxg[159] = -775336886480005298L;
        w.vxg[160] = -4492316123212359286L;
        w.vxg[161] = 6500859994785566664L;
        w.vxg[162] = 6005764017118804450L;
        w.vxg[163] = -8864252969587759307L;
        w.vxg[164] = -2949524505913566915L;
        w.vxg[165] = 948838990584361026L;
        w.vxg[166] = -2511492849739895815L;
        w.vxg[167] = -5003060542621499442L;
        w.vxg[168] = -1912436233207950230L;
        w.vxg[169] = -3963447052330672962L;
        w.vxg[170] = 7735325653282410117L;
        w.vxg[171] = 6425821085150490239L;
        w.vxg[172] = -2401632322740600944L;
        w.vxg[173] = -7560902592349692545L;
        w.vxg[174] = 1618208203444541018L;
        w.vxg[175] = -6694086090744445226L;
        w.vxg[176] = 5972933654487958657L;
        w.vxg[177] = 2602508875251703570L;
        w.vxg[178] = 850886503918827684L;
        w.vxg[179] = 8103909216960656832L;
        w.vxg[180] = 1025471942112163862L;
        w.vxg[181] = 8084395513736580245L;
        w.vxg[182] = 2104941332551123678L;
        w.vxg[183] = 6569639089827920266L;
        w.vxg[184] = -7028418616480012847L;
        w.vxg[185] = -8658938182862761960L;
        w.vxg[186] = -9163037760797709930L;
        w.vxg[187] = -1498002162394217940L;
        w.vxg[188] = 6438269439068064487L;
        w.vxg[189] = -8032819644817362094L;
        w.vxg[190] = -8005338192386437317L;
        w.vxg[191] = -475398272486770634L;
        w.vxg[192] = 4025601486725691404L;
        w.vxg[193] = 3492396025607029615L;
        w.vxg[194] = -6874643416140994953L;
        w.vxg[195] = -3624473567930258661L;
        w.vxg[196] = -1619402511119766142L;
        w.vxg[197] = 7000651888704954196L;
        w.vxg[198] = -2040733130330270868L;
        w.vxg[199] = 6192238570013500679L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static double parse(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("ylr", wbd(int ), (int)491)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("yls", vus(int ), (int)940)) break;
            v0 /* !! */  = (long)w.vuv("ylt", vus(int ), (int)941);
        }
        var3_1 = w.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("ylu", wbd(int ), (int)492)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == w.vuv("ylv", vus(int ), (int)942)) break;
            v1 /* !! */  = (long)w.vuv("ylw", vus(int ), (int)943);
        }
        var2_2 /* !! */  = w.b;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl17
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - w.vuv("ylx", wbd(int ), (int)493));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -611841538: {
                    v3 = w.vuv("yly", wbd(int ), (int)494);
                    continue block17;
                }
                case 1120987393: {
                    v3 = w.vuv("ylz", wbd(int ), (int)495);
                    continue block17;
                }
                case 1952754353: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
            return (double)w.vuv("yma", vxf(int ), (int)496);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 = w.vuv("ymb", vus(int ), (int)944);
                v5 = w.vuv("ymc", vus(int ), (int)945);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("ymd", wbd(int ), (int)497)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == w.vuv("yme", vus(int ), (int)946)) break;
                    v6 /* !! */  = (long)w.vuv("ymf", vus(int ), (int)947);
                }
                v7 = var0.replace((char)v4, (char)v5);
                v8 /* !! */  = w.bh;
                if (true) ** GOTO lbl47
                block20: while (true) {
                    v8 /* !! */  = (long)(w.vuv("ymh", wbd(int ), (int)499) - w.vuv("ymg", wbd(int ), (int)498));
lbl47:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1592931340: {
                            continue block20;
                        }
                        case 1952754353: {
                            break block20;
                        }
                    }
                    break;
                }
                return Double.parseDouble(v7);
            }
            case 0: {
                var2_2 /* !! */  = (int)w.vuv("ymi", vus(int ), (int)948);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                var2_2 /* !! */  = (int)w.vuv("ymj", vus(int ), (int)949);
                if (var3_1) {
                    throw null;
                }
            }
lbl62:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)w.vuv("ymk", vus(int ), (int)950);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)w.vuv("yml", vus(int ), (int)951);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ysi() {
        w.vuu[300] = -123896100;
        w.vuu[301] = -129276444;
        w.vuu[302] = -142190586;
        w.vuu[303] = -234555339;
        w.vuu[304] = 1171035209;
        w.vuu[305] = -1883926647;
        w.vuu[306] = 82527407;
        w.vuu[307] = -1846313837;
        w.vuu[308] = -358761408;
        w.vuu[309] = -1361773977;
        w.vuu[310] = 1892929880;
        w.vuu[311] = 1682093874;
        w.vuu[312] = -1105860810;
        w.vuu[313] = -451599507;
        w.vuu[314] = 1863463869;
        w.vuu[315] = 1185471297;
        w.vuu[316] = -1193361923;
        w.vuu[317] = 55542388;
        w.vuu[318] = -1127612305;
        w.vuu[319] = 531977463;
        w.vuu[320] = 1669790949;
        w.vuu[321] = 1690859725;
        w.vuu[322] = -385072352;
        w.vuu[323] = -622604898;
        w.vuu[324] = -1770244080;
        w.vuu[325] = 1417919397;
        w.vuu[326] = -405144357;
        w.vuu[327] = -677238846;
        w.vuu[328] = 990617492;
        w.vuu[329] = -1025262747;
        w.vuu[330] = -1516785657;
        w.vuu[331] = 1436501845;
        w.vuu[332] = 1308830213;
        w.vuu[333] = -463744664;
        w.vuu[334] = 97710635;
        w.vuu[335] = 1567350047;
        w.vuu[336] = -379592801;
        w.vuu[337] = -2087155534;
        w.vuu[338] = 2104236204;
        w.vuu[339] = -369157650;
        w.vuu[340] = 916469675;
        w.vuu[341] = 920414248;
        w.vuu[342] = -296980519;
        w.vuu[343] = 1953154508;
        w.vuu[344] = -1100147193;
        w.vuu[345] = 1028048726;
        w.vuu[346] = 1173944036;
        w.vuu[347] = -563196666;
        w.vuu[348] = 2083806348;
        w.vuu[349] = 284459989;
        w.vuu[350] = 1967396526;
        w.vuu[351] = 1719788235;
        w.vuu[352] = -1357385990;
        w.vuu[353] = -777174337;
        w.vuu[354] = -1384992150;
        w.vuu[355] = -1300305618;
        w.vuu[356] = 2134593180;
        w.vuu[357] = -237259604;
        w.vuu[358] = 928043396;
        w.vuu[359] = 477817825;
        w.vuu[360] = 1189906374;
        w.vuu[361] = 937966086;
        w.vuu[362] = -591497689;
        w.vuu[363] = 299383378;
        w.vuu[364] = 858318545;
        w.vuu[365] = -1845645369;
        w.vuu[366] = 1061854073;
        w.vuu[367] = -1715796682;
        w.vuu[368] = -1885513192;
        w.vuu[369] = 103919900;
        w.vuu[370] = 1158670635;
        w.vuu[371] = 1399948250;
        w.vuu[372] = 1645206725;
        w.vuu[373] = -1072465404;
        w.vuu[374] = -820324292;
        w.vuu[375] = -665643806;
        w.vuu[376] = 32072218;
        w.vuu[377] = -1364690896;
        w.vuu[378] = -337331772;
        w.vuu[379] = -1679834712;
        w.vuu[380] = 1695037086;
        w.vuu[381] = 568951898;
        w.vuu[382] = 1268236265;
        w.vuu[383] = -550487742;
        w.vuu[384] = 1838380225;
        w.vuu[385] = 1140288778;
        w.vuu[386] = 551040739;
        w.vuu[387] = -425467227;
        w.vuu[388] = -2121401274;
        w.vuu[389] = 598101930;
        w.vuu[390] = -537153999;
        w.vuu[391] = -44323633;
        w.vuu[392] = 722992597;
        w.vuu[393] = 542947339;
        w.vuu[394] = -944662320;
        w.vuu[395] = 1524242307;
        w.vuu[396] = 1916752949;
        w.vuu[397] = -972026676;
        w.vuu[398] = 1287897068;
        w.vuu[399] = -936535175;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$tabComplete$1(class_742 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("yoh", wbd(int ), (int)530)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("yoi", vus(int ), (int)969)) break;
            v0 /* !! */  = (long)w.vuv("yoj", vus(int ), (int)970);
        }
        var3_1 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl11
        block17: while (true) {
            v1 /* !! */  = (long)(w.vuv("yol", wbd(int ), (int)532) - w.vuv("yok", wbd(int ), (int)531));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -102740863: {
                    continue block17;
                }
                case 1952754353: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = w.b;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - w.vuv("yom", wbd(int ), (int)533));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 143406759: {
                    v3 = w.vuv("yon", wbd(int ), (int)534);
                    continue block18;
                }
                case 1013230272: {
                    v3 = w.vuv("yoo", wbd(int ), (int)535);
                    continue block18;
                }
                case 1952754353: {
                    break block18;
                }
                case 1980565811: {
                    v3 = w.vuv("yop", wbd(int ), (int)536);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
lbl36:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("yoq", wbd(int ), (int)537)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == w.vuv("yor", vus(int ), (int)971)) break;
                    v4 /* !! */  = (long)w.vuv("yos", vus(int ), (int)972);
                }
                v5 = var0.method_7334();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("yot", wbd(int ), (int)538)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == w.vuv("you", vus(int ), (int)973)) break;
                    v6 /* !! */  = (long)w.vuv("yov", vus(int ), (int)974);
                }
                return v5.name();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)w.vuv("yow", vus(int ), (int)975);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)w.vuv("yox", vus(int ), (int)976);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)w.vuv("yoy", vus(int ), (int)977);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)w.vuv("yoz", vus(int ), (int)978);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ypz() {
        w.vut[0] = 1702227879;
        w.vut[1] = 1314036781;
        w.vut[2] = 524387187;
        w.vut[3] = -395976993;
        w.vut[4] = -80245992;
        w.vut[5] = 436654485;
        w.vut[6] = -816700661;
        w.vut[7] = 677795185;
        w.vut[8] = 1725283916;
        w.vut[9] = -2041207702;
        w.vut[10] = -742133899;
        w.vut[11] = 120727666;
        w.vut[12] = -1950078335;
        w.vut[13] = -1554772641;
        w.vut[14] = -1836170939;
        w.vut[15] = -1790266093;
        w.vut[16] = 1428643231;
        w.vut[17] = 1211324717;
        w.vut[18] = -925871235;
        w.vut[19] = -1400071871;
        w.vut[20] = 1181435690;
        w.vut[21] = -1890834022;
        w.vut[22] = -963280402;
        w.vut[23] = -28984659;
        w.vut[24] = 851038823;
        w.vut[25] = 83312994;
        w.vut[26] = -1241007785;
        w.vut[27] = -108045722;
        w.vut[28] = 176540730;
        w.vut[29] = 1790929895;
        w.vut[30] = -1814373665;
        w.vut[31] = -44456023;
        w.vut[32] = 721188372;
        w.vut[33] = 760813326;
        w.vut[34] = -903604118;
        w.vut[35] = 242844811;
        w.vut[36] = -1687000053;
        w.vut[37] = 1300329131;
        w.vut[38] = 276597909;
        w.vut[39] = -1310690210;
        w.vut[40] = 1057407145;
        w.vut[41] = 2075141934;
        w.vut[42] = -327249134;
        w.vut[43] = 1362223776;
        w.vut[44] = 1862365666;
        w.vut[45] = -777782285;
        w.vut[46] = 1352771048;
        w.vut[47] = -479708392;
        w.vut[48] = 1394647008;
        w.vut[49] = -863764970;
        w.vut[50] = -848248242;
        w.vut[51] = 1466926113;
        w.vut[52] = -497409743;
        w.vut[53] = -1546388570;
        w.vut[54] = 1045666186;
        w.vut[55] = 1254256967;
        w.vut[56] = -422747967;
        w.vut[57] = -1642829635;
        w.vut[58] = -1895720;
        w.vut[59] = -177070161;
        w.vut[60] = -184834557;
        w.vut[61] = 1724904280;
        w.vut[62] = -2146072837;
        w.vut[63] = 390161266;
        w.vut[64] = -703871068;
        w.vut[65] = -615040096;
        w.vut[66] = -107654490;
        w.vut[67] = 496461627;
        w.vut[68] = -2079275584;
        w.vut[69] = 2056885170;
        w.vut[70] = -523036095;
        w.vut[71] = 1860512873;
        w.vut[72] = -464901648;
        w.vut[73] = 1105688882;
        w.vut[74] = -771272641;
        w.vut[75] = 1412845804;
        w.vut[76] = -1778743808;
        w.vut[77] = 38617771;
        w.vut[78] = 1488866756;
        w.vut[79] = 1243522701;
        w.vut[80] = -867164060;
        w.vut[81] = -2026260935;
        w.vut[82] = -406558420;
        w.vut[83] = -1231018052;
        w.vut[84] = -1208880918;
        w.vut[85] = -1321557505;
        w.vut[86] = 2004557892;
        w.vut[87] = 1913062464;
        w.vut[88] = -1190256813;
        w.vut[89] = 1350360350;
        w.vut[90] = 136623789;
        w.vut[91] = 1358140249;
        w.vut[92] = 169705169;
        w.vut[93] = -1114184022;
        w.vut[94] = -798002968;
        w.vut[95] = -586258523;
        w.vut[96] = 1690553998;
        w.vut[97] = 870616415;
        w.vut[98] = -1183331427;
        w.vut[99] = -724291884;
    }

    private static /* synthetic */ void ywv() {
        w.vxg[300] = 2981872346138727908L;
        w.vxg[301] = -8489516044463127674L;
        w.vxg[302] = -1586480073778988677L;
        w.vxg[303] = 1931602555081571544L;
        w.vxg[304] = 6150870950119025415L;
        w.vxg[305] = -5955397127701702013L;
        w.vxg[306] = -3512958203963330687L;
        w.vxg[307] = 7792674697072608338L;
        w.vxg[308] = -1414687569759770303L;
        w.vxg[309] = -8968661790719969189L;
        w.vxg[310] = -7298634970076294780L;
        w.vxg[311] = 3735133082356954159L;
        w.vxg[312] = -7619352507756142990L;
        w.vxg[313] = -7871009454916922350L;
        w.vxg[314] = 6838685749713586201L;
        w.vxg[315] = 8731530828855754757L;
        w.vxg[316] = 5062545945085852136L;
        w.vxg[317] = -7780608581958222297L;
        w.vxg[318] = -1361429952530495432L;
        w.vxg[319] = -4475004537108468366L;
        w.vxg[320] = -6474026499557259709L;
        w.vxg[321] = 2360310552182699310L;
        w.vxg[322] = 6158758860078754672L;
        w.vxg[323] = 2922210747294719376L;
        w.vxg[324] = -2054357861742313509L;
        w.vxg[325] = -5611142706743753961L;
        w.vxg[326] = 8962553738918402148L;
        w.vxg[327] = 5821022616579983650L;
        w.vxg[328] = 1928925913052840243L;
        w.vxg[329] = -8428373887940418807L;
        w.vxg[330] = -4915236455286663016L;
        w.vxg[331] = 2800890341324541754L;
        w.vxg[332] = 1666039171253039789L;
        w.vxg[333] = -3591097541206663867L;
        w.vxg[334] = 3271372231742134667L;
        w.vxg[335] = -3557996743505914820L;
        w.vxg[336] = 7789419892956899442L;
        w.vxg[337] = -3836035299245769379L;
        w.vxg[338] = -6207561297281424989L;
        w.vxg[339] = -4455371282283419192L;
        w.vxg[340] = 5944335342786787845L;
        w.vxg[341] = -8096204586828370257L;
        w.vxg[342] = 7504382074966529612L;
        w.vxg[343] = 1512527125430837468L;
        w.vxg[344] = -3480966677880906049L;
        w.vxg[345] = 8714973235876531618L;
        w.vxg[346] = -6819889033995812191L;
        w.vxg[347] = 6151195558861248243L;
        w.vxg[348] = 243081519763612406L;
        w.vxg[349] = 2830667217428262435L;
        w.vxg[350] = -257851868446862739L;
        w.vxg[351] = 4249821834510414492L;
        w.vxg[352] = 4470323428940549406L;
        w.vxg[353] = 7305113093403980665L;
        w.vxg[354] = -7759470214884631099L;
        w.vxg[355] = 2903379940090139712L;
        w.vxg[356] = 1375168003978461003L;
        w.vxg[357] = -8174861767999420522L;
        w.vxg[358] = -4401366117668432622L;
        w.vxg[359] = 5267092327392697562L;
        w.vxg[360] = -5297683989192695763L;
        w.vxg[361] = 831438365916270123L;
        w.vxg[362] = -677122270077280756L;
        w.vxg[363] = 8071593835500250105L;
        w.vxg[364] = 5399640855529602232L;
        w.vxg[365] = -2292093114327854903L;
        w.vxg[366] = -2030791471575771880L;
        w.vxg[367] = 5479408947566695826L;
        w.vxg[368] = -5483095795362610768L;
        w.vxg[369] = 8162174650167672821L;
        w.vxg[370] = 1889600372720289038L;
        w.vxg[371] = 5652450226208401949L;
        w.vxg[372] = -2334879598801077379L;
        w.vxg[373] = -4079237643539136510L;
        w.vxg[374] = 3170778045583390248L;
        w.vxg[375] = -3152377568959489037L;
        w.vxg[376] = 750213714652977383L;
        w.vxg[377] = 416032213804576303L;
        w.vxg[378] = 6402724006578228322L;
        w.vxg[379] = -6425921566886124120L;
        w.vxg[380] = 5767428049263066586L;
        w.vxg[381] = 8483599026446997475L;
        w.vxg[382] = -5597034392108489657L;
        w.vxg[383] = 8301217126243302669L;
        w.vxg[384] = -4417701844414000355L;
        w.vxg[385] = 5839962619058996901L;
        w.vxg[386] = -2641330075637077192L;
        w.vxg[387] = 3144715645120275478L;
        w.vxg[388] = -1084568435188369587L;
        w.vxg[389] = -4562379344266246183L;
        w.vxg[390] = 3692968949345679976L;
        w.vxg[391] = 8860217898530958471L;
        w.vxg[392] = -7614063746929353369L;
        w.vxg[393] = 8643695206428716546L;
        w.vxg[394] = -2555651632441763152L;
        w.vxg[395] = -7090831989193937204L;
        w.vxg[396] = 4432479233094481766L;
        w.vxg[397] = -441515929041565766L;
        w.vxg[398] = 716061505655716936L;
        w.vxg[399] = -4175744242522693260L;
    }

    private static /* synthetic */ void yxb() {
        w.vxh[300] = -8441842285926426659L;
        w.vxh[301] = -1177103479275658649L;
        w.vxh[302] = 5532430979090687945L;
        w.vxh[303] = -6134940930878658991L;
        w.vxh[304] = 277919417814472971L;
        w.vxh[305] = 6121341825851024043L;
        w.vxh[306] = -828268696759287186L;
        w.vxh[307] = 1330838083694604402L;
        w.vxh[308] = 8824905194224553559L;
        w.vxh[309] = -7197389711643682259L;
        w.vxh[310] = 6561965941978862837L;
        w.vxh[311] = 3195364180744463169L;
        w.vxh[312] = 4499522896855806083L;
        w.vxh[313] = 7930342889144067599L;
        w.vxh[314] = -3249635331363221929L;
        w.vxh[315] = -8037017953548345730L;
        w.vxh[316] = -676459836407020855L;
        w.vxh[317] = 5385461084470619110L;
        w.vxh[318] = -6165178188531320173L;
        w.vxh[319] = 8584203426730943528L;
        w.vxh[320] = 1177929030917063520L;
        w.vxh[321] = 5033073318521267189L;
        w.vxh[322] = -1209351062858395288L;
        w.vxh[323] = 8926046103649898379L;
        w.vxh[324] = 4222736552284523689L;
        w.vxh[325] = 9031951042419473108L;
        w.vxh[326] = -1556708874811829200L;
        w.vxh[327] = -1354406525364530817L;
        w.vxh[328] = -8606649581654935010L;
        w.vxh[329] = 5843444981460459647L;
        w.vxh[330] = 6551225392368091115L;
        w.vxh[331] = 1697219710359253391L;
        w.vxh[332] = 4707777939991360027L;
        w.vxh[333] = 8743990801042277807L;
        w.vxh[334] = -7751918324738869777L;
        w.vxh[335] = 5529447239118231774L;
        w.vxh[336] = 9050992656819505924L;
        w.vxh[337] = -2362589320131436581L;
        w.vxh[338] = -5265309003230706247L;
        w.vxh[339] = 7573272279429882344L;
        w.vxh[340] = -5829868109687153571L;
        w.vxh[341] = 765212696759220279L;
        w.vxh[342] = -2283059860721939391L;
        w.vxh[343] = -5516004040654609591L;
        w.vxh[344] = 795648047067157837L;
        w.vxh[345] = -8013894889223218802L;
        w.vxh[346] = 50248748906598663L;
        w.vxh[347] = -4488492835835068627L;
        w.vxh[348] = 5221632867391783366L;
        w.vxh[349] = 1350992335465790223L;
        w.vxh[350] = -6362952123094010532L;
        w.vxh[351] = 4636453222940734744L;
        w.vxh[352] = -4497751320957198953L;
        w.vxh[353] = 6536587564311139615L;
        w.vxh[354] = -1459398222342774214L;
        w.vxh[355] = 1711051938743800896L;
        w.vxh[356] = 3232473591480575697L;
        w.vxh[357] = -3562049849665189994L;
        w.vxh[358] = -9022903760280693486L;
        w.vxh[359] = -8962003907972445041L;
        w.vxh[360] = -937344019297867858L;
        w.vxh[361] = 6225553924947077127L;
        w.vxh[362] = 7741182741845710243L;
        w.vxh[363] = 1012603210203667171L;
        w.vxh[364] = 8014344755715684915L;
        w.vxh[365] = -6438949327593066117L;
        w.vxh[366] = 3427185970993896314L;
        w.vxh[367] = 6311651490168114334L;
        w.vxh[368] = -2469605408543967189L;
        w.vxh[369] = 5669047608032488354L;
        w.vxh[370] = 9054903303329788359L;
        w.vxh[371] = -5221493754929953860L;
        w.vxh[372] = -5287084038972054005L;
        w.vxh[373] = 2801035442965756049L;
        w.vxh[374] = 2039751222976031657L;
        w.vxh[375] = 1815656040467728908L;
        w.vxh[376] = -7160004782232050117L;
        w.vxh[377] = 4835593203718130546L;
        w.vxh[378] = -3893710419368123020L;
        w.vxh[379] = -2464744550462720078L;
        w.vxh[380] = 3629656560840459160L;
        w.vxh[381] = 3820938105338181377L;
        w.vxh[382] = 8360342602057725741L;
        w.vxh[383] = 8485723631407262118L;
        w.vxh[384] = 2302407837355625458L;
        w.vxh[385] = 1231654300352136869L;
        w.vxh[386] = 1663737235403302528L;
        w.vxh[387] = 3927343997195799543L;
        w.vxh[388] = 2512577114934594571L;
        w.vxh[389] = -7748872928964862600L;
        w.vxh[390] = -5339110889387953498L;
        w.vxh[391] = 674888193296667488L;
        w.vxh[392] = 7145056587129983040L;
        w.vxh[393] = -2180678326674555926L;
        w.vxh[394] = -5124157376003667483L;
        w.vxh[395] = -3513423274902229255L;
        w.vxh[396] = -5784025419557231807L;
        w.vxh[397] = -9126345839676596996L;
        w.vxh[398] = -4321970128920840071L;
        w.vxh[399] = 2271209747147361769L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean isHole(double d2, double d3, double d4) {
        CallSite callSite;
        Object object = bh;
        block17: while (true) {
            switch ((int)object) {
                case 241910274: {
                    object = w.vuv("wzl", wbd(int ), (int)252) - w.vuv("wzk", wbd(int ), (int)251);
                    continue block17;
                }
                case 1952754353: {
                    break block17;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = bh;
        boolean bl3 = true;
        block18: while (true) {
            CallSite callSite2;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite2 - w.vuv("wzm", wbd(int ), (int)253);
            }
            switch ((int)object2) {
                case -694590244: {
                    callSite2 = w.vuv("wzn", wbd(int ), (int)254);
                    continue block18;
                }
                case -682762830: {
                    callSite2 = w.vuv("wzo", wbd(int ), (int)255);
                    continue block18;
                }
                case 1952754353: {
                    break block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = bh;
        block19: while (true) {
            switch ((int)object3) {
                case -2075012158: {
                    object3 = w.vuv("wzq", wbd(int ), (int)257) - w.vuv("wzp", wbd(int ), (int)256);
                    continue block19;
                }
                case 1952754353: {
                    break block19;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4 || bl4) return (boolean)w.vuv("wzr", vus(int ), (int)539);
        Object object4 = bh;
        block20: while (true) {
            switch ((int)object4) {
                case -383455317: {
                    object4 = w.vuv("wzt", wbd(int ), (int)259) - w.vuv("wzs", wbd(int ), (int)258);
                    continue block20;
                }
                case 1952754353: {
                    break block20;
                }
            }
            break;
        }
        if (d4 - this.getRealSurfaceY(d2, d3) > w.vuv("wzu", vxf(int ), (int)260)) {
            if (bl4) return (boolean)w.vuv("wzr", vus(int ), (int)539);
            callSite = w.vuv("wzv", vus(int ), (int)540);
            if (!bl2) return (boolean)callSite;
            throw null;
        }
        if (bl4 || bl4) {
            return (boolean)w.vuv("wzr", vus(int ), (int)539);
        }
        callSite = w.vuv("wzw", vus(int ), (int)541);
        return (boolean)callSite;
    }

    private static /* synthetic */ void yxa() {
        w.vxh[200] = -1868501822675966777L;
        w.vxh[201] = -6193206728313811012L;
        w.vxh[202] = 8851718066137570010L;
        w.vxh[203] = -139126885903815344L;
        w.vxh[204] = -417851229812127678L;
        w.vxh[205] = 6896420233695657930L;
        w.vxh[206] = -1270125713095709565L;
        w.vxh[207] = -2887590235334453854L;
        w.vxh[208] = 5856665057126321633L;
        w.vxh[209] = 2445986530411751280L;
        w.vxh[210] = -6250027349183681843L;
        w.vxh[211] = 1791421376201919768L;
        w.vxh[212] = -5539037672657065470L;
        w.vxh[213] = -8548034729750787678L;
        w.vxh[214] = 3631957364908800126L;
        w.vxh[215] = 7531063548347982200L;
        w.vxh[216] = -4414546567292231027L;
        w.vxh[217] = 326504659480071802L;
        w.vxh[218] = 7220347239210009321L;
        w.vxh[219] = 8101790161262003554L;
        w.vxh[220] = -4366171102348966858L;
        w.vxh[221] = -2607970361414869843L;
        w.vxh[222] = 5392210355958498516L;
        w.vxh[223] = 3927997697969473609L;
        w.vxh[224] = -6701455431120835864L;
        w.vxh[225] = 7517422545829379221L;
        w.vxh[226] = -5755236112190733207L;
        w.vxh[227] = 6385258511845812855L;
        w.vxh[228] = -3474784678049438502L;
        w.vxh[229] = 1497470228278139487L;
        w.vxh[230] = -8917719964862808952L;
        w.vxh[231] = -4457771539466293439L;
        w.vxh[232] = 3721516874147917677L;
        w.vxh[233] = -1688023632688627999L;
        w.vxh[234] = -8506999403869981797L;
        w.vxh[235] = -6319873859442681621L;
        w.vxh[236] = -5624392490772639744L;
        w.vxh[237] = -3377341556500803948L;
        w.vxh[238] = -4958195342376057624L;
        w.vxh[239] = 5794548201632241176L;
        w.vxh[240] = -8565879668773748507L;
        w.vxh[241] = 4703923146502500684L;
        w.vxh[242] = -7305198314637116628L;
        w.vxh[243] = -3669744468335230184L;
        w.vxh[244] = 947435113872221764L;
        w.vxh[245] = 7332355076483947362L;
        w.vxh[246] = 1637867540691614528L;
        w.vxh[247] = -2572159469960798025L;
        w.vxh[248] = -177516738699666996L;
        w.vxh[249] = -7168951688437677174L;
        w.vxh[250] = 8769760597012644224L;
        w.vxh[251] = -4099914897405443395L;
        w.vxh[252] = -5096799299886817800L;
        w.vxh[253] = -2575939098459374121L;
        w.vxh[254] = 6742835474713127715L;
        w.vxh[255] = 995054649496336013L;
        w.vxh[256] = 7616627626229212708L;
        w.vxh[257] = -9099813781434502054L;
        w.vxh[258] = -7696439764239491519L;
        w.vxh[259] = -6448183502561032653L;
        w.vxh[260] = -2758301535327090799L;
        w.vxh[261] = 2203086832540110584L;
        w.vxh[262] = -7092106731108479083L;
        w.vxh[263] = -7813583329308145406L;
        w.vxh[264] = -4266310912416025471L;
        w.vxh[265] = 3262991413491577289L;
        w.vxh[266] = 2711115724287000190L;
        w.vxh[267] = -4763269181823880347L;
        w.vxh[268] = 5025272454792593992L;
        w.vxh[269] = 1027884171686533647L;
        w.vxh[270] = 1848965736425384657L;
        w.vxh[271] = 7757912113473138671L;
        w.vxh[272] = -7539056486188405754L;
        w.vxh[273] = -3976171472978696342L;
        w.vxh[274] = -7913587454875120124L;
        w.vxh[275] = 3325791968833856958L;
        w.vxh[276] = 471541332113717595L;
        w.vxh[277] = -6387092869403102540L;
        w.vxh[278] = -5835233957178643792L;
        w.vxh[279] = 7942896886178632312L;
        w.vxh[280] = 6817191518927378605L;
        w.vxh[281] = -5575050114824085840L;
        w.vxh[282] = -9168581365545155271L;
        w.vxh[283] = -1865089395737846576L;
        w.vxh[284] = -6910186516765495831L;
        w.vxh[285] = -6251613816894724692L;
        w.vxh[286] = -4627288627475329099L;
        w.vxh[287] = 4210909706341609966L;
        w.vxh[288] = -4809699266449740689L;
        w.vxh[289] = -7349558918273344238L;
        w.vxh[290] = -229513087564219203L;
        w.vxh[291] = -2862779038347444122L;
        w.vxh[292] = 5379348959837949438L;
        w.vxh[293] = 4803296766100463959L;
        w.vxh[294] = -4452227715871176793L;
        w.vxh[295] = 2372676603824394113L;
        w.vxh[296] = 7648458734094233678L;
        w.vxh[297] = -7854480419013938080L;
        w.vxh[298] = -7669544641201895651L;
        w.vxh[299] = -3464892346525174429L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_243 getDestination() {
        boolean bl2;
        Object object = bh;
        block9: while (true) {
            switch ((int)object) {
                case -1843047968: {
                    object = w.vuv("wqh", wbd(int ), (int)186) - w.vuv("wqg", wbd(int ), (int)185);
                    continue block9;
                }
                case 1952754353: {
                    break block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = bh;
        boolean bl4 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - w.vuv("wqi", wbd(int ), (int)187);
            }
            switch ((int)object2) {
                case -2083139957: {
                    callSite = w.vuv("wqj", wbd(int ), (int)188);
                    continue block10;
                }
                case -107249896: {
                    callSite = w.vuv("wqk", wbd(int ), (int)189);
                    continue block10;
                }
                case 1952754353: {
                    break block10;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = bh - w.vuv("wql", wbd(int ), (int)190)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == w.vuv("wqm", vus(int ), (int)367)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = w.vuv("wqn", vus(int ), (int)368);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = bh - w.vuv("wqo", wbd(int ), (int)191)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == w.vuv("wqp", vus(int ), (int)369)) {
                return this.destination;
            }
            object4 = w.vuv("wqq", vus(int ), (int)370);
        }
    }

    private static /* synthetic */ void ywm() {
        w.vxg[200] = -7350366614551438536L;
        w.vxg[201] = 27817317695142898L;
        w.vxg[202] = 3955792633337772340L;
        w.vxg[203] = 5526191720520311522L;
        w.vxg[204] = -185548962160359360L;
        w.vxg[205] = 2623060131046207750L;
        w.vxg[206] = 299745017722196997L;
        w.vxg[207] = 4194162738894450349L;
        w.vxg[208] = 487405692882159149L;
        w.vxg[209] = -7601541786353424048L;
        w.vxg[210] = 5885627672096814585L;
        w.vxg[211] = -4034976988370299054L;
        w.vxg[212] = -346739080318650688L;
        w.vxg[213] = 7339726159298836993L;
        w.vxg[214] = -7909063836354213940L;
        w.vxg[215] = 2544932754603747511L;
        w.vxg[216] = 7564106151352960030L;
        w.vxg[217] = -4194654184256132033L;
        w.vxg[218] = -5144511898371561145L;
        w.vxg[219] = 7762950905493294770L;
        w.vxg[220] = -2708386152239130925L;
        w.vxg[221] = 653521351750305721L;
        w.vxg[222] = 5445582797652227704L;
        w.vxg[223] = -7613081616808979869L;
        w.vxg[224] = 4232000400837251733L;
        w.vxg[225] = 8056384196433254212L;
        w.vxg[226] = 512131708586715660L;
        w.vxg[227] = 7454301083826935992L;
        w.vxg[228] = -6150374424609832260L;
        w.vxg[229] = 6559599102220147080L;
        w.vxg[230] = -1664751346438128987L;
        w.vxg[231] = 1222616511124497412L;
        w.vxg[232] = -6103872372904085456L;
        w.vxg[233] = -8627230728545843176L;
        w.vxg[234] = -7228222667148956057L;
        w.vxg[235] = -7943243740996252077L;
        w.vxg[236] = 4523223829466983110L;
        w.vxg[237] = 3615330808508467169L;
        w.vxg[238] = -782287939755616263L;
        w.vxg[239] = -3626831274917433187L;
        w.vxg[240] = -119560103149913417L;
        w.vxg[241] = 8335289286036107457L;
        w.vxg[242] = -8390053651986132901L;
        w.vxg[243] = -1775311809758483849L;
        w.vxg[244] = -7806242180207739085L;
        w.vxg[245] = -2476021553700469509L;
        w.vxg[246] = -8837601910311549549L;
        w.vxg[247] = -2156427346883943178L;
        w.vxg[248] = -4442105843560396334L;
        w.vxg[249] = -6684645912517158384L;
        w.vxg[250] = 5069010290816109901L;
        w.vxg[251] = 3912876821506536798L;
        w.vxg[252] = 841142609786766594L;
        w.vxg[253] = 5669897268095939936L;
        w.vxg[254] = -1163138128979588293L;
        w.vxg[255] = -8247239137428317183L;
        w.vxg[256] = -2992616323419306044L;
        w.vxg[257] = -5908369972610232249L;
        w.vxg[258] = 5127515765958976432L;
        w.vxg[259] = 7283279075244641736L;
        w.vxg[260] = -7374491153381849199L;
        w.vxg[261] = 6817024650781183736L;
        w.vxg[262] = 7028117199603157483L;
        w.vxg[263] = -4135907831791147019L;
        w.vxg[264] = -7659896507596184059L;
        w.vxg[265] = 2272684656259116498L;
        w.vxg[266] = -2699499918017871247L;
        w.vxg[267] = -6470405763181363597L;
        w.vxg[268] = -489144778261425747L;
        w.vxg[269] = -5311966473278216643L;
        w.vxg[270] = 9177963290887317295L;
        w.vxg[271] = 5468836237046167587L;
        w.vxg[272] = -5833998304496215245L;
        w.vxg[273] = -2570060801752128730L;
        w.vxg[274] = 6442695914859206477L;
        w.vxg[275] = 6521258560207894701L;
        w.vxg[276] = 4021301197058257274L;
        w.vxg[277] = -126367726804592570L;
        w.vxg[278] = 6186959505087360920L;
        w.vxg[279] = -4476622090844654988L;
        w.vxg[280] = -8570818956406139128L;
        w.vxg[281] = 709576233955577256L;
        w.vxg[282] = 4745392391676212588L;
        w.vxg[283] = 8165834994992238362L;
        w.vxg[284] = -6427340459389656177L;
        w.vxg[285] = -3539760361139808613L;
        w.vxg[286] = -2790886252274293383L;
        w.vxg[287] = 6486667933017291393L;
        w.vxg[288] = 736387350243326948L;
        w.vxg[289] = 8965896965004344184L;
        w.vxg[290] = 3087374949918738980L;
        w.vxg[291] = -6129615137839186676L;
        w.vxg[292] = -406011108814090388L;
        w.vxg[293] = -306055369061161415L;
        w.vxg[294] = 1218059128801236549L;
        w.vxg[295] = -8336526124505463591L;
        w.vxg[296] = -4145054973149098596L;
        w.vxg[297] = -3238117713648540019L;
        w.vxg[298] = -8572857362092026704L;
        w.vxg[299] = -114621703372486794L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void stopAutomated() {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("wow", wbd(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -742749399: {
                    v1 = w.vuv("wox", wbd(int ), (int)172);
                    continue block19;
                }
                case 1419475784: {
                    v1 = w.vuv("woy", wbd(int ), (int)173);
                    continue block19;
                }
                case 1930090451: {
                    v1 = w.vuv("woz", wbd(int ), (int)174);
                    continue block19;
                }
                case 1952754353: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = w.c;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - w.vuv("wpa", wbd(int ), (int)175));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2125415448: {
                    v3 = w.vuv("wpb", wbd(int ), (int)176);
                    continue block20;
                }
                case -200737081: {
                    v3 = w.vuv("wpc", wbd(int ), (int)177);
                    continue block20;
                }
                case 1952754353: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = w.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wpd", wbd(int ), (int)178)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == w.vuv("wpe", vus(int ), (int)345)) break;
            v4 /* !! */  = (long)w.vuv("wpf", vus(int ), (int)346);
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
lbl40:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v5 = w.vuv("wpg", vus(int ), (int)347);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wph", wbd(int ), (int)179)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == w.vuv("wpi", vus(int ), (int)348)) break;
            v6 /* !! */  = (long)w.vuv("wpj", vus(int ), (int)349);
        }
        this.stop((boolean)v5);
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)w.vuv("wpk", vus(int ), (int)350);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)w.vuv("wpl", vus(int ), (int)351);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl72
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)w.vuv("wpm", vus(int ), (int)352);
                if (var3_1) {
                    throw null;
                }
            }
lbl72:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)w.vuv("wpn", vus(int ), (int)353);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
lbl76:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)w.vuv("wpo", vus(int ), (int)354);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)w.vuv("wpp", vus(int ), (int)355);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yqa() {
        w.vut[100] = 1785512725;
        w.vut[101] = 976052355;
        w.vut[102] = -1693755018;
        w.vut[103] = -1414783737;
        w.vut[104] = 1170349117;
        w.vut[105] = 196531771;
        w.vut[106] = -613671187;
        w.vut[107] = 592775492;
        w.vut[108] = 2031569074;
        w.vut[109] = 1082022407;
        w.vut[110] = 795779527;
        w.vut[111] = -1813872338;
        w.vut[112] = 1420517888;
        w.vut[113] = -1503215224;
        w.vut[114] = 684392620;
        w.vut[115] = -2126220507;
        w.vut[116] = 1449819671;
        w.vut[117] = -907555890;
        w.vut[118] = -1692680295;
        w.vut[119] = 2045327358;
        w.vut[120] = 937663320;
        w.vut[121] = 2055581278;
        w.vut[122] = 445327255;
        w.vut[123] = -1028449257;
        w.vut[124] = -1363627344;
        w.vut[125] = 1094835343;
        w.vut[126] = -1948621267;
        w.vut[127] = 913814014;
        w.vut[128] = -1541232827;
        w.vut[129] = 1419082441;
        w.vut[130] = -360987425;
        w.vut[131] = -1143962609;
        w.vut[132] = -1317330228;
        w.vut[133] = -644269931;
        w.vut[134] = -1322539119;
        w.vut[135] = 1617560413;
        w.vut[136] = 240819596;
        w.vut[137] = -335183887;
        w.vut[138] = 973745993;
        w.vut[139] = 779531966;
        w.vut[140] = 1626936427;
        w.vut[141] = -504287317;
        w.vut[142] = -1628330512;
        w.vut[143] = 750390206;
        w.vut[144] = 1600402779;
        w.vut[145] = -337356428;
        w.vut[146] = 803478233;
        w.vut[147] = 1023367985;
        w.vut[148] = 1074135923;
        w.vut[149] = -1590187473;
        w.vut[150] = 774688989;
        w.vut[151] = 486992701;
        w.vut[152] = 908277490;
        w.vut[153] = -1299114112;
        w.vut[154] = -1147557278;
        w.vut[155] = -1962581598;
        w.vut[156] = -1034780535;
        w.vut[157] = -1999235887;
        w.vut[158] = -1231819787;
        w.vut[159] = 1858549361;
        w.vut[160] = 1504265824;
        w.vut[161] = -1886966606;
        w.vut[162] = -914642042;
        w.vut[163] = -1655589160;
        w.vut[164] = -2135773666;
        w.vut[165] = 810078121;
        w.vut[166] = 1284116737;
        w.vut[167] = 1628678625;
        w.vut[168] = 1724209036;
        w.vut[169] = 1255103358;
        w.vut[170] = 619254843;
        w.vut[171] = 2025710134;
        w.vut[172] = -1958264128;
        w.vut[173] = -725007990;
        w.vut[174] = -2083986113;
        w.vut[175] = -2055391427;
        w.vut[176] = 1236317792;
        w.vut[177] = 454069675;
        w.vut[178] = -1025679524;
        w.vut[179] = -1010252796;
        w.vut[180] = 897106299;
        w.vut[181] = -336207099;
        w.vut[182] = 1620620085;
        w.vut[183] = 1389287048;
        w.vut[184] = 1431283160;
        w.vut[185] = 552688591;
        w.vut[186] = 39263455;
        w.vut[187] = 956015574;
        w.vut[188] = -1510991233;
        w.vut[189] = -561938750;
        w.vut[190] = -1348999086;
        w.vut[191] = 1232252539;
        w.vut[192] = -1956700877;
        w.vut[193] = -646574299;
        w.vut[194] = -2093672234;
        w.vut[195] = 961065789;
        w.vut[196] = -1044754638;
        w.vut[197] = -1378106519;
        w.vut[198] = -1021786425;
        w.vut[199] = -1601108042;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 findPlayer(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wtc", wbd(int ), (int)201)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("wtd", vus(int ), (int)425)) break;
            v0 /* !! */  = (long)w.vuv("wte", vus(int ), (int)426);
        }
        var6_2 = w.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wtf", wbd(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == w.vuv("wtg", vus(int ), (int)427)) break;
            v1 /* !! */  = (long)w.vuv("wth", vus(int ), (int)428);
        }
        var5_3 /* !! */  = w.b;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl17
        block45: while (true) {
            v2 /* !! */  = (long)(w.vuv("wtj", wbd(int ), (int)204) - w.vuv("wti", wbd(int ), (int)203));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -670700303: {
                    continue block45;
                }
                case 1952754353: {
                    break block45;
                }
            }
            break;
        }
        var4_4 = w.a;
        if (var6_2) {
            throw null;
lbl25:
            // 10 sources

            return null;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wtk", wbd(int ), (int)205)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == w.vuv("wtl", vus(int ), (int)429)) break;
                    v3 /* !! */  = (long)w.vuv("wtm", vus(int ), (int)430);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wtn", wbd(int ), (int)206)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == w.vuv("wto", vus(int ), (int)431)) break;
                    v4 /* !! */  = (long)w.vuv("wtp", vus(int ), (int)432);
                }
                if (w.mc.field_1687 != null) ** GOTO lbl44
                if (var4_4 || var4_4) ** GOTO lbl25
                return null;
lbl44:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl25
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wtq", wbd(int ), (int)207)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == w.vuv("wtr", vus(int ), (int)433)) break;
                    v5 /* !! */  = (long)w.vuv("wts", vus(int ), (int)434);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("wtt", wbd(int ), (int)208)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == w.vuv("wtu", vus(int ), (int)435)) break;
                    v6 /* !! */  = (long)w.vuv("wtv", vus(int ), (int)436);
                }
                v7 = w.mc.field_1687;
                v8 /* !! */  = w.bh;
                if (true) ** GOTO lbl60
                block51: while (true) {
                    v8 /* !! */  = (long)(v9 - w.vuv("wtw", wbd(int ), (int)209));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1514020022: {
                            v9 = w.vuv("wtx", wbd(int ), (int)210);
                            continue block51;
                        }
                        case 98409313: {
                            v9 = w.vuv("wty", wbd(int ), (int)211);
                            continue block51;
                        }
                        case 1952754353: {
                            break block51;
                        }
                    }
                    break;
                }
                v10 = v7.method_18456();
                v11 /* !! */  = w.bh;
                if (true) ** GOTO lbl74
                block52: while (true) {
                    v11 /* !! */  = (long)(v12 - w.vuv("wtz", wbd(int ), (int)212));
lbl74:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 923631013: {
                            v12 = w.vuv("wua", wbd(int ), (int)213);
                            continue block52;
                        }
                        case 1684628705: {
                            v12 = w.vuv("wub", wbd(int ), (int)214);
                            continue block52;
                        }
                        case 1952754353: {
                            break block52;
                        }
                    }
                    break;
                }
                var2_5 = v10.iterator();
                if (var4_4) ** GOTO lbl25
                do {
                    if (var4_4 || var4_4) ** GOTO lbl25
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("wuc", wbd(int ), (int)215)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == w.vuv("wud", vus(int ), (int)437)) break;
                        v13 /* !! */  = (long)w.vuv("wue", vus(int ), (int)438);
                    }
                    if (!var2_5.hasNext()) ** GOTO lbl132
                    if (var4_4) ** GOTO lbl25
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_7 = w.bh - w.vuv("wuf", wbd(int ), (int)216)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == w.vuv("wug", vus(int ), (int)439)) break;
                        v14 /* !! */  = (long)w.vuv("wuh", vus(int ), (int)440);
                    }
                    var3_6 = (class_1657)var2_5.next();
                    if (var4_4 || var4_4) ** GOTO lbl25
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_8 = w.bh - w.vuv("wui", wbd(int ), (int)217)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == w.vuv("wuj", vus(int ), (int)441)) break;
                        v15 /* !! */  = (long)w.vuv("wuk", vus(int ), (int)442);
                    }
                    v16 = var3_6.method_7334();
                    v17 /* !! */  = w.bh;
                    if (true) ** GOTO lbl111
                    block57: while (true) {
                        v17 /* !! */  = (long)(v18 - w.vuv("wul", wbd(int ), (int)218));
lbl111:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -239813274: {
                                v18 = w.vuv("wum", wbd(int ), (int)219);
                                continue block57;
                            }
                            case 774789300: {
                                v18 = w.vuv("wun", wbd(int ), (int)220);
                                continue block57;
                            }
                            case 1952754353: {
                                break block57;
                            }
                        }
                        break;
                    }
                    v19 = v16.name();
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_9 = w.bh - w.vuv("wuo", wbd(int ), (int)221)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == w.vuv("wup", vus(int ), (int)443)) break;
                        v20 /* !! */  = (long)w.vuv("wuq", vus(int ), (int)444);
                    }
                    if (!v19.equalsIgnoreCase(var1_1)) ** GOTO lbl129
                    if (var4_4 || var4_4) ** GOTO lbl25
                    return var3_6;
lbl129:
                    // 1 sources

                    if (var4_4 || var4_4) ** GOTO lbl25
                } while (!var6_2);
                throw null;
lbl132:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var5_3 /* !! */  = (int)w.vuv("wur", vus(int ), (int)445);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var5_3 /* !! */  = (int)w.vuv("wus", vus(int ), (int)446);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 2: {
                var5_3 /* !! */  = (int)w.vuv("wut", vus(int ), (int)447);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl150:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)w.vuv("wuu", vus(int ), (int)448);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)w.vuv("wuv", vus(int ), (int)449);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl171
                    break;
                }
            }
            case 5: {
                var5_3 /* !! */  = (int)w.vuv("wuw", vus(int ), (int)450);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 6: {
                var5_3 /* !! */  = (int)w.vuv("wux", vus(int ), (int)451);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl171:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)w.vuv("wuy", vus(int ), (int)452);
                if (var6_2) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 8: {
                var5_3 /* !! */  = (int)w.vuv("wuz", vus(int ), (int)453);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl180:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)w.vuv("wva", vus(int ), (int)454);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 10: {
                do {
                    var5_3 /* !! */  = (int)w.vuv("wvb", vus(int ), (int)455);
                } while (!var6_2);
                throw null;
            }
lbl190:
            // 5 sources

            case 11: {
                var5_3 /* !! */  = (int)w.vuv("wvc", vus(int ), (int)456);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 12: {
                var5_3 /* !! */  = (int)w.vuv("wvd", vus(int ), (int)457);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 13: {
                var5_3 /* !! */  = (int)w.vuv("wve", vus(int ), (int)458);
                if (!var6_2) ** GOTO lbl190
                throw null;
            }
lbl204:
            // 5 sources

            case 14: {
                var5_3 /* !! */  = (int)w.vuv("wvf", vus(int ), (int)459);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 15: {
                do {
                    var5_3 /* !! */  = (int)w.vuv("wvg", vus(int ), (int)460);
                } while (!var6_2);
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)w.vuv("wvh", vus(int ), (int)461);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl219:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)w.vuv("wvi", vus(int ), (int)462);
                if (!var6_2) ** GOTO lbl204
                throw null;
            }
lbl223:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)w.vuv("wvj", vus(int ), (int)463);
                if (!var6_2) ** GOTO lbl204
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)w.vuv("wvk", vus(int ), (int)464);
                if (!var6_2) ** GOTO lbl180
                throw null;
            }
lbl231:
            // 2 sources

            case 20: {
                do {
                    var5_3 /* !! */  = (int)w.vuv("wvl", vus(int ), (int)465);
                } while (!var6_2);
                throw null;
            }
            case 21: 
        }
        var5_3 /* !! */  = (int)w.vuv("wvm", vus(int ), (int)466);
        ** while (!var6_2)
lbl239:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yrt() {
        w.vuu[200] = -2006138816;
        w.vuu[201] = 22841344;
        w.vuu[202] = 1902852104;
        w.vuu[203] = -1242522170;
        w.vuu[204] = 426150441;
        w.vuu[205] = 1584584869;
        w.vuu[206] = -2146850558;
        w.vuu[207] = -328233138;
        w.vuu[208] = 117842227;
        w.vuu[209] = 1368715197;
        w.vuu[210] = 112645297;
        w.vuu[211] = -1191517720;
        w.vuu[212] = 1604939688;
        w.vuu[213] = 1145425513;
        w.vuu[214] = 1955522392;
        w.vuu[215] = 1856489329;
        w.vuu[216] = 751840300;
        w.vuu[217] = 1136937353;
        w.vuu[218] = 462501113;
        w.vuu[219] = 137454183;
        w.vuu[220] = 38790668;
        w.vuu[221] = -1290349671;
        w.vuu[222] = -1301477612;
        w.vuu[223] = -1614329942;
        w.vuu[224] = -1724880350;
        w.vuu[225] = 420754087;
        w.vuu[226] = -894038054;
        w.vuu[227] = -1016782695;
        w.vuu[228] = -639349424;
        w.vuu[229] = -471957295;
        w.vuu[230] = 249033431;
        w.vuu[231] = 1973655898;
        w.vuu[232] = -44255383;
        w.vuu[233] = -57763201;
        w.vuu[234] = 2093340208;
        w.vuu[235] = 1536517681;
        w.vuu[236] = 1546361725;
        w.vuu[237] = -1466866700;
        w.vuu[238] = 2092351245;
        w.vuu[239] = -819085426;
        w.vuu[240] = 1384991111;
        w.vuu[241] = 56015872;
        w.vuu[242] = 1412061152;
        w.vuu[243] = -405905719;
        w.vuu[244] = 1020704431;
        w.vuu[245] = -1364914342;
        w.vuu[246] = -351905711;
        w.vuu[247] = -1705476716;
        w.vuu[248] = -998520511;
        w.vuu[249] = 594564749;
        w.vuu[250] = -848724197;
        w.vuu[251] = -2138006148;
        w.vuu[252] = 795682487;
        w.vuu[253] = -179998045;
        w.vuu[254] = -1047784181;
        w.vuu[255] = 67688704;
        w.vuu[256] = 509751272;
        w.vuu[257] = 619031755;
        w.vuu[258] = 772983806;
        w.vuu[259] = 1968939016;
        w.vuu[260] = 230424536;
        w.vuu[261] = 973834165;
        w.vuu[262] = -1201842264;
        w.vuu[263] = -577578146;
        w.vuu[264] = 1866054681;
        w.vuu[265] = 161141280;
        w.vuu[266] = 1344229008;
        w.vuu[267] = 806966108;
        w.vuu[268] = -1778972817;
        w.vuu[269] = -1289302352;
        w.vuu[270] = 951555934;
        w.vuu[271] = 104632327;
        w.vuu[272] = 2020216618;
        w.vuu[273] = 1567161734;
        w.vuu[274] = 1846882021;
        w.vuu[275] = 2125533955;
        w.vuu[276] = -1678183863;
        w.vuu[277] = -428792770;
        w.vuu[278] = 289583296;
        w.vuu[279] = -1025735041;
        w.vuu[280] = -1906972781;
        w.vuu[281] = 1935477108;
        w.vuu[282] = 465660770;
        w.vuu[283] = -1401298799;
        w.vuu[284] = -363092640;
        w.vuu[285] = -176351866;
        w.vuu[286] = 411155092;
        w.vuu[287] = 586905484;
        w.vuu[288] = 713954092;
        w.vuu[289] = 2070021125;
        w.vuu[290] = -1291775918;
        w.vuu[291] = -2076857719;
        w.vuu[292] = 898326092;
        w.vuu[293] = -1979296485;
        w.vuu[294] = 1240565519;
        w.vuu[295] = 3298321;
        w.vuu[296] = -987782884;
        w.vuu[297] = -1353327103;
        w.vuu[298] = -1670823311;
        w.vuu[299] = 1961742917;
    }

    private static /* synthetic */ void yxd() {
        w.vxh[500] = -5701643398085515213L;
        w.vxh[501] = -3774927924988716261L;
        w.vxh[502] = -985757172116442624L;
        w.vxh[503] = -1289825734470465978L;
        w.vxh[504] = 7998753569965983219L;
        w.vxh[505] = 6343239925889600551L;
        w.vxh[506] = 935332456681561383L;
        w.vxh[507] = 2931690590606647250L;
        w.vxh[508] = 285911251791705989L;
        w.vxh[509] = -3003084603064210257L;
        w.vxh[510] = 7675727453331767404L;
        w.vxh[511] = 1406707040967030723L;
        w.vxh[512] = -2935320526913167308L;
        w.vxh[513] = 5403010424986909984L;
        w.vxh[514] = -5799317331693377768L;
        w.vxh[515] = 3067819765770693129L;
        w.vxh[516] = -4735542688383235770L;
        w.vxh[517] = 955473804044622830L;
        w.vxh[518] = 684174370129512014L;
        w.vxh[519] = 8298139200121493417L;
        w.vxh[520] = -4519904126191872828L;
        w.vxh[521] = -849504992484330586L;
        w.vxh[522] = -1515469920432363990L;
        w.vxh[523] = -3596508579083830314L;
        w.vxh[524] = -6512969949572516595L;
        w.vxh[525] = -1674490435676247896L;
        w.vxh[526] = 4234249183216083966L;
        w.vxh[527] = -5038476031796647932L;
        w.vxh[528] = -8458577451532312277L;
        w.vxh[529] = -5422033082330239199L;
        w.vxh[530] = 1700622235811992325L;
        w.vxh[531] = -8092584847732479315L;
        w.vxh[532] = 3875874258091699793L;
        w.vxh[533] = 5885296879644992720L;
        w.vxh[534] = 3208690755812160345L;
        w.vxh[535] = -5112153450270447338L;
        w.vxh[536] = -3735592632677577143L;
        w.vxh[537] = -5967293335331564408L;
        w.vxh[538] = -4010102061983464549L;
        w.vxh[539] = 586732153004351822L;
        w.vxh[540] = 6570223411493634054L;
        w.vxh[541] = 2364814774035760001L;
        w.vxh[542] = 678169620198350749L;
        w.vxh[543] = -6373466127198466494L;
        w.vxh[544] = -5435376651388839413L;
        w.vxh[545] = -18090411852382689L;
        w.vxh[546] = -5766692120289134152L;
        w.vxh[547] = 8205591901902562465L;
        w.vxh[548] = 8137852888567266328L;
        w.vxh[549] = 1444333632303356585L;
        w.vxh[550] = 5884650394691165945L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usage() {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("ymm", wbd(int ), (int)500));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1303029849: {
                    v1 = w.vuv("ymn", wbd(int ), (int)501);
                    continue block31;
                }
                case -752740871: {
                    v1 = w.vuv("ymo", wbd(int ), (int)502);
                    continue block31;
                }
                case 1952754353: {
                    break block31;
                }
            }
            break;
        }
        var3_1 = w.c;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(w.vuv("ymq", wbd(int ), (int)504) - w.vuv("ymp", wbd(int ), (int)503));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1898321826: {
                    continue block32;
                }
                case 1952754353: {
                    break block32;
                }
            }
            break;
        }
        var2_2 /* !! */  = w.b;
        v3 /* !! */  = w.bh;
        if (true) ** GOTO lbl29
        block33: while (true) {
            v3 /* !! */  = (long)(v4 - w.vuv("ymr", wbd(int ), (int)505));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1808248883: {
                    v4 = w.vuv("yms", wbd(int ), (int)506);
                    continue block33;
                }
                case 225712922: {
                    v4 = w.vuv("ymt", wbd(int ), (int)507);
                    continue block33;
                }
                case 961455471: {
                    v4 = w.vuv("ymu", wbd(int ), (int)508);
                    continue block33;
                }
                case 1952754353: {
                    break block33;
                }
            }
            break;
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("ymv", wbd(int ), (int)509)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == w.vuv("ymw", vus(int ), (int)952)) break;
                    v5 /* !! */  = (long)w.vuv("ymx", vus(int ), (int)953);
                }
                v6 = class_2561.method_43470((String)"\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .exploit <x> <y> <z> | <\u043d\u0438\u043a> | stop");
                v7 /* !! */  = w.bh;
                if (true) ** GOTO lbl61
                block36: while (true) {
                    v7 /* !! */  = (long)(w.vuv("ymz", wbd(int ), (int)511) - w.vuv("ymy", wbd(int ), (int)510));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 109008803: {
                            continue block36;
                        }
                        case 1952754353: {
                            break block36;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("yna", wbd(int ), (int)512)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == w.vuv("ynb", vus(int ), (int)954)) break;
                    v8 /* !! */  = (long)w.vuv("ync", vus(int ), (int)955);
                }
                v9 = v6.method_27692(class_124.field_1080);
                v10 /* !! */  = w.bh;
                if (true) ** GOTO lbl76
                block38: while (true) {
                    v10 /* !! */  = (long)(w.vuv("yne", wbd(int ), (int)514) - w.vuv("ynd", wbd(int ), (int)513));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1940753190: {
                            continue block38;
                        }
                        case 1952754353: {
                            break block38;
                        }
                    }
                    break;
                }
                this.logDirect(v9);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl85:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)w.vuv("ynf", vus(int ), (int)956);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl90:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)w.vuv("yng", vus(int ), (int)957);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)w.vuv("ynh", vus(int ), (int)958);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)w.vuv("yni", vus(int ), (int)959);
                if (var3_1) {
                    throw null;
                }
            }
lbl103:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)w.vuv("ynj", vus(int ), (int)960);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)w.vuv("ynk", vus(int ), (int)961);
        ** while (!var3_1)
lbl110:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yqg() {
        w.vut[700] = 494210515;
        w.vut[701] = -1101607095;
        w.vut[702] = -101108372;
        w.vut[703] = -1137130562;
        w.vut[704] = -876135718;
        w.vut[705] = -1289363266;
        w.vut[706] = 977357950;
        w.vut[707] = -1891134809;
        w.vut[708] = -2137768815;
        w.vut[709] = -466330765;
        w.vut[710] = -905490134;
        w.vut[711] = -761130060;
        w.vut[712] = -1684467569;
        w.vut[713] = 281051933;
        w.vut[714] = 1436575358;
        w.vut[715] = -1293899471;
        w.vut[716] = -1427978686;
        w.vut[717] = 1799428758;
        w.vut[718] = -1375228503;
        w.vut[719] = -1896591573;
        w.vut[720] = -949978160;
        w.vut[721] = 1013951810;
        w.vut[722] = -1374407961;
        w.vut[723] = -1178096969;
        w.vut[724] = 1219678384;
        w.vut[725] = 1082690884;
        w.vut[726] = 1721215454;
        w.vut[727] = -320396731;
        w.vut[728] = 2125469521;
        w.vut[729] = -559908358;
        w.vut[730] = 1224270360;
        w.vut[731] = -1097659031;
        w.vut[732] = -121322352;
        w.vut[733] = 1669012901;
        w.vut[734] = 866588092;
        w.vut[735] = -935571216;
        w.vut[736] = -1077156603;
        w.vut[737] = -1202921550;
        w.vut[738] = 972125100;
        w.vut[739] = -1986199596;
        w.vut[740] = -1368155622;
        w.vut[741] = 92648388;
        w.vut[742] = 326860246;
        w.vut[743] = 367158175;
        w.vut[744] = 546214613;
        w.vut[745] = -2107979761;
        w.vut[746] = 1566277177;
        w.vut[747] = 46539500;
        w.vut[748] = 1035875650;
        w.vut[749] = -112632127;
        w.vut[750] = -86593062;
        w.vut[751] = -1360554020;
        w.vut[752] = 1641770051;
        w.vut[753] = 2126171412;
        w.vut[754] = -97639183;
        w.vut[755] = 1799836199;
        w.vut[756] = 1274114480;
        w.vut[757] = -748540879;
        w.vut[758] = 1344018404;
        w.vut[759] = -1692371819;
        w.vut[760] = 1915342172;
        w.vut[761] = -110357575;
        w.vut[762] = 566057668;
        w.vut[763] = -1681960906;
        w.vut[764] = 322467791;
        w.vut[765] = 1160479160;
        w.vut[766] = 1987532827;
        w.vut[767] = 87161493;
        w.vut[768] = -1676624952;
        w.vut[769] = -1452108947;
        w.vut[770] = 378778750;
        w.vut[771] = 2048292915;
        w.vut[772] = 1588771379;
        w.vut[773] = -648178728;
        w.vut[774] = -159255321;
        w.vut[775] = -418253600;
        w.vut[776] = -572113662;
        w.vut[777] = -1561870646;
        w.vut[778] = -2142066160;
        w.vut[779] = 2002539801;
        w.vut[780] = 730009993;
        w.vut[781] = -1442070323;
        w.vut[782] = -913257546;
        w.vut[783] = 705049835;
        w.vut[784] = -1342777338;
        w.vut[785] = -668866565;
        w.vut[786] = -292438179;
        w.vut[787] = -1355310277;
        w.vut[788] = -1458661128;
        w.vut[789] = 32315239;
        w.vut[790] = 146771263;
        w.vut[791] = -662173663;
        w.vut[792] = 308707836;
        w.vut[793] = -1110968966;
        w.vut[794] = 1675733462;
        w.vut[795] = -943768665;
        w.vut[796] = -1580498030;
        w.vut[797] = -938921657;
        w.vut[798] = -1565529107;
        w.vut[799] = 2111798324;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wga", wbd(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == w.vuv("wgb", vus(int ), (int)214)) break;
            v0 /* !! */  = (long)w.vuv("wgc", vus(int ), (int)215);
        }
        var3_1 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("wgd", wbd(int ), (int)73));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1634536117: {
                    v2 = w.vuv("wge", wbd(int ), (int)74);
                    continue block16;
                }
                case 1214999382: {
                    v2 = w.vuv("wgf", wbd(int ), (int)75);
                    continue block16;
                }
                case 1952754353: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = w.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wgg", wbd(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == w.vuv("wgh", vus(int ), (int)216)) break;
            v3 /* !! */  = (long)w.vuv("wgi", vus(int ), (int)217);
        }
        var1_3 = w.a;
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
                v4 /* !! */  = w.bh;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(w.vuv("wgk", wbd(int ), (int)78) - w.vuv("wgj", wbd(int ), (int)77));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -37730300: {
                            continue block19;
                        }
                        case 1952754353: {
                            break block19;
                        }
                    }
                    break;
                }
                return List.of("\u041f\u043e\u0448\u0430\u0433\u043e\u0432\u043e \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0430\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430, \u043e\u0431\u0445\u043e\u0434\u044f \u0433\u043b\u0443\u0431\u043e\u043a\u0438\u0435 \u044f\u043c\u044b.", "> exploit <x> <y> <z> - \u043d\u0430\u0447\u0430\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u043a \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c", "> exploit <\u043d\u0438\u043a> - \u043d\u0430\u0447\u0430\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u043a \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u043c\u0443 \u0438\u0433\u0440\u043e\u043a\u0443", "> exploit stop - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u0435");
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)w.vuv("wgl", vus(int ), (int)218);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)w.vuv("wgm", vus(int ), (int)219);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)w.vuv("wgn", vus(int ), (int)220);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)w.vuv("wgo", vus(int ), (int)221);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$tabComplete$2(String var0, String var1_1) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("ynl", wbd(int ), (int)515));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1234281573: {
                    v1 = w.vuv("ynm", wbd(int ), (int)516);
                    continue block30;
                }
                case 1377647622: {
                    v1 = w.vuv("ynn", wbd(int ), (int)517);
                    continue block30;
                }
                case 1839683551: {
                    v1 = w.vuv("yno", wbd(int ), (int)518);
                    continue block30;
                }
                case 1952754353: {
                    break block30;
                }
            }
            break;
        }
        var4_2 = w.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("ynp", wbd(int ), (int)519)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == w.vuv("ynq", vus(int ), (int)962)) break;
            v2 /* !! */  = (long)w.vuv("ynr", vus(int ), (int)963);
        }
        var3_3 /* !! */  = w.b;
        v3 /* !! */  = w.bh;
        if (true) ** GOTO lbl29
        block32: while (true) {
            v3 /* !! */  = (long)(w.vuv("ynt", wbd(int ), (int)521) - w.vuv("yns", wbd(int ), (int)520));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1631838582: {
                    continue block32;
                }
                case 1952754353: {
                    break block32;
                }
            }
            break;
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
            return (boolean)w.vuv("ynu", vus(int ), (int)964);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = w.bh;
                if (true) ** GOTO lbl47
                block34: while (true) {
                    v4 /* !! */  = (long)(w.vuv("ynw", wbd(int ), (int)523) - w.vuv("ynv", wbd(int ), (int)522));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -692180906: {
                            continue block34;
                        }
                        case 1952754353: {
                            break block34;
                        }
                    }
                    break;
                }
                v5 /* !! */  = w.bh;
                if (true) ** GOTO lbl56
                block35: while (true) {
                    v5 /* !! */  = (long)(v6 - w.vuv("ynx", wbd(int ), (int)524));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1305909880: {
                            v6 = w.vuv("yny", wbd(int ), (int)525);
                            continue block35;
                        }
                        case -133454998: {
                            v6 = w.vuv("ynz", wbd(int ), (int)526);
                            continue block35;
                        }
                        case 1635134264: {
                            v6 = w.vuv("yoa", wbd(int ), (int)527);
                            continue block35;
                        }
                        case 1952754353: {
                            break block35;
                        }
                    }
                    break;
                }
                v7 = var1_1.toLowerCase(Locale.ROOT);
                v8 /* !! */  = w.bh;
                if (true) ** GOTO lbl73
                block36: while (true) {
                    v8 /* !! */  = (long)(w.vuv("yoc", wbd(int ), (int)529) - w.vuv("yob", wbd(int ), (int)528));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 1952754353: {
                            break block36;
                        }
                        case 2072439245: {
                            continue block36;
                        }
                    }
                    break;
                }
                return v7.startsWith(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)w.vuv("yod", vus(int ), (int)965);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)w.vuv("yoe", vus(int ), (int)966);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)w.vuv("yof", vus(int ), (int)967);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)w.vuv("yog", vus(int ), (int)968);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ int vus(int n2) {
        return vut[n2] ^ vuu[n2];
    }

    private static /* synthetic */ void yst() {
        w.vuu[400] = -754660246;
        w.vuu[401] = -62246492;
        w.vuu[402] = 429533176;
        w.vuu[403] = -1301962891;
        w.vuu[404] = -1068358733;
        w.vuu[405] = 364646006;
        w.vuu[406] = -842957470;
        w.vuu[407] = 1097568941;
        w.vuu[408] = -491007069;
        w.vuu[409] = 359912143;
        w.vuu[410] = -1035940863;
        w.vuu[411] = -512755182;
        w.vuu[412] = 983146208;
        w.vuu[413] = -25625252;
        w.vuu[414] = -1800739975;
        w.vuu[415] = 1572079336;
        w.vuu[416] = -845896152;
        w.vuu[417] = 937223836;
        w.vuu[418] = -1799938590;
        w.vuu[419] = 608010904;
        w.vuu[420] = 1603488149;
        w.vuu[421] = -667106603;
        w.vuu[422] = 491613355;
        w.vuu[423] = -1648548924;
        w.vuu[424] = -1767155167;
        w.vuu[425] = 1759289500;
        w.vuu[426] = 491216747;
        w.vuu[427] = 1974145647;
        w.vuu[428] = -718015046;
        w.vuu[429] = -1649240021;
        w.vuu[430] = 1109322662;
        w.vuu[431] = -241299442;
        w.vuu[432] = -1730569026;
        w.vuu[433] = -536804148;
        w.vuu[434] = -1574918247;
        w.vuu[435] = 1926654152;
        w.vuu[436] = 1585806021;
        w.vuu[437] = 838439982;
        w.vuu[438] = -1858432923;
        w.vuu[439] = -1821490792;
        w.vuu[440] = -76377490;
        w.vuu[441] = 1454544799;
        w.vuu[442] = 157087393;
        w.vuu[443] = -1282432643;
        w.vuu[444] = 50515538;
        w.vuu[445] = 991919385;
        w.vuu[446] = -1230109278;
        w.vuu[447] = 868514064;
        w.vuu[448] = -551153685;
        w.vuu[449] = 234906583;
        w.vuu[450] = 215227972;
        w.vuu[451] = 16889985;
        w.vuu[452] = 878490569;
        w.vuu[453] = 880497412;
        w.vuu[454] = -2003133571;
        w.vuu[455] = 1561607546;
        w.vuu[456] = 1034198139;
        w.vuu[457] = -367834150;
        w.vuu[458] = -1626708123;
        w.vuu[459] = 1837320955;
        w.vuu[460] = -111921614;
        w.vuu[461] = 1936476381;
        w.vuu[462] = -583704637;
        w.vuu[463] = 1553022863;
        w.vuu[464] = -368393492;
        w.vuu[465] = -1842085588;
        w.vuu[466] = 1262418131;
        w.vuu[467] = 980013975;
        w.vuu[468] = 166339548;
        w.vuu[469] = -1019335709;
        w.vuu[470] = -567100611;
        w.vuu[471] = 1303165555;
        w.vuu[472] = 1898195327;
        w.vuu[473] = 1236912464;
        w.vuu[474] = -1030193897;
        w.vuu[475] = 521154508;
        w.vuu[476] = -1946932282;
        w.vuu[477] = 170850326;
        w.vuu[478] = -1636610982;
        w.vuu[479] = -430457716;
        w.vuu[480] = -1163763404;
        w.vuu[481] = 837075658;
        w.vuu[482] = 29865109;
        w.vuu[483] = -2009837369;
        w.vuu[484] = -1971133051;
        w.vuu[485] = -265671259;
        w.vuu[486] = -324632698;
        w.vuu[487] = -1926383712;
        w.vuu[488] = -1390257918;
        w.vuu[489] = -689397231;
        w.vuu[490] = 1955686633;
        w.vuu[491] = -1053023177;
        w.vuu[492] = 1690160002;
        w.vuu[493] = 1576079198;
        w.vuu[494] = 508745685;
        w.vuu[495] = -537236434;
        w.vuu[496] = -1552286252;
        w.vuu[497] = 251197471;
        w.vuu[498] = -17070676;
        w.vuu[499] = 50091885;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void performMove(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("xdl", wbd(int ), (int)293)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("xdm", vus(int ), (int)602)) break;
            v0 /* !! */  = (long)w.vuv("xdn", vus(int ), (int)603);
        }
        var4_2 = w.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("xdo", wbd(int ), (int)294)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == w.vuv("xdp", vus(int ), (int)604)) break;
            v1 /* !! */  = (long)w.vuv("xdq", vus(int ), (int)605);
        }
        var3_3 /* !! */  = w.b;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl17
        block90: while (true) {
            v2 /* !! */  = (long)(v3 - w.vuv("xdr", wbd(int ), (int)295));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -870460992: {
                    v3 = w.vuv("xds", wbd(int ), (int)296);
                    continue block90;
                }
                case -475767898: {
                    v3 = w.vuv("xdt", wbd(int ), (int)297);
                    continue block90;
                }
                case 627530766: {
                    v3 = w.vuv("xdu", wbd(int ), (int)298);
                    continue block90;
                }
                case 1952754353: {
                    break block90;
                }
            }
            break;
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        v4 /* !! */  = w.bh;
        if (true) ** GOTO lbl39
        block92: while (true) {
            v4 /* !! */  = (long)(w.vuv("xdw", wbd(int ), (int)300) - w.vuv("xdv", wbd(int ), (int)299));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1746743199: {
                    continue block92;
                }
                case 1952754353: {
                    break block92;
                }
            }
            break;
        }
        v5 /* !! */  = w.bh;
        if (true) ** GOTO lbl48
        block93: while (true) {
            v5 /* !! */  = (long)(v6 - w.vuv("xdx", wbd(int ), (int)301));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2006789608: {
                    v6 = w.vuv("xdy", wbd(int ), (int)302);
                    continue block93;
                }
                case -745653254: {
                    v6 = w.vuv("xdz", wbd(int ), (int)303);
                    continue block93;
                }
                case 868730859: {
                    v6 = w.vuv("xea", wbd(int ), (int)304);
                    continue block93;
                }
                case 1952754353: {
                    break block93;
                }
            }
            break;
        }
        v7 = w.mc.field_1724;
        v8 /* !! */  = w.bh;
        if (true) ** GOTO lbl65
        block94: while (true) {
            v8 /* !! */  = (long)(w.vuv("xec", wbd(int ), (int)306) - w.vuv("xeb", wbd(int ), (int)305));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 779853964: {
                    continue block94;
                }
                case 1952754353: {
                    break block94;
                }
            }
            break;
        }
        v9 = v7.field_3944;
        v10 /* !! */  = w.bh;
        if (true) ** GOTO lbl75
        block95: while (true) {
            v10 /* !! */  = (long)(v11 - w.vuv("xed", wbd(int ), (int)307));
lbl75:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -266904730: {
                    v11 = w.vuv("xee", wbd(int ), (int)308);
                    continue block95;
                }
                case 1452620584: {
                    v11 = w.vuv("xef", wbd(int ), (int)309);
                    continue block95;
                }
                case 1952754353: {
                    break block95;
                }
                case 1994975140: {
                    v11 = w.vuv("xeg", wbd(int ), (int)310);
                    continue block95;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("xeh", wbd(int ), (int)311)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == w.vuv("xei", vus(int ), (int)606)) break;
            v12 /* !! */  = (long)w.vuv("xej", vus(int ), (int)607);
        }
        v13 = var1_1.field_1352;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("xek", wbd(int ), (int)312)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == w.vuv("xel", vus(int ), (int)608)) break;
            v14 /* !! */  = (long)w.vuv("xem", vus(int ), (int)609);
        }
        v15 = var1_1.field_1351;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("xen", wbd(int ), (int)313)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == w.vuv("xeo", vus(int ), (int)610)) break;
            v16 /* !! */  = (long)w.vuv("xep", vus(int ), (int)611);
        }
        v17 = var1_1.field_1350;
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("xeq", wbd(int ), (int)314)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == w.vuv("xer", vus(int ), (int)612)) break;
            v18 /* !! */  = (long)w.vuv("xes", vus(int ), (int)613);
        }
        v19 /* !! */  = w.bh;
        if (true) ** GOTO lbl114
        block100: while (true) {
            v19 /* !! */  = (long)(v20 - w.vuv("xet", wbd(int ), (int)315));
lbl114:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -546092085: {
                    v20 = w.vuv("xeu", wbd(int ), (int)316);
                    continue block100;
                }
                case 1191224369: {
                    v20 = w.vuv("xev", wbd(int ), (int)317);
                    continue block100;
                }
                case 1952754353: {
                    break block100;
                }
            }
            break;
        }
        v21 = w.mc.field_1724;
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("xew", wbd(int ), (int)318)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == w.vuv("xex", vus(int ), (int)614)) break;
            v22 /* !! */  = (long)w.vuv("xey", vus(int ), (int)615);
        }
        v23 = v21.method_36454();
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_7 = w.bh - w.vuv("xez", wbd(int ), (int)319)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == w.vuv("xfa", vus(int ), (int)616)) break;
            v24 /* !! */  = (long)w.vuv("xfb", vus(int ), (int)617);
        }
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_8 = w.bh - w.vuv("xfc", wbd(int ), (int)320)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == w.vuv("xfd", vus(int ), (int)618)) break;
            v25 /* !! */  = (long)w.vuv("xfe", vus(int ), (int)619);
        }
        v26 = w.mc.field_1724;
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_9 = w.bh - w.vuv("xff", wbd(int ), (int)321)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == w.vuv("xfg", vus(int ), (int)620)) break;
            v27 /* !! */  = (long)w.vuv("xfh", vus(int ), (int)621);
        }
        v28 = v26.method_36455();
        v29 = w.vuv("xfi", vus(int ), (int)622);
        v30 = w.vuv("xfj", vus(int ), (int)623);
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_10 = w.bh - w.vuv("xfk", wbd(int ), (int)322)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == w.vuv("xfl", vus(int ), (int)624)) break;
            v31 /* !! */  = (long)w.vuv("xfm", vus(int ), (int)625);
        }
        v32 = new class_2828.class_2830(v13, v15, v17, v23, v28, (boolean)v29, (boolean)v30);
        v33 /* !! */  = w.bh;
        if (true) ** GOTO lbl159
        block106: while (true) {
            v33 /* !! */  = (long)(v34 - w.vuv("xfn", wbd(int ), (int)323));
lbl159:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case 405916621: {
                    v34 = w.vuv("xfo", wbd(int ), (int)324);
                    continue block106;
                }
                case 486152589: {
                    v34 = w.vuv("xfp", wbd(int ), (int)325);
                    continue block106;
                }
                case 1952754353: {
                    break block106;
                }
            }
            break;
        }
        v9.method_52787((class_2596)v32);
        if (var2_4 || var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v35 /* !! */  = w.bh;
                if (true) ** GOTO lbl177
                block107: while (true) {
                    v35 /* !! */  = (long)(w.vuv("xfr", wbd(int ), (int)327) - w.vuv("xfq", wbd(int ), (int)326));
lbl177:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1592889334: {
                            continue block107;
                        }
                        case 1952754353: {
                            break block107;
                        }
                    }
                    break;
                }
                v36 /* !! */  = w.bh;
                if (true) ** GOTO lbl186
                block108: while (true) {
                    v36 /* !! */  = (long)(v37 - w.vuv("xfs", wbd(int ), (int)328));
lbl186:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -112087632: {
                            v37 = w.vuv("xft", wbd(int ), (int)329);
                            continue block108;
                        }
                        case 1028716016: {
                            v37 = w.vuv("xfu", wbd(int ), (int)330);
                            continue block108;
                        }
                        case 1546310368: {
                            v37 = w.vuv("xfv", wbd(int ), (int)331);
                            continue block108;
                        }
                        case 1952754353: {
                            break block108;
                        }
                    }
                    break;
                }
                v38 = w.mc.field_1724;
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_11 = w.bh - w.vuv("xfw", wbd(int ), (int)332)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == w.vuv("xfx", vus(int ), (int)626)) break;
                    v39 /* !! */  = (long)w.vuv("xfy", vus(int ), (int)627);
                }
                v40 = var1_1.field_1352;
                v41 /* !! */  = w.bh;
                if (true) ** GOTO lbl209
                block110: while (true) {
                    v41 /* !! */  = (long)(w.vuv("xga", wbd(int ), (int)334) - w.vuv("xfz", wbd(int ), (int)333));
lbl209:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -791622033: {
                            continue block110;
                        }
                        case 1952754353: {
                            break block110;
                        }
                    }
                    break;
                }
                v42 = var1_1.field_1351;
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_12 = w.bh - w.vuv("xgb", wbd(int ), (int)335)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == w.vuv("xgc", vus(int ), (int)628)) break;
                    v43 /* !! */  = (long)w.vuv("xgd", vus(int ), (int)629);
                }
                v44 = var1_1.field_1350;
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_13 = w.bh - w.vuv("xge", wbd(int ), (int)336)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == w.vuv("xgf", vus(int ), (int)630)) break;
                    v45 /* !! */  = (long)w.vuv("xgg", vus(int ), (int)631);
                }
                v38.method_5814(v40, v42, v44);
                if (var2_4 || var2_4) ** GOTO lbl32
                v46 /* !! */  = w.bh;
                if (true) ** GOTO lbl232
                block113: while (true) {
                    v46 /* !! */  = (long)(v47 - w.vuv("xgh", wbd(int ), (int)337));
lbl232:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -2074508132: {
                            v47 = w.vuv("xgi", wbd(int ), (int)338);
                            continue block113;
                        }
                        case -1710892649: {
                            v47 = w.vuv("xgj", wbd(int ), (int)339);
                            continue block113;
                        }
                        case 1952754353: {
                            break block113;
                        }
                    }
                    break;
                }
                v48 /* !! */  = w.bh;
                if (true) ** GOTO lbl245
                block114: while (true) {
                    v48 /* !! */  = (long)(v49 - w.vuv("xgk", wbd(int ), (int)340));
lbl245:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -460421571: {
                            v49 = w.vuv("xgl", wbd(int ), (int)341);
                            continue block114;
                        }
                        case 512497772: {
                            v49 = w.vuv("xgm", wbd(int ), (int)342);
                            continue block114;
                        }
                        case 1952754353: {
                            break block114;
                        }
                    }
                    break;
                }
                v50 = w.mc.field_1724;
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_14 = w.bh - w.vuv("xgn", wbd(int ), (int)343)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == w.vuv("xgo", vus(int ), (int)632)) break;
                    v51 /* !! */  = (long)w.vuv("xgp", vus(int ), (int)633);
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_15 = w.bh - w.vuv("xgq", wbd(int ), (int)344)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == w.vuv("xgr", vus(int ), (int)634)) break;
                    v52 /* !! */  = (long)w.vuv("xgs", vus(int ), (int)635);
                }
                v50.method_18799(class_243.field_1353);
                if (var2_4 || var2_4) ** GOTO lbl32
                v53 /* !! */  = w.bh;
                if (true) ** GOTO lbl271
                block117: while (true) {
                    v53 /* !! */  = (long)(w.vuv("xgu", wbd(int ), (int)346) - w.vuv("xgt", wbd(int ), (int)345));
lbl271:
                    // 2 sources

                    switch ((int)v53 /* !! */ ) {
                        case -1498441035: {
                            continue block117;
                        }
                        case 1952754353: {
                            break block117;
                        }
                    }
                    break;
                }
                v54 /* !! */  = w.bh;
                if (true) ** GOTO lbl280
                block118: while (true) {
                    v54 /* !! */  = (long)(v55 - w.vuv("xgv", wbd(int ), (int)347));
lbl280:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1314562659: {
                            v55 = w.vuv("xgw", wbd(int ), (int)348);
                            continue block118;
                        }
                        case -1206958552: {
                            v55 = w.vuv("xgx", wbd(int ), (int)349);
                            continue block118;
                        }
                        case -1132366848: {
                            v55 = w.vuv("xgy", wbd(int ), (int)350);
                            continue block118;
                        }
                        case 1952754353: {
                            break block118;
                        }
                    }
                    break;
                }
                v56 = w.mc.field_1724;
                v57 /* !! */  = w.bh;
                if (true) ** GOTO lbl297
                block119: while (true) {
                    v57 /* !! */  = (long)(w.vuv("xha", wbd(int ), (int)352) - w.vuv("xgz", wbd(int ), (int)351));
lbl297:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -564254899: {
                            continue block119;
                        }
                        case 1952754353: {
                            break block119;
                        }
                    }
                    break;
                }
                v56.field_6017 = 0.0;
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl305:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)w.vuv("xhb", vus(int ), (int)636);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl310:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)w.vuv("xhc", vus(int ), (int)637);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 2: {
                var3_3 /* !! */  = (int)w.vuv("xhd", vus(int ), (int)638);
                if (!var4_2) ** GOTO lbl305
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)w.vuv("xhe", vus(int ), (int)639);
                if (!var4_2) break;
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)w.vuv("xhf", vus(int ), (int)640);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl338
                    break;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)w.vuv("xhg", vus(int ), (int)641);
                if (!var4_2) ** GOTO lbl305
                throw null;
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)w.vuv("xhh", vus(int ), (int)642);
                } while (!var4_2);
                throw null;
            }
lbl338:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)w.vuv("xhi", vus(int ), (int)643);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl343:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)w.vuv("xhj", vus(int ), (int)644);
                if (!var4_2) ** GOTO lbl338
                throw null;
            }
lbl347:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)w.vuv("xhk", vus(int ), (int)645);
                if (!var4_2) ** GOTO lbl310
                throw null;
            }
lbl351:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)w.vuv("xhl", vus(int ), (int)646);
                if (!var4_2) ** GOTO lbl347
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)w.vuv("xhm", vus(int ), (int)647);
        ** while (!var4_2)
lbl358:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSolid(class_2338 var1_1) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("xbj", wbd(int ), (int)262));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1726361345: {
                    v1 = w.vuv("xbk", wbd(int ), (int)263);
                    continue block59;
                }
                case 754559783: {
                    v1 = w.vuv("xbl", wbd(int ), (int)264);
                    continue block59;
                }
                case 808949563: {
                    v1 = w.vuv("xbm", wbd(int ), (int)265);
                    continue block59;
                }
                case 1952754353: {
                    break block59;
                }
            }
            break;
        }
        var5_2 = w.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("xbn", wbd(int ), (int)266)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == w.vuv("xbo", vus(int ), (int)579)) break;
            v2 /* !! */  = (long)w.vuv("xbp", vus(int ), (int)580);
        }
        var4_3 /* !! */  = w.b;
        v3 /* !! */  = w.bh;
        if (true) ** GOTO lbl28
        block61: while (true) {
            v3 /* !! */  = (long)(v4 - w.vuv("xbq", wbd(int ), (int)267));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1552115957: {
                    v4 = w.vuv("xbr", wbd(int ), (int)268);
                    continue block61;
                }
                case 1410699693: {
                    v4 = w.vuv("xbs", wbd(int ), (int)269);
                    continue block61;
                }
                case 1952754353: {
                    break block61;
                }
            }
            break;
        }
        var3_4 = w.a;
        if (var5_2) {
            throw null;
lbl40:
            // 7 sources

            return (boolean)w.vuv("xbt", vus(int ), (int)581);
        }
        if (var3_4) ** GOTO lbl40
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl40
                v5 /* !! */  = w.bh;
                if (true) ** GOTO lbl51
                block63: while (true) {
                    v5 /* !! */  = (long)(v6 - w.vuv("xbu", wbd(int ), (int)270));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 62419529: {
                            v6 = w.vuv("xbv", wbd(int ), (int)271);
                            continue block63;
                        }
                        case 84823746: {
                            v6 = w.vuv("xbw", wbd(int ), (int)272);
                            continue block63;
                        }
                        case 1952754353: {
                            break block63;
                        }
                    }
                    break;
                }
                v7 /* !! */  = w.bh;
                if (true) ** GOTO lbl64
                block64: while (true) {
                    v7 /* !! */  = (long)(v8 - w.vuv("xbx", wbd(int ), (int)273));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -636270089: {
                            v8 = w.vuv("xby", wbd(int ), (int)274);
                            continue block64;
                        }
                        case -331830346: {
                            v8 = w.vuv("xbz", wbd(int ), (int)275);
                            continue block64;
                        }
                        case 1952754353: {
                            break block64;
                        }
                    }
                    break;
                }
                v9 = w.mc.field_1687;
                v10 /* !! */  = w.bh;
                if (true) ** GOTO lbl78
                block65: while (true) {
                    v10 /* !! */  = (long)(v11 - w.vuv("xca", wbd(int ), (int)276));
lbl78:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 514982344: {
                            v11 = w.vuv("xcb", wbd(int ), (int)277);
                            continue block65;
                        }
                        case 1793477886: {
                            v11 = w.vuv("xcc", wbd(int ), (int)278);
                            continue block65;
                        }
                        case 1952754353: {
                            break block65;
                        }
                    }
                    break;
                }
                var2_5 = v9.method_8320(var1_1);
                if (var3_4 || var3_4) ** GOTO lbl40
                v12 /* !! */  = w.bh;
                if (true) ** GOTO lbl93
                block66: while (true) {
                    v12 /* !! */  = (long)(v13 - w.vuv("xcd", wbd(int ), (int)279));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2015805988: {
                            v13 = w.vuv("xce", wbd(int ), (int)280);
                            continue block66;
                        }
                        case -608376165: {
                            v13 = w.vuv("xcf", wbd(int ), (int)281);
                            continue block66;
                        }
                        case 1952754353: {
                            break block66;
                        }
                    }
                    break;
                }
                if (var2_5.method_26215()) ** GOTO lbl164
                if (var3_4) ** GOTO lbl40
                v14 /* !! */  = w.bh;
                if (true) ** GOTO lbl108
                block67: while (true) {
                    v14 /* !! */  = (long)(w.vuv("xch", wbd(int ), (int)283) - w.vuv("xcg", wbd(int ), (int)282));
lbl108:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1667262284: {
                            continue block67;
                        }
                        case 1952754353: {
                            break block67;
                        }
                    }
                    break;
                }
                v15 = var2_5.method_26227();
                v16 /* !! */  = w.bh;
                if (true) ** GOTO lbl118
                block68: while (true) {
                    v16 /* !! */  = (long)(w.vuv("xcj", wbd(int ), (int)285) - w.vuv("xci", wbd(int ), (int)284));
lbl118:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1401655747: {
                            continue block68;
                        }
                        case 1952754353: {
                            break block68;
                        }
                    }
                    break;
                }
                if (!v15.method_15769()) ** GOTO lbl164
                if (var3_4) ** GOTO lbl40
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("xck", wbd(int ), (int)286)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == w.vuv("xcl", vus(int ), (int)582)) break;
                    v17 /* !! */  = (long)w.vuv("xcm", vus(int ), (int)583);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("xcn", wbd(int ), (int)287)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == w.vuv("xco", vus(int ), (int)584)) break;
                    v18 /* !! */  = (long)w.vuv("xcp", vus(int ), (int)585);
                }
                v19 = w.mc.field_1687;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("xcq", wbd(int ), (int)288)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == w.vuv("xcr", vus(int ), (int)586)) break;
                    v20 /* !! */  = (long)w.vuv("xcs", vus(int ), (int)587);
                }
                v21 = var2_5.method_26220((class_1922)v19, var1_1);
                v22 /* !! */  = w.bh;
                if (true) ** GOTO lbl146
                block72: while (true) {
                    v22 /* !! */  = (long)(v23 - w.vuv("xct", wbd(int ), (int)289));
lbl146:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -79410869: {
                            v23 = w.vuv("xcu", wbd(int ), (int)290);
                            continue block72;
                        }
                        case 898954298: {
                            v23 = w.vuv("xcv", wbd(int ), (int)291);
                            continue block72;
                        }
                        case 1517094077: {
                            v23 = w.vuv("xcw", wbd(int ), (int)292);
                            continue block72;
                        }
                        case 1952754353: {
                            break block72;
                        }
                    }
                    break;
                }
                if (v21.method_1110()) ** GOTO lbl164
                if (var3_4) ** GOTO lbl40
                v24 = w.vuv("xcx", vus(int ), (int)588);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl167
lbl164:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                v24 = w.vuv("xcy", vus(int ), (int)589);
lbl167:
                // 2 sources

                return (boolean)v24;
            }
lbl168:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)w.vuv("xcz", vus(int ), (int)590);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl173:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)w.vuv("xda", vus(int ), (int)591);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl178:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)w.vuv("xdb", vus(int ), (int)592);
                if (var5_2) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)w.vuv("xdc", vus(int ), (int)593);
                    if (!var5_2) ** GOTO lbl178
                    throw null;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)w.vuv("xdd", vus(int ), (int)594);
                if (!var5_2) ** GOTO lbl173
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)w.vuv("xde", vus(int ), (int)595);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 6: {
                var4_3 /* !! */  = (int)w.vuv("xdf", vus(int ), (int)596);
                if (!var5_2) ** GOTO lbl168
                throw null;
            }
lbl200:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)w.vuv("xdg", vus(int ), (int)597);
                if (!var5_2) ** GOTO lbl173
                throw null;
            }
lbl204:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)w.vuv("xdh", vus(int ), (int)598);
                if (!var5_2) break;
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)w.vuv("xdi", vus(int ), (int)599);
                if (var5_2) {
                    throw null;
                }
            }
            case 10: {
                var4_3 /* !! */  = (int)w.vuv("xdj", vus(int ), (int)600);
                if (!var5_2) break;
                throw null;
            }
            case 11: 
        }
        var4_3 /* !! */  = (int)w.vuv("xdk", vus(int ), (int)601);
        ** while (!var5_2)
lbl219:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yqu() {
        w.vut[900] = -576040794;
        w.vut[901] = 363441078;
        w.vut[902] = 789965711;
        w.vut[903] = 1773034575;
        w.vut[904] = 2077872582;
        w.vut[905] = -1471619074;
        w.vut[906] = 143088540;
        w.vut[907] = 74346880;
        w.vut[908] = -1009402734;
        w.vut[909] = -1877611506;
        w.vut[910] = 41781326;
        w.vut[911] = 416132358;
        w.vut[912] = -1503539248;
        w.vut[913] = 17675394;
        w.vut[914] = -142718791;
        w.vut[915] = 2038628541;
        w.vut[916] = 1515490027;
        w.vut[917] = 1655134319;
        w.vut[918] = -566636156;
        w.vut[919] = 1365634468;
        w.vut[920] = -512881780;
        w.vut[921] = -502198102;
        w.vut[922] = -923107495;
        w.vut[923] = -1503270735;
        w.vut[924] = -1496685352;
        w.vut[925] = -458847724;
        w.vut[926] = -390524448;
        w.vut[927] = -1822959353;
        w.vut[928] = -1860671402;
        w.vut[929] = 1086699635;
        w.vut[930] = 2118218928;
        w.vut[931] = 1947997284;
        w.vut[932] = -2056153092;
        w.vut[933] = -1959047324;
        w.vut[934] = 583150572;
        w.vut[935] = -1174573003;
        w.vut[936] = -1474492367;
        w.vut[937] = -2081237165;
        w.vut[938] = 225286895;
        w.vut[939] = -353577581;
        w.vut[940] = -35846270;
        w.vut[941] = -1799438765;
        w.vut[942] = 277673698;
        w.vut[943] = -1090760293;
        w.vut[944] = -1416226710;
        w.vut[945] = -874229054;
        w.vut[946] = -1982770370;
        w.vut[947] = -1210856103;
        w.vut[948] = 1176086446;
        w.vut[949] = -1261226066;
        w.vut[950] = -226965718;
        w.vut[951] = -1851204308;
        w.vut[952] = -2125447022;
        w.vut[953] = -1484216093;
        w.vut[954] = 275254277;
        w.vut[955] = 1973734332;
        w.vut[956] = 298369215;
        w.vut[957] = 1475738607;
        w.vut[958] = 520991126;
        w.vut[959] = -297049935;
        w.vut[960] = -899016990;
        w.vut[961] = 2112193516;
        w.vut[962] = 93417385;
        w.vut[963] = 1403360800;
        w.vut[964] = -979871141;
        w.vut[965] = 137793199;
        w.vut[966] = 754776531;
        w.vut[967] = 1090017868;
        w.vut[968] = -1173925020;
        w.vut[969] = -1997604193;
        w.vut[970] = 77376333;
        w.vut[971] = -697414125;
        w.vut[972] = -1869463309;
        w.vut[973] = 1487208267;
        w.vut[974] = -98522162;
        w.vut[975] = -1635576531;
        w.vut[976] = 217446511;
        w.vut[977] = -1623646968;
        w.vut[978] = -137808781;
        w.vut[979] = -928120339;
        w.vut[980] = 1472996676;
        w.vut[981] = 1867666901;
        w.vut[982] = 1285476571;
        w.vut[983] = 115369417;
        w.vut[984] = -1328276490;
        w.vut[985] = -1677129779;
        w.vut[986] = -495605170;
        w.vut[987] = -1725655737;
        w.vut[988] = 58809146;
        w.vut[989] = -748147529;
        w.vut[990] = -493727409;
        w.vut[991] = 936050459;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getRealSurfaceY(double var1_1, double var3_2) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block56: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("wvn", wbd(int ), (int)222));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1604499309: {
                    v1 = w.vuv("wvo", wbd(int ), (int)223);
                    continue block56;
                }
                case 1952754353: {
                    break block56;
                }
                case 1990752320: {
                    v1 = w.vuv("wvp", wbd(int ), (int)224);
                    continue block56;
                }
            }
            break;
        }
        var12_3 = w.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wvq", wbd(int ), (int)225)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == w.vuv("wvr", vus(int ), (int)467)) break;
            v2 /* !! */  = (long)w.vuv("wvs", vus(int ), (int)468);
        }
        var11_4 /* !! */  = w.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wvt", wbd(int ), (int)226)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == w.vuv("wvu", vus(int ), (int)469)) break;
            v3 /* !! */  = (long)w.vuv("wvv", vus(int ), (int)470);
        }
        var10_5 = w.a;
        if (var12_3) {
            throw null;
lbl29:
            // 12 sources

            return (double)w.vuv("wvw", vxf(int ), (int)227);
        }
        if (var10_5 || var10_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wvx", wbd(int ), (int)228)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == w.vuv("wvy", vus(int ), (int)471)) break;
            v4 /* !! */  = (long)w.vuv("wvz", vus(int ), (int)472);
        }
        var5_6 = (int)Math.floor(var1_1);
        if (var10_5 || var10_5) ** GOTO lbl29
        v5 /* !! */  = w.bh;
        if (true) ** GOTO lbl43
        block61: while (true) {
            v5 /* !! */  = (long)(v6 - w.vuv("wwa", wbd(int ), (int)229));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1327456751: {
                    v6 = w.vuv("wwb", wbd(int ), (int)230);
                    continue block61;
                }
                case -893220746: {
                    v6 = w.vuv("wwc", wbd(int ), (int)231);
                    continue block61;
                }
                case 1025865456: {
                    v6 = w.vuv("wwd", wbd(int ), (int)232);
                    continue block61;
                }
                case 1952754353: {
                    break block61;
                }
            }
            break;
        }
        var6_7 = (int)Math.floor(var3_2);
        if (var10_5 || var10_5) ** GOTO lbl29
        v7 /* !! */  = w.bh;
        if (true) ** GOTO lbl61
        block62: while (true) {
            v7 /* !! */  = (long)(w.vuv("wwf", wbd(int ), (int)234) - w.vuv("wwe", wbd(int ), (int)233));
lbl61:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 91208420: {
                    continue block62;
                }
                case 1952754353: {
                    break block62;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wwg", wbd(int ), (int)235)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == w.vuv("wwh", vus(int ), (int)473)) break;
            v8 /* !! */  = (long)w.vuv("wwi", vus(int ), (int)474);
        }
        v9 = w.mc.field_1687;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wwj", wbd(int ), (int)236)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == w.vuv("wwk", vus(int ), (int)475)) break;
            v10 /* !! */  = (long)w.vuv("wwl", vus(int ), (int)476);
        }
        var7_8 = v9.method_31600();
        if (var10_5 || var10_5) ** GOTO lbl29
        v11 /* !! */  = w.bh;
        if (true) ** GOTO lbl83
        block65: while (true) {
            v11 /* !! */  = (long)(v12 - w.vuv("wwm", wbd(int ), (int)237));
lbl83:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1191205156: {
                    v12 = w.vuv("wwn", wbd(int ), (int)238);
                    continue block65;
                }
                case 1668106541: {
                    v12 = w.vuv("wwo", wbd(int ), (int)239);
                    continue block65;
                }
                case 1952754353: {
                    break block65;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("wwp", wbd(int ), (int)240)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == w.vuv("wwq", vus(int ), (int)477)) break;
            v13 /* !! */  = (long)w.vuv("wwr", vus(int ), (int)478);
        }
        v14 = w.mc.field_1687;
        v15 /* !! */  = w.bh;
        if (true) ** GOTO lbl102
        block67: while (true) {
            v15 /* !! */  = (long)(v16 - w.vuv("wws", wbd(int ), (int)241));
lbl102:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -995697906: {
                    v16 = w.vuv("wwt", wbd(int ), (int)242);
                    continue block67;
                }
                case 94095751: {
                    v16 = w.vuv("wwu", wbd(int ), (int)243);
                    continue block67;
                }
                case 1952754353: {
                    break block67;
                }
            }
            break;
        }
        var8_9 = v14.method_31607();
        if (var10_5 || var10_5) ** GOTO lbl29
        var9_10 = var7_8;
        if (var10_5) ** GOTO lbl29
        if (var11_4 /* !! */  == 0) ** GOTO lbl-1000
        block25 : switch (var11_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                do {
                    if (var10_5 || var10_5) ** GOTO lbl29
                    if (var9_10 < var8_9) ** GOTO lbl150
                    if (var10_5 || var10_5) ** GOTO lbl29
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("wwv", wbd(int ), (int)244)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == w.vuv("www", vus(int ), (int)479)) break;
                        v17 /* !! */  = (long)w.vuv("wwx", vus(int ), (int)480);
                    }
                    v18 /* !! */  = w.bh;
                    if (true) ** GOTO lbl131
                    block70: while (true) {
                        v18 /* !! */  = (long)(w.vuv("wwz", wbd(int ), (int)246) - w.vuv("wwy", wbd(int ), (int)245));
lbl131:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case 106202451: {
                                continue block70;
                            }
                            case 1952754353: {
                                break block70;
                            }
                        }
                        break;
                    }
                    v19 = new class_2338(var5_6, var9_10, var6_7);
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_7 = w.bh - w.vuv("wxa", wbd(int ), (int)247)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == w.vuv("wxb", vus(int ), (int)481)) break;
                        v20 /* !! */  = (long)w.vuv("wxc", vus(int ), (int)482);
                    }
                    if (!this.isSolid(v19)) ** GOTO lbl145
                    if (var10_5 || var10_5) ** GOTO lbl29
                    return (double)var9_10 + 1.0;
lbl145:
                    // 1 sources

                    if (var10_5 || var10_5) ** GOTO lbl29
                    --var9_10;
                    if (var10_5) ** GOTO lbl29
                } while (!var12_3);
                throw null;
lbl150:
                // 1 sources

                if (!var10_5 && !var10_5) ** break;
                ** continue;
                return (double)var8_9 + 1.0;
            }
            case 0: {
                do {
                    var11_4 /* !! */  = (int)w.vuv("wxd", vus(int ), (int)483);
                } while (!var12_3);
                throw null;
            }
            case 1: {
                var11_4 /* !! */  = (int)w.vuv("wxe", vus(int ), (int)484);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl163:
            // 2 sources

            case 2: {
                var11_4 /* !! */  = (int)w.vuv("wxf", vus(int ), (int)485);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 3: {
                var11_4 /* !! */  = (int)w.vuv("wxg", vus(int ), (int)486);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl173:
            // 2 sources

            case 4: {
                var11_4 /* !! */  = (int)w.vuv("wxh", vus(int ), (int)487);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl178:
            // 3 sources

            case 5: {
                var11_4 /* !! */  = (int)w.vuv("wxi", vus(int ), (int)488);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl183:
            // 2 sources

            case 6: {
                var11_4 /* !! */  = (int)w.vuv("wxj", vus(int ), (int)489);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 7: {
                var11_4 /* !! */  = (int)w.vuv("wxk", vus(int ), (int)490);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 8: {
                var11_4 /* !! */  = (int)w.vuv("wxl", vus(int ), (int)491);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl198:
            // 2 sources

            case 9: {
                var11_4 /* !! */  = (int)w.vuv("wxm", vus(int ), (int)492);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 10: {
                var11_4 /* !! */  = (int)w.vuv("wxn", vus(int ), (int)493);
                if (!var12_3) ** GOTO lbl178
                throw null;
            }
            case 11: {
                var11_4 /* !! */  = (int)w.vuv("wxo", vus(int ), (int)494);
                if (var12_3) {
                    throw null;
                }
            }
lbl211:
            // 4 sources

            case 12: {
                var11_4 /* !! */  = (int)w.vuv("wxp", vus(int ), (int)495);
                if (!var12_3) ** GOTO lbl178
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_4 /* !! */  = (int)w.vuv("wxq", vus(int ), (int)496);
                    if (!var12_3) break block25;
                    throw null;
                }
            }
lbl220:
            // 3 sources

            case 14: {
                var11_4 /* !! */  = (int)w.vuv("wxr", vus(int ), (int)497);
                if (!var12_3) ** GOTO lbl163
                throw null;
            }
lbl224:
            // 2 sources

            case 15: {
                var11_4 /* !! */  = (int)w.vuv("wxs", vus(int ), (int)498);
                if (!var12_3) ** GOTO lbl211
                throw null;
            }
lbl228:
            // 2 sources

            case 16: {
                var11_4 /* !! */  = (int)w.vuv("wxt", vus(int ), (int)499);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl233:
            // 3 sources

            case 17: {
                do {
                    var11_4 /* !! */  = (int)w.vuv("wxu", vus(int ), (int)500);
                } while (!var12_3);
                throw null;
            }
lbl238:
            // 2 sources

            case 18: {
                var11_4 /* !! */  = (int)w.vuv("wxv", vus(int ), (int)501);
                if (!var12_3) ** GOTO lbl198
                throw null;
            }
lbl242:
            // 2 sources

            case 19: {
                var11_4 /* !! */  = (int)w.vuv("wxw", vus(int ), (int)502);
                if (var12_3) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 20: {
                var11_4 /* !! */  = (int)w.vuv("wxx", vus(int ), (int)503);
                if (!var12_3) ** GOTO lbl224
                throw null;
            }
lbl251:
            // 3 sources

            case 21: {
                var11_4 /* !! */  = (int)w.vuv("wxy", vus(int ), (int)504);
                if (var12_3) {
                    throw null;
                }
            }
lbl255:
            // 4 sources

            case 22: {
                var11_4 /* !! */  = (int)w.vuv("wxz", vus(int ), (int)505);
                if (!var12_3) ** GOTO lbl251
                throw null;
            }
lbl259:
            // 2 sources

            case 23: {
                var11_4 /* !! */  = (int)w.vuv("wya", vus(int ), (int)506);
                if (!var12_3) ** GOTO lbl251
                throw null;
            }
            case 24: 
        }
        var11_4 /* !! */  = (int)w.vuv("wyb", vus(int ), (int)507);
        ** while (!var12_3)
lbl266:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yqd() {
        w.vut[400] = -754660228;
        w.vut[401] = -62246478;
        w.vut[402] = 429533161;
        w.vut[403] = -1301962889;
        w.vut[404] = -1068358729;
        w.vut[405] = 364645986;
        w.vut[406] = -842957448;
        w.vut[407] = 1097568948;
        w.vut[408] = -491007056;
        w.vut[409] = 359912130;
        w.vut[410] = -1035940851;
        w.vut[411] = -512755192;
        w.vut[412] = 983146176;
        w.vut[413] = -25625250;
        w.vut[414] = -1800739981;
        w.vut[415] = 1572079357;
        w.vut[416] = -845896146;
        w.vut[417] = 937223837;
        w.vut[418] = -1799938589;
        w.vut[419] = 608010888;
        w.vut[420] = 1603488133;
        w.vut[421] = -667106593;
        w.vut[422] = 491613353;
        w.vut[423] = -1648548906;
        w.vut[424] = -1767155160;
        w.vut[425] = -1759289501;
        w.vut[426] = -2141184837;
        w.vut[427] = -1974145648;
        w.vut[428] = -470053760;
        w.vut[429] = 1649240020;
        w.vut[430] = 607607774;
        w.vut[431] = 241299441;
        w.vut[432] = -1597776883;
        w.vut[433] = 536804147;
        w.vut[434] = -1875668956;
        w.vut[435] = -1926654153;
        w.vut[436] = -2104266445;
        w.vut[437] = -838439983;
        w.vut[438] = -1705398989;
        w.vut[439] = 1821490791;
        w.vut[440] = 1952126584;
        w.vut[441] = -1454544800;
        w.vut[442] = -128181196;
        w.vut[443] = 1282432642;
        w.vut[444] = -479046116;
        w.vut[445] = 991919376;
        w.vut[446] = -1230109275;
        w.vut[447] = 868514079;
        w.vut[448] = -551153691;
        w.vut[449] = 234906562;
        w.vut[450] = 215227988;
        w.vut[451] = 16889989;
        w.vut[452] = 878490564;
        w.vut[453] = 880497408;
        w.vut[454] = -2003133572;
        w.vut[455] = 1561607539;
        w.vut[456] = 1034198137;
        w.vut[457] = -367834154;
        w.vut[458] = -1626708127;
        w.vut[459] = 1837320943;
        w.vut[460] = -111921610;
        w.vut[461] = 1936476364;
        w.vut[462] = -583704628;
        w.vut[463] = 1553022878;
        w.vut[464] = -368393500;
        w.vut[465] = -1842085570;
        w.vut[466] = 1262418131;
        w.vut[467] = -980013976;
        w.vut[468] = -1138700507;
        w.vut[469] = 1019335708;
        w.vut[470] = -1005699659;
        w.vut[471] = -1303165556;
        w.vut[472] = 974058265;
        w.vut[473] = -1236912465;
        w.vut[474] = -1498958273;
        w.vut[475] = -521154509;
        w.vut[476] = 497417741;
        w.vut[477] = -170850327;
        w.vut[478] = 972067142;
        w.vut[479] = 430457715;
        w.vut[480] = -263857667;
        w.vut[481] = -837075659;
        w.vut[482] = 1849683567;
        w.vut[483] = -2009837375;
        w.vut[484] = -1971133041;
        w.vut[485] = -265671260;
        w.vut[486] = -324632702;
        w.vut[487] = -1926383696;
        w.vut[488] = -1390257914;
        w.vut[489] = -689397245;
        w.vut[490] = 1955686650;
        w.vut[491] = -1053023177;
        w.vut[492] = 1690160011;
        w.vut[493] = 1576079188;
        w.vut[494] = 508745694;
        w.vut[495] = -537236448;
        w.vut[496] = -1552286252;
        w.vut[497] = 251197464;
        w.vut[498] = -17070680;
        w.vut[499] = 50091882;
    }

    private static /* synthetic */ void yqf() {
        w.vut[600] = -2008491075;
        w.vut[601] = 1108577934;
        w.vut[602] = 808930186;
        w.vut[603] = -866721590;
        w.vut[604] = -1990225523;
        w.vut[605] = 1098645881;
        w.vut[606] = -1921069417;
        w.vut[607] = -966711534;
        w.vut[608] = 1608067360;
        w.vut[609] = -1273566986;
        w.vut[610] = -778363789;
        w.vut[611] = -261124673;
        w.vut[612] = 1791720236;
        w.vut[613] = -1869434394;
        w.vut[614] = 1171044708;
        w.vut[615] = 924712742;
        w.vut[616] = 2013371228;
        w.vut[617] = 610536566;
        w.vut[618] = 362065251;
        w.vut[619] = -1162476169;
        w.vut[620] = 2026391990;
        w.vut[621] = -857699244;
        w.vut[622] = 498724269;
        w.vut[623] = -1309642703;
        w.vut[624] = -1362383366;
        w.vut[625] = 134236151;
        w.vut[626] = 1702722230;
        w.vut[627] = -1168366744;
        w.vut[628] = 1497755426;
        w.vut[629] = 901556577;
        w.vut[630] = 1850037651;
        w.vut[631] = 492176852;
        w.vut[632] = 300685354;
        w.vut[633] = 467354919;
        w.vut[634] = -1498854362;
        w.vut[635] = -1979745401;
        w.vut[636] = -1716371938;
        w.vut[637] = 831304858;
        w.vut[638] = -1068202469;
        w.vut[639] = -885528210;
        w.vut[640] = 2139046689;
        w.vut[641] = -1729273855;
        w.vut[642] = -1441339567;
        w.vut[643] = -2009420354;
        w.vut[644] = -2017272035;
        w.vut[645] = 495780841;
        w.vut[646] = 397275042;
        w.vut[647] = 931514216;
        w.vut[648] = 1784670037;
        w.vut[649] = 476793565;
        w.vut[650] = -1248702417;
        w.vut[651] = -810293171;
        w.vut[652] = 1124581510;
        w.vut[653] = 984645297;
        w.vut[654] = -388584144;
        w.vut[655] = -569262646;
        w.vut[656] = 1022379682;
        w.vut[657] = -1493710614;
        w.vut[658] = -1341959519;
        w.vut[659] = -28563034;
        w.vut[660] = -1879058563;
        w.vut[661] = 2038894751;
        w.vut[662] = -1445745519;
        w.vut[663] = 1378376768;
        w.vut[664] = 977059530;
        w.vut[665] = 1487604574;
        w.vut[666] = 697286735;
        w.vut[667] = 1308332819;
        w.vut[668] = -1126009562;
        w.vut[669] = -977875544;
        w.vut[670] = -633910140;
        w.vut[671] = 1151976129;
        w.vut[672] = 869363075;
        w.vut[673] = 2100008568;
        w.vut[674] = -53301283;
        w.vut[675] = 2036726457;
        w.vut[676] = -453542509;
        w.vut[677] = -1703686793;
        w.vut[678] = -2049503199;
        w.vut[679] = 685236670;
        w.vut[680] = -2054176200;
        w.vut[681] = -826099236;
        w.vut[682] = -858780039;
        w.vut[683] = -1820794112;
        w.vut[684] = -1926949351;
        w.vut[685] = -1134222749;
        w.vut[686] = -1837556190;
        w.vut[687] = -1687006823;
        w.vut[688] = 822598176;
        w.vut[689] = -740405318;
        w.vut[690] = 930018137;
        w.vut[691] = 1392976298;
        w.vut[692] = -1766844306;
        w.vut[693] = -974119593;
        w.vut[694] = -851207756;
        w.vut[695] = 103351126;
        w.vut[696] = 1267810808;
        w.vut[697] = 610539482;
        w.vut[698] = -1421465072;
        w.vut[699] = -1283327199;
    }

    static {
        vut = new int[992];
        vuu = new int[992];
        w.ypz();
        w.yqa();
        w.yqb();
        w.yqc();
        w.yqd();
        w.yqe();
        w.yqf();
        w.yqg();
        w.yqi();
        w.yqu();
        w.yrc();
        w.yro();
        w.yrt();
        w.ysi();
        w.yst();
        w.yte();
        w.ytr();
        w.yue();
        w.yur();
        w.yvc();
        vxg = new long[551];
        vxh = new long[551];
        w.yvp();
        w.ywc();
        w.ywm();
        w.ywv();
        w.yww();
        w.ywx();
        w.ywy();
        w.ywz();
        w.yxa();
        w.yxb();
        w.yxc();
        w.yxd();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(cy var1_1) {
        block169: {
            block168: {
                var19_2 = w.c;
                var18_3 /* !! */  = w.b;
                var17_4 = w.a;
                if (var19_2) {
                    throw null;
lbl6:
                    // 44 sources

                    return;
                }
                if (var17_4 || var17_4) ** GOTO lbl6
                if (!this.active) break block168;
                if (var17_4) ** GOTO lbl6
                if (this.destination == null) break block168;
                if (var17_4) ** GOTO lbl6
                if (w.mc.field_1724 == null) break block168;
                if (var17_4) ** GOTO lbl6
                if (w.mc.field_1687 != null) break block169;
                if (var17_4) ** GOTO lbl6
            }
            if (var17_4 || var17_4) ** GOTO lbl6
            return;
        }
        if (var17_4) ** GOTO lbl6
        if (var18_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var17_4) ** GOTO lbl6
                if (!gm.shouldPauseAutomation()) ** GOTO lbl31
                if (var17_4 || var17_4) ** GOTO lbl6
                w.mc.field_1724.method_18799(class_243.field_1353);
                if (var17_4 || var17_4) ** GOTO lbl6
                return;
lbl31:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                if (!this.directAutomatedRoute) ** GOTO lbl37
                if (var17_4 || var17_4) ** GOTO lbl6
                this.tickDirectAutomatedRoute();
                if (var17_4 || var17_4) ** GOTO lbl6
                return;
lbl37:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                if (this.waitTicks <= 0) ** GOTO lbl45
                if (var17_4 || var17_4) ** GOTO lbl6
                this.waitTicks -= w.vuv("vxe", vus(int ), (int)60);
                if (var17_4 || var17_4) ** GOTO lbl6
                w.mc.field_1724.method_18799(class_243.field_1353);
                if (var17_4 || var17_4) ** GOTO lbl6
                return;
lbl45:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                var2_5 = w.mc.field_1724.method_73189();
                if (var17_4 || var17_4) ** GOTO lbl6
                var3_6 = Math.hypot(this.destination.field_1352 - var2_5.field_1352, this.destination.field_1350 - var2_5.field_1350);
                if (var17_4 || var17_4) ** GOTO lbl6
                if (!(var3_6 < w.vuv("vxi", vxf(int ), (int)0))) ** GOTO lbl61
                if (var17_4 || var17_4) ** GOTO lbl6
                this.active = w.vuv("vxj", vus(int ), (int)61);
                if (var17_4 || var17_4) ** GOTO lbl6
                w.mc.field_1724.method_18799(class_243.field_1353);
                if (var17_4 || var17_4) ** GOTO lbl6
                w.mc.field_1724.field_6017 = 0.0;
                if (var17_4 || var17_4) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)"\u041f\u0440\u0438\u0431\u044b\u043b\u0438! ").method_27692(class_124.field_1060).method_10852((class_2561)class_2561.method_43470((String)("(" + this.stepCount + " \u0448\u0430\u0433\u043e\u0432)")).method_27692(class_124.field_1080)));
                if (var17_4 || var17_4) ** GOTO lbl6
                return;
lbl61:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                var5_7 = this.destination.method_1020(var2_5).method_1029();
                if (var17_4 || var17_4) ** GOTO lbl6
                var6_8 = Math.min(var3_6, ThreadLocalRandom.current().nextDouble((double)w.vuv("vxk", vxf(int ), (int)1), (double)w.vuv("vxl", vxf(int ), (int)2)));
                if (var17_4 || var17_4) ** GOTO lbl6
                var8_9 = ThreadLocalRandom.current().nextDouble((double)w.vuv("vxm", vxf(int ), (int)3), (double)w.vuv("vxn", vxf(int ), (int)4));
                if (var17_4 || var17_4) ** GOTO lbl6
                var10_10 = new class_243(-var5_7.field_1350, 0.0, var5_7.field_1352).method_1021(var8_9);
                if (var17_4 || var17_4) ** GOTO lbl6
                var11_11 = var2_5.method_1019(var5_7.method_1021(var6_8)).method_1019(var10_10);
                if (var17_4 || var17_4) ** GOTO lbl6
                if (!this.isHole(var11_11.field_1352, var11_11.field_1350, var2_5.field_1351)) ** GOTO lbl76
                if (var17_4 || var17_4) ** GOTO lbl6
                var11_11 = this.bypassHole(var2_5, var11_11);
                if (var17_4) ** GOTO lbl6
lbl76:
                // 2 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                var12_12 = this.getRealSurfaceY(var11_11.field_1352, var11_11.field_1350);
                if (var17_4 || var17_4) ** GOTO lbl6
                if (!(var12_12 - var2_5.field_1351 > w.vuv("vxo", vxf(int ), (int)5))) ** GOTO lbl85
                if (var17_4) ** GOTO lbl6
                v0 = w.vuv("vxp", vus(int ), (int)62);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl87
lbl85:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                v0 = var14_13 = w.vuv("vxq", vus(int ), (int)63);
lbl87:
                // 2 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                if (var14_13 == false) ** GOTO lbl94
                if (var17_4 || var17_4) ** GOTO lbl6
                v1 = this.findFullBuriedY(var11_11.field_1352, var11_11.field_1350);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl96
lbl94:
                // 1 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                v1 = var15_14 = var12_12 - w.vuv("vxr", vxf(int ), (int)6);
lbl96:
                // 2 sources

                if (var17_4 || var17_4) ** GOTO lbl6
                this.performMove(new class_243(var11_11.field_1352, var15_14, var11_11.field_1350));
                if (var17_4 || var17_4) ** GOTO lbl6
                this.stepCount += w.vuv("vxs", vus(int ), (int)64);
                if (var17_4 || var17_4) ** GOTO lbl6
                this.waitTicks = ThreadLocalRandom.current().nextInt((int)w.vuv("vxt", vus(int ), (int)65), (int)w.vuv("vxu", vus(int ), (int)66));
                if (!var17_4 && !var17_4) ** break;
                ** continue;
                return;
            }
lbl105:
            // 2 sources

            case 0: {
                var18_3 /* !! */  = (int)w.vuv("vxv", vus(int ), (int)67);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl110:
            // 2 sources

            case 1: {
                var18_3 /* !! */  = (int)w.vuv("vxw", vus(int ), (int)68);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl115:
            // 2 sources

            case 2: {
                var18_3 /* !! */  = (int)w.vuv("vxx", vus(int ), (int)69);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl120:
            // 2 sources

            case 3: {
                var18_3 /* !! */  = (int)w.vuv("vxy", vus(int ), (int)70);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 4: {
                var18_3 /* !! */  = (int)w.vuv("vxz", vus(int ), (int)71);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl484
            }
            case 5: {
                var18_3 /* !! */  = (int)w.vuv("vya", vus(int ), (int)72);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 6: {
                var18_3 /* !! */  = (int)w.vuv("vyb", vus(int ), (int)73);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl140:
            // 2 sources

            case 7: {
                var18_3 /* !! */  = (int)w.vuv("vyc", vus(int ), (int)74);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
lbl145:
            // 3 sources

            case 8: {
                var18_3 /* !! */  = (int)w.vuv("vyd", vus(int ), (int)75);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl480
            }
lbl150:
            // 3 sources

            case 9: {
                var18_3 /* !! */  = (int)w.vuv("vye", vus(int ), (int)76);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl155:
            // 2 sources

            case 10: {
                var18_3 /* !! */  = (int)w.vuv("vyf", vus(int ), (int)77);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl160:
            // 2 sources

            case 11: {
                var18_3 /* !! */  = (int)w.vuv("vyg", vus(int ), (int)78);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 12: {
                var18_3 /* !! */  = (int)w.vuv("vyh", vus(int ), (int)79);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 13: {
                var18_3 /* !! */  = (int)w.vuv("vyi", vus(int ), (int)80);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl175:
            // 2 sources

            case 14: {
                var18_3 /* !! */  = (int)w.vuv("vyj", vus(int ), (int)81);
                if (!var19_2) ** GOTO lbl145
                throw null;
            }
lbl179:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_3 /* !! */  = (int)w.vuv("vyk", vus(int ), (int)82);
                    if (!var19_2) ** GOTO lbl120
                    throw null;
                }
            }
lbl184:
            // 3 sources

            case 16: {
                var18_3 /* !! */  = (int)w.vuv("vyl", vus(int ), (int)83);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl484
            }
lbl189:
            // 5 sources

            case 17: {
                var18_3 /* !! */  = (int)w.vuv("vym", vus(int ), (int)84);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl480
            }
lbl194:
            // 2 sources

            case 18: {
                var18_3 /* !! */  = (int)w.vuv("vyn", vus(int ), (int)85);
                if (!var19_2) ** GOTO lbl189
                throw null;
            }
lbl198:
            // 2 sources

            case 19: {
                var18_3 /* !! */  = (int)w.vuv("vyo", vus(int ), (int)86);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
            case 20: {
                var18_3 /* !! */  = (int)w.vuv("vyp", vus(int ), (int)87);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 21: {
                var18_3 /* !! */  = (int)w.vuv("vyq", vus(int ), (int)88);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl213:
            // 3 sources

            case 22: {
                do {
                    var18_3 /* !! */  = (int)w.vuv("vyr", vus(int ), (int)89);
                } while (!var19_2);
                throw null;
            }
            case 23: {
                var18_3 /* !! */  = (int)w.vuv("vys", vus(int ), (int)90);
                if (!var19_2) ** GOTO lbl115
                throw null;
            }
lbl222:
            // 3 sources

            case 24: {
                var18_3 /* !! */  = (int)w.vuv("vyt", vus(int ), (int)91);
                if (!var19_2) ** GOTO lbl194
                throw null;
            }
lbl226:
            // 4 sources

            case 25: {
                var18_3 /* !! */  = (int)w.vuv("vyu", vus(int ), (int)92);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl231:
            // 2 sources

            case 26: {
                var18_3 /* !! */  = (int)w.vuv("vyv", vus(int ), (int)93);
                if (!var19_2) ** GOTO lbl222
                throw null;
            }
lbl235:
            // 2 sources

            case 27: {
                var18_3 /* !! */  = (int)w.vuv("vyw", vus(int ), (int)94);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl240:
            // 3 sources

            case 28: {
                var18_3 /* !! */  = (int)w.vuv("vyx", vus(int ), (int)95);
                if (!var19_2) ** GOTO lbl213
                throw null;
            }
lbl244:
            // 2 sources

            case 29: {
                var18_3 /* !! */  = (int)w.vuv("vyy", vus(int ), (int)96);
                if (!var19_2) ** GOTO lbl226
                throw null;
            }
lbl248:
            // 2 sources

            case 30: {
                var18_3 /* !! */  = (int)w.vuv("vyz", vus(int ), (int)97);
                if (!var19_2) ** GOTO lbl240
                throw null;
            }
lbl252:
            // 3 sources

            case 31: {
                var18_3 /* !! */  = (int)w.vuv("vza", vus(int ), (int)98);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl257:
            // 2 sources

            case 32: {
                var18_3 /* !! */  = (int)w.vuv("vzb", vus(int ), (int)99);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl262:
            // 2 sources

            case 33: {
                var18_3 /* !! */  = (int)w.vuv("vzc", vus(int ), (int)100);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl267:
            // 3 sources

            case 34: {
                var18_3 /* !! */  = (int)w.vuv("vzd", vus(int ), (int)101);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl272:
            // 2 sources

            case 35: {
                var18_3 /* !! */  = (int)w.vuv("vze", vus(int ), (int)102);
                if (!var19_2) ** GOTO lbl189
                throw null;
            }
            case 36: {
                var18_3 /* !! */  = (int)w.vuv("vzf", vus(int ), (int)103);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 37: {
                var18_3 /* !! */  = (int)w.vuv("vzg", vus(int ), (int)104);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl464
            }
lbl286:
            // 2 sources

            case 38: {
                var18_3 /* !! */  = (int)w.vuv("vzh", vus(int ), (int)105);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 39: {
                var18_3 /* !! */  = (int)w.vuv("vzi", vus(int ), (int)106);
                if (!var19_2) ** GOTO lbl267
                throw null;
            }
lbl295:
            // 2 sources

            case 40: {
                var18_3 /* !! */  = (int)w.vuv("vzj", vus(int ), (int)107);
                if (!var19_2) ** GOTO lbl105
                throw null;
            }
            case 41: {
                var18_3 /* !! */  = (int)w.vuv("vzk", vus(int ), (int)108);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl304:
            // 2 sources

            case 42: {
                var18_3 /* !! */  = (int)w.vuv("vzl", vus(int ), (int)109);
                if (!var19_2) ** GOTO lbl272
                throw null;
            }
lbl308:
            // 2 sources

            case 43: {
                var18_3 /* !! */  = (int)w.vuv("vzm", vus(int ), (int)110);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
            case 44: {
                var18_3 /* !! */  = (int)w.vuv("vzn", vus(int ), (int)111);
                if (!var19_2) ** GOTO lbl222
                throw null;
            }
lbl317:
            // 2 sources

            case 45: {
                var18_3 /* !! */  = (int)w.vuv("vzo", vus(int ), (int)112);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl452
            }
            case 46: {
                var18_3 /* !! */  = (int)w.vuv("vzp", vus(int ), (int)113);
                if (!var19_2) ** GOTO lbl179
                throw null;
            }
lbl326:
            // 2 sources

            case 47: {
                var18_3 /* !! */  = (int)w.vuv("vzq", vus(int ), (int)114);
                if (!var19_2) ** GOTO lbl213
                throw null;
            }
            case 48: {
                var18_3 /* !! */  = (int)w.vuv("vzr", vus(int ), (int)115);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
            case 49: {
                var18_3 /* !! */  = (int)w.vuv("vzs", vus(int ), (int)116);
                if (!var19_2) ** GOTO lbl326
                throw null;
            }
lbl339:
            // 3 sources

            case 50: {
                var18_3 /* !! */  = (int)w.vuv("vzt", vus(int ), (int)117);
                if (!var19_2) ** GOTO lbl189
                throw null;
            }
lbl343:
            // 3 sources

            case 51: {
                var18_3 /* !! */  = (int)w.vuv("vzu", vus(int ), (int)118);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl348:
            // 3 sources

            case 52: {
                var18_3 /* !! */  = (int)w.vuv("vzv", vus(int ), (int)119);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl353:
            // 2 sources

            case 53: {
                var18_3 /* !! */  = (int)w.vuv("vzw", vus(int ), (int)120);
                if (!var19_2) ** GOTO lbl110
                throw null;
            }
lbl357:
            // 2 sources

            case 54: {
                var18_3 /* !! */  = (int)w.vuv("vzx", vus(int ), (int)121);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
            case 55: {
                var18_3 /* !! */  = (int)w.vuv("vzy", vus(int ), (int)122);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl367:
            // 3 sources

            case 56: {
                var18_3 /* !! */  = (int)w.vuv("vzz", vus(int ), (int)123);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
lbl372:
            // 2 sources

            case 57: {
                var18_3 /* !! */  = (int)w.vuv("waa", vus(int ), (int)124);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl452
            }
lbl377:
            // 2 sources

            case 58: {
                var18_3 /* !! */  = (int)w.vuv("wab", vus(int ), (int)125);
                if (!var19_2) ** GOTO lbl252
                throw null;
            }
lbl381:
            // 2 sources

            case 59: {
                var18_3 /* !! */  = (int)w.vuv("wac", vus(int ), (int)126);
                if (!var19_2) ** GOTO lbl150
                throw null;
            }
            case 60: {
                var18_3 /* !! */  = (int)w.vuv("wad", vus(int ), (int)127);
                if (!var19_2) ** GOTO lbl226
                throw null;
            }
            case 61: {
                var18_3 /* !! */  = (int)w.vuv("wae", vus(int ), (int)128);
                if (!var19_2) ** GOTO lbl267
                throw null;
            }
            case 62: {
                var18_3 /* !! */  = (int)w.vuv("waf", vus(int ), (int)129);
                if (!var19_2) ** GOTO lbl244
                throw null;
            }
            case 63: {
                var18_3 /* !! */  = (int)w.vuv("wag", vus(int ), (int)130);
                if (!var19_2) ** GOTO lbl372
                throw null;
            }
lbl401:
            // 3 sources

            case 64: {
                var18_3 /* !! */  = (int)w.vuv("wah", vus(int ), (int)131);
                if (!var19_2) ** GOTO lbl231
                throw null;
            }
lbl405:
            // 2 sources

            case 65: {
                var18_3 /* !! */  = (int)w.vuv("wai", vus(int ), (int)132);
                if (!var19_2) ** GOTO lbl184
                throw null;
            }
            case 66: {
                var18_3 /* !! */  = (int)w.vuv("waj", vus(int ), (int)133);
                if (!var19_2) ** GOTO lbl160
                throw null;
            }
            case 67: {
                var18_3 /* !! */  = (int)w.vuv("wak", vus(int ), (int)134);
                if (!var19_2) ** GOTO lbl248
                throw null;
            }
lbl417:
            // 2 sources

            case 68: {
                var18_3 /* !! */  = (int)w.vuv("wal", vus(int ), (int)135);
                if (!var19_2) ** GOTO lbl198
                throw null;
            }
lbl421:
            // 2 sources

            case 69: {
                var18_3 /* !! */  = (int)w.vuv("wam", vus(int ), (int)136);
                if (!var19_2) ** GOTO lbl155
                throw null;
            }
lbl425:
            // 2 sources

            case 70: {
                var18_3 /* !! */  = (int)w.vuv("wan", vus(int ), (int)137);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl472
            }
            case 71: {
                var18_3 /* !! */  = (int)w.vuv("wao", vus(int ), (int)138);
                if (!var19_2) ** GOTO lbl401
                throw null;
            }
            case 72: {
                var18_3 /* !! */  = (int)w.vuv("wap", vus(int ), (int)139);
                if (!var19_2) ** GOTO lbl405
                throw null;
            }
            case 73: {
                var18_3 /* !! */  = (int)w.vuv("waq", vus(int ), (int)140);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl480
            }
            case 74: {
                var18_3 /* !! */  = (int)w.vuv("war", vus(int ), (int)141);
                if (!var19_2) ** GOTO lbl184
                throw null;
            }
            case 75: {
                var18_3 /* !! */  = (int)w.vuv("was", vus(int ), (int)142);
                if (var19_2) {
                    throw null;
                }
                ** GOTO lbl456
            }
lbl452:
            // 3 sources

            case 76: {
                var18_3 /* !! */  = (int)w.vuv("wat", vus(int ), (int)143);
                if (!var19_2) ** GOTO lbl235
                throw null;
            }
lbl456:
            // 8 sources

            case 77: {
                var18_3 /* !! */  = (int)w.vuv("wau", vus(int ), (int)144);
                if (!var19_2) ** GOTO lbl421
                throw null;
            }
            case 78: {
                var18_3 /* !! */  = (int)w.vuv("wav", vus(int ), (int)145);
                if (!var19_2) ** GOTO lbl150
                throw null;
            }
lbl464:
            // 2 sources

            case 79: {
                var18_3 /* !! */  = (int)w.vuv("waw", vus(int ), (int)146);
                if (!var19_2) ** GOTO lbl456
                throw null;
            }
lbl468:
            // 2 sources

            case 80: {
                var18_3 /* !! */  = (int)w.vuv("wax", vus(int ), (int)147);
                if (!var19_2) ** GOTO lbl145
                throw null;
            }
lbl472:
            // 2 sources

            case 81: {
                var18_3 /* !! */  = (int)w.vuv("way", vus(int ), (int)148);
                if (!var19_2) ** GOTO lbl468
                throw null;
            }
lbl476:
            // 2 sources

            case 82: {
                var18_3 /* !! */  = (int)w.vuv("waz", vus(int ), (int)149);
                if (!var19_2) ** GOTO lbl140
                throw null;
            }
lbl480:
            // 4 sources

            case 83: {
                var18_3 /* !! */  = (int)w.vuv("wba", vus(int ), (int)150);
                if (!var19_2) ** GOTO lbl476
                throw null;
            }
lbl484:
            // 3 sources

            case 84: {
                var18_3 /* !! */  = (int)w.vuv("wbb", vus(int ), (int)151);
                if (!var19_2) ** GOTO lbl189
                throw null;
            }
            case 85: 
        }
        var18_3 /* !! */  = (int)w.vuv("wbc", vus(int ), (int)152);
        ** while (!var19_2)
lbl491:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double vxf(int n2) {
        return Double.longBitsToDouble(vxg[n2] ^ vxh[n2]);
    }

    private static /* synthetic */ long wbd(int n2) {
        return vxg[n2] ^ vxh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        block97: {
            block96: {
                block95: {
                    var6_3 = w.c;
                    var5_4 /* !! */  = w.b;
                    var4_5 = w.a;
                    if (var6_3) {
                        throw null;
lbl6:
                        // 28 sources

                        return;
                    }
                    if (var4_5 || var4_5) ** GOTO lbl6
                    if (var2_2.length != w.vuv("vuz", vus(int ), (int)3)) break block95;
                    if (var4_5) ** GOTO lbl6
                    if (!w.isStopArgument(var2_2[0])) break block95;
                    if (var4_5 || var4_5) ** GOTO lbl6
                    this.stop((boolean)w.vuv("vva", vus(int ), (int)4));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    return;
                }
                if (var4_5 || var4_5) ** GOTO lbl6
                if (w.mc.field_1724 == null) break block96;
                if (var4_5) ** GOTO lbl6
                if (w.mc.field_1687 != null) break block97;
                if (var4_5) ** GOTO lbl6
            }
            if (var4_5 || var4_5) ** GOTO lbl6
            this.logDirect(class_2561.method_43470((String)"\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430 \u0442\u043e\u043b\u044c\u043a\u043e \u0432 \u043c\u0438\u0440\u0435.").method_27692(class_124.field_1061));
            if (var4_5 || var4_5) ** GOTO lbl6
            return;
        }
        if (var4_5) ** GOTO lbl6
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl6
                if (var2_2.length != w.vuv("vvb", vus(int ), (int)5)) ** GOTO lbl51
                if (var4_5 || var4_5) ** GOTO lbl6
                var3_6 = this.findPlayer(var2_2[0]);
                if (var4_5 || var4_5) ** GOTO lbl6
                if (var3_6 == null) ** GOTO lbl41
                if (var4_5) ** GOTO lbl6
                if (var3_6 != w.mc.field_1724) ** GOTO lbl45
                if (var4_5) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)("\u0418\u0433\u0440\u043e\u043a \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d: " + var2_2[0])).method_27692(class_124.field_1061));
                if (var4_5 || var4_5) ** GOTO lbl6
                return;
lbl45:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                this.start(var3_6.method_73189());
                if (var4_5 || var4_5) ** GOTO lbl6
                this.logDirect(class_2561.method_43470((String)"TP \u043a \u0438\u0433\u0440\u043e\u043a\u0443 ").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)var3_6.method_7334().name()).method_27692(class_124.field_1068)));
                if (var4_5 || var4_5) ** GOTO lbl6
                return;
lbl51:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                if (var2_2.length != w.vuv("vvc", vus(int ), (int)6)) ** GOTO lbl67
                if (var4_5) ** GOTO lbl6
                try {
                    if (var4_5) ** GOTO lbl6
                    this.start(new class_243(w.parse(var2_2[0]), w.parse(var2_2[1]), w.parse(var2_2[2])));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    v0 = new Object[3];
                    v0[w.vuv("vvd", vus(int ), (int)7)] = this.destination.field_1352;
                    v0[w.vuv("vve", vus(int ), (int)8)] = this.destination.field_1351;
                    v0[w.vuv("vvf", vus(int ), (int)9)] = this.destination.field_1350;
                    this.logDirect(class_2561.method_43470((String)String.format(Locale.ROOT, "TP -> %.0f %.0f %.0f", v0)).method_27692(class_124.field_1060));
                    if (var4_5 || var4_5) ** GOTO lbl6
                    return;
                }
                catch (NumberFormatException var3_7) {
                    if (var4_5) ** GOTO lbl6
                }
lbl67:
                // 2 sources

                if (var4_5 || var4_5) ** GOTO lbl6
                this.usage();
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)w.vuv("vvg", vus(int ), (int)10);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 1: {
                var5_4 /* !! */  = (int)w.vuv("vvh", vus(int ), (int)11);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl82:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)w.vuv("vvi", vus(int ), (int)12);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl87:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)w.vuv("vvj", vus(int ), (int)13);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl92:
            // 3 sources

            case 4: {
                var5_4 /* !! */  = (int)w.vuv("vvk", vus(int ), (int)14);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 5: {
                var5_4 /* !! */  = (int)w.vuv("vvl", vus(int ), (int)15);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 6: {
                var5_4 /* !! */  = (int)w.vuv("vvm", vus(int ), (int)16);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl107:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)w.vuv("vvn", vus(int ), (int)17);
                if (!var6_3) ** GOTO lbl87
                throw null;
            }
lbl111:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)w.vuv("vvo", vus(int ), (int)18);
                if (!var6_3) ** GOTO lbl92
                throw null;
            }
lbl115:
            // 3 sources

            case 9: {
                var5_4 /* !! */  = (int)w.vuv("vvp", vus(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl120:
            // 3 sources

            case 10: {
                var5_4 /* !! */  = (int)w.vuv("vvq", vus(int ), (int)20);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl125:
            // 4 sources

            case 11: {
                var5_4 /* !! */  = (int)w.vuv("vvr", vus(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl130:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)w.vuv("vvs", vus(int ), (int)22);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 13: {
                var5_4 /* !! */  = (int)w.vuv("vvt", vus(int ), (int)23);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl140:
            // 4 sources

            case 14: {
                var5_4 /* !! */  = (int)w.vuv("vvu", vus(int ), (int)24);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl145:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)w.vuv("vvv", vus(int ), (int)25);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl150:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)w.vuv("vvw", vus(int ), (int)26);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl155:
            // 2 sources

            case 17: {
                var5_4 /* !! */  = (int)w.vuv("vvx", vus(int ), (int)27);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl160:
            // 2 sources

            case 18: {
                var5_4 /* !! */  = (int)w.vuv("vvy", vus(int ), (int)28);
                if (!var6_3) ** GOTO lbl150
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)w.vuv("vvz", vus(int ), (int)29);
                    if (!var6_3) ** GOTO lbl155
                    throw null;
                }
            }
            case 20: {
                var5_4 /* !! */  = (int)w.vuv("vwa", vus(int ), (int)30);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 21: {
                var5_4 /* !! */  = (int)w.vuv("vwb", vus(int ), (int)31);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl179:
            // 4 sources

            case 22: {
                var5_4 /* !! */  = (int)w.vuv("vwc", vus(int ), (int)32);
                if (!var6_3) ** GOTO lbl120
                throw null;
            }
lbl183:
            // 3 sources

            case 23: {
                var5_4 /* !! */  = (int)w.vuv("vwd", vus(int ), (int)33);
                if (!var6_3) ** GOTO lbl111
                throw null;
            }
            case 24: {
                var5_4 /* !! */  = (int)w.vuv("vwe", vus(int ), (int)34);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 25: {
                var5_4 /* !! */  = (int)w.vuv("vwf", vus(int ), (int)35);
                if (!var6_3) break;
                throw null;
            }
            case 26: {
                var5_4 /* !! */  = (int)w.vuv("vwg", vus(int ), (int)36);
                if (!var6_3) ** GOTO lbl125
                throw null;
            }
            case 27: {
                var5_4 /* !! */  = (int)w.vuv("vwh", vus(int ), (int)37);
                if (!var6_3) ** GOTO lbl179
                throw null;
            }
            case 28: {
                var5_4 /* !! */  = (int)w.vuv("vwi", vus(int ), (int)38);
                if (!var6_3) ** GOTO lbl160
                throw null;
            }
            case 29: {
                var5_4 /* !! */  = (int)w.vuv("vwj", vus(int ), (int)39);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl213:
            // 4 sources

            case 30: {
                var5_4 /* !! */  = (int)w.vuv("vwk", vus(int ), (int)40);
                if (!var6_3) ** GOTO lbl130
                throw null;
            }
lbl217:
            // 2 sources

            case 31: {
                var5_4 /* !! */  = (int)w.vuv("vwl", vus(int ), (int)41);
                if (!var6_3) ** GOTO lbl92
                throw null;
            }
            case 32: {
                var5_4 /* !! */  = (int)w.vuv("vwm", vus(int ), (int)42);
                if (!var6_3) ** GOTO lbl179
                throw null;
            }
            case 33: {
                var5_4 /* !! */  = (int)w.vuv("vwn", vus(int ), (int)43);
                if (!var6_3) ** GOTO lbl125
                throw null;
            }
            case 34: {
                var5_4 /* !! */  = (int)w.vuv("vwo", vus(int ), (int)44);
                if (!var6_3) ** GOTO lbl82
                throw null;
            }
            case 35: {
                do {
                    var5_4 /* !! */  = (int)w.vuv("vwp", vus(int ), (int)45);
                } while (!var6_3);
                throw null;
            }
            case 36: {
                var5_4 /* !! */  = (int)w.vuv("vwq", vus(int ), (int)46);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl243:
            // 2 sources

            case 37: {
                var5_4 /* !! */  = (int)w.vuv("vwr", vus(int ), (int)47);
                if (!var6_3) ** GOTO lbl140
                throw null;
            }
            case 38: {
                var5_4 /* !! */  = (int)w.vuv("vws", vus(int ), (int)48);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl252:
            // 2 sources

            case 39: {
                var5_4 /* !! */  = (int)w.vuv("vwt", vus(int ), (int)49);
                if (!var6_3) ** GOTO lbl120
                throw null;
            }
lbl256:
            // 2 sources

            case 40: {
                var5_4 /* !! */  = (int)w.vuv("vwu", vus(int ), (int)50);
                if (!var6_3) ** GOTO lbl125
                throw null;
            }
lbl260:
            // 4 sources

            case 41: {
                var5_4 /* !! */  = (int)w.vuv("vwv", vus(int ), (int)51);
                if (!var6_3) ** GOTO lbl179
                throw null;
            }
lbl264:
            // 3 sources

            case 42: {
                var5_4 /* !! */  = (int)w.vuv("vww", vus(int ), (int)52);
                if (!var6_3) ** GOTO lbl140
                throw null;
            }
lbl268:
            // 2 sources

            case 43: {
                var5_4 /* !! */  = (int)w.vuv("vwx", vus(int ), (int)53);
                if (!var6_3) break;
                throw null;
            }
lbl272:
            // 3 sources

            case 44: {
                var5_4 /* !! */  = (int)w.vuv("vwy", vus(int ), (int)54);
                if (!var6_3) ** GOTO lbl260
                throw null;
            }
            case 45: {
                var5_4 /* !! */  = (int)w.vuv("vwz", vus(int ), (int)55);
                if (!var6_3) ** GOTO lbl107
                throw null;
            }
lbl280:
            // 4 sources

            case 46: {
                var5_4 /* !! */  = (int)w.vuv("vxa", vus(int ), (int)56);
                if (!var6_3) ** GOTO lbl111
                throw null;
            }
lbl284:
            // 2 sources

            case 47: {
                var5_4 /* !! */  = (int)w.vuv("vxb", vus(int ), (int)57);
                if (!var6_3) ** GOTO lbl145
                throw null;
            }
            case 48: {
                var5_4 /* !! */  = (int)w.vuv("vxc", vus(int ), (int)58);
                if (!var6_3) ** GOTO lbl140
                throw null;
            }
            case 49: 
        }
        var5_4 /* !! */  = (int)w.vuv("vxd", vus(int ), (int)59);
        ** while (!var6_3)
lbl295:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yqb() {
        w.vut[200] = -2006138809;
        w.vut[201] = 22841346;
        w.vut[202] = 1902852099;
        w.vut[203] = -1242522168;
        w.vut[204] = 426150445;
        w.vut[205] = 1584584870;
        w.vut[206] = -2146850556;
        w.vut[207] = -328233152;
        w.vut[208] = 117842225;
        w.vut[209] = 1368715189;
        w.vut[210] = 112645309;
        w.vut[211] = -1191517726;
        w.vut[212] = 1604939690;
        w.vut[213] = 1145425516;
        w.vut[214] = -1955522393;
        w.vut[215] = -863885696;
        w.vut[216] = -751840301;
        w.vut[217] = 887240385;
        w.vut[218] = 462501114;
        w.vut[219] = 137454181;
        w.vut[220] = 38790671;
        w.vut[221] = -1290349670;
        w.vut[222] = 1301477611;
        w.vut[223] = 80824801;
        w.vut[224] = -1724880349;
        w.vut[225] = -420754088;
        w.vut[226] = 834136175;
        w.vut[227] = -1016782695;
        w.vut[228] = -639349424;
        w.vut[229] = -471957295;
        w.vut[230] = 249033431;
        w.vut[231] = 1973655898;
        w.vut[232] = 44255382;
        w.vut[233] = 580231492;
        w.vut[234] = 2093340208;
        w.vut[235] = 1536517681;
        w.vut[236] = -1546361726;
        w.vut[237] = 904550385;
        w.vut[238] = -2092351246;
        w.vut[239] = -1955625971;
        w.vut[240] = 1384991111;
        w.vut[241] = -56015873;
        w.vut[242] = -730707480;
        w.vut[243] = -405905725;
        w.vut[244] = 1020704425;
        w.vut[245] = -1364914368;
        w.vut[246] = -351905709;
        w.vut[247] = -1705476710;
        w.vut[248] = -998520490;
        w.vut[249] = 594564751;
        w.vut[250] = -848724216;
        w.vut[251] = -2138006171;
        w.vut[252] = 795682481;
        w.vut[253] = -179998022;
        w.vut[254] = -1047784185;
        w.vut[255] = 67688713;
        w.vut[256] = 509751267;
        w.vut[257] = 619031759;
        w.vut[258] = 772983787;
        w.vut[259] = 1968939036;
        w.vut[260] = 230424523;
        w.vut[261] = 973834162;
        w.vut[262] = -1201842269;
        w.vut[263] = -577578164;
        w.vut[264] = 1866054670;
        w.vut[265] = 161141289;
        w.vut[266] = 1344229001;
        w.vut[267] = 806966089;
        w.vut[268] = -1778972821;
        w.vut[269] = -1289302348;
        w.vut[270] = 951555917;
        w.vut[271] = -104632328;
        w.vut[272] = 1659331124;
        w.vut[273] = -1567161735;
        w.vut[274] = -65977363;
        w.vut[275] = -2125533956;
        w.vut[276] = 647461264;
        w.vut[277] = 428792769;
        w.vut[278] = -893245434;
        w.vut[279] = 1025735040;
        w.vut[280] = -1594764874;
        w.vut[281] = 1935477104;
        w.vut[282] = 465660776;
        w.vut[283] = -1401298796;
        w.vut[284] = -363092633;
        w.vut[285] = -176351866;
        w.vut[286] = 411155102;
        w.vut[287] = 586905477;
        w.vut[288] = 713954084;
        w.vut[289] = 2070021121;
        w.vut[290] = -1291775917;
        w.vut[291] = -2076857727;
        w.vut[292] = -898326093;
        w.vut[293] = 1342981392;
        w.vut[294] = -1240565520;
        w.vut[295] = 71866682;
        w.vut[296] = 987782883;
        w.vut[297] = -1159382092;
        w.vut[298] = 1670823310;
        w.vut[299] = -747780382;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startAutomatedDirectAvoidingLava(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wmv", wbd(int ), (int)149)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("wmw", vus(int ), (int)314)) break;
            v0 /* !! */  = (long)w.vuv("wmx", vus(int ), (int)315);
        }
        var4_2 = w.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wmy", wbd(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == w.vuv("wmz", vus(int ), (int)316)) break;
            v1 /* !! */  = (long)w.vuv("wna", vus(int ), (int)317);
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wnb", wbd(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == w.vuv("wnc", vus(int ), (int)318)) break;
            v2 /* !! */  = (long)w.vuv("wnd", vus(int ), (int)319);
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
lbl21:
            // 10 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var1_1 == null) ** GOTO lbl126
        if (var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wne", wbd(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == w.vuv("wnf", vus(int ), (int)320)) break;
            v3 /* !! */  = (long)w.vuv("wng", vus(int ), (int)321);
        }
        v4 /* !! */  = w.bh;
        if (true) ** GOTO lbl35
        block50: while (true) {
            v4 /* !! */  = (long)(v5 - w.vuv("wnh", wbd(int ), (int)153));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1992393270: {
                    v5 = w.vuv("wni", wbd(int ), (int)154);
                    continue block50;
                }
                case -670779751: {
                    v5 = w.vuv("wnj", wbd(int ), (int)155);
                    continue block50;
                }
                case 1952754353: {
                    break block50;
                }
            }
            break;
        }
        if (w.mc.field_1724 == null) ** GOTO lbl126
        if (var2_4) ** GOTO lbl21
        v6 /* !! */  = w.bh;
        if (true) ** GOTO lbl50
        block51: while (true) {
            v6 /* !! */  = (long)(v7 - w.vuv("wnk", wbd(int ), (int)156));
lbl50:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1669363593: {
                    v7 = w.vuv("wnl", wbd(int ), (int)157);
                    continue block51;
                }
                case -162442160: {
                    v7 = w.vuv("wnm", wbd(int ), (int)158);
                    continue block51;
                }
                case 165740787: {
                    v7 = w.vuv("wnn", wbd(int ), (int)159);
                    continue block51;
                }
                case 1952754353: {
                    break block51;
                }
            }
            break;
        }
        v8 /* !! */  = w.bh;
        if (true) ** GOTO lbl66
        block52: while (true) {
            v8 /* !! */  = (long)(v9 - w.vuv("wno", wbd(int ), (int)160));
lbl66:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -830526226: {
                    v9 = w.vuv("wnp", wbd(int ), (int)161);
                    continue block52;
                }
                case 44158829: {
                    v9 = w.vuv("wnq", wbd(int ), (int)162);
                    continue block52;
                }
                case 545883849: {
                    v9 = w.vuv("wnr", wbd(int ), (int)163);
                    continue block52;
                }
                case 1952754353: {
                    break block52;
                }
            }
            break;
        }
        if (w.mc.field_1687 == null) ** GOTO lbl126
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wns", wbd(int ), (int)164)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == w.vuv("wnt", vus(int ), (int)322)) break;
            v10 /* !! */  = (long)w.vuv("wnu", vus(int ), (int)323);
        }
        this.start(var1_1);
        if (var2_4 || var2_4) ** GOTO lbl21
        v11 = w.vuv("wnv", vus(int ), (int)324);
        v12 /* !! */  = w.bh;
        if (true) ** GOTO lbl92
        block54: while (true) {
            v12 /* !! */  = (long)(w.vuv("wnx", wbd(int ), (int)166) - w.vuv("wnw", wbd(int ), (int)165));
lbl92:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -232719677: {
                    continue block54;
                }
                case 1952754353: {
                    break block54;
                }
            }
            break;
        }
        this.directAutomatedRoute = v11;
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                v13 = w.vuv("wny", vus(int ), (int)325);
                v14 /* !! */  = w.bh;
                if (true) ** GOTO lbl108
                block55: while (true) {
                    v14 /* !! */  = (long)(v15 - w.vuv("wnz", wbd(int ), (int)167));
lbl108:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1208798554: {
                            v15 = w.vuv("woa", wbd(int ), (int)168);
                            continue block55;
                        }
                        case 1932639096: {
                            v15 = w.vuv("wob", wbd(int ), (int)169);
                            continue block55;
                        }
                        case 1952754353: {
                            break block55;
                        }
                    }
                    break;
                }
                this.avoidLavaDirectRoute = v13;
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("woc", wbd(int ), (int)170)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == w.vuv("wod", vus(int ), (int)326)) break;
                    v16 /* !! */  = (long)w.vuv("woe", vus(int ), (int)327);
                }
                this.initializeDirectProgress(var1_1);
                if (var2_4) ** GOTO lbl21
lbl126:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)w.vuv("wof", vus(int ), (int)328);
                } while (!var4_2);
                throw null;
            }
lbl134:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)w.vuv("wog", vus(int ), (int)329);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl139:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)w.vuv("woh", vus(int ), (int)330);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl144:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)w.vuv("woi", vus(int ), (int)331);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl149:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)w.vuv("woj", vus(int ), (int)332);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 5: {
                var3_3 /* !! */  = (int)w.vuv("wok", vus(int ), (int)333);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl159:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)w.vuv("wol", vus(int ), (int)334);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 7: {
                var3_3 /* !! */  = (int)w.vuv("wom", vus(int ), (int)335);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 8: {
                var3_3 /* !! */  = (int)w.vuv("won", vus(int ), (int)336);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl174:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)w.vuv("woo", vus(int ), (int)337);
                if (var4_2) {
                    throw null;
                }
            }
lbl178:
            // 4 sources

            case 10: {
                do {
                    var3_3 /* !! */  = (int)w.vuv("wop", vus(int ), (int)338);
                } while (!var4_2);
                throw null;
            }
lbl183:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)w.vuv("woq", vus(int ), (int)339);
                if (!var4_2) break;
                throw null;
            }
lbl187:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)w.vuv("wor", vus(int ), (int)340);
                if (!var4_2) ** GOTO lbl183
                throw null;
            }
lbl191:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)w.vuv("wos", vus(int ), (int)341);
                if (!var4_2) ** GOTO lbl134
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)w.vuv("wot", vus(int ), (int)342);
                if (!var4_2) ** GOTO lbl139
                throw null;
            }
lbl199:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)w.vuv("wou", vus(int ), (int)343);
                    if (!var4_2) ** GOTO lbl144
                    throw null;
                }
            }
            case 16: 
        }
        var3_3 /* !! */  = (int)w.vuv("wov", vus(int ), (int)344);
        ** while (!var4_2)
lbl207:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ywz() {
        w.vxh[100] = -611539604332894818L;
        w.vxh[101] = 2782331962962284288L;
        w.vxh[102] = -6324039457336230751L;
        w.vxh[103] = -579832923963172189L;
        w.vxh[104] = -8602161217535984001L;
        w.vxh[105] = 4622708708324726722L;
        w.vxh[106] = 4277846562418806673L;
        w.vxh[107] = -3901341943868795902L;
        w.vxh[108] = 4591395978637022053L;
        w.vxh[109] = -2671611736786894573L;
        w.vxh[110] = -6924629312082666298L;
        w.vxh[111] = -7145474406319932871L;
        w.vxh[112] = 7658445094099300424L;
        w.vxh[113] = -3814629037555714478L;
        w.vxh[114] = -3211847960372967499L;
        w.vxh[115] = 5465654525671274030L;
        w.vxh[116] = -8948848281118803278L;
        w.vxh[117] = -6624085847581202856L;
        w.vxh[118] = 1582619010846181368L;
        w.vxh[119] = -3154371012186641422L;
        w.vxh[120] = -625170649305181802L;
        w.vxh[121] = -4821315470832169986L;
        w.vxh[122] = -2780396865702364089L;
        w.vxh[123] = -6195806955835192689L;
        w.vxh[124] = 8602656512658533214L;
        w.vxh[125] = 3933647700345278414L;
        w.vxh[126] = -7857114317079360554L;
        w.vxh[127] = 8340090911328687997L;
        w.vxh[128] = -7092686765576731667L;
        w.vxh[129] = 8811045415190468516L;
        w.vxh[130] = 1941097088224208254L;
        w.vxh[131] = -6025982970527032757L;
        w.vxh[132] = 2612530261192984151L;
        w.vxh[133] = 4379247281741304159L;
        w.vxh[134] = -8684901384589461690L;
        w.vxh[135] = -4204810546858331849L;
        w.vxh[136] = 4388851042115823571L;
        w.vxh[137] = -518575935201255876L;
        w.vxh[138] = 4628535867216545801L;
        w.vxh[139] = 5446539107210405617L;
        w.vxh[140] = -4702740791870893972L;
        w.vxh[141] = -205539532114810678L;
        w.vxh[142] = 5788493705528586392L;
        w.vxh[143] = -5788513300918189496L;
        w.vxh[144] = 8829944226774786421L;
        w.vxh[145] = -5478867915296709932L;
        w.vxh[146] = -1857496734171587595L;
        w.vxh[147] = -3899638652768027483L;
        w.vxh[148] = -103851365051158075L;
        w.vxh[149] = -8185128093413951230L;
        w.vxh[150] = -6532910377142972006L;
        w.vxh[151] = -1166461259011618669L;
        w.vxh[152] = 3695047454840690707L;
        w.vxh[153] = -5130575049300804440L;
        w.vxh[154] = 3069891221418918913L;
        w.vxh[155] = -7175618680479224234L;
        w.vxh[156] = 1373492012254981594L;
        w.vxh[157] = -6447007711603009806L;
        w.vxh[158] = -2344859106864062642L;
        w.vxh[159] = 1526882297794566577L;
        w.vxh[160] = -6346514999352486221L;
        w.vxh[161] = 8646658894810038267L;
        w.vxh[162] = -9215086409906302276L;
        w.vxh[163] = 9054676240559579013L;
        w.vxh[164] = 8968937119468943522L;
        w.vxh[165] = 3299284341474245052L;
        w.vxh[166] = 3101700064949038260L;
        w.vxh[167] = -8900267543440205431L;
        w.vxh[168] = -2392337651308132027L;
        w.vxh[169] = 3103081336672139139L;
        w.vxh[170] = 5289883290076663024L;
        w.vxh[171] = 2247968358716249935L;
        w.vxh[172] = -1518998861253273558L;
        w.vxh[173] = 7449724539805089950L;
        w.vxh[174] = -1750655845974004124L;
        w.vxh[175] = 3839003496110011436L;
        w.vxh[176] = 4492283055728919914L;
        w.vxh[177] = -5752105042377195431L;
        w.vxh[178] = -281618558694849518L;
        w.vxh[179] = 4526365401620295346L;
        w.vxh[180] = -2389822758859642489L;
        w.vxh[181] = 7167703480804188004L;
        w.vxh[182] = 6225012686924837380L;
        w.vxh[183] = 1774536547418788048L;
        w.vxh[184] = 491937572543389506L;
        w.vxh[185] = 8993067970394865409L;
        w.vxh[186] = 3405211400434105759L;
        w.vxh[187] = 1320112717140847665L;
        w.vxh[188] = -2018533275155149950L;
        w.vxh[189] = -7764223491658840883L;
        w.vxh[190] = 4973319635180338998L;
        w.vxh[191] = -5483338858655613349L;
        w.vxh[192] = 1405611855719703903L;
        w.vxh[193] = 9101238682584286243L;
        w.vxh[194] = 6063076925086485835L;
        w.vxh[195] = 2274693160129738062L;
        w.vxh[196] = 1129872900960837528L;
        w.vxh[197] = -3905048105925583355L;
        w.vxh[198] = -9155203632594121930L;
        w.vxh[199] = 3026629867213904632L;
    }

    private static /* synthetic */ void yue() {
        w.vuu[700] = 494210433;
        w.vuu[701] = -1101607101;
        w.vuu[702] = -101108433;
        w.vuu[703] = -1137130621;
        w.vuu[704] = -876135708;
        w.vuu[705] = -1289363303;
        w.vuu[706] = 977357936;
        w.vuu[707] = -1891134794;
        w.vuu[708] = -2137768768;
        w.vuu[709] = -466330764;
        w.vuu[710] = -905490114;
        w.vuu[711] = -761130089;
        w.vuu[712] = -1684467549;
        w.vuu[713] = 281051992;
        w.vuu[714] = 1436575342;
        w.vuu[715] = -1293899465;
        w.vuu[716] = -1427978657;
        w.vuu[717] = 1799428775;
        w.vuu[718] = -1375228498;
        w.vuu[719] = -1896591596;
        w.vuu[720] = -949978167;
        w.vuu[721] = 1013951759;
        w.vuu[722] = -1374407958;
        w.vuu[723] = -1178096981;
        w.vuu[724] = 1219678398;
        w.vuu[725] = 1082690884;
        w.vuu[726] = 1721215473;
        w.vuu[727] = -320396719;
        w.vuu[728] = 2125469542;
        w.vuu[729] = -559908369;
        w.vuu[730] = 1224270424;
        w.vuu[731] = -1097659070;
        w.vuu[732] = -121322308;
        w.vuu[733] = 1669012965;
        w.vuu[734] = 866588062;
        w.vuu[735] = -935571206;
        w.vuu[736] = -1077156531;
        w.vuu[737] = -1202921572;
        w.vuu[738] = 972125072;
        w.vuu[739] = -1986199613;
        w.vuu[740] = -1368155585;
        w.vuu[741] = 92648410;
        w.vuu[742] = -326860247;
        w.vuu[743] = 147901458;
        w.vuu[744] = 546214609;
        w.vuu[745] = -2107979767;
        w.vuu[746] = 1566277177;
        w.vuu[747] = 46539500;
        w.vuu[748] = 1035875663;
        w.vuu[749] = -112632122;
        w.vuu[750] = -86593061;
        w.vuu[751] = -1360554032;
        w.vuu[752] = 1641770061;
        w.vuu[753] = 2126171410;
        w.vuu[754] = -97639176;
        w.vuu[755] = 1799836198;
        w.vuu[756] = 1274114482;
        w.vuu[757] = -748540869;
        w.vuu[758] = 1344018409;
        w.vuu[759] = -1692371815;
        w.vuu[760] = 1915342169;
        w.vuu[761] = -110357575;
        w.vuu[762] = 566057672;
        w.vuu[763] = -1681960912;
        w.vuu[764] = -322467792;
        w.vuu[765] = 1792819652;
        w.vuu[766] = 1987532827;
        w.vuu[767] = 87161492;
        w.vuu[768] = -1676624948;
        w.vuu[769] = -1452108948;
        w.vuu[770] = 378778746;
        w.vuu[771] = 2048292915;
        w.vuu[772] = 1588771383;
        w.vuu[773] = -648178725;
        w.vuu[774] = -159255328;
        w.vuu[775] = -418253597;
        w.vuu[776] = -572113662;
        w.vuu[777] = -1561870645;
        w.vuu[778] = -2142066159;
        w.vuu[779] = 2002539801;
        w.vuu[780] = 730009993;
        w.vuu[781] = -1442070324;
        w.vuu[782] = -913257545;
        w.vuu[783] = 705049835;
        w.vuu[784] = -1342777324;
        w.vuu[785] = -668866591;
        w.vuu[786] = -292438149;
        w.vuu[787] = -1355310296;
        w.vuu[788] = -1458661145;
        w.vuu[789] = 32315256;
        w.vuu[790] = 146771230;
        w.vuu[791] = -662173654;
        w.vuu[792] = 308707821;
        w.vuu[793] = -1110968989;
        w.vuu[794] = 1675733468;
        w.vuu[795] = -943768654;
        w.vuu[796] = -1580498042;
        w.vuu[797] = -938921650;
        w.vuu[798] = -1565529102;
        w.vuu[799] = 2111798300;
    }

    private static /* synthetic */ void ywx() {
        w.vxg[500] = -383441078374581407L;
        w.vxg[501] = -6503399885736672775L;
        w.vxg[502] = -5705445793920906837L;
        w.vxg[503] = 7224977172857492629L;
        w.vxg[504] = 1179970123054520802L;
        w.vxg[505] = -9221477153113348746L;
        w.vxg[506] = 2410440263938228981L;
        w.vxg[507] = 7101003074916835697L;
        w.vxg[508] = -2281213356790277976L;
        w.vxg[509] = 290444888660799464L;
        w.vxg[510] = 1284343972385962013L;
        w.vxg[511] = -4974487404929384921L;
        w.vxg[512] = -5852909262511289893L;
        w.vxg[513] = 5786238355945115634L;
        w.vxg[514] = -1180104759654008541L;
        w.vxg[515] = 3762857242752722326L;
        w.vxg[516] = 1476588363375624212L;
        w.vxg[517] = -5963785187951404832L;
        w.vxg[518] = -8931664519278032974L;
        w.vxg[519] = -3216620760165917859L;
        w.vxg[520] = -8744615526797879514L;
        w.vxg[521] = 669826324420231444L;
        w.vxg[522] = 8325926845733625318L;
        w.vxg[523] = 1347499954692344191L;
        w.vxg[524] = 4860561806657697584L;
        w.vxg[525] = 9222664332363831132L;
        w.vxg[526] = 826339216451902593L;
        w.vxg[527] = -1099426972268439975L;
        w.vxg[528] = -8106230410794850976L;
        w.vxg[529] = -3543934837854406571L;
        w.vxg[530] = 5034724239808769193L;
        w.vxg[531] = -7205277080054143421L;
        w.vxg[532] = 3056600392713699953L;
        w.vxg[533] = 6837980940226823831L;
        w.vxg[534] = -7340643557441933566L;
        w.vxg[535] = -5798669247303406596L;
        w.vxg[536] = 1534283480581761124L;
        w.vxg[537] = -3483488650347834536L;
        w.vxg[538] = 1273754370349070328L;
        w.vxg[539] = -4251230339314478391L;
        w.vxg[540] = -2449804930630440593L;
        w.vxg[541] = 162006095061211063L;
        w.vxg[542] = -7753793162391571980L;
        w.vxg[543] = 7680267002419128756L;
        w.vxg[544] = -2783064513875675961L;
        w.vxg[545] = -5041990578145161474L;
        w.vxg[546] = 6599482399167028125L;
        w.vxg[547] = -6513160454620176039L;
        w.vxg[548] = 3561148739053808615L;
        w.vxg[549] = 3453941291462200066L;
        w.vxg[550] = -6293855725681506543L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startAutomated(class_243 var1_1) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(w.vuv("wjy", wbd(int ), (int)117) - w.vuv("wjx", wbd(int ), (int)116));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 516883242: {
                    continue block26;
                }
                case 1952754353: {
                    break block26;
                }
            }
            break;
        }
        var4_2 = w.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wjz", wbd(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == w.vuv("wka", vus(int ), (int)271)) break;
            v1 /* !! */  = (long)w.vuv("wkb", vus(int ), (int)272);
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wkc", wbd(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == w.vuv("wkd", vus(int ), (int)273)) break;
            v2 /* !! */  = (long)w.vuv("wke", vus(int ), (int)274);
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
lbl27:
            // 6 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl27
        if (var1_1 == null) ** GOTO lbl81
        if (var2_4) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wkf", wbd(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == w.vuv("wkg", vus(int ), (int)275)) break;
            v3 /* !! */  = (long)w.vuv("wkh", vus(int ), (int)276);
        }
        v4 /* !! */  = w.bh;
        if (true) ** GOTO lbl42
        block31: while (true) {
            v4 /* !! */  = (long)(w.vuv("wkj", wbd(int ), (int)122) - w.vuv("wki", wbd(int ), (int)121));
lbl42:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1590842567: {
                    continue block31;
                }
                case 1952754353: {
                    break block31;
                }
            }
            break;
        }
        if (w.mc.field_1724 == null) ** GOTO lbl81
        if (var2_4) ** GOTO lbl27
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wkk", wbd(int ), (int)123)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == w.vuv("wkl", vus(int ), (int)277)) break;
            v5 /* !! */  = (long)w.vuv("wkm", vus(int ), (int)278);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wkn", wbd(int ), (int)124)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == w.vuv("wko", vus(int ), (int)279)) break;
            v6 /* !! */  = (long)w.vuv("wkp", vus(int ), (int)280);
        }
        if (w.mc.field_1687 == null) ** GOTO lbl81
        if (var2_4 || var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = w.bh;
                if (true) ** GOTO lbl70
                block34: while (true) {
                    v7 /* !! */  = (long)(v8 - w.vuv("wkq", wbd(int ), (int)125));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1489026939: {
                            v8 = w.vuv("wkr", wbd(int ), (int)126);
                            continue block34;
                        }
                        case 1250709839: {
                            v8 = w.vuv("wks", wbd(int ), (int)127);
                            continue block34;
                        }
                        case 1952754353: {
                            break block34;
                        }
                    }
                    break;
                }
                this.start(var1_1);
                if (var2_4) ** GOTO lbl27
lbl81:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl84:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)w.vuv("wkt", vus(int ), (int)281);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)w.vuv("wku", vus(int ), (int)282);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 2: {
                var3_3 /* !! */  = (int)w.vuv("wkv", vus(int ), (int)283);
                if (!var4_2) ** GOTO lbl84
                throw null;
            }
lbl98:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)w.vuv("wkw", vus(int ), (int)284);
                if (var4_2) {
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)w.vuv("wkx", vus(int ), (int)285);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)w.vuv("wky", vus(int ), (int)286);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl111:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)w.vuv("wkz", vus(int ), (int)287);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)w.vuv("wla", vus(int ), (int)288);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
lbl119:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)w.vuv("wlb", vus(int ), (int)289);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
lbl123:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)w.vuv("wlc", vus(int ), (int)290);
                    if (!var4_2) ** GOTO lbl119
                    throw null;
                }
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)w.vuv("wld", vus(int ), (int)291);
        ** while (!var4_2)
lbl131:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yvc() {
        w.vuu[900] = -576040794;
        w.vuu[901] = 363441078;
        w.vuu[902] = -789965712;
        w.vuu[903] = 1501132599;
        w.vuu[904] = -2077872583;
        w.vuu[905] = -1392830438;
        w.vuu[906] = -143088541;
        w.vuu[907] = -2057780599;
        w.vuu[908] = 1009402733;
        w.vuu[909] = -1644723894;
        w.vuu[910] = 41781318;
        w.vuu[911] = 416132355;
        w.vuu[912] = -1503539246;
        w.vuu[913] = 17675395;
        w.vuu[914] = -142718791;
        w.vuu[915] = 2038628542;
        w.vuu[916] = 1515490028;
        w.vuu[917] = 1655134311;
        w.vuu[918] = -566636160;
        w.vuu[919] = 1365634471;
        w.vuu[920] = -512881785;
        w.vuu[921] = -502198110;
        w.vuu[922] = 923107494;
        w.vuu[923] = -192005161;
        w.vuu[924] = -1496685351;
        w.vuu[925] = 458847723;
        w.vuu[926] = -1936590272;
        w.vuu[927] = -1822959354;
        w.vuu[928] = -1860671402;
        w.vuu[929] = 1086699637;
        w.vuu[930] = 2118218932;
        w.vuu[931] = 1947997293;
        w.vuu[932] = -2056153090;
        w.vuu[933] = -1959047316;
        w.vuu[934] = 583150569;
        w.vuu[935] = -1174573006;
        w.vuu[936] = -1474492362;
        w.vuu[937] = -2081237161;
        w.vuu[938] = 225286888;
        w.vuu[939] = -353577574;
        w.vuu[940] = 35846269;
        w.vuu[941] = 655336736;
        w.vuu[942] = -277673699;
        w.vuu[943] = 1110109317;
        w.vuu[944] = -1416226746;
        w.vuu[945] = -874229012;
        w.vuu[946] = 1982770369;
        w.vuu[947] = -1301102103;
        w.vuu[948] = 1176086446;
        w.vuu[949] = -1261226066;
        w.vuu[950] = -226965717;
        w.vuu[951] = -1851204305;
        w.vuu[952] = 2125447021;
        w.vuu[953] = -2049642591;
        w.vuu[954] = -275254278;
        w.vuu[955] = 1231180866;
        w.vuu[956] = 298369212;
        w.vuu[957] = 1475738605;
        w.vuu[958] = 520991123;
        w.vuu[959] = -297049933;
        w.vuu[960] = -899016986;
        w.vuu[961] = 2112193519;
        w.vuu[962] = -93417386;
        w.vuu[963] = 401905755;
        w.vuu[964] = -979871142;
        w.vuu[965] = 137793197;
        w.vuu[966] = 754776530;
        w.vuu[967] = 1090017868;
        w.vuu[968] = -1173925020;
        w.vuu[969] = 1997604192;
        w.vuu[970] = 1513142974;
        w.vuu[971] = 697414124;
        w.vuu[972] = -2009656268;
        w.vuu[973] = -1487208268;
        w.vuu[974] = 630238830;
        w.vuu[975] = -1635576529;
        w.vuu[976] = 217446509;
        w.vuu[977] = -1623646965;
        w.vuu[978] = -137808781;
        w.vuu[979] = 928120338;
        w.vuu[980] = -552236292;
        w.vuu[981] = 1867666900;
        w.vuu[982] = 1285476570;
        w.vuu[983] = 115369417;
        w.vuu[984] = -1328276493;
        w.vuu[985] = -1677129780;
        w.vuu[986] = -495605170;
        w.vuu[987] = -1725655740;
        w.vuu[988] = 58809150;
        w.vuu[989] = -748147536;
        w.vuu[990] = -493727412;
        w.vuu[991] = 936050462;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void start(class_243 var1_1) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block77: while (true) {
            v0 /* !! */  = (long)(v1 - w.vuv("wgp", wbd(int ), (int)79));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -556684812: {
                    v1 = w.vuv("wgq", wbd(int ), (int)80);
                    continue block77;
                }
                case -242316060: {
                    v1 = w.vuv("wgr", wbd(int ), (int)81);
                    continue block77;
                }
                case 1952754353: {
                    break block77;
                }
            }
            break;
        }
        var4_2 = w.c;
        v2 /* !! */  = w.bh;
        if (true) ** GOTO lbl19
        block78: while (true) {
            v2 /* !! */  = (long)(v3 - w.vuv("wgs", wbd(int ), (int)82));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1157102613: {
                    v3 = w.vuv("wgt", wbd(int ), (int)83);
                    continue block78;
                }
                case 830715608: {
                    v3 = w.vuv("wgu", wbd(int ), (int)84);
                    continue block78;
                }
                case 1952754353: {
                    break block78;
                }
            }
            break;
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wgv", wbd(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == w.vuv("wgw", vus(int ), (int)222)) {
                var2_4 = w.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)w.vuv("wgx", vus(int ), (int)223);
        }
        if (var2_4 || var2_4) return;
        v5 /* !! */  = w.bh;
        if (true) ** GOTO lbl44
        block80: while (true) {
            v5 /* !! */  = (long)(v6 - w.vuv("wgy", wbd(int ), (int)86));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1779300486: {
                    v6 = w.vuv("wgz", wbd(int ), (int)87);
                    continue block80;
                }
                case 941684825: {
                    v6 = w.vuv("wha", wbd(int ), (int)88);
                    continue block80;
                }
                case 1318552064: {
                    v6 = w.vuv("whb", wbd(int ), (int)89);
                    continue block80;
                }
                case 1952754353: {
                    break block80;
                }
            }
            break;
        }
        this.destination = var1_1;
        if (var2_4 || var2_4) return;
        v7 = w.vuv("whc", vus(int ), (int)224);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("whd", wbd(int ), (int)90)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == w.vuv("whe", vus(int ), (int)225)) {
                this.active = v7;
                if (var2_4) return;
                break;
            }
            v8 /* !! */  = (long)w.vuv("whf", vus(int ), (int)226);
        }
        if (var2_4) return;
        v9 = w.vuv("whg", vus(int ), (int)227);
        v10 /* !! */  = w.bh;
        if (true) ** GOTO lbl74
        block82: while (true) {
            v10 /* !! */  = (long)(v11 - w.vuv("whh", wbd(int ), (int)91));
lbl74:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1344048985: {
                    v11 = w.vuv("whi", wbd(int ), (int)92);
                    continue block82;
                }
                case 609908891: {
                    v11 = w.vuv("whj", wbd(int ), (int)93);
                    continue block82;
                }
                case 795285563: {
                    v11 = w.vuv("whk", wbd(int ), (int)94);
                    continue block82;
                }
                case 1952754353: {
                    break block82;
                }
            }
            break;
        }
        this.directAutomatedRoute = v9;
        if (var2_4 || var2_4) return;
        v12 = w.vuv("whl", vus(int ), (int)228);
        v13 /* !! */  = w.bh;
        if (true) ** GOTO lbl93
        block83: while (true) {
            v13 /* !! */  = (long)(v14 - w.vuv("whm", wbd(int ), (int)95));
lbl93:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2035527754: {
                    v14 = w.vuv("whn", wbd(int ), (int)96);
                    continue block83;
                }
                case -1210676912: {
                    v14 = w.vuv("who", wbd(int ), (int)97);
                    continue block83;
                }
                case -289548393: {
                    v14 = w.vuv("whp", wbd(int ), (int)98);
                    continue block83;
                }
                case 1952754353: {
                    break block83;
                }
            }
            break;
        }
        this.avoidLavaDirectRoute = v12;
        if (var2_4 || var2_4) return;
        v15 = w.vuv("whq", vus(int ), (int)229);
        v16 /* !! */  = w.bh;
        block84: while (true) {
            switch ((int)v16 /* !! */ ) {
                case 470703731: {
                    v16 /* !! */  = (long)(w.vuv("whs", wbd(int ), (int)100) - w.vuv("whr", wbd(int ), (int)99));
                    continue block84;
                }
                case 1952754353: {
                    break block84;
                }
            }
            break;
        }
        this.waitTicks = (int)v15;
        if (var2_4 || var2_4) return;
        v17 = w.vuv("wht", vus(int ), (int)230);
        v18 /* !! */  = w.bh;
        block85: while (true) {
            switch ((int)v18 /* !! */ ) {
                case 1952754353: {
                    break block85;
                }
                case 2136933196: {
                    v18 /* !! */  = (long)(w.vuv("whv", wbd(int ), (int)102) - w.vuv("whu", wbd(int ), (int)101));
                    continue block85;
                }
            }
            break;
        }
        this.stepCount = (int)v17;
        if (var2_4 || var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block86: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v19 = w.vuv("whw", vus(int ), (int)231);
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("whx", wbd(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v20 /* !! */  == w.vuv("why", vus(int ), (int)232)) {
                            this.directNoProgressTicks = (int)v19;
                            if (var2_4) return;
                            break;
                        }
                        v20 /* !! */  = (long)w.vuv("whz", vus(int ), (int)233);
                    }
                    if (var2_4) return;
                    v21 = w.vuv("wia", vus(int ), (int)234);
                    v22 /* !! */  = w.bh;
                    block88: while (true) {
                        switch ((int)v22 /* !! */ ) {
                            case -2120227925: {
                                v23 = w.vuv("wic", wbd(int ), (int)105);
                                ** GOTO lbl154
                            }
                            case 1896928279: {
                                v23 = w.vuv("wid", wbd(int ), (int)106);
lbl154:
                                // 2 sources

                                v22 /* !! */  = (long)(v23 - w.vuv("wib", wbd(int ), (int)104));
                                continue block88;
                            }
                            case 1952754353: {
                                break block88;
                            }
                        }
                        break;
                    }
                    this.directCorrections = (int)v21;
                    if (var2_4 || var2_4) return;
                    v24 = w.vuv("wie", vus(int ), (int)235);
                    v25 /* !! */  = w.bh;
                    block89: while (true) {
                        switch ((int)v25 /* !! */ ) {
                            case -1429918899: {
                                v26 = w.vuv("wig", wbd(int ), (int)108);
                                ** GOTO lbl172
                            }
                            case 376160111: {
                                v26 = w.vuv("wih", wbd(int ), (int)109);
                                ** GOTO lbl172
                            }
                            case 1291547415: {
                                v26 = w.vuv("wii", wbd(int ), (int)110);
lbl172:
                                // 3 sources

                                v25 /* !! */  = (long)(v26 - w.vuv("wif", wbd(int ), (int)107));
                                continue block89;
                            }
                            case 1952754353: {
                                break block89;
                            }
                        }
                        break;
                    }
                    this.directMaxSteps = (int)v24;
                    if (var2_4 || var2_4) return;
                    v27 = w.vuv("wij", vxf(int ), (int)111);
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wik", wbd(int ), (int)112)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v28 /* !! */  == w.vuv("wil", vus(int ), (int)236)) {
                            this.directBestDistance = (double)v27;
                            if (var2_4) return;
                            break;
                        }
                        v28 /* !! */  = (long)w.vuv("wim", vus(int ), (int)237);
                    }
                    if (var2_4) return;
                    v29 = w.vuv("win", vxf(int ), (int)113);
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("wio", wbd(int ), (int)114)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v30 /* !! */  == w.vuv("wip", vus(int ), (int)238)) {
                            this.directExpectedDistance = (double)v29;
                            if (var2_4) return;
                            break;
                        }
                        v30 /* !! */  = (long)w.vuv("wiq", vus(int ), (int)239);
                    }
                    if (var2_4) return;
                    v31 = w.vuv("wir", vus(int ), (int)240);
                    while (true) {
                        if ((v32 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("wis", wbd(int ), (int)115)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v32 /* !! */  == w.vuv("wit", vus(int ), (int)241)) {
                            this.automatedRouteFailed = v31;
                            if (var2_4) return;
                            break;
                        }
                        v32 /* !! */  = (long)w.vuv("wiu", vus(int ), (int)242);
                    }
                    if (!var2_4) return;
                    return;
                }
                case 1: {
                    var3_3 /* !! */  = (int)w.vuv("wiw", vus(int ), (int)244);
                    cfr_temp_0 = 5;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)w.vuv("wiy", vus(int ), (int)246);
                    cfr_temp_0 = 10;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 4: {
                    ** GOTO lbl313
                }
                case 6: {
                    var3_3 /* !! */  = (int)w.vuv("wjb", vus(int ), (int)249);
                    cfr_temp_0 = 20;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)w.vuv("wjc", vus(int ), (int)250);
                    cfr_temp_0 = 21;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 11: {
                    var3_3 /* !! */  = (int)w.vuv("wjg", vus(int ), (int)254);
                    cfr_temp_0 = 17;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 14: {
                    var3_3 /* !! */  = (int)w.vuv("wjj", vus(int ), (int)257);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 8: {
                    var3_3 /* !! */  = (int)w.vuv("wjd", vus(int ), (int)251);
                    cfr_temp_0 = 21;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 16: {
                    do {
                        var3_3 /* !! */  = (int)w.vuv("wjl", vus(int ), (int)259);
                    } while (!var4_2);
                    throw null;
                }
                case 17: {
                    var3_3 /* !! */  = (int)w.vuv("wjm", vus(int ), (int)260);
                    cfr_temp_0 = 22;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 19: {
                    var3_3 /* !! */  = (int)w.vuv("wjo", vus(int ), (int)262);
                    cfr_temp_0 = 23;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 21: {
                    var3_3 /* !! */  = (int)w.vuv("wjq", vus(int ), (int)264);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 0: {
                    var3_3 /* !! */  = (int)w.vuv("wiv", vus(int ), (int)243);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 10: {
                    var3_3 /* !! */  = (int)w.vuv("wjf", vus(int ), (int)253);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 23: {
                    var3_3 /* !! */  = (int)w.vuv("wjs", vus(int ), (int)266);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 15: {
                    var3_3 /* !! */  = (int)w.vuv("wjk", vus(int ), (int)258);
                    cfr_temp_0 = 24;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 25: {
                    var3_3 /* !! */  = (int)w.vuv("wju", vus(int ), (int)268);
                    cfr_temp_0 = 24;
                    if (!var4_2) continue block86;
                    throw null;
                }
                case 26: {
                    var3_3 /* !! */  = (int)w.vuv("wjv", vus(int ), (int)269);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 9: {
                    var3_3 /* !! */  = (int)w.vuv("wje", vus(int ), (int)252);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 20: {
                    var3_3 /* !! */  = (int)w.vuv("wjp", vus(int ), (int)263);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 12: {
                    var3_3 /* !! */  = (int)w.vuv("wjh", vus(int ), (int)255);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 18: {
                    var3_3 /* !! */  = (int)w.vuv("wjn", vus(int ), (int)261);
                    if (!var4_2) ** break;
                    throw null;
                }
                case 27: {
                    var3_3 /* !! */  = (int)w.vuv("wjw", vus(int ), (int)270);
                    if (var4_2) {
                        throw null;
                    }
lbl313:
                    // 3 sources

                    var3_3 /* !! */  = (int)w.vuv("wiz", vus(int ), (int)247);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 22: {
                    var3_3 /* !! */  = (int)w.vuv("wjr", vus(int ), (int)265);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 5: {
                    var3_3 /* !! */  = (int)w.vuv("wja", vus(int ), (int)248);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 13: {
                    var3_3 /* !! */  = (int)w.vuv("wji", vus(int ), (int)256);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 24: {
                    var3_3 /* !! */  = (int)w.vuv("wjt", vus(int ), (int)267);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)w.vuv("wix", vus(int ), (int)245);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void yqe() {
        w.vut[500] = -274578708;
        w.vut[501] = -629154569;
        w.vut[502] = 1392210504;
        w.vut[503] = -1986807527;
        w.vut[504] = -1074833456;
        w.vut[505] = -970981161;
        w.vut[506] = 1629444341;
        w.vut[507] = 1461298098;
        w.vut[508] = -28153843;
        w.vut[509] = 1159343243;
        w.vut[510] = -1187765823;
        w.vut[511] = 641256161;
        w.vut[512] = 1137676572;
        w.vut[513] = -1721246520;
        w.vut[514] = -1592905308;
        w.vut[515] = -1943103858;
        w.vut[516] = 90019364;
        w.vut[517] = 1369621012;
        w.vut[518] = 2125703810;
        w.vut[519] = 871488962;
        w.vut[520] = -1576556138;
        w.vut[521] = -1107955030;
        w.vut[522] = 1115844812;
        w.vut[523] = -1297619926;
        w.vut[524] = 1236237678;
        w.vut[525] = -1609313222;
        w.vut[526] = -1829496412;
        w.vut[527] = -1354441021;
        w.vut[528] = -283933288;
        w.vut[529] = 838402955;
        w.vut[530] = 1614177370;
        w.vut[531] = 1460949623;
        w.vut[532] = 2094333475;
        w.vut[533] = -1660439478;
        w.vut[534] = 560270882;
        w.vut[535] = 757120846;
        w.vut[536] = 301553225;
        w.vut[537] = 1740520653;
        w.vut[538] = -1924512373;
        w.vut[539] = 482574400;
        w.vut[540] = 1225866271;
        w.vut[541] = -562907002;
        w.vut[542] = -254537654;
        w.vut[543] = 484298638;
        w.vut[544] = -813466361;
        w.vut[545] = 705972244;
        w.vut[546] = 1693878908;
        w.vut[547] = -1309367064;
        w.vut[548] = -1620580812;
        w.vut[549] = 90339807;
        w.vut[550] = -937895513;
        w.vut[551] = 948191667;
        w.vut[552] = -1217439520;
        w.vut[553] = -122925715;
        w.vut[554] = -1036998935;
        w.vut[555] = 854119427;
        w.vut[556] = -1252787229;
        w.vut[557] = -1458129619;
        w.vut[558] = 2000205785;
        w.vut[559] = -791370847;
        w.vut[560] = 1975178594;
        w.vut[561] = 2009226001;
        w.vut[562] = -869008744;
        w.vut[563] = 2091154830;
        w.vut[564] = 642084211;
        w.vut[565] = 182248272;
        w.vut[566] = -161020389;
        w.vut[567] = 465664191;
        w.vut[568] = -1922332625;
        w.vut[569] = -1849967934;
        w.vut[570] = 2133481771;
        w.vut[571] = 800566642;
        w.vut[572] = -898218890;
        w.vut[573] = 1708304874;
        w.vut[574] = 1452573960;
        w.vut[575] = 1418520401;
        w.vut[576] = 1685369718;
        w.vut[577] = -1564937489;
        w.vut[578] = -516031454;
        w.vut[579] = 1955871973;
        w.vut[580] = 623186815;
        w.vut[581] = -922713064;
        w.vut[582] = 1756227866;
        w.vut[583] = 74856675;
        w.vut[584] = -1810127607;
        w.vut[585] = -270687110;
        w.vut[586] = 171285604;
        w.vut[587] = 463625750;
        w.vut[588] = 815322523;
        w.vut[589] = -146316898;
        w.vut[590] = -195791021;
        w.vut[591] = 804694992;
        w.vut[592] = 76695105;
        w.vut[593] = -1632283187;
        w.vut[594] = 2032573324;
        w.vut[595] = 1179130850;
        w.vut[596] = -929037351;
        w.vut[597] = -1422657971;
        w.vut[598] = 1564636629;
        w.vut[599] = 1054884066;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$tabComplete$0(class_742 class_7422) {
        CallSite callSite;
        Object object = bh;
        boolean bl2 = true;
        block19: while (true) {
            CallSite callSite2;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite2 - w.vuv("ypa", wbd(int ), (int)539);
            }
            switch ((int)object) {
                case -1649049603: {
                    callSite2 = w.vuv("ypb", wbd(int ), (int)540);
                    continue block19;
                }
                case -1150336022: {
                    callSite2 = w.vuv("ypc", wbd(int ), (int)541);
                    continue block19;
                }
                case 1455564111: {
                    callSite2 = w.vuv("ypd", wbd(int ), (int)542);
                    continue block19;
                }
                case 1952754353: {
                    break block19;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = bh - w.vuv("ype", wbd(int ), (int)543)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == w.vuv("ypf", vus(int ), (int)979)) break;
            object2 = w.vuv("ypg", vus(int ), (int)980);
        }
        int n2 = b;
        Object object3 = bh;
        block21: while (true) {
            switch ((int)object3) {
                case -285719430: {
                    object3 = w.vuv("ypi", wbd(int ), (int)545) - w.vuv("yph", wbd(int ), (int)544);
                    continue block21;
                }
                case 1952754353: {
                    break block21;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) return (boolean)w.vuv("ypj", vus(int ), (int)981);
        Object object4 = bh;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite3;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite3 - w.vuv("ypk", wbd(int ), (int)546);
            }
            switch ((int)object4) {
                case -1186437421: {
                    callSite3 = w.vuv("ypl", wbd(int ), (int)547);
                    continue block22;
                }
                case 1480976800: {
                    callSite3 = w.vuv("ypm", wbd(int ), (int)548);
                    continue block22;
                }
                case 1952754353: {
                    break block22;
                }
            }
            break;
        }
        Object object5 = bh;
        block23: while (true) {
            switch ((int)object5) {
                case 841522326: {
                    object5 = w.vuv("ypo", wbd(int ), (int)550) - w.vuv("ypn", wbd(int ), (int)549);
                    continue block23;
                }
                case 1952754353: {
                    break block23;
                }
            }
            break;
        }
        if (class_7422 != w.mc.field_1724) {
            if (bl4) return (boolean)w.vuv("ypj", vus(int ), (int)981);
            callSite = w.vuv("ypp", vus(int ), (int)982);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl4 || bl4) {
            return (boolean)w.vuv("ypj", vus(int ), (int)981);
        }
        callSite = w.vuv("ypq", vus(int ), (int)983);
        return (boolean)callSite;
    }

    private static /* synthetic */ void yqc() {
        w.vut[300] = -123896099;
        w.vut[301] = -129276448;
        w.vut[302] = -142190590;
        w.vut[303] = -234555329;
        w.vut[304] = 1171035201;
        w.vut[305] = -1883926648;
        w.vut[306] = 82527396;
        w.vut[307] = -1846313838;
        w.vut[308] = -358761403;
        w.vut[309] = -1361773980;
        w.vut[310] = 1892929882;
        w.vut[311] = 1682093879;
        w.vut[312] = -1105860802;
        w.vut[313] = -451599508;
        w.vut[314] = -1863463870;
        w.vut[315] = 1264225724;
        w.vut[316] = 1193361922;
        w.vut[317] = 2143485931;
        w.vut[318] = 1127612304;
        w.vut[319] = 1314408890;
        w.vut[320] = -1669790950;
        w.vut[321] = -1259950785;
        w.vut[322] = 385072351;
        w.vut[323] = -724480373;
        w.vut[324] = -1770244079;
        w.vut[325] = 1417919396;
        w.vut[326] = 405144356;
        w.vut[327] = 1895808512;
        w.vut[328] = 990617503;
        w.vut[329] = -1025262743;
        w.vut[330] = -1516785656;
        w.vut[331] = 1436501844;
        w.vut[332] = 1308830221;
        w.vut[333] = -463744648;
        w.vut[334] = 97710635;
        w.vut[335] = 1567350039;
        w.vut[336] = -379592814;
        w.vut[337] = -2087155530;
        w.vut[338] = 2104236205;
        w.vut[339] = -369157658;
        w.vut[340] = 916469672;
        w.vut[341] = 920414245;
        w.vut[342] = -296980522;
        w.vut[343] = 1953154503;
        w.vut[344] = -1100147191;
        w.vut[345] = -1028048727;
        w.vut[346] = 1517994101;
        w.vut[347] = -563196666;
        w.vut[348] = -2083806349;
        w.vut[349] = -1719623178;
        w.vut[350] = 1967396524;
        w.vut[351] = 1719788235;
        w.vut[352] = -1357385990;
        w.vut[353] = -777174338;
        w.vut[354] = -1384992145;
        w.vut[355] = -1300305618;
        w.vut[356] = -2134593181;
        w.vut[357] = -1339697937;
        w.vut[358] = -928043397;
        w.vut[359] = 864872031;
        w.vut[360] = 1189906374;
        w.vut[361] = -937966087;
        w.vut[362] = -1288688465;
        w.vut[363] = 299383378;
        w.vut[364] = 858318547;
        w.vut[365] = -1845645370;
        w.vut[366] = 1061854073;
        w.vut[367] = 1715796681;
        w.vut[368] = -2052802506;
        w.vut[369] = -103919901;
        w.vut[370] = 650220038;
        w.vut[371] = 1399948248;
        w.vut[372] = 1645206726;
        w.vut[373] = -1072465404;
        w.vut[374] = -820324292;
        w.vut[375] = 665643805;
        w.vut[376] = 48768210;
        w.vut[377] = 1364690895;
        w.vut[378] = -1456438268;
        w.vut[379] = -1679834711;
        w.vut[380] = 1695037087;
        w.vut[381] = 568951896;
        w.vut[382] = 1268236266;
        w.vut[383] = -550487742;
        w.vut[384] = 1838380225;
        w.vut[385] = 1140288778;
        w.vut[386] = 551040739;
        w.vut[387] = -425467227;
        w.vut[388] = -2121401274;
        w.vut[389] = 598101930;
        w.vut[390] = -537153999;
        w.vut[391] = -44323633;
        w.vut[392] = 722992599;
        w.vut[393] = 542947354;
        w.vut[394] = -944662332;
        w.vut[395] = 1524242306;
        w.vut[396] = 1916752950;
        w.vut[397] = -972026673;
        w.vut[398] = 1287897082;
        w.vut[399] = -936535187;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isStopArgument(String var0) {
        block47: {
            block46: {
                v0 /* !! */  = w.bh;
                if (true) ** GOTO lbl5
                block27: while (true) {
                    v0 /* !! */  = (long)(v1 - w.vuv("ykp", wbd(int ), (int)481));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1879723748: {
                            v1 = w.vuv("ykq", wbd(int ), (int)482);
                            continue block27;
                        }
                        case 1022835794: {
                            v1 = w.vuv("ykr", wbd(int ), (int)483);
                            continue block27;
                        }
                        case 1952754353: {
                            break block27;
                        }
                    }
                    break;
                }
                var3_1 = w.c;
                v2 /* !! */  = w.bh;
                if (true) ** GOTO lbl19
                block28: while (true) {
                    v2 /* !! */  = (long)(w.vuv("ykt", wbd(int ), (int)485) - w.vuv("yks", wbd(int ), (int)484));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 638412778: {
                            continue block28;
                        }
                        case 1952754353: {
                            break block28;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = w.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("yku", wbd(int ), (int)486)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == w.vuv("ykv", vus(int ), (int)922)) break;
                    v3 /* !! */  = (long)w.vuv("ykw", vus(int ), (int)923);
                }
                var1_3 = w.a;
                if (var3_1) {
                    throw null;
lbl34:
                    // 5 sources

                    return (boolean)w.vuv("ykx", vus(int ), (int)924);
                }
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = w.bh;
                if (true) ** GOTO lbl41
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - w.vuv("yky", wbd(int ), (int)487));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1518411228: {
                            v5 = w.vuv("ykz", wbd(int ), (int)488);
                            continue block31;
                        }
                        case -351833625: {
                            v5 = w.vuv("yla", wbd(int ), (int)489);
                            continue block31;
                        }
                        case 1952754353: {
                            break block31;
                        }
                    }
                    break;
                }
                if (var0.equalsIgnoreCase("stop")) break block46;
                if (var1_3) ** GOTO lbl34
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("ylb", wbd(int ), (int)490)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == w.vuv("ylc", vus(int ), (int)925)) break;
                    v6 /* !! */  = (long)w.vuv("yld", vus(int ), (int)926);
                }
                if (!var0.equalsIgnoreCase("off")) break block47;
                if (var1_3) ** GOTO lbl34
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            v7 = w.vuv("yle", vus(int ), (int)927);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl73
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = w.vuv("ylf", vus(int ), (int)928);
lbl73:
                // 2 sources

                return (boolean)v7;
            }
lbl74:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)w.vuv("ylg", vus(int ), (int)929);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)w.vuv("ylh", vus(int ), (int)930);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)w.vuv("yli", vus(int ), (int)931);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl88:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)w.vuv("ylj", vus(int ), (int)932);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 4: {
                var2_2 /* !! */  = (int)w.vuv("ylk", vus(int ), (int)933);
                if (var3_1) {
                    throw null;
                }
            }
lbl97:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)w.vuv("yll", vus(int ), (int)934);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
lbl101:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)w.vuv("ylm", vus(int ), (int)935);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)w.vuv("yln", vus(int ), (int)936);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)w.vuv("ylo", vus(int ), (int)937);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl113:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)w.vuv("ylp", vus(int ), (int)938);
                    if (!var3_1) ** GOTO lbl88
                    throw null;
                }
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)w.vuv("ylq", vus(int ), (int)939);
        ** while (!var3_1)
lbl121:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean didAutomatedRouteFail() {
        block28: {
            v0 /* !! */  = w.bh;
            block15: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1376846500: {
                        v0 /* !! */  = (long)(w.vuv("wqw", wbd(int ), (int)193) - w.vuv("wqv", wbd(int ), (int)192));
                        continue block15;
                    }
                    case 1952754353: {
                        break block15;
                    }
                }
                break;
            }
            var3_1 = w.c;
            while (true) {
                block29: {
                    if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wqx", wbd(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != w.vuv("wqy", vus(int ), (int)375)) break block29;
                    var2_2 /* !! */  = w.b;
                    if (var2_2 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v1 /* !! */  = (long)w.vuv("wqz", vus(int ), (int)376);
            }
            cfr_temp_0 = -2147483648;
            block17: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wra", wbd(int ), (int)195)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v2 /* !! */  == w.vuv("wrb", vus(int ), (int)377)) {
                                var1_3 = w.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)w.vuv("wrc", vus(int ), (int)378);
                        }
                        if (var1_3 != false) return (boolean)w.vuv("wrd", vus(int ), (int)379);
                        if (var1_3 != false) return (boolean)w.vuv("wrd", vus(int ), (int)379);
                        v3 /* !! */  = w.bh;
                        block19: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -583397926: {
                                    v4 = w.vuv("wrf", wbd(int ), (int)197);
                                    ** GOTO lbl45
                                }
                                case 434583666: {
                                    v4 = w.vuv("wrg", wbd(int ), (int)198);
lbl45:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - w.vuv("wre", wbd(int ), (int)196));
                                    continue block19;
                                }
                                case 1952754353: {
                                    return this.automatedRouteFailed;
                                }
                            }
                            break;
                        }
                        return this.automatedRouteFailed;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)w.vuv("wrh", vus(int ), (int)380);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block28;
                    }
lbl58:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)w.vuv("wri", vus(int ), (int)381);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block17;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)w.vuv("wrj", vus(int ), (int)382);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)w.vuv("wrk", vus(int ), (int)383);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 bypassHole(class_243 var1_1, class_243 var2_2) {
        var14_3 = w.c;
        var13_4 /* !! */  = w.b;
        var12_5 = w.a;
        if (var14_3) {
            throw null;
lbl6:
            // 15 sources

            return null;
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        var3_6 = var2_2.method_1020(var1_1).method_1029();
        if (var12_5 || var12_5) ** GOTO lbl6
        var4_7 = new class_243(-var3_6.field_1350, 0.0, var3_6.field_1352);
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_8 = new double[]{2.0, -2.0, 4.0, -4.0, 6.0, -6.0};
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_9 = var5_8;
        if (var12_5) ** GOTO lbl6
        var7_10 = var6_9.length;
        if (var12_5) ** GOTO lbl6
        var8_11 = w.vuv("xaf", vus(int ), (int)550);
        if (var12_5) ** GOTO lbl6
        block31: while (true) {
            block56: {
                if (var12_5 || var12_5) ** GOTO lbl6
                if (var8_11 >= var7_10) ** GOTO lbl41
                if (var12_5) ** GOTO lbl6
                var9_12 = var6_9[var8_11];
                if (var12_5 || var12_5) ** GOTO lbl6
                var11_13 = var2_2.method_1019(var4_7.method_1021(var9_12));
                if (var12_5 || var12_5) ** GOTO lbl6
                if (this.isHole(var11_13.field_1352, var11_13.field_1350, var1_1.field_1351)) break block56;
                if (var12_5 || var12_5) ** GOTO lbl6
                return var11_13;
            }
            if (var12_5 || var12_5) ** GOTO lbl6
            if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    ++var8_11;
                    if (var12_5) ** GOTO lbl6
                    if (!var14_3) continue block31;
                    throw null;
                }
lbl41:
                // 1 sources

                if (!var12_5 && !var12_5) ** break;
                ** continue;
                return var1_1.method_1019(this.destination.method_1020(var1_1).method_1029().method_1021((double)w.vuv("xag", vxf(int ), (int)261)));
lbl44:
                // 2 sources

                case 0: {
                    var13_4 /* !! */  = (int)w.vuv("xah", vus(int ), (int)551);
                    if (var14_3) {
                        throw null;
                    }
                }
lbl48:
                // 5 sources

                case 1: {
                    var13_4 /* !! */  = (int)w.vuv("xai", vus(int ), (int)552);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl53:
                // 3 sources

                case 2: {
                    var13_4 /* !! */  = (int)w.vuv("xaj", vus(int ), (int)553);
                    if (!var14_3) ** GOTO lbl48
                    throw null;
                }
                case 3: {
                    var13_4 /* !! */  = (int)w.vuv("xak", vus(int ), (int)554);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl104
                }
                case 4: {
                    var13_4 /* !! */  = (int)w.vuv("xal", vus(int ), (int)555);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl72
                }
lbl67:
                // 2 sources

                case 5: {
                    var13_4 /* !! */  = (int)w.vuv("xam", vus(int ), (int)556);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl125
                }
lbl72:
                // 4 sources

                case 6: {
                    var13_4 /* !! */  = (int)w.vuv("xan", vus(int ), (int)557);
                    if (!var14_3) ** GOTO lbl44
                    throw null;
                }
lbl76:
                // 2 sources

                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_4 /* !! */  = (int)w.vuv("xao", vus(int ), (int)558);
                        if (var14_3) {
                            throw null;
                        }
                        ** GOTO lbl147
                        break;
                    }
                }
lbl82:
                // 2 sources

                case 8: {
                    var13_4 /* !! */  = (int)w.vuv("xap", vus(int ), (int)559);
                    if (!var14_3) ** GOTO lbl53
                    throw null;
                }
                case 9: {
                    var13_4 /* !! */  = (int)w.vuv("xaq", vus(int ), (int)560);
                    if (!var14_3) ** GOTO lbl53
                    throw null;
                }
                case 10: {
                    do {
                        var13_4 /* !! */  = (int)w.vuv("xar", vus(int ), (int)561);
                    } while (!var14_3);
                    throw null;
                }
                case 11: {
                    var13_4 /* !! */  = (int)w.vuv("xas", vus(int ), (int)562);
                    if (!var14_3) ** GOTO lbl76
                    throw null;
                }
                case 12: {
                    var13_4 /* !! */  = (int)w.vuv("xat", vus(int ), (int)563);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl159
                }
lbl104:
                // 2 sources

                case 13: {
                    var13_4 /* !! */  = (int)w.vuv("xau", vus(int ), (int)564);
                    if (!var14_3) ** GOTO lbl48
                    throw null;
                }
lbl108:
                // 3 sources

                case 14: {
                    var13_4 /* !! */  = (int)w.vuv("xav", vus(int ), (int)565);
                    if (!var14_3) ** GOTO lbl67
                    throw null;
                }
lbl112:
                // 2 sources

                case 15: {
                    var13_4 /* !! */  = (int)w.vuv("xaw", vus(int ), (int)566);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 16: {
                    var13_4 /* !! */  = (int)w.vuv("xax", vus(int ), (int)567);
                    if (!var14_3) ** GOTO lbl108
                    throw null;
                }
                case 17: {
                    var13_4 /* !! */  = (int)w.vuv("xay", vus(int ), (int)568);
                    if (!var14_3) ** GOTO lbl108
                    throw null;
                }
lbl125:
                // 4 sources

                case 18: {
                    var13_4 /* !! */  = (int)w.vuv("xaz", vus(int ), (int)569);
                    if (!var14_3) ** GOTO lbl82
                    throw null;
                }
lbl129:
                // 2 sources

                case 19: {
                    var13_4 /* !! */  = (int)w.vuv("xba", vus(int ), (int)570);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
                case 20: {
                    var13_4 /* !! */  = (int)w.vuv("xbb", vus(int ), (int)571);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
lbl139:
                // 2 sources

                case 21: {
                    var13_4 /* !! */  = (int)w.vuv("xbc", vus(int ), (int)572);
                    if (!var14_3) ** GOTO lbl72
                    throw null;
                }
                case 22: {
                    var13_4 /* !! */  = (int)w.vuv("xbd", vus(int ), (int)573);
                    if (!var14_3) ** GOTO lbl125
                    throw null;
                }
lbl147:
                // 2 sources

                case 23: {
                    var13_4 /* !! */  = (int)w.vuv("xbe", vus(int ), (int)574);
                    if (!var14_3) ** GOTO lbl129
                    throw null;
                }
lbl151:
                // 2 sources

                case 24: {
                    var13_4 /* !! */  = (int)w.vuv("xbf", vus(int ), (int)575);
                    if (!var14_3) ** GOTO lbl72
                    throw null;
                }
lbl155:
                // 3 sources

                case 25: {
                    var13_4 /* !! */  = (int)w.vuv("xbg", vus(int ), (int)576);
                    if (!var14_3) ** GOTO lbl125
                    throw null;
                }
lbl159:
                // 2 sources

                case 26: {
                    var13_4 /* !! */  = (int)w.vuv("xbh", vus(int ), (int)577);
                    if (!var14_3) ** GOTO lbl112
                    throw null;
                }
                case 27: 
            }
            break;
        }
        var13_4 /* !! */  = (int)w.vuv("xbi", vus(int ), (int)578);
        ** while (!var14_3)
lbl166:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isActive() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wpq", wbd(int ), (int)180)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == w.vuv("wpr", vus(int ), (int)356)) break;
            v0 /* !! */  = (long)w.vuv("wps", vus(int ), (int)357);
        }
        var3_1 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(w.vuv("wpu", wbd(int ), (int)182) - w.vuv("wpt", wbd(int ), (int)181));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -162782868: {
                    continue block11;
                }
                case 1952754353: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = w.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wpv", wbd(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == w.vuv("wpw", vus(int ), (int)358)) break;
            v2 /* !! */  = (long)w.vuv("wpx", vus(int ), (int)359);
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return (boolean)w.vuv("wpy", vus(int ), (int)360);
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
                    if ((v3 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wpz", wbd(int ), (int)184)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == w.vuv("wqa", vus(int ), (int)361)) break;
                    v3 /* !! */  = (long)w.vuv("wqb", vus(int ), (int)362);
                }
                return this.active;
            }
            case 0: {
                var2_2 /* !! */  = (int)w.vuv("wqc", vus(int ), (int)363);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl49
            }
lbl45:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)w.vuv("wqd", vus(int ), (int)364);
                if (var3_1) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)w.vuv("wqe", vus(int ), (int)365);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)w.vuv("wqf", vus(int ), (int)366);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean playerVolumeTouchesLava(class_243 var1_1) {
        var14_2 = w.c;
        var13_3 /* !! */  = w.b;
        var12_4 = w.a;
        if (var14_2) {
            throw null;
lbl6:
            // 26 sources

            return (boolean)w.vuv("yeh", vus(int ), (int)825);
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        var2_5 = (int)Math.floor(var1_1.field_1352 - w.vuv("yei", vxf(int ), (int)414));
        if (var12_4 || var12_4) ** GOTO lbl6
        var3_6 = (int)Math.floor(var1_1.field_1352 + w.vuv("yej", vxf(int ), (int)415));
        if (var12_4 || var12_4) ** GOTO lbl6
        var4_7 = (int)Math.floor(var1_1.field_1351 + w.vuv("yek", vxf(int ), (int)416));
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = (int)Math.floor(var1_1.field_1351 + w.vuv("yel", vxf(int ), (int)417));
                if (var12_4 || var12_4) ** GOTO lbl6
                var6_9 = (int)Math.floor(var1_1.field_1350 - w.vuv("yem", vxf(int ), (int)418));
                if (var12_4 || var12_4) ** GOTO lbl6
                var7_10 = (int)Math.floor(var1_1.field_1350 + w.vuv("yen", vxf(int ), (int)419));
                if (var12_4 || var12_4) ** GOTO lbl6
                var8_11 = new class_2338.class_2339();
                if (var12_4 || var12_4) ** GOTO lbl6
                var9_12 = var2_5;
                if (var12_4) ** GOTO lbl6
                do {
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (var9_12 > var3_6) ** GOTO lbl65
                    if (var12_4 || var12_4) ** GOTO lbl6
                    var10_13 = var4_7;
                    if (var12_4) ** GOTO lbl6
                    do {
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (var10_13 > var5_8) ** GOTO lbl60
                        if (var12_4 || var12_4) ** GOTO lbl6
                        var11_14 = var6_9;
                        if (var12_4) ** GOTO lbl6
                        do {
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (var11_14 > var7_10) ** GOTO lbl55
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var8_11.method_10103(var9_12, var10_13, var11_14);
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (!w.mc.field_1687.method_8316((class_2338)var8_11).method_15767(class_3486.field_15518)) ** GOTO lbl50
                            if (var12_4 || var12_4) ** GOTO lbl6
                            return (boolean)w.vuv("yeo", vus(int ), (int)826);
lbl50:
                            // 1 sources

                            if (var12_4 || var12_4) ** GOTO lbl6
                            ++var11_14;
                            if (var12_4) ** GOTO lbl6
                        } while (!var14_2);
                        throw null;
lbl55:
                        // 1 sources

                        if (var12_4 || var12_4) ** GOTO lbl6
                        ++var10_13;
                        if (var12_4) ** GOTO lbl6
                    } while (!var14_2);
                    throw null;
lbl60:
                    // 1 sources

                    if (var12_4 || var12_4) ** GOTO lbl6
                    ++var9_12;
                    if (var12_4) ** GOTO lbl6
                } while (!var14_2);
                throw null;
lbl65:
                // 1 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return (boolean)w.vuv("yep", vus(int ), (int)827);
            }
lbl68:
            // 3 sources

            case 0: {
                var13_3 /* !! */  = (int)w.vuv("yeq", vus(int ), (int)828);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl73:
            // 3 sources

            case 1: {
                var13_3 /* !! */  = (int)w.vuv("yer", vus(int ), (int)829);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 2: {
                var13_3 /* !! */  = (int)w.vuv("yes", vus(int ), (int)830);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl83:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)w.vuv("yet", vus(int ), (int)831);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl127
                    break;
                }
            }
            case 4: {
                var13_3 /* !! */  = (int)w.vuv("yeu", vus(int ), (int)832);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl94:
            // 2 sources

            case 5: {
                var13_3 /* !! */  = (int)w.vuv("yev", vus(int ), (int)833);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl99:
            // 3 sources

            case 6: {
                var13_3 /* !! */  = (int)w.vuv("yew", vus(int ), (int)834);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl104:
            // 2 sources

            case 7: {
                var13_3 /* !! */  = (int)w.vuv("yex", vus(int ), (int)835);
                if (!var14_2) ** GOTO lbl83
                throw null;
            }
lbl108:
            // 2 sources

            case 8: {
                var13_3 /* !! */  = (int)w.vuv("yey", vus(int ), (int)836);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl113:
            // 3 sources

            case 9: {
                var13_3 /* !! */  = (int)w.vuv("yez", vus(int ), (int)837);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl118:
            // 2 sources

            case 10: {
                var13_3 /* !! */  = (int)w.vuv("yfa", vus(int ), (int)838);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 11: {
                var13_3 /* !! */  = (int)w.vuv("yfb", vus(int ), (int)839);
                if (!var14_2) ** GOTO lbl73
                throw null;
            }
lbl127:
            // 3 sources

            case 12: {
                var13_3 /* !! */  = (int)w.vuv("yfc", vus(int ), (int)840);
                if (!var14_2) ** GOTO lbl73
                throw null;
            }
            case 13: {
                var13_3 /* !! */  = (int)w.vuv("yfd", vus(int ), (int)841);
                if (!var14_2) break;
                throw null;
            }
            case 14: {
                var13_3 /* !! */  = (int)w.vuv("yfe", vus(int ), (int)842);
                if (!var14_2) ** GOTO lbl68
                throw null;
            }
lbl139:
            // 3 sources

            case 15: {
                var13_3 /* !! */  = (int)w.vuv("yff", vus(int ), (int)843);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 16: {
                var13_3 /* !! */  = (int)w.vuv("yfg", vus(int ), (int)844);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl149:
            // 2 sources

            case 17: {
                var13_3 /* !! */  = (int)w.vuv("yfh", vus(int ), (int)845);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 18: {
                var13_3 /* !! */  = (int)w.vuv("yfi", vus(int ), (int)846);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 19: {
                var13_3 /* !! */  = (int)w.vuv("yfj", vus(int ), (int)847);
                if (!var14_2) ** GOTO lbl99
                throw null;
            }
lbl163:
            // 4 sources

            case 20: {
                var13_3 /* !! */  = (int)w.vuv("yfk", vus(int ), (int)848);
                if (!var14_2) ** GOTO lbl149
                throw null;
            }
lbl167:
            // 2 sources

            case 21: {
                var13_3 /* !! */  = (int)w.vuv("yfl", vus(int ), (int)849);
                if (var14_2) {
                    throw null;
                }
            }
lbl171:
            // 6 sources

            case 22: {
                var13_3 /* !! */  = (int)w.vuv("yfm", vus(int ), (int)850);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 23: {
                var13_3 /* !! */  = (int)w.vuv("yfn", vus(int ), (int)851);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl181:
            // 3 sources

            case 24: {
                var13_3 /* !! */  = (int)w.vuv("yfo", vus(int ), (int)852);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 25: {
                var13_3 /* !! */  = (int)w.vuv("yfp", vus(int ), (int)853);
                if (!var14_2) ** GOTO lbl139
                throw null;
            }
lbl190:
            // 2 sources

            case 26: {
                var13_3 /* !! */  = (int)w.vuv("yfq", vus(int ), (int)854);
                if (!var14_2) ** GOTO lbl139
                throw null;
            }
            case 27: {
                var13_3 /* !! */  = (int)w.vuv("yfr", vus(int ), (int)855);
                if (!var14_2) ** GOTO lbl171
                throw null;
            }
            case 28: {
                var13_3 /* !! */  = (int)w.vuv("yfs", vus(int ), (int)856);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl203:
            // 2 sources

            case 29: {
                var13_3 /* !! */  = (int)w.vuv("yft", vus(int ), (int)857);
                if (!var14_2) ** GOTO lbl99
                throw null;
            }
lbl207:
            // 2 sources

            case 30: {
                var13_3 /* !! */  = (int)w.vuv("yfu", vus(int ), (int)858);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl212:
            // 3 sources

            case 31: {
                var13_3 /* !! */  = (int)w.vuv("yfv", vus(int ), (int)859);
                if (!var14_2) ** GOTO lbl163
                throw null;
            }
            case 32: {
                var13_3 /* !! */  = (int)w.vuv("yfw", vus(int ), (int)860);
                if (!var14_2) ** GOTO lbl163
                throw null;
            }
            case 33: {
                var13_3 /* !! */  = (int)w.vuv("yfx", vus(int ), (int)861);
                if (!var14_2) ** GOTO lbl171
                throw null;
            }
            case 34: {
                var13_3 /* !! */  = (int)w.vuv("yfy", vus(int ), (int)862);
                if (!var14_2) ** GOTO lbl181
                throw null;
            }
            case 35: {
                var13_3 /* !! */  = (int)w.vuv("yfz", vus(int ), (int)863);
                if (!var14_2) ** GOTO lbl94
                throw null;
            }
            case 36: {
                var13_3 /* !! */  = (int)w.vuv("yga", vus(int ), (int)864);
                if (!var14_2) ** GOTO lbl163
                throw null;
            }
lbl236:
            // 3 sources

            case 37: {
                var13_3 /* !! */  = (int)w.vuv("ygb", vus(int ), (int)865);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl241:
            // 2 sources

            case 38: {
                var13_3 /* !! */  = (int)w.vuv("ygc", vus(int ), (int)866);
                if (!var14_2) ** GOTO lbl68
                throw null;
            }
lbl245:
            // 3 sources

            case 39: {
                var13_3 /* !! */  = (int)w.vuv("ygd", vus(int ), (int)867);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 40: {
                var13_3 /* !! */  = (int)w.vuv("yge", vus(int ), (int)868);
                if (!var14_2) ** GOTO lbl118
                throw null;
            }
lbl254:
            // 4 sources

            case 41: {
                var13_3 /* !! */  = (int)w.vuv("ygf", vus(int ), (int)869);
                if (!var14_2) ** GOTO lbl108
                throw null;
            }
            case 42: {
                var13_3 /* !! */  = (int)w.vuv("ygg", vus(int ), (int)870);
                if (!var14_2) ** GOTO lbl104
                throw null;
            }
lbl262:
            // 2 sources

            case 43: {
                var13_3 /* !! */  = (int)w.vuv("ygh", vus(int ), (int)871);
                if (!var14_2) ** GOTO lbl245
                throw null;
            }
            case 44: {
                var13_3 /* !! */  = (int)w.vuv("ygi", vus(int ), (int)872);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 45: {
                var13_3 /* !! */  = (int)w.vuv("ygj", vus(int ), (int)873);
                if (!var14_2) ** GOTO lbl171
                throw null;
            }
lbl275:
            // 3 sources

            case 46: {
                var13_3 /* !! */  = (int)w.vuv("ygk", vus(int ), (int)874);
                if (!var14_2) ** GOTO lbl181
                throw null;
            }
lbl279:
            // 3 sources

            case 47: {
                var13_3 /* !! */  = (int)w.vuv("ygl", vus(int ), (int)875);
                if (!var14_2) ** GOTO lbl167
                throw null;
            }
lbl283:
            // 3 sources

            case 48: {
                var13_3 /* !! */  = (int)w.vuv("ygm", vus(int ), (int)876);
                if (!var14_2) ** GOTO lbl190
                throw null;
            }
            case 49: 
        }
        var13_3 /* !! */  = (int)w.vuv("ygn", vus(int ), (int)877);
        ** while (!var14_2)
lbl290:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void initializeDirectProgress(class_243 var1_1) {
        v0 /* !! */  = w.bh;
        if (true) ** GOTO lbl5
        block83: while (true) {
            v0 /* !! */  = (long)(w.vuv("xlk", wbd(int ), (int)360) - w.vuv("xlj", wbd(int ), (int)359));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -941793342: {
                    continue block83;
                }
                case 1952754353: {
                    break block83;
                }
            }
            break;
        }
        var6_2 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl15
        block84: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("xll", wbd(int ), (int)361));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1914818842: {
                    v2 = w.vuv("xlm", wbd(int ), (int)362);
                    continue block84;
                }
                case -1302846203: {
                    v2 = w.vuv("xln", wbd(int ), (int)363);
                    continue block84;
                }
                case 1952754353: {
                    break block84;
                }
                case 2030907097: {
                    v2 = w.vuv("xlo", wbd(int ), (int)364);
                    continue block84;
                }
            }
            break;
        }
        var5_3 /* !! */  = w.b;
        v3 /* !! */  = w.bh;
        if (true) ** GOTO lbl32
        block85: while (true) {
            v3 /* !! */  = (long)(v4 - w.vuv("xlp", wbd(int ), (int)365));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1213078747: {
                    v4 = w.vuv("xlq", wbd(int ), (int)366);
                    continue block85;
                }
                case 1405144079: {
                    v4 = w.vuv("xlr", wbd(int ), (int)367);
                    continue block85;
                }
                case 1952754353: {
                    break block85;
                }
            }
            break;
        }
        var4_4 = w.a;
        if (var6_2) {
            throw null;
lbl44:
            // 8 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl44
        v5 /* !! */  = w.bh;
        if (true) ** GOTO lbl51
        block87: while (true) {
            v5 /* !! */  = (long)(v6 - w.vuv("xls", wbd(int ), (int)368));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 137812258: {
                    v6 = w.vuv("xlt", wbd(int ), (int)369);
                    continue block87;
                }
                case 495565665: {
                    v6 = w.vuv("xlu", wbd(int ), (int)370);
                    continue block87;
                }
                case 806105345: {
                    v6 = w.vuv("xlv", wbd(int ), (int)371);
                    continue block87;
                }
                case 1952754353: {
                    break block87;
                }
            }
            break;
        }
        v7 /* !! */  = w.bh;
        if (true) ** GOTO lbl67
        block88: while (true) {
            v7 /* !! */  = (long)(v8 - w.vuv("xlw", wbd(int ), (int)372));
lbl67:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1724789603: {
                    v8 = w.vuv("xlx", wbd(int ), (int)373);
                    continue block88;
                }
                case 1803754435: {
                    v8 = w.vuv("xly", wbd(int ), (int)374);
                    continue block88;
                }
                case 1952754353: {
                    break block88;
                }
            }
            break;
        }
        v9 = w.mc.field_1724;
        v10 /* !! */  = w.bh;
        if (true) ** GOTO lbl81
        block89: while (true) {
            v10 /* !! */  = (long)(v11 - w.vuv("xlz", wbd(int ), (int)375));
lbl81:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 1214473988: {
                    v11 = w.vuv("xma", wbd(int ), (int)376);
                    continue block89;
                }
                case 1354839190: {
                    v11 = w.vuv("xmb", wbd(int ), (int)377);
                    continue block89;
                }
                case 1952754353: {
                    break block89;
                }
            }
            break;
        }
        v12 = v9.method_73189();
        v13 /* !! */  = w.bh;
        if (true) ** GOTO lbl95
        block90: while (true) {
            v13 /* !! */  = (long)(w.vuv("xmd", wbd(int ), (int)379) - w.vuv("xmc", wbd(int ), (int)378));
lbl95:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 18710311: {
                    continue block90;
                }
                case 1952754353: {
                    break block90;
                }
            }
            break;
        }
        var2_5 = v12.method_1022(var1_1);
        if (var4_4 || var4_4) ** GOTO lbl44
        v14 /* !! */  = w.bh;
        if (true) ** GOTO lbl106
        block91: while (true) {
            v14 /* !! */  = (long)(v15 - w.vuv("xme", wbd(int ), (int)380));
lbl106:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1857480821: {
                    v15 = w.vuv("xmf", wbd(int ), (int)381);
                    continue block91;
                }
                case 572261990: {
                    v15 = w.vuv("xmg", wbd(int ), (int)382);
                    continue block91;
                }
                case 1248976827: {
                    v15 = w.vuv("xmh", wbd(int ), (int)383);
                    continue block91;
                }
                case 1952754353: {
                    break block91;
                }
            }
            break;
        }
        this.directBestDistance = var2_5;
        if (var4_4 || var4_4) ** GOTO lbl44
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("xmi", wbd(int ), (int)384)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == w.vuv("xmj", vus(int ), (int)742)) break;
            v16 /* !! */  = (long)w.vuv("xmk", vus(int ), (int)743);
        }
        this.directExpectedDistance = var2_5;
        if (var4_4 || var4_4) ** GOTO lbl44
        v17 = w.vuv("xml", vus(int ), (int)744);
        v18 = var2_5 / w.vuv("xmm", vxf(int ), (int)385);
        v19 /* !! */  = w.bh;
        if (true) ** GOTO lbl133
        block93: while (true) {
            v19 /* !! */  = (long)(w.vuv("xmo", wbd(int ), (int)387) - w.vuv("xmn", wbd(int ), (int)386));
lbl133:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -923298033: {
                    continue block93;
                }
                case 1952754353: {
                    break block93;
                }
            }
            break;
        }
        v20 = (int)Math.ceil(v18) + w.vuv("xmp", vus(int ), (int)745);
        v21 /* !! */  = w.bh;
        if (true) ** GOTO lbl143
        block94: while (true) {
            v21 /* !! */  = (long)(v22 - w.vuv("xmq", wbd(int ), (int)388));
lbl143:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1086427895: {
                    v22 = w.vuv("xmr", wbd(int ), (int)389);
                    continue block94;
                }
                case -238333236: {
                    v22 = w.vuv("yai", wbd(int ), (int)390);
                    continue block94;
                }
                case 682913335: {
                    v22 = w.vuv("yaj", wbd(int ), (int)391);
                    continue block94;
                }
                case 1952754353: {
                    break block94;
                }
            }
            break;
        }
        v23 = Math.max((int)v17, v20);
        v24 /* !! */  = w.bh;
        if (true) ** GOTO lbl160
        block95: while (true) {
            v24 /* !! */  = (long)(v25 - w.vuv("yak", wbd(int ), (int)392));
lbl160:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case 435025015: {
                    v25 = w.vuv("yal", wbd(int ), (int)393);
                    continue block95;
                }
                case 818448540: {
                    v25 = w.vuv("yam", wbd(int ), (int)394);
                    continue block95;
                }
                case 1952754353: {
                    break block95;
                }
            }
            break;
        }
        this.directMaxSteps = v23;
        if (var4_4 || var4_4) ** GOTO lbl44
        v26 = w.vuv("yan", vus(int ), (int)746);
        v27 /* !! */  = w.bh;
        if (true) ** GOTO lbl176
        block96: while (true) {
            v27 /* !! */  = (long)(v28 - w.vuv("yao", wbd(int ), (int)395));
lbl176:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -803806655: {
                    v28 = w.vuv("yap", wbd(int ), (int)396);
                    continue block96;
                }
                case -395514930: {
                    v28 = w.vuv("yaq", wbd(int ), (int)397);
                    continue block96;
                }
                case 1952754353: {
                    break block96;
                }
            }
            break;
        }
        this.directNoProgressTicks = (int)v26;
        if (var4_4) ** GOTO lbl44
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl44
                v29 = w.vuv("yar", vus(int ), (int)747);
                v30 /* !! */  = w.bh;
                if (true) ** GOTO lbl196
                block97: while (true) {
                    v30 /* !! */  = (long)(w.vuv("yat", wbd(int ), (int)399) - w.vuv("yas", wbd(int ), (int)398));
lbl196:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 24798233: {
                            continue block97;
                        }
                        case 1952754353: {
                            break block97;
                        }
                    }
                    break;
                }
                this.directCorrections = (int)v29;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl205:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)w.vuv("yau", vus(int ), (int)748);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 1: {
                var5_3 /* !! */  = (int)w.vuv("yav", vus(int ), (int)749);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl215:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)w.vuv("yaw", vus(int ), (int)750);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl220:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)w.vuv("yax", vus(int ), (int)751);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
            case 4: {
                var5_3 /* !! */  = (int)w.vuv("yay", vus(int ), (int)752);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 5: {
                var5_3 /* !! */  = (int)w.vuv("yaz", vus(int ), (int)753);
                if (var6_2) {
                    throw null;
                }
            }
            case 6: {
                var5_3 /* !! */  = (int)w.vuv("yba", vus(int ), (int)754);
                if (!var6_2) ** GOTO lbl220
                throw null;
            }
lbl237:
            // 5 sources

            case 7: {
                var5_3 /* !! */  = (int)w.vuv("ybb", vus(int ), (int)755);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl242:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)w.vuv("ybc", vus(int ), (int)756);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 9: {
                var5_3 /* !! */  = (int)w.vuv("ybd", vus(int ), (int)757);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 10: {
                var5_3 /* !! */  = (int)w.vuv("ybe", vus(int ), (int)758);
                if (!var6_2) ** GOTO lbl237
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)w.vuv("ybf", vus(int ), (int)759);
                if (!var6_2) ** GOTO lbl237
                throw null;
            }
lbl260:
            // 6 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)w.vuv("ybg", vus(int ), (int)760);
                    if (!var6_2) ** GOTO lbl242
                    throw null;
                }
            }
lbl265:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)w.vuv("ybh", vus(int ), (int)761);
                if (!var6_2) ** GOTO lbl237
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)w.vuv("ybi", vus(int ), (int)762);
                if (!var6_2) ** GOTO lbl265
                throw null;
            }
            case 15: 
        }
        var5_3 /* !! */  = (int)w.vuv("ybj", vus(int ), (int)763);
        ** while (!var6_2)
lbl276:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block87: {
            block86: {
                block85: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wco", wbd(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == w.vuv("wcp", vus(int ), (int)173)) break;
                        v0 /* !! */  = (long)w.vuv("wcq", vus(int ), (int)174);
                    }
                    var7_3 = w.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wcr", wbd(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == w.vuv("wcs", vus(int ), (int)175)) break;
                        v1 /* !! */  = (long)w.vuv("wct", vus(int ), (int)176);
                    }
                    var6_4 = w.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wcu", wbd(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == w.vuv("wcv", vus(int ), (int)177)) break;
                        v2 /* !! */  = (long)w.vuv("wcw", vus(int ), (int)178);
                    }
                    var5_5 = w.a;
                    if (var7_3) {
                        throw null;
lbl21:
                        // 7 sources

                        return null;
                    }
                    if (var5_5 || var5_5) ** GOTO lbl21
                    if (var2_2.length == w.vuv("wcx", vus(int ), (int)179)) break block85;
                    if (var5_5 || var5_5) ** GOTO lbl21
                    v3 /* !! */  = w.bh;
                    if (true) ** GOTO lbl30
                    block63: while (true) {
                        v3 /* !! */  = (long)(w.vuv("wcz", wbd(int ), (int)27) - w.vuv("wcy", wbd(int ), (int)26));
lbl30:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -400692950: {
                                continue block63;
                            }
                            case 1952754353: {
                                break block63;
                            }
                        }
                        break;
                    }
                    return Stream.empty();
                }
                if (var5_5 || var5_5) ** GOTO lbl21
                v4 = var2_2[0];
                v5 /* !! */  = w.bh;
                if (true) ** GOTO lbl43
                block64: while (true) {
                    v5 /* !! */  = (long)(v6 - w.vuv("wda", wbd(int ), (int)28));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -413719087: {
                            v6 = w.vuv("wdb", wbd(int ), (int)29);
                            continue block64;
                        }
                        case 1103683108: {
                            v6 = w.vuv("wdc", wbd(int ), (int)30);
                            continue block64;
                        }
                        case 1407912470: {
                            v6 = w.vuv("wdd", wbd(int ), (int)31);
                            continue block64;
                        }
                        case 1952754353: {
                            break block64;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wde", wbd(int ), (int)32)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == w.vuv("wdf", vus(int ), (int)180)) break;
                    v7 /* !! */  = (long)w.vuv("wdg", vus(int ), (int)181);
                }
                var3_6 = v4.toLowerCase(Locale.ROOT);
                if (var5_5 || var5_5) ** GOTO lbl21
                v8 /* !! */  = w.bh;
                if (true) ** GOTO lbl66
                block66: while (true) {
                    v8 /* !! */  = (long)(v9 - w.vuv("wdh", wbd(int ), (int)33));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1532312577: {
                            v9 = w.vuv("wdi", wbd(int ), (int)34);
                            continue block66;
                        }
                        case 203073656: {
                            v9 = w.vuv("wdj", wbd(int ), (int)35);
                            continue block66;
                        }
                        case 0x38EE883E: {
                            v9 = w.vuv("wdk", wbd(int ), (int)36);
                            continue block66;
                        }
                        case 1952754353: {
                            break block66;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("wdl", wbd(int ), (int)37)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == w.vuv("wdm", vus(int ), (int)182)) break;
                    v10 /* !! */  = (long)w.vuv("wdn", vus(int ), (int)183);
                }
                if (w.mc.field_1687 != null) break block86;
                if (var5_5) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("wdo", wbd(int ), (int)38)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == w.vuv("wdp", vus(int ), (int)184)) break;
                    v11 /* !! */  = (long)w.vuv("wdq", vus(int ), (int)185);
                }
                v12 /* !! */  = Stream.empty();
                if (var7_3) {
                    throw null;
                }
                break block87;
            }
            if (var5_5 || var5_5) ** GOTO lbl21
            v13 /* !! */  = w.bh;
            if (true) ** GOTO lbl100
            block69: while (true) {
                v13 /* !! */  = (long)(v14 - w.vuv("wdr", wbd(int ), (int)39));
lbl100:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -593470754: {
                        v14 = w.vuv("wds", wbd(int ), (int)40);
                        continue block69;
                    }
                    case -277774232: {
                        v14 = w.vuv("wdt", wbd(int ), (int)41);
                        continue block69;
                    }
                    case 1250704348: {
                        v14 = w.vuv("wdu", wbd(int ), (int)42);
                        continue block69;
                    }
                    case 1952754353: {
                        break block69;
                    }
                }
                break;
            }
            v15 /* !! */  = w.bh;
            if (true) ** GOTO lbl116
            block70: while (true) {
                v15 /* !! */  = (long)(v16 - w.vuv("wdv", wbd(int ), (int)43));
lbl116:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1653993561: {
                        v16 = w.vuv("wdw", wbd(int ), (int)44);
                        continue block70;
                    }
                    case -861976303: {
                        v16 = w.vuv("wdx", wbd(int ), (int)45);
                        continue block70;
                    }
                    case 1952754353: {
                        break block70;
                    }
                }
                break;
            }
            v17 = w.mc.field_1687;
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("wdy", wbd(int ), (int)46)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == w.vuv("wdz", vus(int ), (int)186)) break;
                v18 /* !! */  = (long)w.vuv("wea", vus(int ), (int)187);
            }
            v19 = v17.method_18456();
            v20 /* !! */  = w.bh;
            if (true) ** GOTO lbl136
            block72: while (true) {
                v20 /* !! */  = (long)(v21 - w.vuv("web", wbd(int ), (int)47));
lbl136:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -112557401: {
                        v21 = w.vuv("wec", wbd(int ), (int)48);
                        continue block72;
                    }
                    case 224241878: {
                        v21 = w.vuv("wed", wbd(int ), (int)49);
                        continue block72;
                    }
                    case 512891136: {
                        v21 = w.vuv("wee", wbd(int ), (int)50);
                        continue block72;
                    }
                    case 1952754353: {
                        break block72;
                    }
                }
                break;
            }
            v22 = v19.stream();
            v23 /* !! */  = w.bh;
            if (true) ** GOTO lbl153
            block73: while (true) {
                v23 /* !! */  = (long)(w.vuv("weg", wbd(int ), (int)52) - w.vuv("wef", wbd(int ), (int)51));
lbl153:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1051542733: {
                        continue block73;
                    }
                    case 1952754353: {
                        break block73;
                    }
                }
                break;
            }
            v24 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$tabComplete$0(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_7 = w.bh - w.vuv("weh", wbd(int ), (int)53)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == w.vuv("wei", vus(int ), (int)188)) break;
                v25 /* !! */  = (long)w.vuv("wej", vus(int ), (int)189);
            }
            v26 = v22.filter(v24);
            v27 /* !! */  = w.bh;
            if (true) ** GOTO lbl169
            block75: while (true) {
                v27 /* !! */  = (long)(v28 - w.vuv("wek", wbd(int ), (int)54));
lbl169:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -601330490: {
                        v28 = w.vuv("wel", wbd(int ), (int)55);
                        continue block75;
                    }
                    case -378978349: {
                        v28 = w.vuv("wem", wbd(int ), (int)56);
                        continue block75;
                    }
                    case 1952754353: {
                        break block75;
                    }
                }
                break;
            }
            v29 = (Function<class_742, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$tabComplete$1(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Ljava/lang/String;)();
            v30 /* !! */  = w.bh;
            if (true) ** GOTO lbl183
            block76: while (true) {
                v30 /* !! */  = (long)(v31 - w.vuv("wen", wbd(int ), (int)57));
lbl183:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -704050236: {
                        v31 = w.vuv("weo", wbd(int ), (int)58);
                        continue block76;
                    }
                    case -617254307: {
                        v31 = w.vuv("wep", wbd(int ), (int)59);
                        continue block76;
                    }
                    case 48098165: {
                        v31 = w.vuv("weq", wbd(int ), (int)60);
                        continue block76;
                    }
                    case 1952754353: {
                        break block76;
                    }
                }
                break;
            }
            v12 /* !! */  = var4_7 = v26.map(v29);
        }
        if (!var5_5 && !var5_5) ** break;
        ** while (true)
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_8 = w.bh - w.vuv("wer", wbd(int ), (int)61)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == w.vuv("wes", vus(int ), (int)190)) break;
            v32 /* !! */  = (long)w.vuv("wet", vus(int ), (int)191);
        }
        v33 = Stream.of("stop");
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_9 = w.bh - w.vuv("weu", wbd(int ), (int)62)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == w.vuv("wev", vus(int ), (int)192)) break;
            v34 /* !! */  = (long)w.vuv("wew", vus(int ), (int)193);
        }
        v35 = Stream.concat(v33, var4_7);
        v36 /* !! */  = w.bh;
        if (true) ** GOTO lbl215
        block79: while (true) {
            v36 /* !! */  = (long)(v37 - w.vuv("wex", wbd(int ), (int)63));
lbl215:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case -1724034499: {
                    v37 = w.vuv("wey", wbd(int ), (int)64);
                    continue block79;
                }
                case 1239979674: {
                    v37 = w.vuv("wez", wbd(int ), (int)65);
                    continue block79;
                }
                case 1952754353: {
                    break block79;
                }
            }
            break;
        }
        v38 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$tabComplete$2(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((String)var3_6);
        v39 /* !! */  = w.bh;
        if (true) ** GOTO lbl229
        block80: while (true) {
            v39 /* !! */  = (long)(v40 - w.vuv("wfa", wbd(int ), (int)66));
lbl229:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case -747283127: {
                    v40 = w.vuv("wfb", wbd(int ), (int)67);
                    continue block80;
                }
                case 499933721: {
                    v40 = w.vuv("wfc", wbd(int ), (int)68);
                    continue block80;
                }
                case 1585017439: {
                    v40 = w.vuv("wfd", wbd(int ), (int)69);
                    continue block80;
                }
                case 1952754353: {
                    break block80;
                }
            }
            break;
        }
        v41 = v35.filter(v38);
        while (true) {
            if ((v42 /* !! */  = (cfr_temp_10 = w.bh - w.vuv("wfe", wbd(int ), (int)70)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v42 /* !! */  == w.vuv("wff", vus(int ), (int)194)) break;
            v42 /* !! */  = (long)w.vuv("wfg", vus(int ), (int)195);
        }
        while (true) {
            if ((v43 /* !! */  = (cfr_temp_11 = w.bh - w.vuv("wfh", wbd(int ), (int)71)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v43 /* !! */  == w.vuv("wfi", vus(int ), (int)196)) break;
            v43 /* !! */  = (long)w.vuv("wfj", vus(int ), (int)197);
        }
        return v41.sorted(String.CASE_INSENSITIVE_ORDER);
    }

    public w() {
        int n2 = b;
        super("exploit", "\u041f\u043e\u0448\u0430\u0433\u043e\u0432\u043e\u0435 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u0435 \u043a \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c \u0438\u043b\u0438 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u043c\u0443 \u0438\u0433\u0440\u043e\u043a\u0443", "exp");
    }

    private static /* synthetic */ void yur() {
        w.vuu[800] = -1501275733;
        w.vuu[801] = 1484964116;
        w.vuu[802] = -341659040;
        w.vuu[803] = -1808753453;
        w.vuu[804] = 1170178901;
        w.vuu[805] = 1908936270;
        w.vuu[806] = 322389232;
        w.vuu[807] = -1521453050;
        w.vuu[808] = 1306446879;
        w.vuu[809] = -785323731;
        w.vuu[810] = 650883190;
        w.vuu[811] = -77279333;
        w.vuu[812] = 717179945;
        w.vuu[813] = 1066947721;
        w.vuu[814] = -1280990376;
        w.vuu[815] = -1177171612;
        w.vuu[816] = -844692928;
        w.vuu[817] = 456359737;
        w.vuu[818] = 1290538576;
        w.vuu[819] = 1538751120;
        w.vuu[820] = 2054122555;
        w.vuu[821] = 734953124;
        w.vuu[822] = -778859152;
        w.vuu[823] = 662451811;
        w.vuu[824] = -485047897;
        w.vuu[825] = 562142872;
        w.vuu[826] = -1496662056;
        w.vuu[827] = -2069596537;
        w.vuu[828] = -1846201113;
        w.vuu[829] = -730804495;
        w.vuu[830] = -537901961;
        w.vuu[831] = -982414352;
        w.vuu[832] = 1537651820;
        w.vuu[833] = -1597758499;
        w.vuu[834] = 384732230;
        w.vuu[835] = -1018775540;
        w.vuu[836] = 1451575207;
        w.vuu[837] = -14224819;
        w.vuu[838] = -2049582029;
        w.vuu[839] = -1504848556;
        w.vuu[840] = 338159859;
        w.vuu[841] = -1832378621;
        w.vuu[842] = 1844442529;
        w.vuu[843] = -1772501258;
        w.vuu[844] = -1783737729;
        w.vuu[845] = -1044766524;
        w.vuu[846] = -353141328;
        w.vuu[847] = 21006535;
        w.vuu[848] = 2002714925;
        w.vuu[849] = -1610411151;
        w.vuu[850] = 1752175809;
        w.vuu[851] = -592328073;
        w.vuu[852] = -194510404;
        w.vuu[853] = 372402263;
        w.vuu[854] = -244981192;
        w.vuu[855] = -2113959419;
        w.vuu[856] = -1325601752;
        w.vuu[857] = 1479591877;
        w.vuu[858] = -672950141;
        w.vuu[859] = 800153973;
        w.vuu[860] = -137449136;
        w.vuu[861] = 2134112222;
        w.vuu[862] = 112342363;
        w.vuu[863] = 1427274688;
        w.vuu[864] = -662692135;
        w.vuu[865] = 2114575537;
        w.vuu[866] = -775552438;
        w.vuu[867] = -898276084;
        w.vuu[868] = 293879122;
        w.vuu[869] = 2123031942;
        w.vuu[870] = 799054188;
        w.vuu[871] = -1394071011;
        w.vuu[872] = 117566616;
        w.vuu[873] = 1664449402;
        w.vuu[874] = -699927943;
        w.vuu[875] = 549878538;
        w.vuu[876] = -64331140;
        w.vuu[877] = -570866354;
        w.vuu[878] = -81367134;
        w.vuu[879] = -1772989317;
        w.vuu[880] = -323371590;
        w.vuu[881] = 1563399162;
        w.vuu[882] = 147101292;
        w.vuu[883] = 2033812659;
        w.vuu[884] = -2125679424;
        w.vuu[885] = -362297400;
        w.vuu[886] = -1145696860;
        w.vuu[887] = 155314454;
        w.vuu[888] = -1140345996;
        w.vuu[889] = 303520897;
        w.vuu[890] = 1949473273;
        w.vuu[891] = 781385371;
        w.vuu[892] = -2058608061;
        w.vuu[893] = 2066488636;
        w.vuu[894] = 885533662;
        w.vuu[895] = 0x18F18818;
        w.vuu[896] = 933354244;
        w.vuu[897] = 2064982991;
        w.vuu[898] = -1087193880;
        w.vuu[899] = -1686978460;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void failAutomatedRoute() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("ybk", wbd(int ), (int)400)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == w.vuv("ybl", vus(int ), (int)764)) break;
            v0 /* !! */  = (long)w.vuv("ybm", vus(int ), (int)765);
        }
        var3_1 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("ybn", wbd(int ), (int)401));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 590228049: {
                    v2 = w.vuv("ybo", wbd(int ), (int)402);
                    continue block21;
                }
                case 892374207: {
                    v2 = w.vuv("ybp", wbd(int ), (int)403);
                    continue block21;
                }
                case 1952754353: {
                    break block21;
                }
            }
            break;
        }
        var2_2 = w.b;
        v3 /* !! */  = w.bh;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - w.vuv("ybq", wbd(int ), (int)404));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 314355395: {
                    v4 = w.vuv("ybr", wbd(int ), (int)405);
                    continue block22;
                }
                case 1952754353: {
                    break block22;
                }
                case 2017702512: {
                    v4 = w.vuv("ybs", wbd(int ), (int)406);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = w.a;
        if (var3_1) {
            throw null;
lbl38:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl38
        v5 = w.vuv("ybt", vus(int ), (int)766);
        v6 /* !! */  = w.bh;
        if (true) ** GOTO lbl46
        block24: while (true) {
            v6 /* !! */  = (long)(w.vuv("ybv", wbd(int ), (int)408) - w.vuv("ybu", wbd(int ), (int)407));
lbl46:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -693514896: {
                    continue block24;
                }
                case 1952754353: {
                    break block24;
                }
            }
            break;
        }
        this.stop((boolean)v5);
        if (var1_3 || var1_3) ** GOTO lbl38
        v7 = w.vuv("ybw", vus(int ), (int)767);
        v8 /* !! */  = w.bh;
        if (true) ** GOTO lbl58
        block25: while (true) {
            v8 /* !! */  = (long)(v9 - w.vuv("ybx", wbd(int ), (int)409));
lbl58:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2049500281: {
                    v9 = w.vuv("yby", wbd(int ), (int)410);
                    continue block25;
                }
                case -309301419: {
                    v9 = w.vuv("ybz", wbd(int ), (int)411);
                    continue block25;
                }
                case 1781078188: {
                    v9 = w.vuv("yca", wbd(int ), (int)412);
                    continue block25;
                }
                case 1952754353: {
                    break block25;
                }
            }
            break;
        }
        this.automatedRouteFailed = v7;
        ** while (var1_3 || var1_3)
lbl72:
        // 1 sources

    }

    private static /* synthetic */ void yqi() {
        w.vut[800] = -1501275729;
        w.vut[801] = 1484964104;
        w.vut[802] = -341659023;
        w.vut[803] = -1808753445;
        w.vut[804] = 1170178928;
        w.vut[805] = 1908936272;
        w.vut[806] = 322389245;
        w.vut[807] = -1521453054;
        w.vut[808] = 1306446851;
        w.vut[809] = -785323765;
        w.vut[810] = 650883183;
        w.vut[811] = -77279346;
        w.vut[812] = 717179962;
        w.vut[813] = 1066947727;
        w.vut[814] = -1280990394;
        w.vut[815] = -1177171599;
        w.vut[816] = -844692923;
        w.vut[817] = 456359734;
        w.vut[818] = 1290538563;
        w.vut[819] = 1538751125;
        w.vut[820] = 2054122532;
        w.vut[821] = 734953124;
        w.vut[822] = -778859182;
        w.vut[823] = 662451834;
        w.vut[824] = -485047883;
        w.vut[825] = 562142872;
        w.vut[826] = -1496662055;
        w.vut[827] = -2069596537;
        w.vut[828] = -1846201149;
        w.vut[829] = -730804502;
        w.vut[830] = -537901979;
        w.vut[831] = -982414379;
        w.vut[832] = 1537651824;
        w.vut[833] = -1597758505;
        w.vut[834] = 384732247;
        w.vut[835] = -1018775537;
        w.vut[836] = 1451575218;
        w.vut[837] = -14224829;
        w.vut[838] = -2049582027;
        w.vut[839] = -1504848567;
        w.vut[840] = 338159861;
        w.vut[841] = -1832378579;
        w.vut[842] = 1844442533;
        w.vut[843] = -1772501271;
        w.vut[844] = -1783737750;
        w.vut[845] = -1044766490;
        w.vut[846] = -353141319;
        w.vut[847] = 21006571;
        w.vut[848] = 2002714884;
        w.vut[849] = -1610411160;
        w.vut[850] = 1752175819;
        w.vut[851] = -592328086;
        w.vut[852] = -194510451;
        w.vut[853] = 372402263;
        w.vut[854] = -244981224;
        w.vut[855] = -2113959377;
        w.vut[856] = -1325601751;
        w.vut[857] = 1479591917;
        w.vut[858] = -672950124;
        w.vut[859] = 800153948;
        w.vut[860] = -137449133;
        w.vut[861] = 2134112197;
        w.vut[862] = 112342360;
        w.vut[863] = 1427274700;
        w.vut[864] = -662692097;
        w.vut[865] = 2114575513;
        w.vut[866] = -775552434;
        w.vut[867] = -898276089;
        w.vut[868] = 293879111;
        w.vut[869] = 2123031981;
        w.vut[870] = 799054146;
        w.vut[871] = -1394070980;
        w.vut[872] = 117566652;
        w.vut[873] = 1664449370;
        w.vut[874] = -699927962;
        w.vut[875] = 549878561;
        w.vut[876] = -64331161;
        w.vut[877] = -570866353;
        w.vut[878] = 81367133;
        w.vut[879] = 2139838030;
        w.vut[880] = 323371589;
        w.vut[881] = 1436552853;
        w.vut[882] = -147101293;
        w.vut[883] = 961181391;
        w.vut[884] = 2125679423;
        w.vut[885] = -180196361;
        w.vut[886] = 1145696859;
        w.vut[887] = -1179202104;
        w.vut[888] = 1140345995;
        w.vut[889] = 1004417551;
        w.vut[890] = -1949473274;
        w.vut[891] = 1517952181;
        w.vut[892] = 2058608060;
        w.vut[893] = -1008205641;
        w.vut[894] = -885533663;
        w.vut[895] = -636885650;
        w.vut[896] = -933354245;
        w.vut[897] = -875905546;
        w.vut[898] = 1087193879;
        w.vut[899] = -2100298805;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onWorldChange(dh var1_1) {
        v0 /* !! */  = w.bh;
        block22: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1698118390: {
                    v0 /* !! */  = (long)(w.vuv("wbf", wbd(int ), (int)8) - w.vuv("wbe", wbd(int ), (int)7));
                    continue block22;
                }
                case 1952754353: {
                    break block22;
                }
            }
            break;
        }
        var4_2 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl14
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("wbg", wbd(int ), (int)9));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1385235737: {
                    v2 = w.vuv("wbh", wbd(int ), (int)10);
                    continue block23;
                }
                case 316409169: {
                    v2 = w.vuv("wbi", wbd(int ), (int)11);
                    continue block23;
                }
                case 628815847: {
                    v2 = w.vuv("wbj", wbd(int ), (int)12);
                    continue block23;
                }
                case 1952754353: {
                    break block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wbk", wbd(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == w.vuv("wbl", vus(int ), (int)153)) {
                var2_4 = w.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)w.vuv("wbm", vus(int ), (int)154);
        }
        if (var2_4 || var2_4) return;
        v4 = w.vuv("wbn", vus(int ), (int)155);
        v5 /* !! */  = w.bh;
        block25: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -1379140767: {
                    v5 /* !! */  = (long)(w.vuv("wbp", wbd(int ), (int)15) - w.vuv("wbo", wbd(int ), (int)14));
                    continue block25;
                }
                case 1952754353: {
                    break block25;
                }
            }
            break;
        }
        this.stop((boolean)v4);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block26: while (true) {
            block39: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var2_4 && !var2_4) return;
                        return;
                    }
                    case 1: {
                        ** GOTO lbl67
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)w.vuv("wbt", vus(int ), (int)159);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block39;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)w.vuv("wbv", vus(int ), (int)161);
                        if (var4_2) {
                            throw null;
                        }
lbl67:
                        // 3 sources

                        var3_3 /* !! */  = (int)w.vuv("wbr", vus(int ), (int)157);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block39;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)w.vuv("wbq", vus(int ), (int)156);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)w.vuv("wbs", vus(int ), (int)158);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl85
            }
            do {
                if (true) continue block26;
lbl85:
                // 2 sources

                var3_3 /* !! */  = (int)w.vuv("wbu", vus(int ), (int)160);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onGameLeft(ca var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wbw", wbd(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == w.vuv("wbx", vus(int ), (int)162)) break;
            v0 /* !! */  = (long)w.vuv("wby", vus(int ), (int)163);
        }
        var4_2 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("wbz", wbd(int ), (int)17));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1425314611: {
                    v2 = w.vuv("wca", wbd(int ), (int)18);
                    continue block18;
                }
                case 1952754353: {
                    break block18;
                }
                case 2030032024: {
                    v2 = w.vuv("wcb", wbd(int ), (int)19);
                    continue block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wcc", wbd(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == w.vuv("wcd", vus(int ), (int)164)) break;
            v3 /* !! */  = (long)w.vuv("wce", vus(int ), (int)165);
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 = w.vuv("wcf", vus(int ), (int)166);
        v5 /* !! */  = w.bh;
        if (true) ** GOTO lbl39
        block21: while (true) {
            v5 /* !! */  = (long)(w.vuv("wch", wbd(int ), (int)22) - w.vuv("wcg", wbd(int ), (int)21));
lbl39:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1031675730: {
                    continue block21;
                }
                case 1952754353: {
                    break block21;
                }
            }
            break;
        }
        this.stop((boolean)v4);
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)w.vuv("wci", vus(int ), (int)167);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: {
                var3_3 /* !! */  = (int)w.vuv("wcj", vus(int ), (int)168);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)w.vuv("wck", vus(int ), (int)169);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
lbl65:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)w.vuv("wcl", vus(int ), (int)170);
                    if (!var4_2) break block9;
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)w.vuv("wcm", vus(int ), (int)171);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)w.vuv("wcn", vus(int ), (int)172);
        ** while (!var4_2)
lbl77:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite vuv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void yww() {
        w.vxg[400] = 4185646001871217504L;
        w.vxg[401] = -9066409790263997648L;
        w.vxg[402] = -8988145101101225056L;
        w.vxg[403] = 4118345160423542037L;
        w.vxg[404] = 3913863240835213667L;
        w.vxg[405] = 3939246630050668422L;
        w.vxg[406] = 5126853578812263132L;
        w.vxg[407] = 2436896757581785442L;
        w.vxg[408] = 7530972840764503721L;
        w.vxg[409] = 4006886747549480317L;
        w.vxg[410] = 375369552579957675L;
        w.vxg[411] = -9022620036421814420L;
        w.vxg[412] = -4226816291289333898L;
        w.vxg[413] = -3520474152118337866L;
        w.vxg[414] = -8400890695824427010L;
        w.vxg[415] = 1046070619792996749L;
        w.vxg[416] = 4641130802962461724L;
        w.vxg[417] = 2485281949843006041L;
        w.vxg[418] = 2039618226665180803L;
        w.vxg[419] = -2947352090353896160L;
        w.vxg[420] = 8825661865918367906L;
        w.vxg[421] = -5056073152256533494L;
        w.vxg[422] = -3646039030054626880L;
        w.vxg[423] = -463821742296334885L;
        w.vxg[424] = -7239488798579916601L;
        w.vxg[425] = -341022089328654187L;
        w.vxg[426] = -2680144930989047546L;
        w.vxg[427] = -5504004556218831167L;
        w.vxg[428] = 5289100028810314408L;
        w.vxg[429] = 2210876668218860676L;
        w.vxg[430] = 2912031057290693559L;
        w.vxg[431] = 1099420666273652732L;
        w.vxg[432] = -994915504341717794L;
        w.vxg[433] = -4426550826271878133L;
        w.vxg[434] = 877025978590348596L;
        w.vxg[435] = -8655575469246997039L;
        w.vxg[436] = -1570584448340348281L;
        w.vxg[437] = 618382632173993409L;
        w.vxg[438] = -5693346306101750725L;
        w.vxg[439] = -2221403785791854674L;
        w.vxg[440] = -1469697876660806867L;
        w.vxg[441] = -7232800023755284854L;
        w.vxg[442] = 3182865554660740755L;
        w.vxg[443] = 9148378050270898651L;
        w.vxg[444] = -8892652349735673922L;
        w.vxg[445] = 8887176182612083409L;
        w.vxg[446] = 5896576256872904799L;
        w.vxg[447] = -744609784576329049L;
        w.vxg[448] = 8768985871151017754L;
        w.vxg[449] = -3911778802265642928L;
        w.vxg[450] = -3006595130543353904L;
        w.vxg[451] = -6463372657464175299L;
        w.vxg[452] = -9195192176429726900L;
        w.vxg[453] = 7122028286754898559L;
        w.vxg[454] = 2797576460335322727L;
        w.vxg[455] = -2830365618904919369L;
        w.vxg[456] = 8769474389786383021L;
        w.vxg[457] = 8325421688954737443L;
        w.vxg[458] = 977509735849739659L;
        w.vxg[459] = 1096031530576243360L;
        w.vxg[460] = 5316181974883992827L;
        w.vxg[461] = 7478720821782688074L;
        w.vxg[462] = -2296104815986828118L;
        w.vxg[463] = 7107425422536543875L;
        w.vxg[464] = 3032489017617772873L;
        w.vxg[465] = -8533559835178458310L;
        w.vxg[466] = -7271125881237802697L;
        w.vxg[467] = 2827933736427106180L;
        w.vxg[468] = 6536514152480593540L;
        w.vxg[469] = 5691020767248272882L;
        w.vxg[470] = -4642992955148410053L;
        w.vxg[471] = -1107491578259922941L;
        w.vxg[472] = -1399209647691634537L;
        w.vxg[473] = -8438751534686101486L;
        w.vxg[474] = 19799831661082619L;
        w.vxg[475] = -7338839470107337197L;
        w.vxg[476] = -5499383771835613787L;
        w.vxg[477] = 1835669096017801924L;
        w.vxg[478] = 4168360110049693233L;
        w.vxg[479] = 4716266039493581689L;
        w.vxg[480] = -7556873461471621585L;
        w.vxg[481] = 7430735987870562464L;
        w.vxg[482] = -5502430698190870725L;
        w.vxg[483] = 5892267449931620151L;
        w.vxg[484] = -3011886007929045289L;
        w.vxg[485] = -4379047981902530032L;
        w.vxg[486] = -6363156862004566774L;
        w.vxg[487] = 2042539394513763025L;
        w.vxg[488] = -1879164880584723810L;
        w.vxg[489] = -8814804175209651237L;
        w.vxg[490] = 5992465019695027569L;
        w.vxg[491] = 3081832580655626903L;
        w.vxg[492] = -204457124859940032L;
        w.vxg[493] = 1499481400638890920L;
        w.vxg[494] = 6720551842783852720L;
        w.vxg[495] = -1501123467939321548L;
        w.vxg[496] = 7513378054407636127L;
        w.vxg[497] = 910952596691086445L;
        w.vxg[498] = 135493097778330197L;
        w.vxg[499] = -7178297110257824488L;
    }

    private static /* synthetic */ void yxc() {
        w.vxh[400] = -902885448656645645L;
        w.vxh[401] = 3169688628285842893L;
        w.vxh[402] = -3695272454720235602L;
        w.vxh[403] = 4181426589382753669L;
        w.vxh[404] = -7538280306896265535L;
        w.vxh[405] = 4491799684204908223L;
        w.vxh[406] = 8598794016615484026L;
        w.vxh[407] = -1937713471824510100L;
        w.vxh[408] = -3259712817974020752L;
        w.vxh[409] = 9145909118914866979L;
        w.vxh[410] = 402519425161637820L;
        w.vxh[411] = -509199454153619526L;
        w.vxh[412] = -8313280680047758234L;
        w.vxh[413] = -1086111945409222868L;
        w.vxh[414] = -5424060845029026775L;
        w.vxh[415] = 3555509053940259418L;
        w.vxh[416] = 9217989933428203623L;
        w.vxh[417] = 2126223572789121789L;
        w.vxh[418] = 2566483283059338580L;
        w.vxh[419] = -1672187957575690505L;
        w.vxh[420] = -1282756226614115021L;
        w.vxh[421] = -7148755249040557966L;
        w.vxh[422] = 1988531284179259273L;
        w.vxh[423] = 227566436064226192L;
        w.vxh[424] = 6264790301222694304L;
        w.vxh[425] = -6435642341630453921L;
        w.vxh[426] = 8754790939145879787L;
        w.vxh[427] = 7608837247895038092L;
        w.vxh[428] = 8857907880601342283L;
        w.vxh[429] = 2937325809681066899L;
        w.vxh[430] = 8425312079127620339L;
        w.vxh[431] = -7196818559187572322L;
        w.vxh[432] = -6421875172848096928L;
        w.vxh[433] = -8296212244628919557L;
        w.vxh[434] = 615345791572568432L;
        w.vxh[435] = -2403082547929172775L;
        w.vxh[436] = -3130636225597898639L;
        w.vxh[437] = 6991486933724636790L;
        w.vxh[438] = 2734838019531574964L;
        w.vxh[439] = -7871094150868467196L;
        w.vxh[440] = 1300826713693290589L;
        w.vxh[441] = 2557748577170708565L;
        w.vxh[442] = 1098721344613045848L;
        w.vxh[443] = 2836401379779591965L;
        w.vxh[444] = -1697504696626597367L;
        w.vxh[445] = -4089367457367286581L;
        w.vxh[446] = 8524172261460537621L;
        w.vxh[447] = 2302307133047173150L;
        w.vxh[448] = 2889422216641330337L;
        w.vxh[449] = 2062442617644373932L;
        w.vxh[450] = -3902567077232458971L;
        w.vxh[451] = 451310741834204130L;
        w.vxh[452] = -1329699173881296079L;
        w.vxh[453] = 1022902020263127521L;
        w.vxh[454] = 6569665443730825821L;
        w.vxh[455] = 6208465296866710394L;
        w.vxh[456] = 9089118884207062080L;
        w.vxh[457] = -4317091803740491820L;
        w.vxh[458] = -8961498794607916399L;
        w.vxh[459] = -6165277875840224103L;
        w.vxh[460] = -162125305604494499L;
        w.vxh[461] = 4686584162718939885L;
        w.vxh[462] = -3985785901914705640L;
        w.vxh[463] = -5861975006546659429L;
        w.vxh[464] = -6508115694594816012L;
        w.vxh[465] = 7509041323956830865L;
        w.vxh[466] = 6432612557922876533L;
        w.vxh[467] = 2283254636396372366L;
        w.vxh[468] = -4119493451493742779L;
        w.vxh[469] = 6966232142787725849L;
        w.vxh[470] = 8834421348969005636L;
        w.vxh[471] = 8983135585916538548L;
        w.vxh[472] = -6939574417140319517L;
        w.vxh[473] = -9194662856595575983L;
        w.vxh[474] = 3411698633190462898L;
        w.vxh[475] = -8122941621852248827L;
        w.vxh[476] = -8351095453799418058L;
        w.vxh[477] = 7893765651176419579L;
        w.vxh[478] = -1381837551762643456L;
        w.vxh[479] = -689445539683838294L;
        w.vxh[480] = 5969404445195868666L;
        w.vxh[481] = 2393233999061176166L;
        w.vxh[482] = 8163876249704567536L;
        w.vxh[483] = 7360847913539469927L;
        w.vxh[484] = -8862889142177533746L;
        w.vxh[485] = -2792493687145716054L;
        w.vxh[486] = -124050004110260108L;
        w.vxh[487] = -8611004528518707553L;
        w.vxh[488] = 874378467084841618L;
        w.vxh[489] = -5108641120554204770L;
        w.vxh[490] = -8153891252491856643L;
        w.vxh[491] = -2751109859245020386L;
        w.vxh[492] = 1823887682675941120L;
        w.vxh[493] = -2663720510193764664L;
        w.vxh[494] = -2477917666321143253L;
        w.vxh[495] = -3913184947953956029L;
        w.vxh[496] = 6306025307864953251L;
        w.vxh[497] = -5657544621542013564L;
        w.vxh[498] = -9123915091945604482L;
        w.vxh[499] = -4856638080215960262L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double findFullBuriedY(double var1_1, double var3_2) {
        var14_3 = w.c;
        var13_4 /* !! */  = w.b;
        var12_5 = w.a;
        if (var14_3) {
            throw null;
lbl6:
            // 15 sources

            return (double)w.vuv("wyc", vxf(int ), (int)248);
        }
        if (var12_5 || var12_5) ** GOTO lbl6
        var5_6 = (int)Math.floor(var1_1);
        if (var12_5 || var12_5) ** GOTO lbl6
        var6_7 = (int)Math.floor(var3_2);
        if (var12_5 || var12_5) ** GOTO lbl6
        var7_8 = this.getRealSurfaceY(var1_1, var3_2);
        if (var12_5 || var12_5) ** GOTO lbl6
        var9_9 = (int)Math.floor(var7_8) - w.vuv("wyd", vus(int ), (int)508);
        if (var12_5 || var12_5) ** GOTO lbl6
        var10_10 = w.mc.field_1687.method_31607();
        if (var12_5 || var12_5) ** GOTO lbl6
        var11_11 = var9_9;
        if (var12_5) ** GOTO lbl6
        block31: while (true) {
            block59: {
                if (var12_5 || var12_5) ** GOTO lbl6
                if (var11_11 < Math.max(var10_10, var9_9 - w.vuv("wye", vus(int ), (int)509))) ** GOTO lbl40
                if (var12_5 || var12_5) ** GOTO lbl6
                if (!this.isSolid(new class_2338(var5_6, var11_11, var6_7))) break block59;
                if (var12_5) ** GOTO lbl6
                if (!this.isSolid(new class_2338(var5_6, var11_11 + w.vuv("wyf", vus(int ), (int)510), var6_7))) break block59;
                if (var12_5 || var12_5) ** GOTO lbl6
                return (double)var11_11 + w.vuv("wyg", vxf(int ), (int)249);
            }
            if (var12_5) ** GOTO lbl6
            if (var13_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var13_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var12_5) ** GOTO lbl6
                    --var11_11;
                    if (var12_5) ** GOTO lbl6
                    if (!var14_3) continue block31;
                    throw null;
                }
lbl40:
                // 1 sources

                if (!var12_5 && !var12_5) ** break;
                ** continue;
                return var7_8 - w.vuv("wyh", vxf(int ), (int)250);
lbl43:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var13_4 /* !! */  = (int)w.vuv("wyi", vus(int ), (int)511);
                        if (var14_3) {
                            throw null;
                        }
                        ** GOTO lbl69
                        break;
                    }
                }
                case 1: {
                    var13_4 /* !! */  = (int)w.vuv("wyj", vus(int ), (int)512);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl79
                }
lbl54:
                // 2 sources

                case 2: {
                    var13_4 /* !! */  = (int)w.vuv("wyk", vus(int ), (int)513);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
lbl59:
                // 2 sources

                case 3: {
                    var13_4 /* !! */  = (int)w.vuv("wyl", vus(int ), (int)514);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
                case 4: {
                    var13_4 /* !! */  = (int)w.vuv("wym", vus(int ), (int)515);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl144
                }
lbl69:
                // 3 sources

                case 5: {
                    var13_4 /* !! */  = (int)w.vuv("wyn", vus(int ), (int)516);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
                case 6: {
                    var13_4 /* !! */  = (int)w.vuv("wyo", vus(int ), (int)517);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl79:
                // 3 sources

                case 7: {
                    var13_4 /* !! */  = (int)w.vuv("wyp", vus(int ), (int)518);
                    if (!var14_3) ** GOTO lbl54
                    throw null;
                }
lbl83:
                // 2 sources

                case 8: {
                    var13_4 /* !! */  = (int)w.vuv("wyq", vus(int ), (int)519);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl132
                }
lbl88:
                // 3 sources

                case 9: {
                    var13_4 /* !! */  = (int)w.vuv("wyr", vus(int ), (int)520);
                    if (!var14_3) ** GOTO lbl43
                    throw null;
                }
                case 10: {
                    var13_4 /* !! */  = (int)w.vuv("wys", vus(int ), (int)521);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl120
                }
                case 11: {
                    var13_4 /* !! */  = (int)w.vuv("wyt", vus(int ), (int)522);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
                case 12: {
                    var13_4 /* !! */  = (int)w.vuv("wyu", vus(int ), (int)523);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl128
                }
lbl107:
                // 2 sources

                case 13: {
                    var13_4 /* !! */  = (int)w.vuv("wyv", vus(int ), (int)524);
                    if (var14_3) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
lbl112:
                // 3 sources

                case 14: {
                    var13_4 /* !! */  = (int)w.vuv("wyw", vus(int ), (int)525);
                    if (!var14_3) ** GOTO lbl69
                    throw null;
                }
                case 15: {
                    var13_4 /* !! */  = (int)w.vuv("wyx", vus(int ), (int)526);
                    if (!var14_3) ** GOTO lbl112
                    throw null;
                }
lbl120:
                // 3 sources

                case 16: {
                    var13_4 /* !! */  = (int)w.vuv("wyy", vus(int ), (int)527);
                    if (!var14_3) ** GOTO lbl83
                    throw null;
                }
lbl124:
                // 5 sources

                case 17: {
                    var13_4 /* !! */  = (int)w.vuv("wyz", vus(int ), (int)528);
                    if (!var14_3) ** GOTO lbl59
                    throw null;
                }
lbl128:
                // 2 sources

                case 18: {
                    var13_4 /* !! */  = (int)w.vuv("wza", vus(int ), (int)529);
                    if (!var14_3) ** GOTO lbl120
                    throw null;
                }
lbl132:
                // 2 sources

                case 19: {
                    var13_4 /* !! */  = (int)w.vuv("wzb", vus(int ), (int)530);
                    if (!var14_3) ** GOTO lbl112
                    throw null;
                }
                case 20: {
                    var13_4 /* !! */  = (int)w.vuv("wzc", vus(int ), (int)531);
                    if (!var14_3) ** GOTO lbl88
                    throw null;
                }
                case 21: {
                    var13_4 /* !! */  = (int)w.vuv("wzd", vus(int ), (int)532);
                    if (!var14_3) ** GOTO lbl107
                    throw null;
                }
lbl144:
                // 3 sources

                case 22: {
                    var13_4 /* !! */  = (int)w.vuv("wze", vus(int ), (int)533);
                    if (!var14_3) ** GOTO lbl124
                    throw null;
                }
lbl148:
                // 2 sources

                case 23: {
                    var13_4 /* !! */  = (int)w.vuv("wzf", vus(int ), (int)534);
                    if (var14_3) {
                        throw null;
                    }
                }
                case 24: {
                    var13_4 /* !! */  = (int)w.vuv("wzg", vus(int ), (int)535);
                    if (!var14_3) ** GOTO lbl79
                    throw null;
                }
lbl156:
                // 3 sources

                case 25: {
                    var13_4 /* !! */  = (int)w.vuv("wzh", vus(int ), (int)536);
                    if (!var14_3) ** GOTO lbl144
                    throw null;
                }
                case 26: {
                    var13_4 /* !! */  = (int)w.vuv("wzi", vus(int ), (int)537);
                    if (!var14_3) ** GOTO lbl124
                    throw null;
                }
                case 27: 
            }
            break;
        }
        var13_4 /* !! */  = (int)w.vuv("wzj", vus(int ), (int)538);
        ** while (!var14_3)
lbl167:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void yrc() {
        w.vuu[0] = 1702227879;
        w.vuu[1] = 1314036783;
        w.vuu[2] = 524387187;
        w.vuu[3] = -395976994;
        w.vuu[4] = -80245991;
        w.vuu[5] = 436654484;
        w.vuu[6] = -816700664;
        w.vuu[7] = 677795185;
        w.vuu[8] = 1725283917;
        w.vuu[9] = -2041207704;
        w.vuu[10] = -742133916;
        w.vuu[11] = 120727646;
        w.vuu[12] = -1950078328;
        w.vuu[13] = -1554772622;
        w.vuu[14] = -1836170933;
        w.vuu[15] = -1790266089;
        w.vuu[16] = 1428643262;
        w.vuu[17] = 1211324717;
        w.vuu[18] = -925871240;
        w.vuu[19] = -1400071870;
        w.vuu[20] = 1181435700;
        w.vuu[21] = -1890834025;
        w.vuu[22] = -963280412;
        w.vuu[23] = -28984662;
        w.vuu[24] = 851038823;
        w.vuu[25] = 83312969;
        w.vuu[26] = -1241007801;
        w.vuu[27] = -108045702;
        w.vuu[28] = 176540716;
        w.vuu[29] = 1790929863;
        w.vuu[30] = -1814373665;
        w.vuu[31] = -44456024;
        w.vuu[32] = 721188376;
        w.vuu[33] = 760813337;
        w.vuu[34] = -903604113;
        w.vuu[35] = 242844846;
        w.vuu[36] = -1687000031;
        w.vuu[37] = 1300329114;
        w.vuu[38] = 276597898;
        w.vuu[39] = -1310690177;
        w.vuu[40] = 1057407108;
        w.vuu[41] = 2075141903;
        w.vuu[42] = -327249136;
        w.vuu[43] = 1362223800;
        w.vuu[44] = 1862365674;
        w.vuu[45] = -777782278;
        w.vuu[46] = 1352771065;
        w.vuu[47] = -479708394;
        w.vuu[48] = 1394646982;
        w.vuu[49] = -863764944;
        w.vuu[50] = -848248239;
        w.vuu[51] = 1466926120;
        w.vuu[52] = -497409792;
        w.vuu[53] = -1546388567;
        w.vuu[54] = 1045666179;
        w.vuu[55] = 1254256965;
        w.vuu[56] = -422747945;
        w.vuu[57] = -1642829673;
        w.vuu[58] = -1895719;
        w.vuu[59] = -177070145;
        w.vuu[60] = -184834558;
        w.vuu[61] = 1724904280;
        w.vuu[62] = -2146072838;
        w.vuu[63] = 390161266;
        w.vuu[64] = -703871067;
        w.vuu[65] = -615040094;
        w.vuu[66] = -107654494;
        w.vuu[67] = 496461589;
        w.vuu[68] = -2079275528;
        w.vuu[69] = 2056885144;
        w.vuu[70] = -523036071;
        w.vuu[71] = 1860512865;
        w.vuu[72] = -464901679;
        w.vuu[73] = 1105688886;
        w.vuu[74] = -771272674;
        w.vuu[75] = 1412845728;
        w.vuu[76] = -1778743796;
        w.vuu[77] = 38617848;
        w.vuu[78] = 1488866696;
        w.vuu[79] = 1243522763;
        w.vuu[80] = -867164088;
        w.vuu[81] = -2026260887;
        w.vuu[82] = -406558414;
        w.vuu[83] = -1231018084;
        w.vuu[84] = -1208880912;
        w.vuu[85] = -1321557544;
        w.vuu[86] = 2004557910;
        w.vuu[87] = 1913062500;
        w.vuu[88] = -1190256775;
        w.vuu[89] = 1350360395;
        w.vuu[90] = 136623796;
        w.vuu[91] = 1358140187;
        w.vuu[92] = 169705192;
        w.vuu[93] = -1114184012;
        w.vuu[94] = -798003016;
        w.vuu[95] = -586258504;
        w.vuu[96] = 1690554007;
        w.vuu[97] = 870616418;
        w.vuu[98] = -1183331365;
        w.vuu[99] = -724291901;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stop(boolean var1_1) {
        var5_2 = w.c;
        var4_3 /* !! */  = w.b;
        var3_4 = w.a;
        if (var5_2) {
            throw null;
lbl6:
            // 16 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        var2_5 = this.active;
        if (var3_4 || var3_4) ** GOTO lbl6
        this.active = w.vuv("wrl", vus(int ), (int)384);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.directAutomatedRoute = w.vuv("wrm", vus(int ), (int)385);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.avoidLavaDirectRoute = w.vuv("wrn", vus(int ), (int)386);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.destination = null;
        if (var3_4 || var3_4) ** GOTO lbl6
        this.waitTicks = (int)w.vuv("wro", vus(int ), (int)387);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.stepCount = (int)w.vuv("wrp", vus(int ), (int)388);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.directNoProgressTicks = (int)w.vuv("wrq", vus(int ), (int)389);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.directCorrections = (int)w.vuv("wrr", vus(int ), (int)390);
        if (var3_4 || var3_4) ** GOTO lbl6
        this.directMaxSteps = (int)w.vuv("wrs", vus(int ), (int)391);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl6
                this.directBestDistance = (double)w.vuv("wrt", vxf(int ), (int)199);
                if (var3_4 || var3_4) ** GOTO lbl6
                this.directExpectedDistance = (double)w.vuv("wru", vxf(int ), (int)200);
                if (var3_4 || var3_4) ** GOTO lbl6
                if (!var1_1) ** GOTO lbl46
                if (var3_4 || var3_4) ** GOTO lbl6
                if (var2_5) {
                    v0 = "TP \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d.";
                    if (var5_2) {
                        throw null;
                    }
                } else {
                    v0 = "TP \u0443\u0436\u0435 \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d.";
                }
                this.logDirect(class_2561.method_43470((String)v0).method_27692(class_124.field_1080));
                if (var3_4) ** GOTO lbl6
lbl46:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl49:
            // 4 sources

            case 0: {
                var4_3 /* !! */  = (int)w.vuv("wrv", vus(int ), (int)392);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl54:
            // 4 sources

            case 1: {
                var4_3 /* !! */  = (int)w.vuv("wrw", vus(int ), (int)393);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 2: {
                do {
                    var4_3 /* !! */  = (int)w.vuv("wrx", vus(int ), (int)394);
                } while (!var5_2);
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)w.vuv("wry", vus(int ), (int)395);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl69:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)w.vuv("wrz", vus(int ), (int)396);
                if (!var5_2) ** GOTO lbl54
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)w.vuv("wsa", vus(int ), (int)397);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl78:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)w.vuv("wsb", vus(int ), (int)398);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 7: {
                var4_3 /* !! */  = (int)w.vuv("wsc", vus(int ), (int)399);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl88:
            // 5 sources

            case 8: {
                var4_3 /* !! */  = (int)w.vuv("wsd", vus(int ), (int)400);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 9: {
                var4_3 /* !! */  = (int)w.vuv("wse", vus(int ), (int)401);
                if (!var5_2) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)w.vuv("wsf", vus(int ), (int)402);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl102:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)w.vuv("wsg", vus(int ), (int)403);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl107:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)w.vuv("wsh", vus(int ), (int)404);
                if (!var5_2) ** GOTO lbl49
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)w.vuv("wsi", vus(int ), (int)405);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl116:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)w.vuv("wsj", vus(int ), (int)406);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
lbl120:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)w.vuv("wsk", vus(int ), (int)407);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl125:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)w.vuv("wsl", vus(int ), (int)408);
                if (!var5_2) ** GOTO lbl107
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)w.vuv("wsm", vus(int ), (int)409);
                if (!var5_2) ** GOTO lbl69
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)w.vuv("wsn", vus(int ), (int)410);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)w.vuv("wso", vus(int ), (int)411);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 20: {
                var4_3 /* !! */  = (int)w.vuv("wsp", vus(int ), (int)412);
                if (!var5_2) ** GOTO lbl54
                throw null;
            }
lbl146:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)w.vuv("wsq", vus(int ), (int)413);
                    if (!var5_2) ** GOTO lbl78
                    throw null;
                }
            }
            case 22: {
                var4_3 /* !! */  = (int)w.vuv("wsr", vus(int ), (int)414);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
lbl155:
            // 3 sources

            case 23: {
                var4_3 /* !! */  = (int)w.vuv("wss", vus(int ), (int)415);
                if (!var5_2) ** GOTO lbl54
                throw null;
            }
            case 24: {
                var4_3 /* !! */  = (int)w.vuv("wst", vus(int ), (int)416);
                if (!var5_2) ** GOTO lbl49
                throw null;
            }
lbl163:
            // 3 sources

            case 25: {
                var4_3 /* !! */  = (int)w.vuv("wsu", vus(int ), (int)417);
                if (var5_2) {
                    throw null;
                }
            }
            case 26: {
                do {
                    var4_3 /* !! */  = (int)w.vuv("wsv", vus(int ), (int)418);
                } while (!var5_2);
                throw null;
            }
            case 27: {
                var4_3 /* !! */  = (int)w.vuv("wsw", vus(int ), (int)419);
                if (!var5_2) ** GOTO lbl102
                throw null;
            }
lbl176:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)w.vuv("wsx", vus(int ), (int)420);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 29: {
                var4_3 /* !! */  = (int)w.vuv("wsy", vus(int ), (int)421);
                if (!var5_2) ** GOTO lbl163
                throw null;
            }
lbl185:
            // 4 sources

            case 30: {
                var4_3 /* !! */  = (int)w.vuv("wsz", vus(int ), (int)422);
                if (!var5_2) ** GOTO lbl49
                throw null;
            }
            case 31: {
                var4_3 /* !! */  = (int)w.vuv("wta", vus(int ), (int)423);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
            case 32: 
        }
        var4_3 /* !! */  = (int)w.vuv("wtb", vus(int ), (int)424);
        ** while (!var5_2)
lbl196:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ywy() {
        w.vxh[0] = -5705214410909949630L;
        w.vxh[1] = -5829021203780419600L;
        w.vxh[2] = -8171164326771276300L;
        w.vxh[3] = 4304200112995234066L;
        w.vxh[4] = 7151069243009916560L;
        w.vxh[5] = -4523591159967741443L;
        w.vxh[6] = 6333192436006389231L;
        w.vxh[7] = 4832506860143141230L;
        w.vxh[8] = 2610983344907279860L;
        w.vxh[9] = -4551756663317546380L;
        w.vxh[10] = 4766154652134998381L;
        w.vxh[11] = 9147306864056753026L;
        w.vxh[12] = -6941126634145689190L;
        w.vxh[13] = -1188637269897874425L;
        w.vxh[14] = 6033636341186138159L;
        w.vxh[15] = -5915434979662642712L;
        w.vxh[16] = -2135920349342017337L;
        w.vxh[17] = 1698777241409913358L;
        w.vxh[18] = 6883009113859193504L;
        w.vxh[19] = 5359636090205496631L;
        w.vxh[20] = -3930122398103837667L;
        w.vxh[21] = -2780278343237975986L;
        w.vxh[22] = -2978918012174348313L;
        w.vxh[23] = 8506809861720538396L;
        w.vxh[24] = -975726867118393554L;
        w.vxh[25] = 6795552169914330674L;
        w.vxh[26] = 4979280181371430795L;
        w.vxh[27] = -2659201359638045656L;
        w.vxh[28] = -8321377371427204793L;
        w.vxh[29] = -903586650056842860L;
        w.vxh[30] = -3434897431906723977L;
        w.vxh[31] = -30148914382532269L;
        w.vxh[32] = -1214439748446979856L;
        w.vxh[33] = -5671683765825434497L;
        w.vxh[34] = -4384908647624271916L;
        w.vxh[35] = 4532040179315474241L;
        w.vxh[36] = -4600109549059250334L;
        w.vxh[37] = -63045192984058831L;
        w.vxh[38] = -2914983286768916222L;
        w.vxh[39] = 6750592184427021358L;
        w.vxh[40] = -9161659529998692759L;
        w.vxh[41] = 3023426191773577294L;
        w.vxh[42] = 6801132819164625204L;
        w.vxh[43] = -7438307231584859988L;
        w.vxh[44] = 5677689628453283910L;
        w.vxh[45] = 480955864340519702L;
        w.vxh[46] = -7265130992876922437L;
        w.vxh[47] = -4408690662747481076L;
        w.vxh[48] = 422700461182624156L;
        w.vxh[49] = 4990858614326456448L;
        w.vxh[50] = 7605641404299069413L;
        w.vxh[51] = 6455539526250586337L;
        w.vxh[52] = 7888943537780958458L;
        w.vxh[53] = 8742150881045265523L;
        w.vxh[54] = 476518065778389025L;
        w.vxh[55] = 8123455481355990425L;
        w.vxh[56] = -5673674878059467271L;
        w.vxh[57] = 3095616199326588442L;
        w.vxh[58] = -207112993462233126L;
        w.vxh[59] = 2761992891017472442L;
        w.vxh[60] = 1923972564099326316L;
        w.vxh[61] = 1342968946789698941L;
        w.vxh[62] = 2091438273772504049L;
        w.vxh[63] = 6710231730376921286L;
        w.vxh[64] = 7356378608016650102L;
        w.vxh[65] = 608906069711514020L;
        w.vxh[66] = 5040308048892684858L;
        w.vxh[67] = -2621822313772066759L;
        w.vxh[68] = 3840159372368292218L;
        w.vxh[69] = -7328230419898603120L;
        w.vxh[70] = 204089691336622731L;
        w.vxh[71] = 1558340120314422585L;
        w.vxh[72] = 7812687729826253292L;
        w.vxh[73] = -9016702533651884390L;
        w.vxh[74] = -3676120648165988196L;
        w.vxh[75] = -2479849789812331118L;
        w.vxh[76] = -325813444451949247L;
        w.vxh[77] = -3383798121467898339L;
        w.vxh[78] = 7552667348131508281L;
        w.vxh[79] = -4073363734177700318L;
        w.vxh[80] = 5511654304147214926L;
        w.vxh[81] = -3576318721672943183L;
        w.vxh[82] = 2649561058506312545L;
        w.vxh[83] = 7522560388235787952L;
        w.vxh[84] = -529541189452482255L;
        w.vxh[85] = -1066037461560633856L;
        w.vxh[86] = 8602108625618379556L;
        w.vxh[87] = -8145801365536417354L;
        w.vxh[88] = -357075435838906165L;
        w.vxh[89] = 3530323900419518963L;
        w.vxh[90] = -149169997393710952L;
        w.vxh[91] = 9156376052120709360L;
        w.vxh[92] = 2524918900555433679L;
        w.vxh[93] = -1015962807054330049L;
        w.vxh[94] = -6325156861135153270L;
        w.vxh[95] = 2865541735342404700L;
        w.vxh[96] = -6529522503893037638L;
        w.vxh[97] = 6000916419283906235L;
        w.vxh[98] = -8777918305903233235L;
        w.vxh[99] = 340289730486574480L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void tickDirectAutomatedRoute() {
        block162: {
            block161: {
                block160: {
                    block159: {
                        block158: {
                            var10_1 = w.c;
                            var9_2 /* !! */  = w.b;
                            var8_3 = w.a;
                            if (var10_1) {
                                throw null;
lbl6:
                                // 44 sources

                                return;
                            }
                            if (var8_3 || var8_3) ** GOTO lbl6
                            var1_4 = w.mc.field_1724.method_73189();
                            if (var8_3 || var8_3) ** GOTO lbl6
                            var2_5 = this.destination.method_1020(var1_4);
                            if (var8_3 || var8_3) ** GOTO lbl6
                            var3_6 = var2_5.method_1033();
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (this.directMaxSteps != 0) break block158;
                            if (var8_3 || var8_3) ** GOTO lbl6
                            this.initializeDirectProgress(this.destination);
                            if (var8_3) ** GOTO lbl6
                        }
                        if (var8_3 || var8_3) ** GOTO lbl6
                        if (!(var3_6 + w.vuv("xhn", vxf(int ), (int)353) < this.directBestDistance)) break block159;
                        if (var8_3 || var8_3) ** GOTO lbl6
                        this.directBestDistance = var3_6;
                        if (var8_3 || var8_3) ** GOTO lbl6
                        this.directNoProgressTicks = (int)w.vuv("xho", vus(int ), (int)648);
                        if (var8_3) ** GOTO lbl6
                        if (var10_1) {
                            throw null;
                        }
                        break block160;
                    }
                    if (var8_3 || var8_3) ** GOTO lbl6
                    this.directNoProgressTicks += w.vuv("xhp", vus(int ), (int)649);
                    if (var8_3) ** GOTO lbl6
                }
                if (var8_3 || var8_3) ** GOTO lbl6
                if (this.directExpectedDistance == w.vuv("xhq", vxf(int ), (int)354)) break block161;
                if (var8_3) ** GOTO lbl6
                if (!(var3_6 > this.directExpectedDistance + w.vuv("xhr", vxf(int ), (int)355))) break block161;
                if (var8_3 || var8_3) ** GOTO lbl6
                this.directCorrections += w.vuv("xhs", vus(int ), (int)650);
                if (var8_3) ** GOTO lbl6
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            if (this.directNoProgressTicks >= w.vuv("xht", vus(int ), (int)651)) break block162;
            if (var8_3) ** GOTO lbl6
            if (this.directCorrections >= w.vuv("xhu", vus(int ), (int)652)) break block162;
            if (var8_3) ** GOTO lbl6
            if (this.stepCount <= this.directMaxSteps) ** GOTO lbl58
            if (var8_3) ** GOTO lbl6
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.failAutomatedRoute();
                if (var8_3 || var8_3) ** GOTO lbl6
                return;
            }
lbl58:
            // 1 sources

            if (var8_3 || var8_3) ** GOTO lbl6
            if (!(var3_6 <= w.vuv("xhv", vxf(int ), (int)356))) ** GOTO lbl82
            if (var8_3 || var8_3) ** GOTO lbl6
            if (!this.avoidLavaDirectRoute) ** GOTO lbl68
            if (var8_3) ** GOTO lbl6
            if (!this.routeTouchesLava(var1_4, this.destination)) ** GOTO lbl68
            if (var8_3 || var8_3) ** GOTO lbl6
            this.stop((boolean)w.vuv("xhw", vus(int ), (int)653));
            if (var8_3 || var8_3) ** GOTO lbl6
            return;
lbl68:
            // 2 sources

            if (var8_3 || var8_3) ** GOTO lbl6
            this.performDirectMove(this.destination);
            if (var8_3 || var8_3) ** GOTO lbl6
            this.active = w.vuv("xhx", vus(int ), (int)654);
            if (var8_3 || var8_3) ** GOTO lbl6
            this.directAutomatedRoute = w.vuv("xhy", vus(int ), (int)655);
            if (var8_3 || var8_3) ** GOTO lbl6
            this.avoidLavaDirectRoute = w.vuv("xhz", vus(int ), (int)656);
            if (var8_3 || var8_3) ** GOTO lbl6
            w.mc.field_1724.method_18799(class_243.field_1353);
            if (var8_3 || var8_3) ** GOTO lbl6
            w.mc.field_1724.field_6017 = 0.0;
            if (var8_3 || var8_3) ** GOTO lbl6
            return;
lbl82:
            // 1 sources

            if (var8_3 || var8_3) ** GOTO lbl6
            var5_7 = Math.min(var3_6, ThreadLocalRandom.current().nextDouble((double)w.vuv("xia", vxf(int ), (int)357), (double)w.vuv("xib", vxf(int ), (int)358)));
            if (var8_3 || var8_3) ** GOTO lbl6
            var7_8 = var1_4.method_1019(var2_5.method_1029().method_1021(var5_7));
            if (var8_3 || var8_3) ** GOTO lbl6
            if (!this.avoidLavaDirectRoute) ** GOTO lbl94
            if (var8_3) ** GOTO lbl6
            if (!this.routeTouchesLava(var1_4, var7_8)) ** GOTO lbl94
            if (var8_3 || var8_3) ** GOTO lbl6
            this.stop((boolean)w.vuv("xic", vus(int ), (int)657));
            if (var8_3 || var8_3) ** GOTO lbl6
            return;
lbl94:
            // 2 sources

            if (var8_3 || var8_3) ** GOTO lbl6
            this.performDirectMove(var7_8);
            if (var8_3 || var8_3) ** GOTO lbl6
            this.directExpectedDistance = var7_8.method_1022(this.destination);
            if (var8_3 || var8_3) ** GOTO lbl6
            this.stepCount += w.vuv("xid", vus(int ), (int)658);
            if (!var8_3 && !var8_3) ** break;
            ** continue;
            return;
lbl103:
            // 5 sources

            case 0: {
                var9_2 /* !! */  = (int)w.vuv("xie", vus(int ), (int)659);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 1: {
                var9_2 /* !! */  = (int)w.vuv("xif", vus(int ), (int)660);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl113:
            // 2 sources

            case 2: {
                var9_2 /* !! */  = (int)w.vuv("xig", vus(int ), (int)661);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl118:
            // 3 sources

            case 3: {
                var9_2 /* !! */  = (int)w.vuv("xih", vus(int ), (int)662);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl453
            }
lbl123:
            // 2 sources

            case 4: {
                var9_2 /* !! */  = (int)w.vuv("xii", vus(int ), (int)663);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl458
            }
            case 5: {
                var9_2 /* !! */  = (int)w.vuv("xij", vus(int ), (int)664);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl133:
            // 2 sources

            case 6: {
                var9_2 /* !! */  = (int)w.vuv("xik", vus(int ), (int)665);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl138:
            // 2 sources

            case 7: {
                var9_2 /* !! */  = (int)w.vuv("xil", vus(int ), (int)666);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl143:
            // 2 sources

            case 8: {
                var9_2 /* !! */  = (int)w.vuv("xim", vus(int ), (int)667);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 9: {
                var9_2 /* !! */  = (int)w.vuv("xin", vus(int ), (int)668);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 10: {
                var9_2 /* !! */  = (int)w.vuv("xio", vus(int ), (int)669);
                if (!var10_1) ** GOTO lbl133
                throw null;
            }
            case 11: {
                var9_2 /* !! */  = (int)w.vuv("xip", vus(int ), (int)670);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 12: {
                var9_2 /* !! */  = (int)w.vuv("xiq", vus(int ), (int)671);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl167:
            // 2 sources

            case 13: {
                var9_2 /* !! */  = (int)w.vuv("xir", vus(int ), (int)672);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
            case 14: {
                var9_2 /* !! */  = (int)w.vuv("xis", vus(int ), (int)673);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl176:
            // 5 sources

            case 15: {
                var9_2 /* !! */  = (int)w.vuv("xit", vus(int ), (int)674);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl181:
            // 4 sources

            case 16: {
                var9_2 /* !! */  = (int)w.vuv("xiu", vus(int ), (int)675);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl186:
            // 2 sources

            case 17: {
                var9_2 /* !! */  = (int)w.vuv("xiv", vus(int ), (int)676);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl191:
            // 2 sources

            case 18: {
                var9_2 /* !! */  = (int)w.vuv("xiw", vus(int ), (int)677);
                if (!var10_1) break;
                throw null;
            }
lbl195:
            // 2 sources

            case 19: {
                var9_2 /* !! */  = (int)w.vuv("xix", vus(int ), (int)678);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 20: {
                var9_2 /* !! */  = (int)w.vuv("xiy", vus(int ), (int)679);
                if (!var10_1) ** GOTO lbl195
                throw null;
            }
lbl204:
            // 3 sources

            case 21: {
                var9_2 /* !! */  = (int)w.vuv("xiz", vus(int ), (int)680);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl209:
            // 2 sources

            case 22: {
                var9_2 /* !! */  = (int)w.vuv("xja", vus(int ), (int)681);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 23: {
                var9_2 /* !! */  = (int)w.vuv("xjb", vus(int ), (int)682);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl219:
            // 2 sources

            case 24: {
                var9_2 /* !! */  = (int)w.vuv("xjc", vus(int ), (int)683);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 25: {
                var9_2 /* !! */  = (int)w.vuv("xjd", vus(int ), (int)684);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl229:
            // 2 sources

            case 26: {
                var9_2 /* !! */  = (int)w.vuv("xje", vus(int ), (int)685);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl453
            }
lbl234:
            // 3 sources

            case 27: {
                var9_2 /* !! */  = (int)w.vuv("xjf", vus(int ), (int)686);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl361
            }
            case 28: {
                var9_2 /* !! */  = (int)w.vuv("xjg", vus(int ), (int)687);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl244:
            // 2 sources

            case 29: {
                var9_2 /* !! */  = (int)w.vuv("xjh", vus(int ), (int)688);
                if (!var10_1) ** GOTO lbl181
                throw null;
            }
            case 30: {
                var9_2 /* !! */  = (int)w.vuv("xji", vus(int ), (int)689);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl347
            }
            case 31: {
                var9_2 /* !! */  = (int)w.vuv("xjj", vus(int ), (int)690);
                if (!var10_1) ** GOTO lbl167
                throw null;
            }
lbl257:
            // 2 sources

            case 32: {
                var9_2 /* !! */  = (int)w.vuv("xjk", vus(int ), (int)691);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl262:
            // 3 sources

            case 33: {
                var9_2 /* !! */  = (int)w.vuv("xjl", vus(int ), (int)692);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl267:
            // 4 sources

            case 34: {
                var9_2 /* !! */  = (int)w.vuv("xjm", vus(int ), (int)693);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl272:
            // 2 sources

            case 35: {
                var9_2 /* !! */  = (int)w.vuv("xjn", vus(int ), (int)694);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl277:
            // 2 sources

            case 36: {
                var9_2 /* !! */  = (int)w.vuv("xjo", vus(int ), (int)695);
                if (!var10_1) ** GOTO lbl181
                throw null;
            }
            case 37: {
                var9_2 /* !! */  = (int)w.vuv("xjp", vus(int ), (int)696);
                if (!var10_1) ** GOTO lbl267
                throw null;
            }
            case 38: {
                var9_2 /* !! */  = (int)w.vuv("xjq", vus(int ), (int)697);
                if (!var10_1) ** GOTO lbl234
                throw null;
            }
lbl289:
            // 2 sources

            case 39: {
                var9_2 /* !! */  = (int)w.vuv("xjr", vus(int ), (int)698);
                if (!var10_1) ** GOTO lbl244
                throw null;
            }
lbl293:
            // 3 sources

            case 40: {
                var9_2 /* !! */  = (int)w.vuv("xjs", vus(int ), (int)699);
                if (!var10_1) ** GOTO lbl138
                throw null;
            }
            case 41: {
                var9_2 /* !! */  = (int)w.vuv("xjt", vus(int ), (int)700);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
lbl301:
            // 2 sources

            case 42: {
                var9_2 /* !! */  = (int)w.vuv("xju", vus(int ), (int)701);
                if (!var10_1) ** GOTO lbl176
                throw null;
            }
lbl305:
            // 2 sources

            case 43: {
                var9_2 /* !! */  = (int)w.vuv("xjv", vus(int ), (int)702);
                if (!var10_1) ** GOTO lbl181
                throw null;
            }
lbl309:
            // 3 sources

            case 44: {
                var9_2 /* !! */  = (int)w.vuv("xjw", vus(int ), (int)703);
                if (!var10_1) ** GOTO lbl118
                throw null;
            }
            case 45: {
                var9_2 /* !! */  = (int)w.vuv("xjx", vus(int ), (int)704);
                if (!var10_1) ** GOTO lbl113
                throw null;
            }
lbl317:
            // 3 sources

            case 46: {
                var9_2 /* !! */  = (int)w.vuv("xjy", vus(int ), (int)705);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl382
            }
lbl322:
            // 3 sources

            case 47: {
                var9_2 /* !! */  = (int)w.vuv("xjz", vus(int ), (int)706);
                if (!var10_1) ** GOTO lbl267
                throw null;
            }
            case 48: {
                var9_2 /* !! */  = (int)w.vuv("xka", vus(int ), (int)707);
                if (!var10_1) ** GOTO lbl272
                throw null;
            }
lbl330:
            // 4 sources

            case 49: {
                var9_2 /* !! */  = (int)w.vuv("xkb", vus(int ), (int)708);
                if (!var10_1) ** GOTO lbl234
                throw null;
            }
            case 50: {
                var9_2 /* !! */  = (int)w.vuv("xkc", vus(int ), (int)709);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl449
            }
            case 51: {
                var9_2 /* !! */  = (int)w.vuv("xkd", vus(int ), (int)710);
                if (!var10_1) ** GOTO lbl262
                throw null;
            }
            case 52: {
                var9_2 /* !! */  = (int)w.vuv("xke", vus(int ), (int)711);
                if (!var10_1) ** GOTO lbl176
                throw null;
            }
lbl347:
            // 2 sources

            case 53: {
                var9_2 /* !! */  = (int)w.vuv("xkf", vus(int ), (int)712);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl445
            }
lbl352:
            // 3 sources

            case 54: {
                var9_2 /* !! */  = (int)w.vuv("xkg", vus(int ), (int)713);
                if (!var10_1) ** GOTO lbl176
                throw null;
            }
            case 55: {
                do {
                    var9_2 /* !! */  = (int)w.vuv("xkh", vus(int ), (int)714);
                } while (!var10_1);
                throw null;
            }
lbl361:
            // 3 sources

            case 56: {
                var9_2 /* !! */  = (int)w.vuv("xki", vus(int ), (int)715);
                if (!var10_1) ** GOTO lbl229
                throw null;
            }
lbl365:
            // 2 sources

            case 57: {
                var9_2 /* !! */  = (int)w.vuv("xkj", vus(int ), (int)716);
                if (!var10_1) ** GOTO lbl186
                throw null;
            }
lbl369:
            // 2 sources

            case 58: {
                var9_2 /* !! */  = (int)w.vuv("xkk", vus(int ), (int)717);
                if (!var10_1) ** GOTO lbl204
                throw null;
            }
lbl373:
            // 3 sources

            case 59: {
                var9_2 /* !! */  = (int)w.vuv("xkl", vus(int ), (int)718);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl453
            }
lbl378:
            // 2 sources

            case 60: {
                var9_2 /* !! */  = (int)w.vuv("xkm", vus(int ), (int)719);
                if (!var10_1) ** GOTO lbl143
                throw null;
            }
lbl382:
            // 2 sources

            case 61: {
                var9_2 /* !! */  = (int)w.vuv("xkn", vus(int ), (int)720);
                if (var10_1) {
                    throw null;
                }
            }
            case 62: {
                var9_2 /* !! */  = (int)w.vuv("xko", vus(int ), (int)721);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl391:
            // 2 sources

            case 63: {
                var9_2 /* !! */  = (int)w.vuv("xkp", vus(int ), (int)722);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 64: {
                var9_2 /* !! */  = (int)w.vuv("xkq", vus(int ), (int)723);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
lbl400:
            // 3 sources

            case 65: {
                var9_2 /* !! */  = (int)w.vuv("xkr", vus(int ), (int)724);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl445
            }
lbl405:
            // 2 sources

            case 66: {
                var9_2 /* !! */  = (int)w.vuv("xks", vus(int ), (int)725);
                if (!var10_1) ** GOTO lbl309
                throw null;
            }
            case 67: {
                var9_2 /* !! */  = (int)w.vuv("xkt", vus(int ), (int)726);
                if (!var10_1) ** GOTO lbl322
                throw null;
            }
lbl413:
            // 2 sources

            case 68: {
                var9_2 /* !! */  = (int)w.vuv("xku", vus(int ), (int)727);
                if (!var10_1) ** GOTO lbl400
                throw null;
            }
lbl417:
            // 2 sources

            case 69: {
                var9_2 /* !! */  = (int)w.vuv("xkv", vus(int ), (int)728);
                if (!var10_1) ** GOTO lbl277
                throw null;
            }
            case 70: {
                var9_2 /* !! */  = (int)w.vuv("xkw", vus(int ), (int)729);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
lbl425:
            // 2 sources

            case 71: {
                var9_2 /* !! */  = (int)w.vuv("xkx", vus(int ), (int)730);
                if (!var10_1) ** GOTO lbl317
                throw null;
            }
lbl429:
            // 2 sources

            case 72: {
                var9_2 /* !! */  = (int)w.vuv("xky", vus(int ), (int)731);
                if (!var10_1) ** GOTO lbl317
                throw null;
            }
            case 73: {
                var9_2 /* !! */  = (int)w.vuv("xkz", vus(int ), (int)732);
                if (!var10_1) ** GOTO lbl378
                throw null;
            }
            case 74: {
                var9_2 /* !! */  = (int)w.vuv("xla", vus(int ), (int)733);
                if (!var10_1) ** GOTO lbl429
                throw null;
            }
            case 75: {
                var9_2 /* !! */  = (int)w.vuv("xlb", vus(int ), (int)734);
                if (!var10_1) ** GOTO lbl176
                throw null;
            }
lbl445:
            // 3 sources

            case 76: {
                var9_2 /* !! */  = (int)w.vuv("xlc", vus(int ), (int)735);
                if (!var10_1) ** GOTO lbl209
                throw null;
            }
lbl449:
            // 3 sources

            case 77: {
                var9_2 /* !! */  = (int)w.vuv("xld", vus(int ), (int)736);
                if (!var10_1) ** GOTO lbl405
                throw null;
            }
lbl453:
            // 4 sources

            case 78: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)w.vuv("xle", vus(int ), (int)737);
                    if (!var10_1) ** GOTO lbl330
                    throw null;
                }
            }
lbl458:
            // 2 sources

            case 79: {
                var9_2 /* !! */  = (int)w.vuv("xlf", vus(int ), (int)738);
                if (!var10_1) ** GOTO lbl352
                throw null;
            }
            case 80: {
                var9_2 /* !! */  = (int)w.vuv("xlg", vus(int ), (int)739);
                if (!var10_1) ** GOTO lbl123
                throw null;
            }
            case 81: {
                var9_2 /* !! */  = (int)w.vuv("xlh", vus(int ), (int)740);
                if (!var10_1) ** GOTO lbl118
                throw null;
            }
            case 82: 
        }
        var9_2 /* !! */  = (int)w.vuv("xli", vus(int ), (int)741);
        ** while (!var10_1)
lbl473:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void performDirectMove(class_243 var1_1) {
        while (true) {
            block145: {
                if ((v0 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("ygo", wbd(int ), (int)420)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  != w.vuv("ygp", vus(int ), (int)878)) break block145;
                var4_2 = w.c;
                v1 /* !! */  = w.bh;
                if (true) ** GOTO lbl12
            }
            v0 /* !! */  = (long)w.vuv("ygq", vus(int ), (int)879);
        }
        block93: while (true) {
            v1 /* !! */  = (long)(v2 - w.vuv("ygr", wbd(int ), (int)421));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -351490116: {
                    v2 = w.vuv("ygs", wbd(int ), (int)422);
                    continue block93;
                }
                case -248043220: {
                    v2 = w.vuv("ygt", wbd(int ), (int)423);
                    continue block93;
                }
                case 1952754353: {
                    break block93;
                }
            }
            break;
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("ygu", wbd(int ), (int)424)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == w.vuv("ygv", vus(int ), (int)880)) {
                var2_4 = w.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)w.vuv("ygw", vus(int ), (int)881);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block95: while (true) {
            block146: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 || var2_4) return;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("ygx", wbd(int ), (int)425)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != w.vuv("ygy", vus(int ), (int)882)) ** GOTO lbl42
                            v5 /* !! */  = w.bh;
                            if (true) ** GOTO lbl92
lbl42:
                            // 1 sources

                            v4 /* !! */  = (long)w.vuv("ygz", vus(int ), (int)883);
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)w.vuv("ykk", vus(int ), (int)917);
                        cfr_temp_0 = 10;
                        if (var4_2) {
                            throw null;
                        }
                        break block146;
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)w.vuv("ykl", vus(int ), (int)918);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block146;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)w.vuv("ykm", vus(int ), (int)919);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)w.vuv("yke", vus(int ), (int)911);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)w.vuv("ykn", vus(int ), (int)920);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)w.vuv("ykj", vus(int ), (int)916);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)w.vuv("ykd", vus(int ), (int)910);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** GOTO lbl82
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)w.vuv("yko", vus(int ), (int)921);
                        if (var4_2) {
                            throw null;
                        }
lbl82:
                        // 3 sources

                        var3_3 /* !! */  = (int)w.vuv("ykf", vus(int ), (int)912);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        do {
                            var3_3 /* !! */  = (int)w.vuv("ykg", vus(int ), (int)913);
                        } while (!var4_2);
                        throw null;
                    }
                    block98: while (true) {
                        v5 /* !! */  = (long)(v6 - w.vuv("yha", wbd(int ), (int)426));
lbl92:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1979304711: {
                                v6 = w.vuv("yhb", wbd(int ), (int)427);
                                continue block98;
                            }
                            case -1003676863: {
                                v6 = w.vuv("yhc", wbd(int ), (int)428);
                                continue block98;
                            }
                            case -775306804: {
                                v6 = w.vuv("yhd", wbd(int ), (int)429);
                                continue block98;
                            }
                            case 1952754353: {
                                break block98;
                            }
                        }
                        break;
                    }
                    v7 = w.mc.field_1724;
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = w.bh - w.vuv("yhe", wbd(int ), (int)430)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == w.vuv("yhf", vus(int ), (int)884)) break;
                        v8 /* !! */  = (long)w.vuv("yhg", vus(int ), (int)885);
                    }
                    v9 = v7.field_3944;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = w.bh - w.vuv("yhh", wbd(int ), (int)431)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == w.vuv("yhi", vus(int ), (int)886)) break;
                        v10 /* !! */  = (long)w.vuv("yhj", vus(int ), (int)887);
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_6 = w.bh - w.vuv("yhk", wbd(int ), (int)432)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == w.vuv("yhl", vus(int ), (int)888)) break;
                        v11 /* !! */  = (long)w.vuv("yhm", vus(int ), (int)889);
                    }
                    v12 = var1_1.field_1352;
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_7 = w.bh - w.vuv("yhn", wbd(int ), (int)433)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == w.vuv("yho", vus(int ), (int)890)) break;
                        v13 /* !! */  = (long)w.vuv("yhp", vus(int ), (int)891);
                    }
                    v14 = var1_1.field_1351;
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_8 = w.bh - w.vuv("yhq", wbd(int ), (int)434)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  != w.vuv("yhr", vus(int ), (int)892)) ** GOTO lbl134
                        v16 = var1_1.field_1350;
                        v17 /* !! */  = w.bh;
                        if (true) ** GOTO lbl138
lbl134:
                        // 1 sources

                        v15 /* !! */  = (long)w.vuv("yhs", vus(int ), (int)893);
                    }
                    block104: while (true) {
                        v17 /* !! */  = (long)(v18 - w.vuv("yht", wbd(int ), (int)435));
lbl138:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1244913763: {
                                v18 = w.vuv("yhu", wbd(int ), (int)436);
                                continue block104;
                            }
                            case 271398152: {
                                v18 = w.vuv("yhv", wbd(int ), (int)437);
                                continue block104;
                            }
                            case 866571007: {
                                v18 = w.vuv("yhw", wbd(int ), (int)438);
                                continue block104;
                            }
                            case 1952754353: {
                                break block104;
                            }
                        }
                        break;
                    }
                    v19 /* !! */  = w.bh;
                    if (true) ** GOTO lbl154
                    block105: while (true) {
                        v19 /* !! */  = (long)(v20 - w.vuv("yhx", wbd(int ), (int)439));
lbl154:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -598255241: {
                                v20 = w.vuv("yhy", wbd(int ), (int)440);
                                continue block105;
                            }
                            case 1583589645: {
                                v20 = w.vuv("yhz", wbd(int ), (int)441);
                                continue block105;
                            }
                            case 1901861473: {
                                v20 = w.vuv("yia", wbd(int ), (int)442);
                                continue block105;
                            }
                            case 1952754353: {
                                break block105;
                            }
                        }
                        break;
                    }
                    v21 = w.mc.field_1724;
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_9 = w.bh - w.vuv("yib", wbd(int ), (int)443)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == w.vuv("yic", vus(int ), (int)894)) break;
                        v22 /* !! */  = (long)w.vuv("yid", vus(int ), (int)895);
                    }
                    v23 = v21.method_36454();
                    v24 /* !! */  = w.bh;
                    block107: while (true) {
                        switch ((int)v24 /* !! */ ) {
                            case -592059428: {
                                v24 /* !! */  = (long)(w.vuv("yif", wbd(int ), (int)445) - w.vuv("yie", wbd(int ), (int)444));
                                continue block107;
                            }
                            case 1952754353: {
                                break block107;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v25 /* !! */  = (cfr_temp_10 = w.bh - w.vuv("yig", wbd(int ), (int)446)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v25 /* !! */  == w.vuv("yih", vus(int ), (int)896)) break;
                        v25 /* !! */  = (long)w.vuv("yii", vus(int ), (int)897);
                    }
                    v26 = w.mc.field_1724;
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_11 = w.bh - w.vuv("yij", wbd(int ), (int)447)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == w.vuv("yik", vus(int ), (int)898)) break;
                        v27 /* !! */  = (long)w.vuv("yil", vus(int ), (int)899);
                    }
                    v28 = v26.method_36455();
                    v29 = w.vuv("yim", vus(int ), (int)900);
                    v30 = w.vuv("yin", vus(int ), (int)901);
                    while (true) {
                        if ((v31 /* !! */  = (cfr_temp_12 = w.bh - w.vuv("yio", wbd(int ), (int)448)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v31 /* !! */  == w.vuv("yip", vus(int ), (int)902)) break;
                        v31 /* !! */  = (long)w.vuv("yiq", vus(int ), (int)903);
                    }
                    v32 = new class_2828.class_2830(v12, v14, v16, v23, v28, (boolean)v29, (boolean)v30);
                    while (true) {
                        if ((v33 /* !! */  = (cfr_temp_13 = w.bh - w.vuv("yir", wbd(int ), (int)449)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v33 /* !! */  == w.vuv("yis", vus(int ), (int)904)) {
                            v9.method_52787((class_2596)v32);
                            if (var2_4) return;
                            break;
                        }
                        v33 /* !! */  = (long)w.vuv("yit", vus(int ), (int)905);
                    }
                    if (var2_4) return;
                    while (true) {
                        if ((v34 /* !! */  = (cfr_temp_14 = w.bh - w.vuv("yiu", wbd(int ), (int)450)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                        if (v34 /* !! */  != w.vuv("yiv", vus(int ), (int)906)) ** GOTO lbl215
                        v35 /* !! */  = w.bh;
                        if (true) ** GOTO lbl219
lbl215:
                        // 1 sources

                        v34 /* !! */  = (long)w.vuv("yiw", vus(int ), (int)907);
                    }
                    block113: while (true) {
                        v35 /* !! */  = (long)(v36 - w.vuv("yix", wbd(int ), (int)451));
lbl219:
                        // 2 sources

                        switch ((int)v35 /* !! */ ) {
                            case -363187375: {
                                v36 = w.vuv("yiy", wbd(int ), (int)452);
                                continue block113;
                            }
                            case 708587358: {
                                v36 = w.vuv("yiz", wbd(int ), (int)453);
                                continue block113;
                            }
                            case 1952754353: {
                                break block113;
                            }
                        }
                        break;
                    }
                    v37 = w.mc.field_1724;
                    v38 /* !! */  = w.bh;
                    block114: while (true) {
                        switch ((int)v38 /* !! */ ) {
                            case -105265135: {
                                v38 /* !! */  = (long)(w.vuv("yjb", wbd(int ), (int)455) - w.vuv("yja", wbd(int ), (int)454));
                                continue block114;
                            }
                            case 1952754353: {
                                break block114;
                            }
                        }
                        break;
                    }
                    v39 = var1_1.field_1352;
                    v40 /* !! */  = w.bh;
                    block115: while (true) {
                        switch ((int)v40 /* !! */ ) {
                            case -988651187: {
                                v40 /* !! */  = (long)(w.vuv("yjd", wbd(int ), (int)457) - w.vuv("yjc", wbd(int ), (int)456));
                                continue block115;
                            }
                            case 1952754353: {
                                break block115;
                            }
                        }
                        break;
                    }
                    v41 = var1_1.field_1351;
                    v42 /* !! */  = w.bh;
                    block116: while (true) {
                        switch ((int)v42 /* !! */ ) {
                            case -962653026: {
                                v42 /* !! */  = (long)(w.vuv("yjf", wbd(int ), (int)459) - w.vuv("yje", wbd(int ), (int)458));
                                continue block116;
                            }
                            case 1952754353: {
                                break block116;
                            }
                        }
                        break;
                    }
                    v43 = var1_1.field_1350;
                    v44 /* !! */  = w.bh;
                    if (true) ** GOTO lbl260
                    block117: while (true) {
                        v44 /* !! */  = (long)(v45 - w.vuv("yjg", wbd(int ), (int)460));
lbl260:
                        // 2 sources

                        switch ((int)v44 /* !! */ ) {
                            case -1525292617: {
                                v45 = w.vuv("yjh", wbd(int ), (int)461);
                                continue block117;
                            }
                            case -1213282549: {
                                v45 = w.vuv("yji", wbd(int ), (int)462);
                                continue block117;
                            }
                            case 1952754353: {
                                break block117;
                            }
                        }
                        break;
                    }
                    v37.method_5814(v39, v41, v43);
                    if (var2_4 || var2_4) return;
                    v46 /* !! */  = w.bh;
                    if (true) ** GOTO lbl275
                    block118: while (true) {
                        v46 /* !! */  = (long)(v47 - w.vuv("yjj", wbd(int ), (int)463));
lbl275:
                        // 2 sources

                        switch ((int)v46 /* !! */ ) {
                            case -2060896566: {
                                v47 = w.vuv("yjk", wbd(int ), (int)464);
                                continue block118;
                            }
                            case -1378477648: {
                                v47 = w.vuv("yjl", wbd(int ), (int)465);
                                continue block118;
                            }
                            case 1952754353: {
                                break block118;
                            }
                        }
                        break;
                    }
                    v48 /* !! */  = w.bh;
                    if (true) ** GOTO lbl288
                    block119: while (true) {
                        v48 /* !! */  = (long)(v49 - w.vuv("yjm", wbd(int ), (int)466));
lbl288:
                        // 2 sources

                        switch ((int)v48 /* !! */ ) {
                            case -1808971350: {
                                v49 = w.vuv("yjn", wbd(int ), (int)467);
                                continue block119;
                            }
                            case 101840477: {
                                v49 = w.vuv("yjo", wbd(int ), (int)468);
                                continue block119;
                            }
                            case 1952754353: {
                                break block119;
                            }
                        }
                        break;
                    }
                    v50 = w.mc.field_1724;
                    v51 /* !! */  = w.bh;
                    block120: while (true) {
                        switch ((int)v51 /* !! */ ) {
                            case 572644884: {
                                v51 /* !! */  = (long)(w.vuv("yjq", wbd(int ), (int)470) - w.vuv("yjp", wbd(int ), (int)469));
                                continue block120;
                            }
                            case 1952754353: {
                                break block120;
                            }
                        }
                        break;
                    }
                    v52 /* !! */  = w.bh;
                    if (true) ** GOTO lbl310
                    block121: while (true) {
                        v52 /* !! */  = (long)(v53 - w.vuv("yjr", wbd(int ), (int)471));
lbl310:
                        // 2 sources

                        switch ((int)v52 /* !! */ ) {
                            case -228768801: {
                                v53 = w.vuv("yjs", wbd(int ), (int)472);
                                continue block121;
                            }
                            case 530635494: {
                                v53 = w.vuv("yjt", wbd(int ), (int)473);
                                continue block121;
                            }
                            case 1952754353: {
                                break block121;
                            }
                        }
                        break;
                    }
                    v50.method_18799(class_243.field_1353);
                    if (var2_4 || var2_4) return;
                    v54 /* !! */  = w.bh;
                    if (true) ** GOTO lbl325
                    block122: while (true) {
                        v54 /* !! */  = (long)(v55 - w.vuv("yju", wbd(int ), (int)474));
lbl325:
                        // 2 sources

                        switch ((int)v54 /* !! */ ) {
                            case 720730793: {
                                v55 = w.vuv("yjv", wbd(int ), (int)475);
                                continue block122;
                            }
                            case 754884718: {
                                v55 = w.vuv("yjw", wbd(int ), (int)476);
                                continue block122;
                            }
                            case 1872286763: {
                                v55 = w.vuv("yjx", wbd(int ), (int)477);
                                continue block122;
                            }
                            case 1952754353: {
                                break block122;
                            }
                        }
                        break;
                    }
                    v56 /* !! */  = w.bh;
                    block123: while (true) {
                        switch ((int)v56 /* !! */ ) {
                            case -441851338: {
                                v56 /* !! */  = (long)(w.vuv("yjz", wbd(int ), (int)479) - w.vuv("yjy", wbd(int ), (int)478));
                                continue block123;
                            }
                            case 1952754353: {
                                break block123;
                            }
                        }
                        break;
                    }
                    v57 = w.mc.field_1724;
                    while (true) {
                        if ((v58 /* !! */  = (cfr_temp_15 = w.bh - w.vuv("yka", wbd(int ), (int)480)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                        if (v58 /* !! */  == w.vuv("ykb", vus(int ), (int)908)) {
                            v57.field_6017 = 0.0;
                            if (var2_4) return;
                            break;
                        }
                        v58 /* !! */  = (long)w.vuv("ykc", vus(int ), (int)909);
                    }
                    if (!var2_4) return;
                    return;
                    case 4: {
                        var3_3 /* !! */  = (int)w.vuv("ykh", vus(int ), (int)914);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl365
            }
            do {
                if (true) continue block95;
lbl365:
                // 2 sources

                var3_3 /* !! */  = (int)w.vuv("yki", vus(int ), (int)915);
                cfr_temp_0 = 4;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void yro() {
        w.vuu[100] = 1785512759;
        w.vuu[101] = 976052410;
        w.vuu[102] = -1693755064;
        w.vuu[103] = -1414783705;
        w.vuu[104] = 1170349080;
        w.vuu[105] = 196531750;
        w.vuu[106] = -613671229;
        w.vuu[107] = 592775500;
        w.vuu[108] = 2031569064;
        w.vuu[109] = 1082022476;
        w.vuu[110] = 795779526;
        w.vuu[111] = -1813872283;
        w.vuu[112] = 1420517944;
        w.vuu[113] = -1503215230;
        w.vuu[114] = 684392684;
        w.vuu[115] = -2126220538;
        w.vuu[116] = 1449819654;
        w.vuu[117] = -907555966;
        w.vuu[118] = -1692680301;
        w.vuu[119] = 2045327352;
        w.vuu[120] = 937663351;
        w.vuu[121] = 2055581274;
        w.vuu[122] = 445327291;
        w.vuu[123] = -1028449200;
        w.vuu[124] = -1363627357;
        w.vuu[125] = 1094835365;
        w.vuu[126] = -1948621260;
        w.vuu[127] = 913813950;
        w.vuu[128] = -1541232873;
        w.vuu[129] = 1419082495;
        w.vuu[130] = -360987400;
        w.vuu[131] = -1143962590;
        w.vuu[132] = -1317330219;
        w.vuu[133] = -644269899;
        w.vuu[134] = -1322539051;
        w.vuu[135] = 1617560420;
        w.vuu[136] = 240819615;
        w.vuu[137] = -335183940;
        w.vuu[138] = 973745999;
        w.vuu[139] = 779531908;
        w.vuu[140] = 1626936436;
        w.vuu[141] = -504287260;
        w.vuu[142] = -1628330557;
        w.vuu[143] = 750390255;
        w.vuu[144] = 1600402779;
        w.vuu[145] = -337356467;
        w.vuu[146] = 803478223;
        w.vuu[147] = 1023367956;
        w.vuu[148] = 1074135902;
        w.vuu[149] = -1590187495;
        w.vuu[150] = 774689009;
        w.vuu[151] = 486992695;
        w.vuu[152] = 908277465;
        w.vuu[153] = 1299114111;
        w.vuu[154] = -461693010;
        w.vuu[155] = -1962581598;
        w.vuu[156] = -1034780536;
        w.vuu[157] = -1999235886;
        w.vuu[158] = -1231819785;
        w.vuu[159] = 1858549361;
        w.vuu[160] = 1504265826;
        w.vuu[161] = -1886966607;
        w.vuu[162] = 914642041;
        w.vuu[163] = 317018504;
        w.vuu[164] = 2135773665;
        w.vuu[165] = 1691195504;
        w.vuu[166] = 1284116737;
        w.vuu[167] = 1628678624;
        w.vuu[168] = 1724209037;
        w.vuu[169] = 1255103358;
        w.vuu[170] = 619254842;
        w.vuu[171] = 2025710134;
        w.vuu[172] = -1958264127;
        w.vuu[173] = 725007989;
        w.vuu[174] = 672308309;
        w.vuu[175] = 2055391426;
        w.vuu[176] = 1701426680;
        w.vuu[177] = -454069676;
        w.vuu[178] = -1957864215;
        w.vuu[179] = -1010252795;
        w.vuu[180] = -897106300;
        w.vuu[181] = 703414521;
        w.vuu[182] = -1620620086;
        w.vuu[183] = -1368713469;
        w.vuu[184] = -1431283161;
        w.vuu[185] = -1964222737;
        w.vuu[186] = -39263456;
        w.vuu[187] = 338854644;
        w.vuu[188] = 1510991232;
        w.vuu[189] = 1959562864;
        w.vuu[190] = 1348999085;
        w.vuu[191] = -2066457265;
        w.vuu[192] = 1956700876;
        w.vuu[193] = -1516590698;
        w.vuu[194] = 2093672233;
        w.vuu[195] = 1733181097;
        w.vuu[196] = 1044754637;
        w.vuu[197] = 515609157;
        w.vuu[198] = -1021786423;
        w.vuu[199] = -1601108045;
    }

    private static /* synthetic */ void yvp() {
        w.vxg[0] = -8130402810248961726L;
        w.vxg[1] = -1222964684887244816L;
        w.vxg[2] = -3550752584065858060L;
        w.vxg[3] = -8907540984831711096L;
        w.vxg[4] = 6693521190902449930L;
        w.vxg[5] = -9135277178395129347L;
        w.vxg[6] = 7496461737879062818L;
        w.vxg[7] = -295648314271820173L;
        w.vxg[8] = 9121537218208307786L;
        w.vxg[9] = 3082209908457665607L;
        w.vxg[10] = 1570161387592471573L;
        w.vxg[11] = -8841731568376173986L;
        w.vxg[12] = 1914005139241093637L;
        w.vxg[13] = 8785184822113438801L;
        w.vxg[14] = 2213842957160893909L;
        w.vxg[15] = -6361696403582279316L;
        w.vxg[16] = 1768669661239161560L;
        w.vxg[17] = -6929913615777959623L;
        w.vxg[18] = 6072219872739093440L;
        w.vxg[19] = -514138020610855109L;
        w.vxg[20] = 1997737598154167013L;
        w.vxg[21] = 3026466665209068295L;
        w.vxg[22] = 4656651318899264489L;
        w.vxg[23] = -9084459995041497602L;
        w.vxg[24] = 6426822279790462102L;
        w.vxg[25] = 3833821170022071031L;
        w.vxg[26] = -7560029313846188952L;
        w.vxg[27] = -2835674879128728194L;
        w.vxg[28] = 7094800730732996045L;
        w.vxg[29] = 2835272721422877263L;
        w.vxg[30] = 7511608796491970139L;
        w.vxg[31] = 3799179414282680384L;
        w.vxg[32] = 6318119616641765170L;
        w.vxg[33] = -3843195101507302396L;
        w.vxg[34] = -496494394549126836L;
        w.vxg[35] = -5834946708585766904L;
        w.vxg[36] = 6903033961229176026L;
        w.vxg[37] = 2424719497447023272L;
        w.vxg[38] = 1504624348439987789L;
        w.vxg[39] = 8670858877484834296L;
        w.vxg[40] = -5203064737462450865L;
        w.vxg[41] = -2508657712288509458L;
        w.vxg[42] = -2535338837158298566L;
        w.vxg[43] = 613699901622720715L;
        w.vxg[44] = 1813020837597256372L;
        w.vxg[45] = -2213949748478491361L;
        w.vxg[46] = -3306679148781176102L;
        w.vxg[47] = -2243807216824986361L;
        w.vxg[48] = -6915265471905920951L;
        w.vxg[49] = 5865128455116961153L;
        w.vxg[50] = 3263036057122974610L;
        w.vxg[51] = -1588568584873525260L;
        w.vxg[52] = 7663062526022035671L;
        w.vxg[53] = -8039527983849712809L;
        w.vxg[54] = -7400094234039372740L;
        w.vxg[55] = 812351842345983756L;
        w.vxg[56] = -2025507979930042468L;
        w.vxg[57] = 516633769058569657L;
        w.vxg[58] = -8409033038050403912L;
        w.vxg[59] = 3167553076647005933L;
        w.vxg[60] = -8950759954541939433L;
        w.vxg[61] = 7095775058245886144L;
        w.vxg[62] = 309674969229926234L;
        w.vxg[63] = 3712923598825646116L;
        w.vxg[64] = 5203566508128359853L;
        w.vxg[65] = 2725121862694278574L;
        w.vxg[66] = -4540159792482096942L;
        w.vxg[67] = 7721252091066041826L;
        w.vxg[68] = -2289717759891370723L;
        w.vxg[69] = -9178802398912118172L;
        w.vxg[70] = -4681220829827363577L;
        w.vxg[71] = -8277356466743739669L;
        w.vxg[72] = -6205306972965114524L;
        w.vxg[73] = 2172107500242627453L;
        w.vxg[74] = 1932130115460270425L;
        w.vxg[75] = 5008596020295787275L;
        w.vxg[76] = -108382221482720543L;
        w.vxg[77] = 6987962683208854817L;
        w.vxg[78] = -5410903327213958301L;
        w.vxg[79] = 6416704606280771889L;
        w.vxg[80] = -2848148507332608457L;
        w.vxg[81] = -5985647770804118563L;
        w.vxg[82] = -4109539865648732109L;
        w.vxg[83] = -1227434066560728057L;
        w.vxg[84] = -8734674253169383774L;
        w.vxg[85] = 758504071934401792L;
        w.vxg[86] = -2802143414695740305L;
        w.vxg[87] = 4965313460266342166L;
        w.vxg[88] = -8283675014868547433L;
        w.vxg[89] = -8776776968133651483L;
        w.vxg[90] = 4005488959894456313L;
        w.vxg[91] = -3269566137575030724L;
        w.vxg[92] = -6592611114197511779L;
        w.vxg[93] = -5303879842762247608L;
        w.vxg[94] = -5884199145269416019L;
        w.vxg[95] = -5922825733761254830L;
        w.vxg[96] = -562752372692161211L;
        w.vxg[97] = 5905721728886336122L;
        w.vxg[98] = 1501617326172930562L;
        w.vxg[99] = -4333279639600987559L;
    }

    private static /* synthetic */ void yte() {
        w.vuu[500] = -274578709;
        w.vuu[501] = -629154564;
        w.vuu[502] = 1392210523;
        w.vuu[503] = -1986807535;
        w.vuu[504] = -1074833472;
        w.vuu[505] = -970981178;
        w.vuu[506] = 1629444320;
        w.vuu[507] = 1461298084;
        w.vuu[508] = -28153844;
        w.vuu[509] = 1159343246;
        w.vuu[510] = -1187765824;
        w.vuu[511] = 641256172;
        w.vuu[512] = 1137676575;
        w.vuu[513] = -1721246497;
        w.vuu[514] = -1592905297;
        w.vuu[515] = -1943103862;
        w.vuu[516] = 90019378;
        w.vuu[517] = 1369620998;
        w.vuu[518] = 2125703811;
        w.vuu[519] = 871488977;
        w.vuu[520] = -1576556145;
        w.vuu[521] = -1107955026;
        w.vuu[522] = 1115844814;
        w.vuu[523] = -1297619922;
        w.vuu[524] = 1236237671;
        w.vuu[525] = -1609313239;
        w.vuu[526] = -1829496413;
        w.vuu[527] = -1354441022;
        w.vuu[528] = -283933285;
        w.vuu[529] = 838402974;
        w.vuu[530] = 1614177344;
        w.vuu[531] = 1460949624;
        w.vuu[532] = 2094333497;
        w.vuu[533] = -1660439488;
        w.vuu[534] = 560270887;
        w.vuu[535] = 757120858;
        w.vuu[536] = 301553222;
        w.vuu[537] = 1740520642;
        w.vuu[538] = -1924512371;
        w.vuu[539] = 482574400;
        w.vuu[540] = 1225866270;
        w.vuu[541] = -562907002;
        w.vuu[542] = -254537655;
        w.vuu[543] = 484298634;
        w.vuu[544] = -813466361;
        w.vuu[545] = 705972244;
        w.vuu[546] = 1693878907;
        w.vuu[547] = -1309367060;
        w.vuu[548] = -1620580810;
        w.vuu[549] = 90339803;
        w.vuu[550] = -937895513;
        w.vuu[551] = 948191658;
        w.vuu[552] = -1217439498;
        w.vuu[553] = -122925723;
        w.vuu[554] = -1036998920;
        w.vuu[555] = 854119448;
        w.vuu[556] = -1252787227;
        w.vuu[557] = -1458129626;
        w.vuu[558] = 2000205761;
        w.vuu[559] = -791370824;
        w.vuu[560] = 1975178605;
        w.vuu[561] = 2009226000;
        w.vuu[562] = -869008768;
        w.vuu[563] = 2091154826;
        w.vuu[564] = 642084195;
        w.vuu[565] = 182248258;
        w.vuu[566] = -161020402;
        w.vuu[567] = 465664179;
        w.vuu[568] = -1922332639;
        w.vuu[569] = -1849967917;
        w.vuu[570] = 2133481774;
        w.vuu[571] = 800566640;
        w.vuu[572] = -898218906;
        w.vuu[573] = 1708304866;
        w.vuu[574] = 1452573970;
        w.vuu[575] = 1418520392;
        w.vuu[576] = 1685369722;
        w.vuu[577] = -1564937493;
        w.vuu[578] = -516031452;
        w.vuu[579] = -1955871974;
        w.vuu[580] = -1293972587;
        w.vuu[581] = -922713064;
        w.vuu[582] = -1756227867;
        w.vuu[583] = -909807026;
        w.vuu[584] = 1810127606;
        w.vuu[585] = 93626889;
        w.vuu[586] = -171285605;
        w.vuu[587] = 1803292110;
        w.vuu[588] = 815322522;
        w.vuu[589] = -146316898;
        w.vuu[590] = -195791021;
        w.vuu[591] = 804694994;
        w.vuu[592] = 76695106;
        w.vuu[593] = -1632283189;
        w.vuu[594] = 2032573316;
        w.vuu[595] = 1179130852;
        w.vuu[596] = -929037346;
        w.vuu[597] = -1422657971;
        w.vuu[598] = 1564636624;
        w.vuu[599] = 1054884069;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startAutomatedDirect(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = w.bh - w.vuv("wle", wbd(int ), (int)128)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == w.vuv("wlf", vus(int ), (int)292)) break;
            v0 /* !! */  = (long)w.vuv("wlg", vus(int ), (int)293);
        }
        var4_2 = w.c;
        v1 /* !! */  = w.bh;
        if (true) ** GOTO lbl11
        block43: while (true) {
            v1 /* !! */  = (long)(w.vuv("wli", wbd(int ), (int)130) - w.vuv("wlh", wbd(int ), (int)129));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -216613551: {
                    continue block43;
                }
                case 1952754353: {
                    break block43;
                }
            }
            break;
        }
        var3_3 /* !! */  = w.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = w.bh - w.vuv("wlj", wbd(int ), (int)131)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == w.vuv("wlk", vus(int ), (int)294)) break;
            v2 /* !! */  = (long)w.vuv("wll", vus(int ), (int)295);
        }
        var2_4 = w.a;
        if (var4_2) {
            throw null;
lbl25:
            // 8 sources

            return;
        }
        if (var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl25
                if (var1_1 == null) ** GOTO lbl114
                if (var2_4) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = w.bh - w.vuv("wlm", wbd(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == w.vuv("wln", vus(int ), (int)296)) break;
                    v3 /* !! */  = (long)w.vuv("wlo", vus(int ), (int)297);
                }
                v4 /* !! */  = w.bh;
                if (true) ** GOTO lbl43
                block47: while (true) {
                    v4 /* !! */  = (long)(v5 - w.vuv("wlp", wbd(int ), (int)133));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1184646478: {
                            v5 = w.vuv("wlq", wbd(int ), (int)134);
                            continue block47;
                        }
                        case -201947769: {
                            v5 = w.vuv("wlr", wbd(int ), (int)135);
                            continue block47;
                        }
                        case 1563995778: {
                            v5 = w.vuv("wls", wbd(int ), (int)136);
                            continue block47;
                        }
                        case 1952754353: {
                            break block47;
                        }
                    }
                    break;
                }
                if (w.mc.field_1724 == null) ** GOTO lbl114
                if (var2_4) ** GOTO lbl25
                v6 /* !! */  = w.bh;
                if (true) ** GOTO lbl61
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - w.vuv("wlt", wbd(int ), (int)137));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1714898620: {
                            v7 = w.vuv("wlu", wbd(int ), (int)138);
                            continue block48;
                        }
                        case -1039267437: {
                            v7 = w.vuv("wlv", wbd(int ), (int)139);
                            continue block48;
                        }
                        case -893532386: {
                            v7 = w.vuv("wlw", wbd(int ), (int)140);
                            continue block48;
                        }
                        case 1952754353: {
                            break block48;
                        }
                    }
                    break;
                }
                v8 /* !! */  = w.bh;
                if (true) ** GOTO lbl77
                block49: while (true) {
                    v8 /* !! */  = (long)(v9 - w.vuv("wlx", wbd(int ), (int)141));
lbl77:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -871865140: {
                            v9 = w.vuv("wly", wbd(int ), (int)142);
                            continue block49;
                        }
                        case 1308640429: {
                            v9 = w.vuv("wlz", wbd(int ), (int)143);
                            continue block49;
                        }
                        case 1952754353: {
                            break block49;
                        }
                    }
                    break;
                }
                if (w.mc.field_1687 == null) ** GOTO lbl114
                if (var2_4 || var2_4) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = w.bh - w.vuv("wma", wbd(int ), (int)144)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == w.vuv("wmb", vus(int ), (int)298)) break;
                    v10 /* !! */  = (long)w.vuv("wmc", vus(int ), (int)299);
                }
                this.start(var1_1);
                if (var2_4 || var2_4) ** GOTO lbl25
                v11 = w.vuv("wmd", vus(int ), (int)300);
                v12 /* !! */  = w.bh;
                if (true) ** GOTO lbl100
                block51: while (true) {
                    v12 /* !! */  = (long)(v13 - w.vuv("wme", wbd(int ), (int)145));
lbl100:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1480195670: {
                            v13 = w.vuv("wmf", wbd(int ), (int)146);
                            continue block51;
                        }
                        case -1184418871: {
                            v13 = w.vuv("wmg", wbd(int ), (int)147);
                            continue block51;
                        }
                        case -958101813: {
                            v13 = w.vuv("wmh", wbd(int ), (int)148);
                            continue block51;
                        }
                        case 1952754353: {
                            break block51;
                        }
                    }
                    break;
                }
                this.directAutomatedRoute = v11;
                if (var2_4) ** GOTO lbl25
lbl114:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl117:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)w.vuv("wmi", vus(int ), (int)301);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 1: {
                var3_3 /* !! */  = (int)w.vuv("wmj", vus(int ), (int)302);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl127:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)w.vuv("wmk", vus(int ), (int)303);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
lbl131:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)w.vuv("wml", vus(int ), (int)304);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl136:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)w.vuv("wmm", vus(int ), (int)305);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)w.vuv("wmn", vus(int ), (int)306);
                    if (!var4_2) ** GOTO lbl127
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)w.vuv("wmo", vus(int ), (int)307);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                var3_3 /* !! */  = (int)w.vuv("wmp", vus(int ), (int)308);
                if (!var4_2) ** GOTO lbl136
                throw null;
            }
lbl154:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)w.vuv("wmq", vus(int ), (int)309);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl158:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)w.vuv("wmr", vus(int ), (int)310);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl162:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)w.vuv("wms", vus(int ), (int)311);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
lbl166:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)w.vuv("wmt", vus(int ), (int)312);
                if (!var4_2) ** GOTO lbl158
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)w.vuv("wmu", vus(int ), (int)313);
        ** while (!var4_2)
lbl173:
        // 1 sources

        throw null;
    }
}

