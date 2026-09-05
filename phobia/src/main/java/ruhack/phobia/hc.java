/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1701
 *  net.minecraft.class_1802
 *  net.minecraft.class_2241
 *  net.minecraft.class_2338
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1701;
import net.minecraft.class_1802;
import net.minecraft.class_2241;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hy;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ow;
import ruhack.phobia.pp;

public class hc
extends ds {
    private static int[] eyqe;
    private class_2338 railPos;
    private int drawCounter;
    public final kf igniteMode;
    private static int[] eyqd;
    private static final int STAGE_SWAP_CART = 1;
    private int waitTicks;
    public final kb debugMessages;
    protected static final long ln = 3675624157676498236L;
    private static long[] eypw;
    private static final int STAGE_PLACE_CART = 2;
    public static final int b;
    public final kg drawTicks;
    private int stage;
    private static final int STAGE_SWAP_IGNITER = 3;
    private static final double BLOCK_REACH = 4.2;
    private static final int SEARCH_RADIUS = 5;
    public static final boolean c;
    private static final int STAGE_BOW_DRAW = 5;
    private static final int STAGE_FIND = 0;
    private static final int STAGE_FLINT_IGNITE = 4;
    private boolean silentSwap;
    public final kb ignite;
    public static final boolean a;
    public final kf swapMode;
    private static long[] eypv;
    private static final double ENTITY_REACH = 2.9;
    private static final int STAGE_RESTORE = 6;
    private boolean swapped;

    private static /* synthetic */ void fawq() {
        hc.eyqe[0] = 1957347544;
        hc.eyqe[1] = -1890736610;
        hc.eyqe[2] = -566475159;
        hc.eyqe[3] = -1814606976;
        hc.eyqe[4] = -1993048939;
        hc.eyqe[5] = -806148533;
        hc.eyqe[6] = -903318425;
        hc.eyqe[7] = -698207772;
        hc.eyqe[8] = 1027021522;
        hc.eyqe[9] = -419174667;
        hc.eyqe[10] = 1184056188;
        hc.eyqe[11] = 1852223642;
        hc.eyqe[12] = 106669111;
        hc.eyqe[13] = -1117759312;
        hc.eyqe[14] = 1849291506;
        hc.eyqe[15] = -1756924154;
        hc.eyqe[16] = -1047686229;
        hc.eyqe[17] = 535172864;
        hc.eyqe[18] = -254517049;
        hc.eyqe[19] = 1432613354;
        hc.eyqe[20] = 167010948;
        hc.eyqe[21] = -1502889585;
        hc.eyqe[22] = -1669448107;
        hc.eyqe[23] = 1712090572;
        hc.eyqe[24] = 1157530070;
        hc.eyqe[25] = 110756911;
        hc.eyqe[26] = -2125075414;
        hc.eyqe[27] = -17061885;
        hc.eyqe[28] = 1065985751;
        hc.eyqe[29] = -1130166947;
        hc.eyqe[30] = 1723821366;
        hc.eyqe[31] = 1073618849;
        hc.eyqe[32] = 763473663;
        hc.eyqe[33] = -171353128;
        hc.eyqe[34] = 1857135693;
        hc.eyqe[35] = 1299050176;
        hc.eyqe[36] = -875498338;
        hc.eyqe[37] = -1321749544;
        hc.eyqe[38] = -1891175852;
        hc.eyqe[39] = 1544443423;
        hc.eyqe[40] = -991151703;
        hc.eyqe[41] = -2087986936;
        hc.eyqe[42] = -1484955443;
        hc.eyqe[43] = 440441947;
        hc.eyqe[44] = -2070714160;
        hc.eyqe[45] = -192237532;
        hc.eyqe[46] = 349325627;
        hc.eyqe[47] = 422594032;
        hc.eyqe[48] = 1024936133;
        hc.eyqe[49] = -875040575;
        hc.eyqe[50] = 2068745447;
        hc.eyqe[51] = -1492765347;
        hc.eyqe[52] = -529433365;
        hc.eyqe[53] = -654641706;
        hc.eyqe[54] = -533380389;
        hc.eyqe[55] = -133588678;
        hc.eyqe[56] = 837816644;
        hc.eyqe[57] = -1696415439;
        hc.eyqe[58] = 2054570765;
        hc.eyqe[59] = -99501558;
        hc.eyqe[60] = -207568502;
        hc.eyqe[61] = 664187094;
        hc.eyqe[62] = -35444347;
        hc.eyqe[63] = -198631863;
        hc.eyqe[64] = 512459775;
        hc.eyqe[65] = 1886674523;
        hc.eyqe[66] = -139302365;
        hc.eyqe[67] = -1669076816;
        hc.eyqe[68] = 1028620590;
        hc.eyqe[69] = -381997818;
        hc.eyqe[70] = 1977847616;
        hc.eyqe[71] = -805074749;
        hc.eyqe[72] = 1172365333;
        hc.eyqe[73] = 554719784;
        hc.eyqe[74] = -1289954362;
        hc.eyqe[75] = -992380176;
        hc.eyqe[76] = -75092321;
        hc.eyqe[77] = 608157931;
        hc.eyqe[78] = 308013513;
        hc.eyqe[79] = 324507851;
        hc.eyqe[80] = 267165166;
        hc.eyqe[81] = -1975859713;
        hc.eyqe[82] = 1010743040;
        hc.eyqe[83] = -1944419428;
        hc.eyqe[84] = 1615845510;
        hc.eyqe[85] = 95278399;
        hc.eyqe[86] = -62500027;
        hc.eyqe[87] = -1970299394;
        hc.eyqe[88] = -310547893;
        hc.eyqe[89] = -639749054;
        hc.eyqe[90] = 1310229784;
        hc.eyqe[91] = -490436186;
        hc.eyqe[92] = 35403145;
        hc.eyqe[93] = 1552611249;
        hc.eyqe[94] = -1534223911;
        hc.eyqe[95] = 98177843;
        hc.eyqe[96] = -416619520;
        hc.eyqe[97] = -1191418412;
        hc.eyqe[98] = -830490992;
        hc.eyqe[99] = 757439879;
    }

    public static /* synthetic */ CallSite eypx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean isRail(class_2680 class_26802) {
        boolean bl2;
        Object object = ln;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - hc.eypx("fagz", eypu(int ), (int)126);
            }
            switch ((int)object) {
                case -2113115097: {
                    callSite = hc.eypx("faha", eypu(int ), (int)127);
                    continue block16;
                }
                case -2086697396: {
                    callSite = hc.eypx("fahb", eypu(int ), (int)128);
                    continue block16;
                }
                case -155803333: {
                    callSite = hc.eypx("fahc", eypu(int ), (int)129);
                    continue block16;
                }
                case 1982262588: {
                    break block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ln;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - hc.eypx("fahd", eypu(int ), (int)130);
            }
            switch ((int)object2) {
                case 4820478: {
                    callSite = hc.eypx("fahe", eypu(int ), (int)131);
                    continue block17;
                }
                case 1982262588: {
                    break block17;
                }
                case 2071615147: {
                    callSite = hc.eypx("fahk", eypu(int ), (int)132);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ln - hc.eypx("fahl", eypu(int ), (int)133)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == hc.eypx("fahm", eyqb(int ), (int)420)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = hc.eypx("fahn", eyqb(int ), (int)421);
        }
        if (bl2) return (boolean)hc.eypx("faho", eyqb(int ), (int)422);
        if (bl2) return (boolean)hc.eypx("faho", eyqb(int ), (int)422);
        Object object4 = ln;
        boolean bl6 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - hc.eypx("fahp", eypu(int ), (int)134);
            }
            switch ((int)object4) {
                case 388217780: {
                    callSite = hc.eypx("fahx", eypu(int ), (int)135);
                    continue block19;
                }
                case 1982262588: {
                    return class_26802.method_26204() instanceof class_2241;
                }
                case 2119544100: {
                    callSite = hc.eypx("fahy", eypu(int ), (int)136);
                    continue block19;
                }
            }
            break;
        }
        return class_26802.method_26204() instanceof class_2241;
    }

    private static /* synthetic */ void fawo() {
        hc.eyqd[400] = -877519173;
        hc.eyqd[401] = 337293724;
        hc.eyqd[402] = -1790359986;
        hc.eyqd[403] = -298063543;
        hc.eyqd[404] = 1558227254;
        hc.eyqd[405] = 58818007;
        hc.eyqd[406] = 1526561794;
        hc.eyqd[407] = 336952354;
        hc.eyqd[408] = -635666939;
        hc.eyqd[409] = 662534838;
        hc.eyqd[410] = 658466461;
        hc.eyqd[411] = -545469219;
        hc.eyqd[412] = -1080388747;
        hc.eyqd[413] = -719659343;
        hc.eyqd[414] = 1482383638;
        hc.eyqd[415] = -1848453248;
        hc.eyqd[416] = -980400287;
        hc.eyqd[417] = -10079468;
        hc.eyqd[418] = 855023444;
        hc.eyqd[419] = -1509319244;
        hc.eyqd[420] = -84299277;
        hc.eyqd[421] = -1846518940;
        hc.eyqd[422] = 974779492;
        hc.eyqd[423] = -1686760274;
        hc.eyqd[424] = 1073193354;
        hc.eyqd[425] = -1635334349;
        hc.eyqd[426] = 1291435597;
        hc.eyqd[427] = -1710334420;
        hc.eyqd[428] = 176328582;
        hc.eyqd[429] = 1518655142;
        hc.eyqd[430] = 502913889;
        hc.eyqd[431] = 1170661988;
        hc.eyqd[432] = -46807507;
        hc.eyqd[433] = 363329338;
        hc.eyqd[434] = -203691967;
        hc.eyqd[435] = 1387647092;
        hc.eyqd[436] = 690269156;
        hc.eyqd[437] = -626513925;
        hc.eyqd[438] = -1159558536;
        hc.eyqd[439] = -998184057;
        hc.eyqd[440] = -1172125804;
        hc.eyqd[441] = -888333647;
        hc.eyqd[442] = -1801629455;
        hc.eyqd[443] = -126421876;
        hc.eyqd[444] = -1339712720;
        hc.eyqd[445] = -2004556326;
        hc.eyqd[446] = 1967620963;
        hc.eyqd[447] = 544024103;
        hc.eyqd[448] = -47646469;
        hc.eyqd[449] = 481875698;
        hc.eyqd[450] = -1846333108;
        hc.eyqd[451] = -1720631133;
        hc.eyqd[452] = -1847830026;
        hc.eyqd[453] = 826216404;
        hc.eyqd[454] = -1446263407;
        hc.eyqd[455] = 61162458;
        hc.eyqd[456] = 999489527;
        hc.eyqd[457] = -2022666438;
        hc.eyqd[458] = -1332118319;
        hc.eyqd[459] = -1292893450;
        hc.eyqd[460] = 1543015147;
        hc.eyqd[461] = -1416076684;
        hc.eyqd[462] = 631955957;
        hc.eyqd[463] = 1355557146;
        hc.eyqd[464] = -751428880;
        hc.eyqd[465] = 1620017901;
        hc.eyqd[466] = 1921615207;
        hc.eyqd[467] = 2069742981;
        hc.eyqd[468] = -2037988202;
        hc.eyqd[469] = 128159210;
        hc.eyqd[470] = -1460256616;
        hc.eyqd[471] = 1377645521;
        hc.eyqd[472] = -10780855;
        hc.eyqd[473] = -757525036;
        hc.eyqd[474] = 1318742015;
        hc.eyqd[475] = 40558172;
        hc.eyqd[476] = -522338634;
        hc.eyqd[477] = -784763324;
        hc.eyqd[478] = 1930388210;
        hc.eyqd[479] = -1236101315;
        hc.eyqd[480] = -1012791362;
        hc.eyqd[481] = 1233210809;
        hc.eyqd[482] = -1315959661;
        hc.eyqd[483] = -1586767867;
        hc.eyqd[484] = 2004796571;
        hc.eyqd[485] = -1145593796;
        hc.eyqd[486] = 1625411955;
        hc.eyqd[487] = 1315824332;
        hc.eyqd[488] = 765480821;
        hc.eyqd[489] = -1748163468;
        hc.eyqd[490] = -1281016439;
        hc.eyqd[491] = 70428260;
        hc.eyqd[492] = 1142649733;
        hc.eyqd[493] = -1999764501;
        hc.eyqd[494] = -1126067374;
        hc.eyqd[495] = -2074904034;
        hc.eyqd[496] = 755034751;
        hc.eyqd[497] = 1606214624;
        hc.eyqd[498] = 220113251;
        hc.eyqd[499] = -755510815;
    }

    private static /* synthetic */ void faws() {
        hc.eyqe[100] = -2032776170;
        hc.eyqe[101] = 2042352603;
        hc.eyqe[102] = 2120660813;
        hc.eyqe[103] = 255509874;
        hc.eyqe[104] = 1331025002;
        hc.eyqe[105] = -1535357458;
        hc.eyqe[106] = 1177517635;
        hc.eyqe[107] = 1175882206;
        hc.eyqe[108] = 1240841771;
        hc.eyqe[109] = 1542909803;
        hc.eyqe[110] = -1250554964;
        hc.eyqe[111] = 495079386;
        hc.eyqe[112] = 190437781;
        hc.eyqe[113] = 94016502;
        hc.eyqe[114] = -879198534;
        hc.eyqe[115] = -433804635;
        hc.eyqe[116] = 254655470;
        hc.eyqe[117] = -1342251824;
        hc.eyqe[118] = -536490363;
        hc.eyqe[119] = 1600904518;
        hc.eyqe[120] = -1978706979;
        hc.eyqe[121] = 1215677167;
        hc.eyqe[122] = 1199800315;
        hc.eyqe[123] = 894381506;
        hc.eyqe[124] = 1475823600;
        hc.eyqe[125] = -81190449;
        hc.eyqe[126] = 2091498948;
        hc.eyqe[127] = -1662775403;
        hc.eyqe[128] = 1178277787;
        hc.eyqe[129] = -263469508;
        hc.eyqe[130] = 56743914;
        hc.eyqe[131] = 1380971374;
        hc.eyqe[132] = -1568242959;
        hc.eyqe[133] = -2143605277;
        hc.eyqe[134] = -506212897;
        hc.eyqe[135] = 865837789;
        hc.eyqe[136] = -1389539770;
        hc.eyqe[137] = -381342683;
        hc.eyqe[138] = 1662252228;
        hc.eyqe[139] = 1723081546;
        hc.eyqe[140] = 1684216853;
        hc.eyqe[141] = -1704818642;
        hc.eyqe[142] = -1525793304;
        hc.eyqe[143] = -1583197143;
        hc.eyqe[144] = 737968420;
        hc.eyqe[145] = -508237754;
        hc.eyqe[146] = -822025842;
        hc.eyqe[147] = -152978325;
        hc.eyqe[148] = -907364635;
        hc.eyqe[149] = -1146642842;
        hc.eyqe[150] = -1431277070;
        hc.eyqe[151] = -648922313;
        hc.eyqe[152] = 919965727;
        hc.eyqe[153] = -1250416114;
        hc.eyqe[154] = 1151048334;
        hc.eyqe[155] = 449286105;
        hc.eyqe[156] = -498232371;
        hc.eyqe[157] = 2095350613;
        hc.eyqe[158] = 1058344857;
        hc.eyqe[159] = -520819462;
        hc.eyqe[160] = 1833591366;
        hc.eyqe[161] = 1275757377;
        hc.eyqe[162] = 2106487248;
        hc.eyqe[163] = -845018351;
        hc.eyqe[164] = 306694301;
        hc.eyqe[165] = -177930920;
        hc.eyqe[166] = -1865995657;
        hc.eyqe[167] = 1945792025;
        hc.eyqe[168] = 714483274;
        hc.eyqe[169] = -846700937;
        hc.eyqe[170] = -163675230;
        hc.eyqe[171] = 882823812;
        hc.eyqe[172] = -1835464439;
        hc.eyqe[173] = 134866145;
        hc.eyqe[174] = 1836613808;
        hc.eyqe[175] = 2016146799;
        hc.eyqe[176] = 1425613570;
        hc.eyqe[177] = -1608923750;
        hc.eyqe[178] = -1063699688;
        hc.eyqe[179] = 728312854;
        hc.eyqe[180] = -1652752599;
        hc.eyqe[181] = 1963578102;
        hc.eyqe[182] = -875378841;
        hc.eyqe[183] = 1015316105;
        hc.eyqe[184] = -1047652377;
        hc.eyqe[185] = -1803585428;
        hc.eyqe[186] = -60954999;
        hc.eyqe[187] = 2095659423;
        hc.eyqe[188] = 1420178426;
        hc.eyqe[189] = -2002182225;
        hc.eyqe[190] = 477497158;
        hc.eyqe[191] = -1030149077;
        hc.eyqe[192] = 205204888;
        hc.eyqe[193] = 96228095;
        hc.eyqe[194] = 39148559;
        hc.eyqe[195] = -306183315;
        hc.eyqe[196] = 1467844570;
        hc.eyqe[197] = 813904059;
        hc.eyqe[198] = -1800009477;
        hc.eyqe[199] = -960791861;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block42: {
            block41: {
                v0 /* !! */  = hc.ln;
                if (true) ** GOTO lbl5
                block27: while (true) {
                    v0 /* !! */  = (long)(v1 - hc.eypx("eyvp", eypu(int ), (int)19));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1928928716: {
                            v1 = hc.eypx("eyvr", eypu(int ), (int)20);
                            continue block27;
                        }
                        case 1167625767: {
                            v1 = hc.eypx("eyvs", eypu(int ), (int)21);
                            continue block27;
                        }
                        case 1982262588: {
                            break block27;
                        }
                    }
                    break;
                }
                var3_1 = hc.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("eyvu", eypu(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hc.eypx("eyvw", eyqb(int ), (int)52)) break;
                    v2 /* !! */  = (long)hc.eypx("eywe", eyqb(int ), (int)53);
                }
                var2_2 = hc.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("eywg", eypu(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hc.eypx("eywi", eyqb(int ), (int)54)) break;
                    v3 /* !! */  = (long)hc.eypx("eywk", eyqb(int ), (int)55);
                }
                var1_3 = hc.a;
                if (var3_1) {
                    throw null;
lbl29:
                    // 9 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("eywm", eypu(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hc.eypx("eywo", eyqb(int ), (int)56)) break;
                    v4 /* !! */  = (long)hc.eypx("eywu", eyqb(int ), (int)57);
                }
                if (this.stage != hc.eypx("eywv", eyqb(int ), (int)58)) break block41;
                if (var1_3 || var1_3) ** GOTO lbl29
                v5 /* !! */  = hc.ln;
                if (true) ** GOTO lbl43
                block32: while (true) {
                    v5 /* !! */  = (long)(hc.eypx("eyxa", eypu(int ), (int)26) - hc.eypx("eywy", eypu(int ), (int)25));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 325395726: {
                            continue block32;
                        }
                        case 1982262588: {
                            break block32;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = hc.ln - hc.eypx("eyxb", eypu(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hc.eypx("eyxd", eyqb(int ), (int)59)) break;
                    v6 /* !! */  = (long)hc.eypx("eyxf", eyqb(int ), (int)60);
                }
                v7 = hc.mc.field_1690;
                v8 /* !! */  = hc.ln;
                if (true) ** GOTO lbl58
                block34: while (true) {
                    v8 /* !! */  = (long)(v9 - hc.eypx("eyxh", eypu(int ), (int)28));
lbl58:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 904257283: {
                            v9 = hc.eypx("eyxj", eypu(int ), (int)29);
                            continue block34;
                        }
                        case 1982262588: {
                            break block34;
                        }
                        case 2131932642: {
                            v9 = hc.eypx("eyxk", eypu(int ), (int)30);
                            continue block34;
                        }
                    }
                    break;
                }
                v10 = v7.field_1904;
                v11 = hc.eypx("eyxm", eyqb(int ), (int)61);
                v12 /* !! */  = hc.ln;
                if (true) ** GOTO lbl73
                block35: while (true) {
                    v12 /* !! */  = (long)(hc.eypx("eyxq", eypu(int ), (int)32) - hc.eypx("eyxo", eypu(int ), (int)31));
lbl73:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 505336416: {
                            continue block35;
                        }
                        case 1982262588: {
                            break block35;
                        }
                    }
                    break;
                }
                v10.method_23481((boolean)v11);
                if (var1_3) ** GOTO lbl29
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            v13 /* !! */  = hc.ln;
            if (true) ** GOTO lbl86
            block36: while (true) {
                v13 /* !! */  = (long)(v14 - hc.eypx("eyxt", eypu(int ), (int)33));
lbl86:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1067269951: {
                        v14 = hc.eypx("eyxu", eypu(int ), (int)34);
                        continue block36;
                    }
                    case 948115842: {
                        v14 = hc.eypx("eyxv", eypu(int ), (int)35);
                        continue block36;
                    }
                    case 1982262588: {
                        break block36;
                    }
                }
                break;
            }
            if (!this.swapped) break block42;
            if (var1_3 || var1_3) ** GOTO lbl29
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = hc.ln - hc.eypx("eyxx", eypu(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hc.eypx("eyxz", eyqb(int ), (int)62)) break;
                v15 /* !! */  = (long)hc.eypx("eyyb", eyqb(int ), (int)63);
            }
            this.restoreSlot();
            if (var1_3 || var1_3) ** GOTO lbl29
            v16 = hc.eypx("eyyc", eyqb(int ), (int)64);
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = hc.ln - hc.eypx("eyyg", eypu(int ), (int)37)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hc.eypx("eyyh", eyqb(int ), (int)65)) break;
                v17 /* !! */  = (long)hc.eypx("eyyi", eyqb(int ), (int)66);
            }
            this.swapped = v16;
            if (var1_3) ** GOTO lbl29
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v18 /* !! */  = hc.ln;
        if (true) ** GOTO lbl118
        block39: while (true) {
            v18 /* !! */  = (long)(hc.eypx("eyyn", eypu(int ), (int)39) - hc.eypx("eyyl", eypu(int ), (int)38));
lbl118:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case 1603993748: {
                    continue block39;
                }
                case 1982262588: {
                    break block39;
                }
            }
            break;
        }
        this.railPos = null;
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    static {
        eyqd = new int[554];
        eyqe = new int[554];
        hc.fawi();
        hc.fawk();
        hc.fawm();
        hc.fawn();
        hc.fawo();
        hc.fawp();
        hc.fawq();
        hc.faws();
        hc.fawu();
        hc.fawx();
        hc.fawy();
        hc.faxa();
        eypv = new long[243];
        eypw = new long[243];
        hc.faxc();
        hc.faxf();
        hc.faxh();
        hc.faxi();
        hc.faxj();
        hc.faxk();
    }

    private static /* synthetic */ long eypu(int n2) {
        return eypv[n2] ^ eypw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hc getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("eypz", eypu(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hc.eypx("eyqf", eyqb(int ), (int)0)) break;
            v0 /* !! */  = (long)hc.eypx("eyqh", eyqb(int ), (int)1);
        }
        var2 = hc.c;
        v1 /* !! */  = hc.ln;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(hc.eypx("eyqm", eypu(int ), (int)2) - hc.eypx("eyqi", eypu(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -915590564: {
                    continue block11;
                }
                case 1982262588: {
                    break block11;
                }
            }
            break;
        }
        var1_1 /* !! */  = hc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("eyqn", eypu(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hc.eypx("eyqo", eyqb(int ), (int)2)) break;
            v2 /* !! */  = (long)hc.eypx("eyqp", eyqb(int ), (int)3);
        }
        var0_2 = hc.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("eyqq", eypu(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hc.eypx("eyqr", eyqb(int ), (int)4)) break;
                    v3 /* !! */  = (long)hc.eypx("eyqt", eyqb(int ), (int)5);
                }
                return nj.get(hc.class);
            }
lbl41:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)hc.eypx("eyqy", eyqb(int ), (int)6);
                } while (!var2);
                throw null;
            }
