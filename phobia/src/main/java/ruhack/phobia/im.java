/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.c;
import ruhack.phobia.pr;

public class im
implements c {
    private static long[] pfm;
    public static final int b;
    private static int currentPointIndex;
    private static int[] pfs;
    public static final boolean c;
    private static int[] pfr;
    private static final pr updateTimer;
    private static long[] pfn;
    static final long aw = -2317014996142504101L;
    private static final Random shouldRandom;
    private static final pr pointTimer;
    public static final boolean a;
    private static List<class_243> cachedOffsets;
    private static class_243 lastShouldPoint;
    private static class_243 lastOffset;
    private static final Random random;

    public static /* synthetic */ CallSite pfo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void qqe() {
        im.pfn[400] = -7268676033744021215L;
        im.pfn[401] = 751910626203547647L;
        im.pfn[402] = 4952906458829642994L;
        im.pfn[403] = -6347305886458010308L;
        im.pfn[404] = 3041190152684953293L;
        im.pfn[405] = -1732945332588625645L;
        im.pfn[406] = -5311226693195541281L;
        im.pfn[407] = 6693140820634586392L;
        im.pfn[408] = 1868028002003402033L;
        im.pfn[409] = -8795222197912744462L;
        im.pfn[410] = -8532761394733101328L;
        im.pfn[411] = 1567988749954888887L;
        im.pfn[412] = -463599554818323099L;
        im.pfn[413] = -8352513676016550723L;
        im.pfn[414] = 8876996500484252227L;
        im.pfn[415] = 998568986376530862L;
        im.pfn[416] = -2696591927121636552L;
        im.pfn[417] = -4115206216645337022L;
        im.pfn[418] = 4982678602100197389L;
        im.pfn[419] = -116635318130433085L;
        im.pfn[420] = 7156451240322487865L;
        im.pfn[421] = 4417512494806914906L;
        im.pfn[422] = 7337285713414917262L;
        im.pfn[423] = -2647473634024547705L;
        im.pfn[424] = 5077109409601351644L;
        im.pfn[425] = -2818083225426945646L;
        im.pfn[426] = 8732040612789988701L;
        im.pfn[427] = 391305290013607366L;
        im.pfn[428] = -3441835675525212525L;
        im.pfn[429] = 8804264198092262688L;
        im.pfn[430] = -6363691680558874484L;
        im.pfn[431] = -5052462859876402715L;
        im.pfn[432] = 4822692765695587914L;
        im.pfn[433] = 3165451618842992468L;
        im.pfn[434] = -7350821678587494850L;
        im.pfn[435] = 648863513765867217L;
        im.pfn[436] = 3632481194533852853L;
        im.pfn[437] = 2603746080325790863L;
        im.pfn[438] = -1676004431417862818L;
        im.pfn[439] = 2087519966173731511L;
        im.pfn[440] = 6516966232026199457L;
        im.pfn[441] = 7930439965802676033L;
        im.pfn[442] = 362839222185871854L;
        im.pfn[443] = 4634144430155816944L;
        im.pfn[444] = -7415664642797072183L;
        im.pfn[445] = -1602143482620874637L;
        im.pfn[446] = -7758778898992312881L;
        im.pfn[447] = -6978645549434896406L;
        im.pfn[448] = 5989347122741416514L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_243 custom(class_1297 var0, int var1_1, float var2_2) {
        block81: {
            block80: {
                var7_3 = im.c;
                var6_4 /* !! */  = im.b;
                var5_5 = im.a;
                if (var7_3) {
                    throw null;
                }
                if (var5_5 || var5_5) return null;
                if (var0 == null) {
                    if (var5_5) return null;
                    return class_243.field_1353;
                }
                if (var5_5 || var5_5) return null;
                if (im.updateTimer.every((double)im.pfo("qep", phr(int ), (int)333))) break block80;
                if (var5_5) return null;
                if (!im.cachedOffsets.isEmpty()) break block81;
                if (var5_5) return null;
            }
            if (var5_5 || var5_5) return null;
            im.generateRandomPoints(var0, var1_1);
            if (var5_5 || var5_5) return null;
            im.currentPointIndex = (int)im.pfo("qeq", pfq(int ), (int)312);
            if (var5_5 || var5_5) return null;
            im.pointTimer.reset();
            if (var5_5) return null;
        }
        if (var5_5 || var5_5) return null;
        if (!im.pointTimer.finished(var2_2)) ** GOTO lbl37
        if (var5_5 || var5_5) return null;
        im.currentPointIndex = (im.currentPointIndex + im.pfo("qer", pfq(int ), (int)313)) % im.cachedOffsets.size();
        if (var5_5) return null;
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block36: while (true) {
            block82: {
                switch (cfr_temp_0 == -2147483648 ? var6_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_5) return null;
                        im.pointTimer.reset();
                        if (var5_5) return null;
lbl37:
                        // 2 sources

                        if (var5_5 || var5_5) return null;
                        if (im.cachedOffsets.isEmpty()) {
                            if (var5_5 || var5_5) return null;
                            return var0.method_73189();
                        }
                        if (var5_5 || var5_5) return null;
                        var3_6 = var0.method_73189();
                        if (var5_5 || var5_5) return null;
                        var4_7 = im.cachedOffsets.get(im.currentPointIndex);
                        if (!var5_5 && !var5_5) return var3_6.method_1019(var4_7);
                        return null;
                    }
                    case 2: {
                        var6_4 /* !! */  = (int)im.pfo("qeu", pfq(int ), (int)316);
                        cfr_temp_0 = 19;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 3: {
                        ** GOTO lbl175
                    }
                    case 5: {
                        var6_4 /* !! */  = (int)im.pfo("qex", pfq(int ), (int)319);
                        cfr_temp_0 = 18;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 6: {
                        var6_4 /* !! */  = (int)im.pfo("qey", pfq(int ), (int)320);
                        cfr_temp_0 = 31;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 9: {
                        var6_4 /* !! */  = (int)im.pfo("qfb", pfq(int ), (int)323);
                        cfr_temp_0 = 11;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 12: {
                        var6_4 /* !! */  = (int)im.pfo("qfe", pfq(int ), (int)326);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var6_4 /* !! */  = (int)im.pfo("qet", pfq(int ), (int)315);
                        cfr_temp_0 = 21;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 14: {
                        var6_4 /* !! */  = (int)im.pfo("qfg", pfq(int ), (int)328);
                        cfr_temp_0 = 4;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 17: {
                        var6_4 /* !! */  = (int)im.pfo("qfj", pfq(int ), (int)331);
                        cfr_temp_0 = 26;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 19: {
                        var6_4 /* !! */  = (int)im.pfo("qfl", pfq(int ), (int)333);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 23: {
                        var6_4 /* !! */  = (int)im.pfo("qfp", pfq(int ), (int)337);
                        if (!var7_3) ** break;
                        throw null;
                    }
                    case 26: {
                        var6_4 /* !! */  = (int)im.pfo("qfs", pfq(int ), (int)340);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 27: {
                        var6_4 /* !! */  = (int)im.pfo("qft", pfq(int ), (int)341);
                        cfr_temp_0 = 21;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 28: {
                        var6_4 /* !! */  = (int)im.pfo("qfu", pfq(int ), (int)342);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var6_4 /* !! */  = (int)im.pfo("qez", pfq(int ), (int)321);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 21: {
                        var6_4 /* !! */  = (int)im.pfo("qfn", pfq(int ), (int)335);
                        cfr_temp_0 = 13;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 29: {
                        var6_4 /* !! */  = (int)im.pfo("qfv", pfq(int ), (int)343);
                        cfr_temp_0 = 11;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 32: {
                        var6_4 /* !! */  = (int)im.pfo("qfy", pfq(int ), (int)346);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 25: {
                        var6_4 /* !! */  = (int)im.pfo("qfr", pfq(int ), (int)339);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 13: {
                        var6_4 /* !! */  = (int)im.pfo("qff", pfq(int ), (int)327);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 15: {
                        var6_4 /* !! */  = (int)im.pfo("qfh", pfq(int ), (int)329);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 22: {
                        var6_4 /* !! */  = (int)im.pfo("qfo", pfq(int ), (int)336);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 0: {
                        var6_4 /* !! */  = (int)im.pfo("qes", pfq(int ), (int)314);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 31: {
                        var6_4 /* !! */  = (int)im.pfo("qfx", pfq(int ), (int)345);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 8: {
                        var6_4 /* !! */  = (int)im.pfo("qfa", pfq(int ), (int)322);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 24: {
                        var6_4 /* !! */  = (int)im.pfo("qfq", pfq(int ), (int)338);
                        cfr_temp_0 = 30;
                        if (var7_3) {
                            throw null;
                        }
                        break block82;
                    }
                    case 33: {
                        var6_4 /* !! */  = (int)im.pfo("qfz", pfq(int ), (int)347);
                        if (var7_3) {
                            throw null;
                        }
lbl175:
                        // 3 sources

                        var6_4 /* !! */  = (int)im.pfo("qev", pfq(int ), (int)317);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 11: {
                        var6_4 /* !! */  = (int)im.pfo("qfd", pfq(int ), (int)325);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var6_4 /* !! */  = (int)im.pfo("qew", pfq(int ), (int)318);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 20: {
                        var6_4 /* !! */  = (int)im.pfo("qfm", pfq(int ), (int)334);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 16: {
                        var6_4 /* !! */  = (int)im.pfo("qfi", pfq(int ), (int)330);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 10: {
                        var6_4 /* !! */  = (int)im.pfo("qfc", pfq(int ), (int)324);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 30: {
                        var6_4 /* !! */  = (int)im.pfo("qfw", pfq(int ), (int)344);
                        if (var7_3) {
                            throw null;
                        }
                    }
                    case 18: 
                }
                ** GOTO lbl207
            }
            do {
                if (true) continue block36;
lbl207:
                // 2 sources

                var6_4 /* !! */  = (int)im.pfo("qfk", pfq(int ), (int)332);
                cfr_temp_0 = 4;
            } while (!var7_3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void qpq() {
        im.pfs[0] = 182827128;
        im.pfs[1] = 1203971417;
        im.pfs[2] = -1906202626;
        im.pfs[3] = 1697231496;
        im.pfs[4] = -317321483;
        im.pfs[5] = -816114506;
        im.pfs[6] = 184133463;
        im.pfs[7] = 1332016963;
        im.pfs[8] = 1950474678;
        im.pfs[9] = 636372196;
        im.pfs[10] = -492418188;
        im.pfs[11] = -2116430914;
        im.pfs[12] = -957144904;
        im.pfs[13] = -986174175;
        im.pfs[14] = 578967850;
        im.pfs[15] = 1187898788;
        im.pfs[16] = 1366346787;
        im.pfs[17] = -70662916;
        im.pfs[18] = 794126634;
        im.pfs[19] = 850506803;
        im.pfs[20] = -367890565;
        im.pfs[21] = -94971959;
        im.pfs[22] = -246305992;
        im.pfs[23] = -1723319833;
        im.pfs[24] = -1796599474;
        im.pfs[25] = 1323409537;
        im.pfs[26] = 1601391631;
        im.pfs[27] = 30886851;
        im.pfs[28] = -154720610;
        im.pfs[29] = -1026060858;
        im.pfs[30] = 1592352947;
        im.pfs[31] = -502809185;
        im.pfs[32] = -1140798779;
        im.pfs[33] = 1543355006;
        im.pfs[34] = 353794919;
        im.pfs[35] = -468643441;
        im.pfs[36] = -2079241271;
        im.pfs[37] = -1635987077;
        im.pfs[38] = 849466808;
        im.pfs[39] = -333936472;
        im.pfs[40] = 485390352;
        im.pfs[41] = -1826423004;
        im.pfs[42] = -392606853;
        im.pfs[43] = -1677208011;
        im.pfs[44] = 518868835;
        im.pfs[45] = 2053459356;
        im.pfs[46] = -1405939706;
        im.pfs[47] = 2139757163;
        im.pfs[48] = 1354964229;
        im.pfs[49] = -732773795;
        im.pfs[50] = 1838693006;
        im.pfs[51] = 87664554;
        im.pfs[52] = -686230414;
        im.pfs[53] = 1611134551;
        im.pfs[54] = -1624633131;
        im.pfs[55] = 167884870;
        im.pfs[56] = 2072681383;
        im.pfs[57] = 273817883;
        im.pfs[58] = 1263782467;
        im.pfs[59] = -546130195;
        im.pfs[60] = -262046707;
        im.pfs[61] = 1069155088;
        im.pfs[62] = 1840474483;
        im.pfs[63] = 437295426;
        im.pfs[64] = -496308826;
        im.pfs[65] = -1058695803;
        im.pfs[66] = -1363685700;
        im.pfs[67] = -1777801721;
        im.pfs[68] = 952037050;
        im.pfs[69] = 631115744;
        im.pfs[70] = -630696656;
        im.pfs[71] = 909236556;
        im.pfs[72] = -1611507219;
        im.pfs[73] = -445645127;
        im.pfs[74] = -474864378;
        im.pfs[75] = -1196325206;
        im.pfs[76] = 574828229;
        im.pfs[77] = -859189576;
        im.pfs[78] = 1017528667;
        im.pfs[79] = 2088884917;
        im.pfs[80] = 1494685113;
        im.pfs[81] = 25091376;
        im.pfs[82] = -1891643069;
        im.pfs[83] = -25039196;
        im.pfs[84] = -644384912;
        im.pfs[85] = 1811409200;
        im.pfs[86] = 571165204;
        im.pfs[87] = -927866536;
        im.pfs[88] = -1812249785;
        im.pfs[89] = -1998428327;
        im.pfs[90] = -369686629;
        im.pfs[91] = -1051323020;
        im.pfs[92] = 533994384;
        im.pfs[93] = -828833682;
        im.pfs[94] = -605784752;
        im.pfs[95] = -49322333;
        im.pfs[96] = -1443409714;
        im.pfs[97] = 770787488;
        im.pfs[98] = -1476695995;
        im.pfs[99] = -1886885224;
    }

    private static /* synthetic */ void qpv() {
        im.pfm[0] = 5479156715117785624L;
        im.pfm[1] = 7558779707804717557L;
        im.pfm[2] = 1167895259525785826L;
        im.pfm[3] = -5001980739194525676L;
        im.pfm[4] = -8419637494998867435L;
        im.pfm[5] = -9065409935276809963L;
        im.pfm[6] = -6220522588252766271L;
        im.pfm[7] = 6192654192347016684L;
        im.pfm[8] = 8262990605633242782L;
        im.pfm[9] = 5279376254656407136L;
        im.pfm[10] = 3992644801147505877L;
        im.pfm[11] = 3142615396347349741L;
        im.pfm[12] = 6065061942232743876L;
        im.pfm[13] = 2959866411422786055L;
        im.pfm[14] = -2459287703105953935L;
        im.pfm[15] = 1969002009672431879L;
        im.pfm[16] = -6154707223068878090L;
        im.pfm[17] = 8272874887017769689L;
        im.pfm[18] = -4432765040248560940L;
        im.pfm[19] = 9176214796385513642L;
        im.pfm[20] = 4342047313984310397L;
        im.pfm[21] = -6308767465426743089L;
        im.pfm[22] = 5452437389898036261L;
        im.pfm[23] = 5523279565886051605L;
        im.pfm[24] = 4720520617941114783L;
        im.pfm[25] = 2977099744535163401L;
        im.pfm[26] = -1763152557684639564L;
        im.pfm[27] = 203505326494130625L;
        im.pfm[28] = -3437634194902811454L;
        im.pfm[29] = 5791222748399909416L;
        im.pfm[30] = -1431941289253373368L;
        im.pfm[31] = 409272669266489269L;
        im.pfm[32] = 6365823928654801881L;
        im.pfm[33] = 4098261104339795658L;
        im.pfm[34] = -8808989915186574962L;
        im.pfm[35] = 4417267216809088218L;
        im.pfm[36] = 4639437816981005469L;
        im.pfm[37] = -3771603381588603844L;
        im.pfm[38] = 3940202762232036605L;
        im.pfm[39] = -773274210144167592L;
        im.pfm[40] = -6084855733867957223L;
        im.pfm[41] = -4680371300626166339L;
        im.pfm[42] = 6143696727665963484L;
        im.pfm[43] = 2490899906048137513L;
        im.pfm[44] = -2374008505910980383L;
        im.pfm[45] = 4182808292072130117L;
        im.pfm[46] = 7523232902796287002L;
        im.pfm[47] = -6452772873177290044L;
        im.pfm[48] = 3956066633369086937L;
        im.pfm[49] = 333863494055712040L;
        im.pfm[50] = 8513605531667767263L;
        im.pfm[51] = 4806920150035079032L;
        im.pfm[52] = 2956910571911111145L;
        im.pfm[53] = -2690083850634048477L;
        im.pfm[54] = 6660481834505073508L;
        im.pfm[55] = 771709199660162000L;
        im.pfm[56] = -559977987017447664L;
        im.pfm[57] = 9075663373816467842L;
        im.pfm[58] = -5215137220508060591L;
        im.pfm[59] = -7795810631755259649L;
        im.pfm[60] = -8504873768137783303L;
        im.pfm[61] = -3444872869534762498L;
        im.pfm[62] = -7192978393518994226L;
        im.pfm[63] = 5013415601123882445L;
        im.pfm[64] = -1558498559826696227L;
        im.pfm[65] = -3190729393288065369L;
        im.pfm[66] = 3974693968689577677L;
        im.pfm[67] = -7667826598558827190L;
        im.pfm[68] = -7771712115749087450L;
        im.pfm[69] = 2700615227422731435L;
        im.pfm[70] = 1823774241053181912L;
        im.pfm[71] = -2370201240238374624L;
        im.pfm[72] = -2493037339626140056L;
        im.pfm[73] = 8878286336983933904L;
        im.pfm[74] = 4784336526916305506L;
        im.pfm[75] = -5968889913843932142L;
        im.pfm[76] = -5099671521593200320L;
        im.pfm[77] = 1626666767225557149L;
        im.pfm[78] = 4389223356645782594L;
        im.pfm[79] = 7004370244660502224L;
        im.pfm[80] = -4451745332423555636L;
        im.pfm[81] = 4094273860851884446L;
        im.pfm[82] = -8078857066280471933L;
        im.pfm[83] = 6469889053139268121L;
        im.pfm[84] = 6934056863604349786L;
        im.pfm[85] = 1788180842192933651L;
        im.pfm[86] = 1848698519522360299L;
        im.pfm[87] = -7181380959749825530L;
        im.pfm[88] = 9019142631672290271L;
        im.pfm[89] = 920855751325926046L;
        im.pfm[90] = -2302154027333750122L;
        im.pfm[91] = -4425828349073810330L;
        im.pfm[92] = -7406677907545267704L;
        im.pfm[93] = -7194985882825584445L;
        im.pfm[94] = -7690833254887865249L;
        im.pfm[95] = -3164697870409181237L;
        im.pfm[96] = 4971449442310424491L;
        im.pfm[97] = 3446919850813141157L;
        im.pfm[98] = 1864814981158974369L;
        im.pfm[99] = -8828202174690330135L;
    }

    private static /* synthetic */ void qpr() {
        im.pfs[100] = 1015265776;
        im.pfs[101] = 829443686;
        im.pfs[102] = -1031507226;
        im.pfs[103] = -1134754720;
        im.pfs[104] = 84626022;
        im.pfs[105] = 347184201;
        im.pfs[106] = 405677382;
        im.pfs[107] = 1639269679;
        im.pfs[108] = 760534803;
        im.pfs[109] = -610353144;
        im.pfs[110] = -1279639890;
        im.pfs[111] = 1805847375;
        im.pfs[112] = -1496460526;
        im.pfs[113] = -1409151581;
        im.pfs[114] = -1596177004;
        im.pfs[115] = 1438092911;
        im.pfs[116] = -118448709;
        im.pfs[117] = 749134700;
        im.pfs[118] = -2028439331;
        im.pfs[119] = -454698595;
        im.pfs[120] = 790980397;
        im.pfs[121] = -808728072;
        im.pfs[122] = -1550000680;
        im.pfs[123] = 1858450935;
        im.pfs[124] = 111339318;
        im.pfs[125] = -477425968;
        im.pfs[126] = -1587922172;
        im.pfs[127] = -1546822542;
        im.pfs[128] = 1640352527;
        im.pfs[129] = -1214701991;
        im.pfs[130] = 2144887238;
        im.pfs[131] = -1469880960;
        im.pfs[132] = -252007854;
        im.pfs[133] = 1763537705;
        im.pfs[134] = -98497639;
        im.pfs[135] = 1615887186;
        im.pfs[136] = -335745262;
        im.pfs[137] = 844449821;
        im.pfs[138] = 612560226;
        im.pfs[139] = -165420181;
        im.pfs[140] = 572341773;
        im.pfs[141] = -1038307716;
        im.pfs[142] = 2097446084;
        im.pfs[143] = -1161102497;
        im.pfs[144] = -429564152;
        im.pfs[145] = -342980842;
        im.pfs[146] = 740228699;
        im.pfs[147] = -781185620;
        im.pfs[148] = -1213097835;
        im.pfs[149] = -27922804;
        im.pfs[150] = 1785013096;
        im.pfs[151] = -247681847;
        im.pfs[152] = -1836538901;
        im.pfs[153] = 1581019612;
        im.pfs[154] = -578979197;
        im.pfs[155] = 341482607;
        im.pfs[156] = 496220639;
        im.pfs[157] = -1945786083;
        im.pfs[158] = -515868444;
        im.pfs[159] = -851760804;
        im.pfs[160] = -1999292104;
        im.pfs[161] = 1343463236;
        im.pfs[162] = 1227772033;
        im.pfs[163] = 1296024429;
        im.pfs[164] = 1920157434;
        im.pfs[165] = 83728314;
        im.pfs[166] = 1509392767;
        im.pfs[167] = 1341817261;
        im.pfs[168] = 506168843;
        im.pfs[169] = -795912269;
        im.pfs[170] = 696215364;
        im.pfs[171] = 370882272;
        im.pfs[172] = -1341151844;
        im.pfs[173] = -1722502311;
        im.pfs[174] = -1126671549;
        im.pfs[175] = -1706652669;
        im.pfs[176] = -342837221;
        im.pfs[177] = -563664130;
        im.pfs[178] = -1223361927;
        im.pfs[179] = 2125093809;
        im.pfs[180] = -1766055161;
        im.pfs[181] = 710865242;
        im.pfs[182] = 219271227;
        im.pfs[183] = -382340433;
        im.pfs[184] = -1693461342;
        im.pfs[185] = -605835217;
        im.pfs[186] = 1021821064;
        im.pfs[187] = -479394042;
        im.pfs[188] = 1965500190;
        im.pfs[189] = -974593640;
        im.pfs[190] = 1193763427;
        im.pfs[191] = -888230944;
        im.pfs[192] = -752482851;
        im.pfs[193] = -822837650;
        im.pfs[194] = 1038573417;
        im.pfs[195] = 175716896;
        im.pfs[196] = 524766790;
        im.pfs[197] = -1360120295;
        im.pfs[198] = 1405725008;
        im.pfs[199] = 1394059360;
    }

    private static /* synthetic */ void qqd() {
        im.pfn[300] = -7950042179409306375L;
        im.pfn[301] = -27932805588614084L;
        im.pfn[302] = -9127427848391023691L;
        im.pfn[303] = -8771541500141510472L;
        im.pfn[304] = 6543182730035745561L;
        im.pfn[305] = 3721044666544024583L;
        im.pfn[306] = 4538225701358787308L;
        im.pfn[307] = -4412875548798933538L;
        im.pfn[308] = 725939759506709460L;
        im.pfn[309] = -7652674585722217411L;
        im.pfn[310] = -123423218029339697L;
        im.pfn[311] = 1979594256059213669L;
        im.pfn[312] = 8940669723786760583L;
        im.pfn[313] = -7987845839955973842L;
        im.pfn[314] = -4935516504629629747L;
        im.pfn[315] = -1534585472774393659L;
        im.pfn[316] = 4712187049113717206L;
        im.pfn[317] = 2691282758554543608L;
        im.pfn[318] = 3632561971447187529L;
        im.pfn[319] = 7208827636447351025L;
        im.pfn[320] = -2958832959471769563L;
        im.pfn[321] = -1097547904192619590L;
        im.pfn[322] = -3036617736488998910L;
        im.pfn[323] = -7970373024136266464L;
        im.pfn[324] = 3432515395341718231L;
        im.pfn[325] = 7350728581546005080L;
        im.pfn[326] = -9223272271705792472L;
        im.pfn[327] = -8791671798746564259L;
        im.pfn[328] = -6083390671707466608L;
        im.pfn[329] = -5479985640578863849L;
        im.pfn[330] = -8384354085169535288L;
        im.pfn[331] = 8802553389553387686L;
        im.pfn[332] = 1359133655782012696L;
        im.pfn[333] = 2206692141809494162L;
        im.pfn[334] = 4376883225754302026L;
        im.pfn[335] = -6963404551184673650L;
        im.pfn[336] = 3661305639204096128L;
        im.pfn[337] = 7730684944606720575L;
        im.pfn[338] = 8404919617557046303L;
        im.pfn[339] = 6508181149883440039L;
        im.pfn[340] = 7210077185754666052L;
        im.pfn[341] = 650108732851817868L;
        im.pfn[342] = -2558531988592048710L;
        im.pfn[343] = 7685146552877998924L;
        im.pfn[344] = 7145441800116242217L;
        im.pfn[345] = 6822596138160306385L;
        im.pfn[346] = 7614216887369170923L;
        im.pfn[347] = 7732912938643139744L;
        im.pfn[348] = 7974536507828435247L;
        im.pfn[349] = 8094649903631311698L;
        im.pfn[350] = -2179225178600331948L;
        im.pfn[351] = -2643395872318706128L;
        im.pfn[352] = 6030900045963161499L;
        im.pfn[353] = -8182761293423182303L;
        im.pfn[354] = -5964981146708293645L;
        im.pfn[355] = -2880133314133126609L;
        im.pfn[356] = 4689780054956745576L;
        im.pfn[357] = 476544768421218366L;
        im.pfn[358] = -6784936810788917272L;
        im.pfn[359] = -1130989000833497181L;
        im.pfn[360] = -2503775909275375786L;
        im.pfn[361] = 7671108450780536568L;
        im.pfn[362] = -5177754217594481799L;
        im.pfn[363] = 5427307823197825843L;
        im.pfn[364] = -4903089034803405512L;
        im.pfn[365] = -2467724304555484412L;
        im.pfn[366] = -7943120661360137953L;
        im.pfn[367] = -8896739703491833196L;
        im.pfn[368] = -7985125528021152341L;
        im.pfn[369] = -8853562123615493672L;
        im.pfn[370] = 9182790128278379448L;
        im.pfn[371] = -5982623960089689305L;
        im.pfn[372] = -2334030611267519002L;
        im.pfn[373] = -3560833913873506118L;
        im.pfn[374] = -2463684040821070182L;
        im.pfn[375] = -745059360617674636L;
        im.pfn[376] = 3946303212648267602L;
        im.pfn[377] = -3148372750757064173L;
        im.pfn[378] = 8584352999951935816L;
        im.pfn[379] = 3498930968910398333L;
        im.pfn[380] = -3283293045631043284L;
        im.pfn[381] = -5878994012500855231L;
        im.pfn[382] = 4252756266418792805L;
        im.pfn[383] = 4762199256439048563L;
        im.pfn[384] = -2556896837449675848L;
        im.pfn[385] = 4623088836524100084L;
        im.pfn[386] = -6535584148832920842L;
        im.pfn[387] = -1999114224047545666L;
        im.pfn[388] = -8470697526948633272L;
        im.pfn[389] = 7585744307984187308L;
        im.pfn[390] = 5209530074863532256L;
        im.pfn[391] = -5415487792188536456L;
        im.pfn[392] = 4407137086381269693L;
        im.pfn[393] = 5446983258051108539L;
        im.pfn[394] = -6617026387888851039L;
        im.pfn[395] = 8866593425052483416L;
        im.pfn[396] = 4952293292687772716L;
        im.pfn[397] = -2709870423358795928L;
        im.pfn[398] = 5045555323489560455L;
        im.pfn[399] = 7581111652709680779L;
    }

    private static /* synthetic */ void qpn() {
        im.pfr[200] = 1545682986;
        im.pfr[201] = 2116753767;
        im.pfr[202] = -114406628;
        im.pfr[203] = -522292782;
        im.pfr[204] = 1047976929;
        im.pfr[205] = -1262178290;
        im.pfr[206] = 1019500284;
        im.pfr[207] = 1247075961;
        im.pfr[208] = 557493445;
        im.pfr[209] = 362418267;
        im.pfr[210] = -1587598916;
        im.pfr[211] = 1427435970;
        im.pfr[212] = -1914845632;
        im.pfr[213] = -514159836;
        im.pfr[214] = 1739809648;
        im.pfr[215] = 2026836563;
        im.pfr[216] = 327770653;
        im.pfr[217] = -2043674971;
        im.pfr[218] = -257814701;
        im.pfr[219] = -2034362454;
        im.pfr[220] = -1019208180;
        im.pfr[221] = -1438412239;
        im.pfr[222] = -215569781;
        im.pfr[223] = 1311147217;
        im.pfr[224] = -1360222862;
        im.pfr[225] = -1832762613;
        im.pfr[226] = -1318668139;
        im.pfr[227] = 1974678154;
        im.pfr[228] = 1341919182;
        im.pfr[229] = 130636273;
        im.pfr[230] = -2046639055;
        im.pfr[231] = 2012026696;
        im.pfr[232] = -275549666;
        im.pfr[233] = 1548771188;
        im.pfr[234] = 699164855;
        im.pfr[235] = -961209151;
        im.pfr[236] = -2064359591;
        im.pfr[237] = -1627859259;
        im.pfr[238] = -622110656;
        im.pfr[239] = 1799833972;
        im.pfr[240] = 655083889;
        im.pfr[241] = -730069193;
        im.pfr[242] = 472511585;
        im.pfr[243] = 2122897121;
        im.pfr[244] = -327557417;
        im.pfr[245] = -1659257801;
        im.pfr[246] = -1516343829;
        im.pfr[247] = -1737547666;
        im.pfr[248] = -1690266611;
        im.pfr[249] = 1994924570;
        im.pfr[250] = 442023920;
        im.pfr[251] = -1330709656;
        im.pfr[252] = 396158714;
        im.pfr[253] = 1296320143;
        im.pfr[254] = -1705998822;
        im.pfr[255] = 1498186251;
        im.pfr[256] = 1417562268;
        im.pfr[257] = -1798673976;
        im.pfr[258] = -1549088820;
        im.pfr[259] = -114007959;
        im.pfr[260] = -1577901808;
        im.pfr[261] = -999276588;
        im.pfr[262] = -813800782;
        im.pfr[263] = -1475962135;
        im.pfr[264] = -892234751;
        im.pfr[265] = 2096284004;
        im.pfr[266] = 1848664924;
        im.pfr[267] = 641013487;
        im.pfr[268] = 1048417725;
        im.pfr[269] = 1467190503;
        im.pfr[270] = -1540953348;
        im.pfr[271] = 940256745;
        im.pfr[272] = 1610139025;
        im.pfr[273] = 1809239141;
        im.pfr[274] = 1352923160;
        im.pfr[275] = 536792641;
        im.pfr[276] = -769088040;
        im.pfr[277] = -847069121;
        im.pfr[278] = 589969267;
        im.pfr[279] = -1009440973;
        im.pfr[280] = -325198240;
        im.pfr[281] = -767527141;
        im.pfr[282] = -602897556;
        im.pfr[283] = -931333054;
        im.pfr[284] = -288461908;
        im.pfr[285] = 1865847637;
        im.pfr[286] = 1451464893;
        im.pfr[287] = -1480799739;
        im.pfr[288] = -795602447;
        im.pfr[289] = 1091470524;
        im.pfr[290] = -608935394;
        im.pfr[291] = 868439590;
        im.pfr[292] = -441917058;
        im.pfr[293] = -1329115432;
        im.pfr[294] = -422344333;
        im.pfr[295] = 283455049;
        im.pfr[296] = 1042947880;
        im.pfr[297] = 42240179;
        im.pfr[298] = -1908362633;
        im.pfr[299] = -253466988;
    }

    private static /* synthetic */ int pfq(int n2) {
        return pfr[n2] ^ pfs[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void forceUpdate(class_1297 var0, int var1_1) {
        v0 /* !! */  = im.aw;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - im.pfo("qnv", pfl(int ), (int)431));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1317787244: {
                    v1 = im.pfo("qnw", pfl(int ), (int)432);
                    continue block35;
                }
                case -106451190: {
                    v1 = im.pfo("qnx", pfl(int ), (int)433);
                    continue block35;
                }
                case 397166427: {
                    break block35;
                }
            }
            break;
        }
        var4_2 = im.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("qny", pfl(int ), (int)434)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == im.pfo("qnz", pfq(int ), (int)454)) break;
            v2 /* !! */  = (long)im.pfo("qoa", pfq(int ), (int)455);
        }
        var3_3 /* !! */  = im.b;
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl25
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - im.pfo("qob", pfl(int ), (int)435));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1486194500: {
                    v4 = im.pfo("qoc", pfl(int ), (int)436);
                    continue block37;
                }
                case 397166427: {
                    break block37;
                }
                case 1018314371: {
                    v4 = im.pfo("qod", pfl(int ), (int)437);
                    continue block37;
                }
                case 1734852108: {
                    v4 = im.pfo("qoe", pfl(int ), (int)438);
                    continue block37;
                }
            }
            break;
        }
        var2_4 = im.a;
        if (!var4_2) ** GOTO lbl44
        throw null;
lbl-1000:
        // 5 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl44:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("qof", pfl(int ), (int)439)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == im.pfo("qog", pfq(int ), (int)456)) break;
                    v5 /* !! */  = (long)im.pfo("qoh", pfq(int ), (int)457);
                }
                im.generateRandomPoints(var0, var1_1);
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v6 = im.pfo("qoi", pfq(int ), (int)458);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("qoj", pfl(int ), (int)440)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == im.pfo("qok", pfq(int ), (int)459)) break;
                    v7 /* !! */  = (long)im.pfo("qol", pfq(int ), (int)460);
                }
                im.currentPointIndex = (int)v6;
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v8 /* !! */  = im.aw;
                if (true) ** GOTO lbl64
                block41: while (true) {
                    v8 /* !! */  = (long)(v9 - im.pfo("qom", pfl(int ), (int)441));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1647609649: {
                            v9 = im.pfo("qon", pfl(int ), (int)442);
                            continue block41;
                        }
                        case 397166427: {
                            break block41;
                        }
                        case 822255573: {
                            v9 = im.pfo("qoo", pfl(int ), (int)443);
                            continue block41;
                        }
                        case 1127029302: {
                            v9 = im.pfo("qop", pfl(int ), (int)444);
                            continue block41;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("qoq", pfl(int ), (int)445)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == im.pfo("qor", pfq(int ), (int)461)) break;
                    v10 /* !! */  = (long)im.pfo("qos", pfq(int ), (int)462);
                }
                im.pointTimer.reset();
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v11 /* !! */  = im.aw;
                if (true) ** GOTO lbl87
                block43: while (true) {
                    v11 /* !! */  = (long)(im.pfo("qou", pfl(int ), (int)447) - im.pfo("qot", pfl(int ), (int)446));
lbl87:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1872375555: {
                            continue block43;
                        }
                        case 397166427: {
                            break block43;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("qov", pfl(int ), (int)448)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == im.pfo("qow", pfq(int ), (int)463)) break;
                    v12 /* !! */  = (long)im.pfo("qox", pfq(int ), (int)464);
                }
                im.updateTimer.reset();
                if (var2_4 || var2_4) continue block38;
                return;
lbl100:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)im.pfo("qoy", pfq(int ), (int)465);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
                case 1: {
                    var3_3 /* !! */  = (int)im.pfo("qoz", pfq(int ), (int)466);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl110:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)im.pfo("qpa", pfq(int ), (int)467);
                    if (!var4_2) break block38;
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)im.pfo("qpb", pfq(int ), (int)468);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
                case 4: {
                    var3_3 /* !! */  = (int)im.pfo("qpc", pfq(int ), (int)469);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl137
                }
lbl124:
                // 2 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)im.pfo("qpd", pfq(int ), (int)470);
                        if (!var4_2) break block38;
                        throw null;
                    }
                }
lbl129:
                // 3 sources

                case 6: {
                    var3_3 /* !! */  = (int)im.pfo("qpe", pfq(int ), (int)471);
                    if (!var4_2) break block38;
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)im.pfo("qpf", pfq(int ), (int)472);
                    if (!var4_2) ** GOTO lbl129
                    throw null;
                }
lbl137:
                // 2 sources

                case 8: {
                    var3_3 /* !! */  = (int)im.pfo("qpg", pfq(int ), (int)473);
                    if (!var4_2) ** GOTO lbl110
                    throw null;
                }
                case 9: {
                    var3_3 /* !! */  = (int)im.pfo("qph", pfq(int ), (int)474);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl145:
                // 4 sources

                case 10: {
                    var3_3 /* !! */  = (int)im.pfo("qpi", pfq(int ), (int)475);
                    if (!var4_2) ** GOTO lbl100
                    throw null;
                }
                case 11: 
            }
        }
        var3_3 /* !! */  = (int)im.pfo("qpj", pfq(int ), (int)476);
        ** while (!var4_2)
lbl152:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpt() {
        im.pfs[300] = -113714606;
        im.pfs[301] = 185579310;
        im.pfs[302] = -1954110176;
        im.pfs[303] = -2043231356;
        im.pfs[304] = 693089921;
        im.pfs[305] = -1270044351;
        im.pfs[306] = -243027069;
        im.pfs[307] = -2132518160;
        im.pfs[308] = -689541437;
        im.pfs[309] = 2075503904;
        im.pfs[310] = -1381911194;
        im.pfs[311] = 1726928227;
        im.pfs[312] = -512990086;
        im.pfs[313] = -400726009;
        im.pfs[314] = -217105313;
        im.pfs[315] = 319543727;
        im.pfs[316] = -1498101808;
        im.pfs[317] = -628372201;
        im.pfs[318] = -856493641;
        im.pfs[319] = 532291562;
        im.pfs[320] = -1631886709;
        im.pfs[321] = 998628990;
        im.pfs[322] = 483626373;
        im.pfs[323] = -1584705198;
        im.pfs[324] = -834528809;
        im.pfs[325] = -1934641475;
        im.pfs[326] = 215432176;
        im.pfs[327] = -220405740;
        im.pfs[328] = -788396519;
        im.pfs[329] = -1961591791;
        im.pfs[330] = 968916202;
        im.pfs[331] = 748508228;
        im.pfs[332] = 504406887;
        im.pfs[333] = 2058631636;
        im.pfs[334] = 1876134857;
        im.pfs[335] = -2089263652;
        im.pfs[336] = 1602426170;
        im.pfs[337] = -1479840733;
        im.pfs[338] = -252564459;
        im.pfs[339] = -953974012;
        im.pfs[340] = 693465442;
        im.pfs[341] = -980082240;
        im.pfs[342] = 770109347;
        im.pfs[343] = -623841645;
        im.pfs[344] = 1099384377;
        im.pfs[345] = 317904954;
        im.pfs[346] = 1523993058;
        im.pfs[347] = 706880213;
        im.pfs[348] = 905600352;
        im.pfs[349] = -1493879476;
        im.pfs[350] = -1835513120;
        im.pfs[351] = -16702857;
        im.pfs[352] = -1112457127;
        im.pfs[353] = -1267689016;
        im.pfs[354] = 1839349201;
        im.pfs[355] = -2033894864;
        im.pfs[356] = 878079691;
        im.pfs[357] = 1555800872;
        im.pfs[358] = -1722893735;
        im.pfs[359] = 785857775;
        im.pfs[360] = 629620751;
        im.pfs[361] = -209996466;
        im.pfs[362] = 614206385;
        im.pfs[363] = -1041724151;
        im.pfs[364] = -134669323;
        im.pfs[365] = 1509695120;
        im.pfs[366] = 524302820;
        im.pfs[367] = 461796996;
        im.pfs[368] = 722479965;
        im.pfs[369] = 1008146057;
        im.pfs[370] = 1112541254;
        im.pfs[371] = 1533735766;
        im.pfs[372] = -947689374;
        im.pfs[373] = -328728837;
        im.pfs[374] = 645846427;
        im.pfs[375] = 791094614;
        im.pfs[376] = 137308889;
        im.pfs[377] = -1796921429;
        im.pfs[378] = 1231028414;
        im.pfs[379] = -1094914719;
        im.pfs[380] = 2039049215;
        im.pfs[381] = 1425397242;
        im.pfs[382] = 263105132;
        im.pfs[383] = -1485629256;
        im.pfs[384] = 442595059;
        im.pfs[385] = 177887373;
        im.pfs[386] = -1070372329;
        im.pfs[387] = -1148594356;
        im.pfs[388] = 480730031;
        im.pfs[389] = 697250096;
        im.pfs[390] = 193985529;
        im.pfs[391] = -1530277317;
        im.pfs[392] = -465363659;
        im.pfs[393] = 1079933175;
        im.pfs[394] = -361492728;
        im.pfs[395] = 887153318;
        im.pfs[396] = -918980831;
        im.pfs[397] = -748751565;
        im.pfs[398] = 38397372;
        im.pfs[399] = -379665333;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_243 generateRandomOffset(class_1297 var0) {
        v0 /* !! */  = im.aw;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(im.pfo("phd", pfl(int ), (int)18) - im.pfo("phc", pfl(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1401778153: {
                    continue block50;
                }
                case 397166427: {
                    break block50;
                }
            }
            break;
        }
        var15_1 = im.c;
        v1 /* !! */  = im.aw;
        if (true) ** GOTO lbl15
        block51: while (true) {
            v1 /* !! */  = (long)(v2 - im.pfo("phe", pfl(int ), (int)19));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1889840062: {
                    v2 = im.pfo("phf", pfl(int ), (int)20);
                    continue block51;
                }
                case 397166427: {
                    break block51;
                }
                case 1237211297: {
                    v2 = im.pfo("phg", pfl(int ), (int)21);
                    continue block51;
                }
            }
            break;
        }
        var14_2 /* !! */  = im.b;
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl29
        block52: while (true) {
            v3 /* !! */  = (long)(v4 - im.pfo("phh", pfl(int ), (int)22));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 397166427: {
                    break block52;
                }
                case 465542561: {
                    v4 = im.pfo("phi", pfl(int ), (int)23);
                    continue block52;
                }
                case 955980274: {
                    v4 = im.pfo("phj", pfl(int ), (int)24);
                    continue block52;
                }
                case 1472398224: {
                    v4 = im.pfo("phk", pfl(int ), (int)25);
                    continue block52;
                }
            }
            break;
        }
        var13_3 = im.a;
        if (var15_1) {
            throw null;
lbl44:
            // 8 sources

            return null;
        }
        if (var13_3 || var13_3) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("phl", pfl(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == im.pfo("phm", pfq(int ), (int)19)) break;
            v5 /* !! */  = (long)im.pfo("phn", pfq(int ), (int)20);
        }
        var1_4 = var0.method_17681();
        if (var13_3 || var13_3) ** GOTO lbl44
        v6 /* !! */  = im.aw;
        if (true) ** GOTO lbl59
        block55: while (true) {
            v6 /* !! */  = (long)(v7 - im.pfo("pho", pfl(int ), (int)27));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -781363524: {
                    v7 = im.pfo("php", pfl(int ), (int)28);
                    continue block55;
                }
                case 397166427: {
                    break block55;
                }
                case 522083316: {
                    v7 = im.pfo("phq", pfl(int ), (int)29);
                    continue block55;
                }
            }
            break;
        }
        var3_5 = var0.method_17682();
        if (var13_3 || var13_3) ** GOTO lbl44
        var5_6 = im.pfo("phs", phr(int ), (int)30);
        if (var13_3 || var13_3) ** GOTO lbl44
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("pht", pfl(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == im.pfo("phu", pfq(int ), (int)21)) break;
            v8 /* !! */  = (long)im.pfo("phv", pfq(int ), (int)22);
        }
        v9 = -var1_4 / im.pfo("phw", phr(int ), (int)32) + var5_6;
        v10 = var1_4 / im.pfo("phx", phr(int ), (int)33) - var5_6;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("phy", pfl(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == im.pfo("phz", pfq(int ), (int)23)) break;
            v11 /* !! */  = (long)im.pfo("pia", pfq(int ), (int)24);
        }
        var7_7 = im.shouldRandom.nextDouble(v9, v10);
        if (var13_3 || var13_3) ** GOTO lbl44
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pib", pfl(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == im.pfo("pic", pfq(int ), (int)25)) break;
            v12 /* !! */  = (long)im.pfo("pid", pfq(int ), (int)26);
        }
        v13 /* !! */  = im.aw;
        if (true) ** GOTO lbl98
        block59: while (true) {
            v13 /* !! */  = (long)(im.pfo("pif", pfl(int ), (int)37) - im.pfo("pie", pfl(int ), (int)36));
lbl98:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 397166427: {
                    break block59;
                }
                case 1002768759: {
                    continue block59;
                }
            }
            break;
        }
        var9_8 = im.shouldRandom.nextDouble((double)var5_6, var3_5 - var5_6);
        if (var13_3 || var13_3) ** GOTO lbl44
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("pig", pfl(int ), (int)38)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v14 /* !! */  == im.pfo("pih", pfq(int ), (int)27)) break;
            v14 /* !! */  = (long)im.pfo("pii", pfq(int ), (int)28);
        }
        v15 = -var1_4 / im.pfo("pij", phr(int ), (int)39) + var5_6;
        v16 = var1_4 / im.pfo("pik", phr(int ), (int)40) - var5_6;
        v17 /* !! */  = im.aw;
        if (true) ** GOTO lbl117
        block61: while (true) {
            v17 /* !! */  = (long)(im.pfo("pim", pfl(int ), (int)42) - im.pfo("pil", pfl(int ), (int)41));
lbl117:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case 397166427: {
                    break block61;
                }
                case 1375161255: {
                    continue block61;
                }
            }
            break;
        }
        var11_9 = im.shouldRandom.nextDouble(v15, v16);
        if (var13_3) ** GOTO lbl44
        if (var14_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var13_3) ** break;
                ** continue;
                v18 /* !! */  = im.aw;
                if (true) ** GOTO lbl133
                block62: while (true) {
                    v18 /* !! */  = (long)(im.pfo("pio", pfl(int ), (int)44) - im.pfo("pin", pfl(int ), (int)43));
lbl133:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1844173198: {
                            continue block62;
                        }
                        case 397166427: {
                            break block62;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("pip", pfl(int ), (int)45)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v19 /* !! */  == im.pfo("piq", pfq(int ), (int)29)) break;
                    v19 /* !! */  = (long)im.pfo("pir", pfq(int ), (int)30);
                }
                return new class_243(var7_7, var9_8, var11_9);
            }
lbl145:
            // 2 sources

            case 0: {
                do {
                    var14_2 /* !! */  = (int)im.pfo("pis", pfq(int ), (int)31);
                } while (!var15_1);
                throw null;
            }
lbl150:
            // 2 sources

            case 1: {
                var14_2 /* !! */  = (int)im.pfo("pit", pfq(int ), (int)32);
                if (!var15_1) break;
                throw null;
            }
            case 2: {
                var14_2 /* !! */  = (int)im.pfo("piu", pfq(int ), (int)33);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl159:
            // 2 sources

            case 3: {
                var14_2 /* !! */  = (int)im.pfo("piv", pfq(int ), (int)34);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl164:
            // 2 sources

            case 4: {
                var14_2 /* !! */  = (int)im.pfo("piw", pfq(int ), (int)35);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 5: {
                var14_2 /* !! */  = (int)im.pfo("pix", pfq(int ), (int)36);
                if (!var15_1) ** GOTO lbl150
                throw null;
            }
            case 6: {
                var14_2 /* !! */  = (int)im.pfo("piy", pfq(int ), (int)37);
                if (var15_1) {
                    throw null;
                }
            }
            case 7: {
                var14_2 /* !! */  = (int)im.pfo("piz", pfq(int ), (int)38);
                if (var15_1) {
                    throw null;
                }
            }
lbl181:
            // 4 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var14_2 /* !! */  = (int)im.pfo("pja", pfq(int ), (int)39);
                    if (!var15_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 9: {
                var14_2 /* !! */  = (int)im.pfo("pjb", pfq(int ), (int)40);
                if (!var15_1) ** GOTO lbl159
                throw null;
            }
lbl190:
            // 3 sources

            case 10: {
                var14_2 /* !! */  = (int)im.pfo("pjc", pfq(int ), (int)41);
                if (!var15_1) ** GOTO lbl145
                throw null;
            }
            case 11: {
                var14_2 /* !! */  = (int)im.pfo("pjd", pfq(int ), (int)42);
                if (!var15_1) ** GOTO lbl164
                throw null;
            }
            case 12: {
                var14_2 /* !! */  = (int)im.pfo("pje", pfq(int ), (int)43);
                if (var15_1) {
                    throw null;
                }
            }
lbl202:
            // 4 sources

            case 13: {
                do {
                    var14_2 /* !! */  = (int)im.pfo("pjf", pfq(int ), (int)44);
                } while (!var15_1);
                throw null;
            }
            case 14: {
                var14_2 /* !! */  = (int)im.pfo("pjg", pfq(int ), (int)45);
                if (!var15_1) ** GOTO lbl181
                throw null;
            }
            case 15: 
        }
        var14_2 /* !! */  = (int)im.pfo("pjh", pfq(int ), (int)46);
        ** while (!var15_1)
lbl214:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpo() {
        im.pfr[300] = -113714606;
        im.pfr[301] = 185579301;
        im.pfr[302] = -1954110176;
        im.pfr[303] = -2043231354;
        im.pfr[304] = 693089930;
        im.pfr[305] = -1270044344;
        im.pfr[306] = -243027068;
        im.pfr[307] = -2132518175;
        im.pfr[308] = -689541434;
        im.pfr[309] = 2075503920;
        im.pfr[310] = -1381911189;
        im.pfr[311] = 1726928237;
        im.pfr[312] = -512990086;
        im.pfr[313] = -400726010;
        im.pfr[314] = -217105332;
        im.pfr[315] = 319543718;
        im.pfr[316] = -1498101802;
        im.pfr[317] = -628372213;
        im.pfr[318] = -856493637;
        im.pfr[319] = 532291567;
        im.pfr[320] = -1631886694;
        im.pfr[321] = 998628958;
        im.pfr[322] = 483626378;
        im.pfr[323] = -1584705190;
        im.pfr[324] = -834528832;
        im.pfr[325] = -1934641490;
        im.pfr[326] = 215432145;
        im.pfr[327] = -220405756;
        im.pfr[328] = -788396540;
        im.pfr[329] = -1961591779;
        im.pfr[330] = 968916218;
        im.pfr[331] = 748508228;
        im.pfr[332] = 504406897;
        im.pfr[333] = 2058631633;
        im.pfr[334] = 1876134874;
        im.pfr[335] = -2089263664;
        im.pfr[336] = 1602426159;
        im.pfr[337] = -1479840734;
        im.pfr[338] = -252564458;
        im.pfr[339] = -953974006;
        im.pfr[340] = 693465460;
        im.pfr[341] = -980082236;
        im.pfr[342] = 770109362;
        im.pfr[343] = -623841663;
        im.pfr[344] = 1099384374;
        im.pfr[345] = 317904957;
        im.pfr[346] = 1523993086;
        im.pfr[347] = 706880199;
        im.pfr[348] = -905600353;
        im.pfr[349] = -1383438291;
        im.pfr[350] = 1835513119;
        im.pfr[351] = 1586150568;
        im.pfr[352] = 1112457126;
        im.pfr[353] = -1092460792;
        im.pfr[354] = -1839349202;
        im.pfr[355] = 1745070141;
        im.pfr[356] = 878079691;
        im.pfr[357] = -1555800873;
        im.pfr[358] = 1497880824;
        im.pfr[359] = -785857776;
        im.pfr[360] = -1157365528;
        im.pfr[361] = 209996465;
        im.pfr[362] = -1475767827;
        im.pfr[363] = -1041724152;
        im.pfr[364] = -328334724;
        im.pfr[365] = -1509695121;
        im.pfr[366] = -1335128303;
        im.pfr[367] = 461796998;
        im.pfr[368] = 722479952;
        im.pfr[369] = 1008146073;
        im.pfr[370] = 1112541266;
        im.pfr[371] = 1533735759;
        im.pfr[372] = -947689370;
        im.pfr[373] = -328728855;
        im.pfr[374] = 645846411;
        im.pfr[375] = 791094610;
        im.pfr[376] = 137308876;
        im.pfr[377] = -1796921440;
        im.pfr[378] = 1231028409;
        im.pfr[379] = -1094914695;
        im.pfr[380] = 2039049193;
        im.pfr[381] = 1425397246;
        im.pfr[382] = 263105125;
        im.pfr[383] = -1485629256;
        im.pfr[384] = 442595058;
        im.pfr[385] = 177887375;
        im.pfr[386] = -1070372324;
        im.pfr[387] = -1148594353;
        im.pfr[388] = 480730020;
        im.pfr[389] = 697250096;
        im.pfr[390] = 193985504;
        im.pfr[391] = -1530277324;
        im.pfr[392] = -465363650;
        im.pfr[393] = 1079933172;
        im.pfr[394] = 361492727;
        im.pfr[395] = -146821283;
        im.pfr[396] = -918980832;
        im.pfr[397] = -567137730;
        im.pfr[398] = 38397373;
        im.pfr[399] = 1201196480;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 hitbox(class_1297 var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pke", pfl(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == im.pfo("pkf", pfq(int ), (int)61)) break;
            v0 /* !! */  = (long)im.pfo("pkg", pfq(int ), (int)62);
        }
        var15_5 = im.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("pkh", pfl(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == im.pfo("pki", pfq(int ), (int)63)) break;
            v1 /* !! */  = (long)im.pfo("pkj", pfq(int ), (int)64);
        }
        var14_6 /* !! */  = im.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("pkk", pfl(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == im.pfo("pkl", pfq(int ), (int)65)) break;
            v2 /* !! */  = (long)im.pfo("pkm", pfq(int ), (int)66);
        }
        var13_7 = im.a;
        if (var15_5) {
            throw null;
lbl21:
            // 5 sources

            return null;
        }
        if (var13_7 || var13_7) ** GOTO lbl21
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl28
        block84: while (true) {
            v3 /* !! */  = (long)(im.pfo("pko", pfl(int ), (int)58) - im.pfo("pkn", pfl(int ), (int)57));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 397166427: {
                    break block84;
                }
                case 2063518111: {
                    continue block84;
                }
            }
            break;
        }
        var5_8 = var0.method_17681() / var4_4;
        if (var13_7 || var13_7) ** GOTO lbl21
        v4 /* !! */  = im.aw;
        if (true) ** GOTO lbl39
        block85: while (true) {
            v4 /* !! */  = (long)(im.pfo("pkq", pfl(int ), (int)60) - im.pfo("pkp", pfl(int ), (int)59));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 397166427: {
                    break block85;
                }
                case 1359944742: {
                    continue block85;
                }
            }
            break;
        }
        v5 = var0.method_23320();
        v6 /* !! */  = im.aw;
        if (true) ** GOTO lbl49
        block86: while (true) {
            v6 /* !! */  = (long)(im.pfo("pks", pfl(int ), (int)62) - im.pfo("pkr", pfl(int ), (int)61));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 397166427: {
                    break block86;
                }
                case 506627887: {
                    continue block86;
                }
            }
            break;
        }
        v7 = v5 - var0.method_23318();
        v8 /* !! */  = im.aw;
        if (true) ** GOTO lbl59
        block87: while (true) {
            v8 /* !! */  = (long)(v9 - im.pfo("pkt", pfl(int ), (int)63));
lbl59:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1618280005: {
                    v9 = im.pfo("pku", pfl(int ), (int)64);
                    continue block87;
                }
                case -1083984113: {
                    v9 = im.pfo("pkv", pfl(int ), (int)65);
                    continue block87;
                }
                case 397166427: {
                    break block87;
                }
                case 1608583489: {
                    v9 = im.pfo("pkw", pfl(int ), (int)66);
                    continue block87;
                }
            }
            break;
        }
        v10 = var0.method_17682();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pkx", pfl(int ), (int)67)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == im.pfo("pky", pfq(int ), (int)67)) break;
            v11 /* !! */  = (long)im.pfo("pkz", pfq(int ), (int)68);
        }
        var7_9 = class_3532.method_15350((double)v7, (double)0.0, (double)v10);
        if (var13_7 || var13_7) ** GOTO lbl21
        v12 /* !! */  = im.aw;
        if (true) ** GOTO lbl83
        block89: while (true) {
            v12 /* !! */  = (long)(im.pfo("plb", pfl(int ), (int)69) - im.pfo("pla", pfl(int ), (int)68));
lbl83:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1608271193: {
                    continue block89;
                }
                case 397166427: {
                    break block89;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("plc", pfl(int ), (int)70)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == im.pfo("pld", pfq(int ), (int)69)) break;
            v13 /* !! */  = (long)im.pfo("ple", pfq(int ), (int)70);
        }
        v14 = im.mc.field_1724;
        v15 /* !! */  = im.aw;
        if (true) ** GOTO lbl98
        block91: while (true) {
            v15 /* !! */  = (long)(im.pfo("plg", pfl(int ), (int)72) - im.pfo("plf", pfl(int ), (int)71));
lbl98:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -305352738: {
                    continue block91;
                }
                case 397166427: {
                    break block91;
                }
            }
            break;
        }
        v16 = v14.method_23317();
        v17 /* !! */  = im.aw;
        if (true) ** GOTO lbl108
        block92: while (true) {
            v17 /* !! */  = (long)(v18 - im.pfo("plh", pfl(int ), (int)73));
lbl108:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -625398744: {
                    v18 = im.pfo("pli", pfl(int ), (int)74);
                    continue block92;
                }
                case 310129046: {
                    v18 = im.pfo("plj", pfl(int ), (int)75);
                    continue block92;
                }
                case 397166427: {
                    break block92;
                }
                case 1210875302: {
                    v18 = im.pfo("plk", pfl(int ), (int)76);
                    continue block92;
                }
            }
            break;
        }
        v19 = v16 - var0.method_23317();
        v20 = -var5_8;
        v21 /* !! */  = im.aw;
        if (true) ** GOTO lbl126
        block93: while (true) {
            v21 /* !! */  = (long)(im.pfo("plm", pfl(int ), (int)78) - im.pfo("pll", pfl(int ), (int)77));
lbl126:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case 397166427: {
                    break block93;
                }
                case 1508119091: {
                    continue block93;
                }
            }
            break;
        }
        var9_10 = class_3532.method_15350((double)v19, (double)v20, (double)var5_8);
        if (var13_7 || var13_7) ** GOTO lbl21
        if (var14_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("pln", pfl(int ), (int)79)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == im.pfo("plo", pfq(int ), (int)71)) break;
                    v22 /* !! */  = (long)im.pfo("plp", pfq(int ), (int)72);
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("plq", pfl(int ), (int)80)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == im.pfo("plr", pfq(int ), (int)73)) break;
                    v23 /* !! */  = (long)im.pfo("pls", pfq(int ), (int)74);
                }
                v24 = im.mc.field_1724;
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("plt", pfl(int ), (int)81)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == im.pfo("plu", pfq(int ), (int)75)) break;
                    v25 /* !! */  = (long)im.pfo("plv", pfq(int ), (int)76);
                }
                v26 = v24.method_23321();
                v27 /* !! */  = im.aw;
                if (true) ** GOTO lbl157
                block97: while (true) {
                    v27 /* !! */  = (long)(im.pfo("plx", pfl(int ), (int)83) - im.pfo("plw", pfl(int ), (int)82));
lbl157:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1010584977: {
                            continue block97;
                        }
                        case 397166427: {
                            break block97;
                        }
                    }
                    break;
                }
                v28 = v26 - var0.method_23321();
                v29 = -var5_8;
                v30 /* !! */  = im.aw;
                if (true) ** GOTO lbl168
                block98: while (true) {
                    v30 /* !! */  = (long)(im.pfo("plz", pfl(int ), (int)85) - im.pfo("ply", pfl(int ), (int)84));
lbl168:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -141119778: {
                            continue block98;
                        }
                        case 397166427: {
                            break block98;
                        }
                    }
                    break;
                }
                var11_11 = class_3532.method_15350((double)v28, (double)v29, (double)var5_8);
                if (var13_7 || var13_7) ** continue;
                v31 /* !! */  = im.aw;
                if (true) ** GOTO lbl179
                block99: while (true) {
                    v31 /* !! */  = (long)(v32 - im.pfo("pma", pfl(int ), (int)86));
lbl179:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case 151449733: {
                            v32 = im.pfo("pmb", pfl(int ), (int)87);
                            continue block99;
                        }
                        case 350891803: {
                            v32 = im.pfo("pmc", pfl(int ), (int)88);
                            continue block99;
                        }
                        case 397166427: {
                            break block99;
                        }
                        case 1098360122: {
                            v32 = im.pfo("pmd", pfl(int ), (int)89);
                            continue block99;
                        }
                    }
                    break;
                }
                v33 /* !! */  = im.aw;
                if (true) ** GOTO lbl195
                block100: while (true) {
                    v33 /* !! */  = (long)(v34 - im.pfo("pme", pfl(int ), (int)90));
lbl195:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -546670649: {
                            v34 = im.pfo("pmf", pfl(int ), (int)91);
                            continue block100;
                        }
                        case 397166427: {
                            break block100;
                        }
                        case 1471766047: {
                            v34 = im.pfo("pmg", pfl(int ), (int)92);
                            continue block100;
                        }
                    }
                    break;
                }
                v35 = var0.method_23317() + var9_10 / (double)var1_1;
                v36 /* !! */  = im.aw;
                if (true) ** GOTO lbl209
                block101: while (true) {
                    v36 /* !! */  = (long)(v37 - im.pfo("pmh", pfl(int ), (int)93));
lbl209:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -784816185: {
                            v37 = im.pfo("pmi", pfl(int ), (int)94);
                            continue block101;
                        }
                        case 242372722: {
                            v37 = im.pfo("pmj", pfl(int ), (int)95);
                            continue block101;
                        }
                        case 397166427: {
                            break block101;
                        }
                        case 0x76BBB7B6: {
                            v37 = im.pfo("pmk", pfl(int ), (int)96);
                            continue block101;
                        }
                    }
                    break;
                }
                v38 = var0.method_23318() + var7_9 / (double)var2_2;
                v39 /* !! */  = im.aw;
                if (true) ** GOTO lbl226
                block102: while (true) {
                    v39 /* !! */  = (long)(v40 - im.pfo("pml", pfl(int ), (int)97));
lbl226:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -825053366: {
                            v40 = im.pfo("pmm", pfl(int ), (int)98);
                            continue block102;
                        }
                        case 397166427: {
                            break block102;
                        }
                        case 1246222109: {
                            v40 = im.pfo("pmn", pfl(int ), (int)99);
                            continue block102;
                        }
                    }
                    break;
                }
                v41 = var0.method_23321() + var11_11 / (double)var3_3;
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_8 = im.aw - im.pfo("pmo", pfl(int ), (int)100)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == im.pfo("pmp", pfq(int ), (int)77)) break;
                    v42 /* !! */  = (long)im.pfo("pmq", pfq(int ), (int)78);
                }
                return new class_243(v35, v38, v41);
            }
