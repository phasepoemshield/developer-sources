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
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.ms;
import ruhack.phobia.mt;
import ruhack.phobia.nm;
import ruhack.phobia.ov;
import ruhack.phobia.ow;
import ruhack.phobia.oy;

public class ie
extends hx {
    private int spikeGuardTicks;
    private static int[] fmfd = new int[893];
    private int postHitTicks;
    private static int[] fmfe = new int[893];
    private static final float WANDER_THETA = 0.042f;
    private float lastRemPitch;
    public static final int b;
    private float wanderYaw;
    public static final long mp = -6623782144376715165L;
    private final mt model;
    private float speedDrift;
    private int recoverTicks;
    private static final float TREMOR_THETA = 0.19f;
    private int pauseTicks;
    private int rotationTicks;
    private float lastStepYaw;
    private static long[] fmer;
    private float wanderPitch;
    private long nextResetAt;
    private int pursueStreak;
    public static final boolean c;
    private float lastStepPitch;
    private float noiseYaw;
    private int lastAttackCount;
    private float noisePitch;
    private static final float WANDER_SIGMA = 0.09f;
    private static long[] fmes;
    private final Random random;
    private static final float TREMOR_SIGMA = 0.31f;
    private int lastEntityId;
    private int combatTicks;
    private float lastRemYaw;
    public static final boolean a;

    private static /* synthetic */ void fryi() {
        ie.fmfe[300] = -1841910613;
        ie.fmfe[301] = -1326284909;
        ie.fmfe[302] = -148889533;
        ie.fmfe[303] = -656713029;
        ie.fmfe[304] = -1150609168;
        ie.fmfe[305] = -336030191;
        ie.fmfe[306] = -1963582871;
        ie.fmfe[307] = -971810676;
        ie.fmfe[308] = 719224860;
        ie.fmfe[309] = 1225439143;
        ie.fmfe[310] = 176734831;
        ie.fmfe[311] = 2103129817;
        ie.fmfe[312] = -710579788;
        ie.fmfe[313] = 992533283;
        ie.fmfe[314] = -1266527648;
        ie.fmfe[315] = 1694540689;
        ie.fmfe[316] = 1605739842;
        ie.fmfe[317] = 35923429;
        ie.fmfe[318] = 1786501060;
        ie.fmfe[319] = 776423105;
        ie.fmfe[320] = 599030669;
        ie.fmfe[321] = -1316055287;
        ie.fmfe[322] = -168072722;
        ie.fmfe[323] = -2015011748;
        ie.fmfe[324] = -589676791;
        ie.fmfe[325] = -1118322485;
        ie.fmfe[326] = 1441722770;
        ie.fmfe[327] = -1089886658;
        ie.fmfe[328] = 563736464;
        ie.fmfe[329] = -768527321;
        ie.fmfe[330] = -1923918438;
        ie.fmfe[331] = 440400494;
        ie.fmfe[332] = -1921850030;
        ie.fmfe[333] = 878412480;
        ie.fmfe[334] = -1503583943;
        ie.fmfe[335] = -1021709917;
        ie.fmfe[336] = 608024330;
        ie.fmfe[337] = 1848048386;
        ie.fmfe[338] = 1368717119;
        ie.fmfe[339] = 1037400585;
        ie.fmfe[340] = 816107378;
        ie.fmfe[341] = -1098808694;
        ie.fmfe[342] = 1987798703;
        ie.fmfe[343] = -2121051580;
        ie.fmfe[344] = 1703699960;
        ie.fmfe[345] = 429732548;
        ie.fmfe[346] = -896732018;
        ie.fmfe[347] = -867454795;
        ie.fmfe[348] = 372559538;
        ie.fmfe[349] = 810654677;
        ie.fmfe[350] = -1176473859;
        ie.fmfe[351] = -607151365;
        ie.fmfe[352] = -702720626;
        ie.fmfe[353] = -2137796164;
        ie.fmfe[354] = -1689854582;
        ie.fmfe[355] = -1660309061;
        ie.fmfe[356] = 526194893;
        ie.fmfe[357] = -125851725;
        ie.fmfe[358] = -557473086;
        ie.fmfe[359] = -57051996;
        ie.fmfe[360] = -813001039;
        ie.fmfe[361] = -399589925;
        ie.fmfe[362] = 127443722;
        ie.fmfe[363] = -334478675;
        ie.fmfe[364] = 1738662516;
        ie.fmfe[365] = 1933591831;
        ie.fmfe[366] = 1261405358;
        ie.fmfe[367] = 96967329;
        ie.fmfe[368] = 1038398588;
        ie.fmfe[369] = 599694647;
        ie.fmfe[370] = 1781947706;
        ie.fmfe[371] = 1656512476;
        ie.fmfe[372] = -391198259;
        ie.fmfe[373] = -885116583;
        ie.fmfe[374] = 686514184;
        ie.fmfe[375] = 441657174;
        ie.fmfe[376] = 2045527743;
        ie.fmfe[377] = 1189295755;
        ie.fmfe[378] = -435658214;
        ie.fmfe[379] = -1348087584;
        ie.fmfe[380] = 59183344;
        ie.fmfe[381] = -1515048779;
        ie.fmfe[382] = 2090878761;
        ie.fmfe[383] = 322629806;
        ie.fmfe[384] = -654617477;
        ie.fmfe[385] = 1751736757;
        ie.fmfe[386] = 2059250685;
        ie.fmfe[387] = 1326173461;
        ie.fmfe[388] = 412264553;
        ie.fmfe[389] = 1163888331;
        ie.fmfe[390] = -175021569;
        ie.fmfe[391] = -440011628;
        ie.fmfe[392] = -355957145;
        ie.fmfe[393] = -607745993;
        ie.fmfe[394] = -371945460;
        ie.fmfe[395] = 562147352;
        ie.fmfe[396] = 1062341049;
        ie.fmfe[397] = -965279967;
        ie.fmfe[398] = 1022069899;
        ie.fmfe[399] = 1106695547;
    }

    private static /* synthetic */ double fmkl(int n2) {
        return Double.longBitsToDouble(fmer[n2] ^ fmes[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float randGauss() {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ie.fmex("frvm", fmeq(int ), (int)268) - ie.fmex("frvl", fmeq(int ), (int)267));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1184247697: {
                    continue block14;
                }
                case -421935005: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = ie.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("frvn", fmeq(int ), (int)269)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ie.fmex("frvo", fmfg(int ), (int)863)) break;
            v1 /* !! */  = (long)ie.fmex("frvp", fmfg(int ), (int)864);
        }
        var2_2 /* !! */  = ie.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("frvq", fmeq(int ), (int)270)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ie.fmex("frvr", fmfg(int ), (int)865)) break;
            v2 /* !! */  = (long)ie.fmex("frvs", fmfg(int ), (int)866);
        }
        var1_3 = ie.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (float)ie.fmex("frvt", fmfb(int ), (int)867);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = ie.mp;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(ie.fmex("frvv", fmeq(int ), (int)272) - ie.fmex("frvu", fmeq(int ), (int)271));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -421935005: {
                            break block18;
                        }
                        case 1829512196: {
                            continue block18;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("frvw", fmeq(int ), (int)273)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ie.fmex("frvy", fmfg(int ), (int)868)) break;
                    v4 /* !! */  = (long)ie.fmex("frvz", fmfg(int ), (int)869);
                }
                return (float)this.random.nextGaussian();
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ie.fmex("frwa", fmfg(int ), (int)870);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("frwb", fmfg(int ), (int)871);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("frwc", fmfg(int ), (int)872);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ie.fmex("frwd", fmfg(int ), (int)873);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void fryg() {
        ie.fmfe[100] = 1920337865;
        ie.fmfe[101] = 191082387;
        ie.fmfe[102] = -2118227302;
        ie.fmfe[103] = 1021448525;
        ie.fmfe[104] = 1911779587;
        ie.fmfe[105] = -2055362280;
        ie.fmfe[106] = -810465492;
        ie.fmfe[107] = 1401848882;
        ie.fmfe[108] = -1002483595;
        ie.fmfe[109] = 1957202065;
        ie.fmfe[110] = -1144270339;
        ie.fmfe[111] = -320313209;
        ie.fmfe[112] = 1908417970;
        ie.fmfe[113] = -1005298889;
        ie.fmfe[114] = 1487968505;
        ie.fmfe[115] = -1324098177;
        ie.fmfe[116] = -1975677092;
        ie.fmfe[117] = 1014056862;
        ie.fmfe[118] = 1152997750;
        ie.fmfe[119] = 785618388;
        ie.fmfe[120] = 408913946;
        ie.fmfe[121] = -966815986;
        ie.fmfe[122] = 205516466;
        ie.fmfe[123] = 1613596650;
        ie.fmfe[124] = 1994035752;
        ie.fmfe[125] = 560675166;
        ie.fmfe[126] = 1067699766;
        ie.fmfe[127] = 54397710;
        ie.fmfe[128] = -753271568;
        ie.fmfe[129] = 858339371;
        ie.fmfe[130] = -2007281133;
        ie.fmfe[131] = -60623546;
        ie.fmfe[132] = -1996973008;
        ie.fmfe[133] = 1874284867;
        ie.fmfe[134] = -1893366331;
        ie.fmfe[135] = 1983872307;
        ie.fmfe[136] = 2098802334;
        ie.fmfe[137] = 398832365;
        ie.fmfe[138] = 1632743100;
        ie.fmfe[139] = 998673152;
        ie.fmfe[140] = 363772225;
        ie.fmfe[141] = 1445468492;
        ie.fmfe[142] = -358140418;
        ie.fmfe[143] = -575753554;
        ie.fmfe[144] = 521215307;
        ie.fmfe[145] = 896971939;
        ie.fmfe[146] = -454826335;
        ie.fmfe[147] = 1320304795;
        ie.fmfe[148] = 357455410;
        ie.fmfe[149] = -722004203;
        ie.fmfe[150] = 1941525794;
        ie.fmfe[151] = -1265884082;
        ie.fmfe[152] = 877396925;
        ie.fmfe[153] = 213712511;
        ie.fmfe[154] = 1315345280;
        ie.fmfe[155] = -1665475562;
        ie.fmfe[156] = -32242485;
        ie.fmfe[157] = -63664513;
        ie.fmfe[158] = 1169272378;
        ie.fmfe[159] = -1991348333;
        ie.fmfe[160] = 187697458;
        ie.fmfe[161] = 1908707679;
        ie.fmfe[162] = -172752929;
        ie.fmfe[163] = -1752938840;
        ie.fmfe[164] = 1263009369;
        ie.fmfe[165] = 1749751632;
        ie.fmfe[166] = -1168932109;
        ie.fmfe[167] = -1560974319;
        ie.fmfe[168] = -1420783043;
        ie.fmfe[169] = 1709176958;
        ie.fmfe[170] = -1965465403;
        ie.fmfe[171] = 1357572081;
        ie.fmfe[172] = -235675206;
        ie.fmfe[173] = 1763748842;
        ie.fmfe[174] = 1635552067;
        ie.fmfe[175] = -1318009780;
        ie.fmfe[176] = 1055822548;
        ie.fmfe[177] = 812047950;
        ie.fmfe[178] = 842405467;
        ie.fmfe[179] = 685257812;
        ie.fmfe[180] = 1789581268;
        ie.fmfe[181] = -1116077893;
        ie.fmfe[182] = 860288587;
        ie.fmfe[183] = 1563346452;
        ie.fmfe[184] = 188668564;
        ie.fmfe[185] = -2113455756;
        ie.fmfe[186] = 2119985977;
        ie.fmfe[187] = 447041458;
        ie.fmfe[188] = -535111049;
        ie.fmfe[189] = -593666861;
        ie.fmfe[190] = -744107453;
        ie.fmfe[191] = 337767668;
        ie.fmfe[192] = 665236893;
        ie.fmfe[193] = -1443557268;
        ie.fmfe[194] = -498207789;
        ie.fmfe[195] = -927608571;
        ie.fmfe[196] = -2054008493;
        ie.fmfe[197] = 1979022450;
        ie.fmfe[198] = -1626709192;
        ie.fmfe[199] = -1560809353;
    }

    private static /* synthetic */ void fryq() {
        ie.fmer[200] = 1931027118711249875L;
        ie.fmer[201] = -8237590289288294943L;
        ie.fmer[202] = -3293799370810376200L;
        ie.fmer[203] = 1430672729171663783L;
        ie.fmer[204] = 466130547686889022L;
        ie.fmer[205] = 3207166721653992240L;
        ie.fmer[206] = 3624229979624268546L;
        ie.fmer[207] = -4088117725021511319L;
        ie.fmer[208] = 327374826539283795L;
        ie.fmer[209] = -7644571924888604930L;
        ie.fmer[210] = -37571071438137946L;
        ie.fmer[211] = 8934518186286409819L;
        ie.fmer[212] = 462558113943351462L;
        ie.fmer[213] = 6860575721275354528L;
        ie.fmer[214] = 8634817726237331932L;
        ie.fmer[215] = -7677582435665111382L;
        ie.fmer[216] = -5464987003626034892L;
        ie.fmer[217] = -3943241361828632530L;
        ie.fmer[218] = 6589051517236934694L;
        ie.fmer[219] = -588225440138785917L;
        ie.fmer[220] = -3500893197209838922L;
        ie.fmer[221] = 2760804444043167613L;
        ie.fmer[222] = -8107482398314584526L;
        ie.fmer[223] = -6989818326260913531L;
        ie.fmer[224] = 8252456944980234390L;
        ie.fmer[225] = -8743463336609280370L;
        ie.fmer[226] = -3063973978512132475L;
        ie.fmer[227] = -6931982284767063734L;
        ie.fmer[228] = 324501628285045333L;
        ie.fmer[229] = 5267532793855797285L;
        ie.fmer[230] = 7037081009982254993L;
        ie.fmer[231] = -3436061808783463263L;
        ie.fmer[232] = -6415690068856083174L;
        ie.fmer[233] = -2024207434819694885L;
        ie.fmer[234] = 8330865524532867656L;
        ie.fmer[235] = -4946590618166941115L;
        ie.fmer[236] = 1602319440262608046L;
        ie.fmer[237] = -7927740806395175153L;
        ie.fmer[238] = -5265295193757937633L;
        ie.fmer[239] = 6259008053841732422L;
        ie.fmer[240] = -4985733989060482662L;
        ie.fmer[241] = 3313604494426884918L;
        ie.fmer[242] = -179096216724800491L;
        ie.fmer[243] = -8508924740282068583L;
        ie.fmer[244] = -3276657033211155492L;
        ie.fmer[245] = 2031900418966188132L;
        ie.fmer[246] = -4494159870971423425L;
        ie.fmer[247] = -6043861193668580346L;
        ie.fmer[248] = 4210201264904457769L;
        ie.fmer[249] = 9006592421860185830L;
        ie.fmer[250] = -4874259958586120749L;
        ie.fmer[251] = 6966624955118178553L;
        ie.fmer[252] = -5204488845801014732L;
        ie.fmer[253] = 4989298418826139182L;
        ie.fmer[254] = 179055525632386418L;
        ie.fmer[255] = -8154567282434215702L;
        ie.fmer[256] = 1765880702600580839L;
        ie.fmer[257] = 4842508816326302253L;
        ie.fmer[258] = 7120475380346549653L;
        ie.fmer[259] = 977239074479838882L;
        ie.fmer[260] = -2088558493513876515L;
        ie.fmer[261] = 7231495846601556176L;
        ie.fmer[262] = -6460770318653238310L;
        ie.fmer[263] = 9118061101341134625L;
        ie.fmer[264] = 4985404972775086952L;
        ie.fmer[265] = -7630214391975993920L;
        ie.fmer[266] = 3112783099904947961L;
        ie.fmer[267] = 7330364198946791894L;
        ie.fmer[268] = 5378934433647882463L;
        ie.fmer[269] = 6986512561385510368L;
        ie.fmer[270] = 8644629317347124426L;
        ie.fmer[271] = 5834741667644556421L;
        ie.fmer[272] = 687466459539741792L;
        ie.fmer[273] = 3224987538415417431L;
        ie.fmer[274] = 1340510634373699433L;
        ie.fmer[275] = -1841425008909268396L;
        ie.fmer[276] = -5253526054268713275L;
        ie.fmer[277] = 3067222745886054427L;
        ie.fmer[278] = -1058902459297507182L;
        ie.fmer[279] = 5372024719192180342L;
        ie.fmer[280] = 201215337570754232L;
        ie.fmer[281] = -3106879869905385039L;
        ie.fmer[282] = 4138199445053961760L;
        ie.fmer[283] = -4234763568135900390L;
        ie.fmer[284] = 8398378467800967265L;
        ie.fmer[285] = 5458888601354434540L;
        ie.fmer[286] = 7771656106503924649L;
        ie.fmer[287] = -4866276003413701105L;
        ie.fmer[288] = 266702822797884202L;
        ie.fmer[289] = 2433469270231141636L;
        ie.fmer[290] = 3811696451613706535L;
        ie.fmer[291] = -2918254700618153238L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void advanceNoise() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("frrb", fmeq(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ie.fmex("frrc", fmfg(int ), (int)813)) break;
            v0 /* !! */  = (long)ie.fmex("frrd", fmfg(int ), (int)814);
        }
        var3_1 = ie.c;
        v1 /* !! */  = ie.mp;
        if (true) ** GOTO lbl11
        block94: while (true) {
            v1 /* !! */  = (long)(v2 - ie.fmex("frre", fmeq(int ), (int)212));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2082228177: {
                    v2 = ie.fmex("frrg", fmeq(int ), (int)213);
                    continue block94;
                }
                case -1223192858: {
                    v2 = ie.fmex("frrh", fmeq(int ), (int)214);
                    continue block94;
                }
                case -421935005: {
                    break block94;
                }
            }
            break;
        }
        var2_2 /* !! */  = ie.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("frri", fmeq(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ie.fmex("frrj", fmfg(int ), (int)815)) break;
            v3 /* !! */  = (long)ie.fmex("frrk", fmfg(int ), (int)816);
        }
        var1_3 = ie.a;
        if (var3_1) {
            throw null;
lbl29:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 /* !! */  = ie.mp;
        if (true) ** GOTO lbl36
        block97: while (true) {
            v4 /* !! */  = (long)(v5 - ie.fmex("frrl", fmeq(int ), (int)216));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1373627823: {
                    v5 = ie.fmex("frrm", fmeq(int ), (int)217);
                    continue block97;
                }
                case -421935005: {
                    break block97;
                }
                case 1407605747: {
                    v5 = ie.fmex("frrn", fmeq(int ), (int)218);
                    continue block97;
                }
                case 1553822486: {
                    v5 = ie.fmex("frro", fmeq(int ), (int)219);
                    continue block97;
                }
            }
            break;
        }
        v6 = ie.fmex("frrp", fmfb(int ), (int)817);
        v7 /* !! */  = ie.mp;
        if (true) ** GOTO lbl53
        block98: while (true) {
            v7 /* !! */  = (long)(ie.fmex("frrr", fmeq(int ), (int)221) - ie.fmex("frrq", fmeq(int ), (int)220));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -933476878: {
                    continue block98;
                }
                case -421935005: {
                    break block98;
                }
            }
            break;
        }
        v8 = v6 * this.noiseYaw;
        v9 = ie.fmex("frrs", fmfb(int ), (int)818);
        v10 /* !! */  = ie.mp;
        if (true) ** GOTO lbl64
        block99: while (true) {
            v10 /* !! */  = (long)(ie.fmex("frru", fmeq(int ), (int)223) - ie.fmex("frrt", fmeq(int ), (int)222));
lbl64:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -421935005: {
                    break block99;
                }
                case 1444327571: {
                    continue block99;
                }
            }
            break;
        }
        v11 = this.noiseYaw + (v8 + v9 * this.randGauss());
        v12 /* !! */  = ie.mp;
        if (true) ** GOTO lbl74
        block100: while (true) {
            v12 /* !! */  = (long)(ie.fmex("frrw", fmeq(int ), (int)225) - ie.fmex("frrv", fmeq(int ), (int)224));
lbl74:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -421935005: {
                    break block100;
                }
                case 466610422: {
                    continue block100;
                }
            }
            break;
        }
        this.noiseYaw = v11;
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("frrx", fmeq(int ), (int)226)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ie.fmex("frrz", fmfg(int ), (int)819)) break;
            v13 /* !! */  = (long)ie.fmex("frsa", fmfg(int ), (int)820);
        }
        v14 = ie.fmex("frsb", fmfb(int ), (int)821);
        v15 /* !! */  = ie.mp;
        if (true) ** GOTO lbl91
        block102: while (true) {
            v15 /* !! */  = (long)(v16 - ie.fmex("frsc", fmeq(int ), (int)227));
lbl91:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1312882086: {
                    v16 = ie.fmex("frsd", fmeq(int ), (int)228);
                    continue block102;
                }
                case -421935005: {
                    break block102;
                }
                case 1697426800: {
                    v16 = ie.fmex("frse", fmeq(int ), (int)229);
                    continue block102;
                }
            }
            break;
        }
        v17 = v14 * this.noisePitch;
        v18 = ie.fmex("frsf", fmfb(int ), (int)822);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("frsh", fmeq(int ), (int)230)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ie.fmex("frsi", fmfg(int ), (int)823)) break;
            v19 /* !! */  = (long)ie.fmex("frsj", fmfg(int ), (int)824);
        }
        v20 = this.noisePitch + (v17 + v18 * this.randGauss());
        v21 /* !! */  = ie.mp;
        if (true) ** GOTO lbl112
        block104: while (true) {
            v21 /* !! */  = (long)(v22 - ie.fmex("frsk", fmeq(int ), (int)231));
lbl112:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -882356347: {
                    v22 = ie.fmex("frsl", fmeq(int ), (int)232);
                    continue block104;
                }
                case -659657232: {
                    v22 = ie.fmex("frsm", fmeq(int ), (int)233);
                    continue block104;
                }
                case -421935005: {
                    break block104;
                }
                case 1311438035: {
                    v22 = ie.fmex("frsn", fmeq(int ), (int)234);
                    continue block104;
                }
            }
            break;
        }
        this.noisePitch = v20;
        if (var1_3 || var1_3) ** GOTO lbl29
        v23 /* !! */  = ie.mp;
        if (true) ** GOTO lbl130
        block105: while (true) {
            v23 /* !! */  = (long)(ie.fmex("frsp", fmeq(int ), (int)236) - ie.fmex("frso", fmeq(int ), (int)235));
lbl130:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -421935005: {
                    break block105;
                }
                case 1331701480: {
                    continue block105;
                }
            }
            break;
        }
        v24 = ie.fmex("frsq", fmfb(int ), (int)825);
        v25 /* !! */  = ie.mp;
        if (true) ** GOTO lbl140
        block106: while (true) {
            v25 /* !! */  = (long)(v26 - ie.fmex("frsr", fmeq(int ), (int)237));
lbl140:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1167522319: {
                    v26 = ie.fmex("frss", fmeq(int ), (int)238);
                    continue block106;
                }
                case -763386745: {
                    v26 = ie.fmex("frst", fmeq(int ), (int)239);
                    continue block106;
                }
                case -421935005: {
                    break block106;
                }
            }
            break;
        }
        v27 = v24 * this.wanderYaw;
        v28 = ie.fmex("frsu", fmfb(int ), (int)826);
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_4 = ie.mp - ie.fmex("frsv", fmeq(int ), (int)240)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == ie.fmex("frsw", fmfg(int ), (int)827)) break;
            v29 /* !! */  = (long)ie.fmex("frsx", fmfg(int ), (int)828);
        }
        v30 = this.wanderYaw + (v27 + v28 * this.randGauss());
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_5 = ie.mp - ie.fmex("frsy", fmeq(int ), (int)241)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == ie.fmex("frsz", fmfg(int ), (int)829)) break;
            v31 /* !! */  = (long)ie.fmex("frta", fmfg(int ), (int)830);
        }
        this.wanderYaw = v30;
        if (var1_3 || var1_3) ** GOTO lbl29
        v32 /* !! */  = ie.mp;
        if (true) ** GOTO lbl168
        block109: while (true) {
            v32 /* !! */  = (long)(v33 - ie.fmex("frtc", fmeq(int ), (int)242));
lbl168:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -1997511071: {
                    v33 = ie.fmex("frtd", fmeq(int ), (int)243);
                    continue block109;
                }
                case -421935005: {
                    break block109;
                }
                case -89843055: {
                    v33 = ie.fmex("frte", fmeq(int ), (int)244);
                    continue block109;
                }
                case 1395588855: {
                    v33 = ie.fmex("frtf", fmeq(int ), (int)245);
                    continue block109;
                }
            }
            break;
        }
        v34 = ie.fmex("frtg", fmfb(int ), (int)831);
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_6 = ie.mp - ie.fmex("frth", fmeq(int ), (int)246)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == ie.fmex("frti", fmfg(int ), (int)832)) break;
            v35 /* !! */  = (long)ie.fmex("frtj", fmfg(int ), (int)833);
        }
        v36 = v34 * this.wanderPitch;
        v37 = ie.fmex("frtk", fmfb(int ), (int)834);
        v38 /* !! */  = ie.mp;
        if (true) ** GOTO lbl192
        block111: while (true) {
            v38 /* !! */  = (long)(v39 - ie.fmex("frtl", fmeq(int ), (int)247));
lbl192:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case -603701769: {
                    v39 = ie.fmex("frtm", fmeq(int ), (int)248);
                    continue block111;
                }
                case -421935005: {
                    break block111;
                }
                case 916371139: {
                    v39 = ie.fmex("frtn", fmeq(int ), (int)249);
                    continue block111;
                }
                case 1408261062: {
                    v39 = ie.fmex("frto", fmeq(int ), (int)250);
                    continue block111;
                }
            }
            break;
        }
        v40 = this.wanderPitch + (v36 + v37 * this.randGauss());
        v41 /* !! */  = ie.mp;
        if (true) ** GOTO lbl209
        block112: while (true) {
            v41 /* !! */  = (long)(v42 - ie.fmex("frtq", fmeq(int ), (int)251));
lbl209:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -1028802964: {
                    v42 = ie.fmex("frtr", fmeq(int ), (int)252);
                    continue block112;
                }
                case -421935005: {
                    break block112;
                }
                case 1213343190: {
                    v42 = ie.fmex("frts", fmeq(int ), (int)253);
                    continue block112;
                }
                case 1827754388: {
                    v42 = ie.fmex("frtt", fmeq(int ), (int)254);
                    continue block112;
                }
            }
            break;
        }
        this.wanderPitch = v40;
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_7 = ie.mp - ie.fmex("frtu", fmeq(int ), (int)255)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ie.fmex("frtv", fmfg(int ), (int)835)) break;
                    v43 /* !! */  = (long)ie.fmex("frtw", fmfg(int ), (int)836);
                }
                v44 = ie.fmex("frtx", fmfb(int ), (int)837);
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_8 = ie.mp - ie.fmex("frty", fmeq(int ), (int)256)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == ie.fmex("frtz", fmfg(int ), (int)838)) break;
                    v45 /* !! */  = (long)ie.fmex("frua", fmfg(int ), (int)839);
                }
                v46 = v44 * this.speedDrift;
                v47 = ie.fmex("frub", fmfb(int ), (int)840);
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_9 = ie.mp - ie.fmex("fruc", fmeq(int ), (int)257)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == ie.fmex("frud", fmfg(int ), (int)841)) break;
                    v48 /* !! */  = (long)ie.fmex("frue", fmfg(int ), (int)842);
                }
                v49 = this.speedDrift + (v46 + v47 * this.randGauss());
                v50 /* !! */  = ie.mp;
                if (true) ** GOTO lbl249
                block116: while (true) {
                    v50 /* !! */  = (long)(v51 - ie.fmex("frug", fmeq(int ), (int)258));
lbl249:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -1282594566: {
                            v51 = ie.fmex("fruh", fmeq(int ), (int)259);
                            continue block116;
                        }
                        case -421935005: {
                            break block116;
                        }
                        case 766585639: {
                            v51 = ie.fmex("frui", fmeq(int ), (int)260);
                            continue block116;
                        }
                    }
                    break;
                }
                this.speedDrift = v49;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_10 = ie.mp - ie.fmex("fruj", fmeq(int ), (int)261)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == ie.fmex("fruk", fmfg(int ), (int)843)) break;
                    v52 /* !! */  = (long)ie.fmex("frul", fmfg(int ), (int)844);
                }
                v53 = ie.fmex("frum", fmfb(int ), (int)845);
                v54 = ie.fmex("frun", fmfb(int ), (int)846);
                v55 /* !! */  = ie.mp;
                if (true) ** GOTO lbl271
                block118: while (true) {
                    v55 /* !! */  = (long)(ie.fmex("frup", fmeq(int ), (int)263) - ie.fmex("fruo", fmeq(int ), (int)262));
lbl271:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -421935005: {
                            break block118;
                        }
                        case 1470113275: {
                            continue block118;
                        }
                    }
                    break;
                }
                v56 = class_3532.method_15363((float)this.speedDrift, (float)v53, (float)v54);
                v57 /* !! */  = ie.mp;
                if (true) ** GOTO lbl281
                block119: while (true) {
                    v57 /* !! */  = (long)(v58 - ie.fmex("fruq", fmeq(int ), (int)264));
lbl281:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -2019477169: {
                            v58 = ie.fmex("frur", fmeq(int ), (int)265);
                            continue block119;
                        }
                        case -677376495: {
                            v58 = ie.fmex("frus", fmeq(int ), (int)266);
                            continue block119;
                        }
                        case -421935005: {
                            break block119;
                        }
                    }
                    break;
                }
                this.speedDrift = v56;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl293:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ie.fmex("frut", fmfg(int ), (int)847);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("fruu", fmfg(int ), (int)848);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl303:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("fruv", fmfg(int ), (int)849);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl308:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ie.fmex("fruw", fmfg(int ), (int)850);
                if (!var3_1) ** GOTO lbl303
                throw null;
            }
lbl312:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ie.fmex("fruy", fmfg(int ), (int)851);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 5: {
                var2_2 /* !! */  = (int)ie.fmex("fruz", fmfg(int ), (int)852);
                if (!var3_1) ** GOTO lbl312
                throw null;
            }
lbl321:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ie.fmex("frva", fmfg(int ), (int)853);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl344
                    break;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ie.fmex("frvb", fmfg(int ), (int)854);
                if (!var3_1) ** GOTO lbl293
                throw null;
            }
lbl331:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ie.fmex("frvc", fmfg(int ), (int)855);
                if (!var3_1) ** GOTO lbl293
                throw null;
            }
lbl335:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ie.fmex("frvd", fmfg(int ), (int)856);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl340:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ie.fmex("frve", fmfg(int ), (int)857);
                if (!var3_1) break;
                throw null;
            }
lbl344:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ie.fmex("frvf", fmfg(int ), (int)858);
                if (!var3_1) ** GOTO lbl321
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ie.fmex("frvg", fmfg(int ), (int)859);
                if (!var3_1) ** GOTO lbl335
                throw null;
            }
lbl352:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ie.fmex("frvh", fmfg(int ), (int)860);
                if (!var3_1) ** GOTO lbl335
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ie.fmex("frvi", fmfg(int ), (int)861);
                if (!var3_1) ** GOTO lbl331
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ie.fmex("frvk", fmfg(int ), (int)862);
        ** while (!var3_1)
lbl363:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float fmfb(int n2) {
        return Float.intBitsToFloat(fmfd[n2] ^ fmfe[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] deflectStep(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("fqph", fmeq(int ), (int)164));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1559735453: {
                    v1 = ie.fmex("fqpm", fmeq(int ), (int)165);
                    continue block49;
                }
                case -421935005: {
                    break block49;
                }
                case 183154167: {
                    v1 = ie.fmex("fqpo", fmeq(int ), (int)166);
                    continue block49;
                }
                case 1856172671: {
                    v1 = ie.fmex("fqpq", fmeq(int ), (int)167);
                    continue block49;
                }
            }
            break;
        }
        var15_7 = ie.c;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl22
        block50: while (true) {
            v2 /* !! */  = (long)(ie.fmex("fqps", fmeq(int ), (int)169) - ie.fmex("fqpr", fmeq(int ), (int)168));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -421935005: {
                    break block50;
                }
                case 1758377643: {
                    continue block50;
                }
            }
            break;
        }
        var14_8 /* !! */  = ie.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fqpu", fmeq(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ie.fmex("fqpv", fmfg(int ), (int)742)) break;
            v3 /* !! */  = (long)ie.fmex("fqqd", fmfg(int ), (int)743);
        }
        var13_9 = ie.a;
        if (var15_7) {
            throw null;
lbl37:
            // 7 sources

            return null;
        }
        if (var13_9 || var13_9) ** GOTO lbl37
        var7_10 = var1_1 / (var3_3 + ie.fmex("fqqe", fmfb(int ), (int)744));
        if (var13_9 || var13_9) ** GOTO lbl37
        if (var14_8 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var14_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var8_11 = var2_2 / (var3_3 + ie.fmex("fqqf", fmfb(int ), (int)745));
                if (var13_9 || var13_9) ** GOTO lbl37
                v4 = var5_5;
                v5 = var6_6;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fqqi", fmeq(int ), (int)171)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ie.fmex("fqqk", fmfg(int ), (int)746)) break;
                    v6 /* !! */  = (long)ie.fmex("fqqm", fmfg(int ), (int)747);
                }
                var9_12 = (float)Math.hypot(v4, v5);
                if (var13_9 || var13_9) ** GOTO lbl37
                v7 = ie.fmex("fqqp", fmfb(int ), (int)748);
                v8 = ie.fmex("fqqs", fmfb(int ), (int)749);
                v9 /* !! */  = ie.mp;
                if (true) ** GOTO lbl63
                block54: while (true) {
                    v9 /* !! */  = (long)(ie.fmex("fqqx", fmeq(int ), (int)173) - ie.fmex("fqqv", fmeq(int ), (int)172));
lbl63:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -421935005: {
                            break block54;
                        }
                        case -348462842: {
                            continue block54;
                        }
                    }
                    break;
                }
                v10 = this.lerp((float)v7, (float)v8);
                v11 = (var4_4 - ie.fmex("fqra", fmfb(int ), (int)750)) / ie.fmex("fqrc", fmfb(int ), (int)751);
                v12 /* !! */  = ie.mp;
                if (true) ** GOTO lbl74
                block55: while (true) {
                    v12 /* !! */  = (long)(v13 - ie.fmex("fqrd", fmeq(int ), (int)174));
lbl74:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -602808192: {
                            v13 = ie.fmex("fqrh", fmeq(int ), (int)175);
                            continue block55;
                        }
                        case -421935005: {
                            break block55;
                        }
                        case 1552288946: {
                            v13 = ie.fmex("fqrj", fmeq(int ), (int)176);
                            continue block55;
                        }
                        case 1554210850: {
                            v13 = ie.fmex("fqrl", fmeq(int ), (int)177);
                            continue block55;
                        }
                    }
                    break;
                }
                var10_13 = v10 * class_3532.method_15363((float)v11, (float)0.0f, (float)1.0f);
                if (var13_9 || var13_9) ** GOTO lbl37
                v14 = ie.fmex("fqro", fmfb(int ), (int)752);
                v15 = ie.fmex("fqrp", fmfb(int ), (int)753);
                v16 /* !! */  = ie.mp;
                if (true) ** GOTO lbl94
                block56: while (true) {
                    v16 /* !! */  = (long)(v17 - ie.fmex("fqrq", fmeq(int ), (int)178));
lbl94:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -879883901: {
                            v17 = ie.fmex("fqrr", fmeq(int ), (int)179);
                            continue block56;
                        }
                        case -421935005: {
                            break block56;
                        }
                        case -91105860: {
                            v17 = ie.fmex("fqrz", fmeq(int ), (int)180);
                            continue block56;
                        }
                    }
                    break;
                }
                var11_14 = var5_5 - var7_10 * var9_12 * var10_13 - var8_11 * this.lerp((float)v14, (float)v15);
                if (var13_9 || var13_9) ** GOTO lbl37
                v18 = ie.fmex("fqsb", fmfb(int ), (int)754);
                v19 = ie.fmex("fqsd", fmfb(int ), (int)755);
                v20 /* !! */  = ie.mp;
                if (true) ** GOTO lbl111
                block57: while (true) {
                    v20 /* !! */  = (long)(v21 - ie.fmex("fqsi", fmeq(int ), (int)181));
lbl111:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1490646316: {
                            v21 = ie.fmex("fqsj", fmeq(int ), (int)182);
                            continue block57;
                        }
                        case -421935005: {
                            break block57;
                        }
                        case -2990010: {
                            v21 = ie.fmex("fqsk", fmeq(int ), (int)183);
                            continue block57;
                        }
                        case 2116207561: {
                            v21 = ie.fmex("fqsl", fmeq(int ), (int)184);
                            continue block57;
                        }
                    }
                    break;
                }
                var12_15 = var6_6 - var8_11 * var9_12 * var10_13 + var7_10 * this.lerp((float)v18, (float)v19) * ie.fmex("fqsm", fmfb(int ), (int)756);
                if (var13_9 || var13_9) ** continue;
                return new float[]{var11_14, var12_15};
            }
lbl126:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_8 /* !! */  = (int)ie.fmex("fqsn", fmfg(int ), (int)757);
                    if (!var15_7) break block10;
                    throw null;
                }
            }
