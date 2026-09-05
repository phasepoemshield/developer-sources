/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  org.joml.Matrix4f
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Matrix4f;
import ruhack.phobia.ki;
import ruhack.phobia.kr;
import ruhack.phobia.ks;
import ruhack.phobia.kt;
import ruhack.phobia.kv;

public class kq {
    static public final boolean c;
    static private long[] hijq;
    static private int[] hijx;
    static private boolean fontsReady;
    static public final int b;
    static private final long ok = 6377909431783813496L;
    static private boolean useFallback;
    static public final boolean a;
    static private int[] hijy;
    static private long[] hijr;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void lambda$textColored$4(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int[] var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjyw", hijp(int ), (int)318)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjyx", hijw(int ), (int)747)) break;
            v0 /* !! */  = (long)kq.hijs("hjyy", hijw(int ), (int)748);
        }
        var9_7 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjyz", hijp(int ), (int)319)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kq.hijs("hjza", hijw(int ), (int)749)) break;
            v1 /* !! */  = (long)kq.hijs("hjzb", hijw(int ), (int)750);
        }
        var8_8 /* !! */  = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl17
        block13: while (true) {
            v2 /* !! */  = (long)(kq.hijs("hjzd", hijp(int ), (int)321) - kq.hijs("hjzc", hijp(int ), (int)320));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 722891128: {
                    break block13;
                }
                case 761618581: {
                    continue block13;
                }
            }
            break;
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl25
        v3 = kq.hijs("hjze", hijw(int ), (int)751);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjzf", hijp(int ), (int)322)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kq.hijs("hjzg", hijw(int ), (int)752)) break;
            v4 /* !! */  = (long)kq.hijs("hjzh", hijw(int ), (int)753);
        }
        kq.textColored(var0, var1_1, var2_2, var3_3, var4_4, var5_5, (boolean)v3, var6_6);
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var7_9) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjzi", hijw(int ), (int)754);
                } while (!var9_7);
                throw null;
            }
            case 1: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjzj", hijw(int ), (int)755);
                } while (!var9_7);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_8 /* !! */  = (int)kq.hijs("hjzk", hijw(int ), (int)756);
                    if (!var9_7) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjzl", hijw(int ), (int)757);
                } while (!var9_7);
                throw null;
            }
            case 4: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hjzm", hijw(int ), (int)758);
        ** while (!var9_7)
lbl64:
        // 1 sources

        throw null;
    }

    private static void hkcr() {
        kq.hijy[100] = 915108353;
        kq.hijy[101] = -1852561488;
        kq.hijy[102] = 1876655912;
        kq.hijy[103] = -468665413;
        kq.hijy[104] = 109928151;
        kq.hijy[105] = 927393199;
        kq.hijy[106] = -1525361933;
        kq.hijy[107] = -1949837808;
        kq.hijy[108] = 1030176919;
        kq.hijy[109] = 1862342184;
        kq.hijy[110] = -1444712691;
        kq.hijy[111] = 1935187305;
        kq.hijy[112] = 1296794172;
        kq.hijy[113] = -2006638281;
        kq.hijy[114] = -1365380881;
        kq.hijy[115] = -1701249697;
        kq.hijy[116] = -332131424;
        kq.hijy[117] = -665603416;
        kq.hijy[118] = 855319588;
        kq.hijy[119] = -455844658;
        kq.hijy[120] = 1728108581;
        kq.hijy[121] = -1104963671;
        kq.hijy[122] = 1137937636;
        kq.hijy[123] = 2117221568;
        kq.hijy[124] = -466240955;
        kq.hijy[125] = 1836624538;
        kq.hijy[126] = -861755790;
        kq.hijy[127] = -1672360302;
        kq.hijy[128] = 1553940535;
        kq.hijy[129] = 2138966612;
        kq.hijy[130] = 2088427508;
        kq.hijy[131] = -1377001219;
        kq.hijy[132] = -108111965;
        kq.hijy[133] = -460892126;
        kq.hijy[134] = 1036347069;
        kq.hijy[135] = 2135410571;
        kq.hijy[136] = -1026042360;
        kq.hijy[137] = -742039156;
        kq.hijy[138] = -1890557657;
        kq.hijy[139] = 712854062;
        kq.hijy[140] = -607418933;
        kq.hijy[141] = -1565714360;
        kq.hijy[142] = 1058960516;
        kq.hijy[143] = 938669164;
        kq.hijy[144] = 1071901943;
        kq.hijy[145] = 485208028;
        kq.hijy[146] = -1041721223;
        kq.hijy[147] = -1844732445;
        kq.hijy[148] = 1779597676;
        kq.hijy[149] = -1215740864;
        kq.hijy[150] = -238656819;
        kq.hijy[151] = -1503663220;
        kq.hijy[152] = -1707275567;
        kq.hijy[153] = -1304639807;
        kq.hijy[154] = -1074873212;
        kq.hijy[155] = 2112577859;
        kq.hijy[156] = 1004187592;
        kq.hijy[157] = 639063335;
        kq.hijy[158] = -249146324;
        kq.hijy[159] = 1882883974;
        kq.hijy[160] = 1865949796;
        kq.hijy[161] = 1248550681;
        kq.hijy[162] = 1341284726;
        kq.hijy[163] = -1020319364;
        kq.hijy[164] = 57515991;
        kq.hijy[165] = -1204404800;
        kq.hijy[166] = 1107004935;
        kq.hijy[167] = -1631850695;
        kq.hijy[168] = -125257873;
        kq.hijy[169] = 1603871147;
        kq.hijy[170] = -126478448;
        kq.hijy[171] = -95889344;
        kq.hijy[172] = -234547325;
        kq.hijy[173] = -617660785;
        kq.hijy[174] = 1260414151;
        kq.hijy[175] = 776210347;
        kq.hijy[176] = -275592240;
        kq.hijy[177] = 1309368826;
        kq.hijy[178] = -1471024928;
        kq.hijy[179] = -941428102;
        kq.hijy[180] = -357682063;
        kq.hijy[181] = -505828381;
        kq.hijy[182] = -811484581;
        kq.hijy[183] = -299544010;
        kq.hijy[184] = -922771710;
        kq.hijy[185] = 361708538;
        kq.hijy[186] = -488546664;
        kq.hijy[187] = 492147451;
        kq.hijy[188] = -163662285;
        kq.hijy[189] = -1047448536;
        kq.hijy[190] = 722753007;
        kq.hijy[191] = -945616676;
        kq.hijy[192] = 905391370;
        kq.hijy[193] = -1578924719;
        kq.hijy[194] = -1432972384;
        kq.hijy[195] = -557872214;
        kq.hijy[196] = 569867649;
        kq.hijy[197] = -1316336264;
        kq.hijy[198] = -165154278;
        kq.hijy[199] = -525987890;
    }

    private static void hkdb() {
        kq.hijq[300] = 612337004643427310L;
        kq.hijq[301] = -8340771083643493992L;
        kq.hijq[302] = -748690034903505990L;
        kq.hijq[303] = -1103342506644606673L;
        kq.hijq[304] = 8552355474553495425L;
        kq.hijq[305] = -5131119074793516455L;
        kq.hijq[306] = 2020959531953615122L;
        kq.hijq[307] = -263045163598137696L;
        kq.hijq[308] = -8899837290985164763L;
        kq.hijq[309] = -8911043886873471711L;
        kq.hijq[310] = -4455613196234496171L;
        kq.hijq[311] = -5388327539326925311L;
        kq.hijq[312] = -3467693532708293717L;
        kq.hijq[313] = -1851059586041726888L;
        kq.hijq[314] = 3636963331168430376L;
        kq.hijq[315] = -256289430423972885L;
        kq.hijq[316] = 2877308286971099898L;
        kq.hijq[317] = -5015938925259018288L;
        kq.hijq[318] = 7599828860139672152L;
        kq.hijq[319] = 8164066795291321343L;
        kq.hijq[320] = -2819656125514492128L;
        kq.hijq[321] = -7764756501730852275L;
        kq.hijq[322] = 4231682958783635956L;
        kq.hijq[323] = -8610767580425427452L;
        kq.hijq[324] = -221944757173223395L;
        kq.hijq[325] = 5423900799524870492L;
        kq.hijq[326] = 6253124002312626500L;
        kq.hijq[327] = -2164855750481869083L;
        kq.hijq[328] = 4962682370720805190L;
        kq.hijq[329] = -4317913396655610263L;
        kq.hijq[330] = -8148888092739551034L;
        kq.hijq[331] = -4626314905963696859L;
        kq.hijq[332] = 207121375565412396L;
        kq.hijq[333] = -5450513172910031185L;
        kq.hijq[334] = -4779129166908858886L;
        kq.hijq[335] = -3672035472354387165L;
        kq.hijq[336] = 6544998190068355905L;
        kq.hijq[337] = -4354451251021881808L;
        kq.hijq[338] = -7881225348525659432L;
        kq.hijq[339] = 9041994385264044605L;
        kq.hijq[340] = 5575425019485961938L;
        kq.hijq[341] = 1450594006580251502L;
        kq.hijq[342] = 1316178257688345014L;
        kq.hijq[343] = -9178394940437977775L;
        kq.hijq[344] = 5907526727834999429L;
        kq.hijq[345] = -2510860008314477210L;
        kq.hijq[346] = -8887339470327124893L;
        kq.hijq[347] = -8957960508196852523L;
        kq.hijq[348] = 4260014284890837046L;
        kq.hijq[349] = -6319711800445332631L;
        kq.hijq[350] = -270143236624024343L;
        kq.hijq[351] = -5164566745720761198L;
        kq.hijq[352] = -6815918495709343250L;
        kq.hijq[353] = -667918595890334826L;
        kq.hijq[354] = 1043810336394955527L;
        kq.hijq[355] = -3411037963849635970L;
        kq.hijq[356] = -3178274870799842598L;
        kq.hijq[357] = -1853613146221181397L;
        kq.hijq[358] = 7463957783946492750L;
        kq.hijq[359] = -7380605455404536591L;
        kq.hijq[360] = -5432347940967065092L;
        kq.hijq[361] = 6663535137343380244L;
    }

    private static void hkcm() {
        kq.hijx[400] = 1349212828;
        kq.hijx[401] = 228956914;
        kq.hijx[402] = -48541954;
        kq.hijx[403] = -1423911990;
        kq.hijx[404] = -1723733241;
        kq.hijx[405] = 222128574;
        kq.hijx[406] = -552611986;
        kq.hijx[407] = -120447123;
        kq.hijx[408] = -328095375;
        kq.hijx[409] = 793167232;
        kq.hijx[410] = -1134950375;
        kq.hijx[411] = 1243370931;
        kq.hijx[412] = -351994308;
        kq.hijx[413] = -1419434266;
        kq.hijx[414] = -1764902436;
        kq.hijx[415] = 1502033072;
        kq.hijx[416] = 2096834876;
        kq.hijx[417] = 1219139805;
        kq.hijx[418] = -1417779999;
        kq.hijx[419] = 66051986;
        kq.hijx[420] = 258934639;
        kq.hijx[421] = 549401372;
        kq.hijx[422] = 1794612999;
        kq.hijx[423] = 1626287614;
        kq.hijx[424] = 1948609662;
        kq.hijx[425] = -687365979;
        kq.hijx[426] = -908796126;
        kq.hijx[427] = -1609345465;
        kq.hijx[428] = -769318865;
        kq.hijx[429] = -381562851;
        kq.hijx[430] = 781551970;
        kq.hijx[431] = 1969328571;
        kq.hijx[432] = -16888229;
        kq.hijx[433] = -552775190;
        kq.hijx[434] = -1218377291;
        kq.hijx[435] = 1523813012;
        kq.hijx[436] = -1591972931;
        kq.hijx[437] = -922457193;
        kq.hijx[438] = 780004588;
        kq.hijx[439] = 1596152813;
        kq.hijx[440] = -686385028;
        kq.hijx[441] = 1230528344;
        kq.hijx[442] = 1649956336;
        kq.hijx[443] = -859416681;
        kq.hijx[444] = 2126207479;
        kq.hijx[445] = -238416507;
        kq.hijx[446] = 914119076;
        kq.hijx[447] = -3422297;
        kq.hijx[448] = 1004931651;
        kq.hijx[449] = -312575674;
        kq.hijx[450] = -130179985;
        kq.hijx[451] = 1432379245;
        kq.hijx[452] = 1147610582;
        kq.hijx[453] = 307837149;
        kq.hijx[454] = -1743157957;
        kq.hijx[455] = 1921356338;
        kq.hijx[456] = 1251942951;
        kq.hijx[457] = 504905022;
        kq.hijx[458] = -3130158;
        kq.hijx[459] = -357764002;
        kq.hijx[460] = -870505812;
        kq.hijx[461] = -635825874;
        kq.hijx[462] = 872934686;
        kq.hijx[463] = 1732643392;
        kq.hijx[464] = 964959694;
        kq.hijx[465] = -188624269;
        kq.hijx[466] = -868159008;
        kq.hijx[467] = 156183423;
        kq.hijx[468] = -417052514;
        kq.hijx[469] = -1676401490;
        kq.hijx[470] = -1083248022;
        kq.hijx[471] = -1411360610;
        kq.hijx[472] = -566240978;
        kq.hijx[473] = 2056824622;
        kq.hijx[474] = -2141842130;
        kq.hijx[475] = -1891652489;
        kq.hijx[476] = -1856575789;
        kq.hijx[477] = 821993616;
        kq.hijx[478] = -791320974;
        kq.hijx[479] = -1080294775;
        kq.hijx[480] = 1351079660;
        kq.hijx[481] = -1746831261;
        kq.hijx[482] = 2139589862;
        kq.hijx[483] = -571845091;
        kq.hijx[484] = 1314377879;
        kq.hijx[485] = -2142306257;
        kq.hijx[486] = -84936812;
        kq.hijx[487] = 849095836;
        kq.hijx[488] = -1471589558;
        kq.hijx[489] = -1019276138;
        kq.hijx[490] = 2142852772;
        kq.hijx[491] = 205806800;
        kq.hijx[492] = -478856400;
        kq.hijx[493] = 1043552985;
        kq.hijx[494] = -1626331692;
        kq.hijx[495] = -573128795;
        kq.hijx[496] = -1449720090;
        kq.hijx[497] = 1541220901;
        kq.hijx[498] = -494671253;
        kq.hijx[499] = -696585374;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void glowText(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int var7_7, float var8_8, boolean var9_9) {
        var13_10 = kq.c;
        var12_11 /* !! */  = kq.b;
        var11_12 = kq.a;
        if (var13_10) {
            throw null;
lbl6:
            // 15 sources

            return;
        }
        if (var12_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_12 || var11_12) ** GOTO lbl6
                if (kq.hasFonts()) ** GOTO lbl15
                if (var11_12 || var11_12) ** GOTO lbl6
                return;
lbl15:
                // 1 sources

                if (var11_12 || var11_12) ** GOTO lbl6
                if (var1_1 != null) ** GOTO lbl20
                if (var11_12 || var11_12) ** GOTO lbl6
                var1_1 = kv.getDefault();
                if (var11_12) ** GOTO lbl6
lbl20:
                // 2 sources

                if (var11_12 || var11_12) ** GOTO lbl6
                if (!var9_9) ** GOTO lbl28
                if (var11_12 || var11_12) ** GOTO lbl6
                var10_13 = var1_1;
                if (var11_12 || var11_12) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$glowText$1(ruhack.phobia.ks java.lang.String float float float int int float ), ()V)((ks)var10_13, (String)var2_2, (float)var3_3, (float)var4_4, (float)var5_5, (int)var6_6, (int)var7_7, (float)var8_8));
                if (var11_12 || var11_12) ** GOTO lbl6
                return;
lbl28:
                // 1 sources

                if (var11_12 || var11_12) ** GOTO lbl6
                if (var1_1 == null) ** GOTO lbl33
                if (var11_12) ** GOTO lbl6
                if (var1_1.isLoaded()) ** GOTO lbl35
                if (var11_12) ** GOTO lbl6
lbl33:
                // 2 sources

                if (var11_12 || var11_12) ** GOTO lbl6
                return;
lbl35:
                // 1 sources

                if (var11_12 || var11_12) ** GOTO lbl6
                kt.drawString(ki.createProjection(), var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, 0.0f);
                if (!var11_12 && !var11_12) ** break;
                ** continue;
                return;
            }
lbl40:
            // 2 sources

            case 0: {
                var12_11 /* !! */  = (int)kq.hijs("hjip", hijw(int ), (int)379);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl45:
            // 2 sources

            case 1: {
                var12_11 /* !! */  = (int)kq.hijs("hjiq", hijw(int ), (int)380);
                if (!var13_10) break;
                throw null;
            }
            case 2: {
                var12_11 /* !! */  = (int)kq.hijs("hjir", hijw(int ), (int)381);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl54:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_11 /* !! */  = (int)kq.hijs("hjis", hijw(int ), (int)382);
                    if (var13_10) {
                        throw null;
                    }
                    ** GOTO lbl117
                    break;
                }
            }
lbl60:
            // 2 sources

            case 4: {
                var12_11 /* !! */  = (int)kq.hijs("hjit", hijw(int ), (int)383);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl65:
            // 2 sources

            case 5: {
                var12_11 /* !! */  = (int)kq.hijs("hjiu", hijw(int ), (int)384);
                if (!var13_10) ** GOTO lbl40
                throw null;
            }
            case 6: {
                var12_11 /* !! */  = (int)kq.hijs("hjiv", hijw(int ), (int)385);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl74:
            // 3 sources

            case 7: {
                do {
                    var12_11 /* !! */  = (int)kq.hijs("hjiw", hijw(int ), (int)386);
                } while (!var13_10);
                throw null;
            }
lbl79:
            // 2 sources

            case 8: {
                var12_11 /* !! */  = (int)kq.hijs("hjix", hijw(int ), (int)387);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl84:
            // 2 sources

            case 9: {
                var12_11 /* !! */  = (int)kq.hijs("hjiy", hijw(int ), (int)388);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 10: {
                var12_11 /* !! */  = (int)kq.hijs("hjiz", hijw(int ), (int)389);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 11: {
                var12_11 /* !! */  = (int)kq.hijs("hjja", hijw(int ), (int)390);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl99:
            // 2 sources

            case 12: {
                var12_11 /* !! */  = (int)kq.hijs("hjjb", hijw(int ), (int)391);
                if (!var13_10) ** GOTO lbl60
                throw null;
            }
            case 13: {
                var12_11 /* !! */  = (int)kq.hijs("hjjc", hijw(int ), (int)392);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl108:
            // 2 sources

            case 14: {
                var12_11 /* !! */  = (int)kq.hijs("hjjd", hijw(int ), (int)393);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 15: {
                var12_11 /* !! */  = (int)kq.hijs("hjje", hijw(int ), (int)394);
                if (!var13_10) ** GOTO lbl84
                throw null;
            }
lbl117:
            // 5 sources

            case 16: {
                var12_11 /* !! */  = (int)kq.hijs("hjjf", hijw(int ), (int)395);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl122:
            // 2 sources

            case 17: {
                var12_11 /* !! */  = (int)kq.hijs("hjjg", hijw(int ), (int)396);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 18: {
                var12_11 /* !! */  = (int)kq.hijs("hjjh", hijw(int ), (int)397);
                if (!var13_10) break;
                throw null;
            }
            case 19: {
                var12_11 /* !! */  = (int)kq.hijs("hjji", hijw(int ), (int)398);
                if (!var13_10) ** GOTO lbl65
                throw null;
            }
lbl135:
            // 3 sources

            case 20: {
                var12_11 /* !! */  = (int)kq.hijs("hjjj", hijw(int ), (int)399);
                if (!var13_10) ** GOTO lbl74
                throw null;
            }
            case 21: {
                var12_11 /* !! */  = (int)kq.hijs("hjjk", hijw(int ), (int)400);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl144:
            // 3 sources

            case 22: {
                var12_11 /* !! */  = (int)kq.hijs("hjjl", hijw(int ), (int)401);
                if (!var13_10) ** GOTO lbl74
                throw null;
            }
            case 23: {
                var12_11 /* !! */  = (int)kq.hijs("hjjm", hijw(int ), (int)402);
                if (!var13_10) ** GOTO lbl79
                throw null;
            }
lbl152:
            // 2 sources

            case 24: {
                var12_11 /* !! */  = (int)kq.hijs("hjjn", hijw(int ), (int)403);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 25: {
                var12_11 /* !! */  = (int)kq.hijs("hjjo", hijw(int ), (int)404);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl162:
            // 3 sources

            case 26: {
                var12_11 /* !! */  = (int)kq.hijs("hjjp", hijw(int ), (int)405);
                if (!var13_10) ** GOTO lbl45
                throw null;
            }
lbl166:
            // 2 sources

            case 27: {
                var12_11 /* !! */  = (int)kq.hijs("hjjq", hijw(int ), (int)406);
                if (!var13_10) ** GOTO lbl54
                throw null;
            }
lbl170:
            // 2 sources

            case 28: {
                do {
                    var12_11 /* !! */  = (int)kq.hijs("hjjr", hijw(int ), (int)407);
                } while (!var13_10);
                throw null;
            }
lbl175:
            // 2 sources

            case 29: {
                var12_11 /* !! */  = (int)kq.hijs("hjjs", hijw(int ), (int)408);
                if (!var13_10) ** GOTO lbl144
                throw null;
            }
            case 30: 
        }
        var12_11 /* !! */  = (int)kq.hijs("hjjt", hijw(int ), (int)409);
        ** while (!var13_10)
lbl182:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float height(String var0, float var1_1) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjar", hijp(int ), (int)170));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1137916077: {
                    v1 = kq.hijs("hjas", hijp(int ), (int)171);
                    continue block23;
                }
                case 44355416: {
                    v1 = kq.hijs("hjat", hijp(int ), (int)172);
                    continue block23;
                }
                case 471728810: {
                    v1 = kq.hijs("hjau", hijp(int ), (int)173);
                    continue block23;
                }
                case 722891128: {
                    break block23;
                }
            }
            break;
        }
        var4_2 = kq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjav", hijp(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hjaw", hijw(int ), (int)266)) break;
            v2 /* !! */  = (long)kq.hijs("hjax", hijw(int ), (int)267);
        }
        var3_3 /* !! */  = kq.b;
        v3 /* !! */  = kq.ok;
        if (true) ** GOTO lbl28
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - kq.hijs("hjay", hijp(int ), (int)175));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1563461657: {
                    v4 = kq.hijs("hjaz", hijp(int ), (int)176);
                    continue block25;
                }
                case -135436225: {
                    v4 = kq.hijs("hjba", hijp(int ), (int)177);
                    continue block25;
                }
                case 722891128: {
                    break block25;
                }
            }
            break;
        }
        var2_4 = kq.a;
        if (var4_2) {
            throw null;
lbl40:
            // 2 sources

            return (float)kq.hijs("hjbb", hixv(int ), (int)268);
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjbc", hijp(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kq.hijs("hjbd", hijw(int ), (int)269)) break;
                    v5 /* !! */  = (long)kq.hijs("hjbe", hijw(int ), (int)270);
                }
                v6 = kv.get(var0);
                v7 /* !! */  = kq.ok;
                if (true) ** GOTO lbl57
                block28: while (true) {
                    v7 /* !! */  = (long)(v8 - kq.hijs("hjbf", hijp(int ), (int)179));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 6830848: {
                            v8 = kq.hijs("hjbg", hijp(int ), (int)180);
                            continue block28;
                        }
                        case 288240615: {
                            v8 = kq.hijs("hjbh", hijp(int ), (int)181);
                            continue block28;
                        }
                        case 722891128: {
                            break block28;
                        }
                        case 1076552613: {
                            v8 = kq.hijs("hjbi", hijp(int ), (int)182);
                            continue block28;
                        }
                    }
                    break;
                }
                return kq.height(v6, var1_1);
            }
lbl70:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kq.hijs("hjbj", hijw(int ), (int)271);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kq.hijs("hjbk", hijw(int ), (int)272);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)kq.hijs("hjbl", hijw(int ), (int)273);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)kq.hijs("hjbm", hijw(int ), (int)274);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static void hkcp() {
        kq.hijx[700] = -661825435;
        kq.hijx[701] = 381347394;
        kq.hijx[702] = 1180532908;
        kq.hijx[703] = 993479075;
        kq.hijx[704] = 264944453;
        kq.hijx[705] = 914815329;
        kq.hijx[706] = -2003357923;
        kq.hijx[707] = 618096995;
        kq.hijx[708] = 2088061075;
        kq.hijx[709] = 894372603;
        kq.hijx[710] = -251960825;
        kq.hijx[711] = 1269122303;
        kq.hijx[712] = -1157635333;
        kq.hijx[713] = 1013409592;
        kq.hijx[714] = 1627435040;
        kq.hijx[715] = -1779448034;
        kq.hijx[716] = 1998980329;
        kq.hijx[717] = 479335717;
        kq.hijx[718] = -1117446402;
        kq.hijx[719] = 183509088;
        kq.hijx[720] = -2003206690;
        kq.hijx[721] = -1978919235;
        kq.hijx[722] = -1979528059;
        kq.hijx[723] = 834093638;
        kq.hijx[724] = -2025480323;
        kq.hijx[725] = 1218747785;
        kq.hijx[726] = -519889739;
        kq.hijx[727] = -1069232675;
        kq.hijx[728] = -1032401215;
        kq.hijx[729] = -1364980450;
        kq.hijx[730] = -586327968;
        kq.hijx[731] = -1680655272;
        kq.hijx[732] = -338790284;
        kq.hijx[733] = -481604823;
        kq.hijx[734] = 912849795;
        kq.hijx[735] = -708872153;
        kq.hijx[736] = 1691926984;
        kq.hijx[737] = -1556601132;
        kq.hijx[738] = -572841614;
        kq.hijx[739] = 506478817;
        kq.hijx[740] = -1516597757;
        kq.hijx[741] = 646174022;
        kq.hijx[742] = 9028722;
        kq.hijx[743] = 1761870888;
        kq.hijx[744] = 683910670;
        kq.hijx[745] = 0x3E3CCCE3;
        kq.hijx[746] = 1034339639;
        kq.hijx[747] = -1590853784;
        kq.hijx[748] = 204539777;
        kq.hijx[749] = 787855577;
        kq.hijx[750] = -976353154;
        kq.hijx[751] = 1219684349;
        kq.hijx[752] = 1730283593;
        kq.hijx[753] = -1091435120;
        kq.hijx[754] = 1483380080;
        kq.hijx[755] = 1043553369;
        kq.hijx[756] = -316274015;
        kq.hijx[757] = 858656215;
        kq.hijx[758] = 708089781;
        kq.hijx[759] = -1392600821;
        kq.hijx[760] = 2138922551;
        kq.hijx[761] = 1719840447;
        kq.hijx[762] = 1231871841;
        kq.hijx[763] = -706837478;
        kq.hijx[764] = -1727372274;
        kq.hijx[765] = 2049542531;
        kq.hijx[766] = 1984136026;
        kq.hijx[767] = 1457470191;
        kq.hijx[768] = 703352293;
        kq.hijx[769] = -1290646794;
        kq.hijx[770] = 637857931;
        kq.hijx[771] = -789401675;
        kq.hijx[772] = 86418335;
        kq.hijx[773] = 437720893;
        kq.hijx[774] = 224311040;
        kq.hijx[775] = -1685879614;
        kq.hijx[776] = -713033745;
        kq.hijx[777] = -541193274;
        kq.hijx[778] = 1768580128;
        kq.hijx[779] = -411708;
        kq.hijx[780] = -805186672;
        kq.hijx[781] = -1961058989;
        kq.hijx[782] = -816618046;
        kq.hijx[783] = -369462757;
        kq.hijx[784] = 224508630;
        kq.hijx[785] = 2080136960;
        kq.hijx[786] = -2136594463;
        kq.hijx[787] = 967235474;
        kq.hijx[788] = -59895429;
        kq.hijx[789] = -1962411336;
        kq.hijx[790] = 2107482001;
        kq.hijx[791] = -677014200;
        kq.hijx[792] = 1093085126;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float height(ks var0, float var1_1) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjbn", hijp(int ), (int)183));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1273083922: {
                    v1 = kq.hijs("hjbo", hijp(int ), (int)184);
                    continue block26;
                }
                case -334558630: {
                    v1 = kq.hijs("hjbp", hijp(int ), (int)185);
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
            }
            break;
        }
        var4_2 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjbq", hijp(int ), (int)186));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1519149755: {
                    v3 = kq.hijs("hjbr", hijp(int ), (int)187);
                    continue block27;
                }
                case -365014082: {
                    v3 = kq.hijs("hjbs", hijp(int ), (int)188);
                    continue block27;
                }
                case 632257731: {
                    v3 = kq.hijs("hjbt", hijp(int ), (int)189);
                    continue block27;
                }
                case 722891128: {
                    break block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = kq.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjbu", hijp(int ), (int)190)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == kq.hijs("hjbv", hijw(int ), (int)275)) break;
            v4 /* !! */  = (long)kq.hijs("hjbw", hijw(int ), (int)276);
        }
        var2_4 = kq.a;
        if (!var4_2) ** GOTO lbl45
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)kq.hijs("hjbx", hixv(int ), (int)277);
                }
lbl45:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                if (var0 != null) continue block29;
                if (var2_4 || var2_4) ** GOTO lbl-1000
                return var1_1;
                if (var2_4 || var2_4) continue block29;
                v5 /* !! */  = kq.ok;
                if (true) ** GOTO lbl54
                block30: while (true) {
                    v5 /* !! */  = (long)(kq.hijs("hjbz", hijp(int ), (int)192) - kq.hijs("hjby", hijp(int ), (int)191));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 722891128: {
                            break block30;
                        }
                        case 1623712345: {
                            continue block30;
                        }
                    }
                    break;
                }
                return var0.getLineHeight() * var1_1;
lbl60:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)kq.hijs("hjca", hijw(int ), (int)278);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl91
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)kq.hijs("hjcb", hijw(int ), (int)279);
                        if (!var4_2) break block29;
                        throw null;
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)kq.hijs("hjcc", hijw(int ), (int)280);
                    if (!var4_2) ** GOTO lbl60
                    throw null;
                }
lbl74:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)kq.hijs("hjcd", hijw(int ), (int)281);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl78:
                // 4 sources

                case 4: {
                    do {
                        var3_3 /* !! */  = (int)kq.hijs("hjce", hijw(int ), (int)282);
                    } while (!var4_2);
                    throw null;
                }
lbl83:
                // 2 sources

                case 5: {
                    var3_3 /* !! */  = (int)kq.hijs("hjcf", hijw(int ), (int)283);
                    if (!var4_2) ** GOTO lbl78
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)kq.hijs("hjcg", hijw(int ), (int)284);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
lbl91:
                // 2 sources

                case 7: {
                    var3_3 /* !! */  = (int)kq.hijs("hjch", hijw(int ), (int)285);
                    if (!var4_2) ** GOTO lbl74
                    throw null;
                }
                case 8: 
            }
        }
        var3_3 /* !! */  = (int)kq.hijs("hjci", hijw(int ), (int)286);
        ** while (!var4_2)