lbl242:
            // 2 sources

            case 0: {
                var14_6 /* !! */  = (int)im.pfo("pmr", pfq(int ), (int)79);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 1: {
                var14_6 /* !! */  = (int)im.pfo("pms", pfq(int ), (int)80);
                if (!var15_5) break;
                throw null;
            }
lbl251:
            // 2 sources

            case 2: {
                var14_6 /* !! */  = (int)im.pfo("pmt", pfq(int ), (int)81);
                if (var15_5) {
                    throw null;
                }
            }
lbl255:
            // 4 sources

            case 3: {
                var14_6 /* !! */  = (int)im.pfo("pmu", pfq(int ), (int)82);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 4: {
                var14_6 /* !! */  = (int)im.pfo("pmv", pfq(int ), (int)83);
                if (!var15_5) ** GOTO lbl255
                throw null;
            }
lbl264:
            // 3 sources

            case 5: {
                var14_6 /* !! */  = (int)im.pfo("pmw", pfq(int ), (int)84);
                if (!var15_5) ** GOTO lbl251
                throw null;
            }
lbl268:
            // 3 sources

            case 6: {
                var14_6 /* !! */  = (int)im.pfo("pmx", pfq(int ), (int)85);
                if (!var15_5) ** GOTO lbl242
                throw null;
            }
lbl272:
            // 2 sources

            case 7: {
                var14_6 /* !! */  = (int)im.pfo("pmy", pfq(int ), (int)86);
                if (!var15_5) ** GOTO lbl264
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_6 /* !! */  = (int)im.pfo("pmz", pfq(int ), (int)87);
                    if (!var15_5) ** GOTO lbl264
                    throw null;
                }
            }
            case 9: {
                var14_6 /* !! */  = (int)im.pfo("pna", pfq(int ), (int)88);
                if (!var15_5) ** GOTO lbl272
                throw null;
            }
            case 10: {
                do {
                    var14_6 /* !! */  = (int)im.pfo("pnb", pfq(int ), (int)89);
                } while (!var15_5);
                throw null;
            }
            case 11: 
        }
        var14_6 /* !! */  = (int)im.pfo("pnc", pfq(int ), (int)90);
        ** while (!var15_5)
