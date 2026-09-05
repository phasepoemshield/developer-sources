/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1684
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.hr$TrajectoryCandidate;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.nv;

public class hr
extends ds {
    private static final float DIRECT_MAX_PITCH = 35.0f;
    private static int[] btwz;
    private class_241 serverRotation;
    private static long[] btxk;
    private boolean isThrowing;
    private static final double MAX_TRACK_DISTANCE = 256.0;
    public final kf mode;
    public final kb onlyTarget;
    public static final long ei = -4652093588355677989L;
    private static final long LOCAL_THROW_COOLDOWN_MS = 2500L;
    private int lastHandledPearlId;
    private long nextThrowAt;
    public final kb ignoreFriends;
    public static final boolean c;
    public static final int b;
    public static final boolean a;
    private static int[] btwx;
    private static final float PITCH_STEP = 0.25f;
    private static final double MIN_LANDING_DISTANCE = 11.0;
    private class_1684 targetPearl;
    private long lastTickReset;
    private static long[] btxj;
    public final ka bind;
    private static final float DIRECT_MIN_PITCH = -25.0f;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_1684 lambda$getTargetPearl$2(class_1297 var0) {
        v0 /* !! */  = hr.ei;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(hr.btxb("bwqd", btxi(int ), (int)364) - hr.btxb("bwqc", btxi(int ), (int)363));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 564022828: {
                    continue block14;
                }
                case 2083520731: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = hr.c;
        v1 /* !! */  = hr.ei;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(hr.btxb("bwqf", btxi(int ), (int)366) - hr.btxb("bwqe", btxi(int ), (int)365));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 2026162389: {
                    continue block15;
                }
                case 2083520731: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = hr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwqg", btxi(int ), (int)367)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hr.btxb("bwqh", btwu(int ), (int)947)) break;
            v2 /* !! */  = (long)hr.btxb("bwqi", btwu(int ), (int)948);
        }
        var1_3 = hr.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (class_1684)var0;
            }
lbl37:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hr.btxb("bwqj", btwu(int ), (int)949);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hr.btxb("bwqk", btwu(int ), (int)950);
                    if (!var3_1) ** GOTO lbl37
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hr.btxb("bwql", btwu(int ), (int)951);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hr.btxb("bwqm", btwu(int ), (int)952);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdo() {
        hr.btwz[400] = -1680151139;
        hr.btwz[401] = -959419121;
        hr.btwz[402] = -752805453;
        hr.btwz[403] = -569430976;
        hr.btwz[404] = 1445742984;
        hr.btwz[405] = -281916165;
        hr.btwz[406] = 1955712615;
        hr.btwz[407] = -1100870952;
        hr.btwz[408] = -1498650564;
        hr.btwz[409] = 1524559268;
        hr.btwz[410] = -580474263;
        hr.btwz[411] = 274475856;
        hr.btwz[412] = 1047624796;
        hr.btwz[413] = -1220988057;
        hr.btwz[414] = 1309039539;
        hr.btwz[415] = -112551484;
        hr.btwz[416] = 926257917;
        hr.btwz[417] = -343302915;
        hr.btwz[418] = 2013957501;
        hr.btwz[419] = -1345446128;
        hr.btwz[420] = -41706137;
        hr.btwz[421] = -1649890480;
        hr.btwz[422] = 849123673;
        hr.btwz[423] = 558244534;
        hr.btwz[424] = -1134790866;
        hr.btwz[425] = 1026060278;
        hr.btwz[426] = 1793183072;
        hr.btwz[427] = 1726826245;
        hr.btwz[428] = 400406915;
        hr.btwz[429] = 128581627;
        hr.btwz[430] = -2044108371;
        hr.btwz[431] = -1126096010;
        hr.btwz[432] = -651038777;
        hr.btwz[433] = -573518109;
        hr.btwz[434] = 1383530848;
        hr.btwz[435] = 920794606;
        hr.btwz[436] = 1052828880;
        hr.btwz[437] = 1564453789;
        hr.btwz[438] = -1238634493;
        hr.btwz[439] = -1278316683;
        hr.btwz[440] = 1121635519;
        hr.btwz[441] = 1177055346;
        hr.btwz[442] = 1933424151;
        hr.btwz[443] = -488749719;
        hr.btwz[444] = -2092078121;
        hr.btwz[445] = -640797041;
        hr.btwz[446] = 656959802;
        hr.btwz[447] = -1875743474;
        hr.btwz[448] = 6948665;
        hr.btwz[449] = 555930730;
        hr.btwz[450] = -707698867;
        hr.btwz[451] = 72174068;
        hr.btwz[452] = 233362273;
        hr.btwz[453] = 683242580;
        hr.btwz[454] = 1076863894;
        hr.btwz[455] = 2000334342;
        hr.btwz[456] = -396979976;
        hr.btwz[457] = 778329296;
        hr.btwz[458] = -158795907;
        hr.btwz[459] = 706231934;
        hr.btwz[460] = -387559711;
        hr.btwz[461] = -307460029;
        hr.btwz[462] = -1388732479;
        hr.btwz[463] = 2113191777;
        hr.btwz[464] = -1411321112;
        hr.btwz[465] = -364192847;
        hr.btwz[466] = 1397922480;
        hr.btwz[467] = 858180363;
        hr.btwz[468] = -2008092716;
        hr.btwz[469] = 757734810;
        hr.btwz[470] = -1447684576;
        hr.btwz[471] = 2141843778;
        hr.btwz[472] = 1404362012;
        hr.btwz[473] = 652665700;
        hr.btwz[474] = -1890357720;
        hr.btwz[475] = -853457838;
        hr.btwz[476] = -625758199;
        hr.btwz[477] = 23112595;
        hr.btwz[478] = -363959015;
        hr.btwz[479] = 1052119511;
        hr.btwz[480] = 1054533512;
        hr.btwz[481] = 1657049028;
        hr.btwz[482] = 1504440810;
        hr.btwz[483] = -72954046;
        hr.btwz[484] = -1870177772;
        hr.btwz[485] = -733099006;
        hr.btwz[486] = -2140112118;
        hr.btwz[487] = 631060007;
        hr.btwz[488] = -1686887997;
        hr.btwz[489] = -947246523;
        hr.btwz[490] = 55243157;
        hr.btwz[491] = 1882503425;
        hr.btwz[492] = -1249703275;
        hr.btwz[493] = 1529693105;
        hr.btwz[494] = -933209132;
        hr.btwz[495] = -130645031;
        hr.btwz[496] = 1633638288;
        hr.btwz[497] = -1837063294;
        hr.btwz[498] = 1840345262;
        hr.btwz[499] = -1466585131;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetThrowState() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwko", btxi(int ), (int)316)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("bwkp", btwu(int ), (int)850)) break;
            v0 /* !! */  = (long)hr.btxb("bwkq", btwu(int ), (int)851);
        }
        var3_1 = hr.c;
        v1 /* !! */  = hr.ei;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(hr.btxb("bwks", btxi(int ), (int)318) - hr.btxb("bwkr", btxi(int ), (int)317));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -912185278: {
                    continue block22;
                }
                case 2083520731: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = hr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwkt", btxi(int ), (int)319)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hr.btxb("bwku", btwu(int ), (int)852)) break;
            v2 /* !! */  = (long)hr.btxb("bwkv", btwu(int ), (int)853);
        }
        var1_3 = hr.a;
        if (var3_1) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl25
                v3 = hr.btxb("bwkw", btwu(int ), (int)854);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwkx", btxi(int ), (int)320)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hr.btxb("bwky", btwu(int ), (int)855)) break;
                    v4 /* !! */  = (long)hr.btxb("bwkz", btwu(int ), (int)856);
                }
                this.isThrowing = v3;
                if (var1_3 || var1_3) ** GOTO lbl25
                v5 /* !! */  = hr.ei;
                if (true) ** GOTO lbl43
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - hr.btxb("bwla", btxi(int ), (int)321));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1308975746: {
                            v6 = hr.btxb("bwlb", btxi(int ), (int)322);
                            continue block26;
                        }
                        case -66929174: {
                            v6 = hr.btxb("bwlc", btxi(int ), (int)323);
                            continue block26;
                        }
                        case 2083520731: {
                            break block26;
                        }
                    }
                    break;
                }
                this.targetPearl = null;
                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bwld", btxi(int ), (int)324)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hr.btxb("bwle", btwu(int ), (int)857)) break;
                    v7 /* !! */  = (long)hr.btxb("bwlf", btwu(int ), (int)858);
                }
                this.serverRotation = null;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hr.btxb("bwlg", btwu(int ), (int)859);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl67:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hr.btxb("bwlh", btwu(int ), (int)860);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl72:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hr.btxb("bwli", btwu(int ), (int)861);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hr.btxb("bwlj", btwu(int ), (int)862);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
            }
lbl81:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hr.btxb("bwlk", btwu(int ), (int)863);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl85:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hr.btxb("bwll", btwu(int ), (int)864);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
lbl89:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hr.btxb("bwlm", btwu(int ), (int)865);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl94:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hr.btxb("bwln", btwu(int ), (int)866);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
lbl98:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hr.btxb("bwlo", btwu(int ), (int)867);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)hr.btxb("bwlp", btwu(int ), (int)868);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdj() {
        hr.btwx[900] = 1759120580;
        hr.btwx[901] = -2095405057;
        hr.btwx[902] = 1454901629;
        hr.btwx[903] = -235256860;
        hr.btwx[904] = -1184399605;
        hr.btwx[905] = -1120390336;
        hr.btwx[906] = 802517898;
        hr.btwx[907] = -1174613795;
        hr.btwx[908] = -599137057;
        hr.btwx[909] = -1933639360;
        hr.btwx[910] = -1213125326;
        hr.btwx[911] = -309081130;
        hr.btwx[912] = -1893973198;
        hr.btwx[913] = -1524425077;
        hr.btwx[914] = -1168974204;
        hr.btwx[915] = 1942072519;
        hr.btwx[916] = -1567859904;
        hr.btwx[917] = -1200609081;
        hr.btwx[918] = 2120255559;
        hr.btwx[919] = 53622200;
        hr.btwx[920] = -955432834;
        hr.btwx[921] = 259475393;
        hr.btwx[922] = -1640828843;
        hr.btwx[923] = 2058563030;
        hr.btwx[924] = -1291543390;
        hr.btwx[925] = -1198426620;
        hr.btwx[926] = 919367558;
        hr.btwx[927] = 1485935599;
        hr.btwx[928] = -784874846;
        hr.btwx[929] = -1366703779;
        hr.btwx[930] = 205186014;
        hr.btwx[931] = -1250127716;
        hr.btwx[932] = -783108483;
        hr.btwx[933] = 379853796;
        hr.btwx[934] = 1356752500;
        hr.btwx[935] = -537217066;
        hr.btwx[936] = 336145430;
        hr.btwx[937] = 101691659;
        hr.btwx[938] = 2090184376;
        hr.btwx[939] = -75174845;
        hr.btwx[940] = 1391526014;
        hr.btwx[941] = 265950401;
        hr.btwx[942] = 1190220070;
        hr.btwx[943] = -2104530753;
        hr.btwx[944] = -1622260995;
        hr.btwx[945] = -462439504;
        hr.btwx[946] = 226951849;
        hr.btwx[947] = -1799156290;
        hr.btwx[948] = -55968448;
        hr.btwx[949] = -147199871;
        hr.btwx[950] = -27664432;
        hr.btwx[951] = -137416107;
        hr.btwx[952] = 1224516623;
        hr.btwx[953] = -61271267;
        hr.btwx[954] = -890647516;
        hr.btwx[955] = -1784129530;
        hr.btwx[956] = 1578762185;
        hr.btwx[957] = -251331079;
        hr.btwx[958] = -899063476;
        hr.btwx[959] = -897130073;
        hr.btwx[960] = 1117934227;
        hr.btwx[961] = 2104483748;
        hr.btwx[962] = -1504683753;
        hr.btwx[963] = 28004050;
        hr.btwx[964] = 44660226;
        hr.btwx[965] = -707233028;
        hr.btwx[966] = -660450727;
        hr.btwx[967] = -1122653388;
        hr.btwx[968] = -217116561;
        hr.btwx[969] = 2019452682;
        hr.btwx[970] = 59263271;
        hr.btwx[971] = -1131662763;
        hr.btwx[972] = 2052213973;
        hr.btwx[973] = -724989428;
        hr.btwx[974] = -1118905529;
        hr.btwx[975] = -1561156424;
        hr.btwx[976] = 1211299742;
        hr.btwx[977] = 869015734;
        hr.btwx[978] = 1307574561;
        hr.btwx[979] = -936327701;
        hr.btwx[980] = -1112360643;
        hr.btwx[981] = -539670544;
        hr.btwx[982] = 461507376;
        hr.btwx[983] = -1727388307;
        hr.btwx[984] = 903707747;
        hr.btwx[985] = -482623631;
        hr.btwx[986] = -1163925405;
        hr.btwx[987] = 670467805;
        hr.btwx[988] = 717943981;
        hr.btwx[989] = -127482395;
        hr.btwx[990] = 1307073820;
        hr.btwx[991] = -1790540502;
        hr.btwx[992] = -1045104994;
        hr.btwx[993] = -1949871534;
        hr.btwx[994] = -995889614;
        hr.btwx[995] = -781073835;
        hr.btwx[996] = 760895101;
        hr.btwx[997] = 375111782;
    }

    private static /* synthetic */ void bxdf() {
        hr.btwx[500] = 2134862835;
        hr.btwx[501] = 921344580;
        hr.btwx[502] = -474725175;
        hr.btwx[503] = 1222727573;
        hr.btwx[504] = -1632348998;
        hr.btwx[505] = -877318720;
        hr.btwx[506] = -1096141055;
        hr.btwx[507] = -1179187889;
        hr.btwx[508] = -1873974484;
        hr.btwx[509] = 1455952623;
        hr.btwx[510] = 781333123;
        hr.btwx[511] = 1314101832;
        hr.btwx[512] = -234126370;
        hr.btwx[513] = 598297855;
        hr.btwx[514] = -373268437;
        hr.btwx[515] = 663230075;
        hr.btwx[516] = 1879523169;
        hr.btwx[517] = 1461875766;
        hr.btwx[518] = 2008742625;
        hr.btwx[519] = -1463165055;
        hr.btwx[520] = 1825787897;
        hr.btwx[521] = 591718819;
        hr.btwx[522] = 1472412875;
        hr.btwx[523] = 23884151;
        hr.btwx[524] = 878495849;
        hr.btwx[525] = 912751142;
        hr.btwx[526] = 2107165024;
        hr.btwx[527] = -1336133980;
        hr.btwx[528] = 1158913578;
        hr.btwx[529] = 378768799;
        hr.btwx[530] = 611327401;
        hr.btwx[531] = -1748663452;
        hr.btwx[532] = 2032765855;
        hr.btwx[533] = -1732589592;
        hr.btwx[534] = -749822373;
        hr.btwx[535] = -765614881;
        hr.btwx[536] = 0x2F5FF2FF;
        hr.btwx[537] = 1952388132;
        hr.btwx[538] = 63270035;
        hr.btwx[539] = -428585869;
        hr.btwx[540] = -1391706305;
        hr.btwx[541] = -142840876;
        hr.btwx[542] = -586391711;
        hr.btwx[543] = -300292046;
        hr.btwx[544] = 601434760;
        hr.btwx[545] = -1130776235;
        hr.btwx[546] = 656418774;
        hr.btwx[547] = -844579589;
        hr.btwx[548] = -1638925673;
        hr.btwx[549] = -1493285676;
        hr.btwx[550] = -1090513075;
        hr.btwx[551] = -606598338;
        hr.btwx[552] = 371882059;
        hr.btwx[553] = 1535157106;
        hr.btwx[554] = -1117289427;
        hr.btwx[555] = 696632423;
        hr.btwx[556] = 200921557;
        hr.btwx[557] = 1960399657;
        hr.btwx[558] = 848048581;
        hr.btwx[559] = -1356360494;
        hr.btwx[560] = 1740494873;
        hr.btwx[561] = 182543478;
        hr.btwx[562] = -399751027;
        hr.btwx[563] = 228345384;
        hr.btwx[564] = -2083825920;
        hr.btwx[565] = -2016946963;
        hr.btwx[566] = -859066131;
        hr.btwx[567] = -1004356511;
        hr.btwx[568] = 1847028787;
        hr.btwx[569] = -1714519574;
        hr.btwx[570] = 1487530923;
        hr.btwx[571] = -1110698544;
        hr.btwx[572] = 1122573939;
        hr.btwx[573] = -305539730;
        hr.btwx[574] = -1812548627;
        hr.btwx[575] = -1441616577;
        hr.btwx[576] = 374449268;
        hr.btwx[577] = 1152159404;
        hr.btwx[578] = 660407163;
        hr.btwx[579] = 2123891801;
        hr.btwx[580] = -220263422;
        hr.btwx[581] = 119230466;
        hr.btwx[582] = -1587458609;
        hr.btwx[583] = -811082667;
        hr.btwx[584] = -1157350454;
        hr.btwx[585] = 999936443;
        hr.btwx[586] = -2054618739;
        hr.btwx[587] = -230753244;
        hr.btwx[588] = 585923480;
        hr.btwx[589] = 1620958833;
        hr.btwx[590] = -888231034;
        hr.btwx[591] = 1765305586;
        hr.btwx[592] = -517996090;
        hr.btwx[593] = 837975896;
        hr.btwx[594] = -1186511585;
        hr.btwx[595] = 1345072472;
        hr.btwx[596] = -1329451251;
        hr.btwx[597] = -2103969338;
        hr.btwx[598] = -183333663;
        hr.btwx[599] = -441015473;
    }

    private static /* synthetic */ void bxde() {
        hr.btwx[400] = -1680151138;
        hr.btwx[401] = -959419121;
        hr.btwx[402] = -752805509;
        hr.btwx[403] = -569430948;
        hr.btwx[404] = 1445742976;
        hr.btwx[405] = -281916172;
        hr.btwx[406] = 1955712610;
        hr.btwx[407] = -1100870971;
        hr.btwx[408] = -1498650574;
        hr.btwx[409] = 1524559272;
        hr.btwx[410] = -580474254;
        hr.btwx[411] = 274475865;
        hr.btwx[412] = 1047624792;
        hr.btwx[413] = -1220988062;
        hr.btwx[414] = 1309039541;
        hr.btwx[415] = -112551468;
        hr.btwx[416] = 926257893;
        hr.btwx[417] = -343302940;
        hr.btwx[418] = 2013957495;
        hr.btwx[419] = -1345446141;
        hr.btwx[420] = -41706129;
        hr.btwx[421] = -1649890487;
        hr.btwx[422] = 849123678;
        hr.btwx[423] = 558244532;
        hr.btwx[424] = -1134790853;
        hr.btwx[425] = 1026060279;
        hr.btwx[426] = 1793183093;
        hr.btwx[427] = 1726826248;
        hr.btwx[428] = 400406933;
        hr.btwx[429] = 128581623;
        hr.btwx[430] = -2044108354;
        hr.btwx[431] = -1126096032;
        hr.btwx[432] = -651038775;
        hr.btwx[433] = -573518103;
        hr.btwx[434] = 1383530849;
        hr.btwx[435] = 1103189312;
        hr.btwx[436] = 1052828881;
        hr.btwx[437] = -1408568990;
        hr.btwx[438] = 1238634492;
        hr.btwx[439] = 742505276;
        hr.btwx[440] = -1121635520;
        hr.btwx[441] = 1407585311;
        hr.btwx[442] = -1933424152;
        hr.btwx[443] = -778081428;
        hr.btwx[444] = 2092078120;
        hr.btwx[445] = 319022638;
        hr.btwx[446] = -656959803;
        hr.btwx[447] = 180520949;
        hr.btwx[448] = 6948656;
        hr.btwx[449] = 555930732;
        hr.btwx[450] = -707698875;
        hr.btwx[451] = 72174067;
        hr.btwx[452] = 233362281;
        hr.btwx[453] = 683242579;
        hr.btwx[454] = 1076863892;
        hr.btwx[455] = 2000334336;
        hr.btwx[456] = -396979984;
        hr.btwx[457] = 778329300;
        hr.btwx[458] = -158795911;
        hr.btwx[459] = 706231935;
        hr.btwx[460] = 644345688;
        hr.btwx[461] = -307460029;
        hr.btwx[462] = 1388732478;
        hr.btwx[463] = 1544459768;
        hr.btwx[464] = -1411321111;
        hr.btwx[465] = -364192847;
        hr.btwx[466] = 1397922487;
        hr.btwx[467] = 858180365;
        hr.btwx[468] = -2008092718;
        hr.btwx[469] = 757734803;
        hr.btwx[470] = -1447684574;
        hr.btwx[471] = 2141843782;
        hr.btwx[472] = 1404362012;
        hr.btwx[473] = 652665710;
        hr.btwx[474] = -1890357720;
        hr.btwx[475] = -853457832;
        hr.btwx[476] = -625758196;
        hr.btwx[477] = 1138011027;
        hr.btwx[478] = 730230041;
        hr.btwx[479] = 2092569047;
        hr.btwx[480] = 1054533513;
        hr.btwx[481] = 1657049029;
        hr.btwx[482] = -1692405270;
        hr.btwx[483] = -1189949630;
        hr.btwx[484] = 1378703892;
        hr.btwx[485] = -1763193854;
        hr.btwx[486] = -2140112118;
        hr.btwx[487] = 631060006;
        hr.btwx[488] = 1505763779;
        hr.btwx[489] = -2059523515;
        hr.btwx[490] = 55243156;
        hr.btwx[491] = -1300186879;
        hr.btwx[492] = -147387755;
        hr.btwx[493] = 1529693088;
        hr.btwx[494] = -933209100;
        hr.btwx[495] = -130645037;
        hr.btwx[496] = 1633638303;
        hr.btwx[497] = -1837063294;
        hr.btwx[498] = 1840345250;
        hr.btwx[499] = -1466585145;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isBetterCandidate(hr$TrajectoryCandidate var1_1, hr$TrajectoryCandidate var2_2, double var3_3, boolean var5_4) {
        var12_5 = hr.c;
        var11_6 /* !! */  = hr.b;
        var10_7 = hr.a;
        if (var11_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_5) {
                    throw null;
lbl9:
                    // 36 sources

                    return (boolean)hr.btxb("bvxi", btwu(int ), (int)605);
                }
                if (var10_7 || var10_7) ** GOTO lbl9
                if (var2_2 != null) ** GOTO lbl15
                if (var10_7 || var10_7) ** GOTO lbl9
                return (boolean)hr.btxb("bvxj", btwu(int ), (int)606);
lbl15:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(var1_1.distanceToTarget <= var3_3)) ** GOTO lbl22
                if (var10_7) ** GOTO lbl9
                v0 = hr.btxb("bvxk", btwu(int ), (int)607);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl24
lbl22:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v0 = var6_8 = hr.btxb("bvxl", btwu(int ), (int)608);
lbl24:
                // 2 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(var2_2.distanceToTarget <= var3_3)) ** GOTO lbl31
                if (var10_7) ** GOTO lbl9
                v1 = hr.btxb("bvxm", btwu(int ), (int)609);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl33
lbl31:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v1 = var7_9 = hr.btxb("bvxn", btwu(int ), (int)610);
lbl33:
                // 2 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (var6_8 == var7_9) ** GOTO lbl37
                if (var10_7 || var10_7) ** GOTO lbl9
                return (boolean)var6_8;
lbl37:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (!var5_4) ** GOTO lbl71
                if (var10_7) ** GOTO lbl9
                if (var6_8 == false) ** GOTO lbl71
                if (var10_7) ** GOTO lbl9
                if (var7_9 == false) ** GOTO lbl71
                if (var10_7 || var10_7) ** GOTO lbl9
                var8_10 = Math.abs(var1_1.pitch);
                if (var10_7 || var10_7) ** GOTO lbl9
                var9_11 = Math.abs(var2_2.pitch);
                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(Math.abs(var8_10 - var9_11) > hr.btxb("bvxo", bubr(int ), (int)611))) ** GOTO lbl59
                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(var8_10 < var9_11)) ** GOTO lbl56
                if (var10_7) ** GOTO lbl9
                v2 = hr.btxb("bvxp", btwu(int ), (int)612);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl58
lbl56:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v2 = hr.btxb("bvxq", btwu(int ), (int)613);
lbl58:
                // 2 sources

                return (boolean)v2;
lbl59:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (var1_1.ticks == var2_2.ticks) ** GOTO lbl71
                if (var10_7 || var10_7) ** GOTO lbl9
                if (var1_1.ticks >= var2_2.ticks) ** GOTO lbl68
                if (var10_7) ** GOTO lbl9
                v3 = hr.btxb("bvxr", btwu(int ), (int)614);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl70
lbl68:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v3 = hr.btxb("bvxs", btwu(int ), (int)615);
lbl70:
                // 2 sources

                return (boolean)v3;
lbl71:
                // 4 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(Math.abs(var1_1.distanceToTarget - var2_2.distanceToTarget) > hr.btxb("bvxt", buso(int ), (int)217))) ** GOTO lbl83
                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(var1_1.distanceToTarget < var2_2.distanceToTarget)) ** GOTO lbl80
                if (var10_7) ** GOTO lbl9
                v4 = hr.btxb("bvxu", btwu(int ), (int)616);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl82
lbl80:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v4 = hr.btxb("bvxv", btwu(int ), (int)617);
lbl82:
                // 2 sources

                return (boolean)v4;
lbl83:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (var1_1.ticks == var2_2.ticks) ** GOTO lbl95
                if (var10_7 || var10_7) ** GOTO lbl9
                if (var1_1.ticks >= var2_2.ticks) ** GOTO lbl92
                if (var10_7) ** GOTO lbl9
                v5 = hr.btxb("bvxw", btwu(int ), (int)618);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl94
lbl92:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v5 = hr.btxb("bvxx", btwu(int ), (int)619);
lbl94:
                // 2 sources

                return (boolean)v5;
lbl95:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                if (var5_4) ** GOTO lbl107
                if (var10_7 || var10_7) ** GOTO lbl9
                if (!(Math.abs(var1_1.pitch) < Math.abs(var2_2.pitch))) ** GOTO lbl104
                if (var10_7) ** GOTO lbl9
                v6 = hr.btxb("bvxy", btwu(int ), (int)620);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl106
lbl104:
                // 1 sources

                if (var10_7 || var10_7) ** GOTO lbl9
                v6 = hr.btxb("bvxz", btwu(int ), (int)621);
lbl106:
                // 2 sources

                return (boolean)v6;
lbl107:
                // 1 sources

                if (!var10_7 && !var10_7) ** break;
                ** continue;
                return (boolean)hr.btxb("bvya", btwu(int ), (int)622);
            }
            case 0: {
                var11_6 /* !! */  = (int)hr.btxb("bvyb", btwu(int ), (int)623);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl115:
            // 2 sources

            case 1: {
                var11_6 /* !! */  = (int)hr.btxb("bvyc", btwu(int ), (int)624);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl120:
            // 3 sources

            case 2: {
                var11_6 /* !! */  = (int)hr.btxb("bvyd", btwu(int ), (int)625);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 3: {
                var11_6 /* !! */  = (int)hr.btxb("bvye", btwu(int ), (int)626);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 4: {
                var11_6 /* !! */  = (int)hr.btxb("bvyf", btwu(int ), (int)627);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl362
            }
            case 5: {
                var11_6 /* !! */  = (int)hr.btxb("bvyg", btwu(int ), (int)628);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl140:
            // 3 sources

            case 6: {
                var11_6 /* !! */  = (int)hr.btxb("bvyh", btwu(int ), (int)629);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 7: {
                var11_6 /* !! */  = (int)hr.btxb("bvyi", btwu(int ), (int)630);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 8: {
                var11_6 /* !! */  = (int)hr.btxb("bvyj", btwu(int ), (int)631);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl155:
            // 3 sources

            case 9: {
                var11_6 /* !! */  = (int)hr.btxb("bvyk", btwu(int ), (int)632);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl160:
            // 3 sources

            case 10: {
                var11_6 /* !! */  = (int)hr.btxb("bvyl", btwu(int ), (int)633);
                if (!var12_5) ** GOTO lbl155
                throw null;
            }
lbl164:
            // 2 sources

            case 11: {
                var11_6 /* !! */  = (int)hr.btxb("bvym", btwu(int ), (int)634);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl169:
            // 2 sources

            case 12: {
                var11_6 /* !! */  = (int)hr.btxb("bvyn", btwu(int ), (int)635);
                if (!var12_5) ** GOTO lbl120
                throw null;
            }
lbl173:
            // 2 sources

            case 13: {
                var11_6 /* !! */  = (int)hr.btxb("bvyo", btwu(int ), (int)636);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl178:
            // 2 sources

            case 14: {
                var11_6 /* !! */  = (int)hr.btxb("bvyp", btwu(int ), (int)637);
                if (!var12_5) ** GOTO lbl120
                throw null;
            }
            case 15: {
                var11_6 /* !! */  = (int)hr.btxb("bvyq", btwu(int ), (int)638);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl187:
            // 2 sources

            case 16: {
                var11_6 /* !! */  = (int)hr.btxb("bvyr", btwu(int ), (int)639);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl192:
            // 3 sources

            case 17: {
                var11_6 /* !! */  = (int)hr.btxb("bvys", btwu(int ), (int)640);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl382
            }
            case 18: {
                var11_6 /* !! */  = (int)hr.btxb("bvyt", btwu(int ), (int)641);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 19: {
                var11_6 /* !! */  = (int)hr.btxb("bvyu", btwu(int ), (int)642);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl207:
            // 2 sources

            case 20: {
                var11_6 /* !! */  = (int)hr.btxb("bvyv", btwu(int ), (int)643);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 21: {
                var11_6 /* !! */  = (int)hr.btxb("bvyw", btwu(int ), (int)644);
                if (!var12_5) ** GOTO lbl140
                throw null;
            }
            case 22: {
                var11_6 /* !! */  = (int)hr.btxb("bvyx", btwu(int ), (int)645);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl221:
            // 3 sources

            case 23: {
                var11_6 /* !! */  = (int)hr.btxb("bvyy", btwu(int ), (int)646);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl226:
            // 3 sources

            case 24: {
                var11_6 /* !! */  = (int)hr.btxb("bvyz", btwu(int ), (int)647);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 25: {
                var11_6 /* !! */  = (int)hr.btxb("bvza", btwu(int ), (int)648);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl236:
            // 2 sources

            case 26: {
                var11_6 /* !! */  = (int)hr.btxb("bvzb", btwu(int ), (int)649);
                if (!var12_5) ** GOTO lbl221
                throw null;
            }
lbl240:
            // 5 sources

            case 27: {
                var11_6 /* !! */  = (int)hr.btxb("bvzc", btwu(int ), (int)650);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl245:
            // 2 sources

            case 28: {
                var11_6 /* !! */  = (int)hr.btxb("bvzd", btwu(int ), (int)651);
                if (!var12_5) ** GOTO lbl192
                throw null;
            }
lbl249:
            // 3 sources

            case 29: {
                var11_6 /* !! */  = (int)hr.btxb("bvze", btwu(int ), (int)652);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl254:
            // 3 sources

            case 30: {
                var11_6 /* !! */  = (int)hr.btxb("bvzf", btwu(int ), (int)653);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl259:
            // 2 sources

            case 31: {
                var11_6 /* !! */  = (int)hr.btxb("bvzg", btwu(int ), (int)654);
                if (!var12_5) ** GOTO lbl160
                throw null;
            }
            case 32: {
                var11_6 /* !! */  = (int)hr.btxb("bvzh", btwu(int ), (int)655);
                if (!var12_5) ** GOTO lbl207
                throw null;
            }
            case 33: {
                var11_6 /* !! */  = (int)hr.btxb("bvzi", btwu(int ), (int)656);
                if (!var12_5) break;
                throw null;
            }
            case 34: {
                var11_6 /* !! */  = (int)hr.btxb("bvzj", btwu(int ), (int)657);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl276:
            // 3 sources

            case 35: {
                var11_6 /* !! */  = (int)hr.btxb("bvzk", btwu(int ), (int)658);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 36: {
                var11_6 /* !! */  = (int)hr.btxb("bvzl", btwu(int ), (int)659);
                if (!var12_5) ** GOTO lbl187
                throw null;
            }
lbl285:
            // 2 sources

            case 37: {
                var11_6 /* !! */  = (int)hr.btxb("bvzm", btwu(int ), (int)660);
                if (!var12_5) ** GOTO lbl245
                throw null;
            }
lbl289:
            // 2 sources

            case 38: {
                var11_6 /* !! */  = (int)hr.btxb("bvzn", btwu(int ), (int)661);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl294:
            // 2 sources

            case 39: {
                var11_6 /* !! */  = (int)hr.btxb("bvzo", btwu(int ), (int)662);
                if (!var12_5) ** GOTO lbl178
                throw null;
            }
lbl298:
            // 3 sources

            case 40: {
                var11_6 /* !! */  = (int)hr.btxb("bvzp", btwu(int ), (int)663);
                if (!var12_5) ** GOTO lbl240
                throw null;
            }
            case 41: {
                var11_6 /* !! */  = (int)hr.btxb("bvzq", btwu(int ), (int)664);
                if (!var12_5) ** GOTO lbl240
                throw null;
            }
lbl306:
            // 2 sources

            case 42: {
                var11_6 /* !! */  = (int)hr.btxb("bvzr", btwu(int ), (int)665);
                if (!var12_5) ** GOTO lbl249
                throw null;
            }
            case 43: {
                var11_6 /* !! */  = (int)hr.btxb("bvzs", btwu(int ), (int)666);
                if (!var12_5) ** GOTO lbl240
                throw null;
            }
lbl314:
            // 5 sources

            case 44: {
                var11_6 /* !! */  = (int)hr.btxb("bvzt", btwu(int ), (int)667);
                if (!var12_5) ** GOTO lbl259
                throw null;
            }
lbl318:
            // 2 sources

            case 45: {
                var11_6 /* !! */  = (int)hr.btxb("bvzu", btwu(int ), (int)668);
                if (!var12_5) ** GOTO lbl285
                throw null;
            }
lbl322:
            // 2 sources

            case 46: {
                var11_6 /* !! */  = (int)hr.btxb("bvzv", btwu(int ), (int)669);
                if (!var12_5) ** GOTO lbl140
                throw null;
            }
            case 47: {
                var11_6 /* !! */  = (int)hr.btxb("bvzw", btwu(int ), (int)670);
                if (!var12_5) ** GOTO lbl306
                throw null;
            }
            case 48: {
                var11_6 /* !! */  = (int)hr.btxb("bvzx", btwu(int ), (int)671);
                if (!var12_5) ** GOTO lbl155
                throw null;
            }
lbl334:
            // 2 sources

            case 49: {
                var11_6 /* !! */  = (int)hr.btxb("bvzy", btwu(int ), (int)672);
                if (!var12_5) ** GOTO lbl276
                throw null;
            }
lbl338:
            // 2 sources

            case 50: {
                var11_6 /* !! */  = (int)hr.btxb("bvzz", btwu(int ), (int)673);
                if (!var12_5) ** GOTO lbl226
                throw null;
            }
            case 51: {
                var11_6 /* !! */  = (int)hr.btxb("bwaa", btwu(int ), (int)674);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl347:
            // 2 sources

            case 52: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_6 /* !! */  = (int)hr.btxb("bwab", btwu(int ), (int)675);
                    if (var12_5) {
                        throw null;
                    }
                    ** GOTO lbl366
                    break;
                }
            }
lbl353:
            // 2 sources

            case 53: {
                var11_6 /* !! */  = (int)hr.btxb("bwac", btwu(int ), (int)676);
                if (!var12_5) ** GOTO lbl338
                throw null;
            }
lbl357:
            // 2 sources

            case 54: {
                var11_6 /* !! */  = (int)hr.btxb("bwad", btwu(int ), (int)677);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl362:
            // 4 sources

            case 55: {
                var11_6 /* !! */  = (int)hr.btxb("bwae", btwu(int ), (int)678);
                if (!var12_5) ** GOTO lbl226
                throw null;
            }
lbl366:
            // 2 sources

            case 56: {
                var11_6 /* !! */  = (int)hr.btxb("bwaf", btwu(int ), (int)679);
                if (!var12_5) ** GOTO lbl221
                throw null;
            }
            case 57: {
                var11_6 /* !! */  = (int)hr.btxb("bwag", btwu(int ), (int)680);
                if (!var12_5) ** GOTO lbl240
                throw null;
            }
            case 58: {
                var11_6 /* !! */  = (int)hr.btxb("bwah", btwu(int ), (int)681);
                if (!var12_5) ** GOTO lbl236
                throw null;
            }
lbl378:
            // 3 sources

            case 59: {
                var11_6 /* !! */  = (int)hr.btxb("bwai", btwu(int ), (int)682);
                if (!var12_5) ** GOTO lbl115
                throw null;
            }
lbl382:
            // 2 sources

            case 60: {
                var11_6 /* !! */  = (int)hr.btxb("bwaj", btwu(int ), (int)683);
                if (!var12_5) ** GOTO lbl357
                throw null;
            }
lbl386:
            // 3 sources

            case 61: {
                var11_6 /* !! */  = (int)hr.btxb("bwak", btwu(int ), (int)684);
                if (!var12_5) ** GOTO lbl378
                throw null;
            }
lbl390:
            // 2 sources

            case 62: {
                var11_6 /* !! */  = (int)hr.btxb("bwal", btwu(int ), (int)685);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl395:
            // 3 sources

            case 63: {
                var11_6 /* !! */  = (int)hr.btxb("bwam", btwu(int ), (int)686);
                if (!var12_5) ** GOTO lbl362
                throw null;
            }
            case 64: {
                var11_6 /* !! */  = (int)hr.btxb("bwan", btwu(int ), (int)687);
                if (!var12_5) ** GOTO lbl322
                throw null;
            }
            case 65: {
                var11_6 /* !! */  = (int)hr.btxb("bwao", btwu(int ), (int)688);
                if (!var12_5) ** GOTO lbl378
                throw null;
            }
            case 66: {
                var11_6 /* !! */  = (int)hr.btxb("bwap", btwu(int ), (int)689);
                if (!var12_5) ** GOTO lbl386
                throw null;
            }
lbl411:
            // 3 sources

            case 67: {
                var11_6 /* !! */  = (int)hr.btxb("bwaq", btwu(int ), (int)690);
                if (!var12_5) ** GOTO lbl160
                throw null;
            }
lbl415:
            // 4 sources

            case 68: {
                var11_6 /* !! */  = (int)hr.btxb("bwar", btwu(int ), (int)691);
                if (var12_5) {
                    throw null;
                }
            }
lbl419:
            // 4 sources

            case 69: {
                var11_6 /* !! */  = (int)hr.btxb("bwas", btwu(int ), (int)692);
                if (!var12_5) ** GOTO lbl192
                throw null;
            }
            case 70: {
                var11_6 /* !! */  = (int)hr.btxb("bwat", btwu(int ), (int)693);
                if (!var12_5) ** GOTO lbl294
                throw null;
            }
            case 71: 
        }
        var11_6 /* !! */  = (int)hr.btxb("bwau", btwu(int ), (int)694);
        ** while (!var12_5)
lbl430:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hr$TrajectoryCandidate findBestCandidate(class_243 var1_1, float var2_2, float var3_3, float var4_4, double var5_5, boolean var7_6) {
        var30_7 = hr.c;
        var29_8 /* !! */  = hr.b;
        var28_9 = hr.a;
        if (var30_7) {
            throw null;
lbl6:
            // 39 sources

            return null;
        }
        if (var28_9 || var28_9) ** GOTO lbl6
        if (var29_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var29_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var8_10 = hr.mc.field_1724.method_73189();
                if (var28_9 || var28_9) ** GOTO lbl6
                var9_11 = hr.btxb("bvug", buso(int ), (int)216);
                if (var28_9 || var28_9) ** GOTO lbl6
                var11_12 = null;
                if (var28_9 || var28_9) ** GOTO lbl6
                var12_13 = var3_3;
                if (var28_9) ** GOTO lbl6
                do {
                    if (var28_9 || var28_9) ** GOTO lbl6
                    if (!(var12_13 <= var4_4)) ** GOTO lbl87
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var13_14 = (float)Math.toRadians(var12_13);
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var14_15 = (double)(-class_3532.method_15374((double)((float)Math.toRadians(var2_2))) * class_3532.method_15362((double)var13_14)) * var9_11;
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var16_16 = (double)(-class_3532.method_15374((double)var13_14)) * var9_11;
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var18_17 = (double)(class_3532.method_15362((double)((float)Math.toRadians(var2_2))) * class_3532.method_15362((double)var13_14)) * var9_11;
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var20_18 = new class_243(var8_10.field_1352, hr.mc.field_1724.method_23320(), var8_10.field_1350);
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var21_19 = new class_243(var14_15, var16_16, var18_17);
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var22_20 = hr.btxb("bvuh", btwu(int ), (int)526);
                    if (var28_9 || var28_9) ** GOTO lbl6
                    var23_21 = hr.btxb("bvui", btwu(int ), (int)527);
                    if (var28_9) ** GOTO lbl6
                    do {
                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (var23_21 >= hr.btxb("bvuj", btwu(int ), (int)528)) ** GOTO lbl82
                        if (var28_9 || var28_9) ** GOTO lbl6
                        var24_22 = var20_18;
                        if (var28_9 || var28_9) ** GOTO lbl6
                        var20_18 = var20_18.method_1019(var21_19);
                        if (var28_9 || var28_9) ** GOTO lbl6
                        var21_19 = this.updatePearlMotion(var21_19, var20_18);
                        if (var28_9 || var28_9) ** GOTO lbl6
                        ++var22_20;
                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (!this.hitsEntity(var24_22, var20_18)) ** GOTO lbl57
                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (var30_7) {
                            throw null;
                        }
                        ** GOTO lbl82
lbl57:
                        // 1 sources

                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (this.hitsBlock(var24_22, var20_18)) ** GOTO lbl65
                        if (var28_9) ** GOTO lbl6
                        if (!(var20_18.field_1351 > (double)hr.mc.field_1687.method_31607())) ** GOTO lbl65
                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (var30_7) {
                            throw null;
                        }
                        ** GOTO lbl77
lbl65:
                        // 2 sources

                        if (var28_9 || var28_9) ** GOTO lbl6
                        var25_23 = var20_18.method_1022(var1_1);
                        if (var28_9 || var28_9) ** GOTO lbl6
                        var27_24 = new hr$TrajectoryCandidate(var12_13, var25_23, (int)var22_20, var20_18);
                        if (var28_9 || var28_9) ** GOTO lbl6
                        if (!this.isBetterCandidate(var27_24, var11_12, var5_5, var7_6)) ** GOTO lbl82
                        if (var28_9 || var28_9) ** GOTO lbl6
                        var11_12 = var27_24;
                        if (var28_9) ** GOTO lbl6
                        if (var30_7) {
                            throw null;
                        }
                        ** GOTO lbl82
lbl77:
                        // 1 sources

                        if (var28_9 || var28_9) ** GOTO lbl6
                        ++var23_21;
                        if (var28_9) ** GOTO lbl6
                    } while (!var30_7);
                    throw null;
lbl82:
                    // 4 sources

                    if (var28_9 || var28_9) ** GOTO lbl6
                    var12_13 += hr.btxb("bvuk", bubr(int ), (int)529);
                    if (var28_9) ** GOTO lbl6
                } while (!var30_7);
                throw null;
lbl87:
                // 1 sources

                if (var28_9 || var28_9) ** GOTO lbl6
                if (var11_12 == null) ** GOTO lbl92
                if (var28_9) ** GOTO lbl6
                if (!(var11_12.distanceToTarget > var5_5)) ** GOTO lbl94
                if (var28_9) ** GOTO lbl6
lbl92:
                // 2 sources

                if (var28_9 || var28_9) ** GOTO lbl6
                return null;
lbl94:
                // 1 sources

                if (!var28_9 && !var28_9) ** break;
                ** continue;
                return var11_12;
            }
lbl97:
            // 2 sources

            case 0: {
                do {
                    var29_8 /* !! */  = (int)hr.btxb("bvul", btwu(int ), (int)530);
                } while (!var30_7);
                throw null;
            }
            case 1: {
                var29_8 /* !! */  = (int)hr.btxb("bvum", btwu(int ), (int)531);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl107:
            // 2 sources

            case 2: {
                var29_8 /* !! */  = (int)hr.btxb("bvun", btwu(int ), (int)532);
                if (!var30_7) ** GOTO lbl97
                throw null;
            }
lbl111:
            // 2 sources

            case 3: {
                var29_8 /* !! */  = (int)hr.btxb("bvuo", btwu(int ), (int)533);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl116:
            // 2 sources

            case 4: {
                var29_8 /* !! */  = (int)hr.btxb("bvup", btwu(int ), (int)534);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 5: {
                var29_8 /* !! */  = (int)hr.btxb("bvuq", btwu(int ), (int)535);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 6: {
                var29_8 /* !! */  = (int)hr.btxb("bvur", btwu(int ), (int)536);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 7: {
                var29_8 /* !! */  = (int)hr.btxb("bvus", btwu(int ), (int)537);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 8: {
                var29_8 /* !! */  = (int)hr.btxb("bvut", btwu(int ), (int)538);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl141:
            // 4 sources

            case 9: {
                var29_8 /* !! */  = (int)hr.btxb("bvuu", btwu(int ), (int)539);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 10: {
                var29_8 /* !! */  = (int)hr.btxb("bvuv", btwu(int ), (int)540);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl151:
            // 2 sources

            case 11: {
                var29_8 /* !! */  = (int)hr.btxb("bvuw", btwu(int ), (int)541);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl420
            }
lbl156:
            // 2 sources

            case 12: {
                var29_8 /* !! */  = (int)hr.btxb("bvux", btwu(int ), (int)542);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl161:
            // 3 sources

            case 13: {
                var29_8 /* !! */  = (int)hr.btxb("bvuy", btwu(int ), (int)543);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl166:
            // 2 sources

            case 14: {
                var29_8 /* !! */  = (int)hr.btxb("bvuz", btwu(int ), (int)544);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl171:
            // 3 sources

            case 15: {
                var29_8 /* !! */  = (int)hr.btxb("bvva", btwu(int ), (int)545);
                if (!var30_7) ** GOTO lbl151
                throw null;
            }
lbl175:
            // 2 sources

            case 16: {
                var29_8 /* !! */  = (int)hr.btxb("bvvb", btwu(int ), (int)546);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl379
            }
            case 17: {
                var29_8 /* !! */  = (int)hr.btxb("bvvc", btwu(int ), (int)547);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl379
            }
            case 18: {
                var29_8 /* !! */  = (int)hr.btxb("bvvd", btwu(int ), (int)548);
                if (!var30_7) ** GOTO lbl107
                throw null;
            }
            case 19: {
                var29_8 /* !! */  = (int)hr.btxb("bvve", btwu(int ), (int)549);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl194:
            // 2 sources

            case 20: {
                var29_8 /* !! */  = (int)hr.btxb("bvvf", btwu(int ), (int)550);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 21: {
                var29_8 /* !! */  = (int)hr.btxb("bvvg", btwu(int ), (int)551);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl204:
            // 2 sources

            case 22: {
                var29_8 /* !! */  = (int)hr.btxb("bvvh", btwu(int ), (int)552);
                if (!var30_7) break;
                throw null;
            }
lbl208:
            // 2 sources

            case 23: {
                var29_8 /* !! */  = (int)hr.btxb("bvvi", btwu(int ), (int)553);
                if (!var30_7) ** GOTO lbl111
                throw null;
            }
            case 24: {
                var29_8 /* !! */  = (int)hr.btxb("bvvj", btwu(int ), (int)554);
                if (!var30_7) ** GOTO lbl141
                throw null;
            }
            case 25: {
                var29_8 /* !! */  = (int)hr.btxb("bvvk", btwu(int ), (int)555);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 26: {
                var29_8 /* !! */  = (int)hr.btxb("bvvl", btwu(int ), (int)556);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl428
            }
lbl226:
            // 2 sources

            case 27: {
                var29_8 /* !! */  = (int)hr.btxb("bvvm", btwu(int ), (int)557);
                if (!var30_7) ** GOTO lbl208
                throw null;
            }
lbl230:
            // 2 sources

            case 28: {
                var29_8 /* !! */  = (int)hr.btxb("bvvn", btwu(int ), (int)558);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl235:
            // 2 sources

            case 29: {
                var29_8 /* !! */  = (int)hr.btxb("bvvo", btwu(int ), (int)559);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 30: {
                var29_8 /* !! */  = (int)hr.btxb("bvvp", btwu(int ), (int)560);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl245:
            // 2 sources

            case 31: {
                var29_8 /* !! */  = (int)hr.btxb("bvvq", btwu(int ), (int)561);
                if (!var30_7) ** GOTO lbl161
                throw null;
            }
lbl249:
            // 2 sources

            case 32: {
                var29_8 /* !! */  = (int)hr.btxb("bvvr", btwu(int ), (int)562);
                if (!var30_7) ** GOTO lbl161
                throw null;
            }
lbl253:
            // 2 sources

            case 33: {
                var29_8 /* !! */  = (int)hr.btxb("bvvs", btwu(int ), (int)563);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 34: {
                var29_8 /* !! */  = (int)hr.btxb("bvvt", btwu(int ), (int)564);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl379
            }
lbl263:
            // 4 sources

            case 35: {
                var29_8 /* !! */  = (int)hr.btxb("bvvu", btwu(int ), (int)565);
                if (!var30_7) ** GOTO lbl226
                throw null;
            }
lbl267:
            // 2 sources

            case 36: {
                var29_8 /* !! */  = (int)hr.btxb("bvvv", btwu(int ), (int)566);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl272:
            // 2 sources

            case 37: {
                var29_8 /* !! */  = (int)hr.btxb("bvvw", btwu(int ), (int)567);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl277:
            // 2 sources

            case 38: {
                var29_8 /* !! */  = (int)hr.btxb("bvvx", btwu(int ), (int)568);
                if (!var30_7) ** GOTO lbl245
                throw null;
            }
lbl281:
            // 2 sources

            case 39: {
                var29_8 /* !! */  = (int)hr.btxb("bvvy", btwu(int ), (int)569);
                if (!var30_7) ** GOTO lbl204
                throw null;
            }
            case 40: {
                var29_8 /* !! */  = (int)hr.btxb("bvvz", btwu(int ), (int)570);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl290:
            // 2 sources

            case 41: {
                var29_8 /* !! */  = (int)hr.btxb("bvwa", btwu(int ), (int)571);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl295:
            // 2 sources

            case 42: {
                var29_8 /* !! */  = (int)hr.btxb("bvwb", btwu(int ), (int)572);
                if (!var30_7) ** GOTO lbl253
                throw null;
            }
lbl299:
            // 2 sources

            case 43: {
                var29_8 /* !! */  = (int)hr.btxb("bvwc", btwu(int ), (int)573);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl304:
            // 2 sources

            case 44: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var29_8 /* !! */  = (int)hr.btxb("bvwd", btwu(int ), (int)574);
                    if (var30_7) {
                        throw null;
                    }
                    ** GOTO lbl319
                    break;
                }
            }
lbl310:
            // 2 sources

            case 45: {
                var29_8 /* !! */  = (int)hr.btxb("bvwe", btwu(int ), (int)575);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl315:
            // 2 sources

            case 46: {
                var29_8 /* !! */  = (int)hr.btxb("bvwf", btwu(int ), (int)576);
                if (!var30_7) ** GOTO lbl194
                throw null;
            }
lbl319:
            // 4 sources

            case 47: {
                var29_8 /* !! */  = (int)hr.btxb("bvwg", btwu(int ), (int)577);
                if (!var30_7) ** GOTO lbl175
                throw null;
            }
lbl323:
            // 3 sources

            case 48: {
                var29_8 /* !! */  = (int)hr.btxb("bvwh", btwu(int ), (int)578);
                if (!var30_7) ** GOTO lbl263
                throw null;
            }
            case 49: {
                var29_8 /* !! */  = (int)hr.btxb("bvwi", btwu(int ), (int)579);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl332:
            // 2 sources

            case 50: {
                var29_8 /* !! */  = (int)hr.btxb("bvwj", btwu(int ), (int)580);
                if (!var30_7) ** GOTO lbl323
                throw null;
            }
            case 51: {
                var29_8 /* !! */  = (int)hr.btxb("bvwk", btwu(int ), (int)581);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl341:
            // 2 sources

            case 52: {
                var29_8 /* !! */  = (int)hr.btxb("bvwl", btwu(int ), (int)582);
                if (!var30_7) ** GOTO lbl156
                throw null;
            }
lbl345:
            // 2 sources

            case 53: {
                var29_8 /* !! */  = (int)hr.btxb("bvwm", btwu(int ), (int)583);
                if (!var30_7) ** GOTO lbl166
                throw null;
            }
lbl349:
            // 3 sources

            case 54: {
                var29_8 /* !! */  = (int)hr.btxb("bvwn", btwu(int ), (int)584);
                if (!var30_7) ** GOTO lbl263
                throw null;
            }
lbl353:
            // 4 sources

            case 55: {
                var29_8 /* !! */  = (int)hr.btxb("bvwo", btwu(int ), (int)585);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl358:
            // 2 sources

            case 56: {
                var29_8 /* !! */  = (int)hr.btxb("bvwp", btwu(int ), (int)586);
                if (!var30_7) ** GOTO lbl263
                throw null;
            }
lbl362:
            // 3 sources

            case 57: {
                var29_8 /* !! */  = (int)hr.btxb("bvwq", btwu(int ), (int)587);
                if (!var30_7) ** GOTO lbl249
                throw null;
            }
lbl366:
            // 2 sources

            case 58: {
                var29_8 /* !! */  = (int)hr.btxb("bvwr", btwu(int ), (int)588);
                if (!var30_7) ** GOTO lbl315
                throw null;
            }
            case 59: {
                var29_8 /* !! */  = (int)hr.btxb("bvws", btwu(int ), (int)589);
                if (!var30_7) ** GOTO lbl171
                throw null;
            }
lbl374:
            // 4 sources

            case 60: {
                var29_8 /* !! */  = (int)hr.btxb("bvwt", btwu(int ), (int)590);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl379:
            // 4 sources

            case 61: {
                var29_8 /* !! */  = (int)hr.btxb("bvwu", btwu(int ), (int)591);
                if (!var30_7) ** GOTO lbl374
                throw null;
            }
lbl383:
            // 2 sources

            case 62: {
                var29_8 /* !! */  = (int)hr.btxb("bvwv", btwu(int ), (int)592);
                if (!var30_7) ** GOTO lbl267
                throw null;
            }
lbl387:
            // 3 sources

            case 63: {
                var29_8 /* !! */  = (int)hr.btxb("bvww", btwu(int ), (int)593);
                if (!var30_7) ** GOTO lbl366
                throw null;
            }
lbl391:
            // 2 sources

            case 64: {
                var29_8 /* !! */  = (int)hr.btxb("bvwx", btwu(int ), (int)594);
                if (!var30_7) ** GOTO lbl383
                throw null;
            }
lbl395:
            // 3 sources

            case 65: {
                var29_8 /* !! */  = (int)hr.btxb("bvwy", btwu(int ), (int)595);
                if (!var30_7) ** GOTO lbl387
                throw null;
            }
lbl399:
            // 2 sources

            case 66: {
                var29_8 /* !! */  = (int)hr.btxb("bvwz", btwu(int ), (int)596);
                if (!var30_7) ** GOTO lbl353
                throw null;
            }
            case 67: {
                var29_8 /* !! */  = (int)hr.btxb("bvxa", btwu(int ), (int)597);
                if (var30_7) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl408:
            // 2 sources

            case 68: {
                var29_8 /* !! */  = (int)hr.btxb("bvxb", btwu(int ), (int)598);
                if (!var30_7) ** GOTO lbl349
                throw null;
            }
lbl412:
            // 2 sources

            case 69: {
                var29_8 /* !! */  = (int)hr.btxb("bvxc", btwu(int ), (int)599);
                if (!var30_7) ** GOTO lbl116
                throw null;
            }
lbl416:
            // 2 sources

            case 70: {
                var29_8 /* !! */  = (int)hr.btxb("bvxd", btwu(int ), (int)600);
                if (!var30_7) ** GOTO lbl295
                throw null;
            }
lbl420:
            // 2 sources

            case 71: {
                var29_8 /* !! */  = (int)hr.btxb("bvxe", btwu(int ), (int)601);
                if (!var30_7) ** GOTO lbl408
                throw null;
            }
            case 72: {
                var29_8 /* !! */  = (int)hr.btxb("bvxf", btwu(int ), (int)602);
                if (!var30_7) ** GOTO lbl341
                throw null;
            }
lbl428:
            // 2 sources

            case 73: {
                var29_8 /* !! */  = (int)hr.btxb("bvxg", btwu(int ), (int)603);
                if (!var30_7) ** GOTO lbl141
                throw null;
            }
            case 74: 
        }
        var29_8 /* !! */  = (int)hr.btxb("bvxh", btwu(int ), (int)604);
        ** while (!var30_7)
lbl435:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isWithinRange(class_243 var1_1) {
        v0 /* !! */  = hr.ei;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - hr.btxb("bvqu", btxi(int ), (int)193));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1486508503: {
                    v1 = hr.btxb("bvqv", btxi(int ), (int)194);
                    continue block39;
                }
                case -1128236333: {
                    v1 = hr.btxb("bvqw", btxi(int ), (int)195);
                    continue block39;
                }
                case 1256329734: {
                    v1 = hr.btxb("bvqx", btxi(int ), (int)196);
                    continue block39;
                }
                case 2083520731: {
                    break block39;
                }
            }
            break;
        }
        var6_2 = hr.c;
        v2 /* !! */  = hr.ei;
        if (true) ** GOTO lbl22
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - hr.btxb("bvqy", btxi(int ), (int)197));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -501330332: {
                    v3 = hr.btxb("bvqz", btxi(int ), (int)198);
                    continue block40;
                }
                case 1593005608: {
                    v3 = hr.btxb("bvra", btxi(int ), (int)199);
                    continue block40;
                }
                case 2083520731: {
                    break block40;
                }
            }
            break;
        }
        var5_3 /* !! */  = hr.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bvrb", btxi(int ), (int)200)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hr.btxb("bvrc", btwu(int ), (int)459)) break;
            v4 /* !! */  = (long)hr.btxb("bvrd", btwu(int ), (int)460);
        }
        var4_4 = hr.a;
        if (var6_2) {
            throw null;
lbl41:
            // 6 sources

            return (boolean)hr.btxb("bvre", btwu(int ), (int)461);
        }
        if (var4_4) ** GOTO lbl41
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl41
                v5 /* !! */  = hr.ei;
                if (true) ** GOTO lbl52
                block43: while (true) {
                    v5 /* !! */  = (long)(v6 - hr.btxb("bvrf", btxi(int ), (int)201));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1233614651: {
                            v6 = hr.btxb("bvrg", btxi(int ), (int)202);
                            continue block43;
                        }
                        case -228615878: {
                            v6 = hr.btxb("bvrh", btxi(int ), (int)203);
                            continue block43;
                        }
                        case 586604100: {
                            v6 = hr.btxb("bvri", btxi(int ), (int)204);
                            continue block43;
                        }
                        case 2083520731: {
                            break block43;
                        }
                    }
                    break;
                }
                v7 /* !! */  = hr.ei;
                if (true) ** GOTO lbl68
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - hr.btxb("bvrj", btxi(int ), (int)205));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -543728670: {
                            v8 = hr.btxb("bvrk", btxi(int ), (int)206);
                            continue block44;
                        }
                        case 1366926683: {
                            v8 = hr.btxb("bvrl", btxi(int ), (int)207);
                            continue block44;
                        }
                        case 2083520731: {
                            break block44;
                        }
                    }
                    break;
                }
                v9 = hr.mc.field_1724;
                v10 /* !! */  = hr.ei;
                if (true) ** GOTO lbl82
                block45: while (true) {
                    v10 /* !! */  = (long)(hr.btxb("bvrn", btxi(int ), (int)209) - hr.btxb("bvrm", btxi(int ), (int)208));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1854690918: {
                            continue block45;
                        }
                        case 2083520731: {
                            break block45;
                        }
                    }
                    break;
                }
                v11 = v9.method_73189();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bvro", btxi(int ), (int)210)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == hr.btxb("bvrp", btwu(int ), (int)462)) break;
                    v12 /* !! */  = (long)hr.btxb("bvrq", btwu(int ), (int)463);
                }
                var2_5 = v11.method_1022(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl41
                if (!(var2_5 >= hr.btxb("bvrr", buso(int ), (int)211))) ** GOTO lbl104
                if (var4_4) ** GOTO lbl41
                if (!(var2_5 <= hr.btxb("bvrs", buso(int ), (int)212))) ** GOTO lbl104
                if (var4_4) ** GOTO lbl41
                v13 = hr.btxb("bvrt", btwu(int ), (int)464);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl107
lbl104:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v13 = hr.btxb("bvru", btwu(int ), (int)465);
lbl107:
                // 2 sources

                return (boolean)v13;
            }
lbl108:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hr.btxb("bvrv", btwu(int ), (int)466);
                if (!var6_2) break;
                throw null;
            }
lbl112:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)hr.btxb("bvrw", btwu(int ), (int)467);
                if (!var6_2) break;
                throw null;
            }
lbl116:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hr.btxb("bvrx", btwu(int ), (int)468);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl121:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hr.btxb("bvry", btwu(int ), (int)469);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl126:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)hr.btxb("bvrz", btwu(int ), (int)470);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 5: {
                var5_3 /* !! */  = (int)hr.btxb("bvsa", btwu(int ), (int)471);
                if (!var6_2) ** GOTO lbl112
                throw null;
            }
lbl135:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)hr.btxb("bvsb", btwu(int ), (int)472);
                if (!var6_2) ** GOTO lbl121
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)hr.btxb("bvsc", btwu(int ), (int)473);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl143:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hr.btxb("bvsd", btwu(int ), (int)474);
                    if (!var6_2) ** GOTO lbl126
                    throw null;
                }
            }
lbl148:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hr.btxb("bvse", btwu(int ), (int)475);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 10: 
        }
        var5_3 /* !! */  = (int)hr.btxb("bvsf", btwu(int ), (int)476);
        ** while (!var6_2)
lbl155:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdy() {
        hr.btxj[400] = -710177605979297865L;
        hr.btxj[401] = 2483807553746114013L;
        hr.btxj[402] = -3247325063933293038L;
        hr.btxj[403] = -8632116394188190623L;
        hr.btxj[404] = -3563824954951076968L;
        hr.btxj[405] = 8727086511868991096L;
        hr.btxj[406] = -2457867285819054023L;
        hr.btxj[407] = 2957228935365017546L;
        hr.btxj[408] = 1288942001381028287L;
        hr.btxj[409] = 3126605336749433989L;
    }

    private static /* synthetic */ void bxdz() {
        hr.btxk[0] = 4565274038873172957L;
        hr.btxk[1] = 1619189893662791921L;
        hr.btxk[2] = -2507429007246656357L;
        hr.btxk[3] = -6826170735977717665L;
        hr.btxk[4] = 1688738063016157935L;
        hr.btxk[5] = -6424131109725426498L;
        hr.btxk[6] = 7588743983440113936L;
        hr.btxk[7] = -7672639836500576225L;
        hr.btxk[8] = -2640950905913029473L;
        hr.btxk[9] = 3826133328813097833L;
        hr.btxk[10] = 2526116696842151106L;
        hr.btxk[11] = 2343445621457558310L;
        hr.btxk[12] = 7521387217704269641L;
        hr.btxk[13] = 4149902515642933925L;
        hr.btxk[14] = -7458558173029179186L;
        hr.btxk[15] = 6608069483672340207L;
        hr.btxk[16] = -5008618686404439887L;
        hr.btxk[17] = 5917280682015309283L;
        hr.btxk[18] = -3919628010894049530L;
        hr.btxk[19] = 8318329705355882811L;
        hr.btxk[20] = -4972195435180724074L;
        hr.btxk[21] = -5896103728662053142L;
        hr.btxk[22] = -1947518914268309768L;
        hr.btxk[23] = -7084774483538144287L;
        hr.btxk[24] = -9054155998437204900L;
        hr.btxk[25] = -7038662275413982117L;
        hr.btxk[26] = 4974645297062577184L;
        hr.btxk[27] = 8404192111736763985L;
        hr.btxk[28] = 4640590098270490242L;
        hr.btxk[29] = 8488066700089258324L;
        hr.btxk[30] = -6261129608111259832L;
        hr.btxk[31] = -5822786528162669626L;
        hr.btxk[32] = 6378066160090543502L;
        hr.btxk[33] = 2440294316244779147L;
        hr.btxk[34] = 6361929543861577643L;
        hr.btxk[35] = 592478342922341800L;
        hr.btxk[36] = 4494266856860479755L;
        hr.btxk[37] = 2888631705349633980L;
        hr.btxk[38] = -7394675894685011726L;
        hr.btxk[39] = 890826713365090767L;
        hr.btxk[40] = 7653958486459767316L;
        hr.btxk[41] = 3390896107644252752L;
        hr.btxk[42] = -1344448335140159486L;
        hr.btxk[43] = -4075831268270063192L;
        hr.btxk[44] = -3458062116166757501L;
        hr.btxk[45] = 8321270302395147058L;
        hr.btxk[46] = -6397869115949371815L;
        hr.btxk[47] = -8781290089756598085L;
        hr.btxk[48] = -4661180384036051347L;
        hr.btxk[49] = -5138252340950473755L;
        hr.btxk[50] = -4545478453583472951L;
        hr.btxk[51] = 894826353636868576L;
        hr.btxk[52] = 6191149689959639588L;
        hr.btxk[53] = -3465265690968252074L;
        hr.btxk[54] = -4697064450331744376L;
        hr.btxk[55] = -3916414909801931669L;
        hr.btxk[56] = -3918789303761724820L;
        hr.btxk[57] = 4865760251364309226L;
        hr.btxk[58] = -3728876810461566975L;
        hr.btxk[59] = 8528426209676079041L;
        hr.btxk[60] = 9016460306427717068L;
        hr.btxk[61] = -1995763984271116369L;
        hr.btxk[62] = 57279041305331060L;
        hr.btxk[63] = 7305292532471088955L;
        hr.btxk[64] = 5395819547468786141L;
        hr.btxk[65] = 9001762781349249511L;
        hr.btxk[66] = 5537627589068913013L;
        hr.btxk[67] = -686963652223040347L;
        hr.btxk[68] = 922491354797965772L;
        hr.btxk[69] = -863257408838664086L;
        hr.btxk[70] = -7839139275176068415L;
        hr.btxk[71] = -6474815315828120356L;
        hr.btxk[72] = -5458637384921973567L;
        hr.btxk[73] = -2785680982282330096L;
        hr.btxk[74] = -5504955905129360158L;
        hr.btxk[75] = 7379428321364557932L;
        hr.btxk[76] = -8951467943118537226L;
        hr.btxk[77] = -7319932823648467975L;
        hr.btxk[78] = -342913797234956091L;
        hr.btxk[79] = -8990916032555292664L;
        hr.btxk[80] = 3623141071457401603L;
        hr.btxk[81] = -1293771942686155065L;
        hr.btxk[82] = 4834629761426041829L;
        hr.btxk[83] = -774567370780237021L;
        hr.btxk[84] = 8109527381969449815L;
        hr.btxk[85] = -3228937084212748704L;
        hr.btxk[86] = 643951822521484456L;
        hr.btxk[87] = -6268671606834777261L;
        hr.btxk[88] = 1323641943747505698L;
        hr.btxk[89] = -4689300055285207191L;
        hr.btxk[90] = 6888240711924525445L;
        hr.btxk[91] = -4065158022969915292L;
        hr.btxk[92] = -8121256443404496022L;
        hr.btxk[93] = 6184782119551902521L;
        hr.btxk[94] = -2876860746810369009L;
        hr.btxk[95] = -8781407068371324519L;
        hr.btxk[96] = -8999694111989528727L;
        hr.btxk[97] = 8409808950685391220L;
        hr.btxk[98] = -4558020210030736828L;
        hr.btxk[99] = 1690649054063793581L;
    }

    private static /* synthetic */ void bxdq() {
        hr.btwz[600] = -678857589;
        hr.btwz[601] = -1477213598;
        hr.btwz[602] = -1913031191;
        hr.btwz[603] = 613436172;
        hr.btwz[604] = -820243672;
        hr.btwz[605] = 854313969;
        hr.btwz[606] = -1204091311;
        hr.btwz[607] = 1800498216;
        hr.btwz[608] = 612117417;
        hr.btwz[609] = -37891200;
        hr.btwz[610] = 70857871;
        hr.btwz[611] = 1849022233;
        hr.btwz[612] = -69152491;
        hr.btwz[613] = -1406693616;
        hr.btwz[614] = -2135122989;
        hr.btwz[615] = 1089531426;
        hr.btwz[616] = -1784735481;
        hr.btwz[617] = -522027291;
        hr.btwz[618] = 45166951;
        hr.btwz[619] = 1427209857;
        hr.btwz[620] = 618308899;
        hr.btwz[621] = -1107218392;
        hr.btwz[622] = 1912697809;
        hr.btwz[623] = 917409377;
        hr.btwz[624] = -772079424;
        hr.btwz[625] = -891844645;
        hr.btwz[626] = 470896214;
        hr.btwz[627] = -1768859834;
        hr.btwz[628] = 952501483;
        hr.btwz[629] = 1446825305;
        hr.btwz[630] = 1036046826;
        hr.btwz[631] = -1579602361;
        hr.btwz[632] = 1960291644;
        hr.btwz[633] = -1673311250;
        hr.btwz[634] = 1419089484;
        hr.btwz[635] = -2011600763;
        hr.btwz[636] = 304885542;
        hr.btwz[637] = -1687570023;
        hr.btwz[638] = -70806662;
        hr.btwz[639] = 874523024;
        hr.btwz[640] = 1399042703;
        hr.btwz[641] = 1471530514;
        hr.btwz[642] = -1430413721;
        hr.btwz[643] = 1290875912;
        hr.btwz[644] = -2093973598;
        hr.btwz[645] = -1690692082;
        hr.btwz[646] = -1467450133;
        hr.btwz[647] = 1913299079;
        hr.btwz[648] = -1407601180;
        hr.btwz[649] = 1122643648;
        hr.btwz[650] = -1117338374;
        hr.btwz[651] = 654548670;
        hr.btwz[652] = -775298939;
        hr.btwz[653] = -742189661;
        hr.btwz[654] = 1967848216;
        hr.btwz[655] = 1358144733;
        hr.btwz[656] = 1925315576;
        hr.btwz[657] = 125282422;
        hr.btwz[658] = 2013307916;
        hr.btwz[659] = 1980936504;
        hr.btwz[660] = 1438564549;
        hr.btwz[661] = 356249992;
        hr.btwz[662] = -601604653;
        hr.btwz[663] = -202800601;
        hr.btwz[664] = 749160349;
        hr.btwz[665] = 322632757;
        hr.btwz[666] = -454208553;
        hr.btwz[667] = 343074861;
        hr.btwz[668] = 1958304430;
        hr.btwz[669] = 200732080;
        hr.btwz[670] = 1057563232;
        hr.btwz[671] = -1392667045;
        hr.btwz[672] = -770111431;
        hr.btwz[673] = 1888183810;
        hr.btwz[674] = 834108746;
        hr.btwz[675] = -995093258;
        hr.btwz[676] = 1764641376;
        hr.btwz[677] = -641307311;
        hr.btwz[678] = -297603592;
        hr.btwz[679] = -1970881961;
        hr.btwz[680] = -208349116;
        hr.btwz[681] = 2123133285;
        hr.btwz[682] = -66569080;
        hr.btwz[683] = -1380069870;
        hr.btwz[684] = 1578071119;
        hr.btwz[685] = 440407912;
        hr.btwz[686] = -237971385;
        hr.btwz[687] = 1712863834;
        hr.btwz[688] = 305220557;
        hr.btwz[689] = -366025236;
        hr.btwz[690] = 830919527;
        hr.btwz[691] = 898985891;
        hr.btwz[692] = -293258303;
        hr.btwz[693] = -376435918;
        hr.btwz[694] = 411067887;
        hr.btwz[695] = 145933225;
        hr.btwz[696] = 103287124;
        hr.btwz[697] = 164504756;
        hr.btwz[698] = -1631153405;
        hr.btwz[699] = 1554492385;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hitsBlock(class_243 var1_1, class_243 var2_2) {
        block33: {
            block32: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwdd", btxi(int ), (int)222)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == hr.btxb("bwde", btwu(int ), (int)751)) break;
                    v0 /* !! */  = (long)hr.btxb("bwdf", btwu(int ), (int)752);
                }
                var5_3 = hr.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwdg", btxi(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == hr.btxb("bwdh", btwu(int ), (int)753)) break;
                    v1 /* !! */  = (long)hr.btxb("bwdi", btwu(int ), (int)754);
                }
                var4_4 = hr.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwdj", btxi(int ), (int)224)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hr.btxb("bwdk", btwu(int ), (int)755)) break;
                    v2 /* !! */  = (long)hr.btxb("bwdl", btwu(int ), (int)756);
                }
                var3_5 = hr.a;
                if (var5_3) {
                    throw null;
lbl21:
                    // 3 sources

                    return (boolean)hr.btxb("bwdm", btwu(int ), (int)757);
                }
                if (var3_5 || var3_5) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bwdn", btxi(int ), (int)225)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hr.btxb("bwdo", btwu(int ), (int)758)) break;
                    v3 /* !! */  = (long)hr.btxb("bwdp", btwu(int ), (int)759);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bwdq", btxi(int ), (int)226)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hr.btxb("bwdr", btwu(int ), (int)760)) break;
                    v4 /* !! */  = (long)hr.btxb("bwds", btwu(int ), (int)761);
                }
                v5 = hr.mc.field_1687;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bwdt", btxi(int ), (int)227)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hr.btxb("bwdu", btwu(int ), (int)762)) break;
                    v6 /* !! */  = (long)hr.btxb("bwdv", btwu(int ), (int)763);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bwdw", btxi(int ), (int)228)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hr.btxb("bwdx", btwu(int ), (int)764)) break;
                    v7 /* !! */  = (long)hr.btxb("bwdy", btwu(int ), (int)765);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_7 = hr.ei - hr.btxb("bwdz", btxi(int ), (int)229)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hr.btxb("bwea", btwu(int ), (int)766)) break;
                    v8 /* !! */  = (long)hr.btxb("bweb", btwu(int ), (int)767);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_8 = hr.ei - hr.btxb("bwec", btxi(int ), (int)230)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hr.btxb("bwed", btwu(int ), (int)768)) break;
                    v9 /* !! */  = (long)hr.btxb("bwee", btwu(int ), (int)769);
                }
                v10 /* !! */  = hr.ei;
                if (true) ** GOTO lbl59
                block25: while (true) {
                    v10 /* !! */  = (long)(v11 - hr.btxb("bwef", btxi(int ), (int)231));
lbl59:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 77201119: {
                            v11 = hr.btxb("bweg", btxi(int ), (int)232);
                            continue block25;
                        }
                        case 2083520731: {
                            break block25;
                        }
                        case 2086740690: {
                            v11 = hr.btxb("bweh", btxi(int ), (int)233);
                            continue block25;
                        }
                    }
                    break;
                }
                v12 = hr.mc.field_1724;
                v13 /* !! */  = hr.ei;
                if (true) ** GOTO lbl73
                block26: while (true) {
                    v13 /* !! */  = (long)(hr.btxb("bwej", btxi(int ), (int)235) - hr.btxb("bwei", btxi(int ), (int)234));
lbl73:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 195061779: {
                            continue block26;
                        }
                        case 2083520731: {
                            break block26;
                        }
                    }
                    break;
                }
                v14 = new class_3959(var1_1, var2_2, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)v12);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_9 = hr.ei - hr.btxb("bwek", btxi(int ), (int)236)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hr.btxb("bwel", btwu(int ), (int)770)) break;
                    v15 /* !! */  = (long)hr.btxb("bwem", btwu(int ), (int)771);
                }
                v16 = v5.method_17742(v14);
                v17 /* !! */  = hr.ei;
                if (true) ** GOTO lbl89
                block28: while (true) {
                    v17 /* !! */  = (long)(v18 - hr.btxb("bwen", btxi(int ), (int)237));
lbl89:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1647336958: {
                            v18 = hr.btxb("bweo", btxi(int ), (int)238);
                            continue block28;
                        }
                        case -1556463929: {
                            v18 = hr.btxb("bwep", btxi(int ), (int)239);
                            continue block28;
                        }
                        case 130506200: {
                            v18 = hr.btxb("bweq", btxi(int ), (int)240);
                            continue block28;
                        }
                        case 2083520731: {
                            break block28;
                        }
                    }
                    break;
                }
                v19 = v16.method_17783();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_10 = hr.ei - hr.btxb("bwer", btxi(int ), (int)241)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hr.btxb("bwes", btwu(int ), (int)772)) break;
                    v20 /* !! */  = (long)hr.btxb("bwet", btwu(int ), (int)773);
                }
                if (v19 != class_239.class_240.field_1332) break block32;
                if (var3_5) ** GOTO lbl21
                v21 = hr.btxb("bweu", btwu(int ), (int)774);
                if (var5_3) {
                    throw null;
                }
                break block33;
            }
            if (!var3_5 && !var3_5) ** break;
            ** while (true)
            v21 = hr.btxb("bwev", btwu(int ), (int)775);
        }
        return (boolean)v21;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private double getHorizontalDistanceTo(class_1684 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bver", btxi(int ), (int)138)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("bves", btwu(int ), (int)377)) break;
            v0 /* !! */  = (long)hr.btxb("bvet", btwu(int ), (int)378);
        }
        var10_2 = hr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bveu", btxi(int ), (int)139)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hr.btxb("bvev", btwu(int ), (int)379)) break;
            v1 /* !! */  = (long)hr.btxb("bvew", btwu(int ), (int)380);
        }
        var9_3 /* !! */  = hr.b;
        v2 /* !! */  = hr.ei;
        block41: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -535556504: {
                    v2 /* !! */  = (long)(hr.btxb("bvey", btxi(int ), (int)141) - hr.btxb("bvex", btxi(int ), (int)140));
                    continue block41;
                }
                case 2083520731: {
                    break block41;
                }
            }
            break;
        }
        var8_4 = hr.a;
        if (var10_2) {
            throw null;
        }
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bvfa", btxi(int ), (int)143)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hr.btxb("bvfb", btwu(int ), (int)381)) break;
            v3 /* !! */  = (long)hr.btxb("bvfc", btwu(int ), (int)382);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bvfd", btxi(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hr.btxb("bvfe", btwu(int ), (int)383)) break;
            v4 /* !! */  = (long)hr.btxb("bvff", btwu(int ), (int)384);
        }
        v5 = hr.mc.field_1724;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bvfg", btxi(int ), (int)145)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hr.btxb("bvfh", btwu(int ), (int)385)) break;
            v6 /* !! */  = (long)hr.btxb("bvfi", btwu(int ), (int)386);
        }
        var2_5 = v5.method_73189();
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        v7 /* !! */  = hr.ei;
        block45: while (true) {
            switch ((int)v7 /* !! */ ) {
                case -1231571844: {
                    v7 /* !! */  = (long)(hr.btxb("bvfk", btxi(int ), (int)147) - hr.btxb("bvfj", btxi(int ), (int)146));
                    continue block45;
                }
                case 2083520731: {
                    break block45;
                }
            }
            break;
        }
        var3_6 = var1_1.method_73189();
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bvfl", btxi(int ), (int)148)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hr.btxb("bvfm", btwu(int ), (int)387)) break;
            v8 /* !! */  = (long)hr.btxb("bvfn", btwu(int ), (int)388);
        }
        v9 = var3_6.field_1352;
        v10 /* !! */  = hr.ei;
        block47: while (true) {
            switch ((int)v10 /* !! */ ) {
                case -1228615603: {
                    v10 /* !! */  = (long)(hr.btxb("bvfp", btxi(int ), (int)150) - hr.btxb("bvfo", btxi(int ), (int)149));
                    continue block47;
                }
                case 2083520731: {
                    break block47;
                }
            }
            break;
        }
        var4_7 = v9 - var2_5.field_1352;
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        v11 /* !! */  = hr.ei;
        block48: while (true) {
            switch ((int)v11 /* !! */ ) {
                case -1938179272: {
                    v11 /* !! */  = (long)(hr.btxb("bvfr", btxi(int ), (int)152) - hr.btxb("bvfq", btxi(int ), (int)151));
                    continue block48;
                }
                case 2083520731: {
                    break block48;
                }
            }
            break;
        }
        v12 = var3_6.field_1350;
        v13 /* !! */  = hr.ei;
        if (true) ** GOTO lbl86
        block49: while (true) {
            v13 /* !! */  = (long)(v14 - hr.btxb("bvfs", btxi(int ), (int)153));
lbl86:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1666630968: {
                    v14 = hr.btxb("bvft", btxi(int ), (int)154);
                    continue block49;
                }
                case 1017536631: {
                    v14 = hr.btxb("bvfu", btxi(int ), (int)155);
                    continue block49;
                }
                case 2083520731: {
                    break block49;
                }
            }
            break;
        }
        var6_8 = v12 - var2_5.field_1350;
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var8_4 != false) return (double)hr.btxb("bvez", buso(int ), (int)142);
        if (var9_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block50: do {
            switch (cfr_temp_0 == -2147483648 ? var9_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v15 /* !! */  = hr.ei;
                    block51: while (true) {
                        switch ((int)v15 /* !! */ ) {
                            case -1481229663: {
                                v15 /* !! */  = (long)(hr.btxb("bvfw", btxi(int ), (int)157) - hr.btxb("bvfv", btxi(int ), (int)156));
                                continue block51;
                            }
                            case 2083520731: {
                                return Math.sqrt(var4_7 * var4_7 + var6_8 * var6_8);
                            }
                        }
                        break;
                    }
                    return Math.sqrt(var4_7 * var4_7 + var6_8 * var6_8);
                }
                case 1: {
                    var9_3 /* !! */  = (int)hr.btxb("bvfy", btwu(int ), (int)390);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 2: {
                    var9_3 /* !! */  = (int)hr.btxb("bvfz", btwu(int ), (int)391);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 0: {
                    do {
                        var9_3 /* !! */  = (int)hr.btxb("bvfx", btwu(int ), (int)389);
                    } while (!var10_2);
                    throw null;
                }
                case 3: {
                    var9_3 /* !! */  = (int)hr.btxb("bvga", btwu(int ), (int)392);
                    cfr_temp_0 = 9;
                    if (!var10_2) continue block50;
                    throw null;
                }
                case 5: {
                    do {
                        var9_3 /* !! */  = (int)hr.btxb("bvgc", btwu(int ), (int)394);
                    } while (!var10_2);
                    throw null;
                }
                case 7: {
                    ** GOTO lbl159
                }
                case 9: {
                    var9_3 /* !! */  = (int)hr.btxb("bvgg", btwu(int ), (int)398);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 6: {
                    var9_3 /* !! */  = (int)hr.btxb("bvgd", btwu(int ), (int)395);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 4: {
                    do {
                        var9_3 /* !! */  = (int)hr.btxb("bvgb", btwu(int ), (int)393);
                    } while (!var10_2);
                    throw null;
                }
                case 10: {
                    var9_3 /* !! */  = (int)hr.btxb("bvgh", btwu(int ), (int)399);
                    cfr_temp_0 = 8;
                    if (!var10_2) continue block50;
                    throw null;
                }
                case 11: {
                    var9_3 /* !! */  = (int)hr.btxb("bvgi", btwu(int ), (int)400);
                    if (var10_2) {
                        throw null;
                    }
lbl159:
                    // 3 sources

                    var9_3 /* !! */  = (int)hr.btxb("bvge", btwu(int ), (int)396);
                    if (var10_2) {
                        throw null;
                    }
                }
                case 8: 
            }
            break;
        } while (true);
        do {
            var9_3 /* !! */  = (int)hr.btxb("bvgf", btwu(int ), (int)397);
        } while (!var10_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$hitsEntity$4(class_1297 var1_1) {
        v0 /* !! */  = hr.ei;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(v1 - hr.btxb("bwni", btxi(int ), (int)335));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1645544254: {
                    v1 = hr.btxb("bwnj", btxi(int ), (int)336);
                    continue block43;
                }
                case -1127857318: {
                    v1 = hr.btxb("bwnk", btxi(int ), (int)337);
                    continue block43;
                }
                case -873653863: {
                    v1 = hr.btxb("bwnl", btxi(int ), (int)338);
                    continue block43;
                }
                case 2083520731: {
                    break block43;
                }
            }
            break;
        }
        var4_2 = hr.c;
        v2 /* !! */  = hr.ei;
        if (true) ** GOTO lbl22
        block44: while (true) {
            v2 /* !! */  = (long)(v3 - hr.btxb("bwnm", btxi(int ), (int)339));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2021720664: {
                    v3 = hr.btxb("bwnn", btxi(int ), (int)340);
                    continue block44;
                }
                case 1925043238: {
                    v3 = hr.btxb("bwno", btxi(int ), (int)341);
                    continue block44;
                }
                case 2083520731: {
                    break block44;
                }
            }
            break;
        }
        var3_3 /* !! */  = hr.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwnp", btxi(int ), (int)342)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hr.btxb("bwnq", btwu(int ), (int)903)) break;
            v4 /* !! */  = (long)hr.btxb("bwnr", btwu(int ), (int)904);
        }
        var2_4 = hr.a;
        if (var4_2) {
            throw null;
lbl41:
            // 10 sources

            return (boolean)hr.btxb("bwns", btwu(int ), (int)905);
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwnt", btxi(int ), (int)343)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == hr.btxb("bwnu", btwu(int ), (int)906)) break;
            v5 /* !! */  = (long)hr.btxb("bwnv", btwu(int ), (int)907);
        }
        if (!var1_1.method_5805()) ** GOTO lbl84
        if (var2_4) ** GOTO lbl41
        v6 /* !! */  = hr.ei;
        if (true) ** GOTO lbl56
        block48: while (true) {
            v6 /* !! */  = (long)(hr.btxb("bwnx", btxi(int ), (int)345) - hr.btxb("bwnw", btxi(int ), (int)344));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 1214495944: {
                    continue block48;
                }
                case 2083520731: {
                    break block48;
                }
            }
            break;
        }
        if (var1_1.method_7325()) ** GOTO lbl84
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                v7 /* !! */  = hr.ei;
                if (true) ** GOTO lbl70
                block49: while (true) {
                    v7 /* !! */  = (long)(v8 - hr.btxb("bwny", btxi(int ), (int)346));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 1512223754: {
                            v8 = hr.btxb("bwnz", btxi(int ), (int)347);
                            continue block49;
                        }
                        case 1836991583: {
                            v8 = hr.btxb("bwoa", btxi(int ), (int)348);
                            continue block49;
                        }
                        case 1912504750: {
                            v8 = hr.btxb("bwob", btxi(int ), (int)349);
                            continue block49;
                        }
                        case 2083520731: {
                            break block49;
                        }
                    }
                    break;
                }
                if (!var1_1.field_5960) ** GOTO lbl86
                if (var2_4) ** GOTO lbl41
lbl84:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                return (boolean)hr.btxb("bwoc", btwu(int ), (int)908);
lbl86:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwod", btxi(int ), (int)350)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hr.btxb("bwoe", btwu(int ), (int)909)) break;
                    v9 /* !! */  = (long)hr.btxb("bwof", btwu(int ), (int)910);
                }
                if (var1_1 != this.targetPearl) ** GOTO lbl96
                if (var2_4 || var2_4) ** GOTO lbl41
                return (boolean)hr.btxb("bwog", btwu(int ), (int)911);
lbl96:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                if (var1_1 instanceof class_1684) ** GOTO lbl103
                if (var2_4) ** GOTO lbl41
                v10 = hr.btxb("bwoh", btwu(int ), (int)912);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
lbl103:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v10 = hr.btxb("bwoi", btwu(int ), (int)913);
lbl106:
                // 2 sources

                return (boolean)v10;
            }
lbl107:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hr.btxb("bwoj", btwu(int ), (int)914);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl112:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)hr.btxb("bwok", btwu(int ), (int)915);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 2: {
                var3_3 /* !! */  = (int)hr.btxb("bwol", btwu(int ), (int)916);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 3: {
                var3_3 /* !! */  = (int)hr.btxb("bwom", btwu(int ), (int)917);
                if (!var4_2) break;
                throw null;
            }
lbl126:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hr.btxb("bwon", btwu(int ), (int)918);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 5: {
                var3_3 /* !! */  = (int)hr.btxb("bwoo", btwu(int ), (int)919);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl136:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hr.btxb("bwop", btwu(int ), (int)920);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 7: {
                var3_3 /* !! */  = (int)hr.btxb("bwoq", btwu(int ), (int)921);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
lbl145:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hr.btxb("bwor", btwu(int ), (int)922);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
lbl149:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hr.btxb("bwos", btwu(int ), (int)923);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)hr.btxb("bwot", btwu(int ), (int)924);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl158:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)hr.btxb("bwou", btwu(int ), (int)925);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl163:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)hr.btxb("bwov", btwu(int ), (int)926);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
lbl167:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)hr.btxb("bwow", btwu(int ), (int)927);
                if (!var4_2) ** GOTO lbl158
                throw null;
            }
lbl171:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)hr.btxb("bwox", btwu(int ), (int)928);
                if (var4_2) {
                    throw null;
                }
            }
            case 15: {
                var3_3 /* !! */  = (int)hr.btxb("bwoy", btwu(int ), (int)929);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
lbl179:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)hr.btxb("bwoz", btwu(int ), (int)930);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
lbl183:
            // 3 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hr.btxb("bwpa", btwu(int ), (int)931);
                    if (!var4_2) ** GOTO lbl126
                    throw null;
                }
            }
            case 18: {
                var3_3 /* !! */  = (int)hr.btxb("bwpb", btwu(int ), (int)932);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 19: 
        }
        var3_3 /* !! */  = (int)hr.btxb("bwpc", btwu(int ), (int)933);
        ** while (!var4_2)
lbl195:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private float[] calculateYawPitch(class_243 var1_1) {
        var20_2 = hr.c;
        var19_3 /* !! */  = hr.b;
        var18_4 = hr.a;
        if (var20_2) {
            throw null;
        }
        if (var18_4 || var18_4) return null;
        if (var19_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block35: while (true) {
            block78: {
                switch (cfr_temp_0 == -2147483648 ? var19_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var2_5 = hr.mc.field_1724.method_73189();
                        if (var18_4 || var18_4) return null;
                        var3_6 = var1_1.field_1352 - var2_5.field_1352;
                        if (var18_4 || var18_4) return null;
                        var5_7 = var1_1.field_1351 - hr.mc.field_1724.method_23320();
                        if (var18_4 || var18_4) return null;
                        var7_8 = var1_1.field_1350 - var2_5.field_1350;
                        if (var18_4 || var18_4) return null;
                        var9_9 = (float)Math.toDegrees(Math.atan2(var7_8, var3_6)) - hr.btxb("bvsg", bubr(int ), (int)477);
                        if (var18_4 || var18_4) return null;
                        var10_10 = Math.sqrt(var3_6 * var3_6 + var7_8 * var7_8);
                        if (var18_4 || var18_4) return null;
                        var12_11 = Math.max((double)hr.btxb("bvsh", buso(int ), (int)213), hr.mc.field_1724.method_73189().method_1022(var1_1) * hr.btxb("bvsi", buso(int ), (int)214));
                        if (var18_4 || var18_4) return null;
                        var14_12 = this.findBestCandidate(var1_1, var9_9, (float)hr.btxb("bvsj", bubr(int ), (int)478), (float)hr.btxb("bvsk", bubr(int ), (int)479), var12_11, (boolean)hr.btxb("bvsl", btwu(int ), (int)480));
                        if (var18_4 || var18_4) return null;
                        if (var14_12 != null) {
                            if (var18_4 || var18_4) return null;
                            v0 = new float[2];
                            v0[0] = var9_9;
                            v0[hr.btxb("bvsm", btwu(int ), (int)481)] = class_3532.method_15363((float)var14_12.pitch, (float)hr.btxb("bvsn", bubr(int ), (int)482), (float)hr.btxb("bvso", bubr(int ), (int)483));
                            return v0;
                        }
                        if (var18_4 || var18_4) return null;
                        var15_13 = this.findBestCandidate(var1_1, var9_9, (float)hr.btxb("bvsp", bubr(int ), (int)484), (float)hr.btxb("bvsq", bubr(int ), (int)485), var12_11, (boolean)hr.btxb("bvsr", btwu(int ), (int)486));
                        if (var18_4 || var18_4) return null;
                        if (var15_13 == null) {
                            if (var18_4 || var18_4) return null;
                            var16_14 = -Math.toDegrees(Math.atan2(var5_7, var10_10)) + hr.btxb("bvss", buso(int ), (int)215);
                            if (var18_4 || var18_4) return null;
                            v1 = new float[2];
                            v1[0] = var9_9;
                            v1[hr.btxb("bvst", btwu(int ), (int)487)] = class_3532.method_15363((float)((float)var16_14), (float)hr.btxb("bvsu", bubr(int ), (int)488), (float)hr.btxb("bvsv", bubr(int ), (int)489));
                            return v1;
                        }
                        if (var18_4 || var18_4) {
                            return null;
                        }
                        v2 = new float[2];
                        v2[0] = var9_9;
                        v2[hr.btxb("bvsw", btwu(int ), (int)490)] = class_3532.method_15363((float)var15_13.pitch, (float)hr.btxb("bvsx", bubr(int ), (int)491), (float)hr.btxb("bvsy", bubr(int ), (int)492));
                        return v2;
                    }
                    case 0: {
                        var19_3 /* !! */  = (int)hr.btxb("bvsz", btwu(int ), (int)493);
                        cfr_temp_0 = 7;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 1: {
                        var19_3 /* !! */  = (int)hr.btxb("bvta", btwu(int ), (int)494);
                        cfr_temp_0 = 14;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 2: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtb", btwu(int ), (int)495);
                        cfr_temp_0 = 18;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 3: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtc", btwu(int ), (int)496);
                        cfr_temp_0 = 14;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 9: {
                        ** GOTO lbl193
                    }
                    case 11: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtk", btwu(int ), (int)504);
                        cfr_temp_0 = 25;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 12: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtl", btwu(int ), (int)505);
                        cfr_temp_0 = 26;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 13: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtm", btwu(int ), (int)506);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtp", btwu(int ), (int)509);
                        cfr_temp_0 = 30;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 17: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtq", btwu(int ), (int)510);
                        if (!var20_2) ** break;
                        throw null;
                    }
                    case 19: {
                        var19_3 /* !! */  = (int)hr.btxb("bvts", btwu(int ), (int)512);
                        cfr_temp_0 = 29;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 20: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtt", btwu(int ), (int)513);
                        cfr_temp_0 = 4;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 21: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtu", btwu(int ), (int)514);
                        cfr_temp_0 = 29;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 22: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtv", btwu(int ), (int)515);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var19_3 /* !! */  = (int)hr.btxb("bvte", btwu(int ), (int)498);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtg", btwu(int ), (int)500);
                        cfr_temp_0 = 31;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 26: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtz", btwu(int ), (int)519);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtr", btwu(int ), (int)511);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtn", btwu(int ), (int)507);
                        cfr_temp_0 = 4;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 27: {
                        var19_3 /* !! */  = (int)hr.btxb("bvua", btwu(int ), (int)520);
                        cfr_temp_0 = 31;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 28: {
                        var19_3 /* !! */  = (int)hr.btxb("bvub", btwu(int ), (int)521);
                        cfr_temp_0 = 24;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 29: {
                        var19_3 /* !! */  = (int)hr.btxb("bvuc", btwu(int ), (int)522);
                        cfr_temp_0 = 31;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 30: {
                        var19_3 /* !! */  = (int)hr.btxb("bvud", btwu(int ), (int)523);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 23: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtw", btwu(int ), (int)516);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtf", btwu(int ), (int)499);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var19_3 /* !! */  = (int)hr.btxb("bvto", btwu(int ), (int)508);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 24: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtx", btwu(int ), (int)517);
                        cfr_temp_0 = 31;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 32: {
                        var19_3 /* !! */  = (int)hr.btxb("bvuf", btwu(int ), (int)525);
                        if (var20_2) {
                            throw null;
                        }
lbl193:
                        // 3 sources

                        var19_3 /* !! */  = (int)hr.btxb("bvti", btwu(int ), (int)502);
                        cfr_temp_0 = 25;
                        if (var20_2) {
                            throw null;
                        }
                        break block78;
                    }
                    case 4: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtd", btwu(int ), (int)497);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var19_3 /* !! */  = (int)hr.btxb("bvty", btwu(int ), (int)518);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var19_3 /* !! */  = (int)hr.btxb("bvtj", btwu(int ), (int)503);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 31: {
                        var19_3 /* !! */  = (int)hr.btxb("bvue", btwu(int ), (int)524);
                        if (var20_2) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl219
            }
            do {
                if (true) continue block35;
lbl219:
                // 2 sources

                var19_3 /* !! */  = (int)hr.btxb("bvth", btwu(int ), (int)501);
                cfr_temp_0 = 4;
            } while (!var20_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        var6_2 = hr.c;
        var5_3 /* !! */  = hr.b;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_4 = hr.a;
                if (var6_2) {
                    throw null;
lbl9:
                    // 20 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl9
                if (hr.mc.field_1724 == null) ** GOTO lbl16
                if (var4_4) ** GOTO lbl9
                if (hr.mc.field_1687 != null) ** GOTO lbl24
                if (var4_4) ** GOTO lbl9
lbl16:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl9
                this.resetThrowState();
                if (var4_4 || var4_4) ** GOTO lbl9
                this.lastHandledPearlId = (int)hr.btxb("btyt", btwu(int ), (int)16);
                if (var4_4 || var4_4) ** GOTO lbl9
                this.nextThrowAt = (long)hr.btxb("btyv", btxi(int ), (int)2);
                if (var4_4 || var4_4) ** GOTO lbl9
                return;
lbl24:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl9
                if (this.lastHandledPearlId == hr.btxb("btyx", btwu(int ), (int)17)) ** GOTO lbl38
                if (var4_4 || var4_4) ** GOTO lbl9
                var2_5 = hr.mc.field_1687.method_8469(this.lastHandledPearlId);
                if (var4_4 || var4_4) ** GOTO lbl9
                if (!(var2_5 instanceof class_1684)) ** GOTO lbl35
                if (var4_4) ** GOTO lbl9
                var3_6 = (class_1684)var2_5;
                if (var4_4 || var4_4) ** GOTO lbl9
                if (var3_6.method_5805()) ** GOTO lbl38
                if (var4_4) ** GOTO lbl9
lbl35:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl9
                this.lastHandledPearlId = (int)hr.btxb("btzb", btwu(int ), (int)18);
                if (var4_4) ** GOTO lbl9
lbl38:
                // 3 sources

                if (var4_4 || var4_4) ** GOTO lbl9
                if (!this.mode.isSelected("\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439")) ** GOTO lbl45
                if (var4_4) ** GOTO lbl9
                if (!this.canThrowNow()) ** GOTO lbl45
                if (var4_4 || var4_4) ** GOTO lbl9
                this.aimAndThrowPearl();
                if (var4_4) ** GOTO lbl9
lbl45:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl48:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)hr.btxb("btzd", btwu(int ), (int)19);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 1: {
                var5_3 /* !! */  = (int)hr.btxb("btze", btwu(int ), (int)20);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl58:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)hr.btxb("btzf", btwu(int ), (int)21);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl63:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hr.btxb("btzg", btwu(int ), (int)22);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 4: {
                var5_3 /* !! */  = (int)hr.btxb("btzh", btwu(int ), (int)23);
                if (!var6_2) ** GOTO lbl48
                throw null;
            }
lbl72:
            // 4 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hr.btxb("btzj", btwu(int ), (int)24);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl100
                    break;
                }
            }
            case 6: {
                var5_3 /* !! */  = (int)hr.btxb("btzl", btwu(int ), (int)25);
                if (!var6_2) ** GOTO lbl48
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)hr.btxb("btzn", btwu(int ), (int)26);
                if (!var6_2) ** GOTO lbl58
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)hr.btxb("btzp", btwu(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl91:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)hr.btxb("btzq", btwu(int ), (int)28);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 10: {
                var5_3 /* !! */  = (int)hr.btxb("btzr", btwu(int ), (int)29);
                if (!var6_2) ** GOTO lbl63
                throw null;
            }
lbl100:
            // 4 sources

            case 11: {
                var5_3 /* !! */  = (int)hr.btxb("btzt", btwu(int ), (int)30);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 12: {
                var5_3 /* !! */  = (int)hr.btxb("btzv", btwu(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl110:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)hr.btxb("btzx", btwu(int ), (int)32);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl115:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)hr.btxb("btzy", btwu(int ), (int)33);
                if (!var6_2) ** GOTO lbl58
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)hr.btxb("btzz", btwu(int ), (int)34);
                if (var6_2) {
                    throw null;
                }
            }
            case 16: {
                var5_3 /* !! */  = (int)hr.btxb("buab", btwu(int ), (int)35);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)hr.btxb("buad", btwu(int ), (int)36);
                if (!var6_2) ** GOTO lbl91
                throw null;
            }
lbl131:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)hr.btxb("buai", btwu(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 19: {
                var5_3 /* !! */  = (int)hr.btxb("buaj", btwu(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 20: {
                var5_3 /* !! */  = (int)hr.btxb("bual", btwu(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 21: {
                var5_3 /* !! */  = (int)hr.btxb("buam", btwu(int ), (int)40);
                if (!var6_2) break;
                throw null;
            }
lbl150:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)hr.btxb("buan", btwu(int ), (int)41);
                if (!var6_2) ** GOTO lbl72
                throw null;
            }
lbl154:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)hr.btxb("buao", btwu(int ), (int)42);
                if (!var6_2) break;
                throw null;
            }
lbl158:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)hr.btxb("buaq", btwu(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl163:
            // 3 sources

            case 25: {
                var5_3 /* !! */  = (int)hr.btxb("buas", btwu(int ), (int)44);
                if (!var6_2) break;
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)hr.btxb("buat", btwu(int ), (int)45);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)hr.btxb("buau", btwu(int ), (int)46);
                if (!var6_2) ** GOTO lbl110
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)hr.btxb("buav", btwu(int ), (int)47);
                if (!var6_2) ** GOTO lbl100
                throw null;
            }
lbl179:
            // 5 sources

            case 29: {
                var5_3 /* !! */  = (int)hr.btxb("buax", btwu(int ), (int)48);
                if (!var6_2) ** GOTO lbl115
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)hr.btxb("bubb", btwu(int ), (int)49);
                if (!var6_2) ** GOTO lbl48
                throw null;
            }
lbl187:
            // 4 sources

            case 31: {
                var5_3 /* !! */  = (int)hr.btxb("bubd", btwu(int ), (int)50);
                if (!var6_2) ** GOTO lbl179
                throw null;
            }
lbl191:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)hr.btxb("bubg", btwu(int ), (int)51);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)hr.btxb("bubh", btwu(int ), (int)52);
                if (!var6_2) ** GOTO lbl150
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)hr.btxb("bubi", btwu(int ), (int)53);
                if (!var6_2) ** GOTO lbl179
                throw null;
            }
            case 35: 
        }
        var5_3 /* !! */  = (int)hr.btxb("bubj", btwu(int ), (int)54);
        ** while (!var6_2)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hitsEntity(class_243 var1_1, class_243 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwfe", btxi(int ), (int)242)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("bwff", btwu(int ), (int)784)) break;
            v0 /* !! */  = (long)hr.btxb("bwfg", btwu(int ), (int)785);
        }
        var8_3 = hr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwfh", btxi(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hr.btxb("bwfi", btwu(int ), (int)786)) break;
            v1 /* !! */  = (long)hr.btxb("bwfj", btwu(int ), (int)787);
        }
        var7_4 /* !! */  = hr.b;
        v2 /* !! */  = hr.ei;
        if (true) ** GOTO lbl17
        block70: while (true) {
            v2 /* !! */  = (long)(v3 - hr.btxb("bwfk", btxi(int ), (int)244));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -711318179: {
                    v3 = hr.btxb("bwfl", btxi(int ), (int)245);
                    continue block70;
                }
                case -358665744: {
                    v3 = hr.btxb("bwfm", btxi(int ), (int)246);
                    continue block70;
                }
                case 289102630: {
                    v3 = hr.btxb("bwfn", btxi(int ), (int)247);
                    continue block70;
                }
                case 2083520731: {
                    break block70;
                }
            }
            break;
        }
        var6_5 = hr.a;
        if (var8_3) {
            throw null;
lbl32:
            // 9 sources

            return (boolean)hr.btxb("bwfo", btwu(int ), (int)788);
        }
        if (var6_5 || var6_5) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwfp", btxi(int ), (int)248)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hr.btxb("bwfq", btwu(int ), (int)789)) break;
            v4 /* !! */  = (long)hr.btxb("bwfr", btwu(int ), (int)790);
        }
        v5 /* !! */  = hr.ei;
        if (true) ** GOTO lbl44
        block73: while (true) {
            v5 /* !! */  = (long)(hr.btxb("bwft", btxi(int ), (int)250) - hr.btxb("bwfs", btxi(int ), (int)249));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1234607286: {
                    continue block73;
                }
                case 2083520731: {
                    break block73;
                }
            }
            break;
        }
        v6 = new class_238(var1_1, var2_2);
        v7 = hr.btxb("bwfu", buso(int ), (int)251);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bwfv", btxi(int ), (int)252)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hr.btxb("bwfw", btwu(int ), (int)791)) break;
            v8 /* !! */  = (long)hr.btxb("bwfx", btwu(int ), (int)792);
        }
        var3_6 = v6.method_1014((double)v7);
        if (var6_5 || var6_5) ** GOTO lbl32
        v9 /* !! */  = hr.ei;
        if (true) ** GOTO lbl62
        block75: while (true) {
            v9 /* !! */  = (long)(hr.btxb("bwfz", btxi(int ), (int)254) - hr.btxb("bwfy", btxi(int ), (int)253));
lbl62:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1321128320: {
                    continue block75;
                }
                case 2083520731: {
                    break block75;
                }
            }
            break;
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bwga", btxi(int ), (int)255)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hr.btxb("bwgb", btwu(int ), (int)793)) break;
            v10 /* !! */  = (long)hr.btxb("bwgc", btwu(int ), (int)794);
        }
        v11 = hr.mc.field_1687;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bwgd", btxi(int ), (int)256)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == hr.btxb("bwge", btwu(int ), (int)795)) break;
            v12 /* !! */  = (long)hr.btxb("bwgf", btwu(int ), (int)796);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bwgg", btxi(int ), (int)257)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hr.btxb("bwgh", btwu(int ), (int)797)) break;
            v13 /* !! */  = (long)hr.btxb("bwgi", btwu(int ), (int)798);
        }
        v14 = hr.mc.field_1724;
        v15 /* !! */  = hr.ei;
        if (true) ** GOTO lbl88
        block79: while (true) {
            v15 /* !! */  = (long)(v16 - hr.btxb("bwgj", btxi(int ), (int)258));
lbl88:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -828536873: {
                    v16 = hr.btxb("bwgk", btxi(int ), (int)259);
                    continue block79;
                }
                case 1214153930: {
                    v16 = hr.btxb("bwgl", btxi(int ), (int)260);
                    continue block79;
                }
                case 2083520731: {
                    break block79;
                }
            }
            break;
        }
        v17 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hitsEntity$4(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)((hr)this);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_7 = hr.ei - hr.btxb("bwgm", btxi(int ), (int)261)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == hr.btxb("bwgn", btwu(int ), (int)799)) break;
            v18 /* !! */  = (long)hr.btxb("bwgo", btwu(int ), (int)800);
        }
        v19 = v11.method_8333((class_1297)v14, var3_6, v17);
        v20 /* !! */  = hr.ei;
        if (true) ** GOTO lbl108
        block81: while (true) {
            v20 /* !! */  = (long)(hr.btxb("bwgq", btxi(int ), (int)263) - hr.btxb("bwgp", btxi(int ), (int)262));
lbl108:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case 511533119: {
                    continue block81;
                }
                case 2083520731: {
                    break block81;
                }
            }
            break;
        }
        var4_7 = v19.iterator();
        if (var6_5) ** GOTO lbl32
        block82: while (true) {
            if (var6_5 || var6_5) ** GOTO lbl32
            v21 /* !! */  = hr.ei;
            if (true) ** GOTO lbl121
            block83: while (true) {
                v21 /* !! */  = (long)(hr.btxb("bwgs", btxi(int ), (int)265) - hr.btxb("bwgr", btxi(int ), (int)264));
lbl121:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -808984006: {
                        continue block83;
                    }
                    case 2083520731: {
                        break block83;
                    }
                }
                break;
            }
            if (!var4_7.hasNext()) ** GOTO lbl199
            if (var6_5) ** GOTO lbl32
            v22 /* !! */  = hr.ei;
            if (true) ** GOTO lbl132
            block84: while (true) {
                v22 /* !! */  = (long)(v23 - hr.btxb("bwgt", btxi(int ), (int)266));
lbl132:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case 1672456082: {
                        v23 = hr.btxb("bwgu", btxi(int ), (int)267);
                        continue block84;
                    }
                    case 1780430135: {
                        v23 = hr.btxb("bwgv", btxi(int ), (int)268);
                        continue block84;
                    }
                    case 2083520731: {
                        break block84;
                    }
                }
                break;
            }
            var5_8 = (class_1297)var4_7.next();
            if (var6_5 || var6_5) ** GOTO lbl32
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_8 = hr.ei - hr.btxb("bwgw", btxi(int ), (int)269)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == hr.btxb("bwgx", btwu(int ), (int)801)) break;
                v24 /* !! */  = (long)hr.btxb("bwgy", btwu(int ), (int)802);
            }
            v25 = var5_8.method_5829();
            v26 = hr.btxb("bwgz", buso(int ), (int)270);
            v27 /* !! */  = hr.ei;
            if (true) ** GOTO lbl154
            block86: while (true) {
                v27 /* !! */  = (long)(v28 - hr.btxb("bwha", btxi(int ), (int)271));
lbl154:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -1036702329: {
                        v28 = hr.btxb("bwhb", btxi(int ), (int)272);
                        continue block86;
                    }
                    case 1701798768: {
                        v28 = hr.btxb("bwhc", btxi(int ), (int)273);
                        continue block86;
                    }
                    case 2083520731: {
                        break block86;
                    }
                }
                break;
            }
            v29 = v25.method_1014((double)v26);
            v30 /* !! */  = hr.ei;
            if (true) ** GOTO lbl168
            block87: while (true) {
                v30 /* !! */  = (long)(v31 - hr.btxb("bwhd", btxi(int ), (int)274));
lbl168:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case 24615933: {
                        v31 = hr.btxb("bwhe", btxi(int ), (int)275);
                        continue block87;
                    }
                    case 555469445: {
                        v31 = hr.btxb("bwhf", btxi(int ), (int)276);
                        continue block87;
                    }
                    case 1750538947: {
                        v31 = hr.btxb("bwhg", btxi(int ), (int)277);
                        continue block87;
                    }
                    case 2083520731: {
                        break block87;
                    }
                }
                break;
            }
            v32 = v29.method_992(var1_1, var2_2);
            v33 /* !! */  = hr.ei;
            if (true) ** GOTO lbl185
            block88: while (true) {
                v33 /* !! */  = (long)(hr.btxb("bwhi", btxi(int ), (int)279) - hr.btxb("bwhh", btxi(int ), (int)278));
lbl185:
                // 2 sources

                switch ((int)v33 /* !! */ ) {
                    case 351208095: {
                        continue block88;
                    }
                    case 2083520731: {
                        break block88;
                    }
                }
                break;
            }
            if (!v32.isPresent()) ** GOTO lbl196
            if (var6_5 || var6_5) ** GOTO lbl32
            if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var7_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hr.btxb("bwhj", btwu(int ), (int)803);
                }
lbl196:
                // 1 sources

                if (var6_5 || var6_5) ** GOTO lbl32
                if (!var8_3) continue block82;
                throw null;
lbl199:
                // 1 sources

                if (!var6_5 && !var6_5) ** break;
                ** continue;
                return (boolean)hr.btxb("bwhk", btwu(int ), (int)804);
lbl202:
                // 2 sources

                case 0: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhl", btwu(int ), (int)805);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
                case 1: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhm", btwu(int ), (int)806);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 2: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhn", btwu(int ), (int)807);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
lbl217:
                // 2 sources

                case 3: {
                    var7_4 /* !! */  = (int)hr.btxb("bwho", btwu(int ), (int)808);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
                case 4: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhp", btwu(int ), (int)809);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
lbl227:
                // 3 sources

                case 5: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhq", btwu(int ), (int)810);
                    if (var8_3) {
                        throw null;
                    }
                }
                case 6: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhr", btwu(int ), (int)811);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var7_4 /* !! */  = (int)hr.btxb("bwhs", btwu(int ), (int)812);
                        if (var8_3) {
                            throw null;
                        }
                        ** GOTO lbl263
                        break;
                    }
                }
lbl242:
                // 3 sources

                case 8: {
                    var7_4 /* !! */  = (int)hr.btxb("bwht", btwu(int ), (int)813);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl263
                }
lbl247:
                // 2 sources

                case 9: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhu", btwu(int ), (int)814);
                    if (!var8_3) ** GOTO lbl217
                    throw null;
                }
lbl251:
                // 3 sources

                case 10: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhv", btwu(int ), (int)815);
                    if (!var8_3) ** GOTO lbl202
                    throw null;
                }
lbl255:
                // 3 sources

                case 11: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhw", btwu(int ), (int)816);
                    if (!var8_3) ** GOTO lbl227
                    throw null;
                }
                case 12: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhx", btwu(int ), (int)817);
                    if (!var8_3) ** GOTO lbl255
                    throw null;
                }
lbl263:
                // 4 sources

                case 13: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhy", btwu(int ), (int)818);
                    if (!var8_3) ** GOTO lbl247
                    throw null;
                }
                case 14: {
                    var7_4 /* !! */  = (int)hr.btxb("bwhz", btwu(int ), (int)819);
                    if (!var8_3) ** GOTO lbl251
                    throw null;
                }
lbl271:
                // 3 sources

                case 15: {
                    var7_4 /* !! */  = (int)hr.btxb("bwia", btwu(int ), (int)820);
                    if (!var8_3) ** GOTO lbl263
                    throw null;
                }
                case 16: {
                    var7_4 /* !! */  = (int)hr.btxb("bwib", btwu(int ), (int)821);
                    if (!var8_3) ** GOTO lbl255
                    throw null;
                }
lbl279:
                // 2 sources

                case 17: {
                    var7_4 /* !! */  = (int)hr.btxb("bwic", btwu(int ), (int)822);
                    if (!var8_3) ** GOTO lbl242
                    throw null;
                }
                case 18: 
            }
            break;
        }
        var7_4 /* !! */  = (int)hr.btxb("bwid", btwu(int ), (int)823);
        ** while (!var8_3)
lbl286:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdr() {
        hr.btwz[700] = 1936990581;
        hr.btwz[701] = 252137781;
        hr.btwz[702] = 916704652;
        hr.btwz[703] = 668254830;
        hr.btwz[704] = 242390032;
        hr.btwz[705] = 1598959771;
        hr.btwz[706] = -996748742;
        hr.btwz[707] = -555368570;
        hr.btwz[708] = 997313257;
        hr.btwz[709] = -1905462337;
        hr.btwz[710] = 1495056392;
        hr.btwz[711] = -1058198944;
        hr.btwz[712] = -2116904664;
        hr.btwz[713] = 1044028166;
        hr.btwz[714] = 296956816;
        hr.btwz[715] = 1104125585;
        hr.btwz[716] = -489962168;
        hr.btwz[717] = -1453565535;
        hr.btwz[718] = -1861096474;
        hr.btwz[719] = 966297590;
        hr.btwz[720] = 259842350;
        hr.btwz[721] = 568167954;
        hr.btwz[722] = 14037701;
        hr.btwz[723] = -1039910697;
        hr.btwz[724] = 1842220925;
        hr.btwz[725] = -248496401;
        hr.btwz[726] = -562031605;
        hr.btwz[727] = -1257062840;
        hr.btwz[728] = 1811302952;
        hr.btwz[729] = -198041626;
        hr.btwz[730] = 63379559;
        hr.btwz[731] = -1899424046;
        hr.btwz[732] = -838402488;
        hr.btwz[733] = -1928436992;
        hr.btwz[734] = 1752397648;
        hr.btwz[735] = -1099124909;
        hr.btwz[736] = -143322834;
        hr.btwz[737] = 328522281;
        hr.btwz[738] = -1656490952;
        hr.btwz[739] = -2090907102;
        hr.btwz[740] = -779836740;
        hr.btwz[741] = -1088213777;
        hr.btwz[742] = 1933040385;
        hr.btwz[743] = -222317450;
        hr.btwz[744] = -2013388560;
        hr.btwz[745] = 331687562;
        hr.btwz[746] = -602419281;
        hr.btwz[747] = 248901127;
        hr.btwz[748] = 1827176641;
        hr.btwz[749] = 1660772380;
        hr.btwz[750] = -141597345;
        hr.btwz[751] = -1342715079;
        hr.btwz[752] = -824921992;
        hr.btwz[753] = -1023680344;
        hr.btwz[754] = 1190807583;
        hr.btwz[755] = -116623509;
        hr.btwz[756] = -757372176;
        hr.btwz[757] = -1051387951;
        hr.btwz[758] = -531023126;
        hr.btwz[759] = 841767822;
        hr.btwz[760] = -1935981398;
        hr.btwz[761] = 86927597;
        hr.btwz[762] = -143342117;
        hr.btwz[763] = 1566276644;
        hr.btwz[764] = 1781753580;
        hr.btwz[765] = 4043279;
        hr.btwz[766] = 959667204;
        hr.btwz[767] = 1887848463;
        hr.btwz[768] = -857726670;
        hr.btwz[769] = 73692719;
        hr.btwz[770] = -278047994;
        hr.btwz[771] = 1729443698;
        hr.btwz[772] = 84688682;
        hr.btwz[773] = 855242325;
        hr.btwz[774] = 1942375803;
        hr.btwz[775] = -1784226868;
        hr.btwz[776] = 6582307;
        hr.btwz[777] = -2021134116;
        hr.btwz[778] = 214578461;
        hr.btwz[779] = 724100272;
        hr.btwz[780] = -1885509853;
        hr.btwz[781] = -427089996;
        hr.btwz[782] = -128608241;
        hr.btwz[783] = 2082940154;
        hr.btwz[784] = 1812420543;
        hr.btwz[785] = -1828055018;
        hr.btwz[786] = -426044862;
        hr.btwz[787] = -1599877078;
        hr.btwz[788] = -1540545560;
        hr.btwz[789] = -1948902411;
        hr.btwz[790] = 473738473;
        hr.btwz[791] = -1109206633;
        hr.btwz[792] = 1739603258;
        hr.btwz[793] = 639785696;
        hr.btwz[794] = 1870301521;
        hr.btwz[795] = -663795841;
        hr.btwz[796] = -657609146;
        hr.btwz[797] = 1435413464;
        hr.btwz[798] = -1542434754;
        hr.btwz[799] = 1153438029;
    }

    private static /* synthetic */ void bxda() {
        hr.btwx[0] = -1995407043;
        hr.btwx[1] = -1281102115;
        hr.btwx[2] = 187965508;
        hr.btwx[3] = -1154023259;
        hr.btwx[4] = 1042496024;
        hr.btwx[5] = 1496308848;
        hr.btwx[6] = -1765134321;
        hr.btwx[7] = 1911631746;
        hr.btwx[8] = 1464986672;
        hr.btwx[9] = -324129736;
        hr.btwx[10] = 259005907;
        hr.btwx[11] = 422287043;
        hr.btwx[12] = -224485201;
        hr.btwx[13] = -434208364;
        hr.btwx[14] = -602778263;
        hr.btwx[15] = 915164036;
        hr.btwx[16] = -1702523578;
        hr.btwx[17] = 1993785469;
        hr.btwx[18] = -72527455;
        hr.btwx[19] = -192068746;
        hr.btwx[20] = -1425235631;
        hr.btwx[21] = 341429831;
        hr.btwx[22] = -1786237637;
        hr.btwx[23] = 823705349;
        hr.btwx[24] = -1096732827;
        hr.btwx[25] = 849796215;
        hr.btwx[26] = 181858589;
        hr.btwx[27] = -1656281467;
        hr.btwx[28] = 407405619;
        hr.btwx[29] = 159073504;
        hr.btwx[30] = -705917144;
        hr.btwx[31] = -164686487;
        hr.btwx[32] = -380512613;
        hr.btwx[33] = -106743630;
        hr.btwx[34] = -1581170322;
        hr.btwx[35] = -150502293;
        hr.btwx[36] = -368154979;
        hr.btwx[37] = 141522075;
        hr.btwx[38] = 523284502;
        hr.btwx[39] = 1580453091;
        hr.btwx[40] = 333522534;
        hr.btwx[41] = 725315961;
        hr.btwx[42] = 1435289963;
        hr.btwx[43] = -2102473014;
        hr.btwx[44] = 962745655;
        hr.btwx[45] = 425980553;
        hr.btwx[46] = -2001323511;
        hr.btwx[47] = -918864109;
        hr.btwx[48] = -1566655968;
        hr.btwx[49] = -1314023861;
        hr.btwx[50] = 451631854;
        hr.btwx[51] = -895785823;
        hr.btwx[52] = -4097456;
        hr.btwx[53] = -571388666;
        hr.btwx[54] = -1036539886;
        hr.btwx[55] = -386743713;
        hr.btwx[56] = -630016497;
        hr.btwx[57] = 1671505333;
        hr.btwx[58] = -1963256340;
        hr.btwx[59] = -266832053;
        hr.btwx[60] = 1076127957;
        hr.btwx[61] = -1006386199;
        hr.btwx[62] = 1394726212;
        hr.btwx[63] = 298407685;
        hr.btwx[64] = 2066364954;
        hr.btwx[65] = 700929023;
        hr.btwx[66] = 1478123395;
        hr.btwx[67] = -99287656;
        hr.btwx[68] = 17839777;
        hr.btwx[69] = 1257410726;
        hr.btwx[70] = -970925476;
        hr.btwx[71] = 1498506337;
        hr.btwx[72] = 1315939524;
        hr.btwx[73] = 291851814;
        hr.btwx[74] = 374613920;
        hr.btwx[75] = -1433093674;
        hr.btwx[76] = 2092984048;
        hr.btwx[77] = 1544011522;
        hr.btwx[78] = -25543602;
        hr.btwx[79] = -1251114053;
        hr.btwx[80] = 697869343;
        hr.btwx[81] = 1276782676;
        hr.btwx[82] = 1939767627;
        hr.btwx[83] = 814566594;
        hr.btwx[84] = -1011637079;
        hr.btwx[85] = -570780016;
        hr.btwx[86] = 1376676758;
        hr.btwx[87] = 1226465056;
        hr.btwx[88] = -961274909;
        hr.btwx[89] = 2089993752;
        hr.btwx[90] = 2053473845;
        hr.btwx[91] = -484353201;
        hr.btwx[92] = -1926934999;
        hr.btwx[93] = 1495175373;
        hr.btwx[94] = -1155820843;
        hr.btwx[95] = 803708055;
        hr.btwx[96] = -1870540232;
        hr.btwx[97] = -593653069;
        hr.btwx[98] = 1243385761;
        hr.btwx[99] = 1399571298;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hr() {
        var2_1 /* !! */  = hr.b;
        super("TargetPearl", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u0440\u043e\u0441\u0430\u0435\u0442 \u0436\u0435\u043c\u0447\u0443\u0433 \u0432 \u0446\u0435\u043b\u044c", du.RAGE);
        this.mode = new kf("\u0422\u0438\u043f", "\u0420\u0435\u0436\u0438\u043c \u0440\u0430\u0431\u043e\u0442\u044b", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439", new String[]{"\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439", "\u041f\u043e \u0431\u0438\u043d\u0434\u0443"});
        this.bind = new ka("\u0411\u0438\u043d\u0434", "\u041a\u043b\u0430\u0432\u0438\u0448\u0430 \u0434\u043b\u044f \u0431\u0440\u043e\u0441\u043a\u0430 \u0436\u0435\u043c\u0447\u0443\u0433\u0430").visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$new$0(), ()Ljava/lang/Boolean;)((hr)this));
        this.onlyTarget = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u0437\u0430 \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u043e\u043c", "\u0411\u0440\u043e\u0441\u0430\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u0432 \u0436\u0435\u043c\u0447\u0443\u0433 \u0446\u0435\u043b\u0438 KillAura").setValue((boolean)hr.btxb("btxe", btwu(int ), (int)0));
        this.ignoreFriends = new kb("\u0418\u0433\u043d\u043e\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0434\u0440\u0443\u0437\u0435\u0439", "\u041d\u0435 \u043f\u043e\u0432\u0442\u043e\u0440\u044f\u0442\u044c \u0436\u0435\u043c\u0447\u0443\u0433 \u0434\u0440\u0443\u0437\u0435\u0439").setValue((boolean)hr.btxb("btxg", btwu(int ), (int)1));
        this.lastHandledPearlId = (int)hr.btxb("btxh", btwu(int ), (int)2);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.nextThrowAt = (long)hr.btxb("btxl", btxi(int ), (int)0);
                this.isThrowing = hr.btxb("btxm", btwu(int ), (int)3);
                this.lastTickReset = (long)hr.btxb("btxn", btxi(int ), (int)1);
                this.settings(new jx[]{this.mode, this.bind, this.onlyTarget, this.ignoreFriends});
                return;
            }
lbl16:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)hr.btxb("btxo", btwu(int ), (int)4);
                ** GOTO lbl22
            }
lbl19:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)hr.btxb("btxq", btwu(int ), (int)5);
                ** GOTO lbl33
            }
lbl22:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)hr.btxb("btxv", btwu(int ), (int)6);
                ** GOTO lbl16
            }
            case 3: {
                var2_1 /* !! */  = (int)hr.btxb("btxx", btwu(int ), (int)7);
                ** GOTO lbl45
            }
            case 4: {
                var2_1 /* !! */  = (int)hr.btxb("btxz", btwu(int ), (int)8);
                break;
            }
            case 5: {
                var2_1 /* !! */  = (int)hr.btxb("btyb", btwu(int ), (int)9);
            }
lbl33:
            // 3 sources

            case 6: {
                var2_1 /* !! */  = (int)hr.btxb("btyd", btwu(int ), (int)10);
                ** GOTO lbl42
            }
lbl36:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)hr.btxb("btye", btwu(int ), (int)11);
                ** GOTO lbl19
            }
            case 8: {
                var2_1 /* !! */  = (int)hr.btxb("btyf", btwu(int ), (int)12);
                ** GOTO lbl45
            }
lbl42:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)hr.btxb("btyj", btwu(int ), (int)13);
                ** GOTO lbl36
            }
lbl45:
            // 3 sources

            case 10: {
                var2_1 /* !! */  = (int)hr.btxb("btyk", btwu(int ), (int)14);
                ** GOTO lbl22
            }
            case 11: 
        }
        while (true) {
            var2_1 /* !! */  = (int)hr.btxb("btyl", btwu(int ), (int)15);
        }
    }

    private static /* synthetic */ long btxi(int n2) {
        return btxj[n2] ^ btxk[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 predictPearlLanding(class_1684 var1_1) {
        var8_2 = hr.c;
        var7_3 /* !! */  = hr.b;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var6_4 = hr.a;
                if (var8_2) {
                    throw null;
lbl9:
                    // 16 sources

                    return null;
                }
                if (var6_4 || var6_4) ** GOTO lbl9
                var2_5 = var1_1.method_73189();
                if (var6_4 || var6_4) ** GOTO lbl9
                var3_6 = var1_1.method_18798();
                if (var6_4 || var6_4) ** GOTO lbl9
                var4_7 = var2_5;
                if (var6_4 || var6_4) ** GOTO lbl9
                var5_8 = hr.btxb("bvgj", btwu(int ), (int)401);
                if (var6_4) ** GOTO lbl9
                do {
                    if (var6_4 || var6_4) ** GOTO lbl9
                    if (var5_8 >= hr.btxb("bvgk", btwu(int ), (int)402)) ** GOTO lbl41
                    if (var6_4 || var6_4) ** GOTO lbl9
                    var4_7 = var2_5;
                    if (var6_4 || var6_4) ** GOTO lbl9
                    var2_5 = var2_5.method_1019(var3_6);
                    if (var6_4 || var6_4) ** GOTO lbl9
                    if (this.hitsBlock(var4_7, var2_5)) ** GOTO lbl32
                    if (var6_4) ** GOTO lbl9
                    if (!(var2_5.field_1351 <= (double)hr.mc.field_1687.method_31607())) ** GOTO lbl34
                    if (var6_4) ** GOTO lbl9
lbl32:
                    // 2 sources

                    if (var6_4 || var6_4) ** GOTO lbl9
                    return new class_243((double)class_3532.method_15357((double)var4_7.field_1352) + hr.btxb("bvgl", buso(int ), (int)158), (double)class_3532.method_15357((double)var4_7.field_1351), (double)class_3532.method_15357((double)var4_7.field_1350) + hr.btxb("bvgm", buso(int ), (int)159));
lbl34:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl9
                    var3_6 = this.updatePearlMotion(var3_6, var2_5);
                    if (var6_4 || var6_4) ** GOTO lbl9
                    ++var5_8;
                    if (var6_4) ** GOTO lbl9
                } while (!var8_2);
                throw null;
lbl41:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return new class_243((double)class_3532.method_15357((double)var4_7.field_1352) + hr.btxb("bvgn", buso(int ), (int)160), (double)class_3532.method_15357((double)var4_7.field_1351), (double)class_3532.method_15357((double)var4_7.field_1350) + hr.btxb("bvgo", buso(int ), (int)161));
            }
            case 0: {
                var7_3 /* !! */  = (int)hr.btxb("bvgp", btwu(int ), (int)403);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl49:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)hr.btxb("bvgq", btwu(int ), (int)404);
                if (var8_2) {
                    throw null;
                }
            }
            case 2: {
                var7_3 /* !! */  = (int)hr.btxb("bvgr", btwu(int ), (int)405);
                if (!var8_2) break;
                throw null;
            }
lbl57:
            // 3 sources

            case 3: {
                var7_3 /* !! */  = (int)hr.btxb("bvgs", btwu(int ), (int)406);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl62:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)hr.btxb("bvgt", btwu(int ), (int)407);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 5: {
                var7_3 /* !! */  = (int)hr.btxb("bvgu", btwu(int ), (int)408);
                if (!var8_2) ** GOTO lbl62
                throw null;
            }
            case 6: {
                var7_3 /* !! */  = (int)hr.btxb("bvgv", btwu(int ), (int)409);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 7: {
                var7_3 /* !! */  = (int)hr.btxb("bvgw", btwu(int ), (int)410);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl81:
            // 4 sources

            case 8: {
                var7_3 /* !! */  = (int)hr.btxb("bvgx", btwu(int ), (int)411);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl86:
            // 5 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)hr.btxb("bvgy", btwu(int ), (int)412);
                    if (!var8_2) ** GOTO lbl81
                    throw null;
                }
            }
lbl91:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)hr.btxb("bvgz", btwu(int ), (int)413);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl95:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)hr.btxb("bvha", btwu(int ), (int)414);
                if (!var8_2) ** GOTO lbl57
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)hr.btxb("bvhb", btwu(int ), (int)415);
                if (!var8_2) ** GOTO lbl91
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)hr.btxb("bvhc", btwu(int ), (int)416);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl107:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)hr.btxb("bvhd", btwu(int ), (int)417);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl112:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)hr.btxb("bvhe", btwu(int ), (int)418);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl117:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)hr.btxb("bvhf", btwu(int ), (int)419);
                if (!var8_2) ** GOTO lbl91
                throw null;
            }
lbl121:
            // 3 sources

            case 17: {
                var7_3 /* !! */  = (int)hr.btxb("bvhg", btwu(int ), (int)420);
                if (!var8_2) ** GOTO lbl86
                throw null;
            }
lbl125:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)hr.btxb("bvhh", btwu(int ), (int)421);
                if (!var8_2) ** GOTO lbl107
                throw null;
            }
lbl129:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)hr.btxb("bvhi", btwu(int ), (int)422);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 20: {
                var7_3 /* !! */  = (int)hr.btxb("bvhj", btwu(int ), (int)423);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
lbl138:
            // 3 sources

            case 21: {
                var7_3 /* !! */  = (int)hr.btxb("bvhk", btwu(int ), (int)424);
                if (!var8_2) ** GOTO lbl107
                throw null;
            }
            case 22: {
                var7_3 /* !! */  = (int)hr.btxb("bvhl", btwu(int ), (int)425);
                if (!var8_2) ** GOTO lbl57
                throw null;
            }
            case 23: {
                var7_3 /* !! */  = (int)hr.btxb("bvhm", btwu(int ), (int)426);
                if (!var8_2) ** GOTO lbl49
                throw null;
            }
lbl150:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)hr.btxb("bvhn", btwu(int ), (int)427);
                if (!var8_2) ** GOTO lbl112
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)hr.btxb("bvho", btwu(int ), (int)428);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)hr.btxb("bvhp", btwu(int ), (int)429);
                if (!var8_2) ** GOTO lbl81
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)hr.btxb("bvhq", btwu(int ), (int)430);
                if (!var8_2) break;
                throw null;
            }
lbl166:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)hr.btxb("bvhr", btwu(int ), (int)431);
                if (!var8_2) ** GOTO lbl81
                throw null;
            }
            case 29: {
                var7_3 /* !! */  = (int)hr.btxb("bvhs", btwu(int ), (int)432);
                if (!var8_2) ** GOTO lbl95
                throw null;
            }
            case 30: 
        }
        var7_3 /* !! */  = (int)hr.btxb("bvht", btwu(int ), (int)433);
        ** while (!var8_2)
lbl177:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdm() {
        hr.btwz[200] = -434063227;
        hr.btwz[201] = 1294325545;
        hr.btwz[202] = 1008244218;
        hr.btwz[203] = 2131820594;
        hr.btwz[204] = -609157180;
        hr.btwz[205] = 1688674849;
        hr.btwz[206] = 416366490;
        hr.btwz[207] = 2013299401;
        hr.btwz[208] = -1059390113;
        hr.btwz[209] = 879193547;
        hr.btwz[210] = 1849263218;
        hr.btwz[211] = -127263967;
        hr.btwz[212] = 2072429913;
        hr.btwz[213] = 1360535514;
        hr.btwz[214] = 648885483;
        hr.btwz[215] = -917352047;
        hr.btwz[216] = -896028494;
        hr.btwz[217] = 348068931;
        hr.btwz[218] = 1468765329;
        hr.btwz[219] = -1282057822;
        hr.btwz[220] = -284917066;
        hr.btwz[221] = 1064986636;
        hr.btwz[222] = -358621344;
        hr.btwz[223] = -1655696777;
        hr.btwz[224] = -1800662431;
        hr.btwz[225] = -792974831;
        hr.btwz[226] = 1508176732;
        hr.btwz[227] = 784513681;
        hr.btwz[228] = 1178802548;
        hr.btwz[229] = -1083401445;
        hr.btwz[230] = -1337192937;
        hr.btwz[231] = -1266813968;
        hr.btwz[232] = 838802419;
        hr.btwz[233] = -1616400069;
        hr.btwz[234] = -906498455;
        hr.btwz[235] = -1027091017;
        hr.btwz[236] = 78136053;
        hr.btwz[237] = -2023635954;
        hr.btwz[238] = 10214751;
        hr.btwz[239] = -720505840;
        hr.btwz[240] = 1047367866;
        hr.btwz[241] = 771469633;
        hr.btwz[242] = -670182797;
        hr.btwz[243] = -1936358835;
        hr.btwz[244] = -742407678;
        hr.btwz[245] = -1588181673;
        hr.btwz[246] = 341452541;
        hr.btwz[247] = -787942577;
        hr.btwz[248] = -605523812;
        hr.btwz[249] = -1649611607;
        hr.btwz[250] = 1150979305;
        hr.btwz[251] = -1785414613;
        hr.btwz[252] = -61322436;
        hr.btwz[253] = -746852178;
        hr.btwz[254] = -742835030;
        hr.btwz[255] = 1278942473;
        hr.btwz[256] = -1275038063;
        hr.btwz[257] = 540460412;
        hr.btwz[258] = -446394770;
        hr.btwz[259] = 690033744;
        hr.btwz[260] = -2101843049;
        hr.btwz[261] = -1479070834;
        hr.btwz[262] = -385453421;
        hr.btwz[263] = -1357586433;
        hr.btwz[264] = -1762466007;
        hr.btwz[265] = -1902761529;
        hr.btwz[266] = -774472359;
        hr.btwz[267] = -1481592483;
        hr.btwz[268] = 1964621529;
        hr.btwz[269] = -945019977;
        hr.btwz[270] = 827619800;
        hr.btwz[271] = -1702725931;
        hr.btwz[272] = 1225895683;
        hr.btwz[273] = -2012901348;
        hr.btwz[274] = 602191923;
        hr.btwz[275] = 701227034;
        hr.btwz[276] = -253463008;
        hr.btwz[277] = -1364323414;
        hr.btwz[278] = -1524200691;
        hr.btwz[279] = -285474670;
        hr.btwz[280] = -1868508841;
        hr.btwz[281] = 680264718;
        hr.btwz[282] = -1104107461;
        hr.btwz[283] = -1141249966;
        hr.btwz[284] = 1451558282;
        hr.btwz[285] = 2086238715;
        hr.btwz[286] = -1582868542;
        hr.btwz[287] = -1181841675;
        hr.btwz[288] = 600891346;
        hr.btwz[289] = -1942453240;
        hr.btwz[290] = -2051105593;
        hr.btwz[291] = 1466736068;
        hr.btwz[292] = 1656629918;
        hr.btwz[293] = 1804917226;
        hr.btwz[294] = 970409472;
        hr.btwz[295] = -768466699;
        hr.btwz[296] = -1851967604;
        hr.btwz[297] = 1272252673;
        hr.btwz[298] = 1770692362;
        hr.btwz[299] = -1892536352;
    }

    private static /* synthetic */ void bxdw() {
        hr.btxj[200] = 8488634438041939043L;
        hr.btxj[201] = -2006635009356969680L;
        hr.btxj[202] = 4488146909098938343L;
        hr.btxj[203] = -3833021462635494946L;
        hr.btxj[204] = 5536904000526062269L;
        hr.btxj[205] = -7683865899939547875L;
        hr.btxj[206] = 9093853601544282703L;
        hr.btxj[207] = -7096204153458771237L;
        hr.btxj[208] = 7526950240137312845L;
        hr.btxj[209] = 1346454727726579428L;
        hr.btxj[210] = -6975205332879024796L;
        hr.btxj[211] = 1795020418144993922L;
        hr.btxj[212] = 112743379697779674L;
        hr.btxj[213] = 121502029049129950L;
        hr.btxj[214] = -5606662956567947380L;
        hr.btxj[215] = -2643717167330287520L;
        hr.btxj[216] = 7391696744587499016L;
        hr.btxj[217] = 8972692581289981454L;
        hr.btxj[218] = -7001023154493321482L;
        hr.btxj[219] = 1708467795516863082L;
        hr.btxj[220] = 5060220152977380468L;
        hr.btxj[221] = 242156097687005928L;
        hr.btxj[222] = 1281208066485743744L;
        hr.btxj[223] = -9176233512698300896L;
        hr.btxj[224] = 4139854884761871739L;
        hr.btxj[225] = 6822616989854035651L;
        hr.btxj[226] = 1019993744664474434L;
        hr.btxj[227] = -8981353378680043081L;
        hr.btxj[228] = -5620566347920685178L;
        hr.btxj[229] = 6923654835632850783L;
        hr.btxj[230] = -365113263080955551L;
        hr.btxj[231] = 8411939680002523045L;
        hr.btxj[232] = -2884955419431143647L;
        hr.btxj[233] = 4811438983091723027L;
        hr.btxj[234] = -4303518656144840381L;
        hr.btxj[235] = -8810529998254419526L;
        hr.btxj[236] = 2895653887501224785L;
        hr.btxj[237] = -410758214341602438L;
        hr.btxj[238] = 8863694726294557279L;
        hr.btxj[239] = -1355491068455021149L;
        hr.btxj[240] = 3550400849482721374L;
        hr.btxj[241] = -2943191401027566986L;
        hr.btxj[242] = 1987780652828545728L;
        hr.btxj[243] = 1152587661037961486L;
        hr.btxj[244] = -8396021335079440009L;
        hr.btxj[245] = 6968613330803344210L;
        hr.btxj[246] = -5611029684470924078L;
        hr.btxj[247] = 5106635320004125346L;
        hr.btxj[248] = 5732151625046857272L;
        hr.btxj[249] = 4376965318103267911L;
        hr.btxj[250] = 2688040981543400519L;
        hr.btxj[251] = -8386969304029666452L;
        hr.btxj[252] = -6635210953564121218L;
        hr.btxj[253] = -8373976739665156778L;
        hr.btxj[254] = -8751890311081782580L;
        hr.btxj[255] = 8887863394215454508L;
        hr.btxj[256] = -6210553883149407010L;
        hr.btxj[257] = 8131194504843568666L;
        hr.btxj[258] = 1438882029423833718L;
        hr.btxj[259] = -3137544174849593822L;
        hr.btxj[260] = -3541224994887617902L;
        hr.btxj[261] = 3116680009038391088L;
        hr.btxj[262] = -8028640857188591795L;
        hr.btxj[263] = 9196255378139739258L;
        hr.btxj[264] = -6081650983755690235L;
        hr.btxj[265] = 4491994337109755878L;
        hr.btxj[266] = -536892757838450452L;
        hr.btxj[267] = -2923115078928890711L;
        hr.btxj[268] = 4819916365964678242L;
        hr.btxj[269] = 3913085471020234157L;
        hr.btxj[270] = 87598732544994397L;
        hr.btxj[271] = 8249965114088036999L;
        hr.btxj[272] = 7625689152255402372L;
        hr.btxj[273] = 3605943674506953593L;
        hr.btxj[274] = -6452832438103048607L;
        hr.btxj[275] = -7033928433837285593L;
        hr.btxj[276] = 4660085871131002645L;
        hr.btxj[277] = -4887316358104273160L;
        hr.btxj[278] = -3300226930628664408L;
        hr.btxj[279] = -4422923095861139047L;
        hr.btxj[280] = 5957095140681181407L;
        hr.btxj[281] = -556254664459114160L;
        hr.btxj[282] = 3947931870197405278L;
        hr.btxj[283] = 4028692998641608215L;
        hr.btxj[284] = -6684081979321873947L;
        hr.btxj[285] = 8463281055791564326L;
        hr.btxj[286] = -7005457691371308305L;
        hr.btxj[287] = -315180692245293481L;
        hr.btxj[288] = -5833963716423653761L;
        hr.btxj[289] = 8871820091249309794L;
        hr.btxj[290] = 1929851734964008829L;
        hr.btxj[291] = -6884656076860344372L;
        hr.btxj[292] = -2092256518435125767L;
        hr.btxj[293] = 6375479528322669236L;
        hr.btxj[294] = 5572164071889027122L;
        hr.btxj[295] = 8786119893154469393L;
        hr.btxj[296] = 6474264404442959746L;
        hr.btxj[297] = -7909081872961121345L;
        hr.btxj[298] = 4681463621887236443L;
        hr.btxj[299] = -824402175562756204L;
    }

    private static /* synthetic */ void bxdv() {
        hr.btxj[100] = 7006790188790462001L;
        hr.btxj[101] = -7947788135148825210L;
        hr.btxj[102] = -5092117815793940453L;
        hr.btxj[103] = 7200440422190364658L;
        hr.btxj[104] = 509223704676440820L;
        hr.btxj[105] = 2473209094486598042L;
        hr.btxj[106] = -3686437973726537855L;
        hr.btxj[107] = -2881584146596012406L;
        hr.btxj[108] = -3777183502996282084L;
        hr.btxj[109] = 6803361956623387749L;
        hr.btxj[110] = -8699965974499543260L;
        hr.btxj[111] = 3945637254804825782L;
        hr.btxj[112] = -6664231251934307227L;
        hr.btxj[113] = 3483085366874393835L;
        hr.btxj[114] = -5161609921880005009L;
        hr.btxj[115] = 4374807586244535697L;
        hr.btxj[116] = -1499752245648009241L;
        hr.btxj[117] = -3442544347494282035L;
        hr.btxj[118] = -7464981032036152536L;
        hr.btxj[119] = -4573532167727681045L;
        hr.btxj[120] = 5879235970348779594L;
        hr.btxj[121] = -514751684079142304L;
        hr.btxj[122] = -1850491755479032240L;
        hr.btxj[123] = -2695035905354744316L;
        hr.btxj[124] = -2170429253993289243L;
        hr.btxj[125] = 9216409300347023714L;
        hr.btxj[126] = -1257825990342565468L;
        hr.btxj[127] = 5988340297425863618L;
        hr.btxj[128] = 1372773748617239131L;
        hr.btxj[129] = -2727964178598351516L;
        hr.btxj[130] = -70509432178164789L;
        hr.btxj[131] = 926442273833301142L;
        hr.btxj[132] = -1190731665133570601L;
        hr.btxj[133] = 2641037738412587408L;
        hr.btxj[134] = -595036505504501404L;
        hr.btxj[135] = 5608228409171192204L;
        hr.btxj[136] = 6457243722755668004L;
        hr.btxj[137] = 5179630223355486011L;
        hr.btxj[138] = -610985330587404145L;
        hr.btxj[139] = 7652919281659615398L;
        hr.btxj[140] = 8244335433877433975L;
        hr.btxj[141] = -567720268210937375L;
        hr.btxj[142] = -682040887299917378L;
        hr.btxj[143] = 1034457055084364522L;
        hr.btxj[144] = -1201712782720304707L;
        hr.btxj[145] = -7648222725930964289L;
        hr.btxj[146] = 981865629011721363L;
        hr.btxj[147] = 1019625772798059345L;
        hr.btxj[148] = 3643198240944178182L;
        hr.btxj[149] = 1337615950234209513L;
        hr.btxj[150] = -2765068418126243386L;
        hr.btxj[151] = -586454781465396993L;
        hr.btxj[152] = 4531823520555399150L;
        hr.btxj[153] = 2579719034377180309L;
        hr.btxj[154] = -8108409055710534200L;
        hr.btxj[155] = -4114288700833437478L;
        hr.btxj[156] = 7141575361553158396L;
        hr.btxj[157] = -8728241711789142303L;
        hr.btxj[158] = -7234574870588144286L;
        hr.btxj[159] = -8813525164914501996L;
        hr.btxj[160] = -1772741993019053428L;
        hr.btxj[161] = 4360441672241430487L;
        hr.btxj[162] = -6422436400443165900L;
        hr.btxj[163] = -161435721852626044L;
        hr.btxj[164] = 4201862513269120027L;
        hr.btxj[165] = 3609404108557404856L;
        hr.btxj[166] = 1332097045728969148L;
        hr.btxj[167] = 2259996944997016894L;
        hr.btxj[168] = 1578832330047235627L;
        hr.btxj[169] = 3961213134486807348L;
        hr.btxj[170] = -5277181345259962893L;
        hr.btxj[171] = 7301135662548624181L;
        hr.btxj[172] = -6423484481115984847L;
        hr.btxj[173] = 287260060369367790L;
        hr.btxj[174] = 6657642114808955185L;
        hr.btxj[175] = 1365813914694492092L;
        hr.btxj[176] = 5456521410638312505L;
        hr.btxj[177] = 8474876809956894663L;
        hr.btxj[178] = -6851736447407607992L;
        hr.btxj[179] = 1051019205035575489L;
        hr.btxj[180] = 3424897902346449184L;
        hr.btxj[181] = -6197590182892059465L;
        hr.btxj[182] = -8696427867873071268L;
        hr.btxj[183] = 7189378795803438517L;
        hr.btxj[184] = 8895264635420102451L;
        hr.btxj[185] = 8355048089043288368L;
        hr.btxj[186] = 3393896513674277946L;
        hr.btxj[187] = -1594241515353706219L;
        hr.btxj[188] = 3860387796637973105L;
        hr.btxj[189] = -489017817868356981L;
        hr.btxj[190] = -6566988677588311072L;
        hr.btxj[191] = -8296076387321366802L;
        hr.btxj[192] = 4557108179291752224L;
        hr.btxj[193] = -36033780562951539L;
        hr.btxj[194] = -8617292121430843429L;
        hr.btxj[195] = 7845725227159545842L;
        hr.btxj[196] = 6661820135452054607L;
        hr.btxj[197] = -1367558007774633055L;
        hr.btxj[198] = 8765501194316600047L;
        hr.btxj[199] = -5775610282650507331L;
    }

    private static /* synthetic */ void bxdh() {
        hr.btwx[700] = 1936990591;
        hr.btwx[701] = 252137733;
        hr.btwx[702] = 916704681;
        hr.btwx[703] = 668254845;
        hr.btwx[704] = 242390073;
        hr.btwx[705] = 1598959767;
        hr.btwx[706] = -996748772;
        hr.btwx[707] = -555368532;
        hr.btwx[708] = 997313225;
        hr.btwx[709] = -1905462382;
        hr.btwx[710] = 1495056426;
        hr.btwx[711] = -1058198918;
        hr.btwx[712] = -2116904651;
        hr.btwx[713] = 1044028187;
        hr.btwx[714] = 296956809;
        hr.btwx[715] = 1104125580;
        hr.btwx[716] = -489962117;
        hr.btwx[717] = -1453565563;
        hr.btwx[718] = -1861096479;
        hr.btwx[719] = 966297563;
        hr.btwx[720] = 259842318;
        hr.btwx[721] = 568167947;
        hr.btwx[722] = 14037724;
        hr.btwx[723] = -1039910699;
        hr.btwx[724] = 1842220904;
        hr.btwx[725] = -248496440;
        hr.btwx[726] = -562031583;
        hr.btwx[727] = -1257062825;
        hr.btwx[728] = 1811302972;
        hr.btwx[729] = -198041622;
        hr.btwx[730] = 63379523;
        hr.btwx[731] = -1899424041;
        hr.btwx[732] = -838402476;
        hr.btwx[733] = -1928436961;
        hr.btwx[734] = 1752397684;
        hr.btwx[735] = -1099124927;
        hr.btwx[736] = -143322822;
        hr.btwx[737] = 328522299;
        hr.btwx[738] = -1656490997;
        hr.btwx[739] = -2090907134;
        hr.btwx[740] = -779836767;
        hr.btwx[741] = -1088213788;
        hr.btwx[742] = 1933040397;
        hr.btwx[743] = -222317477;
        hr.btwx[744] = -2013388556;
        hr.btwx[745] = 331687561;
        hr.btwx[746] = -602419314;
        hr.btwx[747] = 248901126;
        hr.btwx[748] = 1827176677;
        hr.btwx[749] = 1660772361;
        hr.btwx[750] = -141597352;
        hr.btwx[751] = 1342715078;
        hr.btwx[752] = -896379308;
        hr.btwx[753] = 1023680343;
        hr.btwx[754] = 2055057934;
        hr.btwx[755] = -116623510;
        hr.btwx[756] = 2063383273;
        hr.btwx[757] = -1051387952;
        hr.btwx[758] = 531023125;
        hr.btwx[759] = -900393663;
        hr.btwx[760] = 1935981397;
        hr.btwx[761] = -2130763507;
        hr.btwx[762] = -143342118;
        hr.btwx[763] = -122513282;
        hr.btwx[764] = -1781753581;
        hr.btwx[765] = 1761885909;
        hr.btwx[766] = -959667205;
        hr.btwx[767] = 1288677611;
        hr.btwx[768] = -857726669;
        hr.btwx[769] = 585461374;
        hr.btwx[770] = -278047993;
        hr.btwx[771] = 1102946082;
        hr.btwx[772] = -84688683;
        hr.btwx[773] = -1274127189;
        hr.btwx[774] = 1942375802;
        hr.btwx[775] = -1784226868;
        hr.btwx[776] = 6582309;
        hr.btwx[777] = -2021134118;
        hr.btwx[778] = 214578457;
        hr.btwx[779] = 724100273;
        hr.btwx[780] = -1885509852;
        hr.btwx[781] = -427089995;
        hr.btwx[782] = -128608248;
        hr.btwx[783] = 2082940155;
        hr.btwx[784] = 1812420542;
        hr.btwx[785] = -1199657250;
        hr.btwx[786] = -426044861;
        hr.btwx[787] = 6942293;
        hr.btwx[788] = -1540545559;
        hr.btwx[789] = -1948902412;
        hr.btwx[790] = -1805945448;
        hr.btwx[791] = -1109206634;
        hr.btwx[792] = -1823870560;
        hr.btwx[793] = 639785697;
        hr.btwx[794] = 54066287;
        hr.btwx[795] = -663795842;
        hr.btwx[796] = -2021499505;
        hr.btwx[797] = 1435413465;
        hr.btwx[798] = 118786955;
        hr.btwx[799] = 1153438028;
    }

    static {
        btwx = new int[998];
        btwz = new int[998];
        hr.bxda();
        hr.bxdb();
        hr.bxdc();
        hr.bxdd();
        hr.bxde();
        hr.bxdf();
        hr.bxdg();
        hr.bxdh();
        hr.bxdi();
        hr.bxdj();
        hr.bxdk();
        hr.bxdl();
        hr.bxdm();
        hr.bxdn();
        hr.bxdo();
        hr.bxdp();
        hr.bxdq();
        hr.bxdr();
        hr.bxds();
        hr.bxdt();
        btxj = new long[410];
        btxk = new long[410];
        hr.bxdu();
        hr.bxdv();
        hr.bxdw();
        hr.bxdx();
        hr.bxdy();
        hr.bxdz();
        hr.bxea();
        hr.bxeb();
        hr.bxec();
        hr.bxed();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static double direction(float var0, float var1_1, float var2_2) {
        block75: {
            block74: {
                block73: {
                    block72: {
                        v0 /* !! */  = hr.ei;
                        if (true) ** GOTO lbl5
                        block43: while (true) {
                            v0 /* !! */  = (long)(hr.btxb("bwlr", btxi(int ), (int)326) - hr.btxb("bwlq", btxi(int ), (int)325));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case 636023459: {
                                    continue block43;
                                }
                                case 2083520731: {
                                    break block43;
                                }
                            }
                            break;
                        }
                        var6_3 = hr.c;
                        while (true) {
                            if ((v1 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwls", btxi(int ), (int)327)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v1 /* !! */  == hr.btxb("bwlt", btwu(int ), (int)869)) break;
                            v1 /* !! */  = (long)hr.btxb("bwlu", btwu(int ), (int)870);
                        }
                        var5_4 /* !! */  = hr.b;
                        v2 /* !! */  = hr.ei;
                        if (true) ** GOTO lbl22
                        block45: while (true) {
                            v2 /* !! */  = (long)(hr.btxb("bwlw", btxi(int ), (int)329) - hr.btxb("bwlv", btxi(int ), (int)328));
lbl22:
                            // 2 sources

                            switch ((int)v2 /* !! */ ) {
                                case 45336485: {
                                    continue block45;
                                }
                                case 2083520731: {
                                    break block45;
                                }
                            }
                            break;
                        }
                        var4_5 = hr.a;
                        if (var6_3) {
                            throw null;
lbl30:
                            // 17 sources

                            return (double)hr.btxb("bwlx", buso(int ), (int)330);
                        }
                        if (var4_5 || var4_5) ** GOTO lbl30
                        if (!(var1_1 < 0.0f)) break block72;
                        if (var4_5) ** GOTO lbl30
                        var0 += hr.btxb("bwly", bubr(int ), (int)871);
                        if (var4_5) ** GOTO lbl30
                    }
                    if (var4_5 || var4_5) ** GOTO lbl30
                    var3_6 /* !! */  = 1.0f;
                    if (var4_5 || var4_5) ** GOTO lbl30
                    if (!(var1_1 < 0.0f)) break block73;
                    if (var4_5) ** GOTO lbl30
                    var3_6 /* !! */  = (float)hr.btxb("bwlz", bubr(int ), (int)872);
                    if (var4_5) ** GOTO lbl30
                    if (var6_3) {
                        throw null;
                    }
                    break block74;
                }
                if (var4_5 || var4_5) ** GOTO lbl30
                if (!(var1_1 > 0.0f)) break block74;
                if (var4_5) ** GOTO lbl30
                var3_6 /* !! */  = (float)hr.btxb("bwma", bubr(int ), (int)873);
                if (var4_5) ** GOTO lbl30
            }
            if (var4_5 || var4_5) ** GOTO lbl30
            if (!(var2_2 > 0.0f)) break block75;
            if (var4_5) ** GOTO lbl30
            var0 -= hr.btxb("bwmb", bubr(int ), (int)874) * var3_6 /* !! */ ;
            if (var4_5) ** GOTO lbl30
        }
        if (var4_5 || var4_5) ** GOTO lbl30
        if (!(var2_2 < 0.0f)) ** GOTO lbl-1000
        if (var4_5) ** GOTO lbl30
        var0 += hr.btxb("bwmc", bubr(int ), (int)875) * var3_6 /* !! */ ;
        if (var4_5) ** GOTO lbl30
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                v3 = var0;
                v4 /* !! */  = hr.ei;
                if (true) ** GOTO lbl76
                block47: while (true) {
                    v4 /* !! */  = (long)(v5 - hr.btxb("bwmd", btxi(int ), (int)331));
lbl76:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 880623850: {
                            v5 = hr.btxb("bwme", btxi(int ), (int)332);
                            continue block47;
                        }
                        case 1234809241: {
                            v5 = hr.btxb("bwmf", btxi(int ), (int)333);
                            continue block47;
                        }
                        case 1649915228: {
                            v5 = hr.btxb("bwmg", btxi(int ), (int)334);
                            continue block47;
                        }
                        case 2083520731: {
                            break block47;
                        }
                    }
                    break;
                }
                return Math.toRadians(v3);
            }
            case 0: {
                var5_4 /* !! */  = (int)hr.btxb("bwmh", btwu(int ), (int)876);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl94:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)hr.btxb("bwmi", btwu(int ), (int)877);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 2: {
                do {
                    var5_4 /* !! */  = (int)hr.btxb("bwmj", btwu(int ), (int)878);
                } while (!var6_3);
                throw null;
            }
lbl104:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)hr.btxb("bwmk", btwu(int ), (int)879);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var5_4 /* !! */  = (int)hr.btxb("bwml", btwu(int ), (int)880);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl114:
            // 4 sources

            case 5: {
                var5_4 /* !! */  = (int)hr.btxb("bwmm", btwu(int ), (int)881);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 6: {
                var5_4 /* !! */  = (int)hr.btxb("bwmn", btwu(int ), (int)882);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 7: {
                var5_4 /* !! */  = (int)hr.btxb("bwmo", btwu(int ), (int)883);
                if (!var6_3) ** GOTO lbl104
                throw null;
            }
            case 8: {
                var5_4 /* !! */  = (int)hr.btxb("bwmp", btwu(int ), (int)884);
                if (var6_3) {
                    throw null;
                }
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)hr.btxb("bwmq", btwu(int ), (int)885);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl182
                    break;
                }
            }
            case 10: {
                var5_4 /* !! */  = (int)hr.btxb("bwmr", btwu(int ), (int)886);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl143:
            // 4 sources

            case 11: {
                var5_4 /* !! */  = (int)hr.btxb("bwms", btwu(int ), (int)887);
                if (!var6_3) ** GOTO lbl94
                throw null;
            }
            case 12: {
                var5_4 /* !! */  = (int)hr.btxb("bwmt", btwu(int ), (int)888);
                if (!var6_3) ** GOTO lbl104
                throw null;
            }
lbl151:
            // 3 sources

            case 13: {
                var5_4 /* !! */  = (int)hr.btxb("bwmu", btwu(int ), (int)889);
                if (!var6_3) break;
                throw null;
            }
lbl155:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)hr.btxb("bwmv", btwu(int ), (int)890);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl160:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)hr.btxb("bwmw", btwu(int ), (int)891);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl165:
            // 4 sources

            case 16: {
                var5_4 /* !! */  = (int)hr.btxb("bwmx", btwu(int ), (int)892);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl170:
            // 2 sources

            case 17: {
                var5_4 /* !! */  = (int)hr.btxb("bwmy", btwu(int ), (int)893);
                if (!var6_3) ** GOTO lbl114
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)hr.btxb("bwmz", btwu(int ), (int)894);
                if (!var6_3) ** GOTO lbl143
                throw null;
            }
lbl178:
            // 2 sources

            case 19: {
                var5_4 /* !! */  = (int)hr.btxb("bwna", btwu(int ), (int)895);
                if (!var6_3) ** GOTO lbl143
                throw null;
            }
lbl182:
            // 2 sources

            case 20: {
                var5_4 /* !! */  = (int)hr.btxb("bwnb", btwu(int ), (int)896);
                if (!var6_3) ** GOTO lbl155
                throw null;
            }
lbl186:
            // 2 sources

            case 21: {
                var5_4 /* !! */  = (int)hr.btxb("bwnc", btwu(int ), (int)897);
                if (!var6_3) ** GOTO lbl114
                throw null;
            }
lbl190:
            // 2 sources

            case 22: {
                var5_4 /* !! */  = (int)hr.btxb("bwnd", btwu(int ), (int)898);
                if (!var6_3) ** GOTO lbl114
                throw null;
            }
            case 23: {
                var5_4 /* !! */  = (int)hr.btxb("bwne", btwu(int ), (int)899);
                if (!var6_3) ** GOTO lbl94
                throw null;
            }
lbl198:
            // 2 sources

            case 24: {
                var5_4 /* !! */  = (int)hr.btxb("bwnf", btwu(int ), (int)900);
                if (!var6_3) ** GOTO lbl165
                throw null;
            }
            case 25: {
                var5_4 /* !! */  = (int)hr.btxb("bwng", btwu(int ), (int)901);
                if (!var6_3) ** GOTO lbl178
                throw null;
            }
            case 26: 
        }
        var5_4 /* !! */  = (int)hr.btxb("bwnh", btwu(int ), (int)902);
        ** while (!var6_3)
lbl209:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1684 getTargetPearl() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("buzj", btxi(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("buzl", btwu(int ), (int)308)) break;
            v0 /* !! */  = (long)hr.btxb("buzm", btwu(int ), (int)309);
        }
        var5_1 = hr.c;
        v1 /* !! */  = hr.ei;
        if (true) ** GOTO lbl11
        block83: while (true) {
            v1 /* !! */  = (long)(v2 - hr.btxb("buzn", btxi(int ), (int)78));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1671459761: {
                    v2 = hr.btxb("buzo", btxi(int ), (int)79);
                    continue block83;
                }
                case -310452631: {
                    v2 = hr.btxb("buzp", btxi(int ), (int)80);
                    continue block83;
                }
                case 2083520731: {
                    break block83;
                }
            }
            break;
        }
        var4_2 /* !! */  = hr.b;
        v3 /* !! */  = hr.ei;
        if (true) ** GOTO lbl25
        block84: while (true) {
            v3 /* !! */  = (long)(v4 - hr.btxb("buzq", btxi(int ), (int)81));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1711266688: {
                    v4 = hr.btxb("buzr", btxi(int ), (int)82);
                    continue block84;
                }
                case 1153239727: {
                    v4 = hr.btxb("buzs", btxi(int ), (int)83);
                    continue block84;
                }
                case 1385870898: {
                    v4 = hr.btxb("buzt", btxi(int ), (int)84);
                    continue block84;
                }
                case 2083520731: {
                    break block84;
                }
            }
            break;
        }
        var3_3 = hr.a;
        if (var5_1) {
            throw null;
lbl40:
            // 7 sources

            return null;
        }
        if (var3_3) ** GOTO lbl40
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("buzu", btxi(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == hr.btxb("buzv", btwu(int ), (int)310)) break;
                    v5 /* !! */  = (long)hr.btxb("buzw", btwu(int ), (int)311);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("buzx", btxi(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hr.btxb("buzy", btwu(int ), (int)312)) break;
                    v6 /* !! */  = (long)hr.btxb("buzz", btwu(int ), (int)313);
                }
                v7 = hr.mc.field_1724;
                v8 /* !! */  = hr.ei;
                if (true) ** GOTO lbl62
                block88: while (true) {
                    v8 /* !! */  = (long)(v9 - hr.btxb("bvaa", btxi(int ), (int)87));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 657190191: {
                            v9 = hr.btxb("bvab", btxi(int ), (int)88);
                            continue block88;
                        }
                        case 661256512: {
                            v9 = hr.btxb("bvac", btxi(int ), (int)89);
                            continue block88;
                        }
                        case 1568280164: {
                            v9 = hr.btxb("bvad", btxi(int ), (int)90);
                            continue block88;
                        }
                        case 2083520731: {
                            break block88;
                        }
                    }
                    break;
                }
                v10 = v7.method_5829();
                v11 = hr.btxb("bvae", buso(int ), (int)91);
                v12 /* !! */  = hr.ei;
                if (true) ** GOTO lbl80
                block89: while (true) {
                    v12 /* !! */  = (long)(hr.btxb("bvag", btxi(int ), (int)93) - hr.btxb("bvaf", btxi(int ), (int)92));
lbl80:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -39648378: {
                            continue block89;
                        }
                        case 2083520731: {
                            break block89;
                        }
                    }
                    break;
                }
                var1_4 = v10.method_1014((double)v11);
                if (var3_3 || var3_3) ** GOTO lbl40
                v13 /* !! */  = hr.ei;
                if (true) ** GOTO lbl91
                block90: while (true) {
                    v13 /* !! */  = (long)(v14 - hr.btxb("bvai", btxi(int ), (int)94));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1764583: {
                            v14 = hr.btxb("bvaj", btxi(int ), (int)95);
                            continue block90;
                        }
                        case 1503131543: {
                            v14 = hr.btxb("bvak", btxi(int ), (int)96);
                            continue block90;
                        }
                        case 1593424954: {
                            v14 = hr.btxb("bval", btxi(int ), (int)97);
                            continue block90;
                        }
                        case 2083520731: {
                            break block90;
                        }
                    }
                    break;
                }
                if (hn.getInstance() == null) ** GOTO lbl137
                if (var3_3) ** GOTO lbl40
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bvam", btxi(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hr.btxb("bvan", btwu(int ), (int)314)) break;
                    v15 /* !! */  = (long)hr.btxb("bvao", btwu(int ), (int)315);
                }
                v16 = hn.getInstance();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bvap", btxi(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hr.btxb("bvaq", btwu(int ), (int)316)) break;
                    v17 /* !! */  = (long)hr.btxb("bvar", btwu(int ), (int)317);
                }
                if (!v16.isState()) ** GOTO lbl137
                if (var3_3 || var3_3) ** GOTO lbl40
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bvas", btxi(int ), (int)100)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == hr.btxb("bvat", btwu(int ), (int)318)) break;
                    v18 /* !! */  = (long)hr.btxb("bvau", btwu(int ), (int)319);
                }
                v19 = hn.getInstance();
                v20 /* !! */  = hr.ei;
                if (true) ** GOTO lbl128
                block94: while (true) {
                    v20 /* !! */  = (long)(hr.btxb("bvaw", btxi(int ), (int)102) - hr.btxb("bvav", btxi(int ), (int)101));
lbl128:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1252808500: {
                            continue block94;
                        }
                        case 2083520731: {
                            break block94;
                        }
                    }
                    break;
                }
                v21 = v19.getTarget();
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl139
lbl137:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl40
                v21 = var2_5 = null;
lbl139:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bvay", btxi(int ), (int)103)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == hr.btxb("bvaz", btwu(int ), (int)320)) break;
                    v22 /* !! */  = (long)hr.btxb("bvba", btwu(int ), (int)321);
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = hr.ei - hr.btxb("bvbb", btxi(int ), (int)104)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hr.btxb("bvbc", btwu(int ), (int)322)) break;
                    v23 /* !! */  = (long)hr.btxb("bvbd", btwu(int ), (int)323);
                }
                v24 = hr.mc.field_1687;
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = hr.ei - hr.btxb("bvbe", btxi(int ), (int)105)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == hr.btxb("bvbf", btwu(int ), (int)324)) break;
                    v25 /* !! */  = (long)hr.btxb("bvbg", btwu(int ), (int)325);
                }
                v26 /* !! */  = hr.ei;
                if (true) ** GOTO lbl161
                block98: while (true) {
                    v26 /* !! */  = (long)(hr.btxb("bvbi", btxi(int ), (int)107) - hr.btxb("bvbh", btxi(int ), (int)106));
lbl161:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 233060973: {
                            continue block98;
                        }
                        case 2083520731: {
                            break block98;
                        }
                    }
                    break;
                }
                v27 = hr.mc.field_1724;
                v28 /* !! */  = hr.ei;
                if (true) ** GOTO lbl171
                block99: while (true) {
                    v28 /* !! */  = (long)(hr.btxb("bvbk", btxi(int ), (int)109) - hr.btxb("bvbj", btxi(int ), (int)108));
lbl171:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1899699085: {
                            continue block99;
                        }
                        case 2083520731: {
                            break block99;
                        }
                    }
                    break;
                }
                v29 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getTargetPearl$1(net.minecraft.class_1309 net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)((hr)this, (class_1309)var2_5);
                v30 /* !! */  = hr.ei;
                if (true) ** GOTO lbl181
                block100: while (true) {
                    v30 /* !! */  = (long)(hr.btxb("bvbo", btxi(int ), (int)111) - hr.btxb("bvbm", btxi(int ), (int)110));
lbl181:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -996002847: {
                            continue block100;
                        }
                        case 2083520731: {
                            break block100;
                        }
                    }
                    break;
                }
                v31 = v24.method_8333((class_1297)v27, var1_4, v29);
                v32 /* !! */  = hr.ei;
                if (true) ** GOTO lbl191
                block101: while (true) {
                    v32 /* !! */  = (long)(v33 - hr.btxb("bvbp", btxi(int ), (int)112));
lbl191:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1629173799: {
                            v33 = hr.btxb("bvbq", btxi(int ), (int)113);
                            continue block101;
                        }
                        case -199126424: {
                            v33 = hr.btxb("bvbr", btxi(int ), (int)114);
                            continue block101;
                        }
                        case 128374522: {
                            v33 = hr.btxb("bvbs", btxi(int ), (int)115);
                            continue block101;
                        }
                        case 2083520731: {
                            break block101;
                        }
                    }
                    break;
                }
                v34 = v31.stream();
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_9 = hr.ei - hr.btxb("bvbt", btxi(int ), (int)116)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == hr.btxb("bvbu", btwu(int ), (int)326)) break;
                    v35 /* !! */  = (long)hr.btxb("bvbv", btwu(int ), (int)327);
                }
                v36 = (Function<class_1297, class_1684>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$getTargetPearl$2(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Lnet/minecraft/class_1684;)();
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_10 = hr.ei - hr.btxb("bvbw", btxi(int ), (int)117)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == hr.btxb("bvbx", btwu(int ), (int)328)) break;
                    v37 /* !! */  = (long)hr.btxb("bvby", btwu(int ), (int)329);
                }
                v38 = v34.map(v36);
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_11 = hr.ei - hr.btxb("bvbz", btxi(int ), (int)118)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == hr.btxb("bvca", btwu(int ), (int)330)) break;
                    v39 /* !! */  = (long)hr.btxb("bvcc", btwu(int ), (int)331);
                }
                v40 = (Predicate<class_1684>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$getTargetPearl$3(net.minecraft.class_1684 ), (Lnet/minecraft/class_1684;)Z)((hr)this);
                v41 /* !! */  = hr.ei;
                if (true) ** GOTO lbl226
                block105: while (true) {
                    v41 /* !! */  = (long)(v42 - hr.btxb("bvcd", btxi(int ), (int)119));
lbl226:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1168620013: {
                            v42 = hr.btxb("bvce", btxi(int ), (int)120);
                            continue block105;
                        }
                        case -1136434479: {
                            v42 = hr.btxb("bvcf", btxi(int ), (int)121);
                            continue block105;
                        }
                        case 974421725: {
                            v42 = hr.btxb("bvcg", btxi(int ), (int)122);
                            continue block105;
                        }
                        case 2083520731: {
                            break block105;
                        }
                    }
                    break;
                }
                v43 = v38.filter(v40);
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_12 = hr.ei - hr.btxb("bvch", btxi(int ), (int)123)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == hr.btxb("bvci", btwu(int ), (int)332)) break;
                    v44 /* !! */  = (long)hr.btxb("bvcj", btwu(int ), (int)333);
                }
                v45 = (ToDoubleFunction<class_1684>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, getHorizontalDistanceTo(net.minecraft.class_1684 ), (Lnet/minecraft/class_1684;)D)((hr)this);
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_13 = hr.ei - hr.btxb("bvck", btxi(int ), (int)124)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == hr.btxb("bvcl", btwu(int ), (int)334)) break;
                    v46 /* !! */  = (long)hr.btxb("bvcm", btwu(int ), (int)335);
                }
                v47 = Comparator.comparingDouble(v45);
                v48 /* !! */  = hr.ei;
                if (true) ** GOTO lbl255
                block108: while (true) {
                    v48 /* !! */  = (long)(v49 - hr.btxb("bvcn", btxi(int ), (int)125));
lbl255:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case 616279523: {
                            v49 = hr.btxb("bvcp", btxi(int ), (int)126);
                            continue block108;
                        }
                        case 931367597: {
                            v49 = hr.btxb("bvcq", btxi(int ), (int)127);
                            continue block108;
                        }
                        case 2083520731: {
                            break block108;
                        }
                    }
                    break;
                }
                v50 = v43.min(v47);
                v51 /* !! */  = hr.ei;
                if (true) ** GOTO lbl269
                block109: while (true) {
                    v51 /* !! */  = (long)(v52 - hr.btxb("bvcr", btxi(int ), (int)128));
lbl269:
                    // 2 sources

                    switch ((int)v51 /* !! */ ) {
                        case -1256840410: {
                            v52 = hr.btxb("bvcs", btxi(int ), (int)129);
                            continue block109;
                        }
                        case -652283820: {
                            v52 = hr.btxb("bvct", btxi(int ), (int)130);
                            continue block109;
                        }
                        case -109001271: {
                            v52 = hr.btxb("bvcu", btxi(int ), (int)131);
                            continue block109;
                        }
                        case 2083520731: {
                            break block109;
                        }
                    }
                    break;
                }
                return v50.orElse(null);
            }
lbl282:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)hr.btxb("bvcv", btwu(int ), (int)336);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 1: {
                var4_2 /* !! */  = (int)hr.btxb("bvcw", btwu(int ), (int)337);
                if (!var5_1) ** GOTO lbl282
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)hr.btxb("bvcx", btwu(int ), (int)338);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 3: {
                var4_2 /* !! */  = (int)hr.btxb("bvcy", btwu(int ), (int)339);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl301:
            // 2 sources

            case 4: {
                do {
                    var4_2 /* !! */  = (int)hr.btxb("bvcz", btwu(int ), (int)340);
                } while (!var5_1);
                throw null;
            }
lbl306:
            // 4 sources

            case 5: {
                var4_2 /* !! */  = (int)hr.btxb("bvdb", btwu(int ), (int)341);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl311:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)hr.btxb("bvdc", btwu(int ), (int)342);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 7: {
                var4_2 /* !! */  = (int)hr.btxb("bvdd", btwu(int ), (int)343);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 8: {
                var4_2 /* !! */  = (int)hr.btxb("bvde", btwu(int ), (int)344);
                if (!var5_1) ** GOTO lbl311
                throw null;
            }
lbl325:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)hr.btxb("bvdf", btwu(int ), (int)345);
                if (!var5_1) ** GOTO lbl306
                throw null;
            }
lbl329:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hr.btxb("bvdg", btwu(int ), (int)346);
                    if (!var5_1) ** GOTO lbl301
                    throw null;
                }
            }
lbl334:
            // 4 sources

            case 11: {
                var4_2 /* !! */  = (int)hr.btxb("bvdh", btwu(int ), (int)347);
                if (!var5_1) ** GOTO lbl311
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)hr.btxb("bvdi", btwu(int ), (int)348);
                if (!var5_1) ** GOTO lbl329
                throw null;
            }
            case 13: 
        }
        var4_2 /* !! */  = (int)hr.btxb("bvdj", btwu(int ), (int)349);
        ** while (!var5_1)
lbl345:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canThrowNow() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bunm", btxi(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("bunn", btwu(int ), (int)172)) break;
            v0 /* !! */  = (long)hr.btxb("buno", btwu(int ), (int)173);
        }
        var5_1 = hr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bunp", btxi(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hr.btxb("bunr", btwu(int ), (int)174)) break;
            v1 /* !! */  = (long)hr.btxb("bunt", btwu(int ), (int)175);
        }
        var4_2 /* !! */  = hr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bunv", btxi(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hr.btxb("bunw", btwu(int ), (int)176)) break;
            v2 /* !! */  = (long)hr.btxb("buny", btwu(int ), (int)177);
        }
        var3_3 = hr.a;
        if (var5_1) {
            throw null;
lbl21:
            // 7 sources

            return (boolean)hr.btxb("buoc", btwu(int ), (int)178);
        }
        if (var3_3 || var3_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("buod", btxi(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hr.btxb("buoe", btwu(int ), (int)179)) break;
            v3 /* !! */  = (long)hr.btxb("buof", btwu(int ), (int)180);
        }
        var1_4 = System.currentTimeMillis();
        if (var3_3 || var3_3) ** GOTO lbl21
        v4 /* !! */  = hr.ei;
        if (true) ** GOTO lbl35
        block45: while (true) {
            v4 /* !! */  = (long)(v5 - hr.btxb("buog", btxi(int ), (int)22));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1928232821: {
                    v5 = hr.btxb("buoh", btxi(int ), (int)23);
                    continue block45;
                }
                case 152411204: {
                    v5 = hr.btxb("buom", btxi(int ), (int)24);
                    continue block45;
                }
                case 2083520731: {
                    break block45;
                }
            }
            break;
        }
        if (var1_4 >= this.nextThrowAt) ** GOTO lbl50
        if (var3_3 || var3_3) ** GOTO lbl21
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return (boolean)hr.btxb("buop", btwu(int ), (int)181);
            }
lbl50:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl21
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("buoq", btxi(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == hr.btxb("buor", btwu(int ), (int)182)) break;
                v6 /* !! */  = (long)hr.btxb("buot", btwu(int ), (int)183);
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("buov", btxi(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == hr.btxb("buox", btwu(int ), (int)184)) break;
                v7 /* !! */  = (long)hr.btxb("bupc", btwu(int ), (int)185);
            }
            v8 = hr.mc.field_1724;
            v9 /* !! */  = hr.ei;
            if (true) ** GOTO lbl66
            block48: while (true) {
                v9 /* !! */  = (long)(hr.btxb("bupe", btxi(int ), (int)28) - hr.btxb("bupd", btxi(int ), (int)27));
lbl66:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1889568778: {
                        continue block48;
                    }
                    case 2083520731: {
                        break block48;
                    }
                }
                break;
            }
            v10 = v8.method_7357();
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bupf", btxi(int ), (int)29)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hr.btxb("buph", btwu(int ), (int)186)) break;
                v11 /* !! */  = (long)hr.btxb("bupj", btwu(int ), (int)187);
            }
            v12 /* !! */  = hr.ei;
            if (true) ** GOTO lbl81
            block50: while (true) {
                v12 /* !! */  = (long)(hr.btxb("bupn", btxi(int ), (int)31) - hr.btxb("bupl", btxi(int ), (int)30));
lbl81:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 929920127: {
                        continue block50;
                    }
                    case 2083520731: {
                        break block50;
                    }
                }
                break;
            }
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_7 = hr.ei - hr.btxb("bupp", btxi(int ), (int)32)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hr.btxb("bupq", btwu(int ), (int)188)) break;
                v13 /* !! */  = (long)hr.btxb("bupr", btwu(int ), (int)189);
            }
            v14 = new class_1799((class_1935)class_1802.field_8634);
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_8 = hr.ei - hr.btxb("bupt", btxi(int ), (int)33)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hr.btxb("bupv", btwu(int ), (int)190)) break;
                v15 /* !! */  = (long)hr.btxb("buqa", btwu(int ), (int)191);
            }
            if (v10.method_7904(v14)) ** GOTO lbl142
            if (var3_3) ** GOTO lbl21
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_9 = hr.ei - hr.btxb("buqc", btxi(int ), (int)34)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hr.btxb("buqi", btwu(int ), (int)192)) break;
                v16 /* !! */  = (long)hr.btxb("buqk", btwu(int ), (int)193);
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_10 = hr.ei - hr.btxb("buql", btxi(int ), (int)35)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == hr.btxb("buqm", btwu(int ), (int)194)) break;
                v17 /* !! */  = (long)hr.btxb("buqn", btwu(int ), (int)195);
            }
            v18 = hr.mc.field_1724;
            v19 /* !! */  = hr.ei;
            if (true) ** GOTO lbl114
            block55: while (true) {
                v19 /* !! */  = (long)(v20 - hr.btxb("buqp", btxi(int ), (int)36));
lbl114:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1849864969: {
                        v20 = hr.btxb("buqr", btxi(int ), (int)37);
                        continue block55;
                    }
                    case -1512798816: {
                        v20 = hr.btxb("buqt", btxi(int ), (int)38);
                        continue block55;
                    }
                    case 44076603: {
                        v20 = hr.btxb("buqy", btxi(int ), (int)39);
                        continue block55;
                    }
                    case 2083520731: {
                        break block55;
                    }
                }
                break;
            }
            v21 = v18.field_6012;
            v22 /* !! */  = hr.ei;
            if (true) ** GOTO lbl131
            block56: while (true) {
                v22 /* !! */  = (long)(hr.btxb("bura", btxi(int ), (int)41) - hr.btxb("buqz", btxi(int ), (int)40));
lbl131:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case 383756098: {
                        continue block56;
                    }
                    case 2083520731: {
                        break block56;
                    }
                }
                break;
            }
            if (v21 - this.lastTickReset < hr.btxb("burb", btxi(int ), (int)42)) ** GOTO lbl142
            if (var3_3) ** GOTO lbl21
            v23 = hr.btxb("burc", btwu(int ), (int)196);
            if (var5_1) {
                throw null;
            }
            ** GOTO lbl145
lbl142:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v23 = hr.btxb("burf", btwu(int ), (int)197);
lbl145:
            // 2 sources

            return (boolean)v23;
lbl146:
            // 2 sources

            case 0: {
                do {
                    var4_2 /* !! */  = (int)hr.btxb("burg", btwu(int ), (int)198);
                } while (!var5_1);
                throw null;
            }
lbl151:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hr.btxb("buri", btwu(int ), (int)199);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl188
                    break;
                }
            }
            case 2: {
                var4_2 /* !! */  = (int)hr.btxb("burj", btwu(int ), (int)200);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 3: {
                var4_2 /* !! */  = (int)hr.btxb("burk", btwu(int ), (int)201);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 4: {
                var4_2 /* !! */  = (int)hr.btxb("burn", btwu(int ), (int)202);
                if (!var5_1) ** GOTO lbl146
                throw null;
            }
lbl171:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)hr.btxb("burp", btwu(int ), (int)203);
                if (!var5_1) ** GOTO lbl151
                throw null;
            }
lbl175:
            // 3 sources

            case 6: {
                var4_2 /* !! */  = (int)hr.btxb("burq", btwu(int ), (int)204);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl180:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)hr.btxb("burr", btwu(int ), (int)205);
                if (!var5_1) ** GOTO lbl175
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)hr.btxb("burx", btwu(int ), (int)206);
                if (!var5_1) ** GOTO lbl180
                throw null;
            }
lbl188:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)hr.btxb("burz", btwu(int ), (int)207);
                if (!var5_1) break;
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)hr.btxb("busa", btwu(int ), (int)208);
                if (var5_1) {
                    throw null;
                }
            }
lbl196:
            // 5 sources

            case 11: {
                var4_2 /* !! */  = (int)hr.btxb("busb", btwu(int ), (int)209);
                if (!var5_1) ** GOTO lbl175
                throw null;
            }
            case 12: {
                var4_2 /* !! */  = (int)hr.btxb("buse", btwu(int ), (int)210);
                if (!var5_1) ** GOTO lbl151
                throw null;
            }
            case 13: {
                var4_2 /* !! */  = (int)hr.btxb("busg", btwu(int ), (int)211);
                if (!var5_1) break;
                throw null;
            }
            case 14: 
        }
        var4_2 /* !! */  = (int)hr.btxb("busj", btwu(int ), (int)212);
        ** while (!var5_1)
lbl211:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdp() {
        hr.btwz[500] = 2134862821;
        hr.btwz[501] = 921344606;
        hr.btwz[502] = -474725158;
        hr.btwz[503] = 1222727582;
        hr.btwz[504] = -1632348998;
        hr.btwz[505] = -877318696;
        hr.btwz[506] = -1096141023;
        hr.btwz[507] = -1179187903;
        hr.btwz[508] = -1873974466;
        hr.btwz[509] = 1455952628;
        hr.btwz[510] = 781333148;
        hr.btwz[511] = 1314101850;
        hr.btwz[512] = -234126338;
        hr.btwz[513] = 598297834;
        hr.btwz[514] = -373268446;
        hr.btwz[515] = 663230063;
        hr.btwz[516] = 1879523190;
        hr.btwz[517] = 1461875754;
        hr.btwz[518] = 2008742651;
        hr.btwz[519] = -1463165031;
        hr.btwz[520] = 1825787881;
        hr.btwz[521] = 591718816;
        hr.btwz[522] = 1472412888;
        hr.btwz[523] = 23884136;
        hr.btwz[524] = 878495860;
        hr.btwz[525] = 912751161;
        hr.btwz[526] = 2107165024;
        hr.btwz[527] = -1336133980;
        hr.btwz[528] = 1158913762;
        hr.btwz[529] = 672370079;
        hr.btwz[530] = 611327416;
        hr.btwz[531] = -1748663459;
        hr.btwz[532] = 2032765832;
        hr.btwz[533] = -1732589575;
        hr.btwz[534] = -749822437;
        hr.btwz[535] = -765614874;
        hr.btwz[536] = 794817231;
        hr.btwz[537] = 1952388199;
        hr.btwz[538] = 63270099;
        hr.btwz[539] = -428585897;
        hr.btwz[540] = -1391706248;
        hr.btwz[541] = -142840861;
        hr.btwz[542] = -586391771;
        hr.btwz[543] = -300292071;
        hr.btwz[544] = 601434788;
        hr.btwz[545] = -1130776200;
        hr.btwz[546] = 656418794;
        hr.btwz[547] = -844579602;
        hr.btwz[548] = -1638925689;
        hr.btwz[549] = -1493285664;
        hr.btwz[550] = -1090513058;
        hr.btwz[551] = -606598349;
        hr.btwz[552] = 371882075;
        hr.btwz[553] = 1535157102;
        hr.btwz[554] = -1117289417;
        hr.btwz[555] = 696632425;
        hr.btwz[556] = 200921494;
        hr.btwz[557] = 1960399662;
        hr.btwz[558] = 848048633;
        hr.btwz[559] = -1356360463;
        hr.btwz[560] = 1740494942;
        hr.btwz[561] = 182543434;
        hr.btwz[562] = -399751032;
        hr.btwz[563] = 228345366;
        hr.btwz[564] = -2083825860;
        hr.btwz[565] = -2016947025;
        hr.btwz[566] = -859066114;
        hr.btwz[567] = -1004356527;
        hr.btwz[568] = 1847028752;
        hr.btwz[569] = -1714519569;
        hr.btwz[570] = 1487530942;
        hr.btwz[571] = -1110698553;
        hr.btwz[572] = 1122573892;
        hr.btwz[573] = -305539736;
        hr.btwz[574] = -1812548663;
        hr.btwz[575] = -1441616618;
        hr.btwz[576] = 374449220;
        hr.btwz[577] = 1152159398;
        hr.btwz[578] = 660407120;
        hr.btwz[579] = 2123891792;
        hr.btwz[580] = -220263379;
        hr.btwz[581] = 119230469;
        hr.btwz[582] = -1587458679;
        hr.btwz[583] = -811082681;
        hr.btwz[584] = -1157350460;
        hr.btwz[585] = 999936411;
        hr.btwz[586] = -2054618683;
        hr.btwz[587] = -230753270;
        hr.btwz[588] = 585923497;
        hr.btwz[589] = 1620958804;
        hr.btwz[590] = -888230974;
        hr.btwz[591] = 1765305520;
        hr.btwz[592] = -517996085;
        hr.btwz[593] = 837975901;
        hr.btwz[594] = -1186511555;
        hr.btwz[595] = 1345072467;
        hr.btwz[596] = -1329451234;
        hr.btwz[597] = -2103969339;
        hr.btwz[598] = -183333684;
        hr.btwz[599] = -441015457;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 getTargetPearlLandingPosition() {
        block103: {
            block102: {
                v0 /* !! */  = hr.ei;
                if (true) ** GOTO lbl5
                block70: while (true) {
                    v0 /* !! */  = (long)(v1 - hr.btxb("buxb", btxi(int ), (int)46));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 659764319: {
                            v1 = hr.btxb("buxc", btxi(int ), (int)47);
                            continue block70;
                        }
                        case 872592644: {
                            v1 = hr.btxb("buxd", btxi(int ), (int)48);
                            continue block70;
                        }
                        case 2083520731: {
                            break block70;
                        }
                    }
                    break;
                }
                var4_1 = hr.c;
                v2 /* !! */  = hr.ei;
                if (true) ** GOTO lbl19
                block71: while (true) {
                    v2 /* !! */  = (long)(v3 - hr.btxb("buxe", btxi(int ), (int)49));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1171235331: {
                            v3 = hr.btxb("buxf", btxi(int ), (int)50);
                            continue block71;
                        }
                        case 965147897: {
                            v3 = hr.btxb("buxg", btxi(int ), (int)51);
                            continue block71;
                        }
                        case 1155159665: {
                            v3 = hr.btxb("buxh", btxi(int ), (int)52);
                            continue block71;
                        }
                        case 2083520731: {
                            break block71;
                        }
                    }
                    break;
                }
                var3_2 /* !! */  = hr.b;
                v4 /* !! */  = hr.ei;
                if (true) ** GOTO lbl36
                block72: while (true) {
                    v4 /* !! */  = (long)(v5 - hr.btxb("buxi", btxi(int ), (int)53));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1313085975: {
                            v5 = hr.btxb("buxj", btxi(int ), (int)54);
                            continue block72;
                        }
                        case -850415345: {
                            v5 = hr.btxb("buxk", btxi(int ), (int)55);
                            continue block72;
                        }
                        case 1834756538: {
                            v5 = hr.btxb("buxm", btxi(int ), (int)56);
                            continue block72;
                        }
                        case 2083520731: {
                            break block72;
                        }
                    }
                    break;
                }
                var2_3 = hr.a;
                if (var4_1) {
                    throw null;
lbl51:
                    // 11 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl51
                v6 /* !! */  = hr.ei;
                if (true) ** GOTO lbl58
                block74: while (true) {
                    v6 /* !! */  = (long)(v7 - hr.btxb("buxn", btxi(int ), (int)57));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1441927856: {
                            v7 = hr.btxb("buxo", btxi(int ), (int)58);
                            continue block74;
                        }
                        case -93578447: {
                            v7 = hr.btxb("buxp", btxi(int ), (int)59);
                            continue block74;
                        }
                        case 371281970: {
                            v7 = hr.btxb("buxq", btxi(int ), (int)60);
                            continue block74;
                        }
                        case 2083520731: {
                            break block74;
                        }
                    }
                    break;
                }
                v8 = this.getTargetPearl();
                v9 /* !! */  = hr.ei;
                if (true) ** GOTO lbl75
                block75: while (true) {
                    v9 /* !! */  = (long)(v10 - hr.btxb("buxr", btxi(int ), (int)61));
lbl75:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2024435593: {
                            v10 = hr.btxb("buxs", btxi(int ), (int)62);
                            continue block75;
                        }
                        case -1315906515: {
                            v10 = hr.btxb("buxt", btxi(int ), (int)63);
                            continue block75;
                        }
                        case -1087801181: {
                            v10 = hr.btxb("buxu", btxi(int ), (int)64);
                            continue block75;
                        }
                        case 2083520731: {
                            break block75;
                        }
                    }
                    break;
                }
                this.targetPearl = v8;
                if (var2_3 || var2_3) ** GOTO lbl51
                v11 /* !! */  = hr.ei;
                if (true) ** GOTO lbl93
                block76: while (true) {
                    v11 /* !! */  = (long)(v12 - hr.btxb("buxv", btxi(int ), (int)65));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1942993784: {
                            v12 = hr.btxb("buxw", btxi(int ), (int)66);
                            continue block76;
                        }
                        case 586104982: {
                            v12 = hr.btxb("buxx", btxi(int ), (int)67);
                            continue block76;
                        }
                        case 2083520731: {
                            break block76;
                        }
                    }
                    break;
                }
                if (this.targetPearl == null) break block102;
                if (var2_3) ** GOTO lbl51
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("buxy", btxi(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == hr.btxb("buxz", btwu(int ), (int)283)) break;
                    v13 /* !! */  = (long)hr.btxb("buya", btwu(int ), (int)284);
                }
                v14 /* !! */  = hr.ei;
                if (true) ** GOTO lbl114
                block78: while (true) {
                    v14 /* !! */  = (long)(hr.btxb("buyc", btxi(int ), (int)70) - hr.btxb("buyb", btxi(int ), (int)69));
lbl114:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1549844234: {
                            continue block78;
                        }
                        case 2083520731: {
                            break block78;
                        }
                    }
                    break;
                }
                if (this.targetPearl.method_5805()) break block103;
                if (var2_3) ** GOTO lbl51
            }
            if (var2_3 || var2_3) ** GOTO lbl51
            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl51
        v15 /* !! */  = hr.ei;
        if (true) ** GOTO lbl130
        block79: while (true) {
            v15 /* !! */  = (long)(hr.btxb("buyf", btxi(int ), (int)72) - hr.btxb("buye", btxi(int ), (int)71));
lbl130:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case 1838735746: {
                    continue block79;
                }
                case 2083520731: {
                    break block79;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("buyg", btxi(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v16 /* !! */  == hr.btxb("buyh", btwu(int ), (int)285)) break;
            v16 /* !! */  = (long)hr.btxb("buyi", btwu(int ), (int)286);
        }
        var1_4 = this.predictPearlLanding(this.targetPearl);
        if (var2_3 || var2_3) ** GOTO lbl51
        if (var1_4 == null) ** GOTO lbl163
        if (var2_3) ** GOTO lbl51
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v17 /* !! */  = hr.ei;
                if (true) ** GOTO lbl152
                block81: while (true) {
                    v17 /* !! */  = (long)(v18 - hr.btxb("buyj", btxi(int ), (int)74));
lbl152:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1901150587: {
                            v18 = hr.btxb("buyk", btxi(int ), (int)75);
                            continue block81;
                        }
                        case 616092116: {
                            v18 = hr.btxb("buyl", btxi(int ), (int)76);
                            continue block81;
                        }
                        case 2083520731: {
                            break block81;
                        }
                    }
                    break;
                }
                if (this.isWithinRange(var1_4)) ** GOTO lbl165
                if (var2_3) ** GOTO lbl51
lbl163:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl51
                return null;
lbl165:
                // 1 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return var1_4;
            }
lbl168:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)hr.btxb("buym", btwu(int ), (int)287);
                if (var4_1) {
                    throw null;
                }
            }
lbl172:
            // 6 sources

            case 1: {
                var3_2 /* !! */  = (int)hr.btxb("buyn", btwu(int ), (int)288);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
lbl176:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)hr.btxb("buyo", btwu(int ), (int)289);
                if (!var4_1) ** GOTO lbl172
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)hr.btxb("buyp", btwu(int ), (int)290);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl185:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)hr.btxb("buyr", btwu(int ), (int)291);
                if (!var4_1) ** GOTO lbl172
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)hr.btxb("buys", btwu(int ), (int)292);
                if (!var4_1) ** GOTO lbl172
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)hr.btxb("buyt", btwu(int ), (int)293);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl198:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)hr.btxb("buyu", btwu(int ), (int)294);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl203:
            // 4 sources

            case 8: {
                var3_2 /* !! */  = (int)hr.btxb("buyv", btwu(int ), (int)295);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl208:
            // 3 sources

            case 9: {
                do {
                    var3_2 /* !! */  = (int)hr.btxb("buyw", btwu(int ), (int)296);
                } while (!var4_1);
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)hr.btxb("buyx", btwu(int ), (int)297);
                if (!var4_1) ** GOTO lbl208
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)hr.btxb("buyy", btwu(int ), (int)298);
                    if (!var4_1) ** GOTO lbl203
                    throw null;
                }
            }
lbl222:
            // 2 sources

            case 12: {
                do {
                    var3_2 /* !! */  = (int)hr.btxb("buyz", btwu(int ), (int)299);
                } while (!var4_1);
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)hr.btxb("buzb", btwu(int ), (int)300);
                if (!var4_1) ** GOTO lbl222
                throw null;
            }
lbl231:
            // 2 sources

            case 14: {
                do {
                    var3_2 /* !! */  = (int)hr.btxb("buzc", btwu(int ), (int)301);
                } while (!var4_1);
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)hr.btxb("buzd", btwu(int ), (int)302);
                if (!var4_1) ** GOTO lbl203
                throw null;
            }
            case 16: {
                do {
                    var3_2 /* !! */  = (int)hr.btxb("buze", btwu(int ), (int)303);
                } while (!var4_1);
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)hr.btxb("buzf", btwu(int ), (int)304);
                if (!var4_1) ** GOTO lbl185
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)hr.btxb("buzg", btwu(int ), (int)305);
                if (!var4_1) ** GOTO lbl176
                throw null;
            }
lbl253:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)hr.btxb("buzh", btwu(int ), (int)306);
                if (!var4_1) ** GOTO lbl203
                throw null;
            }
            case 20: 
        }
        var3_2 /* !! */  = (int)hr.btxb("buzi", btwu(int ), (int)307);
        ** while (!var4_1)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxea() {
        hr.btxk[100] = 660462306043868307L;
        hr.btxk[101] = 6376007335868522411L;
        hr.btxk[102] = -5946478392509649635L;
        hr.btxk[103] = 6559414336193981332L;
        hr.btxk[104] = -5860368241260350148L;
        hr.btxk[105] = -2768673701474389887L;
        hr.btxk[106] = 3344484223204605210L;
        hr.btxk[107] = -4203101472779739523L;
        hr.btxk[108] = 5400667555201672632L;
        hr.btxk[109] = 4287016675623234133L;
        hr.btxk[110] = -5863937866512011928L;
        hr.btxk[111] = -7690268742097566453L;
        hr.btxk[112] = -1466181634343710917L;
        hr.btxk[113] = 6485330824110329562L;
        hr.btxk[114] = 9168509519017153575L;
        hr.btxk[115] = 9213633683112040942L;
        hr.btxk[116] = 5154064647889003311L;
        hr.btxk[117] = 2861520682337726402L;
        hr.btxk[118] = -5267483802677859744L;
        hr.btxk[119] = -3697934475167148157L;
        hr.btxk[120] = 2134896864186127368L;
        hr.btxk[121] = -8515322163057430340L;
        hr.btxk[122] = -568290208406085265L;
        hr.btxk[123] = -4940029266761747429L;
        hr.btxk[124] = 9122423860270761428L;
        hr.btxk[125] = 2375895995977795614L;
        hr.btxk[126] = -5928895236117997148L;
        hr.btxk[127] = -2600278705892504226L;
        hr.btxk[128] = 3142372514390613147L;
        hr.btxk[129] = 2416363995336820868L;
        hr.btxk[130] = 455173059427652952L;
        hr.btxk[131] = 7665535492246200245L;
        hr.btxk[132] = 2719237291666243686L;
        hr.btxk[133] = 706199280784989207L;
        hr.btxk[134] = -9027898484091581656L;
        hr.btxk[135] = 3842389669832079714L;
        hr.btxk[136] = -4987021325982903004L;
        hr.btxk[137] = -5126954391445197888L;
        hr.btxk[138] = 2037022170878395455L;
        hr.btxk[139] = 8882205778855482192L;
        hr.btxk[140] = 6919400782689884878L;
        hr.btxk[141] = 2248994818996666065L;
        hr.btxk[142] = -3948129042163183218L;
        hr.btxk[143] = 53700510544216783L;
        hr.btxk[144] = 6721615251827352696L;
        hr.btxk[145] = 3869508351357353007L;
        hr.btxk[146] = -1615361147585827000L;
        hr.btxk[147] = -2863303543001103465L;
        hr.btxk[148] = -6925100050635275741L;
        hr.btxk[149] = -3694084538399721603L;
        hr.btxk[150] = -7696833523112487592L;
        hr.btxk[151] = 7517663950704775426L;
        hr.btxk[152] = 6213602638089422714L;
        hr.btxk[153] = -5839800079984720603L;
        hr.btxk[154] = 2583968082976935547L;
        hr.btxk[155] = 2433684212022951476L;
        hr.btxk[156] = -8995730404608377768L;
        hr.btxk[157] = 7495327914983585446L;
        hr.btxk[158] = -6595063723501533854L;
        hr.btxk[159] = -5021494278668544364L;
        hr.btxk[160] = -2844598704333231476L;
        hr.btxk[161] = 244151612824797143L;
        hr.btxk[162] = 1224927487314674008L;
        hr.btxk[163] = 8670142835135332016L;
        hr.btxk[164] = 4398368380581985114L;
        hr.btxk[165] = -706880453199268749L;
        hr.btxk[166] = 671979619897290242L;
        hr.btxk[167] = -7125701415627968006L;
        hr.btxk[168] = 6896630895421710622L;
        hr.btxk[169] = 1256423336137091764L;
        hr.btxk[170] = -4951666125766802863L;
        hr.btxk[171] = -6797558801490454979L;
        hr.btxk[172] = 6915406191250097612L;
        hr.btxk[173] = -5938590280069362604L;
        hr.btxk[174] = 313629403443300887L;
        hr.btxk[175] = 7956921400741630198L;
        hr.btxk[176] = 707181127003084842L;
        hr.btxk[177] = 270673385178887421L;
        hr.btxk[178] = -6989543082182723886L;
        hr.btxk[179] = 5098822858141543441L;
        hr.btxk[180] = -8063389267133321320L;
        hr.btxk[181] = -5370354511824582171L;
        hr.btxk[182] = 2173250935315148364L;
        hr.btxk[183] = -3606543920874845336L;
        hr.btxk[184] = 4944382959587035293L;
        hr.btxk[185] = -2279239133144457961L;
        hr.btxk[186] = 7981676999788646324L;
        hr.btxk[187] = -48212847026038654L;
        hr.btxk[188] = 806220291755946164L;
        hr.btxk[189] = 5091337741314796595L;
        hr.btxk[190] = -7275203213263351742L;
        hr.btxk[191] = -1954937374780486453L;
        hr.btxk[192] = -6743666823120987577L;
        hr.btxk[193] = 1593409268417583639L;
        hr.btxk[194] = 6896769506406665057L;
        hr.btxk[195] = 5587506311330084022L;
        hr.btxk[196] = 4957564743165806256L;
        hr.btxk[197] = -5366516370702096031L;
        hr.btxk[198] = 2506150540958851008L;
        hr.btxk[199] = 7393205344672780586L;
    }

    private static /* synthetic */ void bxdi() {
        hr.btwx[800] = 2101213432;
        hr.btwx[801] = -1591607172;
        hr.btwx[802] = 2139996686;
        hr.btwx[803] = 1421979388;
        hr.btwx[804] = -90444267;
        hr.btwx[805] = -1113051651;
        hr.btwx[806] = -1524416607;
        hr.btwx[807] = -122861920;
        hr.btwx[808] = 1171557011;
        hr.btwx[809] = 477057428;
        hr.btwx[810] = 1155804277;
        hr.btwx[811] = 145500006;
        hr.btwx[812] = 769814142;
        hr.btwx[813] = -2121463655;
        hr.btwx[814] = -373951710;
        hr.btwx[815] = -355542074;
        hr.btwx[816] = -555136508;
        hr.btwx[817] = 1444026807;
        hr.btwx[818] = 1617800531;
        hr.btwx[819] = -1231834597;
        hr.btwx[820] = 2146190674;
        hr.btwx[821] = -1290750419;
        hr.btwx[822] = 1806658647;
        hr.btwx[823] = -162680873;
        hr.btwx[824] = -889380286;
        hr.btwx[825] = -2134305623;
        hr.btwx[826] = -971163196;
        hr.btwx[827] = -1614624129;
        hr.btwx[828] = 1251334267;
        hr.btwx[829] = 2034475953;
        hr.btwx[830] = -935593686;
        hr.btwx[831] = -1814478960;
        hr.btwx[832] = -1858189119;
        hr.btwx[833] = -578978909;
        hr.btwx[834] = -150264348;
        hr.btwx[835] = -1497824601;
        hr.btwx[836] = 589420400;
        hr.btwx[837] = 1139474366;
        hr.btwx[838] = -1561371836;
        hr.btwx[839] = 539773360;
        hr.btwx[840] = -1274407657;
        hr.btwx[841] = -619284889;
        hr.btwx[842] = -1099542776;
        hr.btwx[843] = 320336586;
        hr.btwx[844] = -703096397;
        hr.btwx[845] = -532180497;
        hr.btwx[846] = 1262818253;
        hr.btwx[847] = 1345520259;
        hr.btwx[848] = 305372578;
        hr.btwx[849] = -2147217932;
        hr.btwx[850] = -29426501;
        hr.btwx[851] = -1556938402;
        hr.btwx[852] = -1098750046;
        hr.btwx[853] = -1548428734;
        hr.btwx[854] = 2107315010;
        hr.btwx[855] = -1345419185;
        hr.btwx[856] = 339869692;
        hr.btwx[857] = -132585410;
        hr.btwx[858] = 1699140770;
        hr.btwx[859] = 1964395154;
        hr.btwx[860] = 77405456;
        hr.btwx[861] = 1357863195;
        hr.btwx[862] = 1371019233;
        hr.btwx[863] = -789517985;
        hr.btwx[864] = 299928979;
        hr.btwx[865] = 1413234766;
        hr.btwx[866] = 1901843547;
        hr.btwx[867] = -524840654;
        hr.btwx[868] = -1058971168;
        hr.btwx[869] = 1401140104;
        hr.btwx[870] = 247006229;
        hr.btwx[871] = 1418287025;
        hr.btwx[872] = 1593244252;
        hr.btwx[873] = -1539524108;
        hr.btwx[874] = 1001088381;
        hr.btwx[875] = -1638038862;
        hr.btwx[876] = 2112662292;
        hr.btwx[877] = -1119545411;
        hr.btwx[878] = 965686691;
        hr.btwx[879] = -525072878;
        hr.btwx[880] = 1791995283;
        hr.btwx[881] = -1471662117;
        hr.btwx[882] = -1775440994;
        hr.btwx[883] = 1159048847;
        hr.btwx[884] = -61998600;
        hr.btwx[885] = 1458021955;
        hr.btwx[886] = 886175600;
        hr.btwx[887] = -1966448645;
        hr.btwx[888] = -1956161021;
        hr.btwx[889] = 1441454883;
        hr.btwx[890] = -1648616425;
        hr.btwx[891] = 92347320;
        hr.btwx[892] = -965976689;
        hr.btwx[893] = -355418522;
        hr.btwx[894] = -222218267;
        hr.btwx[895] = -1948508067;
        hr.btwx[896] = -224514024;
        hr.btwx[897] = 1113204442;
        hr.btwx[898] = -1682849872;
        hr.btwx[899] = -189368319;
    }

    private static /* synthetic */ void bxdn() {
        hr.btwz[300] = -1367078629;
        hr.btwz[301] = -746854663;
        hr.btwz[302] = -1374936859;
        hr.btwz[303] = -1849911318;
        hr.btwz[304] = 1397276290;
        hr.btwz[305] = 907290370;
        hr.btwz[306] = -1590545349;
        hr.btwz[307] = 2069512458;
        hr.btwz[308] = -60032334;
        hr.btwz[309] = -20619639;
        hr.btwz[310] = 1853213499;
        hr.btwz[311] = 2053970275;
        hr.btwz[312] = 2138488627;
        hr.btwz[313] = -757747243;
        hr.btwz[314] = -2143909288;
        hr.btwz[315] = -684191554;
        hr.btwz[316] = 1367577061;
        hr.btwz[317] = 284406132;
        hr.btwz[318] = -867468724;
        hr.btwz[319] = 994675169;
        hr.btwz[320] = -2129105580;
        hr.btwz[321] = -1876916266;
        hr.btwz[322] = 578171644;
        hr.btwz[323] = -2079163054;
        hr.btwz[324] = 1550557680;
        hr.btwz[325] = 1562103988;
        hr.btwz[326] = -95296988;
        hr.btwz[327] = -1146572507;
        hr.btwz[328] = 365158823;
        hr.btwz[329] = 367773465;
        hr.btwz[330] = 782841371;
        hr.btwz[331] = -493170338;
        hr.btwz[332] = 1457150454;
        hr.btwz[333] = 1540215349;
        hr.btwz[334] = -708067589;
        hr.btwz[335] = 266697096;
        hr.btwz[336] = -1655768396;
        hr.btwz[337] = 2064338144;
        hr.btwz[338] = 1563477520;
        hr.btwz[339] = -1189657302;
        hr.btwz[340] = -1935692722;
        hr.btwz[341] = 1727586267;
        hr.btwz[342] = -1807230418;
        hr.btwz[343] = -2093942185;
        hr.btwz[344] = -1746938603;
        hr.btwz[345] = -333238189;
        hr.btwz[346] = 1824164592;
        hr.btwz[347] = -1187782321;
        hr.btwz[348] = 693791926;
        hr.btwz[349] = -2039795782;
        hr.btwz[350] = -932683629;
        hr.btwz[351] = -1946467023;
        hr.btwz[352] = 1415918038;
        hr.btwz[353] = 535073799;
        hr.btwz[354] = 755425480;
        hr.btwz[355] = 644589183;
        hr.btwz[356] = 1683077590;
        hr.btwz[357] = 1731100886;
        hr.btwz[358] = -1417666389;
        hr.btwz[359] = 325738627;
        hr.btwz[360] = -1637510152;
        hr.btwz[361] = 1598314648;
        hr.btwz[362] = 329125987;
        hr.btwz[363] = 1951528338;
        hr.btwz[364] = -2037899413;
        hr.btwz[365] = 1853281609;
        hr.btwz[366] = -2023966620;
        hr.btwz[367] = 1835487371;
        hr.btwz[368] = -2059972996;
        hr.btwz[369] = -1815005085;
        hr.btwz[370] = 574953974;
        hr.btwz[371] = 1491929850;
        hr.btwz[372] = -937723340;
        hr.btwz[373] = -178441953;
        hr.btwz[374] = 1973853066;
        hr.btwz[375] = 1918964891;
        hr.btwz[376] = 219257561;
        hr.btwz[377] = -1215651434;
        hr.btwz[378] = 336805740;
        hr.btwz[379] = 594861791;
        hr.btwz[380] = -29936575;
        hr.btwz[381] = -1465752194;
        hr.btwz[382] = -1766567836;
        hr.btwz[383] = -107507047;
        hr.btwz[384] = -2112229744;
        hr.btwz[385] = 264899318;
        hr.btwz[386] = 1632203128;
        hr.btwz[387] = 853781492;
        hr.btwz[388] = -854301003;
        hr.btwz[389] = -168202613;
        hr.btwz[390] = 1314753053;
        hr.btwz[391] = 1827477310;
        hr.btwz[392] = -443808073;
        hr.btwz[393] = -2067871172;
        hr.btwz[394] = -953339496;
        hr.btwz[395] = 456537159;
        hr.btwz[396] = -1587120330;
        hr.btwz[397] = 1542568678;
        hr.btwz[398] = -2073285042;
        hr.btwz[399] = -1185236637;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean hasPearl() {
        block93: {
            block94: {
                v0 /* !! */  = hr.ei;
                if (true) ** GOTO lbl5
                block65: while (true) {
                    v0 /* !! */  = (long)(v1 - hr.btxb("bwie", btxi(int ), (int)280));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -981751618: {
                            v1 = hr.btxb("bwif", btxi(int ), (int)281);
                            continue block65;
                        }
                        case -694277911: {
                            v1 = hr.btxb("bwig", btxi(int ), (int)282);
                            continue block65;
                        }
                        case 2083520731: {
                            break block65;
                        }
                    }
                    break;
                }
                var3_1 = hr.c;
                v2 /* !! */  = hr.ei;
                if (true) ** GOTO lbl19
                block66: while (true) {
                    v2 /* !! */  = (long)(v3 - hr.btxb("bwih", btxi(int ), (int)283));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 519231490: {
                            v3 = hr.btxb("bwii", btxi(int ), (int)284);
                            continue block66;
                        }
                        case 1794222105: {
                            v3 = hr.btxb("bwij", btxi(int ), (int)285);
                            continue block66;
                        }
                        case 2083520731: {
                            break block66;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = hr.b;
                v4 /* !! */  = hr.ei;
                if (true) ** GOTO lbl33
                block67: while (true) {
                    v4 /* !! */  = (long)(v5 - hr.btxb("bwik", btxi(int ), (int)286));
lbl33:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1699374353: {
                            v5 = hr.btxb("bwil", btxi(int ), (int)287);
                            continue block67;
                        }
                        case -922964615: {
                            v5 = hr.btxb("bwim", btxi(int ), (int)288);
                            continue block67;
                        }
                        case 529703854: {
                            v5 = hr.btxb("bwin", btxi(int ), (int)289);
                            continue block67;
                        }
                        case 2083520731: {
                            break block67;
                        }
                    }
                    break;
                }
                var1_3 = hr.a;
                if (var3_1) {
                    throw null;
                }
                if (!var1_3 && !var1_3) ** GOTO lbl84
                block68: while (true) {
                    if (var2_2 /* !! */  == 0) return (boolean)hr.btxb("bwio", btwu(int ), (int)824);
                    cfr_temp_0 = -2147483648;
lbl52:
                    // 2 sources

                    block69: while (true) {
                        switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                            default: {
                                return (boolean)hr.btxb("bwio", btwu(int ), (int)824);
                            }
                            case 0: {
                                ** GOTO lbl216
                            }
                            case 5: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkh", btwu(int ), (int)843);
                                if (var3_1) {
                                    throw null;
                                }
                            }
                            case 3: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkf", btwu(int ), (int)841);
                                cfr_temp_0 = 2;
                                if (!var3_1) continue block69;
                                throw null;
                            }
                            case 6: {
                                var2_2 /* !! */  = (int)hr.btxb("bwki", btwu(int ), (int)844);
                                cfr_temp_0 = 2;
                                if (!var3_1) continue block69;
                                throw null;
                            }
                            case 8: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkk", btwu(int ), (int)846);
                                if (var3_1) {
                                    throw null;
                                }
                                break block93;
                            }
                            case 9: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkl", btwu(int ), (int)847);
                                cfr_temp_0 = 1;
                                if (!var3_1) continue block69;
                                throw null;
                            }
                            case 11: {
                                break block93;
                            }
lbl84:
                            // 1 sources

                            while (true) {
                                if ((v6 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwip", btxi(int ), (int)290)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                                if (v6 /* !! */  == hr.btxb("bwiq", btwu(int ), (int)825)) break;
                                v6 /* !! */  = (long)hr.btxb("bwir", btwu(int ), (int)826);
                            }
                            while (true) {
                                if ((v7 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwis", btxi(int ), (int)291)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                                if (v7 /* !! */  == hr.btxb("bwit", btwu(int ), (int)827)) break;
                                v7 /* !! */  = (long)hr.btxb("bwiu", btwu(int ), (int)828);
                            }
                            v8 = hr.mc.field_1724;
                            v9 /* !! */  = hr.ei;
                            block72: while (true) {
                                switch ((int)v9 /* !! */ ) {
                                    case -1030424063: {
                                        v9 /* !! */  = (long)(hr.btxb("bwiw", btxi(int ), (int)293) - hr.btxb("bwiv", btxi(int ), (int)292));
                                        continue block72;
                                    }
                                    case 2083520731: {
                                        break block72;
                                    }
                                }
                                break;
                            }
                            v10 = v8.method_6047();
                            v11 /* !! */  = hr.ei;
                            if (true) ** GOTO lbl108
                            block73: while (true) {
                                v11 /* !! */  = (long)(v12 - hr.btxb("bwix", btxi(int ), (int)294));
lbl108:
                                // 2 sources

                                switch ((int)v11 /* !! */ ) {
                                    case 1092362105: {
                                        v12 = hr.btxb("bwiy", btxi(int ), (int)295);
                                        continue block73;
                                    }
                                    case 1971084095: {
                                        v12 = hr.btxb("bwiz", btxi(int ), (int)296);
                                        continue block73;
                                    }
                                    case 2083520731: {
                                        break block73;
                                    }
                                }
                                break;
                            }
                            v13 /* !! */  = hr.ei;
                            if (true) ** GOTO lbl121
                            block74: while (true) {
                                v13 /* !! */  = (long)(v14 - hr.btxb("bwja", btxi(int ), (int)297));
lbl121:
                                // 2 sources

                                switch ((int)v13 /* !! */ ) {
                                    case -790128385: {
                                        v14 = hr.btxb("bwjb", btxi(int ), (int)298);
                                        continue block74;
                                    }
                                    case -607682084: {
                                        v14 = hr.btxb("bwjc", btxi(int ), (int)299);
                                        continue block74;
                                    }
                                    case -386637647: {
                                        v14 = hr.btxb("bwjd", btxi(int ), (int)300);
                                        continue block74;
                                    }
                                    case 2083520731: {
                                        break block74;
                                    }
                                }
                                break;
                            }
                            if (v10.method_31574(class_1802.field_8634)) ** GOTO lbl208
                            if (var1_3) continue block68;
                            v15 /* !! */  = hr.ei;
                            if (true) ** GOTO lbl139
                            block75: while (true) {
                                v15 /* !! */  = (long)(v16 - hr.btxb("bwje", btxi(int ), (int)301));
lbl139:
                                // 2 sources

                                switch ((int)v15 /* !! */ ) {
                                    case 542649275: {
                                        v16 = hr.btxb("bwjf", btxi(int ), (int)302);
                                        continue block75;
                                    }
                                    case 1085273014: {
                                        v16 = hr.btxb("bwjg", btxi(int ), (int)303);
                                        continue block75;
                                    }
                                    case 2083520731: {
                                        break block75;
                                    }
                                }
                                break;
                            }
                            while (true) {
                                if ((v17 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bwjh", btxi(int ), (int)304)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                if (v17 /* !! */  != hr.btxb("bwji", btwu(int ), (int)829)) ** GOTO lbl154
                                v18 = hr.mc.field_1724;
                                v19 /* !! */  = hr.ei;
                                if (true) ** GOTO lbl158
lbl154:
                                // 1 sources

                                v17 /* !! */  = (long)hr.btxb("bwjj", btwu(int ), (int)830);
                            }
                            block77: while (true) {
                                v19 /* !! */  = (long)(v20 - hr.btxb("bwjk", btxi(int ), (int)305));
lbl158:
                                // 2 sources

                                switch ((int)v19 /* !! */ ) {
                                    case -846267122: {
                                        v20 = hr.btxb("bwjl", btxi(int ), (int)306);
                                        continue block77;
                                    }
                                    case -406235129: {
                                        v20 = hr.btxb("bwjm", btxi(int ), (int)307);
                                        continue block77;
                                    }
                                    case 673780790: {
                                        v20 = hr.btxb("bwjn", btxi(int ), (int)308);
                                        continue block77;
                                    }
                                    case 2083520731: {
                                        break block77;
                                    }
                                }
                                break;
                            }
                            v21 = v18.method_6079();
                            v22 /* !! */  = hr.ei;
                            if (true) ** GOTO lbl175
                            block78: while (true) {
                                v22 /* !! */  = (long)(v23 - hr.btxb("bwjo", btxi(int ), (int)309));
lbl175:
                                // 2 sources

                                switch ((int)v22 /* !! */ ) {
                                    case 260100207: {
                                        v23 = hr.btxb("bwjp", btxi(int ), (int)310);
                                        continue block78;
                                    }
                                    case 777051844: {
                                        v23 = hr.btxb("bwjq", btxi(int ), (int)311);
                                        continue block78;
                                    }
                                    case 2083520731: {
                                        break block78;
                                    }
                                }
                                break;
                            }
                            v24 /* !! */  = hr.ei;
                            block79: while (true) {
                                switch ((int)v24 /* !! */ ) {
                                    case -1794134951: {
                                        v24 /* !! */  = (long)(hr.btxb("bwjs", btxi(int ), (int)313) - hr.btxb("bwjr", btxi(int ), (int)312));
                                        continue block79;
                                    }
                                    case 2083520731: {
                                        break block79;
                                    }
                                }
                                break;
                            }
                            if (v21.method_31574(class_1802.field_8634)) ** GOTO lbl208
                            if (var1_3) continue block68;
                            while (true) {
                                if ((v25 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bwjt", btxi(int ), (int)314)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                                if (v25 /* !! */  == hr.btxb("bwju", btwu(int ), (int)831)) break;
                                v25 /* !! */  = (long)hr.btxb("bwjv", btwu(int ), (int)832);
                            }
                            while (true) {
                                if ((v26 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bwjw", btxi(int ), (int)315)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                                if (v26 /* !! */  != hr.btxb("bwjx", btwu(int ), (int)833)) ** GOTO lbl205
                                if (nv.findHotbarItem(class_1802.field_8634) != hr.btxb("bwjz", btwu(int ), (int)835)) {
                                    break;
                                }
                                ** GOTO lbl212
lbl205:
                                // 1 sources

                                v26 /* !! */  = (long)hr.btxb("bwjy", btwu(int ), (int)834);
                            }
                            if (var1_3) continue block68;
lbl208:
                            // 3 sources

                            if (var1_3 || var1_3) continue block68;
                            v27 = hr.btxb("bwka", btwu(int ), (int)836);
                            if (!var3_1) return (boolean)v27;
                            throw null;
lbl212:
                            // 1 sources

                            if (!var1_3 && !var1_3) ** break;
                            continue block68;
                            v27 = hr.btxb("bwkb", btwu(int ), (int)837);
                            return (boolean)v27;
lbl216:
                            // 2 sources

                            while (true) {
                                var2_2 /* !! */  = (int)hr.btxb("bwkc", btwu(int ), (int)838);
                                cfr_temp_0 = 7;
                                if (!var3_1) continue block69;
                                throw null;
                            }
                            case 7: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkj", btwu(int ), (int)845);
                                if (var3_1) {
                                    throw null;
                                }
                            }
                            case 2: {
                                var2_2 /* !! */  = (int)hr.btxb("bwke", btwu(int ), (int)840);
                                if (var3_1) {
                                    throw null;
                                }
                            }
                            case 4: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkg", btwu(int ), (int)842);
                                if (var3_1) {
                                    throw null;
                                }
                            }
                            case 1: {
                                var2_2 /* !! */  = (int)hr.btxb("bwkd", btwu(int ), (int)839);
                                if (var3_1) {
                                    throw null;
                                }
                            }
                            case 10: 
                        }
                        break;
                    }
                    break;
                }
                break block94;
                ** while (true)
            }
            var2_2 /* !! */  = (int)hr.btxb("bwkm", btwu(int ), (int)848);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)hr.btxb("bwkn", btwu(int ), (int)849);
        ** while (!var3_1)
lbl247:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdt() {
        hr.btwz[900] = 1759120606;
        hr.btwz[901] = -2095405078;
        hr.btwz[902] = 1454901629;
        hr.btwz[903] = 235256859;
        hr.btwz[904] = 978823993;
        hr.btwz[905] = -1120390336;
        hr.btwz[906] = -802517899;
        hr.btwz[907] = -1927272421;
        hr.btwz[908] = -599137057;
        hr.btwz[909] = 1933639359;
        hr.btwz[910] = -1507053224;
        hr.btwz[911] = -309081130;
        hr.btwz[912] = -1893973197;
        hr.btwz[913] = -1524425077;
        hr.btwz[914] = -1168974203;
        hr.btwz[915] = 1942072532;
        hr.btwz[916] = -1567859887;
        hr.btwz[917] = -1200609086;
        hr.btwz[918] = 2120255557;
        hr.btwz[919] = 53622203;
        hr.btwz[920] = -955432839;
        hr.btwz[921] = 259475399;
        hr.btwz[922] = -1640828835;
        hr.btwz[923] = 2058563026;
        hr.btwz[924] = -1291543376;
        hr.btwz[925] = -1198426604;
        hr.btwz[926] = 919367562;
        hr.btwz[927] = 1485935615;
        hr.btwz[928] = -784874830;
        hr.btwz[929] = -1366703779;
        hr.btwz[930] = 205186008;
        hr.btwz[931] = -1250127731;
        hr.btwz[932] = -783108497;
        hr.btwz[933] = 379853813;
        hr.btwz[934] = -1356752501;
        hr.btwz[935] = -555847609;
        hr.btwz[936] = 336145430;
        hr.btwz[937] = 101691658;
        hr.btwz[938] = 2090184376;
        hr.btwz[939] = -75174843;
        hr.btwz[940] = 1391526012;
        hr.btwz[941] = 265950404;
        hr.btwz[942] = 1190220068;
        hr.btwz[943] = -2104530759;
        hr.btwz[944] = -1622260997;
        hr.btwz[945] = -462439497;
        hr.btwz[946] = 226951852;
        hr.btwz[947] = 1799156289;
        hr.btwz[948] = 1378795870;
        hr.btwz[949] = -147199871;
        hr.btwz[950] = -27664432;
        hr.btwz[951] = -137416107;
        hr.btwz[952] = 1224516622;
        hr.btwz[953] = 61271266;
        hr.btwz[954] = 726768350;
        hr.btwz[955] = -1784129529;
        hr.btwz[956] = -1578762186;
        hr.btwz[957] = -1307678611;
        hr.btwz[958] = 899063475;
        hr.btwz[959] = -211417258;
        hr.btwz[960] = -1117934228;
        hr.btwz[961] = 443923913;
        hr.btwz[962] = 1504683752;
        hr.btwz[963] = -812654384;
        hr.btwz[964] = -44660227;
        hr.btwz[965] = 799829636;
        hr.btwz[966] = -660450728;
        hr.btwz[967] = -1339931147;
        hr.btwz[968] = -217116562;
        hr.btwz[969] = 2019452682;
        hr.btwz[970] = 59263264;
        hr.btwz[971] = -1131662768;
        hr.btwz[972] = 2052213974;
        hr.btwz[973] = -724989409;
        hr.btwz[974] = -1118905529;
        hr.btwz[975] = -1561156440;
        hr.btwz[976] = 1211299737;
        hr.btwz[977] = 869015731;
        hr.btwz[978] = 1307574563;
        hr.btwz[979] = -936327686;
        hr.btwz[980] = -1112360655;
        hr.btwz[981] = -539670557;
        hr.btwz[982] = 461507388;
        hr.btwz[983] = -1727388310;
        hr.btwz[984] = 903707757;
        hr.btwz[985] = -482623631;
        hr.btwz[986] = -1163925401;
        hr.btwz[987] = 670467795;
        hr.btwz[988] = 717943978;
        hr.btwz[989] = -127482388;
        hr.btwz[990] = -1307073821;
        hr.btwz[991] = -784958718;
        hr.btwz[992] = 1045104993;
        hr.btwz[993] = -405471741;
        hr.btwz[994] = -995889613;
        hr.btwz[995] = -781073836;
        hr.btwz[996] = 760895100;
        hr.btwz[997] = 375111782;
    }

    private static /* synthetic */ void bxdu() {
        hr.btxj[0] = 4565274038873172957L;
        hr.btxj[1] = 1619189893662791921L;
        hr.btxj[2] = -2507429007246656357L;
        hr.btxj[3] = 2851196733299520024L;
        hr.btxj[4] = 5641285142103160454L;
        hr.btxj[5] = -8520338916003908673L;
        hr.btxj[6] = 2090722240098201345L;
        hr.btxj[7] = 1915414249481848297L;
        hr.btxj[8] = -7277947856875875771L;
        hr.btxj[9] = 5477157931588706812L;
        hr.btxj[10] = -2993647471487146878L;
        hr.btxj[11] = -7569481086486027906L;
        hr.btxj[12] = 7521387217704269641L;
        hr.btxj[13] = -6725099660213610735L;
        hr.btxj[14] = -7600359933793922039L;
        hr.btxj[15] = -1287633129929473951L;
        hr.btxj[16] = 9149138536926003657L;
        hr.btxj[17] = 2489685493782588661L;
        hr.btxj[18] = -3802995906775465262L;
        hr.btxj[19] = 67651348415872866L;
        hr.btxj[20] = -3515603297530684328L;
        hr.btxj[21] = 3948491974815373946L;
        hr.btxj[22] = -7842447994453103850L;
        hr.btxj[23] = -307224066570527862L;
        hr.btxj[24] = 140825088674212248L;
        hr.btxj[25] = 4449247937306231758L;
        hr.btxj[26] = 6009306318666059289L;
        hr.btxj[27] = -7787541894485729063L;
        hr.btxj[28] = 2316803860119665538L;
        hr.btxj[29] = -1640367724900961977L;
        hr.btxj[30] = -28580297163311662L;
        hr.btxj[31] = 5784597638517796284L;
        hr.btxj[32] = -8519333298438416411L;
        hr.btxj[33] = 7877387675163408796L;
        hr.btxj[34] = -2042973472601634857L;
        hr.btxj[35] = 881256149289469246L;
        hr.btxj[36] = -8600289606232634896L;
        hr.btxj[37] = 6041312148502246902L;
        hr.btxj[38] = -6209060332068600116L;
        hr.btxj[39] = -5605142637950667068L;
        hr.btxj[40] = -4861596241624530389L;
        hr.btxj[41] = 8528458536586582577L;
        hr.btxj[42] = -1344448335140159466L;
        hr.btxj[43] = -8689769086511136344L;
        hr.btxj[44] = -1171843539879850693L;
        hr.btxj[45] = 8321270302395149046L;
        hr.btxj[46] = 4156573476307502581L;
        hr.btxj[47] = -2415517729115798814L;
        hr.btxj[48] = -8180365648527803428L;
        hr.btxj[49] = -3275755308645177397L;
        hr.btxj[50] = 5187318343587748500L;
        hr.btxj[51] = 5126375807443080474L;
        hr.btxj[52] = 5945505745468094793L;
        hr.btxj[53] = -5502000784498567290L;
        hr.btxj[54] = 6463618199151732349L;
        hr.btxj[55] = -790885527715698734L;
        hr.btxj[56] = 8375901346233829045L;
        hr.btxj[57] = -446783047384467992L;
        hr.btxj[58] = -2009601833956354533L;
        hr.btxj[59] = -5991378999089697138L;
        hr.btxj[60] = -5998252896763190977L;
        hr.btxj[61] = -3877294439101181459L;
        hr.btxj[62] = -6622751184560643130L;
        hr.btxj[63] = -6327495680005201917L;
        hr.btxj[64] = 7270371419920756524L;
        hr.btxj[65] = -572299666507658250L;
        hr.btxj[66] = 8293853375428863496L;
        hr.btxj[67] = -2985086097469656878L;
        hr.btxj[68] = 7204867768005204511L;
        hr.btxj[69] = -7375194079516274294L;
        hr.btxj[70] = 8493953677964190051L;
        hr.btxj[71] = 965792241959295888L;
        hr.btxj[72] = 9191650603970877690L;
        hr.btxj[73] = -6535982944397954593L;
        hr.btxj[74] = 9071572316746108420L;
        hr.btxj[75] = -1547581987567697912L;
        hr.btxj[76] = -7187278495014814759L;
        hr.btxj[77] = -3084959855200402426L;
        hr.btxj[78] = -2979980888536479658L;
        hr.btxj[79] = 9103385136790347968L;
        hr.btxj[80] = 2123392976292239768L;
        hr.btxj[81] = -371897964821421591L;
        hr.btxj[82] = 4385497865016590842L;
        hr.btxj[83] = -8873520010883982967L;
        hr.btxj[84] = -518711593061273140L;
        hr.btxj[85] = 4461760967591273653L;
        hr.btxj[86] = -7240899163632767735L;
        hr.btxj[87] = -7290244964041553627L;
        hr.btxj[88] = -3414446614589064322L;
        hr.btxj[89] = 4882585233417776878L;
        hr.btxj[90] = 4581817183113301542L;
        hr.btxj[91] = -8654326043260450716L;
        hr.btxj[92] = 943172938074318302L;
        hr.btxj[93] = -8357932823889094962L;
        hr.btxj[94] = 8976510921044008412L;
        hr.btxj[95] = 9146846753781366095L;
        hr.btxj[96] = -1205675111279220802L;
        hr.btxj[97] = 6036665536869103252L;
        hr.btxj[98] = 7147933799164714266L;
        hr.btxj[99] = 2426260543365189218L;
    }

    private static /* synthetic */ void bxdg() {
        hr.btwx[600] = -678857566;
        hr.btwx[601] = -1477213599;
        hr.btwx[602] = -1913031215;
        hr.btwx[603] = 613436184;
        hr.btwx[604] = -820243615;
        hr.btwx[605] = 854313968;
        hr.btwx[606] = -1204091312;
        hr.btwx[607] = 1800498217;
        hr.btwx[608] = 612117417;
        hr.btwx[609] = -37891199;
        hr.btwx[610] = 70857871;
        hr.btwx[611] = 1377173523;
        hr.btwx[612] = -69152492;
        hr.btwx[613] = -1406693616;
        hr.btwx[614] = -2135122990;
        hr.btwx[615] = 1089531426;
        hr.btwx[616] = -1784735482;
        hr.btwx[617] = -522027291;
        hr.btwx[618] = 45166950;
        hr.btwx[619] = 1427209857;
        hr.btwx[620] = 618308898;
        hr.btwx[621] = -1107218392;
        hr.btwx[622] = 1912697809;
        hr.btwx[623] = 917409362;
        hr.btwx[624] = -772079417;
        hr.btwx[625] = -891844614;
        hr.btwx[626] = 470896251;
        hr.btwx[627] = -1768859898;
        hr.btwx[628] = 952501458;
        hr.btwx[629] = 1446825332;
        hr.btwx[630] = 1036046815;
        hr.btwx[631] = -1579602337;
        hr.btwx[632] = 1960291609;
        hr.btwx[633] = -1673311256;
        hr.btwx[634] = 1419089490;
        hr.btwx[635] = -2011600704;
        hr.btwx[636] = 304885556;
        hr.btwx[637] = -1687570006;
        hr.btwx[638] = -70806691;
        hr.btwx[639] = 874523043;
        hr.btwx[640] = 1399042696;
        hr.btwx[641] = 1471530508;
        hr.btwx[642] = -1430413735;
        hr.btwx[643] = 1290875958;
        hr.btwx[644] = -2093973611;
        hr.btwx[645] = -1690692050;
        hr.btwx[646] = -1467450174;
        hr.btwx[647] = 1913299090;
        hr.btwx[648] = -1407601155;
        hr.btwx[649] = 1122643589;
        hr.btwx[650] = -1117338430;
        hr.btwx[651] = 654548731;
        hr.btwx[652] = -775298883;
        hr.btwx[653] = -742189659;
        hr.btwx[654] = 1967848204;
        hr.btwx[655] = 1358144719;
        hr.btwx[656] = 1925315562;
        hr.btwx[657] = 125282415;
        hr.btwx[658] = 2013307948;
        hr.btwx[659] = 1980936482;
        hr.btwx[660] = 1438564595;
        hr.btwx[661] = 356250059;
        hr.btwx[662] = -601604627;
        hr.btwx[663] = -202800621;
        hr.btwx[664] = 749160383;
        hr.btwx[665] = 322632727;
        hr.btwx[666] = -454208521;
        hr.btwx[667] = 343074870;
        hr.btwx[668] = 1958304418;
        hr.btwx[669] = 200732035;
        hr.btwx[670] = 1057563206;
        hr.btwx[671] = -1392667058;
        hr.btwx[672] = -770111485;
        hr.btwx[673] = 1888183872;
        hr.btwx[674] = 834108686;
        hr.btwx[675] = -995093298;
        hr.btwx[676] = 1764641397;
        hr.btwx[677] = -641307375;
        hr.btwx[678] = -297603595;
        hr.btwx[679] = -1970881975;
        hr.btwx[680] = -208349073;
        hr.btwx[681] = 2123133293;
        hr.btwx[682] = -66569013;
        hr.btwx[683] = -1380069867;
        hr.btwx[684] = 1578071054;
        hr.btwx[685] = 440407850;
        hr.btwx[686] = -237971373;
        hr.btwx[687] = 1712863819;
        hr.btwx[688] = 305220550;
        hr.btwx[689] = -366025245;
        hr.btwx[690] = 830919490;
        hr.btwx[691] = 898985875;
        hr.btwx[692] = -293258277;
        hr.btwx[693] = -376435851;
        hr.btwx[694] = 411067903;
        hr.btwx[695] = 915477667;
        hr.btwx[696] = 940301918;
        hr.btwx[697] = 164504756;
        hr.btwx[698] = -1631153205;
        hr.btwx[699] = 1554492391;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 checkTrajectory(float var1_1, float var2_2) {
        var25_3 = hr.c;
        var24_4 /* !! */  = hr.b;
        var23_5 = hr.a;
        if (var25_3) {
            throw null;
lbl6:
            // 27 sources

            return null;
        }
        if (var23_5 || var23_5) ** GOTO lbl6
        var3_6 = (float)Math.toRadians(var1_1);
        if (var23_5 || var23_5) ** GOTO lbl6
        var4_7 = (float)Math.toRadians(var2_2);
        if (var23_5 || var23_5) ** GOTO lbl6
        var5_8 = hr.btxb("bwav", buso(int ), (int)218);
        if (var23_5 || var23_5) ** GOTO lbl6
        var7_9 = hr.mc.field_1724.method_23317() - (double)(class_3532.method_15362((double)var3_6) * hr.btxb("bwaw", bubr(int ), (int)695));
        if (var23_5 || var23_5) ** GOTO lbl6
        var9_10 = hr.mc.field_1724.method_23318() + (double)hr.mc.field_1724.method_18381(hr.mc.field_1724.method_18376()) - hr.btxb("bwax", buso(int ), (int)219);
        if (var23_5 || var23_5) ** GOTO lbl6
        var11_11 = hr.mc.field_1724.method_23321() - (double)(class_3532.method_15374((double)var3_6) * hr.btxb("bway", bubr(int ), (int)696));
        if (var23_5 || var23_5) ** GOTO lbl6
        var13_12 = (double)(-class_3532.method_15374((double)var3_6) * class_3532.method_15362((double)var4_7)) * var5_8;
        if (var23_5 || var23_5) ** GOTO lbl6
        var15_13 = (double)(-class_3532.method_15374((double)var4_7)) * var5_8;
        if (var23_5 || var23_5) ** GOTO lbl6
        var17_14 = (double)(class_3532.method_15362((double)var3_6) * class_3532.method_15362((double)var4_7)) * var5_8;
        if (var23_5 || var23_5) ** GOTO lbl6
        var19_15 = new class_243(var7_9, var9_10, var11_11);
        if (var23_5 || var23_5) ** GOTO lbl6
        var20_16 = new class_243(var13_12, var15_13, var17_14);
        if (var23_5 || var23_5) ** GOTO lbl6
        var21_17 = hr.btxb("bwaz", btwu(int ), (int)697);
        if (var23_5) ** GOTO lbl6
        block55: while (true) {
            if (var23_5 || var23_5) ** GOTO lbl6
            if (var21_17 > hr.btxb("bwba", btwu(int ), (int)698)) ** GOTO lbl62
            if (var23_5 || var23_5) ** GOTO lbl6
            var22_18 = var19_15;
            if (var23_5 || var23_5) ** GOTO lbl6
            var19_15 = var19_15.method_1019(var20_16);
            if (var23_5 || var23_5) ** GOTO lbl6
            var20_16 = this.updatePearlMotion(var20_16, var19_15);
            if (var23_5) ** GOTO lbl6
            if (var24_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var24_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var23_5) ** GOTO lbl6
                    if (!this.hitsEntity(var22_18, var19_15)) ** GOTO lbl50
                    if (var23_5 || var23_5) ** GOTO lbl6
                    return null;
lbl50:
                    // 1 sources

                    if (var23_5 || var23_5) ** GOTO lbl6
                    if (this.hitsBlock(var22_18, var19_15)) ** GOTO lbl55
                    if (var23_5) ** GOTO lbl6
                    if (!(var19_15.field_1351 <= (double)hr.mc.field_1687.method_31607())) ** GOTO lbl57
                    if (var23_5) ** GOTO lbl6
lbl55:
                    // 2 sources

                    if (var23_5 || var23_5) ** GOTO lbl6
                    return new class_243((double)class_3532.method_15357((double)var19_15.field_1352) + hr.btxb("bwbb", buso(int ), (int)220), (double)class_3532.method_15357((double)var19_15.field_1351), (double)class_3532.method_15357((double)var19_15.field_1350) + hr.btxb("bwbc", buso(int ), (int)221));
lbl57:
                    // 1 sources

                    if (var23_5 || var23_5) ** GOTO lbl6
                    ++var21_17;
                    if (var23_5) ** GOTO lbl6
                    if (!var25_3) continue block55;
                    throw null;
                }
lbl62:
                // 1 sources

                if (!var23_5 && !var23_5) ** break;
                ** continue;
                return null;
lbl65:
                // 2 sources

                case 0: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbd", btwu(int ), (int)699);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl70:
                // 2 sources

                case 1: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbe", btwu(int ), (int)700);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl251
                }
lbl75:
                // 2 sources

                case 2: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbf", btwu(int ), (int)701);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
lbl80:
                // 3 sources

                case 3: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbg", btwu(int ), (int)702);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
                case 4: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbh", btwu(int ), (int)703);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl95
                }
                case 5: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbi", btwu(int ), (int)704);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
lbl95:
                // 2 sources

                case 6: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbj", btwu(int ), (int)705);
                    if (!var25_3) ** GOTO lbl75
                    throw null;
                }
lbl99:
                // 3 sources

                case 7: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbk", btwu(int ), (int)706);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
                case 8: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbl", btwu(int ), (int)707);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl190
                }
lbl109:
                // 3 sources

                case 9: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbm", btwu(int ), (int)708);
                    if (!var25_3) ** GOTO lbl65
                    throw null;
                }
lbl113:
                // 4 sources

                case 10: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbn", btwu(int ), (int)709);
                    if (!var25_3) ** GOTO lbl99
                    throw null;
                }
                case 11: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbo", btwu(int ), (int)710);
                    if (!var25_3) ** GOTO lbl80
                    throw null;
                }
lbl121:
                // 3 sources

                case 12: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbp", btwu(int ), (int)711);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl280
                }
lbl126:
                // 2 sources

                case 13: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbq", btwu(int ), (int)712);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl211
                }
lbl131:
                // 3 sources

                case 14: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbr", btwu(int ), (int)713);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl136:
                // 3 sources

                case 15: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbs", btwu(int ), (int)714);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
lbl141:
                // 2 sources

                case 16: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbt", btwu(int ), (int)715);
                    if (!var25_3) ** GOTO lbl113
                    throw null;
                }
lbl145:
                // 2 sources

                case 17: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbu", btwu(int ), (int)716);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl150:
                // 2 sources

                case 18: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbv", btwu(int ), (int)717);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl164
                }
lbl155:
                // 2 sources

                case 19: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbw", btwu(int ), (int)718);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl160:
                // 2 sources

                case 20: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbx", btwu(int ), (int)719);
                    if (!var25_3) ** GOTO lbl113
                    throw null;
                }
lbl164:
                // 2 sources

                case 21: {
                    var24_4 /* !! */  = (int)hr.btxb("bwby", btwu(int ), (int)720);
                    if (!var25_3) ** GOTO lbl131
                    throw null;
                }
lbl168:
                // 2 sources

                case 22: {
                    var24_4 /* !! */  = (int)hr.btxb("bwbz", btwu(int ), (int)721);
                    if (!var25_3) ** GOTO lbl109
                    throw null;
                }
lbl172:
                // 2 sources

                case 23: {
                    var24_4 /* !! */  = (int)hr.btxb("bwca", btwu(int ), (int)722);
                    if (!var25_3) ** GOTO lbl109
                    throw null;
                }
lbl176:
                // 2 sources

                case 24: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcb", btwu(int ), (int)723);
                    if (!var25_3) ** GOTO lbl131
                    throw null;
                }
                case 25: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcc", btwu(int ), (int)724);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
lbl185:
                // 2 sources

                case 26: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcd", btwu(int ), (int)725);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
lbl190:
                // 2 sources

                case 27: {
                    var24_4 /* !! */  = (int)hr.btxb("bwce", btwu(int ), (int)726);
                    if (!var25_3) ** GOTO lbl70
                    throw null;
                }
lbl194:
                // 2 sources

                case 28: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcf", btwu(int ), (int)727);
                    if (!var25_3) ** GOTO lbl155
                    throw null;
                }
lbl198:
                // 2 sources

                case 29: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcg", btwu(int ), (int)728);
                    if (!var25_3) ** GOTO lbl172
                    throw null;
                }
lbl202:
                // 2 sources

                case 30: {
                    var24_4 /* !! */  = (int)hr.btxb("bwch", btwu(int ), (int)729);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
                case 31: {
                    var24_4 /* !! */  = (int)hr.btxb("bwci", btwu(int ), (int)730);
                    if (!var25_3) ** GOTO lbl121
                    throw null;
                }
lbl211:
                // 2 sources

                case 32: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var24_4 /* !! */  = (int)hr.btxb("bwcj", btwu(int ), (int)731);
                        if (!var25_3) ** GOTO lbl141
                        throw null;
                    }
                }
                case 33: {
                    var24_4 /* !! */  = (int)hr.btxb("bwck", btwu(int ), (int)732);
                    if (!var25_3) ** GOTO lbl80
                    throw null;
                }
lbl220:
                // 2 sources

                case 34: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcl", btwu(int ), (int)733);
                    if (!var25_3) ** GOTO lbl198
                    throw null;
                }
lbl224:
                // 2 sources

                case 35: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcm", btwu(int ), (int)734);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
lbl229:
                // 2 sources

                case 36: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcn", btwu(int ), (int)735);
                    if (!var25_3) ** GOTO lbl194
                    throw null;
                }
lbl233:
                // 3 sources

                case 37: {
                    var24_4 /* !! */  = (int)hr.btxb("bwco", btwu(int ), (int)736);
                    if (!var25_3) ** GOTO lbl220
                    throw null;
                }
                case 38: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcp", btwu(int ), (int)737);
                    if (!var25_3) ** GOTO lbl121
                    throw null;
                }
                case 39: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcq", btwu(int ), (int)738);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
                case 40: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcr", btwu(int ), (int)739);
                    if (var25_3) {
                        throw null;
                    }
                    ** GOTO lbl276
                }
lbl251:
                // 2 sources

                case 41: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcs", btwu(int ), (int)740);
                    if (!var25_3) ** GOTO lbl126
                    throw null;
                }
                case 42: {
                    do {
                        var24_4 /* !! */  = (int)hr.btxb("bwct", btwu(int ), (int)741);
                    } while (!var25_3);
                    throw null;
                }
lbl260:
                // 3 sources

                case 43: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcu", btwu(int ), (int)742);
                    if (!var25_3) ** GOTO lbl99
                    throw null;
                }
lbl264:
                // 2 sources

                case 44: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcv", btwu(int ), (int)743);
                    if (!var25_3) ** GOTO lbl185
                    throw null;
                }
                case 45: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcw", btwu(int ), (int)744);
                    if (!var25_3) ** GOTO lbl136
                    throw null;
                }
                case 46: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcx", btwu(int ), (int)745);
                    if (!var25_3) ** GOTO lbl168
                    throw null;
                }
lbl276:
                // 2 sources

                case 47: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcy", btwu(int ), (int)746);
                    if (!var25_3) ** GOTO lbl233
                    throw null;
                }
lbl280:
                // 2 sources

                case 48: {
                    var24_4 /* !! */  = (int)hr.btxb("bwcz", btwu(int ), (int)747);
                    if (!var25_3) ** GOTO lbl113
                    throw null;
                }
lbl284:
                // 3 sources

                case 49: {
                    var24_4 /* !! */  = (int)hr.btxb("bwda", btwu(int ), (int)748);
                    if (!var25_3) ** GOTO lbl150
                    throw null;
                }
lbl288:
                // 3 sources

                case 50: {
                    var24_4 /* !! */  = (int)hr.btxb("bwdb", btwu(int ), (int)749);
                    if (!var25_3) ** GOTO lbl136
                    throw null;
                }
                case 51: 
            }
            break;
        }
        var24_4 /* !! */  = (int)hr.btxb("bwdc", btwu(int ), (int)750);
        ** while (!var25_3)
lbl295:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxeb() {
        hr.btxk[200] = -3172751931273126689L;
        hr.btxk[201] = -2169447868511422053L;
        hr.btxk[202] = -2594381791314402109L;
        hr.btxk[203] = 2312584765917642353L;
        hr.btxk[204] = -8325275623720185901L;
        hr.btxk[205] = -694885989902207056L;
        hr.btxk[206] = 125667435084293118L;
        hr.btxk[207] = 1641012842898027830L;
        hr.btxk[208] = 8858442012912230170L;
        hr.btxk[209] = 2959934248953980632L;
        hr.btxk[210] = 8878461636677100713L;
        hr.btxk[211] = 6399388087177904770L;
        hr.btxk[212] = 4746947396262020058L;
        hr.btxk[213] = 4492245467412196318L;
        hr.btxk[214] = -8249086681735298057L;
        hr.btxk[215] = -7252025486037147552L;
        hr.btxk[216] = 6443689023026009608L;
        hr.btxk[217] = 4828160875342619253L;
        hr.btxk[218] = -6832138168466927882L;
        hr.btxk[219] = 2885729779156495344L;
        hr.btxk[220] = 8780193445185410164L;
        hr.btxk[221] = 4376460555613121256L;
        hr.btxk[222] = 1817104543774519342L;
        hr.btxk[223] = -1838533072282479213L;
        hr.btxk[224] = -6384564435683037123L;
        hr.btxk[225] = 12576493959874556L;
        hr.btxk[226] = 3988090892093775833L;
        hr.btxk[227] = 3666790116951787842L;
        hr.btxk[228] = 7977198809765112641L;
        hr.btxk[229] = -8912793451633121814L;
        hr.btxk[230] = 7303011051163447012L;
        hr.btxk[231] = 4018644618879922727L;
        hr.btxk[232] = 398645433354504071L;
        hr.btxk[233] = 7575302632813820678L;
        hr.btxk[234] = 6403550954825585893L;
        hr.btxk[235] = -2205124684960044688L;
        hr.btxk[236] = -5808134974549162583L;
        hr.btxk[237] = 8551378803028998896L;
        hr.btxk[238] = -618836300640447745L;
        hr.btxk[239] = 5924926479821211891L;
        hr.btxk[240] = 538663286788149235L;
        hr.btxk[241] = -4333750992244907343L;
        hr.btxk[242] = -6841023722180619391L;
        hr.btxk[243] = -7825038138510216028L;
        hr.btxk[244] = 4121298948685978300L;
        hr.btxk[245] = 6284207615367578418L;
        hr.btxk[246] = -4940574593569089425L;
        hr.btxk[247] = 1714114237953033835L;
        hr.btxk[248] = -2944580749918599328L;
        hr.btxk[249] = 4444736878174317421L;
        hr.btxk[250] = 2208653547448150248L;
        hr.btxk[251] = -5456026382531833761L;
        hr.btxk[252] = 246176759118014318L;
        hr.btxk[253] = -1768948900225223210L;
        hr.btxk[254] = -5253680263679590314L;
        hr.btxk[255] = -3245741364350606558L;
        hr.btxk[256] = 4491990542748249355L;
        hr.btxk[257] = -1211142037873464743L;
        hr.btxk[258] = -3932623155232405899L;
        hr.btxk[259] = 4794829923796914918L;
        hr.btxk[260] = -2168872574505049540L;
        hr.btxk[261] = -6643029221316961406L;
        hr.btxk[262] = -4633919432075572447L;
        hr.btxk[263] = -1990086885459275451L;
        hr.btxk[264] = -4886313128602458094L;
        hr.btxk[265] = 5014728686078456449L;
        hr.btxk[266] = -563448906511865194L;
        hr.btxk[267] = -7272876950564063804L;
        hr.btxk[268] = -2367185398825033514L;
        hr.btxk[269] = -1915221165412596894L;
        hr.btxk[270] = 4532651564759673949L;
        hr.btxk[271] = -3700512471532328661L;
        hr.btxk[272] = 668632211750780919L;
        hr.btxk[273] = -8944573557997101526L;
        hr.btxk[274] = 3700917105452115592L;
        hr.btxk[275] = -5331184379411482782L;
        hr.btxk[276] = 1196840537007265169L;
        hr.btxk[277] = 2683044098696098187L;
        hr.btxk[278] = 4773771529389617424L;
        hr.btxk[279] = -408411945898754242L;
        hr.btxk[280] = -2469919592926228551L;
        hr.btxk[281] = -1393287168296445000L;
        hr.btxk[282] = 2427168911668088672L;
        hr.btxk[283] = -519950506260348502L;
        hr.btxk[284] = -8457646615187148779L;
        hr.btxk[285] = -3804735294288734895L;
        hr.btxk[286] = 1377441202728780227L;
        hr.btxk[287] = -5655011830134696284L;
        hr.btxk[288] = -7106848457974245228L;
        hr.btxk[289] = -1028663611459691313L;
        hr.btxk[290] = -937473929350084716L;
        hr.btxk[291] = 6154288463810769192L;
        hr.btxk[292] = -7368227104205441908L;
        hr.btxk[293] = -5900291714669437520L;
        hr.btxk[294] = -6937361570417894111L;
        hr.btxk[295] = 5906102133961574167L;
        hr.btxk[296] = -792922078777739786L;
        hr.btxk[297] = -2621186461277460445L;
        hr.btxk[298] = 5894312651162243382L;
        hr.btxk[299] = -2203731697750871655L;
    }

    private static /* synthetic */ float bubr(int n2) {
        return Float.intBitsToFloat(btwx[n2] ^ btwz[n2]);
    }

    private static /* synthetic */ void bxdd() {
        hr.btwx[300] = -1367078640;
        hr.btwx[301] = -746854658;
        hr.btwx[302] = -1374936853;
        hr.btwx[303] = -1849911315;
        hr.btwx[304] = 1397276297;
        hr.btwx[305] = 907290374;
        hr.btwx[306] = -1590545345;
        hr.btwx[307] = 2069512454;
        hr.btwx[308] = 60032333;
        hr.btwx[309] = -1244617330;
        hr.btwx[310] = -1853213500;
        hr.btwx[311] = 1192532117;
        hr.btwx[312] = 2138488626;
        hr.btwx[313] = 1733699819;
        hr.btwx[314] = -2143909287;
        hr.btwx[315] = 670213480;
        hr.btwx[316] = -1367577062;
        hr.btwx[317] = 2030650775;
        hr.btwx[318] = 867468723;
        hr.btwx[319] = 814472290;
        hr.btwx[320] = 2129105579;
        hr.btwx[321] = -1564687177;
        hr.btwx[322] = 578171645;
        hr.btwx[323] = 845644797;
        hr.btwx[324] = -1550557681;
        hr.btwx[325] = -126999687;
        hr.btwx[326] = -95296987;
        hr.btwx[327] = 1710452564;
        hr.btwx[328] = -365158824;
        hr.btwx[329] = 1227623856;
        hr.btwx[330] = -782841372;
        hr.btwx[331] = -1399078889;
        hr.btwx[332] = -1457150455;
        hr.btwx[333] = -165903578;
        hr.btwx[334] = -708067590;
        hr.btwx[335] = -497169363;
        hr.btwx[336] = -1655768388;
        hr.btwx[337] = 2064338144;
        hr.btwx[338] = 1563477532;
        hr.btwx[339] = -1189657309;
        hr.btwx[340] = -1935692725;
        hr.btwx[341] = 1727586259;
        hr.btwx[342] = -1807230423;
        hr.btwx[343] = -2093942179;
        hr.btwx[344] = -1746938594;
        hr.btwx[345] = -333238181;
        hr.btwx[346] = 1824164600;
        hr.btwx[347] = -1187782322;
        hr.btwx[348] = 693791934;
        hr.btwx[349] = -2039795777;
        hr.btwx[350] = 932683628;
        hr.btwx[351] = 223212205;
        hr.btwx[352] = -1415918039;
        hr.btwx[353] = 476120205;
        hr.btwx[354] = -755425481;
        hr.btwx[355] = 1544407282;
        hr.btwx[356] = 1683077590;
        hr.btwx[357] = -1731100887;
        hr.btwx[358] = -1986224835;
        hr.btwx[359] = -325738628;
        hr.btwx[360] = 1402998001;
        hr.btwx[361] = 1598314648;
        hr.btwx[362] = -329125988;
        hr.btwx[363] = -1133992020;
        hr.btwx[364] = -2037899416;
        hr.btwx[365] = 1853281601;
        hr.btwx[366] = -2023966610;
        hr.btwx[367] = 1835487371;
        hr.btwx[368] = -2059973002;
        hr.btwx[369] = -1815005078;
        hr.btwx[370] = 574953980;
        hr.btwx[371] = 1491929853;
        hr.btwx[372] = -937723339;
        hr.btwx[373] = -178441964;
        hr.btwx[374] = 1973853066;
        hr.btwx[375] = 1918964888;
        hr.btwx[376] = 219257562;
        hr.btwx[377] = 1215651433;
        hr.btwx[378] = -1821742430;
        hr.btwx[379] = -594861792;
        hr.btwx[380] = -1123081968;
        hr.btwx[381] = 1465752193;
        hr.btwx[382] = 1323693697;
        hr.btwx[383] = -107507048;
        hr.btwx[384] = -495298506;
        hr.btwx[385] = 264899319;
        hr.btwx[386] = -1754967903;
        hr.btwx[387] = 853781493;
        hr.btwx[388] = -1896606403;
        hr.btwx[389] = -168202624;
        hr.btwx[390] = 1314753052;
        hr.btwx[391] = 1827477306;
        hr.btwx[392] = -443808078;
        hr.btwx[393] = -2067871177;
        hr.btwx[394] = -953339495;
        hr.btwx[395] = 456537152;
        hr.btwx[396] = -1587120330;
        hr.btwx[397] = 1542568677;
        hr.btwx[398] = -2073285051;
        hr.btwx[399] = -1185236640;
    }

    private static /* synthetic */ void bxdc() {
        hr.btwx[200] = -434063223;
        hr.btwx[201] = 1294325549;
        hr.btwx[202] = 1008244223;
        hr.btwx[203] = 2131820600;
        hr.btwx[204] = -609157171;
        hr.btwx[205] = 1688674852;
        hr.btwx[206] = 416366484;
        hr.btwx[207] = 2013299406;
        hr.btwx[208] = -1059390113;
        hr.btwx[209] = 879193547;
        hr.btwx[210] = 1849263219;
        hr.btwx[211] = -127263965;
        hr.btwx[212] = 2072429907;
        hr.btwx[213] = 1360535515;
        hr.btwx[214] = 648885445;
        hr.btwx[215] = -917352041;
        hr.btwx[216] = -896028485;
        hr.btwx[217] = 348068990;
        hr.btwx[218] = 1468765336;
        hr.btwx[219] = -1282057827;
        hr.btwx[220] = -284917070;
        hr.btwx[221] = 1064986700;
        hr.btwx[222] = -358621373;
        hr.btwx[223] = -1655696808;
        hr.btwx[224] = -1800662419;
        hr.btwx[225] = -792974812;
        hr.btwx[226] = 1508176707;
        hr.btwx[227] = 784513703;
        hr.btwx[228] = 1178802517;
        hr.btwx[229] = -1083401424;
        hr.btwx[230] = -1337192908;
        hr.btwx[231] = -1266813965;
        hr.btwx[232] = 838802369;
        hr.btwx[233] = -1616400122;
        hr.btwx[234] = -906498441;
        hr.btwx[235] = -1027091033;
        hr.btwx[236] = 78136048;
        hr.btwx[237] = -2023635889;
        hr.btwx[238] = 10214722;
        hr.btwx[239] = -720505826;
        hr.btwx[240] = 1047367858;
        hr.btwx[241] = 771469669;
        hr.btwx[242] = -670182817;
        hr.btwx[243] = -1936358827;
        hr.btwx[244] = -742407646;
        hr.btwx[245] = -1588181635;
        hr.btwx[246] = 341452527;
        hr.btwx[247] = -787942583;
        hr.btwx[248] = -605523836;
        hr.btwx[249] = -1649611622;
        hr.btwx[250] = 1150979279;
        hr.btwx[251] = -1785414545;
        hr.btwx[252] = -61322435;
        hr.btwx[253] = -746852210;
        hr.btwx[254] = -742835054;
        hr.btwx[255] = 1278942493;
        hr.btwx[256] = -1275038069;
        hr.btwx[257] = 540460402;
        hr.btwx[258] = -446394804;
        hr.btwx[259] = 690033740;
        hr.btwx[260] = -2101843067;
        hr.btwx[261] = -1479070787;
        hr.btwx[262] = -385453360;
        hr.btwx[263] = -1357586463;
        hr.btwx[264] = -1762466009;
        hr.btwx[265] = -1902761481;
        hr.btwx[266] = -774472334;
        hr.btwx[267] = -1481592496;
        hr.btwx[268] = 1964621530;
        hr.btwx[269] = -945019980;
        hr.btwx[270] = 827619796;
        hr.btwx[271] = -1702725911;
        hr.btwx[272] = 1225895744;
        hr.btwx[273] = -2012901354;
        hr.btwx[274] = 602191913;
        hr.btwx[275] = 701227049;
        hr.btwx[276] = -253462977;
        hr.btwx[277] = -1364323395;
        hr.btwx[278] = -1524200688;
        hr.btwx[279] = -285474652;
        hr.btwx[280] = -1868508804;
        hr.btwx[281] = 680264707;
        hr.btwx[282] = -1104107400;
        hr.btwx[283] = 1141249965;
        hr.btwx[284] = 165238673;
        hr.btwx[285] = -2086238716;
        hr.btwx[286] = -1692030073;
        hr.btwx[287] = -1181841675;
        hr.btwx[288] = 600891345;
        hr.btwx[289] = -1942453236;
        hr.btwx[290] = -2051105590;
        hr.btwx[291] = 1466736068;
        hr.btwx[292] = 1656629917;
        hr.btwx[293] = 1804917242;
        hr.btwx[294] = 970409487;
        hr.btwx[295] = -768466690;
        hr.btwx[296] = -1851967611;
        hr.btwx[297] = 1272252689;
        hr.btwx[298] = 1770692378;
        hr.btwx[299] = -1892536346;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 updatePearlMotion(class_243 var1_1, class_243 var2_2) {
        block71: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bvhu", btxi(int ), (int)162)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hr.btxb("bvhv", btwu(int ), (int)434)) break;
                v0 /* !! */  = (long)hr.btxb("bvhw", btwu(int ), (int)435);
            }
            var6_3 = hr.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bvhx", btxi(int ), (int)163)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == hr.btxb("bvhy", btwu(int ), (int)436)) break;
                v1 /* !! */  = (long)hr.btxb("bvhz", btwu(int ), (int)437);
            }
            var5_4 /* !! */  = hr.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bvia", btxi(int ), (int)164)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hr.btxb("bvib", btwu(int ), (int)438)) break;
                v2 /* !! */  = (long)hr.btxb("bvic", btwu(int ), (int)439);
            }
            var4_5 = hr.a;
            if (var6_3) {
                throw null;
lbl21:
                // 5 sources

                return null;
            }
            if (var4_5 || var4_5) ** GOTO lbl21
            v3 /* !! */  = hr.ei;
            if (true) ** GOTO lbl28
            block49: while (true) {
                v3 /* !! */  = (long)(v4 - hr.btxb("bvoz", btxi(int ), (int)165));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -810643136: {
                        v4 = hr.btxb("bvpa", btxi(int ), (int)166);
                        continue block49;
                    }
                    case 36815136: {
                        v4 = hr.btxb("bvpb", btxi(int ), (int)167);
                        continue block49;
                    }
                    case 1947263079: {
                        v4 = hr.btxb("bvpc", btxi(int ), (int)168);
                        continue block49;
                    }
                    case 2083520731: {
                        break block49;
                    }
                }
                break;
            }
            var3_6 = class_2338.method_49638((class_2374)var2_2);
            if (var4_5 || var4_5) ** GOTO lbl21
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bvpd", btxi(int ), (int)169)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hr.btxb("bvpe", btwu(int ), (int)440)) break;
                v5 /* !! */  = (long)hr.btxb("bvpf", btwu(int ), (int)441);
            }
            v6 /* !! */  = hr.ei;
            if (true) ** GOTO lbl51
            block51: while (true) {
                v6 /* !! */  = (long)(v7 - hr.btxb("bvpg", btxi(int ), (int)170));
lbl51:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -610685339: {
                        v7 = hr.btxb("bvph", btxi(int ), (int)171);
                        continue block51;
                    }
                    case -330598583: {
                        v7 = hr.btxb("bvpi", btxi(int ), (int)172);
                        continue block51;
                    }
                    case 481372258: {
                        v7 = hr.btxb("bvpj", btxi(int ), (int)173);
                        continue block51;
                    }
                    case 2083520731: {
                        break block51;
                    }
                }
                break;
            }
            v8 = hr.mc.field_1687;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bvpk", btxi(int ), (int)174)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == hr.btxb("bvpl", btwu(int ), (int)442)) break;
                v9 /* !! */  = (long)hr.btxb("bvpm", btwu(int ), (int)443);
            }
            v10 = v8.method_8320(var3_6);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bvpn", btxi(int ), (int)175)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == hr.btxb("bvpo", btwu(int ), (int)444)) break;
                v11 /* !! */  = (long)hr.btxb("bvpp", btwu(int ), (int)445);
            }
            v12 /* !! */  = hr.ei;
            if (true) ** GOTO lbl79
            block54: while (true) {
                v12 /* !! */  = (long)(hr.btxb("bvpr", btxi(int ), (int)177) - hr.btxb("bvpq", btxi(int ), (int)176));
lbl79:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -621334487: {
                        continue block54;
                    }
                    case 2083520731: {
                        break block54;
                    }
                }
                break;
            }
            if (!v10.method_27852(class_2246.field_10382)) break block71;
            if (var4_5 || var4_5) ** GOTO lbl21
            v13 = hr.btxb("bvps", buso(int ), (int)178);
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bvpt", btxi(int ), (int)179)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hr.btxb("bvpu", btwu(int ), (int)446)) break;
                v14 /* !! */  = (long)hr.btxb("bvpv", btwu(int ), (int)447);
            }
            v15 = var1_1.method_1021((double)v13);
            v16 = hr.btxb("bvpw", buso(int ), (int)180);
            v17 /* !! */  = hr.ei;
            if (true) ** GOTO lbl98
            block56: while (true) {
                v17 /* !! */  = (long)(v18 - hr.btxb("bvpx", btxi(int ), (int)181));
lbl98:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -2081550207: {
                        v18 = hr.btxb("bvpy", btxi(int ), (int)182);
                        continue block56;
                    }
                    case -635462395: {
                        v18 = hr.btxb("bvpz", btxi(int ), (int)183);
                        continue block56;
                    }
                    case 2083520731: {
                        break block56;
                    }
                }
                break;
            }
            return v15.method_1031(0.0, (double)v16, 0.0);
        }
        if (var4_5) ** GOTO lbl21
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_5) ** break;
                ** continue;
                v19 = hr.btxb("bvqa", buso(int ), (int)184);
                v20 /* !! */  = hr.ei;
                if (true) ** GOTO lbl120
                block57: while (true) {
                    v20 /* !! */  = (long)(v21 - hr.btxb("bvqb", btxi(int ), (int)185));
lbl120:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1809315688: {
                            v21 = hr.btxb("bvqc", btxi(int ), (int)186);
                            continue block57;
                        }
                        case 119768981: {
                            v21 = hr.btxb("bvqd", btxi(int ), (int)187);
                            continue block57;
                        }
                        case 924779722: {
                            v21 = hr.btxb("bvqe", btxi(int ), (int)188);
                            continue block57;
                        }
                        case 2083520731: {
                            break block57;
                        }
                    }
                    break;
                }
                v22 = var1_1.method_1021((double)v19);
                v23 = hr.btxb("bvqf", buso(int ), (int)189);
                v24 /* !! */  = hr.ei;
                if (true) ** GOTO lbl138
                block58: while (true) {
                    v24 /* !! */  = (long)(v25 - hr.btxb("bvqg", btxi(int ), (int)190));
lbl138:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -2047954211: {
                            v25 = hr.btxb("bvqh", btxi(int ), (int)191);
                            continue block58;
                        }
                        case -1041002574: {
                            v25 = hr.btxb("bvqi", btxi(int ), (int)192);
                            continue block58;
                        }
                        case 2083520731: {
                            break block58;
                        }
                    }
                    break;
                }
                return v22.method_1031(0.0, (double)v23, 0.0);
            }
            case 0: {
                do {
                    var5_4 /* !! */  = (int)hr.btxb("bvqj", btwu(int ), (int)448);
                } while (!var6_3);
                throw null;
            }
lbl153:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)hr.btxb("bvqk", btwu(int ), (int)449);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl158:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)hr.btxb("bvql", btwu(int ), (int)450);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl163:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)hr.btxb("bvqm", btwu(int ), (int)451);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl168:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)hr.btxb("bvqn", btwu(int ), (int)452);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 5: {
                var5_4 /* !! */  = (int)hr.btxb("bvqo", btwu(int ), (int)453);
                if (!var6_3) ** GOTO lbl163
                throw null;
            }
lbl177:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)hr.btxb("bvqp", btwu(int ), (int)454);
                if (!var6_3) ** GOTO lbl158
                throw null;
            }
            case 7: {
                do {
                    var5_4 /* !! */  = (int)hr.btxb("bvqq", btwu(int ), (int)455);
                } while (!var6_3);
                throw null;
            }
lbl186:
            // 2 sources

            case 8: {
                do {
                    var5_4 /* !! */  = (int)hr.btxb("bvqr", btwu(int ), (int)456);
                } while (!var6_3);
                throw null;
            }
lbl191:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)hr.btxb("bvqs", btwu(int ), (int)457);
                    if (!var6_3) ** GOTO lbl153
                    throw null;
                }
            }
            case 10: 
        }
        var5_4 /* !! */  = (int)hr.btxb("bvqt", btwu(int ), (int)458);
        ** while (!var6_3)
lbl199:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int btwu(int n2) {
        return btwx[n2] ^ btwz[n2];
    }

    private static /* synthetic */ void bxec() {
        hr.btxk[300] = 5237600957708538593L;
        hr.btxk[301] = -1170448946929802143L;
        hr.btxk[302] = -8453072056477371713L;
        hr.btxk[303] = -8138080082313828708L;
        hr.btxk[304] = -7412721693061846640L;
        hr.btxk[305] = 697986339948887432L;
        hr.btxk[306] = -6360103872402166962L;
        hr.btxk[307] = -7421017969032535559L;
        hr.btxk[308] = 7106373262303380315L;
        hr.btxk[309] = 7480100074020937298L;
        hr.btxk[310] = 8233722840562065649L;
        hr.btxk[311] = -6431592438931378105L;
        hr.btxk[312] = 5752190032980540476L;
        hr.btxk[313] = 3070229997122674001L;
        hr.btxk[314] = -5450673143504424103L;
        hr.btxk[315] = -9014353309326544852L;
        hr.btxk[316] = 447468162958845020L;
        hr.btxk[317] = 761406167205793630L;
        hr.btxk[318] = -9214576044804325447L;
        hr.btxk[319] = 7225102427470933691L;
        hr.btxk[320] = 2244670912672320454L;
        hr.btxk[321] = 3338787486275577001L;
        hr.btxk[322] = 1505564291731247820L;
        hr.btxk[323] = 3271287426826506607L;
        hr.btxk[324] = 7612136230407820881L;
        hr.btxk[325] = -8198657043283926127L;
        hr.btxk[326] = 2564773422005914894L;
        hr.btxk[327] = -7111194317640426147L;
        hr.btxk[328] = 3579562955107306646L;
        hr.btxk[329] = -1362885322987119499L;
        hr.btxk[330] = 4905205446737859116L;
        hr.btxk[331] = -1084461463502628451L;
        hr.btxk[332] = 1590551208100951106L;
        hr.btxk[333] = 7246930709015537800L;
        hr.btxk[334] = -4445350133075564307L;
        hr.btxk[335] = -5616518994457327894L;
        hr.btxk[336] = -8179010943994806752L;
        hr.btxk[337] = 7159597407197730766L;
        hr.btxk[338] = 2339975105727038146L;
        hr.btxk[339] = 3887559746369071595L;
        hr.btxk[340] = -3314577397113540488L;
        hr.btxk[341] = -317952253482692130L;
        hr.btxk[342] = -9027571087434306361L;
        hr.btxk[343] = 4771484063463486157L;
        hr.btxk[344] = -1422783760034475383L;
        hr.btxk[345] = 2355107894193546320L;
        hr.btxk[346] = -249912080868043801L;
        hr.btxk[347] = 8888805432933570096L;
        hr.btxk[348] = -8915091747129566777L;
        hr.btxk[349] = -7695928574902381012L;
        hr.btxk[350] = -7355251648877507164L;
        hr.btxk[351] = -3256471743979634897L;
        hr.btxk[352] = -4831578768890568591L;
        hr.btxk[353] = 3317359896789161284L;
        hr.btxk[354] = -4894645143136277622L;
        hr.btxk[355] = 2726590263076644955L;
        hr.btxk[356] = 2457195384965486842L;
        hr.btxk[357] = 4894516696669940315L;
        hr.btxk[358] = 4518351589442168219L;
        hr.btxk[359] = 8077512645046293195L;
        hr.btxk[360] = 1510722338682648049L;
        hr.btxk[361] = -5803175281196395189L;
        hr.btxk[362] = 8553477554813329378L;
        hr.btxk[363] = -3929234326051242223L;
        hr.btxk[364] = 4697973354652364500L;
        hr.btxk[365] = -6945143992947900133L;
        hr.btxk[366] = -4022563670943740962L;
        hr.btxk[367] = 1128447296006644117L;
        hr.btxk[368] = 8475643120943100897L;
        hr.btxk[369] = -335395142778024996L;
        hr.btxk[370] = -6014616269556186801L;
        hr.btxk[371] = -8604433482946009022L;
        hr.btxk[372] = 7014004724617747201L;
        hr.btxk[373] = -3923069383885042761L;
        hr.btxk[374] = -565926836188769361L;
        hr.btxk[375] = 4814262205509357129L;
        hr.btxk[376] = -1085704474075893875L;
        hr.btxk[377] = -8279584191675848270L;
        hr.btxk[378] = 4584813924955532464L;
        hr.btxk[379] = 7047974774451515899L;
        hr.btxk[380] = -551100754964848841L;
        hr.btxk[381] = -1931932449701073216L;
        hr.btxk[382] = 6991669271625295558L;
        hr.btxk[383] = 7641619199031175654L;
        hr.btxk[384] = -4113711931510470557L;
        hr.btxk[385] = 8272740912545598986L;
        hr.btxk[386] = -3869284319287836261L;
        hr.btxk[387] = -2839271003198142104L;
        hr.btxk[388] = -574747427707048705L;
        hr.btxk[389] = 8788313465150339404L;
        hr.btxk[390] = 8165967866495797105L;
        hr.btxk[391] = 2898015838083743506L;
        hr.btxk[392] = -8361617370295297254L;
        hr.btxk[393] = 1064882591267394942L;
        hr.btxk[394] = 8680076129604080398L;
        hr.btxk[395] = -5173576173194281168L;
        hr.btxk[396] = -4193871330931338140L;
        hr.btxk[397] = -6546791870993024151L;
        hr.btxk[398] = -7897789431493963724L;
        hr.btxk[399] = 5617296733147726571L;
    }

    private static /* synthetic */ void bxed() {
        hr.btxk[400] = -1261075911956491622L;
        hr.btxk[401] = -1499976336272147591L;
        hr.btxk[402] = -2692672670789809933L;
        hr.btxk[403] = 7225457396893375456L;
        hr.btxk[404] = -4066407148013047937L;
        hr.btxk[405] = 3577031149552634938L;
        hr.btxk[406] = -5353439326971382463L;
        hr.btxk[407] = 8013571012483810929L;
        hr.btxk[408] = 4573399550965496362L;
        hr.btxk[409] = 2039763358766435190L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bukx", btxi(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hr.btxb("buky", btwu(int ), (int)151)) break;
            v0 /* !! */  = (long)hr.btxb("bukz", btwu(int ), (int)152);
        }
        var3_1 = hr.c;
        v1 /* !! */  = hr.ei;
        if (true) ** GOTO lbl11
        block31: while (true) {
            v1 /* !! */  = (long)(hr.btxb("bule", btxi(int ), (int)5) - hr.btxb("bulc", btxi(int ), (int)4));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 902960691: {
                    continue block31;
                }
                case 2083520731: {
                    break block31;
                }
            }
            break;
        }
        var2_2 /* !! */  = hr.b;
        v2 /* !! */  = hr.ei;
        if (true) ** GOTO lbl21
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - hr.btxb("bulg", btxi(int ), (int)6));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1609204971: {
                    v3 = hr.btxb("bulh", btxi(int ), (int)7);
                    continue block32;
                }
                case 739573421: {
                    v3 = hr.btxb("bulj", btxi(int ), (int)8);
                    continue block32;
                }
                case 1371998895: {
                    v3 = hr.btxb("bull", btxi(int ), (int)9);
                    continue block32;
                }
                case 2083520731: {
                    break block32;
                }
            }
            break;
        }
        var1_3 = hr.a;
        if (var3_1) {
            throw null;
lbl36:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("buln", btxi(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hr.btxb("bulo", btwu(int ), (int)153)) break;
            v4 /* !! */  = (long)hr.btxb("bulp", btwu(int ), (int)154);
        }
        this.resetThrowState();
        if (var1_3 || var1_3) ** GOTO lbl36
        v5 = hr.btxb("bulr", btwu(int ), (int)155);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bult", btxi(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hr.btxb("bulv", btwu(int ), (int)156)) break;
            v6 /* !! */  = (long)hr.btxb("bulx", btwu(int ), (int)157);
        }
        this.lastHandledPearlId = (int)v5;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl36
                v7 = hr.btxb("buly", btxi(int ), (int)12);
                v8 /* !! */  = hr.ei;
                if (true) ** GOTO lbl62
                block36: while (true) {
                    v8 /* !! */  = (long)(v9 - hr.btxb("bumb", btxi(int ), (int)13));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1321687088: {
                            v9 = hr.btxb("bumc", btxi(int ), (int)14);
                            continue block36;
                        }
                        case 1679181345: {
                            v9 = hr.btxb("bumd", btxi(int ), (int)15);
                            continue block36;
                        }
                        case 2046049210: {
                            v9 = hr.btxb("bume", btxi(int ), (int)16);
                            continue block36;
                        }
                        case 2083520731: {
                            break block36;
                        }
                    }
                    break;
                }
                this.nextThrowAt = (long)v7;
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bumf", btxi(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hr.btxb("bumg", btwu(int ), (int)158)) break;
                    v10 /* !! */  = (long)hr.btxb("bumk", btwu(int ), (int)159);
                }
                super.deactivate();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl84:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hr.btxb("bumn", btwu(int ), (int)160);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 1: {
                var2_2 /* !! */  = (int)hr.btxb("bumo", btwu(int ), (int)161);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl94:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hr.btxb("bump", btwu(int ), (int)162);
                if (var3_1) {
                    throw null;
                }
            }
lbl98:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)hr.btxb("bumr", btwu(int ), (int)163);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)hr.btxb("bumt", btwu(int ), (int)164);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl107:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hr.btxb("bumv", btwu(int ), (int)165);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hr.btxb("bumx", btwu(int ), (int)166);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
lbl115:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hr.btxb("bumz", btwu(int ), (int)167);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl129
                    break;
                }
            }
lbl121:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hr.btxb("buna", btwu(int ), (int)168);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hr.btxb("bunb", btwu(int ), (int)169);
                if (!var3_1) ** GOTO lbl115
                throw null;
            }
lbl129:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hr.btxb("bund", btwu(int ), (int)170);
                if (!var3_1) break;
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)hr.btxb("bune", btwu(int ), (int)171);
        ** while (!var3_1)
lbl136:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$getTargetPearl$3(class_1684 var1_1) {
        v0 /* !! */  = hr.ei;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - hr.btxb("bwpd", btxi(int ), (int)351));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1061778154: {
                    v1 = hr.btxb("bwpe", btxi(int ), (int)352);
                    continue block26;
                }
                case 1291836197: {
                    v1 = hr.btxb("bwpf", btxi(int ), (int)353);
                    continue block26;
                }
                case 1617521843: {
                    v1 = hr.btxb("bwpg", btxi(int ), (int)354);
                    continue block26;
                }
                case 2083520731: {
                    break block26;
                }
            }
            break;
        }
        var4_2 = hr.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwph", btxi(int ), (int)355)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hr.btxb("bwpi", btwu(int ), (int)934)) break;
            v2 /* !! */  = (long)hr.btxb("bwpj", btwu(int ), (int)935);
        }
        var3_3 /* !! */  = hr.b;
        v3 /* !! */  = hr.ei;
        if (true) ** GOTO lbl29
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - hr.btxb("bwpk", btxi(int ), (int)356));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1611258556: {
                    v4 = hr.btxb("bwpl", btxi(int ), (int)357);
                    continue block28;
                }
                case -1363038863: {
                    v4 = hr.btxb("bwpm", btxi(int ), (int)358);
                    continue block28;
                }
                case 1359002975: {
                    v4 = hr.btxb("bwpn", btxi(int ), (int)359);
                    continue block28;
                }
                case 2083520731: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = hr.a;
        if (!var4_2) ** GOTO lbl48
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hr.btxb("bwpo", btwu(int ), (int)936);
                }
lbl48:
                // 1 sources

                if (var2_4 || var2_4) continue block29;
                v5 /* !! */  = hr.ei;
                if (true) ** GOTO lbl53
                block30: while (true) {
                    v5 /* !! */  = (long)(hr.btxb("bwpq", btxi(int ), (int)361) - hr.btxb("bwpp", btxi(int ), (int)360));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 998614829: {
                            continue block30;
                        }
                        case 2083520731: {
                            break block30;
                        }
                    }
                    break;
                }
                if (this.getHorizontalDistanceTo(var1_1) <= hr.btxb("bwpr", buso(int ), (int)362)) {
                    if (var2_4) continue block29;
                    v6 = hr.btxb("bwps", btwu(int ), (int)937);
                    if (var4_2) {
                        throw null;
                    }
                } else {
                    if (!var2_4 && !var2_4) ** break;
                    continue block29;
                    v6 = hr.btxb("bwpt", btwu(int ), (int)938);
                }
                return (boolean)v6;
lbl68:
                // 3 sources

                case 0: {
                    var3_3 /* !! */  = (int)hr.btxb("bwpu", btwu(int ), (int)939);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl77
                }
                case 1: {
                    var3_3 /* !! */  = (int)hr.btxb("bwpv", btwu(int ), (int)940);
                    if (!var4_2) ** GOTO lbl68
                    throw null;
                }
lbl77:
                // 3 sources

                case 2: {
                    var3_3 /* !! */  = (int)hr.btxb("bwpw", btwu(int ), (int)941);
                    if (!var4_2) ** GOTO lbl68
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)hr.btxb("bwpx", btwu(int ), (int)942);
                    if (!var4_2) ** GOTO lbl77
                    throw null;
                }
                case 4: {
                    var3_3 /* !! */  = (int)hr.btxb("bwpy", btwu(int ), (int)943);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl89:
                // 4 sources

                case 5: {
                    do {
                        var3_3 /* !! */  = (int)hr.btxb("bwpz", btwu(int ), (int)944);
                    } while (!var4_2);
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)hr.btxb("bwqa", btwu(int ), (int)945);
                    if (!var4_2) ** GOTO lbl89
                    throw null;
                }
                case 7: 
            }
        }
        do {
            var3_3 /* !! */  = (int)hr.btxb("bwqb", btwu(int ), (int)946);
        } while (!var4_2);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private void aimAndThrowPearl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[CASE]
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

    private static /* synthetic */ double buso(int n2) {
        return Double.longBitsToDouble(btxj[n2] ^ btxk[n2]);
    }

    private static /* synthetic */ void bxds() {
        hr.btwz[800] = 1288269333;
        hr.btwz[801] = 1591607171;
        hr.btwz[802] = -921952745;
        hr.btwz[803] = 1421979389;
        hr.btwz[804] = -90444267;
        hr.btwz[805] = -1113051652;
        hr.btwz[806] = -1524416600;
        hr.btwz[807] = -122861908;
        hr.btwz[808] = 1171557013;
        hr.btwz[809] = 477057424;
        hr.btwz[810] = 1155804282;
        hr.btwz[811] = 145500003;
        hr.btwz[812] = 769814141;
        hr.btwz[813] = -2121463664;
        hr.btwz[814] = -373951709;
        hr.btwz[815] = -355542074;
        hr.btwz[816] = -555136502;
        hr.btwz[817] = 1444026808;
        hr.btwz[818] = 1617800513;
        hr.btwz[819] = -1231834602;
        hr.btwz[820] = 2146190679;
        hr.btwz[821] = -1290750420;
        hr.btwz[822] = 1806658644;
        hr.btwz[823] = -162680872;
        hr.btwz[824] = -889380285;
        hr.btwz[825] = 2134305622;
        hr.btwz[826] = -1830023738;
        hr.btwz[827] = 1614624128;
        hr.btwz[828] = 69377916;
        hr.btwz[829] = -2034475954;
        hr.btwz[830] = 441259515;
        hr.btwz[831] = 1814478959;
        hr.btwz[832] = -421025959;
        hr.btwz[833] = 578978908;
        hr.btwz[834] = 1097259183;
        hr.btwz[835] = 1497824600;
        hr.btwz[836] = 589420401;
        hr.btwz[837] = 1139474366;
        hr.btwz[838] = -1561371840;
        hr.btwz[839] = 539773366;
        hr.btwz[840] = -1274407663;
        hr.btwz[841] = -619284892;
        hr.btwz[842] = -1099542776;
        hr.btwz[843] = 320336589;
        hr.btwz[844] = -703096394;
        hr.btwz[845] = -532180502;
        hr.btwz[846] = 1262818245;
        hr.btwz[847] = 1345520266;
        hr.btwz[848] = 305372577;
        hr.btwz[849] = -2147217933;
        hr.btwz[850] = -29426502;
        hr.btwz[851] = -825006923;
        hr.btwz[852] = -1098750045;
        hr.btwz[853] = 1568125155;
        hr.btwz[854] = 2107315010;
        hr.btwz[855] = 1345419184;
        hr.btwz[856] = -1761228450;
        hr.btwz[857] = 132585409;
        hr.btwz[858] = -368857189;
        hr.btwz[859] = 1964395157;
        hr.btwz[860] = 77405462;
        hr.btwz[861] = 1357863192;
        hr.btwz[862] = 1371019241;
        hr.btwz[863] = -789517986;
        hr.btwz[864] = 299928986;
        hr.btwz[865] = 1413234765;
        hr.btwz[866] = 1901843547;
        hr.btwz[867] = -524840651;
        hr.btwz[868] = -1058971159;
        hr.btwz[869] = -1401140105;
        hr.btwz[870] = 1712260037;
        hr.btwz[871] = 398284721;
        hr.btwz[872] = -503907748;
        hr.btwz[873] = -1690519052;
        hr.btwz[874] = 2032100733;
        hr.btwz[875] = -588676430;
        hr.btwz[876] = 2112662275;
        hr.btwz[877] = -1119545432;
        hr.btwz[878] = 965686715;
        hr.btwz[879] = -525072885;
        hr.btwz[880] = 1791995274;
        hr.btwz[881] = -1471662114;
        hr.btwz[882] = -1775440994;
        hr.btwz[883] = 1159048843;
        hr.btwz[884] = -61998593;
        hr.btwz[885] = 1458021973;
        hr.btwz[886] = 886175601;
        hr.btwz[887] = -1966448655;
        hr.btwz[888] = -1956161014;
        hr.btwz[889] = 1441454895;
        hr.btwz[890] = -1648616443;
        hr.btwz[891] = 92347297;
        hr.btwz[892] = -965976678;
        hr.btwz[893] = -355418528;
        hr.btwz[894] = -222218269;
        hr.btwz[895] = -1948508067;
        hr.btwz[896] = -224514024;
        hr.btwz[897] = 1113204442;
        hr.btwz[898] = -1682849885;
        hr.btwz[899] = -189368309;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$getTargetPearl$1(class_1309 var1_1, class_1297 var2_2) {
        block94: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwqn", btxi(int ), (int)368)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hr.btxb("bwqo", btwu(int ), (int)953)) break;
                v0 /* !! */  = (long)hr.btxb("bwqp", btwu(int ), (int)954);
            }
            var6_3 = hr.c;
            v1 /* !! */  = hr.ei;
            if (true) ** GOTO lbl12
            block55: while (true) {
                v1 /* !! */  = (long)(v2 - hr.btxb("bwqq", btxi(int ), (int)369));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1581339758: {
                        v2 = hr.btxb("bwqr", btxi(int ), (int)370);
                        continue block55;
                    }
                    case 1714656176: {
                        v2 = hr.btxb("bwqs", btxi(int ), (int)371);
                        continue block55;
                    }
                    case 2083520731: {
                        break block55;
                    }
                }
                break;
            }
            var5_4 /* !! */  = hr.b;
            v3 /* !! */  = hr.ei;
            if (true) ** GOTO lbl26
            block56: while (true) {
                v3 /* !! */  = (long)(hr.btxb("bwqu", btxi(int ), (int)373) - hr.btxb("bwqt", btxi(int ), (int)372));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1259597840: {
                        continue block56;
                    }
                    case 2083520731: {
                        break block56;
                    }
                }
                break;
            }
            var4_5 = hr.a;
            if (var6_3) {
                throw null;
lbl34:
                // 12 sources

                return (boolean)hr.btxb("bwqv", btwu(int ), (int)955);
            }
            if (var4_5 || var4_5) ** GOTO lbl34
            if (!(var2_2 instanceof class_1684)) ** GOTO lbl160
            if (var4_5 || var4_5) ** GOTO lbl34
            var3_6 = (class_1684)var2_2;
            if (var4_5 || var4_5) ** GOTO lbl34
            v4 /* !! */  = hr.ei;
            if (true) ** GOTO lbl45
            block58: while (true) {
                v4 /* !! */  = (long)(v5 - hr.btxb("bwqw", btxi(int ), (int)374));
lbl45:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1065104994: {
                        v5 = hr.btxb("bwqx", btxi(int ), (int)375);
                        continue block58;
                    }
                    case 749688072: {
                        v5 = hr.btxb("bwqy", btxi(int ), (int)376);
                        continue block58;
                    }
                    case 2083520731: {
                        break block58;
                    }
                }
                break;
            }
            if (!var3_6.method_5805()) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
            v6 /* !! */  = hr.ei;
            if (true) ** GOTO lbl60
            block59: while (true) {
                v6 /* !! */  = (long)(v7 - hr.btxb("bwqz", btxi(int ), (int)377));
lbl60:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2013812640: {
                        v7 = hr.btxb("bwra", btxi(int ), (int)378);
                        continue block59;
                    }
                    case 1582862254: {
                        v7 = hr.btxb("bwrb", btxi(int ), (int)379);
                        continue block59;
                    }
                    case 2083520731: {
                        break block59;
                    }
                }
                break;
            }
            v8 = var3_6.method_24921();
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwrc", btxi(int ), (int)380)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == hr.btxb("bwrd", btwu(int ), (int)956)) break;
                v9 /* !! */  = (long)hr.btxb("bwre", btwu(int ), (int)957);
            }
            v10 /* !! */  = hr.ei;
            if (true) ** GOTO lbl80
            block61: while (true) {
                v10 /* !! */  = (long)(hr.btxb("bwrg", btxi(int ), (int)382) - hr.btxb("bwrf", btxi(int ), (int)381));
lbl80:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 876938306: {
                        continue block61;
                    }
                    case 2083520731: {
                        break block61;
                    }
                }
                break;
            }
            if (v8 == hr.mc.field_1724) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
            v11 /* !! */  = hr.ei;
            if (true) ** GOTO lbl91
            block62: while (true) {
                v11 /* !! */  = (long)(v12 - hr.btxb("bwrh", btxi(int ), (int)383));
lbl91:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 109960245: {
                        v12 = hr.btxb("bwri", btxi(int ), (int)384);
                        continue block62;
                    }
                    case 950337975: {
                        v12 = hr.btxb("bwrj", btxi(int ), (int)385);
                        continue block62;
                    }
                    case 2083520731: {
                        break block62;
                    }
                }
                break;
            }
            v13 = var3_6.method_5628();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bwrk", btxi(int ), (int)386)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v14 /* !! */  == hr.btxb("bwrl", btwu(int ), (int)958)) break;
                v14 /* !! */  = (long)hr.btxb("bwrm", btwu(int ), (int)959);
            }
            if (v13 == this.lastHandledPearlId) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
            v15 /* !! */  = hr.ei;
            if (true) ** GOTO lbl113
            block64: while (true) {
                v15 /* !! */  = (long)(hr.btxb("bwro", btxi(int ), (int)388) - hr.btxb("bwrn", btxi(int ), (int)387));
lbl113:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case 1655591513: {
                        continue block64;
                    }
                    case 2083520731: {
                        break block64;
                    }
                }
                break;
            }
            v16 = var3_6.method_24921();
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bwrp", btxi(int ), (int)389)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v17 /* !! */  == hr.btxb("bwrq", btwu(int ), (int)960)) break;
                v17 /* !! */  = (long)hr.btxb("bwrr", btwu(int ), (int)961);
            }
            if (this.isIgnoredFriend(v16)) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bwrs", btxi(int ), (int)390)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v18 /* !! */  == hr.btxb("bwrt", btwu(int ), (int)962)) break;
                v18 /* !! */  = (long)hr.btxb("bwru", btwu(int ), (int)963);
            }
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bwrv", btxi(int ), (int)391)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v19 /* !! */  == hr.btxb("bwrw", btwu(int ), (int)964)) break;
                v19 /* !! */  = (long)hr.btxb("bwrx", btwu(int ), (int)965);
            }
            if (!this.onlyTarget.isValue()) break block94;
            if (var4_5) ** GOTO lbl34
            if (var1_1 == null) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_6 = hr.ei - hr.btxb("bwry", btxi(int ), (int)392)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v20 /* !! */  == hr.btxb("bwrz", btwu(int ), (int)966)) break;
                v20 /* !! */  = (long)hr.btxb("bwsa", btwu(int ), (int)967);
            }
            if (var3_6.method_24921() != var1_1) ** GOTO lbl160
            if (var4_5) ** GOTO lbl34
        }
        if (var4_5 || var4_5) ** GOTO lbl34
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v21 = hr.btxb("bwsb", btwu(int ), (int)968);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl160:
            // 7 sources

            if (!var4_5 && !var4_5) ** break;
            ** continue;
            v21 = hr.btxb("bwsc", btwu(int ), (int)969);
lbl163:
            // 2 sources

            return (boolean)v21;
lbl164:
            // 4 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_4 /* !! */  = (int)hr.btxb("bwsd", btwu(int ), (int)970);
                    if (!var6_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl169:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)hr.btxb("bwse", btwu(int ), (int)971);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl174:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)hr.btxb("bwsf", btwu(int ), (int)972);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl179:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)hr.btxb("bwsg", btwu(int ), (int)973);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 4: {
                var5_4 /* !! */  = (int)hr.btxb("bwsh", btwu(int ), (int)974);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl189:
            // 3 sources

            case 5: {
                var5_4 /* !! */  = (int)hr.btxb("bwsi", btwu(int ), (int)975);
                if (!var6_3) ** GOTO lbl164
                throw null;
            }
lbl193:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)hr.btxb("bwsj", btwu(int ), (int)976);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl198:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)hr.btxb("bwsk", btwu(int ), (int)977);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 8: {
                var5_4 /* !! */  = (int)hr.btxb("bwsl", btwu(int ), (int)978);
                if (!var6_3) ** GOTO lbl179
                throw null;
            }
lbl207:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)hr.btxb("bwsm", btwu(int ), (int)979);
                if (!var6_3) ** GOTO lbl164
                throw null;
            }
lbl211:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)hr.btxb("bwsn", btwu(int ), (int)980);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 11: {
                var5_4 /* !! */  = (int)hr.btxb("bwso", btwu(int ), (int)981);
                if (!var6_3) ** GOTO lbl189
                throw null;
            }
lbl220:
            // 2 sources

            case 12: {
                var5_4 /* !! */  = (int)hr.btxb("bwsp", btwu(int ), (int)982);
                if (!var6_3) ** GOTO lbl189
                throw null;
            }
lbl224:
            // 3 sources

            case 13: {
                var5_4 /* !! */  = (int)hr.btxb("bwsq", btwu(int ), (int)983);
                if (!var6_3) ** GOTO lbl164
                throw null;
            }
            case 14: {
                var5_4 /* !! */  = (int)hr.btxb("bwsr", btwu(int ), (int)984);
                if (!var6_3) ** GOTO lbl169
                throw null;
            }
lbl232:
            // 2 sources

            case 15: {
                var5_4 /* !! */  = (int)hr.btxb("bwss", btwu(int ), (int)985);
                if (!var6_3) ** GOTO lbl174
                throw null;
            }
            case 16: {
                var5_4 /* !! */  = (int)hr.btxb("bwst", btwu(int ), (int)986);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 17: {
                var5_4 /* !! */  = (int)hr.btxb("bwsu", btwu(int ), (int)987);
                if (var6_3) {
                    throw null;
                }
            }
lbl245:
            // 4 sources

            case 18: {
                var5_4 /* !! */  = (int)hr.btxb("bwsv", btwu(int ), (int)988);
                if (!var6_3) ** GOTO lbl193
                throw null;
            }
            case 19: 
        }
        var5_4 /* !! */  = (int)hr.btxb("bwsw", btwu(int ), (int)989);
        ** while (!var6_3)
lbl252:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Boolean lambda$new$0() {
        v0 /* !! */  = hr.ei;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - hr.btxb("bwsx", btxi(int ), (int)393));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2098685937: {
                    v1 = hr.btxb("bwsy", btxi(int ), (int)394);
                    continue block29;
                }
                case 1058479597: {
                    v1 = hr.btxb("bwsz", btxi(int ), (int)395);
                    continue block29;
                }
                case 2083520731: {
                    break block29;
                }
            }
            break;
        }
        var3_1 = hr.c;
        v2 /* !! */  = hr.ei;
        if (true) ** GOTO lbl19
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - hr.btxb("bwta", btxi(int ), (int)396));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 553947706: {
                    v3 = hr.btxb("bwtb", btxi(int ), (int)397);
                    continue block30;
                }
                case 692438873: {
                    v3 = hr.btxb("bwtc", btxi(int ), (int)398);
                    continue block30;
                }
                case 1970864544: {
                    v3 = hr.btxb("bwtd", btxi(int ), (int)399);
                    continue block30;
                }
                case 2083520731: {
                    break block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = hr.b;
        v4 /* !! */  = hr.ei;
        if (true) ** GOTO lbl36
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - hr.btxb("bwte", btxi(int ), (int)400));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -81725223: {
                    v5 = hr.btxb("bwtf", btxi(int ), (int)401);
                    continue block31;
                }
                case 1379021097: {
                    v5 = hr.btxb("bwtg", btxi(int ), (int)402);
                    continue block31;
                }
                case 1679492256: {
                    v5 = hr.btxb("bwth", btxi(int ), (int)403);
                    continue block31;
                }
                case 2083520731: {
                    break block31;
                }
            }
            break;
        }
        var1_3 = hr.a;
        if (var3_1) {
            throw null;
lbl51:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v6 /* !! */  = hr.ei;
                if (true) ** GOTO lbl62
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - hr.btxb("bwti", btxi(int ), (int)404));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -877113273: {
                            v7 = hr.btxb("bwtj", btxi(int ), (int)405);
                            continue block33;
                        }
                        case -482610985: {
                            v7 = hr.btxb("bwtk", btxi(int ), (int)406);
                            continue block33;
                        }
                        case 461732786: {
                            v7 = hr.btxb("bwtl", btxi(int ), (int)407);
                            continue block33;
                        }
                        case 2083520731: {
                            break block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bwtm", btxi(int ), (int)408)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hr.btxb("bwtn", btwu(int ), (int)990)) break;
                    v8 /* !! */  = (long)hr.btxb("bwto", btwu(int ), (int)991);
                }
                v9 = this.mode.isSelected("\u041f\u043e \u0431\u0438\u043d\u0434\u0443");
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bwtp", btxi(int ), (int)409)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hr.btxb("bwtq", btwu(int ), (int)992)) break;
                    v10 /* !! */  = (long)hr.btxb("bwtr", btwu(int ), (int)993);
                }
                return v9;
            }
            case 0: {
                var2_2 /* !! */  = (int)hr.btxb("bwts", btwu(int ), (int)994);
                if (var3_1) {
                    throw null;
                }
            }
lbl90:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hr.btxb("bwtt", btwu(int ), (int)995);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hr.btxb("bwtu", btwu(int ), (int)996);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hr.btxb("bxcz", btwu(int ), (int)997);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block181: {
            block179: {
                block180: {
                    block178: {
                        block176: {
                            block177: {
                                block175: {
                                    block174: {
                                        block173: {
                                            var16_2 = hr.c;
                                            var15_3 /* !! */  = hr.b;
                                            var14_4 = hr.a;
                                            if (var16_2) {
                                                throw null;
lbl6:
                                                // 44 sources

                                                return;
                                            }
                                            if (var14_4 || var14_4) ** GOTO lbl6
                                            if (!this.isState()) break block173;
                                            if (var14_4) ** GOTO lbl6
                                            if (!this.isThrowing) break block173;
                                            if (var14_4) ** GOTO lbl6
                                            if (this.serverRotation != null) break block174;
                                            if (var14_4) ** GOTO lbl6
                                        }
                                        if (var14_4 || var14_4) ** GOTO lbl6
                                        return;
                                    }
                                    if (var14_4 || var14_4) ** GOTO lbl6
                                    if (!var1_1.getInput().comp_3159()) break block175;
                                    if (var14_4) ** GOTO lbl6
                                    v0 = 1.0f;
                                    if (var16_2) {
                                        throw null;
                                    }
                                    break block176;
                                }
                                if (var14_4 || var14_4) ** GOTO lbl6
                                if (!var1_1.getInput().comp_3160()) break block177;
                                if (var14_4) ** GOTO lbl6
                                v0 = (float)hr.btxb("bubu", bubr(int ), (int)55);
                                if (var16_2) {
                                    throw null;
                                }
                                break block176;
                            }
                            if (var14_4 || var14_4) ** GOTO lbl6
                            v0 = var2_5 = 0.0f;
                        }
                        if (var14_4 || var14_4) ** GOTO lbl6
                        if (!var1_1.getInput().comp_3161()) break block178;
                        if (var14_4) ** GOTO lbl6
                        v1 /* !! */  = hr.btxb("bubw", bubr(int ), (int)56);
                        if (var16_2) {
                            throw null;
                        }
                        break block179;
                    }
                    if (var14_4 || var14_4) ** GOTO lbl6
                    if (!var1_1.getInput().comp_3162()) break block180;
                    if (var14_4) ** GOTO lbl6
                    v1 /* !! */  = (CallSite)1.0f;
                    if (var16_2) {
                        throw null;
                    }
                    break block179;
                }
                if (var14_4 || var14_4) ** GOTO lbl6
                v1 /* !! */  = var3_6 = (CallSite)0.0f;
            }
            if (var14_4 || var14_4) ** GOTO lbl6
            if (var2_5 != 0.0f) break block181;
            if (var14_4) ** GOTO lbl6
            if (var3_6 != 0.0f) break block181;
            if (var14_4 || var14_4) ** GOTO lbl6
            return;
        }
        if (var14_4 || var14_4) ** GOTO lbl6
        var4_7 = class_3532.method_15338((double)Math.toDegrees(hr.direction(this.serverRotation.field_1343, var2_5, (float)var3_6)));
        if (var14_4 || var14_4) ** GOTO lbl6
        var6_8 /* !! */  = 0.0f;
        if (var14_4 || var14_4) ** GOTO lbl6
        var7_9 /* !! */  = 0.0f;
        if (var14_4 || var14_4) ** GOTO lbl6
        var8_10 /* !! */  = hr.btxb("bucb", bubr(int ), (int)57);
        if (var14_4 || var14_4) ** GOTO lbl6
        var9_11 = hr.btxb("bucc", bubr(int ), (int)58);
        if (var15_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var15_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var14_4) ** GOTO lbl6
                do {
                    if (var14_4 || var14_4) ** GOTO lbl6
                    if (!(var9_11 <= 1.0f)) ** GOTO lbl118
                    if (var14_4 || var14_4) ** GOTO lbl6
                    var10_12 = hr.btxb("bucf", bubr(int ), (int)59);
                    if (var14_4) ** GOTO lbl6
                    do {
                        if (var14_4 || var14_4) ** GOTO lbl6
                        if (!(var10_12 <= 1.0f)) ** GOTO lbl113
                        if (var14_4 || var14_4) ** GOTO lbl6
                        if (var9_11 != 0.0f) ** GOTO lbl95
                        if (var14_4) ** GOTO lbl6
                        if (var10_12 != 0.0f) ** GOTO lbl95
                        if (var14_4 || var14_4) ** GOTO lbl6
                        if (var16_2) {
                            throw null;
                        }
                        ** GOTO lbl108
lbl95:
                        // 2 sources

                        if (var14_4 || var14_4) ** GOTO lbl6
                        var11_13 = class_3532.method_15338((double)Math.toDegrees(hr.direction(this.serverRotation.field_1343, (float)var9_11, (float)var10_12)));
                        if (var14_4 || var14_4) ** GOTO lbl6
                        var13_14 = Math.abs(class_3532.method_15393((float)((float)(var4_7 - var11_13))));
                        if (var14_4 || var14_4) ** GOTO lbl6
                        if (!(var13_14 < var8_10 /* !! */ )) ** GOTO lbl108
                        if (var14_4 || var14_4) ** GOTO lbl6
                        var8_10 /* !! */  = (CallSite)var13_14;
                        if (var14_4 || var14_4) ** GOTO lbl6
                        var6_8 /* !! */  = (float)var9_11;
                        if (var14_4 || var14_4) ** GOTO lbl6
                        var7_9 /* !! */  = (float)var10_12;
                        if (var14_4) ** GOTO lbl6
lbl108:
                        // 3 sources

                        if (var14_4 || var14_4) ** GOTO lbl6
                        var10_12 += 1.0f;
                        if (var14_4) ** GOTO lbl6
                    } while (!var16_2);
                    throw null;
lbl113:
                    // 1 sources

                    if (var14_4 || var14_4) ** GOTO lbl6
                    var9_11 += 1.0f;
                    if (var14_4) ** GOTO lbl6
                } while (!var16_2);
                throw null;
lbl118:
                // 1 sources

                if (var14_4 || var14_4) ** GOTO lbl6
                if (var6_8 /* !! */  == 1.0f) {
                    v2 = hr.btxb("buck", btwu(int ), (int)60);
                    if (var16_2) {
                        throw null;
                    }
                } else {
                    v2 = hr.btxb("bucl", btwu(int ), (int)61);
                }
                if (var6_8 /* !! */  == hr.btxb("bucn", bubr(int ), (int)62)) {
                    v3 = hr.btxb("buco", btwu(int ), (int)63);
                    if (var16_2) {
                        throw null;
                    }
                } else {
                    v3 = hr.btxb("bucq", btwu(int ), (int)64);
                }
                if (var7_9 /* !! */  == hr.btxb("bucr", bubr(int ), (int)65)) {
                    v4 = hr.btxb("bucs", btwu(int ), (int)66);
                    if (var16_2) {
                        throw null;
                    }
                } else {
                    v4 = hr.btxb("buct", btwu(int ), (int)67);
                }
                if (var7_9 /* !! */  == 1.0f) {
                    v5 = hr.btxb("bucv", btwu(int ), (int)68);
                    if (var16_2) {
                        throw null;
                    }
                } else {
                    v5 = hr.btxb("bucy", btwu(int ), (int)69);
                }
                var1_1.setDirectionalLow((boolean)v2, (boolean)v3, (boolean)v4, (boolean)v5);
                if (!var14_4 && !var14_4) ** break;
                ** continue;
                return;
            }
lbl147:
            // 2 sources

            case 0: {
                var15_3 /* !! */  = (int)hr.btxb("buda", btwu(int ), (int)70);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 1: {
                var15_3 /* !! */  = (int)hr.btxb("budc", btwu(int ), (int)71);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl157:
            // 2 sources

            case 2: {
                var15_3 /* !! */  = (int)hr.btxb("budf", btwu(int ), (int)72);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl162:
            // 3 sources

            case 3: {
                var15_3 /* !! */  = (int)hr.btxb("budh", btwu(int ), (int)73);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 4: {
                var15_3 /* !! */  = (int)hr.btxb("budk", btwu(int ), (int)74);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl172:
            // 2 sources

            case 5: {
                var15_3 /* !! */  = (int)hr.btxb("budm", btwu(int ), (int)75);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl177:
            // 2 sources

            case 6: {
                var15_3 /* !! */  = (int)hr.btxb("budo", btwu(int ), (int)76);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl182:
            // 2 sources

            case 7: {
                var15_3 /* !! */  = (int)hr.btxb("budq", btwu(int ), (int)77);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl474
            }
lbl187:
            // 2 sources

            case 8: {
                var15_3 /* !! */  = (int)hr.btxb("budr", btwu(int ), (int)78);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl192:
            // 2 sources

            case 9: {
                var15_3 /* !! */  = (int)hr.btxb("budu", btwu(int ), (int)79);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl499
            }
lbl197:
            // 2 sources

            case 10: {
                var15_3 /* !! */  = (int)hr.btxb("budw", btwu(int ), (int)80);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl490
            }
            case 11: {
                var15_3 /* !! */  = (int)hr.btxb("budx", btwu(int ), (int)81);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl207:
            // 2 sources

            case 12: {
                var15_3 /* !! */  = (int)hr.btxb("buea", btwu(int ), (int)82);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 13: {
                var15_3 /* !! */  = (int)hr.btxb("buec", btwu(int ), (int)83);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl217:
            // 2 sources

            case 14: {
                var15_3 /* !! */  = (int)hr.btxb("buee", btwu(int ), (int)84);
                if (!var16_2) ** GOTO lbl172
                throw null;
            }
            case 15: {
                var15_3 /* !! */  = (int)hr.btxb("bueg", btwu(int ), (int)85);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 16: {
                var15_3 /* !! */  = (int)hr.btxb("buei", btwu(int ), (int)86);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl439
            }
lbl231:
            // 6 sources

            case 17: {
                var15_3 /* !! */  = (int)hr.btxb("buej", btwu(int ), (int)87);
                if (!var16_2) break;
                throw null;
            }
            case 18: {
                var15_3 /* !! */  = (int)hr.btxb("buel", btwu(int ), (int)88);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl240:
            // 2 sources

            case 19: {
                var15_3 /* !! */  = (int)hr.btxb("buen", btwu(int ), (int)89);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl245:
            // 2 sources

            case 20: {
                var15_3 /* !! */  = (int)hr.btxb("bueo", btwu(int ), (int)90);
                if (!var16_2) ** GOTO lbl231
                throw null;
            }
lbl249:
            // 2 sources

            case 21: {
                var15_3 /* !! */  = (int)hr.btxb("buep", btwu(int ), (int)91);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl254:
            // 3 sources

            case 22: {
                var15_3 /* !! */  = (int)hr.btxb("buer", btwu(int ), (int)92);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl259:
            // 2 sources

            case 23: {
                var15_3 /* !! */  = (int)hr.btxb("bues", btwu(int ), (int)93);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl264:
            // 3 sources

            case 24: {
                var15_3 /* !! */  = (int)hr.btxb("bueu", btwu(int ), (int)94);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl465
            }
            case 25: {
                var15_3 /* !! */  = (int)hr.btxb("buev", btwu(int ), (int)95);
                if (!var16_2) ** GOTO lbl254
                throw null;
            }
            case 26: {
                var15_3 /* !! */  = (int)hr.btxb("bufa", btwu(int ), (int)96);
                if (!var16_2) ** GOTO lbl187
                throw null;
            }
            case 27: {
                var15_3 /* !! */  = (int)hr.btxb("bufb", btwu(int ), (int)97);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl282:
            // 3 sources

            case 28: {
                var15_3 /* !! */  = (int)hr.btxb("bufd", btwu(int ), (int)98);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl287:
            // 2 sources

            case 29: {
                var15_3 /* !! */  = (int)hr.btxb("bufe", btwu(int ), (int)99);
                if (!var16_2) ** GOTO lbl162
                throw null;
            }
lbl291:
            // 2 sources

            case 30: {
                var15_3 /* !! */  = (int)hr.btxb("buff", btwu(int ), (int)100);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl388
            }
            case 31: {
                var15_3 /* !! */  = (int)hr.btxb("bufg", btwu(int ), (int)101);
                if (!var16_2) ** GOTO lbl249
                throw null;
            }
lbl300:
            // 3 sources

            case 32: {
                var15_3 /* !! */  = (int)hr.btxb("bufi", btwu(int ), (int)102);
                if (!var16_2) ** GOTO lbl182
                throw null;
            }
lbl304:
            // 4 sources

            case 33: {
                var15_3 /* !! */  = (int)hr.btxb("bufj", btwu(int ), (int)103);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl490
            }
lbl309:
            // 2 sources

            case 34: {
                var15_3 /* !! */  = (int)hr.btxb("bufk", btwu(int ), (int)104);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl314:
            // 4 sources

            case 35: {
                var15_3 /* !! */  = (int)hr.btxb("bufl", btwu(int ), (int)105);
                if (!var16_2) ** GOTO lbl304
                throw null;
            }
lbl318:
            // 2 sources

            case 36: {
                var15_3 /* !! */  = (int)hr.btxb("bufn", btwu(int ), (int)106);
                if (!var16_2) ** GOTO lbl231
                throw null;
            }
lbl322:
            // 3 sources

            case 37: {
                var15_3 /* !! */  = (int)hr.btxb("bufq", btwu(int ), (int)107);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl444
            }
            case 38: {
                var15_3 /* !! */  = (int)hr.btxb("bufs", btwu(int ), (int)108);
                if (!var16_2) ** GOTO lbl217
                throw null;
            }
lbl331:
            // 3 sources

            case 39: {
                var15_3 /* !! */  = (int)hr.btxb("buft", btwu(int ), (int)109);
                if (!var16_2) ** GOTO lbl162
                throw null;
            }
lbl335:
            // 3 sources

            case 40: {
                var15_3 /* !! */  = (int)hr.btxb("bufu", btwu(int ), (int)110);
                if (!var16_2) ** GOTO lbl240
                throw null;
            }
lbl339:
            // 3 sources

            case 41: {
                var15_3 /* !! */  = (int)hr.btxb("bufx", btwu(int ), (int)111);
                if (!var16_2) ** GOTO lbl254
                throw null;
            }
lbl343:
            // 2 sources

            case 42: {
                var15_3 /* !! */  = (int)hr.btxb("bufy", btwu(int ), (int)112);
                if (!var16_2) ** GOTO lbl177
                throw null;
            }
            case 43: {
                var15_3 /* !! */  = (int)hr.btxb("bugb", btwu(int ), (int)113);
                if (!var16_2) ** GOTO lbl231
                throw null;
            }
lbl351:
            // 2 sources

            case 44: {
                var15_3 /* !! */  = (int)hr.btxb("bugd", btwu(int ), (int)114);
                if (!var16_2) ** GOTO lbl300
                throw null;
            }
lbl355:
            // 3 sources

            case 45: {
                var15_3 /* !! */  = (int)hr.btxb("bugf", btwu(int ), (int)115);
                if (!var16_2) ** GOTO lbl314
                throw null;
            }
            case 46: {
                var15_3 /* !! */  = (int)hr.btxb("bugg", btwu(int ), (int)116);
                if (!var16_2) ** GOTO lbl192
                throw null;
            }
            case 47: {
                var15_3 /* !! */  = (int)hr.btxb("bugi", btwu(int ), (int)117);
                if (!var16_2) ** GOTO lbl264
                throw null;
            }
lbl367:
            // 2 sources

            case 48: {
                var15_3 /* !! */  = (int)hr.btxb("bugl", btwu(int ), (int)118);
                if (!var16_2) ** GOTO lbl282
                throw null;
            }
            case 49: {
                var15_3 /* !! */  = (int)hr.btxb("bugn", btwu(int ), (int)119);
                if (!var16_2) ** GOTO lbl282
                throw null;
            }
lbl375:
            // 3 sources

            case 50: {
                var15_3 /* !! */  = (int)hr.btxb("bugr", btwu(int ), (int)120);
                if (!var16_2) ** GOTO lbl207
                throw null;
            }
lbl379:
            // 2 sources

            case 51: {
                var15_3 /* !! */  = (int)hr.btxb("bugu", btwu(int ), (int)121);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl384:
            // 3 sources

            case 52: {
                var15_3 /* !! */  = (int)hr.btxb("bugw", btwu(int ), (int)122);
                if (!var16_2) ** GOTO lbl331
                throw null;
            }
lbl388:
            // 3 sources

            case 53: {
                var15_3 /* !! */  = (int)hr.btxb("buha", btwu(int ), (int)123);
                if (!var16_2) ** GOTO lbl335
                throw null;
            }
lbl392:
            // 2 sources

            case 54: {
                do {
                    var15_3 /* !! */  = (int)hr.btxb("buhc", btwu(int ), (int)124);
                } while (!var16_2);
                throw null;
            }
            case 55: {
                var15_3 /* !! */  = (int)hr.btxb("buhd", btwu(int ), (int)125);
                if (!var16_2) ** GOTO lbl318
                throw null;
            }
lbl401:
            // 2 sources

            case 56: {
                var15_3 /* !! */  = (int)hr.btxb("buhe", btwu(int ), (int)126);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl465
            }
            case 57: {
                var15_3 /* !! */  = (int)hr.btxb("buhf", btwu(int ), (int)127);
                if (!var16_2) ** GOTO lbl388
                throw null;
            }
lbl410:
            // 2 sources

            case 58: {
                var15_3 /* !! */  = (int)hr.btxb("buhj", btwu(int ), (int)128);
                if (!var16_2) ** GOTO lbl379
                throw null;
            }
            case 59: {
                var15_3 /* !! */  = (int)hr.btxb("buhm", btwu(int ), (int)129);
                if (!var16_2) ** GOTO lbl384
                throw null;
            }
            case 60: {
                var15_3 /* !! */  = (int)hr.btxb("buhp", btwu(int ), (int)130);
                if (!var16_2) ** GOTO lbl147
                throw null;
            }
lbl422:
            // 2 sources

            case 61: {
                var15_3 /* !! */  = (int)hr.btxb("buhq", btwu(int ), (int)131);
                if (!var16_2) ** GOTO lbl259
                throw null;
            }
            case 62: {
                var15_3 /* !! */  = (int)hr.btxb("buhs", btwu(int ), (int)132);
                if (!var16_2) ** GOTO lbl367
                throw null;
            }
            case 63: {
                var15_3 /* !! */  = (int)hr.btxb("buhv", btwu(int ), (int)133);
                if (!var16_2) ** GOTO lbl304
                throw null;
            }
lbl434:
            // 3 sources

            case 64: {
                var15_3 /* !! */  = (int)hr.btxb("buhx", btwu(int ), (int)134);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl439:
            // 2 sources

            case 65: {
                var15_3 /* !! */  = (int)hr.btxb("buib", btwu(int ), (int)135);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl499
            }
lbl444:
            // 2 sources

            case 66: {
                var15_3 /* !! */  = (int)hr.btxb("buic", btwu(int ), (int)136);
                if (!var16_2) ** GOTO lbl264
                throw null;
            }
            case 67: {
                var15_3 /* !! */  = (int)hr.btxb("buid", btwu(int ), (int)137);
                if (!var16_2) ** GOTO lbl351
                throw null;
            }
            case 68: {
                var15_3 /* !! */  = (int)hr.btxb("buih", btwu(int ), (int)138);
                if (!var16_2) ** GOTO lbl401
                throw null;
            }
            case 69: {
                var15_3 /* !! */  = (int)hr.btxb("buil", btwu(int ), (int)139);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl490
            }
            case 70: {
                var15_3 /* !! */  = (int)hr.btxb("buir", btwu(int ), (int)140);
                if (!var16_2) ** GOTO lbl291
                throw null;
            }
lbl465:
            // 3 sources

            case 71: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var15_3 /* !! */  = (int)hr.btxb("buiv", btwu(int ), (int)141);
                    if (!var16_2) ** GOTO lbl309
                    throw null;
                }
            }
            case 72: {
                var15_3 /* !! */  = (int)hr.btxb("bujc", btwu(int ), (int)142);
                if (!var16_2) ** GOTO lbl331
                throw null;
            }
lbl474:
            // 3 sources

            case 73: {
                var15_3 /* !! */  = (int)hr.btxb("buji", btwu(int ), (int)143);
                if (!var16_2) ** GOTO lbl300
                throw null;
            }
lbl478:
            // 2 sources

            case 74: {
                var15_3 /* !! */  = (int)hr.btxb("bujm", btwu(int ), (int)144);
                if (!var16_2) ** GOTO lbl474
                throw null;
            }
            case 75: {
                var15_3 /* !! */  = (int)hr.btxb("bujr", btwu(int ), (int)145);
                if (!var16_2) ** GOTO lbl392
                throw null;
            }
            case 76: {
                var15_3 /* !! */  = (int)hr.btxb("bujw", btwu(int ), (int)146);
                if (!var16_2) ** GOTO lbl314
                throw null;
            }
lbl490:
            // 4 sources

            case 77: {
                var15_3 /* !! */  = (int)hr.btxb("buka", btwu(int ), (int)147);
                if (var16_2) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 78: {
                var15_3 /* !! */  = (int)hr.btxb("buke", btwu(int ), (int)148);
                if (!var16_2) ** GOTO lbl287
                throw null;
            }
lbl499:
            // 4 sources

            case 79: {
                var15_3 /* !! */  = (int)hr.btxb("bukp", btwu(int ), (int)149);
                if (!var16_2) ** GOTO lbl231
                throw null;
            }
            case 80: 
        }
        var15_3 /* !! */  = (int)hr.btxb("bukr", btwu(int ), (int)150);
        ** while (!var16_2)
lbl506:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdx() {
        hr.btxj[300] = -2622864588337387468L;
        hr.btxj[301] = 2048380264874241205L;
        hr.btxj[302] = -6349965531961061122L;
        hr.btxj[303] = 1476586328969142307L;
        hr.btxj[304] = -3807163091805675500L;
        hr.btxj[305] = -8711378301648421907L;
        hr.btxj[306] = -606056619518123898L;
        hr.btxj[307] = -6199284083689213146L;
        hr.btxj[308] = 5507222866693020190L;
        hr.btxj[309] = -7616631282357506919L;
        hr.btxj[310] = 8068678771218396193L;
        hr.btxj[311] = -7862622662020614348L;
        hr.btxj[312] = -568321107688476023L;
        hr.btxj[313] = 1177053395319818896L;
        hr.btxj[314] = -2076813429624914595L;
        hr.btxj[315] = -4828589925203388305L;
        hr.btxj[316] = -4958989357347512182L;
        hr.btxj[317] = -6218834660692978719L;
        hr.btxj[318] = -9091410115394293687L;
        hr.btxj[319] = -1378663416189817916L;
        hr.btxj[320] = 5462556529172256888L;
        hr.btxj[321] = 663747796899214448L;
        hr.btxj[322] = -643190218219261675L;
        hr.btxj[323] = -2379805069477539441L;
        hr.btxj[324] = 716580285001835129L;
        hr.btxj[325] = -2271976792650391511L;
        hr.btxj[326] = 8071000501328772141L;
        hr.btxj[327] = 6451505892245286766L;
        hr.btxj[328] = 4125695921356471639L;
        hr.btxj[329] = -3601530268590303371L;
        hr.btxj[330] = 8933639943741530897L;
        hr.btxj[331] = 286144325319866711L;
        hr.btxj[332] = -4125264096713554484L;
        hr.btxj[333] = 6628309287798088182L;
        hr.btxj[334] = 4383634030189776299L;
        hr.btxj[335] = -4164115390759597980L;
        hr.btxj[336] = 2981466345676333930L;
        hr.btxj[337] = -3574605623468459610L;
        hr.btxj[338] = 8100776191568560870L;
        hr.btxj[339] = -2764048384995676844L;
        hr.btxj[340] = -4226635105416165170L;
        hr.btxj[341] = 6181372663562490571L;
        hr.btxj[342] = -1930649282252957143L;
        hr.btxj[343] = 7705740664710815349L;
        hr.btxj[344] = -611528955102242241L;
        hr.btxj[345] = 4191913823687533230L;
        hr.btxj[346] = 6795524424955569177L;
        hr.btxj[347] = 597124955733103818L;
        hr.btxj[348] = 2591241893807040182L;
        hr.btxj[349] = 7983094589346318784L;
        hr.btxj[350] = -2447570356784871770L;
        hr.btxj[351] = 3237457694219450702L;
        hr.btxj[352] = 5508231232210405309L;
        hr.btxj[353] = -4244732525319481335L;
        hr.btxj[354] = 8270507712122160557L;
        hr.btxj[355] = 6634914686369288008L;
        hr.btxj[356] = 7202669329403018968L;
        hr.btxj[357] = 5887267187939182383L;
        hr.btxj[358] = 4983287579166487206L;
        hr.btxj[359] = 2624695695607916928L;
        hr.btxj[360] = 8588029878890977610L;
        hr.btxj[361] = -5852675032673455427L;
        hr.btxj[362] = 3946295136013311970L;
        hr.btxj[363] = -6826340520359551878L;
        hr.btxj[364] = 3316731806401117672L;
        hr.btxj[365] = 5026846775689119735L;
        hr.btxj[366] = 6112488603564461627L;
        hr.btxj[367] = 5458294106057346395L;
        hr.btxj[368] = -5269735417114856113L;
        hr.btxj[369] = -7558526069155588614L;
        hr.btxj[370] = 3148234401395267389L;
        hr.btxj[371] = -2113163506759048538L;
        hr.btxj[372] = 2505877998063562098L;
        hr.btxj[373] = -612993523984978868L;
        hr.btxj[374] = 7994556028324061762L;
        hr.btxj[375] = -8426578667089620464L;
        hr.btxj[376] = -1809904869425106854L;
        hr.btxj[377] = 2124179294903525109L;
        hr.btxj[378] = -872094155054337249L;
        hr.btxj[379] = 1393785119920941071L;
        hr.btxj[380] = -6313165726107391940L;
        hr.btxj[381] = -7608123314103775847L;
        hr.btxj[382] = -4366763207737878257L;
        hr.btxj[383] = 7430090314677727301L;
        hr.btxj[384] = -5049259753555034669L;
        hr.btxj[385] = -816231771327109573L;
        hr.btxj[386] = -1978994878972266294L;
        hr.btxj[387] = 4906527174070095153L;
        hr.btxj[388] = -4104404497422282367L;
        hr.btxj[389] = -8112928345224251861L;
        hr.btxj[390] = 3468811824277855835L;
        hr.btxj[391] = 8844078114762949386L;
        hr.btxj[392] = 3267613279558371082L;
        hr.btxj[393] = -2247062246858840525L;
        hr.btxj[394] = -174831921694466466L;
        hr.btxj[395] = -2225293457398835693L;
        hr.btxj[396] = 906999186598604917L;
        hr.btxj[397] = 578412645118596591L;
        hr.btxj[398] = -4733643652653609655L;
        hr.btxj[399] = 5266968742349946708L;
    }

    private static /* synthetic */ void bxdk() {
        hr.btwz[0] = -1995407043;
        hr.btwz[1] = -1281102116;
        hr.btwz[2] = -187965509;
        hr.btwz[3] = -1154023259;
        hr.btwz[4] = 1042496028;
        hr.btwz[5] = 1496308851;
        hr.btwz[6] = -1765134323;
        hr.btwz[7] = 1911631749;
        hr.btwz[8] = 1464986679;
        hr.btwz[9] = -324129731;
        hr.btwz[10] = 259005908;
        hr.btwz[11] = 422287048;
        hr.btwz[12] = -224485209;
        hr.btwz[13] = -434208365;
        hr.btwz[14] = -602778260;
        hr.btwz[15] = 915164039;
        hr.btwz[16] = 1702523577;
        hr.btwz[17] = -1993785470;
        hr.btwz[18] = 72527454;
        hr.btwz[19] = -192068779;
        hr.btwz[20] = -1425235600;
        hr.btwz[21] = 341429839;
        hr.btwz[22] = -1786237633;
        hr.btwz[23] = 823705381;
        hr.btwz[24] = -1096732809;
        hr.btwz[25] = 849796223;
        hr.btwz[26] = 181858580;
        hr.btwz[27] = -1656281454;
        hr.btwz[28] = 407405607;
        hr.btwz[29] = 159073534;
        hr.btwz[30] = -705917130;
        hr.btwz[31] = -164686517;
        hr.btwz[32] = -380512609;
        hr.btwz[33] = -106743617;
        hr.btwz[34] = -1581170318;
        hr.btwz[35] = -150502293;
        hr.btwz[36] = -368154991;
        hr.btwz[37] = 141522072;
        hr.btwz[38] = 523284511;
        hr.btwz[39] = 1580453117;
        hr.btwz[40] = 333522558;
        hr.btwz[41] = 725315946;
        hr.btwz[42] = 1435289970;
        hr.btwz[43] = -2102473022;
        hr.btwz[44] = 962745635;
        hr.btwz[45] = 425980548;
        hr.btwz[46] = -2001323504;
        hr.btwz[47] = -918864079;
        hr.btwz[48] = -1566655950;
        hr.btwz[49] = -1314023864;
        hr.btwz[50] = 451631844;
        hr.btwz[51] = -895785794;
        hr.btwz[52] = -4097467;
        hr.btwz[53] = -571388657;
        hr.btwz[54] = -1036539854;
        hr.btwz[55] = 1467138655;
        hr.btwz[56] = 1710405135;
        hr.btwz[57] = 484366922;
        hr.btwz[58] = 897258988;
        hr.btwz[59] = 1335392075;
        hr.btwz[60] = 1076127956;
        hr.btwz[61] = -1006386199;
        hr.btwz[62] = -324938428;
        hr.btwz[63] = 298407684;
        hr.btwz[64] = 2066364954;
        hr.btwz[65] = -1773710337;
        hr.btwz[66] = 1478123394;
        hr.btwz[67] = -99287656;
        hr.btwz[68] = 17839776;
        hr.btwz[69] = 1257410726;
        hr.btwz[70] = -970925546;
        hr.btwz[71] = 1498506274;
        hr.btwz[72] = 1315939471;
        hr.btwz[73] = 291851807;
        hr.btwz[74] = 374614000;
        hr.btwz[75] = -1433093737;
        hr.btwz[76] = 2092984047;
        hr.btwz[77] = 1544011582;
        hr.btwz[78] = -25543665;
        hr.btwz[79] = -1251114050;
        hr.btwz[80] = 697869404;
        hr.btwz[81] = 1276782596;
        hr.btwz[82] = 1939767640;
        hr.btwz[83] = 814566528;
        hr.btwz[84] = -1011636999;
        hr.btwz[85] = -570780019;
        hr.btwz[86] = 1376676776;
        hr.btwz[87] = 1226465121;
        hr.btwz[88] = -961274973;
        hr.btwz[89] = 2089993772;
        hr.btwz[90] = 2053473836;
        hr.btwz[91] = -484353202;
        hr.btwz[92] = -1926934935;
        hr.btwz[93] = 1495175380;
        hr.btwz[94] = -1155820817;
        hr.btwz[95] = 803708056;
        hr.btwz[96] = -1870540228;
        hr.btwz[97] = -593653063;
        hr.btwz[98] = 1243385780;
        hr.btwz[99] = 1399571264;
    }

    private static /* synthetic */ void bxdb() {
        hr.btwx[100] = 406703535;
        hr.btwx[101] = -1203182550;
        hr.btwx[102] = -1575242700;
        hr.btwx[103] = -1015948942;
        hr.btwx[104] = -1774323652;
        hr.btwx[105] = -1668280872;
        hr.btwx[106] = -120603507;
        hr.btwx[107] = 340581975;
        hr.btwx[108] = -805059248;
        hr.btwx[109] = -256992462;
        hr.btwx[110] = 2002261931;
        hr.btwx[111] = 1383053598;
        hr.btwx[112] = -1150650361;
        hr.btwx[113] = 706604786;
        hr.btwx[114] = -101726401;
        hr.btwx[115] = 1609291717;
        hr.btwx[116] = -614987484;
        hr.btwx[117] = -1589822192;
        hr.btwx[118] = -1995699303;
        hr.btwx[119] = 581173225;
        hr.btwx[120] = 1468013084;
        hr.btwx[121] = 566481727;
        hr.btwx[122] = 2035428362;
        hr.btwx[123] = 2002653357;
        hr.btwx[124] = -511284838;
        hr.btwx[125] = -2010118319;
        hr.btwx[126] = 984674622;
        hr.btwx[127] = -1354317681;
        hr.btwx[128] = 1286698541;
        hr.btwx[129] = -1280868111;
        hr.btwx[130] = 1050648951;
        hr.btwx[131] = -182020974;
        hr.btwx[132] = 322260447;
        hr.btwx[133] = 65254386;
        hr.btwx[134] = -78799980;
        hr.btwx[135] = -172517196;
        hr.btwx[136] = -1742096959;
        hr.btwx[137] = -1089489432;
        hr.btwx[138] = 984275884;
        hr.btwx[139] = -276849319;
        hr.btwx[140] = -155312311;
        hr.btwx[141] = -1305816028;
        hr.btwx[142] = 2044919776;
        hr.btwx[143] = 1250622443;
        hr.btwx[144] = -2123290829;
        hr.btwx[145] = 1775601714;
        hr.btwx[146] = -714496607;
        hr.btwx[147] = -1281349591;
        hr.btwx[148] = -1908899171;
        hr.btwx[149] = -1482377240;
        hr.btwx[150] = -1605357657;
        hr.btwx[151] = -2089723818;
        hr.btwx[152] = -1622498361;
        hr.btwx[153] = -503803655;
        hr.btwx[154] = 1774409228;
        hr.btwx[155] = -1513298634;
        hr.btwx[156] = -2029405417;
        hr.btwx[157] = 360068092;
        hr.btwx[158] = -1683838768;
        hr.btwx[159] = -359799438;
        hr.btwx[160] = 825104058;
        hr.btwx[161] = 1089348675;
        hr.btwx[162] = -1800158695;
        hr.btwx[163] = 1469566983;
        hr.btwx[164] = -705377490;
        hr.btwx[165] = 1979952122;
        hr.btwx[166] = 908481376;
        hr.btwx[167] = -1889120959;
        hr.btwx[168] = 950235308;
        hr.btwx[169] = 792606792;
        hr.btwx[170] = -1854684661;
        hr.btwx[171] = -70547877;
        hr.btwx[172] = 1472281583;
        hr.btwx[173] = -327239838;
        hr.btwx[174] = -1244749269;
        hr.btwx[175] = 2066547028;
        hr.btwx[176] = 914757732;
        hr.btwx[177] = -1539353293;
        hr.btwx[178] = 1952909507;
        hr.btwx[179] = 1199692608;
        hr.btwx[180] = 1140262796;
        hr.btwx[181] = -1415414529;
        hr.btwx[182] = 2108022791;
        hr.btwx[183] = 922966122;
        hr.btwx[184] = 818987660;
        hr.btwx[185] = 326823691;
        hr.btwx[186] = 1426279470;
        hr.btwx[187] = -391434727;
        hr.btwx[188] = 327567421;
        hr.btwx[189] = 755382252;
        hr.btwx[190] = -481027826;
        hr.btwx[191] = -189958362;
        hr.btwx[192] = -811473133;
        hr.btwx[193] = 1908329668;
        hr.btwx[194] = 552639457;
        hr.btwx[195] = -1937933850;
        hr.btwx[196] = -823803596;
        hr.btwx[197] = -344959261;
        hr.btwx[198] = -1079130635;
        hr.btwx[199] = 1487988397;
    }

    public static /* synthetic */ CallSite btxb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isIgnoredFriend(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hr.ei - hr.btxb("bvdk", btxi(int ), (int)132)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hr.btxb("bvdl", btwu(int ), (int)350)) break;
            v0 /* !! */  = (long)hr.btxb("bvdm", btwu(int ), (int)351);
        }
        var5_2 = hr.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hr.ei - hr.btxb("bvdn", btxi(int ), (int)133)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hr.btxb("bvdo", btwu(int ), (int)352)) break;
            v1 /* !! */  = (long)hr.btxb("bvdp", btwu(int ), (int)353);
        }
        var4_3 /* !! */  = hr.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hr.ei - hr.btxb("bvdq", btxi(int ), (int)134)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hr.btxb("bvdr", btwu(int ), (int)354)) break;
            v2 /* !! */  = (long)hr.btxb("bvds", btwu(int ), (int)355);
        }
        var3_4 = hr.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_2) {
                    throw null;
lbl27:
                    // 6 sources

                    return (boolean)hr.btxb("bvdt", btwu(int ), (int)356);
                }
                if (var3_4 || var3_4) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hr.ei - hr.btxb("bvdu", btxi(int ), (int)135)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hr.btxb("bvdv", btwu(int ), (int)357)) break;
                    v3 /* !! */  = (long)hr.btxb("bvdw", btwu(int ), (int)358);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = hr.ei - hr.btxb("bvdx", btxi(int ), (int)136)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hr.btxb("bvdy", btwu(int ), (int)359)) break;
                    v4 /* !! */  = (long)hr.btxb("bvdz", btwu(int ), (int)360);
                }
                if (!this.ignoreFriends.isValue()) ** GOTO lbl51
                if (var3_4) ** GOTO lbl27
                if (!(var1_1 instanceof class_1657)) ** GOTO lbl51
                if (var3_4) ** GOTO lbl27
                var2_5 = (class_1657)var1_1;
                if (var3_4 || var3_4) ** GOTO lbl27
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl53
lbl51:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl27
                return (boolean)hr.btxb("bvea", btwu(int ), (int)361);
lbl53:
                // 1 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_5 = hr.ei - hr.btxb("bveb", btxi(int ), (int)137)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hr.btxb("bvec", btwu(int ), (int)362)) break;
                    v5 /* !! */  = (long)hr.btxb("bved", btwu(int ), (int)363);
                }
                return dl.isFriend((class_1297)var2_5);
            }
lbl62:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)hr.btxb("bvee", btwu(int ), (int)364);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl67:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)hr.btxb("bvef", btwu(int ), (int)365);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 2: {
                var4_3 /* !! */  = (int)hr.btxb("bveg", btwu(int ), (int)366);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 3: {
                var4_3 /* !! */  = (int)hr.btxb("bveh", btwu(int ), (int)367);
                if (var5_2) {
                    throw null;
                }
            }
lbl81:
            // 4 sources

            case 4: {
                var4_3 /* !! */  = (int)hr.btxb("bvei", btwu(int ), (int)368);
                if (!var5_2) ** GOTO lbl62
                throw null;
            }
lbl85:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)hr.btxb("bvej", btwu(int ), (int)369);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl90:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)hr.btxb("bvek", btwu(int ), (int)370);
                if (var5_2) {
                    throw null;
                }
            }
lbl94:
            // 5 sources

            case 7: {
                var4_3 /* !! */  = (int)hr.btxb("bvel", btwu(int ), (int)371);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 8: {
                var4_3 /* !! */  = (int)hr.btxb("bvem", btwu(int ), (int)372);
                if (!var5_2) ** GOTO lbl67
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hr.btxb("bven", btwu(int ), (int)373);
                    if (!var5_2) ** GOTO lbl94
                    throw null;
                }
            }
            case 10: {
                var4_3 /* !! */  = (int)hr.btxb("bveo", btwu(int ), (int)374);
                if (!var5_2) ** GOTO lbl81
                throw null;
            }
lbl112:
            // 4 sources

            case 11: {
                var4_3 /* !! */  = (int)hr.btxb("bvep", btwu(int ), (int)375);
                if (!var5_2) ** GOTO lbl85
                throw null;
            }
            case 12: 
        }
        var4_3 /* !! */  = (int)hr.btxb("bveq", btwu(int ), (int)376);
        ** while (!var5_2)
lbl119:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxdl() {
        hr.btwz[100] = 406703586;
        hr.btwz[101] = -1203182538;
        hr.btwz[102] = -1575242747;
        hr.btwz[103] = -1015948939;
        hr.btwz[104] = -1774323664;
        hr.btwz[105] = -1668280847;
        hr.btwz[106] = -120603508;
        hr.btwz[107] = 340581978;
        hr.btwz[108] = -805059208;
        hr.btwz[109] = -256992452;
        hr.btwz[110] = 2002261920;
        hr.btwz[111] = 1383053579;
        hr.btwz[112] = -1150650305;
        hr.btwz[113] = 706604734;
        hr.btwz[114] = -101726430;
        hr.btwz[115] = 1609291745;
        hr.btwz[116] = -614987469;
        hr.btwz[117] = -1589822126;
        hr.btwz[118] = -1995699318;
        hr.btwz[119] = 581173237;
        hr.btwz[120] = 1468013147;
        hr.btwz[121] = 566481710;
        hr.btwz[122] = 2035428412;
        hr.btwz[123] = 2002653411;
        hr.btwz[124] = -511284848;
        hr.btwz[125] = -2010118329;
        hr.btwz[126] = 984674592;
        hr.btwz[127] = -1354317617;
        hr.btwz[128] = 1286698539;
        hr.btwz[129] = -1280868108;
        hr.btwz[130] = 1050648945;
        hr.btwz[131] = -182020947;
        hr.btwz[132] = 322260479;
        hr.btwz[133] = 65254353;
        hr.btwz[134] = -78799917;
        hr.btwz[135] = -172517188;
        hr.btwz[136] = -1742097015;
        hr.btwz[137] = -1089489435;
        hr.btwz[138] = 984275883;
        hr.btwz[139] = -276849326;
        hr.btwz[140] = -155312282;
        hr.btwz[141] = -1305816057;
        hr.btwz[142] = 2044919723;
        hr.btwz[143] = 1250622431;
        hr.btwz[144] = -2123290876;
        hr.btwz[145] = 1775601788;
        hr.btwz[146] = -714496597;
        hr.btwz[147] = -1281349589;
        hr.btwz[148] = -1908899172;
        hr.btwz[149] = -1482377243;
        hr.btwz[150] = -1605357633;
        hr.btwz[151] = -2089723817;
        hr.btwz[152] = 1888110213;
        hr.btwz[153] = 503803654;
        hr.btwz[154] = -2045039177;
        hr.btwz[155] = 1513298633;
        hr.btwz[156] = -2029405418;
        hr.btwz[157] = -1744933631;
        hr.btwz[158] = 1683838767;
        hr.btwz[159] = 184046312;
        hr.btwz[160] = 825104049;
        hr.btwz[161] = 1089348679;
        hr.btwz[162] = -1800158701;
        hr.btwz[163] = 1469566991;
        hr.btwz[164] = -705377495;
        hr.btwz[165] = 1979952114;
        hr.btwz[166] = 908481385;
        hr.btwz[167] = -1889120954;
        hr.btwz[168] = 950235310;
        hr.btwz[169] = 792606793;
        hr.btwz[170] = -1854684669;
        hr.btwz[171] = -70547879;
        hr.btwz[172] = -1472281584;
        hr.btwz[173] = -1140750814;
        hr.btwz[174] = 1244749268;
        hr.btwz[175] = 599974187;
        hr.btwz[176] = -914757733;
        hr.btwz[177] = -53512553;
        hr.btwz[178] = 1952909506;
        hr.btwz[179] = 1199692609;
        hr.btwz[180] = -31427233;
        hr.btwz[181] = -1415414529;
        hr.btwz[182] = 2108022790;
        hr.btwz[183] = -1011805135;
        hr.btwz[184] = -818987661;
        hr.btwz[185] = -79467287;
        hr.btwz[186] = 1426279471;
        hr.btwz[187] = -1375203285;
        hr.btwz[188] = -327567422;
        hr.btwz[189] = 1959541521;
        hr.btwz[190] = 481027825;
        hr.btwz[191] = 391861003;
        hr.btwz[192] = -811473134;
        hr.btwz[193] = -638750320;
        hr.btwz[194] = -552639458;
        hr.btwz[195] = -360033978;
        hr.btwz[196] = -823803595;
        hr.btwz[197] = -344959261;
        hr.btwz[198] = -1079130637;
        hr.btwz[199] = 1487988399;
    }
}

