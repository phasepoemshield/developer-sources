/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import net.minecraft.class_408;
import ruhack.phobia.ar;
import ruhack.phobia.at;
import ruhack.phobia.dz;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.ks;
import ruhack.phobia.kv;
import ruhack.phobia.nd;

public final class dv
extends ar {
    public static final int b;
    private static final float PANEL_PADDING_X = 2.7916393f;
    private static final float SLOT_BORDER = 0.66705877f;
    private static final float INNER_SHADOW_THICKNESS = 0.76711756f;
    private static final float BAR_WIDTH = 8.898563f;
    private static final float PANEL_BORDER = 0.66705877f;
    private static final float BAR_HEIGHT = 1.2874234f;
    private static final int SLOT_BORDER_COLOR;
    private static final float INNER_SHADOW_BLUR = 10.806353f;
    private static final float PANEL_PADDING_Y = 2.7149293f;
    private static final float PANEL_HEIGHT = 24.481056f;
    private static final float PANEL_RADIUS = 7.3376465f;
    private static final float DURABILITY_SPEED = 10.0f;
    private static long[] crlb;
    private static final float BAR_RADIUS = 0.6437117f;
    private static final float SLOT_SIZE = 19.057869f;
    private static final float BAR_BOTTOM = 2.668235f;
    private static final int BORDER_COLOR;
    private static final float ITEM_SIZE = 9.985869f;
    private static final int BLACK_FILL;
    private static int[] crku;
    private static final int WARNING_COLOR;
    public static final boolean a;
    private final Map<class_1304, Float> animatedDurability;
    private static final float SLOT_RADIUS = 5.33647f;
    private static final float PANEL_WIDTH = 88.93894f;
    private static final int DANGER_COLOR;
    private static final float ITEM_TOP = 2.7682939f;
    private final class_1799[] armorBuffer;
    private static final class_1304[] SLOTS;
    public static final long ge = -236315840186515554L;
    private static final int EMPTY_COLOR;
    public static final boolean c;
    private static final String EMPTY_ICON = "a";
    private static final float SLOT_GAP = 2.3747292f;
    private static final float EMPTY_ICON_SIZE = 9.005293f;
    private static boolean queuedItemModels;
    private class_1799[] demoArmor;
    private static final float DESIGN_SCALE = 1.4991183f;
    private long lastFrame;
    private static long[] crla;
    private static int[] crkv;

    private static /* synthetic */ void csli() {
        dv.crkv[400] = -849039545;
        dv.crkv[401] = 1536837190;
        dv.crkv[402] = -1609849405;
        dv.crkv[403] = 833972348;
        dv.crkv[404] = 67126640;
        dv.crkv[405] = 1985864028;
        dv.crkv[406] = 38526889;
        dv.crkv[407] = 805453493;
        dv.crkv[408] = -2024678035;
        dv.crkv[409] = -1515300731;
        dv.crkv[410] = 1689381505;
        dv.crkv[411] = 1506199568;
        dv.crkv[412] = -325906665;
        dv.crkv[413] = 487693959;
        dv.crkv[414] = 1258243939;
        dv.crkv[415] = -413582713;
        dv.crkv[416] = 544400224;
        dv.crkv[417] = -1510158890;
        dv.crkv[418] = -421858342;
        dv.crkv[419] = 240724709;
        dv.crkv[420] = 1549631629;
        dv.crkv[421] = 673465564;
        dv.crkv[422] = -956035308;
        dv.crkv[423] = -1651062180;
        dv.crkv[424] = 253784026;
        dv.crkv[425] = 652097159;
        dv.crkv[426] = -1537565775;
        dv.crkv[427] = -1744937398;
        dv.crkv[428] = 24082875;
        dv.crkv[429] = -282214815;
        dv.crkv[430] = 90093919;
        dv.crkv[431] = 1531299673;
        dv.crkv[432] = -2065973550;
        dv.crkv[433] = -546029387;
        dv.crkv[434] = 439082494;
        dv.crkv[435] = -391007787;
        dv.crkv[436] = -541819883;
        dv.crkv[437] = 1492413125;
        dv.crkv[438] = -1732754745;
        dv.crkv[439] = 713583118;
        dv.crkv[440] = -1356904885;
        dv.crkv[441] = 789109716;
        dv.crkv[442] = -956753163;
        dv.crkv[443] = -220050104;
        dv.crkv[444] = -1680921204;
        dv.crkv[445] = -34042209;
        dv.crkv[446] = 1158455798;
        dv.crkv[447] = -815465651;
        dv.crkv[448] = -1612594048;
        dv.crkv[449] = 1800319176;
        dv.crkv[450] = 1767030658;
        dv.crkv[451] = -1114446701;
        dv.crkv[452] = -782562208;
        dv.crkv[453] = 1354009382;
        dv.crkv[454] = -472670704;
        dv.crkv[455] = -1410790082;
        dv.crkv[456] = -1827712800;
        dv.crkv[457] = -151016206;
        dv.crkv[458] = 1439615196;
        dv.crkv[459] = 255385147;
        dv.crkv[460] = -633176753;
        dv.crkv[461] = 208331478;
        dv.crkv[462] = 947939105;
        dv.crkv[463] = -1344766043;
        dv.crkv[464] = 161771823;
        dv.crkv[465] = -428658184;
        dv.crkv[466] = 1366144204;
        dv.crkv[467] = 1083438442;
        dv.crkv[468] = 1961200135;
        dv.crkv[469] = -480575690;
        dv.crkv[470] = 926143089;
        dv.crkv[471] = 109109806;
        dv.crkv[472] = 2032760438;
        dv.crkv[473] = -350099789;
        dv.crkv[474] = 207560834;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawPanel(class_332 var0, float var1_1, float var2_2, float var3_3) {
        v0 /* !! */  = dv.ge;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - dv.crkw("csgv", crro(int ), (int)169));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -756908130: {
                    break block17;
                }
                case -694819791: {
                    v1 = dv.crkw("csgw", crro(int ), (int)170);
                    continue block17;
                }
                case 1229292427: {
                    v1 = dv.crkw("csgx", crro(int ), (int)171);
                    continue block17;
                }
            }
            break;
        }
        var6_4 = dv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("csgy", crro(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dv.crkw("csgz", crkt(int ), (int)396)) break;
            v2 /* !! */  = (long)dv.crkw("csha", crkt(int ), (int)397);
        }
        var5_5 /* !! */  = dv.b;
        v3 /* !! */  = dv.ge;
        if (true) ** GOTO lbl25
        block19: while (true) {
            v3 /* !! */  = (long)(dv.crkw("cshc", crro(int ), (int)174) - dv.crkw("cshb", crro(int ), (int)173));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -756908130: {
                    break block19;
                }
                case 1624429792: {
                    continue block19;
                }
            }
            break;
        }
        var4_6 = dv.a;
        if (var6_4) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var4_6 || var4_6) ** GOTO lbl33
        v4 = dv.crkw("cshd", crlm(int ), (int)398);
        v5 = dv.crkw("cshe", crlm(int ), (int)399);
        v6 = dv.crkw("cshf", crlm(int ), (int)400);
        v7 = dv.crkw("cshg", crlm(int ), (int)401);
        v8 = dv.crkw("cshh", crlm(int ), (int)402);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("cshi", crro(int ), (int)175)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == dv.crkw("cshj", crkt(int ), (int)403)) break;
            v9 /* !! */  = (long)dv.crkw("cshk", crkt(int ), (int)404);
        }
        at.panelWithInnerShadow(var0, var1_1, var2_2, (float)v4, (float)v5, (float)v6, var3_3, (float)v7, (float)v8);
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6 || var4_6) ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)dv.crkw("cshl", crkt(int ), (int)405);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                do {
                    var5_5 /* !! */  = (int)dv.crkw("cshm", crkt(int ), (int)406);
                } while (!var6_4);
                throw null;
            }
lbl62:
            // 2 sources

            case 2: {
                do {
                    var5_5 /* !! */  = (int)dv.crkw("cshn", crkt(int ), (int)407);
                } while (!var6_4);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)dv.crkw("csho", crkt(int ), (int)408);
                    if (!var6_4) break block9;
                    throw null;
                }
            }
            case 4: {
                var5_5 /* !! */  = (int)dv.crkw("cshp", crkt(int ), (int)409);
                if (!var6_4) ** GOTO lbl52
                throw null;
            }
            case 5: 
        }
        var5_5 /* !! */  = (int)dv.crkw("cshq", crkt(int ), (int)410);
        ** while (!var6_4)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cslf() {
        dv.crkv[100] = 2129345394;
        dv.crkv[101] = -1609898067;
        dv.crkv[102] = 51738014;
        dv.crkv[103] = 1403397241;
        dv.crkv[104] = 680703799;
        dv.crkv[105] = -334010794;
        dv.crkv[106] = -45331891;
        dv.crkv[107] = 1261525857;
        dv.crkv[108] = -536349415;
        dv.crkv[109] = 1299351318;
        dv.crkv[110] = 1138974314;
        dv.crkv[111] = 314773411;
        dv.crkv[112] = -1725385292;
        dv.crkv[113] = -609262820;
        dv.crkv[114] = -1018939256;
        dv.crkv[115] = 866508459;
        dv.crkv[116] = -1011189646;
        dv.crkv[117] = 1139036716;
        dv.crkv[118] = -154022000;
        dv.crkv[119] = 813892825;
        dv.crkv[120] = -630386843;
        dv.crkv[121] = 486822890;
        dv.crkv[122] = 708670641;
        dv.crkv[123] = -441765278;
        dv.crkv[124] = -883811241;
        dv.crkv[125] = 1670334808;
        dv.crkv[126] = -185866091;
        dv.crkv[127] = -2011346312;
        dv.crkv[128] = 178703134;
        dv.crkv[129] = 1414382237;
        dv.crkv[130] = -1082519596;
        dv.crkv[131] = -1407749975;
        dv.crkv[132] = -1060217549;
        dv.crkv[133] = 500524296;
        dv.crkv[134] = -797705555;
        dv.crkv[135] = 1373702276;
        dv.crkv[136] = -1691264379;
        dv.crkv[137] = 819932499;
        dv.crkv[138] = 256390131;
        dv.crkv[139] = -515732607;
        dv.crkv[140] = 1855880075;
        dv.crkv[141] = -1740041685;
        dv.crkv[142] = 1051495236;
        dv.crkv[143] = 336222498;
        dv.crkv[144] = 2114429080;
        dv.crkv[145] = -1221539089;
        dv.crkv[146] = 826855041;
        dv.crkv[147] = 1414260053;
        dv.crkv[148] = -616142222;
        dv.crkv[149] = 506314424;
        dv.crkv[150] = 1875846777;
        dv.crkv[151] = -436672228;
        dv.crkv[152] = -835106780;
        dv.crkv[153] = 613179289;
        dv.crkv[154] = -437187865;
        dv.crkv[155] = 457865583;
        dv.crkv[156] = 1648561682;
        dv.crkv[157] = 1741518375;
        dv.crkv[158] = -1625620066;
        dv.crkv[159] = -1167447968;
        dv.crkv[160] = 1749314126;
        dv.crkv[161] = -691003077;
        dv.crkv[162] = 64003330;
        dv.crkv[163] = -282487680;
        dv.crkv[164] = 885508650;
        dv.crkv[165] = -1007943464;
        dv.crkv[166] = 894981951;
        dv.crkv[167] = 1576424056;
        dv.crkv[168] = -32017862;
        dv.crkv[169] = 792195921;
        dv.crkv[170] = 1428637912;
        dv.crkv[171] = 459906279;
        dv.crkv[172] = 917982376;
        dv.crkv[173] = -2123881461;
        dv.crkv[174] = -1880677865;
        dv.crkv[175] = 1787214284;
        dv.crkv[176] = -773263284;
        dv.crkv[177] = 309729535;
        dv.crkv[178] = 1152265280;
        dv.crkv[179] = -1194176200;
        dv.crkv[180] = -1468407032;
        dv.crkv[181] = -437167767;
        dv.crkv[182] = -305271231;
        dv.crkv[183] = 41289619;
        dv.crkv[184] = 1952370934;
        dv.crkv[185] = -223481363;
        dv.crkv[186] = 1740587058;
        dv.crkv[187] = -736097800;
        dv.crkv[188] = -1136644080;
        dv.crkv[189] = -479800809;
        dv.crkv[190] = 288940590;
        dv.crkv[191] = 417357673;
        dv.crkv[192] = -1709763330;
        dv.crkv[193] = 676234950;
        dv.crkv[194] = 1891584299;
        dv.crkv[195] = -858355235;
        dv.crkv[196] = 931441365;
        dv.crkv[197] = -900525678;
        dv.crkv[198] = -911161008;
        dv.crkv[199] = -382223695;
    }

    private static /* synthetic */ void cslb() {
        dv.crku[200] = -2044239542;
        dv.crku[201] = 977326051;
        dv.crku[202] = -1155096919;
        dv.crku[203] = -804926979;
        dv.crku[204] = 20773536;
        dv.crku[205] = 1185871822;
        dv.crku[206] = -331243023;
        dv.crku[207] = 1996771909;
        dv.crku[208] = 1484250750;
        dv.crku[209] = 600168339;
        dv.crku[210] = -934700470;
        dv.crku[211] = -225326923;
        dv.crku[212] = 1586748655;
        dv.crku[213] = 1471051002;
        dv.crku[214] = 38860470;
        dv.crku[215] = 509903854;
        dv.crku[216] = 1816828851;
        dv.crku[217] = 165681885;
        dv.crku[218] = -443428663;
        dv.crku[219] = 1216971110;
        dv.crku[220] = -1574761096;
        dv.crku[221] = 435018551;
        dv.crku[222] = -1120095514;
        dv.crku[223] = 404808238;
        dv.crku[224] = -1125729294;
        dv.crku[225] = -1169016453;
        dv.crku[226] = -1367126197;
        dv.crku[227] = 1191978552;
        dv.crku[228] = 2080132549;
        dv.crku[229] = -216982899;
        dv.crku[230] = 57340144;
        dv.crku[231] = 2088060848;
        dv.crku[232] = 1284281459;
        dv.crku[233] = 771218994;
        dv.crku[234] = -1174908413;
        dv.crku[235] = -1394006545;
        dv.crku[236] = -495787640;
        dv.crku[237] = -1220653131;
        dv.crku[238] = 427190320;
        dv.crku[239] = 163104208;
        dv.crku[240] = -1766710489;
        dv.crku[241] = -653120586;
        dv.crku[242] = -981262489;
        dv.crku[243] = 1037879372;
        dv.crku[244] = 1281965962;
        dv.crku[245] = -92014365;
        dv.crku[246] = -558854924;
        dv.crku[247] = 1101712501;
        dv.crku[248] = -791510980;
        dv.crku[249] = 1050594454;
        dv.crku[250] = -1820471927;
        dv.crku[251] = 1712531798;
        dv.crku[252] = 1706468568;
        dv.crku[253] = -1599229459;
        dv.crku[254] = -323413273;
        dv.crku[255] = 62047088;
        dv.crku[256] = -321324574;
        dv.crku[257] = 115524995;
        dv.crku[258] = -1770517776;
        dv.crku[259] = 1208855535;
        dv.crku[260] = 2098001305;
        dv.crku[261] = -628666134;
        dv.crku[262] = 1077880993;
        dv.crku[263] = 1644662002;
        dv.crku[264] = 2016964134;
        dv.crku[265] = -802131795;
        dv.crku[266] = 1239474757;
        dv.crku[267] = 465653449;
        dv.crku[268] = -429158531;
        dv.crku[269] = -1867149475;
        dv.crku[270] = 1481301104;
        dv.crku[271] = -294815473;
        dv.crku[272] = -493612175;
        dv.crku[273] = -1457747459;
        dv.crku[274] = 428686193;
        dv.crku[275] = -2096191060;
        dv.crku[276] = -2015538877;
        dv.crku[277] = 1417727817;
        dv.crku[278] = 913698988;
        dv.crku[279] = -1111557646;
        dv.crku[280] = 1455963989;
        dv.crku[281] = 2048054475;
        dv.crku[282] = 1541149627;
        dv.crku[283] = 1521691522;
        dv.crku[284] = -171295385;
        dv.crku[285] = 1594596741;
        dv.crku[286] = -1752453061;
        dv.crku[287] = 989503629;
        dv.crku[288] = 2101873835;
        dv.crku[289] = -1080515513;
        dv.crku[290] = 1047561663;
        dv.crku[291] = 1105965682;
        dv.crku[292] = -548910947;
        dv.crku[293] = -1223569697;
        dv.crku[294] = -1366516687;
        dv.crku[295] = 547014448;
        dv.crku[296] = 1073593743;
        dv.crku[297] = 310011829;
        dv.crku[298] = 1226801392;
        dv.crku[299] = -1645635862;
    }

    private static /* synthetic */ void cslm() {
        dv.crlb[100] = -5546323766330257549L;
        dv.crlb[101] = -4160384859461559295L;
        dv.crlb[102] = -8793344681510631669L;
        dv.crlb[103] = 6457719628330993004L;
        dv.crlb[104] = -507824014782956010L;
        dv.crlb[105] = 7917960987514803460L;
        dv.crlb[106] = -4540932432488448576L;
        dv.crlb[107] = 1576742866780330523L;
        dv.crlb[108] = -5118744308649797850L;
        dv.crlb[109] = 4369020859836980797L;
        dv.crlb[110] = 2593596912701639173L;
        dv.crlb[111] = -8304158703487642670L;
        dv.crlb[112] = 6116057847600132760L;
        dv.crlb[113] = -9153929968437078108L;
        dv.crlb[114] = 3626334183115083808L;
        dv.crlb[115] = 4958694888733817600L;
        dv.crlb[116] = 1150076845104565891L;
        dv.crlb[117] = -5250784599187899208L;
        dv.crlb[118] = -6194939976667542751L;
        dv.crlb[119] = 2188339497744955943L;
        dv.crlb[120] = -8459073279829138424L;
        dv.crlb[121] = 8297779868859712253L;
        dv.crlb[122] = 5546846133496576434L;
        dv.crlb[123] = 2960073863756723972L;
        dv.crlb[124] = 2267989992452585483L;
        dv.crlb[125] = -254541343525730556L;
        dv.crlb[126] = -8813954502798971000L;
        dv.crlb[127] = -687183253116859300L;
        dv.crlb[128] = -7333183319064145722L;
        dv.crlb[129] = 5907817043143698055L;
        dv.crlb[130] = -1237802330645781730L;
        dv.crlb[131] = 6152695075304742416L;
        dv.crlb[132] = -5847972457487225692L;
        dv.crlb[133] = -7730709781460821347L;
        dv.crlb[134] = 550703467601257183L;
        dv.crlb[135] = 8229406895729524352L;
        dv.crlb[136] = 2160446338518786224L;
        dv.crlb[137] = -6745544606723813726L;
        dv.crlb[138] = -6996458338102665298L;
        dv.crlb[139] = -9191192993620608260L;
        dv.crlb[140] = 567454633867851366L;
        dv.crlb[141] = -4463459504378250127L;
        dv.crlb[142] = 3183648519114675587L;
        dv.crlb[143] = 3526563349482857328L;
        dv.crlb[144] = -7543426177705379908L;
        dv.crlb[145] = -1312216122534848557L;
        dv.crlb[146] = 4738650291275830295L;
        dv.crlb[147] = -3575161330253373391L;
        dv.crlb[148] = 9123362901437172138L;
        dv.crlb[149] = -1116287177696121261L;
        dv.crlb[150] = -2614948166478113267L;
        dv.crlb[151] = 1092174790479634245L;
        dv.crlb[152] = 3291366292061418998L;
        dv.crlb[153] = -4392423987050282361L;
        dv.crlb[154] = 780408723246597119L;
        dv.crlb[155] = -3951888892797096670L;
        dv.crlb[156] = -6193630364130295115L;
        dv.crlb[157] = 5545340169652618893L;
        dv.crlb[158] = 8563003021078172696L;
        dv.crlb[159] = -282727658200090929L;
        dv.crlb[160] = 5782660033156406290L;
        dv.crlb[161] = 483989928526704609L;
        dv.crlb[162] = -6504543203871672749L;
        dv.crlb[163] = -2415085501755156766L;
        dv.crlb[164] = 5619037817729291835L;
        dv.crlb[165] = -5065823207402945277L;
        dv.crlb[166] = -5155533403871306292L;
        dv.crlb[167] = -5152490872371610587L;
        dv.crlb[168] = 5865780287370228805L;
        dv.crlb[169] = 6151422463903611813L;
        dv.crlb[170] = 6608297868900428728L;
        dv.crlb[171] = 6014406583504092642L;
        dv.crlb[172] = -7948919693431972990L;
        dv.crlb[173] = -5870156726378495790L;
        dv.crlb[174] = 6570882854354046285L;
        dv.crlb[175] = -5783965085453989025L;
        dv.crlb[176] = -7884089328971358674L;
        dv.crlb[177] = -3328521889827974323L;
        dv.crlb[178] = 526460919924730010L;
        dv.crlb[179] = 5838127832301486422L;
        dv.crlb[180] = -7439906235693077386L;
        dv.crlb[181] = -2145552327001089199L;
        dv.crlb[182] = -7823448401793842992L;
        dv.crlb[183] = 3437560564586748227L;
        dv.crlb[184] = -1672202402239537073L;
        dv.crlb[185] = 7081479040182706583L;
        dv.crlb[186] = 2306019762180431050L;
        dv.crlb[187] = -5864091783905072551L;
        dv.crlb[188] = -252196323995297976L;
        dv.crlb[189] = -5134522501997092002L;
        dv.crlb[190] = 4054319733639052683L;
        dv.crlb[191] = -5004978522666574025L;
        dv.crlb[192] = 5027403354130390245L;
        dv.crlb[193] = -4678657420739941946L;
        dv.crlb[194] = 5886322057396557635L;
        dv.crlb[195] = 6388036110279686014L;
        dv.crlb[196] = 4604648083514304538L;
        dv.crlb[197] = -478296195636576067L;
    }

    private static /* synthetic */ void cslj() {
        dv.crla[0] = -5051628685668424702L;
        dv.crla[1] = 62547098580922713L;
        dv.crla[2] = -3755989274112617831L;
        dv.crla[3] = 5725326246896600334L;
        dv.crla[4] = -8457307475344222398L;
        dv.crla[5] = -3346073800728219033L;
        dv.crla[6] = 5595466490939557609L;
        dv.crla[7] = -5848853274372942416L;
        dv.crla[8] = 3664780416135481954L;
        dv.crla[9] = 607476014646075777L;
        dv.crla[10] = 9121842510309320961L;
        dv.crla[11] = 1732894023042254463L;
        dv.crla[12] = 8300670459268338716L;
        dv.crla[13] = -3755698024212570542L;
        dv.crla[14] = 914878527445766237L;
        dv.crla[15] = 122417865964093875L;
        dv.crla[16] = 3608330113213312172L;
        dv.crla[17] = -5809289104775009287L;
        dv.crla[18] = 3692387028859566514L;
        dv.crla[19] = 7825392610526289728L;
        dv.crla[20] = -4623466646326191918L;
        dv.crla[21] = -8558507253854911921L;
        dv.crla[22] = 2726344604016783911L;
        dv.crla[23] = 2352442387526795618L;
        dv.crla[24] = -9214521852532408418L;
        dv.crla[25] = -4752087957249979104L;
        dv.crla[26] = 2889975845614910448L;
        dv.crla[27] = 4661562185790218420L;
        dv.crla[28] = -8632310002464321836L;
        dv.crla[29] = -925694936298969616L;
        dv.crla[30] = -7087823696845780738L;
        dv.crla[31] = 477193659896233729L;
        dv.crla[32] = 969321166900000371L;
        dv.crla[33] = 1585774723408416438L;
        dv.crla[34] = -8223371827828063567L;
        dv.crla[35] = 5146298700073577907L;
        dv.crla[36] = -7095283419429780560L;
        dv.crla[37] = -47175345155928317L;
        dv.crla[38] = 2339202276791318388L;
        dv.crla[39] = 1906399273766671477L;
        dv.crla[40] = 5647086125453196979L;
        dv.crla[41] = 532245456263845392L;
        dv.crla[42] = -5102310657287135923L;
        dv.crla[43] = -6400561236499478192L;
        dv.crla[44] = 44557746931585515L;
        dv.crla[45] = -7490880703148462326L;
        dv.crla[46] = 9005691117763200268L;
        dv.crla[47] = 844905782213339247L;
        dv.crla[48] = -5122434442246097175L;
        dv.crla[49] = 5401602139912022277L;
        dv.crla[50] = 9009926581061905679L;
        dv.crla[51] = -3592116109686410176L;
        dv.crla[52] = 1767904383706491741L;
        dv.crla[53] = -6505599749523143850L;
        dv.crla[54] = 433283499924581905L;
        dv.crla[55] = 3520288669528291353L;
        dv.crla[56] = -1262237159190438730L;
        dv.crla[57] = -1856527005468120280L;
        dv.crla[58] = 5904417389941770720L;
        dv.crla[59] = -1821683747806306177L;
        dv.crla[60] = -7639317710556152412L;
        dv.crla[61] = 2064253324733726070L;
        dv.crla[62] = 3588218555614047278L;
        dv.crla[63] = -6242478546036813385L;
        dv.crla[64] = -303094864846521291L;
        dv.crla[65] = -6036851346951146879L;
        dv.crla[66] = 2888883742697763762L;
        dv.crla[67] = 5551075601140159961L;
        dv.crla[68] = -1505539612876744001L;
        dv.crla[69] = 9097411550748767494L;
        dv.crla[70] = 6506699914858453144L;
        dv.crla[71] = 2520198522497779283L;
        dv.crla[72] = 7048264743982836974L;
        dv.crla[73] = 4326554923980263317L;
        dv.crla[74] = 4477487425588134917L;
        dv.crla[75] = 3255877174424059215L;
        dv.crla[76] = -413619113164863955L;
        dv.crla[77] = -7687378207797949522L;
        dv.crla[78] = -3396666503860436421L;
        dv.crla[79] = -6517166438326499110L;
        dv.crla[80] = -4379526670506307167L;
        dv.crla[81] = 1257629270926563819L;
        dv.crla[82] = -5294021978246949394L;
        dv.crla[83] = 256141140554273194L;
        dv.crla[84] = -3418778897116231860L;
        dv.crla[85] = 6952941561339528611L;
        dv.crla[86] = -5922410531130162382L;
        dv.crla[87] = 6563267738501110607L;
        dv.crla[88] = 7010605234873923062L;
        dv.crla[89] = 6430117873823561603L;
        dv.crla[90] = -1233457303565303053L;
        dv.crla[91] = 2899154097704781701L;
        dv.crla[92] = -514955155230340444L;
        dv.crla[93] = 7659775714435700170L;
        dv.crla[94] = 7227849155670272868L;
        dv.crla[95] = 5369492021424696385L;
        dv.crla[96] = 6403900246664385078L;
        dv.crla[97] = -4946946269811360030L;
        dv.crla[98] = 1423893388674631489L;
        dv.crla[99] = 2725014520684027159L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawSlot(class_332 var0, float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("cshr", crro(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dv.crkw("cshs", crkt(int ), (int)411)) break;
            v0 /* !! */  = (long)dv.crkw("csht", crkt(int ), (int)412);
        }
        var6_4 = dv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("cshu", crro(int ), (int)177)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dv.crkw("cshv", crkt(int ), (int)413)) break;
            v1 /* !! */  = (long)dv.crkw("cshw", crkt(int ), (int)414);
        }
        var5_5 /* !! */  = dv.b;
        v2 /* !! */  = dv.ge;
        if (true) ** GOTO lbl17
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - dv.crkw("cshx", crro(int ), (int)178));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -987347000: {
                    v3 = dv.crkw("cshy", crro(int ), (int)179);
                    continue block30;
                }
                case -756908130: {
                    break block30;
                }
                case 1397278677: {
                    v3 = dv.crkw("cshz", crro(int ), (int)180);
                    continue block30;
                }
                case 2017712613: {
                    v3 = dv.crkw("csia", crro(int ), (int)181);
                    continue block30;
                }
            }
            break;
        }
        var4_6 = dv.a;
        if (var6_4) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6 || var4_6) ** GOTO lbl32
                v4 = dv.crkw("csib", crlm(int ), (int)415);
                v5 = dv.crkw("csic", crlm(int ), (int)416);
                v6 = dv.crkw("csid", crlm(int ), (int)417);
                v7 = dv.crkw("csie", crkt(int ), (int)418);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("csif", crro(int ), (int)182)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dv.crkw("csig", crkt(int ), (int)419)) break;
                    v8 /* !! */  = (long)dv.crkw("csih", crkt(int ), (int)420);
                }
                v9 = dz.color((int)v7);
                v10 /* !! */  = dv.ge;
                if (true) ** GOTO lbl52
                block33: while (true) {
                    v10 /* !! */  = (long)(v11 - dv.crkw("csii", crro(int ), (int)183));
lbl52:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1913279831: {
                            v11 = dv.crkw("csij", crro(int ), (int)184);
                            continue block33;
                        }
                        case -1222206487: {
                            v11 = dv.crkw("csik", crro(int ), (int)185);
                            continue block33;
                        }
                        case -756908130: {
                            break block33;
                        }
                        case 1346854201: {
                            v11 = dv.crkw("csil", crro(int ), (int)186);
                            continue block33;
                        }
                    }
                    break;
                }
                v12 = nd.multAlpha(v9, var3_3);
                v13 = dv.crkw("csim", crkt(int ), (int)421);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("csin", crro(int ), (int)187)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == dv.crkw("csio", crkt(int ), (int)422)) break;
                    v14 /* !! */  = (long)dv.crkw("csip", crkt(int ), (int)423);
                }
                ki.rect(var0, var1_1, var2_2, (float)v4, (float)v5, (float)v6, v12, (boolean)v13);
                if (var4_6 || var4_6) ** GOTO lbl32
                v15 = dv.crkw("csiq", crlm(int ), (int)424);
                v16 = dv.crkw("csir", crlm(int ), (int)425);
                v17 = dv.crkw("csis", crlm(int ), (int)426);
                v18 = dv.crkw("csit", crlm(int ), (int)427);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = dv.ge - dv.crkw("csiu", crro(int ), (int)188)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == dv.crkw("csiv", crkt(int ), (int)428)) break;
                    v19 /* !! */  = (long)dv.crkw("csiw", crkt(int ), (int)429);
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = dv.ge - dv.crkw("csix", crro(int ), (int)189)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == dv.crkw("csiy", crkt(int ), (int)430)) break;
                    v20 /* !! */  = (long)dv.crkw("csiz", crkt(int ), (int)431);
                }
                v21 = nd.multAlpha(dv.SLOT_BORDER_COLOR, var3_3);
                v22 = dv.crkw("csja", crkt(int ), (int)432);
                v23 /* !! */  = dv.ge;
                if (true) ** GOTO lbl93
                block37: while (true) {
                    v23 /* !! */  = (long)(v24 - dv.crkw("csjb", crro(int ), (int)190));
lbl93:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1566774128: {
                            v24 = dv.crkw("csjc", crro(int ), (int)191);
                            continue block37;
                        }
                        case -923206865: {
                            v24 = dv.crkw("csjd", crro(int ), (int)192);
                            continue block37;
                        }
                        case -756908130: {
                            break block37;
                        }
                        case 798236718: {
                            v24 = dv.crkw("csje", crro(int ), (int)193);
                            continue block37;
                        }
                    }
                    break;
                }
                ki.outline(var0, var1_1, var2_2, (float)v15, (float)v16, (float)v17, (float)v18, v21, (boolean)v22);
                if (var4_6 || var4_6) ** continue;
                return;
            }
