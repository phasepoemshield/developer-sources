/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class oc {
    private boolean stopSprint;
    private static int[] mdjo;
    public static final int b;
    private int preSwapDelayMin;
    private boolean stopMovement;
    public static final int REALLY_WORLD_DELAY_MS = 45;
    private int waitStopDelayMax;
    private int postSwapDelayMax;
    private int preStopDelayMin;
    public static final boolean a;
    private int waitStopDelayMin;
    public static final boolean c;
    private static long[] mdkf;
    private int resumeDelayMax;
    private static int[] mdjn;
    private int preStopDelayMax;
    private static long[] mdkg;
    private boolean closeInventory;
    private int preSwapDelayMax;
    private int minimumStopDelay;
    public static final long vb = 7053870449861603428L;
    private int postSwapDelayMin;
    private double velocityThreshold;
    private int resumeDelayMin;

    private static /* synthetic */ void mehd() {
        oc.mdkg[200] = -3409719191165909010L;
        oc.mdkg[201] = 6685342982711677046L;
        oc.mdkg[202] = 1984085870435002770L;
        oc.mdkg[203] = -9125962881091459010L;
        oc.mdkg[204] = -6788114592937905527L;
        oc.mdkg[205] = -3312305427092473885L;
        oc.mdkg[206] = 1778318928722585481L;
        oc.mdkg[207] = 6865021925255249894L;
        oc.mdkg[208] = -1317569352000277691L;
        oc.mdkg[209] = 2035125605170930001L;
        oc.mdkg[210] = 133597858934062502L;
        oc.mdkg[211] = -2003105567149637676L;
        oc.mdkg[212] = -1664054373107599107L;
        oc.mdkg[213] = 1318806455650483758L;
        oc.mdkg[214] = 3425167235667550961L;
        oc.mdkg[215] = -3149635204305076506L;
        oc.mdkg[216] = -4265285440071685531L;
        oc.mdkg[217] = 4215680175762292456L;
        oc.mdkg[218] = 1090773276225710393L;
        oc.mdkg[219] = 4221924393442145943L;
        oc.mdkg[220] = -1943499043586870628L;
        oc.mdkg[221] = 2626766717685848341L;
        oc.mdkg[222] = -264165492845584504L;
        oc.mdkg[223] = 1668274782959532929L;
        oc.mdkg[224] = 8111633232124492568L;
        oc.mdkg[225] = -2519010505666102611L;
        oc.mdkg[226] = 6857531784700595058L;
        oc.mdkg[227] = 8272483438853899548L;
        oc.mdkg[228] = -2348468121578400674L;
        oc.mdkg[229] = 6256730557993203697L;
        oc.mdkg[230] = 3650990422986766168L;
        oc.mdkg[231] = 4045845162976433286L;
        oc.mdkg[232] = 484123575595372948L;
        oc.mdkg[233] = -5185352883319673351L;
        oc.mdkg[234] = -8365327356467259922L;
        oc.mdkg[235] = 5772655989293448922L;
        oc.mdkg[236] = -9218035948350370158L;
        oc.mdkg[237] = 806190088436775046L;
        oc.mdkg[238] = -3836512066906943583L;
        oc.mdkg[239] = -1196166804337986064L;
        oc.mdkg[240] = 9141085156825857387L;
        oc.mdkg[241] = 1126471457541773814L;
        oc.mdkg[242] = 7466913638011626006L;
        oc.mdkg[243] = 7075970481672348029L;
        oc.mdkg[244] = 348918895160735515L;
        oc.mdkg[245] = 6275927059484412375L;
        oc.mdkg[246] = 3020356991103132220L;
        oc.mdkg[247] = 6411031672176992205L;
        oc.mdkg[248] = -6655335653412067693L;
        oc.mdkg[249] = -8935776303218734349L;
        oc.mdkg[250] = 3386557102224019257L;
        oc.mdkg[251] = 542227347467764038L;
        oc.mdkg[252] = -6433473571873679633L;
        oc.mdkg[253] = 1413754786691791700L;
        oc.mdkg[254] = 1296096032346716923L;
        oc.mdkg[255] = 819509674365135159L;
        oc.mdkg[256] = -927244900824586988L;
        oc.mdkg[257] = -5989521495378669447L;
        oc.mdkg[258] = 3036223215244188369L;
        oc.mdkg[259] = -8335098751883260722L;
        oc.mdkg[260] = -8086682936013144162L;
        oc.mdkg[261] = -9155918201575515959L;
        oc.mdkg[262] = -5246075182432299177L;
        oc.mdkg[263] = -1746174190688482380L;
        oc.mdkg[264] = -1079495420600553037L;
        oc.mdkg[265] = 400131862413463208L;
        oc.mdkg[266] = 8243041055406939097L;
        oc.mdkg[267] = 674498279490673080L;
        oc.mdkg[268] = -2119521164699432509L;
        oc.mdkg[269] = 8677136001471309432L;
        oc.mdkg[270] = -8059827755891048006L;
        oc.mdkg[271] = 8815950299852263116L;
        oc.mdkg[272] = -2480733384276718829L;
        oc.mdkg[273] = 6242343997535067717L;
        oc.mdkg[274] = 1695765447138721639L;
        oc.mdkg[275] = -62215081279804985L;
        oc.mdkg[276] = 708076392040047131L;
    }

    static {
        mdjn = new int[317];
        mdjo = new int[317];
        oc.megq();
        oc.megr();
        oc.megs();
        oc.megt();
        oc.megu();
        oc.megv();
        oc.megw();
        oc.megx();
        mdkf = new long[277];
        mdkg = new long[277];
        oc.megy();
        oc.megz();
        oc.meha();
        oc.mehb();
        oc.mehc();
        oc.mehd();
    }

    private static /* synthetic */ void megr() {
        oc.mdjn[100] = -70981651;
        oc.mdjn[101] = -1813548463;
        oc.mdjn[102] = 1025818356;
        oc.mdjn[103] = 2114284233;
        oc.mdjn[104] = -1483285326;
        oc.mdjn[105] = 1311449827;
        oc.mdjn[106] = 140592780;
        oc.mdjn[107] = -1656423581;
        oc.mdjn[108] = -1168746255;
        oc.mdjn[109] = 828853883;
        oc.mdjn[110] = -814630638;
        oc.mdjn[111] = 657957302;
        oc.mdjn[112] = 424865139;
        oc.mdjn[113] = -980059895;
        oc.mdjn[114] = 1877903523;
        oc.mdjn[115] = 1728852440;
        oc.mdjn[116] = -1562001803;
        oc.mdjn[117] = -1040679145;
        oc.mdjn[118] = 164087304;
        oc.mdjn[119] = 904124609;
        oc.mdjn[120] = -1250903559;
        oc.mdjn[121] = 132384613;
        oc.mdjn[122] = 1961861268;
        oc.mdjn[123] = -1817274167;
        oc.mdjn[124] = -1195418890;
        oc.mdjn[125] = 1172504194;
        oc.mdjn[126] = 274262463;
        oc.mdjn[127] = 1991555204;
        oc.mdjn[128] = 530138568;
        oc.mdjn[129] = 429315769;
        oc.mdjn[130] = -568622854;
        oc.mdjn[131] = -1585937501;
        oc.mdjn[132] = -1956131520;
        oc.mdjn[133] = -593882967;
        oc.mdjn[134] = -2115948636;
        oc.mdjn[135] = -142609544;
        oc.mdjn[136] = 1658336914;
        oc.mdjn[137] = 1045662395;
        oc.mdjn[138] = 648494041;
        oc.mdjn[139] = -771340508;
        oc.mdjn[140] = 289254592;
        oc.mdjn[141] = 268250633;
        oc.mdjn[142] = -146366478;
        oc.mdjn[143] = -160732728;
        oc.mdjn[144] = -1715175149;
        oc.mdjn[145] = 207952134;
        oc.mdjn[146] = 261028532;
        oc.mdjn[147] = -1984027322;
        oc.mdjn[148] = 690289439;
        oc.mdjn[149] = 1394833342;
        oc.mdjn[150] = 1712949525;
        oc.mdjn[151] = -2006700967;
        oc.mdjn[152] = -1539362585;
        oc.mdjn[153] = 671289856;
        oc.mdjn[154] = 1707735666;
        oc.mdjn[155] = -753406691;
        oc.mdjn[156] = 1397372397;
        oc.mdjn[157] = -455205122;
        oc.mdjn[158] = 428969864;
        oc.mdjn[159] = 1071464417;
        oc.mdjn[160] = -623453167;
        oc.mdjn[161] = 1731548686;
        oc.mdjn[162] = -1764784513;
        oc.mdjn[163] = 762168999;
        oc.mdjn[164] = -2116254255;
        oc.mdjn[165] = -1355664805;
        oc.mdjn[166] = 1457979947;
        oc.mdjn[167] = 1061227480;
        oc.mdjn[168] = 485685365;
        oc.mdjn[169] = 38665839;
        oc.mdjn[170] = -905915046;
        oc.mdjn[171] = -1163512490;
        oc.mdjn[172] = -745251199;
        oc.mdjn[173] = 1945078530;
        oc.mdjn[174] = 728364179;
        oc.mdjn[175] = 1453260541;
        oc.mdjn[176] = -256821134;
        oc.mdjn[177] = -1013578097;
        oc.mdjn[178] = -140125780;
        oc.mdjn[179] = 1764469383;
        oc.mdjn[180] = 588090099;
        oc.mdjn[181] = 688186146;
        oc.mdjn[182] = 1576756816;
        oc.mdjn[183] = -1011111432;
        oc.mdjn[184] = 1828285560;
        oc.mdjn[185] = 1618115972;
        oc.mdjn[186] = -1821099390;
        oc.mdjn[187] = -1769286554;
        oc.mdjn[188] = 485104179;
        oc.mdjn[189] = 2070075801;
        oc.mdjn[190] = 43563686;
        oc.mdjn[191] = -1922151904;
        oc.mdjn[192] = 1229705137;
        oc.mdjn[193] = -1030079580;
        oc.mdjn[194] = -183625163;
        oc.mdjn[195] = -1829775327;
        oc.mdjn[196] = 1221763557;
        oc.mdjn[197] = 435239655;
        oc.mdjn[198] = 1356504783;
        oc.mdjn[199] = 1543816708;
    }

    private static /* synthetic */ void megs() {
        oc.mdjn[200] = -855145405;
        oc.mdjn[201] = 1360243002;
        oc.mdjn[202] = 144043542;
        oc.mdjn[203] = -1299862426;
        oc.mdjn[204] = -160902185;
        oc.mdjn[205] = 100235251;
        oc.mdjn[206] = -172505852;
        oc.mdjn[207] = -654465652;
        oc.mdjn[208] = 460653839;
        oc.mdjn[209] = -916743072;
        oc.mdjn[210] = -1455048245;
        oc.mdjn[211] = 532355850;
        oc.mdjn[212] = 174819842;
        oc.mdjn[213] = -882661838;
        oc.mdjn[214] = -1366514998;
        oc.mdjn[215] = 1982698054;
        oc.mdjn[216] = -631588244;
        oc.mdjn[217] = 1647855751;
        oc.mdjn[218] = -576552137;
        oc.mdjn[219] = 1675321739;
        oc.mdjn[220] = -1132552943;
        oc.mdjn[221] = -1304083883;
        oc.mdjn[222] = -1505732063;
        oc.mdjn[223] = -375656321;
        oc.mdjn[224] = -792050279;
        oc.mdjn[225] = 2032533194;
        oc.mdjn[226] = -1880325470;
        oc.mdjn[227] = 711727433;
        oc.mdjn[228] = 151528186;
        oc.mdjn[229] = -733046261;
        oc.mdjn[230] = -1215821939;
        oc.mdjn[231] = 1624491057;
        oc.mdjn[232] = 237012252;
        oc.mdjn[233] = -970876628;
        oc.mdjn[234] = -319551470;
        oc.mdjn[235] = 958652426;
        oc.mdjn[236] = 682477604;
        oc.mdjn[237] = -83148503;
        oc.mdjn[238] = -862983215;
        oc.mdjn[239] = 1690449315;
        oc.mdjn[240] = -1482709592;
        oc.mdjn[241] = 1821171917;
        oc.mdjn[242] = -1550657169;
        oc.mdjn[243] = 1443307405;
        oc.mdjn[244] = -1241224300;
        oc.mdjn[245] = -984744065;
        oc.mdjn[246] = 464773211;
        oc.mdjn[247] = 797971006;
        oc.mdjn[248] = -1923347343;
        oc.mdjn[249] = 182140576;
        oc.mdjn[250] = 196652329;
        oc.mdjn[251] = 1814243442;
        oc.mdjn[252] = 1591212122;
        oc.mdjn[253] = -1488457333;
        oc.mdjn[254] = 747091620;
        oc.mdjn[255] = 286356257;
        oc.mdjn[256] = -1546796756;
        oc.mdjn[257] = -1240136124;
        oc.mdjn[258] = -1032040067;
        oc.mdjn[259] = 1919970982;
        oc.mdjn[260] = -1295515189;
        oc.mdjn[261] = -657154067;
        oc.mdjn[262] = -2005037811;
        oc.mdjn[263] = -844815356;
        oc.mdjn[264] = 530393140;
        oc.mdjn[265] = -1898286696;
        oc.mdjn[266] = 347976555;
        oc.mdjn[267] = 1206765460;
        oc.mdjn[268] = -1662724171;
        oc.mdjn[269] = 16945003;
        oc.mdjn[270] = 1957104175;
        oc.mdjn[271] = -624234292;
        oc.mdjn[272] = -2104595669;
        oc.mdjn[273] = 214548687;
        oc.mdjn[274] = -1373603190;
        oc.mdjn[275] = 462175525;
        oc.mdjn[276] = 1776584289;
        oc.mdjn[277] = 1778089274;
        oc.mdjn[278] = 1351071838;
        oc.mdjn[279] = 49593894;
        oc.mdjn[280] = -681786441;
        oc.mdjn[281] = -494789434;
        oc.mdjn[282] = -586165249;
        oc.mdjn[283] = -376079690;
        oc.mdjn[284] = -2029427137;
        oc.mdjn[285] = -1751936500;
        oc.mdjn[286] = -242190746;
        oc.mdjn[287] = -588222084;
        oc.mdjn[288] = -1793813549;
        oc.mdjn[289] = -1413181662;
        oc.mdjn[290] = -33792005;
        oc.mdjn[291] = 1192586379;
        oc.mdjn[292] = -206611001;
        oc.mdjn[293] = 1300767513;
        oc.mdjn[294] = 447578265;
        oc.mdjn[295] = -907006708;
        oc.mdjn[296] = 1153680320;
        oc.mdjn[297] = 1572171387;
        oc.mdjn[298] = 83185575;
        oc.mdjn[299] = 304931004;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int random(int var1_1, int var2_2) {
        v0 /* !! */  = oc.vb;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - oc.mdjp("mefu", mdkz(int ), (int)265));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 396374116: {
                    break block30;
                }
                case 1029768009: {
                    v1 = oc.mdjp("mefv", mdkz(int ), (int)266);
                    continue block30;
                }
                case 1049423811: {
                    v1 = oc.mdjp("mefw", mdkz(int ), (int)267);
                    continue block30;
                }
            }
            break;
        }
        var5_3 = oc.c;
        v2 /* !! */  = oc.vb;
        if (true) ** GOTO lbl19
        block31: while (true) {
            v2 /* !! */  = (long)(v3 - oc.mdjp("mefx", mdkz(int ), (int)268));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1365110531: {
                    v3 = oc.mdjp("mefy", mdkz(int ), (int)269);
                    continue block31;
                }
                case 396374116: {
                    break block31;
                }
                case 625900390: {
                    v3 = oc.mdjp("mefz", mdkz(int ), (int)270);
                    continue block31;
                }
                case 817957437: {
                    v3 = oc.mdjp("mega", mdkz(int ), (int)271);
                    continue block31;
                }
            }
            break;
        }
        var4_4 /* !! */  = oc.b;
        v4 /* !! */  = oc.vb;
        if (true) ** GOTO lbl36
        block32: while (true) {
            v4 /* !! */  = (long)(oc.mdjp("megc", mdkz(int ), (int)273) - oc.mdjp("megb", mdkz(int ), (int)272));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1873115829: {
                    continue block32;
                }
                case 396374116: {
                    break block32;
                }
            }
            break;
        }
        var3_5 = oc.a;
        if (var5_3) {
            throw null;
lbl44:
            // 3 sources

            return (int)oc.mdjp("megd", mdjm(int ), (int)307);
        }
        if (var3_5 || var3_5) ** GOTO lbl44
        if (var1_1 < var2_2) ** GOTO lbl53
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl44
                return var1_1;
            }
lbl53:
            // 1 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            v5 /* !! */  = oc.vb;
            if (true) ** GOTO lbl59
            block34: while (true) {
                v5 /* !! */  = (long)(v6 - oc.mdjp("mege", mdkz(int ), (int)274));
lbl59:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -356284221: {
                        v6 = oc.mdjp("megf", mdkz(int ), (int)275);
                        continue block34;
                    }
                    case -173005388: {
                        v6 = oc.mdjp("megg", mdkz(int ), (int)276);
                        continue block34;
                    }
                    case 396374116: {
                        break block34;
                    }
                }
                break;
            }
            return var1_1 + (int)(Math.random() * (double)(var2_2 - var1_1 + oc.mdjp("megh", mdjm(int ), (int)308)));
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)oc.mdjp("megi", mdjm(int ), (int)309);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl92
                    break;
                }
            }
            case 1: {
                var4_4 /* !! */  = (int)oc.mdjp("megj", mdjm(int ), (int)310);
                if (var5_3) {
                    throw null;
                }
            }
