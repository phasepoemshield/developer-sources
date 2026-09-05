/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  net.minecraft.class_2761
 *  net.minecraft.class_345
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_2761;
import net.minecraft.class_345;
import net.minecraft.class_3532;
import ruhack.phobia.c;
import ruhack.phobia.cr;
import ruhack.phobia.pn;
import ruhack.phobia.pr;

public final class mq
implements c {
    private static long[] gbft;
    public static final boolean a;
    public static boolean pvpEnd;
    private static final pr pvpWatch;
    public static long timestamp;
    private static int[] gbfx;
    private static long[] gbfs;
    public static int anarchy;
    static final long nc = 3441110378748733005L;
    public static final int b;
    public static String server;
    private static int[] gbfy;
    public static float TPS;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String getWorldType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbsy", gbfr(int ), (int)80)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mq.gbfu("gbsz", gbfw(int ), (int)234)) break;
            v0 /* !! */  = (long)mq.gbfu("gbta", gbfw(int ), (int)235);
        }
        var2 = mq.c;
        v1 /* !! */  = mq.nc;
        if (true) ** GOTO lbl11
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - mq.gbfu("gbtb", gbfr(int ), (int)81));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1462679001: {
                    v2 = mq.gbfu("gbtc", gbfr(int ), (int)82);
                    continue block28;
                }
                case -620560778: {
                    v2 = mq.gbfu("gbtd", gbfr(int ), (int)83);
                    continue block28;
                }
                case 1580885581: {
                    break block28;
                }
            }
            break;
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbte", gbfr(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mq.gbfu("gbtf", gbfw(int ), (int)236)) break;
            v3 /* !! */  = (long)mq.gbfu("gbtg", gbfw(int ), (int)237);
        }
        var0_2 = mq.a;
        if (var2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = mq.nc;
                if (true) ** GOTO lbl40
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - mq.gbfu("gbth", gbfr(int ), (int)85));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -808006094: {
                            v5 = mq.gbfu("gbti", gbfr(int ), (int)86);
                            continue block31;
                        }
                        case 327864901: {
                            v5 = mq.gbfu("gbtj", gbfr(int ), (int)87);
                            continue block31;
                        }
                        case 1580885581: {
                            break block31;
                        }
                        case 1830959626: {
                            v5 = mq.gbfu("gbtk", gbfr(int ), (int)88);
                            continue block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = mq.nc;
                if (true) ** GOTO lbl56
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - mq.gbfu("gbtl", gbfr(int ), (int)89));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1606200553: {
                            v7 = mq.gbfu("gbtm", gbfr(int ), (int)90);
                            continue block32;
                        }
                        case -644920791: {
                            v7 = mq.gbfu("gbtn", gbfr(int ), (int)91);
                            continue block32;
                        }
                        case 1580885581: {
                            break block32;
                        }
                    }
                    break;
                }
                v8 = mq.mc.field_1687;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbto", gbfr(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == mq.gbfu("gbtp", gbfw(int ), (int)238)) break;
                    v9 /* !! */  = (long)mq.gbfu("gbtq", gbfw(int ), (int)239);
                }
                v10 = v8.method_27983();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbtr", gbfr(int ), (int)93)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == mq.gbfu("gbts", gbfw(int ), (int)240)) break;
                    v11 /* !! */  = (long)mq.gbfu("gbtt", gbfw(int ), (int)241);
                }
                v12 = v10.method_29177();
                v13 /* !! */  = mq.nc;
                if (true) ** GOTO lbl82
                block35: while (true) {
                    v13 /* !! */  = (long)(v14 - mq.gbfu("gbtu", gbfr(int ), (int)94));
lbl82:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -548433372: {
                            v14 = mq.gbfu("gbtv", gbfr(int ), (int)95);
                            continue block35;
                        }
                        case 327792308: {
                            v14 = mq.gbfu("gbtw", gbfr(int ), (int)96);
                            continue block35;
                        }
                        case 1580885581: {
                            break block35;
                        }
                    }
                    break;
                }
                return v12.method_12832();
            }
            case 0: {
                var1_1 /* !! */  = (int)mq.gbfu("gbtx", gbfw(int ), (int)242);
                if (var2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)mq.gbfu("gbty", gbfw(int ), (int)243);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)mq.gbfu("gbtz", gbfw(int ), (int)244);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbua", gbfw(int ), (int)245);
        ** while (!var2)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getAnarchy() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbyx", gbfr(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mq.gbfu("gbyy", gbfw(int ), (int)318)) break;
            v0 /* !! */  = (long)mq.gbfu("gbyz", gbfw(int ), (int)319);
        }
        var2 = mq.c;
        v1 /* !! */  = mq.nc;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(mq.gbfu("gbzb", gbfr(int ), (int)153) - mq.gbfu("gbza", gbfr(int ), (int)152));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1430500857: {
                    continue block23;
                }
                case 1580885581: {
                    break block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = mq.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mq.nc;
                if (true) ** GOTO lbl25
                block24: while (true) {
                    v2 /* !! */  = (long)(v3 - mq.gbfu("gbzc", gbfr(int ), (int)154));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1674850517: {
                            v3 = mq.gbfu("gbzd", gbfr(int ), (int)155);
                            continue block24;
                        }
                        case -1066555923: {
                            v3 = mq.gbfu("gbze", gbfr(int ), (int)156);
                            continue block24;
                        }
                        case 488664812: {
                            v3 = mq.gbfu("gbzf", gbfr(int ), (int)157);
                            continue block24;
                        }
                        case 1580885581: {
                            break block24;
                        }
                    }
                    break;
                }
                var0_2 = mq.a;
                if (var2) {
                    throw null;
                    return (int)mq.gbfu("gbzg", gbfw(int ), (int)320);
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = mq.nc;
                if (true) ** GOTO lbl47
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - mq.gbfu("gbzh", gbfr(int ), (int)158));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2055356060: {
                            v5 = mq.gbfu("gbzi", gbfr(int ), (int)159);
                            continue block26;
                        }
                        case 174260836: {
                            v5 = mq.gbfu("gbzj", gbfr(int ), (int)160);
                            continue block26;
                        }
                        case 867148218: {
                            v5 = mq.gbfu("gbzk", gbfr(int ), (int)161);
                            continue block26;
                        }
                        case 1580885581: {
                            break block26;
                        }
                    }
                    break;
                }
                return mq.anarchy;
            }
            case 0: {
                var1_1 /* !! */  = (int)mq.gbfu("gbzl", gbfw(int ), (int)321);
                if (!var2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mq.gbfu("gbzm", gbfw(int ), (int)322);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)mq.gbfu("gbzn", gbfw(int ), (int)323);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbzo", gbfw(int ), (int)324);
        ** while (!var2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcez() {
        mq.gbft[0] = -8408264564924679264L;
        mq.gbft[1] = 700876512242051800L;
        mq.gbft[2] = 7827556439462331736L;
        mq.gbft[3] = -699427846601655149L;
        mq.gbft[4] = -6519769390378453607L;
        mq.gbft[5] = 8632460188975399728L;
        mq.gbft[6] = 5211540082720591351L;
        mq.gbft[7] = 4944177788021632333L;
        mq.gbft[8] = 7725570233089636131L;
        mq.gbft[9] = -1816442743020509983L;
        mq.gbft[10] = -8001106121019318174L;
        mq.gbft[11] = 5720393448200995657L;
        mq.gbft[12] = -3692478611319333522L;
        mq.gbft[13] = -7139923652917734574L;
        mq.gbft[14] = -36779242001941919L;
        mq.gbft[15] = 550985902293487513L;
        mq.gbft[16] = 5409803803129376490L;
        mq.gbft[17] = -7050614394855576153L;
        mq.gbft[18] = -4597322550039255614L;
        mq.gbft[19] = -4408281164854251931L;
        mq.gbft[20] = -8876307872935336412L;
        mq.gbft[21] = -1084665955102726982L;
        mq.gbft[22] = -8597782502636120914L;
        mq.gbft[23] = -3914005126650010803L;
        mq.gbft[24] = -5793139570307945421L;
        mq.gbft[25] = -5570409724416235072L;
        mq.gbft[26] = 1888296580000838565L;
        mq.gbft[27] = 2345250573176647236L;
        mq.gbft[28] = -8913098692159451567L;
        mq.gbft[29] = 571064913478427599L;
        mq.gbft[30] = 5772653435131867635L;
        mq.gbft[31] = 893097155312002396L;
        mq.gbft[32] = 2211778922372824250L;
        mq.gbft[33] = 6988269709654041433L;
        mq.gbft[34] = 4957759845288731807L;
        mq.gbft[35] = 1893697228218465160L;
        mq.gbft[36] = -1384430143538115930L;
        mq.gbft[37] = -2935250253428143740L;
        mq.gbft[38] = -5949182607675603706L;
        mq.gbft[39] = 5903675287811013401L;
        mq.gbft[40] = 2951162597059261509L;
        mq.gbft[41] = -737117727632462050L;
        mq.gbft[42] = -8944424117698799687L;
        mq.gbft[43] = -7903265937374496101L;
        mq.gbft[44] = 3223416848354833487L;
        mq.gbft[45] = -5715594919735407133L;
        mq.gbft[46] = -6194799791543229066L;
        mq.gbft[47] = -6761858038874667551L;
        mq.gbft[48] = 117118775273717043L;
        mq.gbft[49] = -5120351610482616229L;
        mq.gbft[50] = 387425558268573384L;
        mq.gbft[51] = -7815030822390430843L;
        mq.gbft[52] = 1165450332662928031L;
        mq.gbft[53] = -7874580948827857595L;
        mq.gbft[54] = -6023273506520896986L;
        mq.gbft[55] = -2311354808217278459L;
        mq.gbft[56] = -162184107028907470L;
        mq.gbft[57] = -8122127227625243401L;
        mq.gbft[58] = -759269230334280334L;
        mq.gbft[59] = 543405759730196466L;
        mq.gbft[60] = -8454562845852648568L;
        mq.gbft[61] = 6791692710619734778L;
        mq.gbft[62] = 3571659451419774012L;
        mq.gbft[63] = 6461502035665287046L;
        mq.gbft[64] = -3352502271425700416L;
        mq.gbft[65] = 8103415360560793294L;
        mq.gbft[66] = -4256112163116661053L;
        mq.gbft[67] = -5494505332247155045L;
        mq.gbft[68] = 4370372091026797593L;
        mq.gbft[69] = -3021818840841962804L;
        mq.gbft[70] = -2060249350108250130L;
        mq.gbft[71] = -2104687322758226695L;
        mq.gbft[72] = -2602863483541660635L;
        mq.gbft[73] = 9213667239013689945L;
        mq.gbft[74] = 745787648522122448L;
        mq.gbft[75] = 2668192462319744243L;
        mq.gbft[76] = -1205266980491641805L;
        mq.gbft[77] = 1823085294918821221L;
        mq.gbft[78] = 4878842326173589169L;
        mq.gbft[79] = -7711475992756430958L;
        mq.gbft[80] = -4202526679047147597L;
        mq.gbft[81] = 5312652697099654351L;
        mq.gbft[82] = 3864093010602460491L;
        mq.gbft[83] = -947022531034056008L;
        mq.gbft[84] = 588781328680678892L;
        mq.gbft[85] = -1966139550869241263L;
        mq.gbft[86] = -3847681515868465913L;
        mq.gbft[87] = 5668313055209969612L;
        mq.gbft[88] = -2665809503628165453L;
        mq.gbft[89] = 5060078920367912578L;
        mq.gbft[90] = -8137904855161547129L;
        mq.gbft[91] = 2918823678930264211L;
        mq.gbft[92] = 3277675939589340440L;
        mq.gbft[93] = -7070823177660023002L;
        mq.gbft[94] = 147494433105332188L;
        mq.gbft[95] = -3066778317678091577L;
        mq.gbft[96] = -4316124725210008747L;
        mq.gbft[97] = 7774881740229539399L;
        mq.gbft[98] = -5071739293030333805L;
        mq.gbft[99] = -3469352644879271734L;
    }

    static {
        gbfx = new int[399];
        gbfy = new int[399];
        mq.gceo();
        mq.gcep();
        mq.gceq();
        mq.gcer();
        mq.gces();
        mq.gcet();
        mq.gceu();
        mq.gcev();
        gbfs = new long[217];
        gbft = new long[217];
        mq.gcew();
        mq.gcex();
        mq.gcey();
        mq.gcez();
        mq.gcfa();
        mq.gcfb();
        pvpWatch = new pr();
        server = "Vanilla";
        TPS = (float)mq.gbfu("gcen", gbia(int ), (int)398);
    }

    private static /* synthetic */ void gcev() {
        mq.gbfy[300] = -2066786626;
        mq.gbfy[301] = -1693847429;
        mq.gbfy[302] = -279438607;
        mq.gbfy[303] = -1225902964;
        mq.gbfy[304] = 1768594088;
        mq.gbfy[305] = -1275434708;
        mq.gbfy[306] = 675521199;
        mq.gbfy[307] = -566888257;
        mq.gbfy[308] = -25160891;
        mq.gbfy[309] = 1349311260;
        mq.gbfy[310] = -586905822;
        mq.gbfy[311] = 1212712568;
        mq.gbfy[312] = -1478392552;
        mq.gbfy[313] = 569296830;
        mq.gbfy[314] = -1636211033;
        mq.gbfy[315] = -798655497;
        mq.gbfy[316] = -276317238;
        mq.gbfy[317] = 1816460541;
        mq.gbfy[318] = 681228209;
        mq.gbfy[319] = 482812806;
        mq.gbfy[320] = 2108407911;
        mq.gbfy[321] = -1990027431;
        mq.gbfy[322] = -564661888;
        mq.gbfy[323] = -714291408;
        mq.gbfy[324] = 805587275;
        mq.gbfy[325] = -929827811;
        mq.gbfy[326] = -1178993124;
        mq.gbfy[327] = 452220328;
        mq.gbfy[328] = -405309179;
        mq.gbfy[329] = -1215504750;
        mq.gbfy[330] = 467333652;
        mq.gbfy[331] = 976370692;
        mq.gbfy[332] = 354828433;
        mq.gbfy[333] = 282880602;
        mq.gbfy[334] = -807866674;
        mq.gbfy[335] = -2004863295;
        mq.gbfy[336] = 55588602;
        mq.gbfy[337] = -2094256255;
        mq.gbfy[338] = 1432487403;
        mq.gbfy[339] = -435575296;
        mq.gbfy[340] = 2088299759;
        mq.gbfy[341] = -643067975;
        mq.gbfy[342] = -1444872703;
        mq.gbfy[343] = -1567031287;
        mq.gbfy[344] = 105524102;
        mq.gbfy[345] = -653458357;
        mq.gbfy[346] = -166698393;
        mq.gbfy[347] = -1501014138;
        mq.gbfy[348] = -1944437545;
        mq.gbfy[349] = -1996924962;
        mq.gbfy[350] = -878075787;
        mq.gbfy[351] = -1373577;
        mq.gbfy[352] = -1526981894;
        mq.gbfy[353] = -30388437;
        mq.gbfy[354] = 1866188732;
        mq.gbfy[355] = -188907111;
        mq.gbfy[356] = 1588613944;
        mq.gbfy[357] = -785266922;
        mq.gbfy[358] = -28760246;
        mq.gbfy[359] = 445625727;
        mq.gbfy[360] = 626114623;
        mq.gbfy[361] = 878243730;
        mq.gbfy[362] = -2054581587;
        mq.gbfy[363] = 858437849;
        mq.gbfy[364] = 1085151748;
        mq.gbfy[365] = 1491610320;
        mq.gbfy[366] = -1265468070;
        mq.gbfy[367] = -898448940;
        mq.gbfy[368] = -202806157;
        mq.gbfy[369] = 1382850960;
        mq.gbfy[370] = 1566027299;
        mq.gbfy[371] = -955657948;
        mq.gbfy[372] = -169499851;
        mq.gbfy[373] = 657386477;
        mq.gbfy[374] = -542825354;
        mq.gbfy[375] = 441118518;
        mq.gbfy[376] = 1777795003;
        mq.gbfy[377] = 1158148368;
        mq.gbfy[378] = 1155504811;
        mq.gbfy[379] = 325121148;
        mq.gbfy[380] = -1163106892;
        mq.gbfy[381] = -1305895114;
        mq.gbfy[382] = 746687830;
        mq.gbfy[383] = -631164379;
        mq.gbfy[384] = 41316818;
        mq.gbfy[385] = -827664942;
        mq.gbfy[386] = -839136948;
        mq.gbfy[387] = -1816304323;
        mq.gbfy[388] = -605576683;
        mq.gbfy[389] = 49336430;
        mq.gbfy[390] = -2054720181;
        mq.gbfy[391] = -1287595567;
        mq.gbfy[392] = 1472131121;
        mq.gbfy[393] = 2045071076;
        mq.gbfy[394] = -89397228;
        mq.gbfy[395] = 1255701285;
        mq.gbfy[396] = -1942574275;
        mq.gbfy[397] = 1388762493;
        mq.gbfy[398] = -1178003086;
    }

    private static /* synthetic */ void gcfa() {
        mq.gbft[100] = -5624299147870428739L;
        mq.gbft[101] = -4435545601861385746L;
        mq.gbft[102] = 6855324452364028181L;
        mq.gbft[103] = 8851212087967564612L;
        mq.gbft[104] = -8821430024006839986L;
        mq.gbft[105] = -3693883680762151064L;
        mq.gbft[106] = -1347995220670669276L;
        mq.gbft[107] = -3882513451543496896L;
        mq.gbft[108] = 8382119862987269719L;
        mq.gbft[109] = 1735860873181999896L;
        mq.gbft[110] = 6560463242550657800L;
        mq.gbft[111] = -6905233710874635659L;
        mq.gbft[112] = -3300729434325331315L;
        mq.gbft[113] = 6662441211795677470L;
        mq.gbft[114] = 7888273715434499846L;
        mq.gbft[115] = 584988574165197547L;
        mq.gbft[116] = -1131094345218063074L;
        mq.gbft[117] = -6483070437468218743L;
        mq.gbft[118] = -5845504035432548340L;
        mq.gbft[119] = -5625428721508864522L;
        mq.gbft[120] = 3576736243475780315L;
        mq.gbft[121] = 6111830124455704617L;
        mq.gbft[122] = 1895945346853911627L;
        mq.gbft[123] = -2311684936710481696L;
        mq.gbft[124] = 5038386840492663859L;
        mq.gbft[125] = 5904977460457716605L;
        mq.gbft[126] = -3658742156576936375L;
        mq.gbft[127] = 5084988230825801998L;
        mq.gbft[128] = -642296533821986529L;
        mq.gbft[129] = 7721485325817516386L;
        mq.gbft[130] = 8573819863569420015L;
        mq.gbft[131] = 833745818231842518L;
        mq.gbft[132] = 3491602570698276955L;
        mq.gbft[133] = -1271538298397716149L;
        mq.gbft[134] = -5757549867014039018L;
        mq.gbft[135] = -721252221207198071L;
        mq.gbft[136] = -7337587440089039593L;
        mq.gbft[137] = -7388395567436376258L;
        mq.gbft[138] = -5999749680826601375L;
        mq.gbft[139] = 3664987723050457056L;
        mq.gbft[140] = -6666718639246929100L;
        mq.gbft[141] = -3832412859213412727L;
        mq.gbft[142] = -641344466140546240L;
        mq.gbft[143] = -5825366309694901841L;
        mq.gbft[144] = -4968436043448554016L;
        mq.gbft[145] = -7034120693946696780L;
        mq.gbft[146] = -3473558502753156902L;
        mq.gbft[147] = -8463799474948706655L;
        mq.gbft[148] = -8988460344727886846L;
        mq.gbft[149] = 3173887356023189921L;
        mq.gbft[150] = 3705028674888783855L;
        mq.gbft[151] = 7989228041663944836L;
        mq.gbft[152] = 2893957973164503059L;
        mq.gbft[153] = -6673454967965538590L;
        mq.gbft[154] = -1016682594131957664L;
        mq.gbft[155] = -821514648302148340L;
        mq.gbft[156] = 3405686931361506136L;
        mq.gbft[157] = 836441278584142200L;
        mq.gbft[158] = 3154749238450372235L;
        mq.gbft[159] = 7983461941574954178L;
        mq.gbft[160] = 6312788785322706399L;
        mq.gbft[161] = 5780513155956876745L;
        mq.gbft[162] = 5181634867501389326L;
        mq.gbft[163] = -3538527803123197187L;
        mq.gbft[164] = -6740558988409222486L;
        mq.gbft[165] = 1579467599197445371L;
        mq.gbft[166] = -8425802366657261649L;
        mq.gbft[167] = 4477539640086896478L;
        mq.gbft[168] = -3308329923204621596L;
        mq.gbft[169] = -3128327502707471970L;
        mq.gbft[170] = -1359955907251084044L;
        mq.gbft[171] = -992875490945038373L;
        mq.gbft[172] = -446318121976216476L;
        mq.gbft[173] = -2866643829771269112L;
        mq.gbft[174] = -1111348440055117615L;
        mq.gbft[175] = -8719595479200051147L;
        mq.gbft[176] = 266078581371966246L;
        mq.gbft[177] = -5754639406646875038L;
        mq.gbft[178] = 1228598642817699548L;
        mq.gbft[179] = 8720409342182188102L;
        mq.gbft[180] = -1747512169601677661L;
        mq.gbft[181] = -6034824310689603817L;
        mq.gbft[182] = 5079949834476483035L;
        mq.gbft[183] = -497451687382825688L;
        mq.gbft[184] = 2535352563205268751L;
        mq.gbft[185] = -3248089043822089798L;
        mq.gbft[186] = -7747935598801316007L;
        mq.gbft[187] = 2157642015065901521L;
        mq.gbft[188] = 8030047235529314299L;
        mq.gbft[189] = -2024245999466647223L;
        mq.gbft[190] = 1362328896159869441L;
        mq.gbft[191] = 6031930049568953523L;
        mq.gbft[192] = -3660887413991740065L;
        mq.gbft[193] = -6518397122507754267L;
        mq.gbft[194] = -3051358690568781900L;
        mq.gbft[195] = -7950893149942757513L;
        mq.gbft[196] = -7527241405510148662L;
        mq.gbft[197] = 2464144410347049060L;
        mq.gbft[198] = -6400721463248094208L;
        mq.gbft[199] = 3018184594365253619L;
    }

    private static /* synthetic */ void gcey() {
        mq.gbfs[200] = -3374455339571191254L;
        mq.gbfs[201] = 2514075627683299644L;
        mq.gbfs[202] = -5265167834108458674L;
        mq.gbfs[203] = -4460644742400254924L;
        mq.gbfs[204] = -6723971012800199001L;
        mq.gbfs[205] = -6886792399349414790L;
        mq.gbfs[206] = -5016218527670606708L;
        mq.gbfs[207] = -1605730812963738714L;
        mq.gbfs[208] = 5864765818148086971L;
        mq.gbfs[209] = 1026133554040074698L;
        mq.gbfs[210] = -689548089885383632L;
        mq.gbfs[211] = 4754529977722835452L;
        mq.gbfs[212] = 5727756530674257678L;
        mq.gbfs[213] = 1274003858728308517L;
        mq.gbfs[214] = 7843635570309181767L;
        mq.gbfs[215] = 1046511897562035849L;
        mq.gbfs[216] = -5199085271606303389L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isFunTime() {
        v0 /* !! */  = mq.nc;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(mq.gbfu("gbvu", gbfr(int ), (int)115) - mq.gbfu("gbvt", gbfr(int ), (int)114));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -918724560: {
                    continue block10;
                }
                case 1580885581: {
                    break block10;
                }
            }
            break;
        }
        var2 = mq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbvv", gbfr(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mq.gbfu("gbvw", gbfw(int ), (int)273)) break;
            v1 /* !! */  = (long)mq.gbfu("gbvx", gbfw(int ), (int)274);
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbvy", gbfr(int ), (int)117)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mq.gbfu("gbvz", gbfw(int ), (int)275)) break;
            v2 /* !! */  = (long)mq.gbfu("gbwa", gbfw(int ), (int)276);
        }
        var0_2 = mq.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return (boolean)mq.gbfu("gbwb", gbfw(int ), (int)277);
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbwc", gbfr(int ), (int)118)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mq.gbfu("gbwd", gbfw(int ), (int)278)) break;
                    v3 /* !! */  = (long)mq.gbfu("gbwe", gbfw(int ), (int)279);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbwf", gbfr(int ), (int)119)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mq.gbfu("gbwg", gbfw(int ), (int)280)) break;
                    v4 /* !! */  = (long)mq.gbfu("gbwh", gbfw(int ), (int)281);
                }
                return mq.server.equals("FunTime");
            }
            case 0: {
                var1_1 /* !! */  = (int)mq.gbfu("gbwi", gbfw(int ), (int)282);
                if (!var2) break;
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)mq.gbfu("gbwj", gbfw(int ), (int)283);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mq.gbfu("gbwk", gbfw(int ), (int)284);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbwl", gbfw(int ), (int)285);
        ** while (!var2)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isVanilla() {
        v0 /* !! */  = mq.nc;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - mq.gbfu("gbxy", gbfr(int ), (int)136));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1241160414: {
                    v1 = mq.gbfu("gbxz", gbfr(int ), (int)137);
                    continue block28;
                }
                case 427101358: {
                    v1 = mq.gbfu("gbya", gbfr(int ), (int)138);
                    continue block28;
                }
                case 1072392587: {
                    v1 = mq.gbfu("gbyb", gbfr(int ), (int)139);
                    continue block28;
                }
                case 1580885581: {
                    break block28;
                }
            }
            break;
        }
        var2 = mq.c;
        v2 /* !! */  = mq.nc;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - mq.gbfu("gbyc", gbfr(int ), (int)140));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1893142393: {
                    v3 = mq.gbfu("gbyd", gbfr(int ), (int)141);
                    continue block29;
                }
                case -728262500: {
                    v3 = mq.gbfu("gbye", gbfr(int ), (int)142);
                    continue block29;
                }
                case 1580885581: {
                    break block29;
                }
                case 1679107851: {
                    v3 = mq.gbfu("gbyf", gbfr(int ), (int)143);
                    continue block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbyg", gbfr(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mq.gbfu("gbyh", gbfw(int ), (int)308)) {
                var0_2 = mq.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)mq.gbfu("gbyi", gbfw(int ), (int)309);
        }
        if (var0_2 != false) return (boolean)mq.gbfu("gbyj", gbfw(int ), (int)310);
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 != false) return (boolean)mq.gbfu("gbyj", gbfw(int ), (int)310);
                v5 /* !! */  = mq.nc;
                block31: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case -1247575342: {
                            v6 = mq.gbfu("gbyl", gbfr(int ), (int)146);
                            ** GOTO lbl63
                        }
                        case 50545148: {
                            v6 = mq.gbfu("gbym", gbfr(int ), (int)147);
                            ** GOTO lbl63
                        }
                        case 1580885581: {
                            break block31;
                        }
                        case 1678707396: {
                            v6 = mq.gbfu("gbyn", gbfr(int ), (int)148);
lbl63:
                            // 3 sources

                            v5 /* !! */  = (long)(v6 - mq.gbfu("gbyk", gbfr(int ), (int)145));
                            continue block31;
                        }
                    }
                    break;
                }
                v7 /* !! */  = mq.nc;
                block32: while (true) {
                    switch ((int)v7 /* !! */ ) {
                        case 1225181154: {
                            v7 /* !! */  = (long)(mq.gbfu("gbyp", gbfr(int ), (int)150) - mq.gbfu("gbyo", gbfr(int ), (int)149));
                            continue block32;
                        }
                        case 1580885581: {
                            return mq.server.equals("Vanilla");
                        }
                    }
                    break;
                }
                return mq.server.equals("Vanilla");
            }
            case 0: {
                ** GOTO lbl85
            }
            case 2: {
                var1_1 /* !! */  = (int)mq.gbfu("gbys", gbfw(int ), (int)313);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl-1000
            }
            case 3: lbl-1000:
            // 2 sources

            {
                var1_1 /* !! */  = (int)mq.gbfu("gbyt", gbfw(int ), (int)314);
                if (var2) {
                    throw null;
                }
lbl85:
                // 3 sources

                var1_1 /* !! */  = (int)mq.gbfu("gbyq", gbfw(int ), (int)311);
                if (var2) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var1_1 /* !! */  = (int)mq.gbfu("gbyr", gbfw(int ), (int)312);
        } while (!var2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isPvpEnd() {
        block26: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbzp", gbfr(int ), (int)162)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == mq.gbfu("gbzq", gbfw(int ), (int)325)) break;
                v0 /* !! */  = (long)mq.gbfu("gbzr", gbfw(int ), (int)326);
            }
            var2 = mq.c;
            while (true) {
                block27: {
                    if ((v1 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbzs", gbfr(int ), (int)163)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != mq.gbfu("gbzt", gbfw(int ), (int)327)) break block27;
                    var1_1 /* !! */  = mq.b;
                    if (var1_1 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v1 /* !! */  = (long)mq.gbfu("gbzu", gbfw(int ), (int)328);
            }
            cfr_temp_0 = -2147483648;
            block18: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v2 /* !! */  = mq.nc;
                        block19: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case -2082149871: {
                                    v3 = mq.gbfu("gbzw", gbfr(int ), (int)165);
                                    ** GOTO lbl29
                                }
                                case 382821808: {
                                    v3 = mq.gbfu("gbzx", gbfr(int ), (int)166);
lbl29:
                                    // 2 sources

                                    v2 /* !! */  = (long)(v3 - mq.gbfu("gbzv", gbfr(int ), (int)164));
                                    continue block19;
                                }
                                case 1580885581: {
                                    break block19;
                                }
                            }
                            break;
                        }
                        var0_2 = mq.a;
                        if (var2) {
                            throw null;
                        }
                        if (var0_2 != false) return (boolean)mq.gbfu("gbzy", gbfw(int ), (int)329);
                        if (var0_2 != false) return (boolean)mq.gbfu("gbzy", gbfw(int ), (int)329);
                        v4 /* !! */  = mq.nc;
                        block20: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1267461136: {
                                    v5 = mq.gbfu("gcaa", gbfr(int ), (int)168);
                                    ** GOTO lbl46
                                }
                                case -224204217: {
                                    v5 = mq.gbfu("gcab", gbfr(int ), (int)169);
lbl46:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - mq.gbfu("gbzz", gbfr(int ), (int)167));
                                    continue block20;
                                }
                                case 1580885581: {
                                    return mq.pvpEnd;
                                }
                            }
                            break;
                        }
                        return mq.pvpEnd;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)mq.gbfu("gcac", gbfw(int ), (int)330);
                        if (var2) {
                            throw null;
                        }
                        break block26;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block26;
                    }