lbl293:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpy() {
        im.pfm[300] = -847250678012216458L;
        im.pfm[301] = -6358229760233538607L;
        im.pfm[302] = -5310157515035447840L;
        im.pfm[303] = -2855082281454774454L;
        im.pfm[304] = 6316417894333068228L;
        im.pfm[305] = -7239547929004469794L;
        im.pfm[306] = -1636501231410794666L;
        im.pfm[307] = 3395151083517184623L;
        im.pfm[308] = 6979620398029455802L;
        im.pfm[309] = -4436226558052150127L;
        im.pfm[310] = -3980320430166104336L;
        im.pfm[311] = 6078748692739919L;
        im.pfm[312] = 6564389044405878783L;
        im.pfm[313] = 7768408226509937974L;
        im.pfm[314] = 7018154371600052285L;
        im.pfm[315] = 7749273326655310086L;
        im.pfm[316] = -644170772710330016L;
        im.pfm[317] = -256903852083128819L;
        im.pfm[318] = 1902242400966362656L;
        im.pfm[319] = 6612268397708118379L;
        im.pfm[320] = -1650142102938570305L;
        im.pfm[321] = 3465043941420323617L;
        im.pfm[322] = 3773359016844240649L;
        im.pfm[323] = 5286520506696937289L;
        im.pfm[324] = 2110854433198560046L;
        im.pfm[325] = 6583556467902044113L;
        im.pfm[326] = 3113540955117326459L;
        im.pfm[327] = 5463585467013488525L;
        im.pfm[328] = -1644390997345069678L;
        im.pfm[329] = -2918857354226096512L;
        im.pfm[330] = 7638539075147302724L;
        im.pfm[331] = 6922986504486876859L;
        im.pfm[332] = 3209495624907647103L;
        im.pfm[333] = 6778197607311435922L;
        im.pfm[334] = -3211030514510243638L;
        im.pfm[335] = 3920444618181627924L;
        im.pfm[336] = -3892580028977240182L;
        im.pfm[337] = 3632361557765188547L;
        im.pfm[338] = 5252950929459072619L;
        im.pfm[339] = -3062687516715588959L;
        im.pfm[340] = 8166997585644405013L;
        im.pfm[341] = 6746345163184112437L;
        im.pfm[342] = -1006334201487168789L;
        im.pfm[343] = 3190360230126478195L;
        im.pfm[344] = 6922729875457917729L;
        im.pfm[345] = -72092472904274472L;
        im.pfm[346] = -1817754845279381370L;
        im.pfm[347] = -7575170905302186411L;
        im.pfm[348] = 3906286890050016613L;
        im.pfm[349] = 5743770898143912786L;
        im.pfm[350] = -1070825675285258695L;
        im.pfm[351] = -6172596598493026208L;
        im.pfm[352] = -214083633898076628L;
        im.pfm[353] = 3231395526005270693L;
        im.pfm[354] = 5899334359629496399L;
        im.pfm[355] = -3101325205771900056L;
        im.pfm[356] = 6781624517097419913L;
        im.pfm[357] = -7464796707173877242L;
        im.pfm[358] = -597780445836159842L;
        im.pfm[359] = 935693286043406779L;
        im.pfm[360] = -7930219300099729377L;
        im.pfm[361] = -6738149240907971401L;
        im.pfm[362] = -7273759142022457204L;
        im.pfm[363] = 8408690776517094195L;
        im.pfm[364] = 1403723799152578657L;
        im.pfm[365] = 960956278161125155L;
        im.pfm[366] = 4447477413739435313L;
        im.pfm[367] = 7703795251197712323L;
        im.pfm[368] = 35629670408395980L;
        im.pfm[369] = 9036701350818037521L;
        im.pfm[370] = -7471930572896741654L;
        im.pfm[371] = -383356690193146504L;
        im.pfm[372] = -3489336488054653948L;
        im.pfm[373] = -4333597638232991386L;
        im.pfm[374] = 3521600465008816851L;
        im.pfm[375] = 7493757085696839151L;
        im.pfm[376] = 8868992960832621203L;
        im.pfm[377] = -7280932431158430089L;
        im.pfm[378] = -112085177056633044L;
        im.pfm[379] = 4692851801922739790L;
        im.pfm[380] = -2881468105479901465L;
        im.pfm[381] = -4313276975923023599L;
        im.pfm[382] = 7639569039545633438L;
        im.pfm[383] = 3730724967450221652L;
        im.pfm[384] = 2689637736179209982L;
        im.pfm[385] = -8745514714192532426L;
        im.pfm[386] = 3807695884894576355L;
        im.pfm[387] = 7149941214661776741L;
        im.pfm[388] = -7669282494191516475L;
        im.pfm[389] = -1192306527065880380L;
        im.pfm[390] = -1846491876721116653L;
        im.pfm[391] = -3651421719247656907L;
        im.pfm[392] = 7412956236682307648L;
        im.pfm[393] = -3647946616937351352L;
        im.pfm[394] = 2865431365466885998L;
        im.pfm[395] = -4044428016860393152L;
        im.pfm[396] = -1410771290788027818L;
        im.pfm[397] = -4503848785716446883L;
        im.pfm[398] = 8893134992812606066L;
        im.pfm[399] = 2101218831847281916L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 predict(class_1297 var0, float var1_1) {
        v0 /* !! */  = im.aw;
        if (true) ** GOTO lbl5
        block105: while (true) {
            v0 /* !! */  = (long)(v1 - im.pfo("pqk", pfl(int ), (int)132));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 393679767: {
                    v1 = im.pfo("pql", pfl(int ), (int)133);
                    continue block105;
                }
                case 397166427: {
                    break block105;
                }
                case 1526806205: {
                    v1 = im.pfo("pqm", pfl(int ), (int)134);
                    continue block105;
                }
            }
            break;
        }
        var9_2 = im.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pqn", pfl(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == im.pfo("pqo", pfq(int ), (int)144)) break;
            v2 /* !! */  = (long)im.pfo("pqp", pfq(int ), (int)145);
        }
        var8_3 /* !! */  = im.b;
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl25
        block107: while (true) {
            v3 /* !! */  = (long)(v4 - im.pfo("pqq", pfl(int ), (int)136));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 397166427: {
                    break block107;
                }
                case 2006263214: {
                    v4 = im.pfo("pqr", pfl(int ), (int)137);
                    continue block107;
                }
                case 2131406126: {
                    v4 = im.pfo("pqs", pfl(int ), (int)138);
                    continue block107;
                }
            }
            break;
        }
        var7_4 = im.a;
        if (var9_2) {
            throw null;
lbl37:
            // 9 sources

            return null;
        }
        if (var7_4) ** GOTO lbl37
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4) ** GOTO lbl37
                if (var0 != null) ** GOTO lbl56
                if (var7_4) ** GOTO lbl37
                v5 /* !! */  = im.aw;
                if (true) ** GOTO lbl50
                block109: while (true) {
                    v5 /* !! */  = (long)(im.pfo("pqu", pfl(int ), (int)140) - im.pfo("pqt", pfl(int ), (int)139));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 397166427: {
                            break block109;
                        }
                        case 734017178: {
                            continue block109;
                        }
                    }
                    break;
                }
                return class_243.field_1353;