lbl79:
            // 4 sources

            case 2: {
                var4_4 /* !! */  = (int)oc.mdjp("megk", mdjm(int ), (int)311);
                if (!var5_3) break;
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)oc.mdjp("megl", mdjm(int ), (int)312);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 4: {
                var4_4 /* !! */  = (int)oc.mdjp("megm", mdjm(int ), (int)313);
                if (!var5_3) break;
                throw null;
            }
lbl92:
            // 3 sources

            case 5: {
                var4_4 /* !! */  = (int)oc.mdjp("megn", mdjm(int ), (int)314);
                if (!var5_3) break;
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)oc.mdjp("mego", mdjm(int ), (int)315);
                if (!var5_3) ** GOTO lbl79
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)oc.mdjp("megp", mdjm(int ), (int)316);
        ** while (!var5_3)
lbl103:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mehc() {
        oc.mdkg[100] = 8302950186735435013L;
        oc.mdkg[101] = 5536455107361050537L;
        oc.mdkg[102] = 6405669286285511310L;
        oc.mdkg[103] = -3986593293484728741L;
        oc.mdkg[104] = 8733961447317532975L;
        oc.mdkg[105] = -5615155117217245898L;
        oc.mdkg[106] = -6402265310360936491L;
        oc.mdkg[107] = 5084012559001142082L;
        oc.mdkg[108] = -6210596536670387334L;
        oc.mdkg[109] = -4599387825426209556L;
        oc.mdkg[110] = 1184061915379291691L;
        oc.mdkg[111] = 2387798395882972186L;
        oc.mdkg[112] = -3566847371540180912L;
        oc.mdkg[113] = 6901533603708713375L;
        oc.mdkg[114] = 4111907073623812047L;
        oc.mdkg[115] = -2717130515073547112L;
        oc.mdkg[116] = 2548095797699551777L;
        oc.mdkg[117] = 7460310063137266940L;
        oc.mdkg[118] = -2152290448978452134L;
        oc.mdkg[119] = 6502791567519740053L;
        oc.mdkg[120] = 6863582430825436448L;
        oc.mdkg[121] = -4181706430863279159L;
        oc.mdkg[122] = 7616105144740490520L;
        oc.mdkg[123] = 3560822592150153627L;
        oc.mdkg[124] = -6920734145946626809L;
        oc.mdkg[125] = 2574304002382699495L;
        oc.mdkg[126] = -8952467086092808285L;
        oc.mdkg[127] = -6434903077771621984L;
        oc.mdkg[128] = -5740467419321865293L;
        oc.mdkg[129] = 5306825281233179042L;
        oc.mdkg[130] = 9053885212281670506L;
        oc.mdkg[131] = 7318336790285317925L;
        oc.mdkg[132] = 8542107738801777999L;
        oc.mdkg[133] = -267782952189497982L;
        oc.mdkg[134] = -1077999578704789879L;
        oc.mdkg[135] = -5058406449512415912L;
        oc.mdkg[136] = 6268349675855639476L;
        oc.mdkg[137] = 4905295144482934105L;
        oc.mdkg[138] = -4170490338847122986L;
        oc.mdkg[139] = 6088351800820317280L;
        oc.mdkg[140] = -6481686312537369654L;
        oc.mdkg[141] = -2303567819741427245L;
        oc.mdkg[142] = 5220019588140390745L;
        oc.mdkg[143] = -3756199472317741204L;
        oc.mdkg[144] = 2400772517006766430L;
        oc.mdkg[145] = -6837220420615901775L;
        oc.mdkg[146] = -5445356126301883597L;
        oc.mdkg[147] = 1719089702193464529L;
        oc.mdkg[148] = -5100457963125063159L;
        oc.mdkg[149] = 1072995674073259689L;
        oc.mdkg[150] = 1257891472598624149L;
        oc.mdkg[151] = -1979862536520589943L;
        oc.mdkg[152] = -300454771958842679L;
        oc.mdkg[153] = -6105017458159704937L;
        oc.mdkg[154] = -276885275832581474L;
        oc.mdkg[155] = -8719540304022564967L;
        oc.mdkg[156] = 1521936341158444264L;
        oc.mdkg[157] = -2149277535125536671L;
        oc.mdkg[158] = -4268616173498709056L;
        oc.mdkg[159] = -9002564454475463274L;
        oc.mdkg[160] = -2795273879219611523L;
        oc.mdkg[161] = -1865296319535732456L;
        oc.mdkg[162] = 2863904348100433433L;
        oc.mdkg[163] = 2823393130181904576L;
        oc.mdkg[164] = 8070277728475000586L;
        oc.mdkg[165] = -4255590182890924198L;
        oc.mdkg[166] = 8683638409807193952L;
        oc.mdkg[167] = -6784391816373069572L;
        oc.mdkg[168] = -1829272985818685796L;
        oc.mdkg[169] = 997757707398502607L;
        oc.mdkg[170] = 7390750611385828749L;
        oc.mdkg[171] = -3524968633249367503L;
        oc.mdkg[172] = 7268080138923145213L;
        oc.mdkg[173] = 8811341918152192890L;
        oc.mdkg[174] = -1304574099293229769L;
        oc.mdkg[175] = 7659536497958528877L;
        oc.mdkg[176] = 442810450154580197L;
        oc.mdkg[177] = -522831040209282694L;
        oc.mdkg[178] = -5744195048210484757L;
        oc.mdkg[179] = 1796006137087369018L;
        oc.mdkg[180] = -3308746890174202188L;
        oc.mdkg[181] = -8634691529539225865L;
        oc.mdkg[182] = -600039783128180479L;
        oc.mdkg[183] = -7859876483992393702L;
        oc.mdkg[184] = 2045564504780653267L;
        oc.mdkg[185] = 3020158652124681754L;
        oc.mdkg[186] = 7666539699486803536L;
        oc.mdkg[187] = 6682394117050959116L;
        oc.mdkg[188] = 8690519200114038440L;
        oc.mdkg[189] = 1792435820554321401L;
        oc.mdkg[190] = -3155285602494789307L;
        oc.mdkg[191] = 7940040088141499414L;
        oc.mdkg[192] = -6618966354478565047L;
        oc.mdkg[193] = 7192334610921108551L;
        oc.mdkg[194] = 548899866136156742L;
        oc.mdkg[195] = -1739579660202133262L;
        oc.mdkg[196] = 181795141171420284L;
        oc.mdkg[197] = 8266451919432137082L;
        oc.mdkg[198] = -8402438844421670544L;
        oc.mdkg[199] = -774185104640673747L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc stopSprint(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdqr", mdkz(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oc.mdjp("mdqs", mdjm(int ), (int)111)) break;
            v0 /* !! */  = (long)oc.mdjp("mdqt", mdjm(int ), (int)112);
        }
        var4_2 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdqu", mdkz(int ), (int)69));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -124905892: {
                    v2 = oc.mdjp("mdqv", mdkz(int ), (int)70);
                    continue block18;
                }
                case -122889190: {
                    v2 = oc.mdjp("mdqw", mdkz(int ), (int)71);
                    continue block18;
                }
                case 396374116: {
                    break block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl25
        block19: while (true) {
            v3 /* !! */  = (long)(oc.mdjp("mdqy", mdkz(int ), (int)73) - oc.mdjp("mdqx", mdkz(int ), (int)72));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 396374116: {
                    break block19;
                }
                case 446499626: {
                    continue block19;
                }
            }
            break;
        }
        var2_4 = oc.a;
        if (var4_2) {
            throw null;
lbl33:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdqz", mdkz(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oc.mdjp("mdra", mdjm(int ), (int)113)) break;
            v4 /* !! */  = (long)oc.mdjp("mdrb", mdjm(int ), (int)114);
        }
        this.stopSprint = var1_1;
        if (var2_4) ** GOTO lbl33
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
lbl49:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)oc.mdjp("mdrc", mdjm(int ), (int)115);
                if (!var4_2) break;
                throw null;
            }
lbl53:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)oc.mdjp("mdrd", mdjm(int ), (int)116);
                if (!var4_2) ** GOTO lbl49
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)oc.mdjp("mdre", mdjm(int ), (int)117);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)oc.mdjp("mdrf", mdjm(int ), (int)118);
                    if (!var4_2) ** GOTO lbl57
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)oc.mdjp("mdrg", mdjm(int ), (int)119);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)oc.mdjp("mdrh", mdjm(int ), (int)120);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public oc minimumStopDelay(int var1_1) {
        block21: {
            block23: {
                block22: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdtx", mdkz(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == oc.mdjp("mdty", mdjm(int ), (int)155)) break;
                        v0 /* !! */  = (long)oc.mdjp("mdtz", mdjm(int ), (int)156);
                    }
                    var4_2 = oc.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mdua", mdkz(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == oc.mdjp("mdub", mdjm(int ), (int)157)) break;
                        v1 /* !! */  = (long)oc.mdjp("mduc", mdjm(int ), (int)158);
                    }
                    var3_3 /* !! */  = oc.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_3 = oc.vb - oc.mdjp("mdud", mdkz(int ), (int)110)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == oc.mdjp("mdue", mdjm(int ), (int)159)) {
                            var2_4 = oc.a;
                            if (var4_2) {
                                throw null;
                            }
                            break;
                        }
                        v2 /* !! */  = (long)oc.mdjp("mduf", mdjm(int ), (int)160);
                    }
                    if (var2_4 || var2_4) break block22;
                    v3 = oc.mdjp("mdug", mdjm(int ), (int)161);
                    ** GOTO lbl41
                }
                block11: while (true) lbl-1000:
                // 3 sources

                {
                    if (var3_3 /* !! */  == 0) return null;
                    cfr_temp_0 = -2147483648;
lbl29:
                    // 2 sources

                    block12: while (true) {
                        switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                            default: {
                                return null;
                            }
                            case 0: {
                                var3_3 /* !! */  = (int)oc.mdjp("mdun", mdjm(int ), (int)166);
                                if (var4_2) {
                                    throw null;
                                }
                            }
                            case 2: {
                                ** break;
                            }
                            case 5: {
                                break block21;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                if ((v4 /* !! */  = (cfr_temp_4 = oc.vb - oc.mdjp("mduh", mdkz(int ), (int)111)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                                if (v4 /* !! */  == oc.mdjp("mdui", mdjm(int ), (int)162)) break;
                                v4 /* !! */  = (long)oc.mdjp("mduj", mdjm(int ), (int)163);
                            }
                            v5 = Math.max((int)v3, var1_1);
                            while (true) {
                                if ((v6 /* !! */  = (cfr_temp_5 = oc.vb - oc.mdjp("mduk", mdkz(int ), (int)112)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                                if (v6 /* !! */  != oc.mdjp("mdul", mdjm(int ), (int)164)) ** GOTO lbl53
                                this.minimumStopDelay = v5;
                                if (var2_4) ** GOTO lbl-1000
                                continue block11;
lbl53:
                                // 1 sources

                                v6 /* !! */  = (long)oc.mdjp("mdum", mdjm(int ), (int)165);
                            }
                            if (var2_4) continue block11;
                            return this;
                            case 1: {
                                var3_3 /* !! */  = (int)oc.mdjp("mduo", mdjm(int ), (int)167);
                                if (var4_2) {
                                    throw null;
                                }
                            }
                            case 4: {
                                var3_3 /* !! */  = (int)oc.mdjp("mdur", mdjm(int ), (int)170);
                                cfr_temp_0 = 1;
                                if (!var4_2) continue block12;
                                throw null;
                            }
lbl66:
                            // 2 sources

                            while (true) {
                                var3_3 /* !! */  = (int)oc.mdjp("mdup", mdjm(int ), (int)168);
                                cfr_temp_0 = 3;
                                if (!var4_2) continue block12;
                                throw null;
                            }
                            case 3: 
                        }
                        break;
                    }
                    break;
                }
                break block23;
                ** while (true)
            }
            var3_3 /* !! */  = (int)oc.mdjp("mduq", mdjm(int ), (int)169);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)oc.mdjp("mdus", mdjm(int ), (int)171);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void megt() {
        oc.mdjn[300] = -1209142609;
        oc.mdjn[301] = -1483777047;
        oc.mdjn[302] = -705212854;
        oc.mdjn[303] = -1483442103;
        oc.mdjn[304] = 1237526717;
        oc.mdjn[305] = -1004006892;
        oc.mdjn[306] = -1667459390;
        oc.mdjn[307] = -1569896440;
        oc.mdjn[308] = -343293943;
        oc.mdjn[309] = -855744397;
        oc.mdjn[310] = -742797684;
        oc.mdjn[311] = 1273727267;
        oc.mdjn[312] = -47504819;
        oc.mdjn[313] = 1176824238;
        oc.mdjn[314] = 1045105396;
        oc.mdjn[315] = -1808973096;
        oc.mdjn[316] = 232309001;
    }

    private static /* synthetic */ int mdjm(int n2) {
        return mdjn[n2] ^ mdjo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int randomPreSwapDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("medb", mdkz(int ), (int)229)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("medc", mdjm(int ), (int)272)) break;
            v0 /* !! */  = (long)oc.mdjp("medd", mdjm(int ), (int)273);
        }
        var3_1 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mede", mdkz(int ), (int)230));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1302373756: {
                    v2 = oc.mdjp("medf", mdkz(int ), (int)231);
                    continue block13;
                }
                case -573633012: {
                    v2 = oc.mdjp("medg", mdkz(int ), (int)232);
                    continue block13;
                }
                case 396374116: {
                    break block13;
                }
                case 877081119: {
                    v2 = oc.mdjp("medh", mdkz(int ), (int)233);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("medi", mdkz(int ), (int)234)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oc.mdjp("medj", mdjm(int ), (int)274)) break;
            v3 /* !! */  = (long)oc.mdjp("medk", mdjm(int ), (int)275);
        }
        var1_3 = oc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)oc.mdjp("medl", mdjm(int ), (int)276);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("medm", mdkz(int ), (int)235)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oc.mdjp("medn", mdjm(int ), (int)277)) break;
                    v4 /* !! */  = (long)oc.mdjp("medo", mdjm(int ), (int)278);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = oc.vb - oc.mdjp("medp", mdkz(int ), (int)236)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == oc.mdjp("medq", mdjm(int ), (int)279)) break;
                    v5 /* !! */  = (long)oc.mdjp("medr", mdjm(int ), (int)280);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = oc.vb - oc.mdjp("meds", mdkz(int ), (int)237)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == oc.mdjp("medt", mdjm(int ), (int)281)) break;
                    v6 /* !! */  = (long)oc.mdjp("medu", mdjm(int ), (int)282);
                }
                return this.random(this.preSwapDelayMin, this.preSwapDelayMax);
            }
lbl59:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)oc.mdjp("medv", mdjm(int ), (int)283);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl69
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)oc.mdjp("medw", mdjm(int ), (int)284);
                } while (!var3_1);
                throw null;
            }