lbl60:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)mq.gbfu("gcad", gbfw(int ), (int)331);
                        cfr_temp_0 = 2;
                        if (!var2) continue block18;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)mq.gbfu("gcae", gbfw(int ), (int)332);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)mq.gbfu("gcaf", gbfw(int ), (int)333);
        ** while (!var2)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void tick() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbfv", gbfr(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mq.gbfu("gbfz", gbfw(int ), (int)0)) break;
            v0 /* !! */  = (long)mq.gbfu("gbga", gbfw(int ), (int)1);
        }
        var2 = mq.c;
        v1 /* !! */  = mq.nc;
        block45: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 1580885581: {
                    break block45;
                }
                case 1879541637: {
                    v1 /* !! */  = (long)(mq.gbfu("gbgd", gbfr(int ), (int)2) - mq.gbfu("gbgc", gbfr(int ), (int)1));
                    continue block45;
                }
            }
            break;
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbge", gbfr(int ), (int)3)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mq.gbfu("gbgf", gbfw(int ), (int)2)) {
                var0_2 = mq.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)mq.gbfu("gbgg", gbfw(int ), (int)3);
        }
        if (var0_2 || var0_2) return;
        v3 /* !! */  = mq.nc;
        if (true) ** GOTO lbl30
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - mq.gbfu("gbgh", gbfr(int ), (int)4));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -893263113: {
                    v4 = mq.gbfu("gbgi", gbfr(int ), (int)5);
                    continue block47;
                }
                case -855922484: {
                    v4 = mq.gbfu("gbgj", gbfr(int ), (int)6);
                    continue block47;
                }
                case 983937309: {
                    v4 = mq.gbfu("gbgk", gbfr(int ), (int)7);
                    continue block47;
                }
                case 1580885581: {
                    break block47;
                }
            }
            break;
        }
        v5 = mq.getAnarchyMode();
        v6 /* !! */  = mq.nc;
        block48: while (true) {
            switch ((int)v6 /* !! */ ) {
                case 1263432598: {
                    v6 /* !! */  = (long)(mq.gbfu("gbgm", gbfr(int ), (int)9) - mq.gbfu("gbgl", gbfr(int ), (int)8));
                    continue block48;
                }
                case 1580885581: {
                    break block48;
                }
            }
            break;
        }
        mq.anarchy = v5;
        if (var0_2 || var0_2) return;
        v7 /* !! */  = mq.nc;
        block49: while (true) {
            switch ((int)v7 /* !! */ ) {
                case 1580885581: {
                    break block49;
                }
                case 2103118052: {
                    v7 /* !! */  = (long)(mq.gbfu("gbgo", gbfr(int ), (int)11) - mq.gbfu("gbgn", gbfr(int ), (int)10));
                    continue block49;
                }
            }
            break;
        }
        v8 = mq.getServer();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbgp", gbfr(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == mq.gbfu("gbgq", gbfw(int ), (int)4)) {
                mq.server = v8;
                if (var0_2) return;
                break;
            }
            v9 /* !! */  = (long)mq.gbfu("gbgr", gbfw(int ), (int)5);
        }
        if (var0_2) return;
        v10 /* !! */  = mq.nc;
        if (true) ** GOTO lbl75
        block51: while (true) {
            v10 /* !! */  = (long)(v11 - mq.gbfu("gbgs", gbfr(int ), (int)13));
lbl75:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1230463374: {
                    v11 = mq.gbfu("gbgt", gbfr(int ), (int)14);
                    continue block51;
                }
                case -1122691094: {
                    v11 = mq.gbfu("gbgu", gbfr(int ), (int)15);
                    continue block51;
                }
                case 1580885581: {
                    break block51;
                }
            }
            break;
        }
        v12 = mq.inPvpEnd();
        v13 /* !! */  = mq.nc;
        if (true) ** GOTO lbl89
        block52: while (true) {
            v13 /* !! */  = (long)(v14 - mq.gbfu("gbgv", gbfr(int ), (int)16));
lbl89:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1849576212: {
                    v14 = mq.gbfu("gbgx", gbfr(int ), (int)17);
                    continue block52;
                }
                case -1461701986: {
                    v14 = mq.gbfu("gbgy", gbfr(int ), (int)18);
                    continue block52;
                }
                case 1580885581: {
                    break block52;
                }
            }
            break;
        }
        mq.pvpEnd = v12;
        if (var0_2 || var0_2) return;
        while (true) {
            block80: {
                if ((v15 /* !! */  = (cfr_temp_4 = mq.nc - mq.gbfu("gbgz", gbfr(int ), (int)19)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  != mq.gbfu("gbha", gbfw(int ), (int)6)) break block80;
                if (mq.inPvp()) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v15 /* !! */  = (long)mq.gbfu("gbhb", gbfw(int ), (int)7);
        }
        if (var0_2) return;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = mq.nc - mq.gbfu("gbhc", gbfr(int ), (int)20)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == mq.gbfu("gbhd", gbfw(int ), (int)8)) break;
            v16 /* !! */  = (long)mq.gbfu("gbhe", gbfw(int ), (int)9);
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_6 = mq.nc - mq.gbfu("gbhf", gbfr(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == mq.gbfu("gbhg", gbfw(int ), (int)10)) {
                mq.pvpWatch.reset();
                if (var0_2) return;
                break;
            }
            v17 /* !! */  = (long)mq.gbfu("gbhh", gbfw(int ), (int)11);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block56: while (true) {
            block81: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 3 sources

                    {
                        if (!var0_2 && !var0_2) return;
                        return;
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhl", gbfw(int ), (int)14);
                        cfr_temp_0 = 5;
                        if (var2) {
                            throw null;
                        }
                        break block81;
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhm", gbfw(int ), (int)15);
                        cfr_temp_0 = 11;
                        if (var2) {
                            throw null;
                        }
                        break block81;
                    }
                    case 4: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhn", gbfw(int ), (int)16);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhj", gbfw(int ), (int)13);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhq", gbfw(int ), (int)19);
                        if (!var2) ** break;
                        throw null;
                    }
                    case 8: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhr", gbfw(int ), (int)20);
                        cfr_temp_0 = 10;
                        if (var2) {
                            throw null;
                        }
                        break block81;
                    }
                    case 9: {
                        do {
                            var1_1 /* !! */  = (int)mq.gbfu("gbhs", gbfw(int ), (int)21);
                        } while (!var2);
                        throw null;
                    }
                    case 10: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbht", gbfw(int ), (int)22);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbho", gbfw(int ), (int)17);
                        cfr_temp_0 = 0;
                        if (var2) {
                            throw null;
                        }
                        break block81;
                    }
                    case 13: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhw", gbfw(int ), (int)25);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhi", gbfw(int ), (int)12);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhp", gbfw(int ), (int)18);
                        cfr_temp_0 = 0;
                        if (var2) {
                            throw null;
                        }
                        break block81;
                    }
                    case 11: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)mq.gbfu("gbhu", gbfw(int ), (int)23);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 12: 
                }
                ** GOTO lbl199
            }
            do {
                if (true) continue block56;
lbl199:
                // 2 sources

                var1_1 /* !! */  = (int)mq.gbfu("gbhv", gbfw(int ), (int)24);
                cfr_temp_0 = 11;
            } while (!var2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ long gbfr(int n2) {
        return gbfs[n2] ^ gbft[n2];
    }

    private static /* synthetic */ void gceq() {
        mq.gbfx[200] = -294405548;
        mq.gbfx[201] = 954534158;
        mq.gbfx[202] = 774790108;
        mq.gbfx[203] = 2961401;
        mq.gbfx[204] = 1702018759;
        mq.gbfx[205] = -1685330533;
        mq.gbfx[206] = -2116617866;
        mq.gbfx[207] = 582400842;
        mq.gbfx[208] = 476790336;
        mq.gbfx[209] = -1878139843;
        mq.gbfx[210] = -312313940;
        mq.gbfx[211] = -1143995507;
        mq.gbfx[212] = 868058871;
        mq.gbfx[213] = -1594183258;
        mq.gbfx[214] = -1790400695;
        mq.gbfx[215] = 339326448;
        mq.gbfx[216] = -1830194639;
        mq.gbfx[217] = -332244402;
        mq.gbfx[218] = -1661789409;
        mq.gbfx[219] = -1805078368;
        mq.gbfx[220] = -15109934;
        mq.gbfx[221] = -1245685241;
        mq.gbfx[222] = 1010064943;
        mq.gbfx[223] = 1098238483;
        mq.gbfx[224] = -1299814499;
        mq.gbfx[225] = -940808015;
        mq.gbfx[226] = -847472126;
        mq.gbfx[227] = 918254415;
        mq.gbfx[228] = -875684518;
        mq.gbfx[229] = 995732190;
        mq.gbfx[230] = -1578163510;
        mq.gbfx[231] = 1245832799;
        mq.gbfx[232] = 1431926723;
        mq.gbfx[233] = -1067906768;
        mq.gbfx[234] = 227803158;
        mq.gbfx[235] = 575316163;
        mq.gbfx[236] = -409075537;
        mq.gbfx[237] = -1504507044;
        mq.gbfx[238] = 1365025768;
        mq.gbfx[239] = -1491938762;
        mq.gbfx[240] = -462722600;
        mq.gbfx[241] = 1402995026;
        mq.gbfx[242] = 1679856142;
        mq.gbfx[243] = -245713154;
        mq.gbfx[244] = 204364382;
        mq.gbfx[245] = -1694792351;
        mq.gbfx[246] = -115268146;
        mq.gbfx[247] = -1594451978;
        mq.gbfx[248] = -558774244;
        mq.gbfx[249] = -1101164610;
        mq.gbfx[250] = 822298606;
        mq.gbfx[251] = 982686698;
        mq.gbfx[252] = -1104391894;
        mq.gbfx[253] = -2138768283;
        mq.gbfx[254] = 747559671;
        mq.gbfx[255] = 359118392;
        mq.gbfx[256] = 1543480279;
        mq.gbfx[257] = 2040226720;
        mq.gbfx[258] = -307990994;
        mq.gbfx[259] = -1713773411;
        mq.gbfx[260] = -1770808337;
        mq.gbfx[261] = 969167304;
        mq.gbfx[262] = 123827102;
        mq.gbfx[263] = -525566773;
        mq.gbfx[264] = 908962732;
        mq.gbfx[265] = 1826482741;
        mq.gbfx[266] = -714743658;
        mq.gbfx[267] = 1292904849;
        mq.gbfx[268] = -1802323999;
        mq.gbfx[269] = -117785090;
        mq.gbfx[270] = -1385127398;
        mq.gbfx[271] = -156170162;
        mq.gbfx[272] = 121107791;
        mq.gbfx[273] = 1104953596;
        mq.gbfx[274] = 595972811;
        mq.gbfx[275] = -1100678244;
        mq.gbfx[276] = 442245083;
        mq.gbfx[277] = -1502700834;
        mq.gbfx[278] = -1220880345;
        mq.gbfx[279] = 1360332681;
        mq.gbfx[280] = 825502913;
        mq.gbfx[281] = -387279726;
        mq.gbfx[282] = 547798461;
        mq.gbfx[283] = -1328980850;
        mq.gbfx[284] = 103572840;
        mq.gbfx[285] = -373472743;
        mq.gbfx[286] = -753809283;
        mq.gbfx[287] = 1901988028;
        mq.gbfx[288] = 1579722760;
        mq.gbfx[289] = 166708152;
        mq.gbfx[290] = 1357551370;
        mq.gbfx[291] = -370337745;
        mq.gbfx[292] = 759186953;
        mq.gbfx[293] = -1508309143;
        mq.gbfx[294] = -543931639;
        mq.gbfx[295] = 1100082991;
        mq.gbfx[296] = -2128707957;
        mq.gbfx[297] = -302291378;
        mq.gbfx[298] = -1662608394;
        mq.gbfx[299] = -1889229603;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isHolyWorld() {
        v0 /* !! */  = mq.nc;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(mq.gbfu("gbxh", gbfr(int ), (int)130) - mq.gbfu("gbxg", gbfr(int ), (int)129));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1008565575: {
                    continue block14;
                }
                case 1580885581: {
                    break block14;
                }
            }
            break;
        }
        var2 = mq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbxi", gbfr(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mq.gbfu("gbxj", gbfw(int ), (int)297)) break;
            v1 /* !! */  = (long)mq.gbfu("gbxk", gbfw(int ), (int)298);
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbxl", gbfr(int ), (int)132)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mq.gbfu("gbxm", gbfw(int ), (int)299)) break;
            v2 /* !! */  = (long)mq.gbfu("gbxn", gbfw(int ), (int)300);
        }
        var0_2 = mq.a;
        if (!var2) ** GOTO lbl31
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)mq.gbfu("gbxo", gbfw(int ), (int)301);
                }
