/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2879
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import ruhack.phobia.aw;
import ruhack.phobia.cy;
import ruhack.phobia.da;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hy;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.nn;
import ruhack.phobia.ns;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov$VecRotation;
import ruhack.phobia.ow;
import ruhack.phobia.pn;
import ruhack.phobia.pr;

public class ge
extends ds {
    private final pr lightningTimer;
    private boolean startSetPitch;
    private static int[] ioxc = new int[850];
    private static int[] ioxd = new int[850];
    private final pr stopWatch;
    public static final boolean c;
    private int lastSlot;
    private static long[] ioxu;
    private static long[] ioxt;
    private int cooldown;
    public static final boolean a;
    public static final long qc = 8880833181984857062L;
    private final kf mode;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasCollision(class_2338 var1_1) {
        block41: {
            block40: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irme", ioxs(int ), (int)465)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ge.ioxe("irmf", ioxa(int ), (int)746)) break;
                    v0 /* !! */  = (long)ge.ioxe("irmg", ioxa(int ), (int)747);
                }
                var4_2 = ge.c;
                v1 /* !! */  = ge.qc;
                if (true) ** GOTO lbl11
                block28: while (true) {
                    v1 /* !! */  = (long)(v2 - ge.ioxe("irmh", ioxs(int ), (int)466));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1303489376: {
                            v2 = ge.ioxe("irmi", ioxs(int ), (int)467);
                            continue block28;
                        }
                        case -594890657: {
                            v2 = ge.ioxe("irmj", ioxs(int ), (int)468);
                            continue block28;
                        }
                        case -239756314: {
                            break block28;
                        }
                    }
                    break;
                }
                var3_3 = ge.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irmk", ioxs(int ), (int)469)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ge.ioxe("irml", ioxa(int ), (int)748)) break;
                    v3 /* !! */  = (long)ge.ioxe("irmm", ioxa(int ), (int)749);
                }
                var2_4 = ge.a;
                if (var4_2) {
                    throw null;
lbl29:
                    // 3 sources

                    return (boolean)ge.ioxe("irmn", ioxa(int ), (int)750);
                }
                if (var2_4 || var2_4) ** GOTO lbl29
                v4 /* !! */  = ge.qc;
                if (true) ** GOTO lbl36
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - ge.ioxe("irmo", ioxs(int ), (int)470));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1170288330: {
                            v5 = ge.ioxe("irmp", ioxs(int ), (int)471);
                            continue block31;
                        }
                        case -1158707590: {
                            v5 = ge.ioxe("irmq", ioxs(int ), (int)472);
                            continue block31;
                        }
                        case -1043980747: {
                            v5 = ge.ioxe("irmr", ioxs(int ), (int)473);
                            continue block31;
                        }
                        case -239756314: {
                            break block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ge.qc;
                if (true) ** GOTO lbl52
                block32: while (true) {
                    v6 /* !! */  = (long)(ge.ioxe("irmt", ioxs(int ), (int)475) - ge.ioxe("irms", ioxs(int ), (int)474));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -239756314: {
                            break block32;
                        }
                        case -180185574: {
                            continue block32;
                        }
                    }
                    break;
                }
                v7 = ge.mc.field_1687;
                v8 /* !! */  = ge.qc;
                if (true) ** GOTO lbl62
                block33: while (true) {
                    v8 /* !! */  = (long)(v9 - ge.ioxe("irmu", ioxs(int ), (int)476));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2079783653: {
                            v9 = ge.ioxe("irmv", ioxs(int ), (int)477);
                            continue block33;
                        }
                        case -1955401292: {
                            v9 = ge.ioxe("irmw", ioxs(int ), (int)478);
                            continue block33;
                        }
                        case -239756314: {
                            break block33;
                        }
                        case 218043517: {
                            v9 = ge.ioxe("irmx", ioxs(int ), (int)479);
                            continue block33;
                        }
                    }
                    break;
                }
                v10 = v7.method_8320(var1_1);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irmy", ioxs(int ), (int)480)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ge.ioxe("irmz", ioxa(int ), (int)751)) break;
                    v11 /* !! */  = (long)ge.ioxe("irna", ioxa(int ), (int)752);
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("irnb", ioxs(int ), (int)481)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ge.ioxe("irnc", ioxa(int ), (int)753)) break;
                    v12 /* !! */  = (long)ge.ioxe("irnd", ioxa(int ), (int)754);
                }
                v13 = ge.mc.field_1687;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("irne", ioxs(int ), (int)482)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ge.ioxe("irnf", ioxa(int ), (int)755)) break;
                    v14 /* !! */  = (long)ge.ioxe("irng", ioxa(int ), (int)756);
                }
                v15 = v10.method_26220((class_1922)v13, var1_1);
                v16 /* !! */  = ge.qc;
                if (true) ** GOTO lbl96
                block37: while (true) {
                    v16 /* !! */  = (long)(v17 - ge.ioxe("irnh", ioxs(int ), (int)483));
lbl96:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1516849123: {
                            v17 = ge.ioxe("irni", ioxs(int ), (int)484);
                            continue block37;
                        }
                        case -1229080109: {
                            v17 = ge.ioxe("irnj", ioxs(int ), (int)485);
                            continue block37;
                        }
                        case -239756314: {
                            break block37;
                        }
                        case 1032690209: {
                            v17 = ge.ioxe("irnk", ioxs(int ), (int)486);
                            continue block37;
                        }
                    }
                    break;
                }
                if (v15.method_1110()) break block40;
                if (var2_4) ** GOTO lbl29
                v18 = ge.ioxe("irnl", ioxa(int ), (int)757);
                if (var4_2) {
                    throw null;
                }
                break block41;
            }
            if (!var2_4 && !var2_4) ** break;
            ** while (true)
            v18 = ge.ioxe("irnm", ioxa(int ), (int)758);
        }
        return (boolean)v18;
    }

    private static /* synthetic */ void irvg() {
        ge.ioxc[500] = -1093284611;
        ge.ioxc[501] = -780277334;
        ge.ioxc[502] = -1008920496;
        ge.ioxc[503] = -804205119;
        ge.ioxc[504] = 791605619;
        ge.ioxc[505] = 697754461;
        ge.ioxc[506] = -1076417795;
        ge.ioxc[507] = -476363019;
        ge.ioxc[508] = -473782399;
        ge.ioxc[509] = -1993699328;
        ge.ioxc[510] = -413216815;
        ge.ioxc[511] = -2048297742;
        ge.ioxc[512] = -2044278269;
        ge.ioxc[513] = -475936417;
        ge.ioxc[514] = 838209261;
        ge.ioxc[515] = 2021409855;
        ge.ioxc[516] = 1173051436;
        ge.ioxc[517] = 287118335;
        ge.ioxc[518] = 81669484;
        ge.ioxc[519] = -1154288347;
        ge.ioxc[520] = -502454290;
        ge.ioxc[521] = -27086736;
        ge.ioxc[522] = -555634363;
        ge.ioxc[523] = -660502201;
        ge.ioxc[524] = 1159418602;
        ge.ioxc[525] = -336071512;
        ge.ioxc[526] = 349483468;
        ge.ioxc[527] = 1720962541;
        ge.ioxc[528] = -1621647681;
        ge.ioxc[529] = -410611190;
        ge.ioxc[530] = 350106379;
        ge.ioxc[531] = -1113029683;
        ge.ioxc[532] = -544966431;
        ge.ioxc[533] = 2016756055;
        ge.ioxc[534] = -2100522818;
        ge.ioxc[535] = -832057769;
        ge.ioxc[536] = -1808942553;
        ge.ioxc[537] = 1656624442;
        ge.ioxc[538] = 414443348;
        ge.ioxc[539] = -1846927543;
        ge.ioxc[540] = 432245446;
        ge.ioxc[541] = -846377607;
        ge.ioxc[542] = 1121996983;
        ge.ioxc[543] = -801784873;
        ge.ioxc[544] = 1790593658;
        ge.ioxc[545] = -1583592014;
        ge.ioxc[546] = -1955263772;
        ge.ioxc[547] = -1053714592;
        ge.ioxc[548] = -1762584704;
        ge.ioxc[549] = -1069630391;
        ge.ioxc[550] = -598718976;
        ge.ioxc[551] = -1837288021;
        ge.ioxc[552] = 60804732;
        ge.ioxc[553] = -453767684;
        ge.ioxc[554] = 1125288064;
        ge.ioxc[555] = 1062432994;
        ge.ioxc[556] = 667324182;
        ge.ioxc[557] = -223346822;
        ge.ioxc[558] = 1302584719;
        ge.ioxc[559] = 966282364;
        ge.ioxc[560] = -165273035;
        ge.ioxc[561] = -1842296683;
        ge.ioxc[562] = -461356055;
        ge.ioxc[563] = 1922052633;
        ge.ioxc[564] = 1583992879;
        ge.ioxc[565] = 52560247;
        ge.ioxc[566] = 246943643;
        ge.ioxc[567] = 1354843469;
        ge.ioxc[568] = -392136658;
        ge.ioxc[569] = -1338538023;
        ge.ioxc[570] = -1859636507;
        ge.ioxc[571] = -446321947;
        ge.ioxc[572] = 564922398;
        ge.ioxc[573] = -681843784;
        ge.ioxc[574] = 1513726692;
        ge.ioxc[575] = 954198567;
        ge.ioxc[576] = 1781242950;
        ge.ioxc[577] = -1899892778;
        ge.ioxc[578] = 347490814;
        ge.ioxc[579] = 688967139;
        ge.ioxc[580] = 1557520701;
        ge.ioxc[581] = -966669581;
        ge.ioxc[582] = -1305133375;
        ge.ioxc[583] = 411068443;
        ge.ioxc[584] = -495022865;
        ge.ioxc[585] = 124081342;
        ge.ioxc[586] = -679005248;
        ge.ioxc[587] = 2017597572;
        ge.ioxc[588] = -1302659079;
        ge.ioxc[589] = -1870087406;
        ge.ioxc[590] = -1633202675;
        ge.ioxc[591] = 311804504;
        ge.ioxc[592] = 1237803427;
        ge.ioxc[593] = 1472629618;
        ge.ioxc[594] = -1483706811;
        ge.ioxc[595] = 1073004395;
        ge.ioxc[596] = -613288059;
        ge.ioxc[597] = 547636432;
        ge.ioxc[598] = 114959343;
        ge.ioxc[599] = 675833662;
    }

    private static /* synthetic */ void iruq() {
        ge.ioxc[200] = 1378822939;
        ge.ioxc[201] = 1844119243;
        ge.ioxc[202] = -1575264357;
        ge.ioxc[203] = -151700089;
        ge.ioxc[204] = 1658198081;
        ge.ioxc[205] = -115522870;
        ge.ioxc[206] = -651413702;
        ge.ioxc[207] = -2012379326;
        ge.ioxc[208] = -22932148;
        ge.ioxc[209] = -557224298;
        ge.ioxc[210] = -2106964880;
        ge.ioxc[211] = 1619901254;
        ge.ioxc[212] = -1367124558;
        ge.ioxc[213] = -1068426263;
        ge.ioxc[214] = -1477757150;
        ge.ioxc[215] = -367481502;
        ge.ioxc[216] = -341363770;
        ge.ioxc[217] = -1895822909;
        ge.ioxc[218] = 808724652;
        ge.ioxc[219] = 1409200178;
        ge.ioxc[220] = 557185483;
        ge.ioxc[221] = -191880589;
        ge.ioxc[222] = -1738107392;
        ge.ioxc[223] = 1741161105;
        ge.ioxc[224] = 1293070680;
        ge.ioxc[225] = -636041020;
        ge.ioxc[226] = 1538478752;
        ge.ioxc[227] = -1740486830;
        ge.ioxc[228] = -2080697540;
        ge.ioxc[229] = -397366354;
        ge.ioxc[230] = -418930728;
        ge.ioxc[231] = 1982103224;
        ge.ioxc[232] = -223213591;
        ge.ioxc[233] = 1066550358;
        ge.ioxc[234] = -127052318;
        ge.ioxc[235] = 1352060957;
        ge.ioxc[236] = 1113961991;
        ge.ioxc[237] = -475364956;
        ge.ioxc[238] = 159896278;
        ge.ioxc[239] = 913968143;
        ge.ioxc[240] = -681593222;
        ge.ioxc[241] = -1817518794;
        ge.ioxc[242] = -1242024886;
        ge.ioxc[243] = -227961202;
        ge.ioxc[244] = 1831799205;
        ge.ioxc[245] = -1245140908;
        ge.ioxc[246] = -666672085;
        ge.ioxc[247] = 229846824;
        ge.ioxc[248] = -226153792;
        ge.ioxc[249] = 1795208651;
        ge.ioxc[250] = 1667696092;
        ge.ioxc[251] = 1673105128;
        ge.ioxc[252] = 164255703;
        ge.ioxc[253] = 59131228;
        ge.ioxc[254] = 327186148;
        ge.ioxc[255] = -377984588;
        ge.ioxc[256] = 119786217;
        ge.ioxc[257] = 1950904576;
        ge.ioxc[258] = 493767229;
        ge.ioxc[259] = -840364858;
        ge.ioxc[260] = 27829269;
        ge.ioxc[261] = -1175497022;
        ge.ioxc[262] = 360956928;
        ge.ioxc[263] = -438020452;
        ge.ioxc[264] = -1868475272;
        ge.ioxc[265] = -2016917197;
        ge.ioxc[266] = 1162570736;
        ge.ioxc[267] = 1375240063;
        ge.ioxc[268] = 2126643523;
        ge.ioxc[269] = 1578769430;
        ge.ioxc[270] = -386282062;
        ge.ioxc[271] = 640904531;
        ge.ioxc[272] = -655696618;
        ge.ioxc[273] = -1773531440;
        ge.ioxc[274] = 108553003;
        ge.ioxc[275] = 1085035001;
        ge.ioxc[276] = 1472665581;
        ge.ioxc[277] = -425732518;
        ge.ioxc[278] = 470883016;
        ge.ioxc[279] = 1556893340;
        ge.ioxc[280] = 1394178862;
        ge.ioxc[281] = 720452699;
        ge.ioxc[282] = -193866047;
        ge.ioxc[283] = -77101090;
        ge.ioxc[284] = -1851633450;
        ge.ioxc[285] = -1288812595;
        ge.ioxc[286] = 713050532;
        ge.ioxc[287] = 1277449437;
        ge.ioxc[288] = 2015908385;
        ge.ioxc[289] = -1152336324;
        ge.ioxc[290] = 1159875122;
        ge.ioxc[291] = -1996358351;
        ge.ioxc[292] = 751728690;
        ge.ioxc[293] = 781214627;
        ge.ioxc[294] = -593368439;
        ge.ioxc[295] = 266012940;
        ge.ioxc[296] = -576695311;
        ge.ioxc[297] = 425716047;
        ge.ioxc[298] = 1410314377;
        ge.ioxc[299] = -894958890;
    }

    private static /* synthetic */ void ituf() {
        ge.ioxt[500] = -3221930263846643261L;
        ge.ioxt[501] = 2075458593480181007L;
        ge.ioxt[502] = 2309095011023059024L;
        ge.ioxt[503] = -2953025430195279547L;
        ge.ioxt[504] = -3989826241387732698L;
        ge.ioxt[505] = -1751087612908582627L;
        ge.ioxt[506] = 2571867168924325354L;
        ge.ioxt[507] = 4944796713119644197L;
        ge.ioxt[508] = -7827337099594769103L;
        ge.ioxt[509] = -7544655874063343609L;
        ge.ioxt[510] = 3025186510893818439L;
        ge.ioxt[511] = -7456883155232396873L;
        ge.ioxt[512] = -5543522748081461010L;
        ge.ioxt[513] = 1971797023097419751L;
        ge.ioxt[514] = 8753313875016743564L;
        ge.ioxt[515] = -7805575639261148362L;
        ge.ioxt[516] = 8916598111528418826L;
        ge.ioxt[517] = -4067898311244659159L;
        ge.ioxt[518] = -6569917363433984750L;
        ge.ioxt[519] = -4132810560184575015L;
        ge.ioxt[520] = 8042568206196958055L;
        ge.ioxt[521] = 5269389852448708906L;
        ge.ioxt[522] = -6881045330576600030L;
        ge.ioxt[523] = 5221476970100487677L;
        ge.ioxt[524] = -3987795665623133922L;
        ge.ioxt[525] = 7125717272127536037L;
        ge.ioxt[526] = 241237427432476361L;
        ge.ioxt[527] = 3706614085978798510L;
        ge.ioxt[528] = -6579240817013433765L;
        ge.ioxt[529] = 2900130010930333121L;
        ge.ioxt[530] = 5243369399929133737L;
        ge.ioxt[531] = 8618936674218237180L;
        ge.ioxt[532] = 7137456218411919119L;
        ge.ioxt[533] = -6147858903294191865L;
        ge.ioxt[534] = 2154231759290415171L;
        ge.ioxt[535] = 3034798823651077007L;
        ge.ioxt[536] = -6424316718050681982L;
        ge.ioxt[537] = 258158254271196691L;
        ge.ioxt[538] = 738306529115355740L;
        ge.ioxt[539] = 7751817965616284419L;
        ge.ioxt[540] = 3304191855325044071L;
        ge.ioxt[541] = -6523471295804644924L;
        ge.ioxt[542] = -9003405640110330359L;
        ge.ioxt[543] = 8399440722644269755L;
        ge.ioxt[544] = -4479186878596637163L;
        ge.ioxt[545] = 2177628014555181875L;
        ge.ioxt[546] = 1761889824058099877L;
        ge.ioxt[547] = -1200890572017774998L;
        ge.ioxt[548] = 1078397593455851122L;
        ge.ioxt[549] = -8371545059956553762L;
        ge.ioxt[550] = 8998678557462704560L;
        ge.ioxt[551] = -6473978024891382301L;
        ge.ioxt[552] = -4967602959799745963L;
        ge.ioxt[553] = -8677942317656036101L;
        ge.ioxt[554] = 4985670719815287175L;
        ge.ioxt[555] = 620692787339477685L;
        ge.ioxt[556] = 2317023060426152657L;
        ge.ioxt[557] = 3467324872031565222L;
        ge.ioxt[558] = -4443080772011645097L;
        ge.ioxt[559] = -6723561396168053719L;
        ge.ioxt[560] = 1166028119493846691L;
        ge.ioxt[561] = 6115788968928190368L;
        ge.ioxt[562] = -8720818225669028570L;
        ge.ioxt[563] = -3466629010196978968L;
        ge.ioxt[564] = 1152491756344744542L;
        ge.ioxt[565] = -4084103501688572075L;
        ge.ioxt[566] = -8925856191562823864L;
        ge.ioxt[567] = -677549093515388395L;
        ge.ioxt[568] = -841095624008993642L;
        ge.ioxt[569] = -4901681631011531050L;
        ge.ioxt[570] = -6295031921659423029L;
        ge.ioxt[571] = 8142615368796849071L;
        ge.ioxt[572] = 9218581307414512354L;
        ge.ioxt[573] = -6553583137078310813L;
        ge.ioxt[574] = 738135287718856232L;
        ge.ioxt[575] = 3445184884501804810L;
        ge.ioxt[576] = -1467719007877471476L;
        ge.ioxt[577] = 964816913604726363L;
        ge.ioxt[578] = -7643916355169916332L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$findPos$0(class_2338 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irtr", ioxs(int ), (int)567)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("irts", ioxa(int ), (int)839)) break;
            v0 /* !! */  = (long)ge.ioxe("irtt", ioxa(int ), (int)840);
        }
        var3_1 = ge.c;
        v1 /* !! */  = ge.qc;
        block24: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -239756314: {
                    break block24;
                }
                case 1101445692: {
                    v1 /* !! */  = (long)(ge.ioxe("irtv", ioxs(int ), (int)569) - ge.ioxe("irtu", ioxs(int ), (int)568));
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ge.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block25: while (true) {
            block38: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irtw", ioxs(int ), (int)570)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == ge.ioxe("irtx", ioxa(int ), (int)841)) {
                                var1_3 = ge.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)ge.ioxe("irty", ioxa(int ), (int)842);
                        }
                        if (var1_3 != false) return (boolean)ge.ioxe("irtz", ioxa(int ), (int)843);
                        if (var1_3 != false) return (boolean)ge.ioxe("irtz", ioxa(int ), (int)843);
                        v3 /* !! */  = ge.qc;
                        block27: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -239756314: {
                                    break block27;
                                }
                                case 1361957431: {
                                    v3 /* !! */  = (long)(ge.ioxe("irub", ioxs(int ), (int)572) - ge.ioxe("irua", ioxs(int ), (int)571));
                                    continue block27;
                                }
                            }
                            break;
                        }
                        v4 /* !! */  = ge.qc;
                        block28: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -721438475: {
                                    v5 = ge.ioxe("irud", ioxs(int ), (int)574);
                                    ** GOTO lbl50
                                }
                                case -239756314: {
                                    break block28;
                                }
                                case 1461244517: {
                                    v5 = ge.ioxe("irue", ioxs(int ), (int)575);
lbl50:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - ge.ioxe("iruc", ioxs(int ), (int)573));
                                    continue block28;
                                }
                            }
                            break;
                        }
                        v6 = ge.mc.field_1687;
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iruf", ioxs(int ), (int)576)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == ge.ioxe("irug", ioxa(int ), (int)844)) {
                                v8 = v6.method_8320(var0);
                                v9 /* !! */  = ge.qc;
                                ** break;
                            }
                            v7 /* !! */  = (long)ge.ioxe("iruh", ioxa(int ), (int)845);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ge.ioxe("iruk", ioxa(int ), (int)846);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block38;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ge.ioxe("irun", ioxa(int ), (int)849);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl72:
                    // 1 sources

                    block30: while (true) {
                        switch ((int)v9 /* !! */ ) {
                            case -239756314: {
                                return v8.method_51367();
                            }
                            case 434623310: {
                                v9 /* !! */  = (long)(ge.ioxe("iruj", ioxs(int ), (int)578) - ge.ioxe("irui", ioxs(int ), (int)577));
                                continue block30;
                            }
                        }
                        break;
                    }
                    return v8.method_51367();
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)ge.ioxe("irul", ioxa(int ), (int)847);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl89
            }
            do {
                if (true) continue block25;
lbl89:
                // 2 sources

                var2_2 /* !! */  = (int)ge.ioxe("irum", ioxa(int ), (int)848);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        block139: {
            block138: {
                block137: {
                    block136: {
                        block135: {
                            block134: {
                                block133: {
                                    block132: {
                                        block131: {
                                            var14_2 = ge.c;
                                            var13_3 /* !! */  = ge.b;
                                            var12_4 = ge.a;
                                            if (var14_2) {
                                                throw null;
lbl6:
                                                // 37 sources

                                                return;
                                            }
                                            if (var12_4 || var12_4) ** GOTO lbl6
                                            if (var1_1.getType() == 0) break block131;
                                            if (var12_4) ** GOTO lbl6
                                            return;
                                        }
                                        if (var12_4 || var12_4) ** GOTO lbl6
                                        if (ge.mc.field_1724 == null) break block132;
                                        if (var12_4) ** GOTO lbl6
                                        if (ge.mc.field_1687 != null) break block133;
                                        if (var12_4) ** GOTO lbl6
                                    }
                                    if (var12_4 || var12_4) ** GOTO lbl6
                                    return;
                                }
                                if (var12_4 || var12_4) ** GOTO lbl6
                                if (this.mode.isSelected("Slime Block")) break block134;
                                if (var12_4) ** GOTO lbl6
                                return;
                            }
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var2_5 = ge.mc.field_1724.method_6079().method_7909() instanceof class_1747;
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var3_6 = this.findHotbarBlockSlot();
                            if (var12_4 || var12_4) ** GOTO lbl6
                            var4_7 = this.findPos();
                            if (var12_4 || var12_4) ** GOTO lbl6
                            if (var2_5) break block135;
                            if (var12_4) ** GOTO lbl6
                            if (var3_6 == ge.ioxe("iqyo", ioxa(int ), (int)520)) ** GOTO lbl95
                            if (var12_4) ** GOTO lbl6
                        }
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (var4_7.equals((Object)class_2338.field_10980)) ** GOTO lbl95
                        if (var12_4 || var12_4) ** GOTO lbl6
                        if (!var2_5) break block136;
                        if (var12_4) ** GOTO lbl6
                        v0 = ge.mc.field_1724.method_6079();
                        if (var14_2) {
                            throw null;
                        }
                        break block137;
                    }
                    if (var12_4 || var12_4) ** GOTO lbl6
                    v0 = var5_8 = ge.mc.field_1724.method_31548().method_5438(var3_6);
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!var2_5) break block138;
                if (var12_4) ** GOTO lbl6
                v1 = class_1268.field_5810;
                if (var14_2) {
                    throw null;
                }
                break block139;
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            v1 = var6_9 = class_1268.field_5808;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        var7_10 = var4_7.method_46558();
        if (var12_4 || var12_4) ** GOTO lbl6
        var8_11 = class_2350.method_10142((double)(var7_10.field_1352 - ge.mc.field_1724.method_23317()), (double)(var7_10.field_1351 - ge.mc.field_1724.method_23318()), (double)(var7_10.field_1350 - ge.mc.field_1724.method_23321()));
        if (var12_4 || var12_4) ** GOTO lbl6
        var9_12 = ow.calculateAngle(var7_10.method_1020(new class_243(var8_11.method_62675()).method_1021((double)ge.ioxe("iqyp", ipdf(int ), (int)337))));
        if (var12_4 || var12_4) ** GOTO lbl6
        var10_13 = new ov$VecRotation(var9_12, var9_12.toVector());
        if (var12_4 || var12_4) ** GOTO lbl6
        ot.INSTANCE.rotateTo(var10_13, (class_1309)ge.mc.field_1724, (int)ge.ioxe("iqyq", ioxa(int ), (int)521), new os(new hy(), (boolean)ge.ioxe("iqyr", ioxa(int ), (int)522), (boolean)ge.ioxe("iqys", ioxa(int ), (int)523), (boolean)ge.ioxe("iqyt", ioxa(int ), (int)524)), nn.HIGH_IMPORTANCE_1, this);
        if (var12_4 || var12_4) ** GOTO lbl6
        if (!this.canPlace(var5_8)) ** GOTO lbl95
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_4 || var12_4) ** GOTO lbl6
                var11_14 = ge.mc.field_1724.method_31548().method_67532();
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var2_5) ** GOTO lbl85
                if (var12_4) ** GOTO lbl6
                nv.selectSlot(var3_6);
                if (var12_4) ** GOTO lbl6
lbl85:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                ge.mc.field_1761.method_2896(ge.mc.field_1724, var6_9, new class_3965(var7_10, var8_11.method_10153(), var4_7, (boolean)ge.ioxe("iqyu", ioxa(int ), (int)525)));
                if (var12_4 || var12_4) ** GOTO lbl6
                ge.mc.field_1724.field_3944.method_52787((class_2596)new class_2879(var6_9));
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var2_5) ** GOTO lbl95
                if (var12_4) ** GOTO lbl6
                nv.selectSlot(var11_14);
                if (var12_4) ** GOTO lbl6
lbl95:
                // 5 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_3 /* !! */  = (int)ge.ioxe("iqyv", ioxa(int ), (int)526);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 1: {
                var13_3 /* !! */  = (int)ge.ioxe("iqyw", ioxa(int ), (int)527);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl108:
            // 2 sources

            case 2: {
                var13_3 /* !! */  = (int)ge.ioxe("iqyx", ioxa(int ), (int)528);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl113:
            // 2 sources

            case 3: {
                var13_3 /* !! */  = (int)ge.ioxe("iqyy", ioxa(int ), (int)529);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl118:
            // 2 sources

            case 4: {
                var13_3 /* !! */  = (int)ge.ioxe("iqyz", ioxa(int ), (int)530);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 5: {
                var13_3 /* !! */  = (int)ge.ioxe("iqza", ioxa(int ), (int)531);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl128:
            // 2 sources

            case 6: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzb", ioxa(int ), (int)532);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl133:
            // 3 sources

            case 7: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzc", ioxa(int ), (int)533);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl138:
            // 3 sources

            case 8: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzd", ioxa(int ), (int)534);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl143:
            // 3 sources

            case 9: {
                var13_3 /* !! */  = (int)ge.ioxe("iqze", ioxa(int ), (int)535);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl148:
            // 2 sources

            case 10: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzf", ioxa(int ), (int)536);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl153:
            // 2 sources

            case 11: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzg", ioxa(int ), (int)537);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl158:
            // 4 sources

            case 12: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzh", ioxa(int ), (int)538);
                if (!var14_2) break;
                throw null;
            }
            case 13: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzi", ioxa(int ), (int)539);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl167:
            // 2 sources

            case 14: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzj", ioxa(int ), (int)540);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl172:
            // 2 sources

            case 15: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzk", ioxa(int ), (int)541);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl177:
            // 2 sources

            case 16: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzl", ioxa(int ), (int)542);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 17: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzm", ioxa(int ), (int)543);
                if (!var14_2) ** GOTO lbl172
                throw null;
            }
lbl186:
            // 2 sources

            case 18: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzn", ioxa(int ), (int)544);
                if (!var14_2) ** GOTO lbl167
                throw null;
            }
            case 19: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzo", ioxa(int ), (int)545);
                if (!var14_2) ** GOTO lbl143
                throw null;
            }
            case 20: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzp", ioxa(int ), (int)546);
                if (!var14_2) ** GOTO lbl133
                throw null;
            }
lbl198:
            // 2 sources

            case 21: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzq", ioxa(int ), (int)547);
                if (!var14_2) ** GOTO lbl113
                throw null;
            }
lbl202:
            // 3 sources

            case 22: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzr", ioxa(int ), (int)548);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl207:
            // 3 sources

            case 23: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzs", ioxa(int ), (int)549);
                if (!var14_2) ** GOTO lbl148
                throw null;
            }
lbl211:
            // 4 sources

            case 24: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzt", ioxa(int ), (int)550);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl216:
            // 4 sources

            case 25: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzu", ioxa(int ), (int)551);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl221:
            // 3 sources

            case 26: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzv", ioxa(int ), (int)552);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 27: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzw", ioxa(int ), (int)553);
                if (!var14_2) ** GOTO lbl138
                throw null;
            }
            case 28: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzx", ioxa(int ), (int)554);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl235:
            // 2 sources

            case 29: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzy", ioxa(int ), (int)555);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl240:
            // 2 sources

            case 30: {
                var13_3 /* !! */  = (int)ge.ioxe("iqzz", ioxa(int ), (int)556);
                if (!var14_2) ** GOTO lbl138
                throw null;
            }
lbl244:
            // 2 sources

            case 31: {
                var13_3 /* !! */  = (int)ge.ioxe("iraa", ioxa(int ), (int)557);
                if (!var14_2) ** GOTO lbl108
                throw null;
            }
lbl248:
            // 2 sources

            case 32: {
                var13_3 /* !! */  = (int)ge.ioxe("irab", ioxa(int ), (int)558);
                if (!var14_2) ** GOTO lbl143
                throw null;
            }
lbl252:
            // 3 sources

            case 33: {
                var13_3 /* !! */  = (int)ge.ioxe("irac", ioxa(int ), (int)559);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 34: {
                var13_3 /* !! */  = (int)ge.ioxe("irad", ioxa(int ), (int)560);
                if (!var14_2) ** GOTO lbl128
                throw null;
            }
lbl261:
            // 3 sources

            case 35: {
                var13_3 /* !! */  = (int)ge.ioxe("irae", ioxa(int ), (int)561);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 36: {
                var13_3 /* !! */  = (int)ge.ioxe("iraf", ioxa(int ), (int)562);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl271:
            // 3 sources

            case 37: {
                var13_3 /* !! */  = (int)ge.ioxe("irag", ioxa(int ), (int)563);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl276:
            // 2 sources

            case 38: {
                var13_3 /* !! */  = (int)ge.ioxe("irah", ioxa(int ), (int)564);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl281:
            // 2 sources

            case 39: {
                var13_3 /* !! */  = (int)ge.ioxe("irai", ioxa(int ), (int)565);
                if (!var14_2) ** GOTO lbl240
                throw null;
            }
            case 40: {
                var13_3 /* !! */  = (int)ge.ioxe("iraj", ioxa(int ), (int)566);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 41: {
                var13_3 /* !! */  = (int)ge.ioxe("irak", ioxa(int ), (int)567);
                if (!var14_2) ** GOTO lbl202
                throw null;
            }
            case 42: {
                var13_3 /* !! */  = (int)ge.ioxe("iral", ioxa(int ), (int)568);
                if (!var14_2) ** GOTO lbl177
                throw null;
            }
            case 43: {
                var13_3 /* !! */  = (int)ge.ioxe("iram", ioxa(int ), (int)569);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl303:
            // 2 sources

            case 44: {
                var13_3 /* !! */  = (int)ge.ioxe("iran", ioxa(int ), (int)570);
                if (!var14_2) ** GOTO lbl133
                throw null;
            }
            case 45: {
                var13_3 /* !! */  = (int)ge.ioxe("irao", ioxa(int ), (int)571);
                if (!var14_2) ** GOTO lbl216
                throw null;
            }
            case 46: {
                var13_3 /* !! */  = (int)ge.ioxe("irap", ioxa(int ), (int)572);
                if (!var14_2) ** GOTO lbl118
                throw null;
            }
lbl315:
            // 3 sources

            case 47: {
                var13_3 /* !! */  = (int)ge.ioxe("iraq", ioxa(int ), (int)573);
                if (!var14_2) ** GOTO lbl207
                throw null;
            }
            case 48: {
                var13_3 /* !! */  = (int)ge.ioxe("irar", ioxa(int ), (int)574);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
lbl324:
            // 2 sources

            case 49: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)ge.ioxe("iras", ioxa(int ), (int)575);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl359
                    break;
                }
            }
lbl330:
            // 2 sources

            case 50: {
                var13_3 /* !! */  = (int)ge.ioxe("irat", ioxa(int ), (int)576);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 51: {
                var13_3 /* !! */  = (int)ge.ioxe("irau", ioxa(int ), (int)577);
                if (!var14_2) ** GOTO lbl211
                throw null;
            }
lbl339:
            // 2 sources

            case 52: {
                var13_3 /* !! */  = (int)ge.ioxe("irav", ioxa(int ), (int)578);
                if (!var14_2) ** GOTO lbl281
                throw null;
            }
lbl343:
            // 3 sources

            case 53: {
                var13_3 /* !! */  = (int)ge.ioxe("iraw", ioxa(int ), (int)579);
                if (!var14_2) ** GOTO lbl315
                throw null;
            }
lbl347:
            // 2 sources

            case 54: {
                var13_3 /* !! */  = (int)ge.ioxe("irax", ioxa(int ), (int)580);
                if (var14_2) {
                    throw null;
                }
            }
            case 55: {
                var13_3 /* !! */  = (int)ge.ioxe("iray", ioxa(int ), (int)581);
                if (!var14_2) ** GOTO lbl211
                throw null;
            }
lbl355:
            // 2 sources

            case 56: {
                var13_3 /* !! */  = (int)ge.ioxe("iraz", ioxa(int ), (int)582);
                if (!var14_2) ** GOTO lbl244
                throw null;
            }
lbl359:
            // 2 sources

            case 57: {
                var13_3 /* !! */  = (int)ge.ioxe("irba", ioxa(int ), (int)583);
                if (!var14_2) ** GOTO lbl186
                throw null;
            }
lbl363:
            // 2 sources

            case 58: {
                var13_3 /* !! */  = (int)ge.ioxe("irbb", ioxa(int ), (int)584);
                if (!var14_2) ** GOTO lbl261
                throw null;
            }
lbl367:
            // 3 sources

            case 59: {
                var13_3 /* !! */  = (int)ge.ioxe("irbc", ioxa(int ), (int)585);
                if (!var14_2) ** GOTO lbl221
                throw null;
            }
lbl371:
            // 4 sources

            case 60: {
                var13_3 /* !! */  = (int)ge.ioxe("irbd", ioxa(int ), (int)586);
                if (!var14_2) ** GOTO lbl216
                throw null;
            }
lbl375:
            // 2 sources

            case 61: {
                var13_3 /* !! */  = (int)ge.ioxe("irbe", ioxa(int ), (int)587);
                if (!var14_2) ** GOTO lbl221
                throw null;
            }
            case 62: {
                var13_3 /* !! */  = (int)ge.ioxe("irbf", ioxa(int ), (int)588);
                if (!var14_2) ** GOTO lbl216
                throw null;
            }
            case 63: {
                do {
                    var13_3 /* !! */  = (int)ge.ioxe("irbg", ioxa(int ), (int)589);
                } while (!var14_2);
                throw null;
            }
lbl388:
            // 2 sources

            case 64: {
                var13_3 /* !! */  = (int)ge.ioxe("irbh", ioxa(int ), (int)590);
                if (!var14_2) ** GOTO lbl158
                throw null;
            }
            case 65: {
                var13_3 /* !! */  = (int)ge.ioxe("irbi", ioxa(int ), (int)591);
                if (!var14_2) ** GOTO lbl202
                throw null;
            }
            case 66: 
        }
        var13_3 /* !! */  = (int)ge.ioxe("irbj", ioxa(int ), (int)592);
        ** while (!var14_2)
lbl399:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ituj() {
        ge.ioxu[300] = 2253471395459464904L;
        ge.ioxu[301] = 4169975241083942764L;
        ge.ioxu[302] = -4159903226245334604L;
        ge.ioxu[303] = -7545951425056289621L;
        ge.ioxu[304] = 3292322333207980957L;
        ge.ioxu[305] = -4807629686814606717L;
        ge.ioxu[306] = -3164118104727856887L;
        ge.ioxu[307] = -269160842543221950L;
        ge.ioxu[308] = -3854852486589806283L;
        ge.ioxu[309] = 4366765072980691710L;
        ge.ioxu[310] = -6430655569276979189L;
        ge.ioxu[311] = -6705184925443922105L;
        ge.ioxu[312] = -5849180683736709341L;
        ge.ioxu[313] = 2346957503195402211L;
        ge.ioxu[314] = 4356493727781822364L;
        ge.ioxu[315] = -8539100845792586048L;
        ge.ioxu[316] = -5224773685520413914L;
        ge.ioxu[317] = -3723984037498966997L;
        ge.ioxu[318] = -3291539253318035785L;
        ge.ioxu[319] = 1950689890640236140L;
        ge.ioxu[320] = 6498838325474925647L;
        ge.ioxu[321] = -4893542720413079303L;
        ge.ioxu[322] = 3423103243229917486L;
        ge.ioxu[323] = -1070191105602699887L;
        ge.ioxu[324] = 1432749944508313588L;
        ge.ioxu[325] = -6012535501757427698L;
        ge.ioxu[326] = -4111240249738425705L;
        ge.ioxu[327] = 3298530894002053410L;
        ge.ioxu[328] = 1615107436927362607L;
        ge.ioxu[329] = 7304800741404008515L;
        ge.ioxu[330] = -1494733283549306866L;
        ge.ioxu[331] = -4066209336379666413L;
        ge.ioxu[332] = 3147595382036126783L;
        ge.ioxu[333] = 5964969755188084299L;
        ge.ioxu[334] = -8483280775784825934L;
        ge.ioxu[335] = 6988545508553917403L;
        ge.ioxu[336] = -2207949883197372411L;
        ge.ioxu[337] = -3191821495945711095L;
        ge.ioxu[338] = -4920220550325608539L;
        ge.ioxu[339] = 1043010494810927471L;
        ge.ioxu[340] = -2600316902554304386L;
        ge.ioxu[341] = -1133295036856543224L;
        ge.ioxu[342] = -6257976784072691324L;
        ge.ioxu[343] = -3814426102516858609L;
        ge.ioxu[344] = -286743656387716739L;
        ge.ioxu[345] = -1396925474758291270L;
        ge.ioxu[346] = -7250026736797568324L;
        ge.ioxu[347] = -1764468345925324328L;
        ge.ioxu[348] = 7055414927574106780L;
        ge.ioxu[349] = -2002862279063851199L;
        ge.ioxu[350] = -8379409680767153251L;
        ge.ioxu[351] = -7657866441088481897L;
        ge.ioxu[352] = -7497810140461752729L;
        ge.ioxu[353] = 1376522018292297999L;
        ge.ioxu[354] = 6266367711883101268L;
        ge.ioxu[355] = 3675941504785637410L;
        ge.ioxu[356] = 7660504899437445971L;
        ge.ioxu[357] = 4642629115334327306L;
        ge.ioxu[358] = 7436571235120521045L;
        ge.ioxu[359] = 2502587738861036755L;
        ge.ioxu[360] = 4612137415955652373L;
        ge.ioxu[361] = 5473542229605847508L;
        ge.ioxu[362] = -3876366718283321388L;
        ge.ioxu[363] = -2202581633564065949L;
        ge.ioxu[364] = -1139414254847985135L;
        ge.ioxu[365] = 758305297671571884L;
        ge.ioxu[366] = -1603032450967891416L;
        ge.ioxu[367] = 9156053775225751723L;
        ge.ioxu[368] = -7952942574429183618L;
        ge.ioxu[369] = -7950699820599954130L;
        ge.ioxu[370] = 2418245818623659986L;
        ge.ioxu[371] = 5553648302694337801L;
        ge.ioxu[372] = -6986467961668641544L;
        ge.ioxu[373] = -6146924953719527499L;
        ge.ioxu[374] = 5204315301556641229L;
        ge.ioxu[375] = 5742749152690858714L;
        ge.ioxu[376] = -3693288193887839551L;
        ge.ioxu[377] = -6762041282571200008L;
        ge.ioxu[378] = 814305256145605935L;
        ge.ioxu[379] = 3881704586461857441L;
        ge.ioxu[380] = -4433723747199888426L;
        ge.ioxu[381] = 406646997273452620L;
        ge.ioxu[382] = -8737220656095199160L;
        ge.ioxu[383] = -8453445370140719596L;
        ge.ioxu[384] = 4972396421489525039L;
        ge.ioxu[385] = 3432132944447088757L;
        ge.ioxu[386] = -6820182269997593360L;
        ge.ioxu[387] = 63109755583774115L;
        ge.ioxu[388] = -6719063921511331142L;
        ge.ioxu[389] = 5842275387510645014L;
        ge.ioxu[390] = -565146971878056735L;
        ge.ioxu[391] = -3528094203776272148L;
        ge.ioxu[392] = 1595342726310257542L;
        ge.ioxu[393] = 6415239105633768525L;
        ge.ioxu[394] = -3355694360116916792L;
        ge.ioxu[395] = 5769790403051687061L;
        ge.ioxu[396] = 4523763040712935191L;
        ge.ioxu[397] = -8065907459632131366L;
        ge.ioxu[398] = 2862918967618860804L;
        ge.ioxu[399] = 5928651868202055888L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findHotbarBlockSlot() {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(ge.ioxe("irdd", ioxs(int ), (int)354) - ge.ioxe("irdc", ioxs(int ), (int)353));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1741915607: {
                    continue block41;
                }
                case -239756314: {
                    break block41;
                }
            }
            break;
        }
        var4_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irde", ioxs(int ), (int)355)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("irdf", ioxa(int ), (int)622)) break;
            v1 /* !! */  = (long)ge.ioxe("irdg", ioxa(int ), (int)623);
        }
        var3_2 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl21
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("irdh", ioxs(int ), (int)356));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1900813972: {
                    v3 = ge.ioxe("irdi", ioxs(int ), (int)357);
                    continue block43;
                }
                case -1639133136: {
                    v3 = ge.ioxe("irdj", ioxs(int ), (int)358);
                    continue block43;
                }
                case -239756314: {
                    break block43;
                }
            }
            break;
        }
        var2_3 = ge.a;
        if (var4_1) {
            throw null;
lbl33:
            // 8 sources

            return (int)ge.ioxe("irdk", ioxa(int ), (int)624);
        }
        if (var2_3 || var2_3) ** GOTO lbl33
        var1_4 = ge.ioxe("irdl", ioxa(int ), (int)625);
        if (var2_3) ** GOTO lbl33
        block45: while (true) {
            if (var2_3 || var2_3) ** GOTO lbl33
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_4 >= ge.ioxe("irdm", ioxa(int ), (int)626)) ** GOTO lbl97
                    if (var2_3 || var2_3) ** GOTO lbl33
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irdn", ioxs(int ), (int)359)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == ge.ioxe("irdo", ioxa(int ), (int)627)) break;
                        v4 /* !! */  = (long)ge.ioxe("irdp", ioxa(int ), (int)628);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irdq", ioxs(int ), (int)360)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == ge.ioxe("irdr", ioxa(int ), (int)629)) break;
                        v5 /* !! */  = (long)ge.ioxe("irds", ioxa(int ), (int)630);
                    }
                    v6 = ge.mc.field_1724;
                    v7 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl60
                    block48: while (true) {
                        v7 /* !! */  = (long)(ge.ioxe("irdu", ioxs(int ), (int)362) - ge.ioxe("irdt", ioxs(int ), (int)361));
lbl60:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -520816320: {
                                continue block48;
                            }
                            case -239756314: {
                                break block48;
                            }
                        }
                        break;
                    }
                    v8 = v6.method_31548();
                    v9 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl70
                    block49: while (true) {
                        v9 /* !! */  = (long)(ge.ioxe("irdw", ioxs(int ), (int)364) - ge.ioxe("irdv", ioxs(int ), (int)363));
lbl70:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1064981489: {
                                continue block49;
                            }
                            case -239756314: {
                                break block49;
                            }
                        }
                        break;
                    }
                    v10 = v8.method_5438((int)var1_4);
                    v11 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl80
                    block50: while (true) {
                        v11 /* !! */  = (long)(v12 - ge.ioxe("irdx", ioxs(int ), (int)365));
lbl80:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -239756314: {
                                break block50;
                            }
                            case 142765125: {
                                v12 = ge.ioxe("irdy", ioxs(int ), (int)366);
                                continue block50;
                            }
                            case 1862214891: {
                                v12 = ge.ioxe("irdz", ioxs(int ), (int)367);
                                continue block50;
                            }
                        }
                        break;
                    }
                    if (!(v10.method_7909() instanceof class_1747)) ** GOTO lbl92
                    if (var2_3 || var2_3) ** GOTO lbl33
                    return (int)var1_4;
lbl92:
                    // 1 sources

                    if (var2_3 || var2_3) ** GOTO lbl33
                    ++var1_4;
                    if (var2_3) ** GOTO lbl33
                    if (!var4_1) continue block45;
                    throw null;
lbl97:
                    // 1 sources

                    if (!var2_3 && !var2_3) ** break;
                    ** continue;
                    return (int)ge.ioxe("irea", ioxa(int ), (int)631);
                }
                case 0: {
                    var3_2 /* !! */  = (int)ge.ioxe("ireb", ioxa(int ), (int)632);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl105:
                // 2 sources

                case 1: {
                    var3_2 /* !! */  = (int)ge.ioxe("irec", ioxa(int ), (int)633);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl115
                }
lbl110:
                // 2 sources

                case 2: {
                    var3_2 /* !! */  = (int)ge.ioxe("ired", ioxa(int ), (int)634);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl115:
                // 3 sources

                case 3: {
                    var3_2 /* !! */  = (int)ge.ioxe("iree", ioxa(int ), (int)635);
                    if (!var4_1) break block45;
                    throw null;
                }
lbl119:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)ge.ioxe("iref", ioxa(int ), (int)636);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl134
                }
                case 5: {
                    var3_2 /* !! */  = (int)ge.ioxe("ireg", ioxa(int ), (int)637);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
                case 6: {
                    var3_2 /* !! */  = (int)ge.ioxe("ireh", ioxa(int ), (int)638);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl151
                }
lbl134:
                // 2 sources

                case 7: {
                    var3_2 /* !! */  = (int)ge.ioxe("irei", ioxa(int ), (int)639);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
                case 8: {
                    var3_2 /* !! */  = (int)ge.ioxe("irej", ioxa(int ), (int)640);
                    if (!var4_1) ** GOTO lbl119
                    throw null;
                }
                case 9: {
                    var3_2 /* !! */  = (int)ge.ioxe("irek", ioxa(int ), (int)641);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 10: {
                    var3_2 /* !! */  = (int)ge.ioxe("irel", ioxa(int ), (int)642);
                    if (!var4_1) ** GOTO lbl115
                    throw null;
                }
lbl151:
                // 2 sources

                case 11: {
                    var3_2 /* !! */  = (int)ge.ioxe("irem", ioxa(int ), (int)643);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl156:
                // 5 sources

                case 12: {
                    var3_2 /* !! */  = (int)ge.ioxe("iren", ioxa(int ), (int)644);
                    if (!var4_1) ** GOTO lbl110
                    throw null;
                }
lbl160:
                // 2 sources

                case 13: {
                    var3_2 /* !! */  = (int)ge.ioxe("ireo", ioxa(int ), (int)645);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 14: {
                    var3_2 /* !! */  = (int)ge.ioxe("irep", ioxa(int ), (int)646);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 15: {
                    var3_2 /* !! */  = (int)ge.ioxe("ireq", ioxa(int ), (int)647);
                    if (!var4_1) ** GOTO lbl105
                    throw null;
                }
                case 16: 
            }
            break;
        }
        do {
            var3_2 /* !! */  = (int)ge.ioxe("irer", ioxa(int ), (int)648);
        } while (!var4_1);
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void handleSlimeBlock() {
        class_2338 class_23382;
        class_239 class_2392;
        boolean bl2;
        boolean bl3;
        block17: {
            block16: {
                CallSite callSite;
                block15: {
                    bl3 = c;
                    int n2 = b;
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    if (bl2) return;
                    if (bl2) return;
                    class_2338 class_23383 = ge.mc.field_1724.method_24515();
                    if (bl2) return;
                    if (bl2) return;
                    class_239 class_2393 = new class_2338[4];
                    class_2393[ge.ioxe("iquz", ioxa(int ), (int)431)] = class_23383.method_10078();
                    class_2393[ge.ioxe("iqva", ioxa(int ), (int)432)] = class_23383.method_10067();
                    class_2393[ge.ioxe("iqvb", ioxa(int ), (int)433)] = class_23383.method_10095();
                    class_2393[ge.ioxe("iqvc", ioxa(int ), (int)434)] = class_23383.method_10072();
                    class_239 class_2395 = class_2393;
                    if (bl2) return;
                    if (bl2) return;
                    callSite = ge.ioxe("iqvd", ioxa(int ), (int)435);
                    if (bl2) return;
                    if (bl2) return;
                    class_2392 = class_2395;
                    if (bl2) return;
                    int n3 = ((class_2338[])class_2392).length;
                    if (bl2) return;
                    CallSite callSite2 = ge.ioxe("iqve", ioxa(int ), (int)436);
                    if (bl2) return;
                    do {
                        void var6_11;
                        if (bl2) return;
                        if (bl2) return;
                        if (var6_11 >= n3) break block15;
                        if (bl2) return;
                        class_23382 = class_2392[var6_11];
                        if (bl2) return;
                        if (bl2) return;
                        if (this.getBlockState(class_23382) == class_2246.field_10030) {
                            if (bl2) return;
                            if (bl2) return;
                            callSite = ge.ioxe("iqvf", ioxa(int ), (int)437);
                            if (bl2) return;
                            if (bl2) return;
                            if (bl3) {
                                throw null;
                            }
                            break block15;
                        }
                        if (bl2) return;
                        if (bl2) return;
                        ++var6_11;
                        if (bl2) return;
                    } while (!bl3);
                    throw null;
                }
                if (bl2) return;
                if (bl2) return;
                if (callSite == false) break block16;
                if (bl2) return;
                if (!ge.mc.field_1724.field_5976) break block16;
                if (bl2) return;
                if (!(ge.mc.field_1724.method_18798().field_1351 <= ge.ioxe("iqvg", ipdf(int ), (int)334))) break block17;
                if (bl2) return;
            }
            if (bl2) return;
            if (bl2) return;
            return;
        }
        if (bl2) return;
        if (bl2) return;
        class_2392 = ge.mc.field_1765;
        if (bl2) return;
        if (bl2) return;
        if (class_2392 instanceof class_3965) {
            if (bl2) return;
            class_3965 class_39652 = (class_3965)class_2392;
            if (bl2) return;
            if (bl2) return;
            class_2350 class_23502 = class_39652.method_17780();
            if (bl2) return;
            if (bl2) return;
            class_23382 = class_39652.method_17777();
            if (bl2) return;
            if (bl2) return;
            if (this.getBlockState(class_23382) == class_2246.field_10124) {
                if (bl2) return;
                if (bl2) return;
                return;
            }
            if (bl2) return;
            if (bl2) return;
            int n4 = this.findHotbarSlot(class_1802.field_8828);
            if (bl2) return;
            if (bl2) return;
            if (n4 != ge.ioxe("iqvh", ioxa(int ), (int)438)) {
                if (bl2) return;
                if (bl2) return;
                nv.selectSlot(n4);
                if (bl2) return;
                if (bl2) return;
                this.startSetPitch = ge.ioxe("iqvi", ioxa(int ), (int)439);
                if (bl2) return;
                if (bl2) return;
                ge.mc.field_1724.method_36457((float)ge.ioxe("iqvk", iqvj(int ), (int)440));
                if (bl2) return;
                if (bl2) return;
                class_3965 class_39653 = new class_3965(class_39652.method_17784(), class_23502, class_23382, (boolean)ge.ioxe("iqvl", ioxa(int ), (int)441));
                if (bl2) return;
                if (bl2) return;
                ge.mc.field_1761.method_2896(ge.mc.field_1724, class_1268.field_5808, class_39653);
                if (bl2) return;
                if (bl2) return;
                ge.mc.field_1724.method_6104(class_1268.field_5808);
                if (bl2) return;
                if (bl2) return;
                if ((double)this.cooldown >= ge.ioxe("iqvm", ipdf(int ), (int)335)) {
                    if (bl2) return;
                    if (bl2) return;
                    ge.mc.field_1724.method_18800(ge.mc.field_1724.method_18798().field_1352, (double)ge.ioxe("iqvn", ipdf(int ), (int)336), ge.mc.field_1724.method_18798().field_1350);
                    if (bl2) return;
                    if (bl2) return;
                    this.cooldown = (int)ge.ioxe("iqvo", ioxa(int ), (int)442);
                    if (bl2) return;
                    if (bl3) {
                        throw null;
                    }
                } else {
                    if (bl2) return;
                    if (bl2) return;
                    this.cooldown += ge.ioxe("iqvp", ioxa(int ), (int)443);
                    if (bl2) return;
                }
            }
        }
        if (bl2) return;
        if (bl2) return;
    }

    private static /* synthetic */ void ittv() {
        ge.ioxd[400] = 627706012;
        ge.ioxd[401] = 2069918802;
        ge.ioxd[402] = -346441818;
        ge.ioxd[403] = 470877572;
        ge.ioxd[404] = 1844689828;
        ge.ioxd[405] = 1009036952;
        ge.ioxd[406] = -1381564890;
        ge.ioxd[407] = -863784357;
        ge.ioxd[408] = -59761361;
        ge.ioxd[409] = -589377332;
        ge.ioxd[410] = -720071039;
        ge.ioxd[411] = -520356781;
        ge.ioxd[412] = -1239365405;
        ge.ioxd[413] = 1380702257;
        ge.ioxd[414] = -758669595;
        ge.ioxd[415] = 558480189;
        ge.ioxd[416] = 1692856712;
        ge.ioxd[417] = 210805261;
        ge.ioxd[418] = 807629363;
        ge.ioxd[419] = -272555517;
        ge.ioxd[420] = 100087277;
        ge.ioxd[421] = -1338389822;
        ge.ioxd[422] = -2042231037;
        ge.ioxd[423] = 387540558;
        ge.ioxd[424] = -1678145590;
        ge.ioxd[425] = -1689002166;
        ge.ioxd[426] = -1122448413;
        ge.ioxd[427] = -570476617;
        ge.ioxd[428] = -2139169171;
        ge.ioxd[429] = 1420054180;
        ge.ioxd[430] = 65124203;
        ge.ioxd[431] = 1687461222;
        ge.ioxd[432] = -552673304;
        ge.ioxd[433] = -715839154;
        ge.ioxd[434] = -2048908387;
        ge.ioxd[435] = -1876380420;
        ge.ioxd[436] = -636157912;
        ge.ioxd[437] = 1246188739;
        ge.ioxd[438] = -1600651962;
        ge.ioxd[439] = -1571425468;
        ge.ioxd[440] = 919716222;
        ge.ioxd[441] = 633439682;
        ge.ioxd[442] = 805785628;
        ge.ioxd[443] = 1995013788;
        ge.ioxd[444] = 261871767;
        ge.ioxd[445] = -605431843;
        ge.ioxd[446] = -664642212;
        ge.ioxd[447] = 31289645;
        ge.ioxd[448] = 1239753598;
        ge.ioxd[449] = -701479596;
        ge.ioxd[450] = -1556481036;
        ge.ioxd[451] = 1235148681;
        ge.ioxd[452] = 741437804;
        ge.ioxd[453] = -272174203;
        ge.ioxd[454] = -1484333684;
        ge.ioxd[455] = -2105381632;
        ge.ioxd[456] = -866538522;
        ge.ioxd[457] = 1465357114;
        ge.ioxd[458] = 5467696;
        ge.ioxd[459] = 1823936897;
        ge.ioxd[460] = -1279515530;
        ge.ioxd[461] = -1224825898;
        ge.ioxd[462] = 2083130726;
        ge.ioxd[463] = 65822491;
        ge.ioxd[464] = -1725119005;
        ge.ioxd[465] = -1615520139;
        ge.ioxd[466] = 1174750337;
        ge.ioxd[467] = 735648705;
        ge.ioxd[468] = 2098898081;
        ge.ioxd[469] = 134688593;
        ge.ioxd[470] = -1545826761;
        ge.ioxd[471] = -1578421427;
        ge.ioxd[472] = 949592715;
        ge.ioxd[473] = -567107225;
        ge.ioxd[474] = -176323727;
        ge.ioxd[475] = -914995769;
        ge.ioxd[476] = 1605769679;
        ge.ioxd[477] = -1035083687;
        ge.ioxd[478] = 2030731618;
        ge.ioxd[479] = -1857661466;
        ge.ioxd[480] = 593740584;
        ge.ioxd[481] = 734180502;
        ge.ioxd[482] = 779427034;
        ge.ioxd[483] = 2077252566;
        ge.ioxd[484] = -1229436078;
        ge.ioxd[485] = -2072633929;
        ge.ioxd[486] = 1104934620;
        ge.ioxd[487] = -2037202885;
        ge.ioxd[488] = 1630882747;
        ge.ioxd[489] = -978784468;
        ge.ioxd[490] = 1125697133;
        ge.ioxd[491] = 1439957877;
        ge.ioxd[492] = -1813210506;
        ge.ioxd[493] = 1697846039;
        ge.ioxd[494] = -935023698;
        ge.ioxd[495] = 940447013;
        ge.ioxd[496] = -192600716;
        ge.ioxd[497] = -1888118921;
        ge.ioxd[498] = -423223251;
        ge.ioxd[499] = -1673977872;
    }

    private static /* synthetic */ void irvx() {
        ge.ioxc[700] = -1789057341;
        ge.ioxc[701] = 1422482268;
        ge.ioxc[702] = -1094013938;
        ge.ioxc[703] = 1104143240;
        ge.ioxc[704] = -1292686378;
        ge.ioxc[705] = -1576267040;
        ge.ioxc[706] = 637738018;
        ge.ioxc[707] = 1714108096;
        ge.ioxc[708] = -1714492280;
        ge.ioxc[709] = 1158389807;
        ge.ioxc[710] = -1766535618;
        ge.ioxc[711] = -950671177;
        ge.ioxc[712] = -1710367281;
        ge.ioxc[713] = 1821323514;
        ge.ioxc[714] = 302311412;
        ge.ioxc[715] = 1435528983;
        ge.ioxc[716] = -1909678965;
        ge.ioxc[717] = -1136060592;
        ge.ioxc[718] = 1111806326;
        ge.ioxc[719] = 1107124848;
        ge.ioxc[720] = -1362934354;
        ge.ioxc[721] = 731872272;
        ge.ioxc[722] = 1916765757;
        ge.ioxc[723] = 827198158;
        ge.ioxc[724] = 629927379;
        ge.ioxc[725] = 1060752372;
        ge.ioxc[726] = 1055359082;
        ge.ioxc[727] = -664245411;
        ge.ioxc[728] = -1195074356;
        ge.ioxc[729] = -1143295568;
        ge.ioxc[730] = -1305684706;
        ge.ioxc[731] = 697390360;
        ge.ioxc[732] = -642063122;
        ge.ioxc[733] = 680324115;
        ge.ioxc[734] = 764024525;
        ge.ioxc[735] = -127321552;
        ge.ioxc[736] = 184695186;
        ge.ioxc[737] = -1115124609;
        ge.ioxc[738] = -768661946;
        ge.ioxc[739] = 135890424;
        ge.ioxc[740] = -1804080251;
        ge.ioxc[741] = 1740725282;
        ge.ioxc[742] = 1495386515;
        ge.ioxc[743] = -409823253;
        ge.ioxc[744] = -1686794181;
        ge.ioxc[745] = 1831073658;
        ge.ioxc[746] = 858386063;
        ge.ioxc[747] = 1380742295;
        ge.ioxc[748] = -2142843962;
        ge.ioxc[749] = -496606088;
        ge.ioxc[750] = 1742495258;
        ge.ioxc[751] = -1323601239;
        ge.ioxc[752] = 447808891;
        ge.ioxc[753] = -2093353211;
        ge.ioxc[754] = -608876995;
        ge.ioxc[755] = 376552618;
        ge.ioxc[756] = 1159693282;
        ge.ioxc[757] = 1161681560;
        ge.ioxc[758] = -1890799114;
        ge.ioxc[759] = -903320766;
        ge.ioxc[760] = 353501089;
        ge.ioxc[761] = 1011083285;
        ge.ioxc[762] = 1396519572;
        ge.ioxc[763] = -59176450;
        ge.ioxc[764] = -1665808438;
        ge.ioxc[765] = -1974637685;
        ge.ioxc[766] = -1347745430;
        ge.ioxc[767] = -1997542859;
        ge.ioxc[768] = -1355302398;
        ge.ioxc[769] = 2109227535;
        ge.ioxc[770] = -1488958182;
        ge.ioxc[771] = 471924394;
        ge.ioxc[772] = 234556155;
        ge.ioxc[773] = 1179800607;
        ge.ioxc[774] = 1862219347;
        ge.ioxc[775] = -1526208853;
        ge.ioxc[776] = 379494129;
        ge.ioxc[777] = 569168518;
        ge.ioxc[778] = 482003985;
        ge.ioxc[779] = -1703653647;
        ge.ioxc[780] = -1993893840;
        ge.ioxc[781] = 1797810990;
        ge.ioxc[782] = 928523967;
        ge.ioxc[783] = -1858365365;
        ge.ioxc[784] = 2054038044;
        ge.ioxc[785] = 600584398;
        ge.ioxc[786] = 998506012;
        ge.ioxc[787] = -1899759030;
        ge.ioxc[788] = 311199154;
        ge.ioxc[789] = -624548655;
        ge.ioxc[790] = -1518525510;
        ge.ioxc[791] = 2045983828;
        ge.ioxc[792] = -1911403505;
        ge.ioxc[793] = 1442454093;
        ge.ioxc[794] = -643815148;
        ge.ioxc[795] = 249685516;
        ge.ioxc[796] = 696550741;
        ge.ioxc[797] = 1578927997;
        ge.ioxc[798] = 133375762;
        ge.ioxc[799] = 1530959862;
    }

    private static /* synthetic */ void ittz() {
        ge.ioxd[800] = 1514034611;
        ge.ioxd[801] = -1321714393;
        ge.ioxd[802] = 926546535;
        ge.ioxd[803] = -1210213767;
        ge.ioxd[804] = 1565758985;
        ge.ioxd[805] = 1016787782;
        ge.ioxd[806] = -1803237283;
        ge.ioxd[807] = 1097786684;
        ge.ioxd[808] = 1096736301;
        ge.ioxd[809] = 58359456;
        ge.ioxd[810] = -1284109715;
        ge.ioxd[811] = -904816466;
        ge.ioxd[812] = 463620209;
        ge.ioxd[813] = -1292786037;
        ge.ioxd[814] = 680451739;
        ge.ioxd[815] = 216872930;
        ge.ioxd[816] = -1288651802;
        ge.ioxd[817] = -548590002;
        ge.ioxd[818] = 452927707;
        ge.ioxd[819] = -504854339;
        ge.ioxd[820] = 1416652138;
        ge.ioxd[821] = -2020599355;
        ge.ioxd[822] = 2051659616;
        ge.ioxd[823] = 57043154;
        ge.ioxd[824] = -1992431925;
        ge.ioxd[825] = 1141293929;
        ge.ioxd[826] = 1978241218;
        ge.ioxd[827] = -2112609603;
        ge.ioxd[828] = -1240647074;
        ge.ioxd[829] = -1194595636;
        ge.ioxd[830] = 237551243;
        ge.ioxd[831] = 1318516403;
        ge.ioxd[832] = 885201775;
        ge.ioxd[833] = -2034005367;
        ge.ioxd[834] = 1554145774;
        ge.ioxd[835] = 1225011726;
        ge.ioxd[836] = 723951684;
        ge.ioxd[837] = -123660855;
        ge.ioxd[838] = 1359558858;
        ge.ioxd[839] = -1530074143;
        ge.ioxd[840] = 1181058010;
        ge.ioxd[841] = -707636669;
        ge.ioxd[842] = 662867544;
        ge.ioxd[843] = 878472104;
        ge.ioxd[844] = 188816516;
        ge.ioxd[845] = -1635742548;
        ge.ioxd[846] = 2037165173;
        ge.ioxd[847] = 1100014396;
        ge.ioxd[848] = -1631353536;
        ge.ioxd[849] = -667257169;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setLastSlot(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irol", ioxs(int ), (int)498)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ge.ioxe("irom", ioxa(int ), (int)772)) break;
            v0 /* !! */  = (long)ge.ioxe("iron", ioxa(int ), (int)773);
        }
        var4_2 = ge.c;
        v1 /* !! */  = ge.qc;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - ge.ioxe("iroo", ioxs(int ), (int)499));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -416798692: {
                    v2 = ge.ioxe("irop", ioxs(int ), (int)500);
                    continue block25;
                }
                case -239756314: {
                    break block25;
                }
                case 626409549: {
                    v2 = ge.ioxe("iroq", ioxs(int ), (int)501);
                    continue block25;
                }
                case 1350128824: {
                    v2 = ge.ioxe("iror", ioxs(int ), (int)502);
                    continue block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = ge.b;
        v3 /* !! */  = ge.qc;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - ge.ioxe("iros", ioxs(int ), (int)503));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -239756314: {
                    break block26;
                }
                case -118255929: {
                    v4 = ge.ioxe("irot", ioxs(int ), (int)504);
                    continue block26;
                }
                case 177795535: {
                    v4 = ge.ioxe("irou", ioxs(int ), (int)505);
                    continue block26;
                }
            }
            break;
        }
        var2_4 = ge.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = ge.qc;
        if (true) ** GOTO lbl48
        block28: while (true) {
            v5 /* !! */  = (long)(v6 - ge.ioxe("irov", ioxs(int ), (int)506));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1359295210: {
                    v6 = ge.ioxe("irow", ioxs(int ), (int)507);
                    continue block28;
                }
                case -840249835: {
                    v6 = ge.ioxe("irox", ioxs(int ), (int)508);
                    continue block28;
                }
                case -239756314: {
                    break block28;
                }
                case 559617731: {
                    v6 = ge.ioxe("iroy", ioxs(int ), (int)509);
                    continue block28;
                }
            }
            break;
        }
        this.lastSlot = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl67:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ge.ioxe("iroz", ioxa(int ), (int)774);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl77
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ge.ioxe("irpa", ioxa(int ), (int)775);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
lbl77:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)ge.ioxe("irpb", ioxa(int ), (int)776);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ge.ioxe("irpc", ioxa(int ), (int)777);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ge.ioxe("irpd", ioxa(int ), (int)778);
        ** while (!var4_2)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findInventorySlotId(class_1792 var1_1) {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(ge.ioxe("iqcb", ioxs(int ), (int)85) - ge.ioxe("iqca", ioxs(int ), (int)84));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1799370425: {
                    continue block57;
                }
                case -239756314: {
                    break block57;
                }
            }
            break;
        }
        var6_2 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iqcc", ioxs(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("iqcd", ioxa(int ), (int)188)) break;
            v1 /* !! */  = (long)ge.ioxe("iqce", ioxa(int ), (int)189);
        }
        var5_3 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl21
        block59: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("iqcf", ioxs(int ), (int)87));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1964528958: {
                    v3 = ge.ioxe("iqcg", ioxs(int ), (int)88);
                    continue block59;
                }
                case -239756314: {
                    break block59;
                }
                case 659692239: {
                    v3 = ge.ioxe("iqch", ioxs(int ), (int)89);
                    continue block59;
                }
                case 1397643814: {
                    v3 = ge.ioxe("iqci", ioxs(int ), (int)90);
                    continue block59;
                }
            }
            break;
        }
        var4_4 = ge.a;
        if (var6_2) {
            throw null;
lbl36:
            // 10 sources

            return (int)ge.ioxe("iqcj", ioxa(int ), (int)190);
        }
        if (var4_4 || var4_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iqck", ioxs(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ge.ioxe("iqcl", ioxa(int ), (int)191)) break;
            v4 /* !! */  = (long)ge.ioxe("iqcm", ioxa(int ), (int)192);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("iqcn", ioxs(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ge.ioxe("iqco", ioxa(int ), (int)193)) break;
            v5 /* !! */  = (long)ge.ioxe("iqcp", ioxa(int ), (int)194);
        }
        v6 = ge.mc.field_1724;
        v7 /* !! */  = ge.qc;
        if (true) ** GOTO lbl54
        block63: while (true) {
            v7 /* !! */  = (long)(v8 - ge.ioxe("iqcq", ioxs(int ), (int)93));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1819950370: {
                    v8 = ge.ioxe("iqcr", ioxs(int ), (int)94);
                    continue block63;
                }
                case -1016998164: {
                    v8 = ge.ioxe("iqcs", ioxs(int ), (int)95);
                    continue block63;
                }
                case -239756314: {
                    break block63;
                }
                case 1810878621: {
                    v8 = ge.ioxe("iqct", ioxs(int ), (int)96);
                    continue block63;
                }
            }
            break;
        }
        v9 = v6.field_7498;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iqcu", ioxs(int ), (int)97)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ge.ioxe("iqcv", ioxa(int ), (int)195)) break;
            v10 /* !! */  = (long)ge.ioxe("iqcw", ioxa(int ), (int)196);
        }
        v11 = v9.field_7761;
        v12 /* !! */  = ge.qc;
        if (true) ** GOTO lbl77
        block65: while (true) {
            v12 /* !! */  = (long)(ge.ioxe("iqcy", ioxs(int ), (int)99) - ge.ioxe("iqcx", ioxs(int ), (int)98));
lbl77:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -239756314: {
                    break block65;
                }
                case 1876550268: {
                    continue block65;
                }
            }
            break;
        }
        var2_5 = v11.iterator();
        if (var4_4) ** GOTO lbl36
        block66: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl36
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("iqcz", ioxs(int ), (int)100)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == ge.ioxe("iqda", ioxa(int ), (int)197)) break;
                        v13 /* !! */  = (long)ge.ioxe("iqdb", ioxa(int ), (int)198);
                    }
                    if (!var2_5.hasNext()) ** GOTO lbl165
                    if (var4_4) ** GOTO lbl36
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("iqdc", ioxs(int ), (int)101)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ge.ioxe("iqdd", ioxa(int ), (int)199)) break;
                        v14 /* !! */  = (long)ge.ioxe("iqde", ioxa(int ), (int)200);
                    }
                    var3_6 = (class_1735)var2_5.next();
                    if (var4_4 || var4_4) ** GOTO lbl36
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("iqdf", ioxs(int ), (int)102)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == ge.ioxe("iqdg", ioxa(int ), (int)201)) break;
                        v15 /* !! */  = (long)ge.ioxe("iqdh", ioxa(int ), (int)202);
                    }
                    if (var3_6.field_7874 < ge.ioxe("iqdi", ioxa(int ), (int)203)) ** GOTO lbl162
                    if (var4_4) ** GOTO lbl36
                    v16 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl114
                    block70: while (true) {
                        v16 /* !! */  = (long)(v17 - ge.ioxe("iqdj", ioxs(int ), (int)103));
lbl114:
                        // 2 sources

                        switch ((int)v16 /* !! */ ) {
                            case -867141061: {
                                v17 = ge.ioxe("iqdk", ioxs(int ), (int)104);
                                continue block70;
                            }
                            case -860850268: {
                                v17 = ge.ioxe("iqdl", ioxs(int ), (int)105);
                                continue block70;
                            }
                            case -239756314: {
                                break block70;
                            }
                            case 165806050: {
                                v17 = ge.ioxe("iqdm", ioxs(int ), (int)106);
                                continue block70;
                            }
                        }
                        break;
                    }
                    if (var3_6.field_7874 > ge.ioxe("iqdn", ioxa(int ), (int)204)) ** GOTO lbl162
                    if (var4_4) ** GOTO lbl36
                    v18 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl132
                    block71: while (true) {
                        v18 /* !! */  = (long)(ge.ioxe("iqdp", ioxs(int ), (int)108) - ge.ioxe("iqdo", ioxs(int ), (int)107));
lbl132:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case -239756314: {
                                break block71;
                            }
                            case 759739304: {
                                continue block71;
                            }
                        }
                        break;
                    }
                    v19 = var3_6.method_7677();
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iqdq", ioxs(int ), (int)109)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == ge.ioxe("iqdr", ioxa(int ), (int)205)) break;
                        v20 /* !! */  = (long)ge.ioxe("iqds", ioxa(int ), (int)206);
                    }
                    if (!v19.method_31574(var1_1)) ** GOTO lbl162
                    if (var4_4 || var4_4) ** GOTO lbl36
                    v21 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl149
                    block73: while (true) {
                        v21 /* !! */  = (long)(v22 - ge.ioxe("iqdt", ioxs(int ), (int)110));
lbl149:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -1477929856: {
                                v22 = ge.ioxe("iqdu", ioxs(int ), (int)111);
                                continue block73;
                            }
                            case -1372574089: {
                                v22 = ge.ioxe("iqdv", ioxs(int ), (int)112);
                                continue block73;
                            }
                            case -239756314: {
                                break block73;
                            }
                            case 1463031193: {
                                v22 = ge.ioxe("iqdw", ioxs(int ), (int)113);
                                continue block73;
                            }
                        }
                        break;
                    }
                    return var3_6.field_7874;
lbl162:
                    // 3 sources

                    if (var4_4 || var4_4) ** GOTO lbl36
                    if (!var6_2) continue block66;
                    throw null;
lbl165:
                    // 1 sources

                    if (!var4_4 && !var4_4) ** break;
                    ** continue;
                    return (int)ge.ioxe("iqdx", ioxa(int ), (int)207);
                }
lbl168:
                // 2 sources

                case 0: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqdy", ioxa(int ), (int)208);
                    if (var6_2) {
                        throw null;
                    }
                }
lbl172:
                // 4 sources

                case 1: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqdz", ioxa(int ), (int)209);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
                case 2: {
                    do {
                        var5_3 /* !! */  = (int)ge.ioxe("iqea", ioxa(int ), (int)210);
                    } while (!var6_2);
                    throw null;
                }
                case 3: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqeb", ioxa(int ), (int)211);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl187:
                // 2 sources

                case 4: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqec", ioxa(int ), (int)212);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl192:
                // 2 sources

                case 5: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqed", ioxa(int ), (int)213);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
                case 6: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqee", ioxa(int ), (int)214);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 7: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqef", ioxa(int ), (int)215);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl207:
                // 2 sources

                case 8: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqeg", ioxa(int ), (int)216);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl212:
                // 2 sources

                case 9: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqeh", ioxa(int ), (int)217);
                    if (!var6_2) ** GOTO lbl187
                    throw null;
                }
                case 10: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqei", ioxa(int ), (int)218);
                    if (!var6_2) ** GOTO lbl192
                    throw null;
                }
lbl220:
                // 4 sources

                case 11: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqej", ioxa(int ), (int)219);
                    if (!var6_2) ** GOTO lbl207
                    throw null;
                }
lbl224:
                // 3 sources

                case 12: {
                    do {
                        var5_3 /* !! */  = (int)ge.ioxe("iqek", ioxa(int ), (int)220);
                    } while (!var6_2);
                    throw null;
                }
lbl229:
                // 2 sources

                case 13: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqel", ioxa(int ), (int)221);
                    if (!var6_2) ** GOTO lbl172
                    throw null;
                }
lbl233:
                // 2 sources

                case 14: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqem", ioxa(int ), (int)222);
                    if (!var6_2) ** GOTO lbl168
                    throw null;
                }
lbl237:
                // 2 sources

                case 15: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqen", ioxa(int ), (int)223);
                    if (!var6_2) ** GOTO lbl233
                    throw null;
                }
                case 16: {
                    do {
                        var5_3 /* !! */  = (int)ge.ioxe("iqeo", ioxa(int ), (int)224);
                    } while (!var6_2);
                    throw null;
                }
                case 17: {
                    var5_3 /* !! */  = (int)ge.ioxe("iqep", ioxa(int ), (int)225);
                    if (!var6_2) ** GOTO lbl237
                    throw null;
                }
                case 18: 
            }
            break;
        }
        do {
            var5_3 /* !! */  = (int)ge.ioxe("iqeq", ioxa(int ), (int)226);
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPostTick(cy var1_1) {
        block87: {
            v0 /* !! */  = ge.qc;
            if (true) ** GOTO lbl5
            block58: while (true) {
                v0 /* !! */  = (long)(v1 - ge.ioxe("ipyp", ioxs(int ), (int)58));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1426752913: {
                        v1 = ge.ioxe("ipyq", ioxs(int ), (int)59);
                        continue block58;
                    }
                    case -763690962: {
                        v1 = ge.ioxe("ipyr", ioxs(int ), (int)60);
                        continue block58;
                    }
                    case -239756314: {
                        break block58;
                    }
                }
                break;
            }
            var4_2 = ge.c;
            v2 /* !! */  = ge.qc;
            if (true) ** GOTO lbl19
            block59: while (true) {
                v2 /* !! */  = (long)(v3 - ge.ioxe("ipys", ioxs(int ), (int)61));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -239756314: {
                        break block59;
                    }
                    case 384313776: {
                        v3 = ge.ioxe("ipyt", ioxs(int ), (int)62);
                        continue block59;
                    }
                    case 1779771237: {
                        v3 = ge.ioxe("ipyu", ioxs(int ), (int)63);
                        continue block59;
                    }
                }
                break;
            }
            var3_3 /* !! */  = ge.b;
            v4 /* !! */  = ge.qc;
            if (true) ** GOTO lbl33
            block60: while (true) {
                v4 /* !! */  = (long)(v5 - ge.ioxe("ipyv", ioxs(int ), (int)64));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1216996205: {
                        v5 = ge.ioxe("ipyw", ioxs(int ), (int)65);
                        continue block60;
                    }
                    case -806563878: {
                        v5 = ge.ioxe("ipyx", ioxs(int ), (int)66);
                        continue block60;
                    }
                    case -239756314: {
                        break block60;
                    }
                    case 91863265: {
                        v5 = ge.ioxe("ipyy", ioxs(int ), (int)67);
                        continue block60;
                    }
                }
                break;
            }
            var2_4 = ge.a;
            if (var4_2) {
                throw null;
lbl48:
                // 8 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl48
            v6 /* !! */  = ge.qc;
            if (true) ** GOTO lbl55
            block62: while (true) {
                v6 /* !! */  = (long)(v7 - ge.ioxe("ipyz", ioxs(int ), (int)68));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -239756314: {
                        break block62;
                    }
                    case 158731743: {
                        v7 = ge.ioxe("ipza", ioxs(int ), (int)69);
                        continue block62;
                    }
                    case 2126203830: {
                        v7 = ge.ioxe("ipzb", ioxs(int ), (int)70);
                        continue block62;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("ipzc", ioxs(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == ge.ioxe("ipzd", ioxa(int ), (int)125)) break;
                v8 /* !! */  = (long)ge.ioxe("ipze", ioxa(int ), (int)126);
            }
            if (ge.mc.field_1724 == null) break block87;
            if (var2_4) ** GOTO lbl48
            v9 /* !! */  = ge.qc;
            if (true) ** GOTO lbl76
            block64: while (true) {
                v9 /* !! */  = (long)(ge.ioxe("ipzg", ioxs(int ), (int)73) - ge.ioxe("ipzf", ioxs(int ), (int)72));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1489793334: {
                        continue block64;
                    }
                    case -239756314: {
                        break block64;
                    }
                }
                break;
            }
            v10 /* !! */  = ge.qc;
            if (true) ** GOTO lbl85
            block65: while (true) {
                v10 /* !! */  = (long)(v11 - ge.ioxe("ipzh", ioxs(int ), (int)74));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -968321637: {
                        v11 = ge.ioxe("ipzi", ioxs(int ), (int)75);
                        continue block65;
                    }
                    case -239756314: {
                        break block65;
                    }
                    case 775948898: {
                        v11 = ge.ioxe("ipzj", ioxs(int ), (int)76);
                        continue block65;
                    }
                }
                break;
            }
            if (ge.mc.field_1687 != null) ** GOTO lbl102
            if (var2_4) ** GOTO lbl48
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl48
                return;
            }
lbl102:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl48
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("ipzk", ioxs(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v12 /* !! */  == ge.ioxe("ipzl", ioxa(int ), (int)127)) break;
                v12 /* !! */  = (long)ge.ioxe("ipzm", ioxa(int ), (int)128);
            }
            v13 /* !! */  = ge.qc;
            if (true) ** GOTO lbl113
            block67: while (true) {
                v13 /* !! */  = (long)(v14 - ge.ioxe("ipzn", ioxs(int ), (int)78));
lbl113:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1332701685: {
                        v14 = ge.ioxe("ipzo", ioxs(int ), (int)79);
                        continue block67;
                    }
                    case -239756314: {
                        break block67;
                    }
                    case 804395577: {
                        v14 = ge.ioxe("ipzp", ioxs(int ), (int)80);
                        continue block67;
                    }
                }
                break;
            }
            if (!this.mode.isSelected("Funtime \u0413\u0440\u043e\u043c\u043e\u043e\u0442\u0432\u043e\u0434\u044b")) ** GOTO lbl139
            if (var2_4 || var2_4) ** GOTO lbl48
            v15 /* !! */  = ge.qc;
            if (true) ** GOTO lbl128
            block68: while (true) {
                v15 /* !! */  = (long)(v16 - ge.ioxe("ipzq", ioxs(int ), (int)81));
lbl128:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -239756314: {
                        break block68;
                    }
                    case 1647785383: {
                        v16 = ge.ioxe("ipzr", ioxs(int ), (int)82);
                        continue block68;
                    }
                    case 2087037866: {
                        v16 = ge.ioxe("ipzs", ioxs(int ), (int)83);
                        continue block68;
                    }
                }
                break;
            }
            this.handleLightningRods();
            if (var2_4) ** GOTO lbl48
lbl139:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl142:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzt", ioxa(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 1: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzu", ioxa(int ), (int)130);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 2: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzv", ioxa(int ), (int)131);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl157:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzw", ioxa(int ), (int)132);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 4: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzx", ioxa(int ), (int)133);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl166:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzy", ioxa(int ), (int)134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl171:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)ge.ioxe("ipzz", ioxa(int ), (int)135);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 7: {
                var3_3 /* !! */  = (int)ge.ioxe("iqaa", ioxa(int ), (int)136);
                if (!var4_2) break;
                throw null;
            }
lbl180:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ge.ioxe("iqab", ioxa(int ), (int)137);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)ge.ioxe("iqac", ioxa(int ), (int)138);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl189:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ge.ioxe("iqad", ioxa(int ), (int)139);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl208
                    break;
                }
            }
lbl195:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)ge.ioxe("iqae", ioxa(int ), (int)140);
                if (!var4_2) ** GOTO lbl189
                throw null;
            }
lbl199:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ge.ioxe("iqaf", ioxa(int ), (int)141);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl204:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)ge.ioxe("iqag", ioxa(int ), (int)142);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
lbl208:
            // 4 sources

            case 14: {
                var3_3 /* !! */  = (int)ge.ioxe("iqah", ioxa(int ), (int)143);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 15: 
        }
        var3_3 /* !! */  = (int)ge.ioxe("iqai", ioxa(int ), (int)144);
        ** while (!var4_2)
lbl215:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleLightningRods() {
        block79: {
            block78: {
                var5_1 = ge.c;
                var4_2 /* !! */  = ge.b;
                var3_3 = ge.a;
                if (var5_1) {
                    throw null;
lbl6:
                    // 21 sources

                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!ge.mc.field_1724.field_5976) break block78;
                if (var3_3) ** GOTO lbl6
                if (this.lightningTimer.finished(1.0)) break block79;
                if (var3_3) ** GOTO lbl6
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                ge.mc.field_1724.method_24830((boolean)ge.ioxe("iqaj", ioxa(int ), (int)145));
                if (var3_3 || var3_3) ** GOTO lbl6
                ge.mc.field_1724.method_6043();
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = this.findHotbarSlot(class_1802.field_27051);
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var1_4 != ge.ioxe("iqak", ioxa(int ), (int)146)) ** GOTO lbl40
                if (var3_3 || var3_3) ** GOTO lbl6
                var2_5 = this.findInventorySlotId(class_1802.field_27051);
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_5 == ge.ioxe("iqal", ioxa(int ), (int)147)) ** GOTO lbl40
                if (var3_3 || var3_3) ** GOTO lbl6
                nv.click(var2_5, this.lastSlot, class_1713.field_7791);
                if (var3_3 || var3_3) ** GOTO lbl6
                nv.updateSlots();
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = this.lastSlot;
                if (var3_3) ** GOTO lbl6
lbl40:
                // 3 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                if (var1_4 != ge.ioxe("iqam", ioxa(int ), (int)148)) ** GOTO lbl44
                if (var3_3) ** GOTO lbl6
                return;
lbl44:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.placeBlockAbove(var1_4);
                if (var3_3 || var3_3) ** GOTO lbl6
                ge.mc.field_1724.field_6017 = 0.0;
                if (var3_3 || var3_3) ** GOTO lbl6
                this.lightningTimer.reset();
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)ge.ioxe("iqan", ioxa(int ), (int)149);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
            case 1: {
                var4_2 /* !! */  = (int)ge.ioxe("iqao", ioxa(int ), (int)150);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl63:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)ge.ioxe("iqap", ioxa(int ), (int)151);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 3: {
                var4_2 /* !! */  = (int)ge.ioxe("iqaq", ioxa(int ), (int)152);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl73:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ge.ioxe("iqar", ioxa(int ), (int)153);
                if (!var5_1) ** GOTO lbl63
                throw null;
            }
lbl77:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)ge.ioxe("iqas", ioxa(int ), (int)154);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl82:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)ge.ioxe("iqat", ioxa(int ), (int)155);
                if (!var5_1) break;
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)ge.ioxe("iqau", ioxa(int ), (int)156);
                if (var5_1) {
                    throw null;
                }
            }
            case 8: {
                var4_2 /* !! */  = (int)ge.ioxe("iqav", ioxa(int ), (int)157);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 9: {
                var4_2 /* !! */  = (int)ge.ioxe("iqaw", ioxa(int ), (int)158);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl100:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)ge.ioxe("iqax", ioxa(int ), (int)159);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl105:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)ge.ioxe("iqay", ioxa(int ), (int)160);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 12: {
                var4_2 /* !! */  = (int)ge.ioxe("iqaz", ioxa(int ), (int)161);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl115:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)ge.ioxe("iqba", ioxa(int ), (int)162);
                if (!var5_1) ** GOTO lbl53
                throw null;
            }
lbl119:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbb", ioxa(int ), (int)163);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl124:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbc", ioxa(int ), (int)164);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
lbl128:
            // 3 sources

            case 16: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbd", ioxa(int ), (int)165);
                if (!var5_1) ** GOTO lbl105
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbe", ioxa(int ), (int)166);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl137:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbf", ioxa(int ), (int)167);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
lbl141:
            // 5 sources

            case 19: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbg", ioxa(int ), (int)168);
                if (!var5_1) ** GOTO lbl100
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbh", ioxa(int ), (int)169);
                if (!var5_1) ** GOTO lbl128
                throw null;
            }
lbl149:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbi", ioxa(int ), (int)170);
                if (!var5_1) ** GOTO lbl63
                throw null;
            }
lbl153:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbj", ioxa(int ), (int)171);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
lbl157:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbk", ioxa(int ), (int)172);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
lbl161:
            // 3 sources

            case 24: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbl", ioxa(int ), (int)173);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl166:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbm", ioxa(int ), (int)174);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbn", ioxa(int ), (int)175);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 27: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbo", ioxa(int ), (int)176);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ge.ioxe("iqbp", ioxa(int ), (int)177);
                    if (!var5_1) ** GOTO lbl137
                    throw null;
                }
            }
            case 29: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbq", ioxa(int ), (int)178);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 30: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbr", ioxa(int ), (int)179);
                if (!var5_1) ** GOTO lbl115
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbs", ioxa(int ), (int)180);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl198:
            // 2 sources

            case 32: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbt", ioxa(int ), (int)181);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 33: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbu", ioxa(int ), (int)182);
                if (var5_1) {
                    throw null;
                }
            }
lbl207:
            // 4 sources

            case 34: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbv", ioxa(int ), (int)183);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl212:
            // 2 sources

            case 35: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbw", ioxa(int ), (int)184);
                if (!var5_1) ** GOTO lbl73
                throw null;
            }
lbl216:
            // 5 sources

            case 36: {
                var4_2 /* !! */  = (int)ge.ioxe("iqbx", ioxa(int ), (int)185);
                if (!var5_1) ** GOTO lbl153
                throw null;
            }
lbl220:
            // 3 sources

            case 37: {
                var4_2 /* !! */  = (int)ge.ioxe("iqby", ioxa(int ), (int)186);
                if (!var5_1) ** GOTO lbl149
                throw null;
            }
            case 38: 
        }
        var4_2 /* !! */  = (int)ge.ioxe("iqbz", ioxa(int ), (int)187);
        ** while (!var5_1)
lbl227:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ittt() {
        ge.ioxd[200] = -587697425;
        ge.ioxd[201] = 1844119242;
        ge.ioxd[202] = 1446919285;
        ge.ioxd[203] = -151700082;
        ge.ioxd[204] = 1658198114;
        ge.ioxd[205] = -115522869;
        ge.ioxd[206] = 1167519659;
        ge.ioxd[207] = 2012379325;
        ge.ioxd[208] = -22932149;
        ge.ioxd[209] = -557224297;
        ge.ioxd[210] = -2106964872;
        ge.ioxd[211] = 1619901253;
        ge.ioxd[212] = -1367124573;
        ge.ioxd[213] = -1068426267;
        ge.ioxd[214] = -1477757138;
        ge.ioxd[215] = -367481488;
        ge.ioxd[216] = -341363762;
        ge.ioxd[217] = -1895822900;
        ge.ioxd[218] = 808724649;
        ge.ioxd[219] = 1409200181;
        ge.ioxd[220] = 557185477;
        ge.ioxd[221] = -191880585;
        ge.ioxd[222] = -1738107384;
        ge.ioxd[223] = 1741161109;
        ge.ioxd[224] = 1293070683;
        ge.ioxd[225] = -636041017;
        ge.ioxd[226] = 1538478762;
        ge.ioxd[227] = -1740486829;
        ge.ioxd[228] = 2129683680;
        ge.ioxd[229] = -397366353;
        ge.ioxd[230] = 224623075;
        ge.ioxd[231] = 1982103225;
        ge.ioxd[232] = 1479204870;
        ge.ioxd[233] = 1066550359;
        ge.ioxd[234] = -2093796434;
        ge.ioxd[235] = 1352060956;
        ge.ioxd[236] = 1502011866;
        ge.ioxd[237] = -475364955;
        ge.ioxd[238] = 1043288085;
        ge.ioxd[239] = 913968142;
        ge.ioxd[240] = -334072961;
        ge.ioxd[241] = 1817518793;
        ge.ioxd[242] = 2055049233;
        ge.ioxd[243] = -227961201;
        ge.ioxd[244] = 1831799207;
        ge.ioxd[245] = -1245140907;
        ge.ioxd[246] = -684564181;
        ge.ioxd[247] = 229846825;
        ge.ioxd[248] = -1900556978;
        ge.ioxd[249] = 1795208650;
        ge.ioxd[250] = -1306023801;
        ge.ioxd[251] = 1673105129;
        ge.ioxd[252] = -1039053096;
        ge.ioxd[253] = 59131229;
        ge.ioxd[254] = -664364879;
        ge.ioxd[255] = -377984587;
        ge.ioxd[256] = -216888647;
        ge.ioxd[257] = 1950904577;
        ge.ioxd[258] = -1017547346;
        ge.ioxd[259] = -840364849;
        ge.ioxd[260] = 27829267;
        ge.ioxd[261] = -1175497011;
        ge.ioxd[262] = 360956944;
        ge.ioxd[263] = -438020470;
        ge.ioxd[264] = -1868475285;
        ge.ioxd[265] = -2016917185;
        ge.ioxd[266] = 1162570723;
        ge.ioxd[267] = 1375240062;
        ge.ioxd[268] = 2126643520;
        ge.ioxd[269] = 1578769429;
        ge.ioxd[270] = -386282060;
        ge.ioxd[271] = 640904530;
        ge.ioxd[272] = -655696613;
        ge.ioxd[273] = -1773531451;
        ge.ioxd[274] = 108553009;
        ge.ioxd[275] = 1085034984;
        ge.ioxd[276] = 1472665589;
        ge.ioxd[277] = -425732518;
        ge.ioxd[278] = 470883021;
        ge.ioxd[279] = 1556893338;
        ge.ioxd[280] = 1394178862;
        ge.ioxd[281] = 720452692;
        ge.ioxd[282] = -193866029;
        ge.ioxd[283] = -77101114;
        ge.ioxd[284] = -1851633468;
        ge.ioxd[285] = -1288812596;
        ge.ioxd[286] = 713050558;
        ge.ioxd[287] = 1277449436;
        ge.ioxd[288] = 1939784647;
        ge.ioxd[289] = -1152336323;
        ge.ioxd[290] = 938984894;
        ge.ioxd[291] = -1996358352;
        ge.ioxd[292] = -2089849571;
        ge.ioxd[293] = 781214626;
        ge.ioxd[294] = 2083982681;
        ge.ioxd[295] = 266012941;
        ge.ioxd[296] = 42179290;
        ge.ioxd[297] = 425716046;
        ge.ioxd[298] = 1504582292;
        ge.ioxd[299] = -894958890;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2248 getBlockState(class_2338 var1_1) {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - ge.ioxe("iozy", ioxs(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -239756314: {
                    break block33;
                }
                case 829030019: {
                    v1 = ge.ioxe("iozz", ioxs(int ), (int)15);
                    continue block33;
                }
                case 1606474125: {
                    v1 = ge.ioxe("ipaa", ioxs(int ), (int)16);
                    continue block33;
                }
            }
            break;
        }
        var4_2 = ge.c;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl19
        block34: while (true) {
            v2 /* !! */  = (long)(ge.ioxe("ipad", ioxs(int ), (int)18) - ge.ioxe("ipac", ioxs(int ), (int)17));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1468461774: {
                    continue block34;
                }
                case -239756314: {
                    break block34;
                }
            }
            break;
        }
        var3_3 /* !! */  = ge.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("ipae", ioxs(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ge.ioxe("ipag", ioxa(int ), (int)38)) break;
                    v3 /* !! */  = (long)ge.ioxe("ipah", ioxa(int ), (int)39);
                }
                var2_4 = ge.a;
                if (var4_2) {
                    throw null;
                    return null;
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = ge.qc;
                if (true) ** GOTO lbl44
                block37: while (true) {
                    v4 /* !! */  = (long)(v5 - ge.ioxe("ipaj", ioxs(int ), (int)20));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2106571611: {
                            v5 = ge.ioxe("ipak", ioxs(int ), (int)21);
                            continue block37;
                        }
                        case -1002264893: {
                            v5 = ge.ioxe("ipal", ioxs(int ), (int)22);
                            continue block37;
                        }
                        case -239756314: {
                            break block37;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ge.qc;
                if (true) ** GOTO lbl57
                block38: while (true) {
                    v6 /* !! */  = (long)(ge.ioxe("ipao", ioxs(int ), (int)24) - ge.ioxe("ipan", ioxs(int ), (int)23));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -724749429: {
                            continue block38;
                        }
                        case -239756314: {
                            break block38;
                        }
                    }
                    break;
                }
                v7 = ge.mc.field_1687;
                v8 /* !! */  = ge.qc;
                if (true) ** GOTO lbl67
                block39: while (true) {
                    v8 /* !! */  = (long)(v9 - ge.ioxe("ipap", ioxs(int ), (int)25));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2143119397: {
                            v9 = ge.ioxe("ipar", ioxs(int ), (int)26);
                            continue block39;
                        }
                        case -239756314: {
                            break block39;
                        }
                        case 1220989695: {
                            v9 = ge.ioxe("ipas", ioxs(int ), (int)27);
                            continue block39;
                        }
                    }
                    break;
                }
                v10 = v7.method_8320(var1_1);
                v11 /* !! */  = ge.qc;
                if (true) ** GOTO lbl81
                block40: while (true) {
                    v11 /* !! */  = (long)(ge.ioxe("ipav", ioxs(int ), (int)29) - ge.ioxe("ipat", ioxs(int ), (int)28));
lbl81:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -703228213: {
                            continue block40;
                        }
                        case -239756314: {
                            break block40;
                        }
                    }
                    break;
                }
                return v10.method_26204();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ge.ioxe("ipaw", ioxa(int ), (int)40);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl97
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ge.ioxe("ipax", ioxa(int ), (int)41);
                if (!var4_2) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ge.ioxe("ipaz", ioxa(int ), (int)42);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ge.ioxe("ipba", ioxa(int ), (int)43);
        ** while (!var4_2)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kf getMode() {
        boolean bl2;
        Object object = qc;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ge.ioxe("irre", ioxs(int ), (int)533);
            }
            switch ((int)object) {
                case -752242678: {
                    callSite = ge.ioxe("irrf", ioxs(int ), (int)534);
                    continue block10;
                }
                case -239756314: {
                    break block10;
                }
                case 420629676: {
                    callSite = ge.ioxe("irrg", ioxs(int ), (int)535);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = qc - ge.ioxe("irrh", ioxs(int ), (int)536)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ge.ioxe("irri", ioxa(int ), (int)808)) break;
            object2 = ge.ioxe("irrj", ioxa(int ), (int)809);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = qc - ge.ioxe("irrk", ioxs(int ), (int)537)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ge.ioxe("irrl", ioxa(int ), (int)810)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ge.ioxe("irrm", ioxa(int ), (int)811);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = qc;
        boolean bl5 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - ge.ioxe("irrn", ioxs(int ), (int)538);
            }
            switch ((int)object4) {
                case -1065211941: {
                    callSite = ge.ioxe("irro", ioxs(int ), (int)539);
                    continue block13;
                }
                case -239756314: {
                    return this.mode;
                }
                case -167223407: {
                    callSite = ge.ioxe("irrp", ioxs(int ), (int)540);
                    continue block13;
                }
            }
            break;
        }
        return this.mode;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block69: {
            block68: {
                block67: {
                    block66: {
                        block65: {
                            var4_2 = ge.c;
                            var3_3 /* !! */  = ge.b;
                            var2_4 = ge.a;
                            if (var4_2) {
                                throw null;
lbl6:
                                // 18 sources

                                return;
                            }
                            if (var2_4 || var2_4) ** GOTO lbl6
                            if (ge.mc.field_1724 == null) break block65;
                            if (var2_4) ** GOTO lbl6
                            if (ge.mc.field_1687 != null) break block66;
                            if (var2_4) ** GOTO lbl6
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (!this.mode.isSelected("FunTime")) break block67;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.handleFunTimeMode();
                    if (var2_4) ** GOTO lbl6
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (!this.mode.isSelected("Water Bucket")) break block68;
                if (var2_4 || var2_4) ** GOTO lbl6
                this.handleWaterBucketMode();
                if (var2_4) ** GOTO lbl6
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (!this.mode.isSelected("SpookyTime")) break block69;
            if (var2_4) ** GOTO lbl6
            if (!this.stopWatch.finished((double)ge.ioxe("ipdh", ipdf(int ), (int)51))) break block69;
            if (var2_4 || var2_4) ** GOTO lbl6
            this.handleSpookyTimeMode();
            if (var2_4) ** GOTO lbl6
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (!this.mode.isSelected("Slime Block")) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl6
        this.handleSlimeBlock();
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl48:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdj", ioxa(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 1: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdl", ioxa(int ), (int)63);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl58:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdm", ioxa(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 3: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdn", ioxa(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl68:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdo", ioxa(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl73:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdq", ioxa(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl78:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdr", ioxa(int ), (int)68);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
lbl82:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ge.ioxe("ipds", ioxa(int ), (int)69);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl87:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdu", ioxa(int ), (int)70);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
lbl91:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdv", ioxa(int ), (int)71);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl96:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdw", ioxa(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 11: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdx", ioxa(int ), (int)73);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
lbl105:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdy", ioxa(int ), (int)74);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl109:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)ge.ioxe("ipdz", ioxa(int ), (int)75);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl114:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)ge.ioxe("ipea", ioxa(int ), (int)76);
                if (!var4_2) break;
                throw null;
            }
lbl118:
            // 3 sources

            case 15: {
                var3_3 /* !! */  = (int)ge.ioxe("ipec", ioxa(int ), (int)77);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)ge.ioxe("iped", ioxa(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ge.ioxe("ipee", ioxa(int ), (int)79);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
            case 18: {
                var3_3 /* !! */  = (int)ge.ioxe("ipeg", ioxa(int ), (int)80);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)ge.ioxe("ipeh", ioxa(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 20: {
                var3_3 /* !! */  = (int)ge.ioxe("ipei", ioxa(int ), (int)82);
                if (!var4_2) ** GOTO lbl91
                throw null;
            }
lbl145:
            // 5 sources

            case 21: {
                var3_3 /* !! */  = (int)ge.ioxe("ipek", ioxa(int ), (int)83);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
lbl149:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ge.ioxe("ipel", ioxa(int ), (int)84);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 23: {
                var3_3 /* !! */  = (int)ge.ioxe("ipem", ioxa(int ), (int)85);
                if (!var4_2) ** GOTO lbl105
                throw null;
            }
            case 24: {
                var3_3 /* !! */  = (int)ge.ioxe("ipeo", ioxa(int ), (int)86);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
lbl161:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)ge.ioxe("ipep", ioxa(int ), (int)87);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
lbl165:
            // 2 sources

            case 26: {
                var3_3 /* !! */  = (int)ge.ioxe("ipeq", ioxa(int ), (int)88);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
lbl169:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)ge.ioxe("ipes", ioxa(int ), (int)89);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)ge.ioxe("ipet", ioxa(int ), (int)90);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
lbl177:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)ge.ioxe("ipeu", ioxa(int ), (int)91);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
lbl181:
            // 3 sources

            case 30: {
                do {
                    var3_3 /* !! */  = (int)ge.ioxe("ipew", ioxa(int ), (int)92);
                } while (!var4_2);
                throw null;
            }
            case 31: 
        }
        var3_3 /* !! */  = (int)ge.ioxe("ipex", ioxa(int ), (int)93);
        ** while (!var4_2)
lbl189:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void irur() {
        ge.ioxc[300] = 291435287;
        ge.ioxc[301] = -1875692144;
        ge.ioxc[302] = -1406129041;
        ge.ioxc[303] = 1121997433;
        ge.ioxc[304] = -829263242;
        ge.ioxc[305] = -779275744;
        ge.ioxc[306] = 1694065584;
        ge.ioxc[307] = -1073629742;
        ge.ioxc[308] = 572920910;
        ge.ioxc[309] = 1534084786;
        ge.ioxc[310] = 1283332101;
        ge.ioxc[311] = -119502000;
        ge.ioxc[312] = -1395119876;
        ge.ioxc[313] = 1531391736;
        ge.ioxc[314] = -200092212;
        ge.ioxc[315] = -1650455388;
        ge.ioxc[316] = -2088962634;
        ge.ioxc[317] = 250918834;
        ge.ioxc[318] = -763186903;
        ge.ioxc[319] = -431509195;
        ge.ioxc[320] = -1040336801;
        ge.ioxc[321] = 1289514805;
        ge.ioxc[322] = -1519808904;
        ge.ioxc[323] = 1681975984;
        ge.ioxc[324] = -1594840361;
        ge.ioxc[325] = -2116389547;
        ge.ioxc[326] = 727169752;
        ge.ioxc[327] = -564520500;
        ge.ioxc[328] = 1849736294;
        ge.ioxc[329] = 476127231;
        ge.ioxc[330] = -1592545732;
        ge.ioxc[331] = 2005754114;
        ge.ioxc[332] = 992880093;
        ge.ioxc[333] = 1205347831;
        ge.ioxc[334] = -2132309828;
        ge.ioxc[335] = 849344977;
        ge.ioxc[336] = -1975280481;
        ge.ioxc[337] = -2135301789;
        ge.ioxc[338] = -513348083;
        ge.ioxc[339] = 839108025;
        ge.ioxc[340] = 731160036;
        ge.ioxc[341] = -589838707;
        ge.ioxc[342] = 2108733195;
        ge.ioxc[343] = -988151504;
        ge.ioxc[344] = 76301086;
        ge.ioxc[345] = -2141691702;
        ge.ioxc[346] = -792938473;
        ge.ioxc[347] = -1139558060;
        ge.ioxc[348] = 2077493953;
        ge.ioxc[349] = 1106707939;
        ge.ioxc[350] = -1550658946;
        ge.ioxc[351] = -2064855700;
        ge.ioxc[352] = 1080194947;
        ge.ioxc[353] = 1407580129;
        ge.ioxc[354] = -529700812;
        ge.ioxc[355] = 1322584831;
        ge.ioxc[356] = 1756738460;
        ge.ioxc[357] = 1738265845;
        ge.ioxc[358] = -1538087025;
        ge.ioxc[359] = -86760233;
        ge.ioxc[360] = 1856671507;
        ge.ioxc[361] = -704489169;
        ge.ioxc[362] = -286963848;
        ge.ioxc[363] = 89596613;
        ge.ioxc[364] = 23210622;
        ge.ioxc[365] = 486517411;
        ge.ioxc[366] = 524770447;
        ge.ioxc[367] = -1472843467;
        ge.ioxc[368] = -1134475067;
        ge.ioxc[369] = -1720793609;
        ge.ioxc[370] = -2072560990;
        ge.ioxc[371] = -1595702136;
        ge.ioxc[372] = 1029184083;
        ge.ioxc[373] = -180463736;
        ge.ioxc[374] = -288976746;
        ge.ioxc[375] = -1941922931;
        ge.ioxc[376] = 317630279;
        ge.ioxc[377] = 1435967105;
        ge.ioxc[378] = 187354879;
        ge.ioxc[379] = -287380682;
        ge.ioxc[380] = 1447320448;
        ge.ioxc[381] = -1336989068;
        ge.ioxc[382] = -1563479068;
        ge.ioxc[383] = -354441230;
        ge.ioxc[384] = -1959022501;
        ge.ioxc[385] = -294933624;
        ge.ioxc[386] = 259419880;
        ge.ioxc[387] = 1178108732;
        ge.ioxc[388] = 47483052;
        ge.ioxc[389] = -2121709422;
        ge.ioxc[390] = 781594235;
        ge.ioxc[391] = -67531339;
        ge.ioxc[392] = 337636698;
        ge.ioxc[393] = 254678543;
        ge.ioxc[394] = -1424803596;
        ge.ioxc[395] = 74830827;
        ge.ioxc[396] = 1589312468;
        ge.ioxc[397] = -435161652;
        ge.ioxc[398] = -295982798;
        ge.ioxc[399] = 760196738;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCooldown(int var1_1) {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - ge.ioxe("irnv", ioxs(int ), (int)487));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2124431726: {
                    v1 = ge.ioxe("irnw", ioxs(int ), (int)488);
                    continue block26;
                }
                case -1039256179: {
                    v1 = ge.ioxe("irnx", ioxs(int ), (int)489);
                    continue block26;
                }
                case -239756314: {
                    break block26;
                }
            }
            break;
        }
        var4_2 = ge.c;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("irny", ioxs(int ), (int)490));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1295773023: {
                    v3 = ge.ioxe("irnz", ioxs(int ), (int)491);
                    continue block27;
                }
                case -239756314: {
                    break block27;
                }
                case 654472563: {
                    v3 = ge.ioxe("iroa", ioxs(int ), (int)492);
                    continue block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = ge.b;
        v4 /* !! */  = ge.qc;
        if (true) ** GOTO lbl33
        block28: while (true) {
            v4 /* !! */  = (long)(v5 - ge.ioxe("irob", ioxs(int ), (int)493));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -840983657: {
                    v5 = ge.ioxe("iroc", ioxs(int ), (int)494);
                    continue block28;
                }
                case -239756314: {
                    break block28;
                }
                case 1090458784: {
                    v5 = ge.ioxe("irod", ioxs(int ), (int)495);
                    continue block28;
                }
            }
            break;
        }
        var2_4 = ge.a;
        if (var4_2) {
            throw null;
lbl45:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl45
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl45
                v6 /* !! */  = ge.qc;
                if (true) ** GOTO lbl56
                block30: while (true) {
                    v6 /* !! */  = (long)(ge.ioxe("irof", ioxs(int ), (int)497) - ge.ioxe("iroe", ioxs(int ), (int)496));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1175748400: {
                            continue block30;
                        }
                        case -239756314: {
                            break block30;
                        }
                    }
                    break;
                }
                this.cooldown = var1_1;
                if (var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ge.ioxe("irog", ioxa(int ), (int)767);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ge.ioxe("iroh", ioxa(int ), (int)768);
                } while (!var4_2);
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)ge.ioxe("iroi", ioxa(int ), (int)769);
                } while (!var4_2);
                throw null;
            }
lbl79:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ge.ioxe("iroj", ioxa(int ), (int)770);
                    if (!var4_2) ** GOTO lbl74
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ge.ioxe("irok", ioxa(int ), (int)771);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleFunTimeMode() {
        block59: {
            var5_1 = ge.c;
            var4_2 /* !! */  = ge.b;
            var3_3 = ge.a;
            if (var5_1) {
                throw null;
lbl6:
                // 15 sources

                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (!ge.mc.field_1690.field_1903.method_1434()) break block59;
            if (var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        var1_4 = ge.mc.field_1724.method_5829().method_1014((double)ge.ioxe("ipfa", ipdf(int ), (int)52));
        if (var3_3 || var3_3) ** GOTO lbl6
        var2_5 = new class_238(var1_4.field_1323, var1_4.field_1322, var1_4.field_1321, var1_4.field_1320, var1_4.field_1322 + ge.ioxe("ipfb", ipdf(int ), (int)53), var1_4.field_1324);
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!this.stopWatch.finished((double)ge.ioxe("ipfd", ipdf(int ), (int)54))) ** GOTO lbl41
        if (var3_3) ** GOTO lbl6
        if (!pn.isBox(var2_5, (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, hasCollision(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)((ge)this))) ** GOTO lbl41
        if (var3_3 || var3_3) ** GOTO lbl6
        var2_5 = new class_238(var1_4.field_1323 - ge.ioxe("ipfe", ipdf(int ), (int)55), var1_4.field_1322 + 1.0, var1_4.field_1321 - ge.ioxe("ipfg", ipdf(int ), (int)56), var1_4.field_1320, var1_4.field_1325, var1_4.field_1324);
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!pn.isBox(var2_5, (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, hasCollision(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)((ge)this))) ** GOTO lbl36
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                ge.mc.field_1724.method_24830((boolean)ge.ioxe("ipfi", ioxa(int ), (int)94));
                if (var3_3 || var3_3) ** GOTO lbl6
                ge.mc.field_1724.method_18800(ge.mc.field_1724.method_18798().field_1352, (double)ge.ioxe("ipfj", ipdf(int ), (int)57), ge.mc.field_1724.method_18798().field_1350);
                if (var3_3) ** GOTO lbl6
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl41
            }
lbl36:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            ge.mc.field_1724.method_24830((boolean)ge.ioxe("ipfl", ioxa(int ), (int)95));
            if (var3_3 || var3_3) ** GOTO lbl6
            ge.mc.field_1724.method_6043();
            if (var3_3) ** GOTO lbl6
lbl41:
            // 4 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return;
            case 0: {
                var4_2 /* !! */  = (int)ge.ioxe("ipfn", ioxa(int ), (int)96);
                if (var5_1) {
                    throw null;
                }
            }
lbl48:
            // 5 sources

            case 1: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxn", ioxa(int ), (int)97);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 2: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxo", ioxa(int ), (int)98);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl58:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ge.ioxe("ipxp", ioxa(int ), (int)99);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl166
                    break;
                }
            }
lbl64:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxq", ioxa(int ), (int)100);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 5: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxr", ioxa(int ), (int)101);
                if (!var5_1) ** GOTO lbl48
                throw null;
            }
lbl73:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxs", ioxa(int ), (int)102);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl78:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxt", ioxa(int ), (int)103);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl83:
            // 4 sources

            case 8: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxu", ioxa(int ), (int)104);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
            case 9: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxv", ioxa(int ), (int)105);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl93:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxw", ioxa(int ), (int)106);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 11: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxx", ioxa(int ), (int)107);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl103:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxy", ioxa(int ), (int)108);
                if (!var5_1) ** GOTO lbl78
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)ge.ioxe("ipxz", ioxa(int ), (int)109);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl112:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)ge.ioxe("ipya", ioxa(int ), (int)110);
                if (var5_1) {
                    throw null;
                }
            }
lbl116:
            // 5 sources

            case 15: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyb", ioxa(int ), (int)111);
                if (!var5_1) ** GOTO lbl58
                throw null;
            }
lbl120:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyc", ioxa(int ), (int)112);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyd", ioxa(int ), (int)113);
                if (!var5_1) ** GOTO lbl112
                throw null;
            }
lbl128:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)ge.ioxe("ipye", ioxa(int ), (int)114);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl133:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyf", ioxa(int ), (int)115);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 20: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyg", ioxa(int ), (int)116);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
lbl142:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyh", ioxa(int ), (int)117);
                if (!var5_1) ** GOTO lbl73
                throw null;
            }
lbl146:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyi", ioxa(int ), (int)118);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
lbl150:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyj", ioxa(int ), (int)119);
                if (!var5_1) ** GOTO lbl83
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyk", ioxa(int ), (int)120);
                if (!var5_1) ** GOTO lbl64
                throw null;
            }
lbl158:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyl", ioxa(int ), (int)121);
                if (!var5_1) ** GOTO lbl48
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)ge.ioxe("ipym", ioxa(int ), (int)122);
                if (!var5_1) break;
                throw null;
            }
lbl166:
            // 3 sources

            case 27: {
                var4_2 /* !! */  = (int)ge.ioxe("ipyn", ioxa(int ), (int)123);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
            case 28: 
        }
        var4_2 /* !! */  = (int)ge.ioxe("ipyo", ioxa(int ), (int)124);
        ** while (!var5_1)
lbl173:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iruo() {
        ge.ioxc[0] = -1670678971;
        ge.ioxc[1] = -1552508040;
        ge.ioxc[2] = -598008003;
        ge.ioxc[3] = 531104464;
        ge.ioxc[4] = -1734659263;
        ge.ioxc[5] = -54442119;
        ge.ioxc[6] = -672489031;
        ge.ioxc[7] = -820442881;
        ge.ioxc[8] = -923594158;
        ge.ioxc[9] = -520451374;
        ge.ioxc[10] = 1437640866;
        ge.ioxc[11] = -167668418;
        ge.ioxc[12] = 1226476921;
        ge.ioxc[13] = -1564423054;
        ge.ioxc[14] = 1783694211;
        ge.ioxc[15] = -99884513;
        ge.ioxc[16] = 466089947;
        ge.ioxc[17] = 2092665738;
        ge.ioxc[18] = 1901662299;
        ge.ioxc[19] = 902721157;
        ge.ioxc[20] = 814307142;
        ge.ioxc[21] = -2091707245;
        ge.ioxc[22] = -1917465715;
        ge.ioxc[23] = -491003300;
        ge.ioxc[24] = 1933929570;
        ge.ioxc[25] = -1233752687;
        ge.ioxc[26] = 299445969;
        ge.ioxc[27] = 1802902437;
        ge.ioxc[28] = 333983750;
        ge.ioxc[29] = -1024722880;
        ge.ioxc[30] = 672901030;
        ge.ioxc[31] = -2027551774;
        ge.ioxc[32] = -1905495840;
        ge.ioxc[33] = -815276265;
        ge.ioxc[34] = 750969211;
        ge.ioxc[35] = 1739983620;
        ge.ioxc[36] = -1385377494;
        ge.ioxc[37] = -1453967037;
        ge.ioxc[38] = -227094127;
        ge.ioxc[39] = -576552464;
        ge.ioxc[40] = -818717939;
        ge.ioxc[41] = -1935092632;
        ge.ioxc[42] = 1835333522;
        ge.ioxc[43] = 96967196;
        ge.ioxc[44] = 1417480995;
        ge.ioxc[45] = -635215435;
        ge.ioxc[46] = 178629874;
        ge.ioxc[47] = -1208740268;
        ge.ioxc[48] = -966916775;
        ge.ioxc[49] = -2140862262;
        ge.ioxc[50] = 397081109;
        ge.ioxc[51] = 1238457797;
        ge.ioxc[52] = -378685254;
        ge.ioxc[53] = -2036915963;
        ge.ioxc[54] = 627977717;
        ge.ioxc[55] = -880600102;
        ge.ioxc[56] = 2004183091;
        ge.ioxc[57] = -1600286060;
        ge.ioxc[58] = -105953568;
        ge.ioxc[59] = 1920843990;
        ge.ioxc[60] = 1715076359;
        ge.ioxc[61] = 950063203;
        ge.ioxc[62] = -1050870489;
        ge.ioxc[63] = 256646999;
        ge.ioxc[64] = 1073009211;
        ge.ioxc[65] = -292566633;
        ge.ioxc[66] = 1713996237;
        ge.ioxc[67] = 169241120;
        ge.ioxc[68] = 1305503314;
        ge.ioxc[69] = -938705507;
        ge.ioxc[70] = 1974137133;
        ge.ioxc[71] = -202078570;
        ge.ioxc[72] = 196998083;
        ge.ioxc[73] = -539673644;
        ge.ioxc[74] = 341722174;
        ge.ioxc[75] = 1139827752;
        ge.ioxc[76] = -1860464051;
        ge.ioxc[77] = 1639386742;
        ge.ioxc[78] = -23729499;
        ge.ioxc[79] = 1038191101;
        ge.ioxc[80] = 1697806825;
        ge.ioxc[81] = -1978416211;
        ge.ioxc[82] = -1529675014;
        ge.ioxc[83] = -1637513712;
        ge.ioxc[84] = 259777584;
        ge.ioxc[85] = 279191577;
        ge.ioxc[86] = 1749932339;
        ge.ioxc[87] = -1543687415;
        ge.ioxc[88] = 1813161575;
        ge.ioxc[89] = -1883999930;
        ge.ioxc[90] = -2062360298;
        ge.ioxc[91] = -2044856000;
        ge.ioxc[92] = 920377466;
        ge.ioxc[93] = 1681474759;
        ge.ioxc[94] = -11393535;
        ge.ioxc[95] = 1123006551;
        ge.ioxc[96] = 8165252;
        ge.ioxc[97] = -807770081;
        ge.ioxc[98] = 530428075;
        ge.ioxc[99] = -1441195892;
    }

    private static /* synthetic */ void itub() {
        ge.ioxt[100] = -3696045209694135535L;
        ge.ioxt[101] = 6972263458492421662L;
        ge.ioxt[102] = -445676584064286862L;
        ge.ioxt[103] = 3147318078122981108L;
        ge.ioxt[104] = -4196400433289244176L;
        ge.ioxt[105] = -7300172390450149692L;
        ge.ioxt[106] = -9195119903477797461L;
        ge.ioxt[107] = -6288565304621220623L;
        ge.ioxt[108] = -833501155212426621L;
        ge.ioxt[109] = 7755599274621679228L;
        ge.ioxt[110] = -1200062155758689829L;
        ge.ioxt[111] = -7520123342690164826L;
        ge.ioxt[112] = -6328181751151429776L;
        ge.ioxt[113] = -2455173222209617119L;
        ge.ioxt[114] = -8460408101440628481L;
        ge.ioxt[115] = 9053794047238919058L;
        ge.ioxt[116] = -7021637217137548457L;
        ge.ioxt[117] = -1901726964409406366L;
        ge.ioxt[118] = 7121542847748058776L;
        ge.ioxt[119] = 2390876314054423413L;
        ge.ioxt[120] = -5493434969459032482L;
        ge.ioxt[121] = -5023123517809303341L;
        ge.ioxt[122] = -5740977627168985101L;
        ge.ioxt[123] = 7718315551605665387L;
        ge.ioxt[124] = 622704557997698756L;
        ge.ioxt[125] = -2211340271985507602L;
        ge.ioxt[126] = -3303334811921916984L;
        ge.ioxt[127] = -4292636773783998521L;
        ge.ioxt[128] = 8644585133279841468L;
        ge.ioxt[129] = -3032626539737509742L;
        ge.ioxt[130] = 4955207964355296675L;
        ge.ioxt[131] = 4642996743252888182L;
        ge.ioxt[132] = 5599746855602370124L;
        ge.ioxt[133] = -4466034022686925569L;
        ge.ioxt[134] = 8038450900699095579L;
        ge.ioxt[135] = 6274109499641903310L;
        ge.ioxt[136] = 4485443061129505697L;
        ge.ioxt[137] = 603582980004172911L;
        ge.ioxt[138] = 2091316455474503146L;
        ge.ioxt[139] = -5911691698131956357L;
        ge.ioxt[140] = -3803516435743258641L;
        ge.ioxt[141] = 5541882273757974668L;
        ge.ioxt[142] = -5630939464102229959L;
        ge.ioxt[143] = -225195974756509013L;
        ge.ioxt[144] = -3796243929370520752L;
        ge.ioxt[145] = 5726067939074770951L;
        ge.ioxt[146] = -2956487809462636211L;
        ge.ioxt[147] = -6541545967447051075L;
        ge.ioxt[148] = -2736216624582612993L;
        ge.ioxt[149] = 3849444947753548084L;
        ge.ioxt[150] = -2654889175742612213L;
        ge.ioxt[151] = -8291070291678695182L;
        ge.ioxt[152] = -5572545399757296965L;
        ge.ioxt[153] = -1023537344229617554L;
        ge.ioxt[154] = 1512735047482215104L;
        ge.ioxt[155] = 8614540804313286266L;
        ge.ioxt[156] = 2190841636070791425L;
        ge.ioxt[157] = 6203742398440559111L;
        ge.ioxt[158] = 3665843146309130819L;
        ge.ioxt[159] = -6740446195057789611L;
        ge.ioxt[160] = -4602084616144527958L;
        ge.ioxt[161] = 5238152270398046625L;
        ge.ioxt[162] = 5631460811915273852L;
        ge.ioxt[163] = -4801095830872668398L;
        ge.ioxt[164] = -3479591638661647650L;
        ge.ioxt[165] = -8200179634422506515L;
        ge.ioxt[166] = -1014320183621553047L;
        ge.ioxt[167] = 4056589526277611594L;
        ge.ioxt[168] = 6017254641425195440L;
        ge.ioxt[169] = -4356887685251324814L;
        ge.ioxt[170] = 2721346619762405356L;
        ge.ioxt[171] = -7183181184294297622L;
        ge.ioxt[172] = 6819211380649651811L;
        ge.ioxt[173] = 2080775336614662250L;
        ge.ioxt[174] = -7439166042581329210L;
        ge.ioxt[175] = -679805117163701906L;
        ge.ioxt[176] = -3058911921032582945L;
        ge.ioxt[177] = -1333679901837256643L;
        ge.ioxt[178] = 4872943854746061575L;
        ge.ioxt[179] = 273565829195923149L;
        ge.ioxt[180] = 3846479674451988655L;
        ge.ioxt[181] = -3949244578914053702L;
        ge.ioxt[182] = -4444262671331443077L;
        ge.ioxt[183] = -2294773116225207654L;
        ge.ioxt[184] = 4468303023155108213L;
        ge.ioxt[185] = 1564664830523401090L;
        ge.ioxt[186] = -3867993063742515706L;
        ge.ioxt[187] = 6253869935235829140L;
        ge.ioxt[188] = -8381357730483769628L;
        ge.ioxt[189] = 6515905191166505370L;
        ge.ioxt[190] = -4734568751778834446L;
        ge.ioxt[191] = 5987850769828753898L;
        ge.ioxt[192] = 2219868508664410868L;
        ge.ioxt[193] = 2008889608892405542L;
        ge.ioxt[194] = 8587820403346066698L;
        ge.ioxt[195] = 2848438171060732260L;
        ge.ioxt[196] = -4451578257513714279L;
        ge.ioxt[197] = 500705314394280985L;
        ge.ioxt[198] = -3791105414206245161L;
        ge.ioxt[199] = 539856772084771160L;
    }

    static {
        ge.iruo();
        ge.irup();
        ge.iruq();
        ge.irur();
        ge.irut();
        ge.irvg();
        ge.irvo();
        ge.irvx();
        ge.ittq();
        ge.ittr();
        ge.itts();
        ge.ittt();
        ge.ittu();
        ge.ittv();
        ge.ittw();
        ge.ittx();
        ge.itty();
        ge.ittz();
        ioxt = new long[579];
        ioxu = new long[579];
        ge.itua();
        ge.itub();
        ge.ituc();
        ge.itud();
        ge.itue();
        ge.ituf();
        ge.itug();
        ge.ituh();
        ge.itui();
        ge.ituj();
        ge.ituk();
        ge.itul();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canPlace(class_1799 var1_1) {
        block129: {
            v0 /* !! */  = ge.qc;
            if (true) ** GOTO lbl5
            block80: while (true) {
                v0 /* !! */  = (long)(v1 - ge.ioxe("ires", ioxs(int ), (int)368));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -239756314: {
                        break block80;
                    }
                    case 1128493548: {
                        v1 = ge.ioxe("iret", ioxs(int ), (int)369);
                        continue block80;
                    }
                    case 1411649561: {
                        v1 = ge.ioxe("ireu", ioxs(int ), (int)370);
                        continue block80;
                    }
                    case 1802445767: {
                        v1 = ge.ioxe("irev", ioxs(int ), (int)371);
                        continue block80;
                    }
                }
                break;
            }
            var8_2 = ge.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irew", ioxs(int ), (int)372)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ge.ioxe("irex", ioxa(int ), (int)649)) break;
                v2 /* !! */  = (long)ge.ioxe("irey", ioxa(int ), (int)650);
            }
            var7_3 /* !! */  = ge.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irez", ioxs(int ), (int)373)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ge.ioxe("irfa", ioxa(int ), (int)651)) break;
                v3 /* !! */  = (long)ge.ioxe("irfb", ioxa(int ), (int)652);
            }
            var6_4 = ge.a;
            if (var8_2) {
                throw null;
lbl32:
                // 12 sources

                return (boolean)ge.ioxe("irfc", ioxa(int ), (int)653);
            }
            if (var6_4 || var6_4) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irfd", ioxs(int ), (int)374)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ge.ioxe("irfe", ioxa(int ), (int)654)) break;
                v4 /* !! */  = (long)ge.ioxe("irff", ioxa(int ), (int)655);
            }
            var2_5 = this.getBlockPos();
            if (var6_4 || var6_4) ** GOTO lbl32
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("irfg", ioxs(int ), (int)375)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ge.ioxe("irfh", ioxa(int ), (int)656)) break;
                v5 /* !! */  = (long)ge.ioxe("irfi", ioxa(int ), (int)657);
            }
            v6 = var2_5.method_10264();
            v7 /* !! */  = ge.qc;
            if (true) ** GOTO lbl52
            block86: while (true) {
                v7 /* !! */  = (long)(ge.ioxe("irfk", ioxs(int ), (int)377) - ge.ioxe("irfj", ioxs(int ), (int)376));
lbl52:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -447513990: {
                        continue block86;
                    }
                    case -239756314: {
                        break block86;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("irfl", ioxs(int ), (int)378)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ge.ioxe("irfm", ioxa(int ), (int)658)) break;
                v8 /* !! */  = (long)ge.ioxe("irfn", ioxa(int ), (int)659);
            }
            v9 = ge.mc.field_1724;
            v10 /* !! */  = ge.qc;
            if (true) ** GOTO lbl67
            block88: while (true) {
                v10 /* !! */  = (long)(ge.ioxe("irfp", ioxs(int ), (int)380) - ge.ioxe("irfo", ioxs(int ), (int)379));
lbl67:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1897685118: {
                        continue block88;
                    }
                    case -239756314: {
                        break block88;
                    }
                }
                break;
            }
            if (v6 < v9.method_31478()) break block129;
            if (var6_4) ** GOTO lbl32
            return (boolean)ge.ioxe("irfq", ioxa(int ), (int)660);
        }
        if (var6_4 || var6_4) ** GOTO lbl32
        v11 /* !! */  = ge.qc;
        if (true) ** GOTO lbl81
        block89: while (true) {
            v11 /* !! */  = (long)(v12 - ge.ioxe("irfr", ioxs(int ), (int)381));
lbl81:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -239756314: {
                    break block89;
                }
                case 77136813: {
                    v12 = ge.ioxe("irfs", ioxs(int ), (int)382);
                    continue block89;
                }
                case 2146940510: {
                    v12 = ge.ioxe("irft", ioxs(int ), (int)383);
                    continue block89;
                }
            }
            break;
        }
        var3_6 = (class_1747)var1_1.method_7909();
        if (var6_4 || var6_4) ** GOTO lbl32
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 /* !! */  = ge.qc;
                if (true) ** GOTO lbl99
                block90: while (true) {
                    v13 /* !! */  = (long)(v14 - ge.ioxe("irfu", ioxs(int ), (int)384));
lbl99:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -239756314: {
                            break block90;
                        }
                        case 142123058: {
                            v14 = ge.ioxe("irfv", ioxs(int ), (int)385);
                            continue block90;
                        }
                        case 1358014451: {
                            v14 = ge.ioxe("irfw", ioxs(int ), (int)386);
                            continue block90;
                        }
                    }
                    break;
                }
                v15 = var3_6.method_7711();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("irfx", ioxs(int ), (int)387)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ge.ioxe("irfy", ioxa(int ), (int)661)) break;
                    v16 /* !! */  = (long)ge.ioxe("irfz", ioxa(int ), (int)662);
                }
                v17 = v15.method_9564();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("irga", ioxs(int ), (int)388)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ge.ioxe("irgb", ioxa(int ), (int)663)) break;
                    v18 /* !! */  = (long)ge.ioxe("irgc", ioxa(int ), (int)664);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("irgd", ioxs(int ), (int)389)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ge.ioxe("irge", ioxa(int ), (int)665)) break;
                    v19 /* !! */  = (long)ge.ioxe("irgf", ioxa(int ), (int)666);
                }
                v20 = ge.mc.field_1687;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("irgg", ioxs(int ), (int)390)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ge.ioxe("irgh", ioxa(int ), (int)667)) break;
                    v21 /* !! */  = (long)ge.ioxe("irgi", ioxa(int ), (int)668);
                }
                var4_7 = v17.method_26220((class_1922)v20, var2_5);
                if (var6_4 || var6_4) ** GOTO lbl32
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = ge.qc - ge.ioxe("irgj", ioxs(int ), (int)391)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ge.ioxe("irgk", ioxa(int ), (int)669)) break;
                    v22 /* !! */  = (long)ge.ioxe("irgl", ioxa(int ), (int)670);
                }
                if (!var4_7.method_1110()) ** GOTO lbl141
                if (var6_4) ** GOTO lbl32
                return (boolean)ge.ioxe("irgm", ioxa(int ), (int)671);
lbl141:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl32
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_10 = ge.qc - ge.ioxe("irgn", ioxs(int ), (int)392)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ge.ioxe("irgo", ioxa(int ), (int)672)) break;
                    v23 /* !! */  = (long)ge.ioxe("irgp", ioxa(int ), (int)673);
                }
                v24 = var4_7.method_1107();
                v25 /* !! */  = ge.qc;
                if (true) ** GOTO lbl152
                block97: while (true) {
                    v25 /* !! */  = (long)(ge.ioxe("irgr", ioxs(int ), (int)394) - ge.ioxe("irgq", ioxs(int ), (int)393));
lbl152:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -430409968: {
                            continue block97;
                        }
                        case -239756314: {
                            break block97;
                        }
                    }
                    break;
                }
                var5_8 = v24.method_996(var2_5);
                if (var6_4 || var6_4) ** GOTO lbl32
                v26 /* !! */  = ge.qc;
                if (true) ** GOTO lbl163
                block98: while (true) {
                    v26 /* !! */  = (long)(v27 - ge.ioxe("irgs", ioxs(int ), (int)395));
lbl163:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -239756314: {
                            break block98;
                        }
                        case -219741799: {
                            v27 = ge.ioxe("irgt", ioxs(int ), (int)396);
                            continue block98;
                        }
                        case 1513962838: {
                            v27 = ge.ioxe("irgu", ioxs(int ), (int)397);
                            continue block98;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_11 = ge.qc - ge.ioxe("irgv", ioxs(int ), (int)398)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ge.ioxe("irgw", ioxa(int ), (int)674)) break;
                    v28 /* !! */  = (long)ge.ioxe("irgx", ioxa(int ), (int)675);
                }
                v29 = ge.mc.field_1724;
                v30 /* !! */  = ge.qc;
                if (true) ** GOTO lbl182
                block100: while (true) {
                    v30 /* !! */  = (long)(ge.ioxe("irgz", ioxs(int ), (int)400) - ge.ioxe("irgy", ioxs(int ), (int)399));
lbl182:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1319350376: {
                            continue block100;
                        }
                        case -239756314: {
                            break block100;
                        }
                    }
                    break;
                }
                v31 = v29.method_5829();
                v32 /* !! */  = ge.qc;
                if (true) ** GOTO lbl192
                block101: while (true) {
                    v32 /* !! */  = (long)(v33 - ge.ioxe("irha", ioxs(int ), (int)401));
lbl192:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1967307118: {
                            v33 = ge.ioxe("irhb", ioxs(int ), (int)402);
                            continue block101;
                        }
                        case -1472433445: {
                            v33 = ge.ioxe("irhc", ioxs(int ), (int)403);
                            continue block101;
                        }
                        case -239756314: {
                            break block101;
                        }
                    }
                    break;
                }
                if (var5_8.method_994(v31)) ** GOTO lbl249
                if (var6_4) ** GOTO lbl32
                v34 = ge.ioxe("irhd", ioxa(int ), (int)676);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_12 = ge.qc - ge.ioxe("irhe", ioxs(int ), (int)404)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == ge.ioxe("irhf", ioxa(int ), (int)677)) break;
                    v35 /* !! */  = (long)ge.ioxe("irhg", ioxa(int ), (int)678);
                }
                v36 = ns.simulateLocalPlayer((int)v34);
                v37 /* !! */  = ge.qc;
                if (true) ** GOTO lbl214
                block103: while (true) {
                    v37 /* !! */  = (long)(v38 - ge.ioxe("irhh", ioxs(int ), (int)405));
lbl214:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -2042813374: {
                            v38 = ge.ioxe("irhi", ioxs(int ), (int)406);
                            continue block103;
                        }
                        case -646460536: {
                            v38 = ge.ioxe("irhj", ioxs(int ), (int)407);
                            continue block103;
                        }
                        case -239756314: {
                            break block103;
                        }
                        case 1828629843: {
                            v38 = ge.ioxe("irhk", ioxs(int ), (int)408);
                            continue block103;
                        }
                    }
                    break;
                }
                v39 = v36.boundingBox;
                v40 /* !! */  = ge.qc;
                if (true) ** GOTO lbl231
                block104: while (true) {
                    v40 /* !! */  = (long)(v41 - ge.ioxe("irhl", ioxs(int ), (int)409));
lbl231:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1837622671: {
                            v41 = ge.ioxe("irhm", ioxs(int ), (int)410);
                            continue block104;
                        }
                        case -239756314: {
                            break block104;
                        }
                        case 88668800: {
                            v41 = ge.ioxe("irhn", ioxs(int ), (int)411);
                            continue block104;
                        }
                        case 763773245: {
                            v41 = ge.ioxe("irho", ioxs(int ), (int)412);
                            continue block104;
                        }
                    }
                    break;
                }
                if (!var5_8.method_994(v39)) ** GOTO lbl249
                if (var6_4) ** GOTO lbl32
                v42 = ge.ioxe("irhp", ioxa(int ), (int)679);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl252
lbl249:
                // 2 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                v42 = ge.ioxe("irhq", ioxa(int ), (int)680);
lbl252:
                // 2 sources

                return (boolean)v42;
            }
            case 0: {
                var7_3 /* !! */  = (int)ge.ioxe("irhr", ioxa(int ), (int)681);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl342
            }
lbl258:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)ge.ioxe("irhs", ioxa(int ), (int)682);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl263:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)ge.ioxe("irht", ioxa(int ), (int)683);
                if (var8_2) {
                    throw null;
                }
            }
            case 3: {
                var7_3 /* !! */  = (int)ge.ioxe("irhu", ioxa(int ), (int)684);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl272:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ge.ioxe("irhv", ioxa(int ), (int)685);
                if (!var8_2) ** GOTO lbl258
                throw null;
            }
            case 5: {
                var7_3 /* !! */  = (int)ge.ioxe("irhw", ioxa(int ), (int)686);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 6: {
                var7_3 /* !! */  = (int)ge.ioxe("irhx", ioxa(int ), (int)687);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl286:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)ge.ioxe("irhy", ioxa(int ), (int)688);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 8: {
                var7_3 /* !! */  = (int)ge.ioxe("irhz", ioxa(int ), (int)689);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl296:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)ge.ioxe("iria", ioxa(int ), (int)690);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl301:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)ge.ioxe("irib", ioxa(int ), (int)691);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl306:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)ge.ioxe("iric", ioxa(int ), (int)692);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl311:
            // 4 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ge.ioxe("irid", ioxa(int ), (int)693);
                    if (!var8_2) ** GOTO lbl296
                    throw null;
                }
            }
lbl316:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ge.ioxe("irie", ioxa(int ), (int)694);
                if (!var8_2) ** GOTO lbl272
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)ge.ioxe("irif", ioxa(int ), (int)695);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl342
            }
lbl325:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)ge.ioxe("irig", ioxa(int ), (int)696);
                if (!var8_2) ** GOTO lbl296
                throw null;
            }
            case 16: {
                var7_3 /* !! */  = (int)ge.ioxe("irih", ioxa(int ), (int)697);
                if (!var8_2) ** GOTO lbl306
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)ge.ioxe("irii", ioxa(int ), (int)698);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl338:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)ge.ioxe("irij", ioxa(int ), (int)699);
                if (!var8_2) ** GOTO lbl311
                throw null;
            }
lbl342:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)ge.ioxe("irik", ioxa(int ), (int)700);
                if (!var8_2) ** GOTO lbl325
                throw null;
            }
lbl346:
            // 3 sources

            case 20: {
                var7_3 /* !! */  = (int)ge.ioxe("iril", ioxa(int ), (int)701);
                if (!var8_2) break;
                throw null;
            }
lbl350:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)ge.ioxe("irim", ioxa(int ), (int)702);
                if (!var8_2) ** GOTO lbl263
                throw null;
            }
            case 22: {
                do {
                    var7_3 /* !! */  = (int)ge.ioxe("irin", ioxa(int ), (int)703);
                } while (!var8_2);
                throw null;
            }
            case 23: 
        }
        var7_3 /* !! */  = (int)ge.ioxe("irio", ioxa(int ), (int)704);
        ** while (!var8_2)
lbl362:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isStartSetPitch() {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ge.ioxe("irtd", ioxs(int ), (int)562) - ge.ioxe("irtc", ioxs(int ), (int)561));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2000087860: {
                    continue block14;
                }
                case -239756314: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = ge.c;
        v1 /* !! */  = ge.qc;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(ge.ioxe("irtf", ioxs(int ), (int)564) - ge.ioxe("irte", ioxs(int ), (int)563));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -239756314: {
                    break block15;
                }
                case 1858918314: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = ge.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irtg", ioxs(int ), (int)565)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ge.ioxe("irth", ioxa(int ), (int)830)) break;
            v2 /* !! */  = (long)ge.ioxe("irti", ioxa(int ), (int)831);
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)ge.ioxe("irtj", ioxa(int ), (int)832);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irtk", ioxs(int ), (int)566)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ge.ioxe("irtl", ioxa(int ), (int)833)) break;
                    v3 /* !! */  = (long)ge.ioxe("irtm", ioxa(int ), (int)834);
                }
                return this.startSetPitch;
            }
lbl44:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ge.ioxe("irtn", ioxa(int ), (int)835);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl54
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ge.ioxe("irto", ioxa(int ), (int)836);
                if (var3_1) {
                    throw null;
                }
            }
lbl54:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ge.ioxe("irtp", ioxa(int ), (int)837);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ge.ioxe("irtq", ioxa(int ), (int)838);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float iqvj(int n2) {
        return Float.intBitsToFloat(ioxc[n2] ^ ioxd[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleWaterBucketMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iqle", ioxs(int ), (int)186)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("iqlf", ioxa(int ), (int)324)) break;
            v0 /* !! */  = (long)ge.ioxe("iqlg", ioxa(int ), (int)325);
        }
        var3_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iqlh", ioxs(int ), (int)187)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("iqli", ioxa(int ), (int)326)) break;
            v1 /* !! */  = (long)ge.ioxe("iqlj", ioxa(int ), (int)327);
        }
        var2_2 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl17
        block91: while (true) {
            v2 /* !! */  = (long)(ge.ioxe("iqll", ioxs(int ), (int)189) - ge.ioxe("iqlk", ioxs(int ), (int)188));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -239756314: {
                    break block91;
                }
                case 56277754: {
                    continue block91;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl25:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 /* !! */  = ge.qc;
        if (true) ** GOTO lbl32
        block93: while (true) {
            v3 /* !! */  = (long)(ge.ioxe("iqln", ioxs(int ), (int)191) - ge.ioxe("iqlm", ioxs(int ), (int)190));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2086878467: {
                    continue block93;
                }
                case -239756314: {
                    break block93;
                }
            }
            break;
        }
        v4 /* !! */  = ge.qc;
        if (true) ** GOTO lbl41
        block94: while (true) {
            v4 /* !! */  = (long)(ge.ioxe("iqlp", ioxs(int ), (int)193) - ge.ioxe("iqlo", ioxs(int ), (int)192));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1173477278: {
                    continue block94;
                }
                case -239756314: {
                    break block94;
                }
            }
            break;
        }
        v5 = ge.mc.field_1724;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("iqlq", ioxs(int ), (int)194)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ge.ioxe("iqlr", ioxa(int ), (int)328)) break;
            v6 /* !! */  = (long)ge.ioxe("iqls", ioxa(int ), (int)329);
        }
        v7 = v5.method_6047();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iqlt", ioxs(int ), (int)195)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ge.ioxe("iqlu", ioxa(int ), (int)330)) break;
            v8 /* !! */  = (long)ge.ioxe("iqlv", ioxa(int ), (int)331);
        }
        v9 = v7.method_7909();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("iqlw", ioxs(int ), (int)196)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ge.ioxe("iqlx", ioxa(int ), (int)332)) break;
            v10 /* !! */  = (long)ge.ioxe("iqly", ioxa(int ), (int)333);
        }
        if (v9 != class_1802.field_8705) ** GOTO lbl297
        if (var1_3) ** GOTO lbl25
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("iqlz", ioxs(int ), (int)197)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ge.ioxe("iqma", ioxa(int ), (int)334)) break;
            v11 /* !! */  = (long)ge.ioxe("iqmb", ioxa(int ), (int)335);
        }
        v12 /* !! */  = ge.qc;
        if (true) ** GOTO lbl75
        block99: while (true) {
            v12 /* !! */  = (long)(v13 - ge.ioxe("iqmc", ioxs(int ), (int)198));
lbl75:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -296178394: {
                    v13 = ge.ioxe("iqmd", ioxs(int ), (int)199);
                    continue block99;
                }
                case -239756314: {
                    break block99;
                }
                case 1096353951: {
                    v13 = ge.ioxe("iqme", ioxs(int ), (int)200);
                    continue block99;
                }
            }
            break;
        }
        v14 = ge.mc.field_1724;
        v15 /* !! */  = ge.qc;
        if (true) ** GOTO lbl89
        block100: while (true) {
            v15 /* !! */  = (long)(ge.ioxe("iqmg", ioxs(int ), (int)202) - ge.ioxe("iqmf", ioxs(int ), (int)201));
lbl89:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -239756314: {
                    break block100;
                }
                case 2076483368: {
                    continue block100;
                }
            }
            break;
        }
        if (!v14.field_5976) ** GOTO lbl297
        if (var1_3 || var1_3) ** GOTO lbl25
        v16 /* !! */  = ge.qc;
        if (true) ** GOTO lbl100
        block101: while (true) {
            v16 /* !! */  = (long)(v17 - ge.ioxe("iqmh", ioxs(int ), (int)203));
lbl100:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -695417325: {
                    v17 = ge.ioxe("iqmi", ioxs(int ), (int)204);
                    continue block101;
                }
                case -239756314: {
                    break block101;
                }
                case 1916586354: {
                    v17 = ge.ioxe("iqmj", ioxs(int ), (int)205);
                    continue block101;
                }
            }
            break;
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("iqmk", ioxs(int ), (int)206)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ge.ioxe("iqml", ioxa(int ), (int)336)) break;
            v18 /* !! */  = (long)ge.ioxe("iqmm", ioxa(int ), (int)337);
        }
        v19 = ge.mc.field_1761;
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iqmn", ioxs(int ), (int)207)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == ge.ioxe("iqmo", ioxa(int ), (int)338)) break;
            v20 /* !! */  = (long)ge.ioxe("iqmp", ioxa(int ), (int)339);
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("iqmq", ioxs(int ), (int)208)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == ge.ioxe("iqmr", ioxa(int ), (int)340)) break;
            v21 /* !! */  = (long)ge.ioxe("iqms", ioxa(int ), (int)341);
        }
        v22 = ge.mc.field_1724;
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_9 = ge.qc - ge.ioxe("iqmt", ioxs(int ), (int)209)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == ge.ioxe("iqmu", ioxa(int ), (int)342)) break;
            v23 /* !! */  = (long)ge.ioxe("iqmv", ioxa(int ), (int)343);
        }
        v24 /* !! */  = ge.qc;
        if (true) ** GOTO lbl135
        block106: while (true) {
            v24 /* !! */  = (long)(ge.ioxe("iqmx", ioxs(int ), (int)211) - ge.ioxe("iqmw", ioxs(int ), (int)210));
lbl135:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -239756314: {
                    break block106;
                }
                case 197334061: {
                    continue block106;
                }
            }
            break;
        }
        v19.method_2919((class_1657)v22, class_1268.field_5808);
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_10 = ge.qc - ge.ioxe("iqmy", ioxs(int ), (int)212)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == ge.ioxe("iqmz", ioxa(int ), (int)344)) break;
            v25 /* !! */  = (long)ge.ioxe("iqna", ioxa(int ), (int)345);
        }
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_11 = ge.qc - ge.ioxe("iqnb", ioxs(int ), (int)213)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == ge.ioxe("iqnc", ioxa(int ), (int)346)) break;
            v26 /* !! */  = (long)ge.ioxe("iqnd", ioxa(int ), (int)347);
        }
        v27 = ge.mc.field_1724;
        v28 /* !! */  = ge.qc;
        if (true) ** GOTO lbl158
        block109: while (true) {
            v28 /* !! */  = (long)(v29 - ge.ioxe("iqne", ioxs(int ), (int)214));
lbl158:
            // 2 sources

            switch ((int)v28 /* !! */ ) {
                case -2135755066: {
                    v29 = ge.ioxe("iqnf", ioxs(int ), (int)215);
                    continue block109;
                }
                case -554585392: {
                    v29 = ge.ioxe("iqng", ioxs(int ), (int)216);
                    continue block109;
                }
                case -239756314: {
                    break block109;
                }
                case 733187923: {
                    v29 = ge.ioxe("iqnh", ioxs(int ), (int)217);
                    continue block109;
                }
            }
            break;
        }
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_12 = ge.qc - ge.ioxe("iqni", ioxs(int ), (int)218)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == ge.ioxe("iqnj", ioxa(int ), (int)348)) break;
            v30 /* !! */  = (long)ge.ioxe("iqnk", ioxa(int ), (int)349);
        }
        v27.method_6104(class_1268.field_5808);
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v31 /* !! */  = ge.qc;
                if (true) ** GOTO lbl185
                block111: while (true) {
                    v31 /* !! */  = (long)(v32 - ge.ioxe("iqnl", ioxs(int ), (int)219));
lbl185:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2119975817: {
                            v32 = ge.ioxe("iqnm", ioxs(int ), (int)220);
                            continue block111;
                        }
                        case -239756314: {
                            break block111;
                        }
                        case 863582942: {
                            v32 = ge.ioxe("iqnn", ioxs(int ), (int)221);
                            continue block111;
                        }
                    }
                    break;
                }
                v33 /* !! */  = ge.qc;
                if (true) ** GOTO lbl198
                block112: while (true) {
                    v33 /* !! */  = (long)(ge.ioxe("iqnp", ioxs(int ), (int)223) - ge.ioxe("iqno", ioxs(int ), (int)222));
lbl198:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -239756314: {
                            break block112;
                        }
                        case 285817737: {
                            continue block112;
                        }
                    }
                    break;
                }
                v34 = ge.mc.field_1724;
                v35 /* !! */  = ge.qc;
                if (true) ** GOTO lbl208
                block113: while (true) {
                    v35 /* !! */  = (long)(ge.ioxe("iqnr", ioxs(int ), (int)225) - ge.ioxe("iqnq", ioxs(int ), (int)224));
lbl208:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -239756314: {
                            break block113;
                        }
                        case 838624321: {
                            continue block113;
                        }
                    }
                    break;
                }
                v36 /* !! */  = ge.qc;
                if (true) ** GOTO lbl217
                block114: while (true) {
                    v36 /* !! */  = (long)(v37 - ge.ioxe("iqns", ioxs(int ), (int)226));
lbl217:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1390696202: {
                            v37 = ge.ioxe("iqnt", ioxs(int ), (int)227);
                            continue block114;
                        }
                        case -239756314: {
                            break block114;
                        }
                        case 1907140163: {
                            v37 = ge.ioxe("iqnu", ioxs(int ), (int)228);
                            continue block114;
                        }
                    }
                    break;
                }
                v38 = ge.mc.field_1724;
                v39 /* !! */  = ge.qc;
                if (true) ** GOTO lbl231
                block115: while (true) {
                    v39 /* !! */  = (long)(v40 - ge.ioxe("iqnv", ioxs(int ), (int)229));
lbl231:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1227584679: {
                            v40 = ge.ioxe("iqnw", ioxs(int ), (int)230);
                            continue block115;
                        }
                        case -239756314: {
                            break block115;
                        }
                        case 39828947: {
                            v40 = ge.ioxe("iqnx", ioxs(int ), (int)231);
                            continue block115;
                        }
                        case 1943329878: {
                            v40 = ge.ioxe("iqny", ioxs(int ), (int)232);
                            continue block115;
                        }
                    }
                    break;
                }
                v41 = v38.method_18798();
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_13 = ge.qc - ge.ioxe("iqnz", ioxs(int ), (int)233)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == ge.ioxe("iqoa", ioxa(int ), (int)350)) break;
                    v42 /* !! */  = (long)ge.ioxe("iqob", ioxa(int ), (int)351);
                }
                v43 = v41.field_1352;
                v44 = ge.ioxe("iqoc", ipdf(int ), (int)234);
                v45 /* !! */  = ge.qc;
                if (true) ** GOTO lbl255
                block117: while (true) {
                    v45 /* !! */  = (long)(ge.ioxe("iqoe", ioxs(int ), (int)236) - ge.ioxe("iqod", ioxs(int ), (int)235));
lbl255:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -239756314: {
                            break block117;
                        }
                        case 358140108: {
                            continue block117;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_14 = ge.qc - ge.ioxe("iqof", ioxs(int ), (int)237)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == ge.ioxe("iqog", ioxa(int ), (int)352)) break;
                    v46 /* !! */  = (long)ge.ioxe("iqoh", ioxa(int ), (int)353);
                }
                v47 = ge.mc.field_1724;
                v48 /* !! */  = ge.qc;
                if (true) ** GOTO lbl270
                block119: while (true) {
                    v48 /* !! */  = (long)(ge.ioxe("iqoj", ioxs(int ), (int)239) - ge.ioxe("iqoi", ioxs(int ), (int)238));
lbl270:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -1047567355: {
                            continue block119;
                        }
                        case -239756314: {
                            break block119;
                        }
                    }
                    break;
                }
                v49 = v47.method_18798();
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_15 = ge.qc - ge.ioxe("iqok", ioxs(int ), (int)240)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == ge.ioxe("iqol", ioxa(int ), (int)354)) break;
                    v50 /* !! */  = (long)ge.ioxe("iqom", ioxa(int ), (int)355);
                }
                v51 = v49.field_1350;
                v52 /* !! */  = ge.qc;
                if (true) ** GOTO lbl286
                block121: while (true) {
                    v52 /* !! */  = (long)(v53 - ge.ioxe("iqon", ioxs(int ), (int)241));
lbl286:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -239756314: {
                            break block121;
                        }
                        case -199139380: {
                            v53 = ge.ioxe("iqoo", ioxs(int ), (int)242);
                            continue block121;
                        }
                        case 1084229475: {
                            v53 = ge.ioxe("iqop", ioxs(int ), (int)243);
                            continue block121;
                        }
                    }
                    break;
                }
                v34.method_18800(v43, (double)v44, v51);
                if (var1_3) ** GOTO lbl25
lbl297:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ge.ioxe("iqoq", ioxa(int ), (int)356);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl310
                    break;
                }
            }
lbl306:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ge.ioxe("iqor", ioxa(int ), (int)357);
                if (var3_1) {
                    throw null;
                }
            }
lbl310:
            // 5 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ge.ioxe("iqos", ioxa(int ), (int)358);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ge.ioxe("iqot", ioxa(int ), (int)359);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl350
            }
lbl320:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ge.ioxe("iqou", ioxa(int ), (int)360);
                if (!var3_1) ** GOTO lbl306
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ge.ioxe("iqov", ioxa(int ), (int)361);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl329:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ge.ioxe("iqow", ioxa(int ), (int)362);
                if (!var3_1) ** GOTO lbl306
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ge.ioxe("iqox", ioxa(int ), (int)363);
                if (!var3_1) ** GOTO lbl310
                throw null;
            }
lbl337:
            // 3 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)ge.ioxe("iqoy", ioxa(int ), (int)364);
                } while (!var3_1);
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ge.ioxe("iqoz", ioxa(int ), (int)365);
                if (!var3_1) ** GOTO lbl320
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ge.ioxe("iqpa", ioxa(int ), (int)366);
                if (!var3_1) ** GOTO lbl329
                throw null;
            }
lbl350:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ge.ioxe("iqpb", ioxa(int ), (int)367);
                if (!var3_1) ** GOTO lbl337
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ge.ioxe("iqpc", ioxa(int ), (int)368);
                if (!var3_1) ** GOTO lbl329
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)ge.ioxe("iqpd", ioxa(int ), (int)369);
        ** while (!var3_1)
lbl361:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findHotbarSlot(class_1792 var1_1) {
        block30: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irbk", ioxs(int ), (int)338)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ge.ioxe("irbl", ioxa(int ), (int)593)) break;
                v0 /* !! */  = (long)ge.ioxe("irbm", ioxa(int ), (int)594);
            }
            var5_2 = ge.c;
            v1 /* !! */  = ge.qc;
            if (true) ** GOTO lbl11
            block20: while (true) {
                v1 /* !! */  = (long)(v2 - ge.ioxe("irbn", ioxs(int ), (int)339));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -239756314: {
                        break block20;
                    }
                    case 1030496780: {
                        v2 = ge.ioxe("irbo", ioxs(int ), (int)340);
                        continue block20;
                    }
                    case 1451981886: {
                        v2 = ge.ioxe("irbp", ioxs(int ), (int)341);
                        continue block20;
                    }
                }
                break;
            }
            var4_3 = ge.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irbq", ioxs(int ), (int)342)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ge.ioxe("irbr", ioxa(int ), (int)595)) break;
                v3 /* !! */  = (long)ge.ioxe("irbs", ioxa(int ), (int)596);
            }
            var3_4 = ge.a;
            if (var5_2) {
                throw null;
lbl29:
                // 8 sources

                return (int)ge.ioxe("irbt", ioxa(int ), (int)597);
            }
            if (var3_4 || var3_4) ** GOTO lbl29
            var2_5 = ge.ioxe("irbu", ioxa(int ), (int)598);
            if (var3_4) ** GOTO lbl29
            do {
                block31: {
                    if (var3_4 || var3_4) ** GOTO lbl29
                    if (var2_5 >= ge.ioxe("irbv", ioxa(int ), (int)599)) break block30;
                    if (var3_4 || var3_4) ** GOTO lbl29
                    v4 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl42
                    block24: while (true) {
                        v4 /* !! */  = (long)(ge.ioxe("irbx", ioxs(int ), (int)344) - ge.ioxe("irbw", ioxs(int ), (int)343));
lbl42:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1505493732: {
                                continue block24;
                            }
                            case -239756314: {
                                break block24;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irby", ioxs(int ), (int)345)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == ge.ioxe("irbz", ioxa(int ), (int)600)) break;
                        v5 /* !! */  = (long)ge.ioxe("irca", ioxa(int ), (int)601);
                    }
                    v6 = ge.mc.field_1724;
                    v7 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl57
                    block26: while (true) {
                        v7 /* !! */  = (long)(v8 - ge.ioxe("ircb", ioxs(int ), (int)346));
lbl57:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -239756314: {
                                break block26;
                            }
                            case 706432356: {
                                v8 = ge.ioxe("ircc", ioxs(int ), (int)347);
                                continue block26;
                            }
                            case 1084741002: {
                                v8 = ge.ioxe("ircd", ioxs(int ), (int)348);
                                continue block26;
                            }
                        }
                        break;
                    }
                    v9 = v6.method_31548();
                    v10 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl71
                    block27: while (true) {
                        v10 /* !! */  = (long)(v11 - ge.ioxe("irce", ioxs(int ), (int)349));
lbl71:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -2025948391: {
                                v11 = ge.ioxe("ircf", ioxs(int ), (int)350);
                                continue block27;
                            }
                            case -239756314: {
                                break block27;
                            }
                            case 2127689281: {
                                v11 = ge.ioxe("ircg", ioxs(int ), (int)351);
                                continue block27;
                            }
                        }
                        break;
                    }
                    v12 = v9.method_5438((int)var2_5);
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("irch", ioxs(int ), (int)352)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == ge.ioxe("irci", ioxa(int ), (int)602)) break;
                        v13 /* !! */  = (long)ge.ioxe("ircj", ioxa(int ), (int)603);
                    }
                    if (v12.method_7909() != var1_1) break block31;
                    if (var3_4 || var3_4) ** GOTO lbl29
                    return (int)var2_5;
                }
                if (var3_4 || var3_4) ** GOTO lbl29
                ++var2_5;
                if (var3_4) ** GOTO lbl29
            } while (!var5_2);
            throw null;
        }
        if (!var3_4 && !var3_4) ** break;
        ** while (true)
        return (int)ge.ioxe("irck", ioxa(int ), (int)604);
    }

    private static /* synthetic */ void ituc() {
        ge.ioxt[200] = -7571601957442975920L;
        ge.ioxt[201] = 8780587725157424585L;
        ge.ioxt[202] = 8553032587957027102L;
        ge.ioxt[203] = -3144187854032011815L;
        ge.ioxt[204] = 7676129123160391299L;
        ge.ioxt[205] = 744123293876925717L;
        ge.ioxt[206] = -1465809566317557747L;
        ge.ioxt[207] = -4648746404106435529L;
        ge.ioxt[208] = 8299357464068910173L;
        ge.ioxt[209] = -5200861987938186530L;
        ge.ioxt[210] = -5516192307272019023L;
        ge.ioxt[211] = 6063698329448016462L;
        ge.ioxt[212] = -6108221809584741481L;
        ge.ioxt[213] = 1243083670154177292L;
        ge.ioxt[214] = -3717265403576181905L;
        ge.ioxt[215] = 4956242524025842851L;
        ge.ioxt[216] = 4180038906756525332L;
        ge.ioxt[217] = -8036782878029823300L;
        ge.ioxt[218] = 3363837014695663282L;
        ge.ioxt[219] = 901510966581176045L;
        ge.ioxt[220] = -217775010201131745L;
        ge.ioxt[221] = -5457852423125151590L;
        ge.ioxt[222] = 7498145920268023997L;
        ge.ioxt[223] = 8801609087740735440L;
        ge.ioxt[224] = 464692980554990479L;
        ge.ioxt[225] = 2065009527477755007L;
        ge.ioxt[226] = -3431745351394921762L;
        ge.ioxt[227] = -1606112663233407897L;
        ge.ioxt[228] = 1325970314267681071L;
        ge.ioxt[229] = -662310655353861666L;
        ge.ioxt[230] = -8159619856795939337L;
        ge.ioxt[231] = 7212361560802933808L;
        ge.ioxt[232] = 7715944530229364487L;
        ge.ioxt[233] = -7018357314659312306L;
        ge.ioxt[234] = 7482596452604046327L;
        ge.ioxt[235] = -504039819514737711L;
        ge.ioxt[236] = 8407375645698807814L;
        ge.ioxt[237] = -2290298075944771857L;
        ge.ioxt[238] = -6772959137887361695L;
        ge.ioxt[239] = -8107218413908075318L;
        ge.ioxt[240] = -4114243056085477214L;
        ge.ioxt[241] = -4318500949164918585L;
        ge.ioxt[242] = -5787193268162001940L;
        ge.ioxt[243] = 8305698975666491688L;
        ge.ioxt[244] = -3449924395149418064L;
        ge.ioxt[245] = -8729308330564813746L;
        ge.ioxt[246] = -6237978770722731883L;
        ge.ioxt[247] = 3361815171485423444L;
        ge.ioxt[248] = -1528592290194905973L;
        ge.ioxt[249] = -6142753317388272419L;
        ge.ioxt[250] = 1916192581577987934L;
        ge.ioxt[251] = -442171640884979038L;
        ge.ioxt[252] = -779946698625944326L;
        ge.ioxt[253] = 7774271275468867101L;
        ge.ioxt[254] = -3494925444693045184L;
        ge.ioxt[255] = -8750648096779065776L;
        ge.ioxt[256] = 1816374171266493004L;
        ge.ioxt[257] = -6425970215036623564L;
        ge.ioxt[258] = -5501569415151519030L;
        ge.ioxt[259] = 8102683191377090102L;
        ge.ioxt[260] = 5236218966692088772L;
        ge.ioxt[261] = 2803235582022253705L;
        ge.ioxt[262] = -6809911241414899130L;
        ge.ioxt[263] = 8094369349620123215L;
        ge.ioxt[264] = 3533399199270733380L;
        ge.ioxt[265] = 2185704289206109370L;
        ge.ioxt[266] = -613395350149420760L;
        ge.ioxt[267] = -6803400289543964923L;
        ge.ioxt[268] = 4852348422395315148L;
        ge.ioxt[269] = 3821126815745278635L;
        ge.ioxt[270] = -1196561325977540407L;
        ge.ioxt[271] = -1787949692413600282L;
        ge.ioxt[272] = -3565566000340078967L;
        ge.ioxt[273] = 561940041915984224L;
        ge.ioxt[274] = 8604557926907533519L;
        ge.ioxt[275] = 3418331940659248398L;
        ge.ioxt[276] = 120215523067932870L;
        ge.ioxt[277] = -1993917708107048366L;
        ge.ioxt[278] = -3598323687918255803L;
        ge.ioxt[279] = 7403798036178726966L;
        ge.ioxt[280] = -3454670402248360858L;
        ge.ioxt[281] = 3302843805254808987L;
        ge.ioxt[282] = 8507849553612930767L;
        ge.ioxt[283] = 2169771253571211916L;
        ge.ioxt[284] = -816110827772406574L;
        ge.ioxt[285] = 8947804293440855332L;
        ge.ioxt[286] = -8613613136939134187L;
        ge.ioxt[287] = 290547222101905591L;
        ge.ioxt[288] = 4540868246764605971L;
        ge.ioxt[289] = -3996403357739068744L;
        ge.ioxt[290] = 6284419022937111713L;
        ge.ioxt[291] = 1819342529818632888L;
        ge.ioxt[292] = -6629453685655241485L;
        ge.ioxt[293] = 4496645487068547169L;
        ge.ioxt[294] = -8522575385738892567L;
        ge.ioxt[295] = 6927416776679265070L;
        ge.ioxt[296] = -6743935053542930291L;
        ge.ioxt[297] = -8460187993866458360L;
        ge.ioxt[298] = 5866008703200703580L;
        ge.ioxt[299] = -7338417506479276721L;
    }

    private static /* synthetic */ void itts() {
        ge.ioxd[100] = -31116286;
        ge.ioxd[101] = -456663852;
        ge.ioxd[102] = -296196156;
        ge.ioxd[103] = -1505904979;
        ge.ioxd[104] = -1924686724;
        ge.ioxd[105] = 1737793471;
        ge.ioxd[106] = 474407155;
        ge.ioxd[107] = -150012195;
        ge.ioxd[108] = 1392888634;
        ge.ioxd[109] = -1243273589;
        ge.ioxd[110] = -761869377;
        ge.ioxd[111] = 326859890;
        ge.ioxd[112] = -2114259719;
        ge.ioxd[113] = 494884280;
        ge.ioxd[114] = -43009663;
        ge.ioxd[115] = 185891405;
        ge.ioxd[116] = -1261786229;
        ge.ioxd[117] = -1128451677;
        ge.ioxd[118] = -1887300571;
        ge.ioxd[119] = 1099089280;
        ge.ioxd[120] = 1290212772;
        ge.ioxd[121] = 1116412864;
        ge.ioxd[122] = 520244254;
        ge.ioxd[123] = -441289161;
        ge.ioxd[124] = 1893879793;
        ge.ioxd[125] = 1515727106;
        ge.ioxd[126] = 1616490479;
        ge.ioxd[127] = -161464518;
        ge.ioxd[128] = -840608624;
        ge.ioxd[129] = 343226804;
        ge.ioxd[130] = 1353213546;
        ge.ioxd[131] = -1465738799;
        ge.ioxd[132] = 681083740;
        ge.ioxd[133] = -776473236;
        ge.ioxd[134] = 1907963439;
        ge.ioxd[135] = -1638805512;
        ge.ioxd[136] = -586715460;
        ge.ioxd[137] = 352882615;
        ge.ioxd[138] = 1496136851;
        ge.ioxd[139] = 77212410;
        ge.ioxd[140] = 693058764;
        ge.ioxd[141] = -1172130955;
        ge.ioxd[142] = -1195045239;
        ge.ioxd[143] = -2055539747;
        ge.ioxd[144] = -1688603876;
        ge.ioxd[145] = -733277141;
        ge.ioxd[146] = 670833189;
        ge.ioxd[147] = 2023133996;
        ge.ioxd[148] = 2103969585;
        ge.ioxd[149] = 1942054990;
        ge.ioxd[150] = 1259949460;
        ge.ioxd[151] = -63381805;
        ge.ioxd[152] = -1377148772;
        ge.ioxd[153] = -1377745982;
        ge.ioxd[154] = -1221674675;
        ge.ioxd[155] = 1423565390;
        ge.ioxd[156] = -2093881273;
        ge.ioxd[157] = 1125619357;
        ge.ioxd[158] = 3449222;
        ge.ioxd[159] = -280853246;
        ge.ioxd[160] = -1095223023;
        ge.ioxd[161] = -1544891345;
        ge.ioxd[162] = -1606438168;
        ge.ioxd[163] = 871019242;
        ge.ioxd[164] = -739621475;
        ge.ioxd[165] = -575666618;
        ge.ioxd[166] = 714690181;
        ge.ioxd[167] = -1182864522;
        ge.ioxd[168] = -610859161;
        ge.ioxd[169] = 1885819053;
        ge.ioxd[170] = 779886857;
        ge.ioxd[171] = -1158325585;
        ge.ioxd[172] = 884050711;
        ge.ioxd[173] = 1306437878;
        ge.ioxd[174] = 1789294895;
        ge.ioxd[175] = -780607330;
        ge.ioxd[176] = 1580658201;
        ge.ioxd[177] = 1591854713;
        ge.ioxd[178] = 1343689079;
        ge.ioxd[179] = 1173531374;
        ge.ioxd[180] = 704520557;
        ge.ioxd[181] = 1110085276;
        ge.ioxd[182] = 375406869;
        ge.ioxd[183] = 794903760;
        ge.ioxd[184] = 1044415931;
        ge.ioxd[185] = 1781891411;
        ge.ioxd[186] = -901199828;
        ge.ioxd[187] = 2092319006;
        ge.ioxd[188] = 2015613399;
        ge.ioxd[189] = -1874434215;
        ge.ioxd[190] = -900421205;
        ge.ioxd[191] = -2103145024;
        ge.ioxd[192] = 910840725;
        ge.ioxd[193] = -381346165;
        ge.ioxd[194] = 1852804779;
        ge.ioxd[195] = 1348540968;
        ge.ioxd[196] = 754065986;
        ge.ioxd[197] = 256366678;
        ge.ioxd[198] = 1120565966;
        ge.ioxd[199] = -42496887;
    }

    private static /* synthetic */ void itug() {
        ge.ioxu[0] = 1833003276393915707L;
        ge.ioxu[1] = -6588568673375888794L;
        ge.ioxu[2] = -8526625406639727801L;
        ge.ioxu[3] = -7427274284223767117L;
        ge.ioxu[4] = -6922209216719096145L;
        ge.ioxu[5] = -5817793199097751289L;
        ge.ioxu[6] = -6583896066201010056L;
        ge.ioxu[7] = -2907064907516882157L;
        ge.ioxu[8] = 6418084140357044309L;
        ge.ioxu[9] = -1341310503376002199L;
        ge.ioxu[10] = -2756695177236285504L;
        ge.ioxu[11] = 4762940686436996499L;
        ge.ioxu[12] = -300955314852170864L;
        ge.ioxu[13] = 5365858684983639307L;
        ge.ioxu[14] = 3836929780713162091L;
        ge.ioxu[15] = 7055143825970512235L;
        ge.ioxu[16] = 3169728348454535779L;
        ge.ioxu[17] = -4190686013944173509L;
        ge.ioxu[18] = -1276442501248211746L;
        ge.ioxu[19] = -5167207660699751434L;
        ge.ioxu[20] = 8468544996406076377L;
        ge.ioxu[21] = 7255976583983942518L;
        ge.ioxu[22] = -1300099361696198684L;
        ge.ioxu[23] = -2205256584028699515L;
        ge.ioxu[24] = 2084031655055779041L;
        ge.ioxu[25] = -274811461094420988L;
        ge.ioxu[26] = 6286881800591600804L;
        ge.ioxu[27] = 7030919450655278356L;
        ge.ioxu[28] = -5574448992563240301L;
        ge.ioxu[29] = -7875304476074230401L;
        ge.ioxu[30] = -7678944424085730507L;
        ge.ioxu[31] = 716800287534696320L;
        ge.ioxu[32] = -2755752176097083224L;
        ge.ioxu[33] = 857575148724026564L;
        ge.ioxu[34] = -7121120003002358073L;
        ge.ioxu[35] = 6296610854593017503L;
        ge.ioxu[36] = -6026112778652163710L;
        ge.ioxu[37] = 1266130180048926833L;
        ge.ioxu[38] = 2423880491501036468L;
        ge.ioxu[39] = -3649690052098704436L;
        ge.ioxu[40] = -487034884132208450L;
        ge.ioxu[41] = 4173384163634155817L;
        ge.ioxu[42] = 3092094424174765262L;
        ge.ioxu[43] = -5539095577442444685L;
        ge.ioxu[44] = 606415154303397696L;
        ge.ioxu[45] = 6049492500115785230L;
        ge.ioxu[46] = 1142445537031999296L;
        ge.ioxu[47] = -4162207090554452301L;
        ge.ioxu[48] = -8560329686847432712L;
        ge.ioxu[49] = -568746937037375657L;
        ge.ioxu[50] = 1072523188853299655L;
        ge.ioxu[51] = 4274765879777264596L;
        ge.ioxu[52] = -8378771539090969650L;
        ge.ioxu[53] = 3297230728398521981L;
        ge.ioxu[54] = 289980852912777784L;
        ge.ioxu[55] = -7204524254284641186L;
        ge.ioxu[56] = -2077972435813718300L;
        ge.ioxu[57] = 6277404331970345671L;
        ge.ioxu[58] = 3077682742303158682L;
        ge.ioxu[59] = -7027899288524141714L;
        ge.ioxu[60] = 8976544114480491766L;
        ge.ioxu[61] = -4760831073013744392L;
        ge.ioxu[62] = 7156114397526772340L;
        ge.ioxu[63] = 8498779660188250657L;
        ge.ioxu[64] = 3227451629218712875L;
        ge.ioxu[65] = -495265794366464189L;
        ge.ioxu[66] = -3035733851238712002L;
        ge.ioxu[67] = 5111967106909731543L;
        ge.ioxu[68] = -8220631948520512176L;
        ge.ioxu[69] = 1514991023237151239L;
        ge.ioxu[70] = -3522444070972427465L;
        ge.ioxu[71] = -140994750370364799L;
        ge.ioxu[72] = -2482847818101381747L;
        ge.ioxu[73] = -6638675140618337584L;
        ge.ioxu[74] = 3630805871991797857L;
        ge.ioxu[75] = -2401691469679250429L;
        ge.ioxu[76] = 1517748211600973235L;
        ge.ioxu[77] = -5874936568968568270L;
        ge.ioxu[78] = -5093075756612722818L;
        ge.ioxu[79] = 878762893435609196L;
        ge.ioxu[80] = 8698775202243996086L;
        ge.ioxu[81] = 5130930318126276217L;
        ge.ioxu[82] = 3186609360755634629L;
        ge.ioxu[83] = -8912791483061887941L;
        ge.ioxu[84] = -9149145476022277654L;
        ge.ioxu[85] = 3976866740203283139L;
        ge.ioxu[86] = -7017158589395642366L;
        ge.ioxu[87] = 6333409819698537688L;
        ge.ioxu[88] = 8496986936953722899L;
        ge.ioxu[89] = -5743251208064005939L;
        ge.ioxu[90] = -1798653299082165028L;
        ge.ioxu[91] = 4782265499186504863L;
        ge.ioxu[92] = 4338697082508057422L;
        ge.ioxu[93] = -2518672427773831255L;
        ge.ioxu[94] = 2256374533936826802L;
        ge.ioxu[95] = -2878342831012452741L;
        ge.ioxu[96] = 2540706845722883081L;
        ge.ioxu[97] = 2235441855637682574L;
        ge.ioxu[98] = -6676711849873084320L;
        ge.ioxu[99] = -9116304733152106509L;
    }

    private static /* synthetic */ void itue() {
        ge.ioxt[400] = 7538011435976217688L;
        ge.ioxt[401] = 3835821697057025426L;
        ge.ioxt[402] = 6926886153343795104L;
        ge.ioxt[403] = 6710777626260701136L;
        ge.ioxt[404] = -8072277257165623130L;
        ge.ioxt[405] = -8749957641342769875L;
        ge.ioxt[406] = 482036612558773749L;
        ge.ioxt[407] = -2374642528755215432L;
        ge.ioxt[408] = -6165062736791509372L;
        ge.ioxt[409] = 3369402495329602108L;
        ge.ioxt[410] = -57982839885857691L;
        ge.ioxt[411] = 7890221376101398099L;
        ge.ioxt[412] = 7879264968026806553L;
        ge.ioxt[413] = -3187892041220926024L;
        ge.ioxt[414] = 513427801468290007L;
        ge.ioxt[415] = 4140274949099197053L;
        ge.ioxt[416] = -4560334606891157588L;
        ge.ioxt[417] = 8351195489236946946L;
        ge.ioxt[418] = 8041433777723695435L;
        ge.ioxt[419] = -4018686497114749200L;
        ge.ioxt[420] = 6454022370168844454L;
        ge.ioxt[421] = -7508769232651435797L;
        ge.ioxt[422] = 5338315702776882925L;
        ge.ioxt[423] = 2426036850329905121L;
        ge.ioxt[424] = 8659673950990992370L;
        ge.ioxt[425] = -2274164551146817907L;
        ge.ioxt[426] = -603065986549526746L;
        ge.ioxt[427] = 7995025052699602013L;
        ge.ioxt[428] = -1010480904560293119L;
        ge.ioxt[429] = 2552212781206168576L;
        ge.ioxt[430] = 18524357046199330L;
        ge.ioxt[431] = -5388124895546531400L;
        ge.ioxt[432] = -7681047477812308379L;
        ge.ioxt[433] = 7749357501451261468L;
        ge.ioxt[434] = 6547285650227956565L;
        ge.ioxt[435] = -5214795836157809787L;
        ge.ioxt[436] = -2379102269979591369L;
        ge.ioxt[437] = 2003126565371296756L;
        ge.ioxt[438] = 1659999955337111274L;
        ge.ioxt[439] = 4113079444114077872L;
        ge.ioxt[440] = 4258485438030393203L;
        ge.ioxt[441] = -6653439946900947578L;
        ge.ioxt[442] = -122911200995757086L;
        ge.ioxt[443] = -5441975556151593778L;
        ge.ioxt[444] = -4691836491684597732L;
        ge.ioxt[445] = -1592257730729185178L;
        ge.ioxt[446] = 8180312379260559938L;
        ge.ioxt[447] = 6549103845758714324L;
        ge.ioxt[448] = -7063346208325677977L;
        ge.ioxt[449] = -4565358772158679298L;
        ge.ioxt[450] = 2540876914961539374L;
        ge.ioxt[451] = 8569140605092295472L;
        ge.ioxt[452] = -4301866621749673764L;
        ge.ioxt[453] = -6766078960244417282L;
        ge.ioxt[454] = 4945515969846319593L;
        ge.ioxt[455] = -4812077628687413024L;
        ge.ioxt[456] = -4718104546875279772L;
        ge.ioxt[457] = -4248938454492849151L;
        ge.ioxt[458] = 6780307297600874734L;
        ge.ioxt[459] = -2952962533472237423L;
        ge.ioxt[460] = 8149587387331421699L;
        ge.ioxt[461] = 6886937748911174964L;
        ge.ioxt[462] = -3502272775944151796L;
        ge.ioxt[463] = -1124291706342611172L;
        ge.ioxt[464] = 3002900855679502569L;
        ge.ioxt[465] = -5121521547143979018L;
        ge.ioxt[466] = 3080023882941545198L;
        ge.ioxt[467] = 4735626112795054580L;
        ge.ioxt[468] = -6857433796486648854L;
        ge.ioxt[469] = 4585639276087840358L;
        ge.ioxt[470] = -6710330466616900314L;
        ge.ioxt[471] = -6595537785072449188L;
        ge.ioxt[472] = 3417670395339873110L;
        ge.ioxt[473] = 4140728832464586398L;
        ge.ioxt[474] = 8777659779534184742L;
        ge.ioxt[475] = 8772563263529214928L;
        ge.ioxt[476] = -127477987681721104L;
        ge.ioxt[477] = -2165064866774467727L;
        ge.ioxt[478] = -8827523422173908497L;
        ge.ioxt[479] = -4886251961132096866L;
        ge.ioxt[480] = -5767044813848517399L;
        ge.ioxt[481] = 23649864157939087L;
        ge.ioxt[482] = -717081332650487544L;
        ge.ioxt[483] = 3742386510849654166L;
        ge.ioxt[484] = -813808953293324410L;
        ge.ioxt[485] = 7053786487400432716L;
        ge.ioxt[486] = 6158746942810881987L;
        ge.ioxt[487] = -201378624107588757L;
        ge.ioxt[488] = 8537510872834322579L;
        ge.ioxt[489] = 8824041249264419693L;
        ge.ioxt[490] = 8276406560652132369L;
        ge.ioxt[491] = -8030385698594777833L;
        ge.ioxt[492] = -2394531570322395100L;
        ge.ioxt[493] = 1812307287948992058L;
        ge.ioxt[494] = 7912584606661206629L;
        ge.ioxt[495] = 6094700952114314364L;
        ge.ioxt[496] = 5148893800194090750L;
        ge.ioxt[497] = 6872309406104542361L;
        ge.ioxt[498] = -489952415230701623L;
        ge.ioxt[499] = 4786242322994870696L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 findPos() {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block60: while (true) {
            v0 /* !! */  = (long)(v1 - ge.ioxe("irip", ioxs(int ), (int)413));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -933200536: {
                    v1 = ge.ioxe("iriq", ioxs(int ), (int)414);
                    continue block60;
                }
                case -239756314: {
                    break block60;
                }
                case 1934333852: {
                    v1 = ge.ioxe("irir", ioxs(int ), (int)415);
                    continue block60;
                }
            }
            break;
        }
        var4_1 = ge.c;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl19
        block61: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("iris", ioxs(int ), (int)416));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1504021948: {
                    v3 = ge.ioxe("irit", ioxs(int ), (int)417);
                    continue block61;
                }
                case -999896219: {
                    v3 = ge.ioxe("iriu", ioxs(int ), (int)418);
                    continue block61;
                }
                case -239756314: {
                    break block61;
                }
                case -231961374: {
                    v3 = ge.ioxe("iriv", ioxs(int ), (int)419);
                    continue block61;
                }
            }
            break;
        }
        var3_2 /* !! */  = ge.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iriw", ioxs(int ), (int)420)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ge.ioxe("irix", ioxa(int ), (int)705)) break;
            v4 /* !! */  = (long)ge.ioxe("iriy", ioxa(int ), (int)706);
        }
        var2_3 = ge.a;
        if (var4_1) {
            throw null;
lbl40:
            // 4 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iriz", ioxs(int ), (int)421)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ge.ioxe("irja", ioxa(int ), (int)707)) break;
            v5 /* !! */  = (long)ge.ioxe("irjb", ioxa(int ), (int)708);
        }
        var1_4 = this.getBlockPos();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl40
                v6 /* !! */  = ge.qc;
                if (true) ** GOTO lbl57
                block65: while (true) {
                    v6 /* !! */  = (long)(ge.ioxe("irjd", ioxs(int ), (int)423) - ge.ioxe("irjc", ioxs(int ), (int)422));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -239756314: {
                            break block65;
                        }
                        case 1042029919: {
                            continue block65;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ge.qc;
                if (true) ** GOTO lbl66
                block66: while (true) {
                    v7 /* !! */  = (long)(ge.ioxe("irjf", ioxs(int ), (int)425) - ge.ioxe("irje", ioxs(int ), (int)424));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -239756314: {
                            break block66;
                        }
                        case 1380690622: {
                            continue block66;
                        }
                    }
                    break;
                }
                v8 = ge.mc.field_1687;
                v9 /* !! */  = ge.qc;
                if (true) ** GOTO lbl76
                block67: while (true) {
                    v9 /* !! */  = (long)(ge.ioxe("irjh", ioxs(int ), (int)427) - ge.ioxe("irjg", ioxs(int ), (int)426));
lbl76:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -239756314: {
                            break block67;
                        }
                        case 1606904428: {
                            continue block67;
                        }
                    }
                    break;
                }
                v10 = v8.method_8320(var1_4);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irji", ioxs(int ), (int)428)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ge.ioxe("irjj", ioxa(int ), (int)709)) break;
                    v11 /* !! */  = (long)ge.ioxe("irjk", ioxa(int ), (int)710);
                }
                if (!v10.method_51367()) ** GOTO lbl99
                if (var2_3) ** GOTO lbl40
                v12 /* !! */  = ge.qc;
                if (true) ** GOTO lbl93
                block69: while (true) {
                    v12 /* !! */  = (long)(ge.ioxe("irjm", ioxs(int ), (int)430) - ge.ioxe("irjl", ioxs(int ), (int)429));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -239756314: {
                            break block69;
                        }
                        case 746563402: {
                            continue block69;
                        }
                    }
                    break;
                }
                return class_2338.field_10980;
lbl99:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                v13 = new class_2338[4];
                v14 = ge.ioxe("irjn", ioxa(int ), (int)711);
                while (true) {
                    if ((v15 = (cfr_temp_3 = ge.qc - ge.ioxe("irjo", ioxs(int ), (int)431)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 == ge.ioxe("irjp", ioxa(int ), (int)712)) break;
                    v15 = 1961487882;
                }
                v13[v14] = var1_4.method_10067();
                v16 = ge.ioxe("irjq", ioxa(int ), (int)713);
                while (true) {
                    if ((v17 = (cfr_temp_4 = ge.qc - ge.ioxe("irjr", ioxs(int ), (int)432)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 == ge.ioxe("irjs", ioxa(int ), (int)714)) break;
                    v17 = -2108205919;
                }
                v13[v16] = var1_4.method_10078();
                v18 = ge.ioxe("irjt", ioxa(int ), (int)715);
                v19 /* !! */  = ge.qc;
                if (true) ** GOTO lbl121
                block72: while (true) {
                    v19 /* !! */  = (long)(ge.ioxe("irjv", ioxs(int ), (int)434) - ge.ioxe("irju", ioxs(int ), (int)433));
lbl121:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -785371896: {
                            continue block72;
                        }
                        case -239756314: {
                            break block72;
                        }
                    }
                    break;
                }
                v13[v18] = var1_4.method_10072();
                v20 = ge.ioxe("irjw", ioxa(int ), (int)716);
                v21 /* !! */  = ge.qc;
                if (true) ** GOTO lbl132
                block73: while (true) {
                    v21 /* !! */  = (long)(v22 - ge.ioxe("irjx", ioxs(int ), (int)435));
lbl132:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -239756314: {
                            break block73;
                        }
                        case -53260458: {
                            v22 = ge.ioxe("irjy", ioxs(int ), (int)436);
                            continue block73;
                        }
                        case 919006909: {
                            v22 = ge.ioxe("irjz", ioxs(int ), (int)437);
                            continue block73;
                        }
                        case 1085747298: {
                            v22 = ge.ioxe("irka", ioxs(int ), (int)438);
                            continue block73;
                        }
                    }
                    break;
                }
                v13[v20] = var1_4.method_10095();
                v23 /* !! */  = ge.qc;
                if (true) ** GOTO lbl149
                block74: while (true) {
                    v23 /* !! */  = (long)(v24 - ge.ioxe("irkb", ioxs(int ), (int)439));
lbl149:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1875173286: {
                            v24 = ge.ioxe("irkc", ioxs(int ), (int)440);
                            continue block74;
                        }
                        case -976508438: {
                            v24 = ge.ioxe("irkd", ioxs(int ), (int)441);
                            continue block74;
                        }
                        case -239756314: {
                            break block74;
                        }
                        case 446270755: {
                            v24 = ge.ioxe("irke", ioxs(int ), (int)442);
                            continue block74;
                        }
                    }
                    break;
                }
                v25 = Stream.of(v13);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("irkf", ioxs(int ), (int)443)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ge.ioxe("irkg", ioxa(int ), (int)717)) break;
                    v26 /* !! */  = (long)ge.ioxe("irkh", ioxa(int ), (int)718);
                }
                v27 = (Predicate<class_2338>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findPos$0(net.minecraft.class_2338 ), (Lnet/minecraft/class_2338;)Z)();
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("irki", ioxs(int ), (int)444)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ge.ioxe("irkj", ioxa(int ), (int)719)) break;
                    v28 /* !! */  = (long)ge.ioxe("irkk", ioxa(int ), (int)720);
                }
                v29 = v25.filter(v27);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("irkl", ioxs(int ), (int)445)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == ge.ioxe("irkm", ioxa(int ), (int)721)) break;
                    v30 /* !! */  = (long)ge.ioxe("irkn", ioxa(int ), (int)722);
                }
                v31 = v29.findFirst();
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("irko", ioxs(int ), (int)446)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == ge.ioxe("irkp", ioxa(int ), (int)723)) break;
                    v32 /* !! */  = (long)ge.ioxe("irkq", ioxa(int ), (int)724);
                }
                v33 /* !! */  = ge.qc;
                if (true) ** GOTO lbl189
                block79: while (true) {
                    v33 /* !! */  = (long)(v34 - ge.ioxe("irkr", ioxs(int ), (int)447));
lbl189:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1430676349: {
                            v34 = ge.ioxe("irks", ioxs(int ), (int)448);
                            continue block79;
                        }
                        case -495637368: {
                            v34 = ge.ioxe("irkt", ioxs(int ), (int)449);
                            continue block79;
                        }
                        case -239756314: {
                            break block79;
                        }
                    }
                    break;
                }
                return v31.orElse(class_2338.field_10980);
            }
lbl199:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ge.ioxe("irku", ioxa(int ), (int)725);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl210
                    break;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)ge.ioxe("irkv", ioxa(int ), (int)726);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl210:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ge.ioxe("irkw", ioxa(int ), (int)727);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 3: {
                var3_2 /* !! */  = (int)ge.ioxe("irkx", ioxa(int ), (int)728);
                if (!var4_1) break;
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)ge.ioxe("irky", ioxa(int ), (int)729);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 5: {
                var3_2 /* !! */  = (int)ge.ioxe("irkz", ioxa(int ), (int)730);
                if (!var4_1) ** GOTO lbl199
                throw null;
            }
lbl228:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)ge.ioxe("irla", ioxa(int ), (int)731);
                if (!var4_1) break;
                throw null;
            }
lbl232:
            // 2 sources

            case 7: {
                do {
                    var3_2 /* !! */  = (int)ge.ioxe("irlb", ioxa(int ), (int)732);
                } while (!var4_1);
                throw null;
            }
lbl237:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)ge.ioxe("irlc", ioxa(int ), (int)733);
                if (!var4_1) break;
                throw null;
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)ge.ioxe("irld", ioxa(int ), (int)734);
        ** while (!var4_1)
lbl244:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void placeBlockAt(class_2338 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iqio", ioxs(int ), (int)155)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("iqip", ioxa(int ), (int)287)) break;
            v0 /* !! */  = (long)ge.ioxe("iqiq", ioxa(int ), (int)288);
        }
        var6_2 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iqir", ioxs(int ), (int)156)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("iqis", ioxa(int ), (int)289)) break;
            v1 /* !! */  = (long)ge.ioxe("iqit", ioxa(int ), (int)290);
        }
        var5_3 /* !! */  = ge.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("iqiu", ioxs(int ), (int)157)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ge.ioxe("iqiv", ioxa(int ), (int)291)) break;
            v2 /* !! */  = (long)ge.ioxe("iqiw", ioxa(int ), (int)292);
        }
        var4_4 = ge.a;
        if (var6_2) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iqix", ioxs(int ), (int)158)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ge.ioxe("iqiy", ioxa(int ), (int)293)) break;
            v3 /* !! */  = (long)ge.ioxe("iqiz", ioxa(int ), (int)294);
        }
        var2_5 = class_243.method_24953((class_2382)var1_1);
        if (var4_4 || var4_4) ** GOTO lbl21
        v4 /* !! */  = ge.qc;
        if (true) ** GOTO lbl35
        block50: while (true) {
            v4 /* !! */  = (long)(v5 - ge.ioxe("iqja", ioxs(int ), (int)159));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -239756314: {
                    break block50;
                }
                case 406355665: {
                    v5 = ge.ioxe("iqjb", ioxs(int ), (int)160);
                    continue block50;
                }
                case 1590809085: {
                    v5 = ge.ioxe("iqjc", ioxs(int ), (int)161);
                    continue block50;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("iqjd", ioxs(int ), (int)162)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ge.ioxe("iqje", ioxa(int ), (int)295)) break;
            v6 /* !! */  = (long)ge.ioxe("iqjf", ioxa(int ), (int)296);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("iqjg", ioxs(int ), (int)163)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ge.ioxe("iqjh", ioxa(int ), (int)297)) break;
            v7 /* !! */  = (long)ge.ioxe("iqji", ioxa(int ), (int)298);
        }
        v8 = var1_1.method_10074();
        v9 = ge.ioxe("iqjj", ioxa(int ), (int)299);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("iqjk", ioxs(int ), (int)164)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ge.ioxe("iqjl", ioxa(int ), (int)300)) break;
            v10 /* !! */  = (long)ge.ioxe("iqjm", ioxa(int ), (int)301);
        }
        var3_6 = new class_3965(var2_5, class_2350.field_11036, v8, (boolean)v9);
        if (var4_4 || var4_4) ** GOTO lbl21
        v11 /* !! */  = ge.qc;
        if (true) ** GOTO lbl67
        block54: while (true) {
            v11 /* !! */  = (long)(v12 - ge.ioxe("iqjn", ioxs(int ), (int)165));
lbl67:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -788114096: {
                    v12 = ge.ioxe("iqjo", ioxs(int ), (int)166);
                    continue block54;
                }
                case -239756314: {
                    break block54;
                }
                case 2083571790: {
                    v12 = ge.ioxe("iqjp", ioxs(int ), (int)167);
                    continue block54;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iqjq", ioxs(int ), (int)168)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ge.ioxe("iqjr", ioxa(int ), (int)302)) break;
            v13 /* !! */  = (long)ge.ioxe("iqjs", ioxa(int ), (int)303);
        }
        v14 = ge.mc.field_1761;
        v15 /* !! */  = ge.qc;
        if (true) ** GOTO lbl86
        block56: while (true) {
            v15 /* !! */  = (long)(v16 - ge.ioxe("iqjt", ioxs(int ), (int)169));
lbl86:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -767257825: {
                    v16 = ge.ioxe("iqju", ioxs(int ), (int)170);
                    continue block56;
                }
                case -239756314: {
                    break block56;
                }
                case 356150304: {
                    v16 = ge.ioxe("iqjv", ioxs(int ), (int)171);
                    continue block56;
                }
                case 1005149712: {
                    v16 = ge.ioxe("iqjw", ioxs(int ), (int)172);
                    continue block56;
                }
            }
            break;
        }
        v17 /* !! */  = ge.qc;
        if (true) ** GOTO lbl102
        block57: while (true) {
            v17 /* !! */  = (long)(ge.ioxe("iqjy", ioxs(int ), (int)174) - ge.ioxe("iqjx", ioxs(int ), (int)173));
lbl102:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -239756314: {
                    break block57;
                }
                case 1660290405: {
                    continue block57;
                }
            }
            break;
        }
        v18 = ge.mc.field_1724;
        v19 /* !! */  = ge.qc;
        if (true) ** GOTO lbl112
        block58: while (true) {
            v19 /* !! */  = (long)(v20 - ge.ioxe("iqjz", ioxs(int ), (int)175));
lbl112:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -256166357: {
                    v20 = ge.ioxe("iqka", ioxs(int ), (int)176);
                    continue block58;
                }
                case -239756314: {
                    break block58;
                }
                case -165906579: {
                    v20 = ge.ioxe("iqkb", ioxs(int ), (int)177);
                    continue block58;
                }
                case 903105518: {
                    v20 = ge.ioxe("iqkc", ioxs(int ), (int)178);
                    continue block58;
                }
            }
            break;
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("iqkd", ioxs(int ), (int)179)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == ge.ioxe("iqke", ioxa(int ), (int)304)) break;
            v21 /* !! */  = (long)ge.ioxe("iqkf", ioxa(int ), (int)305);
        }
        v14.method_2896(v18, class_1268.field_5808, var3_6);
        if (var4_4) ** GOTO lbl21
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl21
                v22 /* !! */  = ge.qc;
                if (true) ** GOTO lbl139
                block60: while (true) {
                    v22 /* !! */  = (long)(v23 - ge.ioxe("iqkg", ioxs(int ), (int)180));
lbl139:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -239756314: {
                            break block60;
                        }
                        case 869633665: {
                            v23 = ge.ioxe("iqkh", ioxs(int ), (int)181);
                            continue block60;
                        }
                        case 1047322094: {
                            v23 = ge.ioxe("iqki", ioxs(int ), (int)182);
                            continue block60;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_9 = ge.qc - ge.ioxe("iqkj", ioxs(int ), (int)183)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ge.ioxe("iqkk", ioxa(int ), (int)306)) break;
                    v24 /* !! */  = (long)ge.ioxe("iqkl", ioxa(int ), (int)307);
                }
                v25 = ge.mc.field_1724;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_10 = ge.qc - ge.ioxe("iqkm", ioxs(int ), (int)184)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ge.ioxe("iqkn", ioxa(int ), (int)308)) break;
                    v26 /* !! */  = (long)ge.ioxe("iqko", ioxa(int ), (int)309);
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_11 = ge.qc - ge.ioxe("iqkp", ioxs(int ), (int)185)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ge.ioxe("iqkq", ioxa(int ), (int)310)) break;
                    v27 /* !! */  = (long)ge.ioxe("iqkr", ioxa(int ), (int)311);
                }
                v25.method_6104(class_1268.field_5808);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl168:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ge.ioxe("iqks", ioxa(int ), (int)312);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl178
                    break;
                }
            }
lbl174:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ge.ioxe("iqkt", ioxa(int ), (int)313);
                if (!var6_2) break;
                throw null;
            }
lbl178:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)ge.ioxe("iqku", ioxa(int ), (int)314);
                if (!var6_2) ** GOTO lbl168
                throw null;
            }
            case 3: {
                var5_3 /* !! */  = (int)ge.ioxe("iqkv", ioxa(int ), (int)315);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 4: {
                var5_3 /* !! */  = (int)ge.ioxe("iqkw", ioxa(int ), (int)316);
                if (!var6_2) ** GOTO lbl178
                throw null;
            }
            case 5: {
                var5_3 /* !! */  = (int)ge.ioxe("iqkx", ioxa(int ), (int)317);
                if (var6_2) {
                    throw null;
                }
            }
lbl195:
            // 4 sources

            case 6: {
                var5_3 /* !! */  = (int)ge.ioxe("iqky", ioxa(int ), (int)318);
                if (!var6_2) break;
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)ge.ioxe("iqkz", ioxa(int ), (int)319);
                if (!var6_2) ** GOTO lbl195
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)ge.ioxe("iqla", ioxa(int ), (int)320);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
lbl207:
            // 3 sources

            case 9: {
                do {
                    var5_3 /* !! */  = (int)ge.ioxe("iqlb", ioxa(int ), (int)321);
                } while (!var6_2);
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)ge.ioxe("iqlc", ioxa(int ), (int)322);
                if (!var6_2) ** GOTO lbl207
                throw null;
            }
            case 11: 
        }
        var5_3 /* !! */  = (int)ge.ioxe("iqld", ioxa(int ), (int)323);
        ** while (!var6_2)
lbl219:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void itty() {
        ge.ioxd[700] = -1789057326;
        ge.ioxd[701] = 1422482259;
        ge.ioxd[702] = -1094013948;
        ge.ioxd[703] = 1104143240;
        ge.ioxd[704] = -1292686384;
        ge.ioxd[705] = -1576267039;
        ge.ioxd[706] = -2010659266;
        ge.ioxd[707] = 1714108097;
        ge.ioxd[708] = 2004679274;
        ge.ioxd[709] = 1158389806;
        ge.ioxd[710] = 1184783059;
        ge.ioxd[711] = -950671177;
        ge.ioxd[712] = -1710367282;
        ge.ioxd[713] = 1821323515;
        ge.ioxd[714] = 302311413;
        ge.ioxd[715] = 1435528981;
        ge.ioxd[716] = -1909678968;
        ge.ioxd[717] = -1136060591;
        ge.ioxd[718] = 1804693370;
        ge.ioxd[719] = 1107124849;
        ge.ioxd[720] = -1681160015;
        ge.ioxd[721] = 731872273;
        ge.ioxd[722] = -2069542180;
        ge.ioxd[723] = 827198159;
        ge.ioxd[724] = -73534153;
        ge.ioxd[725] = 1060752368;
        ge.ioxd[726] = 1055359085;
        ge.ioxd[727] = -664245411;
        ge.ioxd[728] = -1195074359;
        ge.ioxd[729] = -1143295568;
        ge.ioxd[730] = -1305684707;
        ge.ioxd[731] = 697390361;
        ge.ioxd[732] = -642063125;
        ge.ioxd[733] = 680324115;
        ge.ioxd[734] = 764024526;
        ge.ioxd[735] = -127321551;
        ge.ioxd[736] = 1173518737;
        ge.ioxd[737] = -1115124610;
        ge.ioxd[738] = 882802057;
        ge.ioxd[739] = 135890425;
        ge.ioxd[740] = -1804080252;
        ge.ioxd[741] = 1143267548;
        ge.ioxd[742] = 1495386514;
        ge.ioxd[743] = -409823255;
        ge.ioxd[744] = -1686794181;
        ge.ioxd[745] = 1831073658;
        ge.ioxd[746] = 858386062;
        ge.ioxd[747] = 1139040033;
        ge.ioxd[748] = -2142843961;
        ge.ioxd[749] = 1183847929;
        ge.ioxd[750] = 1742495258;
        ge.ioxd[751] = -1323601240;
        ge.ioxd[752] = 35047049;
        ge.ioxd[753] = -2093353212;
        ge.ioxd[754] = 224286870;
        ge.ioxd[755] = 376552619;
        ge.ioxd[756] = -1762053123;
        ge.ioxd[757] = 1161681561;
        ge.ioxd[758] = -1890799114;
        ge.ioxd[759] = -903320762;
        ge.ioxd[760] = 353501089;
        ge.ioxd[761] = 1011083280;
        ge.ioxd[762] = 1396519568;
        ge.ioxd[763] = -59176450;
        ge.ioxd[764] = -1665808437;
        ge.ioxd[765] = -1974637688;
        ge.ioxd[766] = -1347745429;
        ge.ioxd[767] = -1997542858;
        ge.ioxd[768] = -1355302394;
        ge.ioxd[769] = 2109227534;
        ge.ioxd[770] = -1488958182;
        ge.ioxd[771] = 471924393;
        ge.ioxd[772] = 234556154;
        ge.ioxd[773] = -287582821;
        ge.ioxd[774] = 1862219345;
        ge.ioxd[775] = -1526208849;
        ge.ioxd[776] = 379494131;
        ge.ioxd[777] = 569168516;
        ge.ioxd[778] = 482003985;
        ge.ioxd[779] = -1703653648;
        ge.ioxd[780] = 1406183587;
        ge.ioxd[781] = 1797810991;
        ge.ioxd[782] = 756983525;
        ge.ioxd[783] = -1858365366;
        ge.ioxd[784] = -218218993;
        ge.ioxd[785] = 600584399;
        ge.ioxd[786] = 577971239;
        ge.ioxd[787] = -1899759030;
        ge.ioxd[788] = 311199152;
        ge.ioxd[789] = -624548654;
        ge.ioxd[790] = -1518525510;
        ge.ioxd[791] = 2045983830;
        ge.ioxd[792] = -1911403506;
        ge.ioxd[793] = -1282979439;
        ge.ioxd[794] = -643815148;
        ge.ioxd[795] = 249685517;
        ge.ioxd[796] = 696550743;
        ge.ioxd[797] = 1578927999;
        ge.ioxd[798] = 133375763;
        ge.ioxd[799] = -569796368;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getLastSlot() {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ge.ioxe("irsl", ioxs(int ), (int)551));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1244528391: {
                    v1 = ge.ioxe("irsm", ioxs(int ), (int)552);
                    continue block21;
                }
                case -682458528: {
                    v1 = ge.ioxe("irsn", ioxs(int ), (int)553);
                    continue block21;
                }
                case -239756314: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = ge.c;
        v2 /* !! */  = ge.qc;
        block22: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -239756314: {
                    break block22;
                }
                case 1607143340: {
                    v2 /* !! */  = (long)(ge.ioxe("irsp", ioxs(int ), (int)555) - ge.ioxe("irso", ioxs(int ), (int)554));
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ge.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irsq", ioxs(int ), (int)556)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ge.ioxe("irsr", ioxa(int ), (int)823)) {
                var1_3 = ge.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ge.ioxe("irss", ioxa(int ), (int)824);
        }
        if (var1_3 != false) return (int)ge.ioxe("irst", ioxa(int ), (int)825);
        if (var1_3 != false) return (int)ge.ioxe("irst", ioxa(int ), (int)825);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v4 /* !! */  = ge.qc;
                    block25: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -2132636977: {
                                v5 = ge.ioxe("irsv", ioxs(int ), (int)558);
                                ** GOTO lbl54
                            }
                            case -333637569: {
                                v5 = ge.ioxe("irsw", ioxs(int ), (int)559);
                                ** GOTO lbl54
                            }
                            case -239756314: {
                                return this.lastSlot;
                            }
                            case 1902246751: {
                                v5 = ge.ioxe("irsx", ioxs(int ), (int)560);
lbl54:
                                // 3 sources

                                v4 /* !! */  = (long)(v5 - ge.ioxe("irsu", ioxs(int ), (int)557));
                                continue block25;
                            }
                        }
                        break;
                    }
                    return this.lastSlot;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ge.ioxe("irtb", ioxa(int ), (int)829);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)ge.ioxe("irsy", ioxa(int ), (int)826);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ge.ioxe("irsz", ioxa(int ), (int)827);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl74
            break;
        }
        do {
            if (true) ** continue;
lbl74:
            // 2 sources

            var2_2 /* !! */  = (int)ge.ioxe("irta", ioxa(int ), (int)828);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block56: {
            v0 /* !! */  = ge.qc;
            if (true) ** GOTO lbl5
            block38: while (true) {
                v0 /* !! */  = (long)(v1 - ge.ioxe("ipbd", ioxs(int ), (int)30));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -573339603: {
                        v1 = ge.ioxe("ipbe", ioxs(int ), (int)31);
                        continue block38;
                    }
                    case -239756314: {
                        break block38;
                    }
                    case 590459126: {
                        v1 = ge.ioxe("ipbf", ioxs(int ), (int)32);
                        continue block38;
                    }
                }
                break;
            }
            var3_1 = ge.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("ipbh", ioxs(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ge.ioxe("ipbi", ioxa(int ), (int)44)) break;
                v2 /* !! */  = (long)ge.ioxe("ipbj", ioxa(int ), (int)45);
            }
            var2_2 /* !! */  = ge.b;
            v3 /* !! */  = ge.qc;
            if (true) ** GOTO lbl25
            block40: while (true) {
                v3 /* !! */  = (long)(v4 - ge.ioxe("ipbk", ioxs(int ), (int)34));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1972200557: {
                        v4 = ge.ioxe("ipbm", ioxs(int ), (int)35);
                        continue block40;
                    }
                    case -239756314: {
                        break block40;
                    }
                    case 138397536: {
                        v4 = ge.ioxe("ipbn", ioxs(int ), (int)36);
                        continue block40;
                    }
                    case 147889659: {
                        v4 = ge.ioxe("ipbo", ioxs(int ), (int)37);
                        continue block40;
                    }
                }
                break;
            }
            var1_3 = ge.a;
            if (var3_1) {
                throw null;
lbl40:
                // 5 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v5 /* !! */  = ge.qc;
            if (true) ** GOTO lbl47
            block42: while (true) {
                v5 /* !! */  = (long)(v6 - ge.ioxe("ipbq", ioxs(int ), (int)38));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -940496697: {
                        v6 = ge.ioxe("ipbr", ioxs(int ), (int)39);
                        continue block42;
                    }
                    case -338779432: {
                        v6 = ge.ioxe("ipbs", ioxs(int ), (int)40);
                        continue block42;
                    }
                    case -239756314: {
                        break block42;
                    }
                    case -168110054: {
                        v6 = ge.ioxe("ipbt", ioxs(int ), (int)41);
                        continue block42;
                    }
                }
                break;
            }
            v7 /* !! */  = ge.qc;
            if (true) ** GOTO lbl63
            block43: while (true) {
                v7 /* !! */  = (long)(v8 - ge.ioxe("ipbv", ioxs(int ), (int)42));
lbl63:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1541635949: {
                        v8 = ge.ioxe("ipbw", ioxs(int ), (int)43);
                        continue block43;
                    }
                    case -239756314: {
                        break block43;
                    }
                    case 471178350: {
                        v8 = ge.ioxe("ipbx", ioxs(int ), (int)44);
                        continue block43;
                    }
                    case 1540131409: {
                        v8 = ge.ioxe("ipby", ioxs(int ), (int)45);
                        continue block43;
                    }
                }
                break;
            }
            if (!this.mode.isSelected("Slime Block")) break block56;
            if (var1_3 || var1_3) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("ipca", ioxs(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ge.ioxe("ipcb", ioxa(int ), (int)46)) break;
                v9 /* !! */  = (long)ge.ioxe("ipcc", ioxa(int ), (int)47);
            }
            v10 /* !! */  = ge.qc;
            if (true) ** GOTO lbl86
            block45: while (true) {
                v10 /* !! */  = (long)(ge.ioxe("ipcf", ioxs(int ), (int)48) - ge.ioxe("ipce", ioxs(int ), (int)47));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1406633409: {
                        continue block45;
                    }
                    case -239756314: {
                        break block45;
                    }
                }
                break;
            }
            v11 = ge.mc.field_1690;
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("ipch", ioxs(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ge.ioxe("ipcj", ioxa(int ), (int)48)) break;
                v12 /* !! */  = (long)ge.ioxe("ipck", ioxa(int ), (int)49);
            }
            v13 = v11.field_1903;
            v14 = ge.ioxe("ipcl", ioxa(int ), (int)50);
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("ipcm", ioxs(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == ge.ioxe("ipcn", ioxa(int ), (int)51)) break;
                v15 /* !! */  = (long)ge.ioxe("ipcp", ioxa(int ), (int)52);
            }
            v13.method_23481((boolean)v14);
            if (var1_3) ** GOTO lbl40
        }
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
lbl114:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ge.ioxe("ipcq", ioxa(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 1: {
                var2_2 /* !! */  = (int)ge.ioxe("ipcs", ioxa(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ge.ioxe("ipct", ioxa(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var2_2 /* !! */  = (int)ge.ioxe("ipcu", ioxa(int ), (int)56);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl132:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)ge.ioxe("ipcw", ioxa(int ), (int)57);
                if (!var3_1) break;
                throw null;
            }
lbl136:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ge.ioxe("ipcx", ioxa(int ), (int)58);
                    if (!var3_1) ** GOTO lbl132
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ge.ioxe("ipcy", ioxa(int ), (int)59);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl145:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ge.ioxe("ipda", ioxa(int ), (int)60);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ge.ioxe("ipdb", ioxa(int ), (int)61);
        ** while (!var3_1)
lbl152:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ittu() {
        ge.ioxd[300] = 291435286;
        ge.ioxd[301] = 381711394;
        ge.ioxd[302] = -1406129042;
        ge.ioxd[303] = 917350655;
        ge.ioxd[304] = -829263241;
        ge.ioxd[305] = -1384116197;
        ge.ioxd[306] = 1694065585;
        ge.ioxd[307] = 904652534;
        ge.ioxd[308] = 572920911;
        ge.ioxd[309] = 1837342538;
        ge.ioxd[310] = 1283332100;
        ge.ioxd[311] = 2011434476;
        ge.ioxd[312] = -1395119873;
        ge.ioxd[313] = 1531391738;
        ge.ioxd[314] = -200092210;
        ge.ioxd[315] = -1650455389;
        ge.ioxd[316] = -2088962633;
        ge.ioxd[317] = 250918840;
        ge.ioxd[318] = -763186903;
        ge.ioxd[319] = -431509200;
        ge.ioxd[320] = -1040336807;
        ge.ioxd[321] = 1289514814;
        ge.ioxd[322] = -1519808900;
        ge.ioxd[323] = 1681975984;
        ge.ioxd[324] = -1594840362;
        ge.ioxd[325] = 700584260;
        ge.ioxd[326] = 727169753;
        ge.ioxd[327] = 1962101747;
        ge.ioxd[328] = 1849736295;
        ge.ioxd[329] = -681964384;
        ge.ioxd[330] = -1592545731;
        ge.ioxd[331] = 1574049424;
        ge.ioxd[332] = 992880092;
        ge.ioxd[333] = -505101048;
        ge.ioxd[334] = -2132309827;
        ge.ioxd[335] = -8986295;
        ge.ioxd[336] = -1975280482;
        ge.ioxd[337] = 936297500;
        ge.ioxd[338] = -513348084;
        ge.ioxd[339] = 1082876616;
        ge.ioxd[340] = 731160037;
        ge.ioxd[341] = -162745824;
        ge.ioxd[342] = 2108733194;
        ge.ioxd[343] = -2026953336;
        ge.ioxd[344] = 76301087;
        ge.ioxd[345] = 2144347647;
        ge.ioxd[346] = -792938474;
        ge.ioxd[347] = -144407449;
        ge.ioxd[348] = 2077493952;
        ge.ioxd[349] = -48224032;
        ge.ioxd[350] = -1550658945;
        ge.ioxd[351] = 1114316767;
        ge.ioxd[352] = 1080194946;
        ge.ioxd[353] = -1492960822;
        ge.ioxd[354] = -529700811;
        ge.ioxd[355] = -1702144628;
        ge.ioxd[356] = 1756738449;
        ge.ioxd[357] = 1738265842;
        ge.ioxd[358] = -1538087028;
        ge.ioxd[359] = -86760234;
        ge.ioxd[360] = 1856671508;
        ge.ioxd[361] = -704489182;
        ge.ioxd[362] = -286963854;
        ge.ioxd[363] = 89596621;
        ge.ioxd[364] = 23210616;
        ge.ioxd[365] = 486517414;
        ge.ioxd[366] = 524770437;
        ge.ioxd[367] = -1472843459;
        ge.ioxd[368] = -1134475064;
        ge.ioxd[369] = -1720793610;
        ge.ioxd[370] = -2072560989;
        ge.ioxd[371] = 187959192;
        ge.ioxd[372] = 1029184082;
        ge.ioxd[373] = 877836449;
        ge.ioxd[374] = -288976745;
        ge.ioxd[375] = 1294325267;
        ge.ioxd[376] = 317630278;
        ge.ioxd[377] = -1791765054;
        ge.ioxd[378] = 187354878;
        ge.ioxd[379] = -1704860463;
        ge.ioxd[380] = 1447320449;
        ge.ioxd[381] = 1744565047;
        ge.ioxd[382] = -1563479067;
        ge.ioxd[383] = -2144034700;
        ge.ioxd[384] = -1959022502;
        ge.ioxd[385] = -886211023;
        ge.ioxd[386] = 259419881;
        ge.ioxd[387] = 721804502;
        ge.ioxd[388] = 47483052;
        ge.ioxd[389] = -2121709421;
        ge.ioxd[390] = -1487058224;
        ge.ioxd[391] = -67531340;
        ge.ioxd[392] = 1814805679;
        ge.ioxd[393] = 254678542;
        ge.ioxd[394] = 2045892371;
        ge.ioxd[395] = 74830826;
        ge.ioxd[396] = -1802167715;
        ge.ioxd[397] = -435161651;
        ge.ioxd[398] = -1515263554;
        ge.ioxd[399] = 760196739;
    }

    private static /* synthetic */ void itud() {
        ge.ioxt[300] = 6833112923531204333L;
        ge.ioxt[301] = 569024688867248349L;
        ge.ioxt[302] = -5575438043624852066L;
        ge.ioxt[303] = -8894552803737461142L;
        ge.ioxt[304] = -1278332665233482372L;
        ge.ioxt[305] = -5075756458993953856L;
        ge.ioxt[306] = -4981512223289679439L;
        ge.ioxt[307] = 4445250831229205342L;
        ge.ioxt[308] = 2368976891676042229L;
        ge.ioxt[309] = -6576023146778570970L;
        ge.ioxt[310] = -8011183006368250332L;
        ge.ioxt[311] = 5669037058858887102L;
        ge.ioxt[312] = 1104551649641890022L;
        ge.ioxt[313] = -3526517636307834169L;
        ge.ioxt[314] = -4483849229751527822L;
        ge.ioxt[315] = -531577170524138082L;
        ge.ioxt[316] = -1702654625305360250L;
        ge.ioxt[317] = -898566695398913459L;
        ge.ioxt[318] = -1851412062432754222L;
        ge.ioxt[319] = -8069624289734951948L;
        ge.ioxt[320] = 2025852988476933270L;
        ge.ioxt[321] = 2211918310796582970L;
        ge.ioxt[322] = -4331393334967804695L;
        ge.ioxt[323] = 3580310920630318933L;
        ge.ioxt[324] = 4174405897455016000L;
        ge.ioxt[325] = -857184931177721344L;
        ge.ioxt[326] = 2957080047013790645L;
        ge.ioxt[327] = -7235712228836260607L;
        ge.ioxt[328] = -5806644995426307413L;
        ge.ioxt[329] = 4882915445167521390L;
        ge.ioxt[330] = -3791990560602445409L;
        ge.ioxt[331] = -1572175597479649790L;
        ge.ioxt[332] = 1726412347429358713L;
        ge.ioxt[333] = -1395472470425507586L;
        ge.ioxt[334] = 3870093002092444594L;
        ge.ioxt[335] = 6853437519732802523L;
        ge.ioxt[336] = -2395948320898378708L;
        ge.ioxt[337] = -1437274061964889591L;
        ge.ioxt[338] = 2514787950559418520L;
        ge.ioxt[339] = -1524498479126446208L;
        ge.ioxt[340] = 3505710959258384875L;
        ge.ioxt[341] = 4221197764365584658L;
        ge.ioxt[342] = 6030645785309672766L;
        ge.ioxt[343] = 5176216162633359984L;
        ge.ioxt[344] = -4240157778179299912L;
        ge.ioxt[345] = 4772643470287539004L;
        ge.ioxt[346] = -2075134617009121852L;
        ge.ioxt[347] = -6890818788465655623L;
        ge.ioxt[348] = -3393999365546350042L;
        ge.ioxt[349] = -589463083970836125L;
        ge.ioxt[350] = 8208982897462004614L;
        ge.ioxt[351] = 5355696294993012932L;
        ge.ioxt[352] = -7672198224768598866L;
        ge.ioxt[353] = -6698141208787687478L;
        ge.ioxt[354] = 5514520639097310563L;
        ge.ioxt[355] = -5703186190690149791L;
        ge.ioxt[356] = 6731716616177841234L;
        ge.ioxt[357] = -4929251807391093372L;
        ge.ioxt[358] = 8640612482677670788L;
        ge.ioxt[359] = -8746714284106715677L;
        ge.ioxt[360] = -2610187041207565027L;
        ge.ioxt[361] = -5065193218709014202L;
        ge.ioxt[362] = 7483923083989649628L;
        ge.ioxt[363] = -6653247222682728501L;
        ge.ioxt[364] = 1679765262546807752L;
        ge.ioxt[365] = -6878668899200897576L;
        ge.ioxt[366] = -5811476086381370183L;
        ge.ioxt[367] = 3756233284596570830L;
        ge.ioxt[368] = 204405267238348235L;
        ge.ioxt[369] = 9002100723757088231L;
        ge.ioxt[370] = 1616118833072283393L;
        ge.ioxt[371] = -6858301327755319422L;
        ge.ioxt[372] = -4069682713545095396L;
        ge.ioxt[373] = -1001073694197392835L;
        ge.ioxt[374] = -6686131519824339934L;
        ge.ioxt[375] = -6669169593716228296L;
        ge.ioxt[376] = 8485048038547249389L;
        ge.ioxt[377] = -7092325931770395325L;
        ge.ioxt[378] = -8018500182036676269L;
        ge.ioxt[379] = 2120580023554164877L;
        ge.ioxt[380] = 7090045553671298339L;
        ge.ioxt[381] = 3183772662017650573L;
        ge.ioxt[382] = 4910106721049908297L;
        ge.ioxt[383] = -1140088466190400545L;
        ge.ioxt[384] = 2802206142110452436L;
        ge.ioxt[385] = 1963287836993327272L;
        ge.ioxt[386] = 6974368878961435946L;
        ge.ioxt[387] = 3590607707988156294L;
        ge.ioxt[388] = -7323979425321954154L;
        ge.ioxt[389] = -7812518679716694800L;
        ge.ioxt[390] = 2134308167052347283L;
        ge.ioxt[391] = -1014581798691748000L;
        ge.ioxt[392] = -2294212174383834391L;
        ge.ioxt[393] = 8308862820016101909L;
        ge.ioxt[394] = 1941832376518822945L;
        ge.ioxt[395] = 921441537564613801L;
        ge.ioxt[396] = -447490261107443921L;
        ge.ioxt[397] = -3990571119421156124L;
        ge.ioxt[398] = 8762771493129606757L;
        ge.ioxt[399] = 176223686913833620L;
    }

    private static /* synthetic */ long ioxs(int n2) {
        return ioxt[n2] ^ ioxu[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getCooldown() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irru", ioxs(int ), (int)541)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ge.ioxe("irrv", ioxa(int ), (int)816)) break;
            v0 /* !! */  = (long)ge.ioxe("irrw", ioxa(int ), (int)817);
        }
        var3_1 = ge.c;
        v1 /* !! */  = ge.qc;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - ge.ioxe("irrx", ioxs(int ), (int)542));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -258864652: {
                    v2 = ge.ioxe("irry", ioxs(int ), (int)543);
                    continue block16;
                }
                case -239756314: {
                    break block16;
                }
                case 1771664016: {
                    v2 = ge.ioxe("irrz", ioxs(int ), (int)544);
                    continue block16;
                }
            }
            break;
        }
        var2_2 = ge.b;
        v3 /* !! */  = ge.qc;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(v4 - ge.ioxe("irsa", ioxs(int ), (int)545));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -239756314: {
                    break block17;
                }
                case 166883274: {
                    v4 = ge.ioxe("irsb", ioxs(int ), (int)546);
                    continue block17;
                }
                case 865585592: {
                    v4 = ge.ioxe("irsc", ioxs(int ), (int)547);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (int)ge.ioxe("irsd", ioxa(int ), (int)818);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        v5 /* !! */  = ge.qc;
        if (true) ** GOTO lbl45
        block19: while (true) {
            v5 /* !! */  = (long)(v6 - ge.ioxe("irse", ioxs(int ), (int)548));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -767017575: {
                    v6 = ge.ioxe("irsf", ioxs(int ), (int)549);
                    continue block19;
                }
                case -239756314: {
                    break block19;
                }
                case 85225599: {
                    v6 = ge.ioxe("irsg", ioxs(int ), (int)550);
                    continue block19;
                }
            }
            break;
        }
        return this.cooldown;
    }

    private static /* synthetic */ void ittw() {
        ge.ioxd[500] = -1093284619;
        ge.ioxd[501] = -780277367;
        ge.ioxd[502] = -1008920457;
        ge.ioxd[503] = -804205182;
        ge.ioxd[504] = 791605563;
        ge.ioxd[505] = 697754474;
        ge.ioxd[506] = -1076417807;
        ge.ioxd[507] = -476363050;
        ge.ioxd[508] = -473782399;
        ge.ioxd[509] = -1993699328;
        ge.ioxd[510] = -413216793;
        ge.ioxd[511] = -2048297805;
        ge.ioxd[512] = -2044278229;
        ge.ioxd[513] = -475936485;
        ge.ioxd[514] = 838209253;
        ge.ioxd[515] = 2021409913;
        ge.ioxd[516] = 1173051453;
        ge.ioxd[517] = 287118294;
        ge.ioxd[518] = 81669445;
        ge.ioxd[519] = -1154288355;
        ge.ioxd[520] = 502454289;
        ge.ioxd[521] = -27086735;
        ge.ioxd[522] = -555634364;
        ge.ioxd[523] = -660502202;
        ge.ioxd[524] = 1159418602;
        ge.ioxd[525] = -336071512;
        ge.ioxd[526] = 349483505;
        ge.ioxd[527] = 1720962497;
        ge.ioxd[528] = -1621647695;
        ge.ioxd[529] = -410611175;
        ge.ioxd[530] = 350106401;
        ge.ioxd[531] = -1113029647;
        ge.ioxd[532] = -544966460;
        ge.ioxd[533] = 2016756035;
        ge.ioxd[534] = -2100522879;
        ge.ioxd[535] = -832057833;
        ge.ioxd[536] = -1808942589;
        ge.ioxd[537] = 1656624401;
        ge.ioxd[538] = 414443349;
        ge.ioxd[539] = -1846927526;
        ge.ioxd[540] = 432245460;
        ge.ioxd[541] = -846377634;
        ge.ioxd[542] = 1121996973;
        ge.ioxd[543] = -801784853;
        ge.ioxd[544] = 1790593660;
        ge.ioxd[545] = -1583592006;
        ge.ioxd[546] = -1955263787;
        ge.ioxd[547] = -1053714582;
        ge.ioxd[548] = -1762584656;
        ge.ioxd[549] = -1069630354;
        ge.ioxd[550] = -598718959;
        ge.ioxd[551] = -1837288056;
        ge.ioxd[552] = 60804715;
        ge.ioxd[553] = -453767747;
        ge.ioxd[554] = 1125288073;
        ge.ioxd[555] = 1062433004;
        ge.ioxd[556] = 667324162;
        ge.ioxd[557] = -223346836;
        ge.ioxd[558] = 1302584706;
        ge.ioxd[559] = 966282330;
        ge.ioxd[560] = -165272971;
        ge.ioxd[561] = -1842296700;
        ge.ioxd[562] = -461356082;
        ge.ioxd[563] = 1922052626;
        ge.ioxd[564] = 1583992839;
        ge.ioxd[565] = 52560214;
        ge.ioxd[566] = 246943622;
        ge.ioxd[567] = 1354843510;
        ge.ioxd[568] = -392136689;
        ge.ioxd[569] = -1338538048;
        ge.ioxd[570] = -1859636491;
        ge.ioxd[571] = -446321938;
        ge.ioxd[572] = 564922384;
        ge.ioxd[573] = -681843795;
        ge.ioxd[574] = 1513726678;
        ge.ioxd[575] = 954198543;
        ge.ioxd[576] = 1781242887;
        ge.ioxd[577] = -1899892767;
        ge.ioxd[578] = 347490754;
        ge.ioxd[579] = 688967162;
        ge.ioxd[580] = 1557520644;
        ge.ioxd[581] = -966669578;
        ge.ioxd[582] = -1305133341;
        ge.ioxd[583] = 411068418;
        ge.ioxd[584] = -495022852;
        ge.ioxd[585] = 124081313;
        ge.ioxd[586] = -679005203;
        ge.ioxd[587] = 2017597585;
        ge.ioxd[588] = -1302659107;
        ge.ioxd[589] = -1870087367;
        ge.ioxd[590] = -1633202609;
        ge.ioxd[591] = 311804491;
        ge.ioxd[592] = 1237803489;
        ge.ioxd[593] = 1472629619;
        ge.ioxd[594] = -921775322;
        ge.ioxd[595] = 1073004394;
        ge.ioxd[596] = 1820147920;
        ge.ioxd[597] = 559731855;
        ge.ioxd[598] = 114959343;
        ge.ioxd[599] = 675833655;
    }

    private static /* synthetic */ void ittx() {
        ge.ioxd[600] = -1140051165;
        ge.ioxd[601] = 1917977189;
        ge.ioxd[602] = -917454153;
        ge.ioxd[603] = 1375603610;
        ge.ioxd[604] = 1185617973;
        ge.ioxd[605] = 1571527911;
        ge.ioxd[606] = 1790772502;
        ge.ioxd[607] = -293671844;
        ge.ioxd[608] = 1178656450;
        ge.ioxd[609] = -366600078;
        ge.ioxd[610] = -1305061733;
        ge.ioxd[611] = 1132901378;
        ge.ioxd[612] = 1630489402;
        ge.ioxd[613] = 204791344;
        ge.ioxd[614] = 302620681;
        ge.ioxd[615] = 664315083;
        ge.ioxd[616] = -947848803;
        ge.ioxd[617] = -766120521;
        ge.ioxd[618] = 1931237960;
        ge.ioxd[619] = 1904597073;
        ge.ioxd[620] = -2106779214;
        ge.ioxd[621] = 351688182;
        ge.ioxd[622] = -717979797;
        ge.ioxd[623] = 1109103128;
        ge.ioxd[624] = -2018760411;
        ge.ioxd[625] = 1705291867;
        ge.ioxd[626] = -1056861008;
        ge.ioxd[627] = -908814655;
        ge.ioxd[628] = 860552307;
        ge.ioxd[629] = -1052051738;
        ge.ioxd[630] = -1596403831;
        ge.ioxd[631] = 723083883;
        ge.ioxd[632] = 1395499206;
        ge.ioxd[633] = 1615495299;
        ge.ioxd[634] = 23368736;
        ge.ioxd[635] = 1447616127;
        ge.ioxd[636] = 2020791848;
        ge.ioxd[637] = -207430492;
        ge.ioxd[638] = -416729984;
        ge.ioxd[639] = 1446713897;
        ge.ioxd[640] = 1916143162;
        ge.ioxd[641] = -199951106;
        ge.ioxd[642] = 1997729580;
        ge.ioxd[643] = -1618860924;
        ge.ioxd[644] = 1182216672;
        ge.ioxd[645] = 631087899;
        ge.ioxd[646] = -258301467;
        ge.ioxd[647] = 1708277944;
        ge.ioxd[648] = -1339141742;
        ge.ioxd[649] = -1559372773;
        ge.ioxd[650] = -1433374650;
        ge.ioxd[651] = -651680737;
        ge.ioxd[652] = 1862530155;
        ge.ioxd[653] = 877659118;
        ge.ioxd[654] = 141535792;
        ge.ioxd[655] = -445616433;
        ge.ioxd[656] = -1818291302;
        ge.ioxd[657] = -1045001153;
        ge.ioxd[658] = -1545259763;
        ge.ioxd[659] = 975507248;
        ge.ioxd[660] = 1500603048;
        ge.ioxd[661] = -1550957281;
        ge.ioxd[662] = 985638166;
        ge.ioxd[663] = 328778709;
        ge.ioxd[664] = -881228458;
        ge.ioxd[665] = 1372983148;
        ge.ioxd[666] = -1641819389;
        ge.ioxd[667] = -1060733589;
        ge.ioxd[668] = 322768838;
        ge.ioxd[669] = 898705202;
        ge.ioxd[670] = -20446323;
        ge.ioxd[671] = -429315058;
        ge.ioxd[672] = -375156285;
        ge.ioxd[673] = -2004954656;
        ge.ioxd[674] = -1835840127;
        ge.ioxd[675] = 1821787016;
        ge.ioxd[676] = -716530143;
        ge.ioxd[677] = -1373603192;
        ge.ioxd[678] = -1251689644;
        ge.ioxd[679] = -1921175776;
        ge.ioxd[680] = 426873470;
        ge.ioxd[681] = 1129166513;
        ge.ioxd[682] = -1632020611;
        ge.ioxd[683] = 1765509942;
        ge.ioxd[684] = -1273125932;
        ge.ioxd[685] = 481045951;
        ge.ioxd[686] = 119302453;
        ge.ioxd[687] = -1793972043;
        ge.ioxd[688] = -222962251;
        ge.ioxd[689] = 794799900;
        ge.ioxd[690] = -389037884;
        ge.ioxd[691] = -2095126813;
        ge.ioxd[692] = 1514807843;
        ge.ioxd[693] = 378211649;
        ge.ioxd[694] = -891900183;
        ge.ioxd[695] = 1390959784;
        ge.ioxd[696] = -642417698;
        ge.ioxd[697] = 763932131;
        ge.ioxd[698] = 2002225584;
        ge.ioxd[699] = 1364773454;
    }

    private static /* synthetic */ int ioxa(int n2) {
        return ioxc[n2] ^ ioxd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void placeBlockAbove(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iqer", ioxs(int ), (int)114)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("iqes", ioxa(int ), (int)227)) break;
            v0 /* !! */  = (long)ge.ioxe("iqet", ioxa(int ), (int)228);
        }
        var8_2 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iqeu", ioxs(int ), (int)115)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("iqev", ioxa(int ), (int)229)) break;
            v1 /* !! */  = (long)ge.ioxe("iqew", ioxa(int ), (int)230);
        }
        var7_3 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl17
        block76: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("iqex", ioxs(int ), (int)116));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -239756314: {
                    break block76;
                }
                case 881819210: {
                    v3 = ge.ioxe("iqey", ioxs(int ), (int)117);
                    continue block76;
                }
                case 1429416902: {
                    v3 = ge.ioxe("iqez", ioxs(int ), (int)118);
                    continue block76;
                }
            }
            break;
        }
        var6_4 = ge.a;
        if (var8_2) {
            throw null;
lbl29:
            // 14 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("iqfa", ioxs(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ge.ioxe("iqfb", ioxa(int ), (int)231)) break;
            v4 /* !! */  = (long)ge.ioxe("iqfc", ioxa(int ), (int)232);
        }
        v5 /* !! */  = ge.qc;
        if (true) ** GOTO lbl41
        block79: while (true) {
            v5 /* !! */  = (long)(ge.ioxe("iqfe", ioxs(int ), (int)121) - ge.ioxe("iqfd", ioxs(int ), (int)120));
lbl41:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1945997832: {
                    continue block79;
                }
                case -239756314: {
                    break block79;
                }
            }
            break;
        }
        v6 = ge.mc.field_1724;
        v7 /* !! */  = ge.qc;
        if (true) ** GOTO lbl51
        block80: while (true) {
            v7 /* !! */  = (long)(ge.ioxe("iqfg", ioxs(int ), (int)123) - ge.ioxe("iqff", ioxs(int ), (int)122));
lbl51:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -395801500: {
                    continue block80;
                }
                case -239756314: {
                    break block80;
                }
            }
            break;
        }
        v8 = v6.method_31548();
        v9 /* !! */  = ge.qc;
        if (true) ** GOTO lbl61
        block81: while (true) {
            v9 /* !! */  = (long)(v10 - ge.ioxe("iqfh", ioxs(int ), (int)124));
lbl61:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1734408773: {
                    v10 = ge.ioxe("iqfi", ioxs(int ), (int)125);
                    continue block81;
                }
                case -239756314: {
                    break block81;
                }
                case 1926442971: {
                    v10 = ge.ioxe("iqfj", ioxs(int ), (int)126);
                    continue block81;
                }
            }
            break;
        }
        var2_5 = v8.method_67532();
        if (var6_4 || var6_4) ** GOTO lbl29
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 /* !! */  = ge.qc;
                if (true) ** GOTO lbl79
                block82: while (true) {
                    v11 /* !! */  = (long)(v12 - ge.ioxe("iqfk", ioxs(int ), (int)127));
lbl79:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1715065845: {
                            v12 = ge.ioxe("iqfl", ioxs(int ), (int)128);
                            continue block82;
                        }
                        case -568828907: {
                            v12 = ge.ioxe("iqfm", ioxs(int ), (int)129);
                            continue block82;
                        }
                        case -239756314: {
                            break block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iqfn", ioxs(int ), (int)130)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ge.ioxe("iqfo", ioxa(int ), (int)233)) break;
                    v13 /* !! */  = (long)ge.ioxe("iqfp", ioxa(int ), (int)234);
                }
                v14 = ge.mc.field_1724;
                v15 /* !! */  = ge.qc;
                if (true) ** GOTO lbl98
                block84: while (true) {
                    v15 /* !! */  = (long)(v16 - ge.ioxe("iqfq", ioxs(int ), (int)131));
lbl98:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1438650739: {
                            v16 = ge.ioxe("iqfr", ioxs(int ), (int)132);
                            continue block84;
                        }
                        case -416145438: {
                            v16 = ge.ioxe("iqfs", ioxs(int ), (int)133);
                            continue block84;
                        }
                        case -239756314: {
                            break block84;
                        }
                        case 1355634371: {
                            v16 = ge.ioxe("iqft", ioxs(int ), (int)134);
                            continue block84;
                        }
                    }
                    break;
                }
                v17 = v14.method_31548();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("iqfu", ioxs(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ge.ioxe("iqfv", ioxa(int ), (int)235)) break;
                    v18 /* !! */  = (long)ge.ioxe("iqfw", ioxa(int ), (int)236);
                }
                v17.method_61496(var1_1);
                if (var6_4 || var6_4) ** GOTO lbl29
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("iqfx", ioxs(int ), (int)136)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ge.ioxe("iqfy", ioxa(int ), (int)237)) break;
                    v19 /* !! */  = (long)ge.ioxe("iqfz", ioxa(int ), (int)238);
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("iqga", ioxs(int ), (int)137)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ge.ioxe("iqgb", ioxa(int ), (int)239)) break;
                    v20 /* !! */  = (long)ge.ioxe("iqgc", ioxa(int ), (int)240);
                }
                v21 = ge.mc.field_1724;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iqgd", ioxs(int ), (int)138)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ge.ioxe("iqge", ioxa(int ), (int)241)) break;
                    v22 /* !! */  = (long)ge.ioxe("iqgf", ioxa(int ), (int)242);
                }
                var3_6 = v21.method_24515();
                if (var6_4 || var6_4) ** GOTO lbl29
                var4_7 = ge.ioxe("iqgg", ioxa(int ), (int)243);
                if (var6_4) ** GOTO lbl29
                do {
                    if (var6_4 || var6_4) ** GOTO lbl29
                    if (var4_7 > ge.ioxe("iqgh", ioxa(int ), (int)244)) ** GOTO lbl197
                    if (var6_4 || var6_4) ** GOTO lbl29
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("iqgi", ioxs(int ), (int)139)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == ge.ioxe("iqgj", ioxa(int ), (int)245)) break;
                        v23 /* !! */  = (long)ge.ioxe("iqgk", ioxa(int ), (int)246);
                    }
                    var5_8 = var3_6.method_10086((int)var4_7);
                    if (var6_4 || var6_4) ** GOTO lbl29
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_9 = ge.qc - ge.ioxe("iqgl", ioxs(int ), (int)140)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == ge.ioxe("iqgm", ioxa(int ), (int)247)) break;
                        v24 /* !! */  = (long)ge.ioxe("iqgn", ioxa(int ), (int)248);
                    }
                    while (true) {
                        if ((v25 /* !! */  = (cfr_temp_10 = ge.qc - ge.ioxe("iqgo", ioxs(int ), (int)141)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v25 /* !! */  == ge.ioxe("iqgp", ioxa(int ), (int)249)) break;
                        v25 /* !! */  = (long)ge.ioxe("iqgq", ioxa(int ), (int)250);
                    }
                    v26 = ge.mc.field_1687;
                    v27 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl164
                    block93: while (true) {
                        v27 /* !! */  = (long)(v28 - ge.ioxe("iqgr", ioxs(int ), (int)142));
lbl164:
                        // 2 sources

                        switch ((int)v27 /* !! */ ) {
                            case -924075173: {
                                v28 = ge.ioxe("iqgs", ioxs(int ), (int)143);
                                continue block93;
                            }
                            case -239756314: {
                                break block93;
                            }
                            case 1178997402: {
                                v28 = ge.ioxe("iqgt", ioxs(int ), (int)144);
                                continue block93;
                            }
                        }
                        break;
                    }
                    v29 = v26.method_8320(var5_8);
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_11 = ge.qc - ge.ioxe("iqgu", ioxs(int ), (int)145)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == ge.ioxe("iqgv", ioxa(int ), (int)251)) break;
                        v30 /* !! */  = (long)ge.ioxe("iqgw", ioxa(int ), (int)252);
                    }
                    if (!v29.method_26215()) ** GOTO lbl192
                    if (var6_4 || var6_4) ** GOTO lbl29
                    v31 /* !! */  = ge.qc;
                    if (true) ** GOTO lbl185
                    block95: while (true) {
                        v31 /* !! */  = (long)(ge.ioxe("iqgy", ioxs(int ), (int)147) - ge.ioxe("iqgx", ioxs(int ), (int)146));
lbl185:
                        // 2 sources

                        switch ((int)v31 /* !! */ ) {
                            case -1296500380: {
                                continue block95;
                            }
                            case -239756314: {
                                break block95;
                            }
                        }
                        break;
                    }
                    this.placeBlockAt(var5_8);
                    if (var6_4) ** GOTO lbl29
lbl192:
                    // 2 sources

                    if (var6_4 || var6_4) ** GOTO lbl29
                    ++var4_7;
                    if (var6_4) ** GOTO lbl29
                } while (!var8_2);
                throw null;
lbl197:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl29
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_12 = ge.qc - ge.ioxe("iqgz", ioxs(int ), (int)148)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == ge.ioxe("iqha", ioxa(int ), (int)253)) break;
                    v32 /* !! */  = (long)ge.ioxe("iqhb", ioxa(int ), (int)254);
                }
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_13 = ge.qc - ge.ioxe("iqhc", ioxs(int ), (int)149)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ge.ioxe("iqhd", ioxa(int ), (int)255)) break;
                    v33 /* !! */  = (long)ge.ioxe("iqhe", ioxa(int ), (int)256);
                }
                v34 = ge.mc.field_1724;
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_14 = ge.qc - ge.ioxe("iqhf", ioxs(int ), (int)150)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == ge.ioxe("iqhg", ioxa(int ), (int)257)) break;
                    v35 /* !! */  = (long)ge.ioxe("iqhh", ioxa(int ), (int)258);
                }
                v36 = v34.method_31548();
                v37 /* !! */  = ge.qc;
                if (true) ** GOTO lbl219
                block99: while (true) {
                    v37 /* !! */  = (long)(v38 - ge.ioxe("iqhi", ioxs(int ), (int)151));
lbl219:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -239756314: {
                            break block99;
                        }
                        case 230900724: {
                            v38 = ge.ioxe("iqhj", ioxs(int ), (int)152);
                            continue block99;
                        }
                        case 518672978: {
                            v38 = ge.ioxe("iqhk", ioxs(int ), (int)153);
                            continue block99;
                        }
                        case 839414075: {
                            v38 = ge.ioxe("iqhl", ioxs(int ), (int)154);
                            continue block99;
                        }
                    }
                    break;
                }
                v36.method_61496(var2_5);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhm", ioxa(int ), (int)259);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ge.ioxe("iqhn", ioxa(int ), (int)260);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl353
                    break;
                }
            }
lbl246:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)ge.ioxe("iqho", ioxa(int ), (int)261);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl251:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhp", ioxa(int ), (int)262);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl256:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhq", ioxa(int ), (int)263);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl261:
            // 2 sources

            case 5: {
                do {
                    var7_3 /* !! */  = (int)ge.ioxe("iqhr", ioxa(int ), (int)264);
                } while (!var8_2);
                throw null;
            }
            case 6: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhs", ioxa(int ), (int)265);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 7: {
                var7_3 /* !! */  = (int)ge.ioxe("iqht", ioxa(int ), (int)266);
                if (!var8_2) ** GOTO lbl246
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhu", ioxa(int ), (int)267);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl280:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhv", ioxa(int ), (int)268);
                if (!var8_2) ** GOTO lbl246
                throw null;
            }
            case 10: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhw", ioxa(int ), (int)269);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 11: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhx", ioxa(int ), (int)270);
                if (!var8_2) ** GOTO lbl251
                throw null;
            }
lbl293:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhy", ioxa(int ), (int)271);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl298:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ge.ioxe("iqhz", ioxa(int ), (int)272);
                if (var8_2) {
                    throw null;
                }
            }
lbl302:
            // 7 sources

            case 14: {
                var7_3 /* !! */  = (int)ge.ioxe("iqia", ioxa(int ), (int)273);
                if (!var8_2) ** GOTO lbl280
                throw null;
            }
lbl306:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)ge.ioxe("iqib", ioxa(int ), (int)274);
                if (!var8_2) ** GOTO lbl293
                throw null;
            }
            case 16: {
                var7_3 /* !! */  = (int)ge.ioxe("iqic", ioxa(int ), (int)275);
                if (!var8_2) ** GOTO lbl302
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)ge.ioxe("iqid", ioxa(int ), (int)276);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl319:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)ge.ioxe("iqie", ioxa(int ), (int)277);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
            case 19: {
                var7_3 /* !! */  = (int)ge.ioxe("iqif", ioxa(int ), (int)278);
                if (!var8_2) ** GOTO lbl319
                throw null;
            }
lbl328:
            // 4 sources

            case 20: {
                do {
                    var7_3 /* !! */  = (int)ge.ioxe("iqig", ioxa(int ), (int)279);
                } while (!var8_2);
                throw null;
            }
lbl333:
            // 4 sources

            case 21: {
                var7_3 /* !! */  = (int)ge.ioxe("iqih", ioxa(int ), (int)280);
                if (!var8_2) ** GOTO lbl328
                throw null;
            }
lbl337:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)ge.ioxe("iqii", ioxa(int ), (int)281);
                if (!var8_2) ** GOTO lbl302
                throw null;
            }
            case 23: {
                var7_3 /* !! */  = (int)ge.ioxe("iqij", ioxa(int ), (int)282);
                if (!var8_2) ** GOTO lbl302
                throw null;
            }
            case 24: {
                var7_3 /* !! */  = (int)ge.ioxe("iqik", ioxa(int ), (int)283);
                if (!var8_2) ** GOTO lbl261
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)ge.ioxe("iqil", ioxa(int ), (int)284);
                if (!var8_2) ** GOTO lbl328
                throw null;
            }
lbl353:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)ge.ioxe("iqim", ioxa(int ), (int)285);
                if (!var8_2) ** GOTO lbl293
                throw null;
            }
            case 27: 
        }
        var7_3 /* !! */  = (int)ge.ioxe("iqin", ioxa(int ), (int)286);
        ** while (!var8_2)
lbl360:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("ioxv", ioxs(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("ioxw", ioxa(int ), (int)9)) break;
            v0 /* !! */  = (long)ge.ioxe("ioxx", ioxa(int ), (int)10);
        }
        var4_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("ioxz", ioxs(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("ioya", ioxa(int ), (int)11)) break;
            v1 /* !! */  = (long)ge.ioxe("ioyb", ioxa(int ), (int)12);
        }
        var3_2 /* !! */  = ge.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("ioyc", ioxs(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ge.ioxe("ioyd", ioxa(int ), (int)13)) break;
            v2 /* !! */  = (long)ge.ioxe("ioye", ioxa(int ), (int)14);
        }
        var2_3 = ge.a;
        if (var4_1) {
            throw null;
lbl21:
            // 6 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        v3 /* !! */  = ge.qc;
        if (true) ** GOTO lbl28
        block31: while (true) {
            v3 /* !! */  = (long)(ge.ioxe("ioyg", ioxs(int ), (int)4) - ge.ioxe("ioyf", ioxs(int ), (int)3));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -239756314: {
                    break block31;
                }
                case 863714761: {
                    continue block31;
                }
            }
            break;
        }
        var1_4 = class_310.method_1551();
        if (var2_3 || var2_3) ** GOTO lbl21
        v4 /* !! */  = ge.qc;
        if (true) ** GOTO lbl39
        block32: while (true) {
            v4 /* !! */  = (long)(ge.ioxe("ioyj", ioxs(int ), (int)6) - ge.ioxe("ioyi", ioxs(int ), (int)5));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -239756314: {
                    break block32;
                }
                case 378494531: {
                    continue block32;
                }
            }
            break;
        }
        if (var1_4.field_1724 == null) ** GOTO lbl78
        if (var2_3 || var2_3) ** GOTO lbl21
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("ioyk", ioxs(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ge.ioxe("ioyl", ioxa(int ), (int)15)) break;
            v5 /* !! */  = (long)ge.ioxe("ioym", ioxa(int ), (int)16);
        }
        v6 = var1_4.field_1724;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("ioyn", ioxs(int ), (int)8)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ge.ioxe("ioyp", ioxa(int ), (int)17)) break;
            v7 /* !! */  = (long)ge.ioxe("ioyq", ioxa(int ), (int)18);
        }
        v8 = v6.method_31548();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("ioyr", ioxs(int ), (int)9)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ge.ioxe("ioys", ioxa(int ), (int)19)) break;
            v9 /* !! */  = (long)ge.ioxe("ioyt", ioxa(int ), (int)20);
        }
        v10 = v8.method_67532();
        v11 /* !! */  = ge.qc;
        if (true) ** GOTO lbl68
        block36: while (true) {
            v11 /* !! */  = (long)(ge.ioxe("ioyv", ioxs(int ), (int)11) - ge.ioxe("ioyu", ioxs(int ), (int)10));
lbl68:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -239756314: {
                    break block36;
                }
                case 914655256: {
                    continue block36;
                }
            }
            break;
        }
        this.lastSlot = v10;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl21
lbl78:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("ioyx", ioxs(int ), (int)12)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ge.ioxe("ioyz", ioxa(int ), (int)21)) break;
                    v12 /* !! */  = (long)ge.ioxe("ioza", ioxa(int ), (int)22);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iozb", ioxs(int ), (int)13)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ge.ioxe("iozc", ioxa(int ), (int)23)) break;
                    v13 /* !! */  = (long)ge.ioxe("ioze", ioxa(int ), (int)24);
                }
                this.lightningTimer.reset();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl93:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ge.ioxe("iozf", ioxa(int ), (int)25);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl98:
            // 2 sources

            case 1: {
                do {
                    var3_2 /* !! */  = (int)ge.ioxe("iozh", ioxa(int ), (int)26);
                } while (!var4_1);
                throw null;
            }
lbl103:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ge.ioxe("iozi", ioxa(int ), (int)27);
                if (!var4_1) break;
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)ge.ioxe("iozj", ioxa(int ), (int)28);
                if (!var4_1) ** GOTO lbl103
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ge.ioxe("iozl", ioxa(int ), (int)29);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl137
                    break;
                }
            }
lbl117:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ge.ioxe("iozm", ioxa(int ), (int)30);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: {
                var3_2 /* !! */  = (int)ge.ioxe("iozn", ioxa(int ), (int)31);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl127:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)ge.ioxe("iozo", ioxa(int ), (int)32);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 8: {
                var3_2 /* !! */  = (int)ge.ioxe("iozp", ioxa(int ), (int)33);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl137:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)ge.ioxe("iozr", ioxa(int ), (int)34);
                if (!var4_1) ** GOTO lbl98
                throw null;
            }
lbl141:
            // 2 sources

            case 10: {
                do {
                    var3_2 /* !! */  = (int)ge.ioxe("iozs", ioxa(int ), (int)35);
                } while (!var4_1);
                throw null;
            }
lbl146:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)ge.ioxe("iozt", ioxa(int ), (int)36);
                if (!var4_1) ** GOTO lbl93
                throw null;
            }
            case 12: 
        }
        var3_2 /* !! */  = (int)ge.ioxe("iozv", ioxa(int ), (int)37);
        ** while (!var4_1)
lbl153:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getStopWatch() {
        v0 /* !! */  = ge.qc;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ge.ioxe("irpv", ioxs(int ), (int)514));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1804047136: {
                    v1 = ge.ioxe("irpw", ioxs(int ), (int)515);
                    continue block23;
                }
                case -879106938: {
                    v1 = ge.ioxe("irpx", ioxs(int ), (int)516);
                    continue block23;
                }
                case -422543824: {
                    v1 = ge.ioxe("irpy", ioxs(int ), (int)517);
                    continue block23;
                }
                case -239756314: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = ge.c;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("irpz", ioxs(int ), (int)518));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -525875451: {
                    v3 = ge.ioxe("irqa", ioxs(int ), (int)519);
                    continue block24;
                }
                case -239756314: {
                    break block24;
                }
                case 1690726501: {
                    v3 = ge.ioxe("irqb", ioxs(int ), (int)520);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ge.b;
        v4 /* !! */  = ge.qc;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - ge.ioxe("irqc", ioxs(int ), (int)521));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -677291310: {
                    v5 = ge.ioxe("irqd", ioxs(int ), (int)522);
                    continue block25;
                }
                case -239756314: {
                    break block25;
                }
                case -2154728: {
                    v5 = ge.ioxe("irqe", ioxs(int ), (int)523);
                    continue block25;
                }
                case 905125074: {
                    v5 = ge.ioxe("irqf", ioxs(int ), (int)524);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irqg", ioxs(int ), (int)525)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ge.ioxe("irqh", ioxa(int ), (int)792)) break;
                    v6 /* !! */  = (long)ge.ioxe("irqi", ioxa(int ), (int)793);
                }
                return this.stopWatch;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ge.ioxe("irqj", ioxa(int ), (int)794);
                } while (!var3_1);
                throw null;
            }
lbl69:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ge.ioxe("irqk", ioxa(int ), (int)795);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ge.ioxe("irql", ioxa(int ), (int)796);
                    if (!var3_1) ** GOTO lbl69
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ge.ioxe("irqm", ioxa(int ), (int)797);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void irut() {
        ge.ioxc[400] = -1955582125;
        ge.ioxc[401] = 2069918803;
        ge.ioxc[402] = 1072067580;
        ge.ioxc[403] = 470877573;
        ge.ioxc[404] = 2012246225;
        ge.ioxc[405] = 1009036953;
        ge.ioxc[406] = -2002729638;
        ge.ioxc[407] = -863784358;
        ge.ioxc[408] = -2006634589;
        ge.ioxc[409] = -589377331;
        ge.ioxc[410] = 1713032831;
        ge.ioxc[411] = -520356782;
        ge.ioxc[412] = 1503231391;
        ge.ioxc[413] = 1380702256;
        ge.ioxc[414] = 1733815361;
        ge.ioxc[415] = 558480176;
        ge.ioxc[416] = 1692856712;
        ge.ioxc[417] = 210805248;
        ge.ioxc[418] = 807629368;
        ge.ioxc[419] = -272555505;
        ge.ioxc[420] = 100087270;
        ge.ioxc[421] = -1338389814;
        ge.ioxc[422] = -2042231031;
        ge.ioxc[423] = 387540552;
        ge.ioxc[424] = -1678145588;
        ge.ioxc[425] = -1689002175;
        ge.ioxc[426] = -1122448402;
        ge.ioxc[427] = -570476615;
        ge.ioxc[428] = -2139169175;
        ge.ioxc[429] = 1420054182;
        ge.ioxc[430] = 65124204;
        ge.ioxc[431] = 1687461222;
        ge.ioxc[432] = -552673303;
        ge.ioxc[433] = -715839156;
        ge.ioxc[434] = -2048908386;
        ge.ioxc[435] = -1876380420;
        ge.ioxc[436] = -636157912;
        ge.ioxc[437] = 1246188738;
        ge.ioxc[438] = 1600651961;
        ge.ioxc[439] = -1571425467;
        ge.ioxc[440] = 1955185022;
        ge.ioxc[441] = 633439682;
        ge.ioxc[442] = 805785628;
        ge.ioxc[443] = 1995013789;
        ge.ioxc[444] = 261871830;
        ge.ioxc[445] = -605431829;
        ge.ioxc[446] = -664642220;
        ge.ioxc[447] = 0x1DD7111;
        ge.ioxc[448] = 1239753599;
        ge.ioxc[449] = -701479593;
        ge.ioxc[450] = -1556481069;
        ge.ioxc[451] = 1235148731;
        ge.ioxc[452] = 741437734;
        ge.ioxc[453] = -272174193;
        ge.ioxc[454] = -1484333671;
        ge.ioxc[455] = -2105381586;
        ge.ioxc[456] = -866538521;
        ge.ioxc[457] = 1465357065;
        ge.ioxc[458] = 5467678;
        ge.ioxc[459] = 1823936930;
        ge.ioxc[460] = -1279515597;
        ge.ioxc[461] = -1224825955;
        ge.ioxc[462] = 2083130717;
        ge.ioxc[463] = 65822492;
        ge.ioxc[464] = -1725119033;
        ge.ioxc[465] = -1615520132;
        ge.ioxc[466] = 1174750352;
        ge.ioxc[467] = 735648737;
        ge.ioxc[468] = 2098898064;
        ge.ioxc[469] = 134688628;
        ge.ioxc[470] = -1545826811;
        ge.ioxc[471] = -1578421407;
        ge.ioxc[472] = 949592782;
        ge.ioxc[473] = -567107254;
        ge.ioxc[474] = -176323719;
        ge.ioxc[475] = -914995745;
        ge.ioxc[476] = 1605769608;
        ge.ioxc[477] = -1035083700;
        ge.ioxc[478] = 2030731644;
        ge.ioxc[479] = -1857661524;
        ge.ioxc[480] = 593740579;
        ge.ioxc[481] = 734180483;
        ge.ioxc[482] = 779427040;
        ge.ioxc[483] = 2077252547;
        ge.ioxc[484] = -1229436083;
        ge.ioxc[485] = -2072633948;
        ge.ioxc[486] = 1104934646;
        ge.ioxc[487] = -2037202885;
        ge.ioxc[488] = 1630882742;
        ge.ioxc[489] = -978784405;
        ge.ioxc[490] = 1125697127;
        ge.ioxc[491] = 1439957884;
        ge.ioxc[492] = -1813210507;
        ge.ioxc[493] = 1697846027;
        ge.ioxc[494] = -935023733;
        ge.ioxc[495] = 940446978;
        ge.ioxc[496] = -192600738;
        ge.ioxc[497] = -1888118934;
        ge.ioxc[498] = -423223285;
        ge.ioxc[499] = -1673977875;
    }

    public static /* synthetic */ CallSite ioxe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ituh() {
        ge.ioxu[100] = 3681233560781699095L;
        ge.ioxu[101] = -6067947540287342927L;
        ge.ioxu[102] = -2780350173775874689L;
        ge.ioxu[103] = 2320478413891250697L;
        ge.ioxu[104] = -1790728054280860142L;
        ge.ioxu[105] = -5856048443605793031L;
        ge.ioxu[106] = 51363028969689830L;
        ge.ioxu[107] = -1658439319514535220L;
        ge.ioxu[108] = 1284951648332327718L;
        ge.ioxu[109] = 8766019974267838572L;
        ge.ioxu[110] = -1344062432305658152L;
        ge.ioxu[111] = 971937788230610081L;
        ge.ioxu[112] = 2987033104483316059L;
        ge.ioxu[113] = -8636697205470728142L;
        ge.ioxu[114] = 9137926785135099095L;
        ge.ioxu[115] = 2544534846122550467L;
        ge.ioxu[116] = -7805985068785504509L;
        ge.ioxu[117] = -3782300273349024504L;
        ge.ioxu[118] = 5619776008263963432L;
        ge.ioxu[119] = -2742511369145262543L;
        ge.ioxu[120] = -3831767445422673017L;
        ge.ioxu[121] = 6100737885098370691L;
        ge.ioxu[122] = 7760981134773248613L;
        ge.ioxu[123] = 3366081094672367025L;
        ge.ioxu[124] = 144507632008022935L;
        ge.ioxu[125] = 5283933485975090207L;
        ge.ioxu[126] = 6848324653849966275L;
        ge.ioxu[127] = 7687844131922854507L;
        ge.ioxu[128] = -1559951564838299353L;
        ge.ioxu[129] = -7124924359508978916L;
        ge.ioxu[130] = -202611465520393340L;
        ge.ioxu[131] = 897149284613626713L;
        ge.ioxu[132] = -7467022209113767187L;
        ge.ioxu[133] = 51107585889403732L;
        ge.ioxu[134] = -7521142578410901370L;
        ge.ioxu[135] = 8515317422488852229L;
        ge.ioxu[136] = 7856685279039241684L;
        ge.ioxu[137] = -5356325800337778379L;
        ge.ioxu[138] = 6919776018840424985L;
        ge.ioxu[139] = -5156706659935635637L;
        ge.ioxu[140] = -2067719004957600956L;
        ge.ioxu[141] = -2297685902303441150L;
        ge.ioxu[142] = -6680680302976356341L;
        ge.ioxu[143] = -3743846457494062895L;
        ge.ioxu[144] = 4893833279469630780L;
        ge.ioxu[145] = 489502919320083614L;
        ge.ioxu[146] = -1628572809371970805L;
        ge.ioxu[147] = 2278684226725610467L;
        ge.ioxu[148] = -525528100367789228L;
        ge.ioxu[149] = -6756922452196530295L;
        ge.ioxu[150] = -4303334445850640767L;
        ge.ioxu[151] = -6071032998336894705L;
        ge.ioxu[152] = 4852223403141445072L;
        ge.ioxu[153] = 540240478142805619L;
        ge.ioxu[154] = -4771209529832023170L;
        ge.ioxu[155] = -3362662196849931840L;
        ge.ioxu[156] = 1431923497467074547L;
        ge.ioxu[157] = 7658344329976917730L;
        ge.ioxu[158] = 7359237311635415038L;
        ge.ioxu[159] = -3650850361867647464L;
        ge.ioxu[160] = -1196316434965165445L;
        ge.ioxu[161] = 6991324475588424723L;
        ge.ioxu[162] = 5556912615941490927L;
        ge.ioxu[163] = -8106517789857692004L;
        ge.ioxu[164] = -6309488979497463768L;
        ge.ioxu[165] = -8663362399849950121L;
        ge.ioxu[166] = 1636081655292383685L;
        ge.ioxu[167] = -3075881931835535678L;
        ge.ioxu[168] = 1508822061585980228L;
        ge.ioxu[169] = -6081091589850264854L;
        ge.ioxu[170] = -4568528835165859812L;
        ge.ioxu[171] = -5049492920699170764L;
        ge.ioxu[172] = -2036685354810372196L;
        ge.ioxu[173] = 5949968734803135598L;
        ge.ioxu[174] = -4097067814000666433L;
        ge.ioxu[175] = 5553243098805810589L;
        ge.ioxu[176] = -4921756062042605049L;
        ge.ioxu[177] = -7128476205748337761L;
        ge.ioxu[178] = 8946231996960869110L;
        ge.ioxu[179] = -304495326748357744L;
        ge.ioxu[180] = 1640183463787392368L;
        ge.ioxu[181] = 5777453430454901583L;
        ge.ioxu[182] = 7656038488966559746L;
        ge.ioxu[183] = -8251835051142386628L;
        ge.ioxu[184] = 7644442279480415518L;
        ge.ioxu[185] = 3590001168195250125L;
        ge.ioxu[186] = -7975102330656122645L;
        ge.ioxu[187] = 5051932628940660873L;
        ge.ioxu[188] = -3272796458686493483L;
        ge.ioxu[189] = -1045814823471419186L;
        ge.ioxu[190] = -2182320223331412417L;
        ge.ioxu[191] = 4829383661308560212L;
        ge.ioxu[192] = 7605706900904125933L;
        ge.ioxu[193] = -8780165327647001320L;
        ge.ioxu[194] = 3337098863690629381L;
        ge.ioxu[195] = 7542606719186248747L;
        ge.ioxu[196] = -4280028402706672824L;
        ge.ioxu[197] = 919951881182060941L;
        ge.ioxu[198] = -5328434428182137417L;
        ge.ioxu[199] = 4956088846268347294L;
    }

    private static /* synthetic */ void itul() {
        ge.ioxu[500] = -4834735090437917802L;
        ge.ioxu[501] = 8107210270878433883L;
        ge.ioxu[502] = -47267588922179234L;
        ge.ioxu[503] = -7827179656321516633L;
        ge.ioxu[504] = -1282415164604011177L;
        ge.ioxu[505] = 642825308913044303L;
        ge.ioxu[506] = -5817039224250941661L;
        ge.ioxu[507] = -4225582455186308540L;
        ge.ioxu[508] = -4409158528914439793L;
        ge.ioxu[509] = -5946113132436211036L;
        ge.ioxu[510] = 2545952461950870835L;
        ge.ioxu[511] = -6857303912330778388L;
        ge.ioxu[512] = 3020875665883844677L;
        ge.ioxu[513] = 8121190692264014676L;
        ge.ioxu[514] = -9161301018373987788L;
        ge.ioxu[515] = 8630331509644355609L;
        ge.ioxu[516] = -7372178854150603481L;
        ge.ioxu[517] = -5915397851942111989L;
        ge.ioxu[518] = 6901508196291665136L;
        ge.ioxu[519] = 4333741760776255601L;
        ge.ioxu[520] = 4115186043363258607L;
        ge.ioxu[521] = -4730202454606722046L;
        ge.ioxu[522] = -6472201295902133796L;
        ge.ioxu[523] = -4573988524383192371L;
        ge.ioxu[524] = -2070293722367659181L;
        ge.ioxu[525] = -6405497697306388391L;
        ge.ioxu[526] = 7655456929624124114L;
        ge.ioxu[527] = 5373206831223759094L;
        ge.ioxu[528] = -8381649369751331245L;
        ge.ioxu[529] = -3589046740199742053L;
        ge.ioxu[530] = -264290622168360272L;
        ge.ioxu[531] = -3978041057808466691L;
        ge.ioxu[532] = 4054906531132405862L;
        ge.ioxu[533] = -3902606892085339718L;
        ge.ioxu[534] = -2920230139195904970L;
        ge.ioxu[535] = -6658433913696095191L;
        ge.ioxu[536] = -3059503167868668384L;
        ge.ioxu[537] = 7586159632059174336L;
        ge.ioxu[538] = -8135531240932979093L;
        ge.ioxu[539] = -8377000543408091250L;
        ge.ioxu[540] = 4490417528635274443L;
        ge.ioxu[541] = -3985879146051944032L;
        ge.ioxu[542] = -1218571531755415970L;
        ge.ioxu[543] = 8609427600394109902L;
        ge.ioxu[544] = 6255251382074738450L;
        ge.ioxu[545] = -4957306457188089084L;
        ge.ioxu[546] = 4917106674179542054L;
        ge.ioxu[547] = -7617947834430539908L;
        ge.ioxu[548] = 3331766276334360427L;
        ge.ioxu[549] = 6113121840173035592L;
        ge.ioxu[550] = -1402625234436745337L;
        ge.ioxu[551] = -2906555920812431381L;
        ge.ioxu[552] = -2791328471613471638L;
        ge.ioxu[553] = 8041434864149367593L;
        ge.ioxu[554] = -7114542034548704997L;
        ge.ioxu[555] = -4307206355430568407L;
        ge.ioxu[556] = 8161409400156667907L;
        ge.ioxu[557] = -4570462997513061307L;
        ge.ioxu[558] = 6790386170070464907L;
        ge.ioxu[559] = -3156510500180388261L;
        ge.ioxu[560] = -2239005111575160240L;
        ge.ioxu[561] = 6671886980498376676L;
        ge.ioxu[562] = 9199899144036348416L;
        ge.ioxu[563] = 8333399508954651615L;
        ge.ioxu[564] = 6710093140778190135L;
        ge.ioxu[565] = -864975821805100718L;
        ge.ioxu[566] = 7185581996883771707L;
        ge.ioxu[567] = 2344275614784816031L;
        ge.ioxu[568] = -5204928046530587415L;
        ge.ioxu[569] = 7720504852728918892L;
        ge.ioxu[570] = -4097882615416066474L;
        ge.ioxu[571] = 619954018550165830L;
        ge.ioxu[572] = -2156228815350327215L;
        ge.ioxu[573] = 2957952175010133785L;
        ge.ioxu[574] = 3069976643354930541L;
        ge.ioxu[575] = 5108981204342481565L;
        ge.ioxu[576] = -6460448541764991505L;
        ge.ioxu[577] = 6595141723782054220L;
        ge.ioxu[578] = -4503990434761479880L;
    }

    private static /* synthetic */ void ittr() {
        ge.ioxd[0] = -1670678971;
        ge.ioxd[1] = -1552508034;
        ge.ioxd[2] = -598008004;
        ge.ioxd[3] = 531104470;
        ge.ioxd[4] = -1734659261;
        ge.ioxd[5] = -54442117;
        ge.ioxd[6] = -672489029;
        ge.ioxd[7] = -820442887;
        ge.ioxd[8] = -923594160;
        ge.ioxd[9] = -520451373;
        ge.ioxd[10] = 317427018;
        ge.ioxd[11] = -167668417;
        ge.ioxd[12] = -1953047383;
        ge.ioxd[13] = -1564423053;
        ge.ioxd[14] = 1041154004;
        ge.ioxd[15] = -99884514;
        ge.ioxd[16] = 1215624147;
        ge.ioxd[17] = 2092665739;
        ge.ioxd[18] = 1482261538;
        ge.ioxd[19] = 902721156;
        ge.ioxd[20] = 1141540890;
        ge.ioxd[21] = -2091707246;
        ge.ioxd[22] = 902006430;
        ge.ioxd[23] = -491003299;
        ge.ioxd[24] = 2103049180;
        ge.ioxd[25] = -1233752685;
        ge.ioxd[26] = 299445970;
        ge.ioxd[27] = 1802902441;
        ge.ioxd[28] = 333983757;
        ge.ioxd[29] = -1024722869;
        ge.ioxd[30] = 672901036;
        ge.ioxd[31] = -2027551762;
        ge.ioxd[32] = -1905495833;
        ge.ioxd[33] = -815276265;
        ge.ioxd[34] = 750969202;
        ge.ioxd[35] = 1739983628;
        ge.ioxd[36] = -1385377496;
        ge.ioxd[37] = -1453967031;
        ge.ioxd[38] = -227094128;
        ge.ioxd[39] = -574873028;
        ge.ioxd[40] = -818717938;
        ge.ioxd[41] = -1935092632;
        ge.ioxd[42] = 1835333523;
        ge.ioxd[43] = 96967199;
        ge.ioxd[44] = 1417480994;
        ge.ioxd[45] = 1589093520;
        ge.ioxd[46] = 178629875;
        ge.ioxd[47] = -227330534;
        ge.ioxd[48] = -966916776;
        ge.ioxd[49] = 467759116;
        ge.ioxd[50] = 397081109;
        ge.ioxd[51] = 1238457796;
        ge.ioxd[52] = 1833326830;
        ge.ioxd[53] = -2036915963;
        ge.ioxd[54] = 627977713;
        ge.ioxd[55] = -880600103;
        ge.ioxd[56] = 2004183090;
        ge.ioxd[57] = -1600286061;
        ge.ioxd[58] = -105953563;
        ge.ioxd[59] = 1920843989;
        ge.ioxd[60] = 1715076359;
        ge.ioxd[61] = 950063201;
        ge.ioxd[62] = -1050870480;
        ge.ioxd[63] = 256646989;
        ge.ioxd[64] = 1073009184;
        ge.ioxd[65] = -292566642;
        ge.ioxd[66] = 1713996231;
        ge.ioxd[67] = 169241125;
        ge.ioxd[68] = 1305503301;
        ge.ioxd[69] = -938705516;
        ge.ioxd[70] = 1974137129;
        ge.ioxd[71] = -202078576;
        ge.ioxd[72] = 196998099;
        ge.ioxd[73] = -539673639;
        ge.ioxd[74] = 341722160;
        ge.ioxd[75] = 1139827759;
        ge.ioxd[76] = -1860464046;
        ge.ioxd[77] = 1639386739;
        ge.ioxd[78] = -23729497;
        ge.ioxd[79] = 1038191103;
        ge.ioxd[80] = 1697806826;
        ge.ioxd[81] = -1978416221;
        ge.ioxd[82] = -1529675014;
        ge.ioxd[83] = -1637513728;
        ge.ioxd[84] = 259777594;
        ge.ioxd[85] = 279191570;
        ge.ioxd[86] = 1749932333;
        ge.ioxd[87] = -1543687397;
        ge.ioxd[88] = 1813161576;
        ge.ioxd[89] = -1883999907;
        ge.ioxd[90] = -2062360305;
        ge.ioxd[91] = -2044856000;
        ge.ioxd[92] = 920377464;
        ge.ioxd[93] = 1681474771;
        ge.ioxd[94] = -11393536;
        ge.ioxd[95] = 1123006550;
        ge.ioxd[96] = 8165260;
        ge.ioxd[97] = -807770083;
        ge.ioxd[98] = 530428090;
        ge.ioxd[99] = -1441195891;
    }

    private static /* synthetic */ void itui() {
        ge.ioxu[200] = -2869481270487708012L;
        ge.ioxu[201] = -6770300701528996487L;
        ge.ioxu[202] = 94252715435477957L;
        ge.ioxu[203] = -8560143080415944229L;
        ge.ioxu[204] = 6630457122670460612L;
        ge.ioxu[205] = -1690982244636149767L;
        ge.ioxu[206] = 5056915833560533032L;
        ge.ioxu[207] = 5027444622677624104L;
        ge.ioxu[208] = 1958378092991271261L;
        ge.ioxu[209] = -509006370945539893L;
        ge.ioxu[210] = -1453514616191568351L;
        ge.ioxu[211] = 7580760148376874892L;
        ge.ioxu[212] = -7673754731816879808L;
        ge.ioxu[213] = 3763159062523310585L;
        ge.ioxu[214] = -3645834939742475494L;
        ge.ioxu[215] = 9012750188039139480L;
        ge.ioxu[216] = 4868879009788248491L;
        ge.ioxu[217] = 2179529033853379998L;
        ge.ioxu[218] = 6070700359853565045L;
        ge.ioxu[219] = 7830444420411770819L;
        ge.ioxu[220] = 9044084841949064577L;
        ge.ioxu[221] = 432835633855992172L;
        ge.ioxu[222] = 1377517531159579145L;
        ge.ioxu[223] = -5720923392266305265L;
        ge.ioxu[224] = -5232379635094281148L;
        ge.ioxu[225] = 1904546660308932768L;
        ge.ioxu[226] = -6876270591338219670L;
        ge.ioxu[227] = 9012200253193111844L;
        ge.ioxu[228] = 167574468067727487L;
        ge.ioxu[229] = -2569359139583825992L;
        ge.ioxu[230] = 6167199322374069500L;
        ge.ioxu[231] = 941810505128865495L;
        ge.ioxu[232] = 4925913831826261935L;
        ge.ioxu[233] = 7288349716409176027L;
        ge.ioxu[234] = 6342395280381237444L;
        ge.ioxu[235] = 6057049655708751539L;
        ge.ioxu[236] = -3592120753489743305L;
        ge.ioxu[237] = 2896823317184667347L;
        ge.ioxu[238] = 3261245998768413263L;
        ge.ioxu[239] = 2490423513750928510L;
        ge.ioxu[240] = 5838260681608348352L;
        ge.ioxu[241] = 2135029361833930668L;
        ge.ioxu[242] = 2180304779490293092L;
        ge.ioxu[243] = -5681949028861665490L;
        ge.ioxu[244] = 4797125130378614767L;
        ge.ioxu[245] = 7491018225027153460L;
        ge.ioxu[246] = -4986500994452835063L;
        ge.ioxu[247] = -5434097502054752390L;
        ge.ioxu[248] = 3498619781996248949L;
        ge.ioxu[249] = -1101070901531256601L;
        ge.ioxu[250] = -2447410895286534858L;
        ge.ioxu[251] = -3967982685842145979L;
        ge.ioxu[252] = 5328535497644317596L;
        ge.ioxu[253] = -3728523364675800909L;
        ge.ioxu[254] = -4297150029401380941L;
        ge.ioxu[255] = -432717465161718617L;
        ge.ioxu[256] = 7523739643548160880L;
        ge.ioxu[257] = -5268244717475410588L;
        ge.ioxu[258] = 3521034682116366461L;
        ge.ioxu[259] = 6950969916054970190L;
        ge.ioxu[260] = -4933524581841919645L;
        ge.ioxu[261] = 9208804602137156362L;
        ge.ioxu[262] = 6387056623127224603L;
        ge.ioxu[263] = 2203496829576819992L;
        ge.ioxu[264] = -8597294761767965048L;
        ge.ioxu[265] = -3135554738459087719L;
        ge.ioxu[266] = -5434491326303978373L;
        ge.ioxu[267] = -1764624020638833299L;
        ge.ioxu[268] = 6214399012369267515L;
        ge.ioxu[269] = 8295556651761849233L;
        ge.ioxu[270] = 6314735655991063983L;
        ge.ioxu[271] = -3249295506540169578L;
        ge.ioxu[272] = -4442695716793753334L;
        ge.ioxu[273] = 6136316111935340030L;
        ge.ioxu[274] = -2927382753905484614L;
        ge.ioxu[275] = 8543755254294008039L;
        ge.ioxu[276] = 2560891800737237883L;
        ge.ioxu[277] = -6647136672657893195L;
        ge.ioxu[278] = 1379834580748895504L;
        ge.ioxu[279] = 6122725835072187890L;
        ge.ioxu[280] = -8850204958031786317L;
        ge.ioxu[281] = -4424095816969363523L;
        ge.ioxu[282] = 2690925325638867963L;
        ge.ioxu[283] = 247979972008934871L;
        ge.ioxu[284] = -2480430913804027842L;
        ge.ioxu[285] = -8783441717357503518L;
        ge.ioxu[286] = 5456839503665941066L;
        ge.ioxu[287] = 1134164245160437406L;
        ge.ioxu[288] = 662494189139776387L;
        ge.ioxu[289] = 3403622535008429669L;
        ge.ioxu[290] = 3000317246084765627L;
        ge.ioxu[291] = -410676961374937592L;
        ge.ioxu[292] = 3715001370489812839L;
        ge.ioxu[293] = 8482499305002763341L;
        ge.ioxu[294] = 2164946337895562086L;
        ge.ioxu[295] = -7170576181815276515L;
        ge.ioxu[296] = 5019599878494938914L;
        ge.ioxu[297] = 8570033504774057700L;
        ge.ioxu[298] = -5856984810349064920L;
        ge.ioxu[299] = 663908190721334918L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ge() {
        var2_1 /* !! */  = ge.b;
        super("Spider", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u043b\u0430\u0437\u0438\u0442\u044c \u043f\u043e \u0441\u0442\u0435\u043d\u0430\u043c", du.MOVEMENT);
        this.stopWatch = new pr();
        this.lightningTimer = new pr();
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0438\u0440\u0430\u0435\u0442 \u0440\u0435\u0436\u0438\u043c", "SpookyTime", new String[]{"SpookyTime", "FunTime", "Funtime \u0413\u0440\u043e\u043c\u043e\u043e\u0442\u0432\u043e\u0434\u044b", "Slime Block", "Water Bucket"});
        this.startSetPitch = ge.ioxe("ioxf", ioxa(int ), (int)0);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxh", ioxa(int ), (int)1);
            }
lbl14:
            // 3 sources

            case 1: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxi", ioxa(int ), (int)2);
                ** GOTO lbl28
            }
lbl17:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxj", ioxa(int ), (int)3);
                ** GOTO lbl23
            }
            case 3: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxl", ioxa(int ), (int)4);
                break;
            }
lbl23:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxm", ioxa(int ), (int)5);
                ** GOTO lbl17
            }
            case 5: {
                var2_1 /* !! */  = (int)ge.ioxe("ioxn", ioxa(int ), (int)6);
            }
lbl28:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ge.ioxe("ioxo", ioxa(int ), (int)7);
                    ** GOTO lbl14
                    break;
                }
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)ge.ioxe("ioxq", ioxa(int ), (int)8);
        ** while (true)
    }

    private static /* synthetic */ void ittq() {
        ge.ioxc[800] = 1514034610;
        ge.ioxc[801] = 128594444;
        ge.ioxc[802] = 926546534;
        ge.ioxc[803] = 804572919;
        ge.ioxc[804] = 1565758986;
        ge.ioxc[805] = 1016787781;
        ge.ioxc[806] = -1803237281;
        ge.ioxc[807] = 1097786686;
        ge.ioxc[808] = 1096736300;
        ge.ioxc[809] = -2137380755;
        ge.ioxc[810] = -1284109716;
        ge.ioxc[811] = 836690325;
        ge.ioxc[812] = 463620209;
        ge.ioxc[813] = -1292786038;
        ge.ioxc[814] = 680451739;
        ge.ioxc[815] = 216872931;
        ge.ioxc[816] = -1288651801;
        ge.ioxc[817] = 410719795;
        ge.ioxc[818] = 477368769;
        ge.ioxc[819] = -504854338;
        ge.ioxc[820] = 1416652137;
        ge.ioxc[821] = -2020599356;
        ge.ioxc[822] = 2051659618;
        ge.ioxc[823] = 57043155;
        ge.ioxc[824] = 1024583313;
        ge.ioxc[825] = -595455057;
        ge.ioxc[826] = 1978241219;
        ge.ioxc[827] = -2112609604;
        ge.ioxc[828] = -1240647076;
        ge.ioxc[829] = -1194595636;
        ge.ioxc[830] = 237551242;
        ge.ioxc[831] = 1856986589;
        ge.ioxc[832] = 885201774;
        ge.ioxc[833] = -2034005368;
        ge.ioxc[834] = -1734991362;
        ge.ioxc[835] = 1225011727;
        ge.ioxc[836] = 723951685;
        ge.ioxc[837] = -123660854;
        ge.ioxc[838] = 1359558859;
        ge.ioxc[839] = -1530074144;
        ge.ioxc[840] = -155994272;
        ge.ioxc[841] = -707636670;
        ge.ioxc[842] = 543372475;
        ge.ioxc[843] = 878472105;
        ge.ioxc[844] = 188816517;
        ge.ioxc[845] = -2099360325;
        ge.ioxc[846] = 2037165174;
        ge.ioxc[847] = 1100014398;
        ge.ioxc[848] = -1631353534;
        ge.ioxc[849] = -667257169;
    }

    private static /* synthetic */ void irvo() {
        ge.ioxc[600] = -1140051166;
        ge.ioxc[601] = -1329432317;
        ge.ioxc[602] = -917454154;
        ge.ioxc[603] = -815393643;
        ge.ioxc[604] = -1185617974;
        ge.ioxc[605] = 1571527913;
        ge.ioxc[606] = 1790772502;
        ge.ioxc[607] = -293671847;
        ge.ioxc[608] = 1178656458;
        ge.ioxc[609] = -366600065;
        ge.ioxc[610] = -1305061734;
        ge.ioxc[611] = 1132901391;
        ge.ioxc[612] = 1630489399;
        ge.ioxc[613] = 204791359;
        ge.ioxc[614] = 302620677;
        ge.ioxc[615] = 664315074;
        ge.ioxc[616] = -947848815;
        ge.ioxc[617] = -766120513;
        ge.ioxc[618] = 1931237952;
        ge.ioxc[619] = 1904597057;
        ge.ioxc[620] = -2106779205;
        ge.ioxc[621] = 351688177;
        ge.ioxc[622] = -717979798;
        ge.ioxc[623] = -1987509271;
        ge.ioxc[624] = 1989590794;
        ge.ioxc[625] = 1705291867;
        ge.ioxc[626] = -1056860999;
        ge.ioxc[627] = -908814656;
        ge.ioxc[628] = -1862542099;
        ge.ioxc[629] = -1052051737;
        ge.ioxc[630] = 1850868914;
        ge.ioxc[631] = -723083884;
        ge.ioxc[632] = 1395499201;
        ge.ioxc[633] = 1615495303;
        ge.ioxc[634] = 23368751;
        ge.ioxc[635] = 1447616120;
        ge.ioxc[636] = 2020791852;
        ge.ioxc[637] = -207430495;
        ge.ioxc[638] = -416729968;
        ge.ioxc[639] = 1446713898;
        ge.ioxc[640] = 1916143146;
        ge.ioxc[641] = -199951106;
        ge.ioxc[642] = 1997729596;
        ge.ioxc[643] = -1618860913;
        ge.ioxc[644] = 1182216677;
        ge.ioxc[645] = 631087900;
        ge.ioxc[646] = -258301458;
        ge.ioxc[647] = 1708277941;
        ge.ioxc[648] = -1339141729;
        ge.ioxc[649] = -1559372774;
        ge.ioxc[650] = -765759010;
        ge.ioxc[651] = -651680738;
        ge.ioxc[652] = -1995150052;
        ge.ioxc[653] = 877659119;
        ge.ioxc[654] = 141535793;
        ge.ioxc[655] = -1471734459;
        ge.ioxc[656] = -1818291301;
        ge.ioxc[657] = 819697211;
        ge.ioxc[658] = -1545259764;
        ge.ioxc[659] = 1946107078;
        ge.ioxc[660] = 1500603048;
        ge.ioxc[661] = -1550957282;
        ge.ioxc[662] = 1357175145;
        ge.ioxc[663] = 328778708;
        ge.ioxc[664] = -2935044;
        ge.ioxc[665] = 1372983149;
        ge.ioxc[666] = 1296496599;
        ge.ioxc[667] = -1060733590;
        ge.ioxc[668] = 1927954365;
        ge.ioxc[669] = 898705203;
        ge.ioxc[670] = -568484308;
        ge.ioxc[671] = -429315058;
        ge.ioxc[672] = -375156286;
        ge.ioxc[673] = 1128544341;
        ge.ioxc[674] = -1835840128;
        ge.ioxc[675] = 353889984;
        ge.ioxc[676] = -716530139;
        ge.ioxc[677] = -1373603191;
        ge.ioxc[678] = -648420888;
        ge.ioxc[679] = -1921175775;
        ge.ioxc[680] = 426873470;
        ge.ioxc[681] = 1129166521;
        ge.ioxc[682] = -1632020625;
        ge.ioxc[683] = 1765509920;
        ge.ioxc[684] = -1273125925;
        ge.ioxc[685] = 481045934;
        ge.ioxc[686] = 119302462;
        ge.ioxc[687] = -1793972058;
        ge.ioxc[688] = -222962266;
        ge.ioxc[689] = 794799894;
        ge.ioxc[690] = -389037874;
        ge.ioxc[691] = -2095126799;
        ge.ioxc[692] = 1514807841;
        ge.ioxc[693] = 378211665;
        ge.ioxc[694] = -891900190;
        ge.ioxc[695] = 1390959781;
        ge.ioxc[696] = -642417706;
        ge.ioxc[697] = 763932132;
        ge.ioxc[698] = 2002225599;
        ge.ioxc[699] = 1364773464;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setStartSetPitch(boolean bl2) {
        boolean bl3;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qc - ge.ioxe("irpe", ioxs(int ), (int)510)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ge.ioxe("irpf", ioxa(int ), (int)779)) break;
            object = ge.ioxe("irpg", ioxa(int ), (int)780);
        }
        boolean bl4 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = qc - ge.ioxe("irph", ioxs(int ), (int)511)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ge.ioxe("irpi", ioxa(int ), (int)781)) break;
            object = ge.ioxe("irpj", ioxa(int ), (int)782);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = qc - ge.ioxe("irpk", ioxs(int ), (int)512)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ge.ioxe("irpl", ioxa(int ), (int)783)) {
                bl3 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object = ge.ioxe("irpm", ioxa(int ), (int)784);
        }
        if (bl3 || bl3) return;
        while (true) {
            Object object;
            block7: {
                long l5;
                if ((object = (l5 = qc - ge.ioxe("irpn", ioxs(int ), (int)513)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == ge.ioxe("irpo", ioxa(int ), (int)785)) {
                    this.startSetPitch = bl2;
                    if (!bl3) return;
                }
                break block7;
                return;
            }
            object = ge.ioxe("irpp", ioxa(int ), (int)786);
        }
    }

    private static /* synthetic */ void irup() {
        ge.ioxc[100] = -31116268;
        ge.ioxc[101] = -456663859;
        ge.ioxc[102] = -296196144;
        ge.ioxc[103] = -1505904987;
        ge.ioxc[104] = -1924686722;
        ge.ioxc[105] = 1737793471;
        ge.ioxc[106] = 474407160;
        ge.ioxc[107] = -150012199;
        ge.ioxc[108] = 1392888620;
        ge.ioxc[109] = -1243273588;
        ge.ioxc[110] = -761869385;
        ge.ioxc[111] = 326859886;
        ge.ioxc[112] = -2114259713;
        ge.ioxc[113] = 494884257;
        ge.ioxc[114] = -43009648;
        ge.ioxc[115] = 185891397;
        ge.ioxc[116] = -1261786233;
        ge.ioxc[117] = -1128451678;
        ge.ioxc[118] = -1887300568;
        ge.ioxc[119] = 1099089293;
        ge.ioxc[120] = 1290212774;
        ge.ioxc[121] = 1116412880;
        ge.ioxc[122] = 520244237;
        ge.ioxc[123] = -441289169;
        ge.ioxc[124] = 1893879786;
        ge.ioxc[125] = 1515727107;
        ge.ioxc[126] = 635219245;
        ge.ioxc[127] = -161464517;
        ge.ioxc[128] = 284997410;
        ge.ioxc[129] = 343226813;
        ge.ioxc[130] = 1353213543;
        ge.ioxc[131] = -1465738796;
        ge.ioxc[132] = 681083742;
        ge.ioxc[133] = -776473243;
        ge.ioxc[134] = 1907963433;
        ge.ioxc[135] = -1638805519;
        ge.ioxc[136] = -586715462;
        ge.ioxc[137] = 352882615;
        ge.ioxc[138] = 1496136857;
        ge.ioxc[139] = 77212402;
        ge.ioxc[140] = 693058755;
        ge.ioxc[141] = -1172130957;
        ge.ioxc[142] = -1195045245;
        ge.ioxc[143] = -2055539752;
        ge.ioxc[144] = -1688603875;
        ge.ioxc[145] = -733277142;
        ge.ioxc[146] = -670833190;
        ge.ioxc[147] = -2023133997;
        ge.ioxc[148] = -2103969586;
        ge.ioxc[149] = 1942054978;
        ge.ioxc[150] = 1259949494;
        ge.ioxc[151] = -63381816;
        ge.ioxc[152] = -1377148787;
        ge.ioxc[153] = -1377745982;
        ge.ioxc[154] = -1221674684;
        ge.ioxc[155] = 1423565390;
        ge.ioxc[156] = -2093881246;
        ge.ioxc[157] = 1125619358;
        ge.ioxc[158] = 3449254;
        ge.ioxc[159] = -280853218;
        ge.ioxc[160] = -1095223035;
        ge.ioxc[161] = -1544891355;
        ge.ioxc[162] = -1606438158;
        ge.ioxc[163] = 871019249;
        ge.ioxc[164] = -739621500;
        ge.ioxc[165] = -575666609;
        ge.ioxc[166] = 714690215;
        ge.ioxc[167] = -1182864516;
        ge.ioxc[168] = -610859160;
        ge.ioxc[169] = 1885819017;
        ge.ioxc[170] = 779886879;
        ge.ioxc[171] = -1158325571;
        ge.ioxc[172] = 884050714;
        ge.ioxc[173] = 1306437846;
        ge.ioxc[174] = 1789294908;
        ge.ioxc[175] = -780607330;
        ge.ioxc[176] = 1580658193;
        ge.ioxc[177] = 1591854697;
        ge.ioxc[178] = 1343689056;
        ge.ioxc[179] = 1173531338;
        ge.ioxc[180] = 704520567;
        ge.ioxc[181] = 1110085268;
        ge.ioxc[182] = 375406871;
        ge.ioxc[183] = 794903797;
        ge.ioxc[184] = 1044415901;
        ge.ioxc[185] = 1781891392;
        ge.ioxc[186] = -901199837;
        ge.ioxc[187] = 2092318999;
        ge.ioxc[188] = 2015613398;
        ge.ioxc[189] = -1058022878;
        ge.ioxc[190] = -316479217;
        ge.ioxc[191] = -2103145023;
        ge.ioxc[192] = 697731783;
        ge.ioxc[193] = -381346166;
        ge.ioxc[194] = 2083403649;
        ge.ioxc[195] = 1348540969;
        ge.ioxc[196] = -88093749;
        ge.ioxc[197] = 256366679;
        ge.ioxc[198] = -1336783948;
        ge.ioxc[199] = -42496888;
    }

    private static /* synthetic */ double ipdf(int n2) {
        return Double.longBitsToDouble(ioxt[n2] ^ ioxu[n2]);
    }

    private static /* synthetic */ void ituk() {
        ge.ioxu[400] = -3570448854549768258L;
        ge.ioxu[401] = 1771377695399295019L;
        ge.ioxu[402] = -8242361416739613612L;
        ge.ioxu[403] = -8011793014510968362L;
        ge.ioxu[404] = -6062296863959305687L;
        ge.ioxu[405] = -3288357310773320813L;
        ge.ioxu[406] = -4463630090249476511L;
        ge.ioxu[407] = 3573376402070649366L;
        ge.ioxu[408] = -6619877154875147942L;
        ge.ioxu[409] = 4457353484722938136L;
        ge.ioxu[410] = -853690369969634202L;
        ge.ioxu[411] = -4459461612657785032L;
        ge.ioxu[412] = 4510574434870317528L;
        ge.ioxu[413] = 3279825754940070536L;
        ge.ioxu[414] = 7419880173075071873L;
        ge.ioxu[415] = 4463393890236735910L;
        ge.ioxu[416] = -6259670995570396009L;
        ge.ioxu[417] = 6336434025008300263L;
        ge.ioxu[418] = 1703774748616040772L;
        ge.ioxu[419] = -5436763834386942075L;
        ge.ioxu[420] = -6641099348485703697L;
        ge.ioxu[421] = -2168402097659184347L;
        ge.ioxu[422] = -1727154717571410739L;
        ge.ioxu[423] = 4437961326995412559L;
        ge.ioxu[424] = -2223471143621695329L;
        ge.ioxu[425] = -5034513244800095564L;
        ge.ioxu[426] = 8098800142770231767L;
        ge.ioxu[427] = 6743063111456421299L;
        ge.ioxu[428] = -5773819895067822043L;
        ge.ioxu[429] = 679319097429411814L;
        ge.ioxu[430] = 4842483736133421141L;
        ge.ioxu[431] = -8844478575357071170L;
        ge.ioxu[432] = 4596174705520454443L;
        ge.ioxu[433] = 4514534086010154383L;
        ge.ioxu[434] = 6799034376105082383L;
        ge.ioxu[435] = 2755772394064087719L;
        ge.ioxu[436] = -5233041378113296346L;
        ge.ioxu[437] = 4070788971069026897L;
        ge.ioxu[438] = -6497340732603238829L;
        ge.ioxu[439] = 5590569382241401169L;
        ge.ioxu[440] = 4612039648880081611L;
        ge.ioxu[441] = 398873502023593800L;
        ge.ioxu[442] = -6523856489878252394L;
        ge.ioxu[443] = -5299360071333013968L;
        ge.ioxu[444] = 8482034262889571064L;
        ge.ioxu[445] = -4881204895497440429L;
        ge.ioxu[446] = -4725669965811790643L;
        ge.ioxu[447] = 4235045185194735903L;
        ge.ioxu[448] = 9018708993952252429L;
        ge.ioxu[449] = 4958699826560832451L;
        ge.ioxu[450] = 2494258169881208543L;
        ge.ioxu[451] = 4009179002831921644L;
        ge.ioxu[452] = 2581729645253986752L;
        ge.ioxu[453] = 7800755747153433826L;
        ge.ioxu[454] = -5644469149214679169L;
        ge.ioxu[455] = 4317602945716025764L;
        ge.ioxu[456] = -4294243685194589846L;
        ge.ioxu[457] = -9116263130296773872L;
        ge.ioxu[458] = 7495595005354857811L;
        ge.ioxu[459] = 4423989814843314840L;
        ge.ioxu[460] = -3582256431986569217L;
        ge.ioxu[461] = 5330104330081933276L;
        ge.ioxu[462] = 586662799305581009L;
        ge.ioxu[463] = 3430347405529365919L;
        ge.ioxu[464] = -2281070444139980853L;
        ge.ioxu[465] = -5207954876604467653L;
        ge.ioxu[466] = -5401819549942716076L;
        ge.ioxu[467] = -5623405977637637409L;
        ge.ioxu[468] = -4629504637789065478L;
        ge.ioxu[469] = -5042840135486195695L;
        ge.ioxu[470] = -2166509642702568215L;
        ge.ioxu[471] = 5893063931571256160L;
        ge.ioxu[472] = 3463226945416163169L;
        ge.ioxu[473] = 6320619808851538036L;
        ge.ioxu[474] = 8391040423507273306L;
        ge.ioxu[475] = 8049570682510985468L;
        ge.ioxu[476] = -2931565238200886064L;
        ge.ioxu[477] = -1096220258953707026L;
        ge.ioxu[478] = -4195140256425049757L;
        ge.ioxu[479] = 4094759386444071818L;
        ge.ioxu[480] = -4557224487581938834L;
        ge.ioxu[481] = 334737388656903512L;
        ge.ioxu[482] = -1841737216708696023L;
        ge.ioxu[483] = -4199821632366748576L;
        ge.ioxu[484] = 8272828461972512418L;
        ge.ioxu[485] = -7365024411245759485L;
        ge.ioxu[486] = 5564042264816174131L;
        ge.ioxu[487] = 1608614670379873148L;
        ge.ioxu[488] = -6324791346704013189L;
        ge.ioxu[489] = -219581554474989417L;
        ge.ioxu[490] = -4011904944588807071L;
        ge.ioxu[491] = 571684267151493777L;
        ge.ioxu[492] = -8163935771795641855L;
        ge.ioxu[493] = -4409872655778546658L;
        ge.ioxu[494] = -8233315477039433391L;
        ge.ioxu[495] = 7518150277256661038L;
        ge.ioxu[496] = 2673841644477856116L;
        ge.ioxu[497] = -2179559877972261350L;
        ge.ioxu[498] = -7075588525044967881L;
        ge.ioxu[499] = 5967245456016277802L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleSpookyTimeMode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("iqpe", ioxs(int ), (int)244)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("iqpf", ioxa(int ), (int)370)) break;
            v0 /* !! */  = (long)ge.ioxe("iqpg", ioxa(int ), (int)371);
        }
        var3_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("iqph", ioxs(int ), (int)245)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("iqpi", ioxa(int ), (int)372)) break;
            v1 /* !! */  = (long)ge.ioxe("iqpj", ioxa(int ), (int)373);
        }
        var2_2 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl17
        block131: while (true) {
            v2 /* !! */  = (long)(ge.ioxe("iqpl", ioxs(int ), (int)247) - ge.ioxe("iqpk", ioxs(int ), (int)246));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -239756314: {
                    break block131;
                }
                case 383717712: {
                    continue block131;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl25:
            // 9 sources

            return;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v3 /* !! */  = ge.qc;
                if (true) ** GOTO lbl36
                block133: while (true) {
                    v3 /* !! */  = (long)(v4 - ge.ioxe("iqpm", ioxs(int ), (int)248));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -712779441: {
                            v4 = ge.ioxe("iqpn", ioxs(int ), (int)249);
                            continue block133;
                        }
                        case -239756314: {
                            break block133;
                        }
                        case 469835254: {
                            v4 = ge.ioxe("iqpo", ioxs(int ), (int)250);
                            continue block133;
                        }
                        case 702995461: {
                            v4 = ge.ioxe("iqpp", ioxs(int ), (int)251);
                            continue block133;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("iqpq", ioxs(int ), (int)252)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ge.ioxe("iqpr", ioxa(int ), (int)374)) break;
                    v5 /* !! */  = (long)ge.ioxe("iqps", ioxa(int ), (int)375);
                }
                v6 = ge.mc.field_1724;
                v7 /* !! */  = ge.qc;
                if (true) ** GOTO lbl58
                block135: while (true) {
                    v7 /* !! */  = (long)(ge.ioxe("iqpu", ioxs(int ), (int)254) - ge.ioxe("iqpt", ioxs(int ), (int)253));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -239756314: {
                            break block135;
                        }
                        case 428796409: {
                            continue block135;
                        }
                    }
                    break;
                }
                v8 = v6.method_6047();
                v9 /* !! */  = ge.qc;
                if (true) ** GOTO lbl68
                block136: while (true) {
                    v9 /* !! */  = (long)(ge.ioxe("iqpw", ioxs(int ), (int)256) - ge.ioxe("iqpv", ioxs(int ), (int)255));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -502299497: {
                            continue block136;
                        }
                        case -239756314: {
                            break block136;
                        }
                    }
                    break;
                }
                v10 = v8.method_7909();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ge.qc - ge.ioxe("iqpx", ioxs(int ), (int)257)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ge.ioxe("iqpy", ioxa(int ), (int)376)) break;
                    v11 /* !! */  = (long)ge.ioxe("iqpz", ioxa(int ), (int)377);
                }
                if (v10 != class_1802.field_8705) ** GOTO lbl423
                if (var1_3) ** GOTO lbl25
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = ge.qc - ge.ioxe("iqqa", ioxs(int ), (int)258)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ge.ioxe("iqqb", ioxa(int ), (int)378)) break;
                    v12 /* !! */  = (long)ge.ioxe("iqqc", ioxa(int ), (int)379);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = ge.qc - ge.ioxe("iqqd", ioxs(int ), (int)259)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ge.ioxe("iqqe", ioxa(int ), (int)380)) break;
                    v13 /* !! */  = (long)ge.ioxe("iqqf", ioxa(int ), (int)381);
                }
                v14 = ge.mc.field_1724;
                v15 /* !! */  = ge.qc;
                if (true) ** GOTO lbl96
                block140: while (true) {
                    v15 /* !! */  = (long)(v16 - ge.ioxe("iqqg", ioxs(int ), (int)260));
lbl96:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2040019657: {
                            v16 = ge.ioxe("iqqh", ioxs(int ), (int)261);
                            continue block140;
                        }
                        case -239756314: {
                            break block140;
                        }
                        case -194513734: {
                            v16 = ge.ioxe("iqqi", ioxs(int ), (int)262);
                            continue block140;
                        }
                        case 612755481: {
                            v16 = ge.ioxe("iqqj", ioxs(int ), (int)263);
                            continue block140;
                        }
                    }
                    break;
                }
                if (!v14.field_5976) ** GOTO lbl423
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = ge.qc - ge.ioxe("iqqk", ioxs(int ), (int)264)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ge.ioxe("iqql", ioxa(int ), (int)382)) break;
                    v17 /* !! */  = (long)ge.ioxe("iqqm", ioxa(int ), (int)383);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = ge.qc - ge.ioxe("iqqn", ioxs(int ), (int)265)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ge.ioxe("iqqo", ioxa(int ), (int)384)) break;
                    v18 /* !! */  = (long)ge.ioxe("iqqp", ioxa(int ), (int)385);
                }
                v19 = ge.mc.field_1724;
                v20 /* !! */  = ge.qc;
                if (true) ** GOTO lbl125
                block143: while (true) {
                    v20 /* !! */  = (long)(v21 - ge.ioxe("iqqq", ioxs(int ), (int)266));
lbl125:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -239756314: {
                            break block143;
                        }
                        case 1014056690: {
                            v21 = ge.ioxe("iqqr", ioxs(int ), (int)267);
                            continue block143;
                        }
                        case 1497185353: {
                            v21 = ge.ioxe("iqqs", ioxs(int ), (int)268);
                            continue block143;
                        }
                        case 1561678808: {
                            v21 = ge.ioxe("iqqt", ioxs(int ), (int)269);
                            continue block143;
                        }
                    }
                    break;
                }
                v22 = v19.field_3944;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = ge.qc - ge.ioxe("iqqu", ioxs(int ), (int)270)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ge.ioxe("iqqv", ioxa(int ), (int)386)) break;
                    v23 /* !! */  = (long)ge.ioxe("iqqw", ioxa(int ), (int)387);
                }
                v24 /* !! */  = ge.qc;
                if (true) ** GOTO lbl147
                block145: while (true) {
                    v24 /* !! */  = (long)(ge.ioxe("iqqy", ioxs(int ), (int)272) - ge.ioxe("iqqx", ioxs(int ), (int)271));
lbl147:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -239756314: {
                            break block145;
                        }
                        case 1665969050: {
                            continue block145;
                        }
                    }
                    break;
                }
                v25 = ge.ioxe("iqqz", ioxa(int ), (int)388);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_9 = ge.qc - ge.ioxe("iqra", ioxs(int ), (int)273)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ge.ioxe("iqrb", ioxa(int ), (int)389)) break;
                    v26 /* !! */  = (long)ge.ioxe("iqrc", ioxa(int ), (int)390);
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_10 = ge.qc - ge.ioxe("iqrd", ioxs(int ), (int)274)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ge.ioxe("iqre", ioxa(int ), (int)391)) break;
                    v27 /* !! */  = (long)ge.ioxe("iqrf", ioxa(int ), (int)392);
                }
                v28 = ge.mc.field_1724;
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_11 = ge.qc - ge.ioxe("iqrg", ioxs(int ), (int)275)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ge.ioxe("iqrh", ioxa(int ), (int)393)) break;
                    v29 /* !! */  = (long)ge.ioxe("iqri", ioxa(int ), (int)394);
                }
                v30 = v28.method_36454();
                v31 /* !! */  = ge.qc;
                if (true) ** GOTO lbl174
                block149: while (true) {
                    v31 /* !! */  = (long)(v32 - ge.ioxe("iqrj", ioxs(int ), (int)276));
lbl174:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -239756314: {
                            break block149;
                        }
                        case 1162017033: {
                            v32 = ge.ioxe("iqrk", ioxs(int ), (int)277);
                            continue block149;
                        }
                        case 2131674929: {
                            v32 = ge.ioxe("iqrl", ioxs(int ), (int)278);
                            continue block149;
                        }
                    }
                    break;
                }
                v33 /* !! */  = ge.qc;
                if (true) ** GOTO lbl187
                block150: while (true) {
                    v33 /* !! */  = (long)(v34 - ge.ioxe("iqrm", ioxs(int ), (int)279));
lbl187:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -239756314: {
                            break block150;
                        }
                        case -205345515: {
                            v34 = ge.ioxe("iqrn", ioxs(int ), (int)280);
                            continue block150;
                        }
                        case 809317921: {
                            v34 = ge.ioxe("iqro", ioxs(int ), (int)281);
                            continue block150;
                        }
                        case 1526616938: {
                            v34 = ge.ioxe("iqrp", ioxs(int ), (int)282);
                            continue block150;
                        }
                    }
                    break;
                }
                v35 = ge.mc.field_1724;
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_12 = ge.qc - ge.ioxe("iqrq", ioxs(int ), (int)283)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == ge.ioxe("iqrr", ioxa(int ), (int)395)) break;
                    v36 /* !! */  = (long)ge.ioxe("iqrs", ioxa(int ), (int)396);
                }
                v37 = v35.method_36455();
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_13 = ge.qc - ge.ioxe("iqrt", ioxs(int ), (int)284)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == ge.ioxe("iqru", ioxa(int ), (int)397)) break;
                    v38 /* !! */  = (long)ge.ioxe("iqrv", ioxa(int ), (int)398);
                }
                v39 = new class_2886(class_1268.field_5808, (int)v25, v30, v37);
                v40 /* !! */  = ge.qc;
                if (true) ** GOTO lbl216
                block153: while (true) {
                    v40 /* !! */  = (long)(v41 - ge.ioxe("iqrw", ioxs(int ), (int)285));
lbl216:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -239756314: {
                            break block153;
                        }
                        case 1034209108: {
                            v41 = ge.ioxe("iqrx", ioxs(int ), (int)286);
                            continue block153;
                        }
                        case 1146656040: {
                            v41 = ge.ioxe("iqry", ioxs(int ), (int)287);
                            continue block153;
                        }
                        case 1337084296: {
                            v41 = ge.ioxe("iqrz", ioxs(int ), (int)288);
                            continue block153;
                        }
                    }
                    break;
                }
                v22.method_52787((class_2596)v39);
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_14 = ge.qc - ge.ioxe("iqsa", ioxs(int ), (int)289)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == ge.ioxe("iqsb", ioxa(int ), (int)399)) break;
                    v42 /* !! */  = (long)ge.ioxe("iqsc", ioxa(int ), (int)400);
                }
                v43 /* !! */  = ge.qc;
                if (true) ** GOTO lbl239
                block155: while (true) {
                    v43 /* !! */  = (long)(v44 - ge.ioxe("iqsd", ioxs(int ), (int)290));
lbl239:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1282719113: {
                            v44 = ge.ioxe("iqse", ioxs(int ), (int)291);
                            continue block155;
                        }
                        case -239756314: {
                            break block155;
                        }
                        case 1294428753: {
                            v44 = ge.ioxe("iqsf", ioxs(int ), (int)292);
                            continue block155;
                        }
                    }
                    break;
                }
                v45 = ge.mc.field_1724;
                v46 /* !! */  = ge.qc;
                if (true) ** GOTO lbl253
                block156: while (true) {
                    v46 /* !! */  = (long)(v47 - ge.ioxe("iqsg", ioxs(int ), (int)293));
lbl253:
                    // 2 sources

                    switch ((int)v46 /* !! */ ) {
                        case -239756314: {
                            break block156;
                        }
                        case 13508222: {
                            v47 = ge.ioxe("iqsh", ioxs(int ), (int)294);
                            continue block156;
                        }
                        case 1581685383: {
                            v47 = ge.ioxe("iqsi", ioxs(int ), (int)295);
                            continue block156;
                        }
                    }
                    break;
                }
                v48 = v45.field_3944;
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_15 = ge.qc - ge.ioxe("iqsj", ioxs(int ), (int)296)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == ge.ioxe("iqsk", ioxa(int ), (int)401)) break;
                    v49 /* !! */  = (long)ge.ioxe("iqsl", ioxa(int ), (int)402);
                }
                v50 /* !! */  = ge.qc;
                if (true) ** GOTO lbl272
                block158: while (true) {
                    v50 /* !! */  = (long)(v51 - ge.ioxe("iqsm", ioxs(int ), (int)297));
lbl272:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -557119684: {
                            v51 = ge.ioxe("iqsn", ioxs(int ), (int)298);
                            continue block158;
                        }
                        case -239756314: {
                            break block158;
                        }
                        case 1224570868: {
                            v51 = ge.ioxe("iqso", ioxs(int ), (int)299);
                            continue block158;
                        }
                        case 1903527994: {
                            v51 = ge.ioxe("iqsp", ioxs(int ), (int)300);
                            continue block158;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v52 /* !! */  = (cfr_temp_16 = ge.qc - ge.ioxe("iqsq", ioxs(int ), (int)301)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v52 /* !! */  == ge.ioxe("iqsr", ioxa(int ), (int)403)) break;
                    v52 /* !! */  = (long)ge.ioxe("iqss", ioxa(int ), (int)404);
                }
                v53 = new class_2879(class_1268.field_5808);
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_17 = ge.qc - ge.ioxe("iqst", ioxs(int ), (int)302)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == ge.ioxe("iqsu", ioxa(int ), (int)405)) break;
                    v54 /* !! */  = (long)ge.ioxe("iqsv", ioxa(int ), (int)406);
                }
                v48.method_52787((class_2596)v53);
                if (var1_3 || var1_3) ** GOTO lbl25
                v55 /* !! */  = ge.qc;
                if (true) ** GOTO lbl301
                block161: while (true) {
                    v55 /* !! */  = (long)(v56 - ge.ioxe("iqsw", ioxs(int ), (int)303));
lbl301:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -344318848: {
                            v56 = ge.ioxe("iqsx", ioxs(int ), (int)304);
                            continue block161;
                        }
                        case -239756314: {
                            break block161;
                        }
                        case 1482455446: {
                            v56 = ge.ioxe("iqsy", ioxs(int ), (int)305);
                            continue block161;
                        }
                        case 1805518815: {
                            v56 = ge.ioxe("iqsz", ioxs(int ), (int)306);
                            continue block161;
                        }
                    }
                    break;
                }
                v57 /* !! */  = ge.qc;
                if (true) ** GOTO lbl317
                block162: while (true) {
                    v57 /* !! */  = (long)(v58 - ge.ioxe("iqta", ioxs(int ), (int)307));
lbl317:
                    // 2 sources

                    switch ((int)v57 /* !! */ ) {
                        case -1006430669: {
                            v58 = ge.ioxe("iqtb", ioxs(int ), (int)308);
                            continue block162;
                        }
                        case -239756314: {
                            break block162;
                        }
                        case 1915441500: {
                            v58 = ge.ioxe("iqtc", ioxs(int ), (int)309);
                            continue block162;
                        }
                    }
                    break;
                }
                v59 = ge.mc.field_1724;
                v60 /* !! */  = ge.qc;
                if (true) ** GOTO lbl331
                block163: while (true) {
                    v60 /* !! */  = (long)(v61 - ge.ioxe("iqtd", ioxs(int ), (int)310));
lbl331:
                    // 2 sources

                    switch ((int)v60 /* !! */ ) {
                        case -239756314: {
                            break block163;
                        }
                        case 282226252: {
                            v61 = ge.ioxe("iqte", ioxs(int ), (int)311);
                            continue block163;
                        }
                        case 1285983743: {
                            v61 = ge.ioxe("iqtf", ioxs(int ), (int)312);
                            continue block163;
                        }
                    }
                    break;
                }
                v62 /* !! */  = ge.qc;
                if (true) ** GOTO lbl344
                block164: while (true) {
                    v62 /* !! */  = (long)(ge.ioxe("iqth", ioxs(int ), (int)314) - ge.ioxe("iqtg", ioxs(int ), (int)313));
lbl344:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -1774053905: {
                            continue block164;
                        }
                        case -239756314: {
                            break block164;
                        }
                    }
                    break;
                }
                v63 = ge.mc.field_1724;
                while (true) {
                    if ((v64 /* !! */  = (cfr_temp_18 = ge.qc - ge.ioxe("iqti", ioxs(int ), (int)315)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v64 /* !! */  == ge.ioxe("iqtj", ioxa(int ), (int)407)) break;
                    v64 /* !! */  = (long)ge.ioxe("iqtk", ioxa(int ), (int)408);
                }
                v65 = v63.method_18798();
                while (true) {
                    if ((v66 /* !! */  = (cfr_temp_19 = ge.qc - ge.ioxe("iqtl", ioxs(int ), (int)316)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v66 /* !! */  == ge.ioxe("iqtm", ioxa(int ), (int)409)) break;
                    v66 /* !! */  = (long)ge.ioxe("iqtn", ioxa(int ), (int)410);
                }
                v67 = v65.field_1352;
                v68 = ge.ioxe("iqto", ipdf(int ), (int)317);
                v69 /* !! */  = ge.qc;
                if (true) ** GOTO lbl367
                block167: while (true) {
                    v69 /* !! */  = (long)(ge.ioxe("iqtq", ioxs(int ), (int)319) - ge.ioxe("iqtp", ioxs(int ), (int)318));
lbl367:
                    // 2 sources

                    switch ((int)v69 /* !! */ ) {
                        case -922359161: {
                            continue block167;
                        }
                        case -239756314: {
                            break block167;
                        }
                    }
                    break;
                }
                v70 /* !! */  = ge.qc;
                if (true) ** GOTO lbl376
                block168: while (true) {
                    v70 /* !! */  = (long)(ge.ioxe("iqts", ioxs(int ), (int)321) - ge.ioxe("iqtr", ioxs(int ), (int)320));
lbl376:
                    // 2 sources

                    switch ((int)v70 /* !! */ ) {
                        case -1438070055: {
                            continue block168;
                        }
                        case -239756314: {
                            break block168;
                        }
                    }
                    break;
                }
                v71 = ge.mc.field_1724;
                v72 /* !! */  = ge.qc;
                if (true) ** GOTO lbl386
                block169: while (true) {
                    v72 /* !! */  = (long)(v73 - ge.ioxe("iqtt", ioxs(int ), (int)322));
lbl386:
                    // 2 sources

                    switch ((int)v72 /* !! */ ) {
                        case -239756314: {
                            break block169;
                        }
                        case 1393135643: {
                            v73 = ge.ioxe("iqtu", ioxs(int ), (int)323);
                            continue block169;
                        }
                        case 1464946419: {
                            v73 = ge.ioxe("iqtv", ioxs(int ), (int)324);
                            continue block169;
                        }
                        case 1482105318: {
                            v73 = ge.ioxe("iqtw", ioxs(int ), (int)325);
                            continue block169;
                        }
                    }
                    break;
                }
                v74 = v71.method_18798();
                v75 /* !! */  = ge.qc;
                if (true) ** GOTO lbl403
                block170: while (true) {
                    v75 /* !! */  = (long)(v76 - ge.ioxe("iqtx", ioxs(int ), (int)326));
lbl403:
                    // 2 sources

                    switch ((int)v75 /* !! */ ) {
                        case -1460769303: {
                            v76 = ge.ioxe("iqty", ioxs(int ), (int)327);
                            continue block170;
                        }
                        case -239756314: {
                            break block170;
                        }
                        case 1561813000: {
                            v76 = ge.ioxe("iqtz", ioxs(int ), (int)328);
                            continue block170;
                        }
                        case 1572644386: {
                            v76 = ge.ioxe("iqua", ioxs(int ), (int)329);
                            continue block170;
                        }
                    }
                    break;
                }
                v77 = v74.field_1350;
                while (true) {
                    if ((v78 /* !! */  = (cfr_temp_20 = ge.qc - ge.ioxe("iqub", ioxs(int ), (int)330)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v78 /* !! */  == ge.ioxe("iquc", ioxa(int ), (int)411)) break;
                    v78 /* !! */  = (long)ge.ioxe("iqud", ioxa(int ), (int)412);
                }
                v59.method_18800(v67, (double)v68, v77);
                if (var1_3) ** GOTO lbl25
lbl423:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v79 /* !! */  = (cfr_temp_21 = ge.qc - ge.ioxe("ique", ioxs(int ), (int)331)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v79 /* !! */  == ge.ioxe("iquf", ioxa(int ), (int)413)) break;
                    v79 /* !! */  = (long)ge.ioxe("iqug", ioxa(int ), (int)414);
                }
                v80 /* !! */  = ge.qc;
                if (true) ** GOTO lbl433
                block173: while (true) {
                    v80 /* !! */  = (long)(ge.ioxe("iqui", ioxs(int ), (int)333) - ge.ioxe("iquh", ioxs(int ), (int)332));
lbl433:
                    // 2 sources

                    switch ((int)v80 /* !! */ ) {
                        case -1695623740: {
                            continue block173;
                        }
                        case -239756314: {
                            break block173;
                        }
                    }
                    break;
                }
                this.stopWatch.reset();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl442:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ge.ioxe("iquj", ioxa(int ), (int)415);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl485
                    break;
                }
            }
lbl448:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ge.ioxe("iquk", ioxa(int ), (int)416);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl453:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ge.ioxe("iqul", ioxa(int ), (int)417);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl458:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ge.ioxe("iqum", ioxa(int ), (int)418);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl463:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ge.ioxe("iqun", ioxa(int ), (int)419);
                if (!var3_1) ** GOTO lbl448
                throw null;
            }
lbl467:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ge.ioxe("iquo", ioxa(int ), (int)420);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)ge.ioxe("iqup", ioxa(int ), (int)421);
                } while (!var3_1);
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ge.ioxe("iquq", ioxa(int ), (int)422);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl485
            }
            case 8: {
                var2_2 /* !! */  = (int)ge.ioxe("iqur", ioxa(int ), (int)423);
                if (!var3_1) ** GOTO lbl453
                throw null;
            }
lbl485:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)ge.ioxe("iqus", ioxa(int ), (int)424);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl498
            }
            case 10: {
                var2_2 /* !! */  = (int)ge.ioxe("iqut", ioxa(int ), (int)425);
                if (var3_1) {
                    throw null;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)ge.ioxe("iquu", ioxa(int ), (int)426);
                if (!var3_1) ** GOTO lbl463
                throw null;
            }
lbl498:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ge.ioxe("iquv", ioxa(int ), (int)427);
                if (!var3_1) ** GOTO lbl442
                throw null;
            }
lbl502:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)ge.ioxe("iquw", ioxa(int ), (int)428);
                if (!var3_1) ** GOTO lbl458
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ge.ioxe("iqux", ioxa(int ), (int)429);
                if (!var3_1) ** GOTO lbl485
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ge.ioxe("iquy", ioxa(int ), (int)430);
        ** while (!var3_1)
lbl513:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getLightningTimer() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irqn", ioxs(int ), (int)526)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ge.ioxe("irqo", ioxa(int ), (int)798)) break;
            v0 /* !! */  = (long)ge.ioxe("irqp", ioxa(int ), (int)799);
        }
        var3_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irqq", ioxs(int ), (int)527)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ge.ioxe("irqr", ioxa(int ), (int)800)) break;
            v1 /* !! */  = (long)ge.ioxe("irqs", ioxa(int ), (int)801);
        }
        var2_2 = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("irqt", ioxs(int ), (int)528));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -810377018: {
                    v3 = ge.ioxe("irqu", ioxs(int ), (int)529);
                    continue block8;
                }
                case -674946646: {
                    v3 = ge.ioxe("irqv", ioxs(int ), (int)530);
                    continue block8;
                }
                case -239756314: {
                    break block8;
                }
                case 1519446454: {
                    v3 = ge.ioxe("irqw", ioxs(int ), (int)531);
                    continue block8;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irqx", ioxs(int ), (int)532)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ge.ioxe("irqy", ioxa(int ), (int)802)) break;
            v4 /* !! */  = (long)ge.ioxe("irqz", ioxa(int ), (int)803);
        }
        return this.lightningTimer;
    }

    private static /* synthetic */ void itua() {
        ge.ioxt[0] = -5553669030462847918L;
        ge.ioxt[1] = -6851391029452273384L;
        ge.ioxt[2] = 969608004557026084L;
        ge.ioxt[3] = 465529099971939547L;
        ge.ioxt[4] = 7920079614530503752L;
        ge.ioxt[5] = -4749078870486999537L;
        ge.ioxt[6] = 6976896665146668258L;
        ge.ioxt[7] = -3439867353203313953L;
        ge.ioxt[8] = 4703028987313634820L;
        ge.ioxt[9] = 6536094085093919165L;
        ge.ioxt[10] = -1577938532960681595L;
        ge.ioxt[11] = 2310123233931311994L;
        ge.ioxt[12] = -6007884227009413028L;
        ge.ioxt[13] = 2183357255873287434L;
        ge.ioxt[14] = -596922331008420534L;
        ge.ioxt[15] = -3698551202711325873L;
        ge.ioxt[16] = -6038371126312533547L;
        ge.ioxt[17] = 7142886675075297832L;
        ge.ioxt[18] = -7788013768911451708L;
        ge.ioxt[19] = 2332634610640450357L;
        ge.ioxt[20] = -378176802586476218L;
        ge.ioxt[21] = 746258201988097352L;
        ge.ioxt[22] = -4050284041554730714L;
        ge.ioxt[23] = -908988016086907518L;
        ge.ioxt[24] = 8408262818532919126L;
        ge.ioxt[25] = 1919334281719169309L;
        ge.ioxt[26] = 2128275674900217098L;
        ge.ioxt[27] = 8397413568482927241L;
        ge.ioxt[28] = 7017397272162452505L;
        ge.ioxt[29] = -92522884060429265L;
        ge.ioxt[30] = 2688503579735105581L;
        ge.ioxt[31] = -2220945085423936594L;
        ge.ioxt[32] = 2958402941721222362L;
        ge.ioxt[33] = 6776809004638224277L;
        ge.ioxt[34] = 7067664189113390007L;
        ge.ioxt[35] = -2010612178314404233L;
        ge.ioxt[36] = 386811452704050708L;
        ge.ioxt[37] = -8282181286617814327L;
        ge.ioxt[38] = 500518695131500925L;
        ge.ioxt[39] = 4775184060051114927L;
        ge.ioxt[40] = 7423690251216867932L;
        ge.ioxt[41] = -3477168680282096889L;
        ge.ioxt[42] = 4511224154782090063L;
        ge.ioxt[43] = 4156454030401726329L;
        ge.ioxt[44] = 5632165792712357737L;
        ge.ioxt[45] = 634532040800689263L;
        ge.ioxt[46] = -4208972455324043040L;
        ge.ioxt[47] = 4509230822123992905L;
        ge.ioxt[48] = -2053884074375134959L;
        ge.ioxt[49] = -5880282775238990168L;
        ge.ioxt[50] = -3448757128279237994L;
        ge.ioxt[51] = 8872202227508675540L;
        ge.ioxt[52] = 3812576224503775794L;
        ge.ioxt[53] = 1306639693100762749L;
        ge.ioxt[54] = 4935725343522155064L;
        ge.ioxt[55] = -6640750685369483411L;
        ge.ioxt[56] = -2523497763527322153L;
        ge.ioxt[57] = 7565733773281855988L;
        ge.ioxt[58] = 3444160081164560819L;
        ge.ioxt[59] = -5831704940174305290L;
        ge.ioxt[60] = 1501804079146381601L;
        ge.ioxt[61] = 725992377849201837L;
        ge.ioxt[62] = -7875020961318587940L;
        ge.ioxt[63] = -6964174602799386811L;
        ge.ioxt[64] = -4352202100415437855L;
        ge.ioxt[65] = 3285803481587717595L;
        ge.ioxt[66] = 4571757830160479532L;
        ge.ioxt[67] = -5077501920952057119L;
        ge.ioxt[68] = -7578552408006841692L;
        ge.ioxt[69] = 8081954456489729666L;
        ge.ioxt[70] = -1190189575010880079L;
        ge.ioxt[71] = 1777472354584129447L;
        ge.ioxt[72] = -7199625469996565686L;
        ge.ioxt[73] = 5546464344378955767L;
        ge.ioxt[74] = 5277362122410553769L;
        ge.ioxt[75] = 1037845189449819437L;
        ge.ioxt[76] = -8025838501211716627L;
        ge.ioxt[77] = 8973539551457641613L;
        ge.ioxt[78] = 7965631713120596531L;
        ge.ioxt[79] = -4368194516500357451L;
        ge.ioxt[80] = -7887052258463682079L;
        ge.ioxt[81] = -4171668946976923395L;
        ge.ioxt[82] = 2985515621524580543L;
        ge.ioxt[83] = 184389188679060607L;
        ge.ioxt[84] = 6698483509123844230L;
        ge.ioxt[85] = 8364014377060681742L;
        ge.ioxt[86] = -5162103718676479160L;
        ge.ioxt[87] = -3429399152412061167L;
        ge.ioxt[88] = -6211644521431398210L;
        ge.ioxt[89] = -7277422759607621936L;
        ge.ioxt[90] = 7288531473741849805L;
        ge.ioxt[91] = 2919358112938959948L;
        ge.ioxt[92] = -2678856755004280827L;
        ge.ioxt[93] = 5194384472814356841L;
        ge.ioxt[94] = -6600761556697575413L;
        ge.ioxt[95] = 5026135979866501498L;
        ge.ioxt[96] = -2964892157719672555L;
        ge.ioxt[97] = 9172937900209057894L;
        ge.ioxt[98] = 4327820239601129708L;
        ge.ioxt[99] = 4188754945195575340L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_2338 getBlockPos() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ge.qc - ge.ioxe("irle", ioxs(int ), (int)450)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ge.ioxe("irlf", ioxa(int ), (int)735)) break;
            v0 /* !! */  = (long)ge.ioxe("irlg", ioxa(int ), (int)736);
        }
        var3_1 = ge.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ge.qc - ge.ioxe("irlh", ioxs(int ), (int)451)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ge.ioxe("irli", ioxa(int ), (int)737)) break;
            v1 /* !! */  = (long)ge.ioxe("irlj", ioxa(int ), (int)738);
        }
        var2_2 /* !! */  = ge.b;
        v2 /* !! */  = ge.qc;
        if (true) ** GOTO lbl17
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - ge.ioxe("irlk", ioxs(int ), (int)452));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1772902035: {
                    v3 = ge.ioxe("irll", ioxs(int ), (int)453);
                    continue block27;
                }
                case -1125668397: {
                    v3 = ge.ioxe("irlm", ioxs(int ), (int)454);
                    continue block27;
                }
                case -239756314: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = ge.a;
        if (var3_1) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 = ge.ioxe("irln", ioxa(int ), (int)739);
                v5 /* !! */  = ge.qc;
                if (true) ** GOTO lbl41
                block29: while (true) {
                    v5 /* !! */  = (long)(v6 - ge.ioxe("irlo", ioxs(int ), (int)455));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -640064350: {
                            v6 = ge.ioxe("irlp", ioxs(int ), (int)456);
                            continue block29;
                        }
                        case -239756314: {
                            break block29;
                        }
                        case -163795011: {
                            v6 = ge.ioxe("irlq", ioxs(int ), (int)457);
                            continue block29;
                        }
                        case 1518330116: {
                            v6 = ge.ioxe("irlr", ioxs(int ), (int)458);
                            continue block29;
                        }
                    }
                    break;
                }
                v7 = ns.simulateLocalPlayer((int)v4);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ge.qc - ge.ioxe("irls", ioxs(int ), (int)459)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ge.ioxe("irlt", ioxa(int ), (int)740)) break;
                    v8 /* !! */  = (long)ge.ioxe("irlu", ioxa(int ), (int)741);
                }
                v9 = v7.pos;
                v10 = ge.ioxe("irlv", ipdf(int ), (int)460);
                v11 /* !! */  = ge.qc;
                if (true) ** GOTO lbl65
                block31: while (true) {
                    v11 /* !! */  = (long)(ge.ioxe("irlx", ioxs(int ), (int)462) - ge.ioxe("irlw", ioxs(int ), (int)461));
lbl65:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -878021926: {
                            continue block31;
                        }
                        case -239756314: {
                            break block31;
                        }
                    }
                    break;
                }
                v12 = v9.method_1031(0.0, (double)v10, 0.0);
                v13 /* !! */  = ge.qc;
                if (true) ** GOTO lbl75
                block32: while (true) {
                    v13 /* !! */  = (long)(ge.ioxe("irlz", ioxs(int ), (int)464) - ge.ioxe("irly", ioxs(int ), (int)463));
lbl75:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -239756314: {
                            break block32;
                        }
                        case 1312349349: {
                            continue block32;
                        }
                    }
                    break;
                }
                return class_2338.method_49638((class_2374)v12);
            }
            case 0: {
                var2_2 /* !! */  = (int)ge.ioxe("irma", ioxa(int ), (int)742);
                if (var3_1) {
                    throw null;
                }
            }
lbl85:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ge.ioxe("irmb", ioxa(int ), (int)743);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ge.ioxe("irmc", ioxa(int ), (int)744);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ge.ioxe("irmd", ioxa(int ), (int)745);
        } while (!var3_1);
        throw null;
    }
}