lbl56:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl37
                v6 /* !! */  = im.aw;
                if (true) ** GOTO lbl61
                block110: while (true) {
                    v6 /* !! */  = (long)(v7 - im.pfo("pqv", pfl(int ), (int)141));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1263272289: {
                            v7 = im.pfo("pqw", pfl(int ), (int)142);
                            continue block110;
                        }
                        case 397166427: {
                            break block110;
                        }
                        case 1858808236: {
                            v7 = im.pfo("pqx", pfl(int ), (int)143);
                            continue block110;
                        }
                    }
                    break;
                }
                var2_5 = var0.method_18798();
                if (var7_4 || var7_4) ** GOTO lbl37
                v8 /* !! */  = im.aw;
                if (true) ** GOTO lbl76
                block111: while (true) {
                    v8 /* !! */  = (long)(v9 - im.pfo("pqy", pfl(int ), (int)144));
lbl76:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 397166427: {
                            break block111;
                        }
                        case 802311802: {
                            v9 = im.pfo("pqz", pfl(int ), (int)145);
                            continue block111;
                        }
                        case 1336101717: {
                            v9 = im.pfo("pra", pfl(int ), (int)146);
                            continue block111;
                        }
                        case 1806495852: {
                            v9 = im.pfo("prb", pfl(int ), (int)147);
                            continue block111;
                        }
                    }
                    break;
                }
                var3_6 = var0.method_73189();
                if (var7_4 || var7_4) ** GOTO lbl37
                v10 /* !! */  = im.aw;
                if (true) ** GOTO lbl94
                block112: while (true) {
                    v10 /* !! */  = (long)(im.pfo("prd", pfl(int ), (int)149) - im.pfo("prc", pfl(int ), (int)148));
lbl94:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1748478741: {
                            continue block112;
                        }
                        case 397166427: {
                            break block112;
                        }
                    }
                    break;
                }
                v11 = var2_5.field_1352 * (double)var1_1;
                v12 /* !! */  = im.aw;
                if (true) ** GOTO lbl104
                block113: while (true) {
                    v12 /* !! */  = (long)(v13 - im.pfo("pre", pfl(int ), (int)150));
lbl104:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1083659634: {
                            v13 = im.pfo("prf", pfl(int ), (int)151);
                            continue block113;
                        }
                        case 397166427: {
                            break block113;
                        }
                        case 1157265992: {
                            v13 = im.pfo("prg", pfl(int ), (int)152);
                            continue block113;
                        }
                        case 2076380088: {
                            v13 = im.pfo("prh", pfl(int ), (int)153);
                            continue block113;
                        }
                    }
                    break;
                }
                v14 = var2_5.field_1351 * (double)var1_1 * im.pfo("pri", phr(int ), (int)154);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("prj", pfl(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == im.pfo("prk", pfq(int ), (int)146)) break;
                    v15 /* !! */  = (long)im.pfo("prl", pfq(int ), (int)147);
                }
                v16 = var2_5.field_1350 * (double)var1_1;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("prm", pfl(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == im.pfo("prnn", pfq(int ), (int)148)) break;
                    v17 /* !! */  = (long)im.pfo("pro", pfq(int ), (int)149);
                }
                var4_7 = var3_6.method_1031(v11, v14, v16);
                if (var7_4 || var7_4) ** GOTO lbl37
                var5_8 = im.pfo("prp", phr(int ), (int)157);
                if (var7_4 || var7_4) ** GOTO lbl37
                v18 /* !! */  = im.aw;
                if (true) ** GOTO lbl136
                block116: while (true) {
                    v18 /* !! */  = (long)(v19 - im.pfo("prq", pfl(int ), (int)158));
lbl136:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2045568842: {
                            v19 = im.pfo("prr", pfl(int ), (int)159);
                            continue block116;
                        }
                        case -1724514472: {
                            v19 = im.pfo("prs", pfl(int ), (int)160);
                            continue block116;
                        }
                        case 397166427: {
                            break block116;
                        }
                        case 1729323508: {
                            v19 = im.pfo("prt", pfl(int ), (int)161);
                            continue block116;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pru", pfl(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == im.pfo("prv", pfq(int ), (int)150)) break;
                    v20 /* !! */  = (long)im.pfo("prw", pfq(int ), (int)151);
                }
                v21 = var4_7.field_1352;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("prx", pfl(int ), (int)163)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == im.pfo("pry", pfq(int ), (int)152)) break;
                    v22 /* !! */  = (long)im.pfo("prz", pfq(int ), (int)153);
                }
                v23 = var0.method_5829();
                v24 /* !! */  = im.aw;
                if (true) ** GOTO lbl164
                block119: while (true) {
                    v24 /* !! */  = (long)(v25 - im.pfo("psa", pfl(int ), (int)164));
lbl164:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1282557612: {
                            v25 = im.pfo("psb", pfl(int ), (int)165);
                            continue block119;
                        }
                        case 397166427: {
                            break block119;
                        }
                        case 1491851079: {
                            v25 = im.pfo("psc", pfl(int ), (int)166);
                            continue block119;
                        }
                    }
                    break;
                }
                v26 = v23.field_1323 + var5_8;
                v27 /* !! */  = im.aw;
                if (true) ** GOTO lbl178
                block120: while (true) {
                    v27 /* !! */  = (long)(im.pfo("pse", pfl(int ), (int)168) - im.pfo("psd", pfl(int ), (int)167));
lbl178:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -446561843: {
                            continue block120;
                        }
                        case 397166427: {
                            break block120;
                        }
                    }
                    break;
                }
                v28 = var0.method_5829();
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("psf", pfl(int ), (int)169)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == im.pfo("psg", pfq(int ), (int)154)) break;
                    v29 /* !! */  = (long)im.pfo("psh", pfq(int ), (int)155);
                }
                v30 = v28.field_1320 - var5_8;
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("psi", pfl(int ), (int)170)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == im.pfo("psj", pfq(int ), (int)156)) break;
                    v31 /* !! */  = (long)im.pfo("psk", pfq(int ), (int)157);
                }
                v32 = class_3532.method_15350((double)v21, (double)v26, (double)v30);
                v33 /* !! */  = im.aw;
                if (true) ** GOTO lbl200
                block123: while (true) {
                    v33 /* !! */  = (long)(v34 - im.pfo("psl", pfl(int ), (int)171));
lbl200:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1828019021: {
                            v34 = im.pfo("psm", pfl(int ), (int)172);
                            continue block123;
                        }
                        case -1697236431: {
                            v34 = im.pfo("psn", pfl(int ), (int)173);
                            continue block123;
                        }
                        case 82101935: {
                            v34 = im.pfo("pso", pfl(int ), (int)174);
                            continue block123;
                        }
                        case 397166427: {
                            break block123;
                        }
                    }
                    break;
                }
                v35 = var4_7.field_1351;
                v36 /* !! */  = im.aw;
                if (true) ** GOTO lbl217
                block124: while (true) {
                    v36 /* !! */  = (long)(v37 - im.pfo("psp", pfl(int ), (int)175));
lbl217:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1537078208: {
                            v37 = im.pfo("psq", pfl(int ), (int)176);
                            continue block124;
                        }
                        case 397166427: {
                            break block124;
                        }
                        case 962410151: {
                            v37 = im.pfo("psr", pfl(int ), (int)177);
                            continue block124;
                        }
                    }
                    break;
                }
                v38 = var0.method_5829();
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("pss", pfl(int ), (int)178)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == im.pfo("pst", pfq(int ), (int)158)) break;
                    v39 /* !! */  = (long)im.pfo("psu", pfq(int ), (int)159);
                }
                v40 = v38.field_1322 + var5_8;
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_8 = im.aw - im.pfo("psv", pfl(int ), (int)179)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == im.pfo("psw", pfq(int ), (int)160)) break;
                    v41 /* !! */  = (long)im.pfo("psx", pfq(int ), (int)161);
                }
                v42 = var0.method_5829();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_9 = im.aw - im.pfo("psy", pfl(int ), (int)180)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == im.pfo("psz", pfq(int ), (int)162)) break;
                    v43 /* !! */  = (long)im.pfo("pta", pfq(int ), (int)163);
                }
                v44 = v42.field_1325 - var5_8;
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_10 = im.aw - im.pfo("ptb", pfl(int ), (int)181)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == im.pfo("ptc", pfq(int ), (int)164)) break;
                    v45 /* !! */  = (long)im.pfo("ptd", pfq(int ), (int)165);
                }
                v46 = class_3532.method_15350((double)v35, (double)v40, (double)v44);
                v47 /* !! */  = im.aw;
                if (true) ** GOTO lbl255
                block129: while (true) {
                    v47 /* !! */  = (long)(im.pfo("ptf", pfl(int ), (int)183) - im.pfo("pte", pfl(int ), (int)182));
lbl255:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -691150729: {
                            continue block129;
                        }
                        case 397166427: {
                            break block129;
                        }
                    }
                    break;
                }
                v48 = var4_7.field_1350;
                v49 /* !! */  = im.aw;
                if (true) ** GOTO lbl265
                block130: while (true) {
                    v49 /* !! */  = (long)(v50 - im.pfo("ptg", pfl(int ), (int)184));
lbl265:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -2138285720: {
                            v50 = im.pfo("pth", pfl(int ), (int)185);
                            continue block130;
                        }
                        case -1111909976: {
                            v50 = im.pfo("pti", pfl(int ), (int)186);
                            continue block130;
                        }
                        case 397166427: {
                            break block130;
                        }
                    }
                    break;
                }
                v51 = var0.method_5829();
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_11 = im.aw - im.pfo("ptj", pfl(int ), (int)187)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == im.pfo("ptk", pfq(int ), (int)166)) break;
                    v52 /* !! */  = (long)im.pfo("ptl", pfq(int ), (int)167);
                }
                v53 = v51.field_1321 + var5_8;
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_12 = im.aw - im.pfo("ptm", pfl(int ), (int)188)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == im.pfo("ptn", pfq(int ), (int)168)) break;
                    v54 /* !! */  = (long)im.pfo("pto", pfq(int ), (int)169);
                }
                v55 = var0.method_5829();
                v56 /* !! */  = im.aw;
                if (true) ** GOTO lbl291
                block133: while (true) {
                    v56 /* !! */  = (long)(im.pfo("ptq", pfl(int ), (int)190) - im.pfo("ptp", pfl(int ), (int)189));
lbl291:
                    // 2 sources

                    switch ((int)v56 /* !! */ ) {
                        case 397166427: {
                            break block133;
                        }
                        case 1007919713: {
                            continue block133;
                        }
                    }
                    break;
                }
                v57 = v55.field_1324 - var5_8;
                v58 /* !! */  = im.aw;
                if (true) ** GOTO lbl301
                block134: while (true) {
                    v58 /* !! */  = (long)(v59 - im.pfo("ptr", pfl(int ), (int)191));
lbl301:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1119776104: {
                            v59 = im.pfo("pts", pfl(int ), (int)192);
                            continue block134;
                        }
                        case -240576920: {
                            v59 = im.pfo("ptt", pfl(int ), (int)193);
                            continue block134;
                        }
                        case 372181403: {
                            v59 = im.pfo("ptu", pfl(int ), (int)194);
                            continue block134;
                        }
                        case 397166427: {
                            break block134;
                        }
                    }
                    break;
                }
                v60 = class_3532.method_15350((double)v48, (double)v53, (double)v57);
                v61 /* !! */  = im.aw;
                if (true) ** GOTO lbl318
                block135: while (true) {
                    v61 /* !! */  = (long)(v62 - im.pfo("ptv", pfl(int ), (int)195));
lbl318:
                    // 2 sources

                    switch ((int)v61 /* !! */ ) {
                        case 84084788: {
                            v62 = im.pfo("ptw", pfl(int ), (int)196);
                            continue block135;
                        }
                        case 397166427: {
                            break block135;
                        }
                        case 548212801: {
                            v62 = im.pfo("ptx", pfl(int ), (int)197);
                            continue block135;
                        }
                    }
                    break;
                }
                var4_7 = new class_243(v32, v46, v60);
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return var4_7;
            }
lbl331:
            // 3 sources

            case 0: {
                var8_3 /* !! */  = (int)im.pfo("pty", pfq(int ), (int)170);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
            case 1: {
                var8_3 /* !! */  = (int)im.pfo("ptz", pfq(int ), (int)171);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 2: {
                var8_3 /* !! */  = (int)im.pfo("pua", pfq(int ), (int)172);
                if (var9_2) {
                    throw null;
                }
            }
lbl345:
            // 6 sources

            case 3: {
                var8_3 /* !! */  = (int)im.pfo("pub", pfq(int ), (int)173);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl350:
            // 3 sources

            case 4: {
                var8_3 /* !! */  = (int)im.pfo("puc", pfq(int ), (int)174);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl355:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)im.pfo("pud", pfq(int ), (int)175);
                if (!var9_2) ** GOTO lbl331
                throw null;
            }
lbl359:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)im.pfo("pue", pfq(int ), (int)176);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 7: {
                do {
                    var8_3 /* !! */  = (int)im.pfo("puf", pfq(int ), (int)177);
                } while (!var9_2);
                throw null;
            }
lbl369:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)im.pfo("pug", pfq(int ), (int)178);
                if (!var9_2) ** GOTO lbl331
                throw null;
            }
            case 9: {
                var8_3 /* !! */  = (int)im.pfo("puh", pfq(int ), (int)179);
                if (!var9_2) ** GOTO lbl355
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)im.pfo("pui", pfq(int ), (int)180);
                if (!var9_2) ** GOTO lbl345
                throw null;
            }
lbl381:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)im.pfo("puj", pfq(int ), (int)181);
                if (!var9_2) ** GOTO lbl350
                throw null;
            }
lbl385:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)im.pfo("puk", pfq(int ), (int)182);
                if (!var9_2) ** GOTO lbl345
                throw null;
            }
lbl389:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)im.pfo("pul", pfq(int ), (int)183);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
            case 14: {
                var8_3 /* !! */  = (int)im.pfo("pum", pfq(int ), (int)184);
                if (!var9_2) ** GOTO lbl385
                throw null;
            }
            case 15: {
                var8_3 /* !! */  = (int)im.pfo("pun", pfq(int ), (int)185);
                if (!var9_2) ** GOTO lbl350
                throw null;
            }
lbl402:
            // 3 sources

            case 16: {
                var8_3 /* !! */  = (int)im.pfo("puo", pfq(int ), (int)186);
                if (!var9_2) ** GOTO lbl359
                throw null;
            }
            case 17: 
        }
        do {
            var8_3 /* !! */  = (int)im.pfo("pup", pfq(int ), (int)187);
        } while (!var9_2);
        throw null;
    }

    private static /* synthetic */ long pfl(int n2) {
        return pfm[n2] ^ pfn[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<class_243> getAllCachedPoints() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("qji", pfl(int ), (int)374)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == im.pfo("qjj", pfq(int ), (int)394)) break;
            v0 /* !! */  = (long)im.pfo("qjk", pfq(int ), (int)395);
        }
        var6 = im.c;
        v1 /* !! */  = im.aw;
        if (true) ** GOTO lbl11
        block76: while (true) {
            v1 /* !! */  = (long)(v2 - im.pfo("qjl", pfl(int ), (int)375));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1667277638: {
                    v2 = im.pfo("qjm", pfl(int ), (int)376);
                    continue block76;
                }
                case -589231720: {
                    v2 = im.pfo("qjn", pfl(int ), (int)377);
                    continue block76;
                }
                case 397166427: {
                    break block76;
                }
            }
            break;
        }
        var5_1 /* !! */  = im.b;
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl25
        block77: while (true) {
            v3 /* !! */  = (long)(v4 - im.pfo("qjo", pfl(int ), (int)378));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 280159914: {
                    v4 = im.pfo("qjp", pfl(int ), (int)379);
                    continue block77;
                }
                case 397166427: {
                    break block77;
                }
                case 1593504221: {
                    v4 = im.pfo("qjq", pfl(int ), (int)380);
                    continue block77;
                }
            }
            break;
        }
        var4_2 = im.a;
        if (var6) {
            throw null;
lbl37:
            // 11 sources

            return null;
        }
        if (var4_2 || var4_2) ** GOTO lbl37
        v5 /* !! */  = im.aw;
        if (true) ** GOTO lbl44
        block79: while (true) {
            v5 /* !! */  = (long)(v6 - im.pfo("qjr", pfl(int ), (int)381));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1397805574: {
                    v6 = im.pfo("qjs", pfl(int ), (int)382);
                    continue block79;
                }
                case -787763632: {
                    v6 = im.pfo("qjt", pfl(int ), (int)383);
                    continue block79;
                }
                case 397166427: {
                    break block79;
                }
                case 1336227986: {
                    v6 = im.pfo("qju", pfl(int ), (int)384);
                    continue block79;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("qjv", pfl(int ), (int)385)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == im.pfo("qjw", pfq(int ), (int)396)) break;
            v7 /* !! */  = (long)im.pfo("qjx", pfq(int ), (int)397);
        }
        if (im.mc.field_1692 == null) ** GOTO lbl183
        if (var4_2 || var4_2) ** GOTO lbl37
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("qjy", pfl(int ), (int)386)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == im.pfo("qjz", pfq(int ), (int)398)) break;
            v8 /* !! */  = (long)im.pfo("qka", pfq(int ), (int)399);
        }
        v9 /* !! */  = im.aw;
        if (true) ** GOTO lbl72
        block82: while (true) {
            v9 /* !! */  = (long)(v10 - im.pfo("qkb", pfl(int ), (int)387));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1854410937: {
                    v10 = im.pfo("qkc", pfl(int ), (int)388);
                    continue block82;
                }
                case -1621205565: {
                    v10 = im.pfo("qkd", pfl(int ), (int)389);
                    continue block82;
                }
                case 397166427: {
                    break block82;
                }
                case 1556134429: {
                    v10 = im.pfo("qke", pfl(int ), (int)390);
                    continue block82;
                }
            }
            break;
        }
        v11 = im.mc.field_1692;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("qkf", pfl(int ), (int)391)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == im.pfo("qkg", pfq(int ), (int)400)) break;
            v12 /* !! */  = (long)im.pfo("qkh", pfq(int ), (int)401);
        }
        var0_3 = v11.method_73189();
        if (var5_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2 || var4_2) ** GOTO lbl37
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("qki", pfl(int ), (int)392)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == im.pfo("qkj", pfq(int ), (int)402)) break;
                    v13 /* !! */  = (long)im.pfo("qkk", pfq(int ), (int)403);
                }
                v14 /* !! */  = im.aw;
                if (true) ** GOTO lbl104
                block85: while (true) {
                    v14 /* !! */  = (long)(v15 - im.pfo("qkl", pfl(int ), (int)393));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 257590883: {
                            v15 = im.pfo("qkm", pfl(int ), (int)394);
                            continue block85;
                        }
                        case 397166427: {
                            break block85;
                        }
                        case 760539266: {
                            v15 = im.pfo("qkn", pfl(int ), (int)395);
                            continue block85;
                        }
                    }
                    break;
                }
                var1_4 = new ArrayList<class_243>();
                if (var4_2 || var4_2) ** GOTO lbl37
                v16 /* !! */  = im.aw;
                if (true) ** GOTO lbl119
                block86: while (true) {
                    v16 /* !! */  = (long)(im.pfo("qkp", pfl(int ), (int)397) - im.pfo("qko", pfl(int ), (int)396));
lbl119:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 397166427: {
                            break block86;
                        }
                        case 1241261411: {
                            continue block86;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("qkq", pfl(int ), (int)398)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == im.pfo("qkr", pfq(int ), (int)404)) break;
                    v17 /* !! */  = (long)im.pfo("qks", pfq(int ), (int)405);
                }
                var2_5 = im.cachedOffsets.iterator();
                if (var4_2) ** GOTO lbl37
                do {
                    if (var4_2 || var4_2) ** GOTO lbl37
                    v18 /* !! */  = im.aw;
                    if (true) ** GOTO lbl137
                    block89: while (true) {
                        v18 /* !! */  = (long)(v19 - im.pfo("qkt", pfl(int ), (int)399));
lbl137:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -781242592: {
                                v19 = im.pfo("qku", pfl(int ), (int)400);
                                continue block89;
                            }
                            case 397166427: {
                                break block89;
                            }
                            case 1696156164: {
                                v19 = im.pfo("qkv", pfl(int ), (int)401);
                                continue block89;
                            }
                        }
                        break;
                    }
                    if (!var2_5.hasNext()) ** GOTO lbl181
                    if (var4_2) ** GOTO lbl37
                    v20 /* !! */  = im.aw;
                    if (true) ** GOTO lbl152
                    block90: while (true) {
                        v20 /* !! */  = (long)(v21 - im.pfo("qkw", pfl(int ), (int)402));
lbl152:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case -1981810009: {
                                v21 = im.pfo("qkx", pfl(int ), (int)403);
                                continue block90;
                            }
                            case -104754627: {
                                v21 = im.pfo("qky", pfl(int ), (int)404);
                                continue block90;
                            }
                            case 70742133: {
                                v21 = im.pfo("qkz", pfl(int ), (int)405);
                                continue block90;
                            }
                            case 397166427: {
                                break block90;
                            }
                        }
                        break;
                    }
                    var3_6 = var2_5.next();
                    if (var4_2 || var4_2) ** GOTO lbl37
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("qla", pfl(int ), (int)406)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == im.pfo("qlb", pfq(int ), (int)406)) break;
                        v22 /* !! */  = (long)im.pfo("qlc", pfq(int ), (int)407);
                    }
                    v23 = var0_3.method_1019(var3_6);
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("qld", pfl(int ), (int)407)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == im.pfo("qle", pfq(int ), (int)408)) break;
                        v24 /* !! */  = (long)im.pfo("qlf", pfq(int ), (int)409);
                    }
                    var1_4.add(v23);
                    if (var4_2 || var4_2) ** GOTO lbl37
                } while (!var6);
                throw null;
lbl181:
                // 1 sources

                if (var4_2 || var4_2) ** GOTO lbl37
                return var1_4;
            }
lbl183:
            // 1 sources

            if (!var4_2 && !var4_2) ** break;
            ** continue;
            v25 /* !! */  = im.aw;
            if (true) ** GOTO lbl189
            block93: while (true) {
                v25 /* !! */  = (long)(im.pfo("qlh", pfl(int ), (int)409) - im.pfo("qlg", pfl(int ), (int)408));
lbl189:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case 397166427: {
                        break block93;
                    }
                    case 685747449: {
                        continue block93;
                    }
                }
                break;
            }
            v26 /* !! */  = im.aw;
            if (true) ** GOTO lbl198
            block94: while (true) {
                v26 /* !! */  = (long)(im.pfo("qlj", pfl(int ), (int)411) - im.pfo("qli", pfl(int ), (int)410));
lbl198:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1528736628: {
                        continue block94;
                    }
                    case 397166427: {
                        break block94;
                    }
                }
                break;
            }
            return new ArrayList<class_243>();
lbl204:
            // 5 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_1 /* !! */  = (int)im.pfo("qlk", pfq(int ), (int)410);
                    if (var6) {
                        throw null;
                    }
                    ** GOTO lbl227
                    break;
                }
            }