lbl46:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)hc.eypx("eyra", eyqb(int ), (int)7);
                if (!var2) ** GOTO lbl41
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)hc.eypx("eyrc", eyqb(int ), (int)8);
                if (!var2) ** GOTO lbl46
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)hc.eypx("eyrd", eyqb(int ), (int)9);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void fawm() {
        hc.eyqd[200] = 1436579423;
        hc.eyqd[201] = 1964311628;
        hc.eyqd[202] = -869683579;
        hc.eyqd[203] = -1521855796;
        hc.eyqd[204] = 2007513918;
        hc.eyqd[205] = 440342352;
        hc.eyqd[206] = -1511468737;
        hc.eyqd[207] = -700497053;
        hc.eyqd[208] = -215613754;
        hc.eyqd[209] = 1491080414;
        hc.eyqd[210] = -422580330;
        hc.eyqd[211] = -1858839523;
        hc.eyqd[212] = -132741531;
        hc.eyqd[213] = 1070170445;
        hc.eyqd[214] = -1671942270;
        hc.eyqd[215] = -2037478306;
        hc.eyqd[216] = -1081381569;
        hc.eyqd[217] = 1776303079;
        hc.eyqd[218] = 1236666637;
        hc.eyqd[219] = 384318155;
        hc.eyqd[220] = 1226621562;
        hc.eyqd[221] = -294784444;
        hc.eyqd[222] = -249014552;
        hc.eyqd[223] = -889901257;
        hc.eyqd[224] = 1687892998;
        hc.eyqd[225] = -1205663857;
        hc.eyqd[226] = -1054434199;
        hc.eyqd[227] = -983484148;
        hc.eyqd[228] = 1113138279;
        hc.eyqd[229] = -412526340;
        hc.eyqd[230] = 851807339;
        hc.eyqd[231] = 2051950733;
        hc.eyqd[232] = -1461497133;
        hc.eyqd[233] = 899536095;
        hc.eyqd[234] = 915733343;
        hc.eyqd[235] = -1053954781;
        hc.eyqd[236] = 1902640870;
        hc.eyqd[237] = -1311774954;
        hc.eyqd[238] = -2018843412;
        hc.eyqd[239] = 1358789083;
        hc.eyqd[240] = -2037014367;
        hc.eyqd[241] = 839061718;
        hc.eyqd[242] = 96675698;
        hc.eyqd[243] = 1403724575;
        hc.eyqd[244] = 849912105;
        hc.eyqd[245] = -1763687197;
        hc.eyqd[246] = -1215033574;
        hc.eyqd[247] = 517864951;
        hc.eyqd[248] = -1829652874;
        hc.eyqd[249] = 2022298815;
        hc.eyqd[250] = -1175196812;
        hc.eyqd[251] = 1572968001;
        hc.eyqd[252] = -275464428;
        hc.eyqd[253] = 186518608;
        hc.eyqd[254] = 1466708835;
        hc.eyqd[255] = 1544653955;
        hc.eyqd[256] = 131749580;
        hc.eyqd[257] = 1570883815;
        hc.eyqd[258] = 43712040;
        hc.eyqd[259] = 1840282837;
        hc.eyqd[260] = 208430342;
        hc.eyqd[261] = 2009963219;
        hc.eyqd[262] = 747363050;
        hc.eyqd[263] = 316213683;
        hc.eyqd[264] = -1820822871;
        hc.eyqd[265] = 265116586;
        hc.eyqd[266] = 1799173671;
        hc.eyqd[267] = -558964511;
        hc.eyqd[268] = -986151707;
        hc.eyqd[269] = 1907043345;
        hc.eyqd[270] = 471331325;
        hc.eyqd[271] = -404682703;
        hc.eyqd[272] = -334644584;
        hc.eyqd[273] = -333689912;
        hc.eyqd[274] = 1718800013;
        hc.eyqd[275] = -1200763577;
        hc.eyqd[276] = 2019953549;
        hc.eyqd[277] = 1794591641;
        hc.eyqd[278] = 60018618;
        hc.eyqd[279] = 229384410;
        hc.eyqd[280] = 140033212;
        hc.eyqd[281] = 1811970343;
        hc.eyqd[282] = -2009220219;
        hc.eyqd[283] = -70957676;
        hc.eyqd[284] = -1552184518;
        hc.eyqd[285] = -667774783;
        hc.eyqd[286] = -1476896927;
        hc.eyqd[287] = 453316138;
        hc.eyqd[288] = -1248910626;
        hc.eyqd[289] = 145006875;
        hc.eyqd[290] = 660181903;
        hc.eyqd[291] = -452040659;
        hc.eyqd[292] = 1392102917;
        hc.eyqd[293] = 865685896;
        hc.eyqd[294] = -1131900408;
        hc.eyqd[295] = -1428588566;
        hc.eyqd[296] = 1811623454;
        hc.eyqd[297] = -1476881819;
        hc.eyqd[298] = -1836428061;
        hc.eyqd[299] = -1368854059;
    }

    private static /* synthetic */ void fawk() {
        hc.eyqd[100] = -2032776170;
        hc.eyqd[101] = 2042352600;
        hc.eyqd[102] = 2120660811;
        hc.eyqd[103] = 255509875;
        hc.eyqd[104] = 1331025000;
        hc.eyqd[105] = -1535357458;
        hc.eyqd[106] = 1177517635;
        hc.eyqd[107] = 1175882205;
        hc.eyqd[108] = 1240841773;
        hc.eyqd[109] = 1542909802;
        hc.eyqd[110] = -1250554972;
        hc.eyqd[111] = 495079386;
        hc.eyqd[112] = 190437776;
        hc.eyqd[113] = 94016498;
        hc.eyqd[114] = -879198532;
        hc.eyqd[115] = -433804635;
        hc.eyqd[116] = 254655471;
        hc.eyqd[117] = -1342251823;
        hc.eyqd[118] = -536490363;
        hc.eyqd[119] = 1600904512;
        hc.eyqd[120] = -1978706979;
        hc.eyqd[121] = 1215677167;
        hc.eyqd[122] = 1199800316;
        hc.eyqd[123] = 894381389;
        hc.eyqd[124] = 1475823482;
        hc.eyqd[125] = -81190405;
        hc.eyqd[126] = 2091498979;
        hc.eyqd[127] = -1662775405;
        hc.eyqd[128] = 1178277694;
        hc.eyqd[129] = -263469401;
        hc.eyqd[130] = 56743851;
        hc.eyqd[131] = 1380971506;
        hc.eyqd[132] = -1568243104;
        hc.eyqd[133] = -2143605434;
        hc.eyqd[134] = -506213039;
        hc.eyqd[135] = 865837715;
        hc.eyqd[136] = -1389539733;
        hc.eyqd[137] = -381342693;
        hc.eyqd[138] = 1662252101;
        hc.eyqd[139] = 1723081692;
        hc.eyqd[140] = 1684217008;
        hc.eyqd[141] = -1704818593;
        hc.eyqd[142] = -1525793360;
        hc.eyqd[143] = -1583197118;
        hc.eyqd[144] = 737968454;
        hc.eyqd[145] = -508237707;
        hc.eyqd[146] = -822025754;
        hc.eyqd[147] = -152978321;
        hc.eyqd[148] = -907364736;
        hc.eyqd[149] = -1146642942;
        hc.eyqd[150] = -1431277142;
        hc.eyqd[151] = -648922271;
        hc.eyqd[152] = 919965716;
        hc.eyqd[153] = -1250415999;
        hc.eyqd[154] = 1151048370;
        hc.eyqd[155] = 449286039;
        hc.eyqd[156] = -498232324;
        hc.eyqd[157] = 2095350629;
        hc.eyqd[158] = 1058344896;
        hc.eyqd[159] = -520819601;
        hc.eyqd[160] = 1833591305;
        hc.eyqd[161] = 1275757375;
        hc.eyqd[162] = 2106487229;
        hc.eyqd[163] = -845018298;
        hc.eyqd[164] = 306694394;
        hc.eyqd[165] = -177930989;
        hc.eyqd[166] = -1865995542;
        hc.eyqd[167] = 1945792061;
        hc.eyqd[168] = 714483315;
        hc.eyqd[169] = -846700939;
        hc.eyqd[170] = -163675334;
        hc.eyqd[171] = 882823836;
        hc.eyqd[172] = -1835464303;
        hc.eyqd[173] = 134866089;
        hc.eyqd[174] = 1836613841;
        hc.eyqd[175] = 2016146759;
        hc.eyqd[176] = 1425613614;
        hc.eyqd[177] = -1608923684;
        hc.eyqd[178] = -1063699684;
        hc.eyqd[179] = 728312899;
        hc.eyqd[180] = -1652752464;
        hc.eyqd[181] = 1963577978;
        hc.eyqd[182] = -875378845;
        hc.eyqd[183] = 1015316009;
        hc.eyqd[184] = -1047652375;
        hc.eyqd[185] = -1803585510;
        hc.eyqd[186] = -60954883;
        hc.eyqd[187] = 2095659444;
        hc.eyqd[188] = 1420178389;
        hc.eyqd[189] = -2002182225;
        hc.eyqd[190] = 477497288;
        hc.eyqd[191] = -1030148938;
        hc.eyqd[192] = 205204887;
        hc.eyqd[193] = 96228087;
        hc.eyqd[194] = 39148548;
        hc.eyqd[195] = -306183412;
        hc.eyqd[196] = 1467844546;
        hc.eyqd[197] = 813904028;
        hc.eyqd[198] = -1800009597;
        hc.eyqd[199] = -960791996;
    }

    private static /* synthetic */ void faxj() {
        hc.eypw[100] = 1026807346876611556L;
        hc.eypw[101] = -8804620139950600920L;
        hc.eypw[102] = -3868431315893990224L;
        hc.eypw[103] = -6094579237508090100L;
        hc.eypw[104] = 7377133558064764845L;
        hc.eypw[105] = -3865756665467344949L;
        hc.eypw[106] = 5805113760315000956L;
        hc.eypw[107] = 5861445191116306583L;
        hc.eypw[108] = -4262484806970316442L;
        hc.eypw[109] = -6414690425424156006L;
        hc.eypw[110] = 846440324223998597L;
        hc.eypw[111] = -1786625642021658242L;
        hc.eypw[112] = -644607262848593897L;
        hc.eypw[113] = 6733000788889730927L;
        hc.eypw[114] = 8902681949485907316L;
        hc.eypw[115] = -3752548726922056821L;
        hc.eypw[116] = 4144069947460657470L;
        hc.eypw[117] = -2382020709999078487L;
        hc.eypw[118] = -2542179508790959173L;
        hc.eypw[119] = 4512382009352722568L;
        hc.eypw[120] = 3002775273969345912L;
        hc.eypw[121] = 5656742451779820066L;
        hc.eypw[122] = -606104145912904357L;
        hc.eypw[123] = -6825915210666104872L;
        hc.eypw[124] = 6807691011055129220L;
        hc.eypw[125] = 1936447425972552952L;
        hc.eypw[126] = 5113109898792361229L;
        hc.eypw[127] = -1909065157542886873L;
        hc.eypw[128] = 5298229795861222255L;
        hc.eypw[129] = 5720305883190027242L;
        hc.eypw[130] = -3215529591965584657L;
        hc.eypw[131] = 739736181201095053L;
        hc.eypw[132] = 2631268903633462761L;
        hc.eypw[133] = -8946812676952378850L;
        hc.eypw[134] = 7364897442095282415L;
        hc.eypw[135] = 6745065042115176097L;
        hc.eypw[136] = 702750949882251720L;
        hc.eypw[137] = 3176024628201547200L;
        hc.eypw[138] = 8331144104974133725L;
        hc.eypw[139] = 4094711816360779193L;
        hc.eypw[140] = -8685792004742472814L;
        hc.eypw[141] = -5964065550357754038L;
        hc.eypw[142] = -5923442539749011697L;
        hc.eypw[143] = -8408499282486777429L;
        hc.eypw[144] = -1279821850142359384L;
        hc.eypw[145] = -1251420790051566412L;
        hc.eypw[146] = 2122951640486468390L;
        hc.eypw[147] = 4759365435350008248L;
        hc.eypw[148] = -2508040460244934962L;
        hc.eypw[149] = 6069244562436845765L;
        hc.eypw[150] = 8957702047756164654L;
        hc.eypw[151] = -2547285154992431074L;
        hc.eypw[152] = -2785519622096518115L;
        hc.eypw[153] = 5017050594926731862L;
        hc.eypw[154] = 6019663179551113980L;
        hc.eypw[155] = -3241222447566105469L;
        hc.eypw[156] = -982116411966150203L;
        hc.eypw[157] = -8141136245483461241L;
        hc.eypw[158] = -4593706470635680630L;
        hc.eypw[159] = -2718347949793208084L;
        hc.eypw[160] = 6233329134113042115L;
        hc.eypw[161] = -2722082274930411451L;
        hc.eypw[162] = -7336336912464770951L;
        hc.eypw[163] = -57419385597937088L;
        hc.eypw[164] = -3856826834558303069L;
        hc.eypw[165] = 1815210409811882867L;
        hc.eypw[166] = -5638821394117369030L;
        hc.eypw[167] = 6467197378494046021L;
        hc.eypw[168] = 2464442843430046066L;
        hc.eypw[169] = -1747428524496024549L;
        hc.eypw[170] = -1018177155208971198L;
        hc.eypw[171] = 5278959799539232892L;
        hc.eypw[172] = 1077384572292033539L;
        hc.eypw[173] = 3827327164111347891L;
        hc.eypw[174] = -5589252396046567543L;
        hc.eypw[175] = -8106111187916816154L;
        hc.eypw[176] = 680131475445186519L;
        hc.eypw[177] = -5481386777349595791L;
        hc.eypw[178] = -5235352984586552414L;
        hc.eypw[179] = -2261106582779681049L;
        hc.eypw[180] = 8111540489724958354L;
        hc.eypw[181] = -7121973725519899775L;
        hc.eypw[182] = -5077093461713467735L;
        hc.eypw[183] = -8294267223151759338L;
        hc.eypw[184] = 5108385218577607734L;
        hc.eypw[185] = 6864629806902699839L;
        hc.eypw[186] = -6951290401725803187L;
        hc.eypw[187] = 9134080237295596482L;
        hc.eypw[188] = 6615767490769686155L;
        hc.eypw[189] = 6814041918573409806L;
        hc.eypw[190] = -1441191804350097743L;
        hc.eypw[191] = -8722473271833397811L;
        hc.eypw[192] = -8502330506173349585L;
        hc.eypw[193] = -4167748444272550669L;
        hc.eypw[194] = 980142668093254998L;
        hc.eypw[195] = -1928220709454742699L;
        hc.eypw[196] = 4237282879910513880L;
        hc.eypw[197] = 7412638158528204113L;
        hc.eypw[198] = -6352106838722285400L;
        hc.eypw[199] = 8924689596027246118L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean swapTo(int var1_1) {
        block113: {
            block112: {
                block111: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("fank", eypu(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == hc.eypx("fanl", eyqb(int ), (int)466)) break;
                        v0 /* !! */  = (long)hc.eypx("fanm", eyqb(int ), (int)467);
                    }
                    var4_2 = hc.c;
                    v1 /* !! */  = hc.ln;
                    if (true) ** GOTO lbl11
                    block72: while (true) {
                        v1 /* !! */  = (long)(v2 - hc.eypx("fann", eypu(int ), (int)171));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 970344714: {
                                v2 = hc.eypx("fanp", eypu(int ), (int)172);
                                continue block72;
                            }
                            case 1062020122: {
                                v2 = hc.eypx("fanq", eypu(int ), (int)173);
                                continue block72;
                            }
                            case 1982262588: {
                                break block72;
                            }
                        }
                        break;
                    }
                    var3_3 /* !! */  = hc.b;
                    v3 /* !! */  = hc.ln;
                    if (true) ** GOTO lbl25
                    block73: while (true) {
                        v3 /* !! */  = (long)(v4 - hc.eypx("fans", eypu(int ), (int)174));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1416586722: {
                                v4 = hc.eypx("fant", eypu(int ), (int)175);
                                continue block73;
                            }
                            case 617596720: {
                                v4 = hc.eypx("fanu", eypu(int ), (int)176);
                                continue block73;
                            }
                            case 1913478054: {
                                v4 = hc.eypx("fanw", eypu(int ), (int)177);
                                continue block73;
                            }
                            case 1982262588: {
                                break block73;
                            }
                        }
                        break;
                    }
                    var2_4 = hc.a;
                    if (var4_2) {
                        throw null;
lbl40:
                        // 15 sources

                        return (boolean)hc.eypx("faob", eyqb(int ), (int)468);
                    }
                    if (var2_4 || var2_4) ** GOTO lbl40
                    if (var1_1 != hc.eypx("faoc", eyqb(int ), (int)469)) break block111;
                    if (var2_4 || var2_4) ** GOTO lbl40
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("faod", eypu(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == hc.eypx("faoe", eyqb(int ), (int)470)) break;
                        v5 /* !! */  = (long)hc.eypx("faof", eyqb(int ), (int)471);
                    }
                    this.abort("\u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u043f\u0440\u043e\u043f\u0430\u043b \u0438\u0437 \u0445\u043e\u0442\u0431\u0430\u0440\u0430");
                    if (var2_4 || var2_4) ** GOTO lbl40
                    return (boolean)hc.eypx("faog", eyqb(int ), (int)472);
                }
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("faoh", eypu(int ), (int)179)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hc.eypx("faok", eyqb(int ), (int)473)) break;
                    v6 /* !! */  = (long)hc.eypx("faom", eyqb(int ), (int)474);
                }
                v7 /* !! */  = hc.ln;
                if (true) ** GOTO lbl64
                block77: while (true) {
                    v7 /* !! */  = (long)(v8 - hc.eypx("faon", eypu(int ), (int)180));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1187960016: {
                            v8 = hc.eypx("faor", eypu(int ), (int)181);
                            continue block77;
                        }
                        case -1001499316: {
                            v8 = hc.eypx("faos", eypu(int ), (int)182);
                            continue block77;
                        }
                        case 1982262588: {
                            break block77;
                        }
                    }
                    break;
                }
                v9 = hc.mc.field_1724;
                v10 /* !! */  = hc.ln;
                if (true) ** GOTO lbl78
                block78: while (true) {
                    v10 /* !! */  = (long)(v11 - hc.eypx("faot", eypu(int ), (int)183));
lbl78:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 740070380: {
                            v11 = hc.eypx("faou", eypu(int ), (int)184);
                            continue block78;
                        }
                        case 1682152736: {
                            v11 = hc.eypx("faov", eypu(int ), (int)185);
                            continue block78;
                        }
                        case 1982262588: {
                            break block78;
                        }
                    }
                    break;
                }
                v12 = v9.method_31548();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = hc.ln - hc.eypx("faow", eypu(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hc.eypx("faox", eyqb(int ), (int)475)) break;
                    v13 /* !! */  = (long)hc.eypx("faoz", eyqb(int ), (int)476);
                }
                if (v12.method_67532() != var1_1) break block112;
                if (var2_4) ** GOTO lbl40
                return (boolean)hc.eypx("fapb", eyqb(int ), (int)477);
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            v14 /* !! */  = hc.ln;
            if (true) ** GOTO lbl102
            block80: while (true) {
                v14 /* !! */  = (long)(hc.eypx("fapf", eypu(int ), (int)188) - hc.eypx("fape", eypu(int ), (int)187));
lbl102:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -100603978: {
                        continue block80;
                    }
                    case 1982262588: {
                        break block80;
                    }
                }
                break;
            }
            if (this.swapped) break block113;
            if (var2_4 || var2_4) ** GOTO lbl40
            v15 /* !! */  = hc.ln;
            if (true) ** GOTO lbl113
            block81: while (true) {
                v15 /* !! */  = (long)(hc.eypx("faph", eypu(int ), (int)190) - hc.eypx("fapg", eypu(int ), (int)189));
lbl113:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 1002447459: {
                        continue block81;
                    }
                    case 1982262588: {
                        break block81;
                    }
                }
                break;
            }
            nv.saveSlot();
            if (var2_4 || var2_4) ** GOTO lbl40
            v16 = hc.eypx("fapi", eyqb(int ), (int)478);
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_4 = hc.ln - hc.eypx("fapp", eypu(int ), (int)191)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hc.eypx("fapq", eyqb(int ), (int)479)) break;
                v17 /* !! */  = (long)hc.eypx("fapr", eyqb(int ), (int)480);
            }
            this.swapped = v16;
            if (var2_4) ** GOTO lbl40
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block29 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = hc.ln - hc.eypx("fapz", eypu(int ), (int)192)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hc.eypx("faqa", eyqb(int ), (int)481)) break;
                    v18 /* !! */  = (long)hc.eypx("faqb", eyqb(int ), (int)482);
                }
                if (!this.silentSwap) ** GOTO lbl158
                if (var2_4 || var2_4) ** GOTO lbl40
                v19 /* !! */  = hc.ln;
                if (true) ** GOTO lbl144
                block84: while (true) {
                    v19 /* !! */  = (long)(v20 - hc.eypx("faqc", eypu(int ), (int)193));
lbl144:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1609069853: {
                            v20 = hc.eypx("faqf", eypu(int ), (int)194);
                            continue block84;
                        }
                        case 56647925: {
                            v20 = hc.eypx("faqh", eypu(int ), (int)195);
                            continue block84;
                        }
                        case 1982262588: {
                            break block84;
                        }
                    }
                    break;
                }
                nv.selectSlotSilent(var1_1);
                if (var2_4) ** GOTO lbl40
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl174
lbl158:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl40
                v21 /* !! */  = hc.ln;
                if (true) ** GOTO lbl163
                block85: while (true) {
                    v21 /* !! */  = (long)(v22 - hc.eypx("faqk", eypu(int ), (int)196));
lbl163:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -573450830: {
                            v22 = hc.eypx("faqn", eypu(int ), (int)197);
                            continue block85;
                        }
                        case 1451655566: {
                            v22 = hc.eypx("faqo", eypu(int ), (int)198);
                            continue block85;
                        }
                        case 1982262588: {
                            break block85;
                        }
                    }
                    break;
                }
                nv.selectSlot(var1_1);
                if (var2_4) ** GOTO lbl40