lbl131:
            // 2 sources

            case 1: {
                var14_8 /* !! */  = (int)ie.fmex("fqso", fmfg(int ), (int)758);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 2: {
                var14_8 /* !! */  = (int)ie.fmex("fqss", fmfg(int ), (int)759);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 3: {
                var14_8 /* !! */  = (int)ie.fmex("fqst", fmfg(int ), (int)760);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl146:
            // 4 sources

            case 4: {
                var14_8 /* !! */  = (int)ie.fmex("fqsu", fmfg(int ), (int)761);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                var14_8 /* !! */  = (int)ie.fmex("fqsv", fmfg(int ), (int)762);
                if (!var15_7) break;
                throw null;
            }
lbl155:
            // 2 sources

            case 6: {
                var14_8 /* !! */  = (int)ie.fmex("fqsz", fmfg(int ), (int)763);
                if (!var15_7) ** GOTO lbl126
                throw null;
            }
            case 7: {
                var14_8 /* !! */  = (int)ie.fmex("fqtc", fmfg(int ), (int)764);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl164:
            // 2 sources

            case 8: {
                var14_8 /* !! */  = (int)ie.fmex("fqtd", fmfg(int ), (int)765);
                if (!var15_7) ** GOTO lbl131
                throw null;
            }
lbl168:
            // 5 sources

            case 9: {
                var14_8 /* !! */  = (int)ie.fmex("fqtl", fmfg(int ), (int)766);
                if (!var15_7) ** GOTO lbl146
                throw null;
            }
            case 10: {
                var14_8 /* !! */  = (int)ie.fmex("fqtm", fmfg(int ), (int)767);
                if (!var15_7) ** GOTO lbl146
                throw null;
            }
lbl176:
            // 3 sources

            case 11: {
                var14_8 /* !! */  = (int)ie.fmex("fquh", fmfg(int ), (int)768);
                if (!var15_7) ** GOTO lbl168
                throw null;
            }
            case 12: {
                var14_8 /* !! */  = (int)ie.fmex("fqui", fmfg(int ), (int)769);
                if (!var15_7) ** GOTO lbl176
                throw null;
            }
            case 13: {
                var14_8 /* !! */  = (int)ie.fmex("fquj", fmfg(int ), (int)770);
                if (!var15_7) ** GOTO lbl164
                throw null;
            }
            case 14: {
                var14_8 /* !! */  = (int)ie.fmex("fqum", fmfg(int ), (int)771);
                if (!var15_7) ** GOTO lbl155
                throw null;
            }
            case 15: 
        }
        var14_8 /* !! */  = (int)ie.fmex("fqup", fmfg(int ), (int)772);
        ** while (!var15_7)
lbl195:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fmeq(int n2) {
        return fmer[n2] ^ fmes[n2];
    }

    private static /* synthetic */ void fryo() {
        ie.fmer[0] = -4538368215123384111L;
        ie.fmer[1] = 7191865855250782167L;
        ie.fmer[2] = 5860074017945756587L;
        ie.fmer[3] = 2866373201751708985L;
        ie.fmer[4] = -3901422751244700643L;
        ie.fmer[5] = -3239217021492438906L;
        ie.fmer[6] = 1382878329431842940L;
        ie.fmer[7] = 8282190489242238424L;
        ie.fmer[8] = 715572842740549873L;
        ie.fmer[9] = -8594268438429208177L;
        ie.fmer[10] = 5120964771100062227L;
        ie.fmer[11] = 8531419637821913736L;
        ie.fmer[12] = 6064825956692394489L;
        ie.fmer[13] = 6667021878614441178L;
        ie.fmer[14] = -804115807900733874L;
        ie.fmer[15] = -158561717674057182L;
        ie.fmer[16] = 5870715261697094180L;
        ie.fmer[17] = -6428087385831955750L;
        ie.fmer[18] = -4145888331447577411L;
        ie.fmer[19] = 1317053968611388196L;
        ie.fmer[20] = 8827774039465834696L;
        ie.fmer[21] = -9052856723535454308L;
        ie.fmer[22] = 2854954565221339241L;
        ie.fmer[23] = -2924947376165201471L;
        ie.fmer[24] = 1582841233122723664L;
        ie.fmer[25] = -7679639007420840198L;
        ie.fmer[26] = 8854051300882963105L;
        ie.fmer[27] = 9018834868875714729L;
        ie.fmer[28] = 7077091294431805057L;
        ie.fmer[29] = -5351877230504624784L;
        ie.fmer[30] = 8472799289242137734L;
        ie.fmer[31] = -7383040121340810505L;
        ie.fmer[32] = 7450909482970694255L;
        ie.fmer[33] = 9112945239146448984L;
        ie.fmer[34] = -3312956294525793543L;
        ie.fmer[35] = -593603940911620783L;
        ie.fmer[36] = 4934361511612444010L;
        ie.fmer[37] = -2702971357048184572L;
        ie.fmer[38] = 5667683524801456342L;
        ie.fmer[39] = 4079384505538955139L;
        ie.fmer[40] = 6636283192672125038L;
        ie.fmer[41] = 4169124383246776325L;
        ie.fmer[42] = 2448338582527109603L;
        ie.fmer[43] = 4328197395340698669L;
        ie.fmer[44] = 3951367166998782699L;
        ie.fmer[45] = -4248484545313960562L;
        ie.fmer[46] = -683299372418011109L;
        ie.fmer[47] = -2456238173279946128L;
        ie.fmer[48] = 4086078236677015184L;
        ie.fmer[49] = -1854879504121498635L;
        ie.fmer[50] = -5685281106782901165L;
        ie.fmer[51] = -7676017321177664427L;
        ie.fmer[52] = 7081676927907480990L;
        ie.fmer[53] = 3059848572561581807L;
        ie.fmer[54] = 7954603152597657075L;
        ie.fmer[55] = -7782609144342539980L;
        ie.fmer[56] = 5985333659695229467L;
        ie.fmer[57] = -4980684102249420838L;
        ie.fmer[58] = 1114481237724985524L;
        ie.fmer[59] = 1328948016967808969L;
        ie.fmer[60] = 4899120960806642846L;
        ie.fmer[61] = -8636799321251776074L;
        ie.fmer[62] = 8588074607882785690L;
        ie.fmer[63] = 6589955932753626898L;
        ie.fmer[64] = 7929370177442706294L;
        ie.fmer[65] = -6198664624359898780L;
        ie.fmer[66] = 5823873116404177559L;
        ie.fmer[67] = -8972656277955117554L;
        ie.fmer[68] = 6422833316067036190L;
        ie.fmer[69] = 5398971469610177393L;
        ie.fmer[70] = -6488450257131981724L;
        ie.fmer[71] = -8206771376642102681L;
        ie.fmer[72] = -7584552588745697349L;
        ie.fmer[73] = -2894231567129412950L;
        ie.fmer[74] = 8248531489607400543L;
        ie.fmer[75] = -7048666413104794165L;
        ie.fmer[76] = -3373504863933144239L;
        ie.fmer[77] = 1749019665488511013L;
        ie.fmer[78] = -468098599776238689L;
        ie.fmer[79] = -4815671952995195748L;
        ie.fmer[80] = 1208620168974489068L;
        ie.fmer[81] = 8590349643658256191L;
        ie.fmer[82] = -8258470677103789774L;
        ie.fmer[83] = -7477064365764828895L;
        ie.fmer[84] = 6348988883443210405L;
        ie.fmer[85] = 3661454524113621382L;
        ie.fmer[86] = -3043624514095935525L;
        ie.fmer[87] = 6362099649491597701L;
        ie.fmer[88] = 3206439373312141533L;
        ie.fmer[89] = -2890284399579965790L;
        ie.fmer[90] = 2665082908470140887L;
        ie.fmer[91] = -1950413375227526885L;
        ie.fmer[92] = -2749869848549831143L;
        ie.fmer[93] = -4962661652163704846L;
        ie.fmer[94] = 6834422564291223428L;
        ie.fmer[95] = -7873545227777905421L;
        ie.fmer[96] = -5466720895416540179L;
        ie.fmer[97] = -8461953729907086816L;
        ie.fmer[98] = 720036393820664168L;
        ie.fmer[99] = 193766122301844399L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] resetFallbackStep(float var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("foog", fmeq(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ie.fmex("fooh", fmfg(int ), (int)434)) break;
            v0 /* !! */  = (long)ie.fmex("fooi", fmfg(int ), (int)435);
        }
        var13_4 = ie.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fooj", fmeq(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ie.fmex("fook", fmfg(int ), (int)436)) break;
            v1 /* !! */  = (long)ie.fmex("fool", fmfg(int ), (int)437);
        }
        var12_5 /* !! */  = ie.b;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl19
        block52: while (true) {
            v2 /* !! */  = (long)(ie.fmex("foor", fmeq(int ), (int)97) - ie.fmex("fooq", fmeq(int ), (int)96));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -765983006: {
                    continue block52;
                }
                case -421935005: {
                    break block52;
                }
            }
            break;
        }
        var11_6 = ie.a;
        if (var13_4) {
            throw null;
lbl27:
            // 14 sources

            return null;
        }
        if (var11_6 || var11_6) ** GOTO lbl27
        v3 = ie.fmex("foos", fmfb(int ), (int)438);
        v4 = ie.fmex("foot", fmfb(int ), (int)439);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("foou", fmeq(int ), (int)98)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ie.fmex("foow", fmfg(int ), (int)440)) break;
            v5 /* !! */  = (long)ie.fmex("fooy", fmfg(int ), (int)441);
        }
        var4_7 = this.lerp((float)v3, (float)v4);
        if (var11_6 || var11_6) ** GOTO lbl27
        v6 = ie.fmex("fooz", fmfb(int ), (int)442);
        v7 = ie.fmex("fopa", fmfb(int ), (int)443);
        v8 /* !! */  = ie.mp;
        if (true) ** GOTO lbl46
        block55: while (true) {
            v8 /* !! */  = (long)(v9 - ie.fmex("fopb", fmeq(int ), (int)99));
lbl46:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -421935005: {
                    break block55;
                }
                case -193293462: {
                    v9 = ie.fmex("fopc", fmeq(int ), (int)100);
                    continue block55;
                }
                case 1020192944: {
                    v9 = ie.fmex("fopd", fmeq(int ), (int)101);
                    continue block55;
                }
            }
            break;
        }
        var5_8 = this.lerp((float)v6, (float)v7);
        if (var11_6 || var11_6) ** GOTO lbl27
        v10 = -var5_8;
        v11 /* !! */  = ie.mp;
        if (true) ** GOTO lbl62
        block56: while (true) {
            v11 /* !! */  = (long)(ie.fmex("fopj", fmeq(int ), (int)103) - ie.fmex("foph", fmeq(int ), (int)102));
lbl62:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -421935005: {
                    break block56;
                }
                case 1358285247: {
                    continue block56;
                }
            }
            break;
        }
        var6_9 = class_3532.method_15363((float)(var1_1 * var4_7), (float)v10, (float)var5_8);
        if (var11_6) ** GOTO lbl27
        if (var12_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_6) ** GOTO lbl27
                v12 = var2_2 * var4_7 * ie.fmex("fopm", fmfb(int ), (int)444);
                v13 = -var5_8 * ie.fmex("fopn", fmfb(int ), (int)445);
                v14 = var5_8 * ie.fmex("fopo", fmfb(int ), (int)446);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fopp", fmeq(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == ie.fmex("fopq", fmfg(int ), (int)447)) break;
                    v15 /* !! */  = (long)ie.fmex("fopt", fmfg(int ), (int)448);
                }
                var7_10 = class_3532.method_15363((float)v12, (float)v13, (float)v14);
                if (var11_6 || var11_6) ** GOTO lbl27
                v16 = var6_9;
                v17 = var7_10;
                v18 /* !! */  = ie.mp;
                if (true) ** GOTO lbl90
                block58: while (true) {
                    v18 /* !! */  = (long)(ie.fmex("fopy", fmeq(int ), (int)106) - ie.fmex("fopw", fmeq(int ), (int)105));
lbl90:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -421935005: {
                            break block58;
                        }
                        case 2017592355: {
                            continue block58;
                        }
                    }
                    break;
                }
                var8_11 = (float)Math.hypot(v16, v17);
                if (var11_6 || var11_6) ** GOTO lbl27
                v19 = var3_3 * ie.fmex("foqa", fmfb(int ), (int)449);
                v20 /* !! */  = ie.mp;
                if (true) ** GOTO lbl102
                block59: while (true) {
                    v20 /* !! */  = (long)(v21 - ie.fmex("foqc", fmeq(int ), (int)107));
lbl102:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1150339124: {
                            v21 = ie.fmex("foqd", fmeq(int ), (int)108);
                            continue block59;
                        }
                        case -421935005: {
                            break block59;
                        }
                        case 1419710435: {
                            v21 = ie.fmex("foqe", fmeq(int ), (int)109);
                            continue block59;
                        }
                    }
                    break;
                }
                var9_12 = Math.min(var5_8, v19);
                if (var11_6 || var11_6) ** GOTO lbl27
                if (!(var8_11 > var9_12)) ** GOTO lbl123
                if (var11_6) ** GOTO lbl27
                if (!(var8_11 > ie.fmex("foqg", fmfb(int ), (int)450))) ** GOTO lbl123
                if (var11_6 || var11_6) ** GOTO lbl27
                var10_13 = var9_12 / var8_11;
                if (var11_6 || var11_6) ** GOTO lbl27
                var6_9 *= var10_13;
                if (var11_6 || var11_6) ** GOTO lbl27
                var7_10 *= var10_13;
                if (var11_6) ** GOTO lbl27
lbl123:
                // 3 sources

                if (!var11_6 && !var11_6) ** break;
                ** continue;
                return new float[]{var6_9, var7_10};
            }
            case 0: {
                var12_5 /* !! */  = (int)ie.fmex("foqm", fmfg(int ), (int)451);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 1: {
                var12_5 /* !! */  = (int)ie.fmex("foqo", fmfg(int ), (int)452);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl136:
            // 2 sources

            case 2: {
                var12_5 /* !! */  = (int)ie.fmex("foqp", fmfg(int ), (int)453);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl141:
            // 2 sources

            case 3: {
                var12_5 /* !! */  = (int)ie.fmex("foqq", fmfg(int ), (int)454);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl146:
            // 2 sources

            case 4: {
                var12_5 /* !! */  = (int)ie.fmex("foqr", fmfg(int ), (int)455);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl151:
            // 4 sources

            case 5: {
                var12_5 /* !! */  = (int)ie.fmex("foqs", fmfg(int ), (int)456);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 6: {
                do {
                    var12_5 /* !! */  = (int)ie.fmex("fpgd", fmfg(int ), (int)457);
                } while (!var13_4);
                throw null;
            }
lbl161:
            // 4 sources

            case 7: {
                var12_5 /* !! */  = (int)ie.fmex("fpge", fmfg(int ), (int)458);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl166:
            // 2 sources

            case 8: {
                var12_5 /* !! */  = (int)ie.fmex("fpgf", fmfg(int ), (int)459);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl171:
            // 2 sources

            case 9: {
                var12_5 /* !! */  = (int)ie.fmex("fpgg", fmfg(int ), (int)460);
                if (!var13_4) ** GOTO lbl161
                throw null;
            }
            case 10: {
                var12_5 /* !! */  = (int)ie.fmex("fpgh", fmfg(int ), (int)461);
                if (!var13_4) ** GOTO lbl161
                throw null;
            }
lbl179:
            // 2 sources

            case 11: {
                var12_5 /* !! */  = (int)ie.fmex("fpgi", fmfg(int ), (int)462);
                if (!var13_4) ** GOTO lbl151
                throw null;
            }
            case 12: {
                var12_5 /* !! */  = (int)ie.fmex("fpgj", fmfg(int ), (int)463);
                if (!var13_4) ** GOTO lbl151
                throw null;
            }
lbl187:
            // 2 sources

            case 13: {
                var12_5 /* !! */  = (int)ie.fmex("fpgk", fmfg(int ), (int)464);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl192:
            // 3 sources

            case 14: {
                var12_5 /* !! */  = (int)ie.fmex("fpgl", fmfg(int ), (int)465);
                if (var13_4) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 15: {
                var12_5 /* !! */  = (int)ie.fmex("fpgm", fmfg(int ), (int)466);
                if (!var13_4) ** GOTO lbl146
                throw null;
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_5 /* !! */  = (int)ie.fmex("fpgn", fmfg(int ), (int)467);
                    if (!var13_4) ** GOTO lbl166
                    throw null;
                }
            }
lbl206:
            // 4 sources

            case 17: {
                var12_5 /* !! */  = (int)ie.fmex("fpgo", fmfg(int ), (int)468);
                if (!var13_4) ** GOTO lbl151
                throw null;
            }
            case 18: {
                var12_5 /* !! */  = (int)ie.fmex("fpgp", fmfg(int ), (int)469);
                if (!var13_4) ** GOTO lbl136
                throw null;
            }
lbl214:
            // 2 sources

            case 19: {
                var12_5 /* !! */  = (int)ie.fmex("fpgq", fmfg(int ), (int)470);
                if (!var13_4) ** GOTO lbl187
                throw null;
            }
            case 20: {
                var12_5 /* !! */  = (int)ie.fmex("fpgr", fmfg(int ), (int)471);
                if (!var13_4) ** GOTO lbl206
                throw null;
            }
lbl222:
            // 3 sources

            case 21: {
                var12_5 /* !! */  = (int)ie.fmex("fpgs", fmfg(int ), (int)472);
                if (!var13_4) ** GOTO lbl192
                throw null;
            }
            case 22: {
                var12_5 /* !! */  = (int)ie.fmex("fpgt", fmfg(int ), (int)473);
                if (!var13_4) ** GOTO lbl171
                throw null;
            }
            case 23: {
                var12_5 /* !! */  = (int)ie.fmex("fpgu", fmfg(int ), (int)474);
                if (!var13_4) ** GOTO lbl214
                throw null;
            }
lbl234:
            // 4 sources

            case 24: {
                var12_5 /* !! */  = (int)ie.fmex("fpgv", fmfg(int ), (int)475);
                if (!var13_4) ** GOTO lbl222
                throw null;
            }
            case 25: 
        }
        var12_5 /* !! */  = (int)ie.fmex("fpgw", fmfg(int ), (int)476);
        ** while (!var13_4)
lbl241:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fryt() {
        ie.fmes[200] = 4234621731988865547L;
        ie.fmes[201] = -233868219651328005L;
        ie.fmes[202] = 7605891281669282584L;
        ie.fmes[203] = 7433223148747726349L;
        ie.fmes[204] = 197463608731495501L;
        ie.fmes[205] = -682212757771258201L;
        ie.fmes[206] = -5982646654786644950L;
        ie.fmes[207] = 4218552002798306268L;
        ie.fmes[208] = 4116241367387348553L;
        ie.fmes[209] = 8392816880106097194L;
        ie.fmes[210] = -1916667551329529904L;
        ie.fmes[211] = 9153701646553714656L;
        ie.fmes[212] = 3120877822774595045L;
        ie.fmes[213] = 6733100399079344204L;
        ie.fmes[214] = -2139918796829493905L;
        ie.fmes[215] = -3175546682278484442L;
        ie.fmes[216] = -1394355070048685825L;
        ie.fmes[217] = 4101953948119807299L;
        ie.fmes[218] = -8777029484837075273L;
        ie.fmes[219] = -7103689848206036735L;
        ie.fmes[220] = 3412500191292968057L;
        ie.fmes[221] = -4630797362220807989L;
        ie.fmes[222] = -8932597052283569759L;
        ie.fmes[223] = -5404782255456245250L;
        ie.fmes[224] = 5446442100552833111L;
        ie.fmes[225] = 7374787361766436503L;
        ie.fmes[226] = 3200982769285625586L;
        ie.fmes[227] = -5615515774588450778L;
        ie.fmes[228] = 4924369498032603168L;
        ie.fmes[229] = -1911022265124573664L;
        ie.fmes[230] = -2202278990846420895L;
        ie.fmes[231] = 335919577856396876L;
        ie.fmes[232] = 7565522552736386525L;
        ie.fmes[233] = -7745636128045083700L;
        ie.fmes[234] = 388867240603873349L;
        ie.fmes[235] = -7589249829430440309L;
        ie.fmes[236] = 8780271998795356861L;
        ie.fmes[237] = -3678614169160643121L;
        ie.fmes[238] = 5954451108074558563L;
        ie.fmes[239] = 5363563841151201242L;
        ie.fmes[240] = 3390052903225930085L;
        ie.fmes[241] = -6712040681454118249L;
        ie.fmes[242] = -6396305555740425043L;
        ie.fmes[243] = -1586378398476388517L;
        ie.fmes[244] = 4598996641672038353L;
        ie.fmes[245] = -8060457745722664670L;
        ie.fmes[246] = -6061774348325146980L;
        ie.fmes[247] = 2192429732786083414L;
        ie.fmes[248] = 7956092574121637817L;
        ie.fmes[249] = -3618142588864030209L;
        ie.fmes[250] = 6508085948086555495L;
        ie.fmes[251] = -3508530097479381843L;
        ie.fmes[252] = 1422964390481009998L;
        ie.fmes[253] = 7552873289087870103L;
        ie.fmes[254] = -8897773952826016921L;
        ie.fmes[255] = 1093951652268143509L;
        ie.fmes[256] = 198571752573308161L;
        ie.fmes[257] = -1966867672699414489L;
        ie.fmes[258] = -7929249717534016684L;
        ie.fmes[259] = -219737627341679695L;
        ie.fmes[260] = -3557073676890323724L;
        ie.fmes[261] = 149285187226884297L;
        ie.fmes[262] = -4991466128310647798L;
        ie.fmes[263] = -4162109612789653454L;
        ie.fmes[264] = 5689836232169643639L;
        ie.fmes[265] = 960294462065670311L;
        ie.fmes[266] = 3738136963677329774L;
        ie.fmes[267] = 3150314832020800385L;
        ie.fmes[268] = -8206210794052574025L;
        ie.fmes[269] = 5586865818610450974L;
        ie.fmes[270] = 6088695798869842230L;
        ie.fmes[271] = -8843583858244967413L;
        ie.fmes[272] = 564027699897868420L;
        ie.fmes[273] = -7965162675652960834L;
        ie.fmes[274] = 6888966705814117348L;
        ie.fmes[275] = -2859385050586397781L;
        ie.fmes[276] = -510504034145852520L;
        ie.fmes[277] = -6727102094451464653L;
        ie.fmes[278] = -8820243980873867851L;
        ie.fmes[279] = -4354848331325558785L;
        ie.fmes[280] = 170449171495382248L;
        ie.fmes[281] = -1192193819681298841L;
        ie.fmes[282] = 7438197536978110603L;
        ie.fmes[283] = 2659552134875787200L;
        ie.fmes[284] = -1945617583705635500L;
        ie.fmes[285] = -5426603357219988785L;
        ie.fmes[286] = -2118665100859692605L;
        ie.fmes[287] = 8282724490325878615L;
        ie.fmes[288] = -1029428621287265102L;
        ie.fmes[289] = -7432928651280251300L;
        ie.fmes[290] = 3875805276168570173L;
        ie.fmes[291] = 5736784819962003735L;
    }

    private static /* synthetic */ int fmfg(int n2) {
        return fmfd[n2] ^ fmfe[n2];
    }

    private static /* synthetic */ void frxu() {
        ie.fmfd[100] = -1920337866;
        ie.fmfd[101] = 709669211;
        ie.fmfd[102] = 2118227301;
        ie.fmfd[103] = -460356663;
        ie.fmfd[104] = -1911779588;
        ie.fmfd[105] = -576225857;
        ie.fmfd[106] = -810465495;
        ie.fmfd[107] = 1401848886;
        ie.fmfd[108] = -1002483599;
        ie.fmfd[109] = 1957202064;
        ie.fmfd[110] = -1144270342;
        ie.fmfd[111] = -320313216;
        ie.fmfd[112] = 1908417975;
        ie.fmfd[113] = -1005298893;
        ie.fmfd[114] = 1487968508;
        ie.fmfd[115] = -1324098187;
        ie.fmfd[116] = -1975677098;
        ie.fmfd[117] = -1014056863;
        ie.fmfd[118] = -2033839998;
        ie.fmfd[119] = 301909906;
        ie.fmfd[120] = 664766490;
        ie.fmfd[121] = 966815985;
        ie.fmfd[122] = 1732464906;
        ie.fmfd[123] = -1613596651;
        ie.fmfd[124] = -688886159;
        ie.fmfd[125] = -560675167;
        ie.fmfd[126] = 1361161237;
        ie.fmfd[127] = 1014605082;
        ie.fmfd[128] = -327181674;
        ie.fmfd[129] = 1919498283;
        ie.fmfd[130] = 2007281132;
        ie.fmfd[131] = 1640096178;
        ie.fmfd[132] = -1996972997;
        ie.fmfd[133] = 1874284868;
        ie.fmfd[134] = -1893366329;
        ie.fmfd[135] = 1983872319;
        ie.fmfd[136] = 2098802331;
        ie.fmfd[137] = 398832358;
        ie.fmfd[138] = 1632743098;
        ie.fmfd[139] = 998673154;
        ie.fmfd[140] = 363772225;
        ie.fmfd[141] = 1445468486;
        ie.fmfd[142] = -358140417;
        ie.fmfd[143] = -575753566;
        ie.fmfd[144] = 521215308;
        ie.fmfd[145] = 896971947;
        ie.fmfd[146] = -454826336;
        ie.fmfd[147] = 302927097;
        ie.fmfd[148] = 723267266;
        ie.fmfd[149] = -338378721;
        ie.fmfd[150] = -1941525795;
        ie.fmfd[151] = 454524887;
        ie.fmfd[152] = 188964756;
        ie.fmfd[153] = 864128731;
        ie.fmfd[154] = -1315345281;
        ie.fmfd[155] = 836099392;
        ie.fmfd[156] = -32242486;
        ie.fmfd[157] = -63664515;
        ie.fmfd[158] = 1169272376;
        ie.fmfd[159] = -1991348334;
        ie.fmfd[160] = 907271736;
        ie.fmfd[161] = 1908707677;
        ie.fmfd[162] = -172752929;
        ie.fmfd[163] = -1752938840;
        ie.fmfd[164] = 1996711423;
        ie.fmfd[165] = -708555911;
        ie.fmfd[166] = -2015568166;
        ie.fmfd[167] = -1560974059;
        ie.fmfd[168] = -1420783091;
        ie.fmfd[169] = 1709176959;
        ie.fmfd[170] = -1965465404;
        ie.fmfd[171] = 1357572080;
        ie.fmfd[172] = -235675205;
        ie.fmfd[173] = 1403238789;
        ie.fmfd[174] = 503542972;
        ie.fmfd[175] = -265239476;
        ie.fmfd[176] = 1055822549;
        ie.fmfd[177] = 812047950;
        ie.fmfd[178] = 842405466;
        ie.fmfd[179] = 399265461;
        ie.fmfd[180] = 0x55285888;
        ie.fmfd[181] = -1116077894;
        ie.fmfd[182] = 205977163;
        ie.fmfd[183] = 1655669178;
        ie.fmfd[184] = 188668567;
        ie.fmfd[185] = -2113455754;
        ie.fmfd[186] = 2119985977;
        ie.fmfd[187] = 447041459;
        ie.fmfd[188] = -535111051;
        ie.fmfd[189] = -495240523;
        ie.fmfd[190] = -744107454;
        ie.fmfd[191] = 731949914;
        ie.fmfd[192] = 405103255;
        ie.fmfd[193] = -1770600602;
        ie.fmfd[194] = -498207787;
        ie.fmfd[195] = -927608445;
        ie.fmfd[196] = -2054008461;
        ie.fmfd[197] = 1979022585;
        ie.fmfd[198] = -1626709228;
        ie.fmfd[199] = -1560809435;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float clampOvershoot(float var0, float var1_1, float var2_2) {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("frqb", fmeq(int ), (int)194));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1037113605: {
                    v1 = ie.fmex("frqc", fmeq(int ), (int)195);
                    continue block35;
                }
                case -421935005: {
                    break block35;
                }
                case 1349555856: {
                    v1 = ie.fmex("frqd", fmeq(int ), (int)196);
                    continue block35;
                }
                case 2005588946: {
                    v1 = ie.fmex("frqf", fmeq(int ), (int)197);
                    continue block35;
                }
            }
            break;
        }
        var6_3 = ie.c;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl22
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - ie.fmex("frqg", fmeq(int ), (int)198));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1545838055: {
                    v3 = ie.fmex("frqh", fmeq(int ), (int)199);
                    continue block36;
                }
                case -421935005: {
                    break block36;
                }
                case 960807266: {
                    v3 = ie.fmex("frqi", fmeq(int ), (int)200);
                    continue block36;
                }
                case 1632037741: {
                    v3 = ie.fmex("frqj", fmeq(int ), (int)201);
                    continue block36;
                }
            }
            break;
        }
        var5_4 /* !! */  = ie.b;
        v4 /* !! */  = ie.mp;
        if (true) ** GOTO lbl39
        block37: while (true) {
            v4 /* !! */  = (long)(v5 - ie.fmex("frqk", fmeq(int ), (int)202));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -748001279: {
                    v5 = ie.fmex("frql", fmeq(int ), (int)203);
                    continue block37;
                }
                case -421935005: {
                    break block37;
                }
                case 1905290742: {
                    v5 = ie.fmex("frqm", fmeq(int ), (int)204);
                    continue block37;
                }
                case 1914371835: {
                    v5 = ie.fmex("frqn", fmeq(int ), (int)205);
                    continue block37;
                }
            }
            break;
        }
        var4_5 = ie.a;
        if (var6_3) {
            throw null;
lbl54:
            // 3 sources

            return (float)ie.fmex("frqo", fmfb(int ), (int)806);
        }
        if (var4_5) ** GOTO lbl54
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl54
                v6 /* !! */  = ie.mp;
                if (true) ** GOTO lbl65
                block39: while (true) {
                    v6 /* !! */  = (long)(ie.fmex("frqq", fmeq(int ), (int)207) - ie.fmex("frqp", fmeq(int ), (int)206));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -421935005: {
                            break block39;
                        }
                        case -379817590: {
                            continue block39;
                        }
                    }
                    break;
                }
                var3_6 = Math.abs(var1_1);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                v7 = -var3_6 * var2_2;
                v8 /* !! */  = ie.mp;
                if (true) ** GOTO lbl78
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - ie.fmex("frqr", fmeq(int ), (int)208));
lbl78:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1193298741: {
                            v9 = ie.fmex("frqs", fmeq(int ), (int)209);
                            continue block40;
                        }
                        case -421935005: {
                            break block40;
                        }
                        case 821248401: {
                            v9 = ie.fmex("frqt", fmeq(int ), (int)210);
                            continue block40;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)var0, (float)v7, (float)(var3_6 * var2_2));
            }
lbl88:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ie.fmex("frqv", fmfg(int ), (int)807);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl102
                    break;
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)ie.fmex("frqw", fmfg(int ), (int)808);
                if (!var6_3) break;
                throw null;
            }
            case 2: {
                var5_4 /* !! */  = (int)ie.fmex("frqx", fmfg(int ), (int)809);
                if (!var6_3) break;
                throw null;
            }
lbl102:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)ie.fmex("frqy", fmfg(int ), (int)810);
                if (!var6_3) ** GOTO lbl88
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)ie.fmex("frqz", fmfg(int ), (int)811);
                if (!var6_3) break;
                throw null;
            }
            case 5: 
        }
        var5_4 /* !! */  = (int)ie.fmex("frra", fmfg(int ), (int)812);
        ** while (!var6_3)