lbl69:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)oc.mdjp("medx", mdjm(int ), (int)285);
                    if (!var3_1) ** GOTO lbl59
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oc.mdjp("medy", mdjm(int ), (int)286);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void meha() {
        oc.mdkf[200] = 1562109419088990727L;
        oc.mdkf[201] = 1180781043621113486L;
        oc.mdkf[202] = 7386729092087851631L;
        oc.mdkf[203] = -2733107922904161771L;
        oc.mdkf[204] = -3120233699668247509L;
        oc.mdkf[205] = 2799063195376043495L;
        oc.mdkf[206] = 5470006643015705378L;
        oc.mdkf[207] = -8135671305589789629L;
        oc.mdkf[208] = -1368509791751303569L;
        oc.mdkf[209] = 5465676785135089145L;
        oc.mdkf[210] = -2298850026258788723L;
        oc.mdkf[211] = -7528543095342664690L;
        oc.mdkf[212] = 4608757660898527729L;
        oc.mdkf[213] = -353235397820061212L;
        oc.mdkf[214] = 5991920645778222099L;
        oc.mdkf[215] = -9049538272110568963L;
        oc.mdkf[216] = -8097940470427079815L;
        oc.mdkf[217] = 8415143704004858077L;
        oc.mdkf[218] = 5205989416474340442L;
        oc.mdkf[219] = 5211684909772011123L;
        oc.mdkf[220] = 278063971856293089L;
        oc.mdkf[221] = -7018349119002122435L;
        oc.mdkf[222] = 5139285767462675867L;
        oc.mdkf[223] = -4369709131185709195L;
        oc.mdkf[224] = -1766957227322872324L;
        oc.mdkf[225] = 293248331765244810L;
        oc.mdkf[226] = 4930773332396941619L;
        oc.mdkf[227] = 4735148815756171491L;
        oc.mdkf[228] = -6175302293022234342L;
        oc.mdkf[229] = -9046409396807508059L;
        oc.mdkf[230] = -8533169758545156624L;
        oc.mdkf[231] = -6252298194757785277L;
        oc.mdkf[232] = 1717215145996983842L;
        oc.mdkf[233] = 1087347333746104320L;
        oc.mdkf[234] = -2464526337021626723L;
        oc.mdkf[235] = -6705983344218854773L;
        oc.mdkf[236] = -1519098028674456415L;
        oc.mdkf[237] = -1308692964591921124L;
        oc.mdkf[238] = 6549650690402442810L;
        oc.mdkf[239] = -1792154095482658961L;
        oc.mdkf[240] = 8354025707209376074L;
        oc.mdkf[241] = 8379706663604002756L;
        oc.mdkf[242] = 3894381692247993529L;
        oc.mdkf[243] = 1886367924430983762L;
        oc.mdkf[244] = 8142802005738189069L;
        oc.mdkf[245] = 8358735858109012415L;
        oc.mdkf[246] = -3275622578701964959L;
        oc.mdkf[247] = -1364065046583241832L;
        oc.mdkf[248] = 8849187392983875214L;
        oc.mdkf[249] = 306170829632883167L;
        oc.mdkf[250] = 1497725964183262647L;
        oc.mdkf[251] = 6578581343448531892L;
        oc.mdkf[252] = 1006457069983844496L;
        oc.mdkf[253] = -8033468782778354718L;
        oc.mdkf[254] = -416901916348470036L;
        oc.mdkf[255] = 3923490306923005342L;
        oc.mdkf[256] = -8773248446164945042L;
        oc.mdkf[257] = 5986749542993383554L;
        oc.mdkf[258] = -31414429677809944L;
        oc.mdkf[259] = -7212652377400668390L;
        oc.mdkf[260] = 693279660275143916L;
        oc.mdkf[261] = -7362654399125842776L;
        oc.mdkf[262] = 2091751421900637243L;
        oc.mdkf[263] = 4930198776640265242L;
        oc.mdkf[264] = 6833461952327978291L;
        oc.mdkf[265] = -1238788890882013590L;
        oc.mdkf[266] = -2547996176245668447L;
        oc.mdkf[267] = 3576005800785186797L;
        oc.mdkf[268] = -4400470793995561355L;
        oc.mdkf[269] = 7771401947721030237L;
        oc.mdkf[270] = -8060225012270646228L;
        oc.mdkf[271] = 1710131601284400579L;
        oc.mdkf[272] = -618380202725617480L;
        oc.mdkf[273] = -5149720347354570213L;
        oc.mdkf[274] = 5501340099048432129L;
        oc.mdkf[275] = -8950738832157361535L;
        oc.mdkf[276] = -2348467448368256558L;
    }

    private static /* synthetic */ void megz() {
        oc.mdkf[100] = -4408435715431634384L;
        oc.mdkf[101] = 5832909390392282936L;
        oc.mdkf[102] = -3221152346722609448L;
        oc.mdkf[103] = 1794684403960108371L;
        oc.mdkf[104] = -961913876317189026L;
        oc.mdkf[105] = 474145711723009174L;
        oc.mdkf[106] = 3212683947383404353L;
        oc.mdkf[107] = 4250191244918719020L;
        oc.mdkf[108] = 7282351722449913002L;
        oc.mdkf[109] = 9038441950482350728L;
        oc.mdkf[110] = 1281554532070034025L;
        oc.mdkf[111] = -5878855870255533896L;
        oc.mdkf[112] = -8847238130087904447L;
        oc.mdkf[113] = 2938214460892421038L;
        oc.mdkf[114] = 7473159172328725240L;
        oc.mdkf[115] = 2364075648158400824L;
        oc.mdkf[116] = 231005557576937590L;
        oc.mdkf[117] = 7517898076390882617L;
        oc.mdkf[118] = -1046294424362239225L;
        oc.mdkf[119] = -1737018914472901922L;
        oc.mdkf[120] = -9089912210411731282L;
        oc.mdkf[121] = -7626389312738426177L;
        oc.mdkf[122] = -3097869513629998062L;
        oc.mdkf[123] = -6045667628722897819L;
        oc.mdkf[124] = 6139707156961711551L;
        oc.mdkf[125] = -4309529303631771012L;
        oc.mdkf[126] = -1159438027111218635L;
        oc.mdkf[127] = -6898401735825458847L;
        oc.mdkf[128] = -4773079121172204827L;
        oc.mdkf[129] = 410242812034930689L;
        oc.mdkf[130] = -119570786352558046L;
        oc.mdkf[131] = -2322939843588340143L;
        oc.mdkf[132] = -3252910345249341511L;
        oc.mdkf[133] = 3468881641955954828L;
        oc.mdkf[134] = 1875996840908321770L;
        oc.mdkf[135] = -5137287186880523L;
        oc.mdkf[136] = 2423314004932351768L;
        oc.mdkf[137] = -8416780136302492788L;
        oc.mdkf[138] = -2733822048365622743L;
        oc.mdkf[139] = 5042617102539657060L;
        oc.mdkf[140] = 9150277477329454999L;
        oc.mdkf[141] = -6626709104060526804L;
        oc.mdkf[142] = 808408826677902416L;
        oc.mdkf[143] = -2351758659824058636L;
        oc.mdkf[144] = 6398910588519035011L;
        oc.mdkf[145] = -7667857898774511680L;
        oc.mdkf[146] = -9138926658752763156L;
        oc.mdkf[147] = 1833541747241968864L;
        oc.mdkf[148] = -7173652115171654002L;
        oc.mdkf[149] = 5632489063861622779L;
        oc.mdkf[150] = 4362801158972299727L;
        oc.mdkf[151] = 3739356799229281646L;
        oc.mdkf[152] = 6322417268414344195L;
        oc.mdkf[153] = 7540092090260057873L;
        oc.mdkf[154] = 1951654105423740559L;
        oc.mdkf[155] = 4826505869477484451L;
        oc.mdkf[156] = -8106033814853338265L;
        oc.mdkf[157] = -4161073017117596975L;
        oc.mdkf[158] = 5493798658104770434L;
        oc.mdkf[159] = 7815909391753005256L;
        oc.mdkf[160] = -316312418341754837L;
        oc.mdkf[161] = 3494541512421257490L;
        oc.mdkf[162] = -8277603906525502627L;
        oc.mdkf[163] = 2064813128251962943L;
        oc.mdkf[164] = -814530163906093120L;
        oc.mdkf[165] = 3544344427967810173L;
        oc.mdkf[166] = 2654109852802274179L;
        oc.mdkf[167] = 8295421523567499824L;
        oc.mdkf[168] = -7685487068189264809L;
        oc.mdkf[169] = -579999109516324677L;
        oc.mdkf[170] = 5069414756318801595L;
        oc.mdkf[171] = -3659565046368215717L;
        oc.mdkf[172] = 2533292221836654885L;
        oc.mdkf[173] = 1546501749329766526L;
        oc.mdkf[174] = -6921824536918600063L;
        oc.mdkf[175] = 6562335457283936598L;
        oc.mdkf[176] = -4456818560099849531L;
        oc.mdkf[177] = 7526019294435834631L;
        oc.mdkf[178] = -8309897470949676983L;
        oc.mdkf[179] = -1998907444639992258L;
        oc.mdkf[180] = 2029086125436614921L;
        oc.mdkf[181] = 3032733151315334051L;
        oc.mdkf[182] = 3151506813262160620L;
        oc.mdkf[183] = -8816414056081010173L;
        oc.mdkf[184] = 6123563047076761744L;
        oc.mdkf[185] = -4388782919197197873L;
        oc.mdkf[186] = 6170767081976018132L;
        oc.mdkf[187] = -8156310842552772361L;
        oc.mdkf[188] = 6591511738518767025L;
        oc.mdkf[189] = 3925835184476795442L;
        oc.mdkf[190] = 8227248160729727308L;
        oc.mdkf[191] = 725377220467090118L;
        oc.mdkf[192] = 6170321566110626260L;
        oc.mdkf[193] = 4592208926598634309L;
        oc.mdkf[194] = -4494460378546544576L;
        oc.mdkf[195] = -4822451349719934786L;
        oc.mdkf[196] = -6196412276293769037L;
        oc.mdkf[197] = 7678411407365799242L;
        oc.mdkf[198] = -1223525537320877244L;
        oc.mdkf[199] = -3546601499273157994L;
    }

    private static /* synthetic */ void mehb() {
        oc.mdkg[0] = -4642154433723073552L;
        oc.mdkg[1] = -2170826647061864523L;
        oc.mdkg[2] = 440967919416117576L;
        oc.mdkg[3] = 367610129685993747L;
        oc.mdkg[4] = -649204588118223759L;
        oc.mdkg[5] = 8896493130509247175L;
        oc.mdkg[6] = -3971715662450190179L;
        oc.mdkg[7] = -1463033187364118288L;
        oc.mdkg[8] = -158497034905112694L;
        oc.mdkg[9] = 6430173905490467699L;
        oc.mdkg[10] = 6803681800240008065L;
        oc.mdkg[11] = 637218420380658392L;
        oc.mdkg[12] = 6344850137005737651L;
        oc.mdkg[13] = -7719823435851910085L;
        oc.mdkg[14] = -2037931761047592062L;
        oc.mdkg[15] = -2968142121265318701L;
        oc.mdkg[16] = 5257722235317932454L;
        oc.mdkg[17] = 3427158443610003816L;
        oc.mdkg[18] = -3226135481362862271L;
        oc.mdkg[19] = 7947347055415970349L;
        oc.mdkg[20] = -6648283963018534227L;
        oc.mdkg[21] = -7687892002496460568L;
        oc.mdkg[22] = -7056636691407101270L;
        oc.mdkg[23] = -1958592896349892145L;
        oc.mdkg[24] = 758580216445915155L;
        oc.mdkg[25] = 208539215348914659L;
        oc.mdkg[26] = 723915565989426514L;
        oc.mdkg[27] = 6104620801082020182L;
        oc.mdkg[28] = 4382788865059368808L;
        oc.mdkg[29] = -2425351154198533691L;
        oc.mdkg[30] = 7484807976242681829L;
        oc.mdkg[31] = -1444803890365282653L;
        oc.mdkg[32] = -3962838952531837910L;
        oc.mdkg[33] = -5091574897116409412L;
        oc.mdkg[34] = -6423346886940204464L;
        oc.mdkg[35] = 4088277276358642077L;
        oc.mdkg[36] = -3215395897592558429L;
        oc.mdkg[37] = -6801425403277662024L;
        oc.mdkg[38] = -3796190446503260432L;
        oc.mdkg[39] = 2998936164809167545L;
        oc.mdkg[40] = -437709086488736678L;
        oc.mdkg[41] = -7475789171489088431L;
        oc.mdkg[42] = 2369821223575459571L;
        oc.mdkg[43] = 6633947512085701980L;
        oc.mdkg[44] = -1394842274417225986L;
        oc.mdkg[45] = -8402497321634921118L;
        oc.mdkg[46] = 7424436367982030255L;
        oc.mdkg[47] = -1103501042108155932L;
        oc.mdkg[48] = 3242149482234635926L;
        oc.mdkg[49] = 2238111439578995467L;
        oc.mdkg[50] = -2662186491609379837L;
        oc.mdkg[51] = 5712629378728755574L;
        oc.mdkg[52] = -4551502457952956763L;
        oc.mdkg[53] = -3228587220245350353L;
        oc.mdkg[54] = -2041855818973086067L;
        oc.mdkg[55] = -8655282043828183131L;
        oc.mdkg[56] = -7456650038413487533L;
        oc.mdkg[57] = 6273904575850420219L;
        oc.mdkg[58] = -6841234005042755932L;
        oc.mdkg[59] = 3054532930966325389L;
        oc.mdkg[60] = 2316372398427919167L;
        oc.mdkg[61] = -4637586450750743411L;
        oc.mdkg[62] = 4536977873295136575L;
        oc.mdkg[63] = -7268577122972572428L;
        oc.mdkg[64] = -165440842870939538L;
        oc.mdkg[65] = -813989495169132455L;
        oc.mdkg[66] = 75897310444237759L;
        oc.mdkg[67] = -8316913836962102342L;
        oc.mdkg[68] = -7281379187766213653L;
        oc.mdkg[69] = 7099991042008334184L;
        oc.mdkg[70] = -3172853885983679226L;
        oc.mdkg[71] = -711329373687249914L;
        oc.mdkg[72] = 7647377460436295022L;
        oc.mdkg[73] = 967069422725701617L;
        oc.mdkg[74] = 5852841203837215982L;
        oc.mdkg[75] = -3968294449592619619L;
        oc.mdkg[76] = 5277506584763118185L;
        oc.mdkg[77] = 6490720685560668082L;
        oc.mdkg[78] = -6948549474118013666L;
        oc.mdkg[79] = -5932216971923258146L;
        oc.mdkg[80] = -4596043855772119696L;
        oc.mdkg[81] = 6936204747030424169L;
        oc.mdkg[82] = -5430389387948065016L;
        oc.mdkg[83] = 9179094167219408234L;
        oc.mdkg[84] = -4844904004536005797L;
        oc.mdkg[85] = 1488280741879030939L;
        oc.mdkg[86] = -4974489658307533496L;
        oc.mdkg[87] = -5579476843747884403L;
        oc.mdkg[88] = -5215469988874540823L;
        oc.mdkg[89] = 5965617396803581847L;
        oc.mdkg[90] = -8679647055925498419L;
        oc.mdkg[91] = 6084600757328959262L;
        oc.mdkg[92] = 2086786620697721888L;
        oc.mdkg[93] = 542029352882911889L;
        oc.mdkg[94] = -133736761111333567L;
        oc.mdkg[95] = -3150071420884964912L;
        oc.mdkg[96] = 4988356311031714715L;
        oc.mdkg[97] = -1746523122094548090L;
        oc.mdkg[98] = -7643736283428251871L;
        oc.mdkg[99] = 1318674260900214519L;
    }

    private static /* synthetic */ void megw() {
        oc.mdjo[200] = 855145404;
        oc.mdjo[201] = -1330314691;
        oc.mdjo[202] = 144043539;
        oc.mdjo[203] = -1299862429;
        oc.mdjo[204] = -160902188;
        oc.mdjo[205] = 100235252;
        oc.mdjo[206] = -172505850;
        oc.mdjo[207] = -654465654;
        oc.mdjo[208] = 460653835;
        oc.mdjo[209] = -916743072;
        oc.mdjo[210] = -1455048246;
        oc.mdjo[211] = -302938714;
        oc.mdjo[212] = 174819842;
        oc.mdjo[213] = -882661834;
        oc.mdjo[214] = -1366514994;
        oc.mdjo[215] = 1982698050;
        oc.mdjo[216] = -631588248;
        oc.mdjo[217] = 1647855750;
        oc.mdjo[218] = -576552137;
        oc.mdjo[219] = 1675321738;
        oc.mdjo[220] = 963945278;
        oc.mdjo[221] = -1304083883;
        oc.mdjo[222] = -1505732062;
        oc.mdjo[223] = -375656324;
        oc.mdjo[224] = -792050280;
        oc.mdjo[225] = 2032533195;
        oc.mdjo[226] = -731420575;
        oc.mdjo[227] = 711727432;
        oc.mdjo[228] = 151528187;
        oc.mdjo[229] = 1398357883;
        oc.mdjo[230] = -1215821939;
        oc.mdjo[231] = 1624491059;
        oc.mdjo[232] = 237012255;
        oc.mdjo[233] = -970876626;
        oc.mdjo[234] = -319551470;
        oc.mdjo[235] = 958652427;
        oc.mdjo[236] = -1656596279;
        oc.mdjo[237] = -83148501;
        oc.mdjo[238] = -862983214;
        oc.mdjo[239] = 1690449312;
        oc.mdjo[240] = -1482709591;
        oc.mdjo[241] = 1821171916;
        oc.mdjo[242] = 356435175;
        oc.mdjo[243] = 1443307404;
        oc.mdjo[244] = -1241224299;
        oc.mdjo[245] = -984744067;
        oc.mdjo[246] = 464773210;
        oc.mdjo[247] = 797971007;
        oc.mdjo[248] = -1180372693;
        oc.mdjo[249] = 198682885;
        oc.mdjo[250] = 196652328;
        oc.mdjo[251] = 1814243440;
        oc.mdjo[252] = 1591212122;
        oc.mdjo[253] = -1488457336;
        oc.mdjo[254] = 747091621;
        oc.mdjo[255] = 932184013;
        oc.mdjo[256] = 277919829;
        oc.mdjo[257] = -1240136121;
        oc.mdjo[258] = -1032040066;
        oc.mdjo[259] = 1919970980;
        oc.mdjo[260] = -1295515191;
        oc.mdjo[261] = -657154068;
        oc.mdjo[262] = -507510099;
        oc.mdjo[263] = -437426936;
        oc.mdjo[264] = 530393141;
        oc.mdjo[265] = -1697361631;
        oc.mdjo[266] = -347976556;
        oc.mdjo[267] = 1280573561;
        oc.mdjo[268] = -1662724171;
        oc.mdjo[269] = 16945002;
        oc.mdjo[270] = 1957104175;
        oc.mdjo[271] = -624234291;
        oc.mdjo[272] = -2104595670;
        oc.mdjo[273] = 1612310465;
        oc.mdjo[274] = -1373603189;
        oc.mdjo[275] = 130898689;
        oc.mdjo[276] = 1003170674;
        oc.mdjo[277] = 1778089275;
        oc.mdjo[278] = 1539006850;
        oc.mdjo[279] = -49593895;
        oc.mdjo[280] = 1626080862;
        oc.mdjo[281] = -494789433;
        oc.mdjo[282] = -801190424;
        oc.mdjo[283] = -376079690;
        oc.mdjo[284] = -2029427138;
        oc.mdjo[285] = -1751936498;
        oc.mdjo[286] = -242190746;
        oc.mdjo[287] = -588222083;
        oc.mdjo[288] = -440761008;
        oc.mdjo[289] = 1250872966;
        oc.mdjo[290] = 33792004;
        oc.mdjo[291] = -1536731865;
        oc.mdjo[292] = -206611002;
        oc.mdjo[293] = 1300767515;
        oc.mdjo[294] = 447578265;
        oc.mdjo[295] = -907006705;
        oc.mdjo[296] = 1153680321;
        oc.mdjo[297] = 1168702822;
        oc.mdjo[298] = -344800380;
        oc.mdjo[299] = 304931005;
    }

    private static /* synthetic */ double mdke(int n2) {
        return Double.longBitsToDouble(mdkf[n2] ^ mdkg[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int randomPostSwapDelay() {
        while (true) {
            block40: {
                if ((v0 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("medz", mdkz(int ), (int)238)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != oc.mdjp("meea", mdjm(int ), (int)287)) break block40;
                var3_1 = oc.c;
                v1 /* !! */  = oc.vb;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)oc.mdjp("meeb", mdjm(int ), (int)288);
        }
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("meec", mdkz(int ), (int)239));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1747688464: {
                    v2 = oc.mdjp("meed", mdkz(int ), (int)240);
                    continue block27;
                }
                case -1052003724: {
                    v2 = oc.mdjp("meee", mdkz(int ), (int)241);
                    continue block27;
                }
                case 396374116: {
                    break block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        block28: while (true) {
            switch ((int)v3 /* !! */ ) {
                case 396374116: {
                    break block28;
                }
                case 1021804165: {
                    v3 /* !! */  = (long)(oc.mdjp("meeg", mdkz(int ), (int)243) - oc.mdjp("meef", mdkz(int ), (int)242));
                    continue block28;
                }
            }
            break;
        }
        var1_3 = oc.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return (int)oc.mdjp("meeh", mdjm(int ), (int)289);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block29: while (true) {
            block41: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return (int)oc.mdjp("meeh", mdjm(int ), (int)289);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("meei", mdkz(int ), (int)244)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  != oc.mdjp("meej", mdjm(int ), (int)290)) ** GOTO lbl47
                            v5 /* !! */  = oc.vb;
                            if (true) ** GOTO lbl62
lbl47:
                            // 1 sources

                            v4 /* !! */  = (long)oc.mdjp("meek", mdjm(int ), (int)291);
                        }
                    }
                    case 1: {
                        ** GOTO lbl55
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)oc.mdjp("meev", mdjm(int ), (int)295);
                        if (var3_1) {
                            throw null;
                        }
lbl55:
                        // 3 sources

                        var2_2 /* !! */  = (int)oc.mdjp("meet", mdjm(int ), (int)293);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block41;
                    }
                    block31: while (true) {
                        v5 /* !! */  = (long)(v6 - oc.mdjp("meel", mdkz(int ), (int)245));
lbl62:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1415861774: {
                                v6 = oc.mdjp("meem", mdkz(int ), (int)246);
                                continue block31;
                            }
                            case 130683794: {
                                v6 = oc.mdjp("meen", mdkz(int ), (int)247);
                                continue block31;
                            }
                            case 396374116: {
                                break block31;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = oc.vb;
                    if (true) ** GOTO lbl75
                    block32: while (true) {
                        v7 /* !! */  = (long)(v8 - oc.mdjp("meeo", mdkz(int ), (int)248));
lbl75:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1218684887: {
                                v8 = oc.mdjp("meep", mdkz(int ), (int)249);
                                continue block32;
                            }
                            case -337540237: {
                                v8 = oc.mdjp("meeq", mdkz(int ), (int)250);
                                continue block32;
                            }
                            case 396374116: {
                                return this.random(this.postSwapDelayMin, this.postSwapDelayMax);
                            }
                            case 2024743130: {
                                v8 = oc.mdjp("meer", mdkz(int ), (int)251);
                                continue block32;
                            }
                        }
                        break;
                    }
                    return this.random(this.postSwapDelayMin, this.postSwapDelayMax);
                    case 0: {
                        var2_2 /* !! */  = (int)oc.mdjp("mees", mdjm(int ), (int)292);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl97
            }
            do {
                if (true) continue block29;
lbl97:
                // 2 sources

                var2_2 /* !! */  = (int)oc.mdjp("meeu", mdjm(int ), (int)294);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getMinimumStopDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("meap", mdkz(int ), (int)190)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("meaq", mdjm(int ), (int)247)) break;
            v0 /* !! */  = (long)oc.mdjp("mear", mdjm(int ), (int)248);
        }
        var3_1 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(oc.mdjp("meat", mdkz(int ), (int)192) - oc.mdjp("meas", mdkz(int ), (int)191));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -971524781: {
                    continue block22;
                }
                case 396374116: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = oc.vb;
                if (true) ** GOTO lbl25
                block23: while (true) {
                    v2 /* !! */  = (long)(v3 - oc.mdjp("meau", mdkz(int ), (int)193));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1205638075: {
                            v3 = oc.mdjp("meav", mdkz(int ), (int)194);
                            continue block23;
                        }
                        case -532077085: {
                            v3 = oc.mdjp("meaw", mdkz(int ), (int)195);
                            continue block23;
                        }
                        case 396374116: {
                            break block23;
                        }
                        case 1878432055: {
                            v3 = oc.mdjp("meax", mdkz(int ), (int)196);
                            continue block23;
                        }
                    }
                    break;
                }
                var1_3 = oc.a;
                if (var3_1) {
                    throw null;
                    return (int)oc.mdjp("meay", mdjm(int ), (int)249);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = oc.vb;
                if (true) ** GOTO lbl47
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - oc.mdjp("meaz", mdkz(int ), (int)197));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1563459056: {
                            v5 = oc.mdjp("meba", mdkz(int ), (int)198);
                            continue block25;
                        }
                        case 396374116: {
                            break block25;
                        }
                        case 2067303882: {
                            v5 = oc.mdjp("mebb", mdkz(int ), (int)199);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.minimumStopDelay;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)oc.mdjp("mebc", mdjm(int ), (int)250);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oc.mdjp("mebd", mdjm(int ), (int)251);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)oc.mdjp("mebe", mdjm(int ), (int)252);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)oc.mdjp("mebf", mdjm(int ), (int)253);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean shouldCloseInventory() {
        v0 /* !! */  = oc.vb;
        block19: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 396374116: {
                    break block19;
                }
                case 510728172: {
                    v0 /* !! */  = (long)(oc.mdjp("mdzk", mdkz(int ), (int)172) - oc.mdjp("mdzj", mdkz(int ), (int)171));
                    continue block19;
                }
            }
            break;
        }
        var3_1 = oc.c;
        v1 /* !! */  = oc.vb;
        block20: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 396374116: {
                    break block20;
                }
                case 2007947033: {
                    v1 /* !! */  = (long)(oc.mdjp("mdzm", mdkz(int ), (int)174) - oc.mdjp("mdzl", mdkz(int ), (int)173));
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v2 /* !! */  = oc.vb;
                    block22: while (true) {
                        switch ((int)v2 /* !! */ ) {
                            case 396374116: {
                                break block22;
                            }
                            case 519374786: {
                                v3 = oc.mdjp("mdzo", mdkz(int ), (int)176);
                                ** GOTO lbl34
                            }
                            case 1374058921: {
                                v3 = oc.mdjp("mdzp", mdkz(int ), (int)177);
lbl34:
                                // 2 sources

                                v2 /* !! */  = (long)(v3 - oc.mdjp("mdzn", mdkz(int ), (int)175));
                                continue block22;
                            }
                        }
                        break;
                    }
                    var1_3 = oc.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (boolean)oc.mdjp("mdzq", mdjm(int ), (int)234);
                    if (var1_3 != false) return (boolean)oc.mdjp("mdzq", mdjm(int ), (int)234);
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdzr", mdkz(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == oc.mdjp("mdzs", mdjm(int ), (int)235)) {
                            return this.closeInventory;
                        }
                        v4 /* !! */  = (long)oc.mdjp("mdzt", mdjm(int ), (int)236);
                    }
                }
                case 0: {
                    var2_2 /* !! */  = (int)oc.mdjp("mdzu", mdjm(int ), (int)237);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oc.mdjp("mdzx", mdjm(int ), (int)240);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)oc.mdjp("mdzv", mdjm(int ), (int)238);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl66
            break;
        }
        do {
            if (true) ** continue;
lbl66:
            // 2 sources

            var2_2 /* !! */  = (int)oc.mdjp("mdzw", mdjm(int ), (int)239);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static oc defaults() {
        boolean bl2;
        Object object = vb;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - oc.mdjp("mdla", mdkz(int ), (int)1);
            }
            switch ((int)object) {
                case -1891067990: {
                    callSite = oc.mdjp("mdlb", mdkz(int ), (int)2);
                    continue block11;
                }
                case -1411425335: {
                    callSite = oc.mdjp("mdlc", mdkz(int ), (int)3);
                    continue block11;
                }
                case 396374116: {
                    break block11;
                }
                case 546975010: {
                    callSite = oc.mdjp("mdld", mdkz(int ), (int)4);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = vb;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - oc.mdjp("mdle", mdkz(int ), (int)5);
            }
            switch ((int)object2) {
                case -616870525: {
                    callSite = oc.mdjp("mdlf", mdkz(int ), (int)6);
                    continue block12;
                }
                case 396374116: {
                    break block12;
                }
                case 1908111000: {
                    callSite = oc.mdjp("mdlg", mdkz(int ), (int)7);
                    continue block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = vb - oc.mdjp("mdlh", mdkz(int ), (int)8)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == oc.mdjp("mdli", mdjm(int ), (int)31)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = oc.mdjp("mdlj", mdjm(int ), (int)32);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = vb - oc.mdjp("mdlk", mdkz(int ), (int)9)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == oc.mdjp("mdll", mdjm(int ), (int)33)) break;
            object4 = oc.mdjp("mdlm", mdjm(int ), (int)34);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = vb - oc.mdjp("mdln", mdkz(int ), (int)10)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == oc.mdjp("mdlo", mdjm(int ), (int)35)) {
                return new oc();
            }
            object5 = oc.mdjp("mdlp", mdjm(int ), (int)36);
        }
    }

    private static /* synthetic */ void megu() {
        oc.mdjo[0] = -1963857633;
        oc.mdjo[1] = -1541556833;
        oc.mdjo[2] = 230190382;
        oc.mdjo[3] = -1899542333;
        oc.mdjo[4] = 699020253;
        oc.mdjo[5] = 438744637;
        oc.mdjo[6] = -254204936;
        oc.mdjo[7] = -1259384066;
        oc.mdjo[8] = -491971699;
        oc.mdjo[9] = 659606586;
        oc.mdjo[10] = 1766615356;
        oc.mdjo[11] = -1510264393;
        oc.mdjo[12] = -417416771;
        oc.mdjo[13] = 464132260;
        oc.mdjo[14] = 1592215203;
        oc.mdjo[15] = 402328895;
        oc.mdjo[16] = 864799467;
        oc.mdjo[17] = -1279852055;
        oc.mdjo[18] = 1607734349;
        oc.mdjo[19] = -1804461655;
        oc.mdjo[20] = 1715687747;
        oc.mdjo[21] = -1529202458;
        oc.mdjo[22] = -319780580;
        oc.mdjo[23] = -2055567682;
        oc.mdjo[24] = 180521944;
        oc.mdjo[25] = 1319575349;
        oc.mdjo[26] = -397423246;
        oc.mdjo[27] = -1164237763;
        oc.mdjo[28] = -1509136849;
        oc.mdjo[29] = -2041324433;
        oc.mdjo[30] = 2144805034;
        oc.mdjo[31] = -1074565612;
        oc.mdjo[32] = 1577556072;
        oc.mdjo[33] = 505946088;
        oc.mdjo[34] = -1171621609;
        oc.mdjo[35] = 1157749612;
        oc.mdjo[36] = 31144326;
        oc.mdjo[37] = -1527076029;
        oc.mdjo[38] = -489950334;
        oc.mdjo[39] = -393213825;
        oc.mdjo[40] = 2085361586;
        oc.mdjo[41] = -2009261590;
        oc.mdjo[42] = -905915614;
        oc.mdjo[43] = -1139498454;
        oc.mdjo[44] = -299557373;
        oc.mdjo[45] = -159717389;
        oc.mdjo[46] = -930364968;
        oc.mdjo[47] = 1990999308;
        oc.mdjo[48] = -349386168;
        oc.mdjo[49] = 939445529;
        oc.mdjo[50] = -1637200383;
        oc.mdjo[51] = -1960397272;
        oc.mdjo[52] = -1325568164;
        oc.mdjo[53] = -902606884;
        oc.mdjo[54] = 1705100394;
        oc.mdjo[55] = 1652053607;
        oc.mdjo[56] = -1264164361;
        oc.mdjo[57] = 20307615;
        oc.mdjo[58] = 1107864450;
        oc.mdjo[59] = 528190112;
        oc.mdjo[60] = 1650231439;
        oc.mdjo[61] = 1354018079;
        oc.mdjo[62] = -1653692332;
        oc.mdjo[63] = -2010383621;
        oc.mdjo[64] = 631397929;
        oc.mdjo[65] = 661454419;
        oc.mdjo[66] = 1645187786;
        oc.mdjo[67] = 6951590;
        oc.mdjo[68] = -680615410;
        oc.mdjo[69] = 830305837;
        oc.mdjo[70] = -1641501994;
        oc.mdjo[71] = 222471508;
        oc.mdjo[72] = 857846441;
        oc.mdjo[73] = -1580860337;
        oc.mdjo[74] = -1351881988;
        oc.mdjo[75] = -1069724373;
        oc.mdjo[76] = 191228758;
        oc.mdjo[77] = 997980030;
        oc.mdjo[78] = 1573320642;
        oc.mdjo[79] = -495169369;
        oc.mdjo[80] = 310214082;
        oc.mdjo[81] = 1355823141;
        oc.mdjo[82] = 96726147;
        oc.mdjo[83] = 980332195;
        oc.mdjo[84] = -713471475;
        oc.mdjo[85] = -705709876;
        oc.mdjo[86] = -2087235826;
        oc.mdjo[87] = 403449481;
        oc.mdjo[88] = -1717126835;
        oc.mdjo[89] = 1911965519;
        oc.mdjo[90] = -8950274;
        oc.mdjo[91] = -652888185;
        oc.mdjo[92] = -1343823431;
        oc.mdjo[93] = -195348170;
        oc.mdjo[94] = -1058681987;
        oc.mdjo[95] = 795542009;
        oc.mdjo[96] = 1565884207;
        oc.mdjo[97] = -351484470;
        oc.mdjo[98] = -91527767;
        oc.mdjo[99] = -319275330;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc closeInventory(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdri", mdkz(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oc.mdjp("mdrj", mdjm(int ), (int)121)) break;
            v0 /* !! */  = (long)oc.mdjp("mdrk", mdjm(int ), (int)122);
        }
        var4_2 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(oc.mdjp("mdrm", mdkz(int ), (int)77) - oc.mdjp("mdrl", mdkz(int ), (int)76));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2129531179: {
                    continue block19;
                }
                case 396374116: {
                    break block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = oc.b;
        v2 /* !! */  = oc.vb;
        if (true) ** GOTO lbl21
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - oc.mdjp("mdrn", mdkz(int ), (int)78));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1257350640: {
                    v3 = oc.mdjp("mdro", mdkz(int ), (int)79);
                    continue block20;
                }
                case -43466125: {
                    v3 = oc.mdjp("mdrp", mdkz(int ), (int)80);
                    continue block20;
                }
                case 396374116: {
                    break block20;
                }
                case 1476036963: {
                    v3 = oc.mdjp("mdrq", mdkz(int ), (int)81);
                    continue block20;
                }
            }
            break;
        }
        var2_4 = oc.a;
        if (!var4_2) ** GOTO lbl40
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl40:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdrr", mdkz(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == oc.mdjp("mdrs", mdjm(int ), (int)123)) break;
                    v4 /* !! */  = (long)oc.mdjp("mdrt", mdjm(int ), (int)124);
                }
                this.closeInventory = var1_1;
                if (var2_4 || var2_4) continue block21;
                return this;
                case 0: {
                    do {
                        var3_3 /* !! */  = (int)oc.mdjp("mdru", mdjm(int ), (int)125);
                    } while (!var4_2);
                    throw null;
                }