lbl174:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return (boolean)hc.eypx("faqs", eyqb(int ), (int)483);
            }
            case 0: {
                var3_3 /* !! */  = (int)hc.eypx("faqu", eyqb(int ), (int)484);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl182:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hc.eypx("faqw", eyqb(int ), (int)485);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 2: {
                var3_3 /* !! */  = (int)hc.eypx("faqy", eyqb(int ), (int)486);
                if (!var4_2) ** GOTO lbl182
                throw null;
            }
lbl191:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hc.eypx("fara", eyqb(int ), (int)487);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl196:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hc.eypx("farb", eyqb(int ), (int)488);
                    if (!var4_2) break block29;
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)hc.eypx("fare", eyqb(int ), (int)489);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 6: {
                var3_3 /* !! */  = (int)hc.eypx("farh", eyqb(int ), (int)490);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
lbl210:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hc.eypx("fari", eyqb(int ), (int)491);
                if (var4_2) {
                    throw null;
                }
            }
lbl214:
            // 4 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)hc.eypx("farj", eyqb(int ), (int)492);
                } while (!var4_2);
                throw null;
            }
lbl219:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hc.eypx("fark", eyqb(int ), (int)493);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 10: {
                var3_3 /* !! */  = (int)hc.eypx("farl", eyqb(int ), (int)494);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 11: {
                var3_3 /* !! */  = (int)hc.eypx("farm", eyqb(int ), (int)495);
                if (!var4_2) break;
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)hc.eypx("farn", eyqb(int ), (int)496);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl238:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)hc.eypx("farq", eyqb(int ), (int)497);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl243:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)hc.eypx("fart", eyqb(int ), (int)498);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hc.eypx("faru", eyqb(int ), (int)499);
                if (!var4_2) break;
                throw null;
            }
lbl251:
            // 4 sources

            case 16: {
                var3_3 /* !! */  = (int)hc.eypx("farx", eyqb(int ), (int)500);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)hc.eypx("farz", eyqb(int ), (int)501);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
lbl259:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)hc.eypx("fasc", eyqb(int ), (int)502);
                if (!var4_2) ** GOTO lbl243
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)hc.eypx("fasf", eyqb(int ), (int)503);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
lbl267:
            // 3 sources

            case 20: {
                do {
                    var3_3 /* !! */  = (int)hc.eypx("fasi", eyqb(int ), (int)504);
                } while (!var4_2);
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)hc.eypx("fask", eyqb(int ), (int)505);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl277:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)hc.eypx("fasl", eyqb(int ), (int)506);
                if (!var4_2) ** GOTO lbl238
                throw null;
            }
lbl281:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)hc.eypx("fasm", eyqb(int ), (int)507);
                if (!var4_2) ** GOTO lbl219
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)hc.eypx("fasn", eyqb(int ), (int)508);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 25: {
                var3_3 /* !! */  = (int)hc.eypx("fasq", eyqb(int ), (int)509);
                if (!var4_2) ** GOTO lbl267
                throw null;
            }
lbl294:
            // 3 sources

            case 26: {
                var3_3 /* !! */  = (int)hc.eypx("fass", eyqb(int ), (int)510);
                if (!var4_2) ** GOTO lbl214
                throw null;
            }
lbl298:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)hc.eypx("fast", eyqb(int ), (int)511);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)hc.eypx("fasu", eyqb(int ), (int)512);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
            case 29: 
        }
        var3_3 /* !! */  = (int)hc.eypx("fasv", eyqb(int ), (int)513);
        ** while (!var4_2)