lbl98:
        // 1 sources

        throw null;
    }

    private static float hixv(int n2) {
        return Float.intBitsToFloat(hijx[n2] ^ hijy[n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float width(String string, String string2, float f2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ok - kq.hijs("hiyh", hijp(int ), 144)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == kq.hijs("hiyi", hijw(int ), 230)) break;
            object = kq.hijs("hiyj", hijw(int ), 231);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ok - kq.hijs("hiyk", hijp(int ), 145)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == kq.hijs("hiyl", hijw(int ), 232)) break;
            object = kq.hijs("hiym", hijw(int ), 233);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ok - kq.hijs("hiyn", hijp(int ), 146)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == kq.hijs("hiyo", hijw(int ), 234)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = kq.hijs("hiyp", hijw(int ), 235);
        }
        if (bl2) return (float)kq.hijs("hiyq", hixv(int ), 236);
        if (bl2) return (float)kq.hijs("hiyq", hixv(int ), 236);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ok - kq.hijs("hiyr", hijp(int ), 147)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == kq.hijs("hiys", hijw(int ), 237)) break;
            object = kq.hijs("hiyt", hijw(int ), 238);
        }
        ks ks2 = kv.get(string);
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = ok - kq.hijs("hiyu", hijp(int ), 148)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == kq.hijs("hiyv", hijw(int ), 239)) {
                return kq.width(ks2, string2, f2);
            }
            object = kq.hijs("hiyw", hijw(int ), 240);
        }
    }

    private static void hkdd() {
        kq.hijr[100] = -4456850625727765093L;
        kq.hijr[101] = 4367942673459419900L;
        kq.hijr[102] = 1719754550055553470L;
        kq.hijr[103] = -769581314937459606L;
        kq.hijr[104] = -818978381696501795L;
        kq.hijr[105] = 2071013417763110712L;
        kq.hijr[106] = 2967811733935197935L;
        kq.hijr[107] = 7688519682262712752L;
        kq.hijr[108] = -247234619904969220L;
        kq.hijr[109] = 4977069952804383140L;
        kq.hijr[110] = 561335215962466455L;
        kq.hijr[111] = 1481691259039169057L;
        kq.hijr[112] = -1629703971725548842L;
        kq.hijr[113] = -7857714076494508061L;
        kq.hijr[114] = 7538569832821377188L;
        kq.hijr[115] = 1584004403131768157L;
        kq.hijr[116] = 1439704512708941853L;
        kq.hijr[117] = 557839780330342170L;
        kq.hijr[118] = 7880698626091584000L;
        kq.hijr[119] = -7450748655756709764L;
        kq.hijr[120] = -7622781738934321190L;
        kq.hijr[121] = -2033974552190934826L;
        kq.hijr[122] = -5625686112561296162L;
        kq.hijr[123] = -7424251149338712496L;
        kq.hijr[124] = 1742065038772937630L;
        kq.hijr[125] = -5395926135683893433L;
        kq.hijr[126] = -1423088025390067515L;
        kq.hijr[127] = -3774343064798220766L;
        kq.hijr[128] = -6999047797393839957L;
        kq.hijr[129] = -5084721153637782130L;
        kq.hijr[130] = -1767786344087039111L;
        kq.hijr[131] = -2668984292575537607L;
        kq.hijr[132] = -4633409585216767099L;
        kq.hijr[133] = 1019990574600003655L;
        kq.hijr[134] = 7454870168776802335L;
        kq.hijr[135] = -4180320137909367274L;
        kq.hijr[136] = -5804109634117372926L;
        kq.hijr[137] = -1727680459377678063L;
        kq.hijr[138] = 63802521774896081L;
        kq.hijr[139] = -4819630079008786074L;
        kq.hijr[140] = -4874400008725885503L;
        kq.hijr[141] = 6768664881866046299L;
        kq.hijr[142] = 7321900138239888752L;
        kq.hijr[143] = 4421554624488727494L;
        kq.hijr[144] = -2097172930772205900L;
        kq.hijr[145] = 6388276293694228264L;
        kq.hijr[146] = -1934445457400299474L;
        kq.hijr[147] = -7421491800903649405L;
        kq.hijr[148] = 8181515562514227147L;
        kq.hijr[149] = 6379733249595634166L;
        kq.hijr[150] = 8484137121951714493L;
        kq.hijr[151] = -1880796835152849114L;
        kq.hijr[152] = -1861850542010904043L;
        kq.hijr[153] = 214613579542456031L;
        kq.hijr[154] = 6165472614943840113L;
        kq.hijr[155] = -3082490871426773358L;
        kq.hijr[156] = 8675435226582658081L;
        kq.hijr[157] = 5223425903028882873L;
        kq.hijr[158] = 8911757178695557396L;
        kq.hijr[159] = 8338312798419660362L;
        kq.hijr[160] = -5869897037302048079L;
        kq.hijr[161] = 5764664881647521627L;
        kq.hijr[162] = -9204154729140459480L;
        kq.hijr[163] = -7495029680480698951L;
        kq.hijr[164] = 2321060311541818563L;
        kq.hijr[165] = 2176863378563526699L;
        kq.hijr[166] = -387498057711013493L;
        kq.hijr[167] = -6123664650637831704L;
        kq.hijr[168] = 8563310657160278962L;
        kq.hijr[169] = -2762460024653373605L;
        kq.hijr[170] = -953498864675991974L;
        kq.hijr[171] = 3498237669829882185L;
        kq.hijr[172] = -2292035561192601398L;
        kq.hijr[173] = 2766092175337076509L;
        kq.hijr[174] = -2696289700763999745L;
        kq.hijr[175] = -7681256686463385311L;
        kq.hijr[176] = -7003699060379347034L;
        kq.hijr[177] = 9114417332874048584L;
        kq.hijr[178] = 2521258379618421631L;
        kq.hijr[179] = 8782091390579541994L;
        kq.hijr[180] = 7054761005614506204L;
        kq.hijr[181] = 8595162766344832162L;
        kq.hijr[182] = 5597288170481008750L;
        kq.hijr[183] = 4988372605169625710L;
        kq.hijr[184] = 7222208533804901637L;
        kq.hijr[185] = 4957157656131111190L;
        kq.hijr[186] = -884662737282813294L;
        kq.hijr[187] = -7856130683680837539L;
        kq.hijr[188] = -7000703255424665154L;
        kq.hijr[189] = -5152105495532048332L;
        kq.hijr[190] = 6500685108292692147L;
        kq.hijr[191] = 1417560736715282367L;
        kq.hijr[192] = -5363627010839536720L;
        kq.hijr[193] = -5800427852887771307L;
        kq.hijr[194] = -8533768521971280847L;
        kq.hijr[195] = 2419033870131318044L;
        kq.hijr[196] = 6589291476075222059L;
        kq.hijr[197] = 1688644361579932798L;
        kq.hijr[198] = 5593322782022042887L;
        kq.hijr[199] = 1050913360363505431L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setFallback(boolean var0) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(kq.hijs("hiju", hijp(int ), (int)1) - kq.hijs("hijt", hijp(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2073466267: {
                    continue block12;
                }
                case 722891128: {
                    break block12;
                }
            }
            break;
        }
        var3_1 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hijv", hijp(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kq.hijs("hijz", hijw(int ), (int)0)) break;
            v1 /* !! */  = (long)kq.hijs("hika", hijw(int ), (int)1);
        }
        var2_2 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hikb", hijp(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hikc", hijw(int ), (int)2)) break;
            v2 /* !! */  = (long)kq.hijs("hikd", hijw(int ), (int)3);
        }
        var1_3 = kq.a;
        if (var3_1) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hike", hijp(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kq.hijs("hikf", hijw(int ), (int)4)) break;
                    v3 /* !! */  = (long)kq.hijs("hikg", hijw(int ), (int)5);
                }
                kq.useFallback = var0;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl39:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kq.hijs("hikh", hijw(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)kq.hijs("hiki", hijw(int ), (int)7);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl52
            }
            case 2: {
                var2_2 /* !! */  = (int)kq.hijs("hikj", hijw(int ), (int)8);
                if (!var3_1) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)kq.hijs("hikk", hijw(int ), (int)9);
                if (!var3_1) ** GOTO lbl39
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)kq.hijs("hikl", hijw(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)kq.hijs("hikm", hijw(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    private static void hkda() {
        kq.hijq[200] = -5304305079291561980L;
        kq.hijq[201] = 7909831940805741219L;
        kq.hijq[202] = -6282957332942211167L;
        kq.hijq[203] = 1965480621737927685L;
        kq.hijq[204] = -6466689200358487467L;
        kq.hijq[205] = -6150852639909195878L;
        kq.hijq[206] = 4721427371328066982L;
        kq.hijq[207] = 367210351997668005L;
        kq.hijq[208] = 1759102828225395025L;
        kq.hijq[209] = -7291015832873232809L;
        kq.hijq[210] = -8778678652097602580L;
        kq.hijq[211] = 1911668305862696397L;
        kq.hijq[212] = 4137709095191802931L;
        kq.hijq[213] = -5275096192143307816L;
        kq.hijq[214] = -5410836065031611463L;
        kq.hijq[215] = 8725685806867884594L;
        kq.hijq[216] = -1200090619172377383L;
        kq.hijq[217] = 6581793935729225702L;
        kq.hijq[218] = 7793902369297298967L;
        kq.hijq[219] = -2465996064235795454L;
        kq.hijq[220] = -8185947109090913134L;
        kq.hijq[221] = 4107573258451738443L;
        kq.hijq[222] = -5491126741106492598L;
        kq.hijq[223] = 7836000335406268559L;
        kq.hijq[224] = -5532314780495653587L;
        kq.hijq[225] = -5412557966843012933L;
        kq.hijq[226] = 729166534942032966L;
        kq.hijq[227] = 3859266173727114328L;
        kq.hijq[228] = 7040456587315052781L;
        kq.hijq[229] = -7353698317226639677L;
        kq.hijq[230] = 8129526803229376662L;
        kq.hijq[231] = 8518160236962575988L;
        kq.hijq[232] = -4408815208132920790L;
        kq.hijq[233] = -8711283510199979279L;
        kq.hijq[234] = -4872098453782680349L;
        kq.hijq[235] = 4952571469658143642L;
        kq.hijq[236] = -5648223170211304313L;
        kq.hijq[237] = -714953580547837372L;
        kq.hijq[238] = 4957372798020367402L;
        kq.hijq[239] = 3228941798647177180L;
        kq.hijq[240] = 8506516392645380266L;
        kq.hijq[241] = 4451235211355036891L;
        kq.hijq[242] = 5039126586232321208L;
        kq.hijq[243] = 8167694106299269964L;
        kq.hijq[244] = 4167594291110246729L;
        kq.hijq[245] = -3406025128141521414L;
        kq.hijq[246] = -184196818865178306L;
        kq.hijq[247] = 6253856601184069041L;
        kq.hijq[248] = 8979331086014556558L;
        kq.hijq[249] = -6841440919055492438L;
        kq.hijq[250] = 8400083043318798323L;
        kq.hijq[251] = -7856677511154339942L;
        kq.hijq[252] = 6924738528942244128L;
        kq.hijq[253] = 4930248282882667725L;
        kq.hijq[254] = 4835971669589265886L;
        kq.hijq[255] = -8182015096782531619L;
        kq.hijq[256] = 6441047591569315547L;
        kq.hijq[257] = 109359221494583411L;
        kq.hijq[258] = -166551976842568424L;
        kq.hijq[259] = 713327534684976747L;
        kq.hijq[260] = -5432744734828896219L;
        kq.hijq[261] = 2248922096334012163L;
        kq.hijq[262] = 1227562264291429010L;
        kq.hijq[263] = 6827745533554753030L;
        kq.hijq[264] = 3836817103103258243L;
        kq.hijq[265] = 7443669733682995135L;
        kq.hijq[266] = -798979292542597250L;
        kq.hijq[267] = 9047812521193094740L;
        kq.hijq[268] = 8758689939844201650L;
        kq.hijq[269] = -2797088327649851362L;
        kq.hijq[270] = -1699715857066618495L;
        kq.hijq[271] = -4639405768885295805L;
        kq.hijq[272] = -6266431869669123577L;
        kq.hijq[273] = -6189320947202595365L;
        kq.hijq[274] = 6985090057854100993L;
        kq.hijq[275] = 4055662638171421639L;
        kq.hijq[276] = -6534407927801897320L;
        kq.hijq[277] = -8304013528317296395L;
        kq.hijq[278] = -6881199661304226463L;
        kq.hijq[279] = 6194333144417766118L;
        kq.hijq[280] = -3744816829777002208L;
        kq.hijq[281] = -5000242716418380186L;
        kq.hijq[282] = 8588627277931005670L;
        kq.hijq[283] = -1152828319099481564L;
        kq.hijq[284] = -8349000389939726363L;
        kq.hijq[285] = 8640646838523888148L;
        kq.hijq[286] = 3047489857809737662L;
        kq.hijq[287] = -82235124332662431L;
        kq.hijq[288] = 4293485889090567248L;
        kq.hijq[289] = -7572008853139874439L;
        kq.hijq[290] = 2924070820768119592L;
        kq.hijq[291] = -4586209264304394386L;
        kq.hijq[292] = -436646221431012721L;
        kq.hijq[293] = 7829519890704042969L;
        kq.hijq[294] = -4061592217506425620L;
        kq.hijq[295] = -3798252384921211094L;
        kq.hijq[296] = -1535635808573365366L;
        kq.hijq[297] = -1881644513964541714L;
        kq.hijq[298] = 5077893830824067365L;
        kq.hijq[299] = 7882380978481330352L;
    }

    public kq() {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static void lambda$textRainbow$2(class_332 class_3322, ks ks2, String string, float f2, float f3, float f4, float f5) {
        block30: {
            block29: {
                Object object = ok;
                block18: while (true) {
                    switch ((int)object) {
                        case -778365377: {
                            object = kq.hijs("hkai", hijp(int ), 336) - kq.hijs("hkah", hijp(int ), 335);
                            continue block18;
                        }
                        case 722891128: {
                            break block18;
                        }
                    }
                    break;
                }
                boolean bl2 = c;
                Object object2 = ok;
                boolean bl3 = true;
                block19: while (true) {
                    CallSite callSite;
                    if (!bl3 || (bl3 = false) || !true) {
                        object2 = callSite - kq.hijs("hkaj", hijp(int ), 337);
                    }
                    switch ((int)object2) {
                        case -1831301185: {
                            callSite = kq.hijs("hkak", hijp(int ), 338);
                            continue block19;
                        }
                        case 722891128: {
                            break block19;
                        }
                        case 1368696277: {
                            callSite = kq.hijs("hkal", hijp(int ), 339);
                            continue block19;
                        }
                    }
                    break;
                }
                int n2 = b;
                Object object3 = ok;
                boolean bl4 = true;
                block20: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object3 = callSite - kq.hijs("hkam", hijp(int ), 340);
                    }
                    switch ((int)object3) {
                        case -967410610: {
                            callSite = kq.hijs("hkan", hijp(int ), 341);
                            continue block20;
                        }
                        case 722891128: {
                            break block20;
                        }
                        case 871613091: {
                            callSite = kq.hijs("hkao", hijp(int ), 342);
                            continue block20;
                        }
                    }
                    break;
                }
                boolean bl5 = a;
                if (bl2) {
                    throw null;
                }
                if (bl5 || bl5) break block29;
                CallSite callSite = kq.hijs("hkap", hijw(int ), 767);
                Object object4 = ok;
                block21: while (true) {
                    switch ((int)object4) {
                        case -764614584: {
                            object4 = kq.hijs("hkar", hijp(int ), 344) - kq.hijs("hkaq", hijp(int ), 343);
                            continue block21;
                        }
                        case 722891128: {
                            break block21;
                        }
                    }
                    break;
                }
                kq.textRainbow(class_3322, ks2, string, f2, f3, f4, f5, (boolean)callSite);
                if (!bl5) break block30;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean hasFonts() {
        block118: {
            block117: {
                block115: {
                    block116: {
                        v0 /* !! */  = kq.ok;
                        if (true) ** GOTO lbl5
                        block74: while (true) {
                            v0 /* !! */  = (long)(v1 - kq.hijs("hikn", hijp(int ), (int)5));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case -1101586254: {
                                    v1 = kq.hijs("hiko", hijp(int ), (int)6);
                                    continue block74;
                                }
                                case 706234729: {
                                    v1 = kq.hijs("hikp", hijp(int ), (int)7);
                                    continue block74;
                                }
                                case 715419015: {
                                    v1 = kq.hijs("hikq", hijp(int ), (int)8);
                                    continue block74;
                                }
                                case 722891128: {
                                    break block74;
                                }
                            }
                            break;
                        }
                        var3 = kq.c;
                        v2 /* !! */  = kq.ok;
                        if (true) ** GOTO lbl22
                        block75: while (true) {
                            v2 /* !! */  = (long)(v3 - kq.hijs("hikr", hijp(int ), (int)9));
lbl22:
                            // 2 sources

                            switch ((int)v2 /* !! */ ) {
                                case -1850000872: {
                                    v3 = kq.hijs("hiks", hijp(int ), (int)10);
                                    continue block75;
                                }
                                case -17955284: {
                                    v3 = kq.hijs("hikt", hijp(int ), (int)11);
                                    continue block75;
                                }
                                case 722891128: {
                                    break block75;
                                }
                                case 1752949888: {
                                    v3 = kq.hijs("hiku", hijp(int ), (int)12);
                                    continue block75;
                                }
                            }
                            break;
                        }
                        var2_1 /* !! */  = kq.b;
                        v4 /* !! */  = kq.ok;
                        if (true) ** GOTO lbl39
                        block76: while (true) {
                            v4 /* !! */  = (long)(kq.hijs("hikw", hijp(int ), (int)14) - kq.hijs("hikv", hijp(int ), (int)13));
lbl39:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -707655387: {
                                    continue block76;
                                }
                                case 722891128: {
                                    break block76;
                                }
                            }
                            break;
                        }
                        var1_2 = kq.a;
                        if (var3) {
                            throw null;
lbl47:
                            // 16 sources

                            return (boolean)kq.hijs("hikx", hijw(int ), (int)12);
                        }
                        if (var1_2 || var1_2) ** GOTO lbl47
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hiky", hijp(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  == kq.hijs("hikz", hijw(int ), (int)13)) break;
                            v5 /* !! */  = (long)kq.hijs("hila", hijw(int ), (int)14);
                        }
                        if (!kq.fontsReady) break block115;
                        if (var1_2 || var1_2) ** GOTO lbl47
                        v6 /* !! */  = kq.ok;
                        if (true) ** GOTO lbl61
                        block79: while (true) {
                            v6 /* !! */  = (long)(v7 - kq.hijs("hilb", hijp(int ), (int)16));
lbl61:
                            // 2 sources

                            switch ((int)v6 /* !! */ ) {
                                case -1230306623: {
                                    v7 = kq.hijs("hilc", hijp(int ), (int)17);
                                    continue block79;
                                }
                                case -436913036: {
                                    v7 = kq.hijs("hild", hijp(int ), (int)18);
                                    continue block79;
                                }
                                case 722891128: {
                                    break block79;
                                }
                            }
                            break;
                        }
                        var0_3 = kv.getDefault();
                        if (var1_2 || var1_2) ** GOTO lbl47
                        if (var0_3 == null) break block116;
                        if (var1_2) ** GOTO lbl47
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hile", hijp(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == kq.hijs("hilf", hijw(int ), (int)15)) break;
                            v8 /* !! */  = (long)kq.hijs("hilg", hijw(int ), (int)16);
                        }
                        if (!var0_3.isLoaded()) break block116;
                        if (var1_2 || var1_2) ** GOTO lbl47
                        return (boolean)kq.hijs("hilh", hijw(int ), (int)17);
                    }
                    if (var1_2 || var1_2) ** GOTO lbl47
                    v9 = kq.hijs("hili", hijw(int ), (int)18);
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hilj", hijp(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == kq.hijs("hilk", hijw(int ), (int)19)) break;
                        v10 /* !! */  = (long)kq.hijs("hill", hijw(int ), (int)20);
                    }
                    kq.fontsReady = v9;
                    if (var1_2) ** GOTO lbl47
                }
                if (var1_2 || var1_2) ** GOTO lbl47
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hilm", hijp(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == kq.hijs("hiln", hijw(int ), (int)21)) break;
                    v11 /* !! */  = (long)kq.hijs("hilo", hijw(int ), (int)22);
                }
                kv.init();
                if (var1_2 || var1_2) ** GOTO lbl47
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = kq.ok - kq.hijs("hilp", hijp(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == kq.hijs("hilq", hijw(int ), (int)23)) break;
                    v12 /* !! */  = (long)kq.hijs("hilr", hijw(int ), (int)24);
                }
                kr.init();
                if (var1_2 || var1_2) ** GOTO lbl47
                v13 /* !! */  = kq.ok;
                if (true) ** GOTO lbl112
                block84: while (true) {
                    v13 /* !! */  = (long)(v14 - kq.hijs("hils", hijp(int ), (int)23));
lbl112:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 722891128: {
                            break block84;
                        }
                        case 1256843198: {
                            v14 = kq.hijs("hilt", hijp(int ), (int)24);
                            continue block84;
                        }
                        case 1375702703: {
                            v14 = kq.hijs("hilu", hijp(int ), (int)25);
                            continue block84;
                        }
                    }
                    break;
                }
                var0_3 = kv.getDefault();
                if (var1_2 || var1_2) ** GOTO lbl47
                if (var0_3 == null) break block117;
                if (var1_2) ** GOTO lbl47
                v15 /* !! */  = kq.ok;
                if (true) ** GOTO lbl129
                block85: while (true) {
                    v15 /* !! */  = (long)(v16 - kq.hijs("hilv", hijp(int ), (int)26));
lbl129:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1477963086: {
                            v16 = kq.hijs("hilw", hijp(int ), (int)27);
                            continue block85;
                        }
                        case -859329621: {
                            v16 = kq.hijs("hilx", hijp(int ), (int)28);
                            continue block85;
                        }
                        case 722891128: {
                            break block85;
                        }
                        case 940792199: {
                            v16 = kq.hijs("hily", hijp(int ), (int)29);
                            continue block85;
                        }
                    }
                    break;
                }
                if (!var0_3.isLoaded()) break block117;
                if (var1_2) ** GOTO lbl47
                v17 = kq.hijs("hilz", hijw(int ), (int)25);
                if (var3) {
                    throw null;
                }
                break block118;
            }
            if (var1_2 || var1_2) ** GOTO lbl47
            v17 = kq.hijs("hima", hijw(int ), (int)26);
        }
        v18 /* !! */  = kq.ok;
        if (true) ** GOTO lbl155
        block86: while (true) {
            v18 /* !! */  = (long)(v19 - kq.hijs("himb", hijp(int ), (int)30));
lbl155:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -488698150: {
                    v19 = kq.hijs("himc", hijp(int ), (int)31);
                    continue block86;
                }
                case 722891128: {
                    break block86;
                }
                case 1483996771: {
                    v19 = kq.hijs("himd", hijp(int ), (int)32);
                    continue block86;
                }
                case 1591270141: {
                    v19 = kq.hijs("hime", hijp(int ), (int)33);
                    continue block86;
                }
            }
            break;
        }
        kq.fontsReady = v17;
        if (var1_2) ** GOTO lbl47
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_2) ** break;
                ** continue;
                v20 /* !! */  = kq.ok;
                if (true) ** GOTO lbl178
                block87: while (true) {
                    v20 /* !! */  = (long)(v21 - kq.hijs("himf", hijp(int ), (int)34));
lbl178:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1458249814: {
                            v21 = kq.hijs("himg", hijp(int ), (int)35);
                            continue block87;
                        }
                        case -580092744: {
                            v21 = kq.hijs("himh", hijp(int ), (int)36);
                            continue block87;
                        }
                        case 722891128: {
                            break block87;
                        }
                    }
                    break;
                }
                return kq.fontsReady;
            }
lbl188:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)kq.hijs("himi", hijw(int ), (int)27);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 1: {
                var2_1 /* !! */  = (int)kq.hijs("himj", hijw(int ), (int)28);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl198:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)kq.hijs("himk", hijw(int ), (int)29);
                if (!var3) ** GOTO lbl188
                throw null;
            }
            case 3: {
                var2_1 /* !! */  = (int)kq.hijs("himl", hijw(int ), (int)30);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl207:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)kq.hijs("himm", hijw(int ), (int)31);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 5: {
                var2_1 /* !! */  = (int)kq.hijs("himn", hijw(int ), (int)32);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)kq.hijs("himo", hijw(int ), (int)33);
                    if (!var3) ** GOTO lbl198
                    throw null;
                }
            }
lbl222:
            // 2 sources

            case 7: {
                do {
                    var2_1 /* !! */  = (int)kq.hijs("himp", hijw(int ), (int)34);
                } while (!var3);
                throw null;
            }
lbl227:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)kq.hijs("himq", hijw(int ), (int)35);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl232:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)kq.hijs("himr", hijw(int ), (int)36);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 10: {
                do {
                    var2_1 /* !! */  = (int)kq.hijs("hims", hijw(int ), (int)37);
                } while (!var3);
                throw null;
            }
            case 11: {
                var2_1 /* !! */  = (int)kq.hijs("himt", hijw(int ), (int)38);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl247:
            // 3 sources

            case 12: {
                var2_1 /* !! */  = (int)kq.hijs("himu", hijw(int ), (int)39);
                if (!var3) ** GOTO lbl232
                throw null;
            }
lbl251:
            // 3 sources

            case 13: {
                var2_1 /* !! */  = (int)kq.hijs("himv", hijw(int ), (int)40);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl256:
            // 2 sources

            case 14: {
                var2_1 /* !! */  = (int)kq.hijs("himw", hijw(int ), (int)41);
                if (!var3) ** GOTO lbl227
                throw null;
            }
            case 15: {
                var2_1 /* !! */  = (int)kq.hijs("himx", hijw(int ), (int)42);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl265:
            // 2 sources

            case 16: {
                var2_1 /* !! */  = (int)kq.hijs("himy", hijw(int ), (int)43);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 17: {
                var2_1 /* !! */  = (int)kq.hijs("himz", hijw(int ), (int)44);
                if (!var3) ** GOTO lbl188
                throw null;
            }
lbl274:
            // 2 sources

            case 18: {
                var2_1 /* !! */  = (int)kq.hijs("hina", hijw(int ), (int)45);
                if (!var3) ** GOTO lbl247
                throw null;
            }
lbl278:
            // 2 sources

            case 19: {
                var2_1 /* !! */  = (int)kq.hijs("hinb", hijw(int ), (int)46);
                if (!var3) ** GOTO lbl274
                throw null;
            }
            case 20: {
                var2_1 /* !! */  = (int)kq.hijs("hinc", hijw(int ), (int)47);
                if (!var3) ** GOTO lbl247
                throw null;
            }
lbl286:
            // 3 sources

            case 21: {
                var2_1 /* !! */  = (int)kq.hijs("hind", hijw(int ), (int)48);
                if (!var3) ** GOTO lbl251
                throw null;
            }
lbl290:
            // 2 sources

            case 22: {
                var2_1 /* !! */  = (int)kq.hijs("hine", hijw(int ), (int)49);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl295:
            // 2 sources

            case 23: {
                var2_1 /* !! */  = (int)kq.hijs("hinf", hijw(int ), (int)50);
                if (!var3) ** GOTO lbl286
                throw null;
            }
lbl299:
            // 3 sources

            case 24: {
                var2_1 /* !! */  = (int)kq.hijs("hing", hijw(int ), (int)51);
                if (!var3) ** GOTO lbl278
                throw null;
            }
lbl303:
            // 2 sources

            case 25: {
                var2_1 /* !! */  = (int)kq.hijs("hinh", hijw(int ), (int)52);
                if (!var3) ** GOTO lbl295
                throw null;
            }
lbl307:
            // 2 sources

            case 26: {
                var2_1 /* !! */  = (int)kq.hijs("hini", hijw(int ), (int)53);
                if (!var3) ** GOTO lbl251
                throw null;
            }
lbl311:
            // 3 sources

            case 27: {
                var2_1 /* !! */  = (int)kq.hijs("hinj", hijw(int ), (int)54);
                if (!var3) ** GOTO lbl227
                throw null;
            }
            case 28: 
        }
        var2_1 /* !! */  = (int)kq.hijs("hink", hijw(int ), (int)55);
        ** while (!var3)
lbl318:
        // 1 sources

        throw null;
    }

    private static void hkco() {
        kq.hijx[600] = 1486764023;
        kq.hijx[601] = 771649885;
        kq.hijx[602] = 1695098562;
        kq.hijx[603] = 385263035;
        kq.hijx[604] = -840813842;
        kq.hijx[605] = -2074283584;
        kq.hijx[606] = 1583445955;
        kq.hijx[607] = 1386761307;
        kq.hijx[608] = -646336500;
        kq.hijx[609] = 1971076727;
        kq.hijx[610] = 1196795736;
        kq.hijx[611] = -1618370983;
        kq.hijx[612] = 1995834586;
        kq.hijx[613] = -1993807968;
        kq.hijx[614] = 1614848079;
        kq.hijx[615] = -728469864;
        kq.hijx[616] = -214368683;
        kq.hijx[617] = 698659271;
        kq.hijx[618] = 1832050956;
        kq.hijx[619] = -864466210;
        kq.hijx[620] = -1763517692;
        kq.hijx[621] = 1623787640;
        kq.hijx[622] = -2100374089;
        kq.hijx[623] = 1253678042;
        kq.hijx[624] = -1180413356;
        kq.hijx[625] = -1786800904;
        kq.hijx[626] = -1438572037;
        kq.hijx[627] = -108977147;
        kq.hijx[628] = 1775975755;
        kq.hijx[629] = -1368982393;
        kq.hijx[630] = -1348760348;
        kq.hijx[631] = 1848541058;
        kq.hijx[632] = -1799572637;
        kq.hijx[633] = 676728265;
        kq.hijx[634] = -860519040;
        kq.hijx[635] = 1984990302;
        kq.hijx[636] = -454446226;
        kq.hijx[637] = -288368049;
        kq.hijx[638] = -786468124;
        kq.hijx[639] = 2077808815;
        kq.hijx[640] = 2059380463;
        kq.hijx[641] = 731874727;
        kq.hijx[642] = 81019046;
        kq.hijx[643] = 2074183106;
        kq.hijx[644] = -767797520;
        kq.hijx[645] = -1275408178;
        kq.hijx[646] = -2117017003;
        kq.hijx[647] = -211339207;
        kq.hijx[648] = -1598871669;
        kq.hijx[649] = 1425447636;
        kq.hijx[650] = 1463138926;
        kq.hijx[651] = 876478072;
        kq.hijx[652] = 1998236908;
        kq.hijx[653] = 2080958271;
        kq.hijx[654] = -1168039430;
        kq.hijx[655] = 361911521;
        kq.hijx[656] = 311880556;
        kq.hijx[657] = -905435452;
        kq.hijx[658] = 95516657;
        kq.hijx[659] = 1379247437;
        kq.hijx[660] = 1247140115;
        kq.hijx[661] = 802146142;
        kq.hijx[662] = -326075740;
        kq.hijx[663] = -418911840;
        kq.hijx[664] = -317130466;
        kq.hijx[665] = -1347530131;
        kq.hijx[666] = -1202662118;
        kq.hijx[667] = 2143704346;
        kq.hijx[668] = 723523951;
        kq.hijx[669] = -1237214781;
        kq.hijx[670] = 1552029609;
        kq.hijx[671] = 1688282747;
        kq.hijx[672] = 936808932;
        kq.hijx[673] = -458638797;
        kq.hijx[674] = -85028446;
        kq.hijx[675] = -524743895;
        kq.hijx[676] = 317035741;
        kq.hijx[677] = -716967011;
        kq.hijx[678] = -88491262;
        kq.hijx[679] = -792284942;
        kq.hijx[680] = 660825014;
        kq.hijx[681] = -676683175;
        kq.hijx[682] = 172829154;
        kq.hijx[683] = -399150784;
        kq.hijx[684] = 50363274;
        kq.hijx[685] = 1489490497;
        kq.hijx[686] = 1546468865;
        kq.hijx[687] = 1545876655;
        kq.hijx[688] = 2073105045;
        kq.hijx[689] = -325305134;
        kq.hijx[690] = -1163001597;
        kq.hijx[691] = -2058488380;
        kq.hijx[692] = 1885500303;
        kq.hijx[693] = 20228257;
        kq.hijx[694] = -250354470;
        kq.hijx[695] = -837975023;
        kq.hijx[696] = 61935453;
        kq.hijx[697] = -1318847436;
        kq.hijx[698] = -1187816252;
        kq.hijx[699] = -288984361;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int hsbToRgb(float var0, float var1_1, float var2_2) {
        block162: {
            var13_3 = kq.c;
            var12_4 /* !! */  = kq.b;
            var11_5 = kq.a;
            if (var13_3) {
                throw null;
lbl6:
                // 38 sources

                return (int)kq.hijs("hjsi", hijw(int ), (int)577);
            }
            if (var11_5 || var11_5) ** GOTO lbl6
            var3_6 /* !! */  = kq.hijs("hjsj", hijw(int ), (int)578);
            if (var11_5 || var11_5) ** GOTO lbl6
            var4_7 /* !! */  = kq.hijs("hjsk", hijw(int ), (int)579);
            if (var11_5 || var11_5) ** GOTO lbl6
            var5_8 /* !! */  = kq.hijs("hjsl", hijw(int ), (int)580);
            if (var11_5 || var11_5) ** GOTO lbl6
            if (var1_1 != 0.0f) break block162;
            if (var11_5 || var11_5) ** GOTO lbl6
            v0 = (int)(var2_2 * kq.hijs("hjsm", hixv(int ), (int)581) + kq.hijs("hjsn", hixv(int ), (int)582));
            var5_8 /* !! */  = (CallSite)v0;
            var4_7 /* !! */  = (CallSite)v0;
            var3_6 /* !! */  = (CallSite)v0;
            if (var11_5) ** GOTO lbl6
            if (var13_3) {
                throw null;
            }
            ** GOTO lbl100
        }
        if (var11_5 || var11_5) ** GOTO lbl6
        var6_9 = (var0 - (float)Math.floor(var0)) * kq.hijs("hjso", hixv(int ), (int)583);
        if (var11_5 || var11_5) ** GOTO lbl6
        var7_10 = var6_9 - (float)Math.floor(var6_9);
        if (var11_5) ** GOTO lbl6
        if (var12_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_5) ** GOTO lbl6
                var8_11 = var2_2 * (1.0f - var1_1);
                if (var11_5 || var11_5) ** GOTO lbl6
                var9_12 = var2_2 * (1.0f - var1_1 * var7_10);
                if (var11_5 || var11_5) ** GOTO lbl6
                var10_13 = var2_2 * (1.0f - var1_1 * (1.0f - var7_10));
                if (var11_5 || var11_5) ** GOTO lbl6
                switch ((int)var6_9) {
                    case 0: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjsp", hixv(int ), (int)584) + kq.hijs("hjsq", hixv(int ), (int)585)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var10_13 * kq.hijs("hjsr", hixv(int ), (int)586) + kq.hijs("hjss", hixv(int ), (int)587)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjst", hixv(int ), (int)588) + kq.hijs("hjsu", hixv(int ), (int)589)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        if (!var13_3) break;
                        throw null;
                    }
                    case 1: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var9_12 * kq.hijs("hjsv", hixv(int ), (int)590) + kq.hijs("hjsw", hixv(int ), (int)591)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjsx", hixv(int ), (int)592) + kq.hijs("hjsy", hixv(int ), (int)593)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjsz", hixv(int ), (int)594) + kq.hijs("hjta", hixv(int ), (int)595)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        if (!var13_3) break;
                        throw null;
                    }
                    case 2: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjtb", hixv(int ), (int)596) + kq.hijs("hjtc", hixv(int ), (int)597)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjtd", hixv(int ), (int)598) + kq.hijs("hjte", hixv(int ), (int)599)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var10_13 * kq.hijs("hjtf", hixv(int ), (int)600) + kq.hijs("hjtg", hixv(int ), (int)601)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        if (!var13_3) break;
                        throw null;
                    }
                    case 3: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjth", hixv(int ), (int)602) + kq.hijs("hjti", hixv(int ), (int)603)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var9_12 * kq.hijs("hjtj", hixv(int ), (int)604) + kq.hijs("hjtk", hixv(int ), (int)605)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjtl", hixv(int ), (int)606) + kq.hijs("hjtm", hixv(int ), (int)607)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        if (!var13_3) break;
                        throw null;
                    }
                    case 4: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var10_13 * kq.hijs("hjtn", hixv(int ), (int)608) + kq.hijs("hjto", hixv(int ), (int)609)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjtp", hixv(int ), (int)610) + kq.hijs("hjtq", hixv(int ), (int)611)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjtr", hixv(int ), (int)612) + kq.hijs("hjts", hixv(int ), (int)613)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        if (!var13_3) break;
                        throw null;
                    }
                    case 5: {
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var3_6 /* !! */  = (CallSite)((int)(var2_2 * kq.hijs("hjtt", hixv(int ), (int)614) + kq.hijs("hjtu", hixv(int ), (int)615)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var4_7 /* !! */  = (CallSite)((int)(var8_11 * kq.hijs("hjtv", hixv(int ), (int)616) + kq.hijs("hjtw", hixv(int ), (int)617)));
                        if (var11_5 || var11_5) ** GOTO lbl6
                        var5_8 /* !! */  = (CallSite)((int)(var9_12 * kq.hijs("hjtx", hixv(int ), (int)618) + kq.hijs("hjty", hixv(int ), (int)619)));
                        if (var11_5) ** break;
                    }
                }
lbl100:
                // 8 sources

                if (!var11_5 && !var11_5) ** break;
                ** continue;
                return kq.hijs("hjtz", hijw(int ), (int)620) | var3_6 /* !! */  << kq.hijs("hjua", hijw(int ), (int)621) | var4_7 /* !! */  << kq.hijs("hjub", hijw(int ), (int)622) | var5_8 /* !! */ ;
            }