lbl108:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)dv.crkw("csjf", crkt(int ), (int)433);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: {
                var5_5 /* !! */  = (int)dv.crkw("csjg", crkt(int ), (int)434);
                if (var6_4) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 2: {
                var5_5 /* !! */  = (int)dv.crkw("csjh", crkt(int ), (int)435);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var5_5 /* !! */  = (int)dv.crkw("csji", crkt(int ), (int)436);
                if (var6_4) {
                    throw null;
                }
            }
lbl126:
            // 4 sources

            case 4: {
                var5_5 /* !! */  = (int)dv.crkw("csjj", crkt(int ), (int)437);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl131:
            // 2 sources

            case 5: {
                var5_5 /* !! */  = (int)dv.crkw("csjk", crkt(int ), (int)438);
                if (!var6_4) ** GOTO lbl117
                throw null;
            }
lbl135:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)dv.crkw("csjl", crkt(int ), (int)439);
                    if (!var6_4) ** GOTO lbl108
                    throw null;
                }
            }
            case 7: 
        }
        var5_5 /* !! */  = (int)dv.crkw("csjm", crkt(int ), (int)440);
        ** while (!var6_4)
lbl143:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1799[] armorStacks() {
        block94: {
            block93: {
                block92: {
                    var5_1 = dv.c;
                    var4_2 /* !! */  = dv.b;
                    var3_3 = dv.a;
                    if (var5_1) {
                        throw null;
lbl6:
                        // 24 sources

                        return null;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var1_4 /* !! */  = dv.crkw("crpr", crkt(int ), (int)116);
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (this.mc.field_1724 == null) break block93;
                    if (var3_3 || var3_3) ** GOTO lbl6
                    var2_5 = dv.crkw("crps", crkt(int ), (int)117);
                    if (var3_3) ** GOTO lbl6
                    do {
                        if (var3_3 || var3_3) ** GOTO lbl6
                        if (var2_5 >= dv.SLOTS.length) break block92;
                        if (var3_3 || var3_3) ** GOTO lbl6
                        this.armorBuffer[var2_5] = this.mc.field_1724.method_6118(dv.SLOTS[var2_5]);
                        if (var3_3 || var3_3) ** GOTO lbl6
                        if (!this.armorBuffer[var2_5].method_7960()) {
                            v0 = dv.crkw("crpt", crkt(int ), (int)118);
                            if (var5_1) {
                                throw null;
                            }
                        } else {
                            v0 = dv.crkw("crpu", crkt(int ), (int)119);
                        }
                        var1_4 /* !! */  = (CallSite)(var1_4 /* !! */  | v0);
                        if (var3_3 || var3_3) ** GOTO lbl6
                        ++var2_5;
                        if (var3_3) ** GOTO lbl6
                    } while (!var5_1);
                    throw null;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                break block94;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            Arrays.fill(this.armorBuffer, class_1799.field_8037);
            if (var3_3) ** GOTO lbl6
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var1_4 /* !! */  != false) ** GOTO lbl52
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                if (!(this.mc.field_1755 instanceof class_408)) ** GOTO lbl52
                if (var3_3 || var3_3) ** GOTO lbl6
                return this.demoArmor();
lbl52:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                var2_5 = dv.crkw("crpv", crkt(int ), (int)120);
                if (var3_3) ** GOTO lbl6
                do {
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (var2_5 >= this.armorBuffer.length) ** GOTO lbl68
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (this.armorBuffer[var2_5] != null) ** GOTO lbl63
                    if (var3_3) ** GOTO lbl6
                    this.armorBuffer[var2_5] = class_1799.field_8037;
                    if (var3_3) ** GOTO lbl6
lbl63:
                    // 2 sources

                    if (var3_3 || var3_3) ** GOTO lbl6
                    ++var2_5;
                    if (var3_3) ** GOTO lbl6
                } while (!var5_1);
                throw null;
lbl68:
                // 1 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return this.armorBuffer;
            }
            case 0: {
                var4_2 /* !! */  = (int)dv.crkw("crpw", crkt(int ), (int)121);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl76:
            // 4 sources

            case 1: {
                var4_2 /* !! */  = (int)dv.crkw("crpx", crkt(int ), (int)122);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var4_2 /* !! */  = (int)dv.crkw("crpy", crkt(int ), (int)123);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl86:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)dv.crkw("crpz", crkt(int ), (int)124);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl91:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)dv.crkw("crqa", crkt(int ), (int)125);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl205
                    break;
                }
            }
lbl97:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)dv.crkw("crqb", crkt(int ), (int)126);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl102:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)dv.crkw("crqc", crkt(int ), (int)127);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl107:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)dv.crkw("crqd", crkt(int ), (int)128);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 8: {
                var4_2 /* !! */  = (int)dv.crkw("crqe", crkt(int ), (int)129);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
lbl116:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)dv.crkw("crqf", crkt(int ), (int)130);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
lbl120:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)dv.crkw("crqg", crkt(int ), (int)131);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 11: {
                var4_2 /* !! */  = (int)dv.crkw("crqh", crkt(int ), (int)132);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl130:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)dv.crkw("crqi", crkt(int ), (int)133);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 13: {
                var4_2 /* !! */  = (int)dv.crkw("crqj", crkt(int ), (int)134);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl140:
            // 3 sources

            case 14: {
                var4_2 /* !! */  = (int)dv.crkw("crqk", crkt(int ), (int)135);
                if (!var5_1) ** GOTO lbl116
                throw null;
            }
lbl144:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)dv.crkw("crql", crkt(int ), (int)136);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
lbl148:
            // 3 sources

            case 16: {
                var4_2 /* !! */  = (int)dv.crkw("crqm", crkt(int ), (int)137);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl153:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)dv.crkw("crqn", crkt(int ), (int)138);
                if (!var5_1) ** GOTO lbl144
                throw null;
            }
lbl157:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)dv.crkw("crqo", crkt(int ), (int)139);
                if (!var5_1) ** GOTO lbl148
                throw null;
            }
lbl161:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)dv.crkw("crqp", crkt(int ), (int)140);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl166:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)dv.crkw("crqq", crkt(int ), (int)141);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl171:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)dv.crkw("crqr", crkt(int ), (int)142);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 22: {
                var4_2 /* !! */  = (int)dv.crkw("crqs", crkt(int ), (int)143);
                if (var5_1) {
                    throw null;
                }
            }
lbl180:
            // 4 sources

            case 23: {
                var4_2 /* !! */  = (int)dv.crkw("crqt", crkt(int ), (int)144);
                if (!var5_1) ** GOTO lbl157
                throw null;
            }
lbl184:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)dv.crkw("crqu", crkt(int ), (int)145);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
            case 25: {
                var4_2 /* !! */  = (int)dv.crkw("crqv", crkt(int ), (int)146);
                if (!var5_1) ** GOTO lbl157
                throw null;
            }