lbl54:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)oc.mdjp("mdrv", mdjm(int ), (int)126);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)oc.mdjp("mdrw", mdjm(int ), (int)127);
                        if (!var4_2) ** GOTO lbl54
                        throw null;
                    }
                }
lbl63:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)oc.mdjp("mdrx", mdjm(int ), (int)128);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 4: {
                    var3_3 /* !! */  = (int)oc.mdjp("mdry", mdjm(int ), (int)129);
                    if (!var4_2) ** GOTO lbl63
                    throw null;
                }
                case 5: 
            }
        }
        var3_3 /* !! */  = (int)oc.mdjp("mdrz", mdjm(int ), (int)130);
        ** while (!var4_2)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long mdkz(int n2) {
        return mdkf[n2] ^ mdkg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc resumeDelay(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdwo", mdkz(int ), (int)134)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oc.mdjp("mdwp", mdjm(int ), (int)198)) break;
            v0 /* !! */  = (long)oc.mdjp("mdwq", mdjm(int ), (int)199);
        }
        var5_3 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdwr", mdkz(int ), (int)135));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 44393328: {
                    v2 = oc.mdjp("mdws", mdkz(int ), (int)136);
                    continue block26;
                }
                case 380199267: {
                    v2 = oc.mdjp("mdwt", mdkz(int ), (int)137);
                    continue block26;
                }
                case 396374116: {
                    break block26;
                }
            }
            break;
        }
        var4_4 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl25
        block27: while (true) {
            v3 /* !! */  = (long)(oc.mdjp("mdwv", mdkz(int ), (int)139) - oc.mdjp("mdwu", mdkz(int ), (int)138));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -299639736: {
                    continue block27;
                }
                case 396374116: {
                    break block27;
                }
            }
            break;
        }
        var3_5 = oc.a;
        if (!var5_3) ** GOTO lbl37
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl37:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl-1000
                v4 /* !! */  = oc.vb;
                if (true) ** GOTO lbl42
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - oc.mdjp("mdww", mdkz(int ), (int)140));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1862622780: {
                            v5 = oc.mdjp("mdwx", mdkz(int ), (int)141);
                            continue block29;
                        }
                        case -1754140889: {
                            v5 = oc.mdjp("mdwy", mdkz(int ), (int)142);
                            continue block29;
                        }
                        case 396374116: {
                            break block29;
                        }
                        case 1178503186: {
                            v5 = oc.mdjp("mdwz", mdkz(int ), (int)143);
                            continue block29;
                        }
                    }
                    break;
                }
                this.resumeDelayMin = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl-1000
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdxa", mdkz(int ), (int)144)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == oc.mdjp("mdxb", mdjm(int ), (int)200)) break;
                    v6 /* !! */  = (long)oc.mdjp("mdxc", mdjm(int ), (int)201);
                }
                this.resumeDelayMax = var2_2;
                if (var3_5 || var3_5) continue block28;
                return this;