lbl103:
            // 3 sources

            case 0: {
                var12_4 /* !! */  = (int)kq.hijs("hjuc", hijw(int ), (int)623);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl446
            }
            case 1: {
                var12_4 /* !! */  = (int)kq.hijs("hjud", hijw(int ), (int)624);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl113:
            // 2 sources

            case 2: {
                var12_4 /* !! */  = (int)kq.hijs("hjue", hijw(int ), (int)625);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl118:
            // 2 sources

            case 3: {
                var12_4 /* !! */  = (int)kq.hijs("hjuf", hijw(int ), (int)626);
                if (!var13_3) ** GOTO lbl113
                throw null;
            }
            case 4: {
                var12_4 /* !! */  = (int)kq.hijs("hjug", hijw(int ), (int)627);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl127:
            // 4 sources

            case 5: {
                var12_4 /* !! */  = (int)kq.hijs("hjuh", hijw(int ), (int)628);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 6: {
                var12_4 /* !! */  = (int)kq.hijs("hjui", hijw(int ), (int)629);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl137:
            // 2 sources

            case 7: {
                var12_4 /* !! */  = (int)kq.hijs("hjuj", hijw(int ), (int)630);
                if (!var13_3) ** GOTO lbl118
                throw null;
            }
lbl141:
            // 2 sources

            case 8: {
                var12_4 /* !! */  = (int)kq.hijs("hjuk", hijw(int ), (int)631);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 9: {
                var12_4 /* !! */  = (int)kq.hijs("hjul", hijw(int ), (int)632);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 10: {
                var12_4 /* !! */  = (int)kq.hijs("hjum", hijw(int ), (int)633);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl156:
            // 2 sources

            case 11: {
                var12_4 /* !! */  = (int)kq.hijs("hjun", hijw(int ), (int)634);
                if (!var13_3) ** GOTO lbl103
                throw null;
            }
            case 12: {
                do {
                    var12_4 /* !! */  = (int)kq.hijs("hjuo", hijw(int ), (int)635);
                } while (!var13_3);
                throw null;
            }
lbl165:
            // 2 sources

            case 13: {
                var12_4 /* !! */  = (int)kq.hijs("hjup", hijw(int ), (int)636);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 14: {
                var12_4 /* !! */  = (int)kq.hijs("hjuq", hijw(int ), (int)637);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 15: {
                var12_4 /* !! */  = (int)kq.hijs("hjur", hijw(int ), (int)638);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl180:
            // 2 sources

            case 16: {
                var12_4 /* !! */  = (int)kq.hijs("hjus", hijw(int ), (int)639);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl438
            }
            case 17: {
                var12_4 /* !! */  = (int)kq.hijs("hjut", hijw(int ), (int)640);
                if (!var13_3) ** GOTO lbl156
                throw null;
            }
            case 18: {
                var12_4 /* !! */  = (int)kq.hijs("hjuu", hijw(int ), (int)641);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl194:
            // 2 sources

            case 19: {
                var12_4 /* !! */  = (int)kq.hijs("hjuv", hijw(int ), (int)642);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl199:
            // 4 sources

            case 20: {
                var12_4 /* !! */  = (int)kq.hijs("hjuw", hijw(int ), (int)643);
                if (!var13_3) ** GOTO lbl194
                throw null;
            }
lbl203:
            // 3 sources

            case 21: {
                var12_4 /* !! */  = (int)kq.hijs("hjux", hijw(int ), (int)644);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 22: {
                var12_4 /* !! */  = (int)kq.hijs("hjuy", hijw(int ), (int)645);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl438
            }
lbl213:
            // 2 sources

            case 23: {
                var12_4 /* !! */  = (int)kq.hijs("hjuz", hijw(int ), (int)646);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl429
            }
            case 24: {
                var12_4 /* !! */  = (int)kq.hijs("hjva", hijw(int ), (int)647);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 25: {
                var12_4 /* !! */  = (int)kq.hijs("hjvb", hijw(int ), (int)648);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 26: {
                var12_4 /* !! */  = (int)kq.hijs("hjvc", hijw(int ), (int)649);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl233:
            // 3 sources

            case 27: {
                var12_4 /* !! */  = (int)kq.hijs("hjvd", hijw(int ), (int)650);
                if (!var13_3) ** GOTO lbl180
                throw null;
            }
            case 28: {
                var12_4 /* !! */  = (int)kq.hijs("hjve", hijw(int ), (int)651);
                if (!var13_3) ** GOTO lbl165
                throw null;
            }
            case 29: {
                var12_4 /* !! */  = (int)kq.hijs("hjvf", hijw(int ), (int)652);
                if (!var13_3) ** GOTO lbl203
                throw null;
            }
            case 30: {
                var12_4 /* !! */  = (int)kq.hijs("hjvg", hijw(int ), (int)653);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl250:
            // 3 sources

            case 31: {
                var12_4 /* !! */  = (int)kq.hijs("hjvh", hijw(int ), (int)654);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl255:
            // 4 sources

            case 32: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_4 /* !! */  = (int)kq.hijs("hjvi", hijw(int ), (int)655);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl265
                    break;
                }
            }
lbl261:
            // 3 sources

            case 33: {
                var12_4 /* !! */  = (int)kq.hijs("hjvj", hijw(int ), (int)656);
                if (!var13_3) ** GOTO lbl203
                throw null;
            }
lbl265:
            // 3 sources

            case 34: {
                var12_4 /* !! */  = (int)kq.hijs("hjvk", hijw(int ), (int)657);
                if (!var13_3) ** GOTO lbl127
                throw null;
            }
            case 35: {
                var12_4 /* !! */  = (int)kq.hijs("hjvl", hijw(int ), (int)658);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl446
            }
            case 36: {
                var12_4 /* !! */  = (int)kq.hijs("hjvm", hijw(int ), (int)659);
                if (!var13_3) ** GOTO lbl250
                throw null;
            }
            case 37: {
                var12_4 /* !! */  = (int)kq.hijs("hjvn", hijw(int ), (int)660);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 38: {
                var12_4 /* !! */  = (int)kq.hijs("hjvo", hijw(int ), (int)661);
                if (!var13_3) ** GOTO lbl233
                throw null;
            }
lbl287:
            // 2 sources

            case 39: {
                var12_4 /* !! */  = (int)kq.hijs("hjvp", hijw(int ), (int)662);
                if (var13_3) {
                    throw null;
                }
            }
lbl291:
            // 4 sources

            case 40: {
                var12_4 /* !! */  = (int)kq.hijs("hjvq", hijw(int ), (int)663);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 41: {
                var12_4 /* !! */  = (int)kq.hijs("hjvr", hijw(int ), (int)664);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 42: {
                var12_4 /* !! */  = (int)kq.hijs("hjvs", hijw(int ), (int)665);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl306:
            // 3 sources

            case 43: {
                var12_4 /* !! */  = (int)kq.hijs("hjvt", hijw(int ), (int)666);
                if (!var13_3) ** GOTO lbl127
                throw null;
            }
lbl310:
            // 3 sources

            case 44: {
                var12_4 /* !! */  = (int)kq.hijs("hjvu", hijw(int ), (int)667);
                if (!var13_3) ** GOTO lbl291
                throw null;
            }
lbl314:
            // 3 sources

            case 45: {
                var12_4 /* !! */  = (int)kq.hijs("hjvv", hijw(int ), (int)668);
                if (!var13_3) ** GOTO lbl233
                throw null;
            }
            case 46: {
                var12_4 /* !! */  = (int)kq.hijs("hjvw", hijw(int ), (int)669);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl323:
            // 3 sources

            case 47: {
                var12_4 /* !! */  = (int)kq.hijs("hjvx", hijw(int ), (int)670);
                if (!var13_3) ** GOTO lbl261
                throw null;
            }
            case 48: {
                var12_4 /* !! */  = (int)kq.hijs("hjvy", hijw(int ), (int)671);
                if (!var13_3) ** GOTO lbl306
                throw null;
            }
lbl331:
            // 3 sources

            case 49: {
                var12_4 /* !! */  = (int)kq.hijs("hjvz", hijw(int ), (int)672);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl354
            }
            case 50: {
                var12_4 /* !! */  = (int)kq.hijs("hjwa", hijw(int ), (int)673);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 51: {
                var12_4 /* !! */  = (int)kq.hijs("hjwb", hijw(int ), (int)674);
                if (!var13_3) ** GOTO lbl310
                throw null;
            }
            case 52: {
                var12_4 /* !! */  = (int)kq.hijs("hjwc", hijw(int ), (int)675);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl350:
            // 2 sources

            case 53: {
                var12_4 /* !! */  = (int)kq.hijs("hjwd", hijw(int ), (int)676);
                if (!var13_3) ** GOTO lbl127
                throw null;
            }
lbl354:
            // 3 sources

            case 54: {
                var12_4 /* !! */  = (int)kq.hijs("hjwe", hijw(int ), (int)677);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl359:
            // 2 sources

            case 55: {
                var12_4 /* !! */  = (int)kq.hijs("hjwf", hijw(int ), (int)678);
                if (!var13_3) ** GOTO lbl199
                throw null;
            }
lbl363:
            // 3 sources

            case 56: {
                var12_4 /* !! */  = (int)kq.hijs("hjwg", hijw(int ), (int)679);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl403
            }
lbl368:
            // 2 sources

            case 57: {
                var12_4 /* !! */  = (int)kq.hijs("hjwh", hijw(int ), (int)680);
                if (!var13_3) ** GOTO lbl213
                throw null;
            }
lbl372:
            // 2 sources

            case 58: {
                var12_4 /* !! */  = (int)kq.hijs("hjwi", hijw(int ), (int)681);
                if (!var13_3) ** GOTO lbl255
                throw null;
            }
            case 59: {
                var12_4 /* !! */  = (int)kq.hijs("hjwj", hijw(int ), (int)682);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 60: {
                var12_4 /* !! */  = (int)kq.hijs("hjwk", hijw(int ), (int)683);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl386:
            // 2 sources

            case 61: {
                var12_4 /* !! */  = (int)kq.hijs("hjwl", hijw(int ), (int)684);
                if (!var13_3) ** GOTO lbl359
                throw null;
            }
            case 62: {
                var12_4 /* !! */  = (int)kq.hijs("hjwm", hijw(int ), (int)685);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl395:
            // 3 sources

            case 63: {
                var12_4 /* !! */  = (int)kq.hijs("hjwn", hijw(int ), (int)686);
                if (!var13_3) ** GOTO lbl287
                throw null;
            }
            case 64: {
                var12_4 /* !! */  = (int)kq.hijs("hjwo", hijw(int ), (int)687);
                if (!var13_3) ** GOTO lbl199
                throw null;
            }
lbl403:
            // 4 sources

            case 65: {
                var12_4 /* !! */  = (int)kq.hijs("hjwp", hijw(int ), (int)688);
                if (!var13_3) ** GOTO lbl395
                throw null;
            }
lbl407:
            // 4 sources

            case 66: {
                var12_4 /* !! */  = (int)kq.hijs("hjwq", hijw(int ), (int)689);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl421
            }
            case 67: {
                var12_4 /* !! */  = (int)kq.hijs("hjwr", hijw(int ), (int)690);
                if (!var13_3) ** GOTO lbl103
                throw null;
            }
lbl416:
            // 2 sources

            case 68: {
                do {
                    var12_4 /* !! */  = (int)kq.hijs("hjws", hijw(int ), (int)691);
                } while (!var13_3);
                throw null;
            }
lbl421:
            // 3 sources

            case 69: {
                var12_4 /* !! */  = (int)kq.hijs("hjwt", hijw(int ), (int)692);
                if (!var13_3) ** GOTO lbl250
                throw null;
            }
lbl425:
            // 3 sources

            case 70: {
                var12_4 /* !! */  = (int)kq.hijs("hjwu", hijw(int ), (int)693);
                if (!var13_3) ** GOTO lbl141
                throw null;
            }
lbl429:
            // 2 sources

            case 71: {
                var12_4 /* !! */  = (int)kq.hijs("hjwv", hijw(int ), (int)694);
                if (!var13_3) ** GOTO lbl331
                throw null;
            }
            case 72: {
                var12_4 /* !! */  = (int)kq.hijs("hjww", hijw(int ), (int)695);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl438:
            // 3 sources

            case 73: {
                var12_4 /* !! */  = (int)kq.hijs("hjwx", hijw(int ), (int)696);
                if (!var13_3) ** GOTO lbl421
                throw null;
            }
lbl442:
            // 4 sources

            case 74: {
                var12_4 /* !! */  = (int)kq.hijs("hjwy", hijw(int ), (int)697);
                if (!var13_3) ** GOTO lbl314
                throw null;
            }
lbl446:
            // 4 sources

            case 75: {
                do {
                    var12_4 /* !! */  = (int)kq.hijs("hjwz", hijw(int ), (int)698);
                } while (!var13_3);
                throw null;
            }
            case 76: {
                var12_4 /* !! */  = (int)kq.hijs("hjxa", hijw(int ), (int)699);
                if (!var13_3) ** GOTO lbl137
                throw null;
            }
            case 77: 
        }
        var12_4 /* !! */  = (int)kq.hijs("hjxb", hijw(int ), (int)700);
        ** while (!var13_3)
lbl458:
        // 1 sources

        throw null;
    }

    public static CallSite hijs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int lerpColor(int var0, int var1_1, float var2_2) {
        var17_3 = kq.c;
        var16_4 /* !! */  = kq.b;
        var15_5 = kq.a;
        if (var17_3) {
            throw null;
lbl6:
            // 13 sources

            return (int)kq.hijs("hjxc", hijw(int ), (int)701);
        }
        if (var15_5 || var15_5) ** GOTO lbl6
        var3_6 = var0 >> kq.hijs("hjxd", hijw(int ), (int)702) & kq.hijs("hjxe", hijw(int ), (int)703);
        if (var15_5 || var15_5) ** GOTO lbl6
        var4_7 = var0 >> kq.hijs("hjxf", hijw(int ), (int)704) & kq.hijs("hjxg", hijw(int ), (int)705);
        if (var15_5 || var15_5) ** GOTO lbl6
        var5_8 = var0 >> kq.hijs("hjxh", hijw(int ), (int)706) & kq.hijs("hjxi", hijw(int ), (int)707);
        if (var15_5 || var15_5) ** GOTO lbl6
        var6_9 = var0 & kq.hijs("hjxj", hijw(int ), (int)708);
        if (var15_5 || var15_5) ** GOTO lbl6
        var7_10 = var1_1 >> kq.hijs("hjxk", hijw(int ), (int)709) & kq.hijs("hjxl", hijw(int ), (int)710);
        if (var15_5 || var15_5) ** GOTO lbl6
        var8_11 = var1_1 >> kq.hijs("hjxm", hijw(int ), (int)711) & kq.hijs("hjxn", hijw(int ), (int)712);
        if (var15_5 || var15_5) ** GOTO lbl6
        var9_12 = var1_1 >> kq.hijs("hjxo", hijw(int ), (int)713) & kq.hijs("hjxp", hijw(int ), (int)714);
        if (var15_5 || var15_5) ** GOTO lbl6
        var10_13 = var1_1 & kq.hijs("hjxq", hijw(int ), (int)715);
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5 || var15_5) ** GOTO lbl6
                var11_14 = (int)((float)var3_6 + (float)(var7_10 - var3_6) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_15 = (int)((float)var4_7 + (float)(var8_11 - var4_7) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var13_16 = (int)((float)var5_8 + (float)(var9_12 - var5_8) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var14_17 = (int)((float)var6_9 + (float)(var10_13 - var6_9) * var2_2);
                if (var15_5 || var15_5) ** continue;
                return var11_14 << kq.hijs("hjxr", hijw(int ), (int)716) | var12_15 << kq.hijs("hjxs", hijw(int ), (int)717) | var13_16 << kq.hijs("hjxt", hijw(int ), (int)718) | var14_17;
            }
lbl37:
            // 2 sources

            case 0: {
                var16_4 /* !! */  = (int)kq.hijs("hjxu", hijw(int ), (int)719);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl42:
            // 2 sources

            case 1: {
                do {
                    var16_4 /* !! */  = (int)kq.hijs("hjxv", hijw(int ), (int)720);
                } while (!var17_3);
                throw null;
            }
            case 2: {
                var16_4 /* !! */  = (int)kq.hijs("hjxw", hijw(int ), (int)721);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 3: {
                var16_4 /* !! */  = (int)kq.hijs("hjxx", hijw(int ), (int)722);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 4: {
                var16_4 /* !! */  = (int)kq.hijs("hjxy", hijw(int ), (int)723);
                if (var17_3) {
                    throw null;
                }
            }
lbl61:
            // 5 sources

            case 5: {
                var16_4 /* !! */  = (int)kq.hijs("hjxz", hijw(int ), (int)724);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 6: {
                var16_4 /* !! */  = (int)kq.hijs("hjya", hijw(int ), (int)725);
                if (!var17_3) ** GOTO lbl61
                throw null;
            }
            case 7: {
                var16_4 /* !! */  = (int)kq.hijs("hjyb", hijw(int ), (int)726);
                if (var17_3) {
                    throw null;
                }
            }
lbl74:
            // 4 sources

            case 8: {
                var16_4 /* !! */  = (int)kq.hijs("hjyc", hijw(int ), (int)727);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 9: {
                var16_4 /* !! */  = (int)kq.hijs("hjyd", hijw(int ), (int)728);
                if (!var17_3) ** GOTO lbl42
                throw null;
            }
lbl83:
            // 2 sources

            case 10: {
                var16_4 /* !! */  = (int)kq.hijs("hjye", hijw(int ), (int)729);
                if (!var17_3) ** GOTO lbl61
                throw null;
            }
            case 11: {
                var16_4 /* !! */  = (int)kq.hijs("hjyf", hijw(int ), (int)730);
                if (!var17_3) ** GOTO lbl37
                throw null;
            }
lbl91:
            // 2 sources

            case 12: {
                var16_4 /* !! */  = (int)kq.hijs("hjyg", hijw(int ), (int)731);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl96:
            // 2 sources

            case 13: {
                var16_4 /* !! */  = (int)kq.hijs("hjyh", hijw(int ), (int)732);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl101:
            // 2 sources

            case 14: {
                var16_4 /* !! */  = (int)kq.hijs("hjyi", hijw(int ), (int)733);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl106:
            // 2 sources

            case 15: {
                var16_4 /* !! */  = (int)kq.hijs("hjyj", hijw(int ), (int)734);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl111:
            // 2 sources

            case 16: {
                var16_4 /* !! */  = (int)kq.hijs("hjyk", hijw(int ), (int)735);
                if (!var17_3) ** GOTO lbl74
                throw null;
            }
lbl115:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_4 /* !! */  = (int)kq.hijs("hjyl", hijw(int ), (int)736);
                    if (var17_3) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
lbl121:
            // 3 sources

            case 18: {
                var16_4 /* !! */  = (int)kq.hijs("hjym", hijw(int ), (int)737);
                if (!var17_3) ** GOTO lbl101
                throw null;
            }
lbl125:
            // 2 sources

            case 19: {
                var16_4 /* !! */  = (int)kq.hijs("hjyn", hijw(int ), (int)738);
                if (!var17_3) ** GOTO lbl115
                throw null;
            }
            case 20: {
                var16_4 /* !! */  = (int)kq.hijs("hjyo", hijw(int ), (int)739);
                if (!var17_3) ** GOTO lbl125
                throw null;
            }
lbl133:
            // 3 sources

            case 21: {
                var16_4 /* !! */  = (int)kq.hijs("hjyp", hijw(int ), (int)740);
                if (!var17_3) ** GOTO lbl111
                throw null;
            }
lbl137:
            // 4 sources

            case 22: {
                var16_4 /* !! */  = (int)kq.hijs("hjyq", hijw(int ), (int)741);
                if (!var17_3) ** GOTO lbl96
                throw null;
            }
lbl141:
            // 2 sources

            case 23: {
                var16_4 /* !! */  = (int)kq.hijs("hjyr", hijw(int ), (int)742);
                if (!var17_3) ** GOTO lbl83
                throw null;
            }
lbl145:
            // 2 sources

            case 24: {
                var16_4 /* !! */  = (int)kq.hijs("hjys", hijw(int ), (int)743);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 25: {
                var16_4 /* !! */  = (int)kq.hijs("hjyt", hijw(int ), (int)744);
                if (!var17_3) ** GOTO lbl141
                throw null;
            }
lbl154:
            // 3 sources

            case 26: {
                var16_4 /* !! */  = (int)kq.hijs("hjyu", hijw(int ), (int)745);
                if (!var17_3) ** GOTO lbl121
                throw null;
            }
            case 27: 
        }
        var16_4 /* !! */  = (int)kq.hijs("hjyv", hijw(int ), (int)746);
        ** while (!var17_3)
lbl161:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, boolean var8_8) {
        block80: {
            block79: {
                block78: {
                    block77: {
                        block76: {
                            var14_9 = kq.c;
                            var13_10 /* !! */  = kq.b;
                            var12_11 = kq.a;
                            if (var14_9) {
                                throw null;
lbl6:
                                // 18 sources

                                return;
                            }
                            if (var12_11 || var12_11) ** GOTO lbl6
                            if (kq.hasFonts()) break block76;
                            if (var12_11 || var12_11) ** GOTO lbl6
                            return;
                        }
                        if (var12_11 || var12_11) ** GOTO lbl6
                        if (var1_1 != null) break block77;
                        if (var12_11 || var12_11) ** GOTO lbl6
                        var1_1 = kv.getDefault();
                        if (var12_11) ** GOTO lbl6
                    }
                    if (var12_11 || var12_11) ** GOTO lbl6
                    var9_12 = ki.fadeColor(var6_6);
                    if (var12_11 || var12_11) ** GOTO lbl6
                    if (!var8_8) break block78;
                    if (var12_11 || var12_11) ** GOTO lbl6
                    var10_13 = var1_1;
                    if (var12_11 || var12_11) ** GOTO lbl6
                    var11_14 = ki.createProjection();
                    if (var12_11 || var12_11) ** GOTO lbl6
                    ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$text$0(org.joml.Matrix4f ruhack.phobia.ks java.lang.String float float float int float ), ()V)((Matrix4f)var11_14, (ks)var10_13, (String)var2_2, (float)var3_3, (float)var4_4, (float)var5_5, (int)var9_12, (float)var7_7));
                    if (var12_11 || var12_11) ** GOTO lbl6
                    return;
                }
                if (var12_11 || var12_11) ** GOTO lbl6
                if (var1_1 == null) break block79;
                if (var12_11) ** GOTO lbl6
                if (var1_1.isLoaded()) break block80;
                if (var12_11) ** GOTO lbl6
            }
            if (var12_11 || var12_11) ** GOTO lbl6
            kq.fallbackText(var0, var2_2, var3_3, var4_4, var5_5, var9_12);
            if (var12_11 || var12_11) ** GOTO lbl6
            return;
        }
        if (var13_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_11 || var12_11) ** GOTO lbl6
                kr.drawString(ki.createProjection(), var1_1, var2_2, var3_3, var4_4, var5_5, var9_12, var7_7, 0.0f);
                if (!var12_11 && !var12_11) ** break;
                ** continue;
                return;
            }
            case 0: {
                var13_10 /* !! */  = (int)kq.hijs("hiss", hijw(int ), (int)135);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl56:
            // 2 sources

            case 1: {
                var13_10 /* !! */  = (int)kq.hijs("hist", hijw(int ), (int)136);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl81
            }
lbl61:
            // 2 sources

            case 2: {
                var13_10 /* !! */  = (int)kq.hijs("hisu", hijw(int ), (int)137);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 3: {
                var13_10 /* !! */  = (int)kq.hijs("hisv", hijw(int ), (int)138);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 4: {
                var13_10 /* !! */  = (int)kq.hijs("hisw", hijw(int ), (int)139);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl76:
            // 4 sources

            case 5: {
                var13_10 /* !! */  = (int)kq.hijs("hisx", hijw(int ), (int)140);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl81:
            // 3 sources

            case 6: {
                var13_10 /* !! */  = (int)kq.hijs("hisy", hijw(int ), (int)141);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 7: {
                var13_10 /* !! */  = (int)kq.hijs("hisz", hijw(int ), (int)142);
                if (!var14_9) ** GOTO lbl76
                throw null;
            }
lbl90:
            // 2 sources

            case 8: {
                var13_10 /* !! */  = (int)kq.hijs("hita", hijw(int ), (int)143);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl95:
            // 2 sources

            case 9: {
                var13_10 /* !! */  = (int)kq.hijs("hitb", hijw(int ), (int)144);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 10: {
                var13_10 /* !! */  = (int)kq.hijs("hitc", hijw(int ), (int)145);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 11: {
                var13_10 /* !! */  = (int)kq.hijs("hitd", hijw(int ), (int)146);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl110:
            // 2 sources

            case 12: {
                var13_10 /* !! */  = (int)kq.hijs("hite", hijw(int ), (int)147);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl115:
            // 4 sources

            case 13: {
                var13_10 /* !! */  = (int)kq.hijs("hitf", hijw(int ), (int)148);
                if (!var14_9) ** GOTO lbl76
                throw null;
            }
lbl119:
            // 2 sources

            case 14: {
                var13_10 /* !! */  = (int)kq.hijs("hitg", hijw(int ), (int)149);
                if (!var14_9) ** GOTO lbl56
                throw null;
            }
lbl123:
            // 3 sources

            case 15: {
                var13_10 /* !! */  = (int)kq.hijs("hith", hijw(int ), (int)150);
                if (!var14_9) ** GOTO lbl115
                throw null;
            }
lbl127:
            // 2 sources

            case 16: {
                var13_10 /* !! */  = (int)kq.hijs("hiti", hijw(int ), (int)151);
                if (!var14_9) ** GOTO lbl95
                throw null;
            }
lbl131:
            // 2 sources

            case 17: {
                var13_10 /* !! */  = (int)kq.hijs("hitj", hijw(int ), (int)152);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl136:
            // 2 sources

            case 18: {
                var13_10 /* !! */  = (int)kq.hijs("hitk", hijw(int ), (int)153);
                if (!var14_9) ** GOTO lbl123
                throw null;
            }
            case 19: {
                var13_10 /* !! */  = (int)kq.hijs("hitl", hijw(int ), (int)154);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 20: {
                var13_10 /* !! */  = (int)kq.hijs("hitm", hijw(int ), (int)155);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl150:
            // 4 sources

            case 21: {
                var13_10 /* !! */  = (int)kq.hijs("hitn", hijw(int ), (int)156);
                if (!var14_9) ** GOTO lbl123
                throw null;
            }
lbl154:
            // 3 sources

            case 22: {
                var13_10 /* !! */  = (int)kq.hijs("hito", hijw(int ), (int)157);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl159:
            // 2 sources

            case 23: {
                var13_10 /* !! */  = (int)kq.hijs("hitp", hijw(int ), (int)158);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 24: {
                var13_10 /* !! */  = (int)kq.hijs("hitq", hijw(int ), (int)159);
                if (!var14_9) ** GOTO lbl127
                throw null;
            }
            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_10 /* !! */  = (int)kq.hijs("hitr", hijw(int ), (int)160);
                    if (var14_9) {
                        throw null;
                    }
                    ** GOTO lbl208
                    break;
                }
            }
            case 26: {
                var13_10 /* !! */  = (int)kq.hijs("hits", hijw(int ), (int)161);
                if (!var14_9) ** GOTO lbl154
                throw null;
            }
lbl178:
            // 2 sources

            case 27: {
                var13_10 /* !! */  = (int)kq.hijs("hitt", hijw(int ), (int)162);
                if (!var14_9) ** GOTO lbl110
                throw null;
            }
            case 28: {
                var13_10 /* !! */  = (int)kq.hijs("hitu", hijw(int ), (int)163);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 29: {
                var13_10 /* !! */  = (int)kq.hijs("hitv", hijw(int ), (int)164);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl192:
            // 4 sources

            case 30: {
                var13_10 /* !! */  = (int)kq.hijs("hitw", hijw(int ), (int)165);
                if (!var14_9) ** GOTO lbl81
                throw null;
            }
            case 31: {
                var13_10 /* !! */  = (int)kq.hijs("hitx", hijw(int ), (int)166);
                if (!var14_9) ** GOTO lbl119
                throw null;
            }
lbl200:
            // 2 sources

            case 32: {
                var13_10 /* !! */  = (int)kq.hijs("hity", hijw(int ), (int)167);
                if (!var14_9) ** GOTO lbl131
                throw null;
            }
lbl204:
            // 3 sources

            case 33: {
                var13_10 /* !! */  = (int)kq.hijs("hitz", hijw(int ), (int)168);
                if (!var14_9) ** GOTO lbl136
                throw null;
            }
lbl208:
            // 3 sources

            case 34: {
                var13_10 /* !! */  = (int)kq.hijs("hiua", hijw(int ), (int)169);
                if (!var14_9) ** GOTO lbl61
                throw null;
            }
lbl212:
            // 2 sources

            case 35: {
                do {
                    var13_10 /* !! */  = (int)kq.hijs("hiub", hijw(int ), (int)170);
                } while (!var14_9);
                throw null;
            }
            case 36: 
        }
        var13_10 /* !! */  = (int)kq.hijs("hiuc", hijw(int ), (int)171);
        ** while (!var14_9)
lbl220:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textGradient(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjmy", hijp(int ), (int)280)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjmz", hijw(int ), (int)475)) break;
            v0 /* !! */  = (long)kq.hijs("hjna", hijw(int ), (int)476);
        }
        var9_7 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(kq.hijs("hjnc", hijp(int ), (int)282) - kq.hijs("hjnb", hijp(int ), (int)281));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2068465879: {
                    continue block19;
                }
                case 722891128: {
                    break block19;
                }
            }
            break;
        }
        var8_8 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjnd", hijp(int ), (int)283)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hjne", hijw(int ), (int)477)) break;
            v2 /* !! */  = (long)kq.hijs("hjnf", hijw(int ), (int)478);
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl25
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjng", hijp(int ), (int)284)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kq.hijs("hjnh", hijw(int ), (int)479)) break;
                    v3 /* !! */  = (long)kq.hijs("hjni", hijw(int ), (int)480);
                }
                v4 = kv.getDefault();
                v5 = kq.hijs("hjnj", hijw(int ), (int)481);
                v6 /* !! */  = kq.ok;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v6 /* !! */  = (long)(v7 - kq.hijs("hjnk", hijp(int ), (int)285));
lbl42:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -807755183: {
                            v7 = kq.hijs("hjnl", hijp(int ), (int)286);
                            continue block23;
                        }
                        case -783881230: {
                            v7 = kq.hijs("hjnm", hijp(int ), (int)287);
                            continue block23;
                        }
                        case 722891128: {
                            break block23;
                        }
                        case 1287957890: {
                            v7 = kq.hijs("hjnn", hijp(int ), (int)288);
                            continue block23;
                        }
                    }
                    break;
                }
                kq.textGradient(var0, v4, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, (boolean)v5);
                if (var7_9 || var7_9) ** continue;
                return;
            }
            case 0: {
                var8_8 /* !! */  = (int)kq.hijs("hjno", hijw(int ), (int)482);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl66
            }
lbl62:
            // 2 sources

            case 1: {
                var8_8 /* !! */  = (int)kq.hijs("hjnp", hijw(int ), (int)483);
                if (var9_7) {
                    throw null;
                }
            }
lbl66:
            // 6 sources

            case 2: {
                var8_8 /* !! */  = (int)kq.hijs("hjnq", hijw(int ), (int)484);
                if (!var9_7) ** GOTO lbl62
                throw null;
            }
            case 3: {
                var8_8 /* !! */  = (int)kq.hijs("hjnr", hijw(int ), (int)485);
                if (!var9_7) ** GOTO lbl66
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 /* !! */  = (int)kq.hijs("hjns", hijw(int ), (int)486);
                    if (!var9_7) ** GOTO lbl66
                    throw null;
                }
            }
            case 5: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hjnt", hijw(int ), (int)487);
        ** while (!var9_7)
lbl82:
        // 1 sources

        throw null;
    }

    private static void hkdf() {
        kq.hijr[300] = -4737586968983232436L;
        kq.hijr[301] = -9191979861328883547L;
        kq.hijr[302] = -2347351193809828829L;
        kq.hijr[303] = 5341311634153874195L;
        kq.hijr[304] = 3608451834945048831L;
        kq.hijr[305] = 3802311262416301812L;
        kq.hijr[306] = 241527361769151081L;
        kq.hijr[307] = -8229389417716481027L;
        kq.hijr[308] = -6458231233213305534L;
        kq.hijr[309] = 9133738302897491829L;
        kq.hijr[310] = -2655691965945434165L;
        kq.hijr[311] = 1676341281279369298L;
        kq.hijr[312] = 5743261951019087351L;
        kq.hijr[313] = -2863985169867859470L;
        kq.hijr[314] = 3355429613307697483L;
        kq.hijr[315] = 7383038014184000758L;
        kq.hijr[316] = 940599756447475355L;
        kq.hijr[317] = 6441531613705701974L;
        kq.hijr[318] = 8129572175634635460L;
        kq.hijr[319] = -5100853220789373849L;
        kq.hijr[320] = 7740593884040758079L;
        kq.hijr[321] = 3788836099707840374L;
        kq.hijr[322] = 5083690203686488483L;
        kq.hijr[323] = 830043235521979735L;
        kq.hijr[324] = -4168762448006015271L;
        kq.hijr[325] = -5100021355849089357L;
        kq.hijr[326] = -1507400889370441913L;
        kq.hijr[327] = -7523832020514254772L;
        kq.hijr[328] = 8743781132291711751L;
        kq.hijr[329] = 4876101942963864227L;
        kq.hijr[330] = 5428917368011985693L;
        kq.hijr[331] = -3028974782932211559L;
        kq.hijr[332] = -2164406713863251423L;
        kq.hijr[333] = -2652118848657244639L;
        kq.hijr[334] = -8268375744657966228L;
        kq.hijr[335] = 985627713615326097L;
        kq.hijr[336] = 309002577594754967L;
        kq.hijr[337] = 1406973189918418181L;
        kq.hijr[338] = -8477048987903577864L;
        kq.hijr[339] = -4239193728814534646L;
        kq.hijr[340] = -1849031338423314528L;
        kq.hijr[341] = -6594785639449693747L;
        kq.hijr[342] = 7942160752764406351L;
        kq.hijr[343] = -6243648837409196252L;
        kq.hijr[344] = -2815327057239405778L;
        kq.hijr[345] = 3706844477936015902L;
        kq.hijr[346] = 774931766722556416L;
        kq.hijr[347] = 1219505926153051951L;
        kq.hijr[348] = -6548916775840966468L;
        kq.hijr[349] = 2477458278275062074L;
        kq.hijr[350] = 7480903636104782484L;
        kq.hijr[351] = 3023216659829634564L;
        kq.hijr[352] = 6286478501882627705L;
        kq.hijr[353] = -5099906502619949394L;
        kq.hijr[354] = 8325852125466851191L;
        kq.hijr[355] = -8973544197771719324L;
        kq.hijr[356] = 2956244417036123341L;
        kq.hijr[357] = -4045353508264665714L;
        kq.hijr[358] = 8982432507188269725L;
        kq.hijr[359] = 5631719315521821086L;
        kq.hijr[360] = 7594890966741538987L;
        kq.hijr[361] = -7287475653092656839L;
    }

    private static void hkcw() {
        kq.hijy[600] = 467744759;
        kq.hijy[601] = 318665053;
        kq.hijy[602] = 645277378;
        kq.hijy[603] = 704030139;
        kq.hijy[604] = -1902300434;
        kq.hijy[605] = -1151536704;
        kq.hijy[606] = 488536003;
        kq.hijy[607] = 1839746139;
        kq.hijy[608] = -1710837748;
        kq.hijy[609] = 1249656439;
        kq.hijy[610] = 69904216;
        kq.hijy[611] = -1601593767;
        kq.hijy[612] = 898172122;
        kq.hijy[613] = -1238833248;
        kq.hijy[614] = 591372367;
        kq.hijy[615] = -342593896;
        kq.hijy[616] = -1337459115;
        kq.hijy[617] = 379892167;
        kq.hijy[618] = 776855820;
        kq.hijy[619] = -210154786;
        kq.hijy[620] = 1776474884;
        kq.hijy[621] = 1623787624;
        kq.hijy[622] = -2100374081;
        kq.hijy[623] = 1253678075;
        kq.hijy[624] = -1180413364;
        kq.hijy[625] = -1786800974;
        kq.hijy[626] = -1438572076;
        kq.hijy[627] = -108977103;
        kq.hijy[628] = 1775975683;
        kq.hijy[629] = -1368982387;
        kq.hijy[630] = -1348760401;
        kq.hijy[631] = 1848541135;
        kq.hijy[632] = -1799572670;
        kq.hijy[633] = 676728286;
        kq.hijy[634] = -860519015;
        kq.hijy[635] = 1984990238;
        kq.hijy[636] = -454446210;
        kq.hijy[637] = -288368119;
        kq.hijy[638] = -786468108;
        kq.hijy[639] = 2077808769;
        kq.hijy[640] = 2059380441;
        kq.hijy[641] = 731874743;
        kq.hijy[642] = 81019062;
        kq.hijy[643] = 2074183127;
        kq.hijy[644] = -767797578;
        kq.hijy[645] = -1275408167;
        kq.hijy[646] = -2117017068;
        kq.hijy[647] = -211339229;
        kq.hijy[648] = -1598871670;
        kq.hijy[649] = 1425447659;
        kq.hijy[650] = 1463138941;
        kq.hijy[651] = 876478063;
        kq.hijy[652] = 1998236921;
        kq.hijy[653] = 2080958333;
        kq.hijy[654] = -1168039479;
        kq.hijy[655] = 361911532;
        kq.hijy[656] = 311880481;
        kq.hijy[657] = -905435410;
        kq.hijy[658] = 95516594;
        kq.hijy[659] = 1379247454;
        kq.hijy[660] = 1247140144;
        kq.hijy[661] = 802146171;
        kq.hijy[662] = -326075774;
        kq.hijy[663] = -418911818;
        kq.hijy[664] = -317130436;
        kq.hijy[665] = -1347530121;
        kq.hijy[666] = -1202662130;
        kq.hijy[667] = 2143704320;
        kq.hijy[668] = 723523922;
        kq.hijy[669] = -1237214757;
        kq.hijy[670] = 1552029666;
        kq.hijy[671] = 1688282751;
        kq.hijy[672] = 936808911;
        kq.hijy[673] = -458638847;
        kq.hijy[674] = -85028419;
        kq.hijy[675] = -524743915;
        kq.hijy[676] = 317035758;
        kq.hijy[677] = -716966996;
        kq.hijy[678] = -88491201;
        kq.hijy[679] = -792284952;
        kq.hijy[680] = 660824994;
        kq.hijy[681] = -676683189;
        kq.hijy[682] = 172829152;
        kq.hijy[683] = -399150781;
        kq.hijy[684] = 50363302;
        kq.hijy[685] = 1489490558;
        kq.hijy[686] = 1546468900;
        kq.hijy[687] = 1545876665;
        kq.hijy[688] = 2073105105;
        kq.hijy[689] = -325305127;
        kq.hijy[690] = -1163001588;
        kq.hijy[691] = -2058488433;
        kq.hijy[692] = 1885500334;
        kq.hijy[693] = 20228327;
        kq.hijy[694] = -250354481;
        kq.hijy[695] = -837974949;
        kq.hijy[696] = 61935436;
        kq.hijy[697] = -1318847376;
        kq.hijy[698] = -1187816246;
        kq.hijy[699] = -288984344;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void lambda$textGradient$3(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int var7_7) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjzn", hijp(int ), (int)323));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1403971525: {
                    v1 = kq.hijs("hjzo", hijp(int ), (int)324);
                    continue block24;
                }
                case -722377000: {
                    v1 = kq.hijs("hjzp", hijp(int ), (int)325);
                    continue block24;
                }
                case 722891128: {
                    break block24;
                }
            }
            break;
        }
        var10_8 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjzq", hijp(int ), (int)326));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1644759201: {
                    v3 = kq.hijs("hjzr", hijp(int ), (int)327);
                    continue block25;
                }
                case 9381147: {
                    v3 = kq.hijs("hjzs", hijp(int ), (int)328);
                    continue block25;
                }
                case 722891128: {
                    break block25;
                }
                case 1098896068: {
                    v3 = kq.hijs("hjzt", hijp(int ), (int)329);
                    continue block25;
                }
            }
            break;
        }
        var9_9 /* !! */  = kq.b;
        v4 /* !! */  = kq.ok;
        if (true) ** GOTO lbl36
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - kq.hijs("hjzu", hijp(int ), (int)330));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1815743874: {
                    v5 = kq.hijs("hjzv", hijp(int ), (int)331);
                    continue block26;
                }
                case -530575866: {
                    v5 = kq.hijs("hjzw", hijp(int ), (int)332);
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
                case 2043364422: {
                    v5 = kq.hijs("hjzx", hijp(int ), (int)333);
                    continue block26;
                }
            }
            break;
        }
        var8_10 = kq.a;
        if (var10_8) {
            throw null;
lbl51:
            // 2 sources

            return;
        }
        if (var8_10 || var8_10) ** GOTO lbl51
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 = kq.hijs("hjzy", hijw(int ), (int)759);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjzz", hijp(int ), (int)334)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kq.hijs("hkaa", hijw(int ), (int)760)) break;
                    v7 /* !! */  = (long)kq.hijs("hkab", hijw(int ), (int)761);
                }
                kq.textGradient(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, (boolean)v6);
                if (!var8_10) ** break;
                ** continue;
                return;
            }
lbl67:
            // 2 sources

            case 0: {
                var9_9 /* !! */  = (int)kq.hijs("hkac", hijw(int ), (int)762);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl72:
            // 2 sources

            case 1: {
                var9_9 /* !! */  = (int)kq.hijs("hkad", hijw(int ), (int)763);
                if (!var10_8) ** GOTO lbl67
                throw null;
            }
lbl76:
            // 3 sources

            case 2: {
                var9_9 /* !! */  = (int)kq.hijs("hkae", hijw(int ), (int)764);
                if (!var10_8) ** GOTO lbl72
                throw null;
            }
            case 3: {
                var9_9 /* !! */  = (int)kq.hijs("hkaf", hijw(int ), (int)765);
                if (!var10_8) ** GOTO lbl76
                throw null;
            }
            case 4: 
        }
        do {
            var9_9 /* !! */  = (int)kq.hijs("hkag", hijw(int ), (int)766);
        } while (!var10_8);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textCentered(class_332 var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjdf", hijp(int ), (int)202)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kq.hijs("hjdg", hijw(int ), (int)300)) break;
            v0 /* !! */  = (long)kq.hijs("hjdh", hijw(int ), (int)301);
        }
        var9_7 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjdi", hijp(int ), (int)203)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kq.hijs("hjdj", hijw(int ), (int)302)) break;
            v1 /* !! */  = (long)kq.hijs("hjdk", hijw(int ), (int)303);
        }
        var8_8 /* !! */  = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjdl", hijp(int ), (int)204));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1468367151: {
                    v3 = kq.hijs("hjdm", hijp(int ), (int)205);
                    continue block22;
                }
                case -696730229: {
                    v3 = kq.hijs("hjdn", hijp(int ), (int)206);
                    continue block22;
                }
                case 722891128: {
                    break block22;
                }
                case 2021610461: {
                    v3 = kq.hijs("hjdo", hijp(int ), (int)207);
                    continue block22;
                }
            }
            break;
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl34:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjdp", hijp(int ), (int)208)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == kq.hijs("hjdq", hijw(int ), (int)304)) break;
            v4 /* !! */  = (long)kq.hijs("hjdr", hijw(int ), (int)305);
        }
        v5 = var3_3 - kq.width(var1_1, var2_2, var5_5) / 2.0f;
        v6 = kq.hijs("hjds", hijw(int ), (int)306);
        v7 /* !! */  = kq.ok;
        if (true) ** GOTO lbl49
        block25: while (true) {
            v7 /* !! */  = (long)(v8 - kq.hijs("hjdt", hijp(int ), (int)209));
lbl49:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1072753594: {
                    v8 = kq.hijs("hjdu", hijp(int ), (int)210);
                    continue block25;
                }
                case 722891128: {
                    break block25;
                }
                case 2020825602: {
                    v8 = kq.hijs("hjdv", hijp(int ), (int)211);
                    continue block25;
                }
                case 2052813544: {
                    v8 = kq.hijs("hjdw", hijp(int ), (int)212);
                    continue block25;
                }
            }
            break;
        }
        kq.text(var0, var1_1, var2_2, v5, var4_4, var5_5, var6_6, (boolean)v6);
        ** while (var7_9 || var7_9)
lbl63:
        // 1 sources

        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl67:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 /* !! */  = (int)kq.hijs("hjdx", hijw(int ), (int)307);
                    if (var9_7) {
                        throw null;
                    }
                    ** GOTO lbl82
                    break;
                }
            }
            case 1: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjdy", hijw(int ), (int)308);
                } while (!var9_7);
                throw null;
            }
            case 2: {
                var8_8 /* !! */  = (int)kq.hijs("hjdz", hijw(int ), (int)309);
                if (!var9_7) break;
                throw null;
            }
lbl82:
            // 2 sources

            case 3: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjea", hijw(int ), (int)310);
                } while (!var9_7);
                throw null;
            }
            case 4: {
                var8_8 /* !! */  = (int)kq.hijs("hjeb", hijw(int ), (int)311);
                if (!var9_7) ** GOTO lbl67
                throw null;
            }
            case 5: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hjec", hijw(int ), (int)312);
        ** while (!var9_7)
lbl94:
        // 1 sources

        throw null;
    }

    private static void hkct() {
        kq.hijy[300] = -1812948055;
        kq.hijy[301] = -1081430156;
        kq.hijy[302] = 998190535;
        kq.hijy[303] = -536315336;
        kq.hijy[304] = -1018193391;
        kq.hijy[305] = -1720295306;
        kq.hijy[306] = -470432676;
        kq.hijy[307] = -459488692;
        kq.hijy[308] = 1795234723;
        kq.hijy[309] = 449004360;
        kq.hijy[310] = -719461067;
        kq.hijy[311] = -1889656584;
        kq.hijy[312] = 870412947;
        kq.hijy[313] = -1871375427;
        kq.hijy[314] = 1066234037;
        kq.hijy[315] = -2122402329;
        kq.hijy[316] = -1417907276;
        kq.hijy[317] = -1702744323;
        kq.hijy[318] = 795569275;
        kq.hijy[319] = -595924288;
        kq.hijy[320] = -1595356356;
        kq.hijy[321] = 1726356775;
        kq.hijy[322] = 668307977;
        kq.hijy[323] = -714609261;
        kq.hijy[324] = 2015798102;
        kq.hijy[325] = 1624576531;
        kq.hijy[326] = 1608855778;
        kq.hijy[327] = -701706878;
        kq.hijy[328] = 961122704;
        kq.hijy[329] = -1352563564;
        kq.hijy[330] = -152774418;
        kq.hijy[331] = 1359093746;
        kq.hijy[332] = -385551969;
        kq.hijy[333] = -2039651934;
        kq.hijy[334] = -347871030;
        kq.hijy[335] = 10593811;
        kq.hijy[336] = 1311750332;
        kq.hijy[337] = 1400877497;
        kq.hijy[338] = 201886541;
        kq.hijy[339] = 603866215;
        kq.hijy[340] = -1774243139;
        kq.hijy[341] = 1245131472;
        kq.hijy[342] = -1951358983;
        kq.hijy[343] = -510389840;
        kq.hijy[344] = 516013448;
        kq.hijy[345] = -1505755032;
        kq.hijy[346] = -954678683;
        kq.hijy[347] = 1363306945;
        kq.hijy[348] = 473860921;
        kq.hijy[349] = -1627459243;
        kq.hijy[350] = -1423810037;
        kq.hijy[351] = 344075118;
        kq.hijy[352] = -486397395;
        kq.hijy[353] = 1840276027;
        kq.hijy[354] = -343923141;
        kq.hijy[355] = -1960659384;
        kq.hijy[356] = -1657086772;
        kq.hijy[357] = 1872668087;
        kq.hijy[358] = 296063357;
        kq.hijy[359] = 653936089;
        kq.hijy[360] = 1390412599;
        kq.hijy[361] = 885995576;
        kq.hijy[362] = 389008616;
        kq.hijy[363] = -789572604;
        kq.hijy[364] = 1283000544;
        kq.hijy[365] = -339285770;
        kq.hijy[366] = -2024169086;
        kq.hijy[367] = 1452362060;
        kq.hijy[368] = 603445422;
        kq.hijy[369] = -863486333;
        kq.hijy[370] = -1573942695;
        kq.hijy[371] = 719575773;
        kq.hijy[372] = -626857439;
        kq.hijy[373] = -94403199;
        kq.hijy[374] = -442559182;
        kq.hijy[375] = -1055233464;
        kq.hijy[376] = -1830786018;
        kq.hijy[377] = 2001442521;
        kq.hijy[378] = 1536886671;
        kq.hijy[379] = -1714552780;
        kq.hijy[380] = -195504853;
        kq.hijy[381] = 452170570;
        kq.hijy[382] = -194937398;
        kq.hijy[383] = 1090441868;
        kq.hijy[384] = -1624904756;
        kq.hijy[385] = 1827150973;
        kq.hijy[386] = 983936217;
        kq.hijy[387] = 824528304;
        kq.hijy[388] = -406743722;
        kq.hijy[389] = 1817901774;
        kq.hijy[390] = -246453991;
        kq.hijy[391] = 422425503;
        kq.hijy[392] = 896338978;
        kq.hijy[393] = 435203631;
        kq.hijy[394] = 1410510688;
        kq.hijy[395] = 949318008;
        kq.hijy[396] = -483204919;
        kq.hijy[397] = 1184868683;
        kq.hijy[398] = 2026777426;
        kq.hijy[399] = 1858718014;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textCentered(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjcj", hijp(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjck", hijw(int ), (int)287)) break;
            v0 /* !! */  = (long)kq.hijs("hjcl", hijw(int ), (int)288);
        }
        var8_6 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(kq.hijs("hjcn", hijp(int ), (int)195) - kq.hijs("hjcm", hijp(int ), (int)194));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 722891128: {
                    break block19;
                }
                case 1688817881: {
                    continue block19;
                }
            }
            break;
        }
        var7_7 /* !! */  = kq.b;
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjco", hijp(int ), (int)196)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == kq.hijs("hjcp", hijw(int ), (int)289)) break;
                    v2 /* !! */  = (long)kq.hijs("hjcq", hijw(int ), (int)290);
                }
                var6_8 = kq.a;
                if (var8_6) {
                    throw null;
lbl28:
                    // 2 sources

                    return;
                }
                if (var6_8 || var6_8) ** GOTO lbl28
                v3 /* !! */  = kq.ok;
                if (true) ** GOTO lbl35
                block22: while (true) {
                    v3 /* !! */  = (long)(v4 - kq.hijs("hjcr", hijp(int ), (int)197));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -831888938: {
                            v4 = kq.hijs("hjcs", hijp(int ), (int)198);
                            continue block22;
                        }
                        case -709384917: {
                            v4 = kq.hijs("hjct", hijp(int ), (int)199);
                            continue block22;
                        }
                        case 722891128: {
                            break block22;
                        }
                        case 1530192360: {
                            v4 = kq.hijs("hjcu", hijp(int ), (int)200);
                            continue block22;
                        }
                    }
                    break;
                }
                v5 = var2_2 - kq.width(var1_1, var4_4) / 2.0f;
                v6 = kq.hijs("hjcv", hijw(int ), (int)291);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjcw", hijp(int ), (int)201)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kq.hijs("hjcx", hijw(int ), (int)292)) break;
                    v7 /* !! */  = (long)kq.hijs("hjcy", hijw(int ), (int)293);
                }
                kq.text(var0, var1_1, v5, var3_3, var4_4, var5_5, (boolean)v6);
                if (var6_8 || var6_8) ** continue;
                return;
            }
lbl57:
            // 3 sources

            case 0: {
                var7_7 /* !! */  = (int)kq.hijs("hjcz", hijw(int ), (int)294);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)kq.hijs("hjda", hijw(int ), (int)295);
                    if (!var8_6) ** GOTO lbl57
                    throw null;
                }
            }
            case 2: {
                var7_7 /* !! */  = (int)kq.hijs("hjdb", hijw(int ), (int)296);
                if (var8_6) {
                    throw null;
                }
            }
            case 3: {
                var7_7 /* !! */  = (int)kq.hijs("hjdc", hijw(int ), (int)297);
                if (var8_6) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 4: {
                var7_7 /* !! */  = (int)kq.hijs("hjdd", hijw(int ), (int)298);
                if (!var8_6) ** GOTO lbl57
                throw null;
            }
            case 5: 
        }
        var7_7 /* !! */  = (int)kq.hijs("hjde", hijw(int ), (int)299);
        ** while (!var8_6)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void fallbackText(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hiwn", hijp(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hiwo", hijw(int ), (int)204)) break;
            v0 /* !! */  = (long)kq.hijs("hiwp", hijw(int ), (int)205);
        }
        var9_6 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - kq.hijs("hiwq", hijp(int ), (int)126));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2085537657: {
                    v2 = kq.hijs("hiwr", hijp(int ), (int)127);
                    continue block28;
                }
                case -866594214: {
                    v2 = kq.hijs("hiws", hijp(int ), (int)128);
                    continue block28;
                }
                case 722891128: {
                    break block28;
                }
            }
            break;
        }
        var8_7 /* !! */  = kq.b;
        v3 /* !! */  = kq.ok;
        if (true) ** GOTO lbl25
        block29: while (true) {
            v3 /* !! */  = (long)(kq.hijs("hiwu", hijp(int ), (int)130) - kq.hijs("hiwt", hijp(int ), (int)129));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 722891128: {
                    break block29;
                }
                case 1478912887: {
                    continue block29;
                }
            }
            break;
        }
        var7_8 = kq.a;
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_6) {
                    throw null;
lbl36:
                    // 3 sources

                    return;
                }
                if (var7_8 || var7_8) ** GOTO lbl36
                v4 /* !! */  = kq.ok;
                if (true) ** GOTO lbl43
                block31: while (true) {
                    v4 /* !! */  = (long)(kq.hijs("hiww", hijp(int ), (int)132) - kq.hijs("hiwv", hijp(int ), (int)131));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -396153176: {
                            continue block31;
                        }
                        case 722891128: {
                            break block31;
                        }
                    }
                    break;
                }
                var6_9 = class_310.method_1551();
                if (var7_8 || var7_8) ** GOTO lbl36
                v5 /* !! */  = kq.ok;
                if (true) ** GOTO lbl54
                block32: while (true) {
                    v5 /* !! */  = (long)(kq.hijs("hiwy", hijp(int ), (int)134) - kq.hijs("hiwx", hijp(int ), (int)133));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -806844554: {
                            continue block32;
                        }
                        case 722891128: {
                            break block32;
                        }
                    }
                    break;
                }
                v6 = var6_9.field_1772;
                v7 = (int)var2_2;
                v8 = (int)var3_3;
                v9 = kq.hijs("hiwz", hijw(int ), (int)206);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hixa", hijp(int ), (int)135)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kq.hijs("hixb", hijw(int ), (int)207)) break;
                    v10 /* !! */  = (long)kq.hijs("hixc", hijw(int ), (int)208);
                }
                var0.method_51433(v6, var1_1, v7, v8, var5_5, (boolean)v9);
                if (var7_8 || var7_8) ** continue;
                return;
            }