lbl31:
                // 1 sources

                if (var0_2 || var0_2) continue block17;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbxp", gbfr(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mq.gbfu("gbxq", gbfw(int ), (int)302)) break;
                    v3 /* !! */  = (long)mq.gbfu("gbxr", gbfw(int ), (int)303);
                }
                v4 /* !! */  = mq.nc;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(mq.gbfu("gbxt", gbfr(int ), (int)135) - mq.gbfu("gbxs", gbfr(int ), (int)134));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -894550026: {
                            continue block19;
                        }
                        case 1580885581: {
                            break block19;
                        }
                    }
                    break;
                }
                return mq.server.equals("HolyWorld");
lbl48:
                // 3 sources

                case 0: {
                    var1_1 /* !! */  = (int)mq.gbfu("gbxu", gbfw(int ), (int)304);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: {
                    var1_1 /* !! */  = (int)mq.gbfu("gbxv", gbfw(int ), (int)305);
                    if (!var2) ** GOTO lbl48
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 /* !! */  = (int)mq.gbfu("gbxw", gbfw(int ), (int)306);
                        if (!var2) ** GOTO lbl48
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbxx", gbfw(int ), (int)307);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int gbfw(int n2) {
        return gbfx[n2] ^ gbfy[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private mq() {
        int n2 = b;
        boolean bl2 = a;
        if (n2 == 0) throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
        switch (n2) {
            default: {
                throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
            }
            case 1: {
                CallSite callSite = mq.gbfu("gbyv", gbfw(int ), (int)316);
            }
            case 0: {
                while (true) {
                    CallSite callSite = mq.gbfu("gbyu", gbfw(int ), (int)315);
                }
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = mq.gbfu("gbyw", gbfw(int ), (int)317);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean inPvp() {
        v0 /* !! */  = mq.nc;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - mq.gbfu("gbpn", gbfr(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -528524251: {
                    v1 = mq.gbfu("gbpo", gbfr(int ), (int)35);
                    continue block38;
                }
                case 498897021: {
                    v1 = mq.gbfu("gbpp", gbfr(int ), (int)36);
                    continue block38;
                }
                case 1217980225: {
                    v1 = mq.gbfu("gbpq", gbfr(int ), (int)37);
                    continue block38;
                }
                case 1580885581: {
                    break block38;
                }
            }
            break;
        }
        var2 = mq.c;
        v2 /* !! */  = mq.nc;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(mq.gbfu("gbps", gbfr(int ), (int)39) - mq.gbfu("gbpr", gbfr(int ), (int)38));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -520786112: {
                    continue block39;
                }
                case 1580885581: {
                    break block39;
                }
            }
            break;
        }
        var1_1 /* !! */  = mq.b;
        v3 /* !! */  = mq.nc;
        if (true) ** GOTO lbl32
        block40: while (true) {
            v3 /* !! */  = (long)(v4 - mq.gbfu("gbpu", gbfr(int ), (int)40));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 145393695: {
                    v4 = mq.gbfu("gbpv", gbfr(int ), (int)41);
                    continue block40;
                }
                case 411325817: {
                    v4 = mq.gbfu("gbpw", gbfr(int ), (int)42);
                    continue block40;
                }
                case 1580885581: {
                    break block40;
                }
            }
            break;
        }
        var0_2 = mq.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return (boolean)mq.gbfu("gbpx", gbfw(int ), (int)196);
        }
        if (var0_2) ** GOTO lbl44
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbpy", gbfr(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mq.gbfu("gbpz", gbfw(int ), (int)197)) break;
                    v5 /* !! */  = (long)mq.gbfu("gbqa", gbfw(int ), (int)198);
                }
                v6 /* !! */  = mq.nc;
                if (true) ** GOTO lbl60
                block43: while (true) {
                    v6 /* !! */  = (long)(v7 - mq.gbfu("gbqb", gbfr(int ), (int)44));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -538395360: {
                            v7 = mq.gbfu("gbqc", gbfr(int ), (int)45);
                            continue block43;
                        }
                        case 146423754: {
                            v7 = mq.gbfu("gbqd", gbfr(int ), (int)46);
                            continue block43;
                        }
                        case 1580885581: {
                            break block43;
                        }
                    }
                    break;
                }
                v8 = mq.mc.field_1705;
                v9 /* !! */  = mq.nc;
                if (true) ** GOTO lbl74
                block44: while (true) {
                    v9 /* !! */  = (long)(mq.gbfu("gbqf", gbfr(int ), (int)48) - mq.gbfu("gbqe", gbfr(int ), (int)47));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1118275289: {
                            continue block44;
                        }
                        case 1580885581: {
                            break block44;
                        }
                    }
                    break;
                }
                v10 = v8.method_1740();
                v11 /* !! */  = mq.nc;
                if (true) ** GOTO lbl84
                block45: while (true) {
                    v11 /* !! */  = (long)(mq.gbfu("gbqh", gbfr(int ), (int)50) - mq.gbfu("gbqg", gbfr(int ), (int)49));
lbl84:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1434450603: {
                            continue block45;
                        }
                        case 1580885581: {
                            break block45;
                        }
                    }
                    break;
                }
                v12 = v10.field_2060;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbqi", gbfr(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == mq.gbfu("gbqj", gbfw(int ), (int)199)) break;
                    v13 /* !! */  = (long)mq.gbfu("gbqk", gbfw(int ), (int)200);
                }
                v14 = v12.values();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbql", gbfr(int ), (int)52)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == mq.gbfu("gbqm", gbfw(int ), (int)201)) break;
                    v15 /* !! */  = (long)mq.gbfu("gbqn", gbfw(int ), (int)202);
                }
                v16 = v14.stream();
                v17 /* !! */  = mq.nc;
                if (true) ** GOTO lbl106
                block48: while (true) {
                    v17 /* !! */  = (long)(mq.gbfu("gbqq", gbfr(int ), (int)54) - mq.gbfu("gbqo", gbfr(int ), (int)53));
lbl106:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 1006487133: {
                            continue block48;
                        }
                        case 1580885581: {
                            break block48;
                        }
                    }
                    break;
                }
                v18 = (Function<class_345, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$inPvp$0(net.minecraft.class_345 ), (Lnet/minecraft/class_345;)Ljava/lang/String;)();
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbqr", gbfr(int ), (int)55)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == mq.gbfu("gbqs", gbfw(int ), (int)203)) break;
                    v19 /* !! */  = (long)mq.gbfu("gbqt", gbfw(int ), (int)204);
                }
                v20 = v16.map(v18);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = mq.nc - mq.gbfu("gbqu", gbfr(int ), (int)56)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == mq.gbfu("gbqv", gbfw(int ), (int)205)) break;
                    v21 /* !! */  = (long)mq.gbfu("gbqw", gbfw(int ), (int)206);
                }
                v22 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$inPvp$1(java.lang.String ), (Ljava/lang/String;)Z)();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = mq.nc - mq.gbfu("gbqx", gbfr(int ), (int)57)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == mq.gbfu("gbqy", gbfw(int ), (int)207)) break;
                    v23 /* !! */  = (long)mq.gbfu("gbqz", gbfw(int ), (int)208);
                }
                return v20.anyMatch(v22);
            }
lbl130:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)mq.gbfu("gbra", gbfw(int ), (int)209);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mq.gbfu("gbrb", gbfw(int ), (int)210);
                    if (!var2) ** GOTO lbl130
                    throw null;
                }
            }
lbl140:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)mq.gbfu("gbrc", gbfw(int ), (int)211);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbrd", gbfw(int ), (int)212);
        ** while (!var2)
lbl148:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isReallyWorld() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbwm", gbfr(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mq.gbfu("gbwn", gbfw(int ), (int)286)) break;
            v0 /* !! */  = (long)mq.gbfu("gbwo", gbfw(int ), (int)287);
        }
        var2 = mq.c;
        v1 /* !! */  = mq.nc;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - mq.gbfu("gbwp", gbfr(int ), (int)121));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1292233916: {
                    v2 = mq.gbfu("gbwq", gbfr(int ), (int)122);
                    continue block11;
                }
                case 398366444: {
                    v2 = mq.gbfu("gbwr", gbfr(int ), (int)123);
                    continue block11;
                }
                case 528885884: {
                    v2 = mq.gbfu("gbws", gbfr(int ), (int)124);
                    continue block11;
                }
                case 1580885581: {
                    break block11;
                }
            }
            break;
        }
        var1_1 = mq.b;
        v3 /* !! */  = mq.nc;
        if (true) ** GOTO lbl29
        block12: while (true) {
            v3 /* !! */  = (long)(mq.gbfu("gbwu", gbfr(int ), (int)126) - mq.gbfu("gbwt", gbfr(int ), (int)125));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 798986975: {
                    continue block12;
                }
                case 1580885581: {
                    break block12;
                }
            }
            break;
        }
        var0_2 = mq.a;
        if (var2) {
            throw null;
lbl37:
            // 1 sources

            return (boolean)mq.gbfu("gbwv", gbfw(int ), (int)288);
        }
        ** while (var0_2 || var0_2)