lbl309:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fawp() {
        hc.eyqd[500] = 307291146;
        hc.eyqd[501] = 515682926;
        hc.eyqd[502] = -1441323685;
        hc.eyqd[503] = -2015880727;
        hc.eyqd[504] = 286463138;
        hc.eyqd[505] = 323786533;
        hc.eyqd[506] = 2040088507;
        hc.eyqd[507] = 397840443;
        hc.eyqd[508] = 285208383;
        hc.eyqd[509] = 753013899;
        hc.eyqd[510] = -406704093;
        hc.eyqd[511] = 107402053;
        hc.eyqd[512] = -1795705833;
        hc.eyqd[513] = -2129973514;
        hc.eyqd[514] = 1428829152;
        hc.eyqd[515] = -1040629905;
        hc.eyqd[516] = 459510110;
        hc.eyqd[517] = -154877234;
        hc.eyqd[518] = 786919266;
        hc.eyqd[519] = 592387041;
        hc.eyqd[520] = -981039833;
        hc.eyqd[521] = 195589118;
        hc.eyqd[522] = -1457005725;
        hc.eyqd[523] = -474696475;
        hc.eyqd[524] = -479432617;
        hc.eyqd[525] = 980549224;
        hc.eyqd[526] = 1493310183;
        hc.eyqd[527] = 1733680522;
        hc.eyqd[528] = 1071325011;
        hc.eyqd[529] = -839682234;
        hc.eyqd[530] = 1754825767;
        hc.eyqd[531] = -1509235738;
        hc.eyqd[532] = 1305906115;
        hc.eyqd[533] = -1819672357;
        hc.eyqd[534] = 1837702096;
        hc.eyqd[535] = -22731390;
        hc.eyqd[536] = -855917228;
        hc.eyqd[537] = 819321779;
        hc.eyqd[538] = 793253831;
        hc.eyqd[539] = -771102149;
        hc.eyqd[540] = 1203359280;
        hc.eyqd[541] = 971452171;
        hc.eyqd[542] = 385848020;
        hc.eyqd[543] = 1423835078;
        hc.eyqd[544] = -214392776;
        hc.eyqd[545] = -1101393585;
        hc.eyqd[546] = -987682268;
        hc.eyqd[547] = 664039872;
        hc.eyqd[548] = 1697242813;
        hc.eyqd[549] = -183445797;
        hc.eyqd[550] = 1002192145;
        hc.eyqd[551] = -1392827090;
        hc.eyqd[552] = -355798591;
        hc.eyqd[553] = 897970801;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasArrows() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("ezzd", eypu(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hc.eypx("ezze", eyqb(int ), (int)322)) break;
            v0 /* !! */  = (long)hc.eypx("ezzg", eyqb(int ), (int)323);
        }
        var3_1 = hc.c;
        v1 /* !! */  = hc.ln;
        if (true) ** GOTO lbl12
        block41: while (true) {
            v1 /* !! */  = (long)(hc.eypx("ezzi", eypu(int ), (int)88) - hc.eypx("ezzh", eypu(int ), (int)87));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1339296406: {
                    continue block41;
                }
                case 1982262588: {
                    break block41;
                }
            }
            break;
        }
        var2_2 /* !! */  = hc.b;
        v2 /* !! */  = hc.ln;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - hc.eypx("ezzj", eypu(int ), (int)89));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -220484154: {
                    v3 = hc.eypx("ezzk", eypu(int ), (int)90);
                    continue block42;
                }
                case 499878309: {
                    v3 = hc.eypx("ezzm", eypu(int ), (int)91);
                    continue block42;
                }
                case 1982262588: {
                    break block42;
                }
            }
            break;
        }
        var1_3 = hc.a;
        if (var3_1) {
            throw null;
lbl34:
            // 6 sources

            return (boolean)hc.eypx("ezzn", eyqb(int ), (int)324);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 /* !! */  = hc.ln;
        if (true) ** GOTO lbl41
        block44: while (true) {
            v4 /* !! */  = (long)(hc.eypx("ezzr", eypu(int ), (int)93) - hc.eypx("ezzq", eypu(int ), (int)92));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -881563085: {
                    continue block44;
                }
                case 1982262588: {
                    break block44;
                }
            }
            break;
        }
        v5 /* !! */  = hc.ln;
        if (true) ** GOTO lbl50
        block45: while (true) {
            v5 /* !! */  = (long)(hc.eypx("ezzu", eypu(int ), (int)95) - hc.eypx("ezzs", eypu(int ), (int)94));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1219984211: {
                    continue block45;
                }
                case 1982262588: {
                    break block45;
                }
            }
            break;
        }
        if (nv.findItemAnywhere(class_1802.field_8107) != hc.eypx("ezzv", eyqb(int ), (int)325)) ** GOTO lbl98
        if (var1_3) ** GOTO lbl34
        v6 /* !! */  = hc.ln;
        if (true) ** GOTO lbl61
        block46: while (true) {
            v6 /* !! */  = (long)(v7 - hc.eypx("ezzy", eypu(int ), (int)96));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 173384232: {
                    v7 = hc.eypx("ezzz", eypu(int ), (int)97);
                    continue block46;
                }
                case 1879594439: {
                    v7 = hc.eypx("faaa", eypu(int ), (int)98);
                    continue block46;
                }
                case 1982262588: {
                    break block46;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("faab", eypu(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == hc.eypx("faac", eyqb(int ), (int)326)) break;
            v8 /* !! */  = (long)hc.eypx("faad", eyqb(int ), (int)327);
        }
        if (nv.findItemAnywhere(class_1802.field_8087) != hc.eypx("faae", eyqb(int ), (int)328)) ** GOTO lbl98
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v9 /* !! */  = hc.ln;
                if (true) ** GOTO lbl85
                block48: while (true) {
                    v9 /* !! */  = (long)(hc.eypx("faai", eypu(int ), (int)101) - hc.eypx("faah", eypu(int ), (int)100));
lbl85:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 797124035: {
                            continue block48;
                        }
                        case 1982262588: {
                            break block48;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("faak", eypu(int ), (int)102)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hc.eypx("faal", eyqb(int ), (int)329)) break;
                    v10 /* !! */  = (long)hc.eypx("faam", eyqb(int ), (int)330);
                }
                if (nv.findItemAnywhere(class_1802.field_8236) == hc.eypx("faan", eyqb(int ), (int)331)) ** GOTO lbl103
                if (var1_3) ** GOTO lbl34
lbl98:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl34
                v11 = hc.eypx("faap", eyqb(int ), (int)332);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl106
lbl103:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v11 = hc.eypx("faas", eyqb(int ), (int)333);
lbl106:
                // 2 sources

                return (boolean)v11;
            }
lbl107:
            // 5 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("faat", eyqb(int ), (int)334);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hc.eypx("faau", eyqb(int ), (int)335);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hc.eypx("faav", eyqb(int ), (int)336);
                    if (!var3_1) ** GOTO lbl107
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)hc.eypx("faax", eyqb(int ), (int)337);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl126:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hc.eypx("faay", eyqb(int ), (int)338);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl130:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hc.eypx("faaz", eyqb(int ), (int)339);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl135:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hc.eypx("faba", eyqb(int ), (int)340);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("fabb", eyqb(int ), (int)341);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hc.eypx("fabc", eyqb(int ), (int)342);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hc.eypx("fabd", eyqb(int ), (int)343);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl152:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hc.eypx("fabe", eyqb(int ), (int)344);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)hc.eypx("fabf", eyqb(int ), (int)345);
        ** while (!var3_1)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void faxh() {
        hc.eypv[200] = 1785022922713361279L;
        hc.eypv[201] = -1554557472871655468L;
        hc.eypv[202] = -7680099578747665586L;
        hc.eypv[203] = 2284834443436465344L;
        hc.eypv[204] = -5457029587551375449L;
        hc.eypv[205] = -3236948003289328239L;
        hc.eypv[206] = 3919476139365406567L;
        hc.eypv[207] = -5320894346178786466L;
        hc.eypv[208] = -2073130624442963925L;
        hc.eypv[209] = -6796376483913333414L;
        hc.eypv[210] = -4798882168874982954L;
        hc.eypv[211] = -961916686937194230L;
        hc.eypv[212] = -5454600619981305954L;
        hc.eypv[213] = -296463484501964405L;
        hc.eypv[214] = 2837287352615236478L;
        hc.eypv[215] = 8055305288495111677L;
        hc.eypv[216] = -1248756629494482709L;
        hc.eypv[217] = 1197957656925976613L;
        hc.eypv[218] = 2813329697019572286L;
        hc.eypv[219] = 4295095963236430437L;
        hc.eypv[220] = -8305902175284739695L;
        hc.eypv[221] = -267656610137165119L;
        hc.eypv[222] = 2919647930006096096L;
        hc.eypv[223] = -1579767587867516888L;
        hc.eypv[224] = -8430369652682534674L;
        hc.eypv[225] = -3952766022860402977L;
        hc.eypv[226] = -1110737544525293755L;
        hc.eypv[227] = 8380984846308693174L;
        hc.eypv[228] = 3444323549869187363L;
        hc.eypv[229] = 1156810910036276401L;
        hc.eypv[230] = -6381378054837255664L;
        hc.eypv[231] = -8100843525910621235L;
        hc.eypv[232] = -2159358185385561430L;
        hc.eypv[233] = -2935684364149218388L;
        hc.eypv[234] = -9088313690509222964L;
        hc.eypv[235] = 5017352597863972536L;
        hc.eypv[236] = 625293673549478394L;
        hc.eypv[237] = 3246754480236550183L;
        hc.eypv[238] = 8407139394707505551L;
        hc.eypv[239] = -5702645587669141215L;
        hc.eypv[240] = -3953015695220724455L;
        hc.eypv[241] = -1699897890198454028L;
        hc.eypv[242] = 901109640660457926L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isBowMode() {
        v0 /* !! */  = hc.ln;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(hc.eypx("eyzz", eypu(int ), (int)41) - hc.eypx("eyzy", eypu(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -474090869: {
                    continue block20;
                }
                case 1982262588: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = hc.c;
        v1 /* !! */  = hc.ln;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - hc.eypx("ezaa", eypu(int ), (int)42));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -48845571: {
                    v2 = hc.eypx("ezae", eypu(int ), (int)43);
                    continue block21;
                }
                case 1982262588: {
                    break block21;
                }
                case 2047152471: {
                    v2 = hc.eypx("ezag", eypu(int ), (int)44);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = hc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("ezah", eypu(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hc.eypx("ezaj", eyqb(int ), (int)85)) break;
            v3 /* !! */  = (long)hc.eypx("ezal", eyqb(int ), (int)86);
        }
        var1_3 = hc.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hc.eypx("ezan", eyqb(int ), (int)87);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block23;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("ezao", eypu(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hc.eypx("ezas", eyqb(int ), (int)88)) break;
                    v4 /* !! */  = (long)hc.eypx("ezat", eyqb(int ), (int)89);
                }
                v5 /* !! */  = hc.ln;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - hc.eypx("ezau", eypu(int ), (int)47));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1159681301: {
                            v6 = hc.eypx("ezax", eypu(int ), (int)48);
                            continue block25;
                        }
                        case 1014977052: {
                            v6 = hc.eypx("ezay", eypu(int ), (int)49);
                            continue block25;
                        }
                        case 1982262588: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.igniteMode.isSelected("\u041b\u0443\u043a");
                case 0: {
                    var2_2 /* !! */  = (int)hc.eypx("ezaz", eyqb(int ), (int)90);
                    if (!var3_1) break block23;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)hc.eypx("ezbd", eyqb(int ), (int)91);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hc.eypx("ezbf", eyqb(int ), (int)92);
                        if (!var3_1) break block23;
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hc.eypx("ezbh", eyqb(int ), (int)93);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fawi() {
        hc.eyqd[0] = 1957347545;
        hc.eyqd[1] = 15290605;
        hc.eyqd[2] = 566475158;
        hc.eyqd[3] = 2075502260;
        hc.eyqd[4] = -1993048940;
        hc.eyqd[5] = -1359356863;
        hc.eyqd[6] = -903318427;
        hc.eyqd[7] = -698207772;
        hc.eyqd[8] = 1027021521;
        hc.eyqd[9] = -419174667;
        hc.eyqd[10] = 1184056189;
        hc.eyqd[11] = 801550490;
        hc.eyqd[12] = 1190896695;
        hc.eyqd[13] = -56076112;
        hc.eyqd[14] = 1849291507;
        hc.eyqd[15] = -1756924158;
        hc.eyqd[16] = -1047686237;
        hc.eyqd[17] = 535172866;
        hc.eyqd[18] = -254517056;
        hc.eyqd[19] = 1432613357;
        hc.eyqd[20] = 167010949;
        hc.eyqd[21] = -1502889588;
        hc.eyqd[22] = -1669448108;
        hc.eyqd[23] = 1712090564;
        hc.eyqd[24] = 1157530071;
        hc.eyqd[25] = -346516769;
        hc.eyqd[26] = -2125075413;
        hc.eyqd[27] = -1607453217;
        hc.eyqd[28] = -1065985752;
        hc.eyqd[29] = 646887176;
        hc.eyqd[30] = 1723821366;
        hc.eyqd[31] = 1073618849;
        hc.eyqd[32] = 763473663;
        hc.eyqd[33] = -171353127;
        hc.eyqd[34] = -1452783072;
        hc.eyqd[35] = 1299050176;
        hc.eyqd[36] = -875498337;
        hc.eyqd[37] = 879540749;
        hc.eyqd[38] = -1891175853;
        hc.eyqd[39] = 1544443413;
        hc.eyqd[40] = -991151700;
        hc.eyqd[41] = -2087986931;
        hc.eyqd[42] = -1484955455;
        hc.eyqd[43] = 440441938;
        hc.eyqd[44] = -2070714157;
        hc.eyqd[45] = -192237528;
        hc.eyqd[46] = 349325625;
        hc.eyqd[47] = 422594035;
        hc.eyqd[48] = 1024936130;
        hc.eyqd[49] = -875040575;
        hc.eyqd[50] = 2068745455;
        hc.eyqd[51] = -1492765351;
        hc.eyqd[52] = -529433366;
        hc.eyqd[53] = 414528118;
        hc.eyqd[54] = -533380390;
        hc.eyqd[55] = 347455361;
        hc.eyqd[56] = 837816645;
        hc.eyqd[57] = 1402472418;
        hc.eyqd[58] = 2054570760;
        hc.eyqd[59] = -99501557;
        hc.eyqd[60] = 624355726;
        hc.eyqd[61] = 664187094;
        hc.eyqd[62] = 35444346;
        hc.eyqd[63] = 2111755561;
        hc.eyqd[64] = 512459775;
        hc.eyqd[65] = 1886674522;
        hc.eyqd[66] = 103819516;
        hc.eyqd[67] = -1669076831;
        hc.eyqd[68] = 1028620584;
        hc.eyqd[69] = -381997821;
        hc.eyqd[70] = 1977847622;
        hc.eyqd[71] = -805074748;
        hc.eyqd[72] = 1172365335;
        hc.eyqd[73] = 554719781;
        hc.eyqd[74] = -1289954363;
        hc.eyqd[75] = -992380172;
        hc.eyqd[76] = -75092331;
        hc.eyqd[77] = 608157931;
        hc.eyqd[78] = 308013528;
        hc.eyqd[79] = 324507845;
        hc.eyqd[80] = 267165159;
        hc.eyqd[81] = -1975859729;
        hc.eyqd[82] = 1010743048;
        hc.eyqd[83] = -1944419443;
        hc.eyqd[84] = 1615845509;
        hc.eyqd[85] = -95278400;
        hc.eyqd[86] = 2145979068;
        hc.eyqd[87] = -1970299394;
        hc.eyqd[88] = 310547892;
        hc.eyqd[89] = 1358576063;
        hc.eyqd[90] = 1310229785;
        hc.eyqd[91] = -490436185;
        hc.eyqd[92] = 35403147;
        hc.eyqd[93] = 1552611249;
        hc.eyqd[94] = -1534223911;
        hc.eyqd[95] = -98177844;
        hc.eyqd[96] = 416619519;
        hc.eyqd[97] = 1191418411;
        hc.eyqd[98] = -830490991;
        hc.eyqd[99] = 757439879;
    }

    private static /* synthetic */ void faxf() {
        hc.eypv[100] = 4238530309310385222L;
        hc.eypv[101] = 1306632050304452221L;
        hc.eypv[102] = 6968258837627094004L;
        hc.eypv[103] = 1633443458111723019L;
        hc.eypv[104] = -7476618919337210419L;
        hc.eypv[105] = -6444989552140911524L;
        hc.eypv[106] = 3942235489942075563L;
        hc.eypv[107] = -8177720556467403937L;
        hc.eypv[108] = -5050687013150752081L;
        hc.eypv[109] = -1598242152007819148L;
        hc.eypv[110] = 7527695028573261165L;
        hc.eypv[111] = -6409301090843563166L;
        hc.eypv[112] = 2154201213023029985L;
        hc.eypv[113] = -4994217301528034916L;
        hc.eypv[114] = -4077841636557699606L;
        hc.eypv[115] = 215270519425655433L;
        hc.eypv[116] = 1281857905860018413L;
        hc.eypv[117] = -1947302564315996101L;
        hc.eypv[118] = 7779977024200127957L;
        hc.eypv[119] = -6519109876233374468L;
        hc.eypv[120] = 5539607103557404767L;
        hc.eypv[121] = 6645672396376946839L;
        hc.eypv[122] = 7897963316164844195L;
        hc.eypv[123] = 1660167545753231314L;
        hc.eypv[124] = 2420184625427017083L;
        hc.eypv[125] = 6543563546655754293L;
        hc.eypv[126] = -6290121163586120595L;
        hc.eypv[127] = 4906077315070247956L;
        hc.eypv[128] = 2502969890190803339L;
        hc.eypv[129] = 7306488277423736373L;
        hc.eypv[130] = 6348926027977370960L;
        hc.eypv[131] = 3399508274319126147L;
        hc.eypv[132] = -1540938976893624106L;
        hc.eypv[133] = -4191538933615482826L;
        hc.eypv[134] = 7764742555212965926L;
        hc.eypv[135] = 7058022163007839742L;
        hc.eypv[136] = -787042950353634406L;
        hc.eypv[137] = 98816415428120277L;
        hc.eypv[138] = -9104533367149859540L;
        hc.eypv[139] = -3107735141290785984L;
        hc.eypv[140] = 4228034553081461591L;
        hc.eypv[141] = 3034969013693848483L;
        hc.eypv[142] = 310097020965560230L;
        hc.eypv[143] = -3082545438914675939L;
        hc.eypv[144] = -3834522916022042903L;
        hc.eypv[145] = 6774114656675125231L;
        hc.eypv[146] = -679893027953907275L;
        hc.eypv[147] = 927177355644865288L;
        hc.eypv[148] = -1234319980364521433L;
        hc.eypv[149] = 447717186374688657L;
        hc.eypv[150] = 575525168008723116L;
        hc.eypv[151] = -5260498087547822906L;
        hc.eypv[152] = -7532820303011647351L;
        hc.eypv[153] = -486048784615065814L;
        hc.eypv[154] = 8935697731453589449L;
        hc.eypv[155] = 5393815667700405671L;
        hc.eypv[156] = 7580581754994071033L;
        hc.eypv[157] = -4938391801287127185L;
        hc.eypv[158] = -6073814018922635600L;
        hc.eypv[159] = 480462572219403546L;
        hc.eypv[160] = 391094676328534925L;
        hc.eypv[161] = -6641302215919413952L;
        hc.eypv[162] = -6635567761048768851L;
        hc.eypv[163] = 5873964421505027281L;
        hc.eypv[164] = 7763971273284975411L;
        hc.eypv[165] = 8532666930485402288L;
        hc.eypv[166] = -2799071141974609662L;
        hc.eypv[167] = 1773660079125676188L;
        hc.eypv[168] = 2762433275050625680L;
        hc.eypv[169] = -6359114542923412453L;
        hc.eypv[170] = -1585490585152430841L;
        hc.eypv[171] = -2738557989663026561L;
        hc.eypv[172] = -3718015623834097564L;
        hc.eypv[173] = -3609542297509430238L;
        hc.eypv[174] = -5835048899074423569L;
        hc.eypv[175] = 8116100455251164841L;
        hc.eypv[176] = -3369630324946361914L;
        hc.eypv[177] = 6920268327151157872L;
        hc.eypv[178] = -1143006472441978848L;
        hc.eypv[179] = -3072445680571674665L;
        hc.eypv[180] = -8478104801248133440L;
        hc.eypv[181] = -1297791762244596752L;
        hc.eypv[182] = -1000897436921935445L;
        hc.eypv[183] = 5778642982637868412L;
        hc.eypv[184] = -7790005230536873925L;
        hc.eypv[185] = 1022226597005726701L;
        hc.eypv[186] = -7881952808526635907L;
        hc.eypv[187] = -8380951912881330713L;
        hc.eypv[188] = 3330210656254819813L;
        hc.eypv[189] = 208309167927133480L;
        hc.eypv[190] = 8094220889950280176L;
        hc.eypv[191] = -1700784274125063038L;
        hc.eypv[192] = -1552825981332640974L;
        hc.eypv[193] = 4342444311382950801L;
        hc.eypv[194] = 4315137701189213778L;
        hc.eypv[195] = -5375982651780156794L;
        hc.eypv[196] = 1828881563529185554L;
        hc.eypv[197] = 2486986547753456153L;
        hc.eypv[198] = -5935532564708862398L;
        hc.eypv[199] = -6713540491771451664L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$1() {
        v0 /* !! */  = hc.ln;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - hc.eypx("faub", eypu(int ), (int)210));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 411373749: {
                    v1 = hc.eypx("fauc", eypu(int ), (int)211);
                    continue block45;
                }
                case 724765390: {
                    v1 = hc.eypx("faue", eypu(int ), (int)212);
                    continue block45;
                }
                case 1982262588: {
                    break block45;
                }
            }
            break;
        }
        var3_1 = hc.c;
        v2 /* !! */  = hc.ln;
        if (true) ** GOTO lbl19
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - hc.eypx("fauf", eypu(int ), (int)213));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1596753574: {
                    v3 = hc.eypx("faug", eypu(int ), (int)214);
                    continue block46;
                }
                case 86264045: {
                    v3 = hc.eypx("fauh", eypu(int ), (int)215);
                    continue block46;
                }
                case 1428256324: {
                    v3 = hc.eypx("faui", eypu(int ), (int)216);
                    continue block46;
                }
                case 1982262588: {
                    break block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = hc.b;
        v4 /* !! */  = hc.ln;
        if (true) ** GOTO lbl36
        block47: while (true) {
            v4 /* !! */  = (long)(hc.eypx("fauk", eypu(int ), (int)218) - hc.eypx("fauj", eypu(int ), (int)217));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1697205991: {
                    continue block47;
                }
                case 1982262588: {
                    break block47;
                }
            }
            break;
        }
        var1_3 = hc.a;
        if (var3_1) {
            throw null;
lbl44:
            // 4 sources

            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl44
                v5 /* !! */  = hc.ln;
                if (true) ** GOTO lbl54
                block49: while (true) {
                    v5 /* !! */  = (long)(hc.eypx("faum", eypu(int ), (int)220) - hc.eypx("faul", eypu(int ), (int)219));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 481359671: {
                            continue block49;
                        }
                        case 1982262588: {
                            break block49;
                        }
                    }
                    break;
                }
                v6 /* !! */  = hc.ln;
                if (true) ** GOTO lbl63
                block50: while (true) {
                    v6 /* !! */  = (long)(hc.eypx("fauo", eypu(int ), (int)222) - hc.eypx("faun", eypu(int ), (int)221));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -324190768: {
                            continue block50;
                        }
                        case 1982262588: {
                            break block50;
                        }
                    }
                    break;
                }
                if (!this.ignite.isValue()) ** GOTO lbl95
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("faup", eypu(int ), (int)223)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == hc.eypx("fauq", eyqb(int ), (int)533)) break;
                    v7 /* !! */  = (long)hc.eypx("faur", eyqb(int ), (int)534);
                }
                v8 /* !! */  = hc.ln;
                if (true) ** GOTO lbl80
                block52: while (true) {
                    v8 /* !! */  = (long)(v9 - hc.eypx("faus", eypu(int ), (int)224));
lbl80:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1838596292: {
                            v9 = hc.eypx("faut", eypu(int ), (int)225);
                            continue block52;
                        }
                        case -1809703367: {
                            v9 = hc.eypx("fauu", eypu(int ), (int)226);
                            continue block52;
                        }
                        case 1982262588: {
                            break block52;
                        }
                    }
                    break;
                }
                if (!this.igniteMode.isSelected("\u041b\u0443\u043a")) ** GOTO lbl95
                if (var1_3) ** GOTO lbl44
                v10 = hc.eypx("fauv", eyqb(int ), (int)535);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
lbl95:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v10 = hc.eypx("faux", eyqb(int ), (int)536);
lbl98:
                // 2 sources

                v11 /* !! */  = hc.ln;
                if (true) ** GOTO lbl102
                block53: while (true) {
                    v11 /* !! */  = (long)(v12 - hc.eypx("fauy", eypu(int ), (int)227));
lbl102:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1226987313: {
                            v12 = hc.eypx("fauz", eypu(int ), (int)228);
                            continue block53;
                        }
                        case 66477384: {
                            v12 = hc.eypx("fava", eypu(int ), (int)229);
                            continue block53;
                        }
                        case 222874215: {
                            v12 = hc.eypx("favb", eypu(int ), (int)230);
                            continue block53;
                        }
                        case 1982262588: {
                            break block53;
                        }
                    }
                    break;
                }
                return (boolean)v10;
            }
lbl115:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hc.eypx("favc", eyqb(int ), (int)537);
                if (var3_1) {
                    throw null;
                }
            }
lbl119:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hc.eypx("favd", eyqb(int ), (int)538);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("fave", eyqb(int ), (int)539);
                } while (!var3_1);
                throw null;
            }
lbl128:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("favf", eyqb(int ), (int)540);
                } while (!var3_1);
                throw null;
            }
lbl133:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hc.eypx("favg", eyqb(int ), (int)541);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 5: {
                var2_2 /* !! */  = (int)hc.eypx("favh", eyqb(int ), (int)542);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
lbl142:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hc.eypx("favi", eyqb(int ), (int)543);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hc.eypx("favj", eyqb(int ), (int)544);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)hc.eypx("favk", eyqb(int ), (int)545);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1297 findCart() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("faij", eypu(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hc.eypx("faik", eyqb(int ), (int)427)) break;
            v0 /* !! */  = (long)hc.eypx("fail", eyqb(int ), (int)428);
        }
        var6_1 = hc.c;
        v1 /* !! */  = hc.ln;
        if (true) ** GOTO lbl11
        block69: while (true) {
            v1 /* !! */  = (long)(hc.eypx("fait", eypu(int ), (int)139) - hc.eypx("faim", eypu(int ), (int)138));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -249618614: {
                    continue block69;
                }
                case 1982262588: {
                    break block69;
                }
            }
            break;
        }
        var5_2 /* !! */  = hc.b;
        v2 /* !! */  = hc.ln;
        if (true) ** GOTO lbl21
        block70: while (true) {
            v2 /* !! */  = (long)(v3 - hc.eypx("faiv", eypu(int ), (int)140));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1997863899: {
                    v3 = hc.eypx("faiw", eypu(int ), (int)141);
                    continue block70;
                }
                case -1864601611: {
                    v3 = hc.eypx("faix", eypu(int ), (int)142);
                    continue block70;
                }
                case 1841324465: {
                    v3 = hc.eypx("faiy", eypu(int ), (int)143);
                    continue block70;
                }
                case 1982262588: {
                    break block70;
                }
            }
            break;
        }
        var4_3 = hc.a;
        if (var6_1) {
            throw null;
lbl36:
            // 13 sources

            return null;
        }
        if (var4_3 || var4_3) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("faiz", eypu(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hc.eypx("faja", eyqb(int ), (int)429)) break;
            v4 /* !! */  = (long)hc.eypx("fajg", eyqb(int ), (int)430);
        }
        if (this.railPos != null) ** GOTO lbl50
        if (var4_3) ** GOTO lbl36
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return null;
            }