lbl192:
            // 3 sources

            case 26: {
                var4_2 /* !! */  = (int)dv.crkw("crqw", crkt(int ), (int)147);
                if (!var5_1) ** GOTO lbl86
                throw null;
            }
            case 27: {
                var4_2 /* !! */  = (int)dv.crkw("crqx", crkt(int ), (int)148);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 28: {
                var4_2 /* !! */  = (int)dv.crkw("crqy", crkt(int ), (int)149);
                if (!var5_1) ** GOTO lbl166
                throw null;
            }
lbl205:
            // 3 sources

            case 29: {
                var4_2 /* !! */  = (int)dv.crkw("crqz", crkt(int ), (int)150);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
lbl209:
            // 3 sources

            case 30: {
                var4_2 /* !! */  = (int)dv.crkw("crra", crkt(int ), (int)151);
                if (!var5_1) ** GOTO lbl153
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)dv.crkw("crrb", crkt(int ), (int)152);
                if (!var5_1) ** GOTO lbl130
                throw null;
            }
lbl217:
            // 4 sources

            case 32: {
                var4_2 /* !! */  = (int)dv.crkw("crrc", crkt(int ), (int)153);
                if (!var5_1) ** GOTO lbl166
                throw null;
            }
            case 33: {
                var4_2 /* !! */  = (int)dv.crkw("crrd", crkt(int ), (int)154);
                if (var5_1) {
                    throw null;
                }
            }
            case 34: {
                var4_2 /* !! */  = (int)dv.crkw("crre", crkt(int ), (int)155);
                if (!var5_1) ** GOTO lbl205
                throw null;
            }
            case 35: {
                var4_2 /* !! */  = (int)dv.crkw("crrf", crkt(int ), (int)156);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
lbl233:
            // 3 sources

            case 36: {
                var4_2 /* !! */  = (int)dv.crkw("crrg", crkt(int ), (int)157);
                if (!var5_1) ** GOTO lbl140
                throw null;
            }
            case 37: {
                var4_2 /* !! */  = (int)dv.crkw("crrh", crkt(int ), (int)158);
                if (!var5_1) ** GOTO lbl217
                throw null;
            }
            case 38: {
                var4_2 /* !! */  = (int)dv.crkw("crri", crkt(int ), (int)159);
                if (!var5_1) ** GOTO lbl209
                throw null;
            }
            case 39: {
                var4_2 /* !! */  = (int)dv.crkw("crrj", crkt(int ), (int)160);
                if (!var5_1) ** GOTO lbl217
                throw null;
            }
            case 40: {
                var4_2 /* !! */  = (int)dv.crkw("crrk", crkt(int ), (int)161);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
lbl253:
            // 3 sources

            case 41: {
                var4_2 /* !! */  = (int)dv.crkw("crrl", crkt(int ), (int)162);
                if (!var5_1) ** GOTO lbl97
                throw null;
            }
lbl257:
            // 2 sources

            case 42: {
                var4_2 /* !! */  = (int)dv.crkw("crrm", crkt(int ), (int)163);
                if (!var5_1) ** GOTO lbl171
                throw null;
            }
            case 43: 
        }
        var4_2 /* !! */  = (int)dv.crkw("crrn", crkt(int ), (int)164);
        ** while (!var5_1)
lbl264:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void csld() {
        dv.crku[400] = -1920048825;
        dv.crku[401] = 448176276;
        dv.crku[402] = -1622162414;
        dv.crku[403] = 833972349;
        dv.crku[404] = 228024681;
        dv.crku[405] = 1985864029;
        dv.crku[406] = 38526889;
        dv.crku[407] = 805453495;
        dv.crku[408] = -2024678033;
        dv.crku[409] = -1515300735;
        dv.crku[410] = 1689381506;
        dv.crku[411] = -1506199569;
        dv.crku[412] = -1931057838;
        dv.crku[413] = -487693960;
        dv.crku[414] = 1523599550;
        dv.crku[415] = -1497281533;
        dv.crku[416] = 1642763748;
        dv.crku[417] = -447346293;
        dv.crku[418] = -421858360;
        dv.crku[419] = 240724708;
        dv.crku[420] = 1116494273;
        dv.crku[421] = 673465564;
        dv.crku[422] = -956035307;
        dv.crku[423] = 1103744978;
        dv.crku[424] = 1320687966;
        dv.crku[425] = 1732657155;
        dv.crku[426] = -454008852;
        dv.crku[427] = -1462461929;
        dv.crku[428] = -24082876;
        dv.crku[429] = -1913760085;
        dv.crku[430] = 90093918;
        dv.crku[431] = 405008538;
        dv.crku[432] = -2065973550;
        dv.crku[433] = -546029392;
        dv.crku[434] = 439082494;
        dv.crku[435] = -391007785;
        dv.crku[436] = -541819884;
        dv.crku[437] = 1492413122;
        dv.crku[438] = -1732754745;
        dv.crku[439] = 713583118;
        dv.crku[440] = -1356904884;
        dv.crku[441] = -789109717;
        dv.crku[442] = 993145611;
        dv.crku[443] = -220050103;
        dv.crku[444] = -1360393584;
        dv.crku[445] = -1008648725;
        dv.crku[446] = 98988022;
        dv.crku[447] = -815465652;
        dv.crku[448] = -1612594048;
        dv.crku[449] = 1800319178;
        dv.crku[450] = 1767030656;
        dv.crku[451] = -1114446701;
        dv.crku[452] = -782562208;
        dv.crku[453] = 1354009382;
        dv.crku[454] = -472670481;
        dv.crku[455] = -1410789951;
        dv.crku[456] = -1827712993;
        dv.crku[457] = -151016435;
        dv.crku[458] = 1439615185;
        dv.crku[459] = 255385284;
        dv.crku[460] = -633176656;
        dv.crku[461] = 208331305;
        dv.crku[462] = 947939108;
        dv.crku[463] = -1344766118;
        dv.crku[464] = 161771910;
        dv.crku[465] = -428658256;
        dv.crku[466] = 1366144051;
        dv.crku[467] = 1083438485;
        dv.crku[468] = 1961200201;
        dv.crku[469] = -480575634;
        dv.crku[470] = 926143118;
        dv.crku[471] = 109109969;
        dv.crku[472] = 2032760457;
        dv.crku[473] = -350099892;
        dv.crku[474] = 207560888;
    }

    private static /* synthetic */ void cslk() {
        dv.crla[100] = -8913604118166257826L;
        dv.crla[101] = -3233057271234207520L;
        dv.crla[102] = 6974559541995887800L;
        dv.crla[103] = -8949977136255197724L;
        dv.crla[104] = 683059756682543539L;
        dv.crla[105] = 8649835481969764184L;
        dv.crla[106] = -3227946680087453292L;
        dv.crla[107] = -660923502847512317L;
        dv.crla[108] = -1106719450548299251L;
        dv.crla[109] = -8547567735552760177L;
        dv.crla[110] = -4610545894929572612L;
        dv.crla[111] = -916971885384962624L;
        dv.crla[112] = -3868010709424044139L;
        dv.crla[113] = 3309937932564123258L;
        dv.crla[114] = 5301544739048910267L;
        dv.crla[115] = 1711952681571977684L;
        dv.crla[116] = -6182869187464804056L;
        dv.crla[117] = -6377388198547855422L;
        dv.crla[118] = 1858329518975547329L;
        dv.crla[119] = -6553668204665497199L;
        dv.crla[120] = 6207153373740172399L;
        dv.crla[121] = -8206651165777651813L;
        dv.crla[122] = -1407667671268233008L;
        dv.crla[123] = -4282568161637999038L;
        dv.crla[124] = 2801012933153637465L;
        dv.crla[125] = -6256959606079085682L;
        dv.crla[126] = -4217438805172596350L;
        dv.crla[127] = 4891890499537983757L;
        dv.crla[128] = 3060294857884940640L;
        dv.crla[129] = -7523981900558129361L;
        dv.crla[130] = 7157271773416318284L;
        dv.crla[131] = 2795811749558678033L;
        dv.crla[132] = 6672632981653825339L;
        dv.crla[133] = 6405290011662759426L;
        dv.crla[134] = -2044708226236805077L;
        dv.crla[135] = 2172957189952797025L;
        dv.crla[136] = 2164941668245942432L;
        dv.crla[137] = 1752079440331054082L;
        dv.crla[138] = 3349701966810205659L;
        dv.crla[139] = 3219237289092991749L;
        dv.crla[140] = -2322750958348657832L;
        dv.crla[141] = -6838428432158718047L;
        dv.crla[142] = 2311339401775302414L;
        dv.crla[143] = 5650885425904752517L;
        dv.crla[144] = -3595753002727378162L;
        dv.crla[145] = 4326484170577403791L;
        dv.crla[146] = 706337794019606876L;
        dv.crla[147] = 3511829994729723432L;
        dv.crla[148] = 1331996232290161575L;
        dv.crla[149] = -8946999250499821197L;
        dv.crla[150] = -8042885024684775012L;
        dv.crla[151] = -7875225747414763543L;
        dv.crla[152] = 1521633833046378794L;
        dv.crla[153] = -8131574565838957521L;
        dv.crla[154] = 689606701597787540L;
        dv.crla[155] = -5741514907816723770L;
        dv.crla[156] = -6441275090015022414L;
        dv.crla[157] = -8136469791814599411L;
        dv.crla[158] = 5315418197953250745L;
        dv.crla[159] = 7476257220251901256L;
        dv.crla[160] = -2170350727384785632L;
        dv.crla[161] = 6519177115710855914L;
        dv.crla[162] = -4588570636057114928L;
        dv.crla[163] = 6576689082731388941L;
        dv.crla[164] = 3833492636452752210L;
        dv.crla[165] = -2699021780892719578L;
        dv.crla[166] = -272324966090785913L;
        dv.crla[167] = -417948432944055864L;
        dv.crla[168] = 503707970748911497L;
        dv.crla[169] = -6656143207175985475L;
        dv.crla[170] = -4084518717607017065L;
        dv.crla[171] = -1802838455034704429L;
        dv.crla[172] = 1220383896774110011L;
        dv.crla[173] = 8834678645132653198L;
        dv.crla[174] = 2454385375505333077L;
        dv.crla[175] = 7381967636573898846L;
        dv.crla[176] = -8683715135678744545L;
        dv.crla[177] = -7563818572917157330L;
        dv.crla[178] = 36789824782651889L;
        dv.crla[179] = -1118354045223779767L;
        dv.crla[180] = -2687032889047984289L;
        dv.crla[181] = -6051150881282988648L;
        dv.crla[182] = 6371172450195029778L;
        dv.crla[183] = -3915351335241668464L;
        dv.crla[184] = -8550959455807487689L;
        dv.crla[185] = -3913536045040403513L;
        dv.crla[186] = 1989502221776557263L;
        dv.crla[187] = 6057453056703161105L;
        dv.crla[188] = -6902379889672980469L;
        dv.crla[189] = 1262858686652029288L;
        dv.crla[190] = 6536151047863254700L;
        dv.crla[191] = -5545641390315361449L;
        dv.crla[192] = 3643048350232085627L;
        dv.crla[193] = 3966591249754969979L;
        dv.crla[194] = 2401476270034622438L;
        dv.crla[195] = -2517161469420661187L;
        dv.crla[196] = 6002518402794508881L;
        dv.crla[197] = 6938052385667572271L;
    }

    private static /* synthetic */ float crlm(int n2) {
        return Float.intBitsToFloat(crku[n2] ^ crkv[n2]);
    }

    static {
        crku = new int[475];
        crkv = new int[475];
        dv.cskz();
        dv.csla();
        dv.cslb();
        dv.cslc();
        dv.csld();
        dv.csle();
        dv.cslf();
        dv.cslg();
        dv.cslh();
        dv.csli();
        crla = new long[198];
        crlb = new long[198];
        dv.cslj();
        dv.cslk();
        dv.csll();
        dv.cslm();
        BLACK_FILL = nd.rgba((int)dv.crkw("cskb", crkt(int ), (int)451), (int)dv.crkw("cskc", crkt(int ), (int)452), (int)dv.crkw("cskd", crkt(int ), (int)453), (int)dv.crkw("cske", crkt(int ), (int)454));
        BORDER_COLOR = nd.rgba((int)dv.crkw("cskf", crkt(int ), (int)455), (int)dv.crkw("cskg", crkt(int ), (int)456), (int)dv.crkw("cskh", crkt(int ), (int)457), (int)dv.crkw("cski", crkt(int ), (int)458));
        SLOT_BORDER_COLOR = nd.rgba((int)dv.crkw("cskj", crkt(int ), (int)459), (int)dv.crkw("cskk", crkt(int ), (int)460), (int)dv.crkw("cskl", crkt(int ), (int)461), (int)dv.crkw("cskm", crkt(int ), (int)462));
        WARNING_COLOR = nd.rgba((int)dv.crkw("cskn", crkt(int ), (int)463), (int)dv.crkw("csko", crkt(int ), (int)464), (int)dv.crkw("cskp", crkt(int ), (int)465), (int)dv.crkw("cskq", crkt(int ), (int)466));
        DANGER_COLOR = nd.rgba((int)dv.crkw("cskr", crkt(int ), (int)467), (int)dv.crkw("csks", crkt(int ), (int)468), (int)dv.crkw("cskt", crkt(int ), (int)469), (int)dv.crkw("csku", crkt(int ), (int)470));
        EMPTY_COLOR = nd.rgba((int)dv.crkw("cskv", crkt(int ), (int)471), (int)dv.crkw("cskw", crkt(int ), (int)472), (int)dv.crkw("cskx", crkt(int ), (int)473), (int)dv.crkw("csky", crkt(int ), (int)474));
        SLOTS = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
    }

    private static /* synthetic */ double crkz(int n2) {
        return Double.longBitsToDouble(crla[n2] ^ crlb[n2]);
    }

    public static /* synthetic */ CallSite crkw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float durability(class_1799 var0) {
        block64: {
            block63: {
                v0 /* !! */  = dv.ge;
                if (true) ** GOTO lbl5
                block38: while (true) {
                    v0 /* !! */  = (long)(dv.crkw("crvu", crro(int ), (int)69) - dv.crkw("crvt", crro(int ), (int)68));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -756908130: {
                            break block38;
                        }
                        case 527746313: {
                            continue block38;
                        }
                    }
                    break;
                }
                var3_1 = dv.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("crvv", crro(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == dv.crkw("crvw", crkt(int ), (int)209)) break;
                    v1 /* !! */  = (long)dv.crkw("crvx", crkt(int ), (int)210);
                }
                var2_2 /* !! */  = dv.b;
                v2 /* !! */  = dv.ge;
                if (true) ** GOTO lbl22
                block40: while (true) {
                    v2 /* !! */  = (long)(v3 - dv.crkw("crvy", crro(int ), (int)71));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1895457143: {
                            v3 = dv.crkw("crvz", crro(int ), (int)72);
                            continue block40;
                        }
                        case -756908130: {
                            break block40;
                        }
                        case 913710808: {
                            v3 = dv.crkw("crwa", crro(int ), (int)73);
                            continue block40;
                        }
                        case 1057820625: {
                            v3 = dv.crkw("crwb", crro(int ), (int)74);
                            continue block40;
                        }
                    }
                    break;
                }
                var1_3 = dv.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 6 sources

                    return (float)dv.crkw("crwc", crlm(int ), (int)211);
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 /* !! */  = dv.ge;
                if (true) ** GOTO lbl44
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - dv.crkw("crwd", crro(int ), (int)75));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2112055210: {
                            v5 = dv.crkw("crwe", crro(int ), (int)76);
                            continue block42;
                        }
                        case -2099791240: {
                            v5 = dv.crkw("crwf", crro(int ), (int)77);
                            continue block42;
                        }
                        case -756908130: {
                            break block42;
                        }
                        case 1984666981: {
                            v5 = dv.crkw("crwg", crro(int ), (int)78);
                            continue block42;
                        }
                    }
                    break;
                }
                if (!var0.method_7963()) break block63;
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("crwh", crro(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == dv.crkw("crwi", crkt(int ), (int)212)) break;
                    v6 /* !! */  = (long)dv.crkw("crwj", crkt(int ), (int)213);
                }
                if (var0.method_7936() > 0) break block64;
                if (var1_3) ** GOTO lbl37
            }
            if (var1_3 || var1_3) ** GOTO lbl37
            return 1.0f;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("crwk", crro(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == dv.crkw("crwl", crkt(int ), (int)214)) break;
                    v7 /* !! */  = (long)dv.crkw("crwm", crkt(int ), (int)215);
                }
                v8 = var0.method_7919();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("crwn", crro(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == dv.crkw("crwo", crkt(int ), (int)216)) break;
                    v9 /* !! */  = (long)dv.crkw("crwp", crkt(int ), (int)217);
                }
                v10 = 1.0f - v8 / (float)var0.method_7936();
                v11 /* !! */  = dv.ge;
                if (true) ** GOTO lbl94
                block46: while (true) {
                    v11 /* !! */  = (long)(dv.crkw("crwr", crro(int ), (int)83) - dv.crkw("crwq", crro(int ), (int)82));
lbl94:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1183835604: {
                            continue block46;
                        }
                        case -756908130: {
                            break block46;
                        }
                    }
                    break;
                }
                v12 = Math.min(1.0f, v10);
                v13 /* !! */  = dv.ge;
                if (true) ** GOTO lbl104
                block47: while (true) {
                    v13 /* !! */  = (long)(v14 - dv.crkw("crws", crro(int ), (int)84));
lbl104:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2019216761: {
                            v14 = dv.crkw("crwt", crro(int ), (int)85);
                            continue block47;
                        }
                        case -756908130: {
                            break block47;
                        }
                        case 47031056: {
                            v14 = dv.crkw("crwu", crro(int ), (int)86);
                            continue block47;
                        }
                    }
                    break;
                }
                return Math.max(0.0f, v12);
            }
lbl114:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dv.crkw("crwv", crkt(int ), (int)218);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)dv.crkw("crww", crkt(int ), (int)219);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dv.crkw("crwx", crkt(int ), (int)220);
                    if (!var3_1) ** GOTO lbl114
                    throw null;
                }
            }
lbl129:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dv.crkw("crwy", crkt(int ), (int)221);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 4: {
                var2_2 /* !! */  = (int)dv.crkw("crwz", crkt(int ), (int)222);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl139:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)dv.crkw("crxa", crkt(int ), (int)223);
                } while (!var3_1);
                throw null;
            }
lbl144:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)dv.crkw("crxb", crkt(int ), (int)224);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
lbl148:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)dv.crkw("crxc", crkt(int ), (int)225);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
lbl152:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)dv.crkw("crxd", crkt(int ), (int)226);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)dv.crkw("crxe", crkt(int ), (int)227);
                if (!var3_1) break;
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)dv.crkw("crxf", crkt(int ), (int)228);
        ** while (!var3_1)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public float getRoundingRadius() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("csjn", crro(int ), (int)194)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dv.crkw("csjo", crkt(int ), (int)441)) break;
            v0 /* !! */  = (long)dv.crkw("csjp", crkt(int ), (int)442);
        }
        var3_1 = dv.c;
        v1 /* !! */  = dv.ge;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(dv.crkw("csjr", crro(int ), (int)196) - dv.crkw("csjq", crro(int ), (int)195));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1364834736: {
                    continue block11;
                }
                case -756908130: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = dv.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("csjs", crro(int ), (int)197)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dv.crkw("csjt", crkt(int ), (int)443)) break;
                    v2 /* !! */  = (long)dv.crkw("csju", crkt(int ), (int)444);
                }
                var1_3 = dv.a;
                if (var3_1) {
                    throw null;
                    return (float)dv.crkw("csjv", crlm(int ), (int)445);
                }
                if (var1_3 || var1_3) ** continue;
                return (float)dv.crkw("csjw", crlm(int ), (int)446);
            }
lbl34:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dv.crkw("csjx", crkt(int ), (int)447);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dv.crkw("csjy", crkt(int ), (int)448);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)dv.crkw("csjz", crkt(int ), (int)449);
                if (!var3_1) ** GOTO lbl34
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dv.crkw("cska", crkt(int ), (int)450);
        ** while (!var3_1)
lbl50:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void markItemModelQueued() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("cses", crro(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dv.crkw("cset", crkt(int ), (int)347)) break;
            v0 /* !! */  = (long)dv.crkw("cseu", crkt(int ), (int)348);
        }
        var2 = dv.c;
        v1 /* !! */  = dv.ge;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(dv.crkw("csew", crro(int ), (int)165) - dv.crkw("csev", crro(int ), (int)164));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -756908130: {
                    break block17;
                }
                case 702885604: {
                    continue block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = dv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("csex", crro(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dv.crkw("csey", crkt(int ), (int)349)) break;
            v2 /* !! */  = (long)dv.crkw("csez", crkt(int ), (int)350);
        }
        var0_2 = dv.a;
        if (var2) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl27
        v3 = dv.crkw("csfa", crkt(int ), (int)351);
        v4 /* !! */  = dv.ge;
        if (true) ** GOTO lbl35
        block20: while (true) {
            v4 /* !! */  = (long)(dv.crkw("csfc", crro(int ), (int)168) - dv.crkw("csfb", crro(int ), (int)167));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -756908130: {
                    break block20;
                }
                case -575582369: {
                    continue block20;
                }
            }
            break;
        }
        dv.queuedItemModels = v3;
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)dv.crkw("csfd", crkt(int ), (int)352);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl53:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)dv.crkw("csfe", crkt(int ), (int)353);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)dv.crkw("csff", crkt(int ), (int)354);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl62:
            // 3 sources

            case 3: {
                var1_1 /* !! */  = (int)dv.crkw("csfg", crkt(int ), (int)355);
                if (!var2) ** GOTO lbl53
                throw null;
            }