lbl40:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbww", gbfr(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mq.gbfu("gbwx", gbfw(int ), (int)289)) break;
            v4 /* !! */  = (long)mq.gbfu("gbwy", gbfw(int ), (int)290);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbwz", gbfr(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mq.gbfu("gbxa", gbfw(int ), (int)291)) break;
            v5 /* !! */  = (long)mq.gbfu("gbxb", gbfw(int ), (int)292);
        }
        return mq.server.equals("ReallyWorld");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$inPvp$1(String var0) {
        block44: {
            block43: {
                v0 /* !! */  = mq.nc;
                if (true) ** GOTO lbl5
                block23: while (true) {
                    v0 /* !! */  = (long)(v1 - mq.gbfu("gccn", gbfr(int ), (int)195));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -167058121: {
                            v1 = mq.gbfu("gcco", gbfr(int ), (int)196);
                            continue block23;
                        }
                        case 440809177: {
                            v1 = mq.gbfu("gccp", gbfr(int ), (int)197);
                            continue block23;
                        }
                        case 1580885581: {
                            break block23;
                        }
                    }
                    break;
                }
                var3_1 = mq.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gccq", gbfr(int ), (int)198)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == mq.gbfu("gccr", gbfw(int ), (int)368)) break;
                    v2 /* !! */  = (long)mq.gbfu("gccs", gbfw(int ), (int)369);
                }
                var2_2 /* !! */  = mq.b;
                v3 /* !! */  = mq.nc;
                if (true) ** GOTO lbl26
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - mq.gbfu("gcct", gbfr(int ), (int)199));
lbl26:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -937384851: {
                            v4 = mq.gbfu("gccu", gbfr(int ), (int)200);
                            continue block25;
                        }
                        case -597754986: {
                            v4 = mq.gbfu("gccv", gbfr(int ), (int)201);
                            continue block25;
                        }
                        case 1580885581: {
                            break block25;
                        }
                    }
                    break;
                }
                var1_3 = mq.a;
                if (var3_1) {
                    throw null;
lbl38:
                    // 5 sources

                    return (boolean)mq.gbfu("gccw", gbfw(int ), (int)370);
                }
                if (var1_3 || var1_3) ** GOTO lbl38
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gccx", gbfr(int ), (int)202)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mq.gbfu("gccy", gbfw(int ), (int)371)) break;
                    v5 /* !! */  = (long)mq.gbfu("gccz", gbfw(int ), (int)372);
                }
                if (var0.contains("pvp")) break block43;
                if (var1_3) ** GOTO lbl38
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gcda", gbfr(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == mq.gbfu("gcdb", gbfw(int ), (int)373)) break;
                    v6 /* !! */  = (long)mq.gbfu("gcdc", gbfw(int ), (int)374);
                }
                if (!var0.contains("\u043f\u0432\u043f")) break block44;
                if (var1_3) ** GOTO lbl38
            }
            if (var1_3 || var1_3) ** GOTO lbl38
            v7 = mq.gbfu("gcdd", gbfw(int ), (int)375);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl70
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = mq.gbfu("gcde", gbfw(int ), (int)376);
lbl70:
                // 2 sources

                return (boolean)v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdf", gbfw(int ), (int)377);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl76:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdg", gbfw(int ), (int)378);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl81:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdh", gbfw(int ), (int)379);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl86:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdi", gbfw(int ), (int)380);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl91:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdj", gbfw(int ), (int)381);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdk", gbfw(int ), (int)382);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdl", gbfw(int ), (int)383);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdm", gbfw(int ), (int)384);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)mq.gbfu("gcdn", gbfw(int ), (int)385);
                } while (!var3_1);
                throw null;
            }
lbl112:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)mq.gbfu("gcdo", gbfw(int ), (int)386);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 10: 
        }
        do {
            var2_2 /* !! */  = (int)mq.gbfu("gcdp", gbfw(int ), (int)387);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite gbfu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void gcet() {
        mq.gbfy[100] = -757608966;
        mq.gbfy[101] = -1822329513;
        mq.gbfy[102] = 1772246210;
        mq.gbfy[103] = -1729665265;
        mq.gbfy[104] = 0x3333D9D;
        mq.gbfy[105] = -1853865367;
        mq.gbfy[106] = -833183500;
        mq.gbfy[107] = 1272441581;
        mq.gbfy[108] = -949108447;
        mq.gbfy[109] = 1668378975;
        mq.gbfy[110] = 1794574402;
        mq.gbfy[111] = 654005606;
        mq.gbfy[112] = -521444589;
        mq.gbfy[113] = -1179983793;
        mq.gbfy[114] = 1931539667;
        mq.gbfy[115] = 1373378653;
        mq.gbfy[116] = -2026253442;
        mq.gbfy[117] = -1373004216;
        mq.gbfy[118] = -382369567;
        mq.gbfy[119] = -684096808;
        mq.gbfy[120] = -1157464997;
        mq.gbfy[121] = 114612411;
        mq.gbfy[122] = 1408262723;
        mq.gbfy[123] = 308348680;
        mq.gbfy[124] = 228911431;
        mq.gbfy[125] = -1655194858;
        mq.gbfy[126] = 407468871;
        mq.gbfy[127] = -137929594;
        mq.gbfy[128] = -1377601930;
        mq.gbfy[129] = -892918607;
        mq.gbfy[130] = -1768020795;
        mq.gbfy[131] = 983237343;
        mq.gbfy[132] = -768115993;
        mq.gbfy[133] = 1263687917;
        mq.gbfy[134] = 1952220528;
        mq.gbfy[135] = -190977966;
        mq.gbfy[136] = 1895915993;
        mq.gbfy[137] = -259256934;
        mq.gbfy[138] = 607947375;
        mq.gbfy[139] = 1445738711;
        mq.gbfy[140] = -1591974019;
        mq.gbfy[141] = -1983153255;
        mq.gbfy[142] = -1682483925;
        mq.gbfy[143] = 1311938915;
        mq.gbfy[144] = -240849684;
        mq.gbfy[145] = 1878742466;
        mq.gbfy[146] = 505885290;
        mq.gbfy[147] = -583642262;
        mq.gbfy[148] = -1321494694;
        mq.gbfy[149] = 119982599;
        mq.gbfy[150] = 1510436509;
        mq.gbfy[151] = 2008429733;
        mq.gbfy[152] = 452898444;
        mq.gbfy[153] = -1703743271;
        mq.gbfy[154] = -1804821643;
        mq.gbfy[155] = 324216597;
        mq.gbfy[156] = 85356167;
        mq.gbfy[157] = 691359434;
        mq.gbfy[158] = -280814917;
        mq.gbfy[159] = 328975686;
        mq.gbfy[160] = 1095254153;
        mq.gbfy[161] = -474067853;
        mq.gbfy[162] = -1318387104;
        mq.gbfy[163] = -1488556328;
        mq.gbfy[164] = -556789956;
        mq.gbfy[165] = 779667607;
        mq.gbfy[166] = -375018029;
        mq.gbfy[167] = 1767481659;
        mq.gbfy[168] = -721540567;
        mq.gbfy[169] = 1752049800;
        mq.gbfy[170] = 1874497682;
        mq.gbfy[171] = 1803196601;
        mq.gbfy[172] = -217355158;
        mq.gbfy[173] = 1766886089;
        mq.gbfy[174] = -1619124732;
        mq.gbfy[175] = -1684636231;
        mq.gbfy[176] = -629368157;
        mq.gbfy[177] = -1725759500;
        mq.gbfy[178] = -1195451772;
        mq.gbfy[179] = -1143274243;
        mq.gbfy[180] = 766466668;
        mq.gbfy[181] = -1362906370;
        mq.gbfy[182] = -1251881390;
        mq.gbfy[183] = -814993903;
        mq.gbfy[184] = 1609239826;
        mq.gbfy[185] = -1361274634;
        mq.gbfy[186] = 569903154;
        mq.gbfy[187] = -266018898;
        mq.gbfy[188] = -357018654;
        mq.gbfy[189] = 48656749;
        mq.gbfy[190] = -2136964854;
        mq.gbfy[191] = 1868721832;
        mq.gbfy[192] = -979481553;
        mq.gbfy[193] = -1265025836;
        mq.gbfy[194] = 260168885;
        mq.gbfy[195] = 524672613;
        mq.gbfy[196] = 1051394678;
        mq.gbfy[197] = 1849246761;
        mq.gbfy[198] = 1398312223;
        mq.gbfy[199] = -2051201136;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$inPvpEnd$2(class_345 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gcbu", gbfr(int ), (int)184)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mq.gbfu("gcbv", gbfw(int ), (int)360)) break;
            v0 /* !! */  = (long)mq.gbfu("gcbw", gbfw(int ), (int)361);
        }
        var3_1 = mq.c;
        v1 /* !! */  = mq.nc;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(mq.gbfu("gcby", gbfr(int ), (int)186) - mq.gbfu("gcbx", gbfr(int ), (int)185));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -860918704: {
                    continue block24;
                }
                case 1580885581: {
                    break block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = mq.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mq.nc;
                if (true) ** GOTO lbl25
                block25: while (true) {
                    v2 /* !! */  = (long)(v3 - mq.gbfu("gcbz", gbfr(int ), (int)187));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1722055635: {
                            v3 = mq.gbfu("gcca", gbfr(int ), (int)188);
                            continue block25;
                        }
                        case 715155627: {
                            v3 = mq.gbfu("gccb", gbfr(int ), (int)189);
                            continue block25;
                        }
                        case 1580885581: {
                            break block25;
                        }
                    }
                    break;
                }
                var1_3 = mq.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mq.nc;
                if (true) ** GOTO lbl44
                block27: while (true) {
                    v4 /* !! */  = (long)(mq.gbfu("gccd", gbfr(int ), (int)191) - mq.gbfu("gccc", gbfr(int ), (int)190));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -891088431: {
                            continue block27;
                        }
                        case 1580885581: {
                            break block27;
                        }
                    }
                    break;
                }
                v5 = var0.method_5414();
                v6 /* !! */  = mq.nc;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v6 /* !! */  = (long)(mq.gbfu("gccf", gbfr(int ), (int)193) - mq.gbfu("gcce", gbfr(int ), (int)192));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1237760482: {
                            continue block28;
                        }
                        case 1580885581: {
                            break block28;
                        }
                    }
                    break;
                }
                v7 = v5.getString();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gccg", gbfr(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == mq.gbfu("gcch", gbfw(int ), (int)362)) break;
                    v8 /* !! */  = (long)mq.gbfu("gcci", gbfw(int ), (int)363);
                }
                return v7.toLowerCase();
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)mq.gbfu("gccj", gbfw(int ), (int)364);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mq.gbfu("gcck", gbfw(int ), (int)365);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mq.gbfu("gccl", gbfw(int ), (int)366);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mq.gbfu("gccm", gbfw(int ), (int)367);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isPvp() {
        block37: {
            v0 /* !! */  = mq.nc;
            if (true) ** GOTO lbl5
            block20: while (true) {
                v0 /* !! */  = (long)(v1 - mq.gbfu("gboj", gbfr(int ), (int)24));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -476356346: {
                        v1 = mq.gbfu("gbok", gbfr(int ), (int)25);
                        continue block20;
                    }
                    case 374296955: {
                        v1 = mq.gbfu("gbol", gbfr(int ), (int)26);
                        continue block20;
                    }
                    case 1580885581: {
                        break block20;
                    }
                }
                break;
            }
            var2 = mq.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbom", gbfr(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == mq.gbfu("gbon", gbfw(int ), (int)179)) break;
                v2 /* !! */  = (long)mq.gbfu("gboo", gbfw(int ), (int)180);
            }
            var1_1 /* !! */  = mq.b;
            v3 /* !! */  = mq.nc;
            if (true) ** GOTO lbl26
            block22: while (true) {
                v3 /* !! */  = (long)(v4 - mq.gbfu("gbop", gbfr(int ), (int)28));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1256426559: {
                        v4 = mq.gbfu("gboq", gbfr(int ), (int)29);
                        continue block22;
                    }
                    case -431276266: {
                        v4 = mq.gbfu("gbor", gbfr(int ), (int)30);
                        continue block22;
                    }
                    case 1580885581: {
                        break block22;
                    }
                }
                break;
            }
            var0_2 = mq.a;
            if (var2) {
                throw null;
lbl38:
                // 4 sources

                return (boolean)mq.gbfu("gbot", gbfw(int ), (int)181);
            }
            if (var0_2 || var0_2) ** GOTO lbl38
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbou", gbfr(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == mq.gbfu("gbov", gbfw(int ), (int)182)) break;
                v5 /* !! */  = (long)mq.gbfu("gbow", gbfw(int ), (int)183);
            }
            v6 = mq.gbfu("gboy", gbox(int ), (int)32);
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gboz", gbfr(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == mq.gbfu("gbpa", gbfw(int ), (int)184)) break;
                v7 /* !! */  = (long)mq.gbfu("gbpb", gbfw(int ), (int)185);
            }
            if (mq.pvpWatch.finished((double)v6)) break block37;
            if (var0_2) ** GOTO lbl38
            v8 = mq.gbfu("gbpc", gbfw(int ), (int)186);
            if (var2) {
                throw null;
            }
            ** GOTO lbl68
        }
        if (var0_2) ** GOTO lbl38
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                v8 = mq.gbfu("gbpd", gbfw(int ), (int)187);
lbl68:
                // 2 sources

                return (boolean)v8;
            }
lbl69:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mq.gbfu("gbpe", gbfw(int ), (int)188);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)mq.gbfu("gbpf", gbfw(int ), (int)189);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 2: {
                var1_1 /* !! */  = (int)mq.gbfu("gbpg", gbfw(int ), (int)190);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 3: {
                do {
                    var1_1 /* !! */  = (int)mq.gbfu("gbph", gbfw(int ), (int)191);
                } while (!var2);
                throw null;
            }
lbl89:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)mq.gbfu("gbpj", gbfw(int ), (int)192);
                if (!var2) ** GOTO lbl69
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)mq.gbfu("gbpk", gbfw(int ), (int)193);
                if (!var2) ** GOTO lbl69
                throw null;
            }
lbl97:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)mq.gbfu("gbpl", gbfw(int ), (int)194);
                if (!var2) ** GOTO lbl89
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)mq.gbfu("gbpm", gbfw(int ), (int)195);
        ** while (!var2)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void packet(cr var0) {
        var10_1 = mq.c;
        var9_2 /* !! */  = mq.b;
        var8_3 = mq.a;
        if (var10_1) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        v0 = var0.getPacket();
        Objects.requireNonNull(v0);
        var1_4 = v0;
        if (var8_3) ** GOTO lbl6
        var2_5 = mq.gbfu("gbhx", gbfw(int ), (int)26);
        if (var8_3 || var8_3 || var8_3) ** GOTO lbl6
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_2761.class}, var1_4, (int)var2_5)) {
            case 0: {
                if (var8_3 || var8_3) ** GOTO lbl6
                var3_6 = (class_2761)var1_4;
                if (var8_3 || var8_3) ** GOTO lbl6
                var4_7 = System.nanoTime();
                if (var8_3 || var8_3) ** GOTO lbl6
                if (mq.timestamp == mq.gbfu("gbhy", gbfr(int ), (int)22)) ** GOTO lbl27
                if (var8_3) ** GOTO lbl6
                if (var4_7 - mq.timestamp <= mq.gbfu("gbhz", gbfr(int ), (int)23)) ** GOTO lbl34
                if (var8_3) ** GOTO lbl6
lbl27:
                // 2 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                mq.timestamp = var4_7;
                if (var8_3 || var8_3) ** GOTO lbl6
                mq.TPS = (float)mq.gbfu("gbic", gbia(int ), (int)27);
                if (var8_3 || var8_3) ** GOTO lbl6
                if (!var10_1) break;
                throw null;
lbl34:
                // 1 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                var6_8 = mq.gbfu("gbid", gbia(int ), (int)28) * (mq.gbfu("gbie", gbia(int ), (int)29) / (float)(var4_7 - mq.timestamp));
                if (var8_3 || var8_3) ** GOTO lbl6
                var7_9 = class_3532.method_15363((float)var6_8, (float)mq.gbfu("gbif", gbia(int ), (int)30), (float)mq.gbfu("gbig", gbia(int ), (int)31));
                if (var8_3 || var8_3) ** GOTO lbl6
                mq.TPS = mq.TPS * mq.gbfu("gbih", gbia(int ), (int)32) + var7_9 * mq.gbfu("gbii", gbia(int ), (int)33);
                if (var8_3 || var8_3) ** GOTO lbl6
                mq.timestamp = var4_7;
                if (var8_3 || var8_3) ** GOTO lbl6
                if (!var10_1) break;
                throw null;
            }
        }
        if (!var8_3 && !var8_3) ** break;
        ** while (true)
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var9_2 /* !! */  = (int)mq.gbfu("gbij", gbfw(int ), (int)34);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl56:
            // 3 sources

            case 1: {
                var9_2 /* !! */  = (int)mq.gbfu("gbik", gbfw(int ), (int)35);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 2: {
                var9_2 /* !! */  = (int)mq.gbfu("gbil", gbfw(int ), (int)36);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl66:
            // 2 sources

            case 3: {
                var9_2 /* !! */  = (int)mq.gbfu("gbim", gbfw(int ), (int)37);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 4: {
                var9_2 /* !! */  = (int)mq.gbfu("gbin", gbfw(int ), (int)38);
                if (var10_1) {
                    throw null;
                }
            }
            case 5: {
                var9_2 /* !! */  = (int)mq.gbfu("gbio", gbfw(int ), (int)39);
                if (!var10_1) ** GOTO lbl56
                throw null;
            }
lbl79:
            // 2 sources

            case 6: {
                var9_2 /* !! */  = (int)mq.gbfu("gbip", gbfw(int ), (int)40);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl84:
            // 3 sources

            case 7: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiq", gbfw(int ), (int)41);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 8: {
                var9_2 /* !! */  = (int)mq.gbfu("gbir", gbfw(int ), (int)42);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 9: {
                var9_2 /* !! */  = (int)mq.gbfu("gbis", gbfw(int ), (int)43);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl99:
            // 3 sources

            case 10: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiu", gbfw(int ), (int)44);
                if (!var10_1) ** GOTO lbl84
                throw null;
            }
lbl103:
            // 2 sources

            case 11: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiv", gbfw(int ), (int)45);
                if (!var10_1) ** GOTO lbl99
                throw null;
            }
            case 12: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiw", gbfw(int ), (int)46);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl112:
            // 4 sources

            case 13: {
                var9_2 /* !! */  = (int)mq.gbfu("gbix", gbfw(int ), (int)47);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl117:
            // 2 sources

            case 14: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiy", gbfw(int ), (int)48);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 15: {
                var9_2 /* !! */  = (int)mq.gbfu("gbiz", gbfw(int ), (int)49);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)mq.gbfu("gbja", gbfw(int ), (int)50);
                    if (var10_1) {
                        throw null;
                    }
                    ** GOTO lbl142
                    break;
                }
            }
            case 17: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjb", gbfw(int ), (int)51);
                if (!var10_1) ** GOTO lbl112
                throw null;
            }