lbl50:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl36
            v5 /* !! */  = hc.ln;
            if (true) ** GOTO lbl55
            block73: while (true) {
                v5 /* !! */  = (long)(hc.eypx("fajk", eypu(int ), (int)146) - hc.eypx("fajj", eypu(int ), (int)145));
lbl55:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -791868451: {
                        continue block73;
                    }
                    case 1982262588: {
                        break block73;
                    }
                }
                break;
            }
            v6 /* !! */  = hc.ln;
            if (true) ** GOTO lbl64
            block74: while (true) {
                v6 /* !! */  = (long)(v7 - hc.eypx("fajl", eypu(int ), (int)147));
lbl64:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2046934974: {
                        v7 = hc.eypx("fajm", eypu(int ), (int)148);
                        continue block74;
                    }
                    case -560169709: {
                        v7 = hc.eypx("fajn", eypu(int ), (int)149);
                        continue block74;
                    }
                    case 944513794: {
                        v7 = hc.eypx("fajo", eypu(int ), (int)150);
                        continue block74;
                    }
                    case 1982262588: {
                        break block74;
                    }
                }
                break;
            }
            var1_4 = class_243.method_24953((class_2382)this.railPos);
            if (var4_3 || var4_3) ** GOTO lbl36
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("fajq", eypu(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hc.eypx("fajs", eyqb(int ), (int)431)) break;
                v8 /* !! */  = (long)hc.eypx("fajt", eyqb(int ), (int)432);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = hc.ln - hc.eypx("faju", eypu(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == hc.eypx("fajv", eyqb(int ), (int)433)) break;
                v9 /* !! */  = (long)hc.eypx("fajw", eyqb(int ), (int)434);
            }
            v10 = hc.mc.field_1687;
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = hc.ln - hc.eypx("fakb", eypu(int ), (int)153)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hc.eypx("fakc", eyqb(int ), (int)435)) break;
                v11 /* !! */  = (long)hc.eypx("fakd", eyqb(int ), (int)436);
            }
            v12 = v10.method_18112();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_5 = hc.ln - hc.eypx("fake", eypu(int ), (int)154)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hc.eypx("fakf", eyqb(int ), (int)437)) break;
                v13 /* !! */  = (long)hc.eypx("fakg", eyqb(int ), (int)438);
            }
            var2_5 = v12.iterator();
            if (var4_3) ** GOTO lbl36
            do {
                if (var4_3 || var4_3) ** GOTO lbl36
                v14 /* !! */  = hc.ln;
                if (true) ** GOTO lbl108
                block80: while (true) {
                    v14 /* !! */  = (long)(hc.eypx("fakn", eypu(int ), (int)156) - hc.eypx("fakh", eypu(int ), (int)155));
lbl108:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1266436209: {
                            continue block80;
                        }
                        case 1982262588: {
                            break block80;
                        }
                    }
                    break;
                }
                if (!var2_5.hasNext()) ** GOTO lbl178
                if (var4_3) ** GOTO lbl36
                v15 /* !! */  = hc.ln;
                if (true) ** GOTO lbl119
                block81: while (true) {
                    v15 /* !! */  = (long)(v16 - hc.eypx("fako", eypu(int ), (int)157));
lbl119:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2043477250: {
                            v16 = hc.eypx("fakq", eypu(int ), (int)158);
                            continue block81;
                        }
                        case -1068018843: {
                            v16 = hc.eypx("fakr", eypu(int ), (int)159);
                            continue block81;
                        }
                        case 1770486653: {
                            v16 = hc.eypx("faks", eypu(int ), (int)160);
                            continue block81;
                        }
                        case 1982262588: {
                            break block81;
                        }
                    }
                    break;
                }
                var3_6 = (class_1297)var2_5.next();
                if (var4_3 || var4_3) ** GOTO lbl36
                if (!(var3_6 instanceof class_1701)) ** GOTO lbl175
                if (var4_3) ** GOTO lbl36
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = hc.ln - hc.eypx("fakt", eypu(int ), (int)161)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hc.eypx("faku", eyqb(int ), (int)439)) break;
                    v17 /* !! */  = (long)hc.eypx("fakx", eyqb(int ), (int)440);
                }
                if (!var3_6.method_5805()) ** GOTO lbl175
                if (var4_3) ** GOTO lbl36
                v18 /* !! */  = hc.ln;
                if (true) ** GOTO lbl146
                block83: while (true) {
                    v18 /* !! */  = (long)(v19 - hc.eypx("fakz", eypu(int ), (int)162));
lbl146:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 332506622: {
                            v19 = hc.eypx("falb", eypu(int ), (int)163);
                            continue block83;
                        }
                        case 1736711372: {
                            v19 = hc.eypx("falc", eypu(int ), (int)164);
                            continue block83;
                        }
                        case 1982262588: {
                            break block83;
                        }
                        case 2006995036: {
                            v19 = hc.eypx("fale", eypu(int ), (int)165);
                            continue block83;
                        }
                    }
                    break;
                }
                v20 = var3_6.method_73189();
                v21 /* !! */  = hc.ln;
                if (true) ** GOTO lbl163
                block84: while (true) {
                    v21 /* !! */  = (long)(v22 - hc.eypx("falg", eypu(int ), (int)166));
lbl163:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 349188488: {
                            v22 = hc.eypx("fali", eypu(int ), (int)167);
                            continue block84;
                        }
                        case 438569350: {
                            v22 = hc.eypx("falk", eypu(int ), (int)168);
                            continue block84;
                        }
                        case 1982262588: {
                            break block84;
                        }
                    }
                    break;
                }
                if (!(v20.method_1022(var1_4) < hc.eypx("falm", ezdx(int ), (int)169))) ** GOTO lbl175
                if (var4_3 || var4_3) ** GOTO lbl36
                return var3_6;
lbl175:
                // 3 sources

                if (var4_3 || var4_3) ** GOTO lbl36
            } while (!var6_1);
            throw null;
lbl178:
            // 1 sources

            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return null;
lbl181:
            // 3 sources

            case 0: {
                var5_2 /* !! */  = (int)hc.eypx("falq", eyqb(int ), (int)441);
                if (var6_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)hc.eypx("falr", eyqb(int ), (int)442);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl242
                    break;
                }
            }
            case 2: {
                var5_2 /* !! */  = (int)hc.eypx("fals", eyqb(int ), (int)443);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 3: {
                var5_2 /* !! */  = (int)hc.eypx("falt", eyqb(int ), (int)444);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl201:
            // 3 sources

            case 4: {
                var5_2 /* !! */  = (int)hc.eypx("falu", eyqb(int ), (int)445);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 5: {
                var5_2 /* !! */  = (int)hc.eypx("famc", eyqb(int ), (int)446);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 6: {
                var5_2 /* !! */  = (int)hc.eypx("famd", eyqb(int ), (int)447);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl216:
            // 3 sources

            case 7: {
                var5_2 /* !! */  = (int)hc.eypx("fame", eyqb(int ), (int)448);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl221:
            // 4 sources

            case 8: {
                var5_2 /* !! */  = (int)hc.eypx("famg", eyqb(int ), (int)449);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl226:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)hc.eypx("famh", eyqb(int ), (int)450);
                if (!var6_1) ** GOTO lbl201
                throw null;
            }
lbl230:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)hc.eypx("famk", eyqb(int ), (int)451);
                if (!var6_1) ** GOTO lbl181
                throw null;
            }
lbl234:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)hc.eypx("famm", eyqb(int ), (int)452);
                if (!var6_1) ** GOTO lbl201
                throw null;
            }
lbl238:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)hc.eypx("famo", eyqb(int ), (int)453);
                if (!var6_1) ** GOTO lbl230
                throw null;
            }
lbl242:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)hc.eypx("famp", eyqb(int ), (int)454);
                if (!var6_1) ** GOTO lbl221
                throw null;
            }
lbl246:
            // 4 sources

            case 14: {
                var5_2 /* !! */  = (int)hc.eypx("famq", eyqb(int ), (int)455);
                if (!var6_1) ** GOTO lbl234
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)hc.eypx("famr", eyqb(int ), (int)456);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl255:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)hc.eypx("famt", eyqb(int ), (int)457);
                if (!var6_1) ** GOTO lbl226
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)hc.eypx("famv", eyqb(int ), (int)458);
                if (!var6_1) ** GOTO lbl181
                throw null;
            }
lbl263:
            // 4 sources

            case 18: {
                var5_2 /* !! */  = (int)hc.eypx("famw", eyqb(int ), (int)459);
                if (!var6_1) ** GOTO lbl216
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)hc.eypx("famz", eyqb(int ), (int)460);
                if (!var6_1) ** GOTO lbl221
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)hc.eypx("fana", eyqb(int ), (int)461);
                if (!var6_1) ** GOTO lbl255
                throw null;
            }
            case 21: {
                var5_2 /* !! */  = (int)hc.eypx("fanb", eyqb(int ), (int)462);
                if (!var6_1) break;
                throw null;
            }
            case 22: {
                var5_2 /* !! */  = (int)hc.eypx("fanc", eyqb(int ), (int)463);
                if (!var6_1) ** GOTO lbl216
                throw null;
            }
lbl283:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)hc.eypx("fand", eyqb(int ), (int)464);
                if (!var6_1) ** GOTO lbl263
                throw null;
            }
            case 24: 
        }
        var5_2 /* !! */  = (int)hc.eypx("fanf", eyqb(int ), (int)465);
        ** while (!var6_1)
lbl290:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void faxa() {
        hc.eyqe[500] = 307291167;
        hc.eyqe[501] = 515682943;
        hc.eyqe[502] = -1441323691;
        hc.eyqe[503] = -2015880736;
        hc.eyqe[504] = 286463142;
        hc.eyqe[505] = 323786540;
        hc.eyqe[506] = 2040088501;
        hc.eyqe[507] = 397840447;
        hc.eyqe[508] = 285208381;
        hc.eyqe[509] = 753013892;
        hc.eyqe[510] = -406704066;
        hc.eyqe[511] = 107402051;
        hc.eyqe[512] = -1795705851;
        hc.eyqe[513] = -2129973524;
        hc.eyqe[514] = 1428829153;
        hc.eyqe[515] = -158618448;
        hc.eyqe[516] = -459510111;
        hc.eyqe[517] = -863648932;
        hc.eyqe[518] = 786919267;
        hc.eyqe[519] = -2098215350;
        hc.eyqe[520] = -981039826;
        hc.eyqe[521] = 195589113;
        hc.eyqe[522] = -1457005727;
        hc.eyqe[523] = -474696466;
        hc.eyqe[524] = -479432622;
        hc.eyqe[525] = 980549227;
        hc.eyqe[526] = 1493310187;
        hc.eyqe[527] = 1733680525;
        hc.eyqe[528] = 1071325013;
        hc.eyqe[529] = -839682240;
        hc.eyqe[530] = 1754825762;
        hc.eyqe[531] = -1509235741;
        hc.eyqe[532] = 1305906119;
        hc.eyqe[533] = -1819672358;
        hc.eyqe[534] = 1013050614;
        hc.eyqe[535] = -22731389;
        hc.eyqe[536] = -855917228;
        hc.eyqe[537] = 819321776;
        hc.eyqe[538] = 793253839;
        hc.eyqe[539] = -771102146;
        hc.eyqe[540] = 1203359288;
        hc.eyqe[541] = 971452163;
        hc.eyqe[542] = 385848016;
        hc.eyqe[543] = 1423835079;
        hc.eyqe[544] = -214392776;
        hc.eyqe[545] = -1101393591;
        hc.eyqe[546] = -987682267;
        hc.eyqe[547] = 1412968246;
        hc.eyqe[548] = 1697242812;
        hc.eyqe[549] = -997520282;
        hc.eyqe[550] = 1002192146;
        hc.eyqe[551] = -1392827089;
        hc.eyqe[552] = -355798590;
        hc.eyqe[553] = 897970802;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hc() {
        var2_1 /* !! */  = hc.b;
        var1_2 = hc.a;
        super("AutoCart", "\u0421\u0442\u0430\u0432\u0438\u0442 \u0438 \u0432\u0437\u0440\u044b\u0432\u0430\u0435\u0442 \u0422\u041d\u0422-\u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0443 \u043d\u0430 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0435\u0439 \u0440\u0435\u043b\u044c\u0441\u0435", du.RAGE);
        this.ignite = new kb("\u041f\u043e\u0434\u0436\u0438\u0433\u0430\u0442\u044c", "\u0412\u0437\u0440\u044b\u0432\u0430\u0442\u044c \u0432\u0430\u0433\u043e\u043d\u0435\u0442\u043a\u0443 \u043f\u043e\u0441\u043b\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0438").setValue((boolean)hc.eypx("eyre", eyqb(int ), (int)10));
        this.igniteMode = new kf("\u041f\u043e\u0434\u0436\u0438\u0433", "\u0421\u043f\u043e\u0441\u043e\u0431 \u0434\u0435\u0442\u043e\u043d\u0430\u0446\u0438\u0438", "\u041b\u0443\u043a", new String[]{"\u041b\u0443\u043a", "\u041e\u0433\u043d\u0438\u0432\u043e"}).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((hc)this));
        this.drawTicks = new kg("\u041d\u0430\u0442\u044f\u0436\u043a\u0430", "\u0421\u043a\u043e\u043b\u044c\u043a\u043e \u0442\u0438\u043a\u043e\u0432 \u043d\u0430\u0442\u044f\u0433\u0438\u0432\u0430\u0442\u044c \u043b\u0443\u043a \u043f\u0435\u0440\u0435\u0434 \u0432\u044b\u0441\u0442\u0440\u0435\u043b\u043e\u043c", (float)hc.eypx("eyrl", eyrf(int ), (int)11)).range((float)hc.eypx("eyrn", eyrf(int ), (int)12), (float)hc.eypx("eyro", eyrf(int ), (int)13)).step(1.0f).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$1(), ()Ljava/lang/Boolean;)((hc)this));
        this.swapMode = new kf("\u0421\u0432\u0430\u043f", "\u0421\u043f\u043e\u0441\u043e\u0431 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432", "Silent", new String[]{"Silent", "Legit"});
        this.debugMessages = new kb("\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f", "\u041f\u0438\u0441\u0430\u0442\u044c \u0432 \u0447\u0430\u0442 \u043f\u043e\u0447\u0435\u043c\u0443 \u043c\u043e\u0434\u0443\u043b\u044c \u043d\u0435 \u0441\u0440\u0430\u0431\u043e\u0442\u0430\u043b").setValue((boolean)hc.eypx("eyrq", eyqb(int ), (int)14));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.ignite, this.igniteMode, this.drawTicks, this.swapMode, this.debugMessages});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)hc.eypx("eyrr", eyqb(int ), (int)15);
                ** GOTO lbl30
            }
            case 1: {
                var2_1 /* !! */  = (int)hc.eypx("eyrs", eyqb(int ), (int)16);
                ** GOTO lbl27
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)hc.eypx("eyru", eyqb(int ), (int)17);
                }
            }
lbl24:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hc.eypx("eyrw", eyqb(int ), (int)18);
                ** GOTO lbl30
            }
lbl27:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)hc.eypx("eyrx", eyqb(int ), (int)19);
                ** GOTO lbl24
            }
lbl30:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)hc.eypx("eyry", eyqb(int ), (int)20);
                break;
            }
lbl33:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)hc.eypx("eyrz", eyqb(int ), (int)21);
                break;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hc.eypx("eysa", eyqb(int ), (int)22);
                    ** GOTO lbl33
                    break;
                }
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)hc.eypx("eysb", eyqb(int ), (int)23);
        ** while (true)
    }

    private static /* synthetic */ float eyrf(int n2) {
        return Float.intBitsToFloat(eyqd[n2] ^ eyqe[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void aimAt(class_1297 var1_1) {
        v0 /* !! */  = hc.ln;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(hc.eypx("ezvi", eypu(int ), (int)52) - hc.eypx("ezvh", eypu(int ), (int)51));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -378929260: {
                    continue block57;
                }
                case 1982262588: {
                    break block57;
                }
            }
            break;
        }
        var7_2 = hc.c;
        v1 /* !! */  = hc.ln;
        if (true) ** GOTO lbl15
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - hc.eypx("ezvj", eypu(int ), (int)53));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -79705464: {
                    v2 = hc.eypx("ezvl", eypu(int ), (int)54);
                    continue block58;
                }
                case 832585186: {
                    v2 = hc.eypx("ezvm", eypu(int ), (int)55);
                    continue block58;
                }
                case 1059832027: {
                    v2 = hc.eypx("ezvn", eypu(int ), (int)56);
                    continue block58;
                }
                case 1982262588: {
                    break block58;
                }
            }
            break;
        }
        var6_3 /* !! */  = hc.b;
        v3 /* !! */  = hc.ln;
        if (true) ** GOTO lbl32
        block59: while (true) {
            v3 /* !! */  = (long)(v4 - hc.eypx("ezvq", eypu(int ), (int)57));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1983591849: {
                    v4 = hc.eypx("ezvr", eypu(int ), (int)58);
                    continue block59;
                }
                case 177075384: {
                    v4 = hc.eypx("ezvt", eypu(int ), (int)59);
                    continue block59;
                }
                case 665388396: {
                    v4 = hc.eypx("ezvu", eypu(int ), (int)60);
                    continue block59;
                }
                case 1982262588: {
                    break block59;
                }
            }
            break;
        }
        var5_4 = hc.a;
        if (var7_2) {
            throw null;
lbl47:
            // 5 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("ezvv", eypu(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hc.eypx("ezvw", eyqb(int ), (int)288)) break;
            v5 /* !! */  = (long)hc.eypx("ezvx", eyqb(int ), (int)289);
        }
        v6 = var1_1.method_73189();
        v7 /* !! */  = hc.ln;
        if (true) ** GOTO lbl60
        block62: while (true) {
            v7 /* !! */  = (long)(hc.eypx("ezvz", eypu(int ), (int)63) - hc.eypx("ezvy", eypu(int ), (int)62));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 1445593593: {
                    continue block62;
                }
                case 1982262588: {
                    break block62;
                }
            }
            break;
        }
        v8 = (double)var1_1.method_17682() * hc.eypx("ezwb", ezdx(int ), (int)64);
        v9 /* !! */  = hc.ln;
        if (true) ** GOTO lbl70
        block63: while (true) {
            v9 /* !! */  = (long)(hc.eypx("ezwe", eypu(int ), (int)66) - hc.eypx("ezwc", eypu(int ), (int)65));
lbl70:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1978000188: {
                    continue block63;
                }
                case 1982262588: {
                    break block63;
                }
            }
            break;
        }
        var2_5 = v6.method_1031(0.0, v8, 0.0);
        if (var5_4 || var5_4) ** GOTO lbl47
        v10 /* !! */  = hc.ln;
        if (true) ** GOTO lbl81
        block64: while (true) {
            v10 /* !! */  = (long)(hc.eypx("ezwg", eypu(int ), (int)68) - hc.eypx("ezwf", eypu(int ), (int)67));
lbl81:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1861505104: {
                    continue block64;
                }
                case 1982262588: {
                    break block64;
                }
            }
            break;
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("ezwj", eypu(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hc.eypx("ezwl", eyqb(int ), (int)290)) break;
            v11 /* !! */  = (long)hc.eypx("ezwm", eyqb(int ), (int)291);
        }
        v12 = hc.mc.field_1724;
        v13 /* !! */  = hc.ln;
        if (true) ** GOTO lbl96
        block66: while (true) {
            v13 /* !! */  = (long)(hc.eypx("ezwp", eypu(int ), (int)71) - hc.eypx("ezwn", eypu(int ), (int)70));
lbl96:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 932127388: {
                    continue block66;
                }
                case 1982262588: {
                    break block66;
                }
            }
            break;
        }
        v14 = v12.method_33571();
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("ezwq", eypu(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == hc.eypx("ezwr", eyqb(int ), (int)292)) break;
            v15 /* !! */  = (long)hc.eypx("ezwt", eyqb(int ), (int)293);
        }
        v16 = var2_5.method_1020(v14);
        v17 /* !! */  = hc.ln;
        if (true) ** GOTO lbl112
        block68: while (true) {
            v17 /* !! */  = (long)(v18 - hc.eypx("ezwu", eypu(int ), (int)73));
lbl112:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1019529109: {
                    v18 = hc.eypx("ezwv", eypu(int ), (int)74);
                    continue block68;
                }
                case -422167644: {
                    v18 = hc.eypx("ezwx", eypu(int ), (int)75);
                    continue block68;
                }
                case 195940278: {
                    v18 = hc.eypx("ezwy", eypu(int ), (int)76);
                    continue block68;
                }
                case 1982262588: {
                    break block68;
                }
            }
            break;
        }
        var3_6 = ow.fromVec3d(v16);
        if (var5_4 || var5_4) ** GOTO lbl47
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_3 = hc.ln - hc.eypx("ezwz", eypu(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == hc.eypx("ezxc", eyqb(int ), (int)294)) break;
            v19 /* !! */  = (long)hc.eypx("ezxd", eyqb(int ), (int)295);
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_4 = hc.ln - hc.eypx("ezxe", eypu(int ), (int)78)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == hc.eypx("ezxf", eyqb(int ), (int)296)) break;
            v20 /* !! */  = (long)hc.eypx("ezxh", eyqb(int ), (int)297);
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_5 = hc.ln - hc.eypx("ezxi", eypu(int ), (int)79)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == hc.eypx("ezxj", eyqb(int ), (int)298)) break;
            v21 /* !! */  = (long)hc.eypx("ezxm", eyqb(int ), (int)299);
        }
        v22 = new hy();
        v23 = hc.eypx("ezxn", eyqb(int ), (int)300);
        v24 = hc.eypx("ezxo", eyqb(int ), (int)301);
        v25 = hc.eypx("ezxp", eyqb(int ), (int)302);
        v26 /* !! */  = hc.ln;
        if (true) ** GOTO lbl149
        block72: while (true) {
            v26 /* !! */  = (long)(v27 - hc.eypx("ezxq", eypu(int ), (int)80));
lbl149:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -6327646: {
                    v27 = hc.eypx("ezxr", eypu(int ), (int)81);
                    continue block72;
                }
                case 807628035: {
                    v27 = hc.eypx("ezxu", eypu(int ), (int)82);
                    continue block72;
                }
                case 1982262588: {
                    break block72;
                }
            }
            break;
        }
        var4_7 = new os(v22, (boolean)v23, (boolean)v24, (boolean)v25);
        if (var5_4 || var5_4) ** GOTO lbl47
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = hc.ln - hc.eypx("ezxw", eypu(int ), (int)83)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == hc.eypx("ezxx", eyqb(int ), (int)303)) break;
                    v28 /* !! */  = (long)hc.eypx("ezxz", eyqb(int ), (int)304);
                }
                v29 = hc.eypx("ezya", eyqb(int ), (int)305);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_7 = hc.ln - hc.eypx("ezyb", eypu(int ), (int)84)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hc.eypx("ezyd", eyqb(int ), (int)306)) break;
                    v30 /* !! */  = (long)hc.eypx("ezyg", eyqb(int ), (int)307);
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_8 = hc.ln - hc.eypx("ezyh", eypu(int ), (int)85)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hc.eypx("ezyi", eyqb(int ), (int)308)) break;
                    v31 /* !! */  = (long)hc.eypx("ezyj", eyqb(int ), (int)309);
                }
                ot.INSTANCE.rotateTo(var3_6, (int)v29, var4_7, nn.HIGH_IMPORTANCE_1, this);
                if (var5_4 || var5_4) ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)hc.eypx("ezyk", eyqb(int ), (int)310);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 1: {
                var6_3 /* !! */  = (int)hc.eypx("ezyl", eyqb(int ), (int)311);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl192:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)hc.eypx("ezyn", eyqb(int ), (int)312);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl197:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)hc.eypx("ezyo", eyqb(int ), (int)313);
                if (!var7_2) ** GOTO lbl192
                throw null;
            }