lbl210:
            // 2 sources

            case 1: {
                var5_1 /* !! */  = (int)im.pfo("qll", pfq(int ), (int)411);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 2: {
                var5_1 /* !! */  = (int)im.pfo("qlm", pfq(int ), (int)412);
                if (!var6) ** GOTO lbl210
                throw null;
            }
            case 3: {
                var5_1 /* !! */  = (int)im.pfo("qln", pfq(int ), (int)413);
                if (!var6) ** GOTO lbl204
                throw null;
            }
            case 4: {
                var5_1 /* !! */  = (int)im.pfo("qlo", pfq(int ), (int)414);
                if (!var6) ** GOTO lbl204
                throw null;
            }
lbl227:
            // 3 sources

            case 5: {
                var5_1 /* !! */  = (int)im.pfo("qlp", pfq(int ), (int)415);
                if (!var6) ** GOTO lbl204
                throw null;
            }
            case 6: {
                var5_1 /* !! */  = (int)im.pfo("qlq", pfq(int ), (int)416);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 7: {
                var5_1 /* !! */  = (int)im.pfo("qlr", pfq(int ), (int)417);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 8: {
                var5_1 /* !! */  = (int)im.pfo("qls", pfq(int ), (int)418);
                if (var6) {
                    throw null;
                }
            }
lbl245:
            // 4 sources

            case 9: {
                var5_1 /* !! */  = (int)im.pfo("qlt", pfq(int ), (int)419);
                if (var6) {
                    throw null;
                }
            }
lbl249:
            // 5 sources

            case 10: {
                var5_1 /* !! */  = (int)im.pfo("qlu", pfq(int ), (int)420);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl254:
            // 2 sources

            case 11: {
                var5_1 /* !! */  = (int)im.pfo("qlv", pfq(int ), (int)421);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl259:
            // 3 sources

            case 12: {
                var5_1 /* !! */  = (int)im.pfo("qlw", pfq(int ), (int)422);
                if (!var6) ** GOTO lbl254
                throw null;
            }
            case 13: {
                var5_1 /* !! */  = (int)im.pfo("qlx", pfq(int ), (int)423);
                if (!var6) ** GOTO lbl259
                throw null;
            }
lbl267:
            // 2 sources

            case 14: {
                var5_1 /* !! */  = (int)im.pfo("qly", pfq(int ), (int)424);
                if (!var6) ** GOTO lbl227
                throw null;
            }
            case 15: {
                var5_1 /* !! */  = (int)im.pfo("qlz", pfq(int ), (int)425);
                if (!var6) ** GOTO lbl204
                throw null;
            }
            case 16: {
                var5_1 /* !! */  = (int)im.pfo("qma", pfq(int ), (int)426);
                if (!var6) ** GOTO lbl249
                throw null;
            }
lbl279:
            // 2 sources

            case 17: {
                var5_1 /* !! */  = (int)im.pfo("qmb", pfq(int ), (int)427);
                if (!var6) ** GOTO lbl249
                throw null;
            }
lbl283:
            // 3 sources

            case 18: {
                var5_1 /* !! */  = (int)im.pfo("qmc", pfq(int ), (int)428);
                if (!var6) break;
                throw null;
            }
            case 19: {
                var5_1 /* !! */  = (int)im.pfo("qmd", pfq(int ), (int)429);
                if (!var6) ** GOTO lbl283
                throw null;
            }
            case 20: {
                var5_1 /* !! */  = (int)im.pfo("qme", pfq(int ), (int)430);
                if (!var6) ** GOTO lbl283
                throw null;
            }
lbl295:
            // 3 sources

            case 21: {
                var5_1 /* !! */  = (int)im.pfo("qmf", pfq(int ), (int)431);
                if (!var6) ** GOTO lbl245
                throw null;
            }
            case 22: 
        }
        var5_1 /* !! */  = (int)im.pfo("qmg", pfq(int ), (int)432);
        ** while (!var6)
lbl302:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 spiralPredict(class_1297 var0, float var1_1, float var2_2, float var3_3) {
        block83: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pnd", pfl(int ), (int)101)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == im.pfo("pne", pfq(int ), (int)91)) break;
                v0 /* !! */  = (long)im.pfo("pnf", pfq(int ), (int)92);
            }
            var18_4 = im.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("png", pfl(int ), (int)102)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == im.pfo("pnh", pfq(int ), (int)93)) break;
                v1 /* !! */  = (long)im.pfo("pni", pfq(int ), (int)94);
            }
            var17_5 /* !! */  = im.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("pnj", pfl(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == im.pfo("pnk", pfq(int ), (int)95)) break;
                v2 /* !! */  = (long)im.pfo("pnl", pfq(int ), (int)96);
            }
            var16_6 = im.a;
            if (var18_4) {
                throw null;
lbl21:
                // 10 sources

                return null;
            }
            if (var16_6 || var16_6) ** GOTO lbl21
            if (var0 != null) break block83;
            if (var16_6) ** GOTO lbl21
            v3 /* !! */  = im.aw;
            if (true) ** GOTO lbl30
            block47: while (true) {
                v3 /* !! */  = (long)(im.pfo("pnn", pfl(int ), (int)105) - im.pfo("pnm", pfl(int ), (int)104));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 397166427: {
                        break block47;
                    }
                    case 647342986: {
                        continue block47;
                    }
                }
                break;
            }
            return class_243.field_1353;
        }
        if (var16_6 || var16_6) ** GOTO lbl21
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pno", pfl(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == im.pfo("pnp", pfq(int ), (int)97)) break;
            v4 /* !! */  = (long)im.pfo("pnq", pfq(int ), (int)98);
        }
        var4_7 = var0.method_18798();
        if (var16_6 || var16_6) ** GOTO lbl21
        v5 /* !! */  = im.aw;
        if (true) ** GOTO lbl49
        block49: while (true) {
            v5 /* !! */  = (long)(v6 - im.pfo("pnr", pfl(int ), (int)107));
lbl49:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1869121535: {
                    v6 = im.pfo("pns", pfl(int ), (int)108);
                    continue block49;
                }
                case 0xA11AA91: {
                    v6 = im.pfo("pnt", pfl(int ), (int)109);
                    continue block49;
                }
                case 397166427: {
                    break block49;
                }
                case 2069543897: {
                    v6 = im.pfo("pnu", pfl(int ), (int)110);
                    continue block49;
                }
            }
            break;
        }
        v7 = var0.method_73189();
        v8 = im.pfo("pnv", phr(int ), (int)111);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("pnw", pfl(int ), (int)112)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == im.pfo("pnx", pfq(int ), (int)99)) break;
            v9 /* !! */  = (long)im.pfo("pny", pfq(int ), (int)100);
        }
        v10 = var4_7.method_1021((double)v8);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("pnz", pfl(int ), (int)113)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == im.pfo("poa", pfq(int ), (int)101)) break;
            v11 /* !! */  = (long)im.pfo("pob", pfq(int ), (int)102);
        }
        var5_8 = v7.method_1019(v10);
        if (var17_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_6 || var16_6) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("poc", pfl(int ), (int)114)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == im.pfo("pod", pfq(int ), (int)103)) break;
                    v12 /* !! */  = (long)im.pfo("poe", pfq(int ), (int)104);
                }
                var6_9 = (long)((float)System.currentTimeMillis() % (var3_3 * im.pfo("pog", pof(int ), (int)105)));
                if (var16_6 || var16_6) ** GOTO lbl21
                var8_10 = (double)((float)var6_9 * var2_2) * im.pfo("poh", phr(int ), (int)115) / im.pfo("poi", phr(int ), (int)116);
                if (var16_6 || var16_6) ** GOTO lbl21
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("poj", pfl(int ), (int)117)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == im.pfo("pok", pfq(int ), (int)106)) break;
                    v13 /* !! */  = (long)im.pfo("pol", pfq(int ), (int)107);
                }
                var10_11 = Math.cos(var8_10) * (double)var1_1;
                if (var16_6 || var16_6) ** GOTO lbl21
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = im.aw - im.pfo("pom", pfl(int ), (int)118)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == im.pfo("pon", pfq(int ), (int)108)) break;
                    v14 /* !! */  = (long)im.pfo("poo", pfq(int ), (int)109);
                }
                var12_12 = Math.sin(var8_10) * (double)var1_1;
                if (var16_6 || var16_6) ** GOTO lbl21
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_9 = im.aw - im.pfo("pop", pfl(int ), (int)119)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == im.pfo("poq", pfq(int ), (int)110)) break;
                    v15 /* !! */  = (long)im.pfo("por", pfq(int ), (int)111);
                }
                v16 = im.pfo("pos", phr(int ), (int)120);
                v17 = im.pfo("pot", phr(int ), (int)121);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_10 = im.aw - im.pfo("pou", pfl(int ), (int)122)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == im.pfo("pov", pfq(int ), (int)112)) break;
                    v18 /* !! */  = (long)im.pfo("pow", pfq(int ), (int)113);
                }
                v19 = im.random.nextDouble((double)v16, (double)v17);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_11 = im.aw - im.pfo("pox", pfl(int ), (int)123)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == im.pfo("poy", pfq(int ), (int)114)) break;
                    v20 /* !! */  = (long)im.pfo("poz", pfq(int ), (int)115);
                }
                var14_13 = v19 * (double)var0.method_17682();
                if (!var16_6 && !var16_6) ** break;
                ** continue;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_12 = im.aw - im.pfo("ppa", pfl(int ), (int)124)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == im.pfo("ppb", pfq(int ), (int)116)) break;
                    v21 /* !! */  = (long)im.pfo("ppc", pfq(int ), (int)117);
                }
                v22 /* !! */  = im.aw;
                if (true) ** GOTO lbl132
                block59: while (true) {
                    v22 /* !! */  = (long)(v23 - im.pfo("ppd", pfl(int ), (int)125));
lbl132:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1029977011: {
                            v23 = im.pfo("ppe", pfl(int ), (int)126);
                            continue block59;
                        }
                        case 397166427: {
                            break block59;
                        }
                        case 454626114: {
                            v23 = im.pfo("ppf", pfl(int ), (int)127);
                            continue block59;
                        }
                    }
                    break;
                }
                v24 = var5_8.field_1352 + var10_11;
                v25 /* !! */  = im.aw;
                if (true) ** GOTO lbl146
                block60: while (true) {
                    v25 /* !! */  = (long)(im.pfo("pph", pfl(int ), (int)129) - im.pfo("ppg", pfl(int ), (int)128));
lbl146:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1443745192: {
                            continue block60;
                        }
                        case 397166427: {
                            break block60;
                        }
                    }
                    break;
                }
                v26 = var5_8.field_1351 + var14_13;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_13 = im.aw - im.pfo("ppi", pfl(int ), (int)130)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == im.pfo("ppj", pfq(int ), (int)118)) break;
                    v27 /* !! */  = (long)im.pfo("ppk", pfq(int ), (int)119);
                }
                v28 = var5_8.field_1350 + var12_12;
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_14 = im.aw - im.pfo("ppl", pfl(int ), (int)131)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == im.pfo("ppm", pfq(int ), (int)120)) break;
                    v29 /* !! */  = (long)im.pfo("ppn", pfq(int ), (int)121);
                }
                return new class_243(v24, v26, v28);
            }
            case 0: {
                var17_5 /* !! */  = (int)im.pfo("ppo", pfq(int ), (int)122);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 1: {
                var17_5 /* !! */  = (int)im.pfo("ppp", pfq(int ), (int)123);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 2: {
                var17_5 /* !! */  = (int)im.pfo("ppq", pfq(int ), (int)124);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 3: {
                var17_5 /* !! */  = (int)im.pfo("ppr", pfq(int ), (int)125);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl184:
            // 2 sources

            case 4: {
                var17_5 /* !! */  = (int)im.pfo("pps", pfq(int ), (int)126);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl189:
            // 3 sources

            case 5: {
                var17_5 /* !! */  = (int)im.pfo("ppt", pfq(int ), (int)127);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl194:
            // 2 sources

            case 6: {
                var17_5 /* !! */  = (int)im.pfo("ppu", pfq(int ), (int)128);
                if (!var18_4) ** GOTO lbl184
                throw null;
            }
lbl198:
            // 2 sources

            case 7: {
                var17_5 /* !! */  = (int)im.pfo("ppv", pfq(int ), (int)129);
                if (!var18_4) break;
                throw null;
            }
            case 8: {
                var17_5 /* !! */  = (int)im.pfo("ppw", pfq(int ), (int)130);
                if (!var18_4) ** GOTO lbl189
                throw null;
            }
lbl206:
            // 4 sources

            case 9: {
                var17_5 /* !! */  = (int)im.pfo("ppx", pfq(int ), (int)131);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl211:
            // 3 sources

            case 10: {
                var17_5 /* !! */  = (int)im.pfo("ppy", pfq(int ), (int)132);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl216:
            // 2 sources

            case 11: {
                var17_5 /* !! */  = (int)im.pfo("ppz", pfq(int ), (int)133);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl221:
            // 2 sources

            case 12: {
                var17_5 /* !! */  = (int)im.pfo("pqa", pfq(int ), (int)134);
                if (!var18_4) ** GOTO lbl216
                throw null;
            }
lbl225:
            // 2 sources

            case 13: {
                var17_5 /* !! */  = (int)im.pfo("pqb", pfq(int ), (int)135);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 14: {
                var17_5 /* !! */  = (int)im.pfo("pqc", pfq(int ), (int)136);
                if (!var18_4) ** GOTO lbl206
                throw null;
            }
            case 15: {
                var17_5 /* !! */  = (int)im.pfo("pqd", pfq(int ), (int)137);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 16: {
                var17_5 /* !! */  = (int)im.pfo("pqe", pfq(int ), (int)138);
                if (!var18_4) ** GOTO lbl194
                throw null;
            }
            case 17: {
                var17_5 /* !! */  = (int)im.pfo("pqf", pfq(int ), (int)139);
                if (var18_4) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl248:
            // 3 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_5 /* !! */  = (int)im.pfo("pqg", pfq(int ), (int)140);
                    if (!var18_4) ** GOTO lbl206
                    throw null;
                }
            }
lbl253:
            // 4 sources

            case 19: {
                var17_5 /* !! */  = (int)im.pfo("pqh", pfq(int ), (int)141);
                if (!var18_4) ** GOTO lbl189
                throw null;
            }
lbl257:
            // 3 sources

            case 20: {
                var17_5 /* !! */  = (int)im.pfo("pqi", pfq(int ), (int)142);
                if (!var18_4) ** GOTO lbl253
                throw null;
            }
            case 21: 
        }
        var17_5 /* !! */  = (int)im.pfo("pqj", pfq(int ), (int)143);
        ** while (!var18_4)
lbl264:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpz() {
        im.pfm[400] = 3846709804632153049L;
        im.pfm[401] = 768571037783493554L;
        im.pfm[402] = -3397878484592812772L;
        im.pfm[403] = 3518565283702073164L;
        im.pfm[404] = -6230187094912831306L;
        im.pfm[405] = -8472494725292755864L;
        im.pfm[406] = -405246801384884624L;
        im.pfm[407] = 5032672684759309610L;
        im.pfm[408] = 6716926671499832674L;
        im.pfm[409] = -1267596343168786932L;
        im.pfm[410] = -6152309777682477380L;
        im.pfm[411] = -8771085125503950726L;
        im.pfm[412] = 3104926587522103458L;
        im.pfm[413] = 4020871690471948885L;
        im.pfm[414] = 635059768484297837L;
        im.pfm[415] = 6734579727049756444L;
        im.pfm[416] = -935687087283682370L;
        im.pfm[417] = 6228583315919462238L;
        im.pfm[418] = 9216791899900932775L;
        im.pfm[419] = 8525914634682233037L;
        im.pfm[420] = -5287640256576964384L;
        im.pfm[421] = 5625300050411095689L;
        im.pfm[422] = -4703362381282051605L;
        im.pfm[423] = -7052233920075751051L;
        im.pfm[424] = 5825678596557348614L;
        im.pfm[425] = 3578430800498431765L;
        im.pfm[426] = 6411923457656690168L;
        im.pfm[427] = 8236063397019979154L;
        im.pfm[428] = 8327230116536457262L;
        im.pfm[429] = -7770070304947293456L;
        im.pfm[430] = -8491617607813203083L;
        im.pfm[431] = 5615921464161025871L;
        im.pfm[432] = -317865240000461167L;
        im.pfm[433] = -3075221737157147173L;
        im.pfm[434] = -7638568976846104716L;
        im.pfm[435] = 3938364128674918133L;
        im.pfm[436] = 6527252472849910024L;
        im.pfm[437] = -853794487437613851L;
        im.pfm[438] = -3218573701414193836L;
        im.pfm[439] = 2926894881259982764L;
        im.pfm[440] = 4275779407836729397L;
        im.pfm[441] = -8055292148663166125L;
        im.pfm[442] = -3378733022674644416L;
        im.pfm[443] = -3568792803158640404L;
        im.pfm[444] = 4351139109311105402L;
        im.pfm[445] = 216877954669716683L;
        im.pfm[446] = 4617909123058804142L;
        im.pfm[447] = 3357791054920745716L;
        im.pfm[448] = -3205805890501827330L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clearCache() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("qmh", pfl(int ), (int)412)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == im.pfo("qmi", pfq(int ), (int)433)) break;
            v0 /* !! */  = (long)im.pfo("qmj", pfq(int ), (int)434);
        }
        var2 = im.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("qmk", pfl(int ), (int)413)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == im.pfo("qml", pfq(int ), (int)435)) break;
            v1 /* !! */  = (long)im.pfo("qmm", pfq(int ), (int)436);
        }
        var1_1 /* !! */  = im.b;
        v2 /* !! */  = im.aw;
        if (true) ** GOTO lbl17
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - im.pfo("qmn", pfl(int ), (int)414));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -839168886: {
                    v3 = im.pfo("qmo", pfl(int ), (int)415);
                    continue block43;
                }
                case 397166427: {
                    break block43;
                }
                case 1777235590: {
                    v3 = im.pfo("qmp", pfl(int ), (int)416);
                    continue block43;
                }
            }
            break;
        }
        var0_2 = im.a;
        if (var2) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = im.aw;
                if (true) ** GOTO lbl39
                block45: while (true) {
                    v4 /* !! */  = (long)(im.pfo("qmr", pfl(int ), (int)418) - im.pfo("qmq", pfl(int ), (int)417));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2097935047: {
                            continue block45;
                        }
                        case 397166427: {
                            break block45;
                        }
                    }
                    break;
                }
                v5 /* !! */  = im.aw;
                if (true) ** GOTO lbl48
                block46: while (true) {
                    v5 /* !! */  = (long)(im.pfo("qmt", pfl(int ), (int)420) - im.pfo("qms", pfl(int ), (int)419));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 397166427: {
                            break block46;
                        }
                        case 1911037312: {
                            continue block46;
                        }
                    }
                    break;
                }
                im.cachedOffsets.clear();
                if (var0_2 || var0_2) ** GOTO lbl29
                v6 = im.pfo("qmu", pfq(int ), (int)437);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("qmv", pfl(int ), (int)421)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == im.pfo("qmw", pfq(int ), (int)438)) break;
                    v7 /* !! */  = (long)im.pfo("qmx", pfq(int ), (int)439);
                }
                im.currentPointIndex = (int)v6;
                if (var0_2 || var0_2) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("qmy", pfl(int ), (int)422)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == im.pfo("qmz", pfq(int ), (int)440)) break;
                    v8 /* !! */  = (long)im.pfo("qna", pfq(int ), (int)441);
                }
                v9 /* !! */  = im.aw;
                if (true) ** GOTO lbl72
                block49: while (true) {
                    v9 /* !! */  = (long)(v10 - im.pfo("qnb", pfl(int ), (int)423));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1423486901: {
                            v10 = im.pfo("qnc", pfl(int ), (int)424);
                            continue block49;
                        }
                        case -1172269683: {
                            v10 = im.pfo("qnd", pfl(int ), (int)425);
                            continue block49;
                        }
                        case -700078201: {
                            v10 = im.pfo("qne", pfl(int ), (int)426);
                            continue block49;
                        }
                        case 397166427: {
                            break block49;
                        }
                    }
                    break;
                }
                im.pointTimer.reset();
                if (var0_2 || var0_2) ** GOTO lbl29
                v11 /* !! */  = im.aw;
                if (true) ** GOTO lbl90
                block50: while (true) {
                    v11 /* !! */  = (long)(im.pfo("qng", pfl(int ), (int)428) - im.pfo("qnf", pfl(int ), (int)427));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1388970281: {
                            continue block50;
                        }
                        case 397166427: {
                            break block50;
                        }
                    }
                    break;
                }
                v12 /* !! */  = im.aw;
                if (true) ** GOTO lbl99
                block51: while (true) {
                    v12 /* !! */  = (long)(im.pfo("qni", pfl(int ), (int)430) - im.pfo("qnh", pfl(int ), (int)429));
lbl99:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 397166427: {
                            break block51;
                        }
                        case 1375431144: {
                            continue block51;
                        }
                    }
                    break;
                }
                im.updateTimer.reset();
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl107:
            // 4 sources

            case 0: {
                var1_1 /* !! */  = (int)im.pfo("qnj", pfq(int ), (int)442);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl112:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)im.pfo("qnk", pfq(int ), (int)443);
                if (!var2) ** GOTO lbl107
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)im.pfo("qnl", pfq(int ), (int)444);
                    if (!var2) ** GOTO lbl107
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)im.pfo("qnm", pfq(int ), (int)445);
                if (!var2) ** GOTO lbl112
                throw null;
            }
lbl125:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)im.pfo("qnn", pfq(int ), (int)446);
                if (!var2) break;
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)im.pfo("qno", pfq(int ), (int)447);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 6: {
                var1_1 /* !! */  = (int)im.pfo("qnp", pfq(int ), (int)448);
                if (!var2) ** GOTO lbl125
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)im.pfo("qnq", pfq(int ), (int)449);
                if (var2) {
                    throw null;
                }
            }
lbl142:
            // 4 sources

            case 8: {
                do {
                    var1_1 /* !! */  = (int)im.pfo("qnr", pfq(int ), (int)450);
                } while (!var2);
                throw null;
            }
lbl147:
            // 2 sources

            case 9: {
                do {
                    var1_1 /* !! */  = (int)im.pfo("qns", pfq(int ), (int)451);
                } while (!var2);
                throw null;
            }
            case 10: {
                var1_1 /* !! */  = (int)im.pfo("qnt", pfq(int ), (int)452);
                if (!var2) ** GOTO lbl107
                throw null;
            }
            case 11: 
        }
        var1_1 /* !! */  = (int)im.pfo("qnu", pfq(int ), (int)453);
        ** while (!var2)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpp() {
        im.pfr[400] = 365407054;
        im.pfr[401] = -72688061;
        im.pfr[402] = 832365071;
        im.pfr[403] = 1220489214;
        im.pfr[404] = 1669739456;
        im.pfr[405] = -1699965737;
        im.pfr[406] = 460794954;
        im.pfr[407] = 1578919218;
        im.pfr[408] = -244398966;
        im.pfr[409] = -1661359133;
        im.pfr[410] = 2003923971;
        im.pfr[411] = -593777497;
        im.pfr[412] = 407459540;
        im.pfr[413] = -2137150280;
        im.pfr[414] = 94756149;
        im.pfr[415] = 1812566543;
        im.pfr[416] = -872947356;
        im.pfr[417] = -172404647;
        im.pfr[418] = -1592355037;
        im.pfr[419] = 587048192;
        im.pfr[420] = 1028746178;
        im.pfr[421] = 545933933;
        im.pfr[422] = -782912412;
        im.pfr[423] = 1714510686;
        im.pfr[424] = -271062199;
        im.pfr[425] = 1927514039;
        im.pfr[426] = -1678560785;
        im.pfr[427] = -311758919;
        im.pfr[428] = 768818640;
        im.pfr[429] = -2019552968;
        im.pfr[430] = 133537156;
        im.pfr[431] = 1354476432;
        im.pfr[432] = 449620387;
        im.pfr[433] = 1353877956;
        im.pfr[434] = -1007056987;
        im.pfr[435] = 545813461;
        im.pfr[436] = -1794937243;
        im.pfr[437] = 1344703592;
        im.pfr[438] = -1539371852;
        im.pfr[439] = 1313213883;
        im.pfr[440] = -748317373;
        im.pfr[441] = 462880871;
        im.pfr[442] = 621735377;
        im.pfr[443] = 1521621991;
        im.pfr[444] = -474335291;
        im.pfr[445] = 1815567590;
        im.pfr[446] = -67035142;
        im.pfr[447] = -970372240;
        im.pfr[448] = 182683942;
        im.pfr[449] = -734624971;
        im.pfr[450] = 1479219625;
        im.pfr[451] = -1413933380;
        im.pfr[452] = 2106218309;
        im.pfr[453] = 805227101;
        im.pfr[454] = -797243208;
        im.pfr[455] = -19895991;
        im.pfr[456] = 876110627;
        im.pfr[457] = 1793298510;
        im.pfr[458] = 1715395920;
        im.pfr[459] = -1090807637;
        im.pfr[460] = -2123563218;
        im.pfr[461] = -440227996;
        im.pfr[462] = -1637757156;
        im.pfr[463] = -226878306;
        im.pfr[464] = -191892326;
        im.pfr[465] = -417429770;
        im.pfr[466] = 255977847;
        im.pfr[467] = -261513797;
        im.pfr[468] = -471567295;
        im.pfr[469] = -1191051134;
        im.pfr[470] = 2079585271;
        im.pfr[471] = -1049344934;
        im.pfr[472] = -137215106;
        im.pfr[473] = -226468471;
        im.pfr[474] = 43445713;
        im.pfr[475] = -1283687384;
        im.pfr[476] = -158700547;
        im.pfr[477] = -1101505696;
    }

    private static /* synthetic */ double phr(int n2) {
        return Double.longBitsToDouble(pfm[n2] ^ pfn[n2]);
    }

    private static /* synthetic */ void qqa() {
        im.pfn[0] = -8619782511149528166L;
        im.pfn[1] = 665273359709144580L;
        im.pfn[2] = 6438720164572379596L;
        im.pfn[3] = -4132324897002972964L;
        im.pfn[4] = -5597433431557403150L;
        im.pfn[5] = -5330736441244497617L;
        im.pfn[6] = -219426883262789573L;
        im.pfn[7] = -4894961090894458325L;
        im.pfn[8] = 1162339976593460054L;
        im.pfn[9] = -2121294997824879348L;
        im.pfn[10] = 8126677623599256385L;
        im.pfn[11] = 3053420781796516522L;
        im.pfn[12] = -6254752531939617814L;
        im.pfn[13] = -5452803118091952615L;
        im.pfn[14] = -2622833374436839796L;
        im.pfn[15] = -3414180051529861496L;
        im.pfn[16] = -4452838925776401565L;
        im.pfn[17] = 5062677264012442266L;
        im.pfn[18] = 8699058807787237409L;
        im.pfn[19] = 1024419122463807539L;
        im.pfn[20] = -9050966405566735695L;
        im.pfn[21] = -2923316583461043126L;
        im.pfn[22] = 358708492008771940L;
        im.pfn[23] = -2056678771745507182L;
        im.pfn[24] = -7775126182762919971L;
        im.pfn[25] = 8624158972577254764L;
        im.pfn[26] = 6987535252588235600L;
        im.pfn[27] = 53740548280566835L;
        im.pfn[28] = -8765375158178080137L;
        im.pfn[29] = 5407377324321087285L;
        im.pfn[30] = -3177374446424576702L;
        im.pfn[31] = -598744608950021777L;
        im.pfn[32] = 1754137910227413977L;
        im.pfn[33] = 8709947122767183562L;
        im.pfn[34] = 4566922772443345406L;
        im.pfn[35] = -8828564538899044365L;
        im.pfn[36] = -7293543163893855355L;
        im.pfn[37] = -6839584558273128789L;
        im.pfn[38] = 6611930864334154929L;
        im.pfn[39] = -5384960228571555496L;
        im.pfn[40] = -1473169715440569319L;
        im.pfn[41] = -377119116793491406L;
        im.pfn[42] = -8869153176305965032L;
        im.pfn[43] = -5928133668904227069L;
        im.pfn[44] = -1266398490361325645L;
        im.pfn[45] = 6498358975578198029L;
        im.pfn[46] = -2721564999765868021L;
        im.pfn[47] = 7206693777053674955L;
        im.pfn[48] = -8325696183553444336L;
        im.pfn[49] = -3200203422703244442L;
        im.pfn[50] = -3965332105919498706L;
        im.pfn[51] = -7721198517847499776L;
        im.pfn[52] = 217069375553550477L;
        im.pfn[53] = 8274694728440667509L;
        im.pfn[54] = 9199685557719386268L;
        im.pfn[55] = -5065352019470296924L;
        im.pfn[56] = -2760088781351848309L;
        im.pfn[57] = -9191341099326387747L;
        im.pfn[58] = -8649776536667176820L;
        im.pfn[59] = -1033507962992331240L;
        im.pfn[60] = 7888105707519621472L;
        im.pfn[61] = -6673475908101480322L;
        im.pfn[62] = -3091507539305669143L;
        im.pfn[63] = -3994477763637936340L;
        im.pfn[64] = -7611785111296722829L;
        im.pfn[65] = 5200297483099440492L;
        im.pfn[66] = -4561279422204367015L;
        im.pfn[67] = 6947209554972082502L;
        im.pfn[68] = 6549052175628516956L;
        im.pfn[69] = -5345858759888127636L;
        im.pfn[70] = -8506970677620538889L;
        im.pfn[71] = -4383423859587779492L;
        im.pfn[72] = 8571130434927724071L;
        im.pfn[73] = -8304960708101190812L;
        im.pfn[74] = 7117058589797666181L;
        im.pfn[75] = -4753612062004213173L;
        im.pfn[76] = -4607794499872202877L;
        im.pfn[77] = -3662871387108087097L;
        im.pfn[78] = 3060823687973471386L;
        im.pfn[79] = -709004817682545828L;
        im.pfn[80] = -4481925869815267602L;
        im.pfn[81] = -4143619867760526953L;
        im.pfn[82] = 4652498782011381435L;
        im.pfn[83] = 2507931358692661652L;
        im.pfn[84] = -1351662124616571816L;
        im.pfn[85] = 3145059747570476767L;
        im.pfn[86] = 7612108815971901346L;
        im.pfn[87] = 7378561324218359747L;
        im.pfn[88] = -2903164928237719858L;
        im.pfn[89] = 2307162269311948036L;
        im.pfn[90] = 4375933427462923310L;
        im.pfn[91] = 6894093516282325572L;
        im.pfn[92] = -7378278558690959747L;
        im.pfn[93] = 5891468637602930802L;
        im.pfn[94] = 3708659825961835132L;
        im.pfn[95] = 6271992478798943104L;
        im.pfn[96] = -7735570640322000451L;
        im.pfn[97] = -3411961396186603688L;
        im.pfn[98] = 1291936782626259646L;
        im.pfn[99] = -48373546538688496L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 shouldAfterAttack(class_1297 var0, boolean var1_1) {
        block57: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pfp", pfl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == im.pfo("pft", pfq(int ), (int)0)) break;
                v0 /* !! */  = (long)im.pfo("pfu", pfq(int ), (int)1);
            }
            var4_2 = im.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("pfv", pfl(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == im.pfo("pfw", pfq(int ), (int)2)) break;
                v1 /* !! */  = (long)im.pfo("pfx", pfq(int ), (int)3);
            }
            var3_3 /* !! */  = im.b;
            v2 /* !! */  = im.aw;
            if (true) ** GOTO lbl17
            block38: while (true) {
                v2 /* !! */  = (long)(v3 - im.pfo("pfy", pfl(int ), (int)2));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -237214260: {
                        v3 = im.pfo("pfz", pfl(int ), (int)3);
                        continue block38;
                    }
                    case 397166427: {
                        break block38;
                    }
                    case 1545961334: {
                        v3 = im.pfo("pga", pfl(int ), (int)4);
                        continue block38;
                    }
                }
                break;
            }
            var2_4 = im.a;
            if (var4_2) {
                throw null;
lbl29:
                // 7 sources

                return null;
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            if (var1_1) break block57;
            if (var2_4) ** GOTO lbl29
            v4 /* !! */  = im.aw;
            if (true) ** GOTO lbl38
            block40: while (true) {
                v4 /* !! */  = (long)(im.pfo("pgc", pfl(int ), (int)6) - im.pfo("pgb", pfl(int ), (int)5));
lbl38:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2066117482: {
                        continue block40;
                    }
                    case 397166427: {
                        break block40;
                    }
                }
                break;
            }
            v5 /* !! */  = im.aw;
            if (true) ** GOTO lbl47
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - im.pfo("pgd", pfl(int ), (int)7));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 397166427: {
                        break block41;
                    }
                    case 1015104114: {
                        v6 = im.pfo("pge", pfl(int ), (int)8);
                        continue block41;
                    }
                    case 2141854495: {
                        v6 = im.pfo("pgf", pfl(int ), (int)9);
                        continue block41;
                    }
                }
                break;
            }
            v7 /* !! */  = im.aw;
            if (true) ** GOTO lbl60
            block42: while (true) {
                v7 /* !! */  = (long)(im.pfo("pgh", pfl(int ), (int)11) - im.pfo("pgg", pfl(int ), (int)10));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -57909303: {
                        continue block42;
                    }
                    case 397166427: {
                        break block42;
                    }
                }
                break;
            }
            if (!im.lastOffset.equals((Object)class_243.field_1353)) ** GOTO lbl86
            if (var2_4) ** GOTO lbl29
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("pgi", pfl(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == im.pfo("pgj", pfq(int ), (int)4)) break;
                    v8 /* !! */  = (long)im.pfo("pgk", pfq(int ), (int)5);
                }
                v9 = im.generateRandomOffset(var0);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pgl", pfl(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == im.pfo("pgm", pfq(int ), (int)6)) break;
                    v10 /* !! */  = (long)im.pfo("pgn", pfq(int ), (int)7);
                }
                im.lastOffset = v9;
                if (var2_4) ** GOTO lbl29