lbl113:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fryc() {
        ie.fmfd[600] = 2070877623;
        ie.fmfd[601] = 48277152;
        ie.fmfd[602] = 1107318847;
        ie.fmfd[603] = 221293321;
        ie.fmfd[604] = 1529416189;
        ie.fmfd[605] = -1486376227;
        ie.fmfd[606] = -397294323;
        ie.fmfd[607] = -1064802435;
        ie.fmfd[608] = 592870390;
        ie.fmfd[609] = -1357150844;
        ie.fmfd[610] = 588716763;
        ie.fmfd[611] = -26211769;
        ie.fmfd[612] = -1895814882;
        ie.fmfd[613] = 725466516;
        ie.fmfd[614] = 1902941656;
        ie.fmfd[615] = 1800450676;
        ie.fmfd[616] = 403651668;
        ie.fmfd[617] = 248186525;
        ie.fmfd[618] = 184632275;
        ie.fmfd[619] = 448705863;
        ie.fmfd[620] = 1546508352;
        ie.fmfd[621] = 1507638939;
        ie.fmfd[622] = 1671970667;
        ie.fmfd[623] = -648165894;
        ie.fmfd[624] = -1209871914;
        ie.fmfd[625] = -253324010;
        ie.fmfd[626] = -1583262463;
        ie.fmfd[627] = -2097408909;
        ie.fmfd[628] = -365810578;
        ie.fmfd[629] = 1378259116;
        ie.fmfd[630] = 421422911;
        ie.fmfd[631] = -1314358797;
        ie.fmfd[632] = 87023276;
        ie.fmfd[633] = -444341229;
        ie.fmfd[634] = -234086676;
        ie.fmfd[635] = -1980898131;
        ie.fmfd[636] = -1412087446;
        ie.fmfd[637] = 616249226;
        ie.fmfd[638] = 1316603536;
        ie.fmfd[639] = 491332347;
        ie.fmfd[640] = 1083262552;
        ie.fmfd[641] = 0x41154554;
        ie.fmfd[642] = 828726275;
        ie.fmfd[643] = 163220843;
        ie.fmfd[644] = 1597024951;
        ie.fmfd[645] = 139391493;
        ie.fmfd[646] = -194105423;
        ie.fmfd[647] = -882289089;
        ie.fmfd[648] = -321218654;
        ie.fmfd[649] = 455623582;
        ie.fmfd[650] = -801004554;
        ie.fmfd[651] = 1751547665;
        ie.fmfd[652] = -1817089742;
        ie.fmfd[653] = 1870780705;
        ie.fmfd[654] = 750445732;
        ie.fmfd[655] = -2097562163;
        ie.fmfd[656] = 477005591;
        ie.fmfd[657] = -599340387;
        ie.fmfd[658] = -2081970941;
        ie.fmfd[659] = -993865860;
        ie.fmfd[660] = 1917554546;
        ie.fmfd[661] = 2027622684;
        ie.fmfd[662] = 1538342320;
        ie.fmfd[663] = 278789736;
        ie.fmfd[664] = 1408907803;
        ie.fmfd[665] = -1163600090;
        ie.fmfd[666] = -2046118116;
        ie.fmfd[667] = 316859804;
        ie.fmfd[668] = -1701858269;
        ie.fmfd[669] = -473331342;
        ie.fmfd[670] = -1669750773;
        ie.fmfd[671] = -75453951;
        ie.fmfd[672] = 1549754368;
        ie.fmfd[673] = -593696822;
        ie.fmfd[674] = -1025984796;
        ie.fmfd[675] = 1273706686;
        ie.fmfd[676] = 17576793;
        ie.fmfd[677] = 1875660414;
        ie.fmfd[678] = -1910531971;
        ie.fmfd[679] = 1846417948;
        ie.fmfd[680] = 832295820;
        ie.fmfd[681] = -874659428;
        ie.fmfd[682] = 855701312;
        ie.fmfd[683] = -2134975528;
        ie.fmfd[684] = 596088157;
        ie.fmfd[685] = 1889286587;
        ie.fmfd[686] = -317416453;
        ie.fmfd[687] = -959049991;
        ie.fmfd[688] = 1365380641;
        ie.fmfd[689] = -524277428;
        ie.fmfd[690] = -108811982;
        ie.fmfd[691] = 229247237;
        ie.fmfd[692] = 1994720929;
        ie.fmfd[693] = 764516915;
        ie.fmfd[694] = 840702875;
        ie.fmfd[695] = -1863575022;
        ie.fmfd[696] = -1405858985;
        ie.fmfd[697] = -1103482998;
        ie.fmfd[698] = -1580153267;
        ie.fmfd[699] = 1961446212;
    }

    private static /* synthetic */ void fryr() {
        ie.fmes[0] = -8553683152417391972L;
        ie.fmes[1] = -9037688027622450352L;
        ie.fmes[2] = 4936514811722525190L;
        ie.fmes[3] = -1820230190696309082L;
        ie.fmes[4] = 3213349429064160518L;
        ie.fmes[5] = -8442469839172856997L;
        ie.fmes[6] = -3030679288935342884L;
        ie.fmes[7] = -1995277420609592605L;
        ie.fmes[8] = -5826280268429080127L;
        ie.fmes[9] = 9007951272248082107L;
        ie.fmes[10] = 2980671165015985376L;
        ie.fmes[11] = -7570486766661418472L;
        ie.fmes[12] = -8596202896387268590L;
        ie.fmes[13] = 3280259989189549442L;
        ie.fmes[14] = 1241567287071502796L;
        ie.fmes[15] = -299911921447409100L;
        ie.fmes[16] = -6021947696803084014L;
        ie.fmes[17] = 5732638889632262692L;
        ie.fmes[18] = -4155407771958749382L;
        ie.fmes[19] = 3992360495892451226L;
        ie.fmes[20] = 8902819152508380807L;
        ie.fmes[21] = -3445635432346677929L;
        ie.fmes[22] = 4072602361978141968L;
        ie.fmes[23] = -7948768968973469275L;
        ie.fmes[24] = -5468556861429923905L;
        ie.fmes[25] = -4471574116080694431L;
        ie.fmes[26] = 4037569654757376309L;
        ie.fmes[27] = 9018834868875714729L;
        ie.fmes[28] = 7269903309886970027L;
        ie.fmes[29] = -2456715937724878838L;
        ie.fmes[30] = 169005492698906340L;
        ie.fmes[31] = 578820113906580302L;
        ie.fmes[32] = 6377911544997869133L;
        ie.fmes[33] = 4553523065331742777L;
        ie.fmes[34] = 8983084029081343655L;
        ie.fmes[35] = -3480213627843598054L;
        ie.fmes[36] = 6487004942695281742L;
        ie.fmes[37] = 1130088380170196806L;
        ie.fmes[38] = -6709216142527187385L;
        ie.fmes[39] = 1297204258768731586L;
        ie.fmes[40] = 6223496384430884785L;
        ie.fmes[41] = 8777432701953636357L;
        ie.fmes[42] = -1049193049731999482L;
        ie.fmes[43] = -2289934782568566368L;
        ie.fmes[44] = 35594439643682175L;
        ie.fmes[45] = 8221636885164933961L;
        ie.fmes[46] = -8690902630628995917L;
        ie.fmes[47] = 872104355990605457L;
        ie.fmes[48] = -5533658297543136811L;
        ie.fmes[49] = 3465688639125592667L;
        ie.fmes[50] = 4078650107612670028L;
        ie.fmes[51] = 5523738859677906911L;
        ie.fmes[52] = 6748410555482064286L;
        ie.fmes[53] = -5879490992194540147L;
        ie.fmes[54] = -303782608881105433L;
        ie.fmes[55] = -7410578282242708911L;
        ie.fmes[56] = -6663373170719481164L;
        ie.fmes[57] = 9039484830063094263L;
        ie.fmes[58] = -5807197744395528775L;
        ie.fmes[59] = -5156216206896577098L;
        ie.fmes[60] = -5634082003606416366L;
        ie.fmes[61] = 1257646679581776728L;
        ie.fmes[62] = 5002547110574662460L;
        ie.fmes[63] = 5659548365740099344L;
        ie.fmes[64] = 5902750345125983094L;
        ie.fmes[65] = 4643822783407350251L;
        ie.fmes[66] = 8859138779242347197L;
        ie.fmes[67] = -7994242497492181846L;
        ie.fmes[68] = -4996690312871363278L;
        ie.fmes[69] = 6094923772007799006L;
        ie.fmes[70] = -7923376953344316945L;
        ie.fmes[71] = -5621705190531437977L;
        ie.fmes[72] = -2869693037294082219L;
        ie.fmes[73] = -8856513137726556571L;
        ie.fmes[74] = -4643034511509719214L;
        ie.fmes[75] = -4734396382806099738L;
        ie.fmes[76] = -1238798640559529135L;
        ie.fmes[77] = -3536265962482827597L;
        ie.fmes[78] = 3648867624535019444L;
        ie.fmes[79] = -8160288564418461138L;
        ie.fmes[80] = -7479029291007103161L;
        ie.fmes[81] = 1238689067837177496L;
        ie.fmes[82] = -2367726358212299288L;
        ie.fmes[83] = -5666407000612809199L;
        ie.fmes[84] = -3848363654068764524L;
        ie.fmes[85] = -8409339683212000261L;
        ie.fmes[86] = -8921919723784228379L;
        ie.fmes[87] = -574945087033334375L;
        ie.fmes[88] = -1103779058309907322L;
        ie.fmes[89] = 5114471070576025116L;
        ie.fmes[90] = -6644686056905591342L;
        ie.fmes[91] = 6899095823982477367L;
        ie.fmes[92] = 2800218556267920181L;
        ie.fmes[93] = -4962661652163705166L;
        ie.fmes[94] = 4238725334237121957L;
        ie.fmes[95] = -5107291268193925745L;
        ie.fmes[96] = 3483790417991263088L;
        ie.fmes[97] = 2702813406537336159L;
        ie.fmes[98] = -2173904116153986656L;
        ie.fmes[99] = 7511760365376755766L;
    }

    private static /* synthetic */ void fryn() {
        ie.fmfe[800] = 1887904240;
        ie.fmfe[801] = 1501782150;
        ie.fmfe[802] = 1637344284;
        ie.fmfe[803] = 412196299;
        ie.fmfe[804] = 86472828;
        ie.fmfe[805] = -2128133393;
        ie.fmfe[806] = 1652738386;
        ie.fmfe[807] = -1383466529;
        ie.fmfe[808] = -1913061882;
        ie.fmfe[809] = 1072639470;
        ie.fmfe[810] = 1125859540;
        ie.fmfe[811] = 37029538;
        ie.fmfe[812] = -544218833;
        ie.fmfe[813] = 1404704030;
        ie.fmfe[814] = 1956338472;
        ie.fmfe[815] = 1360080929;
        ie.fmfe[816] = 1329897753;
        ie.fmfe[817] = -255352604;
        ie.fmfe[818] = -2126690329;
        ie.fmfe[819] = 154966252;
        ie.fmfe[820] = -2067507799;
        ie.fmfe[821] = -692461580;
        ie.fmfe[822] = 19007145;
        ie.fmfe[823] = -1381893369;
        ie.fmfe[824] = 1427167252;
        ie.fmfe[825] = 429220080;
        ie.fmfe[826] = -1643120174;
        ie.fmfe[827] = -1993259474;
        ie.fmfe[828] = 493948923;
        ie.fmfe[829] = -478115787;
        ie.fmfe[830] = -1326996680;
        ie.fmfe[831] = -1596915118;
        ie.fmfe[832] = -109511801;
        ie.fmfe[833] = -1410395198;
        ie.fmfe[834] = -102146503;
        ie.fmfe[835] = -152086186;
        ie.fmfe[836] = 659141967;
        ie.fmfe[837] = 662081763;
        ie.fmfe[838] = 1965089594;
        ie.fmfe[839] = -1801760118;
        ie.fmfe[840] = 561473167;
        ie.fmfe[841] = 1374540690;
        ie.fmfe[842] = -1558134250;
        ie.fmfe[843] = 233201166;
        ie.fmfe[844] = 868880927;
        ie.fmfe[845] = -445797557;
        ie.fmfe[846] = 155154980;
        ie.fmfe[847] = 696306167;
        ie.fmfe[848] = -70139575;
        ie.fmfe[849] = -852948447;
        ie.fmfe[850] = 443816493;
        ie.fmfe[851] = 610801068;
        ie.fmfe[852] = 995077130;
        ie.fmfe[853] = 722349727;
        ie.fmfe[854] = 1457669980;
        ie.fmfe[855] = -1301531492;
        ie.fmfe[856] = 1043853401;
        ie.fmfe[857] = -483320147;
        ie.fmfe[858] = 951889029;
        ie.fmfe[859] = -2034296807;
        ie.fmfe[860] = 794664372;
        ie.fmfe[861] = -1588559208;
        ie.fmfe[862] = -1827200830;
        ie.fmfe[863] = -1562320585;
        ie.fmfe[864] = -1996706878;
        ie.fmfe[865] = 417682271;
        ie.fmfe[866] = -343948175;
        ie.fmfe[867] = -896600519;
        ie.fmfe[868] = 1841584723;
        ie.fmfe[869] = -1167250864;
        ie.fmfe[870] = -1046826115;
        ie.fmfe[871] = -1880711899;
        ie.fmfe[872] = 2094689825;
        ie.fmfe[873] = 1179136705;
        ie.fmfe[874] = 650362768;
        ie.fmfe[875] = 411905305;
        ie.fmfe[876] = -459447813;
        ie.fmfe[877] = 1280444663;
        ie.fmfe[878] = -1910817593;
        ie.fmfe[879] = 897384352;
        ie.fmfe[880] = -1767087970;
        ie.fmfe[881] = -1631923446;
        ie.fmfe[882] = -1435182693;
        ie.fmfe[883] = 380303959;
        ie.fmfe[884] = 1452677155;
        ie.fmfe[885] = -611083744;
        ie.fmfe[886] = -152249658;
        ie.fmfe[887] = 1376065354;
        ie.fmfe[888] = -1952784450;
        ie.fmfe[889] = 946462552;
        ie.fmfe[890] = -479856340;
        ie.fmfe[891] = 259200333;
        ie.fmfe[892] = -1763090864;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ie() {
        var2_1 /* !! */  = ie.b;
        super("Holyworld");
        this.model = ms.get();
        this.random = new Random((long)(ie.fmex("fmez", fmeq(int ), (int)0) ^ System.nanoTime()));
        this.lastRemYaw = (float)ie.fmex("fmff", fmfb(int ), (int)0);
        this.lastEntityId = (int)ie.fmex("fmfi", fmfg(int ), (int)1);
        this.lastAttackCount = (int)ie.fmex("fmfj", fmfg(int ), (int)2);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.resetNoise();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ie.fmex("fmfk", fmfg(int ), (int)3);
            }
lbl15:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)ie.fmex("fmfl", fmfg(int ), (int)4);
                break;
            }
lbl18:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ie.fmex("fmfm", fmfg(int ), (int)5);
                ** GOTO lbl27
            }
            case 3: {
                var2_1 /* !! */  = (int)ie.fmex("fmfn", fmfg(int ), (int)6);
                break;
            }
            case 4: {
                var2_1 /* !! */  = (int)ie.fmex("fmfp", fmfg(int ), (int)7);
                ** GOTO lbl32
            }
lbl27:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)ie.fmex("fmfq", fmfg(int ), (int)8);
                ** GOTO lbl15
            }
            case 6: {
                var2_1 /* !! */  = (int)ie.fmex("fmfr", fmfg(int ), (int)9);
            }
lbl32:
            // 3 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ie.fmex("fmfs", fmfg(int ), (int)10);
                    ** GOTO lbl18
                    break;
                }
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)ie.fmex("fmft", fmfg(int ), (int)11);
        ** while (true)
    }

    private static /* synthetic */ void fryd() {
        ie.fmfd[700] = -709935274;
        ie.fmfd[701] = 1860231255;
        ie.fmfd[702] = -1823056725;
        ie.fmfd[703] = -965457774;
        ie.fmfd[704] = 885344090;
        ie.fmfd[705] = 1341594986;
        ie.fmfd[706] = -706575247;
        ie.fmfd[707] = -948988270;
        ie.fmfd[708] = 924440986;
        ie.fmfd[709] = -608173250;
        ie.fmfd[710] = -258448352;
        ie.fmfd[711] = 1882255094;
        ie.fmfd[712] = 1628675468;
        ie.fmfd[713] = -1471740013;
        ie.fmfd[714] = 261597286;
        ie.fmfd[715] = 647654638;
        ie.fmfd[716] = -518639251;
        ie.fmfd[717] = 280016398;
        ie.fmfd[718] = -2053362235;
        ie.fmfd[719] = 646600294;
        ie.fmfd[720] = -2006115897;
        ie.fmfd[721] = 298324687;
        ie.fmfd[722] = -1657146361;
        ie.fmfd[723] = -483028445;
        ie.fmfd[724] = 736181538;
        ie.fmfd[725] = 1648674851;
        ie.fmfd[726] = -797135245;
        ie.fmfd[727] = -147614779;
        ie.fmfd[728] = -548512133;
        ie.fmfd[729] = -1738243783;
        ie.fmfd[730] = -1954577150;
        ie.fmfd[731] = 594985023;
        ie.fmfd[732] = 1525762745;
        ie.fmfd[733] = -1019996093;
        ie.fmfd[734] = 2059852808;
        ie.fmfd[735] = 2006486366;
        ie.fmfd[736] = 1065266510;
        ie.fmfd[737] = -729056583;
        ie.fmfd[738] = -932236497;
        ie.fmfd[739] = 1720771386;
        ie.fmfd[740] = 446546393;
        ie.fmfd[741] = 1267295712;
        ie.fmfd[742] = -1733316628;
        ie.fmfd[743] = -963649626;
        ie.fmfd[744] = -878738486;
        ie.fmfd[745] = 1903925103;
        ie.fmfd[746] = -1503051877;
        ie.fmfd[747] = -1511072338;
        ie.fmfd[748] = -551013780;
        ie.fmfd[749] = 1300853524;
        ie.fmfd[750] = 158697014;
        ie.fmfd[751] = 620502172;
        ie.fmfd[752] = 165828032;
        ie.fmfd[753] = 1960051205;
        ie.fmfd[754] = 136802396;
        ie.fmfd[755] = 7351842;
        ie.fmfd[756] = 383019614;
        ie.fmfd[757] = 131963657;
        ie.fmfd[758] = -1070694140;
        ie.fmfd[759] = -977046963;
        ie.fmfd[760] = 1892044568;
        ie.fmfd[761] = -1625765087;
        ie.fmfd[762] = -412816314;
        ie.fmfd[763] = 135281847;
        ie.fmfd[764] = -1610672333;
        ie.fmfd[765] = 1196880593;
        ie.fmfd[766] = 1409128586;
        ie.fmfd[767] = -1444732798;
        ie.fmfd[768] = -807877282;
        ie.fmfd[769] = 372511697;
        ie.fmfd[770] = 1575358853;
        ie.fmfd[771] = -1864657075;
        ie.fmfd[772] = 2133533975;
        ie.fmfd[773] = -257923713;
        ie.fmfd[774] = 12254245;
        ie.fmfd[775] = 1167159846;
        ie.fmfd[776] = 544897773;
        ie.fmfd[777] = -72872249;
        ie.fmfd[778] = 1091573773;
        ie.fmfd[779] = 793970805;
        ie.fmfd[780] = 1330965731;
        ie.fmfd[781] = -81744703;
        ie.fmfd[782] = -242147376;
        ie.fmfd[783] = -206064458;
        ie.fmfd[784] = 970615725;
        ie.fmfd[785] = -1569156129;
        ie.fmfd[786] = -1191997998;
        ie.fmfd[787] = -1784387545;
        ie.fmfd[788] = 971198456;
        ie.fmfd[789] = -571667231;
        ie.fmfd[790] = 316143173;
        ie.fmfd[791] = -1210144281;
        ie.fmfd[792] = -2027065612;
        ie.fmfd[793] = 1204441079;
        ie.fmfd[794] = 1074954099;
        ie.fmfd[795] = -848082340;
        ie.fmfd[796] = -917979998;
        ie.fmfd[797] = 1058072116;
        ie.fmfd[798] = -627963221;
        ie.fmfd[799] = 1861095350;
    }

    private static /* synthetic */ void frys() {
        ie.fmes[100] = -7660288485578829042L;
        ie.fmes[101] = 1593494059358395282L;
        ie.fmes[102] = -1381143514580012948L;
        ie.fmes[103] = 797969581588583399L;
        ie.fmes[104] = -4490218390824322677L;
        ie.fmes[105] = -6579763151282152531L;
        ie.fmes[106] = -1046327071556323068L;
        ie.fmes[107] = 7750251941989336634L;
        ie.fmes[108] = -3001877365349179283L;
        ie.fmes[109] = -5167976946047503456L;
        ie.fmes[110] = 574886406509054843L;
        ie.fmes[111] = 3414272812280057440L;
        ie.fmes[112] = 7244092630110587507L;
        ie.fmes[113] = -8412557314314458727L;
        ie.fmes[114] = -8437749656430258629L;
        ie.fmes[115] = -7127609505971339284L;
        ie.fmes[116] = 7947299903259322197L;
        ie.fmes[117] = 6718551842729514616L;
        ie.fmes[118] = -5546235859113788459L;
        ie.fmes[119] = -3769486670149052164L;
        ie.fmes[120] = 5268623129408908978L;
        ie.fmes[121] = 8533761341375213973L;
        ie.fmes[122] = 1010886647883071550L;
        ie.fmes[123] = 7158372255274117887L;
        ie.fmes[124] = -9131332347572572058L;
        ie.fmes[125] = 3088383802926017713L;
        ie.fmes[126] = 731580700781749302L;
        ie.fmes[127] = -5784346987970541087L;
        ie.fmes[128] = -4132690807490550764L;
        ie.fmes[129] = -8403093072795348831L;
        ie.fmes[130] = 8658196720336238622L;
        ie.fmes[131] = 1651346344198361045L;
        ie.fmes[132] = -11006531362063340L;
        ie.fmes[133] = -8539482010840551947L;
        ie.fmes[134] = -5948089393865874741L;
        ie.fmes[135] = 5124921900363369502L;
        ie.fmes[136] = -2506813741062458061L;
        ie.fmes[137] = -5635649725856846435L;
        ie.fmes[138] = -4605850800706179258L;
        ie.fmes[139] = -3268566184504614473L;
        ie.fmes[140] = 562754299677035481L;
        ie.fmes[141] = 5769670735119236850L;
        ie.fmes[142] = 8358293340003294304L;
        ie.fmes[143] = 2030633845333390207L;
        ie.fmes[144] = 6043205872613367135L;
        ie.fmes[145] = -5259411032594052325L;
        ie.fmes[146] = -8034144666689543439L;
        ie.fmes[147] = -7048161571738432960L;
        ie.fmes[148] = -5307913284773898778L;
        ie.fmes[149] = 385978316706142838L;
        ie.fmes[150] = -7430029495263379060L;
        ie.fmes[151] = 5519661626751032130L;
        ie.fmes[152] = -7370700274784366561L;
        ie.fmes[153] = -7745576820937690033L;
        ie.fmes[154] = -7923080706193722155L;
        ie.fmes[155] = -1282040300124106460L;
        ie.fmes[156] = -4277291601832802867L;
        ie.fmes[157] = -8250701474498991876L;
        ie.fmes[158] = -3065219062458027764L;
        ie.fmes[159] = 3968981672087294804L;
        ie.fmes[160] = -6551126914110534006L;
        ie.fmes[161] = -6410990472027559288L;
        ie.fmes[162] = 5619930921673751531L;
        ie.fmes[163] = 7519708144711223664L;
        ie.fmes[164] = 6980988093501571143L;
        ie.fmes[165] = -5809272383188867723L;
        ie.fmes[166] = -4472568578049153354L;
        ie.fmes[167] = -9147734861960138638L;
        ie.fmes[168] = 3113975758568330599L;
        ie.fmes[169] = 5267481165346426600L;
        ie.fmes[170] = -8222079039876591187L;
        ie.fmes[171] = 8866783775852913565L;
        ie.fmes[172] = -6724488418291397713L;
        ie.fmes[173] = -9040633177457133544L;
        ie.fmes[174] = -4410919640868393115L;
        ie.fmes[175] = -6621792033922224423L;
        ie.fmes[176] = -8025997684172218046L;
        ie.fmes[177] = -6889998069622966424L;
        ie.fmes[178] = 1882032319910269220L;
        ie.fmes[179] = 4643331714063129831L;
        ie.fmes[180] = 3694029944633348339L;
        ie.fmes[181] = -1973992128648046852L;
        ie.fmes[182] = -1904045967549478345L;
        ie.fmes[183] = 3861512515538687665L;
        ie.fmes[184] = -4597610671753080830L;
        ie.fmes[185] = -687881303525242012L;
        ie.fmes[186] = -650939569564871231L;
        ie.fmes[187] = 6221556631945931699L;
        ie.fmes[188] = 1490367946084492290L;
        ie.fmes[189] = 2849786097248373905L;
        ie.fmes[190] = -4902515294433091072L;
        ie.fmes[191] = -4879369361099244637L;
        ie.fmes[192] = -8637604959441529173L;
        ie.fmes[193] = 8074415310808983989L;
        ie.fmes[194] = -3766405758125662508L;
        ie.fmes[195] = 4827546613470612199L;
        ie.fmes[196] = 2328187531460440084L;
        ie.fmes[197] = 2045471493880247219L;
        ie.fmes[198] = 3060883596218193640L;
        ie.fmes[199] = -8914196668312101622L;
    }

    private static /* synthetic */ void fryf() {
        ie.fmfe[0] = 1120092711;
        ie.fmfe[1] = 1015923784;
        ie.fmfe[2] = 962792863;
        ie.fmfe[3] = 1973365126;
        ie.fmfe[4] = 1138063575;
        ie.fmfe[5] = -1199402903;
        ie.fmfe[6] = -1973027280;
        ie.fmfe[7] = 241963690;
        ie.fmfe[8] = -601146043;
        ie.fmfe[9] = 1913348541;
        ie.fmfe[10] = -1907233715;
        ie.fmfe[11] = 1971861078;
        ie.fmfe[12] = 602020265;
        ie.fmfe[13] = -1622863105;
        ie.fmfe[14] = -949826110;
        ie.fmfe[15] = 1199748157;
        ie.fmfe[16] = 1189280866;
        ie.fmfe[17] = -216914905;
        ie.fmfe[18] = -1141031547;
        ie.fmfe[19] = -1455083735;
        ie.fmfe[20] = 828211918;
        ie.fmfe[21] = 2023184135;
        ie.fmfe[22] = 786135568;
        ie.fmfe[23] = 1867799658;
        ie.fmfe[24] = -942597387;
        ie.fmfe[25] = -59404098;
        ie.fmfe[26] = 1083944132;
        ie.fmfe[27] = 508486282;
        ie.fmfe[28] = 310638826;
        ie.fmfe[29] = 2124892476;
        ie.fmfe[30] = -973350468;
        ie.fmfe[31] = -271445916;
        ie.fmfe[32] = 523979007;
        ie.fmfe[33] = -43939695;
        ie.fmfe[34] = 1377805885;
        ie.fmfe[35] = -1847541575;
        ie.fmfe[36] = 146416557;
        ie.fmfe[37] = 1672376819;
        ie.fmfe[38] = -1185688937;
        ie.fmfe[39] = 1401123794;
        ie.fmfe[40] = 748822293;
        ie.fmfe[41] = 608533620;
        ie.fmfe[42] = 1494705556;
        ie.fmfe[43] = -1086940782;
        ie.fmfe[44] = -1671388025;
        ie.fmfe[45] = -1735346673;
        ie.fmfe[46] = 415531027;
        ie.fmfe[47] = 170776602;
        ie.fmfe[48] = -1022597609;
        ie.fmfe[49] = 126964975;
        ie.fmfe[50] = 1746885472;
        ie.fmfe[51] = 424143636;
        ie.fmfe[52] = -837810780;
        ie.fmfe[53] = 1676996065;
        ie.fmfe[54] = -2001819756;
        ie.fmfe[55] = 191390197;
        ie.fmfe[56] = 579746189;
        ie.fmfe[57] = -1720865346;
        ie.fmfe[58] = -1497067709;
        ie.fmfe[59] = -1314228642;
        ie.fmfe[60] = 947610922;
        ie.fmfe[61] = 1942356897;
        ie.fmfe[62] = -2059451623;
        ie.fmfe[63] = 1869456376;
        ie.fmfe[64] = 1327842346;
        ie.fmfe[65] = -375568918;
        ie.fmfe[66] = 80888158;
        ie.fmfe[67] = 911151757;
        ie.fmfe[68] = 582645366;
        ie.fmfe[69] = 260445981;
        ie.fmfe[70] = -1023892307;
        ie.fmfe[71] = -1951788104;
        ie.fmfe[72] = -887982323;
        ie.fmfe[73] = 352222042;
        ie.fmfe[74] = -964868734;
        ie.fmfe[75] = 294465916;
        ie.fmfe[76] = 1151102672;
        ie.fmfe[77] = 1666362377;
        ie.fmfe[78] = -1016844528;
        ie.fmfe[79] = -1148754807;
        ie.fmfe[80] = 1227908981;
        ie.fmfe[81] = 1936130482;
        ie.fmfe[82] = -533328558;
        ie.fmfe[83] = 1729882813;
        ie.fmfe[84] = -2050213439;
        ie.fmfe[85] = 488380460;
        ie.fmfe[86] = 88860768;
        ie.fmfe[87] = 851345901;
        ie.fmfe[88] = 1702144758;
        ie.fmfe[89] = -124874503;
        ie.fmfe[90] = 2043330819;
        ie.fmfe[91] = 336726756;
        ie.fmfe[92] = 268856713;
        ie.fmfe[93] = 1638275056;
        ie.fmfe[94] = -1337329385;
        ie.fmfe[95] = -813855204;
        ie.fmfe[96] = 1905194455;
        ie.fmfe[97] = -117947541;
        ie.fmfe[98] = -867261708;
        ie.fmfe[99] = 1901031133;
    }

    /*
     * Enabled aggressive block sorting
     */
    private ov outputStep(ov ov2, float f2, float f3, float f4, float[] fArray, boolean bl2, float f5, float f6, float f7) {
        float f8;
        float f9;
        block14: {
            block11: {
                float f10;
                float f11;
                boolean bl3;
                block13: {
                    block12: {
                        float f12;
                        float f13;
                        boolean bl4 = c;
                        int n2 = b;
                        bl3 = a;
                        if (bl4) {
                            throw null;
                        }
                        if (bl3 || bl3) break block11;
                        if (bl2) {
                            f13 = this.lerp((float)ie.fmex("fqit", fmfb(int ), (int)678), (float)ie.fmex("fqiu", fmfb(int ), (int)679));
                            if (bl4) {
                                throw null;
                            }
                        } else {
                            f13 = this.lerp((float)ie.fmex("fqix", fmfb(int ), (int)680), (float)ie.fmex("fqiy", fmfb(int ), (int)681));
                        }
                        float f14 = this.noiseYaw * f13;
                        if (bl3 || bl3) break block11;
                        if (bl2) {
                            f12 = this.lerp((float)ie.fmex("fqjb", fmfb(int ), (int)682), (float)ie.fmex("fqjf", fmfb(int ), (int)683));
                            if (bl4) {
                                throw null;
                            }
                        } else {
                            f12 = this.lerp((float)ie.fmex("fqjh", fmfb(int ), (int)684), (float)ie.fmex("fqji", fmfb(int ), (int)685));
                        }
                        float f15 = this.noisePitch * f12;
                        if (bl3 || bl3) break block11;
                        float f16 = this.wanderYaw * this.lerp((float)ie.fmex("fqjj", fmfb(int ), (int)686), (float)ie.fmex("fqjk", fmfb(int ), (int)687));
                        if (bl3 || bl3) break block11;
                        float f17 = this.wanderPitch * this.lerp((float)ie.fmex("fqjl", fmfb(int ), (int)688), (float)ie.fmex("fqjm", fmfb(int ), (int)689));
                        if (bl3 || bl3) break block11;
                        float f18 = this.lerp((float)ie.fmex("fqjr", fmfb(int ), (int)690), (float)ie.fmex("fqjs", fmfb(int ), (int)691));
                        if (bl3 || bl3) break block11;
                        float f19 = this.lastStepYaw * f18 + fArray[0] * (1.0f - f18) - f6 * ie.fmex("fqjw", fmfb(int ), (int)692) + f14 + f16;
                        if (bl3 || bl3) break block11;
                        float f20 = this.lastStepPitch * f18 + fArray[1] * (1.0f - f18) - f7 * ie.fmex("fqka", fmfb(int ), (int)693) + f15 + f17;
                        if (bl3 || bl3) break block11;
                        f11 = this.quantizeDelta(f19);
                        if (bl3 || bl3) break block11;
                        f10 = this.quantizeDelta(f20);
                        if (bl3 || bl3) break block11;
                        if (!(Math.abs(f11) < ie.fmex("fqkd", fmfb(int ), (int)694))) break block12;
                        if (bl3) break block11;
                        if (!(Math.abs(f10) < ie.fmex("fqkg", fmfb(int ), (int)695))) break block12;
                        if (bl3) break block11;
                        if (!(f4 > ie.fmex("fqki", fmfb(int ), (int)696))) break block12;
                        if (bl3 || bl3) break block11;
                        f11 = this.quantizeDelta(Math.copySign((float)nm.computeGcd(), f2));
                        if (bl3) break block11;
                    }
                    if (bl3 || bl3) break block11;
                    this.lastStepYaw = f11;
                    if (bl3 || bl3) break block11;
                    this.lastStepPitch = f10;
                    if (bl3 || bl3) break block11;
                    if (!bl2) break block13;
                    if (bl3 || bl3) break block11;
                    this.pursueStreak += ie.fmex("fqks", fmfg(int ), (int)697);
                    if (bl3) break block11;
                }
                if (bl3 || bl3) break block11;
                f9 = ov2.getYaw() + ie.clampOvershoot(f11, f2, f5);
                if (bl3 || bl3) break block11;
                f8 = class_3532.method_15363((float)(ov2.getPitch() + ie.clampOvershoot(f10, f3, f5)), (float)ie.fmex("fqkw", fmfb(int ), (int)698), (float)ie.fmex("fqkx", fmfb(int ), (int)699));
                if (!bl3 && !bl3) break block14;
            }
            return null;
        }
        return new ov(f9, f8);
    }

    private static /* synthetic */ void frxw() {
        ie.fmfd[200] = 81761738;
        ie.fmfd[201] = 1946693481;
        ie.fmfd[202] = 1904788325;
        ie.fmfd[203] = -942553162;
        ie.fmfd[204] = -572264158;
        ie.fmfd[205] = 2052397018;
        ie.fmfd[206] = 631964948;
        ie.fmfd[207] = 2136719523;
        ie.fmfd[208] = 434804049;
        ie.fmfd[209] = -508970821;
        ie.fmfd[210] = 1124135576;
        ie.fmfd[211] = -264568970;
        ie.fmfd[212] = -2097158741;
        ie.fmfd[213] = -497222824;
        ie.fmfd[214] = -184640765;
        ie.fmfd[215] = 1422561855;
        ie.fmfd[216] = -905852874;
        ie.fmfd[217] = -273464104;
        ie.fmfd[218] = 508851618;
        ie.fmfd[219] = 1836471743;
        ie.fmfd[220] = -1500001015;
        ie.fmfd[221] = -1252216727;
        ie.fmfd[222] = -1295561672;
        ie.fmfd[223] = -850526907;
        ie.fmfd[224] = 1467048246;
        ie.fmfd[225] = -538864638;
        ie.fmfd[226] = -2110569412;
        ie.fmfd[227] = -1992614533;
        ie.fmfd[228] = 878150160;
        ie.fmfd[229] = 1332721053;
        ie.fmfd[230] = 1313248523;
        ie.fmfd[231] = -1481825110;
        ie.fmfd[232] = -1971150240;
        ie.fmfd[233] = -289616216;
        ie.fmfd[234] = 943049903;
        ie.fmfd[235] = -1975872640;
        ie.fmfd[236] = 1165800981;
        ie.fmfd[237] = 1004095708;
        ie.fmfd[238] = 1165271660;
        ie.fmfd[239] = 216463376;
        ie.fmfd[240] = -1360880112;
        ie.fmfd[241] = -652717117;
        ie.fmfd[242] = 932953624;
        ie.fmfd[243] = -1548655117;
        ie.fmfd[244] = 81222649;
        ie.fmfd[245] = -689915117;
        ie.fmfd[246] = 492110328;
        ie.fmfd[247] = -1090028075;
        ie.fmfd[248] = -1389441497;
        ie.fmfd[249] = 378281086;
        ie.fmfd[250] = -1918034407;
        ie.fmfd[251] = -554352379;
        ie.fmfd[252] = 964485732;
        ie.fmfd[253] = 1353736437;
        ie.fmfd[254] = 901947591;
        ie.fmfd[255] = 732573673;
        ie.fmfd[256] = 1368486202;
        ie.fmfd[257] = 948545895;
        ie.fmfd[258] = 1605872957;
        ie.fmfd[259] = 477134409;
        ie.fmfd[260] = 1840791285;
        ie.fmfd[261] = -1728511513;
        ie.fmfd[262] = 307042599;
        ie.fmfd[263] = -1531222331;
        ie.fmfd[264] = 1134019191;
        ie.fmfd[265] = 1877903080;
        ie.fmfd[266] = -538796046;
        ie.fmfd[267] = -977416127;
        ie.fmfd[268] = 251709065;
        ie.fmfd[269] = 828106640;
        ie.fmfd[270] = 184636294;
        ie.fmfd[271] = 38459959;
        ie.fmfd[272] = -827591016;
        ie.fmfd[273] = -717858483;
        ie.fmfd[274] = 995271269;
        ie.fmfd[275] = -1898575001;
        ie.fmfd[276] = -217981587;
        ie.fmfd[277] = -488803558;
        ie.fmfd[278] = 423063665;
        ie.fmfd[279] = -1199494946;
        ie.fmfd[280] = 1574768884;
        ie.fmfd[281] = -1313963631;
        ie.fmfd[282] = 492319284;
        ie.fmfd[283] = -1333659621;
        ie.fmfd[284] = 1694329060;
        ie.fmfd[285] = -656258966;
        ie.fmfd[286] = 499124505;
        ie.fmfd[287] = -49645972;
        ie.fmfd[288] = 2027849769;
        ie.fmfd[289] = -1303557380;
        ie.fmfd[290] = 1621246688;
        ie.fmfd[291] = 1518484197;
        ie.fmfd[292] = 1041441533;
        ie.fmfd[293] = -1300692479;
        ie.fmfd[294] = -1895120456;
        ie.fmfd[295] = -276292978;
        ie.fmfd[296] = 594130336;
        ie.fmfd[297] = -1626428573;
        ie.fmfd[298] = -324062193;
        ie.fmfd[299] = -1205910403;
    }

    private static /* synthetic */ void frye() {
        ie.fmfd[800] = 1887904246;
        ie.fmfd[801] = 1501782146;
        ie.fmfd[802] = 1637344266;
        ie.fmfd[803] = 412196316;
        ie.fmfd[804] = 86472809;
        ie.fmfd[805] = -2128133405;
        ie.fmfd[806] = 1554470734;
        ie.fmfd[807] = -1383466532;
        ie.fmfd[808] = -1913061885;
        ie.fmfd[809] = 1072639470;
        ie.fmfd[810] = 1125859542;
        ie.fmfd[811] = 37029536;
        ie.fmfd[812] = -544218835;
        ie.fmfd[813] = -1404704031;
        ie.fmfd[814] = 750293782;
        ie.fmfd[815] = -1360080930;
        ie.fmfd[816] = -518155214;
        ie.fmfd[817] = 1317351352;
        ie.fmfd[818] = -1079771211;
        ie.fmfd[819] = -154966253;
        ie.fmfd[820] = -1214099351;
        ie.fmfd[821] = 1761300648;
        ie.fmfd[822] = 1069334267;
        ie.fmfd[823] = -1381893370;
        ie.fmfd[824] = -1640250418;
        ie.fmfd[825] = -1531352895;
        ie.fmfd[826] = -1548244930;
        ie.fmfd[827] = -1993259473;
        ie.fmfd[828] = 148013337;
        ie.fmfd[829] = -478115788;
        ie.fmfd[830] = 416830331;
        ie.fmfd[831] = 503122531;
        ie.fmfd[832] = 109511800;
        ie.fmfd[833] = -930840077;
        ie.fmfd[834] = -1001320491;
        ie.fmfd[835] = -152086185;
        ie.fmfd[836] = 948720604;
        ie.fmfd[837] = -1707451346;
        ie.fmfd[838] = -1965089595;
        ie.fmfd[839] = 2112319931;
        ie.fmfd[840] = 499343319;
        ie.fmfd[841] = -1374540691;
        ie.fmfd[842] = -2076321329;
        ie.fmfd[843] = -233201167;
        ie.fmfd[844] = 1771827733;
        ie.fmfd[845] = 1491269474;
        ie.fmfd[846] = 883959309;
        ie.fmfd[847] = 696306166;
        ie.fmfd[848] = -70139569;
        ie.fmfd[849] = -852948447;
        ie.fmfd[850] = 443816480;
        ie.fmfd[851] = 610801071;
        ie.fmfd[852] = 995077134;
        ie.fmfd[853] = 722349720;
        ie.fmfd[854] = 1457669973;
        ie.fmfd[855] = -1301531494;
        ie.fmfd[856] = 1043853402;
        ie.fmfd[857] = -483320160;
        ie.fmfd[858] = 951889032;
        ie.fmfd[859] = -2034296805;
        ie.fmfd[860] = 794664380;
        ie.fmfd[861] = -1588559203;
        ie.fmfd[862] = -1827200821;
        ie.fmfd[863] = 1562320584;
        ie.fmfd[864] = 970353892;
        ie.fmfd[865] = -417682272;
        ie.fmfd[866] = -809586268;
        ie.fmfd[867] = -168548389;
        ie.fmfd[868] = -1841584724;
        ie.fmfd[869] = -1992610477;
        ie.fmfd[870] = -1046826116;
        ie.fmfd[871] = -1880711898;
        ie.fmfd[872] = 2094689826;
        ie.fmfd[873] = 1179136707;
        ie.fmfd[874] = 650362769;
        ie.fmfd[875] = 669703082;
        ie.fmfd[876] = -637495795;
        ie.fmfd[877] = -1280444664;
        ie.fmfd[878] = 1541923739;
        ie.fmfd[879] = 897384353;
        ie.fmfd[880] = -1767087969;
        ie.fmfd[881] = -1631923445;
        ie.fmfd[882] = -1435182696;
        ie.fmfd[883] = -380303960;
        ie.fmfd[884] = 1820341852;
        ie.fmfd[885] = 611083743;
        ie.fmfd[886] = 686985156;
        ie.fmfd[887] = 1376065355;
        ie.fmfd[888] = -2138424660;
        ie.fmfd[889] = 946462553;
        ie.fmfd[890] = -479856337;
        ie.fmfd[891] = 259200333;
        ie.fmfd[892] = -1763090862;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("frxb", fmeq(int ), (int)286));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1469341836: {
                    v1 = ie.fmex("frxc", fmeq(int ), (int)287);
                    continue block11;
                }
                case -421935005: {
                    break block11;
                }
                case 1517037431: {
                    v1 = ie.fmex("frxd", fmeq(int ), (int)288);
                    continue block11;
                }
            }
            break;
        }
        var3_1 = ie.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("frxe", fmeq(int ), (int)289)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ie.fmex("frxf", fmfg(int ), (int)883)) break;
            v2 /* !! */  = (long)ie.fmex("frxg", fmfg(int ), (int)884);
        }
        var2_2 /* !! */  = ie.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("frxh", fmeq(int ), (int)290)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ie.fmex("frxi", fmfg(int ), (int)885)) break;
                    v3 /* !! */  = (long)ie.fmex("frxj", fmfg(int ), (int)886);
                }
                var1_3 = ie.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("frxk", fmeq(int ), (int)291)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ie.fmex("frxl", fmfg(int ), (int)887)) break;
                    v4 /* !! */  = (long)ie.fmex("frxm", fmfg(int ), (int)888);
                }
                return class_243.field_1353;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ie.fmex("frxn", fmfg(int ), (int)889);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