lbl64:
                // 3 sources

                case 0: {
                    var4_4 /* !! */  = (int)oc.mdjp("mdxd", mdjm(int ), (int)202);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl74
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_4 /* !! */  = (int)oc.mdjp("mdxe", mdjm(int ), (int)203);
                        if (!var5_3) ** GOTO lbl64
                        throw null;
                    }
                }
lbl74:
                // 2 sources

                case 2: {
                    var4_4 /* !! */  = (int)oc.mdjp("mdxf", mdjm(int ), (int)204);
                    if (var5_3) {
                        throw null;
                    }
                }
                case 3: {
                    var4_4 /* !! */  = (int)oc.mdjp("mdxg", mdjm(int ), (int)205);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
                case 4: {
                    do {
                        var4_4 /* !! */  = (int)oc.mdjp("mdxh", mdjm(int ), (int)206);
                    } while (!var5_3);
                    throw null;
                }
lbl88:
                // 2 sources

                case 5: {
                    do {
                        var4_4 /* !! */  = (int)oc.mdjp("mdxi", mdjm(int ), (int)207);
                    } while (!var5_3);
                    throw null;
                }
                case 6: {
                    var4_4 /* !! */  = (int)oc.mdjp("mdxj", mdjm(int ), (int)208);
                    if (!var5_3) ** GOTO lbl64
                    throw null;
                }
                case 7: 
            }
        }
        var4_4 /* !! */  = (int)oc.mdjp("mdxk", mdjm(int ), (int)209);
        ** while (!var5_3)
lbl100:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void megv() {
        oc.mdjo[100] = -70981651;
        oc.mdjo[101] = -1813548464;
        oc.mdjo[102] = 1226152844;
        oc.mdjo[103] = 2114284232;
        oc.mdjo[104] = 2011710766;
        oc.mdjo[105] = 1311449824;
        oc.mdjo[106] = 140592780;
        oc.mdjo[107] = -1656423577;
        oc.mdjo[108] = -1168746256;
        oc.mdjo[109] = 828853887;
        oc.mdjo[110] = -814630637;
        oc.mdjo[111] = 657957303;
        oc.mdjo[112] = -87038989;
        oc.mdjo[113] = -980059896;
        oc.mdjo[114] = 988380244;
        oc.mdjo[115] = 1728852442;
        oc.mdjo[116] = -1562001803;
        oc.mdjo[117] = -1040679147;
        oc.mdjo[118] = 164087307;
        oc.mdjo[119] = 904124609;
        oc.mdjo[120] = -1250903557;
        oc.mdjo[121] = -132384614;
        oc.mdjo[122] = 482783120;
        oc.mdjo[123] = -1817274168;
        oc.mdjo[124] = 1820302479;
        oc.mdjo[125] = 1172504199;
        oc.mdjo[126] = 274262459;
        oc.mdjo[127] = 1991555207;
        oc.mdjo[128] = 530138572;
        oc.mdjo[129] = 429315769;
        oc.mdjo[130] = -568622850;
        oc.mdjo[131] = 1585937500;
        oc.mdjo[132] = -775039335;
        oc.mdjo[133] = -593882968;
        oc.mdjo[134] = -177030678;
        oc.mdjo[135] = -142609543;
        oc.mdjo[136] = 1581844972;
        oc.mdjo[137] = 1045662396;
        oc.mdjo[138] = 648494040;
        oc.mdjo[139] = -771340505;
        oc.mdjo[140] = 289254597;
        oc.mdjo[141] = 268250633;
        oc.mdjo[142] = -146366474;
        oc.mdjo[143] = -160732728;
        oc.mdjo[144] = -1715175146;
        oc.mdjo[145] = -207952135;
        oc.mdjo[146] = -278276736;
        oc.mdjo[147] = -1984027328;
        oc.mdjo[148] = 690289435;
        oc.mdjo[149] = 1394833340;
        oc.mdjo[150] = 1712949525;
        oc.mdjo[151] = -2006700962;
        oc.mdjo[152] = -1539362589;
        oc.mdjo[153] = 671289857;
        oc.mdjo[154] = 1707735665;
        oc.mdjo[155] = -753406692;
        oc.mdjo[156] = 2140635329;
        oc.mdjo[157] = -455205121;
        oc.mdjo[158] = 372992528;
        oc.mdjo[159] = 1071464416;
        oc.mdjo[160] = -1695547359;
        oc.mdjo[161] = 1731548686;
        oc.mdjo[162] = -1764784514;
        oc.mdjo[163] = 15463262;
        oc.mdjo[164] = -2116254256;
        oc.mdjo[165] = -713861857;
        oc.mdjo[166] = 1457979947;
        oc.mdjo[167] = 1061227480;
        oc.mdjo[168] = 485685361;
        oc.mdjo[169] = 38665837;
        oc.mdjo[170] = -905915042;
        oc.mdjo[171] = -1163512491;
        oc.mdjo[172] = 745251198;
        oc.mdjo[173] = -1194246747;
        oc.mdjo[174] = 728364178;
        oc.mdjo[175] = -614732546;
        oc.mdjo[176] = -256821133;
        oc.mdjo[177] = -1898785197;
        oc.mdjo[178] = -140125780;
        oc.mdjo[179] = 1764469381;
        oc.mdjo[180] = 588090096;
        oc.mdjo[181] = 688186149;
        oc.mdjo[182] = 1576756816;
        oc.mdjo[183] = -1011111432;
        oc.mdjo[184] = 1828285560;
        oc.mdjo[185] = 1618115970;
        oc.mdjo[186] = -1821099389;
        oc.mdjo[187] = 2080486900;
        oc.mdjo[188] = 485104178;
        oc.mdjo[189] = 712042167;
        oc.mdjo[190] = 43563687;
        oc.mdjo[191] = -1922151901;
        oc.mdjo[192] = 1229705138;
        oc.mdjo[193] = -1030079583;
        oc.mdjo[194] = -183625161;
        oc.mdjo[195] = -1829775326;
        oc.mdjo[196] = 1221763559;
        oc.mdjo[197] = 435239650;
        oc.mdjo[198] = 1356504782;
        oc.mdjo[199] = 1525260352;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc waitStopDelay(int var1_1, int var2_2) {
        v0 /* !! */  = oc.vb;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - oc.mdjp("mdsx", mdkz(int ), (int)92));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 396374116: {
                    break block33;
                }
                case 416153388: {
                    v1 = oc.mdjp("mdsy", mdkz(int ), (int)93);
                    continue block33;
                }
                case 422193683: {
                    v1 = oc.mdjp("mdsz", mdkz(int ), (int)94);
                    continue block33;
                }
                case 1519473357: {
                    v1 = oc.mdjp("mdta", mdkz(int ), (int)95);
                    continue block33;
                }
            }
            break;
        }
        var5_3 = oc.c;
        v2 /* !! */  = oc.vb;
        if (true) ** GOTO lbl22
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - oc.mdjp("mdtb", mdkz(int ), (int)96));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1855511553: {
                    v3 = oc.mdjp("mdtc", mdkz(int ), (int)97);
                    continue block34;
                }
                case -648131960: {
                    v3 = oc.mdjp("mdtd", mdkz(int ), (int)98);
                    continue block34;
                }
                case 287934394: {
                    v3 = oc.mdjp("mdte", mdkz(int ), (int)99);
                    continue block34;
                }
                case 396374116: {
                    break block34;
                }
            }
            break;
        }
        var4_4 /* !! */  = oc.b;
        v4 /* !! */  = oc.vb;
        if (true) ** GOTO lbl39
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - oc.mdjp("mdtf", mdkz(int ), (int)100));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 396374116: {
                    break block35;
                }
                case 967707081: {
                    v5 = oc.mdjp("mdtg", mdkz(int ), (int)101);
                    continue block35;
                }
                case 1909462610: {
                    v5 = oc.mdjp("mdth", mdkz(int ), (int)102);
                    continue block35;
                }
                case 2086297129: {
                    v5 = oc.mdjp("mdti", mdkz(int ), (int)103);
                    continue block35;
                }
            }
            break;
        }
        var3_5 = oc.a;
        if (var5_3) {
            throw null;
lbl54:
            // 3 sources

            return null;
        }
        if (var3_5 || var3_5) ** GOTO lbl54
        v6 /* !! */  = oc.vb;
        if (true) ** GOTO lbl61
        block37: while (true) {
            v6 /* !! */  = (long)(v7 - oc.mdjp("mdtj", mdkz(int ), (int)104));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 396374116: {
                    break block37;
                }
                case 606538563: {
                    v7 = oc.mdjp("mdtk", mdkz(int ), (int)105);
                    continue block37;
                }
                case 1557511545: {
                    v7 = oc.mdjp("mdtl", mdkz(int ), (int)106);
                    continue block37;
                }
            }
            break;
        }
        this.waitStopDelayMin = var1_1;
        if (var3_5 || var3_5) ** GOTO lbl54
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdtm", mdkz(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == oc.mdjp("mdtn", mdjm(int ), (int)145)) break;
            v8 /* !! */  = (long)oc.mdjp("mdto", mdjm(int ), (int)146);
        }
        this.waitStopDelayMax = var2_2;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** continue;
                return this;
            }
            case 0: {
                var4_4 /* !! */  = (int)oc.mdjp("mdtp", mdjm(int ), (int)147);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl88:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)oc.mdjp("mdtq", mdjm(int ), (int)148);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl103
                    break;
                }
            }
            case 2: {
                var4_4 /* !! */  = (int)oc.mdjp("mdtr", mdjm(int ), (int)149);
                if (!var5_3) break;
                throw null;
            }
            case 3: {
                var4_4 /* !! */  = (int)oc.mdjp("mdts", mdjm(int ), (int)150);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl103:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)oc.mdjp("mdtt", mdjm(int ), (int)151);
                if (!var5_3) ** GOTO lbl88
                throw null;
            }
lbl107:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)oc.mdjp("mdtu", mdjm(int ), (int)152);
                if (!var5_3) ** GOTO lbl103
                throw null;
            }
lbl111:
            // 2 sources

            case 6: {
                do {
                    var4_4 /* !! */  = (int)oc.mdjp("mdtv", mdjm(int ), (int)153);
                } while (!var5_3);
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)oc.mdjp("mdtw", mdjm(int ), (int)154);
        ** while (!var5_3)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc postSwapDelay(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdvo", mdkz(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("mdvp", mdjm(int ), (int)186)) break;
            v0 /* !! */  = (long)oc.mdjp("mdvq", mdjm(int ), (int)187);
        }
        var5_3 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdvr", mdkz(int ), (int)121));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2118790045: {
                    v2 = oc.mdjp("mdvs", mdkz(int ), (int)122);
                    continue block29;
                }
                case -957637425: {
                    v2 = oc.mdjp("mdvt", mdkz(int ), (int)123);
                    continue block29;
                }
                case -388468850: {
                    v2 = oc.mdjp("mdvu", mdkz(int ), (int)124);
                    continue block29;
                }
                case 396374116: {
                    break block29;
                }
            }
            break;
        }
        var4_4 /* !! */  = oc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdvv", mdkz(int ), (int)125)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oc.mdjp("mdvw", mdjm(int ), (int)188)) break;
            v3 /* !! */  = (long)oc.mdjp("mdvx", mdjm(int ), (int)189);
        }
        var3_5 = oc.a;
        if (var5_3) {
            throw null;
lbl34:
            // 4 sources

            return null;
        }
        if (var3_5 || var3_5) ** GOTO lbl34
        v4 /* !! */  = oc.vb;
        if (true) ** GOTO lbl41
        block32: while (true) {
            v4 /* !! */  = (long)(v5 - oc.mdjp("mdvy", mdkz(int ), (int)126));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1553093939: {
                    v5 = oc.mdjp("mdvz", mdkz(int ), (int)127);
                    continue block32;
                }
                case 14272557: {
                    v5 = oc.mdjp("mdwa", mdkz(int ), (int)128);
                    continue block32;
                }
                case 42233489: {
                    v5 = oc.mdjp("mdwb", mdkz(int ), (int)129);
                    continue block32;
                }
                case 396374116: {
                    break block32;
                }
            }
            break;
        }
        this.postSwapDelayMin = var1_1;
        if (var3_5 || var3_5) ** GOTO lbl34
        v6 /* !! */  = oc.vb;
        if (true) ** GOTO lbl59
        block33: while (true) {
            v6 /* !! */  = (long)(v7 - oc.mdjp("mdwc", mdkz(int ), (int)130));
lbl59:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1751968861: {
                    v7 = oc.mdjp("mdwd", mdkz(int ), (int)131);
                    continue block33;
                }
                case -1559209160: {
                    v7 = oc.mdjp("mdwe", mdkz(int ), (int)132);
                    continue block33;
                }
                case -312904040: {
                    v7 = oc.mdjp("mdwf", mdkz(int ), (int)133);
                    continue block33;
                }
                case 396374116: {
                    break block33;
                }
            }
            break;
        }
        this.postSwapDelayMax = var2_2;
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwg", mdjm(int ), (int)190);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_4 /* !! */  = (int)oc.mdjp("mdwh", mdjm(int ), (int)191);
                    if (!var5_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl89:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwi", mdjm(int ), (int)192);
                if (!var5_3) break;
                throw null;
            }
lbl93:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwj", mdjm(int ), (int)193);
                if (!var5_3) ** GOTO lbl89
                throw null;
            }
lbl97:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwk", mdjm(int ), (int)194);
                if (var5_3) {
                    throw null;
                }
            }
            case 5: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwl", mdjm(int ), (int)195);
                if (!var5_3) ** GOTO lbl93
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)oc.mdjp("mdwm", mdjm(int ), (int)196);
                if (!var5_3) ** GOTO lbl89
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)oc.mdjp("mdwn", mdjm(int ), (int)197);
        ** while (!var5_3)