lbl86:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 /* !! */  = im.aw;
                if (true) ** GOTO lbl92
                block45: while (true) {
                    v11 /* !! */  = (long)(v12 - im.pfo("pgo", pfl(int ), (int)14));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -141215297: {
                            v12 = im.pfo("pgp", pfl(int ), (int)15);
                            continue block45;
                        }
                        case 259310083: {
                            v12 = im.pfo("pgq", pfl(int ), (int)16);
                            continue block45;
                        }
                        case 397166427: {
                            break block45;
                        }
                    }
                    break;
                }
                return im.lastOffset;
            }
            case 0: {
                var3_3 /* !! */  = (int)im.pfo("pgr", pfq(int ), (int)8);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl107:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)im.pfo("pgs", pfq(int ), (int)9);
                } while (!var4_2);
                throw null;
            }
lbl112:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)im.pfo("pgt", pfq(int ), (int)10);
                if (var4_2) {
                    throw null;
                }
            }
lbl116:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)im.pfo("pgu", pfq(int ), (int)11);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
lbl120:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)im.pfo("pgv", pfq(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl125:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)im.pfo("pgw", pfq(int ), (int)13);
                    if (!var4_2) ** GOTO lbl107
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)im.pfo("pgx", pfq(int ), (int)14);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)im.pfo("pgy", pfq(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 8: {
                var3_3 /* !! */  = (int)im.pfo("pgz", pfq(int ), (int)16);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
lbl143:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)im.pfo("pha", pfq(int ), (int)17);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)im.pfo("phb", pfq(int ), (int)18);
        ** while (!var4_2)
lbl150:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpx() {
        im.pfm[200] = 2458361397549973190L;
        im.pfm[201] = -3433823947148977848L;
        im.pfm[202] = -1702905276420393321L;
        im.pfm[203] = -1423764614921647137L;
        im.pfm[204] = -8155401173131301106L;
        im.pfm[205] = -8184578184866554570L;
        im.pfm[206] = 3042403687348199839L;
        im.pfm[207] = 7819259228009661847L;
        im.pfm[208] = -6000778495037270689L;
        im.pfm[209] = 3972097638314301799L;
        im.pfm[210] = 5843604162324995015L;
        im.pfm[211] = -8762139713016239240L;
        im.pfm[212] = -1132531016149402111L;
        im.pfm[213] = -6970270331693534387L;
        im.pfm[214] = -4614946369892149280L;
        im.pfm[215] = -8620090463427095123L;
        im.pfm[216] = -2728769058108239100L;
        im.pfm[217] = 7096830080115510466L;
        im.pfm[218] = -1368030945669527703L;
        im.pfm[219] = -3302126805537609773L;
        im.pfm[220] = 2490204962297487882L;
        im.pfm[221] = -8719572782235395601L;
        im.pfm[222] = 344416608809535357L;
        im.pfm[223] = 6832398350339377978L;
        im.pfm[224] = 2335653434174645954L;
        im.pfm[225] = 4119751338841192222L;
        im.pfm[226] = -8686967171125067250L;
        im.pfm[227] = -1713345491026151123L;
        im.pfm[228] = 5697520120833905502L;
        im.pfm[229] = 8221094135326813066L;
        im.pfm[230] = 6759595836460067031L;
        im.pfm[231] = 3709503817986385588L;
        im.pfm[232] = -6952217645654212108L;
        im.pfm[233] = 7876395442858930322L;
        im.pfm[234] = 2787701627524655489L;
        im.pfm[235] = 2813389247887017616L;
        im.pfm[236] = 5248484621226851457L;
        im.pfm[237] = -135996362507112094L;
        im.pfm[238] = 8052957066021932445L;
        im.pfm[239] = 5697349972176976430L;
        im.pfm[240] = 3789589598267636360L;
        im.pfm[241] = -4253709387757648366L;
        im.pfm[242] = -2131034033455282503L;
        im.pfm[243] = -3196375895249831481L;
        im.pfm[244] = -5000065764783106719L;
        im.pfm[245] = 3048841109076164155L;
        im.pfm[246] = 943652663260561198L;
        im.pfm[247] = 6464208573252148460L;
        im.pfm[248] = -3906561936286165937L;
        im.pfm[249] = -1315795794873746158L;
        im.pfm[250] = 3745193253178273164L;
        im.pfm[251] = 7064308451144684390L;
        im.pfm[252] = -2129776402141692516L;
        im.pfm[253] = -7482549894926314226L;
        im.pfm[254] = -5932184419558617937L;
        im.pfm[255] = -2017717475287310574L;
        im.pfm[256] = 2935252026397828679L;
        im.pfm[257] = -9086733338724244207L;
        im.pfm[258] = -4224260405646518499L;
        im.pfm[259] = 8522808142050335656L;
        im.pfm[260] = 3690251021651720954L;
        im.pfm[261] = 6759441667959161936L;
        im.pfm[262] = -8938423499312314490L;
        im.pfm[263] = 2552342762274827140L;
        im.pfm[264] = -2065787259609836832L;
        im.pfm[265] = 5196901097010178898L;
        im.pfm[266] = 7287410533223347114L;
        im.pfm[267] = 4322043953640449625L;
        im.pfm[268] = 9046609745744675894L;
        im.pfm[269] = -5634949308104853225L;
        im.pfm[270] = 2916133641722162684L;
        im.pfm[271] = -7406612842384164066L;
        im.pfm[272] = 2874578658355372583L;
        im.pfm[273] = 420750364306457922L;
        im.pfm[274] = -7472520778683190725L;
        im.pfm[275] = -7912380232123401163L;
        im.pfm[276] = 5865653495567183741L;
        im.pfm[277] = -2305878573058615153L;
        im.pfm[278] = 7814762231822942948L;
        im.pfm[279] = -1528811679842278537L;
        im.pfm[280] = 9108121629047878898L;
        im.pfm[281] = -8949622205075190353L;
        im.pfm[282] = -4247051456015882674L;
        im.pfm[283] = -1386513496898832837L;
        im.pfm[284] = -1895044368672926769L;
        im.pfm[285] = -1341358987420583388L;
        im.pfm[286] = 933778882534094940L;
        im.pfm[287] = 2914167545110374190L;
        im.pfm[288] = 3485415443572017934L;
        im.pfm[289] = 6634572585638629880L;
        im.pfm[290] = 8472302550602175728L;
        im.pfm[291] = -6365853418619726812L;
        im.pfm[292] = 3275759638511172199L;
        im.pfm[293] = -1126512873302110587L;
        im.pfm[294] = -4048323660206709373L;
        im.pfm[295] = 693274937586141005L;
        im.pfm[296] = -8711781212745018282L;
        im.pfm[297] = -7453053124176602913L;
        im.pfm[298] = -4142520529276355826L;
        im.pfm[299] = -3170721179453566469L;
    }

    /*
     * Exception decompiling
     */
    public static class_243 closest(class_1297 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 128[DOLOOP]
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
    public static void resetShouldAfterAttack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pji", pfl(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == im.pfo("pjj", pfq(int ), (int)47)) break;
            v0 /* !! */  = (long)im.pfo("pjk", pfq(int ), (int)48);
        }
        var2 = im.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("pjl", pfl(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == im.pfo("pjm", pfq(int ), (int)49)) break;
            v1 /* !! */  = (long)im.pfo("pjn", pfq(int ), (int)50);
        }
        var1_1 = im.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("pjo", pfl(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == im.pfo("pjp", pfq(int ), (int)51)) break;
            v2 /* !! */  = (long)im.pfo("pjq", pfq(int ), (int)52);
        }
        var0_2 = im.a;
        if (var2) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl24
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pjr", pfl(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == im.pfo("pjs", pfq(int ), (int)53)) break;
            v3 /* !! */  = (long)im.pfo("pjt", pfq(int ), (int)54);
        }
        v4 /* !! */  = im.aw;
        if (true) ** GOTO lbl37
        block11: while (true) {
            v4 /* !! */  = (long)(v5 - im.pfo("pju", pfl(int ), (int)50));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1498316491: {
                    v5 = im.pfo("pjv", pfl(int ), (int)51);
                    continue block11;
                }
                case 397166427: {
                    break block11;
                }
                case 1483399081: {
                    v5 = im.pfo("pjw", pfl(int ), (int)52);
                    continue block11;
                }
                case 1934888645: {
                    v5 = im.pfo("pjx", pfl(int ), (int)53);
                    continue block11;
                }
            }
            break;
        }
        im.lastOffset = class_243.field_1353;
        ** while (var0_2 || var0_2)
lbl51:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 getBestPoint(class_243 var0, class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("pyu", pfl(int ), (int)252)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == im.pfo("pyv", pfq(int ), (int)242)) break;
            v0 /* !! */  = (long)im.pfo("pyw", pfq(int ), (int)243);
        }
        var7_2 = im.c;
        v1 /* !! */  = im.aw;
        if (true) ** GOTO lbl11
        block70: while (true) {
            v1 /* !! */  = (long)(v2 - im.pfo("pyx", pfl(int ), (int)253));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -607716076: {
                    v2 = im.pfo("pyy", pfl(int ), (int)254);
                    continue block70;
                }
                case 224824152: {
                    v2 = im.pfo("pyz", pfl(int ), (int)255);
                    continue block70;
                }
                case 382266271: {
                    v2 = im.pfo("pza", pfl(int ), (int)256);
                    continue block70;
                }
                case 397166427: {
                    break block70;
                }
            }
            break;
        }
        var6_3 /* !! */  = im.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("pzb", pfl(int ), (int)257)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == im.pfo("pzc", pfq(int ), (int)244)) break;
            v3 /* !! */  = (long)im.pfo("pzd", pfq(int ), (int)245);
        }
        var5_4 = im.a;
        if (!var7_2) ** GOTO lbl36
        throw null;
        {
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl36:
                // 1 sources

                if (var5_4 || var5_4) continue block72;
                if (var1_1 != null) ** GOTO lbl53
                if (var5_4) continue block72;
                v4 /* !! */  = im.aw;
                if (true) ** GOTO lbl43
                block73: while (true) {
                    v4 /* !! */  = (long)(v5 - im.pfo("pze", pfl(int ), (int)258));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -609651797: {
                            v5 = im.pfo("pzf", pfl(int ), (int)259);
                            continue block73;
                        }
                        case -558939036: {
                            v5 = im.pfo("pzg", pfl(int ), (int)260);
                            continue block73;
                        }
                        case 397166427: {
                            break block73;
                        }
                    }
                    break;
                }
                return class_243.field_1353;
lbl53:
                // 1 sources

                if (var5_4 || var5_4) continue block72;
                var2_5 = 0.0;
                if (var5_4 || var5_4) continue block72;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("pzh", pfl(int ), (int)261)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == im.pfo("pzi", pfq(int ), (int)246)) break;
                    v6 /* !! */  = (long)im.pfo("pzj", pfq(int ), (int)247);
                }
                v7 /* !! */  = im.aw;
                if (true) ** GOTO lbl65
                block75: while (true) {
                    v7 /* !! */  = (long)(v8 - im.pfo("pzk", pfl(int ), (int)262));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1746493760: {
                            v8 = im.pfo("pzl", pfl(int ), (int)263);
                            continue block75;
                        }
                        case -949335639: {
                            v8 = im.pfo("pzm", pfl(int ), (int)264);
                            continue block75;
                        }
                        case 397166427: {
                            break block75;
                        }
                        case 2118726124: {
                            v8 = im.pfo("pzn", pfl(int ), (int)265);
                            continue block75;
                        }
                    }
                    break;
                }
                v9 = var0.field_1352;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("pzo", pfl(int ), (int)266)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == im.pfo("pzp", pfq(int ), (int)248)) break;
                    v10 /* !! */  = (long)im.pfo("pzq", pfq(int ), (int)249);
                }
                v11 = var1_1.method_5829();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("pzr", pfl(int ), (int)267)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == im.pfo("pzs", pfq(int ), (int)250)) break;
                    v12 /* !! */  = (long)im.pfo("pzt", pfq(int ), (int)251);
                }
                v13 = v11.field_1323 + var2_5;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("pzu", pfl(int ), (int)268)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == im.pfo("pzv", pfq(int ), (int)252)) break;
                    v14 /* !! */  = (long)im.pfo("pzw", pfq(int ), (int)253);
                }
                v15 = var1_1.method_5829();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("pzx", pfl(int ), (int)269)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == im.pfo("pzy", pfq(int ), (int)254)) break;
                    v16 /* !! */  = (long)im.pfo("pzz", pfq(int ), (int)255);
                }
                v17 = v15.field_1320 - var2_5;
                v18 /* !! */  = im.aw;
                if (true) ** GOTO lbl106
                block80: while (true) {
                    v18 /* !! */  = (long)(im.pfo("qab", pfl(int ), (int)271) - im.pfo("qaa", pfl(int ), (int)270));
lbl106:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1453211850: {
                            continue block80;
                        }
                        case 397166427: {
                            break block80;
                        }
                    }
                    break;
                }
                v19 = class_3532.method_15350((double)v9, (double)v13, (double)v17);
                v20 /* !! */  = im.aw;
                if (true) ** GOTO lbl116
                block81: while (true) {
                    v20 /* !! */  = (long)(im.pfo("qad", pfl(int ), (int)273) - im.pfo("qac", pfl(int ), (int)272));
lbl116:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 200453598: {
                            continue block81;
                        }
                        case 397166427: {
                            break block81;
                        }
                    }
                    break;
                }
                v21 = var0.field_1351;
                v22 /* !! */  = im.aw;
                if (true) ** GOTO lbl126
                block82: while (true) {
                    v22 /* !! */  = (long)(v23 - im.pfo("qae", pfl(int ), (int)274));
lbl126:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1439321300: {
                            v23 = im.pfo("qaf", pfl(int ), (int)275);
                            continue block82;
                        }
                        case -1275543553: {
                            v23 = im.pfo("qag", pfl(int ), (int)276);
                            continue block82;
                        }
                        case 397166427: {
                            break block82;
                        }
                    }
                    break;
                }
                v24 = var1_1.method_5829();
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("qah", pfl(int ), (int)277)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == im.pfo("qai", pfq(int ), (int)256)) break;
                    v25 /* !! */  = (long)im.pfo("qaj", pfq(int ), (int)257);
                }
                v26 = v24.field_1322 + var2_5;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = im.aw - im.pfo("qak", pfl(int ), (int)278)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == im.pfo("qal", pfq(int ), (int)258)) break;
                    v27 /* !! */  = (long)im.pfo("qam", pfq(int ), (int)259);
                }
                v28 = var1_1.method_5829();
                v29 /* !! */  = im.aw;
                if (true) ** GOTO lbl152
                block85: while (true) {
                    v29 /* !! */  = (long)(v30 - im.pfo("qan", pfl(int ), (int)279));
lbl152:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -514365582: {
                            v30 = im.pfo("qao", pfl(int ), (int)280);
                            continue block85;
                        }
                        case 397166427: {
                            break block85;
                        }
                        case 1202400507: {
                            v30 = im.pfo("qap", pfl(int ), (int)281);
                            continue block85;
                        }
                    }
                    break;
                }
                v31 = v28.field_1325 - var2_5;
                v32 /* !! */  = im.aw;
                if (true) ** GOTO lbl166
                block86: while (true) {
                    v32 /* !! */  = (long)(im.pfo("qar", pfl(int ), (int)283) - im.pfo("qaq", pfl(int ), (int)282));
lbl166:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1542253152: {
                            continue block86;
                        }
                        case 397166427: {
                            break block86;
                        }
                    }
                    break;
                }
                v33 = class_3532.method_15350((double)v21, (double)v26, (double)v31);
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_9 = im.aw - im.pfo("qas", pfl(int ), (int)284)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == im.pfo("qat", pfq(int ), (int)260)) break;
                    v34 /* !! */  = (long)im.pfo("qau", pfq(int ), (int)261);
                }
                v35 = var0.field_1350;
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_10 = im.aw - im.pfo("qav", pfl(int ), (int)285)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == im.pfo("qaw", pfq(int ), (int)262)) break;
                    v36 /* !! */  = (long)im.pfo("qax", pfq(int ), (int)263);
                }
                v37 = var1_1.method_5829();
                v38 /* !! */  = im.aw;
                if (true) ** GOTO lbl188
                block89: while (true) {
                    v38 /* !! */  = (long)(v39 - im.pfo("qay", pfl(int ), (int)286));
lbl188:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -928023487: {
                            v39 = im.pfo("qaz", pfl(int ), (int)287);
                            continue block89;
                        }
                        case 397166427: {
                            break block89;
                        }
                        case 980957425: {
                            v39 = im.pfo("qba", pfl(int ), (int)288);
                            continue block89;
                        }
                        case 1634049164: {
                            v39 = im.pfo("qbb", pfl(int ), (int)289);
                            continue block89;
                        }
                    }
                    break;
                }
                v40 = v37.field_1321 + var2_5;
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_11 = im.aw - im.pfo("qbc", pfl(int ), (int)290)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == im.pfo("qbd", pfq(int ), (int)264)) break;
                    v41 /* !! */  = (long)im.pfo("qbe", pfq(int ), (int)265);
                }
                v42 = var1_1.method_5829();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_12 = im.aw - im.pfo("qbf", pfl(int ), (int)291)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == im.pfo("qbg", pfq(int ), (int)266)) break;
                    v43 /* !! */  = (long)im.pfo("qbh", pfq(int ), (int)267);
                }
                v44 = v42.field_1324 - var2_5;
                v45 /* !! */  = im.aw;
                if (true) ** GOTO lbl217
                block92: while (true) {
                    v45 /* !! */  = (long)(im.pfo("qbj", pfl(int ), (int)293) - im.pfo("qbi", pfl(int ), (int)292));
lbl217:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case 397166427: {
                            break block92;
                        }
                        case 1171199587: {
                            continue block92;
                        }
                    }
                    break;
                }
                v46 = class_3532.method_15350((double)v35, (double)v40, (double)v44);
                v47 /* !! */  = im.aw;
                if (true) ** GOTO lbl227
                block93: while (true) {
                    v47 /* !! */  = (long)(v48 - im.pfo("qbk", pfl(int ), (int)294));
lbl227:
                    // 2 sources

                    switch ((int)v47 /* !! */ ) {
                        case -901238419: {
                            v48 = im.pfo("qbl", pfl(int ), (int)295);
                            continue block93;
                        }
                        case -746983816: {
                            v48 = im.pfo("qbm", pfl(int ), (int)296);
                            continue block93;
                        }
                        case 397166427: {
                            break block93;
                        }
                        case 2124327212: {
                            v48 = im.pfo("qbn", pfl(int ), (int)297);
                            continue block93;
                        }
                    }
                    break;
                }
                var4_6 = new class_243(v19, v33, v46);
                if (!var5_4 && !var5_4) ** break;
                continue block72;
                return var4_6;
lbl243:
                // 3 sources

                case 0: {
                    var6_3 /* !! */  = (int)im.pfo("qbo", pfq(int ), (int)268);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 1: {
                    var6_3 /* !! */  = (int)im.pfo("qbp", pfq(int ), (int)269);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl253:
                // 4 sources

                case 2: {
                    var6_3 /* !! */  = (int)im.pfo("qbq", pfq(int ), (int)270);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl258:
                // 2 sources

                case 3: {
                    var6_3 /* !! */  = (int)im.pfo("qbr", pfq(int ), (int)271);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl263:
                // 2 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)im.pfo("qbs", pfq(int ), (int)272);
                        if (!var7_2) ** GOTO lbl243
                        throw null;
                    }
                }
                case 5: {
                    var6_3 /* !! */  = (int)im.pfo("qbt", pfq(int ), (int)273);
                    if (!var7_2) ** GOTO lbl263
                    throw null;
                }
                case 6: {
                    var6_3 /* !! */  = (int)im.pfo("qbu", pfq(int ), (int)274);
                    if (!var7_2) ** GOTO lbl258
                    throw null;
                }
lbl276:
                // 4 sources

                case 7: {
                    var6_3 /* !! */  = (int)im.pfo("qbv", pfq(int ), (int)275);
                    if (!var7_2) ** GOTO lbl253
                    throw null;
                }
                case 8: {
                    var6_3 /* !! */  = (int)im.pfo("qbw", pfq(int ), (int)276);
                    if (!var7_2) ** GOTO lbl243
                    throw null;
                }
lbl284:
                // 2 sources

                case 9: {
                    var6_3 /* !! */  = (int)im.pfo("qbx", pfq(int ), (int)277);
                    if (!var7_2) ** GOTO lbl253
                    throw null;
                }
                case 10: {
                    var6_3 /* !! */  = (int)im.pfo("qby", pfq(int ), (int)278);
                    if (!var7_2) ** GOTO lbl253
                    throw null;
                }
                case 11: 
            }
        }
        var6_3 /* !! */  = (int)im.pfo("qbz", pfq(int ), (int)279);
        ** while (!var7_2)