lbl49:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("frxp", fmfg(int ), (int)890);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("frxq", fmfg(int ), (int)891);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ie.fmex("frxr", fmfg(int ), (int)892);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov driftHold(ov var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fpgx", fmeq(int ), (int)110)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ie.fmex("fpgy", fmfg(int ), (int)477)) break;
            v0 /* !! */  = (long)ie.fmex("fpgz", fmfg(int ), (int)478);
        }
        var6_2 = ie.c;
        v1 /* !! */  = ie.mp;
        if (true) ** GOTO lbl12
        block56: while (true) {
            v1 /* !! */  = (long)(ie.fmex("fphb", fmeq(int ), (int)112) - ie.fmex("fpha", fmeq(int ), (int)111));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -759428617: {
                    continue block56;
                }
                case -421935005: {
                    break block56;
                }
            }
            break;
        }
        var5_3 /* !! */  = ie.b;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl22
        block57: while (true) {
            v2 /* !! */  = (long)(ie.fmex("fphd", fmeq(int ), (int)114) - ie.fmex("fphc", fmeq(int ), (int)113));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -421935005: {
                    break block57;
                }
                case 1768454532: {
                    continue block57;
                }
            }
            break;
        }
        var4_4 = ie.a;
        if (var6_2) {
            throw null;
lbl30:
            // 3 sources

            return null;
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fphe", fmeq(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ie.fmex("fphf", fmfg(int ), (int)479)) break;
                    v3 /* !! */  = (long)ie.fmex("fphg", fmfg(int ), (int)480);
                }
                v4 = ie.fmex("fphh", fmfb(int ), (int)481);
                v5 = ie.fmex("fphi", fmfb(int ), (int)482);
                v6 /* !! */  = ie.mp;
                if (true) ** GOTO lbl48
                block60: while (true) {
                    v6 /* !! */  = (long)(v7 - ie.fmex("fphj", fmeq(int ), (int)116));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -421935005: {
                            break block60;
                        }
                        case -214071408: {
                            v7 = ie.fmex("fphk", fmeq(int ), (int)117);
                            continue block60;
                        }
                        case 303864623: {
                            v7 = ie.fmex("fphl", fmeq(int ), (int)118);
                            continue block60;
                        }
                        case 994546364: {
                            v7 = ie.fmex("fphm", fmeq(int ), (int)119);
                            continue block60;
                        }
                    }
                    break;
                }
                v8 = this.noiseYaw * this.lerp((float)v4, (float)v5);
                v9 /* !! */  = ie.mp;
                if (true) ** GOTO lbl65
                block61: while (true) {
                    v9 /* !! */  = (long)(v10 - ie.fmex("fphn", fmeq(int ), (int)120));
lbl65:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1080677127: {
                            v10 = ie.fmex("fpho", fmeq(int ), (int)121);
                            continue block61;
                        }
                        case -517193812: {
                            v10 = ie.fmex("fphp", fmeq(int ), (int)122);
                            continue block61;
                        }
                        case -421935005: {
                            break block61;
                        }
                        case 1970065777: {
                            v10 = ie.fmex("fphq", fmeq(int ), (int)123);
                            continue block61;
                        }
                    }
                    break;
                }
                var2_5 = this.quantizeDelta(v8);
                if (var4_4 || var4_4) ** GOTO lbl30
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fphr", fmeq(int ), (int)124)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ie.fmex("fphs", fmfg(int ), (int)483)) break;
                    v11 /* !! */  = (long)ie.fmex("fpht", fmfg(int ), (int)484);
                }
                v12 = ie.fmex("fphu", fmfb(int ), (int)485);
                v13 = ie.fmex("fphv", fmfb(int ), (int)486);
                v14 /* !! */  = ie.mp;
                if (true) ** GOTO lbl91
                block63: while (true) {
                    v14 /* !! */  = (long)(v15 - ie.fmex("fphw", fmeq(int ), (int)125));
lbl91:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2030665176: {
                            v15 = ie.fmex("fphx", fmeq(int ), (int)126);
                            continue block63;
                        }
                        case -421935005: {
                            break block63;
                        }
                        case -9829363: {
                            v15 = ie.fmex("fphy", fmeq(int ), (int)127);
                            continue block63;
                        }
                        case 125074955: {
                            v15 = ie.fmex("fphz", fmeq(int ), (int)128);
                            continue block63;
                        }
                    }
                    break;
                }
                v16 = this.noisePitch * this.lerp((float)v12, (float)v13);
                v17 /* !! */  = ie.mp;
                if (true) ** GOTO lbl108
                block64: while (true) {
                    v17 /* !! */  = (long)(v18 - ie.fmex("fpia", fmeq(int ), (int)129));
lbl108:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -421935005: {
                            break block64;
                        }
                        case 1019161511: {
                            v18 = ie.fmex("fpib", fmeq(int ), (int)130);
                            continue block64;
                        }
                        case 2136621301: {
                            v18 = ie.fmex("fpic", fmeq(int ), (int)131);
                            continue block64;
                        }
                    }
                    break;
                }
                var3_6 = this.quantizeDelta(v16);
                if (var4_4 || var4_4) ** continue;
                v19 /* !! */  = ie.mp;
                if (true) ** GOTO lbl123
                block65: while (true) {
                    v19 /* !! */  = (long)(ie.fmex("fpie", fmeq(int ), (int)133) - ie.fmex("fpid", fmeq(int ), (int)132));
lbl123:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1920182875: {
                            continue block65;
                        }
                        case -421935005: {
                            break block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fpif", fmeq(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == ie.fmex("fpig", fmfg(int ), (int)487)) break;
                    v20 /* !! */  = (long)ie.fmex("fpih", fmfg(int ), (int)488);
                }
                v21 = var1_1.getYaw() + var2_5;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = ie.mp - ie.fmex("fpii", fmeq(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v22 /* !! */  == ie.fmex("fpij", fmfg(int ), (int)489)) break;
                    v22 /* !! */  = (long)ie.fmex("fpik", fmfg(int ), (int)490);
                }
                v23 = var1_1.getPitch() + var3_6;
                v24 = ie.fmex("fpil", fmfb(int ), (int)491);
                v25 = ie.fmex("fpim", fmfb(int ), (int)492);
                v26 /* !! */  = ie.mp;
                if (true) ** GOTO lbl148
                block68: while (true) {
                    v26 /* !! */  = (long)(v27 - ie.fmex("fpin", fmeq(int ), (int)136));
lbl148:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -979697483: {
                            v27 = ie.fmex("fpio", fmeq(int ), (int)137);
                            continue block68;
                        }
                        case -421935005: {
                            break block68;
                        }
                        case 255419467: {
                            v27 = ie.fmex("fpip", fmeq(int ), (int)138);
                            continue block68;
                        }
                    }
                    break;
                }
                v28 = class_3532.method_15363((float)v23, (float)v24, (float)v25);
                v29 /* !! */  = ie.mp;
                if (true) ** GOTO lbl162
                block69: while (true) {
                    v29 /* !! */  = (long)(v30 - ie.fmex("fpiq", fmeq(int ), (int)139));
lbl162:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -2116815001: {
                            v30 = ie.fmex("fpir", fmeq(int ), (int)140);
                            continue block69;
                        }
                        case -421935005: {
                            break block69;
                        }
                        case 887384405: {
                            v30 = ie.fmex("fpis", fmeq(int ), (int)141);
                            continue block69;
                        }
                    }
                    break;
                }
                return new ov(v21, v28);
            }
            case 0: {
                var5_3 /* !! */  = (int)ie.fmex("fpiu", fmfg(int ), (int)493);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl177:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)ie.fmex("fpiv", fmfg(int ), (int)494);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl182:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)ie.fmex("fpjd", fmfg(int ), (int)495);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
lbl186:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ie.fmex("fpje", fmfg(int ), (int)496);
                if (var6_2) {
                    throw null;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)ie.fmex("fpjf", fmfg(int ), (int)497);
                if (!var6_2) ** GOTO lbl177
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)ie.fmex("fpjh", fmfg(int ), (int)498);
                if (!var6_2) ** GOTO lbl186
                throw null;
            }
lbl198:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ie.fmex("fpji", fmfg(int ), (int)499);
                    if (!var6_2) ** GOTO lbl182
                    throw null;
                }
            }
            case 7: 
        }
        var5_3 /* !! */  = (int)ie.fmex("fpjk", fmfg(int ), (int)500);
        ** while (!var6_2)
lbl206:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frya() {
        ie.fmfd[400] = 2020485503;
        ie.fmfd[401] = 1632875907;
        ie.fmfd[402] = -2037136142;
        ie.fmfd[403] = -1295139215;
        ie.fmfd[404] = -1111301676;
        ie.fmfd[405] = -1818065501;
        ie.fmfd[406] = -860338846;
        ie.fmfd[407] = 943875786;
        ie.fmfd[408] = -1688272608;
        ie.fmfd[409] = -274057069;
        ie.fmfd[410] = 548255826;
        ie.fmfd[411] = -1624508093;
        ie.fmfd[412] = 381651895;
        ie.fmfd[413] = 985354009;
        ie.fmfd[414] = 2144332800;
        ie.fmfd[415] = -975484534;
        ie.fmfd[416] = -1372394908;
        ie.fmfd[417] = -490483243;
        ie.fmfd[418] = -1232586825;
        ie.fmfd[419] = 1499923597;
        ie.fmfd[420] = 1709398666;
        ie.fmfd[421] = 1441567134;
        ie.fmfd[422] = 493178924;
        ie.fmfd[423] = -14378799;
        ie.fmfd[424] = 1819626957;
        ie.fmfd[425] = -1883211959;
        ie.fmfd[426] = -2124258256;
        ie.fmfd[427] = -1334240772;
        ie.fmfd[428] = 1186837722;
        ie.fmfd[429] = 1413795143;
        ie.fmfd[430] = 470060707;
        ie.fmfd[431] = 807249363;
        ie.fmfd[432] = 1373594159;
        ie.fmfd[433] = 1987289473;
        ie.fmfd[434] = 1268908493;
        ie.fmfd[435] = 1297935900;
        ie.fmfd[436] = -749223538;
        ie.fmfd[437] = 447799327;
        ie.fmfd[438] = 1963605876;
        ie.fmfd[439] = 1385014467;
        ie.fmfd[440] = 688376049;
        ie.fmfd[441] = 223071197;
        ie.fmfd[442] = -369946676;
        ie.fmfd[443] = 1123311534;
        ie.fmfd[444] = -92080508;
        ie.fmfd[445] = -901861289;
        ie.fmfd[446] = 1366839288;
        ie.fmfd[447] = 1896867678;
        ie.fmfd[448] = 1143794035;
        ie.fmfd[449] = 1140066683;
        ie.fmfd[450] = -415128044;
        ie.fmfd[451] = 102495707;
        ie.fmfd[452] = -1368711948;
        ie.fmfd[453] = 1334766723;
        ie.fmfd[454] = 1138827525;
        ie.fmfd[455] = 534588781;
        ie.fmfd[456] = 2030380191;
        ie.fmfd[457] = -1544452201;
        ie.fmfd[458] = 1792672390;
        ie.fmfd[459] = -1225157596;
        ie.fmfd[460] = 1397276920;
        ie.fmfd[461] = 1148226724;
        ie.fmfd[462] = 2096250249;
        ie.fmfd[463] = -225989872;
        ie.fmfd[464] = -631352633;
        ie.fmfd[465] = 1370692441;
        ie.fmfd[466] = -1324899144;
        ie.fmfd[467] = 1145713702;
        ie.fmfd[468] = 124330641;
        ie.fmfd[469] = -332804489;
        ie.fmfd[470] = 1772097167;
        ie.fmfd[471] = 1490405312;
        ie.fmfd[472] = 186214926;
        ie.fmfd[473] = -590674996;
        ie.fmfd[474] = -1950694888;
        ie.fmfd[475] = 1963734402;
        ie.fmfd[476] = -1756899562;
        ie.fmfd[477] = 938068523;
        ie.fmfd[478] = 353982;
        ie.fmfd[479] = 275863779;
        ie.fmfd[480] = -1797495019;
        ie.fmfd[481] = -1074332181;
        ie.fmfd[482] = 712584493;
        ie.fmfd[483] = 874111263;
        ie.fmfd[484] = -1328475427;
        ie.fmfd[485] = -786217506;
        ie.fmfd[486] = -1818261238;
        ie.fmfd[487] = -1321678348;
        ie.fmfd[488] = 2041698228;
        ie.fmfd[489] = -2061425988;
        ie.fmfd[490] = 831481953;
        ie.fmfd[491] = -1767993970;
        ie.fmfd[492] = -1178696158;
        ie.fmfd[493] = -1704639805;
        ie.fmfd[494] = 1209563892;
        ie.fmfd[495] = -1500112517;
        ie.fmfd[496] = 1722258775;
        ie.fmfd[497] = 1474637480;
        ie.fmfd[498] = 1889534249;
        ie.fmfd[499] = -633355864;
    }

    private static /* synthetic */ void fryh() {
        ie.fmfe[200] = 81761737;
        ie.fmfe[201] = 1946693465;
        ie.fmfe[202] = 1904788338;
        ie.fmfe[203] = -942553205;
        ie.fmfe[204] = -572264186;
        ie.fmfe[205] = 2052396989;
        ie.fmfe[206] = 631965004;
        ie.fmfe[207] = 2136719536;
        ie.fmfe[208] = 434803999;
        ie.fmfe[209] = -508970878;
        ie.fmfe[210] = 1124135600;
        ie.fmfe[211] = -264569015;
        ie.fmfe[212] = -2097158746;
        ie.fmfe[213] = -497222853;
        ie.fmfe[214] = -184640714;
        ie.fmfe[215] = 1422561971;
        ie.fmfe[216] = -905852831;
        ie.fmfe[217] = -273464113;
        ie.fmfe[218] = 508851709;
        ie.fmfe[219] = 1836471686;
        ie.fmfe[220] = -1500000964;
        ie.fmfe[221] = -1252216743;
        ie.fmfe[222] = -1295561538;
        ie.fmfe[223] = -850526951;
        ie.fmfe[224] = 1467048319;
        ie.fmfe[225] = -538864560;
        ie.fmfe[226] = -2110569442;
        ie.fmfe[227] = -1992614581;
        ie.fmfe[228] = 878150211;
        ie.fmfe[229] = 1332721128;
        ie.fmfe[230] = 1313248578;
        ie.fmfe[231] = -1481825151;
        ie.fmfe[232] = -1971150302;
        ie.fmfe[233] = -289616202;
        ie.fmfe[234] = 943049896;
        ie.fmfe[235] = -1975872534;
        ie.fmfe[236] = 1165801005;
        ie.fmfe[237] = 1004095642;
        ie.fmfe[238] = 1165271605;
        ie.fmfe[239] = 216463369;
        ie.fmfe[240] = -1360880094;
        ie.fmfe[241] = -652717096;
        ie.fmfe[242] = 932953737;
        ie.fmfe[243] = -1548655244;
        ie.fmfe[244] = 81222622;
        ie.fmfe[245] = -689915000;
        ie.fmfe[246] = 492110234;
        ie.fmfe[247] = -1090028071;
        ie.fmfe[248] = -1389441520;
        ie.fmfe[249] = 378281008;
        ie.fmfe[250] = -1918034304;
        ie.fmfe[251] = -554352319;
        ie.fmfe[252] = 964485679;
        ie.fmfe[253] = 1353736367;
        ie.fmfe[254] = 901947533;
        ie.fmfe[255] = 732573592;
        ie.fmfe[256] = 1368486317;
        ie.fmfe[257] = 948545884;
        ie.fmfe[258] = 1605873056;
        ie.fmfe[259] = 477134444;
        ie.fmfe[260] = 1840791148;
        ie.fmfe[261] = -1728511634;
        ie.fmfe[262] = 307042746;
        ie.fmfe[263] = -1531222283;
        ie.fmfe[264] = 1134019185;
        ie.fmfe[265] = 1877903005;
        ie.fmfe[266] = -538796079;
        ie.fmfe[267] = -977416107;
        ie.fmfe[268] = 251709143;
        ie.fmfe[269] = 828106505;
        ie.fmfe[270] = 184636388;
        ie.fmfe[271] = 38459935;
        ie.fmfe[272] = -827591163;
        ie.fmfe[273] = -717858469;
        ie.fmfe[274] = 995271247;
        ie.fmfe[275] = -1898575075;
        ie.fmfe[276] = -217981661;
        ie.fmfe[277] = -488803543;
        ie.fmfe[278] = 423063648;
        ie.fmfe[279] = -1199495091;
        ie.fmfe[280] = 1574768841;
        ie.fmfe[281] = -1313963617;
        ie.fmfe[282] = 492319273;
        ie.fmfe[283] = -1333659603;
        ie.fmfe[284] = 1694329081;
        ie.fmfe[285] = -656258982;
        ie.fmfe[286] = 499124631;
        ie.fmfe[287] = -49646024;
        ie.fmfe[288] = 2027849807;
        ie.fmfe[289] = -1303557481;
        ie.fmfe[290] = 1621246659;
        ie.fmfe[291] = 1518484143;
        ie.fmfe[292] = 1041441398;
        ie.fmfe[293] = -1300692340;
        ie.fmfe[294] = -1895120504;
        ie.fmfe[295] = -276292964;
        ie.fmfe[296] = 594130398;
        ie.fmfe[297] = -1626428651;
        ie.fmfe[298] = -324062124;
        ie.fmfe[299] = -1205910509;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block305: {
            block304: {
                block303: {
                    block302: {
                        block301: {
                            var23_5 = ie.c;
                            var22_6 /* !! */  = ie.b;
                            var21_7 = ie.a;
                            if (var23_5) {
                                throw null;
lbl6:
                                // 82 sources

                                return null;
                            }
                            if (var21_7 || var21_7) ** GOTO lbl6
                            var5_8 = hn.getInstance();
                            if (var21_7 || var21_7) ** GOTO lbl6
                            if (ie.mc.field_1724 != null) break block301;
                            if (var21_7 || var21_7) ** GOTO lbl6
                            return var1_1;
                        }
                        if (var21_7 || var21_7) ** GOTO lbl6
                        this.advanceNoise();
                        if (var21_7 || var21_7) ** GOTO lbl6
                        if (var4_4 != null) break block302;
                        if (var21_7 || var21_7) ** GOTO lbl6
                        return this.smoothReset(var1_1, var2_2);
                    }
                    if (var21_7 || var21_7) ** GOTO lbl6
                    if (var5_8 == null) break block303;
                    if (var21_7) ** GOTO lbl6
                    if (var5_8.getTarget() != null) break block304;
                    if (var21_7) ** GOTO lbl6
                }
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.smoothReset(var1_1, var2_2);
            }
            if (var21_7 || var21_7) ** GOTO lbl6
            var6_9 = var4_4.method_5628();
            if (var21_7 || var21_7) ** GOTO lbl6
            if (var6_9 == this.lastEntityId) break block305;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.resetState();
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lastEntityId = var6_9;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.speedDrift = this.randGauss() * ie.fmex("fmpk", fmfb(int ), (int)160);
            if (var21_7) ** GOTO lbl6
        }
        if (var21_7 || var21_7) ** GOTO lbl6
        var7_10 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
        if (var21_7) ** GOTO lbl6
        if (var22_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_7) ** GOTO lbl6
                var8_11 = var7_10.getCount();
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var8_11 == this.lastAttackCount) ** GOTO lbl69
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastAttackCount = var8_11;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.postHitTicks = (int)ie.fmex("fmpl", fmfg(int ), (int)161);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.pursueStreak = (int)ie.fmex("fmpm", fmfg(int ), (int)162);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.combatTicks = (int)ie.fmex("fmpn", fmfg(int ), (int)163);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastStepPitch = 0.0f;
                this.lastStepYaw = 0.0f;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.speedDrift += this.randGauss() * ie.fmex("fmpo", fmfb(int ), (int)164);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.speedDrift = class_3532.method_15363((float)this.speedDrift, (float)ie.fmex("fmpp", fmfb(int ), (int)165), (float)ie.fmex("fmpq", fmfb(int ), (int)166));
                if (var21_7) ** GOTO lbl6
lbl69:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                var9_12 = System.currentTimeMillis();
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var9_12 < this.nextResetAt) ** GOTO lbl78
                if (var21_7 || var21_7) ** GOTO lbl6
                this.model.resetPlayback();
                if (var21_7 || var21_7) ** GOTO lbl6
                this.nextResetAt = var9_12 + (ie.fmex("fmpr", fmeq(int ), (int)93) + (long)this.random.nextInt((int)ie.fmex("fmps", fmfg(int ), (int)167)));
                if (var21_7) ** GOTO lbl6
lbl78:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.combatTicks >= ie.fmex("fmpt", fmfg(int ), (int)168)) ** GOTO lbl83
                if (var21_7 || var21_7) ** GOTO lbl6
                this.combatTicks += ie.fmex("fmpu", fmfg(int ), (int)169);
                if (var21_7) ** GOTO lbl6
lbl83:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                this.rotationTicks += ie.fmex("fmpv", fmfg(int ), (int)170);
                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.postHitTicks <= 0) ** GOTO lbl90
                if (var21_7 || var21_7) ** GOTO lbl6
                this.postHitTicks -= ie.fmex("fmpw", fmfg(int ), (int)171);
                if (var21_7) ** GOTO lbl6
lbl90:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.pauseTicks <= 0) ** GOTO lbl96
                if (var21_7 || var21_7) ** GOTO lbl6
                this.pauseTicks -= ie.fmex("fmpx", fmfg(int ), (int)172);
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.driftHold(var1_1);
lbl96:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                var11_13 = ow.calculateDelta(var1_1, var2_2);
                if (var21_7 || var21_7) ** GOTO lbl6
                var12_14 = var11_13.getYaw();
                if (var21_7 || var21_7) ** GOTO lbl6
                var13_15 = var11_13.getPitch();
                if (var21_7 || var21_7) ** GOTO lbl6
                var14_16 = (float)Math.hypot(var12_14, var13_15);
                if (var21_7 || var21_7) ** GOTO lbl6
                if (!(var14_16 < ie.fmex("fmpy", fmfb(int ), (int)173))) ** GOTO lbl108
                if (var21_7 || var21_7) ** GOTO lbl6
                return var1_1;
lbl108:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                var15_17 = 0.0f;
                if (var21_7 || var21_7) ** GOTO lbl6
                var16_18 = 0.0f;
                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.lastRemYaw == ie.fmex("fmpz", fmfb(int ), (int)174)) ** GOTO lbl119
                if (var21_7 || var21_7) ** GOTO lbl6
                var15_17 = var12_14 - this.lastRemYaw;
                if (var21_7 || var21_7) ** GOTO lbl6
                var16_18 = var13_15 - this.lastRemPitch;
                if (var21_7) ** GOTO lbl6
lbl119:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastRemYaw = var12_14;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastRemPitch = var13_15;
                if (var21_7 || var21_7) ** GOTO lbl6
                var17_19 = this.hitRadius(var4_4, this.blocksTo(var4_4));
                if (var21_7 || var21_7) ** GOTO lbl6
                var18_20 = oy.rayTrace(var5_8.attackDistance(), var4_4.method_5829());
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var18_20) ** GOTO lbl132
                if (var21_7) ** GOTO lbl6
                if (!(var14_16 < ie.fmex("fmqa", fmfb(int ), (int)175))) ** GOTO lbl137
                if (var21_7) ** GOTO lbl6
lbl132:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                v0 = ie.fmex("fmqb", fmfg(int ), (int)176);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl139
lbl137:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                v0 = var19_21 = ie.fmex("fmqc", fmfg(int ), (int)177);
lbl139:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.recoverTicks <= 0) ** GOTO lbl145
                if (var21_7 || var21_7) ** GOTO lbl6
                this.recoverTicks -= ie.fmex("fmqd", fmfg(int ), (int)178);
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.outputStep(var1_1, var12_14, var13_15, var14_16, this.modelStep(var12_14, var13_15, var17_19, (float)ie.fmex("fmqe", fmfb(int ), (int)179)), (boolean)var19_21, (float)ie.fmex("fmqf", fmfb(int ), (int)180), var15_17, var16_18);
lbl145:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (this.spikeGuardTicks <= 0) ** GOTO lbl151
                if (var21_7 || var21_7) ** GOTO lbl6
                this.spikeGuardTicks -= ie.fmex("fmqg", fmfg(int ), (int)181);
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.outputStep(var1_1, var12_14, var13_15, var14_16, this.modelStep(var12_14, var13_15, var17_19, (float)ie.fmex("fmqh", fmfb(int ), (int)182)), (boolean)var19_21, (float)ie.fmex("fmqi", fmfb(int ), (int)183), var15_17, var16_18);
lbl151:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (var19_21 == false) ** GOTO lbl163
                if (var21_7) ** GOTO lbl6
                if (this.pursueStreak < ie.fmex("fmqj", fmfg(int ), (int)184) + this.random.nextInt((int)ie.fmex("fmqk", fmfg(int ), (int)185))) ** GOTO lbl163
                if (var21_7 || var21_7) ** GOTO lbl6
                this.pursueStreak = (int)ie.fmex("fmql", fmfg(int ), (int)186);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.recoverTicks = (int)ie.fmex("fnfu", fmfg(int ), (int)187);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.pauseTicks = this.random.nextInt((int)ie.fmex("fnfw", fmfg(int ), (int)188));
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.outputStep(var1_1, var12_14, var13_15, var14_16, this.modelStep(var12_14, var13_15, var17_19, (float)ie.fmex("fngd", fmfb(int ), (int)189)), (boolean)ie.fmex("fngf", fmfg(int ), (int)190), (float)ie.fmex("fngm", fmfb(int ), (int)191), var15_17, var16_18);
lbl163:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (ms.isReady()) ** GOTO lbl167
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.outputStep(var1_1, var12_14, var13_15, var14_16, this.fallbackStep(var12_14, var13_15, var14_16, (boolean)var19_21), (boolean)var19_21, (float)ie.fmex("fngu", fmfb(int ), (int)192), var15_17, var16_18);
lbl167:
                // 1 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                var20_22 = this.model.next(var12_14, var13_15, var17_19);
                if (var21_7 || var21_7) ** GOTO lbl6
                if (var20_22 != null) ** GOTO lbl173
                if (var21_7 || var21_7) ** GOTO lbl6
                return this.outputStep(var1_1, var12_14, var13_15, var14_16, this.fallbackStep(var12_14, var13_15, var14_16, (boolean)var19_21), (boolean)var19_21, (float)ie.fmex("fnha", fmfb(int ), (int)193), var15_17, var16_18);
lbl173:
                // 1 sources

                if (!var21_7 && !var21_7) ** break;
                ** continue;
                return this.commitStep(var1_1, var12_14, var13_15, var14_16, var20_22[0], var20_22[1], (boolean)var19_21, var15_17, var16_18);
            }
lbl176:
            // 2 sources

            case 0: {
                var22_6 /* !! */  = (int)ie.fmex("fnhf", fmfg(int ), (int)194);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl489
            }