lbl112:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldStopMovement() {
        v0 /* !! */  = oc.vb;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - oc.mdjp("mdyd", mdkz(int ), (int)155));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1664751720: {
                    v1 = oc.mdjp("mdye", mdkz(int ), (int)156);
                    continue block19;
                }
                case -1170845607: {
                    v1 = oc.mdjp("mdyf", mdkz(int ), (int)157);
                    continue block19;
                }
                case 396374116: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = oc.c;
        v2 /* !! */  = oc.vb;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(oc.mdjp("mdyh", mdkz(int ), (int)159) - oc.mdjp("mdyg", mdkz(int ), (int)158));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -333854523: {
                    continue block20;
                }
                case 396374116: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(oc.mdjp("mdyj", mdkz(int ), (int)161) - oc.mdjp("mdyi", mdkz(int ), (int)160));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 396374116: {
                    break block21;
                }
                case 2058906364: {
                    continue block21;
                }
            }
            break;
        }
        var1_3 = oc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (boolean)oc.mdjp("mdyk", mdjm(int ), (int)218);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdyl", mdkz(int ), (int)162)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oc.mdjp("mdym", mdjm(int ), (int)219)) break;
                    v4 /* !! */  = (long)oc.mdjp("mdyn", mdjm(int ), (int)220);
                }
                return this.stopMovement;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)oc.mdjp("mdyo", mdjm(int ), (int)221);
                } while (!var3_1);
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)oc.mdjp("mdyp", mdjm(int ), (int)222);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)oc.mdjp("mdyq", mdjm(int ), (int)223);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)oc.mdjp("mdyr", mdjm(int ), (int)224);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int randomWaitStopDelay() {
        block36: {
            while (true) {
                block37: {
                    if ((v0 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mece", mdkz(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != oc.mdjp("mecf", mdjm(int ), (int)261)) break block37;
                    var3_1 = oc.c;
                    v1 /* !! */  = oc.vb;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)oc.mdjp("mecg", mdjm(int ), (int)262);
            }
            block22: while (true) {
                v1 /* !! */  = (long)(v2 - oc.mdjp("mech", mdkz(int ), (int)218));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1942316667: {
                        v2 = oc.mdjp("meci", mdkz(int ), (int)219);
                        continue block22;
                    }
                    case 396374116: {
                        break block22;
                    }
                    case 1927222825: {
                        v2 = oc.mdjp("mecj", mdkz(int ), (int)220);
                        continue block22;
                    }
                }
                break;
            }
            var2_2 /* !! */  = oc.b;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block23: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = oc.vb;
                        block24: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -999353568: {
                                    v3 /* !! */  = (long)(oc.mdjp("mecl", mdkz(int ), (int)222) - oc.mdjp("meck", mdkz(int ), (int)221));
                                    continue block24;
                                }
                                case 396374116: {
                                    break block24;
                                }
                            }
                            break;
                        }
                        var1_3 = oc.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (int)oc.mdjp("mecm", mdjm(int ), (int)263);
                        if (var1_3 != false) return (int)oc.mdjp("mecm", mdjm(int ), (int)263);
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mecn", mdkz(int ), (int)223)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  != oc.mdjp("meco", mdjm(int ), (int)264)) ** GOTO lbl47
                            v5 /* !! */  = oc.vb;
                            if (true) ** GOTO lbl55
lbl47:
                            // 1 sources

                            v4 /* !! */  = (long)oc.mdjp("mecp", mdjm(int ), (int)265);
                        }
                    }
                    case 0: {
                        ** GOTO lbl74
                    }
                    case 3: {
                        break block36;
                    }
                    block26: while (true) {
                        v5 /* !! */  = (long)(v6 - oc.mdjp("mecq", mdkz(int ), (int)224));
lbl55:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1198763516: {
                                v6 = oc.mdjp("mecr", mdkz(int ), (int)225);
                                continue block26;
                            }
                            case -694525395: {
                                v6 = oc.mdjp("mecs", mdkz(int ), (int)226);
                                continue block26;
                            }
                            case -10641913: {
                                v6 = oc.mdjp("mect", mdkz(int ), (int)227);
                                continue block26;
                            }
                            case 396374116: {
                                break block26;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = oc.vb - oc.mdjp("mecu", mdkz(int ), (int)228)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == oc.mdjp("mecv", mdjm(int ), (int)266)) {
                            return this.random(this.waitStopDelayMin, this.waitStopDelayMax);
                        }
                        v7 /* !! */  = (long)oc.mdjp("mecw", mdjm(int ), (int)267);
                    }
lbl74:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)oc.mdjp("mecx", mdjm(int ), (int)268);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block23;
                        throw null;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)oc.mdjp("mecy", mdjm(int ), (int)269);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)oc.mdjp("mecz", mdjm(int ), (int)270);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)oc.mdjp("meda", mdjm(int ), (int)271);
        ** while (!var3_1)
lbl92:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static oc instant() {
        block53: {
            while (true) {
                block54: {
                    if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdlu", mdkz(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  != oc.mdjp("mdlv", mdjm(int ), (int)41)) break block54;
                    var2 = oc.c;
                    v1 /* !! */  = oc.vb;
                    if (true) ** GOTO lbl12
                }
                v0 /* !! */  = (long)oc.mdjp("mdlw", mdjm(int ), (int)42);
            }
            block34: while (true) {
                v1 /* !! */  = (long)(v2 - oc.mdjp("mdlx", mdkz(int ), (int)12));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1419589801: {
                        v2 = oc.mdjp("mdly", mdkz(int ), (int)13);
                        continue block34;
                    }
                    case -1361075779: {
                        v2 = oc.mdjp("mdlz", mdkz(int ), (int)14);
                        continue block34;
                    }
                    case -1174267738: {
                        v2 = oc.mdjp("mdma", mdkz(int ), (int)15);
                        continue block34;
                    }
                    case 396374116: {
                        break block34;
                    }
                }
                break;
            }
            var1_1 /* !! */  = oc.b;
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdmb", mdkz(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == oc.mdjp("mdmc", mdjm(int ), (int)43)) {
                            var0_2 = oc.a;
                            if (var2) {
                                throw null;
                            }
                            break;
                        }
                        v3 /* !! */  = (long)oc.mdjp("mdmd", mdjm(int ), (int)44);
                    }
                    if (var0_2 != false) return null;
                    if (var0_2 != false) return null;
                    v4 /* !! */  = oc.vb;
                    block36: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case 129920124: {
                                v5 = oc.mdjp("mdmf", mdkz(int ), (int)18);
                                ** GOTO lbl52
                            }
                            case 396374116: {
                                break block36;
                            }
                            case 1169907010: {
                                v5 = oc.mdjp("mdmg", mdkz(int ), (int)19);
                                ** GOTO lbl52
                            }
                            case 1752204696: {
                                v5 = oc.mdjp("mdmh", mdkz(int ), (int)20);
lbl52:
                                // 3 sources

                                v4 /* !! */  = (long)(v5 - oc.mdjp("mdme", mdkz(int ), (int)17));
                                continue block36;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = oc.vb;
                    block37: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -1209545683: {
                                v7 = oc.mdjp("mdmj", mdkz(int ), (int)22);
                                ** GOTO lbl62
                            }
                            case -137961479: {
                                v7 = oc.mdjp("mdmk", mdkz(int ), (int)23);
lbl62:
                                // 2 sources

                                v6 /* !! */  = (long)(v7 - oc.mdjp("mdmi", mdkz(int ), (int)21));
                                continue block37;
                            }
                            case 396374116: {
                                break block37;
                            }
                        }
                        break;
                    }
                    v8 = new oc();
                    v9 = oc.mdjp("mdml", mdjm(int ), (int)45);
                    v10 /* !! */  = oc.vb;
                    block38: while (true) {
                        switch ((int)v10 /* !! */ ) {
                            case -2098406609: {
                                v11 = oc.mdjp("mdmn", mdkz(int ), (int)25);
                                ** GOTO lbl81
                            }
                            case 295770656: {
                                v11 = oc.mdjp("mdmo", mdkz(int ), (int)26);
                                ** GOTO lbl81
                            }
                            case 396374116: {
                                break block38;
                            }
                            case 484575089: {
                                v11 = oc.mdjp("mdmp", mdkz(int ), (int)27);
lbl81:
                                // 3 sources

                                v10 /* !! */  = (long)(v11 - oc.mdjp("mdmm", mdkz(int ), (int)24));
                                continue block38;
                            }
                        }
                        break;
                    }
                    v12 = v8.stopMovement((boolean)v9);
                    v13 = oc.mdjp("mdmq", mdjm(int ), (int)46);
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mdmr", mdkz(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == oc.mdjp("mdms", mdjm(int ), (int)47)) {
                            v15 = v12.stopSprint((boolean)v13);
                            v16 = oc.mdjp("mdmu", mdjm(int ), (int)49);
                            v17 = oc.mdjp("mdmv", mdjm(int ), (int)50);
                            v18 /* !! */  = oc.vb;
                            break block53;
                        }
                        v14 /* !! */  = (long)oc.mdjp("mdmt", mdjm(int ), (int)48);
                    }
                }
                case 2: {
                    var1_1 /* !! */  = (int)oc.mdjp("mdnu", mdjm(int ), (int)69);
                    if (var2) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl105
                }
                case 3: {
                    var1_1 /* !! */  = (int)oc.mdjp("mdnv", mdjm(int ), (int)70);
                    if (var2) {
                        throw null;
                    }
lbl105:
                    // 3 sources

                    var1_1 /* !! */  = (int)oc.mdjp("mdns", mdjm(int ), (int)67);
                    if (var2) {
                        throw null;
                    }
                }
                case 1: 
            }
            do {
                var1_1 /* !! */  = (int)oc.mdjp("mdnt", mdjm(int ), (int)68);
            } while (!var2);
            throw null;
        }
        block41: while (true) {
            switch ((int)v18 /* !! */ ) {
                case 396374116: {
                    break block41;
                }
                case 2034619036: {
                    v18 /* !! */  = (long)(oc.mdjp("mdmx", mdkz(int ), (int)30) - oc.mdjp("mdmw", mdkz(int ), (int)29));
                    continue block41;
                }
            }
            break;
        }
        v19 = v15.preStopDelay((int)v16, (int)v17);
        v20 = oc.mdjp("mdmy", mdjm(int ), (int)51);
        v21 = oc.mdjp("mdmz", mdjm(int ), (int)52);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_3 = oc.vb - oc.mdjp("mdna", mdkz(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == oc.mdjp("mdnb", mdjm(int ), (int)53)) break;
            v22 /* !! */  = (long)oc.mdjp("mdnc", mdjm(int ), (int)54);
        }
        v23 = v19.waitStopDelay((int)v20, (int)v21);
        v24 = oc.mdjp("mdnd", mdjm(int ), (int)55);
        v25 = oc.mdjp("mdne", mdjm(int ), (int)56);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_4 = oc.vb - oc.mdjp("mdnf", mdkz(int ), (int)32)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == oc.mdjp("mdng", mdjm(int ), (int)57)) break;
            v26 /* !! */  = (long)oc.mdjp("mdnh", mdjm(int ), (int)58);
        }
        v27 = v23.preSwapDelay((int)v24, (int)v25);
        v28 = oc.mdjp("mdni", mdjm(int ), (int)59);
        v29 = oc.mdjp("mdnj", mdjm(int ), (int)60);
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_5 = oc.vb - oc.mdjp("mdnk", mdkz(int ), (int)33)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == oc.mdjp("mdnl", mdjm(int ), (int)61)) break;
            v30 /* !! */  = (long)oc.mdjp("mdnm", mdjm(int ), (int)62);
        }
        v31 = v27.postSwapDelay((int)v28, (int)v29);
        v32 = oc.mdjp("mdnn", mdjm(int ), (int)63);
        v33 = oc.mdjp("mdno", mdjm(int ), (int)64);
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_6 = oc.vb - oc.mdjp("mdnp", mdkz(int ), (int)34)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == oc.mdjp("mdnq", mdjm(int ), (int)65)) {
                return v31.resumeDelay((int)v32, (int)v33);
            }
            v34 /* !! */  = (long)oc.mdjp("mdnr", mdjm(int ), (int)66);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int randomResumeDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("meew", mdkz(int ), (int)252)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("meex", mdjm(int ), (int)296)) break;
            v0 /* !! */  = (long)oc.mdjp("meey", mdjm(int ), (int)297);
        }
        var3_1 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("meez", mdkz(int ), (int)253));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 342109450: {
                    v2 = oc.mdjp("mefa", mdkz(int ), (int)254);
                    continue block23;
                }
                case 396374116: {
                    break block23;
                }
                case 1280096728: {
                    v2 = oc.mdjp("mefb", mdkz(int ), (int)255);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - oc.mdjp("mefc", mdkz(int ), (int)256));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -788736919: {
                    v4 = oc.mdjp("mefd", mdkz(int ), (int)257);
                    continue block24;
                }
                case 203625604: {
                    v4 = oc.mdjp("mefe", mdkz(int ), (int)258);
                    continue block24;
                }
                case 260262070: {
                    v4 = oc.mdjp("meff", mdkz(int ), (int)259);
                    continue block24;
                }
                case 396374116: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = oc.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)oc.mdjp("mefg", mdjm(int ), (int)298);
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                v5 /* !! */  = oc.vb;
                if (true) ** GOTO lbl50
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - oc.mdjp("mefh", mdkz(int ), (int)260));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1999257465: {
                            v6 = oc.mdjp("mefi", mdkz(int ), (int)261);
                            continue block26;
                        }
                        case 396374116: {
                            break block26;
                        }
                        case 1588567415: {
                            v6 = oc.mdjp("mefj", mdkz(int ), (int)262);
                            continue block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mefk", mdkz(int ), (int)263)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == oc.mdjp("mefl", mdjm(int ), (int)299)) break;
                    v7 /* !! */  = (long)oc.mdjp("mefm", mdjm(int ), (int)300);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mefn", mdkz(int ), (int)264)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == oc.mdjp("mefo", mdjm(int ), (int)301)) break;
                    v8 /* !! */  = (long)oc.mdjp("mefp", mdjm(int ), (int)302);
                }
                return this.random(this.resumeDelayMin, this.resumeDelayMax);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)oc.mdjp("mefq", mdjm(int ), (int)303);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl82
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)oc.mdjp("mefr", mdjm(int ), (int)304);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl82:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)oc.mdjp("mefs", mdjm(int ), (int)305);
                    if (!var3_1) break block25;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)oc.mdjp("meft", mdjm(int ), (int)306);
        ** while (!var3_1)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldStopSprint() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdys", mdkz(int ), (int)163)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("mdyt", mdjm(int ), (int)225)) break;
            v0 /* !! */  = (long)oc.mdjp("mdyu", mdjm(int ), (int)226);
        }
        var3_1 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdyv", mdkz(int ), (int)164));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1630128725: {
                    v2 = oc.mdjp("mdyw", mdkz(int ), (int)165);
                    continue block17;
                }
                case -1381755089: {
                    v2 = oc.mdjp("mdyx", mdkz(int ), (int)166);
                    continue block17;
                }
                case 396374116: {
                    break block17;
                }
                case 1389583128: {
                    v2 = oc.mdjp("mdyy", mdkz(int ), (int)167);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(oc.mdjp("mdza", mdkz(int ), (int)169) - oc.mdjp("mdyz", mdkz(int ), (int)168));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 396374116: {
                    break block18;
                }
                case 791040299: {
                    continue block18;
                }
            }
            break;
        }
        var1_3 = oc.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)oc.mdjp("mdzb", mdjm(int ), (int)227);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdzc", mdkz(int ), (int)170)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oc.mdjp("mdzd", mdjm(int ), (int)228)) break;
                    v4 /* !! */  = (long)oc.mdjp("mdze", mdjm(int ), (int)229);
                }
                return this.stopSprint;
                case 0: {
                    do {
                        var2_2 /* !! */  = (int)oc.mdjp("mdzf", mdjm(int ), (int)230);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)oc.mdjp("mdzg", mdjm(int ), (int)231);
                    if (!var3_1) break block19;
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)oc.mdjp("mdzh", mdjm(int ), (int)232);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)oc.mdjp("mdzi", mdjm(int ), (int)233);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void megq() {
        oc.mdjn[0] = -1963857634;
        oc.mdjn[1] = -1541556834;
        oc.mdjn[2] = 230190383;
        oc.mdjn[3] = -1899542333;
        oc.mdjn[4] = 699020271;
        oc.mdjn[5] = 438744591;
        oc.mdjn[6] = -254205074;
        oc.mdjn[7] = -1259384066;
        oc.mdjn[8] = -491971687;
        oc.mdjn[9] = 659606622;
        oc.mdjn[10] = 1766615336;
        oc.mdjn[11] = -1510264345;
        oc.mdjn[12] = -417416817;
        oc.mdjn[13] = 464132146;
        oc.mdjn[14] = 1592215215;
        oc.mdjn[15] = 402328886;
        oc.mdjn[16] = 864799464;
        oc.mdjn[17] = -1279852051;
        oc.mdjn[18] = 1607734365;
        oc.mdjn[19] = -1804461662;
        oc.mdjn[20] = 1715687754;
        oc.mdjn[21] = -1529202450;
        oc.mdjn[22] = -319780577;
        oc.mdjn[23] = -2055567696;
        oc.mdjn[24] = 180521947;
        oc.mdjn[25] = 1319575356;
        oc.mdjn[26] = -397423262;
        oc.mdjn[27] = -1164237779;
        oc.mdjn[28] = -1509136862;
        oc.mdjn[29] = -2041324437;
        oc.mdjn[30] = 2144805036;
        oc.mdjn[31] = -1074565611;
        oc.mdjn[32] = 833795483;
        oc.mdjn[33] = 505946089;
        oc.mdjn[34] = -408914621;
        oc.mdjn[35] = 1157749613;
        oc.mdjn[36] = 376064407;
        oc.mdjn[37] = -1527076032;
        oc.mdjn[38] = -489950336;
        oc.mdjn[39] = -393213825;
        oc.mdjn[40] = 2085361585;
        oc.mdjn[41] = -2009261589;
        oc.mdjn[42] = -228597564;
        oc.mdjn[43] = -1139498453;
        oc.mdjn[44] = -1661662051;
        oc.mdjn[45] = -159717389;
        oc.mdjn[46] = -930364968;
        oc.mdjn[47] = 1990999309;
        oc.mdjn[48] = 61760793;
        oc.mdjn[49] = 939445529;
        oc.mdjn[50] = -1637200383;
        oc.mdjn[51] = -1960397272;
        oc.mdjn[52] = -1325568164;
        oc.mdjn[53] = -902606883;
        oc.mdjn[54] = -1493710334;
        oc.mdjn[55] = 1652053607;
        oc.mdjn[56] = -1264164361;
        oc.mdjn[57] = 20307614;
        oc.mdjn[58] = -1265884672;
        oc.mdjn[59] = 528190112;
        oc.mdjn[60] = 1650231439;
        oc.mdjn[61] = 1354018078;
        oc.mdjn[62] = -1825063301;
        oc.mdjn[63] = -2010383621;
        oc.mdjn[64] = 631397929;
        oc.mdjn[65] = -661454420;
        oc.mdjn[66] = 386783804;
        oc.mdjn[67] = 6951590;
        oc.mdjn[68] = -680615409;
        oc.mdjn[69] = 830305836;
        oc.mdjn[70] = -1641501995;
        oc.mdjn[71] = 222471509;
        oc.mdjn[72] = 113548081;
        oc.mdjn[73] = -1580860338;
        oc.mdjn[74] = -2128655592;
        oc.mdjn[75] = -1069724374;
        oc.mdjn[76] = -215711622;
        oc.mdjn[77] = 997980031;
        oc.mdjn[78] = -429345091;
        oc.mdjn[79] = -495169370;
        oc.mdjn[80] = 28267987;
        oc.mdjn[81] = 1355823140;
        oc.mdjn[82] = 96726146;
        oc.mdjn[83] = -1779745639;
        oc.mdjn[84] = -713471475;
        oc.mdjn[85] = -705709875;
        oc.mdjn[86] = 860866141;
        oc.mdjn[87] = 403449481;
        oc.mdjn[88] = -1717126841;
        oc.mdjn[89] = 1911965543;
        oc.mdjn[90] = -8950347;
        oc.mdjn[91] = -652888184;
        oc.mdjn[92] = -1343823471;
        oc.mdjn[93] = -195348167;
        oc.mdjn[94] = -1058682013;
        oc.mdjn[95] = 795541984;
        oc.mdjn[96] = 1565884189;
        oc.mdjn[97] = -351484470;
        oc.mdjn[98] = -91527768;
        oc.mdjn[99] = -319275332;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc velocityThreshold(double var1_1) {
        v0 /* !! */  = oc.vb;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - oc.mdjp("mdxl", mdkz(int ), (int)145));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1378289429: {
                    v1 = oc.mdjp("mdxm", mdkz(int ), (int)146);
                    continue block23;
                }
                case 396374116: {
                    break block23;
                }
                case 863076597: {
                    v1 = oc.mdjp("mdxn", mdkz(int ), (int)147);
                    continue block23;
                }
            }
            break;
        }
        var5_2 = oc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdxo", mdkz(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oc.mdjp("mdxp", mdjm(int ), (int)210)) break;
            v2 /* !! */  = (long)oc.mdjp("mdxq", mdjm(int ), (int)211);
        }
        var4_3 /* !! */  = oc.b;
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - oc.mdjp("mdxr", mdkz(int ), (int)149));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -254087285: {
                    v4 = oc.mdjp("mdxs", mdkz(int ), (int)150);
                    continue block25;
                }
                case 396374116: {
                    break block25;
                }
                case 1654705863: {
                    v4 = oc.mdjp("mdxt", mdkz(int ), (int)151);
                    continue block25;
                }
                case 2107746379: {
                    v4 = oc.mdjp("mdxu", mdkz(int ), (int)152);
                    continue block25;
                }
            }
            break;
        }
        var3_4 = oc.a;
        if (var5_2) {
            throw null;
lbl41:
            // 3 sources

            return null;
        }
        if (var3_4 || var3_4) ** GOTO lbl41
        v5 /* !! */  = oc.vb;
        if (true) ** GOTO lbl48
        block27: while (true) {
            v5 /* !! */  = (long)(oc.mdjp("mdxw", mdkz(int ), (int)154) - oc.mdjp("mdxv", mdkz(int ), (int)153));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1261185703: {
                    continue block27;
                }
                case 396374116: {
                    break block27;
                }
            }
            break;
        }
        this.velocityThreshold = var1_1;
        if (var3_4) ** GOTO lbl41
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var4_3 /* !! */  = (int)oc.mdjp("mdxx", mdjm(int ), (int)212);
                if (!var5_2) break;
                throw null;
            }