lbl201:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)hc.eypx("ezyp", eyqb(int ), (int)314);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl206:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)hc.eypx("ezyr", eyqb(int ), (int)315);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl211:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)hc.eypx("ezys", eyqb(int ), (int)316);
                if (!var7_2) ** GOTO lbl201
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)hc.eypx("ezyu", eyqb(int ), (int)317);
                if (!var7_2) break;
                throw null;
            }
lbl219:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)hc.eypx("ezyv", eyqb(int ), (int)318);
                if (var7_2) {
                    throw null;
                }
            }
lbl223:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)hc.eypx("ezyw", eyqb(int ), (int)319);
                    if (!var7_2) ** GOTO lbl197
                    throw null;
                }
            }
            case 10: {
                do {
                    var6_3 /* !! */  = (int)hc.eypx("ezza", eyqb(int ), (int)320);
                } while (!var7_2);
                throw null;
            }
            case 11: 
        }
        var6_3 /* !! */  = (int)hc.eypx("ezzb", eyqb(int ), (int)321);
        ** while (!var7_2)
lbl236:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fawx() {
        hc.eyqe[300] = 584993705;
        hc.eyqe[301] = 640519845;
        hc.eyqe[302] = 764950596;
        hc.eyqe[303] = -1934229073;
        hc.eyqe[304] = 1765808386;
        hc.eyqe[305] = -1809790309;
        hc.eyqe[306] = -196041096;
        hc.eyqe[307] = -865256388;
        hc.eyqe[308] = -490177614;
        hc.eyqe[309] = 907819612;
        hc.eyqe[310] = 1947010356;
        hc.eyqe[311] = -528797728;
        hc.eyqe[312] = 526216167;
        hc.eyqe[313] = -1391108664;
        hc.eyqe[314] = -5881593;
        hc.eyqe[315] = 1980414287;
        hc.eyqe[316] = -1975621454;
        hc.eyqe[317] = -1760870017;
        hc.eyqe[318] = -253290012;
        hc.eyqe[319] = 976273988;
        hc.eyqe[320] = -706241514;
        hc.eyqe[321] = -321245598;
        hc.eyqe[322] = 999268035;
        hc.eyqe[323] = 712592935;
        hc.eyqe[324] = -1314631682;
        hc.eyqe[325] = -1356634644;
        hc.eyqe[326] = 1127027299;
        hc.eyqe[327] = 1386263350;
        hc.eyqe[328] = 1363457505;
        hc.eyqe[329] = 1994247577;
        hc.eyqe[330] = -784301375;
        hc.eyqe[331] = 2037597273;
        hc.eyqe[332] = -160473140;
        hc.eyqe[333] = -505526465;
        hc.eyqe[334] = 1209737675;
        hc.eyqe[335] = -237769316;
        hc.eyqe[336] = -1115524945;
        hc.eyqe[337] = 1680253149;
        hc.eyqe[338] = -2058585408;
        hc.eyqe[339] = -2099504346;
        hc.eyqe[340] = 1872791591;
        hc.eyqe[341] = -2119121675;
        hc.eyqe[342] = -1540311814;
        hc.eyqe[343] = -133328613;
        hc.eyqe[344] = -975121539;
        hc.eyqe[345] = -574424170;
        hc.eyqe[346] = 29182423;
        hc.eyqe[347] = 57945586;
        hc.eyqe[348] = -568605731;
        hc.eyqe[349] = 888688429;
        hc.eyqe[350] = 1021208991;
        hc.eyqe[351] = 453639799;
        hc.eyqe[352] = 628267702;
        hc.eyqe[353] = -981223844;
        hc.eyqe[354] = 1453569192;
        hc.eyqe[355] = -1131668134;
        hc.eyqe[356] = -1033282671;
        hc.eyqe[357] = 1004424115;
        hc.eyqe[358] = -571398225;
        hc.eyqe[359] = -346201566;
        hc.eyqe[360] = 1536622990;
        hc.eyqe[361] = 1440055884;
        hc.eyqe[362] = 2114403188;
        hc.eyqe[363] = -84539912;
        hc.eyqe[364] = -1201776238;
        hc.eyqe[365] = -937259715;
        hc.eyqe[366] = 777394610;
        hc.eyqe[367] = 81376095;
        hc.eyqe[368] = -838195256;
        hc.eyqe[369] = 846850844;
        hc.eyqe[370] = -1247804628;
        hc.eyqe[371] = -1768989196;
        hc.eyqe[372] = -298564741;
        hc.eyqe[373] = 627661936;
        hc.eyqe[374] = -1990675506;
        hc.eyqe[375] = 1435751633;
        hc.eyqe[376] = 649690916;
        hc.eyqe[377] = -1275570919;
        hc.eyqe[378] = 1104455469;
        hc.eyqe[379] = -972562857;
        hc.eyqe[380] = 667337892;
        hc.eyqe[381] = 1527438215;
        hc.eyqe[382] = 605889380;
        hc.eyqe[383] = 1241997594;
        hc.eyqe[384] = -1901450816;
        hc.eyqe[385] = 1305201812;
        hc.eyqe[386] = 1561573085;
        hc.eyqe[387] = -875722061;
        hc.eyqe[388] = 553810322;
        hc.eyqe[389] = 389085669;
        hc.eyqe[390] = -981646832;
        hc.eyqe[391] = -682341578;
        hc.eyqe[392] = 1889580835;
        hc.eyqe[393] = 768605824;
        hc.eyqe[394] = -1361669048;
        hc.eyqe[395] = -1514160168;
        hc.eyqe[396] = 1787466870;
        hc.eyqe[397] = -1032970567;
        hc.eyqe[398] = -1303997265;
        hc.eyqe[399] = -269064102;
    }

    private static /* synthetic */ void fawy() {
        hc.eyqe[400] = -877519192;
        hc.eyqe[401] = 337293698;
        hc.eyqe[402] = -1790359979;
        hc.eyqe[403] = -298063538;
        hc.eyqe[404] = 1558227234;
        hc.eyqe[405] = 58817989;
        hc.eyqe[406] = 1526561808;
        hc.eyqe[407] = 336952370;
        hc.eyqe[408] = -635666915;
        hc.eyqe[409] = 662534807;
        hc.eyqe[410] = 658466461;
        hc.eyqe[411] = -545469248;
        hc.eyqe[412] = -1080388761;
        hc.eyqe[413] = -719659346;
        hc.eyqe[414] = 1482383626;
        hc.eyqe[415] = -1848453245;
        hc.eyqe[416] = -980400282;
        hc.eyqe[417] = -10079472;
        hc.eyqe[418] = 855023448;
        hc.eyqe[419] = -1509319251;
        hc.eyqe[420] = 84299276;
        hc.eyqe[421] = -699149485;
        hc.eyqe[422] = 974779493;
        hc.eyqe[423] = -1686760273;
        hc.eyqe[424] = 1073193353;
        hc.eyqe[425] = -1635334349;
        hc.eyqe[426] = 1291435599;
        hc.eyqe[427] = -1710334419;
        hc.eyqe[428] = -1267553991;
        hc.eyqe[429] = 1518655143;
        hc.eyqe[430] = 1898784043;
        hc.eyqe[431] = -1170661989;
        hc.eyqe[432] = 1312378732;
        hc.eyqe[433] = -363329339;
        hc.eyqe[434] = -690753970;
        hc.eyqe[435] = 1387647093;
        hc.eyqe[436] = -696234497;
        hc.eyqe[437] = -626513926;
        hc.eyqe[438] = 1656947473;
        hc.eyqe[439] = 998184056;
        hc.eyqe[440] = -884506675;
        hc.eyqe[441] = -888333644;
        hc.eyqe[442] = -1801629472;
        hc.eyqe[443] = -126421878;
        hc.eyqe[444] = -1339712732;
        hc.eyqe[445] = -2004556321;
        hc.eyqe[446] = 1967620964;
        hc.eyqe[447] = 544024119;
        hc.eyqe[448] = -47646493;
        hc.eyqe[449] = 481875700;
        hc.eyqe[450] = -1846333118;
        hc.eyqe[451] = -1720631125;
        hc.eyqe[452] = -1847830034;
        hc.eyqe[453] = 826216400;
        hc.eyqe[454] = -1446263406;
        hc.eyqe[455] = 61162460;
        hc.eyqe[456] = 999489523;
        hc.eyqe[457] = -2022666462;
        hc.eyqe[458] = -1332118310;
        hc.eyqe[459] = -1292893470;
        hc.eyqe[460] = 1543015163;
        hc.eyqe[461] = -1416076703;
        hc.eyqe[462] = 631955961;
        hc.eyqe[463] = 1355557135;
        hc.eyqe[464] = -751428878;
        hc.eyqe[465] = 1620017919;
        hc.eyqe[466] = 1921615206;
        hc.eyqe[467] = -853749026;
        hc.eyqe[468] = -2037988201;
        hc.eyqe[469] = -128159211;
        hc.eyqe[470] = 1460256615;
        hc.eyqe[471] = 1841218267;
        hc.eyqe[472] = -10780855;
        hc.eyqe[473] = 757525035;
        hc.eyqe[474] = -759613788;
        hc.eyqe[475] = 40558173;
        hc.eyqe[476] = -2014735267;
        hc.eyqe[477] = -784763323;
        hc.eyqe[478] = 1930388211;
        hc.eyqe[479] = 1236101314;
        hc.eyqe[480] = 1020081995;
        hc.eyqe[481] = -1233210810;
        hc.eyqe[482] = 1202134043;
        hc.eyqe[483] = -1586767868;
        hc.eyqe[484] = 2004796554;
        hc.eyqe[485] = -1145593797;
        hc.eyqe[486] = 1625411965;
        hc.eyqe[487] = 1315824348;
        hc.eyqe[488] = 765480812;
        hc.eyqe[489] = -1748163487;
        hc.eyqe[490] = -1281016445;
        hc.eyqe[491] = 70428260;
        hc.eyqe[492] = 1142649748;
        hc.eyqe[493] = -1999764495;
        hc.eyqe[494] = -1126067362;
        hc.eyqe[495] = -2074904054;
        hc.eyqe[496] = 755034734;
        hc.eyqe[497] = 1606214640;
        hc.eyqe[498] = 220113263;
        hc.eyqe[499] = -755510812;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("fasw", eypu(int ), (int)199)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hc.eypx("fasx", eyqb(int ), (int)514)) break;
            v0 /* !! */  = (long)hc.eypx("fasy", eyqb(int ), (int)515);
        }
        var3_1 = hc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("fasz", eypu(int ), (int)200)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hc.eypx("fata", eyqb(int ), (int)516)) break;
            v1 /* !! */  = (long)hc.eypx("fatb", eyqb(int ), (int)517);
        }
        var2_2 /* !! */  = hc.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("fatc", eypu(int ), (int)201)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == hc.eypx("fatd", eyqb(int ), (int)518)) break;
                    v2 /* !! */  = (long)hc.eypx("fate", eyqb(int ), (int)519);
                }
                var1_3 = hc.a;
                if (var3_1) {
                    throw null;
lbl27:
                    // 6 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl27
                v3 /* !! */  = hc.ln;
                if (true) ** GOTO lbl34
                block33: while (true) {
                    v3 /* !! */  = (long)(hc.eypx("fatg", eypu(int ), (int)203) - hc.eypx("fatf", eypu(int ), (int)202));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1001711986: {
                            continue block33;
                        }
                        case 1982262588: {
                            break block33;
                        }
                    }
                    break;
                }
                if (!this.silentSwap) ** GOTO lbl59
                if (var1_3 || var1_3) ** GOTO lbl27
                v4 /* !! */  = hc.ln;
                if (true) ** GOTO lbl45
                block34: while (true) {
                    v4 /* !! */  = (long)(v5 - hc.eypx("fath", eypu(int ), (int)204));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 766258072: {
                            v5 = hc.eypx("fati", eypu(int ), (int)205);
                            continue block34;
                        }
                        case 1081895396: {
                            v5 = hc.eypx("fatj", eypu(int ), (int)206);
                            continue block34;
                        }
                        case 1982262588: {
                            break block34;
                        }
                    }
                    break;
                }
                nv.restoreSlotSilent();
                if (var1_3) ** GOTO lbl27
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl75
lbl59:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl27
                v6 /* !! */  = hc.ln;
                if (true) ** GOTO lbl64
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - hc.eypx("fatl", eypu(int ), (int)207));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 138042368: {
                            v7 = hc.eypx("fatm", eypu(int ), (int)208);
                            continue block35;
                        }
                        case 216764574: {
                            v7 = hc.eypx("fatn", eypu(int ), (int)209);
                            continue block35;
                        }
                        case 1982262588: {
                            break block35;
                        }
                    }
                    break;
                }
                nv.restoreSlot();
                if (var1_3) ** GOTO lbl27
lbl75:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl78:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)hc.eypx("fato", eyqb(int ), (int)520);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 1: {
                var2_2 /* !! */  = (int)hc.eypx("fatp", eyqb(int ), (int)521);
                if (var3_1) {
                    throw null;
                }
            }
lbl87:
            // 5 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("fatq", eyqb(int ), (int)522);
                } while (!var3_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hc.eypx("fatr", eyqb(int ), (int)523);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl122
                    break;
                }
            }
lbl98:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hc.eypx("fats", eyqb(int ), (int)524);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hc.eypx("fatt", eyqb(int ), (int)525);
                if (!var3_1) break;
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hc.eypx("fatu", eyqb(int ), (int)526);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hc.eypx("fatv", eyqb(int ), (int)527);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
lbl114:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hc.eypx("fatw", eyqb(int ), (int)528);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hc.eypx("fatx", eyqb(int ), (int)529);
                if (var3_1) {
                    throw null;
                }
            }
lbl122:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)hc.eypx("faty", eyqb(int ), (int)530);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)hc.eypx("fatz", eyqb(int ), (int)531);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)hc.eypx("faua", eyqb(int ), (int)532);
        ** while (!var3_1)
lbl133:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fawn() {
        hc.eyqd[300] = 584993704;
        hc.eyqd[301] = 640519845;
        hc.eyqd[302] = 764950596;
        hc.eyqd[303] = 1934229072;
        hc.eyqd[304] = -1797289658;
        hc.eyqd[305] = -1809790310;
        hc.eyqd[306] = 196041095;
        hc.eyqd[307] = 1964256297;
        hc.eyqd[308] = -490177613;
        hc.eyqd[309] = -1695915585;
        hc.eyqd[310] = 1947010357;
        hc.eyqd[311] = -528797721;
        hc.eyqd[312] = 526216166;
        hc.eyqd[313] = -1391108664;
        hc.eyqd[314] = -5881600;
        hc.eyqd[315] = 1980414280;
        hc.eyqd[316] = -1975621452;
        hc.eyqd[317] = -1760870020;
        hc.eyqd[318] = -253290011;
        hc.eyqd[319] = 976273990;
        hc.eyqd[320] = -706241513;
        hc.eyqd[321] = -321245598;
        hc.eyqd[322] = 999268034;
        hc.eyqd[323] = -1231169089;
        hc.eyqd[324] = -1314631681;
        hc.eyqd[325] = 1356634643;
        hc.eyqd[326] = 1127027298;
        hc.eyqd[327] = -1420330237;
        hc.eyqd[328] = -1363457506;
        hc.eyqd[329] = 1994247576;
        hc.eyqd[330] = -2097752478;
        hc.eyqd[331] = -2037597274;
        hc.eyqd[332] = -160473139;
        hc.eyqd[333] = -505526465;
        hc.eyqd[334] = 1209737677;
        hc.eyqd[335] = -237769316;
        hc.eyqd[336] = -1115524948;
        hc.eyqd[337] = 1680253150;
        hc.eyqd[338] = -2058585398;
        hc.eyqd[339] = -2099504348;
        hc.eyqd[340] = 1872791584;
        hc.eyqd[341] = -2119121678;
        hc.eyqd[342] = -1540311822;
        hc.eyqd[343] = -133328611;
        hc.eyqd[344] = -975121545;
        hc.eyqd[345] = -574424163;
        hc.eyqd[346] = 29182422;
        hc.eyqd[347] = 1541039117;
        hc.eyqd[348] = -568605732;
        hc.eyqd[349] = 353109121;
        hc.eyqd[350] = -1021208992;
        hc.eyqd[351] = 1315689279;
        hc.eyqd[352] = -628267703;
        hc.eyqd[353] = 734414010;
        hc.eyqd[354] = 1453569193;
        hc.eyqd[355] = 916587906;
        hc.eyqd[356] = 1033282670;
        hc.eyqd[357] = -2003464793;
        hc.eyqd[358] = -571398225;
        hc.eyqd[359] = -346201566;
        hc.eyqd[360] = 1536622991;
        hc.eyqd[361] = 385778831;
        hc.eyqd[362] = 2114403197;
        hc.eyqd[363] = -84539918;
        hc.eyqd[364] = -1201776229;
        hc.eyqd[365] = -937259726;
        hc.eyqd[366] = 777394619;
        hc.eyqd[367] = 81376085;
        hc.eyqd[368] = -838195255;
        hc.eyqd[369] = 846850846;
        hc.eyqd[370] = -1247804639;
        hc.eyqd[371] = -1768989194;
        hc.eyqd[372] = -298564743;
        hc.eyqd[373] = 627661939;
        hc.eyqd[374] = -1990675515;
        hc.eyqd[375] = 1435751634;
        hc.eyqd[376] = 649690921;
        hc.eyqd[377] = -1275570926;
        hc.eyqd[378] = 1104455461;
        hc.eyqd[379] = -972562873;
        hc.eyqd[380] = -667337889;
        hc.eyqd[381] = -1527438212;
        hc.eyqd[382] = -605889377;
        hc.eyqd[383] = 1241997599;
        hc.eyqd[384] = -1901450811;
        hc.eyqd[385] = 1305201809;
        hc.eyqd[386] = 1561573058;
        hc.eyqd[387] = -875722080;
        hc.eyqd[388] = 553810311;
        hc.eyqd[389] = 389085695;
        hc.eyqd[390] = -981646841;
        hc.eyqd[391] = -682341577;
        hc.eyqd[392] = 1889580836;
        hc.eyqd[393] = 768605836;
        hc.eyqd[394] = -1361669027;
        hc.eyqd[395] = -1514160192;
        hc.eyqd[396] = 1787466864;
        hc.eyqd[397] = -1032970578;
        hc.eyqd[398] = -1303997275;
        hc.eyqd[399] = -269064106;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = hc.ln;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(hc.eypx("favm", eypu(int ), (int)232) - hc.eypx("favl", eypu(int ), (int)231));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 730704954: {
                    continue block24;
                }
                case 1982262588: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = hc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("favo", eypu(int ), (int)233)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hc.eypx("favp", eyqb(int ), (int)546)) break;
            v1 /* !! */  = (long)hc.eypx("favq", eyqb(int ), (int)547);
        }
        var2_2 /* !! */  = hc.b;
        v2 /* !! */  = hc.ln;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(hc.eypx("favs", eypu(int ), (int)235) - hc.eypx("favr", eypu(int ), (int)234));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1936106095: {
                    continue block26;
                }
                case 1982262588: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = hc.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("favt", eypu(int ), (int)236)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hc.eypx("favu", eyqb(int ), (int)548)) break;
                    v3 /* !! */  = (long)hc.eypx("favv", eyqb(int ), (int)549);
                }
                v4 /* !! */  = hc.ln;
                if (true) ** GOTO lbl46
                block29: while (true) {
                    v4 /* !! */  = (long)(hc.eypx("favx", eypu(int ), (int)238) - hc.eypx("favw", eypu(int ), (int)237));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1064181237: {
                            continue block29;
                        }
                        case 1982262588: {
                            break block29;
                        }
                    }
                    break;
                }
                v5 = this.ignite.isValue();
                v6 /* !! */  = hc.ln;
                if (true) ** GOTO lbl56
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - hc.eypx("favy", eypu(int ), (int)239));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 493683895: {
                            v7 = hc.eypx("favz", eypu(int ), (int)240);
                            continue block30;
                        }
                        case 1700854411: {
                            v7 = hc.eypx("fawa", eypu(int ), (int)241);
                            continue block30;
                        }
                        case 1976027269: {
                            v7 = hc.eypx("fawc", eypu(int ), (int)242);
                            continue block30;
                        }
                        case 1982262588: {
                            break block30;
                        }
                    }
                    break;
                }
                return v5;
            }