lbl181:
            // 2 sources

            case 1: {
                var22_6 /* !! */  = (int)ie.fmex("fnhl", fmfg(int ), (int)195);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 2: {
                var22_6 /* !! */  = (int)ie.fmex("fnho", fmfg(int ), (int)196);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl624
            }
lbl191:
            // 4 sources

            case 3: {
                var22_6 /* !! */  = (int)ie.fmex("fnhp", fmfg(int ), (int)197);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl196:
            // 3 sources

            case 4: {
                var22_6 /* !! */  = (int)ie.fmex("fnhq", fmfg(int ), (int)198);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl862
            }
lbl201:
            // 2 sources

            case 5: {
                var22_6 /* !! */  = (int)ie.fmex("fnhs", fmfg(int ), (int)199);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl833
            }
lbl206:
            // 4 sources

            case 6: {
                var22_6 /* !! */  = (int)ie.fmex("fnhv", fmfg(int ), (int)200);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl676
            }
            case 7: {
                var22_6 /* !! */  = (int)ie.fmex("fnhy", fmfg(int ), (int)201);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl632
            }
            case 8: {
                var22_6 /* !! */  = (int)ie.fmex("fnib", fmfg(int ), (int)202);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl668
            }
lbl221:
            // 2 sources

            case 9: {
                var22_6 /* !! */  = (int)ie.fmex("fnid", fmfg(int ), (int)203);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl226:
            // 3 sources

            case 10: {
                var22_6 /* !! */  = (int)ie.fmex("fnig", fmfg(int ), (int)204);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl862
            }
lbl231:
            // 2 sources

            case 11: {
                var22_6 /* !! */  = (int)ie.fmex("fnii", fmfg(int ), (int)205);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl549
            }
            case 12: {
                var22_6 /* !! */  = (int)ie.fmex("fnik", fmfg(int ), (int)206);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl484
            }
            case 13: {
                var22_6 /* !! */  = (int)ie.fmex("fnil", fmfg(int ), (int)207);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl246:
            // 2 sources

            case 14: {
                var22_6 /* !! */  = (int)ie.fmex("fnim", fmfg(int ), (int)208);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl251:
            // 3 sources

            case 15: {
                var22_6 /* !! */  = (int)ie.fmex("fniq", fmfg(int ), (int)209);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 16: {
                var22_6 /* !! */  = (int)ie.fmex("fnir", fmfg(int ), (int)210);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl770
            }
lbl261:
            // 2 sources

            case 17: {
                var22_6 /* !! */  = (int)ie.fmex("fnit", fmfg(int ), (int)211);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl497
            }
lbl266:
            // 2 sources

            case 18: {
                var22_6 /* !! */  = (int)ie.fmex("fniu", fmfg(int ), (int)212);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl816
            }
lbl271:
            // 2 sources

            case 19: {
                var22_6 /* !! */  = (int)ie.fmex("fniz", fmfg(int ), (int)213);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl610
            }
lbl276:
            // 4 sources

            case 20: {
                var22_6 /* !! */  = (int)ie.fmex("fnjc", fmfg(int ), (int)214);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl842
            }
lbl281:
            // 2 sources

            case 21: {
                var22_6 /* !! */  = (int)ie.fmex("fnjd", fmfg(int ), (int)215);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl596
            }
            case 22: {
                var22_6 /* !! */  = (int)ie.fmex("fnjl", fmfg(int ), (int)216);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl681
            }
lbl291:
            // 3 sources

            case 23: {
                var22_6 /* !! */  = (int)ie.fmex("fnjn", fmfg(int ), (int)217);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl296:
            // 2 sources

            case 24: {
                var22_6 /* !! */  = (int)ie.fmex("fnjt", fmfg(int ), (int)218);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl510
            }
            case 25: {
                var22_6 /* !! */  = (int)ie.fmex("fnjv", fmfg(int ), (int)219);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl306:
            // 3 sources

            case 26: {
                var22_6 /* !! */  = (int)ie.fmex("fnjx", fmfg(int ), (int)220);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl783
            }
lbl311:
            // 3 sources

            case 27: {
                var22_6 /* !! */  = (int)ie.fmex("fnkb", fmfg(int ), (int)221);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl316:
            // 3 sources

            case 28: {
                var22_6 /* !! */  = (int)ie.fmex("fnke", fmfg(int ), (int)222);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl676
            }
            case 29: {
                var22_6 /* !! */  = (int)ie.fmex("fnkl", fmfg(int ), (int)223);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl719
            }
lbl326:
            // 2 sources

            case 30: {
                var22_6 /* !! */  = (int)ie.fmex("fnkm", fmfg(int ), (int)224);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl331:
            // 2 sources

            case 31: {
                var22_6 /* !! */  = (int)ie.fmex("fnko", fmfg(int ), (int)225);
                if (!var23_5) ** GOTO lbl271
                throw null;
            }
            case 32: {
                var22_6 /* !! */  = (int)ie.fmex("fnkq", fmfg(int ), (int)226);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl532
            }
            case 33: {
                var22_6 /* !! */  = (int)ie.fmex("fnku", fmfg(int ), (int)227);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl799
            }
            case 34: {
                var22_6 /* !! */  = (int)ie.fmex("fnky", fmfg(int ), (int)228);
                if (!var23_5) ** GOTO lbl276
                throw null;
            }
lbl349:
            // 2 sources

            case 35: {
                var22_6 /* !! */  = (int)ie.fmex("fnkz", fmfg(int ), (int)229);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
            case 36: {
                var22_6 /* !! */  = (int)ie.fmex("fnlh", fmfg(int ), (int)230);
                if (!var23_5) ** GOTO lbl226
                throw null;
            }
lbl358:
            // 5 sources

            case 37: {
                var22_6 /* !! */  = (int)ie.fmex("fnli", fmfg(int ), (int)231);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl363:
            // 2 sources

            case 38: {
                var22_6 /* !! */  = (int)ie.fmex("fnll", fmfg(int ), (int)232);
                if (!var23_5) ** GOTO lbl251
                throw null;
            }
            case 39: {
                var22_6 /* !! */  = (int)ie.fmex("fnlp", fmfg(int ), (int)233);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl372:
            // 3 sources

            case 40: {
                var22_6 /* !! */  = (int)ie.fmex("fnlq", fmfg(int ), (int)234);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl811
            }
lbl377:
            // 2 sources

            case 41: {
                var22_6 /* !! */  = (int)ie.fmex("fnlr", fmfg(int ), (int)235);
                if (!var23_5) ** GOTO lbl331
                throw null;
            }
lbl381:
            // 3 sources

            case 42: {
                var22_6 /* !! */  = (int)ie.fmex("fnls", fmfg(int ), (int)236);
                if (!var23_5) ** GOTO lbl363
                throw null;
            }
lbl385:
            // 5 sources

            case 43: {
                var22_6 /* !! */  = (int)ie.fmex("fnlv", fmfg(int ), (int)237);
                if (!var23_5) ** GOTO lbl231
                throw null;
            }
lbl389:
            // 4 sources

            case 44: {
                var22_6 /* !! */  = (int)ie.fmex("fnlx", fmfg(int ), (int)238);
                if (!var23_5) ** GOTO lbl191
                throw null;
            }
lbl393:
            // 2 sources

            case 45: {
                var22_6 /* !! */  = (int)ie.fmex("fnmb", fmfg(int ), (int)239);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl727
            }
            case 46: {
                var22_6 /* !! */  = (int)ie.fmex("fnmc", fmfg(int ), (int)240);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl628
            }
lbl403:
            // 2 sources

            case 47: {
                var22_6 /* !! */  = (int)ie.fmex("fnmf", fmfg(int ), (int)241);
                if (!var23_5) ** GOTO lbl326
                throw null;
            }
lbl407:
            // 2 sources

            case 48: {
                var22_6 /* !! */  = (int)ie.fmex("fnmi", fmfg(int ), (int)242);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl591
            }
            case 49: {
                var22_6 /* !! */  = (int)ie.fmex("fnml", fmfg(int ), (int)243);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl573
            }
lbl417:
            // 2 sources

            case 50: {
                var22_6 /* !! */  = (int)ie.fmex("fnmn", fmfg(int ), (int)244);
                if (!var23_5) ** GOTO lbl221
                throw null;
            }
            case 51: {
                var22_6 /* !! */  = (int)ie.fmex("fnmq", fmfg(int ), (int)245);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl672
            }
            case 52: {
                var22_6 /* !! */  = (int)ie.fmex("fnmx", fmfg(int ), (int)246);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl559
            }
lbl431:
            // 3 sources

            case 53: {
                var22_6 /* !! */  = (int)ie.fmex("fnnb", fmfg(int ), (int)247);
                if (!var23_5) ** GOTO lbl389
                throw null;
            }
lbl435:
            // 2 sources

            case 54: {
                var22_6 /* !! */  = (int)ie.fmex("fnnd", fmfg(int ), (int)248);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl620
            }
            case 55: {
                var22_6 /* !! */  = (int)ie.fmex("fnnk", fmfg(int ), (int)249);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl497
            }
            case 56: {
                var22_6 /* !! */  = (int)ie.fmex("fnnl", fmfg(int ), (int)250);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl554
            }
lbl450:
            // 2 sources

            case 57: {
                var22_6 /* !! */  = (int)ie.fmex("fnnp", fmfg(int ), (int)251);
                if (!var23_5) ** GOTO lbl381
                throw null;
            }
            case 58: {
                var22_6 /* !! */  = (int)ie.fmex("fnnu", fmfg(int ), (int)252);
                if (!var23_5) ** GOTO lbl246
                throw null;
            }
            case 59: {
                var22_6 /* !! */  = (int)ie.fmex("fnob", fmfg(int ), (int)253);
                if (!var23_5) ** GOTO lbl276
                throw null;
            }
lbl462:
            // 2 sources

            case 60: {
                var22_6 /* !! */  = (int)ie.fmex("fnod", fmfg(int ), (int)254);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl489
            }
lbl467:
            // 2 sources

            case 61: {
                var22_6 /* !! */  = (int)ie.fmex("fnog", fmfg(int ), (int)255);
                if (!var23_5) ** GOTO lbl393
                throw null;
            }
lbl471:
            // 3 sources

            case 62: {
                var22_6 /* !! */  = (int)ie.fmex("fnol", fmfg(int ), (int)256);
                if (!var23_5) ** GOTO lbl191
                throw null;
            }
            case 63: {
                var22_6 /* !! */  = (int)ie.fmex("fnon", fmfg(int ), (int)257);
                if (!var23_5) ** GOTO lbl266
                throw null;
            }
            case 64: {
                var22_6 /* !! */  = (int)ie.fmex("fnop", fmfg(int ), (int)258);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl573
            }
lbl484:
            // 2 sources

            case 65: {
                var22_6 /* !! */  = (int)ie.fmex("fnos", fmfg(int ), (int)259);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl694
            }
lbl489:
            // 3 sources

            case 66: {
                var22_6 /* !! */  = (int)ie.fmex("fnow", fmfg(int ), (int)260);
                if (!var23_5) ** GOTO lbl471
                throw null;
            }
            case 67: {
                var22_6 /* !! */  = (int)ie.fmex("fnox", fmfg(int ), (int)261);
                if (!var23_5) ** GOTO lbl435
                throw null;
            }
lbl497:
            // 4 sources

            case 68: {
                var22_6 /* !! */  = (int)ie.fmex("fnoz", fmfg(int ), (int)262);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl719
            }
            case 69: {
                var22_6 /* !! */  = (int)ie.fmex("fnpe", fmfg(int ), (int)263);
                if (!var23_5) ** GOTO lbl389
                throw null;
            }
lbl506:
            // 2 sources

            case 70: {
                var22_6 /* !! */  = (int)ie.fmex("fnpf", fmfg(int ), (int)264);
                if (!var23_5) ** GOTO lbl206
                throw null;
            }
lbl510:
            // 3 sources

            case 71: {
                var22_6 /* !! */  = (int)ie.fmex("fnpl", fmfg(int ), (int)265);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl587
            }
            case 72: {
                var22_6 /* !! */  = (int)ie.fmex("fnpo", fmfg(int ), (int)266);
                if (!var23_5) ** GOTO lbl389
                throw null;
            }
lbl519:
            // 2 sources

            case 73: {
                var22_6 /* !! */  = (int)ie.fmex("fnpw", fmfg(int ), (int)267);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl646
            }
            case 74: {
                var22_6 /* !! */  = (int)ie.fmex("fnpx", fmfg(int ), (int)268);
                if (!var23_5) ** GOTO lbl510
                throw null;
            }
            case 75: {
                var22_6 /* !! */  = (int)ie.fmex("fnqa", fmfg(int ), (int)269);
                if (!var23_5) ** GOTO lbl385
                throw null;
            }
lbl532:
            // 2 sources

            case 76: {
                var22_6 /* !! */  = (int)ie.fmex("fnqe", fmfg(int ), (int)270);
                if (!var23_5) ** GOTO lbl450
                throw null;
            }
            case 77: {
                var22_6 /* !! */  = (int)ie.fmex("fnqf", fmfg(int ), (int)271);
                if (!var23_5) break;
                throw null;
            }
lbl540:
            // 2 sources

            case 78: {
                var22_6 /* !! */  = (int)ie.fmex("fnqh", fmfg(int ), (int)272);
                if (!var23_5) ** GOTO lbl385
                throw null;
            }
lbl544:
            // 4 sources

            case 79: {
                var22_6 /* !! */  = (int)ie.fmex("fnql", fmfg(int ), (int)273);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl659
            }
lbl549:
            // 2 sources

            case 80: {
                var22_6 /* !! */  = (int)ie.fmex("fnqr", fmfg(int ), (int)274);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl803
            }
lbl554:
            // 3 sources

            case 81: {
                var22_6 /* !! */  = (int)ie.fmex("fnqx", fmfg(int ), (int)275);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl655
            }
lbl559:
            // 2 sources

            case 82: {
                var22_6 /* !! */  = (int)ie.fmex("fnqy", fmfg(int ), (int)276);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl745
            }
lbl564:
            // 2 sources

            case 83: {
                var22_6 /* !! */  = (int)ie.fmex("fnrd", fmfg(int ), (int)277);
                if (!var23_5) ** GOTO lbl291
                throw null;
            }
            case 84: {
                var22_6 /* !! */  = (int)ie.fmex("fnrg", fmfg(int ), (int)278);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl787
            }
lbl573:
            // 4 sources

            case 85: {
                var22_6 /* !! */  = (int)ie.fmex("fnrh", fmfg(int ), (int)279);
                if (!var23_5) ** GOTO lbl564
                throw null;
            }
            case 86: {
                var22_6 /* !! */  = (int)ie.fmex("fnrm", fmfg(int ), (int)280);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl703
            }
            case 87: {
                var22_6 /* !! */  = (int)ie.fmex("fnrr", fmfg(int ), (int)281);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl641
            }
lbl587:
            // 3 sources

            case 88: {
                var22_6 /* !! */  = (int)ie.fmex("fnrv", fmfg(int ), (int)282);
                if (!var23_5) ** GOTO lbl462
                throw null;
            }
lbl591:
            // 2 sources

            case 89: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_6 /* !! */  = (int)ie.fmex("fnrw", fmfg(int ), (int)283);
                    if (!var23_5) ** GOTO lbl261
                    throw null;
                }
            }
lbl596:
            // 2 sources

            case 90: {
                var22_6 /* !! */  = (int)ie.fmex("fnrx", fmfg(int ), (int)284);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl833
            }
lbl601:
            // 3 sources

            case 91: {
                var22_6 /* !! */  = (int)ie.fmex("fnsd", fmfg(int ), (int)285);
                if (!var23_5) ** GOTO lbl181
                throw null;
            }
lbl605:
            // 2 sources

            case 92: {
                var22_6 /* !! */  = (int)ie.fmex("fnse", fmfg(int ), (int)286);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl816
            }
lbl610:
            // 2 sources

            case 93: {
                var22_6 /* !! */  = (int)ie.fmex("fnsf", fmfg(int ), (int)287);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl672
            }
lbl615:
            // 2 sources

            case 94: {
                var22_6 /* !! */  = (int)ie.fmex("fnsn", fmfg(int ), (int)288);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl870
            }
lbl620:
            // 2 sources

            case 95: {
                var22_6 /* !! */  = (int)ie.fmex("fnsq", fmfg(int ), (int)289);
                if (!var23_5) ** GOTO lbl587
                throw null;
            }
lbl624:
            // 2 sources

            case 96: {
                var22_6 /* !! */  = (int)ie.fmex("fnsr", fmfg(int ), (int)290);
                if (!var23_5) ** GOTO lbl403
                throw null;
            }
lbl628:
            // 2 sources

            case 97: {
                var22_6 /* !! */  = (int)ie.fmex("fnsv", fmfg(int ), (int)291);
                if (!var23_5) ** GOTO lbl276
                throw null;
            }
lbl632:
            // 2 sources

            case 98: {
                var22_6 /* !! */  = (int)ie.fmex("fnsw", fmfg(int ), (int)292);
                if (!var23_5) ** GOTO lbl372
                throw null;
            }
lbl636:
            // 3 sources

            case 99: {
                var22_6 /* !! */  = (int)ie.fmex("fnsx", fmfg(int ), (int)293);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl787
            }
lbl641:
            // 4 sources

            case 100: {
                var22_6 /* !! */  = (int)ie.fmex("fntc", fmfg(int ), (int)294);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl672
            }
lbl646:
            // 2 sources

            case 101: {
                var22_6 /* !! */  = (int)ie.fmex("fntg", fmfg(int ), (int)295);
                if (!var23_5) ** GOTO lbl601
                throw null;
            }
            case 102: {
                var22_6 /* !! */  = (int)ie.fmex("fntk", fmfg(int ), (int)296);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl745
            }
lbl655:
            // 2 sources

            case 103: {
                var22_6 /* !! */  = (int)ie.fmex("fnto", fmfg(int ), (int)297);
                if (!var23_5) ** GOTO lbl544
                throw null;
            }
lbl659:
            // 2 sources

            case 104: {
                var22_6 /* !! */  = (int)ie.fmex("fntr", fmfg(int ), (int)298);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl694
            }
            case 105: {
                var22_6 /* !! */  = (int)ie.fmex("fntx", fmfg(int ), (int)299);
                if (!var23_5) ** GOTO lbl201
                throw null;
            }
lbl668:
            // 2 sources

            case 106: {
                var22_6 /* !! */  = (int)ie.fmex("fntz", fmfg(int ), (int)300);
                if (!var23_5) ** GOTO lbl641
                throw null;
            }
lbl672:
            // 4 sources

            case 107: {
                var22_6 /* !! */  = (int)ie.fmex("fnub", fmfg(int ), (int)301);
                if (!var23_5) ** GOTO lbl311
                throw null;
            }
lbl676:
            // 3 sources

            case 108: {
                var22_6 /* !! */  = (int)ie.fmex("fnuh", fmfg(int ), (int)302);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl740
            }
lbl681:
            // 2 sources

            case 109: {
                var22_6 /* !! */  = (int)ie.fmex("fnui", fmfg(int ), (int)303);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl795
            }
lbl686:
            // 2 sources

            case 110: {
                var22_6 /* !! */  = (int)ie.fmex("fnum", fmfg(int ), (int)304);
                if (!var23_5) ** GOTO lbl573
                throw null;
            }
            case 111: {
                var22_6 /* !! */  = (int)ie.fmex("fnuo", fmfg(int ), (int)305);
                if (!var23_5) ** GOTO lbl641
                throw null;
            }
lbl694:
            // 4 sources

            case 112: {
                var22_6 /* !! */  = (int)ie.fmex("fnur", fmfg(int ), (int)306);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl850
            }
lbl699:
            // 2 sources

            case 113: {
                var22_6 /* !! */  = (int)ie.fmex("fnuu", fmfg(int ), (int)307);
                if (!var23_5) ** GOTO lbl296
                throw null;
            }
lbl703:
            // 2 sources

            case 114: {
                var22_6 /* !! */  = (int)ie.fmex("fnuy", fmfg(int ), (int)308);
                if (!var23_5) ** GOTO lbl191
                throw null;
            }
            case 115: {
                var22_6 /* !! */  = (int)ie.fmex("fnvc", fmfg(int ), (int)309);
                if (!var23_5) ** GOTO lbl540
                throw null;
            }
            case 116: {
                var22_6 /* !! */  = (int)ie.fmex("fnvf", fmfg(int ), (int)310);
                if (!var23_5) ** GOTO lbl381
                throw null;
            }
            case 117: {
                var22_6 /* !! */  = (int)ie.fmex("fnvi", fmfg(int ), (int)311);
                if (!var23_5) ** GOTO lbl358
                throw null;
            }
lbl719:
            // 3 sources

            case 118: {
                var22_6 /* !! */  = (int)ie.fmex("fnvj", fmfg(int ), (int)312);
                if (!var23_5) ** GOTO lbl358
                throw null;
            }
            case 119: {
                var22_6 /* !! */  = (int)ie.fmex("fnvm", fmfg(int ), (int)313);
                if (!var23_5) ** GOTO lbl686
                throw null;
            }
lbl727:
            // 2 sources

            case 120: {
                var22_6 /* !! */  = (int)ie.fmex("fnvp", fmfg(int ), (int)314);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl829
            }
            case 121: {
                var22_6 /* !! */  = (int)ie.fmex("fnvs", fmfg(int ), (int)315);
                if (!var23_5) ** GOTO lbl615
                throw null;
            }
            case 122: {
                var22_6 /* !! */  = (int)ie.fmex("fnvw", fmfg(int ), (int)316);
                if (!var23_5) ** GOTO lbl196
                throw null;
            }
lbl740:
            // 2 sources

            case 123: {
                var22_6 /* !! */  = (int)ie.fmex("fnvz", fmfg(int ), (int)317);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl762
            }
lbl745:
            // 3 sources

            case 124: {
                var22_6 /* !! */  = (int)ie.fmex("fnwd", fmfg(int ), (int)318);
                if (!var23_5) ** GOTO lbl601
                throw null;
            }
            case 125: {
                var22_6 /* !! */  = (int)ie.fmex("fnwe", fmfg(int ), (int)319);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl833
            }
            case 126: {
                var22_6 /* !! */  = (int)ie.fmex("fnwh", fmfg(int ), (int)320);
                if (!var23_5) ** GOTO lbl497
                throw null;
            }
            case 127: {
                var22_6 /* !! */  = (int)ie.fmex("fnwk", fmfg(int ), (int)321);
                if (!var23_5) ** GOTO lbl316
                throw null;
            }
lbl762:
            // 2 sources

            case 128: {
                var22_6 /* !! */  = (int)ie.fmex("fnwl", fmfg(int ), (int)322);
                if (!var23_5) ** GOTO lbl349
                throw null;
            }
            case 129: {
                var22_6 /* !! */  = (int)ie.fmex("fnwr", fmfg(int ), (int)323);
                if (!var23_5) ** GOTO lbl311
                throw null;
            }
lbl770:
            // 3 sources

            case 130: {
                var22_6 /* !! */  = (int)ie.fmex("fnws", fmfg(int ), (int)324);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl870
            }
            case 131: {
                var22_6 /* !! */  = (int)ie.fmex("fnww", fmfg(int ), (int)325);
                if (!var23_5) ** GOTO lbl554
                throw null;
            }
            case 132: {
                var22_6 /* !! */  = (int)ie.fmex("fnxb", fmfg(int ), (int)326);
                if (!var23_5) ** GOTO lbl636
                throw null;
            }
lbl783:
            // 2 sources

            case 133: {
                var22_6 /* !! */  = (int)ie.fmex("fnxc", fmfg(int ), (int)327);
                if (!var23_5) ** GOTO lbl417
                throw null;
            }
lbl787:
            // 3 sources

            case 134: {
                var22_6 /* !! */  = (int)ie.fmex("fnxg", fmfg(int ), (int)328);
                if (!var23_5) ** GOTO lbl206
                throw null;
            }
lbl791:
            // 2 sources

            case 135: {
                var22_6 /* !! */  = (int)ie.fmex("fnxl", fmfg(int ), (int)329);
                if (!var23_5) ** GOTO lbl694
                throw null;
            }
lbl795:
            // 2 sources

            case 136: {
                var22_6 /* !! */  = (int)ie.fmex("fnxp", fmfg(int ), (int)330);
                if (!var23_5) ** GOTO lbl605
                throw null;
            }
lbl799:
            // 2 sources

            case 137: {
                var22_6 /* !! */  = (int)ie.fmex("fnxt", fmfg(int ), (int)331);
                if (!var23_5) ** GOTO lbl176
                throw null;
            }
lbl803:
            // 3 sources

            case 138: {
                var22_6 /* !! */  = (int)ie.fmex("fnxu", fmfg(int ), (int)332);
                if (!var23_5) ** GOTO lbl519
                throw null;
            }
            case 139: {
                var22_6 /* !! */  = (int)ie.fmex("fnxz", fmfg(int ), (int)333);
                if (!var23_5) ** GOTO lbl471
                throw null;
            }
lbl811:
            // 2 sources

            case 140: {
                var22_6 /* !! */  = (int)ie.fmex("fnyd", fmfg(int ), (int)334);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl866
            }
lbl816:
            // 3 sources

            case 141: {
                var22_6 /* !! */  = (int)ie.fmex("fnye", fmfg(int ), (int)335);
                if (!var23_5) ** GOTO lbl196
                throw null;
            }
            case 142: {
                var22_6 /* !! */  = (int)ie.fmex("fnyi", fmfg(int ), (int)336);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl833
            }
            case 143: {
                var22_6 /* !! */  = (int)ie.fmex("fnyr", fmfg(int ), (int)337);
                if (!var23_5) ** GOTO lbl251
                throw null;
            }
lbl829:
            // 2 sources

            case 144: {
                var22_6 /* !! */  = (int)ie.fmex("fnzb", fmfg(int ), (int)338);
                if (!var23_5) ** GOTO lbl699
                throw null;
            }
lbl833:
            // 5 sources

            case 145: {
                var22_6 /* !! */  = (int)ie.fmex("fnzi", fmfg(int ), (int)339);
                if (!var23_5) ** GOTO lbl791
                throw null;
            }
            case 146: {
                var22_6 /* !! */  = (int)ie.fmex("fnzo", fmfg(int ), (int)340);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl862
            }
lbl842:
            // 2 sources

            case 147: {
                var22_6 /* !! */  = (int)ie.fmex("fnzt", fmfg(int ), (int)341);
                if (!var23_5) ** GOTO lbl306
                throw null;
            }
lbl846:
            // 2 sources

            case 148: {
                var22_6 /* !! */  = (int)ie.fmex("foac", fmfg(int ), (int)342);
                if (!var23_5) ** GOTO lbl770
                throw null;
            }
lbl850:
            // 2 sources

            case 149: {
                var22_6 /* !! */  = (int)ie.fmex("foaj", fmfg(int ), (int)343);
                if (!var23_5) ** GOTO lbl506
                throw null;
            }
            case 150: {
                var22_6 /* !! */  = (int)ie.fmex("foav", fmfg(int ), (int)344);
                if (!var23_5) ** GOTO lbl803
                throw null;
            }
            case 151: {
                var22_6 /* !! */  = (int)ie.fmex("fobe", fmfg(int ), (int)345);
                if (!var23_5) ** GOTO lbl431
                throw null;
            }
lbl862:
            // 4 sources

            case 152: {
                var22_6 /* !! */  = (int)ie.fmex("fobi", fmfg(int ), (int)346);
                if (!var23_5) ** GOTO lbl226
                throw null;
            }
lbl866:
            // 2 sources

            case 153: {
                var22_6 /* !! */  = (int)ie.fmex("fobq", fmfg(int ), (int)347);
                if (!var23_5) ** GOTO lbl358
                throw null;
            }
lbl870:
            // 3 sources

            case 154: {
                var22_6 /* !! */  = (int)ie.fmex("fobz", fmfg(int ), (int)348);
                if (!var23_5) ** GOTO lbl846
                throw null;
            }
            case 155: {
                var22_6 /* !! */  = (int)ie.fmex("focc", fmfg(int ), (int)349);
                if (!var23_5) ** GOTO lbl385
                throw null;
            }
            case 156: {
                var22_6 /* !! */  = (int)ie.fmex("focj", fmfg(int ), (int)350);
                if (!var23_5) ** GOTO lbl316
                throw null;
            }
            case 157: {
                var22_6 /* !! */  = (int)ie.fmex("focx", fmfg(int ), (int)351);
                if (!var23_5) ** GOTO lbl636
                throw null;
            }
            case 158: 
        }
        var22_6 /* !! */  = (int)ie.fmex("fodc", fmfg(int ), (int)352);
        ** while (!var23_5)
lbl889:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float quantizeDelta(float var1_1) {
        block70: {
            block72: {
                block71: {
                    block67: {
                        block69: {
                            block68: {
                                block66: {
                                    var8_2 = ie.c;
                                    var7_3 /* !! */  = ie.b;
                                    var6_4 = ie.a;
                                    if (var8_2) {
                                        throw null;
lbl6:
                                        // 18 sources

                                        return (float)ie.fmex("fquu", fmfb(int ), (int)773);
                                    }
                                    if (var6_4 || var6_4) ** GOTO lbl6
                                    var2_5 = nm.computeGcd();
                                    if (var6_4 || var6_4) ** GOTO lbl6
                                    if (!(var2_5 <= ie.fmex("fqux", fmkl(int ), (int)185))) break block66;
                                    if (var6_4 || var6_4) ** GOTO lbl6
                                    return var1_1;
                                }
                                if (var6_4 || var6_4) ** GOTO lbl6
                                var4_6 /* !! */  = Math.round((double)var1_1 / var2_5);
                                if (var6_4 || var6_4) ** GOTO lbl6
                                if (var4_6 /* !! */  != ie.fmex("fquy", fmeq(int ), (int)186)) break block67;
                                if (var6_4) ** GOTO lbl6
                                if (!((double)Math.abs(var1_1) > var2_5 * ie.fmex("fqva", fmkl(int ), (int)187))) break block67;
                                if (var6_4 || var6_4) ** GOTO lbl6
                                if (!(var1_1 > 0.0f)) break block68;
                                if (var6_4) ** GOTO lbl6
                                v0 = ie.fmex("fqvh", fmeq(int ), (int)188);
                                if (var8_2) {
                                    throw null;
                                }
                                break block69;
                            }
                            if (var6_4 || var6_4) ** GOTO lbl6
                            v0 = ie.fmex("fqvi", fmeq(int ), (int)189);
                        }
                        var4_6 /* !! */  = (long)v0;
                        if (var6_4) ** GOTO lbl6
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!((double)Math.abs(var1_1) > var2_5 * ie.fmex("fqvm", fmkl(int ), (int)190))) break block70;
                    if (var6_4) ** GOTO lbl6
                    if (Math.abs(var4_6 /* !! */ ) >= ie.fmex("fqvq", fmeq(int ), (int)191)) break block70;
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!(var1_1 > 0.0f)) break block71;
                    if (var6_4) ** GOTO lbl6
                    v1 = ie.fmex("fqvz", fmeq(int ), (int)192);
                    if (var8_2) {
                        throw null;
                    }
                    break block72;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                v1 = ie.fmex("fqwb", fmeq(int ), (int)193);
            }
            var4_6 /* !! */  = (long)v1;
            if (var6_4) ** GOTO lbl6
        }
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_4) ** break;
                ** continue;
                return (float)((double)var4_6 /* !! */  * var2_5);
            }
            case 0: {
                var7_3 /* !! */  = (int)ie.fmex("fqwg", fmfg(int ), (int)774);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 1: {
                var7_3 /* !! */  = (int)ie.fmex("fqwj", fmfg(int ), (int)775);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl70:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)ie.fmex("fqwk", fmfg(int ), (int)776);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 3: {
                var7_3 /* !! */  = (int)ie.fmex("fqwl", fmfg(int ), (int)777);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl80:
            // 4 sources

            case 4: {
                var7_3 /* !! */  = (int)ie.fmex("fqws", fmfg(int ), (int)778);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl85:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)ie.fmex("fqwt", fmfg(int ), (int)779);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl90:
            // 3 sources

            case 6: {
                var7_3 /* !! */  = (int)ie.fmex("fqwu", fmfg(int ), (int)780);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
lbl94:
            // 3 sources

            case 7: {
                var7_3 /* !! */  = (int)ie.fmex("fqww", fmfg(int ), (int)781);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl99:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)ie.fmex("fqwy", fmfg(int ), (int)782);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl104:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)ie.fmex("fqxb", fmfg(int ), (int)783);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 10: {
                var7_3 /* !! */  = (int)ie.fmex("fqxe", fmfg(int ), (int)784);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl114:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)ie.fmex("fqxi", fmfg(int ), (int)785);
                if (!var8_2) ** GOTO lbl80
                throw null;
            }
lbl118:
            // 2 sources

            case 12: {
                var7_3 /* !! */  = (int)ie.fmex("fqxl", fmfg(int ), (int)786);
                if (!var8_2) ** GOTO lbl99
                throw null;
            }
lbl122:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ie.fmex("frph", fmfg(int ), (int)787);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl127:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)ie.fmex("frpi", fmfg(int ), (int)788);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
lbl131:
            // 4 sources

            case 15: {
                var7_3 /* !! */  = (int)ie.fmex("frpj", fmfg(int ), (int)789);
                if (!var8_2) ** GOTO lbl80
                throw null;
            }
            case 16: {
                var7_3 /* !! */  = (int)ie.fmex("frpk", fmfg(int ), (int)790);
                if (!var8_2) ** GOTO lbl94
                throw null;
            }
lbl139:
            // 3 sources

            case 17: {
                do {
                    var7_3 /* !! */  = (int)ie.fmex("frpl", fmfg(int ), (int)791);
                } while (!var8_2);
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)ie.fmex("frpm", fmfg(int ), (int)792);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl149:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)ie.fmex("frpn", fmfg(int ), (int)793);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
lbl153:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)ie.fmex("frpo", fmfg(int ), (int)794);
                if (var8_2) {
                    throw null;
                }
            }
lbl157:
            // 4 sources

            case 21: {
                var7_3 /* !! */  = (int)ie.fmex("frpq", fmfg(int ), (int)795);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 22: {
                var7_3 /* !! */  = (int)ie.fmex("frpr", fmfg(int ), (int)796);
                if (var8_2) {
                    throw null;
                }
            }
lbl166:
            // 4 sources

            case 23: {
                var7_3 /* !! */  = (int)ie.fmex("frps", fmfg(int ), (int)797);
                if (!var8_2) ** GOTO lbl114
                throw null;
            }
            case 24: {
                var7_3 /* !! */  = (int)ie.fmex("frpt", fmfg(int ), (int)798);
                if (!var8_2) ** GOTO lbl99
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)ie.fmex("frpu", fmfg(int ), (int)799);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
lbl178:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)ie.fmex("frpv", fmfg(int ), (int)800);
                if (!var8_2) ** GOTO lbl85
                throw null;
            }
            case 27: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ie.fmex("frpw", fmfg(int ), (int)801);
                    if (!var8_2) ** GOTO lbl80
                    throw null;
                }
            }
            case 28: {
                var7_3 /* !! */  = (int)ie.fmex("frpx", fmfg(int ), (int)802);
                if (!var8_2) ** GOTO lbl149
                throw null;
            }
            case 29: {
                var7_3 /* !! */  = (int)ie.fmex("frpy", fmfg(int ), (int)803);
                if (!var8_2) ** GOTO lbl90
                throw null;
            }
            case 30: {
                var7_3 /* !! */  = (int)ie.fmex("frpz", fmfg(int ), (int)804);
                if (!var8_2) ** GOTO lbl178
                throw null;
            }
            case 31: 
        }
        var7_3 /* !! */  = (int)ie.fmex("frqa", fmfg(int ), (int)805);
        ** while (!var8_2)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fryk() {
        ie.fmfe[500] = 162663921;
        ie.fmfe[501] = 1810414229;
        ie.fmfe[502] = 2003309156;
        ie.fmfe[503] = 644611952;
        ie.fmfe[504] = -1757387806;
        ie.fmfe[505] = -709821570;
        ie.fmfe[506] = 2072524935;
        ie.fmfe[507] = 790343150;
        ie.fmfe[508] = -2060445571;
        ie.fmfe[509] = -923778782;
        ie.fmfe[510] = -1132859705;
        ie.fmfe[511] = -213579935;
        ie.fmfe[512] = 1467047813;
        ie.fmfe[513] = 204213322;
        ie.fmfe[514] = -1313761608;
        ie.fmfe[515] = 1461271845;
        ie.fmfe[516] = 1319303608;
        ie.fmfe[517] = 153108508;
        ie.fmfe[518] = -735055500;
        ie.fmfe[519] = 1809633745;
        ie.fmfe[520] = -376236767;
        ie.fmfe[521] = 554568669;
        ie.fmfe[522] = 168568105;
        ie.fmfe[523] = -2094833603;
        ie.fmfe[524] = -1479253166;
        ie.fmfe[525] = 22929998;
        ie.fmfe[526] = -359385182;
        ie.fmfe[527] = -2127754690;
        ie.fmfe[528] = -306138939;
        ie.fmfe[529] = 957967911;
        ie.fmfe[530] = 1501904899;
        ie.fmfe[531] = 1122075688;
        ie.fmfe[532] = 308634637;
        ie.fmfe[533] = -53054662;
        ie.fmfe[534] = -1115448546;
        ie.fmfe[535] = -479079276;
        ie.fmfe[536] = 408697933;
        ie.fmfe[537] = -1056170537;
        ie.fmfe[538] = 1139904773;
        ie.fmfe[539] = 1945095266;
        ie.fmfe[540] = 181207790;
        ie.fmfe[541] = 1130587250;
        ie.fmfe[542] = 1259487199;
        ie.fmfe[543] = -560563455;
        ie.fmfe[544] = 40641676;
        ie.fmfe[545] = 24731523;
        ie.fmfe[546] = 1274011647;
        ie.fmfe[547] = 2037326573;
        ie.fmfe[548] = -1424661200;
        ie.fmfe[549] = 1368701869;
        ie.fmfe[550] = -715541198;
        ie.fmfe[551] = 1555198585;
        ie.fmfe[552] = -1327422524;
        ie.fmfe[553] = -1237472734;
        ie.fmfe[554] = -104906408;
        ie.fmfe[555] = 285082830;
        ie.fmfe[556] = 1720049859;
        ie.fmfe[557] = -1699089595;
        ie.fmfe[558] = 1878232117;
        ie.fmfe[559] = 74608435;
        ie.fmfe[560] = -708903889;
        ie.fmfe[561] = 1382354832;
        ie.fmfe[562] = 473732232;
        ie.fmfe[563] = 1548639886;
        ie.fmfe[564] = 143449800;
        ie.fmfe[565] = 32926391;
        ie.fmfe[566] = -1598013859;
        ie.fmfe[567] = -555775702;
        ie.fmfe[568] = -156106118;
        ie.fmfe[569] = 1984312589;
        ie.fmfe[570] = 1671516831;
        ie.fmfe[571] = -1880459079;
        ie.fmfe[572] = 286494230;
        ie.fmfe[573] = -364681433;
        ie.fmfe[574] = 1932813296;
        ie.fmfe[575] = 741765277;
        ie.fmfe[576] = -874809275;
        ie.fmfe[577] = 1406393278;
        ie.fmfe[578] = 786279613;
        ie.fmfe[579] = 2012935266;
        ie.fmfe[580] = -475699784;
        ie.fmfe[581] = 394372057;
        ie.fmfe[582] = 1252407948;
        ie.fmfe[583] = -1816087921;
        ie.fmfe[584] = -119621980;
        ie.fmfe[585] = 2070346027;
        ie.fmfe[586] = -441976168;
        ie.fmfe[587] = -1944070242;
        ie.fmfe[588] = -1038780563;
        ie.fmfe[589] = -50564423;
        ie.fmfe[590] = 357923742;
        ie.fmfe[591] = -1495134905;
        ie.fmfe[592] = -1183242079;
        ie.fmfe[593] = -779919425;
        ie.fmfe[594] = -1566869255;
        ie.fmfe[595] = -1683052028;
        ie.fmfe[596] = 915116583;
        ie.fmfe[597] = -2147455788;
        ie.fmfe[598] = 1059554028;
        ie.fmfe[599] = -1010051887;
    }

    private static /* synthetic */ void frym() {
        ie.fmfe[700] = -709935278;
        ie.fmfe[701] = 1860231257;
        ie.fmfe[702] = -1823056723;
        ie.fmfe[703] = -965457789;
        ie.fmfe[704] = 885344069;
        ie.fmfe[705] = 1341594981;
        ie.fmfe[706] = -706575235;
        ie.fmfe[707] = -948988263;
        ie.fmfe[708] = 924440983;
        ie.fmfe[709] = -608173250;
        ie.fmfe[710] = -258448337;
        ie.fmfe[711] = 1882255059;
        ie.fmfe[712] = 1628675492;
        ie.fmfe[713] = -1471740003;
        ie.fmfe[714] = 261597284;
        ie.fmfe[715] = 647654643;
        ie.fmfe[716] = -518639239;
        ie.fmfe[717] = 280016402;
        ie.fmfe[718] = -2053362237;
        ie.fmfe[719] = 646600314;
        ie.fmfe[720] = -2006115894;
        ie.fmfe[721] = 298324703;
        ie.fmfe[722] = -1657146356;
        ie.fmfe[723] = -483028438;
        ie.fmfe[724] = 736181545;
        ie.fmfe[725] = 1648674852;
        ie.fmfe[726] = -797135252;
        ie.fmfe[727] = -147614779;
        ie.fmfe[728] = -548512139;
        ie.fmfe[729] = -1738243781;
        ie.fmfe[730] = -1954577134;
        ie.fmfe[731] = 594984987;
        ie.fmfe[732] = 1525762704;
        ie.fmfe[733] = -1019996059;
        ie.fmfe[734] = 2059852801;
        ie.fmfe[735] = 2006486339;
        ie.fmfe[736] = 1065266516;
        ie.fmfe[737] = -729056603;
        ie.fmfe[738] = -932236504;
        ie.fmfe[739] = 1720771368;
        ie.fmfe[740] = 446546374;
        ie.fmfe[741] = 1267295724;
        ie.fmfe[742] = 1733316627;
        ie.fmfe[743] = -1961809705;
        ie.fmfe[744] = -249785947;
        ie.fmfe[745] = 1274578176;
        ie.fmfe[746] = 1503051876;
        ie.fmfe[747] = -2103577860;
        ie.fmfe[748] = -488771357;
        ie.fmfe[749] = 1945940379;
        ie.fmfe[750] = 922764473;
        ie.fmfe[751] = 420077075;
        ie.fmfe[752] = 929892841;
        ie.fmfe[753] = 1267067264;
        ie.fmfe[754] = 913030289;
        ie.fmfe[755] = 1063139929;
        ie.fmfe[756] = 697549898;
        ie.fmfe[757] = 131963663;
        ie.fmfe[758] = -1070694142;
        ie.fmfe[759] = -977046971;
        ie.fmfe[760] = 1892044571;
        ie.fmfe[761] = -1625765084;
        ie.fmfe[762] = -412816308;
        ie.fmfe[763] = 135281842;
        ie.fmfe[764] = -1610672325;
        ie.fmfe[765] = 1196880593;
        ie.fmfe[766] = 1409128586;
        ie.fmfe[767] = -1444732789;
        ie.fmfe[768] = -807877284;
        ie.fmfe[769] = 372511697;
        ie.fmfe[770] = 1575358856;
        ie.fmfe[771] = -1864657085;
        ie.fmfe[772] = 2133533969;
        ie.fmfe[773] = -813366535;
        ie.fmfe[774] = 12254259;
        ie.fmfe[775] = 1167159842;
        ie.fmfe[776] = 544897779;
        ie.fmfe[777] = -72872229;
        ie.fmfe[778] = 1091573784;
        ie.fmfe[779] = 793970807;
        ie.fmfe[780] = 1330965745;
        ie.fmfe[781] = -81744679;
        ie.fmfe[782] = -242147386;
        ie.fmfe[783] = -206064455;
        ie.fmfe[784] = 970615713;
        ie.fmfe[785] = -1569156156;
        ie.fmfe[786] = -1191998003;
        ie.fmfe[787] = -1784387538;
        ie.fmfe[788] = 971198433;
        ie.fmfe[789] = -571667224;
        ie.fmfe[790] = 316143188;
        ie.fmfe[791] = -1210144288;
        ie.fmfe[792] = -2027065623;
        ie.fmfe[793] = 1204441068;
        ie.fmfe[794] = 1074954097;
        ie.fmfe[795] = -848082342;
        ie.fmfe[796] = -917979969;
        ie.fmfe[797] = 1058072116;
        ie.fmfe[798] = -627963205;
        ie.fmfe[799] = 1861095347;
    }

    static {
        ie.frxs();
        ie.frxu();
        ie.frxw();
        ie.frxx();
        ie.frya();
        ie.fryb();
        ie.fryc();
        ie.fryd();
        ie.frye();
        ie.fryf();
        ie.fryg();
        ie.fryh();
        ie.fryi();
        ie.fryj();
        ie.fryk();
        ie.fryl();
        ie.frym();
        ie.fryn();
        fmer = new long[292];
        fmes = new long[292];
        ie.fryo();
        ie.fryp();
        ie.fryq();
        ie.fryr();
        ie.frys();
        ie.fryt();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float strength() {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("fmol", fmeq(int ), (int)83));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2035499961: {
                    v1 = ie.fmex("fmom", fmeq(int ), (int)84);
                    continue block17;
                }
                case -421935005: {
                    break block17;
                }
                case -165424647: {
                    v1 = ie.fmex("fmon", fmeq(int ), (int)85);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ie.c;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ie.fmex("fmoo", fmeq(int ), (int)86));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2126738983: {
                    v3 = ie.fmex("fmop", fmeq(int ), (int)87);
                    continue block18;
                }
                case -1394837946: {
                    v3 = ie.fmex("fmoq", fmeq(int ), (int)88);
                    continue block18;
                }
                case -421935005: {
                    break block18;
                }
                case 304658198: {
                    v3 = ie.fmex("fmor", fmeq(int ), (int)89);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ie.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fmos", fmeq(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ie.fmex("fmot", fmfg(int ), (int)146)) break;
            v4 /* !! */  = (long)ie.fmex("fmou", fmfg(int ), (int)147);
        }
        var1_3 = ie.a;
        if (var3_1) {
            throw null;
            return (float)ie.fmex("fmow", fmfb(int ), (int)148);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 = ie.fmex("fmox", fmfb(int ), (int)149);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fmoy", fmeq(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ie.fmex("fmoz", fmfg(int ), (int)150)) break;
                    v6 /* !! */  = (long)ie.fmex("fmpa", fmfg(int ), (int)151);
                }
                v7 = v5 + this.speedDrift;
                v8 = ie.fmex("fmpb", fmfb(int ), (int)152);
                v9 = ie.fmex("fmpc", fmfb(int ), (int)153);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fmpd", fmeq(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ie.fmex("fmpe", fmfg(int ), (int)154)) break;
                    v10 /* !! */  = (long)ie.fmex("fmpf", fmfg(int ), (int)155);
                }
                return class_3532.method_15363((float)v7, (float)v8, (float)v9);
            }
lbl64:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ie.fmex("fmpg", fmfg(int ), (int)156);
                if (!var3_1) break;
                throw null;
            }