lbl65:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)oc.mdjp("mdxy", mdjm(int ), (int)213);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 2: {
                var4_3 /* !! */  = (int)oc.mdjp("mdxz", mdjm(int ), (int)214);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl75:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)oc.mdjp("mdya", mdjm(int ), (int)215);
                    if (!var5_2) break block15;
                    throw null;
                }
            }
lbl80:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)oc.mdjp("mdyb", mdjm(int ), (int)216);
                if (!var5_2) ** GOTO lbl65
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)oc.mdjp("mdyc", mdjm(int ), (int)217);
        ** while (!var5_2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public oc stopMovement(boolean var1_1) {
        while (true) {
            block37: {
                if ((v0 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdpy", mdkz(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != oc.mdjp("mdpz", mdjm(int ), (int)101)) break block37;
                var4_2 = oc.c;
                v1 /* !! */  = oc.vb;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)oc.mdjp("mdqa", mdjm(int ), (int)102);
        }
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdqb", mdkz(int ), (int)60));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1789689003: {
                    v2 = oc.mdjp("mdqc", mdkz(int ), (int)61);
                    continue block20;
                }
                case -69877007: {
                    v2 = oc.mdjp("mdqd", mdkz(int ), (int)62);
                    continue block20;
                }
                case 396374116: {
                    break block20;
                }
                case 1158145284: {
                    v2 = oc.mdjp("mdqe", mdkz(int ), (int)63);
                    continue block20;
                }
            }
            break;
        }
        var3_3 /* !! */  = oc.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = oc.vb;
                    block22: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -313873773: {
                                v4 = oc.mdjp("mdqg", mdkz(int ), (int)65);
                                ** GOTO lbl41
                            }
                            case 396374116: {
                                break block22;
                            }
                            case 1745507118: {
                                v4 = oc.mdjp("mdqh", mdkz(int ), (int)66);
lbl41:
                                // 2 sources

                                v3 /* !! */  = (long)(v4 - oc.mdjp("mdqf", mdkz(int ), (int)64));
                                continue block22;
                            }
                        }
                        break;
                    }
                    var2_4 = oc.a;
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 || var2_4) return null;
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mdqi", mdkz(int ), (int)67)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == oc.mdjp("mdqj", mdjm(int ), (int)103)) {
                            this.stopMovement = var1_1;
                            if (var2_4) return null;
                            break;
                        }
                        v5 /* !! */  = (long)oc.mdjp("mdqk", mdjm(int ), (int)104);
                    }
                    if (!var2_4) return this;
                    return null;
                }
                case 0: {
                    var3_3 /* !! */  = (int)oc.mdjp("mdql", mdjm(int ), (int)105);
                    cfr_temp_0 = 4;
                    if (!var4_2) continue block21;
                    throw null;
                }
                case 1: {
                    do {
                        var3_3 /* !! */  = (int)oc.mdjp("mdqm", mdjm(int ), (int)106);
                    } while (!var4_2);
                    throw null;
                }
                case 2: {
                    ** GOTO lbl79
                }
                case 4: {
                    do {
                        var3_3 /* !! */  = (int)oc.mdjp("mdqp", mdjm(int ), (int)109);
                    } while (!var4_2);
                    throw null;
                }
                case 5: {
                    var3_3 /* !! */  = (int)oc.mdjp("mdqq", mdjm(int ), (int)110);
                    if (var4_2) {
                        throw null;
                    }
lbl79:
                    // 3 sources

                    var3_3 /* !! */  = (int)oc.mdjp("mdqn", mdjm(int ), (int)107);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)oc.mdjp("mdqo", mdjm(int ), (int)108);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc preStopDelay(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdsa", mdkz(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oc.mdjp("mdsb", mdjm(int ), (int)131)) break;
            v0 /* !! */  = (long)oc.mdjp("mdsc", mdjm(int ), (int)132);
        }
        var5_3 = oc.c;
        v1 /* !! */  = oc.vb;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - oc.mdjp("mdsd", mdkz(int ), (int)84));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1476888766: {
                    v2 = oc.mdjp("mdse", mdkz(int ), (int)85);
                    continue block21;
                }
                case -382608212: {
                    v2 = oc.mdjp("mdsf", mdkz(int ), (int)86);
                    continue block21;
                }
                case 396374116: {
                    break block21;
                }
                case 1789256612: {
                    v2 = oc.mdjp("mdsg", mdkz(int ), (int)87);
                    continue block21;
                }
            }
            break;
        }
        var4_4 /* !! */  = oc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdsh", mdkz(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oc.mdjp("mdsi", mdjm(int ), (int)133)) break;
            v3 /* !! */  = (long)oc.mdjp("mdsj", mdjm(int ), (int)134);
        }
        var3_5 = oc.a;
        if (var5_3) {
            throw null;
lbl32:
            // 4 sources

            return null;
        }
        if (var3_5) ** GOTO lbl32
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl32
                v4 /* !! */  = oc.vb;
                if (true) ** GOTO lbl43
                block24: while (true) {
                    v4 /* !! */  = (long)(oc.mdjp("mdsl", mdkz(int ), (int)90) - oc.mdjp("mdsk", mdkz(int ), (int)89));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 396374116: {
                            break block24;
                        }
                        case 1600935454: {
                            continue block24;
                        }
                    }
                    break;
                }
                this.preStopDelayMin = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mdsm", mdkz(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oc.mdjp("mdsn", mdjm(int ), (int)135)) break;
                    v5 /* !! */  = (long)oc.mdjp("mdso", mdjm(int ), (int)136);
                }
                this.preStopDelayMax = var2_2;
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return this;
            }
lbl59:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)oc.mdjp("mdsp", mdjm(int ), (int)137);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 1: {
                var4_4 /* !! */  = (int)oc.mdjp("mdsq", mdjm(int ), (int)138);
                if (!var5_3) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)oc.mdjp("mdsr", mdjm(int ), (int)139);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl79
                    break;
                }
            }
lbl74:
            // 2 sources

            case 3: {
                do {
                    var4_4 /* !! */  = (int)oc.mdjp("mdss", mdjm(int ), (int)140);
                } while (!var5_3);
                throw null;
            }
lbl79:
            // 2 sources

            case 4: {
                do {
                    var4_4 /* !! */  = (int)oc.mdjp("mdst", mdjm(int ), (int)141);
                } while (!var5_3);
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)oc.mdjp("mdsu", mdjm(int ), (int)142);
                if (!var5_3) ** GOTO lbl74
                throw null;
            }
lbl88:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)oc.mdjp("mdsv", mdjm(int ), (int)143);
                if (!var5_3) ** GOTO lbl59
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)oc.mdjp("mdsw", mdjm(int ), (int)144);
        ** while (!var5_3)
lbl95:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc preSwapDelay(int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdut", mdkz(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oc.mdjp("mduu", mdjm(int ), (int)172)) break;
            v0 /* !! */  = (long)oc.mdjp("mduv", mdjm(int ), (int)173);
        }
        var5_3 = oc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mduw", mdkz(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oc.mdjp("mdux", mdjm(int ), (int)174)) break;
            v1 /* !! */  = (long)oc.mdjp("mduy", mdjm(int ), (int)175);
        }
        var4_4 /* !! */  = oc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mduz", mdkz(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oc.mdjp("mdva", mdjm(int ), (int)176)) break;
            v2 /* !! */  = (long)oc.mdjp("mdvb", mdjm(int ), (int)177);
        }
        var3_5 = oc.a;
        if (var5_3) {
            throw null;
lbl24:
            // 3 sources

            return null;
        }
        if (var3_5 || var3_5) ** GOTO lbl24
        v3 /* !! */  = oc.vb;
        if (true) ** GOTO lbl31
        block22: while (true) {
            v3 /* !! */  = (long)(oc.mdjp("mdvd", mdkz(int ), (int)117) - oc.mdjp("mdvc", mdkz(int ), (int)116));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1348814216: {
                    continue block22;
                }
                case 396374116: {
                    break block22;
                }
            }
            break;
        }
        this.preSwapDelayMin = var1_1;
        if (var3_5 || var3_5) ** GOTO lbl24
        v4 /* !! */  = oc.vb;
        if (true) ** GOTO lbl42
        block23: while (true) {
            v4 /* !! */  = (long)(oc.mdjp("mdvf", mdkz(int ), (int)119) - oc.mdjp("mdve", mdkz(int ), (int)118));
lbl42:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 396374116: {
                    break block23;
                }
                case 414966199: {
                    continue block23;
                }
            }
            break;
        }
        this.preSwapDelayMax = var2_2;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** continue;
                return this;
            }
lbl53:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)oc.mdjp("mdvg", mdjm(int ), (int)178);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl78
                    break;
                }
            }
            case 1: {
                var4_4 /* !! */  = (int)oc.mdjp("mdvh", mdjm(int ), (int)179);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 2: {
                var4_4 /* !! */  = (int)oc.mdjp("mdvi", mdjm(int ), (int)180);
                if (var5_3) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var4_4 /* !! */  = (int)oc.mdjp("mdvj", mdjm(int ), (int)181);
                } while (!var5_3);
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)oc.mdjp("mdvk", mdjm(int ), (int)182);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl78:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)oc.mdjp("mdvl", mdjm(int ), (int)183);
                if (!var5_3) ** GOTO lbl53
                throw null;
            }