lbl71:
            // 2 sources

            case 0: {
                var8_7 /* !! */  = (int)kq.hijs("hixd", hijw(int ), (int)209);
                if (var9_6) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_7 /* !! */  = (int)kq.hijs("hixe", hijw(int ), (int)210);
                    if (var9_6) {
                        throw null;
                    }
                    ** GOTO lbl91
                    break;
                }
            }
            case 2: {
                var8_7 /* !! */  = (int)kq.hijs("hixf", hijw(int ), (int)211);
                if (var9_6) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl87:
            // 2 sources

            case 3: {
                var8_7 /* !! */  = (int)kq.hijs("hixg", hijw(int ), (int)212);
                if (!var9_6) ** GOTO lbl71
                throw null;
            }
lbl91:
            // 2 sources

            case 4: {
                var8_7 /* !! */  = (int)kq.hijs("hixh", hijw(int ), (int)213);
                if (var9_6) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl96:
            // 3 sources

            case 5: {
                var8_7 /* !! */  = (int)kq.hijs("hixi", hijw(int ), (int)214);
                if (!var9_6) break;
                throw null;
            }
lbl100:
            // 2 sources

            case 6: {
                var8_7 /* !! */  = (int)kq.hijs("hixj", hijw(int ), (int)215);
                if (!var9_6) ** GOTO lbl87
                throw null;
            }
            case 7: 
        }
        var8_7 /* !! */  = (int)kq.hijs("hixk", hijw(int ), (int)216);
        ** while (!var9_6)
lbl107:
        // 1 sources

        throw null;
    }

    private static void hkcs() {
        kq.hijy[200] = 618967112;
        kq.hijy[201] = -1282561884;
        kq.hijy[202] = -1820842460;
        kq.hijy[203] = -502853156;
        kq.hijy[204] = -19204345;
        kq.hijy[205] = -1576864972;
        kq.hijy[206] = -1597860913;
        kq.hijy[207] = 1237558005;
        kq.hijy[208] = -1787692704;
        kq.hijy[209] = -2112764726;
        kq.hijy[210] = -598832412;
        kq.hijy[211] = -1418418247;
        kq.hijy[212] = -1359715768;
        kq.hijy[213] = -1093383797;
        kq.hijy[214] = -975848248;
        kq.hijy[215] = -1788605952;
        kq.hijy[216] = 1199287965;
        kq.hijy[217] = -1492013715;
        kq.hijy[218] = 2026094675;
        kq.hijy[219] = 1158085994;
        kq.hijy[220] = 450196007;
        kq.hijy[221] = 1651780118;
        kq.hijy[222] = -1859733323;
        kq.hijy[223] = 1543663531;
        kq.hijy[224] = -1839959460;
        kq.hijy[225] = -1844147751;
        kq.hijy[226] = 200154621;
        kq.hijy[227] = 1415052607;
        kq.hijy[228] = -686017498;
        kq.hijy[229] = 1381459309;
        kq.hijy[230] = -616088766;
        kq.hijy[231] = 2064291909;
        kq.hijy[232] = 899890784;
        kq.hijy[233] = 1299380754;
        kq.hijy[234] = -878280641;
        kq.hijy[235] = 1272415582;
        kq.hijy[236] = -2140604754;
        kq.hijy[237] = 1467794640;
        kq.hijy[238] = -43299572;
        kq.hijy[239] = 1603489967;
        kq.hijy[240] = -131572779;
        kq.hijy[241] = -1006156840;
        kq.hijy[242] = -1798813693;
        kq.hijy[243] = 1850876068;
        kq.hijy[244] = 1743762133;
        kq.hijy[245] = -2069676288;
        kq.hijy[246] = 1161023881;
        kq.hijy[247] = -1799940789;
        kq.hijy[248] = -808979138;
        kq.hijy[249] = -974986623;
        kq.hijy[250] = -1238170449;
        kq.hijy[251] = -476771834;
        kq.hijy[252] = 2085633948;
        kq.hijy[253] = -318283928;
        kq.hijy[254] = 88387397;
        kq.hijy[255] = -2118675207;
        kq.hijy[256] = 568547547;
        kq.hijy[257] = 318176728;
        kq.hijy[258] = -530417045;
        kq.hijy[259] = -173376786;
        kq.hijy[260] = -1542304848;
        kq.hijy[261] = -1672193542;
        kq.hijy[262] = -1203411123;
        kq.hijy[263] = -583066608;
        kq.hijy[264] = -1964072072;
        kq.hijy[265] = 1517982356;
        kq.hijy[266] = 1042556575;
        kq.hijy[267] = -219127772;
        kq.hijy[268] = 481441936;
        kq.hijy[269] = 417974558;
        kq.hijy[270] = -1914887057;
        kq.hijy[271] = -1101587429;
        kq.hijy[272] = 1100210132;
        kq.hijy[273] = -328030115;
        kq.hijy[274] = -478341759;
        kq.hijy[275] = 749577267;
        kq.hijy[276] = 472973982;
        kq.hijy[277] = 2122856134;
        kq.hijy[278] = -1704871011;
        kq.hijy[279] = -888927604;
        kq.hijy[280] = -1201903468;
        kq.hijy[281] = 1531695365;
        kq.hijy[282] = 1760356718;
        kq.hijy[283] = 2129198348;
        kq.hijy[284] = -708213669;
        kq.hijy[285] = -1300856448;
        kq.hijy[286] = 830902432;
        kq.hijy[287] = 1694391964;
        kq.hijy[288] = 732360350;
        kq.hijy[289] = -623227888;
        kq.hijy[290] = -1063226007;
        kq.hijy[291] = -1284111961;
        kq.hijy[292] = 1499724138;
        kq.hijy[293] = -1966783543;
        kq.hijy[294] = -495952567;
        kq.hijy[295] = -1910955428;
        kq.hijy[296] = 1710315741;
        kq.hijy[297] = 528548783;
        kq.hijy[298] = -863899630;
        kq.hijy[299] = -293681844;
    }

    private static void hkcn() {
        kq.hijx[500] = -1503637020;
        kq.hijx[501] = -1213064562;
        kq.hijx[502] = 1718042226;
        kq.hijx[503] = 395905806;
        kq.hijx[504] = -791927219;
        kq.hijx[505] = -15259349;
        kq.hijx[506] = -239273970;
        kq.hijx[507] = -1424150021;
        kq.hijx[508] = -1367879601;
        kq.hijx[509] = 104237958;
        kq.hijx[510] = -1990261409;
        kq.hijx[511] = 1114064981;
        kq.hijx[512] = -627973161;
        kq.hijx[513] = 1423234619;
        kq.hijx[514] = -775894952;
        kq.hijx[515] = -1162888490;
        kq.hijx[516] = 1439131914;
        kq.hijx[517] = 1302353746;
        kq.hijx[518] = -2038951582;
        kq.hijx[519] = 464198547;
        kq.hijx[520] = -22911818;
        kq.hijx[521] = 79678981;
        kq.hijx[522] = 768934595;
        kq.hijx[523] = -927973664;
        kq.hijx[524] = 961294293;
        kq.hijx[525] = 2132008425;
        kq.hijx[526] = -628983496;
        kq.hijx[527] = -157491180;
        kq.hijx[528] = 634999322;
        kq.hijx[529] = -809951860;
        kq.hijx[530] = -980982839;
        kq.hijx[531] = -1606996154;
        kq.hijx[532] = -449958370;
        kq.hijx[533] = 1972888565;
        kq.hijx[534] = 2023002769;
        kq.hijx[535] = -459139600;
        kq.hijx[536] = 1730783174;
        kq.hijx[537] = 285231552;
        kq.hijx[538] = 529977745;
        kq.hijx[539] = -2127412178;
        kq.hijx[540] = -1452742795;
        kq.hijx[541] = 1102919403;
        kq.hijx[542] = -662404067;
        kq.hijx[543] = -1133358328;
        kq.hijx[544] = -1944720279;
        kq.hijx[545] = -122060359;
        kq.hijx[546] = 1758466656;
        kq.hijx[547] = 1443339536;
        kq.hijx[548] = 1391807826;
        kq.hijx[549] = 570181054;
        kq.hijx[550] = -1958080895;
        kq.hijx[551] = 2085121311;
        kq.hijx[552] = 749423348;
        kq.hijx[553] = 1592725764;
        kq.hijx[554] = -592401037;
        kq.hijx[555] = 1323565930;
        kq.hijx[556] = -1056204366;
        kq.hijx[557] = 440980212;
        kq.hijx[558] = -1107435027;
        kq.hijx[559] = -325075313;
        kq.hijx[560] = -1593663587;
        kq.hijx[561] = 875089444;
        kq.hijx[562] = 1201609214;
        kq.hijx[563] = -1664758591;
        kq.hijx[564] = -534276103;
        kq.hijx[565] = 1751108373;
        kq.hijx[566] = -1282251313;
        kq.hijx[567] = -65242614;
        kq.hijx[568] = -1945610773;
        kq.hijx[569] = 1604912044;
        kq.hijx[570] = 383935723;
        kq.hijx[571] = -6548670;
        kq.hijx[572] = 530823093;
        kq.hijx[573] = 1285626676;
        kq.hijx[574] = -1092730848;
        kq.hijx[575] = -1662676204;
        kq.hijx[576] = -1297107178;
        kq.hijx[577] = 646916785;
        kq.hijx[578] = -2131122950;
        kq.hijx[579] = -2104197868;
        kq.hijx[580] = -138433932;
        kq.hijx[581] = -2102296261;
        kq.hijx[582] = 562918088;
        kq.hijx[583] = -1484223426;
        kq.hijx[584] = 602639514;
        kq.hijx[585] = 612731799;
        kq.hijx[586] = -1351217178;
        kq.hijx[587] = -873851385;
        kq.hijx[588] = 1230330847;
        kq.hijx[589] = 144928121;
        kq.hijx[590] = 2094045659;
        kq.hijx[591] = 1333151966;
        kq.hijx[592] = 1825433580;
        kq.hijx[593] = -338818596;
        kq.hijx[594] = 914646220;
        kq.hijx[595] = 751741056;
        kq.hijx[596] = 1990238271;
        kq.hijx[597] = 805261143;
        kq.hijx[598] = -1089831378;
        kq.hijx[599] = 1608084637;
    }

    private static void hkcu() {
        kq.hijy[400] = 1349212814;
        kq.hijy[401] = 228956910;
        kq.hijy[402] = -48541965;
        kq.hijy[403] = -1423911973;
        kq.hijy[404] = -1723733221;
        kq.hijy[405] = 222128547;
        kq.hijy[406] = -552611970;
        kq.hijy[407] = -120447129;
        kq.hijy[408] = -328095376;
        kq.hijy[409] = 793167262;
        kq.hijy[410] = -1134950376;
        kq.hijy[411] = 985298140;
        kq.hijy[412] = -351994307;
        kq.hijy[413] = 59871904;
        kq.hijy[414] = -1764902435;
        kq.hijy[415] = -1230215464;
        kq.hijy[416] = 2096834877;
        kq.hijy[417] = -217069122;
        kq.hijy[418] = -1417779996;
        kq.hijy[419] = 66051986;
        kq.hijy[420] = 258934636;
        kq.hijy[421] = 549401374;
        kq.hijy[422] = 1794612994;
        kq.hijy[423] = 1626287613;
        kq.hijy[424] = 1948609662;
        kq.hijy[425] = -687365977;
        kq.hijy[426] = -908796126;
        kq.hijy[427] = 1609345464;
        kq.hijy[428] = 1885910671;
        kq.hijy[429] = -381562849;
        kq.hijy[430] = 781551971;
        kq.hijy[431] = 1969328575;
        kq.hijy[432] = -16888226;
        kq.hijy[433] = -552775190;
        kq.hijy[434] = -1218377289;
        kq.hijy[435] = 1523813012;
        kq.hijy[436] = -446272579;
        kq.hijy[437] = -188176550;
        kq.hijy[438] = 1837624556;
        kq.hijy[439] = 1596152816;
        kq.hijy[440] = -686385053;
        kq.hijy[441] = 1230528346;
        kq.hijy[442] = 1649956321;
        kq.hijy[443] = -859416686;
        kq.hijy[444] = 2126207461;
        kq.hijy[445] = -238416502;
        kq.hijy[446] = 914119093;
        kq.hijy[447] = -3422292;
        kq.hijy[448] = 1004931657;
        kq.hijy[449] = -312575677;
        kq.hijy[450] = -130179976;
        kq.hijy[451] = 1432379261;
        kq.hijy[452] = 1147610584;
        kq.hijy[453] = 307837145;
        kq.hijy[454] = -1743157979;
        kq.hijy[455] = 1921356350;
        kq.hijy[456] = 1251942968;
        kq.hijy[457] = 504904991;
        kq.hijy[458] = -3130160;
        kq.hijy[459] = -357764030;
        kq.hijy[460] = -870505799;
        kq.hijy[461] = -635825873;
        kq.hijy[462] = 872934683;
        kq.hijy[463] = 1732643416;
        kq.hijy[464] = 964959726;
        kq.hijy[465] = -188624278;
        kq.hijy[466] = -868158994;
        kq.hijy[467] = 156183411;
        kq.hijy[468] = -417052544;
        kq.hijy[469] = -1676401475;
        kq.hijy[470] = -1083248026;
        kq.hijy[471] = -1411360627;
        kq.hijy[472] = -566240962;
        kq.hijy[473] = 2056824614;
        kq.hijy[474] = -2141842163;
        kq.hijy[475] = -1891652490;
        kq.hijy[476] = -1693793460;
        kq.hijy[477] = 821993617;
        kq.hijy[478] = 1864701444;
        kq.hijy[479] = -1080294776;
        kq.hijy[480] = -1634770881;
        kq.hijy[481] = -1746831261;
        kq.hijy[482] = 2139589861;
        kq.hijy[483] = -571845091;
        kq.hijy[484] = 1314377875;
        kq.hijy[485] = -2142306260;
        kq.hijy[486] = -84936816;
        kq.hijy[487] = 849095839;
        kq.hijy[488] = -1471589558;
        kq.hijy[489] = -1019276137;
        kq.hijy[490] = 2142852773;
        kq.hijy[491] = 1337875664;
        kq.hijy[492] = -478856416;
        kq.hijy[493] = 1043552962;
        kq.hijy[494] = -1626331681;
        kq.hijy[495] = -573128789;
        kq.hijy[496] = -1449720069;
        kq.hijy[497] = 1541220912;
        kq.hijy[498] = -494671235;
        kq.hijy[499] = -696585366;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float height(float var0) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hizw", hijp(int ), (int)156));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 722891128: {
                    break block27;
                }
                case 760130941: {
                    v1 = kq.hijs("hizx", hijp(int ), (int)157);
                    continue block27;
                }
                case 924140383: {
                    v1 = kq.hijs("hizy", hijp(int ), (int)158);
                    continue block27;
                }
                case 1023639659: {
                    v1 = kq.hijs("hizz", hijp(int ), (int)159);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = kq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjaa", hijp(int ), (int)160)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kq.hijs("hjab", hijw(int ), (int)259)) break;
            v2 /* !! */  = (long)kq.hijs("hjac", hijw(int ), (int)260);
        }
        var2_2 /* !! */  = kq.b;
        v3 /* !! */  = kq.ok;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(kq.hijs("hjae", hijp(int ), (int)162) - kq.hijs("hjad", hijp(int ), (int)161));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 722891128: {
                    break block29;
                }
                case 1308576832: {
                    continue block29;
                }
            }
            break;
        }
        var1_3 = kq.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)kq.hijs("hjaf", hixv(int ), (int)261);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = kq.ok;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - kq.hijs("hjag", hijp(int ), (int)163));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 473955314: {
                            v5 = kq.hijs("hjah", hijp(int ), (int)164);
                            continue block31;
                        }
                        case 722891128: {
                            break block31;
                        }
                        case 1353305235: {
                            v5 = kq.hijs("hjai", hijp(int ), (int)165);
                            continue block31;
                        }
                        case 1556985514: {
                            v5 = kq.hijs("hjaj", hijp(int ), (int)166);
                            continue block31;
                        }
                    }
                    break;
                }
                v6 = kv.getDefault();
                v7 /* !! */  = kq.ok;
                if (true) ** GOTO lbl64
                block32: while (true) {
                    v7 /* !! */  = (long)(v8 - kq.hijs("hjak", hijp(int ), (int)167));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 722891128: {
                            break block32;
                        }
                        case 1737743538: {
                            v8 = kq.hijs("hjal", hijp(int ), (int)168);
                            continue block32;
                        }
                        case 2104634913: {
                            v8 = kq.hijs("hjam", hijp(int ), (int)169);
                            continue block32;
                        }
                    }
                    break;
                }
                return kq.height(v6, var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kq.hijs("hjan", hijw(int ), (int)262);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl79:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)kq.hijs("hjao", hijw(int ), (int)263);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)kq.hijs("hjap", hijw(int ), (int)264);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kq.hijs("hjaq", hijw(int ), (int)265);
        ** while (!var3_1)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float width(String var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hixl", hijp(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hixm", hijw(int ), (int)217)) break;
            v0 /* !! */  = (long)kq.hijs("hixn", hijw(int ), (int)218);
        }
        var4_2 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - kq.hijs("hixo", hijp(int ), (int)137));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -800089693: {
                    v2 = kq.hijs("hixp", hijp(int ), (int)138);
                    continue block13;
                }
                case 722891128: {
                    break block13;
                }
                case 1154731277: {
                    v2 = kq.hijs("hixq", hijp(int ), (int)139);
                    continue block13;
                }
                case 1889509204: {
                    v2 = kq.hijs("hixr", hijp(int ), (int)140);
                    continue block13;
                }
            }
            break;
        }
        var3_3 /* !! */  = kq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hixs", hijp(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kq.hijs("hixt", hijw(int ), (int)219)) break;
            v3 /* !! */  = (long)kq.hijs("hixu", hijw(int ), (int)220);
        }
        var2_4 = kq.a;
        if (!var4_2) ** GOTO lbl36
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)kq.hijs("hixw", hixv(int ), (int)221);
                }