lbl69:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hc.eypx("fawd", eyqb(int ), (int)550);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hc.eypx("fawf", eyqb(int ), (int)551);
                } while (!var3_1);
                throw null;
            }
lbl79:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hc.eypx("fawg", eyqb(int ), (int)552);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hc.eypx("fawh", eyqb(int ), (int)553);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void faxc() {
        hc.eypv[0] = 6972885152007811577L;
        hc.eypv[1] = 2444827457722296117L;
        hc.eypv[2] = -5227835879853855976L;
        hc.eypv[3] = 7498250582379701924L;
        hc.eypv[4] = -93079812952511240L;
        hc.eypv[5] = 888523166759857238L;
        hc.eypv[6] = -2710590689709367108L;
        hc.eypv[7] = 6758255487110181166L;
        hc.eypv[8] = 3231906128214695721L;
        hc.eypv[9] = -6715757291315645776L;
        hc.eypv[10] = 7740712201076447967L;
        hc.eypv[11] = -3671049836986542552L;
        hc.eypv[12] = 2031777471908051990L;
        hc.eypv[13] = -883747610903856757L;
        hc.eypv[14] = -6814546523347373544L;
        hc.eypv[15] = -5352118248103901785L;
        hc.eypv[16] = -7847170058986975936L;
        hc.eypv[17] = 8857207610851060505L;
        hc.eypv[18] = -8080199292323654155L;
        hc.eypv[19] = -5020745649213713341L;
        hc.eypv[20] = 7131287654562727207L;
        hc.eypv[21] = 2774364647361888147L;
        hc.eypv[22] = 3215348665898707752L;
        hc.eypv[23] = -6909640654791310030L;
        hc.eypv[24] = -4477030002532674136L;
        hc.eypv[25] = -7375917400631694531L;
        hc.eypv[26] = -2732563627108709123L;
        hc.eypv[27] = 1273569495661414382L;
        hc.eypv[28] = -4822997548068222961L;
        hc.eypv[29] = 8096897349754718708L;
        hc.eypv[30] = 8295026239627434613L;
        hc.eypv[31] = 1476611099137825011L;
        hc.eypv[32] = 5276662163213245734L;
        hc.eypv[33] = -2179004004607016383L;
        hc.eypv[34] = -6087061362812536618L;
        hc.eypv[35] = 5027746870234225158L;
        hc.eypv[36] = -5787805739958151399L;
        hc.eypv[37] = 6212482597396318471L;
        hc.eypv[38] = 3360256806395746828L;
        hc.eypv[39] = 3836525640066980383L;
        hc.eypv[40] = 1257165669655427874L;
        hc.eypv[41] = -5077056562530628578L;
        hc.eypv[42] = -4409941464068370207L;
        hc.eypv[43] = 6531962767123583707L;
        hc.eypv[44] = 8168431542228513233L;
        hc.eypv[45] = 6792334802207142529L;
        hc.eypv[46] = 4201075837493634462L;
        hc.eypv[47] = 8518674194393915426L;
        hc.eypv[48] = 350539276090795228L;
        hc.eypv[49] = -1271085823455932230L;
        hc.eypv[50] = -4884325142758581031L;
        hc.eypv[51] = 9014474631366086359L;
        hc.eypv[52] = -8863207214901811393L;
        hc.eypv[53] = -8388735576466815283L;
        hc.eypv[54] = 469573007815645408L;
        hc.eypv[55] = 4750407573513281784L;
        hc.eypv[56] = 5461968332425081266L;
        hc.eypv[57] = 232671779240994004L;
        hc.eypv[58] = -136475088959605059L;
        hc.eypv[59] = 2438009176506254949L;
        hc.eypv[60] = 8511471417676091409L;
        hc.eypv[61] = -1952735798551792182L;
        hc.eypv[62] = 544049529173920199L;
        hc.eypv[63] = -6800806626739864813L;
        hc.eypv[64] = -5374361864697497737L;
        hc.eypv[65] = -1847447081138339230L;
        hc.eypv[66] = -6791812450469959664L;
        hc.eypv[67] = -5593100640829399641L;
        hc.eypv[68] = -735566387897939542L;
        hc.eypv[69] = 8576052224727446367L;
        hc.eypv[70] = 5594321303755931064L;
        hc.eypv[71] = 8921819198598765147L;
        hc.eypv[72] = -7416940886067419922L;
        hc.eypv[73] = -1213428356312186418L;
        hc.eypv[74] = 1525062647012571849L;
        hc.eypv[75] = -2118910914476139589L;
        hc.eypv[76] = 5952458099775454563L;
        hc.eypv[77] = -7823532904085567785L;
        hc.eypv[78] = -184060530319916828L;
        hc.eypv[79] = 3741103277826116828L;
        hc.eypv[80] = 2824541517250963892L;
        hc.eypv[81] = 1866216922151426273L;
        hc.eypv[82] = 425896896329007475L;
        hc.eypv[83] = 48282129181430563L;
        hc.eypv[84] = 6204440757952567014L;
        hc.eypv[85] = -5138554025122268477L;
        hc.eypv[86] = 3173870245344148066L;
        hc.eypv[87] = -7487693858968207955L;
        hc.eypv[88] = -2986728663743634074L;
        hc.eypv[89] = 4289995511752566033L;
        hc.eypv[90] = -2418037164817358322L;
        hc.eypv[91] = 5421074027100543927L;
        hc.eypv[92] = 5737931052039746644L;
        hc.eypv[93] = -8607078006306395526L;
        hc.eypv[94] = -8061734707398751357L;
        hc.eypv[95] = -8624617133192451685L;
        hc.eypv[96] = -1795902797147539225L;
        hc.eypv[97] = -8290264459243181089L;
        hc.eypv[98] = 5163034578034826805L;
        hc.eypv[99] = 5630592018532867700L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 findNearestRail() {
        block67: {
            var12_1 = hc.c;
            var11_2 /* !! */  = hc.b;
            var10_3 = hc.a;
            if (var12_1) {
                throw null;
lbl6:
                // 19 sources

                return null;
            }
            if (var10_3 || var10_3) ** GOTO lbl6
            var1_4 = hc.mc.field_1724.method_24515();
            if (var10_3 || var10_3) ** GOTO lbl6
            var2_5 = hc.mc.field_1724.method_33571();
            if (var10_3 || var10_3) ** GOTO lbl6
            var3_6 = null;
            if (var10_3 || var10_3) ** GOTO lbl6
            var4_7 /* !! */  = hc.eypx("faej", ezdx(int ), (int)124);
            if (var10_3 || var10_3) ** GOTO lbl6
            var6_8 = class_2338.method_10097((class_2338)var1_4.method_10069((int)hc.eypx("fael", eyqb(int ), (int)380), (int)hc.eypx("faem", eyqb(int ), (int)381), (int)hc.eypx("faen", eyqb(int ), (int)382)), (class_2338)var1_4.method_10069((int)hc.eypx("faeo", eyqb(int ), (int)383), (int)hc.eypx("faer", eyqb(int ), (int)384), (int)hc.eypx("faet", eyqb(int ), (int)385))).iterator();
            if (var10_3) ** GOTO lbl6
            do lbl-1000:
            // 3 sources

            {
                block69: {
                    block68: {
                        if (var10_3 || var10_3) ** GOTO lbl6
                        if (!var6_8.hasNext()) break block67;
                        if (var10_3) ** GOTO lbl6
                        var7_9 = (class_2338)var6_8.next();
                        if (var10_3 || var10_3) ** GOTO lbl6
                        if (this.isRail(hc.mc.field_1687.method_8320(var7_9))) break block68;
                        if (var10_3) ** GOTO lbl6
                        if (!var12_1) ** GOTO lbl-1000
                        throw null;
                    }
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var8_10 = var2_5.method_1022(class_243.method_24953((class_2382)var7_9));
                    if (var10_3 || var10_3) ** GOTO lbl6
                    if (!(var8_10 <= hc.eypx("faew", ezdx(int ), (int)125))) break block69;
                    if (var10_3) ** GOTO lbl6
                    if (!(var8_10 < var4_7 /* !! */ )) break block69;
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var3_6 = var7_9.method_10062();
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var4_7 /* !! */  = (CallSite)var8_10;
                    if (var10_3) ** GOTO lbl6
                }
                if (var10_3 || var10_3) ** GOTO lbl6
            } while (!var12_1);
            throw null;
        }
        if (var10_3) ** GOTO lbl6
        if (var11_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var10_3) ** break;
                ** continue;
                return var3_6;
            }
lbl53:
            // 2 sources

            case 0: {
                var11_2 /* !! */  = (int)hc.eypx("faey", eyqb(int ), (int)386);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl58:
            // 2 sources

            case 1: {
                var11_2 /* !! */  = (int)hc.eypx("faez", eyqb(int ), (int)387);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl63:
            // 3 sources

            case 2: {
                var11_2 /* !! */  = (int)hc.eypx("fafb", eyqb(int ), (int)388);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl68:
            // 2 sources

            case 3: {
                do {
                    var11_2 /* !! */  = (int)hc.eypx("fafc", eyqb(int ), (int)389);
                } while (!var12_1);
                throw null;
            }
lbl73:
            // 4 sources

            case 4: {
                var11_2 /* !! */  = (int)hc.eypx("fafd", eyqb(int ), (int)390);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl78:
            // 2 sources

            case 5: {
                var11_2 /* !! */  = (int)hc.eypx("fafe", eyqb(int ), (int)391);
                if (!var12_1) ** GOTO lbl53
                throw null;
            }
            case 6: {
                var11_2 /* !! */  = (int)hc.eypx("fafg", eyqb(int ), (int)392);
                if (!var12_1) ** GOTO lbl63
                throw null;
            }
            case 7: {
                var11_2 /* !! */  = (int)hc.eypx("fafh", eyqb(int ), (int)393);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl91:
            // 2 sources

            case 8: {
                var11_2 /* !! */  = (int)hc.eypx("fafi", eyqb(int ), (int)394);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 9: {
                var11_2 /* !! */  = (int)hc.eypx("fafj", eyqb(int ), (int)395);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl101:
            // 3 sources

            case 10: {
                var11_2 /* !! */  = (int)hc.eypx("fafl", eyqb(int ), (int)396);
                if (!var12_1) break;
                throw null;
            }
lbl105:
            // 3 sources

            case 11: {
                var11_2 /* !! */  = (int)hc.eypx("fafm", eyqb(int ), (int)397);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl110:
            // 2 sources

            case 12: {
                var11_2 /* !! */  = (int)hc.eypx("fafn", eyqb(int ), (int)398);
                if (!var12_1) ** GOTO lbl68
                throw null;
            }
lbl114:
            // 2 sources

            case 13: {
                var11_2 /* !! */  = (int)hc.eypx("fafq", eyqb(int ), (int)399);
                if (!var12_1) ** GOTO lbl101
                throw null;
            }
lbl118:
            // 5 sources

            case 14: {
                var11_2 /* !! */  = (int)hc.eypx("fafr", eyqb(int ), (int)400);
                if (!var12_1) ** GOTO lbl73
                throw null;
            }
lbl122:
            // 2 sources

            case 15: {
                var11_2 /* !! */  = (int)hc.eypx("fafs", eyqb(int ), (int)401);
                if (!var12_1) ** GOTO lbl73
                throw null;
            }
            case 16: {
                var11_2 /* !! */  = (int)hc.eypx("fafu", eyqb(int ), (int)402);
                if (!var12_1) ** GOTO lbl91
                throw null;
            }
lbl130:
            // 2 sources

            case 17: {
                var11_2 /* !! */  = (int)hc.eypx("fafv", eyqb(int ), (int)403);
                if (!var12_1) ** GOTO lbl73
                throw null;
            }
lbl134:
            // 2 sources

            case 18: {
                var11_2 /* !! */  = (int)hc.eypx("fafw", eyqb(int ), (int)404);
                if (!var12_1) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 19: {
                var11_2 /* !! */  = (int)hc.eypx("fafx", eyqb(int ), (int)405);
                if (!var12_1) ** GOTO lbl110
                throw null;
            }
lbl142:
            // 2 sources

            case 20: {
                var11_2 /* !! */  = (int)hc.eypx("fafz", eyqb(int ), (int)406);
                if (!var12_1) ** GOTO lbl101
                throw null;
            }
            case 21: {
                var11_2 /* !! */  = (int)hc.eypx("faga", eyqb(int ), (int)407);
                if (!var12_1) ** GOTO lbl118
                throw null;
            }
            case 22: {
                var11_2 /* !! */  = (int)hc.eypx("fagb", eyqb(int ), (int)408);
                if (!var12_1) ** GOTO lbl58
                throw null;
            }
            case 23: {
                var11_2 /* !! */  = (int)hc.eypx("fagc", eyqb(int ), (int)409);
                if (!var12_1) ** GOTO lbl63
                throw null;
            }
            case 24: {
                var11_2 /* !! */  = (int)hc.eypx("fagd", eyqb(int ), (int)410);
                if (!var12_1) ** GOTO lbl142
                throw null;
            }
lbl162:
            // 2 sources

            case 25: {
                var11_2 /* !! */  = (int)hc.eypx("fage", eyqb(int ), (int)411);
                if (var12_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 26: {
                var11_2 /* !! */  = (int)hc.eypx("fagf", eyqb(int ), (int)412);
                if (!var12_1) ** GOTO lbl138
                throw null;
            }
lbl171:
            // 2 sources

            case 27: {
                var11_2 /* !! */  = (int)hc.eypx("fagl", eyqb(int ), (int)413);
                if (!var12_1) ** GOTO lbl78
                throw null;
            }
lbl175:
            // 2 sources

            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_2 /* !! */  = (int)hc.eypx("fagm", eyqb(int ), (int)414);
                    if (!var12_1) ** GOTO lbl118
                    throw null;
                }
            }
            case 29: {
                var11_2 /* !! */  = (int)hc.eypx("fagn", eyqb(int ), (int)415);
                if (!var12_1) ** GOTO lbl162
                throw null;
            }
            case 30: {
                var11_2 /* !! */  = (int)hc.eypx("fago", eyqb(int ), (int)416);
                if (!var12_1) ** GOTO lbl122
                throw null;
            }
lbl188:
            // 3 sources

            case 31: {
                var11_2 /* !! */  = (int)hc.eypx("fagp", eyqb(int ), (int)417);
                if (!var12_1) ** GOTO lbl105
                throw null;
            }
lbl192:
            // 2 sources

            case 32: {
                var11_2 /* !! */  = (int)hc.eypx("fagq", eyqb(int ), (int)418);
                if (!var12_1) ** GOTO lbl188
                throw null;
            }
            case 33: 
        }
        var11_2 /* !! */  = (int)hc.eypx("fagr", eyqb(int ), (int)419);
        ** while (!var12_1)
lbl199:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ln - hc.eypx("eysh", eypu(int ), (int)5)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == hc.eypx("eysi", eyqb(int ), (int)24)) break;
            object = hc.eypx("eysj", eyqb(int ), (int)25);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ln - hc.eypx("eysl", eypu(int ), (int)6)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == hc.eypx("eysq", eyqb(int ), (int)26)) break;
            object = hc.eypx("eysr", eyqb(int ), (int)27);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ln - hc.eypx("eyss", eypu(int ), (int)7)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == hc.eypx("eyst", eyqb(int ), (int)28)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = hc.eypx("eysu", eyqb(int ), (int)29);
        }
        if (bl2 || bl2) return;
        CallSite callSite = hc.eypx("eysv", eyqb(int ), (int)30);
        Object object = ln;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite2;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite2 - hc.eypx("eysw", eypu(int ), (int)8);
            }
            switch ((int)object) {
                case 590541727: {
                    callSite2 = hc.eypx("eysy", eypu(int ), (int)9);
                    continue block18;
                }
                case 1162053601: {
                    callSite2 = hc.eypx("eysz", eypu(int ), (int)10);
                    continue block18;
                }
                case 1982262588: {
                    break block18;
                }
            }
            break;
        }
        this.stage = (int)callSite;
        if (bl2 || bl2) return;
        CallSite callSite3 = hc.eypx("eytb", eyqb(int ), (int)31);
        Object object2 = ln;
        block19: while (true) {
            switch ((int)object2) {
                case -2108550644: {
                    object2 = hc.eypx("eytd", eypu(int ), (int)12) - hc.eypx("eytc", eypu(int ), (int)11);
                    continue block19;
                }
                case 1982262588: {
                    break block19;
                }
            }
            break;
        }
        this.waitTicks = (int)callSite3;
        if (bl2 || bl2) return;
        CallSite callSite4 = hc.eypx("eytf", eyqb(int ), (int)32);
        while (true) {
            long l5;
            Object object3;
            if ((object3 = (l5 = ln - hc.eypx("eytj", eypu(int ), (int)13)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hc.eypx("eytk", eyqb(int ), (int)33)) {
                this.drawCounter = (int)callSite4;
                if (bl2) return;
                break;
            }
            object3 = hc.eypx("eytn", eyqb(int ), (int)34);
        }
        if (bl2) return;
        CallSite callSite5 = hc.eypx("eyto", eyqb(int ), (int)35);
        while (true) {
            long l6;
            Object object4;
            if ((object4 = (l6 = ln - hc.eypx("eytp", eypu(int ), (int)14)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object4 == hc.eypx("eytq", eyqb(int ), (int)36)) {
                this.swapped = callSite5;
                if (bl2) return;
                break;
            }
            object4 = hc.eypx("eytr", eyqb(int ), (int)37);
        }
        if (bl2) return;
        Object object5 = ln;
        boolean bl5 = true;
        block22: while (true) {
            CallSite callSite6;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite6 - hc.eypx("eyts", eypu(int ), (int)15);
            }
            switch ((int)object5) {
                case -1973767906: {
                    callSite6 = hc.eypx("eytt", eypu(int ), (int)16);
                    continue block22;
                }
                case -635705789: {
                    callSite6 = hc.eypx("eytu", eypu(int ), (int)17);
                    continue block22;
                }
                case 1371153557: {
                    callSite6 = hc.eypx("eytw", eypu(int ), (int)18);
                    continue block22;
                }
                case 1982262588: {
                    break block22;
                }
            }
            break;
        }
        this.railPos = null;
        if (!bl2 && !bl2) return;
    }

    private static /* synthetic */ double ezdx(int n2) {
        return Double.longBitsToDouble(eypv[n2] ^ eypw[n2]);
    }

    private static /* synthetic */ void faxk() {
        hc.eypw[200] = 7335923415108366670L;
        hc.eypw[201] = 4009725759839863231L;
        hc.eypw[202] = -2095865492702442543L;
        hc.eypw[203] = 206614954153716348L;
        hc.eypw[204] = -2479884044300085982L;
        hc.eypw[205] = -3927871155846876245L;
        hc.eypw[206] = -5374852604925269555L;
        hc.eypw[207] = -4582868234887569761L;
        hc.eypw[208] = -4066776788384694053L;
        hc.eypw[209] = -4441574712142471999L;
        hc.eypw[210] = -2191569909563682650L;
        hc.eypw[211] = 4613643856973418993L;
        hc.eypw[212] = 1890798540814199338L;
        hc.eypw[213] = -3942661996929926122L;
        hc.eypw[214] = -5013050820186541739L;
        hc.eypw[215] = -8189653315564487172L;
        hc.eypw[216] = 8272919884264967913L;
        hc.eypw[217] = 9037989238079366314L;
        hc.eypw[218] = 3627249242075067174L;
        hc.eypw[219] = 3145293697957723762L;
        hc.eypw[220] = -6916002438253336720L;
        hc.eypw[221] = 7453635411713883953L;
        hc.eypw[222] = 5602454276154299951L;
        hc.eypw[223] = 6684899551540536533L;
        hc.eypw[224] = 775272650163757087L;
        hc.eypw[225] = 5456805996036816102L;
        hc.eypw[226] = 5589171547711227305L;
        hc.eypw[227] = -9161901301889201366L;
        hc.eypw[228] = 442857631135356073L;
        hc.eypw[229] = 5141840276830344441L;
        hc.eypw[230] = -7310269034417501302L;
        hc.eypw[231] = -2373636921387767811L;
        hc.eypw[232] = 5475433996889561117L;
        hc.eypw[233] = 9052877094914838084L;
        hc.eypw[234] = -3239388148833725315L;
        hc.eypw[235] = -2754446319459117825L;
        hc.eypw[236] = -6937916859039140929L;
        hc.eypw[237] = -5805956729942674362L;
        hc.eypw[238] = 6421080301684791283L;
        hc.eypw[239] = -6959470144179949397L;
        hc.eypw[240] = -2399457036773797347L;
        hc.eypw[241] = -8546530518554240939L;
        hc.eypw[242] = -8880984038955239720L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void abort(String var1_1) {
        block70: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hc.ln - hc.eypx("fabg", eypu(int ), (int)103)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hc.eypx("fabi", eyqb(int ), (int)346)) break;
                v0 /* !! */  = (long)hc.eypx("fabj", eyqb(int ), (int)347);
            }
            var4_2 = hc.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hc.ln - hc.eypx("fabk", eypu(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hc.eypx("fabl", eyqb(int ), (int)348)) break;
                v1 /* !! */  = (long)hc.eypx("fabo", eyqb(int ), (int)349);
            }
            var3_3 /* !! */  = hc.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = hc.ln - hc.eypx("fabp", eypu(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hc.eypx("fabq", eyqb(int ), (int)350)) break;
                v2 /* !! */  = (long)hc.eypx("fabr", eyqb(int ), (int)351);
            }
            var2_4 = hc.a;
            if (var4_2) {
                throw null;
lbl21:
                // 9 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = hc.ln - hc.eypx("fabt", eypu(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hc.eypx("fabu", eyqb(int ), (int)352)) break;
                v3 /* !! */  = (long)hc.eypx("fabv", eyqb(int ), (int)353);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_4 = hc.ln - hc.eypx("faby", eypu(int ), (int)107)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hc.eypx("fabz", eyqb(int ), (int)354)) break;
                v4 /* !! */  = (long)hc.eypx("faca", eyqb(int ), (int)355);
            }
            if (!this.debugMessages.isValue()) break block70;
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_5 = hc.ln - hc.eypx("facb", eypu(int ), (int)108)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hc.eypx("facc", eyqb(int ), (int)356)) break;
                v5 /* !! */  = (long)hc.eypx("facd", eyqb(int ), (int)357);
            }
            v6 = "AutoCart: " + var1_1;
            v7 /* !! */  = hc.ln;
            if (true) ** GOTO lbl46
            block49: while (true) {
                v7 /* !! */  = (long)(v8 - hc.eypx("face", eypu(int ), (int)109));
lbl46:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 84177648: {
                        v8 = hc.eypx("facf", eypu(int ), (int)110);
                        continue block49;
                    }
                    case 124667975: {
                        v8 = hc.eypx("facg", eypu(int ), (int)111);
                        continue block49;
                    }
                    case 1982262588: {
                        break block49;
                    }
                }
                break;
            }
            pp.brandmessage(v6);
            if (var2_4) ** GOTO lbl21
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v9 /* !! */  = hc.ln;
        if (true) ** GOTO lbl63
        block50: while (true) {
            v9 /* !! */  = (long)(v10 - hc.eypx("faci", eypu(int ), (int)112));
lbl63:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2021509795: {
                    v10 = hc.eypx("facj", eypu(int ), (int)113);
                    continue block50;
                }
                case -92854843: {
                    v10 = hc.eypx("fack", eypu(int ), (int)114);
                    continue block50;
                }
                case 145650920: {
                    v10 = hc.eypx("facl", eypu(int ), (int)115);
                    continue block50;
                }
                case 1982262588: {
                    break block50;
                }
            }
            break;
        }
        if (!this.swapped) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl21
        v11 /* !! */  = hc.ln;
        if (true) ** GOTO lbl81
        block51: while (true) {
            v11 /* !! */  = (long)(v12 - hc.eypx("facn", eypu(int ), (int)116));
lbl81:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -652412511: {
                    v12 = hc.eypx("facq", eypu(int ), (int)117);
                    continue block51;
                }
                case 146580784: {
                    v12 = hc.eypx("facr", eypu(int ), (int)118);
                    continue block51;
                }
                case 1953052839: {
                    v12 = hc.eypx("fact", eypu(int ), (int)119);
                    continue block51;
                }
                case 1982262588: {
                    break block51;
                }
            }
            break;
        }
        this.restoreSlot();
        if (var2_4 || var2_4) ** GOTO lbl21
        v13 = hc.eypx("facu", eyqb(int ), (int)358);
        v14 /* !! */  = hc.ln;
        if (true) ** GOTO lbl100
        block52: while (true) {
            v14 /* !! */  = (long)(v15 - hc.eypx("facv", eypu(int ), (int)120));
lbl100:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1051628272: {
                    v15 = hc.eypx("facy", eypu(int ), (int)121);
                    continue block52;
                }
                case 855491918: {
                    v15 = hc.eypx("facz", eypu(int ), (int)122);
                    continue block52;
                }
                case 1982262588: {
                    break block52;
                }
            }
            break;
        }
        this.swapped = v13;
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                v16 = hc.eypx("fada", eyqb(int ), (int)359);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = hc.ln - hc.eypx("fadb", eypu(int ), (int)123)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hc.eypx("fadc", eyqb(int ), (int)360)) break;
                    v17 /* !! */  = (long)hc.eypx("fadd", eyqb(int ), (int)361);
                }
                this.setState((boolean)v16);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl125:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hc.eypx("fadg", eyqb(int ), (int)362);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl130:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)hc.eypx("fadh", eyqb(int ), (int)363);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 2: {
                var3_3 /* !! */  = (int)hc.eypx("fadk", eyqb(int ), (int)364);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
lbl139:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hc.eypx("fadl", eyqb(int ), (int)365);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
lbl143:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hc.eypx("fadn", eyqb(int ), (int)366);
                if (!var4_2) ** GOTO lbl125
                throw null;
            }
            case 5: {
                do {
                    var3_3 /* !! */  = (int)hc.eypx("fado", eyqb(int ), (int)367);
                } while (!var4_2);
                throw null;
            }