lbl82:
            // 3 sources

            case 6: {
                var4_4 /* !! */  = (int)oc.mdjp("mdvm", mdjm(int ), (int)184);
                if (!var5_3) ** GOTO lbl53
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)oc.mdjp("mdvn", mdjm(int ), (int)185);
        ** while (!var5_3)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int randomPreStopDelay() {
        boolean bl2;
        Object object = vb;
        block26: while (true) {
            switch ((int)object) {
                case 396374116: {
                    break block26;
                }
                case 917777831: {
                    object = oc.mdjp("mebh", mdkz(int ), (int)201) - oc.mdjp("mebg", mdkz(int ), (int)200);
                    continue block26;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = vb;
        boolean bl4 = true;
        block27: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - oc.mdjp("mebi", mdkz(int ), (int)202);
            }
            switch ((int)object2) {
                case -1909221870: {
                    callSite = oc.mdjp("mebj", mdkz(int ), (int)203);
                    continue block27;
                }
                case 96865568: {
                    callSite = oc.mdjp("mebk", mdkz(int ), (int)204);
                    continue block27;
                }
                case 396374116: {
                    break block27;
                }
                case 1137338342: {
                    callSite = oc.mdjp("mebl", mdkz(int ), (int)205);
                    continue block27;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = vb - oc.mdjp("mebm", mdkz(int ), (int)206)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == oc.mdjp("mebn", mdjm(int ), (int)254)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = oc.mdjp("mebo", mdjm(int ), (int)255);
        }
        if (bl2) return (int)oc.mdjp("mebp", mdjm(int ), (int)256);
        if (bl2) return (int)oc.mdjp("mebp", mdjm(int ), (int)256);
        Object object4 = vb;
        boolean bl5 = true;
        block29: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - oc.mdjp("mebq", mdkz(int ), (int)207);
            }
            switch ((int)object4) {
                case 75774086: {
                    callSite = oc.mdjp("mebr", mdkz(int ), (int)208);
                    continue block29;
                }
                case 160487492: {
                    callSite = oc.mdjp("mebs", mdkz(int ), (int)209);
                    continue block29;
                }
                case 396374116: {
                    break block29;
                }
                case 1601844985: {
                    callSite = oc.mdjp("mebt", mdkz(int ), (int)210);
                    continue block29;
                }
            }
            break;
        }
        Object object5 = vb;
        boolean bl6 = true;
        block30: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object5 = callSite - oc.mdjp("mebu", mdkz(int ), (int)211);
            }
            switch ((int)object5) {
                case -443577375: {
                    callSite = oc.mdjp("mebv", mdkz(int ), (int)212);
                    continue block30;
                }
                case 396374116: {
                    break block30;
                }
                case 465997287: {
                    callSite = oc.mdjp("mebw", mdkz(int ), (int)213);
                    continue block30;
                }
            }
            break;
        }
        Object object6 = vb;
        boolean bl7 = true;
        block31: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object6 = callSite - oc.mdjp("mebx", mdkz(int ), (int)214);
            }
            switch ((int)object6) {
                case 396374116: {
                    return this.random(this.preStopDelayMin, this.preStopDelayMax);
                }
                case 1010737101: {
                    callSite = oc.mdjp("meby", mdkz(int ), (int)215);
                    continue block31;
                }
                case 1522249296: {
                    callSite = oc.mdjp("mebz", mdkz(int ), (int)216);
                    continue block31;
                }
            }
            break;
        }
        return this.random(this.preStopDelayMin, this.preStopDelayMax);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static oc legit() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("mdnw", mdkz(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oc.mdjp("mdnx", mdjm(int ), (int)71)) break;
            v0 /* !! */  = (long)oc.mdjp("mdny", mdjm(int ), (int)72);
        }
        var2 = oc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oc.vb - oc.mdjp("mdnz", mdkz(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oc.mdjp("mdoa", mdjm(int ), (int)73)) break;
            v1 /* !! */  = (long)oc.mdjp("mdob", mdjm(int ), (int)74);
        }
        var1_1 = oc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oc.vb - oc.mdjp("mdoc", mdkz(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oc.mdjp("mdod", mdjm(int ), (int)75)) break;
            v2 /* !! */  = (long)oc.mdjp("mdoe", mdjm(int ), (int)76);
        }
        var0_2 = oc.a;
        if (var2) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl24:
        // 1 sources

        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = oc.vb - oc.mdjp("mdof", mdkz(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oc.mdjp("mdog", mdjm(int ), (int)77)) break;
            v3 /* !! */  = (long)oc.mdjp("mdoh", mdjm(int ), (int)78);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = oc.vb - oc.mdjp("mdoi", mdkz(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == oc.mdjp("mdoj", mdjm(int ), (int)79)) break;
            v4 /* !! */  = (long)oc.mdjp("mdok", mdjm(int ), (int)80);
        }
        v5 = new oc();
        v6 = oc.mdjp("mdol", mdjm(int ), (int)81);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = oc.vb - oc.mdjp("mdom", mdkz(int ), (int)40)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == oc.mdjp("mdon", mdjm(int ), (int)82)) break;
            v7 /* !! */  = (long)oc.mdjp("mdoo", mdjm(int ), (int)83);
        }
        v8 = v5.stopMovement((boolean)v6);
        v9 = oc.mdjp("mdop", mdjm(int ), (int)84);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = oc.vb - oc.mdjp("mdoq", mdkz(int ), (int)41)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == oc.mdjp("mdor", mdjm(int ), (int)85)) break;
            v10 /* !! */  = (long)oc.mdjp("mdos", mdjm(int ), (int)86);
        }
        v11 = v8.stopSprint((boolean)v9);
        v12 = oc.mdjp("mdot", mdjm(int ), (int)87);
        v13 = oc.mdjp("mdou", mdjm(int ), (int)88);
        v14 /* !! */  = oc.vb;
        if (true) ** GOTO lbl55
        block35: while (true) {
            v14 /* !! */  = (long)(v15 - oc.mdjp("mdov", mdkz(int ), (int)42));
lbl55:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 396374116: {
                    break block35;
                }
                case 660319067: {
                    v15 = oc.mdjp("mdow", mdkz(int ), (int)43);
                    continue block35;
                }
                case 1377705384: {
                    v15 = oc.mdjp("mdox", mdkz(int ), (int)44);
                    continue block35;
                }
                case 1538362271: {
                    v15 = oc.mdjp("mdoy", mdkz(int ), (int)45);
                    continue block35;
                }
            }
            break;
        }
        v16 = v11.preStopDelay((int)v12, (int)v13);
        v17 = oc.mdjp("mdoz", mdjm(int ), (int)89);
        v18 = oc.mdjp("mdpa", mdjm(int ), (int)90);
        v19 /* !! */  = oc.vb;
        if (true) ** GOTO lbl74
        block36: while (true) {
            v19 /* !! */  = (long)(oc.mdjp("mdpc", mdkz(int ), (int)47) - oc.mdjp("mdpb", mdkz(int ), (int)46));
lbl74:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -922445770: {
                    continue block36;
                }
                case 396374116: {
                    break block36;
                }
            }
            break;
        }
        v20 = v16.waitStopDelay((int)v17, (int)v18);
        v21 = oc.mdjp("mdpd", mdjm(int ), (int)91);
        v22 = oc.mdjp("mdpe", mdjm(int ), (int)92);
        v23 /* !! */  = oc.vb;
        if (true) ** GOTO lbl86
        block37: while (true) {
            v23 /* !! */  = (long)(v24 - oc.mdjp("mdpf", mdkz(int ), (int)48));
lbl86:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 396374116: {
                    break block37;
                }
                case 980611656: {
                    v24 = oc.mdjp("mdpg", mdkz(int ), (int)49);
                    continue block37;
                }
                case 1779145194: {
                    v24 = oc.mdjp("mdph", mdkz(int ), (int)50);
                    continue block37;
                }
            }
            break;
        }
        v25 = v20.preSwapDelay((int)v21, (int)v22);
        v26 = oc.mdjp("mdpi", mdjm(int ), (int)93);
        v27 = oc.mdjp("mdpj", mdjm(int ), (int)94);
        v28 /* !! */  = oc.vb;
        if (true) ** GOTO lbl102
        block38: while (true) {
            v28 /* !! */  = (long)(v29 - oc.mdjp("mdpk", mdkz(int ), (int)51));
lbl102:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -1539197007: {
                    v29 = oc.mdjp("mdpl", mdkz(int ), (int)52);
                    continue block38;
                }
                case 330382906: {
                    v29 = oc.mdjp("mdpm", mdkz(int ), (int)53);
                    continue block38;
                }
                case 396374116: {
                    break block38;
                }
                case 1582118604: {
                    v29 = oc.mdjp("mdpn", mdkz(int ), (int)54);
                    continue block38;
                }
            }
            break;
        }
        v30 = v25.postSwapDelay((int)v26, (int)v27);
        v31 = oc.mdjp("mdpo", mdjm(int ), (int)95);
        v32 = oc.mdjp("mdpp", mdjm(int ), (int)96);
        v33 /* !! */  = oc.vb;
        if (true) ** GOTO lbl121
        block39: while (true) {
            v33 /* !! */  = (long)(v34 - oc.mdjp("mdpq", mdkz(int ), (int)55));
lbl121:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -2128843101: {
                    v34 = oc.mdjp("mdpr", mdkz(int ), (int)56);
                    continue block39;
                }
                case -2013275982: {
                    v34 = oc.mdjp("mdps", mdkz(int ), (int)57);
                    continue block39;
                }
                case -1219623832: {
                    v34 = oc.mdjp("mdpt", mdkz(int ), (int)58);
                    continue block39;
                }
                case 396374116: {
                    break block39;
                }
            }
            break;
        }
        return v30.resumeDelay((int)v31, (int)v32);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oc() {
        var2_1 /* !! */  = oc.b;
        super();
        this.stopMovement = oc.mdjp("mdjq", mdjm(int ), (int)0);
        this.stopSprint = oc.mdjp("mdjr", mdjm(int ), (int)1);
        this.closeInventory = oc.mdjp("mdjs", mdjm(int ), (int)2);
        this.preStopDelayMin = (int)oc.mdjp("mdjt", mdjm(int ), (int)3);
        this.preStopDelayMax = (int)oc.mdjp("mdju", mdjm(int ), (int)4);
        this.waitStopDelayMin = (int)oc.mdjp("mdjv", mdjm(int ), (int)5);
        this.waitStopDelayMax = (int)oc.mdjp("mdjw", mdjm(int ), (int)6);
        this.minimumStopDelay = (int)oc.mdjp("mdjx", mdjm(int ), (int)7);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.preSwapDelayMin = (int)oc.mdjp("mdjy", mdjm(int ), (int)8);
                this.preSwapDelayMax = (int)oc.mdjp("mdjz", mdjm(int ), (int)9);
                this.postSwapDelayMin = (int)oc.mdjp("mdka", mdjm(int ), (int)10);
                this.postSwapDelayMax = (int)oc.mdjp("mdkb", mdjm(int ), (int)11);
                this.resumeDelayMin = (int)oc.mdjp("mdkc", mdjm(int ), (int)12);
                this.resumeDelayMax = (int)oc.mdjp("mdkd", mdjm(int ), (int)13);
                this.velocityThreshold = (double)oc.mdjp("mdkh", mdke(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)oc.mdjp("mdki", mdjm(int ), (int)14);
                ** GOTO lbl41
            }
lbl25:
            // 4 sources

            case 1: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkj", mdjm(int ), (int)15);
                ** GOTO lbl37
            }
            case 2: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkk", mdjm(int ), (int)16);
                ** GOTO lbl25
            }
lbl31:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkl", mdjm(int ), (int)17);
                ** GOTO lbl63
            }
lbl34:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkm", mdjm(int ), (int)18);
                ** GOTO lbl54
            }
lbl37:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)oc.mdjp("mdkn", mdjm(int ), (int)19);
                    break block0;
                    break;
                }
            }
lbl41:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)oc.mdjp("mdko", mdjm(int ), (int)20);
                ** GOTO lbl54
            }
            case 7: {
                while (true) {
                    var2_1 /* !! */  = (int)oc.mdjp("mdkp", mdjm(int ), (int)21);
                }
            }
            case 8: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkq", mdjm(int ), (int)22);
                ** GOTO lbl25
            }
            case 9: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkr", mdjm(int ), (int)23);
                ** GOTO lbl34
            }
lbl54:
            // 4 sources

            case 10: {
                var2_1 /* !! */  = (int)oc.mdjp("mdks", mdjm(int ), (int)24);
                ** GOTO lbl31
            }
lbl57:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkt", mdjm(int ), (int)25);
                ** GOTO lbl66
            }
            case 12: {
                var2_1 /* !! */  = (int)oc.mdjp("mdku", mdjm(int ), (int)26);
                ** GOTO lbl41
            }
lbl63:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkv", mdjm(int ), (int)27);
                ** GOTO lbl57
            }
lbl66:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkw", mdjm(int ), (int)28);
                ** GOTO lbl54
            }
            case 15: {
                var2_1 /* !! */  = (int)oc.mdjp("mdkx", mdjm(int ), (int)29);
                ** GOTO lbl25
            }
            case 16: 
        }
        var2_1 /* !! */  = (int)oc.mdjp("mdky", mdjm(int ), (int)30);
        ** while (true)
    }

    public static /* synthetic */ CallSite mdjp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void megy() {
        oc.mdkf[0] = -9168304721077743092L;
        oc.mdkf[1] = -5295167981181543368L;
        oc.mdkf[2] = -1276739177655534338L;
        oc.mdkf[3] = -593308590179236659L;
        oc.mdkf[4] = -8360180907972265943L;
        oc.mdkf[5] = 2915934644698444447L;
        oc.mdkf[6] = 3728434978275792519L;
        oc.mdkf[7] = 7917924585097494308L;
        oc.mdkf[8] = 8527837119977228307L;
        oc.mdkf[9] = -791036166466274701L;
        oc.mdkf[10] = -9074893793640709619L;
        oc.mdkf[11] = -3707408560688303427L;
        oc.mdkf[12] = 2607621788849961654L;
        oc.mdkf[13] = 8446894441122178105L;
        oc.mdkf[14] = 5588310731839159394L;
        oc.mdkf[15] = 4077725653236931538L;
        oc.mdkf[16] = -8429038782756126035L;
        oc.mdkf[17] = 5608066936328110252L;
        oc.mdkf[18] = 8818116516994548500L;
        oc.mdkf[19] = -1502448050438138077L;
        oc.mdkf[20] = -1298047167826332527L;
        oc.mdkf[21] = -7892131330971944033L;
        oc.mdkf[22] = -1344091681578327662L;
        oc.mdkf[23] = -2142393082464101984L;
        oc.mdkf[24] = -6217916103410369950L;
        oc.mdkf[25] = 443771517998351178L;
        oc.mdkf[26] = -5835014644550661297L;
        oc.mdkf[27] = -3037251684956440145L;
        oc.mdkf[28] = 7201789355504353329L;
        oc.mdkf[29] = -5148244053539026674L;
        oc.mdkf[30] = -587572078635421477L;
        oc.mdkf[31] = 3829196351121285944L;
        oc.mdkf[32] = 7382259665087619057L;
        oc.mdkf[33] = 4552095377786641706L;
        oc.mdkf[34] = -2905356134455786612L;
        oc.mdkf[35] = 2270937911813858760L;
        oc.mdkf[36] = -2782186658137265990L;
        oc.mdkf[37] = 5688620694307623423L;
        oc.mdkf[38] = -4368267023880773776L;
        oc.mdkf[39] = -8580359837930080904L;
        oc.mdkf[40] = -4198538074222707495L;
        oc.mdkf[41] = -2494037423701091452L;
        oc.mdkf[42] = 3249871614394943344L;
        oc.mdkf[43] = -4360117838848592126L;
        oc.mdkf[44] = 8416506239921270356L;
        oc.mdkf[45] = 4389650952621442815L;
        oc.mdkf[46] = -7202849429859538025L;
        oc.mdkf[47] = 4922532040937333520L;
        oc.mdkf[48] = -6611216429218272161L;
        oc.mdkf[49] = 8535309548026136889L;
        oc.mdkf[50] = 482288838151269127L;
        oc.mdkf[51] = 7032207392925714778L;
        oc.mdkf[52] = 2550241255032247597L;
        oc.mdkf[53] = 705791158303984557L;
        oc.mdkf[54] = 3890073139380798951L;
        oc.mdkf[55] = -2725155832892963880L;
        oc.mdkf[56] = -3568109904192433414L;
        oc.mdkf[57] = 7816741151410427343L;
        oc.mdkf[58] = 8425124845526910788L;
        oc.mdkf[59] = -145543769663497225L;
        oc.mdkf[60] = -3456227209518738157L;
        oc.mdkf[61] = -6930926431629760912L;
        oc.mdkf[62] = -7872046748194062672L;
        oc.mdkf[63] = 5731687888235550419L;
        oc.mdkf[64] = 6161838593109065090L;
        oc.mdkf[65] = 8249738468880974860L;
        oc.mdkf[66] = -1326943556116494516L;
        oc.mdkf[67] = 5869423907350900900L;
        oc.mdkf[68] = 3898772557080231685L;
        oc.mdkf[69] = 2251432717749789785L;
        oc.mdkf[70] = -5964090577358193138L;
        oc.mdkf[71] = -5690984041498373000L;
        oc.mdkf[72] = 6360096336728770128L;
        oc.mdkf[73] = -3164967289099461672L;
        oc.mdkf[74] = 8011720305123988743L;
        oc.mdkf[75] = -4819688606607623177L;
        oc.mdkf[76] = 1759787222591525934L;
        oc.mdkf[77] = 8462225670595727752L;
        oc.mdkf[78] = 8819297290473723108L;
        oc.mdkf[79] = 226651549925156636L;
        oc.mdkf[80] = -5042905789302235312L;
        oc.mdkf[81] = -7195381318785471492L;
        oc.mdkf[82] = 1433682246241102192L;
        oc.mdkf[83] = 1949597978034023886L;
        oc.mdkf[84] = -3584316872595094456L;
        oc.mdkf[85] = 3392284379462330002L;
        oc.mdkf[86] = -6776125122929277130L;
        oc.mdkf[87] = 562169934828821857L;
        oc.mdkf[88] = 3324796501950759313L;
        oc.mdkf[89] = -1729578412193474479L;
        oc.mdkf[90] = -4868475786345179169L;
        oc.mdkf[91] = 1876532640589494174L;
        oc.mdkf[92] = 2614789324478917278L;
        oc.mdkf[93] = -4420150730167943898L;
        oc.mdkf[94] = 4088152181743919766L;
        oc.mdkf[95] = 6889148241452674888L;
        oc.mdkf[96] = 7582453825532760245L;
        oc.mdkf[97] = -3340527873074952039L;
        oc.mdkf[98] = -5348245052814902897L;
        oc.mdkf[99] = 9100305523956719939L;
    }

    private static /* synthetic */ void megx() {
        oc.mdjo[300] = 875778241;
        oc.mdjo[301] = -1483777048;
        oc.mdjo[302] = -628457424;
        oc.mdjo[303] = -1483442101;
        oc.mdjo[304] = 1237526718;
        oc.mdjo[305] = -1004006889;
        oc.mdjo[306] = -1667459389;
        oc.mdjo[307] = 1543972709;
        oc.mdjo[308] = -343293944;
        oc.mdjo[309] = -855744395;
        oc.mdjo[310] = -742797684;
        oc.mdjo[311] = 1273727266;
        oc.mdjo[312] = -47504821;
        oc.mdjo[313] = 1176824237;
        oc.mdjo[314] = 1045105394;
        oc.mdjo[315] = -1808973090;
        oc.mdjo[316] = 232309004;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getVelocityThreshold() {
        v0 /* !! */  = oc.vb;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - oc.mdjp("mdzy", mdkz(int ), (int)179));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1789162163: {
                    v1 = oc.mdjp("mdzz", mdkz(int ), (int)180);
                    continue block21;
                }
                case -1274937720: {
                    v1 = oc.mdjp("meaa", mdkz(int ), (int)181);
                    continue block21;
                }
                case 396374116: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = oc.c;
        v2 /* !! */  = oc.vb;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - oc.mdjp("meab", mdkz(int ), (int)182));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 396374116: {
                    break block22;
                }
                case 425240463: {
                    v3 = oc.mdjp("meac", mdkz(int ), (int)183);
                    continue block22;
                }
                case 1358070206: {
                    v3 = oc.mdjp("mead", mdkz(int ), (int)184);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = oc.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = oc.vb - oc.mdjp("meae", mdkz(int ), (int)185)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == oc.mdjp("meaf", mdjm(int ), (int)241)) break;
            v4 /* !! */  = (long)oc.mdjp("meag", mdjm(int ), (int)242);
        }
        var1_3 = oc.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (double)oc.mdjp("meah", mdke(int ), (int)186);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = oc.vb;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - oc.mdjp("meai", mdkz(int ), (int)187));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 396374116: {
                            break block25;
                        }
                        case 838817637: {
                            v6 = oc.mdjp("meaj", mdkz(int ), (int)188);
                            continue block25;
                        }
                        case 1092189078: {
                            v6 = oc.mdjp("meak", mdkz(int ), (int)189);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.velocityThreshold;
            }
lbl59:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)oc.mdjp("meal", mdjm(int ), (int)243);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)oc.mdjp("meam", mdjm(int ), (int)244);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)oc.mdjp("mean", mdjm(int ), (int)245);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)oc.mdjp("meao", mdjm(int ), (int)246);
        } while (!var3_1);
        throw null;
    }
}