lbl36:
                // 1 sources

                if (var2_4 || var2_4) continue block15;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hixx", hijp(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kq.hijs("hixy", hijw(int ), (int)222)) break;
                    v4 /* !! */  = (long)kq.hijs("hixz", hijw(int ), (int)223);
                }
                v5 = kv.getDefault();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hiya", hijp(int ), (int)143)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == kq.hijs("hiyb", hijw(int ), (int)224)) break;
                    v6 /* !! */  = (long)kq.hijs("hiyc", hijw(int ), (int)225);
                }
                return kq.width(v5, var0, var1_1);
                case 0: {
                    var3_3 /* !! */  = (int)kq.hijs("hiyd", hijw(int ), (int)226);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl58
                }
                case 1: {
                    var3_3 /* !! */  = (int)kq.hijs("hiye", hijw(int ), (int)227);
                    if (!var4_2) break block15;
                    throw null;
                }
lbl58:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)kq.hijs("hiyf", hijw(int ), (int)228);
                    if (!var4_2) break block15;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)kq.hijs("hiyg", hijw(int ), (int)229);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void lambda$glowText$1(ks var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6, float var7_7) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(kq.hijs("hkay", hijp(int ), (int)346) - kq.hijs("hkax", hijp(int ), (int)345));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1422996254: {
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
            }
            break;
        }
        var10_8 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(kq.hijs("hkba", hijp(int ), (int)348) - kq.hijs("hkaz", hijp(int ), (int)347));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -829425337: {
                    continue block27;
                }
                case 722891128: {
                    break block27;
                }
            }
            break;
        }
        var9_9 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hkbb", hijp(int ), (int)349)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kq.hijs("hkbc", hijw(int ), (int)773)) break;
            v2 /* !! */  = (long)kq.hijs("hkbd", hijw(int ), (int)774);
        }
        var8_10 = kq.a;
        if (var10_8) {
            throw null;
lbl30:
            // 3 sources

            return;
        }
        if (var8_10) ** GOTO lbl30
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_10) ** GOTO lbl30
                v3 /* !! */  = kq.ok;
                if (true) ** GOTO lbl41
                block30: while (true) {
                    v3 /* !! */  = (long)(v4 - kq.hijs("hkbe", hijp(int ), (int)350));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1759205145: {
                            v4 = kq.hijs("hkbf", hijp(int ), (int)351);
                            continue block30;
                        }
                        case 722891128: {
                            break block30;
                        }
                        case 857015754: {
                            v4 = kq.hijs("hkbg", hijp(int ), (int)352);
                            continue block30;
                        }
                    }
                    break;
                }
                v5 = ki.createProjection();
                v6 = kq.hijs("hkbh", hixv(int ), (int)775);
                v7 /* !! */  = kq.ok;
                if (true) ** GOTO lbl56
                block31: while (true) {
                    v7 /* !! */  = (long)(v8 - kq.hijs("hkbi", hijp(int ), (int)353));
lbl56:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -96083941: {
                            v8 = kq.hijs("hkbj", hijp(int ), (int)354);
                            continue block31;
                        }
                        case 608831375: {
                            v8 = kq.hijs("hkbk", hijp(int ), (int)355);
                            continue block31;
                        }
                        case 722891128: {
                            break block31;
                        }
                        case 788098227: {
                            v8 = kq.hijs("hkbl", hijp(int ), (int)356);
                            continue block31;
                        }
                    }
                    break;
                }
                kt.drawString(v5, var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, (float)v6);
                if (var8_10) ** continue;
                return;
            }
            case 0: {
                var9_9 /* !! */  = (int)kq.hijs("hkbm", hijw(int ), (int)776);
                if (!var10_8) break;
                throw null;
            }
            case 1: {
                var9_9 /* !! */  = (int)kq.hijs("hkbn", hijw(int ), (int)777);
                if (var10_8) {
                    throw null;
                }
            }
lbl79:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_9 /* !! */  = (int)kq.hijs("hkbo", hijw(int ), (int)778);
                    if (!var10_8) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var9_9 /* !! */  = (int)kq.hijs("hkbp", hijw(int ), (int)779);
                if (!var10_8) ** GOTO lbl79
                throw null;
            }
            case 4: 
        }
        var9_9 /* !! */  = (int)kq.hijs("hkbq", hijw(int ), (int)780);
        ** while (!var10_8)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void textColored(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, boolean var6_6, int ... var7_7) {
        block100: {
            block105: {
                block103: {
                    block104: {
                        block102: {
                            block101: {
                                v0 /* !! */  = kq.ok;
                                if (true) ** GOTO lbl5
                                block59: while (true) {
                                    v0 /* !! */  = (long)(v1 - kq.hijs("hjqf", hijp(int ), (int)296));
lbl5:
                                    // 2 sources

                                    switch ((int)v0 /* !! */ ) {
                                        case -1211178708: {
                                            v1 = kq.hijs("hjqg", hijp(int ), (int)297);
                                            continue block59;
                                        }
                                        case -117344434: {
                                            v1 = kq.hijs("hjqh", hijp(int ), (int)298);
                                            continue block59;
                                        }
                                        case 722891128: {
                                            break block59;
                                        }
                                        case 1427275040: {
                                            v1 = kq.hijs("hjqi", hijp(int ), (int)299);
                                            continue block59;
                                        }
                                    }
                                    break;
                                }
                                var11_8 = kq.c;
                                v2 /* !! */  = kq.ok;
                                if (true) ** GOTO lbl22
                                block60: while (true) {
                                    v2 /* !! */  = (long)(v3 - kq.hijs("hjqj", hijp(int ), (int)300));
lbl22:
                                    // 2 sources

                                    switch ((int)v2 /* !! */ ) {
                                        case -1370281763: {
                                            v3 = kq.hijs("hjqk", hijp(int ), (int)301);
                                            continue block60;
                                        }
                                        case -339725382: {
                                            v3 = kq.hijs("hjql", hijp(int ), (int)302);
                                            continue block60;
                                        }
                                        case 722891128: {
                                            break block60;
                                        }
                                    }
                                    break;
                                }
                                var10_9 /* !! */  = kq.b;
                                while (true) {
                                    if ((v4 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjqm", hijp(int ), (int)303)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                                    if (v4 /* !! */  == kq.hijs("hjqn", hijw(int ), (int)544)) {
                                        var9_10 = kq.a;
                                        if (var11_8) {
                                            throw null;
                                        }
                                        break;
                                    }
                                    v4 /* !! */  = (long)kq.hijs("hjqo", hijw(int ), (int)545);
                                }
                                if (var9_10 || var9_10) return;
                                if (!var6_6) break block101;
                                if (var9_10 || var9_10) return;
                                break block102;
                            }
                            if (var9_10 || var9_10) return;
                            if (var1_1 == null) break block103;
                            if (var9_10) return;
                            break block104;
                        }
                        v5 /* !! */  = kq.ok;
                        block62: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case 722891128: {
                                    break block62;
                                }
                                case 1373046910: {
                                    v5 /* !! */  = (long)(kq.hijs("hjqq", hijp(int ), (int)305) - kq.hijs("hjqp", hijp(int ), (int)304));
                                    continue block62;
                                }
                            }
                            break;
                        }
                        v6 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$textColored$4(net.minecraft.class_332 ruhack.phobia.ks java.lang.String float float float int[] ), ()V)((class_332)var0, (ks)var1_1, (String)var2_2, (float)var3_3, (float)var4_4, (float)var5_5, (int[])var7_7);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjqr", hijp(int ), (int)306)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == kq.hijs("hjqs", hijw(int ), (int)546)) {
                                ki.addOverrideTask(v6);
                                if (var9_10) return;
                                break;
                            }
                            v7 /* !! */  = (long)kq.hijs("hjqt", hijw(int ), (int)547);
                        }
                        if (var9_10) return;
                        return;
                    }
                    v8 /* !! */  = kq.ok;
                    block64: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -1407716517: {
                                v8 /* !! */  = (long)(kq.hijs("hjqv", hijp(int ), (int)308) - kq.hijs("hjqu", hijp(int ), (int)307));
                                continue block64;
                            }
                            case 722891128: {
                                break block64;
                            }
                        }
                        break;
                    }
                    if (var2_2.isEmpty()) break block103;
                    if (var9_10) return;
                    if (var7_7.length != 0) break block105;
                    if (var9_10) return;
                }
                if (var9_10 || var9_10) return;
                return;
            }
            if (var9_10 || var9_10) return;
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hjqw", hijp(int ), (int)309)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == kq.hijs("hjqx", hijw(int ), (int)548)) {
                    if (ki.isOverrideActive()) {
                        break;
                    }
                    break block100;
                }
                v9 /* !! */  = (long)kq.hijs("hjqy", hijw(int ), (int)549);
            }
            if (var9_10) return;
            v10 /* !! */  = kq.hijs("hjqz", hixv(int ), (int)550);
            if (var11_8) {
                throw null;
            }
            ** GOTO lbl110
        }
        if (var9_10) return;
        if (var10_9 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block66: do {
            switch (cfr_temp_0 == -2147483648 ? var10_9 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var9_10) return;
                    v10 /* !! */  = var8_11 = (CallSite)0.0f;
lbl110:
                    // 2 sources

                    if (var9_10 || var9_10) return;
                    v11 /* !! */  = kq.ok;
                    block67: while (true) {
                        switch ((int)v11 /* !! */ ) {
                            case -1529915607: {
                                v12 = kq.hijs("hjrb", hijp(int ), (int)311);
                                ** GOTO lbl122
                            }
                            case -632761306: {
                                v12 = kq.hijs("hjrc", hijp(int ), (int)312);
                                ** GOTO lbl122
                            }
                            case -351597134: {
                                v12 = kq.hijs("hjrd", hijp(int ), (int)313);
lbl122:
                                // 3 sources

                                v11 /* !! */  = (long)(v12 - kq.hijs("hjra", hijp(int ), (int)310));
                                continue block67;
                            }
                            case 722891128: {
                                break block67;
                            }
                        }
                        break;
                    }
                    v13 = ki.createProjection();
                    v14 /* !! */  = kq.ok;
                    block68: while (true) {
                        switch ((int)v14 /* !! */ ) {
                            case -1068701884: {
                                v15 = kq.hijs("hjrf", hijp(int ), (int)315);
                                ** GOTO lbl138
                            }
                            case -737124076: {
                                v15 = kq.hijs("hjrg", hijp(int ), (int)316);
                                ** GOTO lbl138
                            }
                            case 404096942: {
                                v15 = kq.hijs("hjrh", hijp(int ), (int)317);
lbl138:
                                // 3 sources

                                v14 /* !! */  = (long)(v15 - kq.hijs("hjre", hijp(int ), (int)314));
                                continue block68;
                            }
                            case 722891128: {
                                break block68;
                            }
                        }
                        break;
                    }
                    kr.drawStringColored(v13, var1_1, var2_2, var3_3, var4_4, var5_5, var7_7, (float)var8_11);
                    if (!var9_10 && !var9_10) return;
                    return;
                }
                case 0: {
                    var10_9 /* !! */  = (int)kq.hijs("hjri", hijw(int ), (int)551);
                    cfr_temp_0 = 20;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 4: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrm", hijw(int ), (int)555);
                    cfr_temp_0 = 12;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 5: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrn", hijw(int ), (int)556);
                    cfr_temp_0 = 8;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 7: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrp", hijw(int ), (int)558);
                    cfr_temp_0 = 16;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 9: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrr", hijw(int ), (int)560);
                    cfr_temp_0 = 14;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 13: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrv", hijw(int ), (int)564);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 10: {
                    do {
                        var10_9 /* !! */  = (int)kq.hijs("hjrs", hijw(int ), (int)561);
                    } while (!var11_8);
                    throw null;
                }
                case 15: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrx", hijw(int ), (int)566);
                    cfr_temp_0 = 14;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 16: {
                    do {
                        var10_9 /* !! */  = (int)kq.hijs("hjry", hijw(int ), (int)567);
                    } while (!var11_8);
                    throw null;
                }
                case 17: {
                    ** GOTO lbl249
                }
                case 19: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsb", hijw(int ), (int)570);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 11: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrt", hijw(int ), (int)562);
                    cfr_temp_0 = 3;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 20: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsc", hijw(int ), (int)571);
                    cfr_temp_0 = 24;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 21: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsd", hijw(int ), (int)572);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 3: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrl", hijw(int ), (int)554);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 2: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrk", hijw(int ), (int)553);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 12: {
                    do {
                        var10_9 /* !! */  = (int)kq.hijs("hjru", hijw(int ), (int)563);
                    } while (!var11_8);
                    throw null;
                }
                case 22: {
                    var10_9 /* !! */  = (int)kq.hijs("hjse", hijw(int ), (int)573);
                    cfr_temp_0 = 8;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 23: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsf", hijw(int ), (int)574);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 8: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrq", hijw(int ), (int)559);
                    cfr_temp_0 = 6;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 24: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsg", hijw(int ), (int)575);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 6: {
                    var10_9 /* !! */  = (int)kq.hijs("hjro", hijw(int ), (int)557);
                    cfr_temp_0 = 14;
                    if (!var11_8) continue block66;
                    throw null;
                }
                case 25: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsh", hijw(int ), (int)576);
                    if (var11_8) {
                        throw null;
                    }
lbl249:
                    // 3 sources

                    var10_9 /* !! */  = (int)kq.hijs("hjrz", hijw(int ), (int)568);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 18: {
                    var10_9 /* !! */  = (int)kq.hijs("hjsa", hijw(int ), (int)569);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 1: {
                    var10_9 /* !! */  = (int)kq.hijs("hjrj", hijw(int ), (int)552);
                    if (var11_8) {
                        throw null;
                    }
                }
                case 14: 
            }
            break;
        } while (true);
        do {
            var10_9 /* !! */  = (int)kq.hijs("hjrw", hijw(int ), (int)565);
        } while (!var11_8);
        throw null;
    }

    private static void hkck() {
        kq.hijx[200] = 618967115;
        kq.hijx[201] = -1282561884;
        kq.hijx[202] = -1820842459;
        kq.hijx[203] = -502853156;
        kq.hijx[204] = -19204346;
        kq.hijx[205] = -1286959578;
        kq.hijx[206] = -1597860913;
        kq.hijx[207] = 1237558004;
        kq.hijx[208] = -1667790272;
        kq.hijx[209] = -2112764721;
        kq.hijx[210] = -598832412;
        kq.hijx[211] = -1418418247;
        kq.hijx[212] = -1359715767;
        kq.hijx[213] = -1093383800;
        kq.hijx[214] = -975848246;
        kq.hijx[215] = -1788605945;
        kq.hijx[216] = 1199287961;
        kq.hijx[217] = 1492013714;
        kq.hijx[218] = -421502138;
        kq.hijx[219] = 1158085995;
        kq.hijx[220] = 1485928867;
        kq.hijx[221] = 1564056272;
        kq.hijx[222] = -1859733324;
        kq.hijx[223] = 1854066204;
        kq.hijx[224] = -1839959459;
        kq.hijx[225] = 97182342;
        kq.hijx[226] = 200154622;
        kq.hijx[227] = 1415052604;
        kq.hijx[228] = -686017497;
        kq.hijx[229] = 1381459310;
        kq.hijx[230] = -616088765;
        kq.hijx[231] = -81697985;
        kq.hijx[232] = 899890785;
        kq.hijx[233] = 1715947701;
        kq.hijx[234] = 878280640;
        kq.hijx[235] = -1036214809;
        kq.hijx[236] = -1085507008;
        kq.hijx[237] = 1467794641;
        kq.hijx[238] = -296844714;
        kq.hijx[239] = -1603489968;
        kq.hijx[240] = 189145890;
        kq.hijx[241] = -1006156839;
        kq.hijx[242] = -1798813693;
        kq.hijx[243] = 1850876068;
        kq.hijx[244] = 1743762133;
        kq.hijx[245] = -2069676287;
        kq.hijx[246] = 1648327802;
        kq.hijx[247] = -1416898651;
        kq.hijx[248] = -808979137;
        kq.hijx[249] = -1349231356;
        kq.hijx[250] = -1238170456;
        kq.hijx[251] = -476771835;
        kq.hijx[252] = 2085633947;
        kq.hijx[253] = -318283922;
        kq.hijx[254] = 88387405;
        kq.hijx[255] = -2118675208;
        kq.hijx[256] = 568547539;
        kq.hijx[257] = 318176731;
        kq.hijx[258] = -530417041;
        kq.hijx[259] = -173376785;
        kq.hijx[260] = 986454458;
        kq.hijx[261] = -1564926292;
        kq.hijx[262] = -1203411121;
        kq.hijx[263] = -583066606;
        kq.hijx[264] = -1964072071;
        kq.hijx[265] = 1517982359;
        kq.hijx[266] = 1042556574;
        kq.hijx[267] = -1122848623;
        kq.hijx[268] = 599752399;
        kq.hijx[269] = 417974559;
        kq.hijx[270] = 1119501159;
        kq.hijx[271] = -1101587431;
        kq.hijx[272] = 1100210132;
        kq.hijx[273] = -328030113;
        kq.hijx[274] = -478341758;
        kq.hijx[275] = 749577266;
        kq.hijx[276] = -82451115;
        kq.hijx[277] = 1078685104;
        kq.hijx[278] = -1704871013;
        kq.hijx[279] = -888927603;
        kq.hijx[280] = -1201903469;
        kq.hijx[281] = 1531695365;
        kq.hijx[282] = 1760356713;
        kq.hijx[283] = 2129198349;
        kq.hijx[284] = -708213677;
        kq.hijx[285] = -1300856443;
        kq.hijx[286] = 830902436;
        kq.hijx[287] = 1694391965;
        kq.hijx[288] = 417148042;
        kq.hijx[289] = -623227887;
        kq.hijx[290] = 218169794;
        kq.hijx[291] = -1284111961;
        kq.hijx[292] = 1499724139;
        kq.hijx[293] = 1943305037;
        kq.hijx[294] = -495952564;
        kq.hijx[295] = -1910955431;
        kq.hijx[296] = 1710315737;
        kq.hijx[297] = 528548780;
        kq.hijx[298] = -863899629;
        kq.hijx[299] = -293681843;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textRainbow(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, float var6_6, boolean var7_7) {
        var15_8 = kq.c;
        var14_9 /* !! */  = kq.b;
        var13_10 = kq.a;
        if (var15_8) {
            throw null;
lbl6:
            // 19 sources

            return;
        }
        if (var13_10 || var13_10) ** GOTO lbl6
        if (!var7_7) ** GOTO lbl18
        if (var13_10) ** GOTO lbl6
        if (var14_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_10) ** GOTO lbl6
                ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$textRainbow$2(net.minecraft.class_332 ruhack.phobia.ks java.lang.String float float float float ), ()V)((class_332)var0, (ks)var1_1, (String)var2_2, (float)var3_3, (float)var4_4, (float)var5_5, (float)var6_6));
                if (var13_10 || var13_10) ** GOTO lbl6
                return;
            }
lbl18:
            // 1 sources

            if (var13_10 || var13_10) ** GOTO lbl6
            if (var1_1 == null) ** GOTO lbl23
            if (var13_10) ** GOTO lbl6
            if (!var2_2.isEmpty()) ** GOTO lbl25
            if (var13_10) ** GOTO lbl6
lbl23:
            // 2 sources

            if (var13_10 || var13_10) ** GOTO lbl6
            return;
lbl25:
            // 1 sources

            if (var13_10 || var13_10) ** GOTO lbl6
            var8_11 = new int[var2_2.length()];
            if (var13_10 || var13_10) ** GOTO lbl6
            var9_12 = System.currentTimeMillis();
            if (var13_10 || var13_10) ** GOTO lbl6
            var11_13 = kq.hijs("hjlk", hijw(int ), (int)435);
            if (var13_10) ** GOTO lbl6
            do {
                if (var13_10 || var13_10) ** GOTO lbl6
                if (var11_13 >= var2_2.length()) ** GOTO lbl44
                if (var13_10 || var13_10) ** GOTO lbl6
                var12_14 = ((float)var9_12 * var6_6 / kq.hijs("hjll", hixv(int ), (int)436) + (float)var11_13 * kq.hijs("hjlm", hixv(int ), (int)437)) % 1.0f;
                if (var13_10 || var13_10) ** GOTO lbl6
                var8_11[var11_13] = kq.hsbToRgb(var12_14, 1.0f, 1.0f);
                if (var13_10 || var13_10) ** GOTO lbl6
                ++var11_13;
                if (var13_10) ** GOTO lbl6
            } while (!var15_8);
            throw null;
lbl44:
            // 1 sources

            if (var13_10 || var13_10) ** GOTO lbl6
            kr.drawStringColored(ki.createProjection(), var1_1, var2_2, var3_3, var4_4, var5_5, var8_11, (float)kq.hijs("hjln", hixv(int ), (int)438));
            if (!var13_10 && !var13_10) ** break;
            ** continue;
            return;
            case 0: {
                var14_9 /* !! */  = (int)kq.hijs("hjlo", hijw(int ), (int)439);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 1: {
                var14_9 /* !! */  = (int)kq.hijs("hjlp", hijw(int ), (int)440);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl69
            }
lbl59:
            // 3 sources

            case 2: {
                var14_9 /* !! */  = (int)kq.hijs("hjlq", hijw(int ), (int)441);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl64:
            // 3 sources

            case 3: {
                var14_9 /* !! */  = (int)kq.hijs("hjlr", hijw(int ), (int)442);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl69:
            // 2 sources

            case 4: {
                var14_9 /* !! */  = (int)kq.hijs("hjls", hijw(int ), (int)443);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl74:
            // 3 sources

            case 5: {
                var14_9 /* !! */  = (int)kq.hijs("hjlt", hijw(int ), (int)444);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl79:
            // 2 sources

            case 6: {
                var14_9 /* !! */  = (int)kq.hijs("hjlu", hijw(int ), (int)445);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl84:
            // 5 sources

            case 7: {
                var14_9 /* !! */  = (int)kq.hijs("hjlv", hijw(int ), (int)446);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl89:
            // 3 sources

            case 8: {
                var14_9 /* !! */  = (int)kq.hijs("hjlw", hijw(int ), (int)447);
                if (!var15_8) ** GOTO lbl74
                throw null;
            }
            case 9: {
                var14_9 /* !! */  = (int)kq.hijs("hjlx", hijw(int ), (int)448);
                if (!var15_8) ** GOTO lbl79
                throw null;
            }
lbl97:
            // 3 sources

            case 10: {
                var14_9 /* !! */  = (int)kq.hijs("hjly", hijw(int ), (int)449);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 11: {
                var14_9 /* !! */  = (int)kq.hijs("hjlz", hijw(int ), (int)450);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 12: {
                var14_9 /* !! */  = (int)kq.hijs("hjma", hijw(int ), (int)451);
                if (!var15_8) ** GOTO lbl97
                throw null;
            }
            case 13: {
                var14_9 /* !! */  = (int)kq.hijs("hjmb", hijw(int ), (int)452);
                if (!var15_8) ** GOTO lbl59
                throw null;
            }
lbl115:
            // 2 sources

            case 14: {
                var14_9 /* !! */  = (int)kq.hijs("hjmc", hijw(int ), (int)453);
                if (!var15_8) ** GOTO lbl74
                throw null;
            }
            case 15: {
                var14_9 /* !! */  = (int)kq.hijs("hjmd", hijw(int ), (int)454);
                if (!var15_8) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 16: {
                var14_9 /* !! */  = (int)kq.hijs("hjme", hijw(int ), (int)455);
                if (!var15_8) ** GOTO lbl89
                throw null;
            }
lbl127:
            // 2 sources

            case 17: {
                var14_9 /* !! */  = (int)kq.hijs("hjmf", hijw(int ), (int)456);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl132:
            // 2 sources

            case 18: {
                var14_9 /* !! */  = (int)kq.hijs("hjmg", hijw(int ), (int)457);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl137:
            // 2 sources

            case 19: {
                var14_9 /* !! */  = (int)kq.hijs("hjmh", hijw(int ), (int)458);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl142:
            // 2 sources

            case 20: {
                var14_9 /* !! */  = (int)kq.hijs("hjmi", hijw(int ), (int)459);
                if (!var15_8) ** GOTO lbl59
                throw null;
            }
            case 21: {
                var14_9 /* !! */  = (int)kq.hijs("hjmj", hijw(int ), (int)460);
                if (!var15_8) ** GOTO lbl132
                throw null;
            }
lbl150:
            // 2 sources

            case 22: {
                var14_9 /* !! */  = (int)kq.hijs("hjmk", hijw(int ), (int)461);
                if (!var15_8) ** GOTO lbl127
                throw null;
            }
lbl154:
            // 2 sources

            case 23: {
                var14_9 /* !! */  = (int)kq.hijs("hjml", hijw(int ), (int)462);
                if (!var15_8) break;
                throw null;
            }
lbl158:
            // 2 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_9 /* !! */  = (int)kq.hijs("hjmm", hijw(int ), (int)463);
                    if (!var15_8) ** GOTO lbl64
                    throw null;
                }
            }
lbl163:
            // 2 sources

            case 25: {
                var14_9 /* !! */  = (int)kq.hijs("hjmn", hijw(int ), (int)464);
                if (var15_8) {
                    throw null;
                }
            }
lbl167:
            // 4 sources

            case 26: {
                var14_9 /* !! */  = (int)kq.hijs("hjmo", hijw(int ), (int)465);
                if (!var15_8) ** GOTO lbl64
                throw null;
            }
            case 27: {
                var14_9 /* !! */  = (int)kq.hijs("hjmp", hijw(int ), (int)466);
                if (!var15_8) ** GOTO lbl89
                throw null;
            }
            case 28: {
                var14_9 /* !! */  = (int)kq.hijs("hjmq", hijw(int ), (int)467);
                if (var15_8) {
                    throw null;
                }
            }
lbl179:
            // 4 sources

            case 29: {
                var14_9 /* !! */  = (int)kq.hijs("hjmr", hijw(int ), (int)468);
                if (!var15_8) ** GOTO lbl97
                throw null;
            }
lbl183:
            // 2 sources

            case 30: {
                var14_9 /* !! */  = (int)kq.hijs("hjms", hijw(int ), (int)469);
                if (!var15_8) ** GOTO lbl84
                throw null;
            }
lbl187:
            // 2 sources

            case 31: {
                var14_9 /* !! */  = (int)kq.hijs("hjmt", hijw(int ), (int)470);
                if (!var15_8) ** GOTO lbl179
                throw null;
            }
            case 32: {
                var14_9 /* !! */  = (int)kq.hijs("hjmu", hijw(int ), (int)471);
                if (var15_8) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 33: {
                var14_9 /* !! */  = (int)kq.hijs("hjmv", hijw(int ), (int)472);
                if (!var15_8) ** GOTO lbl84
                throw null;
            }
lbl200:
            // 2 sources

            case 34: {
                var14_9 /* !! */  = (int)kq.hijs("hjmw", hijw(int ), (int)473);
                if (!var15_8) ** GOTO lbl158
                throw null;
            }
            case 35: 
        }
        var14_9 /* !! */  = (int)kq.hijs("hjmx", hijw(int ), (int)474);
        ** while (!var15_8)
lbl207:
        // 1 sources

        throw null;
    }

    private static int hijw(int n2) {
        return hijx[n2] ^ hijy[n2];
    }

    private static void hkcy() {
        kq.hijq[0] = -7493439447677257503L;
        kq.hijq[1] = 1627166394397150708L;
        kq.hijq[2] = 6700736386882446406L;
        kq.hijq[3] = -882991860801668164L;
        kq.hijq[4] = 1063422565297807716L;
        kq.hijq[5] = -8464682315182189944L;
        kq.hijq[6] = -618265093725075909L;
        kq.hijq[7] = -8101605930488061558L;
        kq.hijq[8] = -7649742096067475098L;
        kq.hijq[9] = -3886002068420901333L;
        kq.hijq[10] = -908720368786741920L;
        kq.hijq[11] = -5042962791689160843L;
        kq.hijq[12] = 3655294228596949204L;
        kq.hijq[13] = 2116365937618706246L;
        kq.hijq[14] = 2731924158409753985L;
        kq.hijq[15] = -1277601325137691938L;
        kq.hijq[16] = 1516632444083244735L;
        kq.hijq[17] = -8577793822371552032L;
        kq.hijq[18] = 2722560368093480016L;
        kq.hijq[19] = 3842212577418411663L;
        kq.hijq[20] = 8740104599288152103L;
        kq.hijq[21] = 7454773158956156229L;
        kq.hijq[22] = 6412201797816457375L;
        kq.hijq[23] = -6767554392091339627L;
        kq.hijq[24] = 5431545255376667030L;
        kq.hijq[25] = -7057999764653750682L;
        kq.hijq[26] = 8242535629920377559L;
        kq.hijq[27] = -4381719673586622972L;
        kq.hijq[28] = 227085059997184155L;
        kq.hijq[29] = 6631246610892803080L;
        kq.hijq[30] = 686169803192290213L;
        kq.hijq[31] = -7868413365876624637L;
        kq.hijq[32] = 6944811791863031970L;
        kq.hijq[33] = -597826498487275999L;
        kq.hijq[34] = -7078375207004490066L;
        kq.hijq[35] = 387002216616962662L;
        kq.hijq[36] = -7404597185014974391L;
        kq.hijq[37] = 3359958949711462624L;
        kq.hijq[38] = 4182527266592327848L;
        kq.hijq[39] = 3270971919828091510L;
        kq.hijq[40] = -4238121745305949837L;
        kq.hijq[41] = 4274538985871802893L;
        kq.hijq[42] = 2222189886900089669L;
        kq.hijq[43] = -7409425056827503191L;
        kq.hijq[44] = 5100771754275000255L;
        kq.hijq[45] = -9103080742271474979L;
        kq.hijq[46] = -1970662152717249996L;
        kq.hijq[47] = -7530083700221511633L;
        kq.hijq[48] = -2099550295597667084L;
        kq.hijq[49] = 1692380983519365343L;
        kq.hijq[50] = -6585853376686536472L;
        kq.hijq[51] = 1688046758528496747L;
        kq.hijq[52] = -6814562693736267524L;
        kq.hijq[53] = -8343106845008028796L;
        kq.hijq[54] = 1039386097347481950L;
        kq.hijq[55] = 2967210357084662973L;
        kq.hijq[56] = -1370784168168425961L;
        kq.hijq[57] = 5252185002453232517L;
        kq.hijq[58] = -6857178355338555276L;
        kq.hijq[59] = 974961229060839162L;
        kq.hijq[60] = 6378032851863331755L;
        kq.hijq[61] = -5327263338825571055L;
        kq.hijq[62] = -2615867037239604382L;
        kq.hijq[63] = -2279860524701403853L;
        kq.hijq[64] = 8108913210704810550L;
        kq.hijq[65] = 7571419283110953992L;
        kq.hijq[66] = -2210443956399109076L;
        kq.hijq[67] = 2871471824925540607L;
        kq.hijq[68] = -704518219302271889L;
        kq.hijq[69] = -5204389549610510949L;
        kq.hijq[70] = -2461064801402730239L;
        kq.hijq[71] = 9089050433408745189L;
        kq.hijq[72] = 5615873467714794791L;
        kq.hijq[73] = -3307136313826751909L;
        kq.hijq[74] = -3737847296540824866L;
        kq.hijq[75] = -3651867557259805616L;
        kq.hijq[76] = -277251085935485709L;
        kq.hijq[77] = -4859751813202354149L;
        kq.hijq[78] = 8216451143607056044L;
        kq.hijq[79] = 1834499764195022235L;
        kq.hijq[80] = 4302125939641723035L;
        kq.hijq[81] = -6874276103585293777L;
        kq.hijq[82] = -1038030469352164274L;
        kq.hijq[83] = 5657832487635310799L;
        kq.hijq[84] = -3351100721265913143L;
        kq.hijq[85] = -1295316796359472500L;
        kq.hijq[86] = 5129483434604175106L;
        kq.hijq[87] = 8077355531611166414L;
        kq.hijq[88] = -5087697430941718875L;
        kq.hijq[89] = -6198204932731433116L;
        kq.hijq[90] = -3861259020187614312L;
        kq.hijq[91] = -1302072973375974042L;
        kq.hijq[92] = 4860783680147394438L;
        kq.hijq[93] = -6437724303695801742L;
        kq.hijq[94] = 449542351891652301L;
        kq.hijq[95] = 6495545390242930467L;
        kq.hijq[96] = -6327891346236001643L;
        kq.hijq[97] = 5596795331487541662L;
        kq.hijq[98] = 2932237258321138740L;
        kq.hijq[99] = 3146834542579910137L;
    }

    private static void hkcq() {
        kq.hijy[0] = 247132436;
        kq.hijy[1] = -40687764;
        kq.hijy[2] = 2129062310;
        kq.hijy[3] = 1036843802;
        kq.hijy[4] = -332863045;
        kq.hijy[5] = -1487868649;
        kq.hijy[6] = 879924546;
        kq.hijy[7] = -1791783563;
        kq.hijy[8] = 2045638415;
        kq.hijy[9] = -707591674;
        kq.hijy[10] = -1543297129;
        kq.hijy[11] = 680954144;
        kq.hijy[12] = 729355112;
        kq.hijy[13] = -2025716779;
        kq.hijy[14] = -1047543947;
        kq.hijy[15] = 1195957731;
        kq.hijy[16] = -532953424;
        kq.hijy[17] = 1723746749;
        kq.hijy[18] = 899160659;
        kq.hijy[19] = -1683401607;
        kq.hijy[20] = -281607211;
        kq.hijy[21] = 1211984237;
        kq.hijy[22] = -471306641;
        kq.hijy[23] = -1330886868;
        kq.hijy[24] = -923553516;
        kq.hijy[25] = 862732597;
        kq.hijy[26] = 952040874;
        kq.hijy[27] = 613723226;
        kq.hijy[28] = 636309189;
        kq.hijy[29] = 1366595579;
        kq.hijy[30] = 47162453;
        kq.hijy[31] = 1783570848;
        kq.hijy[32] = -1887659589;
        kq.hijy[33] = -1931021913;
        kq.hijy[34] = -1086708102;
        kq.hijy[35] = 1620426351;
        kq.hijy[36] = -238942913;
        kq.hijy[37] = -257461738;
        kq.hijy[38] = -1489224428;
        kq.hijy[39] = 408041255;
        kq.hijy[40] = 407458249;
        kq.hijy[41] = 879645906;
        kq.hijy[42] = -320857324;
        kq.hijy[43] = -1185556572;
        kq.hijy[44] = 1197367611;
        kq.hijy[45] = -1401695782;
        kq.hijy[46] = -368857273;
        kq.hijy[47] = 1831147202;
        kq.hijy[48] = -1863082479;
        kq.hijy[49] = -1405958455;
        kq.hijy[50] = 912326822;
        kq.hijy[51] = 954883619;
        kq.hijy[52] = -517266986;
        kq.hijy[53] = 541740598;
        kq.hijy[54] = 584023019;
        kq.hijy[55] = 6752815;
        kq.hijy[56] = 1171523175;
        kq.hijy[57] = 61204059;
        kq.hijy[58] = 278850066;
        kq.hijy[59] = 1805822382;
        kq.hijy[60] = -839651613;
        kq.hijy[61] = -1957808255;
        kq.hijy[62] = 310947487;
        kq.hijy[63] = 1621652705;
        kq.hijy[64] = -1372150149;
        kq.hijy[65] = -597794806;
        kq.hijy[66] = -2011272757;
        kq.hijy[67] = -1945930849;
        kq.hijy[68] = -997389164;
        kq.hijy[69] = -913047514;
        kq.hijy[70] = -2133775904;
        kq.hijy[71] = -107545327;
        kq.hijy[72] = -846045195;
        kq.hijy[73] = -1036780150;
        kq.hijy[74] = -1752651226;
        kq.hijy[75] = -1175341939;
        kq.hijy[76] = -846858409;
        kq.hijy[77] = -1238562895;
        kq.hijy[78] = 1211895553;
        kq.hijy[79] = -481007797;
        kq.hijy[80] = -782080450;
        kq.hijy[81] = 146864452;
        kq.hijy[82] = 1772819450;
        kq.hijy[83] = -563069421;
        kq.hijy[84] = 2104127096;
        kq.hijy[85] = -1139961606;
        kq.hijy[86] = 747162253;
        kq.hijy[87] = 588286001;
        kq.hijy[88] = 1566904510;
        kq.hijy[89] = 1102553287;
        kq.hijy[90] = -960185632;
        kq.hijy[91] = 39759200;
        kq.hijy[92] = -545914200;
        kq.hijy[93] = -704739103;
        kq.hijy[94] = -1130476692;
        kq.hijy[95] = 987158057;
        kq.hijy[96] = -543498044;
        kq.hijy[97] = -2017425665;
        kq.hijy[98] = -2127730824;
        kq.hijy[99] = 937982919;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textRainbow(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjkq", hijp(int ), (int)269));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1861016688: {
                    v1 = kq.hijs("hjkr", hijp(int ), (int)270);
                    continue block26;
                }
                case 14899086: {
                    v1 = kq.hijs("hjks", hijp(int ), (int)271);
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
            }
            break;
        }
        var8_6 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjkt", hijp(int ), (int)272));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1979048109: {
                    v3 = kq.hijs("hjku", hijp(int ), (int)273);
                    continue block27;
                }
                case 722891128: {
                    break block27;
                }
                case 1429951225: {
                    v3 = kq.hijs("hjkv", hijp(int ), (int)274);
                    continue block27;
                }
            }
            break;
        }
        var7_7 /* !! */  = kq.b;
        v4 /* !! */  = kq.ok;
        if (true) ** GOTO lbl33
        block28: while (true) {
            v4 /* !! */  = (long)(kq.hijs("hjkx", hijp(int ), (int)276) - kq.hijs("hjkw", hijp(int ), (int)275));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 722891128: {
                    break block28;
                }
                case 782061316: {
                    continue block28;
                }
            }
            break;
        }
        var6_8 = kq.a;
        if (var8_6) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var6_8) ** GOTO lbl41
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_8) ** GOTO lbl41
                v5 /* !! */  = kq.ok;
                if (true) ** GOTO lbl52
                block30: while (true) {
                    v5 /* !! */  = (long)(kq.hijs("hjkz", hijp(int ), (int)278) - kq.hijs("hjky", hijp(int ), (int)277));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1670856674: {
                            continue block30;
                        }
                        case 722891128: {
                            break block30;
                        }
                    }
                    break;
                }
                v6 = kv.getDefault();
                v7 = kq.hijs("hjla", hijw(int ), (int)426);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjlb", hijp(int ), (int)279)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kq.hijs("hjlc", hijw(int ), (int)427)) break;
                    v8 /* !! */  = (long)kq.hijs("hjld", hijw(int ), (int)428);
                }
                kq.textRainbow(var0, v6, var1_1, var2_2, var3_3, var4_4, var5_5, (boolean)v7);
                if (!var6_8 && !var6_8) ** break;
                ** continue;
                return;
            }
lbl68:
            // 3 sources

            case 0: {
                var7_7 /* !! */  = (int)kq.hijs("hjle", hijw(int ), (int)429);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl73:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)kq.hijs("hjlf", hijw(int ), (int)430);
                    if (var8_6) {
                        throw null;
                    }
                    ** GOTO lbl87
                    break;
                }
            }