lbl66:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)dv.crkw("csfh", crkt(int ), (int)356);
                if (!var2) ** GOTO lbl62
                throw null;
            }
            case 5: 
        }
        do {
            var1_1 /* !! */  = (int)dv.crkw("csfi", crkt(int ), (int)357);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void cskz() {
        dv.crku[0] = -1641438049;
        dv.crku[1] = 824977689;
        dv.crku[2] = 1675642916;
        dv.crku[3] = -1599584217;
        dv.crku[4] = -1507741365;
        dv.crku[5] = 2060671080;
        dv.crku[6] = -2052394985;
        dv.crku[7] = 2069576626;
        dv.crku[8] = 458355801;
        dv.crku[9] = 453627198;
        dv.crku[10] = 860301013;
        dv.crku[11] = -1073355171;
        dv.crku[12] = -1169356486;
        dv.crku[13] = 712552805;
        dv.crku[14] = 838200761;
        dv.crku[15] = 991685235;
        dv.crku[16] = 436918210;
        dv.crku[17] = 2079966418;
        dv.crku[18] = 1434663269;
        dv.crku[19] = 1286546290;
        dv.crku[20] = -1543247293;
        dv.crku[21] = -1244690965;
        dv.crku[22] = 1866959116;
        dv.crku[23] = 752089524;
        dv.crku[24] = 1382340527;
        dv.crku[25] = 1696469314;
        dv.crku[26] = 96139151;
        dv.crku[27] = 1411858257;
        dv.crku[28] = -763334044;
        dv.crku[29] = -1546907915;
        dv.crku[30] = -1988400903;
        dv.crku[31] = -1652567628;
        dv.crku[32] = -1096632085;
        dv.crku[33] = -258625888;
        dv.crku[34] = 1541645940;
        dv.crku[35] = -717324076;
        dv.crku[36] = 175073727;
        dv.crku[37] = -1012553594;
        dv.crku[38] = 1259285709;
        dv.crku[39] = 239749682;
        dv.crku[40] = -937280274;
        dv.crku[41] = -1359649195;
        dv.crku[42] = 1470545596;
        dv.crku[43] = 1339822435;
        dv.crku[44] = -397459452;
        dv.crku[45] = 610579538;
        dv.crku[46] = 141798892;
        dv.crku[47] = -644036081;
        dv.crku[48] = 1707549915;
        dv.crku[49] = -1321307429;
        dv.crku[50] = -446744094;
        dv.crku[51] = -713449530;
        dv.crku[52] = -1922677122;
        dv.crku[53] = -1387197087;
        dv.crku[54] = 155692102;
        dv.crku[55] = 1323811011;
        dv.crku[56] = 892423091;
        dv.crku[57] = -1725496873;
        dv.crku[58] = -629395253;
        dv.crku[59] = -691556898;
        dv.crku[60] = 150696038;
        dv.crku[61] = -588515973;
        dv.crku[62] = 1900778592;
        dv.crku[63] = -1548601272;
        dv.crku[64] = 838847230;
        dv.crku[65] = -2024858182;
        dv.crku[66] = -1037998284;
        dv.crku[67] = 779585656;
        dv.crku[68] = 2073568249;
        dv.crku[69] = 1232864029;
        dv.crku[70] = -1200607403;
        dv.crku[71] = -734340510;
        dv.crku[72] = 1993421820;
        dv.crku[73] = -1219567734;
        dv.crku[74] = 2019468584;
        dv.crku[75] = 1629212799;
        dv.crku[76] = -632989937;
        dv.crku[77] = -914744022;
        dv.crku[78] = -1843845292;
        dv.crku[79] = 705199540;
        dv.crku[80] = -1599859581;
        dv.crku[81] = -2035894483;
        dv.crku[82] = 570942036;
        dv.crku[83] = -2006871375;
        dv.crku[84] = -136446280;
        dv.crku[85] = 1492223764;
        dv.crku[86] = 1748850819;
        dv.crku[87] = -1060353958;
        dv.crku[88] = -2108567575;
        dv.crku[89] = -87835684;
        dv.crku[90] = 108544376;
        dv.crku[91] = 639889969;
        dv.crku[92] = 1674628002;
        dv.crku[93] = -1591410941;
        dv.crku[94] = -1169230707;
        dv.crku[95] = 1278697004;
        dv.crku[96] = 320717177;
        dv.crku[97] = 1854542748;
        dv.crku[98] = 1875498866;
        dv.crku[99] = 1780243918;
    }

    private static /* synthetic */ long crro(int n2) {
        return crla[n2] ^ crlb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawDurability(class_332 var0, float var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("cryp", crro(int ), (int)101)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dv.crkw("cryq", crkt(int ), (int)250)) break;
            v0 /* !! */  = (long)dv.crkw("cryr", crkt(int ), (int)251);
        }
        var11_5 = dv.c;
        v1 /* !! */  = dv.ge;
        if (true) ** GOTO lbl11
        block50: while (true) {
            v1 /* !! */  = (long)(v2 - dv.crkw("crys", crro(int ), (int)102));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -899187416: {
                    v2 = dv.crkw("cryt", crro(int ), (int)103);
                    continue block50;
                }
                case -756908130: {
                    break block50;
                }
                case -430838093: {
                    v2 = dv.crkw("cryu", crro(int ), (int)104);
                    continue block50;
                }
            }
            break;
        }
        var10_6 /* !! */  = dv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("cryv", crro(int ), (int)105)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dv.crkw("cryw", crkt(int ), (int)252)) break;
            v3 /* !! */  = (long)dv.crkw("cryx", crkt(int ), (int)253);
        }
        var9_7 = dv.a;
        if (var11_5) {
            throw null;
lbl29:
            // 9 sources

            return;
        }
        if (var9_7 || var9_7) ** GOTO lbl29
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = dv.ge;
                if (true) ** GOTO lbl39
                block53: while (true) {
                    v4 /* !! */  = (long)(dv.crkw("cryz", crro(int ), (int)107) - dv.crkw("cryy", crro(int ), (int)106));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -756908130: {
                            break block53;
                        }
                        case 2072705478: {
                            continue block53;
                        }
                    }
                    break;
                }
                var5_8 = dv.durabilityColor(var3_3);
                if (var9_7 || var9_7) ** GOTO lbl29
                var6_9 = var1_1 + dv.crkw("crza", crlm(int ), (int)254);
                if (var9_7 || var9_7) ** GOTO lbl29
                var7_10 = var2_2 + dv.crkw("crzb", crlm(int ), (int)255) - dv.crkw("crzc", crlm(int ), (int)256) - dv.crkw("crzd", crlm(int ), (int)257);
                if (var9_7 || var9_7) ** GOTO lbl29
                v5 = dv.crkw("crze", crlm(int ), (int)258);
                v6 = dv.crkw("crzf", crlm(int ), (int)259);
                v7 = dv.crkw("crzg", crlm(int ), (int)260);
                v8 = dv.crkw("crzh", crkt(int ), (int)261);
                v9 /* !! */  = dv.ge;
                if (true) ** GOTO lbl58
                block54: while (true) {
                    v9 /* !! */  = (long)(v10 - dv.crkw("crzi", crro(int ), (int)108));
lbl58:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2133867243: {
                            v10 = dv.crkw("crzj", crro(int ), (int)109);
                            continue block54;
                        }
                        case -756908130: {
                            break block54;
                        }
                        case 2089697389: {
                            v10 = dv.crkw("crzk", crro(int ), (int)110);
                            continue block54;
                        }
                    }
                    break;
                }
                v11 = nd.withAlpha(var5_8, (int)v8);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("crzl", crro(int ), (int)111)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dv.crkw("crzm", crkt(int ), (int)262)) break;
                    v12 /* !! */  = (long)dv.crkw("crzn", crkt(int ), (int)263);
                }
                v13 = nd.multAlpha(v11, var4_4);
                v14 = dv.crkw("crzo", crkt(int ), (int)264);
                v15 /* !! */  = dv.ge;
                if (true) ** GOTO lbl79
                block56: while (true) {
                    v15 /* !! */  = (long)(v16 - dv.crkw("crzp", crro(int ), (int)112));
lbl79:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1339654027: {
                            v16 = dv.crkw("crzq", crro(int ), (int)113);
                            continue block56;
                        }
                        case -756908130: {
                            break block56;
                        }
                        case 1652219532: {
                            v16 = dv.crkw("crzr", crro(int ), (int)114);
                            continue block56;
                        }
                    }
                    break;
                }
                ki.rect(var0, var6_9, var7_10, (float)v5, (float)v6, (float)v7, v13, (boolean)v14);
                if (var9_7 || var9_7) ** GOTO lbl29
                var8_11 = dv.crkw("crzs", crlm(int ), (int)265) * var3_3;
                if (var9_7 || var9_7) ** GOTO lbl29
                if (!(var8_11 > dv.crkw("crzt", crlm(int ), (int)266))) ** GOTO lbl129
                if (var9_7 || var9_7) ** GOTO lbl29
                v17 = dv.crkw("crzu", crlm(int ), (int)267);
                v18 = dv.crkw("crzv", crlm(int ), (int)268);
                v19 = var8_11 * dv.crkw("crzw", crlm(int ), (int)269);
                v20 /* !! */  = dv.ge;
                if (true) ** GOTO lbl101
                block57: while (true) {
                    v20 /* !! */  = (long)(v21 - dv.crkw("crzx", crro(int ), (int)115));
lbl101:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -756908130: {
                            break block57;
                        }
                        case -614295937: {
                            v21 = dv.crkw("crzy", crro(int ), (int)116);
                            continue block57;
                        }
                        case 338880525: {
                            v21 = dv.crkw("crzz", crro(int ), (int)117);
                            continue block57;
                        }
                    }
                    break;
                }
                v22 = Math.min((float)v18, (float)v19);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("csaa", crro(int ), (int)118)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == dv.crkw("csab", crkt(int ), (int)270)) break;
                    v23 /* !! */  = (long)dv.crkw("csac", crkt(int ), (int)271);
                }
                v24 = nd.multAlpha(var5_8, var4_4);
                v25 = dv.crkw("csad", crkt(int ), (int)272);
                v26 /* !! */  = dv.ge;
                if (true) ** GOTO lbl122
                block59: while (true) {
                    v26 /* !! */  = (long)(dv.crkw("csaf", crro(int ), (int)120) - dv.crkw("csae", crro(int ), (int)119));
lbl122:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -756908130: {
                            break block59;
                        }
                        case 1475349025: {
                            continue block59;
                        }
                    }
                    break;
                }
                ki.rect(var0, var6_9, var7_10, (float)var8_11, (float)v17, v22, v24, (boolean)v25);
                if (var9_7) ** GOTO lbl29