lbl137:
            // 3 sources

            case 18: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjc", gbfw(int ), (int)52);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl142:
            // 3 sources

            case 19: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjd", gbfw(int ), (int)53);
                if (!var10_1) ** GOTO lbl66
                throw null;
            }
lbl146:
            // 2 sources

            case 20: {
                do {
                    var9_2 /* !! */  = (int)mq.gbfu("gbje", gbfw(int ), (int)54);
                } while (!var10_1);
                throw null;
            }
lbl151:
            // 2 sources

            case 21: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjf", gbfw(int ), (int)55);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 22: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjg", gbfw(int ), (int)56);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl161:
            // 2 sources

            case 23: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjh", gbfw(int ), (int)57);
                if (!var10_1) ** GOTO lbl112
                throw null;
            }
            case 24: {
                var9_2 /* !! */  = (int)mq.gbfu("gbji", gbfw(int ), (int)58);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 25: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjj", gbfw(int ), (int)59);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 26: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjk", gbfw(int ), (int)60);
                if (!var10_1) ** GOTO lbl84
                throw null;
            }
lbl179:
            // 3 sources

            case 27: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjl", gbfw(int ), (int)61);
                if (!var10_1) ** GOTO lbl117
                throw null;
            }
            case 28: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjn", gbfw(int ), (int)62);
                if (!var10_1) ** GOTO lbl56
                throw null;
            }
            case 29: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjo", gbfw(int ), (int)63);
                if (!var10_1) ** GOTO lbl99
                throw null;
            }
lbl191:
            // 4 sources

            case 30: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjp", gbfw(int ), (int)64);
                if (!var10_1) ** GOTO lbl79
                throw null;
            }
lbl195:
            // 3 sources

            case 31: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjq", gbfw(int ), (int)65);
                if (var10_1) {
                    throw null;
                }
            }
lbl199:
            // 5 sources

            case 32: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjr", gbfw(int ), (int)66);
                if (!var10_1) ** GOTO lbl112
                throw null;
            }
lbl203:
            // 2 sources

            case 33: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjs", gbfw(int ), (int)67);
                if (!var10_1) ** GOTO lbl191
                throw null;
            }
lbl207:
            // 3 sources

            case 34: {
                var9_2 /* !! */  = (int)mq.gbfu("gbjt", gbfw(int ), (int)68);
                if (!var10_1) ** GOTO lbl203
                throw null;
            }
            case 35: 
        }
        var9_2 /* !! */  = (int)mq.gbfu("gbju", gbfw(int ), (int)69);
        ** while (!var10_1)
lbl214:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcer() {
        mq.gbfx[300] = 622571388;
        mq.gbfx[301] = -1693847430;
        mq.gbfx[302] = -279438608;
        mq.gbfx[303] = 64693703;
        mq.gbfx[304] = 1768594088;
        mq.gbfx[305] = -1275434705;
        mq.gbfx[306] = 675521196;
        mq.gbfx[307] = -566888257;
        mq.gbfx[308] = -25160892;
        mq.gbfx[309] = 947225647;
        mq.gbfx[310] = -586905821;
        mq.gbfx[311] = 1212712571;
        mq.gbfx[312] = -1478392550;
        mq.gbfx[313] = 569296831;
        mq.gbfx[314] = -1636211035;
        mq.gbfx[315] = -798655498;
        mq.gbfx[316] = -276317240;
        mq.gbfx[317] = 1816460541;
        mq.gbfx[318] = 681228208;
        mq.gbfx[319] = 1866509544;
        mq.gbfx[320] = 1653496780;
        mq.gbfx[321] = -1990027431;
        mq.gbfx[322] = -564661885;
        mq.gbfx[323] = -714291405;
        mq.gbfx[324] = 805587275;
        mq.gbfx[325] = -929827812;
        mq.gbfx[326] = 731399308;
        mq.gbfx[327] = -452220329;
        mq.gbfx[328] = -1792640153;
        mq.gbfx[329] = -1215504749;
        mq.gbfx[330] = 467333655;
        mq.gbfx[331] = 976370692;
        mq.gbfx[332] = 354828432;
        mq.gbfx[333] = 282880602;
        mq.gbfx[334] = 807866673;
        mq.gbfx[335] = 107591093;
        mq.gbfx[336] = 55588603;
        mq.gbfx[337] = -2086062440;
        mq.gbfx[338] = 1432487402;
        mq.gbfx[339] = -435575295;
        mq.gbfx[340] = 1861976684;
        mq.gbfx[341] = -643067976;
        mq.gbfx[342] = 346017911;
        mq.gbfx[343] = -1567031288;
        mq.gbfx[344] = 105524102;
        mq.gbfx[345] = -653458368;
        mq.gbfx[346] = -166698389;
        mq.gbfx[347] = -1501014141;
        mq.gbfx[348] = -1944437542;
        mq.gbfx[349] = -1996924962;
        mq.gbfx[350] = -878075783;
        mq.gbfx[351] = -1373581;
        mq.gbfx[352] = -1526981900;
        mq.gbfx[353] = -30388443;
        mq.gbfx[354] = 1866188720;
        mq.gbfx[355] = -188907110;
        mq.gbfx[356] = 1588613947;
        mq.gbfx[357] = -785266922;
        mq.gbfx[358] = -28760244;
        mq.gbfx[359] = 445625720;
        mq.gbfx[360] = 626114622;
        mq.gbfx[361] = 2057676704;
        mq.gbfx[362] = 2054581586;
        mq.gbfx[363] = 1180950962;
        mq.gbfx[364] = 1085151749;
        mq.gbfx[365] = 1491610321;
        mq.gbfx[366] = -1265468071;
        mq.gbfx[367] = -898448937;
        mq.gbfx[368] = 202806156;
        mq.gbfx[369] = 676493162;
        mq.gbfx[370] = 1566027299;
        mq.gbfx[371] = -955657947;
        mq.gbfx[372] = 1011747279;
        mq.gbfx[373] = 657386476;
        mq.gbfx[374] = -492387001;
        mq.gbfx[375] = 441118519;
        mq.gbfx[376] = 1777795003;
        mq.gbfx[377] = 1158148371;
        mq.gbfx[378] = 1155504810;
        mq.gbfx[379] = 325121140;
        mq.gbfx[380] = -1163106892;
        mq.gbfx[381] = -1305895106;
        mq.gbfx[382] = 746687824;
        mq.gbfx[383] = -631164371;
        mq.gbfx[384] = 41316826;
        mq.gbfx[385] = -827664938;
        mq.gbfx[386] = -839136946;
        mq.gbfx[387] = -1816304325;
        mq.gbfx[388] = -605576684;
        mq.gbfx[389] = -1049378663;
        mq.gbfx[390] = -2054720182;
        mq.gbfx[391] = -672223619;
        mq.gbfx[392] = 1472131120;
        mq.gbfx[393] = -280464872;
        mq.gbfx[394] = -89397225;
        mq.gbfx[395] = 1255701284;
        mq.gbfx[396] = -1942574276;
        mq.gbfx[397] = 1388762493;
        mq.gbfx[398] = -127329934;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$inPvpEnd$3(String var0) {
        block60: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gcag", gbfr(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == mq.gbfu("gcah", gbfw(int ), (int)334)) break;
                v0 /* !! */  = (long)mq.gbfu("gcai", gbfw(int ), (int)335);
            }
            var3_1 = mq.c;
            v1 /* !! */  = mq.nc;
            if (true) ** GOTO lbl12
            block34: while (true) {
                v1 /* !! */  = (long)(v2 - mq.gbfu("gcaj", gbfr(int ), (int)171));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1814511145: {
                        v2 = mq.gbfu("gcak", gbfr(int ), (int)172);
                        continue block34;
                    }
                    case 1213022558: {
                        v2 = mq.gbfu("gcal", gbfr(int ), (int)173);
                        continue block34;
                    }
                    case 1580885581: {
                        break block34;
                    }
                    case 1909027363: {
                        v2 = mq.gbfu("gcam", gbfr(int ), (int)174);
                        continue block34;
                    }
                }
                break;
            }
            var2_2 /* !! */  = mq.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gcan", gbfr(int ), (int)175)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == mq.gbfu("gcao", gbfw(int ), (int)336)) break;
                v3 /* !! */  = (long)mq.gbfu("gcap", gbfw(int ), (int)337);
            }
            var1_3 = mq.a;
            if (var3_1) {
                throw null;
lbl34:
                // 8 sources

                return (boolean)mq.gbfu("gcaq", gbfw(int ), (int)338);
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            v4 /* !! */  = mq.nc;
            if (true) ** GOTO lbl41
            block37: while (true) {
                v4 /* !! */  = (long)(v5 - mq.gbfu("gcar", gbfr(int ), (int)176));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2123276134: {
                        v5 = mq.gbfu("gcas", gbfr(int ), (int)177);
                        continue block37;
                    }
                    case 715068834: {
                        v5 = mq.gbfu("gcat", gbfr(int ), (int)178);
                        continue block37;
                    }
                    case 1580885581: {
                        break block37;
                    }
                }
                break;
            }
            if (var0.contains("pvp")) break block60;
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gcau", gbfr(int ), (int)179)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == mq.gbfu("gcav", gbfw(int ), (int)339)) break;
                v6 /* !! */  = (long)mq.gbfu("gcaw", gbfw(int ), (int)340);
            }
            if (!var0.contains("\u043f\u0432\u043f")) ** GOTO lbl93
            if (var1_3) ** GOTO lbl34
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v7 /* !! */  = mq.nc;
        if (true) ** GOTO lbl66
        block39: while (true) {
            v7 /* !! */  = (long)(v8 - mq.gbfu("gcax", gbfr(int ), (int)180));
lbl66:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1720007373: {
                    v8 = mq.gbfu("gcay", gbfr(int ), (int)181);
                    continue block39;
                }
                case 888007654: {
                    v8 = mq.gbfu("gcaz", gbfr(int ), (int)182);
                    continue block39;
                }
                case 1580885581: {
                    break block39;
                }
            }
            break;
        }
        if (var0.contains("0")) ** GOTO lbl-1000
        if (var1_3) ** GOTO lbl34
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gcba", gbfr(int ), (int)183)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == mq.gbfu("gcbb", gbfw(int ), (int)341)) break;
            v9 /* !! */  = (long)mq.gbfu("gcbc", gbfw(int ), (int)342);
        }
        if (!var0.contains("1")) ** GOTO lbl93
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl34
                v10 = mq.gbfu("gcbd", gbfw(int ), (int)343);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl93:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v10 = mq.gbfu("gcbe", gbfw(int ), (int)344);
lbl96:
            // 2 sources

            return (boolean)v10;
lbl97:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbf", gbfw(int ), (int)345);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl102:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbg", gbfw(int ), (int)346);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 2: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbh", gbfw(int ), (int)347);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)mq.gbfu("gcbi", gbfw(int ), (int)348);
                } while (!var3_1);
                throw null;
            }
lbl117:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbj", gbfw(int ), (int)349);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl122:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbk", gbfw(int ), (int)350);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mq.gbfu("gcbl", gbfw(int ), (int)351);
                    if (!var3_1) ** GOTO lbl102
                    throw null;
                }
            }
lbl131:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbm", gbfw(int ), (int)352);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbn", gbfw(int ), (int)353);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 9: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbo", gbfw(int ), (int)354);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
lbl144:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbp", gbfw(int ), (int)355);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
            case 11: {
                do {
                    var2_2 /* !! */  = (int)mq.gbfu("gcbq", gbfw(int ), (int)356);
                } while (!var3_1);
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)mq.gbfu("gcbr", gbfw(int ), (int)357);
                } while (!var3_1);
                throw null;
            }
lbl158:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)mq.gbfu("gcbs", gbfw(int ), (int)358);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)mq.gbfu("gcbt", gbfw(int ), (int)359);
        ** while (!var3_1)
lbl165:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String getServer() {
        block108: {
            block107: {
                block106: {
                    block105: {
                        block104: {
                            block103: {
                                block102: {
                                    block101: {
                                        block100: {
                                            block99: {
                                                block98: {
                                                    var4 = mq.c;
                                                    var3_1 /* !! */  = mq.b;
                                                    var2_2 = mq.a;
                                                    if (var4) {
                                                        throw null;
lbl6:
                                                        // 30 sources

                                                        return null;
                                                    }
                                                    if (var2_2 || var2_2) ** GOTO lbl6
                                                    if (pn.nullCheck()) break block98;
                                                    if (var2_2) ** GOTO lbl6
                                                    if (mq.mc.method_1562() == null) break block98;
                                                    if (var2_2) ** GOTO lbl6
                                                    if (mq.mc.method_1562().method_45734() == null) break block98;
                                                    if (var2_2) ** GOTO lbl6
                                                    if (mq.mc.method_1562().method_52790() != null) break block99;
                                                    if (var2_2) ** GOTO lbl6
                                                }
                                                if (var2_2 || var2_2) ** GOTO lbl6
                                                return "Vanilla";
                                            }
                                            if (var2_2 || var2_2) ** GOTO lbl6
                                            var0_3 = mq.mc.method_1562().method_45734().field_3761.toLowerCase();
                                            if (var2_2 || var2_2) ** GOTO lbl6
                                            var1_4 = mq.mc.method_1562().method_52790().toLowerCase();
                                            if (var2_2 || var2_2) ** GOTO lbl6
                                            if (!var1_4.contains("botfilter")) break block100;
                                            if (var2_2) ** GOTO lbl6
                                            return "FunTime";
                                        }
                                        if (var2_2 || var2_2) ** GOTO lbl6
                                        if (!var1_4.contains("\u00a76spooky\u00a7ccore")) break block101;
                                        if (var2_2) ** GOTO lbl6
                                        return "SpookyTime";
                                    }
                                    if (var2_2 || var2_2) ** GOTO lbl6
                                    if (var0_3.contains("funtime")) break block102;
                                    if (var2_2) ** GOTO lbl6
                                    if (var0_3.contains("skytime")) break block102;
                                    if (var2_2) ** GOTO lbl6
                                    if (var0_3.contains("space-times")) break block102;
                                    if (var2_2) ** GOTO lbl6
                                    if (!var0_3.contains("funsky")) break block103;
                                    if (var2_2) ** GOTO lbl6
                                }
                                if (var2_2 || var2_2) ** GOTO lbl6
                                return "CopyTime";
                            }
                            if (var2_2 || var2_2) ** GOTO lbl6
                            if (var1_4.contains("holyworld")) break block104;
                            if (var2_2) ** GOTO lbl6
                            if (var1_4.contains("vk.com/idwok")) break block104;
                            if (var2_2) ** GOTO lbl6
                            if (!var1_4.contains("netvision")) break block105;
                            if (var2_2) ** GOTO lbl6
                        }
                        if (var2_2 || var2_2) ** GOTO lbl6
                        return "HolyWorld";
                    }
                    if (var2_2 || var2_2) ** GOTO lbl6
                    if (!var0_3.contains("gulpvp")) break block106;
                    if (var2_2) ** GOTO lbl6
                    return "GulPvP";
                }
                if (var2_2 || var2_2) ** GOTO lbl6
                if (!var0_3.contains("heavenworld")) break block107;
                if (var2_2) ** GOTO lbl6
                return "HeavenWorld";
            }
            if (var2_2 || var2_2) ** GOTO lbl6
            if (!var0_3.contains("reallyworld")) break block108;
            if (var2_2) ** GOTO lbl6
            return "ReallyWorld";
        }
        if (!var2_2 && !var2_2) ** break;
        ** while (true)
        if (var3_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return "Vanilla";
            }
lbl80:
            // 2 sources

            case 0: {
                var3_1 /* !! */  = (int)mq.gbfu("gbjw", gbfw(int ), (int)70);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 1: {
                var3_1 /* !! */  = (int)mq.gbfu("gbjx", gbfw(int ), (int)71);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 2: {
                var3_1 /* !! */  = (int)mq.gbfu("gbjy", gbfw(int ), (int)72);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl95:
            // 2 sources

            case 3: {
                var3_1 /* !! */  = (int)mq.gbfu("gbjz", gbfw(int ), (int)73);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl100:
            // 2 sources

            case 4: {
                var3_1 /* !! */  = (int)mq.gbfu("gbka", gbfw(int ), (int)74);
                if (!var4) ** GOTO lbl80
                throw null;
            }
            case 5: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkb", gbfw(int ), (int)75);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 6: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkc", gbfw(int ), (int)76);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 7: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkd", gbfw(int ), (int)77);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 8: {
                var3_1 /* !! */  = (int)mq.gbfu("gbke", gbfw(int ), (int)78);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl124:
            // 2 sources

            case 9: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkf", gbfw(int ), (int)79);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl129:
            // 3 sources

            case 10: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkg", gbfw(int ), (int)80);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl134:
            // 3 sources

            case 11: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkh", gbfw(int ), (int)81);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 12: {
                do {
                    var3_1 /* !! */  = (int)mq.gbfu("gbki", gbfw(int ), (int)82);
                } while (!var4);
                throw null;
            }
lbl144:
            // 2 sources

            case 13: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkj", gbfw(int ), (int)83);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl149:
            // 4 sources

            case 14: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkk", gbfw(int ), (int)84);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl154:
            // 3 sources

            case 15: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkl", gbfw(int ), (int)85);
                if (!var4) ** GOTO lbl149
                throw null;
            }
lbl158:
            // 2 sources

            case 16: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkn", gbfw(int ), (int)86);
                if (!var4) ** GOTO lbl149
                throw null;
            }
lbl162:
            // 3 sources

            case 17: {
                var3_1 /* !! */  = (int)mq.gbfu("gbko", gbfw(int ), (int)87);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 18: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkp", gbfw(int ), (int)88);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl172:
            // 3 sources

            case 19: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkq", gbfw(int ), (int)89);
                if (var4) {
                    throw null;
                }
            }
            case 20: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkr", gbfw(int ), (int)90);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl181:
            // 3 sources

            case 21: {
                var3_1 /* !! */  = (int)mq.gbfu("gbks", gbfw(int ), (int)91);
                if (!var4) ** GOTO lbl162
                throw null;
            }
lbl185:
            // 2 sources

            case 22: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkt", gbfw(int ), (int)92);
                if (!var4) ** GOTO lbl154
                throw null;
            }
