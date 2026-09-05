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
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.nm;
import ruhack.phobia.ov;
import ruhack.phobia.ow;
import ruhack.phobia.oy;

public final class if
extends hx {
    private int targetId;
    private long catchupUntil;
    private float catchupStrength;
    private float sampledError;
    private float wantedDepthOffset;
    private long nextPointChange;
    private long missStartedAt;
    private float wantedNoisePitch;
    private float lateralOffset;
    public static final int b;
    private float noisePitch;
    private float humanPace;
    private float missYawOffset;
    private float depthOffset;
    private long lastFrameNanos;
    private long nextNoiseChange;
    private static int[] ffjw;
    private float noiseYaw;
    private long nextPaceChange;
    private float heightOffset;
    private float missPitchOffset;
    private static int[] ffjx;
    private float pitchMouseRemainder;
    private boolean missSwingReady;
    private float yawVelocity;
    private float wantedHeightOffset;
    private float wantedLateralOffset;
    private static long[] ffmy;
    private float yawMouseRemainder;
    protected static final long lu = -3950100906493583760L;
    private float pitchVelocity;
    private boolean missActive;
    private long nextMissAt;
    private long nextCatchupAllowed;
    public static final boolean a;
    public static final boolean c;
    private float wantedNoiseYaw;
    private static long[] ffnb;
    private float wantedHumanPace;

    private static /* synthetic */ double ffmw(int n2) {
        return Double.longBitsToDouble(ffmy[n2] ^ ffnb[n2]);
    }

    private static /* synthetic */ void fihd() {
        if.ffjw[300] = 1594579848;
        if.ffjw[301] = 39928418;
        if.ffjw[302] = 467658910;
        if.ffjw[303] = -279303366;
        if.ffjw[304] = 1611074485;
        if.ffjw[305] = 1063076329;
        if.ffjw[306] = -829239840;
        if.ffjw[307] = 368106524;
        if.ffjw[308] = 1197809413;
        if.ffjw[309] = 843533641;
        if.ffjw[310] = -1970521408;
        if.ffjw[311] = -836959272;
        if.ffjw[312] = -1800688754;
        if.ffjw[313] = -1546523689;
        if.ffjw[314] = 32672294;
        if.ffjw[315] = -1084647446;
        if.ffjw[316] = -18315673;
        if.ffjw[317] = 852610543;
        if.ffjw[318] = 845996664;
        if.ffjw[319] = 1530741063;
        if.ffjw[320] = 1611861712;
        if.ffjw[321] = -106088949;
        if.ffjw[322] = -542865245;
        if.ffjw[323] = -1580607712;
        if.ffjw[324] = 448656787;
        if.ffjw[325] = 155723165;
        if.ffjw[326] = -1333528802;
        if.ffjw[327] = -848061028;
        if.ffjw[328] = -1049450278;
        if.ffjw[329] = 1408244402;
        if.ffjw[330] = -1285553048;
        if.ffjw[331] = -489604194;
        if.ffjw[332] = -1333378222;
        if.ffjw[333] = 1201895989;
        if.ffjw[334] = 1832359950;
        if.ffjw[335] = 964730169;
        if.ffjw[336] = -1378735708;
        if.ffjw[337] = -398592694;
        if.ffjw[338] = 268088443;
        if.ffjw[339] = 1675375116;
        if.ffjw[340] = 1807266172;
        if.ffjw[341] = -1462468090;
        if.ffjw[342] = 999413981;
        if.ffjw[343] = -723565861;
        if.ffjw[344] = -1870627100;
        if.ffjw[345] = 1428207581;
        if.ffjw[346] = 1097531273;
        if.ffjw[347] = -377183078;
        if.ffjw[348] = 1261191607;
        if.ffjw[349] = -878375076;
        if.ffjw[350] = 1209435804;
        if.ffjw[351] = 1829759261;
        if.ffjw[352] = 906243207;
        if.ffjw[353] = -2128578213;
        if.ffjw[354] = 1779332090;
        if.ffjw[355] = 1519987611;
        if.ffjw[356] = -1170961170;
        if.ffjw[357] = -2054949743;
        if.ffjw[358] = 818097480;
        if.ffjw[359] = -1252134385;
        if.ffjw[360] = -1979716493;
        if.ffjw[361] = 1928753147;
        if.ffjw[362] = -1413013441;
        if.ffjw[363] = 2101100773;
        if.ffjw[364] = -984747147;
        if.ffjw[365] = -706410893;
        if.ffjw[366] = 1752269503;
        if.ffjw[367] = 381191300;
        if.ffjw[368] = -1607656243;
        if.ffjw[369] = 1029539504;
        if.ffjw[370] = 483299265;
        if.ffjw[371] = 1339899566;
        if.ffjw[372] = -2146215004;
        if.ffjw[373] = -1783271486;
        if.ffjw[374] = -938057650;
        if.ffjw[375] = 2134238007;
        if.ffjw[376] = 1895288020;
        if.ffjw[377] = -1181482745;
        if.ffjw[378] = 1422374689;
        if.ffjw[379] = -1056328160;
        if.ffjw[380] = -1546881147;
        if.ffjw[381] = 1665747684;
        if.ffjw[382] = -344412043;
        if.ffjw[383] = -296910589;
        if.ffjw[384] = 1516786625;
        if.ffjw[385] = 1719089856;
        if.ffjw[386] = 598816200;
        if.ffjw[387] = 685518547;
        if.ffjw[388] = -1624103685;
        if.ffjw[389] = 1626132418;
        if.ffjw[390] = 1727880738;
        if.ffjw[391] = 2029233742;
        if.ffjw[392] = -1662982092;
        if.ffjw[393] = 585297508;
        if.ffjw[394] = 1822694098;
        if.ffjw[395] = 703886953;
        if.ffjw[396] = -726738715;
        if.ffjw[397] = -1647474462;
        if.ffjw[398] = -2075076888;
        if.ffjw[399] = 1563960732;
    }

    private static /* synthetic */ void figi() {
        if.ffjw[200] = 1457397192;
        if.ffjw[201] = 1947997280;
        if.ffjw[202] = -49428724;
        if.ffjw[203] = 2100076507;
        if.ffjw[204] = 1474506131;
        if.ffjw[205] = 1436462217;
        if.ffjw[206] = 894179304;
        if.ffjw[207] = -508433552;
        if.ffjw[208] = -803458727;
        if.ffjw[209] = 583713775;
        if.ffjw[210] = -101980852;
        if.ffjw[211] = -408868240;
        if.ffjw[212] = 1618720022;
        if.ffjw[213] = -1727252233;
        if.ffjw[214] = -1175847801;
        if.ffjw[215] = 221461524;
        if.ffjw[216] = -1566704305;
        if.ffjw[217] = -647270373;
        if.ffjw[218] = 81905141;
        if.ffjw[219] = 1035411557;
        if.ffjw[220] = -1470713360;
        if.ffjw[221] = -775842657;
        if.ffjw[222] = 571540779;
        if.ffjw[223] = 1062422530;
        if.ffjw[224] = -2068387758;
        if.ffjw[225] = 1212858681;
        if.ffjw[226] = -1355942853;
        if.ffjw[227] = 682990087;
        if.ffjw[228] = -1527726553;
        if.ffjw[229] = 370628397;
        if.ffjw[230] = -515452629;
        if.ffjw[231] = -1741350706;
        if.ffjw[232] = 604821449;
        if.ffjw[233] = 1424511947;
        if.ffjw[234] = -1660143224;
        if.ffjw[235] = 1638170257;
        if.ffjw[236] = -1748052277;
        if.ffjw[237] = -1917369825;
        if.ffjw[238] = 18797347;
        if.ffjw[239] = 954989677;
        if.ffjw[240] = -1747774883;
        if.ffjw[241] = 1933765046;
        if.ffjw[242] = -1893266582;
        if.ffjw[243] = -797155655;
        if.ffjw[244] = 392725967;
        if.ffjw[245] = 428895850;
        if.ffjw[246] = 1018938288;
        if.ffjw[247] = -2061588399;
        if.ffjw[248] = -2001676501;
        if.ffjw[249] = -58454177;
        if.ffjw[250] = -374020670;
        if.ffjw[251] = -1037519869;
        if.ffjw[252] = -1241472770;
        if.ffjw[253] = -510086156;
        if.ffjw[254] = 424595388;
        if.ffjw[255] = 1132072347;
        if.ffjw[256] = -1162740932;
        if.ffjw[257] = 76961679;
        if.ffjw[258] = 489345859;
        if.ffjw[259] = 1741175473;
        if.ffjw[260] = 732373921;
        if.ffjw[261] = -1759065827;
        if.ffjw[262] = 1027101749;
        if.ffjw[263] = 242473234;
        if.ffjw[264] = -9861148;
        if.ffjw[265] = 178960009;
        if.ffjw[266] = 689785296;
        if.ffjw[267] = -1983566495;
        if.ffjw[268] = 946150564;
        if.ffjw[269] = 2041344952;
        if.ffjw[270] = -694863190;
        if.ffjw[271] = 1518224942;
        if.ffjw[272] = -1573548653;
        if.ffjw[273] = -1823904127;
        if.ffjw[274] = 1386717534;
        if.ffjw[275] = 2025562857;
        if.ffjw[276] = 1675431746;
        if.ffjw[277] = -1368080973;
        if.ffjw[278] = -283983635;
        if.ffjw[279] = 208065759;
        if.ffjw[280] = -547826432;
        if.ffjw[281] = 990760073;
        if.ffjw[282] = -2034156377;
        if.ffjw[283] = -1060625605;
        if.ffjw[284] = -176810208;
        if.ffjw[285] = -2113445605;
        if.ffjw[286] = -925658635;
        if.ffjw[287] = 1085814106;
        if.ffjw[288] = -564946;
        if.ffjw[289] = -51869299;
        if.ffjw[290] = -668131955;
        if.ffjw[291] = -133871194;
        if.ffjw[292] = 788778685;
        if.ffjw[293] = -547971681;
        if.ffjw[294] = 1819288168;
        if.ffjw[295] = -2123989632;
        if.ffjw[296] = -370810337;
        if.ffjw[297] = 695663506;
        if.ffjw[298] = -798078474;
        if.ffjw[299] = 1188577759;
    }

    private static /* synthetic */ void fije() {
        if.ffjx[500] = 1887015252;
        if.ffjx[501] = 771705724;
        if.ffjx[502] = -643908111;
        if.ffjx[503] = 1367154258;
        if.ffjx[504] = -1642282736;
        if.ffjx[505] = -1124787089;
        if.ffjx[506] = -152773990;
        if.ffjx[507] = 1821157736;
        if.ffjx[508] = -823648771;
        if.ffjx[509] = 943118714;
        if.ffjx[510] = 1039248236;
        if.ffjx[511] = -24993942;
        if.ffjx[512] = 1055598185;
        if.ffjx[513] = -1503139989;
        if.ffjx[514] = 1531486905;
        if.ffjx[515] = -949828856;
        if.ffjx[516] = 231367419;
        if.ffjx[517] = 1507556503;
        if.ffjx[518] = -2113807290;
        if.ffjx[519] = -922409594;
        if.ffjx[520] = 1411894556;
        if.ffjx[521] = -1190122567;
        if.ffjx[522] = -1837618292;
        if.ffjx[523] = -2109804618;
        if.ffjx[524] = 452776819;
        if.ffjx[525] = 1866435019;
        if.ffjx[526] = 580109092;
        if.ffjx[527] = 440814379;
        if.ffjx[528] = -2058040783;
        if.ffjx[529] = -415006460;
        if.ffjx[530] = 256341885;
        if.ffjx[531] = -1588714754;
        if.ffjx[532] = -335516060;
        if.ffjx[533] = -1893725204;
        if.ffjx[534] = 1135065811;
        if.ffjx[535] = 1903360299;
        if.ffjx[536] = -1033401768;
        if.ffjx[537] = -1779195747;
        if.ffjx[538] = 484928386;
        if.ffjx[539] = -1751061441;
        if.ffjx[540] = -599254162;
        if.ffjx[541] = 1159398968;
        if.ffjx[542] = -623812821;
        if.ffjx[543] = -1858514608;
        if.ffjx[544] = -1171195305;
        if.ffjx[545] = -1641162938;
        if.ffjx[546] = 1809927502;
        if.ffjx[547] = -1489618546;
        if.ffjx[548] = -693505092;
        if.ffjx[549] = 572649825;
        if.ffjx[550] = -936487700;
        if.ffjx[551] = -45148068;
        if.ffjx[552] = -1559873132;
        if.ffjx[553] = 662374466;
        if.ffjx[554] = 1141442295;
        if.ffjx[555] = -1262659682;
        if.ffjx[556] = 456410498;
        if.ffjx[557] = -77340077;
        if.ffjx[558] = -2070468261;
        if.ffjx[559] = 1131673704;
        if.ffjx[560] = 549387643;
        if.ffjx[561] = -1488565630;
        if.ffjx[562] = -331733439;
        if.ffjx[563] = 778308343;
        if.ffjx[564] = 2057961131;
        if.ffjx[565] = -1894790312;
        if.ffjx[566] = -1940477039;
        if.ffjx[567] = -629394972;
        if.ffjx[568] = 1846358681;
        if.ffjx[569] = -392263863;
        if.ffjx[570] = 242761401;
        if.ffjx[571] = -129981290;
        if.ffjx[572] = -84798840;
        if.ffjx[573] = 1219674701;
        if.ffjx[574] = -449591123;
        if.ffjx[575] = 1773954296;
        if.ffjx[576] = -1982308818;
        if.ffjx[577] = -245130133;
        if.ffjx[578] = 1971858745;
        if.ffjx[579] = 786651472;
        if.ffjx[580] = -257038070;
        if.ffjx[581] = 506994021;
        if.ffjx[582] = -599398695;
        if.ffjx[583] = 452187605;
        if.ffjx[584] = 1724074163;
        if.ffjx[585] = 1053581130;
        if.ffjx[586] = 1758673830;
        if.ffjx[587] = -1961143514;
        if.ffjx[588] = 741879083;
        if.ffjx[589] = -135417753;
        if.ffjx[590] = -403144043;
        if.ffjx[591] = 1901351014;
        if.ffjx[592] = -1855452584;
        if.ffjx[593] = -562201484;
        if.ffjx[594] = -1230794472;
        if.ffjx[595] = -1833649536;
        if.ffjx[596] = -1084523724;
        if.ffjx[597] = 1870388765;
        if.ffjx[598] = 297668369;
        if.ffjx[599] = -1985098696;
    }

    static {
        ffjw = new int[710];
        ffjx = new int[710];
        if.fifo();
        if.fifp();
        if.figi();
        if.fihd();
        if.fihw();
        if.fiik();
        if.fiiu();
        if.fiiw();
        if.fiix();
        if.fiiy();
        if.fijb();
        if.fijc();
        if.fijd();
        if.fije();
        if.fijf();
        if.fijg();
        ffmy = new long[274];
        ffnb = new long[274];
        if.fijh();
        if.fiji();
        if.fijj();
        if.fijk();
        if.fijl();
        if.fijm();
    }

    private static /* synthetic */ void fifo() {
        if.ffjw[0] = 157078341;
        if.ffjw[1] = 190410077;
        if.ffjw[2] = -6749274;
        if.ffjw[3] = -365539413;
        if.ffjw[4] = -1140825366;
        if.ffjw[5] = 954519395;
        if.ffjw[6] = -351603383;
        if.ffjw[7] = 408710616;
        if.ffjw[8] = 1846779757;
        if.ffjw[9] = 1154150332;
        if.ffjw[10] = -681446298;
        if.ffjw[11] = -1092613522;
        if.ffjw[12] = -771416178;
        if.ffjw[13] = -775315516;
        if.ffjw[14] = -1524737515;
        if.ffjw[15] = -1408598865;
        if.ffjw[16] = -1874444777;
        if.ffjw[17] = 1531631145;
        if.ffjw[18] = -370113500;
        if.ffjw[19] = -375911736;
        if.ffjw[20] = -1945199629;
        if.ffjw[21] = 1315971725;
        if.ffjw[22] = 959675386;
        if.ffjw[23] = 2143330110;
        if.ffjw[24] = 666156300;
        if.ffjw[25] = 334837802;
        if.ffjw[26] = 544272175;
        if.ffjw[27] = 230952349;
        if.ffjw[28] = 2053961611;
        if.ffjw[29] = -1409209719;
        if.ffjw[30] = -1848332078;
        if.ffjw[31] = 446481308;
        if.ffjw[32] = 1878754737;
        if.ffjw[33] = -1717532465;
        if.ffjw[34] = 109362857;
        if.ffjw[35] = 905241621;
        if.ffjw[36] = 1868675817;
        if.ffjw[37] = 59234903;
        if.ffjw[38] = 949742459;
        if.ffjw[39] = 1279500646;
        if.ffjw[40] = -2019236760;
        if.ffjw[41] = 2136091252;
        if.ffjw[42] = -2105986796;
        if.ffjw[43] = 1323346994;
        if.ffjw[44] = -261889894;
        if.ffjw[45] = -2064974353;
        if.ffjw[46] = 188532454;
        if.ffjw[47] = -2096645039;
        if.ffjw[48] = 1217348516;
        if.ffjw[49] = -504131856;
        if.ffjw[50] = 509619730;
        if.ffjw[51] = 1035482965;
        if.ffjw[52] = 1062476358;
        if.ffjw[53] = -1902117267;
        if.ffjw[54] = 1477762140;
        if.ffjw[55] = 2048657230;
        if.ffjw[56] = 1782329759;
        if.ffjw[57] = -1194298935;
        if.ffjw[58] = 1616619459;
        if.ffjw[59] = -608635362;
        if.ffjw[60] = 1665094160;
        if.ffjw[61] = -773587790;
        if.ffjw[62] = 1569446473;
        if.ffjw[63] = 1119408025;
        if.ffjw[64] = 80992062;
        if.ffjw[65] = 487295705;
        if.ffjw[66] = -1597370827;
        if.ffjw[67] = 1275585003;
        if.ffjw[68] = -2086220473;
        if.ffjw[69] = -1672492089;
        if.ffjw[70] = -1658766573;
        if.ffjw[71] = 1063955972;
        if.ffjw[72] = 1473479701;
        if.ffjw[73] = 937873215;
        if.ffjw[74] = 211194609;
        if.ffjw[75] = 1027908352;
        if.ffjw[76] = -1506680728;
        if.ffjw[77] = -413578337;
        if.ffjw[78] = 434836015;
        if.ffjw[79] = -15538398;
        if.ffjw[80] = -1241322877;
        if.ffjw[81] = -2021474690;
        if.ffjw[82] = 1669854389;
        if.ffjw[83] = 1111202605;
        if.ffjw[84] = -38312512;
        if.ffjw[85] = -780740461;
        if.ffjw[86] = -1807655443;
        if.ffjw[87] = 1577260524;
        if.ffjw[88] = 1527016171;
        if.ffjw[89] = -133565298;
        if.ffjw[90] = -479402266;
        if.ffjw[91] = -931268523;
        if.ffjw[92] = 1261851417;
        if.ffjw[93] = 593592299;
        if.ffjw[94] = -1249905286;
        if.ffjw[95] = -1267717054;
        if.ffjw[96] = 552759800;
        if.ffjw[97] = -557019641;
        if.ffjw[98] = -1690043804;
        if.ffjw[99] = 410393863;
    }

    private static /* synthetic */ int ffjv(int n2) {
        return ffjw[n2] ^ ffjx[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean consumeMissSwing() {
        Object object = lu;
        block28: while (true) {
            switch ((int)object) {
                case -664008395: {
                    object = if.ffjy("fhns", fgdj(int ), (int)112) - if.ffjy("fhnr", fgdj(int ), (int)111);
                    continue block28;
                }
                case 1904238192: {
                    break block28;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = lu;
        block29: while (true) {
            switch ((int)object2) {
                case 1532787212: {
                    object2 = if.ffjy("fhoa", fgdj(int ), (int)114) - if.ffjy("fhny", fgdj(int ), (int)113);
                    continue block29;
                }
                case 1904238192: {
                    break block29;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = lu;
        block30: while (true) {
            switch ((int)object3) {
                case 1804487804: {
                    object3 = if.ffjy("fhod", fgdj(int ), (int)116) - if.ffjy("fhoc", fgdj(int ), (int)115);
                    continue block30;
                }
                case 1904238192: {
                    break block30;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        Object object4 = lu;
        boolean bl4 = true;
        block31: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - if.ffjy("fhof", fgdj(int ), (int)117);
            }
            switch ((int)object4) {
                case -1232159515: {
                    callSite = if.ffjy("fhoh", fgdj(int ), (int)118);
                    continue block31;
                }
                case 865711233: {
                    callSite = if.ffjy("fhoi", fgdj(int ), (int)119);
                    continue block31;
                }
                case 1904238192: {
                    break block31;
                }
            }
            break;
        }
        if (!this.missSwingReady) {
            if (bl3 || bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
            return (boolean)if.ffjy("fhoj", ffjv(int ), (int)423);
        }
        if (bl3 || bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        CallSite callSite = if.ffjy("fhok", ffjv(int ), (int)424);
        Object object5 = lu;
        boolean bl5 = true;
        block32: while (true) {
            CallSite callSite2;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite2 - if.ffjy("fhol", fgdj(int ), (int)120);
            }
            switch ((int)object5) {
                case 167730760: {
                    callSite2 = if.ffjy("fhon", fgdj(int ), (int)121);
                    continue block32;
                }
                case 1274604034: {
                    callSite2 = if.ffjy("fhoo", fgdj(int ), (int)122);
                    continue block32;
                }
                case 1904238192: {
                    break block32;
                }
            }
            break;
        }
        this.missSwingReady = callSite;
        if (bl3 || bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        CallSite callSite3 = if.ffjy("fhop", ffjv(int ), (int)425);
        Object object6 = lu;
        boolean bl6 = true;
        block33: while (true) {
            CallSite callSite4;
            if (!bl6 || (bl6 = false) || !true) {
                object6 = callSite4 - if.ffjy("fhoq", fgdj(int ), (int)123);
            }
            switch ((int)object6) {
                case -1932561256: {
                    callSite4 = if.ffjy("fhor", fgdj(int ), (int)124);
                    continue block33;
                }
                case -687996570: {
                    callSite4 = if.ffjy("fhos", fgdj(int ), (int)125);
                    continue block33;
                }
                case -551177286: {
                    callSite4 = if.ffjy("fhot", fgdj(int ), (int)126);
                    continue block33;
                }
                case 1904238192: {
                    break block33;
                }
            }
            break;
        }
        this.missActive = callSite3;
        if (bl3 || bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        while (true) {
            long l2;
            Object object7;
            if ((object7 = (l2 = lu - if.ffjy("fhou", fgdj(int ), (int)127)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object7 == if.ffjy("fhov", ffjv(int ), (int)426)) {
                this.missYawOffset = 0.0f;
                if (bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
                break;
            }
            object7 = if.ffjy("fhow", ffjv(int ), (int)427);
        }
        if (bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        while (true) {
            long l3;
            Object object8;
            if ((object8 = (l3 = lu - if.ffjy("fhox", fgdj(int ), (int)128)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object8 == if.ffjy("fhoy", ffjv(int ), (int)428)) {
                this.missPitchOffset = 0.0f;
                if (bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
                break;
            }
            object8 = if.ffjy("fhoz", ffjv(int ), (int)429);
        }
        if (bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
        while (true) {
            long l4;
            Object object9;
            if ((object9 = (l4 = lu - if.ffjy("fhpa", fgdj(int ), (int)129)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object9 == if.ffjy("fhpb", ffjv(int ), (int)430)) break;
            object9 = if.ffjy("fhpd", ffjv(int ), (int)431);
        }
        long l5 = System.currentTimeMillis();
        while (true) {
            long l6;
            Object object10;
            if ((object10 = (l6 = lu - if.ffjy("fhpe", fgdj(int ), (int)130)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object10 == if.ffjy("fhpf", ffjv(int ), (int)432)) {
                this.scheduleNextMiss(l5);
                if (bl3) return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
                break;
            }
            object10 = if.ffjy("fhpg", ffjv(int ), (int)433);
        }
        if (!bl3) return (boolean)if.ffjy("fhph", ffjv(int ), (int)434);
        return (boolean)if.ffjy("fhoe", ffjv(int ), (int)422);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public if() {
        var2_1 /* !! */  = if.b;
        super("Legit");
        this.targetId = (int)if.ffjy("ffjz", ffjv(int ), (int)0);
        this.heightOffset = (float)if.ffjy("ffke", ffka(int ), (int)1);
        this.wantedHeightOffset = (float)if.ffjy("ffkg", ffka(int ), (int)2);
        this.humanPace = (float)if.ffjy("ffki", ffka(int ), (int)3);
        this.wantedHumanPace = (float)if.ffjy("ffkj", ffka(int ), (int)4);
        this.catchupStrength = 1.0f;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.sampledError = (float)if.ffjy("ffkk", ffka(int ), (int)5);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)if.ffjy("ffkl", ffjv(int ), (int)6);
                ** GOTO lbl30
            }
lbl17:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)if.ffjy("ffkm", ffjv(int ), (int)7);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)if.ffjy("ffko", ffjv(int ), (int)8);
                ** GOTO lbl17
            }
lbl23:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)if.ffjy("ffkp", ffjv(int ), (int)9);
                break;
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)if.ffjy("ffkq", ffjv(int ), (int)10);
                }
            }
lbl30:
            // 2 sources

            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)if.ffjy("ffkr", ffjv(int ), (int)11);
                }
            }
lbl34:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)if.ffjy("ffks", ffjv(int ), (int)12);
                ** GOTO lbl23
            }
            case 7: {
                while (true) {
                    var2_1 /* !! */  = (int)if.ffjy("ffkt", ffjv(int ), (int)13);
                }
            }
            case 8: {
                var2_1 /* !! */  = (int)if.ffjy("ffku", ffjv(int ), (int)14);
                ** GOTO lbl34
            }
            case 9: 
        }
        while (true) {
            var2_1 /* !! */  = (int)if.ffjy("ffla", ffjv(int ), (int)15);
        }
    }

    private static /* synthetic */ void fijg() {
        if.ffjx[700] = 1635808121;
        if.ffjx[701] = 83833307;
        if.ffjx[702] = -804888082;
        if.ffjx[703] = 1976045411;
        if.ffjx[704] = -1441880111;
        if.ffjx[705] = -220000958;
        if.ffjx[706] = 1072837888;
        if.ffjx[707] = 2093255584;
        if.ffjx[708] = -1648269733;
        if.ffjx[709] = 699959106;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov multipointAngle(class_1297 var1_1, float var2_2) {
        block79: {
            var19_3 = if.c;
            var18_4 /* !! */  = if.b;
            var17_5 = if.a;
            if (var19_3) {
                throw null;
lbl6:
                // 20 sources

                return null;
            }
            if (var17_5 || var17_5) ** GOTO lbl6
            var3_6 = System.currentTimeMillis();
            if (var17_5 || var17_5) ** GOTO lbl6
            if (var3_6 < this.nextPointChange) break block79;
            if (var17_5 || var17_5) ** GOTO lbl6
            this.chooseNextPoint((boolean)if.ffjy("fhvt", ffjv(int ), (int)534));
            if (var17_5) ** GOTO lbl6
        }
        if (var17_5 || var17_5) ** GOTO lbl6
        var5_7 = 1.0f - (float)Math.exp((double)(if.ffjy("fhvu", ffka(int ), (int)535) * var2_2));
        if (var17_5 || var17_5) ** GOTO lbl6
        this.lateralOffset = class_3532.method_16439((float)var5_7, (float)this.lateralOffset, (float)this.wantedLateralOffset);
        if (var17_5 || var17_5) ** GOTO lbl6
        this.heightOffset = class_3532.method_16439((float)var5_7, (float)this.heightOffset, (float)this.wantedHeightOffset);
        if (var17_5 || var17_5) ** GOTO lbl6
        this.depthOffset = class_3532.method_16439((float)var5_7, (float)this.depthOffset, (float)this.wantedDepthOffset);
        if (var17_5 || var17_5) ** GOTO lbl6
        if (var18_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var6_8 = var1_1.method_73189();
                if (var17_5 || var17_5) ** GOTO lbl6
                var7_9 = var6_8.method_1020(if.mc.field_1724.method_33571());
                if (var17_5 || var17_5) ** GOTO lbl6
                var8_10 = Math.hypot(var7_9.field_1352, var7_9.field_1350);
                if (var17_5 || var17_5) ** GOTO lbl6
                if (!(var8_10 < if.ffjy("fhvv", ffmw(int ), (int)195))) ** GOTO lbl40
                if (var17_5) ** GOTO lbl6
                v0 = 0.0;
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl42
lbl40:
                // 1 sources

                if (var17_5 || var17_5) ** GOTO lbl6
                v0 = var10_11 = var7_9.field_1352 / var8_10;
lbl42:
                // 2 sources

                if (var17_5 || var17_5) ** GOTO lbl6
                if (!(var8_10 < if.ffjy("fhvw", ffmw(int ), (int)196))) ** GOTO lbl49
                if (var17_5) ** GOTO lbl6
                v1 = 1.0;
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl51
lbl49:
                // 1 sources

                if (var17_5 || var17_5) ** GOTO lbl6
                v1 = var12_12 = var7_9.field_1350 / var8_10;
lbl51:
                // 2 sources

                if (var17_5 || var17_5) ** GOTO lbl6
                var14_13 = (double)var1_1.method_17681() * if.ffjy("fhvx", ffmw(int ), (int)197);
                if (var17_5 || var17_5) ** GOTO lbl6
                var16_14 = var6_8.method_1031(-var12_12 * (double)this.lateralOffset * var14_13 + var10_11 * (double)this.depthOffset * var14_13, (double)(var1_1.method_17682() * this.heightOffset), var10_11 * (double)this.lateralOffset * var14_13 + var12_12 * (double)this.depthOffset * var14_13);
                if (!var17_5 && !var17_5) ** break;
                ** continue;
                return ow.fromVec3d(var16_14.method_1020(if.mc.field_1724.method_33571()));
            }
            case 0: {
                var18_4 /* !! */  = (int)if.ffjy("fhvy", ffjv(int ), (int)536);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 1: {
                var18_4 /* !! */  = (int)if.ffjy("fhvz", ffjv(int ), (int)537);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 2: {
                var18_4 /* !! */  = (int)if.ffjy("fhwa", ffjv(int ), (int)538);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 3: {
                var18_4 /* !! */  = (int)if.ffjy("fhwb", ffjv(int ), (int)539);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl78:
            // 2 sources

            case 4: {
                var18_4 /* !! */  = (int)if.ffjy("fhwc", ffjv(int ), (int)540);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 5: {
                var18_4 /* !! */  = (int)if.ffjy("fhwd", ffjv(int ), (int)541);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl88:
            // 2 sources

            case 6: {
                var18_4 /* !! */  = (int)if.ffjy("fhwe", ffjv(int ), (int)542);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl93:
            // 2 sources

            case 7: {
                var18_4 /* !! */  = (int)if.ffjy("fhwf", ffjv(int ), (int)543);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl98:
            // 2 sources

            case 8: {
                var18_4 /* !! */  = (int)if.ffjy("fhwg", ffjv(int ), (int)544);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl103:
            // 3 sources

            case 9: {
                var18_4 /* !! */  = (int)if.ffjy("fhwh", ffjv(int ), (int)545);
                if (!var19_3) ** GOTO lbl88
                throw null;
            }
lbl107:
            // 2 sources

            case 10: {
                var18_4 /* !! */  = (int)if.ffjy("fhwi", ffjv(int ), (int)546);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 11: {
                var18_4 /* !! */  = (int)if.ffjy("fhwj", ffjv(int ), (int)547);
                if (!var19_3) break;
                throw null;
            }
lbl116:
            // 2 sources

            case 12: {
                var18_4 /* !! */  = (int)if.ffjy("fhwk", ffjv(int ), (int)548);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl121:
            // 2 sources

            case 13: {
                var18_4 /* !! */  = (int)if.ffjy("fhwl", ffjv(int ), (int)549);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl126:
            // 4 sources

            case 14: {
                var18_4 /* !! */  = (int)if.ffjy("fhwm", ffjv(int ), (int)550);
                if (!var19_3) ** GOTO lbl98
                throw null;
            }
lbl130:
            // 3 sources

            case 15: {
                var18_4 /* !! */  = (int)if.ffjy("fhwn", ffjv(int ), (int)551);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl135:
            // 2 sources

            case 16: {
                var18_4 /* !! */  = (int)if.ffjy("fhwo", ffjv(int ), (int)552);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl140:
            // 3 sources

            case 17: {
                var18_4 /* !! */  = (int)if.ffjy("fhwp", ffjv(int ), (int)553);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl145:
            // 4 sources

            case 18: {
                var18_4 /* !! */  = (int)if.ffjy("fhwq", ffjv(int ), (int)554);
                if (!var19_3) ** GOTO lbl103
                throw null;
            }
lbl149:
            // 4 sources

            case 19: {
                var18_4 /* !! */  = (int)if.ffjy("fhwr", ffjv(int ), (int)555);
                if (!var19_3) ** GOTO lbl145
                throw null;
            }
lbl153:
            // 3 sources

            case 20: {
                var18_4 /* !! */  = (int)if.ffjy("fhws", ffjv(int ), (int)556);
                if (!var19_3) ** GOTO lbl149
                throw null;
            }
lbl157:
            // 3 sources

            case 21: {
                var18_4 /* !! */  = (int)if.ffjy("fhwt", ffjv(int ), (int)557);
                if (!var19_3) ** GOTO lbl121
                throw null;
            }
            case 22: {
                var18_4 /* !! */  = (int)if.ffjy("fhwu", ffjv(int ), (int)558);
                if (!var19_3) ** GOTO lbl145
                throw null;
            }
lbl165:
            // 2 sources

            case 23: {
                var18_4 /* !! */  = (int)if.ffjy("fhwv", ffjv(int ), (int)559);
                if (!var19_3) ** GOTO lbl130
                throw null;
            }
lbl169:
            // 2 sources

            case 24: {
                var18_4 /* !! */  = (int)if.ffjy("fhww", ffjv(int ), (int)560);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl174:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_4 /* !! */  = (int)if.ffjy("fhwx", ffjv(int ), (int)561);
                    if (!var19_3) ** GOTO lbl149
                    throw null;
                }
            }
lbl179:
            // 2 sources

            case 26: {
                var18_4 /* !! */  = (int)if.ffjy("fhwy", ffjv(int ), (int)562);
                if (!var19_3) ** GOTO lbl135
                throw null;
            }
            case 27: {
                var18_4 /* !! */  = (int)if.ffjy("fhwz", ffjv(int ), (int)563);
                if (!var19_3) ** GOTO lbl78
                throw null;
            }
            case 28: {
                var18_4 /* !! */  = (int)if.ffjy("fhxa", ffjv(int ), (int)564);
                if (var19_3) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 29: {
                var18_4 /* !! */  = (int)if.ffjy("fhxb", ffjv(int ), (int)565);
                if (!var19_3) ** GOTO lbl107
                throw null;
            }
lbl196:
            // 3 sources

            case 30: {
                var18_4 /* !! */  = (int)if.ffjy("fhxc", ffjv(int ), (int)566);
                if (!var19_3) ** GOTO lbl126
                throw null;
            }
            case 31: {
                var18_4 /* !! */  = (int)if.ffjy("fhxd", ffjv(int ), (int)567);
                if (!var19_3) ** GOTO lbl140
                throw null;
            }
lbl204:
            // 2 sources

            case 32: {
                var18_4 /* !! */  = (int)if.ffjy("fhxe", ffjv(int ), (int)568);
                if (!var19_3) ** GOTO lbl130
                throw null;
            }
lbl208:
            // 4 sources

            case 33: {
                var18_4 /* !! */  = (int)if.ffjy("fhxf", ffjv(int ), (int)569);
                if (!var19_3) ** GOTO lbl149
                throw null;
            }
lbl212:
            // 2 sources

            case 34: {
                var18_4 /* !! */  = (int)if.ffjy("fhxg", ffjv(int ), (int)570);
                if (!var19_3) ** GOTO lbl103
                throw null;
            }
            case 35: {
                var18_4 /* !! */  = (int)if.ffjy("fhxh", ffjv(int ), (int)571);
                if (!var19_3) ** GOTO lbl153
                throw null;
            }
            case 36: {
                var18_4 /* !! */  = (int)if.ffjy("fhxi", ffjv(int ), (int)572);
                if (!var19_3) ** GOTO lbl179
                throw null;
            }
            case 37: {
                var18_4 /* !! */  = (int)if.ffjy("fhxj", ffjv(int ), (int)573);
                if (!var19_3) ** GOTO lbl93
                throw null;
            }
            case 38: {
                var18_4 /* !! */  = (int)if.ffjy("fhxk", ffjv(int ), (int)574);
                if (!var19_3) ** GOTO lbl140
                throw null;
            }
            case 39: 
        }
        var18_4 /* !! */  = (int)if.ffjy("fhxl", ffjv(int ), (int)575);
        ** while (!var19_3)
lbl235:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public class_243 randomValue() {
        block30: {
            block31: {
                v0 /* !! */  = if.lu;
                if (true) ** GOTO lbl5
                block17: while (true) {
                    v0 /* !! */  = (long)(v1 - if.ffjy("fiex", fgdj(int ), (int)265));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1648535214: {
                            v1 = if.ffjy("fiey", fgdj(int ), (int)266);
                            continue block17;
                        }
                        case -1500779281: {
                            v1 = if.ffjy("fiez", fgdj(int ), (int)267);
                            continue block17;
                        }
                        case -68742769: {
                            v1 = if.ffjy("fifa", fgdj(int ), (int)268);
                            continue block17;
                        }
                        case 1904238192: {
                            break block17;
                        }
                    }
                    break;
                }
                var3_1 = if.c;
                v2 /* !! */  = if.lu;
                if (true) ** GOTO lbl22
                block18: while (true) {
                    v2 /* !! */  = (long)(v3 - if.ffjy("fifb", fgdj(int ), (int)269));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -932549553: {
                            v3 = if.ffjy("fifc", fgdj(int ), (int)270);
                            continue block18;
                        }
                        case 211802647: {
                            v3 = if.ffjy("fifd", fgdj(int ), (int)271);
                            continue block18;
                        }
                        case 1904238192: {
                            break block18;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = if.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fife", fgdj(int ), (int)272)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == if.ffjy("fiff", ffjv(int ), (int)702)) {
                        var1_3 = if.a;
                        if (var3_1) {
                            throw null;
                        }
                        break;
                    }
                    v4 /* !! */  = (long)if.ffjy("fifg", ffjv(int ), (int)703);
                }
                if (!var1_3 && !var1_3) ** GOTO lbl49
                if (var2_2 /* !! */  == 0) return null;
                cfr_temp_0 = -2147483648;
lbl45:
                // 2 sources

                block20: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return null;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fifh", fgdj(int ), (int)273)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == if.ffjy("fifi", ffjv(int ), (int)704)) {
                                return class_243.field_1353;
                            }
                            v5 /* !! */  = (long)if.ffjy("fifj", ffjv(int ), (int)705);
                        }
                        case 0: {
                            do {
                                var2_2 /* !! */  = (int)if.ffjy("fifk", ffjv(int ), (int)706);
                            } while (!var3_1);
                            throw null;
                        }
                        case 1: {
                            ** break;
                        }
                        case 3: {
                            break block30;
                        }
lbl65:
                        // 2 sources

                        while (true) {
                            var2_2 /* !! */  = (int)if.ffjy("fifl", ffjv(int ), (int)707);
                            cfr_temp_0 = 2;
                            if (!var3_1) continue block20;
                            throw null;
                        }
                        case 2: 
                    }
                    break;
                }
                break block31;
                ** while (true)
            }
            var2_2 /* !! */  = (int)if.ffjy("fifm", ffjv(int ), (int)708);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)if.ffjy("fifn", ffjv(int ), (int)709);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isMissActive() {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(if.ffjy("fhqf", fgdj(int ), (int)132) - if.ffjy("fhqe", fgdj(int ), (int)131));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1865788480: {
                    continue block14;
                }
                case 1904238192: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = if.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhqg", fgdj(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == if.ffjy("fhqh", ffjv(int ), (int)454)) break;
            v1 /* !! */  = (long)if.ffjy("fhqi", ffjv(int ), (int)455);
        }
        var2_2 /* !! */  = if.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fhqj", fgdj(int ), (int)134)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == if.ffjy("fhqk", ffjv(int ), (int)456)) break;
            v2 /* !! */  = (long)if.ffjy("fhql", ffjv(int ), (int)457);
        }
        var1_3 = if.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)if.ffjy("fhqm", ffjv(int ), (int)458);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = if.lu;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(if.ffjy("fhqp", fgdj(int ), (int)136) - if.ffjy("fhqo", fgdj(int ), (int)135));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -41638499: {
                            continue block18;
                        }
                        case 1904238192: {
                            break block18;
                        }
                    }
                    break;
                }
                return this.missActive;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)if.ffjy("fhqq", ffjv(int ), (int)459);
                } while (!var3_1);
                throw null;
            }
lbl49:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)if.ffjy("fhqr", ffjv(int ), (int)460);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)if.ffjy("fhqs", ffjv(int ), (int)461);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)if.ffjy("fhqt", ffjv(int ), (int)462);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void pauseFrameClock() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhva", fgdj(int ), (int)190)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == if.ffjy("fhvb", ffjv(int ), (int)520)) break;
            v0 /* !! */  = (long)if.ffjy("fhvc", ffjv(int ), (int)521);
        }
        var3_1 = if.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fhvd", fgdj(int ), (int)191)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == if.ffjy("fhve", ffjv(int ), (int)522)) break;
            v1 /* !! */  = (long)if.ffjy("fhvf", ffjv(int ), (int)523);
        }
        var2_2 /* !! */  = if.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fhvg", fgdj(int ), (int)192)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == if.ffjy("fhvh", ffjv(int ), (int)524)) break;
                    v2 /* !! */  = (long)if.ffjy("fhvi", ffjv(int ), (int)525);
                }
                var1_3 = if.a;
                if (var3_1) {
                    throw null;
lbl24:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                v3 = if.ffjy("fhvj", fgdj(int ), (int)193);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = if.lu - if.ffjy("fhvk", fgdj(int ), (int)194)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == if.ffjy("fhvl", ffjv(int ), (int)526)) break;
                    v4 /* !! */  = (long)if.ffjy("fhvm", ffjv(int ), (int)527);
                }
                this.lastFrameNanos = (long)v3;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)if.ffjy("fhvn", ffjv(int ), (int)528);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)if.ffjy("fhvo", ffjv(int ), (int)529);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
lbl45:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)if.ffjy("fhvp", ffjv(int ), (int)530);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)if.ffjy("fhvq", ffjv(int ), (int)531);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)if.ffjy("fhvr", ffjv(int ), (int)532);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)if.ffjy("fhvs", ffjv(int ), (int)533);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fiiy() {
        if.ffjx[100] = -1197711553;
        if.ffjx[101] = -1804333262;
        if.ffjx[102] = 1038941920;
        if.ffjx[103] = -2015968300;
        if.ffjx[104] = -2070158549;
        if.ffjx[105] = 393565998;
        if.ffjx[106] = 876684249;
        if.ffjx[107] = 1412585397;
        if.ffjx[108] = -1291013232;
        if.ffjx[109] = -1494160305;
        if.ffjx[110] = -20580276;
        if.ffjx[111] = -1909802814;
        if.ffjx[112] = -416180071;
        if.ffjx[113] = -1631399499;
        if.ffjx[114] = 1490209082;
        if.ffjx[115] = 392160975;
        if.ffjx[116] = -1902595289;
        if.ffjx[117] = -2076655428;
        if.ffjx[118] = -390770670;
        if.ffjx[119] = 317463072;
        if.ffjx[120] = 1148644305;
        if.ffjx[121] = 1231947192;
        if.ffjx[122] = 67658583;
        if.ffjx[123] = 1882214722;
        if.ffjx[124] = 1235013163;
        if.ffjx[125] = 2017194978;
        if.ffjx[126] = 2100465023;
        if.ffjx[127] = -142907368;
        if.ffjx[128] = -1530440629;
        if.ffjx[129] = -1591139188;
        if.ffjx[130] = 771534366;
        if.ffjx[131] = 1713572915;
        if.ffjx[132] = -1707907448;
        if.ffjx[133] = -1968114276;
        if.ffjx[134] = 2140080451;
        if.ffjx[135] = -1723391385;
        if.ffjx[136] = 1786975109;
        if.ffjx[137] = -2065695945;
        if.ffjx[138] = 2082826530;
        if.ffjx[139] = 686649754;
        if.ffjx[140] = -1938832275;
        if.ffjx[141] = 1004099772;
        if.ffjx[142] = -659474958;
        if.ffjx[143] = -508778785;
        if.ffjx[144] = 984936831;
        if.ffjx[145] = -459000589;
        if.ffjx[146] = -693458920;
        if.ffjx[147] = 1325074114;
        if.ffjx[148] = 1548950221;
        if.ffjx[149] = -1713390203;
        if.ffjx[150] = 1052801157;
        if.ffjx[151] = -1532600347;
        if.ffjx[152] = -1459418817;
        if.ffjx[153] = -722506321;
        if.ffjx[154] = 103265115;
        if.ffjx[155] = 1077940939;
        if.ffjx[156] = -491938850;
        if.ffjx[157] = -1156019150;
        if.ffjx[158] = 1480822998;
        if.ffjx[159] = 1017201395;
        if.ffjx[160] = -12802737;
        if.ffjx[161] = 1076171918;
        if.ffjx[162] = -948471703;
        if.ffjx[163] = 123241768;
        if.ffjx[164] = -530735716;
        if.ffjx[165] = 682590062;
        if.ffjx[166] = -1348547001;
        if.ffjx[167] = -326369573;
        if.ffjx[168] = -2000327780;
        if.ffjx[169] = -558941325;
        if.ffjx[170] = -856941294;
        if.ffjx[171] = 130582593;
        if.ffjx[172] = -1029393773;
        if.ffjx[173] = 144259922;
        if.ffjx[174] = 1734047968;
        if.ffjx[175] = -998880885;
        if.ffjx[176] = -1846804292;
        if.ffjx[177] = -1589066309;
        if.ffjx[178] = 1116347373;
        if.ffjx[179] = 2107943391;
        if.ffjx[180] = -542109474;
        if.ffjx[181] = 1288315435;
        if.ffjx[182] = 1219615152;
        if.ffjx[183] = 1942450314;
        if.ffjx[184] = 1557451252;
        if.ffjx[185] = 1489932474;
        if.ffjx[186] = 694881891;
        if.ffjx[187] = -399878093;
        if.ffjx[188] = -730608556;
        if.ffjx[189] = 1179890286;
        if.ffjx[190] = 1663009474;
        if.ffjx[191] = 1278091602;
        if.ffjx[192] = -1033816812;
        if.ffjx[193] = 132686541;
        if.ffjx[194] = -941537262;
        if.ffjx[195] = 639621090;
        if.ffjx[196] = -2057022551;
        if.ffjx[197] = -97347917;
        if.ffjx[198] = -1207644060;
        if.ffjx[199] = -850247596;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float updateHumanTempo(float var1_1, float var2_2, long var3_3) {
        block97: {
            block101: {
                block100: {
                    block99: {
                        block98: {
                            var11_4 = if.c;
                            var10_5 /* !! */  = if.b;
                            var9_6 = if.a;
                            if (var11_4) {
                                throw null;
lbl6:
                                // 27 sources

                                return (float)if.ffjy("fhbh", ffka(int ), (int)285);
                            }
                            if (var9_6 || var9_6) ** GOTO lbl6
                            var5_7 = ThreadLocalRandom.current();
                            if (var9_6 || var9_6) ** GOTO lbl6
                            if (var3_3 < this.nextPaceChange) break block97;
                            if (var9_6 || var9_6) ** GOTO lbl6
                            this.wantedHumanPace = var5_7.nextFloat((float)if.ffjy("fhbi", ffka(int ), (int)286), (float)if.ffjy("fhbj", ffka(int ), (int)287));
                            if (var9_6 || var9_6) ** GOTO lbl6
                            this.nextPaceChange = var3_3 + var5_7.nextLong((long)if.ffjy("fhbk", fgdj(int ), (int)97), (long)if.ffjy("fhbl", fgdj(int ), (int)98));
                            if (var9_6 || var9_6) ** GOTO lbl6
                            if (Float.isNaN(this.sampledError)) break block98;
                            if (var9_6) ** GOTO lbl6
                            if (!(var2_2 > this.sampledError * if.ffjy("fhbm", ffka(int ), (int)288))) break block99;
                            if (var9_6) ** GOTO lbl6
                        }
                        if (var9_6 || var9_6) ** GOTO lbl6
                        v0 = if.ffjy("fhbn", ffjv(int ), (int)289);
                        if (var11_4) {
                            throw null;
                        }
                        break block100;
                    }
                    if (var9_6 || var9_6) ** GOTO lbl6
                    v0 = var6_8 = if.ffjy("fhbo", ffjv(int ), (int)290);
                }
                if (var9_6 || var9_6) ** GOTO lbl6
                if (!(var2_2 > if.ffjy("fhbp", ffka(int ), (int)291))) break block101;
                if (var9_6) ** GOTO lbl6
                if (!(var2_2 < if.ffjy("fhbq", ffka(int ), (int)292))) break block101;
                if (var9_6) ** GOTO lbl6
                if (var6_8 == false) break block101;
                if (var9_6) ** GOTO lbl6
                if (var3_3 < this.nextCatchupAllowed) break block101;
                if (var9_6) ** GOTO lbl6
                if (!(var5_7.nextFloat() < if.ffjy("fhbr", ffka(int ), (int)293))) break block101;
                if (var9_6 || var9_6) ** GOTO lbl6
                this.catchupStrength = var5_7.nextFloat((float)if.ffjy("fhbs", ffka(int ), (int)294), (float)if.ffjy("fhbt", ffka(int ), (int)295));
                if (var9_6 || var9_6) ** GOTO lbl6
                this.catchupUntil = var3_3 + var5_7.nextLong((long)if.ffjy("fhbv", fgdj(int ), (int)99), (long)if.ffjy("fhbw", fgdj(int ), (int)100));
                if (var9_6 || var9_6) ** GOTO lbl6
                this.nextCatchupAllowed = var3_3 + var5_7.nextLong((long)if.ffjy("fhbx", fgdj(int ), (int)101), (long)if.ffjy("fhby", fgdj(int ), (int)102));
                if (var9_6) ** GOTO lbl6
            }
            if (var9_6 || var9_6) ** GOTO lbl6
            this.sampledError = var2_2;
            if (var9_6) ** GOTO lbl6
        }
        if (var9_6 || var9_6) ** GOTO lbl6
        var6_9 = 1.0f - (float)Math.exp((double)(if.ffjy("fhbz", ffka(int ), (int)296) * var1_1));
        if (var9_6 || var9_6) ** GOTO lbl6
        this.humanPace = class_3532.method_16439((float)var6_9, (float)this.humanPace, (float)this.wantedHumanPace);
        if (var9_6 || var9_6) ** GOTO lbl6
        if (var3_3 >= this.catchupUntil) ** GOTO lbl67
        if (var9_6) ** GOTO lbl6
        if (var10_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v1 = this.catchupStrength;
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl69
            }
lbl67:
            // 1 sources

            if (var9_6 || var9_6) ** GOTO lbl6
            v1 = var7_10 = 1.0f;
lbl69:
            // 2 sources

            if (var9_6 || var9_6) ** GOTO lbl6
            var8_11 = 1.0f + (float)Math.sin((double)var3_3 * if.ffjy("fhca", ffmw(int ), (int)103)) * if.ffjy("fhcb", ffka(int ), (int)297) + (float)Math.sin((double)var3_3 * if.ffjy("fhcc", ffmw(int ), (int)104) + if.ffjy("fhcd", ffmw(int ), (int)105)) * if.ffjy("fhce", ffka(int ), (int)298);
            if (!var9_6 && !var9_6) ** break;
            ** continue;
            return this.humanPace * var7_10 * var8_11;
lbl74:
            // 2 sources

            case 0: {
                var10_5 /* !! */  = (int)if.ffjy("fhcf", ffjv(int ), (int)299);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 1: {
                var10_5 /* !! */  = (int)if.ffjy("fhcg", ffjv(int ), (int)300);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl84:
            // 3 sources

            case 2: {
                var10_5 /* !! */  = (int)if.ffjy("fhch", ffjv(int ), (int)301);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl89:
            // 2 sources

            case 3: {
                var10_5 /* !! */  = (int)if.ffjy("fhci", ffjv(int ), (int)302);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl94:
            // 2 sources

            case 4: {
                var10_5 /* !! */  = (int)if.ffjy("fhcj", ffjv(int ), (int)303);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl99:
            // 3 sources

            case 5: {
                var10_5 /* !! */  = (int)if.ffjy("fhck", ffjv(int ), (int)304);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl104:
            // 2 sources

            case 6: {
                var10_5 /* !! */  = (int)if.ffjy("fhcl", ffjv(int ), (int)305);
                if (!var11_4) ** GOTO lbl84
                throw null;
            }
lbl108:
            // 2 sources

            case 7: {
                var10_5 /* !! */  = (int)if.ffjy("fhcm", ffjv(int ), (int)306);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl113:
            // 2 sources

            case 8: {
                var10_5 /* !! */  = (int)if.ffjy("fhcn", ffjv(int ), (int)307);
                if (!var11_4) ** GOTO lbl104
                throw null;
            }
lbl117:
            // 3 sources

            case 9: {
                var10_5 /* !! */  = (int)if.ffjy("fhco", ffjv(int ), (int)308);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 10: {
                var10_5 /* !! */  = (int)if.ffjy("fhcp", ffjv(int ), (int)309);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl127:
            // 2 sources

            case 11: {
                var10_5 /* !! */  = (int)if.ffjy("fhcq", ffjv(int ), (int)310);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl132:
            // 2 sources

            case 12: {
                var10_5 /* !! */  = (int)if.ffjy("fhcr", ffjv(int ), (int)311);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl137:
            // 3 sources

            case 13: {
                var10_5 /* !! */  = (int)if.ffjy("fhcs", ffjv(int ), (int)312);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 14: {
                var10_5 /* !! */  = (int)if.ffjy("fhct", ffjv(int ), (int)313);
                if (!var11_4) ** GOTO lbl94
                throw null;
            }
            case 15: {
                var10_5 /* !! */  = (int)if.ffjy("fhcu", ffjv(int ), (int)314);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl151:
            // 2 sources

            case 16: {
                var10_5 /* !! */  = (int)if.ffjy("fhcv", ffjv(int ), (int)315);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl156:
            // 2 sources

            case 17: {
                do {
                    var10_5 /* !! */  = (int)if.ffjy("fhcw", ffjv(int ), (int)316);
                } while (!var11_4);
                throw null;
            }
            case 18: {
                var10_5 /* !! */  = (int)if.ffjy("fhcx", ffjv(int ), (int)317);
                if (!var11_4) ** GOTO lbl108
                throw null;
            }
lbl165:
            // 2 sources

            case 19: {
                var10_5 /* !! */  = (int)if.ffjy("fhcy", ffjv(int ), (int)318);
                if (!var11_4) ** GOTO lbl151
                throw null;
            }
lbl169:
            // 2 sources

            case 20: {
                var10_5 /* !! */  = (int)if.ffjy("fhcz", ffjv(int ), (int)319);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl174:
            // 2 sources

            case 21: {
                var10_5 /* !! */  = (int)if.ffjy("fhda", ffjv(int ), (int)320);
                if (!var11_4) ** GOTO lbl127
                throw null;
            }
            case 22: {
                var10_5 /* !! */  = (int)if.ffjy("fhdb", ffjv(int ), (int)321);
                if (!var11_4) ** GOTO lbl132
                throw null;
            }
lbl182:
            // 3 sources

            case 23: {
                var10_5 /* !! */  = (int)if.ffjy("fhdc", ffjv(int ), (int)322);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl187:
            // 3 sources

            case 24: {
                var10_5 /* !! */  = (int)if.ffjy("fhdd", ffjv(int ), (int)323);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl192:
            // 3 sources

            case 25: {
                var10_5 /* !! */  = (int)if.ffjy("fhde", ffjv(int ), (int)324);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl197:
            // 3 sources

            case 26: {
                var10_5 /* !! */  = (int)if.ffjy("fhdf", ffjv(int ), (int)325);
                if (!var11_4) ** GOTO lbl74
                throw null;
            }
lbl201:
            // 2 sources

            case 27: {
                var10_5 /* !! */  = (int)if.ffjy("fhdg", ffjv(int ), (int)326);
                if (!var11_4) ** GOTO lbl89
                throw null;
            }
lbl205:
            // 3 sources

            case 28: {
                var10_5 /* !! */  = (int)if.ffjy("fhdh", ffjv(int ), (int)327);
                if (!var11_4) ** GOTO lbl192
                throw null;
            }
lbl209:
            // 3 sources

            case 29: {
                var10_5 /* !! */  = (int)if.ffjy("fhdi", ffjv(int ), (int)328);
                if (!var11_4) ** GOTO lbl187
                throw null;
            }
            case 30: {
                var10_5 /* !! */  = (int)if.ffjy("fhdj", ffjv(int ), (int)329);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl218:
            // 2 sources

            case 31: {
                var10_5 /* !! */  = (int)if.ffjy("fhdk", ffjv(int ), (int)330);
                if (!var11_4) ** GOTO lbl117
                throw null;
            }
lbl222:
            // 3 sources

            case 32: {
                var10_5 /* !! */  = (int)if.ffjy("fhdl", ffjv(int ), (int)331);
                if (!var11_4) ** GOTO lbl192
                throw null;
            }
            case 33: {
                var10_5 /* !! */  = (int)if.ffjy("fhdm", ffjv(int ), (int)332);
                if (!var11_4) break;
                throw null;
            }
            case 34: {
                var10_5 /* !! */  = (int)if.ffjy("fhdn", ffjv(int ), (int)333);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 35: {
                do {
                    var10_5 /* !! */  = (int)if.ffjy("fhdo", ffjv(int ), (int)334);
                } while (!var11_4);
                throw null;
            }
            case 36: {
                var10_5 /* !! */  = (int)if.ffjy("fhdp", ffjv(int ), (int)335);
                if (!var11_4) ** GOTO lbl137
                throw null;
            }
            case 37: {
                var10_5 /* !! */  = (int)if.ffjy("fhdq", ffjv(int ), (int)336);
                if (!var11_4) ** GOTO lbl209
                throw null;
            }
lbl248:
            // 3 sources

            case 38: {
                var10_5 /* !! */  = (int)if.ffjy("fhdr", ffjv(int ), (int)337);
                if (!var11_4) ** GOTO lbl182
                throw null;
            }
            case 39: {
                var10_5 /* !! */  = (int)if.ffjy("fhds", ffjv(int ), (int)338);
                if (!var11_4) ** GOTO lbl187
                throw null;
            }
            case 40: {
                var10_5 /* !! */  = (int)if.ffjy("fhdt", ffjv(int ), (int)339);
                if (!var11_4) ** GOTO lbl165
                throw null;
            }
lbl260:
            // 3 sources

            case 41: {
                var10_5 /* !! */  = (int)if.ffjy("fhdu", ffjv(int ), (int)340);
                if (!var11_4) ** GOTO lbl99
                throw null;
            }
lbl264:
            // 2 sources

            case 42: {
                var10_5 /* !! */  = (int)if.ffjy("fhdv", ffjv(int ), (int)341);
                if (!var11_4) ** GOTO lbl84
                throw null;
            }
lbl268:
            // 2 sources

            case 43: {
                var10_5 /* !! */  = (int)if.ffjy("fhdw", ffjv(int ), (int)342);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 44: {
                var10_5 /* !! */  = (int)if.ffjy("fhdx", ffjv(int ), (int)343);
                if (!var11_4) ** GOTO lbl113
                throw null;
            }
            case 45: {
                var10_5 /* !! */  = (int)if.ffjy("fhdy", ffjv(int ), (int)344);
                if (!var11_4) ** GOTO lbl264
                throw null;
            }
lbl281:
            // 2 sources

            case 46: {
                var10_5 /* !! */  = (int)if.ffjy("fhdz", ffjv(int ), (int)345);
                if (!var11_4) ** GOTO lbl99
                throw null;
            }
            case 47: 
        }
        do {
            var10_5 /* !! */  = (int)if.ffjy("fhea", ffjv(int ), (int)346);
        } while (!var11_4);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        var3_1 = if.c;
        var2_2 /* !! */  = if.b;
        var1_3 = if.a;
        if (var3_1) {
            throw null;
lbl6:
            // 29 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.yawVelocity = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.pitchVelocity = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.targetId = (int)if.ffjy("fibn", ffjv(int ), (int)630);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lateralOffset = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.heightOffset = (float)if.ffjy("fibo", ffka(int ), (int)631);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.depthOffset = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.wantedLateralOffset = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.wantedHeightOffset = (float)if.ffjy("fibp", ffka(int ), (int)632);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.wantedDepthOffset = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.nextPointChange = (long)if.ffjy("fibq", fgdj(int ), (int)249);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastFrameNanos = (long)if.ffjy("fibr", fgdj(int ), (int)250);
        if (var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl6
                this.humanPace = (float)if.ffjy("fibs", ffka(int ), (int)633);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.wantedHumanPace = (float)if.ffjy("fibt", ffka(int ), (int)634);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.catchupStrength = 1.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.sampledError = (float)if.ffjy("fibu", ffka(int ), (int)635);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextPaceChange = (long)if.ffjy("fibv", fgdj(int ), (int)251);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.catchupUntil = (long)if.ffjy("fibw", fgdj(int ), (int)252);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextCatchupAllowed = (long)if.ffjy("fibx", fgdj(int ), (int)253);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.cancelMiss();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextMissAt = (long)if.ffjy("fiby", fgdj(int ), (int)254);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.noiseYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.noisePitch = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.wantedNoiseYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.wantedNoisePitch = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.yawMouseRemainder = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.pitchMouseRemainder = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextNoiseChange = (long)if.ffjy("fibz", fgdj(int ), (int)255);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl69:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)if.ffjy("fica", ffjv(int ), (int)636);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl74:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)if.ffjy("ficb", ffjv(int ), (int)637);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl79:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)if.ffjy("ficc", ffjv(int ), (int)638);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 3: {
                var2_2 /* !! */  = (int)if.ffjy("ficd", ffjv(int ), (int)639);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 4: {
                var2_2 /* !! */  = (int)if.ffjy("fice", ffjv(int ), (int)640);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl94:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)if.ffjy("ficf", ffjv(int ), (int)641);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 6: {
                var2_2 /* !! */  = (int)if.ffjy("ficg", ffjv(int ), (int)642);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl104:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)if.ffjy("fich", ffjv(int ), (int)643);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl109:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)if.ffjy("fici", ffjv(int ), (int)644);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 9: {
                var2_2 /* !! */  = (int)if.ffjy("ficj", ffjv(int ), (int)645);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl119:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)if.ffjy("fick", ffjv(int ), (int)646);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl124:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)if.ffjy("ficl", ffjv(int ), (int)647);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 12: {
                var2_2 /* !! */  = (int)if.ffjy("ficm", ffjv(int ), (int)648);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 13: {
                var2_2 /* !! */  = (int)if.ffjy("ficn", ffjv(int ), (int)649);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)if.ffjy("fico", ffjv(int ), (int)650);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl143:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)if.ffjy("ficp", ffjv(int ), (int)651);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl147:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)if.ffjy("ficq", ffjv(int ), (int)652);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl152:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)if.ffjy("ficr", ffjv(int ), (int)653);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl157:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)if.ffjy("fics", ffjv(int ), (int)654);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)if.ffjy("fict", ffjv(int ), (int)655);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 20: {
                var2_2 /* !! */  = (int)if.ffjy("ficu", ffjv(int ), (int)656);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl171:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)if.ffjy("ficv", ffjv(int ), (int)657);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 22: {
                var2_2 /* !! */  = (int)if.ffjy("ficw", ffjv(int ), (int)658);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
lbl180:
            // 4 sources

            case 23: {
                var2_2 /* !! */  = (int)if.ffjy("ficx", ffjv(int ), (int)659);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl184:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)if.ffjy("ficy", ffjv(int ), (int)660);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)if.ffjy("ficz", ffjv(int ), (int)661);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl192:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)if.ffjy("fida", ffjv(int ), (int)662);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 27: {
                var2_2 /* !! */  = (int)if.ffjy("fidb", ffjv(int ), (int)663);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl201:
            // 2 sources

            case 28: {
                var2_2 /* !! */  = (int)if.ffjy("fidc", ffjv(int ), (int)664);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl205:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)if.ffjy("fidd", ffjv(int ), (int)665);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
lbl209:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)if.ffjy("fide", ffjv(int ), (int)666);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 31: {
                var2_2 /* !! */  = (int)if.ffjy("fidf", ffjv(int ), (int)667);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl219:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)if.ffjy("fidg", ffjv(int ), (int)668);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl224:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)if.ffjy("fidh", ffjv(int ), (int)669);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
lbl228:
            // 3 sources

            case 34: {
                var2_2 /* !! */  = (int)if.ffjy("fidi", ffjv(int ), (int)670);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl232:
            // 4 sources

            case 35: {
                var2_2 /* !! */  = (int)if.ffjy("fidj", ffjv(int ), (int)671);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl237:
            // 2 sources

            case 36: {
                var2_2 /* !! */  = (int)if.ffjy("fidk", ffjv(int ), (int)672);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 37: {
                var2_2 /* !! */  = (int)if.ffjy("fidl", ffjv(int ), (int)673);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl246:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)if.ffjy("fidm", ffjv(int ), (int)674);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
lbl250:
            // 3 sources

            case 39: {
                var2_2 /* !! */  = (int)if.ffjy("fidn", ffjv(int ), (int)675);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 40: {
                var2_2 /* !! */  = (int)if.ffjy("fido", ffjv(int ), (int)676);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl260:
            // 2 sources

            case 41: {
                var2_2 /* !! */  = (int)if.ffjy("fidp", ffjv(int ), (int)677);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 42: {
                var2_2 /* !! */  = (int)if.ffjy("fidq", ffjv(int ), (int)678);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 43: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)if.ffjy("fidr", ffjv(int ), (int)679);
                    if (!var3_1) ** GOTO lbl205
                    throw null;
                }
            }
lbl274:
            // 2 sources

            case 44: {
                var2_2 /* !! */  = (int)if.ffjy("fids", ffjv(int ), (int)680);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl279:
            // 4 sources

            case 45: {
                var2_2 /* !! */  = (int)if.ffjy("fidt", ffjv(int ), (int)681);
                if (!var3_1) ** GOTO lbl246
                throw null;
            }
lbl283:
            // 2 sources

            case 46: {
                var2_2 /* !! */  = (int)if.ffjy("fidu", ffjv(int ), (int)682);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl288:
            // 5 sources

            case 47: {
                var2_2 /* !! */  = (int)if.ffjy("fidv", ffjv(int ), (int)683);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 48: {
                var2_2 /* !! */  = (int)if.ffjy("fidw", ffjv(int ), (int)684);
                if (!var3_1) ** GOTO lbl288
                throw null;
            }
lbl296:
            // 5 sources

            case 49: {
                var2_2 /* !! */  = (int)if.ffjy("fidx", ffjv(int ), (int)685);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 50: {
                var2_2 /* !! */  = (int)if.ffjy("fidy", ffjv(int ), (int)686);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 51: {
                var2_2 /* !! */  = (int)if.ffjy("fidz", ffjv(int ), (int)687);
                if (!var3_1) ** GOTO lbl232
                throw null;
            }
            case 52: {
                var2_2 /* !! */  = (int)if.ffjy("fiea", ffjv(int ), (int)688);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
            case 53: {
                do {
                    var2_2 /* !! */  = (int)if.ffjy("fieb", ffjv(int ), (int)689);
                } while (!var3_1);
                throw null;
            }
lbl317:
            // 3 sources

            case 54: {
                var2_2 /* !! */  = (int)if.ffjy("fiec", ffjv(int ), (int)690);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 55: {
                var2_2 /* !! */  = (int)if.ffjy("fied", ffjv(int ), (int)691);
                if (!var3_1) ** GOTO lbl317
                throw null;
            }
            case 56: {
                var2_2 /* !! */  = (int)if.ffjy("fiee", ffjv(int ), (int)692);
                if (!var3_1) ** GOTO lbl219
                throw null;
            }
            case 57: 
        }
        var2_2 /* !! */  = (int)if.ffjy("fief", ffjv(int ), (int)693);
        ** while (!var3_1)
lbl332:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fijm() {
        if.ffnb[200] = 3976054279974310910L;
        if.ffnb[201] = 1921288160806946846L;
        if.ffnb[202] = -2921550614883075108L;
        if.ffnb[203] = -6999590447646610846L;
        if.ffnb[204] = 2653632936781510149L;
        if.ffnb[205] = 6612177501659690200L;
        if.ffnb[206] = -892988583417046976L;
        if.ffnb[207] = 6773874349577395105L;
        if.ffnb[208] = 3925542664390568558L;
        if.ffnb[209] = 4225862933459707919L;
        if.ffnb[210] = -3072394648085207029L;
        if.ffnb[211] = 3538266562007261422L;
        if.ffnb[212] = 2716537728259919807L;
        if.ffnb[213] = 3088160071617585682L;
        if.ffnb[214] = 6960733673880242669L;
        if.ffnb[215] = 7901048374610421139L;
        if.ffnb[216] = -5276971466803116895L;
        if.ffnb[217] = 2599422789541726320L;
        if.ffnb[218] = 757397201619620694L;
        if.ffnb[219] = 8868853435403708519L;
        if.ffnb[220] = 7997615002448560913L;
        if.ffnb[221] = 8837212662474425878L;
        if.ffnb[222] = -4112295054231003993L;
        if.ffnb[223] = -4862113189809526840L;
        if.ffnb[224] = 2546923405568427459L;
        if.ffnb[225] = -7686409628135248921L;
        if.ffnb[226] = -8449977779173260213L;
        if.ffnb[227] = -3322356856846160570L;
        if.ffnb[228] = -6353642365665397824L;
        if.ffnb[229] = 3519418472550308238L;
        if.ffnb[230] = 8758302197744743788L;
        if.ffnb[231] = -7088221720075156543L;
        if.ffnb[232] = 3515657760443905807L;
        if.ffnb[233] = -4502790552691521476L;
        if.ffnb[234] = -2850690240995655726L;
        if.ffnb[235] = 5501479366713830840L;
        if.ffnb[236] = -1976570392721501132L;
        if.ffnb[237] = 5344940982217649217L;
        if.ffnb[238] = -8081225361521097357L;
        if.ffnb[239] = -815252631799562211L;
        if.ffnb[240] = -2128586856445744761L;
        if.ffnb[241] = -5980954774728616136L;
        if.ffnb[242] = -8271010965757914532L;
        if.ffnb[243] = -8887125556256815882L;
        if.ffnb[244] = 620960161910862712L;
        if.ffnb[245] = -3154196573028653195L;
        if.ffnb[246] = 5045034594809504830L;
        if.ffnb[247] = -6353263316371059544L;
        if.ffnb[248] = 5326590060608611736L;
        if.ffnb[249] = -1493725552093037696L;
        if.ffnb[250] = -4966716335473349986L;
        if.ffnb[251] = 8659023137294204706L;
        if.ffnb[252] = 7423477500384023330L;
        if.ffnb[253] = 2195628090541225651L;
        if.ffnb[254] = -7079387867528387777L;
        if.ffnb[255] = 7195985648238132109L;
        if.ffnb[256] = -2742497169914204490L;
        if.ffnb[257] = 8915570401831596846L;
        if.ffnb[258] = 6882527937334545960L;
        if.ffnb[259] = -6290632430646749411L;
        if.ffnb[260] = 6440544543518580867L;
        if.ffnb[261] = -9034054651577477711L;
        if.ffnb[262] = 4912897009673904059L;
        if.ffnb[263] = 1919412768338900842L;
        if.ffnb[264] = -6466061530188061835L;
        if.ffnb[265] = -5987450953106594208L;
        if.ffnb[266] = 7909830099648055971L;
        if.ffnb[267] = -5272697282756017319L;
        if.ffnb[268] = -3910653453238636613L;
        if.ffnb[269] = 6457598506795174311L;
        if.ffnb[270] = 5706668519502503540L;
        if.ffnb[271] = 677889990245645317L;
        if.ffnb[272] = -4117756944677786397L;
        if.ffnb[273] = 2393080157214213916L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float frameSeconds() {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - if.ffjy("fhtg", fgdj(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1303056947: {
                    v1 = if.ffjy("fhth", fgdj(int ), (int)172);
                    continue block38;
                }
                case 639332938: {
                    v1 = if.ffjy("fhti", fgdj(int ), (int)173);
                    continue block38;
                }
                case 1186647850: {
                    v1 = if.ffjy("fhtj", fgdj(int ), (int)174);
                    continue block38;
                }
                case 1904238192: {
                    break block38;
                }
            }
            break;
        }
        var6_1 = if.c;
        v2 /* !! */  = if.lu;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(v3 - if.ffjy("fhtk", fgdj(int ), (int)175));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -90297007: {
                    v3 = if.ffjy("fhtl", fgdj(int ), (int)176);
                    continue block39;
                }
                case 1371072715: {
                    v3 = if.ffjy("fhtm", fgdj(int ), (int)177);
                    continue block39;
                }
                case 1387656961: {
                    v3 = if.ffjy("fhtn", fgdj(int ), (int)178);
                    continue block39;
                }
                case 1904238192: {
                    break block39;
                }
            }
            break;
        }
        var5_2 /* !! */  = if.b;
        v4 /* !! */  = if.lu;
        if (true) ** GOTO lbl39
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - if.ffjy("fhto", fgdj(int ), (int)179));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 266496464: {
                    v5 = if.ffjy("fhtp", fgdj(int ), (int)180);
                    continue block40;
                }
                case 1294350023: {
                    v5 = if.ffjy("fhtq", fgdj(int ), (int)181);
                    continue block40;
                }
                case 1904238192: {
                    break block40;
                }
            }
            break;
        }
        var4_3 = if.a;
        if (var6_1) {
            throw null;
lbl51:
            // 6 sources

            return (float)if.ffjy("fhtr", ffka(int ), (int)493);
        }
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3 || var4_3) ** GOTO lbl51
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhts", fgdj(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == if.ffjy("fhtt", ffjv(int ), (int)494)) break;
                    v6 /* !! */  = (long)if.ffjy("fhtu", ffjv(int ), (int)495);
                }
                var1_4 = System.nanoTime();
                if (var4_3 || var4_3) ** GOTO lbl51
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fhtv", fgdj(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == if.ffjy("fhtw", ffjv(int ), (int)496)) break;
                    v7 /* !! */  = (long)if.ffjy("fhtx", ffjv(int ), (int)497);
                }
                if (this.lastFrameNanos != if.ffjy("fhty", fgdj(int ), (int)184)) ** GOTO lbl75
                if (var4_3) ** GOTO lbl51
                v8 /* !! */  = if.ffjy("fhtz", ffka(int ), (int)498);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl90
lbl75:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl51
                v9 /* !! */  = if.lu;
                if (true) ** GOTO lbl80
                block44: while (true) {
                    v9 /* !! */  = (long)(v10 - if.ffjy("fhua", fgdj(int ), (int)185));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -608084577: {
                            v10 = if.ffjy("fhub", fgdj(int ), (int)186);
                            continue block44;
                        }
                        case 1206480163: {
                            v10 = if.ffjy("fhuc", fgdj(int ), (int)187);
                            continue block44;
                        }
                        case 1904238192: {
                            break block44;
                        }
                    }
                    break;
                }
                v8 /* !! */  = var3_5 = (CallSite)((float)(var1_4 - this.lastFrameNanos) / if.ffjy("fhud", ffka(int ), (int)499));
lbl90:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl51
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fhue", fgdj(int ), (int)188)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == if.ffjy("fhuf", ffjv(int ), (int)500)) break;
                    v11 /* !! */  = (long)if.ffjy("fhug", ffjv(int ), (int)501);
                }
                this.lastFrameNanos = var1_4;
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                v12 = if.ffjy("fhuh", ffka(int ), (int)502);
                v13 = if.ffjy("fhui", ffka(int ), (int)503);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = if.lu - if.ffjy("fhuj", fgdj(int ), (int)189)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == if.ffjy("fhuk", ffjv(int ), (int)504)) break;
                    v14 /* !! */  = (long)if.ffjy("fhul", ffjv(int ), (int)505);
                }
                return class_3532.method_15363((float)var3_5, (float)v12, (float)v13);
            }
lbl107:
            // 3 sources

            case 0: {
                var5_2 /* !! */  = (int)if.ffjy("fhum", ffjv(int ), (int)506);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl112:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)if.ffjy("fhun", ffjv(int ), (int)507);
                    if (!var6_1) break block17;
                    throw null;
                }
            }
            case 2: {
                var5_2 /* !! */  = (int)if.ffjy("fhuo", ffjv(int ), (int)508);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 3: {
                var5_2 /* !! */  = (int)if.ffjy("fhup", ffjv(int ), (int)509);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl127:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)if.ffjy("fhuq", ffjv(int ), (int)510);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 5: {
                var5_2 /* !! */  = (int)if.ffjy("fhur", ffjv(int ), (int)511);
                if (!var6_1) break;
                throw null;
            }
lbl136:
            // 2 sources

            case 6: {
                do {
                    var5_2 /* !! */  = (int)if.ffjy("fhus", ffjv(int ), (int)512);
                } while (!var6_1);
                throw null;
            }
            case 7: {
                var5_2 /* !! */  = (int)if.ffjy("fhut", ffjv(int ), (int)513);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
lbl145:
            // 2 sources

            case 8: {
                var5_2 /* !! */  = (int)if.ffjy("fhuu", ffjv(int ), (int)514);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl150:
            // 2 sources

            case 9: {
                var5_2 /* !! */  = (int)if.ffjy("fhuv", ffjv(int ), (int)515);
                if (!var6_1) ** GOTO lbl107
                throw null;
            }
lbl154:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)if.ffjy("fhuw", ffjv(int ), (int)516);
                if (!var6_1) ** GOTO lbl127
                throw null;
            }
lbl158:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)if.ffjy("fhux", ffjv(int ), (int)517);
                if (!var6_1) ** GOTO lbl112
                throw null;
            }
lbl162:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)if.ffjy("fhuy", ffjv(int ), (int)518);
                if (!var6_1) ** GOTO lbl154
                throw null;
            }
            case 13: 
        }
        var5_2 /* !! */  = (int)if.ffjy("fhuz", ffjv(int ), (int)519);
        ** while (!var6_1)
lbl169:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cancelMiss() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhrs", fgdj(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == if.ffjy("fhrt", ffjv(int ), (int)471)) break;
            v0 /* !! */  = (long)if.ffjy("fhru", ffjv(int ), (int)472);
        }
        var3_1 = if.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fhrv", fgdj(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == if.ffjy("fhrw", ffjv(int ), (int)473)) break;
            v1 /* !! */  = (long)if.ffjy("fhrx", ffjv(int ), (int)474);
        }
        var2_2 /* !! */  = if.b;
        v2 /* !! */  = if.lu;
        if (true) ** GOTO lbl17
        block42: while (true) {
            v2 /* !! */  = (long)(if.ffjy("fhrz", fgdj(int ), (int)156) - if.ffjy("fhry", fgdj(int ), (int)155));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1554059797: {
                    continue block42;
                }
                case 1904238192: {
                    break block42;
                }
            }
            break;
        }
        var1_3 = if.a;
        if (var3_1) {
            throw null;
lbl25:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 = if.ffjy("fhsa", ffjv(int ), (int)475);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fhsb", fgdj(int ), (int)157)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == if.ffjy("fhsc", ffjv(int ), (int)476)) break;
            v4 /* !! */  = (long)if.ffjy("fhsd", ffjv(int ), (int)477);
        }
        this.missActive = v3;
        if (var1_3 || var1_3) ** GOTO lbl25
        v5 = if.ffjy("fhse", ffjv(int ), (int)478);
        v6 /* !! */  = if.lu;
        if (true) ** GOTO lbl41
        block45: while (true) {
            v6 /* !! */  = (long)(if.ffjy("fhsg", fgdj(int ), (int)159) - if.ffjy("fhsf", fgdj(int ), (int)158));
lbl41:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 196698414: {
                    continue block45;
                }
                case 1904238192: {
                    break block45;
                }
            }
            break;
        }
        this.missSwingReady = v5;
        if (var1_3 || var1_3) ** GOTO lbl25
        v7 /* !! */  = if.lu;
        if (true) ** GOTO lbl52
        block46: while (true) {
            v7 /* !! */  = (long)(v8 - if.ffjy("fhsh", fgdj(int ), (int)160));
lbl52:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -848595884: {
                    v8 = if.ffjy("fhsi", fgdj(int ), (int)161);
                    continue block46;
                }
                case 987551815: {
                    v8 = if.ffjy("fhsj", fgdj(int ), (int)162);
                    continue block46;
                }
                case 1130151146: {
                    v8 = if.ffjy("fhsk", fgdj(int ), (int)163);
                    continue block46;
                }
                case 1904238192: {
                    break block46;
                }
            }
            break;
        }
        this.missYawOffset = 0.0f;
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v9 /* !! */  = if.lu;
                if (true) ** GOTO lbl74
                block47: while (true) {
                    v9 /* !! */  = (long)(v10 - if.ffjy("fhsl", fgdj(int ), (int)164));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -439201657: {
                            v10 = if.ffjy("fhsm", fgdj(int ), (int)165);
                            continue block47;
                        }
                        case 262255231: {
                            v10 = if.ffjy("fhsn", fgdj(int ), (int)166);
                            continue block47;
                        }
                        case 983893713: {
                            v10 = if.ffjy("fhso", fgdj(int ), (int)167);
                            continue block47;
                        }
                        case 1904238192: {
                            break block47;
                        }
                    }
                    break;
                }
                this.missPitchOffset = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl25
                v11 = if.ffjy("fhsp", fgdj(int ), (int)168);
                v12 /* !! */  = if.lu;
                if (true) ** GOTO lbl93
                block48: while (true) {
                    v12 /* !! */  = (long)(if.ffjy("fhsr", fgdj(int ), (int)170) - if.ffjy("fhsq", fgdj(int ), (int)169));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 1699139211: {
                            continue block48;
                        }
                        case 1904238192: {
                            break block48;
                        }
                    }
                    break;
                }
                this.missStartedAt = (long)v11;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl102:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)if.ffjy("fhss", ffjv(int ), (int)479);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl107:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)if.ffjy("fhst", ffjv(int ), (int)480);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl112:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)if.ffjy("fhsu", ffjv(int ), (int)481);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 3: {
                var2_2 /* !! */  = (int)if.ffjy("fhsv", ffjv(int ), (int)482);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 4: {
                var2_2 /* !! */  = (int)if.ffjy("fhsw", ffjv(int ), (int)483);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl126:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)if.ffjy("fhsx", ffjv(int ), (int)484);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
lbl130:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)if.ffjy("fhsy", ffjv(int ), (int)485);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
lbl134:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)if.ffjy("fhsz", ffjv(int ), (int)486);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)if.ffjy("fhta", ffjv(int ), (int)487);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl143:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)if.ffjy("fhtb", ffjv(int ), (int)488);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
lbl147:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)if.ffjy("fhtc", ffjv(int ), (int)489);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)if.ffjy("fhtd", ffjv(int ), (int)490);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
lbl155:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)if.ffjy("fhte", ffjv(int ), (int)491);
                    if (!var3_1) ** GOTO lbl147
                    throw null;
                }
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)if.ffjy("fhtf", ffjv(int ), (int)492);
        ** while (!var3_1)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void chooseNextPoint(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhxm", fgdj(int ), (int)198)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == if.ffjy("fhxn", ffjv(int ), (int)576)) break;
            v0 /* !! */  = (long)if.ffjy("fhxo", ffjv(int ), (int)577);
        }
        var5_2 = if.c;
        v1 /* !! */  = if.lu;
        if (true) ** GOTO lbl11
        block72: while (true) {
            v1 /* !! */  = (long)(if.ffjy("fhxq", fgdj(int ), (int)200) - if.ffjy("fhxp", fgdj(int ), (int)199));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1279681753: {
                    continue block72;
                }
                case 1904238192: {
                    break block72;
                }
            }
            break;
        }
        var4_3 /* !! */  = if.b;
        v2 /* !! */  = if.lu;
        if (true) ** GOTO lbl21
        block73: while (true) {
            v2 /* !! */  = (long)(v3 - if.ffjy("fhxr", fgdj(int ), (int)201));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 61022059: {
                    v3 = if.ffjy("fhxs", fgdj(int ), (int)202);
                    continue block73;
                }
                case 1523720443: {
                    v3 = if.ffjy("fhxt", fgdj(int ), (int)203);
                    continue block73;
                }
                case 1904238192: {
                    break block73;
                }
            }
            break;
        }
        var3_4 = if.a;
        if (var5_2) {
            throw null;
lbl33:
            // 11 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl33
        v4 /* !! */  = if.lu;
        if (true) ** GOTO lbl40
        block75: while (true) {
            v4 /* !! */  = (long)(v5 - if.ffjy("fhxu", fgdj(int ), (int)204));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -966700512: {
                    v5 = if.ffjy("fhxv", fgdj(int ), (int)205);
                    continue block75;
                }
                case 58505618: {
                    v5 = if.ffjy("fhxw", fgdj(int ), (int)206);
                    continue block75;
                }
                case 1840722519: {
                    v5 = if.ffjy("fhxx", fgdj(int ), (int)207);
                    continue block75;
                }
                case 1904238192: {
                    break block75;
                }
            }
            break;
        }
        var2_5 = ThreadLocalRandom.current();
        if (var3_4 || var3_4) ** GOTO lbl33
        v6 = if.ffjy("fhxy", ffka(int ), (int)578);
        v7 = if.ffjy("fhxz", ffka(int ), (int)579);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fhya", fgdj(int ), (int)208)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == if.ffjy("fhyb", ffjv(int ), (int)580)) break;
            v8 /* !! */  = (long)if.ffjy("fhyc", ffjv(int ), (int)581);
        }
        v9 = var2_5.nextFloat((float)v6, (float)v7);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fhyd", fgdj(int ), (int)209)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == if.ffjy("fhye", ffjv(int ), (int)582)) break;
            v10 /* !! */  = (long)if.ffjy("fhyf", ffjv(int ), (int)583);
        }
        this.wantedLateralOffset = v9;
        if (var3_4 || var3_4) ** GOTO lbl33
        v11 = if.ffjy("fhyg", ffka(int ), (int)584);
        v12 = if.ffjy("fhyh", ffka(int ), (int)585);
        v13 /* !! */  = if.lu;
        if (true) ** GOTO lbl75
        block78: while (true) {
            v13 /* !! */  = (long)(if.ffjy("fhyj", fgdj(int ), (int)211) - if.ffjy("fhyi", fgdj(int ), (int)210));
lbl75:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 1232222979: {
                    continue block78;
                }
                case 1904238192: {
                    break block78;
                }
            }
            break;
        }
        v14 = var2_5.nextFloat((float)v11, (float)v12);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = if.lu - if.ffjy("fhyk", fgdj(int ), (int)212)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == if.ffjy("fhyl", ffjv(int ), (int)586)) break;
            v15 /* !! */  = (long)if.ffjy("fhym", ffjv(int ), (int)587);
        }
        this.wantedHeightOffset = v14;
        if (var3_4 || var3_4) ** GOTO lbl33
        v16 = if.ffjy("fhyn", ffka(int ), (int)588);
        v17 = if.ffjy("fhyo", ffka(int ), (int)589);
        v18 /* !! */  = if.lu;
        if (true) ** GOTO lbl94
        block80: while (true) {
            v18 /* !! */  = (long)(v19 - if.ffjy("fhyp", fgdj(int ), (int)213));
lbl94:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -2043661787: {
                    v19 = if.ffjy("fhyq", fgdj(int ), (int)214);
                    continue block80;
                }
                case 1425089326: {
                    v19 = if.ffjy("fhyr", fgdj(int ), (int)215);
                    continue block80;
                }
                case 1904238192: {
                    break block80;
                }
            }
            break;
        }
        v20 = var2_5.nextFloat((float)v16, (float)v17);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_4 = if.lu - if.ffjy("fhys", fgdj(int ), (int)216)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == if.ffjy("fhyt", ffjv(int ), (int)590)) break;
            v21 /* !! */  = (long)if.ffjy("fhyu", ffjv(int ), (int)591);
        }
        this.wantedDepthOffset = v20;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl33
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_5 = if.lu - if.ffjy("fhyv", fgdj(int ), (int)217)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == if.ffjy("fhyw", ffjv(int ), (int)592)) break;
                    v22 /* !! */  = (long)if.ffjy("fhyx", ffjv(int ), (int)593);
                }
                v23 = System.currentTimeMillis();
                v24 = if.ffjy("fhyy", fgdj(int ), (int)218);
                v25 = if.ffjy("fhyz", fgdj(int ), (int)219);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_6 = if.lu - if.ffjy("fhza", fgdj(int ), (int)220)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == if.ffjy("fhzb", ffjv(int ), (int)594)) break;
                    v26 /* !! */  = (long)if.ffjy("fhzc", ffjv(int ), (int)595);
                }
                v27 = v23 + var2_5.nextLong((long)v24, (long)v25);
                v28 /* !! */  = if.lu;
                if (true) ** GOTO lbl132
                block84: while (true) {
                    v28 /* !! */  = (long)(v29 - if.ffjy("fhzd", fgdj(int ), (int)221));
lbl132:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1857372582: {
                            v29 = if.ffjy("fhze", fgdj(int ), (int)222);
                            continue block84;
                        }
                        case 1734491517: {
                            v29 = if.ffjy("fhzf", fgdj(int ), (int)223);
                            continue block84;
                        }
                        case 1904238192: {
                            break block84;
                        }
                    }
                    break;
                }
                this.nextPointChange = v27;
                if (var3_4 || var3_4) ** GOTO lbl33
                if (!var1_1) ** GOTO lbl211
                if (var3_4 || var3_4) ** GOTO lbl33
                v30 /* !! */  = if.lu;
                if (true) ** GOTO lbl149
                block85: while (true) {
                    v30 /* !! */  = (long)(v31 - if.ffjy("fhzg", fgdj(int ), (int)224));
lbl149:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 1781556960: {
                            v31 = if.ffjy("fhzh", fgdj(int ), (int)225);
                            continue block85;
                        }
                        case 1904238192: {
                            break block85;
                        }
                        case 1927958143: {
                            v31 = if.ffjy("fhzi", fgdj(int ), (int)226);
                            continue block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_7 = if.lu - if.ffjy("fhzj", fgdj(int ), (int)227)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == if.ffjy("fhzk", ffjv(int ), (int)596)) break;
                    v32 /* !! */  = (long)if.ffjy("fhzl", ffjv(int ), (int)597);
                }
                this.lateralOffset = this.wantedLateralOffset;
                if (var3_4 || var3_4) ** GOTO lbl33
                v33 /* !! */  = if.lu;
                if (true) ** GOTO lbl169
                block87: while (true) {
                    v33 /* !! */  = (long)(v34 - if.ffjy("fhzm", fgdj(int ), (int)228));
lbl169:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -602784586: {
                            v34 = if.ffjy("fhzn", fgdj(int ), (int)229);
                            continue block87;
                        }
                        case 954647684: {
                            v34 = if.ffjy("fhzo", fgdj(int ), (int)230);
                            continue block87;
                        }
                        case 1721663922: {
                            v34 = if.ffjy("fhzp", fgdj(int ), (int)231);
                            continue block87;
                        }
                        case 1904238192: {
                            break block87;
                        }
                    }
                    break;
                }
                v35 /* !! */  = if.lu;
                if (true) ** GOTO lbl185
                block88: while (true) {
                    v35 /* !! */  = (long)(v36 - if.ffjy("fhzq", fgdj(int ), (int)232));
lbl185:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1716591521: {
                            v36 = if.ffjy("fhzr", fgdj(int ), (int)233);
                            continue block88;
                        }
                        case -827311219: {
                            v36 = if.ffjy("fhzs", fgdj(int ), (int)234);
                            continue block88;
                        }
                        case 1350878806: {
                            v36 = if.ffjy("fhzt", fgdj(int ), (int)235);
                            continue block88;
                        }
                        case 1904238192: {
                            break block88;
                        }
                    }
                    break;
                }
                this.heightOffset = this.wantedHeightOffset;
                if (var3_4 || var3_4) ** GOTO lbl33
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_8 = if.lu - if.ffjy("fhzu", fgdj(int ), (int)236)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == if.ffjy("fhzv", ffjv(int ), (int)598)) break;
                    v37 /* !! */  = (long)if.ffjy("fhzw", ffjv(int ), (int)599);
                }
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_9 = if.lu - if.ffjy("fhzx", fgdj(int ), (int)237)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == if.ffjy("fhzy", ffjv(int ), (int)600)) break;
                    v38 /* !! */  = (long)if.ffjy("fhzz", ffjv(int ), (int)601);
                }
                this.depthOffset = this.wantedDepthOffset;
                if (var3_4) ** GOTO lbl33