lbl295:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void generateRandomPoints(class_1297 var0, int var1_1) {
        v0 /* !! */  = im.aw;
        if (true) ** GOTO lbl5
        block74: while (true) {
            v0 /* !! */  = (long)(v1 - im.pfo("qga", pfl(int ), (int)334));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -268353921: {
                    v1 = im.pfo("qgb", pfl(int ), (int)335);
                    continue block74;
                }
                case 397166427: {
                    break block74;
                }
                case 924016212: {
                    v1 = im.pfo("qgc", pfl(int ), (int)336);
                    continue block74;
                }
            }
            break;
        }
        var15_2 = im.c;
        v2 /* !! */  = im.aw;
        if (true) ** GOTO lbl19
        block75: while (true) {
            v2 /* !! */  = (long)(v3 - im.pfo("qgd", pfl(int ), (int)337));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1954401732: {
                    v3 = im.pfo("qge", pfl(int ), (int)338);
                    continue block75;
                }
                case -1030195532: {
                    v3 = im.pfo("qgf", pfl(int ), (int)339);
                    continue block75;
                }
                case -685269388: {
                    v3 = im.pfo("qgg", pfl(int ), (int)340);
                    continue block75;
                }
                case 397166427: {
                    break block75;
                }
            }
            break;
        }
        var14_3 /* !! */  = im.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("qgh", pfl(int ), (int)341)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == im.pfo("qgi", pfq(int ), (int)348)) break;
            v4 /* !! */  = (long)im.pfo("qgj", pfq(int ), (int)349);
        }
        var13_4 = im.a;
        if (var15_2) {
            throw null;
lbl40:
            // 14 sources

            return;
        }
        if (var13_4 || var13_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("qgk", pfl(int ), (int)342)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == im.pfo("qgl", pfq(int ), (int)350)) break;
            v5 /* !! */  = (long)im.pfo("qgm", pfq(int ), (int)351);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("qgn", pfl(int ), (int)343)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == im.pfo("qgo", pfq(int ), (int)352)) break;
            v6 /* !! */  = (long)im.pfo("qgp", pfq(int ), (int)353);
        }
        im.cachedOffsets.clear();
        if (var13_4 || var13_4) ** GOTO lbl40
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("qgq", pfl(int ), (int)344)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == im.pfo("qgr", pfq(int ), (int)354)) break;
            v7 /* !! */  = (long)im.pfo("qgs", pfq(int ), (int)355);
        }
        var2_5 = var0.method_17681();
        if (var13_4) ** GOTO lbl40
        if (var14_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_4) ** GOTO lbl40
                v8 /* !! */  = im.aw;
                if (true) ** GOTO lbl70
                block81: while (true) {
                    v8 /* !! */  = (long)(im.pfo("qgu", pfl(int ), (int)346) - im.pfo("qgt", pfl(int ), (int)345));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1852314898: {
                            continue block81;
                        }
                        case 397166427: {
                            break block81;
                        }
                    }
                    break;
                }
                var4_6 = var0.method_17682();
                if (var13_4 || var13_4) ** GOTO lbl40
                var6_7 = im.pfo("qgv", pfq(int ), (int)356);
                if (var13_4) ** GOTO lbl40
                do {
                    if (var13_4 || var13_4) ** GOTO lbl40
                    if (var6_7 >= var1_1) ** GOTO lbl201
                    if (var13_4 || var13_4) ** GOTO lbl40
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("qgw", pfl(int ), (int)347)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == im.pfo("qgx", pfq(int ), (int)357)) break;
                        v9 /* !! */  = (long)im.pfo("qgy", pfq(int ), (int)358);
                    }
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("qgz", pfl(int ), (int)348)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == im.pfo("qha", pfq(int ), (int)359)) break;
                        v10 /* !! */  = (long)im.pfo("qhb", pfq(int ), (int)360);
                    }
                    var7_8 = (im.random.nextDouble() - im.pfo("qhc", phr(int ), (int)349)) * var2_5;
                    if (var13_4 || var13_4) ** GOTO lbl40
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("qhd", pfl(int ), (int)350)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == im.pfo("qhe", pfq(int ), (int)361)) break;
                        v11 /* !! */  = (long)im.pfo("qhf", pfq(int ), (int)362);
                    }
                    v12 /* !! */  = im.aw;
                    if (true) ** GOTO lbl104
                    block86: while (true) {
                        v12 /* !! */  = (long)(v13 - im.pfo("qhg", pfl(int ), (int)351));
lbl104:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -828363713: {
                                v13 = im.pfo("qhh", pfl(int ), (int)352);
                                continue block86;
                            }
                            case 397166427: {
                                break block86;
                            }
                            case 1834442920: {
                                v13 = im.pfo("qhi", pfl(int ), (int)353);
                                continue block86;
                            }
                            case 1879814459: {
                                v13 = im.pfo("qhj", pfl(int ), (int)354);
                                continue block86;
                            }
                        }
                        break;
                    }
                    var9_9 = im.random.nextDouble() * var4_6;
                    if (var13_4 || var13_4) ** GOTO lbl40
                    v14 /* !! */  = im.aw;
                    if (true) ** GOTO lbl122
                    block87: while (true) {
                        v14 /* !! */  = (long)(v15 - im.pfo("qhk", pfl(int ), (int)355));
lbl122:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -2134268474: {
                                v15 = im.pfo("qhl", pfl(int ), (int)356);
                                continue block87;
                            }
                            case -1158247088: {
                                v15 = im.pfo("qhm", pfl(int ), (int)357);
                                continue block87;
                            }
                            case -435732515: {
                                v15 = im.pfo("qhn", pfl(int ), (int)358);
                                continue block87;
                            }
                            case 397166427: {
                                break block87;
                            }
                        }
                        break;
                    }
                    v16 /* !! */  = im.aw;
                    if (true) ** GOTO lbl138
                    block88: while (true) {
                        v16 /* !! */  = (long)(v17 - im.pfo("qho", pfl(int ), (int)359));
lbl138:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -1863067498: {
                                v17 = im.pfo("qhp", pfl(int ), (int)360);
                                continue block88;
                            }
                            case 397166427: {
                                break block88;
                            }
                            case 873753255: {
                                v17 = im.pfo("qhq", pfl(int ), (int)361);
                                continue block88;
                            }
                            case 1980681321: {
                                v17 = im.pfo("qhr", pfl(int ), (int)362);
                                continue block88;
                            }
                        }
                        break;
                    }
                    var11_10 = (im.random.nextDouble() - im.pfo("qhs", phr(int ), (int)363)) * var2_5;
                    if (var13_4 || var13_4) ** GOTO lbl40
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_7 = im.aw - im.pfo("qht", pfl(int ), (int)364)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == im.pfo("qhu", pfq(int ), (int)363)) break;
                        v18 /* !! */  = (long)im.pfo("qhv", pfq(int ), (int)364);
                    }
                    v19 /* !! */  = im.aw;
                    if (true) ** GOTO lbl161
                    block90: while (true) {
                        v19 /* !! */  = (long)(v20 - im.pfo("qhw", pfl(int ), (int)365));
lbl161:
                        // 2 sources

                        switch ((int)v19 /* !! */ ) {
                            case -1375338484: {
                                v20 = im.pfo("qhx", pfl(int ), (int)366);
                                continue block90;
                            }
                            case 16359738: {
                                v20 = im.pfo("qhy", pfl(int ), (int)367);
                                continue block90;
                            }
                            case 397166427: {
                                break block90;
                            }
                            case 1727547799: {
                                v20 = im.pfo("qhz", pfl(int ), (int)368);
                                continue block90;
                            }
                        }
                        break;
                    }
                    v21 /* !! */  = im.aw;
                    if (true) ** GOTO lbl177
                    block91: while (true) {
                        v21 /* !! */  = (long)(v22 - im.pfo("qia", pfl(int ), (int)369));
lbl177:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case 397166427: {
                                break block91;
                            }
                            case 1051758890: {
                                v22 = im.pfo("qib", pfl(int ), (int)370);
                                continue block91;
                            }
                            case 1551227121: {
                                v22 = im.pfo("qic", pfl(int ), (int)371);
                                continue block91;
                            }
                            case 1916590070: {
                                v22 = im.pfo("qid", pfl(int ), (int)372);
                                continue block91;
                            }
                        }
                        break;
                    }
                    v23 = new class_243(var7_8, var9_9, var11_10);
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = im.aw - im.pfo("qie", pfl(int ), (int)373)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == im.pfo("qif", pfq(int ), (int)365)) break;
                        v24 /* !! */  = (long)im.pfo("qig", pfq(int ), (int)366);
                    }
                    im.cachedOffsets.add(v23);
                    if (var13_4 || var13_4) ** GOTO lbl40
                    ++var6_7;
                    if (var13_4) ** GOTO lbl40
                } while (!var15_2);
                throw null;
lbl201:
                // 1 sources

                if (!var13_4 && !var13_4) ** break;
                ** continue;
                return;
            }
lbl204:
            // 2 sources

            case 0: {
                var14_3 /* !! */  = (int)im.pfo("qih", pfq(int ), (int)367);
                if (var15_2) {
                    throw null;
                }
            }
            case 1: {
                var14_3 /* !! */  = (int)im.pfo("qii", pfq(int ), (int)368);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 2: {
                var14_3 /* !! */  = (int)im.pfo("qij", pfq(int ), (int)369);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl218:
            // 2 sources

            case 3: {
                var14_3 /* !! */  = (int)im.pfo("qik", pfq(int ), (int)370);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl223:
            // 2 sources

            case 4: {
                var14_3 /* !! */  = (int)im.pfo("qil", pfq(int ), (int)371);
                if (!var15_2) ** GOTO lbl218
                throw null;
            }
lbl227:
            // 5 sources

            case 5: {
                var14_3 /* !! */  = (int)im.pfo("qim", pfq(int ), (int)372);
                if (!var15_2) ** GOTO lbl223
                throw null;
            }
lbl231:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_3 /* !! */  = (int)im.pfo("qin", pfq(int ), (int)373);
                    if (var15_2) {
                        throw null;
                    }
                    ** GOTO lbl281
                    break;
                }
            }
            case 7: {
                var14_3 /* !! */  = (int)im.pfo("qio", pfq(int ), (int)374);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 8: {
                var14_3 /* !! */  = (int)im.pfo("qip", pfq(int ), (int)375);
                if (!var15_2) ** GOTO lbl227
                throw null;
            }
lbl246:
            // 2 sources

            case 9: {
                var14_3 /* !! */  = (int)im.pfo("qiq", pfq(int ), (int)376);
                if (var15_2) {
                    throw null;
                }
            }
            case 10: {
                var14_3 /* !! */  = (int)im.pfo("qir", pfq(int ), (int)377);
                if (!var15_2) ** GOTO lbl231
                throw null;
            }
            case 11: {
                var14_3 /* !! */  = (int)im.pfo("qis", pfq(int ), (int)378);
                if (!var15_2) ** GOTO lbl204
                throw null;
            }
            case 12: {
                var14_3 /* !! */  = (int)im.pfo("qit", pfq(int ), (int)379);
                if (!var15_2) ** GOTO lbl227
                throw null;
            }
lbl262:
            // 2 sources

            case 13: {
                var14_3 /* !! */  = (int)im.pfo("qiu", pfq(int ), (int)380);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl267:
            // 2 sources

            case 14: {
                var14_3 /* !! */  = (int)im.pfo("qiv", pfq(int ), (int)381);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl272:
            // 2 sources

            case 15: {
                var14_3 /* !! */  = (int)im.pfo("qiw", pfq(int ), (int)382);
                if (!var15_2) ** GOTO lbl231
                throw null;
            }
            case 16: {
                var14_3 /* !! */  = (int)im.pfo("qix", pfq(int ), (int)383);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl281:
            // 4 sources

            case 17: {
                var14_3 /* !! */  = (int)im.pfo("qiy", pfq(int ), (int)384);
                if (!var15_2) ** GOTO lbl227
                throw null;
            }
lbl285:
            // 2 sources

            case 18: {
                var14_3 /* !! */  = (int)im.pfo("qiz", pfq(int ), (int)385);
                if (var15_2) {
                    throw null;
                }
            }
            case 19: {
                var14_3 /* !! */  = (int)im.pfo("qja", pfq(int ), (int)386);
                if (!var15_2) ** GOTO lbl231
                throw null;
            }
lbl293:
            // 2 sources

            case 20: {
                var14_3 /* !! */  = (int)im.pfo("qjb", pfq(int ), (int)387);
                if (var15_2) {
                    throw null;
                }
            }
            case 21: {
                var14_3 /* !! */  = (int)im.pfo("qjc", pfq(int ), (int)388);
                if (var15_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 22: {
                var14_3 /* !! */  = (int)im.pfo("qjd", pfq(int ), (int)389);
                if (!var15_2) ** GOTO lbl246
                throw null;
            }
lbl306:
            // 2 sources

            case 23: {
                var14_3 /* !! */  = (int)im.pfo("qje", pfq(int ), (int)390);
                if (!var15_2) ** GOTO lbl281
                throw null;
            }
lbl310:
            // 3 sources

            case 24: {
                var14_3 /* !! */  = (int)im.pfo("qjf", pfq(int ), (int)391);
                if (!var15_2) ** GOTO lbl227
                throw null;
            }
            case 25: {
                var14_3 /* !! */  = (int)im.pfo("qjg", pfq(int ), (int)392);
                if (!var15_2) ** GOTO lbl262
                throw null;
            }
            case 26: 
        }
        var14_3 /* !! */  = (int)im.pfo("qjh", pfq(int ), (int)393);
        ** while (!var15_2)
lbl321:
        // 1 sources

        throw null;
    }

    public im() {
    }

    private static /* synthetic */ void qps() {
        im.pfs[200] = 1545682987;
        im.pfs[201] = 91848272;
        im.pfs[202] = 114406627;
        im.pfs[203] = 1908424712;
        im.pfs[204] = -1047976930;
        im.pfs[205] = 1657537645;
        im.pfs[206] = 1019500285;
        im.pfs[207] = 1999994106;
        im.pfs[208] = 557493444;
        im.pfs[209] = 1712409165;
        im.pfs[210] = -1587598915;
        im.pfs[211] = -1764813103;
        im.pfs[212] = -1914845631;
        im.pfs[213] = 1920627841;
        im.pfs[214] = 1739809634;
        im.pfs[215] = 2026836564;
        im.pfs[216] = 327770633;
        im.pfs[217] = -2043674958;
        im.pfs[218] = -257814690;
        im.pfs[219] = -2034362435;
        im.pfs[220] = -1019208168;
        im.pfs[221] = -1438412236;
        im.pfs[222] = -215569761;
        im.pfs[223] = 1311147225;
        im.pfs[224] = -1360222876;
        im.pfs[225] = -1832762624;
        im.pfs[226] = -1318668131;
        im.pfs[227] = 1974678154;
        im.pfs[228] = 1341919168;
        im.pfs[229] = 130636273;
        im.pfs[230] = -2046639053;
        im.pfs[231] = 2012026702;
        im.pfs[232] = -275549689;
        im.pfs[233] = 1548771194;
        im.pfs[234] = 699164857;
        im.pfs[235] = -961209149;
        im.pfs[236] = -2064359600;
        im.pfs[237] = -1627859257;
        im.pfs[238] = -622110638;
        im.pfs[239] = 1799833965;
        im.pfs[240] = 655083872;
        im.pfs[241] = -730069214;
        im.pfs[242] = 472511584;
        im.pfs[243] = -1344178280;
        im.pfs[244] = 327557416;
        im.pfs[245] = 1793867759;
        im.pfs[246] = 1516343828;
        im.pfs[247] = -375084882;
        im.pfs[248] = -1690266612;
        im.pfs[249] = -1902656449;
        im.pfs[250] = -442023921;
        im.pfs[251] = 930369284;
        im.pfs[252] = -396158715;
        im.pfs[253] = 967964826;
        im.pfs[254] = -1705998821;
        im.pfs[255] = -2141305465;
        im.pfs[256] = -1417562269;
        im.pfs[257] = -701822767;
        im.pfs[258] = 1549088819;
        im.pfs[259] = 1895875573;
        im.pfs[260] = 1577901807;
        im.pfs[261] = -116717357;
        im.pfs[262] = 813800781;
        im.pfs[263] = -1701753482;
        im.pfs[264] = -892234752;
        im.pfs[265] = 994215898;
        im.pfs[266] = 1848664925;
        im.pfs[267] = -1983309121;
        im.pfs[268] = 1048417721;
        im.pfs[269] = 1467190503;
        im.pfs[270] = -1540953350;
        im.pfs[271] = 940256739;
        im.pfs[272] = 1610139030;
        im.pfs[273] = 1809239151;
        im.pfs[274] = 1352923164;
        im.pfs[275] = 536792648;
        im.pfs[276] = -769088035;
        im.pfs[277] = -847069130;
        im.pfs[278] = 589969275;
        im.pfs[279] = -1009440975;
        im.pfs[280] = 325198239;
        im.pfs[281] = 1125432433;
        im.pfs[282] = 602897555;
        im.pfs[283] = -337894558;
        im.pfs[284] = 288461907;
        im.pfs[285] = -2132845448;
        im.pfs[286] = -1451464894;
        im.pfs[287] = -283430221;
        im.pfs[288] = -795602448;
        im.pfs[289] = -445427487;
        im.pfs[290] = 608935393;
        im.pfs[291] = 1690969812;
        im.pfs[292] = 441917057;
        im.pfs[293] = -583472475;
        im.pfs[294] = -422344327;
        im.pfs[295] = 283455041;
        im.pfs[296] = 1042947878;
        im.pfs[297] = 42240178;
        im.pfs[298] = -1908362633;
        im.pfs[299] = -253466979;
    }

    private static /* synthetic */ float pof(int n2) {
        return Float.intBitsToFloat(pfr[n2] ^ pfs[n2]);
    }

    private static /* synthetic */ void qpm() {
        im.pfr[100] = -638672231;
        im.pfr[101] = -829443687;
        im.pfr[102] = -1159580848;
        im.pfr[103] = -1134754719;
        im.pfr[104] = 543858875;
        im.pfr[105] = 1355521097;
        im.pfr[106] = -405677383;
        im.pfr[107] = 365025262;
        im.pfr[108] = 760534802;
        im.pfr[109] = 879540997;
        im.pfr[110] = 1279639889;
        im.pfr[111] = -2022064660;
        im.pfr[112] = -1496460525;
        im.pfr[113] = 1439450360;
        im.pfr[114] = -1596177003;
        im.pfr[115] = -1905283427;
        im.pfr[116] = 118448708;
        im.pfr[117] = -372916854;
        im.pfr[118] = -2028439332;
        im.pfr[119] = -1935561540;
        im.pfr[120] = 790980396;
        im.pfr[121] = 430368060;
        im.pfr[122] = -1550000694;
        im.pfr[123] = 1858450938;
        im.pfr[124] = 111339303;
        im.pfr[125] = -477425954;
        im.pfr[126] = -1587922175;
        im.pfr[127] = -1546822539;
        im.pfr[128] = 1640352518;
        im.pfr[129] = -1214701998;
        im.pfr[130] = 2144887253;
        im.pfr[131] = -1469880945;
        im.pfr[132] = -252007853;
        im.pfr[133] = 1763537722;
        im.pfr[134] = -98497641;
        im.pfr[135] = 1615887199;
        im.pfr[136] = -335745256;
        im.pfr[137] = 844449812;
        im.pfr[138] = 612560231;
        im.pfr[139] = -165420177;
        im.pfr[140] = 572341761;
        im.pfr[141] = -1038307726;
        im.pfr[142] = 2097446101;
        im.pfr[143] = -1161102507;
        im.pfr[144] = -429564151;
        im.pfr[145] = -670004160;
        im.pfr[146] = -740228700;
        im.pfr[147] = 577853382;
        im.pfr[148] = 1213097834;
        im.pfr[149] = -707427334;
        im.pfr[150] = -1785013097;
        im.pfr[151] = -848641213;
        im.pfr[152] = 1836538900;
        im.pfr[153] = -454986416;
        im.pfr[154] = 578979196;
        im.pfr[155] = -1924064779;
        im.pfr[156] = -496220640;
        im.pfr[157] = 156891843;
        im.pfr[158] = -515868443;
        im.pfr[159] = 784612675;
        im.pfr[160] = -1999292103;
        im.pfr[161] = -310825492;
        im.pfr[162] = -1227772034;
        im.pfr[163] = 2097118616;
        im.pfr[164] = -1920157435;
        im.pfr[165] = 300966358;
        im.pfr[166] = -1509392768;
        im.pfr[167] = -1373635848;
        im.pfr[168] = -506168844;
        im.pfr[169] = 740479347;
        im.pfr[170] = 696215365;
        im.pfr[171] = 370882286;
        im.pfr[172] = -1341151850;
        im.pfr[173] = -1722502305;
        im.pfr[174] = -1126671546;
        im.pfr[175] = -1706652658;
        im.pfr[176] = -342837224;
        im.pfr[177] = -563664129;
        im.pfr[178] = -1223361928;
        im.pfr[179] = 2125093808;
        im.pfr[180] = -1766055153;
        im.pfr[181] = 710865232;
        im.pfr[182] = 219271227;
        im.pfr[183] = -382340445;
        im.pfr[184] = -1693461343;
        im.pfr[185] = -605835220;
        im.pfr[186] = 1021821064;
        im.pfr[187] = -479394040;
        im.pfr[188] = -1965500191;
        im.pfr[189] = 1293461744;
        im.pfr[190] = -1193763428;
        im.pfr[191] = 924059151;
        im.pfr[192] = -752482852;
        im.pfr[193] = 738054753;
        im.pfr[194] = 1038573416;
        im.pfr[195] = -1360470071;
        im.pfr[196] = -524766791;
        im.pfr[197] = -44364302;
        im.pfr[198] = -1405725009;
        im.pfr[199] = 1735645268;
    }

    private static /* synthetic */ void qqb() {
        im.pfn[100] = -3483337811638591944L;
        im.pfn[101] = 5081857683464619319L;
        im.pfn[102] = -1405249861188501290L;
        im.pfn[103] = -2500760348969614796L;
        im.pfn[104] = 7386162626027890664L;
        im.pfn[105] = 2508780275864510667L;
        im.pfn[106] = -5048437312846103963L;
        im.pfn[107] = 8564190610820949137L;
        im.pfn[108] = 4260766023416559404L;
        im.pfn[109] = -5528137396114759272L;
        im.pfn[110] = 8875561956799168091L;
        im.pfn[111] = 549856564948005884L;
        im.pfn[112] = -7119317805583978811L;
        im.pfn[113] = -8022259597350447121L;
        im.pfn[114] = -3075242759758890595L;
        im.pfn[115] = -5612896013684434466L;
        im.pfn[116] = -2534545685031134307L;
        im.pfn[117] = -8904170691788333469L;
        im.pfn[118] = 2327272777293526016L;
        im.pfn[119] = -1232338509095878150L;
        im.pfn[120] = -2601069021957100118L;
        im.pfn[121] = -4243246046438540343L;
        im.pfn[122] = 6474458741243166116L;
        im.pfn[123] = -104895376866243813L;
        im.pfn[124] = 7456557527449314691L;
        im.pfn[125] = -8966296307605287816L;
        im.pfn[126] = -376814378816393206L;
        im.pfn[127] = 2361774762463224798L;
        im.pfn[128] = 9055999168369713324L;
        im.pfn[129] = 4702930079677826632L;
        im.pfn[130] = -5861421558733808209L;
        im.pfn[131] = 2766815568400706218L;
        im.pfn[132] = 4938669912231010909L;
        im.pfn[133] = -8021695224158011940L;
        im.pfn[134] = 1557545032033894726L;
        im.pfn[135] = 1442342946454442990L;
        im.pfn[136] = -3189583386063800706L;
        im.pfn[137] = -225143920224291548L;
        im.pfn[138] = -5660268064912661477L;
        im.pfn[139] = -6821863683727341657L;
        im.pfn[140] = -6276042717673918724L;
        im.pfn[141] = -2697171252343005865L;
        im.pfn[142] = 2407375668775544645L;
        im.pfn[143] = 8609313091127326036L;
        im.pfn[144] = 3359221575362766217L;
        im.pfn[145] = 4810100967640901447L;
        im.pfn[146] = -3996480458719741552L;
        im.pfn[147] = -862631425547372090L;
        im.pfn[148] = -1298270758423527079L;
        im.pfn[149] = 2469694519928781565L;
        im.pfn[150] = 7769168499301280866L;
        im.pfn[151] = -7046905560882643063L;
        im.pfn[152] = 1120711316858859302L;
        im.pfn[153] = -2638206867595252825L;
        im.pfn[154] = 1902846683041376998L;
        im.pfn[155] = -8417738900446991731L;
        im.pfn[156] = 1784813991437400087L;
        im.pfn[157] = 1777324676116979878L;
        im.pfn[158] = -6822788777905739220L;
        im.pfn[159] = -914173917715096763L;
        im.pfn[160] = 8149078755359130503L;
        im.pfn[161] = -8559607678326431220L;
        im.pfn[162] = -5539396936765584147L;
        im.pfn[163] = -6898238692144964275L;
        im.pfn[164] = 916175030736131510L;
        im.pfn[165] = -5079504596238134943L;
        im.pfn[166] = 4020975376971397915L;
        im.pfn[167] = -1341848888389316972L;
        im.pfn[168] = 7212994801815300182L;
        im.pfn[169] = -3931713974724461711L;
        im.pfn[170] = -7081029774061995365L;
        im.pfn[171] = -2998608807328351362L;
        im.pfn[172] = 4811641494889268620L;
        im.pfn[173] = -475196374287035209L;
        im.pfn[174] = -3677435114361697952L;
        im.pfn[175] = 7474040330717208754L;
        im.pfn[176] = 2380263776945705977L;
        im.pfn[177] = 7659334626910470292L;
        im.pfn[178] = 6632883843498861560L;
        im.pfn[179] = 8984605458993963778L;
        im.pfn[180] = 7984072785047300547L;
        im.pfn[181] = 8601871555217670198L;
        im.pfn[182] = 6286167992611823138L;
        im.pfn[183] = 6427650447027363067L;
        im.pfn[184] = 479609259873120231L;
        im.pfn[185] = 3391240948774760270L;
        im.pfn[186] = -8356801018652384390L;
        im.pfn[187] = -7757919559726660415L;
        im.pfn[188] = -8078646941110717892L;
        im.pfn[189] = -1838892271124882787L;
        im.pfn[190] = -7506826390582954781L;
        im.pfn[191] = 3538827359932279844L;
        im.pfn[192] = 1974209731830579388L;
        im.pfn[193] = 5028126734216761362L;
        im.pfn[194] = -2343962779065160408L;
        im.pfn[195] = 3403361387981320332L;
        im.pfn[196] = 2600414822465554693L;
        im.pfn[197] = -1636299387010975548L;
        im.pfn[198] = -7405924662738097987L;
        im.pfn[199] = -3665686394996940793L;
    }

    static {
        pfr = new int[478];
        pfs = new int[478];
        im.qpl();
        im.qpm();
        im.qpn();
        im.qpo();
        im.qpp();
        im.qpq();
        im.qpr();
        im.qps();
        im.qpt();
        im.qpu();
        pfm = new long[449];
        pfn = new long[449];
        im.qpv();
        im.qpw();
        im.qpx();
        im.qpy();
        im.qpz();
        im.qqa();
        im.qqb();
        im.qqc();
        im.qqd();
        im.qqe();
        random = new Random();
        pointTimer = new pr();
        updateTimer = new pr();
        cachedOffsets = new ArrayList<class_243>();
        currentPointIndex = (int)im.pfo("qpk", pfq(int ), (int)477);
        lastShouldPoint = class_243.field_1353;
        shouldRandom = new Random();
        lastOffset = class_243.field_1353;
    }

    private static /* synthetic */ void qpw() {
        im.pfm[100] = -1838839391581198613L;
        im.pfm[101] = -5182485404054072599L;
        im.pfm[102] = -4563320017281169267L;
        im.pfm[103] = 1247472630770992458L;
        im.pfm[104] = -2343374847022241041L;
        im.pfm[105] = -4126905138989854983L;
        im.pfm[106] = 5962221355251803150L;
        im.pfm[107] = -3500381617733907059L;
        im.pfm[108] = -2810966277389595525L;
        im.pfm[109] = -1489881721645399261L;
        im.pfm[110] = 624818319159000845L;
        im.pfm[111] = 4053657075042251772L;
        im.pfm[112] = -5278873370188550751L;
        im.pfm[113] = -4341731144846659733L;
        im.pfm[114] = 8045581538644385763L;
        im.pfm[115] = -1003215115028908858L;
        im.pfm[116] = -7154535215271486563L;
        im.pfm[117] = -3694612966242320097L;
        im.pfm[118] = -9137446357210877834L;
        im.pfm[119] = -8009029449305896588L;
        im.pfm[120] = -1999954369140689872L;
        im.pfm[121] = -361818122265207377L;
        im.pfm[122] = -1645319461061154174L;
        im.pfm[123] = 8035859447180839486L;
        im.pfm[124] = 3070435367542077294L;
        im.pfm[125] = -7158476048217085165L;
        im.pfm[126] = 6198932861745360920L;
        im.pfm[127] = 8232354015724950514L;
        im.pfm[128] = -6209555190940111198L;
        im.pfm[129] = -757578996455207302L;
        im.pfm[130] = 8880457428147132503L;
        im.pfm[131] = -7130095084436889936L;
        im.pfm[132] = 507994368888705600L;
        im.pfm[133] = 8694254909359865116L;
        im.pfm[134] = 7358050004210797772L;
        im.pfm[135] = -6018029044568034298L;
        im.pfm[136] = 4301902402441185389L;
        im.pfm[137] = 6004415463020022766L;
        im.pfm[138] = -7664169802709174079L;
        im.pfm[139] = 8756696995613696314L;
        im.pfm[140] = -2877237595442437565L;
        im.pfm[141] = 6476007960838612652L;
        im.pfm[142] = 4451081613784758909L;
        im.pfm[143] = 3296311747138294543L;
        im.pfm[144] = 8709378218013149112L;
        im.pfm[145] = 1224038283778601007L;
        im.pfm[146] = 723100294043538689L;
        im.pfm[147] = -8144135872243510600L;
        im.pfm[148] = -2512974918454049509L;
        im.pfm[149] = 8090681161020292351L;
        im.pfm[150] = 793318339293603735L;
        im.pfm[151] = -6586932211522555007L;
        im.pfm[152] = 878863047002785309L;
        im.pfm[153] = 5682200002745503517L;
        im.pfm[154] = 2702684657483232124L;
        im.pfm[155] = -1646235804718802814L;
        im.pfm[156] = 4983008538142596650L;
        im.pfm[157] = 2811313766625753404L;
        im.pfm[158] = 4847495250615784436L;
        im.pfm[159] = -4026810144261989134L;
        im.pfm[160] = -3615738508154634420L;
        im.pfm[161] = -8907334284779562051L;
        im.pfm[162] = 4923094573863538930L;
        im.pfm[163] = -8816831054482558388L;
        im.pfm[164] = -4017759371305872134L;
        im.pfm[165] = -2989503573858130124L;
        im.pfm[166] = -7430823243498278041L;
        im.pfm[167] = 2907474137955228162L;
        im.pfm[168] = -1858962402651407150L;
        im.pfm[169] = 2543855733267589931L;
        im.pfm[170] = -1963265927310539936L;
        im.pfm[171] = 5003162738088862835L;
        im.pfm[172] = 8718455126585934402L;
        im.pfm[173] = -1733271579674705015L;
        im.pfm[174] = -5725651261781959642L;
        im.pfm[175] = 8171185587276382367L;
        im.pfm[176] = -5887059064227926244L;
        im.pfm[177] = 2818811948569026386L;
        im.pfm[178] = -2355002596478826203L;
        im.pfm[179] = -5988311070902715191L;
        im.pfm[180] = 8276373909257765798L;
        im.pfm[181] = 1557317713569530203L;
        im.pfm[182] = 792783791325358256L;
        im.pfm[183] = 6288113674784780250L;
        im.pfm[184] = -4913757070544182685L;
        im.pfm[185] = -5091216672912441585L;
        im.pfm[186] = -6004441634781303461L;
        im.pfm[187] = -2602740025109274181L;
        im.pfm[188] = -8324967550797415993L;
        im.pfm[189] = -1152670121257967455L;
        im.pfm[190] = 2956082758032694124L;
        im.pfm[191] = -8979512266397859349L;
        im.pfm[192] = 240102585824348826L;
        im.pfm[193] = -3281005982602543867L;
        im.pfm[194] = -3680966944565564735L;
        im.pfm[195] = 9136689513825470316L;
        im.pfm[196] = -1076024411989761425L;
        im.pfm[197] = -1848345015424654686L;
        im.pfm[198] = 5134754641736981453L;
        im.pfm[199] = 8375374823669014299L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 brain(class_1297 var0, float var1_1, float var2_2) {
        v0 /* !! */  = im.aw;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(v1 - im.pfo("qca", pfl(int ), (int)298));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -859560160: {
                    v1 = im.pfo("qcb", pfl(int ), (int)299);
                    continue block62;
                }
                case -30259842: {
                    v1 = im.pfo("qcc", pfl(int ), (int)300);
                    continue block62;
                }
                case 397166427: {
                    break block62;
                }
                case 2015353408: {
                    v1 = im.pfo("qcd", pfl(int ), (int)301);
                    continue block62;
                }
            }
            break;
        }
        var19_3 = im.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = im.aw - im.pfo("qce", pfl(int ), (int)302)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == im.pfo("qcf", pfq(int ), (int)280)) break;
            v2 /* !! */  = (long)im.pfo("qcg", pfq(int ), (int)281);
        }
        var18_4 /* !! */  = im.b;
        v3 /* !! */  = im.aw;
        if (true) ** GOTO lbl28
        block64: while (true) {
            v3 /* !! */  = (long)(v4 - im.pfo("qch", pfl(int ), (int)303));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -616222674: {
                    v4 = im.pfo("qci", pfl(int ), (int)304);
                    continue block64;
                }
                case 10369369: {
                    v4 = im.pfo("qcj", pfl(int ), (int)305);
                    continue block64;
                }
                case 117071025: {
                    v4 = im.pfo("qck", pfl(int ), (int)306);
                    continue block64;
                }
                case 397166427: {
                    break block64;
                }
            }
            break;
        }
        var17_5 = im.a;
        if (var19_3) {
            throw null;
lbl43:
            // 9 sources

            return null;
        }
        if (var17_5 || var17_5) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = im.aw - im.pfo("qcl", pfl(int ), (int)307)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == im.pfo("qcm", pfq(int ), (int)282)) break;
            v5 /* !! */  = (long)im.pfo("qcn", pfq(int ), (int)283);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = im.aw - im.pfo("qco", pfl(int ), (int)308)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == im.pfo("qcp", pfq(int ), (int)284)) break;
            v6 /* !! */  = (long)im.pfo("qcq", pfq(int ), (int)285);
        }
        v7 = im.mc.field_1724;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = im.aw - im.pfo("qcr", pfl(int ), (int)309)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == im.pfo("qcs", pfq(int ), (int)286)) break;
            v8 /* !! */  = (long)im.pfo("qct", pfq(int ), (int)287);
        }
        v9 = v7.method_73189();
        v10 /* !! */  = im.aw;
        if (true) ** GOTO lbl67
        block69: while (true) {
            v10 /* !! */  = (long)(im.pfo("qcv", pfl(int ), (int)311) - im.pfo("qcu", pfl(int ), (int)310));
lbl67:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -988483335: {
                    continue block69;
                }
                case 397166427: {
                    break block69;
                }
            }
            break;
        }
        v11 = var0.method_73189();
        v12 /* !! */  = im.aw;
        if (true) ** GOTO lbl77
        block70: while (true) {
            v12 /* !! */  = (long)(v13 - im.pfo("qcw", pfl(int ), (int)312));
lbl77:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1781176815: {
                    v13 = im.pfo("qcx", pfl(int ), (int)313);
                    continue block70;
                }
                case 254982925: {
                    v13 = im.pfo("qcy", pfl(int ), (int)314);
                    continue block70;
                }
                case 397166427: {
                    break block70;
                }
                case 762896357: {
                    v13 = im.pfo("qcz", pfl(int ), (int)315);
                    continue block70;
                }
            }
            break;
        }
        var3_6 = v9.method_1022(v11);
        if (var17_5 || var17_5) ** GOTO lbl43
        v14 = (var3_6 - (double)var1_1) / (double)(var2_2 - var1_1);
        v15 /* !! */  = im.aw;
        if (true) ** GOTO lbl96
        block71: while (true) {
            v15 /* !! */  = (long)(v16 - im.pfo("qda", pfl(int ), (int)316));
lbl96:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1658494035: {
                    v16 = im.pfo("qdb", pfl(int ), (int)317);
                    continue block71;
                }
                case -749209089: {
                    v16 = im.pfo("qdc", pfl(int ), (int)318);
                    continue block71;
                }
                case 397166427: {
                    break block71;
                }
            }
            break;
        }
        var5_7 = class_3532.method_15350((double)v14, (double)0.0, (double)1.0);
        if (var17_5 || var17_5) ** GOTO lbl43
        var7_8 = var5_7;
        if (var17_5 || var17_5) ** GOTO lbl43
        var9_9 = im.pfo("qdd", phr(int ), (int)319);
        if (var17_5 || var17_5) ** GOTO lbl43
        var11_10 = im.pfo("qde", phr(int ), (int)320);
        if (var17_5 || var17_5) ** GOTO lbl43
        var13_11 = var9_9 + (var11_10 - var9_9) * var7_8;
        if (var17_5 || var17_5) ** GOTO lbl43
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = im.aw - im.pfo("qdf", pfl(int ), (int)321)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == im.pfo("qdg", pfq(int ), (int)288)) break;
            v17 /* !! */  = (long)im.pfo("qdh", pfq(int ), (int)289);
        }
        v18 = var0.method_23318();
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_5 = im.aw - im.pfo("qdi", pfl(int ), (int)322)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == im.pfo("qdj", pfq(int ), (int)290)) break;
            v19 /* !! */  = (long)im.pfo("qdk", pfq(int ), (int)291);
        }
        var15_12 = v18 + (double)var0.method_17682() * var13_11;
        if (var17_5) ** GOTO lbl43
        if (var18_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var17_5) ** break;
                ** continue;
                v20 /* !! */  = im.aw;
                if (true) ** GOTO lbl137
                block74: while (true) {
                    v20 /* !! */  = (long)(v21 - im.pfo("qdl", pfl(int ), (int)323));
lbl137:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 78070449: {
                            v21 = im.pfo("qdm", pfl(int ), (int)324);
                            continue block74;
                        }
                        case 397166427: {
                            break block74;
                        }
                        case 620040844: {
                            v21 = im.pfo("qdn", pfl(int ), (int)325);
                            continue block74;
                        }
                    }
                    break;
                }
                v22 /* !! */  = im.aw;
                if (true) ** GOTO lbl150
                block75: while (true) {
                    v22 /* !! */  = (long)(v23 - im.pfo("qdo", pfl(int ), (int)326));
lbl150:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1791671730: {
                            v23 = im.pfo("qdp", pfl(int ), (int)327);
                            continue block75;
                        }
                        case -1030733397: {
                            v23 = im.pfo("qdq", pfl(int ), (int)328);
                            continue block75;
                        }
                        case 397166427: {
                            break block75;
                        }
                        case 2065008171: {
                            v23 = im.pfo("qdr", pfl(int ), (int)329);
                            continue block75;
                        }
                    }
                    break;
                }
                v24 = var0.method_23317();
                v25 /* !! */  = im.aw;
                if (true) ** GOTO lbl167
                block76: while (true) {
                    v25 /* !! */  = (long)(im.pfo("qdt", pfl(int ), (int)331) - im.pfo("qds", pfl(int ), (int)330));
lbl167:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1631876189: {
                            continue block76;
                        }
                        case 397166427: {
                            break block76;
                        }
                    }
                    break;
                }
                v26 = var0.method_23321();
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = im.aw - im.pfo("qdu", pfl(int ), (int)332)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == im.pfo("qdv", pfq(int ), (int)292)) break;
                    v27 /* !! */  = (long)im.pfo("qdw", pfq(int ), (int)293);
                }
                return new class_243(v24, var15_12, v26);
            }