lbl189:
            // 3 sources

            case 23: {
                var3_1 /* !! */  = (int)mq.gbfu("gbku", gbfw(int ), (int)93);
                if (!var4) ** GOTO lbl95
                throw null;
            }
lbl193:
            // 3 sources

            case 24: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkv", gbfw(int ), (int)94);
                if (!var4) ** GOTO lbl124
                throw null;
            }
            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_1 /* !! */  = (int)mq.gbfu("gbkw", gbfw(int ), (int)95);
                    if (!var4) ** GOTO lbl158
                    throw null;
                }
            }
lbl202:
            // 3 sources

            case 26: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkx", gbfw(int ), (int)96);
                if (!var4) ** GOTO lbl172
                throw null;
            }
            case 27: {
                var3_1 /* !! */  = (int)mq.gbfu("gbky", gbfw(int ), (int)97);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl211:
            // 2 sources

            case 28: {
                var3_1 /* !! */  = (int)mq.gbfu("gbkz", gbfw(int ), (int)98);
                if (!var4) ** GOTO lbl181
                throw null;
            }
lbl215:
            // 2 sources

            case 29: {
                var3_1 /* !! */  = (int)mq.gbfu("gbla", gbfw(int ), (int)99);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl220:
            // 2 sources

            case 30: {
                var3_1 /* !! */  = (int)mq.gbfu("gblc", gbfw(int ), (int)100);
                if (!var4) ** GOTO lbl189
                throw null;
            }
lbl224:
            // 3 sources

            case 31: {
                var3_1 /* !! */  = (int)mq.gbfu("gbld", gbfw(int ), (int)101);
                if (!var4) ** GOTO lbl134
                throw null;
            }
lbl228:
            // 2 sources

            case 32: {
                var3_1 /* !! */  = (int)mq.gbfu("gble", gbfw(int ), (int)102);
                if (!var4) ** GOTO lbl154
                throw null;
            }
lbl232:
            // 3 sources

            case 33: {
                var3_1 /* !! */  = (int)mq.gbfu("gblf", gbfw(int ), (int)103);
                if (!var4) ** GOTO lbl220
                throw null;
            }
            case 34: {
                var3_1 /* !! */  = (int)mq.gbfu("gblg", gbfw(int ), (int)104);
                if (!var4) ** GOTO lbl224
                throw null;
            }
lbl240:
            // 2 sources

            case 35: {
                var3_1 /* !! */  = (int)mq.gbfu("gblh", gbfw(int ), (int)105);
                if (!var4) ** GOTO lbl193
                throw null;
            }
lbl244:
            // 2 sources

            case 36: {
                var3_1 /* !! */  = (int)mq.gbfu("gbli", gbfw(int ), (int)106);
                if (!var4) ** GOTO lbl202
                throw null;
            }
            case 37: {
                var3_1 /* !! */  = (int)mq.gbfu("gblj", gbfw(int ), (int)107);
                if (!var4) ** GOTO lbl185
                throw null;
            }
lbl252:
            // 2 sources

            case 38: {
                var3_1 /* !! */  = (int)mq.gbfu("gbll", gbfw(int ), (int)108);
                if (!var4) ** GOTO lbl244
                throw null;
            }
lbl256:
            // 2 sources

            case 39: {
                var3_1 /* !! */  = (int)mq.gbfu("gblm", gbfw(int ), (int)109);
                if (!var4) ** GOTO lbl149
                throw null;
            }
            case 40: {
                var3_1 /* !! */  = (int)mq.gbfu("gbln", gbfw(int ), (int)110);
                if (!var4) ** GOTO lbl144
                throw null;
            }
lbl264:
            // 2 sources

            case 41: {
                var3_1 /* !! */  = (int)mq.gbfu("gblo", gbfw(int ), (int)111);
                if (!var4) ** GOTO lbl232
                throw null;
            }
            case 42: {
                var3_1 /* !! */  = (int)mq.gbfu("gblp", gbfw(int ), (int)112);
                if (!var4) ** GOTO lbl100
                throw null;
            }
lbl272:
            // 2 sources

            case 43: {
                var3_1 /* !! */  = (int)mq.gbfu("gblq", gbfw(int ), (int)113);
                if (!var4) ** GOTO lbl181
                throw null;
            }
            case 44: {
                var3_1 /* !! */  = (int)mq.gbfu("gblr", gbfw(int ), (int)114);
                if (!var4) ** GOTO lbl193
                throw null;
            }
lbl280:
            // 3 sources

            case 45: {
                var3_1 /* !! */  = (int)mq.gbfu("gbls", gbfw(int ), (int)115);
                if (!var4) ** GOTO lbl252
                throw null;
            }
lbl284:
            // 3 sources

            case 46: {
                var3_1 /* !! */  = (int)mq.gbfu("gblt", gbfw(int ), (int)116);
                if (!var4) ** GOTO lbl280
                throw null;
            }
            case 47: {
                var3_1 /* !! */  = (int)mq.gbfu("gblu", gbfw(int ), (int)117);
                if (!var4) ** GOTO lbl172
                throw null;
            }
lbl292:
            // 2 sources

            case 48: {
                var3_1 /* !! */  = (int)mq.gbfu("gblv", gbfw(int ), (int)118);
                if (!var4) ** GOTO lbl284
                throw null;
            }
            case 49: 
        }
        var3_1 /* !! */  = (int)mq.gbfu("gblx", gbfw(int ), (int)119);
        ** while (!var4)
lbl299:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gceo() {
        mq.gbfx[0] = 1464090074;
        mq.gbfx[1] = 791407660;
        mq.gbfx[2] = -1524964152;
        mq.gbfx[3] = -828145614;
        mq.gbfx[4] = 1065829429;
        mq.gbfx[5] = -599849356;
        mq.gbfx[6] = -1463251282;
        mq.gbfx[7] = -2127375234;
        mq.gbfx[8] = -2073671711;
        mq.gbfx[9] = -1742114922;
        mq.gbfx[10] = -1733851361;
        mq.gbfx[11] = 2017357035;
        mq.gbfx[12] = -1394005296;
        mq.gbfx[13] = -1165198341;
        mq.gbfx[14] = 247531371;
        mq.gbfx[15] = 1010086189;
        mq.gbfx[16] = -1849872920;
        mq.gbfx[17] = -965720028;
        mq.gbfx[18] = 377683725;
        mq.gbfx[19] = -1069505884;
        mq.gbfx[20] = 1008786480;
        mq.gbfx[21] = -1614323946;
        mq.gbfx[22] = -2130698219;
        mq.gbfx[23] = 1333360658;
        mq.gbfx[24] = -666422218;
        mq.gbfx[25] = 726796619;
        mq.gbfx[26] = -164115440;
        mq.gbfx[27] = 1266928179;
        mq.gbfx[28] = 248571355;
        mq.gbfx[29] = -1505894485;
        mq.gbfx[30] = 1919248297;
        mq.gbfx[31] = -654734243;
        mq.gbfx[32] = -914581010;
        mq.gbfx[33] = -1218134863;
        mq.gbfx[34] = 2066479283;
        mq.gbfx[35] = -1546758595;
        mq.gbfx[36] = -790516290;
        mq.gbfx[37] = 698778184;
        mq.gbfx[38] = -226460423;
        mq.gbfx[39] = 963800643;
        mq.gbfx[40] = -1200997674;
        mq.gbfx[41] = 286845201;
        mq.gbfx[42] = 1276415062;
        mq.gbfx[43] = -1900202497;
        mq.gbfx[44] = -2043076749;
        mq.gbfx[45] = -1163479129;
        mq.gbfx[46] = -1382190961;
        mq.gbfx[47] = -1261400741;
        mq.gbfx[48] = -1704468411;
        mq.gbfx[49] = -2094744167;
        mq.gbfx[50] = 577424784;
        mq.gbfx[51] = -99169671;
        mq.gbfx[52] = -1218455039;
        mq.gbfx[53] = 1472927462;
        mq.gbfx[54] = -432650233;
        mq.gbfx[55] = -2121530906;
        mq.gbfx[56] = 1023722006;
        mq.gbfx[57] = 430315125;
        mq.gbfx[58] = 236371204;
        mq.gbfx[59] = 1252763974;
        mq.gbfx[60] = -601736687;
        mq.gbfx[61] = -1209933846;
        mq.gbfx[62] = 1538711301;
        mq.gbfx[63] = -1677208200;
        mq.gbfx[64] = 963799887;
        mq.gbfx[65] = -104752254;
        mq.gbfx[66] = 144198615;
        mq.gbfx[67] = -2027972519;
        mq.gbfx[68] = 1115610177;
        mq.gbfx[69] = 851271891;
        mq.gbfx[70] = 1110011775;
        mq.gbfx[71] = -782351063;
        mq.gbfx[72] = 1023145697;
        mq.gbfx[73] = -1521467031;
        mq.gbfx[74] = -1526347499;
        mq.gbfx[75] = -1132094956;
        mq.gbfx[76] = -1638731718;
        mq.gbfx[77] = -843966958;
        mq.gbfx[78] = -618830372;
        mq.gbfx[79] = -60745628;
        mq.gbfx[80] = 873793875;
        mq.gbfx[81] = -1286672115;
        mq.gbfx[82] = 1056547272;
        mq.gbfx[83] = 817957708;
        mq.gbfx[84] = 38689361;
        mq.gbfx[85] = 1619549065;
        mq.gbfx[86] = 186812933;
        mq.gbfx[87] = -845151206;
        mq.gbfx[88] = -648176531;
        mq.gbfx[89] = -898973437;
        mq.gbfx[90] = -1190564403;
        mq.gbfx[91] = -801255929;
        mq.gbfx[92] = 358197158;
        mq.gbfx[93] = 2009312509;
        mq.gbfx[94] = 739406995;
        mq.gbfx[95] = -1826152737;
        mq.gbfx[96] = 1147443184;
        mq.gbfx[97] = -1364476443;
        mq.gbfx[98] = -1801433283;
        mq.gbfx[99] = -1529772199;
    }

    private static /* synthetic */ void gcex() {
        mq.gbfs[100] = 2381911765897577028L;
        mq.gbfs[101] = -3292030733910973740L;
        mq.gbfs[102] = -5229277770178642769L;
        mq.gbfs[103] = -5037587545451247400L;
        mq.gbfs[104] = -8106322166559325897L;
        mq.gbfs[105] = 8613699940612621514L;
        mq.gbfs[106] = 5522612314142329457L;
        mq.gbfs[107] = 2207790886857595725L;
        mq.gbfs[108] = 8109378361652902592L;
        mq.gbfs[109] = -4145476815521767438L;
        mq.gbfs[110] = 6623915163121013704L;
        mq.gbfs[111] = -4988718818013720752L;
        mq.gbfs[112] = -4936961304976490862L;
        mq.gbfs[113] = -2766531590901809982L;
        mq.gbfs[114] = -1319234247359881563L;
        mq.gbfs[115] = 8562087177031314647L;
        mq.gbfs[116] = -1132514523698765860L;
        mq.gbfs[117] = 6431448331572609993L;
        mq.gbfs[118] = -2322819593747934903L;
        mq.gbfs[119] = -4960637830026071266L;
        mq.gbfs[120] = -5927790222133657984L;
        mq.gbfs[121] = -9194128491307818031L;
        mq.gbfs[122] = -4590460017425584423L;
        mq.gbfs[123] = -2170218158151725202L;
        mq.gbfs[124] = -2525383701958652641L;
        mq.gbfs[125] = -251551370817290189L;
        mq.gbfs[126] = 3565594085170790346L;
        mq.gbfs[127] = -4586495696430265766L;
        mq.gbfs[128] = 1263983709230832864L;
        mq.gbfs[129] = 5687068751233081921L;
        mq.gbfs[130] = 5641082307207415070L;
        mq.gbfs[131] = -925203349703937313L;
        mq.gbfs[132] = -8738563928086184975L;
        mq.gbfs[133] = -3985124811299528409L;
        mq.gbfs[134] = 8673229413001872867L;
        mq.gbfs[135] = -271092297807441050L;
        mq.gbfs[136] = -120552386610490625L;
        mq.gbfs[137] = -1727012660806946995L;
        mq.gbfs[138] = -8452948981495008263L;
        mq.gbfs[139] = 4941338737838388784L;
        mq.gbfs[140] = 4000597952666532074L;
        mq.gbfs[141] = -4184930931109607392L;
        mq.gbfs[142] = -5551166569564769557L;
        mq.gbfs[143] = -2209790612866795717L;
        mq.gbfs[144] = -4828336338965556553L;
        mq.gbfs[145] = -2766862711776292115L;
        mq.gbfs[146] = -9105520421937751347L;
        mq.gbfs[147] = -1932136194457637089L;
        mq.gbfs[148] = -5114104175685675623L;
        mq.gbfs[149] = -6870302354688687268L;
        mq.gbfs[150] = -7472987551062492890L;
        mq.gbfs[151] = -676285183384727808L;
        mq.gbfs[152] = 1787767079405678501L;
        mq.gbfs[153] = -2420131051630144468L;
        mq.gbfs[154] = -5445363631359723008L;
        mq.gbfs[155] = -8577310397919197035L;
        mq.gbfs[156] = 6058770298777000057L;
        mq.gbfs[157] = -6941073135893708915L;
        mq.gbfs[158] = -8616838542426409085L;
        mq.gbfs[159] = 3393161902036887554L;
        mq.gbfs[160] = 2540842607286822795L;
        mq.gbfs[161] = 7407949023043918663L;
        mq.gbfs[162] = -7780169001798807570L;
        mq.gbfs[163] = -4691641738626837209L;
        mq.gbfs[164] = 1404524516269581756L;
        mq.gbfs[165] = 5134695809081960667L;
        mq.gbfs[166] = -7833203519039365377L;
        mq.gbfs[167] = 1297682766019950323L;
        mq.gbfs[168] = 7389746982445854965L;
        mq.gbfs[169] = -7076889359305755716L;
        mq.gbfs[170] = -8806327165759616102L;
        mq.gbfs[171] = 3261438419245362550L;
        mq.gbfs[172] = -7579696729321489584L;
        mq.gbfs[173] = 7743510431515222030L;
        mq.gbfs[174] = 421434182202518766L;
        mq.gbfs[175] = 4872810571805300497L;
        mq.gbfs[176] = 7542072946337986640L;
        mq.gbfs[177] = 3604887049071239625L;
        mq.gbfs[178] = 9009850445968955499L;
        mq.gbfs[179] = -2469607641324491705L;
        mq.gbfs[180] = -8914833980007626626L;
        mq.gbfs[181] = -8956727440155713562L;
        mq.gbfs[182] = 1777691516228801430L;
        mq.gbfs[183] = 9078001298943858324L;
        mq.gbfs[184] = -1890375322425001670L;
        mq.gbfs[185] = -4524695991971512266L;
        mq.gbfs[186] = -729792821268009085L;
        mq.gbfs[187] = -6473019098407519615L;
        mq.gbfs[188] = -8260265829638514356L;
        mq.gbfs[189] = 5748385166849200290L;
        mq.gbfs[190] = -7362376030176313294L;
        mq.gbfs[191] = -574044152667752637L;
        mq.gbfs[192] = 4949786482325896797L;
        mq.gbfs[193] = 4550255780651827539L;
        mq.gbfs[194] = -8098742808965980355L;
        mq.gbfs[195] = 6588395296216114275L;
        mq.gbfs[196] = 3078758312694717765L;
        mq.gbfs[197] = -7360341295167489002L;
        mq.gbfs[198] = -1105986075064826537L;
        mq.gbfs[199] = -2489714091632005645L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean inPvpEnd() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbrf", gbfr(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mq.gbfu("gbrg", gbfw(int ), (int)213)) break;
            v0 /* !! */  = (long)mq.gbfu("gbrh", gbfw(int ), (int)214);
        }
        var2 = mq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbri", gbfr(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mq.gbfu("gbrj", gbfw(int ), (int)215)) break;
            v1 /* !! */  = (long)mq.gbfu("gbrk", gbfw(int ), (int)216);
        }
        var1_1 /* !! */  = mq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbrl", gbfr(int ), (int)60)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mq.gbfu("gbrm", gbfw(int ), (int)217)) break;
            v2 /* !! */  = (long)mq.gbfu("gbrn", gbfw(int ), (int)218);
        }
        var0_2 = mq.a;
        if (var2) {
            throw null;
lbl21:
            // 2 sources

            return (boolean)mq.gbfu("gbro", gbfw(int ), (int)219);
        }
        if (var0_2) ** GOTO lbl21
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 /* !! */  = mq.nc;
                if (true) ** GOTO lbl32
                block34: while (true) {
                    v3 /* !! */  = (long)(v4 - mq.gbfu("gbrp", gbfr(int ), (int)61));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2118391581: {
                            v4 = mq.gbfu("gbrq", gbfr(int ), (int)62);
                            continue block34;
                        }
                        case 1316563994: {
                            v4 = mq.gbfu("gbrr", gbfr(int ), (int)63);
                            continue block34;
                        }
                        case 1580885581: {
                            break block34;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbrs", gbfr(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mq.gbfu("gbrt", gbfw(int ), (int)220)) break;
                    v5 /* !! */  = (long)mq.gbfu("gbru", gbfw(int ), (int)221);
                }
                v6 = mq.mc.field_1705;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = mq.nc - mq.gbfu("gbrv", gbfr(int ), (int)65)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mq.gbfu("gbrw", gbfw(int ), (int)222)) break;
                    v7 /* !! */  = (long)mq.gbfu("gbrx", gbfw(int ), (int)223);
                }
                v8 = v6.method_1740();
                v9 /* !! */  = mq.nc;
                if (true) ** GOTO lbl57
                block37: while (true) {
                    v9 /* !! */  = (long)(v10 - mq.gbfu("gbry", gbfr(int ), (int)66));
lbl57:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -316988091: {
                            v10 = mq.gbfu("gbrz", gbfr(int ), (int)67);
                            continue block37;
                        }
                        case 71434211: {
                            v10 = mq.gbfu("gbsa", gbfr(int ), (int)68);
                            continue block37;
                        }
                        case 1580885581: {
                            break block37;
                        }
                    }
                    break;
                }
                v11 = v8.field_2060;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = mq.nc - mq.gbfu("gbsc", gbfr(int ), (int)69)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == mq.gbfu("gbsd", gbfw(int ), (int)224)) break;
                    v12 /* !! */  = (long)mq.gbfu("gbse", gbfw(int ), (int)225);
                }
                v13 = v11.values();
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = mq.nc - mq.gbfu("gbsf", gbfr(int ), (int)70)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == mq.gbfu("gbsg", gbfw(int ), (int)226)) break;
                    v14 /* !! */  = (long)mq.gbfu("gbsh", gbfw(int ), (int)227);
                }
                v15 = v13.stream();
                v16 /* !! */  = mq.nc;
                if (true) ** GOTO lbl83
                block40: while (true) {
                    v16 /* !! */  = (long)(v17 - mq.gbfu("gbsi", gbfr(int ), (int)71));
lbl83:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -972886125: {
                            v17 = mq.gbfu("gbsj", gbfr(int ), (int)72);
                            continue block40;
                        }
                        case 1580885581: {
                            break block40;
                        }
                        case 1662748926: {
                            v17 = mq.gbfu("gbsk", gbfr(int ), (int)73);
                            continue block40;
                        }
                    }
                    break;
                }
                v18 = (Function<class_345, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$inPvpEnd$2(net.minecraft.class_345 ), (Lnet/minecraft/class_345;)Ljava/lang/String;)();
                v19 /* !! */  = mq.nc;
                if (true) ** GOTO lbl97
                block41: while (true) {
                    v19 /* !! */  = (long)(mq.gbfu("gbsm", gbfr(int ), (int)75) - mq.gbfu("gbsl", gbfr(int ), (int)74));
lbl97:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 94589116: {
                            continue block41;
                        }
                        case 1580885581: {
                            break block41;
                        }
                    }
                    break;
                }
                v20 = v15.map(v18);
                v21 /* !! */  = mq.nc;
                if (true) ** GOTO lbl107
                block42: while (true) {
                    v21 /* !! */  = (long)(v22 - mq.gbfu("gbsn", gbfr(int ), (int)76));
lbl107:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -9842510: {
                            v22 = mq.gbfu("gbso", gbfr(int ), (int)77);
                            continue block42;
                        }
                        case 164911453: {
                            v22 = mq.gbfu("gbsp", gbfr(int ), (int)78);
                            continue block42;
                        }
                        case 1580885581: {
                            break block42;
                        }
                    }
                    break;
                }
                v23 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$inPvpEnd$3(java.lang.String ), (Ljava/lang/String;)Z)();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = mq.nc - mq.gbfu("gbsq", gbfr(int ), (int)79)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == mq.gbfu("gbsr", gbfw(int ), (int)228)) break;
                    v24 /* !! */  = (long)mq.gbfu("gbss", gbfw(int ), (int)229);
                }
                return v20.anyMatch(v23);
            }