lbl129:
                // 2 sources

                if (!var9_7 && !var9_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var10_6 /* !! */  = (int)dv.crkw("csag", crkt(int ), (int)273);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl137:
            // 2 sources

            case 1: {
                var10_6 /* !! */  = (int)dv.crkw("csah", crkt(int ), (int)274);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 2: {
                var10_6 /* !! */  = (int)dv.crkw("csai", crkt(int ), (int)275);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl147:
            // 2 sources

            case 3: {
                do {
                    var10_6 /* !! */  = (int)dv.crkw("csaj", crkt(int ), (int)276);
                } while (!var11_5);
                throw null;
            }
lbl152:
            // 2 sources

            case 4: {
                do {
                    var10_6 /* !! */  = (int)dv.crkw("csak", crkt(int ), (int)277);
                } while (!var11_5);
                throw null;
            }
lbl157:
            // 2 sources

            case 5: {
                do {
                    var10_6 /* !! */  = (int)dv.crkw("csal", crkt(int ), (int)278);
                } while (!var11_5);
                throw null;
            }
            case 6: {
                var10_6 /* !! */  = (int)dv.crkw("csam", crkt(int ), (int)279);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl167:
            // 3 sources

            case 7: {
                do {
                    var10_6 /* !! */  = (int)dv.crkw("csan", crkt(int ), (int)280);
                } while (!var11_5);
                throw null;
            }
            case 8: {
                var10_6 /* !! */  = (int)dv.crkw("csao", crkt(int ), (int)281);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl177:
            // 2 sources

            case 9: {
                var10_6 /* !! */  = (int)dv.crkw("csap", crkt(int ), (int)282);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl182:
            // 3 sources

            case 10: {
                var10_6 /* !! */  = (int)dv.crkw("csaq", crkt(int ), (int)283);
                if (!var11_5) ** GOTO lbl152
                throw null;
            }
lbl186:
            // 2 sources

            case 11: {
                var10_6 /* !! */  = (int)dv.crkw("csar", crkt(int ), (int)284);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 12: {
                var10_6 /* !! */  = (int)dv.crkw("csas", crkt(int ), (int)285);
                if (!var11_5) ** GOTO lbl182
                throw null;
            }
            case 13: {
                var10_6 /* !! */  = (int)dv.crkw("csat", crkt(int ), (int)286);
                if (var11_5) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl200:
            // 2 sources

            case 14: {
                var10_6 /* !! */  = (int)dv.crkw("csau", crkt(int ), (int)287);
                if (!var11_5) ** GOTO lbl157
                throw null;
            }
lbl204:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_6 /* !! */  = (int)dv.crkw("csav", crkt(int ), (int)288);
                    if (!var11_5) ** GOTO lbl137
                    throw null;
                }
            }
lbl209:
            // 3 sources

            case 16: {
                var10_6 /* !! */  = (int)dv.crkw("csaw", crkt(int ), (int)289);
                if (!var11_5) ** GOTO lbl167
                throw null;
            }
            case 17: {
                var10_6 /* !! */  = (int)dv.crkw("csax", crkt(int ), (int)290);
                if (!var11_5) ** GOTO lbl147
                throw null;
            }
            case 18: 
        }
        var10_6 /* !! */  = (int)dv.crkw("csay", crkt(int ), (int)291);
        ** while (!var11_5)
lbl220:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void csll() {
        dv.crlb[0] = -453950494234156030L;
        dv.crlb[1] = 4676510370945675609L;
        dv.crlb[2] = -8379448826006138215L;
        dv.crlb[3] = 1102267853001590030L;
        dv.crlb[4] = 1672398923133971898L;
        dv.crlb[5] = -7522970154241784562L;
        dv.crlb[6] = -4685524802068882525L;
        dv.crlb[7] = 4914585098494369931L;
        dv.crlb[8] = 7650597776603355655L;
        dv.crlb[9] = -2421433344002637393L;
        dv.crlb[10] = 5290329786677242638L;
        dv.crlb[11] = -1112270109294321766L;
        dv.crlb[12] = -8542728460911958412L;
        dv.crlb[13] = 280501726109207377L;
        dv.crlb[14] = 5988582574209447803L;
        dv.crlb[15] = 6354215935480651986L;
        dv.crlb[16] = 981410053696325155L;
        dv.crlb[17] = 7709677541482132839L;
        dv.crlb[18] = -5248969954233450599L;
        dv.crlb[19] = 5345343118559556076L;
        dv.crlb[20] = 4354872751966826246L;
        dv.crlb[21] = -4617402682391777789L;
        dv.crlb[22] = -5795958122842248487L;
        dv.crlb[23] = -9077520843201423005L;
        dv.crlb[24] = 4833900428448486396L;
        dv.crlb[25] = 2861402409454828230L;
        dv.crlb[26] = 745601358902628967L;
        dv.crlb[27] = -4486686040572126692L;
        dv.crlb[28] = -7433915386871004757L;
        dv.crlb[29] = -1793736208816427920L;
        dv.crlb[30] = -195570755131342428L;
        dv.crlb[31] = 3442456301564709601L;
        dv.crlb[32] = 7210687252878423016L;
        dv.crlb[33] = 8822571336525945140L;
        dv.crlb[34] = -6529942261587955601L;
        dv.crlb[35] = -6777188985341410082L;
        dv.crlb[36] = -249613030621525442L;
        dv.crlb[37] = -7155213999268128106L;
        dv.crlb[38] = -6086323715656587679L;
        dv.crlb[39] = 1748870187994156282L;
        dv.crlb[40] = 9154751263851662578L;
        dv.crlb[41] = -4953268065214952544L;
        dv.crlb[42] = -1500678163686815393L;
        dv.crlb[43] = -6687838839894655390L;
        dv.crlb[44] = 2410138770333541911L;
        dv.crlb[45] = 7910321098992210820L;
        dv.crlb[46] = 3950734515214028281L;
        dv.crlb[47] = -5515764668099897523L;
        dv.crlb[48] = 9188903663416873537L;
        dv.crlb[49] = 2458440428076988098L;
        dv.crlb[50] = -7179417668355331300L;
        dv.crlb[51] = 8909981931550835806L;
        dv.crlb[52] = 5090854355570371966L;
        dv.crlb[53] = 8271867878565926754L;
        dv.crlb[54] = 789618891413369356L;
        dv.crlb[55] = -6690833737477040069L;
        dv.crlb[56] = -3287792429677641626L;
        dv.crlb[57] = 5796126541061095475L;
        dv.crlb[58] = 9020072588368275724L;
        dv.crlb[59] = -5226151918751348839L;
        dv.crlb[60] = -6213153896987573264L;
        dv.crlb[61] = 7360598065694873671L;
        dv.crlb[62] = 5393388895629522750L;
        dv.crlb[63] = 6958639641889495098L;
        dv.crlb[64] = -5362198549966116358L;
        dv.crlb[65] = 6338950661249373232L;
        dv.crlb[66] = 536382381617404021L;
        dv.crlb[67] = 7956840511857569442L;
        dv.crlb[68] = 3107917898621566336L;
        dv.crlb[69] = -3917872322861216119L;
        dv.crlb[70] = 4839055953020636L;
        dv.crlb[71] = -7609042398022291991L;
        dv.crlb[72] = 6036853696965141111L;
        dv.crlb[73] = -1361086181434967945L;
        dv.crlb[74] = 8690907513593153465L;
        dv.crlb[75] = 9203876204672077232L;
        dv.crlb[76] = -6596772812432758182L;
        dv.crlb[77] = 5269931296695133440L;
        dv.crlb[78] = -5462986413811743309L;
        dv.crlb[79] = -5130420870371935350L;
        dv.crlb[80] = -3608866159867974273L;
        dv.crlb[81] = -7119296754747275173L;
        dv.crlb[82] = 1527174958474226062L;
        dv.crlb[83] = -5494356172139259712L;
        dv.crlb[84] = 8576539783112598366L;
        dv.crlb[85] = 2072809571883602826L;
        dv.crlb[86] = 8190749383557794827L;
        dv.crlb[87] = -136613912978058404L;
        dv.crlb[88] = -228240293941486638L;
        dv.crlb[89] = 1022484768880136495L;
        dv.crlb[90] = 2566100192408945232L;
        dv.crlb[91] = 3009244346861316188L;
        dv.crlb[92] = -7755551805267010L;
        dv.crlb[93] = -1174701667324527350L;
        dv.crlb[94] = -5387858495281061751L;
        dv.crlb[95] = -1207629292165541217L;
        dv.crlb[96] = -8281281745369240620L;
        dv.crlb[97] = 3505102948486781985L;
        dv.crlb[98] = -7720966049697036125L;
        dv.crlb[99] = 1445762583159678702L;
    }

    private static /* synthetic */ void cslg() {
        dv.crkv[200] = -2044239522;
        dv.crkv[201] = 977326049;
        dv.crkv[202] = -1155096914;
        dv.crkv[203] = -804927000;
        dv.crkv[204] = 20773548;
        dv.crkv[205] = 1185871819;
        dv.crkv[206] = -331243040;
        dv.crkv[207] = 1996771919;
        dv.crkv[208] = 1484250735;
        dv.crkv[209] = -600168340;
        dv.crkv[210] = 2121584865;
        dv.crkv[211] = -846391720;
        dv.crkv[212] = -1586748656;
        dv.crkv[213] = 1356018828;
        dv.crkv[214] = -38860471;
        dv.crkv[215] = -1706975837;
        dv.crkv[216] = 1816828850;
        dv.crkv[217] = 1829711694;
        dv.crkv[218] = -443428660;
        dv.crkv[219] = 1216971109;
        dv.crkv[220] = -1574761095;
        dv.crkv[221] = 435018547;
        dv.crkv[222] = -1120095520;
        dv.crkv[223] = 404808238;
        dv.crkv[224] = -1125729291;
        dv.crkv[225] = -1169016456;
        dv.crkv[226] = -1367126194;
        dv.crkv[227] = 1191978545;
        dv.crkv[228] = 2080132547;
        dv.crkv[229] = 216982898;
        dv.crkv[230] = 1289833824;
        dv.crkv[231] = -100354943;
        dv.crkv[232] = 1913427059;
        dv.crkv[233] = 771218995;
        dv.crkv[234] = -284530611;
        dv.crkv[235] = -1813436945;
        dv.crkv[236] = -495787657;
        dv.crkv[237] = 1220653130;
        dv.crkv[238] = 1706001033;
        dv.crkv[239] = 163104209;
        dv.crkv[240] = -1766710492;
        dv.crkv[241] = -653120587;
        dv.crkv[242] = -981262481;
        dv.crkv[243] = 1037879373;
        dv.crkv[244] = 1281965961;
        dv.crkv[245] = -92014365;
        dv.crkv[246] = -558854915;
        dv.crkv[247] = 1101712502;
        dv.crkv[248] = -791510987;
        dv.crkv[249] = 1050594462;
        dv.crkv[250] = 1820471926;
        dv.crkv[251] = -483671061;
        dv.crkv[252] = -1706468569;
        dv.crkv[253] = -143865775;
        dv.crkv[254] = -1407478173;
        dv.crkv[255] = 1110095348;
        dv.crkv[256] = -1393410625;
        dv.crkv[257] = 960892873;
        dv.crkv[258] = -680105356;
        dv.crkv[259] = 2007589285;
        dv.crkv[260] = 1109934035;
        dv.crkv[261] = -628666201;
        dv.crkv[262] = -1077880994;
        dv.crkv[263] = 960905255;
        dv.crkv[264] = 2016964134;
        dv.crkv[265] = -1858203607;
        dv.crkv[266] = 1975727439;
        dv.crkv[267] = 610632835;
        dv.crkv[268] = -649116361;
        dv.crkv[269] = -1347055779;
        dv.crkv[270] = 1481301105;
        dv.crkv[271] = 1467022152;
        dv.crkv[272] = -493612175;
        dv.crkv[273] = -1457747463;
        dv.crkv[274] = 428686176;
        dv.crkv[275] = -2096191043;
        dv.crkv[276] = -2015538863;
        dv.crkv[277] = 1417727818;
        dv.crkv[278] = 913698986;
        dv.crkv[279] = -1111557638;
        dv.crkv[280] = 1455963999;
        dv.crkv[281] = 2048054470;
        dv.crkv[282] = 1541149622;
        dv.crkv[283] = 1521691530;
        dv.crkv[284] = -171295388;
        dv.crkv[285] = 1594596759;
        dv.crkv[286] = -1752453079;
        dv.crkv[287] = 989503617;
        dv.crkv[288] = 2101873838;
        dv.crkv[289] = -1080515508;
        dv.crkv[290] = 1047561652;
        dv.crkv[291] = 1105965666;
        dv.crkv[292] = 548910946;
        dv.crkv[293] = 1148244196;
        dv.crkv[294] = -1366516688;
        dv.crkv[295] = -247314183;
        dv.crkv[296] = 1073593742;
        dv.crkv[297] = 310011828;
        dv.crkv[298] = -897761828;
        dv.crkv[299] = 1645635861;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void drawDraggable(class_332 var1_1, int var2_2) {
        var23_3 = dv.c;
        var22_4 /* !! */  = dv.b;
        var21_5 = dv.a;
        if (var23_3) {
            throw null;
lbl6:
            // 46 sources

            return;
        }
        if (var21_5 || var21_5) ** GOTO lbl6
        dv.queuedItemModels = dv.crkw("crll", crkt(int ), (int)9);
        if (var21_5 || var21_5) ** GOTO lbl6
        kq.hasFonts();
        if (var21_5 || var21_5) ** GOTO lbl6
        var3_6 = (float)var2_2 / dv.crkw("crln", crlm(int ), (int)10);
        if (var21_5 || var21_5) ** GOTO lbl6
        var4_7 = this.getX();
        if (var21_5 || var21_5) ** GOTO lbl6
        var5_8 = this.getY();
        if (var21_5 || var21_5) ** GOTO lbl6
        this.setWidth((int)Math.ceil((double)dv.crkw("crlo", crkz(int ), (int)2)));
        if (var21_5 || var21_5) ** GOTO lbl6
        this.setHeight((int)Math.ceil((double)dv.crkw("crlp", crkz(int ), (int)3)));
        if (var21_5 || var21_5) ** GOTO lbl6
        var6_9 = System.nanoTime();
        if (var21_5 || var21_5) ** GOTO lbl6
        var8_10 = Math.min((float)dv.crkw("crlq", crlm(int ), (int)11), (float)(var6_9 - this.lastFrame) / dv.crkw("crlr", crlm(int ), (int)12));
        if (var22_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_5 || var21_5) ** GOTO lbl6
                this.lastFrame = var6_9;
                if (var21_5 || var21_5) ** GOTO lbl6
                var9_11 = 1.0f - (float)Math.exp((double)(dv.crkw("crls", crlm(int ), (int)13) * var8_10));
                if (var21_5 || var21_5) ** GOTO lbl6
                dv.drawPanel(var1_1, var4_7, var5_8, var3_6);
                if (var21_5 || var21_5) ** GOTO lbl6
                var10_12 = this.armorStacks();
                if (var21_5 || var21_5) ** GOTO lbl6
                if (kv.PHOBIA_NEW == null) ** GOTO lbl45
                if (var21_5 || var21_5) ** GOTO lbl6
                v0 = kv.PHOBIA_NEW;
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl47
lbl45:
                // 1 sources

                if (var21_5 || var21_5) ** GOTO lbl6
                v0 = var11_13 = kv.getDefault();
lbl47:
                // 2 sources

                if (var21_5 || var21_5) ** GOTO lbl6
                var12_14 = dv.crkw("crlt", crkt(int ), (int)14);
                if (var21_5) ** GOTO lbl6
                do {
                    if (var21_5 || var21_5) ** GOTO lbl6
                    if (var12_14 >= dv.SLOTS.length) ** GOTO lbl105
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var13_15 = dv.SLOTS[var12_14];
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var14_16 = var4_7 + dv.crkw("crlu", crlm(int ), (int)15) + (float)var12_14 * dv.crkw("crlv", crlm(int ), (int)16);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var15_17 = var5_8 + dv.crkw("crlw", crlm(int ), (int)17);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    dv.drawSlot(var1_1, var14_16, var15_17, var3_6);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var16_18 = var10_12[var12_14];
                    if (var21_5 || var21_5) ** GOTO lbl6
                    if (var16_18 == null) ** GOTO lbl68
                    if (var21_5) ** GOTO lbl6
                    if (!var16_18.method_7960()) ** GOTO lbl77
                    if (var21_5) ** GOTO lbl6
lbl68:
                    // 2 sources

                    if (var21_5 || var21_5) ** GOTO lbl6
                    dv.drawEmptyIcon(var1_1, var11_13, var14_16, var15_17, var3_6);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    this.animatedDurability.remove(var13_15);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    if (var23_3) {
                        throw null;
                    }
                    ** GOTO lbl100
lbl77:
                    // 1 sources

                    if (var21_5 || var21_5) ** GOTO lbl6
                    var17_19 = var14_16 + dv.crkw("crlx", crlm(int ), (int)18);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var18_20 = var15_17 + dv.crkw("crly", crlm(int ), (int)19);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    this.drawItem(var1_1, var16_18, var17_19, var18_20, (float)dv.crkw("crlz", crlm(int ), (int)20));
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var19_21 = dv.durability(var16_18);
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var20_22 = this.animatedDurability.getOrDefault(var13_15, Float.valueOf(var19_21)).floatValue();
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var20_22 += (var19_21 - var20_22) * var9_11;
                    if (var21_5 || var21_5) ** GOTO lbl6
                    if (!(Math.abs(var19_21 - var20_22) < dv.crkw("crma", crlm(int ), (int)21))) ** GOTO lbl94
                    if (var21_5 || var21_5) ** GOTO lbl6
                    var20_22 = var19_21;
                    if (var21_5) ** GOTO lbl6
lbl94:
                    // 2 sources

                    if (var21_5 || var21_5) ** GOTO lbl6
                    this.animatedDurability.put(var13_15, Float.valueOf(var20_22));
                    if (var21_5 || var21_5) ** GOTO lbl6
                    dv.drawDurability(var1_1, var14_16, var15_17, var20_22, var3_6);
                    if (var21_5) ** GOTO lbl6
lbl100:
                    // 2 sources

                    if (var21_5 || var21_5) ** GOTO lbl6
                    ++var12_14;
                    if (var21_5) ** GOTO lbl6
                } while (!var23_3);
                throw null;
lbl105:
                // 1 sources

                if (var21_5 || var21_5) ** GOTO lbl6
                this.drawPanelOutline(var1_1, var4_7, var5_8, (float)dv.crkw("crmb", crlm(int ), (int)22), (float)dv.crkw("crmc", crlm(int ), (int)23), (float)dv.crkw("crmd", crlm(int ), (int)24), (float)dv.crkw("crme", crlm(int ), (int)25), dv.BORDER_COLOR, var3_6);
                if (!var21_5 && !var21_5) ** break;
                ** continue;
                return;
            }
lbl110:
            // 2 sources

            case 0: {
                var22_4 /* !! */  = (int)dv.crkw("crmf", crkt(int ), (int)26);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl498
            }
lbl115:
            // 2 sources

            case 1: {
                var22_4 /* !! */  = (int)dv.crkw("crmg", crkt(int ), (int)27);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl120:
            // 5 sources

            case 2: {
                var22_4 /* !! */  = (int)dv.crkw("crmh", crkt(int ), (int)28);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 3: {
                var22_4 /* !! */  = (int)dv.crkw("crmi", crkt(int ), (int)29);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 4: {
                var22_4 /* !! */  = (int)dv.crkw("crmj", crkt(int ), (int)30);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl135:
            // 2 sources

            case 5: {
                var22_4 /* !! */  = (int)dv.crkw("crmk", crkt(int ), (int)31);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl140:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_4 /* !! */  = (int)dv.crkw("crml", crkt(int ), (int)32);
                    if (var23_3) {
                        throw null;
                    }
                    ** GOTO lbl283
                    break;
                }
            }
lbl146:
            // 4 sources

            case 7: {
                var22_4 /* !! */  = (int)dv.crkw("crmm", crkt(int ), (int)33);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 8: {
                var22_4 /* !! */  = (int)dv.crkw("crmn", crkt(int ), (int)34);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl156:
            // 2 sources

            case 9: {
                var22_4 /* !! */  = (int)dv.crkw("crmo", crkt(int ), (int)35);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 10: {
                var22_4 /* !! */  = (int)dv.crkw("crmp", crkt(int ), (int)36);
                if (!var23_3) ** GOTO lbl115
                throw null;
            }
            case 11: {
                var22_4 /* !! */  = (int)dv.crkw("crmq", crkt(int ), (int)37);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl170:
            // 2 sources

            case 12: {
                var22_4 /* !! */  = (int)dv.crkw("crmr", crkt(int ), (int)38);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl175:
            // 2 sources

            case 13: {
                var22_4 /* !! */  = (int)dv.crkw("crms", crkt(int ), (int)39);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl180:
            // 2 sources

            case 14: {
                var22_4 /* !! */  = (int)dv.crkw("crmt", crkt(int ), (int)40);
                if (!var23_3) ** GOTO lbl140
                throw null;
            }
            case 15: {
                var22_4 /* !! */  = (int)dv.crkw("crmu", crkt(int ), (int)41);
                if (!var23_3) ** GOTO lbl146
                throw null;
            }
            case 16: {
                var22_4 /* !! */  = (int)dv.crkw("crmv", crkt(int ), (int)42);
                if (!var23_3) ** GOTO lbl175
                throw null;
            }
lbl192:
            // 2 sources

            case 17: {
                var22_4 /* !! */  = (int)dv.crkw("crmw", crkt(int ), (int)43);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl197:
            // 2 sources

            case 18: {
                var22_4 /* !! */  = (int)dv.crkw("crmx", crkt(int ), (int)44);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl498
            }
            case 19: {
                var22_4 /* !! */  = (int)dv.crkw("crmy", crkt(int ), (int)45);
                if (!var23_3) ** GOTO lbl192
                throw null;
            }
lbl206:
            // 2 sources

            case 20: {
                var22_4 /* !! */  = (int)dv.crkw("crmz", crkt(int ), (int)46);
                if (!var23_3) ** GOTO lbl110
                throw null;
            }
lbl210:
            // 5 sources

            case 21: {
                var22_4 /* !! */  = (int)dv.crkw("crna", crkt(int ), (int)47);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl215:
            // 2 sources

            case 22: {
                var22_4 /* !! */  = (int)dv.crkw("crnb", crkt(int ), (int)48);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 23: {
                var22_4 /* !! */  = (int)dv.crkw("crnc", crkt(int ), (int)49);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl225:
            // 2 sources

            case 24: {
                var22_4 /* !! */  = (int)dv.crkw("crnd", crkt(int ), (int)50);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 25: {
                var22_4 /* !! */  = (int)dv.crkw("crne", crkt(int ), (int)51);
                if (!var23_3) ** GOTO lbl197
                throw null;
            }
            case 26: {
                var22_4 /* !! */  = (int)dv.crkw("crnf", crkt(int ), (int)52);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 27: {
                var22_4 /* !! */  = (int)dv.crkw("crng", crkt(int ), (int)53);
                if (!var23_3) ** GOTO lbl225
                throw null;
            }
lbl243:
            // 3 sources

            case 28: {
                var22_4 /* !! */  = (int)dv.crkw("crnh", crkt(int ), (int)54);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl248:
            // 2 sources

            case 29: {
                var22_4 /* !! */  = (int)dv.crkw("crni", crkt(int ), (int)55);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl253:
            // 2 sources

            case 30: {
                var22_4 /* !! */  = (int)dv.crkw("crnj", crkt(int ), (int)56);
                if (!var23_3) break;
                throw null;
            }
lbl257:
            // 2 sources

            case 31: {
                var22_4 /* !! */  = (int)dv.crkw("crnk", crkt(int ), (int)57);
                if (!var23_3) ** GOTO lbl135
                throw null;
            }
lbl261:
            // 3 sources

            case 32: {
                var22_4 /* !! */  = (int)dv.crkw("crnl", crkt(int ), (int)58);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl266:
            // 2 sources

            case 33: {
                var22_4 /* !! */  = (int)dv.crkw("crnm", crkt(int ), (int)59);
                if (!var23_3) ** GOTO lbl146
                throw null;
            }
lbl270:
            // 3 sources

            case 34: {
                var22_4 /* !! */  = (int)dv.crkw("crnn", crkt(int ), (int)60);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl275:
            // 3 sources

            case 35: {
                var22_4 /* !! */  = (int)dv.crkw("crno", crkt(int ), (int)61);
                if (!var23_3) ** GOTO lbl180
                throw null;
            }
lbl279:
            // 3 sources

            case 36: {
                var22_4 /* !! */  = (int)dv.crkw("crnp", crkt(int ), (int)62);
                if (!var23_3) ** GOTO lbl243
                throw null;
            }
lbl283:
            // 2 sources

            case 37: {
                var22_4 /* !! */  = (int)dv.crkw("crnq", crkt(int ), (int)63);
                if (!var23_3) ** GOTO lbl279
                throw null;
            }
lbl287:
            // 2 sources

            case 38: {
                var22_4 /* !! */  = (int)dv.crkw("crnr", crkt(int ), (int)64);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl462
            }
            case 39: {
                var22_4 /* !! */  = (int)dv.crkw("crns", crkt(int ), (int)65);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 40: {
                var22_4 /* !! */  = (int)dv.crkw("crnt", crkt(int ), (int)66);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl302:
            // 2 sources

            case 41: {
                var22_4 /* !! */  = (int)dv.crkw("crnu", crkt(int ), (int)67);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl307:
            // 2 sources

            case 42: {
                var22_4 /* !! */  = (int)dv.crkw("crnv", crkt(int ), (int)68);
                if (!var23_3) ** GOTO lbl275
                throw null;
            }
lbl311:
            // 3 sources

            case 43: {
                var22_4 /* !! */  = (int)dv.crkw("crnw", crkt(int ), (int)69);
                if (!var23_3) ** GOTO lbl243
                throw null;
            }
lbl315:
            // 3 sources

            case 44: {
                var22_4 /* !! */  = (int)dv.crkw("crnx", crkt(int ), (int)70);
                if (!var23_3) ** GOTO lbl146
                throw null;
            }
lbl319:
            // 3 sources

            case 45: {
                var22_4 /* !! */  = (int)dv.crkw("crny", crkt(int ), (int)71);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl324:
            // 3 sources

            case 46: {
                do {
                    var22_4 /* !! */  = (int)dv.crkw("crnz", crkt(int ), (int)72);
                } while (!var23_3);
                throw null;
            }
lbl329:
            // 4 sources

            case 47: {
                var22_4 /* !! */  = (int)dv.crkw("croa", crkt(int ), (int)73);
                if (!var23_3) ** GOTO lbl307
                throw null;
            }
            case 48: {
                var22_4 /* !! */  = (int)dv.crkw("crob", crkt(int ), (int)74);
                if (!var23_3) ** GOTO lbl206
                throw null;
            }
lbl337:
            // 3 sources

            case 49: {
                var22_4 /* !! */  = (int)dv.crkw("croc", crkt(int ), (int)75);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl498
            }
lbl342:
            // 2 sources

            case 50: {
                var22_4 /* !! */  = (int)dv.crkw("crod", crkt(int ), (int)76);
                if (!var23_3) ** GOTO lbl329
                throw null;
            }
            case 51: {
                var22_4 /* !! */  = (int)dv.crkw("croe", crkt(int ), (int)77);
                if (!var23_3) ** GOTO lbl315
                throw null;
            }
lbl350:
            // 2 sources

            case 52: {
                var22_4 /* !! */  = (int)dv.crkw("crof", crkt(int ), (int)78);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl498
            }
            case 53: {
                var22_4 /* !! */  = (int)dv.crkw("crog", crkt(int ), (int)79);
                if (!var23_3) ** GOTO lbl215
                throw null;
            }
lbl359:
            // 2 sources

            case 54: {
                var22_4 /* !! */  = (int)dv.crkw("croh", crkt(int ), (int)80);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl364:
            // 2 sources

            case 55: {
                var22_4 /* !! */  = (int)dv.crkw("croi", crkt(int ), (int)81);
                if (!var23_3) ** GOTO lbl210
                throw null;
            }
lbl368:
            // 2 sources

            case 56: {
                var22_4 /* !! */  = (int)dv.crkw("croj", crkt(int ), (int)82);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl373:
            // 4 sources

            case 57: {
                var22_4 /* !! */  = (int)dv.crkw("crok", crkt(int ), (int)83);
                if (!var23_3) ** GOTO lbl311
                throw null;
            }
lbl377:
            // 2 sources

            case 58: {
                var22_4 /* !! */  = (int)dv.crkw("crol", crkt(int ), (int)84);
                if (!var23_3) ** GOTO lbl120
                throw null;
            }
lbl381:
            // 2 sources

            case 59: {
                var22_4 /* !! */  = (int)dv.crkw("crom", crkt(int ), (int)85);
                if (!var23_3) ** GOTO lbl120
                throw null;
            }
            case 60: {
                var22_4 /* !! */  = (int)dv.crkw("cron", crkt(int ), (int)86);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl390:
            // 2 sources

            case 61: {
                var22_4 /* !! */  = (int)dv.crkw("croo", crkt(int ), (int)87);
                if (!var23_3) ** GOTO lbl368
                throw null;
            }
lbl394:
            // 2 sources

            case 62: {
                var22_4 /* !! */  = (int)dv.crkw("crop", crkt(int ), (int)88);
                if (!var23_3) ** GOTO lbl350
                throw null;
            }
            case 63: {
                var22_4 /* !! */  = (int)dv.crkw("croq", crkt(int ), (int)89);
                if (!var23_3) ** GOTO lbl210
                throw null;
            }
lbl402:
            // 2 sources

            case 64: {
                var22_4 /* !! */  = (int)dv.crkw("cror", crkt(int ), (int)90);
                if (!var23_3) ** GOTO lbl257
                throw null;
            }
            case 65: {
                var22_4 /* !! */  = (int)dv.crkw("cros", crkt(int ), (int)91);
                if (!var23_3) ** GOTO lbl279
                throw null;
            }
            case 66: {
                var22_4 /* !! */  = (int)dv.crkw("crot", crkt(int ), (int)92);
                if (!var23_3) ** GOTO lbl377
                throw null;
            }
lbl414:
            // 2 sources

            case 67: {
                var22_4 /* !! */  = (int)dv.crkw("crou", crkt(int ), (int)93);
                if (!var23_3) ** GOTO lbl270
                throw null;
            }
            case 68: {
                var22_4 /* !! */  = (int)dv.crkw("crov", crkt(int ), (int)94);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 69: {
                var22_4 /* !! */  = (int)dv.crkw("crow", crkt(int ), (int)95);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl478
            }
            case 70: {
                var22_4 /* !! */  = (int)dv.crkw("crox", crkt(int ), (int)96);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl470
            }
lbl433:
            // 2 sources

            case 71: {
                var22_4 /* !! */  = (int)dv.crkw("croy", crkt(int ), (int)97);
                if (!var23_3) ** GOTO lbl402
                throw null;
            }
lbl437:
            // 3 sources

            case 72: {
                var22_4 /* !! */  = (int)dv.crkw("croz", crkt(int ), (int)98);
                if (!var23_3) ** GOTO lbl373
                throw null;
            }
lbl441:
            // 2 sources

            case 73: {
                var22_4 /* !! */  = (int)dv.crkw("crpa", crkt(int ), (int)99);
                if (var23_3) {
                    throw null;
                }
                ** GOTO lbl454
            }
            case 74: {
                var22_4 /* !! */  = (int)dv.crkw("crpb", crkt(int ), (int)100);
                if (!var23_3) ** GOTO lbl120
                throw null;
            }
lbl450:
            // 3 sources

            case 75: {
                var22_4 /* !! */  = (int)dv.crkw("crpc", crkt(int ), (int)101);
                if (!var23_3) ** GOTO lbl287
                throw null;
            }
lbl454:
            // 2 sources

            case 76: {
                var22_4 /* !! */  = (int)dv.crkw("crpd", crkt(int ), (int)102);
                if (!var23_3) ** GOTO lbl210
                throw null;
            }
            case 77: {
                var22_4 /* !! */  = (int)dv.crkw("crpe", crkt(int ), (int)103);
                if (!var23_3) ** GOTO lbl414
                throw null;
            }
lbl462:
            // 3 sources

            case 78: {
                var22_4 /* !! */  = (int)dv.crkw("crpf", crkt(int ), (int)104);
                if (!var23_3) ** GOTO lbl156
                throw null;
            }
            case 79: {
                var22_4 /* !! */  = (int)dv.crkw("crpg", crkt(int ), (int)105);
                if (!var23_3) ** GOTO lbl373
                throw null;
            }
lbl470:
            // 2 sources

            case 80: {
                var22_4 /* !! */  = (int)dv.crkw("crph", crkt(int ), (int)106);
                if (!var23_3) ** GOTO lbl248
                throw null;
            }
            case 81: {
                var22_4 /* !! */  = (int)dv.crkw("crpi", crkt(int ), (int)107);
                if (!var23_3) ** GOTO lbl120
                throw null;
            }
lbl478:
            // 2 sources

            case 82: {
                var22_4 /* !! */  = (int)dv.crkw("crpj", crkt(int ), (int)108);
                if (!var23_3) ** GOTO lbl315
                throw null;
            }
            case 83: {
                var22_4 /* !! */  = (int)dv.crkw("crpk", crkt(int ), (int)109);
                if (!var23_3) ** GOTO lbl441
                throw null;
            }
lbl486:
            // 2 sources

            case 84: {
                var22_4 /* !! */  = (int)dv.crkw("crpl", crkt(int ), (int)110);
                if (!var23_3) ** GOTO lbl261
                throw null;
            }
lbl490:
            // 2 sources

            case 85: {
                var22_4 /* !! */  = (int)dv.crkw("crpm", crkt(int ), (int)111);
                if (!var23_3) ** GOTO lbl342
                throw null;
            }
            case 86: {
                var22_4 /* !! */  = (int)dv.crkw("crpn", crkt(int ), (int)112);
                if (!var23_3) ** GOTO lbl170
                throw null;
            }
lbl498:
            // 5 sources

            case 87: {
                var22_4 /* !! */  = (int)dv.crkw("crpo", crkt(int ), (int)113);
                if (!var23_3) ** GOTO lbl486
                throw null;
            }
lbl502:
            // 2 sources

            case 88: {
                var22_4 /* !! */  = (int)dv.crkw("crpp", crkt(int ), (int)114);
                if (!var23_3) ** GOTO lbl381
                throw null;
            }
            case 89: 
        }
        var22_4 /* !! */  = (int)dv.crkw("crpq", crkt(int ), (int)115);
        ** while (!var23_3)
lbl509:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1799[] demoArmor() {
        block160: {
            v0 /* !! */  = dv.ge;
            if (true) ** GOTO lbl5
            block113: while (true) {
                v0 /* !! */  = (long)(dv.crkw("crrq", crro(int ), (int)5) - dv.crkw("crrp", crro(int ), (int)4));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1110338628: {
                        continue block113;
                    }
                    case -756908130: {
                        break block113;
                    }
                }
                break;
            }
            var6_1 = dv.c;
            v1 /* !! */  = dv.ge;
            if (true) ** GOTO lbl15
            block114: while (true) {
                v1 /* !! */  = (long)(v2 - dv.crkw("crrr", crro(int ), (int)6));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1265330525: {
                        v2 = dv.crkw("crrs", crro(int ), (int)7);
                        continue block114;
                    }
                    case -756908130: {
                        break block114;
                    }
                    case -257610918: {
                        v2 = dv.crkw("crrt", crro(int ), (int)8);
                        continue block114;
                    }
                }
                break;
            }
            var5_2 /* !! */  = dv.b;
            v3 /* !! */  = dv.ge;
            if (true) ** GOTO lbl29
            block115: while (true) {
                v3 /* !! */  = (long)(v4 - dv.crkw("crru", crro(int ), (int)9));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -756908130: {
                        break block115;
                    }
                    case 59313594: {
                        v4 = dv.crkw("crrv", crro(int ), (int)10);
                        continue block115;
                    }
                    case 691224719: {
                        v4 = dv.crkw("crrw", crro(int ), (int)11);
                        continue block115;
                    }
                    case 1464932352: {
                        v4 = dv.crkw("crrx", crro(int ), (int)12);
                        continue block115;
                    }
                }
                break;
            }
            var4_3 = dv.a;
            if (var6_1) {
                throw null;
lbl44:
                // 10 sources

                return null;
            }
            if (var4_3 || var4_3) ** GOTO lbl44
            v5 /* !! */  = dv.ge;
            if (true) ** GOTO lbl51
            block117: while (true) {
                v5 /* !! */  = (long)(dv.crkw("crrz", crro(int ), (int)14) - dv.crkw("crry", crro(int ), (int)13));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -756908130: {
                        break block117;
                    }
                    case -125230596: {
                        continue block117;
                    }
                }
                break;
            }
            if (this.demoArmor == null) break block160;
            if (var4_3) ** GOTO lbl44
            v6 /* !! */  = dv.ge;
            if (true) ** GOTO lbl62
            block118: while (true) {
                v6 /* !! */  = (long)(v7 - dv.crkw("crsa", crro(int ), (int)15));
lbl62:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -756908130: {
                        break block118;
                    }
                    case -719575974: {
                        v7 = dv.crkw("crsb", crro(int ), (int)16);
                        continue block118;
                    }
                    case 906981451: {
                        v7 = dv.crkw("crsc", crro(int ), (int)17);
                        continue block118;
                    }
                }
                break;
            }
            return this.demoArmor;
        }
        if (var4_3 || var4_3) ** GOTO lbl44
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("crsd", crro(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == dv.crkw("crse", crkt(int ), (int)165)) break;
            v8 /* !! */  = (long)dv.crkw("crsf", crkt(int ), (int)166);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("crsg", crro(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == dv.crkw("crsh", crkt(int ), (int)167)) break;
            v9 /* !! */  = (long)dv.crkw("crsi", crkt(int ), (int)168);
        }
        v10 /* !! */  = dv.ge;
        if (true) ** GOTO lbl88
        block121: while (true) {
            v10 /* !! */  = (long)(v11 - dv.crkw("crsj", crro(int ), (int)20));
lbl88:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1091365670: {
                    v11 = dv.crkw("crsk", crro(int ), (int)21);
                    continue block121;
                }
                case -756908130: {
                    break block121;
                }
                case 1428122179: {
                    v11 = dv.crkw("crsl", crro(int ), (int)22);
                    continue block121;
                }
            }
            break;
        }
        var1_4 = new class_1799((class_1935)class_1802.field_22027);
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3 || var4_3) ** GOTO lbl44
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("crsm", crro(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dv.crkw("crsn", crkt(int ), (int)169)) break;
                    v12 /* !! */  = (long)dv.crkw("crso", crkt(int ), (int)170);
                }
                v13 = (float)var1_4.method_7936() * dv.crkw("crsp", crlm(int ), (int)171);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("crsq", crro(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == dv.crkw("crsr", crkt(int ), (int)172)) break;
                    v14 /* !! */  = (long)dv.crkw("crss", crkt(int ), (int)173);
                }
                v15 = Math.round(v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = dv.ge - dv.crkw("crst", crro(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == dv.crkw("crsu", crkt(int ), (int)174)) break;
                    v16 /* !! */  = (long)dv.crkw("crsv", crkt(int ), (int)175);
                }
                var1_4.method_7974(v15);
                if (var4_3 || var4_3) ** GOTO lbl44
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = dv.ge - dv.crkw("crsw", crro(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == dv.crkw("crsx", crkt(int ), (int)176)) break;
                    v17 /* !! */  = (long)dv.crkw("crsy", crkt(int ), (int)177);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = dv.ge - dv.crkw("crsz", crro(int ), (int)27)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == dv.crkw("crta", crkt(int ), (int)178)) break;
                    v18 /* !! */  = (long)dv.crkw("crtb", crkt(int ), (int)179);
                }
                v19 /* !! */  = dv.ge;
                if (true) ** GOTO lbl135
                block127: while (true) {
                    v19 /* !! */  = (long)(v20 - dv.crkw("crtc", crro(int ), (int)28));
lbl135:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1483108583: {
                            v20 = dv.crkw("crtd", crro(int ), (int)29);
                            continue block127;
                        }
                        case -1106444113: {
                            v20 = dv.crkw("crte", crro(int ), (int)30);
                            continue block127;
                        }
                        case -756908130: {
                            break block127;
                        }
                        case -22073252: {
                            v20 = dv.crkw("crtf", crro(int ), (int)31);
                            continue block127;
                        }
                    }
                    break;
                }
                var2_5 = new class_1799((class_1935)class_1802.field_22028);
                if (var4_3 || var4_3) ** GOTO lbl44
                v21 /* !! */  = dv.ge;
                if (true) ** GOTO lbl153
                block128: while (true) {
                    v21 /* !! */  = (long)(v22 - dv.crkw("crtg", crro(int ), (int)32));
lbl153:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2072864824: {
                            v22 = dv.crkw("crth", crro(int ), (int)33);
                            continue block128;
                        }
                        case -756908130: {
                            break block128;
                        }
                        case -515048767: {
                            v22 = dv.crkw("crti", crro(int ), (int)34);
                            continue block128;
                        }
                        case 764741640: {
                            v22 = dv.crkw("crtj", crro(int ), (int)35);
                            continue block128;
                        }
                    }
                    break;
                }
                v23 = (float)var2_5.method_7936() * dv.crkw("crtk", crlm(int ), (int)180);
                v24 /* !! */  = dv.ge;
                if (true) ** GOTO lbl170
                block129: while (true) {
                    v24 /* !! */  = (long)(v25 - dv.crkw("crtl", crro(int ), (int)36));
lbl170:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -756908130: {
                            break block129;
                        }
                        case 1426545471: {
                            v25 = dv.crkw("crtm", crro(int ), (int)37);
                            continue block129;
                        }
                        case 1784258740: {
                            v25 = dv.crkw("crtn", crro(int ), (int)38);
                            continue block129;
                        }
                    }
                    break;
                }
                v26 = Math.round(v23);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = dv.ge - dv.crkw("crto", crro(int ), (int)39)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == dv.crkw("crtp", crkt(int ), (int)181)) break;
                    v27 /* !! */  = (long)dv.crkw("crtq", crkt(int ), (int)182);
                }
                var2_5.method_7974(v26);
                if (var4_3 || var4_3) ** GOTO lbl44
                v28 /* !! */  = dv.ge;
                if (true) ** GOTO lbl191
                block131: while (true) {
                    v28 /* !! */  = (long)(v29 - dv.crkw("crtr", crro(int ), (int)40));
lbl191:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1312869668: {
                            v29 = dv.crkw("crts", crro(int ), (int)41);
                            continue block131;
                        }
                        case -756908130: {
                            break block131;
                        }
                        case -430731768: {
                            v29 = dv.crkw("crtt", crro(int ), (int)42);
                            continue block131;
                        }
                        case 655573967: {
                            v29 = dv.crkw("crtu", crro(int ), (int)43);
                            continue block131;
                        }
                    }
                    break;
                }
                v30 /* !! */  = dv.ge;
                if (true) ** GOTO lbl207
                block132: while (true) {
                    v30 /* !! */  = (long)(v31 - dv.crkw("crtv", crro(int ), (int)44));
lbl207:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -756908130: {
                            break block132;
                        }
                        case -182486: {
                            v31 = dv.crkw("crtw", crro(int ), (int)45);
                            continue block132;
                        }
                        case 1650075630: {
                            v31 = dv.crkw("crtx", crro(int ), (int)46);
                            continue block132;
                        }
                    }
                    break;
                }
                v32 /* !! */  = dv.ge;
                if (true) ** GOTO lbl220
                block133: while (true) {
                    v32 /* !! */  = (long)(v33 - dv.crkw("crty", crro(int ), (int)47));
lbl220:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1848085806: {
                            v33 = dv.crkw("crtz", crro(int ), (int)48);
                            continue block133;
                        }
                        case -1468632381: {
                            v33 = dv.crkw("crua", crro(int ), (int)49);
                            continue block133;
                        }
                        case -756908130: {
                            break block133;
                        }
                        case 455754173: {
                            v33 = dv.crkw("crub", crro(int ), (int)50);
                            continue block133;
                        }
                    }
                    break;
                }
                var3_6 = new class_1799((class_1935)class_1802.field_22030);
                if (var4_3 || var4_3) ** GOTO lbl44
                v34 /* !! */  = dv.ge;
                if (true) ** GOTO lbl238
                block134: while (true) {
                    v34 /* !! */  = (long)(dv.crkw("crud", crro(int ), (int)52) - dv.crkw("cruc", crro(int ), (int)51));
lbl238:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -847305218: {
                            continue block134;
                        }
                        case -756908130: {
                            break block134;
                        }
                    }
                    break;
                }
                v35 = (float)var3_6.method_7936() * dv.crkw("crue", crlm(int ), (int)183);
                v36 /* !! */  = dv.ge;
                if (true) ** GOTO lbl248
                block135: while (true) {
                    v36 /* !! */  = (long)(dv.crkw("crug", crro(int ), (int)54) - dv.crkw("cruf", crro(int ), (int)53));
lbl248:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -756908130: {
                            break block135;
                        }
                        case -192606075: {
                            continue block135;
                        }
                    }
                    break;
                }
                v37 = Math.round(v35);
                v38 /* !! */  = dv.ge;
                if (true) ** GOTO lbl258
                block136: while (true) {
                    v38 /* !! */  = (long)(v39 - dv.crkw("cruh", crro(int ), (int)55));
lbl258:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -1531781779: {
                            v39 = dv.crkw("crui", crro(int ), (int)56);
                            continue block136;
                        }
                        case -756908130: {
                            break block136;
                        }
                        case -128862134: {
                            v39 = dv.crkw("cruj", crro(int ), (int)57);
                            continue block136;
                        }
                        case 157327985: {
                            v39 = dv.crkw("cruk", crro(int ), (int)58);
                            continue block136;
                        }
                    }
                    break;
                }
                var3_6.method_7974(v37);
                if (var4_3 || var4_3) ** GOTO lbl44
                v40 = new class_1799[4];
                v40[0] = var1_4;
                v40[1] = var2_5;
                v41 = dv.crkw("crul", crkt(int ), (int)184);
                v42 /* !! */  = dv.ge;
                if (true) ** GOTO lbl280
                block137: while (true) {
                    v42 /* !! */  = (long)(v43 - dv.crkw("crum", crro(int ), (int)59));
lbl280:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -1578711391: {
                            v43 = dv.crkw("crun", crro(int ), (int)60);
                            continue block137;
                        }
                        case -1043423512: {
                            v43 = dv.crkw("cruo", crro(int ), (int)61);
                            continue block137;
                        }
                        case -780314328: {
                            v43 = dv.crkw("crup", crro(int ), (int)62);
                            continue block137;
                        }
                        case -756908130: {
                            break block137;
                        }
                    }
                    break;
                }
                v40[v41] = class_1799.field_8037;
                v40[3] = var3_6;
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_8 = dv.ge - dv.crkw("cruq", crro(int ), (int)63)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == dv.crkw("crur", crkt(int ), (int)185)) break;
                    v44 /* !! */  = (long)dv.crkw("crus", crkt(int ), (int)186);
                }
                this.demoArmor = v40;
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                v45 /* !! */  = dv.ge;
                if (true) ** GOTO lbl306
                block139: while (true) {
                    v45 /* !! */  = (long)(v46 - dv.crkw("crut", crro(int ), (int)64));
lbl306:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1089232749: {
                            v46 = dv.crkw("cruu", crro(int ), (int)65);
                            continue block139;
                        }
                        case -756908130: {
                            break block139;
                        }
                        case -457092667: {
                            v46 = dv.crkw("cruv", crro(int ), (int)66);
                            continue block139;
                        }
                        case 556289485: {
                            v46 = dv.crkw("cruw", crro(int ), (int)67);
                            continue block139;
                        }
                    }
                    break;
                }
                return this.demoArmor;
            }
            case 0: {
                var5_2 /* !! */  = (int)dv.crkw("crux", crkt(int ), (int)187);
                if (!var6_1) break;
                throw null;
            }
            case 1: {
                var5_2 /* !! */  = (int)dv.crkw("cruy", crkt(int ), (int)188);
                if (var6_1) {
                    throw null;
                }
            }
lbl327:
            // 4 sources

            case 2: {
                var5_2 /* !! */  = (int)dv.crkw("cruz", crkt(int ), (int)189);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl332:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)dv.crkw("crva", crkt(int ), (int)190);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl381
            }
            case 4: {
                var5_2 /* !! */  = (int)dv.crkw("crvb", crkt(int ), (int)191);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 5: {
                var5_2 /* !! */  = (int)dv.crkw("crvc", crkt(int ), (int)192);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl347:
            // 2 sources

            case 6: {
                do {
                    var5_2 /* !! */  = (int)dv.crkw("crvd", crkt(int ), (int)193);
                } while (!var6_1);
                throw null;
            }
            case 7: {
                var5_2 /* !! */  = (int)dv.crkw("crve", crkt(int ), (int)194);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl357:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)dv.crkw("crvf", crkt(int ), (int)195);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 9: {
                var5_2 /* !! */  = (int)dv.crkw("crvg", crkt(int ), (int)196);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 10: {
                var5_2 /* !! */  = (int)dv.crkw("crvh", crkt(int ), (int)197);
                if (!var6_1) break;
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)dv.crkw("crvi", crkt(int ), (int)198);
                if (!var6_1) ** GOTO lbl347
                throw null;
            }
lbl375:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)dv.crkw("crvj", crkt(int ), (int)199);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl402
                    break;
                }
            }
lbl381:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)dv.crkw("crvk", crkt(int ), (int)200);
                if (!var6_1) ** GOTO lbl332
                throw null;
            }
lbl385:
            // 2 sources

            case 14: {
                var5_2 /* !! */  = (int)dv.crkw("crvl", crkt(int ), (int)201);
                if (!var6_1) ** GOTO lbl357
                throw null;
            }
lbl389:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)dv.crkw("crvm", crkt(int ), (int)202);
                if (!var6_1) break;
                throw null;
            }
lbl393:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)dv.crkw("crvn", crkt(int ), (int)203);
                if (!var6_1) ** GOTO lbl327
                throw null;
            }
            case 17: {
                var5_2 /* !! */  = (int)dv.crkw("crvo", crkt(int ), (int)204);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl402:
            // 3 sources

            case 18: {
                do {
                    var5_2 /* !! */  = (int)dv.crkw("crvp", crkt(int ), (int)205);
                } while (!var6_1);
                throw null;
            }
lbl407:
            // 2 sources

            case 19: {
                var5_2 /* !! */  = (int)dv.crkw("crvq", crkt(int ), (int)206);
                if (!var6_1) ** GOTO lbl385
                throw null;
            }
lbl411:
            // 3 sources

            case 20: {
                var5_2 /* !! */  = (int)dv.crkw("crvr", crkt(int ), (int)207);
                if (!var6_1) ** GOTO lbl389
                throw null;
            }
            case 21: 
        }
        var5_2 /* !! */  = (int)dv.crkw("crvs", crkt(int ), (int)208);
        ** while (!var6_1)
lbl418:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void drawItem(class_332 var1_1, class_1799 var2_2, float var3_3, float var4_4, float var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("csaz", crro(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dv.crkw("csba", crkt(int ), (int)292)) break;
            v0 /* !! */  = (long)dv.crkw("csbb", crkt(int ), (int)293);
        }
        var11_6 = dv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("csbc", crro(int ), (int)122)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dv.crkw("csbd", crkt(int ), (int)294)) break;
            v1 /* !! */  = (long)dv.crkw("csbe", crkt(int ), (int)295);
        }
        var10_7 /* !! */  = dv.b;
        v2 /* !! */  = dv.ge;
        if (true) ** GOTO lbl17
        block65: while (true) {
            v2 /* !! */  = (long)(dv.crkw("csbg", crro(int ), (int)124) - dv.crkw("csbf", crro(int ), (int)123));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -756908130: {
                    break block65;
                }
                case 1718537479: {
                    continue block65;
                }
            }
            break;
        }
        var9_8 = dv.a;
        if (var11_6) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var9_8 || var9_8) ** GOTO lbl25
        v3 /* !! */  = dv.ge;
        if (true) ** GOTO lbl32
        block67: while (true) {
            v3 /* !! */  = (long)(v4 - dv.crkw("csbh", crro(int ), (int)125));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -756908130: {
                    break block67;
                }
                case 1004380398: {
                    v4 = dv.crkw("csbi", crro(int ), (int)126);
                    continue block67;
                }
                case 2103288805: {
                    v4 = dv.crkw("csbj", crro(int ), (int)127);
                    continue block67;
                }
            }
            break;
        }
        v5 = 2.0f * ki.getContextScale();
        v6 = dv.crkw("csbk", crkt(int ), (int)296);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("csbl", crro(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dv.crkw("csbm", crkt(int ), (int)297)) break;
            v7 /* !! */  = (long)dv.crkw("csbn", crkt(int ), (int)298);
        }
        v8 /* !! */  = dv.ge;
        if (true) ** GOTO lbl52
        block69: while (true) {
            v8 /* !! */  = (long)(dv.crkw("csbp", crro(int ), (int)130) - dv.crkw("csbo", crro(int ), (int)129));
lbl52:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1958993356: {
                    continue block69;
                }
                case -756908130: {
                    break block69;
                }
            }
            break;
        }
        v9 = this.mc.method_22683();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("csbq", crro(int ), (int)131)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == dv.crkw("csbr", crkt(int ), (int)299)) break;
            v10 /* !! */  = (long)dv.crkw("csbs", crkt(int ), (int)300);
        }
        v11 = v9.method_4495();
        v12 /* !! */  = dv.ge;
        if (true) ** GOTO lbl68
        block71: while (true) {
            v12 /* !! */  = (long)(dv.crkw("csbu", crro(int ), (int)133) - dv.crkw("csbt", crro(int ), (int)132));
lbl68:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -756908130: {
                    break block71;
                }
                case -543182677: {
                    continue block71;
                }
            }
            break;
        }
        var6_9 = v5 / (float)Math.max((int)v6, v11);
        if (var9_8 || var9_8) ** GOTO lbl25
        var7_10 = var5_5 * var6_9 / dv.crkw("csbv", crlm(int ), (int)301);
        if (var9_8 || var9_8) ** GOTO lbl25
        v13 /* !! */  = dv.ge;
        if (true) ** GOTO lbl81
        block72: while (true) {
            v13 /* !! */  = (long)(v14 - dv.crkw("csbw", crro(int ), (int)134));
lbl81:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -756908130: {
                    break block72;
                }
                case 380970152: {
                    v14 = dv.crkw("csbx", crro(int ), (int)135);
                    continue block72;
                }
                case 625911638: {
                    v14 = dv.crkw("csby", crro(int ), (int)136);
                    continue block72;
                }
                case 2076979500: {
                    v14 = dv.crkw("csbz", crro(int ), (int)137);
                    continue block72;
                }
            }
            break;
        }
        var8_11 = var1_1.method_51448();
        if (var9_8 || var9_8) ** GOTO lbl25
        v15 /* !! */  = dv.ge;
        if (true) ** GOTO lbl99
        block73: while (true) {
            v15 /* !! */  = (long)(v16 - dv.crkw("csca", crro(int ), (int)138));
lbl99:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1955589643: {
                    v16 = dv.crkw("cscb", crro(int ), (int)139);
                    continue block73;
                }
                case -756908130: {
                    break block73;
                }
                case 1025514262: {
                    v16 = dv.crkw("cscc", crro(int ), (int)140);
                    continue block73;
                }
                case 1459147392: {
                    v16 = dv.crkw("cscd", crro(int ), (int)141);
                    continue block73;
                }
            }
            break;
        }
        var8_11.pushMatrix();
        if (var9_8 || var9_8) ** GOTO lbl25
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = dv.ge - dv.crkw("csce", crro(int ), (int)142)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == dv.crkw("cscf", crkt(int ), (int)302)) break;
            v17 /* !! */  = (long)dv.crkw("cscg", crkt(int ), (int)303);
        }
        var8_11.translate(var3_3 * var6_9, var4_4 * var6_9);
        if (var9_8 || var9_8) ** GOTO lbl25
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = dv.ge - dv.crkw("csch", crro(int ), (int)143)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == dv.crkw("csci", crkt(int ), (int)304)) break;
            v18 /* !! */  = (long)dv.crkw("cscj", crkt(int ), (int)305);
        }
        var8_11.scale(var7_10, var7_10);
        if (var9_8 || var9_8) ** GOTO lbl25
        v19 = dv.crkw("csck", crkt(int ), (int)306);
        v20 = dv.crkw("cscl", crkt(int ), (int)307);
        v21 /* !! */  = dv.ge;
        if (true) ** GOTO lbl134
        block76: while (true) {
            v21 /* !! */  = (long)(v22 - dv.crkw("cscm", crro(int ), (int)144));
lbl134:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -756908130: {
                    break block76;
                }
                case -133961892: {
                    v22 = dv.crkw("cscn", crro(int ), (int)145);
                    continue block76;
                }
                case 1113865778: {
                    v22 = dv.crkw("csco", crro(int ), (int)146);
                    continue block76;
                }
            }
            break;
        }
        var1_1.method_51427(var2_2, (int)v19, (int)v20);
        if (var9_8 || var9_8) ** GOTO lbl25
        if (var10_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = dv.ge - dv.crkw("cscp", crro(int ), (int)147)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == dv.crkw("cscq", crkt(int ), (int)308)) break;
                    v23 /* !! */  = (long)dv.crkw("cscr", crkt(int ), (int)309);
                }
                var8_11.popMatrix();
                if (var9_8 || var9_8) ** GOTO lbl25
                v24 = dv.crkw("cscs", crkt(int ), (int)310);
                v25 /* !! */  = dv.ge;
                if (true) ** GOTO lbl160
                block78: while (true) {
                    v25 /* !! */  = (long)(v26 - dv.crkw("csct", crro(int ), (int)148));
lbl160:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1404836708: {
                            v26 = dv.crkw("cscu", crro(int ), (int)149);
                            continue block78;
                        }
                        case -756908130: {
                            break block78;
                        }
                        case 201646024: {
                            v26 = dv.crkw("cscv", crro(int ), (int)150);
                            continue block78;
                        }
                    }
                    break;
                }
                dv.queuedItemModels = v24;
                if (var9_8 || var9_8) ** continue;
                return;
            }
            case 0: {
                var10_7 /* !! */  = (int)dv.crkw("cscw", crkt(int ), (int)311);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl177:
            // 2 sources

            case 1: {
                do {
                    var10_7 /* !! */  = (int)dv.crkw("cscx", crkt(int ), (int)312);
                } while (!var11_6);
                throw null;
            }
lbl182:
            // 2 sources

            case 2: {
                var10_7 /* !! */  = (int)dv.crkw("cscy", crkt(int ), (int)313);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 3: {
                var10_7 /* !! */  = (int)dv.crkw("cscz", crkt(int ), (int)314);
                if (!var11_6) break;
                throw null;
            }
lbl191:
            // 2 sources

            case 4: {
                var10_7 /* !! */  = (int)dv.crkw("csda", crkt(int ), (int)315);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 5: {
                var10_7 /* !! */  = (int)dv.crkw("csdb", crkt(int ), (int)316);
                if (var11_6) {
                    throw null;
                }
            }
lbl200:
            // 5 sources

            case 6: {
                var10_7 /* !! */  = (int)dv.crkw("csdc", crkt(int ), (int)317);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 7: {
                var10_7 /* !! */  = (int)dv.crkw("csdd", crkt(int ), (int)318);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 8: {
                var10_7 /* !! */  = (int)dv.crkw("csde", crkt(int ), (int)319);
                if (!var11_6) ** GOTO lbl177
                throw null;
            }
            case 9: {
                var10_7 /* !! */  = (int)dv.crkw("csdf", crkt(int ), (int)320);
                if (!var11_6) break;
                throw null;
            }
            case 10: {
                var10_7 /* !! */  = (int)dv.crkw("csdg", crkt(int ), (int)321);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl223:
            // 2 sources

            case 11: {
                var10_7 /* !! */  = (int)dv.crkw("csdh", crkt(int ), (int)322);
                if (!var11_6) break;
                throw null;
            }
lbl227:
            // 3 sources

            case 12: {
                var10_7 /* !! */  = (int)dv.crkw("csdi", crkt(int ), (int)323);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl232:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_7 /* !! */  = (int)dv.crkw("csdj", crkt(int ), (int)324);
                    if (!var11_6) ** GOTO lbl191
                    throw null;
                }
            }
lbl237:
            // 2 sources

            case 14: {
                var10_7 /* !! */  = (int)dv.crkw("csdk", crkt(int ), (int)325);
                if (!var11_6) ** GOTO lbl182
                throw null;
            }
            case 15: {
                var10_7 /* !! */  = (int)dv.crkw("csdl", crkt(int ), (int)326);
                if (!var11_6) ** GOTO lbl200
                throw null;
            }
lbl245:
            // 3 sources

            case 16: {
                do {
                    var10_7 /* !! */  = (int)dv.crkw("csdm", crkt(int ), (int)327);
                } while (!var11_6);
                throw null;
            }
            case 17: {
                var10_7 /* !! */  = (int)dv.crkw("csdn", crkt(int ), (int)328);
                if (var11_6) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 18: {
                var10_7 /* !! */  = (int)dv.crkw("csdo", crkt(int ), (int)329);
                if (!var11_6) break;
                throw null;
            }
lbl259:
            // 2 sources

            case 19: {
                var10_7 /* !! */  = (int)dv.crkw("csdp", crkt(int ), (int)330);
                if (!var11_6) ** GOTO lbl200
                throw null;
            }
lbl263:
            // 2 sources

            case 20: {
                var10_7 /* !! */  = (int)dv.crkw("csdq", crkt(int ), (int)331);
                if (!var11_6) ** GOTO lbl245
                throw null;
            }
            case 21: 
        }
        var10_7 /* !! */  = (int)dv.crkw("csdr", crkt(int ), (int)332);
        ** while (!var11_6)
lbl270:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int durabilityColor(float var0) {
        block49: {
            block51: {
                v0 /* !! */  = dv.ge;
                if (true) ** GOTO lbl5
                block30: while (true) {
                    v0 /* !! */  = (long)(v1 - dv.crkw("crxg", crro(int ), (int)87));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1396889016: {
                            v1 = dv.crkw("crxh", crro(int ), (int)88);
                            continue block30;
                        }
                        case -1237216389: {
                            v1 = dv.crkw("crxi", crro(int ), (int)89);
                            continue block30;
                        }
                        case -756908130: {
                            break block30;
                        }
                        case 1488227842: {
                            v1 = dv.crkw("crxj", crro(int ), (int)90);
                            continue block30;
                        }
                    }
                    break;
                }
                var3_1 = dv.c;
                while (true) {
                    block50: {
                        if ((v2 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("crxk", crro(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  != dv.crkw("crxl", crkt(int ), (int)229)) break block50;
                        var2_2 /* !! */  = dv.b;
                        v3 /* !! */  = dv.ge;
                        if (true) ** GOTO lbl29
                    }
                    v2 /* !! */  = (long)dv.crkw("crxm", crkt(int ), (int)230);
                }
                block32: while (true) {
                    v3 /* !! */  = (long)(v4 - dv.crkw("crxn", crro(int ), (int)92));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1302714300: {
                            v4 = dv.crkw("crxo", crro(int ), (int)93);
                            continue block32;
                        }
                        case -756908130: {
                            break block32;
                        }
                        case -679810051: {
                            v4 = dv.crkw("crxp", crro(int ), (int)94);
                            continue block32;
                        }
                    }
                    break;
                }
                var1_3 = dv.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                if (!(var0 <= dv.crkw("crxr", crlm(int ), (int)232))) ** GOTO lbl56
                if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl47:
                // 2 sources

                block33: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                if ((v5 /* !! */  = (cfr_temp_2 = dv.ge - dv.crkw("crxs", crro(int ), (int)95)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                                if (v5 /* !! */  == dv.crkw("crxt", crkt(int ), (int)233)) {
                                    return dv.DANGER_COLOR;
                                }
                                v5 /* !! */  = (long)dv.crkw("crxu", crkt(int ), (int)234);
                            }
                        }
lbl56:
                        // 1 sources

                        if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                        if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                        if (!(var0 <= dv.crkw("crxv", crlm(int ), (int)235))) ** GOTO lbl118
                        if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                        v6 /* !! */  = dv.ge;
                        if (true) ** GOTO lbl105
                        case 1: {
                            var2_2 /* !! */  = (int)dv.crkw("cryf", crkt(int ), (int)240);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 0: {
                            var2_2 /* !! */  = (int)dv.crkw("crye", crkt(int ), (int)239);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 2: {
                            var2_2 /* !! */  = (int)dv.crkw("cryg", crkt(int ), (int)241);
                            if (var3_1) {
                                throw null;
                            }
                            break block49;
                        }
                        case 4: {
                            var2_2 /* !! */  = (int)dv.crkw("cryi", crkt(int ), (int)243);
                            cfr_temp_0 = 9;
                            if (!var3_1) continue block33;
                            throw null;
                        }
                        case 5: {
                            do {
                                var2_2 /* !! */  = (int)dv.crkw("cryj", crkt(int ), (int)244);
                            } while (!var3_1);
                            throw null;
                        }
                        case 6: {
                            do {
                                var2_2 /* !! */  = (int)dv.crkw("cryk", crkt(int ), (int)245);
                            } while (!var3_1);
                            throw null;
                        }
                        case 7: {
                            var2_2 /* !! */  = (int)dv.crkw("cryl", crkt(int ), (int)246);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 3: {
                            do {
                                var2_2 /* !! */  = (int)dv.crkw("cryh", crkt(int ), (int)242);
                            } while (!var3_1);
                            throw null;
                        }
                        case 8: {
                            ** break;
                        }
                        case 10: {
                            break block49;
                        }
                        block38: while (true) {
                            v6 /* !! */  = (long)(v7 - dv.crkw("crxw", crro(int ), (int)96));
lbl105:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -2070136145: {
                                    v7 = dv.crkw("crxx", crro(int ), (int)97);
                                    continue block38;
                                }
                                case -2008041365: {
                                    v7 = dv.crkw("crxy", crro(int ), (int)98);
                                    continue block38;
                                }
                                case -1114489615: {
                                    v7 = dv.crkw("crxz", crro(int ), (int)99);
                                    continue block38;
                                }
                                case -756908130: {
                                    return dv.WARNING_COLOR;
                                }
                            }
                            break;
                        }
                        return dv.WARNING_COLOR;
lbl118:
                        // 1 sources

                        if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                        if (var1_3 != false) return (int)dv.crkw("crxq", crkt(int ), (int)231);
                        v8 = dv.crkw("crya", crkt(int ), (int)236);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_3 = dv.ge - dv.crkw("cryb", crro(int ), (int)100)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == dv.crkw("cryc", crkt(int ), (int)237)) {
                                return dz.color((int)v8);
                            }
                            v9 /* !! */  = (long)dv.crkw("cryd", crkt(int ), (int)238);
                        }
lbl127:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)dv.crkw("crym", crkt(int ), (int)247);
                            cfr_temp_0 = 9;
                            if (!var3_1) continue block33;
                            throw null;
                        }
                        case 9: 
                    }
                    break;
                }
                break block51;
                ** while (true)
            }
            var2_2 /* !! */  = (int)dv.crkw("cryn", crkt(int ), (int)248);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)dv.crkw("cryo", crkt(int ), (int)249);
        ** while (!var3_1)
lbl142:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int crkt(int n2) {
        return crku[n2] ^ crkv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void drawEmptyIcon(class_332 var0, ks var1_1, float var2_2, float var3_3, float var4_4) {
        block66: {
            block65: {
                block64: {
                    var15_5 = dv.c;
                    var14_6 /* !! */  = dv.b;
                    var13_7 = dv.a;
                    if (var15_5) {
                        throw null;
lbl6:
                        // 16 sources

                        return;
                    }
                    if (var13_7 || var13_7) ** GOTO lbl6
                    if (var1_1 != null) break block64;
                    if (var13_7) ** GOTO lbl6
                    return;
                }
                if (var13_7 || var13_7) ** GOTO lbl6
                var5_8 = var1_1.getGlyph("a".charAt((int)dv.crkw("csfj", crkt(int ), (int)358)));
                if (var13_7 || var13_7) ** GOTO lbl6
                if (var5_8 == null) break block65;
                if (var13_7) ** GOTO lbl6
                if (!(var5_8.width <= 0.0f)) break block66;
                if (var13_7) ** GOTO lbl6
            }
            if (var13_7 || var13_7) ** GOTO lbl6
            return;
        }
        if (var13_7 || var13_7) ** GOTO lbl6
        var6_9 = dv.crkw("csfk", crlm(int ), (int)359) * var1_1.getEmSize() / var5_8.width;
        if (var13_7 || var13_7) ** GOTO lbl6
        var7_10 = var6_9 / var1_1.getEmSize();
        if (var13_7 || var13_7) ** GOTO lbl6
        var8_11 = var2_2 + dv.crkw("csfl", crlm(int ), (int)360);
        if (var13_7 || var13_7) ** GOTO lbl6
        var9_12 = var3_3 + dv.crkw("csfm", crlm(int ), (int)361);
        if (var13_7 || var13_7) ** GOTO lbl6
        var10_13 = var9_12 - var5_8.height * var7_10 * dv.crkw("csfn", crlm(int ), (int)362);
        if (var13_7 || var13_7) ** GOTO lbl6
        var11_14 = var8_11 - var5_8.bearingX * var7_10;
        if (var13_7 || var13_7) ** GOTO lbl6
        var12_15 = var10_13 - var1_1.getAscender() * var7_10 + var5_8.bearingY * var7_10;
        if (var14_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_7 || var13_7) ** GOTO lbl6
                kq.text(var0, var1_1, "a", var11_14, var12_15, (float)var6_9, nd.multAlpha(dv.EMPTY_COLOR, var4_4), (boolean)dv.crkw("csfo", crkt(int ), (int)363));
                if (!var13_7 && !var13_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var14_6 /* !! */  = (int)dv.crkw("csfp", crkt(int ), (int)364);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_6 /* !! */  = (int)dv.crkw("csfq", crkt(int ), (int)365);
                    if (var15_5) {
                        throw null;
                    }
                    ** GOTO lbl82
                    break;
                }
            }
            case 2: {
                var14_6 /* !! */  = (int)dv.crkw("csfr", crkt(int ), (int)366);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl62:
            // 2 sources

            case 3: {
                var14_6 /* !! */  = (int)dv.crkw("csfs", crkt(int ), (int)367);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 4: {
                var14_6 /* !! */  = (int)dv.crkw("csft", crkt(int ), (int)368);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 5: {
                var14_6 /* !! */  = (int)dv.crkw("csfu", crkt(int ), (int)369);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl77:
            // 4 sources

            case 6: {
                var14_6 /* !! */  = (int)dv.crkw("csfv", crkt(int ), (int)370);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl82:
            // 4 sources

            case 7: {
                var14_6 /* !! */  = (int)dv.crkw("csfw", crkt(int ), (int)371);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 8: {
                var14_6 /* !! */  = (int)dv.crkw("csfx", crkt(int ), (int)372);
                if (!var15_5) ** GOTO lbl82
                throw null;
            }
lbl91:
            // 3 sources

            case 9: {
                var14_6 /* !! */  = (int)dv.crkw("csfy", crkt(int ), (int)373);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl96:
            // 3 sources

            case 10: {
                var14_6 /* !! */  = (int)dv.crkw("csfz", crkt(int ), (int)374);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl101:
            // 4 sources

            case 11: {
                var14_6 /* !! */  = (int)dv.crkw("csga", crkt(int ), (int)375);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl106:
            // 2 sources

            case 12: {
                var14_6 /* !! */  = (int)dv.crkw("csgb", crkt(int ), (int)376);
                if (!var15_5) ** GOTO lbl96
                throw null;
            }
lbl110:
            // 2 sources

            case 13: {
                var14_6 /* !! */  = (int)dv.crkw("csgc", crkt(int ), (int)377);
                if (!var15_5) ** GOTO lbl62
                throw null;
            }
lbl114:
            // 2 sources

            case 14: {
                var14_6 /* !! */  = (int)dv.crkw("csgd", crkt(int ), (int)378);
                if (!var15_5) break;
                throw null;
            }
lbl118:
            // 3 sources

            case 15: {
                var14_6 /* !! */  = (int)dv.crkw("csge", crkt(int ), (int)379);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 16: {
                var14_6 /* !! */  = (int)dv.crkw("csgf", crkt(int ), (int)380);
                if (!var15_5) ** GOTO lbl77
                throw null;
            }
            case 17: {
                var14_6 /* !! */  = (int)dv.crkw("csgg", crkt(int ), (int)381);
                if (!var15_5) ** GOTO lbl82
                throw null;
            }
lbl131:
            // 4 sources

            case 18: {
                var14_6 /* !! */  = (int)dv.crkw("csgh", crkt(int ), (int)382);
                if (var15_5) {
                    throw null;
                }
            }
            case 19: {
                var14_6 /* !! */  = (int)dv.crkw("csgi", crkt(int ), (int)383);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl140:
            // 3 sources

            case 20: {
                var14_6 /* !! */  = (int)dv.crkw("csgj", crkt(int ), (int)384);
                if (!var15_5) ** GOTO lbl131
                throw null;
            }
lbl144:
            // 2 sources

            case 21: {
                var14_6 /* !! */  = (int)dv.crkw("csgk", crkt(int ), (int)385);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 22: {
                var14_6 /* !! */  = (int)dv.crkw("csgl", crkt(int ), (int)386);
                if (!var15_5) ** GOTO lbl101
                throw null;
            }
lbl153:
            // 2 sources

            case 23: {
                var14_6 /* !! */  = (int)dv.crkw("csgm", crkt(int ), (int)387);
                if (!var15_5) ** GOTO lbl110
                throw null;
            }
            case 24: {
                var14_6 /* !! */  = (int)dv.crkw("csgn", crkt(int ), (int)388);
                if (!var15_5) ** GOTO lbl144
                throw null;
            }
            case 25: {
                var14_6 /* !! */  = (int)dv.crkw("csgo", crkt(int ), (int)389);
                if (!var15_5) ** GOTO lbl101
                throw null;
            }
            case 26: {
                var14_6 /* !! */  = (int)dv.crkw("csgp", crkt(int ), (int)390);
                if (!var15_5) ** GOTO lbl77
                throw null;
            }
lbl169:
            // 3 sources

            case 27: {
                var14_6 /* !! */  = (int)dv.crkw("csgq", crkt(int ), (int)391);
                if (!var15_5) ** GOTO lbl118
                throw null;
            }
            case 28: {
                var14_6 /* !! */  = (int)dv.crkw("csgr", crkt(int ), (int)392);
                if (!var15_5) ** GOTO lbl91
                throw null;
            }
            case 29: {
                do {
                    var14_6 /* !! */  = (int)dv.crkw("csgs", crkt(int ), (int)393);
                } while (!var15_5);
                throw null;
            }
            case 30: {
                var14_6 /* !! */  = (int)dv.crkw("csgt", crkt(int ), (int)394);
                if (!var15_5) ** GOTO lbl140
                throw null;
            }
            case 31: 
        }
        var14_6 /* !! */  = (int)dv.crkw("csgu", crkt(int ), (int)395);
        ** while (!var15_5)
lbl189:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void csla() {
        dv.crku[100] = 2129345318;
        dv.crku[101] = -1609898001;
        dv.crku[102] = 51738010;
        dv.crku[103] = 1403397242;
        dv.crku[104] = 680703863;
        dv.crku[105] = -334010784;
        dv.crku[106] = -45331877;
        dv.crku[107] = 1261525801;
        dv.crku[108] = -536349379;
        dv.crku[109] = 1299351324;
        dv.crku[110] = 1138974323;
        dv.crku[111] = 314773490;
        dv.crku[112] = -1725385236;
        dv.crku[113] = -609262772;
        dv.crku[114] = -1018939244;
        dv.crku[115] = 866508453;
        dv.crku[116] = -1011189646;
        dv.crku[117] = 1139036716;
        dv.crku[118] = -154021999;
        dv.crku[119] = 813892825;
        dv.crku[120] = -630386843;
        dv.crku[121] = 486822898;
        dv.crku[122] = 708670627;
        dv.crku[123] = -441765263;
        dv.crku[124] = -883811248;
        dv.crku[125] = 1670334835;
        dv.crku[126] = -185866093;
        dv.crku[127] = -2011346350;
        dv.crku[128] = 178703135;
        dv.crku[129] = 1414382271;
        dv.crku[130] = -1082519567;
        dv.crku[131] = -1407750003;
        dv.crku[132] = -1060217562;
        dv.crku[133] = 500524300;
        dv.crku[134] = -797705588;
        dv.crku[135] = 1373702301;
        dv.crku[136] = -1691264373;
        dv.crku[137] = 819932539;
        dv.crku[138] = 256390112;
        dv.crku[139] = -515732572;
        dv.crku[140] = 1855880085;
        dv.crku[141] = -1740041718;
        dv.crku[142] = 1051495243;
        dv.crku[143] = 336222506;
        dv.crku[144] = 2114429107;
        dv.crku[145] = -1221539086;
        dv.crku[146] = 826855058;
        dv.crku[147] = 1414260037;
        dv.crku[148] = -616142239;
        dv.crku[149] = 506314386;
        dv.crku[150] = 1875846782;
        dv.crku[151] = -436672203;
        dv.crku[152] = -835106779;
        dv.crku[153] = 613179291;
        dv.crku[154] = -437187857;
        dv.crku[155] = 457865580;
        dv.crku[156] = 1648561665;
        dv.crku[157] = 1741518392;
        dv.crku[158] = -1625620069;
        dv.crku[159] = -1167447993;
        dv.crku[160] = 1749314128;
        dv.crku[161] = -691003092;
        dv.crku[162] = 64003345;
        dv.crku[163] = -282487638;
        dv.crku[164] = 885508622;
        dv.crku[165] = -1007943463;
        dv.crku[166] = -1883819395;
        dv.crku[167] = -1576424057;
        dv.crku[168] = 1053866064;
        dv.crku[169] = 792195920;
        dv.crku[170] = -85683570;
        dv.crku[171] = 606425130;
        dv.crku[172] = 917982377;
        dv.crku[173] = -100283740;
        dv.crku[174] = -1880677866;
        dv.crku[175] = -623904612;
        dv.crku[176] = 773263283;
        dv.crku[177] = 861496102;
        dv.crku[178] = 1152265281;
        dv.crku[179] = 624960922;
        dv.crku[180] = -1774079260;
        dv.crku[181] = 437167766;
        dv.crku[182] = -462407199;
        dv.crku[183] = 1031145363;
        dv.crku[184] = 1952370932;
        dv.crku[185] = -223481364;
        dv.crku[186] = 778110811;
        dv.crku[187] = -736097806;
        dv.crku[188] = -1136644074;
        dv.crku[189] = -479800826;
        dv.crku[190] = 288940576;
        dv.crku[191] = 417357666;
        dv.crku[192] = -1709763347;
        dv.crku[193] = 676234954;
        dv.crku[194] = 1891584296;
        dv.crku[195] = -858355238;
        dv.crku[196] = 931441362;
        dv.crku[197] = -900525667;
        dv.crku[198] = -911161000;
        dv.crku[199] = -382223711;
    }

    private static /* synthetic */ void cslh() {
        dv.crkv[300] = 340276764;
        dv.crkv[301] = -16706409;
        dv.crkv[302] = -2028954879;
        dv.crkv[303] = 1343975627;
        dv.crkv[304] = -1315325547;
        dv.crkv[305] = -1679697663;
        dv.crkv[306] = -1499080955;
        dv.crkv[307] = -1657065919;
        dv.crkv[308] = -1651899214;
        dv.crkv[309] = -471341914;
        dv.crkv[310] = -479627878;
        dv.crkv[311] = -518986270;
        dv.crkv[312] = 357226242;
        dv.crkv[313] = -1758187408;
        dv.crkv[314] = 789750808;
        dv.crkv[315] = -2039990349;
        dv.crkv[316] = -1781843945;
        dv.crkv[317] = -762975814;
        dv.crkv[318] = 1817084938;
        dv.crkv[319] = 994930636;
        dv.crkv[320] = -1393169147;
        dv.crkv[321] = -1081085973;
        dv.crkv[322] = -799706378;
        dv.crkv[323] = 1220218900;
        dv.crkv[324] = -567375563;
        dv.crkv[325] = 1366173784;
        dv.crkv[326] = 1779206875;
        dv.crkv[327] = -1405290171;
        dv.crkv[328] = 1768429628;
        dv.crkv[329] = 866680383;
        dv.crkv[330] = -1290084367;
        dv.crkv[331] = 750821294;
        dv.crkv[332] = -740053681;
        dv.crkv[333] = -851251024;
        dv.crkv[334] = 680971089;
        dv.crkv[335] = -1246309406;
        dv.crkv[336] = 665149185;
        dv.crkv[337] = -551465801;
        dv.crkv[338] = 269688538;
        dv.crkv[339] = -1222423645;
        dv.crkv[340] = -2022446252;
        dv.crkv[341] = 2000449891;
        dv.crkv[342] = -1368309607;
        dv.crkv[343] = 1239448048;
        dv.crkv[344] = 534792379;
        dv.crkv[345] = 158771460;
        dv.crkv[346] = 1324264171;
        dv.crkv[347] = 1556356275;
        dv.crkv[348] = 304776147;
        dv.crkv[349] = 1381050242;
        dv.crkv[350] = -1073331859;
        dv.crkv[351] = 1164947575;
        dv.crkv[352] = -1251712028;
        dv.crkv[353] = -689045147;
        dv.crkv[354] = 537038903;
        dv.crkv[355] = -1309763338;
        dv.crkv[356] = 1557862611;
        dv.crkv[357] = -547831741;
        dv.crkv[358] = -1083180426;
        dv.crkv[359] = 515928125;
        dv.crkv[360] = -2142930322;
        dv.crkv[361] = -427250606;
        dv.crkv[362] = -390548585;
        dv.crkv[363] = 1739984548;
        dv.crkv[364] = 1517123347;
        dv.crkv[365] = 658544214;
        dv.crkv[366] = -118320067;
        dv.crkv[367] = -1685309232;
        dv.crkv[368] = -1767974237;
        dv.crkv[369] = 851780903;
        dv.crkv[370] = -1328113144;
        dv.crkv[371] = 1140154632;
        dv.crkv[372] = 1006196670;
        dv.crkv[373] = 1795127515;
        dv.crkv[374] = -247286303;
        dv.crkv[375] = 1437464824;
        dv.crkv[376] = -2143457232;
        dv.crkv[377] = -1081844701;
        dv.crkv[378] = -304501866;
        dv.crkv[379] = -706896975;
        dv.crkv[380] = -1315245910;
        dv.crkv[381] = -544036875;
        dv.crkv[382] = 386455208;
        dv.crkv[383] = -120433677;
        dv.crkv[384] = 1279194036;
        dv.crkv[385] = 1327611243;
        dv.crkv[386] = 686090339;
        dv.crkv[387] = 1530102446;
        dv.crkv[388] = 164274146;
        dv.crkv[389] = 457390570;
        dv.crkv[390] = 164361007;
        dv.crkv[391] = -1398920762;
        dv.crkv[392] = -709159611;
        dv.crkv[393] = -928429690;
        dv.crkv[394] = -1278453978;
        dv.crkv[395] = -109797610;
        dv.crkv[396] = 1249001828;
        dv.crkv[397] = -448110285;
        dv.crkv[398] = -1749103292;
        dv.crkv[399] = 2130587790;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dv() {
        var2_1 /* !! */  = dv.b;
        super("ArmorHud", (int)dv.crkw("crkx", crkt(int ), (int)0), (int)dv.crkw("crky", crkt(int ), (int)1), (int)Math.ceil((double)dv.crkw("crlc", crkz(int ), (int)0)), (int)Math.ceil((double)dv.crkw("crld", crkz(int ), (int)1)), (boolean)dv.crkw("crle", crkt(int ), (int)2));
        this.animatedDurability = new EnumMap<class_1304, Float>(class_1304.class);
        this.armorBuffer = new class_1799[dv.SLOTS.length];
        this.lastFrame = System.nanoTime();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)dv.crkw("crlf", crkt(int ), (int)3);
                ** GOTO lbl16
            }
            case 1: {
                var2_1 /* !! */  = (int)dv.crkw("crlg", crkt(int ), (int)4);
                ** GOTO lbl10
            }
lbl16:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)dv.crkw("crlh", crkt(int ), (int)5);
                break;
            }
            case 3: {
                var2_1 /* !! */  = (int)dv.crkw("crli", crkt(int ), (int)6);
                break;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)dv.crkw("crlj", crkt(int ), (int)7);
                    ** GOTO lbl10
                    break;
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)dv.crkw("crlk", crkt(int ), (int)8);
        ** while (true)
    }

    private static /* synthetic */ void cslc() {
        dv.crku[300] = 511450825;
        dv.crku[301] = -1098836841;
        dv.crku[302] = 2028954878;
        dv.crku[303] = -1459385876;
        dv.crku[304] = 1315325546;
        dv.crku[305] = -296934327;
        dv.crku[306] = -1499080955;
        dv.crku[307] = -1657065919;
        dv.crku[308] = 1651899213;
        dv.crku[309] = 65047208;
        dv.crku[310] = -479627877;
        dv.crku[311] = -518986257;
        dv.crku[312] = 357226251;
        dv.crku[313] = -1758187420;
        dv.crku[314] = 789750808;
        dv.crku[315] = -2039990348;
        dv.crku[316] = -1781843949;
        dv.crku[317] = -762975819;
        dv.crku[318] = 1817084936;
        dv.crku[319] = 994930648;
        dv.crku[320] = -1393169152;
        dv.crku[321] = -1081085971;
        dv.crku[322] = -799706378;
        dv.crku[323] = 1220218908;
        dv.crku[324] = -567375553;
        dv.crku[325] = 1366173778;
        dv.crku[326] = 1779206858;
        dv.crku[327] = -1405290172;
        dv.crku[328] = 1768429615;
        dv.crku[329] = 866680369;
        dv.crku[330] = -1290084355;
        dv.crku[331] = 750821283;
        dv.crku[332] = -740053682;
        dv.crku[333] = -851251023;
        dv.crku[334] = -1975193845;
        dv.crku[335] = -1246309405;
        dv.crku[336] = 665149185;
        dv.crku[337] = 551465800;
        dv.crku[338] = -895062692;
        dv.crku[339] = -1222423644;
        dv.crku[340] = -2022446251;
        dv.crku[341] = 2000449890;
        dv.crku[342] = -1368309606;
        dv.crku[343] = 1239448048;
        dv.crku[344] = 534792377;
        dv.crku[345] = 158771459;
        dv.crku[346] = 1324264171;
        dv.crku[347] = 1556356274;
        dv.crku[348] = -361834939;
        dv.crku[349] = -1381050243;
        dv.crku[350] = 979412893;
        dv.crku[351] = 1164947574;
        dv.crku[352] = -1251712031;
        dv.crku[353] = -689045148;
        dv.crku[354] = 537038902;
        dv.crku[355] = -1309763342;
        dv.crku[356] = 1557862615;
        dv.crku[357] = -547831743;
        dv.crku[358] = -1083180426;
        dv.crku[359] = 1607493011;
        dv.crku[360] = -1058689740;
        dv.crku[361] = -1484260099;
        dv.crku[362] = -675761257;
        dv.crku[363] = 1739984548;
        dv.crku[364] = 1517123343;
        dv.crku[365] = 658544194;
        dv.crku[366] = -118320080;
        dv.crku[367] = -1685309231;
        dv.crku[368] = -1767974238;
        dv.crku[369] = 851780927;
        dv.crku[370] = -1328113137;
        dv.crku[371] = 1140154638;
        dv.crku[372] = 1006196648;
        dv.crku[373] = 1795127499;
        dv.crku[374] = -247286283;
        dv.crku[375] = 1437464811;
        dv.crku[376] = -2143457224;
        dv.crku[377] = -1081844677;
        dv.crku[378] = -304501875;
        dv.crku[379] = -706896973;
        dv.crku[380] = -1315245898;
        dv.crku[381] = -544036875;
        dv.crku[382] = 386455227;
        dv.crku[383] = -120433691;
        dv.crku[384] = 1279194021;
        dv.crku[385] = 1327611238;
        dv.crku[386] = 686090362;
        dv.crku[387] = 1530102452;
        dv.crku[388] = 164274145;
        dv.crku[389] = 457390565;
        dv.crku[390] = 164361000;
        dv.crku[391] = -1398920738;
        dv.crku[392] = -709159588;
        dv.crku[393] = -928429677;
        dv.crku[394] = -1278453979;
        dv.crku[395] = -109797621;
        dv.crku[396] = 1249001829;
        dv.crku[397] = -760734698;
        dv.crku[398] = -720425479;
        dv.crku[399] = 1061022138;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean consumeQueuedItemModels() {
        v0 /* !! */  = dv.ge;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(dv.crkw("csdt", crro(int ), (int)152) - dv.crkw("csds", crro(int ), (int)151));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2018118207: {
                    continue block26;
                }
                case -756908130: {
                    break block26;
                }
            }
            break;
        }
        var3 = dv.c;
        v1 /* !! */  = dv.ge;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - dv.crkw("csdu", crro(int ), (int)153));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1821865801: {
                    v2 = dv.crkw("csdv", crro(int ), (int)154);
                    continue block27;
                }
                case -1111048580: {
                    v2 = dv.crkw("csdw", crro(int ), (int)155);
                    continue block27;
                }
                case -756908130: {
                    break block27;
                }
                case 2028485764: {
                    v2 = dv.crkw("csdx", crro(int ), (int)156);
                    continue block27;
                }
            }
            break;
        }
        var2_1 /* !! */  = dv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = dv.ge - dv.crkw("csdy", crro(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dv.crkw("csdz", crkt(int ), (int)333)) break;
            v3 /* !! */  = (long)dv.crkw("csea", crkt(int ), (int)334);
        }
        var1_2 = dv.a;
        if (var3) {
            throw null;
lbl36:
            // 4 sources

            return (boolean)dv.crkw("cseb", crkt(int ), (int)335);
        }
        if (var1_2 || var1_2) ** GOTO lbl36
        v4 /* !! */  = dv.ge;
        if (true) ** GOTO lbl43
        block30: while (true) {
            v4 /* !! */  = (long)(v5 - dv.crkw("csec", crro(int ), (int)158));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2096932954: {
                    v5 = dv.crkw("csed", crro(int ), (int)159);
                    continue block30;
                }
                case -1945348846: {
                    v5 = dv.crkw("csee", crro(int ), (int)160);
                    continue block30;
                }
                case -1213291827: {
                    v5 = dv.crkw("csef", crro(int ), (int)161);
                    continue block30;
                }
                case -756908130: {
                    break block30;
                }
            }
            break;
        }
        var0_3 = dv.queuedItemModels;
        if (var1_2 || var1_2) ** GOTO lbl36
        v6 = dv.crkw("cseg", crkt(int ), (int)336);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = dv.ge - dv.crkw("cseh", crro(int ), (int)162)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == dv.crkw("csei", crkt(int ), (int)337)) break;
            v7 /* !! */  = (long)dv.crkw("csej", crkt(int ), (int)338);
        }
        dv.queuedItemModels = v6;
        if (var1_2) ** GOTO lbl36
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_2) ** break;
                ** continue;
                return var0_3;
            }
            case 0: {
                var2_1 /* !! */  = (int)dv.crkw("csek", crkt(int ), (int)339);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl76:
            // 2 sources

            case 1: {
                do {
                    var2_1 /* !! */  = (int)dv.crkw("csel", crkt(int ), (int)340);
                } while (!var3);
                throw null;
            }
            case 2: {
                do {
                    var2_1 /* !! */  = (int)dv.crkw("csem", crkt(int ), (int)341);
                } while (!var3);
                throw null;
            }
lbl86:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)dv.crkw("csen", crkt(int ), (int)342);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 4: {
                var2_1 /* !! */  = (int)dv.crkw("cseo", crkt(int ), (int)343);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 5: {
                var2_1 /* !! */  = (int)dv.crkw("csep", crkt(int ), (int)344);
                if (!var3) ** GOTO lbl86
                throw null;
            }
lbl100:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)dv.crkw("cseq", crkt(int ), (int)345);
                if (!var3) ** GOTO lbl76
                throw null;
            }
            case 7: 
        }
        do {
            var2_1 /* !! */  = (int)dv.crkw("cser", crkt(int ), (int)346);
        } while (!var3);
        throw null;
    }

    private static /* synthetic */ void csle() {
        dv.crkv[0] = -1641438055;
        dv.crkv[1] = 824977409;
        dv.crkv[2] = 1675642917;
        dv.crkv[3] = -1599584219;
        dv.crkv[4] = -1507741362;
        dv.crkv[5] = 2060671083;
        dv.crkv[6] = -2052394986;
        dv.crkv[7] = 2069576625;
        dv.crkv[8] = 458355805;
        dv.crkv[9] = 453627198;
        dv.crkv[10] = 1882728149;
        dv.crkv[11] = -37148016;
        dv.crkv[12] = -199007726;
        dv.crkv[13] = -346508955;
        dv.crkv[14] = 838200761;
        dv.crkv[15] = 2066301003;
        dv.crkv[16] = 1537319476;
        dv.crkv[17] = 1003750837;
        dv.crkv[18] = 353509260;
        dv.crkv[19] = 211683528;
        dv.crkv[20] = -451138468;
        dv.crkv[21] = -1890805884;
        dv.crkv[22] = 771123633;
        dv.crkv[23] = 1829773440;
        dv.crkv[24] = 311302575;
        dv.crkv[25] = 1513411871;
        dv.crkv[26] = 96139193;
        dv.crkv[27] = 1411858276;
        dv.crkv[28] = -763334105;
        dv.crkv[29] = -1546907949;
        dv.crkv[30] = -1988400945;
        dv.crkv[31] = -1652567554;
        dv.crkv[32] = -1096632082;
        dv.crkv[33] = -258625872;
        dv.crkv[34] = 1541645872;
        dv.crkv[35] = -717324074;
        dv.crkv[36] = 175073774;
        dv.crkv[37] = -1012553584;
        dv.crkv[38] = 1259285722;
        dv.crkv[39] = 239749654;
        dv.crkv[40] = -937280344;
        dv.crkv[41] = -1359649193;
        dv.crkv[42] = 1470545539;
        dv.crkv[43] = 1339822449;
        dv.crkv[44] = -397459387;
        dv.crkv[45] = 610579579;
        dv.crkv[46] = 141798860;
        dv.crkv[47] = -644036033;
        dv.crkv[48] = 1707549930;
        dv.crkv[49] = -1321307450;
        dv.crkv[50] = -446744138;
        dv.crkv[51] = -713449492;
        dv.crkv[52] = -1922677168;
        dv.crkv[53] = -1387197094;
        dv.crkv[54] = 155692116;
        dv.crkv[55] = 1323810963;
        dv.crkv[56] = 892423059;
        dv.crkv[57] = -1725496842;
        dv.crkv[58] = -629395262;
        dv.crkv[59] = -691556891;
        dv.crkv[60] = 150696009;
        dv.crkv[61] = -588515978;
        dv.crkv[62] = 1900778581;
        dv.crkv[63] = -1548601265;
        dv.crkv[64] = 838847189;
        dv.crkv[65] = -2024858208;
        dv.crkv[66] = -1037998317;
        dv.crkv[67] = 779585628;
        dv.crkv[68] = 2073568253;
        dv.crkv[69] = 1232864029;
        dv.crkv[70] = -1200607387;
        dv.crkv[71] = -734340521;
        dv.crkv[72] = 1993421754;
        dv.crkv[73] = -1219567676;
        dv.crkv[74] = 2019468555;
        dv.crkv[75] = 1629212724;
        dv.crkv[76] = -632989873;
        dv.crkv[77] = -914744034;
        dv.crkv[78] = -1843845297;
        dv.crkv[79] = 705199535;
        dv.crkv[80] = -1599859555;
        dv.crkv[81] = -2035894490;
        dv.crkv[82] = 570942077;
        dv.crkv[83] = -2006871371;
        dv.crkv[84] = -136446284;
        dv.crkv[85] = 1492223824;
        dv.crkv[86] = 1748850833;
        dv.crkv[87] = -1060354045;
        dv.crkv[88] = -2108567635;
        dv.crkv[89] = -87835700;
        dv.crkv[90] = 108544306;
        dv.crkv[91] = 639889933;
        dv.crkv[92] = 1674628022;
        dv.crkv[93] = -1591410933;
        dv.crkv[94] = -1169230625;
        dv.crkv[95] = 1278696992;
        dv.crkv[96] = 320717165;
        dv.crkv[97] = 1854542721;
        dv.crkv[98] = 1875498855;
        dv.crkv[99] = 1780243914;
    }
}