lbl68:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("fmph", fmfg(int ), (int)157);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("fmpi", fmfg(int ), (int)158);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ie.fmex("fmpj", fmfg(int ), (int)159);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] modelStep(float var1_1, float var2_2, float var3_3, float var4_4) {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(ie.fmex("fpjq", fmeq(int ), (int)143) - ie.fmex("fpjp", fmeq(int ), (int)142));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -421935005: {
                    break block47;
                }
                case -137542068: {
                    continue block47;
                }
            }
            break;
        }
        var8_5 = ie.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fpjs", fmeq(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ie.fmex("fpjt", fmfg(int ), (int)501)) break;
            v1 /* !! */  = (long)ie.fmex("fpju", fmfg(int ), (int)502);
        }
        var7_6 /* !! */  = ie.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fpjy", fmeq(int ), (int)145)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ie.fmex("fpjz", fmfg(int ), (int)503)) break;
            v2 /* !! */  = (long)ie.fmex("fpka", fmfg(int ), (int)504);
        }
        var6_7 = ie.a;
        if (var8_5) {
            throw null;
lbl27:
            // 6 sources

            return null;
        }
        if (var6_7 || var6_7) ** GOTO lbl27
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fpkd", fmeq(int ), (int)146)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ie.fmex("fpkf", fmfg(int ), (int)505)) break;
            v3 /* !! */  = (long)ie.fmex("fpkg", fmfg(int ), (int)506);
        }
        if (ms.isReady()) ** GOTO lbl68
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_7 || var6_7) ** GOTO lbl27
                v4 = var1_1;
                v5 = var2_2;
                v6 /* !! */  = ie.mp;
                if (true) ** GOTO lbl47
                block52: while (true) {
                    v6 /* !! */  = (long)(ie.fmex("fpkn", fmeq(int ), (int)148) - ie.fmex("fpkh", fmeq(int ), (int)147));
lbl47:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -597859583: {
                            continue block52;
                        }
                        case -421935005: {
                            break block52;
                        }
                    }
                    break;
                }
                v7 = (float)Math.hypot(v4, v5);
                v8 = ie.fmex("fpkp", fmfg(int ), (int)507);
                v9 /* !! */  = ie.mp;
                if (true) ** GOTO lbl58
                block53: while (true) {
                    v9 /* !! */  = (long)(v10 - ie.fmex("fpkq", fmeq(int ), (int)149));
lbl58:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -421935005: {
                            break block53;
                        }
                        case 1161837468: {
                            v10 = ie.fmex("fpks", fmeq(int ), (int)150);
                            continue block53;
                        }
                        case 1760781165: {
                            v10 = ie.fmex("fpkt", fmeq(int ), (int)151);
                            continue block53;
                        }
                    }
                    break;
                }
                return this.fallbackStep(var1_1, var2_2, v7, (boolean)v8);
            }
lbl68:
            // 1 sources

            if (var6_7 || var6_7) ** GOTO lbl27
            v11 /* !! */  = ie.mp;
            if (true) ** GOTO lbl73
            block54: while (true) {
                v11 /* !! */  = (long)(v12 - ie.fmex("fpku", fmeq(int ), (int)152));
lbl73:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -682557961: {
                        v12 = ie.fmex("fpkv", fmeq(int ), (int)153);
                        continue block54;
                    }
                    case -421935005: {
                        break block54;
                    }
                    case 54612913: {
                        v12 = ie.fmex("fplc", fmeq(int ), (int)154);
                        continue block54;
                    }
                    case 1955439134: {
                        v12 = ie.fmex("fple", fmeq(int ), (int)155);
                        continue block54;
                    }
                }
                break;
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fplf", fmeq(int ), (int)156)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v13 /* !! */  == ie.fmex("fplg", fmfg(int ), (int)508)) break;
                v13 /* !! */  = (long)ie.fmex("fplh", fmfg(int ), (int)509);
            }
            var5_8 = this.model.next(var1_1, var2_2, var3_3);
            if (var6_7 || var6_7) ** GOTO lbl27
            if (var5_8 != null) ** GOTO lbl129
            if (var6_7 || var6_7) ** GOTO lbl27
            v14 = var1_1;
            v15 = var2_2;
            v16 /* !! */  = ie.mp;
            if (true) ** GOTO lbl101
            block56: while (true) {
                v16 /* !! */  = (long)(v17 - ie.fmex("fplj", fmeq(int ), (int)157));
lbl101:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -421935005: {
                        break block56;
                    }
                    case 977916270: {
                        v17 = ie.fmex("fpll", fmeq(int ), (int)158);
                        continue block56;
                    }
                    case 1446217080: {
                        v17 = ie.fmex("fplt", fmeq(int ), (int)159);
                        continue block56;
                    }
                }
                break;
            }
            v18 = (float)Math.hypot(v14, v15);
            v19 = ie.fmex("fplu", fmfg(int ), (int)510);
            v20 /* !! */  = ie.mp;
            if (true) ** GOTO lbl116
            block57: while (true) {
                v20 /* !! */  = (long)(v21 - ie.fmex("fplv", fmeq(int ), (int)160));
lbl116:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1387593501: {
                        v21 = ie.fmex("fply", fmeq(int ), (int)161);
                        continue block57;
                    }
                    case -421935005: {
                        break block57;
                    }
                    case 662730013: {
                        v21 = ie.fmex("fpma", fmeq(int ), (int)162);
                        continue block57;
                    }
                    case 717138777: {
                        v21 = ie.fmex("fpmc", fmeq(int ), (int)163);
                        continue block57;
                    }
                }
                break;
            }
            return this.fallbackStep(var1_1, var2_2, v18, (boolean)v19);