lbl79:
            // 2 sources

            case 2: {
                var7_7 /* !! */  = (int)kq.hijs("hjlg", hijw(int ), (int)431);
                if (!var8_6) ** GOTO lbl68
                throw null;
            }
            case 3: {
                var7_7 /* !! */  = (int)kq.hijs("hjlh", hijw(int ), (int)432);
                if (!var8_6) ** GOTO lbl73
                throw null;
            }
lbl87:
            // 2 sources

            case 4: {
                var7_7 /* !! */  = (int)kq.hijs("hjli", hijw(int ), (int)433);
                if (!var8_6) ** GOTO lbl68
                throw null;
            }
            case 5: 
        }
        var7_7 /* !! */  = (int)kq.hijs("hjlj", hijw(int ), (int)434);
        ** while (!var8_6)
lbl94:
        // 1 sources

        throw null;
    }

    private static void hkdc() {
        kq.hijr[0] = -8722236513533617064L;
        kq.hijr[1] = -8221338862497281894L;
        kq.hijr[2] = 7277326734324605485L;
        kq.hijr[3] = 5572804964470929011L;
        kq.hijr[4] = -8032980716979997251L;
        kq.hijr[5] = 8107335730031522465L;
        kq.hijr[6] = -7696317966790021147L;
        kq.hijr[7] = 2338066647669419741L;
        kq.hijr[8] = -866555311958657457L;
        kq.hijr[9] = -1823320969537261749L;
        kq.hijr[10] = 2570155293347792977L;
        kq.hijr[11] = 38807257782188225L;
        kq.hijr[12] = -3007230586224103542L;
        kq.hijr[13] = 6434991200035010105L;
        kq.hijr[14] = 7758212865454381515L;
        kq.hijr[15] = -6401993348804980547L;
        kq.hijr[16] = -2210265823838978580L;
        kq.hijr[17] = 3563627575353926707L;
        kq.hijr[18] = 8815778044440302346L;
        kq.hijr[19] = -914033404988212368L;
        kq.hijr[20] = -548406523801593758L;
        kq.hijr[21] = 9098499248914541096L;
        kq.hijr[22] = 8455106878628224861L;
        kq.hijr[23] = -2180688274846526266L;
        kq.hijr[24] = -8822783020456260766L;
        kq.hijr[25] = 3761087854075086310L;
        kq.hijr[26] = 6550127918437498131L;
        kq.hijr[27] = -5684457409816005745L;
        kq.hijr[28] = -8091473884819398471L;
        kq.hijr[29] = 2905536818056863676L;
        kq.hijr[30] = -7183488302134201698L;
        kq.hijr[31] = -2655897346105670344L;
        kq.hijr[32] = 5544012657434877172L;
        kq.hijr[33] = 6998159501441576741L;
        kq.hijr[34] = 4795495762726505375L;
        kq.hijr[35] = 3283439086911842645L;
        kq.hijr[36] = 4944397252435525749L;
        kq.hijr[37] = 4658779033433467230L;
        kq.hijr[38] = 4314115433671303168L;
        kq.hijr[39] = -9080599775747655032L;
        kq.hijr[40] = -203231053120653982L;
        kq.hijr[41] = 184551402598584459L;
        kq.hijr[42] = -9218391807991186683L;
        kq.hijr[43] = 1497123838693387408L;
        kq.hijr[44] = -250421039440899549L;
        kq.hijr[45] = 1960176048933026972L;
        kq.hijr[46] = -3468404511027333681L;
        kq.hijr[47] = -6093814327431954457L;
        kq.hijr[48] = 5318362131814489380L;
        kq.hijr[49] = 5492825331199971873L;
        kq.hijr[50] = -1002257780453928276L;
        kq.hijr[51] = 5466397294786776131L;
        kq.hijr[52] = -8257298879382166165L;
        kq.hijr[53] = -1098646263340435595L;
        kq.hijr[54] = 7549353091778815196L;
        kq.hijr[55] = 1817020318603836473L;
        kq.hijr[56] = 5422547780053322235L;
        kq.hijr[57] = -5817432752872695558L;
        kq.hijr[58] = 536324833707355780L;
        kq.hijr[59] = 415611897366380183L;
        kq.hijr[60] = 746897829324183638L;
        kq.hijr[61] = 4925532791358213928L;
        kq.hijr[62] = 4350019585216381407L;
        kq.hijr[63] = -4591957403994341408L;
        kq.hijr[64] = 959614745278215013L;
        kq.hijr[65] = -7860104381447409583L;
        kq.hijr[66] = -1245986495470446296L;
        kq.hijr[67] = 2778282447913590925L;
        kq.hijr[68] = 7084387566502342675L;
        kq.hijr[69] = -5113448166693460341L;
        kq.hijr[70] = -6988761030751427820L;
        kq.hijr[71] = 870529393110209027L;
        kq.hijr[72] = 4634558565521994589L;
        kq.hijr[73] = -8185129629859212262L;
        kq.hijr[74] = -4984663602145185071L;
        kq.hijr[75] = -6377340411998711934L;
        kq.hijr[76] = -2939416026692886639L;
        kq.hijr[77] = -1387918245147272653L;
        kq.hijr[78] = -2844027241900022182L;
        kq.hijr[79] = 1600795187269456131L;
        kq.hijr[80] = -8230986127878928750L;
        kq.hijr[81] = 6914611087620456785L;
        kq.hijr[82] = -4266252970645362780L;
        kq.hijr[83] = 2603275835328629955L;
        kq.hijr[84] = 7795021728720528158L;
        kq.hijr[85] = 8983945711144321606L;
        kq.hijr[86] = -8642291644469843815L;
        kq.hijr[87] = 4396795053936378001L;
        kq.hijr[88] = -4117630158345702805L;
        kq.hijr[89] = 5997989892238088585L;
        kq.hijr[90] = -6273597374063085696L;
        kq.hijr[91] = 625797609209851228L;
        kq.hijr[92] = -7785245287673919259L;
        kq.hijr[93] = -1752036783821126856L;
        kq.hijr[94] = 4843095909264099757L;
        kq.hijr[95] = 4834346754857532146L;
        kq.hijr[96] = 8296051742878358089L;
        kq.hijr[97] = -3215982275579134051L;
        kq.hijr[98] = -4340527037118863293L;
        kq.hijr[99] = 6224731603318715462L;
    }

    private static void hkcl() {
        kq.hijx[300] = -1812948056;
        kq.hijx[301] = -2009763444;
        kq.hijx[302] = 998190534;
        kq.hijx[303] = 231652350;
        kq.hijx[304] = 1018193390;
        kq.hijx[305] = 1635750959;
        kq.hijx[306] = -470432676;
        kq.hijx[307] = -459488691;
        kq.hijx[308] = 1795234721;
        kq.hijx[309] = 449004365;
        kq.hijx[310] = -719461066;
        kq.hijx[311] = -1889656584;
        kq.hijx[312] = 870412945;
        kq.hijx[313] = 1871375426;
        kq.hijx[314] = -982337212;
        kq.hijx[315] = -2122402329;
        kq.hijx[316] = -1417907275;
        kq.hijx[317] = -1755882270;
        kq.hijx[318] = 795569278;
        kq.hijx[319] = -595924284;
        kq.hijx[320] = -1595356360;
        kq.hijx[321] = 1726356775;
        kq.hijx[322] = 668307978;
        kq.hijx[323] = -714609262;
        kq.hijx[324] = 2015798103;
        kq.hijx[325] = -938537015;
        kq.hijx[326] = 1608855779;
        kq.hijx[327] = -1176398247;
        kq.hijx[328] = 961122704;
        kq.hijx[329] = -1352563563;
        kq.hijx[330] = 1305517398;
        kq.hijx[331] = 1359093750;
        kq.hijx[332] = -385551970;
        kq.hijx[333] = -2039651929;
        kq.hijx[334] = -347871031;
        kq.hijx[335] = 10593811;
        kq.hijx[336] = 1311750335;
        kq.hijx[337] = 1400877496;
        kq.hijx[338] = 341498457;
        kq.hijx[339] = 1744716903;
        kq.hijx[340] = -1774243139;
        kq.hijx[341] = 1245131472;
        kq.hijx[342] = -1951358984;
        kq.hijx[343] = -445824460;
        kq.hijx[344] = 516013453;
        kq.hijx[345] = -1505755025;
        kq.hijx[346] = -954678683;
        kq.hijx[347] = 1363306948;
        kq.hijx[348] = 473860923;
        kq.hijx[349] = -1627459243;
        kq.hijx[350] = -1423810035;
        kq.hijx[351] = 344075113;
        kq.hijx[352] = -486397396;
        kq.hijx[353] = -1154623030;
        kq.hijx[354] = -343923142;
        kq.hijx[355] = -1778629374;
        kq.hijx[356] = -650453812;
        kq.hijx[357] = 1872668087;
        kq.hijx[358] = 296063357;
        kq.hijx[359] = -653936090;
        kq.hijx[360] = 727320022;
        kq.hijx[361] = 885995577;
        kq.hijx[362] = 389008616;
        kq.hijx[363] = -789572603;
        kq.hijx[364] = 1283000551;
        kq.hijx[365] = -339285774;
        kq.hijx[366] = -2024169085;
        kq.hijx[367] = 1452362059;
        kq.hijx[368] = 603445421;
        kq.hijx[369] = -863486334;
        kq.hijx[370] = -1642425755;
        kq.hijx[371] = -719575774;
        kq.hijx[372] = 13657382;
        kq.hijx[373] = -94403200;
        kq.hijx[374] = -442559181;
        kq.hijx[375] = -1055233460;
        kq.hijx[376] = -1830786020;
        kq.hijx[377] = 2001442523;
        kq.hijx[378] = 1536886671;
        kq.hijx[379] = -1714552795;
        kq.hijx[380] = -195504861;
        kq.hijx[381] = 452170576;
        kq.hijx[382] = -194937378;
        kq.hijx[383] = 1090441861;
        kq.hijx[384] = -1624904750;
        kq.hijx[385] = 1827150959;
        kq.hijx[386] = 983936222;
        kq.hijx[387] = 824528319;
        kq.hijx[388] = -406743729;
        kq.hijx[389] = 1817901788;
        kq.hijx[390] = -246453998;
        kq.hijx[391] = 422425489;
        kq.hijx[392] = 896338981;
        kq.hijx[393] = 435203630;
        kq.hijx[394] = 1410510700;
        kq.hijx[395] = 949317993;
        kq.hijx[396] = -483204910;
        kq.hijx[397] = 1184868679;
        kq.hijx[398] = 2026777424;
        kq.hijx[399] = 1858718012;
    }

    private static void hkde() {
        kq.hijr[200] = 3031349758644451196L;
        kq.hijr[201] = -6215721156476844539L;
        kq.hijr[202] = 543148729100111236L;
        kq.hijr[203] = -1526335023513774911L;
        kq.hijr[204] = 3675962199520294065L;
        kq.hijr[205] = 348819317539534313L;
        kq.hijr[206] = 3261015386357282098L;
        kq.hijr[207] = 2542314755609953827L;
        kq.hijr[208] = 8148648296157534136L;
        kq.hijr[209] = 5145415999264257597L;
        kq.hijr[210] = -8420727141261618646L;
        kq.hijr[211] = -8109768516938178326L;
        kq.hijr[212] = -4802267695983649499L;
        kq.hijr[213] = 3096122444054144952L;
        kq.hijr[214] = 8661558910539070336L;
        kq.hijr[215] = 1214647700933933462L;
        kq.hijr[216] = 5028954598959599608L;
        kq.hijr[217] = -7237926654341845358L;
        kq.hijr[218] = 3932504383057868489L;
        kq.hijr[219] = -5414458926351965725L;
        kq.hijr[220] = 9079006776162235395L;
        kq.hijr[221] = 7505558667226160230L;
        kq.hijr[222] = -5310474029082848826L;
        kq.hijr[223] = -7911643152783546977L;
        kq.hijr[224] = -5929806201484701909L;
        kq.hijr[225] = -7706055868752022706L;
        kq.hijr[226] = -1774686239516856442L;
        kq.hijr[227] = 7647074889960848239L;
        kq.hijr[228] = -5664925544745139975L;
        kq.hijr[229] = -7816010162406314275L;
        kq.hijr[230] = 2964133637406258863L;
        kq.hijr[231] = 8891329070493407419L;
        kq.hijr[232] = -5525467987152965766L;
        kq.hijr[233] = 4538557689025298909L;
        kq.hijr[234] = -5971743477629628934L;
        kq.hijr[235] = 9063533849156154979L;
        kq.hijr[236] = -2527050072485274739L;
        kq.hijr[237] = 6971055773404360295L;
        kq.hijr[238] = -3365293829103380891L;
        kq.hijr[239] = -5168628017924963941L;
        kq.hijr[240] = 8727889665449825602L;
        kq.hijr[241] = -2156426002007336658L;
        kq.hijr[242] = 6774277281510801124L;
        kq.hijr[243] = 7337457936444653776L;
        kq.hijr[244] = -3413817147147177686L;
        kq.hijr[245] = 8694975856906200721L;
        kq.hijr[246] = -7436319309501356405L;
        kq.hijr[247] = -7645504298433892659L;
        kq.hijr[248] = 2917711640704702006L;
        kq.hijr[249] = 4801371203720954951L;
        kq.hijr[250] = -2769577686331183396L;
        kq.hijr[251] = -874091027775936987L;
        kq.hijr[252] = 1771431699248819487L;
        kq.hijr[253] = -8016385121606430823L;
        kq.hijr[254] = -8825499975097091944L;
        kq.hijr[255] = -8035090138311513653L;
        kq.hijr[256] = 1715937188783174408L;
        kq.hijr[257] = 2421427356682688123L;
        kq.hijr[258] = 1071429647749030607L;
        kq.hijr[259] = 3528205458060377828L;
        kq.hijr[260] = -3360317164052063375L;
        kq.hijr[261] = -184126803202985654L;
        kq.hijr[262] = 4355742510691060326L;
        kq.hijr[263] = -5775414123048964695L;
        kq.hijr[264] = 7483748889575184093L;
        kq.hijr[265] = 3309084274188402056L;
        kq.hijr[266] = -4070441143991544649L;
        kq.hijr[267] = -904956425198437976L;
        kq.hijr[268] = -8714058289802749857L;
        kq.hijr[269] = -2276785991542201686L;
        kq.hijr[270] = -3553953096471549490L;
        kq.hijr[271] = 9202590271700381043L;
        kq.hijr[272] = 5763188729065500145L;
        kq.hijr[273] = 6075695129660695493L;
        kq.hijr[274] = 2041260593073881280L;
        kq.hijr[275] = 1760890068750474662L;
        kq.hijr[276] = 2658477167991863512L;
        kq.hijr[277] = -6434344932019265800L;
        kq.hijr[278] = -9218314668424985424L;
        kq.hijr[279] = 4486589075000738268L;
        kq.hijr[280] = -1391279376459400585L;
        kq.hijr[281] = -3744365047773922165L;
        kq.hijr[282] = -6853286383895334883L;
        kq.hijr[283] = 5952945721954540991L;
        kq.hijr[284] = -2319918908854863023L;
        kq.hijr[285] = -7663719415833961207L;
        kq.hijr[286] = 3961675893817889906L;
        kq.hijr[287] = 799497361569891909L;
        kq.hijr[288] = -1306034776710108340L;
        kq.hijr[289] = -5985030682182826631L;
        kq.hijr[290] = -7930536949005429634L;
        kq.hijr[291] = 2831953278689727278L;
        kq.hijr[292] = -3937830153113813711L;
        kq.hijr[293] = 6730860795781492055L;
        kq.hijr[294] = -7009158837000417259L;
        kq.hijr[295] = -5918695666178439534L;
        kq.hijr[296] = -3193477257314992592L;
        kq.hijr[297] = 8425099129018405625L;
        kq.hijr[298] = 2862525860663403419L;
        kq.hijr[299] = 6262023735163757626L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, boolean var7_7) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(kq.hijs("hisc", hijp(int ), (int)87) - kq.hijs("hisb", hijp(int ), (int)86));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 179939339: {
                    continue block22;
                }
                case 722891128: {
                    break block22;
                }
            }
            break;
        }
        var10_8 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hisd", hijp(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kq.hijs("hise", hijw(int ), (int)127)) break;
            v1 /* !! */  = (long)kq.hijs("hisf", hijw(int ), (int)128);
        }
        var9_9 /* !! */  = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(kq.hijs("hish", hijp(int ), (int)90) - kq.hijs("hisg", hijp(int ), (int)89));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -453691058: {
                    continue block24;
                }
                case 722891128: {
                    break block24;
                }
            }
            break;
        }
        var8_10 = kq.a;
        if (var10_8) {
            throw null;
lbl30:
            // 3 sources

            return;
        }
        if (var8_10 || var8_10) ** GOTO lbl30
        v3 /* !! */  = kq.ok;
        if (true) ** GOTO lbl37
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - kq.hijs("hisi", hijp(int ), (int)91));
lbl37:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -4598864: {
                    v4 = kq.hijs("hisj", hijp(int ), (int)92);
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
                case 1880909744: {
                    v4 = kq.hijs("hisk", hijp(int ), (int)93);
                    continue block26;
                }
                case 2058654635: {
                    v4 = kq.hijs("hisl", hijp(int ), (int)94);
                    continue block26;
                }
            }
            break;
        }
        kq.text(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, 0.0f, var7_7);
        if (var8_10) ** GOTO lbl30
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_10) ** break;
                ** continue;
                return;
            }
lbl57:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_9 /* !! */  = (int)kq.hijs("hism", hijw(int ), (int)129);
                    if (!var10_8) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl62:
            // 3 sources

            case 1: {
                var9_9 /* !! */  = (int)kq.hijs("hisn", hijw(int ), (int)130);
                if (var10_8) {
                    throw null;
                }
                ** GOTO lbl71
            }
            case 2: {
                var9_9 /* !! */  = (int)kq.hijs("hiso", hijw(int ), (int)131);
                if (!var10_8) ** GOTO lbl62
                throw null;
            }
lbl71:
            // 2 sources

            case 3: {
                var9_9 /* !! */  = (int)kq.hijs("hisp", hijw(int ), (int)132);
                if (!var10_8) ** GOTO lbl57
                throw null;
            }
            case 4: {
                var9_9 /* !! */  = (int)kq.hijs("hisq", hijw(int ), (int)133);
                if (!var10_8) ** GOTO lbl62
                throw null;
            }
            case 5: 
        }
        var9_9 /* !! */  = (int)kq.hijs("hisr", hijw(int ), (int)134);
        ** while (!var10_8)
lbl82:
        // 1 sources

        throw null;
    }

    private static void hkcx() {
        kq.hijy[700] = -661825455;
        kq.hijy[701] = 175667967;
        kq.hijy[702] = 1180532916;
        kq.hijy[703] = 993479004;
        kq.hijy[704] = 264944469;
        kq.hijy[705] = 914815390;
        kq.hijy[706] = -2003357931;
        kq.hijy[707] = 618097052;
        kq.hijy[708] = 2088061036;
        kq.hijy[709] = 894372579;
        kq.hijy[710] = -251960584;
        kq.hijy[711] = 1269122287;
        kq.hijy[712] = -1157635580;
        kq.hijy[713] = 1013409584;
        kq.hijy[714] = 1627435231;
        kq.hijy[715] = -1779447839;
        kq.hijy[716] = 1998980337;
        kq.hijy[717] = 479335733;
        kq.hijy[718] = -1117446410;
        kq.hijy[719] = 183509097;
        kq.hijy[720] = -2003206714;
        kq.hijy[721] = -1978919239;
        kq.hijy[722] = -1979528052;
        kq.hijy[723] = 834093646;
        kq.hijy[724] = -2025480346;
        kq.hijy[725] = 1218747802;
        kq.hijy[726] = -519889730;
        kq.hijy[727] = -1069232699;
        kq.hijy[728] = -1032401190;
        kq.hijy[729] = -1364980462;
        kq.hijy[730] = -586327948;
        kq.hijy[731] = -1680655265;
        kq.hijy[732] = -338790300;
        kq.hijy[733] = -481604805;
        kq.hijy[734] = 912849809;
        kq.hijy[735] = -708872159;
        kq.hijy[736] = 1691926995;
        kq.hijy[737] = -1556601132;
        kq.hijy[738] = -572841626;
        kq.hijy[739] = 506478836;
        kq.hijy[740] = -1516597736;
        kq.hijy[741] = 646174021;
        kq.hijy[742] = 9028711;
        kq.hijy[743] = 1761870911;
        kq.hijy[744] = 683910681;
        kq.hijy[745] = 1044172000;
        kq.hijy[746] = 1034339616;
        kq.hijy[747] = -1590853783;
        kq.hijy[748] = 1280306281;
        kq.hijy[749] = 787855576;
        kq.hijy[750] = -1389339432;
        kq.hijy[751] = 1219684349;
        kq.hijy[752] = -1730283594;
        kq.hijy[753] = 994372588;
        kq.hijy[754] = 1483380081;
        kq.hijy[755] = 1043553368;
        kq.hijy[756] = -316274014;
        kq.hijy[757] = 858656214;
        kq.hijy[758] = 708089777;
        kq.hijy[759] = -1392600821;
        kq.hijy[760] = 2138922550;
        kq.hijy[761] = 302751768;
        kq.hijy[762] = 1231871842;
        kq.hijy[763] = -706837474;
        kq.hijy[764] = -1727372273;
        kq.hijy[765] = 2049542530;
        kq.hijy[766] = 1984136024;
        kq.hijy[767] = 1457470191;
        kq.hijy[768] = 703352293;
        kq.hijy[769] = -1290646794;
        kq.hijy[770] = 637857930;
        kq.hijy[771] = -789401675;
        kq.hijy[772] = 86418333;
        kq.hijy[773] = 437720892;
        kq.hijy[774] = 930283141;
        kq.hijy[775] = -663124798;
        kq.hijy[776] = -713033749;
        kq.hijy[777] = -541193273;
        kq.hijy[778] = 1768580130;
        kq.hijy[779] = -411705;
        kq.hijy[780] = -805186669;
        kq.hijy[781] = -1961058990;
        kq.hijy[782] = -1074936448;
        kq.hijy[783] = -369462758;
        kq.hijy[784] = 523208283;
        kq.hijy[785] = 939941632;
        kq.hijy[786] = -2136594464;
        kq.hijy[787] = 1331308655;
        kq.hijy[788] = -59895430;
        kq.hijy[789] = -1962411334;
        kq.hijy[790] = 2107482000;
        kq.hijy[791] = -677014200;
        kq.hijy[792] = 1093085127;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void lambda$text$0(Matrix4f var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(kq.hijs("hkbs", hijp(int ), (int)358) - kq.hijs("hkbr", hijp(int ), (int)357));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -36255448: {
                    continue block11;
                }
                case 722891128: {
                    break block11;
                }
            }
            break;
        }
        var10_8 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hkbt", hijp(int ), (int)359)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kq.hijs("hkbu", hijw(int ), (int)781)) break;
            v1 /* !! */  = (long)kq.hijs("hkbv", hijw(int ), (int)782);
        }
        var9_9 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hkbw", hijp(int ), (int)360)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hkbx", hijw(int ), (int)783)) break;
            v2 /* !! */  = (long)kq.hijs("hkby", hijw(int ), (int)784);
        }
        var8_10 = kq.a;
        if (var10_8) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_10 || var8_10) ** GOTO lbl25
                v3 = kq.hijs("hkbz", hixv(int ), (int)785);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hkca", hijp(int ), (int)361)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kq.hijs("hkcb", hijw(int ), (int)786)) break;
                    v4 /* !! */  = (long)kq.hijs("hkcc", hijw(int ), (int)787);
                }
                kr.drawString(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, (float)v3);
                if (!var8_10) ** break;
                ** continue;
                return;
            }
            case 0: {
                var9_9 /* !! */  = (int)kq.hijs("hkcd", hijw(int ), (int)788);
                if (var10_8) {
                    throw null;
                }
            }
            case 1: {
                var9_9 /* !! */  = (int)kq.hijs("hkce", hijw(int ), (int)789);
                if (var10_8) {
                    throw null;
                }
            }
            case 2: {
                var9_9 /* !! */  = (int)kq.hijs("hkcf", hijw(int ), (int)790);
                if (var10_8) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var9_9 /* !! */  = (int)kq.hijs("hkcg", hijw(int ), (int)791);
                } while (!var10_8);
                throw null;
            }
            case 4: 
        }
        do {
            var9_9 /* !! */  = (int)kq.hijs("hkch", hijw(int ), (int)792);
        } while (!var10_8);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void text(Matrix4f var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        block36: {
            while (true) {
                block37: {
                    if ((v0 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hivb", hijp(int ), (int)111)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != kq.hijs("hivc", hijw(int ), (int)180)) break block37;
                    var9_7 = kq.c;
                    v1 /* !! */  = kq.ok;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)kq.hijs("hivd", hijw(int ), (int)181);
            }
            block18: while (true) {
                v1 /* !! */  = (long)(v2 - kq.hijs("hive", hijp(int ), (int)112));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1112722744: {
                        v2 = kq.hijs("hivf", hijp(int ), (int)113);
                        continue block18;
                    }
                    case 722891128: {
                        break block18;
                    }
                    case 2127201311: {
                        v2 = kq.hijs("hivg", hijp(int ), (int)114);
                        continue block18;
                    }
                }
                break;
            }
            var8_8 /* !! */  = kq.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hivh", hijp(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == kq.hijs("hivi", hijw(int ), (int)182)) {
                    var7_9 = kq.a;
                    if (var9_7) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)kq.hijs("hivj", hijw(int ), (int)183);
            }
            if (var7_9) return;
            if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block20: do {
                switch (cfr_temp_0 == -2147483648 ? var8_8 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var7_9) return;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hivk", hijp(int ), (int)116)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == kq.hijs("hivl", hijw(int ), (int)184)) {
                                v5 = kv.get(var1_1);
                                v6 /* !! */  = kq.ok;
                                ** break;
                            }
                            v4 /* !! */  = (long)kq.hijs("hivm", hijw(int ), (int)185);
                        }
                    }
                    case 2: {
                        var8_8 /* !! */  = (int)kq.hijs("hivr", hijw(int ), (int)188);
                        cfr_temp_0 = 3;
                        if (!var9_7) continue block20;
                        throw null;
                    }
                    case 4: {
                        var8_8 /* !! */  = (int)kq.hijs("hivt", hijw(int ), (int)190);
                        if (var9_7) {
                            throw null;
                        }
                    }
                    case 3: {
                        var8_8 /* !! */  = (int)kq.hijs("hivs", hijw(int ), (int)189);
                        if (var9_7) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** GOTO lbl76
                    }
                    case 5: {
                        break block36;
                    }
lbl66:
                    // 1 sources

                    block22: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case 165219077: {
                                v6 /* !! */  = (long)(kq.hijs("hivo", hijp(int ), (int)118) - kq.hijs("hivn", hijp(int ), (int)117));
                                continue block22;
                            }
                            case 722891128: {
                                break block22;
                            }
                        }
                        break;
                    }
                    kr.drawString(var0, v5, var2_2, var3_3, var4_4, var5_5, var6_6, 0.0f, 0.0f);
                    if (!var7_9 && !var7_9) return;
                    return;
lbl76:
                    // 2 sources

                    while (true) {
                        var8_8 /* !! */  = (int)kq.hijs("hivp", hijw(int ), (int)186);
                        cfr_temp_0 = 1;
                        if (!var9_7) continue block20;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var8_8 /* !! */  = (int)kq.hijs("hivq", hijw(int ), (int)187);
            if (!var9_7) ** break;
            throw null;
        }
        var8_8 /* !! */  = (int)kq.hijs("hivu", hijw(int ), (int)191);
        ** while (!var9_7)
lbl90:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(class_332 var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, boolean var7_7) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hiqk", hijp(int ), (int)67));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1703976297: {
                    v1 = kq.hijs("hiql", hijp(int ), (int)68);
                    continue block46;
                }
                case -949394746: {
                    v1 = kq.hijs("hiqm", hijp(int ), (int)69);
                    continue block46;
                }
                case 722891128: {
                    break block46;
                }
                case 1828398701: {
                    v1 = kq.hijs("hiqn", hijp(int ), (int)70);
                    continue block46;
                }
            }
            break;
        }
        var11_8 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl22
        block47: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hiqo", hijp(int ), (int)71));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -891335674: {
                    v3 = kq.hijs("hiqp", hijp(int ), (int)72);
                    continue block47;
                }
                case 722891128: {
                    break block47;
                }
                case 1585636575: {
                    v3 = kq.hijs("hiqq", hijp(int ), (int)73);
                    continue block47;
                }
                case 1687131666: {
                    v3 = kq.hijs("hiqr", hijp(int ), (int)74);
                    continue block47;
                }
            }
            break;
        }
        var10_9 /* !! */  = kq.b;
        v4 /* !! */  = kq.ok;
        if (true) ** GOTO lbl39
        block48: while (true) {
            v4 /* !! */  = (long)(kq.hijs("hiqt", hijp(int ), (int)76) - kq.hijs("hiqs", hijp(int ), (int)75));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 722891128: {
                    break block48;
                }
                case 2106150174: {
                    continue block48;
                }
            }
            break;
        }
        var9_10 = kq.a;
        if (var11_8) {
            throw null;
lbl47:
            // 9 sources

            return;
        }
        if (var9_10 || var9_10) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hiqu", hijp(int ), (int)77)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == kq.hijs("hiqv", hijw(int ), (int)103)) break;
            v5 /* !! */  = (long)kq.hijs("hiqw", hijw(int ), (int)104);
        }
        var8_11 = kv.get(var1_1);
        if (var9_10 || var9_10) ** GOTO lbl47
        if (var10_9 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 /* !! */  = kq.ok;
                if (true) ** GOTO lbl64
                block51: while (true) {
                    v6 /* !! */  = (long)(kq.hijs("hiqy", hijp(int ), (int)79) - kq.hijs("hiqx", hijp(int ), (int)78));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 722891128: {
                            break block51;
                        }
                        case 2133855332: {
                            continue block51;
                        }
                    }
                    break;
                }
                if (kq.useFallback) ** GOTO lbl80
                if (var9_10) ** GOTO lbl47
                if (var8_11 == null) ** GOTO lbl80
                if (var9_10) ** GOTO lbl47
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hiqz", hijp(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kq.hijs("hira", hijw(int ), (int)105)) break;
                    v7 /* !! */  = (long)kq.hijs("hirb", hijw(int ), (int)106);
                }
                if (var8_11.isLoaded()) ** GOTO lbl89
                if (var9_10) ** GOTO lbl47
lbl80:
                // 3 sources

                if (var9_10 || var9_10) ** GOTO lbl47
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hirc", hijp(int ), (int)81)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kq.hijs("hird", hijw(int ), (int)107)) break;
                    v8 /* !! */  = (long)kq.hijs("hire", hijw(int ), (int)108);
                }
                kq.fallbackText(var0, var2_2, var3_3, var4_4, var5_5, var6_6);
                if (var9_10 || var9_10) ** GOTO lbl47
                return;