lbl123:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)mq.gbfu("gbst", gbfw(int ), (int)230);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)mq.gbfu("gbsv", gbfw(int ), (int)231);
                if (!var2) ** GOTO lbl123
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)mq.gbfu("gbsw", gbfw(int ), (int)232);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)mq.gbfu("gbsx", gbfw(int ), (int)233);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String lambda$inPvp$0(class_345 var0) {
        v0 /* !! */  = mq.nc;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - mq.gbfu("gcdq", gbfr(int ), (int)204));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1498423930: {
                    v1 = mq.gbfu("gcdr", gbfr(int ), (int)205);
                    continue block22;
                }
                case -1424088468: {
                    v1 = mq.gbfu("gcds", gbfr(int ), (int)206);
                    continue block22;
                }
                case 292093036: {
                    v1 = mq.gbfu("gcdt", gbfr(int ), (int)207);
                    continue block22;
                }
                case 1580885581: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = mq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gcdu", gbfr(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mq.gbfu("gcdv", gbfw(int ), (int)388)) break;
            v2 /* !! */  = (long)mq.gbfu("gcdw", gbfw(int ), (int)389);
        }
        var2_2 /* !! */  = mq.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = mq.nc;
                if (true) ** GOTO lbl31
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - mq.gbfu("gcdx", gbfr(int ), (int)209));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2102929309: {
                            v4 = mq.gbfu("gcdy", gbfr(int ), (int)210);
                            continue block24;
                        }
                        case -1270821376: {
                            v4 = mq.gbfu("gcdz", gbfr(int ), (int)211);
                            continue block24;
                        }
                        case -180292796: {
                            v4 = mq.gbfu("gcea", gbfr(int ), (int)212);
                            continue block24;
                        }
                        case 1580885581: {
                            break block24;
                        }
                    }
                    break;
                }
                var1_3 = mq.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = mq.nc;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(mq.gbfu("gcec", gbfr(int ), (int)214) - mq.gbfu("gceb", gbfr(int ), (int)213));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1580885581: {
                            break block26;
                        }
                        case 1702708489: {
                            continue block26;
                        }
                    }
                    break;
                }
                v6 = var0.method_5414();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gced", gbfr(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == mq.gbfu("gcee", gbfw(int ), (int)390)) break;
                    v7 /* !! */  = (long)mq.gbfu("gcef", gbfw(int ), (int)391);
                }
                v8 = v6.getString();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gceg", gbfr(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == mq.gbfu("gceh", gbfw(int ), (int)392)) break;
                    v9 /* !! */  = (long)mq.gbfu("gcei", gbfw(int ), (int)393);
                }
                return v8.toLowerCase();
            }
            case 0: {
                var2_2 /* !! */  = (int)mq.gbfu("gcej", gbfw(int ), (int)394);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 1: {
                var2_2 /* !! */  = (int)mq.gbfu("gcek", gbfw(int ), (int)395);
                if (!var3_1) break;
                throw null;
            }
lbl80:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mq.gbfu("gcel", gbfw(int ), (int)396);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mq.gbfu("gcem", gbfw(int ), (int)397);
        ** while (!var3_1)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gceu() {
        mq.gbfy[200] = -1907642220;
        mq.gbfy[201] = -954534159;
        mq.gbfy[202] = -1637679557;
        mq.gbfy[203] = 2961400;
        mq.gbfy[204] = 952867374;
        mq.gbfy[205] = -1685330534;
        mq.gbfy[206] = -1377416301;
        mq.gbfy[207] = 582400843;
        mq.gbfy[208] = -865527246;
        mq.gbfy[209] = -1878139842;
        mq.gbfy[210] = -312313938;
        mq.gbfy[211] = -1143995508;
        mq.gbfy[212] = 868058871;
        mq.gbfy[213] = -1594183257;
        mq.gbfy[214] = -1205833329;
        mq.gbfy[215] = 339326449;
        mq.gbfy[216] = -330204830;
        mq.gbfy[217] = -332244401;
        mq.gbfy[218] = 1898117568;
        mq.gbfy[219] = -1805078367;
        mq.gbfy[220] = -15109933;
        mq.gbfy[221] = -91645921;
        mq.gbfy[222] = 1010064942;
        mq.gbfy[223] = -773807338;
        mq.gbfy[224] = -1299814500;
        mq.gbfy[225] = -1816188915;
        mq.gbfy[226] = -847472125;
        mq.gbfy[227] = 1068482690;
        mq.gbfy[228] = 875684517;
        mq.gbfy[229] = 2125795463;
        mq.gbfy[230] = -1578163511;
        mq.gbfy[231] = 1245832797;
        mq.gbfy[232] = 1431926721;
        mq.gbfy[233] = -1067906765;
        mq.gbfy[234] = 227803159;
        mq.gbfy[235] = -354529005;
        mq.gbfy[236] = -409075538;
        mq.gbfy[237] = 1559187214;
        mq.gbfy[238] = -1365025769;
        mq.gbfy[239] = -1585965187;
        mq.gbfy[240] = 462722599;
        mq.gbfy[241] = -2084320319;
        mq.gbfy[242] = 1679856141;
        mq.gbfy[243] = -245713154;
        mq.gbfy[244] = 204364383;
        mq.gbfy[245] = -1694792350;
        mq.gbfy[246] = 115268145;
        mq.gbfy[247] = 1079986314;
        mq.gbfy[248] = -558774243;
        mq.gbfy[249] = 1677547857;
        mq.gbfy[250] = 822298607;
        mq.gbfy[251] = 982686699;
        mq.gbfy[252] = 732444917;
        mq.gbfy[253] = -2138768284;
        mq.gbfy[254] = 837213956;
        mq.gbfy[255] = 359118393;
        mq.gbfy[256] = -1578324417;
        mq.gbfy[257] = 2040226721;
        mq.gbfy[258] = -519672245;
        mq.gbfy[259] = -1713773412;
        mq.gbfy[260] = -1770808337;
        mq.gbfy[261] = 969167299;
        mq.gbfy[262] = 123827102;
        mq.gbfy[263] = -525566772;
        mq.gbfy[264] = 908962729;
        mq.gbfy[265] = 1826482748;
        mq.gbfy[266] = -714743657;
        mq.gbfy[267] = 1292904858;
        mq.gbfy[268] = -1802323996;
        mq.gbfy[269] = -117785098;
        mq.gbfy[270] = -1385127407;
        mq.gbfy[271] = -156170171;
        mq.gbfy[272] = 121107780;
        mq.gbfy[273] = 1104953597;
        mq.gbfy[274] = -1911510226;
        mq.gbfy[275] = -1100678243;
        mq.gbfy[276] = 1920654218;
        mq.gbfy[277] = -1502700834;
        mq.gbfy[278] = 1220880344;
        mq.gbfy[279] = -1444407116;
        mq.gbfy[280] = 825502912;
        mq.gbfy[281] = -144699185;
        mq.gbfy[282] = 547798461;
        mq.gbfy[283] = -1328980849;
        mq.gbfy[284] = 103572843;
        mq.gbfy[285] = -373472744;
        mq.gbfy[286] = -753809284;
        mq.gbfy[287] = -1123409735;
        mq.gbfy[288] = 1579722760;
        mq.gbfy[289] = 166708153;
        mq.gbfy[290] = -2038491871;
        mq.gbfy[291] = -370337746;
        mq.gbfy[292] = -41945103;
        mq.gbfy[293] = -1508309143;
        mq.gbfy[294] = -543931639;
        mq.gbfy[295] = 1100082988;
        mq.gbfy[296] = -2128707959;
        mq.gbfy[297] = -302291377;
        mq.gbfy[298] = -853145294;
        mq.gbfy[299] = -1889229604;
    }

    private static /* synthetic */ double gbox(int n2) {
        return Double.longBitsToDouble(gbfs[n2] ^ gbft[n2]);
    }

    private static /* synthetic */ float gbia(int n2) {
        return Float.intBitsToFloat(gbfx[n2] ^ gbfy[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isCopyTime() {
        block37: {
            block36: {
                block35: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = mq.nc - mq.gbfu("gbub", gbfr(int ), (int)97)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  == mq.gbfu("gbuc", gbfw(int ), (int)246)) break;
                        v0 /* !! */  = (long)mq.gbfu("gbud", gbfw(int ), (int)247);
                    }
                    var2 = mq.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = mq.nc - mq.gbfu("gbue", gbfr(int ), (int)98)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v1 /* !! */  == mq.gbfu("gbuf", gbfw(int ), (int)248)) break;
                        v1 /* !! */  = (long)mq.gbfu("gbug", gbfw(int ), (int)249);
                    }
                    var1_1 = mq.b;
                    v2 /* !! */  = mq.nc;
                    if (true) ** GOTO lbl19
                    block19: while (true) {
                        v2 /* !! */  = (long)(v3 - mq.gbfu("gbuh", gbfr(int ), (int)99));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1721724852: {
                                v3 = mq.gbfu("gbui", gbfr(int ), (int)100);
                                continue block19;
                            }
                            case -1323349452: {
                                v3 = mq.gbfu("gbuj", gbfr(int ), (int)101);
                                continue block19;
                            }
                            case -669954599: {
                                v3 = mq.gbfu("gbuk", gbfr(int ), (int)102);
                                continue block19;
                            }
                            case 1580885581: {
                                break block19;
                            }
                        }
                        break;
                    }
                    var0_2 = mq.a;
                    if (var2) {
                        throw null;
lbl34:
                        // 6 sources

                        return (boolean)mq.gbfu("gbul", gbfw(int ), (int)250);
                    }
                    if (var0_2 || var0_2) ** GOTO lbl34
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = mq.nc - mq.gbfu("gbum", gbfr(int ), (int)103)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == mq.gbfu("gbun", gbfw(int ), (int)251)) break;
                        v4 /* !! */  = (long)mq.gbfu("gbuo", gbfw(int ), (int)252);
                    }
                    v5 /* !! */  = mq.nc;
                    if (true) ** GOTO lbl47
                    block22: while (true) {
                        v5 /* !! */  = (long)(v6 - mq.gbfu("gbup", gbfr(int ), (int)104));
lbl47:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case 1063827709: {
                                v6 = mq.gbfu("gbuq", gbfr(int ), (int)105);
                                continue block22;
                            }
                            case 1244590404: {
                                v6 = mq.gbfu("gbur", gbfr(int ), (int)106);
                                continue block22;
                            }
                            case 1580885581: {
                                break block22;
                            }
                        }
                        break;
                    }
                    if (mq.server.equals("CopyTime")) break block35;
                    if (var0_2) ** GOTO lbl34
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = mq.nc - mq.gbfu("gbus", gbfr(int ), (int)107)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == mq.gbfu("gbut", gbfw(int ), (int)253)) break;
                        v7 /* !! */  = (long)mq.gbfu("gbuu", gbfw(int ), (int)254);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_4 = mq.nc - mq.gbfu("gbuv", gbfr(int ), (int)108)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  == mq.gbfu("gbuw", gbfw(int ), (int)255)) break;
                        v8 /* !! */  = (long)mq.gbfu("gbux", gbfw(int ), (int)256);
                    }
                    if (mq.server.equals("SpookyTime")) break block35;
                    if (var0_2) ** GOTO lbl34
                    v9 /* !! */  = mq.nc;
                    if (true) ** GOTO lbl76
                    block25: while (true) {
                        v9 /* !! */  = (long)(v10 - mq.gbfu("gbuy", gbfr(int ), (int)109));
lbl76:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case 1220745090: {
                                v10 = mq.gbfu("gbuz", gbfr(int ), (int)110);
                                continue block25;
                            }
                            case 1307550703: {
                                v10 = mq.gbfu("gbva", gbfr(int ), (int)111);
                                continue block25;
                            }
                            case 1580885581: {
                                break block25;
                            }
                            case 1799589040: {
                                v10 = mq.gbfu("gbvb", gbfr(int ), (int)112);
                                continue block25;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_5 = mq.nc - mq.gbfu("gbvc", gbfr(int ), (int)113)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == mq.gbfu("gbvd", gbfw(int ), (int)257)) break;
                        v11 /* !! */  = (long)mq.gbfu("gbve", gbfw(int ), (int)258);
                    }
                    if (!mq.server.equals("FunTime")) break block36;
                    if (var0_2) ** GOTO lbl34
                }
                if (var0_2 || var0_2) ** GOTO lbl34
                v12 = mq.gbfu("gbvf", gbfw(int ), (int)259);
                if (var2) {
                    throw null;
                }
                break block37;
            }
            if (!var0_2 && !var0_2) ** break;
            ** while (true)
            v12 = mq.gbfu("gbvg", gbfw(int ), (int)260);
        }
        return (boolean)v12;
    }

    private static /* synthetic */ void gces() {
        mq.gbfy[0] = 1464090075;
        mq.gbfy[1] = -1115767927;
        mq.gbfy[2] = -1524964151;
        mq.gbfy[3] = 1069462852;
        mq.gbfy[4] = -1065829430;
        mq.gbfy[5] = 851479361;
        mq.gbfy[6] = -1463251281;
        mq.gbfy[7] = -1128426307;
        mq.gbfy[8] = -2073671712;
        mq.gbfy[9] = -1960286947;
        mq.gbfy[10] = 1733851360;
        mq.gbfy[11] = 1521062492;
        mq.gbfy[12] = -1394005288;
        mq.gbfy[13] = -1165198351;
        mq.gbfy[14] = 247531373;
        mq.gbfy[15] = 1010086184;
        mq.gbfy[16] = -1849872919;
        mq.gbfy[17] = -965720030;
        mq.gbfy[18] = 377683722;
        mq.gbfy[19] = -1069505874;
        mq.gbfy[20] = 1008786482;
        mq.gbfy[21] = -1614323940;
        mq.gbfy[22] = -2130698221;
        mq.gbfy[23] = 1333360666;
        mq.gbfy[24] = -666422209;
        mq.gbfy[25] = 726796617;
        mq.gbfy[26] = -164115440;
        mq.gbfy[27] = 170117683;
        mq.gbfy[28] = 1332798939;
        mq.gbfy[29] = -397167485;
        mq.gbfy[30] = 851797929;
        mq.gbfy[31] = -1722184611;
        mq.gbfy[32] = -162551075;
        mq.gbfy[33] = -1979898581;
        mq.gbfy[34] = 2066479278;
        mq.gbfy[35] = -1546758606;
        mq.gbfy[36] = -790516298;
        mq.gbfy[37] = 698778182;
        mq.gbfy[38] = -226460446;
        mq.gbfy[39] = 963800668;
        mq.gbfy[40] = -1200997691;
        mq.gbfy[41] = 286845213;
        mq.gbfy[42] = 1276415068;
        mq.gbfy[43] = -1900202531;
        mq.gbfy[44] = -2043076737;
        mq.gbfy[45] = -1163479125;
        mq.gbfy[46] = -1382190951;
        mq.gbfy[47] = -1261400749;
        mq.gbfy[48] = -1704468386;
        mq.gbfy[49] = -2094744189;
        mq.gbfy[50] = 577424783;
        mq.gbfy[51] = -99169667;
        mq.gbfy[52] = -1218455016;
        mq.gbfy[53] = 1472927473;
        mq.gbfy[54] = -432650237;
        mq.gbfy[55] = -2121530883;
        mq.gbfy[56] = 1023722004;
        mq.gbfy[57] = 430315104;
        mq.gbfy[58] = 236371223;
        mq.gbfy[59] = 1252763999;
        mq.gbfy[60] = -601736679;
        mq.gbfy[61] = -1209933830;
        mq.gbfy[62] = 1538711334;
        mq.gbfy[63] = -1677208231;
        mq.gbfy[64] = 963799880;
        mq.gbfy[65] = -104752235;
        mq.gbfy[66] = 144198612;
        mq.gbfy[67] = -2027972524;
        mq.gbfy[68] = 1115610188;
        mq.gbfy[69] = 851271885;
        mq.gbfy[70] = 1110011744;
        mq.gbfy[71] = -782351061;
        mq.gbfy[72] = 1023145679;
        mq.gbfy[73] = -1521467027;
        mq.gbfy[74] = -1526347461;
        mq.gbfy[75] = -1132094927;
        mq.gbfy[76] = -1638731729;
        mq.gbfy[77] = -843966958;
        mq.gbfy[78] = -618830370;
        mq.gbfy[79] = -60745608;
        mq.gbfy[80] = 873793905;
        mq.gbfy[81] = -1286672110;
        mq.gbfy[82] = 1056547288;
        mq.gbfy[83] = 817957712;
        mq.gbfy[84] = 38689397;
        mq.gbfy[85] = 1619549081;
        mq.gbfy[86] = 186812966;
        mq.gbfy[87] = -845151218;
        mq.gbfy[88] = -648176533;
        mq.gbfy[89] = -898973419;
        mq.gbfy[90] = -1190564410;
        mq.gbfy[91] = -801255922;
        mq.gbfy[92] = 358197125;
        mq.gbfy[93] = 2009312467;
        mq.gbfy[94] = 739406990;
        mq.gbfy[95] = -1826152710;
        mq.gbfy[96] = 1147443182;
        mq.gbfy[97] = -1364476438;
        mq.gbfy[98] = -1801433287;
        mq.gbfy[99] = -1529772213;
    }

    private static /* synthetic */ void gcfb() {
        mq.gbft[200] = -3384360676966160461L;
        mq.gbft[201] = -4476887583460635016L;
        mq.gbft[202] = -6981208295782189212L;
        mq.gbft[203] = -1896885865354357718L;
        mq.gbft[204] = 8791284463773821900L;
        mq.gbft[205] = 2159437008230940463L;
        mq.gbft[206] = -3692314523447079837L;
        mq.gbft[207] = -812905010029353147L;
        mq.gbft[208] = -8303694626754544050L;
        mq.gbft[209] = -5545812319267784411L;
        mq.gbft[210] = 1739385664505734978L;
        mq.gbft[211] = 4565598269078498559L;
        mq.gbft[212] = 7481817007343459395L;
        mq.gbft[213] = 7970447528568643675L;
        mq.gbft[214] = -3574737043835515290L;
        mq.gbft[215] = -1475750839241357245L;
        mq.gbft[216] = -6785939074322563410L;
    }

    /*
     * Exception decompiling
     */
    private static int getAnarchyMode() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE], 4[SWITCH]], but top level block is 8[SWITCH]
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

    private static /* synthetic */ void gcep() {
        mq.gbfx[100] = -757608962;
        mq.gbfx[101] = -1822329508;
        mq.gbfx[102] = 1772246212;
        mq.gbfx[103] = -1729665263;
        mq.gbfx[104] = 53689749;
        mq.gbfx[105] = -1853865373;
        mq.gbfx[106] = -833183525;
        mq.gbfx[107] = 1272441592;
        mq.gbfx[108] = -949108435;
        mq.gbfx[109] = 1668378991;
        mq.gbfx[110] = 1794574407;
        mq.gbfx[111] = 654005575;
        mq.gbfx[112] = -521444583;
        mq.gbfx[113] = -1179983787;
        mq.gbfx[114] = 1931539667;
        mq.gbfx[115] = 1373378686;
        mq.gbfx[116] = -2026253489;
        mq.gbfx[117] = -1373004167;
        mq.gbfx[118] = -382369583;
        mq.gbfx[119] = -684096780;
        mq.gbfx[120] = 1504482007;
        mq.gbfx[121] = -114612412;
        mq.gbfx[122] = 1408262723;
        mq.gbfx[123] = 308348681;
        mq.gbfx[124] = 228911430;
        mq.gbfx[125] = 1655194857;
        mq.gbfx[126] = 407468871;
        mq.gbfx[127] = -137929600;
        mq.gbfx[128] = -1377601940;
        mq.gbfx[129] = -892918655;
        mq.gbfx[130] = -1768020798;
        mq.gbfx[131] = 983237362;
        mq.gbfx[132] = -768116032;
        mq.gbfx[133] = 1263687878;
        mq.gbfx[134] = 1952220509;
        mq.gbfx[135] = -190977983;
        mq.gbfx[136] = 1895915973;
        mq.gbfx[137] = -259256932;
        mq.gbfx[138] = 607947377;
        mq.gbfx[139] = 1445738715;
        mq.gbfx[140] = -1591974066;
        mq.gbfx[141] = -1983153267;
        mq.gbfx[142] = -1682483957;
        mq.gbfx[143] = 1311938939;
        mq.gbfx[144] = -240849717;
        mq.gbfx[145] = 1878742506;
        mq.gbfx[146] = 505885301;
        mq.gbfx[147] = -583642290;
        mq.gbfx[148] = -1321494662;
        mq.gbfx[149] = 119982631;
        mq.gbfx[150] = 1510436524;
        mq.gbfx[151] = 2008429729;
        mq.gbfx[152] = 452898437;
        mq.gbfx[153] = -1703743287;
        mq.gbfx[154] = -1804821657;
        mq.gbfx[155] = 324216633;
        mq.gbfx[156] = 85356180;
        mq.gbfx[157] = 691359434;
        mq.gbfx[158] = -280814928;
        mq.gbfx[159] = 328975733;
        mq.gbfx[160] = 1095254178;
        mq.gbfx[161] = -474067866;
        mq.gbfx[162] = -1318387074;
        mq.gbfx[163] = -1488556332;
        mq.gbfx[164] = -556789977;
        mq.gbfx[165] = 779667633;
        mq.gbfx[166] = -375018032;
        mq.gbfx[167] = 1767481658;
        mq.gbfx[168] = -721540576;
        mq.gbfx[169] = 1752049831;
        mq.gbfx[170] = 1874497694;
        mq.gbfx[171] = 1803196574;
        mq.gbfx[172] = -217355156;
        mq.gbfx[173] = 1766886118;
        mq.gbfx[174] = -1619124715;
        mq.gbfx[175] = -1684636243;
        mq.gbfx[176] = -629368142;
        mq.gbfx[177] = -1725759505;
        mq.gbfx[178] = -1195451742;
        mq.gbfx[179] = 1143274242;
        mq.gbfx[180] = 1681336950;
        mq.gbfx[181] = -1362906369;
        mq.gbfx[182] = 1251881389;
        mq.gbfx[183] = -879600161;
        mq.gbfx[184] = 1609239827;
        mq.gbfx[185] = -512972855;
        mq.gbfx[186] = 569903155;
        mq.gbfx[187] = -266018898;
        mq.gbfx[188] = -357018656;
        mq.gbfx[189] = 48656745;
        mq.gbfx[190] = -2136964856;
        mq.gbfx[191] = 1868721838;
        mq.gbfx[192] = -979481557;
        mq.gbfx[193] = -1265025833;
        mq.gbfx[194] = 260168887;
        mq.gbfx[195] = 524672611;
        mq.gbfx[196] = 1051394678;
        mq.gbfx[197] = -1849246762;
        mq.gbfx[198] = 1952178560;
        mq.gbfx[199] = -2051201135;
    }

    private static /* synthetic */ void gcew() {
        mq.gbfs[0] = 3950588572113388763L;
        mq.gbfs[1] = -5016649830818175198L;
        mq.gbfs[2] = -8024124461012686357L;
        mq.gbfs[3] = 5216888419115707223L;
        mq.gbfs[4] = -5903605323131654560L;
        mq.gbfs[5] = -4211190727514319682L;
        mq.gbfs[6] = -2392992413911164796L;
        mq.gbfs[7] = 4026670165747762963L;
        mq.gbfs[8] = 3881094758339813676L;
        mq.gbfs[9] = 4874758299028349758L;
        mq.gbfs[10] = 7833097540375741862L;
        mq.gbfs[11] = 8707442871672398163L;
        mq.gbfs[12] = -4984641999990071624L;
        mq.gbfs[13] = -7171434428179346276L;
        mq.gbfs[14] = 5771797209163930272L;
        mq.gbfs[15] = -3415167170562284579L;
        mq.gbfs[16] = 684745493579796602L;
        mq.gbfs[17] = -6134063363779033984L;
        mq.gbfs[18] = -6222315969659050815L;
        mq.gbfs[19] = 7597446293360110634L;
        mq.gbfs[20] = 6896072020475658339L;
        mq.gbfs[21] = -7521056435704858609L;
        mq.gbfs[22] = -8597782502636120914L;
        mq.gbfs[23] = -3914005130509151923L;
        mq.gbfs[24] = -904506517506365021L;
        mq.gbfs[25] = 6403502291110463348L;
        mq.gbfs[26] = -3318091501610582306L;
        mq.gbfs[27] = 2115790636859588284L;
        mq.gbfs[28] = -8485418945495262323L;
        mq.gbfs[29] = 9117189384073868572L;
        mq.gbfs[30] = 7470866904217075634L;
        mq.gbfs[31] = 9075760383713629154L;
        mq.gbfs[32] = 6831557346380643514L;
        mq.gbfs[33] = -3152659423196183539L;
        mq.gbfs[34] = 696481747228289654L;
        mq.gbfs[35] = -6120222173062497510L;
        mq.gbfs[36] = -6631025572035725902L;
        mq.gbfs[37] = 4969844902299249811L;
        mq.gbfs[38] = -8163977884951466968L;
        mq.gbfs[39] = 271066621026733287L;
        mq.gbfs[40] = 4138236447049448410L;
        mq.gbfs[41] = 7681488296967667489L;
        mq.gbfs[42] = -3229037363382571601L;
        mq.gbfs[43] = -6633246271357053939L;
        mq.gbfs[44] = 6672584754817848722L;
        mq.gbfs[45] = -1104227641901861011L;
        mq.gbfs[46] = -2664915292000743997L;
        mq.gbfs[47] = 4693337763730409490L;
        mq.gbfs[48] = 9125715868284506210L;
        mq.gbfs[49] = -2488499075574708127L;
        mq.gbfs[50] = -8853954320750511052L;
        mq.gbfs[51] = 3076688168812711176L;
        mq.gbfs[52] = 8254553481908657109L;
        mq.gbfs[53] = 6927330379767648924L;
        mq.gbfs[54] = -7018867131042370141L;
        mq.gbfs[55] = 7497904086129030071L;
        mq.gbfs[56] = 7147993318430009307L;
        mq.gbfs[57] = -7734382440722735461L;
        mq.gbfs[58] = -1301831072726323425L;
        mq.gbfs[59] = 445441944050734340L;
        mq.gbfs[60] = 2800120880667509637L;
        mq.gbfs[61] = 3941739631124621900L;
        mq.gbfs[62] = -605708952672678349L;
        mq.gbfs[63] = -3868893363492022337L;
        mq.gbfs[64] = 6079979076380421213L;
        mq.gbfs[65] = -5373656147037977885L;
        mq.gbfs[66] = -2245838949576592354L;
        mq.gbfs[67] = -6077495143244138445L;
        mq.gbfs[68] = -2967904797554843614L;
        mq.gbfs[69] = 2490305581290062031L;
        mq.gbfs[70] = -1047626375435557495L;
        mq.gbfs[71] = -9013918835926057899L;
        mq.gbfs[72] = 3070972895988802787L;
        mq.gbfs[73] = -6722439076112272543L;
        mq.gbfs[74] = 8498555083392585108L;
        mq.gbfs[75] = 924896982213034035L;
        mq.gbfs[76] = -361339130102174209L;
        mq.gbfs[77] = -2662075178510404572L;
        mq.gbfs[78] = -7484471946164121782L;
        mq.gbfs[79] = -4307244211380157902L;
        mq.gbfs[80] = 5655698968541150416L;
        mq.gbfs[81] = -2180949694853499740L;
        mq.gbfs[82] = -3595358387925634669L;
        mq.gbfs[83] = -3114476838943198503L;
        mq.gbfs[84] = -6660675026483773381L;
        mq.gbfs[85] = -8018447223223039080L;
        mq.gbfs[86] = -2830371570567266579L;
        mq.gbfs[87] = -5954486988787427589L;
        mq.gbfs[88] = 3066281661985319777L;
        mq.gbfs[89] = 5102985032433370234L;
        mq.gbfs[90] = 1818114335165450181L;
        mq.gbfs[91] = -5482989964671982885L;
        mq.gbfs[92] = 7112727625064378648L;
        mq.gbfs[93] = -3608904439938470050L;
        mq.gbfs[94] = -314047209716066113L;
        mq.gbfs[95] = 7166858471747160974L;
        mq.gbfs[96] = -5205449202911362890L;
        mq.gbfs[97] = 4579400344845366384L;
        mq.gbfs[98] = -5920334365259477232L;
        mq.gbfs[99] = -1986285234307982192L;
    }
}