lbl179:
            // 2 sources

            case 0: {
                var18_4 /* !! */  = (int)im.pfo("qdx", pfq(int ), (int)294);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var18_4 /* !! */  = (int)im.pfo("qdy", pfq(int ), (int)295);
                    if (!var19_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl189:
            // 4 sources

            case 2: {
                var18_4 /* !! */  = (int)im.pfo("qdz", pfq(int ), (int)296);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl194:
            // 2 sources

            case 3: {
                do {
                    var18_4 /* !! */  = (int)im.pfo("qea", pfq(int ), (int)297);
                } while (!var19_3);
                throw null;
            }
lbl199:
            // 2 sources

            case 4: {
                var18_4 /* !! */  = (int)im.pfo("qeb", pfq(int ), (int)298);
                if (!var19_3) ** GOTO lbl194
                throw null;
            }
lbl203:
            // 2 sources

            case 5: {
                do {
                    var18_4 /* !! */  = (int)im.pfo("qec", pfq(int ), (int)299);
                } while (!var19_3);
                throw null;
            }
            case 6: {
                var18_4 /* !! */  = (int)im.pfo("qed", pfq(int ), (int)300);
                if (!var19_3) ** GOTO lbl203
                throw null;
            }
lbl212:
            // 2 sources

            case 7: {
                var18_4 /* !! */  = (int)im.pfo("qee", pfq(int ), (int)301);
                if (!var19_3) ** GOTO lbl189
                throw null;
            }
            case 8: {
                var18_4 /* !! */  = (int)im.pfo("qef", pfq(int ), (int)302);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 9: {
                var18_4 /* !! */  = (int)im.pfo("qeg", pfq(int ), (int)303);
                if (!var19_3) break;
                throw null;
            }
lbl225:
            // 2 sources

            case 10: {
                var18_4 /* !! */  = (int)im.pfo("qeh", pfq(int ), (int)304);
                if (!var19_3) ** GOTO lbl179
                throw null;
            }
lbl229:
            // 2 sources

            case 11: {
                var18_4 /* !! */  = (int)im.pfo("qei", pfq(int ), (int)305);
                if (!var19_3) break;
                throw null;
            }
            case 12: {
                var18_4 /* !! */  = (int)im.pfo("qej", pfq(int ), (int)306);
                if (!var19_3) ** GOTO lbl225
                throw null;
            }
            case 13: {
                var18_4 /* !! */  = (int)im.pfo("qek", pfq(int ), (int)307);
                if (!var19_3) ** GOTO lbl199
                throw null;
            }
lbl241:
            // 2 sources

            case 14: {
                var18_4 /* !! */  = (int)im.pfo("qel", pfq(int ), (int)308);
                if (!var19_3) ** GOTO lbl189
                throw null;
            }
            case 15: {
                var18_4 /* !! */  = (int)im.pfo("qem", pfq(int ), (int)309);
                if (!var19_3) ** GOTO lbl212
                throw null;
            }
            case 16: {
                do {
                    var18_4 /* !! */  = (int)im.pfo("qen", pfq(int ), (int)310);
                } while (!var19_3);
                throw null;
            }
            case 17: 
        }
        var18_4 /* !! */  = (int)im.pfo("qeo", pfq(int ), (int)311);
        ** while (!var19_3)
lbl257:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void qpu() {
        im.pfs[400] = -365407055;
        im.pfs[401] = 1062863138;
        im.pfs[402] = -832365072;
        im.pfs[403] = 1116371093;
        im.pfs[404] = -1669739457;
        im.pfs[405] = 190733613;
        im.pfs[406] = -460794955;
        im.pfs[407] = 188596462;
        im.pfs[408] = 244398965;
        im.pfs[409] = 1048560693;
        im.pfs[410] = 2003923990;
        im.pfs[411] = -593777494;
        im.pfs[412] = 407459536;
        im.pfs[413] = -2137150273;
        im.pfs[414] = 94756146;
        im.pfs[415] = 1812566537;
        im.pfs[416] = -872947344;
        im.pfs[417] = -172404654;
        im.pfs[418] = -1592355035;
        im.pfs[419] = 587048207;
        im.pfs[420] = 1028746187;
        im.pfs[421] = 545933934;
        im.pfs[422] = -782912404;
        im.pfs[423] = 1714510682;
        im.pfs[424] = -271062181;
        im.pfs[425] = 1927514019;
        im.pfs[426] = -1678560773;
        im.pfs[427] = -311758935;
        im.pfs[428] = 768818646;
        im.pfs[429] = -2019552962;
        im.pfs[430] = 133537175;
        im.pfs[431] = 1354476446;
        im.pfs[432] = 449620387;
        im.pfs[433] = 1353877957;
        im.pfs[434] = -1034063479;
        im.pfs[435] = 545813460;
        im.pfs[436] = -878284887;
        im.pfs[437] = 1344703592;
        im.pfs[438] = 1539371851;
        im.pfs[439] = -1573565212;
        im.pfs[440] = -748317374;
        im.pfs[441] = 559687831;
        im.pfs[442] = 621735384;
        im.pfs[443] = 1521621999;
        im.pfs[444] = -474335282;
        im.pfs[445] = 1815567599;
        im.pfs[446] = -67035139;
        im.pfs[447] = -970372238;
        im.pfs[448] = 182683940;
        im.pfs[449] = -734624963;
        im.pfs[450] = 1479219616;
        im.pfs[451] = -1413933378;
        im.pfs[452] = 2106218319;
        im.pfs[453] = 805227097;
        im.pfs[454] = 797243207;
        im.pfs[455] = -1673494659;
        im.pfs[456] = -876110628;
        im.pfs[457] = 246066760;
        im.pfs[458] = 1715395920;
        im.pfs[459] = 1090807636;
        im.pfs[460] = 592792214;
        im.pfs[461] = 440227995;
        im.pfs[462] = -1612797478;
        im.pfs[463] = -226878305;
        im.pfs[464] = -1423064600;
        im.pfs[465] = -417429776;
        im.pfs[466] = 255977846;
        im.pfs[467] = -261513808;
        im.pfs[468] = -471567292;
        im.pfs[469] = -1191051128;
        im.pfs[470] = 2079585268;
        im.pfs[471] = -1049344930;
        im.pfs[472] = -137215108;
        im.pfs[473] = -226468469;
        im.pfs[474] = 43445718;
        im.pfs[475] = -1283687380;
        im.pfs[476] = -158700554;
        im.pfs[477] = -1101505696;
    }

    private static /* synthetic */ void qqc() {
        im.pfn[200] = 5590894014225073512L;
        im.pfn[201] = -2599558948455056753L;
        im.pfn[202] = 2304093500181441932L;
        im.pfn[203] = 5151175033311957695L;
        im.pfn[204] = 3530056715627873889L;
        im.pfn[205] = -769179102098016317L;
        im.pfn[206] = 2874969765348641136L;
        im.pfn[207] = 3280522280124209997L;
        im.pfn[208] = 3302621504692751478L;
        im.pfn[209] = 6537602873128237748L;
        im.pfn[210] = 6920283610996758808L;
        im.pfn[211] = 1354320756273623988L;
        im.pfn[212] = 5577818021799308439L;
        im.pfn[213] = 6626661189855701880L;
        im.pfn[214] = 6512462277755995058L;
        im.pfn[215] = -7565615777134957721L;
        im.pfn[216] = 7343438461988328321L;
        im.pfn[217] = 8496650049687156568L;
        im.pfn[218] = 2086793796407001037L;
        im.pfn[219] = -7678534960009793042L;
        im.pfn[220] = -7559760447157313662L;
        im.pfn[221] = -3922744809062564407L;
        im.pfn[222] = -1966530649222170230L;
        im.pfn[223] = 5097151883738503475L;
        im.pfn[224] = 6480210300457300793L;
        im.pfn[225] = -5376859413601741128L;
        im.pfn[226] = -2113929797666132406L;
        im.pfn[227] = 8103302567865083866L;
        im.pfn[228] = -8118704737848692096L;
        im.pfn[229] = -2438116411428338006L;
        im.pfn[230] = -4035579318872932301L;
        im.pfn[231] = -2500988693399280761L;
        im.pfn[232] = -7772067064528831722L;
        im.pfn[233] = -2535461482939710261L;
        im.pfn[234] = -2508361075283225328L;
        im.pfn[235] = 4942628223011232204L;
        im.pfn[236] = 2224068367679773739L;
        im.pfn[237] = -694023264326031444L;
        im.pfn[238] = -3439043592357323291L;
        im.pfn[239] = -4362732029150757012L;
        im.pfn[240] = -8591172750498099334L;
        im.pfn[241] = -1742937468494228847L;
        im.pfn[242] = 9152034882636033205L;
        im.pfn[243] = -7448576122115712483L;
        im.pfn[244] = 8652205701449199193L;
        im.pfn[245] = 1827611802010383123L;
        im.pfn[246] = 464340979252401866L;
        im.pfn[247] = 1425838072787515952L;
        im.pfn[248] = 1445733114573544392L;
        im.pfn[249] = -3395132482095977738L;
        im.pfn[250] = -3882161412309814252L;
        im.pfn[251] = 1413497471162281554L;
        im.pfn[252] = 4754661567476286135L;
        im.pfn[253] = 452407260302961463L;
        im.pfn[254] = -5217013561570688804L;
        im.pfn[255] = 4800130040356938038L;
        im.pfn[256] = -6505917261085304470L;
        im.pfn[257] = -8765929430940589714L;
        im.pfn[258] = -7123877473576594923L;
        im.pfn[259] = 712695581048088551L;
        im.pfn[260] = -9047112234521953766L;
        im.pfn[261] = 1539236240274721927L;
        im.pfn[262] = -3022334849727803938L;
        im.pfn[263] = 304359901281833221L;
        im.pfn[264] = -5361596714770645962L;
        im.pfn[265] = 7887325377135599197L;
        im.pfn[266] = -2921583852789811776L;
        im.pfn[267] = 7607344268521732719L;
        im.pfn[268] = 172601274324867619L;
        im.pfn[269] = 7403532075282768138L;
        im.pfn[270] = 5148885099042170435L;
        im.pfn[271] = 262613002550865454L;
        im.pfn[272] = -7174842845740261181L;
        im.pfn[273] = 8437000922006247505L;
        im.pfn[274] = -4351075601137162628L;
        im.pfn[275] = -8318195560939510569L;
        im.pfn[276] = 8483275490966403515L;
        im.pfn[277] = -1146914793017223730L;
        im.pfn[278] = 8810554800788525234L;
        im.pfn[279] = -5270835619320610577L;
        im.pfn[280] = 7865094652938923369L;
        im.pfn[281] = 7909043560266833572L;
        im.pfn[282] = -8916502569783244838L;
        im.pfn[283] = -7332480003375768151L;
        im.pfn[284] = -4114269709011286260L;
        im.pfn[285] = -4623983617963546954L;
        im.pfn[286] = -181681708609631318L;
        im.pfn[287] = -917624690039145686L;
        im.pfn[288] = -402386308818365640L;
        im.pfn[289] = -8339118708026393646L;
        im.pfn[290] = -1280446375454903084L;
        im.pfn[291] = 9204493563184880118L;
        im.pfn[292] = 8510379199767220289L;
        im.pfn[293] = 3184606361918335955L;
        im.pfn[294] = 7260766540022905319L;
        im.pfn[295] = 3919966342081146690L;
        im.pfn[296] = -8579560327440654261L;
        im.pfn[297] = 7714219940560806735L;
        im.pfn[298] = 6473927066531897809L;
        im.pfn[299] = 7759958041206138109L;
    }

    private static /* synthetic */ void qpl() {
        im.pfr[0] = 182827129;
        im.pfr[1] = 822096812;
        im.pfr[2] = 1906202625;
        im.pfr[3] = 738390972;
        im.pfr[4] = 317321482;
        im.pfr[5] = -1893009879;
        im.pfr[6] = 184133462;
        im.pfr[7] = -744420363;
        im.pfr[8] = 1950474677;
        im.pfr[9] = 636372194;
        im.pfr[10] = -492418190;
        im.pfr[11] = -2116430922;
        im.pfr[12] = -957144900;
        im.pfr[13] = -986174169;
        im.pfr[14] = 578967852;
        im.pfr[15] = 1187898796;
        im.pfr[16] = 1366346784;
        im.pfr[17] = -70662914;
        im.pfr[18] = 794126636;
        im.pfr[19] = 850506802;
        im.pfr[20] = 299319821;
        im.pfr[21] = 94971958;
        im.pfr[22] = -850693677;
        im.pfr[23] = -1723319834;
        im.pfr[24] = -1057280957;
        im.pfr[25] = 1323409536;
        im.pfr[26] = -2101552574;
        im.pfr[27] = -30886852;
        im.pfr[28] = -888682304;
        im.pfr[29] = 1026060857;
        im.pfr[30] = -1998685768;
        im.pfr[31] = -502809188;
        im.pfr[32] = -1140798780;
        im.pfr[33] = 1543354994;
        im.pfr[34] = 353794919;
        im.pfr[35] = -468643454;
        im.pfr[36] = -2079241275;
        im.pfr[37] = -1635987088;
        im.pfr[38] = 849466805;
        im.pfr[39] = -333936471;
        im.pfr[40] = 485390358;
        im.pfr[41] = -1826423001;
        im.pfr[42] = -392606855;
        im.pfr[43] = -1677208005;
        im.pfr[44] = 518868842;
        im.pfr[45] = 2053459350;
        im.pfr[46] = -1405939708;
        im.pfr[47] = 2139757162;
        im.pfr[48] = 347507987;
        im.pfr[49] = -732773796;
        im.pfr[50] = 1532245870;
        im.pfr[51] = 87664555;
        im.pfr[52] = 296364474;
        im.pfr[53] = 1611134550;
        im.pfr[54] = 261727398;
        im.pfr[55] = 167884868;
        im.pfr[56] = 2072681380;
        im.pfr[57] = 273817886;
        im.pfr[58] = 1263782470;
        im.pfr[59] = -546130200;
        im.pfr[60] = -262046712;
        im.pfr[61] = -1069155089;
        im.pfr[62] = 11688030;
        im.pfr[63] = 437295427;
        im.pfr[64] = 1051620665;
        im.pfr[65] = 1058695802;
        im.pfr[66] = 1110141216;
        im.pfr[67] = 1777801720;
        im.pfr[68] = -1665209179;
        im.pfr[69] = 631115745;
        im.pfr[70] = -445549402;
        im.pfr[71] = 909236557;
        im.pfr[72] = 1805650045;
        im.pfr[73] = 445645126;
        im.pfr[74] = 1840430569;
        im.pfr[75] = 1196325205;
        im.pfr[76] = 151189318;
        im.pfr[77] = 859189575;
        im.pfr[78] = -1875920262;
        im.pfr[79] = 2088884917;
        im.pfr[80] = 1494685113;
        im.pfr[81] = 25091381;
        im.pfr[82] = -1891643072;
        im.pfr[83] = -25039195;
        im.pfr[84] = -644384905;
        im.pfr[85] = 1811409210;
        im.pfr[86] = 571165204;
        im.pfr[87] = -927866536;
        im.pfr[88] = -1812249787;
        im.pfr[89] = -1998428326;
        im.pfr[90] = -369686630;
        im.pfr[91] = 1051323019;
        im.pfr[92] = 1392120518;
        im.pfr[93] = 828833681;
        im.pfr[94] = 1004736328;
        im.pfr[95] = -49322334;
        im.pfr[96] = -1781532749;
        im.pfr[97] = -770787489;
        im.pfr[98] = -486208605;
        im.pfr[99] = 1886885223;
    }
}