lbl89:
                // 1 sources

                if (var9_10 || var9_10) ** GOTO lbl47
                v9 /* !! */  = kq.ok;
                if (true) ** GOTO lbl94
                block54: while (true) {
                    v9 /* !! */  = (long)(v10 - kq.hijs("hirf", hijp(int ), (int)82));
lbl94:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1410519295: {
                            v10 = kq.hijs("hirg", hijp(int ), (int)83);
                            continue block54;
                        }
                        case -1309967041: {
                            v10 = kq.hijs("hirh", hijp(int ), (int)84);
                            continue block54;
                        }
                        case -696348034: {
                            v10 = kq.hijs("hiri", hijp(int ), (int)85);
                            continue block54;
                        }
                        case 722891128: {
                            break block54;
                        }
                    }
                    break;
                }
                kq.text(var0, var8_11, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                if (!var9_10 && !var9_10) ** break;
                ** continue;
                return;
            }
            case 0: {
                var10_9 /* !! */  = (int)kq.hijs("hirj", hijw(int ), (int)109);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl115:
            // 2 sources

            case 1: {
                var10_9 /* !! */  = (int)kq.hijs("hirk", hijw(int ), (int)110);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl120:
            // 2 sources

            case 2: {
                var10_9 /* !! */  = (int)kq.hijs("hirl", hijw(int ), (int)111);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl125:
            // 3 sources

            case 3: {
                do {
                    var10_9 /* !! */  = (int)kq.hijs("hirm", hijw(int ), (int)112);
                } while (!var11_8);
                throw null;
            }
lbl130:
            // 3 sources

            case 4: {
                var10_9 /* !! */  = (int)kq.hijs("hirn", hijw(int ), (int)113);
                if (!var11_8) ** GOTO lbl125
                throw null;
            }
lbl134:
            // 2 sources

            case 5: {
                var10_9 /* !! */  = (int)kq.hijs("hiro", hijw(int ), (int)114);
                if (!var11_8) ** GOTO lbl130
                throw null;
            }
lbl138:
            // 2 sources

            case 6: {
                var10_9 /* !! */  = (int)kq.hijs("hirp", hijw(int ), (int)115);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl143:
            // 2 sources

            case 7: {
                var10_9 /* !! */  = (int)kq.hijs("hirq", hijw(int ), (int)116);
                if (!var11_8) break;
                throw null;
            }
lbl147:
            // 2 sources

            case 8: {
                var10_9 /* !! */  = (int)kq.hijs("hirr", hijw(int ), (int)117);
                if (!var11_8) ** GOTO lbl120
                throw null;
            }
            case 9: {
                var10_9 /* !! */  = (int)kq.hijs("hirs", hijw(int ), (int)118);
                if (!var11_8) ** GOTO lbl147
                throw null;
            }
            case 10: {
                var10_9 /* !! */  = (int)kq.hijs("hirt", hijw(int ), (int)119);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 11: {
                var10_9 /* !! */  = (int)kq.hijs("hiru", hijw(int ), (int)120);
                if (var11_8) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 12: {
                do {
                    var10_9 /* !! */  = (int)kq.hijs("hirv", hijw(int ), (int)121);
                } while (!var11_8);
                throw null;
            }
lbl170:
            // 2 sources

            case 13: {
                var10_9 /* !! */  = (int)kq.hijs("hirw", hijw(int ), (int)122);
                if (var11_8) {
                    throw null;
                }
            }
            case 14: {
                var10_9 /* !! */  = (int)kq.hijs("hirx", hijw(int ), (int)123);
                if (!var11_8) ** GOTO lbl134
                throw null;
            }
lbl178:
            // 2 sources

            case 15: {
                var10_9 /* !! */  = (int)kq.hijs("hiry", hijw(int ), (int)124);
                if (!var11_8) ** GOTO lbl130
                throw null;
            }
lbl182:
            // 2 sources

            case 16: {
                var10_9 /* !! */  = (int)kq.hijs("hirz", hijw(int ), (int)125);
                if (!var11_8) ** GOTO lbl115
                throw null;
            }
            case 17: 
        }
        do {
            var10_9 /* !! */  = (int)kq.hijs("hisa", hijw(int ), (int)126);
        } while (!var11_8);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void textColored(class_332 class_3322, String string, float f2, float f3, float f4, int ... nArray) {
        boolean bl2;
        Object object = ok;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kq.hijs("hjpj", hijp(int ), 289);
            }
            switch ((int)object) {
                case -1440942455: {
                    callSite = kq.hijs("hjpk", hijp(int ), 290);
                    continue block5;
                }
                case -552357756: {
                    callSite = kq.hijs("hjpl", hijp(int ), 291);
                    continue block5;
                }
                case 722891128: {
                    break block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ok - kq.hijs("hjpm", hijp(int ), 292)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kq.hijs("hjpn", hijw(int ), 529)) break;
            object2 = kq.hijs("hjpo", hijw(int ), 530);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ok - kq.hijs("hjpp", hijp(int ), 293)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kq.hijs("hjpq", hijw(int ), 531)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kq.hijs("hjpr", hijw(int ), 532);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = ok - kq.hijs("hjps", hijp(int ), 294)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == kq.hijs("hjpt", hijw(int ), 533)) break;
            object4 = kq.hijs("hjpu", hijw(int ), 534);
        }
        ks ks2 = kv.getDefault();
        CallSite callSite = kq.hijs("hjpv", hijw(int ), 535);
        while (true) {
            long l5;
            Object object5;
            if ((object5 = (l5 = ok - kq.hijs("hjpw", hijp(int ), 295)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object5 == kq.hijs("hjpx", hijw(int ), 536)) {
                kq.textColored(class_3322, ks2, string, f2, f3, f4, (boolean)callSite, nArray);
                if (bl2) return;
                break;
            }
            object5 = kq.hijs("hjpy", hijw(int ), 537);
        }
        if (!bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5, boolean var6_6) {
        block60: {
            block59: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hioy", hijp(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == kq.hijs("hioz", hijw(int ), (int)80)) break;
                    v0 /* !! */  = (long)kq.hijs("hipa", hijw(int ), (int)81);
                }
                var9_7 = kq.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hipb", hijp(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == kq.hijs("hipc", hijw(int ), (int)82)) break;
                    v1 /* !! */  = (long)kq.hijs("hipd", hijw(int ), (int)83);
                }
                var8_8 /* !! */  = kq.b;
                v2 /* !! */  = kq.ok;
                if (true) ** GOTO lbl17
                block38: while (true) {
                    v2 /* !! */  = (long)(kq.hijs("hipf", hijp(int ), (int)55) - kq.hijs("hipe", hijp(int ), (int)54));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1851061920: {
                            continue block38;
                        }
                        case 722891128: {
                            break block38;
                        }
                    }
                    break;
                }
                var7_9 = kq.a;
                if (var9_7) {
                    throw null;
lbl25:
                    // 8 sources

                    return;
                }
                if (var7_9 || var7_9) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hipg", hijp(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kq.hijs("hiph", hijw(int ), (int)84)) break;
                    v3 /* !! */  = (long)kq.hijs("hipi", hijw(int ), (int)85);
                }
                if (kq.useFallback) break block59;
                if (var7_9) ** GOTO lbl25
                v4 /* !! */  = kq.ok;
                if (true) ** GOTO lbl39
                block41: while (true) {
                    v4 /* !! */  = (long)(v5 - kq.hijs("hipj", hijp(int ), (int)57));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 722891128: {
                            break block41;
                        }
                        case 1398534572: {
                            v5 = kq.hijs("hipk", hijp(int ), (int)58);
                            continue block41;
                        }
                        case 1892782560: {
                            v5 = kq.hijs("hipl", hijp(int ), (int)59);
                            continue block41;
                        }
                    }
                    break;
                }
                if (kq.hasFonts()) break block60;
                if (var7_9) ** GOTO lbl25
            }
            if (var7_9 || var7_9) ** GOTO lbl25
            v6 /* !! */  = kq.ok;
            if (true) ** GOTO lbl56
            block42: while (true) {
                v6 /* !! */  = (long)(v7 - kq.hijs("hipm", hijp(int ), (int)60));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2058828873: {
                        v7 = kq.hijs("hipn", hijp(int ), (int)61);
                        continue block42;
                    }
                    case -894091403: {
                        v7 = kq.hijs("hipo", hijp(int ), (int)62);
                        continue block42;
                    }
                    case 714326678: {
                        v7 = kq.hijs("hipp", hijp(int ), (int)63);
                        continue block42;
                    }
                    case 722891128: {
                        break block42;
                    }
                }
                break;
            }
            kq.fallbackText(var0, var1_1, var2_2, var3_3, var4_4, var5_5);
            if (var7_9 || var7_9) ** GOTO lbl25
            return;
        }
        if (var7_9) ** GOTO lbl25
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_9) ** GOTO lbl25
                v8 /* !! */  = kq.ok;
                if (true) ** GOTO lbl81
                block43: while (true) {
                    v8 /* !! */  = (long)(kq.hijs("hipr", hijp(int ), (int)65) - kq.hijs("hipq", hijp(int ), (int)64));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 503283059: {
                            continue block43;
                        }
                        case 722891128: {
                            break block43;
                        }
                    }
                    break;
                }
                v9 = kv.getDefault();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hips", hijp(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == kq.hijs("hipt", hijw(int ), (int)86)) break;
                    v10 /* !! */  = (long)kq.hijs("hipu", hijw(int ), (int)87);
                }
                kq.text(var0, v9, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                if (!var7_9 && !var7_9) ** break;
                ** continue;
                return;
            }
lbl96:
            // 2 sources

            case 0: {
                var8_8 /* !! */  = (int)kq.hijs("hipv", hijw(int ), (int)88);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 /* !! */  = (int)kq.hijs("hipw", hijw(int ), (int)89);
                    if (var9_7) {
                        throw null;
                    }
                    ** GOTO lbl126
                    break;
                }
            }
            case 2: {
                var8_8 /* !! */  = (int)kq.hijs("hipx", hijw(int ), (int)90);
                if (!var9_7) ** GOTO lbl96
                throw null;
            }
lbl111:
            // 5 sources

            case 3: {
                var8_8 /* !! */  = (int)kq.hijs("hipy", hijw(int ), (int)91);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl116:
            // 2 sources

            case 4: {
                var8_8 /* !! */  = (int)kq.hijs("hipz", hijw(int ), (int)92);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl121:
            // 2 sources

            case 5: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hiqa", hijw(int ), (int)93);
                } while (!var9_7);
                throw null;
            }
lbl126:
            // 3 sources

            case 6: {
                var8_8 /* !! */  = (int)kq.hijs("hiqb", hijw(int ), (int)94);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl131:
            // 2 sources

            case 7: {
                var8_8 /* !! */  = (int)kq.hijs("hiqc", hijw(int ), (int)95);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 8: {
                var8_8 /* !! */  = (int)kq.hijs("hiqd", hijw(int ), (int)96);
                if (!var9_7) ** GOTO lbl116
                throw null;
            }
            case 9: {
                var8_8 /* !! */  = (int)kq.hijs("hiqe", hijw(int ), (int)97);
                if (!var9_7) ** GOTO lbl121
                throw null;
            }
lbl144:
            // 2 sources

            case 10: {
                var8_8 /* !! */  = (int)kq.hijs("hiqf", hijw(int ), (int)98);
                if (!var9_7) ** GOTO lbl111
                throw null;
            }
            case 11: {
                var8_8 /* !! */  = (int)kq.hijs("hiqg", hijw(int ), (int)99);
                if (!var9_7) ** GOTO lbl111
                throw null;
            }
            case 12: {
                var8_8 /* !! */  = (int)kq.hijs("hiqh", hijw(int ), (int)100);
                if (!var9_7) ** GOTO lbl111
                throw null;
            }
lbl156:
            // 3 sources

            case 13: {
                var8_8 /* !! */  = (int)kq.hijs("hiqi", hijw(int ), (int)101);
                if (!var9_7) ** GOTO lbl144
                throw null;
            }
            case 14: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hiqj", hijw(int ), (int)102);
        ** while (!var9_7)
lbl163:
        // 1 sources

        throw null;
    }

    private static void hkcj() {
        kq.hijx[100] = 915108365;
        kq.hijx[101] = -1852561482;
        kq.hijx[102] = 1876655905;
        kq.hijx[103] = -468665414;
        kq.hijx[104] = 239147085;
        kq.hijx[105] = 927393198;
        kq.hijx[106] = 1206097802;
        kq.hijx[107] = -1949837807;
        kq.hijx[108] = -816980192;
        kq.hijx[109] = 1862342189;
        kq.hijx[110] = -1444712676;
        kq.hijx[111] = 1935187297;
        kq.hijx[112] = 1296794173;
        kq.hijx[113] = -2006638280;
        kq.hijx[114] = -1365380889;
        kq.hijx[115] = -1701249697;
        kq.hijx[116] = -332131421;
        kq.hijx[117] = -665603424;
        kq.hijx[118] = 855319594;
        kq.hijx[119] = -455844665;
        kq.hijx[120] = 1728108586;
        kq.hijx[121] = -1104963671;
        kq.hijx[122] = 1137937642;
        kq.hijx[123] = 2117221572;
        kq.hijx[124] = -466240946;
        kq.hijx[125] = 1836624531;
        kq.hijx[126] = -861755792;
        kq.hijx[127] = 1672360301;
        kq.hijx[128] = -753780851;
        kq.hijx[129] = 2138966615;
        kq.hijx[130] = 2088427504;
        kq.hijx[131] = -1377001220;
        kq.hijx[132] = -108111961;
        kq.hijx[133] = -460892127;
        kq.hijx[134] = 1036347068;
        kq.hijx[135] = 2135410585;
        kq.hijx[136] = -1026042326;
        kq.hijx[137] = -742039145;
        kq.hijx[138] = -1890557658;
        kq.hijx[139] = 712854051;
        kq.hijx[140] = -607418930;
        kq.hijx[141] = -1565714344;
        kq.hijx[142] = 1058960548;
        kq.hijx[143] = 938669175;
        kq.hijx[144] = 1071901935;
        kq.hijx[145] = 485208028;
        kq.hijx[146] = -1041721235;
        kq.hijx[147] = -1844732480;
        kq.hijx[148] = 1779597693;
        kq.hijx[149] = -1215740828;
        kq.hijx[150] = -238656810;
        kq.hijx[151] = -1503663212;
        kq.hijx[152] = -1707275574;
        kq.hijx[153] = -1304639778;
        kq.hijx[154] = -1074873207;
        kq.hijx[155] = 2112577885;
        kq.hijx[156] = 1004187588;
        kq.hijx[157] = 639063334;
        kq.hijx[158] = -249146323;
        kq.hijx[159] = 1882884006;
        kq.hijx[160] = 1865949766;
        kq.hijx[161] = 1248550680;
        kq.hijx[162] = 1341284729;
        kq.hijx[163] = -1020319381;
        kq.hijx[164] = 57515995;
        kq.hijx[165] = -1204404784;
        kq.hijx[166] = 1107004930;
        kq.hijx[167] = -1631850697;
        kq.hijx[168] = -125257880;
        kq.hijx[169] = 1603871164;
        kq.hijx[170] = -126478440;
        kq.hijx[171] = -95889318;
        kq.hijx[172] = -234547326;
        kq.hijx[173] = 721119311;
        kq.hijx[174] = 1260414149;
        kq.hijx[175] = 776210347;
        kq.hijx[176] = -275592240;
        kq.hijx[177] = 1309368825;
        kq.hijx[178] = -1471024926;
        kq.hijx[179] = -941428102;
        kq.hijx[180] = -357682064;
        kq.hijx[181] = 1661454919;
        kq.hijx[182] = 811484580;
        kq.hijx[183] = -259141763;
        kq.hijx[184] = -922771709;
        kq.hijx[185] = 77218765;
        kq.hijx[186] = -488546662;
        kq.hijx[187] = 492147449;
        kq.hijx[188] = -163662286;
        kq.hijx[189] = -1047448536;
        kq.hijx[190] = 722753003;
        kq.hijx[191] = -945616680;
        kq.hijx[192] = 905391371;
        kq.hijx[193] = -888238715;
        kq.hijx[194] = -1432972383;
        kq.hijx[195] = 115452549;
        kq.hijx[196] = 569867648;
        kq.hijx[197] = 410988987;
        kq.hijx[198] = -165154277;
        kq.hijx[199] = -525987892;
    }

    private static long hijp(int n2) {
        return hijq[n2] ^ hijr[n2];
    }

    private static void hkci() {
        kq.hijx[0] = 247132437;
        kq.hijx[1] = 1069977309;
        kq.hijx[2] = 2129062311;
        kq.hijx[3] = 560102825;
        kq.hijx[4] = -332863046;
        kq.hijx[5] = -1489022278;
        kq.hijx[6] = 879924550;
        kq.hijx[7] = -1791783563;
        kq.hijx[8] = 2045638411;
        kq.hijx[9] = -707591674;
        kq.hijx[10] = -1543297134;
        kq.hijx[11] = 680954149;
        kq.hijx[12] = 729355112;
        kq.hijx[13] = -2025716780;
        kq.hijx[14] = 655767264;
        kq.hijx[15] = 1195957730;
        kq.hijx[16] = -745279481;
        kq.hijx[17] = 1723746748;
        kq.hijx[18] = 899160659;
        kq.hijx[19] = -1683401608;
        kq.hijx[20] = 1212924718;
        kq.hijx[21] = 1211984236;
        kq.hijx[22] = 705573532;
        kq.hijx[23] = -1330886867;
        kq.hijx[24] = 336221907;
        kq.hijx[25] = 862732596;
        kq.hijx[26] = 952040874;
        kq.hijx[27] = 613723218;
        kq.hijx[28] = 636309199;
        kq.hijx[29] = 1366595572;
        kq.hijx[30] = 47162448;
        kq.hijx[31] = 1783570875;
        kq.hijx[32] = -1887659592;
        kq.hijx[33] = -1931021901;
        kq.hijx[34] = -1086708098;
        kq.hijx[35] = 1620426348;
        kq.hijx[36] = -238942938;
        kq.hijx[37] = -257461757;
        kq.hijx[38] = -1489224426;
        kq.hijx[39] = 408041275;
        kq.hijx[40] = 407458250;
        kq.hijx[41] = 879645899;
        kq.hijx[42] = -320857331;
        kq.hijx[43] = -1185556546;
        kq.hijx[44] = 1197367594;
        kq.hijx[45] = -1401695779;
        kq.hijx[46] = -368857270;
        kq.hijx[47] = 1831147224;
        kq.hijx[48] = -1863082483;
        kq.hijx[49] = -1405958451;
        kq.hijx[50] = 912326846;
        kq.hijx[51] = 954883625;
        kq.hijx[52] = -517266988;
        kq.hijx[53] = 541740577;
        kq.hijx[54] = 584023015;
        kq.hijx[55] = 6752801;
        kq.hijx[56] = -1171523176;
        kq.hijx[57] = -702926172;
        kq.hijx[58] = 278850067;
        kq.hijx[59] = 498375116;
        kq.hijx[60] = -839651614;
        kq.hijx[61] = 1796288759;
        kq.hijx[62] = 310947487;
        kq.hijx[63] = 1621652704;
        kq.hijx[64] = -1372150152;
        kq.hijx[65] = -597794805;
        kq.hijx[66] = -2011272758;
        kq.hijx[67] = -1945930852;
        kq.hijx[68] = -997389168;
        kq.hijx[69] = -913047513;
        kq.hijx[70] = 680305903;
        kq.hijx[71] = -107545328;
        kq.hijx[72] = -1973268312;
        kq.hijx[73] = -1036780150;
        kq.hijx[74] = -1752651226;
        kq.hijx[75] = -1175341944;
        kq.hijx[76] = -846858410;
        kq.hijx[77] = -1238562891;
        kq.hijx[78] = 1211895552;
        kq.hijx[79] = -481007798;
        kq.hijx[80] = -782080449;
        kq.hijx[81] = 778005841;
        kq.hijx[82] = -1772819451;
        kq.hijx[83] = -1329300298;
        kq.hijx[84] = 2104127097;
        kq.hijx[85] = 1606427410;
        kq.hijx[86] = 747162252;
        kq.hijx[87] = -1148996006;
        kq.hijx[88] = 1566904500;
        kq.hijx[89] = 1102553289;
        kq.hijx[90] = -960185618;
        kq.hijx[91] = 39759212;
        kq.hijx[92] = -545914206;
        kq.hijx[93] = -704739094;
        kq.hijx[94] = -1130476691;
        kq.hijx[95] = 987158050;
        kq.hijx[96] = -543498045;
        kq.hijx[97] = -2017425669;
        kq.hijx[98] = -2127730826;
        kq.hijx[99] = 937982915;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(Matrix4f var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hivv", hijp(int ), (int)119)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kq.hijs("hivw", hijw(int ), (int)192)) break;
            v0 /* !! */  = (long)kq.hijs("hivx", hijw(int ), (int)193);
        }
        var9_7 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hivy", hijp(int ), (int)120)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kq.hijs("hivz", hijw(int ), (int)194)) break;
            v1 /* !! */  = (long)kq.hijs("hiwa", hijw(int ), (int)195);
        }
        var8_8 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hiwb", hijp(int ), (int)121)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kq.hijs("hiwc", hijw(int ), (int)196)) break;
            v2 /* !! */  = (long)kq.hijs("hiwd", hijw(int ), (int)197);
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl24
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = kq.ok;
                if (true) ** GOTO lbl34
                block17: while (true) {
                    v3 /* !! */  = (long)(v4 - kq.hijs("hiwe", hijp(int ), (int)122));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1973992287: {
                            v4 = kq.hijs("hiwf", hijp(int ), (int)123);
                            continue block17;
                        }
                        case 94300484: {
                            v4 = kq.hijs("hiwg", hijp(int ), (int)124);
                            continue block17;
                        }
                        case 722891128: {
                            break block17;
                        }
                    }
                    break;
                }
                kr.drawString(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, 0.0f, 0.0f);
                if (var7_9 || var7_9) ** continue;
                return;
            }
lbl46:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 /* !! */  = (int)kq.hijs("hiwh", hijw(int ), (int)198);
                    if (var9_7) {
                        throw null;
                    }
                    ** GOTO lbl60
                    break;
                }
            }
            case 1: {
                var8_8 /* !! */  = (int)kq.hijs("hiwi", hijw(int ), (int)199);
                if (var9_7) {
                    throw null;
                }
            }
            case 2: {
                var8_8 /* !! */  = (int)kq.hijs("hiwj", hijw(int ), (int)200);
                if (!var9_7) ** GOTO lbl46
                throw null;
            }
lbl60:
            // 2 sources

            case 3: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hiwk", hijw(int ), (int)201);
                } while (!var9_7);
                throw null;
            }
            case 4: {
                var8_8 /* !! */  = (int)kq.hijs("hiwl", hijw(int ), (int)202);
                if (!var9_7) ** GOTO lbl46
                throw null;
            }
            case 5: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hiwm", hijw(int ), (int)203);
        ** while (!var9_7)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textWithShadow(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjfw", hijp(int ), (int)234)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjfx", hijw(int ), (int)337)) break;
            v0 /* !! */  = (long)kq.hijs("hjfy", hijw(int ), (int)338);
        }
        var8_6 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(kq.hijs("hjga", hijp(int ), (int)236) - kq.hijs("hjfz", hijp(int ), (int)235));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 722891128: {
                    break block25;
                }
                case 1816546578: {
                    continue block25;
                }
            }
            break;
        }
        var7_7 /* !! */  = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl21
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjgb", hijp(int ), (int)237));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1990979157: {
                    v3 = kq.hijs("hjgc", hijp(int ), (int)238);
                    continue block26;
                }
                case -1626371374: {
                    v3 = kq.hijs("hjgd", hijp(int ), (int)239);
                    continue block26;
                }
                case 722891128: {
                    break block26;
                }
                case 1262792532: {
                    v3 = kq.hijs("hjge", hijp(int ), (int)240);
                    continue block26;
                }
            }
            break;
        }
        var6_8 = kq.a;
        if (var8_6) {
            throw null;
lbl36:
            // 4 sources

            return;
        }
        if (var6_8) ** GOTO lbl36
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_8) ** GOTO lbl36
                v4 = kq.hijs("hjgf", hijw(int ), (int)339);
                v5 = kq.hijs("hjgg", hijw(int ), (int)340);
                v6 /* !! */  = kq.ok;
                if (true) ** GOTO lbl49
                block28: while (true) {
                    v6 /* !! */  = (long)(kq.hijs("hjgi", hijp(int ), (int)242) - kq.hijs("hjgh", hijp(int ), (int)241));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 178789586: {
                            continue block28;
                        }
                        case 722891128: {
                            break block28;
                        }
                    }
                    break;
                }
                kq.text(var0, var1_1, var2_2 + 1.0f, var3_3 + 1.0f, var4_4, (int)v4, (boolean)v5);
                if (var6_8 || var6_8) ** GOTO lbl36
                v7 = kq.hijs("hjgj", hijw(int ), (int)341);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjgk", hijp(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kq.hijs("hjgl", hijw(int ), (int)342)) break;
                    v8 /* !! */  = (long)kq.hijs("hjgm", hijw(int ), (int)343);
                }
                kq.text(var0, var1_1, var2_2, var3_3, var4_4, var5_5, (boolean)v7);
                if (!var6_8 && !var6_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_7 /* !! */  = (int)kq.hijs("hjgn", hijw(int ), (int)344);
                if (var8_6) {
                    throw null;
                }
            }
            case 1: {
                var7_7 /* !! */  = (int)kq.hijs("hjgo", hijw(int ), (int)345);
                if (var8_6) {
                    throw null;
                }
            }
lbl74:
            // 5 sources

            case 2: {
                var7_7 /* !! */  = (int)kq.hijs("hjgp", hijw(int ), (int)346);
                if (var8_6) {
                    throw null;
                }
            }
lbl78:
            // 4 sources

            case 3: {
                do {
                    var7_7 /* !! */  = (int)kq.hijs("hjgq", hijw(int ), (int)347);
                } while (!var8_6);
                throw null;
            }
            case 4: {
                var7_7 /* !! */  = (int)kq.hijs("hjgr", hijw(int ), (int)348);
                if (!var8_6) ** GOTO lbl74
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)kq.hijs("hjgs", hijw(int ), (int)349);
                    if (!var8_6) ** GOTO lbl78
                    throw null;
                }
            }
            case 6: {
                var7_7 /* !! */  = (int)kq.hijs("hjgt", hijw(int ), (int)350);
                if (!var8_6) ** GOTO lbl74
                throw null;
            }
            case 7: 
        }
        var7_7 /* !! */  = (int)kq.hijs("hjgu", hijw(int ), (int)351);
        ** while (!var8_6)
lbl99:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hiod", hijp(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kq.hijs("hioe", hijw(int ), (int)69)) break;
            v0 /* !! */  = (long)kq.hijs("hiof", hijw(int ), (int)70);
        }
        var8_6 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hiog", hijp(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kq.hijs("hioh", hijw(int ), (int)71)) break;
            v1 /* !! */  = (long)kq.hijs("hioi", hijw(int ), (int)72);
        }
        var7_7 /* !! */  = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hioj", hijp(int ), (int)44));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -374729130: {
                    v3 = kq.hijs("hiok", hijp(int ), (int)45);
                    continue block22;
                }
                case 722891128: {
                    break block22;
                }
                case 833034181: {
                    v3 = kq.hijs("hiol", hijp(int ), (int)46);
                    continue block22;
                }
                case 900616710: {
                    v3 = kq.hijs("hiom", hijp(int ), (int)47);
                    continue block22;
                }
            }
            break;
        }
        var6_8 = kq.a;
        if (var8_6) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var6_8 || var6_8) ** GOTO lbl34
        v4 = kq.hijs("hion", hijw(int ), (int)73);
        v5 /* !! */  = kq.ok;
        if (true) ** GOTO lbl42
        block24: while (true) {
            v5 /* !! */  = (long)(v6 - kq.hijs("hioo", hijp(int ), (int)48));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1953696516: {
                    v6 = kq.hijs("hiop", hijp(int ), (int)49);
                    continue block24;
                }
                case -1420017641: {
                    v6 = kq.hijs("hioq", hijp(int ), (int)50);
                    continue block24;
                }
                case 722891128: {
                    break block24;
                }
                case 1574204420: {
                    v6 = kq.hijs("hior", hijp(int ), (int)51);
                    continue block24;
                }
            }
            break;
        }
        kq.text(var0, var1_1, var2_2, var3_3, var4_4, var5_5, (boolean)v4);
        if (var6_8) ** GOTO lbl34
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var7_7 /* !! */  = (int)kq.hijs("hios", hijw(int ), (int)74);
                } while (!var8_6);
                throw null;
            }
            case 1: {
                var7_7 /* !! */  = (int)kq.hijs("hiot", hijw(int ), (int)75);
                if (!var8_6) break;
                throw null;
            }
lbl71:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_7 /* !! */  = (int)kq.hijs("hiou", hijw(int ), (int)76);
                    if (!var8_6) break block12;
                    throw null;
                }
            }
            case 3: {
                var7_7 /* !! */  = (int)kq.hijs("hiov", hijw(int ), (int)77);
                if (!var8_6) ** GOTO lbl71
                throw null;
            }
            case 4: {
                var7_7 /* !! */  = (int)kq.hijs("hiow", hijw(int ), (int)78);
                if (!var8_6) ** GOTO lbl71
                throw null;
            }
            case 5: 
        }
        var7_7 /* !! */  = (int)kq.hijs("hiox", hijw(int ), (int)79);
        ** while (!var8_6)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void textRight(class_332 class_3322, String string, float f2, float f3, float f4, int n2) {
        boolean bl2;
        Object object = ok;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kq.hijs("hjed", hijp(int ), 213);
            }
            switch ((int)object) {
                case -2124723014: {
                    callSite = kq.hijs("hjee", hijp(int ), 214);
                    continue block16;
                }
                case 722891128: {
                    break block16;
                }
                case 889641554: {
                    callSite = kq.hijs("hjef", hijp(int ), 215);
                    continue block16;
                }
                case 999678745: {
                    callSite = kq.hijs("hjeg", hijp(int ), 216);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ok;
        block17: while (true) {
            switch ((int)object2) {
                case 491751132: {
                    object2 = kq.hijs("hjei", hijp(int ), 218) - kq.hijs("hjeh", hijp(int ), 217);
                    continue block17;
                }
                case 722891128: {
                    break block17;
                }
            }
            break;
        }
        int n3 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ok - kq.hijs("hjej", hijp(int ), 219)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == kq.hijs("hjek", hijw(int ), 313)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kq.hijs("hjel", hijw(int ), 314);
        }
        if (bl2 || bl2) return;
        Object object4 = ok;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - kq.hijs("hjem", hijp(int ), 220);
            }
            switch ((int)object4) {
                case 599705272: {
                    callSite = kq.hijs("hjen", hijp(int ), 221);
                    continue block19;
                }
                case 722891128: {
                    break block19;
                }
                case 1334953021: {
                    callSite = kq.hijs("hjeo", hijp(int ), 222);
                    continue block19;
                }
                case 1536104781: {
                    callSite = kq.hijs("hjep", hijp(int ), 223);
                    continue block19;
                }
            }
            break;
        }
        float f5 = f2 - kq.width(string, f4);
        CallSite callSite = kq.hijs("hjeq", hijw(int ), 315);
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = ok - kq.hijs("hjer", hijp(int ), 224)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == kq.hijs("hjes", hijw(int ), 316)) {
                kq.text(class_3322, string, f5, f3, f4, n2, (boolean)callSite);
                if (bl2) return;
                break;
            }
            object5 = kq.hijs("hjet", hijw(int ), 317);
        }
        if (!bl2) return;
    }

    private static void hkcv() {
        kq.hijy[500] = -1503637015;
        kq.hijy[501] = -1213064545;
        kq.hijy[502] = 1718042198;
        kq.hijy[503] = 395905795;
        kq.hijy[504] = -791927214;
        kq.hijy[505] = -15259356;
        kq.hijy[506] = -239273937;
        kq.hijy[507] = -1424150027;
        kq.hijy[508] = -1367879571;
        kq.hijy[509] = 104237972;
        kq.hijy[510] = -1990261424;
        kq.hijy[511] = 1114064963;
        kq.hijy[512] = -627973131;
        kq.hijy[513] = 1423234598;
        kq.hijy[514] = -775894956;
        kq.hijy[515] = -1162888512;
        kq.hijy[516] = 1439131931;
        kq.hijy[517] = 1302353750;
        kq.hijy[518] = -2038951615;
        kq.hijy[519] = 464198541;
        kq.hijy[520] = -22911810;
        kq.hijy[521] = 79678987;
        kq.hijy[522] = 768934616;
        kq.hijy[523] = -927973664;
        kq.hijy[524] = 961294296;
        kq.hijy[525] = 2132008443;
        kq.hijy[526] = -628983507;
        kq.hijy[527] = -157491194;
        kq.hijy[528] = 634999355;
        kq.hijy[529] = -809951859;
        kq.hijy[530] = -217118133;
        kq.hijy[531] = -1606996153;
        kq.hijy[532] = 418022129;
        kq.hijy[533] = -1972888566;
        kq.hijy[534] = 935616054;
        kq.hijy[535] = -459139600;
        kq.hijy[536] = -1730783175;
        kq.hijy[537] = -4774983;
        kq.hijy[538] = 529977745;
        kq.hijy[539] = -2127412182;
        kq.hijy[540] = -1452742794;
        kq.hijy[541] = 1102919406;
        kq.hijy[542] = -662404066;
        kq.hijy[543] = -1133358326;
        kq.hijy[544] = -1944720280;
        kq.hijy[545] = -2012449335;
        kq.hijy[546] = 1758466657;
        kq.hijy[547] = 258832617;
        kq.hijy[548] = 1391807827;
        kq.hijy[549] = -1782612239;
        kq.hijy[550] = -927986047;
        kq.hijy[551] = 2085121294;
        kq.hijy[552] = 749423345;
        kq.hijy[553] = 1592725780;
        kq.hijy[554] = -592401053;
        kq.hijy[555] = 1323565923;
        kq.hijy[556] = -1056204384;
        kq.hijy[557] = 440980198;
        kq.hijy[558] = -1107435016;
        kq.hijy[559] = -325075316;
        kq.hijy[560] = -1593663591;
        kq.hijy[561] = 875089444;
        kq.hijy[562] = 1201609200;
        kq.hijy[563] = -1664758588;
        kq.hijy[564] = -534276100;
        kq.hijy[565] = 1751108369;
        kq.hijy[566] = -1282251305;
        kq.hijy[567] = -65242599;
        kq.hijy[568] = -1945610766;
        kq.hijy[569] = 1604912045;
        kq.hijy[570] = 383935715;
        kq.hijy[571] = -6548657;
        kq.hijy[572] = 530823097;
        kq.hijy[573] = 1285626680;
        kq.hijy[574] = -1092730844;
        kq.hijy[575] = -1662676220;
        kq.hijy[576] = -1297107200;
        kq.hijy[577] = -457799175;
        kq.hijy[578] = -2131122950;
        kq.hijy[579] = -2104197868;
        kq.hijy[580] = -138433932;
        kq.hijy[581] = -1043431109;
        kq.hijy[582] = 512586440;
        kq.hijy[583] = -414675906;
        kq.hijy[584] = 1620348058;
        kq.hijy[585] = 461736855;
        kq.hijy[586] = -334950426;
        kq.hijy[587] = -185985529;
        kq.hijy[588] = 170548191;
        kq.hijy[589] = 933457273;
        kq.hijy[590] = 1068472795;
        kq.hijy[591] = 1886800094;
        kq.hijy[592] = 800253932;
        kq.hijy[593] = -724694564;
        kq.hijy[594] = 1979409612;
        kq.hijy[595] = 332310656;
        kq.hijy[596] = 903847999;
        kq.hijy[597] = 285167447;
        kq.hijy[598] = -59408850;
        kq.hijy[599] = 1624861853;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textWithShadow(class_332 var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjgv", hijp(int ), (int)244));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1598481224: {
                    v1 = kq.hijs("hjgw", hijp(int ), (int)245);
                    continue block20;
                }
                case 629086662: {
                    v1 = kq.hijs("hjgx", hijp(int ), (int)246);
                    continue block20;
                }
                case 722891128: {
                    break block20;
                }
                case 1969858465: {
                    v1 = kq.hijs("hjgy", hijp(int ), (int)247);
                    continue block20;
                }
            }
            break;
        }
        var9_7 = kq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjgz", hijp(int ), (int)248)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hjha", hijw(int ), (int)352)) break;
            v2 /* !! */  = (long)kq.hijs("hjhb", hijw(int ), (int)353);
        }
        var8_8 /* !! */  = kq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjhc", hijp(int ), (int)249)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kq.hijs("hjhd", hijw(int ), (int)354)) break;
            v3 /* !! */  = (long)kq.hijs("hjhe", hijw(int ), (int)355);
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl32
        v4 = kq.hijs("hjhf", hijw(int ), (int)356);
        v5 = kq.hijs("hjhg", hijw(int ), (int)357);
        v6 /* !! */  = kq.ok;
        if (true) ** GOTO lbl41
        block24: while (true) {
            v6 /* !! */  = (long)(kq.hijs("hjhi", hijp(int ), (int)251) - kq.hijs("hjhh", hijp(int ), (int)250));
lbl41:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1202993348: {
                    continue block24;
                }
                case 722891128: {
                    break block24;
                }
            }
            break;
        }
        kq.text(var0, var1_1, var2_2, var3_3 + 1.0f, var4_4 + 1.0f, var5_5, (int)v4, (boolean)v5);
        if (var7_9) ** GOTO lbl32
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_9) ** GOTO lbl32
                v7 = kq.hijs("hjhj", hijw(int ), (int)358);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjhk", hijp(int ), (int)252)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == kq.hijs("hjhl", hijw(int ), (int)359)) break;
                    v8 /* !! */  = (long)kq.hijs("hjhm", hijw(int ), (int)360);
                }
                kq.text(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, (boolean)v7);
                if (!var7_9 && !var7_9) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var8_8 /* !! */  = (int)kq.hijs("hjhn", hijw(int ), (int)361);
                } while (!var9_7);
                throw null;
            }
            case 1: {
                var8_8 /* !! */  = (int)kq.hijs("hjho", hijw(int ), (int)362);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: {
                var8_8 /* !! */  = (int)kq.hijs("hjhp", hijw(int ), (int)363);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl81
            }
lbl77:
            // 3 sources

            case 3: {
                var8_8 /* !! */  = (int)kq.hijs("hjhq", hijw(int ), (int)364);
                if (var9_7) {
                    throw null;
                }
            }
lbl81:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_8 /* !! */  = (int)kq.hijs("hjhr", hijw(int ), (int)365);
                    if (!var9_7) ** GOTO lbl77
                    throw null;
                }
            }