lbl211:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)if.ffjy("fiaa", ffjv(int ), (int)602);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 1: {
                var4_3 /* !! */  = (int)if.ffjy("fiab", ffjv(int ), (int)603);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 2: {
                var4_3 /* !! */  = (int)if.ffjy("fiac", ffjv(int ), (int)604);
                if (var5_2) {
                    throw null;
                }
            }
lbl228:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)if.ffjy("fiad", ffjv(int ), (int)605);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl233:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)if.ffjy("fiae", ffjv(int ), (int)606);
                if (!var5_2) ** GOTO lbl228
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)if.ffjy("fiaf", ffjv(int ), (int)607);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl242:
            // 5 sources

            case 6: {
                var4_3 /* !! */  = (int)if.ffjy("fiag", ffjv(int ), (int)608);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 7: {
                var4_3 /* !! */  = (int)if.ffjy("fiah", ffjv(int ), (int)609);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 8: {
                do {
                    var4_3 /* !! */  = (int)if.ffjy("fiai", ffjv(int ), (int)610);
                } while (!var5_2);
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)if.ffjy("fiaj", ffjv(int ), (int)611);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)if.ffjy("fiak", ffjv(int ), (int)612);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl296
                    break;
                }
            }
lbl267:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)if.ffjy("fial", ffjv(int ), (int)613);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl272:
            // 3 sources

            case 12: {
                var4_3 /* !! */  = (int)if.ffjy("fiam", ffjv(int ), (int)614);
                if (var5_2) {
                    throw null;
                }
            }
            case 13: {
                var4_3 /* !! */  = (int)if.ffjy("fian", ffjv(int ), (int)615);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
            case 14: {
                var4_3 /* !! */  = (int)if.ffjy("fiao", ffjv(int ), (int)616);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
lbl284:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)if.ffjy("fiap", ffjv(int ), (int)617);
                if (!var5_2) ** GOTO lbl267
                throw null;
            }