lbl129:
            // 1 sources

            if (var6_7 || var6_7) ** continue;
            return new float[]{var5_8[0] * var4_4, var5_8[1] * var4_4};
            case 0: {
                var7_6 /* !! */  = (int)ie.fmex("fpmp", fmfg(int ), (int)511);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 1: {
                var7_6 /* !! */  = (int)ie.fmex("fpmr", fmfg(int ), (int)512);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 2: {
                do {
                    var7_6 /* !! */  = (int)ie.fmex("fpmv", fmfg(int ), (int)513);
                } while (!var8_5);
                throw null;
            }
            case 3: {
                do {
                    var7_6 /* !! */  = (int)ie.fmex("fpmy", fmfg(int ), (int)514);
                } while (!var8_5);
                throw null;
            }
lbl151:
            // 4 sources

            case 4: {
                var7_6 /* !! */  = (int)ie.fmex("fpna", fmfg(int ), (int)515);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl156:
            // 4 sources

            case 5: {
                var7_6 /* !! */  = (int)ie.fmex("fpnd", fmfg(int ), (int)516);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 6: {
                var7_6 /* !! */  = (int)ie.fmex("fpnf", fmfg(int ), (int)517);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 7: {
                var7_6 /* !! */  = (int)ie.fmex("fpnn", fmfg(int ), (int)518);
                if (!var8_5) ** GOTO lbl156
                throw null;
            }
            case 8: {
                var7_6 /* !! */  = (int)ie.fmex("fpnp", fmfg(int ), (int)519);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl175:
            // 3 sources

            case 9: {
                var7_6 /* !! */  = (int)ie.fmex("fpns", fmfg(int ), (int)520);
                if (!var8_5) ** GOTO lbl151
                throw null;
            }
lbl179:
            // 3 sources

            case 10: {
                var7_6 /* !! */  = (int)ie.fmex("fpnx", fmfg(int ), (int)521);
                if (!var8_5) ** GOTO lbl151
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var7_6 /* !! */  = (int)ie.fmex("fpoa", fmfg(int ), (int)522);
                    if (!var8_5) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl188:
            // 2 sources

            case 12: {
                var7_6 /* !! */  = (int)ie.fmex("fpoc", fmfg(int ), (int)523);
                if (!var8_5) ** GOTO lbl179
                throw null;
            }
            case 13: {
                var7_6 /* !! */  = (int)ie.fmex("fpoh", fmfg(int ), (int)524);
                if (!var8_5) ** GOTO lbl151
                throw null;
            }
            case 14: 
        }
        var7_6 /* !! */  = (int)ie.fmex("fpop", fmfg(int ), (int)525);
        ** while (!var8_5)
lbl199:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frxs() {
        ie.fmfd[0] = 1035779544;
        ie.fmfd[1] = -1131559864;
        ie.fmfd[2] = -962792864;
        ie.fmfd[3] = 1973365124;
        ie.fmfd[4] = 1138063571;
        ie.fmfd[5] = -1199402897;
        ie.fmfd[6] = -1973027276;
        ie.fmfd[7] = 241963688;
        ie.fmfd[8] = -601146035;
        ie.fmfd[9] = 1913348536;
        ie.fmfd[10] = -1907233716;
        ie.fmfd[11] = 1971861076;
        ie.fmfd[12] = -602020266;
        ie.fmfd[13] = 774940784;
        ie.fmfd[14] = 949826109;
        ie.fmfd[15] = -759545406;
        ie.fmfd[16] = -1189280867;
        ie.fmfd[17] = 1667201459;
        ie.fmfd[18] = 1141031546;
        ie.fmfd[19] = -1943744294;
        ie.fmfd[20] = -828211919;
        ie.fmfd[21] = -705030714;
        ie.fmfd[22] = -786135569;
        ie.fmfd[23] = 770967915;
        ie.fmfd[24] = 942597386;
        ie.fmfd[25] = 722170616;
        ie.fmfd[26] = 1083944133;
        ie.fmfd[27] = 508486273;
        ie.fmfd[28] = 310638827;
        ie.fmfd[29] = 2124892478;
        ie.fmfd[30] = -973350471;
        ie.fmfd[31] = -271445920;
        ie.fmfd[32] = 523979002;
        ie.fmfd[33] = -43939685;
        ie.fmfd[34] = 1377805880;
        ie.fmfd[35] = -1847541583;
        ie.fmfd[36] = 146416549;
        ie.fmfd[37] = 1672376816;
        ie.fmfd[38] = 1185688936;
        ie.fmfd[39] = -941338466;
        ie.fmfd[40] = -748822294;
        ie.fmfd[41] = -432576219;
        ie.fmfd[42] = 1494705559;
        ie.fmfd[43] = -1086940784;
        ie.fmfd[44] = -1671388026;
        ie.fmfd[45] = -1735346677;
        ie.fmfd[46] = 415531026;
        ie.fmfd[47] = 170776607;
        ie.fmfd[48] = -1022597609;
        ie.fmfd[49] = 126964975;
        ie.fmfd[50] = 1746885472;
        ie.fmfd[51] = 424143636;
        ie.fmfd[52] = -837810780;
        ie.fmfd[53] = 1676996065;
        ie.fmfd[54] = -2001819756;
        ie.fmfd[55] = -1956093451;
        ie.fmfd[56] = -579746190;
        ie.fmfd[57] = -435006911;
        ie.fmfd[58] = -1497067701;
        ie.fmfd[59] = -1314228644;
        ie.fmfd[60] = 947610940;
        ie.fmfd[61] = 1942356915;
        ie.fmfd[62] = -2059451644;
        ie.fmfd[63] = 1869456380;
        ie.fmfd[64] = 1327842312;
        ie.fmfd[65] = -375568922;
        ie.fmfd[66] = 80888135;
        ie.fmfd[67] = 911151750;
        ie.fmfd[68] = 582645355;
        ie.fmfd[69] = 260445961;
        ie.fmfd[70] = -1023892315;
        ie.fmfd[71] = -1951788099;
        ie.fmfd[72] = -887982305;
        ie.fmfd[73] = 352222030;
        ie.fmfd[74] = -964868725;
        ie.fmfd[75] = 294465885;
        ie.fmfd[76] = 1151102666;
        ie.fmfd[77] = 1666362387;
        ie.fmfd[78] = -1016844532;
        ie.fmfd[79] = -1148754797;
        ie.fmfd[80] = 1227908991;
        ie.fmfd[81] = 1936130466;
        ie.fmfd[82] = -533328547;
        ie.fmfd[83] = 1729882813;
        ie.fmfd[84] = -2050213440;
        ie.fmfd[85] = 488380448;
        ie.fmfd[86] = 88860796;
        ie.fmfd[87] = 851345871;
        ie.fmfd[88] = 1702144737;
        ie.fmfd[89] = -124874506;
        ie.fmfd[90] = 2043330818;
        ie.fmfd[91] = 336726765;
        ie.fmfd[92] = 268856718;
        ie.fmfd[93] = 1638275054;
        ie.fmfd[94] = 1337329384;
        ie.fmfd[95] = -1210298160;
        ie.fmfd[96] = 1905194454;
        ie.fmfd[97] = -418235324;
        ie.fmfd[98] = 867261707;
        ie.fmfd[99] = -1685032914;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetState() {
        var3_1 = ie.c;
        var2_2 /* !! */  = ie.b;
        var1_3 = ie.a;
        if (var3_1) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.recoverTicks = (int)ie.fmex("fmif", fmfg(int ), (int)48);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.spikeGuardTicks = (int)ie.fmex("fmig", fmfg(int ), (int)49);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.postHitTicks = (int)ie.fmex("fmih", fmfg(int ), (int)50);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.pursueStreak = (int)ie.fmex("fmij", fmfg(int ), (int)51);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.pauseTicks = (int)ie.fmex("fmik", fmfg(int ), (int)52);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.combatTicks = (int)ie.fmex("fmil", fmfg(int ), (int)53);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.rotationTicks = (int)ie.fmex("fmim", fmfg(int ), (int)54);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastEntityId = (int)ie.fmex("fmin", fmfg(int ), (int)55);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastAttackCount = (int)ie.fmex("fmio", fmfg(int ), (int)56);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.nextResetAt = (long)ie.fmex("fmip", fmeq(int ), (int)27);
        if (var1_3 || var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.lastStepPitch = 0.0f;
                this.lastStepYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastRemYaw = (float)ie.fmex("fmiq", fmfb(int ), (int)57);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastRemPitch = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.speedDrift = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.resetNoise();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.model.resetPlayback();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ie.fmex("fmir", fmfg(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl51:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("fmis", fmfg(int ), (int)59);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl56:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("fmit", fmfg(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl65
            }
lbl61:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ie.fmex("fmiv", fmfg(int ), (int)61);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
lbl65:
            // 6 sources

            case 4: {
                var2_2 /* !! */  = (int)ie.fmex("fmiw", fmfg(int ), (int)62);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 5: {
                var2_2 /* !! */  = (int)ie.fmex("fmix", fmfg(int ), (int)63);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ie.fmex("fmiy", fmfg(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl79:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ie.fmex("fmiz", fmfg(int ), (int)65);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl84:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ie.fmex("fmja", fmfg(int ), (int)66);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 9: {
                var2_2 /* !! */  = (int)ie.fmex("fmjb", fmfg(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 10: {
                var2_2 /* !! */  = (int)ie.fmex("fmjc", fmfg(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl99:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ie.fmex("fmjd", fmfg(int ), (int)69);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl104:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ie.fmex("fmje", fmfg(int ), (int)70);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
lbl108:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)ie.fmex("fmjf", fmfg(int ), (int)71);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 14: {
                var2_2 /* !! */  = (int)ie.fmex("fmjg", fmfg(int ), (int)72);
                if (var3_1) {
                    throw null;
                }
            }
lbl117:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)ie.fmex("fmjh", fmfg(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 16: {
                var2_2 /* !! */  = (int)ie.fmex("fmji", fmfg(int ), (int)74);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 17: {
                var2_2 /* !! */  = (int)ie.fmex("fmjj", fmfg(int ), (int)75);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 18: {
                var2_2 /* !! */  = (int)ie.fmex("fmjk", fmfg(int ), (int)76);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
lbl136:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)ie.fmex("fmjl", fmfg(int ), (int)77);
                if (!var3_1) ** GOTO lbl104
                throw null;
            }
lbl140:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)ie.fmex("fmjm", fmfg(int ), (int)78);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 21: {
                var2_2 /* !! */  = (int)ie.fmex("fmjn", fmfg(int ), (int)79);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl149:
            // 2 sources

            case 22: {
                var2_2 /* !! */  = (int)ie.fmex("fmjo", fmfg(int ), (int)80);
                if (!var3_1) ** GOTO lbl99
                throw null;
            }
            case 23: {
                var2_2 /* !! */  = (int)ie.fmex("fmjp", fmfg(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl158:
            // 3 sources

            case 24: {
                var2_2 /* !! */  = (int)ie.fmex("fmjq", fmfg(int ), (int)82);
                if (!var3_1) break;
                throw null;
            }
            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ie.fmex("fmjr", fmfg(int ), (int)83);
                    if (!var3_1) ** GOTO lbl65
                    throw null;
                }
            }
lbl167:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)ie.fmex("fmjs", fmfg(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl172:
            // 3 sources

            case 27: {
                var2_2 /* !! */  = (int)ie.fmex("fmjt", fmfg(int ), (int)85);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl176:
            // 3 sources

            case 28: {
                var2_2 /* !! */  = (int)ie.fmex("fmju", fmfg(int ), (int)86);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
lbl180:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)ie.fmex("fmjv", fmfg(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
            }
lbl184:
            // 4 sources

            case 30: {
                var2_2 /* !! */  = (int)ie.fmex("fmjw", fmfg(int ), (int)88);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
lbl188:
            // 2 sources

            case 31: {
                var2_2 /* !! */  = (int)ie.fmex("fmjx", fmfg(int ), (int)89);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl192:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)ie.fmex("fmjy", fmfg(int ), (int)90);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
lbl196:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)ie.fmex("fmjz", fmfg(int ), (int)91);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
lbl200:
            // 2 sources

            case 34: {
                var2_2 /* !! */  = (int)ie.fmex("fmka", fmfg(int ), (int)92);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
            case 35: 
        }
        var2_2 /* !! */  = (int)ie.fmex("fmkb", fmfg(int ), (int)93);
        ** while (!var3_1)
lbl207:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov smoothReset(ov var1_1, ov var2_2) {
        var15_3 = ie.c;
        var14_4 /* !! */  = ie.b;
        var13_5 = ie.a;
        if (var15_3) {
            throw null;
lbl6:
            // 32 sources

            return null;
        }
        if (var13_5 || var13_5) ** GOTO lbl6
        var3_6 = ow.calculateDelta(var1_1, var2_2);
        if (var13_5 || var13_5) ** GOTO lbl6
        var4_7 = var3_6.getYaw();
        if (var13_5 || var13_5) ** GOTO lbl6
        var5_8 = var3_6.getPitch();
        if (var14_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_5 || var13_5) ** GOTO lbl6
                var6_9 = (float)Math.hypot(var4_7, var5_8);
                if (var13_5 || var13_5) ** GOTO lbl6
                if (!(var6_9 < ie.fmex("fodz", fmfb(int ), (int)353))) ** GOTO lbl27
                if (var13_5 || var13_5) ** GOTO lbl6
                this.lastRemYaw = (float)ie.fmex("foeb", fmfb(int ), (int)354);
                if (var13_5 || var13_5) ** GOTO lbl6
                this.lastRemPitch = 0.0f;
                if (var13_5 || var13_5) ** GOTO lbl6
                return var2_2;
lbl27:
                // 1 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                var7_10 = 0.0f;
                if (var13_5 || var13_5) ** GOTO lbl6
                var8_11 = 0.0f;
                if (var13_5 || var13_5) ** GOTO lbl6
                if (this.lastRemYaw == ie.fmex("foee", fmfb(int ), (int)355)) ** GOTO lbl38
                if (var13_5 || var13_5) ** GOTO lbl6
                var7_10 = var4_7 - this.lastRemYaw;
                if (var13_5 || var13_5) ** GOTO lbl6
                var8_11 = var5_8 - this.lastRemPitch;
                if (var13_5) ** GOTO lbl6
lbl38:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                this.lastRemYaw = var4_7;
                if (var13_5 || var13_5) ** GOTO lbl6
                this.lastRemPitch = var5_8;
                if (var13_5 || var13_5) ** GOTO lbl6
                var9_12 = class_3532.method_15363((float)(var6_9 * ie.fmex("foeo", fmfb(int ), (int)356)), (float)ie.fmex("foep", fmfb(int ), (int)357), (float)ie.fmex("foeq", fmfb(int ), (int)358));
                if (var13_5 || var13_5) ** GOTO lbl6
                if (!ms.isReady()) ** GOTO lbl63
                if (var13_5 || var13_5) ** GOTO lbl6
                var11_13 = this.model.next(var4_7, var5_8, var9_12);
                if (var13_5 || var13_5) ** GOTO lbl6
                if (var11_13 == null) ** GOTO lbl56
                if (var13_5 || var13_5) ** GOTO lbl6
                var10_15 = new float[]{var11_13[0] * this.lerp((float)ie.fmex("foez", fmfb(int ), (int)359), (float)ie.fmex("foff", fmfb(int ), (int)360)), var11_13[1] * this.lerp((float)ie.fmex("fofh", fmfb(int ), (int)361), (float)ie.fmex("fofi", fmfb(int ), (int)362))};
                if (var13_5 || var13_5) ** GOTO lbl6
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl59
lbl56:
                // 1 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                var10_15 = this.resetFallbackStep(var4_7, var5_8, var6_9);
                if (var13_5) ** GOTO lbl6
lbl59:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl66
lbl63:
                // 1 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                var10_15 = this.resetFallbackStep(var4_7, var5_8, var6_9);
                if (var13_5) ** GOTO lbl6
lbl66:
                // 2 sources

                if (var13_5 || var13_5) ** GOTO lbl6
                var11_14 = this.lerp((float)ie.fmex("fofv", fmfb(int ), (int)363), (float)ie.fmex("fogc", fmfb(int ), (int)364));
                if (var13_5 || var13_5) ** GOTO lbl6
                var12_16 = this.lerp((float)ie.fmex("fogf", fmfb(int ), (int)365), (float)ie.fmex("fogl", fmfb(int ), (int)366));
                if (var13_5 || var13_5) ** GOTO lbl6
                var10_15[0] = class_3532.method_15363((float)var10_15[0], (float)(-var11_14), (float)var11_14);
                if (var13_5 || var13_5) ** GOTO lbl6
                var10_15[1] = class_3532.method_15363((float)var10_15[1], (float)(-var12_16), (float)var12_16);
                if (!var13_5 && !var13_5) ** break;
                ** continue;
                return this.outputStep(var1_1, var4_7, var5_8, var6_9, var10_15, (boolean)ie.fmex("fogt", fmfg(int ), (int)367), (float)ie.fmex("fogv", fmfb(int ), (int)368), var7_10, var8_11);
            }
lbl77:
            // 3 sources

            case 0: {
                var14_4 /* !! */  = (int)ie.fmex("fogw", fmfg(int ), (int)369);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl82:
            // 3 sources

            case 1: {
                var14_4 /* !! */  = (int)ie.fmex("fogy", fmfg(int ), (int)370);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 2: {
                var14_4 /* !! */  = (int)ie.fmex("fohb", fmfg(int ), (int)371);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl92:
            // 2 sources

            case 3: {
                var14_4 /* !! */  = (int)ie.fmex("fohf", fmfg(int ), (int)372);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl97:
            // 2 sources

            case 4: {
                var14_4 /* !! */  = (int)ie.fmex("fohk", fmfg(int ), (int)373);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl102:
            // 2 sources

            case 5: {
                var14_4 /* !! */  = (int)ie.fmex("fohl", fmfg(int ), (int)374);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl107:
            // 2 sources

            case 6: {
                var14_4 /* !! */  = (int)ie.fmex("fohp", fmfg(int ), (int)375);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 7: {
                var14_4 /* !! */  = (int)ie.fmex("fohq", fmfg(int ), (int)376);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 8: {
                var14_4 /* !! */  = (int)ie.fmex("fohr", fmfg(int ), (int)377);
                if (!var15_3) ** GOTO lbl82
                throw null;
            }
lbl121:
            // 2 sources

            case 9: {
                var14_4 /* !! */  = (int)ie.fmex("fohx", fmfg(int ), (int)378);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl126:
            // 2 sources

            case 10: {
                var14_4 /* !! */  = (int)ie.fmex("foic", fmfg(int ), (int)379);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 11: {
                var14_4 /* !! */  = (int)ie.fmex("foii", fmfg(int ), (int)380);
                if (!var15_3) ** GOTO lbl126
                throw null;
            }
lbl135:
            // 2 sources

            case 12: {
                var14_4 /* !! */  = (int)ie.fmex("foin", fmfg(int ), (int)381);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl140:
            // 3 sources

            case 13: {
                var14_4 /* !! */  = (int)ie.fmex("foiq", fmfg(int ), (int)382);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 14: {
                var14_4 /* !! */  = (int)ie.fmex("fois", fmfg(int ), (int)383);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl150:
            // 3 sources

            case 15: {
                var14_4 /* !! */  = (int)ie.fmex("fojo", fmfg(int ), (int)384);
                if (!var15_3) ** GOTO lbl92
                throw null;
            }
lbl154:
            // 2 sources

            case 16: {
                var14_4 /* !! */  = (int)ie.fmex("fojq", fmfg(int ), (int)385);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl159:
            // 2 sources

            case 17: {
                var14_4 /* !! */  = (int)ie.fmex("fojt", fmfg(int ), (int)386);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl164:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_4 /* !! */  = (int)ie.fmex("fokb", fmfg(int ), (int)387);
                    if (!var15_3) ** GOTO lbl140
                    throw null;
                }
            }
            case 19: {
                var14_4 /* !! */  = (int)ie.fmex("foke", fmfg(int ), (int)388);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 20: {
                var14_4 /* !! */  = (int)ie.fmex("foki", fmfg(int ), (int)389);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 21: {
                var14_4 /* !! */  = (int)ie.fmex("fokl", fmfg(int ), (int)390);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl184:
            // 4 sources

            case 22: {
                var14_4 /* !! */  = (int)ie.fmex("fokn", fmfg(int ), (int)391);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 23: {
                var14_4 /* !! */  = (int)ie.fmex("foko", fmfg(int ), (int)392);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 24: {
                var14_4 /* !! */  = (int)ie.fmex("fokq", fmfg(int ), (int)393);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl199:
            // 3 sources

            case 25: {
                var14_4 /* !! */  = (int)ie.fmex("fokv", fmfg(int ), (int)394);
                if (!var15_3) ** GOTO lbl135
                throw null;
            }
lbl203:
            // 3 sources

            case 26: {
                var14_4 /* !! */  = (int)ie.fmex("fokx", fmfg(int ), (int)395);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 27: {
                var14_4 /* !! */  = (int)ie.fmex("fokz", fmfg(int ), (int)396);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 28: {
                var14_4 /* !! */  = (int)ie.fmex("fola", fmfg(int ), (int)397);
                if (!var15_3) ** GOTO lbl97
                throw null;
            }
lbl217:
            // 3 sources

            case 29: {
                var14_4 /* !! */  = (int)ie.fmex("folb", fmfg(int ), (int)398);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl222:
            // 2 sources

            case 30: {
                var14_4 /* !! */  = (int)ie.fmex("folc", fmfg(int ), (int)399);
                if (!var15_3) ** GOTO lbl217
                throw null;
            }
            case 31: {
                var14_4 /* !! */  = (int)ie.fmex("folf", fmfg(int ), (int)400);
                if (!var15_3) ** GOTO lbl184
                throw null;
            }
            case 32: {
                var14_4 /* !! */  = (int)ie.fmex("foli", fmfg(int ), (int)401);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 33: {
                var14_4 /* !! */  = (int)ie.fmex("folj", fmfg(int ), (int)402);
                if (!var15_3) ** GOTO lbl203
                throw null;
            }
lbl239:
            // 4 sources

            case 34: {
                var14_4 /* !! */  = (int)ie.fmex("folk", fmfg(int ), (int)403);
                if (!var15_3) ** GOTO lbl150
                throw null;
            }
            case 35: {
                var14_4 /* !! */  = (int)ie.fmex("foll", fmfg(int ), (int)404);
                if (!var15_3) ** GOTO lbl154
                throw null;
            }
lbl247:
            // 2 sources

            case 36: {
                var14_4 /* !! */  = (int)ie.fmex("foln", fmfg(int ), (int)405);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl252:
            // 4 sources

            case 37: {
                var14_4 /* !! */  = (int)ie.fmex("folp", fmfg(int ), (int)406);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl257:
            // 2 sources

            case 38: {
                var14_4 /* !! */  = (int)ie.fmex("fols", fmfg(int ), (int)407);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 39: {
                var14_4 /* !! */  = (int)ie.fmex("folv", fmfg(int ), (int)408);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl267:
            // 3 sources

            case 40: {
                var14_4 /* !! */  = (int)ie.fmex("folw", fmfg(int ), (int)409);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl272:
            // 3 sources

            case 41: {
                var14_4 /* !! */  = (int)ie.fmex("foly", fmfg(int ), (int)410);
                if (!var15_3) ** GOTO lbl217
                throw null;
            }
lbl276:
            // 2 sources

            case 42: {
                var14_4 /* !! */  = (int)ie.fmex("foma", fmfg(int ), (int)411);
                if (!var15_3) ** GOTO lbl239
                throw null;
            }
lbl280:
            // 2 sources

            case 43: {
                var14_4 /* !! */  = (int)ie.fmex("fomb", fmfg(int ), (int)412);
                if (!var15_3) ** GOTO lbl82
                throw null;
            }
lbl284:
            // 2 sources

            case 44: {
                var14_4 /* !! */  = (int)ie.fmex("fomc", fmfg(int ), (int)413);
                if (!var15_3) ** GOTO lbl239
                throw null;
            }
lbl288:
            // 4 sources

            case 45: {
                do {
                    var14_4 /* !! */  = (int)ie.fmex("fomf", fmfg(int ), (int)414);
                } while (!var15_3);
                throw null;
            }
lbl293:
            // 2 sources

            case 46: {
                var14_4 /* !! */  = (int)ie.fmex("foml", fmfg(int ), (int)415);
                if (!var15_3) ** GOTO lbl140
                throw null;
            }
lbl297:
            // 2 sources

            case 47: {
                var14_4 /* !! */  = (int)ie.fmex("fomm", fmfg(int ), (int)416);
                if (!var15_3) ** GOTO lbl199
                throw null;
            }
lbl301:
            // 2 sources

            case 48: {
                var14_4 /* !! */  = (int)ie.fmex("fomo", fmfg(int ), (int)417);
                if (!var15_3) ** GOTO lbl184
                throw null;
            }
            case 49: {
                var14_4 /* !! */  = (int)ie.fmex("fomq", fmfg(int ), (int)418);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl310:
            // 3 sources

            case 50: {
                var14_4 /* !! */  = (int)ie.fmex("fomt", fmfg(int ), (int)419);
                if (!var15_3) ** GOTO lbl288
                throw null;
            }
lbl314:
            // 3 sources

            case 51: {
                var14_4 /* !! */  = (int)ie.fmex("fomw", fmfg(int ), (int)420);
                if (var15_3) {
                    throw null;
                }
                ** GOTO lbl351
            }
            case 52: {
                var14_4 /* !! */  = (int)ie.fmex("fomy", fmfg(int ), (int)421);
                if (!var15_3) ** GOTO lbl77
                throw null;
            }
            case 53: {
                var14_4 /* !! */  = (int)ie.fmex("fona", fmfg(int ), (int)422);
                if (!var15_3) ** GOTO lbl252
                throw null;
            }
lbl327:
            // 2 sources

            case 54: {
                var14_4 /* !! */  = (int)ie.fmex("fond", fmfg(int ), (int)423);
                if (!var15_3) ** GOTO lbl150
                throw null;
            }
            case 55: {
                var14_4 /* !! */  = (int)ie.fmex("fonf", fmfg(int ), (int)424);
                if (!var15_3) ** GOTO lbl184
                throw null;
            }
            case 56: {
                var14_4 /* !! */  = (int)ie.fmex("foni", fmfg(int ), (int)425);
                if (!var15_3) ** GOTO lbl102
                throw null;
            }
lbl339:
            // 2 sources

            case 57: {
                var14_4 /* !! */  = (int)ie.fmex("fonk", fmfg(int ), (int)426);
                if (!var15_3) ** GOTO lbl107
                throw null;
            }
lbl343:
            // 2 sources

            case 58: {
                var14_4 /* !! */  = (int)ie.fmex("fonl", fmfg(int ), (int)427);
                if (!var15_3) ** GOTO lbl203
                throw null;
            }
            case 59: {
                var14_4 /* !! */  = (int)ie.fmex("fonm", fmfg(int ), (int)428);
                if (!var15_3) break;
                throw null;
            }
lbl351:
            // 6 sources

            case 60: {
                var14_4 /* !! */  = (int)ie.fmex("fons", fmfg(int ), (int)429);
                if (!var15_3) ** GOTO lbl222
                throw null;
            }
            case 61: {
                var14_4 /* !! */  = (int)ie.fmex("fonu", fmfg(int ), (int)430);
                if (!var15_3) ** GOTO lbl343
                throw null;
            }
            case 62: {
                var14_4 /* !! */  = (int)ie.fmex("fonw", fmfg(int ), (int)431);
                if (!var15_3) ** GOTO lbl77
                throw null;
            }
lbl363:
            // 2 sources

            case 63: {
                var14_4 /* !! */  = (int)ie.fmex("fonx", fmfg(int ), (int)432);
                if (!var15_3) ** GOTO lbl257
                throw null;
            }
            case 64: 
        }
        var14_4 /* !! */  = (int)ie.fmex("fony", fmfg(int ), (int)433);
        ** while (!var15_3)
lbl370:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fryj() {
        ie.fmfe[400] = 2020485486;
        ie.fmfe[401] = 1632875960;
        ie.fmfe[402] = -2037136191;
        ie.fmfe[403] = -1295139251;
        ie.fmfe[404] = -1111301675;
        ie.fmfe[405] = -1818065508;
        ie.fmfe[406] = -860338845;
        ie.fmfe[407] = 943875799;
        ie.fmfe[408] = -1688272593;
        ie.fmfe[409] = -274057088;
        ie.fmfe[410] = 548255852;
        ie.fmfe[411] = -1624508068;
        ie.fmfe[412] = 381651877;
        ie.fmfe[413] = 985353995;
        ie.fmfe[414] = 2144332849;
        ie.fmfe[415] = -975484510;
        ie.fmfe[416] = -1372394884;
        ie.fmfe[417] = -490483201;
        ie.fmfe[418] = -1232586830;
        ie.fmfe[419] = 1499923632;
        ie.fmfe[420] = 1709398662;
        ie.fmfe[421] = 1441567132;
        ie.fmfe[422] = 493178930;
        ie.fmfe[423] = -14378792;
        ie.fmfe[424] = 1819626971;
        ie.fmfe[425] = -1883211962;
        ie.fmfe[426] = -2124258296;
        ie.fmfe[427] = -1334240777;
        ie.fmfe[428] = 1186837705;
        ie.fmfe[429] = 1413795173;
        ie.fmfe[430] = 470060727;
        ie.fmfe[431] = 807249403;
        ie.fmfe[432] = 1373594120;
        ie.fmfe[433] = 1987289484;
        ie.fmfe[434] = -1268908494;
        ie.fmfe[435] = -1963481892;
        ie.fmfe[436] = 749223537;
        ie.fmfe[437] = -1944375638;
        ie.fmfe[438] = 1266679291;
        ie.fmfe[439] = 1817127839;
        ie.fmfe[440] = -688376050;
        ie.fmfe[441] = -2002292011;
        ie.fmfe[442] = -1460465716;
        ie.fmfe[443] = 61104046;
        ie.fmfe[444] = -975249806;
        ie.fmfe[445] = -184098373;
        ie.fmfe[446] = 1849695764;
        ie.fmfe[447] = -1896867679;
        ie.fmfe[448] = 1947538365;
        ie.fmfe[449] = 2099219556;
        ie.fmfe[450] = -574442373;
        ie.fmfe[451] = 102495692;
        ie.fmfe[452] = -1368711965;
        ie.fmfe[453] = 1334766728;
        ie.fmfe[454] = 1138827542;
        ie.fmfe[455] = 534588792;
        ie.fmfe[456] = 2030380189;
        ie.fmfe[457] = -1544452200;
        ie.fmfe[458] = 1792672400;
        ie.fmfe[459] = -1225157583;
        ie.fmfe[460] = 1397276905;
        ie.fmfe[461] = 1148226749;
        ie.fmfe[462] = 2096250269;
        ie.fmfe[463] = -225989879;
        ie.fmfe[464] = -631352621;
        ie.fmfe[465] = 1370692431;
        ie.fmfe[466] = -1324899152;
        ie.fmfe[467] = 1145713701;
        ie.fmfe[468] = 124330633;
        ie.fmfe[469] = -332804494;
        ie.fmfe[470] = 1772097163;
        ie.fmfe[471] = 1490405317;
        ie.fmfe[472] = 186214923;
        ie.fmfe[473] = -590675008;
        ie.fmfe[474] = -1950694887;
        ie.fmfe[475] = 1963734401;
        ie.fmfe[476] = -1756899554;
        ie.fmfe[477] = -938068524;
        ie.fmfe[478] = 963819654;
        ie.fmfe[479] = -275863780;
        ie.fmfe[480] = -1852663479;
        ie.fmfe[481] = -2099959071;
        ie.fmfe[482] = 400226855;
        ie.fmfe[483] = -874111264;
        ie.fmfe[484] = -91752667;
        ie.fmfe[485] = -304707759;
        ie.fmfe[486] = -1374628573;
        ie.fmfe[487] = 1321678347;
        ie.fmfe[488] = -371062561;
        ie.fmfe[489] = 2061425987;
        ie.fmfe[490] = 381140711;
        ie.fmfe[491] = 1412074894;
        ie.fmfe[492] = -83196382;
        ie.fmfe[493] = -1704639808;
        ie.fmfe[494] = 1209563889;
        ie.fmfe[495] = -1500112516;
        ie.fmfe[496] = 1722258775;
        ie.fmfe[497] = 1474637486;
        ie.fmfe[498] = 1889534253;
        ie.fmfe[499] = -633355860;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov commitStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7, float var8_8, float var9_9) {
        block133: {
            block132: {
                block131: {
                    block130: {
                        block129: {
                            block128: {
                                block127: {
                                    block126: {
                                        var19_10 = ie.c;
                                        var18_11 /* !! */  = ie.b;
                                        var17_12 = ie.a;
                                        if (var19_10) {
                                            throw null;
lbl6:
                                            // 35 sources

                                            return null;
                                        }
                                        if (var17_12 || var17_12) ** GOTO lbl6
                                        var10_13 = this.quantizeDelta(var5_5);
                                        if (var17_12 || var17_12) ** GOTO lbl6
                                        var11_14 = this.quantizeDelta(var6_6);
                                        if (var17_12 || var17_12) ** GOTO lbl6
                                        if (!var7_7) break block126;
                                        if (var17_12) ** GOTO lbl6
                                        v0 = this.lerp((float)ie.fmex("fpyj", fmfb(int ), (int)585), (float)ie.fmex("fpyl", fmfb(int ), (int)586));
                                        if (var19_10) {
                                            throw null;
                                        }
                                        break block127;
                                    }
                                    if (var17_12 || var17_12) ** GOTO lbl6
                                    v0 = var12_15 = this.lerp((float)ie.fmex("fpyn", fmfb(int ), (int)587), (float)ie.fmex("fpyo", fmfb(int ), (int)588));
                                }
                                if (var17_12 || var17_12) ** GOTO lbl6
                                if (!var7_7) break block128;
                                if (var17_12) ** GOTO lbl6
                                v1 = this.lerp((float)ie.fmex("fpyr", fmfb(int ), (int)589), (float)ie.fmex("fpys", fmfb(int ), (int)590));
                                if (var19_10) {
                                    throw null;
                                }
                                break block129;
                            }
                            if (var17_12 || var17_12) ** GOTO lbl6
                            v1 = var13_16 = this.lerp((float)ie.fmex("fpyu", fmfb(int ), (int)591), (float)ie.fmex("fpyv", fmfb(int ), (int)592));
                        }
                        if (var17_12 || var17_12) ** GOTO lbl6
                        if (this.postHitTicks <= 0) break block130;
                        if (var17_12 || var17_12) ** GOTO lbl6
                        var12_15 *= this.lerp((float)ie.fmex("fpyx", fmfb(int ), (int)593), (float)ie.fmex("fpyz", fmfb(int ), (int)594));
                        if (var17_12 || var17_12) ** GOTO lbl6
                        var13_16 *= this.lerp((float)ie.fmex("fpzc", fmfb(int ), (int)595), (float)ie.fmex("fpze", fmfb(int ), (int)596));
                        if (var17_12) ** GOTO lbl6
                    }
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var10_13 = class_3532.method_15363((float)var10_13, (float)(-var12_15), (float)var12_15);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var11_14 = class_3532.method_15363((float)var11_14, (float)(-var13_16), (float)var13_16);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var14_17 = var4_4 * var4_4 + ie.fmex("fpzk", fmfb(int ), (int)597);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var15_18 = (var10_13 * var2_2 + var11_14 * var3_3) / var14_17;
                    if (var17_12 || var17_12) ** GOTO lbl6
                    if (!var7_7) break block131;
                    if (var17_12) ** GOTO lbl6
                    if (!(var4_4 < ie.fmex("fpzm", fmfb(int ), (int)598))) break block131;
                    if (var17_12) ** GOTO lbl6
                    if (!(var15_18 > ie.fmex("fpzn", fmfb(int ), (int)599))) break block131;
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var16_19 = this.deflectStep(var2_2, var3_3, var4_4, var15_18, var10_13, var11_14);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var10_13 = this.quantizeDelta(var16_19[0]);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var11_14 = this.quantizeDelta(var16_19[1]);
                    if (var17_12 || var17_12) ** GOTO lbl6
                    var15_18 = (var10_13 * var2_2 + var11_14 * var3_3) / var14_17;
                    if (var17_12) ** GOTO lbl6
                }
                if (var17_12 || var17_12) ** GOTO lbl6
                if (!var7_7) break block132;
                if (var17_12) ** GOTO lbl6
                if (!(var4_4 < ie.fmex("fpzv", fmfb(int ), (int)600))) break block132;
                if (var17_12) ** GOTO lbl6
                if (!(var15_18 > ie.fmex("fpzw", fmfb(int ), (int)601))) break block132;
                if (var17_12 || var17_12) ** GOTO lbl6
                this.spikeGuardTicks = (int)ie.fmex("fpzy", fmfg(int ), (int)602);
                if (var17_12 || var17_12) ** GOTO lbl6
                var16_20 = this.lerp((float)ie.fmex("fqaf", fmfb(int ), (int)603), (float)ie.fmex("fqag", fmfb(int ), (int)604));
                if (var17_12 || var17_12) ** GOTO lbl6
                v2 = new float[2];
                v2[ie.fmex("fqak", fmfg(int ), (int)605)] = var10_13 * var16_20;
                v2[ie.fmex("fqam", fmfg(int ), (int)606)] = var11_14 * var16_20;
                return this.outputStep(var1_1, var2_2, var3_3, var4_4, v2, (boolean)ie.fmex("fqao", fmfg(int ), (int)607), (float)ie.fmex("fqaq", fmfb(int ), (int)608), var8_8, var9_9);
            }
            if (var17_12 || var17_12) ** GOTO lbl6
            var16_21 = (float)Math.hypot(var10_13, var11_14);
            if (var17_12 || var17_12) ** GOTO lbl6
            if (!(var16_21 > ie.fmex("fqas", fmfb(int ), (int)609))) break block133;
            if (var17_12 || var17_12) ** GOTO lbl6
            this.recoverTicks = (int)ie.fmex("fqaz", fmfg(int ), (int)610);
            if (var17_12) ** GOTO lbl6
        }
        if (!var17_12 && !var17_12) ** break;
        ** while (true)
        if (var18_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var18_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = new float[]{var10_13, var11_14};
                if (var7_7) {
                    v4 = ie.fmex("fqbd", fmfb(int ), (int)611);
                    if (var19_10) {
                        throw null;
                    }
                } else {
                    v4 = ie.fmex("fqbe", fmfb(int ), (int)612);
                }
                return this.outputStep(var1_1, var2_2, var3_3, var4_4, v3, var7_7, (float)v4, var8_8, var9_9);
            }
            case 0: {
                var18_11 /* !! */  = (int)ie.fmex("fqbg", fmfg(int ), (int)613);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl108:
            // 2 sources

            case 1: {
                var18_11 /* !! */  = (int)ie.fmex("fqbh", fmfg(int ), (int)614);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 2: {
                var18_11 /* !! */  = (int)ie.fmex("fqbi", fmfg(int ), (int)615);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl118:
            // 2 sources

            case 3: {
                var18_11 /* !! */  = (int)ie.fmex("fqbk", fmfg(int ), (int)616);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl123:
            // 2 sources

            case 4: {
                var18_11 /* !! */  = (int)ie.fmex("fqbt", fmfg(int ), (int)617);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 5: {
                var18_11 /* !! */  = (int)ie.fmex("fqby", fmfg(int ), (int)618);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 6: {
                do {
                    var18_11 /* !! */  = (int)ie.fmex("fqbz", fmfg(int ), (int)619);
                } while (!var19_10);
                throw null;
            }
lbl138:
            // 2 sources

            case 7: {
                var18_11 /* !! */  = (int)ie.fmex("fqca", fmfg(int ), (int)620);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl143:
            // 2 sources

            case 8: {
                var18_11 /* !! */  = (int)ie.fmex("fqcd", fmfg(int ), (int)621);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl148:
            // 4 sources

            case 9: {
                var18_11 /* !! */  = (int)ie.fmex("fqch", fmfg(int ), (int)622);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl153:
            // 4 sources

            case 10: {
                var18_11 /* !! */  = (int)ie.fmex("fqcj", fmfg(int ), (int)623);
                if (!var19_10) ** GOTO lbl148
                throw null;
            }
            case 11: {
                var18_11 /* !! */  = (int)ie.fmex("fqcp", fmfg(int ), (int)624);
                if (!var19_10) ** GOTO lbl153
                throw null;
            }
            case 12: {
                var18_11 /* !! */  = (int)ie.fmex("fqct", fmfg(int ), (int)625);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 13: {
                var18_11 /* !! */  = (int)ie.fmex("fqcu", fmfg(int ), (int)626);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 14: {
                var18_11 /* !! */  = (int)ie.fmex("fqcv", fmfg(int ), (int)627);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl176:
            // 2 sources

            case 15: {
                var18_11 /* !! */  = (int)ie.fmex("fqcz", fmfg(int ), (int)628);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 16: {
                var18_11 /* !! */  = (int)ie.fmex("fqdc", fmfg(int ), (int)629);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl186:
            // 3 sources

            case 17: {
                var18_11 /* !! */  = (int)ie.fmex("fqdf", fmfg(int ), (int)630);
                if (!var19_10) ** GOTO lbl138
                throw null;
            }
lbl190:
            // 3 sources

            case 18: {
                var18_11 /* !! */  = (int)ie.fmex("fqdk", fmfg(int ), (int)631);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl195:
            // 4 sources

            case 19: {
                var18_11 /* !! */  = (int)ie.fmex("fqdn", fmfg(int ), (int)632);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl200:
            // 2 sources

            case 20: {
                var18_11 /* !! */  = (int)ie.fmex("fqdo", fmfg(int ), (int)633);
                if (!var19_10) ** GOTO lbl148
                throw null;
            }
lbl204:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var18_11 /* !! */  = (int)ie.fmex("fqdp", fmfg(int ), (int)634);
                    if (var19_10) {
                        throw null;
                    }
                    ** GOTO lbl348
                    break;
                }
            }
lbl210:
            // 2 sources

            case 22: {
                var18_11 /* !! */  = (int)ie.fmex("fqds", fmfg(int ), (int)635);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 23: {
                var18_11 /* !! */  = (int)ie.fmex("fqdx", fmfg(int ), (int)636);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 24: {
                var18_11 /* !! */  = (int)ie.fmex("fqdy", fmfg(int ), (int)637);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl225:
            // 5 sources

            case 25: {
                var18_11 /* !! */  = (int)ie.fmex("fqeb", fmfg(int ), (int)638);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl230:
            // 3 sources

            case 26: {
                var18_11 /* !! */  = (int)ie.fmex("fqee", fmfg(int ), (int)639);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl235:
            // 3 sources

            case 27: {
                var18_11 /* !! */  = (int)ie.fmex("fqeh", fmfg(int ), (int)640);
                if (!var19_10) ** GOTO lbl195
                throw null;
            }
lbl239:
            // 2 sources

            case 28: {
                var18_11 /* !! */  = (int)ie.fmex("fqej", fmfg(int ), (int)641);
                if (!var19_10) ** GOTO lbl200
                throw null;
            }
lbl243:
            // 3 sources

            case 29: {
                var18_11 /* !! */  = (int)ie.fmex("fqek", fmfg(int ), (int)642);
                if (!var19_10) ** GOTO lbl153
                throw null;
            }
            case 30: {
                var18_11 /* !! */  = (int)ie.fmex("fqen", fmfg(int ), (int)643);
                if (!var19_10) ** GOTO lbl123
                throw null;
            }
lbl251:
            // 2 sources

            case 31: {
                var18_11 /* !! */  = (int)ie.fmex("fqeq", fmfg(int ), (int)644);
                if (!var19_10) ** GOTO lbl153
                throw null;
            }
lbl255:
            // 5 sources

            case 32: {
                var18_11 /* !! */  = (int)ie.fmex("fqeu", fmfg(int ), (int)645);
                if (!var19_10) break;
                throw null;
            }
            case 33: {
                var18_11 /* !! */  = (int)ie.fmex("fqex", fmfg(int ), (int)646);
                if (!var19_10) ** GOTO lbl235
                throw null;
            }
lbl263:
            // 3 sources

            case 34: {
                var18_11 /* !! */  = (int)ie.fmex("fqfb", fmfg(int ), (int)647);
                if (!var19_10) ** GOTO lbl230
                throw null;
            }
lbl267:
            // 2 sources

            case 35: {
                var18_11 /* !! */  = (int)ie.fmex("fqfe", fmfg(int ), (int)648);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl348
            }
            case 36: {
                var18_11 /* !! */  = (int)ie.fmex("fqff", fmfg(int ), (int)649);
                if (!var19_10) ** GOTO lbl195
                throw null;
            }
            case 37: {
                var18_11 /* !! */  = (int)ie.fmex("fqfg", fmfg(int ), (int)650);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 38: {
                var18_11 /* !! */  = (int)ie.fmex("fqfi", fmfg(int ), (int)651);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl286:
            // 2 sources

            case 39: {
                var18_11 /* !! */  = (int)ie.fmex("fqfo", fmfg(int ), (int)652);
                if (!var19_10) ** GOTO lbl239
                throw null;
            }
            case 40: {
                var18_11 /* !! */  = (int)ie.fmex("fqfq", fmfg(int ), (int)653);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl295:
            // 2 sources

            case 41: {
                var18_11 /* !! */  = (int)ie.fmex("fqfs", fmfg(int ), (int)654);
                if (!var19_10) ** GOTO lbl225
                throw null;
            }
lbl299:
            // 2 sources

            case 42: {
                var18_11 /* !! */  = (int)ie.fmex("fqfv", fmfg(int ), (int)655);
                if (!var19_10) ** GOTO lbl251
                throw null;
            }
            case 43: {
                var18_11 /* !! */  = (int)ie.fmex("fqfw", fmfg(int ), (int)656);
                if (!var19_10) break;
                throw null;
            }
lbl307:
            // 2 sources

            case 44: {
                var18_11 /* !! */  = (int)ie.fmex("fqfy", fmfg(int ), (int)657);
                if (!var19_10) ** GOTO lbl235
                throw null;
            }
            case 45: {
                var18_11 /* !! */  = (int)ie.fmex("fqge", fmfg(int ), (int)658);
                if (var19_10) {
                    throw null;
                }
                ** GOTO lbl364
            }
lbl316:
            // 2 sources

            case 46: {
                var18_11 /* !! */  = (int)ie.fmex("fqgg", fmfg(int ), (int)659);
                if (!var19_10) ** GOTO lbl108
                throw null;
            }
lbl320:
            // 3 sources

            case 47: {
                var18_11 /* !! */  = (int)ie.fmex("fqgh", fmfg(int ), (int)660);
                if (!var19_10) ** GOTO lbl190
                throw null;
            }
            case 48: {
                var18_11 /* !! */  = (int)ie.fmex("fqgi", fmfg(int ), (int)661);
                if (!var19_10) ** GOTO lbl195
                throw null;
            }
lbl328:
            // 2 sources

            case 49: {
                var18_11 /* !! */  = (int)ie.fmex("fqgj", fmfg(int ), (int)662);
                if (!var19_10) ** GOTO lbl176
                throw null;
            }
lbl332:
            // 2 sources

            case 50: {
                var18_11 /* !! */  = (int)ie.fmex("fqgk", fmfg(int ), (int)663);
                if (!var19_10) ** GOTO lbl286
                throw null;
            }
lbl336:
            // 5 sources

            case 51: {
                var18_11 /* !! */  = (int)ie.fmex("fqgo", fmfg(int ), (int)664);
                if (!var19_10) ** GOTO lbl210
                throw null;
            }
lbl340:
            // 2 sources

            case 52: {
                var18_11 /* !! */  = (int)ie.fmex("fqgs", fmfg(int ), (int)665);
                if (!var19_10) ** GOTO lbl267
                throw null;
            }
            case 53: {
                var18_11 /* !! */  = (int)ie.fmex("fqhb", fmfg(int ), (int)666);
                if (!var19_10) ** GOTO lbl148
                throw null;
            }
lbl348:
            // 3 sources

            case 54: {
                var18_11 /* !! */  = (int)ie.fmex("fqhc", fmfg(int ), (int)667);
                if (!var19_10) break;
                throw null;
            }
            case 55: {
                var18_11 /* !! */  = (int)ie.fmex("fqhg", fmfg(int ), (int)668);
                if (!var19_10) ** GOTO lbl225
                throw null;
            }
lbl356:
            // 2 sources

            case 56: {
                var18_11 /* !! */  = (int)ie.fmex("fqhl", fmfg(int ), (int)669);
                if (!var19_10) ** GOTO lbl263
                throw null;
            }
            case 57: {
                var18_11 /* !! */  = (int)ie.fmex("fqhm", fmfg(int ), (int)670);
                if (!var19_10) ** GOTO lbl356
                throw null;
            }
lbl364:
            // 2 sources

            case 58: {
                var18_11 /* !! */  = (int)ie.fmex("fqho", fmfg(int ), (int)671);
                if (!var19_10) ** GOTO lbl225
                throw null;
            }
            case 59: {
                var18_11 /* !! */  = (int)ie.fmex("fqhs", fmfg(int ), (int)672);
                if (!var19_10) ** GOTO lbl316
                throw null;
            }
            case 60: {
                var18_11 /* !! */  = (int)ie.fmex("fqhy", fmfg(int ), (int)673);
                if (!var19_10) ** GOTO lbl243
                throw null;
            }
lbl376:
            // 2 sources

            case 61: {
                var18_11 /* !! */  = (int)ie.fmex("fqic", fmfg(int ), (int)674);
                if (!var19_10) ** GOTO lbl307
                throw null;
            }
            case 62: {
                var18_11 /* !! */  = (int)ie.fmex("fqif", fmfg(int ), (int)675);
                if (!var19_10) ** GOTO lbl118
                throw null;
            }
            case 63: {
                var18_11 /* !! */  = (int)ie.fmex("fqig", fmfg(int ), (int)676);
                if (!var19_10) ** GOTO lbl225
                throw null;
            }
            case 64: 
        }
        var18_11 /* !! */  = (int)ie.fmex("fqij", fmfg(int ), (int)677);
        ** while (!var19_10)
lbl391:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fmex(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fryb() {
        ie.fmfd[500] = 162663921;
        ie.fmfd[501] = -1810414230;
        ie.fmfd[502] = 2136447760;
        ie.fmfd[503] = -644611953;
        ie.fmfd[504] = -492196818;
        ie.fmfd[505] = 709821569;
        ie.fmfd[506] = -1161078980;
        ie.fmfd[507] = 790343151;
        ie.fmfd[508] = 2060445570;
        ie.fmfd[509] = 1892276821;
        ie.fmfd[510] = -1132859706;
        ie.fmfd[511] = -213579933;
        ie.fmfd[512] = 1467047823;
        ie.fmfd[513] = 204213322;
        ie.fmfd[514] = -1313761601;
        ie.fmfd[515] = 1461271842;
        ie.fmfd[516] = 1319303602;
        ie.fmfd[517] = 153108503;
        ie.fmfd[518] = -735055503;
        ie.fmfd[519] = 1809633759;
        ie.fmfd[520] = -376236756;
        ie.fmfd[521] = 554568659;
        ie.fmfd[522] = 168568107;
        ie.fmfd[523] = -2094833613;
        ie.fmfd[524] = -1479253162;
        ie.fmfd[525] = 22929995;
        ie.fmfd[526] = -732365969;
        ie.fmfd[527] = -1105045993;
        ie.fmfd[528] = -757806556;
        ie.fmfd[529] = 102842315;
        ie.fmfd[530] = 1725524213;
        ie.fmfd[531] = 2108714925;
        ie.fmfd[532] = 756402138;
        ie.fmfd[533] = -1114213574;
        ie.fmfd[534] = -66872546;
        ie.fmfd[535] = -1575889772;
        ie.fmfd[536] = 1506557005;
        ie.fmfd[537] = -29306598;
        ie.fmfd[538] = 2090472474;
        ie.fmfd[539] = 1289198990;
        ie.fmfd[540] = 905270018;
        ie.fmfd[541] = 2088181395;
        ie.fmfd[542] = 1905339824;
        ie.fmfd[543] = -560563433;
        ie.fmfd[544] = 40641682;
        ie.fmfd[545] = 24731539;
        ie.fmfd[546] = 1274011630;
        ie.fmfd[547] = 2037326584;
        ie.fmfd[548] = -1424661189;
        ie.fmfd[549] = 1368701838;
        ie.fmfd[550] = -715541205;
        ie.fmfd[551] = 1555198588;
        ie.fmfd[552] = -1327422498;
        ie.fmfd[553] = -1237472713;
        ie.fmfd[554] = -104906405;
        ie.fmfd[555] = 285082843;
        ie.fmfd[556] = 1720049872;
        ie.fmfd[557] = -1699089572;
        ie.fmfd[558] = 1878232127;
        ie.fmfd[559] = 74608401;
        ie.fmfd[560] = -708903903;
        ie.fmfd[561] = 1382354818;
        ie.fmfd[562] = 473732233;
        ie.fmfd[563] = 1548639872;
        ie.fmfd[564] = 143449823;
        ie.fmfd[565] = 32926375;
        ie.fmfd[566] = -1598013826;
        ie.fmfd[567] = -555775707;
        ie.fmfd[568] = -156106116;
        ie.fmfd[569] = 1984312593;
        ie.fmfd[570] = 1671516814;
        ie.fmfd[571] = -1880459082;
        ie.fmfd[572] = 286494220;
        ie.fmfd[573] = -364681432;
        ie.fmfd[574] = 1932813268;
        ie.fmfd[575] = 741765275;
        ie.fmfd[576] = -874809250;
        ie.fmfd[577] = 1406393263;
        ie.fmfd[578] = 786279584;
        ie.fmfd[579] = 2012935274;
        ie.fmfd[580] = -475699790;
        ie.fmfd[581] = 394372092;
        ie.fmfd[582] = 1252407955;
        ie.fmfd[583] = -1816087936;
        ie.fmfd[584] = -119621978;
        ie.fmfd[585] = 988215595;
        ie.fmfd[586] = -1542980968;
        ie.fmfd[587] = -843065442;
        ie.fmfd[588] = -2083162259;
        ie.fmfd[589] = -1110674759;
        ie.fmfd[590] = 1411742622;
        ie.fmfd[591] = -410907321;
        ie.fmfd[592] = -118937439;
        ie.fmfd[593] = -289082965;
        ie.fmfd[594] = -1644355937;
        ie.fmfd[595] = -1528232944;
        ie.fmfd[596] = 166589505;
        ie.fmfd[597] = -1165787461;
        ie.fmfd[598] = 2124907244;
        ie.fmfd[599] = -37874082;
    }

    private static /* synthetic */ void fryp() {
        ie.fmer[100] = -1765573669667053492L;
        ie.fmer[101] = 2146469681536786423L;
        ie.fmer[102] = 2121781297579348768L;
        ie.fmer[103] = -7629956896147954244L;
        ie.fmer[104] = 8521813233826385133L;
        ie.fmer[105] = 8919672173751400418L;
        ie.fmer[106] = -6842468635306630954L;
        ie.fmer[107] = 2300790727208685378L;
        ie.fmer[108] = 8653483905041398787L;
        ie.fmer[109] = 6617684525293528632L;
        ie.fmer[110] = 5882734401786680112L;
        ie.fmer[111] = -7981912762032280691L;
        ie.fmer[112] = 4651600903545024621L;
        ie.fmer[113] = -4774222526369150869L;
        ie.fmer[114] = 3211747510911147326L;
        ie.fmer[115] = -4836213976456094642L;
        ie.fmer[116] = 3622044211226541147L;
        ie.fmer[117] = -7406532795139491494L;
        ie.fmer[118] = 9027093185775052810L;
        ie.fmer[119] = -487113284955750924L;
        ie.fmer[120] = -248188353762571442L;
        ie.fmer[121] = -7259921821119697393L;
        ie.fmer[122] = -6620958208656195267L;
        ie.fmer[123] = 4573700408308291155L;
        ie.fmer[124] = 8506803396152558511L;
        ie.fmer[125] = -6306399607957261190L;
        ie.fmer[126] = 2937651534368235884L;
        ie.fmer[127] = 2666965242009911462L;
        ie.fmer[128] = 6264191620185038779L;
        ie.fmer[129] = 5316966195398018324L;
        ie.fmer[130] = 2721850039942852129L;
        ie.fmer[131] = 1605300383736603893L;
        ie.fmer[132] = 6469599104734671550L;
        ie.fmer[133] = -2418866726846708866L;
        ie.fmer[134] = 5001592703750524898L;
        ie.fmer[135] = -2137259570282730268L;
        ie.fmer[136] = 6449919377034667652L;
        ie.fmer[137] = -4269929353273678001L;
        ie.fmer[138] = 1366018902320408377L;
        ie.fmer[139] = 6000709607483568043L;
        ie.fmer[140] = -4073693653730935688L;
        ie.fmer[141] = -8694345632337692234L;
        ie.fmer[142] = 465943279798127595L;
        ie.fmer[143] = 8041161633068310681L;
        ie.fmer[144] = -1752633194514976779L;
        ie.fmer[145] = 6448252293900944229L;
        ie.fmer[146] = -5181930516379059334L;
        ie.fmer[147] = -1323251815633359152L;
        ie.fmer[148] = -2305386552037513673L;
        ie.fmer[149] = 2147043478609571910L;
        ie.fmer[150] = -2560184944870302387L;
        ie.fmer[151] = -2507707011174115159L;
        ie.fmer[152] = 8535035469421807877L;
        ie.fmer[153] = -3077990947157532151L;
        ie.fmer[154] = 8489150924440966828L;
        ie.fmer[155] = -2903249956594105650L;
        ie.fmer[156] = -3210247688548525192L;
        ie.fmer[157] = 3581301844232485694L;
        ie.fmer[158] = 4647276717012056837L;
        ie.fmer[159] = -3916487233332867938L;
        ie.fmer[160] = 3454798508054648666L;
        ie.fmer[161] = -900919211706591013L;
        ie.fmer[162] = -2056759641691792006L;
        ie.fmer[163] = -8310946352602673556L;
        ie.fmer[164] = 1026031613351255336L;
        ie.fmer[165] = -7817446929024758673L;
        ie.fmer[166] = -2522222640994010230L;
        ie.fmer[167] = -5054389743023307393L;
        ie.fmer[168] = -4225285439379375762L;
        ie.fmer[169] = -4109935919679022950L;
        ie.fmer[170] = 7180974788249313815L;
        ie.fmer[171] = 1391194924430156540L;
        ie.fmer[172] = 2022298092114350411L;
        ie.fmer[173] = 1695211459032630981L;
        ie.fmer[174] = -15666485265602303L;
        ie.fmer[175] = -371495808711069378L;
        ie.fmer[176] = -4471219714890010369L;
        ie.fmer[177] = 3509027643489581929L;
        ie.fmer[178] = 4586839528573536656L;
        ie.fmer[179] = 388521660494428462L;
        ie.fmer[180] = 1850975626320372293L;
        ie.fmer[181] = 5573703724658624883L;
        ie.fmer[182] = 1031829755153839413L;
        ie.fmer[183] = -6568993428965404082L;
        ie.fmer[184] = -8517941941038299764L;
        ie.fmer[185] = -3979808303981320471L;
        ie.fmer[186] = -650939569564871231L;
        ie.fmer[187] = 7603909391978130355L;
        ie.fmer[188] = 1490367946084492291L;
        ie.fmer[189] = -2849786097248373906L;
        ie.fmer[190] = -290660529424997888L;
        ie.fmer[191] = -4879369361099244639L;
        ie.fmer[192] = -8637604959441529175L;
        ie.fmer[193] = -8074415310808983989L;
        ie.fmer[194] = -7893936302102295277L;
        ie.fmer[195] = -4135399683162074106L;
        ie.fmer[196] = -444990083799378956L;
        ie.fmer[197] = -8206650925575837701L;
        ie.fmer[198] = -5000864923145135580L;
        ie.fmer[199] = 6412516258190984688L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetNoise() {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("fmfu", fmeq(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -421935005: {
                    break block33;
                }
                case -171698511: {
                    v1 = ie.fmex("fmfv", fmeq(int ), (int)2);
                    continue block33;
                }
                case 837173130: {
                    v1 = ie.fmex("fmfw", fmeq(int ), (int)3);
                    continue block33;
                }
            }
            break;
        }
        var3_1 = ie.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fmfx", fmeq(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ie.fmex("fmfy", fmfg(int ), (int)12)) break;
            v2 /* !! */  = (long)ie.fmex("fmfz", fmfg(int ), (int)13);
        }
        var2_2 /* !! */  = ie.b;
        v3 /* !! */  = ie.mp;
        if (true) ** GOTO lbl25
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - ie.fmex("fmga", fmeq(int ), (int)5));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1431873747: {
                    v4 = ie.fmex("fmgb", fmeq(int ), (int)6);
                    continue block35;
                }
                case -1362987559: {
                    v4 = ie.fmex("fmgc", fmeq(int ), (int)7);
                    continue block35;
                }
                case -1036646643: {
                    v4 = ie.fmex("fmgd", fmeq(int ), (int)8);
                    continue block35;
                }
                case -421935005: {
                    break block35;
                }
            }
            break;
        }
        var1_3 = ie.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fmge", fmeq(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ie.fmex("fmgf", fmfg(int ), (int)14)) break;
            v5 /* !! */  = (long)ie.fmex("fmgg", fmfg(int ), (int)15);
        }
        v6 = this.randGauss();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fmgh", fmeq(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ie.fmex("fmgi", fmfg(int ), (int)16)) break;
            v7 /* !! */  = (long)ie.fmex("fmgj", fmfg(int ), (int)17);
        }
        this.noiseYaw = v6;
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fmgk", fmeq(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ie.fmex("fmgl", fmfg(int ), (int)18)) break;
            v8 /* !! */  = (long)ie.fmex("fmgm", fmfg(int ), (int)19);
        }
        v9 = this.randGauss();
        v10 /* !! */  = ie.mp;
        if (true) ** GOTO lbl66
        block40: while (true) {
            v10 /* !! */  = (long)(ie.fmex("fmgo", fmeq(int ), (int)13) - ie.fmex("fmgn", fmeq(int ), (int)12));
lbl66:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -808241812: {
                    continue block40;
                }
                case -421935005: {
                    break block40;
                }
            }
            break;
        }
        this.noisePitch = v9;
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ie.mp - ie.fmex("fmgp", fmeq(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ie.fmex("fmgq", fmfg(int ), (int)20)) break;
                    v11 /* !! */  = (long)ie.fmex("fmgr", fmfg(int ), (int)21);
                }
                v12 = this.randGauss();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = ie.mp - ie.fmex("fmgs", fmeq(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ie.fmex("fmgt", fmfg(int ), (int)22)) break;
                    v13 /* !! */  = (long)ie.fmex("fmgu", fmfg(int ), (int)23);
                }
                this.wanderYaw = v12;
                if (var1_3 || var1_3) ** GOTO lbl40
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = ie.mp - ie.fmex("fmgv", fmeq(int ), (int)16)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ie.fmex("fmgw", fmfg(int ), (int)24)) break;
                    v14 /* !! */  = (long)ie.fmex("fmgx", fmfg(int ), (int)25);
                }
                v15 = this.randGauss();
                v16 /* !! */  = ie.mp;
                if (true) ** GOTO lbl100
                block44: while (true) {
                    v16 /* !! */  = (long)(ie.fmex("fmgz", fmeq(int ), (int)18) - ie.fmex("fmgy", fmeq(int ), (int)17));
lbl100:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -421935005: {
                            break block44;
                        }
                        case 871613340: {
                            continue block44;
                        }
                    }
                    break;
                }
                this.wanderPitch = v15;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl109:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ie.fmex("fmha", fmfg(int ), (int)26);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl155
                    break;
                }
            }
lbl115:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("fmhb", fmfg(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("fmhc", fmfg(int ), (int)28);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 3: {
                var2_2 /* !! */  = (int)ie.fmex("fmhe", fmfg(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl130:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ie.fmex("fmhf", fmfg(int ), (int)30);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl134:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ie.fmex("fmhg", fmfg(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
            }
lbl138:
            // 5 sources

            case 6: {
                var2_2 /* !! */  = (int)ie.fmex("fmhh", fmfg(int ), (int)32);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ie.fmex("fmhi", fmfg(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 8: {
                var2_2 /* !! */  = (int)ie.fmex("fmhj", fmfg(int ), (int)34);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ie.fmex("fmhk", fmfg(int ), (int)35);
                if (!var3_1) ** GOTO lbl138
                throw null;
            }
lbl155:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)ie.fmex("fmhl", fmfg(int ), (int)36);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ie.fmex("fmhm", fmfg(int ), (int)37);
        ** while (!var3_1)
lbl162:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double blocksTo(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fmkd", fmeq(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ie.fmex("fmke", fmfg(int ), (int)94)) break;
            v0 /* !! */  = (long)ie.fmex("fmkf", fmfg(int ), (int)95);
        }
        var4_2 = ie.c;
        v1 /* !! */  = ie.mp;
        if (true) ** GOTO lbl11
        block46: while (true) {
            v1 /* !! */  = (long)(ie.fmex("fmkh", fmeq(int ), (int)30) - ie.fmex("fmkg", fmeq(int ), (int)29));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -421935005: {
                    break block46;
                }
                case 1979793821: {
                    continue block46;
                }
            }
            break;
        }
        var3_3 /* !! */  = ie.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fmki", fmeq(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ie.fmex("fmkj", fmfg(int ), (int)96)) break;
            v2 /* !! */  = (long)ie.fmex("fmkk", fmfg(int ), (int)97);
        }
        var2_4 = ie.a;
        if (var4_2) {
            throw null;
lbl25:
            // 5 sources

            return (double)ie.fmex("fmkm", fmkl(int ), (int)32);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl25
                v3 /* !! */  = ie.mp;
                if (true) ** GOTO lbl35
                block49: while (true) {
                    v3 /* !! */  = (long)(v4 - ie.fmex("fmkn", fmeq(int ), (int)33));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -421935005: {
                            break block49;
                        }
                        case 776415070: {
                            v4 = ie.fmex("fmko", fmeq(int ), (int)34);
                            continue block49;
                        }
                        case 1224238016: {
                            v4 = ie.fmex("fmkp", fmeq(int ), (int)35);
                            continue block49;
                        }
                        case 1270104895: {
                            v4 = ie.fmex("fmkq", fmeq(int ), (int)36);
                            continue block49;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ie.mp;
                if (true) ** GOTO lbl51
                block50: while (true) {
                    v5 /* !! */  = (long)(v6 - ie.fmex("fmkr", fmeq(int ), (int)37));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -872016639: {
                            v6 = ie.fmex("fmks", fmeq(int ), (int)38);
                            continue block50;
                        }
                        case -421935005: {
                            break block50;
                        }
                        case -287185184: {
                            v6 = ie.fmex("fmkt", fmeq(int ), (int)39);
                            continue block50;
                        }
                        case 1826039841: {
                            v6 = ie.fmex("fmku", fmeq(int ), (int)40);
                            continue block50;
                        }
                    }
                    break;
                }
                if (ie.mc.field_1724 == null) ** GOTO lbl67
                if (var2_4) ** GOTO lbl25
                if (var1_1 != null) ** GOTO lbl69
                if (var2_4) ** GOTO lbl25
lbl67:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl25
                return (double)ie.fmex("fmkv", fmkl(int ), (int)41);
lbl69:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fmkw", fmeq(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ie.fmex("fmkx", fmfg(int ), (int)98)) break;
                    v7 /* !! */  = (long)ie.fmex("fmky", fmfg(int ), (int)99);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fmkz", fmeq(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ie.fmex("fmla", fmfg(int ), (int)100)) break;
                    v8 /* !! */  = (long)ie.fmex("fmlb", fmfg(int ), (int)101);
                }
                v9 = ie.mc.field_1724;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ie.mp - ie.fmex("fmlc", fmeq(int ), (int)44)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ie.fmex("fmld", fmfg(int ), (int)102)) break;
                    v10 /* !! */  = (long)ie.fmex("fmle", fmfg(int ), (int)103);
                }
                v11 = v9.method_33571();
                v12 /* !! */  = ie.mp;
                if (true) ** GOTO lbl92
                block54: while (true) {
                    v12 /* !! */  = (long)(v13 - ie.fmex("fmlf", fmeq(int ), (int)45));
lbl92:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1437742371: {
                            v13 = ie.fmex("fmlg", fmeq(int ), (int)46);
                            continue block54;
                        }
                        case -1299242979: {
                            v13 = ie.fmex("fmlh", fmeq(int ), (int)47);
                            continue block54;
                        }
                        case -528892073: {
                            v13 = ie.fmex("fmli", fmeq(int ), (int)48);
                            continue block54;
                        }
                        case -421935005: {
                            break block54;
                        }
                    }
                    break;
                }
                v14 = var1_1.method_73189();
                v15 /* !! */  = ie.mp;
                if (true) ** GOTO lbl109
                block55: while (true) {
                    v15 /* !! */  = (long)(v16 - ie.fmex("fmlk", fmeq(int ), (int)49));
lbl109:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -421935005: {
                            break block55;
                        }
                        case 96536487: {
                            v16 = ie.fmex("fmll", fmeq(int ), (int)50);
                            continue block55;
                        }
                        case 1551497947: {
                            v16 = ie.fmex("fmlm", fmeq(int ), (int)51);
                            continue block55;
                        }
                    }
                    break;
                }
                v17 = (double)var1_1.method_17682() * ie.fmex("fmln", fmkl(int ), (int)52);
                v18 /* !! */  = ie.mp;
                if (true) ** GOTO lbl123
                block56: while (true) {
                    v18 /* !! */  = (long)(v19 - ie.fmex("fmlo", fmeq(int ), (int)53));
lbl123:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1440137946: {
                            v19 = ie.fmex("fmlp", fmeq(int ), (int)54);
                            continue block56;
                        }
                        case -421935005: {
                            break block56;
                        }
                        case -110291184: {
                            v19 = ie.fmex("fmlq", fmeq(int ), (int)55);
                            continue block56;
                        }
                    }
                    break;
                }
                v20 = v14.method_1031(0.0, v17, 0.0);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = ie.mp - ie.fmex("fmlr", fmeq(int ), (int)56)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ie.fmex("fmls", fmfg(int ), (int)104)) break;
                    v21 /* !! */  = (long)ie.fmex("fmlt", fmfg(int ), (int)105);
                }
                return v11.method_1022(v20);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ie.fmex("fmlu", fmfg(int ), (int)106);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl168
                    break;
                }
            }
lbl145:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)ie.fmex("fmlw", fmfg(int ), (int)107);
                } while (!var4_2);
                throw null;
            }
lbl150:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ie.fmex("fmlx", fmfg(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 3: {
                var3_3 /* !! */  = (int)ie.fmex("fmly", fmfg(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 4: {
                var3_3 /* !! */  = (int)ie.fmex("fmlz", fmfg(int ), (int)110);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
lbl164:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)ie.fmex("fmma", fmfg(int ), (int)111);
                if (!var4_2) break;
                throw null;
            }
lbl168:
            // 3 sources

            case 6: {
                do {
                    var3_3 /* !! */  = (int)ie.fmex("fmmb", fmfg(int ), (int)112);
                } while (!var4_2);
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ie.fmex("fmmc", fmfg(int ), (int)113);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)ie.fmex("fmmd", fmfg(int ), (int)114);
                if (!var4_2) ** GOTO lbl164
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)ie.fmex("fmme", fmfg(int ), (int)115);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)ie.fmex("fmmf", fmfg(int ), (int)116);
        ** while (!var4_2)
lbl188:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] fallbackStep(float var1_1, float var2_2, float var3_3, boolean var4_4) {
        block89: {
            block88: {
                block87: {
                    block86: {
                        var15_5 = ie.c;
                        var14_6 /* !! */  = ie.b;
                        var13_7 = ie.a;
                        if (var15_5) {
                            throw null;
lbl6:
                            // 23 sources

                            return null;
                        }
                        if (var13_7 || var13_7) ** GOTO lbl6
                        var5_8 = this.strength();
                        if (var13_7 || var13_7) ** GOTO lbl6
                        var6_9 = this.lerp((float)ie.fmex("fppa", fmfb(int ), (int)526), (float)ie.fmex("fppc", fmfb(int ), (int)527)) * (ie.fmex("fppf", fmfb(int ), (int)528) + var5_8);
                        if (var13_7 || var13_7) ** GOTO lbl6
                        if (this.postHitTicks <= 0) break block86;
                        if (var13_7 || var13_7) ** GOTO lbl6
                        var6_9 *= this.lerp((float)ie.fmex("fppn", fmfb(int ), (int)529), (float)ie.fmex("fppo", fmfb(int ), (int)530));
                        if (var13_7) ** GOTO lbl6
                    }
                    if (var13_7 || var13_7) ** GOTO lbl6
                    if (!var4_4) break block87;
                    if (var13_7 || var13_7) ** GOTO lbl6
                    var6_9 *= this.lerp((float)ie.fmex("fpps", fmfb(int ), (int)531), (float)ie.fmex("fppt", fmfb(int ), (int)532));
                    if (var13_7) ** GOTO lbl6
                }
                if (var13_7 || var13_7) ** GOTO lbl6
                if (!var4_4) break block88;
                if (var13_7) ** GOTO lbl6
                v0 = this.lerp((float)ie.fmex("fppw", fmfb(int ), (int)533), (float)ie.fmex("fppy", fmfb(int ), (int)534));
                if (var15_5) {
                    throw null;
                }
                break block89;
            }
            if (var13_7 || var13_7) ** GOTO lbl6
            v0 = var7_10 = this.lerp((float)ie.fmex("fpqc", fmfb(int ), (int)535), (float)ie.fmex("fpqk", fmfb(int ), (int)536));
        }
        if (var13_7 || var13_7) ** GOTO lbl6
        var8_11 = class_3532.method_15363((float)(var1_1 * var6_9), (float)(-var7_10), (float)var7_10);
        if (var13_7 || var13_7) ** GOTO lbl6
        var9_12 = class_3532.method_15363((float)(var2_2 * var6_9 * this.lerp((float)ie.fmex("fpqs", fmfb(int ), (int)537), (float)ie.fmex("fpqt", fmfb(int ), (int)538))), (float)(-var7_10 * ie.fmex("fpqw", fmfb(int ), (int)539)), (float)(var7_10 * ie.fmex("fpqx", fmfb(int ), (int)540)));
        if (var13_7 || var13_7) ** GOTO lbl6
        var10_13 = (float)Math.hypot(var8_11, var9_12);
        if (var13_7 || var13_7) ** GOTO lbl6
        var11_14 = Math.min(var7_10, var3_3 * ie.fmex("fprb", fmfb(int ), (int)541));
        if (var13_7) ** GOTO lbl6
        if (var14_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_7) ** GOTO lbl6
                if (!(var10_13 > var11_14)) ** GOTO lbl58
                if (var13_7) ** GOTO lbl6
                if (!(var10_13 > ie.fmex("fpre", fmfb(int ), (int)542))) ** GOTO lbl58
                if (var13_7 || var13_7) ** GOTO lbl6
                var12_15 = var11_14 / var10_13;
                if (var13_7 || var13_7) ** GOTO lbl6
                var8_11 *= var12_15;
                if (var13_7 || var13_7) ** GOTO lbl6
                var9_12 *= var12_15;
                if (var13_7) ** GOTO lbl6
lbl58:
                // 3 sources

                if (!var13_7 && !var13_7) ** break;
                ** continue;
                return new float[]{var8_11, var9_12};
            }
            case 0: {
                var14_6 /* !! */  = (int)ie.fmex("fpru", fmfg(int ), (int)543);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 1: {
                var14_6 /* !! */  = (int)ie.fmex("fprx", fmfg(int ), (int)544);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl71:
            // 3 sources

            case 2: {
                var14_6 /* !! */  = (int)ie.fmex("fprz", fmfg(int ), (int)545);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 3: {
                var14_6 /* !! */  = (int)ie.fmex("fpsm", fmfg(int ), (int)546);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl81:
            // 2 sources

            case 4: {
                var14_6 /* !! */  = (int)ie.fmex("fpsn", fmfg(int ), (int)547);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl105
            }
            case 5: {
                var14_6 /* !! */  = (int)ie.fmex("fpsp", fmfg(int ), (int)548);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl91:
            // 2 sources

            case 6: {
                var14_6 /* !! */  = (int)ie.fmex("fpss", fmfg(int ), (int)549);
                if (var15_5) {
                    throw null;
                }
            }
lbl95:
            // 5 sources

            case 7: {
                var14_6 /* !! */  = (int)ie.fmex("fpsv", fmfg(int ), (int)550);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl100:
            // 2 sources

            case 8: {
                var14_6 /* !! */  = (int)ie.fmex("fpta", fmfg(int ), (int)551);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl105:
            // 4 sources

            case 9: {
                var14_6 /* !! */  = (int)ie.fmex("fpti", fmfg(int ), (int)552);
                if (!var15_5) ** GOTO lbl95
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_6 /* !! */  = (int)ie.fmex("fpto", fmfg(int ), (int)553);
                    if (var15_5) {
                        throw null;
                    }
                    ** GOTO lbl162
                    break;
                }
            }
            case 11: {
                var14_6 /* !! */  = (int)ie.fmex("fptp", fmfg(int ), (int)554);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 12: {
                var14_6 /* !! */  = (int)ie.fmex("fptq", fmfg(int ), (int)555);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl125:
            // 2 sources

            case 13: {
                var14_6 /* !! */  = (int)ie.fmex("fptu", fmfg(int ), (int)556);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl130:
            // 2 sources

            case 14: {
                var14_6 /* !! */  = (int)ie.fmex("fptx", fmfg(int ), (int)557);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl135:
            // 3 sources

            case 15: {
                var14_6 /* !! */  = (int)ie.fmex("fpua", fmfg(int ), (int)558);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl140:
            // 4 sources

            case 16: {
                var14_6 /* !! */  = (int)ie.fmex("fpun", fmfg(int ), (int)559);
                if (!var15_5) ** GOTO lbl91
                throw null;
            }
lbl144:
            // 2 sources

            case 17: {
                var14_6 /* !! */  = (int)ie.fmex("fpuo", fmfg(int ), (int)560);
                if (!var15_5) ** GOTO lbl81
                throw null;
            }
lbl148:
            // 2 sources

            case 18: {
                var14_6 /* !! */  = (int)ie.fmex("fpur", fmfg(int ), (int)561);
                if (!var15_5) ** GOTO lbl105
                throw null;
            }
lbl152:
            // 2 sources

            case 19: {
                var14_6 /* !! */  = (int)ie.fmex("fpuv", fmfg(int ), (int)562);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 20: {
                var14_6 /* !! */  = (int)ie.fmex("fpva", fmfg(int ), (int)563);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl162:
            // 3 sources

            case 21: {
                var14_6 /* !! */  = (int)ie.fmex("fpvd", fmfg(int ), (int)564);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl167:
            // 2 sources

            case 22: {
                var14_6 /* !! */  = (int)ie.fmex("fpvf", fmfg(int ), (int)565);
                if (!var15_5) ** GOTO lbl100
                throw null;
            }
lbl171:
            // 2 sources

            case 23: {
                var14_6 /* !! */  = (int)ie.fmex("fpvs", fmfg(int ), (int)566);
                if (!var15_5) ** GOTO lbl140
                throw null;
            }
lbl175:
            // 2 sources

            case 24: {
                var14_6 /* !! */  = (int)ie.fmex("fpvy", fmfg(int ), (int)567);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl180:
            // 2 sources

            case 25: {
                var14_6 /* !! */  = (int)ie.fmex("fpwb", fmfg(int ), (int)568);
                if (!var15_5) ** GOTO lbl95
                throw null;
            }
lbl184:
            // 4 sources

            case 26: {
                var14_6 /* !! */  = (int)ie.fmex("fpwf", fmfg(int ), (int)569);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl189:
            // 3 sources

            case 27: {
                var14_6 /* !! */  = (int)ie.fmex("fpwj", fmfg(int ), (int)570);
                if (!var15_5) ** GOTO lbl144
                throw null;
            }
            case 28: {
                var14_6 /* !! */  = (int)ie.fmex("fpwm", fmfg(int ), (int)571);
                if (!var15_5) ** GOTO lbl184
                throw null;
            }
lbl197:
            // 2 sources

            case 29: {
                do {
                    var14_6 /* !! */  = (int)ie.fmex("fpwq", fmfg(int ), (int)572);
                } while (!var15_5);
                throw null;
            }
            case 30: {
                var14_6 /* !! */  = (int)ie.fmex("fpww", fmfg(int ), (int)573);
                if (!var15_5) ** GOTO lbl125
                throw null;
            }
            case 31: {
                var14_6 /* !! */  = (int)ie.fmex("fpxa", fmfg(int ), (int)574);
                if (var15_5) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 32: {
                var14_6 /* !! */  = (int)ie.fmex("fpxe", fmfg(int ), (int)575);
                if (!var15_5) ** GOTO lbl71
                throw null;
            }
            case 33: {
                var14_6 /* !! */  = (int)ie.fmex("fpxf", fmfg(int ), (int)576);
                if (!var15_5) ** GOTO lbl162
                throw null;
            }
lbl219:
            // 2 sources

            case 34: {
                var14_6 /* !! */  = (int)ie.fmex("fpxg", fmfg(int ), (int)577);
                if (var15_5) {
                    throw null;
                }
            }
lbl223:
            // 5 sources

            case 35: {
                var14_6 /* !! */  = (int)ie.fmex("fpxi", fmfg(int ), (int)578);
                if (!var15_5) ** GOTO lbl135
                throw null;
            }
            case 36: {
                var14_6 /* !! */  = (int)ie.fmex("fpxm", fmfg(int ), (int)579);
                if (!var15_5) ** GOTO lbl180
                throw null;
            }
lbl231:
            // 2 sources

            case 37: {
                var14_6 /* !! */  = (int)ie.fmex("fpxr", fmfg(int ), (int)580);
                if (!var15_5) ** GOTO lbl189
                throw null;
            }
            case 38: {
                var14_6 /* !! */  = (int)ie.fmex("fpxv", fmfg(int ), (int)581);
                if (!var15_5) ** GOTO lbl71
                throw null;
            }
lbl239:
            // 2 sources

            case 39: {
                var14_6 /* !! */  = (int)ie.fmex("fpxx", fmfg(int ), (int)582);
                if (!var15_5) ** GOTO lbl223
                throw null;
            }
lbl243:
            // 2 sources

            case 40: {
                var14_6 /* !! */  = (int)ie.fmex("fpxz", fmfg(int ), (int)583);
                if (!var15_5) ** GOTO lbl184
                throw null;
            }
            case 41: 
        }
        var14_6 /* !! */  = (int)ie.fmex("fpyc", fmfg(int ), (int)584);
        ** while (!var15_5)
lbl250:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fryl() {
        ie.fmfe[600] = 976164279;
        ie.fmfe[601] = 1012463436;
        ie.fmfe[602] = 1107318846;
        ie.fmfe[603] = 870818100;
        ie.fmfe[604] = 1680028812;
        ie.fmfe[605] = -1486376227;
        ie.fmfe[606] = -397294324;
        ie.fmfe[607] = -1064802436;
        ie.fmfe[608] = 483867736;
        ie.fmfe[609] = -301759100;
        ie.fmfe[610] = 588716762;
        ie.fmfe[611] = -1040982707;
        ie.fmfe[612] = -1333375112;
        ie.fmfe[613] = 725466537;
        ie.fmfe[614] = 1902941674;
        ie.fmfe[615] = 1800450651;
        ie.fmfe[616] = 403651689;
        ie.fmfe[617] = 248186497;
        ie.fmfe[618] = 184632273;
        ie.fmfe[619] = 448705908;
        ie.fmfe[620] = 1546508409;
        ie.fmfe[621] = 1507638963;
        ie.fmfe[622] = 1671970630;
        ie.fmfe[623] = -648165948;
        ie.fmfe[624] = -1209871935;
        ie.fmfe[625] = -253323970;
        ie.fmfe[626] = -1583262403;
        ie.fmfe[627] = -2097408940;
        ie.fmfe[628] = -365810606;
        ie.fmfe[629] = 1378259097;
        ie.fmfe[630] = 421422900;
        ie.fmfe[631] = -1314358829;
        ie.fmfe[632] = 87023277;
        ie.fmfe[633] = -444341221;
        ie.fmfe[634] = -234086709;
        ie.fmfe[635] = -1980898151;
        ie.fmfe[636] = -1412087431;
        ie.fmfe[637] = 616249245;
        ie.fmfe[638] = 1316603546;
        ie.fmfe[639] = 491332328;
        ie.fmfe[640] = 1083262575;
        ie.fmfe[641] = 1091913053;
        ie.fmfe[642] = 828726334;
        ie.fmfe[643] = 163220852;
        ie.fmfe[644] = 1597024920;
        ie.fmfe[645] = 139391524;
        ie.fmfe[646] = -194105419;
        ie.fmfe[647] = -882289115;
        ie.fmfe[648] = -321218630;
        ie.fmfe[649] = 455623595;
        ie.fmfe[650] = -801004565;
        ie.fmfe[651] = 1751547674;
        ie.fmfe[652] = -1817089777;
        ie.fmfe[653] = 1870780730;
        ie.fmfe[654] = 750445716;
        ie.fmfe[655] = -2097562127;
        ie.fmfe[656] = 477005624;
        ie.fmfe[657] = -599340398;
        ie.fmfe[658] = -2081970884;
        ie.fmfe[659] = -993865915;
        ie.fmfe[660] = 1917554544;
        ie.fmfe[661] = 2027622669;
        ie.fmfe[662] = 1538342299;
        ie.fmfe[663] = 278789751;
        ie.fmfe[664] = 1408907780;
        ie.fmfe[665] = -1163600126;
        ie.fmfe[666] = -2046118098;
        ie.fmfe[667] = 316859825;
        ie.fmfe[668] = -1701858302;
        ie.fmfe[669] = -473331346;
        ie.fmfe[670] = -1669750782;
        ie.fmfe[671] = -75453912;
        ie.fmfe[672] = 1549754416;
        ie.fmfe[673] = -593696816;
        ie.fmfe[674] = -1025984814;
        ie.fmfe[675] = 1273706656;
        ie.fmfe[676] = 17576768;
        ie.fmfe[677] = 1875660371;
        ie.fmfe[678] = -1282358188;
        ie.fmfe[679] = 1342260789;
        ie.fmfe[680] = 215424833;
        ie.fmfe[681] = -163805646;
        ie.fmfe[682] = 242562511;
        ie.fmfe[683] = -1119151785;
        ie.fmfe[684] = 514081367;
        ie.fmfe[685] = 1294231639;
        ie.fmfe[686] = -801682191;
        ie.fmfe[687] = -76652779;
        ie.fmfe[688] = 1838664878;
        ie.fmfe[689] = -580649402;
        ie.fmfe[690] = -1002702626;
        ie.fmfe[691] = 867405983;
        ie.fmfe[692] = 1271321003;
        ie.fmfe[693] = 280120633;
        ie.fmfe[694] = 181251212;
        ie.fmfe[695] = -1472353019;
        ie.fmfe[696] = -1836615580;
        ie.fmfe[697] = -1103482997;
        ie.fmfe[698] = 1667548749;
        ie.fmfe[699] = 912083780;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onTargetLost() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fmhn", fmeq(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ie.fmex("fmho", fmfg(int ), (int)38)) break;
            v0 /* !! */  = (long)ie.fmex("fmhp", fmfg(int ), (int)39);
        }
        var3_1 = ie.c;
        v1 /* !! */  = ie.mp;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(ie.fmex("fmhr", fmeq(int ), (int)21) - ie.fmex("fmhq", fmeq(int ), (int)20));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -421935005: {
                    break block19;
                }
                case 743258800: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = ie.b;
        v2 /* !! */  = ie.mp;
        if (true) ** GOTO lbl21
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - ie.fmex("fmhs", fmeq(int ), (int)22));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1695383918: {
                    v3 = ie.fmex("fmht", fmeq(int ), (int)23);
                    continue block20;
                }
                case -421935005: {
                    break block20;
                }
                case 1319685425: {
                    v3 = ie.fmex("fmhu", fmeq(int ), (int)24);
                    continue block20;
                }
                case 2123459336: {
                    v3 = ie.fmex("fmhv", fmeq(int ), (int)25);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = ie.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl39:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fmhw", fmeq(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ie.fmex("fmhx", fmfg(int ), (int)40)) break;
                    v4 /* !! */  = (long)ie.fmex("fmhy", fmfg(int ), (int)41);
                }
                this.resetState();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ie.fmex("fmhz", fmfg(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ie.fmex("fmia", fmfg(int ), (int)43);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ie.fmex("fmib", fmfg(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ie.fmex("fmic", fmfg(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
lbl69:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)ie.fmex("fmid", fmfg(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)ie.fmex("fmie", fmfg(int ), (int)47);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float hitRadius(class_1297 var1_1, double var2_2) {
        block73: {
            v0 /* !! */  = ie.mp;
            if (true) ** GOTO lbl5
            block48: while (true) {
                v0 /* !! */  = (long)(v1 - ie.fmex("fmmg", fmeq(int ), (int)57));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -421935005: {
                        break block48;
                    }
                    case -300876860: {
                        v1 = ie.fmex("fmmh", fmeq(int ), (int)58);
                        continue block48;
                    }
                    case 626973972: {
                        v1 = ie.fmex("fmmi", fmeq(int ), (int)59);
                        continue block48;
                    }
                    case 690767860: {
                        v1 = ie.fmex("fmmj", fmeq(int ), (int)60);
                        continue block48;
                    }
                }
                break;
            }
            var10_3 = ie.c;
            v2 /* !! */  = ie.mp;
            if (true) ** GOTO lbl22
            block49: while (true) {
                v2 /* !! */  = (long)(ie.fmex("fmml", fmeq(int ), (int)62) - ie.fmex("fmmk", fmeq(int ), (int)61));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -421935005: {
                        break block49;
                    }
                    case -374169072: {
                        continue block49;
                    }
                }
                break;
            }
            var9_4 /* !! */  = ie.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("fmmm", fmeq(int ), (int)63)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ie.fmex("fmmn", fmfg(int ), (int)117)) break;
                v3 /* !! */  = (long)ie.fmex("fmmo", fmfg(int ), (int)118);
            }
            var8_5 = ie.a;
            if (var10_3) {
                throw null;
lbl36:
                // 6 sources

                return (float)ie.fmex("fmmp", fmfb(int ), (int)119);
            }
            if (var8_5 || var8_5) ** GOTO lbl36
            if (var1_1 != null) break block73;
            if (var8_5) ** GOTO lbl36
            return (float)ie.fmex("fmmq", fmfb(int ), (int)120);
        }
        if (var8_5 || var8_5) ** GOTO lbl36
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = ie.fmex("fmmr", fmkl(int ), (int)64);
                v5 /* !! */  = ie.mp;
                if (true) ** GOTO lbl52
                block52: while (true) {
                    v5 /* !! */  = (long)(v6 - ie.fmex("fmms", fmeq(int ), (int)65));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1406777387: {
                            v6 = ie.fmex("fmmt", fmeq(int ), (int)66);
                            continue block52;
                        }
                        case -890462978: {
                            v6 = ie.fmex("fmmu", fmeq(int ), (int)67);
                            continue block52;
                        }
                        case -421935005: {
                            break block52;
                        }
                        case 974644394: {
                            v6 = ie.fmex("fmmv", fmeq(int ), (int)68);
                            continue block52;
                        }
                    }
                    break;
                }
                var4_6 = Math.max((double)v4, var2_2);
                if (var8_5 || var8_5) ** GOTO lbl36
                v7 /* !! */  = ie.mp;
                if (true) ** GOTO lbl70
                block53: while (true) {
                    v7 /* !! */  = (long)(ie.fmex("fmmx", fmeq(int ), (int)70) - ie.fmex("fmmw", fmeq(int ), (int)69));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1831914183: {
                            continue block53;
                        }
                        case -421935005: {
                            break block53;
                        }
                    }
                    break;
                }
                v8 = (double)var1_1.method_17681() * ie.fmex("fmmy", fmkl(int ), (int)71) / var4_6;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("fmna", fmeq(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ie.fmex("fmnb", fmfg(int ), (int)121)) break;
                    v9 /* !! */  = (long)ie.fmex("fmnc", fmfg(int ), (int)122);
                }
                v10 = Math.atan(v8);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ie.mp - ie.fmex("fmnd", fmeq(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ie.fmex("fmne", fmfg(int ), (int)123)) break;
                    v11 /* !! */  = (long)ie.fmex("fmnf", fmfg(int ), (int)124);
                }
                var6_7 = (float)Math.toDegrees(v10);
                if (var8_5 || var8_5) ** GOTO lbl36
                v12 /* !! */  = ie.mp;
                if (true) ** GOTO lbl93
                block56: while (true) {
                    v12 /* !! */  = (long)(ie.fmex("fmnh", fmeq(int ), (int)75) - ie.fmex("fmng", fmeq(int ), (int)74));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -421935005: {
                            break block56;
                        }
                        case 1132323538: {
                            continue block56;
                        }
                    }
                    break;
                }
                v13 = (double)var1_1.method_17682() * ie.fmex("fmni", fmkl(int ), (int)76) / var4_6;
                v14 /* !! */  = ie.mp;
                if (true) ** GOTO lbl103
                block57: while (true) {
                    v14 /* !! */  = (long)(ie.fmex("fmnk", fmeq(int ), (int)78) - ie.fmex("fmnj", fmeq(int ), (int)77));
lbl103:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1161368579: {
                            continue block57;
                        }
                        case -421935005: {
                            break block57;
                        }
                    }
                    break;
                }
                v15 = Math.atan(v13);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = ie.mp - ie.fmex("fmnl", fmeq(int ), (int)79)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ie.fmex("fmnm", fmfg(int ), (int)125)) break;
                    v16 /* !! */  = (long)ie.fmex("fmnn", fmfg(int ), (int)126);
                }
                var7_8 = (float)Math.toDegrees(v15);
                if (!var8_5 && !var8_5) ** break;
                ** continue;
                v17 /* !! */  = ie.mp;
                if (true) ** GOTO lbl121
                block59: while (true) {
                    v17 /* !! */  = (long)(ie.fmex("fmnp", fmeq(int ), (int)81) - ie.fmex("fmno", fmeq(int ), (int)80));
lbl121:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -421935005: {
                            break block59;
                        }
                        case 959414448: {
                            continue block59;
                        }
                    }
                    break;
                }
                v18 = Math.min(var6_7, var7_8) * ie.fmex("fmnq", fmfb(int ), (int)127);
                v19 = ie.fmex("fmnr", fmfb(int ), (int)128);
                v20 = ie.fmex("fmns", fmfb(int ), (int)129);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = ie.mp - ie.fmex("fmnt", fmeq(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ie.fmex("fmnu", fmfg(int ), (int)130)) break;
                    v21 /* !! */  = (long)ie.fmex("fmnv", fmfg(int ), (int)131);
                }
                return class_3532.method_15363((float)v18, (float)v19, (float)v20);
            }
lbl135:
            // 4 sources

            case 0: {
                var9_4 /* !! */  = (int)ie.fmex("fmnw", fmfg(int ), (int)132);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 1: {
                var9_4 /* !! */  = (int)ie.fmex("fmny", fmfg(int ), (int)133);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl145:
            // 3 sources

            case 2: {
                var9_4 /* !! */  = (int)ie.fmex("fmnz", fmfg(int ), (int)134);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl150:
            // 2 sources

            case 3: {
                var9_4 /* !! */  = (int)ie.fmex("fmoa", fmfg(int ), (int)135);
                if (!var10_3) ** GOTO lbl135
                throw null;
            }
            case 4: {
                var9_4 /* !! */  = (int)ie.fmex("fmob", fmfg(int ), (int)136);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl159:
            // 2 sources

            case 5: {
                var9_4 /* !! */  = (int)ie.fmex("fmoc", fmfg(int ), (int)137);
                if (!var10_3) ** GOTO lbl135
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)ie.fmex("fmod", fmfg(int ), (int)138);
                    if (!var10_3) ** GOTO lbl145
                    throw null;
                }
            }
            case 7: {
                var9_4 /* !! */  = (int)ie.fmex("fmoe", fmfg(int ), (int)139);
                if (!var10_3) ** GOTO lbl135
                throw null;
            }
lbl172:
            // 2 sources

            case 8: {
                do {
                    var9_4 /* !! */  = (int)ie.fmex("fmof", fmfg(int ), (int)140);
                } while (!var10_3);
                throw null;
            }
            case 9: {
                var9_4 /* !! */  = (int)ie.fmex("fmog", fmfg(int ), (int)141);
                if (!var10_3) ** GOTO lbl145
                throw null;
            }
            case 10: {
                var9_4 /* !! */  = (int)ie.fmex("fmoh", fmfg(int ), (int)142);
                if (var10_3) {
                    throw null;
                }
            }
lbl185:
            // 4 sources

            case 11: {
                var9_4 /* !! */  = (int)ie.fmex("fmoi", fmfg(int ), (int)143);
                if (!var10_3) ** GOTO lbl159
                throw null;
            }
lbl189:
            // 3 sources

            case 12: {
                var9_4 /* !! */  = (int)ie.fmex("fmoj", fmfg(int ), (int)144);
                if (!var10_3) ** GOTO lbl150
                throw null;
            }
            case 13: 
        }
        var9_4 /* !! */  = (int)ie.fmex("fmok", fmfg(int ), (int)145);
        ** while (!var10_3)
lbl196:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float lerp(float var1_1, float var2_2) {
        v0 /* !! */  = ie.mp;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - ie.fmex("frwe", fmeq(int ), (int)274));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -421935005: {
                    break block22;
                }
                case 783888932: {
                    v1 = ie.fmex("frwf", fmeq(int ), (int)275);
                    continue block22;
                }
                case 2034982156: {
                    v1 = ie.fmex("frwg", fmeq(int ), (int)276);
                    continue block22;
                }
            }
            break;
        }
        var5_3 = ie.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ie.mp - ie.fmex("frwh", fmeq(int ), (int)277)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ie.fmex("frwi", fmfg(int ), (int)874)) break;
            v2 /* !! */  = (long)ie.fmex("frwj", fmfg(int ), (int)875);
        }
        var4_4 /* !! */  = ie.b;
        v3 /* !! */  = ie.mp;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - ie.fmex("frwk", fmeq(int ), (int)278));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -941546424: {
                    v4 = ie.fmex("frwl", fmeq(int ), (int)279);
                    continue block24;
                }
                case -421935005: {
                    break block24;
                }
                case -170987233: {
                    v4 = ie.fmex("frwm", fmeq(int ), (int)280);
                    continue block24;
                }
                case 1890820614: {
                    v4 = ie.fmex("frwn", fmeq(int ), (int)281);
                    continue block24;
                }
            }
            break;
        }
        var3_5 = ie.a;
        if (var5_3) {
            throw null;
lbl41:
            // 2 sources

            return (float)ie.fmex("frwo", fmfb(int ), (int)876);
        }
        if (var3_5) ** GOTO lbl41
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ie.mp - ie.fmex("frwp", fmeq(int ), (int)282)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ie.fmex("frwr", fmfg(int ), (int)877)) break;
                    v5 /* !! */  = (long)ie.fmex("frws", fmfg(int ), (int)878);
                }
                v6 /* !! */  = ie.mp;
                if (true) ** GOTO lbl58
                block27: while (true) {
                    v6 /* !! */  = (long)(v7 - ie.fmex("frwt", fmeq(int ), (int)283));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1078884690: {
                            v7 = ie.fmex("frwu", fmeq(int ), (int)284);
                            continue block27;
                        }
                        case -421935005: {
                            break block27;
                        }
                        case 911574303: {
                            v7 = ie.fmex("frwv", fmeq(int ), (int)285);
                            continue block27;
                        }
                    }
                    break;
                }
                return var1_1 + this.random.nextFloat() * (var2_2 - var1_1);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ie.fmex("frww", fmfg(int ), (int)879);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl78
                    break;
                }
            }
            case 1: {
                var4_4 /* !! */  = (int)ie.fmex("frwx", fmfg(int ), (int)880);
                if (var5_3) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 2: {
                var4_4 /* !! */  = (int)ie.fmex("frwz", fmfg(int ), (int)881);
                if (!var5_3) break;
                throw null;
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)ie.fmex("frxa", fmfg(int ), (int)882);
        ** while (!var5_3)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frxx() {
        ie.fmfd[300] = -1841910652;
        ie.fmfd[301] = -1326284829;
        ie.fmfd[302] = -148889477;
        ie.fmfd[303] = -656713004;
        ie.fmfd[304] = -1150609194;
        ie.fmfd[305] = -336030171;
        ie.fmfd[306] = -1963582952;
        ie.fmfd[307] = -971810642;
        ie.fmfd[308] = 719224858;
        ie.fmfd[309] = 1225439178;
        ie.fmfd[310] = 176734741;
        ie.fmfd[311] = 2103129742;
        ie.fmfd[312] = -710579795;
        ie.fmfd[313] = 992533251;
        ie.fmfd[314] = -1266527703;
        ie.fmfd[315] = 1694540718;
        ie.fmfd[316] = 1605739815;
        ie.fmfd[317] = 35923358;
        ie.fmfd[318] = 1786501112;
        ie.fmfd[319] = 776423046;
        ie.fmfd[320] = 599030699;
        ie.fmfd[321] = -1316055239;
        ie.fmfd[322] = -168072766;
        ie.fmfd[323] = -2015011717;
        ie.fmfd[324] = -589676697;
        ie.fmfd[325] = -1118322595;
        ie.fmfd[326] = 1441722835;
        ie.fmfd[327] = -1089886540;
        ie.fmfd[328] = 563736325;
        ie.fmfd[329] = -768527235;
        ie.fmfd[330] = -1923918400;
        ie.fmfd[331] = 440400434;
        ie.fmfd[332] = -1921850021;
        ie.fmfd[333] = 878412419;
        ie.fmfd[334] = -1503583967;
        ie.fmfd[335] = -1021709894;
        ie.fmfd[336] = 608024472;
        ie.fmfd[337] = 1848048443;
        ie.fmfd[338] = 1368717141;
        ie.fmfd[339] = 1037400725;
        ie.fmfd[340] = 816107317;
        ie.fmfd[341] = -1098808668;
        ie.fmfd[342] = 1987798679;
        ie.fmfd[343] = -2121051645;
        ie.fmfd[344] = 1703699944;
        ie.fmfd[345] = 429732518;
        ie.fmfd[346] = -896731948;
        ie.fmfd[347] = -867454725;
        ie.fmfd[348] = 372559579;
        ie.fmfd[349] = 810654631;
        ie.fmfd[350] = -1176473902;
        ie.fmfd[351] = -607151509;
        ie.fmfd[352] = -702720579;
        ie.fmfd[353] = -1105141105;
        ie.fmfd[354] = -466017675;
        ie.fmfd[355] = -495563196;
        ie.fmfd[356] = 565935787;
        ie.fmfd[357] = -1191204941;
        ie.fmfd[358] = -1622826302;
        ie.fmfd[359] = -1013598103;
        ie.fmfd[360] = -256719011;
        ie.fmfd[361] = -685608682;
        ie.fmfd[362] = 950072038;
        ie.fmfd[363] = -1389346131;
        ie.fmfd[364] = 651289204;
        ie.fmfd[365] = 866141463;
        ie.fmfd[366] = 169837742;
        ie.fmfd[367] = 96967329;
        ie.fmfd[368] = 40235986;
        ie.fmfd[369] = 599694621;
        ie.fmfd[370] = 1781947660;
        ie.fmfd[371] = 1656512459;
        ie.fmfd[372] = -391198230;
        ie.fmfd[373] = -885116553;
        ie.fmfd[374] = 686514207;
        ie.fmfd[375] = 441657204;
        ie.fmfd[376] = 2045527718;
        ie.fmfd[377] = 1189295756;
        ie.fmfd[378] = -435658183;
        ie.fmfd[379] = -1348087607;
        ie.fmfd[380] = 59183334;
        ie.fmfd[381] = -1515048794;
        ie.fmfd[382] = 2090878738;
        ie.fmfd[383] = 322629801;
        ie.fmfd[384] = -654617536;
        ie.fmfd[385] = 1751736710;
        ie.fmfd[386] = 2059250681;
        ie.fmfd[387] = 1326173444;
        ie.fmfd[388] = 412264533;
        ie.fmfd[389] = 1163888324;
        ie.fmfd[390] = -175021630;
        ie.fmfd[391] = -440011600;
        ie.fmfd[392] = -355957165;
        ie.fmfd[393] = -607746017;
        ie.fmfd[394] = -371945435;
        ie.fmfd[395] = 562147363;
        ie.fmfd[396] = 1062341047;
        ie.fmfd[397] = -965279947;
        ie.fmfd[398] = 1022069919;
        ie.fmfd[399] = 1106695512;
    }
}