lbl86:
            // 2 sources

            case 5: {
                var8_8 /* !! */  = (int)kq.hijs("hjhs", hijw(int ), (int)366);
                if (!var9_7) ** GOTO lbl77
                throw null;
            }
lbl90:
            // 2 sources

            case 6: {
                var8_8 /* !! */  = (int)kq.hijs("hjht", hijw(int ), (int)367);
                if (!var9_7) ** GOTO lbl86
                throw null;
            }
            case 7: 
        }
        var8_8 /* !! */  = (int)kq.hijs("hjhu", hijw(int ), (int)368);
        ** while (!var9_7)
lbl97:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textRight(class_332 var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjfa", hijp(int ), (int)225)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjfb", hijw(int ), (int)324)) break;
            v0 /* !! */  = (long)kq.hijs("hjfc", hijw(int ), (int)325);
        }
        var9_7 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjfd", hijp(int ), (int)226)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kq.hijs("hjfe", hijw(int ), (int)326)) break;
            v1 /* !! */  = (long)kq.hijs("hjff", hijw(int ), (int)327);
        }
        var8_8 = kq.b;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl17
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjfg", hijp(int ), (int)227));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1869670500: {
                    v3 = kq.hijs("hjfh", hijp(int ), (int)228);
                    continue block12;
                }
                case 201260395: {
                    v3 = kq.hijs("hjfi", hijp(int ), (int)229);
                    continue block12;
                }
                case 722891128: {
                    break block12;
                }
                case 1574633390: {
                    v3 = kq.hijs("hjfj", hijp(int ), (int)230);
                    continue block12;
                }
            }
            break;
        }
        var7_9 = kq.a;
        if (var9_7) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl32
        v4 /* !! */  = kq.ok;
        if (true) ** GOTO lbl39
        block14: while (true) {
            v4 /* !! */  = (long)(kq.hijs("hjfl", hijp(int ), (int)232) - kq.hijs("hjfk", hijp(int ), (int)231));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 722891128: {
                    break block14;
                }
                case 899610370: {
                    continue block14;
                }
            }
            break;
        }
        v5 = var3_3 - kq.width(var1_1, var2_2, var5_5);
        v6 = kq.hijs("hjfm", hijw(int ), (int)328);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjfn", hijp(int ), (int)233)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == kq.hijs("hjfo", hijw(int ), (int)329)) break;
            v7 /* !! */  = (long)kq.hijs("hjfp", hijw(int ), (int)330);
        }
        kq.text(var0, var1_1, var2_2, v5, var4_4, var5_5, var6_6, (boolean)v6);
        ** while (var7_9 || var7_9)
lbl53:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static void invalidateFontCache() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hinl", hijp(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kq.hijs("hinm", hijw(int ), (int)56)) break;
            v0 /* !! */  = (long)kq.hijs("hinn", hijw(int ), (int)57);
        }
        var2 = kq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hino", hijp(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kq.hijs("hinp", hijw(int ), (int)58)) break;
            v1 /* !! */  = (long)kq.hijs("hinq", hijw(int ), (int)59);
        }
        var1_1 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hinr", hijp(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kq.hijs("hins", hijw(int ), (int)60)) break;
            v2 /* !! */  = (long)kq.hijs("hint", hijw(int ), (int)61);
        }
        var0_2 = kq.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
lbl27:
                    // 2 sources

                    return;
                }
                if (var0_2 || var0_2) ** GOTO lbl27
                v3 = kq.hijs("hinu", hijw(int ), (int)62);
                v4 /* !! */  = kq.ok;
                if (true) ** GOTO lbl35
                block16: while (true) {
                    v4 /* !! */  = (long)(kq.hijs("hinw", hijp(int ), (int)41) - kq.hijs("hinv", hijp(int ), (int)40));
lbl35:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 722891128: {
                            break block16;
                        }
                        case 1041117661: {
                            continue block16;
                        }
                    }
                    break;
                }
                kq.fontsReady = v3;
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl43:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)kq.hijs("hinx", hijw(int ), (int)63);
                if (!var2) break;
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)kq.hijs("hiny", hijw(int ), (int)64);
                } while (!var2);
                throw null;
            }
lbl52:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)kq.hijs("hinz", hijw(int ), (int)65);
                if (!var2) ** GOTO lbl43
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kq.hijs("hioa", hijw(int ), (int)66);
                    if (!var2) ** GOTO lbl52
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)kq.hijs("hiob", hijw(int ), (int)67);
                if (!var2) ** GOTO lbl52
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)kq.hijs("hioc", hijw(int ), (int)68);
        ** while (!var2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void glowText(class_332 var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6, float var7_7, boolean var8_8) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hjhv", hijp(int ), (int)253));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 722891128: {
                    break block22;
                }
                case 1533913324: {
                    v1 = kq.hijs("hjhw", hijp(int ), (int)254);
                    continue block22;
                }
                case 1656577574: {
                    v1 = kq.hijs("hjhx", hijp(int ), (int)255);
                    continue block22;
                }
            }
            break;
        }
        var11_9 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hjhy", hijp(int ), (int)256));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 571347840: {
                    v3 = kq.hijs("hjhz", hijp(int ), (int)257);
                    continue block23;
                }
                case 722891128: {
                    break block23;
                }
                case 1847676732: {
                    v3 = kq.hijs("hjia", hijp(int ), (int)258);
                    continue block23;
                }
            }
            break;
        }
        var10_10 /* !! */  = kq.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjib", hijp(int ), (int)259)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kq.hijs("hjic", hijw(int ), (int)369)) break;
            v4 /* !! */  = (long)kq.hijs("hjid", hijw(int ), (int)370);
        }
        var9_11 = kq.a;
        if (var11_9) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var9_11) ** GOTO lbl37
        if (var10_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_11) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjie", hijp(int ), (int)260)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kq.hijs("hjif", hijw(int ), (int)371)) break;
                    v5 /* !! */  = (long)kq.hijs("hjig", hijw(int ), (int)372);
                }
                v6 = kv.getDefault();
                v7 /* !! */  = kq.ok;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v7 /* !! */  = (long)(kq.hijs("hjii", hijp(int ), (int)262) - kq.hijs("hjih", hijp(int ), (int)261));
lbl54:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1598542430: {
                            continue block27;
                        }
                        case 722891128: {
                            break block27;
                        }
                    }
                    break;
                }
                kq.glowText(var0, v6, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                if (!var9_11 && !var9_11) ** break;
                ** continue;
                return;
            }
lbl63:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var10_10 /* !! */  = (int)kq.hijs("hjij", hijw(int ), (int)373);
                    if (!var11_9) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var10_10 /* !! */  = (int)kq.hijs("hjik", hijw(int ), (int)374);
                if (!var11_9) break;
                throw null;
            }
            case 2: {
                var10_10 /* !! */  = (int)kq.hijs("hjil", hijw(int ), (int)375);
                if (!var11_9) ** GOTO lbl63
                throw null;
            }
lbl76:
            // 2 sources

            case 3: {
                var10_10 /* !! */  = (int)kq.hijs("hjim", hijw(int ), (int)376);
                if (!var11_9) ** GOTO lbl63
                throw null;
            }
            case 4: {
                var10_10 /* !! */  = (int)kq.hijs("hjin", hijw(int ), (int)377);
                if (!var11_9) ** GOTO lbl76
                throw null;
            }
            case 5: 
        }
        var10_10 /* !! */  = (int)kq.hijs("hjio", hijw(int ), (int)378);
        ** while (!var11_9)
lbl87:
        // 1 sources

        throw null;
    }

    static {
        hijx = new int[793];
        hijy = new int[793];
        kq.hkci();
        kq.hkcj();
        kq.hkck();
        kq.hkcl();
        kq.hkcm();
        kq.hkcn();
        kq.hkco();
        kq.hkcp();
        kq.hkcq();
        kq.hkcr();
        kq.hkcs();
        kq.hkct();
        kq.hkcu();
        kq.hkcv();
        kq.hkcw();
        kq.hkcx();
        hijq = new long[362];
        hijr = new long[362];
        kq.hkcy();
        kq.hkcz();
        kq.hkda();
        kq.hkdb();
        kq.hkdc();
        kq.hkdd();
        kq.hkde();
        kq.hkdf();
        useFallback = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void text(Matrix4f var0, String var1_1, float var2_2, float var3_3, float var4_4, int var5_5) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hiud", hijp(int ), (int)95));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1523547307: {
                    v1 = kq.hijs("hiue", hijp(int ), (int)96);
                    continue block31;
                }
                case 14710823: {
                    v1 = kq.hijs("hiuf", hijp(int ), (int)97);
                    continue block31;
                }
                case 722891128: {
                    break block31;
                }
                case 1159678158: {
                    v1 = kq.hijs("hiug", hijp(int ), (int)98);
                    continue block31;
                }
            }
            break;
        }
        var8_6 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl22
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - kq.hijs("hiuh", hijp(int ), (int)99));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1810640428: {
                    v3 = kq.hijs("hiui", hijp(int ), (int)100);
                    continue block32;
                }
                case -221933315: {
                    v3 = kq.hijs("hiuj", hijp(int ), (int)101);
                    continue block32;
                }
                case 558363512: {
                    v3 = kq.hijs("hiuk", hijp(int ), (int)102);
                    continue block32;
                }
                case 722891128: {
                    break block32;
                }
            }
            break;
        }
        var7_7 /* !! */  = kq.b;
        v4 /* !! */  = kq.ok;
        if (true) ** GOTO lbl39
        block33: while (true) {
            v4 /* !! */  = (long)(v5 - kq.hijs("hiul", hijp(int ), (int)103));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -572921171: {
                    v5 = kq.hijs("hium", hijp(int ), (int)104);
                    continue block33;
                }
                case -10227710: {
                    v5 = kq.hijs("hiun", hijp(int ), (int)105);
                    continue block33;
                }
                case 722891128: {
                    break block33;
                }
                case 1076528156: {
                    v5 = kq.hijs("hiuo", hijp(int ), (int)106);
                    continue block33;
                }
            }
            break;
        }
        var6_8 = kq.a;
        if (var8_6) {
            throw null;
lbl54:
            // 3 sources

            return;
        }
        if (var6_8 || var6_8) ** GOTO lbl54
        v6 /* !! */  = kq.ok;
        if (true) ** GOTO lbl61
        block35: while (true) {
            v6 /* !! */  = (long)(v7 - kq.hijs("hiup", hijp(int ), (int)107));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -369171985: {
                    v7 = kq.hijs("hiuq", hijp(int ), (int)108);
                    continue block35;
                }
                case 722891128: {
                    break block35;
                }
                case 1892826749: {
                    v7 = kq.hijs("hiur", hijp(int ), (int)109);
                    continue block35;
                }
            }
            break;
        }
        v8 = kv.getDefault();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hius", hijp(int ), (int)110)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == kq.hijs("hiut", hijw(int ), (int)172)) break;
            v9 /* !! */  = (long)kq.hijs("hiuu", hijw(int ), (int)173);
        }
        kr.drawString(var0, v8, var1_1, var2_2, var3_3, var4_4, var5_5, 0.0f, 0.0f);
        if (var6_8) ** GOTO lbl54
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_8) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_7 /* !! */  = (int)kq.hijs("hiuv", hijw(int ), (int)174);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 1: {
                var7_7 /* !! */  = (int)kq.hijs("hiuw", hijw(int ), (int)175);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 2: {
                do {
                    var7_7 /* !! */  = (int)kq.hijs("hiux", hijw(int ), (int)176);
                } while (!var8_6);
                throw null;
            }
            case 3: {
                var7_7 /* !! */  = (int)kq.hijs("hiuy", hijw(int ), (int)177);
                if (!var8_6) break;
                throw null;
            }
lbl103:
            // 3 sources

            case 4: {
                do {
                    var7_7 /* !! */  = (int)kq.hijs("hiuz", hijw(int ), (int)178);
                } while (!var8_6);
                throw null;
            }
            case 5: 
        }
        do {
            var7_7 /* !! */  = (int)kq.hijs("hiva", hijw(int ), (int)179);
        } while (!var8_6);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float width(ks var0, String var1_1, float var2_2) {
        v0 /* !! */  = kq.ok;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - kq.hijs("hizb", hijp(int ), (int)149));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1417067171: {
                    v1 = kq.hijs("hizc", hijp(int ), (int)150);
                    continue block20;
                }
                case 722891128: {
                    break block20;
                }
                case 1159278907: {
                    v1 = kq.hijs("hizd", hijp(int ), (int)151);
                    continue block20;
                }
            }
            break;
        }
        var5_3 = kq.c;
        v2 /* !! */  = kq.ok;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(kq.hijs("hizf", hijp(int ), (int)153) - kq.hijs("hize", hijp(int ), (int)152));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -854983702: {
                    continue block21;
                }
                case 722891128: {
                    break block21;
                }
            }
            break;
        }
        var4_4 /* !! */  = kq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hizg", hijp(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kq.hijs("hizh", hijw(int ), (int)245)) break;
            v3 /* !! */  = (long)kq.hijs("hizi", hijw(int ), (int)246);
        }
        var3_5 = kq.a;
        if (!var5_3) ** GOTO lbl38
        throw null;
lbl-1000:
        // 3 sources

        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)kq.hijs("hizj", hixv(int ), (int)247);
                }
lbl38:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl-1000
                if (var0 != null) continue block23;
                if (var3_5 || var3_5) ** GOTO lbl-1000
                return 0.0f;
                if (var3_5 || var3_5) continue block23;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hizk", hijp(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kq.hijs("hizl", hijw(int ), (int)248)) break;
                    v4 /* !! */  = (long)kq.hijs("hizm", hijw(int ), (int)249);
                }
                return var0.getStringWidth(var1_1, var2_2);
                case 0: {
                    var4_4 /* !! */  = (int)kq.hijs("hizn", hijw(int ), (int)250);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl81
                }
lbl55:
                // 2 sources

                case 1: {
                    var4_4 /* !! */  = (int)kq.hijs("hizo", hijw(int ), (int)251);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl73
                }
lbl60:
                // 2 sources

                case 2: {
                    var4_4 /* !! */  = (int)kq.hijs("hizp", hijw(int ), (int)252);
                    if (!var5_3) ** GOTO lbl55
                    throw null;
                }
                case 3: {
                    var4_4 /* !! */  = (int)kq.hijs("hizq", hijw(int ), (int)253);
                    if (!var5_3) ** GOTO lbl60
                    throw null;
                }
lbl68:
                // 3 sources

                case 4: {
                    var4_4 /* !! */  = (int)kq.hijs("hizr", hijw(int ), (int)254);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl81
                }
lbl73:
                // 2 sources

                case 5: {
                    var4_4 /* !! */  = (int)kq.hijs("hizs", hijw(int ), (int)255);
                    if (var5_3) {
                        throw null;
                    }
                }
                case 6: {
                    var4_4 /* !! */  = (int)kq.hijs("hizt", hijw(int ), (int)256);
                    if (!var5_3) ** GOTO lbl68
                    throw null;
                }
lbl81:
                // 3 sources

                case 7: {
                    var4_4 /* !! */  = (int)kq.hijs("hizu", hijw(int ), (int)257);
                    if (!var5_3) ** GOTO lbl68
                    throw null;
                }
                case 8: 
            }
        }
        do {
            var4_4 /* !! */  = (int)kq.hijs("hizv", hijw(int ), (int)258);
        } while (!var5_3);
        throw null;
    }

    private static void hkcz() {
        kq.hijq[100] = -3617647639110847597L;
        kq.hijq[101] = -58310013435857618L;
        kq.hijq[102] = -104853972503833104L;
        kq.hijq[103] = 7767526999719601489L;
        kq.hijq[104] = 6549094162275618285L;
        kq.hijq[105] = 1494652879199159057L;
        kq.hijq[106] = -4399284304832127178L;
        kq.hijq[107] = -6692444716312098904L;
        kq.hijq[108] = -6505443924985427577L;
        kq.hijq[109] = -534976237410825471L;
        kq.hijq[110] = -3175724835126850543L;
        kq.hijq[111] = -6002065229527973814L;
        kq.hijq[112] = -6780222608490722335L;
        kq.hijq[113] = -3948134481737786978L;
        kq.hijq[114] = -1864873496467266338L;
        kq.hijq[115] = 7433795463736602576L;
        kq.hijq[116] = -865947701912711893L;
        kq.hijq[117] = -8984671856454221429L;
        kq.hijq[118] = -4424877294422062454L;
        kq.hijq[119] = 8995036418587597537L;
        kq.hijq[120] = 2589511168440844844L;
        kq.hijq[121] = 7774277627474325584L;
        kq.hijq[122] = 2108530435462118840L;
        kq.hijq[123] = -6848915502926628365L;
        kq.hijq[124] = 62565801464284633L;
        kq.hijq[125] = -5028215615572603786L;
        kq.hijq[126] = -7851108669117211356L;
        kq.hijq[127] = 6909570635705558664L;
        kq.hijq[128] = 3360954372014445234L;
        kq.hijq[129] = -3509576710371062275L;
        kq.hijq[130] = 8688387917982932571L;
        kq.hijq[131] = 257635475331101575L;
        kq.hijq[132] = -9037913455160124500L;
        kq.hijq[133] = 7520748107328430869L;
        kq.hijq[134] = 2155043091347221971L;
        kq.hijq[135] = -9130499329182149870L;
        kq.hijq[136] = -890917646443636859L;
        kq.hijq[137] = 8230833476252915136L;
        kq.hijq[138] = 8565930609284310127L;
        kq.hijq[139] = 5045549380175044650L;
        kq.hijq[140] = -1856243847273991730L;
        kq.hijq[141] = -7438600129341517967L;
        kq.hijq[142] = 5956987598549711399L;
        kq.hijq[143] = -2779033119713296408L;
        kq.hijq[144] = -1132187770671392487L;
        kq.hijq[145] = -8121782453580364061L;
        kq.hijq[146] = -8638374743340235952L;
        kq.hijq[147] = -3742840355842395054L;
        kq.hijq[148] = 1450931769368427081L;
        kq.hijq[149] = -7691798862275766696L;
        kq.hijq[150] = 2821789634066171591L;
        kq.hijq[151] = -6172448854673115437L;
        kq.hijq[152] = -528771533377149391L;
        kq.hijq[153] = -5860971891784311972L;
        kq.hijq[154] = 29539459927473059L;
        kq.hijq[155] = -2202571485166528112L;
        kq.hijq[156] = -1596779418770323024L;
        kq.hijq[157] = -7452974355151769717L;
        kq.hijq[158] = 875099816424711657L;
        kq.hijq[159] = 7547207452594605040L;
        kq.hijq[160] = 5970621608399497068L;
        kq.hijq[161] = -4119390423997008499L;
        kq.hijq[162] = -7514239107320683082L;
        kq.hijq[163] = 7143404524519938949L;
        kq.hijq[164] = 3498834535172546362L;
        kq.hijq[165] = 5301059786291792343L;
        kq.hijq[166] = 6918752210648471963L;
        kq.hijq[167] = -1105920168088653137L;
        kq.hijq[168] = -8377520715364868663L;
        kq.hijq[169] = -7490506256507001828L;
        kq.hijq[170] = -5649000982852643037L;
        kq.hijq[171] = 8811774770847650636L;
        kq.hijq[172] = -4817054637345527932L;
        kq.hijq[173] = -2929184458695637151L;
        kq.hijq[174] = -1066214786081930318L;
        kq.hijq[175] = -8444633916763066074L;
        kq.hijq[176] = 1547949305388120303L;
        kq.hijq[177] = 8949303204167288368L;
        kq.hijq[178] = 2912004551922179456L;
        kq.hijq[179] = 1200056901634508230L;
        kq.hijq[180] = -9205574754104798651L;
        kq.hijq[181] = -5347092661627549267L;
        kq.hijq[182] = -7629468720070099839L;
        kq.hijq[183] = -5028457439820309334L;
        kq.hijq[184] = -2480386656930467146L;
        kq.hijq[185] = -3267076401669262278L;
        kq.hijq[186] = 1249238270870420548L;
        kq.hijq[187] = -1466546668715318439L;
        kq.hijq[188] = 4787129266090501173L;
        kq.hijq[189] = -2507496371785785470L;
        kq.hijq[190] = -3022844191770365615L;
        kq.hijq[191] = 4985439297629152153L;
        kq.hijq[192] = -1460342189676477801L;
        kq.hijq[193] = -1324401303311075728L;
        kq.hijq[194] = -3019346134795701753L;
        kq.hijq[195] = 3214824852824991653L;
        kq.hijq[196] = -5850456633245112525L;
        kq.hijq[197] = -5815117980006280479L;
        kq.hijq[198] = -7135672095927405844L;
        kq.hijq[199] = 2683962050938734134L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void glowText(class_332 var0, String var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int var7_7, float var8_8, boolean var9_9) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kq.ok - kq.hijs("hjju", hijp(int ), (int)263)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kq.hijs("hjjv", hijw(int ), (int)410)) break;
            v0 /* !! */  = (long)kq.hijs("hjjw", hijw(int ), (int)411);
        }
        var13_10 = kq.c;
        v1 /* !! */  = kq.ok;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(kq.hijs("hjjy", hijp(int ), (int)265) - kq.hijs("hjjx", hijp(int ), (int)264));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 722891128: {
                    break block15;
                }
                case 894174139: {
                    continue block15;
                }
            }
            break;
        }
        var12_11 /* !! */  = kq.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kq.ok - kq.hijs("hjjz", hijp(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kq.hijs("hjka", hijw(int ), (int)412)) break;
            v2 /* !! */  = (long)kq.hijs("hjkb", hijw(int ), (int)413);
        }
        var11_12 = kq.a;
        if (var13_10) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var11_12 || var11_12) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = kq.ok - kq.hijs("hjkc", hijp(int ), (int)267)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kq.hijs("hjkd", hijw(int ), (int)414)) break;
            v3 /* !! */  = (long)kq.hijs("hjke", hijw(int ), (int)415);
        }
        var10_13 = kv.get(var1_1);
        if (var11_12 || var11_12) ** GOTO lbl25
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = kq.ok - kq.hijs("hjkf", hijp(int ), (int)268)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kq.hijs("hjkg", hijw(int ), (int)416)) break;
            v4 /* !! */  = (long)kq.hijs("hjkh", hijw(int ), (int)417);
        }
        kq.glowText(var0, var10_13, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8, var9_9);
        if (var11_12) ** GOTO lbl25
        if (var12_11 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_11 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var11_12) ** break;
                ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var12_11 /* !! */  = (int)kq.hijs("hjki", hijw(int ), (int)418);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_11 /* !! */  = (int)kq.hijs("hjkj", hijw(int ), (int)419);
                    if (!var13_10) ** GOTO lbl48
                    throw null;
                }
            }
            case 2: {
                var12_11 /* !! */  = (int)kq.hijs("hjkk", hijw(int ), (int)420);
                if (var13_10) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl63:
            // 2 sources

            case 3: {
                var12_11 /* !! */  = (int)kq.hijs("hjkl", hijw(int ), (int)421);
                if (!var13_10) break;
                throw null;
            }
lbl67:
            // 2 sources

            case 4: {
                var12_11 /* !! */  = (int)kq.hijs("hjkm", hijw(int ), (int)422);
                if (!var13_10) break;
                throw null;
            }
            case 5: {
                do {
                    var12_11 /* !! */  = (int)kq.hijs("hjkn", hijw(int ), (int)423);
                } while (!var13_10);
                throw null;
            }
lbl76:
            // 2 sources

            case 6: {
                var12_11 /* !! */  = (int)kq.hijs("hjko", hijw(int ), (int)424);
                if (!var13_10) ** GOTO lbl63
                throw null;
            }
            case 7: 
        }
        var12_11 /* !! */  = (int)kq.hijs("hjkp", hijw(int ), (int)425);
        ** while (!var13_10)
lbl83:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void textGradient(class_332 var0, ks var1_1, String var2_2, float var3_3, float var4_4, float var5_5, int var6_6, int var7_7, boolean var8_8) {
        block76: {
            block75: {
                block74: {
                    var14_9 = kq.c;
                    var13_10 /* !! */  = kq.b;
                    var12_11 = kq.a;
                    if (var14_9) {
                        throw null;
lbl6:
                        // 19 sources

                        return;
                    }
                    if (var12_11 || var12_11) ** GOTO lbl6
                    if (!var8_8) break block74;
                    if (var12_11 || var12_11) ** GOTO lbl6
                    ki.addOverrideTask((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$textGradient$3(net.minecraft.class_332 ruhack.phobia.ks java.lang.String float float float int int ), ()V)((class_332)var0, (ks)var1_1, (String)var2_2, (float)var3_3, (float)var4_4, (float)var5_5, (int)var6_6, (int)var7_7));
                    if (var12_11 || var12_11) ** GOTO lbl6
                    return;
                }
                if (var12_11 || var12_11) ** GOTO lbl6
                if (var1_1 == null) break block75;
                if (var12_11) ** GOTO lbl6
                if (!var2_2.isEmpty()) break block76;
                if (var12_11) ** GOTO lbl6
            }
            if (var12_11 || var12_11) ** GOTO lbl6
            return;
        }
        if (var12_11 || var12_11) ** GOTO lbl6
        var9_12 = new int[var2_2.length()];
        if (var12_11 || var12_11) ** GOTO lbl6
        var10_13 = kq.hijs("hjnu", hijw(int ), (int)488);
        if (var13_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_11) ** GOTO lbl6
                do {
                    if (var12_11 || var12_11) ** GOTO lbl6
                    if (var10_13 >= var2_2.length()) ** GOTO lbl51
                    if (var12_11 || var12_11) ** GOTO lbl6
                    if (var2_2.length() <= kq.hijs("hjnv", hijw(int ), (int)489)) ** GOTO lbl42
                    if (var12_11) ** GOTO lbl6
                    v0 = (float)var10_13 / (float)(var2_2.length() - kq.hijs("hjnw", hijw(int ), (int)490));
                    if (var14_9) {
                        throw null;
                    }
                    ** GOTO lbl44
lbl42:
                    // 1 sources

                    if (var12_11 || var12_11) ** GOTO lbl6
                    v0 = var11_14 = 0.0f;
lbl44:
                    // 2 sources

                    if (var12_11 || var12_11) ** GOTO lbl6
                    var9_12[var10_13] = kq.lerpColor(var6_6, var7_7, var11_14);
                    if (var12_11 || var12_11) ** GOTO lbl6
                    ++var10_13;
                    if (var12_11) ** GOTO lbl6
                } while (!var14_9);
                throw null;
lbl51:
                // 1 sources

                if (var12_11 || var12_11) ** GOTO lbl6
                kr.drawStringColored(ki.createProjection(), var1_1, var2_2, var3_3, var4_4, var5_5, var9_12, (float)kq.hijs("hjnx", hixv(int ), (int)491));
                if (!var12_11 && !var12_11) ** break;
                ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                var13_10 /* !! */  = (int)kq.hijs("hjny", hijw(int ), (int)492);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_10 /* !! */  = (int)kq.hijs("hjnz", hijw(int ), (int)493);
                    if (var14_9) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
lbl67:
            // 2 sources

            case 2: {
                var13_10 /* !! */  = (int)kq.hijs("hjoa", hijw(int ), (int)494);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 3: {
                var13_10 /* !! */  = (int)kq.hijs("hjob", hijw(int ), (int)495);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 4: {
                var13_10 /* !! */  = (int)kq.hijs("hjoc", hijw(int ), (int)496);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 5: {
                var13_10 /* !! */  = (int)kq.hijs("hjod", hijw(int ), (int)497);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl87:
            // 2 sources

            case 6: {
                var13_10 /* !! */  = (int)kq.hijs("hjoe", hijw(int ), (int)498);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 7: {
                var13_10 /* !! */  = (int)kq.hijs("hjof", hijw(int ), (int)499);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl97:
            // 2 sources

            case 8: {
                var13_10 /* !! */  = (int)kq.hijs("hjog", hijw(int ), (int)500);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl102:
            // 4 sources

            case 9: {
                var13_10 /* !! */  = (int)kq.hijs("hjoh", hijw(int ), (int)501);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 10: {
                var13_10 /* !! */  = (int)kq.hijs("hjoi", hijw(int ), (int)502);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl112:
            // 4 sources

            case 11: {
                var13_10 /* !! */  = (int)kq.hijs("hjoj", hijw(int ), (int)503);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl117:
            // 2 sources

            case 12: {
                var13_10 /* !! */  = (int)kq.hijs("hjok", hijw(int ), (int)504);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 13: {
                var13_10 /* !! */  = (int)kq.hijs("hjol", hijw(int ), (int)505);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 14: {
                var13_10 /* !! */  = (int)kq.hijs("hjom", hijw(int ), (int)506);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 15: {
                var13_10 /* !! */  = (int)kq.hijs("hjon", hijw(int ), (int)507);
                if (!var14_9) break;
                throw null;
            }
            case 16: {
                var13_10 /* !! */  = (int)kq.hijs("hjoo", hijw(int ), (int)508);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl141:
            // 3 sources

            case 17: {
                var13_10 /* !! */  = (int)kq.hijs("hjop", hijw(int ), (int)509);
                if (!var14_9) ** GOTO lbl112
                throw null;
            }
lbl145:
            // 5 sources

            case 18: {
                var13_10 /* !! */  = (int)kq.hijs("hjoq", hijw(int ), (int)510);
                if (!var14_9) break;
                throw null;
            }
            case 19: {
                var13_10 /* !! */  = (int)kq.hijs("hjor", hijw(int ), (int)511);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl154:
            // 2 sources

            case 20: {
                var13_10 /* !! */  = (int)kq.hijs("hjos", hijw(int ), (int)512);
                if (!var14_9) ** GOTO lbl145
                throw null;
            }
lbl158:
            // 4 sources

            case 21: {
                var13_10 /* !! */  = (int)kq.hijs("hjot", hijw(int ), (int)513);
                if (!var14_9) ** GOTO lbl56
                throw null;
            }
lbl162:
            // 2 sources

            case 22: {
                var13_10 /* !! */  = (int)kq.hijs("hjou", hijw(int ), (int)514);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl167:
            // 2 sources

            case 23: {
                var13_10 /* !! */  = (int)kq.hijs("hjov", hijw(int ), (int)515);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 24: {
                var13_10 /* !! */  = (int)kq.hijs("hjow", hijw(int ), (int)516);
                if (var14_9) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 25: {
                var13_10 /* !! */  = (int)kq.hijs("hjox", hijw(int ), (int)517);
                if (!var14_9) ** GOTO lbl102
                throw null;
            }
            case 26: {
                var13_10 /* !! */  = (int)kq.hijs("hjoy", hijw(int ), (int)518);
                if (!var14_9) ** GOTO lbl112
                throw null;
            }
lbl185:
            // 4 sources

            case 27: {
                var13_10 /* !! */  = (int)kq.hijs("hjoz", hijw(int ), (int)519);
                if (!var14_9) ** GOTO lbl67
                throw null;
            }
            case 28: {
                var13_10 /* !! */  = (int)kq.hijs("hjpa", hijw(int ), (int)520);
                if (!var14_9) ** GOTO lbl141
                throw null;
            }
            case 29: {
                var13_10 /* !! */  = (int)kq.hijs("hjpb", hijw(int ), (int)521);
                if (!var14_9) ** GOTO lbl102
                throw null;
            }
lbl197:
            // 3 sources

            case 30: {
                var13_10 /* !! */  = (int)kq.hijs("hjpc", hijw(int ), (int)522);
                if (!var14_9) ** GOTO lbl117
                throw null;
            }
            case 31: {
                var13_10 /* !! */  = (int)kq.hijs("hjpd", hijw(int ), (int)523);
                if (!var14_9) break;
                throw null;
            }
            case 32: {
                var13_10 /* !! */  = (int)kq.hijs("hjpe", hijw(int ), (int)524);
                if (!var14_9) ** GOTO lbl141
                throw null;
            }
            case 33: {
                var13_10 /* !! */  = (int)kq.hijs("hjpf", hijw(int ), (int)525);
                if (var14_9) {
                    throw null;
                }
            }
lbl213:
            // 4 sources

            case 34: {
                var13_10 /* !! */  = (int)kq.hijs("hjpg", hijw(int ), (int)526);
                if (var14_9) {
                    throw null;
                }
            }
lbl217:
            // 5 sources

            case 35: {
                var13_10 /* !! */  = (int)kq.hijs("hjph", hijw(int ), (int)527);
                if (!var14_9) ** GOTO lbl158
                throw null;
            }
            case 36: 
        }
        var13_10 /* !! */  = (int)kq.hijs("hjpi", hijw(int ), (int)528);
        ** while (!var14_9)
lbl224:
        // 1 sources

        throw null;
    }
}