lbl288:
            // 3 sources

            case 16: {
                var4_3 /* !! */  = (int)if.ffjy("fiaq", ffjv(int ), (int)618);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
lbl292:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)if.ffjy("fiar", ffjv(int ), (int)619);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
lbl296:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)if.ffjy("fias", ffjv(int ), (int)620);
                if (!var5_2) ** GOTO lbl292
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)if.ffjy("fiat", ffjv(int ), (int)621);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)if.ffjy("fiau", ffjv(int ), (int)622);
                if (!var5_2) ** GOTO lbl284
                throw null;
            }
lbl308:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)if.ffjy("fiav", ffjv(int ), (int)623);
                if (!var5_2) ** GOTO lbl296
                throw null;
            }
            case 22: 
        }
        var4_3 /* !! */  = (int)if.ffjy("fiaw", ffjv(int ), (int)624);
        ** while (!var5_2)
lbl315:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fifp() {
        if.ffjw[100] = -1197711573;
        if.ffjw[101] = -1804333209;
        if.ffjw[102] = 1038941888;
        if.ffjw[103] = -2015968276;
        if.ffjw[104] = -2070158565;
        if.ffjw[105] = 393566072;
        if.ffjw[106] = 876684248;
        if.ffjw[107] = 1412585431;
        if.ffjw[108] = -1291013172;
        if.ffjw[109] = -1494160360;
        if.ffjw[110] = -20580273;
        if.ffjw[111] = -1909802764;
        if.ffjw[112] = -416180074;
        if.ffjw[113] = -1631399493;
        if.ffjw[114] = 1490209104;
        if.ffjw[115] = 392160909;
        if.ffjw[116] = -1902595213;
        if.ffjw[117] = -2076655476;
        if.ffjw[118] = -390770666;
        if.ffjw[119] = 317463158;
        if.ffjw[120] = 1148644348;
        if.ffjw[121] = 1231947144;
        if.ffjw[122] = 67658621;
        if.ffjw[123] = 1882214758;
        if.ffjw[124] = 1235013191;
        if.ffjw[125] = 2017194973;
        if.ffjw[126] = 2100465011;
        if.ffjw[127] = -142907371;
        if.ffjw[128] = -1530440659;
        if.ffjw[129] = -1591139120;
        if.ffjw[130] = 771534407;
        if.ffjw[131] = 1713572921;
        if.ffjw[132] = -1707907448;
        if.ffjw[133] = -1968114301;
        if.ffjw[134] = 2140080431;
        if.ffjw[135] = -1723391479;
        if.ffjw[136] = 1786975164;
        if.ffjw[137] = -2065695953;
        if.ffjw[138] = 2082826530;
        if.ffjw[139] = 686649743;
        if.ffjw[140] = -1938832280;
        if.ffjw[141] = 1004099807;
        if.ffjw[142] = -659475010;
        if.ffjw[143] = -508778828;
        if.ffjw[144] = 984936816;
        if.ffjw[145] = -459000659;
        if.ffjw[146] = -693458900;
        if.ffjw[147] = 1325074094;
        if.ffjw[148] = 1548950222;
        if.ffjw[149] = -1713390133;
        if.ffjw[150] = 1052801204;
        if.ffjw[151] = -1532600341;
        if.ffjw[152] = -1459418826;
        if.ffjw[153] = -722506261;
        if.ffjw[154] = 103265077;
        if.ffjw[155] = 1077940909;
        if.ffjw[156] = -491938861;
        if.ffjw[157] = -1156019164;
        if.ffjw[158] = 1480822920;
        if.ffjw[159] = 1017201389;
        if.ffjw[160] = -12802782;
        if.ffjw[161] = 1076172010;
        if.ffjw[162] = -948471775;
        if.ffjw[163] = 123241836;
        if.ffjw[164] = -530735626;
        if.ffjw[165] = 682590063;
        if.ffjw[166] = -1348546985;
        if.ffjw[167] = -326369593;
        if.ffjw[168] = -2000327785;
        if.ffjw[169] = -558941360;
        if.ffjw[170] = -856941299;
        if.ffjw[171] = 130582611;
        if.ffjw[172] = -1029393765;
        if.ffjw[173] = 144259907;
        if.ffjw[174] = 1734047939;
        if.ffjw[175] = -998880876;
        if.ffjw[176] = -1846804314;
        if.ffjw[177] = -1589066305;
        if.ffjw[178] = 1116347374;
        if.ffjw[179] = 2107943385;
        if.ffjw[180] = -542109495;
        if.ffjw[181] = 1288315436;
        if.ffjw[182] = 1219615164;
        if.ffjw[183] = 1942450351;
        if.ffjw[184] = 1557451235;
        if.ffjw[185] = 1489932452;
        if.ffjw[186] = 694881916;
        if.ffjw[187] = -399878086;
        if.ffjw[188] = -730608551;
        if.ffjw[189] = 1179890281;
        if.ffjw[190] = 1663009478;
        if.ffjw[191] = 1278091603;
        if.ffjw[192] = -1033816824;
        if.ffjw[193] = 132686531;
        if.ffjw[194] = -941537254;
        if.ffjw[195] = 639621113;
        if.ffjw[196] = -2057022537;
        if.ffjw[197] = -97347908;
        if.ffjw[198] = -1207644047;
        if.ffjw[199] = -850247588;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void applyAsMouseInput(ov var1_1, ov var2_2, boolean var3_3) {
        block79: {
            block78: {
                block77: {
                    var11_4 = if.c;
                    var10_5 /* !! */  = if.b;
                    var9_6 = if.a;
                    if (var11_4) {
                        throw null;
lbl6:
                        // 21 sources

                        return;
                    }
                    if (var9_6 || var9_6) ** GOTO lbl6
                    if (if.mc.field_1724 != null) break block77;
                    if (var9_6 || var9_6) ** GOTO lbl6
                    return;
                }
                if (var9_6 || var9_6) ** GOTO lbl6
                var4_7 = (float)Math.max((double)if.ffjy("fgbo", ffmw(int ), (int)1), nm.computeGcd());
                if (var9_6 || var9_6) ** GOTO lbl6
                var5_8 = class_3532.method_15393((float)(var2_2.getYaw() - var1_1.getYaw())) + this.yawMouseRemainder;
                if (var9_6 || var9_6) ** GOTO lbl6
                var6_9 = (float)Math.round(var5_8 / var4_7) * var4_7;
                if (var9_6 || var9_6) ** GOTO lbl6
                this.yawMouseRemainder = var5_8 - var6_9;
                if (var9_6 || var9_6) ** GOTO lbl6
                var7_10 = 0.0f;
                if (var9_6 || var9_6) ** GOTO lbl6
                if (!var3_3) break block78;
                if (var9_6 || var9_6) ** GOTO lbl6
                var8_11 = var2_2.getPitch() - var1_1.getPitch() + this.pitchMouseRemainder;
                if (var9_6 || var9_6) ** GOTO lbl6
                var7_10 = (float)Math.round(var8_11 / var4_7) * var4_7;
                if (var9_6 || var9_6) ** GOTO lbl6
                this.pitchMouseRemainder = var8_11 - var7_10;
                if (var9_6 || var9_6) ** GOTO lbl6
                if (var11_4) {
                    throw null;
                }
                break block79;
            }
            if (var9_6 || var9_6) ** GOTO lbl6
            this.pitchMouseRemainder = 0.0f;
            if (var9_6) ** GOTO lbl6
        }
        if (var9_6) ** GOTO lbl6
        if (var10_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_6) ** GOTO lbl6
                if (var6_9 != 0.0f) ** GOTO lbl49
                if (var9_6) ** GOTO lbl6
                if (var7_10 == 0.0f) ** GOTO lbl52
                if (var9_6) ** GOTO lbl6
lbl49:
                // 2 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                if.mc.field_1724.method_5872((double)var6_9 / if.ffjy("fgbp", ffmw(int ), (int)2), (double)var7_10 / if.ffjy("fgbr", ffmw(int ), (int)3));
                if (var9_6) ** GOTO lbl6
lbl52:
                // 2 sources

                if (!var9_6 && !var9_6) ** break;
                ** continue;
                return;
            }
lbl55:
            // 2 sources

            case 0: {
                var10_5 /* !! */  = (int)if.ffjy("fgbs", ffjv(int ), (int)166);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: {
                var10_5 /* !! */  = (int)if.ffjy("fgbt", ffjv(int ), (int)167);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl65:
            // 3 sources

            case 2: {
                var10_5 /* !! */  = (int)if.ffjy("fgbv", ffjv(int ), (int)168);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl70:
            // 3 sources

            case 3: {
                var10_5 /* !! */  = (int)if.ffjy("fgbw", ffjv(int ), (int)169);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl75:
            // 2 sources

            case 4: {
                var10_5 /* !! */  = (int)if.ffjy("fgbx", ffjv(int ), (int)170);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 5: {
                var10_5 /* !! */  = (int)if.ffjy("fgby", ffjv(int ), (int)171);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl85:
            // 2 sources

            case 6: {
                var10_5 /* !! */  = (int)if.ffjy("fgbz", ffjv(int ), (int)172);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl90:
            // 5 sources

            case 7: {
                var10_5 /* !! */  = (int)if.ffjy("fgca", ffjv(int ), (int)173);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 8: {
                var10_5 /* !! */  = (int)if.ffjy("fgcb", ffjv(int ), (int)174);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 9: {
                var10_5 /* !! */  = (int)if.ffjy("fgcc", ffjv(int ), (int)175);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl105:
            // 2 sources

            case 10: {
                var10_5 /* !! */  = (int)if.ffjy("fgcd", ffjv(int ), (int)176);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 11: {
                var10_5 /* !! */  = (int)if.ffjy("fgce", ffjv(int ), (int)177);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 12: {
                var10_5 /* !! */  = (int)if.ffjy("fgcf", ffjv(int ), (int)178);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl120:
            // 3 sources

            case 13: {
                var10_5 /* !! */  = (int)if.ffjy("fgcg", ffjv(int ), (int)179);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl125:
            // 2 sources

            case 14: {
                var10_5 /* !! */  = (int)if.ffjy("fgch", ffjv(int ), (int)180);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl130:
            // 3 sources

            case 15: {
                var10_5 /* !! */  = (int)if.ffjy("fgci", ffjv(int ), (int)181);
                if (!var11_4) ** GOTO lbl65
                throw null;
            }
lbl134:
            // 2 sources

            case 16: {
                var10_5 /* !! */  = (int)if.ffjy("fgcj", ffjv(int ), (int)182);
                if (!var11_4) ** GOTO lbl120
                throw null;
            }
            case 17: {
                var10_5 /* !! */  = (int)if.ffjy("fgck", ffjv(int ), (int)183);
                if (!var11_4) break;
                throw null;
            }
            case 18: {
                var10_5 /* !! */  = (int)if.ffjy("fgcl", ffjv(int ), (int)184);
                if (!var11_4) ** GOTO lbl90
                throw null;
            }
            case 19: {
                var10_5 /* !! */  = (int)if.ffjy("fgcn", ffjv(int ), (int)185);
                if (var11_4) {
                    throw null;
                }
            }
lbl150:
            // 4 sources

            case 20: {
                var10_5 /* !! */  = (int)if.ffjy("fgco", ffjv(int ), (int)186);
                if (!var11_4) ** GOTO lbl55
                throw null;
            }
            case 21: {
                var10_5 /* !! */  = (int)if.ffjy("fgcp", ffjv(int ), (int)187);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 22: {
                var10_5 /* !! */  = (int)if.ffjy("fgcq", ffjv(int ), (int)188);
                if (!var11_4) ** GOTO lbl65
                throw null;
            }
            case 23: {
                var10_5 /* !! */  = (int)if.ffjy("fgcs", ffjv(int ), (int)189);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl168:
            // 2 sources

            case 24: {
                var10_5 /* !! */  = (int)if.ffjy("fgct", ffjv(int ), (int)190);
                if (!var11_4) ** GOTO lbl75
                throw null;
            }
            case 25: {
                var10_5 /* !! */  = (int)if.ffjy("fgcu", ffjv(int ), (int)191);
                if (!var11_4) break;
                throw null;
            }
lbl176:
            // 2 sources

            case 26: {
                var10_5 /* !! */  = (int)if.ffjy("fgcv", ffjv(int ), (int)192);
                if (!var11_4) ** GOTO lbl130
                throw null;
            }
lbl180:
            // 2 sources

            case 27: {
                var10_5 /* !! */  = (int)if.ffjy("fgcw", ffjv(int ), (int)193);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl185:
            // 2 sources

            case 28: {
                var10_5 /* !! */  = (int)if.ffjy("fgcx", ffjv(int ), (int)194);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl190:
            // 3 sources

            case 29: {
                var10_5 /* !! */  = (int)if.ffjy("fgcy", ffjv(int ), (int)195);
                if (!var11_4) ** GOTO lbl90
                throw null;
            }
lbl194:
            // 2 sources

            case 30: {
                var10_5 /* !! */  = (int)if.ffjy("fgcz", ffjv(int ), (int)196);
                if (!var11_4) ** GOTO lbl130
                throw null;
            }
            case 31: {
                var10_5 /* !! */  = (int)if.ffjy("fgda", ffjv(int ), (int)197);
                if (!var11_4) ** GOTO lbl85
                throw null;
            }
lbl202:
            // 3 sources

            case 32: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_5 /* !! */  = (int)if.ffjy("fgdc", ffjv(int ), (int)198);
                    if (!var11_4) ** GOTO lbl180
                    throw null;
                }
            }
lbl207:
            // 2 sources

            case 33: {
                var10_5 /* !! */  = (int)if.ffjy("fgdd", ffjv(int ), (int)199);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl212:
            // 2 sources

            case 34: {
                var10_5 /* !! */  = (int)if.ffjy("fgde", ffjv(int ), (int)200);
                if (!var11_4) ** GOTO lbl70
                throw null;
            }
lbl216:
            // 2 sources

            case 35: {
                var10_5 /* !! */  = (int)if.ffjy("fgdf", ffjv(int ), (int)201);
                if (!var11_4) ** GOTO lbl105
                throw null;
            }
lbl220:
            // 3 sources

            case 36: {
                var10_5 /* !! */  = (int)if.ffjy("fgdg", ffjv(int ), (int)202);
                if (var11_4) {
                    throw null;
                }
            }
lbl224:
            // 4 sources

            case 37: {
                var10_5 /* !! */  = (int)if.ffjy("fgdh", ffjv(int ), (int)203);
                if (!var11_4) ** GOTO lbl120
                throw null;
            }
            case 38: 
        }
        var10_5 /* !! */  = (int)if.ffjy("fgdi", ffjv(int ), (int)204);
        ** while (!var11_4)
lbl231:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fijl() {
        if.ffnb[100] = 5235308836734774331L;
        if.ffnb[101] = 1578493939061308180L;
        if.ffnb[102] = 5245119769069792233L;
        if.ffnb[103] = -1335057568424140033L;
        if.ffnb[104] = -2082634305865324914L;
        if.ffnb[105] = -4712303636576553392L;
        if.ffnb[106] = -5886402994054400589L;
        if.ffnb[107] = 4819340960601969052L;
        if.ffnb[108] = 1727241591240618388L;
        if.ffnb[109] = 6700461885485770473L;
        if.ffnb[110] = 1715666565370142369L;
        if.ffnb[111] = -5459445631375059800L;
        if.ffnb[112] = 5020068532225210918L;
        if.ffnb[113] = -587239239059266711L;
        if.ffnb[114] = -1505929857190807016L;
        if.ffnb[115] = -7572451453211229596L;
        if.ffnb[116] = 7471295227592613053L;
        if.ffnb[117] = 8880351115191379728L;
        if.ffnb[118] = -3786142456799441433L;
        if.ffnb[119] = 3942652196929171169L;
        if.ffnb[120] = -1159415629491811095L;
        if.ffnb[121] = 5748473351279104924L;
        if.ffnb[122] = 6360474068229070671L;
        if.ffnb[123] = 6322245749575118313L;
        if.ffnb[124] = 9080182465766002152L;
        if.ffnb[125] = 7256731820600890210L;
        if.ffnb[126] = 2372209192001950661L;
        if.ffnb[127] = -8472847378451604178L;
        if.ffnb[128] = 6566288534287767120L;
        if.ffnb[129] = 1362419207997446035L;
        if.ffnb[130] = 581771780958229214L;
        if.ffnb[131] = -8496161372556644153L;
        if.ffnb[132] = 1965851912074065840L;
        if.ffnb[133] = -3862421440628254277L;
        if.ffnb[134] = 5293928520980338680L;
        if.ffnb[135] = 5979781336495795501L;
        if.ffnb[136] = -4918247405058993447L;
        if.ffnb[137] = -3635241959639202563L;
        if.ffnb[138] = -2593272425859097452L;
        if.ffnb[139] = -8921983051995925095L;
        if.ffnb[140] = 50444901792145326L;
        if.ffnb[141] = 425218742335575145L;
        if.ffnb[142] = 3157665498847524966L;
        if.ffnb[143] = 2669356053399965841L;
        if.ffnb[144] = 8828739281037565146L;
        if.ffnb[145] = 6631168302875167667L;
        if.ffnb[146] = 739809685978605162L;
        if.ffnb[147] = -536218948583071094L;
        if.ffnb[148] = -2589271311820383262L;
        if.ffnb[149] = 4883645838267135623L;
        if.ffnb[150] = 2104056409985400969L;
        if.ffnb[151] = -7756514276964986037L;
        if.ffnb[152] = 6727538908440926172L;
        if.ffnb[153] = 4736752432318192721L;
        if.ffnb[154] = 1182928219972197520L;
        if.ffnb[155] = -5592131219578671489L;
        if.ffnb[156] = -8262470780515967319L;
        if.ffnb[157] = -2502501550783670801L;
        if.ffnb[158] = -3251534962516578741L;
        if.ffnb[159] = 3293993483902964781L;
        if.ffnb[160] = 5370809615945184021L;
        if.ffnb[161] = 6565976037349823653L;
        if.ffnb[162] = -8720674398942497086L;
        if.ffnb[163] = -4468293770064473079L;
        if.ffnb[164] = -8841781596209867892L;
        if.ffnb[165] = 2864325133970578483L;
        if.ffnb[166] = 5380626911840772720L;
        if.ffnb[167] = 4936769242546801451L;
        if.ffnb[168] = -1056410130465604336L;
        if.ffnb[169] = -9105213574484950616L;
        if.ffnb[170] = -464693243266057765L;
        if.ffnb[171] = -6323121945324914764L;
        if.ffnb[172] = 4148601785719945640L;
        if.ffnb[173] = 7150506190430135476L;
        if.ffnb[174] = -1437194771781746984L;
        if.ffnb[175] = -222618071127426461L;
        if.ffnb[176] = 4066200880817204137L;
        if.ffnb[177] = -6722413031393857113L;
        if.ffnb[178] = 8798856322497054437L;
        if.ffnb[179] = -270962930350509488L;
        if.ffnb[180] = 7272006803104332777L;
        if.ffnb[181] = -1564026565152231559L;
        if.ffnb[182] = -3044108256911534663L;
        if.ffnb[183] = -3884018242323413741L;
        if.ffnb[184] = 1608901149422213189L;
        if.ffnb[185] = 5098394788107552065L;
        if.ffnb[186] = -4605759257662796276L;
        if.ffnb[187] = 9149251167086097161L;
        if.ffnb[188] = 8155230573515860586L;
        if.ffnb[189] = -3249278962160585511L;
        if.ffnb[190] = 4035335730317285376L;
        if.ffnb[191] = 2991238000322746088L;
        if.ffnb[192] = 3346931320622698407L;
        if.ffnb[193] = 4772336166727255486L;
        if.ffnb[194] = 7320648196105467059L;
        if.ffnb[195] = 3429056864569355548L;
        if.ffnb[196] = -2188578377693117534L;
        if.ffnb[197] = -3567296744962535421L;
        if.ffnb[198] = 1456700212435677359L;
        if.ffnb[199] = -4727299333404664028L;
    }

    private static /* synthetic */ void fihw() {
        if.ffjw[400] = -1951902443;
        if.ffjw[401] = -588575160;
        if.ffjw[402] = 700771675;
        if.ffjw[403] = -1027916326;
        if.ffjw[404] = -762307140;
        if.ffjw[405] = 1055347895;
        if.ffjw[406] = -309323375;
        if.ffjw[407] = -40541489;
        if.ffjw[408] = -1956200772;
        if.ffjw[409] = 730231127;
        if.ffjw[410] = 1562199239;
        if.ffjw[411] = -284489163;
        if.ffjw[412] = -868540943;
        if.ffjw[413] = -694208595;
        if.ffjw[414] = 559110114;
        if.ffjw[415] = -878073372;
        if.ffjw[416] = 1153857020;
        if.ffjw[417] = 1106529156;
        if.ffjw[418] = -857738829;
        if.ffjw[419] = 1670934433;
        if.ffjw[420] = -1414118882;
        if.ffjw[421] = -990510853;
        if.ffjw[422] = -988771589;
        if.ffjw[423] = -1723072346;
        if.ffjw[424] = 265519452;
        if.ffjw[425] = -1624745190;
        if.ffjw[426] = -1707256467;
        if.ffjw[427] = 1393483910;
        if.ffjw[428] = -1969895241;
        if.ffjw[429] = -1080161591;
        if.ffjw[430] = 338157642;
        if.ffjw[431] = -1702253565;
        if.ffjw[432] = -939915799;
        if.ffjw[433] = -1878665472;
        if.ffjw[434] = 421123613;
        if.ffjw[435] = -435978292;
        if.ffjw[436] = 385686989;
        if.ffjw[437] = 1616997142;
        if.ffjw[438] = 562896191;
        if.ffjw[439] = -1344701067;
        if.ffjw[440] = 57945440;
        if.ffjw[441] = 1239601432;
        if.ffjw[442] = 563664587;
        if.ffjw[443] = 1369619893;
        if.ffjw[444] = 262809137;
        if.ffjw[445] = 2051780890;
        if.ffjw[446] = -923147953;
        if.ffjw[447] = -1966519042;
        if.ffjw[448] = -1369152459;
        if.ffjw[449] = 363409397;
        if.ffjw[450] = 215157228;
        if.ffjw[451] = -1904227223;
        if.ffjw[452] = 283286963;
        if.ffjw[453] = 613574774;
        if.ffjw[454] = 215370929;
        if.ffjw[455] = 491218107;
        if.ffjw[456] = -954482818;
        if.ffjw[457] = 1874329408;
        if.ffjw[458] = -201650007;
        if.ffjw[459] = 124274495;
        if.ffjw[460] = 484360540;
        if.ffjw[461] = -1337456302;
        if.ffjw[462] = -383317668;
        if.ffjw[463] = -475819862;
        if.ffjw[464] = -627801256;
        if.ffjw[465] = 176399966;
        if.ffjw[466] = 1531347978;
        if.ffjw[467] = 913833488;
        if.ffjw[468] = -1406565860;
        if.ffjw[469] = -1149368661;
        if.ffjw[470] = -879785208;
        if.ffjw[471] = -1415551673;
        if.ffjw[472] = -579727561;
        if.ffjw[473] = 2038822063;
        if.ffjw[474] = 1717546064;
        if.ffjw[475] = -784120232;
        if.ffjw[476] = -552705719;
        if.ffjw[477] = -1566087152;
        if.ffjw[478] = -1616114002;
        if.ffjw[479] = -1565311901;
        if.ffjw[480] = -1816218146;
        if.ffjw[481] = 1211302028;
        if.ffjw[482] = 1311835751;
        if.ffjw[483] = 380125260;
        if.ffjw[484] = -1712902561;
        if.ffjw[485] = 1122076083;
        if.ffjw[486] = 1280001067;
        if.ffjw[487] = -308002545;
        if.ffjw[488] = 1670310298;
        if.ffjw[489] = 87039889;
        if.ffjw[490] = 936151875;
        if.ffjw[491] = 655193320;
        if.ffjw[492] = -1631177445;
        if.ffjw[493] = -1386682977;
        if.ffjw[494] = 55269835;
        if.ffjw[495] = 1893216515;
        if.ffjw[496] = -1971331686;
        if.ffjw[497] = -1689045394;
        if.ffjw[498] = -1961597593;
        if.ffjw[499] = 1662657066;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block235: {
            block234: {
                block233: {
                    block232: {
                        block231: {
                            block230: {
                                block229: {
                                    var29_5 = if.c;
                                    var28_6 /* !! */  = if.b;
                                    var27_7 = if.a;
                                    if (var29_5) {
                                        throw null;
lbl6:
                                        // 63 sources

                                        return null;
                                    }
                                    if (var27_7 || var27_7) ** GOTO lbl6
                                    var5_8 = hn.getInstance();
                                    if (var27_7 || var27_7) ** GOTO lbl6
                                    if (var5_8 == null) break block229;
                                    if (var27_7) ** GOTO lbl6
                                    if (if.mc.field_1724 != null) break block230;
                                    if (var27_7) ** GOTO lbl6
                                }
                                if (var27_7 || var27_7) ** GOTO lbl6
                                return var1_1;
                            }
                            if (var27_7 || var27_7) ** GOTO lbl6
                            if (var4_4 != null) break block231;
                            if (var27_7) ** GOTO lbl6
                            v0 /* !! */  = if.ffjy("ffli", ffjv(int ), (int)16);
                            if (var29_5) {
                                throw null;
                            }
                            break block232;
                        }
                        if (var27_7 || var27_7) ** GOTO lbl6
                        v0 /* !! */  = var6_9 /* !! */  = (CallSite)var4_4.method_5628();
                    }
                    if (var27_7 || var27_7) ** GOTO lbl6
                    if (var6_9 /* !! */  == this.targetId) break block233;
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.yawVelocity = 0.0f;
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.pitchVelocity = 0.0f;
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.targetId = (int)var6_9 /* !! */ ;
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.chooseNextPoint((boolean)if.ffjy("ffll", ffjv(int ), (int)17));
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.chooseNextNoise((boolean)if.ffjy("fflm", ffjv(int ), (int)18));
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.cancelMiss();
                    if (var27_7 || var27_7) ** GOTO lbl6
                    this.scheduleNextMiss(System.currentTimeMillis());
                    if (var27_7) ** GOTO lbl6
                }
                if (var27_7 || var27_7) ** GOTO lbl6
                var7_10 = this.frameSeconds();
                if (var27_7 || var27_7) ** GOTO lbl6
                var8_11 = System.currentTimeMillis();
                if (var27_7 || var27_7) ** GOTO lbl6
                this.updateMissState(var5_8, var1_1, var4_4, var8_11);
                if (var27_7 || var27_7) ** GOTO lbl6
                if (var4_4 == null) break block234;
                if (var27_7 || var27_7) ** GOTO lbl6
                var2_2 = this.multipointAngle(var4_4, var7_10);
                if (var27_7) ** GOTO lbl6
            }
            if (var27_7 || var27_7) ** GOTO lbl6
            var2_2 = this.applyHumanNoise(var2_2, var7_10, var8_11);
            if (var27_7 || var27_7) ** GOTO lbl6
            if (!this.missActive) break block235;
            if (var27_7 || var27_7) ** GOTO lbl6
            var2_2 = new ov(var2_2.getYaw() + this.missYawOffset, class_3532.method_15363((float)(var2_2.getPitch() + this.missPitchOffset), (float)if.ffjy("fflt", ffka(int ), (int)19), (float)if.ffjy("fflu", ffka(int ), (int)20)));
            if (var27_7) ** GOTO lbl6
        }
        if (var27_7) ** GOTO lbl6
        if (var28_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var28_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var27_7) ** GOTO lbl6
                var10_12 = ow.calculateDelta(var1_1, var2_2);
                if (var27_7 || var27_7) ** GOTO lbl6
                var11_13 = (float)Math.hypot(var10_12.getYaw(), var10_12.getPitch());
                if (var27_7 || var27_7) ** GOTO lbl6
                var12_14 = this.updateHumanTempo(var7_10, var11_13, var8_11);
                if (var27_7 || var27_7) ** GOTO lbl6
                var13_15 = class_3532.method_15363((float)((Math.abs(var10_12.getYaw()) - if.ffjy("ffmc", ffka(int ), (int)21)) / if.ffjy("ffme", ffka(int ), (int)22)), (float)0.0f, (float)1.0f);
                if (var27_7 || var27_7) ** GOTO lbl6
                var13_15 = var13_15 * var13_15 * (if.ffjy("ffmf", ffka(int ), (int)23) - 2.0f * var13_15);
                if (var27_7 || var27_7) ** GOTO lbl6
                var12_14 *= 1.0f + var13_15 * if.ffjy("ffmg", ffka(int ), (int)24);
                if (var27_7 || var27_7) ** GOTO lbl6
                var14_16 = var5_8.legitAimSpeed.getValue();
                if (var27_7 || var27_7) ** GOTO lbl6
                var15_17 = class_3532.method_15363((float)((var14_16 - if.ffjy("ffmm", ffka(int ), (int)25)) / if.ffjy("ffmt", ffka(int ), (int)26)), (float)0.0f, (float)1.0f);
                if (var27_7 || var27_7) ** GOTO lbl6
                var16_18 = (float)Math.pow(var15_17, (double)if.ffjy("ffne", ffmw(int ), (int)0));
                if (var27_7 || var27_7) ** GOTO lbl6
                var17_19 = class_3532.method_15363((float)(Math.abs(var10_12.getYaw()) / if.ffjy("ffnh", ffka(int ), (int)27)), (float)if.ffjy("ffni", ffka(int ), (int)28), (float)1.0f);
                if (var27_7 || var27_7) ** GOTO lbl6
                var18_20 = (if.ffjy("ffnn", ffka(int ), (int)29) + if.ffjy("ffnp", ffka(int ), (int)30) * var16_18) * var12_14 * var17_19;
                if (var27_7 || var27_7) ** GOTO lbl6
                var19_21 = class_3532.method_15363((float)(var10_12.getYaw() * class_3532.method_16439((float)var15_17, (float)if.ffjy("ffnu", ffka(int ), (int)31), (float)if.ffjy("ffnw", ffka(int ), (int)32)) * var12_14), (float)(-var18_20), (float)var18_20);
                if (var27_7 || var27_7) ** GOTO lbl6
                this.yawVelocity = this.approach(this.yawVelocity, var19_21, (float)((if.ffjy("ffny", ffka(int ), (int)33) + if.ffjy("ffnz", ffka(int ), (int)34) * var16_18) * var12_14 * var7_10));
                if (var27_7 || var27_7) ** GOTO lbl6
                var20_22 = this.yawVelocity * var7_10;
                if (var27_7 || var27_7) ** GOTO lbl6
                if (!(Math.abs(var10_12.getYaw()) < Math.abs(var20_22))) ** GOTO lbl107
                if (var27_7 || var27_7) ** GOTO lbl6
                var20_22 = var10_12.getYaw();
                if (var27_7 || var27_7) ** GOTO lbl6
                this.yawVelocity *= if.ffjy("ffog", ffka(int ), (int)35);
                if (var27_7) ** GOTO lbl6
lbl107:
                // 2 sources

                if (var27_7 || var27_7) ** GOTO lbl6
                var21_23 = var1_1.getYaw() + var20_22;
                if (var27_7 || var27_7) ** GOTO lbl6
                var22_24 = if.mc.field_1724.method_36455();
                if (var27_7 || var27_7) ** GOTO lbl6
                if (!var5_8.legitPitch.isValue()) ** GOTO lbl136
                if (var27_7 || var27_7) ** GOTO lbl6
                var23_25 = class_3532.method_15363((float)(Math.abs(var10_12.getPitch()) / if.ffjy("ffol", ffka(int ), (int)36)), (float)if.ffjy("ffon", ffka(int ), (int)37), (float)1.0f);
                if (var27_7 || var27_7) ** GOTO lbl6
                var24_26 = (if.ffjy("ffoo", ffka(int ), (int)38) + if.ffjy("ffop", ffka(int ), (int)39) * var16_18) * var12_14 * var23_25;
                if (var27_7 || var27_7) ** GOTO lbl6
                var25_27 = class_3532.method_15363((float)(var10_12.getPitch() * class_3532.method_16439((float)var15_17, (float)if.ffjy("ffoq", ffka(int ), (int)40), (float)if.ffjy("ffor", ffka(int ), (int)41)) * var12_14), (float)(-var24_26), (float)var24_26);
                if (var27_7 || var27_7) ** GOTO lbl6
                this.pitchVelocity = this.approach(this.pitchVelocity, var25_27, (float)((if.ffjy("ffow", ffka(int ), (int)42) + if.ffjy("ffpd", ffka(int ), (int)43) * var16_18) * var12_14 * var7_10));
                if (var27_7 || var27_7) ** GOTO lbl6
                var26_28 = this.pitchVelocity * var7_10;
                if (var27_7 || var27_7) ** GOTO lbl6
                if (!(Math.abs(var10_12.getPitch()) < Math.abs(var26_28))) ** GOTO lbl130
                if (var27_7 || var27_7) ** GOTO lbl6
                var26_28 = var10_12.getPitch();
                if (var27_7 || var27_7) ** GOTO lbl6
                this.pitchVelocity *= if.ffjy("ffpk", ffka(int ), (int)44);
                if (var27_7) ** GOTO lbl6
lbl130:
                // 2 sources

                if (var27_7 || var27_7) ** GOTO lbl6
                var22_24 = class_3532.method_15363((float)(var1_1.getPitch() + var26_28), (float)if.ffjy("ffpn", ffka(int ), (int)45), (float)if.ffjy("ffpo", ffka(int ), (int)46));
                if (var27_7 || var27_7) ** GOTO lbl6
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl139
lbl136:
                // 1 sources

                if (var27_7 || var27_7) ** GOTO lbl6
                this.pitchVelocity = 0.0f;
                if (var27_7) ** GOTO lbl6
lbl139:
                // 2 sources

                if (!var27_7 && !var27_7) ** break;
                ** continue;
                return new ov(var21_23, var22_24);
            }
            case 0: {
                var28_6 /* !! */  = (int)if.ffjy("ffpw", ffjv(int ), (int)47);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 1: {
                var28_6 /* !! */  = (int)if.ffjy("ffqe", ffjv(int ), (int)48);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl657
            }
            case 2: {
                var28_6 /* !! */  = (int)if.ffjy("ffqg", ffjv(int ), (int)49);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl490
            }
            case 3: {
                var28_6 /* !! */  = (int)if.ffjy("ffqj", ffjv(int ), (int)50);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl538
            }
lbl162:
            // 2 sources

            case 4: {
                var28_6 /* !! */  = (int)if.ffjy("ffqm", ffjv(int ), (int)51);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl625
            }
lbl167:
            // 2 sources

            case 5: {
                var28_6 /* !! */  = (int)if.ffjy("ffqq", ffjv(int ), (int)52);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl172:
            // 5 sources

            case 6: {
                var28_6 /* !! */  = (int)if.ffjy("ffqt", ffjv(int ), (int)53);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 7: {
                var28_6 /* !! */  = (int)if.ffjy("ffqw", ffjv(int ), (int)54);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 8: {
                var28_6 /* !! */  = (int)if.ffjy("ffra", ffjv(int ), (int)55);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl390
            }
            case 9: {
                var28_6 /* !! */  = (int)if.ffjy("ffrd", ffjv(int ), (int)56);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl517
            }
            case 10: {
                var28_6 /* !! */  = (int)if.ffjy("ffrh", ffjv(int ), (int)57);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl444
            }
            case 11: {
                var28_6 /* !! */  = (int)if.ffjy("ffrj", ffjv(int ), (int)58);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl426
            }
            case 12: {
                var28_6 /* !! */  = (int)if.ffjy("ffrl", ffjv(int ), (int)59);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl207:
            // 4 sources

            case 13: {
                var28_6 /* !! */  = (int)if.ffjy("ffrp", ffjv(int ), (int)60);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl212:
            // 2 sources

            case 14: {
                var28_6 /* !! */  = (int)if.ffjy("ffrr", ffjv(int ), (int)61);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl597
            }
lbl217:
            // 2 sources

            case 15: {
                var28_6 /* !! */  = (int)if.ffjy("ffrx", ffjv(int ), (int)62);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl546
            }
            case 16: {
                var28_6 /* !! */  = (int)if.ffjy("ffsb", ffjv(int ), (int)63);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl417
            }
            case 17: {
                var28_6 /* !! */  = (int)if.ffjy("ffse", ffjv(int ), (int)64);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 18: {
                var28_6 /* !! */  = (int)if.ffjy("ffsh", ffjv(int ), (int)65);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl237:
            // 2 sources

            case 19: {
                var28_6 /* !! */  = (int)if.ffjy("ffsl", ffjv(int ), (int)66);
                if (!var29_5) break;
                throw null;
            }
lbl241:
            // 3 sources

            case 20: {
                var28_6 /* !! */  = (int)if.ffjy("ffsn", ffjv(int ), (int)67);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl246:
            // 2 sources

            case 21: {
                var28_6 /* !! */  = (int)if.ffjy("ffso", ffjv(int ), (int)68);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl251:
            // 4 sources

            case 22: {
                var28_6 /* !! */  = (int)if.ffjy("ffss", ffjv(int ), (int)69);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl256:
            // 2 sources

            case 23: {
                var28_6 /* !! */  = (int)if.ffjy("ffsu", ffjv(int ), (int)70);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl542
            }
            case 24: {
                var28_6 /* !! */  = (int)if.ffjy("ffsx", ffjv(int ), (int)71);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl625
            }
lbl266:
            // 2 sources

            case 25: {
                var28_6 /* !! */  = (int)if.ffjy("ffta", ffjv(int ), (int)72);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
            case 26: {
                var28_6 /* !! */  = (int)if.ffjy("fftc", ffjv(int ), (int)73);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl621
            }
lbl276:
            // 4 sources

            case 27: {
                var28_6 /* !! */  = (int)if.ffjy("ffte", ffjv(int ), (int)74);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 28: {
                var28_6 /* !! */  = (int)if.ffjy("fftk", ffjv(int ), (int)75);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl286:
            // 2 sources

            case 29: {
                var28_6 /* !! */  = (int)if.ffjy("fftm", ffjv(int ), (int)76);
                if (!var29_5) ** GOTO lbl207
                throw null;
            }
lbl290:
            // 2 sources

            case 30: {
                var28_6 /* !! */  = (int)if.ffjy("ffto", ffjv(int ), (int)77);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl605
            }
            case 31: {
                var28_6 /* !! */  = (int)if.ffjy("fftp", ffjv(int ), (int)78);
                if (!var29_5) ** GOTO lbl207
                throw null;
            }
lbl299:
            // 5 sources

            case 32: {
                var28_6 /* !! */  = (int)if.ffjy("fftq", ffjv(int ), (int)79);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl304:
            // 4 sources

            case 33: {
                var28_6 /* !! */  = (int)if.ffjy("ffts", ffjv(int ), (int)80);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl309:
            // 3 sources

            case 34: {
                var28_6 /* !! */  = (int)if.ffjy("fftu", ffjv(int ), (int)81);
                if (!var29_5) ** GOTO lbl299
                throw null;
            }
            case 35: {
                var28_6 /* !! */  = (int)if.ffjy("fftz", ffjv(int ), (int)82);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl568
            }
lbl318:
            // 2 sources

            case 36: {
                var28_6 /* !! */  = (int)if.ffjy("ffub", ffjv(int ), (int)83);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl323:
            // 2 sources

            case 37: {
                var28_6 /* !! */  = (int)if.ffjy("ffuc", ffjv(int ), (int)84);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl625
            }
            case 38: {
                var28_6 /* !! */  = (int)if.ffjy("ffud", ffjv(int ), (int)85);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl525
            }
            case 39: {
                var28_6 /* !! */  = (int)if.ffjy("ffue", ffjv(int ), (int)86);
                if (!var29_5) ** GOTO lbl172
                throw null;
            }
            case 40: {
                var28_6 /* !! */  = (int)if.ffjy("ffug", ffjv(int ), (int)87);
                if (!var29_5) ** GOTO lbl237
                throw null;
            }
lbl341:
            // 2 sources

            case 41: {
                var28_6 /* !! */  = (int)if.ffjy("ffuk", ffjv(int ), (int)88);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl408
            }
            case 42: {
                var28_6 /* !! */  = (int)if.ffjy("ffuo", ffjv(int ), (int)89);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl576
            }
lbl351:
            // 4 sources

            case 43: {
                var28_6 /* !! */  = (int)if.ffjy("ffuq", ffjv(int ), (int)90);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl529
            }
            case 44: {
                var28_6 /* !! */  = (int)if.ffjy("ffur", ffjv(int ), (int)91);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl361:
            // 2 sources

            case 45: {
                var28_6 /* !! */  = (int)if.ffjy("ffut", ffjv(int ), (int)92);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl476
            }
lbl366:
            // 2 sources

            case 46: {
                var28_6 /* !! */  = (int)if.ffjy("ffuv", ffjv(int ), (int)93);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl504
            }
lbl371:
            // 3 sources

            case 47: {
                var28_6 /* !! */  = (int)if.ffjy("ffuy", ffjv(int ), (int)94);
                if (!var29_5) ** GOTO lbl241
                throw null;
            }
lbl375:
            // 2 sources

            case 48: {
                var28_6 /* !! */  = (int)if.ffjy("ffva", ffjv(int ), (int)95);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl417
            }
lbl380:
            // 3 sources

            case 49: {
                var28_6 /* !! */  = (int)if.ffjy("ffvb", ffjv(int ), (int)96);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl653
            }
            case 50: {
                var28_6 /* !! */  = (int)if.ffjy("ffvc", ffjv(int ), (int)97);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl669
            }
lbl390:
            // 5 sources

            case 51: {
                var28_6 /* !! */  = (int)if.ffjy("ffvg", ffjv(int ), (int)98);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl645
            }
            case 52: {
                var28_6 /* !! */  = (int)if.ffjy("ffvh", ffjv(int ), (int)99);
                if (!var29_5) ** GOTO lbl361
                throw null;
            }
lbl399:
            // 2 sources

            case 53: {
                var28_6 /* !! */  = (int)if.ffjy("ffvi", ffjv(int ), (int)100);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl601
            }
            case 54: {
                var28_6 /* !! */  = (int)if.ffjy("ffvl", ffjv(int ), (int)101);
                if (!var29_5) ** GOTO lbl286
                throw null;
            }
lbl408:
            // 2 sources

            case 55: {
                var28_6 /* !! */  = (int)if.ffjy("ffvr", ffjv(int ), (int)102);
                if (!var29_5) ** GOTO lbl276
                throw null;
            }
lbl412:
            // 2 sources

            case 56: {
                var28_6 /* !! */  = (int)if.ffjy("ffvs", ffjv(int ), (int)103);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl417:
            // 3 sources

            case 57: {
                var28_6 /* !! */  = (int)if.ffjy("ffvw", ffjv(int ), (int)104);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl617
            }
lbl422:
            // 2 sources

            case 58: {
                var28_6 /* !! */  = (int)if.ffjy("ffvz", ffjv(int ), (int)105);
                if (!var29_5) ** GOTO lbl172
                throw null;
            }
lbl426:
            // 2 sources

            case 59: {
                var28_6 /* !! */  = (int)if.ffjy("ffwc", ffjv(int ), (int)106);
                if (!var29_5) ** GOTO lbl366
                throw null;
            }
lbl430:
            // 2 sources

            case 60: {
                var28_6 /* !! */  = (int)if.ffjy("ffwd", ffjv(int ), (int)107);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl435:
            // 2 sources

            case 61: {
                var28_6 /* !! */  = (int)if.ffjy("ffwk", ffjv(int ), (int)108);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl564
            }
lbl440:
            // 3 sources

            case 62: {
                var28_6 /* !! */  = (int)if.ffjy("ffwm", ffjv(int ), (int)109);
                if (!var29_5) ** GOTO lbl371
                throw null;
            }
lbl444:
            // 3 sources

            case 63: {
                var28_6 /* !! */  = (int)if.ffjy("ffwn", ffjv(int ), (int)110);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl449:
            // 2 sources

            case 64: {
                var28_6 /* !! */  = (int)if.ffjy("ffwq", ffjv(int ), (int)111);
                if (!var29_5) ** GOTO lbl276
                throw null;
            }
            case 65: {
                var28_6 /* !! */  = (int)if.ffjy("ffwt", ffjv(int ), (int)112);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl495
            }
            case 66: {
                var28_6 /* !! */  = (int)if.ffjy("ffww", ffjv(int ), (int)113);
                if (!var29_5) ** GOTO lbl309
                throw null;
            }
lbl462:
            // 2 sources

            case 67: {
                var28_6 /* !! */  = (int)if.ffjy("ffwy", ffjv(int ), (int)114);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl653
            }
lbl467:
            // 3 sources

            case 68: {
                var28_6 /* !! */  = (int)if.ffjy("ffxb", ffjv(int ), (int)115);
                if (!var29_5) ** GOTO lbl390
                throw null;
            }
            case 69: {
                var28_6 /* !! */  = (int)if.ffjy("ffxd", ffjv(int ), (int)116);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl641
            }
lbl476:
            // 2 sources

            case 70: {
                var28_6 /* !! */  = (int)if.ffjy("ffxg", ffjv(int ), (int)117);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl657
            }
lbl481:
            // 2 sources

            case 71: {
                var28_6 /* !! */  = (int)if.ffjy("ffxh", ffjv(int ), (int)118);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl613
            }
            case 72: {
                var28_6 /* !! */  = (int)if.ffjy("ffxi", ffjv(int ), (int)119);
                if (!var29_5) ** GOTO lbl399
                throw null;
            }
lbl490:
            // 4 sources

            case 73: {
                var28_6 /* !! */  = (int)if.ffjy("ffxl", ffjv(int ), (int)120);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl512
            }
lbl495:
            // 2 sources

            case 74: {
                var28_6 /* !! */  = (int)if.ffjy("ffxr", ffjv(int ), (int)121);
                if (!var29_5) ** GOTO lbl304
                throw null;
            }
            case 75: {
                var28_6 /* !! */  = (int)if.ffjy("ffxs", ffjv(int ), (int)122);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl504:
            // 3 sources

            case 76: {
                var28_6 /* !! */  = (int)if.ffjy("ffxt", ffjv(int ), (int)123);
                if (!var29_5) ** GOTO lbl212
                throw null;
            }
lbl508:
            // 3 sources

            case 77: {
                var28_6 /* !! */  = (int)if.ffjy("ffxu", ffjv(int ), (int)124);
                if (!var29_5) ** GOTO lbl440
                throw null;
            }
lbl512:
            // 2 sources

            case 78: {
                var28_6 /* !! */  = (int)if.ffjy("ffxw", ffjv(int ), (int)125);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl529
            }
lbl517:
            // 3 sources

            case 79: {
                var28_6 /* !! */  = (int)if.ffjy("ffxz", ffjv(int ), (int)126);
                if (!var29_5) ** GOTO lbl318
                throw null;
            }
lbl521:
            // 2 sources

            case 80: {
                var28_6 /* !! */  = (int)if.ffjy("ffyc", ffjv(int ), (int)127);
                if (!var29_5) ** GOTO lbl351
                throw null;
            }
lbl525:
            // 4 sources

            case 81: {
                var28_6 /* !! */  = (int)if.ffjy("ffye", ffjv(int ), (int)128);
                if (!var29_5) ** GOTO lbl251
                throw null;
            }
lbl529:
            // 3 sources

            case 82: {
                var28_6 /* !! */  = (int)if.ffjy("ffyi", ffjv(int ), (int)129);
                if (!var29_5) ** GOTO lbl525
                throw null;
            }
lbl533:
            // 2 sources

            case 83: {
                var28_6 /* !! */  = (int)if.ffjy("ffyk", ffjv(int ), (int)130);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl554
            }
lbl538:
            // 2 sources

            case 84: {
                var28_6 /* !! */  = (int)if.ffjy("ffyn", ffjv(int ), (int)131);
                if (!var29_5) ** GOTO lbl172
                throw null;
            }
lbl542:
            // 2 sources

            case 85: {
                var28_6 /* !! */  = (int)if.ffjy("ffyo", ffjv(int ), (int)132);
                if (!var29_5) ** GOTO lbl435
                throw null;
            }
lbl546:
            // 2 sources

            case 86: {
                var28_6 /* !! */  = (int)if.ffjy("ffyq", ffjv(int ), (int)133);
                if (!var29_5) ** GOTO lbl517
                throw null;
            }
lbl550:
            // 3 sources

            case 87: {
                var28_6 /* !! */  = (int)if.ffjy("ffys", ffjv(int ), (int)134);
                if (!var29_5) ** GOTO lbl380
                throw null;
            }
lbl554:
            // 2 sources

            case 88: {
                var28_6 /* !! */  = (int)if.ffjy("ffyw", ffjv(int ), (int)135);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl597
            }
            case 89: {
                do {
                    var28_6 /* !! */  = (int)if.ffjy("ffyz", ffjv(int ), (int)136);
                } while (!var29_5);
                throw null;
            }
lbl564:
            // 2 sources

            case 90: {
                var28_6 /* !! */  = (int)if.ffjy("ffzc", ffjv(int ), (int)137);
                if (!var29_5) ** GOTO lbl508
                throw null;
            }
lbl568:
            // 2 sources

            case 91: {
                var28_6 /* !! */  = (int)if.ffjy("ffzf", ffjv(int ), (int)138);
                if (!var29_5) ** GOTO lbl550
                throw null;
            }
            case 92: {
                var28_6 /* !! */  = (int)if.ffjy("ffzi", ffjv(int ), (int)139);
                if (!var29_5) ** GOTO lbl481
                throw null;
            }
lbl576:
            // 2 sources

            case 93: {
                var28_6 /* !! */  = (int)if.ffjy("ffzj", ffjv(int ), (int)140);
                if (var29_5) {
                    throw null;
                }
                ** GOTO lbl585
            }
            case 94: {
                var28_6 /* !! */  = (int)if.ffjy("ffzk", ffjv(int ), (int)141);
                if (!var29_5) ** GOTO lbl299
                throw null;
            }
lbl585:
            // 2 sources

            case 95: {
                var28_6 /* !! */  = (int)if.ffjy("ffzn", ffjv(int ), (int)142);
                if (!var29_5) ** GOTO lbl162
                throw null;
            }
            case 96: {
                var28_6 /* !! */  = (int)if.ffjy("ffzr", ffjv(int ), (int)143);
                if (!var29_5) ** GOTO lbl246
                throw null;
            }
            case 97: {
                var28_6 /* !! */  = (int)if.ffjy("ffzs", ffjv(int ), (int)144);
                if (!var29_5) ** GOTO lbl172
                throw null;
            }
lbl597:
            // 3 sources

            case 98: {
                var28_6 /* !! */  = (int)if.ffjy("ffzt", ffjv(int ), (int)145);
                if (!var29_5) ** GOTO lbl550
                throw null;
            }
lbl601:
            // 2 sources

            case 99: {
                var28_6 /* !! */  = (int)if.ffjy("ffzv", ffjv(int ), (int)146);
                if (!var29_5) ** GOTO lbl217
                throw null;
            }
lbl605:
            // 2 sources

            case 100: {
                var28_6 /* !! */  = (int)if.ffjy("ffzy", ffjv(int ), (int)147);
                if (!var29_5) ** GOTO lbl304
                throw null;
            }
            case 101: {
                var28_6 /* !! */  = (int)if.ffjy("fgab", ffjv(int ), (int)148);
                if (!var29_5) ** GOTO lbl504
                throw null;
            }
lbl613:
            // 2 sources

            case 102: {
                var28_6 /* !! */  = (int)if.ffjy("fgad", ffjv(int ), (int)149);
                if (!var29_5) ** GOTO lbl167
                throw null;
            }
lbl617:
            // 3 sources

            case 103: {
                var28_6 /* !! */  = (int)if.ffjy("fgag", ffjv(int ), (int)150);
                if (!var29_5) ** GOTO lbl525
                throw null;
            }
lbl621:
            // 2 sources

            case 104: {
                var28_6 /* !! */  = (int)if.ffjy("fgaj", ffjv(int ), (int)151);
                if (!var29_5) ** GOTO lbl533
                throw null;
            }
lbl625:
            // 4 sources

            case 105: {
                var28_6 /* !! */  = (int)if.ffjy("fgal", ffjv(int ), (int)152);
                if (!var29_5) ** GOTO lbl266
                throw null;
            }
            case 106: {
                var28_6 /* !! */  = (int)if.ffjy("fgam", ffjv(int ), (int)153);
                if (!var29_5) ** GOTO lbl309
                throw null;
            }
            case 107: {
                var28_6 /* !! */  = (int)if.ffjy("fgao", ffjv(int ), (int)154);
                if (!var29_5) ** GOTO lbl444
                throw null;
            }
            case 108: {
                var28_6 /* !! */  = (int)if.ffjy("fgaq", ffjv(int ), (int)155);
                if (!var29_5) ** GOTO lbl617
                throw null;
            }
lbl641:
            // 2 sources

            case 109: {
                var28_6 /* !! */  = (int)if.ffjy("fgat", ffjv(int ), (int)156);
                if (!var29_5) ** GOTO lbl430
                throw null;
            }
lbl645:
            // 2 sources

            case 110: {
                var28_6 /* !! */  = (int)if.ffjy("fgay", ffjv(int ), (int)157);
                if (!var29_5) ** GOTO lbl256
                throw null;
            }
            case 111: {
                var28_6 /* !! */  = (int)if.ffjy("fgaz", ffjv(int ), (int)158);
                if (!var29_5) ** GOTO lbl390
                throw null;
            }
lbl653:
            // 3 sources

            case 112: {
                var28_6 /* !! */  = (int)if.ffjy("fgbb", ffjv(int ), (int)159);
                if (!var29_5) ** GOTO lbl290
                throw null;
            }
lbl657:
            // 3 sources

            case 113: {
                var28_6 /* !! */  = (int)if.ffjy("fgbd", ffjv(int ), (int)160);
                if (!var29_5) ** GOTO lbl341
                throw null;
            }
            case 114: {
                var28_6 /* !! */  = (int)if.ffjy("fgbg", ffjv(int ), (int)161);
                if (!var29_5) ** GOTO lbl375
                throw null;
            }
            case 115: {
                var28_6 /* !! */  = (int)if.ffjy("fgbj", ffjv(int ), (int)162);
                if (!var29_5) ** GOTO lbl299
                throw null;
            }
lbl669:
            // 2 sources

            case 116: {
                var28_6 /* !! */  = (int)if.ffjy("fgbk", ffjv(int ), (int)163);
                if (!var29_5) ** GOTO lbl241
                throw null;
            }
            case 117: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var28_6 /* !! */  = (int)if.ffjy("fgbm", ffjv(int ), (int)164);
                    if (!var29_5) ** GOTO lbl207
                    throw null;
                }
            }
            case 118: 
        }
        var28_6 /* !! */  = (int)if.ffjy("fgbn", ffjv(int ), (int)165);
        ** while (!var29_5)
lbl681:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void chooseNextNoise(boolean var1_1) {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block73: while (true) {
            v0 /* !! */  = (long)(if.ffjy("fghi", fgdj(int ), (int)59) - if.ffjy("fghh", fgdj(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -113750516: {
                    continue block73;
                }
                case 1904238192: {
                    break block73;
                }
            }
            break;
        }
        var5_2 = if.c;
        v1 /* !! */  = if.lu;
        if (true) ** GOTO lbl15
        block74: while (true) {
            v1 /* !! */  = (long)(v2 - if.ffjy("fghj", fgdj(int ), (int)60));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1246499124: {
                    v2 = if.ffjy("fghk", fgdj(int ), (int)61);
                    continue block74;
                }
                case -1014485193: {
                    v2 = if.ffjy("fghl", fgdj(int ), (int)62);
                    continue block74;
                }
                case -635069980: {
                    v2 = if.ffjy("fghm", fgdj(int ), (int)63);
                    continue block74;
                }
                case 1904238192: {
                    break block74;
                }
            }
            break;
        }
        var4_3 /* !! */  = if.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fghn", fgdj(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == if.ffjy("fgho", ffjv(int ), (int)252)) break;
            v3 /* !! */  = (long)if.ffjy("fghp", ffjv(int ), (int)253);
        }
        var3_4 = if.a;
        if (var5_2) {
            throw null;
lbl36:
            // 9 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        v4 /* !! */  = if.lu;
        if (true) ** GOTO lbl43
        block77: while (true) {
            v4 /* !! */  = (long)(v5 - if.ffjy("fghq", fgdj(int ), (int)65));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1541190370: {
                    v5 = if.ffjy("fghr", fgdj(int ), (int)66);
                    continue block77;
                }
                case 1281244496: {
                    v5 = if.ffjy("fghs", fgdj(int ), (int)67);
                    continue block77;
                }
                case 1904238192: {
                    break block77;
                }
            }
            break;
        }
        var2_5 = ThreadLocalRandom.current();
        if (var3_4 || var3_4) ** GOTO lbl36
        v6 = if.ffjy("fght", ffka(int ), (int)254);
        v7 = if.ffjy("fghu", ffka(int ), (int)255);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fghv", fgdj(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == if.ffjy("fghw", ffjv(int ), (int)256)) break;
            v8 /* !! */  = (long)if.ffjy("fghx", ffjv(int ), (int)257);
        }
        v9 = var2_5.nextFloat((float)v6, (float)v7);
        v10 /* !! */  = if.lu;
        if (true) ** GOTO lbl66
        block79: while (true) {
            v10 /* !! */  = (long)(v11 - if.ffjy("fghy", fgdj(int ), (int)69));
lbl66:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -559269973: {
                    v11 = if.ffjy("fghz", fgdj(int ), (int)70);
                    continue block79;
                }
                case 477063105: {
                    v11 = if.ffjy("fgyg", fgdj(int ), (int)71);
                    continue block79;
                }
                case 566565931: {
                    v11 = if.ffjy("fgyh", fgdj(int ), (int)72);
                    continue block79;
                }
                case 1904238192: {
                    break block79;
                }
            }
            break;
        }
        this.wantedNoiseYaw = v9;
        if (var3_4 || var3_4) ** GOTO lbl36
        v12 = if.ffjy("fgyj", ffka(int ), (int)258);
        v13 = if.ffjy("fgyk", ffka(int ), (int)259);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fgym", fgdj(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == if.ffjy("fgyo", ffjv(int ), (int)260)) break;
            v14 /* !! */  = (long)if.ffjy("fgyr", ffjv(int ), (int)261);
        }
        v15 = var2_5.nextFloat((float)v12, (float)v13);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_3 = if.lu - if.ffjy("fgyw", fgdj(int ), (int)74)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == if.ffjy("fgyy", ffjv(int ), (int)262)) break;
            v16 /* !! */  = (long)if.ffjy("fgza", ffjv(int ), (int)263);
        }
        this.wantedNoisePitch = v15;
        if (var3_4 || var3_4) ** GOTO lbl36
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_4 = if.lu - if.ffjy("fgzd", fgdj(int ), (int)75)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == if.ffjy("fgze", ffjv(int ), (int)264)) break;
            v17 /* !! */  = (long)if.ffjy("fgzf", ffjv(int ), (int)265);
        }
        v18 = System.currentTimeMillis();
        v19 = if.ffjy("fgzg", fgdj(int ), (int)76);
        v20 = if.ffjy("fgzn", fgdj(int ), (int)77);
        v21 /* !! */  = if.lu;
        if (true) ** GOTO lbl107
        block83: while (true) {
            v21 /* !! */  = (long)(v22 - if.ffjy("fgzo", fgdj(int ), (int)78));
lbl107:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1530916268: {
                    v22 = if.ffjy("fgzq", fgdj(int ), (int)79);
                    continue block83;
                }
                case 1005011533: {
                    v22 = if.ffjy("fgzr", fgdj(int ), (int)80);
                    continue block83;
                }
                case 1904238192: {
                    break block83;
                }
                case 1932920939: {
                    v22 = if.ffjy("fgzs", fgdj(int ), (int)81);
                    continue block83;
                }
            }
            break;
        }
        v23 = v18 + var2_5.nextLong((long)v19, (long)v20);
        v24 /* !! */  = if.lu;
        if (true) ** GOTO lbl124
        block84: while (true) {
            v24 /* !! */  = (long)(v25 - if.ffjy("fgzv", fgdj(int ), (int)82));
lbl124:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1515635317: {
                    v25 = if.ffjy("fgzw", fgdj(int ), (int)83);
                    continue block84;
                }
                case -276178136: {
                    v25 = if.ffjy("fgzx", fgdj(int ), (int)84);
                    continue block84;
                }
                case 1904238192: {
                    break block84;
                }
            }
            break;
        }
        this.nextNoiseChange = v23;
        if (var3_4 || var3_4) ** GOTO lbl36
        if (!var1_1) ** GOTO lbl195
        if (var3_4 || var3_4) ** GOTO lbl36
        v26 /* !! */  = if.lu;
        if (true) ** GOTO lbl141
        block85: while (true) {
            v26 /* !! */  = (long)(v27 - if.ffjy("fgzz", fgdj(int ), (int)85));
lbl141:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -1533556382: {
                    v27 = if.ffjy("fhaa", fgdj(int ), (int)86);
                    continue block85;
                }
                case 1657001425: {
                    v27 = if.ffjy("fhab", fgdj(int ), (int)87);
                    continue block85;
                }
                case 1904238192: {
                    break block85;
                }
            }
            break;
        }
        v28 /* !! */  = if.lu;
        if (true) ** GOTO lbl154
        block86: while (true) {
            v28 /* !! */  = (long)(v29 - if.ffjy("fhac", fgdj(int ), (int)88));
lbl154:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1723788608: {
                    v29 = if.ffjy("fhad", fgdj(int ), (int)89);
                    continue block86;
                }
                case -19165436: {
                    v29 = if.ffjy("fhae", fgdj(int ), (int)90);
                    continue block86;
                }
                case 1904238192: {
                    break block86;
                }
            }
            break;
        }
        this.noiseYaw = this.wantedNoiseYaw;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl36
                v30 /* !! */  = if.lu;
                if (true) ** GOTO lbl172
                block87: while (true) {
                    v30 /* !! */  = (long)(if.ffjy("fhah", fgdj(int ), (int)92) - if.ffjy("fhag", fgdj(int ), (int)91));
lbl172:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 1134515616: {
                            continue block87;
                        }
                        case 1904238192: {
                            break block87;
                        }
                    }
                    break;
                }
                v31 /* !! */  = if.lu;
                if (true) ** GOTO lbl181
                block88: while (true) {
                    v31 /* !! */  = (long)(v32 - if.ffjy("fhai", fgdj(int ), (int)93));
lbl181:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1994704290: {
                            v32 = if.ffjy("fhaj", fgdj(int ), (int)94);
                            continue block88;
                        }
                        case -1949739680: {
                            v32 = if.ffjy("fhak", fgdj(int ), (int)95);
                            continue block88;
                        }
                        case 1904238192: {
                            break block88;
                        }
                        case 1978743843: {
                            v32 = if.ffjy("fhal", fgdj(int ), (int)96);
                            continue block88;
                        }
                    }
                    break;
                }
                this.noisePitch = this.wantedNoisePitch;
                if (var3_4) ** GOTO lbl36
lbl195:
                // 2 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl198:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)if.ffjy("fham", ffjv(int ), (int)266);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 1: {
                var4_3 /* !! */  = (int)if.ffjy("fhan", ffjv(int ), (int)267);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 2: {
                var4_3 /* !! */  = (int)if.ffjy("fhao", ffjv(int ), (int)268);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl213:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)if.ffjy("fhap", ffjv(int ), (int)269);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl218:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)if.ffjy("fhar", ffjv(int ), (int)270);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 5: {
                var4_3 /* !! */  = (int)if.ffjy("fhas", ffjv(int ), (int)271);
                if (!var5_2) ** GOTO lbl218
                throw null;
            }
lbl227:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)if.ffjy("fhat", ffjv(int ), (int)272);
                if (!var5_2) break;
                throw null;
            }
lbl231:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)if.ffjy("fhau", ffjv(int ), (int)273);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl236:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)if.ffjy("fhav", ffjv(int ), (int)274);
                if (!var5_2) ** GOTO lbl213
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)if.ffjy("fhaw", ffjv(int ), (int)275);
                if (!var5_2) ** GOTO lbl231
                throw null;
            }
lbl244:
            // 5 sources

            case 10: {
                var4_3 /* !! */  = (int)if.ffjy("fhax", ffjv(int ), (int)276);
                if (!var5_2) ** GOTO lbl198
                throw null;
            }
lbl248:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)if.ffjy("fhay", ffjv(int ), (int)277);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 12: {
                var4_3 /* !! */  = (int)if.ffjy("fhaz", ffjv(int ), (int)278);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)if.ffjy("fhba", ffjv(int ), (int)279);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl272
                    break;
                }
            }
lbl264:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)if.ffjy("fhbb", ffjv(int ), (int)280);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
lbl268:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)if.ffjy("fhbc", ffjv(int ), (int)281);
                if (!var5_2) ** GOTO lbl248
                throw null;
            }
lbl272:
            // 5 sources

            case 16: {
                var4_3 /* !! */  = (int)if.ffjy("fhbd", ffjv(int ), (int)282);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)if.ffjy("fhbe", ffjv(int ), (int)283);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
            case 18: 
        }
        var4_3 /* !! */  = (int)if.ffjy("fhbf", ffjv(int ), (int)284);
        ** while (!var5_2)
lbl283:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateMissState(hn var1_1, ov var2_2, class_1297 var3_3, long var4_4) {
        block133: {
            block132: {
                block131: {
                    block130: {
                        block127: {
                            block129: {
                                block128: {
                                    block126: {
                                        block125: {
                                            var12_5 = if.c;
                                            var11_6 /* !! */  = if.b;
                                            var10_7 = if.a;
                                            if (var12_5) {
                                                throw null;
lbl6:
                                                // 34 sources

                                                return;
                                            }
                                            if (var10_7 || var10_7) ** GOTO lbl6
                                            if (!var1_1.legitMiss.isValue()) break block125;
                                            if (var10_7) ** GOTO lbl6
                                            if (var3_3 != null) break block126;
                                            if (var10_7) ** GOTO lbl6
                                        }
                                        if (var10_7 || var10_7) ** GOTO lbl6
                                        this.cancelMiss();
                                        if (var10_7 || var10_7) ** GOTO lbl6
                                        return;
                                    }
                                    if (var10_7 || var10_7) ** GOTO lbl6
                                    if (!this.missActive) break block127;
                                    if (var10_7 || var10_7) ** GOTO lbl6
                                    var6_8 = oy.rayTrace(var2_2.toVector(), var1_1.attackDistance(), var3_3.method_5829());
                                    if (var10_7 || var10_7) ** GOTO lbl6
                                    if (var6_8) break block128;
                                    if (var10_7) ** GOTO lbl6
                                    if (var4_4 - this.missStartedAt < if.ffjy("fheb", fgdj(int ), (int)106)) break block128;
                                    if (var10_7 || var10_7) ** GOTO lbl6
                                    this.missSwingReady = if.ffjy("fhec", ffjv(int ), (int)347);
                                    if (var10_7) ** GOTO lbl6
                                    if (var12_5) {
                                        throw null;
                                    }
                                    break block129;
                                }
                                if (var10_7 || var10_7) ** GOTO lbl6
                                if (var4_4 - this.missStartedAt <= if.ffjy("fhed", fgdj(int ), (int)107)) break block129;
                                if (var10_7 || var10_7) ** GOTO lbl6
                                this.cancelMiss();
                                if (var10_7 || var10_7) ** GOTO lbl6
                                this.scheduleNextMiss(var4_4);
                                if (var10_7) ** GOTO lbl6
                            }
                            if (var10_7 || var10_7) ** GOTO lbl6
                            return;
                        }
                        if (var10_7 || var10_7) ** GOTO lbl6
                        if (this.nextMissAt != if.ffjy("fhee", fgdj(int ), (int)108)) break block130;
                        if (var10_7 || var10_7) ** GOTO lbl6
                        this.scheduleNextMiss(var4_4);
                        if (var10_7) ** GOTO lbl6
                    }
                    if (var10_7 || var10_7) ** GOTO lbl6
                    if (var4_4 < this.nextMissAt) break block131;
                    if (var10_7) ** GOTO lbl6
                    if (!(if.mc.field_1724.method_7261((float)if.ffjy("fhef", ffka(int ), (int)348)) < if.ffjy("fheg", ffka(int ), (int)349))) break block132;
                    if (var10_7) ** GOTO lbl6
                }
                if (var10_7 || var10_7) ** GOTO lbl6
                return;
            }
            if (var10_7 || var10_7) ** GOTO lbl6
            if (oy.rayTrace(var2_2.toVector(), var1_1.attackDistance(), var3_3.method_5829())) break block133;
            if (var10_7 || var10_7) ** GOTO lbl6
            return;
        }
        if (var10_7 || var10_7) ** GOTO lbl6
        var6_9 = ThreadLocalRandom.current();
        if (var10_7 || var10_7) ** GOTO lbl6
        var7_10 = Math.max((double)if.ffjy("fheh", ffmw(int ), (int)109), if.mc.field_1724.method_33571().method_1022(var3_3.method_5829().method_1005()));
        if (var10_7 || var10_7) ** GOTO lbl6
        var9_11 = (float)Math.toDegrees(Math.atan2((double)var3_3.method_17681() * if.ffjy("fhei", ffmw(int ), (int)110), var7_10));
        if (var10_7 || var10_7) ** GOTO lbl6
        if (var6_9.nextBoolean()) {
            v0 /* !! */  = 1.0f;
            if (var12_5) {
                throw null;
            }
        } else {
            v0 /* !! */  = (float)if.ffjy("fhej", ffka(int ), (int)350);
        }
        this.missYawOffset = v0 /* !! */  * (var9_11 + var6_9.nextFloat((float)if.ffjy("fhek", ffka(int ), (int)351), (float)if.ffjy("fhel", ffka(int ), (int)352)));
        if (var10_7 || var10_7) ** GOTO lbl6
        this.missPitchOffset = var6_9.nextFloat((float)if.ffjy("fhem", ffka(int ), (int)353), (float)if.ffjy("fhen", ffka(int ), (int)354));
        if (var10_7 || var10_7) ** GOTO lbl6
        this.missStartedAt = var4_4;
        if (var11_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_7 || var10_7) ** GOTO lbl6
                this.missActive = if.ffjy("fheo", ffjv(int ), (int)355);
                if (var10_7 || var10_7) ** GOTO lbl6
                this.missSwingReady = if.ffjy("fhep", ffjv(int ), (int)356);
                if (!var10_7 && !var10_7) ** break;
                ** continue;
                return;
            }
            case 0: {
                var11_6 /* !! */  = (int)if.ffjy("fheq", ffjv(int ), (int)357);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl98:
            // 3 sources

            case 1: {
                var11_6 /* !! */  = (int)if.ffjy("fher", ffjv(int ), (int)358);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl103:
            // 3 sources

            case 2: {
                var11_6 /* !! */  = (int)if.ffjy("fhes", ffjv(int ), (int)359);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl317
            }
lbl108:
            // 3 sources

            case 3: {
                var11_6 /* !! */  = (int)if.ffjy("fhet", ffjv(int ), (int)360);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl113:
            // 2 sources

            case 4: {
                var11_6 /* !! */  = (int)if.ffjy("fheu", ffjv(int ), (int)361);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl118:
            // 2 sources

            case 5: {
                var11_6 /* !! */  = (int)if.ffjy("fhev", ffjv(int ), (int)362);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 6: {
                var11_6 /* !! */  = (int)if.ffjy("fhew", ffjv(int ), (int)363);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 7: {
                var11_6 /* !! */  = (int)if.ffjy("fhex", ffjv(int ), (int)364);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 8: {
                var11_6 /* !! */  = (int)if.ffjy("fhey", ffjv(int ), (int)365);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl138:
            // 4 sources

            case 9: {
                var11_6 /* !! */  = (int)if.ffjy("fhez", ffjv(int ), (int)366);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 10: {
                var11_6 /* !! */  = (int)if.ffjy("fhfa", ffjv(int ), (int)367);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 11: {
                var11_6 /* !! */  = (int)if.ffjy("fhfb", ffjv(int ), (int)368);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl153:
            // 2 sources

            case 12: {
                var11_6 /* !! */  = (int)if.ffjy("fhfc", ffjv(int ), (int)369);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl158:
            // 3 sources

            case 13: {
                var11_6 /* !! */  = (int)if.ffjy("fhfd", ffjv(int ), (int)370);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 14: {
                var11_6 /* !! */  = (int)if.ffjy("fhfe", ffjv(int ), (int)371);
                if (!var12_5) ** GOTO lbl103
                throw null;
            }
lbl167:
            // 2 sources

            case 15: {
                var11_6 /* !! */  = (int)if.ffjy("fhff", ffjv(int ), (int)372);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 16: {
                var11_6 /* !! */  = (int)if.ffjy("fhfg", ffjv(int ), (int)373);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 17: {
                var11_6 /* !! */  = (int)if.ffjy("fhfh", ffjv(int ), (int)374);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl182:
            // 4 sources

            case 18: {
                var11_6 /* !! */  = (int)if.ffjy("fhfi", ffjv(int ), (int)375);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl187:
            // 4 sources

            case 19: {
                var11_6 /* !! */  = (int)if.ffjy("fhfj", ffjv(int ), (int)376);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl192:
            // 4 sources

            case 20: {
                var11_6 /* !! */  = (int)if.ffjy("fhfk", ffjv(int ), (int)377);
                if (!var12_5) ** GOTO lbl158
                throw null;
            }
lbl196:
            // 3 sources

            case 21: {
                var11_6 /* !! */  = (int)if.ffjy("fhfl", ffjv(int ), (int)378);
                if (!var12_5) ** GOTO lbl187
                throw null;
            }
            case 22: {
                var11_6 /* !! */  = (int)if.ffjy("fhfm", ffjv(int ), (int)379);
                if (!var12_5) ** GOTO lbl182
                throw null;
            }
lbl204:
            // 2 sources

            case 23: {
                var11_6 /* !! */  = (int)if.ffjy("fhfn", ffjv(int ), (int)380);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 24: {
                var11_6 /* !! */  = (int)if.ffjy("fhfo", ffjv(int ), (int)381);
                if (!var12_5) ** GOTO lbl138
                throw null;
            }
            case 25: {
                var11_6 /* !! */  = (int)if.ffjy("fhfp", ffjv(int ), (int)382);
                if (!var12_5) ** GOTO lbl98
                throw null;
            }
lbl217:
            // 3 sources

            case 26: {
                var11_6 /* !! */  = (int)if.ffjy("fhfq", ffjv(int ), (int)383);
                if (!var12_5) ** GOTO lbl196
                throw null;
            }
lbl221:
            // 3 sources

            case 27: {
                var11_6 /* !! */  = (int)if.ffjy("fhkp", ffjv(int ), (int)384);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl357
            }
            case 28: {
                var11_6 /* !! */  = (int)if.ffjy("fhkr", ffjv(int ), (int)385);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl231:
            // 2 sources

            case 29: {
                var11_6 /* !! */  = (int)if.ffjy("fhks", ffjv(int ), (int)386);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl236:
            // 2 sources

            case 30: {
                var11_6 /* !! */  = (int)if.ffjy("fhkv", ffjv(int ), (int)387);
                if (!var12_5) ** GOTO lbl103
                throw null;
            }
            case 31: {
                var11_6 /* !! */  = (int)if.ffjy("fhkw", ffjv(int ), (int)388);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl245:
            // 2 sources

            case 32: {
                var11_6 /* !! */  = (int)if.ffjy("fhky", ffjv(int ), (int)389);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl250:
            // 2 sources

            case 33: {
                var11_6 /* !! */  = (int)if.ffjy("fhkz", ffjv(int ), (int)390);
                if (!var12_5) ** GOTO lbl108
                throw null;
            }
            case 34: {
                var11_6 /* !! */  = (int)if.ffjy("fhlf", ffjv(int ), (int)391);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl259:
            // 2 sources

            case 35: {
                var11_6 /* !! */  = (int)if.ffjy("fhlh", ffjv(int ), (int)392);
                if (!var12_5) ** GOTO lbl113
                throw null;
            }
            case 36: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_6 /* !! */  = (int)if.ffjy("fhlj", ffjv(int ), (int)393);
                    if (!var12_5) ** GOTO lbl98
                    throw null;
                }
            }
lbl268:
            // 4 sources

            case 37: {
                var11_6 /* !! */  = (int)if.ffjy("fhlk", ffjv(int ), (int)394);
                if (!var12_5) ** GOTO lbl192
                throw null;
            }
lbl272:
            // 2 sources

            case 38: {
                var11_6 /* !! */  = (int)if.ffjy("fhll", ffjv(int ), (int)395);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl321
            }
            case 39: {
                var11_6 /* !! */  = (int)if.ffjy("fhlm", ffjv(int ), (int)396);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl282:
            // 2 sources

            case 40: {
                do {
                    var11_6 /* !! */  = (int)if.ffjy("fhln", ffjv(int ), (int)397);
                } while (!var12_5);
                throw null;
            }
lbl287:
            // 2 sources

            case 41: {
                var11_6 /* !! */  = (int)if.ffjy("fhlp", ffjv(int ), (int)398);
                if (!var12_5) ** GOTO lbl217
                throw null;
            }
            case 42: {
                var11_6 /* !! */  = (int)if.ffjy("fhlr", ffjv(int ), (int)399);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 43: {
                var11_6 /* !! */  = (int)if.ffjy("fhlt", ffjv(int ), (int)400);
                if (!var12_5) ** GOTO lbl118
                throw null;
            }
lbl300:
            // 4 sources

            case 44: {
                var11_6 /* !! */  = (int)if.ffjy("fhlv", ffjv(int ), (int)401);
                if (!var12_5) ** GOTO lbl158
                throw null;
            }
lbl304:
            // 2 sources

            case 45: {
                var11_6 /* !! */  = (int)if.ffjy("fhlx", ffjv(int ), (int)402);
                if (!var12_5) ** GOTO lbl138
                throw null;
            }
lbl308:
            // 3 sources

            case 46: {
                var11_6 /* !! */  = (int)if.ffjy("fhlz", ffjv(int ), (int)403);
                if (!var12_5) ** GOTO lbl217
                throw null;
            }
            case 47: {
                var11_6 /* !! */  = (int)if.ffjy("fhma", ffjv(int ), (int)404);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl317:
            // 2 sources

            case 48: {
                var11_6 /* !! */  = (int)if.ffjy("fhmb", ffjv(int ), (int)405);
                if (!var12_5) ** GOTO lbl308
                throw null;
            }
lbl321:
            // 3 sources

            case 49: {
                var11_6 /* !! */  = (int)if.ffjy("fhme", ffjv(int ), (int)406);
                if (!var12_5) ** GOTO lbl268
                throw null;
            }
lbl325:
            // 2 sources

            case 50: {
                var11_6 /* !! */  = (int)if.ffjy("fhmh", ffjv(int ), (int)407);
                if (!var12_5) ** GOTO lbl231
                throw null;
            }
            case 51: {
                var11_6 /* !! */  = (int)if.ffjy("fhmj", ffjv(int ), (int)408);
                if (!var12_5) ** GOTO lbl287
                throw null;
            }
            case 52: {
                var11_6 /* !! */  = (int)if.ffjy("fhml", ffjv(int ), (int)409);
                if (!var12_5) ** GOTO lbl196
                throw null;
            }
lbl337:
            // 2 sources

            case 53: {
                var11_6 /* !! */  = (int)if.ffjy("fhmm", ffjv(int ), (int)410);
                if (!var12_5) ** GOTO lbl321
                throw null;
            }
lbl341:
            // 2 sources

            case 54: {
                var11_6 /* !! */  = (int)if.ffjy("fhmn", ffjv(int ), (int)411);
                if (!var12_5) ** GOTO lbl245
                throw null;
            }
lbl345:
            // 2 sources

            case 55: {
                var11_6 /* !! */  = (int)if.ffjy("fhmu", ffjv(int ), (int)412);
                if (!var12_5) ** GOTO lbl138
                throw null;
            }
            case 56: {
                var11_6 /* !! */  = (int)if.ffjy("fhmw", ffjv(int ), (int)413);
                if (!var12_5) ** GOTO lbl268
                throw null;
            }
            case 57: {
                var11_6 /* !! */  = (int)if.ffjy("fhmx", ffjv(int ), (int)414);
                if (!var12_5) ** GOTO lbl304
                throw null;
            }
lbl357:
            // 3 sources

            case 58: {
                var11_6 /* !! */  = (int)if.ffjy("fhmy", ffjv(int ), (int)415);
                if (!var12_5) ** GOTO lbl108
                throw null;
            }
            case 59: {
                var11_6 /* !! */  = (int)if.ffjy("fhna", ffjv(int ), (int)416);
                if (!var12_5) ** GOTO lbl167
                throw null;
            }
lbl365:
            // 2 sources

            case 60: {
                var11_6 /* !! */  = (int)if.ffjy("fhnc", ffjv(int ), (int)417);
                if (!var12_5) ** GOTO lbl187
                throw null;
            }
lbl369:
            // 2 sources

            case 61: {
                var11_6 /* !! */  = (int)if.ffjy("fhng", ffjv(int ), (int)418);
                if (!var12_5) ** GOTO lbl192
                throw null;
            }
            case 62: {
                var11_6 /* !! */  = (int)if.ffjy("fhnk", ffjv(int ), (int)419);
                if (!var12_5) ** GOTO lbl268
                throw null;
            }
lbl377:
            // 5 sources

            case 63: {
                var11_6 /* !! */  = (int)if.ffjy("fhnm", ffjv(int ), (int)420);
                if (!var12_5) ** GOTO lbl182
                throw null;
            }
            case 64: 
        }
        var11_6 /* !! */  = (int)if.ffjy("fhno", ffjv(int ), (int)421);
        ** while (!var12_5)
lbl384:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scheduleNextMiss(long var1_1) {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - if.ffjy("fhqu", fgdj(int ), (int)137));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1719814102: {
                    v1 = if.ffjy("fhqv", fgdj(int ), (int)138);
                    continue block31;
                }
                case 1717436723: {
                    v1 = if.ffjy("fhqw", fgdj(int ), (int)139);
                    continue block31;
                }
                case 1904238192: {
                    break block31;
                }
            }
            break;
        }
        var5_2 = if.c;
        v2 /* !! */  = if.lu;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(if.ffjy("fhqy", fgdj(int ), (int)141) - if.ffjy("fhqx", fgdj(int ), (int)140));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -120592122: {
                    continue block32;
                }
                case 1904238192: {
                    break block32;
                }
            }
            break;
        }
        var4_3 /* !! */  = if.b;
        v3 /* !! */  = if.lu;
        if (true) ** GOTO lbl29
        block33: while (true) {
            v3 /* !! */  = (long)(if.ffjy("fhra", fgdj(int ), (int)143) - if.ffjy("fhqz", fgdj(int ), (int)142));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1904238192: {
                    break block33;
                }
                case 2033925278: {
                    continue block33;
                }
            }
            break;
        }
        var3_4 = if.a;
        if (var5_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fhrb", fgdj(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == if.ffjy("fhrc", ffjv(int ), (int)463)) break;
            v4 /* !! */  = (long)if.ffjy("fhrd", ffjv(int ), (int)464);
        }
        v5 = ThreadLocalRandom.current();
        v6 = if.ffjy("fhre", fgdj(int ), (int)145);
        v7 = if.ffjy("fhrf", fgdj(int ), (int)146);
        v8 /* !! */  = if.lu;
        if (true) ** GOTO lbl52
        block36: while (true) {
            v8 /* !! */  = (long)(if.ffjy("fhrh", fgdj(int ), (int)148) - if.ffjy("fhrg", fgdj(int ), (int)147));
lbl52:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1101854599: {
                    continue block36;
                }
                case 1904238192: {
                    break block36;
                }
            }
            break;
        }
        v9 = var1_1 + v5.nextLong((long)v6, (long)v7);
        v10 /* !! */  = if.lu;
        if (true) ** GOTO lbl62
        block37: while (true) {
            v10 /* !! */  = (long)(v11 - if.ffjy("fhri", fgdj(int ), (int)149));
lbl62:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1036989058: {
                    v11 = if.ffjy("fhrj", fgdj(int ), (int)150);
                    continue block37;
                }
                case -617127658: {
                    v11 = if.ffjy("fhrk", fgdj(int ), (int)151);
                    continue block37;
                }
                case -434725872: {
                    v11 = if.ffjy("fhrl", fgdj(int ), (int)152);
                    continue block37;
                }
                case 1904238192: {
                    break block37;
                }
            }
            break;
        }
        this.nextMissAt = v9;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** continue;
                return;
            }
lbl80:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)if.ffjy("fhrm", ffjv(int ), (int)465);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 1: {
                var4_3 /* !! */  = (int)if.ffjy("fhrn", ffjv(int ), (int)466);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl90:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)if.ffjy("fhro", ffjv(int ), (int)467);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl100
                    break;
                }
            }
lbl96:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)if.ffjy("fhrp", ffjv(int ), (int)468);
                if (!var5_2) ** GOTO lbl80
                throw null;
            }
lbl100:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)if.ffjy("fhrq", ffjv(int ), (int)469);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)if.ffjy("fhrr", ffjv(int ), (int)470);
        ** while (!var5_2)
lbl107:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fiik() {
        if.ffjw[500] = -1887015253;
        if.ffjw[501] = 234766065;
        if.ffjw[502] = -492982370;
        if.ffjw[503] = 1815204511;
        if.ffjw[504] = -1642282735;
        if.ffjw[505] = -37990281;
        if.ffjw[506] = -152773990;
        if.ffjw[507] = 1821157742;
        if.ffjw[508] = -823648770;
        if.ffjw[509] = 943118706;
        if.ffjw[510] = 1039248239;
        if.ffjw[511] = -24993945;
        if.ffjw[512] = 1055598177;
        if.ffjw[513] = -1503139990;
        if.ffjw[514] = 1531486899;
        if.ffjw[515] = -949828849;
        if.ffjw[516] = 231367423;
        if.ffjw[517] = 1507556511;
        if.ffjw[518] = -2113807290;
        if.ffjw[519] = -922409590;
        if.ffjw[520] = 1411894557;
        if.ffjw[521] = -2007369298;
        if.ffjw[522] = -1837618291;
        if.ffjw[523] = -1608428350;
        if.ffjw[524] = 452776818;
        if.ffjw[525] = 2004658977;
        if.ffjw[526] = -580109093;
        if.ffjw[527] = -1191400095;
        if.ffjw[528] = -2058040779;
        if.ffjw[529] = -415006460;
        if.ffjw[530] = 256341884;
        if.ffjw[531] = -1588714758;
        if.ffjw[532] = -335516058;
        if.ffjw[533] = -1893725204;
        if.ffjw[534] = 1135065811;
        if.ffjw[535] = -1313670869;
        if.ffjw[536] = -1033401773;
        if.ffjw[537] = -1779195753;
        if.ffjw[538] = 484928385;
        if.ffjw[539] = -1751061447;
        if.ffjw[540] = -599254158;
        if.ffjw[541] = 1159398966;
        if.ffjw[542] = -623812824;
        if.ffjw[543] = -1858514621;
        if.ffjw[544] = -1171195324;
        if.ffjw[545] = -1641162908;
        if.ffjw[546] = 1809927497;
        if.ffjw[547] = -1489618531;
        if.ffjw[548] = -693505093;
        if.ffjw[549] = 572649831;
        if.ffjw[550] = -936487706;
        if.ffjw[551] = -45148035;
        if.ffjw[552] = -1559873102;
        if.ffjw[553] = 662374503;
        if.ffjw[554] = 1141442263;
        if.ffjw[555] = -1262659704;
        if.ffjw[556] = 456410503;
        if.ffjw[557] = -77340079;
        if.ffjw[558] = -2070468268;
        if.ffjw[559] = 1131673674;
        if.ffjw[560] = 549387612;
        if.ffjw[561] = -1488565608;
        if.ffjw[562] = -331733422;
        if.ffjw[563] = 778308333;
        if.ffjw[564] = 2057961132;
        if.ffjw[565] = -1894790331;
        if.ffjw[566] = -1940477005;
        if.ffjw[567] = -629394964;
        if.ffjw[568] = 1846358716;
        if.ffjw[569] = -392263853;
        if.ffjw[570] = 242761387;
        if.ffjw[571] = -129981284;
        if.ffjw[572] = -84798823;
        if.ffjw[573] = 1219674703;
        if.ffjw[574] = -449591121;
        if.ffjw[575] = 1773954280;
        if.ffjw[576] = 1982308817;
        if.ffjw[577] = 685362861;
        if.ffjw[578] = -896715903;
        if.ffjw[579] = 300304360;
        if.ffjw[580] = 257038069;
        if.ffjw[581] = 1232144549;
        if.ffjw[582] = 599398694;
        if.ffjw[583] = 1305296681;
        if.ffjw[584] = 1479969340;
        if.ffjw[585] = 26136598;
        if.ffjw[586] = 1758673831;
        if.ffjw[587] = 1889838510;
        if.ffjw[588] = -1833471742;
        if.ffjw[589] = -912755992;
        if.ffjw[590] = 403144042;
        if.ffjw[591] = 2078933911;
        if.ffjw[592] = 1855452583;
        if.ffjw[593] = 1368523099;
        if.ffjw[594] = 1230794471;
        if.ffjw[595] = 660212362;
        if.ffjw[596] = 1084523723;
        if.ffjw[597] = -347857611;
        if.ffjw[598] = -297668370;
        if.ffjw[599] = -681316365;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float approach(float var1_1, float var2_2, float var3_3) {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - if.ffjy("fiax", fgdj(int ), (int)238));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1266473042: {
                    v1 = if.ffjy("fiay", fgdj(int ), (int)239);
                    continue block25;
                }
                case -50495884: {
                    v1 = if.ffjy("fiaz", fgdj(int ), (int)240);
                    continue block25;
                }
                case 1904238192: {
                    break block25;
                }
            }
            break;
        }
        var6_4 = if.c;
        v2 /* !! */  = if.lu;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - if.ffjy("fiba", fgdj(int ), (int)241));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2104697251: {
                    v3 = if.ffjy("fibb", fgdj(int ), (int)242);
                    continue block26;
                }
                case -1085826172: {
                    v3 = if.ffjy("fibc", fgdj(int ), (int)243);
                    continue block26;
                }
                case -868213316: {
                    v3 = if.ffjy("fibd", fgdj(int ), (int)244);
                    continue block26;
                }
                case 1904238192: {
                    break block26;
                }
            }
            break;
        }
        var5_5 /* !! */  = if.b;
        v4 /* !! */  = if.lu;
        if (true) ** GOTO lbl36
        block27: while (true) {
            v4 /* !! */  = (long)(if.ffjy("fibf", fgdj(int ), (int)246) - if.ffjy("fibe", fgdj(int ), (int)245));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 808425939: {
                    continue block27;
                }
                case 1904238192: {
                    break block27;
                }
            }
            break;
        }
        var4_6 = if.a;
        if (var6_4) {
            throw null;
lbl44:
            // 1 sources

            return (float)if.ffjy("fibg", ffka(int ), (int)625);
        }
        ** while (var4_6 || var4_6)
lbl47:
        // 1 sources

        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 = -var3_3;
                v6 /* !! */  = if.lu;
                if (true) ** GOTO lbl55
                block29: while (true) {
                    v6 /* !! */  = (long)(if.ffjy("fibi", fgdj(int ), (int)248) - if.ffjy("fibh", fgdj(int ), (int)247));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1853244711: {
                            continue block29;
                        }
                        case 1904238192: {
                            break block29;
                        }
                    }
                    break;
                }
                return var1_1 + class_3532.method_15363((float)(var2_2 - var1_1), (float)v5, (float)var3_3);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_5 /* !! */  = (int)if.ffjy("fibj", ffjv(int ), (int)626);
                    if (!var6_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var5_5 /* !! */  = (int)if.ffjy("fibk", ffjv(int ), (int)627);
                if (var6_4) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var5_5 /* !! */  = (int)if.ffjy("fibl", ffjv(int ), (int)628);
                } while (!var6_4);
                throw null;
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)if.ffjy("fibm", ffjv(int ), (int)629);
        ** while (!var6_4)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fgdj(int n2) {
        return ffmy[n2] ^ ffnb[n2];
    }

    private static /* synthetic */ void fijj() {
        if.ffmy[200] = -2133476296415241860L;
        if.ffmy[201] = -988506562481372021L;
        if.ffmy[202] = -2143000989155336702L;
        if.ffmy[203] = 3671396221005363154L;
        if.ffmy[204] = 4257137888696498756L;
        if.ffmy[205] = -8980776522362853326L;
        if.ffmy[206] = -4508719057534524610L;
        if.ffmy[207] = -8194233416605657851L;
        if.ffmy[208] = 3940355571063203059L;
        if.ffmy[209] = -2674027771269926731L;
        if.ffmy[210] = 6964723181927441967L;
        if.ffmy[211] = 1054787506594620081L;
        if.ffmy[212] = -8262235327636496173L;
        if.ffmy[213] = 3310672935173833662L;
        if.ffmy[214] = -8394595844703568013L;
        if.ffmy[215] = 7644992020300249618L;
        if.ffmy[216] = -8988081130902039719L;
        if.ffmy[217] = -1183472405210597936L;
        if.ffmy[218] = 757397201619620514L;
        if.ffmy[219] = 8868853435403709565L;
        if.ffmy[220] = 3593391885864883444L;
        if.ffmy[221] = 4357064146150163606L;
        if.ffmy[222] = -1992868528837954900L;
        if.ffmy[223] = -7668292324211999154L;
        if.ffmy[224] = -4620619497066005430L;
        if.ffmy[225] = 8613482108066225781L;
        if.ffmy[226] = -1568055911464836561L;
        if.ffmy[227] = -182339669897683845L;
        if.ffmy[228] = 4447188386373251545L;
        if.ffmy[229] = -5147122141941985351L;
        if.ffmy[230] = 1466586803355309498L;
        if.ffmy[231] = -5990228970550899863L;
        if.ffmy[232] = -1378324760519509899L;
        if.ffmy[233] = 7334550834547204749L;
        if.ffmy[234] = 6904885203549812183L;
        if.ffmy[235] = 7147016119000759180L;
        if.ffmy[236] = -2226638661773950603L;
        if.ffmy[237] = 2510747853720292317L;
        if.ffmy[238] = 540010622633406057L;
        if.ffmy[239] = -4735580104101550734L;
        if.ffmy[240] = 4843878366157387073L;
        if.ffmy[241] = 4178161799299568616L;
        if.ffmy[242] = 74312283053668827L;
        if.ffmy[243] = 6766425046266331564L;
        if.ffmy[244] = 917983444710382838L;
        if.ffmy[245] = -5580885649975094158L;
        if.ffmy[246] = 4966451765790520364L;
        if.ffmy[247] = 4658322870396968838L;
        if.ffmy[248] = 4221201153385960674L;
        if.ffmy[249] = -1493725552093037696L;
        if.ffmy[250] = -4966716335473349986L;
        if.ffmy[251] = 8659023137294204706L;
        if.ffmy[252] = 7423477500384023330L;
        if.ffmy[253] = 2195628090541225651L;
        if.ffmy[254] = -7079387867528387777L;
        if.ffmy[255] = 7195985648238132109L;
        if.ffmy[256] = 4658167339425357567L;
        if.ffmy[257] = 7930387186074431314L;
        if.ffmy[258] = 3122753750808454885L;
        if.ffmy[259] = -661554185771093221L;
        if.ffmy[260] = -3262862239795551951L;
        if.ffmy[261] = 6056425785663302621L;
        if.ffmy[262] = 3563445657154260280L;
        if.ffmy[263] = 8600781585268910104L;
        if.ffmy[264] = -8091557610940396471L;
        if.ffmy[265] = 7287750869049549952L;
        if.ffmy[266] = 8267330624900912736L;
        if.ffmy[267] = 701046265229735362L;
        if.ffmy[268] = -3224784113396578082L;
        if.ffmy[269] = -1280139158274774745L;
        if.ffmy[270] = 266220296642954216L;
        if.ffmy[271] = 1089323766933149369L;
        if.ffmy[272] = 6359631095069519109L;
        if.ffmy[273] = 8378658736992803522L;
    }

    private static /* synthetic */ void fijc() {
        if.ffjx[300] = 1594579877;
        if.ffjx[301] = 39928425;
        if.ffjx[302] = 467658940;
        if.ffjx[303] = -279303369;
        if.ffjx[304] = 1611074474;
        if.ffjx[305] = 1063076291;
        if.ffjx[306] = -829239810;
        if.ffjx[307] = 368106544;
        if.ffjx[308] = 1197809416;
        if.ffjx[309] = 843533673;
        if.ffjx[310] = -1970521364;
        if.ffjx[311] = -836959276;
        if.ffjx[312] = -1800688760;
        if.ffjx[313] = -1546523654;
        if.ffjx[314] = 32672268;
        if.ffjx[315] = -1084647431;
        if.ffjx[316] = -18315653;
        if.ffjx[317] = 852610496;
        if.ffjx[318] = 845996659;
        if.ffjx[319] = 1530741088;
        if.ffjx[320] = 1611861726;
        if.ffjx[321] = -106088960;
        if.ffjx[322] = -542865270;
        if.ffjx[323] = -1580607702;
        if.ffjx[324] = 448656824;
        if.ffjx[325] = 155723155;
        if.ffjx[326] = -1333528811;
        if.ffjx[327] = -848061045;
        if.ffjx[328] = -1049450297;
        if.ffjx[329] = 1408244405;
        if.ffjx[330] = -1285553039;
        if.ffjx[331] = -489604163;
        if.ffjx[332] = -1333378213;
        if.ffjx[333] = 1201895964;
        if.ffjx[334] = 1832359964;
        if.ffjx[335] = 964730166;
        if.ffjx[336] = -1378735744;
        if.ffjx[337] = -398592692;
        if.ffjx[338] = 268088442;
        if.ffjx[339] = 1675375132;
        if.ffjx[340] = 1807266146;
        if.ffjx[341] = -1462468055;
        if.ffjx[342] = 999413974;
        if.ffjx[343] = -723565832;
        if.ffjx[344] = -1870627091;
        if.ffjx[345] = 1428207565;
        if.ffjx[346] = 1097531302;
        if.ffjx[347] = -377183077;
        if.ffjx[348] = 1949057463;
        if.ffjx[349] = -188520134;
        if.ffjx[350] = -141130084;
        if.ffjx[351] = 1388520912;
        if.ffjx[352] = 1983324084;
        if.ffjx[353] = 1051506070;
        if.ffjx[354] = 1434631991;
        if.ffjx[355] = 1519987610;
        if.ffjx[356] = -1170961170;
        if.ffjx[357] = -2054949703;
        if.ffjx[358] = 818097494;
        if.ffjx[359] = -1252134395;
        if.ffjx[360] = -1979716503;
        if.ffjx[361] = 1928753145;
        if.ffjx[362] = -1413013467;
        if.ffjx[363] = 2101100750;
        if.ffjx[364] = -984747197;
        if.ffjx[365] = -706410934;
        if.ffjx[366] = 1752269492;
        if.ffjx[367] = 381191306;
        if.ffjx[368] = -1607656220;
        if.ffjx[369] = 1029539477;
        if.ffjx[370] = 483299286;
        if.ffjx[371] = 1339899574;
        if.ffjx[372] = -2146215033;
        if.ffjx[373] = -1783271440;
        if.ffjx[374] = -938057653;
        if.ffjx[375] = 2134237964;
        if.ffjx[376] = 1895288058;
        if.ffjx[377] = -1181482737;
        if.ffjx[378] = 1422374689;
        if.ffjx[379] = -1056328168;
        if.ffjx[380] = -1546881119;
        if.ffjx[381] = 1665747705;
        if.ffjx[382] = -344412074;
        if.ffjx[383] = -296910583;
        if.ffjx[384] = 1516786624;
        if.ffjx[385] = 1719089918;
        if.ffjx[386] = 598816194;
        if.ffjx[387] = 685518540;
        if.ffjx[388] = -1624103688;
        if.ffjx[389] = 1626132455;
        if.ffjx[390] = 1727880755;
        if.ffjx[391] = 2029233750;
        if.ffjx[392] = -1662982126;
        if.ffjx[393] = 585297519;
        if.ffjx[394] = 1822694105;
        if.ffjx[395] = 703886913;
        if.ffjx[396] = -726738693;
        if.ffjx[397] = -1647474446;
        if.ffjx[398] = -2075076892;
        if.ffjx[399] = 1563960730;
    }

    private static /* synthetic */ void fijb() {
        if.ffjx[200] = 1457397200;
        if.ffjx[201] = 1947997286;
        if.ffjx[202] = -49428710;
        if.ffjx[203] = 2100076487;
        if.ffjx[204] = 1474506160;
        if.ffjx[205] = -1436462218;
        if.ffjx[206] = 477918784;
        if.ffjx[207] = -508433551;
        if.ffjx[208] = 1796495846;
        if.ffjx[209] = 583713774;
        if.ffjx[210] = -75828847;
        if.ffjx[211] = -408868240;
        if.ffjx[212] = -1596213994;
        if.ffjx[213] = 1727252232;
        if.ffjx[214] = -379088599;
        if.ffjx[215] = -221461525;
        if.ffjx[216] = -1874711770;
        if.ffjx[217] = -647270374;
        if.ffjx[218] = 935607798;
        if.ffjx[219] = -1035411558;
        if.ffjx[220] = 1687376717;
        if.ffjx[221] = -319175309;
        if.ffjx[222] = 517851622;
        if.ffjx[223] = 1062422531;
        if.ffjx[224] = -2005138833;
        if.ffjx[225] = -1212858682;
        if.ffjx[226] = -1309766226;
        if.ffjx[227] = -682990088;
        if.ffjx[228] = 891124337;
        if.ffjx[229] = -727492819;
        if.ffjx[230] = -1544367829;
        if.ffjx[231] = 1741350705;
        if.ffjx[232] = -1038529556;
        if.ffjx[233] = 1424511950;
        if.ffjx[234] = -1660143226;
        if.ffjx[235] = 1638170269;
        if.ffjx[236] = -1748052286;
        if.ffjx[237] = -1917369828;
        if.ffjx[238] = 18797346;
        if.ffjx[239] = 954989693;
        if.ffjx[240] = -1747774883;
        if.ffjx[241] = 1933765044;
        if.ffjx[242] = -1893266586;
        if.ffjx[243] = -797155657;
        if.ffjx[244] = 392725963;
        if.ffjx[245] = 428895840;
        if.ffjx[246] = 1018938289;
        if.ffjx[247] = -2061588394;
        if.ffjx[248] = -2001676499;
        if.ffjx[249] = -58454178;
        if.ffjx[250] = -374020659;
        if.ffjx[251] = -1037519872;
        if.ffjx[252] = 1241472769;
        if.ffjx[253] = 1688587237;
        if.ffjx[254] = -1483980576;
        if.ffjx[255] = 2109244103;
        if.ffjx[256] = 1162740931;
        if.ffjx[257] = 1333472749;
        if.ffjx[258] = -1553588338;
        if.ffjx[259] = 1501886076;
        if.ffjx[260] = -732373922;
        if.ffjx[261] = -1279157095;
        if.ffjx[262] = -1027101750;
        if.ffjx[263] = 1247690583;
        if.ffjx[264] = 9861147;
        if.ffjx[265] = -2084949244;
        if.ffjx[266] = 689785282;
        if.ffjx[267] = -1983566477;
        if.ffjx[268] = 946150563;
        if.ffjx[269] = 2041344936;
        if.ffjx[270] = -694863189;
        if.ffjx[271] = 1518224934;
        if.ffjx[272] = -1573548654;
        if.ffjx[273] = -1823904112;
        if.ffjx[274] = 1386717535;
        if.ffjx[275] = 2025562853;
        if.ffjx[276] = 1675431763;
        if.ffjx[277] = -1368080967;
        if.ffjx[278] = -283983646;
        if.ffjx[279] = 208065747;
        if.ffjx[280] = -547826427;
        if.ffjx[281] = 990760068;
        if.ffjx[282] = -2034156371;
        if.ffjx[283] = -1060625607;
        if.ffjx[284] = -176810206;
        if.ffjx[285] = -1126027241;
        if.ffjx[286] = -138574450;
        if.ffjx[287] = 2133901465;
        if.ffjx[288] = -1062827349;
        if.ffjx[289] = -51869300;
        if.ffjx[290] = -668131955;
        if.ffjx[291] = -1199224410;
        if.ffjx[292] = 1861471933;
        if.ffjx[293] = -505822794;
        if.ffjx[294] = 1408732284;
        if.ffjx[295] = -1092017751;
        if.ffjx[296] = 701944108;
        if.ffjx[297] = 367365934;
        if.ffjx[298] = -329617234;
        if.ffjx[299] = 1188577738;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean skipSensitivityAdjust() {
        v0 /* !! */  = if.lu;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - if.ffjy("fieg", fgdj(int ), (int)256));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1031541750: {
                    v1 = if.ffjy("fieh", fgdj(int ), (int)257);
                    continue block18;
                }
                case -474153982: {
                    v1 = if.ffjy("fiei", fgdj(int ), (int)258);
                    continue block18;
                }
                case 1068716459: {
                    v1 = if.ffjy("fiej", fgdj(int ), (int)259);
                    continue block18;
                }
                case 1904238192: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = if.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fiek", fgdj(int ), (int)260)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == if.ffjy("fiel", ffjv(int ), (int)694)) break;
            v2 /* !! */  = (long)if.ffjy("fiem", ffjv(int ), (int)695);
        }
        var2_2 /* !! */  = if.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = if.lu;
                if (true) ** GOTO lbl32
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - if.ffjy("fien", fgdj(int ), (int)261));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1156583847: {
                            v4 = if.ffjy("fieo", fgdj(int ), (int)262);
                            continue block20;
                        }
                        case 628862720: {
                            v4 = if.ffjy("fiep", fgdj(int ), (int)263);
                            continue block20;
                        }
                        case 1468107604: {
                            v4 = if.ffjy("fieq", fgdj(int ), (int)264);
                            continue block20;
                        }
                        case 1904238192: {
                            break block20;
                        }
                    }
                    break;
                }
                var1_3 = if.a;
                if (var3_1) {
                    throw null;
                    return (boolean)if.ffjy("fier", ffjv(int ), (int)696);
                }
                if (var1_3 || var1_3) ** continue;
                return (boolean)if.ffjy("fies", ffjv(int ), (int)697);
            }
            case 0: {
                var2_2 /* !! */  = (int)if.ffjy("fiet", ffjv(int ), (int)698);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)if.ffjy("fieu", ffjv(int ), (int)699);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)if.ffjy("fiev", ffjv(int ), (int)700);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)if.ffjy("fiew", ffjv(int ), (int)701);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fijh() {
        if.ffmy[0] = -2018550048800342233L;
        if.ffmy[1] = -42321551574442950L;
        if.ffmy[2] = 5680199160034045270L;
        if.ffmy[3] = 3075317905942781713L;
        if.ffmy[4] = -3589293706158396699L;
        if.ffmy[5] = 6765504837956436946L;
        if.ffmy[6] = 4229787509127961654L;
        if.ffmy[7] = 5969897910192460280L;
        if.ffmy[8] = 5201338096109044775L;
        if.ffmy[9] = -215794705795239684L;
        if.ffmy[10] = 2736643557417617953L;
        if.ffmy[11] = 4907786585258418873L;
        if.ffmy[12] = -5497833569621914491L;
        if.ffmy[13] = -9166453115227430235L;
        if.ffmy[14] = 8281345571695092618L;
        if.ffmy[15] = 7199026747571704857L;
        if.ffmy[16] = -2978515900035101823L;
        if.ffmy[17] = 8652904412130470177L;
        if.ffmy[18] = -4232980672678306167L;
        if.ffmy[19] = 7016197750868897434L;
        if.ffmy[20] = -6896970243177611256L;
        if.ffmy[21] = 7212624759971865925L;
        if.ffmy[22] = 7694362493952041857L;
        if.ffmy[23] = 9073358957614971170L;
        if.ffmy[24] = -8428581785235752723L;
        if.ffmy[25] = -5579477649647431032L;
        if.ffmy[26] = -9214495534346987155L;
        if.ffmy[27] = 5634238124359116770L;
        if.ffmy[28] = -4128795702425415551L;
        if.ffmy[29] = 5012711328083953204L;
        if.ffmy[30] = 6298945086827499653L;
        if.ffmy[31] = -258404437146932877L;
        if.ffmy[32] = 1918822282691707297L;
        if.ffmy[33] = 4500651491050045776L;
        if.ffmy[34] = 2171034129266705804L;
        if.ffmy[35] = 7198320312106263196L;
        if.ffmy[36] = 6061703010556920917L;
        if.ffmy[37] = 3416851202612201850L;
        if.ffmy[38] = 4758909553375878382L;
        if.ffmy[39] = 1117801002140181063L;
        if.ffmy[40] = 5357674749451557881L;
        if.ffmy[41] = -7553847821368769788L;
        if.ffmy[42] = 7651581735037901301L;
        if.ffmy[43] = 5885971016094965479L;
        if.ffmy[44] = -1106705352620448039L;
        if.ffmy[45] = -1230465447881434658L;
        if.ffmy[46] = -415846849959493766L;
        if.ffmy[47] = 3442688144707877898L;
        if.ffmy[48] = -6867379786715156536L;
        if.ffmy[49] = -8659907977516150907L;
        if.ffmy[50] = -6995451718233441475L;
        if.ffmy[51] = -2655892290953470637L;
        if.ffmy[52] = 8634218754798583209L;
        if.ffmy[53] = 6666324656898761398L;
        if.ffmy[54] = 5006083379740480192L;
        if.ffmy[55] = 7332501262382564027L;
        if.ffmy[56] = -5287254305480150101L;
        if.ffmy[57] = -4242160234499120550L;
        if.ffmy[58] = 297303807339623717L;
        if.ffmy[59] = 5004129360199898466L;
        if.ffmy[60] = -7056649078389900853L;
        if.ffmy[61] = 5089434876887756921L;
        if.ffmy[62] = 2313684689181404701L;
        if.ffmy[63] = -6373137180727410126L;
        if.ffmy[64] = 1303802679230663786L;
        if.ffmy[65] = -3995513946809297440L;
        if.ffmy[66] = 4843873913791172274L;
        if.ffmy[67] = 5489934263910303607L;
        if.ffmy[68] = -4886518311474355655L;
        if.ffmy[69] = -5714702706005621404L;
        if.ffmy[70] = -6003306109713913644L;
        if.ffmy[71] = 3220244175731932862L;
        if.ffmy[72] = 1138946614104258933L;
        if.ffmy[73] = -883382527566051112L;
        if.ffmy[74] = 8638521183312416104L;
        if.ffmy[75] = 2326522957032903248L;
        if.ffmy[76] = 5380268221045478429L;
        if.ffmy[77] = -4933574830534789069L;
        if.ffmy[78] = -3181297678453259084L;
        if.ffmy[79] = -8609767231557685722L;
        if.ffmy[80] = -3330288079224996149L;
        if.ffmy[81] = -8665613638491931828L;
        if.ffmy[82] = -2098699478555570664L;
        if.ffmy[83] = 293494229426971094L;
        if.ffmy[84] = -6770647299342460495L;
        if.ffmy[85] = -6880132409720306224L;
        if.ffmy[86] = 7376005131211605857L;
        if.ffmy[87] = 3896699394890348738L;
        if.ffmy[88] = -715898009401833819L;
        if.ffmy[89] = 3727710657345086065L;
        if.ffmy[90] = -632756853167180991L;
        if.ffmy[91] = -2989663485976251117L;
        if.ffmy[92] = -444526087550566290L;
        if.ffmy[93] = 2983058099421953645L;
        if.ffmy[94] = -626106316351364981L;
        if.ffmy[95] = 9153153598454658538L;
        if.ffmy[96] = -5799107379741067545L;
        if.ffmy[97] = -5590474546650008180L;
        if.ffmy[98] = 4968790680884920201L;
        if.ffmy[99] = 7261364785552791885L;
    }

    private static /* synthetic */ void fijd() {
        if.ffjx[400] = -1951902449;
        if.ffjx[401] = -588575132;
        if.ffjx[402] = 700771691;
        if.ffjx[403] = -1027916296;
        if.ffjx[404] = -762307175;
        if.ffjx[405] = 1055347843;
        if.ffjx[406] = -309323377;
        if.ffjx[407] = -40541487;
        if.ffjx[408] = -1956200806;
        if.ffjx[409] = 730231120;
        if.ffjx[410] = 1562199264;
        if.ffjx[411] = -284489208;
        if.ffjx[412] = -868540983;
        if.ffjx[413] = -694208581;
        if.ffjx[414] = 559110143;
        if.ffjx[415] = -878073399;
        if.ffjx[416] = 1153856987;
        if.ffjx[417] = 1106529180;
        if.ffjx[418] = -857738877;
        if.ffjx[419] = 1670934425;
        if.ffjx[420] = -1414118908;
        if.ffjx[421] = -990510870;
        if.ffjx[422] = -988771589;
        if.ffjx[423] = -1723072346;
        if.ffjx[424] = 265519452;
        if.ffjx[425] = -1624745190;
        if.ffjx[426] = -1707256468;
        if.ffjx[427] = 1048919267;
        if.ffjx[428] = 1969895240;
        if.ffjx[429] = -1259020471;
        if.ffjx[430] = -338157643;
        if.ffjx[431] = 123933962;
        if.ffjx[432] = 939915798;
        if.ffjx[433] = 2101766585;
        if.ffjx[434] = 421123612;
        if.ffjx[435] = -435978292;
        if.ffjx[436] = 385686984;
        if.ffjx[437] = 1616997147;
        if.ffjx[438] = 562896184;
        if.ffjx[439] = -1344701060;
        if.ffjx[440] = 57945442;
        if.ffjx[441] = 1239601438;
        if.ffjx[442] = 563664586;
        if.ffjx[443] = 1369619877;
        if.ffjx[444] = 262809150;
        if.ffjx[445] = 2051780874;
        if.ffjx[446] = -923147959;
        if.ffjx[447] = -1966519060;
        if.ffjx[448] = -1369152456;
        if.ffjx[449] = 363409398;
        if.ffjx[450] = 215157224;
        if.ffjx[451] = -1904227207;
        if.ffjx[452] = 283286965;
        if.ffjx[453] = 613574780;
        if.ffjx[454] = -215370930;
        if.ffjx[455] = 934405453;
        if.ffjx[456] = 954482817;
        if.ffjx[457] = -2100176079;
        if.ffjx[458] = -201650008;
        if.ffjx[459] = 124274494;
        if.ffjx[460] = 484360542;
        if.ffjx[461] = -1337456302;
        if.ffjx[462] = -383317665;
        if.ffjx[463] = -475819861;
        if.ffjx[464] = -1409871452;
        if.ffjx[465] = 176399962;
        if.ffjx[466] = 1531347983;
        if.ffjx[467] = 913833489;
        if.ffjx[468] = -1406565860;
        if.ffjx[469] = -1149368663;
        if.ffjx[470] = -879785203;
        if.ffjx[471] = 1415551672;
        if.ffjx[472] = 1472949022;
        if.ffjx[473] = 2038822062;
        if.ffjx[474] = 1974757284;
        if.ffjx[475] = -784120232;
        if.ffjx[476] = -552705720;
        if.ffjx[477] = 1131687621;
        if.ffjx[478] = -1616114002;
        if.ffjx[479] = -1565311890;
        if.ffjx[480] = -1816218154;
        if.ffjx[481] = 1211302021;
        if.ffjx[482] = 1311835754;
        if.ffjx[483] = 380125253;
        if.ffjx[484] = -1712902567;
        if.ffjx[485] = 1122076083;
        if.ffjx[486] = 1280001069;
        if.ffjx[487] = -308002547;
        if.ffjx[488] = 1670310289;
        if.ffjx[489] = 87039892;
        if.ffjx[490] = 936151878;
        if.ffjx[491] = 655193316;
        if.ffjx[492] = -1631177441;
        if.ffjx[493] = -1848031521;
        if.ffjx[494] = -55269836;
        if.ffjx[495] = 148656089;
        if.ffjx[496] = 1971331685;
        if.ffjx[497] = 1546306128;
        if.ffjx[498] = -1214452242;
        if.ffjx[499] = 762595586;
    }

    private static /* synthetic */ void fijk() {
        if.ffnb[0] = -2591707647868357654L;
        if.ffnb[1] = -4579155699852665065L;
        if.ffnb[2] = 8149030677036015205L;
        if.ffnb[3] = 1544323885546941474L;
        if.ffnb[4] = -3515313604621341270L;
        if.ffnb[5] = -2842969238368321374L;
        if.ffnb[6] = 7751320342256347371L;
        if.ffnb[7] = -7219907302851344544L;
        if.ffnb[8] = 6174498120255913297L;
        if.ffnb[9] = 7580435183255372007L;
        if.ffnb[10] = -6521473484382382014L;
        if.ffnb[11] = -5460748874975546668L;
        if.ffnb[12] = -4283709439120075593L;
        if.ffnb[13] = 8657622786074702545L;
        if.ffnb[14] = -8806257320494751904L;
        if.ffnb[15] = -1021609385191308678L;
        if.ffnb[16] = -2595331328675783310L;
        if.ffnb[17] = -8598992446418597224L;
        if.ffnb[18] = -3448823575216875483L;
        if.ffnb[19] = -7551666257641664389L;
        if.ffnb[20] = 6051962741058203350L;
        if.ffnb[21] = 9218727617615940515L;
        if.ffnb[22] = 6290746554192651232L;
        if.ffnb[23] = 4948461521337721956L;
        if.ffnb[24] = 2170953720933582923L;
        if.ffnb[25] = 4289096331639669333L;
        if.ffnb[26] = -639548988104503668L;
        if.ffnb[27] = 327320180573437431L;
        if.ffnb[28] = 7824563492275149226L;
        if.ffnb[29] = 4463565022390743168L;
        if.ffnb[30] = 7861341789250570048L;
        if.ffnb[31] = 2748822341081127590L;
        if.ffnb[32] = 4902596311808627897L;
        if.ffnb[33] = 3366931418375691588L;
        if.ffnb[34] = 6242163496486123479L;
        if.ffnb[35] = -1872113670763537373L;
        if.ffnb[36] = 7732408083205566832L;
        if.ffnb[37] = 1220178568443111773L;
        if.ffnb[38] = 1670163786210604605L;
        if.ffnb[39] = -1224981604278520882L;
        if.ffnb[40] = -8177133163813429979L;
        if.ffnb[41] = -6292750260284387189L;
        if.ffnb[42] = 3039698578739156280L;
        if.ffnb[43] = 999536537584754638L;
        if.ffnb[44] = -8205678248174189789L;
        if.ffnb[45] = 5919493391096575674L;
        if.ffnb[46] = -6175470663439038501L;
        if.ffnb[47] = -861191059631055156L;
        if.ffnb[48] = 3545334719096353536L;
        if.ffnb[49] = -5328512295153539876L;
        if.ffnb[50] = -8995497533635389509L;
        if.ffnb[51] = 2431108155396089193L;
        if.ffnb[52] = 5016536650007496995L;
        if.ffnb[53] = -4573030592422524247L;
        if.ffnb[54] = 8773634447836305262L;
        if.ffnb[55] = -7173603620549003890L;
        if.ffnb[56] = 8290447018556003163L;
        if.ffnb[57] = -5748111912420018723L;
        if.ffnb[58] = 4784612299202257267L;
        if.ffnb[59] = -6145418464907833822L;
        if.ffnb[60] = 5305652621264197190L;
        if.ffnb[61] = -7031935276932907412L;
        if.ffnb[62] = 4094153486000022762L;
        if.ffnb[63] = 1615681667475338367L;
        if.ffnb[64] = 1880190140681906108L;
        if.ffnb[65] = 5480229488096641902L;
        if.ffnb[66] = -4705529314267751615L;
        if.ffnb[67] = 6336828200066952036L;
        if.ffnb[68] = 5591613745312405310L;
        if.ffnb[69] = -5289991087531475531L;
        if.ffnb[70] = -5846083075056665502L;
        if.ffnb[71] = 6105113239836108970L;
        if.ffnb[72] = -5200339642216724929L;
        if.ffnb[73] = 1212610783633158012L;
        if.ffnb[74] = 7071455373814349476L;
        if.ffnb[75] = 8132711013425687244L;
        if.ffnb[76] = 5380268221045478593L;
        if.ffnb[77] = -4933574830534788549L;
        if.ffnb[78] = -5828211639105970304L;
        if.ffnb[79] = 3588404745268254073L;
        if.ffnb[80] = 3545023887396281322L;
        if.ffnb[81] = -2852837602408744977L;
        if.ffnb[82] = -3251719582706484296L;
        if.ffnb[83] = 2957493876403713433L;
        if.ffnb[84] = -6280859288068620372L;
        if.ffnb[85] = 7059124152651759246L;
        if.ffnb[86] = -6250157660026841848L;
        if.ffnb[87] = -2860883237508629606L;
        if.ffnb[88] = 7951091915587917379L;
        if.ffnb[89] = -784331839441313783L;
        if.ffnb[90] = -546925093206203654L;
        if.ffnb[91] = -7574453634167061307L;
        if.ffnb[92] = 7789951023560295204L;
        if.ffnb[93] = -8862492679301193565L;
        if.ffnb[94] = 4287145622206990730L;
        if.ffnb[95] = 8711023172684329465L;
        if.ffnb[96] = -769467367955519115L;
        if.ffnb[97] = -5590474546650008428L;
        if.ffnb[98] = 4968790680884919555L;
        if.ffnb[99] = 7261364785552792027L;
    }

    public static /* synthetic */ CallSite ffjy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fijf() {
        if.ffjx[600] = 1106419590;
        if.ffjx[601] = 1917947996;
        if.ffjx[602] = -346325128;
        if.ffjx[603] = 244160772;
        if.ffjx[604] = -2072414878;
        if.ffjx[605] = -304898058;
        if.ffjx[606] = -1189429042;
        if.ffjx[607] = 131697977;
        if.ffjx[608] = -1619375326;
        if.ffjx[609] = 548828125;
        if.ffjx[610] = 1298969970;
        if.ffjx[611] = 172096838;
        if.ffjx[612] = 2057392889;
        if.ffjx[613] = 536099585;
        if.ffjx[614] = 934116245;
        if.ffjx[615] = 1582369388;
        if.ffjx[616] = 1793479670;
        if.ffjx[617] = 774150847;
        if.ffjx[618] = 367117675;
        if.ffjx[619] = 1656663353;
        if.ffjx[620] = -591006362;
        if.ffjx[621] = -405954442;
        if.ffjx[622] = 950578482;
        if.ffjx[623] = -1970039999;
        if.ffjx[624] = 1446632566;
        if.ffjx[625] = -1067897637;
        if.ffjx[626] = -624176756;
        if.ffjx[627] = -1893453866;
        if.ffjx[628] = 1516532469;
        if.ffjx[629] = -1816129924;
        if.ffjx[630] = 843558755;
        if.ffjx[631] = -2016223746;
        if.ffjx[632] = -1099636261;
        if.ffjx[633] = 1265417032;
        if.ffjx[634] = -2064589541;
        if.ffjx[635] = -1068510593;
        if.ffjx[636] = 1380926006;
        if.ffjx[637] = -958730080;
        if.ffjx[638] = -1826851429;
        if.ffjx[639] = 1533837863;
        if.ffjx[640] = 992875543;
        if.ffjx[641] = -769918358;
        if.ffjx[642] = 1074067661;
        if.ffjx[643] = 1676663063;
        if.ffjx[644] = -1700808782;
        if.ffjx[645] = -573569684;
        if.ffjx[646] = -556032256;
        if.ffjx[647] = 1665853312;
        if.ffjx[648] = 872964440;
        if.ffjx[649] = 125157819;
        if.ffjx[650] = 574259479;
        if.ffjx[651] = -61071672;
        if.ffjx[652] = 1489407867;
        if.ffjx[653] = 164312446;
        if.ffjx[654] = -1591642499;
        if.ffjx[655] = 55645070;
        if.ffjx[656] = 318595732;
        if.ffjx[657] = -31719163;
        if.ffjx[658] = -1864169038;
        if.ffjx[659] = 1827221979;
        if.ffjx[660] = 718409542;
        if.ffjx[661] = 1025986592;
        if.ffjx[662] = 1867362565;
        if.ffjx[663] = 397607063;
        if.ffjx[664] = -1492398398;
        if.ffjx[665] = 694357166;
        if.ffjx[666] = 2032750498;
        if.ffjx[667] = 1763027005;
        if.ffjx[668] = 2132275565;
        if.ffjx[669] = 178726516;
        if.ffjx[670] = 605897423;
        if.ffjx[671] = 383758546;
        if.ffjx[672] = 1617557440;
        if.ffjx[673] = 413467695;
        if.ffjx[674] = 2039709554;
        if.ffjx[675] = -1808848110;
        if.ffjx[676] = -1236675216;
        if.ffjx[677] = 993817067;
        if.ffjx[678] = -697203754;
        if.ffjx[679] = -1256802068;
        if.ffjx[680] = -6241586;
        if.ffjx[681] = 1459658901;
        if.ffjx[682] = -238542418;
        if.ffjx[683] = 715532593;
        if.ffjx[684] = -59293585;
        if.ffjx[685] = 1985284815;
        if.ffjx[686] = 522675289;
        if.ffjx[687] = 1614060167;
        if.ffjx[688] = 1390227727;
        if.ffjx[689] = 498291459;
        if.ffjx[690] = 139728743;
        if.ffjx[691] = 506812835;
        if.ffjx[692] = 320810418;
        if.ffjx[693] = 1227386554;
        if.ffjx[694] = 2114366000;
        if.ffjx[695] = -1172750881;
        if.ffjx[696] = 757554792;
        if.ffjx[697] = 1000992487;
        if.ffjx[698] = 1033919077;
        if.ffjx[699] = 365673771;
    }

    private static /* synthetic */ void fiiu() {
        if.ffjw[600] = -1106419591;
        if.ffjw[601] = 588368967;
        if.ffjw[602] = -346325144;
        if.ffjw[603] = 244160769;
        if.ffjw[604] = -2072414872;
        if.ffjw[605] = -304898051;
        if.ffjw[606] = -1189429050;
        if.ffjw[607] = 131697971;
        if.ffjw[608] = -1619375328;
        if.ffjw[609] = 548828111;
        if.ffjw[610] = 1298969979;
        if.ffjw[611] = 172096853;
        if.ffjw[612] = 2057392882;
        if.ffjw[613] = 536099584;
        if.ffjw[614] = 934116247;
        if.ffjw[615] = 1582369378;
        if.ffjw[616] = 1793479651;
        if.ffjw[617] = 774150830;
        if.ffjw[618] = 367117676;
        if.ffjw[619] = 1656663349;
        if.ffjw[620] = -591006348;
        if.ffjw[621] = -405954439;
        if.ffjw[622] = 950578488;
        if.ffjw[623] = -1970039993;
        if.ffjw[624] = 1446632560;
        if.ffjw[625] = -11128091;
        if.ffjw[626] = -624176753;
        if.ffjw[627] = -1893453868;
        if.ffjw[628] = 1516532470;
        if.ffjw[629] = -1816129922;
        if.ffjw[630] = -1303924893;
        if.ffjw[631] = -1194940641;
        if.ffjw[632] = -2124375238;
        if.ffjw[633] = 1946869038;
        if.ffjw[634] = -1147749507;
        if.ffjw[635] = -1081093505;
        if.ffjw[636] = 1380926000;
        if.ffjw[637] = -958730060;
        if.ffjw[638] = -1826851434;
        if.ffjw[639] = 1533837860;
        if.ffjw[640] = 992875533;
        if.ffjw[641] = -769918393;
        if.ffjw[642] = 1074067690;
        if.ffjw[643] = 1676663095;
        if.ffjw[644] = -1700808821;
        if.ffjw[645] = -573569699;
        if.ffjw[646] = -556032238;
        if.ffjw[647] = 1665853351;
        if.ffjw[648] = 872964470;
        if.ffjw[649] = 125157804;
        if.ffjw[650] = 574259465;
        if.ffjw[651] = -61071657;
        if.ffjw[652] = 1489407865;
        if.ffjw[653] = 164312410;
        if.ffjw[654] = -1591642544;
        if.ffjw[655] = 55645089;
        if.ffjw[656] = 318595743;
        if.ffjw[657] = -31719163;
        if.ffjw[658] = -1864169056;
        if.ffjw[659] = 1827221993;
        if.ffjw[660] = 718409538;
        if.ffjw[661] = 1025986622;
        if.ffjw[662] = 1867362571;
        if.ffjw[663] = 397607074;
        if.ffjw[664] = -1492398353;
        if.ffjw[665] = 694357134;
        if.ffjw[666] = 2032750491;
        if.ffjw[667] = 1763027007;
        if.ffjw[668] = 2132275521;
        if.ffjw[669] = 178726465;
        if.ffjw[670] = 605897450;
        if.ffjw[671] = 383758539;
        if.ffjw[672] = 1617557461;
        if.ffjw[673] = 413467649;
        if.ffjw[674] = 2039709538;
        if.ffjw[675] = -1808848104;
        if.ffjw[676] = -1236675264;
        if.ffjw[677] = 993817037;
        if.ffjw[678] = -697203719;
        if.ffjw[679] = -1256802049;
        if.ffjw[680] = -6241597;
        if.ffjw[681] = 1459658925;
        if.ffjw[682] = -238542411;
        if.ffjw[683] = 715532575;
        if.ffjw[684] = -59293569;
        if.ffjw[685] = 1985284817;
        if.ffjw[686] = 522675310;
        if.ffjw[687] = 1614060170;
        if.ffjw[688] = 1390227768;
        if.ffjw[689] = 498291499;
        if.ffjw[690] = 139728763;
        if.ffjw[691] = 506812843;
        if.ffjw[692] = 320810388;
        if.ffjw[693] = 1227386557;
        if.ffjw[694] = 2114366001;
        if.ffjw[695] = -1504067123;
        if.ffjw[696] = 757554792;
        if.ffjw[697] = 1000992486;
        if.ffjw[698] = 1033919078;
        if.ffjw[699] = 365673769;
    }

    private static /* synthetic */ void fiiw() {
        if.ffjw[700] = 1635808120;
        if.ffjw[701] = 83833307;
        if.ffjw[702] = -804888081;
        if.ffjw[703] = -352404101;
        if.ffjw[704] = 1441880110;
        if.ffjw[705] = 647197728;
        if.ffjw[706] = 1072837890;
        if.ffjw[707] = 2093255587;
        if.ffjw[708] = -1648269734;
        if.ffjw[709] = 699959106;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov applyHumanNoise(ov var1_1, float var2_2, long var3_3) {
        block128: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = if.lu - if.ffjy("fgdk", fgdj(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == if.ffjy("fgdl", ffjv(int ), (int)205)) break;
                v0 /* !! */  = (long)if.ffjy("fgdm", ffjv(int ), (int)206);
            }
            var10_4 = if.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = if.lu - if.ffjy("fgdn", fgdj(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == if.ffjy("fgdo", ffjv(int ), (int)207)) break;
                v1 /* !! */  = (long)if.ffjy("fgdp", ffjv(int ), (int)208);
            }
            var9_5 /* !! */  = if.b;
            v2 /* !! */  = if.lu;
            if (true) ** GOTO lbl17
            block87: while (true) {
                v2 /* !! */  = (long)(v3 - if.ffjy("fgdq", fgdj(int ), (int)6));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1106265061: {
                        v3 = if.ffjy("fgdr", fgdj(int ), (int)7);
                        continue block87;
                    }
                    case -14338776: {
                        v3 = if.ffjy("fgds", fgdj(int ), (int)8);
                        continue block87;
                    }
                    case 283448715: {
                        v3 = if.ffjy("fgdt", fgdj(int ), (int)9);
                        continue block87;
                    }
                    case 1904238192: {
                        break block87;
                    }
                }
                break;
            }
            var8_6 = if.a;
            if (var10_4) {
                throw null;
lbl32:
                // 9 sources

                return null;
            }
            if (var8_6 || var8_6) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = if.lu - if.ffjy("fgdu", fgdj(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == if.ffjy("fgdv", ffjv(int ), (int)209)) break;
                v4 /* !! */  = (long)if.ffjy("fgdw", ffjv(int ), (int)210);
            }
            if (var3_3 < this.nextNoiseChange) break block128;
            if (var8_6 || var8_6) ** GOTO lbl32
            v5 = if.ffjy("fgdx", ffjv(int ), (int)211);
            v6 /* !! */  = if.lu;
            if (true) ** GOTO lbl47
            block90: while (true) {
                v6 /* !! */  = (long)(v7 - if.ffjy("fgdy", fgdj(int ), (int)11));
lbl47:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -72496199: {
                        v7 = if.ffjy("fgdz", fgdj(int ), (int)12);
                        continue block90;
                    }
                    case 404749053: {
                        v7 = if.ffjy("fgea", fgdj(int ), (int)13);
                        continue block90;
                    }
                    case 1904238192: {
                        break block90;
                    }
                }
                break;
            }
            this.chooseNextNoise((boolean)v5);
            if (var8_6) ** GOTO lbl32
        }
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_6 || var8_6) ** GOTO lbl32
                v8 = (double)(if.ffjy("fgeb", ffka(int ), (int)212) * var2_2);
                v9 /* !! */  = if.lu;
                if (true) ** GOTO lbl68
                block91: while (true) {
                    v9 /* !! */  = (long)(v10 - if.ffjy("fgec", fgdj(int ), (int)14));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1868271936: {
                            v10 = if.ffjy("fged", fgdj(int ), (int)15);
                            continue block91;
                        }
                        case -1011330265: {
                            v10 = if.ffjy("fgee", fgdj(int ), (int)16);
                            continue block91;
                        }
                        case -670060139: {
                            v10 = if.ffjy("fgef", fgdj(int ), (int)17);
                            continue block91;
                        }
                        case 1904238192: {
                            break block91;
                        }
                    }
                    break;
                }
                var5_7 = 1.0f - (float)Math.exp(v8);
                if (var8_6 || var8_6) ** GOTO lbl32
                v11 /* !! */  = if.lu;
                if (true) ** GOTO lbl86
                block92: while (true) {
                    v11 /* !! */  = (long)(v12 - if.ffjy("fgeg", fgdj(int ), (int)18));
lbl86:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1433703672: {
                            v12 = if.ffjy("fgeh", fgdj(int ), (int)19);
                            continue block92;
                        }
                        case -1163292316: {
                            v12 = if.ffjy("fgei", fgdj(int ), (int)20);
                            continue block92;
                        }
                        case 1381094743: {
                            v12 = if.ffjy("fgej", fgdj(int ), (int)21);
                            continue block92;
                        }
                        case 1904238192: {
                            break block92;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = if.lu - if.ffjy("fgek", fgdj(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == if.ffjy("fgel", ffjv(int ), (int)213)) break;
                    v13 /* !! */  = (long)if.ffjy("fgem", ffjv(int ), (int)214);
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = if.lu - if.ffjy("fgen", fgdj(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == if.ffjy("fgeo", ffjv(int ), (int)215)) break;
                    v14 /* !! */  = (long)if.ffjy("fgep", ffjv(int ), (int)216);
                }
                v15 = class_3532.method_16439((float)var5_7, (float)this.noiseYaw, (float)this.wantedNoiseYaw);
                v16 /* !! */  = if.lu;
                if (true) ** GOTO lbl113
                block95: while (true) {
                    v16 /* !! */  = (long)(v17 - if.ffjy("fgeq", fgdj(int ), (int)24));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1366606585: {
                            v17 = if.ffjy("fger", fgdj(int ), (int)25);
                            continue block95;
                        }
                        case -931199988: {
                            v17 = if.ffjy("fges", fgdj(int ), (int)26);
                            continue block95;
                        }
                        case -156673488: {
                            v17 = if.ffjy("fget", fgdj(int ), (int)27);
                            continue block95;
                        }
                        case 1904238192: {
                            break block95;
                        }
                    }
                    break;
                }
                this.noiseYaw = v15;
                if (var8_6 || var8_6) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = if.lu - if.ffjy("fgeu", fgdj(int ), (int)28)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == if.ffjy("fgev", ffjv(int ), (int)217)) break;
                    v18 /* !! */  = (long)if.ffjy("fgew", ffjv(int ), (int)218);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = if.lu - if.ffjy("fgex", fgdj(int ), (int)29)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == if.ffjy("fgey", ffjv(int ), (int)219)) break;
                    v19 /* !! */  = (long)if.ffjy("fgez", ffjv(int ), (int)220);
                }
                v20 /* !! */  = if.lu;
                if (true) ** GOTO lbl141
                block98: while (true) {
                    v20 /* !! */  = (long)(v21 - if.ffjy("fgfa", fgdj(int ), (int)30));
lbl141:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1618318381: {
                            v21 = if.ffjy("fgfb", fgdj(int ), (int)31);
                            continue block98;
                        }
                        case -1025895044: {
                            v21 = if.ffjy("fgfc", fgdj(int ), (int)32);
                            continue block98;
                        }
                        case 1904238192: {
                            break block98;
                        }
                    }
                    break;
                }
                v22 = class_3532.method_16439((float)var5_7, (float)this.noisePitch, (float)this.wantedNoisePitch);
                v23 /* !! */  = if.lu;
                if (true) ** GOTO lbl155
                block99: while (true) {
                    v23 /* !! */  = (long)(v24 - if.ffjy("fgfd", fgdj(int ), (int)33));
lbl155:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -487142977: {
                            v24 = if.ffjy("fgfe", fgdj(int ), (int)34);
                            continue block99;
                        }
                        case 1188788524: {
                            v24 = if.ffjy("fgff", fgdj(int ), (int)35);
                            continue block99;
                        }
                        case 1565218942: {
                            v24 = if.ffjy("fgfg", fgdj(int ), (int)36);
                            continue block99;
                        }
                        case 1904238192: {
                            break block99;
                        }
                    }
                    break;
                }
                this.noisePitch = v22;
                if (var8_6 || var8_6) ** GOTO lbl32
                v25 = (double)var3_3 * if.ffjy("fgfh", ffmw(int ), (int)37);
                v26 /* !! */  = if.lu;
                if (true) ** GOTO lbl174
                block100: while (true) {
                    v26 /* !! */  = (long)(v27 - if.ffjy("fgfi", fgdj(int ), (int)38));
lbl174:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -942069374: {
                            v27 = if.ffjy("fgfj", fgdj(int ), (int)39);
                            continue block100;
                        }
                        case 432155707: {
                            v27 = if.ffjy("fgfk", fgdj(int ), (int)40);
                            continue block100;
                        }
                        case 1904238192: {
                            break block100;
                        }
                    }
                    break;
                }
                var6_8 = (float)Math.sin(v25) * if.ffjy("fgfl", ffka(int ), (int)221);
                if (var8_6 || var8_6) ** GOTO lbl32
                v28 = (double)var3_3 * if.ffjy("fgfm", ffmw(int ), (int)41) + if.ffjy("fgfn", ffmw(int ), (int)42);
                v29 /* !! */  = if.lu;
                if (true) ** GOTO lbl190
                block101: while (true) {
                    v29 /* !! */  = (long)(if.ffjy("fgfp", fgdj(int ), (int)44) - if.ffjy("fgfo", fgdj(int ), (int)43));
lbl190:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1373178331: {
                            continue block101;
                        }
                        case 1904238192: {
                            break block101;
                        }
                    }
                    break;
                }
                var7_9 = (float)Math.sin(v28) * if.ffjy("fgfq", ffka(int ), (int)222);
                if (!var8_6 && !var8_6) ** break;
                ** continue;
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_7 = if.lu - if.ffjy("fgfr", fgdj(int ), (int)45)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == if.ffjy("fgfs", ffjv(int ), (int)223)) break;
                    v30 /* !! */  = (long)if.ffjy("fgft", ffjv(int ), (int)224);
                }
                v31 /* !! */  = if.lu;
                if (true) ** GOTO lbl207
                block103: while (true) {
                    v31 /* !! */  = (long)(v32 - if.ffjy("fgfu", fgdj(int ), (int)46));
lbl207:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1255328574: {
                            v32 = if.ffjy("fgfv", fgdj(int ), (int)47);
                            continue block103;
                        }
                        case 1728210882: {
                            v32 = if.ffjy("fgfw", fgdj(int ), (int)48);
                            continue block103;
                        }
                        case 1904238192: {
                            break block103;
                        }
                    }
                    break;
                }
                v33 = var1_1.getYaw();
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_8 = if.lu - if.ffjy("fgfx", fgdj(int ), (int)49)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == if.ffjy("fgfy", ffjv(int ), (int)225)) break;
                    v34 /* !! */  = (long)if.ffjy("fgfz", ffjv(int ), (int)226);
                }
                v35 = v33 + this.noiseYaw + var6_8;
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_9 = if.lu - if.ffjy("fgga", fgdj(int ), (int)50)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == if.ffjy("fggb", ffjv(int ), (int)227)) break;
                    v36 /* !! */  = (long)if.ffjy("fggc", ffjv(int ), (int)228);
                }
                v37 = var1_1.getPitch();
                v38 /* !! */  = if.lu;
                if (true) ** GOTO lbl233
                block106: while (true) {
                    v38 /* !! */  = (long)(v39 - if.ffjy("fggd", fgdj(int ), (int)51));
lbl233:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case -2083969072: {
                            v39 = if.ffjy("fgge", fgdj(int ), (int)52);
                            continue block106;
                        }
                        case 558544191: {
                            v39 = if.ffjy("fggf", fgdj(int ), (int)53);
                            continue block106;
                        }
                        case 1207197798: {
                            v39 = if.ffjy("fggg", fgdj(int ), (int)54);
                            continue block106;
                        }
                        case 1904238192: {
                            break block106;
                        }
                    }
                    break;
                }
                v40 = v37 + this.noisePitch + var7_9;
                v41 = if.ffjy("fggh", ffka(int ), (int)229);
                v42 = if.ffjy("fggi", ffka(int ), (int)230);
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_10 = if.lu - if.ffjy("fggj", fgdj(int ), (int)55)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == if.ffjy("fggk", ffjv(int ), (int)231)) break;
                    v43 /* !! */  = (long)if.ffjy("fggl", ffjv(int ), (int)232);
                }
                v44 = class_3532.method_15363((float)v40, (float)v41, (float)v42);
                v45 /* !! */  = if.lu;
                if (true) ** GOTO lbl258
                block108: while (true) {
                    v45 /* !! */  = (long)(if.ffjy("fggn", fgdj(int ), (int)57) - if.ffjy("fggm", fgdj(int ), (int)56));
lbl258:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -2022639415: {
                            continue block108;
                        }
                        case 1904238192: {
                            break block108;
                        }
                    }
                    break;
                }
                return new ov(v35, v44);
            }
            case 0: {
                var9_5 /* !! */  = (int)if.ffjy("fggo", ffjv(int ), (int)233);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl269:
            // 2 sources

            case 1: {
                var9_5 /* !! */  = (int)if.ffjy("fggp", ffjv(int ), (int)234);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl274:
            // 3 sources

            case 2: {
                var9_5 /* !! */  = (int)if.ffjy("fggq", ffjv(int ), (int)235);
                if (var10_4) {
                    throw null;
                }
            }
lbl278:
            // 4 sources

            case 3: {
                var9_5 /* !! */  = (int)if.ffjy("fggr", ffjv(int ), (int)236);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl283:
            // 2 sources

            case 4: {
                var9_5 /* !! */  = (int)if.ffjy("fggs", ffjv(int ), (int)237);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl288:
            // 4 sources

            case 5: {
                var9_5 /* !! */  = (int)if.ffjy("fggt", ffjv(int ), (int)238);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl293:
            // 2 sources

            case 6: {
                var9_5 /* !! */  = (int)if.ffjy("fggu", ffjv(int ), (int)239);
                if (!var10_4) ** GOTO lbl283
                throw null;
            }
lbl297:
            // 2 sources

            case 7: {
                var9_5 /* !! */  = (int)if.ffjy("fggv", ffjv(int ), (int)240);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl324
            }
            case 8: {
                do {
                    var9_5 /* !! */  = (int)if.ffjy("fggw", ffjv(int ), (int)241);
                } while (!var10_4);
                throw null;
            }
lbl307:
            // 2 sources

            case 9: {
                var9_5 /* !! */  = (int)if.ffjy("fggx", ffjv(int ), (int)242);
                if (!var10_4) ** GOTO lbl278
                throw null;
            }
            case 10: {
                var9_5 /* !! */  = (int)if.ffjy("fggy", ffjv(int ), (int)243);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 11: {
                var9_5 /* !! */  = (int)if.ffjy("fggz", ffjv(int ), (int)244);
                if (!var10_4) ** GOTO lbl293
                throw null;
            }
            case 12: {
                var9_5 /* !! */  = (int)if.ffjy("fgha", ffjv(int ), (int)245);
                if (!var10_4) ** GOTO lbl288
                throw null;
            }
lbl324:
            // 3 sources

            case 13: {
                var9_5 /* !! */  = (int)if.ffjy("fghb", ffjv(int ), (int)246);
                if (!var10_4) ** GOTO lbl274
                throw null;
            }
            case 14: {
                var9_5 /* !! */  = (int)if.ffjy("fghc", ffjv(int ), (int)247);
                if (!var10_4) ** GOTO lbl307
                throw null;
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_5 /* !! */  = (int)if.ffjy("fghd", ffjv(int ), (int)248);
                    if (!var10_4) ** GOTO lbl269
                    throw null;
                }
            }
lbl337:
            // 3 sources

            case 16: {
                var9_5 /* !! */  = (int)if.ffjy("fghe", ffjv(int ), (int)249);
                if (!var10_4) ** GOTO lbl324
                throw null;
            }
lbl341:
            // 2 sources

            case 17: {
                var9_5 /* !! */  = (int)if.ffjy("fghf", ffjv(int ), (int)250);
                if (!var10_4) ** GOTO lbl274
                throw null;
            }
            case 18: 
        }
        var9_5 /* !! */  = (int)if.ffjy("fghg", ffjv(int ), (int)251);
        ** while (!var10_4)
lbl348:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fiji() {
        if.ffmy[100] = 5235308836734774553L;
        if.ffmy[101] = 1578493939061307898L;
        if.ffmy[102] = 5245119769069792913L;
        if.ffmy[103] = -3314631289843805448L;
        if.ffmy[104] = -2559689109695711546L;
        if.ffmy[105] = -9123804678950124189L;
        if.ffmy[106] = -5886402994054400547L;
        if.ffmy[107] = 4819340960601969358L;
        if.ffmy[108] = 1727241591240618388L;
        if.ffmy[109] = 7141814648968079081L;
        if.ffmy[110] = 2894849930215980406L;
        if.ffmy[111] = -7809880325479017494L;
        if.ffmy[112] = -3297765233977834445L;
        if.ffmy[113] = 1432577699024127627L;
        if.ffmy[114] = -8805355607174074235L;
        if.ffmy[115] = -1317174443530688770L;
        if.ffmy[116] = 7127189843655532253L;
        if.ffmy[117] = -4496731820953750348L;
        if.ffmy[118] = -7892040500793958749L;
        if.ffmy[119] = -2996719961995013551L;
        if.ffmy[120] = 3247342666069285690L;
        if.ffmy[121] = -1916399603423236882L;
        if.ffmy[122] = -4701245114732738519L;
        if.ffmy[123] = 2438025459793028413L;
        if.ffmy[124] = 6345937316634593032L;
        if.ffmy[125] = 7959775418524826595L;
        if.ffmy[126] = -8120736444900518967L;
        if.ffmy[127] = 4468467938105749481L;
        if.ffmy[128] = -8760209188826222036L;
        if.ffmy[129] = 5671820427845820697L;
        if.ffmy[130] = -99517056813731709L;
        if.ffmy[131] = 60697258004904013L;
        if.ffmy[132] = -3000087690255648021L;
        if.ffmy[133] = -2947924782917908608L;
        if.ffmy[134] = -4932058092862463923L;
        if.ffmy[135] = 2518386631716527644L;
        if.ffmy[136] = 9000891241425099552L;
        if.ffmy[137] = -6220352138084101345L;
        if.ffmy[138] = 6225645977075710451L;
        if.ffmy[139] = -3090115429979402716L;
        if.ffmy[140] = 4421406726037171462L;
        if.ffmy[141] = 377400282040285046L;
        if.ffmy[142] = -7469343702956223970L;
        if.ffmy[143] = -5011133490015113387L;
        if.ffmy[144] = -1057141455154710076L;
        if.ffmy[145] = 6631168302875169003L;
        if.ffmy[146] = 739809685978602738L;
        if.ffmy[147] = 8226253989080481782L;
        if.ffmy[148] = -654343652993900756L;
        if.ffmy[149] = 4931675026111378805L;
        if.ffmy[150] = 3414299113616229725L;
        if.ffmy[151] = 4725791173487539681L;
        if.ffmy[152] = 711939034643094912L;
        if.ffmy[153] = 3280064772823368765L;
        if.ffmy[154] = -6492184711888831705L;
        if.ffmy[155] = -3800283065426228147L;
        if.ffmy[156] = 3259445002716265370L;
        if.ffmy[157] = 8914682115981605326L;
        if.ffmy[158] = -9039031687278096958L;
        if.ffmy[159] = -8254323538347238686L;
        if.ffmy[160] = 1315813753886319065L;
        if.ffmy[161] = 3513395192664447363L;
        if.ffmy[162] = 5013531621055148604L;
        if.ffmy[163] = -5933380428392901920L;
        if.ffmy[164] = -8419178632240401129L;
        if.ffmy[165] = -9028519118181682849L;
        if.ffmy[166] = 5100793542606910114L;
        if.ffmy[167] = -2704510164345953245L;
        if.ffmy[168] = -1056410130465604336L;
        if.ffmy[169] = -6534464401696076343L;
        if.ffmy[170] = -1419611515511295257L;
        if.ffmy[171] = 6299663559415550361L;
        if.ffmy[172] = -3418570924741167073L;
        if.ffmy[173] = -758303223253420380L;
        if.ffmy[174] = 111918579378504325L;
        if.ffmy[175] = -6553850190595687446L;
        if.ffmy[176] = 4982719328199217183L;
        if.ffmy[177] = 2669856978417688685L;
        if.ffmy[178] = 7479041513864233549L;
        if.ffmy[179] = -7702480616849992773L;
        if.ffmy[180] = -2358640802544314469L;
        if.ffmy[181] = -5628903498113505829L;
        if.ffmy[182] = 1758352839061868739L;
        if.ffmy[183] = -4676975785872490494L;
        if.ffmy[184] = 1608901149422213189L;
        if.ffmy[185] = 6610193828132397257L;
        if.ffmy[186] = 4831787787682726014L;
        if.ffmy[187] = 2117915206173057002L;
        if.ffmy[188] = 3231862887186689653L;
        if.ffmy[189] = 5101115008103334115L;
        if.ffmy[190] = -8329556435917509159L;
        if.ffmy[191] = -6025010547910356384L;
        if.ffmy[192] = -7741354951059808101L;
        if.ffmy[193] = 4772336166727255486L;
        if.ffmy[194] = 2220657160937120960L;
        if.ffmy[195] = 1192402691034787377L;
        if.ffmy[196] = -2397413166723366769L;
        if.ffmy[197] = -1036273754380316669L;
        if.ffmy[198] = 775056988423974330L;
        if.ffmy[199] = -25466231105538392L;
    }

    private static /* synthetic */ float ffka(int n2) {
        return Float.intBitsToFloat(ffjw[n2] ^ ffjx[n2]);
    }

    private static /* synthetic */ void fiix() {
        if.ffjx[0] = -1990405307;
        if.ffjx[1] = 877467580;
        if.ffjx[2] = -1064470201;
        if.ffjx[3] = -716166707;
        if.ffjx[4] = -2090466164;
        if.ffjx[5] = 1193594723;
        if.ffjx[6] = -351603378;
        if.ffjx[7] = 408710618;
        if.ffjx[8] = 1846779753;
        if.ffjx[9] = 1154150331;
        if.ffjx[10] = -681446289;
        if.ffjx[11] = -1092613529;
        if.ffjx[12] = -771416185;
        if.ffjx[13] = -775315516;
        if.ffjx[14] = -1524737520;
        if.ffjx[15] = -1408598868;
        if.ffjx[16] = 273038871;
        if.ffjx[17] = 1531631144;
        if.ffjx[18] = -370113499;
        if.ffjx[19] = 724306632;
        if.ffjx[20] = -826631181;
        if.ffjx[21] = 217850509;
        if.ffjx[22] = 2080078842;
        if.ffjx[23] = 1065393982;
        if.ffjx[24] = 429353478;
        if.ffjx[25] = 1398093866;
        if.ffjx[26] = 1657728815;
        if.ffjx[27] = 1294208413;
        if.ffjx[28] = 1142502660;
        if.ffjx[29] = -289461623;
        if.ffjx[30] = -764006190;
        if.ffjx[31] = 1511695866;
        if.ffjx[32] = 790488023;
        if.ffjx[33] = -635533105;
        if.ffjx[34] = 1113964201;
        if.ffjx[35] = 189257510;
        if.ffjx[36] = 801225449;
        if.ffjx[37] = 1038523897;
        if.ffjx[38] = 2048387963;
        if.ffjx[39] = 254124390;
        if.ffjx[40] = -943397784;
        if.ffjx[41] = 1072411630;
        if.ffjx[42] = -1040895724;
        if.ffjx[43] = 175959090;
        if.ffjx[44] = -825175127;
        if.ffjx[45] = 1180630511;
        if.ffjx[46] = 1233700582;
        if.ffjx[47] = -2096645041;
        if.ffjx[48] = 1217348532;
        if.ffjx[49] = -504131897;
        if.ffjx[50] = 509619759;
        if.ffjx[51] = 1035482908;
        if.ffjx[52] = 1062476293;
        if.ffjx[53] = -1902117311;
        if.ffjx[54] = 1477762139;
        if.ffjx[55] = 2048657195;
        if.ffjx[56] = 1782329745;
        if.ffjx[57] = -1194298919;
        if.ffjx[58] = 1616619430;
        if.ffjx[59] = -608635373;
        if.ffjx[60] = 1665094150;
        if.ffjx[61] = -773587787;
        if.ffjx[62] = 1569446405;
        if.ffjx[63] = 1119408003;
        if.ffjx[64] = 80992087;
        if.ffjx[65] = 487295701;
        if.ffjx[66] = -1597370810;
        if.ffjx[67] = 1275584922;
        if.ffjx[68] = -2086220425;
        if.ffjx[69] = -1672492151;
        if.ffjx[70] = -1658766475;
        if.ffjx[71] = 1063956086;
        if.ffjx[72] = 1473479780;
        if.ffjx[73] = 937873187;
        if.ffjx[74] = 211194497;
        if.ffjx[75] = 1027908363;
        if.ffjx[76] = -1506680730;
        if.ffjx[77] = -413578258;
        if.ffjx[78] = 434836000;
        if.ffjx[79] = -15538379;
        if.ffjx[80] = -1241322856;
        if.ffjx[81] = -2021474722;
        if.ffjx[82] = 1669854447;
        if.ffjx[83] = 1111202575;
        if.ffjx[84] = -38312537;
        if.ffjx[85] = -780740472;
        if.ffjx[86] = -1807655460;
        if.ffjx[87] = 1577260421;
        if.ffjx[88] = 1527016153;
        if.ffjx[89] = -133565228;
        if.ffjx[90] = -479402297;
        if.ffjx[91] = -931268569;
        if.ffjx[92] = 1261851473;
        if.ffjx[93] = 593592304;
        if.ffjx[94] = -1249905305;
        if.ffjx[95] = -1267717056;
        if.ffjx[96] = 552759696;
        if.ffjx[97] = -557019641;
        if.ffjx[98] = -1690043798;
        if.ffjx[99] = 410393895;
    }
}