lbl152:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hc.eypx("fadp", eyqb(int ), (int)368);
                if (!var4_2) ** GOTO lbl130
                throw null;
            }
lbl156:
            // 2 sources

            case 7: {
                do {
                    var3_3 /* !! */  = (int)hc.eypx("fads", eyqb(int ), (int)369);
                } while (!var4_2);
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hc.eypx("fadt", eyqb(int ), (int)370);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                    break;
                }
            }
            case 9: {
                var3_3 /* !! */  = (int)hc.eypx("fadu", eyqb(int ), (int)371);
                if (!var4_2) ** GOTO lbl156
                throw null;
            }
lbl171:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)hc.eypx("fadv", eyqb(int ), (int)372);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 11: {
                var3_3 /* !! */  = (int)hc.eypx("fadw", eyqb(int ), (int)373);
                if (var4_2) {
                    throw null;
                }
            }
lbl180:
            // 5 sources

            case 12: {
                var3_3 /* !! */  = (int)hc.eypx("fadx", eyqb(int ), (int)374);
                if (!var4_2) ** GOTO lbl152
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hc.eypx("fady", eyqb(int ), (int)375);
                if (!var4_2) ** GOTO lbl139
                throw null;
            }
lbl188:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)hc.eypx("faeb", eyqb(int ), (int)376);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hc.eypx("faed", eyqb(int ), (int)377);
                if (var4_2) {
                    throw null;
                }
            }
            case 16: {
                var3_3 /* !! */  = (int)hc.eypx("faee", eyqb(int ), (int)378);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
            case 17: 
        }
        var3_3 /* !! */  = (int)hc.eypx("faef", eyqb(int ), (int)379);
        ** while (!var4_2)
lbl203:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fawu() {
        hc.eyqe[200] = 1436579416;
        hc.eyqe[201] = 1964311611;
        hc.eyqe[202] = -869683701;
        hc.eyqe[203] = -1521855808;
        hc.eyqe[204] = 2007513872;
        hc.eyqe[205] = 440342492;
        hc.eyqe[206] = -1511468619;
        hc.eyqe[207] = -700497132;
        hc.eyqe[208] = -215613813;
        hc.eyqe[209] = 1491080283;
        hc.eyqe[210] = -422580320;
        hc.eyqe[211] = -1858839475;
        hc.eyqe[212] = -132741566;
        hc.eyqe[213] = 1070170470;
        hc.eyqe[214] = -1671942229;
        hc.eyqe[215] = -2037478299;
        hc.eyqe[216] = -1081381571;
        hc.eyqe[217] = 1776302960;
        hc.eyqe[218] = 1236666675;
        hc.eyqe[219] = 384318140;
        hc.eyqe[220] = 1226621692;
        hc.eyqe[221] = -294784316;
        hc.eyqe[222] = -249014635;
        hc.eyqe[223] = -889901232;
        hc.eyqe[224] = 1687893147;
        hc.eyqe[225] = -1205663780;
        hc.eyqe[226] = -1054434063;
        hc.eyqe[227] = -983484118;
        hc.eyqe[228] = 1113138224;
        hc.eyqe[229] = -412526349;
        hc.eyqe[230] = 851807281;
        hc.eyqe[231] = 2051950619;
        hc.eyqe[232] = -1461497225;
        hc.eyqe[233] = 899536089;
        hc.eyqe[234] = 915733321;
        hc.eyqe[235] = -1053954648;
        hc.eyqe[236] = 1902640817;
        hc.eyqe[237] = -1311774971;
        hc.eyqe[238] = -2018843457;
        hc.eyqe[239] = 1358788930;
        hc.eyqe[240] = -2037014328;
        hc.eyqe[241] = 839061744;
        hc.eyqe[242] = 96675694;
        hc.eyqe[243] = 1403724730;
        hc.eyqe[244] = 849912246;
        hc.eyqe[245] = -1763687264;
        hc.eyqe[246] = -1215033466;
        hc.eyqe[247] = 517864947;
        hc.eyqe[248] = -1829652952;
        hc.eyqe[249] = 2022298754;
        hc.eyqe[250] = -1175196714;
        hc.eyqe[251] = 1572968152;
        hc.eyqe[252] = -275464354;
        hc.eyqe[253] = 186518653;
        hc.eyqe[254] = 1466708813;
        hc.eyqe[255] = 1544653968;
        hc.eyqe[256] = 131749460;
        hc.eyqe[257] = 1570883651;
        hc.eyqe[258] = 43712189;
        hc.eyqe[259] = 1840282864;
        hc.eyqe[260] = 208430374;
        hc.eyqe[261] = 2009963241;
        hc.eyqe[262] = 747363042;
        hc.eyqe[263] = 316213553;
        hc.eyqe[264] = -1820822864;
        hc.eyqe[265] = 265116601;
        hc.eyqe[266] = 1799173795;
        hc.eyqe[267] = -558964510;
        hc.eyqe[268] = -986151820;
        hc.eyqe[269] = 1907043399;
        hc.eyqe[270] = 471331223;
        hc.eyqe[271] = -404682721;
        hc.eyqe[272] = -334644544;
        hc.eyqe[273] = -333689919;
        hc.eyqe[274] = 1718800074;
        hc.eyqe[275] = -1200763645;
        hc.eyqe[276] = 2019953424;
        hc.eyqe[277] = 1794591627;
        hc.eyqe[278] = 60018624;
        hc.eyqe[279] = 229384282;
        hc.eyqe[280] = 140033200;
        hc.eyqe[281] = 1811970315;
        hc.eyqe[282] = -2009220167;
        hc.eyqe[283] = -70957669;
        hc.eyqe[284] = -1552184411;
        hc.eyqe[285] = -667774784;
        hc.eyqe[286] = -1476896970;
        hc.eyqe[287] = 453316116;
        hc.eyqe[288] = 1248910625;
        hc.eyqe[289] = -270011196;
        hc.eyqe[290] = 660181902;
        hc.eyqe[291] = -629285407;
        hc.eyqe[292] = 1392102916;
        hc.eyqe[293] = 436953529;
        hc.eyqe[294] = -1131900407;
        hc.eyqe[295] = 684706954;
        hc.eyqe[296] = 1811623455;
        hc.eyqe[297] = -977028425;
        hc.eyqe[298] = 1836428060;
        hc.eyqe[299] = 1312102473;
    }

    private static /* synthetic */ int eyqb(int n2) {
        return eyqd[n2] ^ eyqe[n2];
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onTick(df var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CASE]], but top level block is 9[SWITCH]
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

    private static /* synthetic */ void faxi() {
        hc.eypw[0] = -7230043516032820451L;
        hc.eypw[1] = 7672611014382397180L;
        hc.eypw[2] = -6296515369725295328L;
        hc.eypw[3] = 35224894087930637L;
        hc.eypw[4] = 3042280279617121274L;
        hc.eypw[5] = -611691921549989571L;
        hc.eypw[6] = 2824798856685630075L;
        hc.eypw[7] = 376134139435395289L;
        hc.eypw[8] = 8755753984090390096L;
        hc.eypw[9] = 2464357858481910564L;
        hc.eypw[10] = 6612829152740342905L;
        hc.eypw[11] = 6677236551328868206L;
        hc.eypw[12] = -5496107426694427337L;
        hc.eypw[13] = 8015940893969934451L;
        hc.eypw[14] = 8005956887135193747L;
        hc.eypw[15] = -356727763954875371L;
        hc.eypw[16] = -2639546996932648522L;
        hc.eypw[17] = -8302869858954267367L;
        hc.eypw[18] = -8632834843937889338L;
        hc.eypw[19] = 7521752927213258262L;
        hc.eypw[20] = -437639209121542089L;
        hc.eypw[21] = 1239784483188448960L;
        hc.eypw[22] = -5033504714411305704L;
        hc.eypw[23] = 3727037980558089431L;
        hc.eypw[24] = 7320849921891105529L;
        hc.eypw[25] = -717284664687494667L;
        hc.eypw[26] = 1176157716598064934L;
        hc.eypw[27] = -2695356690622231457L;
        hc.eypw[28] = 1532899182300832193L;
        hc.eypw[29] = 2253107199454850995L;
        hc.eypw[30] = -84273029079627900L;
        hc.eypw[31] = 2233931194436729904L;
        hc.eypw[32] = 3472253216300654326L;
        hc.eypw[33] = -7887527100720519932L;
        hc.eypw[34] = -7081152997208378593L;
        hc.eypw[35] = -6053271603596822371L;
        hc.eypw[36] = -3638053943031778450L;
        hc.eypw[37] = 8257659989612602313L;
        hc.eypw[38] = -5639478918280273756L;
        hc.eypw[39] = 1940883341591663193L;
        hc.eypw[40] = 1397230301673475100L;
        hc.eypw[41] = -5950699067578822644L;
        hc.eypw[42] = -8523282530379380182L;
        hc.eypw[43] = -7654048852746165424L;
        hc.eypw[44] = 530395775979809338L;
        hc.eypw[45] = 2507212211337355405L;
        hc.eypw[46] = 8067257476953221660L;
        hc.eypw[47] = -1770070421377578980L;
        hc.eypw[48] = 7733103581664320332L;
        hc.eypw[49] = 6772710522585166736L;
        hc.eypw[50] = -274623808064802838L;
        hc.eypw[51] = -4094733251347280231L;
        hc.eypw[52] = 6928242371131216743L;
        hc.eypw[53] = 2642335643230973828L;
        hc.eypw[54] = -9159723683577420492L;
        hc.eypw[55] = -4387012869846206396L;
        hc.eypw[56] = 4597734732332686871L;
        hc.eypw[57] = 3045806508890314119L;
        hc.eypw[58] = -8815598344301210667L;
        hc.eypw[59] = 678110036766861623L;
        hc.eypw[60] = 6841695693638145745L;
        hc.eypw[61] = -7546660966595733232L;
        hc.eypw[62] = 7885221157821428338L;
        hc.eypw[63] = 4179879368864051884L;
        hc.eypw[64] = -8463831209073657993L;
        hc.eypw[65] = -6085488894627892731L;
        hc.eypw[66] = 4353883585211967816L;
        hc.eypw[67] = -4843583793795058378L;
        hc.eypw[68] = 2625289707188249516L;
        hc.eypw[69] = -164792785520773298L;
        hc.eypw[70] = -4119112731401942289L;
        hc.eypw[71] = -7150295077368240977L;
        hc.eypw[72] = 4181429306389165194L;
        hc.eypw[73] = -2622237049709775924L;
        hc.eypw[74] = 4143489300288554006L;
        hc.eypw[75] = -1971828482876886953L;
        hc.eypw[76] = -6875203628829123041L;
        hc.eypw[77] = 6658902311406288308L;
        hc.eypw[78] = 9043491636286302856L;
        hc.eypw[79] = 9133384078508461830L;
        hc.eypw[80] = 8968096194449664553L;
        hc.eypw[81] = -6369918283725937698L;
        hc.eypw[82] = -1773732545865589573L;
        hc.eypw[83] = 5503458554917084511L;
        hc.eypw[84] = 584401183326959493L;
        hc.eypw[85] = -7381186162073326213L;
        hc.eypw[86] = -5309065344345475598L;
        hc.eypw[87] = -1815751662122327980L;
        hc.eypw[88] = -1352400852952311405L;
        hc.eypw[89] = 1414852205700475266L;
        hc.eypw[90] = 4637029102654387688L;
        hc.eypw[91] = 3919228999309390405L;
        hc.eypw[92] = -3361033757416524902L;
        hc.eypw[93] = -5820157132605811355L;
        hc.eypw[94] = -4737241137629054362L;
        hc.eypw[95] = 2523235567364619876L;
        hc.eypw[96] = -7312185748722323594L;
        hc.eypw[97] = 9013133628389450057L;
        hc.eypw[98] = -6965679986538845564L;
        hc.eypw[99] = 7416221216873139628L;
    }
}

